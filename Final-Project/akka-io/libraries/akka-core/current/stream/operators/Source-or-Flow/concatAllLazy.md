---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:27:47Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/concatAllLazy.html
title: concatAllLazy • Akka core
---

# concatAllLazy • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# concatAllLazy

After completion of the original upstream the elements of the given sources will be emitted sequentially.

[Fan\-in operators](../index.html#fan-in-operators)

## Signature

[`Source.concatAllLazy`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html#concatAllLazy(akka.stream.Graph*) "akka.stream.javadsl.Source")[`Source.concatAllLazy`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html#concatAllLazy[U>:Out](those:akka.stream.Graph[akka.stream.SourceShape[U],_]*):FlowOps.this.Repr[U] "akka.stream.scaladsl.Source") [`Flow.concatAllLazy`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html#concatAllLazy(akka.stream.Graph*) "akka.stream.javadsl.Flow")[`Flow.concatAllLazy`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html#concatAllLazy[U>:Out](those:akka.stream.Graph[akka.stream.SourceShape[U],_]*):FlowOps.this.Repr[U] "akka.stream.scaladsl.Flow")

## Description

After completion of the original upstream the elements of the given sources will be emitted sequentially.

Both streams will be materialized together, however, the given streams will be pulled for the first time only after the original upstream was completed. 

To defer the materialization of the given sources (or to completely avoid its materialization if the original upstream fails or cancels), wrap it into [`Source.lazySource`](../Source/lazySource.html).

## Example

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-stream-tests/src/test/scala/akka/stream/scaladsl/FlowConcatAllLazySpec.scala#L89-L96 "Go to snippet source")val sourceA = Source(List(1, 2, 3))
val sourceB = Source(List(4, 5, 6))
val sourceC = Source(List(7, 8, 9))
sourceA
  .concatAllLazy(sourceB, sourceC)
  .fold(new StringJoiner(","))((joiner, input) => joiner.add(String.valueOf(input)))
  .runWith(Sink.foreach(println))
//prints 1,2,3,4,5,6,7,8,9
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/operators/SourceOrFlow.java#L31-L174 "Go to snippet source")import akka.stream.javadsl.Keep;
import akka.stream.javadsl.Source;
import akka.stream.javadsl.Sink;

import java.util.*;

Source<Integer, NotUsed> sourceA = Source.from(Arrays.asList(1, 2, 3));
Source<Integer, NotUsed> sourceB = Source.from(Arrays.asList(4, 5, 6));
Source<Integer, NotUsed> sourceC = Source.from(Arrays.asList(7, 8, 9));
sourceA
    .concatAllLazy(sourceB, sourceC)
    .fold(new StringJoiner(","), (joiner, input) -> joiner.add(String.valueOf(input)))
    .runForeach(System.out::println, system);
// prints 1,2,3,4,5,6,7,8,9
```

## Reactive Streams semantics

**emits** when the current stream has an element available; if the current input completes, it tries the next one

**backpressures** when downstream backpressures

**completes** when all upstreams complete

## Code Examples

### Example 1: Example

```scala
val sourceA = Source(List(1, 2, 3))
val sourceB = Source(List(4, 5, 6))
val sourceC = Source(List(7, 8, 9))
sourceA
  .concatAllLazy(sourceB, sourceC)
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

Source<Integer, NotUsed> sourceA = Source.from(Arrays.asList(1, 2, 3));
Source<Integer, NotUsed> sourceB = Source.from(Arrays.asList(4, 5, 6));
Source<Integer, NotUsed> sourceC = Source.from(Arrays.asList(7, 8, 9));
sourceA
    .concatAllLazy(sourceB, sourceC)
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
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/concat.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/concatLazy.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/lazySource.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/concatAllLazy.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/concatAllLazy.html)*