---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:27:47Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/MergeSequence.html
title: MergeSequence • Akka core
---

# MergeSequence • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# MergeSequence

Merge a linear sequence partitioned across multiple sources.

[Fan\-in operators](index.html#fan-in-operators)

## Signature

[`MergeSequence`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/MergeSequence.html "akka.stream.javadsl.MergeSequence")[`MergeSequence`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/MergeSequence.html "akka.stream.scaladsl.MergeSequence")

## Description

Merge a linear sequence partitioned across multiple sources. Each element from upstream must have a defined index, starting from 0\. There must be no gaps in the sequence, nor may there be any duplicates. Each upstream source must be ordered by the sequence.

## Example

`MergeSequence` is most useful when used in combination with `Partition`, to merge the partitioned stream back into a single stream, while maintaining the order of the original elements. `zipWithIndex` can be used before partitioning the stream to generate the index.

The example below shows partitioning a stream of messages into one stream for elements that must be processed by a given processing flow, and another stream for elements for which no processing will be done, and then merges them back together so that the messages can be acknowledged in order.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/operators/MergeSequenceDocExample.scala#L14-L43 "Go to snippet source")import akka.NotUsed
import akka.stream.ClosedShape
import akka.stream.scaladsl.{ Flow, GraphDSL, MergeSequence, Partition, RunnableGraph, Sink, Source }

val subscription: Source[Message, NotUsed] = createSubscription()
val messageProcessor: Flow[(Message, Long), (Message, Long), NotUsed] =
  createMessageProcessor()
val messageAcknowledger: Sink[Message, NotUsed] = createMessageAcknowledger()

RunnableGraph
  .fromGraph(GraphDSL.create() { implicit builder =>
    import GraphDSL.Implicits._
    // Partitions stream into messages that should or should not be processed
    val partition = builder.add(Partition[(Message, Long)](2, {
      case (message, _) if shouldProcess(message) => 0
      case _                                      => 1
    }))
    // Merges stream by the index produced by zipWithIndex
    val merge = builder.add(MergeSequence[(Message, Long)](2)(_._2))

    subscription.zipWithIndex ~> partition.in
    // First goes through message processor
    partition.out(0) ~> messageProcessor ~> merge
    // Second partition bypasses message processor
    partition.out(1) ~> merge
    merge.out.map(_._1) ~> messageAcknowledger
    ClosedShape
  })
  .run()

```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/operators/MergeSequenceDocExample.java#L10-L21 "Go to snippet source")import akka.NotUsed;
import akka.japi.Pair;
import akka.stream.ClosedShape;
import akka.stream.UniformFanInShape;
import akka.stream.UniformFanOutShape;
import akka.stream.javadsl.Flow;
import akka.stream.javadsl.GraphDSL;
import akka.stream.javadsl.MergeSequence;
import akka.stream.javadsl.Partition;
import akka.stream.javadsl.RunnableGraph;
import akka.stream.javadsl.Sink;
import akka.stream.javadsl.Source;

Source<Message, NotUsed> subscription = createSubscription();
Flow<Pair<Message, Long>, Pair<Message, Long>, NotUsed> messageProcessor =
    createMessageProcessor();
Sink<Message, NotUsed> messageAcknowledger = createMessageAcknowledger();

RunnableGraph.fromGraph(
        GraphDSL.create(
            builder -> {
              // Partitions stream into messages that should or should not be processed
              UniformFanOutShape<Pair<Message, Long>, Pair<Message, Long>> partition =
                  builder.add(
                      Partition.create(2, element -> shouldProcess(element.first()) ? 0 : 1));
              // Merges stream by the index produced by zipWithIndex
              UniformFanInShape<Pair<Message, Long>, Pair<Message, Long>> merge =
                  builder.add(MergeSequence.create(2, Pair::second));

              builder.from(builder.add(subscription.zipWithIndex())).viaFanOut(partition);
              // First goes through message processor
              builder.from(partition.out(0)).via(builder.add(messageProcessor)).viaFanIn(merge);
              // Second partition bypasses message processor
              builder.from(partition.out(1)).viaFanIn(merge);

              // Unwrap message index pairs and send to acknowledger
              builder
                  .from(merge.out())
                  .to(
                      builder.add(
                          Flow.<Pair<Message, Long>>create()
                              .map(Pair::first)
                              .to(messageAcknowledger)));

              return ClosedShape.getInstance();
            }))
    .run(system);

```

## Reactive Streams semantics

**emits** when one of the upstreams has the next expected element in the sequence available.

**backpressures** when downstream backpressures

**completes** when all upstreams complete

**cancels** downstream cancels

## Code Examples

### Example 1: Example

```scala
import akka.NotUsed
import akka.stream.ClosedShape
import akka.stream.scaladsl.{ Flow, GraphDSL, MergeSequence, Partition, RunnableGraph, Sink, Source }

val subscription: Source[Message, NotUsed] = createSubscription()
val messageProcessor: Flow[(Message, Long), (Message, Long), NotUsed] =
  createMessageProcessor()
val messageAcknowledger: Sink[Message, NotUsed] = createMessageAcknowledger()

RunnableGraph
  .fromGraph(GraphDSL.create() { implicit builder =>
    import GraphDSL.Implicits._
    // Partitions stream into messages that should or should not be processed
    val partition = builder.add(Partition[(Message, Long)](2, {
      case (message, _) if shouldProcess(message) => 0
      case _                                      => 1
    }))
    // Merges stream by the index produced by zipWithIndex
    val merge = builder.add(MergeSequence[(Message, Long)](2)(_._2))

    subscription.zipWithIndex ~> partition.in
    // First goes through message processor
    partition.out(0) ~> messageProcessor ~> merge
    // Second partition bypasses message processor
    partition.out(1) ~> merge
    merge.out.map(_._1) ~> messageAcknowledger
    ClosedShape
  })
  .run()
```

### Example 2: Example

```java
import akka.NotUsed;
import akka.japi.Pair;
import akka.stream.ClosedShape;
import akka.stream.UniformFanInShape;
import akka.stream.UniformFanOutShape;
import akka.stream.javadsl.Flow;
import akka.stream.javadsl.GraphDSL;
import akka.stream.javadsl.MergeSequence;
import akka.stream.javadsl.Partition;
import akka.stream.javadsl.RunnableGraph;
import akka.stream.javadsl.Sink;
import akka.stream.javadsl.Source;

Source<Message, NotUsed> subscription = createSubscription();
Flow<Pair<Message, Long>, Pair<Message, Long>, NotUsed> messageProcessor =
    createMessageProcessor();
Sink<Message, NotUsed> messageAcknowledger = createMessageAcknowledger();

RunnableGraph.fromGraph(
        GraphDSL.create(
            builder -> {
              // Partitions stream into messages that should or should not be processed
              UniformFanOutShape<Pair<Message, Long>, Pair<Message, Long>> partition =
                  builder.add(
                      Partition.create(2, element -> shouldProcess(element.first()) ? 0 : 1));
              // Merges stream by the index produced by zipWithIndex
              UniformFanInShape<Pair<Message, Long>, Pair<Message, Long>> merge =
                  builder.add(MergeSequence.create(2, Pair::second));

              builder.from(builder.add(subscription.zipWithIndex())).viaFanOut(partition);
              // First goes through message processor
              builder.from(partition.out(0)).via(builder.add(messageProcessor)).viaFanIn(merge);
              // Second partition bypasses message processor
              builder.from(partition.out(1)).viaFanIn(merge);

              // Unwrap message index pairs and send to acknowledger
              builder
                  .from(merge.out())
                  .to(
                      builder.add(
                          Flow.<Pair<Message, Long>>create()
                              .map(Pair::first)
                              .to(messageAcknowledger)));

              return ClosedShape.getInstance();
            }))
    .run(system);
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/MergeSequence.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/MergeSequence.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/mergeSorted.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/mergePrioritizedN.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/MergeSequence.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/MergeSequence.html)*