---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:27:35Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/delayWith.html
title: delayWith • Akka core
---

# delayWith • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# delayWith

Delay every element passed through with a duration that can be controlled dynamically.

[Timer driven operators](../index.html#timer-driven-operators)

## Signature

[`Source.delayWith`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html#delayWith(java.util.function.Supplier,akka.stream.DelayOverflowStrategy) "akka.stream.javadsl.Source")[`Source.delayWith`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html#delayWith(delayStrategySupplier:()=>akka.stream.scaladsl.DelayStrategy[Out],overFlowStrategy:akka.stream.DelayOverflowStrategy):FlowOps.this.Repr[Out] "akka.stream.scaladsl.Source") [`Flow.delayWith`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html#delayWith(java.util.function.Supplier,akka.stream.DelayOverflowStrategy) "akka.stream.javadsl.Flow")[`Flow.delayWith`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html#delayWith(delayStrategySupplier:()=>akka.stream.scaladsl.DelayStrategy[Out],overFlowStrategy:akka.stream.DelayOverflowStrategy):FlowOps.this.Repr[Out] "akka.stream.scaladsl.Flow")

## Description

Delay every element passed through with a duration that can be controlled dynamically, individually for each elements (via the `DelayStrategy`).

**emits** there is a pending element in the buffer and configured time for this element elapsed

**backpressures** differs, depends on `OverflowStrategy` set

**completes** when upstream completes and buffered elements has been drained

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/delay.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/detach.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/delayWith.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/delayWith.html)*