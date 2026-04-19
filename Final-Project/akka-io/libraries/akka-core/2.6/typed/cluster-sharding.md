---
description: Shard a clustered compute process across the network with locationally
  transparent message routing using Akka Cluster Sharding.
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:14:57Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/typed/cluster-sharding.html
title: Cluster Sharding • Akka Documentation
---

# Cluster Sharding • Akka Documentation

> **Summary:** Shard a clustered compute process across the network with locationally transparent message routing using Akka Cluster Sharding.

## Content

# Cluster Sharding

You are viewing the documentation for the new actor APIs, to view the Akka Classic documentation, see [Classic Cluster Sharding](../cluster-sharding.html)

## Module info

To use Akka Cluster Sharding, you must add the following dependency in your project:

sbt
```
val AkkaVersion = "2.6.21"
libraryDependencies += "com.typesafe.akka" %% "akka-cluster-sharding-typed" % AkkaVersion
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
      <version>2.6.21</version>
      <type>pom</type>
      <scope>import</scope>
    </dependency&gt
  </dependencies>
</dependencyManagement>
<dependencies&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-cluster-sharding-typed_${scala.binary.version}</artifactId>
  </dependency&gt
</dependencies>
```
Gradle
```
def versions = [
  ScalaBinary: "2.13"
]
dependencies {
  implementation platform("com.typesafe.akka:akka-bom_${versions.ScalaBinary}:2.6.21")

  implementation "com.typesafe.akka:akka-cluster-sharding-typed_${versions.ScalaBinary}"
}
```

