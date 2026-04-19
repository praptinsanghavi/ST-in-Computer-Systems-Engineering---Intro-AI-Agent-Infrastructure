---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:24:23Z'
section: libraries
site: akka-io
source_url: /plugins/chmetrics/intro.html
title: Coda Hale Metrics • Akka Insights
---

# Coda Hale Metrics • Akka Insights

## Content

# Coda Hale Metrics

Akka Insights supports [Coda Hale Metrics](https://metrics.dropwizard.io), which is a toolkit for gathering metrics. Coda Hale Metrics supports various reporting plugins, and can be used to export actor metrics data to your own monitoring infrastructure. The following reporters are supported out\-of\-the\-box:

- [JMX](reporters.html#jmx-reporter)
- [Console](reporters.html#console-reporter)
- [SLF4J](reporters.html#slf4j-reporter)
- [HTTP](reporters.html#http-reporter)

Using [StatsD](statsd.html) is such a common integration pattern that it is highlighted it in a separate section.

It is also possible to add additional metrics that gets reported via the same reporting mechanism as the actor metrics. The following additional metrics are supported out\-of\-the\-box:

- [Memory Usage](registrants.html#memory-usage)
- [Garbage Collection](registrants.html#garbage-collection)
- [Class Loading](registrants.html#class-loading)

> Coda Hale Metrics does not process **events** natively. Therefore, we send all event information as metric rates which results in the loss of any contextual information.

Cinnamon provides an API through which you can wire up any Coda Hale Metrics reporter, including your own custom reporter. The following sections will describe how to set up provided reporters and metrics or how to integrate custom reporters.

## Metrics 4 \- NoClassDefFoundError: JmxReporter

Coda Hale Metrics 4 moved the `com.codahale.metrics.JmxReporter` class into an external dependency.

If you depend on Metrics 4 in your Cinnamon setup (i.e., `Cinnamon.library.cinnamonCHMetrics`) and also import another dependency that transitively depends on Metrics 3, you may see errors like this:

```
java.lang.NoClassDefFoundError: com/codahale/metrics/JmxReporter
at com.datastax.driver.core.Metrics.<init>(Metrics.java:146)

```

This issue has come up when using the [Datastax Java driver](https://docs.datastax.com/en/developer/java-driver/3.7/manual/metrics/). Their documentation includes a section specifically on [Metrics 4\.x compatibility](https://docs.datastax.com/en/developer/java-driver/3.7/manual/metrics/#metrics-4-compatibility).

Another potential fix is to specifically use [Metrics 3](reporters.html#metrics-3) in your Cinnamon configuration.

# Contents

## Code Examples

### Example 1: Metrics 4 - NoClassDefFoundError: JmxReporter

```text
java.lang.NoClassDefFoundError: com/codahale/metrics/JmxReporter
at com.datastax.driver.core.Metrics.<init>(Metrics.java:146)
```

## Related Pages (Internal Links)

- https://doc.akka.io/libraries/akka-insights/2.21/plugins/chmetrics/registrants.html
- https://doc.akka.io/libraries/akka-insights/2.21/plugins/chmetrics/reporters.html
- https://doc.akka.io/libraries/akka-insights/2.21/plugins/chmetrics/statsd.html
- https://doc.akka.io/libraries/akka-insights/2.21/plugins/newrelic/newrelic.html

---
*Source: [https://doc.akka.io/libraries/akka-insights/2.21/plugins/chmetrics/intro.html](https://doc.akka.io/libraries/akka-insights/2.21/plugins/chmetrics/intro.html)*