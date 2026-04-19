---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:06:57Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/routing/RouterConfig.html
title: RouterConfig
---

# RouterConfig

## Content

Package [akka.routing](package-summary.html)
## Interface RouterConfig

- All Superinterfaces:
`java.io.Serializable`

All Known Subinterfaces:
`[ClusterRouterConfigBase](../cluster/routing/ClusterRouterConfigBase.html "interface in akka.cluster.routing")`, `[Group](Group.html "interface in akka.routing")`, `[Pool](Pool.html "interface in akka.routing")`, `[PoolOverrideUnsetConfig](PoolOverrideUnsetConfig.html "interface in akka.routing")<T>`

All Known Implementing Classes:
`[AdaptiveLoadBalancingGroup](../cluster/metrics/AdaptiveLoadBalancingGroup.html "class in akka.cluster.metrics")`, `[AdaptiveLoadBalancingPool](../cluster/metrics/AdaptiveLoadBalancingPool.html "class in akka.cluster.metrics")`, `[BalancingPool](BalancingPool.html "class in akka.routing")`, `[BroadcastGroup](BroadcastGroup.html "class in akka.routing")`, `[BroadcastPool](BroadcastPool.html "class in akka.routing")`, `[ClusterRouterGroup](../cluster/routing/ClusterRouterGroup.html "class in akka.cluster.routing")`, `[ClusterRouterPool](../cluster/routing/ClusterRouterPool.html "class in akka.cluster.routing")`, `[ConsistentHashingGroup](ConsistentHashingGroup.html "class in akka.routing")`, `[ConsistentHashingPool](ConsistentHashingPool.html "class in akka.routing")`, `[CustomRouterConfig](CustomRouterConfig.html "class in akka.routing")`, `[FromConfig](FromConfig.html "class in akka.routing")`, `[FromConfig$](FromConfig$.html "class in akka.routing")`, `[GroupBase](GroupBase.html "class in akka.routing")`, `[NoRouter](NoRouter.html "class in akka.routing")`, `[NoRouter$](NoRouter$.html "class in akka.routing")`, `[PoolBase](PoolBase.html "class in akka.routing")`, `[RandomGroup](RandomGroup.html "class in akka.routing")`, `[RandomPool](RandomPool.html "class in akka.routing")`, `[RemoteRouterConfig](../remote/routing/RemoteRouterConfig.html "class in akka.remote.routing")`, `[RoundRobinGroup](RoundRobinGroup.html "class in akka.routing")`, `[RoundRobinPool](RoundRobinPool.html "class in akka.routing")`, `[ScatterGatherFirstCompletedGroup](ScatterGatherFirstCompletedGroup.html "class in akka.routing")`, `[ScatterGatherFirstCompletedPool](ScatterGatherFirstCompletedPool.html "class in akka.routing")`, `[SmallestMailboxPool](SmallestMailboxPool.html "class in akka.routing")`, `[TailChoppingGroup](TailChoppingGroup.html "class in akka.routing")`, `[TailChoppingPool](TailChoppingPool.html "class in akka.routing")`

---

```
public interface RouterConfig
extends java.io.Serializable
```

