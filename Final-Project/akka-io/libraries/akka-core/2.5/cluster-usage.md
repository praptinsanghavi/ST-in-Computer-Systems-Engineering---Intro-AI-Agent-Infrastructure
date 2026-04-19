---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:19:54Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/cluster-usage.html
title: Cluster Usage • Akka Documentation
---

# Cluster Usage • Akka Documentation

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

# Cluster Usage

For introduction to the Akka Cluster concepts please see [Cluster Specification](common/cluster.html).

The core of Akka Cluster is the cluster membership, to keep track of what nodes are part of the cluster and their health. There are several [Higher level Cluster tools](cluster-usage.html#higher-level-cluster-tools) that are built on top of the cluster membership.

## Dependency

To use Akka Cluster, you must add the following dependency in your project:

sbt
```
libraryDependencies += "com.typesafe.akka" %% "akka-cluster" % "2.5.32"
```
Maven
```
<dependencies&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-cluster_2.12</artifactId>
    <version>2.5.32</version>
  </dependency&gt
</dependencies>
```
Gradle
```
dependencies {
  implementation "com.typesafe.akka:akka-cluster_2.12:2.5.32"
}
```

## Sample project

You can look at the [Cluster example project](https://developer.lightbend.com/start/?group=akka&project=akka-samples-cluster-java) [Cluster example project](https://developer.lightbend.com/start/?group=akka&project=akka-samples-cluster-scala) to see what this looks like in practice.

## When and where to use Akka Cluster

An architectural choice you have to make is if you are going to use a microservices architecture or a traditional distributed application. This choice will influence how you should use Akka Cluster.

### Microservices

Microservices has many attractive properties, such as the independent nature of microservices allows for multiple smaller and more focused teams that can deliver new functionality more frequently and can respond quicker to business opportunities. Reactive Microservices should be isolated, autonomous, and have a single responsibility as identified by Jonas Bonér in the book [Reactive Microsystems: The Evolution of Microservices at Scale](https://info.lightbend.com/ebook-reactive-microservices-the-evolution-of-microservices-at-scale-register.html).

In a microservices architecture, you should consider communication within a service and between services.

In general we recommend against using Akka Cluster and actor messaging between *different* services because that would result in a too tight code coupling between the services and difficulties deploying these independent of each other, which is one of the main reasons for using a microservices architecture. See the discussion on [Internal and External Communication](https://www.lagomframework.com/documentation/current/scala/InternalAndExternalCommunication.html) [Internal and External Communication](https://www.lagomframework.com/documentation/current/java/InternalAndExternalCommunication.html) in the docs of the [Lagom Framework](https://www.lagomframework.com) (where each microservice is an Akka Cluster) for some background on this.

Nodes of a single service (collectively called a cluster) require less decoupling. They share the same code and are deployed together, as a set, by a single team or individual. There might be two versions running concurrently during a rolling deployment, but deployment of the entire set has a single point of control. For this reason, intra\-service communication can take advantage of Akka Cluster, failure management and actor messaging, which is convenient to use and has great performance.

Between different services [Akka HTTP](https://doc.akka.io/libraries/akka-http/current) or [Akka gRPC](https://doc.akka.io/libraries/akka-grpc/current/) can be used for synchronous (yet non\-blocking) communication and [Akka Streams Kafka](https://doc.akka.io/libraries/akka-stream-kafka/current/home.html) or other [Alpakka](https://doc.akka.io/docs/alpakka/current/) connectors for integration asynchronous communication. All those communication mechanisms work well with streaming of messages with end\-to\-end back\-pressure, and the synchronous communication tools can also be used for single request response interactions. It is also important to note that when using these tools both sides of the communication do not have to be implemented with Akka, nor does the programming language matter.

### Traditional distributed application

We acknowledge that microservices also introduce many new challenges and it’s not the only way to build applications. A traditional distributed application may have less complexity and work well in many cases. For example for a small startup, with a single team, building an application where time to market is everything. Akka Cluster can efficiently be used for building such distributed application.

In this case, you have a single deployment unit, built from a single code base (or using traditional binary dependency management to modularize) but deployed across many nodes using a single cluster. Tighter coupling is OK, because there is a central point of deployment and control. In some cases, nodes may have specialized runtime roles which means that the cluster is not totally homogenous (e.g., “front\-end” and “back\-end” nodes, or dedicated master/worker nodes) but if these are run from the same built artifacts this is just a runtime behavior and doesn’t cause the same kind of problems you might get from tight coupling of totally separate artifacts.

A tightly coupled distributed application has served the industry and many Akka users well for years and is still a valid choice.

### Distributed monolith

There is also an anti\-pattern that is sometimes called “distributed monolith”. You have multiple services that are built and deployed independently from each other, but they have a tight coupling that makes this very risky, such as a shared cluster, shared code and dependencies for service API calls, or a shared database schema. There is a false sense of autonomy because of the physical separation of the code and deployment units, but you are likely to encounter problems because of changes in the implementation of one service leaking into the behavior of others. See Ben Christensen’s [Don’t Build a Distributed Monolith](https://www.microservices.com/talks/dont-build-a-distributed-monolith/).

Organizations that find themselves in this situation often react by trying to centrally coordinate deployment of multiple services, at which point you have lost the principal benefit of microservices while taking on the costs. You are in a halfway state with things that aren’t really separable being built and deployed in a separate way. Some people do this, and some manage to make it work, but it’s not something we would recommend and it needs to be carefully managed.

## A Simple Cluster Example

The following configuration enables the `Cluster` extension to be used. It joins the cluster and an actor subscribes to cluster membership events and logs them.

The `application.conf` configuration looks like this:

```
akka {
  actor {
    provider = "cluster"
  }
  remote {
    log-remote-lifecycle-events = off
    netty.tcp {
      hostname = "127.0.0.1"
      port = 0
    }
  }

  cluster {
    seed-nodes = [
      "akka.tcp://[[email protected]](/cdn-cgi/l/email-protection):2551",
      "akka.tcp://[[email protected]](/cdn-cgi/l/email-protection):2552"]

    # auto downing is NOT safe for production deployments.
    # you may want to use it during development, read more about it in the docs.
    #
    # auto-down-unreachable-after = 10s
  }
}

# Enable metrics extension in akka-cluster-metrics.
akka.extensions=["akka.cluster.metrics.ClusterMetricsExtension"]

# Sigar native library extract location during tests.
# Note: use per-jvm-instance folder when running multiple jvm on one host.
akka.cluster.metrics.native-library-extract-folder=${user.dir}/target/native

```

To enable cluster capabilities in your Akka project you should, at a minimum, add the [Remoting](remoting.html) settings, but with `cluster`. The `akka.cluster.seed-nodes` should normally also be added to your `application.conf` file.

Note
If you are running Akka in a Docker container or the nodes for some other reason have separate internal and external ip addresses you must configure remoting according to [Akka behind NAT or in a Docker container](remoting.html#remote-configuration-nat)

The seed nodes are configured contact points for initial, automatic, join of the cluster.

Note that if you are going to start the nodes on different machines you need to specify the ip\-addresses or host names of the machines in `application.conf` instead of `127.0.0.1`

An actor that uses the cluster extension may look like this:

Scala

```
[source](https://github.com/akka/akka/tree/v2.5.32/akka-docs/src/test/scala/docs/cluster/SimpleClusterListener.scala "Go to snippet source")/*
 * Copyright (C) 2018-2019 Lightbend Inc. <https://www.lightbend.com>
 */

package scala.docs.cluster

import akka.cluster.Cluster
import akka.cluster.ClusterEvent._
import akka.actor.ActorLogging
import akka.actor.Actor

class SimpleClusterListener extends Actor with ActorLogging {

  val cluster = Cluster(context.system)

  // subscribe to cluster changes, re-subscribe when restart
  override def preStart(): Unit = {
    //#subscribe
    cluster.subscribe(self, initialStateMode = InitialStateAsEvents, classOf[MemberEvent], classOf[UnreachableMember])
    //#subscribe
  }
  override def postStop(): Unit = cluster.unsubscribe(self)

  def receive = {
    case MemberUp(member) =>
      log.info("Member is Up: {}", member.address)
    case UnreachableMember(member) =>
      log.info("Member detected as unreachable: {}", member)
    case MemberRemoved(member, previousStatus) =>
      log.info("Member is Removed: {} after {}", member.address, previousStatus)
    case _: MemberEvent => // ignore
  }
}
```

Java

```
[source](https://github.com/akka/akka/tree/v2.5.32/akka-docs/src/test/java/jdocs/cluster/SimpleClusterListener.java "Go to snippet source")/*
 * Copyright (C) 2018-2019 Lightbend Inc. <https://www.lightbend.com>
 */

package jdocs.cluster;

import akka.actor.AbstractActor;
import akka.cluster.Cluster;
import akka.cluster.ClusterEvent;
import akka.cluster.ClusterEvent.MemberEvent;
import akka.cluster.ClusterEvent.MemberUp;
import akka.cluster.ClusterEvent.MemberRemoved;
import akka.cluster.ClusterEvent.UnreachableMember;
import akka.event.Logging;
import akka.event.LoggingAdapter;

public class SimpleClusterListener extends AbstractActor {
  LoggingAdapter log = Logging.getLogger(getContext().getSystem(), this);
  Cluster cluster = Cluster.get(getContext().getSystem());

  // subscribe to cluster changes
  @Override
  public void preStart() {
    // #subscribe
    cluster.subscribe(
        getSelf(), ClusterEvent.initialStateAsEvents(), MemberEvent.class, UnreachableMember.class);
    // #subscribe
  }

  // re-subscribe when restart
  @Override
  public void postStop() {
    cluster.unsubscribe(getSelf());
  }

  @Override
  public Receive createReceive() {
    return receiveBuilder()
        .match(
            MemberUp.class,
            mUp -> {
              log.info("Member is Up: {}", mUp.member());
            })
        .match(
            UnreachableMember.class,
            mUnreachable -> {
              log.info("Member detected as unreachable: {}", mUnreachable.member());
            })
        .match(
            MemberRemoved.class,
            mRemoved -> {
              log.info("Member is Removed: {}", mRemoved.member());
            })
        .match(
            MemberEvent.class,
            message -> {
              // ignore
            })
        .build();
  }
}
```

The actor registers itself as subscriber of certain cluster events. It receives events corresponding to the current state of the cluster when the subscription starts and then it receives events for changes that happen in the cluster.

The easiest way to run this example yourself is to try the [Akka Cluster Sample with Scala](https://developer.lightbend.com/start/?group=akka&project=akka-samples-cluster-scala)[Akka Cluster Sample with Java](https://developer.lightbend.com/start/?group=akka&project=akka-samples-cluster-java). It contains instructions on how to run the `SimpleClusterApp`.

## Joining to Seed Nodes

Note
When starting clusters on cloud systems such as Kubernetes, AWS, Google Cloud, Azure, Mesos or others which maintain DNS or other ways of discovering nodes, you may want to use the automatic joining process implemented by the open source [Akka Cluster Bootstrap](https://doc.akka.io/libraries/akka-management/current/bootstrap/index.html) module.

### Joining configured seed nodes

You may decide if joining to the cluster should be done manually or automatically to configured initial contact points, so\-called seed nodes. After the joining process the seed nodes are not special and they participate in the cluster in exactly the same way as other nodes.

When a new node is started it sends a message to all seed nodes and then sends join command to the one that answers first. If no one of the seed nodes replied (might not be started yet) it retries this procedure until successful or shutdown.

You define the seed nodes in the [configuration](#cluster-configuration) file (application.conf):

```
akka.cluster.seed-nodes = [
  "akka.tcp://ClusterSystem@host1:2552",
  "akka.tcp://ClusterSystem@host2:2552"]

```

This can also be defined as Java system properties when starting the JVM using the following syntax:

```
-Dakka.cluster.seed-nodes.0=akka.tcp://ClusterSystem@host1:2552
-Dakka.cluster.seed-nodes.1=akka.tcp://ClusterSystem@host2:2552

```

The seed nodes can be started in any order and it is not necessary to have all seed nodes running, but the node configured as the **first element** in the `seed-nodes` configuration list must be started when initially starting a cluster, otherwise the other seed\-nodes will not become initialized and no other node can join the cluster. The reason for the special first seed node is to avoid forming separated islands when starting from an empty cluster. It is quickest to start all configured seed nodes at the same time (order doesn’t matter), otherwise it can take up to the configured `seed-node-timeout` until the nodes can join.

Once more than two seed nodes have been started it is no problem to shut down the first seed node. If the first seed node is restarted, it will first try to join the other seed nodes in the existing cluster. Note that if you stop all seed nodes at the same time and restart them with the same `seed-nodes` configuration they will join themselves and form a new cluster instead of joining remaining nodes of the existing cluster. That is likely not desired and should be avoided by listing several nodes as seed nodes for redundancy and don’t stop all of them at the same time.

### Automatically joining to seed nodes with Cluster Bootstrap

Instead of manually configuring seed nodes, which is useful in development or statically assigned node IPs, you may want to automate the discovery of seed nodes using your cloud providers or cluster orchestrator, or some other form of service discovery (such as managed DNS). The open source Akka Management library includes the [Cluster Bootstrap](https://doc.akka.io/libraries/akka-management/current/bootstrap/index.html) module which handles just that. Please refer to its documentation for more details.

### Programatically joining to seed nodes with `joinSeedNodes`

You may also use `Cluster(system).joinSeedNodes``Cluster.get(system).joinSeedNodes` to join programmatically, which is attractive when dynamically discovering other nodes at startup by using some external tool or API. When using `joinSeedNodes` you should not include the node itself except for the node that is supposed to be the first seed node, and that should be placed first in the parameter to `joinSeedNodes`.

Scala

```
[source](https://github.com/akka/akka/tree/v2.5.32/akka-docs/src/test/scala/docs/cluster/ClusterDocSpec.scala#L47-L52 "Go to snippet source")import akka.actor.Address
import akka.cluster.Cluster

val cluster = Cluster(system)
val list: List[Address] = ??? //your method to dynamically get seed nodes
cluster.joinSeedNodes(list)
```

Java

```
[source](https://github.com/akka/akka/tree/v2.5.32/akka-docs/src/test/java/jdocs/cluster/ClusterDocTest.java#L19-L21 "Go to snippet source")import akka.actor.Address;
import akka.cluster.Cluster;

final Cluster cluster = Cluster.get(system);
List<Address> list =
    new LinkedList<>(); // replace this with your method to dynamically get seed nodes
cluster.joinSeedNodes(list);
```

Unsuccessful attempts to contact seed nodes are automatically retried after the time period defined in configuration property `seed-node-timeout`. Unsuccessful attempt to join a specific seed node is automatically retried after the configured `retry-unsuccessful-join-after`. Retrying means that it tries to contact all seed nodes and then joins the node that answers first. The first node in the list of seed nodes will join itself if it cannot contact any of the other seed nodes within the configured `seed-node-timeout`.

The joining of given seed nodes will by default be retried indefinitely until a successful join. That process can be aborted if unsuccessful by configuring a timeout. When aborted it will run [Coordinated Shutdown](actors.html#coordinated-shutdown), which by default will terminate the ActorSystem. CoordinatedShutdown can also be configured to exit the JVM. It is useful to define this timeout if the `seed-nodes` are assembled dynamically and a restart with new seed\-nodes should be tried after unsuccessful attempts.

```
akka.cluster.shutdown-after-unsuccessful-join-seed-nodes = 20s
akka.coordinated-shutdown.terminate-actor-system = on

```

If you don’t configure seed nodes or use `joinSeedNodes` you need to join the cluster manually, which can be performed by using [JMX](#cluster-jmx) or [HTTP](#cluster-http).

You can join to any node in the cluster. It does not have to be configured as a seed node. Note that you can only join to an existing cluster member, which means that for bootstrapping some node must join itself,and then the following nodes could join them to make up a cluster.

An actor system can only join a cluster once. Additional attempts will be ignored. When it has successfully joined it must be restarted to be able to join another cluster or to join the same cluster again. It can use the same host name and port after the restart, when it come up as new incarnation of existing member in the cluster, trying to join in, then the existing one will be removed from the cluster and then it will be allowed to join.

Note
The name of the `ActorSystem` must be the same for all members of a cluster. The name is given when you start the `ActorSystem`.

## Downing

When a member is considered by the failure detector to be unreachable the leader is not allowed to perform its duties, such as changing status of new joining members to ‘Up’. The node must first become reachable again, or the status of the unreachable member must be changed to ‘Down’. Changing status to ‘Down’ can be performed automatically or manually. By default it must be done manually, using [JMX](#cluster-jmx) or [HTTP](#cluster-http).

It can also be performed programmatically with `Cluster(system).down(address)``Cluster.get(system).down(address)`.

If a node is still running and sees its self as Down it will shutdown. [Coordinated Shutdown](actors.html#coordinated-shutdown) will automatically run if `run-coordinated-shutdown-when-down` is set to `on` (the default) however the node will not try and leave the cluster gracefully so sharding and singleton migration will not occur.

A pre\-packaged solution for the downing problem is provided by [Split Brain Resolver](http://developer.lightbend.com/docs/akka-commercial-addons/current/split-brain-resolver.html), which is part of the [Lightbend Reactive Platform](http://www.lightbend.com/platform). If you don’t use RP, you should anyway carefully read the [documentation](http://developer.lightbend.com/docs/akka-commercial-addons/current/split-brain-resolver.html) of the Split Brain Resolver and make sure that the solution you are using handles the concerns described there.

### Auto\-downing (DO NOT USE)

There is an automatic downing feature that you should not use in production. For testing purpose you can enable it with configuration:

```
akka.cluster.auto-down-unreachable-after = 120s

```

This means that the cluster leader member will change the `unreachable` node status to `down` automatically after the configured time of unreachability.

This is a naïve approach to remove unreachable nodes from the cluster membership. It can be useful during development but in a production environment it will eventually breakdown the cluster. When a network partition occurs, both sides of the partition will see the other side as unreachable and remove it from the cluster. This results in the formation of two separate, disconnected, clusters (known as *Split Brain*).

This behaviour is not limited to network partitions. It can also occur if a node in the cluster is overloaded, or experiences a long GC pause.

Warning
We recommend against using the auto\-down feature of Akka Cluster in production. It has multiple undesirable consequences for production systems.

If you are using [Cluster Singleton](cluster-singleton.html) or [Cluster Sharding](cluster-sharding.html) it can break the contract provided by those features. Both provide a guarantee that an actor will be unique in a cluster. With the auto\-down feature enabled, it is possible for multiple independent clusters to form (\*Split Brain\*). When this happens the guaranteed uniqueness will no longer be true resulting in undesirable behaviour in the system.

This is even more severe when [Akka Persistence](persistence.html) is used in conjunction with Cluster Sharding. In this case, the lack of unique actors can cause multiple actors to write to the same journal. Akka Persistence operates on a single writer principle. Having multiple writers will corrupt the journal and make it unusable.

Finally, even if you don’t use features such as Persistence, Sharding, or Singletons, auto\-downing can lead the system to form multiple small clusters. These small clusters will be independent from each other. They will be unable to communicate and as a result you may experience performance degradation. Once this condition occurs, it will require manual intervention in order to reform the cluster.

Because of these issues, auto\-downing should **never** be used in a production environment.

## Leaving

There are two ways to remove a member from the cluster.

You can stop the actor system (or the JVM process). It will be detected as unreachable and removed after the automatic or manual downing as described above.

A more graceful exit can be performed if you tell the cluster that a node shall leave. This can be performed using [JMX](#cluster-jmx) or [HTTP](#cluster-http). It can also be performed programmatically with:

Scala

```
[source](https://github.com/akka/akka/tree/v2.5.32/akka-docs/src/test/scala/docs/cluster/ClusterDocSpec.scala#L25-L26 "Go to snippet source")val cluster = Cluster(system)
cluster.leave(cluster.selfAddress)
```

Java

```
[source](https://github.com/akka/akka/tree/v2.5.32/akka-docs/src/test/java/jdocs/cluster/ClusterDocTest.java#L47-L48 "Go to snippet source")final Cluster cluster = Cluster.get(system);
cluster.leave(cluster.selfAddress());
```

Note that this command can be issued to any member in the cluster, not necessarily the one that is leaving.

The [Coordinated Shutdown](actors.html#coordinated-shutdown) will automatically run when the cluster node sees itself as `Exiting`, i.e. leaving from another node will trigger the shutdown process on the leaving node. Tasks for graceful leaving of cluster including graceful shutdown of Cluster Singletons and Cluster Sharding are added automatically when Akka Cluster is used, i.e. running the shutdown process will also trigger the graceful leaving if it’s not already in progress.

Normally this is handled automatically, but in case of network failures during this process it might still be necessary to set the node’s status to `Down` in order to complete the removal.

## WeaklyUp Members

If a node is `unreachable` then gossip convergence is not possible and therefore any `leader` actions are also not possible. However, we still might want new nodes to join the cluster in this scenario.

`Joining` members will be promoted to `WeaklyUp` and become part of the cluster if convergence can’t be reached. Once gossip convergence is reached, the leader will move `WeaklyUp` members to `Up`.

This feature is enabled by default, but it can be disabled with configuration option:

```
akka.cluster.allow-weakly-up-members = off

```

You can subscribe to the `WeaklyUp` membership event to make use of the members that are in this state, but you should be aware of that members on the other side of a network partition have no knowledge about the existence of the new members. You should for example not count `WeaklyUp` members in quorum decisions.

## Subscribe to Cluster Events

You can subscribe to change notifications of the cluster membership by using `Cluster(system).subscribe``Cluster.get(system).subscribe`.

Scala

```
[source](https://github.com/akka/akka/tree/v2.5.32/akka-docs/src/test/scala/docs/cluster/SimpleClusterListener2.scala#L24 "Go to snippet source")cluster.subscribe(self, classOf[MemberEvent], classOf[UnreachableMember])
```

Java

```
[source](https://github.com/akka/akka/tree/v2.5.32/akka-docs/src/test/java/jdocs/cluster/SimpleClusterListener2.java#L31 "Go to snippet source")cluster.subscribe(getSelf(), MemberEvent.class, UnreachableMember.class);
```

A snapshot of the full state, `akka.cluster.ClusterEvent.CurrentClusterState`, is sent to the subscriber as the first message, followed by events for incremental updates.

Note that you may receive an empty `CurrentClusterState`, containing no members, followed by `MemberUp` events from other nodes which already joined, if you start the subscription before the initial join procedure has completed. This may for example happen when you start the subscription immediately after `cluster.join()` like below. This is expected behavior. When the node has been accepted in the cluster you will receive `MemberUp` for that node, and other nodes.

Scala

```
[source](https://github.com/akka/akka/tree/v2.5.32/akka-docs/src/test/scala/docs/cluster/SimpleClusterListener2.scala#L14-L20 "Go to snippet source")val cluster = Cluster(context.system)
  cluster.join(cluster.selfAddress)
cluster.subscribe(self, classOf[MemberEvent], classOf[UnreachableMember])
```

Java

```
[source](https://github.com/akka/akka/tree/v2.5.32/akka-docs/src/test/java/jdocs/cluster/SimpleClusterListener2.java#L20-L27 "Go to snippet source")Cluster cluster = Cluster.get(getContext().getSystem());
  cluster.join(cluster.selfAddress());
cluster.subscribe(getSelf(), MemberEvent.class, UnreachableMember.class);
```

To avoid receiving an empty `CurrentClusterState` at the beginning, you can use it like shown in the following example, to defer subscription until the `MemberUp` event for the own node is received:

Scala

```
[source](https://github.com/akka/akka/tree/v2.5.32/akka-docs/src/test/scala/docs/cluster/SimpleClusterListener2.scala#L14-L20 "Go to snippet source")val cluster = Cluster(context.system)
  cluster.join(cluster.selfAddress)
cluster.registerOnMemberUp {
  cluster.subscribe(self, classOf[MemberEvent], classOf[UnreachableMember])
}
```

Java

```
[source](https://github.com/akka/akka/tree/v2.5.32/akka-docs/src/test/java/jdocs/cluster/SimpleClusterListener2.java#L20-L27 "Go to snippet source")Cluster cluster = Cluster.get(getContext().getSystem());
  cluster.join(cluster.selfAddress());
cluster.registerOnMemberUp(
    () -> cluster.subscribe(getSelf(), MemberEvent.class, UnreachableMember.class));
```

If you find it inconvenient to handle the `CurrentClusterState` you can use `ClusterEvent.InitialStateAsEvents` `ClusterEvent.initialStateAsEvents()` as parameter to `subscribe`. That means that instead of receiving `CurrentClusterState` as the first message you will receive the events corresponding to the current state to mimic what you would have seen if you were listening to the events when they occurred in the past. Note that those initial events only correspond to the current state and it is not the full history of all changes that actually has occurred in the cluster.

Scala

```
[source](https://github.com/akka/akka/tree/v2.5.32/akka-docs/src/test/scala/docs/cluster/SimpleClusterListener.scala#L19 "Go to snippet source")cluster.subscribe(self, initialStateMode = InitialStateAsEvents, classOf[MemberEvent], classOf[UnreachableMember])
```

Java

```
[source](https://github.com/akka/akka/tree/v2.5.32/akka-docs/src/test/java/jdocs/cluster/SimpleClusterListener.java#L25-L26 "Go to snippet source")cluster.subscribe(
    getSelf(), ClusterEvent.initialStateAsEvents(), MemberEvent.class, UnreachableMember.class);
```

The events to track the life\-cycle of members are:

- `ClusterEvent.MemberJoined` \- A new member has joined the cluster and its status has been changed to `Joining`
- `ClusterEvent.MemberUp` \- A new member has joined the cluster and its status has been changed to `Up`
- `ClusterEvent.MemberExited` \- A member is leaving the cluster and its status has been changed to `Exiting` Note that the node might already have been shutdown when this event is published on another node.
- `ClusterEvent.MemberRemoved` \- Member completely removed from the cluster.
- `ClusterEvent.UnreachableMember` \- A member is considered as unreachable, detected by the failure detector of at least one other node.
- `ClusterEvent.ReachableMember` \- A member is considered as reachable again, after having been unreachable. All nodes that previously detected it as unreachable has detected it as reachable again.

There are more types of change events, consult the API documentation of classes that extends `akka.cluster.ClusterEvent.ClusterDomainEvent` for details about the events.

Instead of subscribing to cluster events it can sometimes be convenient to only get the full membership state with `Cluster(system).state``Cluster.get(system).state()`. Note that this state is not necessarily in sync with the events published to a cluster subscription.

### Worker Dial\-in Example

Let’s take a look at an example that illustrates how workers, here named *backend*, can detect and register to new master nodes, here named *frontend*.

The example application provides a service to transform text. When some text is sent to one of the frontend services, it will be delegated to one of the backend workers, which performs the transformation job, and sends the result back to the original client. New backend nodes, as well as new frontend nodes, can be added or removed to the cluster dynamically.

Messages:

Scala

```
[source](https://github.com/akka/akka/tree/v2.5.32/akka-docs/src/test/scala/docs/cluster/TransformationMessages.scala#L8-L11 "Go to snippet source")final case class TransformationJob(text: String)
final case class TransformationResult(text: String)
final case class JobFailed(reason: String, job: TransformationJob)
case object BackendRegistration
```

Java

```
[source](https://github.com/akka/akka/tree/v2.5.32/akka-docs/src/test/java/jdocs/cluster/TransformationMessages.java#L10-L65 "Go to snippet source")public interface TransformationMessages {

  public static class TransformationJob implements Serializable {
    private final String text;

    public TransformationJob(String text) {
      this.text = text;
    }

    public String getText() {
      return text;
    }
  }

  public static class TransformationResult implements Serializable {
    private final String text;

    public TransformationResult(String text) {
      this.text = text;
    }

    public String getText() {
      return text;
    }

    @Override
    public String toString() {
      return "TransformationResult(" + text + ")";
    }
  }

  public static class JobFailed implements Serializable {
    private final String reason;
    private final TransformationJob job;

    public JobFailed(String reason, TransformationJob job) {
      this.reason = reason;
      this.job = job;
    }

    public String getReason() {
      return reason;
    }

    public TransformationJob getJob() {
      return job;
    }

    @Override
    public String toString() {
      return "JobFailed(" + reason + ")";
    }
  }

  public static final String BACKEND_REGISTRATION = "BackendRegistration";
}
```

The backend worker that performs the transformation job:

Scala

```
[source](https://github.com/akka/akka/tree/v2.5.32/akka-docs/src/test/scala/docs/cluster/TransformationBackend.scala#L22-L42 "Go to snippet source")class TransformationBackend extends Actor {

  val cluster = Cluster(context.system)

  // subscribe to cluster changes, MemberUp
  // re-subscribe when restart
  override def preStart(): Unit = cluster.subscribe(self, classOf[MemberUp])
  override def postStop(): Unit = cluster.unsubscribe(self)

  def receive = {
    case TransformationJob(text) => sender() ! TransformationResult(text.toUpperCase)
    case state: CurrentClusterState =>
      state.members.filter(_.status == MemberStatus.Up).foreach(register)
    case MemberUp(m) => register(m)
  }

  def register(member: Member): Unit =
    if (member.hasRole("frontend"))
      context.actorSelection(RootActorPath(member.address) / "user" / "frontend") !
      BackendRegistration
}
```

Java

```
[source](https://github.com/akka/akka/tree/v2.5.32/akka-docs/src/test/java/jdocs/cluster/TransformationBackend.java#L18-L65 "Go to snippet source")public class TransformationBackend extends AbstractActor {

  Cluster cluster = Cluster.get(getContext().getSystem());

  // subscribe to cluster changes, MemberUp
  @Override
  public void preStart() {
    cluster.subscribe(getSelf(), MemberUp.class);
  }

  // re-subscribe when restart
  @Override
  public void postStop() {
    cluster.unsubscribe(getSelf());
  }

  @Override
  public Receive createReceive() {
    return receiveBuilder()
        .match(
            TransformationJob.class,
            job -> {
              getSender().tell(new TransformationResult(job.getText().toUpperCase()), getSelf());
            })
        .match(
            CurrentClusterState.class,
            state -> {
              for (Member member : state.getMembers()) {
                if (member.status().equals(MemberStatus.up())) {
                  register(member);
                }
              }
            })
        .match(
            MemberUp.class,
            mUp -> {
              register(mUp.member());
            })
        .build();
  }

  void register(Member member) {
    if (member.hasRole("frontend"))
      getContext()
          .actorSelection(member.address() + "/user/frontend")
          .tell(BACKEND_REGISTRATION, getSelf());
  }
}
```

Note that the `TransformationBackend` actor subscribes to cluster events to detect new, potential, frontend nodes, and send them a registration message so that they know that they can use the backend worker.

The frontend that receives user jobs and delegates to one of the registered backend workers:

Scala

```
[source](https://github.com/akka/akka/tree/v2.5.32/akka-docs/src/test/scala/docs/cluster/TransformationFrontend.scala#L21-L41 "Go to snippet source")class TransformationFrontend extends Actor {

  var backends = IndexedSeq.empty[ActorRef]
  var jobCounter = 0

  def receive = {
    case job: TransformationJob if backends.isEmpty =>
      sender() ! JobFailed("Service unavailable, try again later", job)

    case job: TransformationJob =>
      jobCounter += 1
      backends(jobCounter % backends.size).forward(job)

    case BackendRegistration if !backends.contains(sender()) =>
      context.watch(sender())
      backends = backends :+ sender()

    case Terminated(a) =>
      backends = backends.filterNot(_ == a)
  }
}
```

Java

```
[source](https://github.com/akka/akka/tree/v2.5.32/akka-docs/src/test/java/jdocs/cluster/TransformationFrontend.java#L19-L53 "Go to snippet source")public class TransformationFrontend extends AbstractActor {

  List<ActorRef> backends = new ArrayList<ActorRef>();
  int jobCounter = 0;

  @Override
  public Receive createReceive() {
    return receiveBuilder()
        .match(
            TransformationJob.class,
            job -> backends.isEmpty(),
            job -> {
              getSender()
                  .tell(new JobFailed("Service unavailable, try again later", job), getSender());
            })
        .match(
            TransformationJob.class,
            job -> {
              jobCounter++;
              backends.get(jobCounter % backends.size()).forward(job, getContext());
            })
        .matchEquals(
            BACKEND_REGISTRATION,
            x -> {
              getContext().watch(getSender());
              backends.add(getSender());
            })
        .match(
            Terminated.class,
            terminated -> {
              backends.remove(terminated.getActor());
            })
        .build();
  }
}
```

Note that the `TransformationFrontend` actor watch the registered backend to be able to remove it from its list of available backend workers. Death watch uses the cluster failure detector for nodes in the cluster, i.e. it detects network failures and JVM crashes, in addition to graceful termination of watched actor. Death watch generates the `Terminated` message to the watching actor when the unreachable cluster node has been downed and removed.

The easiest way to run **Worker Dial\-in Example** example yourself is to try the [Akka Cluster Sample with Scala](https://developer.lightbend.com/start/?group=akka&project=akka-samples-cluster-scala)[Akka Cluster Sample with Java](https://developer.lightbend.com/start/?group=akka&project=akka-samples-cluster-java). It contains instructions on how to run the **Worker Dial\-in Example** sample.

## Node Roles

Not all nodes of a cluster need to perform the same function: there might be one sub\-set which runs the web front\-end, one which runs the data access layer and one for the number\-crunching. Deployment of actors—for example by cluster\-aware routers—can take node roles into account to achieve this distribution of responsibilities.

The roles of a node is defined in the configuration property named `akka.cluster.roles` and it is typically defined in the start script as a system property or environment variable.

The roles of the nodes is part of the membership information in `MemberEvent` that you can subscribe to.

## How To Startup when Cluster Size Reached

A common use case is to start actors after the cluster has been initialized, members have joined, and the cluster has reached a certain size.

With a configuration option you can define required number of members before the leader changes member status of ‘Joining’ members to ‘Up’.:

```
akka.cluster.min-nr-of-members = 3

```

In a similar way you can define required number of members of a certain role before the leader changes member status of ‘Joining’ members to ‘Up’.:

```
akka.cluster.role {
  frontend.min-nr-of-members = 1
  backend.min-nr-of-members = 2
}

```

You can start the actors in a `registerOnMemberUp` callback, which will be invoked when the current member status is changed to ‘Up’, i.e. the cluster has at least the defined number of members.

Scala

```
[source](https://github.com/akka/akka/tree/v2.5.32/akka-docs/src/test/scala/docs/cluster/FactorialFrontend.scala#L60-L62 "Go to snippet source")Cluster(system).registerOnMemberUp {
  system.actorOf(Props(classOf[FactorialFrontend], upToN, true), name = "factorialFrontend")
}
```

Java

```
[source](https://github.com/akka/akka/tree/v2.5.32/akka-docs/src/test/java/jdocs/cluster/FactorialFrontendMain.java#L29-L37 "Go to snippet source")Cluster.get(system)
    .registerOnMemberUp(
        new Runnable() {
          @Override
          public void run() {
            system.actorOf(
                Props.create(FactorialFrontend.class, upToN, true), "factorialFrontend");
          }
        });
```

This callback can be used for other things than starting actors.

## How To Cleanup when Member is Removed

You can do some clean up in a `registerOnMemberRemoved` callback, which will be invoked when the current member status is changed to ‘Removed’ or the cluster have been shutdown.

An alternative is to register tasks to the [Coordinated Shutdown](actors.html#coordinated-shutdown).

Note
Register a OnMemberRemoved callback on a cluster that have been shutdown, the callback will be invoked immediately on the caller thread, otherwise it will be invoked later when the current member status changed to ‘Removed’. You may want to install some cleanup handling after the cluster was started up, but the cluster might already be shutting down when you installing, and depending on the race is not healthy.

## Higher level Cluster tools

### Cluster Singleton

For some use cases it is convenient and sometimes also mandatory to ensure that you have exactly one actor of a certain type running somewhere in the cluster.

This can be implemented by subscribing to member events, but there are several corner cases to consider. Therefore, this specific use case is covered by the [Cluster Singleton](cluster-singleton.html).

### Cluster Sharding

Distributes actors across several nodes in the cluster and supports interaction with the actors using their logical identifier, but without having to care about their physical location in the cluster.

See [Cluster Sharding](cluster-sharding.html).

### Distributed Publish Subscribe

Publish\-subscribe messaging between actors in the cluster, and point\-to\-point messaging using the logical path of the actors, i.e. the sender does not have to know on which node the destination actor is running.

See [Distributed Publish Subscribe in Cluster](distributed-pub-sub.html).

### Cluster Client

Communication from an actor system that is not part of the cluster to actors running somewhere in the cluster. The client does not have to know on which node the destination actor is running.

See [Cluster Client](cluster-client.html).

### Distributed Data

*Akka Distributed Data* is useful when you need to share data between nodes in an Akka Cluster. The data is accessed with an actor providing a key\-value store like API.

See [Distributed Data](distributed-data.html).

### Cluster Aware Routers

All [routers](routing.html) can be made aware of member nodes in the cluster, i.e. deploying new routees or looking up routees on nodes in the cluster. When a node becomes unreachable or leaves the cluster the routees of that node are automatically unregistered from the router. When new nodes join the cluster, additional routees are added to the router, according to the configuration.

See [Cluster Aware Routers](cluster-routing.html).

### Cluster Metrics

The member nodes of the cluster can collect system health metrics and publish that to other cluster nodes and to the registered subscribers on the system event bus.

See [Cluster Metrics](cluster-metrics.html).

## Failure Detector

In a cluster each node is monitored by a few (default maximum 5\) other nodes, and when any of these detects the node as `unreachable` that information will spread to the rest of the cluster through the gossip. In other words, only one node needs to mark a node `unreachable` to have the rest of the cluster mark that node `unreachable`.

The failure detector will also detect if the node becomes `reachable` again. When all nodes that monitored the `unreachable` node detects it as `reachable` again the cluster, after gossip dissemination, will consider it as `reachable`.

If system messages cannot be delivered to a node it will be quarantined and then it cannot come back from `unreachable`. This can happen if the there are too many unacknowledged system messages (e.g. watch, Terminated, remote actor deployment, failures of actors supervised by remote parent). Then the node needs to be moved to the `down` or `removed` states and the actor system of the quarantined node must be restarted before it can join the cluster again.

The nodes in the cluster monitor each other by sending heartbeats to detect if a node is unreachable from the rest of the cluster. The heartbeat arrival times is interpreted by an implementation of [The Phi Accrual Failure Detector](http://www.jaist.ac.jp/~defago/files/pdf/IS_RR_2004_010.pdf).

The suspicion level of failure is given by a value called *phi*. The basic idea of the phi failure detector is to express the value of *phi* on a scale that is dynamically adjusted to reflect current network conditions.

The value of *phi* is calculated as:

```
phi = -log10(1 - F(timeSinceLastHeartbeat))

```

where F is the cumulative distribution function of a normal distribution with mean and standard deviation estimated from historical heartbeat inter\-arrival times.

In the [configuration](#cluster-configuration) you can adjust the `akka.cluster.failure-detector.threshold` to define when a *phi* value is considered to be a failure.

A low `threshold` is prone to generate many false positives but ensures a quick detection in the event of a real crash. Conversely, a high `threshold` generates fewer mistakes but needs more time to detect actual crashes. The default `threshold` is 8 and is appropriate for most situations. However in cloud environments, such as Amazon EC2, the value could be increased to 12 in order to account for network issues that sometimes occur on such platforms.

The following chart illustrates how *phi* increase with increasing time since the previous heartbeat.

![phi1.png](./images/phi1.png)

Phi is calculated from the mean and standard deviation of historical inter arrival times. The previous chart is an example for standard deviation of 200 ms. If the heartbeats arrive with less deviation the curve becomes steeper, i.e. it is possible to determine failure more quickly. The curve looks like this for a standard deviation of 100 ms.

![phi2.png](./images/phi2.png)

To be able to survive sudden abnormalities, such as garbage collection pauses and transient network failures the failure detector is configured with a margin, `akka.cluster.failure-detector.acceptable-heartbeat-pause`. You may want to adjust the [configuration](#cluster-configuration) of this depending on your environment. This is how the curve looks like for `acceptable-heartbeat-pause` configured to 3 seconds.

![phi3.png](./images/phi3.png)

Death watch uses the cluster failure detector for nodes in the cluster, i.e. it detects network failures and JVM crashes, in addition to graceful termination of watched actor. Death watch generates the `Terminated` message to the watching actor when the unreachable cluster node has been downed and removed.

If you encounter suspicious false positives when the system is under load you should define a separate dispatcher for the cluster actors as described in [Cluster Dispatcher](#cluster-dispatcher).

## How to Test

[Multi Node Testing](multi-node-testing.html) is useful for testing cluster applications.

Set up your project according to the instructions in [Multi Node Testing](multi-node-testing.html) and [Multi JVM Testing](multi-jvm-testing.html), i.e. add the `sbt-multi-jvm` plugin and the dependency to `akka-multi-node-testkit`.

First, as described in [Multi Node Testing](multi-node-testing.html), we need some scaffolding to configure the `MultiNodeSpec`. Define the participating roles and their [configuration](#cluster-configuration) in an object extending `MultiNodeConfig`:

```
[source](https://github.com/akka/akka/tree/v2.5.32/akka-cluster-metrics/src/multi-jvm/scala/akka/cluster/metrics/sample/StatsSampleSpec.scala#L15-L59 "Go to snippet source")import akka.remote.testkit.MultiNodeConfig
import com.typesafe.config.ConfigFactory

object StatsSampleSpecConfig extends MultiNodeConfig {
  // register the named roles (nodes) of the test
  val first = role("first")
  val second = role("second")
  val third = role("third")

  def nodeList = Seq(first, second, third)

  // Extract individual sigar library for every node.
  nodeList.foreach { role =>
    nodeConfig(role) {
      ConfigFactory.parseString(s"""
      # Enable metrics extension in akka-cluster-metrics.
      akka.extensions=["akka.cluster.metrics.ClusterMetricsExtension"]
      # Sigar native library extract location during tests.
      akka.cluster.metrics.native-library-extract-folder=target/native/${role.name}
      """)
    }
  }

  // this configuration will be used for all nodes
  // note that no fixed host names and ports are used
  commonConfig(ConfigFactory.parseString("""
    akka.actor.provider = cluster
    akka.remote.log-remote-lifecycle-events = off
    akka.cluster.roles = [compute]
    akka.actor.deployment {
      /statsService/workerRouter {
          router = consistent-hashing-group
          routees.paths = ["/user/statsWorker"]
          cluster {
            enabled = on
            allow-local-routees = on
            use-roles = ["compute"]
          }
        }
    }
    """))

}
```

Define one concrete test class for each role/node. These will be instantiated on the different nodes (JVMs). They can be implemented differently, but often they are the same and extend an abstract test class, as illustrated here.

```
[source](https://github.com/akka/akka/tree/v2.5.32/akka-cluster-metrics/src/multi-jvm/scala/akka/cluster/metrics/sample/StatsSampleSpec.scala#L63-L66 "Go to snippet source")// need one concrete test class per node
class StatsSampleSpecMultiJvmNode1 extends StatsSampleSpec
class StatsSampleSpecMultiJvmNode2 extends StatsSampleSpec
class StatsSampleSpecMultiJvmNode3 extends StatsSampleSpec
```

Note the naming convention of these classes. The name of the classes must end with `MultiJvmNode1`, `MultiJvmNode2` and so on. It is possible to define another suffix to be used by the `sbt-multi-jvm`, but the default should be fine in most cases.

Then the abstract `MultiNodeSpec`, which takes the `MultiNodeConfig` as constructor parameter.

```
[source](https://github.com/akka/akka/tree/v2.5.32/akka-cluster-metrics/src/multi-jvm/scala/akka/cluster/metrics/sample/StatsSampleSpec.scala#L70-L88 "Go to snippet source")import akka.remote.testkit.MultiNodeSpec
import akka.testkit.ImplicitSender
import org.scalatest.{ BeforeAndAfterAll, Matchers, WordSpecLike }

abstract class StatsSampleSpec
    extends MultiNodeSpec(StatsSampleSpecConfig)
    with WordSpecLike
    with Matchers
    with BeforeAndAfterAll
    with ImplicitSender {

  import StatsSampleSpecConfig._

  override def initialParticipants = roles.size

  override def beforeAll() = multiNodeSpecBeforeAll()

  override def afterAll() = multiNodeSpecAfterAll()

```

Most of this can be extracted to a separate trait to avoid repeating this in all your tests.

Typically you begin your test by starting up the cluster and let the members join, and create some actors. That can be done like this:

```
[source](https://github.com/akka/akka/tree/v2.5.32/akka-cluster-metrics/src/multi-jvm/scala/akka/cluster/metrics/sample/StatsSampleSpec.scala#L94-L117 "Go to snippet source")"illustrate how to startup cluster" in within(15 seconds) {
  Cluster(system).subscribe(testActor, classOf[MemberUp])
  expectMsgClass(classOf[CurrentClusterState])

  val firstAddress = node(first).address
  val secondAddress = node(second).address
  val thirdAddress = node(third).address

  Cluster(system).join(firstAddress)

  system.actorOf(Props[StatsWorker], "statsWorker")
  system.actorOf(Props[StatsService], "statsService")

  receiveN(3).collect { case MemberUp(m) => m.address }.toSet should be(
    Set(firstAddress, secondAddress, thirdAddress))

  Cluster(system).unsubscribe(testActor)

  testConductor.enter("all-up")
}
```

From the test you interact with the cluster using the `Cluster` extension, e.g. `join`.

```
[source](https://github.com/akka/akka/tree/v2.5.32/akka-cluster-metrics/src/multi-jvm/scala/akka/cluster/metrics/sample/StatsSampleSpec.scala#L105 "Go to snippet source")Cluster(system).join(firstAddress)
```

Notice how the *testActor* from [testkit](testing.html) is added as [subscriber](#cluster-subscriber) to cluster changes and then waiting for certain events, such as in this case all members becoming ‘Up’.

The above code was running for all roles (JVMs). `runOn` is a convenient utility to declare that a certain block of code should only run for a specific role.

```
[source](https://github.com/akka/akka/tree/v2.5.32/akka-cluster-metrics/src/multi-jvm/scala/akka/cluster/metrics/sample/StatsSampleSpec.scala#L121-L138 "Go to snippet source")"show usage of the statsService from one node" in within(15 seconds) {
  runOn(second) {
    assertServiceOk()
  }

  testConductor.enter("done-2")
}

def assertServiceOk(): Unit = {
  val service = system.actorSelection(node(third) / "user" / "statsService")
  // eventually the service should be ok,
  // first attempts might fail because worker actors not started yet
  awaitAssert {
    service ! StatsJob("this is the text that will be analyzed")
    expectMsgType[StatsResult](1.second).meanWordLength should be(3.875 +- 0.001)
  }

}
```

Once again we take advantage of the facilities in [testkit](testing.html) to verify expected behavior. Here using `testActor` as sender (via `ImplicitSender`) and verifying the reply with `expectMsgPF`.

In the above code you can see `node(third)`, which is useful facility to get the root actor reference of the actor system for a specific role. This can also be used to grab the `akka.actor.Address` of that node.

```
[source](https://github.com/akka/akka/tree/v2.5.32/akka-cluster-metrics/src/multi-jvm/scala/akka/cluster/metrics/sample/StatsSampleSpec.scala#L99-L101 "Go to snippet source")val firstAddress = node(first).address
val secondAddress = node(second).address
val thirdAddress = node(third).address
```

## How to Test

Currently testing with the `sbt-multi-jvm` plugin is only documented for Scala. Go to the corresponding Scala version of this page for details.

## Management

### HTTP

Information and management of the cluster is available with a HTTP API. See documentation of [Akka Management](http://developer.lightbend.com/docs/akka-management/current/).

### JMX

Information and management of the cluster is available as JMX MBeans with the root name `akka.Cluster`. The JMX information can be displayed with an ordinary JMX console such as JConsole or JVisualVM.

From JMX you can:

- see what members that are part of the cluster
- see status of this node
- see roles of each member
- join this node to another node in cluster
- mark any node in the cluster as down
- tell any node in the cluster to leave

Member nodes are identified by their address, in format *akka.*\*protocol\*\*://\*\*actor\-system\-name\*\*@\*\*hostname\*\*:\*\*port\*\*\*.

### Command Line

Warning
**Deprecation warning** \- The command line script has been deprecated and is scheduled for removal in the next major version. Use the [HTTP management](#cluster-http) API with [curl](https://curl.haxx.se/) or similar instead.

The cluster can be managed with the script `akka-cluster` provided in the Akka GitHub repository [here](https://github.com/akka/akka/tree/v2.5.32/akka-cluster/jmx-client). Place the script and the `jmxsh-R5.jar` library in the same directory.

Run it without parameters to see instructions about how to use the script:

```
Usage: ./akka-cluster <node-hostname> <jmx-port> <command> ...

Supported commands are:
           join <node-url> - Sends request a JOIN node with the specified URL
          leave <node-url> - Sends a request for node with URL to LEAVE the cluster
           down <node-url> - Sends a request for marking node with URL as DOWN
             member-status - Asks the member node for its current status
                   members - Asks the cluster for addresses of current members
               unreachable - Asks the cluster for addresses of unreachable members
            cluster-status - Asks the cluster for its current status (member ring,
                             unavailable nodes, meta data etc.)
                    leader - Asks the cluster who the current leader is
              is-singleton - Checks if the cluster is a singleton cluster (single
                             node cluster)
              is-available - Checks if the member node is available
Where the <node-url> should be on the format of
  'akka.<protocol>://<actor-system-name>@<hostname>:<port>'

Examples: ./akka-cluster localhost 9999 is-available
          ./akka-cluster localhost 9999 join akka.tcp://MySystem@darkstar:2552
          ./akka-cluster localhost 9999 cluster-status

```

To be able to use the script you must enable remote monitoring and management when starting the JVMs of the cluster nodes, as described in [Monitoring and Management Using JMX Technology](http://docs.oracle.com/javase/8/docs/technotes/guides/management/agent.html). Make sure you understand the security implications of enabling remote monitoring and management.

## Configuration

There are several configuration properties for the cluster. We refer to the [reference configuration](general/configuration.html#config-akka-cluster) for more information.

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

Under the hood the cluster extension is implemented with actors and it can be necessary to create a bulkhead for those actors to avoid disturbance from other actors. Especially the heartbeating actors that is used for failure detection can generate false positives if they are not given a chance to run at regular intervals. For this purpose you can define a separate dispatcher to be used for the cluster actors:

```
akka.cluster.use-dispatcher = cluster-dispatcher

cluster-dispatcher {
  type = "Dispatcher"
  executor = "fork-join-executor"
  fork-join-executor {
    parallelism-min = 2
    parallelism-max = 4
  }
}

```
Note
Normally it should not be necessary to configure a separate dispatcher for the Cluster. The default\-dispatcher should be sufficient for performing the Cluster tasks, i.e. `akka.cluster.use-dispatcher` should not be changed. If you have Cluster related problems when using the default\-dispatcher that is typically an indication that you are running blocking or CPU intensive actors/tasks on the default\-dispatcher. Use dedicated dispatchers for such actors/tasks instead of running them on the default\-dispatcher, because that may starve system internal tasks. Related config properties: `akka.cluster.use-dispatcher = akka.cluster.cluster-dispatcher`. Corresponding default values: `akka.cluster.use-dispatcher =`.

### Configuration Compatibility Check

Creating a cluster is about deploying two or more nodes and make then behave as if they were one single application. Therefore it’s extremely important that all nodes in a cluster are configured with compatible settings. 

The Configuration Compatibility Check feature ensures that all nodes in a cluster have a compatible configuration. Whenever a new node is joining an existing cluster, a subset of its configuration settings (only those that are required to be checked) is sent to the nodes in the cluster for verification. Once the configuration is checked on the cluster side, the cluster sends back its own set of required configuration settings. The joining node will then verify if it’s compliant with the cluster configuration. The joining node will only proceed if all checks pass, on both sides. 

New custom checkers can be added by extending `akka.cluster.JoinConfigCompatChecker` and including them in the configuration. Each checker must be associated with a unique key:

```
akka.cluster.configuration-compatibility-check.checkers {
  my-custom-config = "com.company.MyCustomJoinConfigCompatChecker"
}

```
Note
Configuration Compatibility Check is enabled by default, but can be disabled by setting `akka.cluster.configuration-compatibility-check.enforce-on-join = off`. This is specially useful when performing rolling updates. Obviously this should only be done if a complete cluster shutdown isn’t an option. A cluster with nodes with different configuration settings may lead to data loss or data corruption. 

This setting should only be disabled on the joining nodes. The checks are always performed on both sides, and warnings are logged. In case of incompatibilities, it is the responsibility of the joining node to decide if the process should be interrupted or not. 

If you are performing a rolling update on cluster using Akka 2\.5\.9 or prior (thus, not supporting this feature), the checks will not be performed because the running cluster has no means to verify the configuration sent by the joining node, nor to send back its own configuration.

## Code Examples

### Example 1: Dependency

```scala
libraryDependencies += "com.typesafe.akka" %% "akka-cluster" % "2.5.32"
```

### Example 2: Dependency

```xml
<dependencies&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-cluster_2.12</artifactId>
    <version>2.5.32</version>
  </dependency&gt
</dependencies>
```

### Example 3: Dependency

```gradle
dependencies {
  implementation "com.typesafe.akka:akka-cluster_2.12:2.5.32"
}
```

### Example 4: A Simple Cluster Example

```text
akka {
  actor {
    provider = "cluster"
  }
  remote {
    log-remote-lifecycle-events = off
    netty.tcp {
      hostname = "127.0.0.1"
      port = 0
    }
  }

  cluster {
    seed-nodes = [
      "akka.tcp://[email protected]:2551",
      "akka.tcp://[email protected]:2552"]

    # auto downing is NOT safe for production deployments.
    # you may want to use it during development, read more about it in the docs.
    #
    # auto-down-unreachable-after = 10s
  }
}

# Enable metrics extension in akka-cluster-metrics.
akka.extensions=["akka.cluster.metrics.ClusterMetricsExtension"]

# Sigar native library extract location during tests.
# Note: use per-jvm-instance folder when running multiple jvm on one host.
akka.cluster.metrics.native-library-extract-folder=${user.dir}/target/native
```

### Example 5: A Simple Cluster Example

```scala
/*
 * Copyright (C) 2018-2019 Lightbend Inc. <https://www.lightbend.com>
 */

package scala.docs.cluster

import akka.cluster.Cluster
import akka.cluster.ClusterEvent._
import akka.actor.ActorLogging
import akka.actor.Actor

class SimpleClusterListener extends Actor with ActorLogging {

  val cluster = Cluster(context.system)

  // subscribe to cluster changes, re-subscribe when restart
  override def preStart(): Unit = {
    //#subscribe
    cluster.subscribe(self, initialStateMode = InitialStateAsEvents, classOf[MemberEvent], classOf[UnreachableMember])
    //#subscribe
  }
  override def postStop(): Unit = cluster.unsubscribe(self)

  def receive = {
    case MemberUp(member) =>
      log.info("Member is Up: {}", member.address)
    case UnreachableMember(member) =>
      log.info("Member detected as unreachable: {}", member)
    case MemberRemoved(member, previousStatus) =>
      log.info("Member is Removed: {} after {}", member.address, previousStatus)
    case _: MemberEvent => // ignore
  }
}
```

### Example 6: A Simple Cluster Example

```java
/*
 * Copyright (C) 2018-2019 Lightbend Inc. <https://www.lightbend.com>
 */

package jdocs.cluster;

import akka.actor.AbstractActor;
import akka.cluster.Cluster;
import akka.cluster.ClusterEvent;
import akka.cluster.ClusterEvent.MemberEvent;
import akka.cluster.ClusterEvent.MemberUp;
import akka.cluster.ClusterEvent.MemberRemoved;
import akka.cluster.ClusterEvent.UnreachableMember;
import akka.event.Logging;
import akka.event.LoggingAdapter;

public class SimpleClusterListener extends AbstractActor {
  LoggingAdapter log = Logging.getLogger(getContext().getSystem(), this);
  Cluster cluster = Cluster.get(getContext().getSystem());

  // subscribe to cluster changes
  @Override
  public void preStart() {
    // #subscribe
    cluster.subscribe(
        getSelf(), ClusterEvent.initialStateAsEvents(), MemberEvent.class, UnreachableMember.class);
    // #subscribe
  }

  // re-subscribe when restart
  @Override
  public void postStop() {
    cluster.unsubscribe(getSelf());
  }

  @Override
  public Receive createReceive() {
    return receiveBuilder()
        .match(
            MemberUp.class,
            mUp -> {
              log.info("Member is Up: {}", mUp.member());
            })
        .match(
            UnreachableMember.class,
            mUnreachable -> {
              log.info("Member detected as unreachable: {}", mUnreachable.member());
            })
        .match(
            MemberRemoved.class,
            mRemoved -> {
              log.info("Member is Removed: {}", mRemoved.member());
            })
        .match(
            MemberEvent.class,
            message -> {
              // ignore
            })
        .build();
  }
}
```

### Example 7: Joining configured seed nodes

```text
akka.cluster.seed-nodes = [
  "akka.tcp://ClusterSystem@host1:2552",
  "akka.tcp://ClusterSystem@host2:2552"]
```

### Example 8: Joining configured seed nodes

```text
-Dakka.cluster.seed-nodes.0=akka.tcp://ClusterSystem@host1:2552
-Dakka.cluster.seed-nodes.1=akka.tcp://ClusterSystem@host2:2552
```

### Example 9: Programatically joining to seed nodes withjoinSeedNodes

```scala
import akka.actor.Address
import akka.cluster.Cluster

val cluster = Cluster(system)
val list: List[Address] = ??? //your method to dynamically get seed nodes
cluster.joinSeedNodes(list)
```

### Example 10: Programatically joining to seed nodes withjoinSeedNodes

```java
import akka.actor.Address;
import akka.cluster.Cluster;

final Cluster cluster = Cluster.get(system);
List<Address> list =
    new LinkedList<>(); // replace this with your method to dynamically get seed nodes
cluster.joinSeedNodes(list);
```

### Example 11: Programatically joining to seed nodes withjoinSeedNodes

```text
akka.cluster.shutdown-after-unsuccessful-join-seed-nodes = 20s
akka.coordinated-shutdown.terminate-actor-system = on
```

### Example 12: Auto-downing (DO NOT USE)

```text
akka.cluster.auto-down-unreachable-after = 120s
```

### Example 13: Leaving

```scala
val cluster = Cluster(system)
cluster.leave(cluster.selfAddress)
```

### Example 14: Leaving

```java
final Cluster cluster = Cluster.get(system);
cluster.leave(cluster.selfAddress());
```

### Example 15: WeaklyUp Members

```text
akka.cluster.allow-weakly-up-members = off
```

### Example 16: Subscribe to Cluster Events

```scala
cluster.subscribe(self, classOf[MemberEvent], classOf[UnreachableMember])
```

### Example 17: Subscribe to Cluster Events

```java
cluster.subscribe(getSelf(), MemberEvent.class, UnreachableMember.class);
```

### Example 18: Subscribe to Cluster Events

```scala
val cluster = Cluster(context.system)
  cluster.join(cluster.selfAddress)
cluster.subscribe(self, classOf[MemberEvent], classOf[UnreachableMember])
```

### Example 19: Subscribe to Cluster Events

```java
Cluster cluster = Cluster.get(getContext().getSystem());
  cluster.join(cluster.selfAddress());
cluster.subscribe(getSelf(), MemberEvent.class, UnreachableMember.class);
```

### Example 20: Subscribe to Cluster Events

```scala
val cluster = Cluster(context.system)
  cluster.join(cluster.selfAddress)
cluster.registerOnMemberUp {
  cluster.subscribe(self, classOf[MemberEvent], classOf[UnreachableMember])
}
```

### Example 21: Subscribe to Cluster Events

```java
Cluster cluster = Cluster.get(getContext().getSystem());
  cluster.join(cluster.selfAddress());
cluster.registerOnMemberUp(
    () -> cluster.subscribe(getSelf(), MemberEvent.class, UnreachableMember.class));
```

### Example 22: Subscribe to Cluster Events

```scala
cluster.subscribe(self, initialStateMode = InitialStateAsEvents, classOf[MemberEvent], classOf[UnreachableMember])
```

### Example 23: Subscribe to Cluster Events

```java
cluster.subscribe(
    getSelf(), ClusterEvent.initialStateAsEvents(), MemberEvent.class, UnreachableMember.class);
```

### Example 24: Worker Dial-in Example

```scala
final case class TransformationJob(text: String)
final case class TransformationResult(text: String)
final case class JobFailed(reason: String, job: TransformationJob)
case object BackendRegistration
```

### Example 25: Worker Dial-in Example

```java
public interface TransformationMessages {

  public static class TransformationJob implements Serializable {
    private final String text;

    public TransformationJob(String text) {
      this.text = text;
    }

    public String getText() {
      return text;
    }
  }

  public static class TransformationResult implements Serializable {
    private final String text;

    public TransformationResult(String text) {
      this.text = text;
    }

    public String getText() {
      return text;
    }

    @Override
    public String toString() {
      return "TransformationResult(" + text + ")";
    }
  }

  public static class JobFailed implements Serializable {
    private final String reason;
    private final TransformationJob job;

    public JobFailed(String reason, TransformationJob job) {
      this.reason = reason;
      this.job = job;
    }

    public String getReason() {
      return reason;
    }

    public TransformationJob getJob() {
      return job;
    }

    @Override
    public String toString() {
      return "JobFailed(" + reason + ")";
    }
  }

  public static final String BACKEND_REGISTRATION = "BackendRegistration";
}
```

### Example 26: Worker Dial-in Example

```scala
class TransformationBackend extends Actor {

  val cluster = Cluster(context.system)

  // subscribe to cluster changes, MemberUp
  // re-subscribe when restart
  override def preStart(): Unit = cluster.subscribe(self, classOf[MemberUp])
  override def postStop(): Unit = cluster.unsubscribe(self)

  def receive = {
    case TransformationJob(text) => sender() ! TransformationResult(text.toUpperCase)
    case state: CurrentClusterState =>
      state.members.filter(_.status == MemberStatus.Up).foreach(register)
    case MemberUp(m) => register(m)
  }

  def register(member: Member): Unit =
    if (member.hasRole("frontend"))
      context.actorSelection(RootActorPath(member.address) / "user" / "frontend") !
      BackendRegistration
}
```

### Example 27: Worker Dial-in Example

```java
public class TransformationBackend extends AbstractActor {

  Cluster cluster = Cluster.get(getContext().getSystem());

  // subscribe to cluster changes, MemberUp
  @Override
  public void preStart() {
    cluster.subscribe(getSelf(), MemberUp.class);
  }

  // re-subscribe when restart
  @Override
  public void postStop() {
    cluster.unsubscribe(getSelf());
  }

  @Override
  public Receive createReceive() {
    return receiveBuilder()
        .match(
            TransformationJob.class,
            job -> {
              getSender().tell(new TransformationResult(job.getText().toUpperCase()), getSelf());
            })
        .match(
            CurrentClusterState.class,
            state -> {
              for (Member member : state.getMembers()) {
                if (member.status().equals(MemberStatus.up())) {
                  register(member);
                }
              }
            })
        .match(
            MemberUp.class,
            mUp -> {
              register(mUp.member());
            })
        .build();
  }

  void register(Member member) {
    if (member.hasRole("frontend"))
      getContext()
          .actorSelection(member.address() + "/user/frontend")
          .tell(BACKEND_REGISTRATION, getSelf());
  }
}
```

### Example 28: Worker Dial-in Example

```scala
class TransformationFrontend extends Actor {

  var backends = IndexedSeq.empty[ActorRef]
  var jobCounter = 0

  def receive = {
    case job: TransformationJob if backends.isEmpty =>
      sender() ! JobFailed("Service unavailable, try again later", job)

    case job: TransformationJob =>
      jobCounter += 1
      backends(jobCounter % backends.size).forward(job)

    case BackendRegistration if !backends.contains(sender()) =>
      context.watch(sender())
      backends = backends :+ sender()

    case Terminated(a) =>
      backends = backends.filterNot(_ == a)
  }
}
```

### Example 29: Worker Dial-in Example

```java
public class TransformationFrontend extends AbstractActor {

  List<ActorRef> backends = new ArrayList<ActorRef>();
  int jobCounter = 0;

  @Override
  public Receive createReceive() {
    return receiveBuilder()
        .match(
            TransformationJob.class,
            job -> backends.isEmpty(),
            job -> {
              getSender()
                  .tell(new JobFailed("Service unavailable, try again later", job), getSender());
            })
        .match(
            TransformationJob.class,
            job -> {
              jobCounter++;
              backends.get(jobCounter % backends.size()).forward(job, getContext());
            })
        .matchEquals(
            BACKEND_REGISTRATION,
            x -> {
              getContext().watch(getSender());
              backends.add(getSender());
            })
        .match(
            Terminated.class,
            terminated -> {
              backends.remove(terminated.getActor());
            })
        .build();
  }
}
```

### Example 30: How To Startup when Cluster Size Reached

```text
akka.cluster.min-nr-of-members = 3
```

### Example 31: How To Startup when Cluster Size Reached

```text
akka.cluster.role {
  frontend.min-nr-of-members = 1
  backend.min-nr-of-members = 2
}
```

### Example 32: How To Startup when Cluster Size Reached

```scala
Cluster(system).registerOnMemberUp {
  system.actorOf(Props(classOf[FactorialFrontend], upToN, true), name = "factorialFrontend")
}
```

### Example 33: How To Startup when Cluster Size Reached

```java
Cluster.get(system)
    .registerOnMemberUp(
        new Runnable() {
          @Override
          public void run() {
            system.actorOf(
                Props.create(FactorialFrontend.class, upToN, true), "factorialFrontend");
          }
        });
```

### Example 34: Failure Detector

```text
phi = -log10(1 - F(timeSinceLastHeartbeat))
```

### Example 35: How to Test

```scala
import akka.remote.testkit.MultiNodeConfig
import com.typesafe.config.ConfigFactory

object StatsSampleSpecConfig extends MultiNodeConfig {
  // register the named roles (nodes) of the test
  val first = role("first")
  val second = role("second")
  val third = role("third")

  def nodeList = Seq(first, second, third)

  // Extract individual sigar library for every node.
  nodeList.foreach { role =>
    nodeConfig(role) {
      ConfigFactory.parseString(s"""
      # Enable metrics extension in akka-cluster-metrics.
      akka.extensions=["akka.cluster.metrics.ClusterMetricsExtension"]
      # Sigar native library extract location during tests.
      akka.cluster.metrics.native-library-extract-folder=target/native/${role.name}
      """)
    }
  }

  // this configuration will be used for all nodes
  // note that no fixed host names and ports are used
  commonConfig(ConfigFactory.parseString("""
    akka.actor.provider = cluster
    akka.remote.log-remote-lifecycle-events = off
    akka.cluster.roles = [compute]
    akka.actor.deployment {
      /statsService/workerRouter {
          router = consistent-hashing-group
          routees.paths = ["/user/statsWorker"]
          cluster {
            enabled = on
            allow-local-routees = on
            use-roles = ["compute"]
          }
        }
    }
    """))

}
```

### Example 36: How to Test

```scala
// need one concrete test class per node
class StatsSampleSpecMultiJvmNode1 extends StatsSampleSpec
class StatsSampleSpecMultiJvmNode2 extends StatsSampleSpec
class StatsSampleSpecMultiJvmNode3 extends StatsSampleSpec
```

### Example 37: How to Test

```scala
import akka.remote.testkit.MultiNodeSpec
import akka.testkit.ImplicitSender
import org.scalatest.{ BeforeAndAfterAll, Matchers, WordSpecLike }

abstract class StatsSampleSpec
    extends MultiNodeSpec(StatsSampleSpecConfig)
    with WordSpecLike
    with Matchers
    with BeforeAndAfterAll
    with ImplicitSender {

  import StatsSampleSpecConfig._

  override def initialParticipants = roles.size

  override def beforeAll() = multiNodeSpecBeforeAll()

  override def afterAll() = multiNodeSpecAfterAll()
```

### Example 38: How to Test

```scala
"illustrate how to startup cluster" in within(15 seconds) {
  Cluster(system).subscribe(testActor, classOf[MemberUp])
  expectMsgClass(classOf[CurrentClusterState])

  val firstAddress = node(first).address
  val secondAddress = node(second).address
  val thirdAddress = node(third).address

  Cluster(system).join(firstAddress)

  system.actorOf(Props[StatsWorker], "statsWorker")
  system.actorOf(Props[StatsService], "statsService")

  receiveN(3).collect { case MemberUp(m) => m.address }.toSet should be(
    Set(firstAddress, secondAddress, thirdAddress))

  Cluster(system).unsubscribe(testActor)

  testConductor.enter("all-up")
}
```

### Example 39: How to Test

```scala
Cluster(system).join(firstAddress)
```

### Example 40: How to Test

```scala
"show usage of the statsService from one node" in within(15 seconds) {
  runOn(second) {
    assertServiceOk()
  }

  testConductor.enter("done-2")
}

def assertServiceOk(): Unit = {
  val service = system.actorSelection(node(third) / "user" / "statsService")
  // eventually the service should be ok,
  // first attempts might fail because worker actors not started yet
  awaitAssert {
    service ! StatsJob("this is the text that will be analyzed")
    expectMsgType[StatsResult](1.second).meanWordLength should be(3.875 +- 0.001)
  }

}
```

### Example 41: How to Test

```scala
val firstAddress = node(first).address
val secondAddress = node(second).address
val thirdAddress = node(third).address
```

### Example 42: Command Line

```text
Usage: ./akka-cluster <node-hostname> <jmx-port> <command> ...

Supported commands are:
           join <node-url> - Sends request a JOIN node with the specified URL
          leave <node-url> - Sends a request for node with URL to LEAVE the cluster
           down <node-url> - Sends a request for marking node with URL as DOWN
             member-status - Asks the member node for its current status
                   members - Asks the cluster for addresses of current members
               unreachable - Asks the cluster for addresses of unreachable members
            cluster-status - Asks the cluster for its current status (member ring,
                             unavailable nodes, meta data etc.)
                    leader - Asks the cluster who the current leader is
              is-singleton - Checks if the cluster is a singleton cluster (single
                             node cluster)
              is-available - Checks if the member node is available
Where the <node-url> should be on the format of
  'akka.<protocol>://<actor-system-name>@<hostname>:<port>'

Examples: ./akka-cluster localhost 9999 is-available
          ./akka-cluster localhost 9999 join akka.tcp://MySystem@darkstar:2552
          ./akka-cluster localhost 9999 cluster-status
```

### Example 43: Cluster Info Logging

```text
akka.cluster.log-info = off
```

### Example 44: Cluster Info Logging

```text
akka.cluster.log-info-verbose = on
```

### Example 45: Cluster Dispatcher

```text
akka.cluster.use-dispatcher = cluster-dispatcher

cluster-dispatcher {
  type = "Dispatcher"
  executor = "fork-join-executor"
  fork-join-executor {
    parallelism-min = 2
    parallelism-max = 4
  }
}
```

### Example 46: Configuration Compatibility Check

```text
akka.cluster.configuration-compatibility-check.checkers {
  my-custom-config = "com.company.MyCustomJoinConfigCompatChecker"
}
```

## Related Pages (Internal Links)

- https://doc.akka.io/cdn-cgi/l/email-protection
- https://doc.akka.io/docs/alpakka/current/
- https://doc.akka.io/libraries/akka-core/2.5/actors.html
- https://doc.akka.io/libraries/akka-core/2.5/cluster-client.html
- https://doc.akka.io/libraries/akka-core/2.5/cluster-metrics.html
- https://doc.akka.io/libraries/akka-core/2.5/cluster-routing.html
- https://doc.akka.io/libraries/akka-core/2.5/cluster-sharding.html
- https://doc.akka.io/libraries/akka-core/2.5/cluster-singleton.html
- https://doc.akka.io/libraries/akka-core/2.5/cluster-usage.html
- https://doc.akka.io/libraries/akka-core/2.5/common/cluster.html
- https://doc.akka.io/libraries/akka-core/2.5/distributed-data.html
- https://doc.akka.io/libraries/akka-core/2.5/distributed-pub-sub.html
- https://doc.akka.io/libraries/akka-core/2.5/general/configuration.html
- https://doc.akka.io/libraries/akka-core/2.5/multi-jvm-testing.html
- https://doc.akka.io/libraries/akka-core/2.5/multi-node-testing.html
- https://doc.akka.io/libraries/akka-core/2.5/persistence.html
- https://doc.akka.io/libraries/akka-core/2.5/remoting.html
- https://doc.akka.io/libraries/akka-core/2.5/routing.html
- https://doc.akka.io/libraries/akka-core/2.5/testing.html
- https://doc.akka.io/libraries/akka-grpc/current/
- https://doc.akka.io/libraries/akka-http/current
- https://doc.akka.io/libraries/akka-management/current/bootstrap/index.html
- https://doc.akka.io/libraries/akka-stream-kafka/current/home.html

---
*Source: [https://doc.akka.io/libraries/akka-core/2.5/cluster-usage.html](https://doc.akka.io/libraries/akka-core/2.5/cluster-usage.html)*