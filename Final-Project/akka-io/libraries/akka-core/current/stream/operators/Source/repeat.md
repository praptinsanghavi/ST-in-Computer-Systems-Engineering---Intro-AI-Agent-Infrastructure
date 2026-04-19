---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:26:59Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/repeat.html
title: Source.repeat • Akka core
---

# Source.repeat • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Source.repeat

Stream a single object repeatedly.

[Source operators](../index.html#source-operators)

## Signature

[`Source.repeat`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html#repeat(T) "akka.stream.javadsl.Source")[`Source.repeat`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source$.html#repeat[T](element:T):akka.stream.scaladsl.Source[T,akka.NotUsed] "akka.stream.scaladsl.Source")

## Description

This source emits a single element repeatedly. It never completes, if you want the stream to be finite you will need to limit it by combining with another operator

See also:

- [`single`](single.html) Stream a single object once.
- [`tick`](tick.html) A periodical repetition of an arbitrary object.
- [`cycle`](cycle.html) Stream iterator in cycled manner.

## Example

This example prints the first 4 elements emitted by `Source.repeat`.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-stream-tests/src/test/scala/akka/stream/scaladsl/SourceSpec.scala#L262-L267 "Go to snippet source")val source: Source[Int, NotUsed] = Source.repeat(42)
val f = source.take(4).runWith(Sink.foreach(println))
// 42
// 42
// 42
// 42
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-stream-tests/src/test/java/akka/stream/javadsl/SourceTest.java#L641-L646 "Go to snippet source")Source<Integer, NotUsed> source = Source.repeat(42);
CompletionStage<Done> f = source.take(4).runWith(Sink.foreach(System.out::println), system);
// 42
// 42
// 42
// 42
```

## Reactive Streams semantics

**emits** the same value repeatedly when there is demand

**completes** never

## Code Examples

### Example 1: Example

```scala
val source: Source[Int, NotUsed] = Source.repeat(42)
val f = source.take(4).runWith(Sink.foreach(println))
// 42
// 42
// 42
// 42
```

### Example 2: Example

```java
Source<Integer, NotUsed> source = Source.repeat(42);
CompletionStage<Done> f = source.take(4).runWith(Sink.foreach(System.out::println), system);
// 42
// 42
// 42
// 42
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Sink/reduce.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/scan.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/cycle.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/single.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/tick.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/repeat.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/repeat.html)*