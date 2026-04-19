---
description: Telemetry for Lightbend Platform
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:00:30Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-insights/current//introduction/introduction.html
title: Introduction • Akka Insights
---

# Introduction • Akka Insights

> **Summary:** Telemetry for Lightbend Platform

## Content

# Introduction

Distributed systems are complex and have many moving parts, much of which are asynchronous and run in parallel. When building complex systems, it is best to consider design in small chunks that are composable. Instrumenting complex systems is no different. Akka Insights breaks capture down into composable parts that will provide better insight into your system.

## Overview

Akka Insights provides insight into applications built with Akka. It does so by instrumenting frameworks and toolkits such as Akka. The instrumentation is done by a Java agent that runs when your application is starting up. Akka Insights (a.k.a. Cinnamon) collects information, in runtime, about your application based on a configuration that you must provide. As you can see below, Cinnamon is running in the same JVM as your application.

![Cinnamon single node](../images/cinnamon-single-node.png)

Based on configuration, Akka Insights will send data to a backend of your choice, providing integrations with Elasticsearch, StatsD, Datadog, JMX, etc. It is also possible to provide a custom integration should the backend of your choice not be available.

![Cinnamon single node reporter](../images/cinnamon-single-node-reporter.png)

### Cinnamon running in a cluster

If you run a cluster or multiple nodes in general, Cinnamon will run on each node. *Each individual node* will report to the backend you have configured:

![Cinnamon multiple nodes](../images/cinnamon-multiple-nodes.png)

### Cinnamon integration

By using configuration, you can instruct how Cinnamon should report the information it is collecting. Out of the box, Cinnamon provides several plugins.

Below is an example of what this may look like for integration with Elasticsearch. In this example, we also use Kibana and Grafana to retrieve and display the information that gets published into Elasticsearch. This also happens to be the setup of the [Cinnamon developer sandbox environment](../sandbox/start.html): an easy way to bootstrap and try Cinnamon out.

![Cinnamon elasticsearch integration](../images/cinnamon-es.png)

## Akka Insights architecture

