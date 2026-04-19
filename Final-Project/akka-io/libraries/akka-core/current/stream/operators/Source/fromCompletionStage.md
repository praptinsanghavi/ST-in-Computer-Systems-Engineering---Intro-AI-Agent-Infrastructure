---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:26:52Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/fromCompletionStage.html
title: Source.fromCompletionStage • Akka core
---

# Source.fromCompletionStage • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Source.fromCompletionStage

Deprecated by [`Source.completionStage`](completionStage.html).

[Source operators](../index.html#source-operators)

## Signature

[`Source.fromCompletionStage`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html#fromCompletionStage(java.util.concurrent.CompletionStage) "akka.stream.javadsl.Source")[`Source.fromCompletionStage`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source$.html#fromCompletionStage[T](future:java.util.concurrent.CompletionStage[T]):akka.stream.scaladsl.Source[T,akka.NotUsed] "akka.stream.scaladsl.Source")

## Description

`fromCompletionStage` has been deprecated in 2\.6\.0, use [completionStage](completionStage.html) instead.

Send the single value of the `CompletionStage` when it completes and there is demand. If the `CompletionStage` completes with `null` stage is completed without emitting a value. If the `CompletionStage` fails the stream is failed with that exception.

## Reactive Streams semantics

**emits** the future completes

**completes** after the future has completed

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/FileIO/fromFile.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/completionStage.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/from.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/fromCompletionStage.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/fromCompletionStage.html)*