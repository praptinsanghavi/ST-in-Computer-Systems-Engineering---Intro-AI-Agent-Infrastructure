---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:27:48Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/interleave.html
title: interleave • Akka core
---

# interleave • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# interleave

Emits a specifiable number of elements from the original source, then from the provided source and repeats.

[Fan\-in operators](../index.html#fan-in-operators)

## Signature

[`Source.interleave`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html#interleave(akka.stream.Graph,int,boolean) "akka.stream.javadsl.Source")[`Source.interleave`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html#interleave[U>:Out](that:akka.stream.Graph[akka.stream.SourceShape[U],_],segmentSize:Int,eagerClose:Boolean):FlowOps.this.Repr[U] "akka.stream.scaladsl.Source") [`Flow.interleave`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html#interleave(akka.stream.Graph,int,boolean) "akka.stream.javadsl.Flow")[`Flow.interleave`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html#interleave[U>:Out](that:akka.stream.Graph[akka.stream.SourceShape[U],_],segmentSize:Int,eagerClose:Boolean):FlowOps.this.Repr[U] "akka.stream.scaladsl.Flow")

## Description

Emits a specifiable number of elements from the original source, then from the provided source and repeats. If one source completes the rest of the other stream will be emitted.

## Example

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-stream-tests/src/test/scala/akka/stream/scaladsl/FlowInterleaveSpec.scala#L244-L251 "Go to snippet source")import akka.stream.scaladsl.Sink
import akka.stream.scaladsl.Source

val sourceA = Source(List(1, 2, 3, 4))
val sourceB = Source(List(10, 20, 30, 40))

sourceA.interleave(sourceB, segmentSize = 2).runWith(Sink.foreach(println))
//prints 1, 2, 10, 20, 3, 4, 30, 40
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/operators/SourceOrFlow.java#L31-L184 "Go to snippet source")import akka.stream.javadsl.Keep;
import akka.stream.javadsl.Source;
import akka.stream.javadsl.Sink;

import java.util.*;

Source<Integer, NotUsed> sourceA = Source.from(Arrays.asList(1, 2, 3, 4));
Source<Integer, NotUsed> sourceB = Source.from(Arrays.asList(10, 20, 30, 40));
sourceA.interleave(sourceB, 2).runForeach(System.out::println, system);
// prints 1, 2, 10, 20, 3, 4, 30, 40

```

## Reactive Streams semantics

**emits** when element is available from the currently consumed upstream

**backpressures** when upstream backpressures

**completes** when both upstreams have completed

## Code Examples

### Example 1: Example

```scala
import akka.stream.scaladsl.Sink
import akka.stream.scaladsl.Source

val sourceA = Source(List(1, 2, 3, 4))
val sourceB = Source(List(10, 20, 30, 40))

sourceA.interleave(sourceB, segmentSize = 2).runWith(Sink.foreach(println))
//prints 1, 2, 10, 20, 3, 4, 30, 40
```

### Example 2: Example

```java
import akka.stream.javadsl.Keep;
import akka.stream.javadsl.Source;
import akka.stream.javadsl.Sink;

import java.util.*;

Source<Integer, NotUsed> sourceA = Source.from(Arrays.asList(1, 2, 3, 4));
Source<Integer, NotUsed> sourceB = Source.from(Arrays.asList(10, 20, 30, 40));
sourceA.interleave(sourceB, 2).runForeach(System.out::println, system);
// prints 1, 2, 10, 20, 3, 4, 30, 40
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/initialTimeout.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/interleaveAll.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/interleave.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/interleave.html)*