---
description: Akka 2.10.17 - akka.cluster.pubsub
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:44:03Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/cluster/pubsub/index.html
title: Akka 2.10.17 - akka.cluster.pubsub
---

# Akka 2.10.17 - akka.cluster.pubsub

> **Summary:** Akka 2.10.17 - akka.cluster.pubsub

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/cluster/index.html "Permalink")  package [cluster](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/cluster/ddata/index.html "Permalink")  package [ddata](../ddata/index.html)Definition Classes[cluster](../index.html)
- [**](../../../akka/cluster/metrics/index.html "Permalink")  package [metrics](../metrics/index.html)Definition Classes[cluster](../index.html)
- [**](../../../akka/cluster/protobuf/index.html "Permalink")  package [protobuf](../protobuf/index.html)Definition Classes[cluster](../index.html)
- [**](../../../akka/cluster/pubsub/index.html "Permalink")  package pubsubDefinition Classes[cluster](../index.html)
- [**](../../../akka/cluster/pubsub/protobuf/index.html "Permalink")  package [protobuf](protobuf/index.html)
- [DistributedPubSub](DistributedPubSub.html "Extension that starts a DistributedPubSubMediator actor with settings defined in config section akka.cluster.pub-sub.")
- [DistributedPubSubMediator](DistributedPubSubMediator.html "This actor manages a registry of actor references and replicates the entries to peer actors among all cluster nodes or a group of nodes tagged with a specific role.")
- [DistributedPubSubMessage](DistributedPubSubMessage.html "Marker trait for remote messages with special serializer.")
- [DistributedPubSubSettings](DistributedPubSubSettings.html)
- [**](../../../akka/cluster/routing/index.html "Permalink")  package [routing](../routing/index.html)Definition Classes[cluster](../index.html)
- [**](../../../akka/cluster/sbr/index.html "Permalink")  package [sbr](../sbr/index.html)Definition Classes[cluster](../index.html)
- [**](../../../akka/cluster/sharding/index.html "Permalink")  package [sharding](../sharding/index.html)Definition Classes[cluster](../index.html)
- [**](../../../akka/cluster/singleton/index.html "Permalink")  package [singleton](../singleton/index.html)Definition Classes[cluster](../index.html)
- [**](../../../akka/cluster/typed/index.html "Permalink")  package [typed](../typed/index.html)Definition Classes[cluster](../index.html)
p[akka](../../index.html).[cluster](../index.html)

# pubsub[**](../../../akka/cluster/pubsub/index.html "Permalink")

#### package pubsub

****Ordering1. Alphabetic
Visibility1. Public
2. Protected
### Package Members

1. [**](../../../akka/cluster/pubsub/protobuf/index.html "Permalink")  package [protobuf](protobuf/index.html)
### Type Members

1. [**](../../../akka/cluster/pubsub/DistributedPubSub.html "Permalink")  class [DistributedPubSub](DistributedPubSub.html "Extension that starts a DistributedPubSubMediator actor with settings defined in config section akka.cluster.pub-sub.") extends [Extension](../../actor/Extension.html)Extension that starts a [DistributedPubSubMediator](DistributedPubSubMediator.html) actor
with settings defined in config section `akka.cluster.pub-sub`.
2. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator.html "Permalink")  class [DistributedPubSubMediator](DistributedPubSubMediator.html "This actor manages a registry of actor references and replicates the entries to peer actors among all cluster nodes or a group of nodes tagged with a specific role.") extends [Actor](../../actor/Actor.html) with [ActorLogging](../../actor/ActorLogging.html) with PerGroupingBufferThis actor manages a registry of actor references and replicates
the entries to peer actors among all cluster nodes or a group of nodes
tagged with a specific role.

This actor manages a registry of actor references and replicates
the entries to peer actors among all cluster nodes or a group of nodes
tagged with a specific role.

The `DistributedPubSubMediator` actor is supposed to be started on all nodes,
or all nodes with specified role, in the cluster. The mediator can be
started with the [DistributedPubSub](DistributedPubSub.html) extension or as an ordinary actor.

