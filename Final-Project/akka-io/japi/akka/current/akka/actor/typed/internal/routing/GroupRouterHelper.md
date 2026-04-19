---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:56:00Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/routing/GroupRouterHelper.html
title: GroupRouterHelper
---

# GroupRouterHelper

## Content

Package [akka.actor.typed.internal.routing](package-summary.html)
## Class GroupRouterHelper

- java.lang.Object
- - akka.actor.typed.internal.routing.GroupRouterHelper

- ---

```
public class GroupRouterHelper
extends java.lang.Object
```

INTERNAL API

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[GroupRouterHelper](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static <T> scala.collection.immutable.Set<[ActorRef](../../ActorRef.html "interface in akka.actor.typed")<T>>` | `[routeesToUpdate](#routeesToUpdate(scala.collection.immutable.Set,boolean))​(scala.collection.immutable.Set<[ActorRef](../../ActorRef.html "interface in akka.actor.typed")<T>> allRoutees,  boolean preferLocalRoutees)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### GroupRouterHelper
		
		
		
		```
		public GroupRouterHelper()
		```

	- ### Method Detail
	
	
	
		- #### routeesToUpdate
		
		
		
		```
		public static <T> scala.collection.immutable.Set<[ActorRef](../../ActorRef.html "interface in akka.actor.typed")<T>> routeesToUpdate​(scala.collection.immutable.Set<[ActorRef](../../ActorRef.html "interface in akka.actor.typed")<T>> allRoutees,
		                                                                              boolean preferLocalRoutees)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/typed/ActorRef.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/routing/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/routing/GroupRouterHelper.html](https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/routing/GroupRouterHelper.html)*