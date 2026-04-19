---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:47:52Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/current/akka/routing/package-summary.html
title: akka.routing
---

# akka.routing

## Content

# Package akka.routing

- Interface Summary 
| Interface | Description |
| [ConsistentHashingRouter.ConsistentHashable](ConsistentHashingRouter.ConsistentHashable.html "interface in akka.routing") | If you don't define the `hashMapping` when  constructing the [`ConsistentHashingRouter`](ConsistentHashingRouter.html "class in akka.routing")  the messages need to implement this interface to define what  data to use for the consistent hash key. |
| --- | --- |
| [ConsistentHashingRouter.ConsistentHashMapper](ConsistentHashingRouter.ConsistentHashMapper.html "interface in akka.routing") | JAVA API  Mapping from message to the data to use for the consistent hash key. |
| [Group](Group.html "interface in akka.routing") | `RouterConfig` for router actor with routee actors that are created external to the  router and the router sends messages to the specified path using actor selection,  without watching for termination. |
| [ListenerMessage](ListenerMessage.html "interface in akka.routing") |  |
| [Listeners](Listeners.html "interface in akka.routing") | Listeners is a generic trait to implement listening capability on an Actor. |
| [OptimalSizeExploringResizer](OptimalSizeExploringResizer.html "interface in akka.routing") |  |
| [Pool](Pool.html "interface in akka.routing") | `RouterConfig` for router actor that creates routees as child actors and removes  them from the router if they terminate. |
| [PoolOverrideUnsetConfig](PoolOverrideUnsetConfig.html "interface in akka.routing")\<T extends [Pool](Pool.html "interface in akka.routing")\> | INTERNAL API |
| [Resizer](Resizer.html "interface in akka.routing") | [`Pool`](Pool.html "interface in akka.routing") routers with dynamically resizable number of routees are implemented by providing a Resizer  implementation in the [`Pool`](Pool.html "interface in akka.routing") configuration. |
| [Routee](Routee.html "interface in akka.routing") | Abstraction of a destination for messages routed via a [`Router`](Router.html "class in akka.routing"). |
| [RouterConfig](RouterConfig.html "interface in akka.routing") | This trait represents a router factory: it produces the actual router actor  and creates the routing table (a function which determines the recipients  for each message which is to be dispatched). |
| [RouterEnvelope](RouterEnvelope.html "interface in akka.routing") | Only the contained message will be forwarded to the  destination, i.e. |
| [RouterManagementMesssage](RouterManagementMesssage.html "interface in akka.routing") | INTERNAL API |
| [RoutingLogic](RoutingLogic.html "interface in akka.routing") | The interface of the routing logic that is used in a [`Router`](Router.html "class in akka.routing") to select  destination routed messages. |
- Class Summary 
| Class | Description |
| [ActorRefRoutee](ActorRefRoutee.html "class in akka.routing") | [`Routee`](Routee.html "interface in akka.routing") that sends the messages to an [`ActorRef`](../actor/ActorRef.html "class in akka.actor"). |
| --- | --- |
| [ActorRefRoutee$](ActorRefRoutee$.html "class in akka.routing") |  |
| [ActorSelectionRoutee](ActorSelectionRoutee.html "class in akka.routing") | [`Routee`](Routee.html "interface in akka.routing") that sends the messages to an [`ActorSelection`](../actor/ActorSelection.html "class in akka.actor"). |
| [ActorSelectionRoutee$](ActorSelectionRoutee$.html "class in akka.routing") |  |
| [AddRoutee](AddRoutee.html "class in akka.routing") | Add a routee by sending this message to the router. |
| [AddRoutee$](AddRoutee$.html "class in akka.routing") |  |
| [AdjustPoolSize](AdjustPoolSize.html "class in akka.routing") | Increase or decrease the number of routees in a [`Pool`](Pool.html "interface in akka.routing"). |
| [AdjustPoolSize$](AdjustPoolSize$.html "class in akka.routing") |  |
| [BalancingPool](BalancingPool.html "class in akka.routing") | A router pool that will try to redistribute work from busy routees to idle routees. |
| [BalancingPool$](BalancingPool$.html "class in akka.routing") |  |
| [BalancingPoolDeploy](BalancingPoolDeploy.html "class in akka.routing") | INTERNAL API  Can't be in the `BalancingPool` companion for binary compatibility reasons. |
| [BalancingPoolDeploy$](BalancingPoolDeploy$.html "class in akka.routing") | INTERNAL API  Can't be in the `BalancingPool` companion for binary compatibility reasons. |
| [BalancingRoutingLogic$](BalancingRoutingLogic$.html "class in akka.routing") | INTERNAL API |
| [Broadcast](Broadcast.html "class in akka.routing") | Used to broadcast a message to all routees in a router; only the  contained message will be forwarded, i.e. |
| [Broadcast$](Broadcast$.html "class in akka.routing") |  |
| [BroadcastGroup](BroadcastGroup.html "class in akka.routing") | A router group that broadcasts a message to all its routees. |
| [BroadcastGroup$](BroadcastGroup$.html "class in akka.routing") |  |
| [BroadcastPool](BroadcastPool.html "class in akka.routing") | A router pool that broadcasts a message to all its routees. |
| [BroadcastPool$](BroadcastPool$.html "class in akka.routing") |  |
| [BroadcastRoutingLogic](BroadcastRoutingLogic.html "class in akka.routing") | Broadcasts a message to all its routees. |
| [BroadcastRoutingLogic$](BroadcastRoutingLogic$.html "class in akka.routing") |  |
| [ConsistentHash](ConsistentHash.html "class in akka.routing")\<T\> | Consistent Hashing node ring implementation. |
| [ConsistentHash$](ConsistentHash$.html "class in akka.routing") |  |
| [ConsistentHashingGroup](ConsistentHashingGroup.html "class in akka.routing") | A router group that uses consistent hashing to select a routee based on the  sent message. |
| [ConsistentHashingGroup$](ConsistentHashingGroup$.html "class in akka.routing") |  |
| [ConsistentHashingPool](ConsistentHashingPool.html "class in akka.routing") | A router pool that uses consistent hashing to select a routee based on the  sent message. |
| [ConsistentHashingPool$](ConsistentHashingPool$.html "class in akka.routing") |  |
| [ConsistentHashingRouter](ConsistentHashingRouter.html "class in akka.routing") |  |
| [ConsistentHashingRouter.ConsistentHashableEnvelope](ConsistentHashingRouter.ConsistentHashableEnvelope.html "class in akka.routing") | If you don't define the `hashMapping` when  constructing the [`ConsistentHashingRouter`](ConsistentHashingRouter.html "class in akka.routing")  and messages can't implement [`ConsistentHashingRouter.ConsistentHashable`](ConsistentHashingRouter.ConsistentHashable.html "interface in akka.routing")  themselves they can we wrapped by this envelope instead. |
| [ConsistentHashingRouter.ConsistentHashableEnvelope$](ConsistentHashingRouter.ConsistentHashableEnvelope$.html "class in akka.routing") |  |
| [ConsistentHashingRouter.emptyConsistentHashMapping$](ConsistentHashingRouter.emptyConsistentHashMapping$.html "class in akka.routing") |  |
| [ConsistentHashingRouter$](ConsistentHashingRouter$.html "class in akka.routing") |  |
| [ConsistentHashingRoutingLogic](ConsistentHashingRoutingLogic.html "class in akka.routing") |  |
| [ConsistentHashingRoutingLogic$](ConsistentHashingRoutingLogic$.html "class in akka.routing") |  |
| [ConsistentRoutee$](ConsistentRoutee$.html "class in akka.routing") |  |
| [CustomRouterConfig](CustomRouterConfig.html "class in akka.routing") | If a custom router implementation is not a [`Group`](Group.html "interface in akka.routing") nor  a [`Pool`](Pool.html "interface in akka.routing") it may extend this base class. |
| [Deafen](Deafen.html "class in akka.routing") |  |
| [Deafen$](Deafen$.html "class in akka.routing") |  |
| [DefaultOptimalSizeExploringResizer](DefaultOptimalSizeExploringResizer.html "class in akka.routing") | This resizer resizes the pool to an optimal size that provides  the most message throughput. |
| [DefaultOptimalSizeExploringResizer$](DefaultOptimalSizeExploringResizer$.html "class in akka.routing") |  |
| [DefaultResizer](DefaultResizer.html "class in akka.routing") |  |
| [DefaultResizer$](DefaultResizer$.html "class in akka.routing") |  |
| [FromConfig](FromConfig.html "class in akka.routing") | Java API: Wraps a [`Props`](../actor/Props.html "class in akka.actor") to mark the actor as externally configurable to be used with a router. |
| [FromConfig$](FromConfig$.html "class in akka.routing") | Wraps a [`Props`](../actor/Props.html "class in akka.actor") to mark the actor as externally configurable to be used with a router. |
| [GetRoutees](GetRoutees.html "class in akka.routing") | Sending this message to a router will make it send back its currently used routees. |
| [GetRoutees$](GetRoutees$.html "class in akka.routing") |  |
| [GroupBase](GroupBase.html "class in akka.routing") | Java API: Base class for custom router [`Group`](Group.html "interface in akka.routing") |
| [Listen](Listen.html "class in akka.routing") |  |
| [Listen$](Listen$.html "class in akka.routing") |  |
| [MurmurHash](MurmurHash.html "class in akka.routing") | An object designed to generate well\-distributed non\-cryptographic  hashes. |
| [MurmurHash$](MurmurHash$.html "class in akka.routing") | An object designed to generate well\-distributed non\-cryptographic  hashes. |
| [NoRoutee](NoRoutee.html "class in akka.routing") | [`Routee`](Routee.html "interface in akka.routing") that doesn't send the message to any routee. |
| [NoRoutee$](NoRoutee$.html "class in akka.routing") | [`Routee`](Routee.html "interface in akka.routing") that doesn't send the message to any routee. |
| [NoRouter](NoRouter.html "class in akka.routing") | Routing configuration that indicates no routing; this is also the default  value which hence overrides the merge strategy in order to accept values  from lower\-precedence sources. |
| [NoRouter$](NoRouter$.html "class in akka.routing") |  |
| [OptimalSizeExploringResizer.ResizeRecord](OptimalSizeExploringResizer.ResizeRecord.html "class in akka.routing") | INTERNAL API |
| [OptimalSizeExploringResizer.ResizeRecord$](OptimalSizeExploringResizer.ResizeRecord$.html "class in akka.routing") |  |
| [OptimalSizeExploringResizer.UnderUtilizationStreak](OptimalSizeExploringResizer.UnderUtilizationStreak.html "class in akka.routing") | INTERNAL API |
| [OptimalSizeExploringResizer.UnderUtilizationStreak$](OptimalSizeExploringResizer.UnderUtilizationStreak$.html "class in akka.routing") |  |
| [OptimalSizeExploringResizer$](OptimalSizeExploringResizer$.html "class in akka.routing") |  |
| [Pool$](Pool$.html "class in akka.routing") |  |
| [PoolBase](PoolBase.html "class in akka.routing") | Java API: Base class for custom router [`Pool`](Pool.html "interface in akka.routing") |
| [RandomGroup](RandomGroup.html "class in akka.routing") | A router group that randomly selects one of the target routees to send a message to. |
| [RandomGroup$](RandomGroup$.html "class in akka.routing") |  |
| [RandomPool](RandomPool.html "class in akka.routing") | A router pool that randomly selects one of the target routees to send a message to. |
| [RandomPool$](RandomPool$.html "class in akka.routing") |  |
| [RandomRoutingLogic](RandomRoutingLogic.html "class in akka.routing") | Randomly selects one of the target routees to send a message to |
| [RandomRoutingLogic$](RandomRoutingLogic$.html "class in akka.routing") |  |
| [RemoveRoutee](RemoveRoutee.html "class in akka.routing") | Remove a specific routee by sending this message to the router. |
| [RemoveRoutee$](RemoveRoutee$.html "class in akka.routing") |  |
| [ResizablePoolActor$](ResizablePoolActor$.html "class in akka.routing") | INTERNAL API |
| [Resizer$](Resizer$.html "class in akka.routing") |  |
| [RoundRobinGroup](RoundRobinGroup.html "class in akka.routing") | A router group that uses round\-robin to select a routee. |
| [RoundRobinGroup$](RoundRobinGroup$.html "class in akka.routing") |  |
| [RoundRobinPool](RoundRobinPool.html "class in akka.routing") | A router pool that uses round\-robin to select a routee. |
| [RoundRobinPool$](RoundRobinPool$.html "class in akka.routing") |  |
| [RoundRobinRoutingLogic](RoundRobinRoutingLogic.html "class in akka.routing") | Uses round\-robin to select a routee. |
| [RoundRobinRoutingLogic$](RoundRobinRoutingLogic$.html "class in akka.routing") |  |
| [RoutedActorCell$](RoutedActorCell$.html "class in akka.routing") | INTERNAL API |
| [Routees](Routees.html "class in akka.routing") | Message used to carry information about what routees the router is currently using. |
| [Routees$](Routees$.html "class in akka.routing") |  |
| [Router](Router.html "class in akka.routing") | For each message that is sent through the router via the [`Router.route(java.lang.Object, akka.actor.ActorRef)`](Router.html#route(java.lang.Object,akka.actor.ActorRef)) method the  [`RoutingLogic`](RoutingLogic.html "interface in akka.routing") decides to which [`Routee`](Routee.html "interface in akka.routing") to send the message. |
| [Router$](Router$.html "class in akka.routing") |  |
| [ScatterGatherFirstCompletedGroup](ScatterGatherFirstCompletedGroup.html "class in akka.routing") | A router group that broadcasts the message to all routees, and replies with the first response. |
| [ScatterGatherFirstCompletedGroup$](ScatterGatherFirstCompletedGroup$.html "class in akka.routing") |  |
| [ScatterGatherFirstCompletedPool](ScatterGatherFirstCompletedPool.html "class in akka.routing") | A router pool that broadcasts the message to all routees, and replies with the first response. |
| [ScatterGatherFirstCompletedPool$](ScatterGatherFirstCompletedPool$.html "class in akka.routing") |  |
| [ScatterGatherFirstCompletedRoutees$](ScatterGatherFirstCompletedRoutees$.html "class in akka.routing") |  |
| [ScatterGatherFirstCompletedRoutingLogic](ScatterGatherFirstCompletedRoutingLogic.html "class in akka.routing") | Broadcasts the message to all routees, and replies with the first response. |
| [ScatterGatherFirstCompletedRoutingLogic$](ScatterGatherFirstCompletedRoutingLogic$.html "class in akka.routing") |  |
| [SeveralRoutees](SeveralRoutees.html "class in akka.routing") | [`Routee`](Routee.html "interface in akka.routing") that sends each message to all `routees`. |
| [SeveralRoutees$](SeveralRoutees$.html "class in akka.routing") |  |
| [SmallestMailboxPool](SmallestMailboxPool.html "class in akka.routing") | A router pool that tries to send to the non\-suspended routee with fewest messages in mailbox. |
| [SmallestMailboxPool$](SmallestMailboxPool$.html "class in akka.routing") |  |
| [SmallestMailboxRoutingLogic](SmallestMailboxRoutingLogic.html "class in akka.routing") | Tries to send to the non\-suspended routee with fewest messages in mailbox. |
| [SmallestMailboxRoutingLogic$](SmallestMailboxRoutingLogic$.html "class in akka.routing") |  |
| [TailChoppingGroup](TailChoppingGroup.html "class in akka.routing") | A router group with retry logic, intended for cases where a return message is expected in  response to a message sent to the routee. |
| [TailChoppingGroup$](TailChoppingGroup$.html "class in akka.routing") |  |
| [TailChoppingPool](TailChoppingPool.html "class in akka.routing") | A router pool with retry logic, intended for cases where a return message is expected in  response to a message sent to the routee. |
| [TailChoppingPool$](TailChoppingPool$.html "class in akka.routing") |  |
| [TailChoppingRoutees$](TailChoppingRoutees$.html "class in akka.routing") |  |
| [TailChoppingRoutingLogic](TailChoppingRoutingLogic.html "class in akka.routing") | As each message is sent to the router, the routees are randomly ordered. |
| [TailChoppingRoutingLogic$](TailChoppingRoutingLogic$.html "class in akka.routing") |  |
| [WithListeners](WithListeners.html "class in akka.routing") |  |
| [WithListeners$](WithListeners$.html "class in akka.routing") |  |
- Exception Summary 
| Exception | Description |
| [ResizerInitializationException](ResizerInitializationException.html "class in akka.routing") |  |
| --- | --- |

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/current/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka-core/current/akka/actor/ActorSelection.html
- https://doc.akka.io/japi/akka-core/current/akka/actor/Props.html
- https://doc.akka.io/japi/akka-core/current/akka/routing/ActorRefRoutee$.html
- https://doc.akka.io/japi/akka-core/current/akka/routing/ActorRefRoutee.html
- https://doc.akka.io/japi/akka-core/current/akka/routing/ActorSelectionRoutee$.html
- https://doc.akka.io/japi/akka-core/current/akka/routing/ActorSelectionRoutee.html
- https://doc.akka.io/japi/akka-core/current/akka/routing/AddRoutee$.html
- https://doc.akka.io/japi/akka-core/current/akka/routing/AddRoutee.html
- https://doc.akka.io/japi/akka-core/current/akka/routing/AdjustPoolSize$.html
- https://doc.akka.io/japi/akka-core/current/akka/routing/AdjustPoolSize.html
- https://doc.akka.io/japi/akka-core/current/akka/routing/BalancingPool$.html
- https://doc.akka.io/japi/akka-core/current/akka/routing/BalancingPool.html
- https://doc.akka.io/japi/akka-core/current/akka/routing/BalancingPoolDeploy$.html
- https://doc.akka.io/japi/akka-core/current/akka/routing/BalancingPoolDeploy.html
- https://doc.akka.io/japi/akka-core/current/akka/routing/BalancingRoutingLogic$.html
- https://doc.akka.io/japi/akka-core/current/akka/routing/Broadcast$.html
- https://doc.akka.io/japi/akka-core/current/akka/routing/Broadcast.html
- https://doc.akka.io/japi/akka-core/current/akka/routing/BroadcastGroup$.html
- https://doc.akka.io/japi/akka-core/current/akka/routing/BroadcastGroup.html
- https://doc.akka.io/japi/akka-core/current/akka/routing/BroadcastPool$.html
- https://doc.akka.io/japi/akka-core/current/akka/routing/BroadcastPool.html
- https://doc.akka.io/japi/akka-core/current/akka/routing/BroadcastRoutingLogic$.html
- https://doc.akka.io/japi/akka-core/current/akka/routing/BroadcastRoutingLogic.html
- https://doc.akka.io/japi/akka-core/current/akka/routing/ConsistentHash$.html
- https://doc.akka.io/japi/akka-core/current/akka/routing/ConsistentHash.html
- https://doc.akka.io/japi/akka-core/current/akka/routing/ConsistentHashingGroup$.html
- https://doc.akka.io/japi/akka-core/current/akka/routing/ConsistentHashingGroup.html
- https://doc.akka.io/japi/akka-core/current/akka/routing/ConsistentHashingPool$.html
- https://doc.akka.io/japi/akka-core/current/akka/routing/ConsistentHashingPool.html
- https://doc.akka.io/japi/akka-core/current/akka/routing/ConsistentHashingRouter$.html
- https://doc.akka.io/japi/akka-core/current/akka/routing/ConsistentHashingRouter.ConsistentHashMapper.html
- https://doc.akka.io/japi/akka-core/current/akka/routing/ConsistentHashingRouter.ConsistentHashable.html
- https://doc.akka.io/japi/akka-core/current/akka/routing/ConsistentHashingRouter.ConsistentHashableEnvelope$.html
- https://doc.akka.io/japi/akka-core/current/akka/routing/ConsistentHashingRouter.ConsistentHashableEnvelope.html
- https://doc.akka.io/japi/akka-core/current/akka/routing/ConsistentHashingRouter.emptyConsistentHashMapping$.html
- https://doc.akka.io/japi/akka-core/current/akka/routing/ConsistentHashingRouter.html
- https://doc.akka.io/japi/akka-core/current/akka/routing/ConsistentHashingRoutingLogic$.html
- https://doc.akka.io/japi/akka-core/current/akka/routing/ConsistentHashingRoutingLogic.html
- https://doc.akka.io/japi/akka-core/current/akka/routing/ConsistentRoutee$.html
- https://doc.akka.io/japi/akka-core/current/akka/routing/CustomRouterConfig.html
- https://doc.akka.io/japi/akka-core/current/akka/routing/Deafen$.html
- https://doc.akka.io/japi/akka-core/current/akka/routing/Deafen.html
- https://doc.akka.io/japi/akka-core/current/akka/routing/DefaultOptimalSizeExploringResizer$.html
- https://doc.akka.io/japi/akka-core/current/akka/routing/DefaultOptimalSizeExploringResizer.html
- https://doc.akka.io/japi/akka-core/current/akka/routing/DefaultResizer$.html
- https://doc.akka.io/japi/akka-core/current/akka/routing/DefaultResizer.html
- https://doc.akka.io/japi/akka-core/current/akka/routing/FromConfig$.html
- https://doc.akka.io/japi/akka-core/current/akka/routing/FromConfig.html
- https://doc.akka.io/japi/akka-core/current/akka/routing/GetRoutees$.html

---
*Source: [https://doc.akka.io/japi/akka-core/current/akka/routing/package-summary.html](https://doc.akka.io/japi/akka-core/current/akka/routing/package-summary.html)*