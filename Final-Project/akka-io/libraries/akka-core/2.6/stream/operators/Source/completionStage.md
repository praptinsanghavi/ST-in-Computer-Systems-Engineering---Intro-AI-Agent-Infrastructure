---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:15:45Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/completionStage.html
title: Source.completionStage • Akka Documentation
---

# Source.completionStage • Akka Documentation

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

# Source.completionStage

Send the single value of the `CompletionStage` when it completes and there is demand.

[Source operators](../index.html#source-operators)

## Signature

[`Source.completionStage`](https://doc.akka.io/japi/akka-core/2.6/akka/stream/javadsl/Source.html#completionStage(java.util.concurrent.CompletionStage) "akka.stream.javadsl.Source")[`Source.completionStage`](https://doc.akka.io/api/akka-core/2.6/akka/stream/scaladsl/Source$.html#completionStage[T](completionStage:java.util.concurrent.CompletionStage[T]):akka.stream.scaladsl.Source[T,akka.NotUsed] "akka.stream.scaladsl.Source")

## Description

Send the single value of the `CompletionStage` when it completes and there is demand. If the `CompletionStage` completes with `null` stage is completed without emitting a value. If the `CompletionStage` fails the stream is failed with that exception.

For the corresponding operator for the Scala standard library `Future` see [future](future.html).

## Example

Java

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-docs/src/test/java/jdocs/stream/operators/source/FromCompletionStage.java#L8-L31 "Go to snippet source")import java.util.concurrent.CompletionStage;
import java.util.concurrent.CompletableFuture;

import akka.NotUsed;
import akka.Done;
import akka.actor.typed.ActorSystem;
import akka.stream.javadsl.*;

CompletionStage<Integer> stage = CompletableFuture.completedFuture(10);

Source<Integer, NotUsed> source = Source.completionStage(stage);

Sink<Integer, CompletionStage<Done>> sink = Sink.foreach(i -> System.out.println(i.toString()));

source.runWith(sink, system); // 10
```

## Reactive Streams semantics

**emits** the future completes

**completes** after the future has completed

## Code Examples

### Example 1: Example

```java
import java.util.concurrent.CompletionStage;
import java.util.concurrent.CompletableFuture;

import akka.NotUsed;
import akka.Done;
import akka.actor.typed.ActorSystem;
import akka.stream.javadsl.*;

CompletionStage<Integer> stage = CompletableFuture.completedFuture(10);

Source<Integer, NotUsed> source = Source.completionStage(stage);

Sink<Integer, CompletionStage<Done>> sink = Sink.foreach(i -> System.out.println(i.toString()));

source.runWith(sink, system); // 10
```

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.6/akka/stream/scaladsl/Source$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/stream/javadsl/Source.html
- https://doc.akka.io/libraries/akka-core/2.6/stream/operators/Flow/completionStageFlow.html
- https://doc.akka.io/libraries/akka-core/2.6/stream/operators/Sink/combine.html
- https://doc.akka.io/libraries/akka-core/2.6/stream/operators/Source/future.html
- https://doc.akka.io/libraries/akka-core/2.6/stream/operators/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/2.6/stream/operators/Source/completionStage.html](https://doc.akka.io/libraries/akka-core/2.6/stream/operators/Source/completionStage.html)*