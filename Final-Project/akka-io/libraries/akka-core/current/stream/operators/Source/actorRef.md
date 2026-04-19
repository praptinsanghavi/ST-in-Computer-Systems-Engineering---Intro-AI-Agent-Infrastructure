---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:28:36Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/actorRef.html
title: Source.actorRef • Akka core
---

# Source.actorRef • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Source.actorRef

Materialize an `ActorRef` of the classic actors API; sending messages to it will emit them on the stream.

[Actor interop operators](../index.html#actor-interop-operators)

## Signature

[`Source.actorRef`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html#actorRef(akka.japi.function.Function,akka.japi.function.Function,int,akka.stream.OverflowStrategy) "akka.stream.javadsl.Source")[`Source.actorRef`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source$.html#actorRef[T](completionMatcher:PartialFunction[Any,akka.stream.CompletionStrategy],failureMatcher:PartialFunction[Any,Throwable],bufferSize:Int,overflowStrategy:akka.stream.OverflowStrategy):akka.stream.scaladsl.Source[T,akka.actor.ActorRef] "akka.stream.scaladsl.Source")

## Description

Materialize an `ActorRef`, sending messages to it will emit them on the stream. The actor contains a buffer but since communication is one way, there is no back pressure. Handling overflow is done by either dropping elements or failing the stream; the strategy is chosen by the user.

The stream can be completed successfully by sending the actor reference a `akka.actor.Status.Success`. If the content is `akka.stream.CompletionStrategy.immediately` the completion will be signaled immediately. Otherwise, if the content is `akka.stream.CompletionStrategy.draining` (or anything else) already buffered elements will be sent out before signaling completion. Sending `akka.actor.PoisonPill` will signal completion immediately but this behavior is deprecated and scheduled to be removed. Using `akka.actor.ActorSystem.stop` to stop the actor and complete the stream is *not supported*.

See also:

- [Source.actorRefWithBackpressure](actorRefWithBackpressure.html) This operator, but with backpressure control
- [ActorSource.actorRef](../ActorSource/actorRef.html) The corresponding operator for the new actors API
- [ActorSource.actorRefWithBackpressure](../ActorSource/actorRefWithBackpressure.html) The operator for the new actors API with backpressure control
- [Source.queue](queue.html) Materialize a `SourceQueue` onto which elements can be pushed for emitting from the source

## Examples

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/operators/SourceOperators.scala#L34-L56 "Go to snippet source")import akka.Done
import akka.actor.ActorRef
import akka.stream.OverflowStrategy
import akka.stream.CompletionStrategy
import akka.stream.scaladsl._

val source: Source[Any, ActorRef] = Source.actorRef(
  completionMatcher = {
    case Done =>
      // complete stream immediately if we send it Done
      CompletionStrategy.immediately
  },
  // never fail the stream because of a message
  failureMatcher = PartialFunction.empty,
  bufferSize = 100,
  overflowStrategy = OverflowStrategy.dropHead)
val actorRef: ActorRef = source.to(Sink.foreach(println)).run()

actorRef ! "hello"
actorRef ! "hello"

// The stream completes successfully with the following message
actorRef ! Done
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/operators/SourceDocExamples.java#L18-L22 "Go to snippet source")import akka.actor.ActorRef;
import akka.stream.OverflowStrategy;
import akka.stream.CompletionStrategy;
import akka.stream.javadsl.Sink;
import akka.testkit.TestProbe;

int bufferSize = 100;
Source<Object, ActorRef> source =
    Source.actorRef(
        elem -> {
          // complete stream immediately if we send it Done
          if (elem == Done.done()) return Optional.of(CompletionStrategy.immediately());
          else return Optional.empty();
        },
        // never fail the stream because of a message
        elem -> Optional.empty(),
        bufferSize,
        OverflowStrategy.dropHead());

ActorRef actorRef = source.to(Sink.foreach(System.out::println)).run(system);
actorRef.tell("hello", ActorRef.noSender());
actorRef.tell("hello", ActorRef.noSender());

// The stream completes successfully with the following message
actorRef.tell(Done.done(), ActorRef.noSender());
```

## Reactive Streams semantics

**emits** when there is demand and there are messages in the buffer or a message is sent to the `ActorRef`

**completes** when the actor is stopped by sending it a particular message as described above

## Code Examples

### Example 1: Examples

```scala
import akka.Done
import akka.actor.ActorRef
import akka.stream.OverflowStrategy
import akka.stream.CompletionStrategy
import akka.stream.scaladsl._

val source: Source[Any, ActorRef] = Source.actorRef(
  completionMatcher = {
    case Done =>
      // complete stream immediately if we send it Done
      CompletionStrategy.immediately
  },
  // never fail the stream because of a message
  failureMatcher = PartialFunction.empty,
  bufferSize = 100,
  overflowStrategy = OverflowStrategy.dropHead)
val actorRef: ActorRef = source.to(Sink.foreach(println)).run()

actorRef ! "hello"
actorRef ! "hello"

// The stream completes successfully with the following message
actorRef ! Done
```

### Example 2: Examples

```java
import akka.actor.ActorRef;
import akka.stream.OverflowStrategy;
import akka.stream.CompletionStrategy;
import akka.stream.javadsl.Sink;
import akka.testkit.TestProbe;

int bufferSize = 100;
Source<Object, ActorRef> source =
    Source.actorRef(
        elem -> {
          // complete stream immediately if we send it Done
          if (elem == Done.done()) return Optional.of(CompletionStrategy.immediately());
          else return Optional.empty();
        },
        // never fail the stream because of a message
        elem -> Optional.empty(),
        bufferSize,
        OverflowStrategy.dropHead());

ActorRef actorRef = source.to(Sink.foreach(System.out::println)).run(system);
actorRef.tell("hello", ActorRef.noSender());
actorRef.tell("hello", ActorRef.noSender());

// The stream completes successfully with the following message
actorRef.tell(Done.done(), ActorRef.noSender());
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/ActorSource/actorRef.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/ActorSource/actorRefWithBackpressure.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Sink/actorRef.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/actorRefWithBackpressure.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/queue.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/actorRef.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/actorRef.html)*