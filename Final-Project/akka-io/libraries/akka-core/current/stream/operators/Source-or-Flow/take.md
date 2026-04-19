---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:27:31Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/take.html
title: take • Akka core
---

# take • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# take

Pass `n` incoming elements downstream and then complete

[Simple operators](../index.html#simple-operators)

## Signature

[`Source.take`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html#take(long) "akka.stream.javadsl.Source")[`Source.take`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html#take(n:Long):FlowOps.this.Repr[Out] "akka.stream.scaladsl.Source") [`Flow.take`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html#take(long) "akka.stream.javadsl.Flow")[`Flow.take`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html#take(n:Long):FlowOps.this.Repr[Out] "akka.stream.scaladsl.Flow")

## Description

Pass `n` incoming elements downstream and then complete

## Example

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/operators/sourceorflow/Take.scala#L15-L18 "Go to snippet source")Source(1 to 5).take(3).runForeach(println)
// 1
// 2
// 3
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/operators/SourceOrFlow.java#L503-L507 "Go to snippet source")Source.from(Arrays.asList(1, 2, 3, 4, 5)).take(3).runForeach(System.out::println, system);
// this will print:
// 1
// 2
// 3
```

## Reactive Streams semantics

**emits** while the specified number of elements to take has not yet been reached

**backpressures** when downstream backpressures

**completes** when the defined number of elements has been taken or upstream completes

## Code Examples

### Example 1: Example

```scala
Source(1 to 5).take(3).runForeach(println)
// 1
// 2
// 3
```

### Example 2: Example

```java
Source.from(Arrays.asList(1, 2, 3, 4, 5)).take(3).runForeach(System.out::println, system);
// this will print:
// 1
// 2
// 3
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Sink/takeLast.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/statefulMapConcat.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/take.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/take.html)*