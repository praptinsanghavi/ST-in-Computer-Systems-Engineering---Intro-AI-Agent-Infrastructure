---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:27:05Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/Sink/fold.html
title: Sink.fold • Akka core
---

# Sink.fold • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Sink.fold

Fold over emitted element with a function, where each invocation will get the new element and the result from the previous fold invocation.

[Sink operators](../index.html#sink-operators)

## Signature

[`Sink.fold`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Sink.html#fold(java.lang.Object,akka.japi.function.Function2) "akka.stream.javadsl.Sink")[`Sink.fold`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Sink$.html#fold[U,T](zero:U)(f:(U,T)=>U):akka.stream.scaladsl.Sink[T,scala.concurrent.Future[U]] "akka.stream.scaladsl.Sink")

## Description

Fold over emitted element with a function, where each invocation will get the new element and the result from the previous fold invocation. The first invocation will be provided the `zero` value.

Materializes into a `Future` `CompletionStage` that will complete with the last state when the stream has completed.

This operator allows combining values into a result without a global mutable state by instead passing the state along between invocations.

## Example

This example reads the numbers from a source and do some calculation in the flow part and in the end uses Sink.fold and adds the incoming elements.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/operators/sink/Fold.scala#L17-L20 "Go to snippet source")val source = Source(1 to 100)
val result: Future[Int] = source.runWith(Sink.fold(0)((acc, element) => acc + element))
result.map(println)
//5050
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/operators/SinkDocExamples.java#L109-L112 "Go to snippet source")Source<Integer, NotUsed> source = Source.range(1, 100);
CompletionStage<Integer> sum =
    source.runWith(Sink.fold(0, (res, element) -> res + element), system);
sum.thenAccept(System.out::println);
```

## Reactive Streams semantics

**cancels** never

**backpressures** when the previous fold function invocation has not yet completed

## Code Examples

### Example 1: Example

```scala
val source = Source(1 to 100)
val result: Future[Int] = source.runWith(Sink.fold(0)((acc, element) => acc + element))
result.map(println)
//5050
```

### Example 2: Example

```java
Source<Integer, NotUsed> source = Source.range(1, 100);
CompletionStage<Integer> sum =
    source.runWith(Sink.fold(0, (res, element) -> res + element), system);
sum.thenAccept(System.out::println);
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Sink$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Sink.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/fold.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/foldAsync.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/Sink/fold.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/Sink/fold.html)*