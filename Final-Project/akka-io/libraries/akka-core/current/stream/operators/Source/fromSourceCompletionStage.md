---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:26:55Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/fromSourceCompletionStage.html
title: Source.fromSourceCompletionStage • Akka core
---

# Source.fromSourceCompletionStage • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Source.fromSourceCompletionStage

Deprecated by [`Source.completionStageSource`](completionStageSource.html).

[Source operators](../index.html#source-operators)

## Signature

## Description

`fromSourceCompletionStage` has been deprecated in 2\.6\.0, use [completionStageSource](completionStageSource.html) instead.

Streams the elements of an asynchronous source once its given *completion* operator completes. If the *completion* fails the stream is failed with that exception.

## Reactive Streams semantics

**emits** the next value from the asynchronous source, once its *completion operator* has completed

**completes** after the asynchronous source completes

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Flow/fromSinkAndSourceCoupled.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Sink/fromSubscriber.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/completionStageSource.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/fromSourceCompletionStage.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/fromSourceCompletionStage.html)*