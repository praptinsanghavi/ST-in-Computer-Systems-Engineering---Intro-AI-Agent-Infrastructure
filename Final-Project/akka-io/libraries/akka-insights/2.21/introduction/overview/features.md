---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:24:30Z'
section: libraries
site: akka-io
source_url: /introduction/overview/features.html
title: Features • Akka Insights
---

# Features • Akka Insights

## Content

# Features

This section contains an overview of the features available in Akka Insights.

Supported versions are for Akka 24\.10:

- Java 11, 17, and 21
- Scala 2\.13 and 3\.3
- Akka 2\.10
- Akka HTTP 10\.7
- Akka gRPC 2\.5
- Akka Projections 1\.6
- Alpakka Kafka 7

See below for detailed information about the support.

## Akka related information

Akka Insights captures a plentitude of actor related information such as mailbox size, time in mailbox, message processing time, stash size, unhandled messages, deadletters, to name a few.

More information about the Akka related metrics and events that Akka Insights supports can be found in the tables below.

### Actor metrics

| Metric | Type |
| --- | --- |
| Mailbox size | Recorder |
| Mailbox time | Recorder |
| Processed msg | Rate |
| Processing time | Recorder |
| Running actors | Counter |
| Sent msg | Rate |
| Stash size | Rate |

### Router metrics

| Metric | Type |
| --- | --- |
| Processed msg | Rate |
| Processing time | Recorder |

### Actor events

| Event Type |
| --- |
| Deadletter |
| Failure (exception) |
| Log error |
| Log warning |
| Unhandled msg |

### Remote actor metrics

| Metric | Type |
| --- | --- |
| Deserialization time | Recorder |
| Phi accrual value | GaugeDouble |
| Phi accrual threshold value | GaugeDouble |
| Received msg | Rate |
| Received msg size | Recorder |
| Sent msg | Rate |
| Sent msg size | Recorder |
| Serialization time | Recorder |

### Remote actor events

| Event Type |
| --- |
| Large msg received |
| Large msg sent |
| Node quarantined |

### Cluster related events

| Event Type |
| --- |
| Current cluster state event |
| Domain event |
| Member event |
| Singleton event |
| Shard region event |

| Event Type |
| --- |
| Node unable to join |

### Cluster related metrics

| Metric | Type |
| --- | --- |
| Shard region delivered messages | Rate |
| Shards regions per node | Gauge |
| Shards per shard region | Gauge |
| Shards entities per shard | Gauge |
| Reachable nodes | Counter |
| Unreachable nodes | Counter |

### Split Brain Resolver events

| Event Type |
| --- |
| SBR event |

### Circuit breaker metrics

Circuit breaker are generated for all named circuit breakers.

| Metric | Type |
| --- | --- |
| Failure rate | Rate |
| Latency | Recorder |
| Success | Rate |
| Throughput | Rate |
| State of circuit breaker | GaugeLong |

## Circuit breaker events

| Event Type |
| --- |
| State change |

## Ask Pattern

### Ask Pattern metrics

