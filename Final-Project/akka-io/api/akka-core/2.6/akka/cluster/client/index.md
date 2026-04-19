---
description: Akka 2.6.21 - akka.cluster.client
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:13:18Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka/current/akka/cluster/client/index.html
title: Akka 2.6.21 - akka.cluster.client
---

# Akka 2.6.21 - akka.cluster.client

> **Summary:** Akka 2.6.21 - akka.cluster.client

## Content

Akka2\.6\.21 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/cluster/index.html "Permalink")  package [cluster](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/cluster/client/index.html "Permalink")  package clientDefinition Classes[cluster](../index.html)
- [**](../../../akka/cluster/client/protobuf/index.html "Permalink")  package [protobuf](protobuf/index.html)
- [ClusterClient](ClusterClient.html "This actor is intended to be used on an external node that is not member of the cluster.")
- [ClusterClientInteraction](ClusterClientInteraction.html "Declares a super type for all events emitted by the ClusterReceptionist.")
- [ClusterClientMessage](ClusterClientMessage.html "Marker trait for remote messages with special serializer.")
- [ClusterClientReceptionist](ClusterClientReceptionist.html "Extension that starts ClusterReceptionist and accompanying akka.cluster.pubsub.DistributedPubSubMediator with settings defined in config section akka.cluster.client.receptionist.")
- [ClusterClientSettings](ClusterClientSettings.html)
- [ClusterClientUnreachable](ClusterClientUnreachable.html "Emitted to the Akka event stream when a cluster client was previously connected but then not seen for some time.")
- [ClusterClientUp](ClusterClientUp.html "Emitted to the Akka event stream when a cluster client has interacted with a receptionist.")
- [ClusterClients](ClusterClients.html "The reply to GetClusterClients.")
- [ClusterReceptionist](ClusterReceptionist.html "ClusterClient connects to this actor to retrieve.")
- [ClusterReceptionistSettings](ClusterReceptionistSettings.html)
- [ContactPointAdded](ContactPointAdded.html "Emitted to a subscriber when contact points have been received by the ClusterClient and a new one has been added.")
- [ContactPointChange](ContactPointChange.html "Declares a super type for all events emitted by the ClusterClient in relation to contact points being added or removed.")
- [ContactPointRemoved](ContactPointRemoved.html "Emitted to a subscriber when contact points have been received by the ClusterClient and a new one has been added.")
- [ContactPoints](ContactPoints.html "The reply to GetContactPoints.")
- [GetClusterClients](GetClusterClients.html)
- [GetContactPoints](GetContactPoints.html)
- [SubscribeClusterClients](SubscribeClusterClients.html)
- [SubscribeContactPoints](SubscribeContactPoints.html)
- [UnsubscribeClusterClients](UnsubscribeClusterClients.html)
- [UnsubscribeContactPoints](UnsubscribeContactPoints.html)
- [**](../../../akka/cluster/ddata/index.html "Permalink")  package [ddata](../ddata/index.html)Definition Classes[cluster](../index.html)
- [**](../../../akka/cluster/metrics/index.html "Permalink")  package [metrics](../metrics/index.html)Definition Classes[cluster](../index.html)
- [**](../../../akka/cluster/protobuf/index.html "Permalink")  package [protobuf](../protobuf/index.html)Definition Classes[cluster](../index.html)
- [**](../../../akka/cluster/pubsub/index.html "Permalink")  package [pubsub](../pubsub/index.html)Definition Classes[cluster](../index.html)
- [**](../../../akka/cluster/routing/index.html "Permalink")  package [routing](../routing/index.html)Definition Classes[cluster](../index.html)
- [**](../../../akka/cluster/sbr/index.html "Permalink")  package [sbr](../sbr/index.html)Definition Classes[cluster](../index.html)
- [**](../../../akka/cluster/sharding/index.html "Permalink")  package [sharding](../sharding/index.html)Definition Classes[cluster](../index.html)
- [**](../../../akka/cluster/singleton/index.html "Permalink")  package [singleton](../singleton/index.html)Definition Classes[cluster](../index.html)
- [**](../../../akka/cluster/typed/index.html "Permalink")  package [typed](../typed/index.html)Definition Classes[cluster](../index.html)
p[akka](../../index.html).[cluster](../index.html)

