---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:26:51Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/empty.html
title: Source.empty • Akka core
---

# Source.empty • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Source.empty

Complete right away without ever emitting any elements.

[Source operators](../index.html#source-operators)

[`Source.never`](never.html) a source which emits nothing and never completes.

## Signature

[`Source.empty`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html#empty() "akka.stream.javadsl.Source")[`Source.empty`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source$.html#empty[T]:akka.stream.scaladsl.Source[T,akka.NotUsed] "akka.stream.scaladsl.Source")

## Description

Complete right away without ever emitting any elements. Useful when you have to provide a source to an API but there are no elements to emit.

## Reactive Streams semantics

**emits** never

**completes** directly

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/dropWithin.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/expand.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/never.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/empty.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/empty.html)*