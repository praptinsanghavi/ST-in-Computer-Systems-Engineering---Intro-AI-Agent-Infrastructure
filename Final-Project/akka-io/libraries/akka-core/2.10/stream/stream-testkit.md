---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:05:05Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/stream-testkit.html
title: Testing streams • Akka core
---

# Testing streams • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Testing streams

## Dependency

Note
The Akka dependencies are available from Akka’s secure library repository. To access them you need to use a secure, tokenized URL as specified at <https://account.akka.io/token>.

To use Akka Stream TestKit, add the module to your project:

sbt
```
val AkkaVersion = "2.10.17"
libraryDependencies += "com.typesafe.akka" %% "akka-stream-testkit" % AkkaVersion % Test
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
    <artifactId>akka-stream-testkit_${scala.binary.version}</artifactId>
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

  testImplementation "com.typesafe.akka:akka-stream-testkit_${versions.ScalaBinary}"
}
```

## Introduction

Verifying behavior of Akka Stream sources, flows and sinks can be done using various code patterns and libraries. Here we will discuss testing these elements using:

- simple sources, sinks and flows;
- sources and sinks in combination with [`TestProbe`](https://doc.akka.io/api/akka-core/2.10/akka/testkit/TestProbe.html "akka.testkit.TestProbe")[`TestProbe`](https://doc.akka.io/japi/akka-core/2.10/akka/testkit/TestProbe.html "akka.testkit.TestProbe") from the `akka-testkit` module;
- sources and sinks specifically crafted for writing tests from the `akka-stream-testkit` module.

It is important to keep your data processing pipeline as separate sources, flows and sinks. This makes them testable by wiring them up to other sources or sinks, or some test harnesses that `akka-testkit` or `akka-stream-testkit` provide.

## Built\-in sources, sinks and operators

Testing a custom sink can be as simple as attaching a source that emits elements from a predefined collection, running a constructed test flow and asserting on the results that sink produced. Here is an example of a test for a sink:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/StreamTestKitDocSpec.scala#L21-L26 "Go to snippet source")val sinkUnderTest =
  Flow[Int].map(_ * 2).toMat(Sink.fold(0)(_ + _))(Keep.right)

val future = Source(1 to 4).runWith(sinkUnderTest)
val result = Await.result(future, 3.seconds)
assert(result == 20)
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/StreamTestKitDocTest.java#L49-L57 "Go to snippet source")final Sink<Integer, CompletionStage<Integer>> sinkUnderTest =
    Flow.of(Integer.class)
        .map(i -> i * 2)
        .toMat(Sink.fold(0, (agg, next) -> agg + next), Keep.right());

final CompletionStage<Integer> future =
    Source.from(Arrays.asList(1, 2, 3, 4)).runWith(sinkUnderTest, system);
final Integer result = future.toCompletableFuture().get(3, TimeUnit.SECONDS);
assertEquals(20, result.intValue());
```

The same strategy can be applied for sources as well. In the next example we have a source that produces an infinite stream of elements. Such source can be tested by asserting that first arbitrary number of elements hold some condition. Here the [`take`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html#take(long) "akka.stream.javadsl.Source")[`take`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html#take(n:Long):FlowOps.this.Repr[Out] "akka.stream.scaladsl.Source") operator and [`Sink.seq`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Sink.html#seq() "akka.stream.javadsl.Sink")[`Sink.seq`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Sink$.html#seq[T]:akka.stream.scaladsl.Sink[T,scala.concurrent.Future[Seq[T]]] "akka.stream.scaladsl.Sink") are very useful.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/StreamTestKitDocSpec.scala#L32-L36 "Go to snippet source")val sourceUnderTest = Source.repeat(1).map(_ * 2)

val future = sourceUnderTest.take(10).runWith(Sink.seq)
val result = Await.result(future, 3.seconds)
assert(result == Seq.fill(10)(2))
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/StreamTestKitDocTest.java#L64-L69 "Go to snippet source")final Source<Integer, NotUsed> sourceUnderTest = Source.repeat(1).map(i -> i * 2);

final CompletionStage<List<Integer>> future =
    sourceUnderTest.take(10).runWith(Sink.seq(), system);
final List<Integer> result = future.toCompletableFuture().get(3, TimeUnit.SECONDS);
assertEquals(Collections.nCopies(10, 2), result);
```

When testing a flow we need to attach a source and a sink. As both stream ends are under our control, we can choose sources that tests various edge cases of the flow and sinks that ease assertions.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/StreamTestKitDocSpec.scala#L42-L46 "Go to snippet source")val flowUnderTest = Flow[Int].takeWhile(_ < 5)

val future = Source(1 to 10).via(flowUnderTest).runWith(Sink.fold(Seq.empty[Int])(_ :+ _))
val result = Await.result(future, 3.seconds)
assert(result == (1 to 4))
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/StreamTestKitDocTest.java#L76-L84 "Go to snippet source")final Flow<Integer, Integer, NotUsed> flowUnderTest =
    Flow.of(Integer.class).takeWhile(i -> i < 5);

final CompletionStage<Integer> future =
    Source.from(Arrays.asList(1, 2, 3, 4, 5, 6))
        .via(flowUnderTest)
        .runWith(Sink.fold(0, (agg, next) -> agg + next), system);
final Integer result = future.toCompletableFuture().get(3, TimeUnit.SECONDS);
assertEquals(10, result.intValue());
```

## TestKit

Akka Stream offers integration with Actors out of the box. This support can be used for writing stream tests that use familiar [`TestProbe`](https://doc.akka.io/api/akka-core/2.10/akka/testkit/TestProbe.html "akka.testkit.TestProbe")[`TestProbe`](https://doc.akka.io/japi/akka-core/2.10/akka/testkit/TestProbe.html "akka.testkit.TestProbe") from the `akka-testkit` API.

One of the more straightforward tests would be to materialize stream to a [`Future`](http://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html "scala.concurrent.Future")[`CompletionStage`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html "java.util.concurrent.CompletionStage") and then use [`pipe`](https://doc.akka.io/api/akka-core/2.10/akka/pattern/PipeToSupport.html#pipe[T](future:scala.concurrent.Future[T])(implicitexecutionContext:scala.concurrent.ExecutionContext):PipeToSupport.this.PipeableFuture[T] "akka.pattern.PipeToSupport")[`Patterns.pipe`](https://doc.akka.io/api/akka-core/2.10/akka/pattern/Patterns$.html#pipe[T](future:java.util.concurrent.CompletionStage[T],context:scala.concurrent.ExecutionContext):akka.pattern.PipeableCompletionStage[T] "akka.pattern.Patterns") pattern to pipe the result of that future to the probe.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/StreamTestKitDocSpec.scala#L52-L59 "Go to snippet source")import system.dispatcher
import akka.pattern.pipe

val sourceUnderTest = Source(1 to 4).grouped(2)

val probe = TestProbe()
sourceUnderTest.runWith(Sink.seq).pipeTo(probe.ref)
probe.expectMsg(3.seconds, Seq(Seq(1, 2), Seq(3, 4)))
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/StreamTestKitDocTest.java#L91-L98 "Go to snippet source")final Source<List<Integer>, NotUsed> sourceUnderTest =
    Source.from(Arrays.asList(1, 2, 3, 4)).grouped(2);

final TestKit probe = new TestKit(system);
final CompletionStage<List<List<Integer>>> future =
    sourceUnderTest.grouped(2).runWith(Sink.head(), system);
akka.pattern.Patterns.pipe(future, system.dispatcher()).to(probe.getRef());
probe.expectMsg(Duration.ofSeconds(3), Arrays.asList(Arrays.asList(1, 2), Arrays.asList(3, 4)));
```

Instead of materializing to a future, we can use a [`Sink.actorRef`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Sink.html#actorRef(akka.actor.ActorRef,java.lang.Object) "akka.stream.javadsl.Sink")[`Sink.actorRef`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Sink$.html#actorRef[T](ref:akka.actor.ActorRef,onCompleteMessage:Any,onFailureMessage:Throwable=%3EAny):akka.stream.scaladsl.Sink[T,akka.NotUsed] "akka.stream.scaladsl.Sink") that sends all incoming elements to the given [`ActorRef`](https://doc.akka.io/api/akka-core/2.10/akka/actor/ActorRef.html "akka.actor.ActorRef")[`ActorRef`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorRef.html "akka.actor.ActorRef"). Now we can use assertion methods on [`TestProbe`](https://doc.akka.io/api/akka-core/2.10/akka/testkit/TestProbe.html "akka.testkit.TestProbe")[`TestProbe`](https://doc.akka.io/japi/akka-core/2.10/akka/testkit/TestProbe.html "akka.testkit.TestProbe") and expect elements one by one as they arrive. We can also assert stream completion by expecting for `onCompleteMessage` which was given to `Sink.actorRef`.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/StreamTestKitDocSpec.scala#L65-L77 "Go to snippet source")case object Tick
val sourceUnderTest = Source.tick(0.seconds, 200.millis, Tick)

val probe = TestProbe()
val cancellable = sourceUnderTest
  .to(Sink.actorRef(probe.ref, onCompleteMessage = "completed", onFailureMessage = _ => "failed"))
  .run()

probe.expectMsg(1.second, Tick)
probe.expectNoMessage(100.millis)
probe.expectMsg(3.seconds, Tick)
cancellable.cancel()
probe.expectMsg(3.seconds, "completed")
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/StreamTestKitDocTest.java#L110-L120 "Go to snippet source")final Source<Tick, Cancellable> sourceUnderTest =
    Source.tick(Duration.ZERO, Duration.ofMillis(200), Tick.TOCK);

final TestKit probe = new TestKit(system);
final Cancellable cancellable =
    sourceUnderTest.to(Sink.actorRef(probe.getRef(), Tick.COMPLETED)).run(system);
probe.expectMsg(Duration.ofSeconds(3), Tick.TOCK);
probe.expectNoMessage(Duration.ofMillis(100));
probe.expectMsg(Duration.ofSeconds(3), Tick.TOCK);
cancellable.cancel();
probe.expectMsg(Duration.ofSeconds(3), Tick.COMPLETED);
```

Similarly to `Sink.actorRef` that provides control over received elements, we can use [`Source.actorRef`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html#actorRef(int,akka.stream.OverflowStrategy) "akka.stream.javadsl.Source")[`Source.actorRef`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source$.html#actorRef[T](completionMatcher:PartialFunction[Any,akka.stream.CompletionStrategy],failureMatcher:PartialFunction[Any,Throwable],bufferSize:Int,overflowStrategy:akka.stream.OverflowStrategy):akka.stream.scaladsl.Source[T,akka.actor.ActorRef] "akka.stream.scaladsl.Source") and have full control over elements to be sent.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/StreamTestKitDocSpec.scala#L83-L104 "Go to snippet source")val sinkUnderTest = Flow[Int].map(_.toString).toMat(Sink.fold("")(_ + _))(Keep.right)

val (ref, future) = Source
  .actorRef(
    completionMatcher = {
      case Done =>
        CompletionStrategy.draining
    },
    // Never fail the stream because of a message:
    failureMatcher = PartialFunction.empty,
    bufferSize = 8,
    overflowStrategy = OverflowStrategy.fail)
  .toMat(sinkUnderTest)(Keep.both)
  .run()

ref ! 1
ref ! 2
ref ! 3
ref ! Done

val result = Await.result(future, 3.seconds)
assert(result == "123")
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/StreamTestKitDocTest.java#L127-L154 "Go to snippet source")final Sink<Integer, CompletionStage<String>> sinkUnderTest =
    Flow.of(Integer.class)
        .map(i -> i.toString())
        .toMat(Sink.fold("", (agg, next) -> agg + next), Keep.right());

final Pair<ActorRef, CompletionStage<String>> refAndCompletionStage =
    Source.<Integer>actorRef(
            elem -> {
              // complete stream immediately if we send it Done
              if (elem == Done.done()) return Optional.of(CompletionStrategy.immediately());
              else return Optional.empty();
            },
            // never fail the stream because of a message
            elem -> Optional.empty(),
            8,
            OverflowStrategy.fail())
        .toMat(sinkUnderTest, Keep.both())
        .run(system);
final ActorRef ref = refAndCompletionStage.first();
final CompletionStage<String> future = refAndCompletionStage.second();

ref.tell(1, ActorRef.noSender());
ref.tell(2, ActorRef.noSender());
ref.tell(3, ActorRef.noSender());
ref.tell(Done.getInstance(), ActorRef.noSender());

final String result = future.toCompletableFuture().get(1, TimeUnit.SECONDS);
assertEquals("123", result);
```

## Streams TestKit

You may have noticed various code patterns that emerge when testing stream pipelines. Akka Stream has a separate `akka-stream-testkit` module that provides tools specifically for writing stream tests. This module comes with two main components that are [`TestSource`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/testkit/javadsl/TestSource.html "akka.stream.testkit.javadsl.TestSource")[`TestSource`](https://doc.akka.io/api/akka-core/2.10/akka/stream/testkit/scaladsl/TestSource$.html "akka.stream.testkit.scaladsl.TestSource") and [`TestSink`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/testkit/javadsl/TestSink.html "akka.stream.testkit.javadsl.TestSink")[`TestSink`](https://doc.akka.io/api/akka-core/2.10/akka/stream/testkit/scaladsl/TestSink$.html "akka.stream.testkit.scaladsl.TestSink") which provide sources and sinks that materialize to probes that allow fluent API.

### Using the TestKit

A sink returned by [`TestSink.probe`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/testkit/javadsl/TestSink.html#probe(akka.actor.ActorSystem) "akka.stream.testkit.javadsl.TestSink")[`TestSink.probe`](https://doc.akka.io/api/akka-core/2.10/akka/stream/testkit/scaladsl/TestSink$.html#probe[T](implicitsystem:akka.actor.ActorSystem):akka.stream.scaladsl.Sink[T,akka.stream.testkit.TestSubscriber.Probe[T]] "akka.stream.testkit.scaladsl.TestSink") allows manual control over demand and assertions over elements coming downstream.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/StreamTestKitDocSpec.scala#L110-L112 "Go to snippet source")val sourceUnderTest = Source(1 to 4).filter(_ % 2 == 0).map(_ * 2)

sourceUnderTest.runWith(TestSink[Int]()).request(2).expectNext(4, 8).expectComplete()
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/StreamTestKitDocTest.java#L161-L168 "Go to snippet source")final Source<Integer, NotUsed> sourceUnderTest =
    Source.from(Arrays.asList(1, 2, 3, 4)).filter(elem -> elem % 2 == 0).map(elem -> elem * 2);

sourceUnderTest
    .runWith(TestSink.probe(system), system)
    .request(2)
    .expectNext(4, 8)
    .expectComplete();
```

A source returned by [`TestSource.probe`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/testkit/javadsl/TestSource.html#probe(akka.actor.ActorSystem) "akka.stream.testkit.javadsl.TestSource")[`TestSource.probe`](https://doc.akka.io/api/akka-core/2.10/akka/stream/testkit/scaladsl/TestSource$.html#probe[T](implicitsystem:akka.actor.ActorSystem):akka.stream.scaladsl.Source[T,akka.stream.testkit.TestPublisher.Probe[T]] "akka.stream.testkit.scaladsl.TestSource") can be used for asserting demand or controlling when stream is completed or ended with an error.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/StreamTestKitDocSpec.scala#L118-L120 "Go to snippet source")val sinkUnderTest = Sink.cancelled

TestSource[Int]().toMat(sinkUnderTest)(Keep.left).run().expectCancellation()
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/StreamTestKitDocTest.java#L175-L180 "Go to snippet source")final Sink<Integer, NotUsed> sinkUnderTest = Sink.cancelled();

TestSource.<Integer>probe(system)
    .toMat(sinkUnderTest, Keep.left())
    .run(system)
    .expectCancellation();
```

You can also inject exceptions and test sink behavior on error conditions.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/StreamTestKitDocSpec.scala#L126-L131 "Go to snippet source")val sinkUnderTest = Sink.head[Int]

val (probe, future) = TestSource[Int]().toMat(sinkUnderTest)(Keep.both).run()
probe.sendError(new Exception("boom"))

assert(future.failed.futureValue.getMessage == "boom")
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/StreamTestKitDocTest.java#L187-L198 "Go to snippet source")final Sink<Integer, CompletionStage<Integer>> sinkUnderTest = Sink.head();

final Pair<TestPublisher.Probe<Integer>, CompletionStage<Integer>> probeAndCompletionStage =
    TestSource.<Integer>probe(system).toMat(sinkUnderTest, Keep.both()).run(system);
final TestPublisher.Probe<Integer> probe = probeAndCompletionStage.first();
final CompletionStage<Integer> future = probeAndCompletionStage.second();
probe.sendError(new Exception("boom"));

ExecutionException exception =
    Assert.assertThrows(
        ExecutionException.class, () -> future.toCompletableFuture().get(3, TimeUnit.SECONDS));
assertEquals("boom", exception.getCause().getMessage());
```

Test source and sink can be used together in combination when testing flows.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/StreamTestKitDocSpec.scala#L138-L152 "Go to snippet source")val flowUnderTest = Flow[Int].mapAsyncUnordered(2) { sleep =>
  pattern.after(10.millis * sleep, using = system.scheduler)(Future.successful(sleep))
}

val (pub, sub) = TestSource[Int]().via(flowUnderTest).toMat(TestSink[Int]())(Keep.both).run()

sub.request(n = 3)
pub.sendNext(3)
pub.sendNext(2)
pub.sendNext(1)
sub.expectNextUnordered(1, 2, 3)

pub.sendError(new Exception("Power surge in the linear subroutine C-47!"))
val ex = sub.expectError()
assert(ex.getMessage.contains("C-47"))
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/StreamTestKitDocTest.java#L205-L232 "Go to snippet source")final Flow<Integer, Integer, NotUsed> flowUnderTest =
    Flow.of(Integer.class)
        .mapAsyncUnordered(
            2,
            sleep ->
                akka.pattern.Patterns.after(
                    Duration.ofMillis(10),
                    system.scheduler(),
                    system.dispatcher(),
                    () -> CompletableFuture.completedFuture(sleep)));

final Pair<TestPublisher.Probe<Integer>, TestSubscriber.Probe<Integer>> pubAndSub =
    TestSource.<Integer>probe(system)
        .via(flowUnderTest)
        .toMat(TestSink.<Integer>probe(system), Keep.both())
        .run(system);
final TestPublisher.Probe<Integer> pub = pubAndSub.first();
final TestSubscriber.Probe<Integer> sub = pubAndSub.second();

sub.request(3);
pub.sendNext(3);
pub.sendNext(2);
pub.sendNext(1);
sub.expectNextUnordered(1, 2, 3);

pub.sendError(new Exception("Power surge in the linear subroutine C-47!"));
final Throwable ex = sub.expectError();
assertTrue(ex.getMessage().contains("C-47"));
```

## Fuzzing Mode

For testing, it is possible to enable a special stream execution mode that exercises concurrent execution paths more aggressively (at the cost of reduced performance) and therefore helps exposing race conditions in tests. To enable this setting add the following line to your configuration:

```
akka.stream.materializer.debug.fuzzing-mode = on

```
Warning
Never use this setting in production or benchmarks. This is a testing tool to provide more coverage of your code during tests, but it reduces the throughput of streams. A warning message will be logged if you have this setting enabled.

## Code Examples

### Example 1: Dependency

```scala
val AkkaVersion = "2.10.17"
libraryDependencies += "com.typesafe.akka" %% "akka-stream-testkit" % AkkaVersion % Test
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
    <artifactId>akka-stream-testkit_${scala.binary.version}</artifactId>
    <scope>test</scope>
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

  testImplementation "com.typesafe.akka:akka-stream-testkit_${versions.ScalaBinary}"
}
```

### Example 4: Built-in sources, sinks and operators

```scala
val sinkUnderTest =
  Flow[Int].map(_ * 2).toMat(Sink.fold(0)(_ + _))(Keep.right)

val future = Source(1 to 4).runWith(sinkUnderTest)
val result = Await.result(future, 3.seconds)
assert(result == 20)
```

### Example 5: Built-in sources, sinks and operators

```java
final Sink<Integer, CompletionStage<Integer>> sinkUnderTest =
    Flow.of(Integer.class)
        .map(i -> i * 2)
        .toMat(Sink.fold(0, (agg, next) -> agg + next), Keep.right());

final CompletionStage<Integer> future =
    Source.from(Arrays.asList(1, 2, 3, 4)).runWith(sinkUnderTest, system);
final Integer result = future.toCompletableFuture().get(3, TimeUnit.SECONDS);
assertEquals(20, result.intValue());
```

### Example 6: Built-in sources, sinks and operators

```scala
val sourceUnderTest = Source.repeat(1).map(_ * 2)

val future = sourceUnderTest.take(10).runWith(Sink.seq)
val result = Await.result(future, 3.seconds)
assert(result == Seq.fill(10)(2))
```

### Example 7: Built-in sources, sinks and operators

```java
final Source<Integer, NotUsed> sourceUnderTest = Source.repeat(1).map(i -> i * 2);

final CompletionStage<List<Integer>> future =
    sourceUnderTest.take(10).runWith(Sink.seq(), system);
final List<Integer> result = future.toCompletableFuture().get(3, TimeUnit.SECONDS);
assertEquals(Collections.nCopies(10, 2), result);
```

### Example 8: Built-in sources, sinks and operators

```scala
val flowUnderTest = Flow[Int].takeWhile(_ < 5)

val future = Source(1 to 10).via(flowUnderTest).runWith(Sink.fold(Seq.empty[Int])(_ :+ _))
val result = Await.result(future, 3.seconds)
assert(result == (1 to 4))
```

### Example 9: Built-in sources, sinks and operators

```java
final Flow<Integer, Integer, NotUsed> flowUnderTest =
    Flow.of(Integer.class).takeWhile(i -> i < 5);

final CompletionStage<Integer> future =
    Source.from(Arrays.asList(1, 2, 3, 4, 5, 6))
        .via(flowUnderTest)
        .runWith(Sink.fold(0, (agg, next) -> agg + next), system);
final Integer result = future.toCompletableFuture().get(3, TimeUnit.SECONDS);
assertEquals(10, result.intValue());
```

### Example 10: TestKit

```scala
import system.dispatcher
import akka.pattern.pipe

val sourceUnderTest = Source(1 to 4).grouped(2)

val probe = TestProbe()
sourceUnderTest.runWith(Sink.seq).pipeTo(probe.ref)
probe.expectMsg(3.seconds, Seq(Seq(1, 2), Seq(3, 4)))
```

### Example 11: TestKit

```java
final Source<List<Integer>, NotUsed> sourceUnderTest =
    Source.from(Arrays.asList(1, 2, 3, 4)).grouped(2);

final TestKit probe = new TestKit(system);
final CompletionStage<List<List<Integer>>> future =
    sourceUnderTest.grouped(2).runWith(Sink.head(), system);
akka.pattern.Patterns.pipe(future, system.dispatcher()).to(probe.getRef());
probe.expectMsg(Duration.ofSeconds(3), Arrays.asList(Arrays.asList(1, 2), Arrays.asList(3, 4)));
```

### Example 12: TestKit

```scala
case object Tick
val sourceUnderTest = Source.tick(0.seconds, 200.millis, Tick)

val probe = TestProbe()
val cancellable = sourceUnderTest
  .to(Sink.actorRef(probe.ref, onCompleteMessage = "completed", onFailureMessage = _ => "failed"))
  .run()

probe.expectMsg(1.second, Tick)
probe.expectNoMessage(100.millis)
probe.expectMsg(3.seconds, Tick)
cancellable.cancel()
probe.expectMsg(3.seconds, "completed")
```

### Example 13: TestKit

```java
final Source<Tick, Cancellable> sourceUnderTest =
    Source.tick(Duration.ZERO, Duration.ofMillis(200), Tick.TOCK);

final TestKit probe = new TestKit(system);
final Cancellable cancellable =
    sourceUnderTest.to(Sink.actorRef(probe.getRef(), Tick.COMPLETED)).run(system);
probe.expectMsg(Duration.ofSeconds(3), Tick.TOCK);
probe.expectNoMessage(Duration.ofMillis(100));
probe.expectMsg(Duration.ofSeconds(3), Tick.TOCK);
cancellable.cancel();
probe.expectMsg(Duration.ofSeconds(3), Tick.COMPLETED);
```

### Example 14: TestKit

```scala
val sinkUnderTest = Flow[Int].map(_.toString).toMat(Sink.fold("")(_ + _))(Keep.right)

val (ref, future) = Source
  .actorRef(
    completionMatcher = {
      case Done =>
        CompletionStrategy.draining
    },
    // Never fail the stream because of a message:
    failureMatcher = PartialFunction.empty,
    bufferSize = 8,
    overflowStrategy = OverflowStrategy.fail)
  .toMat(sinkUnderTest)(Keep.both)
  .run()

ref ! 1
ref ! 2
ref ! 3
ref ! Done

val result = Await.result(future, 3.seconds)
assert(result == "123")
```

### Example 15: TestKit

```java
final Sink<Integer, CompletionStage<String>> sinkUnderTest =
    Flow.of(Integer.class)
        .map(i -> i.toString())
        .toMat(Sink.fold("", (agg, next) -> agg + next), Keep.right());

final Pair<ActorRef, CompletionStage<String>> refAndCompletionStage =
    Source.<Integer>actorRef(
            elem -> {
              // complete stream immediately if we send it Done
              if (elem == Done.done()) return Optional.of(CompletionStrategy.immediately());
              else return Optional.empty();
            },
            // never fail the stream because of a message
            elem -> Optional.empty(),
            8,
            OverflowStrategy.fail())
        .toMat(sinkUnderTest, Keep.both())
        .run(system);
final ActorRef ref = refAndCompletionStage.first();
final CompletionStage<String> future = refAndCompletionStage.second();

ref.tell(1, ActorRef.noSender());
ref.tell(2, ActorRef.noSender());
ref.tell(3, ActorRef.noSender());
ref.tell(Done.getInstance(), ActorRef.noSender());

final String result = future.toCompletableFuture().get(1, TimeUnit.SECONDS);
assertEquals("123", result);
```

### Example 16: Using the TestKit

```scala
val sourceUnderTest = Source(1 to 4).filter(_ % 2 == 0).map(_ * 2)

sourceUnderTest.runWith(TestSink[Int]()).request(2).expectNext(4, 8).expectComplete()
```

### Example 17: Using the TestKit

```java
final Source<Integer, NotUsed> sourceUnderTest =
    Source.from(Arrays.asList(1, 2, 3, 4)).filter(elem -> elem % 2 == 0).map(elem -> elem * 2);

sourceUnderTest
    .runWith(TestSink.probe(system), system)
    .request(2)
    .expectNext(4, 8)
    .expectComplete();
```

### Example 18: Using the TestKit

```scala
val sinkUnderTest = Sink.cancelled

TestSource[Int]().toMat(sinkUnderTest)(Keep.left).run().expectCancellation()
```

### Example 19: Using the TestKit

```java
final Sink<Integer, NotUsed> sinkUnderTest = Sink.cancelled();

TestSource.<Integer>probe(system)
    .toMat(sinkUnderTest, Keep.left())
    .run(system)
    .expectCancellation();
```

### Example 20: Using the TestKit

```scala
val sinkUnderTest = Sink.head[Int]

val (probe, future) = TestSource[Int]().toMat(sinkUnderTest)(Keep.both).run()
probe.sendError(new Exception("boom"))

assert(future.failed.futureValue.getMessage == "boom")
```

### Example 21: Using the TestKit

```java
final Sink<Integer, CompletionStage<Integer>> sinkUnderTest = Sink.head();

final Pair<TestPublisher.Probe<Integer>, CompletionStage<Integer>> probeAndCompletionStage =
    TestSource.<Integer>probe(system).toMat(sinkUnderTest, Keep.both()).run(system);
final TestPublisher.Probe<Integer> probe = probeAndCompletionStage.first();
final CompletionStage<Integer> future = probeAndCompletionStage.second();
probe.sendError(new Exception("boom"));

ExecutionException exception =
    Assert.assertThrows(
        ExecutionException.class, () -> future.toCompletableFuture().get(3, TimeUnit.SECONDS));
assertEquals("boom", exception.getCause().getMessage());
```

### Example 22: Using the TestKit

```scala
val flowUnderTest = Flow[Int].mapAsyncUnordered(2) { sleep =>
  pattern.after(10.millis * sleep, using = system.scheduler)(Future.successful(sleep))
}

val (pub, sub) = TestSource[Int]().via(flowUnderTest).toMat(TestSink[Int]())(Keep.both).run()

sub.request(n = 3)
pub.sendNext(3)
pub.sendNext(2)
pub.sendNext(1)
sub.expectNextUnordered(1, 2, 3)

pub.sendError(new Exception("Power surge in the linear subroutine C-47!"))
val ex = sub.expectError()
assert(ex.getMessage.contains("C-47"))
```

### Example 23: Using the TestKit

```java
final Flow<Integer, Integer, NotUsed> flowUnderTest =
    Flow.of(Integer.class)
        .mapAsyncUnordered(
            2,
            sleep ->
                akka.pattern.Patterns.after(
                    Duration.ofMillis(10),
                    system.scheduler(),
                    system.dispatcher(),
                    () -> CompletableFuture.completedFuture(sleep)));

final Pair<TestPublisher.Probe<Integer>, TestSubscriber.Probe<Integer>> pubAndSub =
    TestSource.<Integer>probe(system)
        .via(flowUnderTest)
        .toMat(TestSink.<Integer>probe(system), Keep.both())
        .run(system);
final TestPublisher.Probe<Integer> pub = pubAndSub.first();
final TestSubscriber.Probe<Integer> sub = pubAndSub.second();

sub.request(3);
pub.sendNext(3);
pub.sendNext(2);
pub.sendNext(1);
sub.expectNextUnordered(1, 2, 3);

pub.sendError(new Exception("Power surge in the linear subroutine C-47!"));
final Throwable ex = sub.expectError();
assertTrue(ex.getMessage().contains("C-47"));
```

### Example 24: Fuzzing Mode

```text
akka.stream.materializer.debug.fuzzing-mode = on
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/actor/ActorRef.html
- https://doc.akka.io/api/akka-core/2.10/akka/pattern/Patterns$.html
- https://doc.akka.io/api/akka-core/2.10/akka/pattern/PipeToSupport.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Sink$.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source$.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/testkit/scaladsl/TestSink$.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/testkit/scaladsl/TestSource$.html
- https://doc.akka.io/api/akka-core/2.10/akka/testkit/TestProbe.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Sink.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/testkit/javadsl/TestSink.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/testkit/javadsl/TestSource.html
- https://doc.akka.io/japi/akka-core/2.10/akka/testkit/TestProbe.html
- https://doc.akka.io/libraries/akka-core/2.10/stream/stream-parallelism.html
- https://doc.akka.io/libraries/akka-core/2.10/stream/stream-substream.html

---
*Source: [https://doc.akka.io/libraries/akka-core/2.10/stream/stream-testkit.html](https://doc.akka.io/libraries/akka-core/2.10/stream/stream-testkit.html)*