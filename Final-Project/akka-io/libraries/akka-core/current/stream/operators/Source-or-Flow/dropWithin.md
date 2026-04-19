---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:27:36Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/dropWithin.html
title: dropWithin • Akka core
---

# dropWithin • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# dropWithin

Drop elements until a timeout has fired

[Timer driven operators](../index.html#timer-driven-operators)

## Signature

[`Source.dropWithin`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html#dropWithin(java.time.Duration) "akka.stream.javadsl.Source")[`Source.dropWithin`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html#dropWithin(d:scala.concurrent.duration.FiniteDuration):FlowOps.this.Repr[Out] "akka.stream.scaladsl.Source") [`Flow.dropWithin`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html#dropWithin(java.time.Duration) "akka.stream.javadsl.Flow")[`Flow.dropWithin`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html#dropWithin(d:scala.concurrent.duration.FiniteDuration):FlowOps.this.Repr[Out] "akka.stream.scaladsl.Flow")

## Description

Drop elements until a timeout has fired

## Reactive Streams semantics

**emits** after the timer fired and a new upstream element arrives

**backpressures** when downstream backpressures

**completes** upstream completes

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/dropWhile.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/empty.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/dropWithin.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/dropWithin.html)*