---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:26:55Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/lazily.html
title: Source.lazily • Akka core
---

# Source.lazily • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Source.lazily

Deprecated by [`Source.lazySource`](lazySource.html).

[Source operators](../index.html#source-operators)

## Signature

[`Source.lazily`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html#lazily(akka.japi.function.Creator) "akka.stream.javadsl.Source")[`Source.lazily`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source$.html#lazily[T,M](create:()=>akka.stream.scaladsl.Source[T,M]):akka.stream.scaladsl.Source[T,scala.concurrent.Future[M]] "akka.stream.scaladsl.Source")

## Description

`lazily` has been deprecated in 2\.6\.0, use [lazySource](lazySource.html) instead.

Defers creation and materialization of a `Source` until there is demand.

## Reactive Streams semantics

**emits** depends on the wrapped `Source`

**completes** depends on the wrapped `Source`

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Sink/lastOption.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/lazilyAsync.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/lazySource.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/lazily.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/lazily.html)*