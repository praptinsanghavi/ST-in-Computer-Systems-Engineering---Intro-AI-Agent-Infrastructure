---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:48:18Z'
section: guide
site: akka-io
source_url: https://doc.akka.io/libraries/guide/how-to/cassandra-alternative.html
title: 'Use Cassandra instead of PostgreSQL :: Akka Guide'
---

# Use Cassandra instead of PostgreSQL :: Akka Guide

## Content

# Use Cassandra instead of PostgreSQL

Language

This guide describes how to use Cassandra instead of a Relational Database. It assumes that you created the project using the [Implementing Microservices with Akka tutorial](../microservices-tutorial/index.html), and it describes the changes relative to the R2DBC setup that is used in the tutorial.

## Source downloads

If you prefer to view the full example with Cassandra you can download a zip file containing the completed code:

Java

- [Source](_attachments/6-shopping-cart-complete-java.zip) with the steps from the tutorial completed, to serve as the basis for this how\-to.
- [Source](_attachments/shopping-cart-cassandra-java.zip) that includes the full `shopping-cart-service` example from the tutorial with the steps on this page completed.

Scala

- [Source](_attachments/6-shopping-cart-complete-scala.zip) with the steps from the tutorial completed, to serve as the basis for this how\-to.
- [Source](_attachments/shopping-cart-cassandra-scala.zip) that includes the full `shopping-cart-service` example from the tutorial with the steps on this page completed.

## Use Cassandra for the write side

To use Cassandra for the [Event Sourced Cart entity](../microservices-tutorial/entity.html) the following changes are needed.

### Dependencies

Replace `akka-persistence-r2dbc` with `akka-persistence-cassandra`:

Java

pom.xml:

```
<properties>
</properties>
<dependencies>
    <dependency>
        <groupId>com.typesafe.akka</groupId>
        <artifactId>akka-persistence-cassandra_${scala.binary.version}</artifactId>
    </dependency>
</dependencies>
```

Scala

build.sbt:

```
val AkkaPersistenceCassandraVersion = "1.3.3"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-persistence-cassandra" % AkkaPersistenceCassandraVersion,
)
```

### Configuration

Change the configuration in `src/main/resources/persistence.conf` to the following to enable `akka-persistence-cassandra`:

src/main/resources/persistence.conf

```
akka {
  # use Cassandra to store both snapshots and the events of the persistent actors
  persistence {
    journal.plugin = "akka.persistence.cassandra.journal"
    journal.auto-start-journals = ["akka.persistence.cassandra.journal"]
    snapshot-store.plugin = "akka.persistence.cassandra.snapshot"

    cassandra {
      events-by-tag {
        bucket-size = "Day"
        eventual-consistency-delay = 2s
        flush-interval = 50ms
        pubsub-notification = on
        first-time-bucket = "20200815T00:00"
      }

      query {
        refresh-interval = 2s
      }

      journal.keyspace = "shoppingcartservice"
      snapshot.keyspace = "shoppingcartservice"
    }
  }

}

datastax-java-driver {
  advanced.reconnect-on-init = on
}
```

To make the Projections faster in development environment and tests you can add the following to

src/main/resources/local\-shared.conf

```
# for reduced Projection latency
akka.persistence.cassandra.events-by-tag.eventual-consistency-delay = 200 ms
```

## Use Cassandra for the read side

To use Cassandra for the Projections the following changes are needed.

### Dependencies

Replace `akka-projection-r2dbc` with `akka-projection-cassandra`:

Java

pom.xml:

```
<dependency>
    <groupId>com.lightbend.akka</groupId>
    <artifactId>akka-projection-cassandra_${scala.binary.version}</artifactId>
</dependency>
```

Scala

build.sbt:

```
"com.lightbend.akka" %% "akka-projection-cassandra" % AkkaProjectionVersion,
```

### Configuration

Change the configuration in `src/main/resources/persistence.conf` and add following for `akka-projection-cassandra`:

src/main/resources/persistence.conf

```
akka.projection {
  cassandra.offset-store.keyspace = "shoppingcartservice"
  # use same Cassandra session config as for the journal
  cassandra.session-config-path = "akka.persistence.cassandra"
}
```

### Projection for queries

Now we will change the Projection corresponding to the [Projection for queries in the tutorial](../microservices-tutorial/projection-query.html).

Several things are rather different from R2DBC variant, so we start with removing those files, and we will add the corresponding for Cassandra. Remove:

Java

- src/main/java/shopping/cart/repository/ItemPopularityRepository.java
- src/main/java/shopping/cart/repository/ItemPopularityRepositoryImpl.java
- src/main/java/shopping/cart/ItemPopularity.java
- src/main/java/shopping/cart/ItemPopularityProjection.java
- src/main/java/shopping/cart/ItemPopularityProjectionHandler.java
- remove the `ItemPopularityRepository` and `ItemPopularityProjection.init` in `Main.java`.

Scala

- src/main/scala/shopping/cart/repository/ItemPopularityRepository.scala
- src/main/scala/shopping/cart/ItemPopularity.java
- src/main/scala/shopping/cart/ItemPopularityProjection.scala
- src/main/scala/shopping/cart/ItemPopularityProjectionHandler.scala
- remove the `ItemPopularityRepository` and `ItemPopularityProjection.init` in `Main.scala`.

#### Create tags

To connect the events from the entities with the Projection we need to tag the events. We should use several tags, each with a slice number, to distribute the events over several Projection instances. The tag is selected based on the modulo of the entity id’s hash code (stable identifier) and the total number of tags. Each entity instance will tag its events using one of those tags, and the entity instance will always use the same tag.

Create tags as follows:

1. Edit `ShoppingCart.scala` `ShoppingCart.java` to include the following:

Java

src/main/java/shopping/cart/ShoppingCart.java

```
static final List<String> TAGS = List.of("carts-0", "carts-1", "carts-2", "carts-3", "carts-4");

public static void init(ActorSystem<?> system) {
  ClusterSharding.get(system)
      .init(
          Entity.of(
              ENTITY_KEY,
              entityContext -> {
                int i = Math.abs(entityContext.getEntityId().hashCode() % TAGS.size());
                String selectedTag = TAGS.get(i);
                return ShoppingCart.create(entityContext.getEntityId(), selectedTag);
              }));
}
```

Scala

src/main/scala/shopping/cart/ShoppingCart.scala

```
import akka.cluster.sharding.typed.scaladsl.EntityContext

  val tags = Vector.tabulate(5)(i => s"carts-$i")

  def init(system: ActorSystem[_]): Unit = {
    val behaviorFactory: EntityContext[Command] => Behavior[Command] = {
      entityContext =>
        val i = math.abs(entityContext.entityId.hashCode % tags.size)
        val selectedTag = tags(i)
        ShoppingCart(entityContext.entityId, selectedTag)
    }
    ClusterSharding(system).init(Entity(EntityKey)(behaviorFactory))
  }
```

One of the tags is selected based on the `cartId`, which is the `entityContext.entityId`. The tag is assigned to the `EventSourcedBehavior`.
2. In the `ShoppingCart.apply` method, add the `projectionTag` parameter and pass it to `.withTagger`: In the `ShoppingCart` constructor, add the `projectionTag` parameter and use it to override the `tagsFor` method:

Java

src/main/java/shopping/cart/ShoppingCart.java

```
public static Behavior<Command> create(String cartId, String projectionTag) {
  return Behaviors.setup(
      ctx -> EventSourcedBehavior.start(new ShoppingCart(cartId, projectionTag), ctx));
}

private final String projectionTag;

private final String cartId;

private ShoppingCart(String cartId, String projectionTag) {
  super(
      PersistenceId.of(ENTITY_KEY.name(), cartId),
      SupervisorStrategy.restartWithBackoff(Duration.ofMillis(200), Duration.ofSeconds(5), 0.1));
  this.cartId = cartId;
  this.projectionTag = projectionTag;
}

@Override
public Set<String> tagsFor(Event event) { (1)
  return Collections.singleton(projectionTag);
}
```

| **1** | Use `tagsFor` to assign the `projectionTag`. |
| --- | --- |

Scala

src/main/scala/shopping/cart/ShoppingCart.scala

```
def apply(cartId: String, projectionTag: String): Behavior[Command] = {
  EventSourcedBehavior
    .withEnforcedReplies[Command, Event, State](
      persistenceId = PersistenceId(EntityKey.name, cartId),
      emptyState = State.empty,
      commandHandler =
        (state, command) => handleCommand(cartId, state, command),
      eventHandler = (state, event) => handleEvent(state, event))
    .withTagger(_ => Set(projectionTag)) (1)
    .withRetention(RetentionCriteria.snapshotEvery(numberOfEvents = 100))
    .onPersistFailure(
      SupervisorStrategy.restartWithBackoff(200.millis, 5.seconds, 0.1))
}
```

| **1** | Use `withTagger` to assign the `projectionTag`. |
| --- | --- |

