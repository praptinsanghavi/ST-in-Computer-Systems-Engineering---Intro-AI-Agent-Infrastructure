---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:48:49Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/actor/dungeon/ChildrenContainer.TerminatingChildrenContainer$.html
title: ChildrenContainer.TerminatingChildrenContainer$
---

# ChildrenContainer.TerminatingChildrenContainer$

## Content

Package [akka.actor.dungeon](package-summary.html)
## Class ChildrenContainer.TerminatingChildrenContainer$

- java.lang.Object
- - scala.runtime.AbstractFunction3\<scala.collection.immutable.TreeMap\<java.lang.String,​[ChildStats](../ChildStats.html "interface in akka.actor")\>,​scala.collection.immutable.Set\<[ActorRef](../ActorRef.html "class in akka.actor")\>,​[ChildrenContainer.SuspendReason](ChildrenContainer.SuspendReason.html "interface in akka.actor.dungeon"),​[ChildrenContainer.TerminatingChildrenContainer](ChildrenContainer.TerminatingChildrenContainer.html "class in akka.actor.dungeon")\>
	- - akka.actor.dungeon.ChildrenContainer.TerminatingChildrenContainer$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Function3<scala.collection.immutable.TreeMap<java.lang.String,​[ChildStats](../ChildStats.html "interface in akka.actor")>,​scala.collection.immutable.Set<[ActorRef](../ActorRef.html "class in akka.actor")>,​[ChildrenContainer.SuspendReason](ChildrenContainer.SuspendReason.html "interface in akka.actor.dungeon"),​[ChildrenContainer.TerminatingChildrenContainer](ChildrenContainer.TerminatingChildrenContainer.html "class in akka.actor.dungeon")>`

Enclosing interface:
[ChildrenContainer](ChildrenContainer.html "interface in akka.actor.dungeon")

---

```
public static class ChildrenContainer.TerminatingChildrenContainer$
extends scala.runtime.AbstractFunction3<scala.collection.immutable.TreeMap<java.lang.String,​[ChildStats](../ChildStats.html "interface in akka.actor")>,​scala.collection.immutable.Set<[ActorRef](../ActorRef.html "class in akka.actor")>,​[ChildrenContainer.SuspendReason](ChildrenContainer.SuspendReason.html "interface in akka.actor.dungeon"),​[ChildrenContainer.TerminatingChildrenContainer](ChildrenContainer.TerminatingChildrenContainer.html "class in akka.actor.dungeon")>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../serialized-form.html#akka.actor.dungeon.ChildrenContainer.TerminatingChildrenContainer$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ChildrenContainer.TerminatingChildrenContainer$](ChildrenContainer.TerminatingChildrenContainer$.html "class in akka.actor.dungeon")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[TerminatingChildrenContainer$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ChildrenContainer.TerminatingChildrenContainer](ChildrenContainer.TerminatingChildrenContainer.html "class in akka.actor.dungeon")` | `[apply](#apply(scala.collection.immutable.TreeMap,scala.collection.immutable.Set,akka.actor.dungeon.ChildrenContainer.SuspendReason))​(scala.collection.immutable.TreeMap<java.lang.String,​[ChildStats](../ChildStats.html "interface in akka.actor")> c,  scala.collection.immutable.Set<[ActorRef](../ActorRef.html "class in akka.actor")> toDie,  [ChildrenContainer.SuspendReason](ChildrenContainer.SuspendReason.html "interface in akka.actor.dungeon") reason)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Option<scala.Tuple3<scala.collection.immutable.TreeMap<java.lang.String,​[ChildStats](../ChildStats.html "interface in akka.actor")>,​scala.collection.immutable.Set<[ActorRef](../ActorRef.html "class in akka.actor")>,​[ChildrenContainer.SuspendReason](ChildrenContainer.SuspendReason.html "interface in akka.actor.dungeon")>>` | `[unapply](#unapply(akka.actor.dungeon.ChildrenContainer.TerminatingChildrenContainer))​([ChildrenContainer.TerminatingChildrenContainer](ChildrenContainer.TerminatingChildrenContainer.html "class in akka.actor.dungeon") x$0)` |  |
	
	
		- ### Methods inherited from class scala.runtime.AbstractFunction3
		
		
		`curried, tupled`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ChildrenContainer.TerminatingChildrenContainer$](ChildrenContainer.TerminatingChildrenContainer$.html "class in akka.actor.dungeon") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### TerminatingChildrenContainer$
		
		
		
		```
		public TerminatingChildrenContainer$()
		```

	- ### Method Detail
	
	
	
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Specified by:
		`toString` in interface `scala.Function3<scala.collection.immutable.TreeMap<java.lang.String,​[ChildStats](../ChildStats.html "interface in akka.actor")>,​scala.collection.immutable.Set<[ActorRef](../ActorRef.html "class in akka.actor")>,​[ChildrenContainer.SuspendReason](ChildrenContainer.SuspendReason.html "interface in akka.actor.dungeon"),​[ChildrenContainer.TerminatingChildrenContainer](ChildrenContainer.TerminatingChildrenContainer.html "class in akka.actor.dungeon")>`
		Overrides:
		`toString` in class `scala.runtime.AbstractFunction3<scala.collection.immutable.TreeMap<java.lang.String,​[ChildStats](../ChildStats.html "interface in akka.actor")>,​scala.collection.immutable.Set<[ActorRef](../ActorRef.html "class in akka.actor")>,​[ChildrenContainer.SuspendReason](ChildrenContainer.SuspendReason.html "interface in akka.actor.dungeon"),​[ChildrenContainer.TerminatingChildrenContainer](ChildrenContainer.TerminatingChildrenContainer.html "class in akka.actor.dungeon")>`
		- #### apply
		
		
		
		```
		public [ChildrenContainer.TerminatingChildrenContainer](ChildrenContainer.TerminatingChildrenContainer.html "class in akka.actor.dungeon") apply​(scala.collection.immutable.TreeMap<java.lang.String,​[ChildStats](../ChildStats.html "interface in akka.actor")> c,
		                                                            scala.collection.immutable.Set<[ActorRef](../ActorRef.html "class in akka.actor")> toDie,
		                                                            [ChildrenContainer.SuspendReason](ChildrenContainer.SuspendReason.html "interface in akka.actor.dungeon") reason)
		```
		
		
		Specified by:
		`apply` in interface `scala.Function3<scala.collection.immutable.TreeMap<java.lang.String,​[ChildStats](../ChildStats.html "interface in akka.actor")>,​scala.collection.immutable.Set<[ActorRef](../ActorRef.html "class in akka.actor")>,​[ChildrenContainer.SuspendReason](ChildrenContainer.SuspendReason.html "interface in akka.actor.dungeon"),​[ChildrenContainer.TerminatingChildrenContainer](ChildrenContainer.TerminatingChildrenContainer.html "class in akka.actor.dungeon")>`
		- #### unapply
		
		
		
		```
		public scala.Option<scala.Tuple3<scala.collection.immutable.TreeMap<java.lang.String,​[ChildStats](../ChildStats.html "interface in akka.actor")>,​scala.collection.immutable.Set<[ActorRef](../ActorRef.html "class in akka.actor")>,​[ChildrenContainer.SuspendReason](ChildrenContainer.SuspendReason.html "interface in akka.actor.dungeon")>> unapply​([ChildrenContainer.TerminatingChildrenContainer](ChildrenContainer.TerminatingChildrenContainer.html "class in akka.actor.dungeon") x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka/current/akka/actor/ChildStats.html
- https://doc.akka.io/japi/akka/current/akka/actor/dungeon/ChildrenContainer.SuspendReason.html
- https://doc.akka.io/japi/akka/current/akka/actor/dungeon/ChildrenContainer.TerminatingChildrenContainer$.html
- https://doc.akka.io/japi/akka/current/akka/actor/dungeon/ChildrenContainer.TerminatingChildrenContainer.html
- https://doc.akka.io/japi/akka/current/akka/actor/dungeon/ChildrenContainer.html
- https://doc.akka.io/japi/akka/current/akka/actor/dungeon/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/actor/dungeon/ChildrenContainer.TerminatingChildrenContainer$.html](https://doc.akka.io/japi/akka/current/akka/actor/dungeon/ChildrenContainer.TerminatingChildrenContainer$.html)*