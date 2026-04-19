---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:27:41Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/extrapolate.html
title: extrapolate • Akka core
---

# extrapolate • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# extrapolate

Allow for a faster downstream by expanding the last emitted element to an `Iterator`.

[Backpressure aware operators](../index.html#backpressure-aware-operators)

## Signature

[`Source.extrapolate`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html#extrapolate(akka.japi.function.Function,java.lang.Object) "akka.stream.javadsl.Source")[`Source.extrapolate`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html#extrapolate[U>:Out](extrapolator:U=>Iterator[U],initial:Option[U]):FlowOps.this.Repr[U] "akka.stream.scaladsl.Source") [`Flow.extrapolate`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html#extrapolate(akka.japi.function.Function,java.lang.Object) "akka.stream.javadsl.Flow")[`Flow.extrapolate`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html#extrapolate[U>:Out](extrapolator:U=>Iterator[U],initial:Option[U]):FlowOps.this.Repr[U] "akka.stream.scaladsl.Flow")

## Description

Allow for a faster downstream by expanding the last emitted element to an `Iterator`. For example, an `Iterator.continually(element)` will cause `extrapolate` to keep repeating the last emitted element. 

All original elements are always emitted unchanged \- the `Iterator` is only used whenever there is downstream demand before upstream emits a new element.

Includes an optional `initial` argument to prevent blocking the entire stream when there are multiple producers.

See [Understanding extrapolate and expand](../../stream-rate.html#understanding-extrapolate-and-expand) for more information and examples.

## Example

Imagine a videoconference client decoding a video feed from a colleague working remotely. It is possible the network bandwidth is a bit unreliable. It’s fine, as long as the audio remains fluent, it doesn’t matter if we can’t decode a frame or two (or more). When a frame is dropped, though, we want the UI to show the last frame decoded:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/operators/sourceorflow/ExtrapolateAndExpand.scala#L43-L56 "Go to snippet source")// if upstream is too slow, produce copies of the last frame but grayed out.
val rateControl: Flow[Frame, Frame, NotUsed] =
  Flow[Frame].extrapolate((frame: Frame) => {
    val grayedOut = frame.withFilter(Gray)
    Iterator.continually(grayedOut)
  }, Some(Frame.blackFrame))

val videoSource: Source[Frame, NotUsed] = networkSource.via(decode).via(rateControl)

// let's create a 25fps stream (a Frame every 40.millis)
val tickSource: Source[Tick.type, Cancellable] = Source.tick(0.seconds, 40.millis, Tick)

val videoAt25Fps: Source[Frame, Cancellable] =
  tickSource.zip(videoSource).map(_._2)
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/operators/sourceorflow/ExtrapolateAndExpand.java#L40-L61 "Go to snippet source")// if upstream is too slow, produce copies of the last frame but grayed out.
Flow<Frame, Frame, NotUsed> rateControl =
    Flow.of(Frame.class)
        .extrapolate(
            lastFrame -> {
              Frame gray =
                  new Frame(
                      ByteString.fromString(
                          "gray frame!! - " + lastFrame.pixels().utf8String()));
              return Stream.iterate(gray, i -> i).iterator();
            },
            BLACK_FRAME // initial value
            );

Source<Frame, NotUsed> videoSource = networkSource.via(decode).via(rateControl);

// let's create a 25fps stream (a Frame every 40.millis)
Source<String, Cancellable> tickSource =
    Source.tick(Duration.ZERO, Duration.ofMillis(40), "tick");

Source<Frame, Cancellable> videoAt25Fps = tickSource.zip(videoSource).map(Pair::second);

```

## Reactive Streams semantics

**emits** when downstream stops backpressuring

**backpressures** when downstream backpressures

**completes** when upstream completes

## Code Examples

### Example 1: Example

```scala
// if upstream is too slow, produce copies of the last frame but grayed out.
val rateControl: Flow[Frame, Frame, NotUsed] =
  Flow[Frame].extrapolate((frame: Frame) => {
    val grayedOut = frame.withFilter(Gray)
    Iterator.continually(grayedOut)
  }, Some(Frame.blackFrame))

val videoSource: Source[Frame, NotUsed] = networkSource.via(decode).via(rateControl)

// let's create a 25fps stream (a Frame every 40.millis)
val tickSource: Source[Tick.type, Cancellable] = Source.tick(0.seconds, 40.millis, Tick)

val videoAt25Fps: Source[Frame, Cancellable] =
  tickSource.zip(videoSource).map(_._2)
```

### Example 2: Example

```java
// if upstream is too slow, produce copies of the last frame but grayed out.
Flow<Frame, Frame, NotUsed> rateControl =
    Flow.of(Frame.class)
        .extrapolate(
            lastFrame -> {
              Frame gray =
                  new Frame(
                      ByteString.fromString(
                          "gray frame!! - " + lastFrame.pixels().utf8String()));
              return Stream.iterate(gray, i -> i).iterator();
            },
            BLACK_FRAME // initial value
            );

Source<Frame, NotUsed> videoSource = networkSource.via(decode).via(rateControl);

// let's create a 25fps stream (a Frame every 40.millis)
Source<String, Cancellable> tickSource =
    Source.tick(Duration.ZERO, Duration.ofMillis(40), "tick");

Source<Frame, Cancellable> videoAt25Fps = tickSource.zip(videoSource).map(Pair::second);
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/expand.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/failed.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html
- https://doc.akka.io/libraries/akka-core/current/stream/stream-rate.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/extrapolate.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/extrapolate.html)*