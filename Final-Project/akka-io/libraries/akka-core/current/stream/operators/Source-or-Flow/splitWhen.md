---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:27:43Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/splitWhen.html
title: splitWhen • Akka core
---

# splitWhen • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# splitWhen

Split off elements into a new substream whenever a predicate function return `true`.

[Nesting and flattening operators](../index.html#nesting-and-flattening-operators)

## Signature

[`Source.splitWhen`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html#splitWhen(akka.stream.SubstreamCancelStrategy,akka.japi.function.Predicate) "akka.stream.javadsl.Source")[`Source.splitWhen`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html#splitWhen(substreamCancelStrategy:akka.stream.SubstreamCancelStrategy)(p:Out=>Boolean):akka.stream.scaladsl.SubFlow[Out,Mat,FlowOps.this.Repr,FlowOps.this.Closed] "akka.stream.scaladsl.Source") [`Flow.splitWhen`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html#splitWhen(akka.stream.SubstreamCancelStrategy,akka.japi.function.Predicate) "akka.stream.javadsl.Flow")[`Flow.splitWhen`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html#splitWhen(substreamCancelStrategy:akka.stream.SubstreamCancelStrategy)(p:Out=>Boolean):akka.stream.scaladsl.SubFlow[Out,Mat,FlowOps.this.Repr,FlowOps.this.Closed] "akka.stream.scaladsl.Flow")

## Description

Split off elements into a new substream whenever a predicate function return `true`.

## Example

Given some time series data source we would like to split the stream into sub\-streams for each second. We need to compare the timestamp of the previous and current element to decide when to split. This decision can be implemented in a `statefulMapConcat` operator preceding the `splitWhen`. 

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/operators/sourceorflow/Split.scala#L23-L56 "Go to snippet source")Source(1 to 100)
  .throttle(1, 100.millis)
  .map(elem => (elem, Instant.now()))
  .statefulMapConcat(() => {
    // stateful decision in statefulMapConcat
    // keep track of time bucket (one per second)
    var currentTimeBucket = LocalDateTime.ofInstant(Instant.ofEpochMilli(0), ZoneOffset.UTC)

    {
      case (elem, timestamp) =>
        val time = LocalDateTime.ofInstant(timestamp, ZoneOffset.UTC)
        val bucket = time.withNano(0)
        val newBucket = bucket != currentTimeBucket
        if (newBucket)
          currentTimeBucket = bucket
        List((elem, newBucket))
    }
  })
  .splitWhen(_._2) // split when time bucket changes
  .map(_._1)
  .fold(0)((acc, _) => acc + 1) // sum
  .to(Sink.foreach(println))
  .run()
// 3
// 10
// 10
// 10
// 10
// 10
// 10
// 10
// 10
// 10
// 7
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/operators/sourceorflow/Split.java#L23-L61 "Go to snippet source")Source.range(1, 100)
    .throttle(1, Duration.ofMillis(100))
    .map(elem -> new Pair<>(elem, Instant.now()))
    .statefulMapConcat(
        () -> {
          return new Function<Pair<Integer, Instant>, Iterable<Pair<Integer, Boolean>>>() {
            // stateful decision in statefulMapConcat
            // keep track of time bucket (one per second)
            LocalDateTime currentTimeBucket =
                LocalDateTime.ofInstant(Instant.ofEpochMilli(0), ZoneOffset.UTC);

            @Override
            public Iterable<Pair<Integer, Boolean>> apply(
                Pair<Integer, Instant> elemTimestamp) {
              LocalDateTime time =
                  LocalDateTime.ofInstant(elemTimestamp.second(), ZoneOffset.UTC);
              LocalDateTime bucket = time.withNano(0);
              boolean newBucket = !bucket.equals(currentTimeBucket);
              if (newBucket) currentTimeBucket = bucket;
              return Collections.singleton(new Pair<>(elemTimestamp.first(), newBucket));
            }
          };
        })
    .splitWhen(elemDecision -> elemDecision.second()) // split when time bucket changes
    .map(elemDecision -> elemDecision.first())
    .fold(0, (acc, notUsed) -> acc + 1) // sum
    .to(Sink.foreach(System.out::println))
    .run(system);
// 3
// 10
// 10
// 10
// 10
// 10
// 10
// 10
// 10
// 10
// 7
```

An alternative way of implementing this is shown in [splitAfter example](splitAfter.html#example).

## Reactive Streams semantics

**emits** an element for which the provided predicate is true, opening and emitting a new substream for subsequent elements

**backpressures** when there is an element pending for the next substream, but the previous is not fully consumed yet, or the substream backpressures

**completes** when upstream completes (Until the end of stream it is not possible to know whether new substreams will be needed or not)

## Code Examples

### Example 1: Example

```scala
Source(1 to 100)
  .throttle(1, 100.millis)
  .map(elem => (elem, Instant.now()))
  .statefulMapConcat(() => {
    // stateful decision in statefulMapConcat
    // keep track of time bucket (one per second)
    var currentTimeBucket = LocalDateTime.ofInstant(Instant.ofEpochMilli(0), ZoneOffset.UTC)

    {
      case (elem, timestamp) =>
        val time = LocalDateTime.ofInstant(timestamp, ZoneOffset.UTC)
        val bucket = time.withNano(0)
        val newBucket = bucket != currentTimeBucket
        if (newBucket)
          currentTimeBucket = bucket
        List((elem, newBucket))
    }
  })
  .splitWhen(_._2) // split when time bucket changes
  .map(_._1)
  .fold(0)((acc, _) => acc + 1) // sum
  .to(Sink.foreach(println))
  .run()
// 3
// 10
// 10
// 10
// 10
// 10
// 10
// 10
// 10
// 10
// 7
```

### Example 2: Example

```java
Source.range(1, 100)
    .throttle(1, Duration.ofMillis(100))
    .map(elem -> new Pair<>(elem, Instant.now()))
    .statefulMapConcat(
        () -> {
          return new Function<Pair<Integer, Instant>, Iterable<Pair<Integer, Boolean>>>() {
            // stateful decision in statefulMapConcat
            // keep track of time bucket (one per second)
            LocalDateTime currentTimeBucket =
                LocalDateTime.ofInstant(Instant.ofEpochMilli(0), ZoneOffset.UTC);

            @Override
            public Iterable<Pair<Integer, Boolean>> apply(
                Pair<Integer, Instant> elemTimestamp) {
              LocalDateTime time =
                  LocalDateTime.ofInstant(elemTimestamp.second(), ZoneOffset.UTC);
              LocalDateTime bucket = time.withNano(0);
              boolean newBucket = !bucket.equals(currentTimeBucket);
              if (newBucket) currentTimeBucket = bucket;
              return Collections.singleton(new Pair<>(elemTimestamp.first(), newBucket));
            }
          };
        })
    .splitWhen(elemDecision -> elemDecision.second()) // split when time bucket changes
    .map(elemDecision -> elemDecision.first())
    .fold(0, (acc, notUsed) -> acc + 1) // sum
    .to(Sink.foreach(System.out::println))
    .run(system);
// 3
// 10
// 10
// 10
// 10
// 10
// 10
// 10
// 10
// 10
// 7
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/splitAfter.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/statefulMap.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/splitWhen.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/splitWhen.html)*