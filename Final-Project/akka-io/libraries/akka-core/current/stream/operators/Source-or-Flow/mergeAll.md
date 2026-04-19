---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:27:50Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/mergeAll.html
title: mergeAll • Akka core
---

# mergeAll • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# mergeAll

Merge multiple sources.

[Fan\-in operators](../index.html#fan-in-operators)

## Signature

[`Source.mergeAll`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html#mergeAll(java.util.List,boolean) "akka.stream.javadsl.Source")[`Source.mergeAll`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html#mergeAll[U>:Out,M](those:immutable.Seq[akka.stream.Graph[akka.stream.SourceShape[U],M]],eagerComplete:Boolean):FlowOps.this.Repr[U] "akka.stream.scaladsl.Source") [`Flow.mergeAll`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html#mergeAll(java.util.List,boolean) "akka.stream.javadsl.Flow")[`Flow.mergeAll`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html#mergeAll[U>:Out,M](those:immutable.Seq[akka.stream.Graph[akka.stream.SourceShape[U],M]],eagerComplete:Boolean):FlowOps.this.Repr[U] "akka.stream.scaladsl.Flow")

## Description

Merge multiple sources. Picks elements randomly if all sources has elements ready.

## Example

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-stream-tests/src/test/scala/akka/stream/scaladsl/FlowMergeAllSpec.scala#L48-L52 "Go to snippet source")val sourceA = Source(1 to 3)
val sourceB = Source(4 to 6)
val sourceC = Source(7 to 10)
sourceA.mergeAll(List(sourceB, sourceC), eagerComplete = false).runForeach(println)
// merging is not deterministic, can for example print 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/operators/SourceOrFlow.java#L213-L219 "Go to snippet source")Source<Integer, NotUsed> sourceA = Source.from(Arrays.asList(1, 2, 3));
Source<Integer, NotUsed> sourceB = Source.from(Arrays.asList(4, 5, 6));
Source<Integer, NotUsed> sourceC = Source.from(Arrays.asList(7, 8, 9, 10));
sourceA
    .mergeAll(Arrays.asList(sourceB, sourceC), false)
    .runForeach(System.out::println, system);
// merging is not deterministic, can for example print 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
```

## Reactive Streams semantics

**emits** when one of the inputs has an element available

**backpressures** when downstream backpressures

**completes** when all upstreams complete (This behavior is changeable to completing when any upstream completes by setting `eagerComplete=true`.)

## Code Examples

### Example 1: Example

```scala
val sourceA = Source(1 to 3)
val sourceB = Source(4 to 6)
val sourceC = Source(7 to 10)
sourceA.mergeAll(List(sourceB, sourceC), eagerComplete = false).runForeach(println)
// merging is not deterministic, can for example print 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
```

### Example 2: Example

```java
Source<Integer, NotUsed> sourceA = Source.from(Arrays.asList(1, 2, 3));
Source<Integer, NotUsed> sourceB = Source.from(Arrays.asList(4, 5, 6));
Source<Integer, NotUsed> sourceC = Source.from(Arrays.asList(7, 8, 9, 10));
sourceA
    .mergeAll(Arrays.asList(sourceB, sourceC), false)
    .runForeach(System.out::println, system);
// merging is not deterministic, can for example print 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/merge.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/mergeLatest.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/mergeAll.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/mergeAll.html)*