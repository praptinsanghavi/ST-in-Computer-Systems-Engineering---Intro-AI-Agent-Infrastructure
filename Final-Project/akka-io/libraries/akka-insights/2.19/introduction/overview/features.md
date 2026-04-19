---
description: Telemetry for Lightbend Platform
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:24:08Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-insights/current//introduction/overview/features.html
title: Features • Akka Insights
---

# Features • Akka Insights

> **Summary:** Telemetry for Lightbend Platform

## Content

# Features

This section contains an overview of the features available in Akka Insights.

Supported versions are for Akka 23\.10:

- Java 11 and 17
- Scala 2\.13 and 3\.3
- Akka 2\.9
- Akka HTTP 10\.6
- Akka gRPC 2\.4
- Akka Projections 1\.5
- Alpakka Kafka 5

See below for detailed information about the support.

## Akka related information

Akka Insights captures a plentitude of actor related information such as mailbox size, time in mailbox, message processing time, stash size, unhandled messages, deadletters, to name a few.

More information about the Akka related metrics and events that Akka Insights supports can be found in the tables below.

### Actor metrics

| Metric | Type | Akka 2\.9 |
| --- | --- | --- |
| Mailbox size | Recorder | √ |
| Mailbox time | Recorder | √ |
| Processed msg | Rate | √ |
| Processing time | Recorder | √ |
| Running actors | Counter | √ |
| Sent msg | Rate | √ |
| Stash size | Rate | √ |

### Router metrics

| Metric | Type | Akka 2\.9 |
| --- | --- | --- |
| Processed msg | Rate | √ |
| Processing time | Recorder | √ |

### Actor events

| Event Type | Akka 2\.9 |
| --- | --- |
| Deadletter | √ |
| Failure (exception) | √ |
| Log error | √ |
| Log warning | √ |
| Unhandled msg | √ |

### Remote actor metrics

| Metric | Type | Akka 2\.9 |
| --- | --- | --- |
| Deserialization time | Recorder | √ |
| Phi accrual value | GaugeDouble | √ |
| Phi accrual threshold value | GaugeDouble | √ |
| Received msg | Rate | √ |
| Received msg size | Recorder | √ |
| Sent msg | Rate | √ |
| Sent msg size | Recorder | √ |
| Serialization time | Recorder | √ |

### Remote actor events

| Event Type | Akka 2\.9 |
| --- | --- |
| Large msg received | √ |
| Large msg sent | √ |
| Node quarantined | √ |

### Cluster related events

| Event Type | Akka 2\.9 |
| --- | --- |
| Current cluster state event | √ |
| Domain event | √ |
| Member event | √ |
| Singleton event | √ |
| Shard region event | √ |

| Event Type | Akka 2\.9 |
| --- | --- |
| Node unable to join | √ |

### Cluster related metrics

| Metric | Type | Akka 2\.9 |
| --- | --- | --- |
| Shard region delivered messages | Rate | √ |
| Shards regions per node | Gauge | √ |
| Shards per shard region | Gauge | √ |
| Shards entities per shard | Gauge | √ |
| Reachable nodes | Counter | √ |
| Unreachable nodes | Counter | √ |

### Split Brain Resolver events

| Event Type | Akka 2\.9 |
| --- | --- |
| SBR event | √ |

## Ask Pattern

### Ask Pattern metrics

