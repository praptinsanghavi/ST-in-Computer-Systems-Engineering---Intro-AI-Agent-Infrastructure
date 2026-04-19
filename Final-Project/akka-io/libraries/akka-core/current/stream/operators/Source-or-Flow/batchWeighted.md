---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:27:38Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/batchWeighted.html
title: batchWeighted • Akka core
---

# batchWeighted • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# batchWeighted

Allow for a slower downstream by passing incoming elements and a summary into an aggregate function as long as there is backpressure and a maximum weight batched elements is not yet reached.

[Backpressure aware operators](../index.html#backpressure-aware-operators)

## Signature

[`Source.batchWeighted`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html#batchWeighted(long,akka.japi.function.Function,akka.japi.function.Function,akka.japi.function.Function2) "akka.stream.javadsl.Source")[`Source.batchWeighted`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html#batchWeighted[S](max:Long,costFn:Out=>Long,seed:Out=>S)(aggregate:(S,Out)=>S):FlowOps.this.Repr[S] "akka.stream.scaladsl.Source") [`Flow.batchWeighted`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html#batchWeighted(long,akka.japi.function.Function,akka.japi.function.Function,akka.japi.function.Function2) "akka.stream.javadsl.Flow")[`Flow.batchWeighted`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html#batchWeighted[S](max:Long,costFn:Out=>Long,seed:Out=>S)(aggregate:(S,Out)=>S):FlowOps.this.Repr[S] "akka.stream.scaladsl.Flow")

## Description

Allow for a slower downstream by passing incoming elements and a summary into an aggregate function as long as there is backpressure and a maximum weight batched elements is not yet reached. The weight of each element is determined by applying `costFn`. When the maximum total weight is reached and downstream still backpressures batch will also backpressure.

Will eagerly pull elements, this behavior may result in a single pending (i.e. buffered) element which cannot be aggregated to the batched value.

## Reactive Streams semantics

**emits** downstream stops backpressuring and there is a batched element available

**backpressures** batched elements reached the max weight limit of allowed batched elements \& downstream backpressures

**completes** upstream completes and a “possibly pending” element was drained

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Broadcast.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/batch.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/batchWeighted.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/batchWeighted.html)*