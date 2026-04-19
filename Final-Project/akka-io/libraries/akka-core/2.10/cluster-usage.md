---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:04:56Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/cluster-usage.html
title: Classic Cluster Usage • Akka core
---

# Classic Cluster Usage • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Classic Cluster Usage

Note
Akka Classic pertains to the original Actor APIs, which have been improved by more type safe and guided Actor APIs. Akka Classic is still fully supported and existing applications can continue to use the classic APIs. It is also possible to use the new Actor APIs together with classic actors in the same ActorSystem, see [coexistence](typed/coexisting.html). For new projects we recommend using [the new Actor API](typed/actors.html).

For the full documentation of this feature and for new projects see [Cluster](typed/cluster.html). For specific documentation topics see: 

- [Cluster Specification](typed/cluster-concepts.html)
- [Cluster Membership Service](typed/cluster-membership.html)
- [When and where to use Akka Cluster](typed/choosing-cluster.html)
- [Higher level Cluster tools](cluster-usage.html#higher-level-cluster-tools)
- [Rolling Updates](additional/rolling-updates.html)
- [Operating, Managing, Observability](additional/operations.html)

Note
You have to enable [serialization](serialization.html) to send messages between ActorSystems in the Cluster. [Serialization with Jackson](serialization-jackson.html) is a good choice in many cases, and our recommendation if you don’t have other preferences or constraints.

## Module info

Note
The Akka dependencies are available from Akka’s secure library repository. To access them you need to use a secure, tokenized URL as specified at <https://account.akka.io/token>.

To use Akka Cluster add the following dependency in your project:

sbt
```
val AkkaVersion = "2.10.17"
libraryDependencies += "com.typesafe.akka" %% "akka-cluster" % AkkaVersion
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
    <artifactId>akka-cluster_${scala.binary.version}</artifactId>
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

  implementation "com.typesafe.akka:akka-cluster_${versions.ScalaBinary}"
}
```

| Project Info: Akka Cluster (classic) | |
| --- | --- |
| Artifact | com.typesafe.akka akka\-cluster 2\.10\.17 [Snapshots are available](project/links.html#snapshots-repository) |
| JDK versions | Eclipse Temurin JDK 11Eclipse Temurin JDK 17Eclipse Temurin JDK 21 |
| Scala versions | 2\.13\.17, 3\.3\.7 |
| JPMS module name | akka.cluster |
| License | [BUSL\-1\.1](https://raw.githubusercontent.com/akka/akka-core/v2.10.17/LICENSE) |
| Readiness level | [Supported](https://doc.akka.io/docs/akka-dependencies/current/support-terminology.html#supported), support is available from [Lightbend](https://www.lightbend.com/akka) Since 2\.2\.0, 2013\-07\-09 |
| Home page | <https://akka.io/> |
| API documentation | [API (Scaladoc)](https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/index.html) [API (Javadoc)](https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/package-summary.html) |
| Forums | [Akka Discuss](https://discuss.akka.io) |
| Release notes | [Akka release notes](https://doc.akka.io/reference/release-notes.html) |
| Issues | [Github issues](https://github.com/akka/akka-core/issues) |
| Sources | [https://github.com/akka/akka\-core](https://github.com/akka/akka-core) |

## When and where to use Akka Cluster

See [Choosing Akka Cluster](typed/choosing-cluster.html#when-and-where-to-use-akka-cluster) in the documentation of the new APIs.

## Cluster API Extension

The following configuration enables the [`Cluster`](https://doc.akka.io/api/akka-core/2.10/akka/cluster/Cluster.html "akka.cluster.Cluster")[`Cluster`](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/Cluster.html "akka.cluster.Cluster") extension to be used. It joins the cluster and an actor subscribes to cluster membership events and logs them.

An actor that uses the cluster extension may look like this:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/cluster/SimpleClusterListener.scala "Go to snippet source")/*
 * Copyright (C) 2018-2025 Lightbend Inc. <https://www.lightbend.com>
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
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/cluster/SimpleClusterListener.java "Go to snippet source")/*
 * Copyright (C) 2018-2025 Lightbend Inc. <https://www.lightbend.com>
 */

package jdocs.cluster;

import akka.actor.AbstractActor;
import akka.cluster.Cluster;
import akka.cluster.ClusterEvent;
import akka.cluster.ClusterEvent.MemberEvent;
import akka.cluster.ClusterEvent.MemberRemoved;
import akka.cluster.ClusterEvent.MemberUp;
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

And the minimum configuration required is to set a host/port for remoting and the `akka.actor.provider = "cluster"`.

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-typed/src/test/scala/docs/akka/cluster/typed/BasicClusterExampleSpec.scala#L32-L50 "Go to snippet source")akka {
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

The actor registers itself as subscriber of certain cluster events. It receives events corresponding to the current state of the cluster when the subscription starts and then it receives events for changes that happen in the cluster.

## Cluster Membership API

This section shows the basic usage of the membership API. For the in\-depth descriptions on joining, joining to seed nodes, downing and leaving of any node in the cluster please see the full [Cluster Membership API](typed/cluster.html#cluster-membership-api) documentation.

### Joining to Seed Nodes

The seed nodes are initial contact points for joining a cluster, which can be done in different ways:

- [automatically with Cluster Bootstrap](typed/cluster.html#joining-automatically-to-seed-nodes-with-cluster-bootstrap)
- [with configuration of seed\-nodes](typed/cluster.html#joining-configured-seed-nodes)
- [programatically](cluster-usage.html#joining-programmatically-to-seed-nodes)

After the joining process the seed nodes are not special and they participate in the cluster in exactly the same way as other nodes.

#### Joining programmatically to seed nodes

You may also join programmatically, which is attractive when dynamically discovering other nodes at startup by using some external tool or API.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/cluster/ClusterDocSpec.scala#L49-L54 "Go to snippet source")import akka.actor.Address
import akka.cluster.Cluster

val cluster = Cluster(system)
val list: List[Address] = ??? //your method to dynamically get seed nodes
cluster.joinSeedNodes(list)
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/cluster/ClusterDocTest.java#L19-L21 "Go to snippet source")import akka.actor.Address;
import akka.cluster.Cluster;

final Cluster cluster = Cluster.get(system);
List<Address> list =
    new LinkedList<>(); // replace this with your method to dynamically get seed nodes
cluster.joinSeedNodes(list);
```

For more information see [tuning joins](typed/cluster.html#tuning-joins)

It’s also possible to specifically join a single node as illustrated in below example, but [`joinSeedNodes`](https://doc.akka.io/api/akka-core/2.10/akka/cluster/Cluster.html#joinSeedNodes(seedNodes:Seq[akka.actor.Address]):Unit "akka.cluster.Cluster")[`joinSeedNodes`](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/Cluster.html#joinSeedNodes(java.util.List) "akka.cluster.Cluster") should be preferred since it has redundancy and retry mechanisms built\-in.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/cluster/SimpleClusterListener2.scala#L14-L20 "Go to snippet source")val cluster = Cluster(context.system)
  cluster.join(cluster.selfAddress)
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/cluster/SimpleClusterListener2.java#L20-L27 "Go to snippet source")Cluster cluster = Cluster.get(getContext().getSystem());
  cluster.join(cluster.selfAddress());
```

## Leaving

See [Leaving](typed/cluster.html#leaving) in the documentation of the new APIs.

## Downing

See [Downing](typed/cluster.html#downing) in the documentation of the new APIs.

## Subscribe to Cluster Events

You can subscribe to change notifications of the cluster membership by using [`Cluster(system).subscribe`](https://doc.akka.io/api/akka-core/2.10/akka/cluster/Cluster.html#subscribe(subscriber:akka.actor.ActorRef,to:Class[_]*):Unit "akka.cluster.Cluster")[`Cluster.get(system).subscribe`](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/Cluster.html#subscribe(akka.actor.ActorRef,akka.cluster.ClusterEvent.SubscriptionInitialStateMode,java.lang.Class...) "akka.cluster.Cluster").

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/cluster/SimpleClusterListener2.scala#L24 "Go to snippet source")cluster.subscribe(self, classOf[MemberEvent], classOf[UnreachableMember])
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/cluster/SimpleClusterListener2.java#L31 "Go to snippet source")cluster.subscribe(getSelf(), MemberEvent.class, UnreachableMember.class);
```

A snapshot of the full state, [`CurrentClusterState`](https://doc.akka.io/api/akka-core/2.10/akka/cluster/ClusterEvent$$CurrentClusterState.html "akka.cluster.ClusterEvent.CurrentClusterState")[`CurrentClusterState`](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ClusterEvent.CurrentClusterState.html "akka.cluster.ClusterEvent.CurrentClusterState"), is sent to the subscriber as the first message, followed by events for incremental updates.

Note that you may receive an empty `CurrentClusterState`, containing no members, followed by [`MemberUp`](https://doc.akka.io/api/akka-core/2.10/akka/cluster/ClusterEvent$$MemberUp.html "akka.cluster.ClusterEvent.MemberUp")[`MemberUp`](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ClusterEvent.MemberUp.html "akka.cluster.ClusterEvent.MemberUp") events from other nodes which already joined, if you start the subscription before the initial join procedure has completed. This may for example happen when you start the subscription immediately after [`cluster.join()`](https://doc.akka.io/api/akka-core/2.10/akka/cluster/Cluster.html#join(address:akka.actor.Address):Unit "akka.cluster.Cluster")[`cluster.join()`](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/Cluster.html#join(akka.actor.Address) "akka.cluster.Cluster") like below. This is expected behavior. When the node has been accepted in the cluster you will receive `MemberUp` for that node, and other nodes.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/cluster/SimpleClusterListener2.scala#L14-L20 "Go to snippet source")val cluster = Cluster(context.system)
  cluster.join(cluster.selfAddress)
cluster.subscribe(self, classOf[MemberEvent], classOf[UnreachableMember])
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/cluster/SimpleClusterListener2.java#L20-L27 "Go to snippet source")Cluster cluster = Cluster.get(getContext().getSystem());
  cluster.join(cluster.selfAddress());
cluster.subscribe(getSelf(), MemberEvent.class, UnreachableMember.class);
```

To avoid receiving an empty `CurrentClusterState` at the beginning, you can use it like shown in the following example, to defer subscription until the `MemberUp` event for the own node is received:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/cluster/SimpleClusterListener2.scala#L14-L20 "Go to snippet source")val cluster = Cluster(context.system)
  cluster.join(cluster.selfAddress)
cluster.registerOnMemberUp {
  cluster.subscribe(self, classOf[MemberEvent], classOf[UnreachableMember])
}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/cluster/SimpleClusterListener2.java#L20-L27 "Go to snippet source")Cluster cluster = Cluster.get(getContext().getSystem());
  cluster.join(cluster.selfAddress());
cluster.registerOnMemberUp(
    () -> cluster.subscribe(getSelf(), MemberEvent.class, UnreachableMember.class));
```

If you find it inconvenient to handle the `CurrentClusterState` you can use [`ClusterEvent.InitialStateAsEvents`](https://doc.akka.io/api/akka-core/2.10/akka/cluster/ClusterEvent$$InitialStateAsEvents$.html "akka.cluster.ClusterEvent$$InitialStateAsEvents") [`ClusterEvent.initialStateAsEvents()`](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ClusterEvent.html#initialStateAsEvents() "akka.cluster.ClusterEvent") as parameter to [`subscribe`](https://doc.akka.io/api/akka-core/2.10/akka/cluster/Cluster.html#subscribe(subscriber:akka.actor.ActorRef,to:Class[_]*):Unit "akka.cluster.Cluster")[`subscribe`](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/Cluster.html#subscribe(akka.actor.ActorRef,akka.cluster.ClusterEvent.SubscriptionInitialStateMode,java.lang.Class...) "akka.cluster.Cluster"). That means that instead of receiving `CurrentClusterState` as the first message you will receive the events corresponding to the current state to mimic what you would have seen if you were listening to the events when they occurred in the past. Note that those initial events only correspond to the current state and it is not the full history of all changes that actually has occurred in the cluster.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/cluster/SimpleClusterListener.scala#L19 "Go to snippet source")cluster.subscribe(self, initialStateMode = InitialStateAsEvents, classOf[MemberEvent], classOf[UnreachableMember])
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/cluster/SimpleClusterListener.java#L25-L26 "Go to snippet source")cluster.subscribe(
    getSelf(), ClusterEvent.initialStateAsEvents(), MemberEvent.class, UnreachableMember.class);
```

### Worker Dial\-in Example

Let’s take a look at an example that illustrates how workers, here named *backend*, can detect and register to new master nodes, here named *frontend*.

The example application provides a service to transform text. When some text is sent to one of the frontend services, it will be delegated to one of the backend workers, which performs the transformation job, and sends the result back to the original client. New backend nodes, as well as new frontend nodes, can be added or removed to the cluster dynamically.

Messages:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/cluster/TransformationMessages.scala#L8-L11 "Go to snippet source")final case class TransformationJob(text: String)
final case class TransformationResult(text: String)
final case class JobFailed(reason: String, job: TransformationJob)
case object BackendRegistration
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/cluster/TransformationMessages.java#L10-L65 "Go to snippet source")public interface TransformationMessages {

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
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/cluster/TransformationBackend.scala#L19-L39 "Go to snippet source")class TransformationBackend extends Actor {

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
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/cluster/TransformationBackend.java#L19-L66 "Go to snippet source")public class TransformationBackend extends AbstractActor {

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
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/cluster/TransformationFrontend.scala#L19-L39 "Go to snippet source")class TransformationFrontend extends Actor {

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
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/cluster/TransformationFrontend.java#L18-L52 "Go to snippet source")public class TransformationFrontend extends AbstractActor {

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

Note that the `TransformationFrontend` actor watch the registered backend to be able to remove it from its list of available backend workers. Death watch uses the cluster failure detector for nodes in the cluster, i.e. it detects network failures and JVM crashes, in addition to graceful termination of watched actor. Death watch generates the [`Terminated`](https://doc.akka.io/api/akka-core/2.10/akka/actor/Terminated.html "akka.actor.Terminated")[`Terminated`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/Terminated.html "akka.actor.Terminated") message to the watching actor when the unreachable cluster node has been downed and removed.

## Node Roles

See [Cluster Node Roles](typed/cluster.html#node-roles) in the documentation of the new APIs.

## How To Startup when Cluster Size Reached

See [How to startup when a minimum number of members in the cluster is reached](typed/cluster.html#how-to-startup-when-a-cluster-size-is-reached) in the documentation of the new APIs.

## How To Startup when Member is Up

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

You can start actors or trigger any functions using the [`registerOnMemberUp`](https://doc.akka.io/api/akka-core/2.10/akka/cluster/Cluster.html#registerOnMemberUp[T](code:=%3ET):Unit "akka.cluster.Cluster")[`registerOnMemberUp`](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/Cluster.html#registerOnMemberUp(java.lang.Runnable) "akka.cluster.Cluster") callback, which will be invoked when the current member status is changed to ‘Up’. This can additionally be used with `akka.cluster.min-nr-of-members` optional configuration to defer an action until the cluster has reached a certain size.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/cluster/FactorialFrontend.scala#L58-L60 "Go to snippet source")Cluster(system).registerOnMemberUp {
  system.actorOf(Props(classOf[FactorialFrontend], upToN, true), name = "factorialFrontend")
}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/cluster/FactorialFrontendMain.java#L26-L34 "Go to snippet source")Cluster.get(system)
    .registerOnMemberUp(
        new Runnable() {
          @Override
          public void run() {
            system.actorOf(
                Props.create(FactorialFrontend.class, upToN, true), "factorialFrontend");
          }
        });
```

## How To Cleanup when Member is Removed

You can do some clean up in a [`registerOnMemberRemoved`](https://doc.akka.io/api/akka-core/2.10/akka/cluster/Cluster.html#registerOnMemberRemoved[T](code:=%3ET):Unit "akka.cluster.Cluster")[`registerOnMemberRemoved`](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/Cluster.html#registerOnMemberRemoved(java.lang.Runnable) "akka.cluster.Cluster") callback, which will be invoked when the current member status is changed to ‘Removed’ or the cluster have been shutdown.

An alternative is to register tasks to the [Coordinated Shutdown](coordinated-shutdown.html).

Note
Register a OnMemberRemoved callback on a cluster that have been shutdown, the callback will be invoked immediately on the caller thread, otherwise it will be invoked later when the current member status changed to [`Removed`](https://doc.akka.io/api/akka-core/2.10/akka/cluster/MemberStatus$$Removed$.html "akka.cluster.MemberStatus$$Removed")[`Removed`](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/MemberStatus.html#removed() "akka.cluster.MemberStatus"). You may want to install some cleanup handling after the cluster was started up, but the cluster might already be shutting down when you installing, and depending on the race is not healthy.

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

See [Cluster Distributed Publish Subscribe](distributed-pub-sub.html).

### Cluster Aware Routers

All routers can be made aware of member nodes in the cluster, i.e. deploying new routees or looking up routees on nodes in the cluster. When a node becomes unreachable or leaves the cluster the routees of that node are automatically unregistered from the router. When new nodes join the cluster, additional routees are added to the router, according to the configuration.

See [Cluster Aware Routers](cluster-routing.html) and [Routers](routing.html).

### Cluster Metrics

The member nodes of the cluster can collect system health metrics and publish that to other cluster nodes and to the registered subscribers on the system event bus.

See [Cluster Metrics](cluster-metrics.html). 

## Failure Detector

The nodes in the cluster monitor each other by sending heartbeats to detect if a node is unreachable from the rest of the cluster. Please see:

- [Failure Detector specification](typed/cluster-concepts.html#failure-detector)
- [Phi Accrual Failure Detector](typed/failure-detector.html) implementation
- [Using the Failure Detector](typed/cluster.html#using-the-failure-detector)

## How to Test

[Multi Node Testing](multi-node-testing.html) is useful for testing cluster applications.

Set up your project according to the instructions in [Multi Node Testing](multi-node-testing.html) and [Multi JVM Testing](multi-jvm-testing.html), i.e. add the `sbt-multi-jvm` plugin and the dependency to `akka-multi-node-testkit`.

First, as described in [Multi Node Testing](multi-node-testing.html), we need some scaffolding to configure the [`MultiNodeSpec`](https://doc.akka.io/api/akka-core/2.10/akka/remote/testkit/MultiNodeSpec.html "akka.remote.testkit.MultiNodeSpec"). Define the participating [roles](typed/cluster.html#node-roles) and their [configuration](cluster-usage.html#configuration) in an object extending [`MultiNodeConfig`](https://doc.akka.io/api/akka-core/2.10/akka/remote/testkit/MultiNodeConfig.html "akka.remote.testkit.MultiNodeConfig"):

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-metrics/src/multi-jvm/scala/akka/cluster/metrics/sample/StatsSampleSpec.scala#L15-L58 "Go to snippet source")import akka.remote.testkit.MultiNodeConfig
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
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-metrics/src/multi-jvm/scala/akka/cluster/metrics/sample/StatsSampleSpec.scala#L62-L65 "Go to snippet source")// need one concrete test class per node
class StatsSampleSpecMultiJvmNode1 extends StatsSampleSpec
class StatsSampleSpecMultiJvmNode2 extends StatsSampleSpec
class StatsSampleSpecMultiJvmNode3 extends StatsSampleSpec
```

Note the naming convention of these classes. The name of the classes must end with `MultiJvmNode1`, `MultiJvmNode2` and so on. It is possible to define another suffix to be used by the `sbt-multi-jvm`, but the default should be fine in most cases.

Then the abstract `MultiNodeSpec`, which takes the `MultiNodeConfig` as constructor parameter.

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-metrics/src/multi-jvm/scala/akka/cluster/metrics/sample/StatsSampleSpec.scala#L69-L89 "Go to snippet source")import akka.remote.testkit.MultiNodeSpec
import akka.testkit.ImplicitSender
import org.scalatest.BeforeAndAfterAll
import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpecLike

abstract class StatsSampleSpec
    extends MultiNodeSpec(StatsSampleSpecConfig)
    with AnyWordSpecLike
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
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-metrics/src/multi-jvm/scala/akka/cluster/metrics/sample/StatsSampleSpec.scala#L95-L118 "Go to snippet source")"illustrate how to startup cluster" in within(15 seconds) {
  Cluster(system).subscribe(testActor, classOf[MemberUp])
  expectMsgClass(classOf[CurrentClusterState])

  val firstAddress = node(first).address
  val secondAddress = node(second).address
  val thirdAddress = node(third).address

  Cluster(system).join(firstAddress)

  system.actorOf(Props[StatsWorker](), "statsWorker")
  system.actorOf(Props[StatsService](), "statsService")

  receiveN(3).collect { case MemberUp(m) => m.address }.toSet should be(
    Set(firstAddress, secondAddress, thirdAddress))

  Cluster(system).unsubscribe(testActor)

  testConductor.enter("all-up")
}
```

From the test you interact with the cluster using the `Cluster` extension, e.g. [`join`](https://doc.akka.io/api/akka-core/2.10/akka/cluster/Cluster.html#join(address:akka.actor.Address):Unit "akka.cluster.Cluster").

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-metrics/src/multi-jvm/scala/akka/cluster/metrics/sample/StatsSampleSpec.scala#L106 "Go to snippet source")Cluster(system).join(firstAddress)
```

Notice how the *testActor* from [testkit](testing.html) is added as [subscriber](cluster-usage.html#cluster-subscriber) to cluster changes and then waiting for certain events, such as in this case all members becoming ‘Up’.

The above code was running for all roles (JVMs). [`runOn`](https://doc.akka.io/api/akka-core/2.10/akka/remote/testkit/MultiNodeSpec.html#runOn(nodes:akka.remote.testconductor.RoleName*)(thunk:=%3EUnit):Unit "akka.remote.testkit.MultiNodeSpec") is a convenient utility to declare that a certain block of code should only run for a specific role.

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-metrics/src/multi-jvm/scala/akka/cluster/metrics/sample/StatsSampleSpec.scala#L122-L139 "Go to snippet source")"show usage of the statsService from one node" in within(15 seconds) {
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

Once again we take advantage of the facilities in [testkit](testing.html) to verify expected behavior. Here using `testActor` as sender (via [`ImplicitSender`](https://doc.akka.io/api/akka-core/2.10/akka/testkit/ImplicitSender.html "akka.testkit.ImplicitSender")) and verifying the reply with [`expectMsgType`](https://doc.akka.io/api/akka-core/2.10/akka/testkit/TestKit.html#expectMsgType[T](max:scala.concurrent.duration.FiniteDuration)(implicitt:scala.reflect.ClassTag[T]):T "akka.testkit.TestKit").

In the above code you can see `node(third)`, which is useful facility to get the root actor reference of the actor system for a specific role. This can also be used to grab the [`akka.actor.Address`](https://doc.akka.io/api/akka-core/2.10/akka/actor/Address.html "akka.actor.Address") of that node.

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-metrics/src/multi-jvm/scala/akka/cluster/metrics/sample/StatsSampleSpec.scala#L100-L102 "Go to snippet source")val firstAddress = node(first).address
val secondAddress = node(second).address
val thirdAddress = node(third).address
```

Currently testing with the `sbt-multi-jvm` plugin is only documented for Scala. Go to the corresponding Scala version of this page for details.

## Management

There are several management tools for the cluster. Please refer to the [Cluster Management](additional/operations.html#cluster-management) for more information.

### Command Line

Warning
**Deprecation warning** \- The command line script has been deprecated and is scheduled for removal in the next major version. Use the [HTTP management](additional/operations.html#http) API with [curl](https://curl.se/) or similar instead.

The cluster can be managed with the script `akka-cluster` provided in the Akka GitHub repository [here](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster/jmx-client). Place the script and the `jmxsh-R5.jar` library in the same directory.

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
          ./akka-cluster localhost 9999 join akka://MySystem@darkstar:2552
          ./akka-cluster localhost 9999 cluster-status

```

To be able to use the script you must enable remote monitoring and management when starting the JVMs of the cluster nodes, as described in [Monitoring and Management Using JMX Technology](https://docs.oracle.com/javase/8/docs/technotes/guides/management/agent.html). Make sure you understand the security implications of enabling remote monitoring and management.

## Configuration

There are several [configuration](typed/cluster.html#configuration) properties for the cluster, and the full [reference configuration](general/configuration-reference.html#config-akka-cluster) for complete information.

## Code Examples

### Example 1: Module info

```scala
val AkkaVersion = "2.10.17"
libraryDependencies += "com.typesafe.akka" %% "akka-cluster" % AkkaVersion
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
    <artifactId>akka-cluster_${scala.binary.version}</artifactId>
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

  implementation "com.typesafe.akka:akka-cluster_${versions.ScalaBinary}"
}
```

### Example 4: Cluster API Extension

```scala
/*
 * Copyright (C) 2018-2025 Lightbend Inc. <https://www.lightbend.com>
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

### Example 5: Cluster API Extension

```java
/*
 * Copyright (C) 2018-2025 Lightbend Inc. <https://www.lightbend.com>
 */

package jdocs.cluster;

import akka.actor.AbstractActor;
import akka.cluster.Cluster;
import akka.cluster.ClusterEvent;
import akka.cluster.ClusterEvent.MemberEvent;
import akka.cluster.ClusterEvent.MemberRemoved;
import akka.cluster.ClusterEvent.MemberUp;
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

### Example 7: Joining programmatically to seed nodes

```scala
import akka.actor.Address
import akka.cluster.Cluster

val cluster = Cluster(system)
val list: List[Address] = ??? //your method to dynamically get seed nodes
cluster.joinSeedNodes(list)
```

### Example 8: Joining programmatically to seed nodes

```java
import akka.actor.Address;
import akka.cluster.Cluster;

final Cluster cluster = Cluster.get(system);
List<Address> list =
    new LinkedList<>(); // replace this with your method to dynamically get seed nodes
cluster.joinSeedNodes(list);
```

### Example 9: Joining programmatically to seed nodes

```scala
val cluster = Cluster(context.system)
  cluster.join(cluster.selfAddress)
```

### Example 10: Joining programmatically to seed nodes

```java
Cluster cluster = Cluster.get(getContext().getSystem());
  cluster.join(cluster.selfAddress());
```

### Example 11: Subscribe to Cluster Events

```scala
cluster.subscribe(self, classOf[MemberEvent], classOf[UnreachableMember])
```

### Example 12: Subscribe to Cluster Events

```java
cluster.subscribe(getSelf(), MemberEvent.class, UnreachableMember.class);
```

### Example 13: Subscribe to Cluster Events

```scala
val cluster = Cluster(context.system)
  cluster.join(cluster.selfAddress)
cluster.subscribe(self, classOf[MemberEvent], classOf[UnreachableMember])
```

### Example 14: Subscribe to Cluster Events

```java
Cluster cluster = Cluster.get(getContext().getSystem());
  cluster.join(cluster.selfAddress());
cluster.subscribe(getSelf(), MemberEvent.class, UnreachableMember.class);
```

### Example 15: Subscribe to Cluster Events

```scala
val cluster = Cluster(context.system)
  cluster.join(cluster.selfAddress)
cluster.registerOnMemberUp {
  cluster.subscribe(self, classOf[MemberEvent], classOf[UnreachableMember])
}
```

### Example 16: Subscribe to Cluster Events

```java
Cluster cluster = Cluster.get(getContext().getSystem());
  cluster.join(cluster.selfAddress());
cluster.registerOnMemberUp(
    () -> cluster.subscribe(getSelf(), MemberEvent.class, UnreachableMember.class));
```

### Example 17: Subscribe to Cluster Events

```scala
cluster.subscribe(self, initialStateMode = InitialStateAsEvents, classOf[MemberEvent], classOf[UnreachableMember])
```

### Example 18: Subscribe to Cluster Events

```java
cluster.subscribe(
    getSelf(), ClusterEvent.initialStateAsEvents(), MemberEvent.class, UnreachableMember.class);
```

### Example 19: Worker Dial-in Example

```scala
final case class TransformationJob(text: String)
final case class TransformationResult(text: String)
final case class JobFailed(reason: String, job: TransformationJob)
case object BackendRegistration
```

### Example 20: Worker Dial-in Example

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

### Example 21: Worker Dial-in Example

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

### Example 22: Worker Dial-in Example

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

### Example 23: Worker Dial-in Example

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

### Example 24: Worker Dial-in Example

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

### Example 25: How To Startup when Member is Up

```text
akka.cluster.min-nr-of-members = 3
```

### Example 26: How To Startup when Member is Up

```text
akka.cluster.role {
  frontend.min-nr-of-members = 1
  backend.min-nr-of-members = 2
}
```

### Example 27: How To Startup when Member is Up

```scala
Cluster(system).registerOnMemberUp {
  system.actorOf(Props(classOf[FactorialFrontend], upToN, true), name = "factorialFrontend")
}
```

### Example 28: How To Startup when Member is Up

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

### Example 29: How to Test

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

### Example 30: How to Test

```scala
// need one concrete test class per node
class StatsSampleSpecMultiJvmNode1 extends StatsSampleSpec
class StatsSampleSpecMultiJvmNode2 extends StatsSampleSpec
class StatsSampleSpecMultiJvmNode3 extends StatsSampleSpec
```

### Example 31: How to Test

```scala
import akka.remote.testkit.MultiNodeSpec
import akka.testkit.ImplicitSender
import org.scalatest.BeforeAndAfterAll
import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpecLike

abstract class StatsSampleSpec
    extends MultiNodeSpec(StatsSampleSpecConfig)
    with AnyWordSpecLike
    with Matchers
    with BeforeAndAfterAll
    with ImplicitSender {

  import StatsSampleSpecConfig._

  override def initialParticipants = roles.size

  override def beforeAll() = multiNodeSpecBeforeAll()

  override def afterAll() = multiNodeSpecAfterAll()
```

### Example 32: How to Test

```scala
"illustrate how to startup cluster" in within(15 seconds) {
  Cluster(system).subscribe(testActor, classOf[MemberUp])
  expectMsgClass(classOf[CurrentClusterState])

  val firstAddress = node(first).address
  val secondAddress = node(second).address
  val thirdAddress = node(third).address

  Cluster(system).join(firstAddress)

  system.actorOf(Props[StatsWorker](), "statsWorker")
  system.actorOf(Props[StatsService](), "statsService")

  receiveN(3).collect { case MemberUp(m) => m.address }.toSet should be(
    Set(firstAddress, secondAddress, thirdAddress))

  Cluster(system).unsubscribe(testActor)

  testConductor.enter("all-up")
}
```

### Example 33: How to Test

```scala
Cluster(system).join(firstAddress)
```

### Example 34: How to Test

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

### Example 35: How to Test

```scala
val firstAddress = node(first).address
val secondAddress = node(second).address
val thirdAddress = node(third).address
```

### Example 36: Command Line

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
          ./akka-cluster localhost 9999 join akka://MySystem@darkstar:2552
          ./akka-cluster localhost 9999 cluster-status
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/Address.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/Terminated.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/Cluster.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ClusterEvent$$CurrentClusterState.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ClusterEvent$$InitialStateAsEvents$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ClusterEvent$$MemberUp.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/MemberStatus$$Removed$.html
- https://doc.akka.io/api/akka-core/2.10/akka/remote/testkit/MultiNodeConfig.html
- https://doc.akka.io/api/akka-core/2.10/akka/remote/testkit/MultiNodeSpec.html
- https://doc.akka.io/api/akka-core/2.10/akka/testkit/ImplicitSender.html
- https://doc.akka.io/api/akka-core/2.10/akka/testkit/TestKit.html
- https://doc.akka.io/cdn-cgi/l/email-protection
- https://doc.akka.io/docs/akka-dependencies/current/support-terminology.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/Terminated.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/Cluster.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ClusterEvent.CurrentClusterState.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ClusterEvent.MemberUp.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ClusterEvent.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/MemberStatus.html
- https://doc.akka.io/libraries/akka-core/2.10/additional/operations.html
- https://doc.akka.io/libraries/akka-core/2.10/additional/rolling-updates.html
- https://doc.akka.io/libraries/akka-core/2.10/cluster-metrics.html
- https://doc.akka.io/libraries/akka-core/2.10/cluster-routing.html
- https://doc.akka.io/libraries/akka-core/2.10/cluster-sharding.html
- https://doc.akka.io/libraries/akka-core/2.10/cluster-singleton.html
- https://doc.akka.io/libraries/akka-core/2.10/cluster-usage.html
- https://doc.akka.io/libraries/akka-core/2.10/coordinated-shutdown.html
- https://doc.akka.io/libraries/akka-core/2.10/distributed-data.html
- https://doc.akka.io/libraries/akka-core/2.10/distributed-pub-sub.html
- https://doc.akka.io/libraries/akka-core/2.10/general/configuration-reference.html
- https://doc.akka.io/libraries/akka-core/2.10/index-cluster.html
- https://doc.akka.io/libraries/akka-core/2.10/multi-jvm-testing.html
- https://doc.akka.io/libraries/akka-core/2.10/multi-node-testing.html
- https://doc.akka.io/libraries/akka-core/2.10/project/links.html
- https://doc.akka.io/libraries/akka-core/2.10/routing.html
- https://doc.akka.io/libraries/akka-core/2.10/serialization-jackson.html
- https://doc.akka.io/libraries/akka-core/2.10/serialization.html
- https://doc.akka.io/libraries/akka-core/2.10/testing.html
- https://doc.akka.io/libraries/akka-core/2.10/typed/actors.html
- https://doc.akka.io/libraries/akka-core/2.10/typed/choosing-cluster.html
- https://doc.akka.io/libraries/akka-core/2.10/typed/cluster-concepts.html
- https://doc.akka.io/libraries/akka-core/2.10/typed/cluster-membership.html
- https://doc.akka.io/libraries/akka-core/2.10/typed/cluster.html
- https://doc.akka.io/libraries/akka-core/2.10/typed/coexisting.html
- https://doc.akka.io/libraries/akka-core/2.10/typed/failure-detector.html
- https://doc.akka.io/reference/release-notes.html

---
*Source: [https://doc.akka.io/libraries/akka-core/2.10/cluster-usage.html](https://doc.akka.io/libraries/akka-core/2.10/cluster-usage.html)*