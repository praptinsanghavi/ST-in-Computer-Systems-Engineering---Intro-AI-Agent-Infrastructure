---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:27:33Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/throttle.html
title: throttle • Akka core
---

# throttle • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# throttle

Limit the throughput to a specific number of elements per time unit, or a specific total cost per time unit, where a function has to be provided to calculate the individual cost of each element.

[Simple operators](../index.html#simple-operators)

## Signature

[`Source.throttle`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html#throttle(int,java.time.Duration,int,akka.japi.function.Function,akka.stream.ThrottleMode) "akka.stream.javadsl.Source")[`Source.throttle`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html#throttle(cost:Int,per:scala.concurrent.duration.FiniteDuration,maximumBurst:Int,costCalculation:Out=>Int,mode:akka.stream.ThrottleMode):FlowOps.this.Repr[Out] "akka.stream.scaladsl.Source") [`Flow.throttle`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html#throttle(int,java.time.Duration,int,akka.japi.function.Function,akka.stream.ThrottleMode) "akka.stream.javadsl.Flow")[`Flow.throttle`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html#throttle(cost:Int,per:scala.concurrent.duration.FiniteDuration,maximumBurst:Int,costCalculation:Out=>Int,mode:akka.stream.ThrottleMode):FlowOps.this.Repr[Out] "akka.stream.scaladsl.Flow")

## Description

Limit the throughput to a specific number of elements per time unit, or a specific total cost per time unit, where a function has to be provided to calculate the individual cost of each element.

The throttle operator combines well with the [`queue`](../Source/queue.html) operator to adapt the speeds on both ends of the `queue`\-`throttle` pair.

See also [Buffers and working with rate](../../stream-rate.html) for related operators.

It is also possible to use the operator with [`ThrottleControl`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/ThrottleControl.html "akka.stream.javadsl.ThrottleControl")[`ThrottleControl`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/ThrottleControl.html "akka.stream.scaladsl.ThrottleControl"), which makes it possible to update the throttle rate from the outside of the stream and share the rate limit between several streams.

## Example

Imagine the server end of a streaming platform. When a client connects and request a video content, the server should return the content. Instead of serving a complete video as fast as bandwith allows, `throttle` can be used to limit the network usage to 24 frames per second (let’s imagine this streaming platform stores frames, not bytes).

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/operators/sourceorflow/Throttle.scala#L26-L30 "Go to snippet source")val framesPerSecond = 24

// val frameSource: Source[Frame,_]
val videoThrottling = frameSource.throttle(framesPerSecond, 1.second)
// serialize `Frame` and send over the network.
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/operators/sourceorflow/Throttle.java#L29-L33 "Go to snippet source")int framesPerSecond = 24;

Source<Frame, NotUsed> videoThrottling =
    frameSource.throttle(framesPerSecond, Duration.ofSeconds(1));
// serialize `Frame` and send over the network.
```

The problem in the example above is that when there’s a network hiccup, the video playback will interrupt. It can be improved by sending more content than the necessary ahead of time and let the client buffer that. So, `throttle` can be used to burst the first 30 seconds and then send a constant of 24 frames per second. This way, when a request comes in a good chunk of content will be downloaded and after that the server will activate the throttling.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/operators/sourceorflow/Throttle.scala#L34-L40 "Go to snippet source")// val frameSource: Source[Frame,_]
val videoThrottlingWithBurst = frameSource.throttle(
  framesPerSecond,
  1.second,
  framesPerSecond * 30, // maximumBurst
  ThrottleMode.Shaping)
// serialize `Frame` and send over the network.
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/operators/sourceorflow/Throttle.java#L37-L40 "Go to snippet source")Source<Frame, NotUsed> throttlingWithBurst =
    frameSource.throttle(
        framesPerSecond, Duration.ofSeconds(1), framesPerSecond * 30, ThrottleMode.shaping());
// serialize `Frame` and send over the network.
```

The extra argument to set the `ThrottleMode` to `shaping` tells `throttle` to make pauses to avoid exceeding the maximum rate. Alternatively we could set the throttling mode to cause a stream failure when upstream is faster than the throttle rate. 

The examples above don’t cover all the parameters supported by `throttle` (e.g. `cost`\-based throttling). See the [`api documentation`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html#throttle(int,java.time.Duration,int,akka.japi.function.Function,akka.stream.ThrottleMode) "akka.stream.javadsl.Flow")[`api documentation`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html#throttle(cost:Int,per:scala.concurrent.duration.FiniteDuration,maximumBurst:Int,costCalculation:Out=>Int,mode:akka.stream.ThrottleMode):FlowOps.this.Repr[Out] "akka.stream.scaladsl.Flow") for all the details.

## Reactive Streams semantics

**emits** when upstream emits an element and configured time per each element elapsed

**backpressures** when downstream backpressures

**completes** when upstream completes

## Code Examples

### Example 1: Example

```scala
val framesPerSecond = 24

// val frameSource: Source[Frame,_]
val videoThrottling = frameSource.throttle(framesPerSecond, 1.second)
// serialize `Frame` and send over the network.
```

### Example 2: Example

```java
int framesPerSecond = 24;

Source<Frame, NotUsed> videoThrottling =
    frameSource.throttle(framesPerSecond, Duration.ofSeconds(1));
// serialize `Frame` and send over the network.
```

### Example 3: Example

```scala
// val frameSource: Source[Frame,_]
val videoThrottlingWithBurst = frameSource.throttle(
  framesPerSecond,
  1.second,
  framesPerSecond * 30, // maximumBurst
  ThrottleMode.Shaping)
// serialize `Frame` and send over the network.
```

### Example 4: Example

```java
Source<Frame, NotUsed> throttlingWithBurst =
    frameSource.throttle(
        framesPerSecond, Duration.ofSeconds(1), framesPerSecond * 30, ThrottleMode.shaping());
// serialize `Frame` and send over the network.
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/ThrottleControl.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/ThrottleControl.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/takeWithin.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/queue.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/tick.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html
- https://doc.akka.io/libraries/akka-core/current/stream/stream-rate.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/throttle.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/throttle.html)*