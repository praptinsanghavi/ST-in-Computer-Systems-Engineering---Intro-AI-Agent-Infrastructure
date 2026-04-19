---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:14:30Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.6/akka/cluster/client/package-summary.html
title: akka.cluster.client
---

# akka.cluster.client

## Content

# Package akka.cluster.client

- Interface Summary 
| Interface | Description |
| [ClusterClientInteraction](ClusterClientInteraction.html "interface in akka.cluster.client") | Declares a super type for all events emitted by the `ClusterReceptionist`. |
| --- | --- |
| [ClusterClientMessage](ClusterClientMessage.html "interface in akka.cluster.client") | Marker trait for remote messages with special serializer. |
| [ContactPointChange](ContactPointChange.html "interface in akka.cluster.client") | Declares a super type for all events emitted by the `ClusterClient`  in relation to contact points being added or removed. |
- Class Summary 
| Class | Description |
| [ClusterClient](ClusterClient.html "class in akka.cluster.client") | Deprecated. Use Akka gRPC instead, see https://doc.akka.io/libraries/akka\-core/2\.6/cluster\-client.html\#migration\-to\-akka\-grpc. |
| --- | --- |
| [ClusterClient.Internal$](ClusterClient.Internal$.html "class in akka.cluster.client") | INTERNAL API |
| [ClusterClient.Publish](ClusterClient.Publish.html "class in akka.cluster.client") | Deprecated. Use Akka gRPC instead, see https://doc.akka.io/libraries/akka\-core/2\.6/cluster\-client.html\#migration\-to\-akka\-grpc. |
| [ClusterClient.Publish$](ClusterClient.Publish$.html "class in akka.cluster.client") | Deprecated. . |
| [ClusterClient.Send](ClusterClient.Send.html "class in akka.cluster.client") | Deprecated. Use Akka gRPC instead, see https://doc.akka.io/libraries/akka\-core/2\.6/cluster\-client.html\#migration\-to\-akka\-grpc. |
| [ClusterClient.Send$](ClusterClient.Send$.html "class in akka.cluster.client") | Deprecated. . |
| [ClusterClient.SendToAll](ClusterClient.SendToAll.html "class in akka.cluster.client") | Deprecated. Use Akka gRPC instead, see https://doc.akka.io/libraries/akka\-core/2\.6/cluster\-client.html\#migration\-to\-akka\-grpc. |
| [ClusterClient.SendToAll$](ClusterClient.SendToAll$.html "class in akka.cluster.client") | Deprecated. . |
| [ClusterClient$](ClusterClient$.html "class in akka.cluster.client") | Deprecated. . |
| [ClusterClientReceptionist](ClusterClientReceptionist.html "class in akka.cluster.client") | Deprecated. Use Akka gRPC instead, see https://doc.akka.io/libraries/akka\-core/2\.6/cluster\-client.html\#migration\-to\-akka\-grpc. |
| [ClusterClientReceptionist$](ClusterClientReceptionist$.html "class in akka.cluster.client") | Deprecated. . |
| [ClusterClients](ClusterClients.html "class in akka.cluster.client") | The reply to GetClusterClients. |
| [ClusterClients$](ClusterClients$.html "class in akka.cluster.client") |  |
| [ClusterClientSettings](ClusterClientSettings.html "class in akka.cluster.client") | Deprecated. Use Akka gRPC instead, see https://doc.akka.io/libraries/akka\-core/2\.6/cluster\-client.html\#migration\-to\-akka\-grpc. |
| [ClusterClientSettings$](ClusterClientSettings$.html "class in akka.cluster.client") | Deprecated. . |
| [ClusterClientUnreachable](ClusterClientUnreachable.html "class in akka.cluster.client") | Emitted to the Akka event stream when a cluster client was previously connected  but then not seen for some time. |
| [ClusterClientUnreachable$](ClusterClientUnreachable$.html "class in akka.cluster.client") |  |
| [ClusterClientUp](ClusterClientUp.html "class in akka.cluster.client") | Emitted to the Akka event stream when a cluster client has interacted with  a receptionist. |
| [ClusterClientUp$](ClusterClientUp$.html "class in akka.cluster.client") |  |
| [ClusterReceptionist](ClusterReceptionist.html "class in akka.cluster.client") | Deprecated. Use Akka gRPC instead, see https://doc.akka.io/libraries/akka\-core/2\.6/cluster\-client.html\#migration\-to\-akka\-grpc. |
| [ClusterReceptionist.Internal$](ClusterReceptionist.Internal$.html "class in akka.cluster.client") | INTERNAL API |
| [ClusterReceptionist$](ClusterReceptionist$.html "class in akka.cluster.client") | Deprecated. . |
| [ClusterReceptionistSettings](ClusterReceptionistSettings.html "class in akka.cluster.client") | Deprecated. Use Akka gRPC instead, see https://doc.akka.io/libraries/akka\-core/2\.6/cluster\-client.html\#migration\-to\-akka\-grpc. |
| [ClusterReceptionistSettings$](ClusterReceptionistSettings$.html "class in akka.cluster.client") | Deprecated. . |
| [ContactPointAdded](ContactPointAdded.html "class in akka.cluster.client") | Emitted to a subscriber when contact points have been  received by the ClusterClient and a new one has been added. |
| [ContactPointAdded$](ContactPointAdded$.html "class in akka.cluster.client") |  |
| [ContactPointRemoved](ContactPointRemoved.html "class in akka.cluster.client") | Emitted to a subscriber when contact points have been  received by the ClusterClient and a new one has been added. |
| [ContactPointRemoved$](ContactPointRemoved$.html "class in akka.cluster.client") |  |
| [ContactPoints](ContactPoints.html "class in akka.cluster.client") | The reply to GetContactPoints. |
| [ContactPoints$](ContactPoints$.html "class in akka.cluster.client") |  |
| [GetClusterClients](GetClusterClients.html "class in akka.cluster.client") |  |
| [GetClusterClients$](GetClusterClients$.html "class in akka.cluster.client") | Get the cluster clients known to this receptionist. |
| [GetContactPoints](GetContactPoints.html "class in akka.cluster.client") |  |
| [GetContactPoints$](GetContactPoints$.html "class in akka.cluster.client") | Get the contact points known to this client. |
| [SubscribeClusterClients](SubscribeClusterClients.html "class in akka.cluster.client") |  |
| [SubscribeClusterClients$](SubscribeClusterClients$.html "class in akka.cluster.client") | Subscribe to a cluster receptionist's client interactions where  it is guaranteed that a sender receives the initial state  of contact points prior to any events in relation to them  changing. |
| [SubscribeContactPoints](SubscribeContactPoints.html "class in akka.cluster.client") |  |
| [SubscribeContactPoints$](SubscribeContactPoints$.html "class in akka.cluster.client") | Subscribe to a cluster client's contact point changes where  it is guaranteed that a sender receives the initial state  of contact points prior to any events in relation to them  changing. |
| [UnsubscribeClusterClients](UnsubscribeClusterClients.html "class in akka.cluster.client") |  |
| [UnsubscribeClusterClients$](UnsubscribeClusterClients$.html "class in akka.cluster.client") | Explicitly unsubscribe from client interaction events. |
| [UnsubscribeContactPoints](UnsubscribeContactPoints.html "class in akka.cluster.client") |  |
| [UnsubscribeContactPoints$](UnsubscribeContactPoints$.html "class in akka.cluster.client") | Explicitly unsubscribe from contact point change events. |

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/client/ClusterClient$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/client/ClusterClient.Internal$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/client/ClusterClient.Publish$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/client/ClusterClient.Publish.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/client/ClusterClient.Send$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/client/ClusterClient.Send.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/client/ClusterClient.SendToAll$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/client/ClusterClient.SendToAll.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/client/ClusterClient.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/client/ClusterClientInteraction.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/client/ClusterClientMessage.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/client/ClusterClientReceptionist$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/client/ClusterClientReceptionist.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/client/ClusterClientSettings$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/client/ClusterClientSettings.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/client/ClusterClientUnreachable$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/client/ClusterClientUnreachable.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/client/ClusterClientUp$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/client/ClusterClientUp.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/client/ClusterClients$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/client/ClusterClients.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/client/ClusterReceptionist$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/client/ClusterReceptionist.Internal$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/client/ClusterReceptionist.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/client/ClusterReceptionistSettings$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/client/ClusterReceptionistSettings.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/client/ContactPointAdded$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/client/ContactPointAdded.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/client/ContactPointChange.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/client/ContactPointRemoved$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/client/ContactPointRemoved.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/client/ContactPoints$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/client/ContactPoints.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/client/GetClusterClients$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/client/GetClusterClients.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/client/GetContactPoints$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/client/GetContactPoints.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/client/SubscribeClusterClients$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/client/SubscribeClusterClients.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/client/SubscribeContactPoints$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/client/SubscribeContactPoints.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/client/UnsubscribeClusterClients$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/client/UnsubscribeClusterClients.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/client/UnsubscribeContactPoints$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/client/UnsubscribeContactPoints.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.6/akka/cluster/client/package-summary.html](https://doc.akka.io/japi/akka-core/2.6/akka/cluster/client/package-summary.html)*