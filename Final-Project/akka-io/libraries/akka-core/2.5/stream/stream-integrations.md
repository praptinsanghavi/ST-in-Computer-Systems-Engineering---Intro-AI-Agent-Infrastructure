---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:20:01Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/stream-integrations.html
title: Integration • Akka Documentation
---

# Integration • Akka Documentation

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

# Integration

## Dependency

To use Akka Streams, add the module to your project:

sbt
```
libraryDependencies += "com.typesafe.akka" %% "akka-stream" % "2.5.32"
```
Maven
```
<dependencies&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-stream_2.12</artifactId>
    <version>2.5.32</version>
  </dependency&gt
</dependencies>
```
Gradle
```
dependencies {
  implementation "com.typesafe.akka:akka-stream_2.12:2.5.32"
}
```

## Integrating with Actors

For piping the elements of a stream as messages to an ordinary actor you can use `ask` in a `mapAsync` or use `Sink.actorRefWithAck`.

Messages can be sent to a stream with `Source.queue` or via the `ActorRef` that is materialized by `Source.actorRef`.

### ask

Note
See also: [Flow.ask operator reference docs](operators/Source-or-Flow/ask.html), [ActorFlow.ask operator reference docs](operators/ActorFlow/ask.html) for Akka Typed

A nice way to delegate some processing of elements in a stream to an actor is to use `ask`. The back\-pressure of the stream is maintained by the `Future``CompletionStage` of the `ask` and the mailbox of the actor will not be filled with more messages than the given `parallelism` of the `ask` operator (similarly to how the `mapAsync` operator works).

Scala

```
[source](https://github.com/akka/akka/tree/v2.5.32/akka-docs/src/test/scala/docs/stream/IntegrationDocSpec.scala#L145-L153 "Go to snippet source")implicit val askTimeout = Timeout(5.seconds)
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
[source](https://github.com/akka/akka/tree/v2.5.32/akka-docs/src/test/java/jdocs/stream/IntegrationDocTest.java#L393-L400 "Go to snippet source")Source<String, NotUsed> words = Source.from(Arrays.asList("hello", "hi"));
Timeout askTimeout = Timeout.apply(5, TimeUnit.SECONDS);

words
    .ask(5, ref, String.class, askTimeout)
    // continue processing of the replies from the actor
    .map(elem -> elem.toLowerCase())
    .runWith(Sink.ignore(), mat);
```

Note that the messages received in the actor will be in the same order as the stream elements, i.e. the `parallelism` does not change the ordering of the messages. There is a performance advantage of using parallelism \> 1 even though the actor will only process one message at a time because then there is already a message in the mailbox when the actor has completed previous message.

The actor must reply to the `sender()``getSender()` for each message from the stream. That reply will complete the `Future``CompletionStage` of the `ask` and it will be the element that is emitted downstreams.

In case the target actor is stopped, the operator will fail with an `AskStageTargetActorTerminatedException`

Scala

