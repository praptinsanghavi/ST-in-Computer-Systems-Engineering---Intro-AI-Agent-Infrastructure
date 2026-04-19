---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:39:08Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/routing/Pool.html
title: Pool
---

# Pool

## Content

Package [akka.routing](package-summary.html)
## Interface Pool

- All Superinterfaces:
`[RouterConfig](RouterConfig.html "interface in akka.routing")`, `java.io.Serializable`

All Known Subinterfaces:
`[PoolOverrideUnsetConfig](PoolOverrideUnsetConfig.html "interface in akka.routing")<T>`

All Known Implementing Classes:
`[AdaptiveLoadBalancingPool](../cluster/metrics/AdaptiveLoadBalancingPool.html "class in akka.cluster.metrics")`, `[BalancingPool](BalancingPool.html "class in akka.routing")`, `[BroadcastPool](BroadcastPool.html "class in akka.routing")`, `[ClusterRouterPool](../cluster/routing/ClusterRouterPool.html "class in akka.cluster.routing")`, `[ConsistentHashingPool](ConsistentHashingPool.html "class in akka.routing")`, `[FromConfig](FromConfig.html "class in akka.routing")`, `[FromConfig$](FromConfig$.html "class in akka.routing")`, `[PoolBase](PoolBase.html "class in akka.routing")`, `[RandomPool](RandomPool.html "class in akka.routing")`, `[RemoteRouterConfig](../remote/routing/RemoteRouterConfig.html "class in akka.remote.routing")`, `[RoundRobinPool](RoundRobinPool.html "class in akka.routing")`, `[ScatterGatherFirstCompletedPool](ScatterGatherFirstCompletedPool.html "class in akka.routing")`, `[SmallestMailboxPool](SmallestMailboxPool.html "class in akka.routing")`, `[TailChoppingPool](TailChoppingPool.html "class in akka.routing")`

---

```
public interface Pool
extends [RouterConfig](RouterConfig.html "interface in akka.routing")
```

`RouterConfig` for router actor that creates routees as child actors and removes
 them from the router if they terminate.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `akka.routing.RouterActor` | `[createRouterActor](#createRouterActor())()` | INTERNAL API |
	| `[Props](../actor/Props.html "class in akka.actor")` | `[enrichWithPoolDispatcher](#enrichWithPoolDispatcher(akka.actor.Props,akka.actor.ActorContext))​([Props](../actor/Props.html "class in akka.actor") routeeProps,  [ActorContext](../actor/ActorContext.html "interface in akka.actor") context)` | INTERNAL API |
	| `[Routee](Routee.html "interface in akka.routing")` | `[newRoutee](#newRoutee(akka.actor.Props,akka.actor.ActorContext))​([Props](../actor/Props.html "class in akka.actor") routeeProps,  [ActorContext](../actor/ActorContext.html "interface in akka.actor") context)` | INTERNAL API |
	| `int` | `[nrOfInstances](#nrOfInstances(akka.actor.ActorSystem))​([ActorSystem](../actor/ActorSystem.html "class in akka.actor") sys)` | Initial number of routee instances |
	| `[Props](../actor/Props.html "class in akka.actor")` | `[props](#props(akka.actor.Props))​([Props](../actor/Props.html "class in akka.actor") routeeProps)` | [`Props`](../actor/Props.html "class in akka.actor") for a pool router based on the settings defined by  this instance and the supplied [`Props`](../actor/Props.html "class in akka.actor") for the routees created by the  router. |
	| `scala.Option<[Resizer](Resizer.html "interface in akka.routing")>` | `[resizer](#resizer())()` | Pool with dynamically resizable number of routees return the [`Resizer`](Resizer.html "interface in akka.routing")  to use. |
	| `boolean` | `[stopRouterWhenAllRouteesRemoved](#stopRouterWhenAllRouteesRemoved())()` |  |
	| `[SupervisorStrategy](../actor/SupervisorStrategy.html "class in akka.actor")` | `[supervisorStrategy](#supervisorStrategy())()` | SupervisorStrategy for the head actor, i.e. |
	| `boolean` | `[usePoolDispatcher](#usePoolDispatcher())()` | Use a dedicated dispatcher for the routees of the pool. |
	
	
		- ### Methods inherited from interface akka.routing.[RouterConfig](RouterConfig.html "interface in akka.routing")
		
		
		`[createRouter](RouterConfig.html#createRouter(akka.actor.ActorSystem)), [isManagementMessage](RouterConfig.html#isManagementMessage(java.lang.Object)), [routerDispatcher](RouterConfig.html#routerDispatcher()), [routingLogicController](RouterConfig.html#routingLogicController(akka.routing.RoutingLogic)), [verifyConfig](RouterConfig.html#verifyConfig(akka.actor.ActorPath)), [withFallback](RouterConfig.html#withFallback(akka.routing.RouterConfig))`

