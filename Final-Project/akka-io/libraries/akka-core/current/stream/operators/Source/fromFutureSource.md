---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:26:54Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/fromFutureSource.html
title: Source.fromFutureSource • Akka core
---

# Source.fromFutureSource • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Source.fromFutureSource

Deprecated by [`Source.futureSource`](futureSource.html).

[Source operators](../index.html#source-operators)

## Signature

[`Source.fromFutureSource`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html "akka.stream.javadsl.Source")[`Source.fromFutureSource`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source$.html#fromFutureSource[T,M](future:scala.concurrent.Future[akka.stream.Graph[akka.stream.SourceShape[T],M]]):akka.stream.scaladsl.Source[T,scala.concurrent.Future[M]] "akka.stream.scaladsl.Source")

## Description

`fromFutureSource` has been deprecated in 2\.6\.0, use [futureSource](futureSource.html) instead.

Streams the elements of the given future source once it successfully completes. If the future fails the stream is failed.

## Reactive Streams semantics

**emits** the next value from the *future* source, once it has completed

**completes** after the *future* source completes

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/fromFuture.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/futureSource.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/StreamConverters/fromInputStream.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/fromFutureSource.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/fromFutureSource.html)*