---
description: Durable State with Akka Persistence enables actors to persist its state
  for recovery on failure or when migrated within a cluster.
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:31:34Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/typed/durable-state/persistence.html
title: Durable State • Akka Documentation
---

# Durable State • Akka Documentation

> **Summary:** Durable State with Akka Persistence enables actors to persist its state for recovery on failure or when migrated within a cluster.

## Content

# Durable State

## Module info

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

To use Akka Persistence, add the module to your project:

sbt
```
val AkkaVersion = "2.9.8"
libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-persistence-typed" % AkkaVersion,
  "com.typesafe.akka" %% "akka-persistence-testkit" % AkkaVersion % Test
)
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
      <version>2.9.8</version>
      <type>pom</type>
      <scope>import</scope>
    </dependency&gt
  </dependencies>
</dependencyManagement>
<dependencies&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-persistence-typed_${scala.binary.version}</artifactId>
  </dependency&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-persistence-testkit_${scala.binary.version}</artifactId>
    <scope>test</scope>
  </dependency&gt
</dependencies>
```
Gradle
```
def versions = [
  ScalaBinary: "2.13"
]
dependencies {
  implementation platform("com.typesafe.akka:akka-bom_${versions.ScalaBinary}:2.9.8")

  implementation "com.typesafe.akka:akka-persistence-typed_${versions.ScalaBinary}"
  testImplementation "com.typesafe.akka:akka-persistence-testkit_${versions.ScalaBinary}"
}
```

You also have to select durable state store plugin, see [Persistence Plugins](../../persistence-plugins.html).

