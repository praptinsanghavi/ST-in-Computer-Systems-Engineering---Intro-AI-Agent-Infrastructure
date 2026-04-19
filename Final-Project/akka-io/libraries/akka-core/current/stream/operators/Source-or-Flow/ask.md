---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:28:39Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/ask.html
title: ask • Akka core
---

# ask • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# ask

Use the “Ask Pattern” to send a request\-reply message to the target `ref` actor (of the classic actors API).

[Actor interop operators](../index.html#actor-interop-operators)

## Signature

[`Source.ask`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html#ask(akka.actor.ActorRef,java.lang.Class,akka.util.Timeout) "akka.stream.javadsl.Source")[`Source.ask`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html#ask[S](ref:akka.actor.ActorRef)(implicittimeout:akka.util.Timeout,implicittag:scala.reflect.ClassTag[S]):FlowOps.this.Repr[S] "akka.stream.scaladsl.Source") [`Flow.ask`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html#ask(akka.actor.ActorRef,java.lang.Class,akka.util.Timeout) "akka.stream.javadsl.Flow")[`Flow.ask`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow$.html#ask[S](ref:akka.actor.ActorRef)(implicittimeout:akka.util.Timeout,implicittag:scala.reflect.ClassTag[S]):FlowOps.this.Repr[S] "akka.stream.scaladsl.Flow")

## Description

Use the [Ask Pattern](../../../actors.html#ask-send-and-receive-future) to send a request\-reply message to the target `ref` actor. If any of the asks times out it will fail the stream with a [`AskTimeoutException`](https://doc.akka.io/api/akka-core/2.10/akka/pattern/AskTimeoutException.html "akka.pattern.AskTimeoutException")[`AskTimeoutException`](https://doc.akka.io/japi/akka-core/2.10/akka/pattern/AskTimeoutException.html "akka.pattern.AskTimeoutException").

The `mapTo` class`S` generic parameter is used to cast the responses from the actor to the expected outgoing flow type.

Similar to the plain ask pattern, the target actor is allowed to reply with [`Status`](https://doc.akka.io/api/akka-core/2.10/akka/actor/Status$.html "akka.actor.Status")[`Status`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/Status.html "akka.actor.Status"). An [`Failure`](https://doc.akka.io/api/akka-core/2.10/akka/actor/Status$$Failure.html "akka.actor.Status.Failure")[`Failure`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/Status.Failure.html "akka.actor.Status.Failure") will cause the operator to fail with the cause carried in the `Failure` message.

Adheres to the [`ActorAttributes.SupervisionStrategy`](https://doc.akka.io/api/akka-core/2.10/akka/stream/ActorAttributes$$SupervisionStrategy.html "akka.stream.ActorAttributes.SupervisionStrategy")[`ActorAttributes.SupervisionStrategy`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/ActorAttributes.SupervisionStrategy.html "akka.stream.ActorAttributes.SupervisionStrategy") attribute.

See also:

- [ActorFlow.ask](../ActorFlow/ask.html) for the `akka.actor.typed.ActorRef[_]` variant

## Reactive Streams semantics

**emits** when the ask `Future` `CompletionStage` returned by the provided function finishes for the next element in sequence

**backpressures** when the number of ask `Future` s `CompletionStage` s reaches the configured parallelism and the downstream backpressures

**completes** when upstream completes and all ask `Future` s `CompletionStage` s has been completed and all elements has been emitted

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/actor/Status$$Failure.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/Status$.html
- https://doc.akka.io/api/akka-core/2.10/akka/pattern/AskTimeoutException.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/ActorAttributes$$SupervisionStrategy.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow$.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/Status.Failure.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/Status.html
- https://doc.akka.io/japi/akka-core/2.10/akka/pattern/AskTimeoutException.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/ActorAttributes.SupervisionStrategy.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html
- https://doc.akka.io/libraries/akka-core/current/actors.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/ActorFlow/ask.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/StreamConverters/asJavaStream.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/ask.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/ask.html)*