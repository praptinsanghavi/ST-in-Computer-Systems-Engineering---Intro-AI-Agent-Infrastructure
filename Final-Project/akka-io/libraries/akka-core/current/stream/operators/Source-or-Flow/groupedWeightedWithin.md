---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:27:36Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/groupedWeightedWithin.html
title: groupedWeightedWithin • Akka core
---

# groupedWeightedWithin • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# groupedWeightedWithin

Chunk up this stream into groups of elements received within a time window, or limited by the weight of the elements, whatever happens first.

[Timer driven operators](../index.html#timer-driven-operators)

## Signature

[`Source.groupedWeightedWithin`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html#groupedWeightedWithin(long,akka.japi.function.Function,java.time.Duration) "akka.stream.javadsl.Source")[`Source.groupedWeightedWithin`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html#groupedWeightedWithin(maxWeight:Long,d:scala.concurrent.duration.FiniteDuration)(costFn:Out=>Long):FlowOps.this.Repr[scala.collection.immutable.Seq[Out]] "akka.stream.scaladsl.Source") [`Flow.groupedWeightedWithin`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html#groupedWeightedWithin(long,akka.japi.function.Function,java.time.Duration) "akka.stream.javadsl.Flow")[`Flow.groupedWeightedWithin`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html#groupedWeightedWithin(maxWeight:Long,d:scala.concurrent.duration.FiniteDuration)(costFn:Out=>Long):FlowOps.this.Repr[scala.collection.immutable.Seq[Out]] "akka.stream.scaladsl.Flow")

## Description

Chunk up this stream into groups of elements received within a time window, or limited by the weight and number of the elements, whatever happens first. Empty groups will not be emitted if no elements are received from upstream. The last group before end\-of\-stream will contain the buffered elements since the previously emitted group.

See also:

- [grouped](grouped.html) for a variant that groups based on number of elements
- [groupedWeighted](groupedWeighted.html) for a variant that groups based on element weight
- [groupedWithin](groupedWithin.html) for a variant that groups based on number of elements and a time window

## Reactive Streams semantics

**emits** when the configured time elapses since the last group has been emitted, but not if no elements has been grouped (i.e: no empty groups), or when weight limit has been reached.

**backpressures** downstream backpressures, and buffered group (\+ pending element) weighs more than *maxWeight*

**completes** when upstream completes

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/grouped.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/groupedWeighted.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/groupedWithin.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/groupedWeightedWithin.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/groupedWeightedWithin.html)*