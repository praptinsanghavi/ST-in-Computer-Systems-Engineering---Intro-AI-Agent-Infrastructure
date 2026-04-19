---
description: Telemetry for Lightbend Platform
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:23:47Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-insights/current//instrumentations/akka-streams/akka-streams.html
title: Akka Streams • Akka Insights
---

# Akka Streams • Akka Insights

> **Summary:** Telemetry for Lightbend Platform

## Content

# Akka Streams

Akka Insights is capable of capturing data for the following [Akka Streams](https://doc.akka.io/libraries/akka-core/current/stream/index.html) related features.

## Cinnamon Akka Stream dependency

After adding the Cinnamon Agent as described in the [setup](../../setup/setup.html), make sure that you add the Cinnamon Akka Stream module dependency to your build file:

sbt

```
libraryDependencies += Cinnamon.library.cinnamonAkkaStream
```

Maven

```
<dependency>
  <groupId>com.lightbend.cinnamon</groupId>
  <artifactId>cinnamon-akka-stream_2.13</artifactId>
  <version>2.19.4</version>
</dependency>
```

Gradle

```
dependencies {
  implementation group: 'com.lightbend.cinnamon', name: 'cinnamon-akka-stream_2.13', version: '2.19.4'
}
```

## Terminology

Cinnamon aligns its terminology with Akka. You can find definitions for terminology used [in the documentation for Akka Streams](https://doc.akka.io/libraries/akka-core/current/stream/stream-flows-and-basics.html).

## Akka Stream metrics

The following metrics are recorded for instrumented Akka Streams, type of metric in parentheses:

- **Running streams** (counter) — the number of streams currently running (as identified by reporting configuration).
- **Running operators per stream** (counter) — the total number of operators currently running per stream (as identified by reporting configuration).
- **Running operators** (counter) — the number of operator instances currently running (as identified by reporting configuration).
- **Stream throughput** (rate) — the rate of elements being processed by a stream as a whole (measured at the sinks).
- **Operator throughput** (rate) — the rate of elements that have been processed by an operator.
- **Operator processing time** (recorder) — the time for processing elements through an operator.

Throughput and processing time metrics are illustrated in this diagram:

![Throughput and processing time metrics](../../images/stream-core-metrics.png)

## Akka Stream events

The following events are recorded for instrumented Akka Streams:

- **Operator failure** — event when an operator fails.

## Akka Stream extended metrics

In addition to the core metrics described above, [extended metrics](akka-stream-extended.html) can be enabled for recording end\-to\-end flow time, stream demand, latency, and per connection metrics.

## Akka Stream configuration

To configure telemetry for Akka Streams see:

- [Akka Stream configuration](akka-stream-configuration.html)

To configure extended telemetry for Akka Streams see:

- [Akka Stream extended telemetry](akka-stream-extended.html)

## Akka Stream telemetry use cases

Some [telemetry use cases for Akka Streams](akka-stream-use-cases.html) describe how the metrics can be used for performance analysis and illustrate what to expect.

## Code Examples

### Example 1: Cinnamon Akka Stream dependency

```sbt
libraryDependencies += Cinnamon.library.cinnamonAkkaStream
```

### Example 2: Cinnamon Akka Stream dependency

```xml
<dependency>
  <groupId>com.lightbend.cinnamon</groupId>
  <artifactId>cinnamon-akka-stream_2.13</artifactId>
  <version>2.19.4</version>
</dependency>
```

### Example 3: Cinnamon Akka Stream dependency

```gradle
dependencies {
  implementation group: 'com.lightbend.cinnamon', name: 'cinnamon-akka-stream_2.13', version: '2.19.4'
}
```

## Related Pages (Internal Links)

- https://doc.akka.io/libraries/akka-core/current/stream/index.html
- https://doc.akka.io/libraries/akka-core/current/stream/stream-flows-and-basics.html
- https://doc.akka.io/libraries/akka-insights/2.19/instrumentations/akka-persistence/persistent-actors-configuration.html
- https://doc.akka.io/libraries/akka-insights/2.19/instrumentations/akka-streams/akka-stream-configuration.html
- https://doc.akka.io/libraries/akka-insights/2.19/instrumentations/akka-streams/akka-stream-extended.html
- https://doc.akka.io/libraries/akka-insights/2.19/instrumentations/akka-streams/akka-stream-use-cases.html
- https://doc.akka.io/libraries/akka-insights/2.19/setup/setup.html

---
*Source: [https://doc.akka.io/libraries/akka-insights/2.19/instrumentations/akka-streams/akka-streams.html](https://doc.akka.io/libraries/akka-insights/2.19/instrumentations/akka-streams/akka-streams.html)*