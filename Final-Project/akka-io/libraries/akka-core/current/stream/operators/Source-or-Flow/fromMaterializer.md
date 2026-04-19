---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:27:21Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/fromMaterializer.html
title: fromMaterializer • Akka core
---

# fromMaterializer • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# fromMaterializer

Defer the creation of a `Source/Flow` until materialization and access `Materializer` and `Attributes`

[Simple operators](../index.html#simple-operators)

## Signature

[`Source.fromMaterializer`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html#fromMaterializer(java.util.function.BiFunction) "akka.stream.javadsl.Source")[`Source.fromMaterializer`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source$.html#fromMaterializer[T,M](factory:(akka.stream.Materializer,akka.stream.Attributes)=>akka.stream.scaladsl.Source[T,M]):akka.stream.scaladsl.Source[T,scala.concurrent.Future[M]] "akka.stream.scaladsl.Source") [`Flow.fromMaterializer`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html#fromMaterializer(java.util.function.BiFunction) "akka.stream.javadsl.Flow")[`Flow.fromMaterializer`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow$.html#fromMaterializer[T,U,M](factory:(akka.stream.Materializer,akka.stream.Attributes)=>akka.stream.scaladsl.Flow[T,U,M]):akka.stream.scaladsl.Flow[T,U,scala.concurrent.Future[M]] "akka.stream.scaladsl.Flow")

## Description

Typically used when access to materializer is needed to run a different stream during the construction of a source/flow. Can also be used to access the underlying `ActorSystem` from `Materializer`.

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow$.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Sink/fromMaterializer.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/StreamConverters/fromJavaStream.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/fromMaterializer.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/fromMaterializer.html)*