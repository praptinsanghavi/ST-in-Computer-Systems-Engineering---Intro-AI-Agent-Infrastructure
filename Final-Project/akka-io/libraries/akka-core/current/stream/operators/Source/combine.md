---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:26:50Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/combine.html
title: Source.combine • Akka core
---

# Source.combine • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Source.combine

Combine several sources, using a given strategy such as merge or concat, into one source.

[Source operators](../index.html#source-operators)

## Signature

[`Source.combine`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html#combine(akka.stream.javadsl.Source,akka.stream.javadsl.Source,java.util.List,akka.japi.function.Function) "akka.stream.javadsl.Source")[`Source.combine`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source$.html#combine[T,U](first:akka.stream.scaladsl.Source[T,_],second:akka.stream.scaladsl.Source[T,_],rest:akka.stream.scaladsl.Source[T,_]*)(strategy:Int=>akka.stream.Graph[akka.stream.UniformFanInShape[T,U],akka.NotUsed]):akka.stream.scaladsl.Source[U,akka.NotUsed] "akka.stream.scaladsl.Source")

## Description

Provides a way to create a “fan\-in” of multiple sources without having to use the more advanced [GraphDSL](../../stream-graphs.html#constructing-graphs).

The way the elements from the sources are combined is pluggable through the `strategy` parameter which accepts a function `Int => Graph[FanInShape]``Integer -> Graph<FanInShape>` where the integer parameter specifies the number of sources that the graph must accept. This makes it possible to use `combine` with the built\-in `Concat` and `Merge` by expanding their `apply` methods to functionsusing a method reference to their `create` methods, but also to use an arbitrary strategy. 

Combine is most useful when you have more sources than 2 or want to use a custom operator, as there are more concise operators for 2\-source [concat](../Source-or-Flow/concat.html) and [merge](../Source-or-Flow/merge.html) 

Some of the built\-in operators that can be used as strategy are:

- [`Merge`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Merge.html "akka.stream.javadsl.Merge")[`Merge`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Merge.html "akka.stream.scaladsl.Merge")
- [`Concat`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Concat.html "akka.stream.javadsl.Concat")[`Concat`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Concat.html "akka.stream.scaladsl.Concat")
- [`MergePrioritized`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/MergePrioritized.html "akka.stream.javadsl.MergePrioritized")[`MergePrioritized`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/MergePrioritized.html "akka.stream.scaladsl.MergePrioritized")
- [`MergeLatest`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/MergeLatest.html "akka.stream.javadsl.MergeLatest")[`MergeLatest`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/MergeLatest.html "akka.stream.scaladsl.MergeLatest")
- [`ZipN`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/ZipN.html "akka.stream.javadsl.ZipN")[`ZipN`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/ZipN.html "akka.stream.scaladsl.ZipN")
- [`ZipWithN`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/ZipWithN.html "akka.stream.javadsl.ZipWithN")[`ZipWithN`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/ZipWithN.html "akka.stream.scaladsl.ZipWithN")

## Examples

In this example we `Merge` three different sources of integers. The three sources will immediately start contributing elements to the combined source. The individual elements from each source will be in order but the order compared to elements from other sources is not deterministic:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/operators/source/Combine.scala#L9-L11 "Go to snippet source")import akka.stream.scaladsl.{ Concat, Merge, Source }
// ...

val source1 = Source(1 to 3)
val source2 = Source(8 to 10)
val source3 = Source(12 to 14)
val combined = Source.combine(source1, source2, source3)(Merge(_))
combined.runForeach(println)
// could print (order between sources is not deterministic)
// 1
// 12
// 8
// 9
// 13
// 14
// 2
// 10
// 3
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/operators/source/Combine.java#L10-L14 "Go to snippet source")import akka.stream.javadsl.Concat;
import akka.stream.javadsl.Merge;
import akka.stream.javadsl.Source;
// ...

Source<Integer, NotUsed> source1 = Source.range(1, 3);
Source<Integer, NotUsed> source2 = Source.range(8, 10);
Source<Integer, NotUsed> source3 = Source.range(12, 14);

final Source<Integer, NotUsed> combined =
    Source.combine(source1, source2, Collections.singletonList(source3), Merge::create);

combined.runForeach(System.out::println, system);
// could print (order between sources is not deterministic)
// 1
// 12
// 8
// 9
// 13
// 14
// 2
// 10
// 3
```

If we instead use `Concat` the first source will get to emit elements until it completes, then the second source until that completes and so on until all the sources has completed.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/operators/source/Combine.scala#L40-L54 "Go to snippet source")val source1 = Source(1 to 3)
val source2 = Source(8 to 10)
val source3 = Source(12 to 14)
val sources = Source.combine(source1, source2, source3)(Concat(_))
sources.runForeach(println)
// prints (order is deterministic)
// 1
// 2
// 3
// 8
// 9
// 10
// 12
// 13
// 14
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/operators/source/Combine.java#L47-L64 "Go to snippet source")Source<Integer, NotUsed> source1 = Source.range(1, 3);
Source<Integer, NotUsed> source2 = Source.range(8, 10);
Source<Integer, NotUsed> source3 = Source.range(12, 14);

final Source<Integer, NotUsed> sources =
    Source.combine(source1, source2, Collections.singletonList(source3), Concat::create);

sources.runForeach(System.out::println, system);
// prints (order is deterministic)
// 1
// 2
// 3
// 8
// 9
// 10
// 12
// 13
// 14
```

## Reactive Streams semantics

**emits** when there is demand, but depending on the strategy

**completes** depends on the strategy

## Code Examples

### Example 1: Examples

```scala
import akka.stream.scaladsl.{ Concat, Merge, Source }
// ...

val source1 = Source(1 to 3)
val source2 = Source(8 to 10)
val source3 = Source(12 to 14)
val combined = Source.combine(source1, source2, source3)(Merge(_))
combined.runForeach(println)
// could print (order between sources is not deterministic)
// 1
// 12
// 8
// 9
// 13
// 14
// 2
// 10
// 3
```

### Example 2: Examples

```java
import akka.stream.javadsl.Concat;
import akka.stream.javadsl.Merge;
import akka.stream.javadsl.Source;
// ...

Source<Integer, NotUsed> source1 = Source.range(1, 3);
Source<Integer, NotUsed> source2 = Source.range(8, 10);
Source<Integer, NotUsed> source3 = Source.range(12, 14);

final Source<Integer, NotUsed> combined =
    Source.combine(source1, source2, Collections.singletonList(source3), Merge::create);

combined.runForeach(System.out::println, system);
// could print (order between sources is not deterministic)
// 1
// 12
// 8
// 9
// 13
// 14
// 2
// 10
// 3
```

### Example 3: Examples

```scala
val source1 = Source(1 to 3)
val source2 = Source(8 to 10)
val source3 = Source(12 to 14)
val sources = Source.combine(source1, source2, source3)(Concat(_))
sources.runForeach(println)
// prints (order is deterministic)
// 1
// 2
// 3
// 8
// 9
// 10
// 12
// 13
// 14
```

### Example 4: Examples

```java
Source<Integer, NotUsed> source1 = Source.range(1, 3);
Source<Integer, NotUsed> source2 = Source.range(8, 10);
Source<Integer, NotUsed> source3 = Source.range(12, 14);

final Source<Integer, NotUsed> sources =
    Source.combine(source1, source2, Collections.singletonList(source3), Concat::create);

sources.runForeach(System.out::println, system);
// prints (order is deterministic)
// 1
// 2
// 3
// 8
// 9
// 10
// 12
// 13
// 14
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Concat.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Merge.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/MergeLatest.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/MergePrioritized.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source$.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/ZipN.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/ZipWithN.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Concat.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Merge.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/MergeLatest.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/MergePrioritized.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/ZipN.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/ZipWithN.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Sink/combine.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/collectType.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/concat.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/merge.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html
- https://doc.akka.io/libraries/akka-core/current/stream/stream-graphs.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/combine.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/combine.html)*