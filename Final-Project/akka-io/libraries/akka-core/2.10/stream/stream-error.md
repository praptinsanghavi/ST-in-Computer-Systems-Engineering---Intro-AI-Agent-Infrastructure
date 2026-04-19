---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:46:35Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/stream-error.html
title: Error Handling in Streams • Akka core
---

# Error Handling in Streams • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Error Handling in Streams

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

## Introduction

When an operator in a stream fails this will normally lead to the entire stream being torn down. Each of the operators downstream gets informed about the failure and each upstream operator sees a cancellation.

In many cases you may want to avoid complete stream failure, this can be done in a few different ways:

- [`recover`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html#recover(java.lang.Class,java.util.function.Supplier) "akka.stream.javadsl.Source")[`recover`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html#recover[T>:Out](pf:PartialFunction[Throwable,T]):FlowOps.this.Repr[T] "akka.stream.scaladsl.Source") to emit a final element then complete the stream normally on upstream failure
- [`recoverWithRetries`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html#recoverWithRetries(int,java.lang.Class,java.util.function.Supplier) "akka.stream.javadsl.Source")[`recoverWithRetries`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html#recoverWithRetries[T>:Out](attempts:Int,pf:PartialFunction[Throwable,akka.stream.Graph[akka.stream.SourceShape[T],akka.NotUsed]]):FlowOps.this.Repr[T] "akka.stream.scaladsl.Source") to create a new upstream and start consuming from that on failure
- Restarting sections of the stream after a backoff
- Using a supervision strategy for operators that support it

In addition to these built in tools for error handling, a common pattern is to wrap the stream inside an actor, and have the actor restart the entire stream on failure.

## Logging errors

[`log()`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html#log(java.lang.String,akka.japi.function.Function) "akka.stream.javadsl.Source")[`log()`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html#log(name:String,extract:Out=%3EAny)(implicitlog:akka.event.LoggingAdapter):FlowOps.this.Repr[Out] "akka.stream.scaladsl.Source") enables logging of a stream, which is typically useful for error logging. The below stream fails with [`ArithmeticException`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/ArithmeticException.html "java.lang.ArithmeticException") when the element `0` goes through the [`map`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html#map(akka.japi.function.Function) "akka.stream.javadsl.Source")[`map`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html#map[T](f:Out=%3ET):FlowOps.this.Repr[T] "akka.stream.scaladsl.Source") operator, 

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/cookbook/RecipeLoggingElements.scala#L61-L64 "Go to snippet source")Source(-5 to 5)
  .map(1 / _) //throwing ArithmeticException: / by zero
  .log("error logging")
  .runWith(Sink.ignore)
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/javadsl/cookbook/RecipeLoggingElements.java#L106-L109 "Go to snippet source")Source.from(Arrays.asList(-1, 0, 1))
    .map(x -> 1 / x) // throwing ArithmeticException: / by zero
    .log("error logging")
    .runWith(Sink.ignore(), system);
```

and error messages like below will be logged. 

```
[error logging] Upstream failed.
java.lang.ArithmeticException: / by zero

```

If you want to control logging levels on each element, completion, and failure, you can find more details in [Logging in streams](stream-cookbook.html#logging-in-streams).

## Recover

[`recover`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html#recover(java.lang.Class,java.util.function.Supplier) "akka.stream.javadsl.Source")[`recover`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html#recover[T>:Out](pf:PartialFunction[Throwable,T]):FlowOps.this.Repr[T] "akka.stream.scaladsl.Source") allows you to emit a final element and then complete the stream on an upstream failure. Deciding which exceptions should be recovered is done through a [`PartialFunction`](http://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html "scala.PartialFunction"). If an exception does not have a matching case match defined the stream is failed. 

Recovering can be useful if you want to gracefully complete a stream on failure while letting downstream know that there was a failure.

Throwing an exception inside `recover` *will* be logged on ERROR level automatically.

More details in [recover](operators/Source-or-Flow/recover.html#recover)

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/FlowErrorDocSpec.scala#L93-L102 "Go to snippet source")Source(0 to 6)
  .map(
    n =>
      // assuming `4` and `5` are unexpected values that could throw exception
      if (List(4, 5).contains(n)) throw new RuntimeException(s"Boom! Bad value found: $n")
      else n.toString)
  .recover {
    case e: RuntimeException => e.getMessage
  }
  .runForeach(println)
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/FlowErrorDocTest.java#L140-L152 "Go to snippet source")Source.from(Arrays.asList(0, 1, 2, 3, 4, 5, 6))
    .map(
        n -> {
          // assuming `4` and `5` are unexpected values that could throw exception
          if (Arrays.asList(4, 5).contains(n))
            throw new RuntimeException(String.format("Boom! Bad value found: %s", n));
          else return n.toString();
        })
    .recover(
        new PFBuilder<Throwable, String>()
            .match(RuntimeException.class, Throwable::getMessage)
            .build())
    .runForeach(System.out::println, system);
```

This will output:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/FlowErrorDocSpec.scala#L108-L112 "Go to snippet source")0
1
2
3                         // last element before failure
Boom! Bad value found: 4  // first element on failure
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/FlowErrorDocTest.java#L158-L162 "Go to snippet source")0
1
2
3                         // last element before failure
Boom! Bad value found: 4  // first element on failure
```

## Recover with retries

[`recoverWithRetries`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html#recoverWithRetries(int,java.lang.Class,java.util.function.Supplier) "akka.stream.javadsl.Source")[`recoverWithRetries`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html#recoverWithRetries[T>:Out](attempts:Int,pf:PartialFunction[Throwable,akka.stream.Graph[akka.stream.SourceShape[T],akka.NotUsed]]):FlowOps.this.Repr[T] "akka.stream.scaladsl.Source") allows you to put a new upstream in place of the failed one, recovering stream failures up to a specified maximum number of times. 

Deciding which exceptions should be recovered is done through a [`PartialFunction`](http://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html "scala.PartialFunction"). If an exception does not have a matching case match defined the stream is failed.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/FlowErrorDocSpec.scala#L119-L128 "Go to snippet source")val planB = Source(List("five", "six", "seven", "eight"))

Source(0 to 10)
  .map(n =>
    if (n < 5) n.toString
    else throw new RuntimeException("Boom!"))
  .recoverWithRetries(attempts = 1, {
    case _: RuntimeException => planB
  })
  .runForeach(println)
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/FlowErrorDocTest.java#L170-L183 "Go to snippet source")Source<String, NotUsed> planB = Source.from(Arrays.asList("five", "six", "seven", "eight"));

Source.from(Arrays.asList(0, 1, 2, 3, 4, 5, 6))
    .map(
        n -> {
          if (n < 5) return n.toString();
          else throw new RuntimeException("Boom!");
        })
    .recoverWithRetries(
        1, // max attempts
        new PFBuilder<Throwable, Source<String, NotUsed>>()
            .match(RuntimeException.class, ex -> planB)
            .build())
    .runForeach(System.out::println, system);
```

This will output:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/FlowErrorDocSpec.scala#L134-L142 "Go to snippet source")0
1
2
3
4
five
six
seven
eight
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/FlowErrorDocTest.java#L189-L197 "Go to snippet source")0
1
2
3
4
five
six
seven
eight
```

## Delayed restarts with a backoff operator

Akka streams provides a [`RestartSource`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/RestartSource.html "akka.stream.javadsl.RestartSource")[`RestartSource`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/RestartSource$.html "akka.stream.scaladsl.RestartSource"), [`RestartSink`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/RestartSink.html "akka.stream.javadsl.RestartSink")[`RestartSink`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/RestartSink$.html "akka.stream.scaladsl.RestartSink") and [`RestartFlow`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/RestartFlow.html "akka.stream.javadsl.RestartFlow")[`RestartFlow`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/RestartFlow$.html "akka.stream.scaladsl.RestartFlow") for implementing the so\-called *exponential backoff supervision strategy*, starting an operator again when it fails or completes, each time with a growing time delay between restarts.

This pattern is useful when the operator fails or completes because some external resource is not available and we need to give it some time to start\-up again. One of the prime examples when this is useful is when a WebSocket connection fails due to the HTTP server it’s running on going down, perhaps because it is overloaded. By using an exponential backoff, we avoid going into a tight reconnect loop, which both gives the HTTP server some time to recover, and it avoids using needless resources on the client side.

The various restart shapes mentioned all expect an [`RestartSettings`](https://doc.akka.io/api/akka-core/2.10/akka/stream/RestartSettings.html "akka.stream.RestartSettings")[`RestartSettings`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/RestartSettings.html "akka.stream.RestartSettings") which configures the restart behaviour. Configurable parameters are:

- `minBackoff` is the initial duration until the underlying stream is restarted
- `maxBackoff` caps the exponential backoff
- `randomFactor` allows addition of a random delay following backoff calculation
- `maxRestarts` caps the total number of restarts
- `maxRestartsWithin` sets a timeframe during which restarts are counted towards the same total for `maxRestarts`

The following snippet shows how to create a backoff supervisor using [`RestartSource`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/RestartSource.html "akka.stream.javadsl.RestartSource")[`RestartSource`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/RestartSource$.html "akka.stream.scaladsl.RestartSource") which will supervise the given [`Source`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html "akka.stream.javadsl.Source")[`Source`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html "akka.stream.scaladsl.Source"). The `Source` in this case is a stream of Server Sent Events, produced by akka\-http. If the stream fails or completes at any point, the request will be made again, in increasing intervals of 3, 6, 12, 24 and finally 30 seconds (at which point it will remain capped due to the `maxBackoff` parameter):

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/RestartDocSpec.scala#L39-L54 "Go to snippet source")val settings = RestartSettings(
  minBackoff = 3.seconds,
  maxBackoff = 30.seconds,
  randomFactor = 0.2 // adds 20% "noise" to vary the intervals slightly
).withMaxRestarts(20, 5.minutes) // limits the amount of restarts to 20 within 5 minutes

val restartSource = RestartSource.withBackoff(settings) { () =>
  // Create a source from a future of a source
  Source.futureSource {
    // Make a single request with akka-http
    Http()
      .singleRequest(HttpRequest(uri = "http://example.com/eventstream"))
      // Unmarshall it as a source of server sent events
      .flatMap(Unmarshal(_).to[Source[ServerSentEvent, NotUsed]])
  }
}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/RestartDocTest.java#L64-L86 "Go to snippet source")RestartSettings settings =
    RestartSettings.create(
            Duration.ofSeconds(3), // min backoff
            Duration.ofSeconds(30), // max backoff
            0.2 // adds 20% "noise" to vary the intervals slightly
            )
        .withMaxRestarts(
            20, Duration.ofMinutes(5)); // limits the amount of restarts to 20 within 5 minutes

Source<ServerSentEvent, NotUsed> eventStream =
    RestartSource.withBackoff(
        settings,
        () ->
            // Create a source from a future of a source
            Source.completionStageSource(
                // Issue a GET request on the event stream
                Http.get(system)
                    .singleRequest(HttpRequest.create("http://example.com/eventstream"))
                    .thenCompose(
                        response ->
                            // Unmarshall it to a stream of ServerSentEvents
                            EventStreamUnmarshalling.fromEventStream()
                                .unmarshall(response, materializer))));
```

Using a `randomFactor` to add a little bit of additional variance to the backoff intervals is highly recommended, in order to avoid multiple streams re\-start at the exact same point in time, for example because they were stopped due to a shared resource such as the same server going down and re\-starting after the same configured interval. By adding additional randomness to the re\-start intervals the streams will start in slightly different points in time, thus avoiding large spikes of traffic hitting the recovering server or other resource that they all need to contact.

The above `RestartSource` will never terminate unless the [`Sink`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Sink.html "akka.stream.javadsl.Sink")[`Sink`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Sink.html "akka.stream.scaladsl.Sink") it’s fed into cancels. It will often be handy to use it in combination with a [`KillSwitch`](stream-dynamic.html#kill-switch), so that you can terminate it when needed:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/RestartDocSpec.scala#L58-L65 "Go to snippet source")val killSwitch = restartSource
  .viaMat(KillSwitches.single)(Keep.right)
  .toMat(Sink.foreach(event => println(s"Got event: $event")))(Keep.left)
  .run()

doSomethingElse()

killSwitch.shutdown()
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/RestartDocTest.java#L90-L98 "Go to snippet source")KillSwitch killSwitch =
    eventStream
        .viaMat(KillSwitches.single(), Keep.right())
        .toMat(Sink.foreach(event -> System.out.println("Got event: " + event)), Keep.left())
        .run(materializer);

doSomethingElse();

killSwitch.shutdown();
```

Sinks and flows can also be supervised, using [`RestartSink`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/RestartSink.html "akka.stream.javadsl.RestartSink")[`RestartSink`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/RestartSink$.html "akka.stream.scaladsl.RestartSink") and [`RestartFlow`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/RestartFlow.html "akka.stream.javadsl.RestartFlow")[`RestartFlow`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/RestartFlow$.html "akka.stream.scaladsl.RestartFlow"). The `RestartSink` is restarted when it cancels, while the `RestartFlow` is restarted when either the in port cancels, the out port completes, or the out port sends an error.

Note
Care should be taken when using [`GraphStage`s](stream-customize.html) that conditionally propagate termination signals inside a [`RestartSource`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/RestartSource.html "akka.stream.javadsl.RestartSource")[`RestartSource`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/RestartSource$.html "akka.stream.scaladsl.RestartSource"), [`RestartSink`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/RestartSink.html "akka.stream.javadsl.RestartSink")[`RestartSink`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/RestartSink$.html "akka.stream.scaladsl.RestartSink") or [`RestartFlow`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/RestartFlow.html "akka.stream.javadsl.RestartFlow")[`RestartFlow`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/RestartFlow$.html "akka.stream.scaladsl.RestartFlow"). 

An example is a [`Broadcast`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Broadcast.html "akka.stream.scaladsl.Broadcast") operator with the default `eagerCancel = false` where some of the outlets are for side\-effecting branches (that do not re\-join e.g. via a `Merge`). A failure on a side branch will not terminate the supervised stream which will not be restarted. Conversely, a failure on the main branch can trigger a restart but leave behind old running instances of side branches.

In this example `eagerCancel` should probably be set to `true`, or, when only a single side branch is used, [`alsoTo`](operators/Source-or-Flow/alsoTo.html) or [`divertTo`](operators/Source-or-Flow/divertTo.html) should be considered as alternatives.

## Supervision Strategies

Note
The operators that support supervision strategies are explicitly documented to do so, if there is nothing in the documentation of an operator saying that it adheres to the supervision strategy it means it fails rather than applies supervision.

The error handling strategies are inspired by actor supervision strategies, but the semantics have been adapted to the domain of stream processing. The most important difference is that supervision is not automatically applied to stream operators but instead something that each operator has to implement explicitly. 

For many operators it may not even make sense to implement support for supervision strategies, this is especially true for operators connecting to external technologies where for example a failed connection will likely still fail if a new connection is tried immediately (see [Restart with back off](stream-error.html#restart-with-backoff) for such scenarios). 

For operators that do implement supervision, the strategies for how to handle exceptions from processing stream elements can be selected when materializing the stream through use of an attribute. 

There are three ways to handle exceptions from application code:

- [`Stop`](https://doc.akka.io/api/akka-core/2.10/akka/stream/Supervision$$Stop$.html "akka.stream.Supervision$$Stop")[`Supervision.stop()`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/Supervision.html#stop() "akka.stream.Supervision") \- The stream is completed with failure.
- [`Resume`](https://doc.akka.io/api/akka-core/2.10/akka/stream/Supervision$$Resume$.html "akka.stream.Supervision$$Resume")[`Supervision.resume()`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/Supervision.html#resume() "akka.stream.Supervision") \- The element is dropped and the stream continues.
- [`Restart`](https://doc.akka.io/api/akka-core/2.10/akka/stream/Supervision$$Restart$.html "akka.stream.Supervision$$Restart")[`Supervision.restart()`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/Supervision.html#restart() "akka.stream.Supervision") \- The element is dropped and the stream continues after restarting the operator. Restarting an operator means that any accumulated state is cleared. This is typically performed by creating a new instance of the operator.

By default the stopping strategy is used for all exceptions, i.e. the stream will be completed with failure when an exception is thrown.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/FlowErrorDocSpec.scala#L18-L21 "Go to snippet source")val source = Source(0 to 5).map(100 / _)
val result = source.runWith(Sink.fold(0)(_ + _))
// division by zero will fail the stream and the
// result here will be a Future completed with Failure(ArithmeticException)
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/FlowErrorDocTest.java#L45-L51 "Go to snippet source")final Source<Integer, NotUsed> source =
    Source.from(Arrays.asList(0, 1, 2, 3, 4, 5)).map(elem -> 100 / elem);
final Sink<Integer, CompletionStage<Integer>> fold =
    Sink.<Integer, Integer>fold(0, (acc, elem) -> acc + elem);
final CompletionStage<Integer> result = source.runWith(fold, system);
// division by zero will fail the stream and the
// result here will be a CompletionStage failed with ArithmeticException
```

The default supervision strategy for a stream can be defined on the complete [`RunnableGraph`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/RunnableGraph.html "akka.stream.javadsl.RunnableGraph")[`RunnableGraph`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/RunnableGraph.html "akka.stream.scaladsl.RunnableGraph").

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/FlowErrorDocSpec.scala#L31-L43 "Go to snippet source")val decider: Supervision.Decider = {
  case _: ArithmeticException => Supervision.Resume
  case _                      => Supervision.Stop
}
val source = Source(0 to 5).map(100 / _)
val runnableGraph =
  source.toMat(Sink.fold(0)(_ + _))(Keep.right)

val withCustomSupervision = runnableGraph.withAttributes(ActorAttributes.supervisionStrategy(decider))

val result = withCustomSupervision.run()
// the element causing division by zero will be dropped
// result here will be a Future completed with Success(228)
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/FlowErrorDocTest.java#L60-L78 "Go to snippet source")final Function<Throwable, Supervision.Directive> decider =
    exc -> {
      if (exc instanceof ArithmeticException) return Supervision.resume();
      else return Supervision.stop();
    };
final Source<Integer, NotUsed> source =
    Source.from(Arrays.asList(0, 1, 2, 3, 4, 5))
        .map(elem -> 100 / elem)
        .withAttributes(ActorAttributes.withSupervisionStrategy(decider));
final Sink<Integer, CompletionStage<Integer>> fold = Sink.fold(0, (acc, elem) -> acc + elem);

final RunnableGraph<CompletionStage<Integer>> runnableGraph = source.toMat(fold, Keep.right());

final RunnableGraph<CompletionStage<Integer>> withCustomSupervision =
    runnableGraph.withAttributes(ActorAttributes.withSupervisionStrategy(decider));

final CompletionStage<Integer> result = withCustomSupervision.run(system);
// the element causing division by zero will be dropped
// result here will be a CompletionStage completed with 228
```

Here you can see that all [`ArithmeticException`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/ArithmeticException.html "java.lang.ArithmeticException") will resume the processing, i.e. the elements that cause the division by zero are effectively dropped.

Note
Be aware that dropping elements may result in deadlocks in graphs with cycles, as explained in [Graph cycles, liveness and deadlocks](stream-graphs.html#graph-cycles).

The supervision strategy can also be defined for all operators of a flow.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/FlowErrorDocSpec.scala#L51-L63 "Go to snippet source")val decider: Supervision.Decider = {
  case _: ArithmeticException => Supervision.Resume
  case _                      => Supervision.Stop
}
val flow = Flow[Int]
  .filter(100 / _ < 50)
  .map(elem => 100 / (5 - elem))
  .withAttributes(ActorAttributes.supervisionStrategy(decider))
val source = Source(0 to 5).via(flow)

val result = source.runWith(Sink.fold(0)(_ + _))
// the elements causing division by zero will be dropped
// result here will be a Future completed with Success(150)
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/FlowErrorDocTest.java#L87-L102 "Go to snippet source")final Function<Throwable, Supervision.Directive> decider =
    exc -> {
      if (exc instanceof ArithmeticException) return Supervision.resume();
      else return Supervision.stop();
    };
final Flow<Integer, Integer, NotUsed> flow =
    Flow.of(Integer.class)
        .filter(elem -> 100 / elem < 50)
        .map(elem -> 100 / (5 - elem))
        .withAttributes(ActorAttributes.withSupervisionStrategy(decider));
final Source<Integer, NotUsed> source = Source.from(Arrays.asList(0, 1, 2, 3, 4, 5)).via(flow);
final Sink<Integer, CompletionStage<Integer>> fold =
    Sink.<Integer, Integer>fold(0, (acc, elem) -> acc + elem);
final CompletionStage<Integer> result = source.runWith(fold, system);
// the elements causing division by zero will be dropped
// result here will be a Future completed with 150
```

[`Restart`](https://doc.akka.io/api/akka-core/2.10/akka/stream/Supervision$$Restart$.html "akka.stream.Supervision$$Restart")[`Supervision.restart()`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/Supervision.html#restart() "akka.stream.Supervision") works in a similar way as [`Resume`](https://doc.akka.io/api/akka-core/2.10/akka/stream/Supervision$$Resume$.html "akka.stream.Supervision$$Resume")[`Supervision.resume()`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/Supervision.html#resume() "akka.stream.Supervision") with the addition that accumulated state, if any, of the failing processing operator will be reset.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/FlowErrorDocSpec.scala#L71-L85 "Go to snippet source")val decider: Supervision.Decider = {
  case _: IllegalArgumentException => Supervision.Restart
  case _                           => Supervision.Stop
}
val flow = Flow[Int]
  .scan(0) { (acc, elem) =>
    if (elem < 0) throw new IllegalArgumentException("negative not allowed")
    else acc + elem
  }
  .withAttributes(ActorAttributes.supervisionStrategy(decider))
val source = Source(List(1, 3, -1, 5, 7)).via(flow)
val result = source.limit(1000).runWith(Sink.seq)
// the negative element cause the scan stage to be restarted,
// i.e. start from 0 again
// result here will be a Future completed with Success(Vector(0, 1, 4, 0, 5, 12))
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/FlowErrorDocTest.java#L111-L130 "Go to snippet source")final Function<Throwable, Supervision.Directive> decider =
    exc -> {
      if (exc instanceof IllegalArgumentException) return Supervision.restart();
      else return Supervision.stop();
    };
final Flow<Integer, Integer, NotUsed> flow =
    Flow.of(Integer.class)
        .scan(
            0,
            (acc, elem) -> {
              if (elem < 0) throw new IllegalArgumentException("negative not allowed");
              else return acc + elem;
            })
        .withAttributes(ActorAttributes.withSupervisionStrategy(decider));
final Source<Integer, NotUsed> source = Source.from(Arrays.asList(1, 3, -1, 5, 7)).via(flow);
final CompletionStage<List<Integer>> result =
    source.grouped(1000).runWith(Sink.<List<Integer>>head(), system);
// the negative element cause the scan stage to be restarted,
// i.e. start from 0 again
// result here will be a Future completed with List(0, 1, 4, 0, 5, 12)
```

### Errors from mapAsync

Stream supervision can also be applied to the futures of [`mapAsync`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html#mapAsync(int,akka.japi.function.Function) "akka.stream.javadsl.Source")[`mapAsync`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html#mapAsync[T](parallelism:Int)(f:Out=%3Escala.concurrent.Future[T]):FlowOps.this.Repr[T] "akka.stream.scaladsl.Source") and [`mapAsyncUnordered`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html#mapAsyncUnordered(int,akka.japi.function.Function) "akka.stream.javadsl.Source")[`mapAsyncUnordered`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html#mapAsyncUnordered[T](parallelism:Int)(f:Out=%3Escala.concurrent.Future[T]):FlowOps.this.Repr[T] "akka.stream.scaladsl.Source") even if such failures happen in the future rather than inside the operator itself.

Let’s say that we use an external service to lookup email addresses and we would like to discard those that cannot be found.

We start with the tweet stream of authors:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/IntegrationDocSpec.scala#L162-L163 "Go to snippet source")val authors: Source[Author, NotUsed] =
  tweets.filter(_.hashtags.contains(akkaTag)).map(_.author)
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/IntegrationDocTest.java#L436-L438 "Go to snippet source")final Source<Author, NotUsed> authors =
    tweets.filter(t -> t.hashtags().contains(AKKA)).map(t -> t.author);

```

Assume that we can lookup their email address using:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/IntegrationDocSpec.scala#L58 "Go to snippet source")def lookupEmail(handle: String): Future[String] =
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/IntegrationDocTest.java#L91 "Go to snippet source")public CompletionStage<String> lookupEmail(String handle)
```

The [`Future`](http://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html "scala.concurrent.Future") [`CompletionStage`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html "java.util.concurrent.CompletionStage") is completed with `Failure` normally if the email is not found.

Transforming the stream of authors to a stream of email addresses by using the `lookupEmail` service can be done with [`mapAsync`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html#mapAsync(int,akka.japi.function.Function) "akka.stream.javadsl.Source")[`mapAsync`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html#mapAsync[T](parallelism:Int)(f:Out=%3Escala.concurrent.Future[T]):FlowOps.this.Repr[T] "akka.stream.scaladsl.Source") and we use [`Supervision.resumingDecider`](https://doc.akka.io/api/akka-core/2.10/akka/stream/Supervision$.html#resumingDecider:akka.stream.Supervision.Deciderwithakka.japi.function.Function[Throwable,akka.stream.Supervision.Directive] "akka.stream.Supervision") [`Supervision.getResumingDecider()`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/Supervision.html#getResumingDecider() "akka.stream.Supervision") to drop unknown email addresses:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/IntegrationDocSpec.scala#L262-L269 "Go to snippet source")import ActorAttributes.supervisionStrategy
import Supervision.resumingDecider

val emailAddresses: Source[String, NotUsed] =
  authors.via(
    Flow[Author]
      .mapAsync(4)(author => addressSystem.lookupEmail(author.handle))
      .withAttributes(supervisionStrategy(resumingDecider)))
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/IntegrationDocTest.java#L482-L489 "Go to snippet source")final Attributes resumeAttrib =
    ActorAttributes.withSupervisionStrategy(Supervision.getResumingDecider());
final Flow<Author, String, NotUsed> lookupEmail =
    Flow.of(Author.class)
        .mapAsync(4, author -> addressSystem.lookupEmail(author.handle))
        .withAttributes(resumeAttrib);
final Source<String, NotUsed> emailAddresses = authors.via(lookupEmail);

```

If we would not use [`Resume`](https://doc.akka.io/api/akka-core/2.10/akka/stream/Supervision$$Resume$.html "akka.stream.Supervision$$Resume")[`Supervision.resume()`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/Supervision.html#resume() "akka.stream.Supervision") the default stopping strategy would complete the stream with failure on the first `Future` `CompletionStage` that was completed with `Failure`exceptionally.

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

### Example 4: Logging errors

```scala
Source(-5 to 5)
  .map(1 / _) //throwing ArithmeticException: / by zero
  .log("error logging")
  .runWith(Sink.ignore)
```

### Example 5: Logging errors

```java
Source.from(Arrays.asList(-1, 0, 1))
    .map(x -> 1 / x) // throwing ArithmeticException: / by zero
    .log("error logging")
    .runWith(Sink.ignore(), system);
```

### Example 6: Logging errors

```text
[error logging] Upstream failed.
java.lang.ArithmeticException: / by zero
```

### Example 7: Recover

```scala
Source(0 to 6)
  .map(
    n =>
      // assuming `4` and `5` are unexpected values that could throw exception
      if (List(4, 5).contains(n)) throw new RuntimeException(s"Boom! Bad value found: $n")
      else n.toString)
  .recover {
    case e: RuntimeException => e.getMessage
  }
  .runForeach(println)
```

### Example 8: Recover

```java
Source.from(Arrays.asList(0, 1, 2, 3, 4, 5, 6))
    .map(
        n -> {
          // assuming `4` and `5` are unexpected values that could throw exception
          if (Arrays.asList(4, 5).contains(n))
            throw new RuntimeException(String.format("Boom! Bad value found: %s", n));
          else return n.toString();
        })
    .recover(
        new PFBuilder<Throwable, String>()
            .match(RuntimeException.class, Throwable::getMessage)
            .build())
    .runForeach(System.out::println, system);
```

### Example 9: Recover

```scala
0
1
2
3                         // last element before failure
Boom! Bad value found: 4  // first element on failure
```

### Example 10: Recover

```java
0
1
2
3                         // last element before failure
Boom! Bad value found: 4  // first element on failure
```

### Example 11: Recover with retries

```scala
val planB = Source(List("five", "six", "seven", "eight"))

Source(0 to 10)
  .map(n =>
    if (n < 5) n.toString
    else throw new RuntimeException("Boom!"))
  .recoverWithRetries(attempts = 1, {
    case _: RuntimeException => planB
  })
  .runForeach(println)
```

### Example 12: Recover with retries

```java
Source<String, NotUsed> planB = Source.from(Arrays.asList("five", "six", "seven", "eight"));

Source.from(Arrays.asList(0, 1, 2, 3, 4, 5, 6))
    .map(
        n -> {
          if (n < 5) return n.toString();
          else throw new RuntimeException("Boom!");
        })
    .recoverWithRetries(
        1, // max attempts
        new PFBuilder<Throwable, Source<String, NotUsed>>()
            .match(RuntimeException.class, ex -> planB)
            .build())
    .runForeach(System.out::println, system);
```

### Example 13: Recover with retries

```scala
0
1
2
3
4
five
six
seven
eight
```

### Example 14: Recover with retries

```java
0
1
2
3
4
five
six
seven
eight
```

### Example 15: Delayed restarts with a backoff operator

```scala
val settings = RestartSettings(
  minBackoff = 3.seconds,
  maxBackoff = 30.seconds,
  randomFactor = 0.2 // adds 20% "noise" to vary the intervals slightly
).withMaxRestarts(20, 5.minutes) // limits the amount of restarts to 20 within 5 minutes

val restartSource = RestartSource.withBackoff(settings) { () =>
  // Create a source from a future of a source
  Source.futureSource {
    // Make a single request with akka-http
    Http()
      .singleRequest(HttpRequest(uri = "http://example.com/eventstream"))
      // Unmarshall it as a source of server sent events
      .flatMap(Unmarshal(_).to[Source[ServerSentEvent, NotUsed]])
  }
}
```

### Example 16: Delayed restarts with a backoff operator

```java
RestartSettings settings =
    RestartSettings.create(
            Duration.ofSeconds(3), // min backoff
            Duration.ofSeconds(30), // max backoff
            0.2 // adds 20% "noise" to vary the intervals slightly
            )
        .withMaxRestarts(
            20, Duration.ofMinutes(5)); // limits the amount of restarts to 20 within 5 minutes

Source<ServerSentEvent, NotUsed> eventStream =
    RestartSource.withBackoff(
        settings,
        () ->
            // Create a source from a future of a source
            Source.completionStageSource(
                // Issue a GET request on the event stream
                Http.get(system)
                    .singleRequest(HttpRequest.create("http://example.com/eventstream"))
                    .thenCompose(
                        response ->
                            // Unmarshall it to a stream of ServerSentEvents
                            EventStreamUnmarshalling.fromEventStream()
                                .unmarshall(response, materializer))));
```

### Example 17: Delayed restarts with a backoff operator

```scala
val killSwitch = restartSource
  .viaMat(KillSwitches.single)(Keep.right)
  .toMat(Sink.foreach(event => println(s"Got event: $event")))(Keep.left)
  .run()

doSomethingElse()

killSwitch.shutdown()
```

### Example 18: Delayed restarts with a backoff operator

```java
KillSwitch killSwitch =
    eventStream
        .viaMat(KillSwitches.single(), Keep.right())
        .toMat(Sink.foreach(event -> System.out.println("Got event: " + event)), Keep.left())
        .run(materializer);

doSomethingElse();

killSwitch.shutdown();
```

### Example 19: Supervision Strategies

```scala
val source = Source(0 to 5).map(100 / _)
val result = source.runWith(Sink.fold(0)(_ + _))
// division by zero will fail the stream and the
// result here will be a Future completed with Failure(ArithmeticException)
```

### Example 20: Supervision Strategies

```java
final Source<Integer, NotUsed> source =
    Source.from(Arrays.asList(0, 1, 2, 3, 4, 5)).map(elem -> 100 / elem);
final Sink<Integer, CompletionStage<Integer>> fold =
    Sink.<Integer, Integer>fold(0, (acc, elem) -> acc + elem);
final CompletionStage<Integer> result = source.runWith(fold, system);
// division by zero will fail the stream and the
// result here will be a CompletionStage failed with ArithmeticException
```

### Example 21: Supervision Strategies

```scala
val decider: Supervision.Decider = {
  case _: ArithmeticException => Supervision.Resume
  case _                      => Supervision.Stop
}
val source = Source(0 to 5).map(100 / _)
val runnableGraph =
  source.toMat(Sink.fold(0)(_ + _))(Keep.right)

val withCustomSupervision = runnableGraph.withAttributes(ActorAttributes.supervisionStrategy(decider))

val result = withCustomSupervision.run()
// the element causing division by zero will be dropped
// result here will be a Future completed with Success(228)
```

### Example 22: Supervision Strategies

```java
final Function<Throwable, Supervision.Directive> decider =
    exc -> {
      if (exc instanceof ArithmeticException) return Supervision.resume();
      else return Supervision.stop();
    };
final Source<Integer, NotUsed> source =
    Source.from(Arrays.asList(0, 1, 2, 3, 4, 5))
        .map(elem -> 100 / elem)
        .withAttributes(ActorAttributes.withSupervisionStrategy(decider));
final Sink<Integer, CompletionStage<Integer>> fold = Sink.fold(0, (acc, elem) -> acc + elem);

final RunnableGraph<CompletionStage<Integer>> runnableGraph = source.toMat(fold, Keep.right());

final RunnableGraph<CompletionStage<Integer>> withCustomSupervision =
    runnableGraph.withAttributes(ActorAttributes.withSupervisionStrategy(decider));

final CompletionStage<Integer> result = withCustomSupervision.run(system);
// the element causing division by zero will be dropped
// result here will be a CompletionStage completed with 228
```

### Example 23: Supervision Strategies

```scala
val decider: Supervision.Decider = {
  case _: ArithmeticException => Supervision.Resume
  case _                      => Supervision.Stop
}
val flow = Flow[Int]
  .filter(100 / _ < 50)
  .map(elem => 100 / (5 - elem))
  .withAttributes(ActorAttributes.supervisionStrategy(decider))
val source = Source(0 to 5).via(flow)

val result = source.runWith(Sink.fold(0)(_ + _))
// the elements causing division by zero will be dropped
// result here will be a Future completed with Success(150)
```

### Example 24: Supervision Strategies

```java
final Function<Throwable, Supervision.Directive> decider =
    exc -> {
      if (exc instanceof ArithmeticException) return Supervision.resume();
      else return Supervision.stop();
    };
final Flow<Integer, Integer, NotUsed> flow =
    Flow.of(Integer.class)
        .filter(elem -> 100 / elem < 50)
        .map(elem -> 100 / (5 - elem))
        .withAttributes(ActorAttributes.withSupervisionStrategy(decider));
final Source<Integer, NotUsed> source = Source.from(Arrays.asList(0, 1, 2, 3, 4, 5)).via(flow);
final Sink<Integer, CompletionStage<Integer>> fold =
    Sink.<Integer, Integer>fold(0, (acc, elem) -> acc + elem);
final CompletionStage<Integer> result = source.runWith(fold, system);
// the elements causing division by zero will be dropped
// result here will be a Future completed with 150
```

### Example 25: Supervision Strategies

```scala
val decider: Supervision.Decider = {
  case _: IllegalArgumentException => Supervision.Restart
  case _                           => Supervision.Stop
}
val flow = Flow[Int]
  .scan(0) { (acc, elem) =>
    if (elem < 0) throw new IllegalArgumentException("negative not allowed")
    else acc + elem
  }
  .withAttributes(ActorAttributes.supervisionStrategy(decider))
val source = Source(List(1, 3, -1, 5, 7)).via(flow)
val result = source.limit(1000).runWith(Sink.seq)
// the negative element cause the scan stage to be restarted,
// i.e. start from 0 again
// result here will be a Future completed with Success(Vector(0, 1, 4, 0, 5, 12))
```

### Example 26: Supervision Strategies

```java
final Function<Throwable, Supervision.Directive> decider =
    exc -> {
      if (exc instanceof IllegalArgumentException) return Supervision.restart();
      else return Supervision.stop();
    };
final Flow<Integer, Integer, NotUsed> flow =
    Flow.of(Integer.class)
        .scan(
            0,
            (acc, elem) -> {
              if (elem < 0) throw new IllegalArgumentException("negative not allowed");
              else return acc + elem;
            })
        .withAttributes(ActorAttributes.withSupervisionStrategy(decider));
final Source<Integer, NotUsed> source = Source.from(Arrays.asList(1, 3, -1, 5, 7)).via(flow);
final CompletionStage<List<Integer>> result =
    source.grouped(1000).runWith(Sink.<List<Integer>>head(), system);
// the negative element cause the scan stage to be restarted,
// i.e. start from 0 again
// result here will be a Future completed with List(0, 1, 4, 0, 5, 12)
```

### Example 27: Errors from mapAsync

```scala
val authors: Source[Author, NotUsed] =
  tweets.filter(_.hashtags.contains(akkaTag)).map(_.author)
```

### Example 28: Errors from mapAsync

```java
final Source<Author, NotUsed> authors =
    tweets.filter(t -> t.hashtags().contains(AKKA)).map(t -> t.author);
```

### Example 29: Errors from mapAsync

```scala
def lookupEmail(handle: String): Future[String] =
```

### Example 30: Errors from mapAsync

```java
public CompletionStage<String> lookupEmail(String handle)
```

### Example 31: Errors from mapAsync

```scala
import ActorAttributes.supervisionStrategy
import Supervision.resumingDecider

val emailAddresses: Source[String, NotUsed] =
  authors.via(
    Flow[Author]
      .mapAsync(4)(author => addressSystem.lookupEmail(author.handle))
      .withAttributes(supervisionStrategy(resumingDecider)))
```

### Example 32: Errors from mapAsync

```java
final Attributes resumeAttrib =
    ActorAttributes.withSupervisionStrategy(Supervision.getResumingDecider());
final Flow<Author, String, NotUsed> lookupEmail =
    Flow.of(Author.class)
        .mapAsync(4, author -> addressSystem.lookupEmail(author.handle))
        .withAttributes(resumeAttrib);
final Source<String, NotUsed> emailAddresses = authors.via(lookupEmail);
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/stream/RestartSettings.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/Supervision$$Restart$.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/Supervision$$Resume$.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/Supervision$$Stop$.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/Supervision$.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Broadcast.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/RestartFlow$.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/RestartSink$.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/RestartSource$.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/RunnableGraph.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Sink.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/RestartSettings.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/Supervision.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/RestartFlow.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/RestartSink.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/RestartSource.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/RunnableGraph.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Sink.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html
- https://doc.akka.io/libraries/akka-core/2.10/stream/operators/Source-or-Flow/alsoTo.html
- https://doc.akka.io/libraries/akka-core/2.10/stream/operators/Source-or-Flow/divertTo.html
- https://doc.akka.io/libraries/akka-core/2.10/stream/operators/Source-or-Flow/recover.html
- https://doc.akka.io/libraries/akka-core/2.10/stream/reactive-streams-interop.html
- https://doc.akka.io/libraries/akka-core/2.10/stream/stream-cookbook.html
- https://doc.akka.io/libraries/akka-core/2.10/stream/stream-customize.html
- https://doc.akka.io/libraries/akka-core/2.10/stream/stream-dynamic.html
- https://doc.akka.io/libraries/akka-core/2.10/stream/stream-error.html
- https://doc.akka.io/libraries/akka-core/2.10/stream/stream-graphs.html
- https://doc.akka.io/libraries/akka-core/2.10/stream/stream-io.html

---
*Source: [https://doc.akka.io/libraries/akka-core/2.10/stream/stream-error.html](https://doc.akka.io/libraries/akka-core/2.10/stream/stream-error.html)*