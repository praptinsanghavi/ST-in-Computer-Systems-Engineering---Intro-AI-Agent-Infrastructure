---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:27:20Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/Flow/flattenOptional.html
title: Flow.flattenOptional • Akka core
---

# Flow.flattenOptional • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Flow.flattenOptional

Collect the value of `Optional` from all the elements passing through this flow , empty `Optional` is filtered out.

[Simple operators](../index.html#simple-operators)

## Signature

[`Flow.flattenOptional`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html#flattenOptional(akka.stream.javadsl.Flow) "akka.stream.javadsl.Flow")[`Flow.flattenOptional`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow$.html "akka.stream.scaladsl.Flow")

## Description

Streams the elements through the given future flow once it successfully completes. If the future fails the stream is failed.

## Reactive Streams semantics

**Emits when** the current [`Optional`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html "java.util.Optional")’s value is present.

**Backpressures when** the value of the current [`Optional`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html "java.util.Optional") is present and downstream backpressures.

**Completes when** upstream completes.

**Cancels when** downstream cancels.

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/flatMapPrefix.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/fold.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/Flow/flattenOptional.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/Flow/flattenOptional.html)*