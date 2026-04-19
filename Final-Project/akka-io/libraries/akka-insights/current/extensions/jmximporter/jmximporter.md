---
description: Telemetry for Akka libraries
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:44:00Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-insights/current/home.html/extensions/jmximporter/jmximporter.html
title: JMX Importer • Akka Insights
---

# JMX Importer • Akka Insights

> **Summary:** Telemetry for Akka libraries

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# JMX Importer

The JMX Importer enables fetching data out of JMX MBeans and create metrics out of these via configuration. This section contains information how to set things up.

## Dependency

Add the JMX Importer dependency to your build:

sbt

```
libraryDependencies += Cinnamon.library.cinnamonJmxImporter
```

Maven

```
<dependency>
    <groupId>com.lightbend.cinnamon</groupId>
    <artifactId>cinnamon-jmx-importer</artifactId>
    <version>2.22.2</version>
</dependency>
```

Gradle

```
dependencies {
    implementation group: 'com.lightbend.cinnamon', name: 'cinnamon-jmx-importer', version: '2.22.2'
}
```

## Configuration

To configure the JMX Importer we must, apart from defining its context `cinnamon.jmx-importer`, provide settings for `beans`.

Required

> No required configuration is needed for the importer to load, but without any beans definition there won’t be any metrics created.

Reference

```
cinnamon {
  jmx-importer {

    # The name keys to search for in the query string.
    #
    # Expected format: "<DOMAIN>:type=someType,<QUERY-NAME-KEY>=someName"
    # By default the following two formats will be searched for:
    # "<DOMAIN>:type=someType,name=someName"
    # "<DOMAIN>:type=someType,client-id=someName"
    #
    # Add any required identifiers that are needed to the list below.
    query-name-keys = ["name", "client-id"]

    identity {
      domain {
        category = "domains"
        key = "domain"
      }

      type {
        category = "types"
        key = "type"
      }

      name {
        category = "names"
        key = "name"
      }

      attribute {
        category = "attributes"
        key = "attribute"
      }
    }

    descriptor {
      group-name = "metrics"
    }

    # enabling this config overrides the per-bean configs
    suppress-log-warnings = false
  }
}
```
Note
These settings are defined in the `reference.conf`. You only need to specify any of these settings when you want to override the defaults.

#### The beans setting

The `beans` setting is where we define what JMX beans to retrieve and what attributes of them that should be used to create metrics. This section consists of a couple of subparts:

- `query`: query used to retrieve the beans from JMX
- `suppress-log-warnings`: indicates if any warnings, when getting JMX info for this bean, should be suppressed \- *optional and defaults to `false`*
- `attributes`: attributes that should be converted to metrics. Each attribute must contain the following:
	- `attribute`: name of the attribute
	- `type`: type of metrics that should be generated
- `additional-identity-keys`: additional identities to include in final output \- *optional and defaults to `[]`*. Each identity must contain the following:
	- `category`: The category applied to the identity
	- `key`: The key which should be included. i.e. `<context>:type=<someType>,name=<someName>,`\*\*`additionalKey=<someValue>`\*\*

Note
Use the global config `cinnamon.jmx-importer.suppress-log-warnings = true` (instead of the per\-bean config) to suppress any warnings when getting JMX info for this bean.

The JMX Importer currently supports two types of metrics:

- `GAUGE_LONG`: generates a `com.lightbend.cinnamon.metric.ProvidingGaugeLong`.
- `GAUGE_DOUBLE`: generates a `com.lightbend.cinnamon.metric.ProvidingGaugeDouble`.

#### Alternative query name format

The query format normally follows the pattern `<context>:type=<someType>,name=<someName>` but some clients, e.g. Kafka, use `client-id` instead of `name`. The Cinnamon JmxImporter is configurable to look for any key defined in the setting `cinnamon.jmx-importer.query-name-keys`. By default it will look for `name` and fall back to `client-id` if the former is not found. It is also possible to define custom keys. For more information see the “Reference” tab in the configuration above.

#### Extending the settings

