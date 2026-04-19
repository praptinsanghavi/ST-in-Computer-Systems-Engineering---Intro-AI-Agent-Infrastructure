---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:27:53Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/zip.html
title: zip • Akka core
---

# zip • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# zip

Combines elements from each of multiple sources into tuples *Pair* and passes the tuples pairs downstream.

[Fan\-in operators](../index.html#fan-in-operators)

## Signature

[`Source.zip`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html#zip(akka.stream.Graph) "akka.stream.javadsl.Source")[`Source.zip`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source$.html#zip[U](that:akka.stream.Graph[akka.stream.SourceShape[U],_]):FlowOps.this.Repr[(Out,U)] "akka.stream.scaladsl.Source") [`Flow.zip`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html#zip(akka.stream.Graph) "akka.stream.javadsl.Flow")[`Flow.zip`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html#zip[U](that:akka.stream.Graph[akka.stream.SourceShape[U],_]):FlowOps.this.Repr[(Out,U)] "akka.stream.scaladsl.Flow")

## Description

Combines elements from each of multiple sources into tuples *Pair* and passes the tuples pairs downstream.

See also:

- [zipAll](zipAll.html)
- [zipWith](zipWith.html)
- [zipWithIndex](zipWithIndex.html)

## Examples

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-stream-tests/src/test/scala/akka/stream/scaladsl/FlowZipSpec.scala#L14-L84 "Go to snippet source")import akka.stream.scaladsl.Source
import akka.stream.scaladsl.Sink

    val sourceFruits = Source(List("apple", "orange", "banana"))
    val sourceFirstLetters = Source(List("A", "O", "B"))
    sourceFruits.zip(sourceFirstLetters).runWith(Sink.foreach(println))
    // this will print ('apple', 'A'), ('orange', 'O'), ('banana', 'B')
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/operators/SourceOrFlow.java#L31-L107 "Go to snippet source")import akka.stream.javadsl.Keep;
import akka.stream.javadsl.Source;
import akka.stream.javadsl.Sink;

import java.util.*;

Source<String, NotUsed> sourceFruits = Source.from(Arrays.asList("apple", "orange", "banana"));
Source<String, NotUsed> sourceFirstLetters = Source.from(Arrays.asList("A", "O", "B"));
sourceFruits.zip(sourceFirstLetters).runForeach(System.out::println, system);
// this will print ('apple', 'A'), ('orange', 'O'), ('banana', 'B')

```

## Reactive Streams semantics

**emits** when both of the inputs have an element available

**backpressures** both upstreams when downstream backpressures but also on an upstream that has emitted an element until the other upstream has emitted an element

**completes** when either upstream completes

## Code Examples

### Example 1: Examples

```scala
import akka.stream.scaladsl.Source
import akka.stream.scaladsl.Sink

    val sourceFruits = Source(List("apple", "orange", "banana"))
    val sourceFirstLetters = Source(List("A", "O", "B"))
    sourceFruits.zip(sourceFirstLetters).runWith(Sink.foreach(println))
    // this will print ('apple', 'A'), ('orange', 'O'), ('banana', 'B')
```

### Example 2: Examples

```java
import akka.stream.javadsl.Keep;
import akka.stream.javadsl.Source;
import akka.stream.javadsl.Sink;

import java.util.*;

Source<String, NotUsed> sourceFruits = Source.from(Arrays.asList("apple", "orange", "banana"));
Source<String, NotUsed> sourceFirstLetters = Source.from(Arrays.asList("A", "O", "B"));
sourceFruits.zip(sourceFirstLetters).runForeach(System.out::println, system);
// this will print ('apple', 'A'), ('orange', 'O'), ('banana', 'B')
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/RetryFlow/withBackoffAndContext.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/zipAll.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/zipWith.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/zipWithIndex.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/zip.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/zip.html)*