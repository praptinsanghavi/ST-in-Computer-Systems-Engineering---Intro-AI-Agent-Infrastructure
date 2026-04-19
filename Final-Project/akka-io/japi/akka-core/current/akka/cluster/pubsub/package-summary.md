---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:46:16Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/current/akka/cluster/pubsub/package-summary.html
title: akka.cluster.pubsub
---

# akka.cluster.pubsub

## Content

# Package akka.cluster.pubsub

- Interface Summary 
| Interface | Description |
| [DistributedPubSubMediator.Internal$.ChildActorTerminationProtocol](DistributedPubSubMediator.Internal$.ChildActorTerminationProtocol.html "interface in akka.cluster.pubsub") | Messages used to encode protocol to make sure that we do not send Subscribe/Unsubscribe message to  child (mediator \-\> topic, topic \-\> group) during a period of transition. |
| --- | --- |
| [DistributedPubSubMediator.Internal$.TopicLike](DistributedPubSubMediator.Internal$.TopicLike.html "interface in akka.cluster.pubsub") |  |
| [DistributedPubSubMessage](DistributedPubSubMessage.html "interface in akka.cluster.pubsub") | Marker trait for remote messages with special serializer. |
| [PerGroupingBuffer](PerGroupingBuffer.html "interface in akka.cluster.pubsub") |  |
- Class Summary 
| Class | Description |
| [DistributedPubSub](DistributedPubSub.html "class in akka.cluster.pubsub") | Extension that starts a [`DistributedPubSubMediator`](DistributedPubSubMediator.html "class in akka.cluster.pubsub") actor  with settings defined in config section `akka.cluster.pub-sub`. |
| --- | --- |
| [DistributedPubSub$](DistributedPubSub$.html "class in akka.cluster.pubsub") |  |
| [DistributedPubSubMediator](DistributedPubSubMediator.html "class in akka.cluster.pubsub") | This actor manages a registry of actor references and replicates  the entries to peer actors among all cluster nodes or a group of nodes  tagged with a specific role. |
| [DistributedPubSubMediator.Count](DistributedPubSubMediator.Count.html "class in akka.cluster.pubsub") |  |
| [DistributedPubSubMediator.Count$](DistributedPubSubMediator.Count$.html "class in akka.cluster.pubsub") | Scala API: Send this message to the mediator and it will reply with an `Int` of  the number of subscribers. |
| [DistributedPubSubMediator.CountSubscribers](DistributedPubSubMediator.CountSubscribers.html "class in akka.cluster.pubsub") |  |
| [DistributedPubSubMediator.CountSubscribers$](DistributedPubSubMediator.CountSubscribers$.html "class in akka.cluster.pubsub") |  |
| [DistributedPubSubMediator.CurrentTopics](DistributedPubSubMediator.CurrentTopics.html "class in akka.cluster.pubsub") | Reply to `GetTopics`. |
| [DistributedPubSubMediator.CurrentTopics$](DistributedPubSubMediator.CurrentTopics$.html "class in akka.cluster.pubsub") |  |
| [DistributedPubSubMediator.GetTopics](DistributedPubSubMediator.GetTopics.html "class in akka.cluster.pubsub") |  |
| [DistributedPubSubMediator.GetTopics$](DistributedPubSubMediator.GetTopics$.html "class in akka.cluster.pubsub") | Send this message to the mediator and it will reply with  [`DistributedPubSubMediator.CurrentTopics`](DistributedPubSubMediator.CurrentTopics.html "class in akka.cluster.pubsub") containing the names of the (currently known)  registered topic names. |
| [DistributedPubSubMediator.Internal$](DistributedPubSubMediator.Internal$.html "class in akka.cluster.pubsub") | INTERNAL API |
| [DistributedPubSubMediator.Publish](DistributedPubSubMediator.Publish.html "class in akka.cluster.pubsub") |  |
| [DistributedPubSubMediator.Publish$](DistributedPubSubMediator.Publish$.html "class in akka.cluster.pubsub") |  |
| [DistributedPubSubMediator.Put](DistributedPubSubMediator.Put.html "class in akka.cluster.pubsub") |  |
| [DistributedPubSubMediator.Put$](DistributedPubSubMediator.Put$.html "class in akka.cluster.pubsub") |  |
| [DistributedPubSubMediator.Remove](DistributedPubSubMediator.Remove.html "class in akka.cluster.pubsub") |  |
| [DistributedPubSubMediator.Remove$](DistributedPubSubMediator.Remove$.html "class in akka.cluster.pubsub") |  |
| [DistributedPubSubMediator.Send](DistributedPubSubMediator.Send.html "class in akka.cluster.pubsub") |  |
| [DistributedPubSubMediator.Send$](DistributedPubSubMediator.Send$.html "class in akka.cluster.pubsub") |  |
| [DistributedPubSubMediator.SendToAll](DistributedPubSubMediator.SendToAll.html "class in akka.cluster.pubsub") |  |
| [DistributedPubSubMediator.SendToAll$](DistributedPubSubMediator.SendToAll$.html "class in akka.cluster.pubsub") |  |
| [DistributedPubSubMediator.Subscribe](DistributedPubSubMediator.Subscribe.html "class in akka.cluster.pubsub") |  |
| [DistributedPubSubMediator.Subscribe$](DistributedPubSubMediator.Subscribe$.html "class in akka.cluster.pubsub") |  |
| [DistributedPubSubMediator.SubscribeAck](DistributedPubSubMediator.SubscribeAck.html "class in akka.cluster.pubsub") |  |
| [DistributedPubSubMediator.SubscribeAck$](DistributedPubSubMediator.SubscribeAck$.html "class in akka.cluster.pubsub") |  |
| [DistributedPubSubMediator.Unsubscribe](DistributedPubSubMediator.Unsubscribe.html "class in akka.cluster.pubsub") |  |
| [DistributedPubSubMediator.Unsubscribe$](DistributedPubSubMediator.Unsubscribe$.html "class in akka.cluster.pubsub") |  |
| [DistributedPubSubMediator.UnsubscribeAck](DistributedPubSubMediator.UnsubscribeAck.html "class in akka.cluster.pubsub") |  |
| [DistributedPubSubMediator.UnsubscribeAck$](DistributedPubSubMediator.UnsubscribeAck$.html "class in akka.cluster.pubsub") |  |
| [DistributedPubSubMediator$](DistributedPubSubMediator$.html "class in akka.cluster.pubsub") |  |
| [DistributedPubSubSettings](DistributedPubSubSettings.html "class in akka.cluster.pubsub") | param: role Start the mediator on members tagged with this role. |
| [DistributedPubSubSettings$](DistributedPubSubSettings$.html "class in akka.cluster.pubsub") |  |

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/current/akka/cluster/pubsub/DistributedPubSub$.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/pubsub/DistributedPubSub.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/pubsub/DistributedPubSubMediator$.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/pubsub/DistributedPubSubMediator.Count$.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/pubsub/DistributedPubSubMediator.Count.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/pubsub/DistributedPubSubMediator.CountSubscribers$.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/pubsub/DistributedPubSubMediator.CountSubscribers.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/pubsub/DistributedPubSubMediator.CurrentTopics$.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/pubsub/DistributedPubSubMediator.CurrentTopics.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/pubsub/DistributedPubSubMediator.GetTopics$.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/pubsub/DistributedPubSubMediator.GetTopics.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/pubsub/DistributedPubSubMediator.Internal$.ChildActorTerminationProtocol.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/pubsub/DistributedPubSubMediator.Internal$.TopicLike.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/pubsub/DistributedPubSubMediator.Internal$.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/pubsub/DistributedPubSubMediator.Publish$.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/pubsub/DistributedPubSubMediator.Publish.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/pubsub/DistributedPubSubMediator.Put$.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/pubsub/DistributedPubSubMediator.Put.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/pubsub/DistributedPubSubMediator.Remove$.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/pubsub/DistributedPubSubMediator.Remove.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/pubsub/DistributedPubSubMediator.Send$.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/pubsub/DistributedPubSubMediator.Send.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/pubsub/DistributedPubSubMediator.SendToAll$.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/pubsub/DistributedPubSubMediator.SendToAll.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/pubsub/DistributedPubSubMediator.Subscribe$.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/pubsub/DistributedPubSubMediator.Subscribe.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/pubsub/DistributedPubSubMediator.SubscribeAck$.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/pubsub/DistributedPubSubMediator.SubscribeAck.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/pubsub/DistributedPubSubMediator.Unsubscribe$.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/pubsub/DistributedPubSubMediator.Unsubscribe.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/pubsub/DistributedPubSubMediator.UnsubscribeAck$.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/pubsub/DistributedPubSubMediator.UnsubscribeAck.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/pubsub/DistributedPubSubMediator.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/pubsub/DistributedPubSubMessage.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/pubsub/DistributedPubSubSettings$.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/pubsub/DistributedPubSubSettings.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/pubsub/PerGroupingBuffer.html

---
*Source: [https://doc.akka.io/japi/akka-core/current/akka/cluster/pubsub/package-summary.html](https://doc.akka.io/japi/akka-core/current/akka/cluster/pubsub/package-summary.html)*