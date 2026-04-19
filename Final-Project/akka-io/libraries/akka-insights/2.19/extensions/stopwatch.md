---
description: Telemetry for Lightbend Platform
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:23:55Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-insights/current//extensions/stopwatch.html
title: Stopwatch • Akka Insights
---

# Stopwatch • Akka Insights

> **Summary:** Telemetry for Lightbend Platform

## Content

# Stopwatch

Stopwatch provides a timer that follows asynchronous flows. A Stopwatch can be started in one actor (or Akka Stream operator, or Scala Future) and then flow through to others via message sends or asynchronous callbacks. You can use it to gather time metrics for “hot paths” within flows that cross multiple asynchronous boundaries. Intervals are marked programmatically with start and stop points within the application using an Akka extension Stopwatch API.

If you need to measure a synchronous block of code in nanoseconds use the [Custom metric timer utility](custom-metrics.html#custom-metric-timer-utility) instead.

Note
Stopwatch can provide a simplified form of tracing. See the [OpenTracing integration](opentracing/opentracing.html) for comprehensive distributed tracing.

## Enabling Stopwatch

Stopwatch is disabled by default, and needs to be enabled

```
cinnamon.stopwatch {
  enabled = true
}
```

## Stopwatch API

Time intervals are marked programmatically within your code using the Stopwatch API. It’s possible to have multiple Stopwatches active in the same message flow.

### Accessing Stopwatch

The import for `Stopwatch` is:

Scala

```
import com.lightbend.cinnamon.akka.Stopwatch
```

Java

```
import com.lightbend.cinnamon.akka.Stopwatch;

```

`Stopwatch` is an Akka extension and is accessed via the actor system. Within an actor, you can access the system via the context.

Scala

```
Stopwatch(context.system)
```

Java

```
Stopwatch.get(getContext().system());
```

### Accessing Stopwatch from Akka Typed

For Akka Typed, there is a separate extension that can be used with typed actor systems or actor contexts.

First add the Cinnamon Akka Typed module dependency to your build file:

sbt

```
libraryDependencies += Cinnamon.library.cinnamonAkkaTyped
```

Maven

```
<dependency>
  <groupId>com.lightbend.cinnamon</groupId>
  <artifactId>cinnamon-akka-typed_2.13</artifactId>
  <version>2.19.4</version>
</dependency>
```

Gradle

```
dependencies {
  implementation group: 'com.lightbend.cinnamon', name: 'cinnamon-akka-typed_2.13', version: '2.19.4'
}
```

Then import the typed extension for `Stopwatch`:

Scala

```
import com.lightbend.cinnamon.akka.typed.Stopwatch
```

Java

```
import com.lightbend.cinnamon.akka.typed.Stopwatch;
```

### Stopwatch start

Use the `start` method to name a Stopwatch, and to wrap message sends that will be included in the flow of the time interval measurement.

Scala

```
Stopwatch(context.system).start("my-stopwatch-name") {
  actor ! "message"
}
```

Java

```
Stopwatch.get(getContext().system())
    .start("my-stopwatch-name", () -> actor.tell("message", getSelf()));
```

### Stopwatch stop

Use the `stop` method to stop measuring elapsed time, marking the end of the interval. This can be at any point in the message flow that originates at the `start` marker. The `start` and `stop` names for the Stopwatch must be the same.

Scala

```
Stopwatch(context.system).stop("my-stopwatch-name")
```

Java

```
Stopwatch.get(getContext().system()).stop("my-stopwatch-name");
```

Time interval metrics will now be reported for the specified Stopwatch.

### Stopwatch example

Here’s an example of starting a Stopwatch in `ActorA` and then stopping the Stopwatch in `ActorB`, after some work has been completed:

```
import akka.actor.{ Actor, Props }
import com.lightbend.cinnamon.akka.Stopwatch

class ActorA extends Actor {
  val actorB = context.actorOf(Props(new ActorB), "b")
  def receive = {
    case "Begin" =>
      Stopwatch(context.system).start("my-stopwatch-name") {
        actorB.forward("DoWork")
      }
  }
}

class ActorB extends Actor {
  def receive = {
    case "DoWork" =>
      doSomeWork()
      Stopwatch(context.system).stop("my-stopwatch-name")
  }

  def doSomeWork(): Unit = ???
}
```

A metric *recorder* will be used to measure the distribution of interval times between the start and stop points.

## Active time

A stopwatch records the total elapsed time between the start and stop endpoints of a flow, and can also record the *active* time during the flow—the time spent actively in actor message processing, stream operators, or future callbacks, as compared with the time in actor mailboxes or waiting to be scheduled. Active time measurements are on by default, and can be disabled using this setting:

```
cinnamon.stopwatch {
  active-time = off
}
```

## Remote Stopwatch

A Stopwatch can flow across remote actors, and can start and stop on different remote nodes. Stopwatches started using the [Stopwatch API](stopwatch.html#stopwatch-api) will be automatically transferred across remote message sends.

Note
If a remote Stopwatch starts on one node and stops on a different node, then a modified approach to recording times is used, similar to pausing a physical stopwatch: when a remote message is sent, the current elapsed time is recorded and this is used to resume the Stopwatch on the receiving node. The time spent going over the wire is lost in this case, but all in\-process time is recorded. This is to avoid relying on synchronized wall time between nodes and issues with possible clock skew.

If a remote Stopwatch returns to the original node where the Stopwatch was started, then the interval time will be precisely the total time for the interval as seen by this node, including the network time between nodes.

## Stopwatch and Akka Streams

The [Stopwatch API](stopwatch.html#stopwatch-api) can be used with Akka Streams.

Because subsequent stream operations cannot be wrapped, use the `activate` method to start stopwatches within the scope of an Akka Stream operator, rather than the `start` method. For example:

```
val flow = source
  .map { value =>
    Stopwatch(system).activate("my-stopwatch-name")
    transform(value)
  }
  .mapAsync(4)(asyncTransform)
  .map { value =>
    val result = transform(value)
    Stopwatch(system).stop("my-stopwatch-name")
    result
  }
```

## Stopwatch and Futures

The [Stopwatch API](stopwatch.html#stopwatch-api) can be used with Scala Futures or Java CompletableFutures.

For example, when using the *ask pattern*, the query to the actor can be wrapped in a Stopwatch start:

Scala

```
val future = Stopwatch(system).start("my-stopwatch-name") {
  actor ? message
}
```

Java

```
CompletionStage future =
    Stopwatch.get(system)
        .start("my-stopwatch-name", () -> Patterns.ask(actor, message, timeout));
```

And then the Stopwatch can be stopped when the Future holding the response is completed:

Scala

```
future.onComplete { _ =>
  Stopwatch(system).stop("my-stopwatch-name")
}
```

Java

```
CompletionStage completed =
    future.thenRun(() -> Stopwatch.get(system).stop("my-stopwatch-name"));
```

Note
Akka Insights also provides alternative ways to collect metrics for [Ask\-Pattern](../instrumentations/akka/akka.html#ask-pattern-metrics), [Java](../instrumentations/java/java-futures.html) and [Scala](../instrumentations/scala/scala-futures.html) futures. They are slightly different in the way they are configured as well as the metrics they provide. Ask\-Pattern support doesn’t have any special API and requires only additional configuration whereas Java/Scala futures support doesn’t provide the total time metric but separate metrics for scheduling and processing times.

## Stopwatch and Akka Scheduler

The [Stopwatch API](stopwatch.html#stopwatch-api) can be used with Akka Scheduler.

For example, when using `scheduleOnce` to defer sending a message to an actor, it can be wrapped in a Stopwatch start:

Scala

```
Stopwatch(system).start("my-stopwatch-name") {
  system.scheduler.scheduleOnce(delay) {
    actor ! "DoWork"
  }
}
```

Java

```
Stopwatch.get(system)
    .start(
        "my-stopwatch-name",
        () ->
            system
                .getScheduler()
                .scheduleOnce(delay, () -> actor.tell("DoWork", sender), system.dispatcher()));
```

And then the Stopwatch can be stopped when the message is received and some work is done:

Scala

```
class WorkerActor extends Actor {
  override def receive: Receive = {
    case "DoWork" =>
      doSomeWork()
      Stopwatch(system).stop("my-stopwatch-name")
      sender() ! "Done"
  }
  def doSomeWork(): Unit = {
    // do some work
  }
}
```

Java

```
static class WorkerActor extends AbstractActor {

  @Override
  public Receive createReceive() {
    return ReceiveBuilder.create()
        .matchEquals(
            "DoWork",
            msg -> {
              doSomeWork();
              Stopwatch.get(getContext().getSystem()).stop("my-stopwatch-name");
              sender().tell("Done", getSelf());
            })
        .build();
  }

  private void doSomeWork() {
    // do some work
  }

}
```

## Stopwatch interval thresholds

Time interval thresholds can be configured for Stopwatches. An event will be reported whenever the given threshold is exceeded for a recorded interval.

Interval thresholds for Stopwatches are configured under `cinnamon.stopwatch.thresholds` keyed by Stopwatch name.

To generate threshold events if the “hot path” in the example above takes longer than 5 seconds, we can do so by defining the following setting:

```
cinnamon.stopwatch {
  thresholds {
    "my-stopwatch-name" = 5s
  }
}
```

## Stopwatch custom Recorder

It’s possible to configure a Stopwatch to use a custom recorder:

```
cinnamon.akka.meta.descriptor.stopwatch.stopwatch-time {
  hints = [ custom-recorder ]
}

cinnamon.akka.meta.descriptor.stopwatch.stopwatch-active-time {
  hints = [ custom-recorder ]
}
```

This allows you to configure the Stopwatch recorder depending on the backend:

- In Coda Hale it can be configured to use a custom histogram. See the [Coda Hale Metric hints](../plugins/chmetrics/configuration.html#metric-hints)
- In Prometheus it can be configured to use a custom Summary or even a Histogram instead of a Summary. The last is useful when you need to aggregate metrics because a Summary is in general not aggregatable. See the [Prometheus Histogram duration buckets](../plugins/prometheus/prometheus.html#histogram-duration-buckets).

## Code Examples

### Example 1: Enabling Stopwatch

```scala
cinnamon.stopwatch {
  enabled = true
}
```

### Example 2: Accessing Stopwatch

```scala
import com.lightbend.cinnamon.akka.Stopwatch
```

### Example 3: Accessing Stopwatch

```java
import com.lightbend.cinnamon.akka.Stopwatch;
```

### Example 4: Accessing Stopwatch

```scala
Stopwatch(context.system)
```

### Example 5: Accessing Stopwatch

```java
Stopwatch.get(getContext().system());
```

### Example 6: Accessing Stopwatch from Akka Typed

```sbt
libraryDependencies += Cinnamon.library.cinnamonAkkaTyped
```

### Example 7: Accessing Stopwatch from Akka Typed

```xml
<dependency>
  <groupId>com.lightbend.cinnamon</groupId>
  <artifactId>cinnamon-akka-typed_2.13</artifactId>
  <version>2.19.4</version>
</dependency>
```

### Example 8: Accessing Stopwatch from Akka Typed

```gradle
dependencies {
  implementation group: 'com.lightbend.cinnamon', name: 'cinnamon-akka-typed_2.13', version: '2.19.4'
}
```

### Example 9: Accessing Stopwatch from Akka Typed

```scala
import com.lightbend.cinnamon.akka.typed.Stopwatch
```

### Example 10: Accessing Stopwatch from Akka Typed

```java
import com.lightbend.cinnamon.akka.typed.Stopwatch;
```

### Example 11: Stopwatch start

```scala
Stopwatch(context.system).start("my-stopwatch-name") {
  actor ! "message"
}
```

### Example 12: Stopwatch start

```java
Stopwatch.get(getContext().system())
    .start("my-stopwatch-name", () -> actor.tell("message", getSelf()));
```

### Example 13: Stopwatch stop

```scala
Stopwatch(context.system).stop("my-stopwatch-name")
```

### Example 14: Stopwatch stop

```java
Stopwatch.get(getContext().system()).stop("my-stopwatch-name");
```

### Example 15: Stopwatch example

```scala
import akka.actor.{ Actor, Props }
import com.lightbend.cinnamon.akka.Stopwatch

class ActorA extends Actor {
  val actorB = context.actorOf(Props(new ActorB), "b")
  def receive = {
    case "Begin" =>
      Stopwatch(context.system).start("my-stopwatch-name") {
        actorB.forward("DoWork")
      }
  }
}

class ActorB extends Actor {
  def receive = {
    case "DoWork" =>
      doSomeWork()
      Stopwatch(context.system).stop("my-stopwatch-name")
  }

  def doSomeWork(): Unit = ???
}
```

### Example 16: Active time

```scala
cinnamon.stopwatch {
  active-time = off
}
```

### Example 17: Stopwatch and Akka Streams

```scala
val flow = source
  .map { value =>
    Stopwatch(system).activate("my-stopwatch-name")
    transform(value)
  }
  .mapAsync(4)(asyncTransform)
  .map { value =>
    val result = transform(value)
    Stopwatch(system).stop("my-stopwatch-name")
    result
  }
```

### Example 18: Stopwatch and Futures

```scala
val future = Stopwatch(system).start("my-stopwatch-name") {
  actor ? message
}
```

### Example 19: Stopwatch and Futures

```java
CompletionStage future =
    Stopwatch.get(system)
        .start("my-stopwatch-name", () -> Patterns.ask(actor, message, timeout));
```

### Example 20: Stopwatch and Futures

```scala
future.onComplete { _ =>
  Stopwatch(system).stop("my-stopwatch-name")
}
```

### Example 21: Stopwatch and Futures

```java
CompletionStage completed =
    future.thenRun(() -> Stopwatch.get(system).stop("my-stopwatch-name"));
```

### Example 22: Stopwatch and Akka Scheduler

```scala
Stopwatch(system).start("my-stopwatch-name") {
  system.scheduler.scheduleOnce(delay) {
    actor ! "DoWork"
  }
}
```

### Example 23: Stopwatch and Akka Scheduler

```java
Stopwatch.get(system)
    .start(
        "my-stopwatch-name",
        () ->
            system
                .getScheduler()
                .scheduleOnce(delay, () -> actor.tell("DoWork", sender), system.dispatcher()));
```

### Example 24: Stopwatch and Akka Scheduler

```scala
class WorkerActor extends Actor {
  override def receive: Receive = {
    case "DoWork" =>
      doSomeWork()
      Stopwatch(system).stop("my-stopwatch-name")
      sender() ! "Done"
  }
  def doSomeWork(): Unit = {
    // do some work
  }
}
```

### Example 25: Stopwatch and Akka Scheduler

```java
static class WorkerActor extends AbstractActor {

  @Override
  public Receive createReceive() {
    return ReceiveBuilder.create()
        .matchEquals(
            "DoWork",
            msg -> {
              doSomeWork();
              Stopwatch.get(getContext().getSystem()).stop("my-stopwatch-name");
              sender().tell("Done", getSelf());
            })
        .build();
  }

  private void doSomeWork() {
    // do some work
  }

}
```

### Example 26: Stopwatch interval thresholds

```scala
cinnamon.stopwatch {
  thresholds {
    "my-stopwatch-name" = 5s
  }
}
```

### Example 27: Stopwatch custom Recorder

```scala
cinnamon.akka.meta.descriptor.stopwatch.stopwatch-time {
  hints = [ custom-recorder ]
}

cinnamon.akka.meta.descriptor.stopwatch.stopwatch-active-time {
  hints = [ custom-recorder ]
}
```

## Related Pages (Internal Links)

- https://doc.akka.io/libraries/akka-insights/2.19/extensions/custom-metrics.html
- https://doc.akka.io/libraries/akka-insights/2.19/extensions/mdc.html
- https://doc.akka.io/libraries/akka-insights/2.19/extensions/opentracing/opentracing.html
- https://doc.akka.io/libraries/akka-insights/2.19/extensions/producers.html
- https://doc.akka.io/libraries/akka-insights/2.19/extensions/stopwatch.html
- https://doc.akka.io/libraries/akka-insights/2.19/instrumentations/akka/akka.html
- https://doc.akka.io/libraries/akka-insights/2.19/instrumentations/java/java-futures.html
- https://doc.akka.io/libraries/akka-insights/2.19/instrumentations/scala/scala-futures.html
- https://doc.akka.io/libraries/akka-insights/2.19/plugins/chmetrics/configuration.html
- https://doc.akka.io/libraries/akka-insights/2.19/plugins/prometheus/prometheus.html

---
*Source: [https://doc.akka.io/libraries/akka-insights/2.19/extensions/stopwatch.html](https://doc.akka.io/libraries/akka-insights/2.19/extensions/stopwatch.html)*