---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:27:08Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/Sink/last.html
title: Sink.last • Akka core
---

# Sink.last • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Sink.last

Materializes into a `Future` `CompletionStage` which will complete with the last value emitted when the stream completes.

[Sink operators](../index.html#sink-operators)

## Signature

[`Sink.last`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Sink.html#last() "akka.stream.javadsl.Sink")[`Sink.last`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Sink$.html#last[T]:akka.stream.scaladsl.Sink[T,scala.concurrent.Future[T]] "akka.stream.scaladsl.Sink")

## Description

Materializes into a `Future` `CompletionStage` which will complete with the last value emitted when the stream completes. If the stream completes with no elements the `Future` `CompletionStage` is failed.

## Example

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-stream-tests/src/test/scala/akka/stream/scaladsl/LastSinkSpec.scala#L22-L25 "Go to snippet source")val source = Source(1 to 10)
val result: Future[Int] = source.runWith(Sink.last)
result.map(println)
// 10
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/operators/SinkDocExamples.java#L91-L94 "Go to snippet source")Source<Integer, NotUsed> source = Source.from(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
CompletionStage<Integer> result = source.runWith(Sink.last(), system);
result.thenAccept(System.out::println);
// 10
```

## Reactive Streams semantics

**cancels** never

**backpressures** never

## Code Examples

### Example 1: Example

```scala
val source = Source(1 to 10)
val result: Future[Int] = source.runWith(Sink.last)
result.map(println)
// 10
```

### Example 2: Example

```java
Source<Integer, NotUsed> source = Source.from(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
CompletionStage<Integer> result = source.runWith(Sink.last(), system);
result.thenAccept(System.out::println);
// 10
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Sink$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Sink.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Sink/lastOption.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/keepAlive.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/Sink/last.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/Sink/last.html)*