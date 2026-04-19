---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:28:37Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/Sink/actorRefWithBackpressure.html
title: Sink.actorRefWithBackpressure • Akka core
---

# Sink.actorRefWithBackpressure • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Sink.actorRefWithBackpressure

Send the elements from the stream to an `ActorRef` (of the classic actors API) which must then acknowledge reception after completing a message, to provide back pressure onto the sink.

[Actor interop operators](../index.html#actor-interop-operators)

## Signature

[`Sink.actorRefWithBackpressure`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Sink.html#actorRefWithBackpressure(akka.actor.ActorRef,java.lang.Object,java.lang.Object,java.lang.Object,akka.japi.function.Function) "akka.stream.javadsl.Sink")[`Sink.actorRefWithBackpressure`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Sink$.html#actorRefWithBackpressure[T](ref:akka.actor.ActorRef,onInitMessage:Any,ackMessage:Any,onCompleteMessage:Any,onFailureMessage:Throwable=>Any):akka.stream.scaladsl.Sink[T,akka.NotUsed] "akka.stream.scaladsl.Sink")

## Description

Send the elements from the stream to an `ActorRef` which must then acknowledge reception after completing a message, to provide back pressure onto the sink. There is also a variant without a concrete acknowledge message accepting any message as such.

See also:

- [`Sink.actorRef`](actorRef.html) Send elements to an actor, without considering backpressure
- [`ActorSink.actorRef`](../ActorSink/actorRef.html) The corresponding operator for the new actors API
- [`ActorSink.actorRefWithBackpressure`](../ActorSink/actorRefWithBackpressure.html) Send elements to an actor of the new actors API supporting backpressure

## Example

Actor to be interacted with: 

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/IntegrationDocSpec.scala#L225-L253 "Go to snippet source")object AckingReceiver {
  case object Ack

  case object StreamInitialized
  case object StreamCompleted
  case class StreamFailure(ex: Throwable)
}

class AckingReceiver(probe: ActorRef) extends Actor with ActorLogging {
  import AckingReceiver._

  def receive: Receive = {
    case StreamInitialized =>
      log.info("Stream initialized!")
      probe ! "Stream initialized!"
      sender() ! Ack // ack to allow the stream to proceed sending more elements

    case el: String =>
      log.info("Received element: {}", el)
      probe ! el
      sender() ! Ack // ack to allow the stream to proceed sending more elements

    case StreamCompleted =>
      log.info("Stream completed!")
      probe ! "Stream completed!"
    case StreamFailure(ex) =>
      log.error(ex, "Stream failed!")
  }
}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/IntegrationDocTest.java#L324-L383 "Go to snippet source")enum Ack {
  INSTANCE;
}

static class StreamInitialized {}

static class StreamCompleted {}

static class StreamFailure {
  private final Throwable cause;

  public StreamFailure(Throwable cause) {
    this.cause = cause;
  }

  public Throwable getCause() {
    return cause;
  }
}

static class AckingReceiver extends AbstractLoggingActor {

  private final ActorRef probe;

  public AckingReceiver(ActorRef probe) {
    this.probe = probe;
  }

  @Override
  public Receive createReceive() {
    return receiveBuilder()
        .match(
            StreamInitialized.class,
            init -> {
              log().info("Stream initialized");
              probe.tell("Stream initialized", getSelf());
              sender().tell(Ack.INSTANCE, self());
            })
        .match(
            String.class,
            element -> {
              log().info("Received element: {}", element);
              probe.tell(element, getSelf());
              sender().tell(Ack.INSTANCE, self());
            })
        .match(
            StreamCompleted.class,
            completed -> {
              log().info("Stream completed");
              probe.tell("Stream completed", getSelf());
            })
        .match(
            StreamFailure.class,
            failed -> {
              log().error(failed.getCause(), "Stream failed!");
              probe.tell("Stream failed!", getSelf());
            })
        .build();
  }
}
```

Using the `actorRefWithBackpressure` operator with the above actor:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/IntegrationDocSpec.scala#L195-L220 "Go to snippet source")val words: Source[String, NotUsed] =
  Source(List("hello", "hi"))

// sent from actor to stream to "ack" processing of given element
val AckMessage = AckingReceiver.Ack

// sent from stream to actor to indicate start, end or failure of stream:
val InitMessage = AckingReceiver.StreamInitialized
val OnCompleteMessage = AckingReceiver.StreamCompleted
val onErrorMessage = (ex: Throwable) => AckingReceiver.StreamFailure(ex)

val probe = TestProbe()
val receiver = system.actorOf(Props(new AckingReceiver(probe.ref)))
val sink = Sink.actorRefWithBackpressure(
  receiver,
  onInitMessage = InitMessage,
  ackMessage = AckMessage,
  onCompleteMessage = OnCompleteMessage,
  onFailureMessage = onErrorMessage)

words.map(_.toLowerCase).runWith(sink)

probe.expectMsg("Stream initialized!")
probe.expectMsg("hello")
probe.expectMsg("hi")
probe.expectMsg("Stream completed!")
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/IntegrationDocTest.java#L404-L423 "Go to snippet source")Source<String, NotUsed> words = Source.from(Arrays.asList("hello", "hi"));

final TestKit probe = new TestKit(system);

ActorRef receiver = system.actorOf(Props.create(AckingReceiver.class, probe.getRef()));

Sink<String, NotUsed> sink =
    Sink.<String>actorRefWithBackpressure(
        receiver,
        new StreamInitialized(),
        Ack.INSTANCE,
        new StreamCompleted(),
        ex -> new StreamFailure(ex));

words.map(el -> el.toLowerCase()).runWith(sink, system);

probe.expectMsg("Stream initialized");
probe.expectMsg("hello");
probe.expectMsg("hi");
probe.expectMsg("Stream completed");
```

