---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:28:34Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/wireTap.html
title: wireTap • Akka core
---

# wireTap • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# wireTap

Attaches the given `Sink` to this `Flow` as a wire tap, meaning that elements that pass through will also be sent to the wire\-tap `Sink`, without the latter affecting the mainline flow.

[Fan\-out operators](../index.html#fan-out-operators)

## Signature

[`Source.wireTap`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html#wireTap(akka.japi.function.Procedure) "akka.stream.javadsl.Source")[`Source.wireTap`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html#wireTap(f:Out=>Unit):FlowOps.this.Repr[Out] "akka.stream.scaladsl.Source") [`Flow.wireTap`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html#wireTap(akka.japi.function.Procedure) "akka.stream.javadsl.Flow")[`Flow.wireTap`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html#wireTap(f:Out=>Unit):FlowOps.this.Repr[Out] "akka.stream.scaladsl.Flow")

## Description

Attaches the given `Sink` to this `Flow` as a wire tap, meaning that elements that pass through will also be sent to the wire\-tap `Sink`, without the latter affecting the mainline flow. If the wire\-tap `Sink` backpressures, elements that would’ve been sent to it will be dropped instead.

## Reactive Streams semantics

**emits** element is available and demand exists from the downstream; the element will also be sent to the wire\-tap `Sink` if there is demand.

**backpressures** downstream backpressures

**completes** upstream completes

**cancels** downstream cancels

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/RestartSource/withBackoff.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/watchTermination.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/wireTap.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/wireTap.html)*