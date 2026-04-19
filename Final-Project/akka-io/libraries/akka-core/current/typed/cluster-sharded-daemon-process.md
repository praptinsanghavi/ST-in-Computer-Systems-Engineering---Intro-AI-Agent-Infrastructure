---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:26:34Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/typed/cluster-sharded-daemon-process.html
title: Sharded Daemon Process • Akka core
---

# Sharded Daemon Process • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Sharded Daemon Process

## Module info

Note
The Akka dependencies are available from Akka’s secure library repository. To access them you need to use a secure, tokenized URL as specified at <https://account.akka.io/token>.

To use Akka Sharded Daemon Process, you must add the following dependency in your project:

sbt
```
val AkkaVersion = "2.10.17"
libraryDependencies += "com.typesafe.akka" %% "akka-cluster-sharding-typed" % AkkaVersion
```
Maven
```
<properties>
  <scala.binary.version>2.13</scala.binary.version>
</properties>
<dependencyManagement>
  <dependencies>
    <dependency>
      <groupId>com.typesafe.akka</groupId>
      <artifactId>akka-bom_${scala.binary.version}</artifactId>
      <version>2.10.17</version>
      <type>pom</type>
      <scope>import</scope>
    </dependency&gt
  </dependencies>
</dependencyManagement>
<dependencies&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-cluster-sharding-typed_${scala.binary.version}</artifactId>
  </dependency&gt
</dependencies>
```
Gradle
```
def versions = [
  ScalaBinary: "2.13"
]
dependencies {
  implementation platform("com.typesafe.akka:akka-bom_${versions.ScalaBinary}:2.10.17")

  implementation "com.typesafe.akka:akka-cluster-sharding-typed_${versions.ScalaBinary}"
}
```

