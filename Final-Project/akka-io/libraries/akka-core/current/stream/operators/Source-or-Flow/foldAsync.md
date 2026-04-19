---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:27:21Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/foldAsync.html
title: foldAsync • Akka core
---

# foldAsync • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# foldAsync

Just like `fold` but receives a function that results in a `Future` `CompletionStage` to the next value.

[Simple operators](../index.html#simple-operators)

## Signature

[`Source.foldAsync`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html#foldAsync(java.lang.Object,akka.japi.function.Function2) "akka.stream.javadsl.Source")[`Source.foldAsync`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html#foldAsync[T](zero:T)(f:(T,Out)=>scala.concurrent.Future[T]):FlowOps.this.Repr[T] "akka.stream.scaladsl.Source") [`Flow.foldAsync`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html#foldAsync(java.lang.Object,akka.japi.function.Function2) "akka.stream.javadsl.Flow")[`Flow.foldAsync`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html#foldAsync[T](zero:T)(f:(T,Out)=>scala.concurrent.Future[T]):FlowOps.this.Repr[T] "akka.stream.scaladsl.Flow")

## Description

Just like `fold` but receives a function that results in a `Future` `CompletionStage` to the next value.

Warning
Note that the `zero` value must be immutable, because otherwise the same mutable instance would be shared across different threads when running the stream more than once.

## Example

`foldAsync` is typically used to ‘fold up’ the incoming values into an aggregate asynchronously. For example, you might want to summarize the incoming values into a histogram:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/operators/sourceorflow/FoldAsync.scala#L8-L11 "Go to snippet source")import akka.actor.ActorSystem
import akka.stream.scaladsl.Source

import scala.concurrent.{ ExecutionContext, Future }
case class Histogram(low: Long = 0, high: Long = 0) {
  def add(i: Int): Future[Histogram] =
    if (i < 100) Future { copy(low = low + 1) } else Future { copy(high = high + 1) }
}

Source(1 to 150).foldAsync(Histogram())((acc, n) => acc.add(n)).runForeach(println)

// Prints: Histogram(99,51)
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/operators/SourceOrFlow.java#L442-L497 "Go to snippet source")class Histogram {
  final long low;
  final long high;

  private Histogram(long low, long high) {
    this.low = low;
    this.high = high;
  }

  // Immutable start value
  public static Histogram INSTANCE = new Histogram(0L, 0L);

  public CompletionStage<Histogram> addAsync(Integer n) {
    if (n < 100) {
      return CompletableFuture.supplyAsync(() -> new Histogram(low + 1L, high));
    } else {
      return CompletableFuture.supplyAsync(() -> new Histogram(low, high + 1L));
    }
  }
}

  // Folding over the numbers from 1 to 150:
  Source.range(1, 150)
      .foldAsync(Histogram.INSTANCE, Histogram::addAsync)
      .runForeach(h -> System.out.println("Histogram(" + h.low + ", " + h.high + ")"), system);

  // Prints: Histogram(99, 51)
```

## Reactive Streams semantics

**emits** when upstream completes and the last `Future` `CompletionStage` is resolved

**backpressures** when downstream backpressures

**completes** when upstream completes and the last `Future` `CompletionStage` is resolved

## Code Examples

### Example 1: Example

```scala
import akka.actor.ActorSystem
import akka.stream.scaladsl.Source

import scala.concurrent.{ ExecutionContext, Future }
case class Histogram(low: Long = 0, high: Long = 0) {
  def add(i: Int): Future[Histogram] =
    if (i < 100) Future { copy(low = low + 1) } else Future { copy(high = high + 1) }
}

Source(1 to 150).foldAsync(Histogram())((acc, n) => acc.add(n)).runForeach(println)

// Prints: Histogram(99,51)
```

### Example 2: Example

```java
class Histogram {
  final long low;
  final long high;

  private Histogram(long low, long high) {
    this.low = low;
    this.high = high;
  }

  // Immutable start value
  public static Histogram INSTANCE = new Histogram(0L, 0L);

  public CompletionStage<Histogram> addAsync(Integer n) {
    if (n < 100) {
      return CompletableFuture.supplyAsync(() -> new Histogram(low + 1L, high));
    } else {
      return CompletableFuture.supplyAsync(() -> new Histogram(low, high + 1L));
    }
  }
}

  // Folding over the numbers from 1 to 150:
  Source.range(1, 150)
      .foldAsync(Histogram.INSTANCE, Histogram::addAsync)
      .runForeach(h -> System.out.println("Histogram(" + h.low + ", " + h.high + ")"), system);

  // Prints: Histogram(99, 51)
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Sink/fold.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Sink/foreach.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/foldAsync.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/foldAsync.html)*