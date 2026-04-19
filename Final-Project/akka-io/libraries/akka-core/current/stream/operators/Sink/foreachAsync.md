---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:27:06Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/Sink/foreachAsync.html
title: Sink.foreachAsync • Akka core
---

# Sink.foreachAsync • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Sink.foreachAsync

Invoke a given procedure asynchronously for each element received.

[Sink operators](../index.html#sink-operators)

## Signature

[`Sink.foreachAsync`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Sink.html#foreachAsync(int,akka.japi.function.Function) "akka.stream.javadsl.Sink")[`Sink.foreachAsync`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Sink$.html#foreachAsync[T](parallelism:Int)(f:T=>scala.concurrent.Future[Unit]):akka.stream.scaladsl.Sink[T,scala.concurrent.Future[akka.Done]] "akka.stream.scaladsl.Sink")

## Description

Invoke a given procedure asynchronously for each element received. Note that if shared state is mutated from the procedure that must be done in a thread\-safe way.

The sink materializes into a `Future[Done]` `CompletionStage<Done>` which completes when the stream completes, or fails if the stream fails.

See also:

- [`foreach`](foreach.html) Invoke a given procedure for each element received.
- [`actorRef`](actorRef.html) Send the elements from the stream to an `ActorRef`.

## Example

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/SinkRecipeDocSpec.scala#L17-L19 "Go to snippet source")//def asyncProcessing(value: Int): Future[Unit] = _

Source(1 to 100).runWith(Sink.foreachAsync(10)(asyncProcessing))
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/SinkRecipeDocTest.java#L32-L36 "Go to snippet source")// final Function<Integer, CompletionStage<Void>> asyncProcessing = _

final Source<Integer, NotUsed> numberSource = Source.range(1, 100);

numberSource.runWith(Sink.foreachAsync(10, asyncProcessing), system);
```

## Reactive Streams semantics

**cancels** when a `Future` `CompletionStage` fails

**backpressures** when the number of `Future`s `CompletionStage`s reaches the configured parallelism

## Code Examples

### Example 1: Example

```scala
//def asyncProcessing(value: Int): Future[Unit] = _

Source(1 to 100).runWith(Sink.foreachAsync(10)(asyncProcessing))
```

### Example 2: Example

```java
// final Function<Integer, CompletionStage<Void>> asyncProcessing = _

final Source<Integer, NotUsed> numberSource = Source.range(1, 100);

numberSource.runWith(Sink.foreachAsync(10, asyncProcessing), system);
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Sink$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Sink.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Sink/actorRef.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Sink/foreach.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/from.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/Sink/foreachAsync.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/Sink/foreachAsync.html)*