Some Ask Pattern metrics (marked with \*) support opt\-in automatic dimensions. It allows to collect metrics by the message type. In order to enable it see [the Ask Pattern message type dimensions](../../instrumentations/akka/ask-pattern.html#dimensions).

| Metric | Type |
| --- | --- |
| Asked requests\* | Rate |
| Expired requests\* | Rate |
| Expired requests by\-timeout | Rate |
| Success response time\* | Recorder |
| Late response time\* | Recorder |

### Ask Pattern events

| Event Type |
| --- |
| Request failed |
| Request expired |

### Akka Persistence metrics

Metrics generated related to Akka Persistence. `RecoveryPermitter` is an internal Akka actor that keeps track of the number of recovery permits available, for more information see [Recovery](https://doc.akka.io/docs/akka/current/persistence.html#recovery).

Some Akka Persistence metrics (marked with \*) support opt\-in automatic dimensions. It allows to collect metrics by the command type and by the event type depending on the metric. In order to enable it see [the Akka Persistence automatic dimensions](../../instrumentations/akka-persistence/persistent-actors-configuration.html#dimensions).

| Metric | Type |
| --- | --- |
| Active entities | Gauge |
| Received commands\* | Gauge |
| Persistence command time in stash\* | Recorder |
| Persistence command processing time\* | Recorder |
| Persistence recovery time | Recorder |
| Persistence recovery failure time | Recorder |
| Persisted events\* | Gauge |
| Persistence event time\* | Recorder |
| `RecoveryPermitter` used permits | Recorder |
| `RecoveryPermitter` pending actors | Recorder |
| `RecoveryPermitter` max permits value | Gauge |

### Akka Persistence events

| Event Type |
| --- |
| Persistence recovery failure |
| Persistence persist failure |
| Persistence persist rejection |

### Akka Projection metrics

Metrics generated related to Akka Projection.

| Metric | Type |
| --- | --- |
| Active projections | Gauge |
| Processed envelopes | Gauge |
| Offsets committed | Gauge |
| Wait time | Recorder |
| Service time | Recorder |
| Residence time | Recorder |

### Akka Projection events

| Event Type |
| --- |
| Processing error |
| Projection failure |

### Akka Stream metrics (core)

| Metric | Type |
| --- | --- |
| Running streams | Counter |
| Running operators per stream | Counter |
| Running operators | Counter |
| Stream throughput | Rate |
| Operator throughput | Rate |
| Operator processing time | Recorder |

### Akka Stream events

| Event Type |
| --- |
| Operator failure event |

### Akka Stream metrics (extended)

| Metric | Type |
| --- | --- |
| Stream flow time | Recorder |
| Stream flow active time | Recorder |
| Stream flow efficiency | Recorder |
| Operator flow time | Recorder |
| Operator latency | Recorder |
| Operator demand | Rate |
| Operator demand processing time | Recorder |
| Operator demand latency | Recorder |
| Connection throughput | Rate |
| Connection processing time | Recorder |
| Connection latency | Recorder |
| Connection demand | Rate |
| Connection demand processing time | Recorder |
| Connection demand latency | Recorder |

### Akka HTTP server metrics

The following metrics are per Akka HTTP server. There can be multiple servers running in one JVM.

| Metric | Type |
| --- | --- |
| Connections | Rate |
| Requests | Rate |
| Responses | Rate |
| Responses 2xx | Rate |
| Responses 3xx | Rate |
| Responses 4xx | Rate |
| Responses 5xx | Rate |
| Response time | Recorder |
| Response time 2xx | Recorder |
| Response time 3xx | Recorder |
| Response time 4xx | Recorder |
| Response time 5xx | Recorder |

### Akka HTTP server endpoint metrics

The following metrics are per endpoint and server. An endpoint corresponds to a URI, e.g. `/users` or `/account`.

| Metric | Type |
| --- | --- |
| Endpoint responses | Rate |
| Endpoint response time | Recorder |

### Akka Http client metrics

The following metrics are per Akka Http client.

| Metric | Type |
| --- | --- |
| Client requests | Rate |
| Client service response time | Recorder |

## Scala Future metrics

| Metric | Type |
| --- | --- |
| Created futures | Rate |
| Completing time | Recorder |
| Scheduled futures | Recorder |
| Scheduling time | Recorder |
| Processed futures | Rate |
| Processing time | Recorder |

## Java Future metrics

| Metric | Type |
| --- | --- |
| Created futures | Rate |
| Completing time | Recorder |
| Scheduled futures | Recorder |
| Scheduling time | Recorder |
| Processed futures | Rate |
| Processing time | Recorder |

## Related Pages (Internal Links)

- https://doc.akka.io/docs/akka/current/persistence.html
- https://doc.akka.io/libraries/akka-insights/2.21/getting-started/start.html
- https://doc.akka.io/libraries/akka-insights/2.21/instrumentations/akka-persistence/persistent-actors-configuration.html
- https://doc.akka.io/libraries/akka-insights/2.21/instrumentations/akka/ask-pattern.html
- https://doc.akka.io/libraries/akka-insights/2.21/introduction/introduction.html

---
*Source: [https://doc.akka.io/libraries/akka-insights/2.21/introduction/overview/features.html](https://doc.akka.io/libraries/akka-insights/2.21/introduction/overview/features.html)*