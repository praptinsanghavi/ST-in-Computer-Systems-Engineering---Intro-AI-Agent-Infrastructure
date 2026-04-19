---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:38:19Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/routing/PoolOverrideUnsetConfig.html
title: PoolOverrideUnsetConfig
---

# PoolOverrideUnsetConfig

## Content

Package [akka.routing](package-summary.html)
## Interface PoolOverrideUnsetConfig\<T extends [Pool](Pool.html "interface in akka.routing")\>

- All Superinterfaces:
`[Pool](Pool.html "interface in akka.routing")`, `[RouterConfig](RouterConfig.html "interface in akka.routing")`, `java.io.Serializable`

All Known Implementing Classes:
`[BroadcastPool](BroadcastPool.html "class in akka.routing")`, `[ConsistentHashingPool](ConsistentHashingPool.html "class in akka.routing")`, `[RandomPool](RandomPool.html "class in akka.routing")`, `[RoundRobinPool](RoundRobinPool.html "class in akka.routing")`, `[ScatterGatherFirstCompletedPool](ScatterGatherFirstCompletedPool.html "class in akka.routing")`, `[SmallestMailboxPool](SmallestMailboxPool.html "class in akka.routing")`, `[TailChoppingPool](TailChoppingPool.html "class in akka.routing")`

---

```
public interface PoolOverrideUnsetConfig<T extends [Pool](Pool.html "interface in akka.routing")>
extends [Pool](Pool.html "interface in akka.routing")
```

INTERNAL API
 
 Used to override unset configuration in a router.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `[RouterConfig](RouterConfig.html "interface in akka.routing")` | `[overrideUnsetConfig](#overrideUnsetConfig(akka.routing.RouterConfig))​([RouterConfig](RouterConfig.html "interface in akka.routing") other)` |  |
	| `[T](PoolOverrideUnsetConfig.html "type parameter in PoolOverrideUnsetConfig")` | `[withResizer](#withResizer(akka.routing.Resizer))​([Resizer](Resizer.html "interface in akka.routing") resizer)` |  |
	| `[T](PoolOverrideUnsetConfig.html "type parameter in PoolOverrideUnsetConfig")` | `[withSupervisorStrategy](#withSupervisorStrategy(akka.actor.SupervisorStrategy))​([SupervisorStrategy](../actor/SupervisorStrategy.html "class in akka.actor") strategy)` |  |
	
	
		- ### Methods inherited from interface akka.routing.[Pool](Pool.html "interface in akka.routing")
		
		
		`[createRouterActor](Pool.html#createRouterActor()), [enrichWithPoolDispatcher](Pool.html#enrichWithPoolDispatcher(akka.actor.Props,akka.actor.ActorContext)), [newRoutee](Pool.html#newRoutee(akka.actor.Props,akka.actor.ActorContext)), [nrOfInstances](Pool.html#nrOfInstances(akka.actor.ActorSystem)), [props](Pool.html#props(akka.actor.Props)), [resizer](Pool.html#resizer()), [stopRouterWhenAllRouteesRemoved](Pool.html#stopRouterWhenAllRouteesRemoved()), [supervisorStrategy](Pool.html#supervisorStrategy()), [usePoolDispatcher](Pool.html#usePoolDispatcher())`
		- ### Methods inherited from interface akka.routing.[RouterConfig](RouterConfig.html "interface in akka.routing")
		
		
		`[createRouter](RouterConfig.html#createRouter(akka.actor.ActorSystem)), [isManagementMessage](RouterConfig.html#isManagementMessage(java.lang.Object)), [routerDispatcher](RouterConfig.html#routerDispatcher()), [routingLogicController](RouterConfig.html#routingLogicController(akka.routing.RoutingLogic)), [verifyConfig](RouterConfig.html#verifyConfig(akka.actor.ActorPath)), [withFallback](RouterConfig.html#withFallback(akka.routing.RouterConfig))`

- - ### Method Detail
	
	
	
		- #### overrideUnsetConfig
		
		
		
		```
		[RouterConfig](RouterConfig.html "interface in akka.routing") overrideUnsetConfig​([RouterConfig](RouterConfig.html "interface in akka.routing") other)
		```
		- #### withResizer
		
		
		
		```
		[T](PoolOverrideUnsetConfig.html "type parameter in PoolOverrideUnsetConfig") withResizer​([Resizer](Resizer.html "interface in akka.routing") resizer)
		```
		- #### withSupervisorStrategy
		
		
		
		```
		[T](PoolOverrideUnsetConfig.html "type parameter in PoolOverrideUnsetConfig") withSupervisorStrategy​([SupervisorStrategy](../actor/SupervisorStrategy.html "class in akka.actor") strategy)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/SupervisorStrategy.html
- https://doc.akka.io/japi/akka/current/akka/routing/BroadcastPool.html
- https://doc.akka.io/japi/akka/current/akka/routing/ConsistentHashingPool.html
- https://doc.akka.io/japi/akka/current/akka/routing/Pool.html
- https://doc.akka.io/japi/akka/current/akka/routing/PoolOverrideUnsetConfig.html
- https://doc.akka.io/japi/akka/current/akka/routing/RandomPool.html
- https://doc.akka.io/japi/akka/current/akka/routing/Resizer.html
- https://doc.akka.io/japi/akka/current/akka/routing/RoundRobinPool.html
- https://doc.akka.io/japi/akka/current/akka/routing/RouterConfig.html
- https://doc.akka.io/japi/akka/current/akka/routing/ScatterGatherFirstCompletedPool.html
- https://doc.akka.io/japi/akka/current/akka/routing/SmallestMailboxPool.html
- https://doc.akka.io/japi/akka/current/akka/routing/TailChoppingPool.html
- https://doc.akka.io/japi/akka/current/akka/routing/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/routing/PoolOverrideUnsetConfig.html](https://doc.akka.io/japi/akka/current/akka/routing/PoolOverrideUnsetConfig.html)*