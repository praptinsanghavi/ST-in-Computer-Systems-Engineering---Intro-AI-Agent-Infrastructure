---
description: Telemetry for Akka libraries
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:44:07Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-insights/current/home.html/plugins/chmetrics/elastic.html
title: Elasticsearch • Akka Insights
---

# Elasticsearch • Akka Insights

> **Summary:** Telemetry for Akka libraries

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Elasticsearch

The Elasticsearch reporter works with versions `5.x`, `6.x`, `7.x` and `8.x` of Elasticsearch.

## Cinnamon dependency

First make sure that your build is configured to use the [Cinnamon Agent](../../setup/setup.html).

## Reporter dependency

Add the [core Coda Hale Metrics dependency](reporters.html#cinnamon-dependency) and the Elasticsearch reporter dependency to your build:

sbt

```
libraryDependencies += Cinnamon.library.cinnamonCHMetrics
libraryDependencies += Cinnamon.library.cinnamonCHMetricsElasticsearchReporter
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
    <artifactId>cinnamon-chmetrics-elasticsearch-reporter</artifactId>
    <version>2.22.2</version>
</dependency>
```

Gradle

```
dependencies {
  implementation group: 'com.lightbend.cinnamon', name: 'cinnamon-chmetrics', version: '2.22.2'
}
dependencies {
  implementation group: 'com.lightbend.cinnamon', name: 'cinnamon-chmetrics-elasticsearch-reporter', version: '2.22.2'
}
```

Note
The [default Coda Hale Metrics module](reporters.html#cinnamon-dependency) uses Metrics 4 but [Coda Hale Metrics 3](reporters.html#metrics-3) can also be used.

## Reporter configuration

Below is the configuration needed to set up either version of the Elasticsearch reporter. The Reference tab shows all the configurable settings for the Elasticsearch reporter.

Required

```
cinnamon.chmetrics {
  reporters += elasticsearch-reporter
}
```

Reference

```
cinnamon.chmetrics {
  elasticsearch-reporter {

    # A list of hosts used to connect to elasticsearch.
    # Must be in the format `[http://][username:password@]hostname:port`.
    hosts = ["localhost:9200"]

    # Username and password to be used with all hosts (that don't define credentials directly).
    # Basic authentication is enabled when both username and password are non-empty.
    basic-auth {
      username = ""
      password = ""
    }

    # Additional fields to be included will all metrics.
    # Structured config data will be converted to structured JSON.
    # E.g. the following configuration:
    #   additional-fields {
    #     country = "UK"
    #     environment {
    #       role = "staging"
    #       run = 123456
    #     }
    #   }
    # will add those fields to every metric document in Elasticsearch.
    additional-fields {}

    # Milliseconds to wait for an established connection, before the next host in the list is tried.
    timeout = 1000

    # Defines how many metrics are sent per bulk requests.
    bulksize = 2500

    # The name of the index to write to, defaults to metrics.
    index = "cinnamon-metrics"

    # The date format to make sure to rotate to a new index.
    index-date-format = "yyyy-MM"

    # The field name of the timestamp (kibana default is @timestamp).
    timestamp-field-name = "@timestamp"

    # Frequency with which to report metrics.
    frequency = 10s

    # JSON files containing index mappings.
    # Default mapping will be applied if no file is specified.
    index-mapping-file-names = []

    # Whether to enable detailed debug logging for the Elasticsearch reporter.
    # This also requires enabling DEBUG in your logger for class:
    #   `com.lightbend.cinnamon.chmetrics.elasticsearch.CinnamonElasticsearchReporter`
    # AND setting the `akka.loglevel` configuration to DEBUG
    # Note: only use for troubleshooting.
    debug = off

    # Default to use legacy template api.
    # set to `true` to use the index template api.
    v8-composable-index-template = false

    percolation {
      # MetricFilter to define which metrics should be percolated.
      filter = "empty-filter"

      empty-filter {
        filter-class = "com.lightbend.cinnamon.chmetrics.elasticsearch.EmptyFilter"
      }

      # Implementation of the Notifier interface, which is executed upon a matching percolator.
      notifier = "empty-notifier"

      empty-notifier {
        notifier-class = "com.lightbend.cinnamon.chmetrics.elasticsearch.EmptyNotifier"
      }
    }
  }
}
```

Note
These settings are defined in the `reference.conf`. You only need to specify any of these settings when you want to override the defaults.

### HTTP authentication

To set credentials for Elasticsearch using HTTP Basic Authentication, configure the `basic-auth` section for the reporter:

```
cinnamon.chmetrics {
  reporters += elasticsearch-reporter
  elasticsearch-reporter {
    hosts = ["https://somewhere.org:9200"]
    basic-auth {
      username = "elastic"
      password = "changeme"
    }
  }
}
```

You can specify that connections should be secured using SSL/TLS by including the `https` scheme.

The credentials can also be set individually on each host (and this will be selected over the global `basic-auth` configuration):

```
cinnamon.chmetrics {
  reporters += elasticsearch-reporter
  elasticsearch-reporter {
    hosts = ["https://elastic:[[email protected]](/cdn-cgi/l/email-protection):9200"]
  }
}
```

### Host and application identifiers

The host and application identifiers reported to Elasticsearch are based on the shared [Cinnamon metadata](../plugins.html#cinnamon-metadata), and will default to the local host name and the Java main class. To configure these, use the `cinnamon.host` and `cinnamon.application` settings. For example:

```
cinnamon {
  host = "somewhere"
  application = "awesome-sauce"
}
```

### Additional fields

Additional fields can be added for all metrics reported to Elasticsearch. Configure the `additional-fields` section for the reporter:

```
cinnamon.chmetrics {
  reporters += elasticsearch-reporter
  elasticsearch-reporter {
    additional-fields {
      country = "UK"
      environment {
        role = "staging"
        run = 123456
      }
    }
  }
}
```

With the configuration above, the following additional fields will be reported along with every metric document to Elasticsearch:

```
"country": "UK",
"environment": { "role": "staging", "run": 123456 }
```

## Code Examples

### Example 1: Reporter dependency

```sbt
libraryDependencies += Cinnamon.library.cinnamonCHMetrics
libraryDependencies += Cinnamon.library.cinnamonCHMetricsElasticsearchReporter
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
    <artifactId>cinnamon-chmetrics-elasticsearch-reporter</artifactId>
    <version>2.22.2</version>
</dependency>
```

### Example 3: Reporter dependency

```gradle
dependencies {
  implementation group: 'com.lightbend.cinnamon', name: 'cinnamon-chmetrics', version: '2.22.2'
}
dependencies {
  implementation group: 'com.lightbend.cinnamon', name: 'cinnamon-chmetrics-elasticsearch-reporter', version: '2.22.2'
}
```

### Example 4: Reporter configuration

```scala
cinnamon.chmetrics {
  reporters += elasticsearch-reporter
}
```

### Example 5: Reporter configuration

```conf
cinnamon.chmetrics {
  elasticsearch-reporter {

    # A list of hosts used to connect to elasticsearch.
    # Must be in the format `[http://][username:password@]hostname:port`.
    hosts = ["localhost:9200"]

    # Username and password to be used with all hosts (that don't define credentials directly).
    # Basic authentication is enabled when both username and password are non-empty.
    basic-auth {
      username = ""
      password = ""
    }

    # Additional fields to be included will all metrics.
    # Structured config data will be converted to structured JSON.
    # E.g. the following configuration:
    #   additional-fields {
    #     country = "UK"
    #     environment {
    #       role = "staging"
    #       run = 123456
    #     }
    #   }
    # will add those fields to every metric document in Elasticsearch.
    additional-fields {}

    # Milliseconds to wait for an established connection, before the next host in the list is tried.
    timeout = 1000

    # Defines how many metrics are sent per bulk requests.
    bulksize = 2500

    # The name of the index to write to, defaults to metrics.
    index = "cinnamon-metrics"

    # The date format to make sure to rotate to a new index.
    index-date-format = "yyyy-MM"

    # The field name of the timestamp (kibana default is @timestamp).
    timestamp-field-name = "@timestamp"

    # Frequency with which to report metrics.
    frequency = 10s

    # JSON files containing index mappings.
    # Default mapping will be applied if no file is specified.
    index-mapping-file-names = []

    # Whether to enable detailed debug logging for the Elasticsearch reporter.
    # This also requires enabling DEBUG in your logger for class:
    #   `com.lightbend.cinnamon.chmetrics.elasticsearch.CinnamonElasticsearchReporter`
    # AND setting the `akka.loglevel` configuration to DEBUG
    # Note: only use for troubleshooting.
    debug = off

    # Default to use legacy template api.
    # set to `true` to use the index template api.
    v8-composable-index-template = false

    percolation {
      # MetricFilter to define which metrics should be percolated.
      filter = "empty-filter"

      empty-filter {
        filter-class = "com.lightbend.cinnamon.chmetrics.elasticsearch.EmptyFilter"
      }

      # Implementation of the Notifier interface, which is executed upon a matching percolator.
      notifier = "empty-notifier"

      empty-notifier {
        notifier-class = "com.lightbend.cinnamon.chmetrics.elasticsearch.EmptyNotifier"
      }
    }
  }
}
```

### Example 6: HTTP authentication

```scala
cinnamon.chmetrics {
  reporters += elasticsearch-reporter
  elasticsearch-reporter {
    hosts = ["https://somewhere.org:9200"]
    basic-auth {
      username = "elastic"
      password = "changeme"
    }
  }
}
```

### Example 7: HTTP authentication

```scala
cinnamon.chmetrics {
  reporters += elasticsearch-reporter
  elasticsearch-reporter {
    hosts = ["https://elastic:[email protected]:9200"]
  }
}
```

### Example 8: Host and application identifiers

```scala
cinnamon {
  host = "somewhere"
  application = "awesome-sauce"
}
```

### Example 9: Additional fields

```scala
cinnamon.chmetrics {
  reporters += elasticsearch-reporter
  elasticsearch-reporter {
    additional-fields {
      country = "UK"
      environment {
        role = "staging"
        run = 123456
      }
    }
  }
}
```

### Example 10: Additional fields

```scala
"country": "UK",
"environment": { "role": "staging", "run": 123456 }
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/cdn-cgi/l/email-protection
- https://doc.akka.io/libraries/akka-insights/current/plugins/chmetrics/reporters.html
- https://doc.akka.io/libraries/akka-insights/current/plugins/chmetrics/statsd.html
- https://doc.akka.io/libraries/akka-insights/current/plugins/plugins.html
- https://doc.akka.io/libraries/akka-insights/current/setup/setup.html

---
*Source: [https://doc.akka.io/libraries/akka-insights/current/plugins/chmetrics/elastic.html](https://doc.akka.io/libraries/akka-insights/current/plugins/chmetrics/elastic.html)*