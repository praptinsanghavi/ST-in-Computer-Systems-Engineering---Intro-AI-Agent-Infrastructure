---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:27:45Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/idleTimeout.html
title: idleTimeout • Akka core
---

# idleTimeout • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# idleTimeout

If the time between two processed elements exceeds the provided timeout, the stream is failed with a `TimeoutException`.

[Time aware operators](../index.html#time-aware-operators)

## Signature

[`Source.idleTimeout`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html#idleTimeout(java.time.Duration) "akka.stream.javadsl.Source")[`Source.idleTimeout`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html#idleTimeout(timeout:scala.concurrent.duration.FiniteDuration):FlowOps.this.Repr[Out] "akka.stream.scaladsl.Source") [`Flow.idleTimeout`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html#idleTimeout(java.time.Duration) "akka.stream.javadsl.Flow")[`Flow.idleTimeout`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html#idleTimeout(timeout:scala.concurrent.duration.FiniteDuration):FlowOps.this.Repr[Out] "akka.stream.scaladsl.Flow")

## Description

If the time between two processed elements exceeds the provided timeout, the stream is failed with a `TimeoutException`. The timeout is checked periodically, so the resolution of the check is one period (equals to timeout value).

## Reactive Streams semantics

**emits** when upstream emits an element

**backpressures** when downstream backpressures

**completes** when upstream completes or fails if timeout elapses between two emitted elements

**cancels** when downstream cancels

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Sink/headOption.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Sink/ignore.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/idleTimeout.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/idleTimeout.html)*