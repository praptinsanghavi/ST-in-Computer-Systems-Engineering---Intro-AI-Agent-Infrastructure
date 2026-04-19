---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:27:23Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/groupedWeighted.html
title: groupedWeighted • Akka core
---

# groupedWeighted • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# groupedWeighted

Accumulate incoming events until the combined weight of elements is greater than or equal to the minimum weight and then pass the collection of elements downstream.

[Simple operators](../index.html#simple-operators)

## Signature

[`Source.groupedWeighted`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html#groupedWeighted(long,akka.japi.function.Function) "akka.stream.javadsl.Source")[`Source.groupedWeighted`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html#groupedWeighted(minWeight:Long)(costFn:Out=>Long):FlowOps.this.Repr[scala.collection.immutable.Seq[Out]] "akka.stream.scaladsl.Source") [`Flow.groupedWeighted`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html#groupedWeighted(long,akka.japi.function.Function) "akka.stream.javadsl.Flow")[`Flow.groupedWeighted`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html#groupedWeighted(minWeight:Long)(costFn:Out=>Long):FlowOps.this.Repr[scala.collection.immutable.Seq[Out]] "akka.stream.scaladsl.Flow")

## Description

Chunk up this stream into groups of elements that have a cumulative weight greater than or equal to the `minWeight`, with the last group possibly smaller than requested `minWeight` due to end\-of\-stream.

See also:

- [grouped](grouped.html) for a variant that groups based on number of elements
- [groupedWithin](groupedWithin.html) for a variant that groups based on number of elements and a time window
- [groupedWeightedWithin](groupedWeightedWithin.html) for a variant that groups based on element weight and a time window

## Examples

The below example demonstrates how `groupedWeighted` groups the accumulated elements into `Seq` `List` and maps with other operation.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/operators/sourceorflow/GroupedWeighted.scala#L16-L23 "Go to snippet source")val collections = immutable.Iterable(Seq(1, 2), Seq(3, 4), Seq(5, 6))
Source[Seq[Int]](collections).groupedWeighted(4)(_.length).runForeach(println)
// Vector(Seq(1, 2), Seq(3, 4))
// Vector(Seq(5, 6))

Source[Seq[Int]](collections).groupedWeighted(3)(_.length).runForeach(println)
// Vector(Seq(1, 2), Seq(3, 4))
// Vector(Seq(5, 6))
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/operators/SourceOrFlow.java#L426-L436 "Go to snippet source")Source.from(Arrays.asList(Arrays.asList(1, 2), Arrays.asList(3, 4), Arrays.asList(5, 6)))
    .groupedWeighted(4, x -> (long) x.size())
    .runForeach(System.out::println, system);
// [[1, 2], [3, 4]]
// [[5, 6]]

Source.from(Arrays.asList(Arrays.asList(1, 2), Arrays.asList(3, 4), Arrays.asList(5, 6)))
    .groupedWeighted(3, x -> (long) x.size())
    .runForeach(System.out::println, system);
// [[1, 2], [3, 4]]
// [[5, 6]]
```

## Reactive Streams semantics

**emits** when the cumulative weight of elements is greater than or equal to the minimum weight or upstream completed

**backpressures** when a group has been assembled and downstream backpressures

**completes** when upstream completes

## Code Examples

### Example 1: Examples

```scala
val collections = immutable.Iterable(Seq(1, 2), Seq(3, 4), Seq(5, 6))
Source[Seq[Int]](collections).groupedWeighted(4)(_.length).runForeach(println)
// Vector(Seq(1, 2), Seq(3, 4))
// Vector(Seq(5, 6))

Source[Seq[Int]](collections).groupedWeighted(3)(_.length).runForeach(println)
// Vector(Seq(1, 2), Seq(3, 4))
// Vector(Seq(5, 6))
```

### Example 2: Examples

```java
Source.from(Arrays.asList(Arrays.asList(1, 2), Arrays.asList(3, 4), Arrays.asList(5, 6)))
    .groupedWeighted(4, x -> (long) x.size())
    .runForeach(System.out::println, system);
// [[1, 2], [3, 4]]
// [[5, 6]]

Source.from(Arrays.asList(Arrays.asList(1, 2), Arrays.asList(3, 4), Arrays.asList(5, 6)))
    .groupedWeighted(3, x -> (long) x.size())
    .runForeach(System.out::println, system);
// [[1, 2], [3, 4]]
// [[5, 6]]
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/grouped.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/groupedWeightedWithin.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/groupedWithin.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/groupedWeighted.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/groupedWeighted.html)*