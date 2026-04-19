---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:27:10Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/Sink/onComplete.html
title: Sink.onComplete • Akka core
---

# Sink.onComplete • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Sink.onComplete

Invoke a callback when the stream has completed or failed.

[Sink operators](../index.html#sink-operators)

## Signature

[`Sink.onComplete`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Sink.html#onComplete(akka.japi.function.Procedure) "akka.stream.javadsl.Sink")[`Sink.onComplete`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Sink$.html#onComplete[T](callback:scala.util.Try[akka.Done]=>Unit):akka.stream.scaladsl.Sink[T,akka.NotUsed] "akka.stream.scaladsl.Sink")

## Description

Invoke a callback when the stream has completed or failed.

## Reactive Streams semantics

**cancels** never

**backpressures** never

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Sink$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Sink.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Sink/never.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/onErrorComplete.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/Sink/onComplete.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/Sink/onComplete.html)*