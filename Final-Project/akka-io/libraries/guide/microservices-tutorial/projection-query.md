---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:22:10Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/guide/microservices-tutorial/projection-query.html
title: 'Section 6: Projection for queries :: Akka Guide'
---

# Section 6: Projection for queries :: Akka Guide

## Content

# Section 6: Projection for queries

Language

Next, we will create an [Akka Projection ![new tab](../_images/new-tab.svg)](https://doc.akka.io/libraries/akka-projection/current/) from the events emitted by the `ShoppingCart` entity. The Projection will update counts in the database to track item popularity. Then, we can query the database to find how popular an item is. Since `ShoppingCart` entities can only be addressed by individual cart identifiers, we can find a particular cart, but we can’t find all carts that contain a particular item.

![Example query](_images/example-projection-query.drawio.svg)

This piece of the [full example](overview.html) focuses on the `ItemPopularityProjection` and a query representation in the database. On this page you will learn how to:

- implement a Projection
- distribute the Projection instances over the nodes in the Akka Cluster
- work with the Projection R2DBC API

The [CQRS](../concepts/cqrs.html) section explains why it is a good practice to build a Projection from entity events that can be queried. The [Introduction to Akka Projections video ![new tab](../_images/new-tab.svg)](https://akka.io/blog/news/2020/09/10/akka-projection-intro-video) is also a good starting point for learning about Akka Projections.

This example is using PostgreSQL for storing the Projection result, and the Projection offset. An alternative is described in [Use Cassandra instead of PostgreSQL](../how-to/cassandra-alternative.html).

## Source downloads

If you prefer to simply view and run the example, download a zip file containing the completed code:

Java

- [Source](_attachments/3-shopping-cart-event-sourced-complete-java.zip) that includes all previous tutorial steps and allows you to start with the steps on this page.
- [Source](_attachments/4-shopping-cart-projection-java.zip) with the steps on this page completed.

Scala

- [Source](_attachments/3-shopping-cart-event-sourced-complete-scala.zip) that includes all previous tutorial steps and allows you to start with the steps on this page.
- [Source](_attachments/4-shopping-cart-projection-scala.zip) with the steps on this page completed.

## 1\. Process events in a Projection

To process events in a projection, we will:

- encapsulate database access with `ItemPopularityRepository`, which can have a stubbed implementation for tests
- add Repository implementation for R2DBC
- implement the event processing of the Projection in a `Handler`

Follow these steps to process events in a Projection:

1. Add the `ItemPopularityRepository`:

Java

src/main/java/shopping/cart/repository/ItemPopularityRepository.java:

```
package shopping.cart.repository;

import akka.projection.r2dbc.javadsl.R2dbcSession; (1)
import java.util.Optional;
import java.util.concurrent.CompletionStage;
import shopping.cart.ItemPopularity;

public interface ItemPopularityRepository {

  CompletionStage<Long> saveOrUpdate(R2dbcSession session, ItemPopularity itemPopularity);

  CompletionStage<Optional<ItemPopularity>> findById(R2dbcSession session, String id);

  CompletionStage<Optional<Long>> getCount(R2dbcSession session, String id);
}
```

| **1** | Make sure to import the right projection R2DBC session: \`akka.projection.r2dbc.javadsl.R2dbcSession\`". |
| --- | --- |

Scala

src/main/scala/shopping/cart/repository/ItemPopularityRepository.scala:

```
// tag::trait[]
package shopping.cart.repository

import akka.projection.r2dbc.scaladsl.R2dbcSession (1)

import scala.concurrent.Future

trait ItemPopularityRepository {
  def update(session: R2dbcSession, itemId: String, delta: Int): Future[Long]
  def getItem(session: R2dbcSession, itemId: String): Future[Option[Long]]
}
// end::trait[]

// tag::impl[]
class ItemPopularityRepositoryImpl() extends ItemPopularityRepository {

  override def update(
      session: R2dbcSession,
      itemId: String,
      delta: Int): Future[Long] = {
    session.updateOne(session
      .createStatement(
        "INSERT INTO item_popularity (itemid, count) VALUES ($1, $2) " +
        "ON CONFLICT(itemid) DO UPDATE SET count = item_popularity.count + $3")
      .bind(0, itemId)
      .bind(1, delta)
      .bind(2, delta))
  }

  override def getItem(
      session: R2dbcSession,
      itemId: String): Future[Option[Long]] = {
    session.selectOne(
      session
        .createStatement("SELECT count FROM item_popularity WHERE itemid = $1")
        .bind(0, itemId)) { row =>
      row.get("count", classOf[java.lang.Long])
    }
  }

}
// end::impl[]
```

| **1** | Make sure to import the right projection R2DBC session: \`akka.projection.r2dbc.scaladsl.R2dbcSession\`". |
| --- | --- |
2. Add the `ItemPopularity`: Note that we are returning the popularity value directly, but adding an `ItemPopularity` could be an option as well.

src/main/java/shopping/cart/ItemPopularity.java:

```
package shopping.cart;

public record ItemPopularity(String itemId, long count) {

  public ItemPopularity() {
    // null version means the entity is not on the DB
    this("", 0);
  }

  public ItemPopularity changeCount(long delta) {
    return new ItemPopularity(itemId, count + delta);
  }
}
```
3. Add the implementation for PostgreSQL by using the `R2dbcSession`:

Java

src/main/java/shopping/cart/repository/ItemPopularityRepositoryImpl.java:

```
package shopping.cart.repository;

import akka.projection.r2dbc.javadsl.R2dbcSession;
import java.util.Optional;
import java.util.concurrent.CompletionStage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import shopping.cart.ItemPopularity;

public class ItemPopularityRepositoryImpl implements ItemPopularityRepository {

  private final Logger logger = LoggerFactory.getLogger(getClass());

  @Override
  public CompletionStage<Long> saveOrUpdate(R2dbcSession session, ItemPopularity itemPopularity) {
    return session.updateOne(
        session
            .createStatement(
                "INSERT INTO item_popularity (itemid, count) VALUES ($1, $2) "
                    + "ON CONFLICT (itemid) DO UPDATE SET count = item_popularity.count + $3")
            .bind(0, itemPopularity.itemId())
            .bind(1, itemPopularity.count())
            .bind(2, itemPopularity.count()));
  }

  @Override
  public CompletionStage<Optional<ItemPopularity>> findById(R2dbcSession session, String id) {
    return session.selectOne(
        session
            .createStatement("SELECT itemid, count FROM item_popularity WHERE itemid = $1")
            .bind(0, id),
        row -> new ItemPopularity(row.get("itemid", String.class), row.get("count", Long.class)));
  }

  @Override
  public CompletionStage<Optional<Long>> getCount(R2dbcSession session, String id) {
    return session.selectOne(
        session.createStatement("SELECT count FROM item_popularity WHERE itemid = $1").bind(0, id),
        row -> row.get("count", Long.class));
  }
}
```

Scala

src/main/scala/shopping/cart/repository/ItemPopularityRepository.scala:

```
class ItemPopularityRepositoryImpl() extends ItemPopularityRepository {

  override def update(
      session: R2dbcSession,
      itemId: String,
      delta: Int): Future[Long] = {
    session.updateOne(session
      .createStatement(
        "INSERT INTO item_popularity (itemid, count) VALUES ($1, $2) " +
        "ON CONFLICT(itemid) DO UPDATE SET count = item_popularity.count + $3")
      .bind(0, itemId)
      .bind(1, delta)
      .bind(2, delta))
  }

  override def getItem(
      session: R2dbcSession,
      itemId: String): Future[Option[Long]] = {
    session.selectOne(
      session
        .createStatement("SELECT count FROM item_popularity WHERE itemid = $1")
        .bind(0, itemId)) { row =>
      row.get("count", classOf[java.lang.Long])
    }
  }

}
```
4. Add a class `ItemPopularityProjectionHandler`:

Java

src/main/java/shopping/cart/ItemPopularityProjectionHandler.java:

```
package shopping.cart;

import akka.Done;
import akka.persistence.query.typed.EventEnvelope;
import akka.projection.r2dbc.javadsl.R2dbcHandler;
import akka.projection.r2dbc.javadsl.R2dbcSession;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import shopping.cart.repository.ItemPopularityRepository;

public final class ItemPopularityProjectionHandler
    extends R2dbcHandler<EventEnvelope<ShoppingCart.Event>> { (1)
  private final Logger logger = LoggerFactory.getLogger(getClass());
  private final String slice;
  private final ItemPopularityRepository repo;

  public ItemPopularityProjectionHandler(String slice, ItemPopularityRepository repo) {
    this.slice = slice;
    this.repo = repo;
  }

  private CompletionStage<ItemPopularity> findOrNew(R2dbcSession session, String itemId) {
    return repo.findById(session, itemId)
        .thenApply(
            itemPopularity -> itemPopularity.orElseGet(() -> new ItemPopularity(itemId, 0L)));
  }

  @Override
  public CompletionStage<Done> process(
      R2dbcSession session, EventEnvelope<ShoppingCart.Event> envelope) { (2)
    ShoppingCart.Event event = envelope.event();

    switch (event) {
      case ShoppingCart.ItemAdded(var __, String itemId, int qtd) -> { (3)
        var itemPopularity = new ItemPopularity(itemId, qtd);
        var updated = repo.saveOrUpdate(session, itemPopularity);
        return updated.thenApply(
            rows -> {
              logCount(itemId, rows);
              return Done.getInstance();
            });
      }
      case ShoppingCart.CheckedOut ignored -> {
        return CompletableFuture.completedFuture(Done.getInstance());
      }
      case null, default -> {
        throw new IllegalArgumentException("Unknown event type: " + event.getClass());
      }
    }
  }

  private CompletionStage<Done> getCount(R2dbcSession session, String itemId) {
    return repo.getCount(session, itemId)
        .thenApply(
            optLong -> {
              optLong.ifPresent(aLong -> logCount(itemId, aLong));
              return Done.getInstance();
            });
  }

  private void logCount(String itemId, Long count) {
    logger.info(
        "ItemPopularityProjectionHandler({}) item popularity for '{}': [{}]",
        this.slice,
        itemId,
        count);
  }
}
```

| **1** | Extends `akka.projection.r2dbc.javadsl.R2dbcHandler`. |
| --- | --- |
| **2** | The `process` method will be handed each event/the events for processing. |
| **3** | Match events and increment or decrement the count via the `ItemPopularityRepository`, which encapsulates the database access. |

Scala

src/main/scala/shopping/cart/ItemPopularityProjectionHandler.scala:

```
package shopping.cart

import akka.Done
import akka.actor.typed.ActorSystem
import akka.persistence.query.typed.EventEnvelope
import akka.projection.r2dbc.scaladsl.{ R2dbcHandler, R2dbcSession }
import org.slf4j.LoggerFactory
import shopping.cart.repository.ItemPopularityRepository

import scala.concurrent.Future

class ItemPopularityProjectionHandler(
    slice: String,
    system: ActorSystem[_],
    repo: ItemPopularityRepository)
    extends R2dbcHandler[EventEnvelope[ShoppingCart.Event]]() { (1)

  private val logger = LoggerFactory.getLogger(getClass)
  import system.executionContext

  override def process(
      session: R2dbcSession,
      envelope: EventEnvelope[ShoppingCart.Event]): Future[Done] = { (2)
    envelope.event match { (3)
      case ShoppingCart.ItemAdded(_, itemId, quantity) =>
        repo
          .update(session, itemId, quantity)
          .flatMap(_ => logItemCount(session, itemId))

      case ShoppingCart.ItemQuantityAdjusted(
            _,
            itemId,
            newQuantity,
            oldQuantity) =>
        repo
          .update(session, itemId, newQuantity - oldQuantity)
          .flatMap(_ => logItemCount(session, itemId))

      case ShoppingCart.ItemRemoved(_, itemId, oldQuantity) =>
        repo
          .update(session, itemId, 0 - oldQuantity)
          .flatMap(_ => logItemCount(session, itemId))

      case _: ShoppingCart.CheckedOut => Future.successful(Done)
    }
  }

  private def logItemCount(
      session: R2dbcSession,
      itemId: String): Future[Done] = {

    def log(count: Long): Unit =
      logger.info(
        "ItemPopularityProjectionHandler({}) item popularity for '{}': [{}]",
        slice,
        itemId,
        count)

    repo.getItem(session, itemId).map {
      case Some(l) =>
        log(l)
        Done
      case None =>
        throw new Exception("Something wrong during querying")
    }

  }

}
```

| **1** | Extends `akka.projection.r2dbc.scaladsl.R2dbcHandler`. |
| --- | --- |
| **2** | The `process` method will be handed each event/the events for processing. |
| **3** | Match events and increment or decrement the count via the `ItemPopularityRepository`, which encapsulates the database access. |

## 2\. Create Projection

We want to connect the events from the `ShoppingCart` with the Projection. Several instances of the Projection may run on different nodes of the Akka Cluster. A numeric slice between 0 and 1023 is calculated from the entity id and assigned to all events it emits. A projection instance will be working on a specific range of slices. For example, with the default 4 projection instances, the 4 instances will process slices `0-255`, `256-511`, `512-767` and `768-1023`. Events from a specific entity will always be processed by the same projection instance so that it can build a stateful model from the events if needed.

To create the Projection:

1. Place the initialization code of the Projection in an `ItemPopularityProjection` object class:

Java

src/main/java/shopping/cart/ItemPopularityProjection.java:

```
package shopping.cart;

import akka.actor.typed.ActorSystem;
import akka.cluster.sharding.typed.ShardedDaemonProcessSettings;
import akka.cluster.sharding.typed.javadsl.ShardedDaemonProcess;
import akka.japi.Pair;
import akka.persistence.query.Offset;
import akka.persistence.query.typed.EventEnvelope;
import akka.persistence.r2dbc.query.javadsl.R2dbcReadJournal;
import akka.projection.ProjectionBehavior;
import akka.projection.ProjectionId;
import akka.projection.eventsourced.javadsl.EventSourcedProvider;
import akka.projection.javadsl.ExactlyOnceProjection;
import akka.projection.javadsl.SourceProvider;
import akka.projection.r2dbc.R2dbcProjectionSettings;
import akka.projection.r2dbc.javadsl.R2dbcProjection;
import java.util.List;
import java.util.Optional;
import shopping.cart.repository.ItemPopularityRepository;

public final class ItemPopularityProjection {

  private ItemPopularityProjection() {}

  public static void init(ActorSystem<?> system, ItemPopularityRepository repository) {

    ShardedDaemonProcess.get(system)
        .initWithContext( (1)
            ProjectionBehavior.Command.class,
            "ItemPopularityProjection",
            4,
            daemonContext -> {
              List<Pair<Integer, Integer>> sliceRanges = (2)
                  EventSourcedProvider.sliceRanges(
                      system, R2dbcReadJournal.Identifier(), daemonContext.totalProcesses());
              Pair<Integer, Integer> sliceRange = sliceRanges.get(daemonContext.processNumber());
              return ProjectionBehavior.create(createProjection(system, repository, sliceRange));
            },
            ShardedDaemonProcessSettings.create(system),
            Optional.of(ProjectionBehavior.stopMessage()));
  }

  private static ExactlyOnceProjection<Offset, EventEnvelope<ShoppingCart.Event>> createProjection(
      ActorSystem<?> system,
      ItemPopularityRepository repository,
      Pair<Integer, Integer> sliceRange) {

    int minSlice = sliceRange.first();
    int maxSlice = sliceRange.second();

    SourceProvider<Offset, EventEnvelope<ShoppingCart.Event>> sourceProvider = (3)
        EventSourcedProvider.eventsBySlices(
            system,
            R2dbcReadJournal.Identifier(), (4)
            "ShoppingCart",
            minSlice,
            maxSlice);

    String slice = "carts-" + minSlice + "-" + maxSlice;
    Optional<R2dbcProjectionSettings> settings = Optional.empty();
    return R2dbcProjection.exactlyOnce( (5)
        ProjectionId.of("ItemPopularityProjection", slice),
        settings,
        sourceProvider,
        () -> new ItemPopularityProjectionHandler(slice, repository), (6)
        system);
  }
}
```

| **1** | `ShardedDaemonProcess` manages the Projection instances. It ensures the Projection instances are always running and distributes them over the nodes in the Akka Cluster. |
| --- | --- |
| **2** | The slice ranges are calculated based on the number active Projection instances, given by `daemonContext.totalProcesses()`. Then, the specific slice range for this instance is identified by its `processNumber`. |
| **3** | The source of the Projection is `EventSourcedProvider.eventsBySlices` with the selected slice range, defined by a `minSlice` and a `maxSlice`. |
| **4** | Using the R2DBC event journal. |
| **5** | Using R2DBC for offset storage of the Projection using `exactly-once` strategy. Offset and projected model will be persisted in the same transaction. |
| **6** | Defining a Projection `Handler` factory for the handler we wrote in the beginning of this part. |

Scala

src/main/scala/shopping/cart/ItemPopularityProjection.scala:

```
package shopping.cart

import akka.actor.typed.ActorSystem
import akka.cluster.sharding.typed.ShardedDaemonProcessSettings
import akka.cluster.sharding.typed.scaladsl.ShardedDaemonProcess
import akka.persistence.query.Offset
import akka.persistence.query.typed.EventEnvelope
import akka.persistence.r2dbc.query.scaladsl.R2dbcReadJournal
import akka.projection.eventsourced.scaladsl.EventSourcedProvider
import akka.projection.r2dbc.scaladsl.R2dbcProjection
import akka.projection.scaladsl.SourceProvider
import akka.projection.{ Projection, ProjectionBehavior, ProjectionId }
import shopping.cart.repository.ItemPopularityRepository

object ItemPopularityProjection {
  def init(
      system: ActorSystem[_],
      repository: ItemPopularityRepository): Unit = {

    def sourceProvider(sliceRange: Range)
        : SourceProvider[Offset, EventEnvelope[ShoppingCart.Event]] =
      EventSourcedProvider (1)
        .eventsBySlices[ShoppingCart.Event](
          system,
          readJournalPluginId = R2dbcReadJournal.Identifier, (2)
          "ShoppingCart",
          sliceRange.min,
          sliceRange.max)

    def projection(
        sliceRange: Range): Projection[EventEnvelope[ShoppingCart.Event]] = {
      val minSlice = sliceRange.min
      val maxSlice = sliceRange.max
      val projectionId =
        ProjectionId("ItemPopularityProjection", s"carts-$minSlice-$maxSlice")

      R2dbcProjection.exactlyOnce( (3)
        projectionId,
        settings = None,
        sourceProvider(sliceRange),
        handler = () => (4)
          new ItemPopularityProjectionHandler(
            s"carts-$minSlice-$maxSlice",
            system,
            repository))(system)
    }

    ShardedDaemonProcess(system).initWithContext( (5)
      name = "ItemPopularityProjection",
      initialNumberOfInstances = 4,
      behaviorFactory = { daemonContext =>
        val sliceRanges = (6)
          EventSourcedProvider.sliceRanges(
            system,
            R2dbcReadJournal.Identifier,
            daemonContext.totalProcesses)
        val sliceRange = sliceRanges(daemonContext.processNumber)
        ProjectionBehavior(projection(sliceRange))
      },
      ShardedDaemonProcessSettings(system),
      stopMessage = ProjectionBehavior.Stop)
  }
}
```

| **1** | The source of the Projection is `EventSourcedProvider.eventsBySlices` with the selected slice range, defined by a `minSlice` and a `maxSlice`. |
| --- | --- |
| **2** | Using the R2DBC event journal. |
| **3** | Using R2DBC for offset storage of the Projection using `exactly-once` strategy. Offset and projected model will be persisted in the same transaction. |
| **4** | Defining a Projection `Handler` factory for the handler we wrote in the beginning of this part. |
| **5** | `ShardedDaemonProcess` manages the Projection instances. It ensures the Projection instances are always running and distributes them over the nodes in the Akka Cluster. |
| **6** | The slice ranges are calculated based on the number active Projection instances, given by `daemonContext.totalProcesses()`. Then, the specific slice range for this instance is identified by its `processNumber`. |
2. Call the `ItemPopularityProjection.init` from `Main`:

Java

src/main/java/shopping/cart/Main.java

```
ItemPopularityRepository itemPopularityRepository = new ItemPopularityRepositoryImpl();
ItemPopularityProjection.init(system, itemPopularityRepository); (1)
```

| **1** | Initialize the Projection passing an instance of the repository implementation. |
| --- | --- |

Scala

src/main/scala/shopping/cart/Main.scala

```
val itemPopularityRepository = new ItemPopularityRepositoryImpl()
ItemPopularityProjection.init(system, itemPopularityRepository) (1)
```

| **1** | Initialize the Projection passing an instance of the repository implementation. |
| --- | --- |

## 3\. Query

To expose the item popularity to the outside of the service we can add an operation in the gRPC `ShoppingCartService`. Follow these steps:

1. Add a new `GetItemPopularity` operation to the `shopping_cart_service.proto`:

src/main/protobuf/shoppingcart/shopping\_cart\_service.proto

```
service ShoppingCartService { (1)
  rpc GetItemPopularity(GetItemPopularityRequest) returns (GetItemPopularityResponse) {}
}

message GetItemPopularityRequest {
  string item_id = 1;
}

message GetItemPopularityResponse {
  string item_id = 1;
  int64 popularity_count = 2;
}
```
2. Generate code from the new Protobuf specification by compiling the project:

Java

```
mvn compile
```

Scala

```
sbt compile
```
3. Add the `getItemPopularity` method to the `ShoppingCartServiceImpl`:

For this you have to add the `ItemPopularityRepository` as a constructor parameter to the `ShoppingCartServiceImpl`. The `ItemPopularityRepository` instance is created in `Main.scala` `Main.java` so pass that instance as parameter to `ShoppingCartServiceImpl`.

Java

src/main/java/shopping/cart/ShoppingCartServiceImpl.java

```
private final ItemPopularityRepository repository;

private final ActorSystem<?> sys;

public ShoppingCartServiceImpl(
    ActorSystem<?> system, ItemPopularityRepository repository) { (1)

  this.sys = system;
  this.repository = repository;
  timeout = system.settings().config().getDuration("shopping-cart-service.ask-timeout");
  sharding = ClusterSharding.get(system);
}

@Override
public CompletionStage<GetItemPopularityResponse> getItemPopularity(GetItemPopularityRequest in) {

  CompletionStage<Optional<ItemPopularity>> itemPopularity =
      R2dbcSession.withSession(
          sys, (2)
          (session) -> repository.findById(session, in.getItemId()) (3)
          );

  return itemPopularity.thenApply(
      popularity -> {
        long count = popularity.map(ItemPopularity::count).orElse(0L);
        return GetItemPopularityResponse.newBuilder().setPopularityCount(count).build();
      });
}
```

| **1** | Add the `ItemPopularityRepository` to the service implementation constructor. |
| --- | --- |
| **2** | Provide the `ActorSystem` to build a `R2dbcSession`. |
| **3** | Implement `getItemPopularity` by calling the repository to find the projected model by id and use the result to build the response. |

Scala

src/main/scala/shopping/cart/ShoppingCartServiceImpl.scala

```
class ShoppingCartServiceImpl(
    system: ActorSystem[_],
    itemPopularityRepository: ItemPopularityRepository) (1)
    extends proto.ShoppingCartService {

  override def getItemPopularity(in: proto.GetItemPopularityRequest)
      : Future[proto.GetItemPopularityResponse] = {
    R2dbcSession
      .withSession(system) { session => (2)
        itemPopularityRepository.getItem(session, in.itemId) (3)
      }
      .map {
        case Some(count) =>
          proto.GetItemPopularityResponse(in.itemId, count)
        case None =>
          proto.GetItemPopularityResponse(in.itemId, 0L)
      }
  }
}
```

| **1** | Add the `ItemPopularityRepository` to the service implementation constructor. |
| --- | --- |
| **2** | Provide the `ActorSystem` to build a `R2dbcSession`. |
| **3** | Implement `getItemPopularity` by calling the repository to find the projected model by id and use the result to build the response. |

|  | While using R2DBC, calls to the repository are asynchronous and, therefore, results are wrapped with a `CompletableStage`. `Future`. |
| --- | --- |

## 4\. Run locally

Try your solution by running locally:

1. Start the docker containers, unless they are already running:

```
docker compose up -d
```
2. Create the item popularity table by creating a `ddl-scripts/create_user_tables.sql` file and adding the SQL statement below.

```
CREATE TABLE IF NOT EXISTS public.item_popularity (
    itemid VARCHAR(255) NOT NULL,
    count BIGINT NOT NULL,
    PRIMARY KEY (itemid));
```
3. Load the file into Postgres:

```
docker exec -i postgres-db psql -U shopping-cart -t < ddl-scripts/create_user_tables.sql
```
4. Run the service with:

```
# make sure to compile before running exec:exec
mvn compile exec:exec -DAPP_CONFIG=local1.conf
```

```
sbt -Dconfig.resource=local1.conf run
```

### 4\.1\. Exercise the service

Use `[grpcurl](https://github.com/fullstorydev/grpcurl)` to exercise the service:

1. Add 5 hoodies to a cart:

```
grpcurl -d '{"cartId":"cart3", "itemId":"hoodie", "quantity":5}' -plaintext 127.0.0.1:8101 shoppingcart.ShoppingCartService.AddItem
```
2. Check the popularity of the item:

```
grpcurl -d '{"itemId":"hoodie"}' -plaintext 127.0.0.1:8101 shoppingcart.ShoppingCartService.GetItemPopularity
```
3. Add 2 hoodies to another cart:

```
grpcurl -d '{"cartId":"cart5", "itemId":"hoodie", "quantity":2}' -plaintext 127.0.0.1:8101 shoppingcart.ShoppingCartService.AddItem
```
4. Check that the popularity count increased to 7:

```
grpcurl -d '{"itemId":"hoodie"}' -plaintext 127.0.0.1:8101 shoppingcart.ShoppingCartService.GetItemPopularity
```

### 4\.2\. Stop the service

When finished, stop the service with `ctrl-c`. Leave PostgreSQL running for the next set of steps, or stop it with:

```
docker compose stop
```

## Learn more

- [CQRS concepts](../concepts/cqrs.html).
- [Akka Projection reference documentation ![new tab](../_images/new-tab.svg)](https://doc.akka.io/libraries/akka-projection/current/).
- [Akka Sharded Daemon Process reference documentation ![new tab](../_images/new-tab.svg)](https://doc.akka.io/libraries/akka-core/current/typed/cluster-sharded-daemon-process.html).
- [Use Cassandra instead of PostgreSQL](../how-to/cassandra-alternative.html)

## Code Examples

### Example 1: 1. Process events in a Projection

```java
package shopping.cart.repository;

import akka.projection.r2dbc.javadsl.R2dbcSession; (1)
import java.util.Optional;
import java.util.concurrent.CompletionStage;
import shopping.cart.ItemPopularity;

public interface ItemPopularityRepository {

  CompletionStage<Long> saveOrUpdate(R2dbcSession session, ItemPopularity itemPopularity);

  CompletionStage<Optional<ItemPopularity>> findById(R2dbcSession session, String id);

  CompletionStage<Optional<Long>> getCount(R2dbcSession session, String id);
}
```

### Example 2: 1. Process events in a Projection

```scala
// tag::trait[]
package shopping.cart.repository

import akka.projection.r2dbc.scaladsl.R2dbcSession (1)

import scala.concurrent.Future

trait ItemPopularityRepository {
  def update(session: R2dbcSession, itemId: String, delta: Int): Future[Long]
  def getItem(session: R2dbcSession, itemId: String): Future[Option[Long]]
}
// end::trait[]

// tag::impl[]
class ItemPopularityRepositoryImpl() extends ItemPopularityRepository {

  override def update(
      session: R2dbcSession,
      itemId: String,
      delta: Int): Future[Long] = {
    session.updateOne(session
      .createStatement(
        "INSERT INTO item_popularity (itemid, count) VALUES ($1, $2) " +
        "ON CONFLICT(itemid) DO UPDATE SET count = item_popularity.count + $3")
      .bind(0, itemId)
      .bind(1, delta)
      .bind(2, delta))
  }

  override def getItem(
      session: R2dbcSession,
      itemId: String): Future[Option[Long]] = {
    session.selectOne(
      session
        .createStatement("SELECT count FROM item_popularity WHERE itemid = $1")
        .bind(0, itemId)) { row =>
      row.get("count", classOf[java.lang.Long])
    }
  }

}
// end::impl[]
```

### Example 3: 1. Process events in a Projection

```java
package shopping.cart;

public record ItemPopularity(String itemId, long count) {

  public ItemPopularity() {
    // null version means the entity is not on the DB
    this("", 0);
  }

  public ItemPopularity changeCount(long delta) {
    return new ItemPopularity(itemId, count + delta);
  }
}
```

### Example 4: 1. Process events in a Projection

```java
package shopping.cart.repository;

import akka.projection.r2dbc.javadsl.R2dbcSession;
import java.util.Optional;
import java.util.concurrent.CompletionStage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import shopping.cart.ItemPopularity;

public class ItemPopularityRepositoryImpl implements ItemPopularityRepository {

  private final Logger logger = LoggerFactory.getLogger(getClass());

  @Override
  public CompletionStage<Long> saveOrUpdate(R2dbcSession session, ItemPopularity itemPopularity) {
    return session.updateOne(
        session
            .createStatement(
                "INSERT INTO item_popularity (itemid, count) VALUES ($1, $2) "
                    + "ON CONFLICT (itemid) DO UPDATE SET count = item_popularity.count + $3")
            .bind(0, itemPopularity.itemId())
            .bind(1, itemPopularity.count())
            .bind(2, itemPopularity.count()));
  }

  @Override
  public CompletionStage<Optional<ItemPopularity>> findById(R2dbcSession session, String id) {
    return session.selectOne(
        session
            .createStatement("SELECT itemid, count FROM item_popularity WHERE itemid = $1")
            .bind(0, id),
        row -> new ItemPopularity(row.get("itemid", String.class), row.get("count", Long.class)));
  }

  @Override
  public CompletionStage<Optional<Long>> getCount(R2dbcSession session, String id) {
    return session.selectOne(
        session.createStatement("SELECT count FROM item_popularity WHERE itemid = $1").bind(0, id),
        row -> row.get("count", Long.class));
  }
}
```

### Example 5: 1. Process events in a Projection

```scala
class ItemPopularityRepositoryImpl() extends ItemPopularityRepository {

  override def update(
      session: R2dbcSession,
      itemId: String,
      delta: Int): Future[Long] = {
    session.updateOne(session
      .createStatement(
        "INSERT INTO item_popularity (itemid, count) VALUES ($1, $2) " +
        "ON CONFLICT(itemid) DO UPDATE SET count = item_popularity.count + $3")
      .bind(0, itemId)
      .bind(1, delta)
      .bind(2, delta))
  }

  override def getItem(
      session: R2dbcSession,
      itemId: String): Future[Option[Long]] = {
    session.selectOne(
      session
        .createStatement("SELECT count FROM item_popularity WHERE itemid = $1")
        .bind(0, itemId)) { row =>
      row.get("count", classOf[java.lang.Long])
    }
  }

}
```

### Example 6: 1. Process events in a Projection

```java
package shopping.cart;

import akka.Done;
import akka.persistence.query.typed.EventEnvelope;
import akka.projection.r2dbc.javadsl.R2dbcHandler;
import akka.projection.r2dbc.javadsl.R2dbcSession;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import shopping.cart.repository.ItemPopularityRepository;

public final class ItemPopularityProjectionHandler
    extends R2dbcHandler<EventEnvelope<ShoppingCart.Event>> { (1)
  private final Logger logger = LoggerFactory.getLogger(getClass());
  private final String slice;
  private final ItemPopularityRepository repo;

  public ItemPopularityProjectionHandler(String slice, ItemPopularityRepository repo) {
    this.slice = slice;
    this.repo = repo;
  }

  private CompletionStage<ItemPopularity> findOrNew(R2dbcSession session, String itemId) {
    return repo.findById(session, itemId)
        .thenApply(
            itemPopularity -> itemPopularity.orElseGet(() -> new ItemPopularity(itemId, 0L)));
  }

  @Override
  public CompletionStage<Done> process(
      R2dbcSession session, EventEnvelope<ShoppingCart.Event> envelope) { (2)
    ShoppingCart.Event event = envelope.event();

    switch (event) {
      case ShoppingCart.ItemAdded(var __, String itemId, int qtd) -> { (3)
        var itemPopularity = new ItemPopularity(itemId, qtd);
        var updated = repo.saveOrUpdate(session, itemPopularity);
        return updated.thenApply(
            rows -> {
              logCount(itemId, rows);
              return Done.getInstance();
            });
      }
      case ShoppingCart.CheckedOut ignored -> {
        return CompletableFuture.completedFuture(Done.getInstance());
      }
      case null, default -> {
        throw new IllegalArgumentException("Unknown event type: " + event.getClass());
      }
    }
  }

  private CompletionStage<Done> getCount(R2dbcSession session, String itemId) {
    return repo.getCount(session, itemId)
        .thenApply(
            optLong -> {
              optLong.ifPresent(aLong -> logCount(itemId, aLong));
              return Done.getInstance();
            });
  }

  private void logCount(String itemId, Long count) {
    logger.info(
        "ItemPopularityProjectionHandler({}) item popularity for '{}': [{}]",
        this.slice,
        itemId,
        count);
  }
}
```

### Example 7: 1. Process events in a Projection

```scala
package shopping.cart

import akka.Done
import akka.actor.typed.ActorSystem
import akka.persistence.query.typed.EventEnvelope
import akka.projection.r2dbc.scaladsl.{ R2dbcHandler, R2dbcSession }
import org.slf4j.LoggerFactory
import shopping.cart.repository.ItemPopularityRepository

import scala.concurrent.Future

class ItemPopularityProjectionHandler(
    slice: String,
    system: ActorSystem[_],
    repo: ItemPopularityRepository)
    extends R2dbcHandler[EventEnvelope[ShoppingCart.Event]]() { (1)

  private val logger = LoggerFactory.getLogger(getClass)
  import system.executionContext

  override def process(
      session: R2dbcSession,
      envelope: EventEnvelope[ShoppingCart.Event]): Future[Done] = { (2)
    envelope.event match { (3)
      case ShoppingCart.ItemAdded(_, itemId, quantity) =>
        repo
          .update(session, itemId, quantity)
          .flatMap(_ => logItemCount(session, itemId))

      case ShoppingCart.ItemQuantityAdjusted(
            _,
            itemId,
            newQuantity,
            oldQuantity) =>
        repo
          .update(session, itemId, newQuantity - oldQuantity)
          .flatMap(_ => logItemCount(session, itemId))

      case ShoppingCart.ItemRemoved(_, itemId, oldQuantity) =>
        repo
          .update(session, itemId, 0 - oldQuantity)
          .flatMap(_ => logItemCount(session, itemId))

      case _: ShoppingCart.CheckedOut => Future.successful(Done)
    }
  }

  private def logItemCount(
      session: R2dbcSession,
      itemId: String): Future[Done] = {

    def log(count: Long): Unit =
      logger.info(
        "ItemPopularityProjectionHandler({}) item popularity for '{}': [{}]",
        slice,
        itemId,
        count)

    repo.getItem(session, itemId).map {
      case Some(l) =>
        log(l)
        Done
      case None =>
        throw new Exception("Something wrong during querying")
    }

  }

}
```

### Example 8: 2. Create Projection

```java
package shopping.cart;

import akka.actor.typed.ActorSystem;
import akka.cluster.sharding.typed.ShardedDaemonProcessSettings;
import akka.cluster.sharding.typed.javadsl.ShardedDaemonProcess;
import akka.japi.Pair;
import akka.persistence.query.Offset;
import akka.persistence.query.typed.EventEnvelope;
import akka.persistence.r2dbc.query.javadsl.R2dbcReadJournal;
import akka.projection.ProjectionBehavior;
import akka.projection.ProjectionId;
import akka.projection.eventsourced.javadsl.EventSourcedProvider;
import akka.projection.javadsl.ExactlyOnceProjection;
import akka.projection.javadsl.SourceProvider;
import akka.projection.r2dbc.R2dbcProjectionSettings;
import akka.projection.r2dbc.javadsl.R2dbcProjection;
import java.util.List;
import java.util.Optional;
import shopping.cart.repository.ItemPopularityRepository;

public final class ItemPopularityProjection {

  private ItemPopularityProjection() {}

  public static void init(ActorSystem<?> system, ItemPopularityRepository repository) {

    ShardedDaemonProcess.get(system)
        .initWithContext( (1)
            ProjectionBehavior.Command.class,
            "ItemPopularityProjection",
            4,
            daemonContext -> {
              List<Pair<Integer, Integer>> sliceRanges = (2)
                  EventSourcedProvider.sliceRanges(
                      system, R2dbcReadJournal.Identifier(), daemonContext.totalProcesses());
              Pair<Integer, Integer> sliceRange = sliceRanges.get(daemonContext.processNumber());
              return ProjectionBehavior.create(createProjection(system, repository, sliceRange));
            },
            ShardedDaemonProcessSettings.create(system),
            Optional.of(ProjectionBehavior.stopMessage()));
  }


  private static ExactlyOnceProjection<Offset, EventEnvelope<ShoppingCart.Event>> createProjection(
      ActorSystem<?> system,
      ItemPopularityRepository repository,
      Pair<Integer, Integer> sliceRange) {

    int minSlice = sliceRange.first();
    int maxSlice = sliceRange.second();

    SourceProvider<Offset, EventEnvelope<ShoppingCart.Event>> sourceProvider = (3)
        EventSourcedProvider.eventsBySlices(
            system,
            R2dbcReadJournal.Identifier(), (4)
            "ShoppingCart",
            minSlice,
            maxSlice);

    String slice = "carts-" + minSlice + "-" + maxSlice;
    Optional<R2dbcProjectionSettings> settings = Optional.empty();
    return R2dbcProjection.exactlyOnce( (5)
        ProjectionId.of("ItemPopularityProjection", slice),
        settings,
        sourceProvider,
        () -> new ItemPopularityProjectionHandler(slice, repository), (6)
        system);
  }
}
```

### Example 9: 2. Create Projection

```scala
package shopping.cart

import akka.actor.typed.ActorSystem
import akka.cluster.sharding.typed.ShardedDaemonProcessSettings
import akka.cluster.sharding.typed.scaladsl.ShardedDaemonProcess
import akka.persistence.query.Offset
import akka.persistence.query.typed.EventEnvelope
import akka.persistence.r2dbc.query.scaladsl.R2dbcReadJournal
import akka.projection.eventsourced.scaladsl.EventSourcedProvider
import akka.projection.r2dbc.scaladsl.R2dbcProjection
import akka.projection.scaladsl.SourceProvider
import akka.projection.{ Projection, ProjectionBehavior, ProjectionId }
import shopping.cart.repository.ItemPopularityRepository

object ItemPopularityProjection {
  def init(
      system: ActorSystem[_],
      repository: ItemPopularityRepository): Unit = {

    def sourceProvider(sliceRange: Range)
        : SourceProvider[Offset, EventEnvelope[ShoppingCart.Event]] =
      EventSourcedProvider (1)
        .eventsBySlices[ShoppingCart.Event](
          system,
          readJournalPluginId = R2dbcReadJournal.Identifier, (2)
          "ShoppingCart",
          sliceRange.min,
          sliceRange.max)

    def projection(
        sliceRange: Range): Projection[EventEnvelope[ShoppingCart.Event]] = {
      val minSlice = sliceRange.min
      val maxSlice = sliceRange.max
      val projectionId =
        ProjectionId("ItemPopularityProjection", s"carts-$minSlice-$maxSlice")

      R2dbcProjection.exactlyOnce( (3)
        projectionId,
        settings = None,
        sourceProvider(sliceRange),
        handler = () => (4)
          new ItemPopularityProjectionHandler(
            s"carts-$minSlice-$maxSlice",
            system,
            repository))(system)
    }

    ShardedDaemonProcess(system).initWithContext( (5)
      name = "ItemPopularityProjection",
      initialNumberOfInstances = 4,
      behaviorFactory = { daemonContext =>
        val sliceRanges = (6)
          EventSourcedProvider.sliceRanges(
            system,
            R2dbcReadJournal.Identifier,
            daemonContext.totalProcesses)
        val sliceRange = sliceRanges(daemonContext.processNumber)
        ProjectionBehavior(projection(sliceRange))
      },
      ShardedDaemonProcessSettings(system),
      stopMessage = ProjectionBehavior.Stop)
  }
}
```

### Example 10: 2. Create Projection

```java
ItemPopularityRepository itemPopularityRepository = new ItemPopularityRepositoryImpl();
ItemPopularityProjection.init(system, itemPopularityRepository); (1)
```

### Example 11: 2. Create Projection

```scala
val itemPopularityRepository = new ItemPopularityRepositoryImpl()
ItemPopularityProjection.init(system, itemPopularityRepository) (1)
```

### Example 12: 3. Query

```protobuf
service ShoppingCartService { (1)
  rpc GetItemPopularity(GetItemPopularityRequest) returns (GetItemPopularityResponse) {}
}

message GetItemPopularityRequest {
  string item_id = 1;
}

message GetItemPopularityResponse {
  string item_id = 1;
  int64 popularity_count = 2;
}
```

### Example 13: 3. Query

```shell
mvn compile
```

### Example 14: 3. Query

```shell
sbt compile
```

### Example 15: 3. Query

```java
private final ItemPopularityRepository repository;

private final ActorSystem<?> sys;

public ShoppingCartServiceImpl(
    ActorSystem<?> system, ItemPopularityRepository repository) { (1)

  this.sys = system;
  this.repository = repository;
  timeout = system.settings().config().getDuration("shopping-cart-service.ask-timeout");
  sharding = ClusterSharding.get(system);
}

@Override
public CompletionStage<GetItemPopularityResponse> getItemPopularity(GetItemPopularityRequest in) {

  CompletionStage<Optional<ItemPopularity>> itemPopularity =
      R2dbcSession.withSession(
          sys, (2)
          (session) -> repository.findById(session, in.getItemId()) (3)
          );

  return itemPopularity.thenApply(
      popularity -> {
        long count = popularity.map(ItemPopularity::count).orElse(0L);
        return GetItemPopularityResponse.newBuilder().setPopularityCount(count).build();
      });
}
```

### Example 16: 3. Query

```scala
class ShoppingCartServiceImpl(
    system: ActorSystem[_],
    itemPopularityRepository: ItemPopularityRepository) (1)
    extends proto.ShoppingCartService {

  override def getItemPopularity(in: proto.GetItemPopularityRequest)
      : Future[proto.GetItemPopularityResponse] = {
    R2dbcSession
      .withSession(system) { session => (2)
        itemPopularityRepository.getItem(session, in.itemId) (3)
      }
      .map {
        case Some(count) =>
          proto.GetItemPopularityResponse(in.itemId, count)
        case None =>
          proto.GetItemPopularityResponse(in.itemId, 0L)
      }
  }
}
```

### Example 17: 4. Run locally

```shell
docker compose up -d
```

### Example 18: 4. Run locally

```sql
CREATE TABLE IF NOT EXISTS public.item_popularity (
    itemid VARCHAR(255) NOT NULL,
    count BIGINT NOT NULL,
    PRIMARY KEY (itemid));
```

### Example 19: 4. Run locally

```shell
docker exec -i postgres-db psql -U shopping-cart -t < ddl-scripts/create_user_tables.sql
```

### Example 20: 4. Run locally

```shell
# make sure to compile before running exec:exec
mvn compile exec:exec -DAPP_CONFIG=local1.conf
```

### Example 21: 4. Run locally

```shell
sbt -Dconfig.resource=local1.conf run
```

### Example 22: 4.1. Exercise the service

```shell
grpcurl -d '{"cartId":"cart3", "itemId":"hoodie", "quantity":5}' -plaintext 127.0.0.1:8101 shoppingcart.ShoppingCartService.AddItem
```

### Example 23: 4.1. Exercise the service

```shell
grpcurl -d '{"itemId":"hoodie"}' -plaintext 127.0.0.1:8101 shoppingcart.ShoppingCartService.GetItemPopularity
```

### Example 24: 4.1. Exercise the service

```shell
grpcurl -d '{"cartId":"cart5", "itemId":"hoodie", "quantity":2}' -plaintext 127.0.0.1:8101 shoppingcart.ShoppingCartService.AddItem
```

### Example 25: 4.1. Exercise the service

```shell
grpcurl -d '{"itemId":"hoodie"}' -plaintext 127.0.0.1:8101 shoppingcart.ShoppingCartService.GetItemPopularity
```

### Example 26: 4.2. Stop the service

```shell
docker compose stop
```

## Related Pages (Internal Links)

- https://doc.akka.io/libraries/akka-core/current/typed/cluster-sharded-daemon-process.html
- https://doc.akka.io/libraries/akka-projection/current/
- https://doc.akka.io/libraries/guide/concepts/cqrs.html
- https://doc.akka.io/libraries/guide/how-to/cassandra-alternative.html
- https://doc.akka.io/libraries/guide/microservices-tutorial/_attachments/3-shopping-cart-event-sourced-complete-java.zip
- https://doc.akka.io/libraries/guide/microservices-tutorial/_attachments/3-shopping-cart-event-sourced-complete-scala.zip
- https://doc.akka.io/libraries/guide/microservices-tutorial/_attachments/4-shopping-cart-projection-java.zip
- https://doc.akka.io/libraries/guide/microservices-tutorial/_attachments/4-shopping-cart-projection-scala.zip
- https://doc.akka.io/libraries/guide/microservices-tutorial/overview.html

---
*Source: [https://doc.akka.io/libraries/guide/microservices-tutorial/projection-query.html](https://doc.akka.io/libraries/guide/microservices-tutorial/projection-query.html)*