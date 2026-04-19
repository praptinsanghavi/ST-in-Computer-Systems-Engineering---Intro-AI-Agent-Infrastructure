---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:28:36Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/Sink/actorRef.html
title: Sink.actorRef • Akka core
---

# Sink.actorRef • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Sink.actorRef

Send the elements from the stream to an `ActorRef` of the classic actors API.

[Actor interop operators](../index.html#actor-interop-operators)

## Signature

[`Sink.actorRef`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Sink.html#actorRef(akka.actor.ActorRef,java.lang.Object) "akka.stream.javadsl.Sink")[`Sink.actorRef`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Sink$.html#actorRef[T](ref:akka.actor.ActorRef,onCompleteMessage:Any,onFailureMessage:Throwable=>Any):akka.stream.scaladsl.Sink[T,akka.NotUsed] "akka.stream.scaladsl.Sink")

## Description

Send the elements from the stream to an `ActorRef`. No backpressure so care must be taken to not overflow the inbox.

See also:

- [`Sink.actorRefWithBackpressue`](actorRefWithBackpressure.html) Send elements to an actor with backpressure support
- [`ActorSink.actorRef`](../ActorSink/actorRef.html) The corresponding operator for the new actors API
- [`ActorSink.actorRefWithBackpressure`](../ActorSink/actorRefWithBackpressure.html) Send elements to an actor of the new actors API supporting backpressure

## Reactive Streams semantics

**cancels** when the actor terminates

**backpressures** never

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Sink$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Sink.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/ActorSink/actorRef.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/ActorSink/actorRefWithBackpressure.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/ActorSource/actorRef.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Sink/actorRefWithBackpressure.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/actorRef.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/Sink/actorRef.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/Sink/actorRef.html)*