---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:28:38Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/ActorSource/actorRefWithBackpressure.html
title: ActorSource.actorRefWithBackpressure • Akka core
---

# ActorSource.actorRefWithBackpressure • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# ActorSource.actorRefWithBackpressure

Materialize an `ActorRef<T>``ActorRef[T]` of the new actors API; sending messages to it will emit them on the stream. The source acknowledges reception after emitting a message, to provide back pressure from the source.

[Actor interop operators](../index.html#actor-interop-operators)

## Dependency

Note
The Akka dependencies are available from Akka’s secure library repository. To access them you need to use a secure, tokenized URL as specified at <https://account.akka.io/token>.

This operator is included in:

sbt
```
val AkkaVersion = "2.10.17"
libraryDependencies += "com.typesafe.akka" %% "akka-stream-typed" % AkkaVersion
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
    <artifactId>akka-stream-typed_${scala.binary.version}</artifactId>
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

  implementation "com.typesafe.akka:akka-stream-typed_${versions.ScalaBinary}"
}
```

## Signature

[`ActorSource.actorRefWithBackpressure`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/typed/javadsl/ActorSource.html#actorRefWithBackpressure(akka.actor.typed.ActorRef,java.lang.Object,akka.japi.function.Function,akka.japi.function.Function) "akka.stream.typed.javadsl.ActorSource")[`ActorSource.actorRefWithBackpressure`](https://doc.akka.io/api/akka-core/2.10/akka/stream/typed/scaladsl/ActorSource$.html#actorRefWithBackpressure[T,Ack](ackTo:akka.actor.typed.ActorRef[Ack],ackMessage:Ack,completionMatcher:PartialFunction[T,akka.stream.CompletionStrategy],failureMatcher:PartialFunction[T,Throwable]):akka.stream.scaladsl.Source[T,akka.actor.typed.ActorRef[T]] "akka.stream.typed.scaladsl.ActorSource")

## Description

Materialize an `ActorRef<T>``ActorRef[T]`, sending messages to it will emit them on the stream. The actor responds with the provided ack message once the element could be emitted allowing for backpressure from the source. Sending another message before the previous one has been acknowledged will fail the stream.

See also:

- [ActorSource.actorRef](actorRef.html) This operator, but without backpressure control
- [Source.actorRef](../Source/actorRef.html) This operator, but without backpressure control for the classic actors API
- [Source.actorRefWithBackpressure](../Source/actorRefWithBackpressure.html) This operator for the classic actors API
- [Source.queue](../Source/queue.html) Materialize a `SourceQueue` onto which elements can be pushed for emitting from the source

## Example

With `actorRefWithBackpressure` two actors get into play: 

1. An actor that is materialized when the stream runs. It feeds the stream.
2. An actor provided by the user. It gets the ack signal when an element is emitted into the stream.

For the ack signal we create an `Emitted` objectempty `Emitted` class.

For “feeding” the stream we use the `Event` traitinterface.

In this example we create the stream in an actor which itself reacts on the demand of the stream and sends more messages.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-stream-typed/src/test/scala/docs/akka/stream/typed/ActorSourceSinkExample.scala#L48-L113 "Go to snippet source")import akka.actor.typed.ActorRef
import akka.stream.CompletionStrategy
import akka.stream.scaladsl.Sink
import akka.stream.typed.scaladsl.ActorSource

object StreamFeeder {

  /** Signals that the latest element is emitted into the stream */
  case object Emitted

  sealed trait Event
  case class Element(content: String) extends Event
  case object ReachedEnd extends Event
  case class FailureOccured(ex: Exception) extends Event

  def apply(): Behavior[Emitted.type] =
    Behaviors.setup { context =>
      val streamActor = runStream(context.self)(context.system)
      streamActor ! Element("first")
      sender(streamActor, 0)
    }

  private def runStream(ackReceiver: ActorRef[Emitted.type])(implicit system: ActorSystem[_]): ActorRef[Event] = {
    val source =
      ActorSource.actorRefWithBackpressure[Event, Emitted.type](
        // get demand signalled to this actor receiving Ack
        ackTo = ackReceiver,
        ackMessage = Emitted,
        // complete when we send ReachedEnd
        completionMatcher = {
          case ReachedEnd => CompletionStrategy.draining
        },
        failureMatcher = {
          case FailureOccured(ex) => ex
        })

    val streamActor: ActorRef[Event] = source
      .collect {
        case Element(msg) => msg
      }
      .to(Sink.foreach(println))
      .run()

    streamActor
  }

  private def sender(streamSource: ActorRef[Event], counter: Int): Behavior[Emitted.type] =
    Behaviors.receiveMessage {
      case Emitted if counter < 5 =>
        streamSource ! Element(counter.toString)
        sender(streamSource, counter + 1)
      case _ =>
        streamSource ! ReachedEnd
        Behaviors.stopped
    }
}

ActorSystem(StreamFeeder(), "stream-feeder")

// Will print:
// first
// 0
// 1
// 2
// 3
// 4
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-stream-typed/src/test/java/docs/akka/stream/typed/ActorSourceWithBackpressureExample.java#L8-L116 "Go to snippet source")import akka.actor.typed.ActorRef;
import akka.actor.typed.ActorSystem;
import akka.actor.typed.Behavior;
import akka.actor.typed.javadsl.AbstractBehavior;
import akka.actor.typed.javadsl.ActorContext;
import akka.actor.typed.javadsl.Behaviors;
import akka.actor.typed.javadsl.Receive;
import akka.stream.CompletionStrategy;
import akka.stream.javadsl.Sink;
import akka.stream.javadsl.Source;
import akka.stream.typed.javadsl.ActorSource;
import java.util.Optional;

class StreamFeeder extends AbstractBehavior<StreamFeeder.Emitted> {
  /** Signals that the latest element is emitted into the stream */
  public enum Emitted {
    INSTANCE;
  }

  public interface Event {}

  public static class Element implements Event {
    public final String content;

    public Element(String content) {
      this.content = content;
    }

    @Override
    public String toString() {
      return "Element(" + content + ")";
    }
  }

  public enum ReachedEnd implements Event {
    INSTANCE;
  }

  public static class FailureOccured implements Event {
    public final Exception ex;

    public FailureOccured(Exception ex) {
      this.ex = ex;
    }
  }

  public static Behavior<Emitted> create() {
    return Behaviors.setup(StreamFeeder::new);
  }

  private int counter = 0;
  private final ActorRef<Event> streamSource;

  private StreamFeeder(ActorContext<Emitted> context) {
    super(context);
    streamSource = runStream(context.getSelf(), context.getSystem());
    streamSource.tell(new Element("first"));
  }

  @Override
  public Receive<Emitted> createReceive() {
    return newReceiveBuilder().onMessage(Emitted.class, this::onEmitted).build();
  }

  private static ActorRef<Event> runStream(ActorRef<Emitted> ackReceiver, ActorSystem<?> system) {
    Source<Event, ActorRef<Event>> source =
        ActorSource.actorRefWithBackpressure(
            ackReceiver,
            Emitted.INSTANCE,
            // complete when we send ReachedEnd
            (msg) -> {
              if (msg == ReachedEnd.INSTANCE) return Optional.of(CompletionStrategy.draining());
              else return Optional.empty();
            },
            (msg) -> {
              if (msg instanceof FailureOccured) return Optional.of(((FailureOccured) msg).ex);
              else return Optional.empty();
            });

    return source.to(Sink.foreach(System.out::println)).run(system);
  }

  private Behavior<Emitted> onEmitted(Emitted message) {
    if (counter < 5) {
      streamSource.tell(new Element(String.valueOf(counter)));
      counter++;
      return this;
    } else {
      streamSource.tell(ReachedEnd.INSTANCE);
      return Behaviors.stopped();
    }
  }
}
    ActorSystem<StreamFeeder.Emitted> system =
        ActorSystem.create(StreamFeeder.create(), "stream-feeder");

    // will print:
    // Element(first)
    // Element(0)
    // Element(1)
    // Element(2)
    // Element(3)
    // Element(4)
```

## Reactive Streams semantics

**emits** when a message is sent to the materialized `ActorRef[T]``ActorRef<T>` it is emitted as soon as there is demand from downstream

**completes** when the passed completion matcher returns a `CompletionStrategy`

## Code Examples

### Example 1: Dependency

```scala
val AkkaVersion = "2.10.17"
libraryDependencies += "com.typesafe.akka" %% "akka-stream-typed" % AkkaVersion
```

### Example 2: Dependency

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
    <artifactId>akka-stream-typed_${scala.binary.version}</artifactId>
  </dependency&gt
</dependencies>
```

### Example 3: Dependency

```gradle
def versions = [
  ScalaBinary: "2.13"
]
dependencies {
  implementation platform("com.typesafe.akka:akka-bom_${versions.ScalaBinary}:2.10.17")

  implementation "com.typesafe.akka:akka-stream-typed_${versions.ScalaBinary}"
}
```

### Example 4: Example

```scala
import akka.actor.typed.ActorRef
import akka.stream.CompletionStrategy
import akka.stream.scaladsl.Sink
import akka.stream.typed.scaladsl.ActorSource

object StreamFeeder {

  /** Signals that the latest element is emitted into the stream */
  case object Emitted

  sealed trait Event
  case class Element(content: String) extends Event
  case object ReachedEnd extends Event
  case class FailureOccured(ex: Exception) extends Event

  def apply(): Behavior[Emitted.type] =
    Behaviors.setup { context =>
      val streamActor = runStream(context.self)(context.system)
      streamActor ! Element("first")
      sender(streamActor, 0)
    }

  private def runStream(ackReceiver: ActorRef[Emitted.type])(implicit system: ActorSystem[_]): ActorRef[Event] = {
    val source =
      ActorSource.actorRefWithBackpressure[Event, Emitted.type](
        // get demand signalled to this actor receiving Ack
        ackTo = ackReceiver,
        ackMessage = Emitted,
        // complete when we send ReachedEnd
        completionMatcher = {
          case ReachedEnd => CompletionStrategy.draining
        },
        failureMatcher = {
          case FailureOccured(ex) => ex
        })

    val streamActor: ActorRef[Event] = source
      .collect {
        case Element(msg) => msg
      }
      .to(Sink.foreach(println))
      .run()

    streamActor
  }

  private def sender(streamSource: ActorRef[Event], counter: Int): Behavior[Emitted.type] =
    Behaviors.receiveMessage {
      case Emitted if counter < 5 =>
        streamSource ! Element(counter.toString)
        sender(streamSource, counter + 1)
      case _ =>
        streamSource ! ReachedEnd
        Behaviors.stopped
    }
}

ActorSystem(StreamFeeder(), "stream-feeder")

// Will print:
// first
// 0
// 1
// 2
// 3
// 4
```

### Example 5: Example

```java
import akka.actor.typed.ActorRef;
import akka.actor.typed.ActorSystem;
import akka.actor.typed.Behavior;
import akka.actor.typed.javadsl.AbstractBehavior;
import akka.actor.typed.javadsl.ActorContext;
import akka.actor.typed.javadsl.Behaviors;
import akka.actor.typed.javadsl.Receive;
import akka.stream.CompletionStrategy;
import akka.stream.javadsl.Sink;
import akka.stream.javadsl.Source;
import akka.stream.typed.javadsl.ActorSource;
import java.util.Optional;

class StreamFeeder extends AbstractBehavior<StreamFeeder.Emitted> {
  /** Signals that the latest element is emitted into the stream */
  public enum Emitted {
    INSTANCE;
  }

  public interface Event {}

  public static class Element implements Event {
    public final String content;

    public Element(String content) {
      this.content = content;
    }

    @Override
    public String toString() {
      return "Element(" + content + ")";
    }
  }

  public enum ReachedEnd implements Event {
    INSTANCE;
  }

  public static class FailureOccured implements Event {
    public final Exception ex;

    public FailureOccured(Exception ex) {
      this.ex = ex;
    }
  }

  public static Behavior<Emitted> create() {
    return Behaviors.setup(StreamFeeder::new);
  }

  private int counter = 0;
  private final ActorRef<Event> streamSource;

  private StreamFeeder(ActorContext<Emitted> context) {
    super(context);
    streamSource = runStream(context.getSelf(), context.getSystem());
    streamSource.tell(new Element("first"));
  }

  @Override
  public Receive<Emitted> createReceive() {
    return newReceiveBuilder().onMessage(Emitted.class, this::onEmitted).build();
  }

  private static ActorRef<Event> runStream(ActorRef<Emitted> ackReceiver, ActorSystem<?> system) {
    Source<Event, ActorRef<Event>> source =
        ActorSource.actorRefWithBackpressure(
            ackReceiver,
            Emitted.INSTANCE,
            // complete when we send ReachedEnd
            (msg) -> {
              if (msg == ReachedEnd.INSTANCE) return Optional.of(CompletionStrategy.draining());
              else return Optional.empty();
            },
            (msg) -> {
              if (msg instanceof FailureOccured) return Optional.of(((FailureOccured) msg).ex);
              else return Optional.empty();
            });

    return source.to(Sink.foreach(System.out::println)).run(system);
  }

  private Behavior<Emitted> onEmitted(Emitted message) {
    if (counter < 5) {
      streamSource.tell(new Element(String.valueOf(counter)));
      counter++;
      return this;
    } else {
      streamSource.tell(ReachedEnd.INSTANCE);
      return Behaviors.stopped();
    }
  }
}
    ActorSystem<StreamFeeder.Emitted> system =
        ActorSystem.create(StreamFeeder.create(), "stream-feeder");

    // will print:
    // Element(first)
    // Element(0)
    // Element(1)
    // Element(2)
    // Element(3)
    // Element(4)
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/stream/typed/scaladsl/ActorSource$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/typed/javadsl/ActorSource.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/ActorSink/actorRefWithBackpressure.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/ActorSource/actorRef.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Sink/actorRefWithBackpressure.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/actorRef.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/actorRefWithBackpressure.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/queue.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/ActorSource/actorRefWithBackpressure.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/ActorSource/actorRefWithBackpressure.html)*