Akka Insights is built up from multiple parts, described here below. Akka Insights requires a [subscription](https://www.lightbend.com/lightbend-platform-subscription). You can [contact Lightbend](https://www.lightbend.com/contact) to request an evaluation.

## Instrumentations

Instrumentations are the enablers of our stack that hook into the underlying toolkit or framework for our telemetry solution. Currently, we support Akka, Scala Futures, and Java Futures with the following feature sets:

- [Akka](../instrumentations/akka/akka.html): captures telemetry (metrics, events, or traces) for Akka Actors, Akka Remoting, Akka Cluster, and Akka Persistence.
- [Akka Streams](../instrumentations/akka-streams/akka-streams.html): captures telemetry (metrics, events, or traces) for Akka Streams.
- [Akka HTTP](../instrumentations/akka-http/akka-http.html): captures server, endpoint, and client telemetry (metrics or traces) for Akka HTTP applications.
- [Scala Futures](../instrumentations/scala/scala-futures.html): captures telemetry (metrics or traces) for explicitly named Futures.
- [Java Futures](../instrumentations/java/java-futures.html): captures telemetry (metrics or traces) for explicitly named CompletableFutures.

## Instruments

Instruments are the nitty gritty of our stack. Keeping composable design in mind, we classify our instruments into one of three categories: *metrics*, *events*, or *traces*. Our metrics represent a unit of measure within a time constraint, whereas our events embody historical behavior.

- *Metrics* include counters, gauges, and rates.
- *Events* include errors, unhandled messages, and dead letters.
- *Traces* follow asynchronous or distributed message flows.

## Extensions

Asynchronous boundaries are one of the primary challenges behind instrumenting distributed systems. It is difficult to reason about behavior when stuff does not happen in the order we think it should. To manage this, Akka Insights provides context propagation in the form of `OpenTracing` integration, `Mapped Diagnostic Context (MDC)`, and the `Stopwatch` extension. You can think of them as buckets designed to capture data of a particular type or path regardless of when or where it occurs.

- [OpenTracing](../extensions/opentracing/opentracing.html)
- [SLF4J MDC](../extensions/mdc.html)
- [Stopwatch](../extensions/stopwatch.html)
- [Custom Events](../extensions/custom-events.html)
- [Custom Metrics](../extensions/custom-metrics.html)
- [JMX Importer](../extensions/jmximporter/jmximporter.html)
- [JVM Metrics producer](../extensions/jvmmetricsproducer.html)
- [Producers](../extensions/producers.html)

## Backend Plugins

Our telemetry solution is designed to support pluggable backends for `metric`, `event`, and `trace` data. Akka Insights provides the following backend plugins:

- [Prometheus](../plugins/prometheus/prometheus.html) *(metrics and event rates)*
- [Datadog](../plugins/datadog/datadog.html) *(metrics and event rates)*
- [Coda Hale Metrics](../plugins/chmetrics/intro.html) *(metrics and event rates)*
- [StatsD](../plugins/chmetrics/statsd.html) *(metrics and event rates)*
- [Elasticsearch](../plugins/chmetrics/elastic.html) *(metrics and events)*
- [SLF4J events](../plugins/slf4jevents/slf4j-events.html) *(events)*
- [Jaeger](../extensions/opentracing/jaeger.html#jaeger-reporter) *(traces)*
- [Zipkin](../extensions/opentracing/zipkin.html#zipkin-reporter) *(traces)*
- [Datadog](../extensions/opentracing/datadog.html#datadog-reporter) *(traces)*

It is possible to use multiple backends simultaneously.

## Visualizations

At the end of the day, we have to reason about the data we capture, and as they say, a picture is worth a thousand words. In this vein, we provide plugins for the following visualization suites:

- [Datadog](../visualizations/datadog.html)
- [Grafana](../visualizations/grafana.html)

## Developer sandbox

Akka Insights provides a [developer sandbox](../sandbox/start.html) environment that you can use to quickly get started. Unless you already have your monitoring infrastructure set up, using the developer sandbox is the fastest way to test your application with Akka Insights. The developer sandbox comes prepackaged with Elasticsearch, Kibana and Grafana all configured to be used in together. The developer sandbox is only for testing purposes and is *not* intended for production.

## Related Pages (Internal Links)

- https://doc.akka.io/libraries/akka-insights/2.19/extensions/custom-events.html
- https://doc.akka.io/libraries/akka-insights/2.19/extensions/custom-metrics.html
- https://doc.akka.io/libraries/akka-insights/2.19/extensions/jmximporter/jmximporter.html
- https://doc.akka.io/libraries/akka-insights/2.19/extensions/jvmmetricsproducer.html
- https://doc.akka.io/libraries/akka-insights/2.19/extensions/mdc.html
- https://doc.akka.io/libraries/akka-insights/2.19/extensions/opentracing/datadog.html
- https://doc.akka.io/libraries/akka-insights/2.19/extensions/opentracing/jaeger.html
- https://doc.akka.io/libraries/akka-insights/2.19/extensions/opentracing/opentracing.html
- https://doc.akka.io/libraries/akka-insights/2.19/extensions/opentracing/zipkin.html
- https://doc.akka.io/libraries/akka-insights/2.19/extensions/producers.html
- https://doc.akka.io/libraries/akka-insights/2.19/extensions/stopwatch.html
- https://doc.akka.io/libraries/akka-insights/2.19/home.html
- https://doc.akka.io/libraries/akka-insights/2.19/instrumentations/akka-http/akka-http.html
- https://doc.akka.io/libraries/akka-insights/2.19/instrumentations/akka-streams/akka-streams.html
- https://doc.akka.io/libraries/akka-insights/2.19/instrumentations/akka/akka.html
- https://doc.akka.io/libraries/akka-insights/2.19/instrumentations/java/java-futures.html
- https://doc.akka.io/libraries/akka-insights/2.19/instrumentations/scala/scala-futures.html
- https://doc.akka.io/libraries/akka-insights/2.19/introduction/overview/features.html
- https://doc.akka.io/libraries/akka-insights/2.19/plugins/chmetrics/elastic.html
- https://doc.akka.io/libraries/akka-insights/2.19/plugins/chmetrics/intro.html
- https://doc.akka.io/libraries/akka-insights/2.19/plugins/chmetrics/statsd.html
- https://doc.akka.io/libraries/akka-insights/2.19/plugins/datadog/datadog.html
- https://doc.akka.io/libraries/akka-insights/2.19/plugins/prometheus/prometheus.html
- https://doc.akka.io/libraries/akka-insights/2.19/plugins/slf4jevents/slf4j-events.html
- https://doc.akka.io/libraries/akka-insights/2.19/sandbox/start.html
- https://doc.akka.io/libraries/akka-insights/2.19/visualizations/datadog.html
- https://doc.akka.io/libraries/akka-insights/2.19/visualizations/grafana.html

---
*Source: [https://doc.akka.io/libraries/akka-insights/2.19/introduction/introduction.html](https://doc.akka.io/libraries/akka-insights/2.19/introduction/introduction.html)*