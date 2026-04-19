---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:26:57Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/lazyFutureSource.html
title: Source.lazyFutureSource • Akka core
---

# Source.lazyFutureSource • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Source.lazyFutureSource

Defers creation and materialization of a `Source` until there is demand.

[Source operators](../index.html#source-operators)

## Signature

[`Source.lazyFutureSource`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html "akka.stream.javadsl.Source")[`Source.lazyFutureSource`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source$.html#lazyFutureSource[T,M](create:()=>scala.concurrent.Future[akka.stream.scaladsl.Source[T,M]]):akka.stream.scaladsl.Source[T,scala.concurrent.Future[M]] "akka.stream.scaladsl.Source")

## Description

Invokes the user supplied factory when the first downstream demand arrives. When the returned future completes successfully the source switches over to the new source and emits downstream just like if it had been created up front.

Note that asynchronous boundaries (and other operators) in the stream may do pre\-fetching which counter acts the laziness and will trigger the factory immediately.

See also [lazySource](lazySource.html).

## Reactive Streams semantics

**emits** depends on the wrapped `Source`

**completes** depends on the wrapped `Source`

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Flow/lazyInitAsync.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Sink/lazyFutureSink.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/lazySource.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/lazyFutureSource.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/lazyFutureSource.html)*