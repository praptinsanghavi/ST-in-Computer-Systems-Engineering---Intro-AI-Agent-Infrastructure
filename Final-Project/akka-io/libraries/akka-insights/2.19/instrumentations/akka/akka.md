---
description: Telemetry for Lightbend Platform
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:23:48Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-insights/current//instrumentations/akka/akka.html
title: Akka • Akka Insights
---

# Akka • Akka Insights

> **Summary:** Telemetry for Lightbend Platform

## Content

# Akka

Akka Insights is capable of capturing data for the following [Akka](https://akka.io) related features.

Note
All time\-related metrics use nanoseconds unless specified otherwise.

## Cinnamon Akka module dependency

After adding the Cinnamon Agent as described in the [setup](../../setup/setup.html), make sure that you add the Cinnamon Akka module dependency to your build file:

sbt

```
libraryDependencies += Cinnamon.library.cinnamonAkka
```

Maven

```
<dependency>
  <groupId>com.lightbend.cinnamon</groupId>
  <artifactId>cinnamon-akka_2.13</artifactId>
  <version>2.19.4</version>
</dependency>
```

Gradle

```
dependencies {
  implementation group: 'com.lightbend.cinnamon', name: 'cinnamon-akka_2.13', version: '2.19.4'
}
```

## Actor metrics

The following metrics are recorded for instrumented actors, type of metric in parenthesis:

- **Running actors** (counter) — the number of running actors (of an actor class or group).
- **Mailbox size** (recorder) — statistics for actor mailbox sizes.
- **Stash size** (recorder) — statistics for actor stash sizes.

Note
**Mailbox size** and **Stash size** are recorders to give the statistical distribution of sizes for aggregated actor metrics (reported by actor class or group) and to provide visibility into what happened over the past time window. Note that the mailbox size and stash size are sampled to avoid skew in the distributions — the [sampling period can be configured](actors.html#metric-sampling-periods).

- **Mailbox time** (recorder) — statistics for the time that messages are in the mailbox.
- **Dropped messages** (rate) — statistics for the number of messages dropped from bounded mailboxes per actor.
- **Processed messages** (rate)\* — the number of messages that actors have processed in the selected time frame.
- **Processing time** (recorder)\* — statistics for the processing time of actors.
- **Sent messages** (rate)\* — statistics for the number of sent messages per actor.

The metrics marked with `*` support an automatic message\-type dimension. It’s disabled by default because it creates an extra set of metrics for each additional type of message. See [enabling message type dimensions](actors.html#message-type-dimensions) for details.

## Router metrics

The following router metrics are available:

- **Processed messages** (rate)\* — the number of messages that routers have processed in the selected time frame.
- **Processing time** (recorder)\* — statistics for the processing time of the router logic.

Note
Router metrics are only available for [router actors](https://doc.akka.io/libraries/akka-core/current/routing.html#a-router-actor), i.e. not available when routers are [used directly](https://doc.akka.io/libraries/akka-core/current/routing.html#a-simple-router).

---

Use the setting `routers = off` to disable router metrics from being created, see [router settings](actors.html#routers).

The metrics marked with `*` support an automatic message\-type dimension. It’s disabled by default because it creates an extra set of metrics for each additional type of message. See [enabling message type dimensions](actors.html#message-type-dimensions) for details.

## Actor remote metrics

The following remote metrics are recorded for instrumented actors, type of metric in parenthesis:

- **Sent messages** (rate)\* — statistics for the number sent remote messages.
- **Sent message size** (bytes)\* — statistics for remote sent message sizes.
- **Serialization time** (recorder)\* — statistics for the time that serialization takes.
- **Received messages** (rate)\* — statistics for the number received remote messages.
- **Received message size** (bytes)\* — statistics for remote received message sizes.
- **Deserialization time** (recorder)\* — statistics for the time that deserialization takes.
- **Node quarantine** (event) — node quarantine event information.
- **Phi accrual value** (gauge) — statistics for the [Phi accrual failure detector](https://doc.akka.io/libraries/akka-core/current/remoting.html#failure-detector). A Phi value represents the connection between two nodes; self and remote. A self node can have a connection to any number of remote nodes and each connection will have its own Phi value. *Note that internally in Akka the Phi accrual value can become Double.Infinity. If this happens Cinnamon will convert this value to 1024\*1024\. The reason for this is that most visualizers cannot handle infinity. If you therefore see the value 1048576 (1024\*1024\) this means that the Phi value has reached infinity.*
- **Phi accrual threshold value** (gauge) — the configured Phi accrual threshold value.

The metrics marked with `*` support an automatic message\-type dimension. It’s disabled by default because it creates an extra set of metrics for each additional type of message. See [enabling message type dimensions](actors.html#message-type-dimensions) for details.

Note
Timing of serialization/deserialization is turned off by default. To enable it, you need to add this setting to your configuration: 

```
cinnamon.akka.remote.serialization-timing = on

```

---

Phi accrual metrics and node quarantine events are turned off by default. To enable them, you need to add this setting to your configuration: 

```
cinnamon.akka.remote.failure-detector-metrics = on

```

## Actor selection

Actor configuration supports selecting and grouping actors for instrumentation by actor class, package, subtree, or instance, so that telemetry and metric aggregation can be tailored to the application. Details on how to configure actor telemetry can be found under [actor configuration](actors.html).

## Actor events

Out of the ordinary events are automatically recorded for instrumented actors.

- **Actor failure** — when an actor fails, i.e. throws an exception. Event information: `actor-ref` — the actor failing `cause` — the exception being thrown
- **Unhandled message** — when an actor does not handle a message sent to it. Event information: `actor-ref` — the actor not handling the message `message` — the message not being handled `sender` — the sender of the message
- **Dead letter** — when a message is sent to an actor that no longer exists. Event information: `recipient` — the intended recipient of the message `message` — the message being sent `actor-ref` — the actor sending the message
- **Log warning** — when an actor logs a warning. Event information: `actor-ref` — the actor logging the warning `warning` — the warning being logged
- **Log error** — when an actor logs an error. Event information: `actor-ref` — the actor logging the error `error` — the error being logged

## Cluster events

These are the types of Akka clustering events that Cinnamon observes:

- **Current cluster state event** — a one time event, per cluster node, containing information about the [state of the cluster](https://doc.akka.io/libraries/akka-core/current/cluster-usage.html#subscribe-to-cluster-events).
- **Domain events** — cluster domain events like leader changed, role leader changed or cluster shutting down. Event information: `event` — type of domain event, e.g. `LeaderChanged` `role` — the `role` for the domain event if any
- **Member events** — cluster member events like member up, unreachable, reachable, exited or removed. Event information: `event` — type of domain event, e.g. `MemberUp` `version` — node version `member-status` — member status, e.g. `Joining` `previous-member-status` — previous member status, e.g. `Up`
- **Singleton events** — cluster singleton events with information about node, actor singleton class and name. Event information: `event` — type of singleton event, e.g. `started` `class` — singleton actor class `actor` — singleton actor name
- **Shard region events** — cluster shard region started/stopped event with information about actor, node, type name and type of shard region (normal/proxy). Event information: `event` — type of shard region event, e.g. `STARTED` `shard-region-actor` — the actor controlling the shard region `type-name` — the entity type name of the shard region
- **Node unable to join event** — cluster node unable to join event with information about seed nodes and number of attempts to join (only available for Akka version \>\= 2\.4\.17\.)
- **Periodic cluster node status event** — if `cinnamon.akka.cluster.node-status` is enabled one event per cluster member with the node status as seen from the emitting node. The events are emitted once on joining the cluster and then periodically. Interval for emitting is configured using `cinnamon.akka.cluster.node-status-interval`, default value is an interval of 30 seconds.

Note
Cluster events are turned off by default. To enable them, you need to add these settings to your configuration:

```
cinnamon.akka.cluster.domain-events = on
cinnamon.akka.cluster.member-events = on
cinnamon.akka.cluster.node-status = on
cinnamon.akka.cluster.singleton-events = on
cinnamon.akka.cluster.shard-region-info = on

```

## Cluster metrics

The following cluster metrics are recorded, type of metric in parenthesis:

- **Shard region delivered messages** (rate) — statistics for the number of messages that have been delivered by the shard region actor (regardless of where the shard resides).
- **Shards regions per node** (gauge) — number of shards regions per node.
- **Shards per region** (gauge) — number of shards per shard region.
- **Shard entities per shard** (gauge) — number of shard entities per shard.
- **Reachable nodes** (counter) — number of reachable nodes in the cluster at any point in time (see [definition](akka.html#definition-of-reachable-and-unreachable-nodes).)
- **Unreachable nodes** (counter) — number of unreachable nodes in the cluster at any point in time (see [definition](akka.html#definition-of-reachable-and-unreachable-nodes).).

Note
Cluster related metrics is turned off by default. To enable it, you need to add these settings to your configuration:

```
cinnamon.akka.cluster.shard-region-info = on
cinnamon.akka.cluster.node-metrics = on

```

---

Sharded actors are created under the `/system` guardian actor, rather than the `/user` guardian actor. You can select sharded actors by class or by package, or by using a path selection such as `/system/sharding/*`. You can also [group actors](actors.html#actor-groups) and provide a custom name.

### Definition of reachable and unreachable nodes

Reachable and unreachable nodes are based on observations from the [failure detector](https://doc.akka.io/libraries/akka-core/current/common/cluster.html#failure-detector) and is orthogonal to the cluster [member states](https://doc.akka.io/libraries/akka-core/current/common/cluster.html#member-states). In other words, a member in, for example, status `Up` can be either `reachable` or `unreachable`.

## Split Brain Resolver events

Running [Split Brain Resolver](https://doc.akka.io/libraries/akka-core/current/split-brain-resolver.html) in your cluster will ensure better resilience. If you have SBR running, Akka Insights will automatically keep track of any activity therein. If there is a split in your cluster, events will be generated.

- **Split brain resolver events** — Split brain resolver decision taken event with information about the decision, reachable and unreachable nodes. Event information: `decision` — type of SBR decision, e.g. `DownUnreachable` `nodes` — the nodes that this node finds reachable `unreachable-nodes` — the nodes that this node finds unreachable

Note
Split brain resolver events are turned off by default. To enable them, you need to add these settings to your configuration:

```
cinnamon.akka.cluster.split-brain-resolver-events = on

```

## Threshold events

Thresholds can be specified for some of the metrics. If the threshold is exceeded then an event is fired. Thresholds are supported for:

- **Mailbox size** — mailbox queue grows too large. Event information: `actor-ref` — the actor whose mailbox size has exceeded the limit `message` — the message being enqueued in the mailbox `size` — the mailbox size `limit` — the mailbox size limit
- **Stash size** — stash queue grows too large. Event information: `actor-ref` — the actor whose stash size has exceeded the limit `message` — the message being stashed `size` — the stash size `limit` — the stash size limit
- **Mailbox time** — message has been in the mailbox for too long. Event information: `actor-ref` — the actor whose mailbox time has exceeded the limit `message` — the message being dequeued from the mailbox `nanos` — the mailbox time `threshold-nanos` — the mailbox time limit
- **Processing time** — message processing takes too long. Event information: `actor-ref` — the actor whose processing time has exceeded the limit `message` — the message that was just processed `nanos` — the processing time `threshold-nanos` — the processing time limit
- **Remote large message sent** — a message larger than the threshold has been sent Event information: `actor-ref` — the actor who is sending the large message `message-class` — the message class of the large message `size` — the size in bytes of the large message `recipient` — the recipient of the large message
- **Remote large message received** — a message larger than the threshold has been received Event information: `actor-ref` — the actor who is receiving the large message `message-class` — the message class of the large message `size` — the size in bytes of the large message `sender` — the sender of the large message

For more information see [metric thresholds configuration](actors.html#metric-thresholds).

## Stopwatch

Stopwatch provides a timer that follows asynchronous flows. A Stopwatch can be started in one actor and then flow through to others via message sends. You can use it to gather time metrics for “hot paths” within message flows that cross multiple actors. Intervals are marked programmatically with start and stop points within the application using an Akka extension Stopwatch API. Time metrics are recorded for Stopwatches and threshold events can be configured. For more details see the [Stopwatch extension](../../extensions/stopwatch.html).

- **Stopwatch events** — the stopwatch time limit was breached. Event information: `current-nanos` — the current stopwatch time in nanoseconds `threshold-nanos` — the stopwatch threshold time in nanoseconds

## Dispatcher metrics

The following metrics can be recorded for instrumented dispatchers, type of metric in parenthesis:

### Basic metrics

These are metrics that are built into the standard `ForkJoinPool` and `ThreadPool` `ExecutorService` implementations in Java and Scala. They are polled periodically by the instrumentation.

#### ForkJoinPool

- **Parallelism** — the parallelism setting
- **Pool size** (counter) — the current size of the thread pool
- **Active threads** (counter) — an estimate of the number of threads running or stealing tasks
- **Running threads** (counter) — an estimate of the number of threads not blocked in managed synchronization
- **Queued tasks** (counter) — an estimate of the total number of tasks currently in queues

#### ThreadPool

- **Core pool size** (counter) — the minimum size of the thread pool
- **Max pool size** (counter) — the maximum size of the thread pool
- **Pool size** (counter) — the current size of the thread pool
- **Active threads** (counter) — an estimate of the number of threads running tasks
- **Processed tasks** (counter) — an estimate of the number of processed tasks

### Time metrics

Additional detailed time metrics for dispatchers.

- **Queue size** (counter) — the number of tasks waiting to be processed
- **Queue time** (recorder) — statistics for how long tasks are in the queue
- **Processing** (counter) — how many tasks are being processed right now
- **Processing time** (recorder) — statistics for how long the processing takes

Note
All time related metrics use nanoseconds unless specified otherwise.

## Dispatcher selection

Dispatcher configuration supports selecting which dispatchers should be instrumented, and what type of instrumentation should be performed for them, so that telemetry can be tailored to the application. Details on how to configure dispatcher telemetry can be found under [dispatcher configuration](dispatchers.html).

## Detailed information

For specific information of how to configure actors and dispatchers see:

## Ask Pattern metrics

Availability
Available since Cinnamon **2\.14\.0**

Akka [Classic](https://doc.akka.io/libraries/akka-core/current/actors.html#ask-send-and-receive-future) and [Typed](https://doc.akka.io/libraries/akka-core/current/typed/interaction-patterns.html#request-response-with-ask-from-outside-an-actor) provide two ways to interact with actors:

- tell \- send a message asynchronously and return immediately (“fire\-and\-forget”).
- ask \- send a message asynchronously and receive a future which will complete when the response has been received, or fail by timeout.

The following metrics can be recorded for instrumented actors or entities:

- **Asked requests** (rate)\* — the number of messages that actors have been asked in the selected time frame.
- **Expired requests** (rate)\* — the number of messages that haven’t been answered before a specified timeout in the selected time frame.
- **Expired requests by\-timeout** (rate) — the number of requests that timed out in the selected time frame grouped by specified timeout values.
- **Success response time** (recorder)\* — the time from the moment the message was sent till the moment when the answer was received and before the specified timeout, counting only successful responses.
- **Late response time** (recorder)\* — the time from the moment the message was sent till the moment when the answer was received, counting only responses received after timeout.

The metrics marked with `*` support an automatic message\-type dimension. It’s disabled by default because it requires additional metrics for each additional type of message. See [enabling message type dimensions](ask-pattern.html#dimensions) for details.

## Ask Pattern events

Availability
Available since Cinnamon **2\.14\.0**

- **Request failed** — when the actor responses with `akka.actor.Status.Failure` (only Akka Classic) Event information: `actor-ref` — the actor being asked the message `message` — the message being sent `cause` — the exception returned with a failure response
- **Request expired** — when request expires before the response arrived Event information: `actor-ref` — the actor being asked the message `message` — the message being sent `timeout` — the given timeout

## Ask Pattern selection

Note
Actors and entities are not instrumented for ask\-pattern metrics automatically. They must have instrumentation explicitly enabled \- see sections below for how to.

Ask Pattern metrics and events will only be collected for the selected classic or typed actors, sharded or persistent entities. Details on how to configure ask pattern telemetry can be found under [ask pattern configuration](ask-pattern.html).

## Code Examples

### Example 1: Cinnamon Akka module dependency

```sbt
libraryDependencies += Cinnamon.library.cinnamonAkka
```

### Example 2: Cinnamon Akka module dependency

```xml
<dependency>
  <groupId>com.lightbend.cinnamon</groupId>
  <artifactId>cinnamon-akka_2.13</artifactId>
  <version>2.19.4</version>
</dependency>
```

### Example 3: Cinnamon Akka module dependency

```gradle
dependencies {
  implementation group: 'com.lightbend.cinnamon', name: 'cinnamon-akka_2.13', version: '2.19.4'
}
```

### Example 4: Actor remote metrics

```conf
cinnamon.akka.remote.serialization-timing = on
```

### Example 5: Actor remote metrics

```conf
cinnamon.akka.remote.failure-detector-metrics = on
```

### Example 6: Cluster events

```conf
cinnamon.akka.cluster.domain-events = on
cinnamon.akka.cluster.member-events = on
cinnamon.akka.cluster.node-status = on
cinnamon.akka.cluster.singleton-events = on
cinnamon.akka.cluster.shard-region-info = on
```

### Example 7: Cluster metrics

```conf
cinnamon.akka.cluster.shard-region-info = on
cinnamon.akka.cluster.node-metrics = on
```

### Example 8: Split Brain Resolver events

```conf
cinnamon.akka.cluster.split-brain-resolver-events = on
```

## Related Pages (Internal Links)

- https://doc.akka.io/libraries/akka-core/current/actors.html
- https://doc.akka.io/libraries/akka-core/current/cluster-usage.html
- https://doc.akka.io/libraries/akka-core/current/common/cluster.html
- https://doc.akka.io/libraries/akka-core/current/remoting.html
- https://doc.akka.io/libraries/akka-core/current/routing.html
- https://doc.akka.io/libraries/akka-core/current/split-brain-resolver.html
- https://doc.akka.io/libraries/akka-core/current/typed/interaction-patterns.html
- https://doc.akka.io/libraries/akka-insights/2.19/extensions/stopwatch.html
- https://doc.akka.io/libraries/akka-insights/2.19/instrumentations/akka/actors.html
- https://doc.akka.io/libraries/akka-insights/2.19/instrumentations/akka/akka.html
- https://doc.akka.io/libraries/akka-insights/2.19/instrumentations/akka/ask-pattern.html
- https://doc.akka.io/libraries/akka-insights/2.19/instrumentations/akka/dispatchers.html
- https://doc.akka.io/libraries/akka-insights/2.19/instrumentations/metrics-and-events/metrics-and-events.html
- https://doc.akka.io/libraries/akka-insights/2.19/setup/setup.html

---
*Source: [https://doc.akka.io/libraries/akka-insights/2.19/instrumentations/akka/akka.html](https://doc.akka.io/libraries/akka-insights/2.19/instrumentations/akka/akka.html)*