---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:39:22Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/actor/typed/SpawnProtocol.Spawn$.html
title: SpawnProtocol.Spawn$
---

# SpawnProtocol.Spawn$

## Content

Package [akka.actor.typed](package-summary.html)
## Class SpawnProtocol.Spawn$

- java.lang.Object
- - akka.actor.typed.SpawnProtocol.Spawn$

- All Implemented Interfaces:
`java.io.Serializable`

Enclosing class:
[SpawnProtocol](SpawnProtocol.html "class in akka.actor.typed")

---

```
public static class SpawnProtocol.Spawn$
extends java.lang.Object
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../serialized-form.html#akka.actor.typed.SpawnProtocol.Spawn$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [SpawnProtocol.Spawn$](SpawnProtocol.Spawn$.html "class in akka.actor.typed")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Spawn$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<T> [SpawnProtocol.Spawn](SpawnProtocol.Spawn.html "class in akka.actor.typed")<T>` | `[apply](#apply(akka.actor.typed.Behavior,java.lang.String,akka.actor.typed.Props,akka.actor.typed.ActorRef))​([Behavior](Behavior.html "class in akka.actor.typed")<T> behavior,  java.lang.String name,  [Props](Props.html "class in akka.actor.typed") props,  [ActorRef](ActorRef.html "interface in akka.actor.typed")<[ActorRef](ActorRef.html "interface in akka.actor.typed")<T>> replyTo)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `<T> scala.Option<scala.Tuple4<[Behavior](Behavior.html "class in akka.actor.typed")<T>,​java.lang.String,​[Props](Props.html "class in akka.actor.typed"),​[ActorRef](ActorRef.html "interface in akka.actor.typed")<[ActorRef](ActorRef.html "interface in akka.actor.typed")<T>>>>` | `[unapply](#unapply(akka.actor.typed.SpawnProtocol.Spawn))​([SpawnProtocol.Spawn](SpawnProtocol.Spawn.html "class in akka.actor.typed")<T> x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [SpawnProtocol.Spawn$](SpawnProtocol.Spawn$.html "class in akka.actor.typed") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Spawn$
		
		
		
		```
		public Spawn$()
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
		public <T> [SpawnProtocol.Spawn](SpawnProtocol.Spawn.html "class in akka.actor.typed")<T> apply​([Behavior](Behavior.html "class in akka.actor.typed")<T> behavior,
		                                        java.lang.String name,
		                                        [Props](Props.html "class in akka.actor.typed") props,
		                                        [ActorRef](ActorRef.html "interface in akka.actor.typed")<[ActorRef](ActorRef.html "interface in akka.actor.typed")<T>> replyTo)
		```
		- #### unapply
		
		
		
		```
		public <T> scala.Option<scala.Tuple4<[Behavior](Behavior.html "class in akka.actor.typed")<T>,​java.lang.String,​[Props](Props.html "class in akka.actor.typed"),​[ActorRef](ActorRef.html "interface in akka.actor.typed")<[ActorRef](ActorRef.html "interface in akka.actor.typed")<T>>>> unapply​([SpawnProtocol.Spawn](SpawnProtocol.Spawn.html "class in akka.actor.typed")<T> x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/typed/ActorRef.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/Behavior.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/Props.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/SpawnProtocol.Spawn$.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/SpawnProtocol.Spawn.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/SpawnProtocol.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/actor/typed/SpawnProtocol.Spawn$.html](https://doc.akka.io/japi/akka/current/akka/actor/typed/SpawnProtocol.Spawn$.html)*