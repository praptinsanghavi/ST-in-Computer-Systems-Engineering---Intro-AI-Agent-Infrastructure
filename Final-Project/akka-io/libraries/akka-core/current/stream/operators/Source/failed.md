---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:26:52Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/failed.html
title: Source.failed • Akka core
---

# Source.failed • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Source.failed

Fail directly with a user specified exception.

[Source operators](../index.html#source-operators)

## Signature

[`Source.failed`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html#failed(java.lang.Throwable) "akka.stream.javadsl.Source")[`Source.failed`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source$.html#failed[T](cause:Throwable):akka.stream.scaladsl.Source[T,akka.NotUsed] "akka.stream.scaladsl.Source")

## Description

Fail directly with a user specified exception.

## Reactive Streams semantics

**emits** never

**completes** fails the stream directly with the given exception

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/extrapolate.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/filter.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/failed.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/failed.html)*