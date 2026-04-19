---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:27:53Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/zipAll.html
title: zipAll • Akka core
---

# zipAll • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# zipAll

Combines elements from two sources into tuples *Pair* handling early completion of either source.

[Fan\-in operators](../index.html#fan-in-operators)

## Signature

[`Source.zipAll`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html#zipAll(akka.stream.Graph,java.lang.Object,java.lang.Object) "akka.stream.javadsl.Source")[`Source.zipAll`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html#zipAll[U,A>:Out](that:akka.stream.Graph[akka.stream.SourceShape[U],_],thisElem:A,thatElem:U):FlowOps.this.Repr[(A,U)] "akka.stream.scaladsl.Source") [`Flow.zipAll`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html#zipAll(akka.stream.Graph,java.lang.Object,java.lang.Object) "akka.stream.javadsl.Flow")[`Flow.zipAll`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html#zipAll[U,A>:Out](that:akka.stream.Graph[akka.stream.SourceShape[U],_],thisElem:A,thatElem:U):FlowOps.this.Repr[(A,U)] "akka.stream.scaladsl.Flow")

## Description

Combines elements from two sources into tuples *Pair* and passes downstream. If either source completes, a default value is combined with each value from the other source until it completes.

See also:

- [zip](zip.html)
- [zipWith](zipWith.html)
- [zipWith](zipWith.html)
- [zipWithIndex](zipWithIndex.html)

## Example

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/operators/source/Zip.scala#L52-L60 "Go to snippet source")val numbers = Source(1 :: 2 :: 3 :: 4 :: Nil)
val letters = Source("a" :: "b" :: "c" :: Nil)

numbers.zipAll(letters, -1, "default").runForeach(println)
// prints:
// (1,a)
// (2,b)
// (3,c)
// (4,default)
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/operators/source/Zip.java#L60-L69 "Go to snippet source")  
Source<Integer, NotUsed> numbers = Source.from(Arrays.asList(1, 2, 3, 4));
Source<String, NotUsed> letters = Source.from(Arrays.asList("a", "b", "c"));

numbers.zipAll(letters, -1, "default").runForeach(System.out::println, system);
// prints:
// Pair(1,a)
// Pair(2,b)
// Pair(3,c)
// Pair(4,default)
```

## Reactive Streams semantics

**emits** at first emits when both inputs emit, and then as long as any input emits (coupled to the default value of the completed input)

**backpressures** both upstreams when downstream backpressures but also on an upstream that has emitted an element until the other upstream has emitted an element

**completes** when both upstream completes

## Code Examples

### Example 1: Example

```scala
val numbers = Source(1 :: 2 :: 3 :: 4 :: Nil)
val letters = Source("a" :: "b" :: "c" :: Nil)

numbers.zipAll(letters, -1, "default").runForeach(println)
// prints:
// (1,a)
// (2,b)
// (3,c)
// (4,default)
```

### Example 2: Example

```java
Source<Integer, NotUsed> numbers = Source.from(Arrays.asList(1, 2, 3, 4));
Source<String, NotUsed> letters = Source.from(Arrays.asList("a", "b", "c"));

numbers.zipAll(letters, -1, "default").runForeach(System.out::println, system);
// prints:
// Pair(1,a)
// Pair(2,b)
// Pair(3,c)
// Pair(4,default)
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/zip.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/zipLatest.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/zipWith.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/zipWithIndex.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/zipAll.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/zipAll.html)*