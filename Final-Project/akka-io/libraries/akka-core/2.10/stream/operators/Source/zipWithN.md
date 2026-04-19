---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:23:43Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/zipWithN.html
title: Source.zipWithN • Akka core
---

# Source.zipWithN • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Source.zipWithN

Combine the elements of multiple streams into a stream of sequences using a combiner function.

[Source operators](../index.html#source-operators)

## Signature

[`Source.zipWithN`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html#zipWithN(akka.japi.function.Function,java.util.List) "akka.stream.javadsl.Source")[`Source.zipWithN`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source$.html#zipWithN[T,O](zipper:scala.collection.immutable.Seq[T]=>O)(sources:scala.collection.immutable.Seq[akka.stream.scaladsl.Source[T,_]]):akka.stream.scaladsl.Source[O,akka.NotUsed] "akka.stream.scaladsl.Source")

## Description

Combine the elements of multiple streams into a stream of sequences using a combiner function.

This operator is essentially the same as using [zipN](zipN.html) followed by [map](../Source-or-Flow/map.html) to turn the zipped sequence into an arbitrary object to emit downstream.

See also:

- [zipN](zipN.html)
- [zip](../Source-or-Flow/zip.html)
- [zipAll](../Source-or-Flow/zipAll.html)
- [zipWith](../Source-or-Flow/zipWith.html)
- [zipWithIndex](../Source-or-Flow/zipWithIndex.html)

## Example

In this sample we zip three streams of integers and for each zipped sequence of numbers we calculate the max value and send downstream:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/operators/source/Zip.scala#L33-L46 "Go to snippet source")val numbers = Source(1 :: 2 :: 3 :: 4 :: 5 :: 6 :: Nil)
val otherNumbers = Source(5 :: 2 :: 1 :: 4 :: 10 :: 4 :: Nil)
val andSomeOtherNumbers = Source(3 :: 7 :: 2 :: 1 :: 1 :: Nil)

Source
  .zipWithN((seq: Seq[Int]) => seq.max)(numbers :: otherNumbers :: andSomeOtherNumbers :: Nil)
  .runForeach(println)
// prints:
// 5
// 7
// 3
// 4
// 10

```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/operators/source/Zip.java#L39-L53 "Go to snippet source")Source<Integer, NotUsed> numbers = Source.from(Arrays.asList(1, 2, 3, 4, 5, 6));
Source<Integer, NotUsed> otherNumbers = Source.from(Arrays.asList(5, 2, 1, 4, 10, 4));
Source<Integer, NotUsed> andSomeOtherNumbers = Source.from(Arrays.asList(3, 7, 2, 1, 1));

Source.zipWithN(
        (List<Integer> seq) -> seq.stream().mapToInt(i -> i).max().getAsInt(),
        Arrays.asList(numbers, otherNumbers, andSomeOtherNumbers))
    .runForeach(System.out::println, system);
// prints:
// 5
// 7
// 3
// 4
// 10

```

Note how it stops as soon as any of the original sources reaches its end.

## Reactive Streams semantics

**emits** when all of the inputs has an element available

**completes** when any upstream completes

**backpressures** all upstreams when downstream backpressures but also on an upstream that has emitted an element until all other upstreams has emitted elements

## Code Examples

### Example 1: Example

```scala
val numbers = Source(1 :: 2 :: 3 :: 4 :: 5 :: 6 :: Nil)
val otherNumbers = Source(5 :: 2 :: 1 :: 4 :: 10 :: 4 :: Nil)
val andSomeOtherNumbers = Source(3 :: 7 :: 2 :: 1 :: 1 :: Nil)

Source
  .zipWithN((seq: Seq[Int]) => seq.max)(numbers :: otherNumbers :: andSomeOtherNumbers :: Nil)
  .runForeach(println)
// prints:
// 5
// 7
// 3
// 4
// 10
```

### Example 2: Example

```java
Source<Integer, NotUsed> numbers = Source.from(Arrays.asList(1, 2, 3, 4, 5, 6));
Source<Integer, NotUsed> otherNumbers = Source.from(Arrays.asList(5, 2, 1, 4, 10, 4));
Source<Integer, NotUsed> andSomeOtherNumbers = Source.from(Arrays.asList(3, 7, 2, 1, 1));

Source.zipWithN(
        (List<Integer> seq) -> seq.stream().mapToInt(i -> i).max().getAsInt(),
        Arrays.asList(numbers, otherNumbers, andSomeOtherNumbers))
    .runForeach(System.out::println, system);
// prints:
// 5
// 7
// 3
// 4
// 10
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html
- https://doc.akka.io/libraries/akka-core/2.10/discovery/index.html
- https://doc.akka.io/libraries/akka-core/2.10/stream/operators/Source-or-Flow/map.html
- https://doc.akka.io/libraries/akka-core/2.10/stream/operators/Source-or-Flow/zip.html
- https://doc.akka.io/libraries/akka-core/2.10/stream/operators/Source-or-Flow/zipAll.html
- https://doc.akka.io/libraries/akka-core/2.10/stream/operators/Source-or-Flow/zipWith.html
- https://doc.akka.io/libraries/akka-core/2.10/stream/operators/Source-or-Flow/zipWithIndex.html
- https://doc.akka.io/libraries/akka-core/2.10/stream/operators/Source/zipN.html
- https://doc.akka.io/libraries/akka-core/2.10/stream/operators/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/2.10/stream/operators/Source/zipWithN.html](https://doc.akka.io/libraries/akka-core/2.10/stream/operators/Source/zipWithN.html)*