---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:27:18Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/drop.html
title: drop • Akka core
---

# drop • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# drop

Drop `n` elements and then pass any subsequent element downstream.

[Simple operators](../index.html#simple-operators)

## Signature

[`Source.drop`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html#drop(long) "akka.stream.javadsl.Source")[`Source.drop`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html#drop(n:Long):FlowOps.this.Repr[Out] "akka.stream.scaladsl.Source") [`Flow.drop`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html#drop(long) "akka.stream.javadsl.Flow")[`Flow.drop`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html#drop(n:Long):FlowOps.this.Repr[Out] "akka.stream.scaladsl.Flow")

## Description

Drop `n` elements and then pass any subsequent element downstream.

## Example

Given a `Source` of numbers we can drop the first 3 elements with the `drop` operator: 

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/operators/sourceorflow/Drop.scala#L17-L22 "Go to snippet source")val fiveInts: Source[Int, NotUsed] = Source(1 to 5)
val droppedThreeInts: Source[Int, NotUsed] = fiveInts.drop(3)

droppedThreeInts.runForeach(println)
// 4
// 5
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/operators/SourceOrFlow.java#L562-L567 "Go to snippet source")Source<Integer, NotUsed> fiveIntegers = Source.from(Arrays.asList(1, 2, 3, 4, 5));
Source<Integer, NotUsed> droppedThreeInts = fiveIntegers.drop(3);

droppedThreeInts.runForeach(System.out::println, system);
// 4
// 5
```

## Reactive Streams semantics

**emits** when the specified number of elements has been dropped already

**backpressures** when the specified number of elements has been dropped and downstream backpressures

**completes** when upstream completes

## Code Examples

### Example 1: Example

```scala
val fiveInts: Source[Int, NotUsed] = Source(1 to 5)
val droppedThreeInts: Source[Int, NotUsed] = fiveInts.drop(3)

droppedThreeInts.runForeach(println)
// 4
// 5
```

### Example 2: Example

```java
Source<Integer, NotUsed> fiveIntegers = Source.from(Arrays.asList(1, 2, 3, 4, 5));
Source<Integer, NotUsed> droppedThreeInts = fiveIntegers.drop(3);

droppedThreeInts.runForeach(System.out::println, system);
// 4
// 5
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/divertTo.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/dropWhile.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/drop.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/drop.html)*