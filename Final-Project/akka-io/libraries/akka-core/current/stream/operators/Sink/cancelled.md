---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:27:03Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/Sink/cancelled.html
title: Sink.cancelled • Akka core
---

# Sink.cancelled • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Sink.cancelled

Immediately cancel the stream

[Sink operators](../index.html#sink-operators)

## Signature

[`Sink.cancelled`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Sink.html#cancelled() "akka.stream.javadsl.Sink")[`Sink.cancelled`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Sink$.html#cancelled[T]:akka.stream.scaladsl.Sink[T,akka.NotUsed] "akka.stream.scaladsl.Sink")

## Description

Immediately cancel the stream

## Example

In this example, we have a source that generates numbers from 1 to 5 but as we have used cancelled we get `NotUsed` as materialized value and stream cancels.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/operators/sink/Cancelled.scala#L18-L19 "Go to snippet source")val source = Source(1 to 5)
source.runWith(Sink.cancelled)
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/operators/SinkDocExamples.java#L118-L120 "Go to snippet source")Source<Integer, NotUsed> source = Source.range(1, 5);
NotUsed sum = source.runWith(Sink.cancelled(), system);
return sum;
```

## Reactive Streams semantics

**cancels** immediately

## Code Examples

### Example 1: Example

```scala
val source = Source(1 to 5)
source.runWith(Sink.cancelled)
```

### Example 2: Example

```java
Source<Integer, NotUsed> source = Source.range(1, 5);
NotUsed sum = source.runWith(Sink.cancelled(), system);
return sum;
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Sink$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Sink.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/buffer.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/collect.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/Sink/cancelled.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/Sink/cancelled.html)*