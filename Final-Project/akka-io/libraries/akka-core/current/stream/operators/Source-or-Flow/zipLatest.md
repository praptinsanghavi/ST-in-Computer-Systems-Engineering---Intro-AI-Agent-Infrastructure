---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:27:53Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/zipLatest.html
title: zipLatest • Akka core
---

# zipLatest • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# zipLatest

Combines elements from each of multiple sources into tuples *Pair* and passes the tuples pairs downstream, picking always the latest element of each.

[Fan\-in operators](../index.html#fan-in-operators)

## Signature

[`Source.zipLatest`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html#zipLatest(akka.stream.Graph) "akka.stream.javadsl.Source")[`Source.zipLatest`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html#zipLatest[U](that:akka.stream.Graph[akka.stream.SourceShape[U],_]):FlowOps.this.Repr[(Out,U)] "akka.stream.scaladsl.Source") [`Flow.zipLatest`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html#zipLatest(akka.stream.Graph) "akka.stream.javadsl.Flow")[`Flow.zipLatest`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html#zipLatest[U](that:akka.stream.Graph[akka.stream.SourceShape[U],_]):FlowOps.this.Repr[(Out,U)] "akka.stream.scaladsl.Flow")

## Description

Combines elements from each of multiple sources into tuples *Pair* and passes the tuples pairs downstream, picking always the latest element of each.

No element is emitted until at least one element from each Source becomes available.

## Example

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/operators/source/Zip.scala#L66-L78 "Go to snippet source")val numbers = Source(1 :: 2 :: Nil)
val letters = Source("a" :: "b" :: Nil)

numbers.zipLatest(letters).runForeach(println)
// this will print
// (1,a)
// (2,a)
// (2,b)
// NOTE : The output is not always deterministic and also depends on order of elements flowing from the streams.
// Sometimes the output could also be :
// (1, a)
// (1, b)
// (2, b)
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/operators/source/Zip.java#L76-L92 "Go to snippet source")  
Source<Integer, NotUsed> numbers = Source.from(Arrays.asList(1, 2));
Source<String, NotUsed> letters = Source.from(Arrays.asList("a", "b"));

numbers.zipLatest(letters).runForeach(System.out::println, system);
// this will print
// Pair(1,a)
// Pair(2,a)
// Pair(2,b)

//
// NOTE : The output is not always deterministic and also depends on order of elements flowing
// from the streams.
// Sometimes the output could also be :
// Pair(1, a)
// Pair(1, b)
// Pair(2, b)
```

## Reactive Streams semantics

**emits** when all of the inputs have at least an element available, and then each time an element becomes available on either of the inputs

**backpressures** when downstream backpressures

**completes** when any upstream completes

**cancels** when downstream cancels

## Code Examples

### Example 1: Example

```scala
val numbers = Source(1 :: 2 :: Nil)
val letters = Source("a" :: "b" :: Nil)

numbers.zipLatest(letters).runForeach(println)
// this will print
// (1,a)
// (2,a)
// (2,b)
// NOTE : The output is not always deterministic and also depends on order of elements flowing from the streams.
// Sometimes the output could also be :
// (1, a)
// (1, b)
// (2, b)
```

### Example 2: Example

```java
Source<Integer, NotUsed> numbers = Source.from(Arrays.asList(1, 2));
Source<String, NotUsed> letters = Source.from(Arrays.asList("a", "b"));

numbers.zipLatest(letters).runForeach(System.out::println, system);
// this will print
// Pair(1,a)
// Pair(2,a)
// Pair(2,b)

//
// NOTE : The output is not always deterministic and also depends on order of elements flowing
// from the streams.
// Sometimes the output could also be :
// Pair(1, a)
// Pair(1, b)
// Pair(2, b)
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/zipAll.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/zipLatestWith.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/zipLatest.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/zipLatest.html)*