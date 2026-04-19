---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:27:43Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/flatMapPrefix.html
title: flatMapPrefix • Akka core
---

# flatMapPrefix • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# flatMapPrefix

Use the first `n` elements from the stream to determine how to process the rest.

[Nesting and flattening operators](../index.html#nesting-and-flattening-operators)

## Signature

[`Source.flatMapPrefix`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html#flatMapPrefix(int,akka.japi.function.Function) "akka.stream.javadsl.Source")[`Source.flatMapPrefix`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html#flatMapPrefix[Out2,Mat2](n:Int)(f:scala.collection.immutable.Seq[Out]=>akka.stream.scaladsl.Flow[Out,Out2,Mat2]):FlowOps.this.Repr[Out2] "akka.stream.scaladsl.Source") [`Flow.flatMapPrefix`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html#flatMapPrefix(int,akka.japi.function.Function) "akka.stream.javadsl.Flow")[`Flow.flatMapPrefix`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html#flatMapPrefix[Out2,Mat2](n:Int)(f:scala.collection.immutable.Seq[Out]=>akka.stream.scaladsl.Flow[Out,Out2,Mat2]):FlowOps.this.Repr[Out2] "akka.stream.scaladsl.Flow")

## Description

Take up to *n* elements from the stream (less than *n* only if the upstream completes before emitting *n* elements), then apply *f* on these elements in order to obtain a flow, this flow is then materialized and the rest of the input is processed by this flow (similar to via). This method returns a flow consuming the rest of the stream producing the materialized flow’s output.

## Reactive Streams semantics

**emits** when the materialized flow emits. Notice the first `n` elements are buffered internally before materializing the flow and connecting it to the rest of the upstream \- producing elements at its own discretion (might ‘swallow’ or multiply elements).

**backpressures** when the materialized flow backpressures

**completes** the materialized flow completes. If upstream completes before producing `n` elements, `f` will be applied with the provided elements, the resulting flow will be materialized and signalled for upstream completion, it can then or continue to emit elements at its own discretion.

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Flow/flattenOptional.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/flatMapMerge.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/flatMapPrefix.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/flatMapPrefix.html)*