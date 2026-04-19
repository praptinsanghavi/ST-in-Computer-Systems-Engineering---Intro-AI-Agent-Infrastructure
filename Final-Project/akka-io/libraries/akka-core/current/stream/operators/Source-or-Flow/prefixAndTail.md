---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:27:25Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/prefixAndTail.html
title: prefixAndTail • Akka core
---

# prefixAndTail • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# prefixAndTail

Take up to *n* elements from the stream (less than *n* only if the upstream completes before emitting *n* elements) and returns a pair containing a strict sequence of the taken element and a stream representing the remaining elements.

[Nesting and flattening operators](../index.html#nesting-and-flattening-operators)

## Signature

[`Source.prefixAndTail`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html#prefixAndTail(int) "akka.stream.javadsl.Source")[`Source.prefixAndTail`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html#prefixAndTail[U>:Out](n:Int):FlowOps.this.Repr[(scala.collection.immutable.Seq[Out],akka.stream.scaladsl.Source[U,akka.NotUsed])] "akka.stream.scaladsl.Source") [`Flow.prefixAndTail`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html#prefixAndTail(int) "akka.stream.javadsl.Flow")[`Flow.prefixAndTail`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html#prefixAndTail[U>:Out](n:Int):FlowOps.this.Repr[(scala.collection.immutable.Seq[Out],akka.stream.scaladsl.Source[U,akka.NotUsed])] "akka.stream.scaladsl.Flow")

## Description

Take up to *n* elements from the stream (less than *n* only if the upstream completes before emitting *n* elements) and returns a pair containing a strict sequence of the taken element and a stream representing the remaining elements.

## Reactive Streams semantics

**emits** when the configured number of prefix elements are available. Emits this prefix, and the rest as a substream

**backpressures** when downstream backpressures or substream backpressures

**completes** when prefix elements has been consumed and substream has been consumed

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Partition.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/preMaterialize.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/prefixAndTail.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/prefixAndTail.html)*