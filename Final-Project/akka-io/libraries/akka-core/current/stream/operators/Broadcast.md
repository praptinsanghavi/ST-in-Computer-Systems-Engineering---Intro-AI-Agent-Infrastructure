---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:27:57Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/Broadcast.html
title: Broadcast • Akka core
---

# Broadcast • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Broadcast

Emit each incoming element each of `n` outputs.

[Fan\-out operators](index.html#fan-out-operators)

## Signature

[`Broadcast`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Broadcast.html "akka.stream.javadsl.Broadcast")[`Broadcast`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Broadcast.html "akka.stream.scaladsl.Broadcast")

## Description

Emit each incoming element each of `n` outputs.

## Example

Here is an example that is using `Broadcast` to aggregate different values from a `Source` of integers.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/operators/BroadcastDocExample.scala#L20-L46 "Go to snippet source")import akka.NotUsed
import akka.stream.ClosedShape
import akka.stream.scaladsl.GraphDSL
import akka.stream.scaladsl.RunnableGraph
import akka.stream.scaladsl.Sink
import akka.stream.scaladsl.Source

val source: Source[Int, NotUsed] =
  Source.fromIterator(() => Iterator.continually(ThreadLocalRandom.current().nextInt(100))).take(100)

val countSink: Sink[Int, Future[Int]] = Sink.fold(0)((acc, elem) => acc + 1)
val minSink: Sink[Int, Future[Int]] = Sink.fold(0)((acc, elem) => math.min(acc, elem))
val maxSink: Sink[Int, Future[Int]] = Sink.fold(0)((acc, elem) => math.max(acc, elem))

val (count: Future[Int], min: Future[Int], max: Future[Int]) =
  RunnableGraph
    .fromGraph(GraphDSL.createGraph(countSink, minSink, maxSink)(Tuple3.apply) {
      implicit builder => (countS, minS, maxS) =>
        import GraphDSL.Implicits._
        val broadcast = builder.add(Broadcast[Int](3))
        source ~> broadcast
        broadcast.out(0) ~> countS
        broadcast.out(1) ~> minS
        broadcast.out(2) ~> maxS
        ClosedShape
    })
    .run()
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/operators/BroadcastDocExample.java#L10-L21 "Go to snippet source")import akka.NotUsed;
import akka.japi.tuple.Tuple3;
import akka.stream.ClosedShape;
import akka.stream.UniformFanOutShape;
import akka.stream.javadsl.Broadcast;
import akka.stream.javadsl.Flow;
import akka.stream.javadsl.GraphDSL;
import akka.stream.javadsl.Keep;
import akka.stream.javadsl.RunnableGraph;
import akka.stream.javadsl.Sink;
import akka.stream.javadsl.Source;
import java.util.concurrent.CompletionStage;

Source<Integer, NotUsed> source = Source.range(1, 10);

Sink<Integer, CompletionStage<Integer>> countSink =
    Flow.of(Integer.class).toMat(Sink.fold(0, (acc, elem) -> acc + 1), Keep.right());
Sink<Integer, CompletionStage<Integer>> minSink =
    Flow.of(Integer.class).toMat(Sink.fold(0, Math::min), Keep.right());
Sink<Integer, CompletionStage<Integer>> maxSink =
    Flow.of(Integer.class).toMat(Sink.fold(0, Math::max), Keep.right());

final Tuple3<CompletionStage<Integer>, CompletionStage<Integer>, CompletionStage<Integer>>
    result =
        RunnableGraph.fromGraph(
                GraphDSL.create3(
                    countSink,
                    minSink,
                    maxSink,
                    Tuple3::create,
                    (builder, countS, minS, maxS) -> {
                      final UniformFanOutShape<Integer, Integer> broadcast =
                          builder.add(Broadcast.create(3));
                      builder.from(builder.add(source)).viaFanOut(broadcast);
                      builder.from(broadcast.out(0)).to(countS);
                      builder.from(broadcast.out(1)).to(minS);
                      builder.from(broadcast.out(2)).to(maxS);
                      return ClosedShape.getInstance();
                    }))
            .run(system);

```

Note that asynchronous boundary for the output streams must be added explicitly if it’s desired to run them in parallel.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/operators/BroadcastDocExample.scala#L50-L59 "Go to snippet source")RunnableGraph.fromGraph(GraphDSL.createGraph(countSink.async, minSink.async, maxSink.async)(Tuple3.apply) {
  implicit builder => (countS, minS, maxS) =>
    import GraphDSL.Implicits._
    val broadcast = builder.add(Broadcast[Int](3))
    source ~> broadcast
    broadcast.out(0) ~> countS
    broadcast.out(1) ~> minS
    broadcast.out(2) ~> maxS
    ClosedShape
})
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/operators/BroadcastDocExample.java#L63-L78 "Go to snippet source")RunnableGraph.fromGraph(
    GraphDSL.create3(
        countSink.async(),
        minSink.async(),
        maxSink.async(),
        Tuple3::create,
        (builder, countS, minS, maxS) -> {
          final UniformFanOutShape<Integer, Integer> broadcast =
              builder.add(Broadcast.create(3));
          builder.from(builder.add(source)).viaFanOut(broadcast);

          builder.from(broadcast.out(0)).to(countS);
          builder.from(broadcast.out(1)).to(minS);
          builder.from(broadcast.out(2)).to(maxS);
          return ClosedShape.getInstance();
        }));
```

## Reactive Streams semantics

**emits** when all of the outputs stops backpressuring and there is an input element available

**backpressures** when any of the outputs backpressures

**completes** when upstream completes

**cancels** depends on the `eagerCancel` flag. If it is true, when any downstream cancels, if false, when all downstreams cancel.

## Code Examples

### Example 1: Example

```scala
import akka.NotUsed
import akka.stream.ClosedShape
import akka.stream.scaladsl.GraphDSL
import akka.stream.scaladsl.RunnableGraph
import akka.stream.scaladsl.Sink
import akka.stream.scaladsl.Source

val source: Source[Int, NotUsed] =
  Source.fromIterator(() => Iterator.continually(ThreadLocalRandom.current().nextInt(100))).take(100)

val countSink: Sink[Int, Future[Int]] = Sink.fold(0)((acc, elem) => acc + 1)
val minSink: Sink[Int, Future[Int]] = Sink.fold(0)((acc, elem) => math.min(acc, elem))
val maxSink: Sink[Int, Future[Int]] = Sink.fold(0)((acc, elem) => math.max(acc, elem))

val (count: Future[Int], min: Future[Int], max: Future[Int]) =
  RunnableGraph
    .fromGraph(GraphDSL.createGraph(countSink, minSink, maxSink)(Tuple3.apply) {
      implicit builder => (countS, minS, maxS) =>
        import GraphDSL.Implicits._
        val broadcast = builder.add(Broadcast[Int](3))
        source ~> broadcast
        broadcast.out(0) ~> countS
        broadcast.out(1) ~> minS
        broadcast.out(2) ~> maxS
        ClosedShape
    })
    .run()
```

### Example 2: Example

```java
import akka.NotUsed;
import akka.japi.tuple.Tuple3;
import akka.stream.ClosedShape;
import akka.stream.UniformFanOutShape;
import akka.stream.javadsl.Broadcast;
import akka.stream.javadsl.Flow;
import akka.stream.javadsl.GraphDSL;
import akka.stream.javadsl.Keep;
import akka.stream.javadsl.RunnableGraph;
import akka.stream.javadsl.Sink;
import akka.stream.javadsl.Source;
import java.util.concurrent.CompletionStage;

Source<Integer, NotUsed> source = Source.range(1, 10);

Sink<Integer, CompletionStage<Integer>> countSink =
    Flow.of(Integer.class).toMat(Sink.fold(0, (acc, elem) -> acc + 1), Keep.right());
Sink<Integer, CompletionStage<Integer>> minSink =
    Flow.of(Integer.class).toMat(Sink.fold(0, Math::min), Keep.right());
Sink<Integer, CompletionStage<Integer>> maxSink =
    Flow.of(Integer.class).toMat(Sink.fold(0, Math::max), Keep.right());

final Tuple3<CompletionStage<Integer>, CompletionStage<Integer>, CompletionStage<Integer>>
    result =
        RunnableGraph.fromGraph(
                GraphDSL.create3(
                    countSink,
                    minSink,
                    maxSink,
                    Tuple3::create,
                    (builder, countS, minS, maxS) -> {
                      final UniformFanOutShape<Integer, Integer> broadcast =
                          builder.add(Broadcast.create(3));
                      builder.from(builder.add(source)).viaFanOut(broadcast);
                      builder.from(broadcast.out(0)).to(countS);
                      builder.from(broadcast.out(1)).to(minS);
                      builder.from(broadcast.out(2)).to(maxS);
                      return ClosedShape.getInstance();
                    }))
            .run(system);
```

### Example 3: Example

```scala
RunnableGraph.fromGraph(GraphDSL.createGraph(countSink.async, minSink.async, maxSink.async)(Tuple3.apply) {
  implicit builder => (countS, minS, maxS) =>
    import GraphDSL.Implicits._
    val broadcast = builder.add(Broadcast[Int](3))
    source ~> broadcast
    broadcast.out(0) ~> countS
    broadcast.out(1) ~> minS
    broadcast.out(2) ~> maxS
    ClosedShape
})
```

### Example 4: Example

```java
RunnableGraph.fromGraph(
    GraphDSL.create3(
        countSink.async(),
        minSink.async(),
        maxSink.async(),
        Tuple3::create,
        (builder, countS, minS, maxS) -> {
          final UniformFanOutShape<Integer, Integer> broadcast =
              builder.add(Broadcast.create(3));
          builder.from(builder.add(source)).viaFanOut(broadcast);

          builder.from(broadcast.out(0)).to(countS);
          builder.from(broadcast.out(1)).to(minS);
          builder.from(broadcast.out(2)).to(maxS);
          return ClosedShape.getInstance();
        }));
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Broadcast.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Broadcast.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/batchWeighted.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/buffer.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/Broadcast.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/Broadcast.html)*