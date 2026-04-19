---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:26:58Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/lazySingle.html
title: Source.lazySingle • Akka core
---

# Source.lazySingle • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Source.lazySingle

Defers creation of a single element source until there is demand.

[Source operators](../index.html#source-operators)

## Signature

[`Source.lazySingle`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html#lazySingle(akka.japi.function.Creator) "akka.stream.javadsl.Source")[`Source.lazySingle`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source$.html#lazySingle[T](create:()=>T):akka.stream.scaladsl.Source[T,akka.NotUsed] "akka.stream.scaladsl.Source")

## Description

Invokes the user supplied factory when the first downstream demand arrives, then emits the returned single value downstream and completes the stream.

Note that asynchronous boundaries (and other operators) in the stream may do pre\-fetching which counter acts the laziness and will trigger the factory immediately.

## Reactive Streams semantics

**emits** when there is downstream demand and the element factory has completed

**completes** after emitting the single element

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Sink/lazyInitAsync.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Sink/lazySink.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/lazySingle.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/lazySingle.html)*