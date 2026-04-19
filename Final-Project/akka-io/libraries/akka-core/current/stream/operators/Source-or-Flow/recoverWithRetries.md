---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:28:48Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/recoverWithRetries.html
title: recoverWithRetries • Akka core
---

# recoverWithRetries • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# recoverWithRetries

RecoverWithRetries allows to switch to alternative Source on flow failure.

[Error handling](../index.html#error-handling)

## Signature

[`Source.recoverWithRetries`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html#recoverWithRetries(int,java.lang.Class,java.util.function.Supplier) "akka.stream.javadsl.Source")[`Source.recoverWithRetries`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html#recoverWithRetries[T>:Out](attempts:Int,pf:PartialFunction[Throwable,akka.stream.Graph[akka.stream.SourceShape[T],akka.NotUsed]]):FlowOps.this.Repr[T] "akka.stream.scaladsl.Source") [`Flow.recoverWithRetries`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html#recoverWithRetries(int,java.lang.Class,java.util.function.Supplier) "akka.stream.javadsl.Flow")[`Flow.recoverWithRetries`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html#recoverWithRetries[T>:Out](attempts:Int,pf:PartialFunction[Throwable,akka.stream.Graph[akka.stream.SourceShape[T],akka.NotUsed]]):FlowOps.this.Repr[T] "akka.stream.scaladsl.Flow")

## Description

RecoverWithRetries allows to switch to alternative Source on flow failure. It will stay in effect after a failure has been recovered up to *attempts* number of times so that each time there is a failure it is fed into the *pf* and a new Source may be materialized. Note that if you pass in 0, this won’t attempt to recover at all. A negative `attempts` number is interpreted as “infinite”, which results in the exact same behavior as `recoverWith`.

Since the underlying failure signal onError arrives out\-of\-band, it might jump over existing elements. This operators can recover the failure signal, but not the skipped elements, which will be dropped.

## Reactive Streams semantics

**emits** when element is available from the upstream or upstream is failed and element is available from alternative Source

**backpressures** when downstream backpressures

**completes** when upstream completes or upstream failed with exception pf can handle

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/recoverWith.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/reduce.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/recoverWithRetries.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/recoverWithRetries.html)*