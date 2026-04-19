---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:27:02Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/zipN.html
title: Source.zipN • Akka core
---

# Source.zipN • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Source.zipN

Combine the elements of multiple sources into a source of sequences of value.

[Source operators](../index.html#source-operators)

## Signature

[`Source.zipN`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html#zipN(java.util.List) "akka.stream.javadsl.Source")[`Source.zipN`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source$.html#zipN[T](sources:scala.collection.immutable.Seq[akka.stream.scaladsl.Source[T,_]]):akka.stream.scaladsl.Source[scala.collection.immutable.Seq[T],akka.NotUsed] "akka.stream.scaladsl.Source") 

## Description

Collects one element for every upstream and when all upstreams has emitted one element all of them are emitted downstream as a collection. The element order in the downstream collection will be the same order as the sources were listed.

Since the sources are provided as a list the individual types are lost and the downstream sequences will end up containing the closest supertype shared by all sourcesyou may have to make sure to have sources type casted to the same common supertype of all stream elements to use `zipN`.

See also:

- [zipWithN](zipWithN.html)
- [zip](../Source-or-Flow/zip.html)
- [zipAll](../Source-or-Flow/zipAll.html)
- [zipWith](../Source-or-Flow/zipWith.html)
- [zipWithIndex](../Source-or-Flow/zipWithIndex.html)

## Example

In this sample we zip a stream of characters, a stream of numbers and a stream of colours. Into a single `Source` where each element is a `Vector``List` of `[character, number, color]`:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/operators/source/Zip.scala#L16-L27 "Go to snippet source")val chars = Source("a" :: "b" :: "c" :: "e" :: "f" :: Nil)
val numbers = Source(1 :: 2 :: 3 :: 4 :: 5 :: 6 :: Nil)
val colors = Source("red" :: "green" :: "blue" :: "yellow" :: "purple" :: Nil)

Source.zipN(chars :: numbers :: colors :: Nil).runForeach(println)
// prints:
// Vector(a, 1, red)
// Vector(b, 2, green)
// Vector(c, 3, blue)
// Vector(e, 4, yellow)
// Vector(f, 5, purple)

```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/operators/source/Zip.java#L19-L31 "Go to snippet source")Source<Object, NotUsed> chars = Source.from(Arrays.asList("a", "b", "c", "e", "f"));
Source<Object, NotUsed> numbers = Source.from(Arrays.asList(1, 2, 3, 4, 5, 6));
Source<Object, NotUsed> colors =
    Source.from(Arrays.asList("red", "green", "blue", "yellow", "purple"));

Source.zipN(Arrays.asList(chars, numbers, colors)).runForeach(System.out::println, system);
// prints:
// [a, 1, red]
// [b, 2, green]
// [c, 3, blue]
// [e, 4, yellow]
// [f, 5, purple]

```

Note how it stops as soon as any of the original sources reaches its end.

## Reactive Streams semantics

**emits** when all of the inputs has an element available

**completes** when any upstream completes

**backpressures** all upstreams when downstream backpressures but also on an upstream that has emitted an element until all other upstreams has emitted elements

## Code Examples

### Example 1: Example

```scala
val chars = Source("a" :: "b" :: "c" :: "e" :: "f" :: Nil)
val numbers = Source(1 :: 2 :: 3 :: 4 :: 5 :: 6 :: Nil)
val colors = Source("red" :: "green" :: "blue" :: "yellow" :: "purple" :: Nil)

Source.zipN(chars :: numbers :: colors :: Nil).runForeach(println)
// prints:
// Vector(a, 1, red)
// Vector(b, 2, green)
// Vector(c, 3, blue)
// Vector(e, 4, yellow)
// Vector(f, 5, purple)
```

### Example 2: Example

```java
Source<Object, NotUsed> chars = Source.from(Arrays.asList("a", "b", "c", "e", "f"));
Source<Object, NotUsed> numbers = Source.from(Arrays.asList(1, 2, 3, 4, 5, 6));
Source<Object, NotUsed> colors =
    Source.from(Arrays.asList("red", "green", "blue", "yellow", "purple"));

Source.zipN(Arrays.asList(chars, numbers, colors)).runForeach(System.out::println, system);
// prints:
// [a, 1, red]
// [b, 2, green]
// [c, 3, blue]
// [e, 4, yellow]
// [f, 5, purple]
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/zip.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/zipAll.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/zipLatestWith.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/zipWith.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/zipWithIndex.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/zipWithN.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/zipN.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/zipN.html)*