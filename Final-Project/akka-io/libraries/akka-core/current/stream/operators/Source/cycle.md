---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:26:51Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/cycle.html
title: Source.cycle • Akka core
---

# Source.cycle • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Source.cycle

Stream iterator in cycled manner.

[Source operators](../index.html#source-operators)

## Signature

[`Source.cycle`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html#cycle(akka.japi.function.Creator) "akka.stream.javadsl.Source")[`Source.cycle`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source$.html#cycle[T](f:()=>Iterator[T]):akka.stream.scaladsl.Source[T,akka.NotUsed] "akka.stream.scaladsl.Source")

## Description

Stream iterator in cycled manner. Internally a new iterator is being created to cycle the one provided via argument meaning when the original iterator runs out of elements to process it will start all over again from the beginning of the iterator provided by the evaluation of provided parameter. If the method argument provides an empty iterator the stream will be terminated with an exception.

## Examples

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-stream-tests/src/test/scala/akka/stream/scaladsl/SourceSpec.scala#L423-L427 "Go to snippet source")Source
  .cycle(() => List(1, 2, 3).iterator)
  .grouped(9)
  .runWith(Sink.head)
  // This will produce the Seq(1, 2, 3, 1, 2, 3, 1, 2, 3)
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-stream-tests/src/test/java/akka/stream/javadsl/SourceTest.java#L1052-L1055 "Go to snippet source")final Source<Integer, NotUsed> source = Source.cycle(() -> Arrays.asList(1, 2, 3).iterator());
CompletionStage<List<Integer>> result = source.grouped(9).runWith(Sink.head(), system);
List<Integer> emittedValues = result.toCompletableFuture().get();
assertThat(emittedValues, is(Arrays.asList(1, 2, 3, 1, 2, 3, 1, 2, 3)));
```

When iterator is empty the stream will be terminated with *IllegalArgumentException*

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-stream-tests/src/test/scala/akka/stream/scaladsl/SourceSpec.scala#L434-L438 "Go to snippet source")val empty = Iterator.empty
Source
  .cycle(() => empty)
  .runWith(Sink.head)
  // This will return a failed future with an `IllegalArgumentException`
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-stream-tests/src/test/java/akka/stream/javadsl/SourceTest.java#L1067-L1070 "Go to snippet source")Iterator<Integer> emptyIterator = Collections.<Integer>emptyList().iterator();
Source.cycle(() -> emptyIterator)
    .runWith(Sink.head(), system)
    // stream will be terminated with IllegalArgumentException
```

## Reactive Streams semantics

**emits** the next value returned from cycled iterator

**completes** never

## Code Examples

### Example 1: Examples

```scala
Source
  .cycle(() => List(1, 2, 3).iterator)
  .grouped(9)
  .runWith(Sink.head)
  // This will produce the Seq(1, 2, 3, 1, 2, 3, 1, 2, 3)
```

### Example 2: Examples

```java
final Source<Integer, NotUsed> source = Source.cycle(() -> Arrays.asList(1, 2, 3).iterator());
CompletionStage<List<Integer>> result = source.grouped(9).runWith(Sink.head(), system);
List<Integer> emittedValues = result.toCompletableFuture().get();
assertThat(emittedValues, is(Arrays.asList(1, 2, 3, 1, 2, 3, 1, 2, 3)));
```

### Example 3: Examples

```scala
val empty = Iterator.empty
Source
  .cycle(() => empty)
  .runWith(Sink.head)
  // This will return a failed future with an `IllegalArgumentException`
```

### Example 4: Examples

```java
Iterator<Integer> emptyIterator = Collections.<Integer>emptyList().iterator();
Source.cycle(() -> emptyIterator)
    .runWith(Sink.head(), system)
    // stream will be terminated with IllegalArgumentException
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Compression/deflate.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Flow/contramap.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/cycle.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/cycle.html)*