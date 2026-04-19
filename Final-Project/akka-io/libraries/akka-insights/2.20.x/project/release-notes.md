---
description: Telemetry for Lightbend Platform
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:44:22Z'
section: libraries
site: akka-io
source_url: https://developer.lightbend.com/docs/telemetry/current//project/release-notes.html
title: Release notes • Lightbend Telemetry
---

# Release notes • Lightbend Telemetry

> **Summary:** Telemetry for Lightbend Platform

## Content

# Release notes

## 📦 Lightbend Telemetry 2\.20\.x

Migration Guide: [Migration guide for Lightbend Telemetry 2\.20](migration.html)

This release of Cinnamon adds exclusive support for [Akka 24\.05](https://akka.io/blog/news/2024/05/17/akka-24.05-released).

Note
From Cinnamon 2\.18 onward, each Cinnamon release will only support a single Akka release.

The following Akka 24\.05 modules are supported for this Cinnamon release:

- Akka (core) \>\= 2\.9\.3
- Akka HTTP \>\= 10\.6\.3
- Akka gRPC \>\= 2\.4\.3
- Akka Projections \>\= 1\.5\.4
- Alpakka Kafka \>\= 6\.0\.0

On the following versions of Scala and Java:

- Scala 2\.13 and 3\.3
- Java 11, 17, and 21

This release of Cinnamon includes these features:

#### Java 21

Cinnamon 2\.20 supports running on Java 21, and instrumentation of Java 21 CompletableFutures.

#### Akka circuit breakers

Cinnamon 2\.20 adds instrumentation for named [circuit breakers](../instrumentations/akka/akka.html#circuit-breaker-metrics), with metrics and state change events.

#### OpenTelemetry

Cinnamon 2\.20 adds [OpenTelemetry integration](../plugins/opentelemetry/intro.html) for metrics and events, and a new [developer sandbox for OpenTelemetry](../sandbox/opentelemetry-sandbox.html).

Application logs can be exported as OpenTelemetry log records by using a [log appender](../plugins/opentelemetry/logs.html).

#### Datadog Java agent 1\.x

Cinnamon supports the latest version of the Datadog Java agent and OpenTracing integration. Note that there are some [limitations](../extensions/opentracing/datadog.html#limitations-and-troubleshooting) when running both the Cinnamon and Datadog Java agents.

### Lightbend Telemetry 2\.20\.4

*Released: 20 November 2024*

- Fix the Coda Hale Metrics \- HTTP reporter when using a version of akka that requires a license key (e.g. 2\.9\.7\)

### Lightbend Telemetry 2\.20\.3

*Released: 01 August 2024*

- Protect against trying to instrument Akka Circuit Breaker when the Cinnamon Agent is not enabled
- Fixes to the projections dashboard template

### Lightbend Telemetry 2\.20\.2

*Released: 09 July 2024*

- Bump log4j to version `2.17.2` to fix [CVE\-2021\-45046](https://github.com/advisories/GHSA-7rjr-3q55-vv33)
- New config `cinnamon.jmx-importer.suppress-log-warnings` to suppress warnings that may be logged during JMX bean usage edge cases
- Document the declaration of the Cinnamon Akka Cluster dependency

### Lightbend Telemetry 2\.20\.1

*Released: 29 May 2024*

#### OpenTelemetry

Added support for exporting application [logs as OpenTelemetry log records](../plugins/opentelemetry/logs.html). Supported log backends:

- [OpenTelemetry logback appender](../plugins/opentelemetry/logs.html#logback-appender)
- [OpenTelemetry log4j appender](../plugins/opentelemetry/logs.html#log4j-appender).

### Lightbend Telemetry 2\.20\.0

*Released: 16 May 2024*

- Add support for Java 21
- Add instrumentation for Akka circuit breakers
- Add OpenTelemetry integration for metrics and events
- Support latest Datadog Java agent and tracing integration
- Fix balancing pools so that work sharing does not result in negative values

## Previous release notes

[Lightbend Telemetry 2\.19 release notes](https://developer.lightbend.com/docs/telemetry/2.19.x/project/release-notes.html)

## Related Pages (Internal Links)

- https://doc.akka.io/libraries/akka-insights/2.20.x/extensions/opentracing/datadog.html
- https://doc.akka.io/libraries/akka-insights/2.20.x/instrumentations/akka/akka.html
- https://doc.akka.io/libraries/akka-insights/2.20.x/plugins/opentelemetry/intro.html
- https://doc.akka.io/libraries/akka-insights/2.20.x/plugins/opentelemetry/logs.html
- https://doc.akka.io/libraries/akka-insights/2.20.x/project/migration.html
- https://doc.akka.io/libraries/akka-insights/2.20.x/sandbox/opentelemetry-sandbox.html

---
*Source: [https://doc.akka.io/libraries/akka-insights/2.20.x/project/release-notes.html](https://doc.akka.io/libraries/akka-insights/2.20.x/project/release-notes.html)*