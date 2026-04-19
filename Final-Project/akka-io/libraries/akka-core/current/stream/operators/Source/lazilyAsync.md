---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:26:57Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/lazilyAsync.html
title: Source.lazilyAsync • Akka core
---

# Source.lazilyAsync • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Source.lazilyAsync

Deprecated by [`Source.lazyFutureSource`](lazyFutureSource.html).

[Source operators](../index.html#source-operators)

## Signature

## Description

`lazilyAsync` has been deprecated in 2\.6\.0, use [lazyFutureSource](lazyFutureSource.html) instead.

Defers creation and materialization of a `CompletionStage` until there is demand.

## Reactive Streams semantics

**emits** the future completes

**completes** after the future has completed

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/lazily.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/lazyCompletionStage.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/lazyFutureSource.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/lazilyAsync.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/lazilyAsync.html)*