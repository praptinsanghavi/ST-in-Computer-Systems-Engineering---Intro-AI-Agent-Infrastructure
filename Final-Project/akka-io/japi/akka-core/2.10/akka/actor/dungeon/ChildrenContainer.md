---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:00:35Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/actor/dungeon/ChildrenContainer.TerminatedChildrenContainer$.html
title: ChildrenContainer.TerminatedChildrenContainer$
---

# ChildrenContainer.TerminatedChildrenContainer$

## Content

Package [akka.actor.dungeon](package-summary.html)
## Class ChildrenContainer.TerminatedChildrenContainer$

- java.lang.Object
- - akka.actor.dungeon.ChildrenContainer.TerminatedChildrenContainer$

- All Implemented Interfaces:
`[ChildrenContainer](ChildrenContainer.html "interface in akka.actor.dungeon")`, `[ChildrenContainer.EmptyChildrenContainer](ChildrenContainer.EmptyChildrenContainer.html "interface in akka.actor.dungeon")`

Enclosing interface:
[ChildrenContainer](ChildrenContainer.html "interface in akka.actor.dungeon")

---

```
public static class ChildrenContainer.TerminatedChildrenContainer$
extends java.lang.Object
implements [ChildrenContainer.EmptyChildrenContainer](ChildrenContainer.EmptyChildrenContainer.html "interface in akka.actor.dungeon")
```

