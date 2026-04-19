---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:28:50Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/RetryFlow/withBackoffAndContext.html
title: RetryFlow.withBackoffAndContext • Akka core
---

# RetryFlow.withBackoffAndContext • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# RetryFlow.withBackoffAndContext

Wrap the given [`FlowWithContext`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/FlowWithContext.html "akka.stream.javadsl.FlowWithContext")[`FlowWithContext`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/FlowWithContext.html "akka.stream.scaladsl.FlowWithContext") and retry individual elements in that stream with an exponential backoff. A decider function tests every emitted element and can return a new element to be sent to the wrapped flow for another try.

[Error handling](../index.html#error-handling)

## Signature

[`RetryFlow.withBackoffAndContext`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/RetryFlow.html#withBackoffAndContext(java.time.Duration,java.time.Duration,double,int,akka.stream.javadsl.FlowWithContext,akka.japi.function.Function2) "akka.stream.javadsl.RetryFlow")[`RetryFlow.withBackoffAndContext`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/RetryFlow$.html#withBackoffAndContext[In,CtxIn,Out,CtxOut,Mat](minBackoff:scala.concurrent.duration.FiniteDuration,maxBackoff:scala.concurrent.duration.FiniteDuration,randomFactor:Double,maxRetries:Int,flow:akka.stream.scaladsl.FlowWithContext[In,CtxIn,Out,CtxOut,Mat])(decideRetry:((In,CtxIn),(Out,CtxOut))=>Option[(In,CtxIn)]):akka.stream.scaladsl.FlowWithContext[In,CtxIn,Out,CtxOut,Mat] "akka.stream.scaladsl.RetryFlow")

## Description

When an element is emitted by the wrapped `flow` it is passed to the `decideRetry` function, which may return an element to retry in the `flow`. 

The retry backoff is controlled by the `minBackoff`, `maxBackoff` and `randomFactor` parameters. At most `maxRetries` will be made after the initial try.

The wrapped `flow` must have **one\-in one\-out semantics**. It may not filter, nor duplicate elements. The `RetryFlow` will fail if two elements are emitted from the `flow`, it will be stuck “forever” if nothing is emitted. Just one element will be emitted into the `flow` at any time. The `flow` needs to emit an element before the next will be emitted to it. 

Elements are retried as long as `maxRetries` is not reached and the `decideRetry` function returns a new element to be sent to `flow`. The `decideRetry` function gets passed in the original element sent to the `flow` and the element emitted by it together with their contexts as tuples`akka.japi.Pair`s. When `decideRetry` returns `None``Optional.empty`, no retries will be issued, and the response will be emitted downstream.

Note
This API was added in Akka 2\.6\.0 and [may be changed](../../../common/may-change.html) in further patch releases.

This example wraps a `flow` handling `Int`s`Integer`s with `SomeContext` in context, and retries elements unless the result is 0 or negative, or `maxRetries` is hit.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-stream-tests/src/test/scala/akka/stream/scaladsl/RetryFlowSpec.scala#L174-L191 "Go to snippet source")val flow: FlowWithContext[Int, SomeContext, Int, SomeContext, NotUsed] = // ???

val retryFlow: FlowWithContext[Int, SomeContext, Int, SomeContext, NotUsed] =
  RetryFlow.withBackoffAndContext(
    minBackoff = 10.millis,
    maxBackoff = 5.seconds,
    randomFactor = 0d,
    maxRetries = 3,
    flow)(decideRetry = {
    case ((_, _), (result, ctx)) if result > 0 => Some(result -> ctx)
    case _                                     => None
  })
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-stream-tests/src/test/java/akka/stream/javadsl/RetryFlowTest.java#L122-L149 "Go to snippet source")FlowWithContext<Integer, SomeContext, Integer, SomeContext, NotUsed> flow = // ...
    // the wrapped flow

FlowWithContext<Integer, SomeContext, Integer, SomeContext, NotUsed> retryFlow =
    RetryFlow.withBackoffAndContext(
        minBackoff,
        maxBackoff,
        randomFactor,
        maxRetries,
        flow,
        (in, out) -> {
          Integer value = out.first();
          SomeContext context = out.second();
          if (value > 0) {
            return Optional.of(Pair.create(value, context));
          } else {
            return Optional.empty();
          }
        });
```

## Reactive Streams semantics

**emits** when the wrapped flow emits, and either `maxRetries` is reached or `decideRetry` returns `None``Optional.empty`

**backpressures** during backoff, when the wrapped flow backpressures, or when downstream backpressures

**completes** when upstream or the wrapped flow completes

**cancels** when downstream or the wrapped flow cancels

## Code Examples

### Example 1: Description

```scala
val flow: FlowWithContext[Int, SomeContext, Int, SomeContext, NotUsed] = // ???

val retryFlow: FlowWithContext[Int, SomeContext, Int, SomeContext, NotUsed] =
  RetryFlow.withBackoffAndContext(
    minBackoff = 10.millis,
    maxBackoff = 5.seconds,
    randomFactor = 0d,
    maxRetries = 3,
    flow)(decideRetry = {
    case ((_, _), (result, ctx)) if result > 0 => Some(result -> ctx)
    case _                                     => None
  })
```

### Example 2: Description

```java
FlowWithContext<Integer, SomeContext, Integer, SomeContext, NotUsed> flow = // ...
    // the wrapped flow

FlowWithContext<Integer, SomeContext, Integer, SomeContext, NotUsed> retryFlow =
    RetryFlow.withBackoffAndContext(
        minBackoff,
        maxBackoff,
        randomFactor,
        maxRetries,
        flow,
        (in, out) -> {
          Integer value = out.first();
          SomeContext context = out.second();
          if (value > 0) {
            return Optional.of(Pair.create(value, context));
          } else {
            return Optional.empty();
          }
        });
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/FlowWithContext.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/RetryFlow$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/FlowWithContext.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/RetryFlow.html
- https://doc.akka.io/libraries/akka-core/current/common/may-change.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/RetryFlow/withBackoff.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/zip.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/RetryFlow/withBackoffAndContext.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/RetryFlow/withBackoffAndContext.html)*