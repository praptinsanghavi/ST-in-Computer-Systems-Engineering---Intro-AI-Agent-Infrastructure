---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:15:53Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/Flow/lazyFutureFlow.html
title: Flow.lazyFutureFlow • Akka Documentation
---

# Flow.lazyFutureFlow • Akka Documentation

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

# Flow.lazyFutureFlow

Defers creation and materialization of a `Flow` until there is a first element.

[Simple operators](../index.html#simple-operators)

## Signature

[`Flow.lazyFutureFlow`](https://doc.akka.io/japi/akka-core/2.6/akka/stream/javadsl/Flow.html "akka.stream.javadsl.Flow")[`Flow.lazyFutureFlow`](https://doc.akka.io/api/akka-core/2.6/akka/stream/scaladsl/Flow$.html#lazyFutureFlow[I,O,M](create:()=>scala.concurrent.Future[akka.stream.scaladsl.Flow[I,O,M]]):akka.stream.scaladsl.Flow[I,O,scala.concurrent.Future[M]] "akka.stream.scaladsl.Flow")

## Description

When the first element comes from upstream the actual `Future[Flow]` is created and when that completes it is materialized and inserted in the stream. The internal `Flow` will not be created if there are no elements on completion or failure of up or downstream.

The materialized value of the `Flow` will be the materialized value of the created internal flow if it is materialized and failed with a `akka.stream.NeverMaterializedException` if the stream fails or completes without the flow being materialized.

See also [lazyFlow](lazyFlow.html).

Can be combined with `prefixAndTail(1)` to base the flow construction on the initial element triggering creation. See [lazyFlow](lazyFlow.html) for sample.

## Reactive Streams semantics

**emits** when the internal flow is successfully created and it emits

**backpressures** when the internal flow is successfully created and it backpressures

**completes** when upstream completes and all elements have been emitted from the internal flow

**completes** when upstream completes and all futures have been completed and all elements have been emitted

**cancels** when downstream cancels (keep reading) The operator’s default behaviour in case of downstream cancellation before nested flow materialization (future completion) is to cancel immediately. This behaviour can be controlled by setting the [akka.stream.Attributes.NestedMaterializationCancellationPolicy.PropagateToNested](./akka.stream.Attributes.NestedMaterializationCancellationPolicy.PropagateToNested.html) attribute, this will delay downstream cancellation until nested flow’s materialization which is then immediately cancelled (with the original cancellation cause).

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.6/akka/stream/scaladsl/Flow$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/stream/javadsl/Flow.html
- https://doc.akka.io/libraries/akka-core/2.6/stream/operators/Flow/akka.stream.Attributes.NestedMaterializationCancellationPolicy.PropagateToNested.html
- https://doc.akka.io/libraries/akka-core/2.6/stream/operators/Flow/lazyFlow.html
- https://doc.akka.io/libraries/akka-core/2.6/stream/operators/Sink/lazyFutureSink.html
- https://doc.akka.io/libraries/akka-core/2.6/stream/operators/Source/lazyFuture.html
- https://doc.akka.io/libraries/akka-core/2.6/stream/operators/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/2.6/stream/operators/Flow/lazyFutureFlow.html](https://doc.akka.io/libraries/akka-core/2.6/stream/operators/Flow/lazyFutureFlow.html)*