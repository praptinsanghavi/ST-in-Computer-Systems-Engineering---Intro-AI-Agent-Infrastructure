---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:15:47Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/lazyCompletionStage.html
title: Source.lazyCompletionStage • Akka Documentation
---

# Source.lazyCompletionStage • Akka Documentation

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

# Source.lazyCompletionStage

Defers creation of a future of a single element source until there is demand.

[Source operators](../index.html#source-operators)

## Description

Invokes the user supplied factory when the first downstream demand arrives. When the returned future completes successfully the value is emitted downstream as a single stream element. If the future or the factory fails the stream is failed.

Note that asynchronous boundaries (and other operators) in the stream may do pre\-fetching which counter acts the laziness and will trigger the factory immediately.

## Reactive Streams semantics

**emits** when there is downstream demand and the element factory returned future has completed

**completes** after emitting the single element

## Related Pages (Internal Links)

- https://doc.akka.io/libraries/akka-core/2.6/stream/operators/Flow/lazyCompletionStageFlow.html
- https://doc.akka.io/libraries/akka-core/2.6/stream/operators/Source/lazilyAsync.html
- https://doc.akka.io/libraries/akka-core/2.6/stream/operators/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/2.6/stream/operators/Source/lazyCompletionStage.html](https://doc.akka.io/libraries/akka-core/2.6/stream/operators/Source/lazyCompletionStage.html)*