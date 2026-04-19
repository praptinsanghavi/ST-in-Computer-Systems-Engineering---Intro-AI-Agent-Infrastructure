---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:27:50Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/mergePrioritized.html
title: mergePrioritized • Akka core
---

# mergePrioritized • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# mergePrioritized

Merge multiple sources.

[Fan\-in operators](../index.html#fan-in-operators)

## Signature

[`Source.mergePrioritized`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html#mergePrioritized(akka.stream.Graph,int,int,boolean) "akka.stream.javadsl.Source")[`Source.mergePrioritized`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html#mergePrioritized[U>:Out,M](that:akka.stream.Graph[akka.stream.SourceShape[U],M],leftPriority:Int,rightPriority:Int,eagerComplete:Boolean):FlowOps.this.Repr[U] "akka.stream.scaladsl.Source") [`Flow.mergePrioritized`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html#mergePrioritized(akka.stream.Graph,int,int,boolean) "akka.stream.javadsl.Flow")[`Flow.mergePrioritized`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html#mergePrioritized[U>:Out,M](that:akka.stream.Graph[akka.stream.SourceShape[U],M],leftPriority:Int,rightPriority:Int,eagerComplete:Boolean):FlowOps.this.Repr[U] "akka.stream.scaladsl.Flow")

## Description

Merge multiple sources. Prefer sources depending on priorities if all sources have elements ready. If a subset of all sources have elements ready the relative priorities for those sources are used to prioritize. For example, when used with only two sources, the left source has a probability of `(leftPriority) / (leftPriority + rightPriority)` of being prioritized and similarly for the right source. The priorities for each source must be positive integers. 

## Example

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-stream-tests/src/test/scala/akka/stream/scaladsl/FlowMergeSpec.scala#L149-L157 "Go to snippet source")import akka.stream.scaladsl.{ Sink, Source }

val sourceA = Source(List(1, 2, 3, 4))
val sourceB = Source(List(10, 20, 30, 40))

sourceA.mergePrioritized(sourceB, 99, 1).runWith(Sink.foreach(println))
// prints e.g. 1, 10, 2, 3, 4, 20, 30, 40 since both sources have their first element ready and the left source
// has higher priority – if both sources have elements ready, sourceA has a 99% chance of being picked next
// while sourceB has a 1% chance
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/operators/SourceOrFlow.java#L240-L246 "Go to snippet source")Source<Integer, NotUsed> sourceA = Source.from(Arrays.asList(1, 2, 3, 4));
Source<Integer, NotUsed> sourceB = Source.from(Arrays.asList(10, 20, 30, 40));

sourceA.mergePrioritized(sourceB, 99, 1, false).runForeach(System.out::println, system);
// prints e.g. 1, 10, 2, 3, 4, 20, 30, 40 since both sources have their first element ready and
// the left source has higher priority – if both sources have elements ready, sourceA has a
// 99% chance of being picked next while sourceB has a 1% chance
```

## Reactive Streams semantics

**emits** when one of the inputs has an element available, preferring inputs based on their priorities if multiple have elements available

**backpressures** when downstream backpressures

**completes** when all upstreams complete (This behavior is changeable to completing when any upstream completes by setting `eagerComplete=true`.)

## Code Examples

### Example 1: Example

```scala
import akka.stream.scaladsl.{ Sink, Source }

val sourceA = Source(List(1, 2, 3, 4))
val sourceB = Source(List(10, 20, 30, 40))

sourceA.mergePrioritized(sourceB, 99, 1).runWith(Sink.foreach(println))
// prints e.g. 1, 10, 2, 3, 4, 20, 30, 40 since both sources have their first element ready and the left source
// has higher priority – if both sources have elements ready, sourceA has a 99% chance of being picked next
// while sourceB has a 1% chance
```

### Example 2: Example

```java
Source<Integer, NotUsed> sourceA = Source.from(Arrays.asList(1, 2, 3, 4));
Source<Integer, NotUsed> sourceB = Source.from(Arrays.asList(10, 20, 30, 40));

sourceA.mergePrioritized(sourceB, 99, 1, false).runForeach(System.out::println, system);
// prints e.g. 1, 10, 2, 3, 4, 20, 30, 40 since both sources have their first element ready and
// the left source has higher priority – if both sources have elements ready, sourceA has a
// 99% chance of being picked next while sourceB has a 1% chance
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/mergePreferred.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/mergePrioritizedN.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/mergePrioritized.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/mergePrioritized.html)*