| Project Info: Akka Cluster Sharding (typed) | |
| --- | --- |
| Artifact | com.typesafe.akka akka\-cluster\-sharding\-typed 2\.6\.21 [Snapshots are available](project/links.html#snapshots-repository) |
| JDK versions | Adopt OpenJDK 8Adopt OpenJDK 11 |
| Scala versions | 2\.13\.8, 2\.12\.16, 3\.1\.2 |
| JPMS module name | akka.cluster.sharding.typed |
| License | [Apache\-2\.0](https://www.apache.org/licenses/LICENSE-2.0.html) |
| Readiness level | [Supported](https://developer.lightbend.com/docs/introduction/getting-help/support-terminology.html#supported), [Lightbend Subscription](https://www.lightbend.com/lightbend-subscription) provides support Since 2\.6\.0, 2019\-11\-06 |
| Home page | <https://akka.io/> |
| API documentation | [API (Scaladoc)](https://doc.akka.io/api/akka-core/2.6.21/akka/cluster/sharding/typed/index.html) [API (Javadoc)](https://doc.akka.io/japi/akka-core/2.6.21/akka/cluster/sharding/typed/package-summary.html) |
| Forums | [Lightbend Discuss](https://discuss.akka.io) [akka/akka Gitter channel](https://gitter.im/akka/akka) |
| Release notes | [akka.io blog](https://akka.io/blog/news-archive.html) |
| Issues | [Github issues](https://github.com/akka/akka/issues) |
| Sources | <https://github.com/akka/akka> |

## Introduction

Cluster sharding is useful when you need to distribute actors across several nodes in the cluster and want to be able to interact with them using their logical identifier, but without having to care about their physical location in the cluster, which might also change over time.

It could for example be actors representing Aggregate Roots in Domain\-Driven Design terminology. Here we call these actors “entities”. These actors typically have persistent (durable) state, but this feature is not limited to actors with persistent state.

The [Introduction to Akka Cluster Sharding video](https://akka.io/blog/news/2019/12/16/akka-cluster-sharding-intro-video) is a good starting point for learning Cluster Sharding.

Cluster sharding is typically used when you have many stateful actors that together consume more resources (e.g. memory) than fit on one machine. If you only have a few stateful actors it might be easier to run them on a [Cluster Singleton](cluster-singleton.html) node. 

In this context sharding means that actors with an identifier, so called entities, can be automatically distributed across multiple nodes in the cluster. Each entity actor runs only at one place, and messages can be sent to the entity without requiring the sender to know the location of the destination actor. This is achieved by sending the messages via a `ShardRegion` actor provided by this extension, which knows how to route the message with the entity id to the final destination.

Cluster sharding will not be active on members with status [WeaklyUp](cluster-membership.html#weaklyup-members) if that feature is enabled.

Warning
Make sure to not use a Cluster downing strategy that may split the cluster into several separate clusters in case of network problems or system overload (long GC pauses), since that will result in *multiple shards and entities* being started, one in each separate cluster! See [Downing](cluster.html#downing).

## Basic example

Sharding is accessed via the [`ClusterSharding`](https://doc.akka.io/japi/akka-core/2.6/akka/cluster/sharding/typed/javadsl/ClusterSharding.html "akka.cluster.sharding.typed.javadsl.ClusterSharding")[`ClusterSharding`](https://doc.akka.io/api/akka-core/2.6/akka/cluster/sharding/typed/scaladsl/ClusterSharding.html "akka.cluster.sharding.typed.scaladsl.ClusterSharding") extension

Scala

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-cluster-sharding-typed/src/test/scala/docs/akka/cluster/sharding/typed/ShardingCompileOnlySpec.scala#L28-L33 "Go to snippet source")import akka.cluster.sharding.typed.ShardingEnvelope
import akka.cluster.sharding.typed.scaladsl.ClusterSharding
import akka.cluster.sharding.typed.scaladsl.EntityTypeKey
import akka.cluster.sharding.typed.scaladsl.EntityRef

val sharding = ClusterSharding(system)
```

Java

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-cluster-sharding-typed/src/test/java/jdocs/akka/cluster/sharding/typed/ShardingCompileOnlyTest.java#L18-L24 "Go to snippet source")import akka.cluster.sharding.typed.ShardingEnvelope;
import akka.cluster.sharding.typed.javadsl.ClusterSharding;
import akka.cluster.sharding.typed.javadsl.EntityTypeKey;
import akka.cluster.sharding.typed.javadsl.EntityRef;
import akka.cluster.sharding.typed.javadsl.Entity;
import akka.persistence.typed.PersistenceId;

ClusterSharding sharding = ClusterSharding.get(system);
```

It is common for sharding to be used with persistence however any [`Behavior`](https://doc.akka.io/api/akka-core/2.6/akka/actor/typed/Behavior.html "akka.actor.typed.Behavior")[`Behavior`](https://doc.akka.io/japi/akka-core/2.6/akka/actor/typed/Behavior.html "akka.actor.typed.Behavior") can be used with sharding e.g. a basic counter:

Scala

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-cluster-sharding-typed/src/test/scala/docs/akka/cluster/sharding/typed/ShardingCompileOnlySpec.scala#L37-L56 "Go to snippet source")object Counter {
  sealed trait Command
  case object Increment extends Command
  final case class GetValue(replyTo: ActorRef[Int]) extends Command

  def apply(entityId: String): Behavior[Command] = {
    def updated(value: Int): Behavior[Command] = {
      Behaviors.receiveMessage[Command] {
        case Increment =>
          updated(value + 1)
        case GetValue(replyTo) =>
          replyTo ! value
          Behaviors.same
      }
    }

    updated(0)

  }
}
```

Java

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-cluster-sharding-typed/src/test/java/jdocs/akka/cluster/sharding/typed/ShardingCompileOnlyTest.java#L43-L88 "Go to snippet source")public class Counter extends AbstractBehavior<Counter.Command> {

  public interface Command {}

  public enum Increment implements Command {
    INSTANCE
  }

  public static class GetValue implements Command {
    private final ActorRef<Integer> replyTo;

    public GetValue(ActorRef<Integer> replyTo) {
      this.replyTo = replyTo;
    }
  }

  public static Behavior<Command> create(String entityId) {
    return Behaviors.setup(context -> new Counter(context, entityId));
  }

  private final String entityId;
  private int value = 0;

  private Counter(ActorContext<Command> context, String entityId) {
    super(context);
    this.entityId = entityId;
  }

  @Override
  public Receive<Command> createReceive() {
    return newReceiveBuilder()
        .onMessage(Increment.class, msg -> onIncrement())
        .onMessage(GetValue.class, this::onGetValue)
        .build();
  }

  private Behavior<Command> onIncrement() {
    value++;
    return this;
  }

  private Behavior<Command> onGetValue(GetValue msg) {
    msg.replyTo.tell(value);
    return this;
  }
}
```

Each Entity type has a key that is then used to retrieve an EntityRef for a given entity identifier. Note in the sample’s `Counter.apply``Counter.create` function that the `entityId` parameter is not called, it is included to demonstrate how one can pass it to an entity. Another way to do this is by sending the `entityId` as part of the message if needed.

Scala

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-cluster-sharding-typed/src/test/scala/docs/akka/cluster/sharding/typed/ShardingCompileOnlySpec.scala#L60-L63 "Go to snippet source")val TypeKey = EntityTypeKey[Counter.Command]("Counter")

val shardRegion: ActorRef[ShardingEnvelope[Counter.Command]] =
  sharding.init(Entity(TypeKey)(createBehavior = entityContext => Counter(entityContext.entityId)))
```

Java

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-cluster-sharding-typed/src/test/java/jdocs/akka/cluster/sharding/typed/ShardingCompileOnlyTest.java#L195-L198 "Go to snippet source")EntityTypeKey<Counter.Command> typeKey = EntityTypeKey.create(Counter.Command.class, "Counter");

ActorRef<ShardingEnvelope<Counter.Command>> shardRegion =
    sharding.init(Entity.of(typeKey, ctx -> Counter.create(ctx.getEntityId())));
```

Messages to a specific entity are then sent via an [`EntityRef`](https://doc.akka.io/japi/akka-core/2.6/akka/cluster/sharding/typed/javadsl/EntityRef.html "akka.cluster.sharding.typed.javadsl.EntityRef")[`EntityRef`](https://doc.akka.io/api/akka-core/2.6/akka/cluster/sharding/typed/scaladsl/EntityRef.html "akka.cluster.sharding.typed.scaladsl.EntityRef"). The `entityId` and the name of the Entity’s key can be retrieved from the `EntityRef`. It is also possible to wrap methods in a [`ShardingEnvelope`](https://doc.akka.io/api/akka-core/2.6/akka/cluster/sharding/typed/ShardingEnvelope.html "akka.cluster.sharding.typed.ShardingEnvelope")[`ShardingEnvelope`](https://doc.akka.io/japi/akka-core/2.6/akka/cluster/sharding/typed/ShardingEnvelope.html "akka.cluster.sharding.typed.ShardingEnvelope") or define extractor functions and send messages directly to the shard region.

Scala

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-cluster-sharding-typed/src/test/scala/docs/akka/cluster/sharding/typed/ShardingCompileOnlySpec.scala#L67-L72 "Go to snippet source")// With an EntityRef
val counterOne: EntityRef[Counter.Command] = sharding.entityRefFor(TypeKey, "counter-1")
counterOne ! Counter.Increment

// Entity id is specified via an `ShardingEnvelope`
shardRegion ! ShardingEnvelope("counter-1", Counter.Increment)
```

Java

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-cluster-sharding-typed/src/test/java/jdocs/akka/cluster/sharding/typed/ShardingCompileOnlyTest.java#L202-L205 "Go to snippet source")EntityRef<Counter.Command> counterOne = sharding.entityRefFor(typeKey, "counter-1");
counterOne.tell(Counter.Increment.INSTANCE);

shardRegion.tell(new ShardingEnvelope<>("counter-1", Counter.Increment.INSTANCE));
```

Cluster sharding [`init`](https://doc.akka.io/japi/akka-core/2.6/akka/cluster/sharding/typed/javadsl/ClusterSharding.html#init(akka.cluster.sharding.typed.javadsl.Entity) "akka.cluster.sharding.typed.javadsl.ClusterSharding")[`init`](https://doc.akka.io/api/akka-core/2.6/akka/cluster/sharding/typed/scaladsl/ClusterSharding.html#init[M,E](entity:akka.cluster.sharding.typed.scaladsl.Entity[M,E]):akka.actor.typed.ActorRef[E] "akka.cluster.sharding.typed.scaladsl.ClusterSharding") should be called on every node for each entity type. Which nodes entity actors are created on can be controlled with [roles](cluster.html#node-roles). `init` will create a `ShardRegion` or a proxy depending on whether the node’s role matches the entity’s role. 

The behavior factory lambda passed to the init method is defined on each node and only used locally, this means it is safe to use it for injecting for example a node local [`ActorRef`](https://doc.akka.io/api/akka-core/2.6/akka/actor/typed/ActorRef.html "akka.actor.typed.ActorRef")[`ActorRef`](https://doc.akka.io/japi/akka-core/2.6/akka/actor/typed/ActorRef.html "akka.actor.typed.ActorRef") that each sharded actor should have access to or some object that is not possible to serialize.

Specifying the role:

Scala

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-cluster-sharding-typed/src/test/scala/docs/akka/cluster/sharding/typed/ShardingCompileOnlySpec.scala#L84-L85 "Go to snippet source")sharding.init(
  Entity(TypeKey)(createBehavior = entityContext => Counter(entityContext.entityId)).withRole("backend"))
```

Java

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-cluster-sharding-typed/src/test/java/jdocs/akka/cluster/sharding/typed/ShardingCompileOnlyTest.java#L214-L218 "Go to snippet source")EntityTypeKey<Counter.Command> typeKey = EntityTypeKey.create(Counter.Command.class, "Counter");

ActorRef<ShardingEnvelope<Counter.Command>> shardRegionOrProxy =
    sharding.init(
        Entity.of(typeKey, ctx -> Counter.create(ctx.getEntityId())).withRole("backend"));
```

### A note about EntityRef and serialization

If including [`EntityRef`](https://doc.akka.io/japi/akka-core/2.6/akka/cluster/sharding/typed/javadsl/EntityRef.html "akka.cluster.sharding.typed.javadsl.EntityRef")[`EntityRef`](https://doc.akka.io/api/akka-core/2.6/akka/cluster/sharding/typed/scaladsl/EntityRef.html "akka.cluster.sharding.typed.scaladsl.EntityRef")’s in messages or the `State`/`Event`s of an [`EventSourcedBehavior`](https://doc.akka.io/japi/akka-core/2.6/akka/persistence/typed/javadsl/EventSourcedBehavior.html "akka.persistence.typed.javadsl.EventSourcedBehavior")[`EventSourcedBehavior`](https://doc.akka.io/api/akka-core/2.6/akka/persistence/typed/scaladsl/EventSourcedBehavior.html "akka.persistence.typed.scaladsl.EventSourcedBehavior"), those `EntityRef`s will need to be serialized. The `entityId`, `typeKey`, and (in multi\-DC use\-cases) `dataCenter` of an `EntityRef``getEntityId`, `getTypeKey`, and (in multi\-DC use\-cases) `getDataCenter` methods of an `EntityRef` provide exactly the information needed upon deserialization to regenerate an `EntityRef` equivalent to the one serialized, given an expected type of messages to send to the entity.

At this time, serialization of `EntityRef`s requires a [custom serializer](../serialization.html#customization), as the specific [`EntityTypeKey`](https://doc.akka.io/japi/akka-core/2.6/akka/cluster/sharding/typed/javadsl/EntityTypeKey.html "akka.cluster.sharding.typed.javadsl.EntityTypeKey")[`EntityTypeKey`](https://doc.akka.io/api/akka-core/2.6/akka/cluster/sharding/typed/scaladsl/EntityTypeKey.html "akka.cluster.sharding.typed.scaladsl.EntityTypeKey") (including the type of message which the desired entity type accepts) should not simply be encoded in the serialized representation but looked up on the deserializing side.

## Persistence example

When using sharding, entities can be moved to different nodes in the cluster. Persistence can be used to recover the state of an actor after it has moved.

Akka Persistence is based on the single\-writer principle, for a particular [`PersistenceId`](https://doc.akka.io/api/akka-core/2.6/akka/persistence/typed/PersistenceId.html "akka.persistence.typed.PersistenceId")[`PersistenceId`](https://doc.akka.io/japi/akka-core/2.6/akka/persistence/typed/PersistenceId.html "akka.persistence.typed.PersistenceId") only one persistent actor instance should be active. If multiple instances were to persist events at the same time, the events would be interleaved and might not be interpreted correctly on replay. Cluster Sharding is typically used together with persistence to ensure that there is only one active entity for each `PersistenceId` (`entityId`).

Here is an example of a persistent actor that is used as a sharded entity:

Scala

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-cluster-sharding-typed/src/test/scala/docs/akka/cluster/sharding/typed/HelloWorldPersistentEntityExample.scala#L46-L91 "Go to snippet source")import akka.actor.typed.Behavior
import akka.cluster.sharding.typed.scaladsl.EntityTypeKey
import akka.persistence.typed.scaladsl.Effect

object HelloWorld {

  // Command
  sealed trait Command extends CborSerializable
  final case class Greet(whom: String)(val replyTo: ActorRef[Greeting]) extends Command
  // Response
  final case class Greeting(whom: String, numberOfPeople: Int) extends CborSerializable

  // Event
  final case class Greeted(whom: String) extends CborSerializable

  // State
  final case class KnownPeople(names: Set[String]) extends CborSerializable {
    def add(name: String): KnownPeople = copy(names = names + name)

    def numberOfPeople: Int = names.size
  }

  private val commandHandler: (KnownPeople, Command) => Effect[Greeted, KnownPeople] = { (_, cmd) =>
    cmd match {
      case cmd: Greet => greet(cmd)
    }
  }

  private def greet(cmd: Greet): Effect[Greeted, KnownPeople] =
    Effect.persist(Greeted(cmd.whom)).thenRun(state => cmd.replyTo ! Greeting(cmd.whom, state.numberOfPeople))

  private val eventHandler: (KnownPeople, Greeted) => KnownPeople = { (state, evt) =>
    state.add(evt.whom)
  }

  val TypeKey: EntityTypeKey[Command] =
    EntityTypeKey[Command]("HelloWorld")

  def apply(entityId: String, persistenceId: PersistenceId): Behavior[Command] = {
    Behaviors.setup { context =>
      context.log.info("Starting HelloWorld {}", entityId)
      EventSourcedBehavior(persistenceId, emptyState = KnownPeople(Set.empty), commandHandler, eventHandler)
    }
  }

}
```

Java

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-cluster-sharding-typed/src/test/java/jdocs/akka/cluster/sharding/typed/HelloWorldPersistentEntityExample.java#L18-L23 "Go to snippet source")import akka.actor.typed.javadsl.Behaviors;
import akka.cluster.sharding.typed.javadsl.EntityTypeKey;
import akka.persistence.typed.PersistenceId;
import akka.persistence.typed.javadsl.CommandHandler;
import akka.persistence.typed.javadsl.Effect;
import akka.persistence.typed.javadsl.EventHandler;

public static class HelloWorld
    extends EventSourcedBehavior<HelloWorld.Command, HelloWorld.Greeted, HelloWorld.KnownPeople> {

  // Command
  public interface Command extends CborSerializable {}

  public static final class Greet implements Command {
    public final String whom;
    public final ActorRef<Greeting> replyTo;

    public Greet(String whom, ActorRef<Greeting> replyTo) {
      this.whom = whom;
      this.replyTo = replyTo;
    }
  }

  // Response
  public static final class Greeting implements CborSerializable {
    public final String whom;
    public final int numberOfPeople;

    public Greeting(String whom, int numberOfPeople) {
      this.whom = whom;
      this.numberOfPeople = numberOfPeople;
    }
  }

  // Event
  public static final class Greeted implements CborSerializable {
    public final String whom;

    @JsonCreator
    public Greeted(String whom) {
      this.whom = whom;
    }
  }

  // State
  static final class KnownPeople implements CborSerializable {
    private Set<String> names = Collections.emptySet();

    KnownPeople() {}

    private KnownPeople(Set<String> names) {
      this.names = names;
    }

    KnownPeople add(String name) {
      Set<String> newNames = new HashSet<>(names);
      newNames.add(name);
      return new KnownPeople(newNames);
    }

    int numberOfPeople() {
      return names.size();
    }
  }

  public static final EntityTypeKey<Command> ENTITY_TYPE_KEY =
      EntityTypeKey.create(Command.class, "HelloWorld");

  public static Behavior<Command> create(String entityId, PersistenceId persistenceId) {
    return Behaviors.setup(context -> new HelloWorld(context, entityId, persistenceId));
  }

  private HelloWorld(
      ActorContext<Command> context, String entityId, PersistenceId persistenceId) {
    super(persistenceId);
    context.getLog().info("Starting HelloWorld {}", entityId);
  }

  @Override
  public KnownPeople emptyState() {
    return new KnownPeople();
  }

  @Override
  public CommandHandler<Command, Greeted, KnownPeople> commandHandler() {
    return newCommandHandlerBuilder().forAnyState().onCommand(Greet.class, this::greet).build();
  }

  private Effect<Greeted, KnownPeople> greet(KnownPeople state, Greet cmd) {
    return Effect()
        .persist(new Greeted(cmd.whom))
        .thenRun(newState -> cmd.replyTo.tell(new Greeting(cmd.whom, newState.numberOfPeople())));
  }

  @Override
  public EventHandler<KnownPeople, Greeted> eventHandler() {
    return (state, evt) -> state.add(evt.whom);
  }
}
```

To initialize and use the entity:

Scala

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-cluster-sharding-typed/src/test/scala/docs/akka/cluster/sharding/typed/HelloWorldPersistentEntityExample.scala#L20-L42 "Go to snippet source")import akka.cluster.sharding.typed.scaladsl.ClusterSharding
import akka.cluster.sharding.typed.scaladsl.Entity
import akka.util.Timeout

class HelloWorldService(system: ActorSystem[_]) {
  import system.executionContext

  private val sharding = ClusterSharding(system)

  // registration at startup
  sharding.init(Entity(typeKey = HelloWorld.TypeKey) { entityContext =>
    HelloWorld(entityContext.entityId, PersistenceId(entityContext.entityTypeKey.name, entityContext.entityId))
  })

  private implicit val askTimeout: Timeout = Timeout(5.seconds)

  def greet(worldId: String, whom: String): Future[Int] = {
    val entityRef = sharding.entityRefFor(HelloWorld.TypeKey, worldId)
    val greeting = entityRef ? HelloWorld.Greet(whom)
    greeting.map(_.numberOfPeople)
  }

}
```

Java

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-cluster-sharding-typed/src/test/java/jdocs/akka/cluster/sharding/typed/HelloWorldPersistentEntityExample.java#L27-L33 "Go to snippet source")import akka.cluster.sharding.typed.javadsl.ClusterSharding;
import akka.cluster.sharding.typed.javadsl.EntityRef;
import akka.cluster.sharding.typed.javadsl.Entity;
import akka.persistence.typed.javadsl.EventSourcedBehavior;
import akka.serialization.jackson.CborSerializable;
import akka.util.Timeout;
import com.fasterxml.jackson.annotation.JsonCreator;

public static class HelloWorldService {
  private final ActorSystem<?> system;
  private final ClusterSharding sharding;
  private final Duration askTimeout = Duration.ofSeconds(5);

  // registration at startup
  public HelloWorldService(ActorSystem<?> system) {
    this.system = system;
    sharding = ClusterSharding.get(system);

    // registration at startup
    sharding.init(
        Entity.of(
            HelloWorld.ENTITY_TYPE_KEY,
            entityContext ->
                HelloWorld.create(
                    entityContext.getEntityId(),
                    PersistenceId.of(
                        entityContext.getEntityTypeKey().name(), entityContext.getEntityId()))));
  }

  // usage example
  public CompletionStage<Integer> sayHello(String worldId, String whom) {
    EntityRef<HelloWorld.Command> entityRef =
        sharding.entityRefFor(HelloWorld.ENTITY_TYPE_KEY, worldId);
    CompletionStage<HelloWorld.Greeting> result =
        entityRef.ask(replyTo -> new HelloWorld.Greet(whom, replyTo), askTimeout);
    return result.thenApply(greeting -> greeting.numberOfPeople);
  }
}
```

Note how an unique [`PersistenceId`](https://doc.akka.io/api/akka-core/2.6/akka/persistence/typed/PersistenceId.html "akka.persistence.typed.PersistenceId")[`PersistenceId`](https://doc.akka.io/japi/akka-core/2.6/akka/persistence/typed/PersistenceId.html "akka.persistence.typed.PersistenceId") can be constructed from the [`EntityTypeKey`](https://doc.akka.io/japi/akka-core/2.6/akka/cluster/sharding/typed/javadsl/EntityTypeKey.html "akka.cluster.sharding.typed.javadsl.EntityTypeKey")[`EntityTypeKey`](https://doc.akka.io/api/akka-core/2.6/akka/cluster/sharding/typed/scaladsl/EntityTypeKey.html "akka.cluster.sharding.typed.scaladsl.EntityTypeKey") and the `entityId` provided by the [`EntityContext`](https://doc.akka.io/japi/akka-core/2.6/akka/cluster/sharding/typed/javadsl/EntityContext.html "akka.cluster.sharding.typed.javadsl.EntityContext")[`EntityContext`](https://doc.akka.io/api/akka-core/2.6/akka/cluster/sharding/typed/scaladsl/EntityContext.html "akka.cluster.sharding.typed.scaladsl.EntityContext") in the factory function for the [`Behavior`](https://doc.akka.io/api/akka-core/2.6/akka/actor/typed/Behavior.html "akka.actor.typed.Behavior")[`Behavior`](https://doc.akka.io/japi/akka-core/2.6/akka/actor/typed/Behavior.html "akka.actor.typed.Behavior"). This is a typical way of defining the `PersistenceId` but other formats are possible, as described in the [PersistenceId section](persistence.html#persistenceid).

Sending messages to persistent entities is the same as if the entity wasn’t persistent. The only difference is when an entity is moved the state will be restored. In the above example [ask](interaction-patterns.html#outside-ask) is used but `tell` or any of the other [Interaction Patterns](interaction-patterns.html) can be used.

See [persistence](persistence.html) for more details.

## Shard allocation

A shard is a group of entities that will be managed together. The grouping is typically defined by a hashing function of the `entityId`. For a specific entity identifier the shard identifier must always be the same. Otherwise the entity actor might accidentally be started in several places at the same time.

By default the shard identifier is the absolute value of the `hashCode` of the entity identifier modulo the total number of shards. The number of shards is configured by:

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-cluster-sharding-typed/src/main/resources/reference.conf#L4-L11 "Go to snippet source")akka.cluster.sharding {
  # Number of shards used by the default HashCodeMessageExtractor
  # when no other message extractor is defined. This value must be
  # the same for all nodes in the cluster and that is verified by
  # configuration check when joining. Changing the value requires
  # stopping all nodes in the cluster.
  number-of-shards = 1000
}
```

As a rule of thumb, the number of shards should be a factor ten greater than the planned maximum number of cluster nodes. It doesn’t have to be exact. Fewer shards than number of nodes will result in that some nodes will not host any shards. Too many shards will result in less efficient management of the shards, e.g. rebalancing overhead, and increased latency because the coordinator is involved in the routing of the first message for each shard.

The `number-of-shards` configuration value must be the same for all nodes in the cluster and that is verified by configuration check when joining. Changing the value requires stopping all nodes in the cluster.

The shards are allocated to the nodes in the cluster. The decision of where to allocate a shard is done by a shard allocation strategy. 

The default implementation `LeastShardAllocationStrategy` allocates new shards to the `ShardRegion` (node) with least number of previously allocated shards. This strategy can be replaced by an application specific implementation.

When a node is added to the cluster the shards on the existing nodes will be rebalanced to the new node. The `LeastShardAllocationStrategy` picks shards for rebalancing from the `ShardRegion`s with most number of previously allocated shards. They will then be allocated to the `ShardRegion` with least number of previously allocated shards, i.e. new members in the cluster. The amount of shards to rebalance in each round can be limited to make it progress slower since rebalancing too many shards at the same time could result in additional load on the system. For example, causing many Event Sourced entites to be started at the same time.

A new rebalance algorithm was included in Akka 2\.6\.10\. It can reach optimal balance in a few rebalance rounds (typically 1 or 2 rounds). For backwards compatibility the new algorithm is not enabled by default. The new algorithm is recommended and will become the default in future versions of Akka. You enable the new algorithm by setting `rebalance-absolute-limit` \> 0, for example:

```
akka.cluster.sharding.least-shard-allocation-strategy.rebalance-absolute-limit = 20

```

The `rebalance-absolute-limit` is the maximum number of shards that will be rebalanced in one rebalance round.

You may also want to tune the `akka.cluster.sharding.least-shard-allocation-strategy.rebalance-relative-limit`. The `rebalance-relative-limit` is a fraction (\< 1\.0\) of total number of (known) shards that will be rebalanced in one rebalance round. The lower result of `rebalance-relative-limit` and `rebalance-absolute-limit` will be used.

### External shard allocation

An alternative allocation strategy is the [`ExternalShardAllocationStrategy`](https://doc.akka.io/api/akka-core/2.6/akka/cluster/sharding/external/ExternalShardAllocationStrategy.html "akka.cluster.sharding.external.ExternalShardAllocationStrategy")[`ExternalShardAllocationStrategy`](https://doc.akka.io/japi/akka-core/2.6/akka/cluster/sharding/external/ExternalShardAllocationStrategy.html "akka.cluster.sharding.external.ExternalShardAllocationStrategy") which allows explicit control over where shards are allocated via the [`ExternalShardAllocation`](https://doc.akka.io/api/akka-core/2.6/akka/cluster/sharding/external/ExternalShardAllocation.html "akka.cluster.sharding.external.ExternalShardAllocation")[`ExternalShardAllocation`](https://doc.akka.io/japi/akka-core/2.6/akka/cluster/sharding/external/ExternalShardAllocation.html "akka.cluster.sharding.external.ExternalShardAllocation") extension.

This can be used, for example, to match up Kafka Partition consumption with shard locations. The video [How to co\-locate Kafka Partitions with Akka Cluster Shards](https://akka.io/blog/news/2020/03/18/akka-sharding-kafka-video) explains a setup for it. Alpakka Kafka provides [an extension for Akka Cluster Sharding](https://doc.akka.io/docs/alpakka-kafka/current/cluster-sharding.html).

To use it set it as the allocation strategy on your [`Entity`](https://doc.akka.io/japi/akka-core/2.6/akka/cluster/sharding/typed/javadsl/Entity.html "akka.cluster.sharding.typed.javadsl.Entity")[`Entity`](https://doc.akka.io/api/akka-core/2.6/akka/cluster/sharding/typed/scaladsl/Entity.html "akka.cluster.sharding.typed.scaladsl.Entity"):

Scala

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-cluster-sharding-typed/src/test/scala/docs/akka/cluster/sharding/typed/ExternalShardAllocationCompileOnlySpec.scala#L28-L31 "Go to snippet source")val TypeKey = EntityTypeKey[Counter.Command]("Counter")

val entity = Entity(TypeKey)(createBehavior = entityContext => Counter(entityContext.entityId))
  .withAllocationStrategy(new ExternalShardAllocationStrategy(system, TypeKey.name))
```

Java

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-cluster-sharding-typed/src/test/java/jdocs/akka/cluster/sharding/typed/ExternalShardAllocationCompileOnlyTest.java#L30-L33 "Go to snippet source")EntityTypeKey<Counter.Command> typeKey = EntityTypeKey.create(Counter.Command.class, "Counter");

ActorRef<ShardingEnvelope<Counter.Command>> shardRegion =
    sharding.init(Entity.of(typeKey, ctx -> Counter.create(ctx.getEntityId())));
```

For any shardId that has not been allocated it will be allocated to the requesting node. To make explicit allocations:

Scala

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-cluster-sharding-typed/src/test/scala/docs/akka/cluster/sharding/typed/ExternalShardAllocationCompileOnlySpec.scala#L38-L39 "Go to snippet source")val client: ExternalShardAllocationClient = ExternalShardAllocation(system).clientFor(TypeKey.name)
val done: Future[Done] = client.updateShardLocation("shard-id-1", Address("akka", "system", "127.0.0.1", 2552))
```

Java

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-cluster-sharding-typed/src/test/java/jdocs/akka/cluster/sharding/typed/ExternalShardAllocationCompileOnlyTest.java#L37-L40 "Go to snippet source")ExternalShardAllocationClient client =
    ExternalShardAllocation.get(system).getClient(typeKey.name());
CompletionStage<Done> done =
    client.setShardLocation("shard-id-1", new Address("akka", "system", "127.0.0.1", 2552));
```

Any new or moved shard allocations will be moved on the next rebalance.

The communication from the client to the shard allocation strategy is via [Distributed Data](distributed-data.html). It uses a single [`LWWMap`](https://doc.akka.io/api/akka-core/2.6/akka/cluster/ddata/LWWMap.html "akka.cluster.ddata.LWWMap")[`LWWMap`](https://doc.akka.io/japi/akka-core/2.6/akka/cluster/ddata/LWWMap.html "akka.cluster.ddata.LWWMap") that can support 10s of thousands of shards. Later versions could use multiple keys to support a greater number of shards.

#### Example project for external allocation strategy

[Kafka to Cluster Sharding](https://developer.lightbend.com/start/?group=akka&project=akka-samples-kafka-to-sharding) is an example project that can be downloaded, and with instructions of how to run, that demonstrates how to use external sharding to co\-locate Kafka partition consumption with shards.

### Custom shard allocation

An optional custom shard allocation strategy can be passed into the optional parameter when initializing an entity type or explicitly using the [`withAllocationStrategy`](https://doc.akka.io/japi/akka-core/2.6/akka/cluster/sharding/typed/javadsl/Entity.html#withAllocationStrategy(akka.cluster.sharding.ShardCoordinator.ShardAllocationStrategy) "akka.cluster.sharding.typed.javadsl.Entity")[`withAllocationStrategy`](https://doc.akka.io/api/akka-core/2.6/akka/cluster/sharding/typed/scaladsl/Entity.html#withAllocationStrategy(newAllocationStrategy:akka.cluster.sharding.ShardCoordinator.ShardAllocationStrategy):akka.cluster.sharding.typed.scaladsl.Entity[M,E] "akka.cluster.sharding.typed.scaladsl.Entity") function. See the API documentation of [`ShardAllocationStrategy`](https://doc.akka.io/api/akka-core/2.6/akka/cluster/sharding/ShardCoordinator$$ShardAllocationStrategy.html "akka.cluster.sharding.ShardCoordinator.ShardAllocationStrategy")[`AbstractShardAllocationStrategy`](https://doc.akka.io/japi/akka-core/2.6/akka/cluster/sharding/ShardCoordinator.AbstractShardAllocationStrategy.html "akka.cluster.sharding.ShardCoordinator.AbstractShardAllocationStrategy") for details of how to implement a custom `ShardAllocationStrategy`.

## How it works

See [Cluster Sharding concepts](cluster-sharding-concepts.html).

## Passivation

If the state of the entities are persistent you may stop entities that are not used to reduce memory consumption. This is done by the application specific implementation of the entity actors for example by defining receive timeout ([`context.setReceiveTimeout`](https://doc.akka.io/japi/akka-core/2.6/akka/actor/typed/javadsl/ActorContext.html#setReceiveTimeout(java.time.Duration,T) "akka.actor.typed.javadsl.ActorContext")[`context.setReceiveTimeout`](https://doc.akka.io/api/akka-core/2.6/akka/actor/typed/scaladsl/ActorContext.html#setReceiveTimeout(timeout:scala.concurrent.duration.FiniteDuration,msg:T):Unit "akka.actor.typed.scaladsl.ActorContext")). If a message is already enqueued to the entity when it stops itself the enqueued message in the mailbox will be dropped. To support graceful passivation without losing such messages the entity actor can send [`ClusterSharding.Passivate`](https://doc.akka.io/japi/akka-core/2.6/akka/cluster/sharding/typed/javadsl/ClusterSharding.Passivate.html "akka.cluster.sharding.typed.javadsl.ClusterSharding.Passivate")[`ClusterSharding.Passivate`](https://doc.akka.io/api/akka-core/2.6/akka/cluster/sharding/typed/scaladsl/ClusterSharding$$Passivate.html "akka.cluster.sharding.typed.scaladsl.ClusterSharding.Passivate") to the [`ActorRef`](https://doc.akka.io/api/akka-core/2.6/akka/actor/typed/ActorRef.html "akka.actor.typed.ActorRef")[`ActorRef`](https://doc.akka.io/japi/akka-core/2.6/akka/actor/typed/ActorRef.html "akka.actor.typed.ActorRef")\[[`ShardCommand`](https://doc.akka.io/api/akka-core/2.6/akka/cluster/sharding/typed/scaladsl/ClusterSharding$$ShardCommand.html "akka.cluster.sharding.typed.scaladsl.ClusterSharding.ShardCommand")]\<[`ShardCommand`](https://doc.akka.io/japi/akka-core/2.6/akka/cluster/sharding/typed/javadsl/ClusterSharding.ShardCommand.html "akka.cluster.sharding.typed.javadsl.ClusterSharding.ShardCommand")\> that was passed in to the factory method when creating the entity. The optional `stopMessage` message will be sent back to the entity, which is then supposed to stop itself, otherwise it will be stopped automatically. Incoming messages will be buffered by the `Shard` between reception of `Passivate` and termination of the entity. Such buffered messages are thereafter delivered to a new incarnation of the entity.

Scala

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-cluster-sharding-typed/src/test/scala/docs/akka/cluster/sharding/typed/ShardingCompileOnlySpec.scala#L95-L124 "Go to snippet source")object Counter {
  sealed trait Command
  case object Increment extends Command
  final case class GetValue(replyTo: ActorRef[Int]) extends Command
  private case object Idle extends Command
  case object GoodByeCounter extends Command

  def apply(shard: ActorRef[ClusterSharding.ShardCommand], entityId: String): Behavior[Command] = {
    Behaviors.setup { ctx =>
      def updated(value: Int): Behavior[Command] =
        Behaviors.receiveMessage[Command] {
          case Increment =>
            updated(value + 1)
          case GetValue(replyTo) =>
            replyTo ! value
            Behaviors.same
          case Idle =>
            // after receive timeout
            shard ! ClusterSharding.Passivate(ctx.self)
            Behaviors.same
          case GoodByeCounter =>
            // the stopMessage, used for rebalance and passivate
            Behaviors.stopped
        }

      ctx.setReceiveTimeout(30.seconds, Idle)
      updated(0)
    }
  }
}
```

Java

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-cluster-sharding-typed/src/test/java/jdocs/akka/cluster/sharding/typed/ShardingCompileOnlyTest.java#L92-L168 "Go to snippet source")public class Counter2 extends AbstractBehavior<Counter2.Command> {

  public interface Command {}

  private enum Idle implements Command {
    INSTANCE
  }

  public enum GoodByeCounter implements Command {
    INSTANCE
  }

  public enum Increment implements Command {
    INSTANCE
  }

  public static class GetValue implements Command {
    private final ActorRef<Integer> replyTo;

    public GetValue(ActorRef<Integer> replyTo) {
      this.replyTo = replyTo;
    }
  }

  public static Behavior<Command> create(
      ActorRef<ClusterSharding.ShardCommand> shard, String entityId) {
    return Behaviors.setup(
        ctx -> {
          ctx.setReceiveTimeout(Duration.ofSeconds(30), Idle.INSTANCE);
          return new Counter2(ctx, shard, entityId);
        });
  }

  private final ActorRef<ClusterSharding.ShardCommand> shard;
  private final String entityId;
  private int value = 0;

  private Counter2(
      ActorContext<Command> context,
      ActorRef<ClusterSharding.ShardCommand> shard,
      String entityId) {
    super(context);
    this.shard = shard;
    this.entityId = entityId;
  }

  @Override
  public Receive<Command> createReceive() {
    return newReceiveBuilder()
        .onMessage(Increment.class, msg -> onIncrement())
        .onMessage(GetValue.class, this::onGetValue)
        .onMessage(Idle.class, msg -> onIdle())
        .onMessage(GoodByeCounter.class, msg -> onGoodByeCounter())
        .build();
  }

  private Behavior<Command> onIncrement() {
    value++;
    return this;
  }

  private Behavior<Command> onGetValue(GetValue msg) {
    msg.replyTo.tell(value);
    return this;
  }

  private Behavior<Command> onIdle() {
    // after receive timeout
    shard.tell(new ClusterSharding.Passivate<>(getContext().getSelf()));
    return this;
  }

  private Behavior<Command> onGoodByeCounter() {
    // the stopMessage, used for rebalance and passivate
    return Behaviors.stopped();
  }
}
```

and then initialized with:

Scala

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-cluster-sharding-typed/src/test/scala/docs/akka/cluster/sharding/typed/ShardingCompileOnlySpec.scala#L128-L131 "Go to snippet source")val TypeKey = EntityTypeKey[Counter.Command]("Counter")

ClusterSharding(system).init(Entity(TypeKey)(createBehavior = entityContext =>
  Counter(entityContext.shard, entityContext.entityId)).withStopMessage(Counter.GoodByeCounter))
```

Java

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-cluster-sharding-typed/src/test/java/jdocs/akka/cluster/sharding/typed/ShardingCompileOnlyTest.java#L176-L182 "Go to snippet source")  
EntityTypeKey<Counter2.Command> typeKey =
    EntityTypeKey.create(Counter2.Command.class, "Counter");

sharding.init(
    Entity.of(typeKey, ctx -> Counter2.create(ctx.getShard(), ctx.getEntityId()))
        .withStopMessage(Counter2.GoodByeCounter.INSTANCE));
```

Note that in the above example the `stopMessage` is specified as `GoodByeCounter`. That message will be sent to the entity when it’s supposed to stop itself due to rebalance or passivation. If the `stopMessage` is not defined it will be stopped automatically without receiving a specific message. It can be useful to define a custom stop message if the entity needs to perform some asynchronous cleanup or interactions before stopping.

The stop message is only sent locally, from the shard to the entity so does not require an entity id to end up in the right actor. When using a custom [`ShardingMessageExtractor`](https://doc.akka.io/api/akka-core/2.6/akka/cluster/sharding/typed/ShardingMessageExtractor.html "akka.cluster.sharding.typed.ShardingMessageExtractor")[`ShardingMessageExtractor`](https://doc.akka.io/japi/akka-core/2.6/akka/cluster/sharding/typed/ShardingMessageExtractor.html "akka.cluster.sharding.typed.ShardingMessageExtractor") without envelopes, the extractor will still have to handle the stop message type to please the compiler, even though it will never actually be passed to the extractor.

## Automatic Passivation

Entities are automatically passivated based on a passivation strategy. The default passivation strategy is to [passivate idle entities](#idle-entity-passivation) when they haven’t received a message within a specified interval, and this is the current default strategy to maintain compatibility with earlier versions. It’s recommended to switch to a [passivation strategy with an active entity limit](#active-entity-limits) and a pre\-configured default strategy is provided. Active entity limits and idle entity timeouts can also be used together.

Note
The automatic passivation strategies, except [passivate idle entities](#idle-entity-passivation) are marked as [may change](../common/may-change.html) in the sense of being the subject of final development. This means that the configuration or semantics can change without warning or deprecation period. The passivation strategies can be used in production, but we reserve the right to adjust the configuration after additional testing and feedback.

Automatic passivation can be disabled by setting `akka.cluster.sharding.passivation.strategy = none`. It is disabled automatically if [Remembering Entities](cluster-sharding.html#remembering-entities) is enabled.

Note
Only messages sent through Cluster Sharding are counted as entity activity for automatic passivation. Messages sent directly to the [`ActorRef`](https://doc.akka.io/api/akka-core/2.6/akka/actor/typed/ActorRef.html "akka.actor.typed.ActorRef")[`ActorRef`](https://doc.akka.io/japi/akka-core/2.6/akka/actor/typed/ActorRef.html "akka.actor.typed.ActorRef"), including messages that the actor sends to itself, are not counted as entity activity.

### Idle entity passivation

Idle entities can be automatically passivated when they have not received a message for a specified length of time. This is currently the default strategy, for compatibility, and is enabled automatically with a timeout of 2 minutes. Specify a different idle timeout with configuration:

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-cluster-sharding/src/test/scala/akka/cluster/sharding/ClusterShardingSettingsSpec.scala#L38-L40 "Go to snippet source")akka.cluster.sharding.passivation {
  default-idle-strategy.idle-entity.timeout = 3 minutes
}
```

Or specify the idle timeout as a duration using the [`withPassivationStrategy`](https://doc.akka.io/api/akka-core/2.6/akka/cluster/sharding/typed/ClusterShardingSettings.html#withPassivationStrategy(settings:akka.cluster.sharding.typed.ClusterShardingSettings.PassivationStrategySettings):akka.cluster.sharding.typed.ClusterShardingSettings "akka.cluster.sharding.typed.ClusterShardingSettings")[`withPassivationStrategy`](https://doc.akka.io/japi/akka-core/2.6/akka/cluster/sharding/typed/ClusterShardingSettings.html#withPassivationStrategy(akka.cluster.sharding.typed.ClusterShardingSettings.PassivationStrategySettings) "akka.cluster.sharding.typed.ClusterShardingSettings") method on `ClusterShardingSettings`.

Idle entity timeouts can be enabled and configured for any passivation strategy.

### Active entity limits

Automatic passivation strategies can limit the number of active entities. Limit\-based passivation strategies use a replacement policy to determine which active entities should be passivated when the active entity limit is exceeded. The configurable limit is for a whole shard region and is divided evenly among the active shards in each region.

A recommended passivation strategy, which will become the new default passivation strategy in future versions of Akka Cluster Sharding, can be enabled with configuration:

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-cluster-sharding/src/test/scala/akka/cluster/sharding/ClusterShardingSettingsSpec.scala#L83-L85 "Go to snippet source")akka.cluster.sharding.passivation {
  strategy = default-strategy
}
```

This default strategy uses a [composite passivation strategy](#composite-passivation-strategies) which combines recency\-based and frequency\-based tracking: the main area is configured with a [segmented least recently used policy](#segmented-least-recently-used-policy) with a frequency\-biased [admission filter](#admission-filter), fronted by a recency\-biased [admission window](#admission-window-policy) with [adaptive sizing](#admission-window-optimizer) enabled.

The active entity limit for the default strategy can be configured:

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-cluster-sharding/src/test/scala/akka/cluster/sharding/ClusterShardingSettingsSpec.scala#L109-L114 "Go to snippet source")akka.cluster.sharding.passivation {
  strategy = default-strategy
  default-strategy {
    active-entity-limit = 1000000
  }
}
```

Or using the [`withActiveEntityLimit`](https://doc.akka.io/api/akka-core/2.6/akka/cluster/sharding/typed/ClusterShardingSettings$$PassivationStrategySettings.html#withActiveEntityLimit(limit:Int):akka.cluster.sharding.typed.ClusterShardingSettings.PassivationStrategySettings "akka.cluster.sharding.typed.ClusterShardingSettings.PassivationStrategySettings")[`withActiveEntityLimit`](https://doc.akka.io/japi/akka-core/2.6/akka/cluster/sharding/typed/ClusterShardingSettings.PassivationStrategySettings.html#withActiveEntityLimit(int) "akka.cluster.sharding.typed.ClusterShardingSettings.PassivationStrategySettings") method on `ClusterShardingSettings.PassivationStrategySettings`.

An [idle entity timeout](#idle-entity-passivation) can also be enabled and configured for this strategy:

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-cluster-sharding/src/test/scala/akka/cluster/sharding/ClusterShardingSettingsSpec.scala#L138-L143 "Go to snippet source")akka.cluster.sharding.passivation {
  strategy = default-strategy
  default-strategy {
    idle-entity.timeout = 30.minutes
  }
}
```

Or using the [`withIdleEntityPassivation`](https://doc.akka.io/api/akka-core/2.6/akka/cluster/sharding/typed/ClusterShardingSettings$$PassivationStrategySettings.html#withIdleEntityPassivation(settings:akka.cluster.sharding.typed.ClusterShardingSettings.PassivationStrategySettings.IdleSettings):akka.cluster.sharding.typed.ClusterShardingSettings.PassivationStrategySettings "akka.cluster.sharding.typed.ClusterShardingSettings.PassivationStrategySettings")[`withIdleEntityPassivation`](https://doc.akka.io/japi/akka-core/2.6/akka/cluster/sharding/typed/ClusterShardingSettings.PassivationStrategySettings.html#withIdleEntityPassivation(akka.cluster.sharding.typed.ClusterShardingSettings.PassivationStrategySettings.IdleSettings) "akka.cluster.sharding.typed.ClusterShardingSettings.PassivationStrategySettings") method on `ClusterShardingSettings.PassivationStrategySettings`.

If the default strategy is not appropriate for particular workloads and access patterns, a [custom passivation strategy](#custom-passivation-strategies) can be created with configurable replacement policies, active entity limits, and idle entity timeouts.

### Custom passivation strategies

To configure a custom passivation strategy, create a configuration section for the strategy under `akka.cluster.sharding.passivation` and select this strategy using the `strategy` setting. The strategy needs a *replacement policy* to be chosen, an *active entity limit* to be set, and can optionally [passivate idle entities](#idle-entity-passivation). For example, a custom strategy can be configured to use the [least recently used policy](#least-recently-used-policy):

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-cluster-sharding/src/test/scala/akka/cluster/sharding/ClusterShardingSettingsSpec.scala#L168-L174 "Go to snippet source")akka.cluster.sharding.passivation {
  strategy = custom-lru-strategy
  custom-lru-strategy {
    active-entity-limit = 1000000
    replacement.policy = least-recently-used
  }
}
```

The active entity limit and replacement policy can also be configured using the `withPassivationStrategy` method on `ClusterShardingSettings`, passing custom `ClusterShardingSettings.PassivationStrategySettings`.

### Least recently used policy

The **least recently used** policy passivates those entities that have the least recent activity when the number of active entities passes the specified limit.

**When to use**: the least recently used policy should be used when access patterns are recency biased, where entities that were recently accessed are likely to be accessed again. See the [segmented least recently used policy](#segmented-least-recently-used-policy) for a variation that also distinguishes frequency of access.

Configure a passivation strategy to use the least recently used policy:

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-cluster-sharding/src/test/scala/akka/cluster/sharding/ClusterShardingSettingsSpec.scala#L168-L174 "Go to snippet source")akka.cluster.sharding.passivation {
  strategy = custom-lru-strategy
  custom-lru-strategy {
    active-entity-limit = 1000000
    replacement.policy = least-recently-used
  }
}
```

Or using the [`withLeastRecentlyUsedReplacement`](https://doc.akka.io/api/akka-core/2.6/akka/cluster/sharding/typed/ClusterShardingSettings$$PassivationStrategySettings.html#withLeastRecentlyUsedReplacement():akka.cluster.sharding.typed.ClusterShardingSettings.PassivationStrategySettings "akka.cluster.sharding.typed.ClusterShardingSettings.PassivationStrategySettings")[`withLeastRecentlyUsedReplacement`](https://doc.akka.io/japi/akka-core/2.6/akka/cluster/sharding/typed/ClusterShardingSettings.PassivationStrategySettings.html#withLeastRecentlyUsedReplacement() "akka.cluster.sharding.typed.ClusterShardingSettings.PassivationStrategySettings") method on `ClusterShardingSettings.PassivationStrategySettings`.

#### Segmented least recently used policy

A variation of the least recently used policy can be enabled that divides the active entity space into multiple segments to introduce frequency information into the passivation strategy. Higher\-level segments contain entities that have been accessed more often. The first segment is for entities that have only been accessed once, the second segment for entities that have been accessed at least twice, and so on. When an entity is accessed again, it will be promoted to the most recent position of the next\-level or highest\-level segment. The higher\-level segments are limited, where the total limit is either evenly divided among segments, or proportions of the segments can be configured. When a higher\-level segment exceeds its limit, the least recently used active entity tracked in that segment will be demoted to the level below. Only the least recently used entities in the lowest level will be candidates for passivation. The higher levels are considered “protected”, where entities will have additional opportunities to be accessed before being considered for passivation.

**When to use**: the segmented least recently used policy can be used for workloads where some entities are more popular than others, to prioritize those entities that are accessed more frequently.

To configure a segmented least recently used (SLRU) policy, with two levels and a protected segment limited to 80% of the total limit:

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-cluster-sharding/src/test/scala/akka/cluster/sharding/ClusterShardingSettingsSpec.scala#L198-L212 "Go to snippet source")akka.cluster.sharding.passivation {
  strategy = custom-slru-strategy
  custom-slru-strategy {
    active-entity-limit = 1000000
    replacement {
      policy = least-recently-used
      least-recently-used {
        segmented {
          levels = 2
          proportions = [0.2, 0.8]
        }
      }
    }
  }
}
```

Or to configure a 4\-level segmented least recently used (S4LRU) policy, with 4 evenly divided levels:

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-cluster-sharding/src/test/scala/akka/cluster/sharding/ClusterShardingSettingsSpec.scala#L223-L234 "Go to snippet source")akka.cluster.sharding.passivation {
  strategy = custom-s4lru-strategy
  custom-s4lru-strategy {
    active-entity-limit = 1000000
    replacement {
      policy = least-recently-used
      least-recently-used {
        segmented.levels = 4
      }
    }
  }
}
```

Or using custom `ClusterShardingSettings.PassivationStrategySettings.LeastRecentlyUsedSettings`.

### Most recently used policy

The **most recently used** policy passivates those entities that have the most recent activity when the number of active entities passes the specified limit.

**When to use**: the most recently used policy is most useful when the older an entity is, the more likely that entity will be accessed again; as seen in cyclic access patterns.

Configure a passivation strategy to use the most recently used policy:

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-cluster-sharding/src/test/scala/akka/cluster/sharding/ClusterShardingSettingsSpec.scala#L286-L292 "Go to snippet source")akka.cluster.sharding.passivation {
  strategy = custom-mru-strategy
  custom-mru-strategy {
    active-entity-limit = 1000000
    replacement.policy = most-recently-used
  }
}
```

Or using the [`withMostRecentlyUsedReplacement`](https://doc.akka.io/api/akka-core/2.6/akka/cluster/sharding/typed/ClusterShardingSettings$$PassivationStrategySettings.html#withMostRecentlyUsedReplacement():akka.cluster.sharding.typed.ClusterShardingSettings.PassivationStrategySettings "akka.cluster.sharding.typed.ClusterShardingSettings.PassivationStrategySettings")[`withMostRecentlyUsedReplacement`](https://doc.akka.io/japi/akka-core/2.6/akka/cluster/sharding/typed/ClusterShardingSettings.PassivationStrategySettings.html#withMostRecentlyUsedReplacement() "akka.cluster.sharding.typed.ClusterShardingSettings.PassivationStrategySettings") method on `ClusterShardingSettings.PassivationStrategySettings`.

### Least frequently used policy

The **least frequently used** policy passivates those entities that have the least frequent activity when the number of active entities passes the specified limit.

**When to use**: the least frequently used policy should be used when access patterns are frequency biased, where some entities are much more popular than others and should be prioritized. See the [least frequently used with dynamic aging policy](#least-frequently-used-with-dynamic-aging-policy) for a variation that also handles shifts in popularity.

Configure automatic passivation to use the least frequently used policy:

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-cluster-sharding/src/test/scala/akka/cluster/sharding/ClusterShardingSettingsSpec.scala#L340-L346 "Go to snippet source")akka.cluster.sharding.passivation {
  strategy = custom-lfu-strategy
  custom-lfu-strategy {
    active-entity-limit = 1000000
    replacement.policy = least-frequently-used
  }
}
```

Or using the [`withLeastFrequentlyUsedReplacement`](https://doc.akka.io/api/akka-core/2.6/akka/cluster/sharding/typed/ClusterShardingSettings$$PassivationStrategySettings.html#withLeastFrequentlyUsedReplacement():akka.cluster.sharding.typed.ClusterShardingSettings.PassivationStrategySettings "akka.cluster.sharding.typed.ClusterShardingSettings.PassivationStrategySettings")[`withLeastFrequentlyUsedReplacement`](https://doc.akka.io/japi/akka-core/2.6/akka/cluster/sharding/typed/ClusterShardingSettings.PassivationStrategySettings.html#withLeastFrequentlyUsedReplacement() "akka.cluster.sharding.typed.ClusterShardingSettings.PassivationStrategySettings") method on `ClusterShardingSettings.PassivationStrategySettings`.

#### Least frequently used with dynamic aging policy

A variation of the least frequently used policy can be enabled that uses “dynamic aging” to adapt to shifts in the set of popular entities, which is useful for smaller active entity limits and when shifts in popularity are common. If entities were frequently accessed in the past but then become unpopular, they can still remain active for a long time given their high frequency counts. Dynamic aging effectively increases the frequencies for recently accessed entities so they can more easily become higher priority over entities that are no longer accessed.

**When to use**: the least frequently used with dynamic aging policy can be used when workloads are frequency biased (there are some entities that are much more popular), but which entities are most popular changes over time. Shifts in popularity can have more impact on a least frequently used policy if the active entity limit is small.

Configure dynamic aging with the least frequently used policy:

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-cluster-sharding/src/test/scala/akka/cluster/sharding/ClusterShardingSettingsSpec.scala#L398-L409 "Go to snippet source")akka.cluster.sharding.passivation {
  strategy = custom-lfu-with-dynamic-aging
  custom-lfu-with-dynamic-aging {
    active-entity-limit = 1000
    replacement {
      policy = least-frequently-used
      least-frequently-used {
        dynamic-aging = on
      }
    }
  }
}
```

Or using custom `ClusterShardingSettings.PassivationStrategySettings.LeastFrequentlyUsedSettings`.

### Composite passivation strategies

Passivation strategies can be combined using an admission window and admission filter. The admission window tracks newly activated entities. Entities are replaced in the admission window using one of the replacement policies, such as the least recently used replacement policy. When an entity is replaced in the window area it has an opportunity to enter the main entity tracking area, based on the admission filter. The admission filter determines whether an entity that has left the window area should be admitted into the main area, or otherwise be passivated. A frequency sketch is the default admission filter and estimates the access frequency of entities over the lifespan of the cluster sharding node, selecting the entity that is estimated to be accessed more frequently. Composite passivation strategies with an admission window and admission filter are implementing the *Window\-TinyLFU* caching algorithm.

#### Admission window policy

The admission window tracks newly activated entities. When an entity is replaced in the window area, it has an opportunity to enter the main entity tracking area, based on the [admission filter](#admission-filter). The admission window can be enabled by selecting a policy (while the regular replacement policy is for the main area):

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-cluster-sharding/src/test/scala/akka/cluster/sharding/ClusterShardingSettingsSpec.scala#L434-L441 "Go to snippet source")akka.cluster.sharding.passivation {
  strategy = custom-strategy-with-admission-window
  custom-strategy-with-admission-window {
    active-entity-limit = 1000000
    admission.window.policy = least-recently-used
    replacement.policy = least-frequently-used
  }
}
```

The proportion of the active entity limit used for the admission window can be configured (the default is 1%):

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-cluster-sharding/src/test/scala/akka/cluster/sharding/ClusterShardingSettingsSpec.scala#L460-L470 "Go to snippet source")akka.cluster.sharding.passivation {
  strategy = custom-strategy-with-admission-window
  custom-strategy-with-admission-window {
    active-entity-limit = 1000000
    admission.window {
      policy = least-recently-used
      proportion = 0.1 # 10%
    }
    replacement.policy = least-frequently-used
  }
}
```

The proportion for the admission window can also be adapted and optimized dynamically, by enabling an [admission window optimizer](#admission-window-optimizer).

#### Admission window optimizer

The proportion of the active entity limit used for the admission window can be adapted dynamically using an optimizer. The window area will usually retain entities that are accessed again in a short time (recency\-biased), while the main area can track entities that are accessed more frequently over longer times (frequency\-biased). If access patterns for entities are changeable, then the adaptive sizing of the window allows the passivation strategy to adapt between recency\-biased and frequency\-biased workloads.

The optimizer currently available uses a simple hill\-climbing algorithm, which searches for a window proportion that provides an optimal active rate (where entities are already active when accessed, the *cache hit rate*). Enable adaptive window sizing by configuring the `hill-climbing` window optimizer:

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-cluster-sharding/src/test/scala/akka/cluster/sharding/ClusterShardingSettingsSpec.scala#L489-L499 "Go to snippet source")akka.cluster.sharding.passivation {
  strategy = custom-strategy-with-admission-window
  custom-strategy-with-admission-window {
    active-entity-limit = 1000000
    admission.window {
      policy = least-recently-used
      optimizer = hill-climbing
    }
    replacement.policy = least-frequently-used
  }
}
```

See the `reference.conf` for parameters that can be tuned for the hill climbing admission window optimizer.

#### Admission filter

An admission filter can be enabled, which determines whether an entity that has left the window area (or a newly activated entity if there is no admission window) should be admitted into the main entity tracking area, or otherwise be passivated. If no admission filter is configured, then entities will always be admitted into the main area.

A frequency sketch is the default admission filter and estimates the access frequency of entities over the lifespan of the cluster sharding node, selecting the entity that is estimated to be accessed more frequently. The frequency sketch automatically ages entries, using the approach from the *TinyLFU* cache admission algorithm. Enable an admission filter by configuring the `frequency-sketch` admission filter:

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-cluster-sharding/src/test/scala/akka/cluster/sharding/ClusterShardingSettingsSpec.scala#L522-L543 "Go to snippet source")akka.cluster.sharding.passivation {
  strategy = custom-strategy-with-admission
  custom-strategy-with-admission {
    active-entity-limit = 1000000
    admission {
      window {
        policy = least-recently-used
        optimizer = hill-climbing
      }
      filter = frequency-sketch
    }
    replacement {
      policy = least-recently-used
      least-recently-used {
        segmented {
          levels = 2
          proportions = [0.2, 0.8]
        }
      }
    }
  }
}
```

See the `reference.conf` for parameters that can be tuned for the frequency sketch admission filter.

## Sharding State

There are two types of state managed:

1. [ShardCoordinator State](cluster-sharding-concepts.html#shardcoordinator-state) \- the `Shard` locations. This is stored in the `State Store`.
2. [Remembering Entities](cluster-sharding.html#remembering-entities) \- the active shards and the entities in each `Shard`, which is optional, and disabled by default. This is stored in the `Remember Entities Store`.

### State Store

A state store is mandatory for sharding, it contains the location of shards. The `ShardCoordinator` needs to load this state after it moves between nodes.

There are two options for the state store:

- [Distributed Data Mode](cluster-sharding.html#distributed-data-mode) \- uses Akka [Distributed Data](distributed-data.html) (CRDTs) (the default)
- [Persistence Mode](cluster-sharding.html#persistence-mode) \- (deprecated) uses Akka [Persistence](persistence.html) (Event Sourcing)

Warning
Persistence for state store mode is deprecated. It is recommended to migrate to `ddata` for the coordinator state and if using replicated entities migrate to `eventsourced` for the replicated entities state.

The data written by the deprecated `persistence` state store mode for remembered entities can be read by the new remember entities `eventsourced` mode.

Once you’ve migrated you can not go back to `persistence` mode.

#### Distributed Data Mode

To enable distributed data store mode (the default):

```
akka.cluster.sharding.state-store-mode = ddata

```

The state of the `ShardCoordinator` is replicated across the cluster but is not stored to disk. [Distributed Data](distributed-data.html) handles the `ShardCoordinator`’s state with [`WriteMajorityPlus`](https://doc.akka.io/api/akka-core/2.6/akka/cluster/ddata/Replicator$$WriteMajorityPlus.html "akka.cluster.ddata.Replicator.WriteMajorityPlus")[`WriteMajorityPlus`](https://doc.akka.io/japi/akka-core/2.6/akka/cluster/ddata/Replicator.WriteMajorityPlus.html "akka.cluster.ddata.Replicator.WriteMajorityPlus") / [`ReadMajorityPlus`](https://doc.akka.io/api/akka-core/2.6/akka/cluster/ddata/Replicator$$ReadMajorityPlus.html "akka.cluster.ddata.Replicator.ReadMajorityPlus")[`ReadMajorityPlus`](https://doc.akka.io/japi/akka-core/2.6/akka/cluster/ddata/Replicator.ReadMajorityPlus.html "akka.cluster.ddata.Replicator.ReadMajorityPlus") consistency. When all nodes in the cluster have been stopped, the state is no longer needed and dropped.

Cluster Sharding uses its own Distributed Data [`Replicator`](https://doc.akka.io/api/akka-core/2.6/akka/cluster/ddata/Replicator.html "akka.cluster.ddata.Replicator")[`Replicator`](https://doc.akka.io/japi/akka-core/2.6/akka/cluster/ddata/Replicator.html "akka.cluster.ddata.Replicator") per node. If using roles with sharding there is one `Replicator` per role, which enables a subset of all nodes for some entity types and another subset for other entity types. Each replicator has a name that contains the node role and therefore the role configuration must be the same on all nodes in the cluster, for example you can’t change the roles when performing a rolling update. Changing roles requires [a full cluster restart](../additional/rolling-updates.html#cluster-sharding-configuration-change).

The `akka.cluster.sharding.distributed-data` config section configures the settings for Distributed Data. It’s not possible to have different `distributed-data` settings for different sharding entity types.

#### Persistence mode

To enable persistence store mode:

```
akka.cluster.sharding.state-store-mode = persistence

```

Since it is running in a cluster [Persistence](persistence.html) must be configured with a distributed journal.

Warning
Persistence mode for [Remembering Entities](cluster-sharding.html#remembering-entities) has been replaced by a remember entities state mode. It should not be used for new projects and existing projects should migrate as soon as possible.

## Remembering Entities

Remembering entities automatically restarts entities after a rebalance or entity crash. Without remembered entities restarts happen on the arrival of a message.

Enabling remembered entities disables [Automatic Passivation](cluster-sharding.html#automatic-passivation).

The state of the entities themselves is not restored unless they have been made persistent, for example with [Event Sourcing](persistence.html).

To enable remember entities set `rememberEntities` flag to true in [`ClusterShardingSettings`](https://doc.akka.io/api/akka-core/2.6/akka/cluster/sharding/typed/ClusterShardingSettings.html "akka.cluster.sharding.typed.ClusterShardingSettings")[`ClusterShardingSettings`](https://doc.akka.io/japi/akka-core/2.6/akka/cluster/sharding/typed/ClusterShardingSettings.html "akka.cluster.sharding.typed.ClusterShardingSettings") when starting a shard region (or its proxy) for a given `entity` type or configure `akka.cluster.sharding.remember-entities = on`.

Starting and stopping entities has an overhead but this is limited by batching operations to the underlying remember entities store.

### Behavior When Enabled

When `rememberEntities` is enabled, whenever a `Shard` is rebalanced onto another node or recovers after a crash, it will recreate all the entities which were previously running in that `Shard`. 

To permanently stop entities send a [`ClusterSharding.Passivate`](https://doc.akka.io/japi/akka-core/2.6/akka/cluster/sharding/typed/javadsl/ClusterSharding.Passivate.html "akka.cluster.sharding.typed.javadsl.ClusterSharding.Passivate")[`ClusterSharding.Passivate`](https://doc.akka.io/api/akka-core/2.6/akka/cluster/sharding/typed/scaladsl/ClusterSharding$$Passivate.html "akka.cluster.sharding.typed.scaladsl.ClusterSharding.Passivate") to the [`ActorRef`](https://doc.akka.io/api/akka-core/2.6/akka/actor/typed/ActorRef.html "akka.actor.typed.ActorRef")[`ActorRef`](https://doc.akka.io/japi/akka-core/2.6/akka/actor/typed/ActorRef.html "akka.actor.typed.ActorRef")\[[`ShardCommand`](https://doc.akka.io/api/akka-core/2.6/akka/cluster/sharding/typed/scaladsl/ClusterSharding$$ShardCommand.html "akka.cluster.sharding.typed.scaladsl.ClusterSharding.ShardCommand")]\<[`ShardCommand`](https://doc.akka.io/japi/akka-core/2.6/akka/cluster/sharding/typed/javadsl/ClusterSharding.ShardCommand.html "akka.cluster.sharding.typed.javadsl.ClusterSharding.ShardCommand")\> that was passed in to the factory method when creating the entity. Otherwise, the entity will be automatically restarted after the entity restart backoff specified in the configuration.

### Remember entities store

There are two options for the remember entities store:

1. `ddata`
2. `eventsourced`

#### Remember entities distributed data mode

Enable ddata mode with (enabled by default):

```
akka.cluster.sharding.remember-entities-store = ddata

```

To support restarting entities after a full cluster restart (non\-rolling) the remember entities store is persisted to disk by distributed data. This can be disabled if not needed:

```
akka.cluster.sharding.distributed-data.durable.keys = []

```

Reasons for disabling:

- No requirement for remembering entities after a full cluster shutdown
- Running in an environment without access to disk between restarts e.g. Kubernetes without persistent volumes

For supporting remembered entities in an environment without disk storage use `eventsourced` mode instead.

#### Event sourced mode

Enable `eventsourced` mode with:

```
akka.cluster.sharding.remember-entities-store = eventsourced

```

This mode uses [Event Sourcing](persistence.html) to store the active shards and active entities for each shard so a persistence and snapshot plugin must be configured.

```
akka.cluster.sharding.journal-plugin-id = <plugin>
akka.cluster.sharding.snapshot-plugin-id = <plugin>

```

### Migrating from deprecated persistence mode

If not using remembered entities you can migrate to ddata with a full cluster restart.

If using remembered entities there are two migration options: 

- `ddata` for the state store and `ddata` for remembering entities. All remembered entities will be lost after a full cluster restart.
- `ddata` for the state store and `eventsourced` for remembering entities. The new `eventsourced` remembering entities store reads the data written by the old `persistence` mode. Your remembered entities will be remembered after a full cluster restart.

For migrating existing remembered entities an event adapter needs to be configured in the config for the journal you use in your `application.conf`. In this example `cassandra` is the used journal:

```
akka.persistence.cassandra.journal {
  event-adapters {
    coordinator-migration = "akka.cluster.sharding.OldCoordinatorStateMigrationEventAdapter"
  }

  event-adapter-bindings {
    "akka.cluster.sharding.ShardCoordinator$Internal$DomainEvent" = coordinator-migration
  }
}

```

Once you have migrated you cannot go back to the old persistence store, a rolling update is therefore not possible.

When [Distributed Data mode](cluster-sharding.html#distributed-data-mode) is used the identifiers of the entities are stored in [Durable Storage](distributed-data.html#durable-storage) of Distributed Data. You may want to change the configuration of the `akka.cluster.sharding.distributed-data.durable.lmdb.dir`, since the default directory contains the remote port of the actor system. If using a dynamically assigned port (0\) it will be different each time and the previously stored data will not be loaded.

The reason for storing the identifiers of the active entities in durable storage, i.e. stored to disk, is that the same entities should be started also after a complete cluster restart. If this is not needed you can disable durable storage and benefit from better performance by using the following configuration:

```
akka.cluster.sharding.distributed-data.durable.keys = []

```

## Startup after minimum number of members

It’s recommended to use Cluster Sharding with the Cluster setting `akka.cluster.min-nr-of-members` or `akka.cluster.role.<role-name>.min-nr-of-members`. `min-nr-of-members` will defer the allocation of the shards until at least that number of regions have been started and registered to the coordinator. This avoids that many shards are allocated to the first region that registers and only later are rebalanced to other nodes.

See [How To Startup when Cluster Size Reached](cluster.html#how-to-startup-when-a-cluster-size-is-reached) for more information about `min-nr-of-members`.

## Health check

An [Akka Management compatible health check](https://doc.akka.io/libraries/akka-management/current/healthchecks.html) is included that returns healthy once the local shard region has registered with the coordinator. This health check should be used in cases where you don’t want to receive production traffic until the local shard region is ready to retrieve locations for shards. For shard regions that aren’t critical and therefore should not block this node becoming ready do not include them.

The health check does not fail after an initial successful check. Once a shard region is registered and is operational it stays available for incoming message. 

Cluster sharding enables the health check automatically. To disable:

```
akka.management.health-checks.readiness-checks {
  sharding = ""
}

```

Monitoring of each shard region is off by default. Add them by defining the entity type names (`EntityTypeKey.name`):

```
akka.cluster.sharding.healthcheck.names = ["counter-1", "HelloWorld"]

```

See also additional information about how to make [smooth rolling updates](../additional/rolling-updates.html#cluster-sharding).

## Inspecting cluster sharding state

Two requests to inspect the cluster state are available:

[`GetShardRegionState`](https://doc.akka.io/api/akka-core/2.6/akka/cluster/sharding/typed/GetShardRegionState.html "akka.cluster.sharding.typed.GetShardRegionState")[`GetShardRegionState`](https://doc.akka.io/japi/akka-core/2.6/akka/cluster/sharding/typed/GetShardRegionState.html "akka.cluster.sharding.typed.GetShardRegionState") which will reply with a [`ShardRegion.CurrentShardRegionState`](https://doc.akka.io/api/akka-core/2.6/akka/cluster/sharding/ShardRegion$$CurrentShardRegionState.html "akka.cluster.sharding.ShardRegion.CurrentShardRegionState")[`ShardRegion.CurrentShardRegionState`](https://doc.akka.io/japi/akka-core/2.6/akka/cluster/sharding/ShardRegion.CurrentShardRegionState.html "akka.cluster.sharding.ShardRegion.CurrentShardRegionState") that contains the identifiers of the shards running in a Region and what entities are alive for each of them.

Scala

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-cluster-sharding-typed/src/test/scala/docs/akka/cluster/sharding/typed/ShardingCompileOnlySpec.scala#L184-L189 "Go to snippet source")import akka.cluster.sharding.typed.GetShardRegionState
import akka.cluster.sharding.ShardRegion.CurrentShardRegionState

val replyTo: ActorRef[CurrentShardRegionState] = replyMessageAdapter

ClusterSharding(system).shardState ! GetShardRegionState(Counter.TypeKey, replyTo)
```

Java

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-cluster-sharding-typed/src/test/java/jdocs/akka/cluster/sharding/typed/ShardingCompileOnlyTest.java#L28-L271 "Go to snippet source")import akka.cluster.sharding.typed.GetShardRegionState;
import akka.cluster.sharding.ShardRegion.CurrentShardRegionState;

ActorRef<CurrentShardRegionState> replyTo = replyMessageAdapter;

ClusterSharding.get(system).shardState().tell(new GetShardRegionState(typeKey, replyTo));
```

[`GetClusterShardingStats`](https://doc.akka.io/api/akka-core/2.6/akka/cluster/sharding/typed/GetClusterShardingStats.html "akka.cluster.sharding.typed.GetClusterShardingStats")[`GetClusterShardingStats`](https://doc.akka.io/japi/akka-core/2.6/akka/cluster/sharding/typed/GetClusterShardingStats.html "akka.cluster.sharding.typed.GetClusterShardingStats") which will query all the regions in the cluster and reply with a [`ShardRegion.ClusterShardingStats`](https://doc.akka.io/api/akka-core/2.6/akka/cluster/sharding/ShardRegion$$ClusterShardingStats.html "akka.cluster.sharding.ShardRegion.ClusterShardingStats")[`ShardRegion.ClusterShardingStats`](https://doc.akka.io/japi/akka-core/2.6/akka/cluster/sharding/ShardRegion.ClusterShardingStats.html "akka.cluster.sharding.ShardRegion.ClusterShardingStats") containing the identifiers of the shards running in each region and a count of entities that are alive in each shard.

Scala

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-cluster-sharding-typed/src/test/scala/docs/akka/cluster/sharding/typed/ShardingCompileOnlySpec.scala#L202-L209 "Go to snippet source")import akka.cluster.sharding.typed.GetClusterShardingStats
import akka.cluster.sharding.ShardRegion.ClusterShardingStats
import scala.concurrent.duration._

val replyTo: ActorRef[ClusterShardingStats] = replyMessageAdapter
val timeout: FiniteDuration = 5.seconds

ClusterSharding(system).shardState ! GetClusterShardingStats(Counter.TypeKey, timeout, replyTo)
```

Java

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-cluster-sharding-typed/src/test/java/jdocs/akka/cluster/sharding/typed/ShardingCompileOnlyTest.java#L33-L286 "Go to snippet source")import akka.cluster.sharding.typed.GetClusterShardingStats;
import akka.cluster.sharding.ShardRegion.ClusterShardingStats;

ActorRef<ClusterShardingStats> replyTo = replyMessageAdapter;
Duration timeout = Duration.ofSeconds(5);

ClusterSharding.get(system)
    .shardState()
    .tell(new GetClusterShardingStats(typeKey, timeout, replyTo));
```

If any shard queries failed, for example due to timeout if a shard was too busy to reply within the configured `akka.cluster.sharding.shard-region-query-timeout`, `ShardRegion.CurrentShardRegionState` and `ShardRegion.ClusterShardingStats` will also include the set of shard identifiers by region that failed.

The purpose of these messages is testing and monitoring, they are not provided to give access to directly sending messages to the individual entities.

## Lease

A [lease](../coordination.html) can be used as an additional safety measure to ensure a shard does not run on two nodes.

Reasons for how this can happen:

- Network partitions without an appropriate downing provider
- Mistakes in the deployment process leading to two separate Akka Clusters
- Timing issues between removing members from the Cluster on one side of a network partition and shutting them down on the other side

A lease can be a final backup that means that each shard won’t create child entity actors unless it has the lease. 

To use a lease for sharding set `akka.cluster.sharding.use-lease` to the configuration location of the lease to use. Each shard will try and acquire a lease with with the name `<actor system name>-shard-<type name>-<shard id>` and the owner is set to the `Cluster(system).selfAddress.hostPort`.

If a shard can’t acquire a lease it will remain uninitialized so messages for entities it owns will be buffered in the `ShardRegion`. If the lease is lost after initialization the Shard will be terminated.

## Removal of internal Cluster Sharding data

Removal of internal Cluster Sharding data is only relevant for “Persistent Mode”. The Cluster Sharding `ShardCoordinator` stores locations of the shards. This data is safely be removed when restarting the whole Akka Cluster. Note that this does not include application data.

There is a utility program [`RemoveInternalClusterShardingData`](https://doc.akka.io/api/akka-core/2.6/akka/cluster/sharding/RemoveInternalClusterShardingData$.html "akka.cluster.sharding.RemoveInternalClusterShardingData")[`RemoveInternalClusterShardingData`](https://doc.akka.io/japi/akka-core/2.6/akka/cluster/sharding/RemoveInternalClusterShardingData.html "akka.cluster.sharding.RemoveInternalClusterShardingData") that removes this data.

Warning
Never use this program while there are running Akka Cluster nodes that are using Cluster Sharding. Stop all Cluster nodes before using this program.

It can be needed to remove the data if the Cluster Sharding coordinator cannot startup because of corrupt data, which may happen if accidentally two clusters were running at the same time, e.g. caused by an invalid downing provider when there was a network partition.

Use this program as a standalone Java main program:

```
java -classpath <jar files, including akka-cluster-sharding>
  akka.cluster.sharding.RemoveInternalClusterShardingData
    -2.3 entityType1 entityType2 entityType3

```

The program is included in the `akka-cluster-sharding` jar file. It is easiest to run it with same classpath and configuration as your ordinary application. It can be run from sbt or Maven in similar way.

Specify the entity type names (same as you use in the `init` method of `ClusterSharding`) as program arguments.

If you specify `-2.3` as the first program argument it will also try to remove data that was stored by Cluster Sharding in Akka 2\.3\.x using different persistenceId.

## Configuration

The [`ClusterSharding`](https://doc.akka.io/japi/akka-core/2.6/akka/cluster/sharding/typed/javadsl/ClusterSharding.html "akka.cluster.sharding.typed.javadsl.ClusterSharding")[`ClusterSharding`](https://doc.akka.io/api/akka-core/2.6/akka/cluster/sharding/typed/scaladsl/ClusterSharding.html "akka.cluster.sharding.typed.scaladsl.ClusterSharding") extension can be configured with the following properties. These configuration properties are read by the [`ClusterShardingSettings`](https://doc.akka.io/api/akka-core/2.6/akka/cluster/sharding/typed/ClusterShardingSettings.html "akka.cluster.sharding.typed.ClusterShardingSettings")[`ClusterShardingSettings`](https://doc.akka.io/japi/akka-core/2.6/akka/cluster/sharding/typed/ClusterShardingSettings.html "akka.cluster.sharding.typed.ClusterShardingSettings") when created with an ActorSystem parameter. It is also possible to amend the `ClusterShardingSettings` or create it from another config section with the same layout as below. 

One important configuration property is `number-of-shards` as described in [Shard allocation](cluster-sharding.html#shard-allocation).

You may also need to tune the configuration properties is `rebalance-absolute-limit` and `rebalance-relative-limit` as described in [Shard allocation](cluster-sharding.html#shard-allocation).

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-cluster-sharding/src/main/resources/reference.conf#L10-L446 "Go to snippet source")# Settings for the ClusterShardingExtension
akka.cluster.sharding {

  # The extension creates a top level actor with this name in top level system scope,
  # e.g. '/system/sharding'
  guardian-name = sharding

  # Specifies that entities run on cluster nodes with a specific role.
  # If the role is not specified (or empty) all nodes in the cluster are used.
  role = ""

  # When this is set to 'on' the active entity actors will automatically be restarted
  # upon Shard restart. i.e. if the Shard is started on a different ShardRegion
  # due to rebalance or crash.
  remember-entities = off

  # When 'remember-entities' is enabled and the state store mode is ddata this controls
  # how the remembered entities and shards are stored. Possible values are "eventsourced" and "ddata"
  # Default is ddata for backwards compatibility.
  remember-entities-store = "ddata"

  # Deprecated: use the `passivation.default-idle-strategy.idle-entity.timeout` setting instead.
  # Set this to a time duration to have sharding passivate entities when they have not
  # received any message in this length of time. Set to 'off' to disable.
  # It is always disabled if `remember-entities` is enabled.
  passivate-idle-entity-after = null

  # Automatic entity passivation settings.
  passivation {

    # Automatic passivation strategy to use.
    # Set to "none" or "off" to disable automatic passivation.
    # Set to "default-strategy" to switch to the recommended default strategy with an active entity limit.
    # See the strategy-defaults section for possible passivation strategy settings and default values.
    # Passivation strategies are always disabled if `remember-entities` is enabled.
    #
    # API MAY CHANGE: Configuration for passivation strategies, except default-idle-strategy,
    # may change after additional testing and feedback.
    strategy = "default-idle-strategy"

    # Default passivation strategy without active entity limit; time out idle entities after 2 minutes.
    default-idle-strategy {
      idle-entity.timeout = 120s
    }

    # Recommended default strategy for automatic passivation with an active entity limit.
    # Configured with an adaptive recency-based admission window, a frequency-based admission filter, and
    # a segmented least recently used (SLRU) replacement policy for the main active entity tracking.
    default-strategy {
      # Default limit of 100k active entities in a shard region (in a cluster node).
      active-entity-limit = 100000

      # Admisson window with LRU policy and adaptive sizing, and a frequency sketch admission filter to the main area.
      admission {
        window {
          policy = least-recently-used
          optimizer = hill-climbing
        }
        filter = frequency-sketch
      }

      # Main area with segmented LRU replacement policy with an 80% "protected" level by default.
      replacement {
        policy = least-recently-used
        least-recently-used {
          segmented {
            levels = 2
            proportions = [0.2, 0.8]
          }
        }
      }
    }

    strategy-defaults {
      # Passivate entities when they have not received a message for a specified length of time.
      idle-entity {
        # Passivate idle entities after the timeout. Set to "none" or "off" to disable.
        timeout = none

        # Check idle entities every interval. Set to "default" to use half the timeout by default.
        interval = default
      }

      # Limit of active entities in a shard region.
      # Passivate entities when the number of active entities in a shard region reaches this limit.
      # The per-region limit is divided evenly among the active shards in a region.
      # Set to "none" or "off" to disable limit-based automatic passivation, to only use idle entity timeouts.
      active-entity-limit = none

      # Entity replacement settings, for when the active entity limit is reached.
      replacement {
        # Entity replacement policy to use when the active entity limit is reached. Possible values are:
        #   - "least-recently-used"
        #   - "most-recently-used"
        #   - "least-frequently-used"
        # Set to "none" or "off" to disable the replacement policy and ignore the active entity limit.
        policy = none

        # Least recently used entity replacement policy.
        least-recently-used {
          # Optionally use a "segmented" least recently used strategy.
          # Disabled when segmented.levels are set to "none" or "off".
          segmented {
            # Number of segmented levels.
            levels = none

            # Fractional proportions for the segmented levels.
            # If empty then segments are divided evenly by the number of levels.
            proportions = []
          }
        }

        # Most recently used entity replacement policy.
        most-recently-used {}

        # Least frequently used entity replacement policy.
        least-frequently-used {
          # New frequency counts will be "dynamically aged" when enabled.
          dynamic-aging = off
        }
      }

      # An optional admission area, with a window for newly and recently activated entities, and an admission filter
      # to determine whether a candidate should be admitted to the main area of the passivation strategy.
      admission {
        # An optional window area, where newly created entities will be admitted initially, and when evicted
        # from the window area have an opportunity to move to the main area based on the admission filter.
        window {
          # The initial sizing for the window area (if enabled), as a fraction of the total active entity limit.
          proportion = 0.01

          # The minimum adaptive sizing for the window area, as a fraction of the total active entity limit.
          # Only applies when an adaptive window optimizer is enabled.
          minimum-proportion = 0.01

          # The maximum adaptive sizing for the window area, as a fraction of the total active entity limit.
          # Only applies when an adaptive window optimizer is enabled.
          maximum-proportion = 1.0

          # Adaptive optimizer to use for dynamically resizing the window area. Possible values are:
          #   - "hill-climbing"
          # Set to "none" or "off" to disable adaptive sizing of the window area.
          optimizer = off

          # A window proportion optimizer using a simple hill-climbing algorithm.
          hill-climbing {
            # Multiplier of the active entity limit for how often (in accesses) to adjust the window proportion.
            adjust-multiplier = 10.0

            # The size of the initial step to take (also used when the climbing restarts).
            initial-step = 0.0625

            # A threshold for the change in active rate (hit rate) to restart climbing.
            restart-threshold = 0.05

            # The decay ratio applied on each climbing step.
            step-decay = 0.98
          }

          # Replacement policy to use for the window area.
          # Entities that are evicted from the window area may move to the main area, based on the admission filter.
          # Possible values are the same as for the main replacement policy.
          # Set to "none" or "off" to disable the window area.
          policy = none

          least-recently-used {
            segmented {
              levels = none
              proportions = []
            }
          }

          most-recently-used {}

          least-frequently-used {
            dynamic-aging = off
          }
        }

        # The admission filter for the main area of the passivation strategy. Possible values are:
        #   - "frequency-sketch"
        # Set to "none" or "off" to disable the admission filter and always admit to the main area.
        filter = none

        # An admission filter based on a frequency sketch (a variation of a count-min sketch).
        frequency-sketch {
          # The depth of the frequency sketch (the number of hash functions).
          depth = 4

          # The size of the frequency counters in bits: 2, 4, 8, 16, 32, or 64 bits.
          counter-bits = 4

          # Multiplier of the active entity limit for the width of the frequency sketch.
          width-multiplier = 4

          # Multiplier of the active entity limit for how often the reset operation of the frequency sketch is applied.
          reset-multiplier = 10.0
        }
      }
    }
  }

  # If the coordinator can't store state changes it will be stopped
  # and started again after this duration, with an exponential back-off
  # of up to 5 times this duration.
  coordinator-failure-backoff = 5 s

  # The ShardRegion retries registration and shard location requests to the
  # ShardCoordinator with this interval if it does not reply.
  retry-interval = 2 s

  # Maximum number of messages that are buffered by a ShardRegion actor.
  buffer-size = 100000

  # Timeout of the shard rebalancing process.
  # Additionally, if an entity doesn't handle the stopMessage
  # after (handoff-timeout - 5.seconds).max(1.second) it will be stopped forcefully
  handoff-timeout = 60 s

  # Time given to a region to acknowledge it's hosting a shard.
  shard-start-timeout = 10 s

  # If the shard is remembering entities and can't store state changes, it
  # will be stopped and then started again after this duration. Any messages
  # sent to an affected entity may be lost in this process.
  shard-failure-backoff = 10 s

  # If the shard is remembering entities and an entity stops itself without
  # using passivate, the entity will be restarted after this duration or when
  # the next message for it is received, whichever occurs first.
  entity-restart-backoff = 10 s

  # Rebalance check is performed periodically with this interval.
  rebalance-interval = 10 s

  # Absolute path to the journal plugin configuration entity that is to be
  # used for the internal persistence of ClusterSharding. If not defined,
  # the default journal plugin is used. Note that this is not related to
  # persistence used by the entity actors.
  # Only used when state-store-mode=persistence
  journal-plugin-id = ""

  # Absolute path to the snapshot plugin configuration entity that is to be
  # used for the internal persistence of ClusterSharding. If not defined,
  # the default snapshot plugin is used. Note that this is not related to
  # persistence used by the entity actors.
  # Only used when state-store-mode=persistence
  snapshot-plugin-id = ""

  # Defines how the coordinator stores its state. Same is also used by the
  # shards for rememberEntities.
  # Valid values are "ddata" or "persistence".
  # "persistence" mode is deprecated
  state-store-mode = "ddata"

  # The shard saves persistent snapshots after this number of persistent
  # events. Snapshots are used to reduce recovery times. A snapshot trigger might be delayed if a batch of updates is processed.
  # Only used when state-store-mode=persistence
  snapshot-after = 1000

  # The shard deletes persistent events (messages and snapshots) after doing snapshot
  # keeping this number of old persistent batches.
  # Batch is of size `snapshot-after`.
  # When set to 0, after snapshot is successfully done, all events with equal or lower sequence number will be deleted.
  # Default value of 2 leaves last maximum 2*`snapshot-after` events and 3 snapshots (2 old ones + latest snapshot).
  # If larger than 0, one additional batch of journal messages is kept when state-store-mode=persistence to include messages from delayed snapshots.
  keep-nr-of-batches = 2

  # Settings for LeastShardAllocationStrategy.
  #
  # A new rebalance algorithm was included in Akka 2.6.10. It can reach optimal balance in
  # less rebalance rounds (typically 1 or 2 rounds). The amount of shards to rebalance in each
  # round can still be limited to make it progress slower. For backwards compatibility,
  # the new algorithm is not enabled by default. Enable the new algorithm by setting
  # `rebalance-absolute-limit` > 0, for example:
  # akka.cluster.sharding.least-shard-allocation-strategy.rebalance-absolute-limit=20
  # The new algorithm is recommended and will become the default in future versions of Akka.
  least-shard-allocation-strategy {
    # Maximum number of shards that will be rebalanced in one rebalance round.
    # The lower of this and `rebalance-relative-limit` will be used.
    rebalance-absolute-limit = 0

    # Maximum number of shards that will be rebalanced in one rebalance round.
    # Fraction of total number of (known) shards.
    # The lower of this and `rebalance-absolute-limit` will be used.
    rebalance-relative-limit = 0.1

    # Deprecated: Use rebalance-absolute-limit and rebalance-relative-limit instead. This property is not used
    # when rebalance-absolute-limit > 0.
    #
    # Threshold of how large the difference between most and least number of
    # allocated shards must be to begin the rebalancing.
    # The difference between number of shards in the region with most shards and
    # the region with least shards must be greater than (>) the `rebalanceThreshold`
    # for the rebalance to occur.
    # It is also the maximum number of shards that will start rebalancing per rebalance-interval
    # 1 gives the best distribution and therefore typically the best choice.
    # Increasing the threshold can result in quicker rebalance but has the
    # drawback of increased difference between number of shards (and therefore load)
    # on different nodes before rebalance will occur.
    rebalance-threshold = 1

    # Deprecated: Use rebalance-absolute-limit and rebalance-relative-limit instead. This property is not used
    # when rebalance-absolute-limit > 0.
    #
    # The number of ongoing rebalancing processes is limited to this number.
    max-simultaneous-rebalance = 3
  }

  external-shard-allocation-strategy {
    # How long to wait for the client to persist an allocation to ddata or get all shard locations
    client-timeout = 5s
  }

  # Timeout of waiting the initial distributed state for the shard coordinator (an initial state will be queried again if the timeout happened)
  # and for a shard to get its state when remembered entities is enabled
  # The read from ddata is a ReadMajority, for small clusters (< majority-min-cap) every node needs to respond
  # so is more likely to time out if there are nodes restarting e.g. when there is a rolling re-deploy happening
  waiting-for-state-timeout = 2 s

  # Timeout of waiting for update the distributed state (update will be retried if the timeout happened)
  # Also used as timeout for writes of remember entities when that is enabled
  updating-state-timeout = 5 s

  # Timeout to wait for querying all shards for a given `ShardRegion`.
  shard-region-query-timeout = 3 s

  # The shard uses this strategy to determines how to recover the underlying entity actors. The strategy is only used
  # by the persistent shard when rebalancing or restarting and is applied per remembered shard starting up (not for
  # entire shard region). The value can either be "all" or "constant". The "all"
  # strategy start all the underlying entity actors at the same time. The constant strategy will start the underlying
  # entity actors at a fix rate. The default strategy "all".
  entity-recovery-strategy = "all"

  # Default settings for the constant rate entity recovery strategy
  entity-recovery-constant-rate-strategy {
    # Sets the frequency at which a batch of entity actors is started.
    frequency = 100 ms
    # Sets the number of entity actors to be restart at a particular interval
    number-of-entities = 5
  }

  event-sourced-remember-entities-store {
    # When using remember entities and the event sourced remember entities store the batches
    # written to the store are limited by this number to avoid getting a too large event for
    # the journal to handle. If using long persistence ids you may have to increase this.
    max-updates-per-write = 100
  }

  # Settings for the coordinator singleton. Same layout as akka.cluster.singleton.
  # The "role" of the singleton configuration is not used. The singleton role will
  # be the same as "akka.cluster.sharding.role" if
  # "akka.cluster.sharding.coordinator-singleton-role-override" is enabled. Disabling it will allow to
  # use separate nodes for the shard coordinator and the shards themselves.
  # A lease can be configured in these settings for the coordinator singleton
  coordinator-singleton = ${akka.cluster.singleton}

  # Copies the role for the coordinator singleton from the shards role instead of using the one provided in the
  # "akka.cluster.sharding.coordinator-singleton.role"
  coordinator-singleton-role-override = on

  coordinator-state {
    # State updates are required to be written to a majority of nodes plus this
    # number of additional nodes. Can also be set to "all" to require
    # writes to all nodes. The reason for write/read to more than majority
    # is to have more tolerance for membership changes between write and read.
    # The tradeoff of increasing this is that updates will be slower.
    # It is more important to increase the `read-majority-plus`.
    write-majority-plus = 3
    # State retrieval when ShardCoordinator is started is required to be read
    # from a majority of nodes plus this number of additional nodes. Can also
    # be set to "all" to require reads from all nodes. The reason for write/read
    # to more than majority is to have more tolerance for membership changes between
    # write and read.
    # The tradeoff of increasing this is that coordinator startup will be slower.
    read-majority-plus = 5
  }
  
  # Settings for the Distributed Data replicator. 
  # Same layout as akka.cluster.distributed-data.
  # The "role" of the distributed-data configuration is not used. The distributed-data
  # role will be the same as "akka.cluster.sharding.role".
  # Note that there is one Replicator per role and it's not possible
  # to have different distributed-data settings for different sharding entity types.
  # Only used when state-store-mode=ddata
  distributed-data = ${akka.cluster.distributed-data}
  distributed-data {
    # minCap parameter to MajorityWrite and MajorityRead consistency level.
    majority-min-cap = 5
    durable.keys = ["shard-*"]
    
    # When using many entities with "remember entities" the Gossip message
    # can become too large if including too many in same message. Limit to
    # the same number as the number of ORSet per shard.
    max-delta-elements = 5

    # ShardCoordinator is singleton running on oldest
    prefer-oldest = on
  }

  # The id of the dispatcher to use for ClusterSharding actors.
  # If specified, you need to define the settings of the actual dispatcher.
  # This dispatcher for the entity actors is defined by the user provided
  # Props, i.e. this dispatcher is not used for the entity actors.
  use-dispatcher = "akka.actor.internal-dispatcher"

  # Config path of the lease that each shard must acquire before starting entity actors
  # default is no lease
  # A lease can also be used for the singleton coordinator by settings it in the coordinator-singleton properties
  use-lease = ""

  # The interval between retries for acquiring the lease
  lease-retry-interval = 5s

  # Provide a higher level of details in the debug logs, often per routed message. Be careful about enabling
  # in production systems.
  verbose-debug-logging = off

  # Throw an exception if the internal state machine in the Shard actor does an invalid state transition.
  # Mostly for the Akka test suite. If off, the invalid transition is logged as a warning instead of throwing and
  # crashing the shard.
  fail-on-invalid-entity-state-transition = off

  # Healthcheck that can be used with Akka management health checks: https://doc.akka.io/libraries/akka-management/current/healthchecks.html
  healthcheck {
    # sharding names to check have registered with the coordinator for the health check to pass
    # once initial registration has taken place the health check always returns true to prevent the coordinator
    # moving making the health check of all nodes fail
    # by default no sharding instances are monitored
    names = []

    # Timeout for the local shard region to respond. This should be lower than your monitoring system's
    # timeout for health checks
    timeout = 5s
  }
}
```

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-cluster-sharding-typed/src/main/resources/reference.conf#L4-L11 "Go to snippet source")akka.cluster.sharding {
  # Number of shards used by the default HashCodeMessageExtractor
  # when no other message extractor is defined. This value must be
  # the same for all nodes in the cluster and that is verified by
  # configuration check when joining. Changing the value requires
  # stopping all nodes in the cluster.
  number-of-shards = 1000
}
```

## Example project

[Sharding example project](https://developer.lightbend.com/start/?group=akka&project=akka-samples-cluster-sharding-java) [Sharding example project](https://developer.lightbend.com/start/?group=akka&project=akka-samples-cluster-sharding-scala) is an example project that can be downloaded, and with instructions of how to run.

This project contains a KillrWeather sample illustrating how to use Cluster Sharding.

## Code Examples

### Example 1: Module info

```scala
val AkkaVersion = "2.6.21"
libraryDependencies += "com.typesafe.akka" %% "akka-cluster-sharding-typed" % AkkaVersion
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
      <version>2.6.21</version>
      <type>pom</type>
      <scope>import</scope>
    </dependency&gt
  </dependencies>
</dependencyManagement>
<dependencies&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-cluster-sharding-typed_${scala.binary.version}</artifactId>
  </dependency&gt
</dependencies>
```

### Example 3: Module info

```gradle
def versions = [
  ScalaBinary: "2.13"
]
dependencies {
  implementation platform("com.typesafe.akka:akka-bom_${versions.ScalaBinary}:2.6.21")

  implementation "com.typesafe.akka:akka-cluster-sharding-typed_${versions.ScalaBinary}"
}
```

### Example 4: Basic example

```scala
import akka.cluster.sharding.typed.ShardingEnvelope
import akka.cluster.sharding.typed.scaladsl.ClusterSharding
import akka.cluster.sharding.typed.scaladsl.EntityTypeKey
import akka.cluster.sharding.typed.scaladsl.EntityRef

val sharding = ClusterSharding(system)
```

### Example 5: Basic example

```java
import akka.cluster.sharding.typed.ShardingEnvelope;
import akka.cluster.sharding.typed.javadsl.ClusterSharding;
import akka.cluster.sharding.typed.javadsl.EntityTypeKey;
import akka.cluster.sharding.typed.javadsl.EntityRef;
import akka.cluster.sharding.typed.javadsl.Entity;
import akka.persistence.typed.PersistenceId;

ClusterSharding sharding = ClusterSharding.get(system);
```

### Example 6: Basic example

```scala
object Counter {
  sealed trait Command
  case object Increment extends Command
  final case class GetValue(replyTo: ActorRef[Int]) extends Command

  def apply(entityId: String): Behavior[Command] = {
    def updated(value: Int): Behavior[Command] = {
      Behaviors.receiveMessage[Command] {
        case Increment =>
          updated(value + 1)
        case GetValue(replyTo) =>
          replyTo ! value
          Behaviors.same
      }
    }

    updated(0)

  }
}
```

### Example 7: Basic example

```java
public class Counter extends AbstractBehavior<Counter.Command> {

  public interface Command {}

  public enum Increment implements Command {
    INSTANCE
  }

  public static class GetValue implements Command {
    private final ActorRef<Integer> replyTo;

    public GetValue(ActorRef<Integer> replyTo) {
      this.replyTo = replyTo;
    }
  }

  public static Behavior<Command> create(String entityId) {
    return Behaviors.setup(context -> new Counter(context, entityId));
  }

  private final String entityId;
  private int value = 0;

  private Counter(ActorContext<Command> context, String entityId) {
    super(context);
    this.entityId = entityId;
  }

  @Override
  public Receive<Command> createReceive() {
    return newReceiveBuilder()
        .onMessage(Increment.class, msg -> onIncrement())
        .onMessage(GetValue.class, this::onGetValue)
        .build();
  }

  private Behavior<Command> onIncrement() {
    value++;
    return this;
  }

  private Behavior<Command> onGetValue(GetValue msg) {
    msg.replyTo.tell(value);
    return this;
  }
}
```

### Example 8: Basic example

```scala
val TypeKey = EntityTypeKey[Counter.Command]("Counter")

val shardRegion: ActorRef[ShardingEnvelope[Counter.Command]] =
  sharding.init(Entity(TypeKey)(createBehavior = entityContext => Counter(entityContext.entityId)))
```

### Example 9: Basic example

```java
EntityTypeKey<Counter.Command> typeKey = EntityTypeKey.create(Counter.Command.class, "Counter");

ActorRef<ShardingEnvelope<Counter.Command>> shardRegion =
    sharding.init(Entity.of(typeKey, ctx -> Counter.create(ctx.getEntityId())));
```

### Example 10: Basic example

```scala
// With an EntityRef
val counterOne: EntityRef[Counter.Command] = sharding.entityRefFor(TypeKey, "counter-1")
counterOne ! Counter.Increment

// Entity id is specified via an `ShardingEnvelope`
shardRegion ! ShardingEnvelope("counter-1", Counter.Increment)
```

### Example 11: Basic example

```java
EntityRef<Counter.Command> counterOne = sharding.entityRefFor(typeKey, "counter-1");
counterOne.tell(Counter.Increment.INSTANCE);

shardRegion.tell(new ShardingEnvelope<>("counter-1", Counter.Increment.INSTANCE));
```

### Example 12: Basic example

```scala
sharding.init(
  Entity(TypeKey)(createBehavior = entityContext => Counter(entityContext.entityId)).withRole("backend"))
```

### Example 13: Basic example

```java
EntityTypeKey<Counter.Command> typeKey = EntityTypeKey.create(Counter.Command.class, "Counter");

ActorRef<ShardingEnvelope<Counter.Command>> shardRegionOrProxy =
    sharding.init(
        Entity.of(typeKey, ctx -> Counter.create(ctx.getEntityId())).withRole("backend"));
```

### Example 14: Persistence example

```scala
import akka.actor.typed.Behavior
import akka.cluster.sharding.typed.scaladsl.EntityTypeKey
import akka.persistence.typed.scaladsl.Effect

object HelloWorld {

  // Command
  sealed trait Command extends CborSerializable
  final case class Greet(whom: String)(val replyTo: ActorRef[Greeting]) extends Command
  // Response
  final case class Greeting(whom: String, numberOfPeople: Int) extends CborSerializable

  // Event
  final case class Greeted(whom: String) extends CborSerializable

  // State
  final case class KnownPeople(names: Set[String]) extends CborSerializable {
    def add(name: String): KnownPeople = copy(names = names + name)

    def numberOfPeople: Int = names.size
  }

  private val commandHandler: (KnownPeople, Command) => Effect[Greeted, KnownPeople] = { (_, cmd) =>
    cmd match {
      case cmd: Greet => greet(cmd)
    }
  }

  private def greet(cmd: Greet): Effect[Greeted, KnownPeople] =
    Effect.persist(Greeted(cmd.whom)).thenRun(state => cmd.replyTo ! Greeting(cmd.whom, state.numberOfPeople))

  private val eventHandler: (KnownPeople, Greeted) => KnownPeople = { (state, evt) =>
    state.add(evt.whom)
  }

  val TypeKey: EntityTypeKey[Command] =
    EntityTypeKey[Command]("HelloWorld")

  def apply(entityId: String, persistenceId: PersistenceId): Behavior[Command] = {
    Behaviors.setup { context =>
      context.log.info("Starting HelloWorld {}", entityId)
      EventSourcedBehavior(persistenceId, emptyState = KnownPeople(Set.empty), commandHandler, eventHandler)
    }
  }

}
```

### Example 15: Persistence example

```java
import akka.actor.typed.javadsl.Behaviors;
import akka.cluster.sharding.typed.javadsl.EntityTypeKey;
import akka.persistence.typed.PersistenceId;
import akka.persistence.typed.javadsl.CommandHandler;
import akka.persistence.typed.javadsl.Effect;
import akka.persistence.typed.javadsl.EventHandler;

public static class HelloWorld
    extends EventSourcedBehavior<HelloWorld.Command, HelloWorld.Greeted, HelloWorld.KnownPeople> {

  // Command
  public interface Command extends CborSerializable {}

  public static final class Greet implements Command {
    public final String whom;
    public final ActorRef<Greeting> replyTo;

    public Greet(String whom, ActorRef<Greeting> replyTo) {
      this.whom = whom;
      this.replyTo = replyTo;
    }
  }

  // Response
  public static final class Greeting implements CborSerializable {
    public final String whom;
    public final int numberOfPeople;

    public Greeting(String whom, int numberOfPeople) {
      this.whom = whom;
      this.numberOfPeople = numberOfPeople;
    }
  }

  // Event
  public static final class Greeted implements CborSerializable {
    public final String whom;

    @JsonCreator
    public Greeted(String whom) {
      this.whom = whom;
    }
  }

  // State
  static final class KnownPeople implements CborSerializable {
    private Set<String> names = Collections.emptySet();

    KnownPeople() {}

    private KnownPeople(Set<String> names) {
      this.names = names;
    }

    KnownPeople add(String name) {
      Set<String> newNames = new HashSet<>(names);
      newNames.add(name);
      return new KnownPeople(newNames);
    }

    int numberOfPeople() {
      return names.size();
    }
  }

  public static final EntityTypeKey<Command> ENTITY_TYPE_KEY =
      EntityTypeKey.create(Command.class, "HelloWorld");

  public static Behavior<Command> create(String entityId, PersistenceId persistenceId) {
    return Behaviors.setup(context -> new HelloWorld(context, entityId, persistenceId));
  }

  private HelloWorld(
      ActorContext<Command> context, String entityId, PersistenceId persistenceId) {
    super(persistenceId);
    context.getLog().info("Starting HelloWorld {}", entityId);
  }

  @Override
  public KnownPeople emptyState() {
    return new KnownPeople();
  }

  @Override
  public CommandHandler<Command, Greeted, KnownPeople> commandHandler() {
    return newCommandHandlerBuilder().forAnyState().onCommand(Greet.class, this::greet).build();
  }

  private Effect<Greeted, KnownPeople> greet(KnownPeople state, Greet cmd) {
    return Effect()
        .persist(new Greeted(cmd.whom))
        .thenRun(newState -> cmd.replyTo.tell(new Greeting(cmd.whom, newState.numberOfPeople())));
  }

  @Override
  public EventHandler<KnownPeople, Greeted> eventHandler() {
    return (state, evt) -> state.add(evt.whom);
  }
}
```

### Example 16: Persistence example

```scala
import akka.cluster.sharding.typed.scaladsl.ClusterSharding
import akka.cluster.sharding.typed.scaladsl.Entity
import akka.util.Timeout

class HelloWorldService(system: ActorSystem[_]) {
  import system.executionContext

  private val sharding = ClusterSharding(system)

  // registration at startup
  sharding.init(Entity(typeKey = HelloWorld.TypeKey) { entityContext =>
    HelloWorld(entityContext.entityId, PersistenceId(entityContext.entityTypeKey.name, entityContext.entityId))
  })

  private implicit val askTimeout: Timeout = Timeout(5.seconds)

  def greet(worldId: String, whom: String): Future[Int] = {
    val entityRef = sharding.entityRefFor(HelloWorld.TypeKey, worldId)
    val greeting = entityRef ? HelloWorld.Greet(whom)
    greeting.map(_.numberOfPeople)
  }

}
```

### Example 17: Persistence example

```java
import akka.cluster.sharding.typed.javadsl.ClusterSharding;
import akka.cluster.sharding.typed.javadsl.EntityRef;
import akka.cluster.sharding.typed.javadsl.Entity;
import akka.persistence.typed.javadsl.EventSourcedBehavior;
import akka.serialization.jackson.CborSerializable;
import akka.util.Timeout;
import com.fasterxml.jackson.annotation.JsonCreator;

public static class HelloWorldService {
  private final ActorSystem<?> system;
  private final ClusterSharding sharding;
  private final Duration askTimeout = Duration.ofSeconds(5);

  // registration at startup
  public HelloWorldService(ActorSystem<?> system) {
    this.system = system;
    sharding = ClusterSharding.get(system);

    // registration at startup
    sharding.init(
        Entity.of(
            HelloWorld.ENTITY_TYPE_KEY,
            entityContext ->
                HelloWorld.create(
                    entityContext.getEntityId(),
                    PersistenceId.of(
                        entityContext.getEntityTypeKey().name(), entityContext.getEntityId()))));
  }

  // usage example
  public CompletionStage<Integer> sayHello(String worldId, String whom) {
    EntityRef<HelloWorld.Command> entityRef =
        sharding.entityRefFor(HelloWorld.ENTITY_TYPE_KEY, worldId);
    CompletionStage<HelloWorld.Greeting> result =
        entityRef.ask(replyTo -> new HelloWorld.Greet(whom, replyTo), askTimeout);
    return result.thenApply(greeting -> greeting.numberOfPeople);
  }
}
```

### Example 18: Shard allocation

```conf
akka.cluster.sharding {
  # Number of shards used by the default HashCodeMessageExtractor
  # when no other message extractor is defined. This value must be
  # the same for all nodes in the cluster and that is verified by
  # configuration check when joining. Changing the value requires
  # stopping all nodes in the cluster.
  number-of-shards = 1000
}
```

### Example 19: Shard allocation

```text
akka.cluster.sharding.least-shard-allocation-strategy.rebalance-absolute-limit = 20
```

### Example 20: External shard allocation

```scala
val TypeKey = EntityTypeKey[Counter.Command]("Counter")

val entity = Entity(TypeKey)(createBehavior = entityContext => Counter(entityContext.entityId))
  .withAllocationStrategy(new ExternalShardAllocationStrategy(system, TypeKey.name))
```

### Example 21: External shard allocation

```java
EntityTypeKey<Counter.Command> typeKey = EntityTypeKey.create(Counter.Command.class, "Counter");

ActorRef<ShardingEnvelope<Counter.Command>> shardRegion =
    sharding.init(Entity.of(typeKey, ctx -> Counter.create(ctx.getEntityId())));
```

### Example 22: External shard allocation

```scala
val client: ExternalShardAllocationClient = ExternalShardAllocation(system).clientFor(TypeKey.name)
val done: Future[Done] = client.updateShardLocation("shard-id-1", Address("akka", "system", "127.0.0.1", 2552))
```

### Example 23: External shard allocation

```java
ExternalShardAllocationClient client =
    ExternalShardAllocation.get(system).getClient(typeKey.name());
CompletionStage<Done> done =
    client.setShardLocation("shard-id-1", new Address("akka", "system", "127.0.0.1", 2552));
```

### Example 24: Passivation

```scala
object Counter {
  sealed trait Command
  case object Increment extends Command
  final case class GetValue(replyTo: ActorRef[Int]) extends Command
  private case object Idle extends Command
  case object GoodByeCounter extends Command

  def apply(shard: ActorRef[ClusterSharding.ShardCommand], entityId: String): Behavior[Command] = {
    Behaviors.setup { ctx =>
      def updated(value: Int): Behavior[Command] =
        Behaviors.receiveMessage[Command] {
          case Increment =>
            updated(value + 1)
          case GetValue(replyTo) =>
            replyTo ! value
            Behaviors.same
          case Idle =>
            // after receive timeout
            shard ! ClusterSharding.Passivate(ctx.self)
            Behaviors.same
          case GoodByeCounter =>
            // the stopMessage, used for rebalance and passivate
            Behaviors.stopped
        }

      ctx.setReceiveTimeout(30.seconds, Idle)
      updated(0)
    }
  }
}
```

### Example 25: Passivation

```java
public class Counter2 extends AbstractBehavior<Counter2.Command> {

  public interface Command {}

  private enum Idle implements Command {
    INSTANCE
  }

  public enum GoodByeCounter implements Command {
    INSTANCE
  }

  public enum Increment implements Command {
    INSTANCE
  }

  public static class GetValue implements Command {
    private final ActorRef<Integer> replyTo;

    public GetValue(ActorRef<Integer> replyTo) {
      this.replyTo = replyTo;
    }
  }

  public static Behavior<Command> create(
      ActorRef<ClusterSharding.ShardCommand> shard, String entityId) {
    return Behaviors.setup(
        ctx -> {
          ctx.setReceiveTimeout(Duration.ofSeconds(30), Idle.INSTANCE);
          return new Counter2(ctx, shard, entityId);
        });
  }

  private final ActorRef<ClusterSharding.ShardCommand> shard;
  private final String entityId;
  private int value = 0;

  private Counter2(
      ActorContext<Command> context,
      ActorRef<ClusterSharding.ShardCommand> shard,
      String entityId) {
    super(context);
    this.shard = shard;
    this.entityId = entityId;
  }

  @Override
  public Receive<Command> createReceive() {
    return newReceiveBuilder()
        .onMessage(Increment.class, msg -> onIncrement())
        .onMessage(GetValue.class, this::onGetValue)
        .onMessage(Idle.class, msg -> onIdle())
        .onMessage(GoodByeCounter.class, msg -> onGoodByeCounter())
        .build();
  }

  private Behavior<Command> onIncrement() {
    value++;
    return this;
  }

  private Behavior<Command> onGetValue(GetValue msg) {
    msg.replyTo.tell(value);
    return this;
  }

  private Behavior<Command> onIdle() {
    // after receive timeout
    shard.tell(new ClusterSharding.Passivate<>(getContext().getSelf()));
    return this;
  }

  private Behavior<Command> onGoodByeCounter() {
    // the stopMessage, used for rebalance and passivate
    return Behaviors.stopped();
  }
}
```

### Example 26: Passivation

```scala
val TypeKey = EntityTypeKey[Counter.Command]("Counter")

ClusterSharding(system).init(Entity(TypeKey)(createBehavior = entityContext =>
  Counter(entityContext.shard, entityContext.entityId)).withStopMessage(Counter.GoodByeCounter))
```

### Example 27: Passivation

```java
EntityTypeKey<Counter2.Command> typeKey =
    EntityTypeKey.create(Counter2.Command.class, "Counter");

sharding.init(
    Entity.of(typeKey, ctx -> Counter2.create(ctx.getShard(), ctx.getEntityId()))
        .withStopMessage(Counter2.GoodByeCounter.INSTANCE));
```

### Example 28: Idle entity passivation

```conf
akka.cluster.sharding.passivation {
  default-idle-strategy.idle-entity.timeout = 3 minutes
}
```

### Example 29: Active entity limits

```conf
akka.cluster.sharding.passivation {
  strategy = default-strategy
}
```

### Example 30: Active entity limits

```conf
akka.cluster.sharding.passivation {
  strategy = default-strategy
  default-strategy {
    active-entity-limit = 1000000
  }
}
```

### Example 31: Active entity limits

```conf
akka.cluster.sharding.passivation {
  strategy = default-strategy
  default-strategy {
    idle-entity.timeout = 30.minutes
  }
}
```

### Example 32: Custom passivation strategies

```conf
akka.cluster.sharding.passivation {
  strategy = custom-lru-strategy
  custom-lru-strategy {
    active-entity-limit = 1000000
    replacement.policy = least-recently-used
  }
}
```

### Example 33: Least recently used policy

```conf
akka.cluster.sharding.passivation {
  strategy = custom-lru-strategy
  custom-lru-strategy {
    active-entity-limit = 1000000
    replacement.policy = least-recently-used
  }
}
```

### Example 34: Segmented least recently used policy

```conf
akka.cluster.sharding.passivation {
  strategy = custom-slru-strategy
  custom-slru-strategy {
    active-entity-limit = 1000000
    replacement {
      policy = least-recently-used
      least-recently-used {
        segmented {
          levels = 2
          proportions = [0.2, 0.8]
        }
      }
    }
  }
}
```

### Example 35: Segmented least recently used policy

```conf
akka.cluster.sharding.passivation {
  strategy = custom-s4lru-strategy
  custom-s4lru-strategy {
    active-entity-limit = 1000000
    replacement {
      policy = least-recently-used
      least-recently-used {
        segmented.levels = 4
      }
    }
  }
}
```

### Example 36: Most recently used policy

```conf
akka.cluster.sharding.passivation {
  strategy = custom-mru-strategy
  custom-mru-strategy {
    active-entity-limit = 1000000
    replacement.policy = most-recently-used
  }
}
```

### Example 37: Least frequently used policy

```conf
akka.cluster.sharding.passivation {
  strategy = custom-lfu-strategy
  custom-lfu-strategy {
    active-entity-limit = 1000000
    replacement.policy = least-frequently-used
  }
}
```

### Example 38: Least frequently used with dynamic aging policy

```conf
akka.cluster.sharding.passivation {
  strategy = custom-lfu-with-dynamic-aging
  custom-lfu-with-dynamic-aging {
    active-entity-limit = 1000
    replacement {
      policy = least-frequently-used
      least-frequently-used {
        dynamic-aging = on
      }
    }
  }
}
```

### Example 39: Admission window policy

```conf
akka.cluster.sharding.passivation {
  strategy = custom-strategy-with-admission-window
  custom-strategy-with-admission-window {
    active-entity-limit = 1000000
    admission.window.policy = least-recently-used
    replacement.policy = least-frequently-used
  }
}
```

### Example 40: Admission window policy

```conf
akka.cluster.sharding.passivation {
  strategy = custom-strategy-with-admission-window
  custom-strategy-with-admission-window {
    active-entity-limit = 1000000
    admission.window {
      policy = least-recently-used
      proportion = 0.1 # 10%
    }
    replacement.policy = least-frequently-used
  }
}
```

### Example 41: Admission window optimizer

```conf
akka.cluster.sharding.passivation {
  strategy = custom-strategy-with-admission-window
  custom-strategy-with-admission-window {
    active-entity-limit = 1000000
    admission.window {
      policy = least-recently-used
      optimizer = hill-climbing
    }
    replacement.policy = least-frequently-used
  }
}
```

### Example 42: Admission filter

```conf
akka.cluster.sharding.passivation {
  strategy = custom-strategy-with-admission
  custom-strategy-with-admission {
    active-entity-limit = 1000000
    admission {
      window {
        policy = least-recently-used
        optimizer = hill-climbing
      }
      filter = frequency-sketch
    }
    replacement {
      policy = least-recently-used
      least-recently-used {
        segmented {
          levels = 2
          proportions = [0.2, 0.8]
        }
      }
    }
  }
}
```

### Example 43: Distributed Data Mode

```text
akka.cluster.sharding.state-store-mode = ddata
```

### Example 44: Persistence mode

```text
akka.cluster.sharding.state-store-mode = persistence
```

### Example 45: Remember entities distributed data mode

```text
akka.cluster.sharding.remember-entities-store = ddata
```

### Example 46: Remember entities distributed data mode

```text
akka.cluster.sharding.distributed-data.durable.keys = []
```

### Example 47: Event sourced mode

```text
akka.cluster.sharding.remember-entities-store = eventsourced
```

### Example 48: Event sourced mode

```text
akka.cluster.sharding.journal-plugin-id = <plugin>
akka.cluster.sharding.snapshot-plugin-id = <plugin>
```

### Example 49: Migrating from deprecated persistence mode

```text
akka.persistence.cassandra.journal {
  event-adapters {
    coordinator-migration = "akka.cluster.sharding.OldCoordinatorStateMigrationEventAdapter"
  }

  event-adapter-bindings {
    "akka.cluster.sharding.ShardCoordinator$Internal$DomainEvent" = coordinator-migration
  }
}
```

### Example 50: Migrating from deprecated persistence mode

```text
akka.cluster.sharding.distributed-data.durable.keys = []
```

### Example 51: Health check

```ruby
akka.management.health-checks.readiness-checks {
  sharding = ""
}
```

### Example 52: Health check

```ruby
akka.cluster.sharding.healthcheck.names = ["counter-1", "HelloWorld"]
```

### Example 53: Inspecting cluster sharding state

```scala
import akka.cluster.sharding.typed.GetShardRegionState
import akka.cluster.sharding.ShardRegion.CurrentShardRegionState

val replyTo: ActorRef[CurrentShardRegionState] = replyMessageAdapter

ClusterSharding(system).shardState ! GetShardRegionState(Counter.TypeKey, replyTo)
```

### Example 54: Inspecting cluster sharding state

```java
import akka.cluster.sharding.typed.GetShardRegionState;
import akka.cluster.sharding.ShardRegion.CurrentShardRegionState;

ActorRef<CurrentShardRegionState> replyTo = replyMessageAdapter;

ClusterSharding.get(system).shardState().tell(new GetShardRegionState(typeKey, replyTo));
```

### Example 55: Inspecting cluster sharding state

```scala
import akka.cluster.sharding.typed.GetClusterShardingStats
import akka.cluster.sharding.ShardRegion.ClusterShardingStats
import scala.concurrent.duration._

val replyTo: ActorRef[ClusterShardingStats] = replyMessageAdapter
val timeout: FiniteDuration = 5.seconds

ClusterSharding(system).shardState ! GetClusterShardingStats(Counter.TypeKey, timeout, replyTo)
```

### Example 56: Inspecting cluster sharding state

```java
import akka.cluster.sharding.typed.GetClusterShardingStats;
import akka.cluster.sharding.ShardRegion.ClusterShardingStats;

ActorRef<ClusterShardingStats> replyTo = replyMessageAdapter;
Duration timeout = Duration.ofSeconds(5);

ClusterSharding.get(system)
    .shardState()
    .tell(new GetClusterShardingStats(typeKey, timeout, replyTo));
```

### Example 57: Removal of internal Cluster Sharding data

```text
java -classpath <jar files, including akka-cluster-sharding>
  akka.cluster.sharding.RemoveInternalClusterShardingData
    -2.3 entityType1 entityType2 entityType3
```

### Example 58: Configuration

```conf
# Settings for the ClusterShardingExtension
akka.cluster.sharding {

  # The extension creates a top level actor with this name in top level system scope,
  # e.g. '/system/sharding'
  guardian-name = sharding

  # Specifies that entities run on cluster nodes with a specific role.
  # If the role is not specified (or empty) all nodes in the cluster are used.
  role = ""

  # When this is set to 'on' the active entity actors will automatically be restarted
  # upon Shard restart. i.e. if the Shard is started on a different ShardRegion
  # due to rebalance or crash.
  remember-entities = off

  # When 'remember-entities' is enabled and the state store mode is ddata this controls
  # how the remembered entities and shards are stored. Possible values are "eventsourced" and "ddata"
  # Default is ddata for backwards compatibility.
  remember-entities-store = "ddata"

  # Deprecated: use the `passivation.default-idle-strategy.idle-entity.timeout` setting instead.
  # Set this to a time duration to have sharding passivate entities when they have not
  # received any message in this length of time. Set to 'off' to disable.
  # It is always disabled if `remember-entities` is enabled.
  passivate-idle-entity-after = null

  # Automatic entity passivation settings.
  passivation {

    # Automatic passivation strategy to use.
    # Set to "none" or "off" to disable automatic passivation.
    # Set to "default-strategy" to switch to the recommended default strategy with an active entity limit.
    # See the strategy-defaults section for possible passivation strategy settings and default values.
    # Passivation strategies are always disabled if `remember-entities` is enabled.
    #
    # API MAY CHANGE: Configuration for passivation strategies, except default-idle-strategy,
    # may change after additional testing and feedback.
    strategy = "default-idle-strategy"

    # Default passivation strategy without active entity limit; time out idle entities after 2 minutes.
    default-idle-strategy {
      idle-entity.timeout = 120s
    }

    # Recommended default strategy for automatic passivation with an active entity limit.
    # Configured with an adaptive recency-based admission window, a frequency-based admission filter, and
    # a segmented least recently used (SLRU) replacement policy for the main active entity tracking.
    default-strategy {
      # Default limit of 100k active entities in a shard region (in a cluster node).
      active-entity-limit = 100000

      # Admisson window with LRU policy and adaptive sizing, and a frequency sketch admission filter to the main area.
      admission {
        window {
          policy = least-recently-used
          optimizer = hill-climbing
        }
        filter = frequency-sketch
      }

      # Main area with segmented LRU replacement policy with an 80% "protected" level by default.
      replacement {
        policy = least-recently-used
        least-recently-used {
          segmented {
            levels = 2
            proportions = [0.2, 0.8]
          }
        }
      }
    }

    strategy-defaults {
      # Passivate entities when they have not received a message for a specified length of time.
      idle-entity {
        # Passivate idle entities after the timeout. Set to "none" or "off" to disable.
        timeout = none

        # Check idle entities every interval. Set to "default" to use half the timeout by default.
        interval = default
      }

      # Limit of active entities in a shard region.
      # Passivate entities when the number of active entities in a shard region reaches this limit.
      # The per-region limit is divided evenly among the active shards in a region.
      # Set to "none" or "off" to disable limit-based automatic passivation, to only use idle entity timeouts.
      active-entity-limit = none

      # Entity replacement settings, for when the active entity limit is reached.
      replacement {
        # Entity replacement policy to use when the active entity limit is reached. Possible values are:
        #   - "least-recently-used"
        #   - "most-recently-used"
        #   - "least-frequently-used"
        # Set to "none" or "off" to disable the replacement policy and ignore the active entity limit.
        policy = none

        # Least recently used entity replacement policy.
        least-recently-used {
          # Optionally use a "segmented" least recently used strategy.
          # Disabled when segmented.levels are set to "none" or "off".
          segmented {
            # Number of segmented levels.
            levels = none

            # Fractional proportions for the segmented levels.
            # If empty then segments are divided evenly by the number of levels.
            proportions = []
          }
        }

        # Most recently used entity replacement policy.
        most-recently-used {}

        # Least frequently used entity replacement policy.
        least-frequently-used {
          # New frequency counts will be "dynamically aged" when enabled.
          dynamic-aging = off
        }
      }

      # An optional admission area, with a window for newly and recently activated entities, and an admission filter
      # to determine whether a candidate should be admitted to the main area of the passivation strategy.
      admission {
        # An optional window area, where newly created entities will be admitted initially, and when evicted
        # from the window area have an opportunity to move to the main area based on the admission filter.
        window {
          # The initial sizing for the window area (if enabled), as a fraction of the total active entity limit.
          proportion = 0.01

          # The minimum adaptive sizing for the window area, as a fraction of the total active entity limit.
          # Only applies when an adaptive window optimizer is enabled.
          minimum-proportion = 0.01

          # The maximum adaptive sizing for the window area, as a fraction of the total active entity limit.
          # Only applies when an adaptive window optimizer is enabled.
          maximum-proportion = 1.0

          # Adaptive optimizer to use for dynamically resizing the window area. Possible values are:
          #   - "hill-climbing"
          # Set to "none" or "off" to disable adaptive sizing of the window area.
          optimizer = off

          # A window proportion optimizer using a simple hill-climbing algorithm.
          hill-climbing {
            # Multiplier of the active entity limit for how often (in accesses) to adjust the window proportion.
            adjust-multiplier = 10.0

            # The size of the initial step to take (also used when the climbing restarts).
            initial-step = 0.0625

            # A threshold for the change in active rate (hit rate) to restart climbing.
            restart-threshold = 0.05

            # The decay ratio applied on each climbing step.
            step-decay = 0.98
          }

          # Replacement policy to use for the window area.
          # Entities that are evicted from the window area may move to the main area, based on the admission filter.
          # Possible values are the same as for the main replacement policy.
          # Set to "none" or "off" to disable the window area.
          policy = none

          least-recently-used {
            segmented {
              levels = none
              proportions = []
            }
          }

          most-recently-used {}

          least-frequently-used {
            dynamic-aging = off
          }
        }

        # The admission filter for the main area of the passivation strategy. Possible values are:
        #   - "frequency-sketch"
        # Set to "none" or "off" to disable the admission filter and always admit to the main area.
        filter = none

        # An admission filter based on a frequency sketch (a variation of a count-min sketch).
        frequency-sketch {
          # The depth of the frequency sketch (the number of hash functions).
          depth = 4

          # The size of the frequency counters in bits: 2, 4, 8, 16, 32, or 64 bits.
          counter-bits = 4

          # Multiplier of the active entity limit for the width of the frequency sketch.
          width-multiplier = 4

          # Multiplier of the active entity limit for how often the reset operation of the frequency sketch is applied.
          reset-multiplier = 10.0
        }
      }
    }
  }

  # If the coordinator can't store state changes it will be stopped
  # and started again after this duration, with an exponential back-off
  # of up to 5 times this duration.
  coordinator-failure-backoff = 5 s

  # The ShardRegion retries registration and shard location requests to the
  # ShardCoordinator with this interval if it does not reply.
  retry-interval = 2 s

  # Maximum number of messages that are buffered by a ShardRegion actor.
  buffer-size = 100000

  # Timeout of the shard rebalancing process.
  # Additionally, if an entity doesn't handle the stopMessage
  # after (handoff-timeout - 5.seconds).max(1.second) it will be stopped forcefully
  handoff-timeout = 60 s

  # Time given to a region to acknowledge it's hosting a shard.
  shard-start-timeout = 10 s

  # If the shard is remembering entities and can't store state changes, it
  # will be stopped and then started again after this duration. Any messages
  # sent to an affected entity may be lost in this process.
  shard-failure-backoff = 10 s

  # If the shard is remembering entities and an entity stops itself without
  # using passivate, the entity will be restarted after this duration or when
  # the next message for it is received, whichever occurs first.
  entity-restart-backoff = 10 s

  # Rebalance check is performed periodically with this interval.
  rebalance-interval = 10 s

  # Absolute path to the journal plugin configuration entity that is to be
  # used for the internal persistence of ClusterSharding. If not defined,
  # the default journal plugin is used. Note that this is not related to
  # persistence used by the entity actors.
  # Only used when state-store-mode=persistence
  journal-plugin-id = ""

  # Absolute path to the snapshot plugin configuration entity that is to be
  # used for the internal persistence of ClusterSharding. If not defined,
  # the default snapshot plugin is used. Note that this is not related to
  # persistence used by the entity actors.
  # Only used when state-store-mode=persistence
  snapshot-plugin-id = ""

  # Defines how the coordinator stores its state. Same is also used by the
  # shards for rememberEntities.
  # Valid values are "ddata" or "persistence".
  # "persistence" mode is deprecated
  state-store-mode = "ddata"

  # The shard saves persistent snapshots after this number of persistent
  # events. Snapshots are used to reduce recovery times. A snapshot trigger might be delayed if a batch of updates is processed.
  # Only used when state-store-mode=persistence
  snapshot-after = 1000

  # The shard deletes persistent events (messages and snapshots) after doing snapshot
  # keeping this number of old persistent batches.
  # Batch is of size `snapshot-after`.
  # When set to 0, after snapshot is successfully done, all events with equal or lower sequence number will be deleted.
  # Default value of 2 leaves last maximum 2*`snapshot-after` events and 3 snapshots (2 old ones + latest snapshot).
  # If larger than 0, one additional batch of journal messages is kept when state-store-mode=persistence to include messages from delayed snapshots.
  keep-nr-of-batches = 2

  # Settings for LeastShardAllocationStrategy.
  #
  # A new rebalance algorithm was included in Akka 2.6.10. It can reach optimal balance in
  # less rebalance rounds (typically 1 or 2 rounds). The amount of shards to rebalance in each
  # round can still be limited to make it progress slower. For backwards compatibility,
  # the new algorithm is not enabled by default. Enable the new algorithm by setting
  # `rebalance-absolute-limit` > 0, for example:
  # akka.cluster.sharding.least-shard-allocation-strategy.rebalance-absolute-limit=20
  # The new algorithm is recommended and will become the default in future versions of Akka.
  least-shard-allocation-strategy {
    # Maximum number of shards that will be rebalanced in one rebalance round.
    # The lower of this and `rebalance-relative-limit` will be used.
    rebalance-absolute-limit = 0

    # Maximum number of shards that will be rebalanced in one rebalance round.
    # Fraction of total number of (known) shards.
    # The lower of this and `rebalance-absolute-limit` will be used.
    rebalance-relative-limit = 0.1

    # Deprecated: Use rebalance-absolute-limit and rebalance-relative-limit instead. This property is not used
    # when rebalance-absolute-limit > 0.
    #
    # Threshold of how large the difference between most and least number of
    # allocated shards must be to begin the rebalancing.
    # The difference between number of shards in the region with most shards and
    # the region with least shards must be greater than (>) the `rebalanceThreshold`
    # for the rebalance to occur.
    # It is also the maximum number of shards that will start rebalancing per rebalance-interval
    # 1 gives the best distribution and therefore typically the best choice.
    # Increasing the threshold can result in quicker rebalance but has the
    # drawback of increased difference between number of shards (and therefore load)
    # on different nodes before rebalance will occur.
    rebalance-threshold = 1

    # Deprecated: Use rebalance-absolute-limit and rebalance-relative-limit instead. This property is not used
    # when rebalance-absolute-limit > 0.
    #
    # The number of ongoing rebalancing processes is limited to this number.
    max-simultaneous-rebalance = 3
  }

  external-shard-allocation-strategy {
    # How long to wait for the client to persist an allocation to ddata or get all shard locations
    client-timeout = 5s
  }

  # Timeout of waiting the initial distributed state for the shard coordinator (an initial state will be queried again if the timeout happened)
  # and for a shard to get its state when remembered entities is enabled
  # The read from ddata is a ReadMajority, for small clusters (< majority-min-cap) every node needs to respond
  # so is more likely to time out if there are nodes restarting e.g. when there is a rolling re-deploy happening
  waiting-for-state-timeout = 2 s

  # Timeout of waiting for update the distributed state (update will be retried if the timeout happened)
  # Also used as timeout for writes of remember entities when that is enabled
  updating-state-timeout = 5 s

  # Timeout to wait for querying all shards for a given `ShardRegion`.
  shard-region-query-timeout = 3 s

  # The shard uses this strategy to determines how to recover the underlying entity actors. The strategy is only used
  # by the persistent shard when rebalancing or restarting and is applied per remembered shard starting up (not for
  # entire shard region). The value can either be "all" or "constant". The "all"
  # strategy start all the underlying entity actors at the same time. The constant strategy will start the underlying
  # entity actors at a fix rate. The default strategy "all".
  entity-recovery-strategy = "all"

  # Default settings for the constant rate entity recovery strategy
  entity-recovery-constant-rate-strategy {
    # Sets the frequency at which a batch of entity actors is started.
    frequency = 100 ms
    # Sets the number of entity actors to be restart at a particular interval
    number-of-entities = 5
  }

  event-sourced-remember-entities-store {
    # When using remember entities and the event sourced remember entities store the batches
    # written to the store are limited by this number to avoid getting a too large event for
    # the journal to handle. If using long persistence ids you may have to increase this.
    max-updates-per-write = 100
  }

  # Settings for the coordinator singleton. Same layout as akka.cluster.singleton.
  # The "role" of the singleton configuration is not used. The singleton role will
  # be the same as "akka.cluster.sharding.role" if
  # "akka.cluster.sharding.coordinator-singleton-role-override" is enabled. Disabling it will allow to
  # use separate nodes for the shard coordinator and the shards themselves.
  # A lease can be configured in these settings for the coordinator singleton
  coordinator-singleton = ${akka.cluster.singleton}


  # Copies the role for the coordinator singleton from the shards role instead of using the one provided in the
  # "akka.cluster.sharding.coordinator-singleton.role"
  coordinator-singleton-role-override = on

  coordinator-state {
    # State updates are required to be written to a majority of nodes plus this
    # number of additional nodes. Can also be set to "all" to require
    # writes to all nodes. The reason for write/read to more than majority
    # is to have more tolerance for membership changes between write and read.
    # The tradeoff of increasing this is that updates will be slower.
    # It is more important to increase the `read-majority-plus`.
    write-majority-plus = 3
    # State retrieval when ShardCoordinator is started is required to be read
    # from a majority of nodes plus this number of additional nodes. Can also
    # be set to "all" to require reads from all nodes. The reason for write/read
    # to more than majority is to have more tolerance for membership changes between
    # write and read.
    # The tradeoff of increasing this is that coordinator startup will be slower.
    read-majority-plus = 5
  }
  
  # Settings for the Distributed Data replicator. 
  # Same layout as akka.cluster.distributed-data.
  # The "role" of the distributed-data configuration is not used. The distributed-data
  # role will be the same as "akka.cluster.sharding.role".
  # Note that there is one Replicator per role and it's not possible
  # to have different distributed-data settings for different sharding entity types.
  # Only used when state-store-mode=ddata
  distributed-data = ${akka.cluster.distributed-data}
  distributed-data {
    # minCap parameter to MajorityWrite and MajorityRead consistency level.
    majority-min-cap = 5
    durable.keys = ["shard-*"]
    
    # When using many entities with "remember entities" the Gossip message
    # can become too large if including too many in same message. Limit to
    # the same number as the number of ORSet per shard.
    max-delta-elements = 5

    # ShardCoordinator is singleton running on oldest
    prefer-oldest = on
  }

  # The id of the dispatcher to use for ClusterSharding actors.
  # If specified, you need to define the settings of the actual dispatcher.
  # This dispatcher for the entity actors is defined by the user provided
  # Props, i.e. this dispatcher is not used for the entity actors.
  use-dispatcher = "akka.actor.internal-dispatcher"

  # Config path of the lease that each shard must acquire before starting entity actors
  # default is no lease
  # A lease can also be used for the singleton coordinator by settings it in the coordinator-singleton properties
  use-lease = ""

  # The interval between retries for acquiring the lease
  lease-retry-interval = 5s

  # Provide a higher level of details in the debug logs, often per routed message. Be careful about enabling
  # in production systems.
  verbose-debug-logging = off

  # Throw an exception if the internal state machine in the Shard actor does an invalid state transition.
  # Mostly for the Akka test suite. If off, the invalid transition is logged as a warning instead of throwing and
  # crashing the shard.
  fail-on-invalid-entity-state-transition = off

  # Healthcheck that can be used with Akka management health checks: https://doc.akka.io/libraries/akka-management/current/healthchecks.html
  healthcheck {
    # sharding names to check have registered with the coordinator for the health check to pass
    # once initial registration has taken place the health check always returns true to prevent the coordinator
    # moving making the health check of all nodes fail
    # by default no sharding instances are monitored
    names = []

    # Timeout for the local shard region to respond. This should be lower than your monitoring system's
    # timeout for health checks
    timeout = 5s
  }
}
```

### Example 59: Configuration

```conf
akka.cluster.sharding {
  # Number of shards used by the default HashCodeMessageExtractor
  # when no other message extractor is defined. This value must be
  # the same for all nodes in the cluster and that is verified by
  # configuration check when joining. Changing the value requires
  # stopping all nodes in the cluster.
  number-of-shards = 1000
}
```

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.6.21/akka/cluster/sharding/typed/index.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/typed/ActorRef.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/typed/Behavior.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/typed/scaladsl/ActorContext.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/ddata/LWWMap.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/ddata/Replicator$$ReadMajorityPlus.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/ddata/Replicator$$WriteMajorityPlus.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/ddata/Replicator.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/sharding/RemoveInternalClusterShardingData$.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/sharding/ShardCoordinator$$ShardAllocationStrategy.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/sharding/ShardRegion$$ClusterShardingStats.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/sharding/ShardRegion$$CurrentShardRegionState.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/sharding/external/ExternalShardAllocation.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/sharding/external/ExternalShardAllocationStrategy.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/sharding/typed/ClusterShardingSettings$$PassivationStrategySettings.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/sharding/typed/ClusterShardingSettings.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/sharding/typed/GetClusterShardingStats.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/sharding/typed/GetShardRegionState.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/sharding/typed/ShardingEnvelope.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/sharding/typed/ShardingMessageExtractor.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/sharding/typed/scaladsl/ClusterSharding$$Passivate.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/sharding/typed/scaladsl/ClusterSharding$$ShardCommand.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/sharding/typed/scaladsl/ClusterSharding.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/sharding/typed/scaladsl/Entity.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/sharding/typed/scaladsl/EntityContext.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/sharding/typed/scaladsl/EntityRef.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/sharding/typed/scaladsl/EntityTypeKey.html
- https://doc.akka.io/api/akka-core/2.6/akka/persistence/typed/PersistenceId.html
- https://doc.akka.io/api/akka-core/2.6/akka/persistence/typed/scaladsl/EventSourcedBehavior.html
- https://doc.akka.io/docs/alpakka-kafka/current/cluster-sharding.html
- https://doc.akka.io/japi/akka-core/2.6.21/akka/cluster/sharding/typed/package-summary.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/typed/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/typed/Behavior.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/typed/javadsl/ActorContext.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/ddata/LWWMap.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/ddata/Replicator.ReadMajorityPlus.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/ddata/Replicator.WriteMajorityPlus.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/ddata/Replicator.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/sharding/RemoveInternalClusterShardingData.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/sharding/ShardCoordinator.AbstractShardAllocationStrategy.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/sharding/ShardRegion.ClusterShardingStats.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/sharding/ShardRegion.CurrentShardRegionState.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/sharding/external/ExternalShardAllocation.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/sharding/external/ExternalShardAllocationStrategy.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/sharding/typed/ClusterShardingSettings.PassivationStrategySettings.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/sharding/typed/ClusterShardingSettings.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/sharding/typed/GetClusterShardingStats.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/sharding/typed/GetShardRegionState.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/sharding/typed/ShardingEnvelope.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/sharding/typed/ShardingMessageExtractor.html

---
*Source: [https://doc.akka.io/libraries/akka-core/2.6/typed/cluster-sharding.html](https://doc.akka.io/libraries/akka-core/2.6/typed/cluster-sharding.html)*