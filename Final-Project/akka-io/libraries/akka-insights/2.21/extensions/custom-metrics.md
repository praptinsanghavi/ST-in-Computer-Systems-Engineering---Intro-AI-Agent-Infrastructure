---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:24:17Z'
section: libraries
site: akka-io
source_url: /extensions/custom-metrics.html
title: Custom metrics • Akka Insights
---

# Custom metrics • Akka Insights

## Content

# Custom metrics

The [`custom metrics extension`](../reference/api/javadoc/?com/lightbend/cinnamon/akka/CinnamonMetrics.html "com.lightbend.cinnamon.akka.CinnamonMetrics") provides an API whereby a developer can create one of six custom metric types for capturing arbitrary metric data. Also, the API provides the ability to create the custom metrics at the *system\-level*, the *actor\-level*, or the *application\-level*. For example, at the *actor\-level*, you could build and use a `Counter` metric to capture the number of times an actor receives a particular message.

## Custom metric types

The custom metric types we currently support are as follows:

- Counter: provides an integer to increment and decrement.
- Gauge Double: provides a settable double.
- Gauge Long: provides a settable long value.
- Providing Gauge Long: takes a `LongValueProvider` as the underlying metric.
- Providing Gauge Double: takes a `DoubleValueProvider` as the underlying metric.
- Rate: marks an occurrence for measuring the rate at which it occurs.
- Recorder: records a long value which can be used to measure distribution.

The underlying behavior of the metric type is defined by the backend used in configuration. For example, if you use `chmetrics` as your backend, then the underlying metric for a `Recorder` is a CodaHale `Histogram`. For more information on backends see [Backend Plugins](../plugins/plugins.html).

## Developer API

### Accessing CinnamonMetrics

To start using the [`Cinnamon developer API`](../reference/api/javadoc/?com/lightbend/cinnamon/akka/CinnamonMetrics.html "com.lightbend.cinnamon.akka.CinnamonMetrics") you will first want to import `CinnamonMetrics` and the associated metric interfaces:

Scala

```
import com.lightbend.cinnamon.akka.CinnamonMetrics
import com.lightbend.cinnamon.metric._

```

Java

```
import com.lightbend.cinnamon.akka.CinnamonMetrics;
import com.lightbend.cinnamon.metric.*;
```

### Accessing CinnamonMetrics from Akka Typed

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
  <version>2.21.4</version>
</dependency>
```

Gradle

```
dependencies {
  implementation group: 'com.lightbend.cinnamon', name: 'cinnamon-akka-typed_2.13', version: '2.21.4'
}
```

Then import the typed extension for `CinnamonMetrics`:

Scala

```
import com.lightbend.cinnamon.akka.typed.CinnamonMetrics
import com.lightbend.cinnamon.metric._
```

Java

```
import com.lightbend.cinnamon.akka.typed.CinnamonMetrics;
import com.lightbend.cinnamon.metric.*;
```

### Creating system\-level custom metrics

System level custom metrics provide an excellent way to capture metric data at the `ActorSystem` level. To create custom metrics at this level, you use `CinnamonMetrics` with the `ActorSystem` and call the appropriate *create\-method* for the desired metric as follows:

Scala

```
val sysCounter: Counter = CinnamonMetrics(system).createCounter("sysCounter")
val sysGaugeDouble: GaugeDouble = CinnamonMetrics(system).createGaugeDouble("sysGaugeDouble")
val sysGaugeLong: GaugeLong = CinnamonMetrics(system).createGaugeLong("sysGaugeLong")
val sysProvidingGaugeDouble: ProvidingGaugeDouble = CinnamonMetrics(system).createProvidingGaugeDouble("sysProvidingGaugeDouble", doubleValueProvider)
val sysProvidingGaugeLong: ProvidingGaugeLong = CinnamonMetrics(system).createProvidingGaugeLong("sysProvidingGaugeLong", longValueProvider)
val sysRate: Rate = CinnamonMetrics(system).createRate("sysRate")
val sysRecorder: Recorder = CinnamonMetrics(system).createRecorder("sysRecorder")
```

Java

```
Counter sysCounter = CinnamonMetrics.get(getSystem()).createCounter("sysCounter");
GaugeDouble sysGaugeDouble = CinnamonMetrics.get(getSystem()).createGaugeDouble("sysGaugeDouble");
GaugeLong sysGaugeLong = CinnamonMetrics.get(getSystem()).createGaugeLong("sysGaugeLong");
ProvidingGaugeDouble sysProvidingGaugeDouble =
    CinnamonMetrics.get(getSystem())
        .createProvidingGaugeDouble("sysProvidingGaugeDouble", doubleValueProvider);
