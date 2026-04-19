---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:56:01Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/routing/GroupRouterHelper$.html
title: GroupRouterHelper$
---

# GroupRouterHelper$

## Content

Package [akka.actor.typed.internal.routing](package-summary.html)
## Class GroupRouterHelper$

- java.lang.Object
- - akka.actor.typed.internal.routing.GroupRouterHelper$

- ---

```
public class GroupRouterHelper$
extends java.lang.Object
```

INTERNAL API

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [GroupRouterHelper$](GroupRouterHelper$.html "class in akka.actor.typed.internal.routing")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[GroupRouterHelper$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<T> scala.collection.immutable.Set<[ActorRef](../../ActorRef.html "interface in akka.actor.typed")<T>>` | `[routeesToUpdate](#routeesToUpdate(scala.collection.immutable.Set,boolean))​(scala.collection.immutable.Set<[ActorRef](../../ActorRef.html "interface in akka.actor.typed")<T>> allRoutees,  boolean preferLocalRoutees)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [GroupRouterHelper$](GroupRouterHelper$.html "class in akka.actor.typed.internal.routing") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### GroupRouterHelper$
		
		
		
		```
		public GroupRouterHelper$()
		```

	- ### Method Detail
	
	
	
		- #### routeesToUpdate
		
		
		
		```
		public <T> scala.collection.immutable.Set<[ActorRef](../../ActorRef.html "interface in akka.actor.typed")<T>> routeesToUpdate​(scala.collection.immutable.Set<[ActorRef](../../ActorRef.html "interface in akka.actor.typed")<T>> allRoutees,
		                                                                       boolean preferLocalRoutees)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/typed/ActorRef.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/routing/GroupRouterHelper$.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/routing/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/routing/GroupRouterHelper$.html](https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/routing/GroupRouterHelper$.html)*