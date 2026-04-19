---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:27:38Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/aggregateWithBoundary.html
title: aggregateWithBoundary • Akka core
---

# aggregateWithBoundary • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# aggregateWithBoundary

Aggregate and emit until custom boundary condition met.

[Backpressure aware operators](../index.html#backpressure-aware-operators)

[Timer driven operators](../index.html#timer-driven-operators)

## Signature

[`Source.aggregateWithBoundary`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html#aggregateWithBoundary(java.util.function.Supplier,akka.japi.function.Function2,akka.japi.function.Function,akka.japi.Pair) "akka.stream.javadsl.Source")[`Source.aggregateWithBoundary`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html#aggregateWithBoundary[Agg,Emit](allocate:()=%3EAgg)(aggregate:(Agg,Out)=%3E(Agg,Boolean),harvest:Agg=%3EEmit,emitOnTimer:Option[(Agg=%3EBoolean,scala.concurrent.duration.FiniteDuration)]):FlowOps.this.Repr[Emit] "akka.stream.scaladsl.Source") [`Flow.aggregateWithBoundary`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html#aggregateWithBoundary(java.util.function.Supplier,akka.japi.function.Function2,akka.japi.function.Function,akka.japi.Pair) "akka.stream.javadsl.Flow")[`Flow.aggregateWithBoundary`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html#aggregateWithBoundary[Agg,Emit](allocate:()=%3EAgg)(aggregate:(Agg,Out)=%3E(Agg,Boolean),harvest:Agg=%3EEmit,emitOnTimer:Option[(Agg=%3EBoolean,scala.concurrent.duration.FiniteDuration)]):FlowOps.this.Repr[Emit] "akka.stream.scaladsl.Flow")

## Description

This operator can be customized into a broad class of aggregate/group/fold operators, based on custom state or timer conditions.

## Reactive Streams semantics

**emits** when the aggregation function decides the aggregate is complete or the timer function returns true

**backpressures** when downstream backpressures and the aggregate is complete

**completes** when upstream completes and the last aggregate has been emitted downstream

**cancels** when downstream cancels

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/ActorSink/actorRefWithBackpressure.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/alsoTo.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/aggregateWithBoundary.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/aggregateWithBoundary.html)*