ProvidingGaugeLong sysProvidingGaugeLong =
    CinnamonMetrics.get(getSystem())
        .createProvidingGaugeLong("sysProvidingGaugeLong", longValueProvider);
Rate sysRate = CinnamonMetrics.get(getSystem()).createRate("sysRate");
Recorder sysRecorder = CinnamonMetrics.get(getSystem()).createRecorder("sysRecorder");
```

### Creating actor\-level custom metrics

Actor level custom metrics provide an excellent way to capture actor\-specific behavior as metric data. To create custom metrics at this level, you use `CinnamonMetrics` with the `ActorContext` and call the appropriate *create\-method* for the desired metric as follows:

Scala

```
val counter: Counter = CinnamonMetrics(context).createCounter("counter")
val gaugeDouble: GaugeDouble = CinnamonMetrics(context).createGaugeDouble("gaugeDouble")
val gaugeLong: GaugeLong = CinnamonMetrics(context).createGaugeLong("gaugeLong")
val providingGaugeDouble: ProvidingGaugeDouble = CinnamonMetrics(context).createProvidingGaugeDouble("providingGaugeDouble", doubleValueProvider)
val providingGaugeLong: ProvidingGaugeLong = CinnamonMetrics(context).createProvidingGaugeLong("providingGaugeLong", longValueProvider)
val rate: Rate = CinnamonMetrics(context).createRate("rate")
val recorder: Recorder = CinnamonMetrics(context).createRecorder("recorder")
```

Java

```
Counter counter = CinnamonMetrics.get(getContext()).createCounter("counter");
GaugeDouble gaugeDouble = CinnamonMetrics.get(getContext()).createGaugeDouble("gaugeDouble");
GaugeLong gaugeLong = CinnamonMetrics.get(getContext()).createGaugeLong("gaugeLong");
ProvidingGaugeDouble providingGaugeDouble =
    CinnamonMetrics.get(getContext())
        .createProvidingGaugeDouble("providingGaugeDouble", doubleValueProvider);
ProvidingGaugeLong providingGaugeLong =
    CinnamonMetrics.get(getContext())
        .createProvidingGaugeLong("providingGaugeLong", longValueProvider);
Rate rate = CinnamonMetrics.get(getContext()).createRate("rate");
Recorder recorder = CinnamonMetrics.get(getContext()).createRecorder("recorder");
```

#### Aggregation style

Custom metrics on the actor\-level are aggregated in the same way as Akka Insights actor metrics.

For example if `report-by = class` is configured for a specific actor then any custom metrics created in this actor will be aggregated by actor class. And the same goes for `instance` and `group` aggregation. More information about how to configure actor aggregation can be found [here](../instrumentations/akka/actors.html).

### Creating application\-level custom metrics

Application level custom metrics are associated with the application as a whole, rather than with the actor system. See [Cinnamon metadata](../plugins/plugins.html#cinnamon-metadata) for setting the application name. To create custom metrics at the application level, you first need to use the `CinnamonMetrics` extension with the `ActorSystem` or with the `ActorContext`, and then access the application\-level metrics using the `metricsForApplication` method. You can then call the appropriate *create* method to create custom metrics:

Scala

```
val appMetrics = CinnamonMetrics(system).metricsForApplication()

val appCounter: Counter = appMetrics.createCounter("appCounter")
val appGaugeDouble: GaugeDouble = appMetrics.createGaugeDouble("appGaugeDouble")
val appGaugeLong: GaugeLong = appMetrics.createGaugeLong("appGaugeLong")
val appProvidingGaugeDouble: ProvidingGaugeDouble = appMetrics.createProvidingGaugeDouble("appProvidingGaugeDouble", doubleValueProvider)
val appProvidingGaugeLong: ProvidingGaugeLong = appMetrics.createProvidingGaugeLong("appProvidingGaugeLong", longValueProvider)
val appRate: Rate = appMetrics.createRate("appRate")
val appRecorder: Recorder = appMetrics.createRecorder("appRecorder")
```

Java

```
CinnamonMetrics appMetrics = CinnamonMetrics.get(getSystem()).metricsForApplication();