| Project Info: Akka Event Sourcing (typed) | |
| --- | --- |
| Artifact | com.typesafe.akka akka\-persistence\-typed 2\.9\.8 [Snapshots are available](project/links.html#snapshots-repository) |
| JDK versions | Eclipse Temurin JDK 11Eclipse Temurin JDK 17Eclipse Temurin JDK 21 |
| Scala versions | 2\.13\.14, 3\.3\.3 |
| JPMS module name | akka.persistence.typed |
| License | [BUSL\-1\.1](https://raw.githubusercontent.com/akka/akka/v2.9.8/LICENSE) |
| Readiness level | [Supported](https://doc.akka.io/docs/akka-dependencies/current/support-terminology.html#supported), support is available from [Lightbend](https://www.lightbend.com/akka) Since 2\.6\.0, 2019\-11\-06 |
| Home page | <https://akka.io/> |
| API documentation | [API (Scaladoc)](https://doc.akka.io/api/akka/2.9.8/akka/persistence/typed/index.html) [API (Javadoc)](https://doc.akka.io/japi/akka/2.9.8/akka/persistence/typed/package-summary.html) |
| Forums | [Lightbend Discuss](https://discuss.akka.io) |
| Release notes | [akka.io blog](https://akka.io/blog/news-archive.html) |
| Issues | [Github issues](https://github.com/akka/akka/issues) |
| Sources | <https://github.com/akka/akka> |

## Introduction

This model of Akka Persistence enables a stateful actor / entity to store the full state after processing each command instead of using event sourcing. This reduces the conceptual complexity and can be a handy tool for simple use cases. Very much like a CRUD based operation, the API is conceptually simple \- a function from current state and incoming command to the next state which replaces the current state in the database. 

```
(State, Command) => State

```

The current state is always stored in the database. Since only the latest state is stored, we don’t have access to any of the history of changes, unlike event sourced storage. Akka Persistence would read that state and store it in memory. After processing of the command is finished, the new state will be stored in the database. The processing of the next command will not start until the state has been successfully stored in the database.

Akka Persistence also supports [Event Sourcing](../persistence.html) based implementation, where only the *events* that are persisted by the actor are stored, but not the actual state of the actor. By storing all events, using this model, a stateful actor can be recovered by replaying the stored events to the actor, which allows it to rebuild its state.

Since each entity lives on one node, consistency is guaranteed and reads can be served directly from memory. For details on how this guarantee is ensured, have a look at the [Cluster Sharding and DurableStateBehavior](persistence.html#cluster-sharding-and-durablestatebehavior) section below.

## Example and core API

Let’s start with a simple example that models a counter using an Akka persistent actor. The minimum required for a [`DurableStateBehavior`](https://doc.akka.io/japi/akka-core/2.9/akka/persistence/typed/state/javadsl/DurableStateBehavior.html "akka.persistence.typed.state.javadsl.DurableStateBehavior")[`DurableStateBehavior`](https://doc.akka.io/api/akka-core/2.9/akka/persistence/typed/state/scaladsl/DurableStateBehavior.html "akka.persistence.typed.state.scaladsl.DurableStateBehavior") is:

Scala

```
[source](https://github.com/akka/akka/tree/v2.9.8/akka-persistence-typed/src/test/scala/docs/akka/persistence/typed/DurableStatePersistentBehaviorCompileOnly.scala#L15-L75 "Go to snippet source")import akka.persistence.typed.state.scaladsl.DurableStateBehavior
import akka.persistence.typed.PersistenceId

object MyPersistentCounter {
  sealed trait Command[ReplyMessage] extends CborSerializable

  final case class State(value: Int) extends CborSerializable

  def counter(persistenceId: PersistenceId): DurableStateBehavior[Command[_], State] = {
    DurableStateBehavior.apply[Command[_], State](
      persistenceId,
      emptyState = State(0),
      commandHandler =
        (state, command) => throw new NotImplementedError("TODO: process the command & return an Effect"))
  }
}
```

Java

```
[source](https://github.com/akka/akka/tree/v2.9.8/akka-persistence-typed/src/test/java/jdocs/akka/persistence/typed/DurableStatePersistentBehaviorTest.java#L38-L74 "Go to snippet source")public class MyPersistentCounter
    extends DurableStateBehavior<MyPersistentCounter.Command<?>, MyPersistentCounter.State> {

  interface Command<ReplyMessage> {}

  public static class State {
    private final int value;

    public State(int value) {
      this.value = value;
    }

    public int get() {
      return value;
    }
  }

  public static Behavior<Command<?>> create(PersistenceId persistenceId) {
    return new MyPersistentCounter(persistenceId);
  }

  private MyPersistentCounter(PersistenceId persistenceId) {
    super(persistenceId);
  }

  @Override
  public State emptyState() {
    return new State(0);
  }

  @Override
  public CommandHandler<Command<?>, State> commandHandler() {
    return (state, command) -> {
      throw new RuntimeException("TODO: process the command & return an Effect");
    };
  }
}
```

The first important thing to notice is the `Behavior` of a persistent actor is typed to the type of the `Command` because this is the type of message a persistent actor should receive. In Akka this is now enforced by the type system.

The components that make up a `DurableStateBehavior` are:

- `persistenceId` is the stable unique identifier for the persistent actor.
- `emptyState` defines the `State` when the entity is first created e.g. a Counter would start with 0 as state.
- `commandHandler` defines how to handle commands and map to appropriate effects e.g. persisting state and replying to actors.

Next we’ll discuss each of these in detail.

### PersistenceId

The [`PersistenceId`](https://doc.akka.io/api/akka-core/2.9/akka/persistence/typed/PersistenceId.html "akka.persistence.typed.PersistenceId")[`PersistenceId`](https://doc.akka.io/japi/akka-core/2.9/akka/persistence/typed/PersistenceId.html "akka.persistence.typed.PersistenceId") is the stable unique identifier for the persistent actor in the backend durabe state store.

[Cluster Sharding](../cluster-sharding.html) is typically used together with `DurableStateBehavior` to ensure that there is only one active entity for each `PersistenceId` (`entityId`). There are techniques to ensure this uniqueness, an example of which can be found in the [Persistence example in the Cluster Sharding documentation](../cluster-sharding.html#persistence-example). This illustrates how to construct the `PersistenceId` from the `entityTypeKey` and `entityId` provided by the `EntityContext`.

The `entityId` in Cluster Sharding is the business domain identifier which uniquely identifies the instance of that specific `EntityType`. This means that across the cluster we have a unique combination of (`EntityType`, `EntityId`). Hence the `entityId` might not be unique enough to be used as the `PersistenceId` by itself. For example two different types of entities may have the same `entityId`. To create a unique `PersistenceId` the `entityId` should be prefixed with a stable name of the entity type, which typically is the same as the `EntityTypeKey.name` that is used in Cluster Sharding. There are `PersistenceId.apply``PersistenceId.of` factory methods to help with constructing such `PersistenceId` from an `entityTypeHint` and `entityId`.

The default separator when concatenating the `entityTypeHint` and `entityId` is `|`, but a custom separator is supported.

A custom identifier can be created with `PersistenceId.ofUniqueId`. 

### Command handler

The command handler is a function with 2 parameters, the current `State` and the incoming `Command`.

A command handler returns an `Effect` directive that defines what state, if any, to persist. Effects are created using a factory that is returned via the `Effect()` method the `Effect` factory.

The two most commonly used effects are: 

- `persist` will persist the latest value of the state. No history of state changes will be stored
- `none` no state to be persisted, for example a read\-only command

The state is typically defined as an immutable class and a new instance of the state is passed to the `persist` effect. You may choose to use a mutable class for the state, and then the command handler may update the state instance, but it must still pass the updated state to the `persist` effect.

More effects are explained in [Effects and Side Effects](persistence.html#effects-and-side-effects).

In addition to returning the primary `Effect` for the command, `DurableStateBehavior`s can also chain side effects that are to be performed after successful persist which is achieved with the `thenRun` function e.g. `Effect.persist(..).thenRun``Effect().persist(..).thenRun`.

### Completing the example

Let’s fill in the details of the example.

Commands:

Scala

```
[source](https://github.com/akka/akka/tree/v2.9.8/akka-persistence-typed/src/test/scala/docs/akka/persistence/typed/DurableStatePersistentBehaviorCompileOnly.scala#L29-L33 "Go to snippet source")sealed trait Command[ReplyMessage] extends CborSerializable
final case object Increment extends Command[Nothing]
final case class IncrementBy(value: Int) extends Command[Nothing]
final case class GetValue(replyTo: ActorRef[State]) extends Command[State]
final case object Delete extends Command[Nothing]
```

Java

```
[source](https://github.com/akka/akka/tree/v2.9.8/akka-persistence-typed/src/test/java/jdocs/akka/persistence/typed/DurableStatePersistentBehaviorTest.java#L86-L110 "Go to snippet source")interface Command<ReplyMessage> {}

public enum Increment implements Command<Void> {
  INSTANCE
}

public static class IncrementBy implements Command<Void> {
  public final int value;

  public IncrementBy(int value) {
    this.value = value;
  }
}

public static class GetValue implements Command<State> {
  private final ActorRef<Integer> replyTo;

  public GetValue(ActorRef<Integer> replyTo) {
    this.replyTo = replyTo;
  }
}

public enum Delete implements Command<Void> {
  INSTANCE
}
```

State is a storage for the latest value of the counter.

Scala

```
[source](https://github.com/akka/akka/tree/v2.9.8/akka-persistence-typed/src/test/scala/docs/akka/persistence/typed/DurableStatePersistentBehaviorCompileOnly.scala#L37 "Go to snippet source")final case class State(value: Int) extends CborSerializable
```

Java

```
[source](https://github.com/akka/akka/tree/v2.9.8/akka-persistence-typed/src/test/java/jdocs/akka/persistence/typed/DurableStatePersistentBehaviorTest.java#L114-L124 "Go to snippet source")public static class State {
  private final int value;

  public State(int value) {
    this.value = value;
  }

  public int get() {
    return value;
  }
}
```

The command handler handles the commands `Increment`, `IncrementBy` and `GetValue`. 

- `Increment` increments the counter by `1` and persists the updated value as an effect in the State
- `IncrementBy` increments the counter by the value passed to it and persists the updated value as an effect in the State
- `GetValue` retrieves the value of the counter from the State and replies with it to the actor passed in

Scala

```
[source](https://github.com/akka/akka/tree/v2.9.8/akka-persistence-typed/src/test/scala/docs/akka/persistence/typed/DurableStatePersistentBehaviorCompileOnly.scala#L41-L49 "Go to snippet source")import akka.persistence.typed.state.scaladsl.Effect

val commandHandler: (State, Command[_]) => Effect[State] = (state, command) =>
  command match {
    case Increment         => Effect.persist(state.copy(value = state.value + 1))
    case IncrementBy(by)   => Effect.persist(state.copy(value = state.value + by))
    case GetValue(replyTo) => Effect.reply(replyTo)(state)
    case Delete            => Effect.delete[State]()
  }
```

Java

```
[source](https://github.com/akka/akka/tree/v2.9.8/akka-persistence-typed/src/test/java/jdocs/akka/persistence/typed/DurableStatePersistentBehaviorTest.java#L144-L158 "Go to snippet source")@Override
public CommandHandler<Command<?>, State> commandHandler() {
  return newCommandHandlerBuilder()
      .forAnyState()
      .onCommand(
          Increment.class, (state, command) -> Effect().persist(new State(state.get() + 1)))
      .onCommand(
          IncrementBy.class,
          (state, command) -> Effect().persist(new State(state.get() + command.value)))
      .onCommand(
          GetValue.class, (state, command) -> Effect().reply(command.replyTo, state.get()))
      .onCommand(
          Delete.class, (state, command) -> Effect().delete())
      .build();
}
```

These are used to create a `DurableStateBehavior`: These are defined in an `DurableStateBehavior`:

Scala

```
[source](https://github.com/akka/akka/tree/v2.9.8/akka-persistence-typed/src/test/scala/docs/akka/persistence/typed/DurableStatePersistentBehaviorCompileOnly.scala#L15-L58 "Go to snippet source")import akka.persistence.typed.state.scaladsl.DurableStateBehavior
import akka.persistence.typed.PersistenceId

def counter(id: String): DurableStateBehavior[Command[_], State] = {
  DurableStateBehavior.apply[Command[_], State](
    persistenceId = PersistenceId.ofUniqueId(id),
    emptyState = State(0),
    commandHandler = commandHandler)
}
```

Java

```
[source](https://github.com/akka/akka/tree/v2.9.8/akka-persistence-typed/src/test/java/jdocs/akka/persistence/typed/DurableStatePersistentBehaviorTest.java#L14-L160 "Go to snippet source")import akka.persistence.typed.state.javadsl.DurableStateBehavior;
import akka.persistence.typed.PersistenceId;

public class MyPersistentCounter
    extends DurableStateBehavior<MyPersistentCounter.Command<?>, MyPersistentCounter.State> {

  // commands, events and state defined here

  public static Behavior<Command<?>> create(PersistenceId persistenceId) {
    return new MyPersistentCounter(persistenceId);
  }

  private MyPersistentCounter(PersistenceId persistenceId) {
    super(persistenceId);
  }

  @Override
  public State emptyState() {
    return new State(0);
  }

  @Override
  public CommandHandler<Command<?>, State> commandHandler() {
    return newCommandHandlerBuilder()
        .forAnyState()
        .onCommand(
            Increment.class, (state, command) -> Effect().persist(new State(state.get() + 1)))
        .onCommand(
            IncrementBy.class,
            (state, command) -> Effect().persist(new State(state.get() + command.value)))
        .onCommand(
            GetValue.class, (state, command) -> Effect().reply(command.replyTo, state.get()))
        .onCommand(
            Delete.class, (state, command) -> Effect().delete())
        .build();
  }
}
```

## Effects and Side Effects

A command handler returns an `Effect` directive that defines what state, if any, to persist. Effects are created using a factory that is returned via the `Effect()` method the `Effect` factory and can be one of: 

- `persist` will persist the latest state. If it’s a new persistence id, the record will be inserted. In case of an existing persistence id, the record will be updated only if the revision number of the incoming record is 1 more than the already existing record. Otherwise `persist` will fail.
- `delete` will delete the state by setting it to the empty state and the revision number will be incremented by 1\.
- `none` no state to be persisted, for example a read\-only command
- `unhandled` the command is unhandled (not supported) in current state
- `stop` stop this actor
- `stash` the current command is stashed
- `unstashAll` process the commands that were stashed with `Effect.stash``Effect().stash`
- `reply` send a reply message to the given `ActorRef`

Note that only one of those can be chosen per incoming command. It is not possible to both persist and say none/unhandled.

In addition to returning the primary `Effect` for the command `DurableStateBehavior`s can also chain side effects that are to be performed after successful persist which is achieved with the `thenRun` function that runs the callback passed to it e.g. `Effect.persist(..).thenRun``Effect().persist(..).thenRun`. 

All `thenRun` registered callbacks are executed sequentially after successful execution of the persist statement (or immediately, in case of `none` and `unhandled`).

In addition to `thenRun` the following actions can also be performed after successful persist:

- `thenStop` the actor will be stopped
- `thenUnstashAll` process the commands that were stashed with `Effect.stash``Effect().stash`
- `thenReply` send a reply message to the given `ActorRef`

In the example below, we use a different constructor of `DurableStateBehavior.withEnforcedReplies`, which creates a `Behavior` for a persistent actor that ensures that every command sends a reply back. Hence it will be a compilation error if the returned effect from a `CommandHandler` isn’t a `ReplyEffect`.

Instead of `Increment` we will have a new command `IncrementWithConfirmation` that, along with persistence will also send an acknowledgement as a reply to the `ActorRef` passed in the command. 

Example of effects and side\-effects:

Scala

```
[source](https://github.com/akka/akka/tree/v2.9.8/akka-persistence-typed/src/test/scala/docs/akka/persistence/typed/DurableStatePersistentBehaviorCompileOnly.scala#L83-L102 "Go to snippet source")sealed trait Command[ReplyMessage] extends CborSerializable
final case class IncrementWithConfirmation(replyTo: ActorRef[Done]) extends Command[Done]
final case class GetValue(replyTo: ActorRef[State]) extends Command[State]

final case class State(value: Int) extends CborSerializable

def counter(persistenceId: PersistenceId): DurableStateBehavior[Command[_], State] = {
  DurableStateBehavior.withEnforcedReplies[Command[_], State](
    persistenceId,
    emptyState = State(0),
    commandHandler = (state, command) =>
      command match {

        case IncrementWithConfirmation(replyTo) =>
          Effect.persist(state.copy(value = state.value + 1)).thenReply(replyTo)(_ => Done)

        case GetValue(replyTo) =>
          Effect.reply(replyTo)(state)
      })
}
```

Java

```
[source](https://github.com/akka/akka/tree/v2.9.8/akka-persistence-typed/src/test/java/jdocs/akka/persistence/typed/DurableStatePersistentBehaviorTest.java#L25-L227 "Go to snippet source")import akka.Done;
interface Command<ReplyMessage> {}

public static class IncrementWithConfirmation implements Command<Void> {
  public final ActorRef<Done> replyTo;

  public IncrementWithConfirmation(ActorRef<Done> replyTo) {
    this.replyTo = replyTo;
  }
}

public static class GetValue implements Command<State> {
  private final ActorRef<Integer> replyTo;

  public GetValue(ActorRef<Integer> replyTo) {
    this.replyTo = replyTo;
  }
}

public static class State {
  private final int value;

  public State(int value) {
    this.value = value;
  }

  public int get() {
    return value;
  }
}

public static Behavior<Command<?>> create(PersistenceId persistenceId) {
  return new MyPersistentCounterWithReplies(persistenceId);
}

private MyPersistentCounterWithReplies(PersistenceId persistenceId) {
  super(persistenceId);
}

@Override
public State emptyState() {
  return new State(0);
}

@Override
public CommandHandler<Command<?>, State> commandHandler() {
  return newCommandHandlerBuilder()
      .forAnyState()
      .onCommand(
          IncrementWithConfirmation.class,
          (state, command) ->
              Effect()
                  .persist(new State(state.get() + 1))
                  .thenReply(command.replyTo, (st) -> Done.getInstance()))
      .onCommand(
          GetValue.class, (state, command) -> Effect().reply(command.replyTo, state.get()))
      .build();
}
```

The most common way to have a side\-effect is to use the `thenRun` method on `Effect`. In case you have multiple side\-effects that needs to be run for several commands, you can factor them out into functions and reuse for all the commands. For example:

Scala

```
[source](https://github.com/akka/akka/tree/v2.9.8/akka-persistence-typed/src/test/scala/akka/persistence/typed/scaladsl/PersistentActorCompileOnlyTest.scala#L242-L247 "Go to snippet source")// Example factoring out a chained effect to use in several places with `thenRun`
val commonChainedEffects: Mood => Unit = _ => println("Command processed")
// Then in a command handler:
Effect
  .persist(Remembered("Yep")) // persist event
  .thenRun(commonChainedEffects) // add on common chained effect
```

Java

```
[source](https://github.com/akka/akka/tree/v2.9.8/akka-persistence-typed/src/test/java/akka/persistence/typed/javadsl/PersistentActorCompileOnlyTest.java#L207-L234 "Go to snippet source")// Example factoring out a chained effect to use in several places with `thenRun`
static final Procedure<ExampleState> commonChainedEffect =
    state -> System.out.println("Command handled!");

      @Override
      public CommandHandler<MyCommand, MyEvent, ExampleState> commandHandler() {
        return newCommandHandlerBuilder()
            .forStateType(ExampleState.class)
            .onCommand(
                Cmd.class,
                (state, cmd) ->
                    Effect()
                        .persist(new Evt(cmd.data))
                        .thenRun(() -> cmd.replyTo.tell(new Ack()))
                        .thenRun(commonChainedEffect))
            .build();
      }
```

### Side effects ordering and guarantees

Any side effects are executed on an at\-most\-once basis and will not be executed if the persist fails.

Side effects are not run when the actor is restarted or started again after being stopped.

The side effects are executed sequentially, it is not possible to execute side effects in parallel, unless they call out to something that is running concurrently (for example sending a message to another actor).

It’s possible to execute a side effect before persisting the state, but that can result in that the side effect is performed but that the state is not stored if the persist fails.

## Cluster Sharding and DurableStateBehavior

[Cluster Sharding](../cluster-sharding.html) is an excellent fit to spread persistent actors over a cluster, addressing them by id. It makes it possible to have more persistent actors exist in the cluster than what would fit in the memory of one node. Cluster sharding improves the resilience of the cluster. If a node crashes, the persistent actors are quickly started on a new node and can resume operations.

The `DurableStateBehavior` can then be run as any plain actor as described in [actors documentation](../actors.html), but since Akka Persistence is based on the single\-writer principle, the persistent actors are typically used together with Cluster Sharding. For a particular `persistenceId` only one persistent actor instance should be active at one time. Cluster Sharding ensures that there is only one active entity (or actor instance) for each id. 

## Accessing the ActorContext

If the [`DurableStateBehavior`](https://doc.akka.io/japi/akka-core/2.9/akka/persistence/typed/state/javadsl/DurableStateBehavior.html "akka.persistence.typed.state.javadsl.DurableStateBehavior")[`DurableStateBehavior`](https://doc.akka.io/api/akka-core/2.9/akka/persistence/typed/state/scaladsl/DurableStateBehavior.html "akka.persistence.typed.state.scaladsl.DurableStateBehavior") needs to use the [`ActorContext`](https://doc.akka.io/japi/akka-core/2.9/akka/actor/typed/javadsl/ActorContext.html "akka.actor.typed.javadsl.ActorContext")[`ActorContext`](https://doc.akka.io/api/akka-core/2.9/akka/actor/typed/scaladsl/ActorContext.html "akka.actor.typed.scaladsl.ActorContext"), for example to spawn child actors, it can be obtained by wrapping construction with `Behaviors.setup`:

Scala

```
[source](https://github.com/akka/akka/tree/v2.9.8/akka-persistence-typed/src/test/scala/docs/akka/persistence/typed/DurableStatePersistentBehaviorCompileOnly.scala#L108-L120 "Go to snippet source")import akka.persistence.typed.state.scaladsl.Effect
import akka.persistence.typed.state.scaladsl.DurableStateBehavior.CommandHandler

def apply(): Behavior[String] =
  Behaviors.setup { context =>
    DurableStateBehavior[String, State](
      persistenceId = PersistenceId.ofUniqueId("myPersistenceId"),
      emptyState = State(0),
      commandHandler = CommandHandler.command { cmd =>
        context.log.info("Got command {}", cmd)
        Effect.none
      })
  }
```

Java

```
[source](https://github.com/akka/akka/tree/v2.9.8/akka-persistence-typed/src/test/java/jdocs/akka/persistence/typed/DurableStatePersistentBehaviorTest.java#L235-L271 "Go to snippet source")public class MyPersistentBehavior
    extends DurableStateBehavior<MyPersistentBehavior.Command, MyPersistentBehavior.State> {

  public static Behavior<Command> create(PersistenceId persistenceId) {
    return Behaviors.setup(ctx -> new MyPersistentBehavior(persistenceId, ctx));
  }

  // this makes the context available to the command handler etc.
  private final ActorContext<Command> context;

  // optionally if you only need `ActorContext.getSelf()`
  private final ActorRef<Command> self;

  public MyPersistentBehavior(PersistenceId persistenceId, ActorContext<Command> ctx) {
    super(persistenceId);
    this.context = ctx;
    this.self = ctx.getSelf();
  }

}
```

## Changing Behavior

After processing a message, actors are able to return the `Behavior` that is used for the next message.

As you can see in the above examples this is not supported by persistent actors. Instead, the state is persisted as an `Effect` by the `commandHandler`. 

The reason a new behavior can’t be returned is that behavior is part of the actor’s state and must also carefully be reconstructed during recovery from the persisted state. This would imply that the state needs to be encoded such that the behavior can also be restored from it. That would be very prone to mistakes which is why it is not allowed in Akka Persistence.

For basic actors you can use the same set of command handlers independent of what state the entity is in. For more complex actors it’s useful to be able to change the behavior in the sense that different functions for processing commands may be defined depending on what state the actor is in. This is useful when implementing finite state machine (FSM) like entities.

The next example demonstrates how to define different behavior based on the current `State`. It shows an actor that represents the state of a blog post. Before a post is started the only command it can process is to `AddPost`. Once it is started then one can look it up with `GetPost`, modify it with `ChangeBody` or publish it with `Publish`.

The state is captured by:

Scala

```
[source](https://github.com/akka/akka/tree/v2.9.8/akka-persistence-typed/src/test/scala/docs/akka/persistence/typed/BlogPostEntityDurableState.scala#L23-L36 "Go to snippet source")sealed trait State

case object BlankState extends State

final case class DraftState(content: PostContent) extends State {
  def withBody(newBody: String): DraftState =
    copy(content = content.copy(body = newBody))

  def postId: String = content.postId
}

final case class PublishedState(content: PostContent) extends State {
  def postId: String = content.postId
}
```

Java

```
[source](https://github.com/akka/akka/tree/v2.9.8/akka-persistence-typed/src/test/java/jdocs/akka/persistence/typed/BlogPostEntityDurableState.java#L23-L67 "Go to snippet source")interface State {}

enum BlankState implements State {
  INSTANCE
}

static class DraftState implements State {
  final PostContent content;

  DraftState(PostContent content) {
    this.content = content;
  }

  DraftState withContent(PostContent newContent) {
    return new DraftState(newContent);
  }

  DraftState withBody(String newBody) {
    return withContent(new PostContent(postId(), content.title, newBody));
  }

  String postId() {
    return content.postId;
  }
}

static class PublishedState implements State {
  final PostContent content;

  PublishedState(PostContent content) {
    this.content = content;
  }

  PublishedState withContent(PostContent newContent) {
    return new PublishedState(newContent);
  }

  PublishedState withBody(String newBody) {
    return withContent(new PostContent(postId(), content.title, newBody));
  }

  String postId() {
    return content.postId;
  }
}
```

The commands, of which only a subset are valid depending on the state:

Scala

```
[source](https://github.com/akka/akka/tree/v2.9.8/akka-persistence-typed/src/test/scala/docs/akka/persistence/typed/BlogPostEntityDurableState.scala#L40-L48 "Go to snippet source")sealed trait Command
final case class AddPost(content: PostContent, replyTo: ActorRef[StatusReply[AddPostDone]]) extends Command
final case class AddPostDone(postId: String)
final case class GetPost(replyTo: ActorRef[PostContent]) extends Command
final case class ChangeBody(newBody: String, replyTo: ActorRef[Done]) extends Command
final case class Publish(replyTo: ActorRef[Done]) extends Command
final case class PostContent(postId: String, title: String, body: String)
```

Java

```
[source](https://github.com/akka/akka/tree/v2.9.8/akka-persistence-typed/src/test/java/jdocs/akka/persistence/typed/BlogPostEntityDurableState.java#L71-L127 "Go to snippet source")public interface Command {}
public static class AddPost implements Command {
  final PostContent content;
  final ActorRef<AddPostDone> replyTo;

  public AddPost(PostContent content, ActorRef<AddPostDone> replyTo) {
    this.content = content;
    this.replyTo = replyTo;
  }
}

public static class AddPostDone implements Command {
  final String postId;

  public AddPostDone(String postId) {
    this.postId = postId;
  }
}
public static class GetPost implements Command {
  final ActorRef<PostContent> replyTo;

  public GetPost(ActorRef<PostContent> replyTo) {
    this.replyTo = replyTo;
  }
}

public static class ChangeBody implements Command {
  final String newBody;
  final ActorRef<Done> replyTo;

  public ChangeBody(String newBody, ActorRef<Done> replyTo) {
    this.newBody = newBody;
    this.replyTo = replyTo;
  }
}

public static class Publish implements Command {
  final ActorRef<Done> replyTo;

  public Publish(ActorRef<Done> replyTo) {
    this.replyTo = replyTo;
  }
}

public static class PostContent implements Command {
  final String postId;
  final String title;
  final String body;

  public PostContent(String postId, String title, String body) {
    this.postId = postId;
    this.title = title;
    this.body = body;
  }
}
```

The command handler to process each command is decided by the state class (or state predicate) that is given to the `forStateType` of the `CommandHandlerBuilder` and the match cases in the builders. The command handler to process each command is decided by first looking at the state and then the command. It typically becomes two levels of pattern matching, first on the state and then on the command. Delegating to methods like `addPost`, `changeBody`, `publish` etc. is a good practice because the one\-line cases give a nice overview of the message dispatch.

Scala

```
[source](https://github.com/akka/akka/tree/v2.9.8/akka-persistence-typed/src/test/scala/docs/akka/persistence/typed/BlogPostEntityDurableState.scala#L61-L119 "Go to snippet source")private val commandHandler: (State, Command) => Effect[State] = { (state, command) =>
  state match {

    case BlankState =>
      command match {
        case cmd: AddPost => addPost(cmd)
        case _            => Effect.unhandled
      }

    case draftState: DraftState =>
      command match {
        case cmd: ChangeBody  => changeBody(draftState, cmd)
        case Publish(replyTo) => publish(draftState, replyTo)
        case GetPost(replyTo) => getPost(draftState, replyTo)
        case AddPost(_, replyTo) =>
          Effect.unhandled[State].thenRun(_ => replyTo ! StatusReply.Error("Cannot add post while in draft state"))
      }

    case publishedState: PublishedState =>
      command match {
        case GetPost(replyTo) => getPost(publishedState, replyTo)
        case AddPost(_, replyTo) =>
          Effect.unhandled[State].thenRun(_ => replyTo ! StatusReply.Error("Cannot add post, already published"))
        case _ => Effect.unhandled
      }
  }
}

private def addPost(cmd: AddPost): Effect[State] = {
  Effect.persist(DraftState(cmd.content)).thenRun { _ =>
    // After persist is done additional side effects can be performed
    cmd.replyTo ! StatusReply.Success(AddPostDone(cmd.content.postId))
  }
}

private def changeBody(state: DraftState, cmd: ChangeBody): Effect[State] = {
  Effect.persist(state.withBody(cmd.newBody)).thenRun { _ =>
    cmd.replyTo ! Done
  }
}

private def publish(state: DraftState, replyTo: ActorRef[Done]): Effect[State] = {
  Effect.persist(PublishedState(state.content)).thenRun { _ =>
    println(s"Blog post ${state.postId} was published")
    replyTo ! Done
  }
}

private def getPost(state: DraftState, replyTo: ActorRef[PostContent]): Effect[State] = {
  replyTo ! state.content
  Effect.none
}

private def getPost(state: PublishedState, replyTo: ActorRef[PostContent]): Effect[State] = {
  replyTo ! state.content
  Effect.none
}
```

Java

```
[source](https://github.com/akka/akka/tree/v2.9.8/akka-persistence-typed/src/test/java/jdocs/akka/persistence/typed/BlogPostEntityDurableState.java#L151-L211 "Go to snippet source")@Override
public CommandHandler<Command, State> commandHandler() {
  CommandHandlerBuilder<Command, State> builder = newCommandHandlerBuilder();

  builder.forStateType(BlankState.class).onCommand(AddPost.class, this::onAddPost);

  builder
      .forStateType(DraftState.class)
      .onCommand(ChangeBody.class, this::onChangeBody)
      .onCommand(Publish.class, this::onPublish)
      .onCommand(GetPost.class, this::onGetPost);

  builder
      .forStateType(PublishedState.class)
      .onCommand(ChangeBody.class, this::onChangeBody)
      .onCommand(GetPost.class, this::onGetPost);

  builder.forAnyState().onCommand(AddPost.class, (state, cmd) -> Effect().unhandled());

  return builder.build();
}

private Effect<State> onAddPost(AddPost cmd) {
  return Effect()
      .persist(new DraftState(cmd.content))
      .thenRun(() -> cmd.replyTo.tell(new AddPostDone(cmd.content.postId)));
}

private Effect<State> onChangeBody(DraftState state, ChangeBody cmd) {
  return Effect()
      .persist(state.withBody(cmd.newBody))
      .thenRun(() -> cmd.replyTo.tell(Done.getInstance()));
}

private Effect<State> onChangeBody(PublishedState state, ChangeBody cmd) {
  return Effect()
      .persist(state.withBody(cmd.newBody))
      .thenRun(() -> cmd.replyTo.tell(Done.getInstance()));
}

private Effect<State> onPublish(DraftState state, Publish cmd) {
  return Effect()
      .persist(new PublishedState(state.content))
      .thenRun(
          () -> {
            System.out.println("Blog post published: " + state.postId());
            cmd.replyTo.tell(Done.getInstance());
          });
}

private Effect<State> onGetPost(DraftState state, GetPost cmd) {
  cmd.replyTo.tell(state.content);
  return Effect().none();
}

private Effect<State> onGetPost(PublishedState state, GetPost cmd) {
  cmd.replyTo.tell(state.content);
  return Effect().none();
}
```

And finally the behavior is created from the `DurableStateBehavior.apply`:

Scala

```
[source](https://github.com/akka/akka/tree/v2.9.8/akka-persistence-typed/src/test/scala/docs/akka/persistence/typed/BlogPostEntityDurableState.scala#L17-L124 "Go to snippet source")object BlogPostEntityDurableState {
  // commands, state defined here

  def apply(entityId: String, persistenceId: PersistenceId): Behavior[Command] = {
    Behaviors.setup { context =>
      context.log.info("Starting BlogPostEntityDurableState {}", entityId)
      DurableStateBehavior[Command, State](persistenceId, emptyState = BlankState, commandHandler)
    }
  }

  // commandHandler defined here
}
```

Java

```
[source](https://github.com/akka/akka/tree/v2.9.8/akka-persistence-typed/src/test/java/jdocs/akka/persistence/typed/BlogPostEntityDurableState.java#L15-L216 "Go to snippet source")public class BlogPostEntityDurableState
    extends DurableStateBehavior<
        BlogPostEntityDurableState.Command, BlogPostEntityDurableState.State> {
  // commands and state as in above snippets

  public static Behavior<Command> create(String entityId, PersistenceId persistenceId) {
    return Behaviors.setup(
        context -> {
          context.getLog().info("Starting BlogPostEntityDurableState {}", entityId);
          return new BlogPostEntityDurableState(persistenceId);
        });
  }

  private BlogPostEntityDurableState(PersistenceId persistenceId) {
    super(persistenceId);
  }

  @Override
  public State emptyState() {
    return BlankState.INSTANCE;
  }

  // commandHandler, eventHandler as in above snippets
}
```

This can be refactored one or two steps further by defining the command handlers in the state class as illustrated in [command handlers in the state](persistence-style.html#command-handlers-in-the-state).

There is also an example illustrating an [optional initial state](persistence-style.html#optional-initial-state).

## Replies

The [Request\-Response interaction pattern](../interaction-patterns.html#request-response) is very common for persistent actors, because you typically want to know if the command was rejected due to validation errors and when accepted you want a confirmation when the events have been successfully stored.

Therefore you typically include a `ActorRef[ReplyMessageType]``ActorRef<ReplyMessageType>`. If the command can either have a successful response or a validation error returned, the generic response type `StatusReply[ReplyType]]` `StatusReply<ReplyType>` can be used. If the successful reply does not contain a value but is more of an acknowledgement a pre defined `StatusReply.Ack``StatusReply.ack()` of type `StatusReply[Done]``StatusReply<Done>` can be used.

After validation errors or after persisting events, using a `thenRun` side effect, the reply message can be sent to the `ActorRef`.

Scala

```
[source](https://github.com/akka/akka/tree/v2.9.8/akka-persistence-typed/src/test/scala/docs/akka/persistence/typed/BlogPostEntityDurableState.scala#L42-L43 "Go to snippet source")final case class AddPost(content: PostContent, replyTo: ActorRef[StatusReply[AddPostDone]]) extends Command
final case class AddPostDone(postId: String)
```

Java

```
[source](https://github.com/akka/akka/tree/v2.9.8/akka-persistence-typed/src/test/java/jdocs/akka/persistence/typed/BlogPostEntityDurableState.java#L73-L89 "Go to snippet source")public static class AddPost implements Command {
  final PostContent content;
  final ActorRef<AddPostDone> replyTo;

  public AddPost(PostContent content, ActorRef<AddPostDone> replyTo) {
    this.content = content;
    this.replyTo = replyTo;
  }
}

public static class AddPostDone implements Command {
  final String postId;

  public AddPostDone(String postId) {
    this.postId = postId;
  }
}
```

Scala

```
[source](https://github.com/akka/akka/tree/v2.9.8/akka-persistence-typed/src/test/scala/docs/akka/persistence/typed/BlogPostEntityDurableState.scala#L91-L94 "Go to snippet source")Effect.persist(DraftState(cmd.content)).thenRun { _ =>
  // After persist is done additional side effects can be performed
  cmd.replyTo ! StatusReply.Success(AddPostDone(cmd.content.postId))
}
```

Java

```
[source](https://github.com/akka/akka/tree/v2.9.8/akka-persistence-typed/src/test/java/jdocs/akka/persistence/typed/BlogPostEntityDurableState.java#L175-L177 "Go to snippet source")return Effect()
    .persist(new DraftState(cmd.content))
    .thenRun(() -> cmd.replyTo.tell(new AddPostDone(cmd.content.postId)));
```

Since this is such a common pattern there is a reply effect for this purpose. It has the nice property that it can be used to enforce that you do not forget to specify replies when implementing the `DurableStateBehavior`. If it’s defined with `DurableStateBehavior.withEnforcedReplies``DurableStateBehaviorWithEnforcedReplies` there will be compilation errors if the returned effect isn’t a `ReplyEffect`, which can be created with `Effect.reply``Effect().reply`, `Effect.noReply``Effect().noReply`, `Effect.thenReply``Effect().thenReply`, or `Effect.thenNoReply``Effect().thenNoReply`.

Scala

```
[source](https://github.com/akka/akka/tree/v2.9.8/akka-cluster-sharding-typed/src/test/scala/docs/akka/cluster/sharding/typed/AccountExampleWithCommandHandlersInDurableState.scala#L127-L130 "Go to snippet source")def apply(persistenceId: PersistenceId): Behavior[Command] = {
  DurableStateBehavior
    .withEnforcedReplies[Command, Account](persistenceId, EmptyAccount, (state, cmd) => state.applyCommand(cmd))
}
```

Java

```
[source](https://github.com/akka/akka/tree/v2.9.8/akka-cluster-sharding-typed/src/test/java/jdocs/akka/cluster/sharding/typed/AccountExampleWithNullDurableState.java#L30-L32 "Go to snippet source")public class AccountEntity
    extends DurableStateBehaviorWithEnforcedReplies<
        AccountEntity.Command, AccountEntity.Account> {
```

The commands must have a field of `ActorRef[ReplyMessageType]``ActorRef<ReplyMessageType>` that can then be used to send a reply.

Scala

```
[source](https://github.com/akka/akka/tree/v2.9.8/akka-cluster-sharding-typed/src/test/scala/docs/akka/cluster/sharding/typed/AccountExampleWithCommandHandlersInDurableState.scala#L29-L34 "Go to snippet source")sealed trait Command extends CborSerializable
final case class Withdraw(amount: BigDecimal, replyTo: ActorRef[StatusReply[Done]]) extends Command
```

Java

```
[source](https://github.com/akka/akka/tree/v2.9.8/akka-cluster-sharding-typed/src/test/java/jdocs/akka/cluster/sharding/typed/AccountExampleWithNullDurableState.java#L40 "Go to snippet source")interface Command extends CborSerializable {}
```

The `ReplyEffect` is created with `Effect.reply``Effect().reply`, `Effect.noReply``Effect().noReply`, `Effect.thenReply``Effect().thenReply`, or `Effect.thenNoReply``Effect().thenNoReply`.

Note that command handlers are defined with `newCommandHandlerWithReplyBuilder` when using `EventSourcedBehaviorWithEnforcedReplies`, as opposed to newCommandHandlerBuilder when using `EventSourcedBehavior`.

Scala

```
[source](https://github.com/akka/akka/tree/v2.9.8/akka-cluster-sharding-typed/src/test/scala/docs/akka/cluster/sharding/typed/AccountExampleWithCommandHandlersInDurableState.scala#L89-L99 "Go to snippet source")private def deposit(cmd: Deposit) = {
  Effect.persist(copy(balance = balance + cmd.amount)).thenReply(cmd.replyTo)(_ => StatusReply.Ack)
}

private def withdraw(cmd: Withdraw) = {
  if (canWithdraw(cmd.amount))
    Effect.persist(copy(balance = balance - cmd.amount)).thenReply(cmd.replyTo)(_ => StatusReply.Ack)
  else
    Effect.reply(cmd.replyTo)(
      StatusReply.Error(s"Insufficient balance ${balance} to be able to withdraw ${cmd.amount}"))
}
```

Java

```
[source](https://github.com/akka/akka/tree/v2.9.8/akka-cluster-sharding-typed/src/test/java/jdocs/akka/cluster/sharding/typed/AccountExampleWithNullDurableState.java#L186-L197 "Go to snippet source")private ReplyEffect<Account> withdraw(OpenedAccount account, Withdraw command) {
  if (!account.canWithdraw(command.amount)) {
    return Effect()
        .reply(
            command.replyTo,
            StatusReply.error("not enough funds to withdraw " + command.amount));
  } else {
    return Effect()
        .persist(account.makeWithdraw(command.amount))
        .thenReply(command.replyTo, account2 -> StatusReply.ack());
  }
}
```

These effects will send the reply message even when `DurableStateBehavior.withEnforcedReplies``DurableStateBehaviorWithEnforcedReplies` is not used, but then there will be no compilation errors if the reply decision is left out.

Note that the `noReply` is a way of making a conscious decision that a reply shouldn’t be sent for a specific command or that a reply will be sent later, perhaps after some asynchronous interaction with other actors or services.

## Serialization

The same [serialization](../../serialization.html) mechanism as for actor messages is also used for persistent actors.

You need to enable [serialization](../../serialization.html) for your commands (messages) and state. [Serialization with Jackson](../../serialization-jackson.html) is a good choice in many cases and our recommendation if you don’t have other preference.

## Tagging

Persistence allows you to use tags in persistence query. Tagging allows you to identify a subset of states in the durable store and separately consume them as a stream through the `DurableStateStoreQuery` interface. 

Scala

```
[source](https://github.com/akka/akka/tree/v2.9.8/akka-persistence-typed/src/test/scala/docs/akka/persistence/typed/DurableStatePersistentBehaviorCompileOnly.scala#L127-L131 "Go to snippet source")DurableStateBehavior[Command[_], State](
  persistenceId = PersistenceId.ofUniqueId("abc"),
  emptyState = State(0),
  commandHandler = (state, cmd) => throw new NotImplementedError("TODO: process the command & return an Effect"))
  .withTag("tag1")
```

Java

```
[source](https://github.com/akka/akka/tree/v2.9.8/akka-persistence-typed/src/test/java/jdocs/akka/persistence/typed/DurableStatePersistentBehaviorTest.java#L279-L318 "Go to snippet source")public class MyPersistentBehavior
    extends DurableStateBehavior<MyPersistentBehavior.Command, MyPersistentBehavior.State> {
  @Override
  public String tag() {
    return "tag1";
  }
```

## Wrapping DurableStateBehavior

When creating a `DurableStateBehavior`, it is possible to wrap `DurableStateBehavior` in other behaviors such as `Behaviors.setup` in order to access the `ActorContext` object. For instance to access the logger from within the `ActorContext` to log for debugging the `commandHandler`.

Scala

```
[source](https://github.com/akka/akka/tree/v2.9.8/akka-persistence-typed/src/test/scala/docs/akka/persistence/typed/DurableStatePersistentBehaviorCompileOnly.scala#L141-L149 "Go to snippet source")Behaviors.setup[Command[_]] { context =>
  DurableStateBehavior[Command[_], State](
    persistenceId = PersistenceId.ofUniqueId("abc"),
    emptyState = State(0),
    commandHandler = CommandHandler.command { cmd =>
      context.log.info("Got command {}", cmd)
      Effect.none
    })
}
```

Java

```
[source](https://github.com/akka/akka/tree/v2.9.8/akka-persistence-typed/src/test/java/jdocs/akka/persistence/typed/DurableStatePersistentBehaviorTest.java#L328-L365 "Go to snippet source")public class MyPersistentBehavior
    extends DurableStateBehavior<MyPersistentBehavior.Command, MyPersistentBehavior.State> {

  public static Behavior<Command> create(PersistenceId persistenceId) {
    return Behaviors.setup(context -> new MyPersistentBehavior(persistenceId, context));
  }

  private final ActorContext<Command> context;

  private MyPersistentBehavior(PersistenceId persistenceId, ActorContext<Command> context) {
    super(
        persistenceId,
        SupervisorStrategy.restartWithBackoff(
            Duration.ofSeconds(10), Duration.ofSeconds(30), 0.2));
    this.context = context;
  }

  @Override
  public CommandHandler<Command, State> commandHandler() {
    return (state, command) -> {
      context.getLog().info("In command handler");
      return Effect().none();
    };
  }
```

## Code Examples

### Example 1: Module info

```scala
resolvers += "Akka library repository".at("https://repo.akka.io/maven")
```

### Example 2: Module info

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

### Example 3: Module info

```gradle
repositories {
    mavenCentral()
    maven {
        url "https://repo.akka.io/maven"
    }
}
```

### Example 4: Module info

```scala
val AkkaVersion = "2.9.8"
libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-persistence-typed" % AkkaVersion,
  "com.typesafe.akka" %% "akka-persistence-testkit" % AkkaVersion % Test
)
```

### Example 5: Module info

```xml
<properties>
  <scala.binary.version>2.13</scala.binary.version>
</properties>
<dependencyManagement>
  <dependencies>
    <dependency>
      <groupId>com.typesafe.akka</groupId>
      <artifactId>akka-bom_${scala.binary.version}</artifactId>
      <version>2.9.8</version>
      <type>pom</type>
      <scope>import</scope>
    </dependency&gt
  </dependencies>
</dependencyManagement>
<dependencies&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-persistence-typed_${scala.binary.version}</artifactId>
  </dependency&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-persistence-testkit_${scala.binary.version}</artifactId>
    <scope>test</scope>
  </dependency&gt
</dependencies>
```

### Example 6: Module info

```gradle
def versions = [
  ScalaBinary: "2.13"
]
dependencies {
  implementation platform("com.typesafe.akka:akka-bom_${versions.ScalaBinary}:2.9.8")

  implementation "com.typesafe.akka:akka-persistence-typed_${versions.ScalaBinary}"
  testImplementation "com.typesafe.akka:akka-persistence-testkit_${versions.ScalaBinary}"
}
```

### Example 7: Introduction

```text
(State, Command) => State
```

### Example 8: Example and core API

```scala
import akka.persistence.typed.state.scaladsl.DurableStateBehavior
import akka.persistence.typed.PersistenceId

object MyPersistentCounter {
  sealed trait Command[ReplyMessage] extends CborSerializable

  final case class State(value: Int) extends CborSerializable

  def counter(persistenceId: PersistenceId): DurableStateBehavior[Command[_], State] = {
    DurableStateBehavior.apply[Command[_], State](
      persistenceId,
      emptyState = State(0),
      commandHandler =
        (state, command) => throw new NotImplementedError("TODO: process the command & return an Effect"))
  }
}
```

### Example 9: Example and core API

```java
public class MyPersistentCounter
    extends DurableStateBehavior<MyPersistentCounter.Command<?>, MyPersistentCounter.State> {

  interface Command<ReplyMessage> {}

  public static class State {
    private final int value;

    public State(int value) {
      this.value = value;
    }

    public int get() {
      return value;
    }
  }

  public static Behavior<Command<?>> create(PersistenceId persistenceId) {
    return new MyPersistentCounter(persistenceId);
  }

  private MyPersistentCounter(PersistenceId persistenceId) {
    super(persistenceId);
  }

  @Override
  public State emptyState() {
    return new State(0);
  }

  @Override
  public CommandHandler<Command<?>, State> commandHandler() {
    return (state, command) -> {
      throw new RuntimeException("TODO: process the command & return an Effect");
    };
  }
}
```

### Example 10: Completing the example

```scala
sealed trait Command[ReplyMessage] extends CborSerializable
final case object Increment extends Command[Nothing]
final case class IncrementBy(value: Int) extends Command[Nothing]
final case class GetValue(replyTo: ActorRef[State]) extends Command[State]
final case object Delete extends Command[Nothing]
```

### Example 11: Completing the example

```java
interface Command<ReplyMessage> {}

public enum Increment implements Command<Void> {
  INSTANCE
}

public static class IncrementBy implements Command<Void> {
  public final int value;

  public IncrementBy(int value) {
    this.value = value;
  }
}

public static class GetValue implements Command<State> {
  private final ActorRef<Integer> replyTo;

  public GetValue(ActorRef<Integer> replyTo) {
    this.replyTo = replyTo;
  }
}

public enum Delete implements Command<Void> {
  INSTANCE
}
```

### Example 12: Completing the example

```scala
final case class State(value: Int) extends CborSerializable
```

### Example 13: Completing the example

```java
public static class State {
  private final int value;

  public State(int value) {
    this.value = value;
  }

  public int get() {
    return value;
  }
}
```

### Example 14: Completing the example

```scala
import akka.persistence.typed.state.scaladsl.Effect

val commandHandler: (State, Command[_]) => Effect[State] = (state, command) =>
  command match {
    case Increment         => Effect.persist(state.copy(value = state.value + 1))
    case IncrementBy(by)   => Effect.persist(state.copy(value = state.value + by))
    case GetValue(replyTo) => Effect.reply(replyTo)(state)
    case Delete            => Effect.delete[State]()
  }
```

### Example 15: Completing the example

```java
@Override
public CommandHandler<Command<?>, State> commandHandler() {
  return newCommandHandlerBuilder()
      .forAnyState()
      .onCommand(
          Increment.class, (state, command) -> Effect().persist(new State(state.get() + 1)))
      .onCommand(
          IncrementBy.class,
          (state, command) -> Effect().persist(new State(state.get() + command.value)))
      .onCommand(
          GetValue.class, (state, command) -> Effect().reply(command.replyTo, state.get()))
      .onCommand(
          Delete.class, (state, command) -> Effect().delete())
      .build();
}
```

### Example 16: Completing the example

```scala
import akka.persistence.typed.state.scaladsl.DurableStateBehavior
import akka.persistence.typed.PersistenceId

def counter(id: String): DurableStateBehavior[Command[_], State] = {
  DurableStateBehavior.apply[Command[_], State](
    persistenceId = PersistenceId.ofUniqueId(id),
    emptyState = State(0),
    commandHandler = commandHandler)
}
```

### Example 17: Completing the example

```java
import akka.persistence.typed.state.javadsl.DurableStateBehavior;
import akka.persistence.typed.PersistenceId;

public class MyPersistentCounter
    extends DurableStateBehavior<MyPersistentCounter.Command<?>, MyPersistentCounter.State> {

  // commands, events and state defined here

  public static Behavior<Command<?>> create(PersistenceId persistenceId) {
    return new MyPersistentCounter(persistenceId);
  }

  private MyPersistentCounter(PersistenceId persistenceId) {
    super(persistenceId);
  }

  @Override
  public State emptyState() {
    return new State(0);
  }

  @Override
  public CommandHandler<Command<?>, State> commandHandler() {
    return newCommandHandlerBuilder()
        .forAnyState()
        .onCommand(
            Increment.class, (state, command) -> Effect().persist(new State(state.get() + 1)))
        .onCommand(
            IncrementBy.class,
            (state, command) -> Effect().persist(new State(state.get() + command.value)))
        .onCommand(
            GetValue.class, (state, command) -> Effect().reply(command.replyTo, state.get()))
        .onCommand(
            Delete.class, (state, command) -> Effect().delete())
        .build();
  }
}
```

### Example 18: Effects and Side Effects

```scala
sealed trait Command[ReplyMessage] extends CborSerializable
final case class IncrementWithConfirmation(replyTo: ActorRef[Done]) extends Command[Done]
final case class GetValue(replyTo: ActorRef[State]) extends Command[State]

final case class State(value: Int) extends CborSerializable

def counter(persistenceId: PersistenceId): DurableStateBehavior[Command[_], State] = {
  DurableStateBehavior.withEnforcedReplies[Command[_], State](
    persistenceId,
    emptyState = State(0),
    commandHandler = (state, command) =>
      command match {

        case IncrementWithConfirmation(replyTo) =>
          Effect.persist(state.copy(value = state.value + 1)).thenReply(replyTo)(_ => Done)

        case GetValue(replyTo) =>
          Effect.reply(replyTo)(state)
      })
}
```

### Example 19: Effects and Side Effects

```java
import akka.Done;
interface Command<ReplyMessage> {}

public static class IncrementWithConfirmation implements Command<Void> {
  public final ActorRef<Done> replyTo;

  public IncrementWithConfirmation(ActorRef<Done> replyTo) {
    this.replyTo = replyTo;
  }
}

public static class GetValue implements Command<State> {
  private final ActorRef<Integer> replyTo;

  public GetValue(ActorRef<Integer> replyTo) {
    this.replyTo = replyTo;
  }
}

public static class State {
  private final int value;

  public State(int value) {
    this.value = value;
  }

  public int get() {
    return value;
  }
}

public static Behavior<Command<?>> create(PersistenceId persistenceId) {
  return new MyPersistentCounterWithReplies(persistenceId);
}

private MyPersistentCounterWithReplies(PersistenceId persistenceId) {
  super(persistenceId);
}

@Override
public State emptyState() {
  return new State(0);
}

@Override
public CommandHandler<Command<?>, State> commandHandler() {
  return newCommandHandlerBuilder()
      .forAnyState()
      .onCommand(
          IncrementWithConfirmation.class,
          (state, command) ->
              Effect()
                  .persist(new State(state.get() + 1))
                  .thenReply(command.replyTo, (st) -> Done.getInstance()))
      .onCommand(
          GetValue.class, (state, command) -> Effect().reply(command.replyTo, state.get()))
      .build();
}
```

### Example 20: Effects and Side Effects

```scala
// Example factoring out a chained effect to use in several places with `thenRun`
val commonChainedEffects: Mood => Unit = _ => println("Command processed")
// Then in a command handler:
Effect
  .persist(Remembered("Yep")) // persist event
  .thenRun(commonChainedEffects) // add on common chained effect
```

### Example 21: Effects and Side Effects

```java
// Example factoring out a chained effect to use in several places with `thenRun`
static final Procedure<ExampleState> commonChainedEffect =
    state -> System.out.println("Command handled!");

      @Override
      public CommandHandler<MyCommand, MyEvent, ExampleState> commandHandler() {
        return newCommandHandlerBuilder()
            .forStateType(ExampleState.class)
            .onCommand(
                Cmd.class,
                (state, cmd) ->
                    Effect()
                        .persist(new Evt(cmd.data))
                        .thenRun(() -> cmd.replyTo.tell(new Ack()))
                        .thenRun(commonChainedEffect))
            .build();
      }
```

### Example 22: Accessing the ActorContext

```scala
import akka.persistence.typed.state.scaladsl.Effect
import akka.persistence.typed.state.scaladsl.DurableStateBehavior.CommandHandler

def apply(): Behavior[String] =
  Behaviors.setup { context =>
    DurableStateBehavior[String, State](
      persistenceId = PersistenceId.ofUniqueId("myPersistenceId"),
      emptyState = State(0),
      commandHandler = CommandHandler.command { cmd =>
        context.log.info("Got command {}", cmd)
        Effect.none
      })
  }
```

### Example 23: Accessing the ActorContext

```java
public class MyPersistentBehavior
    extends DurableStateBehavior<MyPersistentBehavior.Command, MyPersistentBehavior.State> {

  public static Behavior<Command> create(PersistenceId persistenceId) {
    return Behaviors.setup(ctx -> new MyPersistentBehavior(persistenceId, ctx));
  }

  // this makes the context available to the command handler etc.
  private final ActorContext<Command> context;

  // optionally if you only need `ActorContext.getSelf()`
  private final ActorRef<Command> self;

  public MyPersistentBehavior(PersistenceId persistenceId, ActorContext<Command> ctx) {
    super(persistenceId);
    this.context = ctx;
    this.self = ctx.getSelf();
  }

}
```

### Example 24: Changing Behavior

```scala
sealed trait State

case object BlankState extends State

final case class DraftState(content: PostContent) extends State {
  def withBody(newBody: String): DraftState =
    copy(content = content.copy(body = newBody))

  def postId: String = content.postId
}

final case class PublishedState(content: PostContent) extends State {
  def postId: String = content.postId
}
```

### Example 25: Changing Behavior

```java
interface State {}

enum BlankState implements State {
  INSTANCE
}

static class DraftState implements State {
  final PostContent content;

  DraftState(PostContent content) {
    this.content = content;
  }

  DraftState withContent(PostContent newContent) {
    return new DraftState(newContent);
  }

  DraftState withBody(String newBody) {
    return withContent(new PostContent(postId(), content.title, newBody));
  }

  String postId() {
    return content.postId;
  }
}

static class PublishedState implements State {
  final PostContent content;

  PublishedState(PostContent content) {
    this.content = content;
  }

  PublishedState withContent(PostContent newContent) {
    return new PublishedState(newContent);
  }

  PublishedState withBody(String newBody) {
    return withContent(new PostContent(postId(), content.title, newBody));
  }

  String postId() {
    return content.postId;
  }
}
```

### Example 26: Changing Behavior

```scala
sealed trait Command
final case class AddPost(content: PostContent, replyTo: ActorRef[StatusReply[AddPostDone]]) extends Command
final case class AddPostDone(postId: String)
final case class GetPost(replyTo: ActorRef[PostContent]) extends Command
final case class ChangeBody(newBody: String, replyTo: ActorRef[Done]) extends Command
final case class Publish(replyTo: ActorRef[Done]) extends Command
final case class PostContent(postId: String, title: String, body: String)
```

### Example 27: Changing Behavior

```java
public interface Command {}
public static class AddPost implements Command {
  final PostContent content;
  final ActorRef<AddPostDone> replyTo;

  public AddPost(PostContent content, ActorRef<AddPostDone> replyTo) {
    this.content = content;
    this.replyTo = replyTo;
  }
}

public static class AddPostDone implements Command {
  final String postId;

  public AddPostDone(String postId) {
    this.postId = postId;
  }
}
public static class GetPost implements Command {
  final ActorRef<PostContent> replyTo;

  public GetPost(ActorRef<PostContent> replyTo) {
    this.replyTo = replyTo;
  }
}

public static class ChangeBody implements Command {
  final String newBody;
  final ActorRef<Done> replyTo;

  public ChangeBody(String newBody, ActorRef<Done> replyTo) {
    this.newBody = newBody;
    this.replyTo = replyTo;
  }
}

public static class Publish implements Command {
  final ActorRef<Done> replyTo;

  public Publish(ActorRef<Done> replyTo) {
    this.replyTo = replyTo;
  }
}

public static class PostContent implements Command {
  final String postId;
  final String title;
  final String body;

  public PostContent(String postId, String title, String body) {
    this.postId = postId;
    this.title = title;
    this.body = body;
  }
}
```

### Example 28: Changing Behavior

```scala
private val commandHandler: (State, Command) => Effect[State] = { (state, command) =>
  state match {

    case BlankState =>
      command match {
        case cmd: AddPost => addPost(cmd)
        case _            => Effect.unhandled
      }

    case draftState: DraftState =>
      command match {
        case cmd: ChangeBody  => changeBody(draftState, cmd)
        case Publish(replyTo) => publish(draftState, replyTo)
        case GetPost(replyTo) => getPost(draftState, replyTo)
        case AddPost(_, replyTo) =>
          Effect.unhandled[State].thenRun(_ => replyTo ! StatusReply.Error("Cannot add post while in draft state"))
      }

    case publishedState: PublishedState =>
      command match {
        case GetPost(replyTo) => getPost(publishedState, replyTo)
        case AddPost(_, replyTo) =>
          Effect.unhandled[State].thenRun(_ => replyTo ! StatusReply.Error("Cannot add post, already published"))
        case _ => Effect.unhandled
      }
  }
}

private def addPost(cmd: AddPost): Effect[State] = {
  Effect.persist(DraftState(cmd.content)).thenRun { _ =>
    // After persist is done additional side effects can be performed
    cmd.replyTo ! StatusReply.Success(AddPostDone(cmd.content.postId))
  }
}

private def changeBody(state: DraftState, cmd: ChangeBody): Effect[State] = {
  Effect.persist(state.withBody(cmd.newBody)).thenRun { _ =>
    cmd.replyTo ! Done
  }
}

private def publish(state: DraftState, replyTo: ActorRef[Done]): Effect[State] = {
  Effect.persist(PublishedState(state.content)).thenRun { _ =>
    println(s"Blog post ${state.postId} was published")
    replyTo ! Done
  }
}

private def getPost(state: DraftState, replyTo: ActorRef[PostContent]): Effect[State] = {
  replyTo ! state.content
  Effect.none
}

private def getPost(state: PublishedState, replyTo: ActorRef[PostContent]): Effect[State] = {
  replyTo ! state.content
  Effect.none
}
```

### Example 29: Changing Behavior

```java
@Override
public CommandHandler<Command, State> commandHandler() {
  CommandHandlerBuilder<Command, State> builder = newCommandHandlerBuilder();

  builder.forStateType(BlankState.class).onCommand(AddPost.class, this::onAddPost);

  builder
      .forStateType(DraftState.class)
      .onCommand(ChangeBody.class, this::onChangeBody)
      .onCommand(Publish.class, this::onPublish)
      .onCommand(GetPost.class, this::onGetPost);

  builder
      .forStateType(PublishedState.class)
      .onCommand(ChangeBody.class, this::onChangeBody)
      .onCommand(GetPost.class, this::onGetPost);

  builder.forAnyState().onCommand(AddPost.class, (state, cmd) -> Effect().unhandled());

  return builder.build();
}

private Effect<State> onAddPost(AddPost cmd) {
  return Effect()
      .persist(new DraftState(cmd.content))
      .thenRun(() -> cmd.replyTo.tell(new AddPostDone(cmd.content.postId)));
}

private Effect<State> onChangeBody(DraftState state, ChangeBody cmd) {
  return Effect()
      .persist(state.withBody(cmd.newBody))
      .thenRun(() -> cmd.replyTo.tell(Done.getInstance()));
}

private Effect<State> onChangeBody(PublishedState state, ChangeBody cmd) {
  return Effect()
      .persist(state.withBody(cmd.newBody))
      .thenRun(() -> cmd.replyTo.tell(Done.getInstance()));
}

private Effect<State> onPublish(DraftState state, Publish cmd) {
  return Effect()
      .persist(new PublishedState(state.content))
      .thenRun(
          () -> {
            System.out.println("Blog post published: " + state.postId());
            cmd.replyTo.tell(Done.getInstance());
          });
}

private Effect<State> onGetPost(DraftState state, GetPost cmd) {
  cmd.replyTo.tell(state.content);
  return Effect().none();
}

private Effect<State> onGetPost(PublishedState state, GetPost cmd) {
  cmd.replyTo.tell(state.content);
  return Effect().none();
}
```

### Example 30: Changing Behavior

```scala
object BlogPostEntityDurableState {
  // commands, state defined here

  def apply(entityId: String, persistenceId: PersistenceId): Behavior[Command] = {
    Behaviors.setup { context =>
      context.log.info("Starting BlogPostEntityDurableState {}", entityId)
      DurableStateBehavior[Command, State](persistenceId, emptyState = BlankState, commandHandler)
    }
  }

  // commandHandler defined here
}
```

### Example 31: Changing Behavior

```java
public class BlogPostEntityDurableState
    extends DurableStateBehavior<
        BlogPostEntityDurableState.Command, BlogPostEntityDurableState.State> {
  // commands and state as in above snippets

  public static Behavior<Command> create(String entityId, PersistenceId persistenceId) {
    return Behaviors.setup(
        context -> {
          context.getLog().info("Starting BlogPostEntityDurableState {}", entityId);
          return new BlogPostEntityDurableState(persistenceId);
        });
  }

  private BlogPostEntityDurableState(PersistenceId persistenceId) {
    super(persistenceId);
  }

  @Override
  public State emptyState() {
    return BlankState.INSTANCE;
  }

  // commandHandler, eventHandler as in above snippets
}
```

### Example 32: Replies

```scala
final case class AddPost(content: PostContent, replyTo: ActorRef[StatusReply[AddPostDone]]) extends Command
final case class AddPostDone(postId: String)
```

### Example 33: Replies

```java
public static class AddPost implements Command {
  final PostContent content;
  final ActorRef<AddPostDone> replyTo;

  public AddPost(PostContent content, ActorRef<AddPostDone> replyTo) {
    this.content = content;
    this.replyTo = replyTo;
  }
}

public static class AddPostDone implements Command {
  final String postId;

  public AddPostDone(String postId) {
    this.postId = postId;
  }
}
```

### Example 34: Replies

```scala
Effect.persist(DraftState(cmd.content)).thenRun { _ =>
  // After persist is done additional side effects can be performed
  cmd.replyTo ! StatusReply.Success(AddPostDone(cmd.content.postId))
}
```

### Example 35: Replies

```java
return Effect()
    .persist(new DraftState(cmd.content))
    .thenRun(() -> cmd.replyTo.tell(new AddPostDone(cmd.content.postId)));
```

### Example 36: Replies

```scala
def apply(persistenceId: PersistenceId): Behavior[Command] = {
  DurableStateBehavior
    .withEnforcedReplies[Command, Account](persistenceId, EmptyAccount, (state, cmd) => state.applyCommand(cmd))
}
```

### Example 37: Replies

```java
public class AccountEntity
    extends DurableStateBehaviorWithEnforcedReplies<
        AccountEntity.Command, AccountEntity.Account> {
```

### Example 38: Replies

```scala
sealed trait Command extends CborSerializable
final case class Withdraw(amount: BigDecimal, replyTo: ActorRef[StatusReply[Done]]) extends Command
```

### Example 39: Replies

```java
interface Command extends CborSerializable {}
```

### Example 40: Replies

```scala
private def deposit(cmd: Deposit) = {
  Effect.persist(copy(balance = balance + cmd.amount)).thenReply(cmd.replyTo)(_ => StatusReply.Ack)
}

private def withdraw(cmd: Withdraw) = {
  if (canWithdraw(cmd.amount))
    Effect.persist(copy(balance = balance - cmd.amount)).thenReply(cmd.replyTo)(_ => StatusReply.Ack)
  else
    Effect.reply(cmd.replyTo)(
      StatusReply.Error(s"Insufficient balance ${balance} to be able to withdraw ${cmd.amount}"))
}
```

### Example 41: Replies

```java
private ReplyEffect<Account> withdraw(OpenedAccount account, Withdraw command) {
  if (!account.canWithdraw(command.amount)) {
    return Effect()
        .reply(
            command.replyTo,
            StatusReply.error("not enough funds to withdraw " + command.amount));
  } else {
    return Effect()
        .persist(account.makeWithdraw(command.amount))
        .thenReply(command.replyTo, account2 -> StatusReply.ack());
  }
}
```

### Example 42: Tagging

```scala
DurableStateBehavior[Command[_], State](
  persistenceId = PersistenceId.ofUniqueId("abc"),
  emptyState = State(0),
  commandHandler = (state, cmd) => throw new NotImplementedError("TODO: process the command & return an Effect"))
  .withTag("tag1")
```

### Example 43: Tagging

```java
public class MyPersistentBehavior
    extends DurableStateBehavior<MyPersistentBehavior.Command, MyPersistentBehavior.State> {
  @Override
  public String tag() {
    return "tag1";
  }
```

### Example 44: Wrapping DurableStateBehavior

```scala
Behaviors.setup[Command[_]] { context =>
  DurableStateBehavior[Command[_], State](
    persistenceId = PersistenceId.ofUniqueId("abc"),
    emptyState = State(0),
    commandHandler = CommandHandler.command { cmd =>
      context.log.info("Got command {}", cmd)
      Effect.none
    })
}
```

### Example 45: Wrapping DurableStateBehavior

```java
public class MyPersistentBehavior
    extends DurableStateBehavior<MyPersistentBehavior.Command, MyPersistentBehavior.State> {


  public static Behavior<Command> create(PersistenceId persistenceId) {
    return Behaviors.setup(context -> new MyPersistentBehavior(persistenceId, context));
  }

  private final ActorContext<Command> context;

  private MyPersistentBehavior(PersistenceId persistenceId, ActorContext<Command> context) {
    super(
        persistenceId,
        SupervisorStrategy.restartWithBackoff(
            Duration.ofSeconds(10), Duration.ofSeconds(30), 0.2));
    this.context = context;
  }

  @Override
  public CommandHandler<Command, State> commandHandler() {
    return (state, command) -> {
      context.getLog().info("In command handler");
      return Effect().none();
    };
  }
```

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.9/akka/actor/typed/scaladsl/ActorContext.html
- https://doc.akka.io/api/akka-core/2.9/akka/persistence/typed/PersistenceId.html
- https://doc.akka.io/api/akka-core/2.9/akka/persistence/typed/state/scaladsl/DurableStateBehavior.html
- https://doc.akka.io/api/akka/2.9.8/akka/persistence/typed/index.html
- https://doc.akka.io/docs/akka-dependencies/current/support-terminology.html
- https://doc.akka.io/japi/akka-core/2.9/akka/actor/typed/javadsl/ActorContext.html
- https://doc.akka.io/japi/akka-core/2.9/akka/persistence/typed/PersistenceId.html
- https://doc.akka.io/japi/akka-core/2.9/akka/persistence/typed/state/javadsl/DurableStateBehavior.html
- https://doc.akka.io/japi/akka/2.9.8/akka/persistence/typed/package-summary.html
- https://doc.akka.io/libraries/akka-core/2.9/persistence-plugins.html
- https://doc.akka.io/libraries/akka-core/2.9/serialization-jackson.html
- https://doc.akka.io/libraries/akka-core/2.9/serialization.html
- https://doc.akka.io/libraries/akka-core/2.9/typed/actors.html
- https://doc.akka.io/libraries/akka-core/2.9/typed/cluster-sharding.html
- https://doc.akka.io/libraries/akka-core/2.9/typed/durable-state/persistence-style.html
- https://doc.akka.io/libraries/akka-core/2.9/typed/durable-state/persistence.html
- https://doc.akka.io/libraries/akka-core/2.9/typed/durable-state/project/links.html
- https://doc.akka.io/libraries/akka-core/2.9/typed/index-persistence-durable-state.html
- https://doc.akka.io/libraries/akka-core/2.9/typed/interaction-patterns.html
- https://doc.akka.io/libraries/akka-core/2.9/typed/persistence.html

---
*Source: [https://doc.akka.io/libraries/akka-core/2.9/typed/durable-state/persistence.html](https://doc.akka.io/libraries/akka-core/2.9/typed/durable-state/persistence.html)*