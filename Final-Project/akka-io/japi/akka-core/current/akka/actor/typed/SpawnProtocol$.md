---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:50:10Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/current/akka/actor/typed/SpawnProtocol$.html
title: SpawnProtocol$
---

# SpawnProtocol$

## Content

Package [akka.actor.typed](package-summary.html)
## Class SpawnProtocol$

- java.lang.Object
- - akka.actor.typed.SpawnProtocol$

- ---

```
public class SpawnProtocol$
extends java.lang.Object
```

A message protocol for actors that support spawning a child actor when receiving a `SpawnProtocol#Spawn`
 message and sending back the [`ActorRef`](ActorRef.html "interface in akka.actor.typed") of the child actor. Create instances through the [`SpawnProtocol.apply()`](SpawnProtocol.html#apply())
 or [`SpawnProtocol.create()`](SpawnProtocol.html#create()) factory methods.
 
 The typical usage of this is to use it as the guardian actor of the [`ActorSystem`](ActorSystem.html "class in akka.actor.typed"), possibly combined with
 `Behaviors.setup` to starts some initial tasks or actors. Child actors can then be started from the outside
 by telling or asking `SpawnProtocol#Spawn` to the actor reference of the system. When using `ask` this is
 similar to how [`ActorRefFactory.actorOf(akka.actor.Props)`](../ActorRefFactory.html#actorOf(akka.actor.Props)) can be used in classic actors with the difference that
 a `Future` / `CompletionStage` of the `ActorRef` is returned.
 

 Stopping children is done through specific support in the protocol of the children, or stopping the entire
 spawn protocol actor.

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [SpawnProtocol$](SpawnProtocol$.html "class in akka.actor.typed")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[SpawnProtocol$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[Behavior](Behavior.html "class in akka.actor.typed")<[SpawnProtocol.Command](SpawnProtocol.Command.html "interface in akka.actor.typed")>` | `[apply](#apply())()` | Scala API: returns a behavior that can be commanded to spawn arbitrary children. |
	| `[Behavior](Behavior.html "class in akka.actor.typed")<[SpawnProtocol.Command](SpawnProtocol.Command.html "interface in akka.actor.typed")>` | `[create](#create())()` | Java API: returns a behavior that can be commanded to spawn arbitrary children. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [SpawnProtocol$](SpawnProtocol$.html "class in akka.actor.typed") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### SpawnProtocol$
		
		
		
		```
		public SpawnProtocol$()
		```

	- ### Method Detail
	
	
	
		- #### create
		
		
		
		```
		public [Behavior](Behavior.html "class in akka.actor.typed")<[SpawnProtocol.Command](SpawnProtocol.Command.html "interface in akka.actor.typed")> create()
		```
		
		Java API: returns a behavior that can be commanded to spawn arbitrary children.
		- #### apply
		
		
		
		```
		public [Behavior](Behavior.html "class in akka.actor.typed")<[SpawnProtocol.Command](SpawnProtocol.Command.html "interface in akka.actor.typed")> apply()
		```
		
		Scala API: returns a behavior that can be commanded to spawn arbitrary children.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/current/akka/actor/ActorRefFactory.html
- https://doc.akka.io/japi/akka-core/current/akka/actor/typed/ActorRef.html
- https://doc.akka.io/japi/akka-core/current/akka/actor/typed/ActorSystem.html
- https://doc.akka.io/japi/akka-core/current/akka/actor/typed/Behavior.html
- https://doc.akka.io/japi/akka-core/current/akka/actor/typed/SpawnProtocol$.html
- https://doc.akka.io/japi/akka-core/current/akka/actor/typed/SpawnProtocol.Command.html
- https://doc.akka.io/japi/akka-core/current/akka/actor/typed/SpawnProtocol.html
- https://doc.akka.io/japi/akka-core/current/akka/actor/typed/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/current/akka/actor/typed/SpawnProtocol$.html](https://doc.akka.io/japi/akka-core/current/akka/actor/typed/SpawnProtocol$.html)*