- - ### Method Detail
	
	
	
		- #### nrOfInstances
		
		
		
		```
		int nrOfInstances​([ActorSystem](../actor/ActorSystem.html "class in akka.actor") sys)
		```
		
		Initial number of routee instances
		- #### usePoolDispatcher
		
		
		
		```
		boolean usePoolDispatcher()
		```
		
		Use a dedicated dispatcher for the routees of the pool.
		 The dispatcher is defined in 'pool\-dispatcher' configuration property in the
		 deployment section of the router.
		- #### newRoutee
		
		
		
		```
		[Routee](Routee.html "interface in akka.routing") newRoutee​([Props](../actor/Props.html "class in akka.actor") routeeProps,
		                 [ActorContext](../actor/ActorContext.html "interface in akka.actor") context)
		```
		
		INTERNAL API
		- #### enrichWithPoolDispatcher
		
		
		
		```
		[Props](../actor/Props.html "class in akka.actor") enrichWithPoolDispatcher​([Props](../actor/Props.html "class in akka.actor") routeeProps,
		                               [ActorContext](../actor/ActorContext.html "interface in akka.actor") context)
		```
		
		INTERNAL API
		- #### resizer
		
		
		
		```
		scala.Option<[Resizer](Resizer.html "interface in akka.routing")> resizer()
		```
		
		Pool with dynamically resizable number of routees return the [`Resizer`](Resizer.html "interface in akka.routing")
		 to use. The resizer is invoked once when the router is created, before any messages can
		 be sent to it. Resize is also triggered when messages are sent to the routees, and the
		 resizer is invoked asynchronously, i.e. not necessarily before the message has been sent.
		- #### supervisorStrategy
		
		
		
		```
		[SupervisorStrategy](../actor/SupervisorStrategy.html "class in akka.actor") supervisorStrategy()
		```
		
		SupervisorStrategy for the head actor, i.e. for supervising the routees of the pool.
		- #### props
		
		
		
		```
		[Props](../actor/Props.html "class in akka.actor") props​([Props](../actor/Props.html "class in akka.actor") routeeProps)
		```
		
		[`Props`](../actor/Props.html "class in akka.actor") for a pool router based on the settings defined by
		 this instance and the supplied [`Props`](../actor/Props.html "class in akka.actor") for the routees created by the
		 router.
		- #### stopRouterWhenAllRouteesRemoved
		
		
		
		```
		boolean stopRouterWhenAllRouteesRemoved()
		```
		
		
		Specified by:
		`[stopRouterWhenAllRouteesRemoved](RouterConfig.html#stopRouterWhenAllRouteesRemoved())` in interface `[RouterConfig](RouterConfig.html "interface in akka.routing")`
		- #### createRouterActor
		
		
		
		```
		akka.routing.RouterActor createRouterActor()
		```
		
		INTERNAL API
		
		Specified by:
		`[createRouterActor](RouterConfig.html#createRouterActor())` in interface `[RouterConfig](RouterConfig.html "interface in akka.routing")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ActorContext.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/Props.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/SupervisorStrategy.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/metrics/AdaptiveLoadBalancingPool.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/routing/ClusterRouterPool.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/routing/RemoteRouterConfig.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/routing/BalancingPool.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/routing/BroadcastPool.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/routing/ConsistentHashingPool.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/routing/FromConfig$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/routing/FromConfig.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/routing/PoolBase.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/routing/PoolOverrideUnsetConfig.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/routing/RandomPool.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/routing/Resizer.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/routing/RoundRobinPool.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/routing/Routee.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/routing/RouterConfig.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/routing/ScatterGatherFirstCompletedPool.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/routing/SmallestMailboxPool.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/routing/TailChoppingPool.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/routing/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/routing/Pool.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/routing/Pool.html)*