---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:26:58Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/lazyCompletionStageSource.html
title: Source.lazyCompletionStageSource • Akka core
---

# Source.lazyCompletionStageSource • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Source.lazyCompletionStageSource

Defers creation of a future source until there is demand.

[Source operators](../index.html#source-operators)

## Description

Invokes the user supplied factory when the first downstream demand arrives. When the returned `CompletionStage` completes successfully the source switches over to the new source and emits downstream just like if it had been created up front. If the future or the factory fails the stream is failed.

Note that asynchronous boundaries (and other operators) in the stream may do pre\-fetching which counter acts the laziness and will trigger the factory immediately.

See also [lazySource](lazySource.html).

## Reactive Streams semantics

**emits** depends on the wrapped `Source`

**completes** depends on the wrapped `Source`

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Flow/lazyFlow.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Sink/lazyCompletionStageSink.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/lazySource.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/lazyCompletionStageSource.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/lazyCompletionStageSource.html)*