---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:27:40Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/expand.html
title: expand • Akka core
---

# expand • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# expand

Like `extrapolate`, but does not have the `initial` argument, and the `Iterator` is also used in lieu of the original element, allowing for it to be rewritten and/or filtered.

[Backpressure aware operators](../index.html#backpressure-aware-operators)

## Signature

[`Source.expand`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html#expand(akka.japi.function.Function) "akka.stream.javadsl.Source")[`Source.expand`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html#expand[U](expander:Out=>Iterator[U]):FlowOps.this.Repr[U] "akka.stream.scaladsl.Source") [`Flow.expand`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html#expand(akka.japi.function.Function) "akka.stream.javadsl.Flow")[`Flow.expand`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html#expand[U](expander:Out=>Iterator[U]):FlowOps.this.Repr[U] "akka.stream.scaladsl.Flow")

## Description

Like `extrapolate`, but does not have the `initial` argument, and the `Iterator` is also used in lieu of the original element, allowing for it to be rewritten and/or filtered.

See [Understanding extrapolate and expand](../../stream-rate.html#understanding-extrapolate-and-expand) for more information and examples.

## Example

Imagine a streaming client decoding a video. It is possible the network bandwidth is a bit unreliable. It’s fine, as long as the audio remains fluent, it doesn’t matter if we can’t decode a frame or two (or more). But we also want to watermark every decoded frame with the name of our colleague. `expand` provides access to the element flowing through the stream and let’s us create extra frames in case the producer slows down:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/operators/sourceorflow/ExtrapolateAndExpand.scala#L60-L78 "Go to snippet source")// each element flowing through the stream is expanded to a watermark copy
// of the upstream frame and grayed out copies. The grayed out copies should
// only be used downstream if the producer is too slow.
val watermarkerRateControl: Flow[Frame, Frame, NotUsed] =
  Flow[Frame].expand((frame: Frame) => {
    val watermarked = frame.withFilter(Watermark)
    val grayedOut = frame.withFilter(Gray)
    (Iterator.single(watermarked) ++ Iterator.continually(grayedOut))
  })

val watermarkedVideoSource: Source[Frame, NotUsed] =
  networkSource.via(decode).via(rateControl)

// let's create a 25fps stream (a Frame every 40.millis)
val ticks: Source[Tick.type, Cancellable] = Source.tick(0.seconds, 40.millis, Tick)

val watermarkedVideoAt25Fps: Source[Frame, Cancellable] =
  ticks.zip(watermarkedVideoSource).map(_._2)

```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/operators/sourceorflow/ExtrapolateAndExpand.java#L65-L89 "Go to snippet source")// each element flowing through the stream is expanded to a watermark copy
// of the upstream frame and grayed out copies. The grayed out copies should
// only be used downstream if the producer is too slow.
Flow<Frame, Frame, NotUsed> watermarkerRateControl =
    Flow.of(Frame.class)
        .expand(
            lastFrame -> {
              Frame watermarked =
                  new Frame(
                      lastFrame.pixels().$plus$plus(ByteString.fromString(" - watermark")));
              Frame gray =
                  new Frame(lastFrame.pixels().$plus$plus(ByteString.fromString(" - gray")));
              return Stream.concat(Stream.of(watermarked), Stream.iterate(gray, i -> i))
                  .iterator();
            });

Source<Frame, NotUsed> watermakedVideoSource =
    networkSource.via(decode).via(watermarkerRateControl);

// let's create a 25fps stream (a Frame every 40.millis)
Source<String, Cancellable> ticks = Source.tick(Duration.ZERO, Duration.ofMillis(40), "tick");

Source<Frame, Cancellable> watermarkedVideoAt25Fps =
    ticks.zip(watermakedVideoSource).map(Pair::second);

```

## Reactive Streams semantics

**emits** when downstream stops backpressuring

**backpressures** when downstream backpressures

**completes** when upstream completes

## Code Examples

### Example 1: Example

```scala
// each element flowing through the stream is expanded to a watermark copy
// of the upstream frame and grayed out copies. The grayed out copies should
// only be used downstream if the producer is too slow.
val watermarkerRateControl: Flow[Frame, Frame, NotUsed] =
  Flow[Frame].expand((frame: Frame) => {
    val watermarked = frame.withFilter(Watermark)
    val grayedOut = frame.withFilter(Gray)
    (Iterator.single(watermarked) ++ Iterator.continually(grayedOut))
  })

val watermarkedVideoSource: Source[Frame, NotUsed] =
  networkSource.via(decode).via(rateControl)

// let's create a 25fps stream (a Frame every 40.millis)
val ticks: Source[Tick.type, Cancellable] = Source.tick(0.seconds, 40.millis, Tick)

val watermarkedVideoAt25Fps: Source[Frame, Cancellable] =
  ticks.zip(watermarkedVideoSource).map(_._2)
```

### Example 2: Example

```java
// each element flowing through the stream is expanded to a watermark copy
// of the upstream frame and grayed out copies. The grayed out copies should
// only be used downstream if the producer is too slow.
Flow<Frame, Frame, NotUsed> watermarkerRateControl =
    Flow.of(Frame.class)
        .expand(
            lastFrame -> {
              Frame watermarked =
                  new Frame(
                      lastFrame.pixels().$plus$plus(ByteString.fromString(" - watermark")));
              Frame gray =
                  new Frame(lastFrame.pixels().$plus$plus(ByteString.fromString(" - gray")));
              return Stream.concat(Stream.of(watermarked), Stream.iterate(gray, i -> i))
                  .iterator();
            });

Source<Frame, NotUsed> watermakedVideoSource =
    networkSource.via(decode).via(watermarkerRateControl);

// let's create a 25fps stream (a Frame every 40.millis)
Source<String, Cancellable> ticks = Source.tick(Duration.ZERO, Duration.ofMillis(40), "tick");

Source<Frame, Cancellable> watermarkedVideoAt25Fps =
    ticks.zip(watermakedVideoSource).map(Pair::second);
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/extrapolate.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/empty.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html
- https://doc.akka.io/libraries/akka-core/current/stream/stream-rate.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/expand.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/expand.html)*