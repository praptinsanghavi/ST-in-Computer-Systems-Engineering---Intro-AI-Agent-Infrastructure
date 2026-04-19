---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:26:54Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/future.html
title: Source.future • Akka core
---

# Source.future • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Source.future

Send the single value of the `Future` when it completes and there is demand.

[Source operators](../index.html#source-operators)

## Signature

[`Source.future`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html "akka.stream.javadsl.Source")[`Source.future`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source$.html#future[T](futureElement:scala.concurrent.Future[T]):akka.stream.scaladsl.Source[T,akka.NotUsed] "akka.stream.scaladsl.Source")

## Description

Send the single value of the `Future` when it completes and there is demand. If the future fails the stream is failed with that exception.

For the corresponding operator for the Java standard library `CompletionStage` see [completionStage](completionStage.html).

## Example

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/operators/SourceOperators.scala#L19-L28 "Go to snippet source")  
import akka.stream.scaladsl._
import akka.{ Done, NotUsed }

import scala.concurrent.Future

val source: Source[Int, NotUsed] = Source.future(Future.successful(10))
val sink: Sink[Int, Future[Done]] = Sink.foreach((i: Int) => println(i))

val done: Future[Done] = source.runWith(sink) //10
```

## Reactive Streams semantics

**emits** the future completes

**completes** after the future has completed

## Code Examples

### Example 1: Example

```scala
import akka.stream.scaladsl._
import akka.{ Done, NotUsed }

import scala.concurrent.Future

val source: Source[Int, NotUsed] = Source.future(Future.successful(10))
val sink: Sink[Int, Future[Done]] = Sink.foreach((i: Int) => println(i))

val done: Future[Done] = source.runWith(sink) //10
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Flow/futureFlow.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Sink/fromSubscriber.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/completionStage.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/future.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/future.html)*