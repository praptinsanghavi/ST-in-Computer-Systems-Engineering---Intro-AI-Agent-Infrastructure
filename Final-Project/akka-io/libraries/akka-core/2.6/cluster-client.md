---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:26:17Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/cluster-client.html
title: Classic Cluster Client • Akka Documentation
---

# Classic Cluster Client • Akka Documentation

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

# Classic Cluster Client

Warning
Cluster Client is deprecated in favor of using [Akka gRPC](https://doc.akka.io/libraries/akka-grpc/current/index.html). It is not advised to build new applications with Cluster Client, and existing users [should migrate](cluster-client.html#migration-to-akka-grpc).

Note
Akka Classic pertains to the original Actor APIs, which have been improved by more type safe and guided Actor APIs. Akka Classic is still fully supported and existing applications can continue to use the classic APIs. It is also possible to use the new Actor APIs together with classic actors in the same ActorSystem, see [coexistence](typed/coexisting.html). For new projects we recommend using [the new Actor API](typed/actors.html).

## Module info

To use Cluster Client, you must add the following dependency in your project:

sbt
```
val AkkaVersion = "2.6.21"
libraryDependencies += "com.typesafe.akka" %% "akka-cluster-tools" % AkkaVersion
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
    <artifactId>akka-cluster-tools_${scala.binary.version}</artifactId>
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

  implementation "com.typesafe.akka:akka-cluster-tools_${versions.ScalaBinary}"
}
```

| Project Info: Akka Cluster Tools (classic) | |
| --- | --- |
| Artifact | com.typesafe.akka akka\-cluster\-tools 2\.6\.21 [Snapshots are available](project/links.html#snapshots-repository) |
| JDK versions | Adopt OpenJDK 8Adopt OpenJDK 11 |
| Scala versions | 2\.13\.8, 2\.12\.16, 3\.1\.2 |
| JPMS module name | akka.cluster.tools |
| License | [Apache\-2\.0](https://www.apache.org/licenses/LICENSE-2.0.html) |
| Readiness level | [Supported](https://developer.lightbend.com/docs/introduction/getting-help/support-terminology.html#supported), [Lightbend Subscription](https://www.lightbend.com/lightbend-subscription) provides support Since 2\.3\.0, 2014\-03\-05 |
| Home page | <https://akka.io/> |
| API documentation | [API (Scaladoc)](https://doc.akka.io/api/akka-core/2.6.21/akka/cluster/tools/index.html) [API (Javadoc)](https://doc.akka.io/japi/akka-core/2.6.21/akka/cluster/tools/package-summary.html) |
| Forums | [Lightbend Discuss](https://discuss.akka.io) [akka/akka Gitter channel](https://gitter.im/akka/akka) |
| Release notes | [akka.io blog](https://akka.io/blog/news-archive.html) |
| Issues | [Github issues](https://github.com/akka/akka/issues) |
| Sources | <https://github.com/akka/akka> |

## Introduction

An actor system that is not part of the cluster can communicate with actors somewhere in the cluster via the [`ClusterClient`](https://doc.akka.io/api/akka-core/2.6/akka/cluster/client/ClusterClient.html "akka.cluster.client.ClusterClient")[`ClusterClient`](https://doc.akka.io/japi/akka-core/2.6/akka/cluster/client/ClusterClient.html "akka.cluster.client.ClusterClient"), the client can run in an `ActorSystem` that is part of another cluster. It only needs to know the location of one (or more) nodes to use as initial contact points. It will establish a connection to a [`ClusterReceptionist`](https://doc.akka.io/api/akka-core/2.6/akka/cluster/client/ClusterReceptionist.html "akka.cluster.client.ClusterReceptionist")[`ClusterReceptionist`](https://doc.akka.io/japi/akka-core/2.6/akka/cluster/client/ClusterReceptionist.html "akka.cluster.client.ClusterReceptionist") somewhere in the cluster. It will monitor the connection to the receptionist and establish a new connection if the link goes down. When looking for a new receptionist it uses fresh contact points retrieved from the previous establishment, or periodically refreshed contacts, i.e. not necessarily the initial contact points.

Using the [`ClusterClient`](https://doc.akka.io/api/akka-core/2.6/akka/cluster/client/ClusterClient.html "akka.cluster.client.ClusterClient")[`ClusterClient`](https://doc.akka.io/japi/akka-core/2.6/akka/cluster/client/ClusterClient.html "akka.cluster.client.ClusterClient") for communicating with a cluster from the outside requires that the system with the client can both connect and be connected with Akka Remoting from all the nodes in the cluster with a receptionist. This creates a tight coupling in that the client and cluster systems may need to have the same version of both Akka, libraries, message classes, serializers and potentially even the JVM. In many cases it is a better solution to use a more explicit and decoupling protocol such as [HTTP](https://doc.akka.io/libraries/akka-http/current/index.html) or [gRPC](https://doc.akka.io/libraries/akka-grpc/current/).

Additionally, since Akka Remoting is primarily designed as a protocol for Akka Cluster there is no explicit resource management, when a [`ClusterClient`](https://doc.akka.io/api/akka-core/2.6/akka/cluster/client/ClusterClient.html "akka.cluster.client.ClusterClient")[`ClusterClient`](https://doc.akka.io/japi/akka-core/2.6/akka/cluster/client/ClusterClient.html "akka.cluster.client.ClusterClient") has been used it will cause connections with the cluster until the ActorSystem is stopped (unlike other kinds of network clients).

[`ClusterClient`](https://doc.akka.io/api/akka-core/2.6/akka/cluster/client/ClusterClient.html "akka.cluster.client.ClusterClient")[`ClusterClient`](https://doc.akka.io/japi/akka-core/2.6/akka/cluster/client/ClusterClient.html "akka.cluster.client.ClusterClient") should not be used when sending messages to actors that run within the same cluster. Similar functionality as the [`ClusterClient`](https://doc.akka.io/api/akka-core/2.6/akka/cluster/client/ClusterClient.html "akka.cluster.client.ClusterClient")[`ClusterClient`](https://doc.akka.io/japi/akka-core/2.6/akka/cluster/client/ClusterClient.html "akka.cluster.client.ClusterClient") is provided more efficiently by [Distributed Publish Subscribe in Cluster](distributed-pub-sub.html) for actors that belong to the same cluster.

The connecting system must have its `akka.actor.provider` set to `remote` or `cluster` when using the cluster client.

The receptionist is supposed to be started on all nodes, or all nodes with a specified role, in the cluster. The receptionist can be started with the [`ClusterReceptionist`](https://doc.akka.io/api/akka-core/2.6/akka/cluster/client/ClusterReceptionist.html "akka.cluster.client.ClusterReceptionist")[`ClusterReceptionist`](https://doc.akka.io/japi/akka-core/2.6/akka/cluster/client/ClusterReceptionist.html "akka.cluster.client.ClusterReceptionist") extension or as an ordinary actor.

You can send messages via the [`ClusterClient`](https://doc.akka.io/api/akka-core/2.6/akka/cluster/client/ClusterClient.html "akka.cluster.client.ClusterClient")[`ClusterClient`](https://doc.akka.io/japi/akka-core/2.6/akka/cluster/client/ClusterClient.html "akka.cluster.client.ClusterClient") to any actor in the cluster that is registered in the [`DistributedPubSubMediator`](https://doc.akka.io/api/akka-core/2.6/akka/cluster/pubsub/DistributedPubSubMediator.html "akka.cluster.pubsub.DistributedPubSubMediator")[`DistributedPubSubMediator`](https://doc.akka.io/japi/akka-core/2.6/akka/cluster/pubsub/DistributedPubSubMediator.html "akka.cluster.pubsub.DistributedPubSubMediator") used by the [`ClusterReceptionist`](https://doc.akka.io/api/akka-core/2.6/akka/cluster/client/ClusterReceptionist.html "akka.cluster.client.ClusterReceptionist")[`ClusterReceptionist`](https://doc.akka.io/japi/akka-core/2.6/akka/cluster/client/ClusterReceptionist.html "akka.cluster.client.ClusterReceptionist"). The [`ClusterClientReceptionist`](https://doc.akka.io/api/akka-core/2.6/akka/cluster/client/ClusterClientReceptionist.html "akka.cluster.client.ClusterClientReceptionist")[`ClusterClientReceptionist`](https://doc.akka.io/japi/akka-core/2.6/akka/cluster/client/ClusterClientReceptionist.html "akka.cluster.client.ClusterClientReceptionist") provides methods for registration of actors that should be reachable from the client. Messages are wrapped in `ClusterClient.Send`, [``ClusterClient.SendToAll``](https://doc.akka.io/api/akka-core/2.6/akka/cluster/client/ClusterClient$.html "akka.cluster.client.ClusterClient")`ClusterClient.SendToAll` or [``ClusterClient.Publish``](https://doc.akka.io/api/akka-core/2.6/akka/cluster/client/ClusterClient$.html "akka.cluster.client.ClusterClient")`ClusterClient.Publish`.

Both the [`ClusterClient`](https://doc.akka.io/api/akka-core/2.6/akka/cluster/client/ClusterClient.html "akka.cluster.client.ClusterClient")[`ClusterClient`](https://doc.akka.io/japi/akka-core/2.6/akka/cluster/client/ClusterClient.html "akka.cluster.client.ClusterClient") and the [`ClusterClientReceptionist`](https://doc.akka.io/api/akka-core/2.6/akka/cluster/client/ClusterClientReceptionist.html "akka.cluster.client.ClusterClientReceptionist")[`ClusterClientReceptionist`](https://doc.akka.io/japi/akka-core/2.6/akka/cluster/client/ClusterClientReceptionist.html "akka.cluster.client.ClusterClientReceptionist") emit events that can be subscribed to. The [`ClusterClient`](https://doc.akka.io/api/akka-core/2.6/akka/cluster/client/ClusterClient.html "akka.cluster.client.ClusterClient")[`ClusterClient`](https://doc.akka.io/japi/akka-core/2.6/akka/cluster/client/ClusterClient.html "akka.cluster.client.ClusterClient") sends out notifications about the list of contact points received from the [`ClusterClientReceptionist`](https://doc.akka.io/api/akka-core/2.6/akka/cluster/client/ClusterClientReceptionist.html "akka.cluster.client.ClusterClientReceptionist")[`ClusterClientReceptionist`](https://doc.akka.io/japi/akka-core/2.6/akka/cluster/client/ClusterClientReceptionist.html "akka.cluster.client.ClusterClientReceptionist"). One use of this list might be for the client to record its contact points. A client that is restarted could then use this information to supersede any previously configured contact points.

The [`ClusterClientReceptionist`](https://doc.akka.io/api/akka-core/2.6/akka/cluster/client/ClusterClientReceptionist.html "akka.cluster.client.ClusterClientReceptionist")[`ClusterClientReceptionist`](https://doc.akka.io/japi/akka-core/2.6/akka/cluster/client/ClusterClientReceptionist.html "akka.cluster.client.ClusterClientReceptionist") sends out notifications in relation to having received a contact from a [`ClusterClient`](https://doc.akka.io/api/akka-core/2.6/akka/cluster/client/ClusterClient.html "akka.cluster.client.ClusterClient")[`ClusterClient`](https://doc.akka.io/japi/akka-core/2.6/akka/cluster/client/ClusterClient.html "akka.cluster.client.ClusterClient"). This notification enables the server containing the receptionist to become aware of what clients are connected to.

1. **ClusterClient.Send**

The message will be delivered to one recipient with a matching path if any such exists. If several entries match the path the message will be delivered to one random destination. The sender of the message can specify that local affinity is preferred, i.e. the message is sent to an actor in the same local actor system as the used receptionist actor, if any such exists, otherwise random to any other matching entry.

1. **ClusterClient.SendToAll**

The message will be delivered to all recipients with a matching path.

1. **ClusterClient.Publish**

The message will be delivered to all recipients Actors that have been registered as subscribers to the named topic.

Response messages from the destination actor are tunneled via the receptionist to avoid inbound connections from other cluster nodes to the client:

- [``sender()``](https://doc.akka.io/api/akka-core/2.6/akka/actor/Actor.html "akka.actor.Actor")[``getSender()``](https://doc.akka.io/japi/akka-core/2.6/akka/actor/Actor.html "akka.actor.Actor"), as seen by the destination actor, is not the client itself, but the receptionist
- [``sender()``](https://doc.akka.io/api/akka-core/2.6/akka/actor/Actor.html "akka.actor.Actor") [``getSender()``](https://doc.akka.io/japi/akka-core/2.6/akka/actor/Actor.html "akka.actor.Actor") of the response messages, sent back from the destination and seen by the client, is `deadLetters`

since the client should normally send subsequent messages via the [`ClusterClient`](https://doc.akka.io/api/akka-core/2.6/akka/cluster/client/ClusterClient.html "akka.cluster.client.ClusterClient")[`ClusterClient`](https://doc.akka.io/japi/akka-core/2.6/akka/cluster/client/ClusterClient.html "akka.cluster.client.ClusterClient"). It is possible to pass the original sender inside the reply messages if the client is supposed to communicate directly to the actor in the cluster.

While establishing a connection to a receptionist the [`ClusterClient`](https://doc.akka.io/api/akka-core/2.6/akka/cluster/client/ClusterClient.html "akka.cluster.client.ClusterClient")[`ClusterClient`](https://doc.akka.io/japi/akka-core/2.6/akka/cluster/client/ClusterClient.html "akka.cluster.client.ClusterClient") will buffer messages and send them when the connection is established. If the buffer is full the [`ClusterClient`](https://doc.akka.io/api/akka-core/2.6/akka/cluster/client/ClusterClient.html "akka.cluster.client.ClusterClient")[`ClusterClient`](https://doc.akka.io/japi/akka-core/2.6/akka/cluster/client/ClusterClient.html "akka.cluster.client.ClusterClient") will drop old messages when new messages are sent via the client. The size of the buffer is configurable and it can be disabled by using a buffer size of 0\.

It’s worth noting that messages can always be lost because of the distributed nature of these actors. As always, additional logic should be implemented in the destination (acknowledgement) and in the client (retry) actors to ensure at\-least\-once message delivery.

## An Example

On the cluster nodes, first start the receptionist. Note, it is recommended to load the extension when the actor system is started by defining it in the `akka.extensions` configuration property:

```
akka.extensions = ["akka.cluster.client.ClusterClientReceptionist"]

```

Next, register the actors that should be available for the client.

Scala

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-cluster-tools/src/multi-jvm/scala/akka/cluster/client/ClusterClientSpec.scala#L265-L273 "Go to snippet source")runOn(host1) {
  val serviceA = system.actorOf(Props[Service](), "serviceA")
  ClusterClientReceptionist(system).registerService(serviceA)
}

runOn(host2, host3) {
  val serviceB = system.actorOf(Props[Service](), "serviceB")
  ClusterClientReceptionist(system).registerService(serviceB)
}
```

Java

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-cluster-tools/src/test/java/akka/cluster/client/ClusterClientTest.java#L44-L48 "Go to snippet source")ActorRef serviceA = system.actorOf(Props.create(Service.class), "serviceA");
ClusterClientReceptionist.get(system).registerService(serviceA);

ActorRef serviceB = system.actorOf(Props.create(Service.class), "serviceB");
ClusterClientReceptionist.get(system).registerService(serviceB);
```

On the client, you create the [`ClusterClient`](https://doc.akka.io/api/akka-core/2.6/akka/cluster/client/ClusterClient.html "akka.cluster.client.ClusterClient")[`ClusterClient`](https://doc.akka.io/japi/akka-core/2.6/akka/cluster/client/ClusterClient.html "akka.cluster.client.ClusterClient") actor and use it as a gateway for sending messages to the actors identified by their path (without address information) somewhere in the cluster.

Scala

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-cluster-tools/src/multi-jvm/scala/akka/cluster/client/ClusterClientSpec.scala#L282-L288 "Go to snippet source")runOn(client) {
  val c = system.actorOf(
    ClusterClient.props(ClusterClientSettings(system).withInitialContacts(initialContacts)),
    "client")
  c ! ClusterClient.Send("/user/serviceA", "hello", localAffinity = true)
  c ! ClusterClient.SendToAll("/user/serviceB", "hi")
}
```

Java

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-cluster-tools/src/test/java/akka/cluster/client/ClusterClientTest.java#L52-L58 "Go to snippet source")final ActorRef c =
    system.actorOf(
        ClusterClient.props(
            ClusterClientSettings.create(system).withInitialContacts(initialContacts())),
        "client");
c.tell(new ClusterClient.Send("/user/serviceA", "hello", true), ActorRef.noSender());
c.tell(new ClusterClient.SendToAll("/user/serviceB", "hi"), ActorRef.noSender());
```

The `initialContacts` parameter is a `Set[ActorPath]``Set<ActorPath>`, which can be created like this:

Scala

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-cluster-tools/src/multi-jvm/scala/akka/cluster/client/ClusterClientSpec.scala#L197-L200 "Go to snippet source")val initialContacts = Set(
  ActorPath.fromString("akka://OtherSys@host1:2552/system/receptionist"),
  ActorPath.fromString("akka://OtherSys@host2:2552/system/receptionist"))
val settings = ClusterClientSettings(system).withInitialContacts(initialContacts)
```

Java

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-cluster-tools/src/test/java/akka/cluster/client/ClusterClientTest.java#L32-L37 "Go to snippet source")Set<ActorPath> initialContacts() {
  return new HashSet<ActorPath>(
      Arrays.asList(
          ActorPaths.fromString("akka://OtherSys@host1:2552/system/receptionist"),
          ActorPaths.fromString("akka://OtherSys@host2:2552/system/receptionist")));
}
```

You will probably define the address information of the initial contact points in configuration or system property. See also [Configuration](cluster-client.html#cluster-client-config).

A more comprehensive sample is available in the tutorial named [Distributed workers with Akka and Scala](https://github.com/typesafehub/activator-akka-distributed-workers). [Distributed workers with Akka and Java](https://github.com/typesafehub/activator-akka-distributed-workers-java).

## ClusterClientReceptionist Extension

In the example above the receptionist is started and accessed with the `akka.cluster.client.ClusterClientReceptionist` extension. That is convenient and perfectly fine in most cases, but it can be good to know that it is possible to start the `akka.cluster.client.ClusterReceptionist` actor as an ordinary actor and you can have several different receptionists at the same time, serving different types of clients.

Note that the [`ClusterClientReceptionist`](https://doc.akka.io/api/akka-core/2.6/akka/cluster/client/ClusterClientReceptionist.html "akka.cluster.client.ClusterClientReceptionist")[`ClusterClientReceptionist`](https://doc.akka.io/japi/akka-core/2.6/akka/cluster/client/ClusterClientReceptionist.html "akka.cluster.client.ClusterClientReceptionist") uses the [`DistributedPubSub`](https://doc.akka.io/api/akka-core/2.6/akka/cluster/pubsub/DistributedPubSub.html "akka.cluster.pubsub.DistributedPubSub")[`DistributedPubSub`](https://doc.akka.io/japi/akka-core/2.6/akka/cluster/pubsub/DistributedPubSub.html "akka.cluster.pubsub.DistributedPubSub") extension, which is described in [Distributed Publish Subscribe in Cluster](distributed-pub-sub.html).

It is recommended to load the extension when the actor system is started by defining it in the `akka.extensions` configuration property:

```
akka.extensions = ["akka.cluster.client.ClusterClientReceptionist"]

```

## Events

As mentioned earlier, both the [`ClusterClient`](https://doc.akka.io/api/akka-core/2.6/akka/cluster/client/ClusterClient.html "akka.cluster.client.ClusterClient")[`ClusterClient`](https://doc.akka.io/japi/akka-core/2.6/akka/cluster/client/ClusterClient.html "akka.cluster.client.ClusterClient") and [`ClusterClientReceptionist`](https://doc.akka.io/api/akka-core/2.6/akka/cluster/client/ClusterClientReceptionist.html "akka.cluster.client.ClusterClientReceptionist")[`ClusterClientReceptionist`](https://doc.akka.io/japi/akka-core/2.6/akka/cluster/client/ClusterClientReceptionist.html "akka.cluster.client.ClusterClientReceptionist") emit events that can be subscribed to. The following code snippet declares an actor that will receive notifications on contact points (addresses to the available receptionists), as they become available. The code illustrates subscribing to the events and receiving the [`ClusterClient`](https://doc.akka.io/api/akka-core/2.6/akka/cluster/client/ClusterClient.html "akka.cluster.client.ClusterClient")[`ClusterClient`](https://doc.akka.io/japi/akka-core/2.6/akka/cluster/client/ClusterClient.html "akka.cluster.client.ClusterClient") initial state.

Scala

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-cluster-tools/src/multi-jvm/scala/akka/cluster/client/ClusterClientSpec.scala#L78-L96 "Go to snippet source")class ClientListener(targetClient: ActorRef) extends Actor {
  override def preStart(): Unit =
    targetClient ! SubscribeContactPoints

  def receive: Receive =
    receiveWithContactPoints(Set.empty)

  def receiveWithContactPoints(contactPoints: Set[ActorPath]): Receive = {
    case ContactPoints(cps) =>
      context.become(receiveWithContactPoints(cps))
    // Now do something with the up-to-date "cps"
    case ContactPointAdded(cp) =>
      context.become(receiveWithContactPoints(contactPoints + cp))
    // Now do something with an up-to-date "contactPoints + cp"
    case ContactPointRemoved(cp) =>
      context.become(receiveWithContactPoints(contactPoints - cp))
    // Now do something with an up-to-date "contactPoints - cp"
  }
}
```

Java

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-cluster-tools/src/test/java/akka/cluster/client/ClusterClientTest.java#L72-L108 "Go to snippet source")public static class ClientListener extends AbstractActor {
  private final ActorRef targetClient;
  private final Set<ActorPath> contactPoints = new HashSet<>();

  public ClientListener(ActorRef targetClient) {
    this.targetClient = targetClient;
  }

  @Override
  public void preStart() {
    targetClient.tell(SubscribeContactPoints.getInstance(), sender());
  }

  @Override
  public Receive createReceive() {
    return receiveBuilder()
        .match(
            ContactPoints.class,
            msg -> {
              contactPoints.addAll(msg.getContactPoints());
              // Now do something with an up-to-date "contactPoints"
            })
        .match(
            ContactPointAdded.class,
            msg -> {
              contactPoints.add(msg.contactPoint());
              // Now do something with an up-to-date "contactPoints"
            })
        .match(
            ContactPointRemoved.class,
            msg -> {
              contactPoints.remove(msg.contactPoint());
              // Now do something with an up-to-date "contactPoints"
            })
        .build();
  }
}
```

Similarly we can have an actor that behaves in a similar fashion for learning what cluster clients are connected to a [`ClusterClientReceptionist`](https://doc.akka.io/api/akka-core/2.6/akka/cluster/client/ClusterClientReceptionist.html "akka.cluster.client.ClusterClientReceptionist")[`ClusterClientReceptionist`](https://doc.akka.io/japi/akka-core/2.6/akka/cluster/client/ClusterClientReceptionist.html "akka.cluster.client.ClusterClientReceptionist"):

Scala

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-cluster-tools/src/multi-jvm/scala/akka/cluster/client/ClusterClientSpec.scala#L117-L135 "Go to snippet source")class ReceptionistListener(targetReceptionist: ActorRef) extends Actor {
  override def preStart(): Unit =
    targetReceptionist ! SubscribeClusterClients

  def receive: Receive =
    receiveWithClusterClients(Set.empty)

  def receiveWithClusterClients(clusterClients: Set[ActorRef]): Receive = {
    case ClusterClients(cs) =>
      context.become(receiveWithClusterClients(cs))
    // Now do something with the up-to-date "c"
    case ClusterClientUp(c) =>
      context.become(receiveWithClusterClients(clusterClients + c))
    // Now do something with an up-to-date "clusterClients + c"
    case ClusterClientUnreachable(c) =>
      context.become(receiveWithClusterClients(clusterClients - c))
    // Now do something with an up-to-date "clusterClients - c"
  }
}
```

Java

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-cluster-tools/src/test/java/akka/cluster/client/ClusterClientTest.java#L112-L148 "Go to snippet source")public static class ReceptionistListener extends AbstractActor {
  private final ActorRef targetReceptionist;
  private final Set<ActorRef> clusterClients = new HashSet<>();

  public ReceptionistListener(ActorRef targetReceptionist) {
    this.targetReceptionist = targetReceptionist;
  }

  @Override
  public void preStart() {
    targetReceptionist.tell(SubscribeClusterClients.getInstance(), sender());
  }

  @Override
  public Receive createReceive() {
    return receiveBuilder()
        .match(
            ClusterClients.class,
            msg -> {
              clusterClients.addAll(msg.getClusterClients());
              // Now do something with an up-to-date "clusterClients"
            })
        .match(
            ClusterClientUp.class,
            msg -> {
              clusterClients.add(msg.clusterClient());
              // Now do something with an up-to-date "clusterClients"
            })
        .match(
            ClusterClientUnreachable.class,
            msg -> {
              clusterClients.remove(msg.clusterClient());
              // Now do something with an up-to-date "clusterClients"
            })
        .build();
  }
}
```

## Configuration

The [`ClusterClientReceptionist`](https://doc.akka.io/api/akka-core/2.6/akka/cluster/client/ClusterClientReceptionist.html "akka.cluster.client.ClusterClientReceptionist")[`ClusterClientReceptionist`](https://doc.akka.io/japi/akka-core/2.6/akka/cluster/client/ClusterClientReceptionist.html "akka.cluster.client.ClusterClientReceptionist") extension (or [`ClusterReceptionistSettings`](https://doc.akka.io/api/akka-core/2.6/akka/cluster/client/ClusterReceptionistSettings.html "akka.cluster.client.ClusterReceptionistSettings")[`ClusterReceptionistSettings`](https://doc.akka.io/japi/akka-core/2.6/akka/cluster/client/ClusterReceptionistSettings.html "akka.cluster.client.ClusterReceptionistSettings")) can be configured with the following properties:

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-cluster-tools/src/main/resources/reference.conf#L57-L91 "Go to snippet source")# Settings for the ClusterClientReceptionist extension
akka.cluster.client.receptionist {
  # Actor name of the ClusterReceptionist actor, /system/receptionist
  name = receptionist

  # Start the receptionist on members tagged with this role.
  # All members are used if undefined or empty.
  role = ""

  # The receptionist will send this number of contact points to the client
  number-of-contacts = 3

  # The actor that tunnel response messages to the client will be stopped
  # after this time of inactivity.
  response-tunnel-receive-timeout = 30s
  
  # The id of the dispatcher to use for ClusterReceptionist actors.
  # If specified you need to define the settings of the actual dispatcher.
  use-dispatcher = "akka.actor.internal-dispatcher"

  # How often failure detection heartbeat messages should be received for
  # each ClusterClient
  heartbeat-interval = 2s

  # Number of potentially lost/delayed heartbeats that will be
  # accepted before considering it to be an anomaly.
  # The ClusterReceptionist is using the akka.remote.DeadlineFailureDetector, which
  # will trigger if there are no heartbeats within the duration
  # heartbeat-interval + acceptable-heartbeat-pause, i.e. 15 seconds with
  # the default settings.
  acceptable-heartbeat-pause = 13s

  # Failure detection checking interval for checking all ClusterClients
  failure-detection-interval = 2s
}
```

The following configuration properties are read by the [`ClusterClientSettings`](https://doc.akka.io/api/akka-core/2.6/akka/cluster/client/ClusterClientSettings.html "akka.cluster.client.ClusterClientSettings")[`ClusterClientSettings`](https://doc.akka.io/japi/akka-core/2.6/akka/cluster/client/ClusterClientSettings.html "akka.cluster.client.ClusterClientSettings") when created with a [``ActorSystem``](https://doc.akka.io/api/akka-core/2.6/akka/actor/ActorSystem.html "akka.actor.ActorSystem")[``ActorSystem``](https://doc.akka.io/japi/akka-core/2.6/akka/actor/ActorSystem.html "akka.actor.ActorSystem") parameter. It is also possible to amend the [`ClusterClientSettings`](https://doc.akka.io/api/akka-core/2.6/akka/cluster/client/ClusterClientSettings.html "akka.cluster.client.ClusterClientSettings")[`ClusterClientSettings`](https://doc.akka.io/japi/akka-core/2.6/akka/cluster/client/ClusterClientSettings.html "akka.cluster.client.ClusterClientSettings") or create it from another config section with the same layout as below. [`ClusterClientSettings`](https://doc.akka.io/api/akka-core/2.6/akka/cluster/client/ClusterClientSettings.html "akka.cluster.client.ClusterClientSettings")[`ClusterClientSettings`](https://doc.akka.io/japi/akka-core/2.6/akka/cluster/client/ClusterClientSettings.html "akka.cluster.client.ClusterClientSettings") is a parameter to the [``ClusterClient.props``](https://doc.akka.io/api/akka-core/2.6/akka/cluster/client/ClusterClient$.html "akka.cluster.client.ClusterClient")[``ClusterClient.props``](https://doc.akka.io/japi/akka-core/2.6/akka/cluster/client/ClusterClient$.html "akka.cluster.client.ClusterClient") factory method, i.e. each client can be configured with different settings if needed.

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-cluster-tools/src/main/resources/reference.conf#L95-L139 "Go to snippet source")# Settings for the ClusterClient
akka.cluster.client {
  # Actor paths of the ClusterReceptionist actors on the servers (cluster nodes)
  # that the client will try to contact initially. It is mandatory to specify
  # at least one initial contact. 
  # Comma separated full actor paths defined by a string on the form of
  # "akka://system@hostname:port/system/receptionist"
  initial-contacts = []
  
  # Interval at which the client retries to establish contact with one of 
  # ClusterReceptionist on the servers (cluster nodes)
  establishing-get-contacts-interval = 3s
  
  # Interval at which the client will ask the ClusterReceptionist for
  # new contact points to be used for next reconnect.
  refresh-contacts-interval = 60s
  
  # How often failure detection heartbeat messages should be sent
  heartbeat-interval = 2s
  
  # Number of potentially lost/delayed heartbeats that will be
  # accepted before considering it to be an anomaly.
  # The ClusterClient is using the akka.remote.DeadlineFailureDetector, which
  # will trigger if there are no heartbeats within the duration 
  # heartbeat-interval + acceptable-heartbeat-pause, i.e. 15 seconds with
  # the default settings.
  acceptable-heartbeat-pause = 13s
  
  # If connection to the receptionist is not established the client will buffer
  # this number of messages and deliver them the connection is established.
  # When the buffer is full old messages will be dropped when new messages are sent
  # via the client. Use 0 to disable buffering, i.e. messages will be dropped
  # immediately if the location of the singleton is unknown.
  # Maximum allowed buffer size is 10000.
  buffer-size = 1000

  # If connection to the receiptionist is lost and the client has not been
  # able to acquire a new connection for this long the client will stop itself.
  # This duration makes it possible to watch the cluster client and react on a more permanent
  # loss of connection with the cluster, for example by accessing some kind of
  # service registry for an updated set of initial contacts to start a new cluster client with.
  # If this is not wanted it can be set to "off" to disable the timeout and retry
  # forever.
  reconnect-timeout = off
}
```

## Failure handling

When the cluster client is started it must be provided with a list of initial contacts which are cluster nodes where receptionists are running. It will then repeatedly (with an interval configurable by `establishing-get-contacts-interval`) try to contact those until it gets in contact with one of them. While running, the list of contacts is continuously updated with data from the receptionists (again, with an interval configurable with `refresh-contacts-interval`), so that if there are more receptionists in the cluster than the initial contacts provided to the client will learn about them.

While the client is running it will detect failures in its connection to the receptionist by heartbeats if more than a configurable amount of heartbeats are missed the client will try to reconnect to its known set of contacts to find a receptionist it can access.

## When the cluster cannot be reached at all

It is possible to make the cluster client stop entirely if it cannot find a receptionist it can talk to within a configurable interval. This is configured with the `reconnect-timeout`, which defaults to `off`. This can be useful when initial contacts are provided from some kind of service registry, cluster node addresses are entirely dynamic and the entire cluster might shut down or crash, be restarted on new addresses. Since the client will be stopped in that case a monitoring actor can watch it and upon `Terminate` a new set of initial contacts can be fetched and a new cluster client started.

## Migration to Akka gRPC

Cluster Client is deprecated and it is not advised to build new applications with it. As a replacement, we recommend using [Akka gRPC](https://doc.akka.io/libraries/akka-grpc/current/) with an application\-specific protocol. The benefits of this approach are:

- Improved security by using TLS for gRPC (HTTP/2\) versus exposing Akka Remoting outside the Akka Cluster
- Easier to update clients and servers independent of each other
- Improved protocol definition between client and server
- Usage of [Akka gRPC Service Discovery](https://doc.akka.io/libraries/akka-grpc/current/client/configuration.html#using-akka-discovery-for-endpoint-discovery)
- Clients do not need to use Akka
- See also [gRPC versus Akka Remoting](https://doc.akka.io/libraries/akka-grpc/current/whygrpc.html#grpc-vs-akka-remoting)

### Migrating directly

Existing users of Cluster Client may migrate directly to Akka gRPC and use it as documented in [its documentation](https://doc.akka.io/libraries/akka-grpc/current/).

### Migrating gradually

If your application extensively uses Cluster Client, a more gradual migration might be desired that requires less re\-write of the application. That migration step is described in this section. We recommend migration directly if feasible, though.

An example is provided to illustrate an approach to migrate from the deprecated Cluster Client to Akka gRPC, with minimal changes to your existing code. The example is intended to be copied and adjusted to your needs. It will not be provided as a published artifact.

- [akka\-samples/akka\-sample\-cluster\-cluster\-client\-grpc\-scala](https://github.com/akka/akka-samples/tree/2.6/akka-sample-cluster-client-grpc-scala) implemented in Scala
- [akka\-samples/akka\-sample\-cluster\-cluster\-client\-grpc\-java](https://github.com/akka/akka-samples/tree/2.6/akka-sample-cluster-client-grpc-java) implemented in Java

The example is still using an actor on the client\-side to have an API that is very close to the original Cluster Client. The messages this actor can handle correspond to the [Distributed Pub Sub](distributed-pub-sub.html) messages on the server\-side, such as `ClusterClient.Send` and `ClusterClient.Publish`.

The `ClusterClient` actor delegates those messages to the gRPC client, and on the server\-side those are translated and delegated to the destination actors that are registered via the `ClusterClientReceptionist` in the same way as in the original.

Akka gRPC is used as the transport for the messages between client and server, instead of Akka Remoting.

The application specific messages are wrapped and serialized with Akka Serialization, which means that care must be taken to keep wire compatibility when changing any messages used between the client and server. The Akka configuration of Akka serializers must be the same (or being compatible) on the client and the server.

#### Next steps

After this first migration step from Cluster Client to Akka gRPC, you can start replacing calls to `ClusterClientReceptionistService` with new, application\-specific gRPC endpoints.

#### Differences

Aside from the underlying implementation using gRPC instead of Actor messages and Akka Remoting it’s worth pointing out the following differences between the Cluster Client and the example emulating Cluster Client with Akka gRPC as transport.

##### Single request\-reply

For request\-reply interactions when there is only one reply message for each request it is more efficient to use the `ClusterClient.AskSend` message instead of `ClusterClient.Send` as illustrated in the example. Then it doesn’t have to setup a full bidirectional gRPC stream for each request but can use the `Future``CompletionStage` based API.

##### Initial contact points

Instead of configured initial contact points the [Akka gRPC Service Discovery](https://doc.akka.io/libraries/akka-grpc/current/client/configuration.html#using-akka-discovery-for-endpoint-discovery) can be used.

##### Failure detection

Heartbeat messages and failure detection of the connections have been removed since that should be handled by the gRPC connections.

## Code Examples

### Example 1: Module info

```scala
val AkkaVersion = "2.6.21"
libraryDependencies += "com.typesafe.akka" %% "akka-cluster-tools" % AkkaVersion
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
    <artifactId>akka-cluster-tools_${scala.binary.version}</artifactId>
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

  implementation "com.typesafe.akka:akka-cluster-tools_${versions.ScalaBinary}"
}
```

### Example 4: An Example

```text
akka.extensions = ["akka.cluster.client.ClusterClientReceptionist"]
```

### Example 5: An Example

```scala
runOn(host1) {
  val serviceA = system.actorOf(Props[Service](), "serviceA")
  ClusterClientReceptionist(system).registerService(serviceA)
}

runOn(host2, host3) {
  val serviceB = system.actorOf(Props[Service](), "serviceB")
  ClusterClientReceptionist(system).registerService(serviceB)
}
```

### Example 6: An Example

```java
ActorRef serviceA = system.actorOf(Props.create(Service.class), "serviceA");
ClusterClientReceptionist.get(system).registerService(serviceA);

ActorRef serviceB = system.actorOf(Props.create(Service.class), "serviceB");
ClusterClientReceptionist.get(system).registerService(serviceB);
```

### Example 7: An Example

```scala
runOn(client) {
  val c = system.actorOf(
    ClusterClient.props(ClusterClientSettings(system).withInitialContacts(initialContacts)),
    "client")
  c ! ClusterClient.Send("/user/serviceA", "hello", localAffinity = true)
  c ! ClusterClient.SendToAll("/user/serviceB", "hi")
}
```

### Example 8: An Example

```java
final ActorRef c =
    system.actorOf(
        ClusterClient.props(
            ClusterClientSettings.create(system).withInitialContacts(initialContacts())),
        "client");
c.tell(new ClusterClient.Send("/user/serviceA", "hello", true), ActorRef.noSender());
c.tell(new ClusterClient.SendToAll("/user/serviceB", "hi"), ActorRef.noSender());
```

### Example 9: An Example

```scala
val initialContacts = Set(
  ActorPath.fromString("akka://OtherSys@host1:2552/system/receptionist"),
  ActorPath.fromString("akka://OtherSys@host2:2552/system/receptionist"))
val settings = ClusterClientSettings(system).withInitialContacts(initialContacts)
```

### Example 10: An Example

```java
Set<ActorPath> initialContacts() {
  return new HashSet<ActorPath>(
      Arrays.asList(
          ActorPaths.fromString("akka://OtherSys@host1:2552/system/receptionist"),
          ActorPaths.fromString("akka://OtherSys@host2:2552/system/receptionist")));
}
```

### Example 11: ClusterClientReceptionist Extension

```text
akka.extensions = ["akka.cluster.client.ClusterClientReceptionist"]
```

### Example 12: Events

```scala
class ClientListener(targetClient: ActorRef) extends Actor {
  override def preStart(): Unit =
    targetClient ! SubscribeContactPoints

  def receive: Receive =
    receiveWithContactPoints(Set.empty)

  def receiveWithContactPoints(contactPoints: Set[ActorPath]): Receive = {
    case ContactPoints(cps) =>
      context.become(receiveWithContactPoints(cps))
    // Now do something with the up-to-date "cps"
    case ContactPointAdded(cp) =>
      context.become(receiveWithContactPoints(contactPoints + cp))
    // Now do something with an up-to-date "contactPoints + cp"
    case ContactPointRemoved(cp) =>
      context.become(receiveWithContactPoints(contactPoints - cp))
    // Now do something with an up-to-date "contactPoints - cp"
  }
}
```

### Example 13: Events

```java
public static class ClientListener extends AbstractActor {
  private final ActorRef targetClient;
  private final Set<ActorPath> contactPoints = new HashSet<>();

  public ClientListener(ActorRef targetClient) {
    this.targetClient = targetClient;
  }

  @Override
  public void preStart() {
    targetClient.tell(SubscribeContactPoints.getInstance(), sender());
  }

  @Override
  public Receive createReceive() {
    return receiveBuilder()
        .match(
            ContactPoints.class,
            msg -> {
              contactPoints.addAll(msg.getContactPoints());
              // Now do something with an up-to-date "contactPoints"
            })
        .match(
            ContactPointAdded.class,
            msg -> {
              contactPoints.add(msg.contactPoint());
              // Now do something with an up-to-date "contactPoints"
            })
        .match(
            ContactPointRemoved.class,
            msg -> {
              contactPoints.remove(msg.contactPoint());
              // Now do something with an up-to-date "contactPoints"
            })
        .build();
  }
}
```

### Example 14: Events

```scala
class ReceptionistListener(targetReceptionist: ActorRef) extends Actor {
  override def preStart(): Unit =
    targetReceptionist ! SubscribeClusterClients

  def receive: Receive =
    receiveWithClusterClients(Set.empty)

  def receiveWithClusterClients(clusterClients: Set[ActorRef]): Receive = {
    case ClusterClients(cs) =>
      context.become(receiveWithClusterClients(cs))
    // Now do something with the up-to-date "c"
    case ClusterClientUp(c) =>
      context.become(receiveWithClusterClients(clusterClients + c))
    // Now do something with an up-to-date "clusterClients + c"
    case ClusterClientUnreachable(c) =>
      context.become(receiveWithClusterClients(clusterClients - c))
    // Now do something with an up-to-date "clusterClients - c"
  }
}
```

### Example 15: Events

```java
public static class ReceptionistListener extends AbstractActor {
  private final ActorRef targetReceptionist;
  private final Set<ActorRef> clusterClients = new HashSet<>();

  public ReceptionistListener(ActorRef targetReceptionist) {
    this.targetReceptionist = targetReceptionist;
  }

  @Override
  public void preStart() {
    targetReceptionist.tell(SubscribeClusterClients.getInstance(), sender());
  }

  @Override
  public Receive createReceive() {
    return receiveBuilder()
        .match(
            ClusterClients.class,
            msg -> {
              clusterClients.addAll(msg.getClusterClients());
              // Now do something with an up-to-date "clusterClients"
            })
        .match(
            ClusterClientUp.class,
            msg -> {
              clusterClients.add(msg.clusterClient());
              // Now do something with an up-to-date "clusterClients"
            })
        .match(
            ClusterClientUnreachable.class,
            msg -> {
              clusterClients.remove(msg.clusterClient());
              // Now do something with an up-to-date "clusterClients"
            })
        .build();
  }
}
```

### Example 16: Configuration

```conf
# Settings for the ClusterClientReceptionist extension
akka.cluster.client.receptionist {
  # Actor name of the ClusterReceptionist actor, /system/receptionist
  name = receptionist

  # Start the receptionist on members tagged with this role.
  # All members are used if undefined or empty.
  role = ""

  # The receptionist will send this number of contact points to the client
  number-of-contacts = 3

  # The actor that tunnel response messages to the client will be stopped
  # after this time of inactivity.
  response-tunnel-receive-timeout = 30s
  
  # The id of the dispatcher to use for ClusterReceptionist actors.
  # If specified you need to define the settings of the actual dispatcher.
  use-dispatcher = "akka.actor.internal-dispatcher"

  # How often failure detection heartbeat messages should be received for
  # each ClusterClient
  heartbeat-interval = 2s

  # Number of potentially lost/delayed heartbeats that will be
  # accepted before considering it to be an anomaly.
  # The ClusterReceptionist is using the akka.remote.DeadlineFailureDetector, which
  # will trigger if there are no heartbeats within the duration
  # heartbeat-interval + acceptable-heartbeat-pause, i.e. 15 seconds with
  # the default settings.
  acceptable-heartbeat-pause = 13s

  # Failure detection checking interval for checking all ClusterClients
  failure-detection-interval = 2s
}
```

### Example 17: Configuration

```conf
# Settings for the ClusterClient
akka.cluster.client {
  # Actor paths of the ClusterReceptionist actors on the servers (cluster nodes)
  # that the client will try to contact initially. It is mandatory to specify
  # at least one initial contact. 
  # Comma separated full actor paths defined by a string on the form of
  # "akka://system@hostname:port/system/receptionist"
  initial-contacts = []
  
  # Interval at which the client retries to establish contact with one of 
  # ClusterReceptionist on the servers (cluster nodes)
  establishing-get-contacts-interval = 3s
  
  # Interval at which the client will ask the ClusterReceptionist for
  # new contact points to be used for next reconnect.
  refresh-contacts-interval = 60s
  
  # How often failure detection heartbeat messages should be sent
  heartbeat-interval = 2s
  
  # Number of potentially lost/delayed heartbeats that will be
  # accepted before considering it to be an anomaly.
  # The ClusterClient is using the akka.remote.DeadlineFailureDetector, which
  # will trigger if there are no heartbeats within the duration 
  # heartbeat-interval + acceptable-heartbeat-pause, i.e. 15 seconds with
  # the default settings.
  acceptable-heartbeat-pause = 13s
  
  # If connection to the receptionist is not established the client will buffer
  # this number of messages and deliver them the connection is established.
  # When the buffer is full old messages will be dropped when new messages are sent
  # via the client. Use 0 to disable buffering, i.e. messages will be dropped
  # immediately if the location of the singleton is unknown.
  # Maximum allowed buffer size is 10000.
  buffer-size = 1000

  # If connection to the receiptionist is lost and the client has not been
  # able to acquire a new connection for this long the client will stop itself.
  # This duration makes it possible to watch the cluster client and react on a more permanent
  # loss of connection with the cluster, for example by accessing some kind of
  # service registry for an updated set of initial contacts to start a new cluster client with.
  # If this is not wanted it can be set to "off" to disable the timeout and retry
  # forever.
  reconnect-timeout = off
}
```

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.6.21/akka/cluster/tools/index.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/Actor.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/ActorSystem.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/client/ClusterClient$.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/client/ClusterClient.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/client/ClusterClientReceptionist.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/client/ClusterClientSettings.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/client/ClusterReceptionist.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/client/ClusterReceptionistSettings.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/pubsub/DistributedPubSub.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/pubsub/DistributedPubSubMediator.html
- https://doc.akka.io/japi/akka-core/2.6.21/akka/cluster/tools/package-summary.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/Actor.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/ActorSystem.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/client/ClusterClient$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/client/ClusterClient.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/client/ClusterClientReceptionist.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/client/ClusterClientSettings.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/client/ClusterReceptionist.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/client/ClusterReceptionistSettings.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/pubsub/DistributedPubSub.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/pubsub/DistributedPubSubMediator.html
- https://doc.akka.io/libraries/akka-core/2.6/cluster-client.html
- https://doc.akka.io/libraries/akka-core/2.6/cluster-sharding.html
- https://doc.akka.io/libraries/akka-core/2.6/distributed-pub-sub.html
- https://doc.akka.io/libraries/akka-core/2.6/project/links.html
- https://doc.akka.io/libraries/akka-core/2.6/typed/actors.html
- https://doc.akka.io/libraries/akka-core/2.6/typed/coexisting.html
- https://doc.akka.io/libraries/akka-grpc/current/
- https://doc.akka.io/libraries/akka-grpc/current/client/configuration.html
- https://doc.akka.io/libraries/akka-grpc/current/index.html
- https://doc.akka.io/libraries/akka-grpc/current/whygrpc.html
- https://doc.akka.io/libraries/akka-http/current/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/2.6/cluster-client.html](https://doc.akka.io/libraries/akka-core/2.6/cluster-client.html)*