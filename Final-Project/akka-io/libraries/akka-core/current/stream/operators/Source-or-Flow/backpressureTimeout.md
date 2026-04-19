---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:27:45Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/backpressureTimeout.html
title: backpressureTimeout • Akka core
---

# backpressureTimeout • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# backpressureTimeout

If the time between the emission of an element and the following downstream demand exceeds the provided timeout, the stream is failed with a `TimeoutException`.

[Time aware operators](../index.html#time-aware-operators)

## Signature

[`Source.backpressureTimeout`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html#backpressureTimeout(java.time.Duration) "akka.stream.javadsl.Source")[`Source.backpressureTimeout`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html#backpressureTimeout(timeout:scala.concurrent.duration.FiniteDuration):FlowOps.this.Repr[Out] "akka.stream.scaladsl.Source") [`Flow.backpressureTimeout`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html#backpressureTimeout(java.time.Duration) "akka.stream.javadsl.Flow")[`Flow.backpressureTimeout`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html#backpressureTimeout(timeout:scala.concurrent.duration.FiniteDuration):FlowOps.this.Repr[Out] "akka.stream.scaladsl.Flow")

## Description

If the time between the emission of an element and the following downstream demand exceeds the provided timeout, the stream is failed with a `TimeoutException`. The timeout is checked periodically, so the resolution of the check is one period (equals to timeout value).

## Reactive Streams semantics

**emits** when upstream emits an element

**backpressures** when downstream backpressures

**completes** when upstream completes or fails if timeout elapses between element emission and downstream demand.

**cancels** when downstream cancels

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Balance.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/asSubscriber.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/backpressureTimeout.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/backpressureTimeout.html)*