---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:38:15Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/routing/Group.html
title: Group
---

# Group

## Content

Package [akka.routing](package-summary.html)
## Interface Group

- All Superinterfaces:
`[RouterConfig](RouterConfig.html "interface in akka.routing")`, `java.io.Serializable`

All Known Implementing Classes:
`[AdaptiveLoadBalancingGroup](../cluster/metrics/AdaptiveLoadBalancingGroup.html "class in akka.cluster.metrics")`, `[BroadcastGroup](BroadcastGroup.html "class in akka.routing")`, `[ClusterRouterGroup](../cluster/routing/ClusterRouterGroup.html "class in akka.cluster.routing")`, `[ConsistentHashingGroup](ConsistentHashingGroup.html "class in akka.routing")`, `[GroupBase](GroupBase.html "class in akka.routing")`, `[RandomGroup](RandomGroup.html "class in akka.routing")`, `[RoundRobinGroup](RoundRobinGroup.html "class in akka.routing")`, `[ScatterGatherFirstCompletedGroup](ScatterGatherFirstCompletedGroup.html "class in akka.routing")`, `[TailChoppingGroup](TailChoppingGroup.html "class in akka.routing")`

---

```
public interface Group
extends [RouterConfig](RouterConfig.html "interface in akka.routing")
```

`RouterConfig` for router actor with routee actors that are created external to the
 router and the router sends messages to the specified path using actor selection,
 without watching for termination.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `akka.routing.RouterActor` | `[createRouterActor](#createRouterActor())()` | INTERNAL API |
	| `scala.collection.immutable.Iterable<java.lang.String>` | `[paths](#paths(akka.actor.ActorSystem))​([ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)` |  |
	| `[Props](../actor/Props.html "class in akka.actor")` | `[props](#props())()` | [`Props`](../actor/Props.html "class in akka.actor") for a group router based on the settings defined by  this instance. |
	| `[Routee](Routee.html "interface in akka.routing")` | `[routeeFor](#routeeFor(java.lang.String,akka.actor.ActorContext))​(java.lang.String path,  [ActorContext](../actor/ActorContext.html "interface in akka.actor") context)` | INTERNAL API |
	
	
		- ### Methods inherited from interface akka.routing.[RouterConfig](RouterConfig.html "interface in akka.routing")
		
		
		`[createRouter](RouterConfig.html#createRouter(akka.actor.ActorSystem)), [isManagementMessage](RouterConfig.html#isManagementMessage(java.lang.Object)), [routerDispatcher](RouterConfig.html#routerDispatcher()), [routingLogicController](RouterConfig.html#routingLogicController(akka.routing.RoutingLogic)), [stopRouterWhenAllRouteesRemoved](RouterConfig.html#stopRouterWhenAllRouteesRemoved()), [verifyConfig](RouterConfig.html#verifyConfig(akka.actor.ActorPath)), [withFallback](RouterConfig.html#withFallback(akka.routing.RouterConfig))`

- - ### Method Detail
	
	
	
		- #### createRouterActor
		
		
		
		```
		akka.routing.RouterActor createRouterActor()
		```
		
		INTERNAL API
		
		Specified by:
		`[createRouterActor](RouterConfig.html#createRouterActor())` in interface `[RouterConfig](RouterConfig.html "interface in akka.routing")`
		- #### paths
		
		
		
		```
		scala.collection.immutable.Iterable<java.lang.String> paths​([ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)
		```
		- #### props
		
		
		
		```
		[Props](../actor/Props.html "class in akka.actor") props()
		```
		
		[`Props`](../actor/Props.html "class in akka.actor") for a group router based on the settings defined by
		 this instance.
		- #### routeeFor
		
		
		
		```
		[Routee](Routee.html "interface in akka.routing") routeeFor​(java.lang.String path,
		                 [ActorContext](../actor/ActorContext.html "interface in akka.actor") context)
		```
		
		INTERNAL API

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/ActorContext.html
- https://doc.akka.io/japi/akka/current/akka/actor/ActorSystem.html
- https://doc.akka.io/japi/akka/current/akka/actor/Props.html
- https://doc.akka.io/japi/akka/current/akka/cluster/metrics/AdaptiveLoadBalancingGroup.html
- https://doc.akka.io/japi/akka/current/akka/cluster/routing/ClusterRouterGroup.html
- https://doc.akka.io/japi/akka/current/akka/routing/BroadcastGroup.html
- https://doc.akka.io/japi/akka/current/akka/routing/ConsistentHashingGroup.html
- https://doc.akka.io/japi/akka/current/akka/routing/GroupBase.html
- https://doc.akka.io/japi/akka/current/akka/routing/RandomGroup.html
- https://doc.akka.io/japi/akka/current/akka/routing/RoundRobinGroup.html
- https://doc.akka.io/japi/akka/current/akka/routing/Routee.html
- https://doc.akka.io/japi/akka/current/akka/routing/RouterConfig.html
- https://doc.akka.io/japi/akka/current/akka/routing/ScatterGatherFirstCompletedGroup.html
- https://doc.akka.io/japi/akka/current/akka/routing/TailChoppingGroup.html
- https://doc.akka.io/japi/akka/current/akka/routing/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/routing/Group.html](https://doc.akka.io/japi/akka/current/akka/routing/Group.html)*