Some Ask Pattern metrics (marked with \*) support opt\-in automatic dimensions. It allows to collect metrics by the message type. In order to enable it see [the Ask Pattern message type dimensions](../../instrumentations/akka/ask-pattern.html#dimensions).

| Metric | Type | Akka 2\.9 |
| --- | --- | --- |
| Asked requests\* | Rate | √ |
| Expired requests\* | Rate | √ |
| Expired requests by\-timeout | Rate | √ |
| Success response time\* | Recorder | √ |
| Late response time\* | Recorder | √ |

### Ask Pattern events

| Event Type | Akka 2\.9 |
| --- | --- |
| Request failed | √ |
| Request expired | √ |

### Akka Persistence metrics

Metrics generated related to Akka Persistence. `RecoveryPermitter` is an internal Akka actor that keeps track of the number of recovery permits available, for more information see [Recovery](https://doc.akka.io/libraries/akka-core/current/persistence.html#recovery).

Some Akka Persistence metrics (marked with \*) support opt\-in automatic dimensions. It allows to collect metrics by the command type and by the event type depending on the metric. In order to enable it see [the Akka Persistence automatic dimensions](../../instrumentations/akka-persistence/persistent-actors-configuration.html#dimensions).

| Metric | Type | Akka 2\.9 |
| --- | --- | --- |
| Active entities | Gauge | √ |
| Received commands\* | Gauge | √ |
| Persistence command time in stash\* | Recorder | √ |
| Persistence command processing time\* | Recorder | √ |
| Persistence recovery time | Recorder | √ |
| Persistence recovery failure time | Recorder | √ |
| Persisted events\* | Gauge | √ |
| Persistence event time\* | Recorder | √ |
| `RecoveryPermitter` used permits | Recorder | √ |
| `RecoveryPermitter` pending actors | Recorder | √ |
| `RecoveryPermitter` max permits value | Gauge | √ |

### Akka Persistence events

| Event Type | Akka 2\.9 |
| --- | --- |
| Persistence recovery failure | √ |
| Persistence persist failure | √ |
| Persistence persist rejection | √ |

### Akka Projection metrics

Metrics generated related to Akka Projection.

| Metric | Type | Akka Projection 1\.5 |
| --- | --- | --- |
| Active projections | Gauge | √ |
| Processed envelopes | Gauge | √ |
| Offsets committed | Gauge | √ |
| Wait time | Recorder | √ |
| Service time | Recorder | √ |
| Residence time | Recorder | √ |

### Akka Projection events

| Event Type | Akka Projection 1\.5 |
| --- | --- |
| Processing error | √ |
| Projection failure | √ |

### Akka Stream metrics (core)

| Metric | Type | Akka 2\.9 |
| --- | --- | --- |
| Running streams | Counter | √ |
| Running operators per stream | Counter | √ |
| Running operators | Counter | √ |
| Stream throughput | Rate | √ |
| Operator throughput | Rate | √ |
| Operator processing time | Recorder | √ |

### Akka Stream events

| Event Type | Akka 2\.9 |
| --- | --- |
| Operator failure event | √ |

### Akka Stream metrics (extended)

| Metric | Type | Akka 2\.9 |
| --- | --- | --- |
| Stream flow time | Recorder | √ |
| Stream flow active time | Recorder | √ |
| Stream flow efficiency | Recorder | √ |
| Operator flow time | Recorder | √ |
| Operator latency | Recorder | √ |
| Operator demand | Rate | √ |
| Operator demand processing time | Recorder | √ |
| Operator demand latency | Recorder | √ |
| Connection throughput | Rate | √ |
| Connection processing time | Recorder | √ |
| Connection latency | Recorder | √ |
| Connection demand | Rate | √ |
| Connection demand processing time | Recorder | √ |
| Connection demand latency | Recorder | √ |

### Akka HTTP server metrics

The following metrics are per Akka HTTP server. There can be multiple servers running in one JVM.

| Metric | Type | Akka HTTP 10\.6 |
| --- | --- | --- |
| Connections | Rate | √ |
| Requests | Rate | √ |
| Responses | Rate | √ |
| Responses 2xx | Rate | √ |
| Responses 3xx | Rate | √ |
| Responses 4xx | Rate | √ |
| Responses 5xx | Rate | √ |
| Response time | Recorder | √ |
| Response time 2xx | Recorder | √ |
| Response time 3xx | Recorder | √ |
| Response time 4xx | Recorder | √ |
| Response time 5xx | Recorder | √ |

### Akka HTTP server endpoint metrics

The following metrics are per endpoint and server. An endpoint corresponds to a URI, e.g. `/users` or `/account`.

| Metric | Type | Akka HTTP 10\.6 |
| --- | --- | --- |
| Endpoint responses | Rate | √ |
| Endpoint response time | Recorder | √ |

### Akka Http client metrics

The following metrics are per Akka Http client.

| Metric | Type | Akka HTTP 10\.6 |
| --- | --- | --- |
| Client requests | Rate | √ |
| Client service response time | Recorder | √ |

## Scala Future metrics

| Metric | Type | Scala 2\.13\.x | Scala 3\.3\.x |
| --- | --- | --- | --- |
| Created futures | Rate | √ | √ |
| Completing time | Recorder | √ | √ |
| Scheduled futures | Recorder | √ | √ |
| Scheduling time | Recorder | √ | √ |
| Processed futures | Rate | √ | √ |
| Processing time | Recorder | √ | √ |

## Java Future metrics

| Metric | Type | Java 11 | Java 17 |
| --- | --- | --- | --- |
| Created futures | Rate | √ | √ |
| Completing time | Recorder | √ | √ |
| Scheduled futures | Recorder | √ | √ |
| Scheduling time | Recorder | √ | √ |
| Processed futures | Rate | √ | √ |
| Processing time | Recorder | √ | √ |

## Related Pages (Internal Links)

- https://doc.akka.io/libraries/akka-core/current/persistence.html
- https://doc.akka.io/libraries/akka-insights/2.19/getting-started/start.html
- https://doc.akka.io/libraries/akka-insights/2.19/instrumentations/akka-persistence/persistent-actors-configuration.html
- https://doc.akka.io/libraries/akka-insights/2.19/instrumentations/akka/ask-pattern.html
- https://doc.akka.io/libraries/akka-insights/2.19/introduction/introduction.html

---
*Source: [https://doc.akka.io/libraries/akka-insights/2.19/introduction/overview/features.html](https://doc.akka.io/libraries/akka-insights/2.19/introduction/overview/features.html)*