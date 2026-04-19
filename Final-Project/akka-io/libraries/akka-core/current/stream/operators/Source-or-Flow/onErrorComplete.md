---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:28:47Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/onErrorComplete.html
title: onErrorComplete • Akka core
---

# onErrorComplete • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# onErrorComplete

Allows completing the stream when an upstream error occurs.

[Error handling](../index.html#error-handling)

## Signature

[`Source.onErrorComplete`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html#onErrorComplete(java.util.function.Predicate) "akka.stream.javadsl.Source")[`Source.onErrorComplete`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html#onErrorComplete(pf:%20PartialFunction[Throwable,%20Boolean]):FlowOps.this.Repr[T] "akka.stream.scaladsl.Source") [`Source.onErrorComplete`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html#onErrorComplete(java.lang.Class) "akka.stream.javadsl.Source")[`Source.onErrorComplete`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html#onErrorComplete[T%20%3C:%20Throwable]()(implicit%20tag:%20ClassTag[T]):FlowOps.this.Repr[T] "akka.stream.scaladsl.Source") [`Flow.onErrorComplete`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html#onErrorComplete(java.util.function.Predicate) "akka.stream.javadsl.Flow")[`Flow.onErrorComplete`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html#onErrorComplete(pf:%20PartialFunction[Throwable,%20Boolean]):FlowOps.this.Repr[T] "akka.stream.scaladsl.Flow") [`Flow.onErrorComplete`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html#onErrorComplete(java.lang.Class) "akka.stream.javadsl.Flow")[`Flow.onErrorComplete`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html#onErrorComplete[T%20%3C:%20Throwable]()(implicit%20tag:%20ClassTag[T]):FlowOps.this.Repr[T] "akka.stream.scaladsl.Flow")

## Description

Allows to complete the stream when an upstream error occurs.

## Reactive Streams semantics

**emits** element is available from the upstream

**backpressures** downstream backpressures

**completes** upstream completes or upstream failed with exception this operator can handle

**Cancels when** downstream cancels

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/RestartSource/onFailuresWithBackoff.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Sink/onComplete.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/onErrorComplete.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/onErrorComplete.html)*