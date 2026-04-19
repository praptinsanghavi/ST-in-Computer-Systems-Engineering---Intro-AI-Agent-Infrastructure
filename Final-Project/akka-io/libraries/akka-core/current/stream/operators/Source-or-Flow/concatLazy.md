---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:27:48Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/concatLazy.html
title: concatLazy • Akka core
---

# concatLazy • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# concatLazy

After completion of the original upstream the elements of the given source will be emitted.

[Fan\-in operators](../index.html#fan-in-operators)

## Signature

[`Source.concat`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html#concatLazy(akka.stream.Graph) "akka.stream.javadsl.Source")[`Source.concat`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html#concatLazy[U>:Out,Mat2](that:akka.stream.Graph[akka.stream.SourceShape[U],Mat2]):FlowOps.this.Repr[U] "akka.stream.scaladsl.Source") [`Flow.concat`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html#concatLazy(akka.stream.Graph) "akka.stream.javadsl.Flow")[`Flow.concat`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html#concatLazy[U>:Out,Mat2](that:akka.stream.Graph[akka.stream.SourceShape[U],Mat2]):FlowOps.this.Repr[U] "akka.stream.scaladsl.Flow")

## Description

After completion of the original upstream the elements of the given source will be emitted.

Both streams will be materialized together, however, the given stream will be pulled for the first time only after the original upstream was completed. (In contrast, [`concat`](concat.html), introduces single\-element buffers after both, original and given sources so that the given source is also pulled once immediately.)

To defer the materialization of the given source (or to completely avoid its materialization if the original upstream fails or cancels), wrap it into [`Source.lazySource`](../Source/lazySource.html).

If materialized values needs to be collected `concatLazyMat` is available.

## Example

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-stream-tests/src/test/scala/akka/stream/scaladsl/FlowConcatSpec.scala#L287-L290 "Go to snippet source")val sourceA = Source(List(1, 2, 3, 4))
val sourceB = Source(List(10, 20, 30, 40))

sourceA.concatLazy(sourceB).runWith(Sink.foreach(println))
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/operators/SourceOrFlow.java#L31-L161 "Go to snippet source")import akka.stream.javadsl.Keep;
import akka.stream.javadsl.Source;
import akka.stream.javadsl.Sink;

import java.util.*;

Source<Integer, NotUsed> sourceA = Source.from(Arrays.asList(1, 2, 3, 4));
Source<Integer, NotUsed> sourceB = Source.from(Arrays.asList(10, 20, 30, 40));
sourceA.concatLazy(sourceB).runForeach(System.out::println, system);
// prints 1, 2, 3, 4, 10, 20, 30, 40

```

## Reactive Streams semantics

**emits** when the current stream has an element available; if the current input completes, it tries the next one

**backpressures** when downstream backpressures

**completes** when all upstreams complete

## Code Examples

### Example 1: Example

```scala
val sourceA = Source(List(1, 2, 3, 4))
val sourceB = Source(List(10, 20, 30, 40))

sourceA.concatLazy(sourceB).runWith(Sink.foreach(println))
```

### Example 2: Example

```java
import akka.stream.javadsl.Keep;
import akka.stream.javadsl.Source;
import akka.stream.javadsl.Sink;

import java.util.*;

Source<Integer, NotUsed> sourceA = Source.from(Arrays.asList(1, 2, 3, 4));
Source<Integer, NotUsed> sourceB = Source.from(Arrays.asList(10, 20, 30, 40));
sourceA.concatLazy(sourceB).runForeach(System.out::println, system);
// prints 1, 2, 3, 4, 10, 20, 30, 40
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/concat.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/concatAllLazy.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/conflate.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/lazySource.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/concatLazy.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/concatLazy.html)*