This trait represents a router factory: it produces the actual router actor
 and creates the routing table (a function which determines the recipients
 for each message which is to be dispatched). The resulting RoutedActorRef
 optimizes the sending of the message so that it does NOT go through the
 router\&rsquo;s mailbox unless the route returns an empty recipient set.
 
 '''Caution:''' This means
 that the route function is evaluated concurrently without protection by
 the RoutedActorRef: either provide a reentrant (i.e. pure) implementation or
 do the locking yourself!
 

 '''Caution:''' Please note that the [`Router`](Router.html "class in akka.routing") which needs to
 be returned by `createActor()` should not send a message to itself in its
 constructor or `preStart()` or publish its self reference from there: if
 someone tries sending a message to that reference before the constructor of
 RoutedActorRef has returned, there will be a `NullPointerException`!

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `[Router](Router.html "class in akka.routing")` | `[createRouter](#createRouter(akka.actor.ActorSystem))​([ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)` | Create the actual router, responsible for routing messages to routees. |
	| `akka.routing.RouterActor` | `[createRouterActor](#createRouterActor())()` | INTERNAL API  The router "head" actor. |
	| `boolean` | `[isManagementMessage](#isManagementMessage(java.lang.Object))​(java.lang.Object msg)` | Is the message handled by the router head actor or the  [`routingLogicController(akka.routing.RoutingLogic)`](#routingLogicController(akka.routing.RoutingLogic)) actor. |
	| `java.lang.String` | `[routerDispatcher](#routerDispatcher())()` | Dispatcher ID to use for running the \&ldquo;head\&rdquo; actor, which handles  supervision, death watch and router management messages |
	| `scala.Option<[Props](../actor/Props.html "class in akka.actor")>` | `[routingLogicController](#routingLogicController(akka.routing.RoutingLogic))​([RoutingLogic](RoutingLogic.html "interface in akka.routing") routingLogic)` | Possibility to define an actor for controlling the routing  logic from external stimuli (e.g. |
	| `boolean` | `[stopRouterWhenAllRouteesRemoved](#stopRouterWhenAllRouteesRemoved())()` |  |
	| `void` | `[verifyConfig](#verifyConfig(akka.actor.ActorPath))​([ActorPath](../actor/ActorPath.html "interface in akka.actor") path)` | Check that everything is there which is needed. |
	| `[RouterConfig](RouterConfig.html "interface in akka.routing")` | `[withFallback](#withFallback(akka.routing.RouterConfig))​([RouterConfig](RouterConfig.html "interface in akka.routing") other)` | Overridable merge strategy, by default completely prefers `this` (i.e. |

- - ### Method Detail
	
	
	
		- #### createRouter
		
		
		
		```
		[Router](Router.html "class in akka.routing") createRouter​([ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)
		```
		
		Create the actual router, responsible for routing messages to routees.
		 
		
		Parameters:
		`system` \- the ActorSystem this router belongs to
		- #### createRouterActor
		
		
		
		```
		akka.routing.RouterActor createRouterActor()
		```
		
		INTERNAL API
		 The router "head" actor.
		- #### isManagementMessage
		
		
		
		```
		boolean isManagementMessage​(java.lang.Object msg)
		```
		
		Is the message handled by the router head actor or the
		 [`routingLogicController(akka.routing.RoutingLogic)`](#routingLogicController(akka.routing.RoutingLogic)) actor.
		- #### routerDispatcher
		
		
		
		```
		java.lang.String routerDispatcher()
		```
		
		Dispatcher ID to use for running the \&ldquo;head\&rdquo; actor, which handles
		 supervision, death watch and router management messages
		- #### routingLogicController
		
		
		
		```
		scala.Option<[Props](../actor/Props.html "class in akka.actor")> routingLogicController​([RoutingLogic](RoutingLogic.html "interface in akka.routing") routingLogic)
		```
		
		Possibility to define an actor for controlling the routing
		 logic from external stimuli (e.g. monitoring metrics).
		 This actor will be a child of the router "head" actor.
		 Management messages not handled by the "head" actor are
		 delegated to this controller actor.
		- #### stopRouterWhenAllRouteesRemoved
		
		
		
		```
		boolean stopRouterWhenAllRouteesRemoved()
		```
		- #### verifyConfig
		
		
		
		```
		void verifyConfig​([ActorPath](../actor/ActorPath.html "interface in akka.actor") path)
		```
		
		Check that everything is there which is needed. Called in constructor of RoutedActorRef to fail early.
		- #### withFallback
		
		
		
		```
		[RouterConfig](RouterConfig.html "interface in akka.routing") withFallback​([RouterConfig](RouterConfig.html "interface in akka.routing") other)
		```
		
		Overridable merge strategy, by default completely prefers `this` (i.e. no merge).

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/ActorPath.html
- https://doc.akka.io/japi/akka/current/akka/actor/ActorSystem.html
- https://doc.akka.io/japi/akka/current/akka/actor/Props.html
- https://doc.akka.io/japi/akka/current/akka/cluster/metrics/AdaptiveLoadBalancingGroup.html
- https://doc.akka.io/japi/akka/current/akka/cluster/metrics/AdaptiveLoadBalancingPool.html
- https://doc.akka.io/japi/akka/current/akka/cluster/routing/ClusterRouterConfigBase.html
- https://doc.akka.io/japi/akka/current/akka/cluster/routing/ClusterRouterGroup.html
- https://doc.akka.io/japi/akka/current/akka/cluster/routing/ClusterRouterPool.html
- https://doc.akka.io/japi/akka/current/akka/remote/routing/RemoteRouterConfig.html
- https://doc.akka.io/japi/akka/current/akka/routing/BalancingPool.html
- https://doc.akka.io/japi/akka/current/akka/routing/BroadcastGroup.html
- https://doc.akka.io/japi/akka/current/akka/routing/BroadcastPool.html
- https://doc.akka.io/japi/akka/current/akka/routing/ConsistentHashingGroup.html
- https://doc.akka.io/japi/akka/current/akka/routing/ConsistentHashingPool.html
- https://doc.akka.io/japi/akka/current/akka/routing/CustomRouterConfig.html
- https://doc.akka.io/japi/akka/current/akka/routing/FromConfig$.html
- https://doc.akka.io/japi/akka/current/akka/routing/FromConfig.html
- https://doc.akka.io/japi/akka/current/akka/routing/Group.html
- https://doc.akka.io/japi/akka/current/akka/routing/GroupBase.html
- https://doc.akka.io/japi/akka/current/akka/routing/NoRouter$.html
- https://doc.akka.io/japi/akka/current/akka/routing/NoRouter.html
- https://doc.akka.io/japi/akka/current/akka/routing/Pool.html
- https://doc.akka.io/japi/akka/current/akka/routing/PoolBase.html
- https://doc.akka.io/japi/akka/current/akka/routing/PoolOverrideUnsetConfig.html
- https://doc.akka.io/japi/akka/current/akka/routing/RandomGroup.html
- https://doc.akka.io/japi/akka/current/akka/routing/RandomPool.html
- https://doc.akka.io/japi/akka/current/akka/routing/RoundRobinGroup.html
- https://doc.akka.io/japi/akka/current/akka/routing/RoundRobinPool.html
- https://doc.akka.io/japi/akka/current/akka/routing/Router.html
- https://doc.akka.io/japi/akka/current/akka/routing/RouterConfig.html
- https://doc.akka.io/japi/akka/current/akka/routing/RoutingLogic.html
- https://doc.akka.io/japi/akka/current/akka/routing/ScatterGatherFirstCompletedGroup.html
- https://doc.akka.io/japi/akka/current/akka/routing/ScatterGatherFirstCompletedPool.html
- https://doc.akka.io/japi/akka/current/akka/routing/SmallestMailboxPool.html
- https://doc.akka.io/japi/akka/current/akka/routing/TailChoppingGroup.html
- https://doc.akka.io/japi/akka/current/akka/routing/TailChoppingPool.html
- https://doc.akka.io/japi/akka/current/akka/routing/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/routing/RouterConfig.html](https://doc.akka.io/japi/akka/current/akka/routing/RouterConfig.html)*