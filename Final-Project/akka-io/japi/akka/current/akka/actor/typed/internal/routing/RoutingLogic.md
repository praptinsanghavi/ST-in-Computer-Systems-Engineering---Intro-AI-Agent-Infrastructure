---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:55:58Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/routing/RoutingLogic.html
title: RoutingLogic
---

# RoutingLogic

## Content

Package [akka.actor.typed.internal.routing](package-summary.html)
## Interface RoutingLogic\<T\>

- All Known Implementing Classes:
`[RoutingLogics.ConsistentHashingLogic](RoutingLogics.ConsistentHashingLogic.html "class in akka.actor.typed.internal.routing")`, `[RoutingLogics.RandomLogic](RoutingLogics.RandomLogic.html "class in akka.actor.typed.internal.routing")`, `[RoutingLogics.RoundRobinLogic](RoutingLogics.RoundRobinLogic.html "class in akka.actor.typed.internal.routing")`

---

```
public interface RoutingLogic<T>
```

Kept in the behavior, not shared between instances, meant to be stateful.
 
 INTERNAL API

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `void` | `[routeesUpdated](#routeesUpdated(scala.collection.immutable.Set))​(scala.collection.immutable.Set<[ActorRef](../../ActorRef.html "interface in akka.actor.typed")<[T](RoutingLogic.html "type parameter in RoutingLogic")>> newRoutees)` | Invoked an initial time before `selectRoutee` is ever called and then every time the set of available  routees changes. |
	| `[ActorRef](../../ActorRef.html "interface in akka.actor.typed")<[T](RoutingLogic.html "type parameter in RoutingLogic")>` | `[selectRoutee](#selectRoutee(T))​([T](RoutingLogic.html "type parameter in RoutingLogic") msg)` |  |

- - ### Method Detail
	
	
	
		- #### routeesUpdated
		
		
		
		```
		void routeesUpdated​(scala.collection.immutable.Set<[ActorRef](../../ActorRef.html "interface in akka.actor.typed")<[T](RoutingLogic.html "type parameter in RoutingLogic")>> newRoutees)
		```
		
		Invoked an initial time before `selectRoutee` is ever called and then every time the set of available
		 routees changes.
		 
		
		Parameters:
		`newRoutees` \- The updated set of routees. For a group router this could be empty, in that case
		 `selectRoutee()` will not be called before `routeesUpdated` is invoked again with at
		 least one routee. For a pool the pool stops instead of ever calling `routeesUpdated`
		 with an empty list of routees.
		- #### selectRoutee
		
		
		
		```
		[ActorRef](../../ActorRef.html "interface in akka.actor.typed")<[T](RoutingLogic.html "type parameter in RoutingLogic")> selectRoutee​([T](RoutingLogic.html "type parameter in RoutingLogic") msg)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/typed/ActorRef.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/routing/RoutingLogic.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/routing/RoutingLogics.ConsistentHashingLogic.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/routing/RoutingLogics.RandomLogic.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/routing/RoutingLogics.RoundRobinLogic.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/routing/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/routing/RoutingLogic.html](https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/routing/RoutingLogic.html)*