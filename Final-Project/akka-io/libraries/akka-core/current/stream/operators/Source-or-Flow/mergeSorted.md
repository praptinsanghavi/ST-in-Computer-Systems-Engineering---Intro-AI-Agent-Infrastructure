---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:27:51Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/mergeSorted.html
title: mergeSorted • Akka core
---

# mergeSorted • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# mergeSorted

Merge multiple sources.

[Fan\-in operators](../index.html#fan-in-operators)

## Signature

[`Source.mergeSorted`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html#mergeSorted(akka.stream.Graph,java.util.Comparator) "akka.stream.javadsl.Source")[`Source.mergeSorted`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html#mergeSorted[U>:Out,M](that:akka.stream.Graph[akka.stream.SourceShape[U],M])(implicitord:Ordering[U]):FlowOps.this.Repr[U] "akka.stream.scaladsl.Source") [`Flow.mergeSorted`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html#mergeSorted(akka.stream.Graph,java.util.Comparator) "akka.stream.javadsl.Flow")[`Flow.mergeSorted`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html#mergeSorted[U>:Out,M](that:akka.stream.Graph[akka.stream.SourceShape[U],M])(implicitord:Ordering[U]):FlowOps.this.Repr[U] "akka.stream.scaladsl.Flow")

## Description

Merge multiple sources. Waits for one element to be ready from each input stream and emits the smallest element.

## Example

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-stream-tests/src/test/scala/akka/stream/scaladsl/FlowMergeSpec.scala#L180-L191 "Go to snippet source")import akka.stream.scaladsl.{ Sink, Source }

val sourceA = Source(List(1, 3, 5, 7))
val sourceB = Source(List(2, 4, 6, 8))

sourceA.mergeSorted(sourceB).runWith(Sink.foreach(println))
//prints 1, 2, 3, 4, 5, 6, 7, 8

val sourceC = Source(List(20, 1, 1, 1))

sourceA.mergeSorted(sourceC).runWith(Sink.foreach(println))
//prints 1, 3, 5, 7, 20, 1, 1, 1
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/operators/SourceOrFlow.java#L31-L279 "Go to snippet source")import akka.stream.javadsl.Keep;
import akka.stream.javadsl.Source;
import akka.stream.javadsl.Sink;

import java.util.*;

Source<Integer, NotUsed> sourceA = Source.from(Arrays.asList(1, 3, 5, 7));
Source<Integer, NotUsed> sourceB = Source.from(Arrays.asList(2, 4, 6, 8));
sourceA
    .mergeSorted(sourceB, Comparator.<Integer>naturalOrder())
    .runForeach(System.out::println, system);
// prints 1, 2, 3, 4, 5, 6, 7, 8

Source<Integer, NotUsed> sourceC = Source.from(Arrays.asList(20, 1, 1, 1));
sourceA
    .mergeSorted(sourceC, Comparator.<Integer>naturalOrder())
    .runForeach(System.out::println, system);
// prints 1, 3, 5, 7, 20, 1, 1, 1
```

## Reactive Streams semantics

**emits** when all of the inputs have an element available

**backpressures** when downstream backpressures

**completes** when all upstreams complete

## Code Examples

### Example 1: Example

```scala
import akka.stream.scaladsl.{ Sink, Source }

val sourceA = Source(List(1, 3, 5, 7))
val sourceB = Source(List(2, 4, 6, 8))

sourceA.mergeSorted(sourceB).runWith(Sink.foreach(println))
//prints 1, 2, 3, 4, 5, 6, 7, 8

val sourceC = Source(List(20, 1, 1, 1))

sourceA.mergeSorted(sourceC).runWith(Sink.foreach(println))
//prints 1, 3, 5, 7, 20, 1, 1, 1
```

### Example 2: Example

```java
import akka.stream.javadsl.Keep;
import akka.stream.javadsl.Source;
import akka.stream.javadsl.Sink;

import java.util.*;

Source<Integer, NotUsed> sourceA = Source.from(Arrays.asList(1, 3, 5, 7));
Source<Integer, NotUsed> sourceB = Source.from(Arrays.asList(2, 4, 6, 8));
sourceA
    .mergeSorted(sourceB, Comparator.<Integer>naturalOrder())
    .runForeach(System.out::println, system);
// prints 1, 2, 3, 4, 5, 6, 7, 8

Source<Integer, NotUsed> sourceC = Source.from(Arrays.asList(20, 1, 1, 1));
sourceA
    .mergeSorted(sourceC, Comparator.<Integer>naturalOrder())
    .runForeach(System.out::println, system);
// prints 1, 3, 5, 7, 20, 1, 1, 1
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/MergeSequence.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/monitor.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/mergeSorted.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/mergeSorted.html)*