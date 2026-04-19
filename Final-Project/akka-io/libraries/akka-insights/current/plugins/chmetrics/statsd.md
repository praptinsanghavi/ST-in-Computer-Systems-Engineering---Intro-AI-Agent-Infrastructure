---
description: Telemetry for Akka libraries
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:44:07Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-insights/current/home.html/plugins/chmetrics/statsd.html
title: StatsD • Akka Insights
---

# StatsD • Akka Insights

> **Summary:** Telemetry for Akka libraries

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# StatsD

[StatsD](https://github.com/statsd/statsd) is a commonly used metric collector. StatsD has become more or less a standard in the monitoring domain so we have decided to make it easy to integrate Akka Insights with StatsD. The following section will describe how to get started with the StatsD plugin.

> StatsD does not process **events** natively. Therefore, we send all event information as metric rates which results in the loss of any contextual information.

## Cinnamon dependency

First make sure that your build is configured to use the [Cinnamon Agent](../../setup/setup.html).

## Reporter dependency

The next step is to add the StatsD reporter to your build file.

Add the [core Coda Hale Metrics dependency](reporters.html#cinnamon-dependency) and the StatsD reporter dependency to your build:

sbt

```
libraryDependencies += Cinnamon.library.cinnamonCHMetrics
libraryDependencies += Cinnamon.library.cinnamonCHMetricsStatsDReporter
```

Maven

```
<dependency>
    <groupId>com.lightbend.cinnamon</groupId>
    <artifactId>cinnamon-chmetrics</artifactId>
    <version>2.22.2</version>
</dependency>
<dependency>
  <groupId>com.lightbend.cinnamon</groupId>
  <artifactId>cinnamon-chmetrics-statsd-reporter</artifactId>
  <version>2.22.2</version>
</dependency>
```

Gradle

```
dependencies {
  implementation group: 'com.lightbend.cinnamon', name: 'cinnamon-chmetrics', version: '2.22.2'
}
dependencies {
  implementation group: 'com.lightbend.cinnamon', name: 'cinnamon-chmetrics-statsd-reporter', version: '2.22.2'
}
```

Note
The [default Coda Hale Metrics module](reporters.html#cinnamon-dependency) uses Metrics 4 but [Coda Hale Metrics 3](reporters.html#metrics-3) can also be used.

## Configuration

Below is the configuration needed to set up Coda Hale Metrics to use the StatsD reporter. The Reference tab shows all the configurable settings for the StatsD reporter.

Required

```
cinnamon.chmetrics {
  reporters += "statsd-reporter"
}
```

Example

```
cinnamon.chmetrics {
  reporters += "statsd-reporter"

  statsd-reporter {
    host = "my.statsd.host"
    port = 8125
  }
}
```

Reference

```
cinnamon.chmetrics {
  statsd-reporter {

    # StatsD host.
    host = "127.0.0.1"

    # StatsD port.
    port = 8125

    # Channel to use for sending statsd messages: udp (by-default) or tcp.
    channel = udp

    # Frequency of metric reporting to StatsD.
    frequency = 10s

    # Prefix for all metric keys.
    prefix = ""

    # Prefix for custom metrics. Defaults to `prefix` if not set.
    custom-metrics-prefix = null

    # Suffix for all metric keys.
    suffix = ""

    # Send Counter `values`, and Meter `samples` as StatsD Counters instead of Gauges
    use-counters = off

    # Whether to enable detailed debug logging for the StatsD reporter
    # This also requires enabling DEBUG in your logger for class:
    #   `com.lightbend.cinnamon.chmetrics.statsd.DebugStatsDClient`
    # AND setting the `akka.loglevel` configuration to DEBUG
    # Note: only use for troubleshooting as every packet send is logged
    debug = off

    # If debug logging is enabled, only debug every n:th report
    debug-every = 1

    report {
      # When `use-counters` is enabled, also report the total count as an additional `.total` gauge
      counter-totals = off

      # Histogram fields to report for metrics
      histogram = ["max", "min", "mean", "median", "stddev", "p75", "p95", "p98", "p99", "p999"]

      # Meter fields to report for metrics
      meter = ["samples", "samples.total", "min1_rate", "min5_rate", "min15_rate", "mean_rate"]
    }

    dogstatsd {
      # Whether DogStatsD format should be used
      enabled = off

      # Prefix for all metric keys, when DogStatsD is enabled
      prefix = ${cinnamon.chmetrics.statsd-reporter.prefix}

      # Prefix for custom metrics, when DogStatsD is enabled. Defaults to `prefix` if not set.
      custom-metrics-prefix = null

      # Suffix for all metric keys, when DogStatsD is enabled
      suffix = ${cinnamon.chmetrics.statsd-reporter.suffix}

      # Send Counter `values`, and Meter `samples` as StatsD Counters instead of Gauges
      use-counters = ${cinnamon.chmetrics.statsd-reporter.use-counters}

      # Tags for all metrics, when DogStatsD is enabled.
      # Uses a "key-value" approach to generate the tags.
      # E.g. the following configuration:
      # tags {
      #   country = "UK"
      # }
      # will generate this Datadog tag: "country:UK"
      tags {}

      # Whether to include "unique dimensions" as tags.
      # These are tags that are unique to this reporter,
      # such as host name and application identifier.
      # Off by default for compatibility with earlier versions.
      # Note: host tag is also already provided by DogStatsD
      unique-dimensions = off
    }

    telegraf {
      # Whether Telegraf format should be used or not
      enabled = off

      # Prefix for all metric keys, when Telegraf is enabled
      prefix = ${cinnamon.chmetrics.statsd-reporter.prefix}

      # Prefix for custom metrics, when Telegraf is enabled. Defaults to `prefix` if not set.
      custom-metrics-prefix = null

      # Suffix for all metric keys, when Telegraf is enabled
      suffix = ${cinnamon.chmetrics.statsd-reporter.suffix}

      # Send Counter `values`, and Meter `samples` as StatsD Counters instead of Gauges
      use-counters = ${cinnamon.chmetrics.statsd-reporter.use-counters}

      # Tags for all metrics, when Telegraf is enabled.
      # Uses a "key-value" approach to generate the tags.
      # E.g. the following configuration:
      # tags {
      #   country = "UK"
      # }
      # will generate this Telegraf tag: "country=UK"
      tags {}

      # Whether to include "unique dimensions" as tags.
      # These are tags that are unique to this reporter,
      # such as host name and application identifier.
      # Off by default for compatibility with earlier versions.
      unique-dimensions = off
    }
  }
}
```
@@@ note These settings are defined in the `reference.conf`. You only need to specify any of these settings when you want to override the defaults.

For more information about filter settings see [Filters](filters.html).

Note that tags can be used with [DogStatsD](https://docs.datadoghq.com/guides/dogstatsd/) only. @@@

Note
By default StatsD is configured to use the UDP reporter that may not work correctly with Docker on MacOS. Use the TCP reporter instead as shown in the example below.

Example

```
cinnamon.chmetrics {
  reporters += "statsd-reporter"
  statsd-reporter {
    channel = tcp
  }
}
```

## StatsD wire format information

All metrics will be sent in a StatsD friendly format tailored for usage with the [Grafana dashboards](../../visualizations/grafana.html) that Akka provides. Should the need arise, the format can be altered by using prefix and suffix configuration (see above).

Note
All time related metrics are sent as nanoseconds.

### Metrics format

```
servers.<SERVER>.apps.<APPLICATION>.metrics.akka.systems.<ACTOR SYSTEM >.dispatchers.<DISPATCHER>.actors.<ACTOR>.<METRIC TYPE>.<SUB TYPE>:<VALUE>|g

```

Example values of the above are:

| PART | VALUE |
| --- | --- |
| SERVER | 192\_168\_99\_100 |
| APPLICATION | cinnamon\_sample\_bottleneck\_BottleneckDemo |
| ACTOR SYSTEM | BottleneckSample |
| DISPATCHER | frontend\-dispatcher |
| ACTOR | cinnamon\_sample\_bottleneck\_FrontEndRouter |
| METRIC TYPE | processed\-messages |
| SUB TYPE | min1\_rate |
| VALUE | 81\.11 |

Note that all package names containing `.` have been formatted to `_`, e.g. application value. This is part of the default behavior for the StatsD plugin.

### Events format

Events for StatsD have the same layout format as metrics. All events are sent as rates.

### Node to node communication format

Akka remoting will involve at least two nodes and any statistics that is related to node to node communication, e.g. Phi accrual value, will have the following format:

```
<servers>.<SERVER>.apps.<APPLICATION>.metrics.self-nodes.<SELF NODE>.remote-nodes.<REMOTE NODE>.<METRIC TYPE>:<VALUE>|g

```

Notable above is that there is a self and remote node in the path. The self node can have many remote nodes, but each combination will have its own metric values. The node information is made up from actor system, server and port.

Example values of the above are:

| PART | VALUE |
| --- | --- |
| SERVER | 192\_168\_99\_100 |
| APPLICATION | cinnamon\_sample\_bottleneck\_BottleneckDemo |
| SELF NODE | MYACTORSYSTEM\_192\_168\_99\_100\_2551 |
| REMOTE NODE | SOMEACTORSYSTEM\_192\_168\_101\_255\_56010 |
| METRIC TYPE | phi\-accrual\-value |
| VALUE | 0\.27 |

### Stopwatch format

Stopwatch format example:

```
servers.<SERVER>.apps.<APPLICATION>.metrics.stopwatches.<STOPWATCH>.<METRIC TYPE>.<SUB TYPE>:<VALUE>|g

```

Example values of the above are:

| PART | VALUE |
| --- | --- |
| SERVER | 192\_168\_99\_100 |
| APPLICATION | cinnamon\_sample\_bottleneck\_BottleneckDemo |
| STOPWATCH | hotpath |
| METRIC TYPE | stopwatch\-time |
| SUB TYPE | max |
| VALUE | 42000000 |

### Server and application identifiers

The server and application identifiers reported to StatsD are based on the shared [Cinnamon metadata](../plugins.html#cinnamon-metadata), and will default to the local host name and the Java main class. To configure these, use the `cinnamon.host` and `cinnamon.application` settings. For example:

```
cinnamon {
  host = "somewhere"
  application = "awesome-sauce"
}
```

### Reporting deltas as counters

By default all metrics are reported as StatsD gauges. It is possible to have the Coda Hale counters and the samples field of Coda Hale meters reported as the delta between the current value and the last reported valus as a StatsD counter, by changing the configuration like this:

```
cinnamon.chmetrics {
  reporters += "statsd-reporter"

  statsd-reporter {
    # use delta-based counters
    use-counters = on
  }
}
```

It’s also possible to have both the delta\-based counter and the total count reported as a gauge. The total count will be an additional gauge metric, named with a `.total` suffix. Enable the `counter-totals` setting in the StatsD reporting configuration:

```
cinnamon.chmetrics {
  reporters += "statsd-reporter"

  statsd-reporter {
    # use delta-based counters
    use-counters = on

    report {
      # report both delta-based counters and totals
      counter-totals = on
    }
  }
}
```

## DogStatsD

[DogStatsD](https://docs.datadoghq.com/guides/dogstatsd/) implements the StatsD protocol, along with some extra extensions for [Datadog](https://www.datadoghq.com) features. The StatsD reporter can emit DogStatsD tags for metric metadata rather than encode this information in the metric key. To enable DogStatsD format, use the `dogstatsd.enabled` setting.

Required

```
cinnamon.chmetrics {
  reporters += "statsd-reporter"

  statsd-reporter {
    dogstatsd {
      enabled = on
    }
  }
}
```

Example

```
cinnamon.chmetrics {
  reporters += "statsd-reporter"

  statsd-reporter {
    host = "my.statsd.host"
    port = 8125

    dogstatsd {
      enabled = on

      # optionally specify tags for all metrics
      tags {
        country = "UK"
      }

      # Optionally include "unique dimensions" as tags.
      # These are tags that are unique to this reporter,
      # such as host name and application identifier.
      unique-dimensions = on
    }
  }
}
```

Reference

```
cinnamon.chmetrics {
  statsd-reporter {

    # StatsD host.
    host = "127.0.0.1"

    # StatsD port.
    port = 8125

    # Channel to use for sending statsd messages: udp (by-default) or tcp.
    channel = udp

    # Frequency of metric reporting to StatsD.
    frequency = 10s

    # Prefix for all metric keys.
    prefix = ""

    # Prefix for custom metrics. Defaults to `prefix` if not set.
    custom-metrics-prefix = null

    # Suffix for all metric keys.
    suffix = ""

    # Send Counter `values`, and Meter `samples` as StatsD Counters instead of Gauges
    use-counters = off

    # Whether to enable detailed debug logging for the StatsD reporter
    # This also requires enabling DEBUG in your logger for class:
    #   `com.lightbend.cinnamon.chmetrics.statsd.DebugStatsDClient`
    # AND setting the `akka.loglevel` configuration to DEBUG
    # Note: only use for troubleshooting as every packet send is logged
    debug = off

    # If debug logging is enabled, only debug every n:th report
    debug-every = 1

    report {
      # When `use-counters` is enabled, also report the total count as an additional `.total` gauge
      counter-totals = off

      # Histogram fields to report for metrics
      histogram = ["max", "min", "mean", "median", "stddev", "p75", "p95", "p98", "p99", "p999"]

      # Meter fields to report for metrics
      meter = ["samples", "samples.total", "min1_rate", "min5_rate", "min15_rate", "mean_rate"]
    }

    dogstatsd {
      # Whether DogStatsD format should be used
      enabled = off

      # Prefix for all metric keys, when DogStatsD is enabled
      prefix = ${cinnamon.chmetrics.statsd-reporter.prefix}

      # Prefix for custom metrics, when DogStatsD is enabled. Defaults to `prefix` if not set.
      custom-metrics-prefix = null

      # Suffix for all metric keys, when DogStatsD is enabled
      suffix = ${cinnamon.chmetrics.statsd-reporter.suffix}

      # Send Counter `values`, and Meter `samples` as StatsD Counters instead of Gauges
      use-counters = ${cinnamon.chmetrics.statsd-reporter.use-counters}

      # Tags for all metrics, when DogStatsD is enabled.
      # Uses a "key-value" approach to generate the tags.
      # E.g. the following configuration:
      # tags {
      #   country = "UK"
      # }
      # will generate this Datadog tag: "country:UK"
      tags {}

      # Whether to include "unique dimensions" as tags.
      # These are tags that are unique to this reporter,
      # such as host name and application identifier.
      # Off by default for compatibility with earlier versions.
      # Note: host tag is also already provided by DogStatsD
      unique-dimensions = off
    }

    telegraf {
      # Whether Telegraf format should be used or not
      enabled = off

      # Prefix for all metric keys, when Telegraf is enabled
      prefix = ${cinnamon.chmetrics.statsd-reporter.prefix}

      # Prefix for custom metrics, when Telegraf is enabled. Defaults to `prefix` if not set.
      custom-metrics-prefix = null

      # Suffix for all metric keys, when Telegraf is enabled
      suffix = ${cinnamon.chmetrics.statsd-reporter.suffix}

      # Send Counter `values`, and Meter `samples` as StatsD Counters instead of Gauges
      use-counters = ${cinnamon.chmetrics.statsd-reporter.use-counters}

      # Tags for all metrics, when Telegraf is enabled.
      # Uses a "key-value" approach to generate the tags.
      # E.g. the following configuration:
      # tags {
      #   country = "UK"
      # }
      # will generate this Telegraf tag: "country=UK"
      tags {}

      # Whether to include "unique dimensions" as tags.
      # These are tags that are unique to this reporter,
      # such as host name and application identifier.
      # Off by default for compatibility with earlier versions.
      unique-dimensions = off
    }
  }
}
```
Note
These settings are defined in the `reference.conf`. You only need to specify any of these settings when you want to override the defaults.

Also see the [Datadog](../datadog/datadog.html) plugin for default DogStatsD configuration for reporting to Datadog.

### Configuring metric fields

Metrics reported by Cinnamon will be custom metrics in Datadog. As there is a cost associated with the number of custom metrics, it may be useful to limit the metric fields reported for histograms and meters. For example, the following configuration will select particular fields. See the Reference for possible options.

Required

> *There is nothing to configure if you don’t want to select certain metric fields.*

Example

```
cinnamon.chmetrics {
  reporters += "statsd-reporter"

  statsd-reporter {
    report {
      histogram = ["max", "min", "mean", "p95", "p99"]
      meter = ["samples", "min1_rate"]
    }
  }
}
```

Reference

```
cinnamon.chmetrics {
  statsd-reporter {

    # StatsD host.
    host = "127.0.0.1"

    # StatsD port.
    port = 8125

    # Channel to use for sending statsd messages: udp (by-default) or tcp.
    channel = udp

    # Frequency of metric reporting to StatsD.
    frequency = 10s

    # Prefix for all metric keys.
    prefix = ""

    # Prefix for custom metrics. Defaults to `prefix` if not set.
    custom-metrics-prefix = null

    # Suffix for all metric keys.
    suffix = ""

    # Send Counter `values`, and Meter `samples` as StatsD Counters instead of Gauges
    use-counters = off

    # Whether to enable detailed debug logging for the StatsD reporter
    # This also requires enabling DEBUG in your logger for class:
    #   `com.lightbend.cinnamon.chmetrics.statsd.DebugStatsDClient`
    # AND setting the `akka.loglevel` configuration to DEBUG
    # Note: only use for troubleshooting as every packet send is logged
    debug = off

    # If debug logging is enabled, only debug every n:th report
    debug-every = 1

    report {
      # When `use-counters` is enabled, also report the total count as an additional `.total` gauge
      counter-totals = off

      # Histogram fields to report for metrics
      histogram = ["max", "min", "mean", "median", "stddev", "p75", "p95", "p98", "p99", "p999"]

      # Meter fields to report for metrics
      meter = ["samples", "samples.total", "min1_rate", "min5_rate", "min15_rate", "mean_rate"]
    }

    dogstatsd {
      # Whether DogStatsD format should be used
      enabled = off

      # Prefix for all metric keys, when DogStatsD is enabled
      prefix = ${cinnamon.chmetrics.statsd-reporter.prefix}

      # Prefix for custom metrics, when DogStatsD is enabled. Defaults to `prefix` if not set.
      custom-metrics-prefix = null

      # Suffix for all metric keys, when DogStatsD is enabled
      suffix = ${cinnamon.chmetrics.statsd-reporter.suffix}

      # Send Counter `values`, and Meter `samples` as StatsD Counters instead of Gauges
      use-counters = ${cinnamon.chmetrics.statsd-reporter.use-counters}

      # Tags for all metrics, when DogStatsD is enabled.
      # Uses a "key-value" approach to generate the tags.
      # E.g. the following configuration:
      # tags {
      #   country = "UK"
      # }
      # will generate this Datadog tag: "country:UK"
      tags {}

      # Whether to include "unique dimensions" as tags.
      # These are tags that are unique to this reporter,
      # such as host name and application identifier.
      # Off by default for compatibility with earlier versions.
      # Note: host tag is also already provided by DogStatsD
      unique-dimensions = off
    }

    telegraf {
      # Whether Telegraf format should be used or not
      enabled = off

      # Prefix for all metric keys, when Telegraf is enabled
      prefix = ${cinnamon.chmetrics.statsd-reporter.prefix}

      # Prefix for custom metrics, when Telegraf is enabled. Defaults to `prefix` if not set.
      custom-metrics-prefix = null

      # Suffix for all metric keys, when Telegraf is enabled
      suffix = ${cinnamon.chmetrics.statsd-reporter.suffix}

      # Send Counter `values`, and Meter `samples` as StatsD Counters instead of Gauges
      use-counters = ${cinnamon.chmetrics.statsd-reporter.use-counters}

      # Tags for all metrics, when Telegraf is enabled.
      # Uses a "key-value" approach to generate the tags.
      # E.g. the following configuration:
      # tags {
      #   country = "UK"
      # }
      # will generate this Telegraf tag: "country=UK"
      tags {}

      # Whether to include "unique dimensions" as tags.
      # These are tags that are unique to this reporter,
      # such as host name and application identifier.
      # Off by default for compatibility with earlier versions.
      unique-dimensions = off
    }
  }
}
```
Note
These settings are defined in the `reference.conf`. You only need to specify any of these settings when you want to override the defaults.

### DogStatsD datagram format

When using DogStatsD, the metric key will only represent the type of metric, while information about the Actor, Actor System, or Dispatcher will be provided as tags. As an example, the DogStatsD format for actor metrics is:

```
actors.<METRIC TYPE>.<SUB TYPE>:<VALUE>|g|#actor-system:<ACTOR SYSTEM>,dispatcher:<DISPATCHER>,actor:<ACTOR>

```

Example values of the above are:

| PART | VALUE |
| --- | --- |
| METRIC TYPE | processed\-messages |
| SUB TYPE | min1\_rate |
| VALUE | 81\.11 |
| ACTOR SYSTEM | BottleneckSample |
| DISPATCHER | frontend\-dispatcher |
| ACTOR | cinnamon\_sample\_bottleneck\_FrontEndRouter |

## Code Examples

### Example 1: Reporter dependency

```sbt
libraryDependencies += Cinnamon.library.cinnamonCHMetrics
libraryDependencies += Cinnamon.library.cinnamonCHMetricsStatsDReporter
```

### Example 2: Reporter dependency

```xml
<dependency>
    <groupId>com.lightbend.cinnamon</groupId>
    <artifactId>cinnamon-chmetrics</artifactId>
    <version>2.22.2</version>
</dependency>
<dependency>
  <groupId>com.lightbend.cinnamon</groupId>
  <artifactId>cinnamon-chmetrics-statsd-reporter</artifactId>
  <version>2.22.2</version>
</dependency>
```

### Example 3: Reporter dependency

```gradle
dependencies {
  implementation group: 'com.lightbend.cinnamon', name: 'cinnamon-chmetrics', version: '2.22.2'
}
dependencies {
  implementation group: 'com.lightbend.cinnamon', name: 'cinnamon-chmetrics-statsd-reporter', version: '2.22.2'
}
```

### Example 4: Configuration

```scala
cinnamon.chmetrics {
  reporters += "statsd-reporter"
}
```

### Example 5: Configuration

```scala
cinnamon.chmetrics {
  reporters += "statsd-reporter"

  statsd-reporter {
    host = "my.statsd.host"
    port = 8125
  }
}
```

### Example 6: Configuration

```conf
cinnamon.chmetrics {
  statsd-reporter {

    # StatsD host.
    host = "127.0.0.1"

    # StatsD port.
    port = 8125

    # Channel to use for sending statsd messages: udp (by-default) or tcp.
    channel = udp

    # Frequency of metric reporting to StatsD.
    frequency = 10s

    # Prefix for all metric keys.
    prefix = ""

    # Prefix for custom metrics. Defaults to `prefix` if not set.
    custom-metrics-prefix = null

    # Suffix for all metric keys.
    suffix = ""

    # Send Counter `values`, and Meter `samples` as StatsD Counters instead of Gauges
    use-counters = off

    # Whether to enable detailed debug logging for the StatsD reporter
    # This also requires enabling DEBUG in your logger for class:
    #   `com.lightbend.cinnamon.chmetrics.statsd.DebugStatsDClient`
    # AND setting the `akka.loglevel` configuration to DEBUG
    # Note: only use for troubleshooting as every packet send is logged
    debug = off

    # If debug logging is enabled, only debug every n:th report
    debug-every = 1

    report {
      # When `use-counters` is enabled, also report the total count as an additional `.total` gauge
      counter-totals = off

      # Histogram fields to report for metrics
      histogram = ["max", "min", "mean", "median", "stddev", "p75", "p95", "p98", "p99", "p999"]

      # Meter fields to report for metrics
      meter = ["samples", "samples.total", "min1_rate", "min5_rate", "min15_rate", "mean_rate"]
    }

    dogstatsd {
      # Whether DogStatsD format should be used
      enabled = off

      # Prefix for all metric keys, when DogStatsD is enabled
      prefix = ${cinnamon.chmetrics.statsd-reporter.prefix}

      # Prefix for custom metrics, when DogStatsD is enabled. Defaults to `prefix` if not set.
      custom-metrics-prefix = null

      # Suffix for all metric keys, when DogStatsD is enabled
      suffix = ${cinnamon.chmetrics.statsd-reporter.suffix}

      # Send Counter `values`, and Meter `samples` as StatsD Counters instead of Gauges
      use-counters = ${cinnamon.chmetrics.statsd-reporter.use-counters}

      # Tags for all metrics, when DogStatsD is enabled.
      # Uses a "key-value" approach to generate the tags.
      # E.g. the following configuration:
      # tags {
      #   country = "UK"
      # }
      # will generate this Datadog tag: "country:UK"
      tags {}

      # Whether to include "unique dimensions" as tags.
      # These are tags that are unique to this reporter,
      # such as host name and application identifier.
      # Off by default for compatibility with earlier versions.
      # Note: host tag is also already provided by DogStatsD
      unique-dimensions = off
    }

    telegraf {
      # Whether Telegraf format should be used or not
      enabled = off

      # Prefix for all metric keys, when Telegraf is enabled
      prefix = ${cinnamon.chmetrics.statsd-reporter.prefix}

      # Prefix for custom metrics, when Telegraf is enabled. Defaults to `prefix` if not set.
      custom-metrics-prefix = null

      # Suffix for all metric keys, when Telegraf is enabled
      suffix = ${cinnamon.chmetrics.statsd-reporter.suffix}

      # Send Counter `values`, and Meter `samples` as StatsD Counters instead of Gauges
      use-counters = ${cinnamon.chmetrics.statsd-reporter.use-counters}

      # Tags for all metrics, when Telegraf is enabled.
      # Uses a "key-value" approach to generate the tags.
      # E.g. the following configuration:
      # tags {
      #   country = "UK"
      # }
      # will generate this Telegraf tag: "country=UK"
      tags {}

      # Whether to include "unique dimensions" as tags.
      # These are tags that are unique to this reporter,
      # such as host name and application identifier.
      # Off by default for compatibility with earlier versions.
      unique-dimensions = off
    }
  }
}
```

### Example 7: Configuration

```scala
cinnamon.chmetrics {
  reporters += "statsd-reporter"
  statsd-reporter {
    channel = tcp
  }
}
```

### Example 8: Metrics format

```text
servers.<SERVER>.apps.<APPLICATION>.metrics.akka.systems.<ACTOR SYSTEM >.dispatchers.<DISPATCHER>.actors.<ACTOR>.<METRIC TYPE>.<SUB TYPE>:<VALUE>|g
```

### Example 9: Node to node communication format

```text
<servers>.<SERVER>.apps.<APPLICATION>.metrics.self-nodes.<SELF NODE>.remote-nodes.<REMOTE NODE>.<METRIC TYPE>:<VALUE>|g
```

### Example 10: Stopwatch format

```text
servers.<SERVER>.apps.<APPLICATION>.metrics.stopwatches.<STOPWATCH>.<METRIC TYPE>.<SUB TYPE>:<VALUE>|g
```

### Example 11: Server and application identifiers

```scala
cinnamon {
  host = "somewhere"
  application = "awesome-sauce"
}
```

### Example 12: Reporting deltas as counters

```scala
cinnamon.chmetrics {
  reporters += "statsd-reporter"

  statsd-reporter {
    # use delta-based counters
    use-counters = on
  }
}
```

### Example 13: Reporting deltas as counters

```scala
cinnamon.chmetrics {
  reporters += "statsd-reporter"

  statsd-reporter {
    # use delta-based counters
    use-counters = on

    report {
      # report both delta-based counters and totals
      counter-totals = on
    }
  }
}
```

### Example 14: DogStatsD

```scala
cinnamon.chmetrics {
  reporters += "statsd-reporter"

  statsd-reporter {
    dogstatsd {
      enabled = on
    }
  }
}
```

### Example 15: DogStatsD

```scala
cinnamon.chmetrics {
  reporters += "statsd-reporter"

  statsd-reporter {
    host = "my.statsd.host"
    port = 8125

    dogstatsd {
      enabled = on

      # optionally specify tags for all metrics
      tags {
        country = "UK"
      }

      # Optionally include "unique dimensions" as tags.
      # These are tags that are unique to this reporter,
      # such as host name and application identifier.
      unique-dimensions = on
    }
  }
}
```

### Example 16: DogStatsD

```conf
cinnamon.chmetrics {
  statsd-reporter {

    # StatsD host.
    host = "127.0.0.1"

    # StatsD port.
    port = 8125

    # Channel to use for sending statsd messages: udp (by-default) or tcp.
    channel = udp

    # Frequency of metric reporting to StatsD.
    frequency = 10s

    # Prefix for all metric keys.
    prefix = ""

    # Prefix for custom metrics. Defaults to `prefix` if not set.
    custom-metrics-prefix = null

    # Suffix for all metric keys.
    suffix = ""

    # Send Counter `values`, and Meter `samples` as StatsD Counters instead of Gauges
    use-counters = off

    # Whether to enable detailed debug logging for the StatsD reporter
    # This also requires enabling DEBUG in your logger for class:
    #   `com.lightbend.cinnamon.chmetrics.statsd.DebugStatsDClient`
    # AND setting the `akka.loglevel` configuration to DEBUG
    # Note: only use for troubleshooting as every packet send is logged
    debug = off

    # If debug logging is enabled, only debug every n:th report
    debug-every = 1

    report {
      # When `use-counters` is enabled, also report the total count as an additional `.total` gauge
      counter-totals = off

      # Histogram fields to report for metrics
      histogram = ["max", "min", "mean", "median", "stddev", "p75", "p95", "p98", "p99", "p999"]

      # Meter fields to report for metrics
      meter = ["samples", "samples.total", "min1_rate", "min5_rate", "min15_rate", "mean_rate"]
    }

    dogstatsd {
      # Whether DogStatsD format should be used
      enabled = off

      # Prefix for all metric keys, when DogStatsD is enabled
      prefix = ${cinnamon.chmetrics.statsd-reporter.prefix}

      # Prefix for custom metrics, when DogStatsD is enabled. Defaults to `prefix` if not set.
      custom-metrics-prefix = null

      # Suffix for all metric keys, when DogStatsD is enabled
      suffix = ${cinnamon.chmetrics.statsd-reporter.suffix}

      # Send Counter `values`, and Meter `samples` as StatsD Counters instead of Gauges
      use-counters = ${cinnamon.chmetrics.statsd-reporter.use-counters}

      # Tags for all metrics, when DogStatsD is enabled.
      # Uses a "key-value" approach to generate the tags.
      # E.g. the following configuration:
      # tags {
      #   country = "UK"
      # }
      # will generate this Datadog tag: "country:UK"
      tags {}

      # Whether to include "unique dimensions" as tags.
      # These are tags that are unique to this reporter,
      # such as host name and application identifier.
      # Off by default for compatibility with earlier versions.
      # Note: host tag is also already provided by DogStatsD
      unique-dimensions = off
    }

    telegraf {
      # Whether Telegraf format should be used or not
      enabled = off

      # Prefix for all metric keys, when Telegraf is enabled
      prefix = ${cinnamon.chmetrics.statsd-reporter.prefix}

      # Prefix for custom metrics, when Telegraf is enabled. Defaults to `prefix` if not set.
      custom-metrics-prefix = null

      # Suffix for all metric keys, when Telegraf is enabled
      suffix = ${cinnamon.chmetrics.statsd-reporter.suffix}

      # Send Counter `values`, and Meter `samples` as StatsD Counters instead of Gauges
      use-counters = ${cinnamon.chmetrics.statsd-reporter.use-counters}

      # Tags for all metrics, when Telegraf is enabled.
      # Uses a "key-value" approach to generate the tags.
      # E.g. the following configuration:
      # tags {
      #   country = "UK"
      # }
      # will generate this Telegraf tag: "country=UK"
      tags {}

      # Whether to include "unique dimensions" as tags.
      # These are tags that are unique to this reporter,
      # such as host name and application identifier.
      # Off by default for compatibility with earlier versions.
      unique-dimensions = off
    }
  }
}
```

### Example 17: Configuring metric fields

```scala
cinnamon.chmetrics {
  reporters += "statsd-reporter"

  statsd-reporter {
    report {
      histogram = ["max", "min", "mean", "p95", "p99"]
      meter = ["samples", "min1_rate"]
    }
  }
}
```

### Example 18: Configuring metric fields

```conf
cinnamon.chmetrics {
  statsd-reporter {

    # StatsD host.
    host = "127.0.0.1"

    # StatsD port.
    port = 8125

    # Channel to use for sending statsd messages: udp (by-default) or tcp.
    channel = udp

    # Frequency of metric reporting to StatsD.
    frequency = 10s

    # Prefix for all metric keys.
    prefix = ""

    # Prefix for custom metrics. Defaults to `prefix` if not set.
    custom-metrics-prefix = null

    # Suffix for all metric keys.
    suffix = ""

    # Send Counter `values`, and Meter `samples` as StatsD Counters instead of Gauges
    use-counters = off

    # Whether to enable detailed debug logging for the StatsD reporter
    # This also requires enabling DEBUG in your logger for class:
    #   `com.lightbend.cinnamon.chmetrics.statsd.DebugStatsDClient`
    # AND setting the `akka.loglevel` configuration to DEBUG
    # Note: only use for troubleshooting as every packet send is logged
    debug = off

    # If debug logging is enabled, only debug every n:th report
    debug-every = 1

    report {
      # When `use-counters` is enabled, also report the total count as an additional `.total` gauge
      counter-totals = off

      # Histogram fields to report for metrics
      histogram = ["max", "min", "mean", "median", "stddev", "p75", "p95", "p98", "p99", "p999"]

      # Meter fields to report for metrics
      meter = ["samples", "samples.total", "min1_rate", "min5_rate", "min15_rate", "mean_rate"]
    }

    dogstatsd {
      # Whether DogStatsD format should be used
      enabled = off

      # Prefix for all metric keys, when DogStatsD is enabled
      prefix = ${cinnamon.chmetrics.statsd-reporter.prefix}

      # Prefix for custom metrics, when DogStatsD is enabled. Defaults to `prefix` if not set.
      custom-metrics-prefix = null

      # Suffix for all metric keys, when DogStatsD is enabled
      suffix = ${cinnamon.chmetrics.statsd-reporter.suffix}

      # Send Counter `values`, and Meter `samples` as StatsD Counters instead of Gauges
      use-counters = ${cinnamon.chmetrics.statsd-reporter.use-counters}

      # Tags for all metrics, when DogStatsD is enabled.
      # Uses a "key-value" approach to generate the tags.
      # E.g. the following configuration:
      # tags {
      #   country = "UK"
      # }
      # will generate this Datadog tag: "country:UK"
      tags {}

      # Whether to include "unique dimensions" as tags.
      # These are tags that are unique to this reporter,
      # such as host name and application identifier.
      # Off by default for compatibility with earlier versions.
      # Note: host tag is also already provided by DogStatsD
      unique-dimensions = off
    }

    telegraf {
      # Whether Telegraf format should be used or not
      enabled = off

      # Prefix for all metric keys, when Telegraf is enabled
      prefix = ${cinnamon.chmetrics.statsd-reporter.prefix}

      # Prefix for custom metrics, when Telegraf is enabled. Defaults to `prefix` if not set.
      custom-metrics-prefix = null

      # Suffix for all metric keys, when Telegraf is enabled
      suffix = ${cinnamon.chmetrics.statsd-reporter.suffix}

      # Send Counter `values`, and Meter `samples` as StatsD Counters instead of Gauges
      use-counters = ${cinnamon.chmetrics.statsd-reporter.use-counters}

      # Tags for all metrics, when Telegraf is enabled.
      # Uses a "key-value" approach to generate the tags.
      # E.g. the following configuration:
      # tags {
      #   country = "UK"
      # }
      # will generate this Telegraf tag: "country=UK"
      tags {}

      # Whether to include "unique dimensions" as tags.
      # These are tags that are unique to this reporter,
      # such as host name and application identifier.
      # Off by default for compatibility with earlier versions.
      unique-dimensions = off
    }
  }
}
```

### Example 19: DogStatsD datagram format

```text
actors.<METRIC TYPE>.<SUB TYPE>:<VALUE>|g|#actor-system:<ACTOR SYSTEM>,dispatcher:<DISPATCHER>,actor:<ACTOR>
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/libraries/akka-insights/current/plugins/chmetrics/elastic.html
- https://doc.akka.io/libraries/akka-insights/current/plugins/chmetrics/filters.html
- https://doc.akka.io/libraries/akka-insights/current/plugins/chmetrics/intro.html
- https://doc.akka.io/libraries/akka-insights/current/plugins/chmetrics/reporters.html
- https://doc.akka.io/libraries/akka-insights/current/plugins/datadog/datadog.html
- https://doc.akka.io/libraries/akka-insights/current/plugins/plugins.html
- https://doc.akka.io/libraries/akka-insights/current/setup/setup.html
- https://doc.akka.io/libraries/akka-insights/current/visualizations/grafana.html

---
*Source: [https://doc.akka.io/libraries/akka-insights/current/plugins/chmetrics/statsd.html](https://doc.akka.io/libraries/akka-insights/current/plugins/chmetrics/statsd.html)*