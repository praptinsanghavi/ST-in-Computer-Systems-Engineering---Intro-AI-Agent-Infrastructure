---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:27:31Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/sliding.html
title: sliding • Akka core
---

# sliding • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# sliding

Provide a sliding window over the incoming stream and pass the windows as groups of elements downstream.

[Simple operators](../index.html#simple-operators)

## Signature

[`Flow.sliding`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html#sliding(int,int) "akka.stream.javadsl.Flow")[`Flow.sliding`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html#sliding(n:Int,step:Int):FlowOps.this.Repr[scala.collection.immutable.Seq[Out]] "akka.stream.scaladsl.Flow") 

## Description

Provide a sliding window over the incoming stream and pass the windows as groups of elements downstream.

Note: the last window might be smaller than the requested size due to end of stream.

## Examples

In this first sample we just see the behavior of the operator itself, first with a window of 2 elements and the default `step` which is 1a step value of 1.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/operators/sourceorflow/Sliding.scala#L15-L20 "Go to snippet source")val source = Source(1 to 4)
source.sliding(2).runForeach(println)
// prints:
// Vector(1, 2)
// Vector(2, 3)
// Vector(3, 4)
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/operators/sourceorflow/Sliding.java#L18-L23 "Go to snippet source")Source<Integer, NotUsed> source = Source.range(1, 4);
source.sliding(2, 1).runForeach(n -> System.out.println(n), system);
// prints:
// [1, 2]
// [2, 3]
// [3, 4]
```

If the stream stops without having seen enough elements to fill a window, the last window will have as many elements was emitted before the stream ended. Here we also provide a step to move two elements forward for each window: 

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/operators/sourceorflow/Sliding.scala#L26-L30 "Go to snippet source")val source = Source(1 to 4)
source.sliding(n = 3, step = 2).runForeach(println)
// prints:
// Vector(1, 2, 3)
// Vector(3, 4) - shorter because stream ended before we got 3 elements
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/operators/sourceorflow/Sliding.java#L29-L34 "Go to snippet source")Source<Integer, NotUsed> source = Source.range(1, 4);
source.sliding(3, 2).runForeach(n -> System.out.println(n), system);
// prints:
// Vector(1, 2, 3)
// [1, 2, 3]
// [3, 4] - shorter because stream ended before we got 3 elements
```

One use case for sliding is to implement a moving average, here we do that with a “period” of `5`:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/operators/sourceorflow/Sliding.scala#L36-L44 "Go to snippet source")val numbers = Source(1 :: 3 :: 10 :: 2 :: 3 :: 4 :: 2 :: 10 :: 11 :: Nil)
val movingAverage = numbers.sliding(5).map(window => window.sum.toFloat / window.size)
movingAverage.runForeach(println)
// prints
// 3.8 = average of 1, 3, 10, 2, 3
// 4.4 = average of 3, 10, 2, 3, 4
// 4.2 = average of 10, 2, 3, 4, 2
// 4.2 = average of 2, 3, 4, 2, 10
// 6.0 = average of 3, 4, 2, 10, 11
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/operators/sourceorflow/Sliding.java#L40-L51 "Go to snippet source")Source<Integer, NotUsed> numbers = Source.from(Arrays.asList(1, 3, 10, 2, 3, 4, 2, 10, 11));
Source<Float, NotUsed> movingAverage =
    numbers
        .sliding(5, 1)
        .map(window -> ((float) window.stream().mapToInt(i -> i).sum()) / window.size());
movingAverage.runForeach(n -> System.out.println(n), system);
// prints
// 3.8 = average of 1, 3, 10, 2, 3
// 4.4 = average of 3, 10, 2, 3, 4
// 4.2 = average of 10, 2, 3, 4, 2
// 4.2 = average of 2, 3, 4, 2, 10
// 6.0 = average of 3, 4, 2, 10, 11
```

Sliding can also be used to do simple windowing, see [splitAfter](splitAfter.html).

## Reactive Streams semantics

**emits** the specified number of elements has been accumulated or upstream completed

**backpressures** when a group has been assembled and downstream backpressures

**completes** when upstream completes

## Code Examples

### Example 1: Examples

```scala
val source = Source(1 to 4)
source.sliding(2).runForeach(println)
// prints:
// Vector(1, 2)
// Vector(2, 3)
// Vector(3, 4)
```

### Example 2: Examples

```java
Source<Integer, NotUsed> source = Source.range(1, 4);
source.sliding(2, 1).runForeach(n -> System.out.println(n), system);
// prints:
// [1, 2]
// [2, 3]
// [3, 4]
```

### Example 3: Examples

```scala
val source = Source(1 to 4)
source.sliding(n = 3, step = 2).runForeach(println)
// prints:
// Vector(1, 2, 3)
// Vector(3, 4) - shorter because stream ended before we got 3 elements
```

### Example 4: Examples

```java
Source<Integer, NotUsed> source = Source.range(1, 4);
source.sliding(3, 2).runForeach(n -> System.out.println(n), system);
// prints:
// Vector(1, 2, 3)
// [1, 2, 3]
// [3, 4] - shorter because stream ended before we got 3 elements
```

### Example 5: Examples

```scala
val numbers = Source(1 :: 3 :: 10 :: 2 :: 3 :: 4 :: 2 :: 10 :: 11 :: Nil)
val movingAverage = numbers.sliding(5).map(window => window.sum.toFloat / window.size)
movingAverage.runForeach(println)
// prints
// 3.8 = average of 1, 3, 10, 2, 3
// 4.4 = average of 3, 10, 2, 3, 4
// 4.2 = average of 10, 2, 3, 4, 2
// 4.2 = average of 2, 3, 4, 2, 10
// 6.0 = average of 3, 4, 2, 10, 11
```

### Example 6: Examples

```java
Source<Integer, NotUsed> numbers = Source.from(Arrays.asList(1, 3, 10, 2, 3, 4, 2, 10, 11));
Source<Float, NotUsed> movingAverage =
    numbers
        .sliding(5, 1)
        .map(window -> ((float) window.stream().mapToInt(i -> i).sum()) / window.size());
movingAverage.runForeach(n -> System.out.println(n), system);
// prints
// 3.8 = average of 1, 3, 10, 2, 3
// 4.4 = average of 3, 10, 2, 3, 4
// 4.2 = average of 10, 2, 3, 4, 2
// 4.2 = average of 2, 3, 4, 2, 10
// 6.0 = average of 3, 4, 2, 10, 11
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/PubSub/sink.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/PubSub/source.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/splitAfter.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/sliding.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/sliding.html)*