---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:27:09Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/Sink/lazyFutureSink.html
title: Sink.lazyFutureSink • Akka core
---

# Sink.lazyFutureSink • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Sink.lazyFutureSink

Defers creation and materialization of a `Sink` until there is a first element.

[Sink operators](../index.html#sink-operators)

## Signature

[`Sink.lazyFutureSink`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Sink.html "akka.stream.javadsl.Sink")[`Sink.lazyFutureSink`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Sink$.html#lazyFutureSink[T,M](create:()=>scala.concurrent.Future[akka.stream.scaladsl.Sink[T,M]]):akka.stream.scaladsl.Sink[T,scala.concurrent.Future[M]] "akka.stream.scaladsl.Sink")

## Description

When the first element comes from upstream the `Future[Sink]` is created. When that completes successfully with a sink that is materialized and inserted in the stream. The internal `Sink` will not be created if the stream completes of fails before any element got through.

The materialized value of the `Sink` will be the materialized value of the created internal flow if it is materialized and failed with a `akka.stream.NeverMaterializedException` if the stream fails or completes without the flow being materialized.

Can be combined with [prefixAndTail](../Source-or-Flow/prefixAndTail.html) to base the sink on the first element.

See also [lazySink](lazySink.html).

## Reactive Streams semantics

**cancels** if the future fails or if the created sink cancels 

**backpressures** when initialized and when created sink backpressures

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Sink$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Sink.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Flow/lazyFutureFlow.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Sink/lazySink.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/prefixAndTail.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/lazyFutureSource.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/Sink/lazyFutureSink.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/Sink/lazyFutureSink.html)*