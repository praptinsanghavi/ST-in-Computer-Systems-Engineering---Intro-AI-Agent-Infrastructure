---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:27:27Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/limitWeighted.html
title: limitWeighted • Akka core
---

# limitWeighted • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# limitWeighted

Limit the total weight of incoming elements

[Simple operators](../index.html#simple-operators)

## Signature

[`Flow.limitWeighted`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html#limitWeighted(long,akka.japi.function.Function) "akka.stream.javadsl.Flow")[`Flow.limitWeighted`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html#limitWeighted[T](max:Long)(costFn:Out=>Long):FlowOps.this.Repr[Out] "akka.stream.scaladsl.Flow") 

## Description

A weight function returns the weight of each element, then the total accumulated weight is compared to a max and if it has passed the max the stream is failed with a [`StreamLimitReachedException`](https://doc.akka.io/api/akka-core/2.10/akka/stream/StreamLimitReachedException.html "akka.stream.StreamLimitReachedException")[`StreamLimitReachedException`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/StreamLimitReachedException.html "akka.stream.StreamLimitReachedException").

See also [limit](limit.html) which puts a limit on the number of elements instead (the same as always returning `1` from the weight function).

## Examples

`limitWeighted` can protect a stream coming from an untrusted source into an in\-memory aggregate that grows with the number of elements from filling the heap and causing an out\-of\-memory error. In this sample we use the number of bytes in each `ByteString` element as weight and accept at most a total of 10 000 bytes from the untrusted source elements into the aggregated `ByteString` of all bytes, if the untrusted source emits more elements the stream and the materialized `Future[ByteString]``CompletionStage<ByteString>` will be failed:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/operators/sourceorflow/LimitWeighted.scala#L22-L25 "Go to snippet source")val untrustedSource: Source[ByteString, NotUsed] = Source.repeat(ByteString("element"))

val allBytes: Future[ByteString] =
  untrustedSource.limitWeighted(max = 10000)(_.length).runReduce(_ ++ _)
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/operators/sourceorflow/LimitWeighted.java#L17-L25 "Go to snippet source")Source<ByteString, NotUsed> untrustedSource = Source.repeat(ByteString.fromString("element"));

CompletionStage<ByteString> allBytes =
    untrustedSource
        .limitWeighted(
            10000, // max bytes
            bytes -> (long) bytes.length() // bytes of each chunk
            )
        .runReduce(ByteString::concat, system);
```

## Reactive Streams semantics

**emits** when upstream emits and the number of emitted elements has not reached max

**backpressures** when downstream backpressures

**completes** when upstream completes and the number of emitted elements has not reached max

## Code Examples

### Example 1: Examples

```scala
val untrustedSource: Source[ByteString, NotUsed] = Source.repeat(ByteString("element"))

val allBytes: Future[ByteString] =
  untrustedSource.limitWeighted(max = 10000)(_.length).runReduce(_ ++ _)
```

### Example 2: Examples

```java
Source<ByteString, NotUsed> untrustedSource = Source.repeat(ByteString.fromString("element"));

CompletionStage<ByteString> allBytes =
    untrustedSource
        .limitWeighted(
            10000, // max bytes
            bytes -> (long) bytes.length() // bytes of each chunk
            )
        .runReduce(ByteString::concat, system);
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/stream/StreamLimitReachedException.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/StreamLimitReachedException.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/limit.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/log.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/limitWeighted.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/limitWeighted.html)*