This is the empty container which is installed after the last child has
 terminated while stopping; it is necessary to distinguish from the normal
 empty state while calling handleChildTerminated() for the last time.

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface akka.actor.dungeon.[ChildrenContainer](ChildrenContainer.html "interface in akka.actor.dungeon")
		
		
		`[ChildrenContainer.ChildrenIterable](ChildrenContainer.ChildrenIterable.html "class in akka.actor.dungeon"), [ChildrenContainer.ChildRestartsIterable](ChildrenContainer.ChildRestartsIterable.html "class in akka.actor.dungeon"), [ChildrenContainer.Creation](ChildrenContainer.Creation.html "class in akka.actor.dungeon"), [ChildrenContainer.Creation$](ChildrenContainer.Creation$.html "class in akka.actor.dungeon"), [ChildrenContainer.EmptyChildrenContainer](ChildrenContainer.EmptyChildrenContainer.html "interface in akka.actor.dungeon"), [ChildrenContainer.EmptyChildrenContainer$](ChildrenContainer.EmptyChildrenContainer$.html "class in akka.actor.dungeon"), [ChildrenContainer.NormalChildrenContainer](ChildrenContainer.NormalChildrenContainer.html "class in akka.actor.dungeon"), [ChildrenContainer.NormalChildrenContainer$](ChildrenContainer.NormalChildrenContainer$.html "class in akka.actor.dungeon"), [ChildrenContainer.Recreation](ChildrenContainer.Recreation.html "class in akka.actor.dungeon"), [ChildrenContainer.Recreation$](ChildrenContainer.Recreation$.html "class in akka.actor.dungeon"), [ChildrenContainer.SuspendReason](ChildrenContainer.SuspendReason.html "interface in akka.actor.dungeon"), [ChildrenContainer.TerminatedChildrenContainer$](ChildrenContainer.TerminatedChildrenContainer$.html "class in akka.actor.dungeon"), [ChildrenContainer.TerminatingChildrenContainer](ChildrenContainer.TerminatingChildrenContainer.html "class in akka.actor.dungeon"), [ChildrenContainer.TerminatingChildrenContainer$](ChildrenContainer.TerminatingChildrenContainer$.html "class in akka.actor.dungeon"), [ChildrenContainer.Termination$](ChildrenContainer.Termination$.html "class in akka.actor.dungeon"), [ChildrenContainer.UserRequest$](ChildrenContainer.UserRequest$.html "class in akka.actor.dungeon"), [ChildrenContainer.WaitingForChildren](ChildrenContainer.WaitingForChildren.html "interface in akka.actor.dungeon")`

	- ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ChildrenContainer.TerminatedChildrenContainer$](ChildrenContainer.TerminatedChildrenContainer$.html "class in akka.actor.dungeon")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[TerminatedChildrenContainer$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ChildrenContainer](ChildrenContainer.html "interface in akka.actor.dungeon")` | `[add](#add(java.lang.String,akka.actor.ChildRestartStats))​(java.lang.String name,  [ChildRestartStats](../ChildRestartStats.html "class in akka.actor") stats)` |  |
	| `protected void` | `[akka$actor$dungeon$ChildrenContainer$EmptyChildrenContainer$_setter_$emptyStats_$eq](#akka$actor$dungeon$ChildrenContainer$EmptyChildrenContainer$_setter_$emptyStats_$eq(scala.collection.immutable.TreeMap))​(scala.collection.immutable.TreeMap<java.lang.String,​[ChildStats](../ChildStats.html "interface in akka.actor")> x$1)` |  |
	| `scala.collection.immutable.TreeMap<java.lang.String,​[ChildStats](../ChildStats.html "interface in akka.actor")>` | `[emptyStats](#emptyStats())()` |  |
	| `boolean` | `[isNormal](#isNormal())()` |  |
	| `boolean` | `[isTerminating](#isTerminating())()` |  |
	| `[ChildrenContainer](ChildrenContainer.html "interface in akka.actor.dungeon")` | `[reserve](#reserve(java.lang.String))​(java.lang.String name)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface akka.actor.dungeon.[ChildrenContainer.EmptyChildrenContainer](ChildrenContainer.EmptyChildrenContainer.html "interface in akka.actor.dungeon")
		
		
		`[children](ChildrenContainer.EmptyChildrenContainer.html#children()), [getByName](ChildrenContainer.EmptyChildrenContainer.html#getByName(java.lang.String)), [getByRef](ChildrenContainer.EmptyChildrenContainer.html#getByRef(akka.actor.ActorRef)), [remove](ChildrenContainer.EmptyChildrenContainer.html#remove(akka.actor.ActorRef)), [shallDie](ChildrenContainer.EmptyChildrenContainer.html#shallDie(akka.actor.ActorRef)), [stats](ChildrenContainer.EmptyChildrenContainer.html#stats()), [unreserve](ChildrenContainer.EmptyChildrenContainer.html#unreserve(java.lang.String))`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ChildrenContainer.TerminatedChildrenContainer$](ChildrenContainer.TerminatedChildrenContainer$.html "class in akka.actor.dungeon") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### TerminatedChildrenContainer$
		
		
		
		```
		public TerminatedChildrenContainer$()
		```

	- ### Method Detail
	
	
	
		- #### emptyStats
		
		
		
		```
		public scala.collection.immutable.TreeMap<java.lang.String,​[ChildStats](../ChildStats.html "interface in akka.actor")> emptyStats()
		```
		
		
		Specified by:
		`[emptyStats](ChildrenContainer.EmptyChildrenContainer.html#emptyStats())` in interface `[ChildrenContainer.EmptyChildrenContainer](ChildrenContainer.EmptyChildrenContainer.html "interface in akka.actor.dungeon")`
		- #### akka$actor$dungeon$ChildrenContainer$EmptyChildrenContainer$\_setter\_$emptyStats\_$eq
		
		
		
		```
		protected void akka$actor$dungeon$ChildrenContainer$EmptyChildrenContainer$_setter_$emptyStats_$eq​(scala.collection.immutable.TreeMap<java.lang.String,​[ChildStats](../ChildStats.html "interface in akka.actor")> x$1)
		```
		
		
		Specified by:
		`[akka$actor$dungeon$ChildrenContainer$EmptyChildrenContainer$_setter_$emptyStats_$eq](ChildrenContainer.EmptyChildrenContainer.html#akka$actor$dungeon$ChildrenContainer$EmptyChildrenContainer$_setter_$emptyStats_$eq(scala.collection.immutable.TreeMap))` in interface `[ChildrenContainer.EmptyChildrenContainer](ChildrenContainer.EmptyChildrenContainer.html "interface in akka.actor.dungeon")`
		- #### add
		
		
		
		```
		public [ChildrenContainer](ChildrenContainer.html "interface in akka.actor.dungeon") add​(java.lang.String name,
		                             [ChildRestartStats](../ChildRestartStats.html "class in akka.actor") stats)
		```
		
		
		Specified by:
		`[add](ChildrenContainer.html#add(java.lang.String,akka.actor.ChildRestartStats))` in interface `[ChildrenContainer](ChildrenContainer.html "interface in akka.actor.dungeon")`
		Specified by:
		`[add](ChildrenContainer.EmptyChildrenContainer.html#add(java.lang.String,akka.actor.ChildRestartStats))` in interface `[ChildrenContainer.EmptyChildrenContainer](ChildrenContainer.EmptyChildrenContainer.html "interface in akka.actor.dungeon")`
		- #### reserve
		
		
		
		```
		public [ChildrenContainer](ChildrenContainer.html "interface in akka.actor.dungeon") reserve​(java.lang.String name)
		```
		
		
		Specified by:
		`[reserve](ChildrenContainer.html#reserve(java.lang.String))` in interface `[ChildrenContainer](ChildrenContainer.html "interface in akka.actor.dungeon")`
		Specified by:
		`[reserve](ChildrenContainer.EmptyChildrenContainer.html#reserve(java.lang.String))` in interface `[ChildrenContainer.EmptyChildrenContainer](ChildrenContainer.EmptyChildrenContainer.html "interface in akka.actor.dungeon")`
		- #### isTerminating
		
		
		
		```
		public boolean isTerminating()
		```
		
		
		Specified by:
		`[isTerminating](ChildrenContainer.html#isTerminating())` in interface `[ChildrenContainer](ChildrenContainer.html "interface in akka.actor.dungeon")`
		- #### isNormal
		
		
		
		```
		public boolean isNormal()
		```
		
		
		Specified by:
		`[isNormal](ChildrenContainer.html#isNormal())` in interface `[ChildrenContainer](ChildrenContainer.html "interface in akka.actor.dungeon")`
		- #### toString
		
		
		
		```
		public java.lang.String toString()
		```
		
		
		Overrides:
		`toString` in class `java.lang.Object`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ChildRestartStats.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ChildStats.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/dungeon/ChildrenContainer.ChildRestartsIterable.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/dungeon/ChildrenContainer.ChildrenIterable.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/dungeon/ChildrenContainer.Creation$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/dungeon/ChildrenContainer.Creation.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/dungeon/ChildrenContainer.EmptyChildrenContainer$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/dungeon/ChildrenContainer.EmptyChildrenContainer.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/dungeon/ChildrenContainer.NormalChildrenContainer$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/dungeon/ChildrenContainer.NormalChildrenContainer.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/dungeon/ChildrenContainer.Recreation$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/dungeon/ChildrenContainer.Recreation.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/dungeon/ChildrenContainer.SuspendReason.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/dungeon/ChildrenContainer.TerminatedChildrenContainer$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/dungeon/ChildrenContainer.TerminatingChildrenContainer$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/dungeon/ChildrenContainer.TerminatingChildrenContainer.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/dungeon/ChildrenContainer.Termination$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/dungeon/ChildrenContainer.UserRequest$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/dungeon/ChildrenContainer.WaitingForChildren.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/dungeon/ChildrenContainer.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/dungeon/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/actor/dungeon/ChildrenContainer.TerminatedChildrenContainer$.html](https://doc.akka.io/japi/akka-core/2.10/akka/actor/dungeon/ChildrenContainer.TerminatedChildrenContainer$.html)*