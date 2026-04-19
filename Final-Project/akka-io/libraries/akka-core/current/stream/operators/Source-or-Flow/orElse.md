---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:27:51Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/orElse.html
title: orElse • Akka core
---

# orElse • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# orElse

If the primary source completes without emitting any elements, the elements from the secondary source are emitted.

[Fan\-in operators](../index.html#fan-in-operators)

## Signature

[`Source.orElse`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html#orElse(akka.stream.Graph) "akka.stream.javadsl.Source")[`Source.orElse`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html#orElse[U>:Out,Mat2](secondary:akka.stream.Graph[akka.stream.SourceShape[U],Mat2]):FlowOps.this.Repr[U] "akka.stream.scaladsl.Source") [`Flow.orElse`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html#orElse(akka.stream.Graph) "akka.stream.javadsl.Flow")[`Flow.orElse`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html#orElse[U>:Out,Mat2](secondary:akka.stream.Graph[akka.stream.SourceShape[U],Mat2]):FlowOps.this.Repr[U] "akka.stream.scaladsl.Flow")

## Description

If the primary source completes without emitting any elements, the elements from the secondary source are emitted. If the primary source emits any elements the secondary source is cancelled.

Note that both sources are materialized directly and the secondary source is backpressured until it becomes the source of elements or is cancelled.

Signal errors downstream, regardless which of the two sources emitted the error.

## Example

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-stream-tests/src/test/scala/akka/stream/scaladsl/FlowOrElseSpec.scala#L137-L145 "Go to snippet source")val source1 = Source(List("First source"))
val source2 = Source(List("Second source"))
val emptySource = Source.empty[String]

source1.orElse(source2).runWith(Sink.foreach(println))
// this will print "First source"

emptySource.orElse(source2).runWith(Sink.foreach(println))
// this will print "Second source"
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/operators/SourceOrFlow.java#L31-L294 "Go to snippet source")import akka.stream.javadsl.Keep;
import akka.stream.javadsl.Source;
import akka.stream.javadsl.Sink;

import java.util.*;

Source<String, NotUsed> source1 = Source.from(Arrays.asList("First source"));
Source<String, NotUsed> source2 = Source.from(Arrays.asList("Second source"));
Source<String, NotUsed> emptySource = Source.empty();

source1.orElse(source2).runForeach(System.out::println, system);
// this will print "First source"

emptySource.orElse(source2).runForeach(System.out::println, system);
// this will print "Second source"

```

## Reactive Streams semantics

**emits** when an element is available from first stream or first stream closed without emitting any elements and an element is available from the second stream

**backpressures** when downstream backpressures

**completes** the primary stream completes after emitting at least one element, when the primary stream completes without emitting and the secondary stream already has completed or when the secondary stream completes

## Code Examples

### Example 1: Example

```scala
val source1 = Source(List("First source"))
val source2 = Source(List("Second source"))
val emptySource = Source.empty[String]

source1.orElse(source2).runWith(Sink.foreach(println))
// this will print "First source"

emptySource.orElse(source2).runWith(Sink.foreach(println))
// this will print "Second source"
```

### Example 2: Example

```java
import akka.stream.javadsl.Keep;
import akka.stream.javadsl.Source;
import akka.stream.javadsl.Sink;

import java.util.*;

Source<String, NotUsed> source1 = Source.from(Arrays.asList("First source"));
Source<String, NotUsed> source2 = Source.from(Arrays.asList("Second source"));
Source<String, NotUsed> emptySource = Source.empty();

source1.orElse(source2).runForeach(System.out::println, system);
// this will print "First source"

emptySource.orElse(source2).runForeach(System.out::println, system);
// this will print "Second source"
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Partition.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/RestartFlow/onFailuresWithBackoff.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/orElse.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/orElse.html)*