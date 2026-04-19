---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:05:00Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/stream-rate.html
title: Buffers and working with rate • Akka core
---

# Buffers and working with rate • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Buffers and working with rate

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

When upstream and downstream rates differ, especially when the throughput has spikes, it can be useful to introduce buffers in a stream. In this chapter we cover how buffers are used in Akka Streams.

## Buffers for asynchronous operators

In this section we will discuss internal buffers that are introduced as an optimization when using asynchronous operators.

To run an operator asynchronously it has to be marked explicitly as such using the [``.async``](https://doc.akka.io/api/akka-core/2.10/akka/stream/Graph.html#shape:S "akka.stream.Graph")[``.async()``](https://doc.akka.io/japi/akka-core/2.10/akka/stream/Graph.html#async-- "akka.stream.Graph") method. Being run asynchronously means that an operator, after handing out an element to its downstream consumer is able to immediately process the next message. To demonstrate what we mean by this, let’s take a look at the following example:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/StreamBuffersRateSpec.scala#L21-L34 "Go to snippet source")Source(1 to 3)
  .map { i =>
    println(s"A: $i"); i
  }
  .async
  .map { i =>
    println(s"B: $i"); i
  }
  .async
  .map { i =>
    println(s"C: $i"); i
  }
  .async
  .runWith(Sink.ignore)
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/StreamBuffersRateDocTest.java#L42-L61 "Go to snippet source")Source.from(Arrays.asList(1, 2, 3))
    .map(
        i -> {
          System.out.println("A: " + i);
          return i;
        })
    .async()
    .map(
        i -> {
          System.out.println("B: " + i);
          return i;
        })
    .async()
    .map(
        i -> {
          System.out.println("C: " + i);
          return i;
        })
    .async()
    .runWith(Sink.ignore(), system);
```

Running the above example, one of the possible outputs looks like this:

```
A: 1
A: 2
B: 1
A: 3
B: 2
C: 1
B: 3
C: 2
C: 3

```

Note that the order is *not* `A:1, B:1, C:1, A:2, B:2, C:2,` which would correspond to the normal fused synchronous execution model of flows where an element completely passes through the processing pipeline before the next element enters the flow. The next element is processed by an asynchronous operator as soon as it has emitted the previous one.

While pipelining in general increases throughput, in practice there is a cost of passing an element through the asynchronous (and therefore thread crossing) boundary which is significant. To amortize this cost Akka Streams uses a *windowed*, *batching* backpressure strategy internally. It is windowed because as opposed to a [Stop\-And\-Wait](https://en.wikipedia.org/wiki/Stop-and-wait_ARQ) protocol multiple elements might be “in\-flight” concurrently with requests for elements. It is also batching because a new element is not immediately requested once an element has been drained from the window\-buffer but multiple elements are requested after multiple elements have been drained. This batching strategy reduces the communication cost of propagating the backpressure signal through the asynchronous boundary.

While this internal protocol is mostly invisible to the user (apart from its throughput increasing effects) there are situations when these details get exposed. In all of our previous examples we always assumed that the rate of the processing chain is strictly coordinated through the backpressure signal causing all operators to process no faster than the throughput of the connected chain. There are tools in Akka Streams however that enable the rates of different segments of a processing chain to be “detached” or to define the maximum throughput of the stream through external timing sources. These situations are exactly those where the internal batching buffering strategy suddenly becomes non\-transparent.

### Internal buffers and their effect

As we have explained, for performance reasons Akka Streams introduces a buffer for every asynchronous operator. The purpose of these buffers is solely optimization, in fact the size of 1 would be the most natural choice if there would be no need for throughput improvements. Therefore it is recommended to keep these buffer sizes small, and increase them only to a level suitable for the throughput requirements of the application. Default buffer sizes can be set through configuration:

```
akka.stream.materializer.max-input-buffer-size = 16

```

Alternatively they can be set per stream by adding an attribute to the complete `RunnableGraph` or on smaller segments of the stream it is possible by defining a separate [``Flow``](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html "akka.stream.scaladsl.Flow")[``Flow``](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html "akka.stream.javadsl.Flow") with these attributes:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/StreamBuffersRateSpec.scala#L40-L45 "Go to snippet source")val section = Flow[Int].map(_ * 2).async.addAttributes(Attributes.inputBuffer(initial = 1, max = 1)) // the buffer size of this map is 1
val flow = section.via(Flow[Int].map(_ / 2)).async // the buffer size of this map is the default
val runnableGraph =
  Source(1 to 10).via(flow).to(Sink.foreach(elem => println(elem)))

val withOverriddenDefaults = runnableGraph.withAttributes(Attributes.inputBuffer(initial = 64, max = 64))
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/StreamBuffersRateDocTest.java#L69-L83 "Go to snippet source")final Flow<Integer, Integer, NotUsed> flow1 =
    Flow.of(Integer.class)
        .map(elem -> elem * 2)
        .async()
        .addAttributes(Attributes.inputBuffer(1, 1)); // the buffer size of this map is 1
final Flow<Integer, Integer, NotUsed> flow2 =
    flow1
        .via(Flow.of(Integer.class).map(elem -> elem / 2))
        .async(); // the buffer size of this map is the value from the surrounding graph it is
// used in
final RunnableGraph<NotUsed> runnableGraph =
    Source.range(1, 10).via(flow1).to(Sink.foreach(elem -> System.out.println(elem)));

final RunnableGraph<NotUsed> withOverridenDefaults =
    runnableGraph.withAttributes(Attributes.inputBuffer(64, 64));
```

Here is an example of a code that demonstrate some of the issues caused by internal buffers:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/StreamBuffersRateSpec.scala#L51-L68 "Go to snippet source")import scala.concurrent.duration._
case class Tick()

RunnableGraph.fromGraph(GraphDSL.create() { implicit b =>
  import GraphDSL.Implicits._

  // this is the asynchronous stage in this graph
  val zipper = b.add(ZipWith[Tick, Int, Int]((tick, count) => count).async)

  Source.tick(initialDelay = 3.second, interval = 3.second, Tick()) ~> zipper.in0

  Source
    .tick(initialDelay = 1.second, interval = 1.second, "message!")
    .conflateWithSeed(seed = (_) => 1)((count, _) => count + 1) ~> zipper.in1

  zipper.out ~> Sink.foreach(println)
  ClosedShape
})
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/StreamBuffersRateDocTest.java#L90-L108 "Go to snippet source")final Duration oneSecond = Duration.ofSeconds(1);
final Source<String, Cancellable> msgSource = Source.tick(oneSecond, oneSecond, "message!");
final Source<String, Cancellable> tickSource =
    Source.tick(oneSecond.multipliedBy(3), oneSecond.multipliedBy(3), "tick");
final Flow<String, Integer, NotUsed> conflate =
    Flow.of(String.class).conflateWithSeed(first -> 1, (count, elem) -> count + 1);

RunnableGraph.fromGraph(
        GraphDSL.create(
            b -> {
              // this is the asynchronous stage in this graph
              final FanInShape2<String, Integer, Integer> zipper =
                  b.add(ZipWith.create((String tick, Integer count) -> count).async());
              b.from(b.add(msgSource)).via(b.add(conflate)).toInlet(zipper.in1());
              b.from(b.add(tickSource)).toInlet(zipper.in0());
              b.from(zipper.out()).to(b.add(Sink.foreach(elem -> System.out.println(elem))));
              return ClosedShape.getInstance();
            }))
    .run(system);
```

Running the above example one would expect the number *3* to be printed in every 3 seconds (the `conflateWithSeed` step here is configured so that it counts the number of elements received before the downstream [``ZipWith``](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/ZipWith$.html "akka.stream.scaladsl.ZipWith")[``ZipWith``](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/ZipWith$.html "akka.stream.javadsl.ZipWith") consumes them). What is being printed is different though, we will see the number *1*. The reason for this is the internal buffer which is by default 16 elements large, and prefetches elements before the [``ZipWith``](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/ZipWith$.html "akka.stream.scaladsl.ZipWith")[``ZipWith``](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/ZipWith$.html "akka.stream.javadsl.ZipWith") starts consuming them. It is possible to fix this issue by changing the buffer size of [``ZipWith``](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/ZipWith$.html "akka.stream.scaladsl.ZipWith")[``ZipWith``](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/ZipWith$.html "akka.stream.javadsl.ZipWith") to 1\. We will still see a leading 1 though which is caused by an initial prefetch of the [``ZipWith``](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/ZipWith$.html "akka.stream.scaladsl.ZipWith")[``ZipWith``](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/ZipWith$.html "akka.stream.javadsl.ZipWith") element.

Note
In general, when time or rate driven operators exhibit strange behavior, one of the first solutions to try should be to decrease the input buffer of the affected elements to 1\.

## Buffers in Akka Streams

In this section we will discuss *explicit* user defined buffers that are part of the domain logic of the stream processing pipeline of an application.

The example below will ensure that 1000 jobs (but not more) are dequeued from an external (imaginary) system and stored locally in memory \- relieving the external system:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/StreamBuffersRateSpec.scala#L76-L78 "Go to snippet source")// Getting a stream of jobs from an imaginary external system as a Source
val jobs: Source[Job, NotUsed] = inboundJobsConnector()
jobs.buffer(1000, OverflowStrategy.backpressure)
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/StreamBuffersRateDocTest.java#L116-L118 "Go to snippet source")// Getting a stream of jobs from an imaginary external system as a Source
final Source<Job, NotUsed> jobs = inboundJobsConnector;
jobs.buffer(1000, OverflowStrategy.backpressure());
```

The next example will also queue up 1000 jobs locally, but if there are more jobs waiting in the imaginary external systems, it makes space for the new element by dropping one element from the *tail* of the buffer. Dropping from the tail is a very common strategy but it must be noted that this will drop the *youngest* waiting job. If some “fairness” is desired in the sense that we want to be nice to jobs that has been waiting for long, then this option can be useful.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/StreamBuffersRateSpec.scala#L82 "Go to snippet source")jobs.buffer(1000, OverflowStrategy.dropTail)
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/StreamBuffersRateDocTest.java#L122 "Go to snippet source")jobs.buffer(1000, OverflowStrategy.dropTail());
```

Instead of dropping the youngest element from the tail of the buffer a new element can be dropped without enqueueing it to the buffer at all.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/StreamBuffersRateSpec.scala#L86 "Go to snippet source")jobs.buffer(1000, OverflowStrategy.dropNew)
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/StreamBuffersRateDocTest.java#L126 "Go to snippet source")jobs.buffer(1000, OverflowStrategy.dropNew());
```

Here is another example with a queue of 1000 jobs, but it makes space for the new element by dropping one element from the *head* of the buffer. This is the *oldest* waiting job. This is the preferred strategy if jobs are expected to be resent if not processed in a certain period. The oldest element will be retransmitted soon, (in fact a retransmitted duplicate might be already in the queue!) so it makes sense to drop it first.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/StreamBuffersRateSpec.scala#L90 "Go to snippet source")jobs.buffer(1000, OverflowStrategy.dropHead)
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/StreamBuffersRateDocTest.java#L130 "Go to snippet source")jobs.buffer(1000, OverflowStrategy.dropHead());
```

Compared to the dropping strategies above, dropBuffer drops all the 1000 jobs it has enqueued once the buffer gets full. This aggressive strategy is useful when dropping jobs is preferred to delaying jobs.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/StreamBuffersRateSpec.scala#L94 "Go to snippet source")jobs.buffer(1000, OverflowStrategy.dropBuffer)
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/StreamBuffersRateDocTest.java#L134 "Go to snippet source")jobs.buffer(1000, OverflowStrategy.dropBuffer());
```

If our imaginary external job provider is a client using our API, we might want to enforce that the client cannot have more than 1000 queued jobs otherwise we consider it flooding and terminate the connection. This is achievable by the error strategy which fails the stream once the buffer gets full.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/StreamBuffersRateSpec.scala#L98 "Go to snippet source")jobs.buffer(1000, OverflowStrategy.fail)
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/StreamBuffersRateDocTest.java#L138 "Go to snippet source")jobs.buffer(1000, OverflowStrategy.fail());
```

## Rate transformation

### Understanding conflate

When a fast producer can not be informed to slow down by backpressure or some other signal, `conflate` might be useful to combine elements from a producer until a demand signal comes from a consumer.

Below is an example snippet that summarizes fast stream of elements to a standard deviation, mean and count of elements that have arrived while the stats have been calculated.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/RateTransformationDocSpec.scala#L23-L28 "Go to snippet source")val statsFlow = Flow[Double].conflateWithSeed(immutable.Seq(_))(_ :+ _).map { s =>
  val μ = s.sum / s.size
  val se = s.map(x => pow(x - μ, 2))
  val σ = sqrt(se.sum / se.size)
  (σ, μ, s.size)
}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/RateTransformationDocTest.java#L59-L73 "Go to snippet source")final Flow<Double, Tuple3<Double, Double, Integer>, NotUsed> statsFlow =
    Flow.of(Double.class)
        .conflateWithSeed(
            elem -> Collections.singletonList(elem),
            (acc, elem) -> {
              return Stream.concat(acc.stream(), Collections.singletonList(elem).stream())
                  .collect(Collectors.toList());
            })
        .map(
            s -> {
              final Double mean = s.stream().mapToDouble(d -> d).sum() / s.size();
              final DoubleStream se = s.stream().mapToDouble(x -> Math.pow(x - mean, 2));
              final Double stdDev = Math.sqrt(se.sum() / s.size());
              return new Tuple3<>(stdDev, mean, s.size());
            });
```

This example demonstrates that such flow’s rate is decoupled. The element rate at the start of the flow can be much higher than the element rate at the end of the flow.

Another possible use of `conflate` is to not consider all elements for summary when the producer starts getting too fast. The example below demonstrates how `conflate` can be used to randomly drop elements when the consumer is not able to keep up with the producer.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/RateTransformationDocSpec.scala#L43-L49 "Go to snippet source")val p = 0.01
val sampleFlow = Flow[Double]
  .conflateWithSeed(immutable.Seq(_)) {
    case (acc, elem) if Random.nextDouble() < p => acc :+ elem
    case (acc, _)                               => acc
  }
  .mapConcat(identity)
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/RateTransformationDocTest.java#L89-L101 "Go to snippet source")final Double p = 0.01;
final Flow<Double, Double, NotUsed> sampleFlow =
    Flow.of(Double.class)
        .conflateWithSeed(
            elem -> Collections.singletonList(elem),
            (acc, elem) -> {
              if (r.nextDouble() < p) {
                return Stream.concat(acc.stream(), Collections.singletonList(elem).stream())
                    .collect(Collectors.toList());
              }
              return acc;
            })
        .mapConcat(d -> d);
```

See also [`conflate`](operators/Source-or-Flow/conflate.html) and [conflateWithSeed\`](operators/Source-or-Flow/conflateWithSeed.html) for more information and examples.

### Understanding extrapolate and expand

Now we will discuss two operators, `extrapolate` and `expand`, helping to deal with slow producers that are unable to keep up with the demand coming from consumers. They allow for additional values to be sent as elements to a consumer.

As a simple use case of `extrapolate`, here is a flow that repeats the last emitted element to a consumer, whenever the consumer signals demand and the producer cannot supply new elements yet.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/RateTransformationDocSpec.scala#L59 "Go to snippet source")val lastFlow = Flow[Double].extrapolate(Iterator.continually(_))
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/RateTransformationDocTest.java#L115-L116 "Go to snippet source")final Flow<Double, Double, NotUsed> lastFlow =
    Flow.of(Double.class).extrapolate(in -> Stream.iterate(in, i -> i).iterator());
```

For situations where there may be downstream demand before any element is emitted from upstream, you can use the `initial` parameter of `extrapolate` to “seed” the stream.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/RateTransformationDocSpec.scala#L72-L73 "Go to snippet source")val initial = 2.0
val seedFlow = Flow[Double].extrapolate(Iterator.continually(_), Some(initial))
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/RateTransformationDocTest.java#L137-L139 "Go to snippet source")Double initial = 2.0;
final Flow<Double, Double, NotUsed> lastFlow =
    Flow.of(Double.class).extrapolate(in -> Stream.iterate(in, i -> i).iterator(), initial);
```

`extrapolate` and `expand` also allow to produce meta\-information based on demand signalled from the downstream. Leveraging this, here is a flow that tracks and reports a drift between a fast consumer and a slow producer. 

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/RateTransformationDocSpec.scala#L86 "Go to snippet source")val driftFlow = Flow[Double].map(_ -> 0).extrapolate[(Double, Int)] { case (i, _) => Iterator.from(1).map(i -> _) }
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/RateTransformationDocTest.java#L158-L162 "Go to snippet source")final Flow<Double, Pair<Double, Integer>, NotUsed> driftFlow =
    Flow.of(Double.class)
        .map(d -> new Pair<>(d, 0))
        .extrapolate(
            d -> Stream.iterate(1, i -> i + 1).map(i -> new Pair<>(d.first(), i)).iterator());
```

And here’s a more concise representation with `expand`.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/RateTransformationDocSpec.scala#L110 "Go to snippet source")val driftFlow = Flow[Double].expand(i => Iterator.from(0).map(i -> _))
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/RateTransformationDocTest.java#L205-L207 "Go to snippet source")final Flow<Double, Pair<Double, Integer>, NotUsed> driftFlow =
    Flow.of(Double.class)
        .expand(d -> Stream.iterate(0, i -> i + 1).map(i -> new Pair<>(d, i)).iterator());
```

The difference is due to the different handling of the `Iterator`\-generating argument.

While `extrapolate` uses an `Iterator` only when there is unmet downstream demand, `expand` *always* creates an `Iterator` and emits elements downstream from it.

This makes `expand` able to transform or even filter out (by providing an empty `Iterator`) the “original” elements.

Regardless, since we provide a non\-empty `Iterator` in both examples, this means that the output of this flow is going to report a drift of zero if the producer is fast enough \- or a larger drift otherwise.

See also [`extrapolate`](operators/Source-or-Flow/extrapolate.html) and [`expand`](operators/Source-or-Flow/expand.html) for more information and examples.

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

### Example 4: Buffers for asynchronous operators

```scala
Source(1 to 3)
  .map { i =>
    println(s"A: $i"); i
  }
  .async
  .map { i =>
    println(s"B: $i"); i
  }
  .async
  .map { i =>
    println(s"C: $i"); i
  }
  .async
  .runWith(Sink.ignore)
```

### Example 5: Buffers for asynchronous operators

```java
Source.from(Arrays.asList(1, 2, 3))
    .map(
        i -> {
          System.out.println("A: " + i);
          return i;
        })
    .async()
    .map(
        i -> {
          System.out.println("B: " + i);
          return i;
        })
    .async()
    .map(
        i -> {
          System.out.println("C: " + i);
          return i;
        })
    .async()
    .runWith(Sink.ignore(), system);
```

### Example 6: Buffers for asynchronous operators

```text
A: 1
A: 2
B: 1
A: 3
B: 2
C: 1
B: 3
C: 2
C: 3
```

### Example 7: Internal buffers and their effect

```text
akka.stream.materializer.max-input-buffer-size = 16
```

### Example 8: Internal buffers and their effect

```scala
val section = Flow[Int].map(_ * 2).async.addAttributes(Attributes.inputBuffer(initial = 1, max = 1)) // the buffer size of this map is 1
val flow = section.via(Flow[Int].map(_ / 2)).async // the buffer size of this map is the default
val runnableGraph =
  Source(1 to 10).via(flow).to(Sink.foreach(elem => println(elem)))

val withOverriddenDefaults = runnableGraph.withAttributes(Attributes.inputBuffer(initial = 64, max = 64))
```

### Example 9: Internal buffers and their effect

```java
final Flow<Integer, Integer, NotUsed> flow1 =
    Flow.of(Integer.class)
        .map(elem -> elem * 2)
        .async()
        .addAttributes(Attributes.inputBuffer(1, 1)); // the buffer size of this map is 1
final Flow<Integer, Integer, NotUsed> flow2 =
    flow1
        .via(Flow.of(Integer.class).map(elem -> elem / 2))
        .async(); // the buffer size of this map is the value from the surrounding graph it is
// used in
final RunnableGraph<NotUsed> runnableGraph =
    Source.range(1, 10).via(flow1).to(Sink.foreach(elem -> System.out.println(elem)));

final RunnableGraph<NotUsed> withOverridenDefaults =
    runnableGraph.withAttributes(Attributes.inputBuffer(64, 64));
```

### Example 10: Internal buffers and their effect

```scala
import scala.concurrent.duration._
case class Tick()

RunnableGraph.fromGraph(GraphDSL.create() { implicit b =>
  import GraphDSL.Implicits._

  // this is the asynchronous stage in this graph
  val zipper = b.add(ZipWith[Tick, Int, Int]((tick, count) => count).async)

  Source.tick(initialDelay = 3.second, interval = 3.second, Tick()) ~> zipper.in0

  Source
    .tick(initialDelay = 1.second, interval = 1.second, "message!")
    .conflateWithSeed(seed = (_) => 1)((count, _) => count + 1) ~> zipper.in1

  zipper.out ~> Sink.foreach(println)
  ClosedShape
})
```

### Example 11: Internal buffers and their effect

```java
final Duration oneSecond = Duration.ofSeconds(1);
final Source<String, Cancellable> msgSource = Source.tick(oneSecond, oneSecond, "message!");
final Source<String, Cancellable> tickSource =
    Source.tick(oneSecond.multipliedBy(3), oneSecond.multipliedBy(3), "tick");
final Flow<String, Integer, NotUsed> conflate =
    Flow.of(String.class).conflateWithSeed(first -> 1, (count, elem) -> count + 1);

RunnableGraph.fromGraph(
        GraphDSL.create(
            b -> {
              // this is the asynchronous stage in this graph
              final FanInShape2<String, Integer, Integer> zipper =
                  b.add(ZipWith.create((String tick, Integer count) -> count).async());
              b.from(b.add(msgSource)).via(b.add(conflate)).toInlet(zipper.in1());
              b.from(b.add(tickSource)).toInlet(zipper.in0());
              b.from(zipper.out()).to(b.add(Sink.foreach(elem -> System.out.println(elem))));
              return ClosedShape.getInstance();
            }))
    .run(system);
```

### Example 12: Buffers in Akka Streams

```scala
// Getting a stream of jobs from an imaginary external system as a Source
val jobs: Source[Job, NotUsed] = inboundJobsConnector()
jobs.buffer(1000, OverflowStrategy.backpressure)
```

### Example 13: Buffers in Akka Streams

```java
// Getting a stream of jobs from an imaginary external system as a Source
final Source<Job, NotUsed> jobs = inboundJobsConnector;
jobs.buffer(1000, OverflowStrategy.backpressure());
```

### Example 14: Buffers in Akka Streams

```scala
jobs.buffer(1000, OverflowStrategy.dropTail)
```

### Example 15: Buffers in Akka Streams

```java
jobs.buffer(1000, OverflowStrategy.dropTail());
```

### Example 16: Buffers in Akka Streams

```scala
jobs.buffer(1000, OverflowStrategy.dropNew)
```

### Example 17: Buffers in Akka Streams

```java
jobs.buffer(1000, OverflowStrategy.dropNew());
```

### Example 18: Buffers in Akka Streams

```scala
jobs.buffer(1000, OverflowStrategy.dropHead)
```

### Example 19: Buffers in Akka Streams

```java
jobs.buffer(1000, OverflowStrategy.dropHead());
```

### Example 20: Buffers in Akka Streams

```scala
jobs.buffer(1000, OverflowStrategy.dropBuffer)
```

### Example 21: Buffers in Akka Streams

```java
jobs.buffer(1000, OverflowStrategy.dropBuffer());
```

### Example 22: Buffers in Akka Streams

```scala
jobs.buffer(1000, OverflowStrategy.fail)
```

### Example 23: Buffers in Akka Streams

```java
jobs.buffer(1000, OverflowStrategy.fail());
```

### Example 24: Understanding conflate

```scala
val statsFlow = Flow[Double].conflateWithSeed(immutable.Seq(_))(_ :+ _).map { s =>
  val μ = s.sum / s.size
  val se = s.map(x => pow(x - μ, 2))
  val σ = sqrt(se.sum / se.size)
  (σ, μ, s.size)
}
```

### Example 25: Understanding conflate

```java
final Flow<Double, Tuple3<Double, Double, Integer>, NotUsed> statsFlow =
    Flow.of(Double.class)
        .conflateWithSeed(
            elem -> Collections.singletonList(elem),
            (acc, elem) -> {
              return Stream.concat(acc.stream(), Collections.singletonList(elem).stream())
                  .collect(Collectors.toList());
            })
        .map(
            s -> {
              final Double mean = s.stream().mapToDouble(d -> d).sum() / s.size();
              final DoubleStream se = s.stream().mapToDouble(x -> Math.pow(x - mean, 2));
              final Double stdDev = Math.sqrt(se.sum() / s.size());
              return new Tuple3<>(stdDev, mean, s.size());
            });
```

### Example 26: Understanding conflate

```scala
val p = 0.01
val sampleFlow = Flow[Double]
  .conflateWithSeed(immutable.Seq(_)) {
    case (acc, elem) if Random.nextDouble() < p => acc :+ elem
    case (acc, _)                               => acc
  }
  .mapConcat(identity)
```

### Example 27: Understanding conflate

```java
final Double p = 0.01;
final Flow<Double, Double, NotUsed> sampleFlow =
    Flow.of(Double.class)
        .conflateWithSeed(
            elem -> Collections.singletonList(elem),
            (acc, elem) -> {
              if (r.nextDouble() < p) {
                return Stream.concat(acc.stream(), Collections.singletonList(elem).stream())
                    .collect(Collectors.toList());
              }
              return acc;
            })
        .mapConcat(d -> d);
```

### Example 28: Understanding extrapolate and expand

```scala
val lastFlow = Flow[Double].extrapolate(Iterator.continually(_))
```

### Example 29: Understanding extrapolate and expand

```java
final Flow<Double, Double, NotUsed> lastFlow =
    Flow.of(Double.class).extrapolate(in -> Stream.iterate(in, i -> i).iterator());
```

### Example 30: Understanding extrapolate and expand

```scala
val initial = 2.0
val seedFlow = Flow[Double].extrapolate(Iterator.continually(_), Some(initial))
```

### Example 31: Understanding extrapolate and expand

```java
Double initial = 2.0;
final Flow<Double, Double, NotUsed> lastFlow =
    Flow.of(Double.class).extrapolate(in -> Stream.iterate(in, i -> i).iterator(), initial);
```

### Example 32: Understanding extrapolate and expand

```scala
val driftFlow = Flow[Double].map(_ -> 0).extrapolate[(Double, Int)] { case (i, _) => Iterator.from(1).map(i -> _) }
```

### Example 33: Understanding extrapolate and expand

```java
final Flow<Double, Pair<Double, Integer>, NotUsed> driftFlow =
    Flow.of(Double.class)
        .map(d -> new Pair<>(d, 0))
        .extrapolate(
            d -> Stream.iterate(1, i -> i + 1).map(i -> new Pair<>(d.first(), i)).iterator());
```

### Example 34: Understanding extrapolate and expand

```scala
val driftFlow = Flow[Double].expand(i => Iterator.from(0).map(i -> _))
```

### Example 35: Understanding extrapolate and expand

```java
final Flow<Double, Pair<Double, Integer>, NotUsed> driftFlow =
    Flow.of(Double.class)
        .expand(d -> Stream.iterate(0, i -> i + 1).map(i -> new Pair<>(d, i)).iterator());
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/stream/Graph.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/ZipWith$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/Graph.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/ZipWith$.html
- https://doc.akka.io/libraries/akka-core/2.10/stream/operators/Source-or-Flow/conflate.html
- https://doc.akka.io/libraries/akka-core/2.10/stream/operators/Source-or-Flow/conflateWithSeed.html
- https://doc.akka.io/libraries/akka-core/2.10/stream/operators/Source-or-Flow/expand.html
- https://doc.akka.io/libraries/akka-core/2.10/stream/operators/Source-or-Flow/extrapolate.html
- https://doc.akka.io/libraries/akka-core/2.10/stream/stream-composition.html
- https://doc.akka.io/libraries/akka-core/2.10/stream/stream-context.html

---
*Source: [https://doc.akka.io/libraries/akka-core/2.10/stream/stream-rate.html](https://doc.akka.io/libraries/akka-core/2.10/stream/stream-rate.html)*