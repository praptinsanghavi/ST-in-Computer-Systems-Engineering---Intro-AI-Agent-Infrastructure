---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:40:25Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/actor/typed/receptionist/ServiceKey.Registered$.html
title: ServiceKey.Registered$
---

# ServiceKey.Registered$

## Content

Package [akka.actor.typed.receptionist](package-summary.html)
## Class ServiceKey.Registered$

- java.lang.Object
- - akka.actor.typed.receptionist.ServiceKey.Registered$

- Enclosing class:
[ServiceKey](ServiceKey.html "class in akka.actor.typed.receptionist")\<[T](ServiceKey.html "type parameter in ServiceKey")\>

---

```
public class ServiceKey.Registered$
extends java.lang.Object
```

Scala API: Provides a type safe pattern match for registration acks

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Registered$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `scala.Option<[ActorRef](../ActorRef.html "interface in akka.actor.typed")<[T](ServiceKey.html "type parameter in ServiceKey")>>` | `[unapply](#unapply(akka.actor.typed.receptionist.Receptionist.Registered))​([Receptionist.Registered](Receptionist.Registered.html "interface in akka.actor.typed.receptionist") l)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### Registered$
		
		
		
		```
		public Registered$()
		```

	- ### Method Detail
	
	
	
		- #### unapply
		
		
		
		```
		public scala.Option<[ActorRef](../ActorRef.html "interface in akka.actor.typed")<[T](ServiceKey.html "type parameter in ServiceKey")>> unapply​([Receptionist.Registered](Receptionist.Registered.html "interface in akka.actor.typed.receptionist") l)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/typed/ActorRef.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/receptionist/Receptionist.Registered.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/receptionist/ServiceKey.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/receptionist/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/actor/typed/receptionist/ServiceKey.Registered$.html](https://doc.akka.io/japi/akka/current/akka/actor/typed/receptionist/ServiceKey.Registered$.html)*