Changes are only performed in the own part of the registry and those changes
are versioned. Deltas are disseminated in a scalable way to other nodes with
a gossip protocol. The registry is eventually consistent, i.e. changes are not
immediately visible at other nodes, but typically they will be fully replicated
to all other nodes after a few seconds.

You can send messages via the mediator on any node to registered actors on
any other node. There is three modes of message delivery.

1\. [DistributedPubSubMediator.Send](DistributedPubSubMediator$$Send.html) \-
The message will be delivered to one recipient with a matching path, if any such
exists in the registry. If several entries match the path the message will be sent
via the supplied `routingLogic` (default random) to one destination. The sender of the
message can specify that local affinity is preferred, i.e. the message is sent to an actor
in the same local actor system as the used mediator actor, if any such exists, otherwise
route to any other matching entry. A typical usage of this mode is private chat to one
other user in an instant messaging application. It can also be used for distributing
tasks to registered workers, like a cluster aware router where the routees dynamically
can register themselves.

2\. [DistributedPubSubMediator.SendToAll](DistributedPubSubMediator$$SendToAll.html) \-
The message will be delivered to all recipients with a matching path. Actors with
the same path, without address information, can be registered on different nodes.
On each node there can only be one such actor, since the path is unique within one
local actor system. Typical usage of this mode is to broadcast messages to all replicas
with the same path, e.g. 3 actors on different nodes that all perform the same actions,
for redundancy.

3\. [DistributedPubSubMediator.Publish](DistributedPubSubMediator$$Publish.html) \-
Actors may be registered to a named topic instead of path. This enables many subscribers
on each node. The message will be delivered to all subscribers of the topic. For
efficiency the message is sent over the wire only once per node (that has a matching topic),
and then delivered to all subscribers of the local topic representation. This is the
true pub/sub mode. A typical usage of this mode is a chat room in an instant messaging
application.

4\. [DistributedPubSubMediator.Publish](DistributedPubSubMediator$$Publish.html) with sendOneMessageToEachGroup \-
Actors may be subscribed to a named topic with an optional property `group`.
If subscribing with a group name, each message published to a topic with the
`sendOneMessageToEachGroup` flag is delivered via the supplied `routingLogic`
(default random) to one actor within each subscribing group.
If all the subscribed actors have the same group name, then this works just like
[DistributedPubSubMediator.Send](DistributedPubSubMediator$$Send.html) and all messages are delivered to one subscribe.
If all the subscribed actors have different group names, then this works like normal
[DistributedPubSubMediator.Publish](DistributedPubSubMediator$$Publish.html) and all messages are broadcast to all subscribers.

You register actors to the local mediator with [DistributedPubSubMediator.Put](DistributedPubSubMediator$$Put.html) or
[DistributedPubSubMediator.Subscribe](DistributedPubSubMediator$$Subscribe.html). `Put` is used together with `Send` and
`SendToAll` message delivery modes. The `ActorRef` in `Put` must belong to the same
local actor system as the mediator. `Subscribe` is used together with `Publish`.
Actors are automatically removed from the registry when they are terminated, or you
can explicitly remove entries with [DistributedPubSubMediator.Remove](DistributedPubSubMediator$$Remove.html) or
[DistributedPubSubMediator.Unsubscribe](DistributedPubSubMediator$$Unsubscribe.html).

Successful `Subscribe` and `Unsubscribe` is acknowledged with
[DistributedPubSubMediator.SubscribeAck](DistributedPubSubMediator$$SubscribeAck.html) and [DistributedPubSubMediator.UnsubscribeAck](DistributedPubSubMediator$$UnsubscribeAck.html)
replies.

Not intended for subclassing by user code.

Annotations@[DoNotInherit](../../annotation/DoNotInherit.html)()
3. [**](../../../akka/cluster/pubsub/DistributedPubSubMessage.html "Permalink")  trait [DistributedPubSubMessage](DistributedPubSubMessage.html "Marker trait for remote messages with special serializer.") extends SerializableMarker trait for remote messages with special serializer.
4. [**](../../../akka/cluster/pubsub/DistributedPubSubSettings.html "Permalink") final  class [DistributedPubSubSettings](DistributedPubSubSettings.html) extends [NoSerializationVerificationNeeded](../../actor/NoSerializationVerificationNeeded.html)
### Value Members

