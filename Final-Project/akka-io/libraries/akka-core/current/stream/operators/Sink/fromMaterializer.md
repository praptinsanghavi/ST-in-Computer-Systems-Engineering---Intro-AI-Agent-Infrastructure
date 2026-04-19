---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:27:06Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/Sink/fromMaterializer.html
title: Sink.fromMaterializer • Akka core
---

# Sink.fromMaterializer • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Sink.fromMaterializer

Defer the creation of a `Sink` until materialization and access `Materializer` and `Attributes`

[Sink operators](../index.html#sink-operators)

## Signature

[`Sink.fromMaterializer`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Sink.html#fromMaterializer(java.util.function.BiFunction) "akka.stream.javadsl.Sink")[`Sink.fromMaterializer`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Sink$.html#fromMaterializer[T,M](factory:(akka.stream.Materializer,akka.stream.Attributes)=>akka.stream.scaladsl.Sink[T,M]):akka.stream.scaladsl.Sink[T,scala.concurrent.Future[M]] "akka.stream.scaladsl.Sink")

## Description

Typically used when access to materializer is needed to run a different stream during the construction of a sink. Can also be used to access the underlying `ActorSystem` from `Materializer`.

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Sink$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Sink.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/fromMaterializer.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/StreamConverters/fromOutputStream.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/Sink/fromMaterializer.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/Sink/fromMaterializer.html)*