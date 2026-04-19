---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:28:34Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/monitor.html
title: monitor • Akka core
---

# monitor • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# monitor

Materializes to a `FlowMonitor` that monitors messages flowing through or completion of the operators.

[Watching status operators](../index.html#watching-status-operators)

## Signature

[`Source.monitor`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html#monitor() "akka.stream.javadsl.Source")[`Source.monitor`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html#monitor[Mat2]()(combine:(Mat,akka.stream.FlowMonitor[Out])=>Mat2):FlowOpsMat.this.ReprMat[Out,Mat2] "akka.stream.scaladsl.Source") [`Flow.monitor`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html#monitor() "akka.stream.javadsl.Flow")[`Flow.monitor`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html#monitor[Mat2]()(combine:(Mat,akka.stream.FlowMonitor[Out])=>Mat2):FlowOpsMat.this.ReprMat[Out,Mat2] "akka.stream.scaladsl.Flow")

## Description

Materializes to a `FlowMonitor` that monitors messages flowing through or completion of the stream. Elements pass through unchanged. Note that the `FlowMonitor` inserts a memory barrier every time it processes an event, and may therefore affect performance. The provided `FlowMonitor` contains a `state` field you can use to peek and get information about the stream. 

## Example

The example below uses the `monitorMat` variant of `monitor`. The only difference between the two operators is that `monitorMat` has a `combine` argument so we can decide which materialization value to keep. In the sample below be `Keep.right` so only the `FlowMonitor[Int]` is returned. 

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/operators/sourceorflow/Monitor.scala#L24-L47 "Go to snippet source")val source: Source[Int, NotUsed] =
  Source.fromIterator(() => Iterator.from(0))

def printMonitorState(flowMonitor: FlowMonitor[Int]) =
  flowMonitor.state match {
    case FlowMonitorState.Initialized =>
      println("Stream is initialized but hasn't processed any element")
    case FlowMonitorState.Received(msg) =>
      println(s"Last element processed: $msg")
    case FlowMonitorState.Failed(cause) =>
      println(s"Stream failed with cause $cause")
    case FlowMonitorState.Finished => println(s"Stream completed already")
  }

val monitoredSource: Source[Int, FlowMonitor[Int]] = source.take(6).throttle(5, 1.second).monitorMat(Keep.right)
val (flowMonitor, futureDone) =
  monitoredSource.toMat(Sink.foreach(println))(Keep.both).run()

// If we peek in the monitor too early, it's possible it was not initialized yet.
printMonitorState(flowMonitor)

// Periodically check the monitor
Source.tick(200.millis, 400.millis, "").runForeach(_ => printMonitorState(flowMonitor))

```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/operators/sourceorflow/Monitor.java#L25-L60 "Go to snippet source")private static <T> void printMonitorState(FlowMonitorState.StreamState<T> state) {
  if (state == FlowMonitorState.finished()) {
    System.out.println("Stream is initialized but hasn't processed any element");
  } else if (state instanceof FlowMonitorState.Received) {
    FlowMonitorState.Received msg = (FlowMonitorState.Received) state;
    System.out.println("Last message received: " + msg.msg());
  } else if (state instanceof FlowMonitorState.Failed) {
    Throwable cause = ((FlowMonitorState.Failed) state).cause();
    System.out.println("Stream failed with cause: " + cause.getMessage());
  } else {
    System.out.println("Stream completed already");
  }
}
  Source<Integer, FlowMonitor<Integer>> monitoredSource =
      Source.fromIterator(() -> Arrays.asList(0, 1, 2, 3, 4, 5).iterator())
          .throttle(5, Duration.ofSeconds(1))
          .monitorMat(Keep.right());

  Pair<FlowMonitor<Integer>, CompletionStage<Done>> run =
      monitoredSource.toMat(Sink.foreach(System.out::println), Keep.both()).run(actorSystem);

  FlowMonitor<Integer> monitor = run.first();

  // If we peek in the monitor too early, it's possible it was not initialized yet.
  printMonitorState(monitor.state());

  // Periodically check the monitor
  Source.tick(Duration.ofMillis(200), Duration.ofMillis(400), "")
      .runForeach(__ -> printMonitorState(monitor.state()), actorSystem);
```

When run, the sample code will produce something similar to:

```
Stream is initialized but hasn't processed any element
0
1
2
Last element processed: 2
3
4
5
Stream completed already

```

## Reactive Streams semantics

**emits** when upstream emits an element

**backpressures** when downstream **backpressures**

**completes** when upstream completes

## Code Examples

### Example 1: Example

```scala
val source: Source[Int, NotUsed] =
  Source.fromIterator(() => Iterator.from(0))

def printMonitorState(flowMonitor: FlowMonitor[Int]) =
  flowMonitor.state match {
    case FlowMonitorState.Initialized =>
      println("Stream is initialized but hasn't processed any element")
    case FlowMonitorState.Received(msg) =>
      println(s"Last element processed: $msg")
    case FlowMonitorState.Failed(cause) =>
      println(s"Stream failed with cause $cause")
    case FlowMonitorState.Finished => println(s"Stream completed already")
  }

val monitoredSource: Source[Int, FlowMonitor[Int]] = source.take(6).throttle(5, 1.second).monitorMat(Keep.right)
val (flowMonitor, futureDone) =
  monitoredSource.toMat(Sink.foreach(println))(Keep.both).run()

// If we peek in the monitor too early, it's possible it was not initialized yet.
printMonitorState(flowMonitor)

// Periodically check the monitor
Source.tick(200.millis, 400.millis, "").runForeach(_ => printMonitorState(flowMonitor))
```

### Example 2: Example

```java
private static <T> void printMonitorState(FlowMonitorState.StreamState<T> state) {
  if (state == FlowMonitorState.finished()) {
    System.out.println("Stream is initialized but hasn't processed any element");
  } else if (state instanceof FlowMonitorState.Received) {
    FlowMonitorState.Received msg = (FlowMonitorState.Received) state;
    System.out.println("Last message received: " + msg.msg());
  } else if (state instanceof FlowMonitorState.Failed) {
    Throwable cause = ((FlowMonitorState.Failed) state).cause();
    System.out.println("Stream failed with cause: " + cause.getMessage());
  } else {
    System.out.println("Stream completed already");
  }
}
  Source<Integer, FlowMonitor<Integer>> monitoredSource =
      Source.fromIterator(() -> Arrays.asList(0, 1, 2, 3, 4, 5).iterator())
          .throttle(5, Duration.ofSeconds(1))
          .monitorMat(Keep.right());

  Pair<FlowMonitor<Integer>, CompletionStage<Done>> run =
      monitoredSource.toMat(Sink.foreach(System.out::println), Keep.both()).run(actorSystem);

  FlowMonitor<Integer> monitor = run.first();

  // If we peek in the monitor too early, it's possible it was not initialized yet.
  printMonitorState(monitor.state());

  // Periodically check the monitor
  Source.tick(Duration.ofMillis(200), Duration.ofMillis(400), "")
      .runForeach(__ -> printMonitorState(monitor.state()), actorSystem);
```

### Example 3: Example

```text
Stream is initialized but hasn't processed any element
0
1
2
Last element processed: 2
3
4
5
Stream completed already
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/mergeSorted.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/never.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/monitor.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/monitor.html)*