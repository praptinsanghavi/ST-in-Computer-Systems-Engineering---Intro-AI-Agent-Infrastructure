---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:27:18Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/detach.html
title: detach • Akka core
---

# detach • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# detach

Detach upstream demand from downstream demand without detaching the stream rates.

[Simple operators](../index.html#simple-operators)

## Signature

[`Source.detach`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html#detach() "akka.stream.javadsl.Source")[`Source.detach`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html#detach:FlowOps.this.Repr[Out] "akka.stream.scaladsl.Source") [`Flow.detach`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html#detach() "akka.stream.javadsl.Flow")[`Flow.detach`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html#detach:FlowOps.this.Repr[Out] "akka.stream.scaladsl.Flow")

## Description

Detach upstream demand from downstream demand without detaching the stream rates.

## Reactive Streams semantics

**emits** when the upstream operators has emitted and there is demand

**backpressures** when downstream backpressures

**completes** when upstream completes

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/delayWith.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/divertTo.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/detach.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/detach.html)*