---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:27:30Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/scanAsync.html
title: scanAsync • Akka core
---

# scanAsync • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# scanAsync

Just like [`scan`](scan.html) but receives a function that results in a `Future` `CompletionStage` to the next value.

[Simple operators](../index.html#simple-operators)

## Signature

[`Source.scanAsync`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html#scanAsync(java.lang.Object,akka.japi.function.Function2) "akka.stream.javadsl.Source")[`Source.scanAsync`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html#scanAsync[T](zero:T)(f:(T,Out)=>scala.concurrent.Future[T]):FlowOps.this.Repr[T] "akka.stream.scaladsl.Source") [`Flow.scanAsync`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html#scanAsync(java.lang.Object,akka.japi.function.Function2) "akka.stream.javadsl.Flow")[`Flow.scanAsync`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html#scanAsync[T](zero:T)(f:(T,Out)=>scala.concurrent.Future[T]):FlowOps.this.Repr[T] "akka.stream.scaladsl.Flow")

## Description

Just like `scan` but receives a function that results in a `Future` `CompletionStage` to the next value.

Warning
Note that the `zero` value must be immutable, because otherwise the same mutable instance would be shared across different threads when running the stream more than once.

## Example

Below example demonstrates how `scanAsync` is similar to `fold`, but it keeps value from every iteration.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/operators/sourceorflow/ScanAsync.scala#L21-L32 "Go to snippet source")def asyncFunction(acc: Int, next: Int): Future[Int] = Future {
  acc + next
}

val source = Source(1 to 5)
source.scanAsync(0)((acc, x) => asyncFunction(acc, x)).runForeach(println)
// 0  (= 0)
// 1  (= 0 + 1)
// 3  (= 0 + 1 + 2)
// 6  (= 0 + 1 + 2 + 3)
// 10 (= 0 + 1 + 2 + 3 + 4)
// 15 (= 0 + 1 + 2 + 3 + 4 + 5)
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/operators/SourceOrFlow.java#L321-L335 "Go to snippet source")CompletionStage<Integer> asyncFunction(int acc, int next) {
  return CompletableFuture.supplyAsync(() -> acc + next);
}
  Source<Integer, NotUsed> source = Source.range(1, 5);
  source.scanAsync(0, (acc, x) -> asyncFunction(acc, x)).runForeach(System.out::println, system);
  // 0  (= 0)
  // 1  (= 0 + 1)
  // 3  (= 0 + 1 + 2)
  // 6  (= 0 + 1 + 2 + 3)
  // 10 (= 0 + 1 + 2 + 3 + 4)
  // 15 (= 0 + 1 + 2 + 3 + 4 + 5)
```

Warning
In an actual application the future would probably involve some external API that returns a `Future` `CompletionStage` rather than an immediately completed value.

## Reactive Streams semantics

**emits** when the `Future` `CompletionStage` resulting from the function scanning the element resolves to the next value

**backpressures** when downstream backpressures

**completes** when upstream completes and the last `Future` `CompletionStage` is resolved

## Code Examples

### Example 1: Example

```scala
def asyncFunction(acc: Int, next: Int): Future[Int] = Future {
  acc + next
}

val source = Source(1 to 5)
source.scanAsync(0)((acc, x) => asyncFunction(acc, x)).runForeach(println)
// 0  (= 0)
// 1  (= 0 + 1)
// 3  (= 0 + 1 + 2)
// 6  (= 0 + 1 + 2 + 3)
// 10 (= 0 + 1 + 2 + 3 + 4)
// 15 (= 0 + 1 + 2 + 3 + 4 + 5)
```

### Example 2: Example

```java
CompletionStage<Integer> asyncFunction(int acc, int next) {
  return CompletableFuture.supplyAsync(() -> acc + next);
}
  Source<Integer, NotUsed> source = Source.range(1, 5);
  source.scanAsync(0, (acc, x) -> asyncFunction(acc, x)).runForeach(System.out::println, system);
  // 0  (= 0)
  // 1  (= 0 + 1)
  // 3  (= 0 + 1 + 2)
  // 6  (= 0 + 1 + 2 + 3)
  // 10 (= 0 + 1 + 2 + 3 + 4)
  // 15 (= 0 + 1 + 2 + 3 + 4 + 5)
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Sink/seq.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/scan.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/scanAsync.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/scanAsync.html)*