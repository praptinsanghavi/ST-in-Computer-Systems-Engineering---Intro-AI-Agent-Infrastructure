---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:12:45Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/distributed-pub-sub.html
title: Classic Distributed Publish Subscribe in Cluster • Akka core
---

# Classic Distributed Publish Subscribe in Cluster • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Classic Distributed Publish Subscribe in Cluster

Note
Akka Classic pertains to the original Actor APIs, which have been improved by more type safe and guided Actor APIs. Akka Classic is still fully supported and existing applications can continue to use the classic APIs. It is also possible to use the new Actor APIs together with classic actors in the same ActorSystem, see [coexistence](typed/coexisting.html). For new projects we recommend using [the new Actor API](typed/actors.html).

For the new API see [Distributed Publish Subscribe in Cluster](typed/distributed-pub-sub.html) 

## Module info

Note
The Akka dependencies are available from Akka’s secure library repository. To access them you need to use a secure, tokenized URL as specified at <https://account.akka.io/token>.

To use Distributed Publish Subscribe you must add the following dependency in your project:

sbt
```
val AkkaVersion = "2.10.17"
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
      <version>2.10.17</version>
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
  implementation platform("com.typesafe.akka:akka-bom_${versions.ScalaBinary}:2.10.17")

  implementation "com.typesafe.akka:akka-cluster-tools_${versions.ScalaBinary}"
}
```

