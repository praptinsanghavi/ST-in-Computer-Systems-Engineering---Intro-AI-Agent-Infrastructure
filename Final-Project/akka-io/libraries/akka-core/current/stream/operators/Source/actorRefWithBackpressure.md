---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:28:37Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/actorRefWithBackpressure.html
title: Source.actorRefWithBackpressure • Akka core
---

# Source.actorRefWithBackpressure • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Source.actorRefWithBackpressure

Materialize an `ActorRef` of the classic actors API; sending messages to it will emit them on the stream. The source acknowledges reception after emitting a message, to provide back pressure from the source.

[Actor interop operators](../index.html#actor-interop-operators)

## Signature

[`Source.actorRefWithBackpressure`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html#actorRefWithBackpressure(java.lang.Object,akka.japi.function.Function,akka.japi.function.Function) "akka.stream.javadsl.Source")[`Source.actorRefWithBackpressure`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source$.html#actorRefWithBackpressure[T](ackMessage:Any,completionMatcher:PartialFunction[Any,akka.stream.CompletionStrategy],failureMatcher:PartialFunction[Any,Throwable]):akka.stream.scaladsl.Source[T,akka.actor.ActorRef] "akka.stream.scaladsl.Source")

## Description

Materialize an `ActorRef`, sending messages to it will emit them on the stream. The actor responds with the provided ack message once the element could be emitted allowing for backpressure from the source. Sending another message before the previous one has been acknowledged will fail the stream.

See also:

- [Source.actorRef](actorRef.html) This operator without backpressure control
- [ActorSource.actorRef](../ActorSource/actorRef.html) The operator for the new actors API without backpressure control
- [ActorSource.actorRefWithBackpressure](../ActorSource/actorRefWithBackpressure.html) The corresponding operator for the new actors API
- [Source.queue](queue.html) Materialize a `SourceQueue` onto which elements can be pushed for emitting from the source

## Examples

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/operators/SourceOperators.scala#L62-L86 "Go to snippet source")  
import akka.actor.Status.Success
import akka.actor.ActorRef
import akka.stream.CompletionStrategy
import akka.stream.scaladsl._

val probe = TestProbe()

val source: Source[String, ActorRef] = Source.actorRefWithBackpressure[String](
  ackMessage = "ack",
  // complete when we send akka.actor.status.Success
  completionMatcher = {
    case _: Success => CompletionStrategy.immediately
  },
  // do not fail on any message
  failureMatcher = PartialFunction.empty)
val actorRef: ActorRef = source.to(Sink.foreach(println)).run()

probe.send(actorRef, "hello")
probe.expectMsg("ack")
probe.send(actorRef, "hello")
probe.expectMsg("ack")

// The stream completes successfully with the following message
actorRef ! Success(())
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/operators/SourceDocExamples.java#L18-L22 "Go to snippet source")import akka.actor.ActorRef;
import akka.stream.OverflowStrategy;
import akka.stream.CompletionStrategy;
import akka.stream.javadsl.Sink;
import akka.testkit.TestProbe;
Source<String, ActorRef> source =
    Source.<String>actorRefWithBackpressure(
        "ack",
        // complete when we send "complete"
        o -> {
          if (o == "complete") return Optional.of(CompletionStrategy.draining());
          else return Optional.empty();
        },
        // do not fail on any message
        o -> Optional.empty());

ActorRef actorRef = source.to(Sink.foreach(System.out::println)).run(system);
probe.send(actorRef, "hello");
probe.expectMsg("ack");
probe.send(actorRef, "hello");
probe.expectMsg("ack");

// The stream completes successfully with the following message
actorRef.tell("complete", ActorRef.noSender());
```

## Reactive Streams semantics

**emits** when there is demand and there are messages in the buffer or a message is sent to the `ActorRef`

**completes** when the passed completion matcher returns a `CompletionStrategy` or fails if the passed failure matcher returns an exception

## Code Examples

### Example 1: Examples

```scala
import akka.actor.Status.Success
import akka.actor.ActorRef
import akka.stream.CompletionStrategy
import akka.stream.scaladsl._

val probe = TestProbe()

val source: Source[String, ActorRef] = Source.actorRefWithBackpressure[String](
  ackMessage = "ack",
  // complete when we send akka.actor.status.Success
  completionMatcher = {
    case _: Success => CompletionStrategy.immediately
  },
  // do not fail on any message
  failureMatcher = PartialFunction.empty)
val actorRef: ActorRef = source.to(Sink.foreach(println)).run()

probe.send(actorRef, "hello")
probe.expectMsg("ack")
probe.send(actorRef, "hello")
probe.expectMsg("ack")

// The stream completes successfully with the following message
actorRef ! Success(())
```

### Example 2: Examples

```java
import akka.actor.ActorRef;
import akka.stream.OverflowStrategy;
import akka.stream.CompletionStrategy;
import akka.stream.javadsl.Sink;
import akka.testkit.TestProbe;
Source<String, ActorRef> source =
    Source.<String>actorRefWithBackpressure(
        "ack",
        // complete when we send "complete"
        o -> {
          if (o == "complete") return Optional.of(CompletionStrategy.draining());
          else return Optional.empty();
        },
        // do not fail on any message
        o -> Optional.empty());

ActorRef actorRef = source.to(Sink.foreach(System.out::println)).run(system);
probe.send(actorRef, "hello");
probe.expectMsg("ack");
probe.send(actorRef, "hello");
probe.expectMsg("ack");

// The stream completes successfully with the following message
actorRef.tell("complete", ActorRef.noSender());
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/ActorSink/actorRef.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/ActorSource/actorRef.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/ActorSource/actorRefWithBackpressure.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Sink/actorRefWithBackpressure.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/actorRef.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/queue.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/actorRefWithBackpressure.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/actorRefWithBackpressure.html)*