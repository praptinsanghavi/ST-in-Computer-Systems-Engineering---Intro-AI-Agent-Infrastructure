---
description: Event Sourcing with Akka Persistence enables actors to persist your events
  for recovery on failure or when migrated within a cluster.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:23:55Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/typed/persistence.html
title: Event Sourcing • Akka core
---

# Event Sourcing • Akka core

> **Summary:** Event Sourcing with Akka Persistence enables actors to persist your events for recovery on failure or when migrated within a cluster.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Event Sourcing

You are viewing the documentation for the new actor APIs, to view the Akka Classic documentation, see [Classic Akka Persistence](../persistence.html).

## Module info

Note
The Akka dependencies are available from Akka’s secure library repository. To access them you need to use a secure, tokenized URL as specified at <https://account.akka.io/token>.

To use Akka Persistence, add the module to your project:

sbt
```
val AkkaVersion = "2.10.17"
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
      <version>2.10.17</version>
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
  implementation platform("com.typesafe.akka:akka-bom_${versions.ScalaBinary}:2.10.17")

  implementation "com.typesafe.akka:akka-persistence-typed_${versions.ScalaBinary}"
  testImplementation "com.typesafe.akka:akka-persistence-testkit_${versions.ScalaBinary}"
}
```

You also have to select journal plugin and optionally snapshot store plugin, see [Persistence Plugins](../persistence-plugins.html).

