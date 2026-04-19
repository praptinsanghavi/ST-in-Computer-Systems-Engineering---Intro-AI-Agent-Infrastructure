---
description: Akka Persistence Classic, Event Sourcing with Akka, At-Least-Once delivery,
  snapshots, recovery and replay with Akka actors.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:22:14Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/persistence.html
title: Classic Persistence • Akka core
---

# Classic Persistence • Akka core

> **Summary:** Akka Persistence Classic, Event Sourcing with Akka, At-Least-Once delivery, snapshots, recovery and replay with Akka actors.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Classic Persistence

Note
Akka Classic pertains to the original Actor APIs, which have been improved by more type safe and guided Actor APIs. Akka Classic is still fully supported and existing applications can continue to use the classic APIs. It is also possible to use the new Actor APIs together with classic actors in the same ActorSystem, see [coexistence](typed/coexisting.html). For new projects we recommend using [the new Actor API](typed/actors.html).

For the full documentation of this feature and for new projects see [Event Sourcing](typed/persistence.html).

## Module info

Note
The Akka dependencies are available from Akka’s secure library repository. To access them you need to use a secure, tokenized URL as specified at <https://account.akka.io/token>.

To use Akka Persistence, you must add the following dependency in your project:

sbt
```
val AkkaVersion = "2.10.17"
libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-persistence" % AkkaVersion,
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
    <artifactId>akka-persistence_${scala.binary.version}</artifactId>
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

  implementation "com.typesafe.akka:akka-persistence_${versions.ScalaBinary}"
  testImplementation "com.typesafe.akka:akka-persistence-testkit_${versions.ScalaBinary}"
}
```

You also have to select journal plugin and optionally snapshot store plugin, see [Persistence Plugins](persistence-plugins.html).

