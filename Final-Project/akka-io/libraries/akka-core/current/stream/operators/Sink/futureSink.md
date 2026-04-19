---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:27:07Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/Sink/futureSink.html
title: Sink.futureSink • Akka core
---

# Sink.futureSink • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Sink.futureSink

Streams the elements to the given future sink once it successfully completes. 

[Sink operators](../index.html#sink-operators)

## Signature

[`Sink.futureSink`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Sink.html "akka.stream.javadsl.Sink")[`Sink.futureSink`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Sink$.html#futureSink[T,M](future:scala.concurrent.Future[akka.stream.scaladsl.Sink[T,M]]):akka.stream.scaladsl.Sink[T,scala.concurrent.Future[M]] "akka.stream.scaladsl.Sink")

## Description

Streams the elements through the given future flow once it successfully completes. If the future fails the stream is failed.

## Reactive Streams semantics

**cancels** if the future fails or if the created sink cancels 

**backpressures** when initialized and when created sink backpressures

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Sink$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Sink.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Flow/futureFlow.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/futureSource.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/Sink/futureSink.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/Sink/futureSink.html)*