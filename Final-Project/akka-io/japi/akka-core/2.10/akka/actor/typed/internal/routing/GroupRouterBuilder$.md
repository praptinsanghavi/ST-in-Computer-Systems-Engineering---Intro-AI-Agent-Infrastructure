---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:59:53Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/internal/routing/GroupRouterBuilder$.html
title: GroupRouterBuilder$
---

# GroupRouterBuilder$

## Content

Package [akka.actor.typed.internal.routing](package-summary.html)
## Class GroupRouterBuilder$

- java.lang.Object
- - akka.actor.typed.internal.routing.GroupRouterBuilder$

- All Implemented Interfaces:
`java.io.Serializable`

---

```
public class GroupRouterBuilder$
extends java.lang.Object
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../../../serialized-form.html#akka.actor.typed.internal.routing.GroupRouterBuilder$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [GroupRouterBuilder$](GroupRouterBuilder$.html "class in akka.actor.typed.internal.routing")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[GroupRouterBuilder$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<T> akka.actor.typed.internal.routing.GroupRouterBuilder<T>` | `[apply](#apply(akka.actor.typed.receptionist.ServiceKey,boolean,scala.Function1))​([ServiceKey](../../receptionist/ServiceKey.html "class in akka.actor.typed.receptionist")<T> key,  boolean preferLocalRoutees,  scala.Function1<[ActorSystem](../../ActorSystem.html "class in akka.actor.typed")<?>,​[RoutingLogic](RoutingLogic.html "interface in akka.actor.typed.internal.routing")<T>> logicFactory)` |  |
	| `<T> boolean` | `[apply$default$2](#apply$default$2())()` |  |
	| `<T> scala.Function1<[ActorSystem](../../ActorSystem.html "class in akka.actor.typed")<?>,​[RoutingLogics.RandomLogic](RoutingLogics.RandomLogic.html "class in akka.actor.typed.internal.routing")<T>>` | `[apply$default$3](#apply$default$3())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `<T> scala.Option<scala.Tuple3<[ServiceKey](../../receptionist/ServiceKey.html "class in akka.actor.typed.receptionist")<T>,​java.lang.Object,​scala.Function1<[ActorSystem](../../ActorSystem.html "class in akka.actor.typed")<?>,​[RoutingLogic](RoutingLogic.html "interface in akka.actor.typed.internal.routing")<T>>>>` | `[unapply](#unapply(akka.actor.typed.internal.routing.GroupRouterBuilder))​(akka.actor.typed.internal.routing.GroupRouterBuilder<T> x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [GroupRouterBuilder$](GroupRouterBuilder$.html "class in akka.actor.typed.internal.routing") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### GroupRouterBuilder$
		
		
		
		```
		public GroupRouterBuilder$()
		```

	- ### Method Detail
	
	
	
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Overrides:
		`toString` in class `java.lang.Object`
		- #### apply
		
		
		
		```
		public <T> akka.actor.typed.internal.routing.GroupRouterBuilder<T> apply​([ServiceKey](../../receptionist/ServiceKey.html "class in akka.actor.typed.receptionist")<T> key,
		                                                                         boolean preferLocalRoutees,
		                                                                         scala.Function1<[ActorSystem](../../ActorSystem.html "class in akka.actor.typed")<?>,​[RoutingLogic](RoutingLogic.html "interface in akka.actor.typed.internal.routing")<T>> logicFactory)
		```
		- #### apply$default$2
		
		
		
		```
		public <T> boolean apply$default$2()
		```
		- #### apply$default$3
		
		
		
		```
		public <T> scala.Function1<[ActorSystem](../../ActorSystem.html "class in akka.actor.typed")<?>,​[RoutingLogics.RandomLogic](RoutingLogics.RandomLogic.html "class in akka.actor.typed.internal.routing")<T>> apply$default$3()
		```
		- #### unapply
		
		
		
		```
		public <T> scala.Option<scala.Tuple3<[ServiceKey](../../receptionist/ServiceKey.html "class in akka.actor.typed.receptionist")<T>,​java.lang.Object,​scala.Function1<[ActorSystem](../../ActorSystem.html "class in akka.actor.typed")<?>,​[RoutingLogic](RoutingLogic.html "interface in akka.actor.typed.internal.routing")<T>>>> unapply​(akka.actor.typed.internal.routing.GroupRouterBuilder<T> x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/ActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/internal/routing/GroupRouterBuilder$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/internal/routing/RoutingLogic.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/internal/routing/RoutingLogics.RandomLogic.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/internal/routing/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/receptionist/ServiceKey.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/internal/routing/GroupRouterBuilder$.html](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/internal/routing/GroupRouterBuilder$.html)*