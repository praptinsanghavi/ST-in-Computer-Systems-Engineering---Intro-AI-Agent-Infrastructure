---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:27:03Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/Sink/collection.html
title: Sink.collection • Akka core
---

# Sink.collection • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Sink.collection

Collect all values emitted from the stream into a collection.Operator only available in the Scala API. The closest operator in the Java API is [`Sink.seq`](seq.html).

[Sink operators](../index.html#sink-operators)

## Signature

[`Sink.collection`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Sink.html "akka.stream.javadsl.Sink")[`Sink.collection`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Sink$.html#collection[T,That](implicitcbf:akka.util.ccompat.Factory[T,Thatwithscala.collection.immutable.Iterable[_]]):akka.stream.scaladsl.Sink[T,scala.concurrent.Future[That]] "akka.stream.scaladsl.Sink")

## Description

Collect values emitted from the stream into an arbitrary collection `That`. The resulting collection is available through a `Future[That]` or when the stream completes. Note that the collection boundaries are those defined in the `CanBuildFrom` associated with the chosen collection. See [The Architecture of Scala 2\.13’s Collections](https://docs.scala-lang.org/overviews/core/architecture-of-scala-213-collections.html) for more info. The [`seq`](seq.html) operator is a shorthand for `Sink.collection[T, Vector[T]]`.

## Example

This example reads the numbers from a source and stores them in the List collection.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/operators/sink/Collection.scala#L17-L20 "Go to snippet source")val source = Source(1 to 5)
val result: Future[List[Int]] = source.runWith(Sink.collection[Int, List[Int]])
result.foreach(println)
//List(1, 2, 3, 4, 5)
```

## Reactive Streams semantics

**cancels** If too many values are collected

## Code Examples

### Example 1: Example

```scala
val source = Source(1 to 5)
val result: Future[List[Int]] = source.runWith(Sink.collection[Int, List[Int]])
result.foreach(println)
//List(1, 2, 3, 4, 5)
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Sink$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Sink.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Sink/collect.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Sink/seq.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/collectType.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/Sink/collection.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/Sink/collection.html)*