# client[**](../../../akka/cluster/client/index.html "Permalink")

#### package client

Content Hierarchy****Ordering1. Alphabetic
Visibility1. Public
2. Protected
### Package Members

1. [**](../../../akka/cluster/client/protobuf/index.html "Permalink")  package [protobuf](protobuf/index.html)
### Type Members

1. [**](../../../akka/cluster/client/ClusterClientInteraction.html "Permalink") sealed  trait [ClusterClientInteraction](ClusterClientInteraction.html "Declares a super type for all events emitted by the ClusterReceptionist.") extends [AnyRef](https://www.scala-lang.org/api/2.13.8/scala/AnyRef.html#scala.AnyRef)Declares a super type for all events emitted by the `ClusterReceptionist`.

Declares a super type for all events emitted by the `ClusterReceptionist`.
in relation to cluster clients being interacted with.
2. [**](../../../akka/cluster/client/ClusterClientMessage.html "Permalink") sealed  trait [ClusterClientMessage](ClusterClientMessage.html "Marker trait for remote messages with special serializer.") extends SerializableMarker trait for remote messages with special serializer.
3. [**](../../../akka/cluster/client/ClusterClientUnreachable.html "Permalink") final  case class [ClusterClientUnreachable](ClusterClientUnreachable.html "Emitted to the Akka event stream when a cluster client was previously connected but then not seen for some time.")(clusterClient: [ActorRef](../../actor/ActorRef.html)) extends [ClusterClientInteraction](ClusterClientInteraction.html) with [Product](https://www.scala-lang.org/api/2.13.8/scala/Product.html#scala.Product) with SerializableEmitted to the Akka event stream when a cluster client was previously connected
but then not seen for some time.
4. [**](../../../akka/cluster/client/ClusterClientUp.html "Permalink") final  case class [ClusterClientUp](ClusterClientUp.html "Emitted to the Akka event stream when a cluster client has interacted with a receptionist.")(clusterClient: [ActorRef](../../actor/ActorRef.html)) extends [ClusterClientInteraction](ClusterClientInteraction.html) with [Product](https://www.scala-lang.org/api/2.13.8/scala/Product.html#scala.Product) with SerializableEmitted to the Akka event stream when a cluster client has interacted with
a receptionist.
5. [**](../../../akka/cluster/client/ClusterClients.html "Permalink") final  case class [ClusterClients](ClusterClients.html "The reply to GetClusterClients.")(clusterClients: Set\[[ActorRef](../../actor/ActorRef.html)]) extends [Product](https://www.scala-lang.org/api/2.13.8/scala/Product.html#scala.Product) with SerializableThe reply to `GetClusterClients`.

The reply to `GetClusterClients`.

clusterClientsThe presently known list of cluster clients.
6. [**](../../../akka/cluster/client/ContactPointAdded.html "Permalink") final  case class [ContactPointAdded](ContactPointAdded.html "Emitted to a subscriber when contact points have been received by the ClusterClient and a new one has been added.")(contactPoint: [ActorPath](../../actor/ActorPath.html)) extends [ContactPointChange](ContactPointChange.html) with [Product](https://www.scala-lang.org/api/2.13.8/scala/Product.html#scala.Product) with SerializableEmitted to a subscriber when contact points have been
received by the ClusterClient and a new one has been added.
7. [**](../../../akka/cluster/client/ContactPointChange.html "Permalink") sealed  trait [ContactPointChange](ContactPointChange.html "Declares a super type for all events emitted by the ClusterClient in relation to contact points being added or removed.") extends [AnyRef](https://www.scala-lang.org/api/2.13.8/scala/AnyRef.html#scala.AnyRef)Declares a super type for all events emitted by the `ClusterClient`
in relation to contact points being added or removed.
8. [**](../../../akka/cluster/client/ContactPointRemoved.html "Permalink") final  case class [ContactPointRemoved](ContactPointRemoved.html "Emitted to a subscriber when contact points have been received by the ClusterClient and a new one has been added.")(contactPoint: [ActorPath](../../actor/ActorPath.html)) extends [ContactPointChange](ContactPointChange.html) with [Product](https://www.scala-lang.org/api/2.13.8/scala/Product.html#scala.Product) with SerializableEmitted to a subscriber when contact points have been
received by the ClusterClient and a new one has been added.
9. [**](../../../akka/cluster/client/ContactPoints.html "Permalink") final  case class [ContactPoints](ContactPoints.html "The reply to GetContactPoints.")(contactPoints: Set\[[ActorPath](../../actor/ActorPath.html)]) extends [Product](https://www.scala-lang.org/api/2.13.8/scala/Product.html#scala.Product) with SerializableThe reply to `GetContactPoints`.

The reply to `GetContactPoints`.

contactPointsThe presently known list of contact points.
10. [**](../../../akka/cluster/client/GetClusterClients.html "Permalink") sealed abstract  class [GetClusterClients](GetClusterClients.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.8/scala/AnyRef.html#scala.AnyRef)
11. [**](../../../akka/cluster/client/GetContactPoints.html "Permalink") sealed abstract  class [GetContactPoints](GetContactPoints.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.8/scala/AnyRef.html#scala.AnyRef)
12. [**](../../../akka/cluster/client/SubscribeClusterClients.html "Permalink") sealed abstract  class [SubscribeClusterClients](SubscribeClusterClients.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.8/scala/AnyRef.html#scala.AnyRef)
13. [**](../../../akka/cluster/client/SubscribeContactPoints.html "Permalink") sealed abstract  class [SubscribeContactPoints](SubscribeContactPoints.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.8/scala/AnyRef.html#scala.AnyRef)
14. [**](../../../akka/cluster/client/UnsubscribeClusterClients.html "Permalink") sealed abstract  class [UnsubscribeClusterClients](UnsubscribeClusterClients.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.8/scala/AnyRef.html#scala.AnyRef)
15. [**](../../../akka/cluster/client/UnsubscribeContactPoints.html "Permalink") sealed abstract  class [UnsubscribeContactPoints](UnsubscribeContactPoints.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.8/scala/AnyRef.html#scala.AnyRef)
### Deprecated Type Members

1. [**](../../../akka/cluster/client/ClusterClient.html "Permalink") final  class [ClusterClient](ClusterClient.html "This actor is intended to be used on an external node that is not member of the cluster.") extends [Actor](../../actor/Actor.html) with [ActorLogging](../../actor/ActorLogging.html)This actor is intended to be used on an external node that is not member
of the cluster.

This actor is intended to be used on an external node that is not member
of the cluster. It acts like a gateway for sending messages to actors
somewhere in the cluster. From the initial contact points it will establish
a connection to a [ClusterReceptionist](ClusterReceptionist.html) somewhere in the cluster. It will
monitor the connection to the receptionist and establish a new connection if
the link goes down. When looking for a new receptionist it uses fresh contact
points retrieved from previous establishment, or periodically refreshed
contacts, i.e. not necessarily the initial contact points.

You can send messages via the `ClusterClient` to any actor in the cluster
that is registered in the [ClusterReceptionist](ClusterReceptionist.html).
Messages are wrapped in [ClusterClient.Send](ClusterClient$$Send.html), [ClusterClient.SendToAll](ClusterClient$$SendToAll.html)
or [ClusterClient.Publish](ClusterClient$$Publish.html).

1\. [ClusterClient.Send](ClusterClient$$Send.html) \-
The message will be delivered to one recipient with a matching path, if any such
exists. If several entries match the path the message will be delivered
to one random destination. The sender of the message can specify that local
affinity is preferred, i.e. the message is sent to an actor in the same local actor
system as the used receptionist actor, if any such exists, otherwise random to any other
matching entry.

2\. [ClusterClient.SendToAll](ClusterClient$$SendToAll.html) \-
The message will be delivered to all recipients with a matching path.

3\. [ClusterClient.Publish](ClusterClient$$Publish.html) \-
The message will be delivered to all recipients Actors that have been registered as subscribers to
to the named topic.

 Use the factory method [ClusterClient\#props](ClusterClient$.html#props(settings:akka.cluster.client.ClusterClientSettings):akka.actor.Props)) to create the
[akka.actor.Props](../../actor/Props.html) for the actor.

If the receptionist is not currently available, the client will buffer the messages
and then deliver them when the connection to the receptionist has been established.
The size of the buffer is configurable and it can be disabled by using a buffer size
of 0\. When the buffer is full old messages will be dropped when new messages are sent
via the client.

Note that this is a best effort implementation: messages can always be lost due to the distributed
nature of the actors involved.

Annotations@deprecated Deprecated*(Since version 2\.6\.0\)* Use Akka gRPC instead, see https://doc.akka.io/libraries/akka\-core/2\.6/cluster\-client.html\#migration\-to\-akka\-grpc
2. [**](../../../akka/cluster/client/ClusterClientReceptionist.html "Permalink") final  class [ClusterClientReceptionist](ClusterClientReceptionist.html "Extension that starts ClusterReceptionist and accompanying akka.cluster.pubsub.DistributedPubSubMediator with settings defined in config section akka.cluster.client.receptionist.") extends [Extension](../../actor/Extension.html)Extension that starts [ClusterReceptionist](ClusterReceptionist.html) and accompanying [akka.cluster.pubsub.DistributedPubSubMediator](../pubsub/DistributedPubSubMediator.html)
with settings defined in config section `akka.cluster.client.receptionist`.

Extension that starts [ClusterReceptionist](ClusterReceptionist.html) and accompanying [akka.cluster.pubsub.DistributedPubSubMediator](../pubsub/DistributedPubSubMediator.html)
with settings defined in config section `akka.cluster.client.receptionist`.
The [akka.cluster.pubsub.DistributedPubSubMediator](../pubsub/DistributedPubSubMediator.html) is started by the [akka.cluster.pubsub.DistributedPubSub](../pubsub/DistributedPubSub.html) extension.

Annotations@deprecated Deprecated*(Since version 2\.6\.0\)* Use Akka gRPC instead, see https://doc.akka.io/libraries/akka\-core/2\.6/cluster\-client.html\#migration\-to\-akka\-grpc
3. [**](../../../akka/cluster/client/ClusterClientSettings.html "Permalink") final  class [ClusterClientSettings](ClusterClientSettings.html) extends [NoSerializationVerificationNeeded](../../actor/NoSerializationVerificationNeeded.html)Annotations@deprecated Deprecated*(Since version 2\.6\.0\)* Use Akka gRPC instead, see https://doc.akka.io/libraries/akka\-core/2\.6/cluster\-client.html\#migration\-to\-akka\-grpc
4. [**](../../../akka/cluster/client/ClusterReceptionist.html "Permalink") final  class [ClusterReceptionist](ClusterReceptionist.html "ClusterClient connects to this actor to retrieve.") extends [Actor](../../actor/Actor.html) with [ActorLogging](../../actor/ActorLogging.html)[ClusterClient](ClusterClient.html) connects to this actor to retrieve.

[ClusterClient](ClusterClient.html) connects to this actor to retrieve. The `ClusterReceptionist` is
supposed to be started on all nodes, or all nodes with specified role, in the cluster.
The receptionist can be started with the [ClusterClientReceptionist](ClusterClientReceptionist.html) or as an
ordinary actor (use the factory method [ClusterReceptionist\#props](ClusterReceptionist$.html#props(pubSubMediator:akka.actor.ActorRef,settings:akka.cluster.client.ClusterReceptionistSettings):akka.actor.Props)).

The receptionist forwards messages from the client to the associated [akka.cluster.pubsub.DistributedPubSubMediator](../pubsub/DistributedPubSubMediator.html),
i.e. the client can send messages to any actor in the cluster that is registered in the
`DistributedPubSubMediator`. Messages from the client are wrapped in
[akka.cluster.pubsub.DistributedPubSubMediator.Send](../pubsub/DistributedPubSubMediator$$Send.html), [akka.cluster.pubsub.DistributedPubSubMediator.SendToAll](../pubsub/DistributedPubSubMediator$$SendToAll.html)
or [akka.cluster.pubsub.DistributedPubSubMediator.Publish](../pubsub/DistributedPubSubMediator$$Publish.html) with the semantics described in
[akka.cluster.pubsub.DistributedPubSubMediator](../pubsub/DistributedPubSubMediator.html).

Response messages from the destination actor are tunneled via the receptionist
to avoid inbound connections from other cluster nodes to the client, i.e.
the `sender()`, as seen by the destination actor, is not the client itself.
The `sender()` of the response messages, as seen by the client, is `deadLetters`
since the client should normally send subsequent messages via the `ClusterClient`.
It is possible to pass the original sender inside the reply messages if
the client is supposed to communicate directly to the actor in the cluster.

Annotations@deprecated Deprecated*(Since version 2\.6\.0\)* Use Akka gRPC instead, see https://doc.akka.io/libraries/akka\-core/2\.6/cluster\-client.html\#migration\-to\-akka\-grpc
5. [**](../../../akka/cluster/client/ClusterReceptionistSettings.html "Permalink") final  class [ClusterReceptionistSettings](ClusterReceptionistSettings.html) extends [NoSerializationVerificationNeeded](../../actor/NoSerializationVerificationNeeded.html)Annotations@deprecated Deprecated*(Since version 2\.6\.0\)* Use Akka gRPC instead, see https://doc.akka.io/libraries/akka\-core/2\.6/cluster\-client.html\#migration\-to\-akka\-grpc
### Value Members

1. [**](../../../akka/cluster/client/GetClusterClients$.html "Permalink")  case object [GetClusterClients](GetClusterClients$.html "Get the cluster clients known to this receptionist.") extends [GetClusterClients](GetClusterClients.html) with [Product](https://www.scala-lang.org/api/2.13.8/scala/Product.html#scala.Product) with SerializableGet the cluster clients known to this receptionist.

Get the cluster clients known to this receptionist. A `ClusterClients` message
will be replied.
2. [**](../../../akka/cluster/client/GetContactPoints$.html "Permalink")  case object [GetContactPoints](GetContactPoints$.html "Get the contact points known to this client.") extends [GetContactPoints](GetContactPoints.html) with [Product](https://www.scala-lang.org/api/2.13.8/scala/Product.html#scala.Product) with SerializableGet the contact points known to this client.

Get the contact points known to this client. A `ContactPoints` message
will be replied.
3. [**](../../../akka/cluster/client/SubscribeClusterClients$.html "Permalink")  case object [SubscribeClusterClients](SubscribeClusterClients$.html "Subscribe to a cluster receptionist's client interactions where it is guaranteed that a sender receives the initial state of contact points prior to any events in relation to them changing.") extends [SubscribeClusterClients](SubscribeClusterClients.html) with [Product](https://www.scala-lang.org/api/2.13.8/scala/Product.html#scala.Product) with SerializableSubscribe to a cluster receptionist's client interactions where
it is guaranteed that a sender receives the initial state
of contact points prior to any events in relation to them
changing.

Subscribe to a cluster receptionist's client interactions where
it is guaranteed that a sender receives the initial state
of contact points prior to any events in relation to them
changing.
The sender will automatically become unsubscribed when it
terminates.
4. [**](../../../akka/cluster/client/SubscribeContactPoints$.html "Permalink")  case object [SubscribeContactPoints](SubscribeContactPoints$.html "Subscribe to a cluster client's contact point changes where it is guaranteed that a sender receives the initial state of contact points prior to any events in relation to them changing.") extends [SubscribeContactPoints](SubscribeContactPoints.html) with [Product](https://www.scala-lang.org/api/2.13.8/scala/Product.html#scala.Product) with SerializableSubscribe to a cluster client's contact point changes where
it is guaranteed that a sender receives the initial state
of contact points prior to any events in relation to them
changing.

Subscribe to a cluster client's contact point changes where
it is guaranteed that a sender receives the initial state
of contact points prior to any events in relation to them
changing.
The sender will automatically become unsubscribed when it
terminates.
5. [**](../../../akka/cluster/client/UnsubscribeClusterClients$.html "Permalink")  case object [UnsubscribeClusterClients](UnsubscribeClusterClients$.html "Explicitly unsubscribe from client interaction events.") extends [UnsubscribeClusterClients](UnsubscribeClusterClients.html) with [Product](https://www.scala-lang.org/api/2.13.8/scala/Product.html#scala.Product) with SerializableExplicitly unsubscribe from client interaction events.
6. [**](../../../akka/cluster/client/UnsubscribeContactPoints$.html "Permalink")  case object [UnsubscribeContactPoints](UnsubscribeContactPoints$.html "Explicitly unsubscribe from contact point change events.") extends [UnsubscribeContactPoints](UnsubscribeContactPoints.html) with [Product](https://www.scala-lang.org/api/2.13.8/scala/Product.html#scala.Product) with SerializableExplicitly unsubscribe from contact point change events.
### Deprecated Value Members

1. [**](../../../akka/cluster/client/ClusterClient$.html "Permalink")  object [ClusterClient](ClusterClient$.html)Annotations@deprecated Deprecated*(Since version 2\.6\.0\)* Use Akka gRPC instead, see https://doc.akka.io/libraries/akka\-core/2\.6/cluster\-client.html\#migration\-to\-akka\-grpc
2. [**](../../../akka/cluster/client/ClusterClientReceptionist$.html "Permalink")  object [ClusterClientReceptionist](ClusterClientReceptionist$.html) extends [ExtensionId](../../actor/ExtensionId.html)\[[ClusterClientReceptionist](ClusterClientReceptionist.html)] with [ExtensionIdProvider](../../actor/ExtensionIdProvider.html)Annotations@deprecated Deprecated*(Since version 2\.6\.0\)* Use Akka gRPC instead, see https://doc.akka.io/libraries/akka\-core/2\.6/cluster\-client.html\#migration\-to\-akka\-grpc
3. [**](../../../akka/cluster/client/ClusterClientSettings$.html "Permalink")  object [ClusterClientSettings](ClusterClientSettings$.html)Annotations@ccompatUsedUntil213() @deprecated Deprecated*(Since version 2\.6\.0\)* Use Akka gRPC instead, see https://doc.akka.io/libraries/akka\-core/2\.6/cluster\-client.html\#migration\-to\-akka\-grpc
4. [**](../../../akka/cluster/client/ClusterReceptionist$.html "Permalink")  object [ClusterReceptionist](ClusterReceptionist$.html)Annotations@deprecated Deprecated*(Since version 2\.6\.0\)* Use Akka gRPC instead, see https://doc.akka.io/libraries/akka\-core/2\.6/cluster\-client.html\#migration\-to\-akka\-grpc
5. [**](../../../akka/cluster/client/ClusterReceptionistSettings$.html "Permalink")  object [ClusterReceptionistSettings](ClusterReceptionistSettings$.html)Annotations@deprecated Deprecated*(Since version 2\.6\.0\)* Use Akka gRPC instead, see https://doc.akka.io/libraries/akka\-core/2\.6/cluster\-client.html\#migration\-to\-akka\-grpc
### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.6/akka/actor/Actor.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/ActorLogging.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/ActorPath.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/ActorRef.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/Extension.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/ExtensionId.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/ExtensionIdProvider.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/NoSerializationVerificationNeeded.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/Props.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/client/ClusterClient$$Publish.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/client/ClusterClient$$Send.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/client/ClusterClient$$SendToAll.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/client/ClusterClient$.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/client/ClusterClient.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/client/ClusterClientInteraction.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/client/ClusterClientMessage.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/client/ClusterClientReceptionist$.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/client/ClusterClientReceptionist.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/client/ClusterClientSettings$.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/client/ClusterClientSettings.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/client/ClusterClientUnreachable.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/client/ClusterClientUp.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/client/ClusterClients.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/client/ClusterReceptionist$.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/client/ClusterReceptionist.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/client/ClusterReceptionistSettings$.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/client/ClusterReceptionistSettings.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/client/ContactPointAdded.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/client/ContactPointChange.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/client/ContactPointRemoved.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/client/ContactPoints.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/client/GetClusterClients$.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/client/GetClusterClients.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/client/GetContactPoints$.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/client/GetContactPoints.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/client/SubscribeClusterClients$.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/client/SubscribeClusterClients.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/client/SubscribeContactPoints$.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/client/SubscribeContactPoints.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/client/UnsubscribeClusterClients$.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/client/UnsubscribeClusterClients.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/client/UnsubscribeContactPoints$.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/client/UnsubscribeContactPoints.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/client/index.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/client/protobuf/index.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/ddata/index.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/index.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/metrics/index.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/protobuf/index.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/pubsub/DistributedPubSub.html

---
*Source: [https://doc.akka.io/api/akka-core/2.6/akka/cluster/client/index.html](https://doc.akka.io/api/akka-core/2.6/akka/cluster/client/index.html)*