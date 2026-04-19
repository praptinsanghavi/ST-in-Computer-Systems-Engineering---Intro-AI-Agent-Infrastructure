---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:27:26Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/limit.html
title: limit • Akka core
---

# limit • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# limit

Limit number of element from upstream to given `max` number.

[Simple operators](../index.html#simple-operators)

## Signature

[`Flow.limit`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html#limit(long) "akka.stream.javadsl.Flow")[`Flow.limit`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow$.html#limit(max:Long):FlowOps.this.Repr[Out] "akka.stream.scaladsl.Flow") 

## Description

Limits the number of elements from upstream to a given `max` number, if the limit is passed the operator fails the stream with a [`StreamLimitReachedException`](https://doc.akka.io/api/akka-core/2.10/akka/stream/StreamLimitReachedException.html "akka.stream.StreamLimitReachedException")[`StreamLimitReachedException`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/StreamLimitReachedException.html "akka.stream.StreamLimitReachedException").

See also [limitWeighted](limitWeighted.html) which can choose a weight for each element counting to a total max limit weight. [take](take.html) is also closely related but completes the stream instead of failing it after a certain number of elements.

## Example

`limit` can protect a stream coming from an untrusted source into an in\-memory aggregate that grows with the number of elements from filling the heap and causing an out\-of\-memory error. In this sample we take at most 10 000 of the untrusted source elements into the aggregated sequence of elements, if the untrusted source emits more elements the stream and the materialized `Future[Seq[String]]``CompletionStage<List<String>>` will be failed:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/operators/sourceorflow/Limit.scala#L22-L25 "Go to snippet source")val untrustedSource: Source[String, NotUsed] = Source.repeat("element")

val elements: Future[Seq[String]] =
  untrustedSource.limit(10000).runWith(Sink.seq)
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/operators/sourceorflow/Limit.java#L18-L21 "Go to snippet source")Source<String, NotUsed> untrustedSource = Source.repeat("element");

CompletionStage<List<String>> elements =
    untrustedSource.limit(10000).runWith(Sink.seq(), system);
```

## Reactive Streams semantics

**emits** when upstream emits and the number of emitted elements has not reached max

**backpressures** when downstream backpressures

**completes** when upstream completes and the number of emitted elements has not reached max

## Code Examples

### Example 1: Example

```scala
val untrustedSource: Source[String, NotUsed] = Source.repeat("element")

val elements: Future[Seq[String]] =
  untrustedSource.limit(10000).runWith(Sink.seq)
```

### Example 2: Example

```java
Source<String, NotUsed> untrustedSource = Source.repeat("element");

CompletionStage<List<String>> elements =
    untrustedSource.limit(10000).runWith(Sink.seq(), system);
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/stream/StreamLimitReachedException.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/StreamLimitReachedException.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/limitWeighted.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/take.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/lazySource.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/limit.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/limit.html)*