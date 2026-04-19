---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:27:55Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/zipWithIndex.html
title: zipWithIndex • Akka core
---

# zipWithIndex • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# zipWithIndex

Zips elements of current flow with its indices.

[Fan\-in operators](../index.html#fan-in-operators)

## Signature

[`Source.zipWithIndex`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html#zipWithIndex() "akka.stream.javadsl.Source")[`Source.zipWithIndex`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html#zipWithIndex:FlowOps.this.Repr[(Out,Long)] "akka.stream.scaladsl.Source") [`Flow.zipWithIndex`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html#zipWithIndex() "akka.stream.javadsl.Flow")[`Flow.zipWithIndex`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html#zipWithIndex:FlowOps.this.Repr[(Out,Long)] "akka.stream.scaladsl.Flow")

## Description

Zips elements of current flow with its indices.

See also:

- [zip](zip.html)
- [zipAll](zipAll.html)
- [zipWith](zipWith.html)

## Example

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-stream-tests/src/test/scala/akka/stream/scaladsl/FlowZipWithIndexSpec.scala#L17-L79 "Go to snippet source")import akka.stream.scaladsl.Source
import akka.stream.scaladsl.Sink

    Source(List("apple", "orange", "banana")).zipWithIndex.runWith(Sink.foreach(println))
    // this will print ('apple', 0), ('orange', 1), ('banana', 2)
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/operators/SourceOrFlow.java#L31-L97 "Go to snippet source")import akka.stream.javadsl.Keep;
import akka.stream.javadsl.Source;
import akka.stream.javadsl.Sink;

import java.util.*;

Source.from(Arrays.asList("apple", "orange", "banana"))
    .zipWithIndex()
    .runForeach(System.out::println, system);
// this will print ('apple', 0), ('orange', 1), ('banana', 2)
```

## Reactive Streams semantics

**emits** upstream emits an element and is paired with their index

**backpressures** when downstream backpressures

**completes** when upstream completes

## Code Examples

### Example 1: Example

```scala
import akka.stream.scaladsl.Source
import akka.stream.scaladsl.Sink

    Source(List("apple", "orange", "banana")).zipWithIndex.runWith(Sink.foreach(println))
    // this will print ('apple', 0), ('orange', 1), ('banana', 2)
```

### Example 2: Example

```java
import akka.stream.javadsl.Keep;
import akka.stream.javadsl.Source;
import akka.stream.javadsl.Sink;

import java.util.*;

Source.from(Arrays.asList("apple", "orange", "banana"))
    .zipWithIndex()
    .runForeach(System.out::println, system);
// this will print ('apple', 0), ('orange', 1), ('banana', 2)
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/zip.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/zipAll.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/zipWith.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/zipWithN.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/zipWithIndex.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/zipWithIndex.html)*