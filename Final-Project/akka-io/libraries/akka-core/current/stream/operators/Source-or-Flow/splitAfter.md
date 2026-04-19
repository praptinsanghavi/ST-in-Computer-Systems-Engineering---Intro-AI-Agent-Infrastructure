---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:27:43Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/splitAfter.html
title: splitAfter • Akka core
---

# splitAfter • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# splitAfter

End the current substream whenever a predicate returns `true`, starting a new substream for the next element.

[Nesting and flattening operators](../index.html#nesting-and-flattening-operators)

## Signature

[`Source.splitAfter`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html#splitAfter(akka.stream.SubstreamCancelStrategy,akka.japi.function.Predicate) "akka.stream.javadsl.Source")[`Source.splitAfter`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html#splitAfter(substreamCancelStrategy:akka.stream.SubstreamCancelStrategy)(p:Out=>Boolean):akka.stream.scaladsl.SubFlow[Out,Mat,FlowOps.this.Repr,FlowOps.this.Closed] "akka.stream.scaladsl.Source") [`Flow.splitAfter`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html#splitAfter(akka.stream.SubstreamCancelStrategy,akka.japi.function.Predicate) "akka.stream.javadsl.Flow")[`Flow.splitAfter`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html#splitAfter(substreamCancelStrategy:akka.stream.SubstreamCancelStrategy)(p:Out=>Boolean):akka.stream.scaladsl.SubFlow[Out,Mat,FlowOps.this.Repr,FlowOps.this.Closed] "akka.stream.scaladsl.Flow")

## Description

End the current substream whenever a predicate returns `true`, starting a new substream for the next element.

## Example

Given some time series data source we would like to split the stream into sub\-streams for each second. By using `sliding` we can compare the timestamp of the current and next element to decide when to split.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/operators/sourceorflow/Split.scala#L66-L97 "Go to snippet source")Source(1 to 100)
  .throttle(1, 100.millis)
  .map(elem => (elem, Instant.now()))
  .sliding(2)
  .splitAfter { slidingElements =>
    if (slidingElements.size == 2) {
      val current = slidingElements.head
      val next = slidingElements.tail.head
      val currentBucket = LocalDateTime.ofInstant(current._2, ZoneOffset.UTC).withNano(0)
      val nextBucket = LocalDateTime.ofInstant(next._2, ZoneOffset.UTC).withNano(0)
      currentBucket != nextBucket
    } else {
      false
    }
  }
  .map(_.head._1)
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
// 6
// note that the very last element is never included due to sliding,
// but that would not be problem for an infinite stream
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/operators/sourceorflow/Split.java#L69-L103 "Go to snippet source")Source.range(1, 100)
    .throttle(1, Duration.ofMillis(100))
    .map(elem -> new Pair<>(elem, Instant.now()))
    .sliding(2, 1)
    .splitAfter(
        slidingElements -> {
          if (slidingElements.size() == 2) {
            Pair<Integer, Instant> current = slidingElements.get(0);
            Pair<Integer, Instant> next = slidingElements.get(1);
            LocalDateTime currentBucket =
                LocalDateTime.ofInstant(current.second(), ZoneOffset.UTC).withNano(0);
            LocalDateTime nextBucket =
                LocalDateTime.ofInstant(next.second(), ZoneOffset.UTC).withNano(0);
            return !currentBucket.equals(nextBucket);
          } else {
            return false;
          }
        })
    .map(slidingElements -> slidingElements.get(0).first())
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
// 6
// note that the very last element is never included due to sliding,
// but that would not be problem for an infinite stream
```

An alternative way of implementing this is shown in [splitWhen example](splitWhen.html#example).

## Reactive Streams semantics

**emits** when an element passes through. When the provided predicate is true it emits the element \* and opens a new substream for subsequent element

**backpressures** when there is an element pending for the next substream, but the previous is not fully consumed yet, or the substream backpressures

**completes** when upstream completes (Until the end of stream it is not possible to know whether new substreams will be needed or not)

## Code Examples

### Example 1: Example

```scala
Source(1 to 100)
  .throttle(1, 100.millis)
  .map(elem => (elem, Instant.now()))
  .sliding(2)
  .splitAfter { slidingElements =>
    if (slidingElements.size == 2) {
      val current = slidingElements.head
      val next = slidingElements.tail.head
      val currentBucket = LocalDateTime.ofInstant(current._2, ZoneOffset.UTC).withNano(0)
      val nextBucket = LocalDateTime.ofInstant(next._2, ZoneOffset.UTC).withNano(0)
      currentBucket != nextBucket
    } else {
      false
    }
  }
  .map(_.head._1)
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
// 6
// note that the very last element is never included due to sliding,
// but that would not be problem for an infinite stream
```

### Example 2: Example

```java
Source.range(1, 100)
    .throttle(1, Duration.ofMillis(100))
    .map(elem -> new Pair<>(elem, Instant.now()))
    .sliding(2, 1)
    .splitAfter(
        slidingElements -> {
          if (slidingElements.size() == 2) {
            Pair<Integer, Instant> current = slidingElements.get(0);
            Pair<Integer, Instant> next = slidingElements.get(1);
            LocalDateTime currentBucket =
                LocalDateTime.ofInstant(current.second(), ZoneOffset.UTC).withNano(0);
            LocalDateTime nextBucket =
                LocalDateTime.ofInstant(next.second(), ZoneOffset.UTC).withNano(0);
            return !currentBucket.equals(nextBucket);
          } else {
            return false;
          }
        })
    .map(slidingElements -> slidingElements.get(0).first())
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
// 6
// note that the very last element is never included due to sliding,
// but that would not be problem for an infinite stream
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/PubSub/source.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/splitWhen.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/splitAfter.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/splitAfter.html)*