| Project Info: Akka Persistence (classic) | |
| --- | --- |
| Artifact | com.typesafe.akka akka\-persistence 2\.10\.17 [Snapshots are available](project/links.html#snapshots-repository) |
| JDK versions | Eclipse Temurin JDK 11Eclipse Temurin JDK 17Eclipse Temurin JDK 21 |
| Scala versions | 2\.13\.17, 3\.3\.7 |
| JPMS module name | akka.persistence |
| License | [BUSL\-1\.1](https://raw.githubusercontent.com/akka/akka-core/v2.10.17/LICENSE) |
| Readiness level | [Supported](https://doc.akka.io/docs/akka-dependencies/current/support-terminology.html#supported), support is available from [Lightbend](https://www.lightbend.com/akka) Since 2\.3\.0, 2014\-03\-05 |
| Home page | <https://akka.io/> |
| API documentation | [API (Scaladoc)](https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/index.html) [API (Javadoc)](https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/package-summary.html) |
| Forums | [Akka Discuss](https://discuss.akka.io) |
| Release notes | [Akka release notes](https://doc.akka.io/reference/release-notes.html) |
| Issues | [Github issues](https://github.com/akka/akka-core/issues) |
| Sources | [https://github.com/akka/akka\-core](https://github.com/akka/akka-core) |

## Introduction

See introduction in [Persistence](typed/persistence.html#introduction) 

Akka Persistence also provides point\-to\-point communication with at\-least\-once message delivery semantics.

### Architecture

- [`PersistentActor`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/PersistentActor.html "akka.persistence.PersistentActor")[`AbstractPersistentActor`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/AbstractPersistentActor.html "akka.persistence.AbstractPersistentActor"): Is a persistent, stateful actor. It is able to persist events to a journal and can react to them in a thread\-safe manner. It can be used to implement both *command* as well as *event sourced* actors. When a persistent actor is started or restarted, journaled messages are replayed to that actor so that it can recover its state from these messages.
- [`AtLeastOnceDelivery`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/AtLeastOnceDelivery.html "akka.persistence.AtLeastOnceDelivery")[`AbstractPersistentActorWithAtLeastOnceDelivery`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/AbstractPersistentActorWithAtLeastOnceDelivery.html "akka.persistence.AbstractPersistentActorWithAtLeastOnceDelivery"): To send messages with at\-least\-once delivery semantics to destinations, also in case of sender and receiver JVM crashes.
- [`AsyncWriteJournal`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/journal/AsyncWriteJournal.html "akka.persistence.journal.AsyncWriteJournal")[`AsyncWriteJournal`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/journal/japi/AsyncWriteJournal.html "akka.persistence.journal.japi.AsyncWriteJournal"): A journal stores the sequence of messages sent to a persistent actor. An application can control which messages are journaled and which are received by the persistent actor without being journaled. Journal maintains `highestSequenceNr` that is increased on each message. The storage backend of a journal is pluggable. Replicated journals are available as [Community plugins](https://akka.io/community/).
- *Snapshot store*: A snapshot store persists snapshots of a persistent actor’s state. Snapshots are used for optimizing recovery times. The storage backend of a snapshot store is pluggable. The persistence extension comes with a “local” snapshot storage plugin, which writes to the local filesystem. Replicated snapshot stores are available as [Community plugins](https://akka.io/community/)
- *Event Sourcing*. Based on the building blocks described above, Akka persistence provides abstractions for the development of event sourced applications (see section [Event Sourcing](typed/persistence.html#event-sourcing-concepts)).

## Example

Akka persistence supports Event Sourcing with the [`PersistentActor`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/PersistentActor.html "akka.persistence.PersistentActor") trait[`AbstractPersistentActor`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/AbstractPersistentActor.html "akka.persistence.AbstractPersistentActor") abstract class. An actor that extends this traitclass uses the [`persist`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/PersistentActor.html#persist[A](event:A)(handler:A=%3EUnit):Unit "akka.persistence.PersistentActor")[`persist`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/AbstractPersistentActorLike.html#persist(A,akka.japi.Procedure) "akka.persistence.AbstractPersistentActorLike") method to persist and handle events. The behavior of a `PersistentActor`an `AbstractPersistentActor` is defined by implementing [`receiveRecover`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/PersistentActor.html#receiveRecover:Eventsourced.this.Receive "akka.persistence.PersistentActor")[`createReceiveRecover`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/AbstractPersistentActorLike.html#createReceiveRecover() "akka.persistence.AbstractPersistentActorLike") and [`receiveCommand`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/PersistentActor.html#receiveCommand:Eventsourced.this.Receive "akka.persistence.PersistentActor")[`createReceive`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/AbstractPersistentActorLike.html#createReceive() "akka.persistence.AbstractPersistentActorLike"). This is demonstrated in the following example.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/persistence/PersistentActorExample.scala#L8-L48 "Go to snippet source")import akka.actor._
import akka.persistence._

case class Cmd(data: String)
case class Evt(data: String)

case class ExampleState(events: List[String] = Nil) {
  def updated(evt: Evt): ExampleState = copy(evt.data :: events)
  def size: Int = events.length
  override def toString: String = events.reverse.toString
}

class ExamplePersistentActor extends PersistentActor {
  override def persistenceId = "sample-id-1"

  var state = ExampleState()

  def updateState(event: Evt): Unit =
    state = state.updated(event)

  def numEvents =
    state.size

  val receiveRecover: Receive = {
    case evt: Evt                                 => updateState(evt)
    case SnapshotOffer(_, snapshot: ExampleState) => state = snapshot
  }

  val snapShotInterval = 1000
  val receiveCommand: Receive = {
    case Cmd(data) =>
      persist(Evt(s"${data}-${numEvents}")) { event =>
        updateState(event)
        context.system.eventStream.publish(event)
        if (lastSequenceNr % snapShotInterval == 0 && lastSequenceNr != 0)
          saveSnapshot(state)
      }
    case "print" => println(state)
  }

}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/persistence/PersistentActorExample.java#L8-L116 "Go to snippet source")  
import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;
import akka.persistence.AbstractPersistentActor;
import akka.persistence.SnapshotOffer;
import java.io.Serializable;
import java.util.ArrayList;

class Cmd implements Serializable {
  private static final long serialVersionUID = 1L;
  private final String data;

  public Cmd(String data) {
    this.data = data;
  }

  public String getData() {
    return data;
  }
}

class Evt implements Serializable {
  private static final long serialVersionUID = 1L;
  private final String data;

  public Evt(String data) {
    this.data = data;
  }

  public String getData() {
    return data;
  }
}

class ExampleState implements Serializable {
  private static final long serialVersionUID = 1L;
  private final ArrayList<String> events;

  public ExampleState() {
    this(new ArrayList<>());
  }

  public ExampleState(ArrayList<String> events) {
    this.events = events;
  }

  public ExampleState copy() {
    return new ExampleState(new ArrayList<>(events));
  }

  public void update(Evt evt) {
    events.add(evt.getData());
  }

  public int size() {
    return events.size();
  }

  @Override
  public String toString() {
    return events.toString();
  }
}

class ExamplePersistentActor extends AbstractPersistentActor {

  private ExampleState state = new ExampleState();
  private int snapShotInterval = 1000;

  public int getNumEvents() {
    return state.size();
  }

  @Override
  public String persistenceId() {
    return "sample-id-1";
  }

  @Override
  public Receive createReceiveRecover() {
    return receiveBuilder()
        .match(Evt.class, state::update)
        .match(SnapshotOffer.class, ss -> state = (ExampleState) ss.snapshot())
        .build();
  }

  @Override
  public Receive createReceive() {
    return receiveBuilder()
        .match(
            Cmd.class,
            c -> {
              final String data = c.getData();
              final Evt evt = new Evt(data + "-" + getNumEvents());
              persist(
                  evt,
                  (Evt e) -> {
                    state.update(e);
                    getContext().getSystem().getEventStream().publish(e);
                    if (lastSequenceNr() % snapShotInterval == 0 && lastSequenceNr() != 0)
                      // IMPORTANT: create a copy of snapshot because ExampleState is mutable
                      saveSnapshot(state.copy());
                  });
            })
        .matchEquals("print", s -> System.out.println(state))
        .build();
  }
}
```

The example defines two data types, `Cmd` and `Evt` to represent commands and events, respectively. The `state` of the `ExamplePersistentActor` is a list of persisted event data contained in `ExampleState`.

The persistent actor’s `receiveRecover``createReceiveRecover` method defines how `state` is updated during recovery by handling `Evt` and `SnapshotOffer` messages. The persistent actor’s `receiveCommand``createReceive` method is a command handler. In this example, a command is handled by generating an event which is then persisted and handled. Events are persisted by calling `persist` with an event (or a sequence of events) as first argument and an event handler as second argument.

The `persist` method persists events asynchronously and the event handler is executed for successfully persisted events. Successfully persisted events are internally sent back to the persistent actor as individual messages that trigger event handler executions. An event handler may close over persistent actor state and mutate it. The sender of a persisted event is the sender of the corresponding command. This allows event handlers to reply to the sender of a command (not shown).

The main responsibility of an event handler is changing persistent actor state using event data and notifying others about successful state changes by publishing events.

When persisting events with `persist` it is guaranteed that the persistent actor will not receive further commands between the `persist` call and the execution(s) of the associated event handler. This also holds for multiple `persist` calls in context of a single command. Incoming messages are [stashed](persistence.html#internal-stash) until the `persist` is completed.

If persistence of an event fails, `onPersistFailure` will be invoked (logging the error by default), and the actor will unconditionally be stopped. If persistence of an event is rejected before it is stored, e.g. due to serialization error, `onPersistRejected` will be invoked (logging a warning by default) and the actor continues with the next message.

Note
It’s also possible to switch between different command handlers during normal processing and recovery with [`context.become()`](https://doc.akka.io/api/akka-core/2.10/akka/actor/ActorContext.html#become(behavior:akka.actor.Actor.Receive):Unit "akka.actor.ActorContext")[`getContext().become()`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorContext.html#become(scala.PartialFunction) "akka.actor.ActorContext") and [`context.unbecome()`](https://doc.akka.io/api/akka-core/2.10/akka/actor/ActorContext.html#unbecome():Unit "akka.actor.ActorContext")[`getContext().unbecome()`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorContext.html#unbecome() "akka.actor.ActorContext"). To get the actor into the same state after recovery you need to take special care to perform the same state transitions with `become` and `unbecome` in the [`receiveRecover`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/PersistentActor.html#receiveRecover:Eventsourced.this.Receive "akka.persistence.PersistentActor")[`createReceiveRecover`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/AbstractPersistentActorLike.html#createReceiveRecover() "akka.persistence.AbstractPersistentActorLike") method as you would have done in the command handler. Note that when using `become` from `receiveRecover``createReceiveRecover` it will still only use the `receiveRecover``createReceiveRecover` behavior when replaying the events. When replay is completed it will use the new behavior.

### Identifiers

A persistent actor must have an identifier that doesn’t change across different actor incarnations. The identifier must be defined with the `persistenceId` method.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/persistence/PersistenceDocSpec.scala#L82 "Go to snippet source")override def persistenceId = "my-stable-persistence-id"
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/persistence/LambdaPersistenceDocTest.java#L62-L66 "Go to snippet source")@Override
public String persistenceId() {
  return "my-stable-persistence-id";
}

```

Note
`persistenceId` must be unique to a given entity in the journal (database table/keyspace). When replaying messages persisted to the journal, you query messages with a `persistenceId`. So, if two different entities share the same `persistenceId`, message\-replaying behavior is corrupted.

### Recovery

By default, a persistent actor is automatically recovered on start and on restart by replaying journaled messages. New messages sent to a persistent actor during recovery do not interfere with replayed messages. They are stashed and received by a persistent actor after recovery phase completes.

The number of concurrent recoveries that can be in progress at the same time is limited to not overload the system and the backend data store. When exceeding the limit the actors will wait until other recoveries have been completed. This is configured by:

```
akka.persistence.max-concurrent-recoveries = 50

```
Note
Accessing the `sender()`sender with `getSender()` for replayed messages will always result in a `deadLetters` reference, as the original sender is presumed to be long gone. If you indeed have to notify an actor during recovery in the future, store its [`ActorPath`](https://doc.akka.io/api/akka-core/2.10/akka/actor/ActorPath.html "akka.actor.ActorPath")[`ActorPath`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorPath.html "akka.actor.ActorPath") explicitly in your persisted events.

#### Recovery customization

Applications may also customise how recovery is performed by returning a customised [`Recovery`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/Recovery$.html "akka.persistence.Recovery")[`Recovery`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/Recovery.html "akka.persistence.Recovery") object in the `recovery` method of a [`PersistentActor`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/PersistentActor.html "akka.persistence.PersistentActor")[`AbstractPersistentActor`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/AbstractPersistentActor.html "akka.persistence.AbstractPersistentActor"),

To skip loading snapshots and replay all events you can use [`SnapshotSelectionCriteria.None`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/SnapshotSelectionCriteria$.html#None:akka.persistence.SnapshotSelectionCriteria "akka.persistence.SnapshotSelectionCriteria")[`SnapshotSelectionCriteria.none()`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/SnapshotSelectionCriteria.html#none() "akka.persistence.SnapshotSelectionCriteria"). This can be useful if snapshot serialization format has changed in an incompatible way. It should typically not be used when events have been deleted.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/persistence/PersistenceDocSpec.scala#L64-L65 "Go to snippet source")override def recovery =
  Recovery(fromSnapshot = SnapshotSelectionCriteria.None)
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/persistence/LambdaPersistenceDocTest.java#L129-L132 "Go to snippet source")@Override
public Recovery recovery() {
  return Recovery.create(SnapshotSelectionCriteria.none());
}
```

Another possible recovery customization, which can be useful for debugging, is setting an upper bound on the replay, causing the actor to be replayed only up to a certain point “in the past” (instead of being replayed to its most up to date state). Note that after that it is a bad idea to persist new events because a later recovery will probably be confused by the new events that follow the events that were previously skipped.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/persistence/PersistenceDocSpec.scala#L40 "Go to snippet source")override def recovery = Recovery(toSequenceNr = 457L)
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/persistence/LambdaPersistenceDocTest.java#L53-L56 "Go to snippet source")@Override
public Recovery recovery() {
  return Recovery.create(457L);
}
```

Recovery can be disabled by returning `Recovery.none()` in the `recovery` method of a `PersistentActor`:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/persistence/PersistenceDocSpec.scala#L34 "Go to snippet source")override def recovery = Recovery.none
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/persistence/LambdaPersistenceDocTest.java#L39-L42 "Go to snippet source")@Override
public Recovery recovery() {
  return Recovery.none();
}
```

#### Recovery status

A persistent actor can query its own recovery status via the methods

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/persistence/PersistenceDocSpec.scala#L76-L77 "Go to snippet source")def recoveryRunning: Boolean
def recoveryFinished: Boolean
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/persistence/LambdaPersistenceDocTest.java#L29-L31 "Go to snippet source")public boolean recoveryRunning();

public boolean recoveryFinished();
```

Sometimes there is a need for performing additional initialization when the recovery has completed before processing any other message sent to the persistent actor. The persistent actor will receive a special [`RecoveryCompleted`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/RecoveryCompleted$.html "akka.persistence.RecoveryCompleted")[`RecoveryCompleted`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/RecoveryCompleted.html "akka.persistence.RecoveryCompleted") message right after recovery and before any other received messages.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/persistence/PersistenceDocSpec.scala#L48-L58 "Go to snippet source")  
override def receiveRecover: Receive = {
  case RecoveryCompleted =>
  // perform init after recovery, before any other messages
  //...
  case evt => //...
}

override def receiveCommand: Receive = {
  case msg => //...
}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/persistence/LambdaPersistenceDocTest.java#L93-L124 "Go to snippet source")class MyPersistentActor5 extends AbstractPersistentActor {

  @Override
  public String persistenceId() {
    return "my-stable-persistence-id";
  }

  @Override
  public Receive createReceiveRecover() {
    return receiveBuilder()
        .match(
            RecoveryCompleted.class,
            r -> {
              // perform init after recovery, before any other messages
              // ...
            })
        .match(String.class, this::handleEvent)
        .build();
  }

  @Override
  public Receive createReceive() {
    return receiveBuilder()
        .match(String.class, s -> s.equals("cmd"), s -> persist("evt", this::handleEvent))
        .build();
  }

  private void handleEvent(String event) {
    // update state
    // ...
  }
}
```

The actor will always receive a `RecoveryCompleted` message, even if there are no events in the journal and the snapshot store is empty, or if it’s a new persistent actor with a previously unused `persistenceId`.

If there is a problem with recovering the state of the actor from the journal, `onRecoveryFailure` is called (logging the error by default) and the actor will be stopped.

### Internal stash

The persistent actor has a private [stash](actors.html#stash) for internally caching incoming messages during [recovery](#recovery) or the [`persist`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/PersistentActor.html#persist[A](event:A)(handler:A=%3EUnit):Unit "akka.persistence.PersistentActor")[`persist`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/AbstractPersistentActorLike.html#persist(A,akka.japi.Procedure) "akka.persistence.AbstractPersistentActorLike")\\[`persistAll`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/PersistentActor.html#persistAll[A](events:Seq[A])(handler:A=%3EUnit):Unit "akka.persistence.PersistentActor")[`persistAll`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/AbstractPersistentActorLike.html#persistAll(java.lang.Iterable,akka.japi.Procedure) "akka.persistence.AbstractPersistentActorLike") method persisting events. You can still use/inherit from the [`Stash`](https://doc.akka.io/api/akka-core/2.10/akka/actor/Stash.html "akka.actor.Stash")[`Stash`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/Stash.html "akka.actor.Stash") interface. The internal stash cooperates with the normal stash by hooking into [`unstashAll`](https://doc.akka.io/api/akka-core/2.10/akka/actor/Stash.html#unstashAll():Unit "akka.actor.Stash")[`unstashAll`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/Stash.html#unstashAll() "akka.actor.Stash") making sure messages are unstashed properly to the internal stash to maintain ordering guarantees.

You should be careful to not send more messages to a persistent actor than it can keep up with, otherwise the number of stashed messages will grow without bounds. It can be wise to protect against [`OutOfMemoryError`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/OutOfMemoryError.html "java.lang.OutOfMemoryError") by defining a maximum stash capacity in the mailbox configuration:

```
akka.actor.default-mailbox.stash-capacity=10000

```

Note that the stash capacity is per actor. If you have many persistent actors, e.g. when using cluster sharding, you may need to define a small stash capacity to ensure that the total number of stashed messages in the system doesn’t consume too much memory. Additionally, the persistent actor defines three strategies to handle failure when the internal stash capacity is exceeded. The default overflow strategy is the [`ThrowOverflowExceptionStrategy`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/ThrowOverflowExceptionStrategy$.html "akka.persistence.ThrowOverflowExceptionStrategy")[`ThrowOverflowExceptionStrategy`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/ThrowOverflowExceptionStrategy.html "akka.persistence.ThrowOverflowExceptionStrategy"), which discards the current received message and throws a [`StashOverflowException`](https://doc.akka.io/api/akka-core/2.10/akka/actor/StashOverflowException.html "akka.actor.StashOverflowException")[`StashOverflowException`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/StashOverflowException.html "akka.actor.StashOverflowException"), causing actor restart if the default supervision strategy is used. You can override the [`internalStashOverflowStrategy`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/PersistenceStash.html#internalStashOverflowStrategy:akka.persistence.StashOverflowStrategy "akka.persistence.PersistenceStash")[`internalStashOverflowStrategy`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/PersistenceStash.html#internalStashOverflowStrategy() "akka.persistence.PersistenceStash") method to return [`DiscardToDeadLetterStrategy`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/DiscardToDeadLetterStrategy$.html "akka.persistence.DiscardToDeadLetterStrategy")[`DiscardToDeadLetterStrategy`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/DiscardToDeadLetterStrategy.html "akka.persistence.DiscardToDeadLetterStrategy") or [`ReplyToStrategy`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/ReplyToStrategy.html "akka.persistence.ReplyToStrategy")[`ReplyToStrategy`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/ReplyToStrategy.html "akka.persistence.ReplyToStrategy") for any “individual” persistent actor, or define the “default” for all persistent actors by providing FQCN, which must be a subclass of [`StashOverflowStrategyConfigurator`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/StashOverflowStrategyConfigurator.html "akka.persistence.StashOverflowStrategyConfigurator")[`StashOverflowStrategyConfigurator`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/StashOverflowStrategyConfigurator.html "akka.persistence.StashOverflowStrategyConfigurator"), in the persistence configuration:

```
akka.persistence.internal-stash-overflow-strategy=
  "akka.persistence.ThrowExceptionConfigurator"

```

The `DiscardToDeadLetterStrategy` strategy also has a pre\-packaged companion configurator [`DiscardConfigurator`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/DiscardConfigurator.html "akka.persistence.DiscardConfigurator")[`DiscardConfigurator`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/DiscardConfigurator.html "akka.persistence.DiscardConfigurator").

You can also query the default strategy via the Akka persistence extension singleton: 

Scala

```
Persistence(context.system).defaultInternalStashOverflowStrategy

```

Java

```
Persistence.get(getContext().getSystem()).defaultInternalStashOverflowStrategy();

```

Note
The bounded mailbox should be avoided in the persistent actor, by which the messages come from storage backends may be discarded. You can use bounded stash instead of it.

### Relaxed local consistency requirements and high throughput use\-cases

If faced with relaxed local consistency requirements and high throughput demands sometimes `PersistentActor``AbstractPersistentActor` and its [`persist`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/PersistentActor.html#persist[A](event:A)(handler:A=%3EUnit):Unit "akka.persistence.PersistentActor")[`persist`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/AbstractPersistentActorLike.html#persist(A,akka.japi.Procedure) "akka.persistence.AbstractPersistentActorLike") may not be enough in terms of consuming incoming Commands at a high rate, because it has to wait until all Events related to a given Command are processed in order to start processing the next Command. While this abstraction is very useful for most cases, sometimes you may be faced with relaxed requirements about consistency – for example you may want to process commands as fast as you can, assuming that the Event will eventually be persisted and handled properly in the background, retroactively reacting to persistence failures if needed.

The [`persistAsync`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/PersistentActor.html#persistAsync[A](event:A)(handler:A=%3EUnit):Unit "akka.persistence.PersistentActor")[`persistAsync`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/AbstractPersistentActorLike.html#persistAsync(A,akka.japi.Procedure) "akka.persistence.AbstractPersistentActorLike") method provides a tool for implementing high\-throughput persistent actors. It will *not* stash incoming Commands while the Journal is still working on persisting and/or user code is executing event callbacks.

In the below example, the event callbacks may be called “at any time”, even after the next Command has been processed. The ordering between events is still guaranteed (“evt\-b\-1” will be sent after “evt\-a\-2”, which will be sent after “evt\-a\-1” etc.).

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/persistence/PersistenceDocSpec.scala#L205-L237 "Go to snippet source")class MyPersistentActor extends PersistentActor {

  override def persistenceId = "my-stable-persistence-id"

  override def receiveRecover: Receive = {
    case _ => // handle recovery here
  }

  override def receiveCommand: Receive = {
    case c: String => {
      sender() ! c
      persistAsync(s"evt-$c-1") { e =>
        sender() ! e
      }
      persistAsync(s"evt-$c-2") { e =>
        sender() ! e
      }
    }
  }
}

// usage
persistentActor ! "a"
persistentActor ! "b"

// possible order of received messages:
// a
// b
// evt-a-1
// evt-a-2
// evt-b-1
// evt-b-2

```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/persistence/LambdaPersistenceDocTest.java#L384-L415 "Go to snippet source")class MyPersistentActor extends AbstractPersistentActor {

  @Override
  public String persistenceId() {
    return "my-stable-persistence-id";
  }

  private void handleCommand(String c) {
    getSender().tell(c, getSelf());

    persistAsync(
        String.format("evt-%s-1", c),
        e -> {
          getSender().tell(e, getSelf());
        });
    persistAsync(
        String.format("evt-%s-2", c),
        e -> {
          getSender().tell(e, getSelf());
        });
  }

  @Override
  public Receive createReceiveRecover() {
    return receiveBuilder().match(String.class, this::handleCommand).build();
  }

  @Override
  public Receive createReceive() {
    return receiveBuilder().match(String.class, this::handleCommand).build();
  }
}
```

Note
In order to implement the pattern known as “*command sourcing*” call `persistAsync(cmd)(...)``persistAsync` right away on all incoming messages and handle them in the callback.

Warning
The callback will not be invoked if the actor is restarted (or stopped) in between the call to `persistAsync` and the journal has confirmed the write.

### Deferring actions until preceding persist handlers have executed

Sometimes when working with [`persistAsync`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/PersistentActor.html#persistAsync[A](event:A)(handler:A=%3EUnit):Unit "akka.persistence.PersistentActor")[`persistAsync`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/AbstractPersistentActorLike.html#persistAsync(A,akka.japi.Procedure) "akka.persistence.AbstractPersistentActorLike") or [`persist`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/PersistentActor.html#persist[A](event:A)(handler:A=%3EUnit):Unit "akka.persistence.PersistentActor")[`persist`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/AbstractPersistentActorLike.html#persist(A,akka.japi.Procedure) "akka.persistence.AbstractPersistentActorLike") you may find that it would be nice to define some actions in terms of ‘‘happens\-after the previous `persistAsync`/`persist` handlers have been invoked’’. `PersistentActor``AbstractPersistentActor` provides utility methods called [`defer`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/PersistentActor.html#defer[A](event:A)(handler:A=%3EUnit):Unit "akka.persistence.PersistentActor")[`defer`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/AbstractPersistentActorLike.html#defer(A,akka.japi.Procedure) "akka.persistence.AbstractPersistentActorLike") and [`deferAsync`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/PersistentActor.html#deferAsync[A](event:A)(handler:A=%3EUnit):Unit "akka.persistence.PersistentActor")[`deferAsync`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/AbstractPersistentActorLike.html#deferAsync(A,akka.japi.Procedure) "akka.persistence.AbstractPersistentActorLike"), which work similarly to `persist` and `persistAsync` respectively yet do not persist the passed in event. It is recommended to use them for *read* operations, and actions which do not have corresponding events in your domain model.

Using those methods is very similar to the persist family of methods, yet they do **not** persist the passed in event. It will be kept in memory and used when invoking the handler.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/persistence/PersistenceDocSpec.scala#L244-L266 "Go to snippet source")class MyPersistentActor extends PersistentActor {

  override def persistenceId = "my-stable-persistence-id"

  override def receiveRecover: Receive = {
    case _ => // handle recovery here
  }

  override def receiveCommand: Receive = {
    case c: String => {
      sender() ! c
      persistAsync(s"evt-$c-1") { e =>
        sender() ! e
      }
      persistAsync(s"evt-$c-2") { e =>
        sender() ! e
      }
      deferAsync(s"evt-$c-3") { e =>
        sender() ! e
      }
    }
  }
}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/persistence/LambdaPersistenceDocTest.java#L439-L474 "Go to snippet source")class MyPersistentActor extends AbstractPersistentActor {

  @Override
  public String persistenceId() {
    return "my-stable-persistence-id";
  }

  private void handleCommand(String c) {
    persistAsync(
        String.format("evt-%s-1", c),
        e -> {
          getSender().tell(e, getSelf());
        });
    persistAsync(
        String.format("evt-%s-2", c),
        e -> {
          getSender().tell(e, getSelf());
        });

    deferAsync(
        String.format("evt-%s-3", c),
        e -> {
          getSender().tell(e, getSelf());
        });
  }

  @Override
  public Receive createReceiveRecover() {
    return receiveBuilder().match(String.class, this::handleCommand).build();
  }

  @Override
  public Receive createReceive() {
    return receiveBuilder().match(String.class, this::handleCommand).build();
  }
}
```

Notice that the `sender()` is **safe** to access in the handler callback, and will be pointing to the original sender of the command for which this `defer` or `deferAsync` handler was called.

The calling side will get the responses in this (guaranteed) order:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/persistence/PersistenceDocSpec.scala#L270-L282 "Go to snippet source")persistentActor ! "a"
persistentActor ! "b"

// order of received messages:
// a
// b
// evt-a-1
// evt-a-2
// evt-a-3
// evt-b-1
// evt-b-2
// evt-b-3

```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/persistence/LambdaPersistenceDocTest.java#L481-L493 "Go to snippet source")final ActorRef persistentActor = system.actorOf(Props.create(MyPersistentActor.class));
persistentActor.tell("a", sender);
persistentActor.tell("b", sender);

// order of received messages:
// a
// b
// evt-a-1
// evt-a-2
// evt-a-3
// evt-b-1
// evt-b-2
// evt-b-3
```

You can also call `defer` or `deferAsync` with `persist`.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/persistence/PersistenceDocSpec.scala#L288-L310 "Go to snippet source")class MyPersistentActor extends PersistentActor {

  override def persistenceId = "my-stable-persistence-id"

  override def receiveRecover: Receive = {
    case _ => // handle recovery here
  }

  override def receiveCommand: Receive = {
    case c: String => {
      sender() ! c
      persist(s"evt-$c-1") { e =>
        sender() ! e
      }
      persist(s"evt-$c-2") { e =>
        sender() ! e
      }
      defer(s"evt-$c-3") { e =>
        sender() ! e
      }
    }
  }
}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/persistence/LambdaPersistenceDocTest.java#L501-L536 "Go to snippet source")class MyPersistentActor extends AbstractPersistentActor {

  @Override
  public String persistenceId() {
    return "my-stable-persistence-id";
  }

  private void handleCommand(String c) {
    persist(
        String.format("evt-%s-1", c),
        e -> {
          sender().tell(e, self());
        });
    persist(
        String.format("evt-%s-2", c),
        e -> {
          sender().tell(e, self());
        });

    defer(
        String.format("evt-%s-3", c),
        e -> {
          sender().tell(e, self());
        });
  }

  @Override
  public Receive createReceiveRecover() {
    return receiveBuilder().match(String.class, this::handleCommand).build();
  }

  @Override
  public Receive createReceive() {
    return receiveBuilder().match(String.class, this::handleCommand).build();
  }
}
```

Warning
The callback will not be invoked if the actor is restarted (or stopped) in between the call to `defer` or `deferAsync` and the journal has processed and confirmed all preceding writes.

### Nested persist calls

It is possible to call [`persist`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/PersistentActor.html#persist[A](event:A)(handler:A=%3EUnit):Unit "akka.persistence.PersistentActor")[`persist`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/AbstractPersistentActorLike.html#persist(A,akka.japi.Procedure) "akka.persistence.AbstractPersistentActorLike") and [`persistAsync`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/PersistentActor.html#persistAsync[A](event:A)(handler:A=%3EUnit):Unit "akka.persistence.PersistentActor")[`persistAsync`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/AbstractPersistentActorLike.html#persistAsync(A,akka.japi.Procedure) "akka.persistence.AbstractPersistentActorLike") inside their respective callback blocks and they will properly retain both the thread safety (including the right value of `sender()``getSender()`) as well as stashing guarantees.

In general it is encouraged to create command handlers which do not need to resort to nested event persisting, however there are situations where it may be useful. It is important to understand the ordering of callback execution in those situations, as well as their implication on the stashing behavior (that `persist()` enforces). In the following example two persist calls are issued, and each of them issues another persist inside its callback:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/persistence/PersistenceDocSpec.scala#L324-L341 "Go to snippet source")override def receiveCommand: Receive = {
  case c: String =>
    sender() ! c

    persist(s"$c-1-outer") { outer1 =>
      sender() ! outer1
      persist(s"$c-1-inner") { inner1 =>
        sender() ! inner1
      }
    }

    persist(s"$c-2-outer") { outer2 =>
      sender() ! outer2
      persist(s"$c-2-inner") { inner2 =>
        sender() ! inner2
      }
    }
}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/persistence/LambdaPersistenceDocTest.java#L556-L579 "Go to snippet source")@Override
public Receive createReceiveRecover() {
  final Procedure<String> replyToSender = event -> getSender().tell(event, getSelf());

  return receiveBuilder()
      .match(
          String.class,
          msg -> {
            persist(
                String.format("%s-outer-1", msg),
                event -> {
                  getSender().tell(event, getSelf());
                  persist(String.format("%s-inner-1", event), replyToSender);
                });

            persist(
                String.format("%s-outer-2", msg),
                event -> {
                  getSender().tell(event, getSelf());
                  persist(String.format("%s-inner-2", event), replyToSender);
                });
          })
      .build();
}
```

When sending two commands to this `PersistentActor``AbstractPersistentActor`, the persist handlers will be executed in the following order:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/persistence/PersistenceDocSpec.scala#L346-L361 "Go to snippet source")persistentActor ! "a"
persistentActor ! "b"

// order of received messages:
// a
// a-outer-1
// a-outer-2
// a-inner-1
// a-inner-2
// and only then process "b"
// b
// b-outer-1
// b-outer-2
// b-inner-1
// b-inner-2

```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/persistence/LambdaPersistenceDocTest.java#L584-L599 "Go to snippet source")persistentActor.tell("a", ActorRef.noSender());
persistentActor.tell("b", ActorRef.noSender());

// order of received messages:
// a
// a-outer-1
// a-outer-2
// a-inner-1
// a-inner-2
// and only then process "b"
// b
// b-outer-1
// b-outer-2
// b-inner-1
// b-inner-2

```

First the “outer layer” of persist calls is issued and their callbacks are applied. After these have successfully completed, the inner callbacks will be invoked (once the events they are persisting have been confirmed to be persisted by the journal). Only after all these handlers have been successfully invoked will the next command be delivered to the persistent Actor. In other words, the stashing of incoming commands that is guaranteed by initially calling `persist()` on the outer layer is extended until all nested `persist` callbacks have been handled.

It is also possible to nest `persistAsync` calls, using the same pattern:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/persistence/PersistenceDocSpec.scala#L372-L387 "Go to snippet source")override def receiveCommand: Receive = {
  case c: String =>
    sender() ! c
    persistAsync(c + "-outer-1") { outer =>
      sender() ! outer
      persistAsync(c + "-inner-1") { inner =>
        sender() ! inner
      }
    }
    persistAsync(c + "-outer-2") { outer =>
      sender() ! outer
      persistAsync(c + "-inner-2") { inner =>
        sender() ! inner
      }
    }
}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/persistence/LambdaPersistenceDocTest.java#L616-L639 "Go to snippet source")@Override
public Receive createReceive() {
  final Procedure<String> replyToSender = event -> getSender().tell(event, getSelf());

  return receiveBuilder()
      .match(
          String.class,
          msg -> {
            persistAsync(
                String.format("%s-outer-1", msg),
                event -> {
                  getSender().tell(event, getSelf());
                  persistAsync(String.format("%s-inner-1", event), replyToSender);
                });

            persistAsync(
                String.format("%s-outer-2", msg),
                event -> {
                  getSender().tell(event, getSelf());
                  persistAsync(String.format("%s-inner-1", event), replyToSender);
                });
          })
      .build();
}
```

In this case no stashing is happening, yet events are still persisted and callbacks are executed in the expected order:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/persistence/PersistenceDocSpec.scala#L392-L410 "Go to snippet source")persistentActor ! "a"
persistentActor ! "b"

// order of received messages:
// a
// b
// a-outer-1
// a-outer-2
// b-outer-1
// b-outer-2
// a-inner-1
// a-inner-2
// b-inner-1
// b-inner-2

// which can be seen as the following causal relationship:
// a -> a-outer-1 -> a-outer-2 -> a-inner-1 -> a-inner-2
// b -> b-outer-1 -> b-outer-2 -> b-inner-1 -> b-inner-2

```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/persistence/LambdaPersistenceDocTest.java#L644-L662 "Go to snippet source")persistentActor.tell("a", getSelf());
persistentActor.tell("b", getSelf());

// order of received messages:
// a
// b
// a-outer-1
// a-outer-2
// b-outer-1
// b-outer-2
// a-inner-1
// a-inner-2
// b-inner-1
// b-inner-2

// which can be seen as the following causal relationship:
// a -> a-outer-1 -> a-outer-2 -> a-inner-1 -> a-inner-2
// b -> b-outer-1 -> b-outer-2 -> b-inner-1 -> b-inner-2

```

While it is possible to nest mixed `persist` and `persistAsync` with keeping their respective semantics it is not a recommended practice, as it may lead to overly complex nesting.

Warning
While it is possible to nest `persist` calls within one another, it is *not* legal call `persist` from any other Thread than the Actors message processing Thread. For example, it is not legal to call `persist` from Futures! Doing so will break the guarantees that the persist methods aim to provide. Always call `persist` and `persistAsync` from within the Actor’s receive block (or methods synchronously invoked from there).

### Failures

If persistence of an event fails, `onPersistFailure` will be invoked (logging the error by default), and the actor will unconditionally be stopped.

The reason that it cannot resume when persist fails is that it is unknown if the event was actually persisted or not, and therefore it is in an inconsistent state. Restarting on persistent failures will most likely fail anyway since the journal is probably unavailable. It is better to stop the actor and after a back\-off timeout start it again. The [`BackoffSupervisor`](https://doc.akka.io/api/akka-core/2.10/akka/pattern/BackoffSupervisor$.html "akka.pattern.BackoffSupervisor")[`BackoffSupervisor`](https://doc.akka.io/japi/akka-core/2.10/akka/pattern/BackoffSupervisor.html "akka.pattern.BackoffSupervisor") actor is provided to support such restarts.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/persistence/PersistenceDocSpec.scala#L98-L101 "Go to snippet source")val childProps = Props[MyPersistentActor]()
val props = BackoffSupervisor.props(BackoffOpts
  .onStop(childProps, childName = "myActor", minBackoff = 3.seconds, maxBackoff = 30.seconds, randomFactor = 0.2))
context.actorOf(props, name = "mySupervisor")
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/persistence/LambdaPersistenceDocTest.java#L138-L147 "Go to snippet source")@Override
public void preStart() throws Exception {
  final Props childProps = Props.create(MyPersistentActor1.class);
  final Props props =
      BackoffSupervisor.props(
          BackoffOpts.onStop(
              childProps, "myActor", Duration.ofSeconds(3), Duration.ofSeconds(30), 0.2));
  getContext().actorOf(props, "mySupervisor");
  super.preStart();
}
```

See [Backoff Supervision strategies](fault-tolerance.html#supervision-strategies) for more details about actor supervision.

If persistence of an event is rejected before it is stored, e.g. due to serialization error, `onPersistRejected` will be invoked (logging a warning by default), and the actor continues with next message.

If there is a problem with recovering the state of the actor from the journal when the actor is started, `onRecoveryFailure` is called (logging the error by default), and the actor will be stopped. Note that failure to load snapshot is also treated like this, but you can disable loading of snapshots if you for example know that serialization format has changed in an incompatible way, see [Recovery customization](persistence.html#recovery-custom).

### Atomic writes

Each event is stored atomically, but it is also possible to store several events atomically by using the [`persistAll`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/PersistentActor.html#persistAll[A](events:Seq[A])(handler:A=%3EUnit):Unit "akka.persistence.PersistentActor")[`persistAll`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/AbstractPersistentActorLike.html#persistAll(java.lang.Iterable,akka.japi.Procedure) "akka.persistence.AbstractPersistentActorLike") or [`persistAllAsync`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/PersistentActor.html#persistAllAsync[A](events:Seq[A])(handler:A=%3EUnit):Unit "akka.persistence.PersistentActor")[`persistAllAsync`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/AbstractPersistentActorLike.html#persistAllAsync(java.lang.Iterable,akka.japi.Procedure) "akka.persistence.AbstractPersistentActorLike") method. That means that all events passed to that method are stored or none of them are stored if there is an error.

The recovery of a persistent actor will therefore never be done partially with only a subset of events persisted by *persistAll*.

Some journals may not support atomic writes of several events and they will then reject the `persistAll` command, i.e. `onPersistRejected` is called with an exception (typically [`UnsupportedOperationException`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/UnsupportedOperationException.html "java.lang.UnsupportedOperationException")).

### Batch writes

In order to optimize throughput when using [`persistAsync`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/PersistentActor.html#persistAsync[A](event:A)(handler:A=%3EUnit):Unit "akka.persistence.PersistentActor")[`persistAsync`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/AbstractPersistentActorLike.html#persistAsync(A,akka.japi.Procedure) "akka.persistence.AbstractPersistentActorLike"), a persistent actor internally batches events to be stored under high load before writing them to the journal (as a single batch). The batch size is dynamically determined by how many events are emitted during the time of a journal round\-trip: after sending a batch to the journal no further batch can be sent before confirmation has been received that the previous batch has been written. Batch writes are never timer\-based which keeps latencies at a minimum.

### Message deletion

It is possible to delete all messages (journaled by a single persistent actor) up to a specified sequence number; Persistent actors may call the [`deleteMessages`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/PersistentActor.html#deleteMessages(toSequenceNr:Long):Unit "akka.persistence.PersistentActor")[`deleteMessages`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/AbstractPersistentActorLike.html#deleteMessages(long) "akka.persistence.AbstractPersistentActorLike") method to this end.

Deleting messages in Event Sourcing based applications is typically either not used at all, or used in conjunction with [snapshotting](#snapshots), i.e. after a snapshot has been successfully stored, a `deleteMessages(toSequenceNr)` up until the sequence number of the data held by that snapshot can be issued to safely delete the previous events while still having access to the accumulated state during replays \- by loading the snapshot.

Warning
If you are using [Persistence Query](persistence-query.html), query results may be missing deleted messages in a journal, depending on how deletions are implemented in the journal plugin. Unless you use a plugin which still shows deleted messages in persistence query results, you have to design your application so that it is not affected by missing messages.

The result of the `deleteMessages` request is signaled to the persistent actor with a [`DeleteMessagesSuccess`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/DeleteMessagesSuccess.html "akka.persistence.DeleteMessagesSuccess")[`DeleteMessagesSuccess`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/DeleteMessagesSuccess.html "akka.persistence.DeleteMessagesSuccess") message if the delete was successful or a [`DeleteMessagesFailure`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/DeleteMessagesFailure.html "akka.persistence.DeleteMessagesFailure")[`DeleteMessagesFailure`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/DeleteMessagesFailure.html "akka.persistence.DeleteMessagesFailure") message if it failed.

Message deletion doesn’t affect the highest sequence number of the journal, even if all messages were deleted from it after `deleteMessages` invocation.

### Persistence status handling

Persisting, deleting, and replaying messages can either succeed or fail.

| **Method** | **Success** |
| --- | --- |
| `persist` / `persistAsync` | persist handler invoked |
| `onPersistRejected` | No automatic actions. |
| `recovery` | `RecoveryCompleted` |
| `deleteMessages` | `DeleteMessagesSuccess` |

The most important operations (`persist` and `recovery`) have failure handlers modelled as explicit callbacks which the user can override in the `PersistentActor`. The default implementations of these handlers emit a log message (`error` for persist/recovery failures, and `warning` for others), logging the failure cause and information about which message caused the failure.

For critical failures, such as recovery or persisting events failing, the persistent actor will be stopped after the failure handler is invoked. This is because if the underlying journal implementation is signalling persistence failures it is most likely either failing completely or overloaded and restarting right\-away and trying to persist the event again will most likely not help the journal recover – as it would likely cause a [Thundering herd problem](https://en.wikipedia.org/wiki/Thundering_herd_problem), as many persistent actors would restart and try to persist their events again. Instead, using a [`BackoffSupervisor`](https://doc.akka.io/api/akka-core/2.10/akka/pattern/BackoffSupervisor$.html "akka.pattern.BackoffSupervisor")[`BackoffSupervisor`](https://doc.akka.io/japi/akka-core/2.10/akka/pattern/BackoffSupervisor.html "akka.pattern.BackoffSupervisor") (as described in [Failures](persistence.html#failures)) which implements an exponential\-backoff strategy which allows for more breathing room for the journal to recover between restarts of the persistent actor.

Note
Journal implementations may choose to implement a retry mechanism, e.g. such that only after a write fails N number of times a persistence failure is signalled back to the user. In other words, once a journal returns a failure, it is considered *fatal* by Akka Persistence, and the persistent actor which caused the failure will be stopped.

Check the documentation of the journal implementation you are using for details if/how it is using this technique.

### Safely shutting down persistent actors

Special care should be given when shutting down persistent actors from the outside. With normal Actors it is often acceptable to use the special [PoisonPill](actors.html#poison-pill) message to signal to an Actor that it should stop itself once it receives this message – in fact this message is handled automatically by Akka, leaving the target actor no way to refuse stopping itself when given a poison pill.

This can be dangerous when used with `PersistentActor` due to the fact that incoming commands are *stashed* while the persistent actor is awaiting confirmation from the Journal that events have been written when [`persist()`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/PersistentActor.html#persist[A](event:A)(handler:A=%3EUnit):Unit "akka.persistence.PersistentActor")[`persist()`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/AbstractPersistentActorLike.html#persist(A,akka.japi.Procedure) "akka.persistence.AbstractPersistentActorLike") was used. Since the incoming commands will be drained from the Actor’s mailbox and put into its internal stash while awaiting the confirmation (thus, before calling the persist handlers) the Actor **may receive and (auto)handle the PoisonPill before it processes the other messages which have been put into its stash**, causing a pre\-mature shutdown of the Actor.

Warning
Consider using explicit shut\-down messages instead of `PoisonPill` when working with persistent actors.

The example below highlights how messages arrive in the Actor’s mailbox and how they interact with its internal stashing mechanism when `persist()` is used. Notice the early stop behavior that occurs when `PoisonPill` is used:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/persistence/PersistenceDocSpec.scala#L417-L434 "Go to snippet source")/** Explicit shutdown message */
case object Shutdown

class SafePersistentActor extends PersistentActor {
  override def persistenceId = "safe-actor"

  override def receiveCommand: Receive = {
    case c: String =>
      println(c)
      persist(s"handle-$c") { println(_) }
    case Shutdown =>
      context.stop(self)
  }

  override def receiveRecover: Receive = {
    case _ => // handle recovery here
  }
}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/persistence/LambdaPersistenceDocTest.java#L671-L700 "Go to snippet source")final class Shutdown {}

class MyPersistentActor extends AbstractPersistentActor {
  @Override
  public String persistenceId() {
    return "some-persistence-id";
  }

  @Override
  public Receive createReceive() {
    return receiveBuilder()
        .match(
            Shutdown.class,
            shutdown -> {
              getContext().stop(getSelf());
            })
        .match(
            String.class,
            msg -> {
              System.out.println(msg);
              persist("handle-" + msg, e -> System.out.println(e));
            })
        .build();
  }

  @Override
  public Receive createReceiveRecover() {
    return receiveBuilder().matchAny(any -> {}).build();
  }
}
```

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/persistence/PersistenceDocSpec.scala#L438-L447 "Go to snippet source")// UN-SAFE, due to PersistentActor's command stashing:
persistentActor ! "a"
persistentActor ! "b"
persistentActor ! PoisonPill
// order of received messages:
// a
//   # b arrives at mailbox, stashing;        internal-stash = [b]
// PoisonPill is an AutoReceivedMessage, is handled automatically
// !! stop !!
// Actor is stopped without handling `b` nor the `a` handler!
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/persistence/LambdaPersistenceDocTest.java#L707-L717 "Go to snippet source")// UN-SAFE, due to PersistentActor's command stashing:
persistentActor.tell("a", ActorRef.noSender());
persistentActor.tell("b", ActorRef.noSender());
persistentActor.tell(PoisonPill.getInstance(), ActorRef.noSender());
// order of received messages:
// a
//   # b arrives at mailbox, stashing;        internal-stash = [b]
//   # PoisonPill arrives at mailbox, stashing; internal-stash = [b, Shutdown]
// PoisonPill is an AutoReceivedMessage, is handled automatically
// !! stop !!
// Actor is stopped without handling `b` nor the `a` handler!
```

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/persistence/PersistenceDocSpec.scala#L451-L465 "Go to snippet source")// SAFE:
persistentActor ! "a"
persistentActor ! "b"
persistentActor ! Shutdown
// order of received messages:
// a
//   # b arrives at mailbox, stashing;        internal-stash = [b]
//   # Shutdown arrives at mailbox, stashing; internal-stash = [b, Shutdown]
// handle-a
//   # unstashing;                            internal-stash = [Shutdown]
// b
// handle-b
//   # unstashing;                            internal-stash = []
// Shutdown
// -- stop --
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/persistence/LambdaPersistenceDocTest.java#L721-L735 "Go to snippet source")// SAFE:
persistentActor.tell("a", ActorRef.noSender());
persistentActor.tell("b", ActorRef.noSender());
persistentActor.tell(new Shutdown(), ActorRef.noSender());
// order of received messages:
// a
//   # b arrives at mailbox, stashing;        internal-stash = [b]
//   # Shutdown arrives at mailbox, stashing; internal-stash = [b, Shutdown]
// handle-a
//   # unstashing;                            internal-stash = [Shutdown]
// b
// handle-b
//   # unstashing;                            internal-stash = []
// Shutdown
// -- stop --
```

### Replay Filter

See [Replay filter](typed/persistence.html#replay-filter) in the documentation of the new API.

## Snapshots

As you model your domain using actors, you may notice that some actors may be prone to accumulating extremely long event logs and experiencing long recovery times. Sometimes, the right approach may be to split out into a set of shorter lived actors. However, when this is not an option, you can use snapshots to reduce recovery times drastically.

Persistent actors can save snapshots of internal state by calling the [`saveSnapshot`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/Snapshotter.html#saveSnapshot(snapshot:Any):Unit "akka.persistence.Snapshotter")[`saveSnapshot`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/Snapshotter.html#saveSnapshot(java.lang.Object) "akka.persistence.Snapshotter") method. If saving of a snapshot succeeds, the persistent actor receives a [`SaveSnapshotSuccess`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/SaveSnapshotSuccess.html "akka.persistence.SaveSnapshotSuccess")[`SaveSnapshotSuccess`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/SaveSnapshotSuccess.html "akka.persistence.SaveSnapshotSuccess") message, otherwise a [`SaveSnapshotFailure`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/SaveSnapshotFailure.html "akka.persistence.SaveSnapshotFailure")[`SaveSnapshotFailure`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/SaveSnapshotFailure.html "akka.persistence.SaveSnapshotFailure") message

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/persistence/PersistenceDocSpec.scala#L158-L170 "Go to snippet source")var state: Any = _

val snapShotInterval = 1000
override def receiveCommand: Receive = {
  case SaveSnapshotSuccess(metadata)         => // ...
  case SaveSnapshotFailure(metadata, reason) => // ...
  case cmd: String =>
    persist(s"evt-$cmd") { e =>
      updateState(e)
      if (lastSequenceNr % snapShotInterval == 0 && lastSequenceNr != 0)
        saveSnapshot(state)
    }
}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/persistence/LambdaPersistenceDocTest.java#L262-L292 "Go to snippet source")private Object state;
private int snapShotInterval = 1000;

@Override
public Receive createReceive() {
  return receiveBuilder()
      .match(
          SaveSnapshotSuccess.class,
          ss -> {
            SnapshotMetadata metadata = ss.metadata();
            // ...
          })
      .match(
          SaveSnapshotFailure.class,
          sf -> {
            SnapshotMetadata metadata = sf.metadata();
            // ...
          })
      .match(
          String.class,
          cmd -> {
            persist(
                "evt-" + cmd,
                e -> {
                  updateState(e);
                  if (lastSequenceNr() % snapShotInterval == 0 && lastSequenceNr() != 0)
                    saveSnapshot(state);
                });
          })
      .build();
}
```

where `metadata` is of type [`SnapshotMetadata`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/SnapshotMetadata.html "akka.persistence.SnapshotMetadata")[`SnapshotMetadata`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/SnapshotMetadata.html "akka.persistence.SnapshotMetadata") and contains:

- persistenceId
- sequenceNr
- timestamp

During recovery, the persistent actor is offered the latest saved snapshot via a [`SnapshotOffer`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/SnapshotOffer.html "akka.persistence.SnapshotOffer")[`SnapshotOffer`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/SnapshotOffer.html "akka.persistence.SnapshotOffer") message from which it can initialize internal state.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/persistence/PersistenceDocSpec.scala#L188-L194 "Go to snippet source")var state: Any = _

override def receiveRecover: Receive = {
  case SnapshotOffer(metadata, offeredSnapshot) => state = offeredSnapshot
  case RecoveryCompleted                        =>
  case event                                    => // ...
}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/persistence/LambdaPersistenceDocTest.java#L327-L344 "Go to snippet source")private Object state;

@Override
public Receive createReceiveRecover() {
  return receiveBuilder()
      .match(
          SnapshotOffer.class,
          s -> {
            state = s.snapshot();
            // ...
          })
      .match(
          String.class,
          s -> {
            /* ...*/
          })
      .build();
}
```

The replayed messages that follow the `SnapshotOffer` message, if any, are younger than the offered snapshot. They finally recover the persistent actor to its current (i.e. latest) state.

In general, a persistent actor is only offered a snapshot if that persistent actor has previously saved one or more snapshots and at least one of these snapshots matches the [`SnapshotSelectionCriteria`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/SnapshotSelectionCriteria.html "akka.persistence.SnapshotSelectionCriteria")[`SnapshotSelectionCriteria`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/SnapshotSelectionCriteria.html "akka.persistence.SnapshotSelectionCriteria") that can be specified for recovery.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/persistence/PersistenceDocSpec.scala#L182-L184 "Go to snippet source")override def recovery =
  Recovery(
    fromSnapshot = SnapshotSelectionCriteria(maxSequenceNr = 457L, maxTimestamp = System.currentTimeMillis))
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/persistence/LambdaPersistenceDocTest.java#L319-L323 "Go to snippet source")@Override
public Recovery recovery() {
  return Recovery.create(
      SnapshotSelectionCriteria.create(457L, System.currentTimeMillis()));
}
```

If not specified, they default to [`SnapshotSelectionCriteria.Latest`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/SnapshotSelectionCriteria$.html#Latest:akka.persistence.SnapshotSelectionCriteria "akka.persistence.SnapshotSelectionCriteria")[`SnapshotSelectionCriteria.latest()`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/SnapshotSelectionCriteria.html#latest() "akka.persistence.SnapshotSelectionCriteria") which selects the latest (\= youngest) snapshot. To disable snapshot\-based recovery, applications should use [`SnapshotSelectionCriteria.None`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/SnapshotSelectionCriteria$.html#None:akka.persistence.SnapshotSelectionCriteria "akka.persistence.SnapshotSelectionCriteria")[`SnapshotSelectionCriteria.none()`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/SnapshotSelectionCriteria.html#none() "akka.persistence.SnapshotSelectionCriteria"). A recovery where no saved snapshot matches the specified `SnapshotSelectionCriteria` will replay all journaled messages.

Note
In order to use snapshots, a default snapshot\-store (`akka.persistence.snapshot-store.plugin`) must be configured, or the `PersistentActor`persistent actor can pick a snapshot store explicitly by overriding `def snapshotPluginId: String``String snapshotPluginId()`.

Because some use cases may not benefit from or need snapshots, it is perfectly valid not to not configure a snapshot store. However, Akka will log a warning message when this situation is detected and then continue to operate until an actor tries to store a snapshot, at which point the operation will fail (by replying with an [`SaveSnapshotFailure`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/SaveSnapshotFailure.html "akka.persistence.SaveSnapshotFailure")[`SaveSnapshotFailure`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/SaveSnapshotFailure.html "akka.persistence.SaveSnapshotFailure") for example).

Note that the “persistence mode” of [Cluster Sharding](cluster-sharding.html) makes use of snapshots. If you use that mode, you’ll need to define a snapshot store plugin.

### Snapshot deletion

A persistent actor can delete individual snapshots by calling the [`deleteSnapshot`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/Snapshotter.html#deleteSnapshot(sequenceNr:Long):Unit "akka.persistence.Snapshotter")[`deleteSnapshot`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/Snapshotter.html#deleteSnapshot(long) "akka.persistence.Snapshotter") method with the sequence number of when the snapshot was taken.

To bulk\-delete a range of snapshots matching [`SnapshotSelectionCriteria`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/SnapshotSelectionCriteria.html "akka.persistence.SnapshotSelectionCriteria")[`SnapshotSelectionCriteria`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/SnapshotSelectionCriteria.html "akka.persistence.SnapshotSelectionCriteria"), persistent actors should use the [`deleteSnapshots`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/Snapshotter.html#deleteSnapshots(criteria:akka.persistence.SnapshotSelectionCriteria):Unit "akka.persistence.Snapshotter")[`deleteSnapshots`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/Snapshotter.html#deleteSnapshots(akka.persistence.SnapshotSelectionCriteria) "akka.persistence.Snapshotter") method. Depending on the journal used this might be inefficient. It is best practice to do specific deletes with `deleteSnapshot` or to include a `minSequenceNr` as well as a `maxSequenceNr` for the `SnapshotSelectionCriteria`.

### Snapshot status handling

Saving or deleting snapshots can either succeed or fail – this information is reported back to the persistent actor via status messages as illustrated in the following table.

| **Method** | **Success** | **Failure message** |
| --- | --- | --- |
| `saveSnapshot(Any)` | `SaveSnapshotSuccess` | `SaveSnapshotFailure` |
| `deleteSnapshot(Long)` | `DeleteSnapshotSuccess` | `DeleteSnapshotFailure` |
| `deleteSnapshots(SnapshotSelectionCriteria)` | `DeleteSnapshotsSuccess` | `DeleteSnapshotsFailure` |

If failure messages are left unhandled by the actor, a default warning log message will be logged for each incoming failure message. No default action is performed on the success messages, however you’re free to handle them e.g. in order to delete an in memory representation of the snapshot, or in the case of failure to attempt save the snapshot again.

### Optional snapshots

By default, the persistent actor will unconditionally be stopped if the snapshot can’t be loaded in the recovery. It is possible to make snapshot loading optional. This can be useful when it is alright to ignore snapshot in case of for example deserialization errors. When snapshot loading fails it will instead recover by replaying all events.

Enable this feature by setting `snapshot-is-optional = true` in the snapshot store configuration. 

Warning
Don’t set `snapshot-is-optional = true` if events have been deleted because that would result in wrong recovered state if snapshot load fails.

## Scaling out

See [Scaling out](typed/persistence.html#scaling-out) in the documentation of the new API.

## At\-Least\-Once Delivery

To send messages with at\-least\-once delivery semantics to destinations you can mix\-in [`AtLeastOnceDelivery`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/AtLeastOnceDelivery.html "akka.persistence.AtLeastOnceDelivery") trait to your [`PersistentActor`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/PersistentActor.html "akka.persistence.PersistentActor")extend the [`AbstractPersistentActorWithAtLeastOnceDelivery`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/AbstractPersistentActorWithAtLeastOnceDelivery.html "akka.persistence.AbstractPersistentActorWithAtLeastOnceDelivery") class instead of [`AbstractPersistentActor`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/AbstractPersistentActor.html "akka.persistence.AbstractPersistentActor") on the sending side. It takes care of re\-sending messages when they have not been confirmed within a configurable timeout.

The state of the sending actor, including which messages have been sent that have not been confirmed by the recipient must be persistent so that it can survive a crash of the sending actor or JVM. The `AtLeastOnceDelivery` trait`AbstractPersistentActorWithAtLeastOnceDelivery` class does not persist anything by itself. It is your responsibility to persist the intent that a message is sent and that a confirmation has been received.

Note
At\-least\-once delivery implies that original message sending order is not always preserved, and the destination may receive duplicate messages. Semantics do not match those of a normal [`ActorRef`](https://doc.akka.io/api/akka-core/2.10/akka/actor/ActorRef.html "akka.actor.ActorRef")[`ActorRef`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorRef.html "akka.actor.ActorRef") send operation:

- it is not at\-most\-once delivery
- message order for the same sender–receiver pair is not preserved due to possible resends
- after a crash and restart of the destination messages are still delivered to the new actor incarnation

These semantics are similar to what an [`ActorPath`](https://doc.akka.io/api/akka-core/2.10/akka/actor/ActorPath.html "akka.actor.ActorPath")[`ActorPath`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorPath.html "akka.actor.ActorPath") represents (see [Actor Lifecycle](actors.html#actor-lifecycle)), therefore you need to supply a path and not a reference when delivering messages. The messages are sent to the path with an actor selection.

Use the [`deliver`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/AtLeastOnceDelivery.html#deliver(destination:akka.actor.ActorPath)(deliveryIdToMessage:Long=%3EAny):Unit "akka.persistence.AtLeastOnceDelivery")[`deliver`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/AbstractPersistentActorWithAtLeastOnceDelivery.html#deliver(akka.actor.ActorPath,akka.japi.Function) "akka.persistence.AbstractPersistentActorWithAtLeastOnceDelivery") method to send a message to a destination. Call the [`confirmDelivery`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/AtLeastOnceDelivery.html#confirmDelivery(deliveryId:Long):Boolean "akka.persistence.AtLeastOnceDelivery")[`confirmDelivery`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/AtLeastOnceDeliveryLike.html#confirmDelivery(long) "akka.persistence.AtLeastOnceDeliveryLike") method when the destination has replied with a confirmation message.

### Relationship between deliver and confirmDelivery

To send messages to the destination path, use the `deliver` method after you have persisted the intent to send the message.

The destination actor must send back a confirmation message. When the sending actor receives this confirmation message you should persist the fact that the message was delivered successfully and then call the `confirmDelivery` method.

If the persistent actor is not currently recovering, the `deliver` method will send the message to the destination actor. When recovering, messages will be buffered until they have been confirmed using `confirmDelivery`. Once recovery has completed, if there are outstanding messages that have not been confirmed (during the message replay), the persistent actor will resend these before sending any other messages.

Deliver requires a `deliveryIdToMessage` function to pass the provided `deliveryId` into the message so that the correlation between `deliver` and `confirmDelivery` is possible. The `deliveryId` must do the round trip. Upon receipt of the message, the destination actor will send the same`deliveryId` wrapped in a confirmation message back to the sender. The sender will then use it to call `confirmDelivery` method to complete the delivery routine.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/persistence/PersistenceDocSpec.scala#L109-L146 "Go to snippet source")import akka.actor.{ Actor, ActorSelection }
import akka.persistence.AtLeastOnceDelivery

case class Msg(deliveryId: Long, s: String)
case class Confirm(deliveryId: Long)

sealed trait Evt
case class MsgSent(s: String) extends Evt
case class MsgConfirmed(deliveryId: Long) extends Evt

class MyPersistentActor(destination: ActorSelection) extends PersistentActor with AtLeastOnceDelivery {

  override def persistenceId: String = "persistence-id"

  override def receiveCommand: Receive = {
    case s: String           => persist(MsgSent(s))(updateState)
    case Confirm(deliveryId) => persist(MsgConfirmed(deliveryId))(updateState)
  }

  override def receiveRecover: Receive = {
    case evt: Evt => updateState(evt)
  }

  def updateState(evt: Evt): Unit = evt match {
    case MsgSent(s) =>
      deliver(destination)(deliveryId => Msg(deliveryId, s))

    case MsgConfirmed(deliveryId) => confirmDelivery(deliveryId)
  }
}

class MyDestination extends Actor {
  def receive = {
    case Msg(deliveryId, s) =>
      // ...
      sender() ! Confirm(deliveryId)
  }
}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/persistence/LambdaPersistenceDocTest.java#L155-L250 "Go to snippet source")  
class Msg implements Serializable {
  private static final long serialVersionUID = 1L;
  public final long deliveryId;
  public final String s;

  public Msg(long deliveryId, String s) {
    this.deliveryId = deliveryId;
    this.s = s;
  }
}

class Confirm implements Serializable {
  private static final long serialVersionUID = 1L;
  public final long deliveryId;

  public Confirm(long deliveryId) {
    this.deliveryId = deliveryId;
  }
}

class MsgSent implements Serializable {
  private static final long serialVersionUID = 1L;
  public final String s;

  public MsgSent(String s) {
    this.s = s;
  }
}

class MsgConfirmed implements Serializable {
  private static final long serialVersionUID = 1L;
  public final long deliveryId;

  public MsgConfirmed(long deliveryId) {
    this.deliveryId = deliveryId;
  }
}

class MyPersistentActor extends AbstractPersistentActorWithAtLeastOnceDelivery {
  private final ActorSelection destination;

  public MyPersistentActor(ActorSelection destination) {
    this.destination = destination;
  }

  @Override
  public String persistenceId() {
    return "persistence-id";
  }

  @Override
  public Receive createReceive() {
    return receiveBuilder()
        .match(
            String.class,
            s -> {
              persist(new MsgSent(s), evt -> updateState(evt));
            })
        .match(
            Confirm.class,
            confirm -> {
              persist(new MsgConfirmed(confirm.deliveryId), evt -> updateState(evt));
            })
        .build();
  }

  @Override
  public Receive createReceiveRecover() {
    return receiveBuilder().match(Object.class, evt -> updateState(evt)).build();
  }

  void updateState(Object event) {
    if (event instanceof MsgSent) {
      final MsgSent evt = (MsgSent) event;
      deliver(destination, deliveryId -> new Msg(deliveryId, evt.s));
    } else if (event instanceof MsgConfirmed) {
      final MsgConfirmed evt = (MsgConfirmed) event;
      confirmDelivery(evt.deliveryId);
    }
  }
}

class MyDestination extends AbstractActor {
  @Override
  public Receive createReceive() {
    return receiveBuilder()
        .match(
            Msg.class,
            msg -> {
              // ...
              getSender().tell(new Confirm(msg.deliveryId), getSelf());
            })
        .build();
  }
}
```

The `deliveryId` generated by the persistence module is a strictly monotonically increasing sequence number without gaps. The same sequence is used for all destinations of the actor, i.e. when sending to multiple destinations the destinations will see gaps in the sequence. It is not possible to use custom `deliveryId`. However, you can send a custom correlation identifier in the message to the destination. You must then retain a mapping between the internal `deliveryId` (passed into the `deliveryIdToMessage` function) and your custom correlation id (passed into the message). You can do this by storing such mapping in a `Map(correlationId -> deliveryId)` from which you can retrieve the `deliveryId` to be passed into the `confirmDelivery` method once the receiver of your message has replied with your custom correlation id.

The [`AtLeastOnceDelivery`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/AtLeastOnceDelivery.html "akka.persistence.AtLeastOnceDelivery") trait[`AbstractPersistentActorWithAtLeastOnceDelivery`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/AbstractPersistentActorWithAtLeastOnceDelivery.html "akka.persistence.AbstractPersistentActorWithAtLeastOnceDelivery") class has a state consisting of unconfirmed messages and a sequence number. It does not store this state itself. You must persist events corresponding to the [`deliver`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/AtLeastOnceDelivery.html#deliver(destination:akka.actor.ActorPath)(deliveryIdToMessage:Long=%3EAny):Unit "akka.persistence.AtLeastOnceDelivery")[`deliver`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/AbstractPersistentActorWithAtLeastOnceDelivery.html#deliver(akka.actor.ActorPath,akka.japi.Function) "akka.persistence.AbstractPersistentActorWithAtLeastOnceDelivery") and [`confirmDelivery`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/AtLeastOnceDelivery.html#confirmDelivery(deliveryId:Long):Boolean "akka.persistence.AtLeastOnceDelivery")[`confirmDelivery`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/AtLeastOnceDeliveryLike.html#confirmDelivery(long) "akka.persistence.AtLeastOnceDeliveryLike") invocations from your `PersistentActor` so that the state can be restored by calling the same methods during the recovery phase of the `PersistentActor`. Sometimes these events can be derived from other business level events, and sometimes you must create separate events. During recovery, calls to `deliver` will not send out messages, those will be sent later if no matching `confirmDelivery` will have been performed.

Support for snapshots is provided by [`getDeliverySnapshot`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/AtLeastOnceDeliveryLike.html#getDeliverySnapshot:akka.persistence.AtLeastOnceDelivery.AtLeastOnceDeliverySnapshot "akka.persistence.AtLeastOnceDeliveryLike")[`getDeliverySnapshot`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/AtLeastOnceDeliveryLike.html#getDeliverySnapshot() "akka.persistence.AtLeastOnceDeliveryLike") and [`setDeliverySnapshot`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/AtLeastOnceDeliveryLike.html#setDeliverySnapshot(snapshot:akka.persistence.AtLeastOnceDelivery.AtLeastOnceDeliverySnapshot):Unit "akka.persistence.AtLeastOnceDeliveryLike")[`setDeliverySnapshot`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/AtLeastOnceDeliveryLike.html#setDeliverySnapshot(akka.persistence.AtLeastOnceDelivery.AtLeastOnceDeliverySnapshot) "akka.persistence.AtLeastOnceDeliveryLike"). The [`AtLeastOnceDeliverySnapshot`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/AtLeastOnceDelivery$$AtLeastOnceDeliverySnapshot.html "akka.persistence.AtLeastOnceDelivery.AtLeastOnceDeliverySnapshot")[`AtLeastOnceDeliverySnapshot`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/AtLeastOnceDelivery.AtLeastOnceDeliverySnapshot.html "akka.persistence.AtLeastOnceDelivery.AtLeastOnceDeliverySnapshot") contains the full delivery state, including unconfirmed messages. If you need a custom snapshot for other parts of the actor state you must also include the `AtLeastOnceDeliverySnapshot`. It is serialized using protobuf with the ordinary Akka serialization mechanism. It is easiest to include the bytes of the `AtLeastOnceDeliverySnapshot` as a blob in your custom snapshot.

The interval between redelivery attempts is defined by the [`redeliverInterval`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/AtLeastOnceDeliveryLike.html#redeliverInterval:scala.concurrent.duration.FiniteDuration "akka.persistence.AtLeastOnceDeliveryLike")[`redeliverInterval`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/AtLeastOnceDeliveryLike.html#redeliverInterval() "akka.persistence.AtLeastOnceDeliveryLike") method. The default value can be configured with the `akka.persistence.at-least-once-delivery.redeliver-interval` configuration key. The method can be overridden by implementation classes to return non\-default values.

The maximum number of messages that will be sent at each redelivery burst is defined by the [`redeliverBurstLimit`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/AtLeastOnceDeliveryLike.html#redeliveryBurstLimit:Int "akka.persistence.AtLeastOnceDeliveryLike")[`redeliverBurstLimit`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/AtLeastOnceDeliveryLike.html#redeliveryBurstLimit() "akka.persistence.AtLeastOnceDeliveryLike") method (burst frequency is half of the redelivery interval). If there’s a lot of unconfirmed messages (e.g. if the destination is not available for a long time), this helps to prevent an overwhelming amount of messages to be sent at once. The default value can be configured with the `akka.persistence.at-least-once-delivery.redelivery-burst-limit` configuration key. The method can be overridden by implementation classes to return non\-default values.

After a number of delivery attempts a [`UnconfirmedWarning`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/AtLeastOnceDelivery$$UnconfirmedWarning.html "akka.persistence.AtLeastOnceDelivery.UnconfirmedWarning")[`UnconfirmedWarning`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/AtLeastOnceDelivery.UnconfirmedWarning.html "akka.persistence.AtLeastOnceDelivery.UnconfirmedWarning") message will be sent to `self`. The re\-sending will still continue, but you can choose to call `confirmDelivery` to cancel the re\-sending. The number of delivery attempts before emitting the warning is defined by the [`warnAfterNumberOfUnconfirmedAttempts`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/AtLeastOnceDeliveryLike.html#warnAfterNumberOfUnconfirmedAttempts:Int "akka.persistence.AtLeastOnceDeliveryLike")[`warnAfterNumberOfUnconfirmedAttempts`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/AtLeastOnceDeliveryLike.html#warnAfterNumberOfUnconfirmedAttempts() "akka.persistence.AtLeastOnceDeliveryLike") method. The default value can be configured with the `akka.persistence.at-least-once-delivery.warn-after-number-of-unconfirmed-attempts` configuration key. The method can be overridden by implementation classes to return non\-default values.

The [`AtLeastOnceDelivery`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/AtLeastOnceDelivery.html "akka.persistence.AtLeastOnceDelivery") trait[`AbstractPersistentActorWithAtLeastOnceDelivery`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/AbstractPersistentActorWithAtLeastOnceDelivery.html "akka.persistence.AbstractPersistentActorWithAtLeastOnceDelivery") class holds messages in memory until their successful delivery has been confirmed. The maximum number of unconfirmed messages that the actor is allowed to hold in memory is defined by the [`maxUnconfirmedMessages`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/AtLeastOnceDeliveryLike.html#maxUnconfirmedMessages:Int "akka.persistence.AtLeastOnceDeliveryLike")[`maxUnconfirmedMessages`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/AtLeastOnceDeliveryLike.html#maxUnconfirmedMessages() "akka.persistence.AtLeastOnceDeliveryLike") method. If this limit is exceed the `deliver` method will not accept more messages and it will throw [`AtLeastOnceDelivery.MaxUnconfirmedMessagesExceededException`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/AtLeastOnceDelivery$$MaxUnconfirmedMessagesExceededException.html "akka.persistence.AtLeastOnceDelivery.MaxUnconfirmedMessagesExceededException")[`AtLeastOnceDelivery.MaxUnconfirmedMessagesExceededException`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/AtLeastOnceDelivery.MaxUnconfirmedMessagesExceededException.html "akka.persistence.AtLeastOnceDelivery.MaxUnconfirmedMessagesExceededException"). The default value can be configured with the `akka.persistence.at-least-once-delivery.max-unconfirmed-messages` configuration key. The method can be overridden by implementation classes to return non\-default values.

## Event Adapters

In long running projects using Event Sourcing sometimes the need arises to detach the data model from the domain model completely.

Event Adapters help in situations where:

- **Version Migrations** – existing events stored in *Version 1* should be “upcasted” to a new *Version 2* representation, and the process of doing so involves actual code, not just changes on the serialization layer. For these scenarios the [`toJournal`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/journal/WriteEventAdapter.html#toJournal(event:Any):Any "akka.persistence.journal.WriteEventAdapter")[`toJournal`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/journal/WriteEventAdapter.html#toJournal(java.lang.Object) "akka.persistence.journal.WriteEventAdapter") function is usually an identity function, however the [`fromJournal`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/journal/ReadEventAdapter.html#fromJournal(event:Any,manifest:String):akka.persistence.journal.EventSeq "akka.persistence.journal.ReadEventAdapter")[`fromJournal`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/journal/ReadEventAdapter.html#fromJournal(java.lang.Object,java.lang.String) "akka.persistence.journal.ReadEventAdapter") is implemented as `v1.Event=>v2.Event`, performing the necessary mapping inside the fromJournal method. This technique is sometimes referred to as “upcasting” in other CQRS libraries.
- **Separating Domain and Data models** – thanks to EventAdapters it is possible to completely separate the domain model from the model used to persist data in the Journals. For example one may want to use case classes in the domain model, however persist their protocol\-buffer (or any other binary serialization format) counter\-parts to the Journal. A simple `toJournal:MyModel=>MyDataModel` and `fromJournal:MyDataModel=>MyModel` adapter can be used to implement this feature.
- **Journal Specialized Data Types** – exposing data types understood by the underlying Journal, for example for data stores which understand JSON it is possible to write an EventAdapter `toJournal:Any=>JSON` such that the Journal can *directly* store the json instead of serializing the object to its binary representation.

Implementing an EventAdapter is rather straightforward:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/persistence/PersistenceEventAdapterDocSpec.scala#L147-L157 "Go to snippet source")@nowarn("msg=never used") // required constructor parameter
class MyEventAdapter(system: ExtendedActorSystem) extends EventAdapter {
  override def manifest(event: Any): String =
    "" // when no manifest needed, return ""

  override def toJournal(event: Any): Any =
    event // identity

  override def fromJournal(event: Any, manifest: String): EventSeq =
    EventSeq.single(event) // identity
}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/persistence/PersistenceEventAdapterDocTest.java#L15-L30 "Go to snippet source")class MyEventAdapter implements EventAdapter {
  @Override
  public String manifest(Object event) {
    return ""; // if no manifest needed, return ""
  }

  @Override
  public Object toJournal(Object event) {
    return event; // identity
  }

  @Override
  public EventSeq fromJournal(Object event, String manifest) {
    return EventSeq.single(event); // identity
  }
}
```

Then in order for it to be used on events coming to and from the journal you must bind it using the below configuration syntax:

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/persistence/PersistenceEventAdapterDocSpec.scala#L22-L36 "Go to snippet source")akka.persistence.journal {
  inmem {
    event-adapters {
      tagging        = "docs.persistence.MyTaggingEventAdapter"
      user-upcasting = "docs.persistence.UserUpcastingEventAdapter"
      item-upcasting = "docs.persistence.ItemUpcastingEventAdapter"
    }

    event-adapter-bindings {
      "docs.persistence.Item"        = tagging
      "docs.persistence.TaggedEvent" = tagging
      "docs.persistence.v1.Event"    = [user-upcasting, item-upcasting]
    }
  }
}
```

It is possible to bind multiple adapters to one class *for recovery*, in which case the `fromJournal` methods of all bound adapters will be applied to a given matching event (in order of definition in the configuration). Since each adapter may return from `0` to `n` adapted events (called as `EventSeq`), each adapter can investigate the event and if it should indeed adapt it return the adapted event(s) for it. Other adapters which do not have anything to contribute during this adaptation simply return [`EventSeq.empty`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/journal/EventSeq$.html#empty:akka.persistence.journal.EventSeq "akka.persistence.journal.EventSeq")[`EventSeq.empty`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/journal/EventSeq.html#empty() "akka.persistence.journal.EventSeq"). The adapted events are then delivered in\-order to the `PersistentActor` during replay.

Note
For more advanced schema evolution techniques refer to the [Persistence \- Schema Evolution](persistence-schema-evolution.html) documentation.

## Custom serialization

Serialization of snapshots and payloads of `Persistent` messages is configurable with Akka’s [Serialization](serialization.html) infrastructure. For example, if an application wants to serialize

- payloads of type `MyPayload` with a custom `MyPayloadSerializer` and
- snapshots of type `MySnapshot` with a custom `MySnapshotSerializer`

it must add

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/persistence/PersistenceSerializerDocSpec.scala#L20-L29 "Go to snippet source")akka.actor {
  serializers {
    my-payload = "docs.persistence.MyPayloadSerializer"
    my-snapshot = "docs.persistence.MySnapshotSerializer"
  }
  serialization-bindings {
    "docs.persistence.MyPayload" = my-payload
    "docs.persistence.MySnapshot" = my-snapshot
  }
}
```

to the application configuration. If not specified, an exception will be throw when trying to persist events or snapshots.

For more advanced schema evolution techniques refer to the [Persistence \- Schema Evolution](persistence-schema-evolution.html) documentation.

## Testing with LevelDB journal

The LevelDB journal is deprecated and will be removed from a future Akka version, it is not advised to build new applications with it. For testing the built in “inmem” journal or the actual journal that will be used in production of the application is recommended. See [Persistence Plugins](persistence-plugins.html) for some journal implementation choices.

When running tests with LevelDB default settings in `sbt`, make sure to set `fork := true` in your sbt project. Otherwise, you’ll see an [`UnsatisfiedLinkError`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/UnsatisfiedLinkError.html "java.lang.UnsatisfiedLinkError"). Alternatively, you can switch to a LevelDB Java port by setting

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/persistence/PersistencePluginDocSpec.scala#L48 "Go to snippet source")akka.persistence.journal.leveldb.native = off
```

or

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/persistence/PersistencePluginDocSpec.scala#L119 "Go to snippet source")akka.persistence.journal.leveldb-shared.store.native = off
```

in your Akka configuration. Also note that for the LevelDB Java port, you will need the following dependencies:

sbt
```
libraryDependencies += "org.iq80.leveldb" % "leveldb" % "0.9"
```
Maven
```
<dependencies&gt
  <dependency>
    <groupId>org.iq80.leveldb</groupId>
    <artifactId>leveldb</artifactId>
    <version>0.9</version>
  </dependency&gt
</dependencies>
```
Gradle
```
dependencies {
  implementation "org.iq80.leveldb:leveldb:0.9"
}
```
Java 17
When using LevelDB with Java 17 you have to add JVM flag `--add-opens=java.base/java.nio=ALL-UNNAMED`. 

Warning
It is not possible to test persistence provided classes (i.e. `PersistentActor` and [AtLeastOnceDelivery](persistence.html#at-least-once-delivery)) using [`TestActorRef`](https://doc.akka.io/api/akka-core/2.10/akka/testkit/TestActorRef.html "akka.testkit.TestActorRef")[`TestActorRef`](https://doc.akka.io/japi/akka-core/2.10/akka/testkit/TestActorRef.html "akka.testkit.TestActorRef") due to its *synchronous* nature. These traits need to be able to perform asynchronous tasks in the background in order to handle internal persistence related events.

When testing Persistence based projects always rely on [asynchronous messaging using the TestKit](testing.html#async-integration-testing).

## Configuration

There are several configuration properties for the persistence module, please refer to the [reference configuration](general/configuration-reference.html#config-akka-persistence).

The [journal and snapshot store plugins](persistence-plugins.html) have specific configuration, see reference documentation of the chosen plugin.

## Multiple persistence plugin configurations

By default, a persistent actor will use the “default” journal and snapshot store plugins configured in the following sections of the `reference.conf` configuration resource:

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/persistence/PersistenceMultiDocSpec.scala#L13-L16 "Go to snippet source")# Absolute path to the default journal plugin configuration entry.
akka.persistence.journal.plugin = "akka.persistence.journal.inmem"
# Absolute path to the default snapshot store plugin configuration entry.
akka.persistence.snapshot-store.plugin = "akka.persistence.snapshot-store.local"
```

Note that in this case the actor overrides only the [`persistenceId`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/PersistenceIdentity.html#persistenceId:String "akka.persistence.PersistenceIdentity")[`persistenceId`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/PersistenceIdentity.html#persistenceId() "akka.persistence.PersistenceIdentity") method:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/persistence/PersistenceMultiDocSpec.scala#L21-L24 "Go to snippet source")trait ActorWithDefaultPlugins extends PersistentActor {
  override def persistenceId = "123"
}

```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/persistence/PersistenceMultiDocTest.java#L15-L20 "Go to snippet source")abstract class AbstractPersistentActorWithDefaultPlugins extends AbstractPersistentActor {
  @Override
  public String persistenceId() {
    return "123";
  }
}
```

When the persistent actor overrides the [`journalPluginId`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/PersistenceIdentity.html#journalPluginId:String "akka.persistence.PersistenceIdentity")[`journalPluginId`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/PersistenceIdentity.html#journalPluginId() "akka.persistence.PersistenceIdentity") and [`snapshotPluginId`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/PersistenceIdentity.html#snapshotPluginId:String "akka.persistence.PersistenceIdentity")[`snapshotPluginId`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/PersistenceIdentity.html#snapshotPluginId() "akka.persistence.PersistenceIdentity") methods, the actor will be serviced by these specific persistence plugins instead of the defaults:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/persistence/PersistenceMultiDocSpec.scala#L48-L57 "Go to snippet source")trait ActorWithOverridePlugins extends PersistentActor {
  override def persistenceId = "123"

  // Absolute path to the journal plugin configuration entry in the `reference.conf`.
  override def journalPluginId = "akka.persistence.chronicle.journal"

  // Absolute path to the snapshot store plugin configuration entry in the `reference.conf`.
  override def snapshotPluginId = "akka.persistence.chronicle.snapshot-store"
}

```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/persistence/PersistenceMultiDocTest.java#L24-L41 "Go to snippet source")abstract class AbstractPersistentActorWithOverridePlugins extends AbstractPersistentActor {
  @Override
  public String persistenceId() {
    return "123";
  }

  // Absolute path to the journal plugin configuration entry in the `reference.conf`
  @Override
  public String journalPluginId() {
    return "akka.persistence.chronicle.journal";
  }

  // Absolute path to the snapshot store plugin configuration entry in the `reference.conf`
  @Override
  public String snapshotPluginId() {
    return "akka.persistence.chronicle.snapshot-store";
  }
}
```

Note that `journalPluginId` and `snapshotPluginId` must refer to properly configured `reference.conf` plugin entries with a standard `class` property as well as settings which are specific for those plugins, i.e.:

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/persistence/PersistenceMultiDocSpec.scala#L30-L43 "Go to snippet source")# Configuration entry for the custom journal plugin, see `journalPluginId`.
akka.persistence.chronicle.journal {
  # Standard persistence extension property: provider FQCN.
  class = "akka.persistence.chronicle.ChronicleSyncJournal"
  # Custom setting specific for the journal `ChronicleSyncJournal`.
  folder = $${user.dir}/store/journal
}
# Configuration entry for the custom snapshot store plugin, see `snapshotPluginId`.
akka.persistence.chronicle.snapshot-store {
  # Standard persistence extension property: provider FQCN.
  class = "akka.persistence.chronicle.ChronicleSnapshotStore"
  # Custom setting specific for the snapshot store `ChronicleSnapshotStore`.
  folder = $${user.dir}/store/snapshot
}
```

## Give persistence plugin configurations at runtime

By default, a persistent actor will use the configuration loaded at [`ActorSystem`](https://doc.akka.io/api/akka-core/2.10/akka/actor/ActorSystem.html "akka.actor.ActorSystem")[`ActorSystem`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorSystem.html "akka.actor.ActorSystem") creation time to create journal and snapshot store plugins.

When the persistent actor overrides the [`journalPluginConfig`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/RuntimePluginConfig.html#journalPluginConfig:com.typesafe.config.Config "akka.persistence.RuntimePluginConfig")[`journalPluginConfig`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/RuntimePluginConfig.html#journalPluginConfig() "akka.persistence.RuntimePluginConfig") and [`snapshotPluginConfig`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/RuntimePluginConfig.html#snapshotPluginConfig:com.typesafe.config.Config "akka.persistence.RuntimePluginConfig")[`snapshotPluginConfig`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/RuntimePluginConfig.html#snapshotPluginConfig() "akka.persistence.RuntimePluginConfig") methods, the actor will use the declared [`Config`](https://javadoc.io/doc/com.typesafe/config/latest/com/typesafe/config/Config.html "com.typesafe.config.Config") objects with a fallback on the default configuration. It allows a dynamic configuration of the journal and the snapshot store at runtime:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/persistence/PersistenceMultiDocSpec.scala#L61-L94 "Go to snippet source")trait ActorWithRuntimePluginConfig extends PersistentActor with RuntimePluginConfig {
  // Variable that is retrieved at runtime, from an external service for instance.
  val runtimeDistinction = "foo"

  override def persistenceId = "123"

  // Absolute path to the journal plugin configuration entry, not defined in the `reference.conf`.
  override def journalPluginId = s"journal-plugin-$runtimeDistinction"

  // Absolute path to the snapshot store plugin configuration entry, not defined in the `reference.conf`.
  override def snapshotPluginId = s"snapshot-store-plugin-$runtimeDistinction"

  // Configuration which contains the journal plugin id defined above
  override def journalPluginConfig =
    ConfigFactory
      .empty()
      .withValue(
        s"journal-plugin-$runtimeDistinction",
        context.system.settings.config
          .getValue("journal-plugin") // or a very different configuration coming from an external service.
      )

  // Configuration which contains the snapshot store plugin id defined above
  override def snapshotPluginConfig =
    ConfigFactory
      .empty()
      .withValue(
        s"snapshot-plugin-$runtimeDistinction",
        context.system.settings.config
          .getValue("snapshot-store-plugin") // or a very different configuration coming from an external service.
      )

}

```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/persistence/PersistenceMultiDocTest.java#L45-L98 "Go to snippet source")abstract class AbstractPersistentActorWithRuntimePluginConfig extends AbstractPersistentActor
    implements RuntimePluginConfig {
  // Variable that is retrieved at runtime, from an external service for instance.
  String runtimeDistinction = "foo";

  @Override
  public String persistenceId() {
    return "123";
  }

  // Absolute path to the journal plugin configuration entry in the `reference.conf`
  @Override
  public String journalPluginId() {
    return "journal-plugin-" + runtimeDistinction;
  }

  // Absolute path to the snapshot store plugin configuration entry in the `reference.conf`
  @Override
  public String snapshotPluginId() {
    return "snapshot-store-plugin-" + runtimeDistinction;
  }

  // Configuration which contains the journal plugin id defined above
  @Override
  public Config journalPluginConfig() {
    return ConfigFactory.empty()
        .withValue(
            "journal-plugin-" + runtimeDistinction,
            getContext()
                .getSystem()
                .settings()
                .config()
                .getValue(
                    "journal-plugin") // or a very different configuration coming from an external
            // service.
            );
  }

  // Configuration which contains the snapshot store plugin id defined above
  @Override
  public Config snapshotPluginConfig() {
    return ConfigFactory.empty()
        .withValue(
            "snapshot-plugin-" + runtimeDistinction,
            getContext()
                .getSystem()
                .settings()
                .config()
                .getValue(
                    "snapshot-store-plugin") // or a very different configuration coming from an
            // external service.
            );
  }
}
```

## See also

- [Persistence plugins](persistence-plugins.html)
- [Building a new storage backend](persistence-journals.html)

## Code Examples

### Example 1: Module info

```scala
val AkkaVersion = "2.10.17"
libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-persistence" % AkkaVersion,
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
    <artifactId>akka-persistence_${scala.binary.version}</artifactId>
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

  implementation "com.typesafe.akka:akka-persistence_${versions.ScalaBinary}"
  testImplementation "com.typesafe.akka:akka-persistence-testkit_${versions.ScalaBinary}"
}
```

### Example 4: Example

```scala
import akka.actor._
import akka.persistence._

case class Cmd(data: String)
case class Evt(data: String)

case class ExampleState(events: List[String] = Nil) {
  def updated(evt: Evt): ExampleState = copy(evt.data :: events)
  def size: Int = events.length
  override def toString: String = events.reverse.toString
}

class ExamplePersistentActor extends PersistentActor {
  override def persistenceId = "sample-id-1"

  var state = ExampleState()

  def updateState(event: Evt): Unit =
    state = state.updated(event)

  def numEvents =
    state.size

  val receiveRecover: Receive = {
    case evt: Evt                                 => updateState(evt)
    case SnapshotOffer(_, snapshot: ExampleState) => state = snapshot
  }

  val snapShotInterval = 1000
  val receiveCommand: Receive = {
    case Cmd(data) =>
      persist(Evt(s"${data}-${numEvents}")) { event =>
        updateState(event)
        context.system.eventStream.publish(event)
        if (lastSequenceNr % snapShotInterval == 0 && lastSequenceNr != 0)
          saveSnapshot(state)
      }
    case "print" => println(state)
  }

}
```

### Example 5: Example

```java
import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;
import akka.persistence.AbstractPersistentActor;
import akka.persistence.SnapshotOffer;
import java.io.Serializable;
import java.util.ArrayList;

class Cmd implements Serializable {
  private static final long serialVersionUID = 1L;
  private final String data;

  public Cmd(String data) {
    this.data = data;
  }

  public String getData() {
    return data;
  }
}

class Evt implements Serializable {
  private static final long serialVersionUID = 1L;
  private final String data;

  public Evt(String data) {
    this.data = data;
  }

  public String getData() {
    return data;
  }
}

class ExampleState implements Serializable {
  private static final long serialVersionUID = 1L;
  private final ArrayList<String> events;

  public ExampleState() {
    this(new ArrayList<>());
  }

  public ExampleState(ArrayList<String> events) {
    this.events = events;
  }

  public ExampleState copy() {
    return new ExampleState(new ArrayList<>(events));
  }

  public void update(Evt evt) {
    events.add(evt.getData());
  }

  public int size() {
    return events.size();
  }

  @Override
  public String toString() {
    return events.toString();
  }
}

class ExamplePersistentActor extends AbstractPersistentActor {

  private ExampleState state = new ExampleState();
  private int snapShotInterval = 1000;

  public int getNumEvents() {
    return state.size();
  }

  @Override
  public String persistenceId() {
    return "sample-id-1";
  }

  @Override
  public Receive createReceiveRecover() {
    return receiveBuilder()
        .match(Evt.class, state::update)
        .match(SnapshotOffer.class, ss -> state = (ExampleState) ss.snapshot())
        .build();
  }

  @Override
  public Receive createReceive() {
    return receiveBuilder()
        .match(
            Cmd.class,
            c -> {
              final String data = c.getData();
              final Evt evt = new Evt(data + "-" + getNumEvents());
              persist(
                  evt,
                  (Evt e) -> {
                    state.update(e);
                    getContext().getSystem().getEventStream().publish(e);
                    if (lastSequenceNr() % snapShotInterval == 0 && lastSequenceNr() != 0)
                      // IMPORTANT: create a copy of snapshot because ExampleState is mutable
                      saveSnapshot(state.copy());
                  });
            })
        .matchEquals("print", s -> System.out.println(state))
        .build();
  }
}
```

### Example 6: Identifiers

```scala
override def persistenceId = "my-stable-persistence-id"
```

### Example 7: Identifiers

```java
@Override
public String persistenceId() {
  return "my-stable-persistence-id";
}
```

### Example 8: Recovery

```text
akka.persistence.max-concurrent-recoveries = 50
```

### Example 9: Recovery customization

```scala
override def recovery =
  Recovery(fromSnapshot = SnapshotSelectionCriteria.None)
```

### Example 10: Recovery customization

```java
@Override
public Recovery recovery() {
  return Recovery.create(SnapshotSelectionCriteria.none());
}
```

### Example 11: Recovery customization

```scala
override def recovery = Recovery(toSequenceNr = 457L)
```

### Example 12: Recovery customization

```java
@Override
public Recovery recovery() {
  return Recovery.create(457L);
}
```

### Example 13: Recovery customization

```scala
override def recovery = Recovery.none
```

### Example 14: Recovery customization

```java
@Override
public Recovery recovery() {
  return Recovery.none();
}
```

### Example 15: Recovery status

```scala
def recoveryRunning: Boolean
def recoveryFinished: Boolean
```

### Example 16: Recovery status

```java
public boolean recoveryRunning();

public boolean recoveryFinished();
```

### Example 17: Recovery status

```scala
override def receiveRecover: Receive = {
  case RecoveryCompleted =>
  // perform init after recovery, before any other messages
  //...
  case evt => //...
}

override def receiveCommand: Receive = {
  case msg => //...
}
```

### Example 18: Recovery status

```java
class MyPersistentActor5 extends AbstractPersistentActor {

  @Override
  public String persistenceId() {
    return "my-stable-persistence-id";
  }

  @Override
  public Receive createReceiveRecover() {
    return receiveBuilder()
        .match(
            RecoveryCompleted.class,
            r -> {
              // perform init after recovery, before any other messages
              // ...
            })
        .match(String.class, this::handleEvent)
        .build();
  }

  @Override
  public Receive createReceive() {
    return receiveBuilder()
        .match(String.class, s -> s.equals("cmd"), s -> persist("evt", this::handleEvent))
        .build();
  }

  private void handleEvent(String event) {
    // update state
    // ...
  }
}
```

### Example 19: Internal stash

```text
akka.actor.default-mailbox.stash-capacity=10000
```

### Example 20: Internal stash

```text
akka.persistence.internal-stash-overflow-strategy=
  "akka.persistence.ThrowExceptionConfigurator"
```

### Example 21: Internal stash

```text
Persistence(context.system).defaultInternalStashOverflowStrategy
```

### Example 22: Internal stash

```text
Persistence.get(getContext().getSystem()).defaultInternalStashOverflowStrategy();
```

### Example 23: Relaxed local consistency requirements and high throughput use-cases

```scala
class MyPersistentActor extends PersistentActor {

  override def persistenceId = "my-stable-persistence-id"

  override def receiveRecover: Receive = {
    case _ => // handle recovery here
  }

  override def receiveCommand: Receive = {
    case c: String => {
      sender() ! c
      persistAsync(s"evt-$c-1") { e =>
        sender() ! e
      }
      persistAsync(s"evt-$c-2") { e =>
        sender() ! e
      }
    }
  }
}

// usage
persistentActor ! "a"
persistentActor ! "b"

// possible order of received messages:
// a
// b
// evt-a-1
// evt-a-2
// evt-b-1
// evt-b-2
```

### Example 24: Relaxed local consistency requirements and high throughput use-cases

```java
class MyPersistentActor extends AbstractPersistentActor {

  @Override
  public String persistenceId() {
    return "my-stable-persistence-id";
  }

  private void handleCommand(String c) {
    getSender().tell(c, getSelf());

    persistAsync(
        String.format("evt-%s-1", c),
        e -> {
          getSender().tell(e, getSelf());
        });
    persistAsync(
        String.format("evt-%s-2", c),
        e -> {
          getSender().tell(e, getSelf());
        });
  }

  @Override
  public Receive createReceiveRecover() {
    return receiveBuilder().match(String.class, this::handleCommand).build();
  }

  @Override
  public Receive createReceive() {
    return receiveBuilder().match(String.class, this::handleCommand).build();
  }
}
```

### Example 25: Deferring actions until preceding persist handlers have executed

```scala
class MyPersistentActor extends PersistentActor {

  override def persistenceId = "my-stable-persistence-id"

  override def receiveRecover: Receive = {
    case _ => // handle recovery here
  }

  override def receiveCommand: Receive = {
    case c: String => {
      sender() ! c
      persistAsync(s"evt-$c-1") { e =>
        sender() ! e
      }
      persistAsync(s"evt-$c-2") { e =>
        sender() ! e
      }
      deferAsync(s"evt-$c-3") { e =>
        sender() ! e
      }
    }
  }
}
```

### Example 26: Deferring actions until preceding persist handlers have executed

```java
class MyPersistentActor extends AbstractPersistentActor {

  @Override
  public String persistenceId() {
    return "my-stable-persistence-id";
  }

  private void handleCommand(String c) {
    persistAsync(
        String.format("evt-%s-1", c),
        e -> {
          getSender().tell(e, getSelf());
        });
    persistAsync(
        String.format("evt-%s-2", c),
        e -> {
          getSender().tell(e, getSelf());
        });

    deferAsync(
        String.format("evt-%s-3", c),
        e -> {
          getSender().tell(e, getSelf());
        });
  }

  @Override
  public Receive createReceiveRecover() {
    return receiveBuilder().match(String.class, this::handleCommand).build();
  }

  @Override
  public Receive createReceive() {
    return receiveBuilder().match(String.class, this::handleCommand).build();
  }
}
```

### Example 27: Deferring actions until preceding persist handlers have executed

```scala
persistentActor ! "a"
persistentActor ! "b"

// order of received messages:
// a
// b
// evt-a-1
// evt-a-2
// evt-a-3
// evt-b-1
// evt-b-2
// evt-b-3
```

### Example 28: Deferring actions until preceding persist handlers have executed

```java
final ActorRef persistentActor = system.actorOf(Props.create(MyPersistentActor.class));
persistentActor.tell("a", sender);
persistentActor.tell("b", sender);

// order of received messages:
// a
// b
// evt-a-1
// evt-a-2
// evt-a-3
// evt-b-1
// evt-b-2
// evt-b-3
```

### Example 29: Deferring actions until preceding persist handlers have executed

```scala
class MyPersistentActor extends PersistentActor {

  override def persistenceId = "my-stable-persistence-id"

  override def receiveRecover: Receive = {
    case _ => // handle recovery here
  }

  override def receiveCommand: Receive = {
    case c: String => {
      sender() ! c
      persist(s"evt-$c-1") { e =>
        sender() ! e
      }
      persist(s"evt-$c-2") { e =>
        sender() ! e
      }
      defer(s"evt-$c-3") { e =>
        sender() ! e
      }
    }
  }
}
```

### Example 30: Deferring actions until preceding persist handlers have executed

```java
class MyPersistentActor extends AbstractPersistentActor {

  @Override
  public String persistenceId() {
    return "my-stable-persistence-id";
  }

  private void handleCommand(String c) {
    persist(
        String.format("evt-%s-1", c),
        e -> {
          sender().tell(e, self());
        });
    persist(
        String.format("evt-%s-2", c),
        e -> {
          sender().tell(e, self());
        });

    defer(
        String.format("evt-%s-3", c),
        e -> {
          sender().tell(e, self());
        });
  }

  @Override
  public Receive createReceiveRecover() {
    return receiveBuilder().match(String.class, this::handleCommand).build();
  }

  @Override
  public Receive createReceive() {
    return receiveBuilder().match(String.class, this::handleCommand).build();
  }
}
```

### Example 31: Nested persist calls

```scala
override def receiveCommand: Receive = {
  case c: String =>
    sender() ! c

    persist(s"$c-1-outer") { outer1 =>
      sender() ! outer1
      persist(s"$c-1-inner") { inner1 =>
        sender() ! inner1
      }
    }

    persist(s"$c-2-outer") { outer2 =>
      sender() ! outer2
      persist(s"$c-2-inner") { inner2 =>
        sender() ! inner2
      }
    }
}
```

### Example 32: Nested persist calls

```java
@Override
public Receive createReceiveRecover() {
  final Procedure<String> replyToSender = event -> getSender().tell(event, getSelf());

  return receiveBuilder()
      .match(
          String.class,
          msg -> {
            persist(
                String.format("%s-outer-1", msg),
                event -> {
                  getSender().tell(event, getSelf());
                  persist(String.format("%s-inner-1", event), replyToSender);
                });

            persist(
                String.format("%s-outer-2", msg),
                event -> {
                  getSender().tell(event, getSelf());
                  persist(String.format("%s-inner-2", event), replyToSender);
                });
          })
      .build();
}
```

### Example 33: Nested persist calls

```scala
persistentActor ! "a"
persistentActor ! "b"

// order of received messages:
// a
// a-outer-1
// a-outer-2
// a-inner-1
// a-inner-2
// and only then process "b"
// b
// b-outer-1
// b-outer-2
// b-inner-1
// b-inner-2
```

### Example 34: Nested persist calls

```java
persistentActor.tell("a", ActorRef.noSender());
persistentActor.tell("b", ActorRef.noSender());

// order of received messages:
// a
// a-outer-1
// a-outer-2
// a-inner-1
// a-inner-2
// and only then process "b"
// b
// b-outer-1
// b-outer-2
// b-inner-1
// b-inner-2
```

### Example 35: Nested persist calls

```scala
override def receiveCommand: Receive = {
  case c: String =>
    sender() ! c
    persistAsync(c + "-outer-1") { outer =>
      sender() ! outer
      persistAsync(c + "-inner-1") { inner =>
        sender() ! inner
      }
    }
    persistAsync(c + "-outer-2") { outer =>
      sender() ! outer
      persistAsync(c + "-inner-2") { inner =>
        sender() ! inner
      }
    }
}
```

### Example 36: Nested persist calls

```java
@Override
public Receive createReceive() {
  final Procedure<String> replyToSender = event -> getSender().tell(event, getSelf());

  return receiveBuilder()
      .match(
          String.class,
          msg -> {
            persistAsync(
                String.format("%s-outer-1", msg),
                event -> {
                  getSender().tell(event, getSelf());
                  persistAsync(String.format("%s-inner-1", event), replyToSender);
                });

            persistAsync(
                String.format("%s-outer-2", msg),
                event -> {
                  getSender().tell(event, getSelf());
                  persistAsync(String.format("%s-inner-1", event), replyToSender);
                });
          })
      .build();
}
```

### Example 37: Nested persist calls

```scala
persistentActor ! "a"
persistentActor ! "b"

// order of received messages:
// a
// b
// a-outer-1
// a-outer-2
// b-outer-1
// b-outer-2
// a-inner-1
// a-inner-2
// b-inner-1
// b-inner-2

// which can be seen as the following causal relationship:
// a -> a-outer-1 -> a-outer-2 -> a-inner-1 -> a-inner-2
// b -> b-outer-1 -> b-outer-2 -> b-inner-1 -> b-inner-2
```

### Example 38: Nested persist calls

```java
persistentActor.tell("a", getSelf());
persistentActor.tell("b", getSelf());

// order of received messages:
// a
// b
// a-outer-1
// a-outer-2
// b-outer-1
// b-outer-2
// a-inner-1
// a-inner-2
// b-inner-1
// b-inner-2

// which can be seen as the following causal relationship:
// a -> a-outer-1 -> a-outer-2 -> a-inner-1 -> a-inner-2
// b -> b-outer-1 -> b-outer-2 -> b-inner-1 -> b-inner-2
```

### Example 39: Failures

```scala
val childProps = Props[MyPersistentActor]()
val props = BackoffSupervisor.props(BackoffOpts
  .onStop(childProps, childName = "myActor", minBackoff = 3.seconds, maxBackoff = 30.seconds, randomFactor = 0.2))
context.actorOf(props, name = "mySupervisor")
```

### Example 40: Failures

```java
@Override
public void preStart() throws Exception {
  final Props childProps = Props.create(MyPersistentActor1.class);
  final Props props =
      BackoffSupervisor.props(
          BackoffOpts.onStop(
              childProps, "myActor", Duration.ofSeconds(3), Duration.ofSeconds(30), 0.2));
  getContext().actorOf(props, "mySupervisor");
  super.preStart();
}
```

### Example 41: Safely shutting down persistent actors

```scala
/** Explicit shutdown message */
case object Shutdown

class SafePersistentActor extends PersistentActor {
  override def persistenceId = "safe-actor"

  override def receiveCommand: Receive = {
    case c: String =>
      println(c)
      persist(s"handle-$c") { println(_) }
    case Shutdown =>
      context.stop(self)
  }

  override def receiveRecover: Receive = {
    case _ => // handle recovery here
  }
}
```

### Example 42: Safely shutting down persistent actors

```java
final class Shutdown {}

class MyPersistentActor extends AbstractPersistentActor {
  @Override
  public String persistenceId() {
    return "some-persistence-id";
  }

  @Override
  public Receive createReceive() {
    return receiveBuilder()
        .match(
            Shutdown.class,
            shutdown -> {
              getContext().stop(getSelf());
            })
        .match(
            String.class,
            msg -> {
              System.out.println(msg);
              persist("handle-" + msg, e -> System.out.println(e));
            })
        .build();
  }

  @Override
  public Receive createReceiveRecover() {
    return receiveBuilder().matchAny(any -> {}).build();
  }
}
```

### Example 43: Safely shutting down persistent actors

```scala
// UN-SAFE, due to PersistentActor's command stashing:
persistentActor ! "a"
persistentActor ! "b"
persistentActor ! PoisonPill
// order of received messages:
// a
//   # b arrives at mailbox, stashing;        internal-stash = [b]
// PoisonPill is an AutoReceivedMessage, is handled automatically
// !! stop !!
// Actor is stopped without handling `b` nor the `a` handler!
```

### Example 44: Safely shutting down persistent actors

```java
// UN-SAFE, due to PersistentActor's command stashing:
persistentActor.tell("a", ActorRef.noSender());
persistentActor.tell("b", ActorRef.noSender());
persistentActor.tell(PoisonPill.getInstance(), ActorRef.noSender());
// order of received messages:
// a
//   # b arrives at mailbox, stashing;        internal-stash = [b]
//   # PoisonPill arrives at mailbox, stashing; internal-stash = [b, Shutdown]
// PoisonPill is an AutoReceivedMessage, is handled automatically
// !! stop !!
// Actor is stopped without handling `b` nor the `a` handler!
```

### Example 45: Safely shutting down persistent actors

```scala
// SAFE:
persistentActor ! "a"
persistentActor ! "b"
persistentActor ! Shutdown
// order of received messages:
// a
//   # b arrives at mailbox, stashing;        internal-stash = [b]
//   # Shutdown arrives at mailbox, stashing; internal-stash = [b, Shutdown]
// handle-a
//   # unstashing;                            internal-stash = [Shutdown]
// b
// handle-b
//   # unstashing;                            internal-stash = []
// Shutdown
// -- stop --
```

### Example 46: Safely shutting down persistent actors

```java
// SAFE:
persistentActor.tell("a", ActorRef.noSender());
persistentActor.tell("b", ActorRef.noSender());
persistentActor.tell(new Shutdown(), ActorRef.noSender());
// order of received messages:
// a
//   # b arrives at mailbox, stashing;        internal-stash = [b]
//   # Shutdown arrives at mailbox, stashing; internal-stash = [b, Shutdown]
// handle-a
//   # unstashing;                            internal-stash = [Shutdown]
// b
// handle-b
//   # unstashing;                            internal-stash = []
// Shutdown
// -- stop --
```

### Example 47: Snapshots

```scala
var state: Any = _

val snapShotInterval = 1000
override def receiveCommand: Receive = {
  case SaveSnapshotSuccess(metadata)         => // ...
  case SaveSnapshotFailure(metadata, reason) => // ...
  case cmd: String =>
    persist(s"evt-$cmd") { e =>
      updateState(e)
      if (lastSequenceNr % snapShotInterval == 0 && lastSequenceNr != 0)
        saveSnapshot(state)
    }
}
```

### Example 48: Snapshots

```java
private Object state;
private int snapShotInterval = 1000;

@Override
public Receive createReceive() {
  return receiveBuilder()
      .match(
          SaveSnapshotSuccess.class,
          ss -> {
            SnapshotMetadata metadata = ss.metadata();
            // ...
          })
      .match(
          SaveSnapshotFailure.class,
          sf -> {
            SnapshotMetadata metadata = sf.metadata();
            // ...
          })
      .match(
          String.class,
          cmd -> {
            persist(
                "evt-" + cmd,
                e -> {
                  updateState(e);
                  if (lastSequenceNr() % snapShotInterval == 0 && lastSequenceNr() != 0)
                    saveSnapshot(state);
                });
          })
      .build();
}
```

### Example 49: Snapshots

```scala
var state: Any = _

override def receiveRecover: Receive = {
  case SnapshotOffer(metadata, offeredSnapshot) => state = offeredSnapshot
  case RecoveryCompleted                        =>
  case event                                    => // ...
}
```

### Example 50: Snapshots

```java
private Object state;

@Override
public Receive createReceiveRecover() {
  return receiveBuilder()
      .match(
          SnapshotOffer.class,
          s -> {
            state = s.snapshot();
            // ...
          })
      .match(
          String.class,
          s -> {
            /* ...*/
          })
      .build();
}
```

### Example 51: Snapshots

```scala
override def recovery =
  Recovery(
    fromSnapshot = SnapshotSelectionCriteria(maxSequenceNr = 457L, maxTimestamp = System.currentTimeMillis))
```

### Example 52: Snapshots

```java
@Override
public Recovery recovery() {
  return Recovery.create(
      SnapshotSelectionCriteria.create(457L, System.currentTimeMillis()));
}
```

### Example 53: Relationship between deliver and confirmDelivery

```scala
import akka.actor.{ Actor, ActorSelection }
import akka.persistence.AtLeastOnceDelivery

case class Msg(deliveryId: Long, s: String)
case class Confirm(deliveryId: Long)

sealed trait Evt
case class MsgSent(s: String) extends Evt
case class MsgConfirmed(deliveryId: Long) extends Evt

class MyPersistentActor(destination: ActorSelection) extends PersistentActor with AtLeastOnceDelivery {

  override def persistenceId: String = "persistence-id"

  override def receiveCommand: Receive = {
    case s: String           => persist(MsgSent(s))(updateState)
    case Confirm(deliveryId) => persist(MsgConfirmed(deliveryId))(updateState)
  }

  override def receiveRecover: Receive = {
    case evt: Evt => updateState(evt)
  }

  def updateState(evt: Evt): Unit = evt match {
    case MsgSent(s) =>
      deliver(destination)(deliveryId => Msg(deliveryId, s))

    case MsgConfirmed(deliveryId) => confirmDelivery(deliveryId)
  }
}

class MyDestination extends Actor {
  def receive = {
    case Msg(deliveryId, s) =>
      // ...
      sender() ! Confirm(deliveryId)
  }
}
```

### Example 54: Relationship between deliver and confirmDelivery

```java
class Msg implements Serializable {
  private static final long serialVersionUID = 1L;
  public final long deliveryId;
  public final String s;

  public Msg(long deliveryId, String s) {
    this.deliveryId = deliveryId;
    this.s = s;
  }
}

class Confirm implements Serializable {
  private static final long serialVersionUID = 1L;
  public final long deliveryId;

  public Confirm(long deliveryId) {
    this.deliveryId = deliveryId;
  }
}

class MsgSent implements Serializable {
  private static final long serialVersionUID = 1L;
  public final String s;

  public MsgSent(String s) {
    this.s = s;
  }
}

class MsgConfirmed implements Serializable {
  private static final long serialVersionUID = 1L;
  public final long deliveryId;

  public MsgConfirmed(long deliveryId) {
    this.deliveryId = deliveryId;
  }
}

class MyPersistentActor extends AbstractPersistentActorWithAtLeastOnceDelivery {
  private final ActorSelection destination;

  public MyPersistentActor(ActorSelection destination) {
    this.destination = destination;
  }

  @Override
  public String persistenceId() {
    return "persistence-id";
  }

  @Override
  public Receive createReceive() {
    return receiveBuilder()
        .match(
            String.class,
            s -> {
              persist(new MsgSent(s), evt -> updateState(evt));
            })
        .match(
            Confirm.class,
            confirm -> {
              persist(new MsgConfirmed(confirm.deliveryId), evt -> updateState(evt));
            })
        .build();
  }

  @Override
  public Receive createReceiveRecover() {
    return receiveBuilder().match(Object.class, evt -> updateState(evt)).build();
  }

  void updateState(Object event) {
    if (event instanceof MsgSent) {
      final MsgSent evt = (MsgSent) event;
      deliver(destination, deliveryId -> new Msg(deliveryId, evt.s));
    } else if (event instanceof MsgConfirmed) {
      final MsgConfirmed evt = (MsgConfirmed) event;
      confirmDelivery(evt.deliveryId);
    }
  }
}

class MyDestination extends AbstractActor {
  @Override
  public Receive createReceive() {
    return receiveBuilder()
        .match(
            Msg.class,
            msg -> {
              // ...
              getSender().tell(new Confirm(msg.deliveryId), getSelf());
            })
        .build();
  }
}
```

### Example 55: Event Adapters

```scala
@nowarn("msg=never used") // required constructor parameter
class MyEventAdapter(system: ExtendedActorSystem) extends EventAdapter {
  override def manifest(event: Any): String =
    "" // when no manifest needed, return ""

  override def toJournal(event: Any): Any =
    event // identity

  override def fromJournal(event: Any, manifest: String): EventSeq =
    EventSeq.single(event) // identity
}
```

### Example 56: Event Adapters

```java
class MyEventAdapter implements EventAdapter {
  @Override
  public String manifest(Object event) {
    return ""; // if no manifest needed, return ""
  }

  @Override
  public Object toJournal(Object event) {
    return event; // identity
  }

  @Override
  public EventSeq fromJournal(Object event, String manifest) {
    return EventSeq.single(event); // identity
  }
}
```

### Example 57: Event Adapters

```scala
akka.persistence.journal {
  inmem {
    event-adapters {
      tagging        = "docs.persistence.MyTaggingEventAdapter"
      user-upcasting = "docs.persistence.UserUpcastingEventAdapter"
      item-upcasting = "docs.persistence.ItemUpcastingEventAdapter"
    }

    event-adapter-bindings {
      "docs.persistence.Item"        = tagging
      "docs.persistence.TaggedEvent" = tagging
      "docs.persistence.v1.Event"    = [user-upcasting, item-upcasting]
    }
  }
}
```

### Example 58: Custom serialization

```scala
akka.actor {
  serializers {
    my-payload = "docs.persistence.MyPayloadSerializer"
    my-snapshot = "docs.persistence.MySnapshotSerializer"
  }
  serialization-bindings {
    "docs.persistence.MyPayload" = my-payload
    "docs.persistence.MySnapshot" = my-snapshot
  }
}
```

### Example 59: Testing with LevelDB journal

```scala
akka.persistence.journal.leveldb.native = off
```

### Example 60: Testing with LevelDB journal

```scala
akka.persistence.journal.leveldb-shared.store.native = off
```

### Example 61: Testing with LevelDB journal

```scala
libraryDependencies += "org.iq80.leveldb" % "leveldb" % "0.9"
```

### Example 62: Testing with LevelDB journal

```xml
<dependencies&gt
  <dependency>
    <groupId>org.iq80.leveldb</groupId>
    <artifactId>leveldb</artifactId>
    <version>0.9</version>
  </dependency&gt
</dependencies>
```

### Example 63: Testing with LevelDB journal

```gradle
dependencies {
  implementation "org.iq80.leveldb:leveldb:0.9"
}
```

### Example 64: Multiple persistence plugin configurations

```scala
# Absolute path to the default journal plugin configuration entry.
akka.persistence.journal.plugin = "akka.persistence.journal.inmem"
# Absolute path to the default snapshot store plugin configuration entry.
akka.persistence.snapshot-store.plugin = "akka.persistence.snapshot-store.local"
```

### Example 65: Multiple persistence plugin configurations

```scala
trait ActorWithDefaultPlugins extends PersistentActor {
  override def persistenceId = "123"
}
```

### Example 66: Multiple persistence plugin configurations

```java
abstract class AbstractPersistentActorWithDefaultPlugins extends AbstractPersistentActor {
  @Override
  public String persistenceId() {
    return "123";
  }
}
```

### Example 67: Multiple persistence plugin configurations

```scala
trait ActorWithOverridePlugins extends PersistentActor {
  override def persistenceId = "123"

  // Absolute path to the journal plugin configuration entry in the `reference.conf`.
  override def journalPluginId = "akka.persistence.chronicle.journal"

  // Absolute path to the snapshot store plugin configuration entry in the `reference.conf`.
  override def snapshotPluginId = "akka.persistence.chronicle.snapshot-store"
}
```

### Example 68: Multiple persistence plugin configurations

```java
abstract class AbstractPersistentActorWithOverridePlugins extends AbstractPersistentActor {
  @Override
  public String persistenceId() {
    return "123";
  }

  // Absolute path to the journal plugin configuration entry in the `reference.conf`
  @Override
  public String journalPluginId() {
    return "akka.persistence.chronicle.journal";
  }

  // Absolute path to the snapshot store plugin configuration entry in the `reference.conf`
  @Override
  public String snapshotPluginId() {
    return "akka.persistence.chronicle.snapshot-store";
  }
}
```

### Example 69: Multiple persistence plugin configurations

```scala
# Configuration entry for the custom journal plugin, see `journalPluginId`.
akka.persistence.chronicle.journal {
  # Standard persistence extension property: provider FQCN.
  class = "akka.persistence.chronicle.ChronicleSyncJournal"
  # Custom setting specific for the journal `ChronicleSyncJournal`.
  folder = $${user.dir}/store/journal
}
# Configuration entry for the custom snapshot store plugin, see `snapshotPluginId`.
akka.persistence.chronicle.snapshot-store {
  # Standard persistence extension property: provider FQCN.
  class = "akka.persistence.chronicle.ChronicleSnapshotStore"
  # Custom setting specific for the snapshot store `ChronicleSnapshotStore`.
  folder = $${user.dir}/store/snapshot
}
```

### Example 70: Give persistence plugin configurations at runtime

```scala
trait ActorWithRuntimePluginConfig extends PersistentActor with RuntimePluginConfig {
  // Variable that is retrieved at runtime, from an external service for instance.
  val runtimeDistinction = "foo"

  override def persistenceId = "123"

  // Absolute path to the journal plugin configuration entry, not defined in the `reference.conf`.
  override def journalPluginId = s"journal-plugin-$runtimeDistinction"

  // Absolute path to the snapshot store plugin configuration entry, not defined in the `reference.conf`.
  override def snapshotPluginId = s"snapshot-store-plugin-$runtimeDistinction"

  // Configuration which contains the journal plugin id defined above
  override def journalPluginConfig =
    ConfigFactory
      .empty()
      .withValue(
        s"journal-plugin-$runtimeDistinction",
        context.system.settings.config
          .getValue("journal-plugin") // or a very different configuration coming from an external service.
      )

  // Configuration which contains the snapshot store plugin id defined above
  override def snapshotPluginConfig =
    ConfigFactory
      .empty()
      .withValue(
        s"snapshot-plugin-$runtimeDistinction",
        context.system.settings.config
          .getValue("snapshot-store-plugin") // or a very different configuration coming from an external service.
      )

}
```

### Example 71: Give persistence plugin configurations at runtime

```java
abstract class AbstractPersistentActorWithRuntimePluginConfig extends AbstractPersistentActor
    implements RuntimePluginConfig {
  // Variable that is retrieved at runtime, from an external service for instance.
  String runtimeDistinction = "foo";

  @Override
  public String persistenceId() {
    return "123";
  }

  // Absolute path to the journal plugin configuration entry in the `reference.conf`
  @Override
  public String journalPluginId() {
    return "journal-plugin-" + runtimeDistinction;
  }

  // Absolute path to the snapshot store plugin configuration entry in the `reference.conf`
  @Override
  public String snapshotPluginId() {
    return "snapshot-store-plugin-" + runtimeDistinction;
  }

  // Configuration which contains the journal plugin id defined above
  @Override
  public Config journalPluginConfig() {
    return ConfigFactory.empty()
        .withValue(
            "journal-plugin-" + runtimeDistinction,
            getContext()
                .getSystem()
                .settings()
                .config()
                .getValue(
                    "journal-plugin") // or a very different configuration coming from an external
            // service.
            );
  }

  // Configuration which contains the snapshot store plugin id defined above
  @Override
  public Config snapshotPluginConfig() {
    return ConfigFactory.empty()
        .withValue(
            "snapshot-plugin-" + runtimeDistinction,
            getContext()
                .getSystem()
                .settings()
                .config()
                .getValue(
                    "snapshot-store-plugin") // or a very different configuration coming from an
            // external service.
            );
  }
}
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/ActorContext.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/ActorPath.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/ActorRef.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/ActorSystem.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/Stash.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/StashOverflowException.html
- https://doc.akka.io/api/akka-core/2.10/akka/pattern/BackoffSupervisor$.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/AtLeastOnceDelivery$$AtLeastOnceDeliverySnapshot.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/AtLeastOnceDelivery$$MaxUnconfirmedMessagesExceededException.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/AtLeastOnceDelivery$$UnconfirmedWarning.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/AtLeastOnceDelivery.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/AtLeastOnceDeliveryLike.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/DeleteMessagesFailure.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/DeleteMessagesSuccess.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/DiscardConfigurator.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/DiscardToDeadLetterStrategy$.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/PersistenceIdentity.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/PersistenceStash.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/PersistentActor.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/Recovery$.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/RecoveryCompleted$.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/ReplyToStrategy.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/RuntimePluginConfig.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/SaveSnapshotFailure.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/SaveSnapshotSuccess.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/SnapshotMetadata.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/SnapshotOffer.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/SnapshotSelectionCriteria$.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/SnapshotSelectionCriteria.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/Snapshotter.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/StashOverflowStrategyConfigurator.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/ThrowOverflowExceptionStrategy$.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/journal/AsyncWriteJournal.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/journal/EventSeq$.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/journal/ReadEventAdapter.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/journal/WriteEventAdapter.html
- https://doc.akka.io/api/akka-core/2.10/akka/testkit/TestActorRef.html
- https://doc.akka.io/docs/akka-dependencies/current/support-terminology.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorContext.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorPath.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/Stash.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/StashOverflowException.html
- https://doc.akka.io/japi/akka-core/2.10/akka/pattern/BackoffSupervisor.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/AbstractPersistentActor.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/AbstractPersistentActorLike.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/persistence.html](https://doc.akka.io/libraries/akka-core/current/persistence.html)*