---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:27:23Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/intersperse.html
title: intersperse • Akka core
---

# intersperse • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# intersperse

Intersperse stream with provided element similar to `List.mkString`.

[Simple operators](../index.html#simple-operators)

## Signature

[`Source.intersperse`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html#intersperse(java.lang.Object,java.lang.Object,java.lang.Object) "akka.stream.javadsl.Source")[`Source.intersperse`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html#intersperse[T>:Out](start:T,inject:T,end:T):FlowOps.this.Repr[T] "akka.stream.scaladsl.Source") [`Flow.intersperse`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html#intersperse(java.lang.Object,java.lang.Object,java.lang.Object) "akka.stream.javadsl.Flow")[`Flow.intersperse`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html#intersperse[T>:Out](start:T,inject:T,end:T):FlowOps.this.Repr[T] "akka.stream.scaladsl.Flow")

## Description

Intersperse stream with provided element similar to `List.mkString`. It can inject start and end marker elements to stream.

## Example

The following takes a stream of integers, converts them to strings and then adds a `[` at the start, `,` between each element and a `]` at the end.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/operators/sourceorflow/Intersperse.scala#L16-L18 "Go to snippet source")Source(1 to 4).map(_.toString).intersperse("[", ", ", "]").runWith(Sink.foreach(print))
// prints
// [1, 2, 3, 4]
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/operators/sourceorflow/Intersperse.java#L15-L20 "Go to snippet source")Source.from(Arrays.asList(1, 2, 3))
    .map(String::valueOf)
    .intersperse("[", ", ", "]")
    .runForeach(System.out::print, system);
// prints
// [1, 2, 3]
```

## Reactive Streams semantics

**emits** when upstream emits an element or before with the *start* element if provided

**backpressures** when downstream backpressures

**completes** when upstream completes

## Code Examples

### Example 1: Example

```scala
Source(1 to 4).map(_.toString).intersperse("[", ", ", "]").runWith(Sink.foreach(print))
// prints
// [1, 2, 3, 4]
```

### Example 2: Example

```java
Source.from(Arrays.asList(1, 2, 3))
    .map(String::valueOf)
    .intersperse("[", ", ", "]")
    .runForeach(System.out::print, system);
// prints
// [1, 2, 3]
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/interleaveAll.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/StreamConverters/javaCollector.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/intersperse.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/intersperse.html)*