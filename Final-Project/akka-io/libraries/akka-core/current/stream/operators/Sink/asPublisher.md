---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:27:03Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/Sink/asPublisher.html
title: Sink.asPublisher • Akka core
---

# Sink.asPublisher • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Sink.asPublisher

Integration with Reactive Streams, materializes into a `org.reactivestreams.Publisher`.

[Sink operators](../index.html#sink-operators)

## Signature

[`Sink.asPublisher`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Sink.html#asPublisher(akka.stream.javadsl.AsPublisher) "akka.stream.javadsl.Sink")[`Sink.asPublisher`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Sink$.html#asPublisher[T](fanout:Boolean):akka.stream.scaladsl.Sink[T,org.reactivestreams.Publisher[T]] "akka.stream.scaladsl.Sink")

## Description

This method gives you the capability to publish the data from the `Sink` through a Reactive Streams [Publisher](https://www.reactive-streams.org/reactive-streams-1.0.3-javadoc/org/reactivestreams/Publisher.html). Generally, in Akka Streams a `Sink` is considered a subscriber, which consumes the data from source. To integrate with other Reactive Stream implementations `Sink.asPublisher` provides a `Publisher` materialized value when run. Now, the data from this publisher can be consumed by subscribing to it. We can control if we allow more than one downstream subscriber from the single running Akka stream through the `fanout` parameter. In Java 9, the Reactive Stream API was included in the JDK, and `Publisher` is available through [Flow.Publisher](https://docs.oracle.com/javase/9/docs/api/java/util/concurrent/Flow.Publisher.html). Since those APIs are identical but exist at different package namespaces and does not depend on the Reactive Streams package a separate publisher sink for those is available through `akka.stream.scaladsl.JavaFlowSupport.Sink#asPublisher``akka.stream.javadsl.JavaFlowSupport.Sink#asPublisher`.

## Example

In the example we are using a source and then creating a Publisher. After that, we see that when `fanout` is true multiple subscribers can subscribe to it, but when it is false only the first subscriber will be able to subscribe and others will be rejected.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/operators/sink/AsPublisher.scala#L20-L26 "Go to snippet source")val source = Source(1 to 5)

val publisher = source.runWith(Sink.asPublisher(false))
Source.fromPublisher(publisher).runWith(Sink.foreach(println)) // 1 2 3 4 5
Source
  .fromPublisher(publisher)
  .runWith(Sink.foreach(println)) //No output, because the source was not able to subscribe to the publisher.
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/operators/SinkDocExamples.java#L143-L157 "Go to snippet source")Source<Integer, NotUsed> source = Source.range(1, 5);

Publisher<Integer> publisherFalse =
    source.runWith(Sink.asPublisher(AsPublisher.WITHOUT_FANOUT), system);
CompletionStage<Integer> resultFromFirstSubscriberFalse =
    Source.fromPublisher(publisherFalse)
        .runWith(Sink.fold(0, (acc, element) -> acc + element), system);
CompletionStage<Integer> resultFromSecondSubscriberFalse =
    Source.fromPublisher(publisherFalse)
        .runWith(Sink.fold(1, (acc, element) -> acc * element), system);

resultFromFirstSubscriberFalse.thenAccept(System.out::println); // 15
resultFromSecondSubscriberFalse.thenAccept(
    System.out
        ::println); // No output, because the source was not able to subscribe to the publisher.
```

## Reactive Streams semantics

**emits** the materialized publisher

**completes** after the source is consumed and materialized publisher is created

## Code Examples

### Example 1: Example

```scala
val source = Source(1 to 5)

val publisher = source.runWith(Sink.asPublisher(false))
Source.fromPublisher(publisher).runWith(Sink.foreach(println)) // 1 2 3 4 5
Source
  .fromPublisher(publisher)
  .runWith(Sink.foreach(println)) //No output, because the source was not able to subscribe to the publisher.
```

### Example 2: Example

```java
Source<Integer, NotUsed> source = Source.range(1, 5);

Publisher<Integer> publisherFalse =
    source.runWith(Sink.asPublisher(AsPublisher.WITHOUT_FANOUT), system);
CompletionStage<Integer> resultFromFirstSubscriberFalse =
    Source.fromPublisher(publisherFalse)
        .runWith(Sink.fold(0, (acc, element) -> acc + element), system);
CompletionStage<Integer> resultFromSecondSubscriberFalse =
    Source.fromPublisher(publisherFalse)
        .runWith(Sink.fold(1, (acc, element) -> acc * element), system);

resultFromFirstSubscriberFalse.thenAccept(System.out::println); // 15
resultFromSecondSubscriberFalse.thenAccept(
    System.out
        ::println); // No output, because the source was not able to subscribe to the publisher.
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Sink$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Sink.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/asSourceWithContext.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/StreamConverters/asOutputStream.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/Sink/asPublisher.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/Sink/asPublisher.html)*