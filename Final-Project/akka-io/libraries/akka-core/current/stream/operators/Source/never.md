---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:26:59Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/never.html
title: never • Akka core
---

# never • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# never

Never emit any elements, never complete and never fail.

[Source operators](../index.html#source-operators)

[`Source.empty`](empty.html), a source which emits nothing and completes immediately.

## Signature

[`Source.never`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html#never() "akka.stream.javadsl.Source")[`Source.never`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source$.html#never[T]:akka.stream.scaladsl.Source[T,akka.NotUsed] "akka.stream.scaladsl.Source")

## Description

Create a source which never emits any elements, never completes and never failes. Useful for tests.

## Reactive Streams semantics

**emits** never

**completes** never

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Sink/never.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/monitor.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/empty.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/never.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/never.html)*