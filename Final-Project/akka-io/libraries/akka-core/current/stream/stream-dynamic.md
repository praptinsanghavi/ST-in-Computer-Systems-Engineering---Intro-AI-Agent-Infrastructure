---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:39:21Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/stream-dynamic.html
title: Dynamic stream handling • Akka core
---

# Dynamic stream handling • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Dynamic stream handling

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

## Controlling stream completion with KillSwitch

A [`KillSwitch`](https://doc.akka.io/api/akka-core/2.10/akka/stream/KillSwitch.html "akka.stream.KillSwitch")[`KillSwitch`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/KillSwitch.html "akka.stream.KillSwitch") allows the completion of operators of [`FlowShape`](https://doc.akka.io/api/akka-core/2.10/akka/stream/FlowShape.html "akka.stream.FlowShape")[`FlowShape`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/FlowShape.html "akka.stream.FlowShape") from the outside. It consists of a flow element that can be linked to an operator of `FlowShape` needing completion control. The `KillSwitch` trait interface allows to:

- complete the stream(s) via [`shutdown()`](https://doc.akka.io/api/akka-core/2.10/akka/stream/KillSwitch.html#shutdown():Unit "akka.stream.KillSwitch")[`shutdown()`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/KillSwitch.html#shutdown() "akka.stream.KillSwitch")
- fail the stream(s) via [`abort(Throwable error)`](https://doc.akka.io/api/akka-core/2.10/akka/stream/KillSwitch.html#abort(ex:Throwable):Unit "akka.stream.KillSwitch")[`abort(Throwable error)`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/KillSwitch.html#abort(java.lang.Throwable) "akka.stream.KillSwitch")

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-stream/src/main/scala/akka/stream/KillSwitch.scala#L142-L153 "Go to snippet source")trait KillSwitch {

  /**
   * After calling [[KillSwitch#shutdown]] the linked [[Graph]]s of [[FlowShape]] are completed normally.
   */
  def shutdown(): Unit

  /**
   * After calling [[KillSwitch#abort]] the linked [[Graph]]s of [[FlowShape]] are failed.
   */
  def abort(ex: Throwable): Unit
}
```

After the first call to either `shutdown` or `abort`, all subsequent calls to any of these methods will be ignored. Stream completion is performed by both

- cancelling its upstream.
- completing (in case of `shutdown`) or failing (in case of `abort`) its downstream

A `KillSwitch` can control the completion of one or multiple streams, and therefore comes in two different flavours.

### UniqueKillSwitch

[`UniqueKillSwitch`](https://doc.akka.io/api/akka-core/2.10/akka/stream/UniqueKillSwitch.html "akka.stream.UniqueKillSwitch")[`UniqueKillSwitch`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/UniqueKillSwitch.html "akka.stream.UniqueKillSwitch") allows to control the completion of **one** materialized [`Graph`](https://doc.akka.io/api/akka-core/2.10/akka/stream/Graph.html "akka.stream.Graph")[`Graph`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/Graph.html "akka.stream.Graph") of [`FlowShape`](https://doc.akka.io/api/akka-core/2.10/akka/stream/FlowShape.html "akka.stream.FlowShape")[`FlowShape`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/FlowShape.html "akka.stream.FlowShape"). Refer to the below for usage examples.

- **Shutdown**

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/KillSwitchDocSpec.scala#L25-L37 "Go to snippet source")val countingSrc = Source(Stream.from(1)).delay(1.second, DelayOverflowStrategy.backpressure)
val lastSnk = Sink.last[Int]

val (killSwitch, last) = countingSrc
  .viaMat(KillSwitches.single)(Keep.right)
  .toMat(lastSnk)(Keep.both)
  .run()

doSomethingElse()

killSwitch.shutdown()

Await.result(last, 1.second) shouldBe 2
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/KillSwitchDocTest.java#L47-L65 "Go to snippet source")final Source<Integer, NotUsed> countingSrc =
    Source.from(new ArrayList<>(Arrays.asList(1, 2, 3, 4)))
        .delay(Duration.ofSeconds(1), DelayOverflowStrategy.backpressure());
final Sink<Integer, CompletionStage<Integer>> lastSnk = Sink.last();

final Pair<UniqueKillSwitch, CompletionStage<Integer>> stream =
    countingSrc
        .viaMat(KillSwitches.single(), Keep.right())
        .toMat(lastSnk, Keep.both())
        .run(system);

final UniqueKillSwitch killSwitch = stream.first();
final CompletionStage<Integer> completionStage = stream.second();

doSomethingElse();
killSwitch.shutdown();

final int finalCount = completionStage.toCompletableFuture().get(1, TimeUnit.SECONDS);
assertEquals(2, finalCount);
```

- **Abort**

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/KillSwitchDocSpec.scala#L46-L56 "Go to snippet source")val countingSrc = Source(Stream.from(1)).delay(1.second, DelayOverflowStrategy.backpressure)
val lastSnk = Sink.last[Int]

val (killSwitch, last) = countingSrc
  .viaMat(KillSwitches.single)(Keep.right)
  .toMat(lastSnk)(Keep.both).run()

val error = new RuntimeException("boom!")
killSwitch.abort(error)

Await.result(last.failed, 1.second) shouldBe error
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/KillSwitchDocTest.java#L71-L90 "Go to snippet source")final Source<Integer, NotUsed> countingSrc =
    Source.from(new ArrayList<>(Arrays.asList(1, 2, 3, 4)))
        .delay(Duration.ofSeconds(1), DelayOverflowStrategy.backpressure());
final Sink<Integer, CompletionStage<Integer>> lastSnk = Sink.last();

final Pair<UniqueKillSwitch, CompletionStage<Integer>> stream =
    countingSrc
        .viaMat(KillSwitches.single(), Keep.right())
        .toMat(lastSnk, Keep.both())
        .run(system);

final UniqueKillSwitch killSwitch = stream.first();
final CompletionStage<Integer> completionStage = stream.second();

final Exception error = new Exception("boom!");
killSwitch.abort(error);

final int result =
    completionStage.toCompletableFuture().exceptionally(e -> -1).get(1, TimeUnit.SECONDS);
assertEquals(-1, result);
```

### SharedKillSwitch

A [`SharedKillSwitch`](https://doc.akka.io/api/akka-core/2.10/akka/stream/SharedKillSwitch.html "akka.stream.SharedKillSwitch")[`SharedKillSwitch`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/SharedKillSwitch.html "akka.stream.SharedKillSwitch") allows to control the completion of an arbitrary number operators of [`FlowShape`](https://doc.akka.io/api/akka-core/2.10/akka/stream/FlowShape.html "akka.stream.FlowShape")[`FlowShape`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/FlowShape.html "akka.stream.FlowShape"). It can be materialized multiple times via its [`flow`](https://doc.akka.io/api/akka-core/2.10/akka/stream/SharedKillSwitch.html#flow[T]:akka.stream.Graph[akka.stream.FlowShape[T,T],akka.stream.SharedKillSwitch] "akka.stream.SharedKillSwitch")[`flow`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/SharedKillSwitch.html#flow() "akka.stream.SharedKillSwitch") method, and all materialized operators linked to it are controlled by the switch. Refer to the below for usage examples.

- **Shutdown**

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/KillSwitchDocSpec.scala#L67-L85 "Go to snippet source")val countingSrc = Source(Stream.from(1)).delay(1.second, DelayOverflowStrategy.backpressure)
val lastSnk = Sink.last[Int]
val sharedKillSwitch = KillSwitches.shared("my-kill-switch")

val last = countingSrc
  .via(sharedKillSwitch.flow)
  .runWith(lastSnk)

val delayedLast = countingSrc
  .delay(1.second, DelayOverflowStrategy.backpressure)
  .via(sharedKillSwitch.flow)
  .runWith(lastSnk)

doSomethingElse()

sharedKillSwitch.shutdown()

Await.result(last, 1.second) shouldBe 2
Await.result(delayedLast, 1.second) shouldBe 1
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/KillSwitchDocTest.java#L96-L122 "Go to snippet source")final Source<Integer, NotUsed> countingSrc =
    Source.from(new ArrayList<>(Arrays.asList(1, 2, 3, 4)))
        .delay(Duration.ofSeconds(1), DelayOverflowStrategy.backpressure());
final Sink<Integer, CompletionStage<Integer>> lastSnk = Sink.last();
final SharedKillSwitch killSwitch = KillSwitches.shared("my-kill-switch");

final CompletionStage<Integer> completionStage =
    countingSrc
        .viaMat(killSwitch.flow(), Keep.right())
        .toMat(lastSnk, Keep.right())
        .run(system);
final CompletionStage<Integer> completionStageDelayed =
    countingSrc
        .delay(Duration.ofSeconds(1), DelayOverflowStrategy.backpressure())
        .viaMat(killSwitch.flow(), Keep.right())
        .toMat(lastSnk, Keep.right())
        .run(system);

doSomethingElse();
killSwitch.shutdown();

final int finalCount = completionStage.toCompletableFuture().get(1, TimeUnit.SECONDS);
final int finalCountDelayed =
    completionStageDelayed.toCompletableFuture().get(1, TimeUnit.SECONDS);

assertEquals(2, finalCount);
assertEquals(1, finalCountDelayed);
```

- **Abort**

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/KillSwitchDocSpec.scala#L94-L105 "Go to snippet source")val countingSrc = Source(Stream.from(1)).delay(1.second)
val lastSnk = Sink.last[Int]
val sharedKillSwitch = KillSwitches.shared("my-kill-switch")

val last1 = countingSrc.via(sharedKillSwitch.flow).runWith(lastSnk)
val last2 = countingSrc.via(sharedKillSwitch.flow).runWith(lastSnk)

val error = new RuntimeException("boom!")
sharedKillSwitch.abort(error)

Await.result(last1.failed, 1.second) shouldBe error
Await.result(last2.failed, 1.second) shouldBe error
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/KillSwitchDocTest.java#L128-L154 "Go to snippet source")final Source<Integer, NotUsed> countingSrc =
    Source.from(new ArrayList<>(Arrays.asList(1, 2, 3, 4)))
        .delay(Duration.ofSeconds(1), DelayOverflowStrategy.backpressure());
final Sink<Integer, CompletionStage<Integer>> lastSnk = Sink.last();
final SharedKillSwitch killSwitch = KillSwitches.shared("my-kill-switch");

final CompletionStage<Integer> completionStage1 =
    countingSrc
        .viaMat(killSwitch.flow(), Keep.right())
        .toMat(lastSnk, Keep.right())
        .run(system);
final CompletionStage<Integer> completionStage2 =
    countingSrc
        .viaMat(killSwitch.flow(), Keep.right())
        .toMat(lastSnk, Keep.right())
        .run(system);

final Exception error = new Exception("boom!");
killSwitch.abort(error);

final int result1 =
    completionStage1.toCompletableFuture().exceptionally(e -> -1).get(1, TimeUnit.SECONDS);
final int result2 =
    completionStage2.toCompletableFuture().exceptionally(e -> -1).get(1, TimeUnit.SECONDS);

assertEquals(-1, result1);
assertEquals(-1, result2);
```

Note
A [`UniqueKillSwitch`](https://doc.akka.io/api/akka-core/2.10/akka/stream/UniqueKillSwitch.html "akka.stream.UniqueKillSwitch")[`UniqueKillSwitch`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/UniqueKillSwitch.html "akka.stream.UniqueKillSwitch") is always a result of a materialization, whilst [`SharedKillSwitch`](https://doc.akka.io/api/akka-core/2.10/akka/stream/SharedKillSwitch.html "akka.stream.SharedKillSwitch")[`SharedKillSwitch`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/SharedKillSwitch.html "akka.stream.SharedKillSwitch") needs to be constructed before any materialization takes place.

## Dynamic fan\-in and fan\-out with MergeHub, BroadcastHub and PartitionHub

There are many cases when consumers or producers of a certain service (represented as a Sink, Source, or possibly Flow) are dynamic and not known in advance. The Graph DSL does not allow to represent this, all connections of the graph must be known in advance and must be connected upfront. To allow dynamic fan\-in and fan\-out streaming, the Hubs should be used. They provide means to construct [`Sink`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Sink.html "akka.stream.javadsl.Sink")[`Sink`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Sink.html "akka.stream.scaladsl.Sink") and [`Source`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html "akka.stream.javadsl.Source")[`Source`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html "akka.stream.scaladsl.Source") pairs that are “attached” to each other, but one of them can be materialized multiple times to implement dynamic fan\-in or fan\-out.

### Using the MergeHub

A [`MergeHub`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/MergeHub.html "akka.stream.javadsl.MergeHub")[`MergeHub`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/MergeHub$.html "akka.stream.scaladsl.MergeHub") allows to implement a dynamic fan\-in junction point in a graph where elements coming from different producers are emitted in a First\-Comes\-First\-Served fashion. If the consumer cannot keep up then *all* of the producers are backpressured. The hub itself comes as a [`Source`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html "akka.stream.javadsl.Source")[`Source`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html "akka.stream.scaladsl.Source") to which the single consumer can be attached. It is not possible to attach any producers until this `Source` has been materialized (started). This is ensured by the fact that we only get the corresponding [`Sink`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Sink.html "akka.stream.javadsl.Sink")[`Sink`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Sink.html "akka.stream.scaladsl.Sink") as a materialized value. Usage might look like this:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/HubsDocSpec.scala#L26-L42 "Go to snippet source")// A simple consumer that will print to the console for now
val consumer = Sink.foreach(println)

// Attach a MergeHub Source to the consumer. This will materialize to a
// corresponding Sink.
val runnableGraph: RunnableGraph[Sink[String, NotUsed]] =
  MergeHub.source[String](perProducerBufferSize = 16).to(consumer)

// By running/materializing the consumer we get back a Sink, and hence
// now have access to feed elements into it. This Sink can be materialized
// any number of times, and every element that enters the Sink will
// be consumed by our consumer.
val toConsumer: Sink[String, NotUsed] = runnableGraph.run()

// Feeding two independent sources into the hub.
Source.single("Hello!").runWith(toConsumer)
Source.single("Hub!").runWith(toConsumer)
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/HubDocTest.java#L43-L57 "Go to snippet source")// A simple consumer that will print to the console for now
Sink<String, CompletionStage<Done>> consumer = Sink.foreach(System.out::println);

// Attach a MergeHub Source to the consumer. This will materialize to a
// corresponding Sink.
RunnableGraph<Sink<String, NotUsed>> runnableGraph = MergeHub.of(String.class, 16).to(consumer);

// By running/materializing the consumer we get back a Sink, and hence
// now have access to feed elements into it. This Sink can be materialized
// any number of times, and every element that enters the Sink will
// be consumed by our consumer.
Sink<String, NotUsed> toConsumer = runnableGraph.run(system);

Source.single("Hello!").runWith(toConsumer, system);
Source.single("Hub!").runWith(toConsumer, system);
```

This sequence, while might look odd at first, ensures proper startup order. Once we get the `Sink`, we can use it as many times as wanted. Everything that is fed to it will be delivered to the consumer we attached previously until it cancels.

### Using the BroadcastHub

A [`BroadcastHub`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/BroadcastHub.html "akka.stream.javadsl.BroadcastHub")[`BroadcastHub`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/BroadcastHub$.html "akka.stream.scaladsl.BroadcastHub") can be used to consume elements from a common producer by a dynamic set of consumers. The rate of the producer will be automatically adapted to the slowest consumer. In this case, the hub is a [`Sink`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Sink.html "akka.stream.javadsl.Sink")[`Sink`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Sink.html "akka.stream.scaladsl.Sink") to which the single producer must be attached first. Consumers can only be attached once the `Sink` has been materialized (i.e. the producer has been started). One example of using the `BroadcastHub`:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/HubsDocSpec.scala#L50-L66 "Go to snippet source")// A simple producer that publishes a new "message" every second
val producer = Source.tick(1.second, 1.second, "New message")

// Attach a BroadcastHub Sink to the producer. This will materialize to a
// corresponding Source.
// (We need to use toMat and Keep.right since by default the materialized
// value to the left is used)
val runnableGraph: RunnableGraph[Source[String, NotUsed]] =
  producer.toMat(BroadcastHub.sink(bufferSize = 256))(Keep.right)

// By running/materializing the producer, we get back a Source, which
// gives us access to the elements published by the producer.
val fromProducer: Source[String, NotUsed] = runnableGraph.run()

// Print out messages from the producer in two independent consumers
fromProducer.runForeach(msg => println("consumer1: " + msg))
fromProducer.runForeach(msg => println("consumer2: " + msg))
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/HubDocTest.java#L67-L84 "Go to snippet source")// A simple producer that publishes a new "message" every second
Source<String, Cancellable> producer =
    Source.tick(Duration.ofSeconds(1), Duration.ofSeconds(1), "New message");

// Attach a BroadcastHub Sink to the producer. This will materialize to a
// corresponding Source.
// (We need to use toMat and Keep.right since by default the materialized
// value to the left is used)
RunnableGraph<Source<String, NotUsed>> runnableGraph =
    producer.toMat(BroadcastHub.of(String.class, 256), Keep.right());

// By running/materializing the producer, we get back a Source, which
// gives us access to the elements published by the producer.
Source<String, NotUsed> fromProducer = runnableGraph.run(materializer);

// Print out messages from the producer in two independent consumers
fromProducer.runForeach(msg -> System.out.println("consumer1: " + msg), materializer);
fromProducer.runForeach(msg -> System.out.println("consumer2: " + msg), materializer);
```

The resulting [`Source`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html "akka.stream.javadsl.Source")[`Source`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html "akka.stream.scaladsl.Source") can be materialized any number of times, each materialization effectively attaching a new subscriber. If there are no subscribers attached to this hub then it will not drop any elements but instead backpressure the upstream producer until subscribers arrive. This behavior can be tweaked by using the operators [`.buffer`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html#buffer(int,akka.stream.OverflowStrategy) "akka.stream.javadsl.Source")[`.buffer`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html#buffer(size:Int,overflowStrategy:akka.stream.OverflowStrategy):FlowOps.this.Repr[Out] "akka.stream.scaladsl.Source") for example with a drop strategy, or attaching a subscriber that drops all messages. If there are no other subscribers, this will ensure that the producer is kept drained (dropping all elements) and once a new subscriber arrives it will adaptively slow down, ensuring no more messages are dropped.

### Combining dynamic operators to build a simple Publish\-Subscribe service

The features provided by the Hub implementations are limited by default. This is by design, as various combinations can be used to express additional features like unsubscribing producers or consumers externally. We show here an example that builds a [`Flow`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html "akka.stream.javadsl.Flow")[`Flow`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html "akka.stream.scaladsl.Flow") representing a publish\-subscribe channel. The input of the `Flow` is published to all subscribers while the output streams all the elements published.

First, we connect a [`MergeHub`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/MergeHub.html "akka.stream.javadsl.MergeHub")[`MergeHub`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/MergeHub$.html "akka.stream.scaladsl.MergeHub") and a [`BroadcastHub`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/BroadcastHub.html "akka.stream.javadsl.BroadcastHub")[`BroadcastHub`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/BroadcastHub$.html "akka.stream.scaladsl.BroadcastHub") together to form a publish\-subscribe channel. Once we materialize this small stream, we get back a pair of [`Source`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html "akka.stream.javadsl.Source")[`Source`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html "akka.stream.scaladsl.Source") and [`Sink`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Sink.html "akka.stream.javadsl.Sink")[`Sink`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Sink.html "akka.stream.scaladsl.Sink") that together define the publish and subscribe sides of our channel.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/HubsDocSpec.scala#L74-L76 "Go to snippet source")// Obtain a Sink and Source which will publish and receive from the "bus" respectively.
val (sink, source) =
  MergeHub.source[String](perProducerBufferSize = 16).toMat(BroadcastHub.sink(bufferSize = 256))(Keep.both).run()
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/HubDocTest.java#L94-L101 "Go to snippet source")// Obtain a Sink and Source which will publish and receive from the "bus" respectively.
Pair<Sink<String, NotUsed>, Source<String, NotUsed>> sinkAndSource =
    MergeHub.of(String.class, 16)
        .toMat(BroadcastHub.of(String.class, 256), Keep.both())
        .run(system);

Sink<String, NotUsed> sink = sinkAndSource.first();
Source<String, NotUsed> source = sinkAndSource.second();
```

We now use a few tricks to add more features. First of all, we attach a [`Sink.ignore`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Sink.html#ignore() "akka.stream.javadsl.Sink")[`Sink.ignore`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Sink$.html#ignore:akka.stream.scaladsl.Sink[Any,scala.concurrent.Future[akka.Done]] "akka.stream.scaladsl.Sink") at the broadcast side of the channel to keep it drained when there are no subscribers. If this behavior is not the desired one this line can be dropped.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/HubsDocSpec.scala#L80-L83 "Go to snippet source")// Ensure that the Broadcast output is dropped if there are no listening parties.
// If this dropping Sink is not attached, then the broadcast hub will not drop any
// elements itself when there are no subscribers, backpressuring the producer instead.
source.runWith(Sink.ignore)
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/HubDocTest.java#L105-L108 "Go to snippet source")// Ensure that the Broadcast output is dropped if there are no listening parties.
// If this dropping Sink is not attached, then the broadcast hub will not drop any
// elements itself when there are no subscribers, backpressuring the producer instead.
source.runWith(Sink.ignore(), system);
```

We now wrap the [`Sink`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Sink.html "akka.stream.javadsl.Sink")[`Sink`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Sink.html "akka.stream.scaladsl.Sink") and [`Source`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html "akka.stream.javadsl.Source")[`Source`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html "akka.stream.scaladsl.Source") in a [`Flow`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html "akka.stream.javadsl.Flow")[`Flow`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html "akka.stream.scaladsl.Flow") using [`Flow.fromSinkAndSource`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html#fromSinkAndSource(akka.stream.Graph,akka.stream.Graph) "akka.stream.javadsl.Flow")[`Flow.fromSinkAndSource`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow$.html#fromSinkAndSource[I,O](sink:akka.stream.Graph[akka.stream.SinkShape[I],_],source:akka.stream.Graph[akka.stream.SourceShape[O],_]):akka.stream.scaladsl.Flow[I,O,akka.NotUsed] "akka.stream.scaladsl.Flow"). This bundles up the two sides of the channel into one and forces users of it to always define a publisher and subscriber side (even if the subscriber side is dropping). It also allows us to attach a [`KillSwitch`](https://doc.akka.io/api/akka-core/2.10/akka/stream/KillSwitch.html "akka.stream.KillSwitch")[`KillSwitch`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/KillSwitch.html "akka.stream.KillSwitch") as a `BidiStage` which in turn makes it possible to close both the original `Sink` and `Source` at the same time. Finally, we add `backpressureTimeout` on the consumer side to ensure that subscribers that block the channel for more than 3 seconds are forcefully removed (and their stream failed).

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/HubsDocSpec.scala#L87-L94 "Go to snippet source")// We create now a Flow that represents a publish-subscribe channel using the above
// started stream as its "topic". We add two more features, external cancellation of
// the registration and automatic cleanup for very slow subscribers.
val busFlow: Flow[String, String, UniqueKillSwitch] =
  Flow
    .fromSinkAndSource(sink, source)
    .joinMat(KillSwitches.singleBidi[String, String])(Keep.right)
    .backpressureTimeout(3.seconds)
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/HubDocTest.java#L112-L118 "Go to snippet source")// We create now a Flow that represents a publish-subscribe channel using the above
// started stream as its "topic". We add two more features, external cancellation of
// the registration and automatic cleanup for very slow subscribers.
Flow<String, String, UniqueKillSwitch> busFlow =
    Flow.fromSinkAndSource(sink, source)
        .joinMat(KillSwitches.singleBidi(), Keep.right())
        .backpressureTimeout(Duration.ofSeconds(1));
```

The resulting Flow now has a type of `Flow[String, String, UniqueKillSwitch]` representing a publish\-subscribe channel which can be used any number of times to attach new producers or consumers. In addition, it materializes to a `UniqueKillSwitch` (see [UniqueKillSwitch](stream-dynamic.html#unique-kill-switch)) that can be used to deregister a single user externally:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/HubsDocSpec.scala#L98-L102 "Go to snippet source")val switch: UniqueKillSwitch =
  Source.repeat("Hello world!").viaMat(busFlow)(Keep.right).to(Sink.foreach(println)).run()

// Shut down externally
switch.shutdown()
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/HubDocTest.java#L122-L129 "Go to snippet source")UniqueKillSwitch killSwitch =
    Source.repeat("Hello World!")
        .viaMat(busFlow, Keep.right())
        .to(Sink.foreach(System.out::println))
        .run(system);

// Shut down externally
killSwitch.shutdown();
```

### Using the PartitionHub

**This is a [may change](../common/may-change.html) feature**\*

A [`PartitionHub`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/PartitionHub.html "akka.stream.javadsl.PartitionHub")[`PartitionHub`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/PartitionHub$.html "akka.stream.scaladsl.PartitionHub") can be used to route elements from a common producer to a dynamic set of consumers. The selection of consumer is done with a function. Each element can be routed to only one consumer. 

The rate of the producer will be automatically adapted to the slowest consumer. In this case, the hub is a [`Sink`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Sink.html "akka.stream.javadsl.Sink")[`Sink`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Sink.html "akka.stream.scaladsl.Sink") to which the single producer must be attached first. Consumers can only be attached once the `Sink` has been materialized (i.e. the producer has been started). One example of using the `PartitionHub`:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/HubsDocSpec.scala#L108-L128 "Go to snippet source")// A simple producer that publishes a new "message-" every second
val producer = Source.tick(1.second, 1.second, "message").zipWith(Source(1 to 100))((a, b) => s"$a-$b")

// Attach a PartitionHub Sink to the producer. This will materialize to a
// corresponding Source.
// (We need to use toMat and Keep.right since by default the materialized
// value to the left is used)
val runnableGraph: RunnableGraph[Source[String, NotUsed]] =
  producer.toMat(
    PartitionHub.sink(
      (size, elem) => math.abs(elem.hashCode % size),
      startAfterNrOfConsumers = 2,
      bufferSize = 256))(Keep.right)

// By running/materializing the producer, we get back a Source, which
// gives us access to the elements published by the producer.
val fromProducer: Source[String, NotUsed] = runnableGraph.run()

// Print out messages from the producer in two independent consumers
fromProducer.runForeach(msg => println("consumer1: " + msg))
fromProducer.runForeach(msg => println("consumer2: " + msg))
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/HubDocTest.java#L139-L159 "Go to snippet source")// A simple producer that publishes a new "message-n" every second
Source<String, Cancellable> producer =
    Source.tick(Duration.ofSeconds(1), Duration.ofSeconds(1), "message")
        .zipWith(Source.range(0, 100), (a, b) -> a + "-" + b);

// Attach a PartitionHub Sink to the producer. This will materialize to a
// corresponding Source.
// (We need to use toMat and Keep.right since by default the materialized
// value to the left is used)
RunnableGraph<Source<String, NotUsed>> runnableGraph =
    producer.toMat(
        PartitionHub.of(String.class, (size, elem) -> Math.abs(elem.hashCode() % size), 2, 256),
        Keep.right());

// By running/materializing the producer, we get back a Source, which
// gives us access to the elements published by the producer.
Source<String, NotUsed> fromProducer = runnableGraph.run(materializer);

// Print out messages from the producer in two independent consumers
fromProducer.runForeach(msg -> System.out.println("consumer1: " + msg), materializer);
fromProducer.runForeach(msg -> System.out.println("consumer2: " + msg), materializer);
```

The `partitioner` function takes two parameters; the first is the number of active consumers and the second is the stream element. The function should return the index of the selected consumer for the given element, i.e. `int` greater than or equal to 0 and less than number of consumers.

The resulting [`Source`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html "akka.stream.javadsl.Source")[`Source`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html "akka.stream.scaladsl.Source") can be materialized any number of times, each materialization effectively attaching a new consumer. If there are no consumers attached to this hub then it will not drop any elements but instead backpressure the upstream producer until consumers arrive. This behavior can be tweaked by using an operator, for example [`.buffer`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html#buffer(int,akka.stream.OverflowStrategy) "akka.stream.javadsl.Source")[`.buffer`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html#buffer(size:Int,overflowStrategy:akka.stream.OverflowStrategy):FlowOps.this.Repr[Out] "akka.stream.scaladsl.Source") with a drop strategy, or attaching a consumer that drops all messages. If there are no other consumers, this will ensure that the producer is kept drained (dropping all elements) and once a new consumer arrives and messages are routed to the new consumer it will adaptively slow down, ensuring no more messages are dropped.

It is possible to define how many initial consumers that are required before it starts emitting any messages to the attached consumers. While not enough consumers have been attached messages are buffered and when the buffer is full the upstream producer is backpressured. No messages are dropped.

The above example illustrate a stateless partition function. For more advanced stateful routing the [`ofStateful`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/PartitionHub$.html#ofStateful(java.lang.Class,java.util.function.Supplier,int) "akka.stream.javadsl.PartitionHub") [`statefulSink`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/PartitionHub$.html#statefulSink[T](partitioner:()=%3E(akka.stream.scaladsl.PartitionHub.ConsumerInfo,T)=%3ELong,startAfterNrOfConsumers:Int,bufferSize:Int):akka.stream.scaladsl.Sink[T,akka.stream.scaladsl.Source[T,akka.NotUsed]] "akka.stream.scaladsl.PartitionHub") can be used. Here is an example of a stateful round\-robin function:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/HubsDocSpec.scala#L134-L162 "Go to snippet source")// A simple producer that publishes a new "message-" every second
val producer = Source.tick(1.second, 1.second, "message").zipWith(Source(1 to 100))((a, b) => s"$a-$b")

// New instance of the partitioner function and its state is created
// for each materialization of the PartitionHub.
def roundRobin(): (PartitionHub.ConsumerInfo, String) => Long = {
  var i = -1L

  (info, elem) => {
    i += 1
    info.consumerIdByIdx((i % info.size).toInt)
  }
}

// Attach a PartitionHub Sink to the producer. This will materialize to a
// corresponding Source.
// (We need to use toMat and Keep.right since by default the materialized
// value to the left is used)
val runnableGraph: RunnableGraph[Source[String, NotUsed]] =
  producer.toMat(PartitionHub.statefulSink(() => roundRobin(), startAfterNrOfConsumers = 2, bufferSize = 256))(
    Keep.right)

// By running/materializing the producer, we get back a Source, which
// gives us access to the elements published by the producer.
val fromProducer: Source[String, NotUsed] = runnableGraph.run()

// Print out messages from the producer in two independent consumers
fromProducer.runForeach(msg => println("consumer1: " + msg))
fromProducer.runForeach(msg => println("consumer2: " + msg))
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/HubDocTest.java#L187-L207 "Go to snippet source")// A simple producer that publishes a new "message-n" every second
Source<String, Cancellable> producer =
    Source.tick(Duration.ofSeconds(1), Duration.ofSeconds(1), "message")
        .zipWith(Source.range(0, 100), (a, b) -> a + "-" + b);

// Attach a PartitionHub Sink to the producer. This will materialize to a
// corresponding Source.
// (We need to use toMat and Keep.right since by default the materialized
// value to the left is used)
RunnableGraph<Source<String, NotUsed>> runnableGraph =
    producer.toMat(
        PartitionHub.ofStateful(String.class, () -> new RoundRobin<String>(), 2, 256),
        Keep.right());

// By running/materializing the producer, we get back a Source, which
// gives us access to the elements published by the producer.
Source<String, NotUsed> fromProducer = runnableGraph.run(materializer);

// Print out messages from the producer in two independent consumers
fromProducer.runForeach(msg -> System.out.println("consumer1: " + msg), materializer);
fromProducer.runForeach(msg -> System.out.println("consumer2: " + msg), materializer);
```

Note that it is a factory of a function to be able to hold stateful variables that are unique for each materialization. In this example the `partitioner` function is implemented as a class to be able to hold the mutable variable. A new instance of `RoundRobin` is created for each materialization of the hub.

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/HubDocTest.java#L167-L178 "Go to snippet source")// Using a class since variable must otherwise be final.
// New instance is created for each materialization of the PartitionHub.
static class RoundRobin<T> implements ToLongBiFunction<ConsumerInfo, T> {

  private long i = -1;

  @Override
  public long applyAsLong(ConsumerInfo info, T elem) {
    i++;
    return info.consumerIdByIdx((int) (i % info.size()));
  }
}
```

The function takes two parameters; the first is information about active consumers, including an array of consumer identifiers and the second is the stream element. The function should return the selected consumer identifier for the given element. The function will never be called when there are no active consumers, i.e. there is always at least one element in the array of identifiers.

Another interesting type of routing is to prefer routing to the fastest consumers. The [`ConsumerInfo`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/PartitionHub.ConsumerInfo.html "akka.stream.javadsl.PartitionHub.ConsumerInfo")[`ConsumerInfo`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/PartitionHub$$ConsumerInfo.html "akka.stream.scaladsl.PartitionHub.ConsumerInfo") has an accessor `queueSize` that is approximate number of buffered elements for a consumer. Larger value than other consumers could be an indication of that the consumer is slow. Note that this is a moving target since the elements are consumed concurrently. Here is an example of a hub that routes to the consumer with least buffered elements:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/HubsDocSpec.scala#L168-L182 "Go to snippet source")val producer = Source(0 until 100)

// ConsumerInfo.queueSize is the approximate number of buffered elements for a consumer.
// Note that this is a moving target since the elements are consumed concurrently.
val runnableGraph: RunnableGraph[Source[Int, NotUsed]] =
  producer.toMat(
    PartitionHub.statefulSink(
      () => (info, elem) => info.consumerIds.minBy(id => info.queueSize(id)),
      startAfterNrOfConsumers = 2,
      bufferSize = 16))(Keep.right)

val fromProducer: Source[Int, NotUsed] = runnableGraph.run()

fromProducer.runForeach(msg => println("consumer1: " + msg))
fromProducer.throttle(10, 100.millis).runForeach(msg => println("consumer2: " + msg))
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/HubDocTest.java#L220-L251 "Go to snippet source")Source<Integer, NotUsed> producer = Source.range(0, 100);

// ConsumerInfo.queueSize is the approximate number of buffered elements for a consumer.
// Note that this is a moving target since the elements are consumed concurrently.
RunnableGraph<Source<Integer, NotUsed>> runnableGraph =
    producer.toMat(
        PartitionHub.ofStateful(
            Integer.class,
            () ->
                (info, elem) -> {
                  final List<Object> ids = info.getConsumerIds();
                  int minValue = info.queueSize(0);
                  long fastest = info.consumerIdByIdx(0);
                  for (int i = 1; i < ids.size(); i++) {
                    int value = info.queueSize(i);
                    if (value < minValue) {
                      minValue = value;
                      fastest = info.consumerIdByIdx(i);
                    }
                  }
                  return fastest;
                },
            2,
            8),
        Keep.right());

Source<Integer, NotUsed> fromProducer = runnableGraph.run(materializer);

fromProducer.runForeach(msg -> System.out.println("consumer1: " + msg), materializer);
fromProducer
    .throttle(10, Duration.ofMillis(100))
    .runForeach(msg -> System.out.println("consumer2: " + msg), materializer);
```

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

### Example 4: Controlling stream completion with KillSwitch

```scala
trait KillSwitch {

  /**
   * After calling [[KillSwitch#shutdown]] the linked [[Graph]]s of [[FlowShape]] are completed normally.
   */
  def shutdown(): Unit

  /**
   * After calling [[KillSwitch#abort]] the linked [[Graph]]s of [[FlowShape]] are failed.
   */
  def abort(ex: Throwable): Unit
}
```

### Example 5: UniqueKillSwitch

```scala
val countingSrc = Source(Stream.from(1)).delay(1.second, DelayOverflowStrategy.backpressure)
val lastSnk = Sink.last[Int]

val (killSwitch, last) = countingSrc
  .viaMat(KillSwitches.single)(Keep.right)
  .toMat(lastSnk)(Keep.both)
  .run()

doSomethingElse()

killSwitch.shutdown()

Await.result(last, 1.second) shouldBe 2
```

### Example 6: UniqueKillSwitch

```java
final Source<Integer, NotUsed> countingSrc =
    Source.from(new ArrayList<>(Arrays.asList(1, 2, 3, 4)))
        .delay(Duration.ofSeconds(1), DelayOverflowStrategy.backpressure());
final Sink<Integer, CompletionStage<Integer>> lastSnk = Sink.last();

final Pair<UniqueKillSwitch, CompletionStage<Integer>> stream =
    countingSrc
        .viaMat(KillSwitches.single(), Keep.right())
        .toMat(lastSnk, Keep.both())
        .run(system);

final UniqueKillSwitch killSwitch = stream.first();
final CompletionStage<Integer> completionStage = stream.second();

doSomethingElse();
killSwitch.shutdown();

final int finalCount = completionStage.toCompletableFuture().get(1, TimeUnit.SECONDS);
assertEquals(2, finalCount);
```

### Example 7: UniqueKillSwitch

```scala
val countingSrc = Source(Stream.from(1)).delay(1.second, DelayOverflowStrategy.backpressure)
val lastSnk = Sink.last[Int]

val (killSwitch, last) = countingSrc
  .viaMat(KillSwitches.single)(Keep.right)
  .toMat(lastSnk)(Keep.both).run()

val error = new RuntimeException("boom!")
killSwitch.abort(error)

Await.result(last.failed, 1.second) shouldBe error
```

### Example 8: UniqueKillSwitch

```java
final Source<Integer, NotUsed> countingSrc =
    Source.from(new ArrayList<>(Arrays.asList(1, 2, 3, 4)))
        .delay(Duration.ofSeconds(1), DelayOverflowStrategy.backpressure());
final Sink<Integer, CompletionStage<Integer>> lastSnk = Sink.last();

final Pair<UniqueKillSwitch, CompletionStage<Integer>> stream =
    countingSrc
        .viaMat(KillSwitches.single(), Keep.right())
        .toMat(lastSnk, Keep.both())
        .run(system);

final UniqueKillSwitch killSwitch = stream.first();
final CompletionStage<Integer> completionStage = stream.second();

final Exception error = new Exception("boom!");
killSwitch.abort(error);

final int result =
    completionStage.toCompletableFuture().exceptionally(e -> -1).get(1, TimeUnit.SECONDS);
assertEquals(-1, result);
```

### Example 9: SharedKillSwitch

```scala
val countingSrc = Source(Stream.from(1)).delay(1.second, DelayOverflowStrategy.backpressure)
val lastSnk = Sink.last[Int]
val sharedKillSwitch = KillSwitches.shared("my-kill-switch")

val last = countingSrc
  .via(sharedKillSwitch.flow)
  .runWith(lastSnk)

val delayedLast = countingSrc
  .delay(1.second, DelayOverflowStrategy.backpressure)
  .via(sharedKillSwitch.flow)
  .runWith(lastSnk)

doSomethingElse()

sharedKillSwitch.shutdown()

Await.result(last, 1.second) shouldBe 2
Await.result(delayedLast, 1.second) shouldBe 1
```

### Example 10: SharedKillSwitch

```java
final Source<Integer, NotUsed> countingSrc =
    Source.from(new ArrayList<>(Arrays.asList(1, 2, 3, 4)))
        .delay(Duration.ofSeconds(1), DelayOverflowStrategy.backpressure());
final Sink<Integer, CompletionStage<Integer>> lastSnk = Sink.last();
final SharedKillSwitch killSwitch = KillSwitches.shared("my-kill-switch");

final CompletionStage<Integer> completionStage =
    countingSrc
        .viaMat(killSwitch.flow(), Keep.right())
        .toMat(lastSnk, Keep.right())
        .run(system);
final CompletionStage<Integer> completionStageDelayed =
    countingSrc
        .delay(Duration.ofSeconds(1), DelayOverflowStrategy.backpressure())
        .viaMat(killSwitch.flow(), Keep.right())
        .toMat(lastSnk, Keep.right())
        .run(system);

doSomethingElse();
killSwitch.shutdown();

final int finalCount = completionStage.toCompletableFuture().get(1, TimeUnit.SECONDS);
final int finalCountDelayed =
    completionStageDelayed.toCompletableFuture().get(1, TimeUnit.SECONDS);

assertEquals(2, finalCount);
assertEquals(1, finalCountDelayed);
```

### Example 11: SharedKillSwitch

```scala
val countingSrc = Source(Stream.from(1)).delay(1.second)
val lastSnk = Sink.last[Int]
val sharedKillSwitch = KillSwitches.shared("my-kill-switch")

val last1 = countingSrc.via(sharedKillSwitch.flow).runWith(lastSnk)
val last2 = countingSrc.via(sharedKillSwitch.flow).runWith(lastSnk)

val error = new RuntimeException("boom!")
sharedKillSwitch.abort(error)

Await.result(last1.failed, 1.second) shouldBe error
Await.result(last2.failed, 1.second) shouldBe error
```

### Example 12: SharedKillSwitch

```java
final Source<Integer, NotUsed> countingSrc =
    Source.from(new ArrayList<>(Arrays.asList(1, 2, 3, 4)))
        .delay(Duration.ofSeconds(1), DelayOverflowStrategy.backpressure());
final Sink<Integer, CompletionStage<Integer>> lastSnk = Sink.last();
final SharedKillSwitch killSwitch = KillSwitches.shared("my-kill-switch");

final CompletionStage<Integer> completionStage1 =
    countingSrc
        .viaMat(killSwitch.flow(), Keep.right())
        .toMat(lastSnk, Keep.right())
        .run(system);
final CompletionStage<Integer> completionStage2 =
    countingSrc
        .viaMat(killSwitch.flow(), Keep.right())
        .toMat(lastSnk, Keep.right())
        .run(system);

final Exception error = new Exception("boom!");
killSwitch.abort(error);

final int result1 =
    completionStage1.toCompletableFuture().exceptionally(e -> -1).get(1, TimeUnit.SECONDS);
final int result2 =
    completionStage2.toCompletableFuture().exceptionally(e -> -1).get(1, TimeUnit.SECONDS);

assertEquals(-1, result1);
assertEquals(-1, result2);
```

### Example 13: Using the MergeHub

```scala
// A simple consumer that will print to the console for now
val consumer = Sink.foreach(println)

// Attach a MergeHub Source to the consumer. This will materialize to a
// corresponding Sink.
val runnableGraph: RunnableGraph[Sink[String, NotUsed]] =
  MergeHub.source[String](perProducerBufferSize = 16).to(consumer)

// By running/materializing the consumer we get back a Sink, and hence
// now have access to feed elements into it. This Sink can be materialized
// any number of times, and every element that enters the Sink will
// be consumed by our consumer.
val toConsumer: Sink[String, NotUsed] = runnableGraph.run()

// Feeding two independent sources into the hub.
Source.single("Hello!").runWith(toConsumer)
Source.single("Hub!").runWith(toConsumer)
```

### Example 14: Using the MergeHub

```java
// A simple consumer that will print to the console for now
Sink<String, CompletionStage<Done>> consumer = Sink.foreach(System.out::println);

// Attach a MergeHub Source to the consumer. This will materialize to a
// corresponding Sink.
RunnableGraph<Sink<String, NotUsed>> runnableGraph = MergeHub.of(String.class, 16).to(consumer);

// By running/materializing the consumer we get back a Sink, and hence
// now have access to feed elements into it. This Sink can be materialized
// any number of times, and every element that enters the Sink will
// be consumed by our consumer.
Sink<String, NotUsed> toConsumer = runnableGraph.run(system);

Source.single("Hello!").runWith(toConsumer, system);
Source.single("Hub!").runWith(toConsumer, system);
```

### Example 15: Using the BroadcastHub

```scala
// A simple producer that publishes a new "message" every second
val producer = Source.tick(1.second, 1.second, "New message")

// Attach a BroadcastHub Sink to the producer. This will materialize to a
// corresponding Source.
// (We need to use toMat and Keep.right since by default the materialized
// value to the left is used)
val runnableGraph: RunnableGraph[Source[String, NotUsed]] =
  producer.toMat(BroadcastHub.sink(bufferSize = 256))(Keep.right)

// By running/materializing the producer, we get back a Source, which
// gives us access to the elements published by the producer.
val fromProducer: Source[String, NotUsed] = runnableGraph.run()

// Print out messages from the producer in two independent consumers
fromProducer.runForeach(msg => println("consumer1: " + msg))
fromProducer.runForeach(msg => println("consumer2: " + msg))
```

### Example 16: Using the BroadcastHub

```java
// A simple producer that publishes a new "message" every second
Source<String, Cancellable> producer =
    Source.tick(Duration.ofSeconds(1), Duration.ofSeconds(1), "New message");

// Attach a BroadcastHub Sink to the producer. This will materialize to a
// corresponding Source.
// (We need to use toMat and Keep.right since by default the materialized
// value to the left is used)
RunnableGraph<Source<String, NotUsed>> runnableGraph =
    producer.toMat(BroadcastHub.of(String.class, 256), Keep.right());

// By running/materializing the producer, we get back a Source, which
// gives us access to the elements published by the producer.
Source<String, NotUsed> fromProducer = runnableGraph.run(materializer);

// Print out messages from the producer in two independent consumers
fromProducer.runForeach(msg -> System.out.println("consumer1: " + msg), materializer);
fromProducer.runForeach(msg -> System.out.println("consumer2: " + msg), materializer);
```

### Example 17: Combining dynamic operators to build a simple Publish-Subscribe service

```scala
// Obtain a Sink and Source which will publish and receive from the "bus" respectively.
val (sink, source) =
  MergeHub.source[String](perProducerBufferSize = 16).toMat(BroadcastHub.sink(bufferSize = 256))(Keep.both).run()
```

### Example 18: Combining dynamic operators to build a simple Publish-Subscribe service

```java
// Obtain a Sink and Source which will publish and receive from the "bus" respectively.
Pair<Sink<String, NotUsed>, Source<String, NotUsed>> sinkAndSource =
    MergeHub.of(String.class, 16)
        .toMat(BroadcastHub.of(String.class, 256), Keep.both())
        .run(system);

Sink<String, NotUsed> sink = sinkAndSource.first();
Source<String, NotUsed> source = sinkAndSource.second();
```

### Example 19: Combining dynamic operators to build a simple Publish-Subscribe service

```scala
// Ensure that the Broadcast output is dropped if there are no listening parties.
// If this dropping Sink is not attached, then the broadcast hub will not drop any
// elements itself when there are no subscribers, backpressuring the producer instead.
source.runWith(Sink.ignore)
```

### Example 20: Combining dynamic operators to build a simple Publish-Subscribe service

```java
// Ensure that the Broadcast output is dropped if there are no listening parties.
// If this dropping Sink is not attached, then the broadcast hub will not drop any
// elements itself when there are no subscribers, backpressuring the producer instead.
source.runWith(Sink.ignore(), system);
```

### Example 21: Combining dynamic operators to build a simple Publish-Subscribe service

```scala
// We create now a Flow that represents a publish-subscribe channel using the above
// started stream as its "topic". We add two more features, external cancellation of
// the registration and automatic cleanup for very slow subscribers.
val busFlow: Flow[String, String, UniqueKillSwitch] =
  Flow
    .fromSinkAndSource(sink, source)
    .joinMat(KillSwitches.singleBidi[String, String])(Keep.right)
    .backpressureTimeout(3.seconds)
```

### Example 22: Combining dynamic operators to build a simple Publish-Subscribe service

```java
// We create now a Flow that represents a publish-subscribe channel using the above
// started stream as its "topic". We add two more features, external cancellation of
// the registration and automatic cleanup for very slow subscribers.
Flow<String, String, UniqueKillSwitch> busFlow =
    Flow.fromSinkAndSource(sink, source)
        .joinMat(KillSwitches.singleBidi(), Keep.right())
        .backpressureTimeout(Duration.ofSeconds(1));
```

### Example 23: Combining dynamic operators to build a simple Publish-Subscribe service

```scala
val switch: UniqueKillSwitch =
  Source.repeat("Hello world!").viaMat(busFlow)(Keep.right).to(Sink.foreach(println)).run()

// Shut down externally
switch.shutdown()
```

### Example 24: Combining dynamic operators to build a simple Publish-Subscribe service

```java
UniqueKillSwitch killSwitch =
    Source.repeat("Hello World!")
        .viaMat(busFlow, Keep.right())
        .to(Sink.foreach(System.out::println))
        .run(system);

// Shut down externally
killSwitch.shutdown();
```

### Example 25: Using the PartitionHub

```scala
// A simple producer that publishes a new "message-" every second
val producer = Source.tick(1.second, 1.second, "message").zipWith(Source(1 to 100))((a, b) => s"$a-$b")

// Attach a PartitionHub Sink to the producer. This will materialize to a
// corresponding Source.
// (We need to use toMat and Keep.right since by default the materialized
// value to the left is used)
val runnableGraph: RunnableGraph[Source[String, NotUsed]] =
  producer.toMat(
    PartitionHub.sink(
      (size, elem) => math.abs(elem.hashCode % size),
      startAfterNrOfConsumers = 2,
      bufferSize = 256))(Keep.right)

// By running/materializing the producer, we get back a Source, which
// gives us access to the elements published by the producer.
val fromProducer: Source[String, NotUsed] = runnableGraph.run()

// Print out messages from the producer in two independent consumers
fromProducer.runForeach(msg => println("consumer1: " + msg))
fromProducer.runForeach(msg => println("consumer2: " + msg))
```

### Example 26: Using the PartitionHub

```java
// A simple producer that publishes a new "message-n" every second
Source<String, Cancellable> producer =
    Source.tick(Duration.ofSeconds(1), Duration.ofSeconds(1), "message")
        .zipWith(Source.range(0, 100), (a, b) -> a + "-" + b);

// Attach a PartitionHub Sink to the producer. This will materialize to a
// corresponding Source.
// (We need to use toMat and Keep.right since by default the materialized
// value to the left is used)
RunnableGraph<Source<String, NotUsed>> runnableGraph =
    producer.toMat(
        PartitionHub.of(String.class, (size, elem) -> Math.abs(elem.hashCode() % size), 2, 256),
        Keep.right());

// By running/materializing the producer, we get back a Source, which
// gives us access to the elements published by the producer.
Source<String, NotUsed> fromProducer = runnableGraph.run(materializer);

// Print out messages from the producer in two independent consumers
fromProducer.runForeach(msg -> System.out.println("consumer1: " + msg), materializer);
fromProducer.runForeach(msg -> System.out.println("consumer2: " + msg), materializer);
```

### Example 27: Using the PartitionHub

```scala
// A simple producer that publishes a new "message-" every second
val producer = Source.tick(1.second, 1.second, "message").zipWith(Source(1 to 100))((a, b) => s"$a-$b")

// New instance of the partitioner function and its state is created
// for each materialization of the PartitionHub.
def roundRobin(): (PartitionHub.ConsumerInfo, String) => Long = {
  var i = -1L

  (info, elem) => {
    i += 1
    info.consumerIdByIdx((i % info.size).toInt)
  }
}

// Attach a PartitionHub Sink to the producer. This will materialize to a
// corresponding Source.
// (We need to use toMat and Keep.right since by default the materialized
// value to the left is used)
val runnableGraph: RunnableGraph[Source[String, NotUsed]] =
  producer.toMat(PartitionHub.statefulSink(() => roundRobin(), startAfterNrOfConsumers = 2, bufferSize = 256))(
    Keep.right)

// By running/materializing the producer, we get back a Source, which
// gives us access to the elements published by the producer.
val fromProducer: Source[String, NotUsed] = runnableGraph.run()

// Print out messages from the producer in two independent consumers
fromProducer.runForeach(msg => println("consumer1: " + msg))
fromProducer.runForeach(msg => println("consumer2: " + msg))
```

### Example 28: Using the PartitionHub

```java
// A simple producer that publishes a new "message-n" every second
Source<String, Cancellable> producer =
    Source.tick(Duration.ofSeconds(1), Duration.ofSeconds(1), "message")
        .zipWith(Source.range(0, 100), (a, b) -> a + "-" + b);

// Attach a PartitionHub Sink to the producer. This will materialize to a
// corresponding Source.
// (We need to use toMat and Keep.right since by default the materialized
// value to the left is used)
RunnableGraph<Source<String, NotUsed>> runnableGraph =
    producer.toMat(
        PartitionHub.ofStateful(String.class, () -> new RoundRobin<String>(), 2, 256),
        Keep.right());

// By running/materializing the producer, we get back a Source, which
// gives us access to the elements published by the producer.
Source<String, NotUsed> fromProducer = runnableGraph.run(materializer);

// Print out messages from the producer in two independent consumers
fromProducer.runForeach(msg -> System.out.println("consumer1: " + msg), materializer);
fromProducer.runForeach(msg -> System.out.println("consumer2: " + msg), materializer);
```

### Example 29: Using the PartitionHub

```java
// Using a class since variable must otherwise be final.
// New instance is created for each materialization of the PartitionHub.
static class RoundRobin<T> implements ToLongBiFunction<ConsumerInfo, T> {

  private long i = -1;

  @Override
  public long applyAsLong(ConsumerInfo info, T elem) {
    i++;
    return info.consumerIdByIdx((int) (i % info.size()));
  }
}
```

### Example 30: Using the PartitionHub

```scala
val producer = Source(0 until 100)

// ConsumerInfo.queueSize is the approximate number of buffered elements for a consumer.
// Note that this is a moving target since the elements are consumed concurrently.
val runnableGraph: RunnableGraph[Source[Int, NotUsed]] =
  producer.toMat(
    PartitionHub.statefulSink(
      () => (info, elem) => info.consumerIds.minBy(id => info.queueSize(id)),
      startAfterNrOfConsumers = 2,
      bufferSize = 16))(Keep.right)

val fromProducer: Source[Int, NotUsed] = runnableGraph.run()

fromProducer.runForeach(msg => println("consumer1: " + msg))
fromProducer.throttle(10, 100.millis).runForeach(msg => println("consumer2: " + msg))
```

### Example 31: Using the PartitionHub

```java
Source<Integer, NotUsed> producer = Source.range(0, 100);

// ConsumerInfo.queueSize is the approximate number of buffered elements for a consumer.
// Note that this is a moving target since the elements are consumed concurrently.
RunnableGraph<Source<Integer, NotUsed>> runnableGraph =
    producer.toMat(
        PartitionHub.ofStateful(
            Integer.class,
            () ->
                (info, elem) -> {
                  final List<Object> ids = info.getConsumerIds();
                  int minValue = info.queueSize(0);
                  long fastest = info.consumerIdByIdx(0);
                  for (int i = 1; i < ids.size(); i++) {
                    int value = info.queueSize(i);
                    if (value < minValue) {
                      minValue = value;
                      fastest = info.consumerIdByIdx(i);
                    }
                  }
                  return fastest;
                },
            2,
            8),
        Keep.right());

Source<Integer, NotUsed> fromProducer = runnableGraph.run(materializer);

fromProducer.runForeach(msg -> System.out.println("consumer1: " + msg), materializer);
fromProducer
    .throttle(10, Duration.ofMillis(100))
    .runForeach(msg -> System.out.println("consumer2: " + msg), materializer);
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/stream/FlowShape.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/Graph.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/KillSwitch.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/SharedKillSwitch.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/UniqueKillSwitch.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/BroadcastHub$.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow$.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/MergeHub$.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/PartitionHub$$ConsumerInfo.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/PartitionHub$.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Sink$.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Sink.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/FlowShape.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/Graph.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/KillSwitch.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/SharedKillSwitch.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/UniqueKillSwitch.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/BroadcastHub.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/MergeHub.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/PartitionHub$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/PartitionHub.ConsumerInfo.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/PartitionHub.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Sink.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html
- https://doc.akka.io/libraries/akka-core/current/common/may-change.html
- https://doc.akka.io/libraries/akka-core/current/stream/stream-context.html
- https://doc.akka.io/libraries/akka-core/current/stream/stream-customize.html
- https://doc.akka.io/libraries/akka-core/current/stream/stream-dynamic.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/stream-dynamic.html](https://doc.akka.io/libraries/akka-core/current/stream/stream-dynamic.html)*