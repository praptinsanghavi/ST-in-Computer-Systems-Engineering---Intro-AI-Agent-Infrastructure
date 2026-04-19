---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:27:30Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/reduce.html
title: reduce • Akka core
---

# reduce • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# reduce

Start with first element and then apply the current and next value to the given function, when upstream complete the current value is emitted downstream.

[Simple operators](../index.html#simple-operators)

## Signature

[`Source.reduce`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html#reduce(akka.japi.function.Function2) "akka.stream.javadsl.Source")[`Source.reduce`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html#reduce[T>:Out](f:(T,T)=>T):FlowOps.this.Repr[T] "akka.stream.scaladsl.Source") [`Flow.reduce`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html#reduce(akka.japi.function.Function2) "akka.stream.javadsl.Flow")[`Flow.reduce`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html#reduce[T>:Out](f:(T,T)=>T):FlowOps.this.Repr[T] "akka.stream.scaladsl.Flow")

## Description

Start with first element and then apply the current and next value to the given function, when upstream complete the current value is emitted downstream. Similar to `fold`.

## Example

`reduce` will take a function and apply it on the incoming elements in the Stream and only emits its result when upstream completes. Here, it will add the incoming elements.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/operators/sourceorflow/Reduce.scala#L17-L20 "Go to snippet source")val source = Source(1 to 100).reduce((acc, element) => acc + element)
val result: Future[Int] = source.runWith(Sink.head)
result.map(println)
//5050
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/operators/SourceOrFlow.java#L586-L589 "Go to snippet source")Source<Integer, NotUsed> source = Source.range(1, 100).reduce((acc, element) -> acc + element);
CompletionStage<Integer> result = source.runWith(Sink.head(), system);
result.thenAccept(System.out::println);
// 5050
```

## Reactive Streams semantics

**emits** when upstream completes

**backpressures** when downstream backpressures

**completes** when upstream completes

## Code Examples

### Example 1: Example

```scala
val source = Source(1 to 100).reduce((acc, element) => acc + element)
val result: Future[Int] = source.runWith(Sink.head)
result.map(println)
//5050
```

### Example 2: Example

```java
Source<Integer, NotUsed> source = Source.range(1, 100).reduce((acc, element) -> acc + element);
CompletionStage<Integer> result = source.runWith(Sink.head(), system);
result.thenAccept(System.out::println);
// 5050
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Sink/reduce.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/recoverWithRetries.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/reduce.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/reduce.html)*