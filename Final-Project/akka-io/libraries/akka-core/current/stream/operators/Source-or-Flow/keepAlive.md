---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:27:46Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/keepAlive.html
title: keepAlive • Akka core
---

# keepAlive • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# keepAlive

Injects additional (configured) elements if upstream does not emit for a configured amount of time.

[Time aware operators](../index.html#time-aware-operators)

## Signature

[`Source.keepAlive`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html#keepAlive(java.time.Duration,akka.japi.function.Creator) "akka.stream.javadsl.Source")[`Source.keepAlive`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html#keepAlive[U>:Out](maxIdle:scala.concurrent.duration.FiniteDuration,injectedElem:()=>U):FlowOps.this.Repr[U] "akka.stream.scaladsl.Source") [`Flow.keepAlive`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html#keepAlive(java.time.Duration,akka.japi.function.Creator) "akka.stream.javadsl.Flow")[`Flow.keepAlive`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html#keepAlive[U>:Out](maxIdle:scala.concurrent.duration.FiniteDuration,injectedElem:()=>U):FlowOps.this.Repr[U] "akka.stream.scaladsl.Flow")

## Description

Injects additional (configured) elements if upstream does not emit for a configured amount of time.

## Reactive Streams semantics

**emits** when upstream emits an element or if the upstream was idle for the configured period

**backpressures** when downstream backpressures

**completes** when upstream completes

**cancels** when downstream cancels

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Sink/last.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/StreamConverters/javaCollectorParallelUnordered.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/keepAlive.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/keepAlive.html)*