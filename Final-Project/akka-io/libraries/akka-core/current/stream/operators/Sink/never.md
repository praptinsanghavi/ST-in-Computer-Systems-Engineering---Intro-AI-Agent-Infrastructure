---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:27:10Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/Sink/never.html
title: Sink.never • Akka core
---

# Sink.never • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Sink.never

Always backpressure never cancel and never consume any elements from the stream.

[Sink operators](../index.html#sink-operators)

## Signature

[`Sink.never`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Sink.html#never() "akka.stream.javadsl.Sink")[`Sink.never`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Sink$.html "akka.stream.scaladsl.Sink") [`Sink.never`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Sink.html "akka.stream.javadsl.Sink")[`Sink.never`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Sink$.html#never() "akka.stream.scaladsl.Sink")

## Description

A `Sink` that will always backpressure never cancel and never consume any elements from the stream.

## Reactive Streams semantics

**cancels** never

**backpressures** always

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Sink$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Sink.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Sink/onComplete.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/never.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/Sink/never.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/Sink/never.html)*