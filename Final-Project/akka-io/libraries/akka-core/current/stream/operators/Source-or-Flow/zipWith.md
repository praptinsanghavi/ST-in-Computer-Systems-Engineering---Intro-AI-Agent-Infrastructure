---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:27:56Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/zipWith.html
title: zipWith • Akka core
---

# zipWith • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# zipWith

Combines elements from multiple sources through a `combine` function and passes the returned value downstream.

[Fan\-in operators](../index.html#fan-in-operators)

## Signature

[`Source.zipWith`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html#zipWith(akka.stream.Graph,akka.japi.function.Function2) "akka.stream.javadsl.Source")[`Source.zipWith`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html#zipWith[Out2,Out3](that:akka.stream.Graph[akka.stream.SourceShape[Out2],_])(combine:(Out,Out2)=>Out3):FlowOps.this.Repr[Out3] "akka.stream.scaladsl.Source") [`Flow.zipWith`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html#zipWith(akka.stream.Graph,akka.japi.function.Function2) "akka.stream.javadsl.Flow")[`Flow.zipWith`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html#zipWith[Out2,Out3](that:akka.stream.Graph[akka.stream.SourceShape[Out2],_])(combine:(Out,Out2)=>Out3):FlowOps.this.Repr[Out3] "akka.stream.scaladsl.Flow")

## Description

Combines elements from multiple sources through a `combine` function and passes the returned value downstream.

See also:

- [zip](zip.html)
- [zipAll](zipAll.html)
- [zipWithIndex](zipWithIndex.html)

## Examples

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-stream-tests/src/test/scala/akka/stream/scaladsl/FlowZipWithSpec.scala#L18-L113 "Go to snippet source")import akka.stream.scaladsl.Source
import akka.stream.scaladsl.Sink

    val sourceCount = Source(List("one", "two", "three"))
    val sourceFruits = Source(List("apple", "orange", "banana"))

    sourceCount
      .zipWith(sourceFruits) { (countStr, fruitName) =>
        s"$countStr $fruitName"
      }
      .runWith(Sink.foreach(println))
    // this will print 'one apple', 'two orange', 'three banana'
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/operators/SourceOrFlow.java#L31-L121 "Go to snippet source")import akka.stream.javadsl.Keep;
import akka.stream.javadsl.Source;
import akka.stream.javadsl.Sink;

import java.util.*;

Source<String, NotUsed> sourceCount = Source.from(Arrays.asList("one", "two", "three"));
Source<String, NotUsed> sourceFruits = Source.from(Arrays.asList("apple", "orange", "banana"));
sourceCount
    .zipWith(
        sourceFruits,
        (Function2<String, String, String>) (countStr, fruitName) -> countStr + " " + fruitName)
    .runForeach(System.out::println, system);
// this will print 'one apple', 'two orange', 'three banana'

```

## Reactive Streams semantics

**emits** when all of the inputs have an element available

**backpressures** both upstreams when downstream backpressures but also on an upstream that has emitted an element until the other upstream has emitted an element

**completes** when any upstream completes

## Code Examples

### Example 1: Examples

```scala
import akka.stream.scaladsl.Source
import akka.stream.scaladsl.Sink

    val sourceCount = Source(List("one", "two", "three"))
    val sourceFruits = Source(List("apple", "orange", "banana"))

    sourceCount
      .zipWith(sourceFruits) { (countStr, fruitName) =>
        s"$countStr $fruitName"
      }
      .runWith(Sink.foreach(println))
    // this will print 'one apple', 'two orange', 'three banana'
```

### Example 2: Examples

```java
import akka.stream.javadsl.Keep;
import akka.stream.javadsl.Source;
import akka.stream.javadsl.Sink;

import java.util.*;

Source<String, NotUsed> sourceCount = Source.from(Arrays.asList("one", "two", "three"));
Source<String, NotUsed> sourceFruits = Source.from(Arrays.asList("apple", "orange", "banana"));
sourceCount
    .zipWith(
        sourceFruits,
        (Function2<String, String, String>) (countStr, fruitName) -> countStr + " " + fruitName)
    .runForeach(System.out::println, system);
// this will print 'one apple', 'two orange', 'three banana'
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/zip.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/zipAll.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/zipWithIndex.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/zipN.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/zipWith.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/zipWith.html)*