---
description: Telemetry for Lightbend Platform
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:24:00Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-insights/current//plugins/datadog/datadog.html
title: Datadog • Akka Insights
---

# Datadog • Akka Insights

> **Summary:** Telemetry for Lightbend Platform

## Content

# Datadog

We have partnered with [Datadog](https://www.datadoghq.com) to provide a plugin for Akka Insights for Akka with Datadog.

## Cinnamon dependency

We provide an easy\-to\-get\-started plugin that contains all settings required for pushing Lightbend related metrics to Datadog.

First make sure that your build is configured to use the [Cinnamon Agent](../../setup/setup.html).

Add the [core Coda Hale Metrics dependency](../chmetrics/reporters.html#cinnamon-dependency) and the Cinnamon Datadog dependency to your build:

sbt

```
libraryDependencies += Cinnamon.library.cinnamonCHMetrics
libraryDependencies += Cinnamon.library.cinnamonDatadog
```

Maven

```
<dependency>
  <groupId>com.lightbend.cinnamon</groupId>
  <artifactId>cinnamon-chmetrics</artifactId>
  <version>2.19.4</version>
</dependency>
<dependency>
  <groupId>com.lightbend.cinnamon</groupId>
  <artifactId>cinnamon-datadog</artifactId>
  <version>2.19.4</version>
</dependency>
```

Gradle

```
dependencies {
  implementation group: 'com.lightbend.cinnamon', name: 'cinnamon-chmetrics', version: '2.19.4'
}
dependencies {
  implementation group: 'com.lightbend.cinnamon', name: 'cinnamon-datadog', version: '2.19.4'
}
```

Note
The [default Coda Hale Metrics module](../chmetrics/reporters.html#cinnamon-dependency) uses Metrics 4 but [Coda Hale Metrics 3](../chmetrics/reporters.html#metrics-3) can also be used.

The Cinnamon Datadog reporter provides a configured [StatsD reporter](../chmetrics/statsd.html). The default values can be overridden should you want to change the default behavior.

Required

```
cinnamon.chmetrics {
  reporters += datadog-reporter
}
```

Example

```
cinnamon.chmetrics {
  reporters += datadog-reporter

  datadog-reporter {
    host = "192.168.0.1"
    port = 8888
    frequency = 60s

    report {
      histogram = ["min", "max", "p98", "p99", "p999"]
    }
  }
}
```

Datadog Reference

```
cinnamon.chmetrics {
  datadog-reporter = ${cinnamon.chmetrics.statsd-reporter} {
    dogstatsd {
      enabled = on

      # Prefix must be "lightbend" to enable the Lightbend Reactive Platform integration in Datadog
      prefix = "lightbend"

      # Prefix for custom metrics. Defaults to `prefix` if not set.
      custom-metrics-prefix = null
    }

    report {
      # Histogram fields to report for metrics
      histogram = ["max", "p99"]

      # Meter fields to report for metrics
      meter = ["min1_rate"]
    }
  }
}
```
Note
These settings are defined in the `reference.conf`. You only need to specify any of these settings when you want to override the defaults.

StatsD Reference

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

### Reporting deltas as counters

By default all metrics are reported as StatsD gauges. It is possible to have the Coda Hale counters and the samples field of Coda Hale meters reported as the delta between the current value and the last reported valus as a StatsD counter, by changing the configuration like this:

```
cinnamon.chmetrics {
  reporters += "datadog-reporter"

  datadog-reporter {
    dogstatsd {
      # use delta-based counters
      use-counters = on
    }

    report {
      # only report the samples counter for meters
      meter = ["samples"]
    }
  }
}
```

It’s also possible to have both the delta\-based counter and the total count reported as a gauge. The total count will be an additional gauge metric, named with a `.total` suffix. Enable the `counter-totals` setting in the Datadog reporting configuration. If the total count for meters (rates) is needed, include the `samples.total` field for reporting:

```
cinnamon.chmetrics {
  reporters += "datadog-reporter"

  datadog-reporter {
    dogstatsd {
      # use delta-based counters
      use-counters = on
    }

    report {
      # report both delta-based counters and totals
      counter-totals = on
      # report the samples counter and samples.total gauge for meters
      meter = ["samples", "samples.total"]
    }
  }
}
```

## Unix Domain Socket

The Datadog Agent is able to [ingest metrics via a Unix Domain Socket](https://docs.datadoghq.com/developers/dogstatsd/unix_socket/), as an alternative to UDP, when running on Linux systems. The Cinnamon Datadog reporter also supports sending metrics via a Unix Domain Socket.

To enable Unix Domain Socket support, use the `cinnamon-datadog-socket` dependency instead of the regular `cinnamon-datadog` dependency:

sbt

```
libraryDependencies += Cinnamon.library.cinnamonDatadogSocket
```

Maven

```
<dependency>
  <groupId>com.lightbend.cinnamon</groupId>
  <artifactId>cinnamon-datadog-socket</artifactId>
  <version>2.19.4</version>
</dependency>
```

Gradle

```
dependencies {
  implementation group: 'com.lightbend.cinnamon', name: 'cinnamon-datadog-socket', version: '2.19.4'
}
```

Then enable Unix Domain Socket support using configuration, providing the path to the socket:

Example

```
cinnamon.chmetrics {
  reporters += "datadog-reporter"

  datadog-reporter {
    channel = unix-domain-socket
    unix-domain-socket {
      path = /var/run/datadog/dsd.socket
    }
  }
}
```

Reference

```
cinnamon.chmetrics {
  statsd-reporter {
    unix-domain-socket {
      # If configured then statsd reporting will be via unix domain datagram socket at this path.
      path = null

      # SO_SNDBUF setting (in config bytes) for the unix domain datagram socket, otherwise system default.
      send-buffer-size = null

      # SO_SNDTIMEO setting (in config duration) for the unix domain datagram socket, otherwise system default.
      send-timeout = null
    }
  }
}
```
Note
These settings are defined in the `reference.conf`. You only need to specify any of these settings when you want to override the defaults.

## Datadog dependency

For information about how to get started with Datadog we refer to their excellent getting started instructions. Go to their [website](https://www.datadoghq.com), create an account and follow the instructions for your particular environment.

## Code Examples

### Example 1: Cinnamon dependency

```sbt
libraryDependencies += Cinnamon.library.cinnamonCHMetrics
libraryDependencies += Cinnamon.library.cinnamonDatadog
```

### Example 2: Cinnamon dependency

```xml
<dependency>
  <groupId>com.lightbend.cinnamon</groupId>
  <artifactId>cinnamon-chmetrics</artifactId>
  <version>2.19.4</version>
</dependency>
<dependency>
  <groupId>com.lightbend.cinnamon</groupId>
  <artifactId>cinnamon-datadog</artifactId>
  <version>2.19.4</version>
</dependency>
```

### Example 3: Cinnamon dependency

```gradle
dependencies {
  implementation group: 'com.lightbend.cinnamon', name: 'cinnamon-chmetrics', version: '2.19.4'
}
dependencies {
  implementation group: 'com.lightbend.cinnamon', name: 'cinnamon-datadog', version: '2.19.4'
}
```

### Example 4: Cinnamon dependency

```conf
cinnamon.chmetrics {
  reporters += datadog-reporter
}
```

### Example 5: Cinnamon dependency

```conf
cinnamon.chmetrics {
  reporters += datadog-reporter

  datadog-reporter {
    host = "192.168.0.1"
    port = 8888
    frequency = 60s

    report {
      histogram = ["min", "max", "p98", "p99", "p999"]
    }
  }
}
```

### Example 6: Cinnamon dependency

```conf
cinnamon.chmetrics {
  datadog-reporter = ${cinnamon.chmetrics.statsd-reporter} {
    dogstatsd {
      enabled = on

      # Prefix must be "lightbend" to enable the Lightbend Reactive Platform integration in Datadog
      prefix = "lightbend"

      # Prefix for custom metrics. Defaults to `prefix` if not set.
      custom-metrics-prefix = null
    }

    report {
      # Histogram fields to report for metrics
      histogram = ["max", "p99"]

      # Meter fields to report for metrics
      meter = ["min1_rate"]
    }
  }
}
```

### Example 7: Cinnamon dependency

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

### Example 8: Reporting deltas as counters

```scala
cinnamon.chmetrics {
  reporters += "datadog-reporter"

  datadog-reporter {
    dogstatsd {
      # use delta-based counters
      use-counters = on
    }

    report {
      # only report the samples counter for meters
      meter = ["samples"]
    }
  }
}
```

### Example 9: Reporting deltas as counters

```scala
cinnamon.chmetrics {
  reporters += "datadog-reporter"

  datadog-reporter {
    dogstatsd {
      # use delta-based counters
      use-counters = on
    }

    report {
      # report both delta-based counters and totals
      counter-totals = on
      # report the samples counter and samples.total gauge for meters
      meter = ["samples", "samples.total"]
    }
  }
}
```

### Example 10: Unix Domain Socket

```sbt
libraryDependencies += Cinnamon.library.cinnamonDatadogSocket
```

### Example 11: Unix Domain Socket

```xml
<dependency>
  <groupId>com.lightbend.cinnamon</groupId>
  <artifactId>cinnamon-datadog-socket</artifactId>
  <version>2.19.4</version>
</dependency>
```

### Example 12: Unix Domain Socket

```gradle
dependencies {
  implementation group: 'com.lightbend.cinnamon', name: 'cinnamon-datadog-socket', version: '2.19.4'
}
```

### Example 13: Unix Domain Socket

```scala
cinnamon.chmetrics {
  reporters += "datadog-reporter"

  datadog-reporter {
    channel = unix-domain-socket
    unix-domain-socket {
      path = /var/run/datadog/dsd.socket
    }
  }
}
```

### Example 14: Unix Domain Socket

```conf
cinnamon.chmetrics {
  statsd-reporter {
    unix-domain-socket {
      # If configured then statsd reporting will be via unix domain datagram socket at this path.
      path = null

      # SO_SNDBUF setting (in config bytes) for the unix domain datagram socket, otherwise system default.
      send-buffer-size = null

      # SO_SNDTIMEO setting (in config duration) for the unix domain datagram socket, otherwise system default.
      send-timeout = null
    }
  }
}
```

## Related Pages (Internal Links)

- https://doc.akka.io/libraries/akka-insights/2.19/plugins/chmetrics/reporters.html
- https://doc.akka.io/libraries/akka-insights/2.19/plugins/chmetrics/statsd.html
- https://doc.akka.io/libraries/akka-insights/2.19/plugins/newrelic/newrelic.html
- https://doc.akka.io/libraries/akka-insights/2.19/plugins/plugins.html
- https://doc.akka.io/libraries/akka-insights/2.19/setup/setup.html

---
*Source: [https://doc.akka.io/libraries/akka-insights/2.19/plugins/datadog/datadog.html](https://doc.akka.io/libraries/akka-insights/2.19/plugins/datadog/datadog.html)*