Counter appCounter = appMetrics.createCounter("appCounter");
GaugeDouble appGaugeDouble = appMetrics.createGaugeDouble("appGaugeDouble");
GaugeLong appGaugeLong = appMetrics.createGaugeLong("appGaugeLong");
ProvidingGaugeDouble appProvidingGaugeDouble =
    appMetrics.createProvidingGaugeDouble("appProvidingGaugeDouble", doubleValueProvider);
ProvidingGaugeLong appProvidingGaugeLong =
    appMetrics.createProvidingGaugeLong("appProvidingGaugeLong", longValueProvider);
Rate appRate = appMetrics.createRate("appRate");
Recorder appRecorder = appMetrics.createRecorder("appRecorder");
```

### Adding tags to custom metrics

Tags can be added to custom metrics by passing a map of tags to the metric *create\-method*. For example:

Scala

```
val taggedRecorder: Recorder = CinnamonMetrics(context).createRecorder("tagged-recorder", tags = Map("key" -> "value"))
```

Java

```
Map<String, String> tags = ImmutableMap.of("key", "value");
Recorder taggedRecorder =
    CinnamonMetrics.get(getContext()).createRecorder("tagged-recorder", tags);

```

### ProvidingGaugeLong and ProvidingGaugeDouble value providers

In the examples above you will note that the `ProvidingGaugeLong` takes an additional parameter, `provider`. The `ProvidingGaugeLong` is a special custom metric that takes an external provider of a `Long` value and reports that value when asked by the underlying metrics backend.

Scala

```
val longValueProvider: LongValueProvider = new LongValueProvider {
  val cnt: AtomicLong = new AtomicLong(0)
  override def currentValue(): Long = cnt.getAndIncrement()
}
```

Java

```
LongValueProvider longValueProvider =
    new LongValueProvider() {
      AtomicLong cnt = new AtomicLong(0);

      @Override
      public long currentValue() {
        return cnt.getAndIncrement();
      }
    };
```

There is also a `ProvidingGaugeDouble` that can be used:

Scala

```
val doubleValueProvider: DoubleValueProvider = new DoubleValueProvider {
  val cnt: AtomicReference[Double] = new AtomicReference(0.0)
  override def currentValue(): Double = cnt.get()
}
```

Java

```
DoubleValueProvider doubleValueProvider =
    new DoubleValueProvider() {
      AtomicReference<Double> cnt = new AtomicReference(0.0);

      @Override
      public double currentValue() {
        return cnt.get();
      }
    };
```

### Using custom metrics

Using the custom metrics involves calling one of the methods supplied by the metric interface as follows:

Scala

```
counter.increment()

counter.decrement()

gaugeDouble.set(4.2)

gaugeLong.set(12L)

rate.mark()

recorder.record(42L)
```

Java

```
counter.increment();

counter.decrement();

gaugeDouble.set(4.2);

gaugeLong.set(12L);

rate.mark();

recorder.record(42L);
```

### Destroying custom metrics

When finished with the metric(s), you should call `destroy`. Calling `destroy` will, in turn, invoke the underlying metric backend to run any cleanup tasks if required.

Scala

```
counter.destroy()

gaugeDouble.destroy()

gaugeLong.destroy()

providingGaugeLong.destroy()

providingGaugeDouble.destroy()

rate.destroy()

recorder.destroy()
```

Java

```
counter.destroy();

gaugeDouble.destroy();

gaugeLong.destroy();

providingGaugeDouble.destroy();

providingGaugeLong.destroy();

rate.destroy();

recorder.destroy();
```

### Custom metric timer utility

In addition to the custom metric types, the developer API also provides a timer utility which you can use to time a block of code in nanoseconds. The elapsed time for the code block to run is captured to an underlying `Recorder` with the name used in the `createTimer(...)` method.

Scala

```
val timer: Timer = CinnamonMetrics(context).createTimer("timer")

