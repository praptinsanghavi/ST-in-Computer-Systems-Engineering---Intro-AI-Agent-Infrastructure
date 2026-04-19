---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:27:28Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/map.html
title: map • Akka core
---

# map • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# map

Transform each element in the stream by calling a mapping function with it and passing the returned value downstream.

[Simple operators](../index.html#simple-operators)

## Signature

[`Source.map`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html#map(akka.japi.function.Function) "akka.stream.javadsl.Source")[`Source.map`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html#map[T](f:Out=>T):FlowOps.this.Repr[T] "akka.stream.scaladsl.Source") [`Flow.map`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html#map(akka.japi.function.Function) "akka.stream.javadsl.Flow")[`Flow.map`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html#map[T](f:Out=>T):FlowOps.this.Repr[T] "akka.stream.scaladsl.Flow")

## Description

Transform each element in the stream by calling a mapping function with it and passing the returned value downstream.

## Examples

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/operators/Map.scala#L8-L10 "Go to snippet source")import akka.NotUsed
import akka.stream.scaladsl._

val source: Source[Int, NotUsed] = Source(1 to 10)
val mapped: Source[String, NotUsed] = source.map(elem => elem.toString)
```

## Reactive Streams semantics

**emits** when the mapping function returns an element

**backpressures** when downstream backpressures

**completes** when upstream completes

## Code Examples

### Example 1: Examples

```scala
import akka.NotUsed
import akka.stream.scaladsl._

val source: Source[Int, NotUsed] = Source(1 to 10)
val mapped: Source[String, NotUsed] = source.map(elem => elem.toString)
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/logWithMarker.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/mapAsync.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/map.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/map.html)*