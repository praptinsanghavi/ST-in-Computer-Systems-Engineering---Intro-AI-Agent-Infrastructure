---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:20:27Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/cluster/routing/ClusterRouterConfigBase.html
title: ClusterRouterConfigBase
---

# ClusterRouterConfigBase

## Content

Package [akka.cluster.routing](package-summary.html)
## Interface ClusterRouterConfigBase

- All Superinterfaces:
`[RouterConfig](../../routing/RouterConfig.html "interface in akka.routing")`, `java.io.Serializable`

All Known Implementing Classes:
`[ClusterRouterGroup](ClusterRouterGroup.html "class in akka.cluster.routing")`, `[ClusterRouterPool](ClusterRouterPool.html "class in akka.cluster.routing")`

---

```
public interface ClusterRouterConfigBase
extends [RouterConfig](../../routing/RouterConfig.html "interface in akka.routing")
```

INTERNAL API

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `[Router](../../routing/Router.html "class in akka.routing")` | `[createRouter](#createRouter(akka.actor.ActorSystem))​([ActorSystem](../../actor/ActorSystem.html "class in akka.actor") system)` | Create the actual router, responsible for routing messages to routees. |
	| `boolean` | `[isManagementMessage](#isManagementMessage(java.lang.Object))​(java.lang.Object msg)` | Is the message handled by the router head actor or the  [`RouterConfig.routingLogicController(akka.routing.RoutingLogic)`](../../routing/RouterConfig.html#routingLogicController(akka.routing.RoutingLogic)) actor. |
	| `[RouterConfig](../../routing/RouterConfig.html "interface in akka.routing")` | `[local](#local())()` |  |
	| `java.lang.String` | `[routerDispatcher](#routerDispatcher())()` | Dispatcher ID to use for running the \&ldquo;head\&rdquo; actor, which handles  supervision, death watch and router management messages |
	| `scala.Option<[Props](../../actor/Props.html "class in akka.actor")>` | `[routingLogicController](#routingLogicController(akka.routing.RoutingLogic))​([RoutingLogic](../../routing/RoutingLogic.html "interface in akka.routing") routingLogic)` | Possibility to define an actor for controlling the routing  logic from external stimuli (e.g. |
	| `[ClusterRouterSettingsBase](ClusterRouterSettingsBase.html "interface in akka.cluster.routing")` | `[settings](#settings())()` |  |
	| `boolean` | `[stopRouterWhenAllRouteesRemoved](#stopRouterWhenAllRouteesRemoved())()` |  |
	| `boolean` | `[super$isManagementMessage](#super$isManagementMessage(java.lang.Object))​(java.lang.Object msg)` |  |
	
	
		- ### Methods inherited from interface akka.routing.[RouterConfig](../../routing/RouterConfig.html "interface in akka.routing")
		
		
		`[createRouterActor](../../routing/RouterConfig.html#createRouterActor()), [verifyConfig](../../routing/RouterConfig.html#verifyConfig(akka.actor.ActorPath)), [withFallback](../../routing/RouterConfig.html#withFallback(akka.routing.RouterConfig))`

- - ### Method Detail
	
	
	
		- #### createRouter
		
		
		
		```
		[Router](../../routing/Router.html "class in akka.routing") createRouter​([ActorSystem](../../actor/ActorSystem.html "class in akka.actor") system)
		```
		
		Description copied from interface: `[RouterConfig](../../routing/RouterConfig.html#createRouter(akka.actor.ActorSystem))`
		Create the actual router, responsible for routing messages to routees.
		 
		
		Specified by:
		`[createRouter](../../routing/RouterConfig.html#createRouter(akka.actor.ActorSystem))` in interface `[RouterConfig](../../routing/RouterConfig.html "interface in akka.routing")`
		Parameters:
		`system` \- the ActorSystem this router belongs to
		- #### isManagementMessage
		
		
		
		```
		boolean isManagementMessage​(java.lang.Object msg)
		```
		
		Description copied from interface: `[RouterConfig](../../routing/RouterConfig.html#isManagementMessage(java.lang.Object))`
		Is the message handled by the router head actor or the
		 [`RouterConfig.routingLogicController(akka.routing.RoutingLogic)`](../../routing/RouterConfig.html#routingLogicController(akka.routing.RoutingLogic)) actor.
		
		Specified by:
		`[isManagementMessage](../../routing/RouterConfig.html#isManagementMessage(java.lang.Object))` in interface `[RouterConfig](../../routing/RouterConfig.html "interface in akka.routing")`
		- #### local
		
		
		
		```
		[RouterConfig](../../routing/RouterConfig.html "interface in akka.routing") local()
		```
		- #### routerDispatcher
		
		
		
		```
		java.lang.String routerDispatcher()
		```
		
		Description copied from interface: `[RouterConfig](../../routing/RouterConfig.html#routerDispatcher())`
		Dispatcher ID to use for running the \&ldquo;head\&rdquo; actor, which handles
		 supervision, death watch and router management messages
		
		Specified by:
		`[routerDispatcher](../../routing/RouterConfig.html#routerDispatcher())` in interface `[RouterConfig](../../routing/RouterConfig.html "interface in akka.routing")`
		- #### routingLogicController
		
		
		
		```
		scala.Option<[Props](../../actor/Props.html "class in akka.actor")> routingLogicController​([RoutingLogic](../../routing/RoutingLogic.html "interface in akka.routing") routingLogic)
		```
		
		Description copied from interface: `[RouterConfig](../../routing/RouterConfig.html#routingLogicController(akka.routing.RoutingLogic))`
		Possibility to define an actor for controlling the routing
		 logic from external stimuli (e.g. monitoring metrics).
		 This actor will be a child of the router "head" actor.
		 Management messages not handled by the "head" actor are
		 delegated to this controller actor.
		
		Specified by:
		`[routingLogicController](../../routing/RouterConfig.html#routingLogicController(akka.routing.RoutingLogic))` in interface `[RouterConfig](../../routing/RouterConfig.html "interface in akka.routing")`
		- #### settings
		
		
		
		```
		[ClusterRouterSettingsBase](ClusterRouterSettingsBase.html "interface in akka.cluster.routing") settings()
		```
		- #### stopRouterWhenAllRouteesRemoved
		
		
		
		```
		boolean stopRouterWhenAllRouteesRemoved()
		```
		
		
		Specified by:
		`[stopRouterWhenAllRouteesRemoved](../../routing/RouterConfig.html#stopRouterWhenAllRouteesRemoved())` in interface `[RouterConfig](../../routing/RouterConfig.html "interface in akka.routing")`
		- #### super$isManagementMessage
		
		
		
		```
		boolean super$isManagementMessage​(java.lang.Object msg)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/Props.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/routing/ClusterRouterGroup.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/routing/ClusterRouterPool.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/routing/ClusterRouterSettingsBase.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/routing/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/akka/routing/Router.html
- https://doc.akka.io/japi/akka-core/2.10/akka/routing/RouterConfig.html
- https://doc.akka.io/japi/akka-core/2.10/akka/routing/RoutingLogic.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/cluster/routing/ClusterRouterConfigBase.html](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/routing/ClusterRouterConfigBase.html)*