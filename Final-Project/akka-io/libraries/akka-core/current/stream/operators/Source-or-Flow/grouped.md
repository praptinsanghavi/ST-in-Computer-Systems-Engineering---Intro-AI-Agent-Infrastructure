---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:27:23Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/grouped.html
title: grouped • Akka core
---

# grouped • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# grouped

Accumulate incoming events until the specified number of elements have been accumulated and then pass the collection of elements downstream.

[Simple operators](../index.html#simple-operators)

## Signature

[`Source.grouped`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html#grouped(int) "akka.stream.javadsl.Source")[`Source.grouped`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html#grouped(n:Int):FlowOps.this.Repr[scala.collection.immutable.Seq[Out]] "akka.stream.scaladsl.Source") [`Flow.grouped`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html#grouped(int) "akka.stream.javadsl.Flow")[`Flow.grouped`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html#grouped(n:Int):FlowOps.this.Repr[scala.collection.immutable.Seq[Out]] "akka.stream.scaladsl.Flow")

## Description

Accumulate incoming events until the specified number of elements have been accumulated and then pass the collection of elements downstream.

See also:

- [groupedWeighted](groupedWeighted.html) for a variant that groups based on element weight
- [groupedWithin](groupedWithin.html) for a variant that groups based on number of elements and a time window
- [groupedWeightedWithin](groupedWeightedWithin.html) for a variant that groups based on element weight and a time window

## Examples

The below example demonstrates how `grouped` groups the accumulated elements into `Seq` `List` and maps with other operation.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/operators/sourceorflow/Grouped.scala#L15-L23 "Go to snippet source")Source(1 to 7).grouped(3).runForeach(println)
// Vector(1, 2, 3)
// Vector(4, 5, 6)
// Vector(7)

Source(1 to 7).grouped(3).map(_.sum).runForeach(println)
// 6   (= 1 + 2 + 3)
// 15  (= 4 + 5 + 6)
// 7   (= 7)
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/operators/SourceOrFlow.java#L407-L420 "Go to snippet source")Source.from(Arrays.asList(1, 2, 3, 4, 5, 6, 7))
    .grouped(3)
    .runForeach(System.out::println, system);
// [1, 2, 3]
// [4, 5, 6]
// [7]

Source.from(Arrays.asList(1, 2, 3, 4, 5, 6, 7))
    .grouped(3)
    .map(g -> g.stream().reduce(0, Integer::sum))
    .runForeach(System.out::println, system);
// 6   (= 1 + 2 + 3)
// 15  (= 4 + 5 + 6)
// 7   (= 7)
```

## Reactive Streams semantics

**emits** when the specified number of elements has been accumulated or upstream completed

**backpressures** when a group has been assembled and downstream backpressures

**completes** when upstream completes

## Code Examples

### Example 1: Examples

```scala
Source(1 to 7).grouped(3).runForeach(println)
// Vector(1, 2, 3)
// Vector(4, 5, 6)
// Vector(7)

Source(1 to 7).grouped(3).map(_.sum).runForeach(println)
// 6   (= 1 + 2 + 3)
// 15  (= 4 + 5 + 6)
// 7   (= 7)
```

### Example 2: Examples

```java
Source.from(Arrays.asList(1, 2, 3, 4, 5, 6, 7))
    .grouped(3)
    .runForeach(System.out::println, system);
// [1, 2, 3]
// [4, 5, 6]
// [7]

Source.from(Arrays.asList(1, 2, 3, 4, 5, 6, 7))
    .grouped(3)
    .map(g -> g.stream().reduce(0, Integer::sum))
    .runForeach(System.out::println, system);
// 6   (= 1 + 2 + 3)
// 15  (= 4 + 5 + 6)
// 7   (= 7)
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/groupBy.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/groupedWeighted.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/groupedWeightedWithin.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/groupedWithin.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/grouped.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/grouped.html)*