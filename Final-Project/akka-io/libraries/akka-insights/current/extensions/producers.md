---
description: Telemetry for Akka libraries
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:44:01Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-insights/current/home.html/extensions/producers.html
title: Producers • Akka Insights
---

# Producers • Akka Insights

> **Summary:** Telemetry for Akka libraries

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Producers

Producers allow for custom metrics and events to be added to the Cinnamon Backends. The constructor of a Producer should accept a `Backends` parameter. The [`Backends`](../reference/api/javadoc/?com/lightbend/cinnamon/backend/Backends.html "com.lightbend.cinnamon.backend.Backends") interface exposes methods with which it is possible to dynamically add and remove metrics and events via the methods `MetricFactory metricsFor(Identity identity)` and `EventFactory eventsFor(Identity identity)`. This means that it is possible to create and delete metrics and events in runtime and that these are added to all configured backends.

An alternative to using a Producer is to use a [Registrant](../plugins/chmetrics/registrants.html). Registrant is for when you specifically have existing Coda Hale Metrics `MetricSets`. If you’re producing or importing metrics yourself, i.e. not an existing `MetricSet` or `MetricRegistry`, then Producer is a better choice.

## Implementing a Producer

To implement a Producer, complete the steps here below.

### Import

Import the `Backends` and `Producer` interfaces:

Scala

```
import com.lightbend.cinnamon.backend.Backends
import com.lightbend.cinnamon.producer.Producer
```

Java

```
import com.lightbend.cinnamon.backend.Backends;
import com.lightbend.cinnamon.producer.Producer;
```

### Extend and construct

Extend the [`Producer`](../reference/api/javadoc/?com/lightbend/cinnamon/producer/Producer.html "com.lightbend.cinnamon.producer.Producer") abstract class. The constructor *should* accept a [`Backends`](../reference/api/javadoc/?com/lightbend/cinnamon/backend/Backends.html "com.lightbend.cinnamon.backend.Backends") parameter, to be able to add metrics and events to Cinnamon:

Scala

```
class SampleProducer(backends: Backends) extends Producer {
```

Java

```
public class SampleProducerJava extends Producer {
  public SampleProducerJava(Backends backends) {
  }

```

### Implement *stop* method

Implement the `stop` method to clean up any resources and destroy created metrics:

Scala

```
override def stop() = {
  someResource.cleanUp()
  someLongGauge.destroy()
  someDoubleGauge.destroy()
}
```

Java

```
@Override
public void stop() {
  someResource.cleanUp();
  someLongGauge.destroy();
  someDoubleGauge.destroy();
}

```

### Enable via configuration

Enable the `Producer` by adding a configuration section to `cinnamon.producers` which contains a `producer-class` setting for the fully qualified class name:

Scala

```
cinnamon {
  producers += sample-producer

  sample-producer {
    producer-class = "sample.producer.SampleProducer"
  }
}
```

Java

```
cinnamon {
  producers += sample-producer

  sample-producer {
    producer-class = "sample.producer.SampleProducerJava"
  }
}
```

## Full example

The example below is naive in that it does not provide a whole lot of information in the form of metrics. It does, however, showcase a couple of important parts; the first one being how to write a complete implementation of a Producer, and the second important part is the use of `ProvidingGauge`s. The latter means that the value will be fetched when data is being reported, and this frequency is related to how the reporter(s) have been configured. It alleviates you from having to set up any internal scheduler to push data to the metrics backend(s), which, of course, also is a possible solution.

Scala

```
package sample.producer

import com.lightbend.cinnamon.backend.Backends
import com.lightbend.cinnamon.producer.Producer
import com.lightbend.cinnamon.meta.{ Descriptor, Identity }
import com.lightbend.cinnamon.metric.{ DoubleValueProvider, LongValueProvider }

class SampleProducer(backends: Backends) extends Producer {

  val someResource = new SomeResource

  val resourceIdentity = Identity
    .createFor("resources", "resource") // category and key
    .withName("some-resource")
    .withParent(backends.getCinnamonMeta().getApplicationIdentity())
    .build()

  val metricFactory = backends.metricsFor(resourceIdentity)

  val someLongGauge = metricFactory.createProvidingGaugeLong(
    new Descriptor.Builder().withKey("some-long-value").build(),
    new LongValueProvider {
      override def currentValue(): Long = someResource.getLongValue()
    }
  )

  val someDoubleGauge = metricFactory.createProvidingGaugeDouble(
    new Descriptor.Builder().withKey("some-double-value").build(),
    new DoubleValueProvider {
      override def currentValue(): Double = someResource.getDoubleValue()
    }
  )

  override def stop() = {
    someResource.cleanUp()
    someLongGauge.destroy()
    someDoubleGauge.destroy()
  }

}
```

Java

```
package sample.producer;

import com.lightbend.cinnamon.backend.Backends;
import com.lightbend.cinnamon.producer.Producer;
import com.lightbend.cinnamon.meta.Descriptor;
import com.lightbend.cinnamon.meta.Identity;
import com.lightbend.cinnamon.metric.MetricFactory;
import com.lightbend.cinnamon.metric.ProvidingGaugeDouble;
import com.lightbend.cinnamon.metric.ProvidingGaugeLong;

public class SampleProducerJava extends Producer {

  private final SomeResource someResource;

  private final ProvidingGaugeLong someLongGauge;
  private final ProvidingGaugeDouble someDoubleGauge;

  public SampleProducerJava(Backends backends) {

    this.someResource = new SomeResource();

    Identity resourceIdentity =
        Identity.createFor("resources", "resource") // category and key
            .withName("some-resource")
            .withParent(backends.getCinnamonMeta().getApplicationIdentity())
            .build();

    MetricFactory metricFactory = backends.metricsFor(resourceIdentity);

    this.someLongGauge =
        metricFactory.createProvidingGaugeLong(
            new Descriptor.Builder().withKey("some-long-value").build(),
            () -> someResource.getLongValue());

    this.someDoubleGauge =
        metricFactory.createProvidingGaugeDouble(
            new Descriptor.Builder().withKey("some-double-value").build(),
            () -> someResource.getDoubleValue());
  }

  @Override
  public void stop() {
    someResource.cleanUp();
    someLongGauge.destroy();
    someDoubleGauge.destroy();
  }

}
```

