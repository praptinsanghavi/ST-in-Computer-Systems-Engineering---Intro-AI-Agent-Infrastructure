---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:27:11Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/Sink/queue.html
title: Sink.queue • Akka core
---

# Sink.queue • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Sink.queue

Materialize a `SinkQueue` that can be pulled to trigger demand through the sink.

[Sink operators](../index.html#sink-operators)

## Signature

[`Sink.queue`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Sink.html#queue(int) "akka.stream.javadsl.Sink")[`Sink.queue`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Sink$.html#queue[T](maxConcurrentPulls:Int):akka.stream.scaladsl.Sink[T,akka.stream.scaladsl.SinkQueueWithCancel[T]] "akka.stream.scaladsl.Sink")

## Description

Materialize a `SinkQueue` that can be pulled to trigger demand through the sink. The queue contains a buffer in case stream emitting elements faster than queue pulling them.

## Reactive Streams semantics

**cancels** when `SinkQueue.cancel` is called

**backpressures** when buffer has some space

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Sink$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Sink.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/queue.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/range.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/Sink/queue.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/Sink/queue.html)*