---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:27:37Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/initialDelay.html
title: initialDelay • Akka core
---

# initialDelay • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# initialDelay

Delays the initial element by the specified duration.

[Timer driven operators](../index.html#timer-driven-operators)

## Signature

[`Source.initialDelay`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html#initialDelay(java.time.Duration) "akka.stream.javadsl.Source")[`Source.initialDelay`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source$.html#initialDelay(delay:scala.concurrent.duration.FiniteDuration):FlowOps.this.Repr[Out] "akka.stream.scaladsl.Source") [`Flow.initialDelay`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html#initialDelay(java.time.Duration) "akka.stream.javadsl.Flow")[`Flow.initialDelay`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html#initialDelay(delay:scala.concurrent.duration.FiniteDuration):FlowOps.this.Repr[Out] "akka.stream.scaladsl.Flow")

## Description

Delays the initial element by the specified duration.

## Reactive Streams semantics

**emits** when upstream emits an element if the initial delay is already elapsed

**backpressures** when downstream backpressures or initial delay is not yet elapsed

**completes** when upstream completes

**cancels** when downstream cancels

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Compression/inflate.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/initialTimeout.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/initialDelay.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/initialDelay.html)*