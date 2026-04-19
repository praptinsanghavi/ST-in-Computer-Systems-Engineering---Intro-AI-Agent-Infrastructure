---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:27:04Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/Sink/seq.html
title: Sink.seq • Akka core
---

# Sink.seq • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Sink.seq

Collect values emitted from the stream into a collection.

[Sink operators](../index.html#sink-operators)

## Signature

[`Sink.seq`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Sink.html#seq() "akka.stream.javadsl.Sink")[`Sink.seq`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Sink$.html#seq[T]:akka.stream.scaladsl.Sink[T,scala.concurrent.Future[scala.collection.immutable.Seq[T]]] "akka.stream.scaladsl.Sink")

## Description

Collect values emitted from the stream into a collection, the collection is available through a `Future` `CompletionStage` or which completes when the stream completes. Note that the collection is bounded to `Int.MaxValue` `Integer.MAX_VALUE`, if more element are emitted the sink will cancel the stream

## Example

Given a stream of numbers we can collect the numbers into a collection with the `seq` operator

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-stream-tests/src/test/scala/akka/stream/scaladsl/SinkSpec.scala#L286-L293 "Go to snippet source")val source = Source(1 to 3)
val result = source.runWith(Sink.seq[Int])
val seq = result.futureValue
seq.foreach(println)
// will print
// 1
// 2
// 3
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/operators/SinkDocExamples.java#L37-L42 "Go to snippet source")Source<Integer, NotUsed> ints = Source.from(Arrays.asList(1, 2, 3));
CompletionStage<List<Integer>> result = ints.runWith(Sink.seq(), system);
result.thenAccept(list -> list.forEach(System.out::println));
// 1
// 2
// 3
```

## Reactive Streams semantics

**cancels** If too many values are collected

## Code Examples

### Example 1: Example

```scala
val source = Source(1 to 3)
val result = source.runWith(Sink.seq[Int])
val seq = result.futureValue
seq.foreach(println)
// will print
// 1
// 2
// 3
```

### Example 2: Example

```java
Source<Integer, NotUsed> ints = Source.from(Arrays.asList(1, 2, 3));
CompletionStage<List<Integer>> result = ints.runWith(Sink.seq(), system);
result.thenAccept(list -> list.forEach(System.out::println));
// 1
// 2
// 3
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Sink$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Sink.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/scanAsync.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/setup.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/Sink/seq.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/Sink/seq.html)*