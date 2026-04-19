---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:27:07Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/Sink/head.html
title: Sink.head • Akka core
---

# Sink.head • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Sink.head

Materializes into a `Future` `CompletionStage` which completes with the first value arriving, after this the stream is canceled.

[Sink operators](../index.html#sink-operators)

## Signature

[`Sink.head`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Sink.html#head() "akka.stream.javadsl.Sink")[`Sink.head`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Sink$.html#head[T]:akka.stream.scaladsl.Sink[T,scala.concurrent.Future[T]] "akka.stream.scaladsl.Sink")

## Description

Materializes into a `Future` `CompletionStage` which completes with the first value arriving, after this the stream is canceled. If no element is emitted, the `Future` `CompletionStage` is failed.

## Example

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-stream-tests/src/test/scala/akka/stream/scaladsl/HeadSinkSpec.scala#L24-L27 "Go to snippet source")val source = Source(1 to 10)
val result: Future[Int] = source.runWith(Sink.head)
result.map(println)
// 1
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/operators/SinkDocExamples.java#L82-L85 "Go to snippet source")Source<Integer, NotUsed> source = Source.from(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
CompletionStage<Integer> result = source.runWith(Sink.head(), system);
result.thenAccept(System.out::println);
// 1
```

## Reactive Streams semantics

**cancels** after receiving one element

**backpressures** never

## Code Examples

### Example 1: Example

```scala
val source = Source(1 to 10)
val result: Future[Int] = source.runWith(Sink.head)
result.map(println)
// 1
```

### Example 2: Example

```java
Source<Integer, NotUsed> source = Source.from(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
CompletionStage<Integer> result = source.runWith(Sink.head(), system);
result.thenAccept(System.out::println);
// 1
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Sink$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Sink.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Compression/gzip.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Sink/headOption.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/Sink/head.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/Sink/head.html)*