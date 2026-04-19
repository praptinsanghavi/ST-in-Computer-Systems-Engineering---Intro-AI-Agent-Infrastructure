---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:27:30Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/scan.html
title: scan • Akka core
---

# scan • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# scan

Emit its current value, which starts at `zero`, and then apply the current and next value to the given function, emitting the next current value.

[Simple operators](../index.html#simple-operators)

## Signature

[`Source.scan`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html#scan(java.lang.Object,akka.japi.function.Function2) "akka.stream.javadsl.Source")[`Source.scan`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html#scan[T](zero:T)(f:(T,Out)=>T):FlowOps.this.Repr[T] "akka.stream.scaladsl.Source") [`Flow.scan`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html#scan(java.lang.Object,akka.japi.function.Function2) "akka.stream.javadsl.Flow")[`Flow.scan`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html#scan[T](zero:T)(f:(T,Out)=>T):FlowOps.this.Repr[T] "akka.stream.scaladsl.Flow")

## Description

Emit its current value, which starts at `zero`, and then apply the current and next value to the given function, emitting the next current value. This means that `scan` emits one element downstream before, and upstream elements will not be requested until, the second element is required from downstream.

Warning
Note that the `zero` value must be immutable, because otherwise the same mutable instance would be shared across different threads when running the stream more than once.

## Examples

Below example demonstrates how `scan` is similar to `fold`, but it keeps value from every iteration.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/operators/sourceorflow/Scan.scala#L15-L22 "Go to snippet source")val source = Source(1 to 5)
source.scan(0)((acc, x) => acc + x).runForeach(println)
// 0  (= 0)
// 1  (= 0 + 1)
// 3  (= 0 + 1 + 2)
// 6  (= 0 + 1 + 2 + 3)
// 10 (= 0 + 1 + 2 + 3 + 4)
// 15 (= 0 + 1 + 2 + 3 + 4 + 5)
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/operators/SourceOrFlow.java#L309-L316 "Go to snippet source")Source<Integer, NotUsed> source = Source.range(1, 5);
source.scan(0, (acc, x) -> acc + x).runForeach(System.out::println, system);
// 0  (= 0)
// 1  (= 0 + 1)
// 3  (= 0 + 1 + 2)
// 6  (= 0 + 1 + 2 + 3)
// 10 (= 0 + 1 + 2 + 3 + 4)
// 15 (= 0 + 1 + 2 + 3 + 4 + 5)
```

## Reactive Streams semantics

**emits** when the function scanning the element returns a new element

**backpressures** when downstream backpressures

**completes** when upstream completes

## Code Examples

### Example 1: Examples

```scala
val source = Source(1 to 5)
source.scan(0)((acc, x) => acc + x).runForeach(println)
// 0  (= 0)
// 1  (= 0 + 1)
// 3  (= 0 + 1 + 2)
// 6  (= 0 + 1 + 2 + 3)
// 10 (= 0 + 1 + 2 + 3 + 4)
// 15 (= 0 + 1 + 2 + 3 + 4 + 5)
```

### Example 2: Examples

```java
Source<Integer, NotUsed> source = Source.range(1, 5);
source.scan(0, (acc, x) -> acc + x).runForeach(System.out::println, system);
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
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/scanAsync.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/repeat.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/scan.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/scan.html)*