---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:27:10Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/Sink/lazyInitAsync.html
title: Sink.lazyInitAsync • Akka core
---

# Sink.lazyInitAsync • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Sink.lazyInitAsync

Deprecated by [`Sink.lazyFutureSink`](lazyFutureSink.html).

[Sink operators](../index.html#sink-operators)

## Signature

[`Flow.lazyInitAsync`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html#lazyInitAsync(akka.japi.function.Creator) "akka.stream.javadsl.Flow")[`Flow.lazyInitAsync`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow$.html#lazyInitAsync[I,O,M](flowFactory:()=>scala.concurrent.Future[akka.stream.scaladsl.Flow[I,O,M]]):akka.stream.scaladsl.Flow[I,O,scala.concurrent.Future[Option[M]]] "akka.stream.scaladsl.Flow") [`Sink.lazyInitAsync`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Sink.html#lazyInitAsync(akka.japi.function.Creator) "akka.stream.javadsl.Sink")[`Sink.lazyInitAsync`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Sink$.html#lazyInitAsync[T,M](sinkFactory:()=>scala.concurrent.Future[akka.stream.scaladsl.Sink[T,M]]):akka.stream.scaladsl.Sink[T,scala.concurrent.Future[Option[M]]] "akka.stream.scaladsl.Sink")

## Description

`lazyInitAsync` has been deprecated in 2\.6\.0, use [lazyFutureSink](lazyFutureSink.html) instead.

Creates a real `Sink` upon receiving the first element. Internal `Sink` will not be created if there are no elements, because of completion or error.

- If upstream completes before an element was received then the `Future``CompletionStage` is completed with `None`an empty `Optional`.
- If upstream fails before an element was received, `sinkFactory` throws an exception, or materialization of the internal sink fails then the `Future``CompletionStage` is completed with the exception.
- Otherwise the `Future``CompletionStage` is completed with the materialized value of the internal sink.

## Reactive Streams semantics

**cancels** never

**backpressures** when initialized and when created sink backpressures

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow$.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Sink$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Sink.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Flow/lazyInitAsync.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Sink/lazyFutureSink.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/lazySingle.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/Sink/lazyInitAsync.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/Sink/lazyInitAsync.html)*