timer.time { 1 to 10000 sum }
```

Java

```
Timer timer = CinnamonMetrics.get(getContext()).createTimer("timer");

timer.time(() -> IntStream.rangeClosed(1, 100000).sum());
```

For a timer that can be used over asynchronous flows, such as across actors, see the [Stopwatch extension](stopwatch.html).

### Custom metric example

Here is an example of *actor\-level* custom metrics by using a `Counter` to keep track of particular messages that an actor might receive.

```
import com.lightbend.cinnamon.akka.CinnamonMetrics
import com.lightbend.cinnamon.metric._

case object Init
case object In
case object Out
case object Done

class CustomerCountActor extends Actor {
  val counter: Counter = CinnamonMetrics(context).createCounter("customerCounter")

  def receive: PartialFunction[Any, Unit] = {
    case Init =>
      sender() ! Init
    case In =>
      counter.increment()
      sender() ! In
    case Out =>
      counter.decrement()
      sender() ! Out
    case Done =>
      counter.destroy()
      sender() ! Done
      context.stop(self)
  }
}
```

## Code Examples

### Example 1: Accessing CinnamonMetrics

```scala
import com.lightbend.cinnamon.akka.CinnamonMetrics
import com.lightbend.cinnamon.metric._
```

### Example 2: Accessing CinnamonMetrics

```java
import com.lightbend.cinnamon.akka.CinnamonMetrics;
import com.lightbend.cinnamon.metric.*;
```

### Example 3: Accessing CinnamonMetrics from Akka Typed

```sbt
libraryDependencies += Cinnamon.library.cinnamonAkkaTyped
```

### Example 4: Accessing CinnamonMetrics from Akka Typed

```xml
<dependency>
  <groupId>com.lightbend.cinnamon</groupId>
  <artifactId>cinnamon-akka-typed_2.13</artifactId>
  <version>2.21.4</version>
</dependency>
```

### Example 5: Accessing CinnamonMetrics from Akka Typed

```gradle
dependencies {
  implementation group: 'com.lightbend.cinnamon', name: 'cinnamon-akka-typed_2.13', version: '2.21.4'
}
```

### Example 6: Accessing CinnamonMetrics from Akka Typed

```scala
import com.lightbend.cinnamon.akka.typed.CinnamonMetrics
import com.lightbend.cinnamon.metric._
```

### Example 7: Accessing CinnamonMetrics from Akka Typed

```java
import com.lightbend.cinnamon.akka.typed.CinnamonMetrics;
import com.lightbend.cinnamon.metric.*;
```

### Example 8: Creating system-level custom metrics

```scala
val sysCounter: Counter = CinnamonMetrics(system).createCounter("sysCounter")
val sysGaugeDouble: GaugeDouble = CinnamonMetrics(system).createGaugeDouble("sysGaugeDouble")
val sysGaugeLong: GaugeLong = CinnamonMetrics(system).createGaugeLong("sysGaugeLong")
val sysProvidingGaugeDouble: ProvidingGaugeDouble = CinnamonMetrics(system).createProvidingGaugeDouble("sysProvidingGaugeDouble", doubleValueProvider)
val sysProvidingGaugeLong: ProvidingGaugeLong = CinnamonMetrics(system).createProvidingGaugeLong("sysProvidingGaugeLong", longValueProvider)
val sysRate: Rate = CinnamonMetrics(system).createRate("sysRate")
val sysRecorder: Recorder = CinnamonMetrics(system).createRecorder("sysRecorder")
```

### Example 9: Creating system-level custom metrics

```java
Counter sysCounter = CinnamonMetrics.get(getSystem()).createCounter("sysCounter");
GaugeDouble sysGaugeDouble = CinnamonMetrics.get(getSystem()).createGaugeDouble("sysGaugeDouble");
GaugeLong sysGaugeLong = CinnamonMetrics.get(getSystem()).createGaugeLong("sysGaugeLong");
ProvidingGaugeDouble sysProvidingGaugeDouble =
    CinnamonMetrics.get(getSystem())
        .createProvidingGaugeDouble("sysProvidingGaugeDouble", doubleValueProvider);
