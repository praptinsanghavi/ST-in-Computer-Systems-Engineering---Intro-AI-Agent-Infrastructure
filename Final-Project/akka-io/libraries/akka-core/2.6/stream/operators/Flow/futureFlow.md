---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:15:38Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/Flow/futureFlow.html
title: Flow.futureFlow • Akka Documentation
---

# Flow.futureFlow • Akka Documentation

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

# Flow.futureFlow

Streams the elements through the given future flow once it successfully completes.

[Simple operators](../index.html#simple-operators)

## Signature

[`Flow.futureFlow`](https://doc.akka.io/japi/akka-core/2.6/akka/stream/javadsl/Flow.html "akka.stream.javadsl.Flow")[`Flow.futureFlow`](https://doc.akka.io/api/akka-core/2.6/akka/stream/scaladsl/Flow$.html#futureFlow[I,O,M](flow:scala.concurrent.Future[akka.stream.scaladsl.Flow[I,O,M]]):akka.stream.scaladsl.Flow[I,O,scala.concurrent.Future[M]] "akka.stream.scaladsl.Flow")

## Description

Streams the elements through the given future flow once it successfully completes. If the future fails the stream is failed.

## Examples

A deferred creation of the stream based on the initial element can be achieved by combining `futureFlow` with `prefixAndTail` like so:

Scala

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-docs/src/test/scala/docs/stream/operators/flow/FutureFlow.scala#L21-L31 "Go to snippet source")def processingFlow(id: Int): Future[Flow[Int, String, NotUsed]] =
  Future {
    Flow[Int].map(n => s"id: $id, value: $n")
  }

val source: Source[String, NotUsed] =
  Source(1 to 10).prefixAndTail(1).flatMapConcat {
    case (List(id: Int), tail) =>
      // base the Future flow creation on the first element
      tail.via(Flow.futureFlow(processingFlow(id)))
  }
```

## Reactive Streams semantics

**emits** when the internal flow is successfully created and it emits

**backpressures** when the internal flow is successfully created and it backpressures

**completes** when upstream completes and all elements have been emitted from the internal flow

**completes** when upstream completes and all futures have been completed and all elements have been emitted

**cancels** when downstream cancels (keep reading) The operator’s default behaviour in case of downstream cancellation before nested flow materialization (future completion) is to cancel immediately. This behaviour can be controlled by setting the [akka.stream.Attributes.NestedMaterializationCancellationPolicy.PropagateToNested](./akka.stream.Attributes.NestedMaterializationCancellationPolicy.PropagateToNested.html) attribute, this will delay downstream cancellation until nested flow’s materialization which is then immediately cancelled (with the original cancellation cause).

## Code Examples

### Example 1: Examples

```scala
def processingFlow(id: Int): Future[Flow[Int, String, NotUsed]] =
  Future {
    Flow[Int].map(n => s"id: $id, value: $n")
  }

val source: Source[String, NotUsed] =
  Source(1 to 10).prefixAndTail(1).flatMapConcat {
    case (List(id: Int), tail) =>
      // base the Future flow creation on the first element
      tail.via(Flow.futureFlow(processingFlow(id)))
  }
```

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.6/akka/stream/scaladsl/Flow$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/stream/javadsl/Flow.html
- https://doc.akka.io/libraries/akka-core/2.6/stream/operators/Flow/akka.stream.Attributes.NestedMaterializationCancellationPolicy.PropagateToNested.html
- https://doc.akka.io/libraries/akka-core/2.6/stream/operators/Sink/futureSink.html
- https://doc.akka.io/libraries/akka-core/2.6/stream/operators/Source/future.html
- https://doc.akka.io/libraries/akka-core/2.6/stream/operators/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/2.6/stream/operators/Flow/futureFlow.html](https://doc.akka.io/libraries/akka-core/2.6/stream/operators/Flow/futureFlow.html)*