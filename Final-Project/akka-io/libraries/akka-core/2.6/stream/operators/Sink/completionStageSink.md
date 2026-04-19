---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:15:42Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/Sink/completionStageSink.html
title: Sink.completionStageSink • Akka Documentation
---

# Sink.completionStageSink • Akka Documentation

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

# Sink.completionStageSink

Streams the elements to the given future sink once it successfully completes. 

[Sink operators](../index.html#sink-operators)

## Description

Streams the elements through the given future flow once it successfully completes. If the future fails the stream is failed.

## Reactive Streams semantics

**cancels** if the future fails or if the created sink cancels 

**backpressures** when initialized and when created sink backpressures

## Related Pages (Internal Links)

- https://doc.akka.io/libraries/akka-core/2.6/stream/operators/Flow/completionStageFlow.html
- https://doc.akka.io/libraries/akka-core/2.6/stream/operators/Source/completionStageSource.html
- https://doc.akka.io/libraries/akka-core/2.6/stream/operators/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/2.6/stream/operators/Sink/completionStageSink.html](https://doc.akka.io/libraries/akka-core/2.6/stream/operators/Sink/completionStageSink.html)*