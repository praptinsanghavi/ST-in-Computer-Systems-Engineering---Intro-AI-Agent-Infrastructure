---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:27:58Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/alsoTo.html
title: alsoTo • Akka core
---

# alsoTo • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# alsoTo

Attaches the given `Sink` to this `Flow`, meaning that elements that pass through this `Flow` will also be sent to the `Sink`.

[Fan\-out operators](../index.html#fan-out-operators)

## Signature

[`Source.alsoTo`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html#alsoTo(akka.stream.Graph) "akka.stream.javadsl.Source")[`Source.alsoTo`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html#alsoTo(that:akka.stream.Graph[akka.stream.SinkShape[Out],_]):FlowOps.this.Repr[Out] "akka.stream.scaladsl.Source") [`Flow.alsoTo`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html#alsoTo(akka.stream.Graph) "akka.stream.javadsl.Flow")[`Flow.alsoTo`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html#alsoTo(that:akka.stream.Graph[akka.stream.SinkShape[Out],_]):FlowOps.this.Repr[Out] "akka.stream.scaladsl.Flow")

## Description

Attaches the given `Sink` to this `Flow`, meaning that elements that pass through this `Flow` will also be sent to the `Sink`.

## Reactive Streams semantics

**emits** when an element is available and demand exists both from the `Sink` and the downstream

**backpressures** when downstream or `Sink` backpressures

**completes** when upstream completes

**cancels** when downstream or `Sink` cancels

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/aggregateWithBoundary.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/alsoToAll.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/alsoTo.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/alsoTo.html)*