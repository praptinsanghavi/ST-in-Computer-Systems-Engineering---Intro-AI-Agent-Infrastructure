---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:27:33Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/takeWhile.html
title: takeWhile • Akka core
---

# takeWhile • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# takeWhile

Pass elements downstream as long as a predicate function returns true and then complete. 

[Simple operators](../index.html#simple-operators)

## Signature

[`Source.takeWhile`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html#takeWhile(akka.japi.function.Predicate) "akka.stream.javadsl.Source")[`Source.takeWhile`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html#takeWhile(p:Out=>Boolean,inclusive:Boolean):FlowOps.this.Repr[Out] "akka.stream.scaladsl.Source") [`Flow.takeWhile`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html#takeWhile(akka.japi.function.Predicate) "akka.stream.javadsl.Flow")[`Flow.takeWhile`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html#takeWhile(p:Out=>Boolean,inclusive:Boolean):FlowOps.this.Repr[Out] "akka.stream.scaladsl.Flow")

## Description

Pass elements downstream as long as a predicate function returns true and then complete. The element for which the predicate returns false is not emitted. 

## Example

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/operators/sourceorflow/TakeWhile.scala#L15-L18 "Go to snippet source")Source(1 to 10).takeWhile(_ < 3).runForeach(println)
// prints
// 1
// 2
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/operators/SourceOrFlow.java#L513-L518 "Go to snippet source")Source.from(Arrays.asList(1, 2, 3, 4, 5))
    .takeWhile(i -> i < 3)
    .runForeach(System.out::println, system);
// this will print:
// 1
// 2
```

## Reactive Streams semantics

**emits** while the predicate is true and until the first false result

**backpressures** when downstream backpressures

**completes** when predicate returned false or upstream completes

## Code Examples

### Example 1: Example

```scala
Source(1 to 10).takeWhile(_ < 3).runForeach(println)
// prints
// 1
// 2
```

### Example 2: Example

```java
Source.from(Arrays.asList(1, 2, 3, 4, 5))
    .takeWhile(i -> i < 3)
    .runForeach(System.out::println, system);
// this will print:
// 1
// 2
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Sink/takeLast.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/takeWithin.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/takeWhile.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/takeWhile.html)*