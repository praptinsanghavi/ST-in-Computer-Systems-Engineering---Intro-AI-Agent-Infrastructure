---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:27:38Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/takeWithin.html
title: takeWithin • Akka core
---

# takeWithin • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# takeWithin

Pass elements downstream within a timeout and then complete.

[Timer driven operators](../index.html#timer-driven-operators)

## Signature

[`Source.takeWithin`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html#takeWithin(java.time.Duration) "akka.stream.javadsl.Source")[`Source.takeWithin`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html#takeWithin(d:scala.concurrent.duration.FiniteDuration):FlowOps.this.Repr[Out] "akka.stream.scaladsl.Source") [`Flow.takeWithin`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html#takeWithin(java.time.Duration) "akka.stream.javadsl.Flow")[`Flow.takeWithin`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html#takeWithin(d:scala.concurrent.duration.FiniteDuration):FlowOps.this.Repr[Out] "akka.stream.scaladsl.Flow")

## Description

Pass elements downstream within a timeout and then complete.

## Reactive Streams semantics

**emits** when an upstream element arrives

**backpressures** downstream backpressures

**completes** upstream completes or timer fires

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/takeWhile.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/throttle.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/takeWithin.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/takeWithin.html)*