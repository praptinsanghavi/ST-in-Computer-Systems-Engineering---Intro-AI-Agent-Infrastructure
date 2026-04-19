---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:27:09Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/Sink/lastOption.html
title: Sink.lastOption • Akka core
---

# Sink.lastOption • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Sink.lastOption

Materialize a `Future[Option[T]]` `CompletionStage<Optional<T>>` which completes with the last value emitted wrapped in an `Some` `Optional` when the stream completes.

[Sink operators](../index.html#sink-operators)

## Signature

[`Sink.lastOption`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Sink.html#lastOption() "akka.stream.javadsl.Sink")[`Sink.lastOption`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Sink$.html#lastOption[T]:akka.stream.scaladsl.Sink[T,scala.concurrent.Future[Option[T]]] "akka.stream.scaladsl.Sink")

## Description

Materialize a `Future[Option[T]]` `CompletionStage<Optional<T>>` which completes with the last value emitted wrapped in an `Some` `Optional` when the stream completes. if the stream completes with no elements the `CompletionStage` is completed with `None` an empty `Optional`.

## Example

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-stream-tests/src/test/scala/akka/stream/scaladsl/LastSinkSpec.scala#L59-L62 "Go to snippet source")val source = Source.empty[Int]
val result: Future[Option[Int]] = source.runWith(Sink.lastOption)
result.map(println)
// None
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/operators/SinkDocExamples.java#L100-L103 "Go to snippet source")Source<Integer, NotUsed> source = Source.empty();
CompletionStage<Optional<Integer>> result = source.runWith(Sink.lastOption(), system);
result.thenAccept(System.out::println);
// Optional.empty
```

## Reactive Streams semantics

**cancels** never

**backpressures** never

## Code Examples

### Example 1: Example

```scala
val source = Source.empty[Int]
val result: Future[Option[Int]] = source.runWith(Sink.lastOption)
result.map(println)
// None
```

### Example 2: Example

```java
Source<Integer, NotUsed> source = Source.empty();
CompletionStage<Optional<Integer>> result = source.runWith(Sink.lastOption(), system);
result.thenAccept(System.out::println);
// Optional.empty
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Sink$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Sink.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Sink/last.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/lazily.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/Sink/lastOption.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/Sink/lastOption.html)*