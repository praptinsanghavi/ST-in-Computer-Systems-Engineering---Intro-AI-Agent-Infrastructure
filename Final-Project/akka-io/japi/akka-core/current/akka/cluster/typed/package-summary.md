---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:46:34Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/current/akka/cluster/typed/package-summary.html
title: akka.cluster.typed
---

# akka.cluster.typed

## Content

# Package akka.cluster.typed

- Interface Summary 
| Interface | Description |
| [ClusterCommand](ClusterCommand.html "interface in akka.cluster.typed") | Not intended for user extension. |
| --- | --- |
| [ClusterStateSubscription](ClusterStateSubscription.html "interface in akka.cluster.typed") | Messages for subscribing to changes in the cluster state |
| [PrepareForFullClusterShutdown](PrepareForFullClusterShutdown.html "interface in akka.cluster.typed") | Initiate a full cluster shutdown. |
- Class Summary 
| Class | Description |
| [Cluster](Cluster.html "class in akka.cluster.typed") | This class is not intended for user extension other than for test purposes (e.g. |
| --- | --- |
| [Cluster$](Cluster$.html "class in akka.cluster.typed") | Akka Typed Cluster API entry point |
| [ClusterSetup](ClusterSetup.html "class in akka.cluster.typed") | Can be used in [`ActorSystemSetup`](../../actor/setup/ActorSystemSetup.html "class in akka.actor.setup") when starting the `ActorSystem`  to replace the default implementation of the [`Cluster`](Cluster.html "class in akka.cluster.typed") extension. |
| [ClusterSetup$](ClusterSetup$.html "class in akka.cluster.typed") |  |
| [ClusterSingleton](ClusterSingleton.html "class in akka.cluster.typed") | This class is not intended for user extension other than for test purposes (e.g. |
| [ClusterSingleton$](ClusterSingleton$.html "class in akka.cluster.typed") |  |
| [ClusterSingletonImpl](ClusterSingletonImpl.html "class in akka.cluster.typed") | INTERNAL API: |
| [ClusterSingletonImpl$](ClusterSingletonImpl$.html "class in akka.cluster.typed") | INTERNAL API: |
| [ClusterSingletonManagerSettings](ClusterSingletonManagerSettings.html "class in akka.cluster.typed") | param: singletonName The actor name of the child singleton actor. |
| [ClusterSingletonManagerSettings$](ClusterSingletonManagerSettings$.html "class in akka.cluster.typed") |  |
| [ClusterSingletonSettings](ClusterSingletonSettings.html "class in akka.cluster.typed") |  |
| [ClusterSingletonSettings$](ClusterSingletonSettings$.html "class in akka.cluster.typed") |  |
| [ClusterSingletonSetup](ClusterSingletonSetup.html "class in akka.cluster.typed") | Can be used in [`ActorSystemSetup`](../../actor/setup/ActorSystemSetup.html "class in akka.actor.setup") when starting the `ActorSystem`  to replace the default implementation of the [`ClusterSingleton`](ClusterSingleton.html "class in akka.cluster.typed") extension. |
| [ClusterSingletonSetup$](ClusterSingletonSetup$.html "class in akka.cluster.typed") |  |
| [Down](Down.html "class in akka.cluster.typed") | Send command to DOWN the node specified by 'address'. |
| [Down$](Down$.html "class in akka.cluster.typed") |  |
| [GetCurrentState](GetCurrentState.html "class in akka.cluster.typed") |  |
| [GetCurrentState$](GetCurrentState$.html "class in akka.cluster.typed") |  |
| [Join](Join.html "class in akka.cluster.typed") | Try to join this cluster node with the node specified by 'address'. |
| [Join$](Join$.html "class in akka.cluster.typed") |  |
| [JoinSeedNodes](JoinSeedNodes.html "class in akka.cluster.typed") | Scala API: Join the specified seed nodes without defining them in config. |
| [JoinSeedNodes$](JoinSeedNodes$.html "class in akka.cluster.typed") |  |
| [Leave](Leave.html "class in akka.cluster.typed") | Send command to issue state transition to LEAVING for the node specified by 'address'. |
| [Leave$](Leave$.html "class in akka.cluster.typed") |  |
| [PrepareForFullClusterShutdown$](PrepareForFullClusterShutdown$.html "class in akka.cluster.typed") |  |
| [SelfRemoved](SelfRemoved.html "class in akka.cluster.typed") | Subscribe to this node being removed from the cluster. |
| [SelfRemoved$](SelfRemoved$.html "class in akka.cluster.typed") |  |
| [SelfUp](SelfUp.html "class in akka.cluster.typed") | Subscribe to this node being up, after sending this event the subscription is automatically  cancelled. |
| [SelfUp$](SelfUp$.html "class in akka.cluster.typed") |  |
| [SetAppVersionLater](SetAppVersionLater.html "class in akka.cluster.typed") | Scala API: If the `appVersion` is read from an external system (e.g. |
| [SetAppVersionLater$](SetAppVersionLater$.html "class in akka.cluster.typed") |  |
| [SingletonActor](SingletonActor.html "class in akka.cluster.typed")\<M\> |  |
| [SingletonActor$](SingletonActor$.html "class in akka.cluster.typed") |  |
| [Subscribe](Subscribe.html "class in akka.cluster.typed")\<A extends [ClusterEvent.ClusterDomainEvent](../ClusterEvent.ClusterDomainEvent.html "interface in akka.cluster")\> | Subscribe to cluster state changes. |
| [Subscribe$](Subscribe$.html "class in akka.cluster.typed") |  |
| [Unsubscribe](Unsubscribe.html "class in akka.cluster.typed")\<T\> |  |
| [Unsubscribe$](Unsubscribe$.html "class in akka.cluster.typed") |  |

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/current/akka/actor/setup/ActorSystemSetup.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/ClusterEvent.ClusterDomainEvent.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/typed/Cluster$.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/typed/Cluster.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/typed/ClusterCommand.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/typed/ClusterSetup$.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/typed/ClusterSetup.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/typed/ClusterSingleton$.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/typed/ClusterSingleton.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/typed/ClusterSingletonImpl$.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/typed/ClusterSingletonImpl.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/typed/ClusterSingletonManagerSettings$.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/typed/ClusterSingletonManagerSettings.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/typed/ClusterSingletonSettings$.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/typed/ClusterSingletonSettings.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/typed/ClusterSingletonSetup$.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/typed/ClusterSingletonSetup.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/typed/ClusterStateSubscription.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/typed/Down$.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/typed/Down.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/typed/GetCurrentState$.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/typed/GetCurrentState.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/typed/Join$.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/typed/Join.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/typed/JoinSeedNodes$.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/typed/JoinSeedNodes.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/typed/Leave$.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/typed/Leave.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/typed/PrepareForFullClusterShutdown$.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/typed/PrepareForFullClusterShutdown.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/typed/SelfRemoved$.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/typed/SelfRemoved.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/typed/SelfUp$.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/typed/SelfUp.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/typed/SetAppVersionLater$.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/typed/SetAppVersionLater.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/typed/SingletonActor$.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/typed/SingletonActor.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/typed/Subscribe$.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/typed/Subscribe.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/typed/Unsubscribe$.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/typed/Unsubscribe.html

---
*Source: [https://doc.akka.io/japi/akka-core/current/akka/cluster/typed/package-summary.html](https://doc.akka.io/japi/akka-core/current/akka/cluster/typed/package-summary.html)*