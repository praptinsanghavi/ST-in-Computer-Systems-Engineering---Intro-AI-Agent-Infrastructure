---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:27:11Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/Sink/reduce.html
title: Sink.reduce • Akka core
---

# Sink.reduce • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Sink.reduce

Apply a reduction function on the incoming elements and pass the result to the next invocation.

[Sink operators](../index.html#sink-operators)

## Signature

[`Sink.reduce`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Sink.html#reduce(akka.japi.function.Function2) "akka.stream.javadsl.Sink")[`Sink.reduce`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Sink$.html#reduce[T](f:(T,T)=>T):akka.stream.scaladsl.Sink[T,scala.concurrent.Future[T]] "akka.stream.scaladsl.Sink")

## Description

Apply a reduction function on the incoming elements and pass the result to the next invocation. The first invocation receives the two first elements of the flow.

Materializes into a `Future` `CompletionStage` that will be completed by the last result of the reduction function.

## Example

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-stream-tests/src/test/scala/akka/stream/scaladsl/SinkSpec.scala#L273-L277 "Go to snippet source")val source = Source(1 to 10)
val result = source.runWith(Sink.reduce[Int]((a, b) => a + b))
result.map(println)(system.dispatcher)
// will print
// 55
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/operators/SinkDocExamples.java#L28-L31 "Go to snippet source")Source<Integer, NotUsed> ints = Source.from(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
CompletionStage<Integer> sum = ints.runWith(Sink.reduce((a, b) -> a + b), system);
sum.thenAccept(System.out::println);
// 55
```

## Reactive Streams semantics

**cancels** never

**backpressures** when the previous reduction function invocation has not yet completed

## Code Examples

### Example 1: Example

```scala
val source = Source(1 to 10)
val result = source.runWith(Sink.reduce[Int]((a, b) => a + b))
result.map(println)(system.dispatcher)
// will print
// 55
```

### Example 2: Example

```java
Source<Integer, NotUsed> ints = Source.from(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
CompletionStage<Integer> sum = ints.runWith(Sink.reduce((a, b) -> a + b), system);
sum.thenAccept(System.out::println);
// 55
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Sink$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Sink.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/reduce.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/repeat.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/Sink/reduce.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/Sink/reduce.html)*