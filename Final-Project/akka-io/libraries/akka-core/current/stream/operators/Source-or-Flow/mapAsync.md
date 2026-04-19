---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:27:35Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/mapAsync.html
title: mapAsync • Akka core
---

# mapAsync • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# mapAsync

Pass incoming elements to a function that return a `Future` `CompletionStage` result.

[Asynchronous operators](../index.html#asynchronous-operators)

## Signature

[`Source.mapAsync`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html#mapAsync(int,akka.japi.function.Function) "akka.stream.javadsl.Source")[`Source.mapAsync`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html#mapAsync[T](parallelism:Int)(f:Out=>scala.concurrent.Future[T]):FlowOps.this.Repr[T] "akka.stream.scaladsl.Source") [`Flow.mapAsync`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html#mapAsync(int,akka.japi.function.Function) "akka.stream.javadsl.Flow")[`Flow.mapAsync`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html#mapAsync[T](parallelism:Int)(f:Out=>scala.concurrent.Future[T]):FlowOps.this.Repr[T] "akka.stream.scaladsl.Flow")

## Description

Pass incoming elements to a function that return a `Future` `CompletionStage` result. When the `Future` `CompletionStage` arrives the result is passed downstream. Up to `n` elements can be processed concurrently, but regardless of their completion time the incoming order will be kept when results complete. For use cases where order does not matter `mapAsyncUnordered` can be used.

If a `Future` `CompletionStage` completes with `null`, it is ignored and the next element is processed. If a `Future` `CompletionStage` fails, the stream also fails (unless a different supervision strategy is applied)

## Examples

Imagine you are consuming messages from a broker. These messages represent business events produced on a service upstream. In that case, you want to consume the messages in order and one at a time:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/operators/sourceorflow/MapAsyncs.scala#L90-L128 "Go to snippet source")  
val events: Source[Event, NotUsed] = Consumer.plainSource(settings, subscription).throttle(1, 50.millis)

def eventHandler(event: Event): Future[Int] = {
  println(s"Processing event $event...")
}

events
  .mapAsync(1) { in =>
    eventHandler(in)
  }
  .map { in =>
    println(s"`mapAsync` emitted event number: $in")
  }
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/operators/sourceorflow/MapAsyncs.java#L34-L84 "Go to snippet source")  
private final Source<Event, NotUsed> events =
    Consumer.plainSource(settings, subscription).throttle(1, Duration.ofMillis(50));

public CompletionStage<Integer> eventHandler(Event in) throws InterruptedException {
  System.out.println("Processing event number " + in + "...");
  // ...
}

  events
      .mapAsync(1, this::eventHandler)
      .map(in -> "`mapSync` emitted event number " + in.intValue())
      .runWith(Sink.foreach(str -> System.out.println(str)), system);
```

When running the stream above the logging output would look like:

```
[...]
Processing event number Event(33)...
Completed processing 33
`mapAsync` emitted event number: 33
Processing event number Event(34)...
Completed processing 34
`mapAsync` emitted event number: 34
[...]

```

If, instead, you may process information concurrently, but still emit the messages downstream in order, you may increase the parallelism. In this case, the events could some IoT payload with weather metrics, for example, where processing the data in strict ordering is not critical:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/operators/sourceorflow/MapAsyncs.scala#L90-L144 "Go to snippet source")  
val events: Source[Event, NotUsed] = Consumer.plainSource(settings, subscription).throttle(1, 50.millis)

def eventHandler(event: Event): Future[Int] = {
  println(s"Processing event $event...")
}

events
  .mapAsync(3) { in =>
    eventHandler(in)
  }
  .map { in =>
    println(s"`mapAsync` emitted event number: $in")
  }
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/operators/sourceorflow/MapAsyncs.java#L34-L94 "Go to snippet source")  
private final Source<Event, NotUsed> events =
    Consumer.plainSource(settings, subscription).throttle(1, Duration.ofMillis(50));

public CompletionStage<Integer> eventHandler(Event in) throws InterruptedException {
  System.out.println("Processing event number " + in + "...");
  // ...
}

  events
      .mapAsync(10, this::eventHandler)
      .map(in -> "`mapSync` emitted event number " + in.intValue())
      .runWith(Sink.foreach(str -> System.out.println(str)), system);
```

In this case, the logging soon shows how processing of the events happens concurrently which may break the ordering. Still, the stage emits the events back in the correct order:

```
[...]
Processing event number Event(15)...
Processing event number Event(16)...
Completed processing 16
Processing event number Event(17)...
Completed processing 17
Completed processing 15
`mapAsync` emitted event number: 15
`mapAsync` emitted event number: 16
Processing event number Event(18)...
`mapAsync` emitted event number: 17
[...]

```

See also [mapAsyncUnordered](mapAsyncUnordered.html#examples).

## Reactive Streams semantics

**emits** when the `Future` `CompletionStage` returned by the provided function finishes for the next element in sequence

**backpressures** when the number of `Future` s `CompletionStage` s reaches the configured parallelism and the downstream backpressures

**completes** when upstream completes and all `Future` s `CompletionStage` s has been completed and all elements has been emitted

## Code Examples

### Example 1: Examples

```scala
val events: Source[Event, NotUsed] = Consumer.plainSource(settings, subscription).throttle(1, 50.millis)

def eventHandler(event: Event): Future[Int] = {
  println(s"Processing event $event...")
}

events
  .mapAsync(1) { in =>
    eventHandler(in)
  }
  .map { in =>
    println(s"`mapAsync` emitted event number: $in")
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
      .mapAsync(1, this::eventHandler)
      .map(in -> "`mapSync` emitted event number " + in.intValue())
      .runWith(Sink.foreach(str -> System.out.println(str)), system);
```

### Example 3: Examples

```text
[...]
Processing event number Event(33)...
Completed processing 33
`mapAsync` emitted event number: 33
Processing event number Event(34)...
Completed processing 34
`mapAsync` emitted event number: 34
[...]
```

### Example 4: Examples

```scala
val events: Source[Event, NotUsed] = Consumer.plainSource(settings, subscription).throttle(1, 50.millis)

def eventHandler(event: Event): Future[Int] = {
  println(s"Processing event $event...")
}

events
  .mapAsync(3) { in =>
    eventHandler(in)
  }
  .map { in =>
    println(s"`mapAsync` emitted event number: $in")
  }
```

### Example 5: Examples

```java
private final Source<Event, NotUsed> events =
    Consumer.plainSource(settings, subscription).throttle(1, Duration.ofMillis(50));

public CompletionStage<Integer> eventHandler(Event in) throws InterruptedException {
  System.out.println("Processing event number " + in + "...");
  // ...
}

  events
      .mapAsync(10, this::eventHandler)
      .map(in -> "`mapSync` emitted event number " + in.intValue())
      .runWith(Sink.foreach(str -> System.out.println(str)), system);
```

### Example 6: Examples

```text
[...]
Processing event number Event(15)...
Processing event number Event(16)...
Completed processing 16
Processing event number Event(17)...
Completed processing 17
Completed processing 15
`mapAsync` emitted event number: 15
`mapAsync` emitted event number: 16
Processing event number Event(18)...
`mapAsync` emitted event number: 17
[...]
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/map.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/mapAsyncPartitioned.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/mapAsyncUnordered.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/mapAsync.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/mapAsync.html)*