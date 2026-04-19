---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:27:45Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/initialTimeout.html
title: initialTimeout • Akka core
---

# initialTimeout • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# initialTimeout

If the first element has not passed through this operators before the provided timeout, the stream is failed with a `TimeoutException`.

[Time aware operators](../index.html#time-aware-operators)

## Signature

[`Source.initialTimeout`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html#initialTimeout(java.time.Duration) "akka.stream.javadsl.Source")[`Source.initialTimeout`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html#initialTimeout(timeout:scala.concurrent.duration.FiniteDuration):FlowOps.this.Repr[Out] "akka.stream.scaladsl.Source") [`Flow.initialTimeout`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html#initialTimeout(java.time.Duration) "akka.stream.javadsl.Flow")[`Flow.initialTimeout`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html#initialTimeout(timeout:scala.concurrent.duration.FiniteDuration):FlowOps.this.Repr[Out] "akka.stream.scaladsl.Flow")

## Description

If the first element has not passed through this operators before the provided timeout, the stream is failed with a `TimeoutException`.

## Reactive Streams semantics

**emits** when upstream emits an element

**backpressures** when downstream backpressures

**completes** when upstream completes or fails if timeout elapses before first element arrives

**cancels** when downstream cancels

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/initialDelay.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/interleave.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/initialTimeout.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/initialTimeout.html)*