---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:26:59Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/queue.html
title: Source.queue • Akka core
---

# Source.queue • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Source.queue

Materialize a `BoundedSourceQueue` or `SourceQueue` onto which elements can be pushed for emitting from the source.

[Source operators](../index.html#source-operators)

## Signature (`BoundedSourceQueue`)

[`Source.queue`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html#queue(int) "akka.stream.javadsl.Source")[`Source.queue`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source$.html#queue[T](bufferSize:Int):akka.stream.scaladsl.Source[T,akka.stream.scaladsl.BoundedSourceQueue[T]] "akka.stream.scaladsl.Source")

## Description (`BoundedSourceQueue`)

The `BoundedSourceQueue` is an optimized variant of the `SourceQueue` with `OverflowStrategy.dropNew`. The `BoundedSourceQueue` will give immediate, synchronous feedback whether an element was accepted or not and is therefore recommended for situations where overload and dropping elements is expected and needs to be handled quickly.

In contrast, the `SourceQueue` offers more variety of `OverflowStrategies` but feedback is only asynchronously provided through a `Future``CompletionStage` value. In cases where elements need to be discarded quickly at times of overload to avoid out\-of\-memory situations, delivering feedback asynchronously can itself become a problem. This happens if elements come in faster than the feedback can be delivered in which case the feedback mechanism itself is part of the reason that an out\-of\-memory situation arises.

In summary, prefer `BoundedSourceQueue` over `SourceQueue` with `OverflowStrategy.dropNew` especially in high\-load scenarios. Use `SourceQueue` if you need one of the other `OverflowStrategies`.

The `BoundedSourceQueue` contains a buffer that can be used by many producers on different threads. When the buffer is full, the `BoundedSourceQueue` will not accept more elements. The return value of `BoundedSourceQueue.offer()` immediately returns a `QueueOfferResult` (as opposed to an asynchronous value returned by `SourceQueue`). A synchronous result is important in order to avoid situations where offer acknowledgements are handled slower than the rate of which elements are offered, which will eventually lead to an Out Of Memory error.

## Example (`BoundedSourceQueue`)

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/IntegrationDocSpec.scala#L497-L520 "Go to snippet source")val bufferSize = 1000

val queue = Source
  .queue[Int](bufferSize)
  .map(x => x * x)
  .toMat(Sink.foreach(x => println(s"completed $x")))(Keep.left)
  .run()

val fastElements = 1 to 10

fastElements.foreach { x =>
  queue.offer(x) match {
    case QueueOfferResult.Enqueued    => println(s"enqueued $x")
    case QueueOfferResult.Dropped     => println(s"dropped $x")
    case QueueOfferResult.Failure(ex) => println(s"Offer failed ${ex.getMessage}")
    case QueueOfferResult.QueueClosed => println("Source Queue closed")
  }
}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/IntegrationDocTest.java#L772-L799 "Go to snippet source")int bufferSize = 10;
int elementsToProcess = 5;

BoundedSourceQueue<Integer> sourceQueue =
    Source.<Integer>queue(bufferSize)
        .throttle(elementsToProcess, Duration.ofSeconds(3))
        .map(x -> x * x)
        .to(Sink.foreach(x -> System.out.println("got: " + x)))
        .run(system);

List<Integer> fastElements = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

fastElements.stream()
    .forEach(
        x -> {
          QueueOfferResult result = sourceQueue.offer(x);
          if (result == QueueOfferResult.enqueued()) {
            System.out.println("enqueued " + x);
          } else if (result == QueueOfferResult.dropped()) {
            System.out.println("dropped " + x);
          } else if (result instanceof QueueOfferResult.Failure) {
            QueueOfferResult.Failure failure = (QueueOfferResult.Failure) result;
            System.out.println("Offer failed " + failure.cause().getMessage());
          } else if (result instanceof QueueOfferResult.QueueClosed$) {
            System.out.println("Bounded Source Queue closed");
          }
        });

```

## Signature (`SourceQueue`)

[`Source.queue`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html#queue(int,akka.stream.OverflowStrategy) "akka.stream.javadsl.Source")[`Source.queue`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source$.html#queue[T](bufferSize:Int,overflowStrategy:akka.stream.OverflowStrategy):akka.stream.scaladsl.Source[T,akka.stream.scaladsl.SourceQueueWithComplete[T]] "akka.stream.scaladsl.Source") [`Source.queue`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html#queue(int,akka.stream.OverflowStrategy,int) "akka.stream.javadsl.Source")[`Source.queue`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source$.html#queue[T](bufferSize:Int,overflowStrategy:akka.stream.OverflowStrategy,maxConcurrentOffers:Int):akka.stream.scaladsl.Source[T,akka.stream.scaladsl.SourceQueueWithComplete[T]] "akka.stream.scaladsl.Source")

## Description (`SourceQueue`)

Materialize a `SourceQueue` onto which elements can be pushed for emitting from the source. The queue contains a buffer, if elements are pushed onto the queue faster than the source is consumed the overflow will be handled with a strategy specified by the user. Functionality for tracking when an element has been emitted is available through `SourceQueue.offer`.

Using `Source.queue` you can push elements to the queue and they will be emitted to the stream if there is demand from downstream, otherwise they will be buffered until request for demand is received. Elements in the buffer will be discarded if downstream is terminated.

In combination with the queue, the [`throttle`](../Source-or-Flow/throttle.html) operator can be used to control the processing to a given limit, e.g. `5 elements` per `3 seconds`.

## Example (`SourceQueue`)

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/IntegrationDocSpec.scala#L470-L491 "Go to snippet source")val bufferSize = 10
val elementsToProcess = 5

val queue = Source
  .queue[Int](bufferSize)
  .throttle(elementsToProcess, 3.second)
  .map(x => x * x)
  .toMat(Sink.foreach(x => println(s"completed $x")))(Keep.left)
  .run()

val source = Source(1 to 10)

source
  .map(x => {
    queue.offer(x).map {
      case QueueOfferResult.Enqueued    => println(s"enqueued $x")
      case QueueOfferResult.Dropped     => println(s"dropped $x")
      case QueueOfferResult.Failure(ex) => println(s"Offer failed ${ex.getMessage}")
      case QueueOfferResult.QueueClosed => println("Source Queue closed")
    }
  })
  .runWith(Sink.ignore)
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/IntegrationDocTest.java#L748-L761 "Go to snippet source")int bufferSize = 10;
int elementsToProcess = 5;

BoundedSourceQueue<Integer> sourceQueue =
    Source.<Integer>queue(bufferSize)
        .throttle(elementsToProcess, Duration.ofSeconds(3))
        .map(x -> x * x)
        .to(Sink.foreach(x -> System.out.println("got: " + x)))
        .run(system);

Source<Integer, NotUsed> source = Source.from(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

source.map(x -> sourceQueue.offer(x)).runWith(Sink.ignore(), system);

```

## Reactive Streams semantics

**emits** when there is demand and the queue contains elements

**completes** when downstream completes

## Code Examples

### Example 1: Example (BoundedSourceQueue)

```scala
val bufferSize = 1000

val queue = Source
  .queue[Int](bufferSize)
  .map(x => x * x)
  .toMat(Sink.foreach(x => println(s"completed $x")))(Keep.left)
  .run()

val fastElements = 1 to 10

fastElements.foreach { x =>
  queue.offer(x) match {
    case QueueOfferResult.Enqueued    => println(s"enqueued $x")
    case QueueOfferResult.Dropped     => println(s"dropped $x")
    case QueueOfferResult.Failure(ex) => println(s"Offer failed ${ex.getMessage}")
    case QueueOfferResult.QueueClosed => println("Source Queue closed")
  }
}
```

### Example 2: Example (BoundedSourceQueue)

```java
int bufferSize = 10;
int elementsToProcess = 5;

BoundedSourceQueue<Integer> sourceQueue =
    Source.<Integer>queue(bufferSize)
        .throttle(elementsToProcess, Duration.ofSeconds(3))
        .map(x -> x * x)
        .to(Sink.foreach(x -> System.out.println("got: " + x)))
        .run(system);

List<Integer> fastElements = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

fastElements.stream()
    .forEach(
        x -> {
          QueueOfferResult result = sourceQueue.offer(x);
          if (result == QueueOfferResult.enqueued()) {
            System.out.println("enqueued " + x);
          } else if (result == QueueOfferResult.dropped()) {
            System.out.println("dropped " + x);
          } else if (result instanceof QueueOfferResult.Failure) {
            QueueOfferResult.Failure failure = (QueueOfferResult.Failure) result;
            System.out.println("Offer failed " + failure.cause().getMessage());
          } else if (result instanceof QueueOfferResult.QueueClosed$) {
            System.out.println("Bounded Source Queue closed");
          }
        });
```

### Example 3: Example (SourceQueue)

```scala
val bufferSize = 10
val elementsToProcess = 5

val queue = Source
  .queue[Int](bufferSize)
  .throttle(elementsToProcess, 3.second)
  .map(x => x * x)
  .toMat(Sink.foreach(x => println(s"completed $x")))(Keep.left)
  .run()

val source = Source(1 to 10)

source
  .map(x => {
    queue.offer(x).map {
      case QueueOfferResult.Enqueued    => println(s"enqueued $x")
      case QueueOfferResult.Dropped     => println(s"dropped $x")
      case QueueOfferResult.Failure(ex) => println(s"Offer failed ${ex.getMessage}")
      case QueueOfferResult.QueueClosed => println("Source Queue closed")
    }
  })
  .runWith(Sink.ignore)
```

### Example 4: Example (SourceQueue)

```java
int bufferSize = 10;
int elementsToProcess = 5;

BoundedSourceQueue<Integer> sourceQueue =
    Source.<Integer>queue(bufferSize)
        .throttle(elementsToProcess, Duration.ofSeconds(3))
        .map(x -> x * x)
        .to(Sink.foreach(x -> System.out.println("got: " + x)))
        .run(system);

Source<Integer, NotUsed> source = Source.from(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

source.map(x -> sourceQueue.offer(x)).runWith(Sink.ignore(), system);
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Sink/queue.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/prependLazy.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/throttle.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/queue.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/queue.html)*