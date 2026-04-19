---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:27:52Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/mergePrioritizedN.html
title: mergePrioritizedN • Akka core
---

# mergePrioritizedN • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# mergePrioritizedN

Merge multiple sources with priorities.

[Fan\-in operators](../index.html#fan-in-operators)

## Signature

## Description

Merge multiple sources. Prefer sources depending on priorities if all sources have elements ready. If a subset of all sources have elements ready the relative priorities for those sources are used to prioritize. For example, when used with only three sources `sourceA`, `sourceB` and `sourceC`, the `sourceA` has a probability of `(priorityOfA) / (priorityOfA + priorityOfB + priorityOfC)` of being prioritized and similarly for the rest of the sources. The priorities for each source must be positive integers.

## Example

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-stream-tests/src/test/scala/akka/stream/scaladsl/FlowMergeSpec.scala#L163-L174 "Go to snippet source")import akka.stream.scaladsl.{ Sink, Source }

val sourceA = Source(List(1, 2, 3, 4))
val sourceB = Source(List(10, 20, 30, 40))
val sourceC = Source(List(100, 200, 300, 400))

Source
  .mergePrioritizedN(List((sourceA, 9900), (sourceB, 99), (sourceC, 1)), eagerComplete = false)
  .runWith(Sink.foreach(println))
// prints e.g. 1, 100, 2, 3, 4, 10, 20, 30, 40, 200, 300, 400  since both sources have their first element ready and
// the left sourceA has higher priority - if both sources have elements ready, sourceA has a 99% chance of being picked next
// while sourceB has a 0.99% chance and sourceC has a 0.01% chance
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/operators/SourceOrFlow.java#L252-L262 "Go to snippet source")Source<Integer, NotUsed> sourceA = Source.from(Arrays.asList(1, 2, 3, 4));
Source<Integer, NotUsed> sourceB = Source.from(Arrays.asList(10, 20, 30, 40));
Source<Integer, NotUsed> sourceC = Source.from(Arrays.asList(100, 200, 300, 400));
List<Pair<Source<Integer, ?>, Integer>> sourcesAndPriorities =
    Arrays.asList(new Pair<>(sourceA, 9900), new Pair<>(sourceB, 99), new Pair<>(sourceC, 1));
Source.mergePrioritizedN(sourcesAndPriorities, false).runForeach(System.out::println, system);
// prints e.g. 1, 100, 2, 3, 4, 10, 20, 30, 40, 200, 300, 400  since both sources have their
// first element ready and
// the left sourceA has higher priority - if both sources have elements ready, sourceA has a 99%
// chance of being picked next
// while sourceB has a 0.99% chance and sourceC has a 0.01% chance
```

## Reactive Streams semantics

**emits** when one of the inputs has an element available, preferring inputs based on their priorities if multiple have elements available

**backpressures** when downstream backpressures

**completes** when all upstreams complete (or when any upstream completes if `eagerComplete=true`.)

**Cancels when** downstream cancels

## Code Examples

### Example 1: Example

```scala
import akka.stream.scaladsl.{ Sink, Source }

val sourceA = Source(List(1, 2, 3, 4))
val sourceB = Source(List(10, 20, 30, 40))
val sourceC = Source(List(100, 200, 300, 400))

Source
  .mergePrioritizedN(List((sourceA, 9900), (sourceB, 99), (sourceC, 1)), eagerComplete = false)
  .runWith(Sink.foreach(println))
// prints e.g. 1, 100, 2, 3, 4, 10, 20, 30, 40, 200, 300, 400  since both sources have their first element ready and
// the left sourceA has higher priority - if both sources have elements ready, sourceA has a 99% chance of being picked next
// while sourceB has a 0.99% chance and sourceC has a 0.01% chance
```

### Example 2: Example

```java
Source<Integer, NotUsed> sourceA = Source.from(Arrays.asList(1, 2, 3, 4));
Source<Integer, NotUsed> sourceB = Source.from(Arrays.asList(10, 20, 30, 40));
Source<Integer, NotUsed> sourceC = Source.from(Arrays.asList(100, 200, 300, 400));
List<Pair<Source<Integer, ?>, Integer>> sourcesAndPriorities =
    Arrays.asList(new Pair<>(sourceA, 9900), new Pair<>(sourceB, 99), new Pair<>(sourceC, 1));
Source.mergePrioritizedN(sourcesAndPriorities, false).runForeach(System.out::println, system);
// prints e.g. 1, 100, 2, 3, 4, 10, 20, 30, 40, 200, 300, 400  since both sources have their
// first element ready and
// the left sourceA has higher priority - if both sources have elements ready, sourceA has a 99%
// chance of being picked next
// while sourceB has a 0.99% chance and sourceC has a 0.01% chance
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/libraries/akka-core/current/stream/operators/MergeSequence.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/mergePrioritized.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/mergePrioritizedN.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/mergePrioritizedN.html)*