Should you want to add more MBeans in your configuration, this can be done in the following way:

```
cinnamon.jmx-importer.beans = ${cinnamon.jmx-importer.beans} [
  // your bean definition(s) 
]

```

### Example configurations

Let us take a look at some examples to get a better idea of what things can look like.

#### Simple

A simple configuration with which we get all beans in the domain `someDomain`, with type `*`, and name `*`. `*` represents wildcard, i.e. match everything in that context. Each bean matching is expected to have the attribute `SomeAttribute` and the type for this attribute is a long.

```
cinnamon.jmx-importer {
  beans = [
    {
      query = "someDomain:type=*,name=*",
      suppress-log-warnings = yes,
      attributes = [
        {
          attribute = "SomeAttribute",
          metric-type = "GAUGE_LONG"
        }
      ]
    }
  ]
}
```

#### JVM

An example of how to use the JMX Producer to generate some JVM related metrics in Cinnamon.

```
cinnamon.jmx-importer {
  beans = [
    {
      query = "java.lang:type=GarbageCollector,name=*"
      attributes = [
        {
          attribute = "CollectionCount",
          metric-type = "GAUGE_LONG"
        },
        {
          attribute = "CollectionTime",
          metric-type = "GAUGE_LONG"
        }
      ]
    },
    {
      query = "java.lang:type=OperatingSystem"
      attributes = [
        {
          attribute = "SystemCpuLoad",
          metric-type = "GAUGE_DOUBLE"
        }
      ]
    }
  ]
}
```

The above configuration will generate four unique metrics in Cinnamon.

#### Additional Identity Information

An example of how to output additional identity information beyond the defaults (domain/type/name/attributes). This example will include the partition and topic keys, which are useful for filtering purposes.

```
cinnamon.jmx-importer {
  beans = [
    {
      query = "kafka.server:type=BrokerTopicMetrics,name=BytesInPerSec,partition=*,topic=*",
      attributes = [
        {
          attribute = "Count",
          metric-type = "GAUGE_DOUBLE"
        }
      ]
      additional-identity-keys = [
        {
          category = "partitions"
          key = "partition"
        },
        {
          category = "topics"
          key = "topic"
        }
      ]
    }
  ]
}
```

## Output format

The output format depends on how metrics are reported, i.e. what reporter(s) that have been configured to be used. Whatever reporter used, the idea is to mimic the layout of the MBeans explorer in Java Mission Control. As an example, using the JVM configuration here above would generate the following format:

#### StatsD

Metrics output:

```
servers.<your server>.apps.<your app>.metrics.jmx.domains.java_lang.types.GarbageCollector.names.PS_MarkSweep.attributes.CollectionCount.CollectionCount
servers.<your server>.apps.<your app>.metrics.jmx.domains.java_lang.types.GarbageCollector.names.PS_MarkSweep.attributes.CollectionTime.CollectionTime
servers.<your server>.apps.<your app>.metrics.jmx.domains.java_lang.types.GarbageCollector.names.PS_Scavange.attributes.CollectionCount.CollectionCount
servers.<your server>.apps.<your app>.metrics.jmx.domains.java_lang.types.OperatingSystem.attributes.SystemCpuLoad.SystemCpuLoad

```

#### Elasticsearch

Metric output for one of the configured beans:

```
{
  ... some metadata
  "application" : <your app>,
  "attribute" : "SystemCpuLoad",
  "domain" : "java.lang",
  "host" : <your host>,
  "metric" : "attributes.SystemCpuLoad",
  "type" : "OperatingSystem"
}

```

## Code Examples

### Example 1: Dependency

```sbt
libraryDependencies += Cinnamon.library.cinnamonJmxImporter
```

### Example 2: Dependency

```xml
<dependency>
    <groupId>com.lightbend.cinnamon</groupId>
    <artifactId>cinnamon-jmx-importer</artifactId>
    <version>2.22.2</version>
</dependency>
```

### Example 3: Dependency

```gradle
dependencies {
    implementation group: 'com.lightbend.cinnamon', name: 'cinnamon-jmx-importer', version: '2.22.2'
}
```

