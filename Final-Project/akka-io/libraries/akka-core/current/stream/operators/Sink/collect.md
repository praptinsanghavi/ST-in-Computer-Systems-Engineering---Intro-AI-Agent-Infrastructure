---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:27:03Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/Sink/collect.html
title: Sink.collect • Akka core
---

# Sink.collect • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Sink.collect

Collect all input elements using a Java [`Collector`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/stream/Collector.html "java.util.stream.Collector").

[Sink operators](../index.html#sink-operators)

## Signature

[`Sink.collect`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Sink.html#collect(java.util.stream.Collector) "akka.stream.javadsl.Sink")[`Sink.collect`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Sink$.html "akka.stream.scaladsl.Sink")

## Description

A [`Sink`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Sink.html "akka.stream.javadsl.Sink") which materializes into a [`CompletionStage`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html "java.util.concurrent.CompletionStage") which will be completed with a result of the Java [`Collector`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/stream/Collector.html "java.util.stream.Collector") transformation and reduction operations.

## Example

Given a stream of numbers we can collect the numbers into a collection with the `seq` operator

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-stream-tests/src/test/java/akka/stream/javadsl/SinkTest.java#L85-L87 "Go to snippet source")final List<Integer> list = Arrays.asList(1, 2, 3);
CompletionStage<List<Integer>> result =
    Source.from(list).runWith(Sink.collect(Collectors.toList()), system);
```

## Reactive Streams semantics

**cancels** when the [`Collector`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/stream/Collector.html "java.util.stream.Collector") throws an exception 

**backpressures** when the [`Collector`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/stream/Collector.html "java.util.stream.Collector")’s previous accumulation is still in progress

## Code Examples

### Example 1: Example

```java
final List<Integer> list = Arrays.asList(1, 2, 3);
CompletionStage<List<Integer>> result =
    Source.from(list).runWith(Sink.collect(Collectors.toList()), system);
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Sink$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Sink.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Sink/collection.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/collect.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/Sink/collect.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/Sink/collect.html)*