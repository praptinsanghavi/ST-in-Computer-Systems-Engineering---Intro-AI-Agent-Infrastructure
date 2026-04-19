---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:24:19Z'
section: libraries
site: akka-io
source_url: /extensions/jvmmetricsproducer.html
title: JVM Metrics Producer • Akka Insights
---

# JVM Metrics Producer • Akka Insights

## Content

# JVM Metrics Producer

The JVM Metrics Producer collects JVM related metrics. It uses `java.lang.management.ManagementFactory` to get to the underlying managed beans that contain the JVM information. 

Note
JVM metrics production is currently only supported in conjunction with an ActorSystem, as telemetry requires this to bootstrap. An ActorSystem needs to be initialized before JVM metrics production can be reported.

Add the JVM Metrics Producer dependency to your build:

### Dependency

sbt

```
libraryDependencies += Cinnamon.library.cinnamonJvmMetricsProducer
```

Maven

```
<dependency>
    <groupId>com.lightbend.cinnamon</groupId>
    <artifactId>cinnamon-jvm-metrics-producer</artifactId>
    <version>2.21.4</version>
</dependency>
```

Gradle

```
dependencies {
    implementation group: 'com.lightbend.cinnamon', name: 'cinnamon-jvm-metrics-producer', version: '2.21.4'
}
```

### Configuration

*Once the dependency has been added there is no need to do any further configuration*. By default all types of JVM metrics collected by the producer will generate metrics. This behavior is possible to override with the settings below: 

Reference

```
cinnamon {
  producers += jvm-metrics-producer

  jvm-metrics-producer {

    memory-usage {
      # Enable memory usage metrics
      metrics = on
      # The category name for all memory usage metrics
      category = "memory-usage"
    }

    garbage-collection {
      # Enable garbage collection metrics
      metrics = on
      # The category name for all garbage collection metrics
      category = "garbage-collection"
    }

    class-loading {
      # Enable class loading metrics
      metrics = on
      # The category name for all class loading metrics
      category = "class-loading"
    }
  }
}
```
Note
These settings are defined in the `reference.conf`. You only need to specify any of these settings when you want to override the defaults.

### Available Metrics

The following metrics is collected by the JVM Metrics Producer:

- Heap: committed, init, max, used.
- Non Heap: committed, init, max, used.
- Total Heap: committed, init, max, used.
- Memory Pools: committed, init, max, used, usage (for each memory pool)
- Garbage Collection: count, duration
- Classes: loaded, unloaded

## Code Examples

### Example 1: Dependency

```sbt
libraryDependencies += Cinnamon.library.cinnamonJvmMetricsProducer
```

### Example 2: Dependency

```xml
<dependency>
    <groupId>com.lightbend.cinnamon</groupId>
    <artifactId>cinnamon-jvm-metrics-producer</artifactId>
    <version>2.21.4</version>
</dependency>
```

### Example 3: Dependency

```gradle
dependencies {
    implementation group: 'com.lightbend.cinnamon', name: 'cinnamon-jvm-metrics-producer', version: '2.21.4'
}
```

### Example 4: Configuration

```conf
cinnamon {
  producers += jvm-metrics-producer

  jvm-metrics-producer {

    memory-usage {
      # Enable memory usage metrics
      metrics = on
      # The category name for all memory usage metrics
      category = "memory-usage"
    }

    garbage-collection {
      # Enable garbage collection metrics
      metrics = on
      # The category name for all garbage collection metrics
      category = "garbage-collection"
    }

    class-loading {
      # Enable class loading metrics
      metrics = on
      # The category name for all class loading metrics
      category = "class-loading"
    }
  }
}
```

## Related Pages (Internal Links)

- https://doc.akka.io/libraries/akka-insights/2.21/extensions/jmximporter/predefined.html
- https://doc.akka.io/libraries/akka-insights/2.21/plugins/plugins.html

---
*Source: [https://doc.akka.io/libraries/akka-insights/2.21/extensions/jvmmetricsproducer.html](https://doc.akka.io/libraries/akka-insights/2.21/extensions/jvmmetricsproducer.html)*