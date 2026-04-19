---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:27:00Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/tick.html
title: Source.tick • Akka core
---

# Source.tick • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Source.tick

A periodical repetition of an arbitrary object.

[Source operators](../index.html#source-operators)

## Signature

[`Source.tick`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html#tick(java.time.Duration,java.time.Duration,java.lang.Object) "akka.stream.javadsl.Source")[`Source.tick`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source$.html#tick[T](initialDelay:scala.concurrent.duration.FiniteDuration,interval:scala.concurrent.duration.FiniteDuration,tick:T):akka.stream.scaladsl.Source[T,akka.actor.Cancellable] "akka.stream.scaladsl.Source")

## Description

A periodical repetition of an arbitrary object. Delay of first tick is specified separately from interval of the following ticks. 

If downstream is applying backpressure when the time period has passed the tick is dropped.

The source materializes a [`Cancellable`](https://doc.akka.io/api/akka-core/2.10/akka/actor/Cancellable.html "akka.actor.Cancellable")[`Cancellable`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/Cancellable.html "akka.actor.Cancellable") that can be used to complete the source.

Note
The element must be immutable as the source can be materialized several times and may pass it between threads, see the second example for achieving a periodical element that changes over time.

See also:

- [`repeat`](repeat.html) Stream a single object repeatedly.
- [`cycle`](cycle.html) Stream iterator in cycled manner.

## Examples

This first example prints to standard out periodically:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/operators/source/Tick.scala#L34-L40 "Go to snippet source")Source
  .tick(
    1.second, // delay of first tick
    1.second, // delay of subsequent ticks
    "tick" // element emitted each tick
  )
  .runForeach(println)
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/operators/source/Tick.java#L46-L51 "Go to snippet source")Source.tick(
        Duration.ofSeconds(1), // delay of first tick
        Duration.ofSeconds(1), // delay of subsequent ticks
        "tick" // element emitted each tick
        )
    .runForeach(System.out::println, system);
```

You can also use the tick to periodically emit a value, in this sample we use the tick to trigger a query to an actor using [ask](../../../typed/interaction-patterns.html#outside-ask) and emit the response downstream. For this usage, what is important is that it was emitted, not the actual tick value.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/operators/source/Tick.scala#L46-L53 "Go to snippet source")val periodicActorResponse: Source[String, Cancellable] = Source
  .tick(1.second, 1.second, "tick")
  .mapAsync(1) { _ =>
    implicit val timeout: Timeout = 3.seconds
    val response: Future[MyActor.Response] = myActor.ask(MyActor.Query(_))
    response
  }
  .map(_.text);
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/operators/source/Tick.java#L57-L67 "Go to snippet source")Source<String, Cancellable> periodicActorResponse =
    Source.tick(Duration.ofSeconds(1), Duration.ofSeconds(1), "tick")
        .mapAsync(
            1,
            notUsed -> {
              CompletionStage<MyActor.Response> response =
                  AskPattern.ask(
                      myActor, MyActor.Query::new, Duration.ofSeconds(3), system.scheduler());
              return response;
            })
        .map(response -> response.text);
```

A neat trick is to combine this with [zipLatest](../Source-or-Flow/zipLatest.html) to combine a stream of elements with a value that is updated periodically instead of having to trigger a query for each element:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/operators/source/Tick.scala#L57-L58 "Go to snippet source")val zipWithLatestResponse: Flow[Int, (Int, String), NotUsed] =
  Flow[Int].zipLatest(periodicActorResponse);
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/operators/source/Tick.java#L71-L72 "Go to snippet source")Flow<Integer, Pair<Integer, String>, NotUsed> zipWithLatestResponse =
    Flow.of(Integer.class).zipLatest(periodicActorResponse);
```

## Reactive Streams semantics

**emits** periodically, if there is downstream backpressure ticks are skipped

**completes** when the materialized `Cancellable` is cancelled

## Code Examples

### Example 1: Examples

```scala
Source
  .tick(
    1.second, // delay of first tick
    1.second, // delay of subsequent ticks
    "tick" // element emitted each tick
  )
  .runForeach(println)
```

### Example 2: Examples

```java
Source.tick(
        Duration.ofSeconds(1), // delay of first tick
        Duration.ofSeconds(1), // delay of subsequent ticks
        "tick" // element emitted each tick
        )
    .runForeach(System.out::println, system);
```

### Example 3: Examples

```scala
val periodicActorResponse: Source[String, Cancellable] = Source
  .tick(1.second, 1.second, "tick")
  .mapAsync(1) { _ =>
    implicit val timeout: Timeout = 3.seconds
    val response: Future[MyActor.Response] = myActor.ask(MyActor.Query(_))
    response
  }
  .map(_.text);
```

### Example 4: Examples

```java
Source<String, Cancellable> periodicActorResponse =
    Source.tick(Duration.ofSeconds(1), Duration.ofSeconds(1), "tick")
        .mapAsync(
            1,
            notUsed -> {
              CompletionStage<MyActor.Response> response =
                  AskPattern.ask(
                      myActor, MyActor.Query::new, Duration.ofSeconds(3), system.scheduler());
              return response;
            })
        .map(response -> response.text);
```

### Example 5: Examples

```scala
val zipWithLatestResponse: Flow[Int, (Int, String), NotUsed] =
  Flow[Int].zipLatest(periodicActorResponse);
```

### Example 6: Examples

```java
Flow<Integer, Pair<Integer, String>, NotUsed> zipWithLatestResponse =
    Flow.of(Integer.class).zipLatest(periodicActorResponse);
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/actor/Cancellable.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/Cancellable.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/FileIO/toFile.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/throttle.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/zipLatest.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/cycle.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/repeat.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html
- https://doc.akka.io/libraries/akka-core/current/typed/interaction-patterns.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/tick.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/tick.html)*