1. [**](../../../akka/cluster/pubsub/DistributedPubSub$.html "Permalink")  object [DistributedPubSub](DistributedPubSub$.html) extends [ExtensionId](../../actor/ExtensionId.html)\[[DistributedPubSub](DistributedPubSub.html)] with [ExtensionIdProvider](../../actor/ExtensionIdProvider.html)
2. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator$.html "Permalink")  object [DistributedPubSubMediator](DistributedPubSubMediator$.html)
3. [**](../../../akka/cluster/pubsub/DistributedPubSubSettings$.html "Permalink")  object [DistributedPubSubSettings](DistributedPubSubSettings$.html)
### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/actor/Actor.html
- https://doc.akka.io/api/akka/current/akka/actor/ActorLogging.html
- https://doc.akka.io/api/akka/current/akka/actor/Extension.html
- https://doc.akka.io/api/akka/current/akka/actor/ExtensionId.html
- https://doc.akka.io/api/akka/current/akka/actor/ExtensionIdProvider.html
- https://doc.akka.io/api/akka/current/akka/actor/NoSerializationVerificationNeeded.html
- https://doc.akka.io/api/akka/current/akka/annotation/DoNotInherit.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/index.html
- https://doc.akka.io/api/akka/current/akka/cluster/index.html
- https://doc.akka.io/api/akka/current/akka/cluster/metrics/index.html
- https://doc.akka.io/api/akka/current/akka/cluster/protobuf/index.html
- https://doc.akka.io/api/akka/current/akka/cluster/pubsub/DistributedPubSub$.html
- https://doc.akka.io/api/akka/current/akka/cluster/pubsub/DistributedPubSub.html
- https://doc.akka.io/api/akka/current/akka/cluster/pubsub/DistributedPubSubMediator$$Publish.html
- https://doc.akka.io/api/akka/current/akka/cluster/pubsub/DistributedPubSubMediator$$Put.html
- https://doc.akka.io/api/akka/current/akka/cluster/pubsub/DistributedPubSubMediator$$Remove.html
- https://doc.akka.io/api/akka/current/akka/cluster/pubsub/DistributedPubSubMediator$$Send.html
- https://doc.akka.io/api/akka/current/akka/cluster/pubsub/DistributedPubSubMediator$$SendToAll.html
- https://doc.akka.io/api/akka/current/akka/cluster/pubsub/DistributedPubSubMediator$$Subscribe.html
- https://doc.akka.io/api/akka/current/akka/cluster/pubsub/DistributedPubSubMediator$$SubscribeAck.html
- https://doc.akka.io/api/akka/current/akka/cluster/pubsub/DistributedPubSubMediator$$Unsubscribe.html
- https://doc.akka.io/api/akka/current/akka/cluster/pubsub/DistributedPubSubMediator$$UnsubscribeAck.html
- https://doc.akka.io/api/akka/current/akka/cluster/pubsub/DistributedPubSubMediator$.html
- https://doc.akka.io/api/akka/current/akka/cluster/pubsub/DistributedPubSubMediator.html
- https://doc.akka.io/api/akka/current/akka/cluster/pubsub/DistributedPubSubMessage.html
- https://doc.akka.io/api/akka/current/akka/cluster/pubsub/DistributedPubSubSettings$.html
- https://doc.akka.io/api/akka/current/akka/cluster/pubsub/DistributedPubSubSettings.html
- https://doc.akka.io/api/akka/current/akka/cluster/pubsub/index.html
- https://doc.akka.io/api/akka/current/akka/cluster/pubsub/protobuf/index.html
- https://doc.akka.io/api/akka/current/akka/cluster/routing/index.html
- https://doc.akka.io/api/akka/current/akka/cluster/sbr/index.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/index.html
- https://doc.akka.io/api/akka/current/akka/cluster/singleton/index.html
- https://doc.akka.io/api/akka/current/akka/cluster/typed/index.html
- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/cluster/pubsub/index.html](https://doc.akka.io/api/akka/current/akka/cluster/pubsub/index.html)*