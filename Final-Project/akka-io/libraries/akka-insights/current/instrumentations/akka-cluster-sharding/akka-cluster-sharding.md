---
description: Telemetry for Akka libraries
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:28:14Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-insights/current/home.html/instrumentations/akka-cluster-sharding/akka-cluster-sharding.html
title: Akka Cluster Sharding • Akka Insights
---

# Akka Cluster Sharding • Akka Insights

> **Summary:** Telemetry for Akka libraries

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Akka Cluster Sharding

Akka Insights is capable of capturing additional data for [Akka Cluster Sharding](https://doc.akka.io/libraries/akka-core/current/cluster-sharding.html). These metrics are collected via the built\-in Akka Cluster Sharding telemetry SPI, providing visibility into shard region buffer usage, shard home resolution latency, message drops, and shard handoff operations.

Note
For shard region delivered messages, shards per region, and entities per shard metrics, see the [Akka Cluster metrics](../akka/akka.html#cluster-metrics) section.

## Cinnamon Akka Cluster Sharding module dependency

After adding the Cinnamon Agent as described in the [setup](../../setup/setup.html), make sure that you add the Cinnamon Akka Cluster Sharding module dependency to your build file:

sbt

```
// Use Akka Cluster Sharding instrumentation
libraryDependencies += Cinnamon.library.cinnamonAkkaClusterSharding
```

Maven

```
<!-- Use Akka Cluster Sharding instrumentation -->
<dependency>
  <groupId>com.lightbend.cinnamon</groupId>
  <artifactId>cinnamon-akka-cluster-sharding_2.13</artifactId>
  <version>2.22.2</version>
</dependency>
```

Gradle

```
// Use Akka Cluster Sharding instrumentation
dependencies {
    implementation group: 'com.lightbend.cinnamon', name: 'cinnamon-akka-cluster-sharding_2.13', version: '2.22.2'
}
```

## Cluster Sharding metrics

The following Cluster Sharding metrics are recorded, type of metric in parenthesis. All metrics are recorded per shard region entity type name. These metrics are enabled automatically when the module dependency is added — no additional configuration is required.

Note
All time\-related metrics use nanoseconds unless specified otherwise.

### Shard Region metrics:

- **Shard region buffer size** (gauge) — the current number of messages buffered in the shard region while waiting for shard homes to be resolved by the coordinator.
- **Shard region message dropped** (counter) — number of messages dropped when the shard region buffer is full.
- **Shard home latency** (recorder) — the time from when the shard region requests a shard home from the coordinator until the shard home is received. This measures the latency of shard allocation and can indicate coordinator responsiveness issues.
- **Shard handoff latency** (recorder) — the time from when a shard handoff is initiated until the handoff completes. This measures the duration of shard rebalancing operations between nodes.

## Code Examples

### Example 1: Cinnamon Akka Cluster Sharding module dependency

```sbt
// Use Akka Cluster Sharding instrumentation
libraryDependencies += Cinnamon.library.cinnamonAkkaClusterSharding
```

### Example 2: Cinnamon Akka Cluster Sharding module dependency

```xml
<!-- Use Akka Cluster Sharding instrumentation -->
<dependency>
  <groupId>com.lightbend.cinnamon</groupId>
  <artifactId>cinnamon-akka-cluster-sharding_2.13</artifactId>
  <version>2.22.2</version>
</dependency>
```

### Example 3: Cinnamon Akka Cluster Sharding module dependency

```gradle
// Use Akka Cluster Sharding instrumentation
dependencies {
    implementation group: 'com.lightbend.cinnamon', name: 'cinnamon-akka-cluster-sharding_2.13', version: '2.22.2'
}
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/libraries/akka-core/current/cluster-sharding.html
- https://doc.akka.io/libraries/akka-insights/current/instrumentations/akka-persistence/akka-persistence.html
- https://doc.akka.io/libraries/akka-insights/current/instrumentations/akka/akka.html
- https://doc.akka.io/libraries/akka-insights/current/instrumentations/akka/ask-pattern.html
- https://doc.akka.io/libraries/akka-insights/current/setup/setup.html

---
*Source: [https://doc.akka.io/libraries/akka-insights/current/instrumentations/akka-cluster-sharding/akka-cluster-sharding.html](https://doc.akka.io/libraries/akka-insights/current/instrumentations/akka-cluster-sharding/akka-cluster-sharding.html)*