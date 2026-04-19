---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:53:33Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/routing/PoolBase.html
title: PoolBase
---

# PoolBase

## Content

Package [akka.routing](package-summary.html)
## Class PoolBase

- java.lang.Object
- - akka.routing.PoolBase

- All Implemented Interfaces:
`[Pool](Pool.html "interface in akka.routing")`, `[RouterConfig](RouterConfig.html "interface in akka.routing")`, `java.io.Serializable`

---

```
public abstract class PoolBase
extends java.lang.Object
implements [Pool](Pool.html "interface in akka.routing")
```

Java API: Base class for custom router [`Pool`](Pool.html "interface in akka.routing")

See Also:
[Serialized Form](../../serialized-form.html#akka.routing.PoolBase)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[PoolBase](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.routing.[Pool](Pool.html "interface in akka.routing")
		
		
		`[createRouterActor](Pool.html#createRouterActor()), [enrichWithPoolDispatcher](Pool.html#enrichWithPoolDispatcher(akka.actor.Props,akka.actor.ActorContext)), [newRoutee](Pool.html#newRoutee(akka.actor.Props,akka.actor.ActorContext)), [nrOfInstances](Pool.html#nrOfInstances(akka.actor.ActorSystem)), [props](Pool.html#props(akka.actor.Props)), [resizer](Pool.html#resizer()), [stopRouterWhenAllRouteesRemoved](Pool.html#stopRouterWhenAllRouteesRemoved()), [supervisorStrategy](Pool.html#supervisorStrategy()), [usePoolDispatcher](Pool.html#usePoolDispatcher())`
		- ### Methods inherited from interface akka.routing.[RouterConfig](RouterConfig.html "interface in akka.routing")
		
		
		`[createRouter](RouterConfig.html#createRouter(akka.actor.ActorSystem)), [isManagementMessage](RouterConfig.html#isManagementMessage(java.lang.Object)), [routerDispatcher](RouterConfig.html#routerDispatcher()), [routingLogicController](RouterConfig.html#routingLogicController(akka.routing.RoutingLogic)), [verifyConfig](RouterConfig.html#verifyConfig(akka.actor.ActorPath)), [withFallback](RouterConfig.html#withFallback(akka.routing.RouterConfig))`

- - ### Constructor Detail
	
	
	
		- #### PoolBase
		
		
		
		```
		public PoolBase()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/routing/Pool.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/routing/RouterConfig.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/routing/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/routing/PoolBase.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/routing/PoolBase.html)*