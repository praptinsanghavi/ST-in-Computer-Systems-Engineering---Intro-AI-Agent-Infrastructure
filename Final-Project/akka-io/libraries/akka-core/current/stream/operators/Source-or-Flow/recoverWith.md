---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:28:48Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/recoverWith.html
title: recoverWith • Akka core
---

# recoverWith • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# recoverWith

Allow switching to alternative Source when a failure has happened upstream.

[Error handling](../index.html#error-handling)

## Signature

[`Source.recoverWith`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html#recoverWith(java.lang.Class,java.util.function.Supplier) "akka.stream.javadsl.Source")[`Source.recoverWith`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html#recoverWith[T>:Out](pf:PartialFunction[Throwable,akka.stream.Graph[akka.stream.SourceShape[T],akka.NotUsed]]):FlowOps.this.Repr[T] "akka.stream.scaladsl.Source") [`Flow.recoverWith`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html#recoverWith(java.lang.Class,java.util.function.Supplier) "akka.stream.javadsl.Flow")[`Flow.recoverWith`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html#recoverWith[T>:Out](pf:PartialFunction[Throwable,akka.stream.Graph[akka.stream.SourceShape[T],akka.NotUsed]]):FlowOps.this.Repr[T] "akka.stream.scaladsl.Flow")

## Description

Allow switching to alternative Source when a failure has happened upstream.

Throwing an exception inside `recoverWith` *will* be logged on ERROR level automatically.

## Reactive Streams semantics

**emits** the element is available from the upstream or upstream is failed and pf returns alternative Source

**backpressures** downstream backpressures, after failure happened it backprssures to alternative Source

**completes** upstream completes or upstream failed with exception pf can handle

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/recover.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/recoverWithRetries.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/recoverWith.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/recoverWith.html)*