---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:27:25Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/Flow/lazyInitAsync.html
title: Flow.lazyInitAsync • Akka core
---

# Flow.lazyInitAsync • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Flow.lazyInitAsync

Deprecated by [`Flow.lazyFutureFlow`](lazyFutureFlow.html) in combination with [`prefixAndTail`](../Source-or-Flow/prefixAndTail.html).

[Simple operators](../index.html#simple-operators)

## Signature

[`Flow.lazyInitAsync`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html#lazyInitAsync(akka.japi.function.Creator) "akka.stream.javadsl.Flow")[`Flow.lazyInitAsync`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow$.html#lazyInitAsync[I,O,M](flowFactory:()=>scala.concurrent.Future[akka.stream.scaladsl.Flow[I,O,M]]):akka.stream.scaladsl.Flow[I,O,scala.concurrent.Future[Option[M]]] "akka.stream.scaladsl.Flow")

## Description

`fromCompletionStage` has been deprecated in 2\.6\.0 use [lazyFutureFlow](lazyFutureFlow.html) in combination with [`prefixAndTail`](../Source-or-Flow/prefixAndTail.html)) instead.

Defers creation until a first element arrives.

## Reactive Streams semantics

**emits** when the internal flow is successfully created and it emits

**backpressures** when the internal flow is successfully created and it backpressures

**completes** when upstream completes and all elements have been emitted from the internal flow

**completes** when upstream completes and all futures have been completed and all elements have been emitted

**cancels** when downstream cancels (keep reading) The operator’s default behaviour in case of downstream cancellation before nested flow materialization (future completion) is to cancel immediately. This behaviour can be controlled by setting the [akka.stream.Attributes.NestedMaterializationCancellationPolicy.PropagateToNested](./akka.stream.Attributes.NestedMaterializationCancellationPolicy.PropagateToNested.html) attribute, this will delay downstream cancellation until nested flow’s materialization which is then immediately cancelled (with the original cancellation cause).

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Flow/akka.stream.Attributes.NestedMaterializationCancellationPolicy.PropagateToNested.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Flow/lazyFutureFlow.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Sink/lazyInitAsync.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/prefixAndTail.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/lazyFutureSource.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/Flow/lazyInitAsync.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/Flow/lazyInitAsync.html)*