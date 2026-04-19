---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:27:23Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/Flow/lazyCompletionStageFlow.html
title: Flow.lazyCompletionStageFlow • Akka core
---

# Flow.lazyCompletionStageFlow • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Flow.lazyCompletionStageFlow

Defers creation and materialization of a `Flow` until there is a first element.

[Simple operators](../index.html#simple-operators)

## Description

When the first element comes from upstream the actual `CompletionStage<Flow>` is created and when that completes it is materialized and inserted in the stream. The internal `Flow` will not be created if there are no elements on completion or failure of up or downstream.

The materialized value of the `Flow` will be the materialized value of the created internal flow if it is materialized and failed with a `akka.stream.NeverMaterializedException` if the stream fails or completes without the flow being materialized.

See also [lazyFlow](lazyFlow.html).

Can be combined with `prefixAndTail(1)` to base the flow construction on the initial element triggering creation. See [lazyFlow](lazyFlow.html) for sample.

## Reactive Streams semantics

**emits** when the internal flow is successfully created and it emits

**backpressures** when the internal flow is successfully created and it backpressures

**completes** when upstream completes and all elements have been emitted from the internal flow

**completes** when upstream completes and all futures have been completed and all elements have been emitted

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Flow/lazyFlow.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Sink/lazyCompletionStageSink.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/lazyCompletionStage.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/Flow/lazyCompletionStageFlow.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/Flow/lazyCompletionStageFlow.html)*