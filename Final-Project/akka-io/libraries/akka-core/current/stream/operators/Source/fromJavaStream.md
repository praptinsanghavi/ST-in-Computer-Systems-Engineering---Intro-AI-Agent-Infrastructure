---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:26:55Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/fromJavaStream.html
title: fromJavaStream • Akka core
---

# fromJavaStream • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# fromJavaStream

Stream the values from a Java 8 `Stream`, requesting the next value when there is demand.

[Source operators](../index.html#source-operators)

## Signature

[`StreamConverters.fromJavaStream`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/StreamConverters.html#fromJavaStream(akka.japi.function.Creator) "akka.stream.javadsl.StreamConverters")[`StreamConverters.fromJavaStream`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/StreamConverters$.html#fromJavaStream[T,S<:java.util.stream.BaseStream[T,S]](stream:()=>java.util.stream.BaseStream[T,S]):akka.stream.scaladsl.Source[T,akka.NotUsed] "akka.stream.scaladsl.StreamConverters")

## Description

Stream the values from a Java 8 `Stream`, requesting the next value when there is demand. The iterator will be created anew for each materialization, which is the reason the `method` `factory` takes a `function` `Creator` rather than an `Stream` directly.

You can use `Source.async` to create asynchronous boundaries between synchronous java stream and the rest of flow.

## Example

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/operators/source/From.scala#L28-L32 "Go to snippet source")Source.fromJavaStream(() => IntStream.rangeClosed(1, 3)).runForeach(println)
// could print
// 1
// 2
// 3
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/operators/source/From.java#L29-L34 "Go to snippet source")Source.fromJavaStream(() -> IntStream.rangeClosed(1, 3))
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
Source.fromJavaStream(() => IntStream.rangeClosed(1, 3)).runForeach(println)
// could print
// 1
// 2
// 3
```

### Example 2: Example

```java
Source.fromJavaStream(() -> IntStream.rangeClosed(1, 3))
    .runForeach(System.out::println, system);
// could print
// 1
// 2
// 3
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/StreamConverters$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/StreamConverters.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/fromIterator.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/StreamConverters/fromJavaStream.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/fromJavaStream.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/fromJavaStream.html)*