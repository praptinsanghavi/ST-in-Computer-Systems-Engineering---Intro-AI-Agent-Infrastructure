---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:27:50Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/mergePreferred.html
title: mergePreferred • Akka core
---

# mergePreferred • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# mergePreferred

Merge multiple sources.

[Fan\-in operators](../index.html#fan-in-operators)

## Signature

[`Source.mergePreferred`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html#mergePreferred(akka.stream.Graph,boolean,boolean) "akka.stream.javadsl.Source")[`Source.mergePreferred`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html#mergePreferred[U>:Out,M](that:akka.stream.Graph[akka.stream.SourceShape[U],M],preferred:Boolean,eagerComplete:Boolean):FlowOps.this.Repr[U] "akka.stream.scaladsl.Source") [`Flow.mergePreferred`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html#mergePreferred(akka.stream.Graph,boolean,boolean) "akka.stream.javadsl.Flow")[`Flow.mergePreferred`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html#mergePreferred[U>:Out,M](that:akka.stream.Graph[akka.stream.SourceShape[U],M],preferred:Boolean,eagerComplete:Boolean):FlowOps.this.Repr[U] "akka.stream.scaladsl.Flow")

## Description

Merge multiple sources. If all sources have elements ready, emit the preferred source first. Then emit the preferred source again if another element is pushed. Otherwise, emit all the secondary sources. Repeat until streams are empty. For the case with two sources, when `preferred` is set to true then prefer the right source, otherwise prefer the left source (see examples).

## Example

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-stream-tests/src/test/scala/akka/stream/scaladsl/FlowMergeSpec.scala#L134-L143 "Go to snippet source")import akka.stream.scaladsl.{ Sink, Source }

val sourceA = Source(List(1, 2, 3, 4))
val sourceB = Source(List(10, 20, 30, 40))

sourceA.mergePreferred(sourceB, false).runWith(Sink.foreach(println))
// prints 1, 10, ... since both sources have their first element ready and the left source is preferred

sourceA.mergePreferred(sourceB, true).runWith(Sink.foreach(println))
// prints 10, 1, ... since both sources have their first element ready and the right source is preferred
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/operators/SourceOrFlow.java#L225-L234 "Go to snippet source")Source<Integer, NotUsed> sourceA = Source.from(Arrays.asList(1, 2, 3, 4));
Source<Integer, NotUsed> sourceB = Source.from(Arrays.asList(10, 20, 30, 40));

sourceA.mergePreferred(sourceB, false, false).runForeach(System.out::println, system);
// prints 1, 10, ... since both sources have their first element ready and the left source is
// preferred

sourceA.mergePreferred(sourceB, true, false).runForeach(System.out::println, system);
// prints 10, 1, ... since both sources have their first element ready and the right source is
// preferred
```

## Reactive Streams semantics

**emits** when one of the inputs has an element available, preferring a defined input if multiple have elements available

**backpressures** when downstream backpressures

**completes** when all upstreams complete (This behavior is changeable to completing when any upstream completes by setting `eagerComplete=true`.)

## Code Examples

### Example 1: Example

```scala
import akka.stream.scaladsl.{ Sink, Source }

val sourceA = Source(List(1, 2, 3, 4))
val sourceB = Source(List(10, 20, 30, 40))

sourceA.mergePreferred(sourceB, false).runWith(Sink.foreach(println))
// prints 1, 10, ... since both sources have their first element ready and the left source is preferred

sourceA.mergePreferred(sourceB, true).runWith(Sink.foreach(println))
// prints 10, 1, ... since both sources have their first element ready and the right source is preferred
```

### Example 2: Example

```java
Source<Integer, NotUsed> sourceA = Source.from(Arrays.asList(1, 2, 3, 4));
Source<Integer, NotUsed> sourceB = Source.from(Arrays.asList(10, 20, 30, 40));

sourceA.mergePreferred(sourceB, false, false).runForeach(System.out::println, system);
// prints 1, 10, ... since both sources have their first element ready and the left source is
// preferred

sourceA.mergePreferred(sourceB, true, false).runForeach(System.out::println, system);
// prints 10, 1, ... since both sources have their first element ready and the right source is
// preferred
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/mergeLatest.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/mergePrioritized.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/mergePreferred.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/mergePreferred.html)*