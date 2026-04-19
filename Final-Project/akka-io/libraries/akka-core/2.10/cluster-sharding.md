---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:18:17Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/cluster-sharding.html
title: Classic Cluster Sharding • Akka core
---

# Classic Cluster Sharding • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Classic Cluster Sharding

Note
Akka Classic pertains to the original Actor APIs, which have been improved by more type safe and guided Actor APIs. Akka Classic is still fully supported and existing applications can continue to use the classic APIs. It is also possible to use the new Actor APIs together with classic actors in the same ActorSystem, see [coexistence](typed/coexisting.html). For new projects we recommend using [the new Actor API](typed/actors.html).

For the full documentation of this feature and for new projects see [Cluster Sharding](typed/cluster-sharding.html).

## Module info

Note
The Akka dependencies are available from Akka’s secure library repository. To access them you need to use a secure, tokenized URL as specified at <https://account.akka.io/token>.

To use Cluster Sharding, you must add the following dependency in your project:

sbt
```
val AkkaVersion = "2.10.17"
libraryDependencies += "com.typesafe.akka" %% "akka-cluster-sharding" % AkkaVersion
```
Maven
```
<properties>
  <scala.binary.version>2.13</scala.binary.version>
</properties>
<dependencyManagement>
  <dependencies>
    <dependency>
      <groupId>com.typesafe.akka</groupId>
      <artifactId>akka-bom_${scala.binary.version}</artifactId>
      <version>2.10.17</version>
      <type>pom</type>
      <scope>import</scope>
    </dependency&gt
  </dependencies>
</dependencyManagement>
<dependencies&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-cluster-sharding_${scala.binary.version}</artifactId>
  </dependency&gt
</dependencies>
```
Gradle
```
def versions = [
  ScalaBinary: "2.13"
]
dependencies {
  implementation platform("com.typesafe.akka:akka-bom_${versions.ScalaBinary}:2.10.17")

  implementation "com.typesafe.akka:akka-cluster-sharding_${versions.ScalaBinary}"
}
```

