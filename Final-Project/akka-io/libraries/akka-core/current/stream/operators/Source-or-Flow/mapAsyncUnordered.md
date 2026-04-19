---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:27:35Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/mapAsyncUnordered.html
title: mapAsyncUnordered • Akka core
---

# mapAsyncUnordered • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# mapAsyncUnordered

Like `mapAsync` but `Future` `CompletionStage` results are passed downstream as they arrive regardless of the order of the elements that triggered them.

[Asynchronous operators](../index.html#asynchronous-operators)

## Signature

[`Source.mapAsyncUnordered`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html#mapAsyncUnordered(int,akka.japi.function.Function) "akka.stream.javadsl.Source")[`Source.mapAsyncUnordered`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html#mapAsyncUnordered[T](parallelism:Int)(f:Out=>scala.concurrent.Future[T]):FlowOps.this.Repr[T] "akka.stream.scaladsl.Source") [`Flow.mapAsyncUnordered`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html#mapAsyncUnordered(int,akka.japi.function.Function) "akka.stream.javadsl.Flow")[`Flow.mapAsyncUnordered`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html#mapAsyncUnordered[T](parallelism:Int)(f:Out=>scala.concurrent.Future[T]):FlowOps.this.Repr[T] "akka.stream.scaladsl.Flow")

## Description

Like `mapAsync` but `Future` `CompletionStage` results are passed downstream as they arrive regardless of the order of the elements that triggered them.

If a `Future` `CompletionStage` completes with `null`, it is ignored and the next element is processed. If a `Future` `CompletionStage` fails, the stream also fails (unless a different supervision strategy is applied)

## Examples

Imagine you are consuming messages from a source, and you prioritize throughput over order (this could be uncorrelated messages so order is irrelevant). You may use the `mapAsyncUnordered` (so messages are emitted as soon as they’ve been processed) with some parallelism (so processing happens concurrently) :

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/operators/sourceorflow/MapAsyncs.scala#L90-L160 "Go to snippet source")  
val events: Source[Event, NotUsed] = Consumer.plainSource(settings, subscription).throttle(1, 50.millis)

def eventHandler(event: Event): Future[Int] = {
  println(s"Processing event $event...")
}

events
  .mapAsyncUnordered(3) { in =>
    eventHandler(in)
  }
  .map { in =>
    println(s"`mapAsyncUnordered` emitted event number: $in")
  }
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/operators/sourceorflow/MapAsyncs.java#L34-L104 "Go to snippet source")  
private final Source<Event, NotUsed> events =
    Consumer.plainSource(settings, subscription).throttle(1, Duration.ofMillis(50));

public CompletionStage<Integer> eventHandler(Event in) throws InterruptedException {
  System.out.println("Processing event number " + in + "...");
  // ...
}

  events
      .mapAsyncUnordered(10, this::eventHandler)
      .map(in -> "`mapSync` emitted event number " + in.intValue())
      .runWith(Sink.foreach(str -> System.out.println(str)), system);
```

When running the stream above the logging output would look like:

```
[...]
Processing event numner Event(27)...
Completed processing 27
`mapAsyncUnordered` emitted event number: 27
Processing event numner Event(28)...
Completed processing 22
`mapAsyncUnordered` emitted event number: 22
Processing event numner Event(29)...
Completed processing 26
`mapAsyncUnordered` emitted event number: 26
Processing event numner Event(30)...
Completed processing 30
`mapAsyncUnordered` emitted event number: 30
Processing event numner Event(31)...
Completed processing 31
`mapAsyncUnordered` emitted event number: 31
[...]

```

See [mapAsync](mapAsync.html#examples) for a variant with ordering guarantees.

## Reactive Streams semantics

**emits** any of the `Future` s `CompletionStage` s returned by the provided function complete

**backpressures** when the number of `Future` s `CompletionStage` s reaches the configured parallelism and the downstream backpressures

**completes** upstream completes and all `Future` s `CompletionStage` s has been completed and all elements has been emitted

## Code Examples

### Example 1: Examples

```scala
val events: Source[Event, NotUsed] = Consumer.plainSource(settings, subscription).throttle(1, 50.millis)

def eventHandler(event: Event): Future[Int] = {
  println(s"Processing event $event...")
}

events
  .mapAsyncUnordered(3) { in =>
    eventHandler(in)
  }
  .map { in =>
    println(s"`mapAsyncUnordered` emitted event number: $in")
  }
```

### Example 2: Examples

```java
private final Source<Event, NotUsed> events =
    Consumer.plainSource(settings, subscription).throttle(1, Duration.ofMillis(50));

public CompletionStage<Integer> eventHandler(Event in) throws InterruptedException {
  System.out.println("Processing event number " + in + "...");
  // ...
}

  events
      .mapAsyncUnordered(10, this::eventHandler)
      .map(in -> "`mapSync` emitted event number " + in.intValue())
      .runWith(Sink.foreach(str -> System.out.println(str)), system);
```

### Example 3: Examples

```text
[...]
Processing event numner Event(27)...
Completed processing 27
`mapAsyncUnordered` emitted event number: 27
Processing event numner Event(28)...
Completed processing 22
`mapAsyncUnordered` emitted event number: 22
Processing event numner Event(29)...
Completed processing 26
`mapAsyncUnordered` emitted event number: 26
Processing event numner Event(30)...
Completed processing 30
`mapAsyncUnordered` emitted event number: 30
Processing event numner Event(31)...
Completed processing 31
`mapAsyncUnordered` emitted event number: 31
[...]
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/mapAsync.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/mapAsyncPartitioned.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/mapConcat.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/mapAsyncUnordered.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/mapAsyncUnordered.html)*