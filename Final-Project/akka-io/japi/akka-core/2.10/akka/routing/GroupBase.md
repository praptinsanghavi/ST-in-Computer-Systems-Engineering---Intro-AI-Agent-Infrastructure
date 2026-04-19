---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:16:40Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/routing/GroupBase.html
title: GroupBase
---

# GroupBase

## Content

Package [akka.routing](package-summary.html)
## Class GroupBase

- java.lang.Object
- - akka.routing.GroupBase

- All Implemented Interfaces:
`[Group](Group.html "interface in akka.routing")`, `[RouterConfig](RouterConfig.html "interface in akka.routing")`, `java.io.Serializable`

---

```
public abstract class GroupBase
extends java.lang.Object
implements [Group](Group.html "interface in akka.routing")
```

Java API: Base class for custom router [`Group`](Group.html "interface in akka.routing")

See Also:
[Serialized Form](../../serialized-form.html#akka.routing.GroupBase)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[GroupBase](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `abstract java.lang.Iterable<java.lang.String>` | `[getPaths](#getPaths(akka.actor.ActorSystem))​([ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)` |  |
	| `scala.collection.immutable.Iterable<java.lang.String>` | `[paths](#paths(akka.actor.ActorSystem))​([ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.routing.[Group](Group.html "interface in akka.routing")
		
		
		`[createRouterActor](Group.html#createRouterActor()), [props](Group.html#props()), [routeeFor](Group.html#routeeFor(java.lang.String,akka.actor.ActorContext))`
		- ### Methods inherited from interface akka.routing.[RouterConfig](RouterConfig.html "interface in akka.routing")
		
		
		`[createRouter](RouterConfig.html#createRouter(akka.actor.ActorSystem)), [isManagementMessage](RouterConfig.html#isManagementMessage(java.lang.Object)), [routerDispatcher](RouterConfig.html#routerDispatcher()), [routingLogicController](RouterConfig.html#routingLogicController(akka.routing.RoutingLogic)), [stopRouterWhenAllRouteesRemoved](RouterConfig.html#stopRouterWhenAllRouteesRemoved()), [verifyConfig](RouterConfig.html#verifyConfig(akka.actor.ActorPath)), [withFallback](RouterConfig.html#withFallback(akka.routing.RouterConfig))`

- - ### Constructor Detail
	
	
	
		- #### GroupBase
		
		
		
		```
		public GroupBase()
		```

	- ### Method Detail
	
	
	
		- #### getPaths
		
		
		
		```
		public abstract java.lang.Iterable<java.lang.String> getPaths​([ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)
		```
		- #### paths
		
		
		
		```
		public final scala.collection.immutable.Iterable<java.lang.String> paths​([ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)
		```
		
		
		Specified by:
		`[paths](Group.html#paths(akka.actor.ActorSystem))` in interface `[Group](Group.html "interface in akka.routing")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10/akka/routing/Group.html
- https://doc.akka.io/japi/akka-core/2.10/akka/routing/RouterConfig.html
- https://doc.akka.io/japi/akka-core/2.10/akka/routing/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/routing/GroupBase.html](https://doc.akka.io/japi/akka-core/2.10/akka/routing/GroupBase.html)*