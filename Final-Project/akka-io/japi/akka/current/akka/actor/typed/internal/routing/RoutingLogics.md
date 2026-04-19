---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:56:05Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/routing/RoutingLogics.RoundRobinLogic.html
title: RoutingLogics.RoundRobinLogic
---

# RoutingLogics.RoundRobinLogic

## Content

Package [akka.actor.typed.internal.routing](package-summary.html)
## Class RoutingLogics.RoundRobinLogic\<T\>

- java.lang.Object
- - akka.actor.typed.internal.routing.RoutingLogics.RoundRobinLogic\<T\>

- All Implemented Interfaces:
`[RoutingLogic](RoutingLogic.html "interface in akka.actor.typed.internal.routing")<T>`

Enclosing class:
[RoutingLogics](RoutingLogics.html "class in akka.actor.typed.internal.routing")

---

```
public static final class RoutingLogics.RoundRobinLogic<T>
extends java.lang.Object
implements [RoutingLogic](RoutingLogic.html "interface in akka.actor.typed.internal.routing")<T>
```

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[RoundRobinLogic](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `void` | `[routeesUpdated](#routeesUpdated(scala.collection.immutable.Set))​(scala.collection.immutable.Set<[ActorRef](../../ActorRef.html "interface in akka.actor.typed")<[T](RoutingLogics.RoundRobinLogic.html "type parameter in RoutingLogics.RoundRobinLogic")>> newRoutees)` | Invoked an initial time before `selectRoutee` is ever called and then every time the set of available  routees changes. |
	| `[ActorRef](../../ActorRef.html "interface in akka.actor.typed")<[T](RoutingLogics.RoundRobinLogic.html "type parameter in RoutingLogics.RoundRobinLogic")>` | `[selectRoutee](#selectRoutee(T))​([T](RoutingLogics.RoundRobinLogic.html "type parameter in RoutingLogics.RoundRobinLogic") msg)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### RoundRobinLogic
		
		
		
		```
		public RoundRobinLogic()
		```

	- ### Method Detail
	
	
	
		- #### routeesUpdated
		
		
		
		```
		public void routeesUpdated​(scala.collection.immutable.Set<[ActorRef](../../ActorRef.html "interface in akka.actor.typed")<[T](RoutingLogics.RoundRobinLogic.html "type parameter in RoutingLogics.RoundRobinLogic")>> newRoutees)
		```
		
		Description copied from interface: `[RoutingLogic](RoutingLogic.html#routeesUpdated(scala.collection.immutable.Set))`
		Invoked an initial time before `selectRoutee` is ever called and then every time the set of available
		 routees changes.
		 
		
		Specified by:
		`[routeesUpdated](RoutingLogic.html#routeesUpdated(scala.collection.immutable.Set))` in interface `[RoutingLogic](RoutingLogic.html "interface in akka.actor.typed.internal.routing")<[T](RoutingLogics.RoundRobinLogic.html "type parameter in RoutingLogics.RoundRobinLogic")>`
		Parameters:
		`newRoutees` \- The updated set of routees. For a group router this could be empty, in that case
		 `selectRoutee()` will not be called before `routeesUpdated` is invoked again with at
		 least one routee. For a pool the pool stops instead of ever calling `routeesUpdated`
		 with an empty list of routees.
		- #### selectRoutee
		
		
		
		```
		public [ActorRef](../../ActorRef.html "interface in akka.actor.typed")<[T](RoutingLogics.RoundRobinLogic.html "type parameter in RoutingLogics.RoundRobinLogic")> selectRoutee​([T](RoutingLogics.RoundRobinLogic.html "type parameter in RoutingLogics.RoundRobinLogic") msg)
		```
		
		
		Specified by:
		`[selectRoutee](RoutingLogic.html#selectRoutee(T))` in interface `[RoutingLogic](RoutingLogic.html "interface in akka.actor.typed.internal.routing")<[T](RoutingLogics.RoundRobinLogic.html "type parameter in RoutingLogics.RoundRobinLogic")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/typed/ActorRef.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/routing/RoutingLogic.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/routing/RoutingLogics.RoundRobinLogic.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/routing/RoutingLogics.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/routing/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/routing/RoutingLogics.RoundRobinLogic.html](https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/routing/RoutingLogics.RoundRobinLogic.html)*