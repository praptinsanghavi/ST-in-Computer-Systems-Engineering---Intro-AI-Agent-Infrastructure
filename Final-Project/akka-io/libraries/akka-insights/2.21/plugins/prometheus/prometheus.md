---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:24:20Z'
section: libraries
site: akka-io
source_url: /plugins/prometheus/prometheus.html
title: Prometheus • Akka Insights
---

# Prometheus • Akka Insights

## Content

# Prometheus

Akka Insights can report metrics to [Prometheus](https://prometheus.io), using a backend plugin integrated with the [Prometheus JVM client](https://github.com/prometheus/client_java).

## Cinnamon dependency

First make sure that your build is configured to use the [Cinnamon Agent](../../setup/setup.html) and has instrumentations enabled, such as [Akka instrumentation](../../instrumentations/akka/akka.html) or [Akka HTTP instrumentation](../../instrumentations/akka-http/akka-http.html).

Here is the core Cinnamon Prometheus dependency, but note that you also need to select an [exporter](prometheus.html#exporters).

sbt

```
libraryDependencies += Cinnamon.library.cinnamonPrometheus
```

Maven

```
<dependency>
    <groupId>com.lightbend.cinnamon</groupId>
    <artifactId>cinnamon-prometheus</artifactId>
    <version>2.21.4</version>
</dependency>
```

Gradle

```
dependencies {
  implementation group: 'com.lightbend.cinnamon', name: 'cinnamon-prometheus', version: '2.21.4'
}
```

## Exporters

There are several options for exporting metrics to Prometheus. Metrics are usually exposed over HTTP, to be read by the Prometheus server. [Custom exporters](prometheus.html#custom-exporter) can also be created.

### HTTP server

The [HTTP server exporter](https://github.com/prometheus/client_java#user-content-http) starts a simple stand\-alone server for exporting metrics in Prometheus format.

Add the Prometheus HTTP server dependency to your build:

sbt

```
libraryDependencies += Cinnamon.library.cinnamonPrometheusHttpServer
```

Maven

```
<dependency>
    <groupId>com.lightbend.cinnamon</groupId>
    <artifactId>cinnamon-prometheus-httpserver</artifactId>
    <version>2.21.4</version>
</dependency>
```

Gradle

```
dependencies {
  implementation group: 'com.lightbend.cinnamon', name: 'cinnamon-prometheus-httpserver', version: '2.21.4'
}
```

You need to enable the HTTP server exporter using configuration. The host and port for the server can also be configured.

Required

```
cinnamon.prometheus {
  exporters += http-server
}
```

Example

```
cinnamon.prometheus {
  exporters += http-server

  http-server {
    host = "localhost"
    port = 9091
  }
}
```

Reference

```
cinnamon.prometheus {
  http-server {

    # Host to bind the Prometheus HTTP server
    # Defaults to the wildcard address when empty (bind to all interfaces)
    host = ""

    # Port to bind the Prometheus HTTP server
    port = 9001

    # Whether to use daemon threads for the HTTP server
    daemon = false
  }
}
```
Note
These settings are defined in the `reference.conf`. You only need to specify any of these settings when you want to override the defaults.

Prometheus metrics will now be available at the configured server location. Using the defaults, this is at <http://localhost:9001/metrics>.

## Custom metrics

[Custom metrics](../../extensions/custom-metrics.html) of type `Counter` and `Gauge` are exposed as a Prometheus Gauge. A `Rate` is exposed as a Prometheus `Counter` and a `Recorder` becomes either a `Summary` or `Histogram` depending on the further configuration.

## Configuration

Host and application labels are automatically reported with Prometheus metrics, based on the shared [Cinnamon metadata](../plugins.html#cinnamon-metadata). To disable these extra labels, use the `unique-dimensions` setting. See the example below.

The Prometheus Summary metric type is used by default for Cinnamon `Recorders`, which are used for timing metrics and other distribution\-based metrics. Summaries calculate configurable quantiles over a sliding time window, along with a total count of observations and the min, max, and sum of all observed values. The quantiles and the sliding time window for the default Summary metric can be configured, as well as the precision to use (for the underlying [HDR Histogram](http://hdrhistogram.org)). See the example and reference configuration below for details, and the Prometheus documentation on [summaries](https://prometheus.io/docs/practices/histograms/) for more information. For configuring Summaries differently for separate Recorders, or for using Prometheus Histogram metrics, see configuring [metric hints](prometheus.html#metric-hints) and [histograms](prometheus.html#histograms).

Required

> There is nothing to configure to use the default settings for Prometheus metrics. See the Reference tab for defaults.

Example

```
cinnamon.prometheus {
  # exclude the host and application labels
  unique-dimensions = off

  summary {
    # determine quantiles to use
    quantiles = [0.5, 0.9, 0.95]

    # configure the sliding time window
    max-age = 1m # after 1m, all observations will be discarded
    age-buckets = 6 # discards one bucket every 10s

    # configure the precision of the underlying HDR Histogram
    significant-value-digits = 3
  }
}
```

Reference

```
cinnamon.prometheus {

  # Prometheus exporters to load
  exporters = ${?cinnamon.chmetrics.exporters} []

  # Whether to include "unique dimensions" as labels.
  # These are labels that are unique to this client,
  # such as host name and application identifier.
  unique-dimensions = on

  # Using the default registry will enable the user to create "native" Prometheus metrics and
  # Cinnamon metrics in the Prometheus default registry. Enabling this feature means that any
  # Prometheus metric,  regardless of how it is created, will be exposed via this exporter.
  use-default-registry = off

  # Default settings for Prometheus Summary metrics (default used for Cinnamon Recorder)
  # See https://prometheus.io/docs/practices/histograms/ for more information
  summary {
    # Quantiles used for summaries
    quantiles = [0.5, 0.95, 0.99]

    # Duration of the time window for summaries (how long observations are kept)
    max-age = 10m

    # Number of buckets used to implement the sliding time window for summaries
    age-buckets = 5

    # Specify the precision to use. This is the number of significant decimal digits of the
    # underlying HdrHistogram. Must be a non-negative integer between 0 and 5.
    significant-value-digits = 2

    # Set the initial dynamic range (and memory usage) of the underlying HdrHistogram.
    highest-to-lowest-value-ratio = 1000
  }

  # Default settings for Prometheus Histogram metrics
  histogram {}

  # Settings specific to metric hints
  hints {}
}
```
Note
These settings are defined in the `reference.conf`. You only need to specify any of these settings when you want to override the defaults.

### Metric hints

Metrics—either created by Cinnamon instrumentation or [custom metrics](../../extensions/custom-metrics.html)—can be given *hints* that will passed to the metric backend. These hints allow particular metrics to be configured differently from the default configuration.

By default, the Cinnamon `Recorder` metric type is backed by a `Summary` in the Prometheus backend. If you need a particular recorder to always use a specially configured Summary, or if you require a Histogram with predetermined buckets to be used, then you can do this by labelling the recorder with a hint and specifying the Summary or Histogram configuration.

For example, using the [custom metrics API](../../extensions/custom-metrics.html) you can pass in the hint when creating a custom recorder:

Scala

```
val recorder = CinnamonMetrics(context).createRecorder("recorder", hints = Set("custom-recorder"))
```

Java

```
final Set<String> hints = ImmutableSet.of("custom-recorder");
final Recorder recorder = CinnamonMetrics.get(context).createRecorder("recorder", hints);
```

You can then configure this hint in the `cinnamon.prometheus.hints` section using the name of the hint. For example, here’s custom configuration for a Summary but scoped just for this hint:

```
cinnamon.prometheus {
  hints {
    custom-recorder {
      summary {
        quantiles = [0.5, 0.9]
      }
    }
  }
}
```

### Histograms

A [Histogram](https://prometheus.io/docs/concepts/metric_types/#histogram) counts observations in configurable buckets. As each bucket is just a cumulative counter, Histograms can be aggregated across dimensions. Because the histogram buckets are predetermined and fixed, there needs to be some idea of the range and distribution of values that will be observed. Since Cinnamon Recorders are used for a variety of different metrics, there’s no one\-size\-fits\-all configuration for Recorders backed by Histograms, and so Histograms can only be configured in the Cinnamon Prometheus backend via *metric hints*.

If you’re using the [custom metrics API](../../extensions/custom-metrics.html) you can specify a hint when creating a custom recorder:

Scala

```
val recorder = CinnamonMetrics(context).createRecorder("recorder", hints = Set("custom-recorder"))
```

Java

```
final Set<String> hints = ImmutableSet.of("custom-recorder");
final Recorder recorder = CinnamonMetrics.get(context).createRecorder("recorder", hints);
```

You can then configure this hint in the `cinnamon.prometheus.hints` section using the name of the hint and configuration for a `histogram`. A histogram is configured by specifying the upper bounds of the buckets. There are a few ways to do this.

Note
Each bucket is a separate time series in Prometheus. Having many buckets could impact performance.

#### Histogram buckets

The simplest way to configure a Histogram is to specify the bucket boundaries directly. For example, here’s configuration for the custom recorder using the `buckets` setting:

```
cinnamon.prometheus {
  hints {
    custom-recorder {
      histogram {
        buckets = [1, 10, 100]
      }
    }
  }
}
```

#### Histogram linear buckets

If the upper bounds form a *linear sequence* then this can be specified by providing the starting value, the width of the buckets, and the number of buckets. For example, this configuration:

```
cinnamon.prometheus {
  hints {
    custom-recorder {
      histogram {
        linear-buckets {
          start = 1
          width = 2
          count = 5
        }
      }
    }
  }
}
```

Would configure the histogram with these upper bounds for the buckets:

```
1.0,
3.0,
5.0,
7.0,
```

#### Histogram exponential buckets

If the upper bounds form an *exponential sequence* then this can be specified by providing the starting value, the factor, and the number of buckets. For example, this configuration:

```
cinnamon.prometheus {
  hints {
    custom-recorder {
      histogram {
        exponential-buckets {
          start = 1
          factor = 2
          count = 4
        }
      }
    }
  }
}
```

Would configure the histogram with these upper bounds for the buckets:

```
1.0,
2.0,
4.0,
8.0
```

#### Histogram duration buckets

If the Histogram backs a Recorder that records *time durations*, then the buckets can be specified using durations and automatically converted to the base time unit (note that Cinnamon provided timers are in nanoseconds by default):

```
cinnamon.prometheus {
  hints {
    custom-recorder {
      histogram {
        durations {
          buckets = [1ms, 3ms, 10ms, 30ms, 100ms, 300ms, 1s, 3s]
          unit = nanoseconds
        }
      }
    }
  }
}
```

## Custom exporter

It’s possible to create custom exporters, which will have access to the `CollectorRegistry` from the Prometheus client.

The [`PrometheusExporter`](../../reference/api/javadoc/?com/lightbend/cinnamon/prometheus/PrometheusExporter.html "com.lightbend.cinnamon.prometheus.PrometheusExporter") interface should be implemented, which contains a `stop` method, and the constructor for the exporter should accept a `CollectorRegistry` and can optionally take `Config` and `LoggingProvider` parameters. The custom exporter is enabled in configuration, by providing the fully qualified class name. Optional extra configuration settings can be used which will be available via the `Config` parameter.

For example, here is the configuration for setting up a custom exporter:

```
cinnamon.prometheus {
  exporters += custom-exporter

  custom-exporter {
    exporter-class = "prometheus.sample.CustomExporter"
    some-setting = 1234
  }
}
```

And here is an outline for implementing a custom exporter, in Scala or Java:

Scala

```
package prometheus.sample

import com.lightbend.cinnamon.logging.Logger
import com.lightbend.cinnamon.logging.LoggingProvider
import com.lightbend.cinnamon.prometheus.PrometheusExporter
import com.typesafe.config.Config
import io.prometheus.client.CollectorRegistry

// the Config and LoggingProvider are optional parameters which will be injected
class CustomExporter(registry: CollectorRegistry, config: Config, logging: LoggingProvider) extends PrometheusExporter {
  // can create a Cinnamon logger
  val log: Logger = logging.get(this.getClass)

  // the config is already scoped to the "custom-exporter" section
  val someSetting: Int = config.getInt("some-setting")

  // set up and start exporter with registry in the constructor
  log.info("Starting custom exporter...")

  override def stop(): Unit = {
    // stop and clean up the exporter here
    // called when the Cinnamon backends are shutting down
    log.info("Stopping custom exporter...")
  }
}
```

Java

```
package prometheus.sample;

import com.lightbend.cinnamon.logging.Logger;
import com.lightbend.cinnamon.logging.LoggingProvider;
import com.lightbend.cinnamon.prometheus.PrometheusExporter;
import com.typesafe.config.Config;
import io.prometheus.client.CollectorRegistry;

public final class CustomExporter implements PrometheusExporter {
  private final Logger log;
  private final int someSetting;

  // the Config and LoggingProvider are optional parameters which will be injected
  public CustomExporter(CollectorRegistry registry, Config config, LoggingProvider logging) {
    // can create a Cinnamon logger
    this.log = logging.get(this.getClass());

    // the config is already scoped to the "custom-exporter" section
    this.someSetting = config.getInt("some-setting");

    // set up and start exporter with registry in the constructor
    log.info("Starting custom exporter...");
  }

  public int getSomeSetting() {
    return someSetting;
  }

  @Override
  public void stop() {
    // stop and clean up the exporter here
    // called when the Cinnamon backends are shutting down
    log.info("Stopping custom exporter...");
  }
}
```

## Reusing the default registry

It is also possible to have the Cinnamon Prometheus exporter use the Prometheus default registry. By doing so, all metrics created via the native Prometheus client and via Cinnamon will end up in the same registry. This will enable the Cinnamon Prometheus exporter to expose all metrics regardless of how they have been created.

By default this feature is set to `off` and here below is the configuration for how to enable it:

Default registry setting

```
cinnamon.prometheus {
  use-default-registry = on
}
```

## Prometheus Docker developer sandbox

Cinnamon provides a [Docker\-based developer sandbox environment for Prometheus](../../sandbox/prometheus-sandbox.html).

## Code Examples

### Example 1: Cinnamon dependency

```sbt
libraryDependencies += Cinnamon.library.cinnamonPrometheus
```

### Example 2: Cinnamon dependency

```xml
<dependency>
    <groupId>com.lightbend.cinnamon</groupId>
    <artifactId>cinnamon-prometheus</artifactId>
    <version>2.21.4</version>
</dependency>
```

### Example 3: Cinnamon dependency

```gradle
dependencies {
  implementation group: 'com.lightbend.cinnamon', name: 'cinnamon-prometheus', version: '2.21.4'
}
```

### Example 4: HTTP server

```sbt
libraryDependencies += Cinnamon.library.cinnamonPrometheusHttpServer
```

### Example 5: HTTP server

```xml
<dependency>
    <groupId>com.lightbend.cinnamon</groupId>
    <artifactId>cinnamon-prometheus-httpserver</artifactId>
    <version>2.21.4</version>
</dependency>
```

### Example 6: HTTP server

```gradle
dependencies {
  implementation group: 'com.lightbend.cinnamon', name: 'cinnamon-prometheus-httpserver', version: '2.21.4'
}
```

### Example 7: HTTP server

```scala
cinnamon.prometheus {
  exporters += http-server
}
```

### Example 8: HTTP server

```scala
cinnamon.prometheus {
  exporters += http-server

  http-server {
    host = "localhost"
    port = 9091
  }
}
```

### Example 9: HTTP server

```conf
cinnamon.prometheus {
  http-server {

    # Host to bind the Prometheus HTTP server
    # Defaults to the wildcard address when empty (bind to all interfaces)
    host = ""

    # Port to bind the Prometheus HTTP server
    port = 9001

    # Whether to use daemon threads for the HTTP server
    daemon = false
  }
}
```

### Example 10: Configuration

```scala
cinnamon.prometheus {
  # exclude the host and application labels
  unique-dimensions = off

  summary {
    # determine quantiles to use
    quantiles = [0.5, 0.9, 0.95]

    # configure the sliding time window
    max-age = 1m # after 1m, all observations will be discarded
    age-buckets = 6 # discards one bucket every 10s

    # configure the precision of the underlying HDR Histogram
    significant-value-digits = 3
  }
}
```

### Example 11: Configuration

```conf
cinnamon.prometheus {

  # Prometheus exporters to load
  exporters = ${?cinnamon.chmetrics.exporters} []

  # Whether to include "unique dimensions" as labels.
  # These are labels that are unique to this client,
  # such as host name and application identifier.
  unique-dimensions = on

  # Using the default registry will enable the user to create "native" Prometheus metrics and
  # Cinnamon metrics in the Prometheus default registry. Enabling this feature means that any
  # Prometheus metric,  regardless of how it is created, will be exposed via this exporter.
  use-default-registry = off

  # Default settings for Prometheus Summary metrics (default used for Cinnamon Recorder)
  # See https://prometheus.io/docs/practices/histograms/ for more information
  summary {
    # Quantiles used for summaries
    quantiles = [0.5, 0.95, 0.99]

    # Duration of the time window for summaries (how long observations are kept)
    max-age = 10m

    # Number of buckets used to implement the sliding time window for summaries
    age-buckets = 5

    # Specify the precision to use. This is the number of significant decimal digits of the
    # underlying HdrHistogram. Must be a non-negative integer between 0 and 5.
    significant-value-digits = 2

    # Set the initial dynamic range (and memory usage) of the underlying HdrHistogram.
    highest-to-lowest-value-ratio = 1000
  }

  # Default settings for Prometheus Histogram metrics
  histogram {}

  # Settings specific to metric hints
  hints {}
}
```

### Example 12: Metric hints

```scala
val recorder = CinnamonMetrics(context).createRecorder("recorder", hints = Set("custom-recorder"))
```

### Example 13: Metric hints

```java
final Set<String> hints = ImmutableSet.of("custom-recorder");
final Recorder recorder = CinnamonMetrics.get(context).createRecorder("recorder", hints);
```

### Example 14: Metric hints

```scala
cinnamon.prometheus {
  hints {
    custom-recorder {
      summary {
        quantiles = [0.5, 0.9]
      }
    }
  }
}
```

### Example 15: Histograms

```scala
val recorder = CinnamonMetrics(context).createRecorder("recorder", hints = Set("custom-recorder"))
```

### Example 16: Histograms

```java
final Set<String> hints = ImmutableSet.of("custom-recorder");
final Recorder recorder = CinnamonMetrics.get(context).createRecorder("recorder", hints);
```

### Example 17: Histogram buckets

```scala
cinnamon.prometheus {
  hints {
    custom-recorder {
      histogram {
        buckets = [1, 10, 100]
      }
    }
  }
}
```

### Example 18: Histogram linear buckets

```scala
cinnamon.prometheus {
  hints {
    custom-recorder {
      histogram {
        linear-buckets {
          start = 1
          width = 2
          count = 5
        }
      }
    }
  }
}
```

### Example 19: Histogram linear buckets

```scala
1.0,
3.0,
5.0,
7.0,
```

### Example 20: Histogram exponential buckets

```scala
cinnamon.prometheus {
  hints {
    custom-recorder {
      histogram {
        exponential-buckets {
          start = 1
          factor = 2
          count = 4
        }
      }
    }
  }
}
```

### Example 21: Histogram exponential buckets

```scala
1.0,
2.0,
4.0,
8.0
```

### Example 22: Histogram duration buckets

```scala
cinnamon.prometheus {
  hints {
    custom-recorder {
      histogram {
        durations {
          buckets = [1ms, 3ms, 10ms, 30ms, 100ms, 300ms, 1s, 3s]
          unit = nanoseconds
        }
      }
    }
  }
}
```

### Example 23: Custom exporter

```scala
cinnamon.prometheus {
  exporters += custom-exporter

  custom-exporter {
    exporter-class = "prometheus.sample.CustomExporter"
    some-setting = 1234
  }
}
```

### Example 24: Custom exporter

```scala
package prometheus.sample

import com.lightbend.cinnamon.logging.Logger
import com.lightbend.cinnamon.logging.LoggingProvider
import com.lightbend.cinnamon.prometheus.PrometheusExporter
import com.typesafe.config.Config
import io.prometheus.client.CollectorRegistry

// the Config and LoggingProvider are optional parameters which will be injected
class CustomExporter(registry: CollectorRegistry, config: Config, logging: LoggingProvider) extends PrometheusExporter {
  // can create a Cinnamon logger
  val log: Logger = logging.get(this.getClass)

  // the config is already scoped to the "custom-exporter" section
  val someSetting: Int = config.getInt("some-setting")

  // set up and start exporter with registry in the constructor
  log.info("Starting custom exporter...")

  override def stop(): Unit = {
    // stop and clean up the exporter here
    // called when the Cinnamon backends are shutting down
    log.info("Stopping custom exporter...")
  }
}
```

### Example 25: Custom exporter

```java
package prometheus.sample;

import com.lightbend.cinnamon.logging.Logger;
import com.lightbend.cinnamon.logging.LoggingProvider;
import com.lightbend.cinnamon.prometheus.PrometheusExporter;
import com.typesafe.config.Config;
import io.prometheus.client.CollectorRegistry;

public final class CustomExporter implements PrometheusExporter {
  private final Logger log;
  private final int someSetting;

  // the Config and LoggingProvider are optional parameters which will be injected
  public CustomExporter(CollectorRegistry registry, Config config, LoggingProvider logging) {
    // can create a Cinnamon logger
    this.log = logging.get(this.getClass());

    // the config is already scoped to the "custom-exporter" section
    this.someSetting = config.getInt("some-setting");

    // set up and start exporter with registry in the constructor
    log.info("Starting custom exporter...");
  }

  public int getSomeSetting() {
    return someSetting;
  }

  @Override
  public void stop() {
    // stop and clean up the exporter here
    // called when the Cinnamon backends are shutting down
    log.info("Stopping custom exporter...");
  }
}
```

### Example 26: Reusing the default registry

```scala
cinnamon.prometheus {
  use-default-registry = on
}
```

## Related Pages (Internal Links)

- https://doc.akka.io/libraries/akka-insights/2.21/extensions/custom-metrics.html
- https://doc.akka.io/libraries/akka-insights/2.21/instrumentations/akka-http/akka-http.html
- https://doc.akka.io/libraries/akka-insights/2.21/instrumentations/akka/akka.html
- https://doc.akka.io/libraries/akka-insights/2.21/plugins/chmetrics/configuration.html
- https://doc.akka.io/libraries/akka-insights/2.21/plugins/plugins.html
- https://doc.akka.io/libraries/akka-insights/2.21/plugins/prometheus/prometheus.html
- https://doc.akka.io/libraries/akka-insights/2.21/plugins/slf4jevents/slf4j-events.html
- https://doc.akka.io/libraries/akka-insights/2.21/reference/api/javadoc/?com/lightbend/cinnamon/prometheus/PrometheusExporter.html
- https://doc.akka.io/libraries/akka-insights/2.21/sandbox/prometheus-sandbox.html
- https://doc.akka.io/libraries/akka-insights/2.21/setup/setup.html

---
*Source: [https://doc.akka.io/libraries/akka-insights/2.21/plugins/prometheus/prometheus.html](https://doc.akka.io/libraries/akka-insights/2.21/plugins/prometheus/prometheus.html)*