---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:56:30Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/actor/typed/receptionist/Receptionist.Registered$.html
title: Receptionist.Registered$
---

# Receptionist.Registered$

## Content

Package [akka.actor.typed.receptionist](package-summary.html)
## Class Receptionist.Registered$

- java.lang.Object
- - akka.actor.typed.receptionist.Receptionist.Registered$

- Enclosing class:
[Receptionist](Receptionist.html "class in akka.actor.typed.receptionist")

---

```
public static class Receptionist.Registered$
extends java.lang.Object
```

Sent by the receptionist, available here for easier testing

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Receptionist.Registered$](Receptionist.Registered$.html "class in akka.actor.typed.receptionist")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Registered$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<T> [Receptionist.Registered](Receptionist.Registered.html "interface in akka.actor.typed.receptionist")` | `[apply](#apply(akka.actor.typed.receptionist.ServiceKey,akka.actor.typed.ActorRef))​([ServiceKey](ServiceKey.html "class in akka.actor.typed.receptionist")<T> key,  [ActorRef](../ActorRef.html "interface in akka.actor.typed")<T> serviceInstance)` | Scala API |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [Receptionist.Registered$](Receptionist.Registered$.html "class in akka.actor.typed.receptionist") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Registered$
		
		
		
		```
		public Registered$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public <T> [Receptionist.Registered](Receptionist.Registered.html "interface in akka.actor.typed.receptionist") apply​([ServiceKey](ServiceKey.html "class in akka.actor.typed.receptionist")<T> key,
		                                         [ActorRef](../ActorRef.html "interface in akka.actor.typed")<T> serviceInstance)
		```
		
		Scala API

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/typed/ActorRef.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/receptionist/Receptionist.Registered$.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/receptionist/Receptionist.Registered.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/receptionist/Receptionist.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/receptionist/ServiceKey.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/receptionist/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/actor/typed/receptionist/Receptionist.Registered$.html](https://doc.akka.io/japi/akka/current/akka/actor/typed/receptionist/Receptionist.Registered$.html)*