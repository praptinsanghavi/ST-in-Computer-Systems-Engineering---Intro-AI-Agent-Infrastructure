---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:27:38Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/batch.html
title: batch • Akka core
---

# batch • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# batch

Allow for a slower downstream by passing incoming elements and a summary into an aggregate function as long as there is backpressure and a maximum number of batched elements is not yet reached.

[Backpressure aware operators](../index.html#backpressure-aware-operators)

## Signature

[`Source.batch`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html#batch(long,akka.japi.function.Function,akka.japi.function.Function2) "akka.stream.javadsl.Source")[`Source.batch`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html#batch[S](max:Long,seed:Out=>S)(aggregate:(S,Out)=>S):FlowOps.this.Repr[S] "akka.stream.scaladsl.Source") [`Flow.batch`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html#batch(long,akka.japi.function.Function,akka.japi.function.Function2) "akka.stream.javadsl.Flow")[`Flow.batch`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html#batch[S](max:Long,seed:Out=>S)(aggregate:(S,Out)=>S):FlowOps.this.Repr[S] "akka.stream.scaladsl.Flow")

## Description

Allow for a slower downstream by passing incoming elements and a summary into an aggregate function as long as there is backpressure and a maximum number of batched elements is not yet reached. When the maximum number is reached and downstream still backpressures batch will also backpressure.

When backpressure starts or there is no backpressure element is passed into a `seed` function to transform it to the summary type.

Will eagerly pull elements, this behavior may result in a single pending (i.e. buffered) element which cannot be aggregated to the batched value.

## Reactive Streams semantics

**emits** when downstream stops backpressuring and there is a batched element available

**backpressures** when batched elements reached the max limit of allowed batched elements \& downstream backpressures

**completes** when upstream completes and a “possibly pending” element was drained

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Balance.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/batchWeighted.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/batch.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/batch.html)*