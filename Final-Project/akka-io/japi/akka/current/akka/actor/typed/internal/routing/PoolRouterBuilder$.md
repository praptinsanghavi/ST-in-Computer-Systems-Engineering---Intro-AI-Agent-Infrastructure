---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:56:00Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/routing/PoolRouterBuilder$.html
title: PoolRouterBuilder$
---

# PoolRouterBuilder$

## Content

Package [akka.actor.typed.internal.routing](package-summary.html)
## Class PoolRouterBuilder$

- java.lang.Object
- - akka.actor.typed.internal.routing.PoolRouterBuilder$

- All Implemented Interfaces:
`java.io.Serializable`

---

```
public class PoolRouterBuilder$
extends java.lang.Object
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../../../serialized-form.html#akka.actor.typed.internal.routing.PoolRouterBuilder$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [PoolRouterBuilder$](PoolRouterBuilder$.html "class in akka.actor.typed.internal.routing")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[PoolRouterBuilder$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<T> scala.Function1<[ActorSystem](../../ActorSystem.html "class in akka.actor.typed")<?>,​[RoutingLogics.RoundRobinLogic](RoutingLogics.RoundRobinLogic.html "class in akka.actor.typed.internal.routing")<T>>` | `[$lessinit$greater$default$3](#$lessinit$greater$default$3())()` |  |
	| `<T> scala.Function1<java.lang.Object,​java.lang.Object>` | `[$lessinit$greater$default$4](#$lessinit$greater$default$4())()` |  |
	| `<T> [Props](../../Props.html "class in akka.actor.typed")` | `[$lessinit$greater$default$5](#$lessinit$greater$default$5())()` |  |
	| `<T> akka.actor.typed.internal.routing.PoolRouterBuilder<T>` | `[apply](#apply(int,akka.actor.typed.Behavior,scala.Function1,scala.Function1,akka.actor.typed.Props))​(int poolSize,  [Behavior](../../Behavior.html "class in akka.actor.typed")<T> behavior,  scala.Function1<[ActorSystem](../../ActorSystem.html "class in akka.actor.typed")<?>,​[RoutingLogic](RoutingLogic.html "interface in akka.actor.typed.internal.routing")<T>> logicFactory,  scala.Function1<T,​java.lang.Object> broadcastPredicate,  [Props](../../Props.html "class in akka.actor.typed") routeeProps)` |  |
	| `<T> scala.Function1<[ActorSystem](../../ActorSystem.html "class in akka.actor.typed")<?>,​[RoutingLogics.RoundRobinLogic](RoutingLogics.RoundRobinLogic.html "class in akka.actor.typed.internal.routing")<T>>` | `[apply$default$3](#apply$default$3())()` |  |
	| `<T> scala.Function1<java.lang.Object,​java.lang.Object>` | `[apply$default$4](#apply$default$4())()` |  |
	| `<T> [Props](../../Props.html "class in akka.actor.typed")` | `[apply$default$5](#apply$default$5())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `<T> scala.Option<scala.Tuple5<java.lang.Object,​[Behavior](../../Behavior.html "class in akka.actor.typed")<T>,​scala.Function1<[ActorSystem](../../ActorSystem.html "class in akka.actor.typed")<?>,​[RoutingLogic](RoutingLogic.html "interface in akka.actor.typed.internal.routing")<T>>,​scala.Function1<T,​java.lang.Object>,​[Props](../../Props.html "class in akka.actor.typed")>>` | `[unapply](#unapply(akka.actor.typed.internal.routing.PoolRouterBuilder))​(akka.actor.typed.internal.routing.PoolRouterBuilder<T> x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [PoolRouterBuilder$](PoolRouterBuilder$.html "class in akka.actor.typed.internal.routing") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### PoolRouterBuilder$
		
		
		
		```
		public PoolRouterBuilder$()
		```

	- ### Method Detail
	
	
	
		- #### $lessinit$greater$default$3
		
		
		
		```
		public <T> scala.Function1<[ActorSystem](../../ActorSystem.html "class in akka.actor.typed")<?>,​[RoutingLogics.RoundRobinLogic](RoutingLogics.RoundRobinLogic.html "class in akka.actor.typed.internal.routing")<T>> $lessinit$greater$default$3()
		```
		- #### $lessinit$greater$default$4
		
		
		
		```
		public <T> scala.Function1<java.lang.Object,​java.lang.Object> $lessinit$greater$default$4()
		```
		- #### $lessinit$greater$default$5
		
		
		
		```
		public <T> [Props](../../Props.html "class in akka.actor.typed") $lessinit$greater$default$5()
		```
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Overrides:
		`toString` in class `java.lang.Object`
		- #### apply
		
		
		
		```
		public <T> akka.actor.typed.internal.routing.PoolRouterBuilder<T> apply​(int poolSize,
		                                                                        [Behavior](../../Behavior.html "class in akka.actor.typed")<T> behavior,
		                                                                        scala.Function1<[ActorSystem](../../ActorSystem.html "class in akka.actor.typed")<?>,​[RoutingLogic](RoutingLogic.html "interface in akka.actor.typed.internal.routing")<T>> logicFactory,
		                                                                        scala.Function1<T,​java.lang.Object> broadcastPredicate,
		                                                                        [Props](../../Props.html "class in akka.actor.typed") routeeProps)
		```
		- #### apply$default$3
		
		
		
		```
		public <T> scala.Function1<[ActorSystem](../../ActorSystem.html "class in akka.actor.typed")<?>,​[RoutingLogics.RoundRobinLogic](RoutingLogics.RoundRobinLogic.html "class in akka.actor.typed.internal.routing")<T>> apply$default$3()
		```
		- #### apply$default$4
		
		
		
		```
		public <T> scala.Function1<java.lang.Object,​java.lang.Object> apply$default$4()
		```
		- #### apply$default$5
		
		
		
		```
		public <T> [Props](../../Props.html "class in akka.actor.typed") apply$default$5()
		```
		- #### unapply
		
		
		
		```
		public <T> scala.Option<scala.Tuple5<java.lang.Object,​[Behavior](../../Behavior.html "class in akka.actor.typed")<T>,​scala.Function1<[ActorSystem](../../ActorSystem.html "class in akka.actor.typed")<?>,​[RoutingLogic](RoutingLogic.html "interface in akka.actor.typed.internal.routing")<T>>,​scala.Function1<T,​java.lang.Object>,​[Props](../../Props.html "class in akka.actor.typed")>> unapply​(akka.actor.typed.internal.routing.PoolRouterBuilder<T> x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/typed/ActorSystem.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/Behavior.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/Props.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/routing/PoolRouterBuilder$.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/routing/RoutingLogic.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/routing/RoutingLogics.RoundRobinLogic.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/routing/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/routing/PoolRouterBuilder$.html](https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/routing/PoolRouterBuilder$.html)*