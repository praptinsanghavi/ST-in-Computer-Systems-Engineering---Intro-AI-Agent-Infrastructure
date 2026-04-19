---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:27:43Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/groupBy.html
title: groupBy • Akka core
---

# groupBy • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# groupBy

Demultiplex the incoming stream into separate output streams.

[Nesting and flattening operators](../index.html#nesting-and-flattening-operators)

## Signature

[`Source.groupBy`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html#groupBy(int,akka.japi.function.Function,boolean) "akka.stream.javadsl.Source")[`Source.groupBy`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html#groupBy[K](maxSubstreams:Int,f:Out=>K):akka.stream.scaladsl.SubFlow[Out,Mat,FlowOps.this.Repr,FlowOps.this.Closed] "akka.stream.scaladsl.Source") [`Flow.groupBy`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html#groupBy(int,akka.japi.function.Function,boolean) "akka.stream.javadsl.Flow")[`Flow.groupBy`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html#groupBy[K](maxSubstreams:Int,f:Out=>K):akka.stream.scaladsl.SubFlow[Out,Mat,FlowOps.this.Repr,FlowOps.this.Closed] "akka.stream.scaladsl.Flow")

## Description

This operation demultiplexes the incoming stream into separate output streams, one for each element key. The key is computed for each element using the given function. When a new key is encountered for the first time a new substream is opened and subsequently fed with all elements belonging to that key.

Note: If `allowClosedSubstreamRecreation` is set to `true` substream completion and incoming elements are subject to race\-conditions. If elements arrive for a stream that is in the process of closing these elements might get lost.

Warning
If `allowClosedSubstreamRecreation` is set to `false` (default behavior) the operators keeps track of all keys of streams that have already been closed. If you expect an infinite number of keys this can cause memory issues. Elements belonging to those keys are drained directly and not send to the substream.

## Example

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/operators/sourceorflow/GroupBy.scala#L16-L22 "Go to snippet source")Source(1 to 10)
  .groupBy(maxSubstreams = 2, _ % 2) // create two sub-streams with odd and even numbers
  .reduce(_ + _) // for each sub-stream, sum its elements
  .mergeSubstreams // merge back into a stream
  .runForeach(println)
//30
//25
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/operators/SourceOrFlow.java#L605-L611 "Go to snippet source")Source.range(1, 10)
    .groupBy(2, i -> i % 2 == 0) // create two sub-streams with odd and even numbers
    .reduce(Integer::sum) // for each sub-stream, sum its elements
    .mergeSubstreams() // merge back into a stream
    .runForeach(System.out::println, system);
// 25
// 30
```

Note: groupBy operator is used to partition the stream based on an identifier which is not same as using async boundary in the stream which is used for running the same stream concurrently. If a stream can be exclusively partitioned, it can be executed efficiently, by maximizing the parallel processing using groupBy operator.

Example with async boundary that introduces running concurrently :

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/operators/sourceorflow/GroupBy.scala#L29-L35 "Go to snippet source")Source(1 to 10)
  .groupBy(maxSubstreams = 2, _ % 2) // create two sub-streams with odd and even numbers
  .via(Flow[Int].map(_ => 1).reduce(_ + _).async) // for each sub-stream, sum its elements
  .mergeSubstreams // merge back into a stream
  .runForeach(println)
//30
//25
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/operators/SourceOrFlow.java#L617-L623 "Go to snippet source")Source.range(1, 10)
        .groupBy(2, i -> i % 2 == 0) // create two sub-streams with odd and even numbers
        .via(Flow.of(Integer.class).map(elem-> 1).reduce(Integer::sum).async()) // for each sub-stream, sum its elements
        .mergeSubstreams() // merge back into a stream
        .runForeach(System.out::println, system);
// 25
// 30
```

## Reactive Streams semantics

**emits** an element for which the grouping function returns a group that has not yet been created. Emits the new group there is an element pending for a group whose substream backpressures

**completes** when upstream completes (Until the end of stream it is not possible to know whether new substreams will be needed or not)

## Code Examples

### Example 1: Example

```scala
Source(1 to 10)
  .groupBy(maxSubstreams = 2, _ % 2) // create two sub-streams with odd and even numbers
  .reduce(_ + _) // for each sub-stream, sum its elements
  .mergeSubstreams // merge back into a stream
  .runForeach(println)
//30
//25
```

### Example 2: Example

```java
Source.range(1, 10)
    .groupBy(2, i -> i % 2 == 0) // create two sub-streams with odd and even numbers
    .reduce(Integer::sum) // for each sub-stream, sum its elements
    .mergeSubstreams() // merge back into a stream
    .runForeach(System.out::println, system);
// 25
// 30
```

### Example 3: Example

```scala
Source(1 to 10)
  .groupBy(maxSubstreams = 2, _ % 2) // create two sub-streams with odd and even numbers
  .via(Flow[Int].map(_ => 1).reduce(_ + _).async) // for each sub-stream, sum its elements
  .mergeSubstreams // merge back into a stream
  .runForeach(println)
//30
//25
```

### Example 4: Example

```java
Source.range(1, 10)
        .groupBy(2, i -> i % 2 == 0) // create two sub-streams with odd and even numbers
        .via(Flow.of(Integer.class).map(elem-> 1).reduce(Integer::sum).async()) // for each sub-stream, sum its elements
        .mergeSubstreams() // merge back into a stream
        .runForeach(System.out::println, system);
// 25
// 30
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/grouped.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/futureSource.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/groupBy.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/groupBy.html)*