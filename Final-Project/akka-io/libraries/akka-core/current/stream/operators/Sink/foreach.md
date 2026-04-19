---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:27:06Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/Sink/foreach.html
title: Sink.foreach • Akka core
---

# Sink.foreach • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Sink.foreach

Invoke a given procedure for each element received.

[Sink operators](../index.html#sink-operators)

## Signature

[`Sink.foreach`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Sink.html#foreach(akka.japi.function.Procedure) "akka.stream.javadsl.Sink")[`Sink.foreach`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Sink$.html#foreach[T](f:T=%3EUnit):akka.stream.scaladsl.Sink[T,scala.concurrent.Future[akka.Done]] "akka.stream.scaladsl.Sink")

## Description

Invoke a given procedure for each element received. Note that it is not safe to mutate shared state from the procedure.

The sink materializes into a `Future[Done]` `CompletionStage<Done>` which completes when the stream completes, or fails if the stream fails.

Note that it is not safe to mutate state from the procedure.

See also:

- [`foreachAsync`](foreachAsync.html) Invoke a given procedure asynchronously for each element received.
- [`actorRef`](actorRef.html) Send the elements from the stream to an `ActorRef`.

## Example

This prints out every element to standard out.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-stream-tests/src/test/scala/akka/stream/scaladsl/SinkSpec.scala#L302-L309 "Go to snippet source")val printlnSink: Sink[Any, Future[Done]] = Sink.foreach(println)
val f = Source(1 to 4).runWith(printlnSink)
val done = Await.result(f, 100.millis)
// will print
// 1
// 2
// 3
// 4
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-stream-tests/src/test/java/akka/stream/javadsl/SinkTest.java#L205-L212 "Go to snippet source")Sink<Integer, CompletionStage<Done>> printlnSink = Sink.foreach(System.out::println);
CompletionStage<Done> cs = Source.from(Arrays.asList(1, 2, 3, 4)).runWith(printlnSink, system);
Done done = cs.toCompletableFuture().get(100, TimeUnit.MILLISECONDS);
// will print
// 1
// 2
// 3
// 4
```

## Reactive Streams semantics

**cancels** never

**backpressures** when the previous procedure invocation has not yet completed

## Code Examples

### Example 1: Example

```scala
val printlnSink: Sink[Any, Future[Done]] = Sink.foreach(println)
val f = Source(1 to 4).runWith(printlnSink)
val done = Await.result(f, 100.millis)
// will print
// 1
// 2
// 3
// 4
```

### Example 2: Example

```java
Sink<Integer, CompletionStage<Done>> printlnSink = Sink.foreach(System.out::println);
CompletionStage<Done> cs = Source.from(Arrays.asList(1, 2, 3, 4)).runWith(printlnSink, system);
Done done = cs.toCompletableFuture().get(100, TimeUnit.MILLISECONDS);
// will print
// 1
// 2
// 3
// 4
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Sink$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Sink.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Sink/actorRef.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Sink/foreachAsync.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/foldAsync.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/Sink/foreach.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/Sink/foreach.html)*