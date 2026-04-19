---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:57:31Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/actor-interop.html
title: Actors interop • Akka core
---

# Actors interop • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Actors interop

## Dependency

Note
The Akka dependencies are available from Akka’s secure library repository. To access them you need to use a secure, tokenized URL as specified at <https://account.akka.io/token>.

To use Akka Streams, add the module to your project:

sbt
```
val AkkaVersion = "2.10.17"
libraryDependencies += "com.typesafe.akka" %% "akka-stream" % AkkaVersion
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
    <artifactId>akka-stream_${scala.binary.version}</artifactId>
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

  implementation "com.typesafe.akka:akka-stream_${versions.ScalaBinary}"
}
```

## Overview

There are various use cases where it might be reasonable to use actors and streams together:

- when integrating existing API’s that might be streams\- or actors\-based.
- when there is any mutable state that should be shared across multiple streams.
- when there is any mutable state or logic that can be influenced ‘from outside’ while the stream is running.

For piping the elements of a stream as messages to an ordinary actor you can use `ask` in a `mapAsync` or use `Sink.actorRefWithBackpressure`.

Messages can be sent to a stream with `Source.queue` or via the `ActorRef` that is materialized by `Source.actorRef`.

Additionally you can use `ActorSource.actorRef`, `ActorSource.actorRefWithBackpressure`, `ActorSink.actorRef` and `ActorSink.actorRefWithBackpressure` shown below.

### ask

Note
See also: [Flow.ask operator reference docs](operators/Source-or-Flow/ask.html), [ActorFlow.ask operator reference docs](operators/ActorFlow/ask.html) for Akka Typed

A nice way to delegate some processing of elements in a stream to an actor is to use `ask`. The back\-pressure of the stream is maintained by the `Future``CompletionStage` of the `ask` and the mailbox of the actor will not be filled with more messages than the given `parallelism` of the `ask` operator (similarly to how the `mapAsync` operator works).

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/IntegrationDocSpec.scala#L144-L152 "Go to snippet source")implicit val askTimeout: Timeout = 5.seconds
val words: Source[String, NotUsed] =
  Source(List("hello", "hi"))

words
  .ask[String](parallelism = 5)(ref)
  // continue processing of the replies from the actor
  .map(_.toLowerCase)
  .runWith(Sink.ignore)
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/IntegrationDocTest.java#L390-L397 "Go to snippet source")Source<String, NotUsed> words = Source.from(Arrays.asList("hello", "hi"));
Timeout askTimeout = Timeout.apply(5, TimeUnit.SECONDS);

words
    .ask(5, ref, String.class, askTimeout)
    // continue processing of the replies from the actor
    .map(elem -> elem.toLowerCase())
    .runWith(Sink.ignore(), system);
```

Note that the messages received in the actor will be in the same order as the stream elements, i.e. the `parallelism` does not change the ordering of the messages. There is a performance advantage of using parallelism \> 1 even though the actor will only process one message at a time because then there is already a message in the mailbox when the actor has completed previous message.

The actor must reply to the `sender()``getSender()` for each message from the stream. That reply will complete the `Future``CompletionStage` of the `ask` and it will be the element that is emitted downstream.

In case the target actor is stopped, the operator will fail with an `AskStageTargetActorTerminatedException`

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/IntegrationDocSpec.scala#L123-L130 "Go to snippet source")class Translator extends Actor {
  def receive = {
    case word: String =>
      // ... process message
      val reply = word.toUpperCase
      sender() ! reply // reply to the ask
  }
}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/IntegrationDocTest.java#L306-L320 "Go to snippet source")static class Translator extends AbstractActor {
  @Override
  public Receive createReceive() {
    return receiveBuilder()
        .match(
            String.class,
            word -> {
              // ... process message
              String reply = word.toUpperCase();
              // reply to the ask
              getSender().tell(reply, getSelf());
            })
        .build();
  }
}
```