| Project Info: Akka Cluster Sharding (classic) | |
| --- | --- |
| Artifact | com.typesafe.akka akka\-cluster\-sharding 2\.10\.17 [Snapshots are available](project/links.html#snapshots-repository) |
| JDK versions | Eclipse Temurin JDK 11Eclipse Temurin JDK 17Eclipse Temurin JDK 21 |
| Scala versions | 2\.13\.17, 3\.3\.7 |
| JPMS module name | akka.cluster.sharding |
| License | [BUSL\-1\.1](https://raw.githubusercontent.com/akka/akka-core/v2.10.17/LICENSE) |
| Readiness level | [Supported](https://doc.akka.io/docs/akka-dependencies/current/support-terminology.html#supported), support is available from [Lightbend](https://www.lightbend.com/akka) Since 2\.3\.0, 2014\-03\-05 |
| Home page | <https://akka.io/> |
| API documentation | [API (Scaladoc)](https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/index.html) [API (Javadoc)](https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/package-summary.html) |
| Forums | [Akka Discuss](https://discuss.akka.io) |
| Release notes | [Akka release notes](https://doc.akka.io/reference/release-notes.html) |
| Issues | [Github issues](https://github.com/akka/akka-core/issues) |
| Sources | [https://github.com/akka/akka\-core](https://github.com/akka/akka-core) |

## Introduction

For an introduction to Sharding concepts see [Cluster Sharding](typed/cluster-sharding.html).

## Basic example

This is what an entity actor may look like:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-sharding/src/multi-jvm/scala/akka/cluster/sharding/ClusterShardingSpec.scala#L30-L70 "Go to snippet source")case object Increment
case object Decrement
final case class Get(counterId: Long)
final case class EntityEnvelope(id: Long, payload: Any)

case object Stop
final case class CounterChanged(delta: Int)

class Counter extends PersistentActor {
  import ShardRegion.Passivate

  context.setReceiveTimeout(120.seconds)

  // self.path.name is the entity identifier (utf-8 URL-encoded)
  override def persistenceId: String = "Counter-" + self.path.name

  var count = 0

  def updateState(event: CounterChanged): Unit =
    count += event.delta

  override def receiveRecover: Receive = {
    case evt: CounterChanged => updateState(evt)
  }

  override def receiveCommand: Receive = {
    case Increment      => persist(CounterChanged(+1))(updateState)
    case Decrement      => persist(CounterChanged(-1))(updateState)
    case Get(_)         => sender() ! count
    case ReceiveTimeout => context.parent ! Passivate(stopMessage = Stop)
    case Stop           => context.stop(self)
  }
}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/sharding/ClusterShardingTest.java#L155-L237 "Go to snippet source")static class Counter extends AbstractPersistentActor {

  public enum CounterOp {
    INCREMENT,
    DECREMENT
  }

  public static class Get {
    public final long counterId;

    public Get(long counterId) {
      this.counterId = counterId;
    }
  }

  public static class EntityEnvelope {
    public final long id;
    public final Object payload;

    public EntityEnvelope(long id, Object payload) {
      this.id = id;
      this.payload = payload;
    }
  }

  public static class CounterChanged {
    public final int delta;

    public CounterChanged(int delta) {
      this.delta = delta;
    }
  }

  int count = 0;

  // getSelf().path().name() is the entity identifier (utf-8 URL-encoded)
  @Override
  public String persistenceId() {
    return "Counter-" + getSelf().path().name();
  }

  @Override
  public void preStart() throws Exception {
    super.preStart();
    getContext().setReceiveTimeout(Duration.ofSeconds(120));
  }

  void updateState(CounterChanged event) {
    count += event.delta;
  }

  @Override
  public Receive createReceiveRecover() {
    return receiveBuilder().match(CounterChanged.class, this::updateState).build();
  }

  @Override
  public Receive createReceive() {
    return receiveBuilder()
        .match(Get.class, this::receiveGet)
        .matchEquals(CounterOp.INCREMENT, msg -> receiveIncrement())
        .matchEquals(CounterOp.DECREMENT, msg -> receiveDecrement())
        .matchEquals(ReceiveTimeout.getInstance(), msg -> passivate())
        .build();
  }

  private void receiveGet(Get msg) {
    getSender().tell(count, getSelf());
  }

  private void receiveIncrement() {
    persist(new CounterChanged(+1), this::updateState);
  }

  private void receiveDecrement() {
    persist(new CounterChanged(-1), this::updateState);
  }

  private void passivate() {
    getContext().getParent().tell(new ShardRegion.Passivate(PoisonPill.getInstance()), getSelf());
  }
}

```

The above actor uses Event Sourcing and the support provided in `PersistentActor` `AbstractPersistentActor` to store its state. It does not have to be a persistent actor, but in case of failure or migration of entities between nodes it must be able to recover its state if it is valuable.

Note how the `persistenceId` is defined. The name of the actor is the entity identifier (utf\-8 URL\-encoded). You may define it another way, but it must be unique.

When using the sharding extension you are first, typically at system startup on each node in the cluster, supposed to register the supported entity types with the `ClusterSharding.start` method. `ClusterSharding.start` gives you the reference which you can pass along. Please note that `ClusterSharding.start` will start a `ShardRegion` in [proxy only mode](cluster-sharding.html#proxy-only-mode) when there is no match between the roles of the current cluster node and the role specified in `ClusterShardingSettings`.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-sharding/src/multi-jvm/scala/akka/cluster/sharding/ClusterShardingSpec.scala#L677-L682 "Go to snippet source")val counterRegion: ActorRef = ClusterSharding(system).start(
  typeName = "Counter",
  entityProps = Props[Counter](),
  settings = ClusterShardingSettings(system),
  extractEntityId = extractEntityId,
  extractShardId = extractShardId)
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/sharding/ClusterShardingTest.java#L25-L84 "Go to snippet source")import akka.japi.Option;
import akka.cluster.sharding.ClusterSharding;
import akka.cluster.sharding.ClusterShardingSettings;

Option<String> roleOption = Option.none();
ClusterShardingSettings settings = ClusterShardingSettings.create(system);
ActorRef startedCounterRegion =
    ClusterSharding.get(system)
        .start("Counter", Props.create(Counter.class), settings, messageExtractor);
```

The `extractEntityId` and `extractShardId` are two `messageExtractor` defines application specific functions methods to extract the entity identifier and the shard identifier from incoming messages.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-sharding/src/multi-jvm/scala/akka/cluster/sharding/ClusterShardingSpec.scala#L187-L201 "Go to snippet source")val extractEntityId: ShardRegion.ExtractEntityId = {
  case EntityEnvelope(id, payload) => (id.toString, payload)
  case msg @ Get(id)               => (id.toString, msg)
}

val numberOfShards = 100

val extractShardId: ShardRegion.ExtractShardId = {
  case EntityEnvelope(id, _)       => (id % numberOfShards).toString
  case Get(id)                     => (id % numberOfShards).toString
  case ShardRegion.StartEntity(id) =>
    // StartEntity is used by remembering entities feature
    (id.toLong % numberOfShards).toString
  case _ => throw new IllegalArgumentException()
}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/sharding/ClusterShardingTest.java#L20-L76 "Go to snippet source")import akka.cluster.sharding.ShardRegion;

ShardRegion.MessageExtractor messageExtractor =
    new ShardRegion.MessageExtractor() {

      @Override
      public String entityId(Object message) {
        if (message instanceof Counter.EntityEnvelope)
          return String.valueOf(((Counter.EntityEnvelope) message).id);
        else if (message instanceof Counter.Get)
          return String.valueOf(((Counter.Get) message).counterId);
        else return null;
      }

      @Override
      public Object entityMessage(Object message) {
        if (message instanceof Counter.EntityEnvelope)
          return ((Counter.EntityEnvelope) message).payload;
        else return message;
      }

      @Override
      public String shardId(Object message) {
        int numberOfShards = 100;
        if (message instanceof Counter.EntityEnvelope) {
          long id = ((Counter.EntityEnvelope) message).id;
          return String.valueOf(id % numberOfShards);
        } else if (message instanceof Counter.Get) {
          long id = ((Counter.Get) message).counterId;
          return String.valueOf(id % numberOfShards);
        } else {
          return null;
        }
      }
    };
```

This example illustrates two different ways to define the entity identifier in the messages:

- The `Get` message includes the identifier itself.
- The `EntityEnvelope` holds the identifier, and the actual message that is sent to the entity actor is wrapped in the envelope.

Note how these two messages types are handled in the `extractEntityId` function `entityId` and `entityMessage` methods shown above. The message sent to the entity actor is the second part of the tuple returned by the `extractEntityId` what `entityMessage` returns and that makes it possible to unwrap envelopes if needed.

A shard is a group of entities that will be managed together. The grouping is defined by the `extractShardId` function shown above. For a specific entity identifier the shard identifier must always be the same. Otherwise the entity actor might accidentally be started in several places at the same time.

Creating a good sharding algorithm is an interesting challenge in itself. Try to produce a uniform distribution, i.e. same amount of entities in each shard. As a rule of thumb, the number of shards should be a factor ten greater than the planned maximum number of cluster nodes. Fewer shards than number of nodes will result in that some nodes will not host any shards. Too many shards will result in less efficient management of the shards, e.g. rebalancing overhead, and increased latency because the coordinator is involved in the routing of the first message for each shard. The sharding algorithm must be the same on all nodes in a running cluster. It can be changed after stopping all nodes in the cluster.

A simple sharding algorithm that works fine in most cases is to take the absolute value of the `hashCode` of the entity identifier modulo number of shards. As a convenience this is provided by the `ShardRegion.HashCodeMessageExtractor`.

Messages to the entities are always sent via the local `ShardRegion`. The `ShardRegion` actor reference for a named entity type is returned by `ClusterSharding.start` and it can also be retrieved with `ClusterSharding.shardRegion`. The `ShardRegion` will lookup the location of the shard for the entity if it does not already know its location. It will delegate the message to the right node and it will create the entity actor on demand, i.e. when the first message for a specific entity is delivered.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-sharding/src/multi-jvm/scala/akka/cluster/sharding/ClusterShardingSpec.scala#L705-L711 "Go to snippet source")val counterRegion: ActorRef = ClusterSharding(system).shardRegion("Counter")
counterRegion ! Get(123)
expectMsg(0)

counterRegion ! EntityEnvelope(123, Increment)
counterRegion ! Get(123)
expectMsg(1)
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/sharding/ClusterShardingTest.java#L88-L92 "Go to snippet source")ActorRef counterRegion = ClusterSharding.get(system).shardRegion("Counter");
counterRegion.tell(new Counter.Get(123), getSelf());

counterRegion.tell(new Counter.EntityEnvelope(123, Counter.CounterOp.INCREMENT), getSelf());
counterRegion.tell(new Counter.Get(123), getSelf());
```

## How it works

See [Cluster Sharding concepts](typed/cluster-sharding-concepts.html) in the documentation of the new APIs.

## Sharding State Store Mode

There are two cluster sharding states managed:

1. [ShardCoordinator State](typed/cluster-sharding-concepts.html#shardcoordinator-state) \- the `Shard` locations
2. [Remembering Entities](cluster-sharding.html#remembering-entities) \- the entities in each `Shard`, which is optional, and disabled by default

For these, there are currently two modes which define how these states are stored:

- [Distributed Data Mode](cluster-sharding.html#distributed-data-mode) \- uses Akka [Distributed Data](distributed-data.html) (CRDTs) (the default)
- [Persistence Mode](cluster-sharding.html#persistence-mode) \- (deprecated) uses Akka [Persistence](persistence.html) (Event Sourcing)

Warning
Persistence for state store mode is deprecated. It is recommended to migrate to `ddata` for the coordinator state and if using replicated entities migrate to `eventsourced` for the replicated entities state.

The data written by the deprecated `persistence` state store mode for remembered entities can be read by the new remember entities `eventsourced` mode.

Once you’ve migrated you can not go back to `persistence` mode.

Changing the mode requires [a full cluster restart](additional/rolling-updates.html#cluster-sharding-configuration-change).

### Distributed Data Mode

The state of the `ShardCoordinator` is replicated across the cluster but is not durable, not stored to disk. The `ShardCoordinator` state replication is handled by [Distributed Data](distributed-data.html) with `WriteMajority`/`ReadMajority` consistency. When all nodes in the cluster have been stopped, the state is no longer needed and dropped.

See [Distributed Data mode](typed/cluster-sharding.html#distributed-data-mode) in the documentation of the new APIs.

### Persistence Mode

See [Persistence Mode](typed/cluster-sharding.html#persistence-mode) in the documentation of the new APIs.

## Proxy Only Mode

The `ShardRegion` actor can also be started in proxy only mode, i.e. it will not host any entities itself, but knows how to delegate messages to the right location. A `ShardRegion` is started in proxy only mode with the `ClusterSharding.startProxy` method. Also a `ShardRegion` is started in proxy only mode when there is no match between the roles of the current cluster node and the role specified in `ClusterShardingSettings` passed to the `ClusterSharding.start` method.

## Passivation

If the state of the entities are persistent you may stop entities that are not used to reduce memory consumption. This is done by the application specific implementation of the entity actors for example by defining receive timeout (`context.setReceiveTimeout`). If a message is already enqueued to the entity when it stops itself the enqueued message in the mailbox will be dropped. To support graceful passivation without losing such messages the entity actor can send `ShardRegion.Passivate` to its parent `Shard`. The specified wrapped message in `Passivate` will be sent back to the entity, which is then supposed to stop itself. Incoming messages will be buffered by the `Shard` between reception of `Passivate` and termination of the entity. Such buffered messages are thereafter delivered to a new incarnation of the entity.

See [Automatic Passivation](typed/cluster-sharding.html#automatic-passivation) in the documentation of the new APIs.

## Remembering Entities

See [Remembering Entities](typed/cluster-sharding.html#remembering-entities) in the documentation of the new APIs, including behavior when enabled and disabled.

Note that the state of the entities themselves will not be restored unless they have been made persistent, for example with [Event Sourcing](persistence.html).

To make the list of entities in each `Shard` persistent (durable), set the `rememberEntities` flag to true in `ClusterShardingSettings` when calling `ClusterSharding.start` and make sure the `shardIdExtractor` handles `Shard.StartEntity(EntityId)` which implies that a `ShardId` must be possible to extract from the `EntityId`.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-sharding/src/multi-jvm/scala/akka/cluster/sharding/ClusterShardingSpec.scala#L206-L213 "Go to snippet source")val extractShardId: ShardRegion.ExtractShardId = {
  case EntityEnvelope(id, _)       => (id % numberOfShards).toString
  case Get(id)                     => (id % numberOfShards).toString
  case ShardRegion.StartEntity(id) =>
    // StartEntity is used by remembering entities feature
    (id.toLong % numberOfShards).toString
  case _ => throw new IllegalArgumentException()
}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/sharding/ClusterShardingTest.java#L133-L148 "Go to snippet source")@Override
public String shardId(Object message) {
  int numberOfShards = 100;
  if (message instanceof Counter.EntityEnvelope) {
    long id = ((Counter.EntityEnvelope) message).id;
    return String.valueOf(id % numberOfShards);
  } else if (message instanceof Counter.Get) {
    long id = ((Counter.Get) message).counterId;
    return String.valueOf(id % numberOfShards);
  } else if (message instanceof ShardRegion.StartEntity) {
    long id = Long.valueOf(((ShardRegion.StartEntity) message).entityId());
    return String.valueOf(id % numberOfShards);
  } else {
    return null;
  }
}
```

## Supervision

If you need to use another `supervisorStrategy` for the entity actors than the default (restarting) strategy you need to create an intermediate parent actor that defines the `supervisorStrategy` to the child entity actor.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-sharding/src/multi-jvm/scala/akka/cluster/sharding/ClusterShardingSpec.scala#L97-L110 "Go to snippet source")class CounterSupervisor extends Actor {
  val counter = context.actorOf(Props[Counter](), "theCounter")

  override val supervisorStrategy = OneForOneStrategy() {
    case _: IllegalArgumentException     => SupervisorStrategy.Resume
    case _: ActorInitializationException => SupervisorStrategy.Stop
    case _: DeathPactException           => SupervisorStrategy.Stop
    case _: Exception                    => SupervisorStrategy.Restart
  }

  def receive = {
    case msg => counter.forward(msg)
  }
}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/sharding/ClusterShardingTest.java#L241-L265 "Go to snippet source")static class CounterSupervisor extends AbstractActor {

  private final ActorRef counter =
      getContext().actorOf(Props.create(Counter.class), "theCounter");

  private static final SupervisorStrategy strategy =
      new OneForOneStrategy(
          DeciderBuilder.match(IllegalArgumentException.class, e -> SupervisorStrategy.resume())
              .match(ActorInitializationException.class, e -> SupervisorStrategy.stop())
              .match(Exception.class, e -> SupervisorStrategy.restart())
              .matchAny(o -> SupervisorStrategy.escalate())
              .build());

  @Override
  public SupervisorStrategy supervisorStrategy() {
    return strategy;
  }

  @Override
  public Receive createReceive() {
    return receiveBuilder()
        .match(Object.class, msg -> counter.forward(msg, getContext()))
        .build();
  }
}
```

You start such a supervisor in the same way as if it was the entity actor.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-sharding/src/multi-jvm/scala/akka/cluster/sharding/ClusterShardingSpec.scala#L694-L699 "Go to snippet source")ClusterSharding(system).start(
  typeName = "SupervisedCounter",
  entityProps = Props[CounterSupervisor](),
  settings = ClusterShardingSettings(system),
  extractEntityId = extractEntityId,
  extractShardId = extractShardId)
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/sharding/ClusterShardingTest.java#L96-L98 "Go to snippet source")ClusterSharding.get(system)
    .start(
        "SupervisedCounter", Props.create(CounterSupervisor.class), settings, messageExtractor);
```

Note that stopped entities will be started again when a new message is targeted to the entity.

If ‘on stop’ backoff supervision strategy is used, a final termination message must be set and used for passivation, see [Backoff supervisor and sharding](fault-tolerance.html#sharding)

## Graceful Shutdown

You can send the `ShardRegion.GracefulShutdown` `ShardRegion.gracefulShutdownInstance` message to the `ShardRegion` actor to hand off all shards that are hosted by that `ShardRegion` and then the `ShardRegion` actor will be stopped. You can `watch` the `ShardRegion` actor to know when it is completed. During this period other regions will buffer messages for those shards in the same way as when a rebalance is triggered by the coordinator. When the shards have been stopped the coordinator will allocate these shards elsewhere.

This is performed automatically by the [Coordinated Shutdown](coordinated-shutdown.html) and is therefore part of the graceful leaving process of a cluster member.

## Removal of Internal Cluster Sharding Data

See [removal of Internal Cluster Sharding Data](typed/cluster-sharding.html#removal-of-internal-cluster-sharding-data) in the documentation of the new APIs.

## Inspecting cluster sharding state

Two requests to inspect the cluster state are available:

`ShardRegion.GetShardRegionState` `ShardRegion.getShardRegionStateInstance` which will return a `ShardRegion.CurrentShardRegionState` `ShardRegion.ShardRegionState` that contains the identifiers of the shards running in a Region and what entities are alive for each of them. 

`ShardRegion.GetClusterShardingStats` which will query all the regions in the cluster and return a `ShardRegion.ClusterShardingStats` containing the identifiers of the shards running in each region and a count of entities that are alive in each shard. 

If any shard queries failed, for example due to timeout if a shard was too busy to reply within the configured `akka.cluster.sharding.shard-region-query-timeout`, `ShardRegion.CurrentShardRegionState` and `ShardRegion.ClusterShardingStats` will also include the set of shard identifiers by region that failed.

The type names of all started shards can be acquired via `ClusterSharding.shardTypeNames` `ClusterSharding.getShardTypeNames`.

The purpose of these messages is testing and monitoring, they are not provided to give access to directly sending messages to the individual entities.

## Lease

A lease can be used as an additional safety measure to ensure a shard does not run on two nodes. See [Lease](typed/cluster-sharding.html#lease) in the documentation of the new APIs.

## Configuration

`ClusterShardingSettings` is a parameter to the `start` method of the `ClusterSharding` extension, i.e. each each entity type can be configured with different settings if needed.

See [configuration](typed/cluster-sharding.html#configuration) for more information.

## Code Examples

### Example 1: Module info

```scala
val AkkaVersion = "2.10.17"
libraryDependencies += "com.typesafe.akka" %% "akka-cluster-sharding" % AkkaVersion
```

### Example 2: Module info

```xml
<properties>
  <scala.binary.version>2.13</scala.binary.version>
</properties>
<dependencyManagement>
  <dependencies>
    <dependency>
      <groupId>com.typesafe.akka</groupId>
      <artifactId>akka-bom_${scala.binary.version}</artifactId>
      <version>2.10.17</version>
      <type>pom</type>
      <scope>import</scope>
    </dependency&gt
  </dependencies>
</dependencyManagement>
<dependencies&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-cluster-sharding_${scala.binary.version}</artifactId>
  </dependency&gt
</dependencies>
```

### Example 3: Module info

```gradle
def versions = [
  ScalaBinary: "2.13"
]
dependencies {
  implementation platform("com.typesafe.akka:akka-bom_${versions.ScalaBinary}:2.10.17")

  implementation "com.typesafe.akka:akka-cluster-sharding_${versions.ScalaBinary}"
}
```

### Example 4: Basic example

```scala
case object Increment
case object Decrement
final case class Get(counterId: Long)
final case class EntityEnvelope(id: Long, payload: Any)

case object Stop
final case class CounterChanged(delta: Int)

class Counter extends PersistentActor {
  import ShardRegion.Passivate

  context.setReceiveTimeout(120.seconds)

  // self.path.name is the entity identifier (utf-8 URL-encoded)
  override def persistenceId: String = "Counter-" + self.path.name

  var count = 0

  def updateState(event: CounterChanged): Unit =
    count += event.delta

  override def receiveRecover: Receive = {
    case evt: CounterChanged => updateState(evt)
  }

  override def receiveCommand: Receive = {
    case Increment      => persist(CounterChanged(+1))(updateState)
    case Decrement      => persist(CounterChanged(-1))(updateState)
    case Get(_)         => sender() ! count
    case ReceiveTimeout => context.parent ! Passivate(stopMessage = Stop)
    case Stop           => context.stop(self)
  }
}
```

### Example 5: Basic example

```java
static class Counter extends AbstractPersistentActor {

  public enum CounterOp {
    INCREMENT,
    DECREMENT
  }

  public static class Get {
    public final long counterId;

    public Get(long counterId) {
      this.counterId = counterId;
    }
  }

  public static class EntityEnvelope {
    public final long id;
    public final Object payload;

    public EntityEnvelope(long id, Object payload) {
      this.id = id;
      this.payload = payload;
    }
  }

  public static class CounterChanged {
    public final int delta;

    public CounterChanged(int delta) {
      this.delta = delta;
    }
  }

  int count = 0;

  // getSelf().path().name() is the entity identifier (utf-8 URL-encoded)
  @Override
  public String persistenceId() {
    return "Counter-" + getSelf().path().name();
  }

  @Override
  public void preStart() throws Exception {
    super.preStart();
    getContext().setReceiveTimeout(Duration.ofSeconds(120));
  }

  void updateState(CounterChanged event) {
    count += event.delta;
  }

  @Override
  public Receive createReceiveRecover() {
    return receiveBuilder().match(CounterChanged.class, this::updateState).build();
  }

  @Override
  public Receive createReceive() {
    return receiveBuilder()
        .match(Get.class, this::receiveGet)
        .matchEquals(CounterOp.INCREMENT, msg -> receiveIncrement())
        .matchEquals(CounterOp.DECREMENT, msg -> receiveDecrement())
        .matchEquals(ReceiveTimeout.getInstance(), msg -> passivate())
        .build();
  }

  private void receiveGet(Get msg) {
    getSender().tell(count, getSelf());
  }

  private void receiveIncrement() {
    persist(new CounterChanged(+1), this::updateState);
  }

  private void receiveDecrement() {
    persist(new CounterChanged(-1), this::updateState);
  }

  private void passivate() {
    getContext().getParent().tell(new ShardRegion.Passivate(PoisonPill.getInstance()), getSelf());
  }
}
```

### Example 6: Basic example

```scala
val counterRegion: ActorRef = ClusterSharding(system).start(
  typeName = "Counter",
  entityProps = Props[Counter](),
  settings = ClusterShardingSettings(system),
  extractEntityId = extractEntityId,
  extractShardId = extractShardId)
```

### Example 7: Basic example

```java
import akka.japi.Option;
import akka.cluster.sharding.ClusterSharding;
import akka.cluster.sharding.ClusterShardingSettings;

Option<String> roleOption = Option.none();
ClusterShardingSettings settings = ClusterShardingSettings.create(system);
ActorRef startedCounterRegion =
    ClusterSharding.get(system)
        .start("Counter", Props.create(Counter.class), settings, messageExtractor);
```

### Example 8: Basic example

```scala
val extractEntityId: ShardRegion.ExtractEntityId = {
  case EntityEnvelope(id, payload) => (id.toString, payload)
  case msg @ Get(id)               => (id.toString, msg)
}

val numberOfShards = 100

val extractShardId: ShardRegion.ExtractShardId = {
  case EntityEnvelope(id, _)       => (id % numberOfShards).toString
  case Get(id)                     => (id % numberOfShards).toString
  case ShardRegion.StartEntity(id) =>
    // StartEntity is used by remembering entities feature
    (id.toLong % numberOfShards).toString
  case _ => throw new IllegalArgumentException()
}
```

### Example 9: Basic example

```java
import akka.cluster.sharding.ShardRegion;

ShardRegion.MessageExtractor messageExtractor =
    new ShardRegion.MessageExtractor() {

      @Override
      public String entityId(Object message) {
        if (message instanceof Counter.EntityEnvelope)
          return String.valueOf(((Counter.EntityEnvelope) message).id);
        else if (message instanceof Counter.Get)
          return String.valueOf(((Counter.Get) message).counterId);
        else return null;
      }

      @Override
      public Object entityMessage(Object message) {
        if (message instanceof Counter.EntityEnvelope)
          return ((Counter.EntityEnvelope) message).payload;
        else return message;
      }

      @Override
      public String shardId(Object message) {
        int numberOfShards = 100;
        if (message instanceof Counter.EntityEnvelope) {
          long id = ((Counter.EntityEnvelope) message).id;
          return String.valueOf(id % numberOfShards);
        } else if (message instanceof Counter.Get) {
          long id = ((Counter.Get) message).counterId;
          return String.valueOf(id % numberOfShards);
        } else {
          return null;
        }
      }
    };
```

### Example 10: Basic example

```scala
val counterRegion: ActorRef = ClusterSharding(system).shardRegion("Counter")
counterRegion ! Get(123)
expectMsg(0)

counterRegion ! EntityEnvelope(123, Increment)
counterRegion ! Get(123)
expectMsg(1)
```

### Example 11: Basic example

```java
ActorRef counterRegion = ClusterSharding.get(system).shardRegion("Counter");
counterRegion.tell(new Counter.Get(123), getSelf());

counterRegion.tell(new Counter.EntityEnvelope(123, Counter.CounterOp.INCREMENT), getSelf());
counterRegion.tell(new Counter.Get(123), getSelf());
```

### Example 12: Remembering Entities

```scala
val extractShardId: ShardRegion.ExtractShardId = {
  case EntityEnvelope(id, _)       => (id % numberOfShards).toString
  case Get(id)                     => (id % numberOfShards).toString
  case ShardRegion.StartEntity(id) =>
    // StartEntity is used by remembering entities feature
    (id.toLong % numberOfShards).toString
  case _ => throw new IllegalArgumentException()
}
```

### Example 13: Remembering Entities

```java
@Override
public String shardId(Object message) {
  int numberOfShards = 100;
  if (message instanceof Counter.EntityEnvelope) {
    long id = ((Counter.EntityEnvelope) message).id;
    return String.valueOf(id % numberOfShards);
  } else if (message instanceof Counter.Get) {
    long id = ((Counter.Get) message).counterId;
    return String.valueOf(id % numberOfShards);
  } else if (message instanceof ShardRegion.StartEntity) {
    long id = Long.valueOf(((ShardRegion.StartEntity) message).entityId());
    return String.valueOf(id % numberOfShards);
  } else {
    return null;
  }
}
```

### Example 14: Supervision

```scala
class CounterSupervisor extends Actor {
  val counter = context.actorOf(Props[Counter](), "theCounter")

  override val supervisorStrategy = OneForOneStrategy() {
    case _: IllegalArgumentException     => SupervisorStrategy.Resume
    case _: ActorInitializationException => SupervisorStrategy.Stop
    case _: DeathPactException           => SupervisorStrategy.Stop
    case _: Exception                    => SupervisorStrategy.Restart
  }

  def receive = {
    case msg => counter.forward(msg)
  }
}
```

### Example 15: Supervision

```java
static class CounterSupervisor extends AbstractActor {

  private final ActorRef counter =
      getContext().actorOf(Props.create(Counter.class), "theCounter");

  private static final SupervisorStrategy strategy =
      new OneForOneStrategy(
          DeciderBuilder.match(IllegalArgumentException.class, e -> SupervisorStrategy.resume())
              .match(ActorInitializationException.class, e -> SupervisorStrategy.stop())
              .match(Exception.class, e -> SupervisorStrategy.restart())
              .matchAny(o -> SupervisorStrategy.escalate())
              .build());

  @Override
  public SupervisorStrategy supervisorStrategy() {
    return strategy;
  }

  @Override
  public Receive createReceive() {
    return receiveBuilder()
        .match(Object.class, msg -> counter.forward(msg, getContext()))
        .build();
  }
}
```

### Example 16: Supervision

```scala
ClusterSharding(system).start(
  typeName = "SupervisedCounter",
  entityProps = Props[CounterSupervisor](),
  settings = ClusterShardingSettings(system),
  extractEntityId = extractEntityId,
  extractShardId = extractShardId)
```

### Example 17: Supervision

```java
ClusterSharding.get(system)
    .start(
        "SupervisedCounter", Props.create(CounterSupervisor.class), settings, messageExtractor);
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/index.html
- https://doc.akka.io/docs/akka-dependencies/current/support-terminology.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/package-summary.html
- https://doc.akka.io/libraries/akka-core/2.10/additional/rolling-updates.html
- https://doc.akka.io/libraries/akka-core/2.10/cluster-metrics.html
- https://doc.akka.io/libraries/akka-core/2.10/cluster-sharding.html
- https://doc.akka.io/libraries/akka-core/2.10/coordinated-shutdown.html
- https://doc.akka.io/libraries/akka-core/2.10/distributed-data.html
- https://doc.akka.io/libraries/akka-core/2.10/distributed-pub-sub.html
- https://doc.akka.io/libraries/akka-core/2.10/fault-tolerance.html
- https://doc.akka.io/libraries/akka-core/2.10/persistence.html
- https://doc.akka.io/libraries/akka-core/2.10/project/links.html
- https://doc.akka.io/libraries/akka-core/2.10/typed/actors.html
- https://doc.akka.io/libraries/akka-core/2.10/typed/cluster-sharding-concepts.html
- https://doc.akka.io/libraries/akka-core/2.10/typed/cluster-sharding.html
- https://doc.akka.io/libraries/akka-core/2.10/typed/coexisting.html
- https://doc.akka.io/reference/release-notes.html

---
*Source: [https://doc.akka.io/libraries/akka-core/2.10/cluster-sharding.html](https://doc.akka.io/libraries/akka-core/2.10/cluster-sharding.html)*