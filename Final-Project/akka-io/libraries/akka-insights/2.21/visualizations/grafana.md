---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:24:29Z'
section: libraries
site: akka-io
source_url: /visualizations/grafana.html
title: Grafana • Akka Insights
---

# Grafana • Akka Insights

## Content

# Grafana

Akka Insights provides pre\-defined dashboards for [Grafana](https://grafana.com/), a leading open source software time series analytics.

Grafana integrates with several time\-series databases, e.g. Prometheus, Elasticsearch, InfluxDB, etc.

This section describes how to download, install, and use the dashboards in Grafana.

## Grafana dashboards

Akka Insights provides several predefined dashboard templates including:

- [Akka metrics](../instrumentations/akka/akka.html) : metrics for [actors](../instrumentations/akka/akka.html#actor-metrics), [remote actors](../instrumentations/akka/akka.html#actor-remote-metrics), [cluster](../instrumentations/akka/akka.html#cluster-metrics), and more.
- [Akka events](../instrumentations/akka/akka.html) : [actor events](../instrumentations/akka/akka.html#actor-events) (such as dead letters or unhandled messages), [cluster events](../instrumentations/akka/akka.html#cluster-events), and more.
- Akka HTTP [server](../instrumentations/akka-http/akka-http.html#akka-http-server-metrics) and [client](../instrumentations/akka-http/akka-http.html#akka-http-client-metrics) metrics.
- Akka Stream [core](../instrumentations/akka-streams/akka-streams.html#akka-stream-metrics) and [extended](../instrumentations/akka-streams/akka-stream-extended.html) metrics.
- [Stopwatch](../extensions/stopwatch.html) metrics : information about Stopwatches that have been programmatically added.
- JVM information : heap and garbage collection information.
- … and more.

Note
The dashboards have been tested with Grafana v4 and v5\.

### Download dashboards

The example dashboards are packaged in zip files to download:

- [Download Prometheus dashboards](https://downloads.lightbend.com/cinnamon/grafana/cinnamon-grafana-prometheus-2.21.4.zip)
- [Download Elasticsearch dashboards](https://downloads.lightbend.com/cinnamon/grafana/cinnamon-grafana-elasticsearch-2.21.4.zip)
- [Download Graphite dashboards](https://downloads.lightbend.com/cinnamon/grafana/cinnamon-grafana-graphite-2.21.4.zip)

Below you can see the actor and dispatcher dashboards:

![Actors dashboard](../images/grafana-actors-dashboard.png)

![Dispatchers dashboard](../images/grafana-dispatchers-dashboard.png)

## Running Grafana

The simplest way to get started with Grafana is to use the [Grafana Docker image](https://hub.docker.com/r/grafana/grafana/).

### Login

Once Grafana is started you should be able to login (default `user`/`password` is `admin`/`admin`), and define datasource so Grafana.

### Define a data source

Akka Insights provides dashboards for three different time\-series databases; Prometheus, Elasticsearch, and Graphite. Please follow the links below for how how to configure them:

Note
The data source must be correctly named for the templates to work.

- [Prometheus](https://grafana.com/docs/features/datasources/prometheus/) \- data source name to use: `Cinnamon Prometheus`
- [Elasticsearch](https://grafana.com/docs/features/datasources/elasticsearch/) \- data source name to use: `Cinnamon Elasticsearch`
- [Graphite](https://grafana.com/docs/features/datasources/graphite/) \- data source name to use: `Cinnamon Graphite`

### Import dashboards

First [download dashboards](grafana.html#download-dashboards) for the data source you’re using, either Prometheus, Elasticsearch, or Graphite. Follow [these steps](https://grafana.com/docs/reference/export_import/) to import dashboards.

## Run your application

With Grafana running, a defined data source, and imported dashboards it is time to run the application, have it configured to export into the time\-series database of choice, and the graphs will be populated with data points.

## Related Pages (Internal Links)

- https://doc.akka.io/libraries/akka-insights/2.21/extensions/stopwatch.html
- https://doc.akka.io/libraries/akka-insights/2.21/instrumentations/akka-http/akka-http.html
- https://doc.akka.io/libraries/akka-insights/2.21/instrumentations/akka-streams/akka-stream-extended.html
- https://doc.akka.io/libraries/akka-insights/2.21/instrumentations/akka-streams/akka-streams.html
- https://doc.akka.io/libraries/akka-insights/2.21/instrumentations/akka/akka.html
- https://doc.akka.io/libraries/akka-insights/2.21/visualizations/datadog.html
- https://doc.akka.io/libraries/akka-insights/2.21/visualizations/grafana.html
- https://doc.akka.io/libraries/akka-insights/2.21/visualizations/vizceral.html

---
*Source: [https://doc.akka.io/libraries/akka-insights/2.21/visualizations/grafana.html](https://doc.akka.io/libraries/akka-insights/2.21/visualizations/grafana.html)*