The stream can be completed with failure by sending `akka.actor.Status.Failure` as reply from the actor.

If the `ask` fails due to timeout the stream will be completed with `TimeoutException` failure. If that is not desired outcome you can use `recover` on the `ask` `Future``CompletionStage`, or use the other “restart” operators to restart it.

If you don’t care about the reply values and only use them as back\-pressure signals you can use `Sink.ignore` after the `ask` operator and then actor is effectively a sink of the stream.

Note that while you may implement the same concept using `mapAsync`, that style would not be aware of the actor terminating.

If you are intending to ask multiple actors by using [Actor routers](../routing.html), then you should use `mapAsyncUnordered` and perform the ask manually in there, as the ordering of the replies is not important, since multiple actors are being asked concurrently to begin with, and no single actor is the one to be watched by the operator.

### Sink.actorRefWithBackpressure

Note
See also: [Sink.actorRefWithBackpressure operator reference docs](operators/Sink/actorRefWithBackpressure.html)

The sink sends the elements of the stream to the given `ActorRef` that sends back back\-pressure signal. First element is always *onInitMessage*, then stream is waiting for the given acknowledgement message from the given actor which means that it is ready to process elements. It also requires the given acknowledgement message after each stream element to make back\-pressure work.

If the target actor terminates the stream will be cancelled. When the stream is completed successfully the given `onCompleteMessage` will be sent to the destination actor. When the stream is completed with failure a `akka.actor.Status.Failure` message will be sent to the destination actor.

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

The receiving actor would then need to be implemented similar to the following:

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

Note that replying to the sender of the elements (the “stream”) is required as lack of those ack signals would be interpreted as back\-pressure (as intended), and no new elements will be sent into the actor until it acknowledges some elements. Handling the other signals while is not required, however is a good practice, to see the state of the stream’s lifecycle in the connected actor as well. Technically it is also possible to use multiple sinks targeting the same actor, however it is not common practice to do so, and one should rather investigate using a `Merge` operator for this purpose.

Note
Using `Sink.actorRef` or ordinary `tell` from a `map` or `foreach` operator means that there is no back\-pressure signal from the destination actor, i.e. if the actor is not consuming the messages fast enough the mailbox of the actor will grow, unless you use a bounded mailbox with zero *mailbox\-push\-timeout\-time* or use a rate limiting operator in front. It’s often better to use `Sink.actorRefWithBackpressure` or `ask` in `mapAsync`, though.

### Source.queue

`Source.queue` is an improvement over `Sink.actorRef`, since it can provide backpressure. The `offer` method returns a `Future``CompletionStage`, which completes with the result of the enqueue operation.

`Source.queue` can be used for emitting elements to a stream from an actor (or from anything running outside the stream). The elements will be buffered until the stream can process them. You can `offer` elements to the queue and they will be emitted to the stream if there is demand from downstream, otherwise they will be buffered until request for demand is received.

Use overflow strategy `akka.stream.OverflowStrategy.backpressure` to avoid dropping of elements if the buffer is full, instead the returned `Future``CompletionStage` does not complete until there is space in the buffer and `offer` should not be called again until it completes.

Using `Source.queue` you can push elements to the queue and they will be emitted to the stream if there is demand from downstream, otherwise they will be buffered until request for demand is received. Elements in the buffer will be discarded if downstream is terminated.

You could combine it with the [`throttle`](operators/Source-or-Flow/throttle.html) operator is used to slow down the stream to `5 element` per `3 seconds` and other patterns.

`SourceQueue.offer` returns `Future[QueueOfferResult]``CompletionStage<QueueOfferResult>` which completes with `QueueOfferResult.Enqueued` if element was added to buffer or sent downstream. It completes with `QueueOfferResult.Dropped` if element was dropped. Can also complete with `QueueOfferResult.Failure` \- when stream failed or `QueueOfferResult.QueueClosed` when downstream is completed.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/IntegrationDocSpec.scala#L470-L491 "Go to snippet source")val bufferSize = 10
val elementsToProcess = 5