| Project Info: Akka Cluster Tools (classic) | |
| --- | --- |
| Artifact | com.typesafe.akka akka\-cluster\-tools 2\.10\.17 [Snapshots are available](project/links.html#snapshots-repository) |
| JDK versions | Eclipse Temurin JDK 11Eclipse Temurin JDK 17Eclipse Temurin JDK 21 |
| Scala versions | 2\.13\.17, 3\.3\.7 |
| JPMS module name | akka.cluster.tools |
| License | [BUSL\-1\.1](https://raw.githubusercontent.com/akka/akka-core/v2.10.17/LICENSE) |
| Readiness level | [Supported](https://doc.akka.io/docs/akka-dependencies/current/support-terminology.html#supported), support is available from [Lightbend](https://www.lightbend.com/akka) Since 2\.3\.0, 2014\-03\-05 |
| Home page | <https://akka.io/> |
| API documentation | [API (Scaladoc)](https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/index.html) [API (Javadoc)](https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/package-summary.html) |
| Forums | [Akka Discuss](https://discuss.akka.io) |
| Release notes | [Akka release notes](https://doc.akka.io/reference/release-notes.html) |
| Issues | [Github issues](https://github.com/akka/akka-core/issues) |
| Sources | [https://github.com/akka/akka\-core](https://github.com/akka/akka-core) |

## Introduction

How do I send a message to an actor without knowing which node it is running on?

How do I send messages to all actors in the cluster that have registered interest in a named topic?

This pattern provides a mediator actor, [`akka.cluster.pubsub.DistributedPubSubMediator`](https://doc.akka.io/api/akka-core/2.10/akka/cluster/pubsub/DistributedPubSubMediator.html "akka.cluster.pubsub.DistributedPubSubMediator")[`akka.cluster.pubsub.DistributedPubSubMediator`](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/pubsub/DistributedPubSubMediator.html "akka.cluster.pubsub.DistributedPubSubMediator"), that manages a registry of actor references and replicates the entries to peer actors among all cluster nodes or a group of nodes tagged with a specific role.

The `DistributedPubSubMediator` actor is supposed to be started on all nodes, or all nodes with specified role, in the cluster. The mediator can be started with the [`DistributedPubSub`](https://doc.akka.io/api/akka-core/2.10/akka/cluster/pubsub/DistributedPubSub.html "akka.cluster.pubsub.DistributedPubSub")[`DistributedPubSub`](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/pubsub/DistributedPubSub.html "akka.cluster.pubsub.DistributedPubSub") extension or as an ordinary actor.

The registry is eventually consistent, i.e. changes are not immediately visible at other nodes, but typically they will be fully replicated to all other nodes after a few seconds. Changes are only performed in the own part of the registry and those changes are versioned. Deltas are disseminated in a scalable way to other nodes with a gossip protocol.

Cluster members with status [WeaklyUp](typed/cluster-membership.html#weakly-up), will participate in Distributed Publish Subscribe, i.e. subscribers on nodes with `WeaklyUp` status will receive published messages if the publisher and subscriber are on same side of a network partition.

You can send messages via the mediator on any node to registered actors on any other node.

There a two different modes of message delivery, explained in the sections [Publish](distributed-pub-sub.html#distributed-pub-sub-publish) and [Send](distributed-pub-sub.html#distributed-pub-sub-send) below.

A more comprehensive sample is available in the tutorial named [Akka Clustered PubSub with Scala!](https://github.com/typesafehub/activator-akka-clustering).

## Publish

This is the true pub/sub mode. A typical usage of this mode is a chat room in an instant messaging application.

Actors are registered to a named topic. This enables many subscribers on each node. The message will be delivered to all subscribers of the topic.

For efficiency the message is sent over the wire only once per node (that has a matching topic), and then delivered to all subscribers of the local topic representation.

You register actors to the local mediator with `DistributedPubSubMediator.Subscribe`. Successful [`DistributedPubSubMediator.Subscribe`](https://doc.akka.io/api/akka-core/2.10/akka/cluster/pubsub/DistributedPubSubMediator$$Subscribe.html "akka.cluster.pubsub.DistributedPubSubMediator.Subscribe")[`DistributedPubSubMediator.Subscribe`](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/pubsub/DistributedPubSubMediator.Subscribe.html "akka.cluster.pubsub.DistributedPubSubMediator.Subscribe") and [`DistributedPubSubMediator.Unsubscribe`](https://doc.akka.io/api/akka-core/2.10/akka/cluster/pubsub/DistributedPubSubMediator$$Unsubscribe.html "akka.cluster.pubsub.DistributedPubSubMediator.Unsubscribe")[`DistributedPubSubMediator.Unsubscribe`](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/pubsub/DistributedPubSubMediator.Unsubscribe.html "akka.cluster.pubsub.DistributedPubSubMediator.Unsubscribe") is acknowledged with [`DistributedPubSubMediator.SubscribeAck`](https://doc.akka.io/api/akka-core/2.10/akka/cluster/pubsub/DistributedPubSubMediator$$SubscribeAck.html "akka.cluster.pubsub.DistributedPubSubMediator.SubscribeAck")[`DistributedPubSubMediator.SubscribeAck`](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/pubsub/DistributedPubSubMediator.SubscribeAck.html "akka.cluster.pubsub.DistributedPubSubMediator.SubscribeAck") and [`DistributedPubSubMediator.UnsubscribeAck`](https://doc.akka.io/api/akka-core/2.10/akka/cluster/pubsub/DistributedPubSubMediator$$UnsubscribeAck.html "akka.cluster.pubsub.DistributedPubSubMediator.UnsubscribeAck")[`DistributedPubSubMediator.UnsubscribeAck`](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/pubsub/DistributedPubSubMediator.UnsubscribeAck.html "akka.cluster.pubsub.DistributedPubSubMediator.UnsubscribeAck") replies. The acknowledgment means that the subscription is registered, but it can still take some time until it is replicated to other nodes.

You publish messages by sending [`DistributedPubSubMediator.Publish`](https://doc.akka.io/api/akka-core/2.10/akka/cluster/pubsub/DistributedPubSubMediator$$Publish.html "akka.cluster.pubsub.DistributedPubSubMediator.Publish")[`DistributedPubSubMediator.Publish`](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/pubsub/DistributedPubSubMediator.Publish.html "akka.cluster.pubsub.DistributedPubSubMediator.Publish") message to the local mediator.

Actors are automatically removed from the registry when they are terminated, or you can explicitly remove entries with `DistributedPubSubMediator.Unsubscribe`.

An example of a subscriber actor:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-tools/src/multi-jvm/scala/akka/cluster/pubsub/DistributedPubSubMediatorSpec.scala#L80-L92 "Go to snippet source")class Subscriber extends Actor with ActorLogging {
  import DistributedPubSubMediator.{ Subscribe, SubscribeAck }
  val mediator = DistributedPubSub(context.system).mediator
  // subscribe to the topic named "content"
  mediator ! Subscribe("content", self)

  def receive = {
    case s: String =>
      log.info("Got {}", s)
    case SubscribeAck(Subscribe("content", None, `self`)) =>
      log.info("subscribing")
  }
}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-tools/src/test/java/akka/cluster/pubsub/DistributedPubSubMediatorTest.java#L63-L80 "Go to snippet source")static class Subscriber extends AbstractActor {
  LoggingAdapter log = Logging.getLogger(getContext().system(), this);

  public Subscriber() {
    ActorRef mediator = DistributedPubSub.get(getContext().system()).mediator();
    // subscribe to the topic named "content"
    mediator.tell(new DistributedPubSubMediator.Subscribe("content", getSelf()), getSelf());
  }

  @Override
  public Receive createReceive() {
    return receiveBuilder()
        .match(String.class, msg -> log.info("Got: {}", msg))
        .match(DistributedPubSubMediator.SubscribeAck.class, msg -> log.info("subscribed"))
        .build();
  }
}

```

Subscriber actors can be started on several nodes in the cluster, and all will receive messages published to the “content” topic.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-tools/src/multi-jvm/scala/akka/cluster/pubsub/DistributedPubSubMediatorSpec.scala#L350-L356 "Go to snippet source")runOn(first) {
  system.actorOf(Props[Subscriber](), "subscriber1")
}
runOn(second) {
  system.actorOf(Props[Subscriber](), "subscriber2")
  system.actorOf(Props[Subscriber](), "subscriber3")
}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-tools/src/test/java/akka/cluster/pubsub/DistributedPubSubMediatorTest.java#L33-L36 "Go to snippet source")system.actorOf(Props.create(Subscriber.class), "subscriber1");
// another node
system.actorOf(Props.create(Subscriber.class), "subscriber2");
system.actorOf(Props.create(Subscriber.class), "subscriber3");
```

A simple actor that publishes to this “content” topic:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-tools/src/multi-jvm/scala/akka/cluster/pubsub/DistributedPubSubMediatorSpec.scala#L66-L76 "Go to snippet source")class Publisher extends Actor {
  import DistributedPubSubMediator.Publish
  // activate the extension
  val mediator = DistributedPubSub(context.system).mediator

  def receive = {
    case in: String =>
      val out = in.toUpperCase
      mediator ! Publish("content", out)
  }
}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-tools/src/test/java/akka/cluster/pubsub/DistributedPubSubMediatorTest.java#L84-L100 "Go to snippet source")static class Publisher extends AbstractActor {

  // activate the extension
  ActorRef mediator = DistributedPubSub.get(getContext().system()).mediator();

  @Override
  public Receive createReceive() {
    return receiveBuilder()
        .match(
            String.class,
            in -> {
              String out = in.toUpperCase();
              mediator.tell(new DistributedPubSubMediator.Publish("content", out), getSelf());
            })
        .build();
  }
}
```

It can publish messages to the topic from anywhere in the cluster:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-tools/src/multi-jvm/scala/akka/cluster/pubsub/DistributedPubSubMediatorSpec.scala#L360-L365 "Go to snippet source")runOn(third) {
  val publisher = system.actorOf(Props[Publisher](), "publisher")
  later()
  // after a while the subscriptions are replicated
  publisher ! "hello"
}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-tools/src/test/java/akka/cluster/pubsub/DistributedPubSubMediatorTest.java#L40-L43 "Go to snippet source")// somewhere else
ActorRef publisher = system.actorOf(Props.create(Publisher.class), "publisher");
// after a while the subscriptions are replicated
publisher.tell("hello", null);
```

### Topic Groups

Actors may also be subscribed to a named topic with a `group` id. If subscribing with a group id, each message published to a topic with the `sendOneMessageToEachGroup` flag set to `true` is delivered via the supplied [`RoutingLogic`](https://doc.akka.io/api/akka-core/2.10/akka/routing/RoutingLogic.html "akka.routing.RoutingLogic")[`RoutingLogic`](https://doc.akka.io/japi/akka-core/2.10/akka/routing/RoutingLogic.html "akka.routing.RoutingLogic") (default random) to one actor within each subscribing group.

If all the subscribed actors have the same group id, then this works just like [`DistributedPubSubMediator.Send`](https://doc.akka.io/api/akka-core/2.10/akka/cluster/pubsub/DistributedPubSubMediator$$Send.html "akka.cluster.pubsub.DistributedPubSubMediator.Send")[`DistributedPubSubMediator.Send`](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/pubsub/DistributedPubSubMediator.Send.html "akka.cluster.pubsub.DistributedPubSubMediator.Send") and each message is only delivered to one subscriber.

If all the subscribed actors have different group names, then this works like normal [`DistributedPubSubMediator.Publish`](https://doc.akka.io/api/akka-core/2.10/akka/cluster/pubsub/DistributedPubSubMediator$$Publish.html "akka.cluster.pubsub.DistributedPubSubMediator.Publish")[`DistributedPubSubMediator.Publish`](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/pubsub/DistributedPubSubMediator.Publish.html "akka.cluster.pubsub.DistributedPubSubMediator.Publish") and each message is broadcasted to all subscribers.

Note
Note that if the group id is used it is part of the topic identifier. Messages published with `sendOneMessageToEachGroup=false` will not be delivered to subscribers that subscribed with a group id. Messages published with `sendOneMessageToEachGroup=true` will not be delivered to subscribers that subscribed without a group id.

## Send

This is a point\-to\-point mode where each message is delivered to one destination, but you still do not have to know where the destination is located. A typical usage of this mode is private chat to one other user in an instant messaging application. It can also be used for distributing tasks to registered workers, like a cluster aware router where the routees dynamically can register themselves.

The message will be delivered to one recipient with a matching path, if any such exists in the registry. If several entries match the path because it has been registered on several nodes the message will be sent via the supplied [`RoutingLogic`](https://doc.akka.io/api/akka-core/2.10/akka/routing/RoutingLogic.html "akka.routing.RoutingLogic")[`RoutingLogic`](https://doc.akka.io/japi/akka-core/2.10/akka/routing/RoutingLogic.html "akka.routing.RoutingLogic") (default random) to one destination. The sender of the message can specify that local affinity is preferred, i.e. the message is sent to an actor in the same local actor system as the used mediator actor, if any such exists, otherwise route to any other matching entry.

You register actors to the local mediator with [`DistributedPubSubMediator.Put`](https://doc.akka.io/api/akka-core/2.10/akka/cluster/pubsub/DistributedPubSubMediator$$Put.html "akka.cluster.pubsub.DistributedPubSubMediator.Put")[`DistributedPubSubMediator.Put`](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/pubsub/DistributedPubSubMediator.Put.html "akka.cluster.pubsub.DistributedPubSubMediator.Put"). The [`ActorRef`](https://doc.akka.io/api/akka-core/2.10/akka/actor/ActorRef.html "akka.actor.ActorRef")[`ActorRef`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorRef.html "akka.actor.ActorRef") in `Put` must belong to the same local actor system as the mediator. The path without address information is the key to which you send messages. On each node there can only be one actor for a given path, since the path is unique within one local actor system.

You send messages by sending [`DistributedPubSubMediator.Send`](https://doc.akka.io/api/akka-core/2.10/akka/cluster/pubsub/DistributedPubSubMediator$$Send.html "akka.cluster.pubsub.DistributedPubSubMediator.Send")[`DistributedPubSubMediator.Send`](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/pubsub/DistributedPubSubMediator.Send.html "akka.cluster.pubsub.DistributedPubSubMediator.Send") message to the local mediator with the path (without address information) of the destination actors.

Actors are automatically removed from the registry when they are terminated, or you can explicitly remove entries with [`DistributedPubSubMediator.Remove`](https://doc.akka.io/api/akka-core/2.10/akka/cluster/pubsub/DistributedPubSubMediator$$Remove.html "akka.cluster.pubsub.DistributedPubSubMediator.Remove")[`DistributedPubSubMediator.Remove`](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/pubsub/DistributedPubSubMediator.Remove.html "akka.cluster.pubsub.DistributedPubSubMediator.Remove").

An example of a destination actor:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-tools/src/multi-jvm/scala/akka/cluster/pubsub/DistributedPubSubMediatorSpec.scala#L110-L120 "Go to snippet source")class Destination extends Actor with ActorLogging {
  import DistributedPubSubMediator.Put
  val mediator = DistributedPubSub(context.system).mediator
  // register to the path
  mediator ! Put(self)

  def receive = {
    case s: String =>
      log.info("Got {}", s)
  }
}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-tools/src/test/java/akka/cluster/pubsub/DistributedPubSubMediatorTest.java#L104-L118 "Go to snippet source")static class Destination extends AbstractActor {
  LoggingAdapter log = Logging.getLogger(getContext().system(), this);

  public Destination() {
    ActorRef mediator = DistributedPubSub.get(getContext().system()).mediator();
    // register to the path
    mediator.tell(new DistributedPubSubMediator.Put(getSelf()), getSelf());
  }

  @Override
  public Receive createReceive() {
    return receiveBuilder().match(String.class, msg -> log.info("Got: {}", msg)).build();
  }
}

```

Destination actors can be started on several nodes in the cluster, and all will receive messages sent to the path (without address information).

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-tools/src/multi-jvm/scala/akka/cluster/pubsub/DistributedPubSubMediatorSpec.scala#L377-L382 "Go to snippet source")runOn(first) {
  system.actorOf(Props[Destination](), "destination")
}
runOn(second) {
  system.actorOf(Props[Destination](), "destination")
}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-tools/src/test/java/akka/cluster/pubsub/DistributedPubSubMediatorTest.java#L49-L51 "Go to snippet source")system.actorOf(Props.create(Destination.class), "destination");
// another node
system.actorOf(Props.create(Destination.class), "destination");
```

A simple actor that sends to the path:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-tools/src/multi-jvm/scala/akka/cluster/pubsub/DistributedPubSubMediatorSpec.scala#L96-L106 "Go to snippet source")class Sender extends Actor {
  import DistributedPubSubMediator.Send
  // activate the extension
  val mediator = DistributedPubSub(context.system).mediator

  def receive = {
    case in: String =>
      val out = in.toUpperCase
      mediator ! Send(path = "/user/destination", msg = out, localAffinity = true)
  }
}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-tools/src/test/java/akka/cluster/pubsub/DistributedPubSubMediatorTest.java#L122-L141 "Go to snippet source")static class Sender extends AbstractActor {

  // activate the extension
  ActorRef mediator = DistributedPubSub.get(getContext().system()).mediator();

  @Override
  public Receive createReceive() {
    return receiveBuilder()
        .match(
            String.class,
            in -> {
              String out = in.toUpperCase();
              boolean localAffinity = true;
              mediator.tell(
                  new DistributedPubSubMediator.Send("/user/destination", out, localAffinity),
                  getSelf());
            })
        .build();
  }
}
```

It can send messages to the path from anywhere in the cluster:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-tools/src/multi-jvm/scala/akka/cluster/pubsub/DistributedPubSubMediatorSpec.scala#L386-L391 "Go to snippet source")runOn(third) {
  val sender = system.actorOf(Props[Sender](), "sender")
  later()
  // after a while the destinations are replicated
  sender ! "hello"
}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-tools/src/test/java/akka/cluster/pubsub/DistributedPubSubMediatorTest.java#L55-L58 "Go to snippet source")// somewhere else
ActorRef sender = system.actorOf(Props.create(Publisher.class), "sender");
// after a while the destinations are replicated
sender.tell("hello", null);
```

It is also possible to broadcast messages to the actors that have been registered with [`DistributedPubSubMediator.Put`](https://doc.akka.io/api/akka-core/2.10/akka/cluster/pubsub/DistributedPubSubMediator$$Put.html "akka.cluster.pubsub.DistributedPubSubMediator.Put")[`DistributedPubSubMediator.Put`](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/pubsub/DistributedPubSubMediator.Put.html "akka.cluster.pubsub.DistributedPubSubMediator.Put"). Send [`DistributedPubSubMediator.SendToAll`](https://doc.akka.io/api/akka-core/2.10/akka/cluster/pubsub/DistributedPubSubMediator$$SendToAll.html "akka.cluster.pubsub.DistributedPubSubMediator.SendToAll")[`DistributedPubSubMediator.SendToAll`](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/pubsub/DistributedPubSubMediator.SendToAll.html "akka.cluster.pubsub.DistributedPubSubMediator.SendToAll") message to the local mediator and the wrapped message will then be delivered to all recipients with a matching path. Actors with the same path, without address information, can be registered on different nodes. On each node there can only be one such actor, since the path is unique within one local actor system.

Typical usage of this mode is to broadcast messages to all replicas with the same path, e.g. 3 actors on different nodes that all perform the same actions, for redundancy. You can also optionally specify a property (`allButSelf`) deciding if the message should be sent to a matching path on the self node or not.

## DistributedPubSub Extension

In the example above the mediator is started and accessed with the [`akka.cluster.pubsub.DistributedPubSub`](https://doc.akka.io/api/akka-core/2.10/akka/cluster/pubsub/DistributedPubSub.html "akka.cluster.pubsub.DistributedPubSub")[`akka.cluster.pubsub.DistributedPubSub`](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/pubsub/DistributedPubSub.html "akka.cluster.pubsub.DistributedPubSub") extension. That is convenient and perfectly fine in most cases, but it can be good to know that it is possible to start the mediator actor as an ordinary actor and you can have several different mediators at the same time to be able to divide a large number of actors/topics to different mediators. For example you might want to use different cluster roles for different mediators.

The `DistributedPubSub` extension can be configured with the following properties:

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-tools/src/main/resources/reference.conf#L9-L38 "Go to snippet source")# Settings for the DistributedPubSub extension
akka.cluster.pub-sub {
  # Actor name of the mediator actor, /system/distributedPubSubMediator
  name = distributedPubSubMediator

  # Start the mediator on members tagged with this role.
  # All members are used if undefined or empty.
  role = ""

  # The routing logic to use for 'Send'
  # Possible values: random, round-robin, broadcast
  routing-logic = random

  # How often the DistributedPubSubMediator should send out gossip information
  gossip-interval = 1s

  # Removed entries are pruned after this duration
  removed-time-to-live = 120s

  # Maximum number of elements to transfer in one message when synchronizing the registries.
  # Next chunk will be transferred in next round of gossip.
  max-delta-elements = 3000

  # When a message is published to a topic with no subscribers send it to the dead letters.
  send-to-dead-letters-when-no-subscribers = on
  
  # The id of the dispatcher to use for DistributedPubSubMediator actors. 
  # If specified you need to define the settings of the actual dispatcher.
  use-dispatcher = "akka.actor.internal-dispatcher"
}
```

It is recommended to load the extension when the actor system is started by defining it in `akka.extensions` configuration property. Otherwise it will be activated when first used and then it takes a while for it to be populated.

```
akka.extensions = ["akka.cluster.pubsub.DistributedPubSub"]

```

## Delivery Guarantee

As in [Message Delivery Reliability](general/message-delivery-reliability.html) of Akka, message delivery guarantee in distributed pub sub modes is **at\-most\-once delivery**. In other words, messages can be lost over the wire.

If you are looking for at\-least\-once delivery guarantee, we recommend [Alpakka Kafka](https://doc.akka.io/libraries/alpakka-kafka/current/).

## Code Examples

### Example 1: Module info

```scala
val AkkaVersion = "2.10.17"
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
      <version>2.10.17</version>
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
  implementation platform("com.typesafe.akka:akka-bom_${versions.ScalaBinary}:2.10.17")

  implementation "com.typesafe.akka:akka-cluster-tools_${versions.ScalaBinary}"
}
```

### Example 4: Publish

```scala
class Subscriber extends Actor with ActorLogging {
  import DistributedPubSubMediator.{ Subscribe, SubscribeAck }
  val mediator = DistributedPubSub(context.system).mediator
  // subscribe to the topic named "content"
  mediator ! Subscribe("content", self)

  def receive = {
    case s: String =>
      log.info("Got {}", s)
    case SubscribeAck(Subscribe("content", None, `self`)) =>
      log.info("subscribing")
  }
}
```

### Example 5: Publish

```java
static class Subscriber extends AbstractActor {
  LoggingAdapter log = Logging.getLogger(getContext().system(), this);

  public Subscriber() {
    ActorRef mediator = DistributedPubSub.get(getContext().system()).mediator();
    // subscribe to the topic named "content"
    mediator.tell(new DistributedPubSubMediator.Subscribe("content", getSelf()), getSelf());
  }

  @Override
  public Receive createReceive() {
    return receiveBuilder()
        .match(String.class, msg -> log.info("Got: {}", msg))
        .match(DistributedPubSubMediator.SubscribeAck.class, msg -> log.info("subscribed"))
        .build();
  }
}
```

### Example 6: Publish

```scala
runOn(first) {
  system.actorOf(Props[Subscriber](), "subscriber1")
}
runOn(second) {
  system.actorOf(Props[Subscriber](), "subscriber2")
  system.actorOf(Props[Subscriber](), "subscriber3")
}
```

### Example 7: Publish

```java
system.actorOf(Props.create(Subscriber.class), "subscriber1");
// another node
system.actorOf(Props.create(Subscriber.class), "subscriber2");
system.actorOf(Props.create(Subscriber.class), "subscriber3");
```

### Example 8: Publish

```scala
class Publisher extends Actor {
  import DistributedPubSubMediator.Publish
  // activate the extension
  val mediator = DistributedPubSub(context.system).mediator

  def receive = {
    case in: String =>
      val out = in.toUpperCase
      mediator ! Publish("content", out)
  }
}
```

### Example 9: Publish

```java
static class Publisher extends AbstractActor {

  // activate the extension
  ActorRef mediator = DistributedPubSub.get(getContext().system()).mediator();

  @Override
  public Receive createReceive() {
    return receiveBuilder()
        .match(
            String.class,
            in -> {
              String out = in.toUpperCase();
              mediator.tell(new DistributedPubSubMediator.Publish("content", out), getSelf());
            })
        .build();
  }
}
```

### Example 10: Publish

```scala
runOn(third) {
  val publisher = system.actorOf(Props[Publisher](), "publisher")
  later()
  // after a while the subscriptions are replicated
  publisher ! "hello"
}
```

### Example 11: Publish

```java
// somewhere else
ActorRef publisher = system.actorOf(Props.create(Publisher.class), "publisher");
// after a while the subscriptions are replicated
publisher.tell("hello", null);
```

### Example 12: Send

```scala
class Destination extends Actor with ActorLogging {
  import DistributedPubSubMediator.Put
  val mediator = DistributedPubSub(context.system).mediator
  // register to the path
  mediator ! Put(self)

  def receive = {
    case s: String =>
      log.info("Got {}", s)
  }
}
```

### Example 13: Send

```java
static class Destination extends AbstractActor {
  LoggingAdapter log = Logging.getLogger(getContext().system(), this);

  public Destination() {
    ActorRef mediator = DistributedPubSub.get(getContext().system()).mediator();
    // register to the path
    mediator.tell(new DistributedPubSubMediator.Put(getSelf()), getSelf());
  }

  @Override
  public Receive createReceive() {
    return receiveBuilder().match(String.class, msg -> log.info("Got: {}", msg)).build();
  }
}
```

### Example 14: Send

```scala
runOn(first) {
  system.actorOf(Props[Destination](), "destination")
}
runOn(second) {
  system.actorOf(Props[Destination](), "destination")
}
```

### Example 15: Send

```java
system.actorOf(Props.create(Destination.class), "destination");
// another node
system.actorOf(Props.create(Destination.class), "destination");
```

### Example 16: Send

```scala
class Sender extends Actor {
  import DistributedPubSubMediator.Send
  // activate the extension
  val mediator = DistributedPubSub(context.system).mediator

  def receive = {
    case in: String =>
      val out = in.toUpperCase
      mediator ! Send(path = "/user/destination", msg = out, localAffinity = true)
  }
}
```

### Example 17: Send

```java
static class Sender extends AbstractActor {

  // activate the extension
  ActorRef mediator = DistributedPubSub.get(getContext().system()).mediator();

  @Override
  public Receive createReceive() {
    return receiveBuilder()
        .match(
            String.class,
            in -> {
              String out = in.toUpperCase();
              boolean localAffinity = true;
              mediator.tell(
                  new DistributedPubSubMediator.Send("/user/destination", out, localAffinity),
                  getSelf());
            })
        .build();
  }
}
```

### Example 18: Send

```scala
runOn(third) {
  val sender = system.actorOf(Props[Sender](), "sender")
  later()
  // after a while the destinations are replicated
  sender ! "hello"
}
```

### Example 19: Send

```java
// somewhere else
ActorRef sender = system.actorOf(Props.create(Publisher.class), "sender");
// after a while the destinations are replicated
sender.tell("hello", null);
```

### Example 20: DistributedPubSub Extension

```conf
# Settings for the DistributedPubSub extension
akka.cluster.pub-sub {
  # Actor name of the mediator actor, /system/distributedPubSubMediator
  name = distributedPubSubMediator

  # Start the mediator on members tagged with this role.
  # All members are used if undefined or empty.
  role = ""

  # The routing logic to use for 'Send'
  # Possible values: random, round-robin, broadcast
  routing-logic = random

  # How often the DistributedPubSubMediator should send out gossip information
  gossip-interval = 1s

  # Removed entries are pruned after this duration
  removed-time-to-live = 120s

  # Maximum number of elements to transfer in one message when synchronizing the registries.
  # Next chunk will be transferred in next round of gossip.
  max-delta-elements = 3000

  # When a message is published to a topic with no subscribers send it to the dead letters.
  send-to-dead-letters-when-no-subscribers = on
  
  # The id of the dispatcher to use for DistributedPubSubMediator actors. 
  # If specified you need to define the settings of the actual dispatcher.
  use-dispatcher = "akka.actor.internal-dispatcher"
}
```

### Example 21: DistributedPubSub Extension

```text
akka.extensions = ["akka.cluster.pubsub.DistributedPubSub"]
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/ActorRef.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/pubsub/DistributedPubSub.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/pubsub/DistributedPubSubMediator$$Publish.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/pubsub/DistributedPubSubMediator$$Put.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/pubsub/DistributedPubSubMediator$$Remove.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/pubsub/DistributedPubSubMediator$$Send.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/pubsub/DistributedPubSubMediator$$SendToAll.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/pubsub/DistributedPubSubMediator$$Subscribe.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/pubsub/DistributedPubSubMediator$$SubscribeAck.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/pubsub/DistributedPubSubMediator$$Unsubscribe.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/pubsub/DistributedPubSubMediator$$UnsubscribeAck.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/pubsub/DistributedPubSubMediator.html
- https://doc.akka.io/api/akka-core/2.10/akka/routing/RoutingLogic.html
- https://doc.akka.io/docs/akka-dependencies/current/support-terminology.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/pubsub/DistributedPubSub.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/pubsub/DistributedPubSubMediator.Publish.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/pubsub/DistributedPubSubMediator.Put.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/pubsub/DistributedPubSubMediator.Remove.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/pubsub/DistributedPubSubMediator.Send.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/pubsub/DistributedPubSubMediator.SendToAll.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/pubsub/DistributedPubSubMediator.Subscribe.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/pubsub/DistributedPubSubMediator.SubscribeAck.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/pubsub/DistributedPubSubMediator.Unsubscribe.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/pubsub/DistributedPubSubMediator.UnsubscribeAck.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/pubsub/DistributedPubSubMediator.html
- https://doc.akka.io/japi/akka-core/2.10/akka/routing/RoutingLogic.html
- https://doc.akka.io/libraries/akka-core/2.10/cluster-sharding.html
- https://doc.akka.io/libraries/akka-core/2.10/cluster-singleton.html
- https://doc.akka.io/libraries/akka-core/2.10/distributed-pub-sub.html
- https://doc.akka.io/libraries/akka-core/2.10/general/message-delivery-reliability.html
- https://doc.akka.io/libraries/akka-core/2.10/project/links.html
- https://doc.akka.io/libraries/akka-core/2.10/typed/actors.html
- https://doc.akka.io/libraries/akka-core/2.10/typed/cluster-membership.html
- https://doc.akka.io/libraries/akka-core/2.10/typed/coexisting.html
- https://doc.akka.io/libraries/akka-core/2.10/typed/distributed-pub-sub.html
- https://doc.akka.io/libraries/alpakka-kafka/current/
- https://doc.akka.io/reference/release-notes.html

---
*Source: [https://doc.akka.io/libraries/akka-core/2.10/distributed-pub-sub.html](https://doc.akka.io/libraries/akka-core/2.10/distributed-pub-sub.html)*