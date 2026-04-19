---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:26:54Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/fromIterator.html
title: Source.fromIterator • Akka core
---

# Source.fromIterator • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Source.fromIterator

Stream the values from an `Iterator`, requesting the next value when there is demand.

[Source operators](../index.html#source-operators)

## Signature

[`Source.fromIterator`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html#fromIterator(akka.japi.function.Creator) "akka.stream.javadsl.Source")[`Source.fromIterator`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source$.html#fromIterator[T](f:()=>Iterator[T]):akka.stream.scaladsl.Source[T,akka.NotUsed] "akka.stream.scaladsl.Source")

## Description

Stream the values from an `Iterator`, requesting the next value when there is demand. The iterator will be created anew for each materialization, which is the reason the `method` `factory` takes a `function` `Creator` rather than an `Iterator` directly.

If the iterator perform blocking operations, make sure to run it on a separate dispatcher.

## Example

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/operators/source/From.scala#L18-L22 "Go to snippet source")Source.fromIterator(() => (1 to 3).iterator).runForeach(println)
// could print
// 1
// 2
// 3
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/operators/source/From.java#L18-L23 "Go to snippet source")Source.fromIterator(() -> Arrays.asList(1, 2, 3).iterator())
    .runForeach(System.out::println, system);
// could print
// 1
// 2
// 3
```

## Reactive Streams semantics

**emits** the next value returned from the iterator

**completes** when the iterator reaches its end

## Code Examples

### Example 1: Example

```scala
Source.fromIterator(() => (1 to 3).iterator).runForeach(println)
// could print
// 1
// 2
// 3
```

### Example 2: Example

```java
Source.fromIterator(() -> Arrays.asList(1, 2, 3).iterator())
    .runForeach(System.out::println, system);
// could print
// 1
// 2
// 3
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/fromJavaStream.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/StreamConverters/fromInputStream.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/fromIterator.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/fromIterator.html)*