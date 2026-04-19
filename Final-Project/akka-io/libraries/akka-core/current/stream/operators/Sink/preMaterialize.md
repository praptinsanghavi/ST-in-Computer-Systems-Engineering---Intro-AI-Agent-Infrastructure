---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:27:11Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/Sink/preMaterialize.html
title: Sink.preMaterialize • Akka core
---

# Sink.preMaterialize • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Sink.preMaterialize

Materializes this Sink, immediately returning (1\) its materialized value, and (2\) a new Sink that can be consume elements ‘into’ the pre\-materialized one.

[Sink operators](../index.html#sink-operators)

## Signature

[`Sink.preMaterialize`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Sink.html#preMaterialize(akka.actor.ClassicActorSystemProvider) "akka.stream.javadsl.Sink")[`Sink.preMaterialize`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Sink.html#preMaterialize()(implicitmaterializer:akka.stream.Materializer):(Mat,akka.stream.scaladsl.Sink[In,akka.NotUsed]) "akka.stream.scaladsl.Sink")

## Description

Materializes this Sink, immediately returning (1\) its materialized value, and (2\) a new Sink that can be consume elements ‘into’ the pre\-materialized one. Useful for when you need a materialized value of a Sink when handing it out to someone to materialize it for you.

Note that `preMaterialize` is implemented through a reactive streams `Subscriber` which means that a buffer is introduced and that errors are not propagated upstream but are turned into cancellations without error details.

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Sink.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Sink.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/preMaterialize.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/prepend.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/Sink/preMaterialize.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/Sink/preMaterialize.html)*