|  | In this example, we use five different tags. Tagging is not easy to change later without system downtime. Before going live in production you should consider how many tags to use, see [Akka Projections reference documentation new tab](https://doc.akka.io/libraries/akka-projection/current/running.html) for more information. |
| --- | --- |

#### Create the Projection

Follow these steps to process events in a Projection that stores the offset in Cassandra and updates an `item_popularity` table in Cassandra.

1. Add a class `ItemPopularityProjectionHandler`:

Java

src/main/java/shopping/cart/ItemPopularityProjectionHandler.java:

```
package shopping.cart;

import akka.Done;
import akka.projection.eventsourced.EventEnvelope;
import akka.projection.javadsl.Handler;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class ItemPopularityProjectionHandler
    extends Handler<EventEnvelope<ShoppingCart.Event>> { (1)
  private final Logger logger = LoggerFactory.getLogger(getClass());
  private final String tag;
  private final ItemPopularityRepository repo;

  public ItemPopularityProjectionHandler(String tag, ItemPopularityRepository repo) {
    this.tag = tag;
    this.repo = repo;
  }

  @Override
  public CompletionStage<Done> process(EventEnvelope<ShoppingCart.Event> envelope) { (2)
    ShoppingCart.Event event = envelope.event();

    switch (event) {
      case ShoppingCart.ItemAdded(var __, String itemId, int qtd) -> { (3)
        CompletionStage<Done> result = this.repo.update(itemId, qtd);
        result.thenAccept(done -> logItemCount(itemId));
        return result;
      case ShoppingCart.CheckedOut ignored -> {
        return CompletableFuture.completedFuture(Done.getInstance());
      }
      case null -> throw new IllegalArgumentException("Unknown event type: " + event.getClass());
    }
  }

  private void logItemCount(String itemId) {
    repo.getItem(itemId)
        .thenAccept(
            optCount ->
                logger.info(
                    "ItemPopularityProjectionHandler({}) item popularity for '{}': [{}]",
                    this.tag,
                    itemId,
                    optCount.orElse(0L)));
  }
}
```

| **1** | extends `akka.projection.javadsl.Handler` |
| --- | --- |
| **2** | the `process` method to implement |
| **3** | match events and increment or decrement the count via the `ItemPopularityRepository`, which encapsulates the database access |

Scala

src/main/scala/shopping/cart/ItemPopularityProjectionHandler.scala:

```
package shopping.cart

import scala.concurrent.ExecutionContext
import scala.concurrent.Future

import akka.Done
import akka.actor.typed.ActorSystem
import akka.projection.eventsourced.EventEnvelope
import akka.projection.scaladsl.Handler
import org.slf4j.LoggerFactory

class ItemPopularityProjectionHandler(
    tag: String,
    system: ActorSystem[_],
    repo: ItemPopularityRepository)
    extends Handler[EventEnvelope[ShoppingCart.Event]]() { (1)

  private val log = LoggerFactory.getLogger(getClass)
  private implicit val ec: ExecutionContext =
    system.executionContext

  override def process(
      envelope: EventEnvelope[ShoppingCart.Event]): Future[Done] = { (2)
    envelope.event match { (3)
      case ShoppingCart.ItemAdded(_, itemId, quantity) =>
        val result = repo.update(itemId, quantity)
        result.foreach(_ => logItemCount(itemId))
        result

      case _: ShoppingCart.CheckedOut =>
        Future.successful(Done)
    }
  }

  private def logItemCount(itemId: String): Unit = {
    repo.getItem(itemId).foreach { optCount =>
      log.info(
        "ItemPopularityProjectionHandler({}) item popularity for '{}': [{}]",
        tag,
        itemId,
        optCount.getOrElse(0))
    }
  }

}
```

| **1** | extends `akka.projection.scaladsl.Handler` |
| --- | --- |
| **2** | the `process` method to implement |
| **3** | match events and increment or decrement the count via the `ItemPopularityRepository` |
2. Add the `ItemPopularityRepository`:

Java

src/main/java/shopping/cart/ItemPopularityRepository.java:

```
package shopping.cart;

import akka.Done;
import java.util.Optional;
import java.util.concurrent.CompletionStage;

public interface ItemPopularityRepository {
  CompletionStage<Done> update(String itemId, int delta);

  CompletionStage<Optional<Long>> getItem(String itemId);
}
```

Scala

src/main/scala/shopping/cart/ItemPopularityRepository.scala:

```
package shopping.cart

import scala.concurrent.Future
import akka.Done

trait ItemPopularityRepository {
  def update(itemId: String, delta: Int): Future[Done]
  def getItem(itemId: String): Future[Option[Long]]
}
```
3. Add the implementation for Cassandra:

Java

src/main/java/shopping/cart/ItemPopularityRepositoryImpl.java:

```
package shopping.cart;

import akka.Done;
import akka.stream.alpakka.cassandra.javadsl.CassandraSession;
import java.util.Optional;
import java.util.concurrent.CompletionStage;

public final class ItemPopularityRepositoryImpl implements ItemPopularityRepository {

  static final String POPULARITY_TABLE = "item_popularity";

  private final CassandraSession session;
  private final String table;

  public ItemPopularityRepositoryImpl(CassandraSession session, String keyspace) {
    this.session = session;
    this.table = keyspace + "." + POPULARITY_TABLE;
  }

  @Override
  public CompletionStage<Done> update(String itemId, int delta) {
    return session.executeWrite(
        "UPDATE " + table + " SET count = count + ? WHERE item_id = ?",
        Long.valueOf(delta),
        itemId);
  }

  @Override
  public CompletionStage<Optional<Long>> getItem(String itemId) {
    return session
        .selectOne("SELECT item_id, count FROM " + table + " WHERE item_id = ?", itemId)
        .thenApply(opt -> opt.map(row -> row.getLong("count")));
  }
}
```

The `CassandraSession` comes from the Cassandra connector in Alpakka and provides an asynchronous API for executing *CQL* statements to Cassandra. In the initialization code, introduced later, we will see how to get access to a `CassandraSession`. You can learn more about the `CassandraSession` in the [Alpakka reference documentation ![new tab](../_images/new-tab.svg)](https://doc.akka.io/libraries/alpakka/current/cassandra.html).

Scala

src/main/scala/shopping/cart/ItemPopularityRepository.scala:

```
package shopping.cart

import scala.concurrent.Future
import akka.Done
import scala.concurrent.ExecutionContext
import akka.stream.alpakka.cassandra.scaladsl.CassandraSession

object ItemPopularityRepositoryImpl {
  val popularityTable = "item_popularity"
}

class ItemPopularityRepositoryImpl(session: CassandraSession, keyspace: String)(
    implicit val ec: ExecutionContext)
    extends ItemPopularityRepository {
  import ItemPopularityRepositoryImpl.popularityTable

  override def update(itemId: String, delta: Int): Future[Done] = {
    session.executeWrite(
      s"UPDATE $keyspace.$popularityTable SET count = count + ? WHERE item_id = ?",
      java.lang.Long.valueOf(delta),
      itemId)
  }

  override def getItem(itemId: String): Future[Option[Long]] = {
    session
      .selectOne(
        s"SELECT item_id, count FROM $keyspace.$popularityTable WHERE item_id = ?",
        itemId)
      .map(opt => opt.map(row => row.getLong("count").longValue()))
  }
}
```

The `CassandraSession` comes from the Cassandra connector in Alpakka and provides an asynchronous API for executing *CQL* statements to Cassandra. In the initialization code, introduced later, we will see how to get access to a `CassandraSession`. You can learn more about the `CassandraSession` in the [Alpakka reference documentation ![new tab](../_images/new-tab.svg)](https://doc.akka.io/libraries/alpakka/current/cassandra.html).

|  | The example will persist the item popularity count with a [Cassandra counter new tab](https://cassandra.apache.org/doc/3.11/cassandra/cql/types.html#counters) data type. It’s not possible to guarantee that item count updates occur idempotently because we are using at\-least\-once semantics. However, since the count is only a rough metric to judge how popular an item is it’s not critical to have a totally accurate figure. |
| --- | --- |
4. Initialize the Projection

Place the initialization code of the Projection in an `ItemPopularityProjection` object class:

Java

src/main/java/shopping/cart/ItemPopularityProjection.java:

```
package shopping.cart;

import akka.actor.typed.ActorSystem;
import akka.cluster.sharding.typed.ShardedDaemonProcessSettings;
import akka.cluster.sharding.typed.javadsl.ShardedDaemonProcess;
import akka.persistence.cassandra.query.javadsl.CassandraReadJournal;
import akka.persistence.query.Offset;
import akka.projection.ProjectionBehavior;
import akka.projection.ProjectionId;
import akka.projection.cassandra.javadsl.CassandraProjection;
import akka.projection.eventsourced.EventEnvelope;
import akka.projection.eventsourced.javadsl.EventSourcedProvider;
import akka.projection.javadsl.AtLeastOnceProjection;
import akka.projection.javadsl.SourceProvider;
import java.util.Optional;

public final class ItemPopularityProjection {

  private ItemPopularityProjection() {}

  public static void init(ActorSystem<?> system, ItemPopularityRepository repository) {
    ShardedDaemonProcess.get(system)
        .init( (1)
            ProjectionBehavior.Command.class,
            "ItemPopularityProjection",
            ShoppingCart.TAGS.size(),
            index -> ProjectionBehavior.create(createProjectionFor(system, repository, index)),
            ShardedDaemonProcessSettings.create(system),
            Optional.of(ProjectionBehavior.stopMessage()));
  }

  private static AtLeastOnceProjection<Offset, EventEnvelope<ShoppingCart.Event>>
      createProjectionFor(ActorSystem<?> system, ItemPopularityRepository repository, int index) {
    String tag = ShoppingCart.TAGS.get(index); (2)

    SourceProvider<Offset, EventEnvelope<ShoppingCart.Event>> sourceProvider = (3)
        EventSourcedProvider.eventsByTag(
            system,
            CassandraReadJournal.Identifier(), (4)
            tag);

    return CassandraProjection.atLeastOnce( (5)
        ProjectionId.of("ItemPopularityProjection", tag),
        sourceProvider,
        () -> new ItemPopularityProjectionHandler(tag, repository)); (6)
  }
}
```

| **1** | `ShardedDaemonProcess` will manage the Projection instances. It ensures the Projection instances are always running and distributes them over the nodes in the Akka Cluster. |
| --- | --- |
| **2** | The `tag` is selected based on the Projection instance’s index, corresponding to **carts\-0** to **carts\-3** as explained in the tagging in the `ShoppingCart`. |
| **3** | The source of the Projection is `EventSourcedProvider.eventsByTag` with the selected tag. |
| **4** | Using the Cassandra event journal. |
| **5** | Using Cassandra for offset storage of the Projection. |
| **6** | Creating the Projection `Handler` that we wrote in the beginning of this part. |

Scala

src/main/scala/shopping/cart/ItemPopularityProjection.scala:

```
package shopping.cart

import akka.actor.typed.ActorSystem
import akka.cluster.sharding.typed.ShardedDaemonProcessSettings
import akka.cluster.sharding.typed.scaladsl.ShardedDaemonProcess
import akka.persistence.cassandra.query.scaladsl.CassandraReadJournal
import akka.persistence.query.Offset
import akka.projection.ProjectionBehavior
import akka.projection.ProjectionId
import akka.projection.cassandra.scaladsl.CassandraProjection
import akka.projection.eventsourced.EventEnvelope
import akka.projection.eventsourced.scaladsl.EventSourcedProvider
import akka.projection.scaladsl.AtLeastOnceProjection
import akka.projection.scaladsl.SourceProvider

object ItemPopularityProjection {
  def init(
      system: ActorSystem[_],
      repository: ItemPopularityRepository): Unit = {
    ShardedDaemonProcess(system).init( (1)
      name = "ItemPopularityProjection",
      ShoppingCart.tags.size,
      index =>
        ProjectionBehavior(createProjectionFor(system, repository, index)),
      ShardedDaemonProcessSettings(system),
      Some(ProjectionBehavior.Stop))
  }

  private def createProjectionFor(
      system: ActorSystem[_],
      repository: ItemPopularityRepository,
      index: Int)
      : AtLeastOnceProjection[Offset, EventEnvelope[ShoppingCart.Event]] = {
    val tag = ShoppingCart.tags(index) (2)

    val sourceProvider
        : SourceProvider[Offset, EventEnvelope[ShoppingCart.Event]] = (3)
      EventSourcedProvider.eventsByTag[ShoppingCart.Event](
        system = system,
        readJournalPluginId = CassandraReadJournal.Identifier, (4)
        tag = tag)

    CassandraProjection.atLeastOnce( (5)
      projectionId = ProjectionId("ItemPopularityProjection", tag),
      sourceProvider,
      handler = () =>
        new ItemPopularityProjectionHandler(tag, system, repository) (6)
    )
  }

}
```

| **1** | `ShardedDaemonProcess` will manage the Projection instances. It ensures the Projection instances are always running and distributes them over the nodes in the Akka Cluster. |
| --- | --- |
| **2** | The `tag` is selected based on the Projection instance’s index, corresponding to **carts\-0** to **carts\-3** as explained in the tagging in the `ShoppingCart`. |
| **3** | The source of the Projection is `EventSourcedProvider.eventsByTag` with the selected tag. |
| **4** | Using the Cassandra event journal. |
| **5** | Using Cassandra for offset storage of the Projection. |
| **6** | Creating the Projection `Handler` that we wrote in the beginning of this part. |
5. Call the `ItemPopularityProjection.init` from `Main`:

Java

```
CassandraSession session =
    CassandraSessionRegistry.get(system).sessionFor("akka.persistence.cassandra"); (1)
// use same keyspace for the item_popularity table as the offset store
Config config = system.settings().config();
String itemPopularityKeyspace =
    config.getString("akka.projection.cassandra.offset-store.keyspace");
ItemPopularityRepository itemPopularityRepository =
    new ItemPopularityRepositoryImpl(session, itemPopularityKeyspace); (2)

ItemPopularityProjection.init(system, itemPopularityRepository); (3)
```

| **1** | The `CassandraSession` is looked up from the `CassandraSessionRegistry` |
| --- | --- |
| **2** | Instantiate the repository for Cassandra |
| **3** | Call the initialization of the Projection |

Scala

```
import akka.stream.alpakka.cassandra.scaladsl.CassandraSessionRegistry

    val session = CassandraSessionRegistry(system).sessionFor(
      "akka.persistence.cassandra"
    ) (1)
    // use same keyspace for the item_popularity table as the offset store
    val itemPopularityKeyspace =
      system.settings.config
        .getString("akka.projection.cassandra.offset-store.keyspace")
    val itemPopularityRepository =
      new ItemPopularityRepositoryImpl(session, itemPopularityKeyspace)(
        system.executionContext
      ) (2)

    ItemPopularityProjection.init(system, itemPopularityRepository) (3)
```

| **1** | The `CassandraSession` is looked up from the `CassandraSessionRegistry` |
| --- | --- |
| **2** | Instantiate the repository for Cassandra |
| **3** | Call the initialization of the Projection |

|  | The `CassandraProjection` uses at\-least\-once processing semantics. The offset is stored after the event has been processed and if the projection is restarted from a previously stored offset some events may be processed more than once. For a [R2DBC Projection new tab](https://doc.akka.io/libraries/akka-projection/current/r2dbc.html) it’s possible to have exactly\-once semantics because the offset can be stored in the same atomic transaction as the database operation in the event handler. |
| --- | --- |
6. Query

To expose the item popularity to the outside of the service we have the `GetItemPopularity` operation in the gRPC `ShoppingCartService`.

Replace the `getItemPopularity` implementation in the `ShoppingCartServiceImpl`:

Java

```
@Override
public CompletionStage<GetItemPopularityResponse> getItemPopularity(GetItemPopularityRequest in) {
  return itemPopularityRepository
      .getItem(in.getItemId())
      .thenApply(
          maybePopularity -> {
            long popularity = maybePopularity.orElse(0L);
            return GetItemPopularityResponse.newBuilder().setPopularityCount(popularity).build();
          });
}
```

Scala

```
override def getItemPopularity(in: proto.GetItemPopularityRequest)
    : Future[proto.GetItemPopularityResponse] = {
  itemPopularityRepository.getItem(in.itemId).map {
    case Some(count) =>
      proto.GetItemPopularityResponse(in.itemId, count)
    case None =>
      proto.GetItemPopularityResponse(in.itemId, 0L)
  }
}
```

### Projection publishing to Kafka

On the tutorial, we use [Service\-to\-Service Eventing](../microservices-tutorial/projection-over-grpc.html) to publish events between 2 different services. Currently, this feature is not supported for Cassandra, so one option is to use Kafka instead.

Such a solution would be very similar to what is explained on the [Use Kafka for the Projection](projection-kafka.html), but using a Cassandra projection similar to the one used in the previous section instead of a R2DBC projection. Thus, we will not repeat the explanation here.

Also, remember to remove the existing `PublishEventsGrpc` and its corresponding initialization in `Main`.

### Projection calling gRPC service

For the Projection that calls the `shopping-order-service`, the changes are minimal.

1. On the Projection handler `SendOrderProjectionHandler` use:

	- use an `akka.projection.javadsl.Handler` `akka.projection.scaladsl.Handler` instead of the `R2dbcHandler`
	- use an `akka.projection.eventsourced.EventEnvelope` instead of the `akka.persistence.query.typed.EventEnvelope`
	- remove the `R2dbcSession` on the `process` method override
	- remove the `slice` argument

The result should be similar to:

Java

src/main/java/shopping/cart/SendOrderProjectionHandler.java:

```
package shopping.cart;

import static akka.Done.done;

import akka.Done;
import akka.actor.typed.ActorSystem;
import akka.cluster.sharding.typed.javadsl.ClusterSharding;
import akka.cluster.sharding.typed.javadsl.EntityRef;
import akka.projection.eventsourced.EventEnvelope;
import akka.projection.javadsl.Handler;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.stream.Collectors;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import shopping.order.proto.Item;
import shopping.order.proto.OrderRequest;
import shopping.order.proto.ShoppingOrderService;

public final class SendOrderProjectionHandler extends Handler<EventEnvelope<ShoppingCart.Event>> {

  private final Logger log = LoggerFactory.getLogger(getClass());
  private final ClusterSharding sharding;
  private final Duration timeout;
  private final ShoppingOrderService orderService;

  public SendOrderProjectionHandler(
      ActorSystem<?> system, ShoppingOrderService orderService) { (1)
    sharding = ClusterSharding.get(system);
    timeout = system.settings().config().getDuration("shopping-cart-service.ask-timeout");
    this.orderService = orderService;
  }

  @Override
  public CompletionStage<Done> process(EventEnvelope<ShoppingCart.Event> envelope) {
    return envelope.event() instanceof ShoppingCart.CheckedOut checkedOut
        ? sendOrder(checkedOut)
        : CompletableFuture.completedFuture(done());
  }

  private CompletionStage<Done> sendOrder(ShoppingCart.CheckedOut checkout) {
    EntityRef<ShoppingCart.Command> entityRef =
        sharding.entityRefFor(ShoppingCart.ENTITY_KEY, checkout.cartId());
    CompletionStage<ShoppingCart.Summary> reply = entityRef.ask(ShoppingCart.Get::new, timeout);
    return reply.thenCompose(
        cart -> { (2)
          List<Item> protoItems =
              cart.items().entrySet().stream()
                  .map(
                      entry ->
                          Item.newBuilder()
                              .setItemId(entry.getKey())
                              .setQuantity(entry.getValue())
                              .build())
                  .collect(Collectors.toList());
          log.info(
              "Sending order of {} items for cart {}.", cart.items().size(), checkout.cartId());
          OrderRequest orderRequest =
              OrderRequest.newBuilder()
                  .setCartId(checkout.cartId())
                  .addAllItems(protoItems)
                  .build();
          return orderService.order(orderRequest).thenApply(response -> done()); (3)
        });
  }
}
```

Scala

src/main/scala/shopping/cart/SendOrderProjectionHandler.scala:

```
package shopping.cart

import scala.concurrent.ExecutionContext
import scala.concurrent.Future

import akka.Done
import akka.actor.typed.ActorSystem
import akka.cluster.sharding.typed.scaladsl.ClusterSharding
import akka.projection.eventsourced.EventEnvelope
import akka.projection.scaladsl.Handler
import akka.util.Timeout
import org.slf4j.LoggerFactory
import shopping.order.proto.Item
import shopping.order.proto.OrderRequest
import shopping.order.proto.ShoppingOrderService

class SendOrderProjectionHandler(
    system: ActorSystem[_],
    orderService: ShoppingOrderService) (1)
    extends Handler[EventEnvelope[ShoppingCart.Event]] {
  private val log = LoggerFactory.getLogger(getClass)
  private implicit val ec: ExecutionContext =
    system.executionContext

  private val sharding = ClusterSharding(system)
  implicit private val timeout: Timeout =
    Timeout.create(
      system.settings.config.getDuration("shopping-cart-service.ask-timeout"))

  override def process(
      envelope: EventEnvelope[ShoppingCart.Event]): Future[Done] = {
    envelope.event match {
      case checkout: ShoppingCart.CheckedOut =>
        sendOrder(checkout)

      case _ =>
        // this projection is only interested in CheckedOut events
        Future.successful(Done)
    }

  }

  private def sendOrder(checkout: ShoppingCart.CheckedOut): Future[Done] = {
    val entityRef =
      sharding.entityRefFor(ShoppingCart.EntityKey, checkout.cartId)
    entityRef.ask(ShoppingCart.Get).flatMap { cart => (2)
      val items =
        cart.items.iterator.map { case (itemId, quantity) =>
          Item(itemId, quantity)
        }.toList
      log.info(
        "Sending order of {} items for cart {}.",
        items.size,
        checkout.cartId)
      val orderReq = OrderRequest(checkout.cartId, items)
      orderService.order(orderReq).map(_ => Done) (3)
    }
  }

}
```

1. Update `SendOrderProjection` object class to be:

Java

src/main/java/shopping/cart/SendOrderProjection.java:

```
package shopping.cart;

import akka.actor.typed.ActorSystem;
import akka.cluster.sharding.typed.ShardedDaemonProcessSettings;
import akka.cluster.sharding.typed.javadsl.ShardedDaemonProcess;
import akka.persistence.cassandra.query.javadsl.CassandraReadJournal;
import akka.persistence.query.Offset;
import akka.projection.ProjectionBehavior;
import akka.projection.ProjectionId;
import akka.projection.cassandra.javadsl.CassandraProjection;
import akka.projection.eventsourced.EventEnvelope;
import akka.projection.eventsourced.javadsl.EventSourcedProvider;
import akka.projection.javadsl.AtLeastOnceProjection;
import akka.projection.javadsl.SourceProvider;
import java.util.Optional;
import shopping.order.proto.ShoppingOrderService;

public class SendOrderProjection {

  private SendOrderProjection() {}

  public static void init(ActorSystem<?> system, ShoppingOrderService orderService) {
    ShardedDaemonProcess.get(system)
        .init(
            ProjectionBehavior.Command.class,
            "SendOrderProjection",
            ShoppingCart.TAGS.size(),
            index -> ProjectionBehavior.create(createProjectionsFor(system, orderService, index)),
            ShardedDaemonProcessSettings.create(system),
            Optional.of(ProjectionBehavior.stopMessage()));
  }

  private static AtLeastOnceProjection<Offset, EventEnvelope<ShoppingCart.Event>> (1)
      createProjectionsFor(ActorSystem<?> system, ShoppingOrderService orderService, int index) {
    String tag = ShoppingCart.TAGS.get(index);
    SourceProvider<Offset, EventEnvelope<ShoppingCart.Event>> sourceProvider =
        EventSourcedProvider.eventsByTag(system, CassandraReadJournal.Identifier(), tag); (2)

    return CassandraProjection.atLeastOnce( (3)
        ProjectionId.of("SendOrderProjection", tag),
        sourceProvider,
        () -> new SendOrderProjectionHandler(system, orderService));
  }
}
```

| **1** | `AtLeastOnceProjection` instead of `ExactlyOnceProjection` |
| --- | --- |
| **2** | `CassandraReadJournal.Identifier` instead of `R2dbcReadJournal.Identifier` |
| **3** | `CassandraProjection.atLeastOnce` instead of `R2dbcProjection.exactlyOnce` |

Scala

src/main/scala/shopping/cart/SendOrderProjection.scala:

```
package shopping.cart

import akka.actor.typed.ActorSystem
import akka.cluster.sharding.typed.ShardedDaemonProcessSettings
import akka.cluster.sharding.typed.scaladsl.ShardedDaemonProcess
import akka.persistence.cassandra.query.scaladsl.CassandraReadJournal
import akka.persistence.query.Offset
import akka.projection.ProjectionBehavior
import akka.projection.ProjectionId
import akka.projection.cassandra.scaladsl.CassandraProjection
import akka.projection.eventsourced.EventEnvelope
import akka.projection.eventsourced.scaladsl.EventSourcedProvider
import akka.projection.scaladsl.AtLeastOnceProjection
import akka.projection.scaladsl.SourceProvider
import shopping.order.proto.ShoppingOrderService

object SendOrderProjection {

  def init(system: ActorSystem[_], orderService: ShoppingOrderService): Unit = {
    ShardedDaemonProcess(system).init(
      name = "SendOrderProjection",
      ShoppingCart.tags.size,
      index =>
        ProjectionBehavior(createProjectionFor(system, orderService, index)),
      ShardedDaemonProcessSettings(system),
      Some(ProjectionBehavior.Stop))
  }

  private def createProjectionFor(
      system: ActorSystem[_],
      orderService: ShoppingOrderService,
      index: Int): AtLeastOnceProjection[
    Offset,
    EventEnvelope[ShoppingCart.Event]] = { (1)
    val tag = ShoppingCart.tags(index)
    val sourceProvider
        : SourceProvider[Offset, EventEnvelope[ShoppingCart.Event]] =
      EventSourcedProvider.eventsByTag[ShoppingCart.Event](
        system = system,
        readJournalPluginId = CassandraReadJournal.Identifier, (2)
        tag = tag)

    CassandraProjection.atLeastOnce( (3)
      projectionId = ProjectionId("SendOrderProjection", tag),
      sourceProvider,
      handler = () => new SendOrderProjectionHandler(system, orderService))
  }

}
```

| **1** | `AtLeastOnceProjection` instead of `ExactlyOnceProjection` |
| --- | --- |
| **2** | `CassandraReadJournal.Identifier` instead of `R2dbcReadJournal.Identifier` |
| **3** | `CassandraProjection.atLeastOnce` instead of `R2dbcProjection.exactlyOnce` |

|  | When moving from `exactly-once` to `at-least-once` semantics, you should consider the implications of processing the same event multiple times. Depending on your specific context, you might need to ensure that your event processing is idempotent on the consuming side. |
| --- | --- |

The `SendOrderProjection.init` call from the `Main` class can remain the same as for R2DBC.

## DDL scripts

Replace the `sql` scripts in the `ddl_scripts` folder with corresponding `cql` scripts for Cassandra.

`create_tables.cql` will create the keyspace and all tables needed for Akka Persistence as well as the offset store table for Akka Projection.

ddl\-scripts/create\_tables.cql

```
-- This CQL script will create the keyspace and all tables needed for the this sample. 
-- It includes the messages and snapshot tables (write-side) and the projection tables (read-side).

-- NOTE: the keyspace as created here is probably not what you need in a production environment. 
-- This is good enough for local development though. 

CREATE KEYSPACE IF NOT EXISTS shoppingcartservice
  WITH REPLICATION = { 'class' : 'SimpleStrategy','replication_factor':1 };

USE shoppingcartservice;

CREATE TABLE IF NOT EXISTS messages (
  persistence_id text,
  partition_nr bigint,
  sequence_nr bigint,
  timestamp timeuuid,
  timebucket text,
  writer_uuid text,
  ser_id int,
  ser_manifest text,
  event_manifest text,
  event blob,
  meta_ser_id int,
  meta_ser_manifest text,
  meta blob,
  tags set<text>,
  PRIMARY KEY ((persistence_id, partition_nr), sequence_nr, timestamp));

CREATE TABLE IF NOT EXISTS tag_views (
  tag_name text,
  persistence_id text,
  sequence_nr bigint,
  timebucket bigint,
  timestamp timeuuid,
  tag_pid_sequence_nr bigint,
  writer_uuid text,
  ser_id int,
  ser_manifest text,
  event_manifest text,
  event blob,
  meta_ser_id int,
  meta_ser_manifest text,
  meta blob,
  PRIMARY KEY ((tag_name, timebucket), timestamp, persistence_id, tag_pid_sequence_nr));

CREATE TABLE IF NOT EXISTS tag_write_progress(
  persistence_id text,
  tag text,
  sequence_nr bigint,
  tag_pid_sequence_nr bigint,
  offset timeuuid,
  PRIMARY KEY (persistence_id, tag));

CREATE TABLE IF NOT EXISTS tag_scanning(
  persistence_id text,
  sequence_nr bigint,
  PRIMARY KEY (persistence_id));

CREATE TABLE IF NOT EXISTS metadata(
  persistence_id text PRIMARY KEY,
  deleted_to bigint,
  properties map<text,text>);

CREATE TABLE IF NOT EXISTS all_persistence_ids(
  persistence_id text PRIMARY KEY);

CREATE TABLE IF NOT EXISTS snapshots (
  persistence_id text,
  sequence_nr bigint,
  timestamp bigint,
  ser_id int,
  ser_manifest text,
  snapshot_data blob,
  snapshot blob,
  meta_ser_id int,
  meta_ser_manifest text,
  meta blob,
  PRIMARY KEY (persistence_id, sequence_nr))
  WITH CLUSTERING ORDER BY (sequence_nr DESC);

CREATE TABLE IF NOT EXISTS offset_store (
  projection_name text,
  partition int,
  projection_key text,
  offset text,
  manifest text,
  last_updated timestamp,
  PRIMARY KEY ((projection_name, partition), projection_key));

CREATE TABLE IF NOT EXISTS projection_management (
  projection_name text,
  partition int,
  projection_key text,
  paused boolean,
  last_updated timestamp,
  PRIMARY KEY ((projection_name, partition), projection_key));
```

|  | The keyspace as created by the script works fine for local development but is probably not what you need in a production environment. |
| --- | --- |

`create_user_tables.cql` will create the table needed for the item popularity Projection.

ddl\-scripts/create\_user\_tables.cql

```
USE shoppingcartservice;
CREATE TABLE IF NOT EXISTS item_popularity (
  item_id text,
  count counter,
  PRIMARY KEY (item_id));
```

## Run locally

### Docker compose

1. Change the `docker-compose.yml` to start Cassandra instead of PostgreSQL in Docker:

docker\-compose.yml:

```
version: '2.2'
services:
  cassandra-service:
    image: cassandra:latest
    container_name: cassandra-db
    ports:
      - "9042:9042"
    healthcheck:
      test: ["CMD", "cqlsh", "-e", "describe keyspaces"]
      interval: 5s
      timeout: 5s
      retries: 60
  # This exists to force the condition of having the Cassandra service is up before starting the tests.
  # The healthcheck above is not enough because it does not provide a condition to wait for the service
  # to be up. And this is simpler than installing cqlsh and using it to check the service status on the
  # CI server.
  cassandra:
    image: alpine:latest
    depends_on:
      cassandra-service:
        condition: service_healthy

  # See dockerhub for different versions of kafka and zookeeper
  # https://hub.docker.com/r/confluentinc/cp-kafka
  # https://hub.docker.com/_/zookeeper
  zookeeper:
    image: zookeeper:3.9
    ports:
      - "2181:2181"

  kafka:
    image: confluentinc/cp-kafka:7.4.4
    depends_on:
      - zookeeper
    ports:
      - 9092:9092
    environment:
      KAFKA_ZOOKEEPER_CONNECT: zookeeper:2181
      KAFKA_ADVERTISED_LISTENERS: PLAINTEXT://kafka:29092,PLAINTEXT_HOST://localhost:9092
      KAFKA_LISTENER_SECURITY_PROTOCOL_MAP: PLAINTEXT:PLAINTEXT,PLAINTEXT_HOST:PLAINTEXT
      KAFKA_OFFSETS_TOPIC_REPLICATION_FACTOR: 1
```
2. Start Cassandra and Kafka from the `shopping-cart-service`:

```
docker compose up -d
```
3. Create the Cassandra keyspace and tables from the CQL script located inside the `ddl-scripts` at the root of the project:

```
docker exec -i cassandra-db cqlsh -t < ddl-scripts/create_tables.cql
```

```
docker exec -i cassandra-db cqlsh -t < ddl-scripts/create_user_tables.cql
```

|  | If you get a connection error with the message ***Unable to connect to any servers***, it means the Cassandra container is still starting. Wait a few seconds and re\-try the command. |
| --- | --- |

It will create the keyspace and all tables needed for Akka Persistence as well as the offset store table for Akka Projection.

|  | The keyspace as created by the script works fine for local development but is probably not what you need in a production environment. |
| --- | --- |

### Run the service

Run the service with:

```
sbt -Dconfig.resource=local1.conf run
```

```
# make sure to compile before running exec:exec
mvn compile exec:exec -DAPP_CONFIG=local1.conf
```

### Exercise the service

Try the following to exercise the service:

1. Use `grpcurl` to add 3 socks to a cart:

```
grpcurl -d '{"cartId":"cart1", "itemId":"socks", "quantity":3}' -plaintext 127.0.0.1:8101 shoppingcart.ShoppingCartService.AddItem
```
2. Add 2 t\-shirts to the same cart:

```
grpcurl -d '{"cartId":"cart1", "itemId":"t-shirt", "quantity":2}' -plaintext 127.0.0.1:8101 shoppingcart.ShoppingCartService.AddItem
```

The returned updated cart should still contain the 3 socks.
3. Check the quantity of the cart:

```
grpcurl -d '{"cartId":"cart1"}' -plaintext 127.0.0.1:8101 shoppingcart.ShoppingCartService.GetCart
```
4. Check the popularity of the item:

```
grpcurl -d '{"itemId":"t-shirt"}' -plaintext 127.0.0.1:8101 shoppingcart.ShoppingCartService.GetItemPopularity
```
5. Check out cart:

```
grpcurl -d '{"cartId":"cart1"}' -plaintext 127.0.0.1:8101 shoppingcart.ShoppingCartService.Checkout
```

### Stop the service

When finished, stop the service with `ctrl-c`.

Stop Cassandra and Kafka with:

```
docker compose down
```

## Learn more

- [Akka Persistence Cassandra plugin reference documentation ![new tab](../_images/new-tab.svg)](https://doc.akka.io/libraries/akka-persistence-cassandra/current)
- [Akka Projection reference documentation ![new tab](../_images/new-tab.svg)](https://doc.akka.io/libraries/akka-projection/current/).

## Code Examples

### Example 1: Dependencies

```xml
<properties>
</properties>
<dependencies>
    <dependency>
        <groupId>com.typesafe.akka</groupId>
        <artifactId>akka-persistence-cassandra_${scala.binary.version}</artifactId>
    </dependency>
</dependencies>
```

### Example 2: Dependencies

```scala
val AkkaPersistenceCassandraVersion = "1.3.3"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-persistence-cassandra" % AkkaPersistenceCassandraVersion,
)
```

### Example 3: Configuration

```hocon
akka {
  # use Cassandra to store both snapshots and the events of the persistent actors
  persistence {
    journal.plugin = "akka.persistence.cassandra.journal"
    journal.auto-start-journals = ["akka.persistence.cassandra.journal"]
    snapshot-store.plugin = "akka.persistence.cassandra.snapshot"

    cassandra {
      events-by-tag {
        bucket-size = "Day"
        eventual-consistency-delay = 2s
        flush-interval = 50ms
        pubsub-notification = on
        first-time-bucket = "20200815T00:00"
      }

      query {
        refresh-interval = 2s
      }

      journal.keyspace = "shoppingcartservice"
      snapshot.keyspace = "shoppingcartservice"
    }
  }

}

datastax-java-driver {
  advanced.reconnect-on-init = on
}
```

### Example 4: Configuration

```hocon
# for reduced Projection latency
akka.persistence.cassandra.events-by-tag.eventual-consistency-delay = 200 ms
```

### Example 5: Dependencies

```xml
<dependency>
    <groupId>com.lightbend.akka</groupId>
    <artifactId>akka-projection-cassandra_${scala.binary.version}</artifactId>
</dependency>
```

### Example 6: Dependencies

```scala
"com.lightbend.akka" %% "akka-projection-cassandra" % AkkaProjectionVersion,
```

### Example 7: Configuration

```hocon
akka.projection {
  cassandra.offset-store.keyspace = "shoppingcartservice"
  # use same Cassandra session config as for the journal
  cassandra.session-config-path = "akka.persistence.cassandra"
}
```

### Example 8: Create tags

```java
static final List<String> TAGS = List.of("carts-0", "carts-1", "carts-2", "carts-3", "carts-4");

public static void init(ActorSystem<?> system) {
  ClusterSharding.get(system)
      .init(
          Entity.of(
              ENTITY_KEY,
              entityContext -> {
                int i = Math.abs(entityContext.getEntityId().hashCode() % TAGS.size());
                String selectedTag = TAGS.get(i);
                return ShoppingCart.create(entityContext.getEntityId(), selectedTag);
              }));
}
```

### Example 9: Create tags

```scala
import akka.cluster.sharding.typed.scaladsl.EntityContext

  val tags = Vector.tabulate(5)(i => s"carts-$i")

  def init(system: ActorSystem[_]): Unit = {
    val behaviorFactory: EntityContext[Command] => Behavior[Command] = {
      entityContext =>
        val i = math.abs(entityContext.entityId.hashCode % tags.size)
        val selectedTag = tags(i)
        ShoppingCart(entityContext.entityId, selectedTag)
    }
    ClusterSharding(system).init(Entity(EntityKey)(behaviorFactory))
  }
```

### Example 10: Create tags

```java
public static Behavior<Command> create(String cartId, String projectionTag) {
  return Behaviors.setup(
      ctx -> EventSourcedBehavior.start(new ShoppingCart(cartId, projectionTag), ctx));
}

private final String projectionTag;

private final String cartId;

private ShoppingCart(String cartId, String projectionTag) {
  super(
      PersistenceId.of(ENTITY_KEY.name(), cartId),
      SupervisorStrategy.restartWithBackoff(Duration.ofMillis(200), Duration.ofSeconds(5), 0.1));
  this.cartId = cartId;
  this.projectionTag = projectionTag;
}

@Override
public Set<String> tagsFor(Event event) { (1)
  return Collections.singleton(projectionTag);
}
```

### Example 11: Create tags

```scala
def apply(cartId: String, projectionTag: String): Behavior[Command] = {
  EventSourcedBehavior
    .withEnforcedReplies[Command, Event, State](
      persistenceId = PersistenceId(EntityKey.name, cartId),
      emptyState = State.empty,
      commandHandler =
        (state, command) => handleCommand(cartId, state, command),
      eventHandler = (state, event) => handleEvent(state, event))
    .withTagger(_ => Set(projectionTag)) (1)
    .withRetention(RetentionCriteria.snapshotEvery(numberOfEvents = 100))
    .onPersistFailure(
      SupervisorStrategy.restartWithBackoff(200.millis, 5.seconds, 0.1))
}
```

### Example 12: Create the Projection

```java
package shopping.cart;

import akka.Done;
import akka.projection.eventsourced.EventEnvelope;
import akka.projection.javadsl.Handler;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class ItemPopularityProjectionHandler
    extends Handler<EventEnvelope<ShoppingCart.Event>> { (1)
  private final Logger logger = LoggerFactory.getLogger(getClass());
  private final String tag;
  private final ItemPopularityRepository repo;

  public ItemPopularityProjectionHandler(String tag, ItemPopularityRepository repo) {
    this.tag = tag;
    this.repo = repo;
  }

  @Override
  public CompletionStage<Done> process(EventEnvelope<ShoppingCart.Event> envelope) { (2)
    ShoppingCart.Event event = envelope.event();

    switch (event) {
      case ShoppingCart.ItemAdded(var __, String itemId, int qtd) -> { (3)
        CompletionStage<Done> result = this.repo.update(itemId, qtd);
        result.thenAccept(done -> logItemCount(itemId));
        return result;
      case ShoppingCart.CheckedOut ignored -> {
        return CompletableFuture.completedFuture(Done.getInstance());
      }
      case null -> throw new IllegalArgumentException("Unknown event type: " + event.getClass());
    }
  }

  private void logItemCount(String itemId) {
    repo.getItem(itemId)
        .thenAccept(
            optCount ->
                logger.info(
                    "ItemPopularityProjectionHandler({}) item popularity for '{}': [{}]",
                    this.tag,
                    itemId,
                    optCount.orElse(0L)));
  }
}
```

### Example 13: Create the Projection

```scala
package shopping.cart

import scala.concurrent.ExecutionContext
import scala.concurrent.Future

import akka.Done
import akka.actor.typed.ActorSystem
import akka.projection.eventsourced.EventEnvelope
import akka.projection.scaladsl.Handler
import org.slf4j.LoggerFactory

class ItemPopularityProjectionHandler(
    tag: String,
    system: ActorSystem[_],
    repo: ItemPopularityRepository)
    extends Handler[EventEnvelope[ShoppingCart.Event]]() { (1)

  private val log = LoggerFactory.getLogger(getClass)
  private implicit val ec: ExecutionContext =
    system.executionContext

  override def process(
      envelope: EventEnvelope[ShoppingCart.Event]): Future[Done] = { (2)
    envelope.event match { (3)
      case ShoppingCart.ItemAdded(_, itemId, quantity) =>
        val result = repo.update(itemId, quantity)
        result.foreach(_ => logItemCount(itemId))
        result


      case _: ShoppingCart.CheckedOut =>
        Future.successful(Done)
    }
  }

  private def logItemCount(itemId: String): Unit = {
    repo.getItem(itemId).foreach { optCount =>
      log.info(
        "ItemPopularityProjectionHandler({}) item popularity for '{}': [{}]",
        tag,
        itemId,
        optCount.getOrElse(0))
    }
  }

}
```

### Example 14: Create the Projection

```java
package shopping.cart;

import akka.Done;
import java.util.Optional;
import java.util.concurrent.CompletionStage;

public interface ItemPopularityRepository {
  CompletionStage<Done> update(String itemId, int delta);

  CompletionStage<Optional<Long>> getItem(String itemId);
}
```

### Example 15: Create the Projection

```scala
package shopping.cart

import scala.concurrent.Future
import akka.Done

trait ItemPopularityRepository {
  def update(itemId: String, delta: Int): Future[Done]
  def getItem(itemId: String): Future[Option[Long]]
}
```

### Example 16: Create the Projection

```java
package shopping.cart;

import akka.Done;
import akka.stream.alpakka.cassandra.javadsl.CassandraSession;
import java.util.Optional;
import java.util.concurrent.CompletionStage;

public final class ItemPopularityRepositoryImpl implements ItemPopularityRepository {

  static final String POPULARITY_TABLE = "item_popularity";

  private final CassandraSession session;
  private final String table;

  public ItemPopularityRepositoryImpl(CassandraSession session, String keyspace) {
    this.session = session;
    this.table = keyspace + "." + POPULARITY_TABLE;
  }

  @Override
  public CompletionStage<Done> update(String itemId, int delta) {
    return session.executeWrite(
        "UPDATE " + table + " SET count = count + ? WHERE item_id = ?",
        Long.valueOf(delta),
        itemId);
  }

  @Override
  public CompletionStage<Optional<Long>> getItem(String itemId) {
    return session
        .selectOne("SELECT item_id, count FROM " + table + " WHERE item_id = ?", itemId)
        .thenApply(opt -> opt.map(row -> row.getLong("count")));
  }
}
```

### Example 17: Create the Projection

```scala
package shopping.cart

import scala.concurrent.Future
import akka.Done
import scala.concurrent.ExecutionContext
import akka.stream.alpakka.cassandra.scaladsl.CassandraSession

object ItemPopularityRepositoryImpl {
  val popularityTable = "item_popularity"
}

class ItemPopularityRepositoryImpl(session: CassandraSession, keyspace: String)(
    implicit val ec: ExecutionContext)
    extends ItemPopularityRepository {
  import ItemPopularityRepositoryImpl.popularityTable

  override def update(itemId: String, delta: Int): Future[Done] = {
    session.executeWrite(
      s"UPDATE $keyspace.$popularityTable SET count = count + ? WHERE item_id = ?",
      java.lang.Long.valueOf(delta),
      itemId)
  }

  override def getItem(itemId: String): Future[Option[Long]] = {
    session
      .selectOne(
        s"SELECT item_id, count FROM $keyspace.$popularityTable WHERE item_id = ?",
        itemId)
      .map(opt => opt.map(row => row.getLong("count").longValue()))
  }
}
```

### Example 18: Create the Projection

```java
package shopping.cart;

import akka.actor.typed.ActorSystem;
import akka.cluster.sharding.typed.ShardedDaemonProcessSettings;
import akka.cluster.sharding.typed.javadsl.ShardedDaemonProcess;
import akka.persistence.cassandra.query.javadsl.CassandraReadJournal;
import akka.persistence.query.Offset;
import akka.projection.ProjectionBehavior;
import akka.projection.ProjectionId;
import akka.projection.cassandra.javadsl.CassandraProjection;
import akka.projection.eventsourced.EventEnvelope;
import akka.projection.eventsourced.javadsl.EventSourcedProvider;
import akka.projection.javadsl.AtLeastOnceProjection;
import akka.projection.javadsl.SourceProvider;
import java.util.Optional;

public final class ItemPopularityProjection {

  private ItemPopularityProjection() {}

  public static void init(ActorSystem<?> system, ItemPopularityRepository repository) {
    ShardedDaemonProcess.get(system)
        .init( (1)
            ProjectionBehavior.Command.class,
            "ItemPopularityProjection",
            ShoppingCart.TAGS.size(),
            index -> ProjectionBehavior.create(createProjectionFor(system, repository, index)),
            ShardedDaemonProcessSettings.create(system),
            Optional.of(ProjectionBehavior.stopMessage()));
  }

  private static AtLeastOnceProjection<Offset, EventEnvelope<ShoppingCart.Event>>
      createProjectionFor(ActorSystem<?> system, ItemPopularityRepository repository, int index) {
    String tag = ShoppingCart.TAGS.get(index); (2)

    SourceProvider<Offset, EventEnvelope<ShoppingCart.Event>> sourceProvider = (3)
        EventSourcedProvider.eventsByTag(
            system,
            CassandraReadJournal.Identifier(), (4)
            tag);

    return CassandraProjection.atLeastOnce( (5)
        ProjectionId.of("ItemPopularityProjection", tag),
        sourceProvider,
        () -> new ItemPopularityProjectionHandler(tag, repository)); (6)
  }
}
```

### Example 19: Create the Projection

```scala
package shopping.cart

import akka.actor.typed.ActorSystem
import akka.cluster.sharding.typed.ShardedDaemonProcessSettings
import akka.cluster.sharding.typed.scaladsl.ShardedDaemonProcess
import akka.persistence.cassandra.query.scaladsl.CassandraReadJournal
import akka.persistence.query.Offset
import akka.projection.ProjectionBehavior
import akka.projection.ProjectionId
import akka.projection.cassandra.scaladsl.CassandraProjection
import akka.projection.eventsourced.EventEnvelope
import akka.projection.eventsourced.scaladsl.EventSourcedProvider
import akka.projection.scaladsl.AtLeastOnceProjection
import akka.projection.scaladsl.SourceProvider

object ItemPopularityProjection {
  def init(
      system: ActorSystem[_],
      repository: ItemPopularityRepository): Unit = {
    ShardedDaemonProcess(system).init( (1)
      name = "ItemPopularityProjection",
      ShoppingCart.tags.size,
      index =>
        ProjectionBehavior(createProjectionFor(system, repository, index)),
      ShardedDaemonProcessSettings(system),
      Some(ProjectionBehavior.Stop))
  }

  private def createProjectionFor(
      system: ActorSystem[_],
      repository: ItemPopularityRepository,
      index: Int)
      : AtLeastOnceProjection[Offset, EventEnvelope[ShoppingCart.Event]] = {
    val tag = ShoppingCart.tags(index) (2)

    val sourceProvider
        : SourceProvider[Offset, EventEnvelope[ShoppingCart.Event]] = (3)
      EventSourcedProvider.eventsByTag[ShoppingCart.Event](
        system = system,
        readJournalPluginId = CassandraReadJournal.Identifier, (4)
        tag = tag)

    CassandraProjection.atLeastOnce( (5)
      projectionId = ProjectionId("ItemPopularityProjection", tag),
      sourceProvider,
      handler = () =>
        new ItemPopularityProjectionHandler(tag, system, repository) (6)
    )
  }

}
```

### Example 20: Create the Projection

```java
CassandraSession session =
    CassandraSessionRegistry.get(system).sessionFor("akka.persistence.cassandra"); (1)
// use same keyspace for the item_popularity table as the offset store
Config config = system.settings().config();
String itemPopularityKeyspace =
    config.getString("akka.projection.cassandra.offset-store.keyspace");
ItemPopularityRepository itemPopularityRepository =
    new ItemPopularityRepositoryImpl(session, itemPopularityKeyspace); (2)

ItemPopularityProjection.init(system, itemPopularityRepository); (3)
```

### Example 21: Create the Projection

```scala
import akka.stream.alpakka.cassandra.scaladsl.CassandraSessionRegistry

    val session = CassandraSessionRegistry(system).sessionFor(
      "akka.persistence.cassandra"
    ) (1)
    // use same keyspace for the item_popularity table as the offset store
    val itemPopularityKeyspace =
      system.settings.config
        .getString("akka.projection.cassandra.offset-store.keyspace")
    val itemPopularityRepository =
      new ItemPopularityRepositoryImpl(session, itemPopularityKeyspace)(
        system.executionContext
      ) (2)

    ItemPopularityProjection.init(system, itemPopularityRepository) (3)
```

### Example 22: Create the Projection

```java
@Override
public CompletionStage<GetItemPopularityResponse> getItemPopularity(GetItemPopularityRequest in) {
  return itemPopularityRepository
      .getItem(in.getItemId())
      .thenApply(
          maybePopularity -> {
            long popularity = maybePopularity.orElse(0L);
            return GetItemPopularityResponse.newBuilder().setPopularityCount(popularity).build();
          });
}
```

### Example 23: Create the Projection

```scala
override def getItemPopularity(in: proto.GetItemPopularityRequest)
    : Future[proto.GetItemPopularityResponse] = {
  itemPopularityRepository.getItem(in.itemId).map {
    case Some(count) =>
      proto.GetItemPopularityResponse(in.itemId, count)
    case None =>
      proto.GetItemPopularityResponse(in.itemId, 0L)
  }
}
```

### Example 24: Projection calling gRPC service

```java
package shopping.cart;

import static akka.Done.done;

import akka.Done;
import akka.actor.typed.ActorSystem;
import akka.cluster.sharding.typed.javadsl.ClusterSharding;
import akka.cluster.sharding.typed.javadsl.EntityRef;
import akka.projection.eventsourced.EventEnvelope;
import akka.projection.javadsl.Handler;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.stream.Collectors;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import shopping.order.proto.Item;
import shopping.order.proto.OrderRequest;
import shopping.order.proto.ShoppingOrderService;

public final class SendOrderProjectionHandler extends Handler<EventEnvelope<ShoppingCart.Event>> {

  private final Logger log = LoggerFactory.getLogger(getClass());
  private final ClusterSharding sharding;
  private final Duration timeout;
  private final ShoppingOrderService orderService;

  public SendOrderProjectionHandler(
      ActorSystem<?> system, ShoppingOrderService orderService) { (1)
    sharding = ClusterSharding.get(system);
    timeout = system.settings().config().getDuration("shopping-cart-service.ask-timeout");
    this.orderService = orderService;
  }

  @Override
  public CompletionStage<Done> process(EventEnvelope<ShoppingCart.Event> envelope) {
    return envelope.event() instanceof ShoppingCart.CheckedOut checkedOut
        ? sendOrder(checkedOut)
        : CompletableFuture.completedFuture(done());
  }

  private CompletionStage<Done> sendOrder(ShoppingCart.CheckedOut checkout) {
    EntityRef<ShoppingCart.Command> entityRef =
        sharding.entityRefFor(ShoppingCart.ENTITY_KEY, checkout.cartId());
    CompletionStage<ShoppingCart.Summary> reply = entityRef.ask(ShoppingCart.Get::new, timeout);
    return reply.thenCompose(
        cart -> { (2)
          List<Item> protoItems =
              cart.items().entrySet().stream()
                  .map(
                      entry ->
                          Item.newBuilder()
                              .setItemId(entry.getKey())
                              .setQuantity(entry.getValue())
                              .build())
                  .collect(Collectors.toList());
          log.info(
              "Sending order of {} items for cart {}.", cart.items().size(), checkout.cartId());
          OrderRequest orderRequest =
              OrderRequest.newBuilder()
                  .setCartId(checkout.cartId())
                  .addAllItems(protoItems)
                  .build();
          return orderService.order(orderRequest).thenApply(response -> done()); (3)
        });
  }
}
```

### Example 25: Projection calling gRPC service

```scala
package shopping.cart

import scala.concurrent.ExecutionContext
import scala.concurrent.Future

import akka.Done
import akka.actor.typed.ActorSystem
import akka.cluster.sharding.typed.scaladsl.ClusterSharding
import akka.projection.eventsourced.EventEnvelope
import akka.projection.scaladsl.Handler
import akka.util.Timeout
import org.slf4j.LoggerFactory
import shopping.order.proto.Item
import shopping.order.proto.OrderRequest
import shopping.order.proto.ShoppingOrderService

class SendOrderProjectionHandler(
    system: ActorSystem[_],
    orderService: ShoppingOrderService) (1)
    extends Handler[EventEnvelope[ShoppingCart.Event]] {
  private val log = LoggerFactory.getLogger(getClass)
  private implicit val ec: ExecutionContext =
    system.executionContext

  private val sharding = ClusterSharding(system)
  implicit private val timeout: Timeout =
    Timeout.create(
      system.settings.config.getDuration("shopping-cart-service.ask-timeout"))

  override def process(
      envelope: EventEnvelope[ShoppingCart.Event]): Future[Done] = {
    envelope.event match {
      case checkout: ShoppingCart.CheckedOut =>
        sendOrder(checkout)

      case _ =>
        // this projection is only interested in CheckedOut events
        Future.successful(Done)
    }

  }

  private def sendOrder(checkout: ShoppingCart.CheckedOut): Future[Done] = {
    val entityRef =
      sharding.entityRefFor(ShoppingCart.EntityKey, checkout.cartId)
    entityRef.ask(ShoppingCart.Get).flatMap { cart => (2)
      val items =
        cart.items.iterator.map { case (itemId, quantity) =>
          Item(itemId, quantity)
        }.toList
      log.info(
        "Sending order of {} items for cart {}.",
        items.size,
        checkout.cartId)
      val orderReq = OrderRequest(checkout.cartId, items)
      orderService.order(orderReq).map(_ => Done) (3)
    }
  }

}
```

### Example 26: Projection calling gRPC service

```java
package shopping.cart;

import akka.actor.typed.ActorSystem;
import akka.cluster.sharding.typed.ShardedDaemonProcessSettings;
import akka.cluster.sharding.typed.javadsl.ShardedDaemonProcess;
import akka.persistence.cassandra.query.javadsl.CassandraReadJournal;
import akka.persistence.query.Offset;
import akka.projection.ProjectionBehavior;
import akka.projection.ProjectionId;
import akka.projection.cassandra.javadsl.CassandraProjection;
import akka.projection.eventsourced.EventEnvelope;
import akka.projection.eventsourced.javadsl.EventSourcedProvider;
import akka.projection.javadsl.AtLeastOnceProjection;
import akka.projection.javadsl.SourceProvider;
import java.util.Optional;
import shopping.order.proto.ShoppingOrderService;

public class SendOrderProjection {

  private SendOrderProjection() {}

  public static void init(ActorSystem<?> system, ShoppingOrderService orderService) {
    ShardedDaemonProcess.get(system)
        .init(
            ProjectionBehavior.Command.class,
            "SendOrderProjection",
            ShoppingCart.TAGS.size(),
            index -> ProjectionBehavior.create(createProjectionsFor(system, orderService, index)),
            ShardedDaemonProcessSettings.create(system),
            Optional.of(ProjectionBehavior.stopMessage()));
  }

  private static AtLeastOnceProjection<Offset, EventEnvelope<ShoppingCart.Event>> (1)
      createProjectionsFor(ActorSystem<?> system, ShoppingOrderService orderService, int index) {
    String tag = ShoppingCart.TAGS.get(index);
    SourceProvider<Offset, EventEnvelope<ShoppingCart.Event>> sourceProvider =
        EventSourcedProvider.eventsByTag(system, CassandraReadJournal.Identifier(), tag); (2)

    return CassandraProjection.atLeastOnce( (3)
        ProjectionId.of("SendOrderProjection", tag),
        sourceProvider,
        () -> new SendOrderProjectionHandler(system, orderService));
  }
}
```

### Example 27: Projection calling gRPC service

```scala
package shopping.cart

import akka.actor.typed.ActorSystem
import akka.cluster.sharding.typed.ShardedDaemonProcessSettings
import akka.cluster.sharding.typed.scaladsl.ShardedDaemonProcess
import akka.persistence.cassandra.query.scaladsl.CassandraReadJournal
import akka.persistence.query.Offset
import akka.projection.ProjectionBehavior
import akka.projection.ProjectionId
import akka.projection.cassandra.scaladsl.CassandraProjection
import akka.projection.eventsourced.EventEnvelope
import akka.projection.eventsourced.scaladsl.EventSourcedProvider
import akka.projection.scaladsl.AtLeastOnceProjection
import akka.projection.scaladsl.SourceProvider
import shopping.order.proto.ShoppingOrderService

object SendOrderProjection {

  def init(system: ActorSystem[_], orderService: ShoppingOrderService): Unit = {
    ShardedDaemonProcess(system).init(
      name = "SendOrderProjection",
      ShoppingCart.tags.size,
      index =>
        ProjectionBehavior(createProjectionFor(system, orderService, index)),
      ShardedDaemonProcessSettings(system),
      Some(ProjectionBehavior.Stop))
  }

  private def createProjectionFor(
      system: ActorSystem[_],
      orderService: ShoppingOrderService,
      index: Int): AtLeastOnceProjection[
    Offset,
    EventEnvelope[ShoppingCart.Event]] = { (1)
    val tag = ShoppingCart.tags(index)
    val sourceProvider
        : SourceProvider[Offset, EventEnvelope[ShoppingCart.Event]] =
      EventSourcedProvider.eventsByTag[ShoppingCart.Event](
        system = system,
        readJournalPluginId = CassandraReadJournal.Identifier, (2)
        tag = tag)

    CassandraProjection.atLeastOnce( (3)
      projectionId = ProjectionId("SendOrderProjection", tag),
      sourceProvider,
      handler = () => new SendOrderProjectionHandler(system, orderService))
  }

}
```

### Example 28: DDL scripts

```cql
-- This CQL script will create the keyspace and all tables needed for the this sample. 
-- It includes the messages and snapshot tables (write-side) and the projection tables (read-side).

-- NOTE: the keyspace as created here is probably not what you need in a production environment. 
-- This is good enough for local development though. 

CREATE KEYSPACE IF NOT EXISTS shoppingcartservice
  WITH REPLICATION = { 'class' : 'SimpleStrategy','replication_factor':1 };

USE shoppingcartservice;

CREATE TABLE IF NOT EXISTS messages (
  persistence_id text,
  partition_nr bigint,
  sequence_nr bigint,
  timestamp timeuuid,
  timebucket text,
  writer_uuid text,
  ser_id int,
  ser_manifest text,
  event_manifest text,
  event blob,
  meta_ser_id int,
  meta_ser_manifest text,
  meta blob,
  tags set<text>,
  PRIMARY KEY ((persistence_id, partition_nr), sequence_nr, timestamp));

CREATE TABLE IF NOT EXISTS tag_views (
  tag_name text,
  persistence_id text,
  sequence_nr bigint,
  timebucket bigint,
  timestamp timeuuid,
  tag_pid_sequence_nr bigint,
  writer_uuid text,
  ser_id int,
  ser_manifest text,
  event_manifest text,
  event blob,
  meta_ser_id int,
  meta_ser_manifest text,
  meta blob,
  PRIMARY KEY ((tag_name, timebucket), timestamp, persistence_id, tag_pid_sequence_nr));

CREATE TABLE IF NOT EXISTS tag_write_progress(
  persistence_id text,
  tag text,
  sequence_nr bigint,
  tag_pid_sequence_nr bigint,
  offset timeuuid,
  PRIMARY KEY (persistence_id, tag));

CREATE TABLE IF NOT EXISTS tag_scanning(
  persistence_id text,
  sequence_nr bigint,
  PRIMARY KEY (persistence_id));

CREATE TABLE IF NOT EXISTS metadata(
  persistence_id text PRIMARY KEY,
  deleted_to bigint,
  properties map<text,text>);

CREATE TABLE IF NOT EXISTS all_persistence_ids(
  persistence_id text PRIMARY KEY);

CREATE TABLE IF NOT EXISTS snapshots (
  persistence_id text,
  sequence_nr bigint,
  timestamp bigint,
  ser_id int,
  ser_manifest text,
  snapshot_data blob,
  snapshot blob,
  meta_ser_id int,
  meta_ser_manifest text,
  meta blob,
  PRIMARY KEY (persistence_id, sequence_nr))
  WITH CLUSTERING ORDER BY (sequence_nr DESC);

CREATE TABLE IF NOT EXISTS offset_store (
  projection_name text,
  partition int,
  projection_key text,
  offset text,
  manifest text,
  last_updated timestamp,
  PRIMARY KEY ((projection_name, partition), projection_key));

CREATE TABLE IF NOT EXISTS projection_management (
  projection_name text,
  partition int,
  projection_key text,
  paused boolean,
  last_updated timestamp,
  PRIMARY KEY ((projection_name, partition), projection_key));
```

### Example 29: DDL scripts

```cql
USE shoppingcartservice;
CREATE TABLE IF NOT EXISTS item_popularity (
  item_id text,
  count counter,
  PRIMARY KEY (item_id));
```

### Example 30: Docker compose

```yaml
version: '2.2'
services:
  cassandra-service:
    image: cassandra:latest
    container_name: cassandra-db
    ports:
      - "9042:9042"
    healthcheck:
      test: ["CMD", "cqlsh", "-e", "describe keyspaces"]
      interval: 5s
      timeout: 5s
      retries: 60
  # This exists to force the condition of having the Cassandra service is up before starting the tests.
  # The healthcheck above is not enough because it does not provide a condition to wait for the service
  # to be up. And this is simpler than installing cqlsh and using it to check the service status on the
  # CI server.
  cassandra:
    image: alpine:latest
    depends_on:
      cassandra-service:
        condition: service_healthy

  # See dockerhub for different versions of kafka and zookeeper
  # https://hub.docker.com/r/confluentinc/cp-kafka
  # https://hub.docker.com/_/zookeeper
  zookeeper:
    image: zookeeper:3.9
    ports:
      - "2181:2181"

  kafka:
    image: confluentinc/cp-kafka:7.4.4
    depends_on:
      - zookeeper
    ports:
      - 9092:9092
    environment:
      KAFKA_ZOOKEEPER_CONNECT: zookeeper:2181
      KAFKA_ADVERTISED_LISTENERS: PLAINTEXT://kafka:29092,PLAINTEXT_HOST://localhost:9092
      KAFKA_LISTENER_SECURITY_PROTOCOL_MAP: PLAINTEXT:PLAINTEXT,PLAINTEXT_HOST:PLAINTEXT
      KAFKA_OFFSETS_TOPIC_REPLICATION_FACTOR: 1
```

### Example 31: Docker compose

```shell
docker compose up -d
```

### Example 32: Run the service

```shell
sbt -Dconfig.resource=local1.conf run
```

### Example 33: Run the service

```shell
# make sure to compile before running exec:exec
mvn compile exec:exec -DAPP_CONFIG=local1.conf
```

### Example 34: Exercise the service

```shell
grpcurl -d '{"cartId":"cart1", "itemId":"socks", "quantity":3}' -plaintext 127.0.0.1:8101 shoppingcart.ShoppingCartService.AddItem
```

### Example 35: Exercise the service

```shell
grpcurl -d '{"cartId":"cart1", "itemId":"t-shirt", "quantity":2}' -plaintext 127.0.0.1:8101 shoppingcart.ShoppingCartService.AddItem
```

### Example 36: Exercise the service

```shell
grpcurl -d '{"cartId":"cart1"}' -plaintext 127.0.0.1:8101 shoppingcart.ShoppingCartService.GetCart
```

### Example 37: Exercise the service

```shell
grpcurl -d '{"itemId":"t-shirt"}' -plaintext 127.0.0.1:8101 shoppingcart.ShoppingCartService.GetItemPopularity
```

### Example 38: Exercise the service

```shell
grpcurl -d '{"cartId":"cart1"}' -plaintext 127.0.0.1:8101 shoppingcart.ShoppingCartService.Checkout
```

### Example 39: Stop the service

```shell
docker compose down
```

## Related Pages (Internal Links)

- https://doc.akka.io/guide/how-to/_attachments/6-shopping-cart-complete-java.zip
- https://doc.akka.io/guide/how-to/_attachments/6-shopping-cart-complete-scala.zip
- https://doc.akka.io/guide/how-to/_attachments/shopping-cart-cassandra-java.zip
- https://doc.akka.io/guide/how-to/_attachments/shopping-cart-cassandra-scala.zip
- https://doc.akka.io/guide/how-to/projection-kafka.html
- https://doc.akka.io/guide/microservices-tutorial/entity.html
- https://doc.akka.io/guide/microservices-tutorial/index.html
- https://doc.akka.io/guide/microservices-tutorial/projection-over-grpc.html
- https://doc.akka.io/guide/microservices-tutorial/projection-query.html
- https://doc.akka.io/libraries/akka-persistence-cassandra/current
- https://doc.akka.io/libraries/akka-projection/current/
- https://doc.akka.io/libraries/akka-projection/current/r2dbc.html
- https://doc.akka.io/libraries/akka-projection/current/running.html
- https://doc.akka.io/libraries/alpakka/current/cassandra.html

---
*Source: [https://doc.akka.io/guide/how-to/cassandra-alternative.html](https://doc.akka.io/guide/how-to/cassandra-alternative.html)*