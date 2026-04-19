---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:15:37Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/Flow/completionStageFlow.html
title: Flow.completionStageFlow • Akka Documentation
---

# Flow.completionStageFlow • Akka Documentation

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

# Flow.completionStageFlow

Streams the elements through the given future flow once it successfully completes.

[Simple operators](../index.html#simple-operators)

## Signature

[`Flow.completionStageFlow`](https://doc.akka.io/japi/akka-core/2.6/akka/stream/javadsl/Flow.html#completionStageFlow(java.util.concurrent.CompletionStage) "akka.stream.javadsl.Flow")[`Flow.completionStageFlow`](https://doc.akka.io/api/akka-core/2.6/akka/stream/scaladsl/Flow$.html "akka.stream.scaladsl.Flow")

## Description

Streams the elements through the given flow once the `CompletionStage` successfully completes. If the future fails the stream fails.

## Examples

A deferred creation of the stream based on the initial element by combining `completionStageFlow` with `prefixAndTail` like so:

Scala

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-docs/src/test/java/jdocs/stream/operators/flow/FutureFlow.java#L21-L41 "Go to snippet source")CompletionStage<Flow<Integer, String, NotUsed>> processingFlow(int id) {
  return CompletableFuture.completedFuture(
      Flow.of(Integer.class).map(n -> "id: " + id + " value: " + n));
}

  Source<String, NotUsed> source =
      Source.range(1, 10)
          .prefixAndTail(1)
          .flatMapConcat(
              (pair) -> {
                List<Integer> head = pair.first();
                Source<Integer, NotUsed> tail = pair.second();

                int id = head.get(0);

                return tail.via(Flow.completionStageFlow(processingFlow(id)));
              });
```

## Reactive Streams semantics

**emits** when the internal flow is successfully created and it emits

**backpressures** when the internal flow is successfully created and it backpressures

**completes** when upstream completes and all elements have been emitted from the internal flow

**completes** when upstream completes and all futures have been completed and all elements have been emitted

## Code Examples

### Example 1: Examples

```java
CompletionStage<Flow<Integer, String, NotUsed>> processingFlow(int id) {
  return CompletableFuture.completedFuture(
      Flow.of(Integer.class).map(n -> "id: " + id + " value: " + n));
}

  Source<String, NotUsed> source =
      Source.range(1, 10)
          .prefixAndTail(1)
          .flatMapConcat(
              (pair) -> {
                List<Integer> head = pair.first();
                Source<Integer, NotUsed> tail = pair.second();

                int id = head.get(0);

                return tail.via(Flow.completionStageFlow(processingFlow(id)));
              });
```

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.6/akka/stream/scaladsl/Flow$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/stream/javadsl/Flow.html
- https://doc.akka.io/libraries/akka-core/2.6/stream/operators/Sink/completionStageSink.html
- https://doc.akka.io/libraries/akka-core/2.6/stream/operators/Source/completionStage.html
- https://doc.akka.io/libraries/akka-core/2.6/stream/operators/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/2.6/stream/operators/Flow/completionStageFlow.html](https://doc.akka.io/libraries/akka-core/2.6/stream/operators/Flow/completionStageFlow.html)*