```
[source](https://github.com/akka/akka/tree/v2.5.32/akka-docs/src/test/scala/docs/stream/IntegrationDocSpec.scala#L124-L131 "Go to snippet source")class Translator extends Actor {
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
[source](https://github.com/akka/akka/tree/v2.5.32/akka-docs/src/test/java/jdocs/stream/IntegrationDocTest.java#L309-L323 "Go to snippet source")static class Translator extends AbstractActor {
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

### Sink.actorRefWithAck

Note
See also: [Sink.actorRefWithAck operator reference docs](operators/Sink/actorRefWithAck.html)

The sink sends the elements of the stream to the given `ActorRef` that sends back back\-pressure signal. First element is always *onInitMessage*, then stream is waiting for the given acknowledgement message from the given actor which means that it is ready to process elements. It also requires the given acknowledgement message after each stream element to make back\-pressure work.

If the target actor terminates the stream will be cancelled. When the stream is completed successfully the given `onCompleteMessage` will be sent to the destination actor. When the stream is completed with failure a `akka.actor.Status.Failure` message will be sent to the destination actor.

Scala

```
[source](https://github.com/akka/akka/tree/v2.5.32/akka-docs/src/test/scala/docs/stream/IntegrationDocSpec.scala#L196-L221 "Go to snippet source")val words: Source[String, NotUsed] =
  Source(List("hello", "hi"))

// sent from actor to stream to "ack" processing of given element
val AckMessage = AckingReceiver.Ack

// sent from stream to actor to indicate start, end or failure of stream:
val InitMessage = AckingReceiver.StreamInitialized
val OnCompleteMessage = AckingReceiver.StreamCompleted
val onErrorMessage = (ex: Throwable) => AckingReceiver.StreamFailure(ex)

val probe = TestProbe()
val receiver = system.actorOf(Props(new AckingReceiver(probe.ref, ackWith = AckMessage)))
val sink = Sink.actorRefWithAck(
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
[source](https://github.com/akka/akka/tree/v2.5.32/akka-docs/src/test/java/jdocs/stream/IntegrationDocTest.java#L407-L426 "Go to snippet source")Source<String, NotUsed> words = Source.from(Arrays.asList("hello", "hi"));

final TestKit probe = new TestKit(system);

ActorRef receiver = system.actorOf(Props.create(AckingReceiver.class, probe.getRef()));

Sink<String, NotUsed> sink =
    Sink.<String>actorRefWithAck(
        receiver,
        new StreamInitialized(),
        Ack.INSTANCE,
        new StreamCompleted(),
        ex -> new StreamFailure(ex));

words.map(el -> el.toLowerCase()).runWith(sink, mat);

probe.expectMsg("Stream initialized");
probe.expectMsg("hello");
probe.expectMsg("hi");
probe.expectMsg("Stream completed");
```

The receiving actor would then need to be implemented similar to the following:

Scala

```
[source](https://github.com/akka/akka/tree/v2.5.32/akka-docs/src/test/scala/docs/stream/IntegrationDocSpec.scala#L226-L254 "Go to snippet source")object AckingReceiver {
  case object Ack

  case object StreamInitialized
  case object StreamCompleted
  final case class StreamFailure(ex: Throwable)
}

class AckingReceiver(probe: ActorRef, ackWith: Any) extends Actor with ActorLogging {
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
[source](https://github.com/akka/akka/tree/v2.5.32/akka-docs/src/test/java/jdocs/stream/IntegrationDocTest.java#L327-L386 "Go to snippet source")enum Ack {
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

Note that replying to the sender of the elements (the “stream”) is required as lack of those ack signals would be interpreted as back\-pressure (as intended), and no new elements will be sent into the actor until it acknowledges some elements. Handling the other signals while is not required, however is a good practice, to see the state of the streams lifecycle in the connected actor as well. Technically it is also possible to use multiple sinks targeting the same actor, however it is not common practice to do so, and one should rather investigate using a `Merge` operator for this purpose.

Note
Using `Sink.actorRef` or ordinary `tell` from a `map` or `foreach` operator means that there is no back\-pressure signal from the destination actor, i.e. if the actor is not consuming the messages fast enough the mailbox of the actor will grow, unless you use a bounded mailbox with zero *mailbox\-push\-timeout\-time* or use a rate limiting operator in front. It’s often better to use `Sink.actorRefWithAck` or `ask` in `mapAsync`, though.

### Source.queue

`Source.queue` is an improvement over `Sink.actorRef`, since it can provide backpressure. The `offer` method returns a `Future``CompletionStage`, which completes with the result of the enqueue operation.

`Source.queue` can be used for emitting elements to a stream from an actor (or from anything running outside the stream). The elements will be buffered until the stream can process them. You can `offer` elements to the queue and they will be emitted to the stream if there is demand from downstream, otherwise they will be buffered until request for demand is received.

Use overflow strategy `akka.stream.OverflowStrategy.backpressure` to avoid dropping of elements if the buffer is full, instead the returned `Future``CompletionStage` does not complete until there is space in the buffer and `offer` should not be called again until it completes.

Using `Source.queue` you can push elements to the queue and they will be emitted to the stream if there is demand from downstream, otherwise they will be buffered until request for demand is received. Elements in the buffer will be discarded if downstream is terminated.

You could combine it with the [`throttle`](operators/Source-or-Flow/throttle.html) operator is used to slow down the stream to `5 element` per `3 seconds` and other patterns.

`SourceQueue.offer` returns `Future[QueueOfferResult]``CompletionStage<QueueOfferResult>` which completes with `QueueOfferResult.Enqueued` if element was added to buffer or sent downstream. It completes with `QueueOfferResult.Dropped` if element was dropped. Can also complete with `QueueOfferResult.Failure` \- when stream failed or `QueueOfferResult.QueueClosed` when downstream is completed.

Scala

```
[source](https://github.com/akka/akka/tree/v2.5.32/akka-docs/src/test/scala/docs/stream/IntegrationDocSpec.scala#L473-L495 "Go to snippet source")val bufferSize = 10
val elementsToProcess = 5

val queue = Source
  .queue[Int](bufferSize, OverflowStrategy.backpressure)
  .throttle(elementsToProcess, 3.second)
  .map(x => x * x)
  .toMat(Sink.foreach(x => println(s"completed $x")))(Keep.left)
  .run()

val source = Source(1 to 10)

implicit val ec = system.dispatcher
source
  .mapAsync(1)(x => {
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
[source](https://github.com/akka/akka/tree/v2.5.32/akka-docs/src/test/java/jdocs/stream/IntegrationDocTest.java#L755-L768 "Go to snippet source")int bufferSize = 10;
int elementsToProcess = 5;

SourceQueueWithComplete<Integer> sourceQueue =
    Source.<Integer>queue(bufferSize, OverflowStrategy.backpressure())
        .throttle(elementsToProcess, Duration.ofSeconds(3))
        .map(x -> x * x)
        .to(Sink.foreach(x -> System.out.println("got: " + x)))
        .run(mat);

Source<Integer, NotUsed> source = Source.from(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

source.map(x -> sourceQueue.offer(x)).runWith(Sink.ignore(), mat);

```

When used from an actor you typically `pipe` the result of the `Future``CompletionStage` back to the actor to continue processing.

### Source.actorRef

Messages sent to the actor that is materialized by `Source.actorRef` will be emitted to the stream if there is demand from downstream, otherwise they will be buffered until request for demand is received.

Depending on the defined `OverflowStrategy` it might drop elements if there is no space available in the buffer. The strategy `OverflowStrategy.backpressure` is not supported for this Source type, i.e. elements will be dropped if the buffer is filled by sending at a rate that is faster than the stream can consume. You should consider using `Source.queue` if you want a backpressured actor interface.

The stream can be completed successfully by sending `akka.actor.Status.Success` to the actor reference. If the content is `akka.stream.CompletionStrategy.immediately` the completion will be signaled immidiately. If the content is `akka.stream.CompletionStrategy.draining` already buffered elements will be signaled before siganling completion. Any other content will be ignored and fall back to the draining behaviour. 

The stream can be completed with failure by sending `akka.actor.Status.Failure` to the actor reference.

Note: Sending a `PoisonPill` is deprecated and will be ignored in the future.

The actor will be stopped when the stream is completed, failed or cancelled from downstream, i.e. you can watch it to get notified when that happens.

Scala

```
[source](https://github.com/akka/akka/tree/v2.5.32/akka-docs/src/test/scala/docs/stream/IntegrationDocSpec.scala#L501-L512 "Go to snippet source")val bufferSize = 10

val ref = Source
  .actorRef[Int](bufferSize, OverflowStrategy.fail) // note: backpressure is not supported
  .map(x => x * x)
  .toMat(Sink.foreach(x => println(s"completed $x")))(Keep.left)
  .run()

ref ! 1
ref ! 2
ref ! 3
ref ! akka.actor.Status.Success("done")
```

Java

```
[source](https://github.com/akka/akka/tree/v2.5.32/akka-docs/src/test/java/jdocs/stream/IntegrationDocTest.java#L779-L791 "Go to snippet source")int bufferSize = 10;

Source<Integer, ActorRef> source =
    Source.actorRef(
        bufferSize, OverflowStrategy.dropHead()); // note: backpressure is not supported
ActorRef actorRef =
    source.map(x -> x * x).to(Sink.foreach(x -> System.out.println("got: " + x))).run(mat);

actorRef.tell(1, ActorRef.noSender());
actorRef.tell(2, ActorRef.noSender());
actorRef.tell(3, ActorRef.noSender());
actorRef.tell(
    new akka.actor.Status.Success(CompletionStrategy.draining()), ActorRef.noSender());
```

## Integrating with External Services

Stream transformations and side effects involving external non\-stream based services can be performed with `mapAsync` or `mapAsyncUnordered`.

For example, sending emails to the authors of selected tweets using an external email service:

Scala

```
[source](https://github.com/akka/akka/tree/v2.5.32/akka-docs/src/test/scala/docs/stream/IntegrationDocSpec.scala#L69-L75 "Go to snippet source")def send(email: Email): Future[Unit] = {
  // ...
}
```

Java

```
[source](https://github.com/akka/akka/tree/v2.5.32/akka-docs/src/test/java/jdocs/stream/IntegrationDocTest.java#L191-L197 "Go to snippet source")public CompletionStage<Email> send(Email email) {
  // ...
}
```

We start with the tweet stream of authors:

Scala

```
[source](https://github.com/akka/akka/tree/v2.5.32/akka-docs/src/test/scala/docs/stream/IntegrationDocSpec.scala#L163-L164 "Go to snippet source")val authors: Source[Author, NotUsed] =
  tweets.filter(_.hashtags.contains(akkaTag)).map(_.author)
```

Java

```
[source](https://github.com/akka/akka/tree/v2.5.32/akka-docs/src/test/java/jdocs/stream/IntegrationDocTest.java#L439-L441 "Go to snippet source")final Source<Author, NotUsed> authors =
    tweets.filter(t -> t.hashtags().contains(AKKA)).map(t -> t.author);

```

Assume that we can lookup their email address using:

Scala

```
[source](https://github.com/akka/akka/tree/v2.5.32/akka-docs/src/test/scala/docs/stream/IntegrationDocSpec.scala#L47 "Go to snippet source")def lookupEmail(handle: String): Future[Option[String]] =
```

Java

```
[source](https://github.com/akka/akka/tree/v2.5.32/akka-docs/src/test/java/jdocs/stream/IntegrationDocTest.java#L78 "Go to snippet source")public CompletionStage<Optional<String>> lookupEmail(String handle)
```

Transforming the stream of authors to a stream of email addresses by using the `lookupEmail` service can be done with `mapAsync`:

Scala

```
[source](https://github.com/akka/akka/tree/v2.5.32/akka-docs/src/test/scala/docs/stream/IntegrationDocSpec.scala#L168-L171 "Go to snippet source")val emailAddresses: Source[String, NotUsed] =
  authors.mapAsync(4)(author => addressSystem.lookupEmail(author.handle)).collect {
    case Some(emailAddress) => emailAddress
  }
```

Java

```
[source](https://github.com/akka/akka/tree/v2.5.32/akka-docs/src/test/java/jdocs/stream/IntegrationDocTest.java#L445-L450 "Go to snippet source")final Source<String, NotUsed> emailAddresses =
    authors
        .mapAsync(4, author -> addressSystem.lookupEmail(author.handle))
        .filter(o -> o.isPresent())
        .map(o -> o.get());

```

Finally, sending the emails:

Scala

```
[source](https://github.com/akka/akka/tree/v2.5.32/akka-docs/src/test/scala/docs/stream/IntegrationDocSpec.scala#L175-L182 "Go to snippet source")val sendEmails: RunnableGraph[NotUsed] =
  emailAddresses
    .mapAsync(4)(address => {
      emailServer.send(Email(to = address, title = "Akka", body = "I like your tweet"))
    })
    .to(Sink.ignore)

sendEmails.run()
```

Java

```
[source](https://github.com/akka/akka/tree/v2.5.32/akka-docs/src/test/java/jdocs/stream/IntegrationDocTest.java#L454-L460 "Go to snippet source")final RunnableGraph<NotUsed> sendEmails =
    emailAddresses
        .mapAsync(
            4, address -> emailServer.send(new Email(address, "Akka", "I like your tweet")))
        .to(Sink.ignore());

sendEmails.run(mat);
```

`mapAsync` is applying the given function that is calling out to the external service to each of the elements as they pass through this processing step. The function returns a `Future``CompletionStage` and the value of that future will be emitted downstreams. The number of Futures that shall run in parallel is given as the first argument to `mapAsync`. These Futures may complete in any order, but the elements that are emitted downstream are in the same order as received from upstream.

That means that back\-pressure works as expected. For example if the `emailServer.send` is the bottleneck it will limit the rate at which incoming tweets are retrieved and email addresses looked up.

The final piece of this pipeline is to generate the demand that pulls the tweet authors information through the emailing pipeline: we attach a `Sink.ignore` which makes it all run. If our email process would return some interesting data for further transformation then we would not ignore it but send that result stream onwards for further processing or storage.

Note that `mapAsync` preserves the order of the stream elements. In this example the order is not important and then we can use the more efficient `mapAsyncUnordered`:

Scala

```
[source](https://github.com/akka/akka/tree/v2.5.32/akka-docs/src/test/scala/docs/stream/IntegrationDocSpec.scala#L280-L295 "Go to snippet source")val authors: Source[Author, NotUsed] =
  tweets.filter(_.hashtags.contains(akkaTag)).map(_.author)

val emailAddresses: Source[String, NotUsed] =
  authors.mapAsyncUnordered(4)(author => addressSystem.lookupEmail(author.handle)).collect {
    case Some(emailAddress) => emailAddress
  }

val sendEmails: RunnableGraph[NotUsed] =
  emailAddresses
    .mapAsyncUnordered(4)(address => {
      emailServer.send(Email(to = address, title = "Akka", body = "I like your tweet"))
    })
    .to(Sink.ignore)

sendEmails.run()
```

Java

```
[source](https://github.com/akka/akka/tree/v2.5.32/akka-docs/src/test/java/jdocs/stream/IntegrationDocTest.java#L507-L522 "Go to snippet source")final Source<Author, NotUsed> authors =
    tweets.filter(t -> t.hashtags().contains(AKKA)).map(t -> t.author);

final Source<String, NotUsed> emailAddresses =
    authors
        .mapAsyncUnordered(4, author -> addressSystem.lookupEmail(author.handle))
        .filter(o -> o.isPresent())
        .map(o -> o.get());

final RunnableGraph<NotUsed> sendEmails =
    emailAddresses
        .mapAsyncUnordered(
            4, address -> emailServer.send(new Email(address, "Akka", "I like your tweet")))
        .to(Sink.ignore());

sendEmails.run(mat);
```

In the above example the services conveniently returned a `Future``CompletionStage` of the result. If that is not the case you need to wrap the call in a `Future``CompletionStage`. If the service call involves blocking you must also make sure that you run it on a dedicated execution context, to avoid starvation and disturbance of other tasks in the system.

Scala

```
[source](https://github.com/akka/akka/tree/v2.5.32/akka-docs/src/test/scala/docs/stream/IntegrationDocSpec.scala#L322-L333 "Go to snippet source")val blockingExecutionContext = system.dispatchers.lookup("blocking-dispatcher")

val sendTextMessages: RunnableGraph[NotUsed] =
  phoneNumbers
    .mapAsync(4)(phoneNo => {
      Future {
        smsServer.send(TextMessage(to = phoneNo, body = "I like your tweet"))
      }(blockingExecutionContext)
    })
    .to(Sink.ignore)

sendTextMessages.run()
```

Java

```
[source](https://github.com/akka/akka/tree/v2.5.32/akka-docs/src/test/java/jdocs/stream/IntegrationDocTest.java#L546-L558 "Go to snippet source")final Executor blockingEc = system.dispatchers().lookup("blocking-dispatcher");

final RunnableGraph<NotUsed> sendTextMessages =
    phoneNumbers
        .mapAsync(
            4,
            phoneNo ->
                CompletableFuture.supplyAsync(
                    () -> smsServer.send(new TextMessage(phoneNo, "I like your tweet")),
                    blockingEc))
        .to(Sink.ignore());

sendTextMessages.run(mat);
```

The configuration of the `"blocking-dispatcher"` may look something like:

```
[source](https://github.com/akka/akka/tree/v2.5.32/akka-docs/src/test/scala/docs/stream/IntegrationDocSpec.scala#L33-L39 "Go to snippet source")blocking-dispatcher {
  executor = "thread-pool-executor"
  thread-pool-executor {
    core-pool-size-min    = 10
    core-pool-size-max    = 10
  }
}
```

An alternative for blocking calls is to perform them in a `map` operation, still using a dedicated dispatcher for that operation.

Scala

```
[source](https://github.com/akka/akka/tree/v2.5.32/akka-docs/src/test/scala/docs/stream/IntegrationDocSpec.scala#L360-L368 "Go to snippet source")val send = Flow[String]
  .map { phoneNo =>
    smsServer.send(TextMessage(to = phoneNo, body = "I like your tweet"))
  }
  .withAttributes(ActorAttributes.dispatcher("blocking-dispatcher"))
val sendTextMessages: RunnableGraph[NotUsed] =
  phoneNumbers.via(send).to(Sink.ignore)

sendTextMessages.run()
```

Java

```
[source](https://github.com/akka/akka/tree/v2.5.32/akka-docs/src/test/java/jdocs/stream/IntegrationDocTest.java#L594-L600 "Go to snippet source")final Flow<String, Boolean, NotUsed> send =
    Flow.of(String.class)
        .map(phoneNo -> smsServer.send(new TextMessage(phoneNo, "I like your tweet")))
        .withAttributes(ActorAttributes.dispatcher("blocking-dispatcher"));
final RunnableGraph<?> sendTextMessages = phoneNumbers.via(send).to(Sink.ignore());

sendTextMessages.run(mat);
```

However, that is not exactly the same as `mapAsync`, since the `mapAsync` may run several calls concurrently, but `map` performs them one at a time.

For a service that is exposed as an actor, or if an actor is used as a gateway in front of an external service, you can use `ask`:

Scala

```
[source](https://github.com/akka/akka/tree/v2.5.32/akka-docs/src/test/scala/docs/stream/IntegrationDocSpec.scala#L385-L391 "Go to snippet source")import akka.pattern.ask

val akkaTweets: Source[Tweet, NotUsed] = tweets.filter(_.hashtags.contains(akkaTag))

implicit val timeout = Timeout(3.seconds)
val saveTweets: RunnableGraph[NotUsed] =
  akkaTweets.mapAsync(4)(tweet => database ? Save(tweet)).to(Sink.ignore)
```

Java

```
[source](https://github.com/akka/akka/tree/v2.5.32/akka-docs/src/test/java/jdocs/stream/IntegrationDocTest.java#L625-L630 "Go to snippet source")final Source<Tweet, NotUsed> akkaTweets = tweets.filter(t -> t.hashtags().contains(AKKA));

final RunnableGraph<NotUsed> saveTweets =
    akkaTweets
        .mapAsync(4, tweet -> ask(database, new Save(tweet), Duration.ofMillis(300L)))
        .to(Sink.ignore());
```

Note that if the `ask` is not completed within the given timeout the stream is completed with failure. If that is not desired outcome you can use `recover` on the `ask` `Future``CompletionStage`.

### Illustrating ordering and parallelism

Let us look at another example to get a better understanding of the ordering and parallelism characteristics of `mapAsync` and `mapAsyncUnordered`.

Several `mapAsync` and `mapAsyncUnordered` futures may run concurrently. The number of concurrent futures are limited by the downstream demand. For example, if 5 elements have been requested by downstream there will be at most 5 futures in progress.

`mapAsync` emits the future results in the same order as the input elements were received. That means that completed results are only emitted downstream when earlier results have been completed and emitted. One slow call will thereby delay the results of all successive calls, even though they are completed before the slow call.

`mapAsyncUnordered` emits the future results as soon as they are completed, i.e. it is possible that the elements are not emitted downstream in the same order as received from upstream. One slow call will thereby not delay the results of faster successive calls as long as there is downstream demand of several elements.

Here is a fictive service that we can use to illustrate these aspects.

Scala

```
[source](https://github.com/akka/akka/tree/v2.5.32/akka-docs/src/test/scala/docs/stream/IntegrationDocSpec.scala#L102-L120 "Go to snippet source")class SometimesSlowService(implicit ec: ExecutionContext) {

  private val runningCount = new AtomicInteger

  def convert(s: String): Future[String] = {
    println(s"running: $s (${runningCount.incrementAndGet()})")
    Future {
      if (s.nonEmpty && s.head.isLower)
        Thread.sleep(500)
      else
        Thread.sleep(20)
      println(s"completed: $s (${runningCount.decrementAndGet()})")
      s.toUpperCase
    }
  }
}
```

Java

```
[source](https://github.com/akka/akka/tree/v2.5.32/akka-docs/src/test/java/jdocs/stream/IntegrationDocTest.java#L277-L305 "Go to snippet source")static class SometimesSlowService {
  private final Executor ec;

  public SometimesSlowService(Executor ec) {
    this.ec = ec;
  }

  private final AtomicInteger runningCount = new AtomicInteger();

  public CompletionStage<String> convert(String s) {
    System.out.println("running: " + s + "(" + runningCount.incrementAndGet() + ")");
    return CompletableFuture.supplyAsync(
        () -> {
          if (!s.isEmpty() && Character.isLowerCase(s.charAt(0)))
            try {
              Thread.sleep(500);
            } catch (InterruptedException e) {
            }
          else
            try {
              Thread.sleep(20);
            } catch (InterruptedException e) {
            }
          System.out.println("completed: " + s + "(" + runningCount.decrementAndGet() + ")");
          return s.toUpperCase();
        },
        ec);
  }
}
```

Elements starting with a lower case character are simulated to take longer time to process.

Here is how we can use it with `mapAsync`:

Scala

```
[source](https://github.com/akka/akka/tree/v2.5.32/akka-docs/src/test/scala/docs/stream/IntegrationDocSpec.scala#L413-L422 "Go to snippet source")implicit val blockingExecutionContext = system.dispatchers.lookup("blocking-dispatcher")
val service = new SometimesSlowService

implicit val materializer =
  ActorMaterializer(ActorMaterializerSettings(system).withInputBuffer(initialSize = 4, maxSize = 4))

Source(List("a", "B", "C", "D", "e", "F", "g", "H", "i", "J"))
  .map(elem => { println(s"before: $elem"); elem })
  .mapAsync(4)(service.convert)
  .runForeach(elem => println(s"after: $elem"))
```

Java

```
[source](https://github.com/akka/akka/tree/v2.5.32/akka-docs/src/test/java/jdocs/stream/IntegrationDocTest.java#L666-L680 "Go to snippet source")final Executor blockingEc = system.dispatchers().lookup("blocking-dispatcher");
final SometimesSlowService service = new SometimesSlowService(blockingEc);

final ActorMaterializer mat =
    ActorMaterializer.create(
        ActorMaterializerSettings.create(system).withInputBuffer(4, 4), system);

Source.from(Arrays.asList("a", "B", "C", "D", "e", "F", "g", "H", "i", "J"))
    .map(
        elem -> {
          System.out.println("before: " + elem);
          return elem;
        })
    .mapAsync(4, service::convert)
    .runForeach(elem -> System.out.println("after: " + elem), mat);
```

The output may look like this:

```
before: a
before: B
before: C
before: D
running: a (1)
running: B (2)
before: e
running: C (3)
before: F
running: D (4)
before: g
before: H
completed: C (3)
completed: B (2)
completed: D (1)
completed: a (0)
after: A
after: B
running: e (1)
after: C
after: D
running: F (2)
before: i
before: J
running: g (3)
running: H (4)
completed: H (2)
completed: F (3)
completed: e (1)
completed: g (0)
after: E
after: F
running: i (1)
after: G
after: H
running: J (2)
completed: J (1)
completed: i (0)
after: I
after: J

```

Note that `after` lines are in the same order as the `before` lines even though elements are `completed` in a different order. For example `H` is `completed` before `g`, but still emitted afterwards.

The numbers in parenthesis illustrates how many calls that are in progress at the same time. Here the downstream demand and thereby the number of concurrent calls are limited by the buffer size (4\) of the `ActorMaterializerSettings`.

Here is how we can use the same service with `mapAsyncUnordered`:

Scala

```
[source](https://github.com/akka/akka/tree/v2.5.32/akka-docs/src/test/scala/docs/stream/IntegrationDocSpec.scala#L445-L454 "Go to snippet source")implicit val blockingExecutionContext = system.dispatchers.lookup("blocking-dispatcher")
val service = new SometimesSlowService

implicit val materializer =
  ActorMaterializer(ActorMaterializerSettings(system).withInputBuffer(initialSize = 4, maxSize = 4))

Source(List("a", "B", "C", "D", "e", "F", "g", "H", "i", "J"))
  .map(elem => { println(s"before: $elem"); elem })
  .mapAsyncUnordered(4)(service.convert)
  .runForeach(elem => println(s"after: $elem"))
```

Java

```
[source](https://github.com/akka/akka/tree/v2.5.32/akka-docs/src/test/java/jdocs/stream/IntegrationDocTest.java#L716-L730 "Go to snippet source")final Executor blockingEc = system.dispatchers().lookup("blocking-dispatcher");
final SometimesSlowService service = new SometimesSlowService(blockingEc);

final ActorMaterializer mat =
    ActorMaterializer.create(
        ActorMaterializerSettings.create(system).withInputBuffer(4, 4), system);

Source.from(Arrays.asList("a", "B", "C", "D", "e", "F", "g", "H", "i", "J"))
    .map(
        elem -> {
          System.out.println("before: " + elem);
          return elem;
        })
    .mapAsyncUnordered(4, service::convert)
    .runForeach(elem -> System.out.println("after: " + elem), mat);
```

The output may look like this:

```
before: a
before: B
before: C
before: D
running: a (1)
running: B (2)
before: e
running: C (3)
before: F
running: D (4)
before: g
before: H
completed: B (3)
completed: C (1)
completed: D (2)
after: B
after: D
running: e (2)
after: C
running: F (3)
before: i
before: J
completed: F (2)
after: F
running: g (3)
running: H (4)
completed: H (3)
after: H
completed: a (2)
after: A
running: i (3)
running: J (4)
completed: J (3)
after: J
completed: e (2)
after: E
completed: g (1)
after: G
completed: i (0)
after: I

```

Note that `after` lines are not in the same order as the `before` lines. For example `H` overtakes the slow `G`.

The numbers in parenthesis illustrates how many calls that are in progress at the same time. Here the downstream demand and thereby the number of concurrent calls are limited by the buffer size (4\) of the `ActorMaterializerSettings`.

## Integrating with Reactive Streams

[Reactive Streams](http://reactive-streams.org/) defines a standard for asynchronous stream processing with non\-blocking back pressure. It makes it possible to plug together stream libraries that adhere to the standard. Akka Streams is one such library.

An incomplete list of other implementations:

- [Reactor (1\.1\+)](https://github.com/reactor/reactor)
- [RxJava](https://github.com/ReactiveX/RxJavaReactiveStreams)
- [Ratpack](http://www.ratpack.io/manual/current/streams.html)
- [Slick](http://slick.lightbend.com)

The two most important interfaces in Reactive Streams are the `Publisher` and `Subscriber`.

Scala

```
[source](https://github.com/akka/akka/tree/v2.5.32/akka-docs/src/test/scala/docs/stream/ReactiveStreamsDocSpec.scala#L20-L21 "Go to snippet source")import org.reactivestreams.Publisher
import org.reactivestreams.Subscriber
```

Java

```
[source](https://github.com/akka/akka/tree/v2.5.32/akka-docs/src/test/java/jdocs/stream/ReactiveStreamsDocTest.java#L23-L25 "Go to snippet source")import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Processor;
```

Let us assume that a library provides a publisher of tweets:

Scala

```
[source](https://github.com/akka/akka/tree/v2.5.32/akka-docs/src/test/scala/docs/stream/ReactiveStreamsDocSpec.scala#L31 "Go to snippet source")def tweets: Publisher[Tweet]
```

Java

```
[source](https://github.com/akka/akka/tree/v2.5.32/akka-docs/src/test/java/jdocs/stream/ReactiveStreamsDocTest.java#L71 "Go to snippet source")Publisher<Tweet> tweets();
```

and another library knows how to store author handles in a database:

Scala

```
[source](https://github.com/akka/akka/tree/v2.5.32/akka-docs/src/test/scala/docs/stream/ReactiveStreamsDocSpec.scala#L35 "Go to snippet source")def storage: Subscriber[Author]
```

Java

```
[source](https://github.com/akka/akka/tree/v2.5.32/akka-docs/src/test/java/jdocs/stream/ReactiveStreamsDocTest.java#L75 "Go to snippet source")Subscriber<Author> storage();
```

Using an Akka Streams `Flow` we can transform the stream and connect those:

Scala

```
[source](https://github.com/akka/akka/tree/v2.5.32/akka-docs/src/test/scala/docs/stream/ReactiveStreamsDocSpec.scala#L26-L27 "Go to snippet source")val authors = Flow[Tweet].filter(_.hashtags.contains(akkaTag)).map(_.author)

Source.fromPublisher(tweets).via(authors).to(Sink.fromSubscriber(storage)).run()
```

Java

```
[source](https://github.com/akka/akka/tree/v2.5.32/akka-docs/src/test/java/jdocs/stream/ReactiveStreamsDocTest.java#L63-L65 "Go to snippet source")final Flow<Tweet, Author, NotUsed> authors =
    Flow.of(Tweet.class).filter(t -> t.hashtags().contains(AKKA)).map(t -> t.author);

Source.fromPublisher(rs.tweets()).via(authors).to(Sink.fromSubscriber(rs.storage()));
```

The `Publisher` is used as an input `Source` to the flow and the `Subscriber` is used as an output `Sink`.

A `Flow` can also be also converted to a `RunnableGraph[Processor[In, Out]]` which materializes to a `Processor` when `run()` is called. `run()` itself can be called multiple times, resulting in a new `Processor` instance each time.

Scala

```
[source](https://github.com/akka/akka/tree/v2.5.32/akka-docs/src/test/scala/docs/stream/ReactiveStreamsDocSpec.scala#L81-L84 "Go to snippet source")val processor: Processor[Tweet, Author] = authors.toProcessor.run()

tweets.subscribe(processor)
processor.subscribe(storage)
```

Java

```
[source](https://github.com/akka/akka/tree/v2.5.32/akka-docs/src/test/java/jdocs/stream/ReactiveStreamsDocTest.java#L158-L161 "Go to snippet source")final Processor<Tweet, Author> processor = authors.toProcessor().run(mat);

rs.tweets().subscribe(processor);
processor.subscribe(rs.storage());
```

A publisher can be connected to a subscriber with the `subscribe` method.

It is also possible to expose a `Source` as a `Publisher` by using the Publisher\-`Sink`:

Scala

```
[source](https://github.com/akka/akka/tree/v2.5.32/akka-docs/src/test/scala/docs/stream/ReactiveStreamsDocSpec.scala#L95-L98 "Go to snippet source")val authorPublisher: Publisher[Author] =
  Source.fromPublisher(tweets).via(authors).runWith(Sink.asPublisher(fanout = false))

authorPublisher.subscribe(storage)
```

Java

```
[source](https://github.com/akka/akka/tree/v2.5.32/akka-docs/src/test/java/jdocs/stream/ReactiveStreamsDocTest.java#L176-L181 "Go to snippet source")final Publisher<Author> authorPublisher =
    Source.fromPublisher(rs.tweets())
        .via(authors)
        .runWith(Sink.asPublisher(AsPublisher.WITHOUT_FANOUT), mat);

authorPublisher.subscribe(rs.storage());
```

A publisher that is created with `Sink.asPublisher(fanout = false)``Sink.asPublisher(AsPublisher.WITHOUT_FANOUT)` supports only a single subscription. Additional subscription attempts will be rejected with an `IllegalStateException`.

A publisher that supports multiple subscribers using fan\-out/broadcasting is created as follows:

Scala

```
[source](https://github.com/akka/akka/tree/v2.5.32/akka-docs/src/test/scala/docs/stream/ReactiveStreamsDocSpec.scala#L39 "Go to snippet source")def alert: Subscriber[Author]
def storage: Subscriber[Author]
```

Java

```
[source](https://github.com/akka/akka/tree/v2.5.32/akka-docs/src/test/java/jdocs/stream/ReactiveStreamsDocTest.java#L79 "Go to snippet source")Subscriber<Author> alert();
Subscriber<Author> storage();
```

Scala

```
[source](https://github.com/akka/akka/tree/v2.5.32/akka-docs/src/test/scala/docs/stream/ReactiveStreamsDocSpec.scala#L110-L114 "Go to snippet source")val authorPublisher: Publisher[Author] =
  Source.fromPublisher(tweets).via(authors).runWith(Sink.asPublisher(fanout = true))

authorPublisher.subscribe(storage)
authorPublisher.subscribe(alert)
```

Java

```
[source](https://github.com/akka/akka/tree/v2.5.32/akka-docs/src/test/java/jdocs/stream/ReactiveStreamsDocTest.java#L196-L202 "Go to snippet source")final Publisher<Author> authorPublisher =
    Source.fromPublisher(rs.tweets())
        .via(authors)
        .runWith(Sink.asPublisher(AsPublisher.WITH_FANOUT), mat);

authorPublisher.subscribe(rs.storage());
authorPublisher.subscribe(rs.alert());
```

The input buffer size of the operator controls how far apart the slowest subscriber can be from the fastest subscriber before slowing down the stream.

To make the picture complete, it is also possible to expose a `Sink` as a `Subscriber` by using the Subscriber\-`Source`:

Scala

```
[source](https://github.com/akka/akka/tree/v2.5.32/akka-docs/src/test/scala/docs/stream/ReactiveStreamsDocSpec.scala#L127-L130 "Go to snippet source")val tweetSubscriber: Subscriber[Tweet] =
  authors.to(Sink.fromSubscriber(storage)).runWith(Source.asSubscriber[Tweet])

tweets.subscribe(tweetSubscriber)
```

Java

```
[source](https://github.com/akka/akka/tree/v2.5.32/akka-docs/src/test/java/jdocs/stream/ReactiveStreamsDocTest.java#L217-L222 "Go to snippet source")final Subscriber<Author> storage = rs.storage();

final Subscriber<Tweet> tweetSubscriber =
    authors.to(Sink.fromSubscriber(storage)).runWith(Source.asSubscriber(), mat);

rs.tweets().subscribe(tweetSubscriber);
```

It is also possible to use re\-wrap `Processor` instances as a `Flow` by passing a factory function that will create the `Processor` instances:

Scala

```
[source](https://github.com/akka/akka/tree/v2.5.32/akka-docs/src/test/scala/docs/stream/ReactiveStreamsDocSpec.scala#L139-L142 "Go to snippet source")// An example Processor factory
def createProcessor: Processor[Int, Int] = Flow[Int].toProcessor.run()

val flow: Flow[Int, Int, NotUsed] = Flow.fromProcessor(() => createProcessor)
```

Java

```
[source](https://github.com/akka/akka/tree/v2.5.32/akka-docs/src/test/java/jdocs/stream/ReactiveStreamsDocTest.java#L235-L244 "Go to snippet source")// An example Processor factory
final Creator<Processor<Integer, Integer>> factory =
    new Creator<Processor<Integer, Integer>>() {
      public Processor<Integer, Integer> create() {
        return Flow.of(Integer.class).toProcessor().run(mat);
      }
    };

final Flow<Integer, Integer, NotUsed> flow = Flow.fromProcessor(factory);

```

Please note that a factory is necessary to achieve reusability of the resulting `Flow`.

### Implementing Reactive Streams Publisher or Subscriber

As described above any Akka Streams `Source` can be exposed as a Reactive Streams `Publisher` and any `Sink` can be exposed as a Reactive Streams `Subscriber`. Therefore we recommend that you implement Reactive Streams integrations with built\-in operators or [custom operators](stream-customize.html).

For historical reasons the `ActorPublisher` and `ActorSubscriber` traits are provided to support implementing Reactive Streams `Publisher` and `Subscriber` with an `Actor`.

These can be consumed by other Reactive Stream libraries or used as an Akka Streams `Source` or `Sink`.

Warning
`ActorPublisher` and `ActorSubscriber` cannot be used with remote actors, because if signals of the Reactive Streams protocol (e.g. `request`) are lost the the stream may deadlock.

#### ActorPublisher

Warning
**Deprecation warning:** `ActorPublisher` is deprecated in favour of the vastly more type\-safe and safe to implement [`GraphStage`](stream-customize.html). It can also expose a “operator actor ref” is needed to be addressed as\-if an Actor. Custom operators implemented using [`GraphStage`](stream-customize.html) are also automatically fusable.

To learn more about implementing custom operators using it refer to [Custom processing with GraphStage](stream-customize.html#graphstage).

Extend `akka.stream.actor.ActorPublisher` in your `Actor` to make it`akka.stream.actor.AbstractActorPublisher` to implement a stream publisher that keeps track of the subscription life cycle and requested elements.

Here is an example of such an actor. It dispatches incoming jobs to the attached subscriber:

Scala

```
[source](https://github.com/akka/akka/tree/v2.5.32/akka-docs/src/test/scala/docs/stream/ActorPublisherDocSpec.scala#L17-L66 "Go to snippet source")object JobManager {
  def props: Props = Props[JobManager]

  final case class Job(payload: String)
  case object JobAccepted
  case object JobDenied
}

class JobManager extends ActorPublisher[JobManager.Job] {
  import akka.stream.actor.ActorPublisherMessage._
  import JobManager._

  val MaxBufferSize = 100
  var buf = Vector.empty[Job]

  def receive = {
    case job: Job if buf.size == MaxBufferSize =>
      sender() ! JobDenied
    case job: Job =>
      sender() ! JobAccepted
      if (buf.isEmpty && totalDemand > 0)
        onNext(job)
      else {
        buf :+= job
        deliverBuf()
      }
    case Request(_) =>
      deliverBuf()
    case Cancel =>
      context.stop(self)
  }

  @tailrec final def deliverBuf(): Unit =
    if (totalDemand > 0) {
      /*
       * totalDemand is a Long and could be larger than
       * what buf.splitAt can accept
       */
      if (totalDemand <= Int.MaxValue) {
        val (use, keep) = buf.splitAt(totalDemand.toInt)
        buf = keep
        use.foreach(onNext)
      } else {
        val (use, keep) = buf.splitAt(Int.MaxValue)
        buf = keep
        use.foreach(onNext)
        deliverBuf()
      }
    }
}
```

Java

```
[source](https://github.com/akka/akka/tree/v2.5.32/akka-docs/src/test/java/jdocs/stream/ActorPublisherDocTest.java#L44-L126 "Go to snippet source")public static class JobManagerProtocol {
  public static final class Job {
    public final String payload;

    public Job(String payload) {
      this.payload = payload;
    }
  }

  public static class JobAcceptedMessage {
    @Override
    public String toString() {
      return "JobAccepted";
    }
  }

  public static final JobAcceptedMessage JobAccepted = new JobAcceptedMessage();

  public static class JobDeniedMessage {
    @Override
    public String toString() {
      return "JobDenied";
    }
  }

  public static final JobDeniedMessage JobDenied = new JobDeniedMessage();
}

public static class JobManager extends AbstractActorPublisher<JobManagerProtocol.Job> {

  public static Props props() {
    return Props.create(JobManager.class);
  }

  private final int MAX_BUFFER_SIZE = 100;
  private final List<JobManagerProtocol.Job> buf = new ArrayList<>();

  @Override
  public Receive createReceive() {
    return receiveBuilder()
        .match(
            JobManagerProtocol.Job.class,
            job -> buf.size() == MAX_BUFFER_SIZE,
            job -> {
              getSender().tell(JobManagerProtocol.JobDenied, getSelf());
            })
        .match(
            JobManagerProtocol.Job.class,
            job -> {
              getSender().tell(JobManagerProtocol.JobAccepted, getSelf());

              if (buf.isEmpty() && totalDemand() > 0) onNext(job);
              else {
                buf.add(job);
                deliverBuf();
              }
            })
        .match(ActorPublisherMessage.Request.class, request -> deliverBuf())
        .match(ActorPublisherMessage.Cancel.class, cancel -> getContext().stop(getSelf()))
        .build();
  }

  void deliverBuf() {
    while (totalDemand() > 0) {
      /*
       * totalDemand is a Long and could be larger than
       * what buf.splitAt can accept
       */
      if (totalDemand() <= Integer.MAX_VALUE) {
        final List<JobManagerProtocol.Job> took =
            buf.subList(0, Math.min(buf.size(), (int) totalDemand()));
        took.forEach(this::onNext);
        buf.removeAll(took);
        break;
      } else {
        final List<JobManagerProtocol.Job> took =
            buf.subList(0, Math.min(buf.size(), Integer.MAX_VALUE));
        took.forEach(this::onNext);
        buf.removeAll(took);
      }
    }
  }
}
```

You send elements to the stream by calling `onNext`. You are allowed to send as many elements as have been requested by the stream subscriber. This amount can be inquired with `totalDemand`. It is only allowed to use `onNext` when `isActive` and `totalDemand>0`, otherwise `onNext` will throw `IllegalStateException`.

When the stream subscriber requests more elements the `ActorPublisherMessage.Request` message is delivered to this actor, and you can act on that event. The `totalDemand` is updated automatically.

When the stream subscriber cancels the subscription the `ActorPublisherMessage.Cancel` message is delivered to this actor. After that subsequent calls to `onNext` will be ignored.

You can complete the stream by calling `onComplete`. After that you are not allowed to call `onNext`, `onError` and `onComplete`.

You can terminate the stream with failure by calling `onError`. After that you are not allowed to call `onNext`, `onError` and `onComplete`.

If you suspect that this `ActorPublisher``AbstractActorPublisher` may never get subscribed to, you can override the `subscriptionTimeout` method to provide a timeout after which this Publisher should be considered canceled. The actor will be notified when the timeout triggers via an `ActorPublisherMessage.SubscriptionTimeoutExceeded` message and MUST then perform cleanup and stop itself.

If the actor is stopped the stream will be completed, unless it was not already terminated with failure, completed or canceled.

More detailed information can be found in the API documentation.

This is how it can be used as input `Source` to a `Flow`:

Scala

```
[source](https://github.com/akka/akka/tree/v2.5.32/akka-docs/src/test/scala/docs/stream/ActorPublisherDocSpec.scala#L80-L91 "Go to snippet source")val jobManagerSource = Source.actorPublisher[JobManager.Job](JobManager.props)
val ref = Flow[JobManager.Job]
  .map(_.payload.toUpperCase)
  .map { elem =>
    println(elem); elem
  }
  .to(Sink.ignore)
  .runWith(jobManagerSource)

ref ! JobManager.Job("a")
ref ! JobManager.Job("b")
ref ! JobManager.Job("c")
```

Java

```
[source](https://github.com/akka/akka/tree/v2.5.32/akka-docs/src/test/java/jdocs/stream/ActorPublisherDocTest.java#L136-L152 "Go to snippet source")final Source<JobManagerProtocol.Job, ActorRef> jobManagerSource =
    Source.actorPublisher(JobManager.props());

final ActorRef ref =
    jobManagerSource
        .map(job -> job.payload.toUpperCase())
        .map(
            elem -> {
              System.out.println(elem);
              return elem;
            })
        .to(Sink.ignore())
        .run(mat);

ref.tell(new JobManagerProtocol.Job("a"), ActorRef.noSender());
ref.tell(new JobManagerProtocol.Job("b"), ActorRef.noSender());
ref.tell(new JobManagerProtocol.Job("c"), ActorRef.noSender());
```

A publisher that is created with `Sink.asPublisher` supports a specified number of subscribers. Additional subscription attempts will be rejected with an `IllegalStateException`. You can only attach one subscriber to this publisher. Use a `Broadcast`\-element or attach a `Sink.asPublisher(AsPublisher.WITH_FANOUT)` to enable multiple subscribers. 

#### ActorSubscriber

Warning
**Deprecation warning:** `ActorSubscriber` is deprecated in favour of the vastly more type\-safe and safe to implement [`GraphStage`](stream-customize.html). It can also expose a “operator actor ref” is needed to be addressed as\-if an Actor. Custom operators implemented using [`GraphStage`](stream-customize.html) are also automatically fusable.

To learn more about implementing custom operators using it refer to [Custom processing with GraphStage](stream-customize.html#graphstage).

Extend `akka.stream.actor.ActorSubscriber` in your `Actor` to make it`akka.stream.actor.AbstractActorSubscriber` to make your class a stream subscriber with full control of stream back pressure. It will receive `ActorSubscriberMessage.OnNext`, `ActorSubscriberMessage.OnComplete` and `ActorSubscriberMessage.OnError` messages from the stream. It can also receive other, non\-stream messages, in the same way as any actor.

Here is an example of such an actor. It dispatches incoming jobs to child worker actors:

Scala

```
[source](https://github.com/akka/akka/tree/v2.5.32/akka-docs/src/test/scala/docs/stream/ActorSubscriberDocSpec.scala#L24-L76 "Go to snippet source")object WorkerPool {
  case class Msg(id: Int, replyTo: ActorRef)
  case class Work(id: Int)
  case class Reply(id: Int)
  case class Done(id: Int)

  def props: Props = Props(new WorkerPool)
}

class WorkerPool extends ActorSubscriber {
  import WorkerPool._
  import ActorSubscriberMessage._

  val MaxQueueSize = 10
  var queue = Map.empty[Int, ActorRef]

  val router = {
    val routees = Vector.fill(3) {
      ActorRefRoutee(context.actorOf(Props[Worker]))
    }
    Router(RoundRobinRoutingLogic(), routees)
  }

  override val requestStrategy = new MaxInFlightRequestStrategy(max = MaxQueueSize) {
    override def inFlightInternally: Int = queue.size
  }

  def receive = {
    case OnNext(Msg(id, replyTo)) =>
      queue += (id -> replyTo)
      assert(queue.size <= MaxQueueSize, s"queued too many: ${queue.size}")
      router.route(Work(id), self)
    case Reply(id) =>
      queue(id) ! Done(id)
      queue -= id
      if (canceled && queue.isEmpty) {
        context.stop(self)
      }
    case OnComplete =>
      if (queue.isEmpty) {
        context.stop(self)
      }
  }
}

class Worker extends Actor {
  import WorkerPool._
  def receive = {
    case Work(id) =>
      // ...
      sender() ! Reply(id)
  }
}
```

Java

```
[source](https://github.com/akka/akka/tree/v2.5.32/akka-docs/src/test/java/jdocs/stream/ActorSubscriberDocTest.java#L53-L225 "Go to snippet source")public static class WorkerPoolProtocol {

  public static class Msg {
    public final int id;
    public final ActorRef replyTo;

    public Msg(int id, ActorRef replyTo) {
      this.id = id;
      this.replyTo = replyTo;
    }

    @Override
    public String toString() {
      return String.format("Msg(%s, %s)", id, replyTo);
    }
  }

  public static Msg msg(int id, ActorRef replyTo) {
    return new Msg(id, replyTo);
  }

  public static class Work {
    public final int id;

    public Work(int id) {
      this.id = id;
    }

    @Override
    public String toString() {
      return String.format("Work(%s)", id);
    }
  }

  public static Work work(int id) {
    return new Work(id);
  }

  public static class Reply {
    public final int id;

    public Reply(int id) {
      this.id = id;
    }

    @Override
    public String toString() {
      return String.format("Reply(%s)", id);
    }
  }

  public static Reply reply(int id) {
    return new Reply(id);
  }

  public static class Done {
    public final int id;

    public Done(int id) {
      this.id = id;
    }

    @Override
    public String toString() {
      return String.format("Done(%s)", id);
    }

    @Override
    public boolean equals(Object o) {
      if (this == o) {
        return true;
      }
      if (o == null || getClass() != o.getClass()) {
        return false;
      }

      Done done = (Done) o;

      if (id != done.id) {
        return false;
      }

      return true;
    }

    @Override
    public int hashCode() {
      return id;
    }
  }

  public static Done done(int id) {
    return new Done(id);
  }
}

public static class WorkerPool extends AbstractActorSubscriber {

  public static Props props() {
    return Props.create(WorkerPool.class);
  }

  final int MAX_QUEUE_SIZE = 10;
  final Map<Integer, ActorRef> queue = new HashMap<>();

  final Router router;

  @Override
  public RequestStrategy requestStrategy() {
    return new MaxInFlightRequestStrategy(MAX_QUEUE_SIZE) {
      @Override
      public int inFlightInternally() {
        return queue.size();
      }
    };
  }

  public WorkerPool() {
    final List<Routee> routees = new ArrayList<>();
    for (int i = 0; i < 3; i++)
      routees.add(new ActorRefRoutee(getContext().actorOf(Props.create(Worker.class))));
    router = new Router(new RoundRobinRoutingLogic(), routees);
  }

  @Override
  public Receive createReceive() {
    return receiveBuilder()
        .match(
            ActorSubscriberMessage.OnNext.class,
            on -> on.element() instanceof WorkerPoolProtocol.Msg,
            onNext -> {
              WorkerPoolProtocol.Msg msg = (WorkerPoolProtocol.Msg) onNext.element();
              queue.put(msg.id, msg.replyTo);

              if (queue.size() > MAX_QUEUE_SIZE)
                throw new RuntimeException("queued too many: " + queue.size());

              router.route(WorkerPoolProtocol.work(msg.id), getSelf());
            })
        .match(
            ActorSubscriberMessage.onCompleteInstance().getClass(),
            complete -> {
              if (queue.isEmpty()) {
                getContext().stop(getSelf());
              }
            })
        .match(
            WorkerPoolProtocol.Reply.class,
            reply -> {
              int id = reply.id;
              queue.get(id).tell(WorkerPoolProtocol.done(id), getSelf());
              queue.remove(id);
              if (canceled() && queue.isEmpty()) {
                getContext().stop(getSelf());
              }
            })
        .build();
  }
}

static class Worker extends AbstractActor {
  @Override
  public Receive createReceive() {
    return receiveBuilder()
        .match(
            WorkerPoolProtocol.Work.class,
            work -> {
              // ...
              getSender().tell(WorkerPoolProtocol.reply(work.id), getSelf());
            })
        .build();
  }
}
```

Subclass must define the `RequestStrategy` to control stream back pressure. After each incoming message the `ActorSubscriber``AbstractActorSubscriber` will automatically invoke the `RequestStrategy.requestDemand` and propagate the returned demand to the stream.

- The provided `WatermarkRequestStrategy` is a good strategy if the actor performs work itself.
- The provided `MaxInFlightRequestStrategy` is useful if messages are queued internally or delegated to other actors.
- You can also implement a custom `RequestStrategy` or call `request` manually together with `ZeroRequestStrategy` or some other strategy. In that case you must also call `request` when the actor is started or when it is ready, otherwise it will not receive any elements.

More detailed information can be found in the API documentation.

This is how it can be used as output `Sink` to a `Flow`:

Scala

```
[source](https://github.com/akka/akka/tree/v2.5.32/akka-docs/src/test/scala/docs/stream/ActorSubscriberDocSpec.scala#L90-L91 "Go to snippet source")val N = 117
val worker = Source(1 to N).map(WorkerPool.Msg(_, replyTo)).runWith(Sink.actorSubscriber(WorkerPool.props))
```

Java

```
[source](https://github.com/akka/akka/tree/v2.5.32/akka-docs/src/test/java/jdocs/stream/ActorSubscriberDocTest.java#L236-L245 "Go to snippet source")final int N = 117;
final List<Integer> data = new ArrayList<>(N);
for (int i = 0; i < N; i++) {
  data.add(i);
}

final ActorRef worker =
    Source.from(data)
        .map(i -> WorkerPoolProtocol.msg(i, replyTo))
        .runWith(Sink.<WorkerPoolProtocol.Msg>actorSubscriber(WorkerPool.props()), mat);
```

## Code Examples

### Example 1: Dependency

```scala
libraryDependencies += "com.typesafe.akka" %% "akka-stream" % "2.5.32"
```

### Example 2: Dependency

```xml
<dependencies&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-stream_2.12</artifactId>
    <version>2.5.32</version>
  </dependency&gt
</dependencies>
```

### Example 3: Dependency

```gradle
dependencies {
  implementation "com.typesafe.akka:akka-stream_2.12:2.5.32"
}
```

### Example 4: ask

```scala
implicit val askTimeout = Timeout(5.seconds)
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
    .runWith(Sink.ignore(), mat);
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

### Example 8: Sink.actorRefWithAck

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
val receiver = system.actorOf(Props(new AckingReceiver(probe.ref, ackWith = AckMessage)))
val sink = Sink.actorRefWithAck(
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

### Example 9: Sink.actorRefWithAck

```java
Source<String, NotUsed> words = Source.from(Arrays.asList("hello", "hi"));

final TestKit probe = new TestKit(system);

ActorRef receiver = system.actorOf(Props.create(AckingReceiver.class, probe.getRef()));

Sink<String, NotUsed> sink =
    Sink.<String>actorRefWithAck(
        receiver,
        new StreamInitialized(),
        Ack.INSTANCE,
        new StreamCompleted(),
        ex -> new StreamFailure(ex));

words.map(el -> el.toLowerCase()).runWith(sink, mat);

probe.expectMsg("Stream initialized");
probe.expectMsg("hello");
probe.expectMsg("hi");
probe.expectMsg("Stream completed");
```

### Example 10: Sink.actorRefWithAck

```scala
object AckingReceiver {
  case object Ack

  case object StreamInitialized
  case object StreamCompleted
  final case class StreamFailure(ex: Throwable)
}

class AckingReceiver(probe: ActorRef, ackWith: Any) extends Actor with ActorLogging {
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

### Example 11: Sink.actorRefWithAck

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
  .queue[Int](bufferSize, OverflowStrategy.backpressure)
  .throttle(elementsToProcess, 3.second)
  .map(x => x * x)
  .toMat(Sink.foreach(x => println(s"completed $x")))(Keep.left)
  .run()

val source = Source(1 to 10)

implicit val ec = system.dispatcher
source
  .mapAsync(1)(x => {
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

SourceQueueWithComplete<Integer> sourceQueue =
    Source.<Integer>queue(bufferSize, OverflowStrategy.backpressure())
        .throttle(elementsToProcess, Duration.ofSeconds(3))
        .map(x -> x * x)
        .to(Sink.foreach(x -> System.out.println("got: " + x)))
        .run(mat);

Source<Integer, NotUsed> source = Source.from(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

source.map(x -> sourceQueue.offer(x)).runWith(Sink.ignore(), mat);
```

### Example 14: Source.actorRef

```scala
val bufferSize = 10

val ref = Source
  .actorRef[Int](bufferSize, OverflowStrategy.fail) // note: backpressure is not supported
  .map(x => x * x)
  .toMat(Sink.foreach(x => println(s"completed $x")))(Keep.left)
  .run()

ref ! 1
ref ! 2
ref ! 3
ref ! akka.actor.Status.Success("done")
```

### Example 15: Source.actorRef

```java
int bufferSize = 10;

Source<Integer, ActorRef> source =
    Source.actorRef(
        bufferSize, OverflowStrategy.dropHead()); // note: backpressure is not supported
ActorRef actorRef =
    source.map(x -> x * x).to(Sink.foreach(x -> System.out.println("got: " + x))).run(mat);

actorRef.tell(1, ActorRef.noSender());
actorRef.tell(2, ActorRef.noSender());
actorRef.tell(3, ActorRef.noSender());
actorRef.tell(
    new akka.actor.Status.Success(CompletionStrategy.draining()), ActorRef.noSender());
```

### Example 16: Integrating with External Services

```scala
def send(email: Email): Future[Unit] = {
  // ...
}
```

### Example 17: Integrating with External Services

```java
public CompletionStage<Email> send(Email email) {
  // ...
}
```

### Example 18: Integrating with External Services

```scala
val authors: Source[Author, NotUsed] =
  tweets.filter(_.hashtags.contains(akkaTag)).map(_.author)
```

### Example 19: Integrating with External Services

```java
final Source<Author, NotUsed> authors =
    tweets.filter(t -> t.hashtags().contains(AKKA)).map(t -> t.author);
```

### Example 20: Integrating with External Services

```scala
def lookupEmail(handle: String): Future[Option[String]] =
```

### Example 21: Integrating with External Services

```java
public CompletionStage<Optional<String>> lookupEmail(String handle)
```

### Example 22: Integrating with External Services

```scala
val emailAddresses: Source[String, NotUsed] =
  authors.mapAsync(4)(author => addressSystem.lookupEmail(author.handle)).collect {
    case Some(emailAddress) => emailAddress
  }
```

### Example 23: Integrating with External Services

```java
final Source<String, NotUsed> emailAddresses =
    authors
        .mapAsync(4, author -> addressSystem.lookupEmail(author.handle))
        .filter(o -> o.isPresent())
        .map(o -> o.get());
```

### Example 24: Integrating with External Services

```scala
val sendEmails: RunnableGraph[NotUsed] =
  emailAddresses
    .mapAsync(4)(address => {
      emailServer.send(Email(to = address, title = "Akka", body = "I like your tweet"))
    })
    .to(Sink.ignore)

sendEmails.run()
```

### Example 25: Integrating with External Services

```java
final RunnableGraph<NotUsed> sendEmails =
    emailAddresses
        .mapAsync(
            4, address -> emailServer.send(new Email(address, "Akka", "I like your tweet")))
        .to(Sink.ignore());

sendEmails.run(mat);
```

### Example 26: Integrating with External Services

```scala
val authors: Source[Author, NotUsed] =
  tweets.filter(_.hashtags.contains(akkaTag)).map(_.author)

val emailAddresses: Source[String, NotUsed] =
  authors.mapAsyncUnordered(4)(author => addressSystem.lookupEmail(author.handle)).collect {
    case Some(emailAddress) => emailAddress
  }

val sendEmails: RunnableGraph[NotUsed] =
  emailAddresses
    .mapAsyncUnordered(4)(address => {
      emailServer.send(Email(to = address, title = "Akka", body = "I like your tweet"))
    })
    .to(Sink.ignore)

sendEmails.run()
```

### Example 27: Integrating with External Services

```java
final Source<Author, NotUsed> authors =
    tweets.filter(t -> t.hashtags().contains(AKKA)).map(t -> t.author);

final Source<String, NotUsed> emailAddresses =
    authors
        .mapAsyncUnordered(4, author -> addressSystem.lookupEmail(author.handle))
        .filter(o -> o.isPresent())
        .map(o -> o.get());

final RunnableGraph<NotUsed> sendEmails =
    emailAddresses
        .mapAsyncUnordered(
            4, address -> emailServer.send(new Email(address, "Akka", "I like your tweet")))
        .to(Sink.ignore());

sendEmails.run(mat);
```

### Example 28: Integrating with External Services

```scala
val blockingExecutionContext = system.dispatchers.lookup("blocking-dispatcher")

val sendTextMessages: RunnableGraph[NotUsed] =
  phoneNumbers
    .mapAsync(4)(phoneNo => {
      Future {
        smsServer.send(TextMessage(to = phoneNo, body = "I like your tweet"))
      }(blockingExecutionContext)
    })
    .to(Sink.ignore)

sendTextMessages.run()
```

### Example 29: Integrating with External Services

```java
final Executor blockingEc = system.dispatchers().lookup("blocking-dispatcher");

final RunnableGraph<NotUsed> sendTextMessages =
    phoneNumbers
        .mapAsync(
            4,
            phoneNo ->
                CompletableFuture.supplyAsync(
                    () -> smsServer.send(new TextMessage(phoneNo, "I like your tweet")),
                    blockingEc))
        .to(Sink.ignore());

sendTextMessages.run(mat);
```

### Example 30: Integrating with External Services

```scala
blocking-dispatcher {
  executor = "thread-pool-executor"
  thread-pool-executor {
    core-pool-size-min    = 10
    core-pool-size-max    = 10
  }
}
```

### Example 31: Integrating with External Services

```scala
val send = Flow[String]
  .map { phoneNo =>
    smsServer.send(TextMessage(to = phoneNo, body = "I like your tweet"))
  }
  .withAttributes(ActorAttributes.dispatcher("blocking-dispatcher"))
val sendTextMessages: RunnableGraph[NotUsed] =
  phoneNumbers.via(send).to(Sink.ignore)

sendTextMessages.run()
```

### Example 32: Integrating with External Services

```java
final Flow<String, Boolean, NotUsed> send =
    Flow.of(String.class)
        .map(phoneNo -> smsServer.send(new TextMessage(phoneNo, "I like your tweet")))
        .withAttributes(ActorAttributes.dispatcher("blocking-dispatcher"));
final RunnableGraph<?> sendTextMessages = phoneNumbers.via(send).to(Sink.ignore());

sendTextMessages.run(mat);
```

### Example 33: Integrating with External Services

```scala
import akka.pattern.ask

val akkaTweets: Source[Tweet, NotUsed] = tweets.filter(_.hashtags.contains(akkaTag))

implicit val timeout = Timeout(3.seconds)
val saveTweets: RunnableGraph[NotUsed] =
  akkaTweets.mapAsync(4)(tweet => database ? Save(tweet)).to(Sink.ignore)
```

### Example 34: Integrating with External Services

```java
final Source<Tweet, NotUsed> akkaTweets = tweets.filter(t -> t.hashtags().contains(AKKA));

final RunnableGraph<NotUsed> saveTweets =
    akkaTweets
        .mapAsync(4, tweet -> ask(database, new Save(tweet), Duration.ofMillis(300L)))
        .to(Sink.ignore());
```

### Example 35: Illustrating ordering and parallelism

```scala
class SometimesSlowService(implicit ec: ExecutionContext) {

  private val runningCount = new AtomicInteger

  def convert(s: String): Future[String] = {
    println(s"running: $s (${runningCount.incrementAndGet()})")
    Future {
      if (s.nonEmpty && s.head.isLower)
        Thread.sleep(500)
      else
        Thread.sleep(20)
      println(s"completed: $s (${runningCount.decrementAndGet()})")
      s.toUpperCase
    }
  }
}
```

### Example 36: Illustrating ordering and parallelism

```java
static class SometimesSlowService {
  private final Executor ec;

  public SometimesSlowService(Executor ec) {
    this.ec = ec;
  }

  private final AtomicInteger runningCount = new AtomicInteger();

  public CompletionStage<String> convert(String s) {
    System.out.println("running: " + s + "(" + runningCount.incrementAndGet() + ")");
    return CompletableFuture.supplyAsync(
        () -> {
          if (!s.isEmpty() && Character.isLowerCase(s.charAt(0)))
            try {
              Thread.sleep(500);
            } catch (InterruptedException e) {
            }
          else
            try {
              Thread.sleep(20);
            } catch (InterruptedException e) {
            }
          System.out.println("completed: " + s + "(" + runningCount.decrementAndGet() + ")");
          return s.toUpperCase();
        },
        ec);
  }
}
```

### Example 37: Illustrating ordering and parallelism

```scala
implicit val blockingExecutionContext = system.dispatchers.lookup("blocking-dispatcher")
val service = new SometimesSlowService

implicit val materializer =
  ActorMaterializer(ActorMaterializerSettings(system).withInputBuffer(initialSize = 4, maxSize = 4))

Source(List("a", "B", "C", "D", "e", "F", "g", "H", "i", "J"))
  .map(elem => { println(s"before: $elem"); elem })
  .mapAsync(4)(service.convert)
  .runForeach(elem => println(s"after: $elem"))
```

### Example 38: Illustrating ordering and parallelism

```java
final Executor blockingEc = system.dispatchers().lookup("blocking-dispatcher");
final SometimesSlowService service = new SometimesSlowService(blockingEc);

final ActorMaterializer mat =
    ActorMaterializer.create(
        ActorMaterializerSettings.create(system).withInputBuffer(4, 4), system);

Source.from(Arrays.asList("a", "B", "C", "D", "e", "F", "g", "H", "i", "J"))
    .map(
        elem -> {
          System.out.println("before: " + elem);
          return elem;
        })
    .mapAsync(4, service::convert)
    .runForeach(elem -> System.out.println("after: " + elem), mat);
```

### Example 39: Illustrating ordering and parallelism

```text
before: a
before: B
before: C
before: D
running: a (1)
running: B (2)
before: e
running: C (3)
before: F
running: D (4)
before: g
before: H
completed: C (3)
completed: B (2)
completed: D (1)
completed: a (0)
after: A
after: B
running: e (1)
after: C
after: D
running: F (2)
before: i
before: J
running: g (3)
running: H (4)
completed: H (2)
completed: F (3)
completed: e (1)
completed: g (0)
after: E
after: F
running: i (1)
after: G
after: H
running: J (2)
completed: J (1)
completed: i (0)
after: I
after: J
```

### Example 40: Illustrating ordering and parallelism

```scala
implicit val blockingExecutionContext = system.dispatchers.lookup("blocking-dispatcher")
val service = new SometimesSlowService

implicit val materializer =
  ActorMaterializer(ActorMaterializerSettings(system).withInputBuffer(initialSize = 4, maxSize = 4))

Source(List("a", "B", "C", "D", "e", "F", "g", "H", "i", "J"))
  .map(elem => { println(s"before: $elem"); elem })
  .mapAsyncUnordered(4)(service.convert)
  .runForeach(elem => println(s"after: $elem"))
```

### Example 41: Illustrating ordering and parallelism

```java
final Executor blockingEc = system.dispatchers().lookup("blocking-dispatcher");
final SometimesSlowService service = new SometimesSlowService(blockingEc);

final ActorMaterializer mat =
    ActorMaterializer.create(
        ActorMaterializerSettings.create(system).withInputBuffer(4, 4), system);

Source.from(Arrays.asList("a", "B", "C", "D", "e", "F", "g", "H", "i", "J"))
    .map(
        elem -> {
          System.out.println("before: " + elem);
          return elem;
        })
    .mapAsyncUnordered(4, service::convert)
    .runForeach(elem -> System.out.println("after: " + elem), mat);
```

### Example 42: Illustrating ordering and parallelism

```text
before: a
before: B
before: C
before: D
running: a (1)
running: B (2)
before: e
running: C (3)
before: F
running: D (4)
before: g
before: H
completed: B (3)
completed: C (1)
completed: D (2)
after: B
after: D
running: e (2)
after: C
running: F (3)
before: i
before: J
completed: F (2)
after: F
running: g (3)
running: H (4)
completed: H (3)
after: H
completed: a (2)
after: A
running: i (3)
running: J (4)
completed: J (3)
after: J
completed: e (2)
after: E
completed: g (1)
after: G
completed: i (0)
after: I
```

### Example 43: Integrating with Reactive Streams

```scala
import org.reactivestreams.Publisher
import org.reactivestreams.Subscriber
```

### Example 44: Integrating with Reactive Streams

```java
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Processor;
```

### Example 45: Integrating with Reactive Streams

```scala
def tweets: Publisher[Tweet]
```

### Example 46: Integrating with Reactive Streams

```java
Publisher<Tweet> tweets();
```

### Example 47: Integrating with Reactive Streams

```scala
def storage: Subscriber[Author]
```

### Example 48: Integrating with Reactive Streams

```java
Subscriber<Author> storage();
```

### Example 49: Integrating with Reactive Streams

```scala
val authors = Flow[Tweet].filter(_.hashtags.contains(akkaTag)).map(_.author)

Source.fromPublisher(tweets).via(authors).to(Sink.fromSubscriber(storage)).run()
```

### Example 50: Integrating with Reactive Streams

```java
final Flow<Tweet, Author, NotUsed> authors =
    Flow.of(Tweet.class).filter(t -> t.hashtags().contains(AKKA)).map(t -> t.author);

Source.fromPublisher(rs.tweets()).via(authors).to(Sink.fromSubscriber(rs.storage()));
```

### Example 51: Integrating with Reactive Streams

```scala
val processor: Processor[Tweet, Author] = authors.toProcessor.run()

tweets.subscribe(processor)
processor.subscribe(storage)
```

### Example 52: Integrating with Reactive Streams

```java
final Processor<Tweet, Author> processor = authors.toProcessor().run(mat);

rs.tweets().subscribe(processor);
processor.subscribe(rs.storage());
```

### Example 53: Integrating with Reactive Streams

```scala
val authorPublisher: Publisher[Author] =
  Source.fromPublisher(tweets).via(authors).runWith(Sink.asPublisher(fanout = false))

authorPublisher.subscribe(storage)
```

### Example 54: Integrating with Reactive Streams

```java
final Publisher<Author> authorPublisher =
    Source.fromPublisher(rs.tweets())
        .via(authors)
        .runWith(Sink.asPublisher(AsPublisher.WITHOUT_FANOUT), mat);

authorPublisher.subscribe(rs.storage());
```

### Example 55: Integrating with Reactive Streams

```scala
def alert: Subscriber[Author]
def storage: Subscriber[Author]
```

### Example 56: Integrating with Reactive Streams

```java
Subscriber<Author> alert();
Subscriber<Author> storage();
```

### Example 57: Integrating with Reactive Streams

```scala
val authorPublisher: Publisher[Author] =
  Source.fromPublisher(tweets).via(authors).runWith(Sink.asPublisher(fanout = true))

authorPublisher.subscribe(storage)
authorPublisher.subscribe(alert)
```

### Example 58: Integrating with Reactive Streams

```java
final Publisher<Author> authorPublisher =
    Source.fromPublisher(rs.tweets())
        .via(authors)
        .runWith(Sink.asPublisher(AsPublisher.WITH_FANOUT), mat);

authorPublisher.subscribe(rs.storage());
authorPublisher.subscribe(rs.alert());
```

### Example 59: Integrating with Reactive Streams

```scala
val tweetSubscriber: Subscriber[Tweet] =
  authors.to(Sink.fromSubscriber(storage)).runWith(Source.asSubscriber[Tweet])

tweets.subscribe(tweetSubscriber)
```

### Example 60: Integrating with Reactive Streams

```java
final Subscriber<Author> storage = rs.storage();

final Subscriber<Tweet> tweetSubscriber =
    authors.to(Sink.fromSubscriber(storage)).runWith(Source.asSubscriber(), mat);

rs.tweets().subscribe(tweetSubscriber);
```

### Example 61: Integrating with Reactive Streams

```scala
// An example Processor factory
def createProcessor: Processor[Int, Int] = Flow[Int].toProcessor.run()

val flow: Flow[Int, Int, NotUsed] = Flow.fromProcessor(() => createProcessor)
```

### Example 62: Integrating with Reactive Streams

```java
// An example Processor factory
final Creator<Processor<Integer, Integer>> factory =
    new Creator<Processor<Integer, Integer>>() {
      public Processor<Integer, Integer> create() {
        return Flow.of(Integer.class).toProcessor().run(mat);
      }
    };

final Flow<Integer, Integer, NotUsed> flow = Flow.fromProcessor(factory);
```

### Example 63: ActorPublisher

```scala
object JobManager {
  def props: Props = Props[JobManager]

  final case class Job(payload: String)
  case object JobAccepted
  case object JobDenied
}

class JobManager extends ActorPublisher[JobManager.Job] {
  import akka.stream.actor.ActorPublisherMessage._
  import JobManager._

  val MaxBufferSize = 100
  var buf = Vector.empty[Job]

  def receive = {
    case job: Job if buf.size == MaxBufferSize =>
      sender() ! JobDenied
    case job: Job =>
      sender() ! JobAccepted
      if (buf.isEmpty && totalDemand > 0)
        onNext(job)
      else {
        buf :+= job
        deliverBuf()
      }
    case Request(_) =>
      deliverBuf()
    case Cancel =>
      context.stop(self)
  }

  @tailrec final def deliverBuf(): Unit =
    if (totalDemand > 0) {
      /*
       * totalDemand is a Long and could be larger than
       * what buf.splitAt can accept
       */
      if (totalDemand <= Int.MaxValue) {
        val (use, keep) = buf.splitAt(totalDemand.toInt)
        buf = keep
        use.foreach(onNext)
      } else {
        val (use, keep) = buf.splitAt(Int.MaxValue)
        buf = keep
        use.foreach(onNext)
        deliverBuf()
      }
    }
}
```

### Example 64: ActorPublisher

```java
public static class JobManagerProtocol {
  public static final class Job {
    public final String payload;

    public Job(String payload) {
      this.payload = payload;
    }
  }

  public static class JobAcceptedMessage {
    @Override
    public String toString() {
      return "JobAccepted";
    }
  }

  public static final JobAcceptedMessage JobAccepted = new JobAcceptedMessage();

  public static class JobDeniedMessage {
    @Override
    public String toString() {
      return "JobDenied";
    }
  }

  public static final JobDeniedMessage JobDenied = new JobDeniedMessage();
}

public static class JobManager extends AbstractActorPublisher<JobManagerProtocol.Job> {

  public static Props props() {
    return Props.create(JobManager.class);
  }

  private final int MAX_BUFFER_SIZE = 100;
  private final List<JobManagerProtocol.Job> buf = new ArrayList<>();

  @Override
  public Receive createReceive() {
    return receiveBuilder()
        .match(
            JobManagerProtocol.Job.class,
            job -> buf.size() == MAX_BUFFER_SIZE,
            job -> {
              getSender().tell(JobManagerProtocol.JobDenied, getSelf());
            })
        .match(
            JobManagerProtocol.Job.class,
            job -> {
              getSender().tell(JobManagerProtocol.JobAccepted, getSelf());

              if (buf.isEmpty() && totalDemand() > 0) onNext(job);
              else {
                buf.add(job);
                deliverBuf();
              }
            })
        .match(ActorPublisherMessage.Request.class, request -> deliverBuf())
        .match(ActorPublisherMessage.Cancel.class, cancel -> getContext().stop(getSelf()))
        .build();
  }

  void deliverBuf() {
    while (totalDemand() > 0) {
      /*
       * totalDemand is a Long and could be larger than
       * what buf.splitAt can accept
       */
      if (totalDemand() <= Integer.MAX_VALUE) {
        final List<JobManagerProtocol.Job> took =
            buf.subList(0, Math.min(buf.size(), (int) totalDemand()));
        took.forEach(this::onNext);
        buf.removeAll(took);
        break;
      } else {
        final List<JobManagerProtocol.Job> took =
            buf.subList(0, Math.min(buf.size(), Integer.MAX_VALUE));
        took.forEach(this::onNext);
        buf.removeAll(took);
      }
    }
  }
}
```

### Example 65: ActorPublisher

```scala
val jobManagerSource = Source.actorPublisher[JobManager.Job](JobManager.props)
val ref = Flow[JobManager.Job]
  .map(_.payload.toUpperCase)
  .map { elem =>
    println(elem); elem
  }
  .to(Sink.ignore)
  .runWith(jobManagerSource)

ref ! JobManager.Job("a")
ref ! JobManager.Job("b")
ref ! JobManager.Job("c")
```

### Example 66: ActorPublisher

```java
final Source<JobManagerProtocol.Job, ActorRef> jobManagerSource =
    Source.actorPublisher(JobManager.props());

final ActorRef ref =
    jobManagerSource
        .map(job -> job.payload.toUpperCase())
        .map(
            elem -> {
              System.out.println(elem);
              return elem;
            })
        .to(Sink.ignore())
        .run(mat);

ref.tell(new JobManagerProtocol.Job("a"), ActorRef.noSender());
ref.tell(new JobManagerProtocol.Job("b"), ActorRef.noSender());
ref.tell(new JobManagerProtocol.Job("c"), ActorRef.noSender());
```

### Example 67: ActorSubscriber

```scala
object WorkerPool {
  case class Msg(id: Int, replyTo: ActorRef)
  case class Work(id: Int)
  case class Reply(id: Int)
  case class Done(id: Int)

  def props: Props = Props(new WorkerPool)
}

class WorkerPool extends ActorSubscriber {
  import WorkerPool._
  import ActorSubscriberMessage._

  val MaxQueueSize = 10
  var queue = Map.empty[Int, ActorRef]

  val router = {
    val routees = Vector.fill(3) {
      ActorRefRoutee(context.actorOf(Props[Worker]))
    }
    Router(RoundRobinRoutingLogic(), routees)
  }

  override val requestStrategy = new MaxInFlightRequestStrategy(max = MaxQueueSize) {
    override def inFlightInternally: Int = queue.size
  }

  def receive = {
    case OnNext(Msg(id, replyTo)) =>
      queue += (id -> replyTo)
      assert(queue.size <= MaxQueueSize, s"queued too many: ${queue.size}")
      router.route(Work(id), self)
    case Reply(id) =>
      queue(id) ! Done(id)
      queue -= id
      if (canceled && queue.isEmpty) {
        context.stop(self)
      }
    case OnComplete =>
      if (queue.isEmpty) {
        context.stop(self)
      }
  }
}

class Worker extends Actor {
  import WorkerPool._
  def receive = {
    case Work(id) =>
      // ...
      sender() ! Reply(id)
  }
}
```

### Example 68: ActorSubscriber

```java
public static class WorkerPoolProtocol {

  public static class Msg {
    public final int id;
    public final ActorRef replyTo;

    public Msg(int id, ActorRef replyTo) {
      this.id = id;
      this.replyTo = replyTo;
    }

    @Override
    public String toString() {
      return String.format("Msg(%s, %s)", id, replyTo);
    }
  }

  public static Msg msg(int id, ActorRef replyTo) {
    return new Msg(id, replyTo);
  }

  public static class Work {
    public final int id;

    public Work(int id) {
      this.id = id;
    }

    @Override
    public String toString() {
      return String.format("Work(%s)", id);
    }
  }

  public static Work work(int id) {
    return new Work(id);
  }

  public static class Reply {
    public final int id;

    public Reply(int id) {
      this.id = id;
    }

    @Override
    public String toString() {
      return String.format("Reply(%s)", id);
    }
  }

  public static Reply reply(int id) {
    return new Reply(id);
  }

  public static class Done {
    public final int id;

    public Done(int id) {
      this.id = id;
    }

    @Override
    public String toString() {
      return String.format("Done(%s)", id);
    }

    @Override
    public boolean equals(Object o) {
      if (this == o) {
        return true;
      }
      if (o == null || getClass() != o.getClass()) {
        return false;
      }

      Done done = (Done) o;

      if (id != done.id) {
        return false;
      }

      return true;
    }

    @Override
    public int hashCode() {
      return id;
    }
  }

  public static Done done(int id) {
    return new Done(id);
  }
}

public static class WorkerPool extends AbstractActorSubscriber {

  public static Props props() {
    return Props.create(WorkerPool.class);
  }

  final int MAX_QUEUE_SIZE = 10;
  final Map<Integer, ActorRef> queue = new HashMap<>();

  final Router router;

  @Override
  public RequestStrategy requestStrategy() {
    return new MaxInFlightRequestStrategy(MAX_QUEUE_SIZE) {
      @Override
      public int inFlightInternally() {
        return queue.size();
      }
    };
  }

  public WorkerPool() {
    final List<Routee> routees = new ArrayList<>();
    for (int i = 0; i < 3; i++)
      routees.add(new ActorRefRoutee(getContext().actorOf(Props.create(Worker.class))));
    router = new Router(new RoundRobinRoutingLogic(), routees);
  }

  @Override
  public Receive createReceive() {
    return receiveBuilder()
        .match(
            ActorSubscriberMessage.OnNext.class,
            on -> on.element() instanceof WorkerPoolProtocol.Msg,
            onNext -> {
              WorkerPoolProtocol.Msg msg = (WorkerPoolProtocol.Msg) onNext.element();
              queue.put(msg.id, msg.replyTo);

              if (queue.size() > MAX_QUEUE_SIZE)
                throw new RuntimeException("queued too many: " + queue.size());

              router.route(WorkerPoolProtocol.work(msg.id), getSelf());
            })
        .match(
            ActorSubscriberMessage.onCompleteInstance().getClass(),
            complete -> {
              if (queue.isEmpty()) {
                getContext().stop(getSelf());
              }
            })
        .match(
            WorkerPoolProtocol.Reply.class,
            reply -> {
              int id = reply.id;
              queue.get(id).tell(WorkerPoolProtocol.done(id), getSelf());
              queue.remove(id);
              if (canceled() && queue.isEmpty()) {
                getContext().stop(getSelf());
              }
            })
        .build();
  }
}

static class Worker extends AbstractActor {
  @Override
  public Receive createReceive() {
    return receiveBuilder()
        .match(
            WorkerPoolProtocol.Work.class,
            work -> {
              // ...
              getSender().tell(WorkerPoolProtocol.reply(work.id), getSelf());
            })
        .build();
  }
}
```

### Example 69: ActorSubscriber

```scala
val N = 117
val worker = Source(1 to N).map(WorkerPool.Msg(_, replyTo)).runWith(Sink.actorSubscriber(WorkerPool.props))
```

### Example 70: ActorSubscriber

```java
final int N = 117;
final List<Integer> data = new ArrayList<>(N);
for (int i = 0; i < N; i++) {
  data.add(i);
}

final ActorRef worker =
    Source.from(data)
        .map(i -> WorkerPoolProtocol.msg(i, replyTo))
        .runWith(Sink.<WorkerPoolProtocol.Msg>actorSubscriber(WorkerPool.props()), mat);
```

## Related Pages (Internal Links)

- https://doc.akka.io/libraries/akka-core/2.5/routing.html
- https://doc.akka.io/libraries/akka-core/2.5/stream/operators/ActorFlow/ask.html
- https://doc.akka.io/libraries/akka-core/2.5/stream/operators/Sink/actorRefWithAck.html
- https://doc.akka.io/libraries/akka-core/2.5/stream/operators/Source-or-Flow/ask.html
- https://doc.akka.io/libraries/akka-core/2.5/stream/operators/Source-or-Flow/throttle.html
- https://doc.akka.io/libraries/akka-core/2.5/stream/stream-customize.html
- https://doc.akka.io/libraries/akka-core/2.5/stream/stream-error.html

---
*Source: [https://doc.akka.io/libraries/akka-core/2.5/stream/stream-integrations.html](https://doc.akka.io/libraries/akka-core/2.5/stream/stream-integrations.html)*