---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:26:53Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/fromFuture.html
title: Source.fromFuture • Akka core
---

# Source.fromFuture • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Source.fromFuture

Deprecated by [`Source.future`](future.html).

[Source operators](../index.html#source-operators)

## Signature

[`Source.fromFuture`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html "akka.stream.javadsl.Source")[`Source.fromFuture`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source$.html#fromFuture[T](future:scala.concurrent.Future[T]):akka.stream.scaladsl.Source[T,akka.NotUsed] "akka.stream.scaladsl.Source")

## Description

`fromFuture` has been deprecated in 2\.6\.0, use [future](future.html) instead.

Send the single value of the `Future` when it completes and there is demand. If the future fails the stream is failed with that exception.

## Reactive Streams semantics

**emits** the future completes

**completes** after the future has completed

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/FileIO/fromFile.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/fromFutureSource.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/future.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/fromFuture.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/fromFuture.html)*