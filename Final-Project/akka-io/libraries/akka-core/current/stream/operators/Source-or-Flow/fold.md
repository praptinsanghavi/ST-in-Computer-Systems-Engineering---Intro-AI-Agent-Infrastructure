---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:27:21Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/fold.html
title: fold • Akka core
---

# fold • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# fold

Start with current value `zero` and then apply the current and next value to the given function. When upstream completes, the current value is emitted downstream.

[Simple operators](../index.html#simple-operators)

## Signature

[`Source.fold`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html#fold(java.lang.Object,akka.japi.function.Function2) "akka.stream.javadsl.Source")[`Source.fold`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html#fold[T](zero:T)(f:(T,Out)=>T):FlowOps.this.Repr[T] "akka.stream.scaladsl.Source") [`Flow.fold`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html#fold(java.lang.Object,akka.japi.function.Function2) "akka.stream.javadsl.Flow")[`Flow.fold`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html#fold[T](zero:T)(f:(T,Out)=>T):FlowOps.this.Repr[T] "akka.stream.scaladsl.Flow")

## Description

Start with current value `zero` and then apply the current and next value to the given function. When upstream completes, the current value is emitted downstream.

Warning
Note that the `zero` value must be immutable, because otherwise the same mutable instance would be shared across different threads when running the stream more than once.

## Example

`fold` is typically used to ‘fold up’ the incoming values into an aggregate. For example, you might want to summarize the incoming values into a histogram:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/operators/sourceorflow/Fold.scala#L8-L10 "Go to snippet source")import akka.actor.ActorSystem
import akka.stream.scaladsl.Source

case class Histogram(low: Long = 0, high: Long = 0) {
  def add(i: Int): Histogram = if (i < 100) copy(low = low + 1) else copy(high = high + 1)
}
Source(1 to 150).fold(Histogram())((acc, n) => acc.add(n)).runForeach(println)

// Prints: Histogram(99,51)
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/operators/SourceOrFlow.java#L464-L485 "Go to snippet source")  
public CompletionStage<Histogram> addAsync(Integer n) {
  if (n < 100) {
    return CompletableFuture.supplyAsync(() -> new Histogram(low + 1L, high));
  } else {
    return CompletableFuture.supplyAsync(() -> new Histogram(low, high + 1L));
  }
}

// Folding over the numbers from 1 to 150:
Source.range(1, 150)
    .fold(Histogram.INSTANCE, Histogram::add)
    .runForeach(h -> System.out.println("Histogram(" + h.low + ", " + h.high + ")"), system);

// Prints: Histogram(99, 51)
```

## Reactive Streams semantics

**emits** when upstream completes

**backpressures** when downstream backpressures

**completes** when upstream completes

## Code Examples

### Example 1: Example

```scala
import akka.actor.ActorSystem
import akka.stream.scaladsl.Source

case class Histogram(low: Long = 0, high: Long = 0) {
  def add(i: Int): Histogram = if (i < 100) copy(low = low + 1) else copy(high = high + 1)
}
Source(1 to 150).fold(Histogram())((acc, n) => acc.add(n)).runForeach(println)

// Prints: Histogram(99,51)
```

### Example 2: Example

```java
public CompletionStage<Histogram> addAsync(Integer n) {
  if (n < 100) {
    return CompletableFuture.supplyAsync(() -> new Histogram(low + 1L, high));
  } else {
    return CompletableFuture.supplyAsync(() -> new Histogram(low, high + 1L));
  }
}

// Folding over the numbers from 1 to 150:
Source.range(1, 150)
    .fold(Histogram.INSTANCE, Histogram::add)
    .runForeach(h -> System.out.println("Histogram(" + h.low + ", " + h.high + ")"), system);

// Prints: Histogram(99, 51)
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Flow/flattenOptional.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Sink/fold.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/fold.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/fold.html)*