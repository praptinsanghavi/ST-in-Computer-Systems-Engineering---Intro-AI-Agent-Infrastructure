---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:27:46Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/concat.html
title: concat • Akka core
---

# concat • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# concat

After completion of the original upstream the elements of the given source will be emitted.

[Fan\-in operators](../index.html#fan-in-operators)

## Signature

[`Source.concat`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html#concat(akka.stream.Graph) "akka.stream.javadsl.Source")[`Source.concat`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html#concat[U>:Out,Mat2](that:akka.stream.Graph[akka.stream.SourceShape[U],Mat2]):FlowOps.this.Repr[U] "akka.stream.scaladsl.Source") [`Flow.concat`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html#concat(akka.stream.Graph) "akka.stream.javadsl.Flow")[`Flow.concat`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html#concat[U>:Out,Mat2](that:akka.stream.Graph[akka.stream.SourceShape[U],Mat2]):FlowOps.this.Repr[U] "akka.stream.scaladsl.Flow")

## Description

After completion of the original upstream the elements of the given source will be emitted.

Both streams will be materialized together.

Note
The `concat` operator is for backwards compatibility reasons “detached” and will eagerly demand an element from both upstreams when the stream is materialized and will then have a one element buffer for each of the upstreams, this is most often not what you want, instead use [`concatLazy`](concatLazy.html)

## Example

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-stream-tests/src/test/scala/akka/stream/scaladsl/FlowConcatSpec.scala#L249-L254 "Go to snippet source")  
val sourceA = Source(List(1, 2, 3, 4))
val sourceB = Source(List(10, 20, 30, 40))

sourceA.concat(sourceB).runWith(Sink.foreach(println))
//prints 1, 2, 3, 4, 10, 20, 30, 40
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/operators/SourceOrFlow.java#L31-L151 "Go to snippet source")import akka.stream.javadsl.Keep;
import akka.stream.javadsl.Source;
import akka.stream.javadsl.Sink;

import java.util.*;

Source<Integer, NotUsed> sourceA = Source.from(Arrays.asList(1, 2, 3, 4));
Source<Integer, NotUsed> sourceB = Source.from(Arrays.asList(10, 20, 30, 40));
sourceA.concat(sourceB).runForeach(System.out::println, system);
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

sourceA.concat(sourceB).runWith(Sink.foreach(println))
//prints 1, 2, 3, 4, 10, 20, 30, 40
```

### Example 2: Example

```java
import akka.stream.javadsl.Keep;
import akka.stream.javadsl.Source;
import akka.stream.javadsl.Sink;

import java.util.*;

Source<Integer, NotUsed> sourceA = Source.from(Arrays.asList(1, 2, 3, 4));
Source<Integer, NotUsed> sourceB = Source.from(Arrays.asList(10, 20, 30, 40));
sourceA.concat(sourceB).runForeach(System.out::println, system);
// prints 1, 2, 3, 4, 10, 20, 30, 40
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/completionTimeout.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/concatAllLazy.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/concatLazy.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/concat.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/concat.html)*