### Example 4: Configuration

```conf
cinnamon {
  jmx-importer {

    # The name keys to search for in the query string.
    #
    # Expected format: "<DOMAIN>:type=someType,<QUERY-NAME-KEY>=someName"
    # By default the following two formats will be searched for:
    # "<DOMAIN>:type=someType,name=someName"
    # "<DOMAIN>:type=someType,client-id=someName"
    #
    # Add any required identifiers that are needed to the list below.
    query-name-keys = ["name", "client-id"]

    identity {
      domain {
        category = "domains"
        key = "domain"
      }

      type {
        category = "types"
        key = "type"
      }

      name {
        category = "names"
        key = "name"
      }

      attribute {
        category = "attributes"
        key = "attribute"
      }
    }

    descriptor {
      group-name = "metrics"
    }

    # enabling this config overrides the per-bean configs
    suppress-log-warnings = false
  }
}
```

### Example 5: Extending the settings

```text
cinnamon.jmx-importer.beans = ${cinnamon.jmx-importer.beans} [
  // your bean definition(s) 
]
```

### Example 6: Simple

```scala
cinnamon.jmx-importer {
  beans = [
    {
      query = "someDomain:type=*,name=*",
      suppress-log-warnings = yes,
      attributes = [
        {
          attribute = "SomeAttribute",
          metric-type = "GAUGE_LONG"
        }
      ]
    }
  ]
}
```

### Example 7: JVM

```scala
cinnamon.jmx-importer {
  beans = [
    {
      query = "java.lang:type=GarbageCollector,name=*"
      attributes = [
        {
          attribute = "CollectionCount",
          metric-type = "GAUGE_LONG"
        },
        {
          attribute = "CollectionTime",
          metric-type = "GAUGE_LONG"
        }
      ]
    },
    {
      query = "java.lang:type=OperatingSystem"
      attributes = [
        {
          attribute = "SystemCpuLoad",
          metric-type = "GAUGE_DOUBLE"
        }
      ]
    }
  ]
}
```

### Example 8: Additional Identity Information

```scala
cinnamon.jmx-importer {
  beans = [
    {
      query = "kafka.server:type=BrokerTopicMetrics,name=BytesInPerSec,partition=*,topic=*",
      attributes = [
        {
          attribute = "Count",
          metric-type = "GAUGE_DOUBLE"
        }
      ]
      additional-identity-keys = [
        {
          category = "partitions"
          key = "partition"
        },
        {
          category = "topics"
          key = "topic"
        }
      ]
    }
  ]
}
```

### Example 9: StatsD

```text
servers.<your server>.apps.<your app>.metrics.jmx.domains.java_lang.types.GarbageCollector.names.PS_MarkSweep.attributes.CollectionCount.CollectionCount
servers.<your server>.apps.<your app>.metrics.jmx.domains.java_lang.types.GarbageCollector.names.PS_MarkSweep.attributes.CollectionTime.CollectionTime
servers.<your server>.apps.<your app>.metrics.jmx.domains.java_lang.types.GarbageCollector.names.PS_Scavange.attributes.CollectionCount.CollectionCount
servers.<your server>.apps.<your app>.metrics.jmx.domains.java_lang.types.OperatingSystem.attributes.SystemCpuLoad.SystemCpuLoad
```

### Example 10: Elasticsearch

```text
{
  ... some metadata
  "application" : <your app>,
  "attribute" : "SystemCpuLoad",
  "domain" : "java.lang",
  "host" : <your host>,
  "metric" : "attributes.SystemCpuLoad",
  "type" : "OperatingSystem"
}
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/libraries/akka-insights/current/extensions/jmximporter/predefined.html
- https://doc.akka.io/libraries/akka-insights/current/extensions/producers.html

---
*Source: [https://doc.akka.io/libraries/akka-insights/current/extensions/jmximporter/jmximporter.html](https://doc.akka.io/libraries/akka-insights/current/extensions/jmximporter/jmximporter.html)*