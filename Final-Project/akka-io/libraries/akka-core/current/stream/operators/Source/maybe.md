---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:26:58Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/maybe.html
title: Source.maybe • Akka core
---

# Source.maybe • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Source.maybe

Create a source that emits once the materialized `Promise` `CompletableFuture` is completed with a value.

[Source operators](../index.html#source-operators)

## Signature

[`Source.maybe`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html#maybe() "akka.stream.javadsl.Source")[`Source.maybe`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source$.html#maybe[T]:akka.stream.scaladsl.Source[T,scala.concurrent.Promise[Option[T]]] "akka.stream.scaladsl.Source")

## Description

Create a source with a materialized `Promise[Option[T]]` `CompletableFuture<Optional<T>>` which controls what element will be emitted by the Source. This makes it possible to inject a value into a stream after creation.

- If the materialized promise is completed with a `Some`non\-empty `Optional`, that value will be produced downstream, followed by completion.
- If the materialized promise is completed with a `None`empty `Optional`, no value will be produced downstream and completion will be signalled immediately.
- If the materialized promise is completed with a failure, then the source will fail with that error.
- If the downstream of this source cancels or fails before the promise has been completed, then the promise will be completed with `None`empty `Optional`.

`Source.maybe` has some similarities with [`Source.fromFuture`](fromFuture.html)[`Source.fromCompletionStage`](fromCompletionStage.html). One difference is that a new `Promise``CompletableFuture` is materialized from `Source.maybe` each time the stream is run while the `Future``CompletionStage` given to `Source.fromFuture``Source.fromCompletionStage` can only be completed once.

[`Source.queue`](queue.html) is an alternative for emitting more than one element. 

## Example

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/operators/SourceOperators.scala#L92-L102 "Go to snippet source")import akka.stream.scaladsl._
import scala.concurrent.Promise

val source = Source.maybe[Int].to(Sink.foreach(elem => println(elem)))

val promise1: Promise[Option[Int]] = source.run()
promise1.success(Some(1)) // prints 1

// a new Promise is returned when the stream is materialized
val promise2 = source.run()
promise2.success(Some(2)) // prints 2
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/operators/SourceDocExamples.java#L26-L144 "Go to snippet source")import akka.stream.javadsl.RunnableGraph;
import java.util.concurrent.CompletableFuture;
Source<Integer, CompletableFuture<Optional<Integer>>> source = Source.<Integer>maybe();
RunnableGraph<CompletableFuture<Optional<Integer>>> runnable =
    source.to(Sink.foreach(System.out::println));

CompletableFuture<Optional<Integer>> completable1 = runnable.run(system);
completable1.complete(Optional.of(1)); // prints 1

CompletableFuture<Optional<Integer>> completable2 = runnable.run(system);
completable2.complete(Optional.of(2)); // prints 2
```

The `Source.maybe[Int]` will return a `Promise[Option[Int]]``CompletableFuture<Optional<Integer>>` materialized value. That `Promise``CompletableFuture` can be completed later. Each time the stream is run a new `Promise``CompletableFuture` is returned. 

## Reactive Streams semantics

**emits** when the returned promise is completed with some value

**completes** after emitting some value, or directly if the promise is completed with no value

## Code Examples

### Example 1: Example

```scala
import akka.stream.scaladsl._
import scala.concurrent.Promise

val source = Source.maybe[Int].to(Sink.foreach(elem => println(elem)))

val promise1: Promise[Option[Int]] = source.run()
promise1.success(Some(1)) // prints 1

// a new Promise is returned when the stream is materialized
val promise2 = source.run()
promise2.success(Some(2)) // prints 2
```

### Example 2: Example

```java
import akka.stream.javadsl.RunnableGraph;
import java.util.concurrent.CompletableFuture;
Source<Integer, CompletableFuture<Optional<Integer>>> source = Source.<Integer>maybe();
RunnableGraph<CompletableFuture<Optional<Integer>>> runnable =
    source.to(Sink.foreach(System.out::println));

CompletableFuture<Optional<Integer>> completable1 = runnable.run(system);
completable1.complete(Optional.of(1)); // prints 1

CompletableFuture<Optional<Integer>> completable2 = runnable.run(system);
completable2.complete(Optional.of(2)); // prints 2
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/mapWithResource.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/merge.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/fromCompletionStage.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/fromFuture.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/queue.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/maybe.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/maybe.html)*