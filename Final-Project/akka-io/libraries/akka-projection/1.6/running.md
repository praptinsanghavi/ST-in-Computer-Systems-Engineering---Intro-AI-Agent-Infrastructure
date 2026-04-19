---
description: Akka Projection.
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:30:25Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-projection/current/running.html
title: Running a Projection • Akka Projection
---

# Running a Projection • Akka Projection

> **Summary:** Akka Projection.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Running a Projection

Once you have decided how you want to build your projection, the next step is to run it. Typically, you run it in a distributed fashion in order to spread the load over the different nodes in an Akka Cluster. However, it’s also possible to run it as a single instance (when not clustered) or as single instance in a Cluster Singleton.

## Dependencies

The Akka dependencies are available from Akka’s library repository. To access them there, you need to configure the URL for this repository.

sbt
```
resolvers += "Akka library repository".at("https://repo.akka.io/maven")

```
Maven
```
<project&gt
  ...
  <repositories>
    <repository>
      <id>akka-repository</id>
      <name>Akka library repository</name>
      <url>https://repo.akka.io/maven</url>
    </repository>
  </repositories&gt
</project>

```
Gradle
```
repositories {
    mavenCentral()
    maven {
        url "https://repo.akka.io/maven"
    }
}

```

To distribute the projection over the cluster we recommend the use of [ShardedDaemonProcess](https://doc.akka.io/libraries/akka-core/current/typed/cluster-sharded-daemon-process.html). Add the following dependency in your project if not yet using Akka Cluster Sharding:

sbt
```
libraryDependencies += "com.typesafe.akka" %% "akka-cluster-sharding-typed" % "2.10.13"
```
Maven
```
<properties>
  <scala.binary.version>2.13</scala.binary.version>
</properties>
<dependencies&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-cluster-sharding-typed_${scala.binary.version}</artifactId>
    <version>2.10.13</version>
  </dependency&gt
</dependencies>
```
Gradle
```
def versions = [
  ScalaBinary: "2.13"
]
dependencies {
  implementation "com.typesafe.akka:akka-cluster-sharding-typed_${versions.ScalaBinary}:2.10.13"
}
```

Akka Projections require Akka 2\.10\.13 or later, see [Akka version](overview.html#akka-version).

For more information on using Akka Cluster consult Akka’s reference documentation on [Akka Cluster](https://doc.akka.io/libraries/akka-core/current/typed/index-cluster.html) and [Akka Cluster Sharding](https://doc.akka.io/libraries/akka-core/current/typed/cluster-sharding.html).

## Running with Sharded Daemon Process

The Sharded Daemon Process can be used to distribute `n` instances of a given Projection across the cluster. Therefore, it’s important that each Projection instance consumes a subset of the stream of envelopes.

How the subset is created depends on the kind of source we consume. If it’s an Alpakka Kafka source, this is done by Kafka consumer groups. When consuming from Akka Persistence Journal, the events must be partitioned by tagging them as demonstrated in the example below, or by the built\-in slices in [Projections R2DBC](r2dbc.html#slices).

### Tagging Events in EventSourcedBehavior

Before we can consume the events, the `EventSourcedBehavior` must tag the events with a slice number.

Scala

```
[source](https://github.com/akka/akka-projection/tree/master/examples/src/test/scala/docs/eventsourced/ShoppingCart.scala#L22-L26 "Go to snippet source")import akka.actor.typed.ActorSystem
import akka.cluster.sharding.typed.scaladsl.ClusterSharding
import akka.cluster.sharding.typed.scaladsl.Entity
import akka.cluster.sharding.typed.scaladsl.EntityTypeKey

val tags = Vector.tabulate(5)(i => s"carts-$i")
val EntityKey: EntityTypeKey[Command] = EntityTypeKey[Command]("ShoppingCart")

def init(system: ActorSystem[_]): Unit = {
  ClusterSharding(system).init(Entity(EntityKey) { entityContext =>
    val i = math.abs(entityContext.entityId.hashCode % tags.size)
    val selectedTag = tags(i)
    ShoppingCart(entityContext.entityId, selectedTag)
  }.withRole("write-model"))
}

def apply(cartId: String, projectionTag: String): Behavior[Command] = {
  EventSourcedBehavior
    .withEnforcedReplies[Command, Event, State](
      PersistenceId(EntityKey.name, cartId),
      State.empty,
      (state, command) =>
        //The shopping cart behavior changes if it's checked out or not.
        // The commands are handled differently for each case.
        if (state.isCheckedOut) checkedOutShoppingCart(cartId, state, command)
        else openShoppingCart(cartId, state, command),
      (state, event) => handleEvent(state, event))
    .withTagger(_ => Set(projectionTag))
    .withRetention(RetentionCriteria.snapshotEvery(numberOfEvents = 100))
    .onPersistFailure(SupervisorStrategy.restartWithBackoff(200.millis, 5.seconds, 0.1))
}
```

Java

```
[source](https://github.com/akka/akka-projection/tree/master/examples/src/test/java/jdocs/eventsourced/ShoppingCart.java#L308-L311 "Go to snippet source")public static final List<String> tags =
    Collections.unmodifiableList(
        Arrays.asList("carts-0", "carts-1", "carts-2", "carts-3", "carts-4"));

@Override
public Set<String> tagsFor(Event event) {
  int n = Math.abs(cartId.hashCode() % tags.size());
  String selectedTag = tags.get(n);
  return Collections.singleton(selectedTag);
}

```

In the above example, we created a `Vector[String]``List<String>` of tags from *carts\-0* to *carts\-4*. Each entity instance will tag its events using one of those tags. The tag is selected based on the modulo of the entity id’s hash code (stable identifier) and the total number of tags. As a matter of fact, this will create a journal sliced with different tags (ie: from *carts\-0* to *carts\-4*). Note the `.withTagger` in the initialization of the `EventSourcedBehavior`.

The number of tags should be more than the number of nodes that you want to distribute the load over. It’s not easy to change this afterwards without system downtime. Fewer tags than the number of nodes will result in not hosting a Projection instance on some nodes. More tags than the number of nodes means that each node is hosting more than one Projection instance, which is fine. It’s good to start with more tags than nodes to have some room for scaling out to more nodes later if needed. As a rule of thumb, the number of tags should be a factor of ten greater than the planned maximum number of cluster nodes. It doesn’t have to be exact.

Note
When using slices with [Projections R2DBC](r2dbc.html#slices) it is possible to dynamically change the number of projection instances at runtime.

We will use those tags to query the journal and create as many Projections instances, and distribute them in the cluster.

Warning
When using [Akka Persistence Cassandra plugin](https://doc.akka.io/libraries/akka-persistence-cassandra/current/) you should not use too many tags for each event. Each tag will result in a copy of the event in a separate table and that can impact write performance. Typically, you would use 1 tag per event as illustrated here. Additional filtering of events can be done in the Projection handler if it doesn’t have to act on certain events. The [JDBC plugin](https://doc.akka.io/libraries/akka-persistence-jdbc/current/) don’t have this constraint.

See also the [Akka reference documentation for tagging](https://doc.akka.io/libraries/akka-core/current/typed/persistence.html#tagging).

### Event Sourced Provider per tag

We can use the [EventSourcedProvider](eventsourced.html) to consume the `ShoppingCart` events.

Scala

```
[source](https://github.com/akka/akka-projection/tree/master/examples/src/test/scala/docs/cassandra/CassandraProjectionDocExample.scala#L19-L22 "Go to snippet source")import akka.persistence.cassandra.query.scaladsl.CassandraReadJournal
import akka.projection.eventsourced.scaladsl.EventSourcedProvider
import docs.eventsourced.ShoppingCart

def sourceProvider(tag: String) =
  EventSourcedProvider
    .eventsByTag[ShoppingCart.Event](
      system = system,
      readJournalPluginId = CassandraReadJournal.Identifier,
      tag = tag)
```

Java

```
[source](https://github.com/akka/akka-projection/tree/master/examples/src/test/java/jdocs/cassandra/CassandraProjectionDocExample.java#L32-L37 "Go to snippet source")import akka.persistence.cassandra.query.javadsl.CassandraReadJournal;
import akka.persistence.query.Offset;
import akka.projection.javadsl.SourceProvider;
import akka.projection.eventsourced.javadsl.EventSourcedProvider;
import akka.projection.eventsourced.EventEnvelope;

SourceProvider<Offset, EventEnvelope<ShoppingCart.Event>> sourceProvider(String tag) {
  return EventSourcedProvider.eventsByTag(system, CassandraReadJournal.Identifier(), tag);
}
```

Note that we define a method that builds a new `SourceProvider` for each passed `tag`.

### Building the Projection instances

Next we create a method to return Projection instances. Again, we pass a tag that is used to initialize the `SourceProvider` and as the key in `ProjectionId`.

Scala

```
[source](https://github.com/akka/akka-projection/tree/master/examples/src/test/scala/docs/cassandra/CassandraProjectionDocExample.scala#L26-L28 "Go to snippet source")import akka.projection.ProjectionId
import akka.projection.cassandra.scaladsl.CassandraProjection

def projection(tag: String) =
  CassandraProjection
    .atLeastOnce(
      projectionId = ProjectionId("shopping-carts", tag),
      sourceProvider(tag),
      handler = () => new ShoppingCartHandler)
    .withSaveOffset(100, 500.millis)
```

Java

```
[source](https://github.com/akka/akka-projection/tree/master/examples/src/test/java/jdocs/cassandra/CassandraProjectionDocExample.java#L41-L44 "Go to snippet source")import akka.projection.cassandra.javadsl.CassandraProjection;
import akka.projection.Projection;
import akka.projection.ProjectionId;

int saveOffsetAfterEnvelopes = 100;
Duration saveOffsetAfterDuration = Duration.ofMillis(500);

Projection<EventEnvelope<ShoppingCart.Event>> projection(String tag) {
  return CassandraProjection.atLeastOnce(
          ProjectionId.of("shopping-carts", tag), sourceProvider(tag), ShoppingCartHandler::new)
      .withSaveOffset(saveOffsetAfterEnvelopes, saveOffsetAfterDuration);
}
```

### Initializing the Sharded Daemon

Once we have the tags, the `SourceProvider` and the `Projection` of our choice, we can glue all the pieces together using the Sharded Daemon Process and let it be distributed across the cluster.

Scala

```
[source](https://github.com/akka/akka-projection/tree/master/examples/src/test/scala/docs/cassandra/CassandraProjectionDocExample.scala#L13-L15 "Go to snippet source")import akka.cluster.sharding.typed.scaladsl.ShardedDaemonProcess
import akka.projection.ProjectionBehavior

ShardedDaemonProcess(system).init[ProjectionBehavior.Command](
  name = "shopping-carts",
  numberOfInstances = ShoppingCart.tags.size,
  behaviorFactory = (i: Int) => ProjectionBehavior(projection(ShoppingCart.tags(i))),
  stopMessage = ProjectionBehavior.Stop)
```

Java

```
[source](https://github.com/akka/akka-projection/tree/master/examples/src/test/java/jdocs/cassandra/CassandraProjectionDocExample.java#L20-L22 "Go to snippet source")import akka.cluster.sharding.typed.javadsl.ShardedDaemonProcess;
import akka.projection.ProjectionBehavior;

ShardedDaemonProcess.get(system)
    .init(
        ProjectionBehavior.Command.class,
        "shopping-carts",
        ShoppingCart.tags.size(),
        id -> ProjectionBehavior.create(projection(ShoppingCart.tags.get((Integer) id))),
        ProjectionBehavior.stopMessage());
```

For this example, we configure as many `ShardedDaemonProcess` as tags and we define the behavior factory to return `ProjectionBehavior` wrapping each time a different `Projection` instance. Finally, the `ShardedDaemon` is configured to use the `ProjectionBehavior.Stop` as its control stop message.

For graceful stop it is recommended to use `ProjectionBehavior.Stop``ProjectionBehavior.stop()` message.

### Projection Behavior

The `ProjectionBehavior` is an Actor `Behavior` that knows how to manage the Projection lifecyle. The Projection starts to consume the events as soon as the actor is spawned and will restart the source in case of failures (see [Projection Settings](projection-settings.html)).

For graceful stop it is recommended to use `ProjectionBehavior.Stop``ProjectionBehavior.stop()` message.

## Running with local Actor

You can spawn the `ProjectionBehavior` as any other `Behavior`. This can be useful for testing or when running a local `ActorSystem` without Akka Cluster.

Scala

```
[source](https://github.com/akka/akka-projection/tree/master/examples/src/test/scala/docs/cassandra/CassandraProjectionDocExample.scala#L205-L221 "Go to snippet source")def sourceProvider(tag: String) =
  EventSourcedProvider
    .eventsByTag[ShoppingCart.Event](
      system = system,
      readJournalPluginId = CassandraReadJournal.Identifier,
      tag = tag)

def projection(tag: String) =
  CassandraProjection
    .atLeastOnce(
      projectionId = ProjectionId("shopping-carts", tag),
      sourceProvider(tag),
      handler = () => new ShoppingCartHandler)

val projection1 = projection("carts-1")

context.spawn(ProjectionBehavior(projection1), projection1.projectionId.id)
```

Java

```
[source](https://github.com/akka/akka-projection/tree/master/examples/src/test/java/jdocs/cassandra/CassandraProjectionDocExample.java#L292-L304 "Go to snippet source")SourceProvider<Offset, EventEnvelope<ShoppingCart.Event>> sourceProvider(String tag) {
  return EventSourcedProvider.eventsByTag(system, CassandraReadJournal.Identifier(), tag);
}

Projection<EventEnvelope<ShoppingCart.Event>> projection(String tag) {
  return CassandraProjection.atLeastOnce(
      ProjectionId.of("shopping-carts", tag), sourceProvider(tag), ShoppingCartHandler::new);
}

Projection<EventEnvelope<ShoppingCart.Event>> projection1 = projection("carts-1");

ActorRef<ProjectionBehavior.Command> projection1Ref =
    context.spawn(ProjectionBehavior.create(projection1), projection1.projectionId().id());
```

Be aware of that the projection and its offset storage is based on the `ProjectionId`. If more than one instance with the same `ProjectionId` are running concurrently they will overwrite each others offset storage with undefined and unpredictable results.

## Running in Cluster Singleton

If you know that you only need one or a few projection instances an alternative to [Sharded Daemon Process](running.html#running-with-sharded-daemon-process) is to use [Akka Cluster Singleton](https://doc.akka.io/libraries/akka-core/current/typed/cluster-singleton.html) 

Scala

```
[source](https://github.com/akka/akka-projection/tree/master/examples/src/test/scala/docs/cassandra/CassandraProjectionDocExample.scala#L231-L252 "Go to snippet source")import akka.cluster.typed.ClusterSingleton
import akka.cluster.typed.SingletonActor

def sourceProvider(tag: String) =
  EventSourcedProvider
    .eventsByTag[ShoppingCart.Event](
      system = system,
      readJournalPluginId = CassandraReadJournal.Identifier,
      tag = tag)

def projection(tag: String) =
  CassandraProjection
    .atLeastOnce(
      projectionId = ProjectionId("shopping-carts", tag),
      sourceProvider(tag),
      handler = () => new ShoppingCartHandler)

val projection1 = projection("carts-1")

ClusterSingleton(system).init(
  SingletonActor(ProjectionBehavior(projection1), projection1.projectionId.id)
    .withStopMessage(ProjectionBehavior.Stop))
```

Java

```
[source](https://github.com/akka/akka-projection/tree/master/examples/src/test/java/jdocs/cassandra/CassandraProjectionDocExample.java#L26-L28 "Go to snippet source")import akka.cluster.typed.ClusterSingleton;
import akka.cluster.typed.SingletonActor;

SourceProvider<Offset, EventEnvelope<ShoppingCart.Event>> sourceProvider(String tag) {
  return EventSourcedProvider.eventsByTag(system, CassandraReadJournal.Identifier(), tag);
}

Projection<EventEnvelope<ShoppingCart.Event>> projection(String tag) {
  return CassandraProjection.atLeastOnce(
      ProjectionId.of("shopping-carts", tag), sourceProvider(tag), ShoppingCartHandler::new);
}

Projection<EventEnvelope<ShoppingCart.Event>> projection1 = projection("carts-1");

ActorRef<ProjectionBehavior.Command> projection1Ref =
    ClusterSingleton.get(system)
        .init(
            SingletonActor.of(
                ProjectionBehavior.create(projection1), projection1.projectionId().id())
                .withStopMessage(ProjectionBehavior.stopMessage()));
```

Be aware of that all projection instances that are running with Cluster Singleton will be running on the same node in the Cluster.

## Code Examples

### Example 1: Dependencies

```scala
resolvers += "Akka library repository".at("https://repo.akka.io/maven")
```

### Example 2: Dependencies

```xml
<project&gt
  ...
  <repositories>
    <repository>
      <id>akka-repository</id>
      <name>Akka library repository</name>
      <url>https://repo.akka.io/maven</url>
    </repository>
  </repositories&gt
</project>
```

### Example 3: Dependencies

```gradle
repositories {
    mavenCentral()
    maven {
        url "https://repo.akka.io/maven"
    }
}
```

### Example 4: Dependencies

```scala
libraryDependencies += "com.typesafe.akka" %% "akka-cluster-sharding-typed" % "2.10.13"
```

### Example 5: Dependencies

```xml
<properties>
  <scala.binary.version>2.13</scala.binary.version>
</properties>
<dependencies&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-cluster-sharding-typed_${scala.binary.version}</artifactId>
    <version>2.10.13</version>
  </dependency&gt
</dependencies>
```

### Example 6: Dependencies

```gradle
def versions = [
  ScalaBinary: "2.13"
]
dependencies {
  implementation "com.typesafe.akka:akka-cluster-sharding-typed_${versions.ScalaBinary}:2.10.13"
}
```

### Example 7: Tagging Events in EventSourcedBehavior

```scala
import akka.actor.typed.ActorSystem
import akka.cluster.sharding.typed.scaladsl.ClusterSharding
import akka.cluster.sharding.typed.scaladsl.Entity
import akka.cluster.sharding.typed.scaladsl.EntityTypeKey

val tags = Vector.tabulate(5)(i => s"carts-$i")
val EntityKey: EntityTypeKey[Command] = EntityTypeKey[Command]("ShoppingCart")

def init(system: ActorSystem[_]): Unit = {
  ClusterSharding(system).init(Entity(EntityKey) { entityContext =>
    val i = math.abs(entityContext.entityId.hashCode % tags.size)
    val selectedTag = tags(i)
    ShoppingCart(entityContext.entityId, selectedTag)
  }.withRole("write-model"))
}

def apply(cartId: String, projectionTag: String): Behavior[Command] = {
  EventSourcedBehavior
    .withEnforcedReplies[Command, Event, State](
      PersistenceId(EntityKey.name, cartId),
      State.empty,
      (state, command) =>
        //The shopping cart behavior changes if it's checked out or not.
        // The commands are handled differently for each case.
        if (state.isCheckedOut) checkedOutShoppingCart(cartId, state, command)
        else openShoppingCart(cartId, state, command),
      (state, event) => handleEvent(state, event))
    .withTagger(_ => Set(projectionTag))
    .withRetention(RetentionCriteria.snapshotEvery(numberOfEvents = 100))
    .onPersistFailure(SupervisorStrategy.restartWithBackoff(200.millis, 5.seconds, 0.1))
}
```

### Example 8: Tagging Events in EventSourcedBehavior

```java
public static final List<String> tags =
    Collections.unmodifiableList(
        Arrays.asList("carts-0", "carts-1", "carts-2", "carts-3", "carts-4"));

@Override
public Set<String> tagsFor(Event event) {
  int n = Math.abs(cartId.hashCode() % tags.size());
  String selectedTag = tags.get(n);
  return Collections.singleton(selectedTag);
}
```

### Example 9: Event Sourced Provider per tag

```scala
import akka.persistence.cassandra.query.scaladsl.CassandraReadJournal
import akka.projection.eventsourced.scaladsl.EventSourcedProvider
import docs.eventsourced.ShoppingCart

def sourceProvider(tag: String) =
  EventSourcedProvider
    .eventsByTag[ShoppingCart.Event](
      system = system,
      readJournalPluginId = CassandraReadJournal.Identifier,
      tag = tag)
```

### Example 10: Event Sourced Provider per tag

```java
import akka.persistence.cassandra.query.javadsl.CassandraReadJournal;
import akka.persistence.query.Offset;
import akka.projection.javadsl.SourceProvider;
import akka.projection.eventsourced.javadsl.EventSourcedProvider;
import akka.projection.eventsourced.EventEnvelope;

SourceProvider<Offset, EventEnvelope<ShoppingCart.Event>> sourceProvider(String tag) {
  return EventSourcedProvider.eventsByTag(system, CassandraReadJournal.Identifier(), tag);
}
```

### Example 11: Building the Projection instances

```scala
import akka.projection.ProjectionId
import akka.projection.cassandra.scaladsl.CassandraProjection

def projection(tag: String) =
  CassandraProjection
    .atLeastOnce(
      projectionId = ProjectionId("shopping-carts", tag),
      sourceProvider(tag),
      handler = () => new ShoppingCartHandler)
    .withSaveOffset(100, 500.millis)
```

### Example 12: Building the Projection instances

```java
import akka.projection.cassandra.javadsl.CassandraProjection;
import akka.projection.Projection;
import akka.projection.ProjectionId;

int saveOffsetAfterEnvelopes = 100;
Duration saveOffsetAfterDuration = Duration.ofMillis(500);

Projection<EventEnvelope<ShoppingCart.Event>> projection(String tag) {
  return CassandraProjection.atLeastOnce(
          ProjectionId.of("shopping-carts", tag), sourceProvider(tag), ShoppingCartHandler::new)
      .withSaveOffset(saveOffsetAfterEnvelopes, saveOffsetAfterDuration);
}
```

### Example 13: Initializing the Sharded Daemon

```scala
import akka.cluster.sharding.typed.scaladsl.ShardedDaemonProcess
import akka.projection.ProjectionBehavior

ShardedDaemonProcess(system).init[ProjectionBehavior.Command](
  name = "shopping-carts",
  numberOfInstances = ShoppingCart.tags.size,
  behaviorFactory = (i: Int) => ProjectionBehavior(projection(ShoppingCart.tags(i))),
  stopMessage = ProjectionBehavior.Stop)
```

### Example 14: Initializing the Sharded Daemon

```java
import akka.cluster.sharding.typed.javadsl.ShardedDaemonProcess;
import akka.projection.ProjectionBehavior;

ShardedDaemonProcess.get(system)
    .init(
        ProjectionBehavior.Command.class,
        "shopping-carts",
        ShoppingCart.tags.size(),
        id -> ProjectionBehavior.create(projection(ShoppingCart.tags.get((Integer) id))),
        ProjectionBehavior.stopMessage());
```

### Example 15: Running with local Actor

```scala
def sourceProvider(tag: String) =
  EventSourcedProvider
    .eventsByTag[ShoppingCart.Event](
      system = system,
      readJournalPluginId = CassandraReadJournal.Identifier,
      tag = tag)

def projection(tag: String) =
  CassandraProjection
    .atLeastOnce(
      projectionId = ProjectionId("shopping-carts", tag),
      sourceProvider(tag),
      handler = () => new ShoppingCartHandler)

val projection1 = projection("carts-1")

context.spawn(ProjectionBehavior(projection1), projection1.projectionId.id)
```

### Example 16: Running with local Actor

```java
SourceProvider<Offset, EventEnvelope<ShoppingCart.Event>> sourceProvider(String tag) {
  return EventSourcedProvider.eventsByTag(system, CassandraReadJournal.Identifier(), tag);
}

Projection<EventEnvelope<ShoppingCart.Event>> projection(String tag) {
  return CassandraProjection.atLeastOnce(
      ProjectionId.of("shopping-carts", tag), sourceProvider(tag), ShoppingCartHandler::new);
}

Projection<EventEnvelope<ShoppingCart.Event>> projection1 = projection("carts-1");

ActorRef<ProjectionBehavior.Command> projection1Ref =
    context.spawn(ProjectionBehavior.create(projection1), projection1.projectionId().id());
```

### Example 17: Running in Cluster Singleton

```scala
import akka.cluster.typed.ClusterSingleton
import akka.cluster.typed.SingletonActor

def sourceProvider(tag: String) =
  EventSourcedProvider
    .eventsByTag[ShoppingCart.Event](
      system = system,
      readJournalPluginId = CassandraReadJournal.Identifier,
      tag = tag)

def projection(tag: String) =
  CassandraProjection
    .atLeastOnce(
      projectionId = ProjectionId("shopping-carts", tag),
      sourceProvider(tag),
      handler = () => new ShoppingCartHandler)

val projection1 = projection("carts-1")

ClusterSingleton(system).init(
  SingletonActor(ProjectionBehavior(projection1), projection1.projectionId.id)
    .withStopMessage(ProjectionBehavior.Stop))
```

### Example 18: Running in Cluster Singleton

```java
import akka.cluster.typed.ClusterSingleton;
import akka.cluster.typed.SingletonActor;

SourceProvider<Offset, EventEnvelope<ShoppingCart.Event>> sourceProvider(String tag) {
  return EventSourcedProvider.eventsByTag(system, CassandraReadJournal.Identifier(), tag);
}

Projection<EventEnvelope<ShoppingCart.Event>> projection(String tag) {
  return CassandraProjection.atLeastOnce(
      ProjectionId.of("shopping-carts", tag), sourceProvider(tag), ShoppingCartHandler::new);
}

Projection<EventEnvelope<ShoppingCart.Event>> projection1 = projection("carts-1");

ActorRef<ProjectionBehavior.Command> projection1Ref =
    ClusterSingleton.get(system)
        .init(
            SingletonActor.of(
                ProjectionBehavior.create(projection1), projection1.projectionId().id())
                .withStopMessage(ProjectionBehavior.stopMessage()));
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/libraries/akka-core/current/typed/cluster-sharded-daemon-process.html
- https://doc.akka.io/libraries/akka-core/current/typed/cluster-sharding.html
- https://doc.akka.io/libraries/akka-core/current/typed/cluster-singleton.html
- https://doc.akka.io/libraries/akka-core/current/typed/index-cluster.html
- https://doc.akka.io/libraries/akka-core/current/typed/persistence.html
- https://doc.akka.io/libraries/akka-persistence-cassandra/current/
- https://doc.akka.io/libraries/akka-persistence-jdbc/current/
- https://doc.akka.io/libraries/akka-projection/1.6/actor.html
- https://doc.akka.io/libraries/akka-projection/1.6/dynamodb.html
- https://doc.akka.io/libraries/akka-projection/1.6/eventsourced.html
- https://doc.akka.io/libraries/akka-projection/1.6/overview.html
- https://doc.akka.io/libraries/akka-projection/1.6/projection-settings.html
- https://doc.akka.io/libraries/akka-projection/1.6/r2dbc.html
- https://doc.akka.io/libraries/akka-projection/1.6/running.html

---
*Source: [https://doc.akka.io/libraries/akka-projection/1.6/running.html](https://doc.akka.io/libraries/akka-projection/1.6/running.html)*