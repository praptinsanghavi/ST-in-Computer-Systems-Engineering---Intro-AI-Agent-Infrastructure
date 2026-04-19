---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:27:40Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/buffer.html
title: buffer • Akka core
---

# buffer • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# buffer

Allow for a temporarily faster upstream events by buffering `size` elements.

[Backpressure aware operators](../index.html#backpressure-aware-operators)

## Signature

[`Source.buffer`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html#buffer(int,akka.stream.OverflowStrategy) "akka.stream.javadsl.Source")[`Source.buffer`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html#buffer(size:Int,overflowStrategy:akka.stream.OverflowStrategy):FlowOps.this.Repr[Out] "akka.stream.scaladsl.Source") [`Flow.buffer`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html#buffer(int,akka.stream.OverflowStrategy) "akka.stream.javadsl.Flow")[`Flow.buffer`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html#buffer(size:Int,overflowStrategy:akka.stream.OverflowStrategy):FlowOps.this.Repr[Out] "akka.stream.scaladsl.Flow")

## Description

Allow for a temporarily faster upstream events by buffering `size` elements. When the buffer is full, a new element is handled according to the specified `OverflowStrategy`:

- `backpressure` backpressure is applied upstream
- `dropHead` drops the oldest element in the buffer to make space for the new element
- `dropTail` drops the youngest element in the buffer to make space for the new element
- `dropBuffer` drops the entire buffer and buffers the new element
- `dropNew` drops the new element
- `fail` fails the flow with a `BufferOverflowException`

## Reactive Streams semantics

**emits** when downstream stops backpressuring and there is a pending element in the buffer

**backpressures** when `OverflowStrategy` is `backpressure` and buffer is full

**completes** when upstream completes and buffered elements has been drained, or when `OverflowStrategy` is `fail`, the buffer is full and a new element arrives

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Broadcast.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Sink/cancelled.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/buffer.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/buffer.html)*