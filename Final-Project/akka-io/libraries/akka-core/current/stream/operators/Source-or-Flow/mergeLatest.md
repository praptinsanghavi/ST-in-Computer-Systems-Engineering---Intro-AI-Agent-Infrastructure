---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:27:50Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/mergeLatest.html
title: mergeLatest • Akka core
---

# mergeLatest • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# mergeLatest

Merge multiple sources.

[Fan\-in operators](../index.html#fan-in-operators)

## Signature

[`Flow.mergeLatest`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html#mergeLatest(akka.stream.Graph,boolean) "akka.stream.javadsl.Flow")[`Flow.mergeLatest`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html#mergeLatest[U%3E:Out,M](that:akka.stream.Graph[akka.stream.SourceShape[U],M],eagerComplete:Boolean):FlowOps.this.Repr[scala.collection.immutable.Seq[U]] "akka.stream.scaladsl.Flow") 

## Description

MergeLatest joins elements from N input streams into stream of lists of size N. The i\-th element in list is the latest emitted element from i\-th input stream. MergeLatest emits list for each element emitted from some input stream, but only after each input stream emitted at least one element If `eagerComplete` is set to true then it completes as soon as the first upstream completes otherwise when all upstreams complete.

## Example

This example takes a stream of prices and quantities and emits the price each time the price of quantity changes:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/operators/sourceorflow/MergeLatest.scala#L13-L30 "Go to snippet source")val prices = Source(List(100, 101, 99, 103))
val quantity = Source(List(1, 3, 4, 2))

prices
  .mergeLatest(quantity)
  .map {
    case price :: quantity :: Nil => price * quantity
  }
  .runForeach(println)

// prints something like:
// 100
// 101
// 303
// 297
// 396
// 412
// 206
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/operators/sourceorflow/MergeLatest.java#L18-L33 "Go to snippet source")Source<Integer, NotUsed> prices = Source.from(Arrays.asList(100, 101, 99, 103));
Source<Integer, NotUsed> quantities = Source.from(Arrays.asList(1, 3, 4, 2));

prices
    .mergeLatest(quantities, true)
    .map(priceAndQuantity -> priceAndQuantity.get(0) * priceAndQuantity.get(1))
    .runForeach(System.out::println, system);

// prints something like:
// 100
// 101
// 303
// 297
// 396
// 412
// 206
```

## Reactive Streams semantics

**emits** when element is available from some input and each input emits at least one element from stream start

**completes** all upstreams complete (eagerClose\=false) or one upstream completes (eagerClose\=true)

## Code Examples

### Example 1: Example

```scala
val prices = Source(List(100, 101, 99, 103))
val quantity = Source(List(1, 3, 4, 2))

prices
  .mergeLatest(quantity)
  .map {
    case price :: quantity :: Nil => price * quantity
  }
  .runForeach(println)

// prints something like:
// 100
// 101
// 303
// 297
// 396
// 412
// 206
```

### Example 2: Example

```java
Source<Integer, NotUsed> prices = Source.from(Arrays.asList(100, 101, 99, 103));
Source<Integer, NotUsed> quantities = Source.from(Arrays.asList(1, 3, 4, 2));

prices
    .mergeLatest(quantities, true)
    .map(priceAndQuantity -> priceAndQuantity.get(0) * priceAndQuantity.get(1))
    .runForeach(System.out::println, system);

// prints something like:
// 100
// 101
// 303
// 297
// 396
// 412
// 206
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/mergeAll.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/mergePreferred.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/mergeLatest.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/mergeLatest.html)*