## Reactive Streams semantics

**cancels** when the actor terminates

**backpressures** when the actor acknowledgement has not arrived

## Code Examples

### Example 1: Example

```scala
object AckingReceiver {
  case object Ack

  case object StreamInitialized
  case object StreamCompleted
  case class StreamFailure(ex: Throwable)
}

class AckingReceiver(probe: ActorRef) extends Actor with ActorLogging {
  import AckingReceiver._

  def receive: Receive = {
    case StreamInitialized =>
      log.info("Stream initialized!")
      probe ! "Stream initialized!"
      sender() ! Ack // ack to allow the stream to proceed sending more elements

    case el: String =>
      log.info("Received element: {}", el)
      probe ! el
      sender() ! Ack // ack to allow the stream to proceed sending more elements

    case StreamCompleted =>
      log.info("Stream completed!")
      probe ! "Stream completed!"
    case StreamFailure(ex) =>
      log.error(ex, "Stream failed!")
  }
}
```

### Example 2: Example

```java
enum Ack {
  INSTANCE;
}

static class StreamInitialized {}

static class StreamCompleted {}

static class StreamFailure {
  private final Throwable cause;

  public StreamFailure(Throwable cause) {
    this.cause = cause;
  }

  public Throwable getCause() {
    return cause;
  }
}

static class AckingReceiver extends AbstractLoggingActor {

  private final ActorRef probe;

  public AckingReceiver(ActorRef probe) {
    this.probe = probe;
  }

  @Override
  public Receive createReceive() {
    return receiveBuilder()
        .match(
            StreamInitialized.class,
            init -> {
              log().info("Stream initialized");
              probe.tell("Stream initialized", getSelf());
              sender().tell(Ack.INSTANCE, self());
            })
        .match(
            String.class,
            element -> {
              log().info("Received element: {}", element);
              probe.tell(element, getSelf());
              sender().tell(Ack.INSTANCE, self());
            })
        .match(
            StreamCompleted.class,
            completed -> {
              log().info("Stream completed");
              probe.tell("Stream completed", getSelf());
            })
        .match(
            StreamFailure.class,
            failed -> {
              log().error(failed.getCause(), "Stream failed!");
              probe.tell("Stream failed!", getSelf());
            })
        .build();
  }
}
```

### Example 3: Example

```scala
val words: Source[String, NotUsed] =
  Source(List("hello", "hi"))

// sent from actor to stream to "ack" processing of given element
val AckMessage = AckingReceiver.Ack

// sent from stream to actor to indicate start, end or failure of stream:
val InitMessage = AckingReceiver.StreamInitialized
val OnCompleteMessage = AckingReceiver.StreamCompleted
val onErrorMessage = (ex: Throwable) => AckingReceiver.StreamFailure(ex)

val probe = TestProbe()
val receiver = system.actorOf(Props(new AckingReceiver(probe.ref)))
val sink = Sink.actorRefWithBackpressure(
  receiver,
  onInitMessage = InitMessage,
  ackMessage = AckMessage,
  onCompleteMessage = OnCompleteMessage,
  onFailureMessage = onErrorMessage)

words.map(_.toLowerCase).runWith(sink)

probe.expectMsg("Stream initialized!")
probe.expectMsg("hello")
probe.expectMsg("hi")
probe.expectMsg("Stream completed!")
```

### Example 4: Example

```java
Source<String, NotUsed> words = Source.from(Arrays.asList("hello", "hi"));

final TestKit probe = new TestKit(system);

ActorRef receiver = system.actorOf(Props.create(AckingReceiver.class, probe.getRef()));

Sink<String, NotUsed> sink =
    Sink.<String>actorRefWithBackpressure(
        receiver,
        new StreamInitialized(),
        Ack.INSTANCE,
        new StreamCompleted(),
        ex -> new StreamFailure(ex));

words.map(el -> el.toLowerCase()).runWith(sink, system);

probe.expectMsg("Stream initialized");
probe.expectMsg("hello");
probe.expectMsg("hi");
probe.expectMsg("Stream completed");
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Sink$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Sink.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/ActorSink/actorRef.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/ActorSink/actorRefWithBackpressure.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/ActorSource/actorRefWithBackpressure.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Sink/actorRef.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/actorRefWithBackpressure.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/Sink/actorRefWithBackpressure.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/Sink/actorRefWithBackpressure.html)*