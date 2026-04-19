---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:27:45Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/completionTimeout.html
title: completionTimeout • Akka core
---

# completionTimeout • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# completionTimeout

If the completion of the stream does not happen until the provided timeout, the stream is failed with a `TimeoutException`.

[Time aware operators](../index.html#time-aware-operators)

## Signature

[`Source.completionTimeout`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html#completionTimeout(java.time.Duration) "akka.stream.javadsl.Source")[`Source.completionTimeout`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html#completionTimeout(timeout:scala.concurrent.duration.FiniteDuration):FlowOps.this.Repr[Out] "akka.stream.scaladsl.Source") [`Flow.completionTimeout`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html#completionTimeout(java.time.Duration) "akka.stream.javadsl.Flow")[`Flow.completionTimeout`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html#completionTimeout(timeout:scala.concurrent.duration.FiniteDuration):FlowOps.this.Repr[Out] "akka.stream.scaladsl.Flow")

## Description

If the completion of the stream does not happen until the provided timeout, the stream is failed with a `TimeoutException`.

## Example

This example reads the numbers from a source and do some calculation in the flow with a completion timeout of 10 milliseconds. It will fail the stream, leading to failing the materialized `Future` `CompletionStage` if the stream has not completed mapping the numbers from the source when the timeout hits.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/operators/sourceorflow/CompletionTimeout.scala#L19-L20 "Go to snippet source")val source = Source(1 to 10000).map(number => number * number)
source.completionTimeout(10.milliseconds).run()
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/operators/SourceOrFlow.java#L683-L685 "Go to snippet source")Source<Integer, NotUsed> source = Source.range(1, 100000).map(number -> number * number);
CompletionStage<Done> result = source.completionTimeout(Duration.ofMillis(10)).run(system);
return result;
```

## Reactive Streams semantics

**emits** when upstream emits an element

**backpressures** when downstream backpressures

**completes** when upstream completes or fails if timeout elapses before upstream completes

**cancels** when downstream cancels

## Code Examples

### Example 1: Example

```scala
val source = Source(1 to 10000).map(number => number * number)
source.completionTimeout(10.milliseconds).run()
```

### Example 2: Example

```java
Source<Integer, NotUsed> source = Source.range(1, 100000).map(number -> number * number);
CompletionStage<Done> result = source.completionTimeout(Duration.ofMillis(10)).run(system);
return result;
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/concat.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/completionStageSource.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/completionTimeout.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/completionTimeout.html)*