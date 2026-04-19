---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:27:57Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/Partition.html
title: Partition • Akka core
---

# Partition • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Partition

Fan\-out the stream to several streams.

[Fan\-out operators](index.html#fan-out-operators)

## Signature

[`Partition`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Partition.html "akka.stream.javadsl.Partition")[`Partition`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Partition.html "akka.stream.scaladsl.Partition")

## Description

Fan\-out the stream to several streams. Each upstream element is emitted to one downstream consumer according to the partitioner function applied to the element.

## Example

Here is an example of using `Partition` to split a `Source` of integers to one `Sink` for the even numbers and another `Sink` for the odd numbers. 

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/operators/PartitionDocExample.scala#L14-L42 "Go to snippet source")import akka.NotUsed
import akka.stream.Attributes
import akka.stream.Attributes.LogLevels
import akka.stream.ClosedShape
import akka.stream.scaladsl.Flow
import akka.stream.scaladsl.GraphDSL
import akka.stream.scaladsl.Partition
import akka.stream.scaladsl.RunnableGraph
import akka.stream.scaladsl.Sink
import akka.stream.scaladsl.Source

val source: Source[Int, NotUsed] = Source(1 to 10)

val even: Sink[Int, NotUsed] =
  Flow[Int].log("even").withAttributes(Attributes.logLevels(onElement = LogLevels.Info)).to(Sink.ignore)
val odd: Sink[Int, NotUsed] =
  Flow[Int].log("odd").withAttributes(Attributes.logLevels(onElement = LogLevels.Info)).to(Sink.ignore)

RunnableGraph
  .fromGraph(GraphDSL.create() { implicit builder =>
    import GraphDSL.Implicits._
    val partition = builder.add(Partition[Int](2, element => if (element % 2 == 0) 0 else 1))
    source ~> partition.in
    partition.out(0) ~> even
    partition.out(1) ~> odd
    ClosedShape
  })
  .run()

```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/operators/PartitionDocExample.java#L10-L19 "Go to snippet source")import akka.NotUsed;
import akka.stream.Attributes;
import akka.stream.ClosedShape;
import akka.stream.UniformFanOutShape;
import akka.stream.javadsl.Flow;
import akka.stream.javadsl.GraphDSL;
import akka.stream.javadsl.Partition;
import akka.stream.javadsl.RunnableGraph;
import akka.stream.javadsl.Sink;
import akka.stream.javadsl.Source;

Source<Integer, NotUsed> source = Source.range(1, 10);

Sink<Integer, NotUsed> even =
    Flow.of(Integer.class)
        .log("even")
        .withAttributes(Attributes.createLogLevels(Attributes.logLevelInfo()))
        .to(Sink.ignore());
Sink<Integer, NotUsed> odd =
    Flow.of(Integer.class)
        .log("odd")
        .withAttributes(Attributes.createLogLevels(Attributes.logLevelInfo()))
        .to(Sink.ignore());

RunnableGraph.fromGraph(
        GraphDSL.create(
            builder -> {
              UniformFanOutShape<Integer, Integer> partition =
                  builder.add(
                      Partition.create(
                          Integer.class, 2, element -> (element % 2 == 0) ? 0 : 1));
              builder.from(builder.add(source)).viaFanOut(partition);
              builder.from(partition.out(0)).to(builder.add(even));
              builder.from(partition.out(1)).to(builder.add(odd));
              return ClosedShape.getInstance();
            }))
    .run(system);

```

## Reactive Streams semantics

**emits** when the chosen output stops backpressuring and there is an input element available

**backpressures** when the chosen output backpressures

**completes** when upstream completes and no output is pending

**cancels** depends on the `eagerCancel` flag. If it is true, when any downstream cancels, if false, when all downstreams cancel.

## Code Examples

### Example 1: Example

```scala
import akka.NotUsed
import akka.stream.Attributes
import akka.stream.Attributes.LogLevels
import akka.stream.ClosedShape
import akka.stream.scaladsl.Flow
import akka.stream.scaladsl.GraphDSL
import akka.stream.scaladsl.Partition
import akka.stream.scaladsl.RunnableGraph
import akka.stream.scaladsl.Sink
import akka.stream.scaladsl.Source

val source: Source[Int, NotUsed] = Source(1 to 10)

val even: Sink[Int, NotUsed] =
  Flow[Int].log("even").withAttributes(Attributes.logLevels(onElement = LogLevels.Info)).to(Sink.ignore)
val odd: Sink[Int, NotUsed] =
  Flow[Int].log("odd").withAttributes(Attributes.logLevels(onElement = LogLevels.Info)).to(Sink.ignore)

RunnableGraph
  .fromGraph(GraphDSL.create() { implicit builder =>
    import GraphDSL.Implicits._
    val partition = builder.add(Partition[Int](2, element => if (element % 2 == 0) 0 else 1))
    source ~> partition.in
    partition.out(0) ~> even
    partition.out(1) ~> odd
    ClosedShape
  })
  .run()
```

### Example 2: Example

```java
import akka.NotUsed;
import akka.stream.Attributes;
import akka.stream.ClosedShape;
import akka.stream.UniformFanOutShape;
import akka.stream.javadsl.Flow;
import akka.stream.javadsl.GraphDSL;
import akka.stream.javadsl.Partition;
import akka.stream.javadsl.RunnableGraph;
import akka.stream.javadsl.Sink;
import akka.stream.javadsl.Source;

Source<Integer, NotUsed> source = Source.range(1, 10);

Sink<Integer, NotUsed> even =
    Flow.of(Integer.class)
        .log("even")
        .withAttributes(Attributes.createLogLevels(Attributes.logLevelInfo()))
        .to(Sink.ignore());
Sink<Integer, NotUsed> odd =
    Flow.of(Integer.class)
        .log("odd")
        .withAttributes(Attributes.createLogLevels(Attributes.logLevelInfo()))
        .to(Sink.ignore());

RunnableGraph.fromGraph(
        GraphDSL.create(
            builder -> {
              UniformFanOutShape<Integer, Integer> partition =
                  builder.add(
                      Partition.create(
                          Integer.class, 2, element -> (element % 2 == 0) ? 0 : 1));
              builder.from(builder.add(source)).viaFanOut(partition);
              builder.from(partition.out(0)).to(builder.add(even));
              builder.from(partition.out(1)).to(builder.add(odd));
              return ClosedShape.getInstance();
            }))
    .run(system);
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Partition.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Partition.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/orElse.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/prefixAndTail.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/Partition.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/Partition.html)*