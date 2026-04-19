---
description: Build distributed applications that scale across the network with Akka
  Cluster, a fault-tolerant decentralized peer-to-peer based cluster node membership
  service with no single point of failure.
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:14:48Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/typed/cluster.html
title: Cluster Usage • Akka Documentation
---

# Cluster Usage • Akka Documentation

> **Summary:** Build distributed applications that scale across the network with Akka Cluster, a fault-tolerant decentralized peer-to-peer based cluster node membership service with no single point of failure.

## Content

# Cluster Usage

This document describes how to use Akka Cluster and the Cluster APIs. The [Stateful or Stateless Applications: To Akka Cluster or not](https://akka.io/blog/news/2020/06/01/akka-cluster-motivation) video is a good starting point to understand the motivation to use Akka Cluster.

For specific documentation topics see: 

- [When and where to use Akka Cluster](choosing-cluster.html)
- [Cluster Specification](cluster-concepts.html)
- [Cluster Membership Service](cluster-membership.html)
- [Higher level Cluster tools](cluster.html#higher-level-cluster-tools)
- [Rolling Updates](../additional/rolling-updates.html)
- [Operating, Managing, Observability](../additional/operations.html)

You are viewing the documentation for the new actor APIs, to view the Akka Classic documentation, see [Classic Cluster](../cluster-usage.html).

You have to enable [serialization](../serialization.html) to send messages between ActorSystems (nodes) in the Cluster. [Serialization with Jackson](../serialization-jackson.html) is a good choice in many cases, and our recommendation if you don’t have other preferences or constraints.

## Module info

To use Akka Cluster add the following dependency in your project:

sbt
```
val AkkaVersion = "2.6.21"
libraryDependencies += "com.typesafe.akka" %% "akka-cluster-typed" % AkkaVersion
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
      <version>2.6.21</version>
      <type>pom</type>
      <scope>import</scope>
    </dependency&gt
  </dependencies>
</dependencyManagement>
<dependencies&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-cluster-typed_${scala.binary.version}</artifactId>
  </dependency&gt
</dependencies>
```
Gradle
```
def versions = [
  ScalaBinary: "2.13"
]
dependencies {
  implementation platform("com.typesafe.akka:akka-bom_${versions.ScalaBinary}:2.6.21")

  implementation "com.typesafe.akka:akka-cluster-typed_${versions.ScalaBinary}"
}
```

| Project Info: Akka Cluster (typed) | |
| --- | --- |
| Artifact | com.typesafe.akka akka\-cluster\-typed 2\.6\.21 [Snapshots are available](project/links.html#snapshots-repository) |
| JDK versions | Adopt OpenJDK 8Adopt OpenJDK 11 |
| Scala versions | 2\.13\.8, 2\.12\.16, 3\.1\.2 |
| JPMS module name | akka.cluster.typed |
| License | [Apache\-2\.0](https://www.apache.org/licenses/LICENSE-2.0.html) |
| Readiness level | [Supported](https://developer.lightbend.com/docs/introduction/getting-help/support-terminology.html#supported), [Lightbend Subscription](https://www.lightbend.com/lightbend-subscription) provides support Since 2\.6\.0, 2019\-11\-06 |
| Home page | <https://akka.io/> |
| API documentation | [API (Scaladoc)](https://doc.akka.io/api/akka-core/2.6.21/akka/cluster/typed/index.html) [API (Javadoc)](https://doc.akka.io/japi/akka-core/2.6.21/akka/cluster/typed/package-summary.html) |
| Forums | [Lightbend Discuss](https://discuss.akka.io) [akka/akka Gitter channel](https://gitter.im/akka/akka) |
| Release notes | [akka.io blog](https://akka.io/blog/news-archive.html) |
| Issues | [Github issues](https://github.com/akka/akka/issues) |
| Sources | <https://github.com/akka/akka> |

## Cluster API Extension

The Cluster extension gives you access to management tasks such as [Joining, Leaving and Downing](cluster-membership.html#user-actions) and subscription of cluster membership events such as [MemberUp, MemberRemoved and UnreachableMember](cluster-membership.html#membership-lifecycle), which are exposed as event APIs. 

It does this through these references on the [`Cluster`](https://doc.akka.io/api/akka-core/2.6/akka/cluster/typed/Cluster$.html "akka.cluster.typed.Cluster")[`Cluster`](https://doc.akka.io/japi/akka-core/2.6/akka/cluster/typed/Cluster.html "akka.cluster.typed.Cluster") extension:

- `manager`: An [`ActorRef`](https://doc.akka.io/api/akka-core/2.6/akka/actor/typed/ActorRef.html "akka.actor.typed.ActorRef")[`ActorRef`](https://doc.akka.io/japi/akka-core/2.6/akka/actor/typed/ActorRef.html "akka.actor.typed.ActorRef")\[[`akka.cluster.typed.ClusterCommand`](https://doc.akka.io/api/akka-core/2.6/akka/cluster/typed/ClusterCommand.html "akka.cluster.typed.ClusterCommand")[`akka.cluster.typed.ClusterCommand`](https://doc.akka.io/japi/akka-core/2.6/akka/cluster/typed/ClusterCommand.html "akka.cluster.typed.ClusterCommand")][`ActorRef`](https://doc.akka.io/api/akka-core/2.6/akka/actor/typed/ActorRef.html "akka.actor.typed.ActorRef")[`ActorRef`](https://doc.akka.io/japi/akka-core/2.6/akka/actor/typed/ActorRef.html "akka.actor.typed.ActorRef")\<[`akka.cluster.typed.ClusterCommand`](https://doc.akka.io/api/akka-core/2.6/akka/cluster/typed/ClusterCommand.html "akka.cluster.typed.ClusterCommand")[`akka.cluster.typed.ClusterCommand`](https://doc.akka.io/japi/akka-core/2.6/akka/cluster/typed/ClusterCommand.html "akka.cluster.typed.ClusterCommand")\> where a `ClusterCommand` is a command such as: [`Join`](https://doc.akka.io/api/akka-core/2.6/akka/cluster/typed/Join.html "akka.cluster.typed.Join")[`Join`](https://doc.akka.io/japi/akka-core/2.6/akka/cluster/typed/Join.html "akka.cluster.typed.Join"), [`Leave`](https://doc.akka.io/api/akka-core/2.6/akka/cluster/typed/Leave.html "akka.cluster.typed.Leave")[`Leave`](https://doc.akka.io/japi/akka-core/2.6/akka/cluster/typed/Leave.html "akka.cluster.typed.Leave") and [`Down`](https://doc.akka.io/api/akka-core/2.6/akka/cluster/typed/Down.html "akka.cluster.typed.Down")[`Down`](https://doc.akka.io/japi/akka-core/2.6/akka/cluster/typed/Down.html "akka.cluster.typed.Down")
- `subscriptions`: An [`ActorRef`](https://doc.akka.io/api/akka-core/2.6/akka/actor/typed/ActorRef.html "akka.actor.typed.ActorRef")[`ActorRef`](https://doc.akka.io/japi/akka-core/2.6/akka/actor/typed/ActorRef.html "akka.actor.typed.ActorRef")\[[`akka.cluster.typed.ClusterStateSubscription`](https://doc.akka.io/api/akka-core/2.6/akka/cluster/typed/ClusterStateSubscription.html "akka.cluster.typed.ClusterStateSubscription")[`akka.cluster.typed.ClusterStateSubscription`](https://doc.akka.io/japi/akka-core/2.6/akka/cluster/typed/ClusterStateSubscription.html "akka.cluster.typed.ClusterStateSubscription")][`ActorRef`](https://doc.akka.io/api/akka-core/2.6/akka/actor/typed/ActorRef.html "akka.actor.typed.ActorRef")[`ActorRef`](https://doc.akka.io/japi/akka-core/2.6/akka/actor/typed/ActorRef.html "akka.actor.typed.ActorRef")\<[`akka.cluster.typed.ClusterStateSubscription`](https://doc.akka.io/api/akka-core/2.6/akka/cluster/typed/ClusterStateSubscription.html "akka.cluster.typed.ClusterStateSubscription")[`akka.cluster.typed.ClusterStateSubscription`](https://doc.akka.io/japi/akka-core/2.6/akka/cluster/typed/ClusterStateSubscription.html "akka.cluster.typed.ClusterStateSubscription")\> where a `ClusterStateSubscription` is one of [`GetCurrentState`](https://doc.akka.io/api/akka-core/2.6/akka/cluster/typed/GetCurrentState.html "akka.cluster.typed.GetCurrentState")[`GetCurrentState`](https://doc.akka.io/japi/akka-core/2.6/akka/cluster/typed/GetCurrentState.html "akka.cluster.typed.GetCurrentState") or [`Subscribe`](https://doc.akka.io/api/akka-core/2.6/akka/cluster/typed/Subscribe.html "akka.cluster.typed.Subscribe")[`Subscribe`](https://doc.akka.io/japi/akka-core/2.6/akka/cluster/typed/Subscribe.html "akka.cluster.typed.Subscribe") and [`Unsubscribe`](https://doc.akka.io/api/akka-core/2.6/akka/cluster/typed/Unsubscribe.html "akka.cluster.typed.Unsubscribe")[`Unsubscribe`](https://doc.akka.io/japi/akka-core/2.6/akka/cluster/typed/Unsubscribe.html "akka.cluster.typed.Unsubscribe") to cluster events like [`MemberRemoved`](https://doc.akka.io/api/akka-core/2.6/akka/cluster/ClusterEvent$$MemberRemoved.html "akka.cluster.ClusterEvent.MemberRemoved")[`MemberRemoved`](https://doc.akka.io/japi/akka-core/2.6/akka/cluster/ClusterEvent.MemberRemoved.html "akka.cluster.ClusterEvent.MemberRemoved")
- `state`: The current [`CurrentClusterState`](https://doc.akka.io/api/akka-core/2.6/akka/cluster/ClusterEvent$$CurrentClusterState.html "akka.cluster.ClusterEvent.CurrentClusterState")[`CurrentClusterState`](https://doc.akka.io/japi/akka-core/2.6/akka/cluster/ClusterEvent.CurrentClusterState.html "akka.cluster.ClusterEvent.CurrentClusterState")

All of the examples below assume the following imports:

Scala

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-cluster-typed/src/test/scala/docs/akka/cluster/typed/BasicClusterExampleSpec.scala#L15-L19 "Go to snippet source")import akka.actor.typed._
import akka.actor.typed.scaladsl._
import akka.cluster.ClusterEvent._
import akka.cluster.MemberStatus
import akka.cluster.typed._
```

Java

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-cluster-typed/src/test/java/jdocs/akka/cluster/typed/BasicClusterExampleTest.java#L16-L19 "Go to snippet source")import akka.actor.typed.*;
import akka.actor.typed.javadsl.*;
import akka.cluster.ClusterEvent;
import akka.cluster.typed.*;
```

The minimum configuration required is to set a host/port for remoting and the `akka.actor.provider = "cluster"`.

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-cluster-typed/src/test/scala/docs/akka/cluster/typed/BasicClusterExampleSpec.scala#L31-L49 "Go to snippet source")akka {
  actor {
    provider = "cluster"
  }
  remote.artery {
    canonical {
      hostname = "127.0.0.1"
      port = 2551
    }
  }

  cluster {
    seed-nodes = [
      "akka://[[email protected]](/cdn-cgi/l/email-protection):2551",
      "akka://[[email protected]](/cdn-cgi/l/email-protection):2552"]
    
    downing-provider-class = "akka.cluster.sbr.SplitBrainResolverProvider"
  }
}
```

Accessing the [`Cluster`](https://doc.akka.io/api/akka-core/2.6/akka/cluster/typed/Cluster$.html "akka.cluster.typed.Cluster")[`Cluster`](https://doc.akka.io/japi/akka-core/2.6/akka/cluster/typed/Cluster.html "akka.cluster.typed.Cluster") extension on each node:

Scala

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-cluster-typed/src/test/scala/docs/akka/cluster/typed/BasicClusterExampleSpec.scala#L183 "Go to snippet source")val cluster = Cluster(system)
```

Java

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-cluster-typed/src/test/java/jdocs/akka/cluster/typed/BasicClusterExampleTest.java#L58 "Go to snippet source")Cluster cluster = Cluster.get(system);
```

Note
The name of the cluster’s [`ActorSystem`](https://doc.akka.io/api/akka-core/2.6/akka/actor/typed/ActorSystem.html "akka.actor.typed.ActorSystem")[`ActorSystem`](https://doc.akka.io/japi/akka-core/2.6/akka/actor/typed/ActorSystem.html "akka.actor.typed.ActorSystem") must be the same for all members, which is passed in when you start the `ActorSystem`.

### Joining and Leaving a Cluster

If not using configuration to specify [seed nodes to join](cluster.html#joining), joining the cluster can be done programmatically via the [`manager`](https://doc.akka.io/api/akka-core/2.6/akka/cluster/typed/Cluster.html#manager:akka.actor.typed.ActorRef[akka.cluster.typed.ClusterCommand] "akka.cluster.typed.Cluster")[`manager()`](https://doc.akka.io/japi/akka-core/2.6/akka/cluster/typed/Cluster.html#manager() "akka.cluster.typed.Cluster").

Scala

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-cluster-typed/src/test/scala/docs/akka/cluster/typed/BasicClusterExampleSpec.scala#L188 "Go to snippet source")cluster.manager ! Join(cluster.selfMember.address)
```

Java

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-cluster-typed/src/test/java/jdocs/akka/cluster/typed/BasicClusterExampleTest.java#L63 "Go to snippet source")cluster.manager().tell(Join.create(cluster.selfMember().address()));
```

[Leaving](cluster.html#leaving) the cluster and [downing](cluster.html#downing) a node are similar:

Scala

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-cluster-typed/src/test/scala/docs/akka/cluster/typed/BasicClusterExampleSpec.scala#L198 "Go to snippet source")cluster2.manager ! Leave(cluster2.selfMember.address)
```

Java

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-cluster-typed/src/test/java/jdocs/akka/cluster/typed/BasicClusterExampleTest.java#L77 "Go to snippet source")cluster2.manager().tell(Leave.create(cluster2.selfMember().address()));
```

### Cluster Subscriptions

Cluster [`subscriptions`](https://doc.akka.io/api/akka-core/2.6/akka/cluster/typed/Cluster.html#subscriptions:akka.actor.typed.ActorRef[akka.cluster.typed.ClusterStateSubscription] "akka.cluster.typed.Cluster")[`subscriptions()`](https://doc.akka.io/japi/akka-core/2.6/akka/cluster/typed/Cluster.html#subscriptions() "akka.cluster.typed.Cluster") can be used to receive messages when cluster state changes. For example, registering for all [`MemberEvent`](https://doc.akka.io/api/akka-core/2.6/akka/cluster/ClusterEvent$$MemberEvent.html "akka.cluster.ClusterEvent.MemberEvent")[`MemberEvent`](https://doc.akka.io/japi/akka-core/2.6/akka/cluster/ClusterEvent.MemberEvent.html "akka.cluster.ClusterEvent.MemberEvent")’s, then using the `manager` to have a node leave the cluster will result in events for the node going through the [Membership Lifecycle](cluster-membership.html#membership-lifecycle).

This example subscribes to a `subscriber: ActorRef[MemberEvent]``ActorRef<MemberEvent> subscriber`:

Scala

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-cluster-typed/src/test/scala/docs/akka/cluster/typed/BasicClusterExampleSpec.scala#L226 "Go to snippet source")cluster.subscriptions ! Subscribe(subscriber, classOf[MemberEvent])
```

Java

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-cluster-typed/src/test/java/jdocs/akka/cluster/typed/BasicClusterExampleTest.java#L102 "Go to snippet source")cluster.subscriptions().tell(Subscribe.create(subscriber, ClusterEvent.MemberEvent.class));
```

Then asking a node to leave:

Scala

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-cluster-typed/src/test/scala/docs/akka/cluster/typed/BasicClusterExampleSpec.scala#L261-L262 "Go to snippet source")cluster.manager ! Leave(anotherMemberAddress)
// subscriber will receive events MemberLeft, MemberExited and MemberRemoved
```

Java

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-cluster-typed/src/test/java/jdocs/akka/cluster/typed/BasicClusterExampleTest.java#L107-L108 "Go to snippet source")cluster.manager().tell(Leave.create(anotherMemberAddress));
// subscriber will receive events MemberLeft, MemberExited and MemberRemoved
```

### Cluster State

Instead of subscribing to cluster events it can sometimes be convenient to only get the full membership state with [`Cluster(system).state`](https://doc.akka.io/api/akka-core/2.6/akka/cluster/typed/Cluster.html#state:akka.cluster.ClusterEvent.CurrentClusterState "akka.cluster.typed.Cluster")[`Cluster.get(system).state()`](https://doc.akka.io/japi/akka-core/2.6/akka/cluster/typed/Cluster.html#state() "akka.cluster.typed.Cluster"). Note that this state is not necessarily in sync with the events published to a cluster subscription.

See [Cluster Membership](cluster-membership.html#member-events) more information on member events specifically. There are more types of change events, consult the API documentation of classes that extends [`akka.cluster.ClusterEvent.ClusterDomainEvent`](https://doc.akka.io/api/akka-core/2.6/akka/cluster/ClusterEvent$$ClusterDomainEvent.html "akka.cluster.ClusterEvent.ClusterDomainEvent")[`akka.cluster.ClusterEvent.ClusterDomainEvent`](https://doc.akka.io/japi/akka-core/2.6/akka/cluster/ClusterEvent.ClusterDomainEvent.html "akka.cluster.ClusterEvent.ClusterDomainEvent") for details about the events.

## Cluster Membership API

### Joining

The seed nodes are initial contact points for joining a cluster, which can be done in different ways:

- [automatically with Cluster Bootstrap](cluster.html#joining-automatically-to-seed-nodes-with-cluster-bootstrap)
- [with configuration of seed\-nodes](cluster.html#joining-configured-seed-nodes)
- [programatically](cluster.html#joining-programmatically-to-seed-nodes)

After the joining process the seed nodes are not special and they participate in the cluster in exactly the same way as other nodes.

#### Joining automatically to seed nodes with Cluster Bootstrap

Automatic discovery of nodes for the joining process is available using the open source Akka Management project’s module, [Cluster Bootstrap](../additional/operations.html#cluster-bootstrap). Please refer to its documentation for more details.

#### Joining configured seed nodes

When a new node is started it sends a message to all seed nodes and then sends a join command to the one that answers first. If none of the seed nodes replies (might not be started yet) it retries this procedure until success or shutdown.

You can define the seed nodes in the [configuration](cluster.html#configuration) file (application.conf):

```
akka.cluster.seed-nodes = [
  "akka://ClusterSystem@host1:2552",
  "akka://ClusterSystem@host2:2552"]

```

This can also be defined as Java system properties when starting the JVM using the following syntax:

```
-Dakka.cluster.seed-nodes.0=akka://ClusterSystem@host1:2552
-Dakka.cluster.seed-nodes.1=akka://ClusterSystem@host2:2552

```

When a new node is started it sends a message to all configured `seed-nodes` and then sends a join command to the one that answers first. If none of the seed nodes replies (might not be started yet) it retries this procedure until successful or shutdown.

The seed nodes can be started in any order. It is not necessary to have all seed nodes running, but the node configured as the **first element** in the `seed-nodes` list must be started when initially starting a cluster. If it is not, the other seed\-nodes will not become initialized, and no other node can join the cluster. The reason for the special first seed node is to avoid forming separated islands when starting from an empty cluster. It is quickest to start all configured seed nodes at the same time (order doesn’t matter), otherwise it can take up to the configured `seed-node-timeout` until the nodes can join.

As soon as more than two seed nodes have been started, it is no problem to shut down the first seed node. If the first seed node is restarted, it will first try to join the other seed nodes in the existing cluster. Note that if you stop all seed nodes at the same time and restart them with the same `seed-nodes` configuration they will join themselves and form a new cluster, instead of joining remaining nodes of the existing cluster. That is likely not desired and can be avoided by listing several nodes as seed nodes for redundancy, and don’t stop all of them at the same time.

If you are going to start the nodes on different machines you need to specify the ip\-addresses or host names of the machines in `application.conf` instead of `127.0.0.1`

#### Joining programmatically to seed nodes

Joining programmatically is useful when **dynamically discovering** other nodes at startup through an external tool or API.

Scala

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-cluster-typed/src/test/scala/docs/akka/cluster/typed/BasicClusterExampleSpec.scala#L62-L68 "Go to snippet source")import akka.actor.Address
import akka.actor.AddressFromURIString
import akka.cluster.typed.JoinSeedNodes

val seedNodes: List[Address] =
  List("akka://[[email protected]](/cdn-cgi/l/email-protection):2551", "akka://[[email protected]](/cdn-cgi/l/email-protection):2552").map(AddressFromURIString.parse)
Cluster(system).manager ! JoinSeedNodes(seedNodes)
```

Java

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-cluster-typed/src/test/java/jdocs/akka/cluster/typed/BasicClusterExampleTest.java#L8-L128 "Go to snippet source")import akka.actor.Address;
import akka.actor.AddressFromURIString;
import akka.cluster.Member;
import akka.cluster.typed.JoinSeedNodes;

List<Address> seedNodes = new ArrayList<>();
seedNodes.add(AddressFromURIString.parse("akka://[[email protected]](/cdn-cgi/l/email-protection):2551"));
seedNodes.add(AddressFromURIString.parse("akka://[[email protected]](/cdn-cgi/l/email-protection):2552"));

Cluster.get(system).manager().tell(new JoinSeedNodes(seedNodes));
```

The seed node address list has the same semantics as the configured `seed-nodes`, and the the underlying implementation of the process is the same, see [Joining configured seed nodes](cluster.html#joining-configured-seed-nodes).

When joining to seed nodes you should not include the node itself, except for the node that is supposed to be the first seed node bootstrapping the cluster. The desired initial seed node address should be placed first in the parameter to the programmatic join.

#### Tuning joins

Unsuccessful attempts to contact seed nodes are automatically retried after the time period defined in configuration property `seed-node-timeout`. Unsuccessful attempts to join a specific seed node are automatically retried after the configured `retry-unsuccessful-join-after`. Retrying means that it tries to contact all seed nodes, then joins the node that answers first. The first node in the list of seed nodes will join itself if it cannot contact any of the other seed nodes within the configured `seed-node-timeout`.

The joining of given seed nodes will, by default, be retried indefinitely until a successful join. That process can be aborted if unsuccessful by configuring a timeout. When aborted it will run [Coordinated Shutdown](../coordinated-shutdown.html), which will terminate the ActorSystem by default. CoordinatedShutdown can also be configured to exit the JVM. If the `seed-nodes` are assembled dynamically, it is useful to define this timeout, and a restart with new seed\-nodes should be tried after unsuccessful attempts.

```
akka.cluster.shutdown-after-unsuccessful-join-seed-nodes = 20s
akka.coordinated-shutdown.exit-jvm = on

```

If you don’t configure seed nodes or use one of the join seed node functions, you need to join the cluster manually by using [JMX](../additional/operations.html#jmx) or [HTTP](../additional/operations.html#http).

You can join to any node in the cluster. It does not have to be configured as a seed node. Note that you can only join to an existing cluster member, which for bootstrapping means a node must join itself and subsequent nodes could join them to make up a cluster.

An actor system can only join a cluster once, additional attempts will be ignored. Once an actor system has successfully joined a cluster, it would have to be restarted to join the same cluster again. It can use the same host name and port after the restart. When it come up as a new incarnation of an existing member in the cluster and attempts to join, the existing member will be removed and its new incarnation allowed to join.

### Leaving

There are a few ways to remove a member from the cluster.

1. The recommended way to leave a cluster is a graceful exit, informing the cluster that a node shall leave. This is performed by [Coordinated Shutdown](../coordinated-shutdown.html) when the [`ActorSystem`](https://doc.akka.io/api/akka-core/2.6/akka/actor/typed/ActorSystem.html "akka.actor.typed.ActorSystem")[`ActorSystem`](https://doc.akka.io/japi/akka-core/2.6/akka/actor/typed/ActorSystem.html "akka.actor.typed.ActorSystem") is terminated and also when a SIGTERM is sent from the environment to stop the JVM process.
2. Graceful exit can also be performed using [HTTP](../additional/operations.html#http) or [JMX](../additional/operations.html#jmx).
3. When a graceful exit is not possible, for example in case of abrupt termination of the the JVM process, the node will be detected as unreachable by other nodes and removed after [Downing](cluster.html#downing).

Graceful leaving offers faster hand off to peer nodes during node shutdown than abrupt termination and downing.

The [Coordinated Shutdown](../coordinated-shutdown.html) will also run when the cluster node sees itself as `Exiting`, i.e. leaving from another node will trigger the shutdown process on the leaving node. Tasks for graceful leaving of cluster, including graceful shutdown of Cluster Singletons and Cluster Sharding, are added automatically when Akka Cluster is used. For example, running the shutdown process will also trigger the graceful leaving if not already in progress.

Normally this is handled automatically, but in case of network failures during this process it may still be necessary to set the node’s status to `Down` in order to complete the removal, see [Downing](cluster.html#downing).

### Downing

In many cases a member can gracefully exit from the cluster, as described in [Leaving](cluster.html#leaving), but there are scenarios when an explicit downing decision is needed before it can be removed. For example in case of abrupt termination of the the JVM process, system overload that doesn’t recover, or network partitions that don’t heal. In such cases, the node(s) will be detected as unreachable by other nodes, but they must also be marked as `Down` before they are removed.

When a member is considered by the failure detector to be `unreachable` the leader is not allowed to perform its duties, such as changing status of new joining members to ‘Up’. The node must first become `reachable` again, or the status of the unreachable member must be changed to `Down`. Changing status to `Down` can be performed automatically or manually.

We recommend that you enable the [Split Brain Resolver](../split-brain-resolver.html) that is part of the Akka Cluster module. You enable it with configuration:

```
akka.cluster.downing-provider-class = "akka.cluster.sbr.SplitBrainResolverProvider"

```

You should also consider the different available [downing strategies](../split-brain-resolver.html#strategies).

If a downing provider is not configured downing must be performed manually using [HTTP](../additional/operations.html#http) or [JMX](../additional/operations.html#jmx).

Note that [Cluster Singleton](cluster-singleton.html) or [Cluster Sharding entities](cluster-sharding.html) that are running on a crashed (unreachable) node will not be started on another node until the previous node has been removed from the Cluster. Removal of crashed (unreachable) nodes is performed after a downing decision.

Downing can also be performed programmatically with `Cluster(system).manager ! Down(address)``Cluster.get(system).manager().tell(Down(address))`, but that is mostly useful from tests and when implementing a [`DowningProvider`](https://doc.akka.io/api/akka-core/2.6/akka/cluster/DowningProvider.html "akka.cluster.DowningProvider")[`DowningProvider`](https://doc.akka.io/japi/akka-core/2.6/akka/cluster/DowningProvider.html "akka.cluster.DowningProvider").

If a crashed node is restarted and joining the cluster again with the same hostname and port, the previous incarnation of that member will first be downed and removed. The new join attempt with same hostname and port is used as evidence that the previous is no longer alive.

If a node is still running and sees its self as `Down` it will shutdown. [Coordinated Shutdown](../coordinated-shutdown.html) will automatically run if `run-coordinated-shutdown-when-down` is set to `on` (the default) however the node will not try and leave the cluster gracefully.

## Node Roles

Not all nodes of a cluster need to perform the same function. For example, there might be one sub\-set which runs the web front\-end, one which runs the data access layer and one for the number\-crunching. Choosing which actors to start on each node, for example cluster\-aware routers, can take node roles into account to achieve this distribution of responsibilities.

The node roles are defined in the configuration property named `akka.cluster.roles` and typically defined in the start script as a system property or environment variable.

The roles are part of the membership information in [`MemberEvent`](https://doc.akka.io/api/akka-core/2.6/akka/cluster/ClusterEvent$$MemberEvent.html "akka.cluster.ClusterEvent.MemberEvent")[`MemberEvent`](https://doc.akka.io/japi/akka-core/2.6/akka/cluster/ClusterEvent.MemberEvent.html "akka.cluster.ClusterEvent.MemberEvent") that you can subscribe to. The roles of the own node are available from the [`selfMember`](https://doc.akka.io/api/akka-core/2.6/akka/cluster/typed/Cluster.html#selfMember:akka.cluster.Member "akka.cluster.typed.Cluster")[`selfMember()`](https://doc.akka.io/japi/akka-core/2.6/akka/cluster/typed/Cluster.html#selfMember() "akka.cluster.typed.Cluster") and that can be used for conditionally starting certain actors:

Scala

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-cluster-typed/src/test/scala/docs/akka/cluster/typed/BasicClusterExampleSpec.scala#L84-L89 "Go to snippet source")val selfMember = Cluster(context.system).selfMember
if (selfMember.hasRole("backend")) {
  context.spawn(Backend(), "back")
} else if (selfMember.hasRole("frontend")) {
  context.spawn(Frontend(), "front")
}
```

Java

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-cluster-typed/src/test/java/jdocs/akka/cluster/typed/BasicClusterExampleTest.java#L148-L153 "Go to snippet source")Member selfMember = Cluster.get(context.getSystem()).selfMember();
if (selfMember.hasRole("backend")) {
  context.spawn(Backend.create(), "back");
} else if (selfMember.hasRole("front")) {
  context.spawn(Frontend.create(), "front");
}
```

## Failure Detector

The nodes in the cluster monitor each other by sending heartbeats to detect if a node is unreachable from the rest of the cluster. Please see:

- [Failure Detector specification](cluster-concepts.html#failure-detector)
- [Phi Accrual Failure Detector](failure-detector.html) implementation
- [Using the Failure Detector](cluster.html#using-the-failure-detector)

### Using the Failure Detector

Cluster uses the [`akka.remote.PhiAccrualFailureDetector`](https://doc.akka.io/api/akka-core/2.6/akka/remote/PhiAccrualFailureDetector.html "akka.remote.PhiAccrualFailureDetector")[`akka.remote.PhiAccrualFailureDetector`](https://doc.akka.io/japi/akka-core/2.6/akka/remote/PhiAccrualFailureDetector.html "akka.remote.PhiAccrualFailureDetector") failure detector by default, or you can provide your by implementing the [`akka.remote.FailureDetector`](https://doc.akka.io/api/akka-core/2.6/akka/remote/FailureDetector.html "akka.remote.FailureDetector")[`akka.remote.FailureDetector`](https://doc.akka.io/japi/akka-core/2.6/akka/remote/FailureDetector.html "akka.remote.FailureDetector") and configuring it:

```
akka.cluster.implementation-class = "com.example.CustomFailureDetector"

```

In the [Cluster Configuration](cluster.html#configuration) you may want to adjust these depending on you environment:

- When a *phi* value is considered to be a failure `akka.cluster.failure-detector.threshold`
- Margin of error for sudden abnormalities `akka.cluster.failure-detector.acceptable-heartbeat-pause`

## How to test

Akka comes with and uses several types of testing strategies:

- [Testing](testing.html)
- [Multi Node Testing](../multi-node-testing.html)
- [Multi JVM Testing](../multi-jvm-testing.html)

## Configuration

There are several configuration properties for the cluster. Refer to the [reference configuration](../general/configuration-reference.html#config-akka-cluster) for full configuration descriptions, default values and options.

### How To Startup when a Cluster size is reached

A common use case is to start actors after the cluster has been initialized, members have joined, and the cluster has reached a certain size.

With a configuration option you can define the required number of members before the leader changes member status of ‘Joining’ members to ‘Up’.:

```
akka.cluster.min-nr-of-members = 3

```

In a similar way you can define the required number of members of a certain role before the leader changes member status of ‘Joining’ members to ‘Up’.:

```
akka.cluster.role {
  frontend.min-nr-of-members = 1
  backend.min-nr-of-members = 2
}

```

### Cluster Info Logging

You can silence the logging of cluster events at info level with configuration property:

```
akka.cluster.log-info = off

```

You can enable verbose logging of cluster events at info level, e.g. for temporary troubleshooting, with configuration property:

```
akka.cluster.log-info-verbose = on

```

### Cluster Dispatcher

The Cluster extension is implemented with actors. To protect them against disturbance from user actors they are by default run on the internal dispatcher configured under `akka.actor.internal-dispatcher`. The cluster actors can potentially be isolated even further, onto their own dispatcher using the setting `akka.cluster.use-dispatcher` or made run on the same dispatcher to keep the number of threads down.

### Configuration Compatibility Check

Creating a cluster is about deploying two or more nodes and having them behave as if they were a single application. Therefore it’s extremely important that all nodes in a cluster are configured with compatible settings. 

The Configuration Compatibility Check feature ensures that all nodes in a cluster have a compatible configuration. Whenever a new node is joining an existing cluster, a subset of its configuration settings (only those that are required to be checked) is sent to the nodes in the cluster for verification. Once the configuration is checked on the cluster side, the cluster sends back its own set of required configuration settings. The joining node will then verify if it’s compliant with the cluster configuration. The joining node will only proceed if all checks pass, on both sides. 

New custom checkers can be added by extending [`akka.cluster.JoinConfigCompatChecker`](https://doc.akka.io/api/akka-core/2.6/akka/cluster/JoinConfigCompatChecker.html "akka.cluster.JoinConfigCompatChecker")[`akka.cluster.JoinConfigCompatChecker`](https://doc.akka.io/japi/akka-core/2.6/akka/cluster/JoinConfigCompatChecker.html "akka.cluster.JoinConfigCompatChecker") and including them in the configuration. Each checker must be associated with a unique key:

```
akka.cluster.configuration-compatibility-check.checkers {
  my-custom-config = "com.company.MyCustomJoinConfigCompatChecker"
}

```
Note
Configuration Compatibility Check is enabled by default, but can be disabled by setting `akka.cluster.configuration-compatibility-check.enforce-on-join = off`. This is specially useful when performing rolling updates. Obviously this should only be done if a complete cluster shutdown isn’t an option. A cluster with nodes with different configuration settings may lead to data loss or data corruption. 

This setting should only be disabled on the joining nodes. The checks are always performed on both sides, and warnings are logged. In case of incompatibilities, it is the responsibility of the joining node to decide if the process should be interrupted or not. 

If you are performing a rolling update on cluster using Akka 2\.5\.9 or prior (thus, not supporting this feature), the checks will not be performed because the running cluster has no means to verify the configuration sent by the joining node, nor to send back its own configuration. 

## Higher level Cluster tools

### Cluster Singleton

For some use cases it is convenient or necessary to ensure only one actor of a certain type is running somewhere in the cluster. This can be implemented by subscribing to member events, but there are several corner cases to consider. Therefore, this specific use case is covered by the Cluster Singleton.

See [Cluster Singleton](cluster-singleton.html).

### Cluster Sharding

Distributes actors across several nodes in the cluster and supports interaction with the actors using their logical identifier, but without having to care about their physical location in the cluster.

See [Cluster Sharding](cluster-sharding.html).

### Distributed Data

Distributed Data is useful when you need to share data between nodes in an Akka Cluster. The data is accessed with an actor providing a key\-value store like API.

See [Distributed Data](distributed-data.html).

### Distributed Publish Subscribe

Publish\-subscribe messaging between actors in the cluster based on a topic, i.e. the sender does not have to know on which node the destination actor is running.

See [Distributed Publish Subscribe](distributed-pub-sub.html).

### Cluster aware routers

Distribute messages to actors on different nodes in the cluster with routing strategies like round\-robin and consistent hashing.

See [Group Routers](routers.html#group-router). 

### Cluster across multiple data centers

Akka Cluster can be used across multiple data centers, availability zones or regions, so that one Cluster can span multiple data centers and still be tolerant to network partitions.

See [Cluster Multi\-DC](cluster-dc.html).

### Reliable Delivery

Reliable delivery and flow control of messages between actors in the Cluster.

See [Reliable Delivery](reliable-delivery.html)

## Example project

[Cluster example project](https://developer.lightbend.com/start/?group=akka&project=akka-samples-cluster-java) [Cluster example project](https://developer.lightbend.com/start/?group=akka&project=akka-samples-cluster-scala) is an example project that can be downloaded, and with instructions of how to run.

This project contains samples illustrating different Cluster features, such as subscribing to cluster membership events, and sending messages to actors running on nodes in the cluster with Cluster aware routers.

## Code Examples

### Example 1: Module info

```scala
val AkkaVersion = "2.6.21"
libraryDependencies += "com.typesafe.akka" %% "akka-cluster-typed" % AkkaVersion
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
      <version>2.6.21</version>
      <type>pom</type>
      <scope>import</scope>
    </dependency&gt
  </dependencies>
</dependencyManagement>
<dependencies&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-cluster-typed_${scala.binary.version}</artifactId>
  </dependency&gt
</dependencies>
```

### Example 3: Module info

```gradle
def versions = [
  ScalaBinary: "2.13"
]
dependencies {
  implementation platform("com.typesafe.akka:akka-bom_${versions.ScalaBinary}:2.6.21")

  implementation "com.typesafe.akka:akka-cluster-typed_${versions.ScalaBinary}"
}
```

### Example 4: Cluster API Extension

```scala
import akka.actor.typed._
import akka.actor.typed.scaladsl._
import akka.cluster.ClusterEvent._
import akka.cluster.MemberStatus
import akka.cluster.typed._
```

### Example 5: Cluster API Extension

```java
import akka.actor.typed.*;
import akka.actor.typed.javadsl.*;
import akka.cluster.ClusterEvent;
import akka.cluster.typed.*;
```

### Example 6: Cluster API Extension

```scala
akka {
  actor {
    provider = "cluster"
  }
  remote.artery {
    canonical {
      hostname = "127.0.0.1"
      port = 2551
    }
  }

  cluster {
    seed-nodes = [
      "akka://[email protected]:2551",
      "akka://[email protected]:2552"]
    
    downing-provider-class = "akka.cluster.sbr.SplitBrainResolverProvider"
  }
}
```

### Example 7: Cluster API Extension

```scala
val cluster = Cluster(system)
```

### Example 8: Cluster API Extension

```java
Cluster cluster = Cluster.get(system);
```

### Example 9: Joining and Leaving a Cluster

```scala
cluster.manager ! Join(cluster.selfMember.address)
```

### Example 10: Joining and Leaving a Cluster

```java
cluster.manager().tell(Join.create(cluster.selfMember().address()));
```

### Example 11: Joining and Leaving a Cluster

```scala
cluster2.manager ! Leave(cluster2.selfMember.address)
```

### Example 12: Joining and Leaving a Cluster

```java
cluster2.manager().tell(Leave.create(cluster2.selfMember().address()));
```

### Example 13: Cluster Subscriptions

```scala
cluster.subscriptions ! Subscribe(subscriber, classOf[MemberEvent])
```

### Example 14: Cluster Subscriptions

```java
cluster.subscriptions().tell(Subscribe.create(subscriber, ClusterEvent.MemberEvent.class));
```

### Example 15: Cluster Subscriptions

```scala
cluster.manager ! Leave(anotherMemberAddress)
// subscriber will receive events MemberLeft, MemberExited and MemberRemoved
```

### Example 16: Cluster Subscriptions

```java
cluster.manager().tell(Leave.create(anotherMemberAddress));
// subscriber will receive events MemberLeft, MemberExited and MemberRemoved
```

### Example 17: Joining configured seed nodes

```text
akka.cluster.seed-nodes = [
  "akka://ClusterSystem@host1:2552",
  "akka://ClusterSystem@host2:2552"]
```

### Example 18: Joining configured seed nodes

```text
-Dakka.cluster.seed-nodes.0=akka://ClusterSystem@host1:2552
-Dakka.cluster.seed-nodes.1=akka://ClusterSystem@host2:2552
```

### Example 19: Joining programmatically to seed nodes

```scala
import akka.actor.Address
import akka.actor.AddressFromURIString
import akka.cluster.typed.JoinSeedNodes

val seedNodes: List[Address] =
  List("akka://[email protected]:2551", "akka://[email protected]:2552").map(AddressFromURIString.parse)
Cluster(system).manager ! JoinSeedNodes(seedNodes)
```

### Example 20: Joining programmatically to seed nodes

```java
import akka.actor.Address;
import akka.actor.AddressFromURIString;
import akka.cluster.Member;
import akka.cluster.typed.JoinSeedNodes;

List<Address> seedNodes = new ArrayList<>();
seedNodes.add(AddressFromURIString.parse("akka://[email protected]:2551"));
seedNodes.add(AddressFromURIString.parse("akka://[email protected]:2552"));

Cluster.get(system).manager().tell(new JoinSeedNodes(seedNodes));
```

### Example 21: Tuning joins

```text
akka.cluster.shutdown-after-unsuccessful-join-seed-nodes = 20s
akka.coordinated-shutdown.exit-jvm = on
```

### Example 22: Downing

```text
akka.cluster.downing-provider-class = "akka.cluster.sbr.SplitBrainResolverProvider"
```

### Example 23: Node Roles

```scala
val selfMember = Cluster(context.system).selfMember
if (selfMember.hasRole("backend")) {
  context.spawn(Backend(), "back")
} else if (selfMember.hasRole("frontend")) {
  context.spawn(Frontend(), "front")
}
```

### Example 24: Node Roles

```java
Member selfMember = Cluster.get(context.getSystem()).selfMember();
if (selfMember.hasRole("backend")) {
  context.spawn(Backend.create(), "back");
} else if (selfMember.hasRole("front")) {
  context.spawn(Frontend.create(), "front");
}
```

### Example 25: Using the Failure Detector

```text
akka.cluster.implementation-class = "com.example.CustomFailureDetector"
```

### Example 26: How To Startup when a Cluster size is reached

```text
akka.cluster.min-nr-of-members = 3
```

### Example 27: How To Startup when a Cluster size is reached

```text
akka.cluster.role {
  frontend.min-nr-of-members = 1
  backend.min-nr-of-members = 2
}
```

### Example 28: Cluster Info Logging

```text
akka.cluster.log-info = off
```

### Example 29: Cluster Info Logging

```text
akka.cluster.log-info-verbose = on
```

### Example 30: Configuration Compatibility Check

```text
akka.cluster.configuration-compatibility-check.checkers {
  my-custom-config = "com.company.MyCustomJoinConfigCompatChecker"
}
```

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.6.21/akka/cluster/typed/index.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/typed/ActorRef.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/typed/ActorSystem.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/ClusterEvent$$ClusterDomainEvent.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/ClusterEvent$$CurrentClusterState.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/ClusterEvent$$MemberEvent.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/ClusterEvent$$MemberRemoved.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/DowningProvider.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/JoinConfigCompatChecker.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/typed/Cluster$.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/typed/Cluster.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/typed/ClusterCommand.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/typed/ClusterStateSubscription.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/typed/Down.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/typed/GetCurrentState.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/typed/Join.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/typed/Leave.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/typed/Subscribe.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/typed/Unsubscribe.html
- https://doc.akka.io/api/akka-core/2.6/akka/remote/FailureDetector.html
- https://doc.akka.io/api/akka-core/2.6/akka/remote/PhiAccrualFailureDetector.html
- https://doc.akka.io/cdn-cgi/l/email-protection
- https://doc.akka.io/japi/akka-core/2.6.21/akka/cluster/typed/package-summary.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/typed/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/typed/ActorSystem.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/ClusterEvent.ClusterDomainEvent.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/ClusterEvent.CurrentClusterState.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/ClusterEvent.MemberEvent.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/ClusterEvent.MemberRemoved.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/DowningProvider.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/JoinConfigCompatChecker.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/typed/Cluster.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/typed/ClusterCommand.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/typed/ClusterStateSubscription.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/typed/Down.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/typed/GetCurrentState.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/typed/Join.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/typed/Leave.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/typed/Subscribe.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/typed/Unsubscribe.html
- https://doc.akka.io/japi/akka-core/2.6/akka/remote/FailureDetector.html
- https://doc.akka.io/japi/akka-core/2.6/akka/remote/PhiAccrualFailureDetector.html
- https://doc.akka.io/libraries/akka-core/2.6/additional/operations.html
- https://doc.akka.io/libraries/akka-core/2.6/additional/rolling-updates.html
- https://doc.akka.io/libraries/akka-core/2.6/cluster-usage.html
- https://doc.akka.io/libraries/akka-core/2.6/coordinated-shutdown.html
- https://doc.akka.io/libraries/akka-core/2.6/general/configuration-reference.html
- https://doc.akka.io/libraries/akka-core/2.6/multi-jvm-testing.html
- https://doc.akka.io/libraries/akka-core/2.6/multi-node-testing.html
- https://doc.akka.io/libraries/akka-core/2.6/serialization-jackson.html

---
*Source: [https://doc.akka.io/libraries/akka-core/2.6/typed/cluster.html](https://doc.akka.io/libraries/akka-core/2.6/typed/cluster.html)*