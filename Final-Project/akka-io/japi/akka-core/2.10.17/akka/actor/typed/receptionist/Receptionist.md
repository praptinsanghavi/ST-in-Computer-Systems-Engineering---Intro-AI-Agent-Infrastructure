---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:28:55Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/receptionist/Receptionist.Subscribe$.html
title: Receptionist.Subscribe$
---

# Receptionist.Subscribe$

## Content

Package [akka.actor.typed.receptionist](package-summary.html)
## Class Receptionist.Subscribe$

- java.lang.Object
- - akka.actor.typed.receptionist.Receptionist.Subscribe$

- Enclosing class:
[Receptionist](Receptionist.html "class in akka.actor.typed.receptionist")

---

```
public static class Receptionist.Subscribe$
extends java.lang.Object
```

`Subscribe` message. The given actor will subscribe to service updates when this command is sent to
 the `Receptionist.ref`. When the set of instances registered for the given key changes
 the subscriber will be sent a [`Receptionist.Listing`](Receptionist.Listing.html "interface in akka.actor.typed.receptionist") with the new set of instances for that service.
 
 The subscription will be acknowledged by sending out a first [`Receptionist.Listing`](Receptionist.Listing.html "interface in akka.actor.typed.receptionist"). The subscription automatically ends
 with the termination of the subscriber.

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Receptionist.Subscribe$](Receptionist.Subscribe$.html "class in akka.actor.typed.receptionist")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Subscribe$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<T> [Receptionist.Command](Receptionist.Command.html "class in akka.actor.typed.receptionist")` | `[apply](#apply(akka.actor.typed.receptionist.ServiceKey,akka.actor.typed.ActorRef))​([ServiceKey](ServiceKey.html "class in akka.actor.typed.receptionist")<T> key,  [ActorRef](../ActorRef.html "interface in akka.actor.typed")<[Receptionist.Listing](Receptionist.Listing.html "interface in akka.actor.typed.receptionist")> subscriber)` | Scala API: |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [Receptionist.Subscribe$](Receptionist.Subscribe$.html "class in akka.actor.typed.receptionist") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Subscribe$
		
		
		
		```
		public Subscribe$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public <T> [Receptionist.Command](Receptionist.Command.html "class in akka.actor.typed.receptionist") apply​([ServiceKey](ServiceKey.html "class in akka.actor.typed.receptionist")<T> key,
		                                      [ActorRef](../ActorRef.html "interface in akka.actor.typed")<[Receptionist.Listing](Receptionist.Listing.html "interface in akka.actor.typed.receptionist")> subscriber)
		```
		
		Scala API:

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/receptionist/Receptionist.Command.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/receptionist/Receptionist.Listing.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/receptionist/Receptionist.Subscribe$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/receptionist/Receptionist.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/receptionist/ServiceKey.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/receptionist/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/receptionist/Receptionist.Subscribe$.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/receptionist/Receptionist.Subscribe$.html)*