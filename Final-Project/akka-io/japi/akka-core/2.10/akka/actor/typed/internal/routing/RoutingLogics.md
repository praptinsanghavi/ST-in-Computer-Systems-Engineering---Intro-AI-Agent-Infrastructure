---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:01:02Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/internal/routing/RoutingLogics.RandomLogic.html
title: RoutingLogics.RandomLogic
---

# RoutingLogics.RandomLogic

## Content

Package [akka.actor.typed.internal.routing](package-summary.html)
## Class RoutingLogics.RandomLogic\<T\>

- java.lang.Object
- - akka.actor.typed.internal.routing.RoutingLogics.RandomLogic\<T\>

- All Implemented Interfaces:
`[RoutingLogic](RoutingLogic.html "interface in akka.actor.typed.internal.routing")<T>`

Enclosing class:
[RoutingLogics](RoutingLogics.html "class in akka.actor.typed.internal.routing")

---

```
public static final class RoutingLogics.RandomLogic<T>
extends java.lang.Object
implements [RoutingLogic](RoutingLogic.html "interface in akka.actor.typed.internal.routing")<T>
```

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[RandomLogic](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `void` | `[routeesUpdated](#routeesUpdated(scala.collection.immutable.Set))​(scala.collection.immutable.Set<[ActorRef](../../ActorRef.html "interface in akka.actor.typed")<[T](RoutingLogics.RandomLogic.html "type parameter in RoutingLogics.RandomLogic")>> newRoutees)` | Invoked an initial time before `selectRoutee` is ever called and then every time the set of available  routees changes. |
	| `[ActorRef](../../ActorRef.html "interface in akka.actor.typed")<[T](RoutingLogics.RandomLogic.html "type parameter in RoutingLogics.RandomLogic")>` | `[selectRoutee](#selectRoutee(T))​([T](RoutingLogics.RandomLogic.html "type parameter in RoutingLogics.RandomLogic") msg)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### RandomLogic
		
		
		
		```
		public RandomLogic()
		```

	- ### Method Detail
	
	
	
		- #### routeesUpdated
		
		
		
		```
		public void routeesUpdated​(scala.collection.immutable.Set<[ActorRef](../../ActorRef.html "interface in akka.actor.typed")<[T](RoutingLogics.RandomLogic.html "type parameter in RoutingLogics.RandomLogic")>> newRoutees)
		```
		
		Description copied from interface: `[RoutingLogic](RoutingLogic.html#routeesUpdated(scala.collection.immutable.Set))`
		Invoked an initial time before `selectRoutee` is ever called and then every time the set of available
		 routees changes.
		 
		
		Specified by:
		`[routeesUpdated](RoutingLogic.html#routeesUpdated(scala.collection.immutable.Set))` in interface `[RoutingLogic](RoutingLogic.html "interface in akka.actor.typed.internal.routing")<[T](RoutingLogics.RandomLogic.html "type parameter in RoutingLogics.RandomLogic")>`
		Parameters:
		`newRoutees` \- The updated set of routees. For a group router this could be empty, in that case
		 `selectRoutee()` will not be called before `routeesUpdated` is invoked again with at
		 least one routee. For a pool the pool stops instead of ever calling `routeesUpdated`
		 with an empty list of routees.
		- #### selectRoutee
		
		
		
		```
		public [ActorRef](../../ActorRef.html "interface in akka.actor.typed")<[T](RoutingLogics.RandomLogic.html "type parameter in RoutingLogics.RandomLogic")> selectRoutee​([T](RoutingLogics.RandomLogic.html "type parameter in RoutingLogics.RandomLogic") msg)
		```
		
		
		Specified by:
		`[selectRoutee](RoutingLogic.html#selectRoutee(T))` in interface `[RoutingLogic](RoutingLogic.html "interface in akka.actor.typed.internal.routing")<[T](RoutingLogics.RandomLogic.html "type parameter in RoutingLogics.RandomLogic")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/internal/routing/RoutingLogic.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/internal/routing/RoutingLogics.RandomLogic.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/internal/routing/RoutingLogics.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/internal/routing/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/internal/routing/RoutingLogics.RandomLogic.html](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/internal/routing/RoutingLogics.RandomLogic.html)*