ProvidingGaugeLong sysProvidingGaugeLong =
    CinnamonMetrics.get(getSystem())
        .createProvidingGaugeLong("sysProvidingGaugeLong", longValueProvider);
Rate sysRate = CinnamonMetrics.get(getSystem()).createRate("sysRate");
Recorder sysRecorder = CinnamonMetrics.get(getSystem()).createRecorder("sysRecorder");
```

### Example 10: Creating actor-level custom metrics

```scala
val counter: Counter = CinnamonMetrics(context).createCounter("counter")
val gaugeDouble: GaugeDouble = CinnamonMetrics(context).createGaugeDouble("gaugeDouble")
val gaugeLong: GaugeLong = CinnamonMetrics(context).createGaugeLong("gaugeLong")
val providingGaugeDouble: ProvidingGaugeDouble = CinnamonMetrics(context).createProvidingGaugeDouble("providingGaugeDouble", doubleValueProvider)
val providingGaugeLong: ProvidingGaugeLong = CinnamonMetrics(context).createProvidingGaugeLong("providingGaugeLong", longValueProvider)
val rate: Rate = CinnamonMetrics(context).createRate("rate")
val recorder: Recorder = CinnamonMetrics(context).createRecorder("recorder")
```

### Example 11: Creating actor-level custom metrics

```java
Counter counter = CinnamonMetrics.get(getContext()).createCounter("counter");
GaugeDouble gaugeDouble = CinnamonMetrics.get(getContext()).createGaugeDouble("gaugeDouble");
GaugeLong gaugeLong = CinnamonMetrics.get(getContext()).createGaugeLong("gaugeLong");
ProvidingGaugeDouble providingGaugeDouble =
    CinnamonMetrics.get(getContext())
        .createProvidingGaugeDouble("providingGaugeDouble", doubleValueProvider);
ProvidingGaugeLong providingGaugeLong =
    CinnamonMetrics.get(getContext())
        .createProvidingGaugeLong("providingGaugeLong", longValueProvider);
Rate rate = CinnamonMetrics.get(getContext()).createRate("rate");
Recorder recorder = CinnamonMetrics.get(getContext()).createRecorder("recorder");
```

### Example 12: Creating application-level custom metrics

```scala
val appMetrics = CinnamonMetrics(system).metricsForApplication()

val appCounter: Counter = appMetrics.createCounter("appCounter")
val appGaugeDouble: GaugeDouble = appMetrics.createGaugeDouble("appGaugeDouble")
val appGaugeLong: GaugeLong = appMetrics.createGaugeLong("appGaugeLong")
val appProvidingGaugeDouble: ProvidingGaugeDouble = appMetrics.createProvidingGaugeDouble("appProvidingGaugeDouble", doubleValueProvider)
val appProvidingGaugeLong: ProvidingGaugeLong = appMetrics.createProvidingGaugeLong("appProvidingGaugeLong", longValueProvider)
val appRate: Rate = appMetrics.createRate("appRate")
val appRecorder: Recorder = appMetrics.createRecorder("appRecorder")
```

### Example 13: Creating application-level custom metrics

```java
CinnamonMetrics appMetrics = CinnamonMetrics.get(getSystem()).metricsForApplication();

Counter appCounter = appMetrics.createCounter("appCounter");
GaugeDouble appGaugeDouble = appMetrics.createGaugeDouble("appGaugeDouble");
GaugeLong appGaugeLong = appMetrics.createGaugeLong("appGaugeLong");
ProvidingGaugeDouble appProvidingGaugeDouble =
    appMetrics.createProvidingGaugeDouble("appProvidingGaugeDouble", doubleValueProvider);
ProvidingGaugeLong appProvidingGaugeLong =
    appMetrics.createProvidingGaugeLong("appProvidingGaugeLong", longValueProvider);
Rate appRate = appMetrics.createRate("appRate");
Recorder appRecorder = appMetrics.createRecorder("appRecorder");
```

### Example 14: Adding tags to custom metrics

```scala
val taggedRecorder: Recorder = CinnamonMetrics(context).createRecorder("tagged-recorder", tags = Map("key" -> "value"))
```

### Example 15: Adding tags to custom metrics

```java
Map<String, String> tags = ImmutableMap.of("key", "value");
Recorder taggedRecorder =
    CinnamonMetrics.get(getContext()).createRecorder("tagged-recorder", tags);
