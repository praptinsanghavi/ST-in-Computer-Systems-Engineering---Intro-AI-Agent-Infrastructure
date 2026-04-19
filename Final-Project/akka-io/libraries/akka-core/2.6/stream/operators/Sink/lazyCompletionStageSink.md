---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:15:41Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/Sink/lazyCompletionStageSink.html
title: Sink.lazyCompletionStageSink • Akka Documentation
---

# Sink.lazyCompletionStageSink • Akka Documentation

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

# Sink.lazyCompletionStageSink

Defers creation and materialization of a `Sink` until there is a first element.

[Sink operators](../index.html#sink-operators)

## Description

When the first element comes from upstream the `CompletionStage<Sink>` is created. When that completes successfully with a sink that is materialized and inserted in the stream. The internal `Sink` will not be created if the stream completes of fails before any element got through.

The materialized value of the `Sink` will be the materialized value of the created internal flow if it is materialized and failed with a `akka.stream.NeverMaterializedException` if the stream fails or completes without the flow being materialized.

Can be combined with [prefixAndTail](../Source-or-Flow/prefixAndTail.html) to base the sink on the first element.

See also [lazySink](lazySink.html).

## Reactive Streams semantics

**cancels** if the future fails or if the created sink cancels 

**backpressures** when initialized and when created sink backpressures

## Related Pages (Internal Links)

- https://doc.akka.io/libraries/akka-core/2.6/stream/operators/Flow/lazyCompletionStageFlow.html
- https://doc.akka.io/libraries/akka-core/2.6/stream/operators/Sink/lazySink.html
- https://doc.akka.io/libraries/akka-core/2.6/stream/operators/Source-or-Flow/prefixAndTail.html
- https://doc.akka.io/libraries/akka-core/2.6/stream/operators/Source/lazyCompletionStageSource.html
- https://doc.akka.io/libraries/akka-core/2.6/stream/operators/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/2.6/stream/operators/Sink/lazyCompletionStageSink.html](https://doc.akka.io/libraries/akka-core/2.6/stream/operators/Sink/lazyCompletionStageSink.html)*