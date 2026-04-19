---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:27:07Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/Sink/headOption.html
title: Sink.headOption • Akka core
---

# Sink.headOption • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Sink.headOption

Materializes into a `Future[Option[T]]` `CompletionStage<Optional<T>>` which completes with the first value arriving wrapped in `Some` `Optional`, or a `None` an empty Optional if the stream completes without any elements emitted.

[Sink operators](../index.html#sink-operators)

## Signature

[`Sink.headOption`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Sink.html#headOption() "akka.stream.javadsl.Sink")[`Sink.headOption`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Sink$.html#headOption[T]:akka.stream.scaladsl.Sink[T,scala.concurrent.Future[Option[T]]] "akka.stream.scaladsl.Sink")

## Description

Materializes into a `Future[Option[T]]` `CompletionStage<Optional<T>>` which completes with the first value arriving wrapped in `Some` `Optional`, or a `None` an empty Optional if the stream completes without any elements emitted.

## Example

In this example there is an empty source i.e. it does not emit any element and to handle it we have used headOption operator which will complete with None.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/operators/sink/HeadOption.scala#L17-L20 "Go to snippet source")val source = Source.empty
val result: Future[Option[Int]] = source.runWith(Sink.headOption)
result.foreach(println)
//None
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/operators/SinkDocExamples.java#L126-L129 "Go to snippet source")Source<Integer, NotUsed> source = Source.empty();
CompletionStage<Optional<Integer>> result = source.runWith(Sink.headOption(), system);
result.thenAccept(System.out::println);
// Optional.empty
```

## Reactive Streams semantics

**cancels** after receiving one element

**backpressures** never

## Code Examples

### Example 1: Example

```scala
val source = Source.empty
val result: Future[Option[Int]] = source.runWith(Sink.headOption)
result.foreach(println)
//None
```

### Example 2: Example

```java
Source<Integer, NotUsed> source = Source.empty();
CompletionStage<Optional<Integer>> result = source.runWith(Sink.headOption(), system);
result.thenAccept(System.out::println);
// Optional.empty
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Sink$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Sink.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Sink/head.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/idleTimeout.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/Sink/headOption.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/Sink/headOption.html)*