| Project Info: Akka Cluster Sharding (typed) | |
| --- | --- |
| Artifact | com.typesafe.akka akka\-cluster\-sharding\-typed 2\.10\.17 [Snapshots are available](project/links.html#snapshots-repository) |
| JDK versions | Eclipse Temurin JDK 11Eclipse Temurin JDK 17Eclipse Temurin JDK 21 |
| Scala versions | 2\.13\.17, 3\.3\.7 |
| JPMS module name | akka.cluster.sharding.typed |
| License | [BUSL\-1\.1](https://raw.githubusercontent.com/akka/akka-core/v2.10.17/LICENSE) |
| Readiness level | [Supported](https://doc.akka.io/docs/akka-dependencies/current/support-terminology.html#supported), support is available from [Lightbend](https://www.lightbend.com/akka) Since 2\.6\.0, 2019\-11\-06 |
| Home page | <https://akka.io/> |
| API documentation | [API (Scaladoc)](https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/typed/index.html) [API (Javadoc)](https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/typed/package-summary.html) |
| Forums | [Akka Discuss](https://discuss.akka.io) |
| Release notes | [Akka release notes](https://doc.akka.io/reference/release-notes.html) |
| Issues | [Github issues](https://github.com/akka/akka-core/issues) |
| Sources | [https://github.com/akka/akka\-core](https://github.com/akka/akka-core) |

## Introduction

Sharded Daemon Process provides a way to run `N` actors, each given a numeric id starting from `0` that are then kept alive and balanced across the cluster. When a rebalance is needed the actor is stopped and, triggered by a keep alive from a Cluster Singleton (the keep alive should be seen as an implementation detail and may change in future versions).

The intended use case is for splitting data processing workloads across a set number of workers that each get to work on a subset of the data that needs to be processed. This is commonly needed to create projections based on the event streams available from all the [EventSourcedBehaviors](persistence.html) in a CQRS application. Events are tagged with one out of `N` tags used to split the workload of consuming and updating a projection between `N` workers.

For cases where a single actor needs to be kept alive see [Cluster Singleton](cluster-singleton.html)

## Basic example

To set up a set of actors running with Sharded Daemon process each node in the cluster needs to run the same initialization when starting up:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-sharding-typed/src/test/scala/akka/cluster/sharding/typed/scaladsl/ShardedDaemonProcessSpec.scala#L193-L194 "Go to snippet source")val tags = Vector("tag-1", "tag-2", "tag-3")
ShardedDaemonProcess(system).init("TagProcessors", tags.size, id => TagProcessor(tags(id)))
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-sharding-typed/src/test/java/akka/cluster/sharding/typed/javadsl/ShardedDaemonProcessCompileOnlyTest.java#L42-L48 "Go to snippet source")List<String> tags = Arrays.asList("tag-1", "tag-2", "tag-3");
ShardedDaemonProcess.get(system)
    .init(
        TagProcessor.Command.class,
        "TagProcessors",
        tags.size(),
        id -> TagProcessor.create(tags.get(id)));
```

An additional factory method is provided for further configurability and providing a graceful stop message for the actor.

## Addressing the actors

In use cases where you need to send messages to the daemon process actors it is recommended to use the [system receptionist](actor-discovery.html) either with a single `ServiceKey` which all daemon process actors register themeselves to for broadcasts or individual keys if more fine grained messaging is needed.

## Dynamic scaling of number of workers

Starting the sharded daemon process with `initWithContext` returns an `ActorRef[ShardedDaemonProcessCommand]` that accepts a [`ChangeNumberOfProcesses`](https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/typed/ChangeNumberOfProcesses.html "akka.cluster.sharding.typed.ChangeNumberOfProcesses")[`ChangeNumberOfProcesses`](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/ChangeNumberOfProcesses.html "akka.cluster.sharding.typed.ChangeNumberOfProcesses") command to rescale the process to a new number of workers.

The rescaling process among other things includes the process actors stopping themselves in response to a stop message so may be a relatively slow operation. If a subsequent request to rescale is sent while one is in progress it is responded to with a failure response.

A rolling upgrade switching from a static number of workers to a dynamic number is possible. It is not safe to do a rolling upgrade from dynamic number of workers to static without a full cluster shutdown.

### Colocate processes

When using the default shard allocation strategy the processes for different names are allocated independent of each other, i.e. the same process index for different process names may be allocated to different nodes. Colocating processes can be useful to share resources, such as Projections with [EventsBySliceFirehoseQuery](../persistence-query.html#eventsbyslice-and-currenteventsbyslice)

To colocate such processes you can use the [`ConsistentHashingShardAllocationStrategy`](https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/ConsistentHashingShardAllocationStrategy.html "akka.cluster.sharding.ConsistentHashingShardAllocationStrategy")[`ConsistentHashingShardAllocationStrategy`](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/ConsistentHashingShardAllocationStrategy.html "akka.cluster.sharding.ConsistentHashingShardAllocationStrategy") as `shardAllocationStrategy` parameter of the `init` or `initWithContext` methods. 

Note
Create a new instance of the `ConsistentHashingShardAllocationStrategy` for each Sharded Daemon Process name, i.e. a `ConsistentHashingShardAllocationStrategy` instance must not be shared.

The shard identifier that is used by Sharded Daemon Process is the same as the process index, i.e. processes with the same index will be colocated.

The allocation strategy is using [Consistent Hashing](https://tom-e-white.com/2007/11/consistent-hashing.html) of the Cluster membership ring to assign a shard to a node. When adding or removing nodes it will rebalance according to the new consistent hashing, but that means that only a few shards will be rebalanced and others remain on the same location. When there are changes to the Cluster membership the shards may be on different nodes for a while, but eventually, when the membership is stable, the shards with the same identifier will end up on the same node.

## Scalability

This cluster tool is intended for up to thousands of processes. Running with larger sets of processes might cause problems with Akka Distributed Data replication or process keepalive messages.

## Configuration

The following configuration properties are read by the [`ShardedDaemonProcessSettings`](https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/typed/ShardedDaemonProcessSettings.html "akka.cluster.sharding.typed.ShardedDaemonProcessSettings")[`ShardedDaemonProcessSettings`](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/ShardedDaemonProcessSettings.html "akka.cluster.sharding.typed.ShardedDaemonProcessSettings") when created with a [`ActorSystem`](https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/ActorSystem.html "akka.actor.typed.ActorSystem")[`ActorSystem`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/ActorSystem.html "akka.actor.typed.ActorSystem") parameter:

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-sharding-typed/src/main/resources/reference.conf#L17-L37 "Go to snippet source")akka.cluster.sharded-daemon-process {
  # Settings for the sharded daemon process internal usage of sharding are using the akka.cluste.sharding defaults.
  # Some of the settings can be overridden specifically for the sharded daemon process here. For example can the
  # `role` setting limit what nodes the daemon processes and the keep alive pingers will run on.
  # Some settings can not be changed (remember-entities and related settings, passivation, number-of-shards),
  # overriding those settings will be ignored.
  sharding = ${akka.cluster.sharding}

  # Each entity is pinged at this interval from a few nodes in the
  # cluster to trigger a start if it has stopped, for example during
  # rebalancing.
  # See also keep-alive-from-number-of-nodes and keep-alive-throttle-interval
  # Note: How the set of actors is kept alive may change in the future meaning this setting may go away.
  keep-alive-interval = 10s

  # Keep alive messages from this number of nodes.
  keep-alive-from-number-of-nodes = 3

  # Keep alive messages are sent with this delay between each message.
  keep-alive-throttle-interval = 100 ms
}
```

## Code Examples

### Example 1: Module info

```scala
val AkkaVersion = "2.10.17"
libraryDependencies += "com.typesafe.akka" %% "akka-cluster-sharding-typed" % AkkaVersion
```

### Example 2: Module info

```xml
<properties>
  <scala.binary.version>2.13</scala.binary.version>
</properties>
<dependencyManagement>
  <dependencies>
    <dependency>
      <groupId>com.typesafe.akka</groupId>
      <artifactId>akka-bom_${scala.binary.version}</artifactId>
      <version>2.10.17</version>
      <type>pom</type>
      <scope>import</scope>
    </dependency&gt
  </dependencies>
</dependencyManagement>
<dependencies&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-cluster-sharding-typed_${scala.binary.version}</artifactId>
  </dependency&gt
</dependencies>
```

### Example 3: Module info

```gradle
def versions = [
  ScalaBinary: "2.13"
]
dependencies {
  implementation platform("com.typesafe.akka:akka-bom_${versions.ScalaBinary}:2.10.17")

  implementation "com.typesafe.akka:akka-cluster-sharding-typed_${versions.ScalaBinary}"
}
```

### Example 4: Basic example

```scala
val tags = Vector("tag-1", "tag-2", "tag-3")
ShardedDaemonProcess(system).init("TagProcessors", tags.size, id => TagProcessor(tags(id)))
```

### Example 5: Basic example

```java
List<String> tags = Arrays.asList("tag-1", "tag-2", "tag-3");
ShardedDaemonProcess.get(system)
    .init(
        TagProcessor.Command.class,
        "TagProcessors",
        tags.size(),
        id -> TagProcessor.create(tags.get(id)));
```

### Example 6: Configuration

```conf
akka.cluster.sharded-daemon-process {
  # Settings for the sharded daemon process internal usage of sharding are using the akka.cluste.sharding defaults.
  # Some of the settings can be overridden specifically for the sharded daemon process here. For example can the
  # `role` setting limit what nodes the daemon processes and the keep alive pingers will run on.
  # Some settings can not be changed (remember-entities and related settings, passivation, number-of-shards),
  # overriding those settings will be ignored.
  sharding = ${akka.cluster.sharding}

  # Each entity is pinged at this interval from a few nodes in the
  # cluster to trigger a start if it has stopped, for example during
  # rebalancing.
  # See also keep-alive-from-number-of-nodes and keep-alive-throttle-interval
  # Note: How the set of actors is kept alive may change in the future meaning this setting may go away.
  keep-alive-interval = 10s

  # Keep alive messages from this number of nodes.
  keep-alive-from-number-of-nodes = 3

  # Keep alive messages are sent with this delay between each message.
  keep-alive-throttle-interval = 100 ms
}
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/typed/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/ActorSystem.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/ConsistentHashingShardAllocationStrategy.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/typed/ChangeNumberOfProcesses.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/typed/ShardedDaemonProcessSettings.html
- https://doc.akka.io/docs/akka-dependencies/current/support-terminology.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/typed/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/ActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/ConsistentHashingShardAllocationStrategy.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/ChangeNumberOfProcesses.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/ShardedDaemonProcessSettings.html
- https://doc.akka.io/libraries/akka-core/current/persistence-query.html
- https://doc.akka.io/libraries/akka-core/current/typed/actor-discovery.html
- https://doc.akka.io/libraries/akka-core/current/typed/cluster-sharding-concepts.html
- https://doc.akka.io/libraries/akka-core/current/typed/cluster-singleton.html
- https://doc.akka.io/libraries/akka-core/current/typed/distributed-pub-sub.html
- https://doc.akka.io/libraries/akka-core/current/typed/persistence.html
- https://doc.akka.io/libraries/akka-core/current/typed/project/links.html
- https://doc.akka.io/reference/release-notes.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/typed/cluster-sharded-daemon-process.html](https://doc.akka.io/libraries/akka-core/current/typed/cluster-sharded-daemon-process.html)*