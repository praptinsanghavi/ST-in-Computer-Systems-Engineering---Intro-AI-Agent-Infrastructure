---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:27:18Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/Flow/completionStageFlow.html
title: Flow.completionStageFlow • Akka core
---

# Flow.completionStageFlow • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Flow.completionStageFlow

Streams the elements through the given future flow once it successfully completes.

[Simple operators](../index.html#simple-operators)

## Signature

[`Flow.completionStageFlow`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html#completionStageFlow(java.util.concurrent.CompletionStage) "akka.stream.javadsl.Flow")[`Flow.completionStageFlow`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow$.html "akka.stream.scaladsl.Flow")

## Description

Streams the elements through the given flow once the `CompletionStage` successfully completes. If the future fails the stream fails.

## Examples

A deferred creation of the stream based on the initial element by combining `completionStageFlow` with `prefixAndTail` like so:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/operators/flow/FutureFlow.java#L20-L40 "Go to snippet source")CompletionStage<Flow<Integer, String, NotUsed>> processingFlow(int id) {
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

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Sink/completionStageSink.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/completionStage.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/Flow/completionStageFlow.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/Flow/completionStageFlow.html)*