| Project Info: Akka Event Sourcing (typed) | |
| --- | --- |
| Artifact | com.typesafe.akka akka\-persistence\-typed 2\.10\.17 [Snapshots are available](project/links.html#snapshots-repository) |
| JDK versions | Eclipse Temurin JDK 11Eclipse Temurin JDK 17Eclipse Temurin JDK 21 |
| Scala versions | 2\.13\.17, 3\.3\.7 |
| JPMS module name | akka.persistence.typed |
| License | [BUSL\-1\.1](https://raw.githubusercontent.com/akka/akka-core/v2.10.17/LICENSE) |
| Readiness level | [Supported](https://doc.akka.io/docs/akka-dependencies/current/support-terminology.html#supported), support is available from [Lightbend](https://www.lightbend.com/akka) Since 2\.6\.0, 2019\-11\-06 |
| Home page | <https://akka.io/> |
| API documentation | [API (Scaladoc)](https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/index.html) [API (Javadoc)](https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/package-summary.html) |
| Forums | [Akka Discuss](https://discuss.akka.io) |
| Release notes | [Akka release notes](https://doc.akka.io/reference/release-notes.html) |
| Issues | [Github issues](https://github.com/akka/akka-core/issues) |
| Sources | [https://github.com/akka/akka\-core](https://github.com/akka/akka-core) |

## Introduction

Akka Persistence enables stateful actors to persist their state so that it can be recovered when an actor is either restarted, such as after a JVM crash, by a supervisor or a manual stop\-start, or migrated within a cluster. The key concept behind Akka Persistence is that only the *events* that are persisted by the actor are stored, not the actual state of the actor (although actor state snapshot support is available). The events are persisted by appending to storage (nothing is ever mutated) which allows for very high transaction rates and efficient replication. A stateful actor is recovered by replaying the stored events to the actor, allowing it to rebuild its state. This can be either the full history of changes or starting from a checkpoint in a snapshot, which can dramatically reduce recovery times. 

Akka Persistence also supports [Durable State Behaviors](durable-state/persistence.html), which is based on persistence of the latest state of the actor. In this implementation, the *latest* state is persisted, instead of events. Hence this is more similar to CRUD based applications.

The [Event Sourcing with Akka 2\.6 video](https://akka.io/blog/news/2020/01/07/akka-event-sourcing-video) is a good starting point for learning Event Sourcing, together with the [Microservices with Akka tutorial](https://doc.akka.io/libraries/guide/microservices-tutorial/) that illustrates how to implement an Event Sourced CQRS application with Akka Persistence and Akka Projections.

### Event Sourcing concepts

See an [introduction to Event Sourcing](https://docs.microsoft.com/en-us/previous-versions/msp-n-p/jj591559%28v=pandp.10%29) at MSDN.

Another excellent article about “thinking in Events” is [Events As First\-Class Citizens](https://hackernoon.com/events-as-first-class-citizens-8633e8479493) by Randy Shoup. It is a short and recommended read if you’re starting developing Events based applications.

What follows is Akka’s implementation via event sourced actors. 

An event sourced actor (also known as a persistent actor) receives a (non\-persistent) command which is first validated if it can be applied to the current state. Here validation can mean anything, from simple inspection of a command message’s fields up to a conversation with several external services, for example. If validation succeeds, events are generated from the command, representing the effect of the command. These events are then persisted and, after successful persistence, used to change the actor’s state. When the event sourced actor needs to be recovered, only the persisted events are replayed of which we know that they can be successfully applied. In other words, events cannot fail when being replayed to a persistent actor, in contrast to commands. Event sourced actors may also process commands that do not change application state such as query commands for example.

## Example and core API

Let’s start with a simple example. The minimum required for a [`EventSourcedBehavior`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/javadsl/EventSourcedBehavior.html "akka.persistence.typed.javadsl.EventSourcedBehavior")[`EventSourcedBehavior`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/scaladsl/EventSourcedBehavior.html "akka.persistence.typed.scaladsl.EventSourcedBehavior") is:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence-typed/src/test/scala/docs/akka/persistence/typed/BasicPersistentBehaviorCompileOnly.scala#L20-L104 "Go to snippet source")import akka.persistence.typed.scaladsl.EventSourcedBehavior
import akka.persistence.typed.PersistenceId

object MyPersistentBehavior {
  sealed trait Command
  sealed trait Event
  final case class State()

  def apply(): Behavior[Command] =
    EventSourcedBehavior[Command, Event, State](
      persistenceId = PersistenceId.ofUniqueId("abc"),
      emptyState = State(),
      commandHandler = (state, cmd) => throw new NotImplementedError("TODO: process the command & return an Effect"),
      eventHandler = (state, evt) => throw new NotImplementedError("TODO: process the event return the next state"))
}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence-typed/src/test/java/jdocs/akka/persistence/typed/BasicPersistentBehaviorTest.java#L36-L72 "Go to snippet source")public class MyPersistentBehavior
    extends EventSourcedBehavior<
        MyPersistentBehavior.Command, MyPersistentBehavior.Event, MyPersistentBehavior.State> {

  interface Command {}

  interface Event {}

  public static class State {}

  public static Behavior<Command> create(PersistenceId persistenceId) {
    return new MyPersistentBehavior(persistenceId);
  }

  private MyPersistentBehavior(PersistenceId persistenceId) {
    super(persistenceId);
  }

  @Override
  public State emptyState() {
    return new State();
  }

  @Override
  public CommandHandler<Command, Event, State> commandHandler() {
    return (state, command) -> {
      throw new RuntimeException("TODO: process the command & return an Effect");
    };
  }

  @Override
  public EventHandler<State, Event> eventHandler() {
    return (state, event) -> {
      throw new RuntimeException("TODO: process the event return the next state");
    };
  }
}
```

The first important thing to notice is the [`Behavior`](https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/Behavior.html "akka.actor.typed.Behavior")[`Behavior`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/Behavior.html "akka.actor.typed.Behavior") of a persistent actor is typed to the type of the `Command` because this is the type of message a persistent actor should receive. In Akka this is now enforced by the type system.

The components that make up an [`EventSourcedBehavior`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/javadsl/EventSourcedBehavior.html "akka.persistence.typed.javadsl.EventSourcedBehavior")[`EventSourcedBehavior`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/scaladsl/EventSourcedBehavior.html "akka.persistence.typed.scaladsl.EventSourcedBehavior") are:

- `persistenceId` is the stable unique identifier for the persistent actor.
- `emptyState` defines the `State` when the entity is first created e.g. a Counter would start with 0 as state.
- `commandHandler` defines how to handle command by producing Effects e.g. persisting events, stopping the persistent actor.
- `eventHandler` returns the new state given the current state when an event has been persisted.

Note that the concrete class does not contain any fields with state like a regular POJO. All state of the `EventSourcedBehavior` must be represented in the `State` or else they will not be persisted and therefore be lost when the actor is stopped or restarted. Updates to the State are always performed in the eventHandler based on the events.

If the state is mutable, it is important that the `emptyState` method creates a new State instance each time it is called to ensure that the state is recreated in case of failure restarts.

It is recommended to use an immutable state class. If the state is mutable, it is important to use the `EventSourcedBehavior.withMutableState` factory method that takes `emptyStateFactory: () => State` parameter to make sure that the state instance is recreated in case of failure restarts.

Next we’ll discuss each of these in detail.

### PersistenceId

The [`PersistenceId`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/PersistenceId.html "akka.persistence.typed.PersistenceId")[`PersistenceId`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/PersistenceId.html "akka.persistence.typed.PersistenceId") is the stable unique identifier for the persistent actor in the backend event journal and snapshot store.

[Cluster Sharding](cluster-sharding.html) is typically used together with `EventSourcedBehavior` to ensure that there is only one active entity for each `PersistenceId` (`entityId`). There are techniques to ensure this uniqueness, an example of which can be found in the [Persistence example in the Cluster Sharding documentation](cluster-sharding.html#persistence-example). This illustrates how to construct the `PersistenceId` from the `entityTypeKey` and `entityId` provided by the [`EntityContext`](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/javadsl/EntityContext.html "akka.cluster.sharding.typed.javadsl.EntityContext")[`EntityContext`](https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/typed/scaladsl/EntityContext.html "akka.cluster.sharding.typed.scaladsl.EntityContext").

The `entityId` in Cluster Sharding is the business domain identifier of the entity. The `entityId` might not be unique enough to be used as the `PersistenceId` by itself. For example two different types of entities may have the same `entityId`. To create a unique `PersistenceId` the `entityId` should be prefixed with a stable name of the entity type, which typically is the same as the `EntityTypeKey.name` that is used in Cluster Sharding. There are `PersistenceId.apply``PersistenceId.of` factory methods to help with constructing such `PersistenceId` from an `entityTypeHint` and `entityId`.

The default separator when concatenating the `entityTypeHint` and `entityId` is `|`, but a custom separator is supported.

Note
The `|` separator is also used in Lagom’s `scaladsl.PersistentEntity` but no separator is used in Lagom’s `javadsl.PersistentEntity`. For compatibility with Lagom’s `javadsl.PersistentEntity` you should use `""` as the separator.

A custom identifier can be created with [`PersistenceId.ofUniqueId`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/PersistenceId$.html#ofUniqueId(id:String):akka.persistence.typed.PersistenceId "akka.persistence.typed.PersistenceId")[`PersistenceId.ofUniqueId`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/PersistenceId.html#ofUniqueId(java.lang.String) "akka.persistence.typed.PersistenceId"). 

### Command handler

The command handler is a function with 2 parameters, the current `State` and the incoming `Command`.

A command handler returns an [`Effect`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/scaladsl/Effect.html "akka.persistence.typed.scaladsl.Effect")[`Effect`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/javadsl/Effect.html "akka.persistence.typed.javadsl.Effect") directive that defines what event or events, if any, to persist. Effects are created using a factory that is returned via the `Effect()` method the `Effect` factory.

The two most commonly used effects are: 

- `persist` will persist one single event or several events atomically, i.e. all events are stored or none of them are stored if there is an error
- `none` no events are to be persisted, for example a read\-only command

More effects are explained in [Effects and Side Effects](persistence.html#effects-and-side-effects).

In addition to returning the primary `Effect` for the command `EventSourcedBehavior`s can also chain side effects that are to be performed after successful persist which is achieved with the `thenRun` function e.g. `Effect.persist(..).thenRun``Effect().persist(..).thenRun`.

### Event handler

When an event has been persisted successfully the new state is created by applying the event to the current state with the `eventHandler`. In the case of multiple persisted events, the `eventHandler` is called with each event in the same order as they were passed to `Effect.persist(..)``Effect().persist(..)`.

The state is typically defined as an immutable class and then the event handler returns a new instance of the state. You may choose to use a mutable class for the state, and then the event handler may update the state instance and return the same instance. Both immutable and mutable state is supported, but it must only be modified in the event handler.

The same event handler is also used when the entity is started up to recover its state from the stored events.

The event handler must only update the state and never perform side effects, as those would also be executed during recovery of the persistent actor. Side effects should be performed in `thenRun` from the [command handler](persistence.html#command-handler) after persisting the event or from the [`RecoveryCompleted`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/RecoveryCompleted.html "akka.persistence.typed.RecoveryCompleted")[`RecoveryCompleted`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/RecoveryCompleted.html "akka.persistence.typed.RecoveryCompleted") after [Recovery](persistence.html#recovery).

### Completing the example

Let’s fill in the details of the example.

Command and event:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence-typed/src/test/scala/docs/akka/persistence/typed/BasicPersistentBehaviorCompileOnly.scala#L37-L43 "Go to snippet source")sealed trait Command
final case class Add(data: String) extends Command
case object Clear extends Command

sealed trait Event
final case class Added(data: String) extends Event
case object Cleared extends Event
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence-typed/src/test/java/jdocs/akka/persistence/typed/BasicPersistentBehaviorTest.java#L85-L111 "Go to snippet source")interface Command {}

public static class Add implements Command {
  public final String data;

  public Add(String data) {
    this.data = data;
  }
}

public enum Clear implements Command {
  INSTANCE
}

interface Event {}

public static class Added implements Event {
  public final String data;

  public Added(String data) {
    this.data = data;
  }
}

public enum Cleared implements Event {
  INSTANCE
}
```

State is a List containing the 5 latest items:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence-typed/src/test/scala/docs/akka/persistence/typed/BasicPersistentBehaviorCompileOnly.scala#L47 "Go to snippet source")final case class State(history: List[String] = Nil)
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence-typed/src/test/java/jdocs/akka/persistence/typed/BasicPersistentBehaviorTest.java#L115-L133 "Go to snippet source")public static class State {
  private final List<String> items;

  private State(List<String> items) {
    this.items = items;
  }

  public State() {
    this.items = new ArrayList<>();
  }

  public State addItem(String data) {
    List<String> newItems = new ArrayList<>(items);
    newItems.add(0, data);
    // keep 5 items
    List<String> latest = newItems.subList(0, Math.min(5, newItems.size()));
    return new State(latest);
  }
}
```

The command handler persists the `Add` payload in an `Added` event:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence-typed/src/test/scala/docs/akka/persistence/typed/BasicPersistentBehaviorCompileOnly.scala#L51-L58 "Go to snippet source")import akka.persistence.typed.scaladsl.Effect

val commandHandler: (State, Command) => Effect[Event, State] = { (state, command) =>
  command match {
    case Add(data) => Effect.persist(Added(data))
    case Clear     => Effect.persist(Cleared)
  }
}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence-typed/src/test/java/jdocs/akka/persistence/typed/BasicPersistentBehaviorTest.java#L153-L160 "Go to snippet source")@Override
public CommandHandler<Command, Event, State> commandHandler() {
  return newCommandHandlerBuilder()
      .forAnyState()
      .onCommand(Add.class, command -> Effect().persist(new Added(command.data)))
      .onCommand(Clear.class, command -> Effect().persist(Cleared.INSTANCE))
      .build();
}
```

The event handler appends the item to the state and keeps 5 items. This is called after successfully persisting the event in the database:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence-typed/src/test/scala/docs/akka/persistence/typed/BasicPersistentBehaviorCompileOnly.scala#L73-L78 "Go to snippet source")val eventHandler: (State, Event) => State = { (state, event) =>
  event match {
    case Added(data) => state.copy((data :: state.history).take(5))
    case Cleared     => State(Nil)
  }
}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence-typed/src/test/java/jdocs/akka/persistence/typed/BasicPersistentBehaviorTest.java#L164-L171 "Go to snippet source")@Override
public EventHandler<State, Event> eventHandler() {
  return newEventHandlerBuilder()
      .forAnyState()
      .onEvent(Added.class, (state, event) -> state.addItem(event.data))
      .onEvent(Cleared.class, () -> new State())
      .build();
}
```

These are used to create an [`EventSourcedBehavior`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/scaladsl/EventSourcedBehavior.html "akka.persistence.typed.scaladsl.EventSourcedBehavior"): These are defined in an [`EventSourcedBehavior`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/javadsl/EventSourcedBehavior.html "akka.persistence.typed.javadsl.EventSourcedBehavior"):

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence-typed/src/test/scala/docs/akka/persistence/typed/BasicPersistentBehaviorCompileOnly.scala#L20-L87 "Go to snippet source")import akka.persistence.typed.scaladsl.EventSourcedBehavior
import akka.persistence.typed.PersistenceId

def apply(id: String): Behavior[Command] =
  EventSourcedBehavior[Command, Event, State](
    persistenceId = PersistenceId.ofUniqueId(id),
    emptyState = State(Nil),
    commandHandler = commandHandler,
    eventHandler = eventHandler)
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence-typed/src/test/java/jdocs/akka/persistence/typed/BasicPersistentBehaviorTest.java#L22-L173 "Go to snippet source")import akka.persistence.typed.javadsl.EventSourcedBehavior;
import akka.persistence.typed.PersistenceId;

public class MyPersistentBehavior
    extends EventSourcedBehavior<
        MyPersistentBehavior.Command, MyPersistentBehavior.Event, MyPersistentBehavior.State> {

  // commands, events and state defined here

  public static Behavior<Command> create(PersistenceId persistenceId) {
    return new MyPersistentBehavior(persistenceId);
  }

  private MyPersistentBehavior(PersistenceId persistenceId) {
    super(persistenceId);
  }

  @Override
  public State emptyState() {
    return new State();
  }

  @Override
  public CommandHandler<Command, Event, State> commandHandler() {
    return newCommandHandlerBuilder()
        .forAnyState()
        .onCommand(Add.class, command -> Effect().persist(new Added(command.data)))
        .onCommand(Clear.class, command -> Effect().persist(Cleared.INSTANCE))
        .build();
  }

  @Override
  public EventHandler<State, Event> eventHandler() {
    return newEventHandlerBuilder()
        .forAnyState()
        .onEvent(Added.class, (state, event) -> state.addItem(event.data))
        .onEvent(Cleared.class, () -> new State())
        .build();
  }
}
```

## Effects and Side Effects

A command handler returns an [`Effect`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/javadsl/Effect.html "akka.persistence.typed.javadsl.Effect")[`Effect`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/scaladsl/Effect.html "akka.persistence.typed.scaladsl.Effect") directive that defines what event or events, if any, to persist. Effects are created using a factory that is returned via the `Effect()` method the `Effect` factory and can be one of: 

- [`persist`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/scaladsl/Effect$.html#persist[Event,State](events:Seq[Event]):akka.persistence.typed.scaladsl.EffectBuilder[Event,State] "akka.persistence.typed.scaladsl.Effect")[`persist`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/javadsl/EffectFactories.html#persist(java.util.List) "akka.persistence.typed.javadsl.EffectFactories") will persist one single event or several events atomically, i.e. all events are stored or none of them are stored if there is an error
- [`none`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/scaladsl/Effect$.html#none[Event,State]:akka.persistence.typed.scaladsl.EffectBuilder[Event,State] "akka.persistence.typed.scaladsl.Effect")[`none`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/javadsl/EffectFactories.html#none() "akka.persistence.typed.javadsl.EffectFactories") no events are to be persisted, for example a read\-only command
- [`unhandled`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/scaladsl/Effect$.html#unhandled[Event,State]:akka.persistence.typed.scaladsl.EffectBuilder[Event,State] "akka.persistence.typed.scaladsl.Effect")[`unhandled`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/javadsl/EffectFactories.html#unhandled() "akka.persistence.typed.javadsl.EffectFactories") the command is unhandled (not supported) in current state
- [`stop`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/scaladsl/Effect$.html#stop[Event,State]():akka.persistence.typed.scaladsl.EffectBuilder[Event,State] "akka.persistence.typed.scaladsl.Effect")[`stop`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/javadsl/EffectFactories.html#stop() "akka.persistence.typed.javadsl.EffectFactories") stop this actor
- [`stash`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/scaladsl/Effect$.html#stash[Event,State]():akka.persistence.typed.scaladsl.ReplyEffect[Event,State] "akka.persistence.typed.scaladsl.Effect")[`stash`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/javadsl/EffectFactories.html#stash() "akka.persistence.typed.javadsl.EffectFactories") the current command is stashed
- [`unstashAll`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/scaladsl/Effect$.html#unstashAll[Event,State]():akka.persistence.typed.scaladsl.Effect[Event,State] "akka.persistence.typed.scaladsl.Effect")[`unstashAll`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/javadsl/EffectFactories.html#unstashAll() "akka.persistence.typed.javadsl.EffectFactories") process the commands that were stashed with `Effect.stash``Effect().stash`
- [`reply`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/scaladsl/Effect$.html#reply[ReplyMessage,Event,State](replyTo:akka.actor.typed.ActorRef[ReplyMessage])(replyWithMessage:ReplyMessage):akka.persistence.typed.scaladsl.ReplyEffect[Event,State] "akka.persistence.typed.scaladsl.Effect")[`reply`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/javadsl/EffectFactories.html#reply(akka.actor.typed.ActorRef,ReplyMessage) "akka.persistence.typed.javadsl.EffectFactories") send a reply message to the given [`ActorRef`](https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/ActorRef.html "akka.actor.typed.ActorRef")[`ActorRef`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/ActorRef.html "akka.actor.typed.ActorRef")
- [`async`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/scaladsl/Effect$.html#async "akka.persistence.typed.scaladsl.Effect")[`async`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/javadsl/EffectFactories.html#async(java.util.concurrent.CompletionStage) "akka.persistence.typed.javadsl.EffectFactories") Asynchronous command handling
- [`asyncReply`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/scaladsl/Effect$.html#asyncReply "akka.persistence.typed.scaladsl.Effect")[`asyncReply`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/javadsl/EffectFactories.html#asyncReply(java.util.concurrent.CompletionStage) "akka.persistence.typed.javadsl.EffectFactories") Asynchronous command handling and then reply

Note that only one of those can be chosen per incoming command. It is not possible to both persist and say none/unhandled.

In addition to returning the primary `Effect` for the command [`EventSourcedBehavior`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/javadsl/EventSourcedBehavior.html "akka.persistence.typed.javadsl.EventSourcedBehavior")[`EventSourcedBehavior`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/scaladsl/EventSourcedBehavior.html "akka.persistence.typed.scaladsl.EventSourcedBehavior")s can also chain side effects that are to be performed after successful persist which is achieved with the [`thenRun`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/javadsl/EffectBuilder.html#thenRun(akka.japi.function.Effect) "akka.persistence.typed.javadsl.EffectBuilder")[`thenRun`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/scaladsl/EffectBuilder.html#thenRun(callback:State=%3EUnit):akka.persistence.typed.scaladsl.EffectBuilder[Event,State] "akka.persistence.typed.scaladsl.EffectBuilder") function e.g. `Effect.persist(..).thenRun``Effect().persist(..).thenRun`.

In the example below the state is sent to the `subscriber` ActorRef. Note that the new state after applying the event is passed as parameter of the `thenRun` function. In the case where multiple events have been persisted, the state passed to `thenRun` is the updated state after all events have been handled.

All `thenRun` registered callbacks are executed sequentially after successful execution of the persist statement (or immediately, in case of `none` and `unhandled`).

In addition to `thenRun` the following actions can also be performed after successful persist:

- [`thenStop`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/javadsl/EffectBuilder.html#thenStop() "akka.persistence.typed.javadsl.EffectBuilder")[`thenStop`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/scaladsl/EffectBuilder.html#thenStop():akka.persistence.typed.scaladsl.EffectBuilder[Event,State] "akka.persistence.typed.scaladsl.EffectBuilder") the actor will be stopped
- [`thenUnstashAll`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/javadsl/EffectBuilder.html#thenUnstashAll() "akka.persistence.typed.javadsl.EffectBuilder")[`thenUnstashAll`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/scaladsl/EffectBuilder.html#thenUnstashAll():akka.persistence.typed.scaladsl.Effect[Event,State] "akka.persistence.typed.scaladsl.EffectBuilder") process the commands that were stashed with `Effect.stash``Effect().stash`
- [`thenReply`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/javadsl/EffectBuilder.html#thenReply(akka.actor.typed.ActorRef,akka.japi.function.Function) "akka.persistence.typed.javadsl.EffectBuilder")[`thenReply`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/scaladsl/EffectBuilder.html#thenReply[ReplyMessage](replyTo:akka.actor.typed.ActorRef[ReplyMessage])(replyWithMessage:State=%3EReplyMessage):akka.persistence.typed.scaladsl.ReplyEffect[Event,State] "akka.persistence.typed.scaladsl.EffectBuilder") send a reply message to the given [`ActorRef`](https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/ActorRef.html "akka.actor.typed.ActorRef")[`ActorRef`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/ActorRef.html "akka.actor.typed.ActorRef")

Example of effects:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence-typed/src/test/scala/docs/akka/persistence/typed/BasicPersistentBehaviorCompileOnly.scala#L62-L69 "Go to snippet source")def onCommand(subscriber: ActorRef[State], state: State, command: Command): Effect[Event, State] = {
  command match {
    case Add(data) =>
      Effect.persist(Added(data)).thenRun(newState => subscriber ! newState)
    case Clear =>
      Effect.persist(Cleared).thenRun((newState: State) => subscriber ! newState).thenStop()
  }
}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence-typed/src/test/java/jdocs/akka/persistence/typed/BasicPersistentBehaviorTest.java#L247-L270 "Go to snippet source")private final ActorRef<State> subscriber;

@Override
public CommandHandler<Command, Event, State> commandHandler() {
  return newCommandHandlerBuilder()
      .forAnyState()
      .onCommand(Add.class, this::onAdd)
      .onCommand(Clear.class, this::onClear)
      .build();
}

private Effect<Event, State> onAdd(Add command) {
  return Effect()
      .persist(new Added(command.data))
      .thenRun(newState -> subscriber.tell(newState));
}

private Effect<Event, State> onClear(Clear command) {
  return Effect()
      .persist(Cleared.INSTANCE)
      .thenRun(newState -> subscriber.tell(newState))
      .thenStop();
}

```

Most of the time this will be done with the [`thenRun`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/javadsl/EffectBuilder.html#thenRun(akka.japi.function.Effect) "akka.persistence.typed.javadsl.EffectBuilder")[`thenRun`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/scaladsl/EffectBuilder.html#thenRun(callback:State=%3EUnit):akka.persistence.typed.scaladsl.EffectBuilder[Event,State] "akka.persistence.typed.scaladsl.EffectBuilder") method on the `Effect` above. You can factor out common side effects into functions and reuse for several commands. For example:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence-typed/src/test/scala/akka/persistence/typed/scaladsl/PersistentActorCompileOnlyTest.scala#L242-L247 "Go to snippet source")// Example factoring out a chained effect to use in several places with `thenRun`
val commonChainedEffects: Mood => Unit = _ => println("Command processed")
// Then in a command handler:
Effect
  .persist(Remembered("Yep")) // persist event
  .thenRun(commonChainedEffects) // add on common chained effect
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence-typed/src/test/java/akka/persistence/typed/javadsl/PersistentActorCompileOnlyTest.java#L207-L234 "Go to snippet source")// Example factoring out a chained effect to use in several places with `thenRun`
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

Side effects are not run when the actor is restarted or started again after being stopped. You may inspect the state when receiving the [`RecoveryCompleted`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/RecoveryCompleted.html "akka.persistence.typed.RecoveryCompleted")[`RecoveryCompleted`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/RecoveryCompleted.html "akka.persistence.typed.RecoveryCompleted") signal and execute side effects that have not been acknowledged at that point. That may possibly result in executing side effects more than once.

The side effects are executed sequentially, it is not possible to execute side effects in parallel, unless they call out to something that is running concurrently (for example sending a message to another actor).

It’s possible to execute a side effects before persisting the event, but that can result in that the side effect is performed but the event is not stored if the persist fails.

### Atomic writes

It is possible to store several events atomically by using the [`persist`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/scaladsl/Effect$.html#persist[Event,State](events:Seq[Event]):akka.persistence.typed.scaladsl.EffectBuilder[Event,State] "akka.persistence.typed.scaladsl.Effect")[`persist`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/javadsl/EffectFactories.html#persist(java.util.List) "akka.persistence.typed.javadsl.EffectFactories") effect with a list of events. That means that all events passed to that method are stored or none of them are stored if there is an error.

The recovery of a persistent actor will therefore never be done partially with only a subset of events persisted by a single [`persist`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/scaladsl/Effect$.html#persist[Event,State](event:Event):akka.persistence.typed.scaladsl.EffectBuilder[Event,State] "akka.persistence.typed.scaladsl.Effect")[`persist`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/javadsl/EffectFactories.html#persist(Event) "akka.persistence.typed.javadsl.EffectFactories") effect.

Some journals may not support atomic writes of several events and they will then reject the `persist` with multiple events. This is signalled to an [`EventSourcedBehavior`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/javadsl/EventSourcedBehavior.html "akka.persistence.typed.javadsl.EventSourcedBehavior")[`EventSourcedBehavior`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/scaladsl/EventSourcedBehavior.html "akka.persistence.typed.scaladsl.EventSourcedBehavior") via an [`PersistRejected`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/PersistRejected.html "akka.persistence.typed.PersistRejected")[`PersistRejected`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/PersistRejected.html "akka.persistence.typed.PersistRejected") signal. An [`EventRejectedException`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/EventRejectedException.html "akka.persistence.typed.EventRejectedException")[`EventRejectedException`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/EventRejectedException.html "akka.persistence.typed.EventRejectedException") is also thrown (typically with a [`UnsupportedOperationException`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/UnsupportedOperationException.html "java.lang.UnsupportedOperationException")) and can be handled with a [supervisor](fault-tolerance.html).

## Cluster Sharding and EventSourcedBehavior

[Cluster Sharding](cluster-sharding.html) is an excellent fit to spread persistent actors over a cluster, addressing them by id. It makes it possible to have more persistent actors exist in the cluster than what would fit in the memory of one node. Cluster sharding improves the resilience of the cluster. If a node crashes, the persistent actors are quickly started on a new node and can resume operations.

The [`EventSourcedBehavior`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/javadsl/EventSourcedBehavior.html "akka.persistence.typed.javadsl.EventSourcedBehavior")[`EventSourcedBehavior`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/scaladsl/EventSourcedBehavior.html "akka.persistence.typed.scaladsl.EventSourcedBehavior") can then be run as with any plain actor as described in [actors documentation](actors.html), but since Akka Persistence is based on the single\-writer principle the persistent actors are typically used together with Cluster Sharding. For a particular `persistenceId` only one persistent actor instance should be active at one time. If multiple instances were to persist events at the same time, the events would be interleaved and might not be interpreted correctly on replay. Cluster Sharding ensures that there is only one active entity for each id. The [Cluster Sharding example](cluster-sharding.html#persistence-example) illustrates this common combination.

## Accessing the ActorContext

If the [`EventSourcedBehavior`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/javadsl/EventSourcedBehavior.html "akka.persistence.typed.javadsl.EventSourcedBehavior")[`EventSourcedBehavior`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/scaladsl/EventSourcedBehavior.html "akka.persistence.typed.scaladsl.EventSourcedBehavior") needs to use the [`ActorContext`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/javadsl/ActorContext.html "akka.actor.typed.javadsl.ActorContext")[`ActorContext`](https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/scaladsl/ActorContext.html "akka.actor.typed.scaladsl.ActorContext"), for example to spawn child actors, it can be obtained by wrapping construction with [`Behaviors.setup`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/javadsl/Behaviors.html#setup(akka.japi.function.Function) "akka.actor.typed.javadsl.Behaviors")[`Behaviors.setup`](https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/scaladsl/Behaviors$.html#setup[T](factory:akka.actor.typed.scaladsl.ActorContext[T]=%3Eakka.actor.typed.Behavior[T]):akka.actor.typed.Behavior[T] "akka.actor.typed.scaladsl.Behaviors"):

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence-typed/src/test/scala/docs/akka/persistence/typed/BasicPersistentBehaviorCompileOnly.scala#L217-L232 "Go to snippet source")import akka.persistence.typed.scaladsl.Effect
import akka.persistence.typed.scaladsl.EventSourcedBehavior.CommandHandler

def apply(): Behavior[String] =
  Behaviors.setup { context =>
    EventSourcedBehavior[String, String, State](
      persistenceId = PersistenceId.ofUniqueId("myPersistenceId"),
      emptyState = State(),
      commandHandler = CommandHandler.command { cmd =>
        context.log.info("Got command {}", cmd)
        Effect.none
      },
      eventHandler = {
        case (state, _) => state
      })
  }
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence-typed/src/test/java/jdocs/akka/persistence/typed/BasicPersistentBehaviorTest.java#L596-L640 "Go to snippet source")public class MyPersistentBehavior
    extends EventSourcedBehavior<
        MyPersistentBehavior.Command, MyPersistentBehavior.Event, MyPersistentBehavior.State> {

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

After processing a message, actors are able to return the [`Behavior`](https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/Behavior.html "akka.actor.typed.Behavior")[`Behavior`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/Behavior.html "akka.actor.typed.Behavior") that is used for the next message.

As you can see in the above examples this is not supported by persistent actors. Instead, the state is returned by `eventHandler`. The reason a new behavior can’t be returned is that behavior is part of the actor’s state and must also carefully be reconstructed during recovery. If it would have been supported it would mean that the behavior must be restored when replaying events and also encoded in the state anyway when snapshots are used. That would be very prone to mistakes and thus not allowed in Akka Persistence.

For basic actors you can use the same set of command handlers independent of what state the entity is in, as shown in above example. For more complex actors it’s useful to be able to change the behavior in the sense that different functions for processing commands may be defined depending on what state the actor is in. This is useful when implementing finite state machine (FSM) like entities.

The next example demonstrates how to define different behavior based on the current `State`. It shows an actor that represents the state of a blog post. Before a post is started the only command it can process is to `AddPost`. Once it is started then one can look it up with `GetPost`, modify it with `ChangeBody` or publish it with `Publish`.

The state is captured by:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence-typed/src/test/scala/docs/akka/persistence/typed/BlogPostEntity.scala#L31-L44 "Go to snippet source")sealed trait State

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
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence-typed/src/test/java/jdocs/akka/persistence/typed/BlogPostEntity.java#L55-L99 "Go to snippet source")interface State {}

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
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence-typed/src/test/scala/docs/akka/persistence/typed/BlogPostEntity.scala#L48-L56 "Go to snippet source")sealed trait Command
final case class AddPost(content: PostContent, replyTo: ActorRef[StatusReply[AddPostDone]]) extends Command
final case class AddPostDone(postId: String)
final case class GetPost(replyTo: ActorRef[PostContent]) extends Command
final case class ChangeBody(newBody: String, replyTo: ActorRef[Done]) extends Command
final case class Publish(replyTo: ActorRef[Done]) extends Command
final case class PostContent(postId: String, title: String, body: String)
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence-typed/src/test/java/jdocs/akka/persistence/typed/BlogPostEntity.java#L103-L159 "Go to snippet source")public interface Command {}
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

The command handler to process each command is decided by the state class (or state predicate) that is given to the `forStateType` of the [`CommandHandlerBuilder`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/javadsl/CommandHandlerBuilder.html "akka.persistence.typed.javadsl.CommandHandlerBuilder") and the match cases in the builders. The command handler to process each command is decided by first looking at the state and then the command. It typically becomes two levels of pattern matching, first on the state and then on the command. Delegating to methods is a good practice because the one\-line cases give a nice overview of the message dispatch.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence-typed/src/test/scala/docs/akka/persistence/typed/BlogPostEntity.scala#L69-L129 "Go to snippet source")private val commandHandler: (State, Command) => Effect[Event, State] = { (state, command) =>
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
          Effect.unhandled.thenRun(_ => replyTo ! StatusReply.Error("Cannot add post while in draft state"))
      }

    case publishedState: PublishedState =>
      command match {
        case GetPost(replyTo) => getPost(publishedState, replyTo)
        case AddPost(_, replyTo) =>
          Effect.unhandled.thenRun(_ => replyTo ! StatusReply.Error("Cannot add post, already published"))
        case _ => Effect.unhandled
      }
  }
}

private def addPost(cmd: AddPost): Effect[Event, State] = {
  val evt = PostAdded(cmd.content.postId, cmd.content)
  Effect.persist(evt).thenRun { _ =>
    // After persist is done additional side effects can be performed
    cmd.replyTo ! StatusReply.Success(AddPostDone(cmd.content.postId))
  }
}

private def changeBody(state: DraftState, cmd: ChangeBody): Effect[Event, State] = {
  val evt = BodyChanged(state.postId, cmd.newBody)
  Effect.persist(evt).thenRun { _ =>
    cmd.replyTo ! Done
  }
}

private def publish(state: DraftState, replyTo: ActorRef[Done]): Effect[Event, State] = {
  Effect.persist(Published(state.postId)).thenRun { _ =>
    println(s"Blog post ${state.postId} was published")
    replyTo ! Done
  }
}

private def getPost(state: DraftState, replyTo: ActorRef[PostContent]): Effect[Event, State] = {
  replyTo ! state.content
  Effect.none
}

private def getPost(state: PublishedState, replyTo: ActorRef[PostContent]): Effect[Event, State] = {
  replyTo ! state.content
  Effect.none
}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence-typed/src/test/java/jdocs/akka/persistence/typed/BlogPostEntity.java#L183-L242 "Go to snippet source")@Override
public CommandHandler<Command, Event, State> commandHandler() {
  CommandHandlerBuilder<Command, Event, State> builder = newCommandHandlerBuilder();

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

private Effect<Event, State> onAddPost(AddPost cmd) {
  PostAdded event = new PostAdded(cmd.content.postId, cmd.content);
  return Effect()
      .persist(event)
      .thenRun(() -> cmd.replyTo.tell(new AddPostDone(cmd.content.postId)));
}

private Effect<Event, State> onChangeBody(DraftState state, ChangeBody cmd) {
  BodyChanged event = new BodyChanged(state.postId(), cmd.newBody);
  return Effect().persist(event).thenRun(() -> cmd.replyTo.tell(Done.getInstance()));
}

private Effect<Event, State> onChangeBody(PublishedState state, ChangeBody cmd) {
  BodyChanged event = new BodyChanged(state.postId(), cmd.newBody);
  return Effect().persist(event).thenRun(() -> cmd.replyTo.tell(Done.getInstance()));
}

private Effect<Event, State> onPublish(DraftState state, Publish cmd) {
  return Effect()
      .persist(new Published(state.postId()))
      .thenRun(
          () -> {
            System.out.println("Blog post published: " + state.postId());
            cmd.replyTo.tell(Done.getInstance());
          });
}

private Effect<Event, State> onGetPost(DraftState state, GetPost cmd) {
  cmd.replyTo.tell(state.content);
  return Effect().none();
}

private Effect<Event, State> onGetPost(PublishedState state, GetPost cmd) {
  cmd.replyTo.tell(state.content);
  return Effect().none();
}
```

The event handler:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence-typed/src/test/scala/docs/akka/persistence/typed/BlogPostEntity.scala#L133-L159 "Go to snippet source")private val eventHandler: (State, Event) => State = { (state, event) =>
  state match {

    case BlankState =>
      event match {
        case PostAdded(_, content) =>
          DraftState(content)
        case _ => throw new IllegalStateException(s"unexpected event [$event] in state [$state]")
      }

    case draftState: DraftState =>
      event match {

        case BodyChanged(_, newBody) =>
          draftState.withBody(newBody)

        case Published(_) =>
          PublishedState(draftState.content)

        case _ => throw new IllegalStateException(s"unexpected event [$event] in state [$state]")
      }

    case _: PublishedState =>
      // no more changes after published
      throw new IllegalStateException(s"unexpected event [$event] in state [$state]")
  }
}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence-typed/src/test/java/jdocs/akka/persistence/typed/BlogPostEntity.java#L246-L265 "Go to snippet source")@Override
public EventHandler<State, Event> eventHandler() {

  EventHandlerBuilder<State, Event> builder = newEventHandlerBuilder();

  builder
      .forStateType(BlankState.class)
      .onEvent(PostAdded.class, event -> new DraftState(event.content));

  builder
      .forStateType(DraftState.class)
      .onEvent(BodyChanged.class, (state, chg) -> state.withBody(chg.newBody))
      .onEvent(Published.class, (state, event) -> new PublishedState(state.content));

  builder
      .forStateType(PublishedState.class)
      .onEvent(BodyChanged.class, (state, chg) -> state.withBody(chg.newBody));

  return builder.build();
}
```

And finally the behavior is created from the [`EventSourcedBehavior.apply`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/scaladsl/EventSourcedBehavior$.html#apply[Command,Event,State](persistenceId:akka.persistence.typed.PersistenceId,emptyState:State,commandHandler:(State,Command)=%3Eakka.persistence.typed.scaladsl.Effect[Event,State],eventHandler:(State,Event)=%3EState):akka.persistence.typed.scaladsl.EventSourcedBehavior[Command,Event,State] "akka.persistence.typed.scaladsl.EventSourcedBehavior"):

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence-typed/src/test/scala/docs/akka/persistence/typed/BlogPostEntity.scala#L17-L165 "Go to snippet source")object BlogPostEntity {
  // commands, events, state defined here

  def apply(entityId: String, persistenceId: PersistenceId): Behavior[Command] = {
    Behaviors.setup { context =>
      context.log.info("Starting BlogPostEntity {}", entityId)
      EventSourcedBehavior[Command, Event, State](persistenceId, emptyState = BlankState, commandHandler, eventHandler)
    }
  }

  // commandHandler and eventHandler defined here
}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence-typed/src/test/java/jdocs/akka/persistence/typed/BlogPostEntity.java#L15-L270 "Go to snippet source")public class BlogPostEntity
    extends EventSourcedBehavior<
        BlogPostEntity.Command, BlogPostEntity.Event, BlogPostEntity.State> {
  // commands, events and state as in above snippets

  public static Behavior<Command> create(String entityId, PersistenceId persistenceId) {
    return Behaviors.setup(
        context -> {
          context.getLog().info("Starting BlogPostEntity {}", entityId);
          return new BlogPostEntity(persistenceId);
        });
  }

  private BlogPostEntity(PersistenceId persistenceId) {
    super(persistenceId);
  }

  @Override
  public State emptyState() {
    return BlankState.INSTANCE;
  }

  // commandHandler, eventHandler as in above snippets
}
```

This can be taken one or two steps further by defining the event and command handlers in the state class as illustrated in [event handlers in the state](persistence-style.html#event-handlers-in-the-state) and [command handlers in the state](persistence-style.html#command-handlers-in-the-state).

There is also an example illustrating an [optional initial state](persistence-style.html#optional-initial-state).

## Replies

The [Request\-Response interaction pattern](interaction-patterns.html#request-response) is very common for persistent actors, because you typically want to know if the command was rejected due to validation errors and when accepted you want a confirmation when the events have been successfully stored.

Therefore you typically include a [`ActorRef`](https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/ActorRef.html "akka.actor.typed.ActorRef")[`ActorRef`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/ActorRef.html "akka.actor.typed.ActorRef")`[ReplyMessageType]``<ReplyMessageType>`. If the command can either have a successful response or a validation error returned, the generic response type [`StatusReply`](https://doc.akka.io/api/akka-core/2.10/akka/pattern/StatusReply.html "akka.pattern.StatusReply")[`StatusReply`](https://doc.akka.io/japi/akka-core/2.10/akka/pattern/StatusReply.html "akka.pattern.StatusReply")`[ReplyType]` `<ReplyType>` can be used. If the successful reply does not contain a value but is more of an acknowledgement a pre defined [`StatusReply.Ack`](https://doc.akka.io/api/akka-core/2.10/akka/pattern/StatusReply$.html#Ack:akka.pattern.StatusReply[akka.Done] "akka.pattern.StatusReply")[`StatusReply.ack()`](https://doc.akka.io/japi/akka-core/2.10/akka/pattern/StatusReply$.html#ack():akka.pattern.StatusReply[akka.Done] "akka.pattern.StatusReply") of type `StatusReply[Done]``StatusReply<Done>` can be used.

After validation errors or after persisting events, using a [`thenRun`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/javadsl/EffectBuilder.html#thenRun(akka.japi.function.Effect) "akka.persistence.typed.javadsl.EffectBuilder")[`thenRun`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/scaladsl/EffectBuilder.html#thenRun(callback:State=%3EUnit):akka.persistence.typed.scaladsl.EffectBuilder[Event,State] "akka.persistence.typed.scaladsl.EffectBuilder") side effect, the reply message can be sent to the [`ActorRef`](https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/ActorRef.html "akka.actor.typed.ActorRef")[`ActorRef`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/ActorRef.html "akka.actor.typed.ActorRef").

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence-typed/src/test/scala/docs/akka/persistence/typed/BlogPostEntity.scala#L50-L51 "Go to snippet source")final case class AddPost(content: PostContent, replyTo: ActorRef[StatusReply[AddPostDone]]) extends Command
final case class AddPostDone(postId: String)
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence-typed/src/test/java/jdocs/akka/persistence/typed/BlogPostEntity.java#L105-L121 "Go to snippet source")public static class AddPost implements Command {
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
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence-typed/src/test/scala/docs/akka/persistence/typed/BlogPostEntity.scala#L99-L103 "Go to snippet source")val evt = PostAdded(cmd.content.postId, cmd.content)
Effect.persist(evt).thenRun { _ =>
  // After persist is done additional side effects can be performed
  cmd.replyTo ! StatusReply.Success(AddPostDone(cmd.content.postId))
}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence-typed/src/test/java/jdocs/akka/persistence/typed/BlogPostEntity.java#L207-L210 "Go to snippet source")PostAdded event = new PostAdded(cmd.content.postId, cmd.content);
return Effect()
    .persist(event)
    .thenRun(() -> cmd.replyTo.tell(new AddPostDone(cmd.content.postId)));
```

Since this is such a common pattern there is a reply effect for this purpose. It has the nice property that it can be used to enforce that replies are not forgotten when implementing the [`EventSourcedBehavior`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/javadsl/EventSourcedBehavior.html "akka.persistence.typed.javadsl.EventSourcedBehavior")[`EventSourcedBehavior`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/scaladsl/EventSourcedBehavior.html "akka.persistence.typed.scaladsl.EventSourcedBehavior"). If it’s defined with [`EventSourcedBehavior.withEnforcedReplies`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/scaladsl/EventSourcedBehavior$.html#withEnforcedReplies[Command,Event,State](persistenceId:akka.persistence.typed.PersistenceId,emptyState:State,commandHandler:(State,Command)=%3Eakka.persistence.typed.scaladsl.ReplyEffect[Event,State],eventHandler:(State,Event)=%3EState):akka.persistence.typed.scaladsl.EventSourcedBehavior[Command,Event,State] "akka.persistence.typed.scaladsl.EventSourcedBehavior")[`EventSourcedBehaviorWithEnforcedReplies`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/javadsl/EventSourcedBehaviorWithEnforcedReplies.html "akka.persistence.typed.javadsl.EventSourcedBehaviorWithEnforcedReplies") there will be compilation errors if the returned effect isn’t a [`ReplyEffect`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/javadsl/ReplyEffect.html "akka.persistence.typed.javadsl.ReplyEffect")[`ReplyEffect`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/scaladsl/ReplyEffect.html "akka.persistence.typed.scaladsl.ReplyEffect"), which can be created with `Effect.reply``Effect().reply`, `Effect.noReply``Effect().noReply`, `Effect.thenReply``Effect().thenReply`, or `Effect.thenNoReply``Effect().thenNoReply`.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-sharding-typed/src/test/scala/docs/akka/cluster/sharding/typed/AccountExampleWithEventHandlersInState.scala#L94-L96 "Go to snippet source")def apply(accountNumber: String, persistenceId: PersistenceId): Behavior[Command] = {
  EventSourcedBehavior.withEnforcedReplies(persistenceId, EmptyAccount, commandHandler(accountNumber), eventHandler)
}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-sharding-typed/src/test/java/jdocs/akka/cluster/sharding/typed/AccountExampleWithEventHandlersInState.java#L32-L34 "Go to snippet source")public class AccountEntity
    extends EventSourcedBehaviorWithEnforcedReplies<
        AccountEntity.Command, AccountEntity.Event, AccountEntity.Account> {
```

The commands must have a field of [`ActorRef`](https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/ActorRef.html "akka.actor.typed.ActorRef")[`ActorRef`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/ActorRef.html "akka.actor.typed.ActorRef")`[ReplyMessageType]``<ReplyMessageType>` that can then be used to send a reply.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-sharding-typed/src/test/scala/docs/akka/cluster/sharding/typed/AccountExampleWithEventHandlersInState.scala#L32-L37 "Go to snippet source")sealed trait Command extends CborSerializable
final case class Withdraw(amount: BigDecimal, replyTo: ActorRef[StatusReply[Done]]) extends Command
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-sharding-typed/src/test/java/jdocs/akka/cluster/sharding/typed/AccountExampleWithEventHandlersInState.java#L42 "Go to snippet source")interface Command extends CborSerializable {}
```

The [`ReplyEffect`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/javadsl/ReplyEffect.html "akka.persistence.typed.javadsl.ReplyEffect")[`ReplyEffect`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/scaladsl/ReplyEffect.html "akka.persistence.typed.scaladsl.ReplyEffect") is created with `Effect.reply``Effect().reply`, `Effect.noReply``Effect().noReply`, `Effect.thenReply``Effect().thenReply`, or `Effect.thenNoReply``Effect().thenNoReply`.

Note that command handlers are defined with `newCommandHandlerWithReplyBuilder` when using [`EventSourcedBehaviorWithEnforcedReplies`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/javadsl/EventSourcedBehaviorWithEnforcedReplies.html "akka.persistence.typed.javadsl.EventSourcedBehaviorWithEnforcedReplies"), as opposed to `newCommandHandlerBuilder` when using [`EventSourcedBehavior`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/javadsl/EventSourcedBehavior.html "akka.persistence.typed.javadsl.EventSourcedBehavior").

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-sharding-typed/src/test/scala/docs/akka/cluster/sharding/typed/AccountExampleWithEventHandlersInState.scala#L153-L159 "Go to snippet source")private def withdraw(acc: OpenedAccount, cmd: Withdraw): ReplyEffect[Event, Account] = {
  if (acc.canWithdraw(cmd.amount))
    Effect.persist(Withdrawn(cmd.amount)).thenReply(cmd.replyTo)(_ => StatusReply.Ack)
  else
    Effect.reply(cmd.replyTo)(
      StatusReply.Error(s"Insufficient balance ${acc.balance} to be able to withdraw ${cmd.amount}"))
}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-sharding-typed/src/test/java/jdocs/akka/cluster/sharding/typed/AccountExampleWithEventHandlersInState.java#L217-L228 "Go to snippet source")private ReplyEffect<Event, Account> withdraw(OpenedAccount account, Withdraw command) {
  if (!account.canWithdraw(command.amount)) {
    return Effect()
        .reply(
            command.replyTo,
            StatusReply.error("not enough funds to withdraw " + command.amount));
  } else {
    return Effect()
        .persist(new Withdrawn(command.amount))
        .thenReply(command.replyTo, account2 -> StatusReply.ack());
  }
}
```

These effects will send the reply message even when [`EventSourcedBehavior.withEnforcedReplies`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/scaladsl/EventSourcedBehavior$.html#withEnforcedReplies[Command,Event,State](persistenceId:akka.persistence.typed.PersistenceId,emptyState:State,commandHandler:(State,Command)=%3Eakka.persistence.typed.scaladsl.ReplyEffect[Event,State],eventHandler:(State,Event)=%3EState):akka.persistence.typed.scaladsl.EventSourcedBehavior[Command,Event,State] "akka.persistence.typed.scaladsl.EventSourcedBehavior")[`EventSourcedBehaviorWithEnforcedReplies`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/javadsl/EventSourcedBehaviorWithEnforcedReplies.html "akka.persistence.typed.javadsl.EventSourcedBehaviorWithEnforcedReplies") is not used, but then there will be no compilation errors if the reply decision is left out.

Note that the `noReply` is a way of making conscious decision that a reply shouldn’t be sent for a specific command or the reply will be sent later, perhaps after some asynchronous interaction with other actors or services.

It is recommended to use an immutable state class. If the state is mutable, it is important to use the `EventSourcedBehavior.withEnforcedRepliesMutableState` factory method that takes `emptyStateFactory: () => State` parameter to make sure that the state instance is recreated in case of failure restarts.

## Serialization

The same [serialization](../serialization.html) mechanism as for actor messages is also used for persistent actors. When picking a serialization solution for the events you should also consider that it must be possible to read old events when the application has evolved. Strategies for that can be found in the [schema evolution](../persistence-schema-evolution.html).

You need to enable [serialization](../serialization.html) for your commands (messages), events, and state (snapshot). [Serialization with Jackson](../serialization-jackson.html) is a good choice in many cases and our recommendation if you don’t have other preference.

## Recovery

An event sourced actor is automatically recovered on start and on restart by replaying journaled events. New messages sent to the actor during recovery do not interfere with replayed events. They are stashed and received by the [`EventSourcedBehavior`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/javadsl/EventSourcedBehavior.html "akka.persistence.typed.javadsl.EventSourcedBehavior")[`EventSourcedBehavior`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/scaladsl/EventSourcedBehavior.html "akka.persistence.typed.scaladsl.EventSourcedBehavior") after the recovery phase completes.

The number of concurrent recoveries that can be in progress at the same time is limited to not overload the system and the backend data store. When exceeding the limit the actors will wait until other recoveries have been completed. This is configured by:

```
akka.persistence.max-concurrent-recoveries = 50

```

The [event handler](persistence.html#event-handler) is used for updating the state when replaying the journaled events.

It is strongly discouraged to perform side effects in the event handler, so side effects should be performed once recovery has completed as a reaction to the [`RecoveryCompleted`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/RecoveryCompleted.html "akka.persistence.typed.RecoveryCompleted")[`RecoveryCompleted`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/RecoveryCompleted.html "akka.persistence.typed.RecoveryCompleted") signal in the [`receiveSignal`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/scaladsl/EventSourcedBehavior.html#receiveSignal(signalHandler:PartialFunction[(State,akka.actor.typed.Signal),Unit]):akka.persistence.typed.scaladsl.EventSourcedBehavior[Command,Event,State] "akka.persistence.typed.scaladsl.EventSourcedBehavior") handler by overriding [`receiveSignal`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/javadsl/SignalHandlerBuilder.html#onSignal(java.lang.Class,java.util.function.BiConsumer) "akka.persistence.typed.javadsl.SignalHandlerBuilder")

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence-typed/src/test/scala/docs/akka/persistence/typed/BasicPersistentBehaviorCompileOnly.scala#L112-L120 "Go to snippet source")EventSourcedBehavior[Command, Event, State](
  persistenceId = persistenceId,
  emptyState = State(),
  commandHandler = (state, cmd) => throw new NotImplementedError("TODO: process the command & return an Effect"),
  eventHandler = (state, evt) => throw new NotImplementedError("TODO: process the event return the next state"))
  .receiveSignal {
    case (state, RecoveryCompleted) =>
      throw new NotImplementedError("TODO: add some end-of-recovery side-effect here")
  }
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence-typed/src/test/java/jdocs/akka/persistence/typed/BasicPersistentBehaviorTest.java#L332-L342 "Go to snippet source")  
@Override
public SignalHandler<State> signalHandler() {
  return newSignalHandlerBuilder()
      .onSignal(
          RecoveryCompleted.instance(),
          state -> {
            throw new RuntimeException("TODO: add some end-of-recovery side-effect here");
          })
      .build();
}
```

The `RecoveryCompleted` contains the current `State`.

The actor will always receive a `RecoveryCompleted` signal, even if there are no events in the journal and the snapshot store is empty, or if it’s a new persistent actor with a previously unused `PersistenceId`.

[Snapshots](persistence-snapshot.html) can be used for optimizing recovery times.

### Replay filter

There could be cases where event streams are corrupted and multiple writers (i.e. multiple persistent actor instances) journaled different messages with the same sequence number. In such a case, you can configure how you filter replayed messages from multiple writers, upon recovery.

In your configuration, under the `akka.persistence.journal.xxx.replay-filter` section (where `xxx` is your journal plugin id), you can select the replay filter `mode` from one of the following values:

- repair\-by\-discard\-old
- fail
- warn
- off

For example, if you configure the replay filter for leveldb plugin, it looks like this:

```
# The replay filter can detect a corrupt event stream by inspecting
# sequence numbers and writerUuid when replaying events.
akka.persistence.journal.leveldb.replay-filter {
  # What the filter should do when detecting invalid events.
  # Supported values:
  # `repair-by-discard-old` : discard events from old writers,
  #                           warning is logged
  # `fail` : fail the replay, error is logged
  # `warn` : log warning but emit events untouched
  # `off` : disable this feature completely
  mode = repair-by-discard-old
}

```

### Disable recovery

You can also completely disable the recovery of events and snapshots:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence-typed/src/test/scala/docs/akka/persistence/typed/BasicPersistentBehaviorCompileOnly.scala#L127-L132 "Go to snippet source")EventSourcedBehavior[Command, Event, State](
  persistenceId = PersistenceId.ofUniqueId("abc"),
  emptyState = State(),
  commandHandler = (state, cmd) => throw new NotImplementedError("TODO: process the command & return an Effect"),
  eventHandler = (state, evt) => throw new NotImplementedError("TODO: process the event return the next state"))
  .withRecovery(Recovery.disabled)
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence-typed/src/test/java/jdocs/akka/persistence/typed/BasicPersistentBehaviorTest.java#L346-L349 "Go to snippet source")@Override
public Recovery recovery() {
  return Recovery.disabled();
}
```

Please refer to [snapshots](persistence-snapshot.html#snapshots) if you need to disable only the snapshot recovery, or you need to select specific snapshots.

In any case, the highest sequence number will always be recovered so you can keep persisting new events without corrupting your event log.

Warning
Disable of recovery is not normal behavior of an event sourced actor, since events and snapshots are not used for the recovery of the actor.

### Recovery from only last event

For some use cases it is enough to recover the actor from the last event, as an optimization to not replay all events. You can enable this recovery mode with:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence-typed/src/test/scala/docs/akka/persistence/typed/BasicPersistentBehaviorCompileOnly.scala#L139-L144 "Go to snippet source")EventSourcedBehavior[Command, Event, State](
  persistenceId = PersistenceId.ofUniqueId("abc"),
  emptyState = State(),
  commandHandler = (state, cmd) => throw new NotImplementedError("TODO: process the command & return an Effect"),
  eventHandler = (state, evt) => throw new NotImplementedError("TODO: process the event return the next state"))
  .withRecovery(Recovery.replayOnlyLast)
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence-typed/src/test/java/jdocs/akka/persistence/typed/BasicPersistentBehaviorTest.java#L424-L427 "Go to snippet source")@Override
public Recovery recovery() {
  return Recovery.replayOnlyLast();
}
```

Snapshots are not loaded when recovery from last event is selected.

Warning
Recovery from only last event is not normal behavior of an event sourced actor, since it typically would need all events, or a snapshot and events after the snapshot, to recover its state.

This feature is currently only supported by the R2DBC plugin.

## Tagging

Persistence allows you to use event tags without using an [`EventAdapter`](../persistence.html#event-adapters):

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence-typed/src/test/scala/docs/akka/persistence/typed/BasicPersistentBehaviorCompileOnly.scala#L151-L156 "Go to snippet source")EventSourcedBehavior[Command, Event, State](
  persistenceId = PersistenceId.ofUniqueId("abc"),
  emptyState = State(),
  commandHandler = (state, cmd) => throw new NotImplementedError("TODO: process the command & return an Effect"),
  eventHandler = (state, evt) => throw new NotImplementedError("TODO: process the event return the next state"))
  .withTagger(_ => Set("tag1", "tag2"))
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence-typed/src/test/java/jdocs/akka/persistence/typed/BasicPersistentBehaviorTest.java#L353-L359 "Go to snippet source")@Override
public Set<String> tagsFor(Event event) {
  Set<String> tags = new HashSet<>();
  tags.add("tag1");
  tags.add("tag2");
  return tags;
}
```

## Event adapters

Event adapters can be programmatically added to your [`EventSourcedBehavior`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/javadsl/EventSourcedBehavior.html "akka.persistence.typed.javadsl.EventSourcedBehavior")[`EventSourcedBehavior`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/scaladsl/EventSourcedBehavior.html "akka.persistence.typed.scaladsl.EventSourcedBehavior")s that can convert from your `Event` type to another type that is then passed to the journal.

Defining an event adapter is done by extending an EventAdapter:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence-typed/src/test/scala/docs/akka/persistence/typed/BasicPersistentBehaviorCompileOnly.scala#L329-L334 "Go to snippet source")case class Wrapper[T](event: T)
class WrapperEventAdapter[T] extends EventAdapter[T, Wrapper[T]] {
  override def toJournal(e: T): Wrapper[T] = Wrapper(e)
  override def fromJournal(p: Wrapper[T], manifest: String): EventSeq[T] = EventSeq.single(p.event)
  override def manifest(event: T): String = ""
}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence-typed/src/test/java/akka/persistence/typed/javadsl/PersistentActorCompileOnlyTest.java#L26-L55 "Go to snippet source")public static class Wrapper<T> {
  private final T event;

  public Wrapper(T event) {
    this.event = event;
  }

  public T getEvent() {
    return event;
  }
}

public static class EventAdapterExample
    extends EventAdapter<SimpleEvent, Wrapper<SimpleEvent>> {
  @Override
  public Wrapper<SimpleEvent> toJournal(SimpleEvent simpleEvent) {
    return new Wrapper<>(simpleEvent);
  }

  @Override
  public String manifest(SimpleEvent event) {
    return "";
  }

  @Override
  public EventSeq<SimpleEvent> fromJournal(
      Wrapper<SimpleEvent> simpleEventWrapper, String manifest) {
    return EventSeq.single(simpleEventWrapper.getEvent());
  }
}
```

Then install it on an `EventSourcedBehavior`:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence-typed/src/test/scala/docs/akka/persistence/typed/BasicPersistentBehaviorCompileOnly.scala#L338-L343 "Go to snippet source")EventSourcedBehavior[Command, Event, State](
  persistenceId = PersistenceId.ofUniqueId("abc"),
  emptyState = State(),
  commandHandler = (state, cmd) => throw new NotImplementedError("TODO: process the command & return an Effect"),
  eventHandler = (state, evt) => throw new NotImplementedError("TODO: process the event return the next state"))
  .eventAdapter(new WrapperEventAdapter[Event])
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence-typed/src/test/java/akka/persistence/typed/javadsl/PersistentActorCompileOnlyTest.java#L115-L118 "Go to snippet source")@Override
public EventAdapter<SimpleEvent, Wrapper<SimpleEvent>> eventAdapter() {
  return new EventAdapterExample();
}
```

## Wrapping EventSourcedBehavior

When creating an [`EventSourcedBehavior`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/javadsl/EventSourcedBehavior.html "akka.persistence.typed.javadsl.EventSourcedBehavior")[`EventSourcedBehavior`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/scaladsl/EventSourcedBehavior.html "akka.persistence.typed.scaladsl.EventSourcedBehavior"), it is possible to wrap `EventSourcedBehavior` in other behaviors such as [`Behaviors.setup`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/javadsl/Behaviors.html#setup(akka.japi.function.Function) "akka.actor.typed.javadsl.Behaviors")[`Behaviors.setup`](https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/scaladsl/Behaviors$.html#setup[T](factory:akka.actor.typed.scaladsl.ActorContext[T]=%3Eakka.actor.typed.Behavior[T]):akka.actor.typed.Behavior[T] "akka.actor.typed.scaladsl.Behaviors") in order to access the [`ActorContext`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/javadsl/ActorContext.html "akka.actor.typed.javadsl.ActorContext")[`ActorContext`](https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/scaladsl/ActorContext.html "akka.actor.typed.scaladsl.ActorContext") object. For instance to access the actor logging upon taking snapshots for debug purpose.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence-typed/src/test/scala/docs/akka/persistence/typed/BasicPersistentBehaviorCompileOnly.scala#L188-L198 "Go to snippet source")Behaviors.setup[Command] { context =>
  EventSourcedBehavior[Command, Event, State](
    persistenceId = PersistenceId.ofUniqueId("abc"),
    emptyState = State(),
    commandHandler = (state, cmd) => throw new NotImplementedError("TODO: process the command & return an Effect"),
    eventHandler = (state, evt) => throw new NotImplementedError("TODO: process the event return the next state"))
    .snapshotWhen((state, _, _) => {
      context.log.info("Snapshot actor {} => state: {}", context.self.path.name, state)
      true
    })
}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence-typed/src/test/java/jdocs/akka/persistence/typed/BasicPersistentBehaviorTest.java#L369-L438 "Go to snippet source")public class MyPersistentBehavior
    extends EventSourcedBehavior<
        MyPersistentBehavior.Command, MyPersistentBehavior.Event, MyPersistentBehavior.State> {

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
  public boolean shouldSnapshot(State state, Event event, long sequenceNr) {
    context
        .getLog()
        .info("Snapshot actor {} => state: {}", context.getSelf().path().name(), state);
    return true;
  }
}
```

## Journal failures

By default an [`EventSourcedBehavior`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/javadsl/EventSourcedBehavior.html "akka.persistence.typed.javadsl.EventSourcedBehavior")[`EventSourcedBehavior`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/scaladsl/EventSourcedBehavior.html "akka.persistence.typed.scaladsl.EventSourcedBehavior") will stop if an exception is thrown from the journal. It is possible to override this with any [`BackoffSupervisorStrategy`](https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/BackoffSupervisorStrategy.html "akka.actor.typed.BackoffSupervisorStrategy")[`BackoffSupervisorStrategy`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/BackoffSupervisorStrategy.html "akka.actor.typed.BackoffSupervisorStrategy"). It is not possible to use the normal supervision wrapping for this as it isn’t valid to `resume` a behavior on a journal failure as it is not known if the event was persisted.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence-typed/src/test/scala/docs/akka/persistence/typed/BasicPersistentBehaviorCompileOnly.scala#L205-L211 "Go to snippet source")EventSourcedBehavior[Command, Event, State](
  persistenceId = PersistenceId.ofUniqueId("abc"),
  emptyState = State(),
  commandHandler = (state, cmd) => throw new NotImplementedError("TODO: process the command & return an Effect"),
  eventHandler = (state, evt) => throw new NotImplementedError("TODO: process the event return the next state"))
  .onPersistFailure(
    SupervisorStrategy.restartWithBackoff(minBackoff = 10.seconds, maxBackoff = 60.seconds, randomFactor = 0.1))
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence-typed/src/test/java/jdocs/akka/persistence/typed/BasicPersistentBehaviorTest.java#L287-L362 "Go to snippet source")public class MyPersistentBehavior
    extends EventSourcedBehavior<
        MyPersistentBehavior.Command, MyPersistentBehavior.Event, MyPersistentBehavior.State> {

  public static Behavior<Command> create(PersistenceId persistenceId) {
    return new MyPersistentBehavior(persistenceId);
  }

  private MyPersistentBehavior(PersistenceId persistenceId) {
    super(
        persistenceId,
        SupervisorStrategy.restartWithBackoff(
            Duration.ofSeconds(10), Duration.ofSeconds(30), 0.2));
  }

}
```

If there is a problem with recovering the state of the actor from the journal, a [`RecoveryFailed`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/RecoveryFailed.html "akka.persistence.typed.RecoveryFailed")[`RecoveryFailed`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/RecoveryFailed.html "akka.persistence.typed.RecoveryFailed") signal is emitted to the [`receiveSignal`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/scaladsl/EventSourcedBehavior.html#receiveSignal(signalHandler:PartialFunction[(State,akka.actor.typed.Signal),Unit]):akka.persistence.typed.scaladsl.EventSourcedBehavior[Command,Event,State] "akka.persistence.typed.scaladsl.EventSourcedBehavior") handler [`receiveSignal`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/javadsl/SignalHandlerBuilder.html#onSignal(java.lang.Class,java.util.function.BiConsumer) "akka.persistence.typed.javadsl.SignalHandlerBuilder") method and the actor will be stopped (or restarted with backoff).

If there is a problem with persisting an event to the journal, a [`PersistFailed`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/PersistFailed.html "akka.persistence.typed.PersistFailed")[`PersistFailed`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/PersistFailed.html "akka.persistence.typed.PersistFailed") signal is emitted to the [`receiveSignal`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/scaladsl/EventSourcedBehavior.html#receiveSignal(signalHandler:PartialFunction[(State,akka.actor.typed.Signal),Unit]):akka.persistence.typed.scaladsl.EventSourcedBehavior[Command,Event,State] "akka.persistence.typed.scaladsl.EventSourcedBehavior") handler [`receiveSignal`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/javadsl/SignalHandlerBuilder.html#onSignal(java.lang.Class,java.util.function.BiConsumer) "akka.persistence.typed.javadsl.SignalHandlerBuilder") method and the actor will be stopped (or restarted with backoff).

### Journal rejections

Journals can reject events. The difference from a failure is that the journal must decide to reject an event before trying to persist it e.g. because of a serialization exception. If an event is rejected it definitely won’t be in the journal. This is signalled to an [`EventSourcedBehavior`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/javadsl/EventSourcedBehavior.html "akka.persistence.typed.javadsl.EventSourcedBehavior")[`EventSourcedBehavior`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/scaladsl/EventSourcedBehavior.html "akka.persistence.typed.scaladsl.EventSourcedBehavior") via an [`PersistRejected`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/PersistRejected.html "akka.persistence.typed.PersistRejected")[`PersistRejected`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/PersistRejected.html "akka.persistence.typed.PersistRejected") signal. An [`EventRejectedException`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/EventRejectedException.html "akka.persistence.typed.EventRejectedException")[`EventRejectedException`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/EventRejectedException.html "akka.persistence.typed.EventRejectedException") is also thrown and can be handled with a [supervisor](fault-tolerance.html). Not all journal implementations use rejections and treat these kind of problems also as journal failures. 

## Stash

When persisting events with [`persist`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/scaladsl/Effect$.html#persist[Event,State](events:Seq[Event]):akka.persistence.typed.scaladsl.EffectBuilder[Event,State] "akka.persistence.typed.scaladsl.Effect")[`persist`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/javadsl/EffectFactories.html#persist(java.util.List) "akka.persistence.typed.javadsl.EffectFactories") it is guaranteed that the [`EventSourcedBehavior`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/javadsl/EventSourcedBehavior.html "akka.persistence.typed.javadsl.EventSourcedBehavior")[`EventSourcedBehavior`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/scaladsl/EventSourcedBehavior.html "akka.persistence.typed.scaladsl.EventSourcedBehavior") will not receive further commands until after the events have been confirmed to be persisted and additional side effects have been run. Incoming messages are stashed automatically until the `persist` is completed.

Commands are also stashed during recovery and will not interfere with replayed events. Commands will be received when recovery has been completed.

The stashing described above is handled automatically, but there is also a possibility to stash commands when they are received to defer processing of them until later. One example could be waiting for some external condition or interaction to complete before processing additional commands. That is accomplished by returning a [`stash`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/scaladsl/Effect$.html#stash[Event,State]():akka.persistence.typed.scaladsl.ReplyEffect[Event,State] "akka.persistence.typed.scaladsl.Effect")[`stash`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/javadsl/EffectFactories.html#stash() "akka.persistence.typed.javadsl.EffectFactories") effect and later use [`thenUnstashAll`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/javadsl/EffectBuilder.html#thenUnstashAll() "akka.persistence.typed.javadsl.EffectBuilder")[`thenUnstashAll`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/scaladsl/EffectBuilder.html#thenUnstashAll():akka.persistence.typed.scaladsl.Effect[Event,State] "akka.persistence.typed.scaladsl.EffectBuilder").

Let’s use an example of a task manager to illustrate how the stashing effects can be used. It handles three commands; `StartTask`, `NextStep` and `EndTask`. Those commands are associated with a given `taskId` and the manager processes one `taskId` at a time. A task is started when receiving `StartTask`, and continues when receiving `NextStep` commands until the final `EndTask` is received. Commands with another `taskId` than the one in progress are deferred by stashing them. When `EndTask` is processed a new task can start and the stashed commands are processed.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence-typed/src/test/scala/docs/akka/persistence/typed/StashingExample.scala#L18-L83 "Go to snippet source")object TaskManager {

  sealed trait Command
  final case class StartTask(taskId: String) extends Command
  final case class NextStep(taskId: String, instruction: String) extends Command
  final case class EndTask(taskId: String) extends Command

  sealed trait Event
  final case class TaskStarted(taskId: String) extends Event
  final case class TaskStep(taskId: String, instruction: String) extends Event
  final case class TaskCompleted(taskId: String) extends Event

  final case class State(taskIdInProgress: Option[String])

  def apply(persistenceId: PersistenceId): Behavior[Command] =
    EventSourcedBehavior[Command, Event, State](
      persistenceId = persistenceId,
      emptyState = State(None),
      commandHandler = (state, command) => onCommand(state, command),
      eventHandler = (state, event) => applyEvent(state, event))
      .onPersistFailure(SupervisorStrategy.restartWithBackoff(1.second, 30.seconds, 0.2))

  private def onCommand(state: State, command: Command): Effect[Event, State] = {
    state.taskIdInProgress match {
      case None =>
        command match {
          case StartTask(taskId) =>
            Effect.persist(TaskStarted(taskId))
          case _ =>
            Effect.unhandled
        }

      case Some(inProgress) =>
        command match {
          case StartTask(taskId) =>
            if (inProgress == taskId)
              Effect.none // duplicate, already in progress
            else
              // other task in progress, wait with new task until later
              Effect.stash()

          case NextStep(taskId, instruction) =>
            if (inProgress == taskId)
              Effect.persist(TaskStep(taskId, instruction))
            else
              // other task in progress, wait with new task until later
              Effect.stash()

          case EndTask(taskId) =>
            if (inProgress == taskId)
              Effect.persist(TaskCompleted(taskId)).thenUnstashAll() // continue with next task
            else
              // other task in progress, wait with new task until later
              Effect.stash()
        }
    }
  }

  private def applyEvent(state: State, event: Event): State = {
    event match {
      case TaskStarted(taskId) => State(Option(taskId))
      case TaskStep(_, _)      => state
      case TaskCompleted(_)    => State(None)
    }
  }
}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence-typed/src/test/java/jdocs/akka/persistence/typed/StashingExample.java#L20-L154 "Go to snippet source")public class TaskManager
    extends EventSourcedBehavior<TaskManager.Command, TaskManager.Event, TaskManager.State> {

  public interface Command {}

  public static final class StartTask implements Command {
    public final String taskId;

    public StartTask(String taskId) {
      this.taskId = taskId;
    }
  }

  public static final class NextStep implements Command {
    public final String taskId;
    public final String instruction;

    public NextStep(String taskId, String instruction) {
      this.taskId = taskId;
      this.instruction = instruction;
    }
  }

  public static final class EndTask implements Command {
    public final String taskId;

    public EndTask(String taskId) {
      this.taskId = taskId;
    }
  }

  public interface Event {}

  public static final class TaskStarted implements Event {
    public final String taskId;

    public TaskStarted(String taskId) {
      this.taskId = taskId;
    }
  }

  public static final class TaskStep implements Event {
    public final String taskId;
    public final String instruction;

    public TaskStep(String taskId, String instruction) {
      this.taskId = taskId;
      this.instruction = instruction;
    }
  }

  public static final class TaskCompleted implements Event {
    public final String taskId;

    public TaskCompleted(String taskId) {
      this.taskId = taskId;
    }
  }

  public static class State {
    public final Optional<String> taskIdInProgress;

    public State(Optional<String> taskIdInProgress) {
      this.taskIdInProgress = taskIdInProgress;
    }
  }

  public static Behavior<Command> create(PersistenceId persistenceId) {
    return new TaskManager(persistenceId);
  }

  public TaskManager(PersistenceId persistenceId) {
    super(
        persistenceId,
        SupervisorStrategy.restartWithBackoff(
            Duration.ofSeconds(1), Duration.ofSeconds(30), 0.2));
  }

  @Override
  public State emptyState() {
    return new State(Optional.empty());
  }

  @Override
  public CommandHandler<Command, Event, State> commandHandler() {
    return newCommandHandlerBuilder()
        .forAnyState()
        .onCommand(StartTask.class, this::onStartTask)
        .onCommand(NextStep.class, this::onNextStep)
        .onCommand(EndTask.class, this::onEndTask)
        .build();
  }

  private Effect<Event, State> onStartTask(State state, StartTask command) {
    if (state.taskIdInProgress.isPresent()) {
      if (state.taskIdInProgress.get().equals(command.taskId))
        return Effect().none(); // duplicate, already in progress
      else return Effect().stash(); // other task in progress, wait with new task until later
    } else {
      return Effect().persist(new TaskStarted(command.taskId));
    }
  }

  private Effect<Event, State> onNextStep(State state, NextStep command) {
    if (state.taskIdInProgress.isPresent()) {
      if (state.taskIdInProgress.get().equals(command.taskId))
        return Effect().persist(new TaskStep(command.taskId, command.instruction));
      else return Effect().stash(); // other task in progress, wait with new task until later
    } else {
      return Effect().unhandled();
    }
  }

  private Effect<Event, State> onEndTask(State state, EndTask command) {
    if (state.taskIdInProgress.isPresent()) {
      if (state.taskIdInProgress.get().equals(command.taskId))
        return Effect()
            .persist(new TaskCompleted(command.taskId))
            .thenUnstashAll(); // continue with next task
      else return Effect().stash(); // other task in progress, wait with new task until later
    } else {
      return Effect().unhandled();
    }
  }

  @Override
  public EventHandler<State, Event> eventHandler() {
    return newEventHandlerBuilder()
        .forAnyState()
        .onEvent(TaskStarted.class, (state, event) -> new State(Optional.of(event.taskId)))
        .onEvent(TaskStep.class, (state, event) -> state)
        .onEvent(TaskCompleted.class, (state, event) -> new State(Optional.empty()))
        .build();
  }
}
```

You should be careful to not send more messages to a persistent actor than it can keep up with, otherwise the stash buffer will fill up and when reaching its maximum capacity the commands will be dropped. The capacity can be configured with:

```
akka.persistence.typed.stash-capacity = 10000

```

To override the global config from above, use the following api to define a custom stash buffer capacity per entity:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence-typed/src/test/scala/docs/akka/persistence/typed/BasicPersistentBehaviorCompileOnly.scala#L346 "Go to snippet source").withStashCapacity(100)
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence-typed/src/test/java/jdocs/akka/persistence/typed/BasicPersistentBehaviorTest.java#L417-L420 "Go to snippet source")@Override
public Optional<Integer> stashCapacity() {
  return Optional.of(100);
}
```

Note that the stashed commands are kept in an in\-memory buffer, so in case of a crash they will not be processed.

- Stashed commands are discarded in case the actor (entity) is passivated or rebalanced by Cluster Sharding.
- Stashed commands are discarded in case the actor is restarted (or stopped) due to a thrown exception while processing a command or side effect after persisting.
- Stashed commands are preserved and processed later in case of a failure while storing events but only if an `onPersistFailure` backoff supervisor strategy is defined.

It’s allowed to stash messages while unstashing. Those newly added commands will not be processed by the [`unstashAll`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/scaladsl/Effect$.html#unstashAll[Event,State]():akka.persistence.typed.scaladsl.Effect[Event,State] "akka.persistence.typed.scaladsl.Effect")[`unstashAll`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/javadsl/EffectFactories.html#unstashAll() "akka.persistence.typed.javadsl.EffectFactories") effect that was in progress and have to be unstashed by another `unstashAll`.

## Scaling out

In a use case where the number of persistent actors needed is higher than what would fit in the memory of one node or where resilience is important so that if a node crashes the persistent actors are quickly started on a new node and can resume operations [Cluster Sharding](cluster-sharding.html) is an excellent fit to spread persistent actors over a cluster and address them by id.

Akka Persistence is based on the single\-writer principle. For a particular [`PersistenceId`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/PersistenceId.html "akka.persistence.typed.PersistenceId")[`PersistenceId`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/PersistenceId.html "akka.persistence.typed.PersistenceId") only one [`EventSourcedBehavior`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/javadsl/EventSourcedBehavior.html "akka.persistence.typed.javadsl.EventSourcedBehavior")[`EventSourcedBehavior`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/scaladsl/EventSourcedBehavior.html "akka.persistence.typed.scaladsl.EventSourcedBehavior") instance should be active at one time. If multiple instances were to persist events at the same time, the events would be interleaved and might not be interpreted correctly on replay. Cluster Sharding ensures that there is only one active entity (`EventSourcedBehavior`) for each id within the cluster. [Replicated Event Sourcing](replicated-eventsourcing.html) supports active\-active persistent entities.

## Configuration

There are several configuration properties for the persistence module, please refer to the [reference configuration](../general/configuration-reference.html#config-akka-persistence).

The [journal and snapshot store plugins](../persistence-plugins.html) have specific configuration, see reference documentation of the chosen plugin.

## Example project

The [Microservices with Akka tutorial](https://doc.akka.io/libraries/guide/microservices-tutorial/) contains a Shopping Cart sample illustrating how to use Event Sourcing and Projections together. The events are consumed by even processors to build other representations from the events, or publish the events to other services.

The [Akka Distributed Cluster Guide](https://doc.akka.io/libraries/akka-distributed-cluster/current/guide/3-active-active.html) illustrates how to use [Replicated Event Sourcing](replicated-eventsourcing.html) that supports active\-active persistent entities.

## Code Examples

### Example 1: Module info

```scala
val AkkaVersion = "2.10.17"
libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-persistence-typed" % AkkaVersion,
  "com.typesafe.akka" %% "akka-persistence-testkit" % AkkaVersion % Test
)
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
    <artifactId>akka-persistence-typed_${scala.binary.version}</artifactId>
  </dependency&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-persistence-testkit_${scala.binary.version}</artifactId>
    <scope>test</scope>
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

  implementation "com.typesafe.akka:akka-persistence-typed_${versions.ScalaBinary}"
  testImplementation "com.typesafe.akka:akka-persistence-testkit_${versions.ScalaBinary}"
}
```

### Example 4: Example and core API

```scala
import akka.persistence.typed.scaladsl.EventSourcedBehavior
import akka.persistence.typed.PersistenceId

object MyPersistentBehavior {
  sealed trait Command
  sealed trait Event
  final case class State()

  def apply(): Behavior[Command] =
    EventSourcedBehavior[Command, Event, State](
      persistenceId = PersistenceId.ofUniqueId("abc"),
      emptyState = State(),
      commandHandler = (state, cmd) => throw new NotImplementedError("TODO: process the command & return an Effect"),
      eventHandler = (state, evt) => throw new NotImplementedError("TODO: process the event return the next state"))
}
```

### Example 5: Example and core API

```java
public class MyPersistentBehavior
    extends EventSourcedBehavior<
        MyPersistentBehavior.Command, MyPersistentBehavior.Event, MyPersistentBehavior.State> {

  interface Command {}

  interface Event {}

  public static class State {}

  public static Behavior<Command> create(PersistenceId persistenceId) {
    return new MyPersistentBehavior(persistenceId);
  }

  private MyPersistentBehavior(PersistenceId persistenceId) {
    super(persistenceId);
  }

  @Override
  public State emptyState() {
    return new State();
  }

  @Override
  public CommandHandler<Command, Event, State> commandHandler() {
    return (state, command) -> {
      throw new RuntimeException("TODO: process the command & return an Effect");
    };
  }

  @Override
  public EventHandler<State, Event> eventHandler() {
    return (state, event) -> {
      throw new RuntimeException("TODO: process the event return the next state");
    };
  }
}
```

### Example 6: Completing the example

```scala
sealed trait Command
final case class Add(data: String) extends Command
case object Clear extends Command

sealed trait Event
final case class Added(data: String) extends Event
case object Cleared extends Event
```

### Example 7: Completing the example

```java
interface Command {}

public static class Add implements Command {
  public final String data;

  public Add(String data) {
    this.data = data;
  }
}

public enum Clear implements Command {
  INSTANCE
}

interface Event {}

public static class Added implements Event {
  public final String data;

  public Added(String data) {
    this.data = data;
  }
}

public enum Cleared implements Event {
  INSTANCE
}
```

### Example 8: Completing the example

```scala
final case class State(history: List[String] = Nil)
```

### Example 9: Completing the example

```java
public static class State {
  private final List<String> items;

  private State(List<String> items) {
    this.items = items;
  }

  public State() {
    this.items = new ArrayList<>();
  }

  public State addItem(String data) {
    List<String> newItems = new ArrayList<>(items);
    newItems.add(0, data);
    // keep 5 items
    List<String> latest = newItems.subList(0, Math.min(5, newItems.size()));
    return new State(latest);
  }
}
```

### Example 10: Completing the example

```scala
import akka.persistence.typed.scaladsl.Effect

val commandHandler: (State, Command) => Effect[Event, State] = { (state, command) =>
  command match {
    case Add(data) => Effect.persist(Added(data))
    case Clear     => Effect.persist(Cleared)
  }
}
```

### Example 11: Completing the example

```java
@Override
public CommandHandler<Command, Event, State> commandHandler() {
  return newCommandHandlerBuilder()
      .forAnyState()
      .onCommand(Add.class, command -> Effect().persist(new Added(command.data)))
      .onCommand(Clear.class, command -> Effect().persist(Cleared.INSTANCE))
      .build();
}
```

### Example 12: Completing the example

```scala
val eventHandler: (State, Event) => State = { (state, event) =>
  event match {
    case Added(data) => state.copy((data :: state.history).take(5))
    case Cleared     => State(Nil)
  }
}
```

### Example 13: Completing the example

```java
@Override
public EventHandler<State, Event> eventHandler() {
  return newEventHandlerBuilder()
      .forAnyState()
      .onEvent(Added.class, (state, event) -> state.addItem(event.data))
      .onEvent(Cleared.class, () -> new State())
      .build();
}
```

### Example 14: Completing the example

```scala
import akka.persistence.typed.scaladsl.EventSourcedBehavior
import akka.persistence.typed.PersistenceId

def apply(id: String): Behavior[Command] =
  EventSourcedBehavior[Command, Event, State](
    persistenceId = PersistenceId.ofUniqueId(id),
    emptyState = State(Nil),
    commandHandler = commandHandler,
    eventHandler = eventHandler)
```

### Example 15: Completing the example

```java
import akka.persistence.typed.javadsl.EventSourcedBehavior;
import akka.persistence.typed.PersistenceId;

public class MyPersistentBehavior
    extends EventSourcedBehavior<
        MyPersistentBehavior.Command, MyPersistentBehavior.Event, MyPersistentBehavior.State> {

  // commands, events and state defined here

  public static Behavior<Command> create(PersistenceId persistenceId) {
    return new MyPersistentBehavior(persistenceId);
  }

  private MyPersistentBehavior(PersistenceId persistenceId) {
    super(persistenceId);
  }

  @Override
  public State emptyState() {
    return new State();
  }

  @Override
  public CommandHandler<Command, Event, State> commandHandler() {
    return newCommandHandlerBuilder()
        .forAnyState()
        .onCommand(Add.class, command -> Effect().persist(new Added(command.data)))
        .onCommand(Clear.class, command -> Effect().persist(Cleared.INSTANCE))
        .build();
  }

  @Override
  public EventHandler<State, Event> eventHandler() {
    return newEventHandlerBuilder()
        .forAnyState()
        .onEvent(Added.class, (state, event) -> state.addItem(event.data))
        .onEvent(Cleared.class, () -> new State())
        .build();
  }
}
```

### Example 16: Effects and Side Effects

```scala
def onCommand(subscriber: ActorRef[State], state: State, command: Command): Effect[Event, State] = {
  command match {
    case Add(data) =>
      Effect.persist(Added(data)).thenRun(newState => subscriber ! newState)
    case Clear =>
      Effect.persist(Cleared).thenRun((newState: State) => subscriber ! newState).thenStop()
  }
}
```

### Example 17: Effects and Side Effects

```java
private final ActorRef<State> subscriber;

@Override
public CommandHandler<Command, Event, State> commandHandler() {
  return newCommandHandlerBuilder()
      .forAnyState()
      .onCommand(Add.class, this::onAdd)
      .onCommand(Clear.class, this::onClear)
      .build();
}

private Effect<Event, State> onAdd(Add command) {
  return Effect()
      .persist(new Added(command.data))
      .thenRun(newState -> subscriber.tell(newState));
}

private Effect<Event, State> onClear(Clear command) {
  return Effect()
      .persist(Cleared.INSTANCE)
      .thenRun(newState -> subscriber.tell(newState))
      .thenStop();
}
```

### Example 18: Effects and Side Effects

```scala
// Example factoring out a chained effect to use in several places with `thenRun`
val commonChainedEffects: Mood => Unit = _ => println("Command processed")
// Then in a command handler:
Effect
  .persist(Remembered("Yep")) // persist event
  .thenRun(commonChainedEffects) // add on common chained effect
```

### Example 19: Effects and Side Effects

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

### Example 20: Accessing the ActorContext

```scala
import akka.persistence.typed.scaladsl.Effect
import akka.persistence.typed.scaladsl.EventSourcedBehavior.CommandHandler

def apply(): Behavior[String] =
  Behaviors.setup { context =>
    EventSourcedBehavior[String, String, State](
      persistenceId = PersistenceId.ofUniqueId("myPersistenceId"),
      emptyState = State(),
      commandHandler = CommandHandler.command { cmd =>
        context.log.info("Got command {}", cmd)
        Effect.none
      },
      eventHandler = {
        case (state, _) => state
      })
  }
```

### Example 21: Accessing the ActorContext

```java
public class MyPersistentBehavior
    extends EventSourcedBehavior<
        MyPersistentBehavior.Command, MyPersistentBehavior.Event, MyPersistentBehavior.State> {

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

### Example 22: Changing Behavior

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

### Example 23: Changing Behavior

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

### Example 24: Changing Behavior

```scala
sealed trait Command
final case class AddPost(content: PostContent, replyTo: ActorRef[StatusReply[AddPostDone]]) extends Command
final case class AddPostDone(postId: String)
final case class GetPost(replyTo: ActorRef[PostContent]) extends Command
final case class ChangeBody(newBody: String, replyTo: ActorRef[Done]) extends Command
final case class Publish(replyTo: ActorRef[Done]) extends Command
final case class PostContent(postId: String, title: String, body: String)
```

### Example 25: Changing Behavior

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

### Example 26: Changing Behavior

```scala
private val commandHandler: (State, Command) => Effect[Event, State] = { (state, command) =>
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
          Effect.unhandled.thenRun(_ => replyTo ! StatusReply.Error("Cannot add post while in draft state"))
      }

    case publishedState: PublishedState =>
      command match {
        case GetPost(replyTo) => getPost(publishedState, replyTo)
        case AddPost(_, replyTo) =>
          Effect.unhandled.thenRun(_ => replyTo ! StatusReply.Error("Cannot add post, already published"))
        case _ => Effect.unhandled
      }
  }
}

private def addPost(cmd: AddPost): Effect[Event, State] = {
  val evt = PostAdded(cmd.content.postId, cmd.content)
  Effect.persist(evt).thenRun { _ =>
    // After persist is done additional side effects can be performed
    cmd.replyTo ! StatusReply.Success(AddPostDone(cmd.content.postId))
  }
}

private def changeBody(state: DraftState, cmd: ChangeBody): Effect[Event, State] = {
  val evt = BodyChanged(state.postId, cmd.newBody)
  Effect.persist(evt).thenRun { _ =>
    cmd.replyTo ! Done
  }
}

private def publish(state: DraftState, replyTo: ActorRef[Done]): Effect[Event, State] = {
  Effect.persist(Published(state.postId)).thenRun { _ =>
    println(s"Blog post ${state.postId} was published")
    replyTo ! Done
  }
}

private def getPost(state: DraftState, replyTo: ActorRef[PostContent]): Effect[Event, State] = {
  replyTo ! state.content
  Effect.none
}

private def getPost(state: PublishedState, replyTo: ActorRef[PostContent]): Effect[Event, State] = {
  replyTo ! state.content
  Effect.none
}
```

### Example 27: Changing Behavior

```java
@Override
public CommandHandler<Command, Event, State> commandHandler() {
  CommandHandlerBuilder<Command, Event, State> builder = newCommandHandlerBuilder();

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

private Effect<Event, State> onAddPost(AddPost cmd) {
  PostAdded event = new PostAdded(cmd.content.postId, cmd.content);
  return Effect()
      .persist(event)
      .thenRun(() -> cmd.replyTo.tell(new AddPostDone(cmd.content.postId)));
}

private Effect<Event, State> onChangeBody(DraftState state, ChangeBody cmd) {
  BodyChanged event = new BodyChanged(state.postId(), cmd.newBody);
  return Effect().persist(event).thenRun(() -> cmd.replyTo.tell(Done.getInstance()));
}

private Effect<Event, State> onChangeBody(PublishedState state, ChangeBody cmd) {
  BodyChanged event = new BodyChanged(state.postId(), cmd.newBody);
  return Effect().persist(event).thenRun(() -> cmd.replyTo.tell(Done.getInstance()));
}

private Effect<Event, State> onPublish(DraftState state, Publish cmd) {
  return Effect()
      .persist(new Published(state.postId()))
      .thenRun(
          () -> {
            System.out.println("Blog post published: " + state.postId());
            cmd.replyTo.tell(Done.getInstance());
          });
}

private Effect<Event, State> onGetPost(DraftState state, GetPost cmd) {
  cmd.replyTo.tell(state.content);
  return Effect().none();
}

private Effect<Event, State> onGetPost(PublishedState state, GetPost cmd) {
  cmd.replyTo.tell(state.content);
  return Effect().none();
}
```

### Example 28: Changing Behavior

```scala
private val eventHandler: (State, Event) => State = { (state, event) =>
  state match {

    case BlankState =>
      event match {
        case PostAdded(_, content) =>
          DraftState(content)
        case _ => throw new IllegalStateException(s"unexpected event [$event] in state [$state]")
      }

    case draftState: DraftState =>
      event match {

        case BodyChanged(_, newBody) =>
          draftState.withBody(newBody)

        case Published(_) =>
          PublishedState(draftState.content)

        case _ => throw new IllegalStateException(s"unexpected event [$event] in state [$state]")
      }

    case _: PublishedState =>
      // no more changes after published
      throw new IllegalStateException(s"unexpected event [$event] in state [$state]")
  }
}
```

### Example 29: Changing Behavior

```java
@Override
public EventHandler<State, Event> eventHandler() {

  EventHandlerBuilder<State, Event> builder = newEventHandlerBuilder();

  builder
      .forStateType(BlankState.class)
      .onEvent(PostAdded.class, event -> new DraftState(event.content));

  builder
      .forStateType(DraftState.class)
      .onEvent(BodyChanged.class, (state, chg) -> state.withBody(chg.newBody))
      .onEvent(Published.class, (state, event) -> new PublishedState(state.content));

  builder
      .forStateType(PublishedState.class)
      .onEvent(BodyChanged.class, (state, chg) -> state.withBody(chg.newBody));

  return builder.build();
}
```

### Example 30: Changing Behavior

```scala
object BlogPostEntity {
  // commands, events, state defined here

  def apply(entityId: String, persistenceId: PersistenceId): Behavior[Command] = {
    Behaviors.setup { context =>
      context.log.info("Starting BlogPostEntity {}", entityId)
      EventSourcedBehavior[Command, Event, State](persistenceId, emptyState = BlankState, commandHandler, eventHandler)
    }
  }

  // commandHandler and eventHandler defined here
}
```

### Example 31: Changing Behavior

```java
public class BlogPostEntity
    extends EventSourcedBehavior<
        BlogPostEntity.Command, BlogPostEntity.Event, BlogPostEntity.State> {
  // commands, events and state as in above snippets

  public static Behavior<Command> create(String entityId, PersistenceId persistenceId) {
    return Behaviors.setup(
        context -> {
          context.getLog().info("Starting BlogPostEntity {}", entityId);
          return new BlogPostEntity(persistenceId);
        });
  }

  private BlogPostEntity(PersistenceId persistenceId) {
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
val evt = PostAdded(cmd.content.postId, cmd.content)
Effect.persist(evt).thenRun { _ =>
  // After persist is done additional side effects can be performed
  cmd.replyTo ! StatusReply.Success(AddPostDone(cmd.content.postId))
}
```

### Example 35: Replies

```java
PostAdded event = new PostAdded(cmd.content.postId, cmd.content);
return Effect()
    .persist(event)
    .thenRun(() -> cmd.replyTo.tell(new AddPostDone(cmd.content.postId)));
```

### Example 36: Replies

```scala
def apply(accountNumber: String, persistenceId: PersistenceId): Behavior[Command] = {
  EventSourcedBehavior.withEnforcedReplies(persistenceId, EmptyAccount, commandHandler(accountNumber), eventHandler)
}
```

### Example 37: Replies

```java
public class AccountEntity
    extends EventSourcedBehaviorWithEnforcedReplies<
        AccountEntity.Command, AccountEntity.Event, AccountEntity.Account> {
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
private def withdraw(acc: OpenedAccount, cmd: Withdraw): ReplyEffect[Event, Account] = {
  if (acc.canWithdraw(cmd.amount))
    Effect.persist(Withdrawn(cmd.amount)).thenReply(cmd.replyTo)(_ => StatusReply.Ack)
  else
    Effect.reply(cmd.replyTo)(
      StatusReply.Error(s"Insufficient balance ${acc.balance} to be able to withdraw ${cmd.amount}"))
}
```

### Example 41: Replies

```java
private ReplyEffect<Event, Account> withdraw(OpenedAccount account, Withdraw command) {
  if (!account.canWithdraw(command.amount)) {
    return Effect()
        .reply(
            command.replyTo,
            StatusReply.error("not enough funds to withdraw " + command.amount));
  } else {
    return Effect()
        .persist(new Withdrawn(command.amount))
        .thenReply(command.replyTo, account2 -> StatusReply.ack());
  }
}
```

### Example 42: Recovery

```text
akka.persistence.max-concurrent-recoveries = 50
```

### Example 43: Recovery

```scala
EventSourcedBehavior[Command, Event, State](
  persistenceId = persistenceId,
  emptyState = State(),
  commandHandler = (state, cmd) => throw new NotImplementedError("TODO: process the command & return an Effect"),
  eventHandler = (state, evt) => throw new NotImplementedError("TODO: process the event return the next state"))
  .receiveSignal {
    case (state, RecoveryCompleted) =>
      throw new NotImplementedError("TODO: add some end-of-recovery side-effect here")
  }
```

### Example 44: Recovery

```java
@Override
public SignalHandler<State> signalHandler() {
  return newSignalHandlerBuilder()
      .onSignal(
          RecoveryCompleted.instance(),
          state -> {
            throw new RuntimeException("TODO: add some end-of-recovery side-effect here");
          })
      .build();
}
```

### Example 45: Replay filter

```text
# The replay filter can detect a corrupt event stream by inspecting
# sequence numbers and writerUuid when replaying events.
akka.persistence.journal.leveldb.replay-filter {
  # What the filter should do when detecting invalid events.
  # Supported values:
  # `repair-by-discard-old` : discard events from old writers,
  #                           warning is logged
  # `fail` : fail the replay, error is logged
  # `warn` : log warning but emit events untouched
  # `off` : disable this feature completely
  mode = repair-by-discard-old
}
```

### Example 46: Disable recovery

```scala
EventSourcedBehavior[Command, Event, State](
  persistenceId = PersistenceId.ofUniqueId("abc"),
  emptyState = State(),
  commandHandler = (state, cmd) => throw new NotImplementedError("TODO: process the command & return an Effect"),
  eventHandler = (state, evt) => throw new NotImplementedError("TODO: process the event return the next state"))
  .withRecovery(Recovery.disabled)
```

### Example 47: Disable recovery

```java
@Override
public Recovery recovery() {
  return Recovery.disabled();
}
```

### Example 48: Recovery from only last event

```scala
EventSourcedBehavior[Command, Event, State](
  persistenceId = PersistenceId.ofUniqueId("abc"),
  emptyState = State(),
  commandHandler = (state, cmd) => throw new NotImplementedError("TODO: process the command & return an Effect"),
  eventHandler = (state, evt) => throw new NotImplementedError("TODO: process the event return the next state"))
  .withRecovery(Recovery.replayOnlyLast)
```

### Example 49: Recovery from only last event

```java
@Override
public Recovery recovery() {
  return Recovery.replayOnlyLast();
}
```

### Example 50: Tagging

```scala
EventSourcedBehavior[Command, Event, State](
  persistenceId = PersistenceId.ofUniqueId("abc"),
  emptyState = State(),
  commandHandler = (state, cmd) => throw new NotImplementedError("TODO: process the command & return an Effect"),
  eventHandler = (state, evt) => throw new NotImplementedError("TODO: process the event return the next state"))
  .withTagger(_ => Set("tag1", "tag2"))
```

### Example 51: Tagging

```java
@Override
public Set<String> tagsFor(Event event) {
  Set<String> tags = new HashSet<>();
  tags.add("tag1");
  tags.add("tag2");
  return tags;
}
```

### Example 52: Event adapters

```scala
case class Wrapper[T](event: T)
class WrapperEventAdapter[T] extends EventAdapter[T, Wrapper[T]] {
  override def toJournal(e: T): Wrapper[T] = Wrapper(e)
  override def fromJournal(p: Wrapper[T], manifest: String): EventSeq[T] = EventSeq.single(p.event)
  override def manifest(event: T): String = ""
}
```

### Example 53: Event adapters

```java
public static class Wrapper<T> {
  private final T event;

  public Wrapper(T event) {
    this.event = event;
  }

  public T getEvent() {
    return event;
  }
}

public static class EventAdapterExample
    extends EventAdapter<SimpleEvent, Wrapper<SimpleEvent>> {
  @Override
  public Wrapper<SimpleEvent> toJournal(SimpleEvent simpleEvent) {
    return new Wrapper<>(simpleEvent);
  }

  @Override
  public String manifest(SimpleEvent event) {
    return "";
  }

  @Override
  public EventSeq<SimpleEvent> fromJournal(
      Wrapper<SimpleEvent> simpleEventWrapper, String manifest) {
    return EventSeq.single(simpleEventWrapper.getEvent());
  }
}
```

### Example 54: Event adapters

```scala
EventSourcedBehavior[Command, Event, State](
  persistenceId = PersistenceId.ofUniqueId("abc"),
  emptyState = State(),
  commandHandler = (state, cmd) => throw new NotImplementedError("TODO: process the command & return an Effect"),
  eventHandler = (state, evt) => throw new NotImplementedError("TODO: process the event return the next state"))
  .eventAdapter(new WrapperEventAdapter[Event])
```

### Example 55: Event adapters

```java
@Override
public EventAdapter<SimpleEvent, Wrapper<SimpleEvent>> eventAdapter() {
  return new EventAdapterExample();
}
```

### Example 56: Wrapping EventSourcedBehavior

```scala
Behaviors.setup[Command] { context =>
  EventSourcedBehavior[Command, Event, State](
    persistenceId = PersistenceId.ofUniqueId("abc"),
    emptyState = State(),
    commandHandler = (state, cmd) => throw new NotImplementedError("TODO: process the command & return an Effect"),
    eventHandler = (state, evt) => throw new NotImplementedError("TODO: process the event return the next state"))
    .snapshotWhen((state, _, _) => {
      context.log.info("Snapshot actor {} => state: {}", context.self.path.name, state)
      true
    })
}
```

### Example 57: Wrapping EventSourcedBehavior

```java
public class MyPersistentBehavior
    extends EventSourcedBehavior<
        MyPersistentBehavior.Command, MyPersistentBehavior.Event, MyPersistentBehavior.State> {


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
  public boolean shouldSnapshot(State state, Event event, long sequenceNr) {
    context
        .getLog()
        .info("Snapshot actor {} => state: {}", context.getSelf().path().name(), state);
    return true;
  }
}
```

### Example 58: Journal failures

```scala
EventSourcedBehavior[Command, Event, State](
  persistenceId = PersistenceId.ofUniqueId("abc"),
  emptyState = State(),
  commandHandler = (state, cmd) => throw new NotImplementedError("TODO: process the command & return an Effect"),
  eventHandler = (state, evt) => throw new NotImplementedError("TODO: process the event return the next state"))
  .onPersistFailure(
    SupervisorStrategy.restartWithBackoff(minBackoff = 10.seconds, maxBackoff = 60.seconds, randomFactor = 0.1))
```

### Example 59: Journal failures

```java
public class MyPersistentBehavior
    extends EventSourcedBehavior<
        MyPersistentBehavior.Command, MyPersistentBehavior.Event, MyPersistentBehavior.State> {


  public static Behavior<Command> create(PersistenceId persistenceId) {
    return new MyPersistentBehavior(persistenceId);
  }

  private MyPersistentBehavior(PersistenceId persistenceId) {
    super(
        persistenceId,
        SupervisorStrategy.restartWithBackoff(
            Duration.ofSeconds(10), Duration.ofSeconds(30), 0.2));
  }

}
```

### Example 60: Stash

```scala
object TaskManager {

  sealed trait Command
  final case class StartTask(taskId: String) extends Command
  final case class NextStep(taskId: String, instruction: String) extends Command
  final case class EndTask(taskId: String) extends Command

  sealed trait Event
  final case class TaskStarted(taskId: String) extends Event
  final case class TaskStep(taskId: String, instruction: String) extends Event
  final case class TaskCompleted(taskId: String) extends Event

  final case class State(taskIdInProgress: Option[String])

  def apply(persistenceId: PersistenceId): Behavior[Command] =
    EventSourcedBehavior[Command, Event, State](
      persistenceId = persistenceId,
      emptyState = State(None),
      commandHandler = (state, command) => onCommand(state, command),
      eventHandler = (state, event) => applyEvent(state, event))
      .onPersistFailure(SupervisorStrategy.restartWithBackoff(1.second, 30.seconds, 0.2))

  private def onCommand(state: State, command: Command): Effect[Event, State] = {
    state.taskIdInProgress match {
      case None =>
        command match {
          case StartTask(taskId) =>
            Effect.persist(TaskStarted(taskId))
          case _ =>
            Effect.unhandled
        }

      case Some(inProgress) =>
        command match {
          case StartTask(taskId) =>
            if (inProgress == taskId)
              Effect.none // duplicate, already in progress
            else
              // other task in progress, wait with new task until later
              Effect.stash()

          case NextStep(taskId, instruction) =>
            if (inProgress == taskId)
              Effect.persist(TaskStep(taskId, instruction))
            else
              // other task in progress, wait with new task until later
              Effect.stash()

          case EndTask(taskId) =>
            if (inProgress == taskId)
              Effect.persist(TaskCompleted(taskId)).thenUnstashAll() // continue with next task
            else
              // other task in progress, wait with new task until later
              Effect.stash()
        }
    }
  }

  private def applyEvent(state: State, event: Event): State = {
    event match {
      case TaskStarted(taskId) => State(Option(taskId))
      case TaskStep(_, _)      => state
      case TaskCompleted(_)    => State(None)
    }
  }
}
```

### Example 61: Stash

```java
public class TaskManager
    extends EventSourcedBehavior<TaskManager.Command, TaskManager.Event, TaskManager.State> {

  public interface Command {}

  public static final class StartTask implements Command {
    public final String taskId;

    public StartTask(String taskId) {
      this.taskId = taskId;
    }
  }

  public static final class NextStep implements Command {
    public final String taskId;
    public final String instruction;

    public NextStep(String taskId, String instruction) {
      this.taskId = taskId;
      this.instruction = instruction;
    }
  }

  public static final class EndTask implements Command {
    public final String taskId;

    public EndTask(String taskId) {
      this.taskId = taskId;
    }
  }

  public interface Event {}

  public static final class TaskStarted implements Event {
    public final String taskId;

    public TaskStarted(String taskId) {
      this.taskId = taskId;
    }
  }

  public static final class TaskStep implements Event {
    public final String taskId;
    public final String instruction;

    public TaskStep(String taskId, String instruction) {
      this.taskId = taskId;
      this.instruction = instruction;
    }
  }

  public static final class TaskCompleted implements Event {
    public final String taskId;

    public TaskCompleted(String taskId) {
      this.taskId = taskId;
    }
  }

  public static class State {
    public final Optional<String> taskIdInProgress;

    public State(Optional<String> taskIdInProgress) {
      this.taskIdInProgress = taskIdInProgress;
    }
  }

  public static Behavior<Command> create(PersistenceId persistenceId) {
    return new TaskManager(persistenceId);
  }

  public TaskManager(PersistenceId persistenceId) {
    super(
        persistenceId,
        SupervisorStrategy.restartWithBackoff(
            Duration.ofSeconds(1), Duration.ofSeconds(30), 0.2));
  }

  @Override
  public State emptyState() {
    return new State(Optional.empty());
  }

  @Override
  public CommandHandler<Command, Event, State> commandHandler() {
    return newCommandHandlerBuilder()
        .forAnyState()
        .onCommand(StartTask.class, this::onStartTask)
        .onCommand(NextStep.class, this::onNextStep)
        .onCommand(EndTask.class, this::onEndTask)
        .build();
  }

  private Effect<Event, State> onStartTask(State state, StartTask command) {
    if (state.taskIdInProgress.isPresent()) {
      if (state.taskIdInProgress.get().equals(command.taskId))
        return Effect().none(); // duplicate, already in progress
      else return Effect().stash(); // other task in progress, wait with new task until later
    } else {
      return Effect().persist(new TaskStarted(command.taskId));
    }
  }

  private Effect<Event, State> onNextStep(State state, NextStep command) {
    if (state.taskIdInProgress.isPresent()) {
      if (state.taskIdInProgress.get().equals(command.taskId))
        return Effect().persist(new TaskStep(command.taskId, command.instruction));
      else return Effect().stash(); // other task in progress, wait with new task until later
    } else {
      return Effect().unhandled();
    }
  }

  private Effect<Event, State> onEndTask(State state, EndTask command) {
    if (state.taskIdInProgress.isPresent()) {
      if (state.taskIdInProgress.get().equals(command.taskId))
        return Effect()
            .persist(new TaskCompleted(command.taskId))
            .thenUnstashAll(); // continue with next task
      else return Effect().stash(); // other task in progress, wait with new task until later
    } else {
      return Effect().unhandled();
    }
  }

  @Override
  public EventHandler<State, Event> eventHandler() {
    return newEventHandlerBuilder()
        .forAnyState()
        .onEvent(TaskStarted.class, (state, event) -> new State(Optional.of(event.taskId)))
        .onEvent(TaskStep.class, (state, event) -> state)
        .onEvent(TaskCompleted.class, (state, event) -> new State(Optional.empty()))
        .build();
  }
}
```

### Example 62: Stash

```text
akka.persistence.typed.stash-capacity = 10000
```

### Example 63: Stash

```scala
.withStashCapacity(100)
```

### Example 64: Stash

```java
@Override
public Optional<Integer> stashCapacity() {
  return Optional.of(100);
}
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/ActorRef.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/BackoffSupervisorStrategy.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/Behavior.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/scaladsl/ActorContext.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/scaladsl/Behaviors$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/typed/scaladsl/EntityContext.html
- https://doc.akka.io/api/akka-core/2.10/akka/pattern/StatusReply$.html
- https://doc.akka.io/api/akka-core/2.10/akka/pattern/StatusReply.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/EventRejectedException.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/PersistFailed.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/PersistRejected.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/PersistenceId$.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/PersistenceId.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/RecoveryCompleted.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/RecoveryFailed.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/scaladsl/Effect$.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/scaladsl/Effect.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/scaladsl/EffectBuilder.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/scaladsl/EventSourcedBehavior$.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/scaladsl/EventSourcedBehavior.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/scaladsl/ReplyEffect.html
- https://doc.akka.io/docs/akka-dependencies/current/support-terminology.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/BackoffSupervisorStrategy.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/Behavior.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/javadsl/ActorContext.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/javadsl/Behaviors.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/javadsl/EntityContext.html
- https://doc.akka.io/japi/akka-core/2.10/akka/pattern/StatusReply$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/pattern/StatusReply.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/EventRejectedException.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/PersistFailed.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/PersistRejected.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/PersistenceId.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/RecoveryCompleted.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/RecoveryFailed.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/javadsl/CommandHandlerBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/javadsl/Effect.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/javadsl/EffectBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/javadsl/EffectFactories.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/javadsl/EventSourcedBehavior.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/javadsl/EventSourcedBehaviorWithEnforcedReplies.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/javadsl/ReplyEffect.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/javadsl/SignalHandlerBuilder.html
- https://doc.akka.io/libraries/akka-core/2.10/general/configuration-reference.html
- https://doc.akka.io/libraries/akka-core/2.10/persistence-plugins.html
- https://doc.akka.io/libraries/akka-core/2.10/persistence-schema-evolution.html

---
*Source: [https://doc.akka.io/libraries/akka-core/2.10/typed/persistence.html](https://doc.akka.io/libraries/akka-core/2.10/typed/persistence.html)*