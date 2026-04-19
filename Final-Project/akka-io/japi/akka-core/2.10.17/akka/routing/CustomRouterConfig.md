---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:53:09Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/routing/CustomRouterConfig.html
title: CustomRouterConfig
---

# CustomRouterConfig

## Content

Package [akka.routing](package-summary.html)
## Class CustomRouterConfig

- java.lang.Object
- - akka.routing.CustomRouterConfig

- All Implemented Interfaces:
`[RouterConfig](RouterConfig.html "interface in akka.routing")`, `java.io.Serializable`

---

```
public abstract class CustomRouterConfig
extends java.lang.Object
implements [RouterConfig](RouterConfig.html "interface in akka.routing")
```

If a custom router implementation is not a [`Group`](Group.html "interface in akka.routing") nor
 a [`Pool`](Pool.html "interface in akka.routing") it may extend this base class.

See Also:
[Serialized Form](../../serialized-form.html#akka.routing.CustomRouterConfig)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[CustomRouterConfig](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `java.lang.String` | `[routerDispatcher](#routerDispatcher())()` | Dispatcher ID to use for running the \&ldquo;head\&rdquo; actor, which handles  supervision, death watch and router management messages |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.routing.[RouterConfig](RouterConfig.html "interface in akka.routing")
		
		
		`[createRouter](RouterConfig.html#createRouter(akka.actor.ActorSystem)), [isManagementMessage](RouterConfig.html#isManagementMessage(java.lang.Object)), [routingLogicController](RouterConfig.html#routingLogicController(akka.routing.RoutingLogic)), [stopRouterWhenAllRouteesRemoved](RouterConfig.html#stopRouterWhenAllRouteesRemoved()), [verifyConfig](RouterConfig.html#verifyConfig(akka.actor.ActorPath)), [withFallback](RouterConfig.html#withFallback(akka.routing.RouterConfig))`

- - ### Constructor Detail
	
	
	
		- #### CustomRouterConfig
		
		
		
		```
		public CustomRouterConfig()
		```

	- ### Method Detail
	
	
	
		- #### routerDispatcher
		
		
		
		```
		public java.lang.String routerDispatcher()
		```
		
		Description copied from interface: `[RouterConfig](RouterConfig.html#routerDispatcher())`
		Dispatcher ID to use for running the \&ldquo;head\&rdquo; actor, which handles
		 supervision, death watch and router management messages
		
		Specified by:
		`[routerDispatcher](RouterConfig.html#routerDispatcher())` in interface `[RouterConfig](RouterConfig.html "interface in akka.routing")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/routing/Group.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/routing/Pool.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/routing/RouterConfig.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/routing/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/routing/CustomRouterConfig.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/routing/CustomRouterConfig.html)*