val queue = Source
  .queue[Int](bufferSize)
  .throttle(elementsToProcess, 3.second)
  .map(x => x * x)
  .toMat(Sink.foreach(x => println(s"completed $x")))(Keep.left)
  .run()

val source = Source(1 to 10)

source
  .map(x => {
    queue.offer(x).map {
      case QueueOfferResult.Enqueued    => println(s"enqueued $x")
      case QueueOfferResult.Dropped     => println(s"dropped $x")
      case QueueOfferResult.Failure(ex) => println(s"Offer failed ${ex.getMessage}")
      case QueueOfferResult.QueueClosed => println("Source Queue closed")
    }
  })
  .runWith(Sink.ignore)
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/IntegrationDocTest.java#L748-L761 "Go to snippet source")int bufferSize = 10;
int elementsToProcess = 5;

BoundedSourceQueue<Integer> sourceQueue =
    Source.<Integer>queue(bufferSize)
        .throttle(elementsToProcess, Duration.ofSeconds(3))
        .map(x -> x * x)
        .to(Sink.foreach(x -> System.out.println("got: " + x)))
        .run(system);

Source<Integer, NotUsed> source = Source.from(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

source.map(x -> sourceQueue.offer(x)).runWith(Sink.ignore(), system);

```

When used from an actor you typically `pipe` the result of the `Future``CompletionStage` back to the actor to continue processing.

### Source.actorRef

Messages sent to the actor that is materialized by `Source.actorRef` will be emitted to the stream if there is demand from downstream, otherwise they will be buffered until request for demand is received.

Depending on the defined `OverflowStrategy` it might drop elements if there is no space available in the buffer. The strategy `OverflowStrategy.backpressure` is not supported for this Source type, i.e. elements will be dropped if the buffer is filled by sending at a rate that is faster than the stream can consume. You should consider using `Source.queue` if you want a backpressured actor interface.

The stream can be completed successfully by sending any message to the actor that is handled by the completion matching function that was provided when the actor reference was created. If the returned completion strategy is `akka.stream.CompletionStrategy.immediately` the completion will be signaled immediately. If the completion strategy is `akka.stream.CompletionStrategy.draining`, already buffered elements will be processed before signaling completion. Any elements that are in the actor’s mailbox and subsequent elements sent to the actor will not be processed.

The stream can be completed with failure by sending any message to the actor that is handled by the failure matching function that was specified when the actor reference was created.

The actor will be stopped when the stream is completed, failed or cancelled from downstream. You can watch it to get notified when that happens.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/IntegrationDocSpec.scala#L526-L546 "Go to snippet source")val bufferSize = 10

val cm: PartialFunction[Any, CompletionStrategy] = {
  case Done =>
    CompletionStrategy.immediately
}

val ref = Source
  .actorRef[Int](
    completionMatcher = cm,
    failureMatcher = PartialFunction.empty[Any, Throwable],
    bufferSize = bufferSize,
    overflowStrategy = OverflowStrategy.fail) // note: backpressure is not supported
  .map(x => x * x)
  .toMat(Sink.foreach((x: Int) => println(s"completed $x")))(Keep.left)
  .run()

ref ! 1
ref ! 2
ref ! 3
ref ! Done
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/IntegrationDocTest.java#L810-L833 "Go to snippet source")int bufferSize = 10;

Source<Integer, ActorRef> source =
    Source.actorRef(
        elem -> {
          // complete stream immediately if we send it Done
          if (elem == Done.done()) return Optional.of(CompletionStrategy.immediately());
          else return Optional.empty();
        },
        // never fail the stream because of a message
        elem -> Optional.empty(),
        bufferSize,
        OverflowStrategy.dropHead()); // note: backpressure is not supported
ActorRef actorRef =
    source
        .map(x -> x * x)
        .to(Sink.foreach(x -> System.out.println("got: " + x)))
        .run(system);

actorRef.tell(1, ActorRef.noSender());
actorRef.tell(2, ActorRef.noSender());
actorRef.tell(3, ActorRef.noSender());
actorRef.tell(
    new akka.actor.Status.Success(CompletionStrategy.draining()), ActorRef.noSender());
```

### ActorSource.actorRef

Materialize an `ActorRef<T>``ActorRef[T]`; sending messages to it will emit them on the stream only if they are of the same type as the stream.

Note
See also: [ActorSource.actorRef operator reference docs](operators/ActorSource/actorRef.html)

### ActorSource.actorRefWithBackpressure

Materialize an `ActorRef<T>``ActorRef[T]`; sending messages to it will emit them on the stream. The source acknowledges reception after emitting a message, to provide back pressure from the source.

Note
See also: [ActorSource.actorRefWithBackpressure operator reference docs](operators/ActorSource/actorRefWithBackpressure.html)

### ActorSink.actorRef

Sends the elements of the stream to the given `ActorRef<T>``ActorRef[T]`, without considering backpressure.

Note
See also: [ActorSink.actorRef operator reference docs](operators/ActorSink/actorRef.html)

### ActorSink.actorRefWithBackpressure

Sends the elements of the stream to the given `ActorRef<T>``ActorRef[T]` with backpressure, to be able to signal demand when the actor is ready to receive more elements.

Note
See also: [ActorSink.actorRefWithBackpressure operator reference docs](operators/ActorSink/actorRefWithBackpressure.html)

### Topic.source

A source that will subscribe to a [`Topic`](https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/pubsub/Topic$.html "akka.actor.typed.pubsub.Topic")[`Topic`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/pubsub/Topic.html "akka.actor.typed.pubsub.Topic") and stream messages published to the topic.

Note
See also: [ActorSink.actorRefWithBackpressure operator reference docs](operators/PubSub/source.html)

### Topic.sink

A sink that will publish emitted messages to a [`Topic`](https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/pubsub/Topic$.html "akka.actor.typed.pubsub.Topic")[`Topic`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/pubsub/Topic.html "akka.actor.typed.pubsub.Topic").

Note
See also: [ActorSink.actorRefWithBackpressure operator reference docs](operators/PubSub/sink.html)

## Code Examples

### Example 1: Dependency

```scala
val AkkaVersion = "2.10.17"
libraryDependencies += "com.typesafe.akka" %% "akka-stream" % AkkaVersion
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
    <artifactId>akka-stream_${scala.binary.version}</artifactId>
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

  implementation "com.typesafe.akka:akka-stream_${versions.ScalaBinary}"
}
```

### Example 4: ask

```scala
implicit val askTimeout: Timeout = 5.seconds
val words: Source[String, NotUsed] =
  Source(List("hello", "hi"))

words
  .ask[String](parallelism = 5)(ref)
  // continue processing of the replies from the actor
  .map(_.toLowerCase)
  .runWith(Sink.ignore)
```

### Example 5: ask

```java
Source<String, NotUsed> words = Source.from(Arrays.asList("hello", "hi"));
Timeout askTimeout = Timeout.apply(5, TimeUnit.SECONDS);

words
    .ask(5, ref, String.class, askTimeout)
    // continue processing of the replies from the actor
    .map(elem -> elem.toLowerCase())
    .runWith(Sink.ignore(), system);
```

### Example 6: ask

```scala
class Translator extends Actor {
  def receive = {
    case word: String =>
      // ... process message
      val reply = word.toUpperCase
      sender() ! reply // reply to the ask
  }
}
```

### Example 7: ask

```java
static class Translator extends AbstractActor {
  @Override
  public Receive createReceive() {
    return receiveBuilder()
        .match(
            String.class,
            word -> {
              // ... process message
              String reply = word.toUpperCase();
              // reply to the ask
              getSender().tell(reply, getSelf());
            })
        .build();
  }
}
```

### Example 8: Sink.actorRefWithBackpressure

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

### Example 9: Sink.actorRefWithBackpressure

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

### Example 10: Sink.actorRefWithBackpressure

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

### Example 11: Sink.actorRefWithBackpressure

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

### Example 12: Source.queue

```scala
val bufferSize = 10
val elementsToProcess = 5

val queue = Source
  .queue[Int](bufferSize)
  .throttle(elementsToProcess, 3.second)
  .map(x => x * x)
  .toMat(Sink.foreach(x => println(s"completed $x")))(Keep.left)
  .run()

val source = Source(1 to 10)

source
  .map(x => {
    queue.offer(x).map {
      case QueueOfferResult.Enqueued    => println(s"enqueued $x")
      case QueueOfferResult.Dropped     => println(s"dropped $x")
      case QueueOfferResult.Failure(ex) => println(s"Offer failed ${ex.getMessage}")
      case QueueOfferResult.QueueClosed => println("Source Queue closed")
    }
  })
  .runWith(Sink.ignore)
```

### Example 13: Source.queue

```java
int bufferSize = 10;
int elementsToProcess = 5;

BoundedSourceQueue<Integer> sourceQueue =
    Source.<Integer>queue(bufferSize)
        .throttle(elementsToProcess, Duration.ofSeconds(3))
        .map(x -> x * x)
        .to(Sink.foreach(x -> System.out.println("got: " + x)))
        .run(system);

Source<Integer, NotUsed> source = Source.from(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

source.map(x -> sourceQueue.offer(x)).runWith(Sink.ignore(), system);
```

### Example 14: Source.actorRef

```scala
val bufferSize = 10

val cm: PartialFunction[Any, CompletionStrategy] = {
  case Done =>
    CompletionStrategy.immediately
}

val ref = Source
  .actorRef[Int](
    completionMatcher = cm,
    failureMatcher = PartialFunction.empty[Any, Throwable],
    bufferSize = bufferSize,
    overflowStrategy = OverflowStrategy.fail) // note: backpressure is not supported
  .map(x => x * x)
  .toMat(Sink.foreach((x: Int) => println(s"completed $x")))(Keep.left)
  .run()

ref ! 1
ref ! 2
ref ! 3
ref ! Done
```

### Example 15: Source.actorRef

```java
int bufferSize = 10;

Source<Integer, ActorRef> source =
    Source.actorRef(
        elem -> {
          // complete stream immediately if we send it Done
          if (elem == Done.done()) return Optional.of(CompletionStrategy.immediately());
          else return Optional.empty();
        },
        // never fail the stream because of a message
        elem -> Optional.empty(),
        bufferSize,
        OverflowStrategy.dropHead()); // note: backpressure is not supported
ActorRef actorRef =
    source
        .map(x -> x * x)
        .to(Sink.foreach(x -> System.out.println("got: " + x)))
        .run(system);

actorRef.tell(1, ActorRef.noSender());
actorRef.tell(2, ActorRef.noSender());
actorRef.tell(3, ActorRef.noSender());
actorRef.tell(
    new akka.actor.Status.Success(CompletionStrategy.draining()), ActorRef.noSender());
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/pubsub/Topic$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/pubsub/Topic.html
- https://doc.akka.io/libraries/akka-core/current/routing.html
- https://doc.akka.io/libraries/akka-core/current/stream/futures-interop.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/ActorFlow/ask.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/ActorSink/actorRef.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/ActorSink/actorRefWithBackpressure.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/ActorSource/actorRef.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/ActorSource/actorRefWithBackpressure.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/PubSub/sink.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/PubSub/source.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Sink/actorRefWithBackpressure.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/ask.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/throttle.html
- https://doc.akka.io/libraries/akka-core/current/stream/reactive-streams-interop.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/actor-interop.html](https://doc.akka.io/libraries/akka-core/current/stream/actor-interop.html)*