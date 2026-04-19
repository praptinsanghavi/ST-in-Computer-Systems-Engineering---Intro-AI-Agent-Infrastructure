---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:27:19Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/dropWhile.html
title: dropWhile • Akka core
---

# dropWhile • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# dropWhile

Drop elements as long as a predicate function return true for the element

[Simple operators](../index.html#simple-operators)

## Signature

[`Source.dropWhile`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html#dropWhile(akka.japi.function.Predicate) "akka.stream.javadsl.Source")[`Source.dropWhile`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html#dropWhile(p:Out=>Boolean):FlowOps.this.Repr[Out] "akka.stream.scaladsl.Source") [`Flow.dropWhile`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html#dropWhile(akka.japi.function.Predicate) "akka.stream.javadsl.Flow")[`Flow.dropWhile`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html#dropWhile(p:Out=>Boolean):FlowOps.this.Repr[Out] "akka.stream.scaladsl.Flow")

## Description

Drop elements as long as a predicate function return true for the element

## Example

Given a `Source` of ordered numbers we can drop all the negative ones with the `dropWhile` operator. Mind that after the first non negative number is encountered, all the consecutive elements will be emitted despite the predicate provided. 

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/operators/sourceorflow/Drop.scala#L28-L34 "Go to snippet source")val droppedWhileNegative = Source(-3 to 3).dropWhile(_ < 0)

droppedWhileNegative.runForeach(println)
// 0
// 1
// 2
// 3
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/operators/SourceOrFlow.java#L573-L580 "Go to snippet source")Source<Integer, NotUsed> droppedWhileNegative =
    Source.from(Arrays.asList(-3, -2, -1, 0, 1, 2, 3, -1)).dropWhile(integer -> integer < 0);

droppedWhileNegative.runForeach(System.out::println, system);
// 1
// 2
// 3
// -1
```

## Reactive Streams semantics

**emits** when the predicate returned false and for all following stream elements

**backpressures** predicate returned false and downstream backpressures

**completes** when upstream completes

## Code Examples

### Example 1: Example

```scala
val droppedWhileNegative = Source(-3 to 3).dropWhile(_ < 0)

droppedWhileNegative.runForeach(println)
// 0
// 1
// 2
// 3
```

### Example 2: Example

```java
Source<Integer, NotUsed> droppedWhileNegative =
    Source.from(Arrays.asList(-3, -2, -1, 0, 1, 2, 3, -1)).dropWhile(integer -> integer < 0);

droppedWhileNegative.runForeach(System.out::println, system);
// 1
// 2
// 3
// -1
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/drop.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/dropWithin.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/dropWhile.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/dropWhile.html)*