## Code Examples

### Example 1: Import

```scala
import com.lightbend.cinnamon.backend.Backends
import com.lightbend.cinnamon.producer.Producer
```

### Example 2: Import

```java
import com.lightbend.cinnamon.backend.Backends;
import com.lightbend.cinnamon.producer.Producer;
```

### Example 3: Extend and construct

```scala
class SampleProducer(backends: Backends) extends Producer {
```

### Example 4: Extend and construct

```java
public class SampleProducerJava extends Producer {
  public SampleProducerJava(Backends backends) {
  }
```

### Example 5: Implementstopmethod

```scala
override def stop() = {
  someResource.cleanUp()
  someLongGauge.destroy()
  someDoubleGauge.destroy()
}
```

### Example 6: Implementstopmethod

```java
@Override
public void stop() {
  someResource.cleanUp();
  someLongGauge.destroy();
  someDoubleGauge.destroy();
}
```

### Example 7: Enable via configuration

```scala
cinnamon {
  producers += sample-producer

  sample-producer {
    producer-class = "sample.producer.SampleProducer"
  }
}
```

### Example 8: Enable via configuration

```scala
cinnamon {
  producers += sample-producer

  sample-producer {
    producer-class = "sample.producer.SampleProducerJava"
  }
}
```

### Example 9: Full example

```scala
package sample.producer

import com.lightbend.cinnamon.backend.Backends
import com.lightbend.cinnamon.producer.Producer
import com.lightbend.cinnamon.meta.{ Descriptor, Identity }
import com.lightbend.cinnamon.metric.{ DoubleValueProvider, LongValueProvider }

class SampleProducer(backends: Backends) extends Producer {

  val someResource = new SomeResource

  val resourceIdentity = Identity
    .createFor("resources", "resource") // category and key
    .withName("some-resource")
    .withParent(backends.getCinnamonMeta().getApplicationIdentity())
    .build()

  val metricFactory = backends.metricsFor(resourceIdentity)

  val someLongGauge = metricFactory.createProvidingGaugeLong(
    new Descriptor.Builder().withKey("some-long-value").build(),
    new LongValueProvider {
      override def currentValue(): Long = someResource.getLongValue()
    }
  )

  val someDoubleGauge = metricFactory.createProvidingGaugeDouble(
    new Descriptor.Builder().withKey("some-double-value").build(),
    new DoubleValueProvider {
      override def currentValue(): Double = someResource.getDoubleValue()
    }
  )

  override def stop() = {
    someResource.cleanUp()
    someLongGauge.destroy()
    someDoubleGauge.destroy()
  }

}
```

### Example 10: Full example

```java
package sample.producer;

import com.lightbend.cinnamon.backend.Backends;
import com.lightbend.cinnamon.producer.Producer;
import com.lightbend.cinnamon.meta.Descriptor;
import com.lightbend.cinnamon.meta.Identity;
import com.lightbend.cinnamon.metric.MetricFactory;
import com.lightbend.cinnamon.metric.ProvidingGaugeDouble;
import com.lightbend.cinnamon.metric.ProvidingGaugeLong;

public class SampleProducerJava extends Producer {

  private final SomeResource someResource;

  private final ProvidingGaugeLong someLongGauge;
  private final ProvidingGaugeDouble someDoubleGauge;

  public SampleProducerJava(Backends backends) {

    this.someResource = new SomeResource();

    Identity resourceIdentity =
        Identity.createFor("resources", "resource") // category and key
            .withName("some-resource")
            .withParent(backends.getCinnamonMeta().getApplicationIdentity())
            .build();

    MetricFactory metricFactory = backends.metricsFor(resourceIdentity);

    this.someLongGauge =
        metricFactory.createProvidingGaugeLong(
            new Descriptor.Builder().withKey("some-long-value").build(),
            () -> someResource.getLongValue());

    this.someDoubleGauge =
        metricFactory.createProvidingGaugeDouble(
            new Descriptor.Builder().withKey("some-double-value").build(),
            () -> someResource.getDoubleValue());
  }


  @Override
  public void stop() {
    someResource.cleanUp();
    someLongGauge.destroy();
    someDoubleGauge.destroy();
  }


}
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/libraries/akka-insights/current/extensions/jmximporter/jmximporter.html
- https://doc.akka.io/libraries/akka-insights/current/extensions/stopwatch.html
- https://doc.akka.io/libraries/akka-insights/current/plugins/chmetrics/registrants.html
- https://doc.akka.io/libraries/akka-insights/current/reference/api/javadoc/?com/lightbend/cinnamon/backend/Backends.html
- https://doc.akka.io/libraries/akka-insights/current/reference/api/javadoc/?com/lightbend/cinnamon/producer/Producer.html

---
*Source: [https://doc.akka.io/libraries/akka-insights/current/extensions/producers.html](https://doc.akka.io/libraries/akka-insights/current/extensions/producers.html)*