```

### Example 16: ProvidingGaugeLong and ProvidingGaugeDouble value providers

```scala
val longValueProvider: LongValueProvider = new LongValueProvider {
  val cnt: AtomicLong = new AtomicLong(0)
  override def currentValue(): Long = cnt.getAndIncrement()
}
```

### Example 17: ProvidingGaugeLong and ProvidingGaugeDouble value providers

```java
LongValueProvider longValueProvider =
    new LongValueProvider() {
      AtomicLong cnt = new AtomicLong(0);

      @Override
      public long currentValue() {
        return cnt.getAndIncrement();
      }
    };
```

### Example 18: ProvidingGaugeLong and ProvidingGaugeDouble value providers

```scala
val doubleValueProvider: DoubleValueProvider = new DoubleValueProvider {
  val cnt: AtomicReference[Double] = new AtomicReference(0.0)
  override def currentValue(): Double = cnt.get()
}
```

### Example 19: ProvidingGaugeLong and ProvidingGaugeDouble value providers

```java
DoubleValueProvider doubleValueProvider =
    new DoubleValueProvider() {
      AtomicReference<Double> cnt = new AtomicReference(0.0);

      @Override
      public double currentValue() {
        return cnt.get();
      }
    };
```

### Example 20: Using custom metrics

```scala
counter.increment()

counter.decrement()

gaugeDouble.set(4.2)

gaugeLong.set(12L)

rate.mark()

recorder.record(42L)
```

### Example 21: Using custom metrics

```java
counter.increment();

counter.decrement();

gaugeDouble.set(4.2);

gaugeLong.set(12L);

rate.mark();

recorder.record(42L);
```

### Example 22: Destroying custom metrics

```scala
counter.destroy()

gaugeDouble.destroy()

gaugeLong.destroy()

providingGaugeLong.destroy()

providingGaugeDouble.destroy()

rate.destroy()

recorder.destroy()
```

### Example 23: Destroying custom metrics

```java
counter.destroy();

gaugeDouble.destroy();

gaugeLong.destroy();

providingGaugeDouble.destroy();

providingGaugeLong.destroy();

rate.destroy();

recorder.destroy();
```

### Example 24: Custom metric timer utility

```scala
val timer: Timer = CinnamonMetrics(context).createTimer("timer")

timer.time { 1 to 10000 sum }
```

### Example 25: Custom metric timer utility

```java
Timer timer = CinnamonMetrics.get(getContext()).createTimer("timer");

timer.time(() -> IntStream.rangeClosed(1, 100000).sum());
```

### Example 26: Custom metric example

```scala
import com.lightbend.cinnamon.akka.CinnamonMetrics
import com.lightbend.cinnamon.metric._

case object Init
case object In
case object Out
case object Done

class CustomerCountActor extends Actor {
  val counter: Counter = CinnamonMetrics(context).createCounter("customerCounter")

  def receive: PartialFunction[Any, Unit] = {
    case Init =>
      sender() ! Init
    case In =>
      counter.increment()
      sender() ! In
    case Out =>
      counter.decrement()
      sender() ! Out
    case Done =>
      counter.destroy()
      sender() ! Done
      context.stop(self)
  }
}
```

## Related Pages (Internal Links)

- https://doc.akka.io/libraries/akka-insights/2.21/extensions/custom-events.html
- https://doc.akka.io/libraries/akka-insights/2.21/extensions/opentracing/opentracing.html
- https://doc.akka.io/libraries/akka-insights/2.21/extensions/stopwatch.html
- https://doc.akka.io/libraries/akka-insights/2.21/instrumentations/akka/actors.html
- https://doc.akka.io/libraries/akka-insights/2.21/plugins/plugins.html
- https://doc.akka.io/libraries/akka-insights/2.21/reference/api/javadoc/?com/lightbend/cinnamon/akka/CinnamonMetrics.html

---
*Source: [https://doc.akka.io/libraries/akka-insights/2.21/extensions/custom-metrics.html](https://doc.akka.io/libraries/akka-insights/2.21/extensions/custom-metrics.html)*