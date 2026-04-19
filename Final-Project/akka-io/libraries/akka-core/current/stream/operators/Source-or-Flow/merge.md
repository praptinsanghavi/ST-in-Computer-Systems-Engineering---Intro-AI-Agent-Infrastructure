---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:27:48Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/merge.html
title: merge • Akka core
---

# merge • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# merge

Merge multiple sources.

[Fan\-in operators](../index.html#fan-in-operators)

## Signature

[`Source.merge`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html#merge(akka.stream.Graph) "akka.stream.javadsl.Source")[`Source.merge`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html#merge[U>:Out,M](that:akka.stream.Graph[akka.stream.SourceShape[U],M],eagerComplete:Boolean):FlowOps.this.Repr[U] "akka.stream.scaladsl.Source") [`Flow.merge`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html#merge(akka.stream.Graph) "akka.stream.javadsl.Flow")[`Flow.merge`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html#merge[U>:Out,M](that:akka.stream.Graph[akka.stream.SourceShape[U],M],eagerComplete:Boolean):FlowOps.this.Repr[U] "akka.stream.scaladsl.Flow")

## Description

Merge multiple sources. Picks elements randomly if all sources has elements ready.

## Example

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-stream-tests/src/test/scala/akka/stream/scaladsl/FlowMergeSpec.scala#L197-L203 "Go to snippet source")import akka.stream.scaladsl.{ Sink, Source }

val sourceA = Source(List(1, 2, 3, 4))
val sourceB = Source(List(10, 20, 30, 40))

sourceA.merge(sourceB).runWith(Sink.foreach(println))
// merging is not deterministic, can for example print 1, 2, 3, 4, 10, 20, 30, 40
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/operators/SourceOrFlow.java#L31-L207 "Go to snippet source")import akka.stream.javadsl.Keep;
import akka.stream.javadsl.Source;
import akka.stream.javadsl.Sink;

import java.util.*;

Source<Integer, NotUsed> sourceA = Source.from(Arrays.asList(1, 2, 3, 4));
Source<Integer, NotUsed> sourceB = Source.from(Arrays.asList(10, 20, 30, 40));
sourceA.merge(sourceB).runForeach(System.out::println, system);
// merging is not deterministic, can for example print 1, 2, 3, 4, 10, 20, 30, 40

```

## Reactive Streams semantics

**emits** when one of the inputs has an element available

**backpressures** when downstream backpressures

**completes** when all upstreams complete (This behavior is changeable to completing when any upstream completes by setting `eagerComplete=true`.)

## Code Examples

### Example 1: Example

```scala
import akka.stream.scaladsl.{ Sink, Source }

val sourceA = Source(List(1, 2, 3, 4))
val sourceB = Source(List(10, 20, 30, 40))

sourceA.merge(sourceB).runWith(Sink.foreach(println))
// merging is not deterministic, can for example print 1, 2, 3, 4, 10, 20, 30, 40
```

### Example 2: Example

```java
import akka.stream.javadsl.Keep;
import akka.stream.javadsl.Source;
import akka.stream.javadsl.Sink;

import java.util.*;

Source<Integer, NotUsed> sourceA = Source.from(Arrays.asList(1, 2, 3, 4));
Source<Integer, NotUsed> sourceB = Source.from(Arrays.asList(10, 20, 30, 40));
sourceA.merge(sourceB).runForeach(System.out::println, system);
// merging is not deterministic, can for example print 1, 2, 3, 4, 10, 20, 30, 40
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/mergeAll.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/maybe.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/merge.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/merge.html)*