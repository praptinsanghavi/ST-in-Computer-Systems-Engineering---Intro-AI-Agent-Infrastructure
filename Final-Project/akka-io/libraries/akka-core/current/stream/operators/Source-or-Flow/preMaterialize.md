---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:27:28Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/preMaterialize.html
title: preMaterialize • Akka core
---

# preMaterialize • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# preMaterialize

Materializes this Graph, immediately returning (1\) its materialized value, and (2\) a new pre\-materialized Graph.

[Simple operators](../index.html#simple-operators)

## Signature

[`Source.preMaterialize`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html#preMaterialize(akka.actor.ClassicActorSystemProvider) "akka.stream.javadsl.Source")[`Source.preMaterialize`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html#preMaterialize()(implicitmaterializer:akka.stream.Materializer):(Mat,akka.stream.scaladsl.Source[Out,akka.NotUsed]) "akka.stream.scaladsl.Source") [`Flow.preMaterialize`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html#preMaterialize(akka.actor.ClassicActorSystemProvider) "akka.stream.javadsl.Flow")[`Flow.preMaterialize`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html#preMaterialize()(implicitmaterializer:akka.stream.Materializer):(Mat,akka.stream.scaladsl.Flow[Int,Out,akka.NotUsed]) "akka.stream.scaladsl.Flow")

## Description

Materializes this Graph, immediately returning (1\) its materialized value, and (2\) a new pre\-materialized Graph.

Note that `preMaterialize` is implemented through a reactive streams `Publisher` for a `Source` or a `Publisher` and `Subscriber` pair for a `Flow` which means that a buffer is introduced and that errors are not propagated upstream but are turned into cancellations without error details.

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Sink/preMaterialize.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/prefixAndTail.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/preMaterialize.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/preMaterialize.html)*