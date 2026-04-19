---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:27:48Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/interleaveAll.html
title: interleaveAll • Akka core
---

# interleaveAll • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# interleaveAll

Emits a specifiable number of elements from the original source, then from the provided sources and repeats.

[Fan\-in operators](../index.html#fan-in-operators)

## Signature

[`Source.interleaveAll`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html#interleaveAll(java.util.List[akka.stream.Graph],int,boolean) "akka.stream.javadsl.Source")[`Source.interleaveAll`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html#interleaveAll[U>:Out](that:List[akka.stream.Graph[akka.stream.SourceShape[U],_]],segmentSize:Int,eagerClose:Boolean):FlowOps.this.Repr[U] "akka.stream.scaladsl.Source") [`Flow.interleaveAll`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html#interleaveAll(java.util.List[akka.stream.Graph],int,boolean) "akka.stream.javadsl.Flow")[`Flow.interleaveAll`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html#interleaveAll[U>:Out](that:List[akka.stream.Graph[akka.stream.SourceShape[U],_]],segmentSize:Int,eagerClose:Boolean):FlowOps.this.Repr[U] "akka.stream.scaladsl.Flow")

## Description

Emits a specifiable number of elements from the original source, then from the provided sources and repeats. If one source completes the rest of the other stream will be emitted when `eagerClose` is false, otherwise the flow is complete.

## Example

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-stream-tests/src/test/scala/akka/stream/scaladsl/FlowInterleaveAllSpec.scala#L104-L112 "Go to snippet source")val sourceA = Source(List(1, 2, 7, 8))
val sourceB = Source(List(3, 4, 9))
val sourceC = Source(List(5, 6))

sourceA
  .interleaveAll(List(sourceB, sourceC), 2, eagerClose = false)
  .fold(new StringJoiner(","))((joiner, input) => joiner.add(String.valueOf(input)))
  .runWith(Sink.foreach(println))
//prints 1,2,3,4,5,6,7,8,9
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/operators/SourceOrFlow.java#L31-L197 "Go to snippet source")import akka.stream.javadsl.Keep;
import akka.stream.javadsl.Source;
import akka.stream.javadsl.Sink;

import java.util.*;

Source<Integer, NotUsed> sourceA = Source.from(Arrays.asList(1, 2, 7, 8));
Source<Integer, NotUsed> sourceB = Source.from(Arrays.asList(3, 4, 9));
Source<Integer, NotUsed> sourceC = Source.from(Arrays.asList(5, 6));
sourceA
    .interleaveAll(Arrays.asList(sourceB, sourceC), 2, false)
    .fold(new StringJoiner(","), (joiner, input) -> joiner.add(String.valueOf(input)))
    .runForeach(System.out::println, system);
// prints 1,2,3,4,5,6,7,8,9
```

## Reactive Streams semantics

**emits** when element is available from the currently consumed upstream

**backpressures** when upstream backpressures

**completes** when all upstreams have completed if `eagerClose` is false, or any upstream completes if `eagerClose` is true.

## Code Examples

### Example 1: Example

```scala
val sourceA = Source(List(1, 2, 7, 8))
val sourceB = Source(List(3, 4, 9))
val sourceC = Source(List(5, 6))

sourceA
  .interleaveAll(List(sourceB, sourceC), 2, eagerClose = false)
  .fold(new StringJoiner(","))((joiner, input) => joiner.add(String.valueOf(input)))
  .runWith(Sink.foreach(println))
//prints 1,2,3,4,5,6,7,8,9
```

### Example 2: Example

```java
import akka.stream.javadsl.Keep;
import akka.stream.javadsl.Source;
import akka.stream.javadsl.Sink;

import java.util.*;

Source<Integer, NotUsed> sourceA = Source.from(Arrays.asList(1, 2, 7, 8));
Source<Integer, NotUsed> sourceB = Source.from(Arrays.asList(3, 4, 9));
Source<Integer, NotUsed> sourceC = Source.from(Arrays.asList(5, 6));
sourceA
    .interleaveAll(Arrays.asList(sourceB, sourceC), 2, false)
    .fold(new StringJoiner(","), (joiner, input) -> joiner.add(String.valueOf(input)))
    .runForeach(System.out::println, system);
// prints 1,2,3,4,5,6,7,8,9
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/interleave.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/intersperse.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/interleaveAll.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/interleaveAll.html)*