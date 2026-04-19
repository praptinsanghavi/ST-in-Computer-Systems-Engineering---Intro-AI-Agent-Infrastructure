---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:20:42Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/receptionist/Receptionist.Registered.html
title: Receptionist.Registered
---

# Receptionist.Registered

## Content

Package [akka.actor.typed.receptionist](package-summary.html)
## Interface Receptionist.Registered

- All Known Implementing Classes:
`[ReceptionistMessages.Registered](../internal/receptionist/ReceptionistMessages.Registered.html "class in akka.actor.typed.internal.receptionist")`

Enclosing class:
[Receptionist](Receptionist.html "class in akka.actor.typed.receptionist")

---

```
public static interface Receptionist.Registered
```

Confirmation that the given [`ActorRef`](../ActorRef.html "interface in akka.actor.typed") has been associated with the [`ServiceKey`](ServiceKey.html "class in akka.actor.typed.receptionist").
 
 You can use `key.Registered` for type\-safe pattern matching.
 

 Not for user extension

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `[ServiceKey](ServiceKey.html "class in akka.actor.typed.receptionist")<?>` | `[getKey](#getKey())()` | Java API |
	| `<T> [ActorRef](../ActorRef.html "interface in akka.actor.typed")<T>` | `[getServiceInstance](#getServiceInstance(akka.actor.typed.receptionist.ServiceKey))​([ServiceKey](ServiceKey.html "class in akka.actor.typed.receptionist")<T> key)` | Java API |
	| `boolean` | `[isForKey](#isForKey(akka.actor.typed.receptionist.ServiceKey))​([ServiceKey](ServiceKey.html "class in akka.actor.typed.receptionist")<?> key)` |  |
	| `[ServiceKey](ServiceKey.html "class in akka.actor.typed.receptionist")<?>` | `[key](#key())()` | Scala API |
	| `<T> [ActorRef](../ActorRef.html "interface in akka.actor.typed")<T>` | `[serviceInstance](#serviceInstance(akka.actor.typed.receptionist.ServiceKey))​([ServiceKey](ServiceKey.html "class in akka.actor.typed.receptionist")<T> key)` | Scala API |

- - ### Method Detail
	
	
	
		- #### isForKey
		
		
		
		```
		boolean isForKey​([ServiceKey](ServiceKey.html "class in akka.actor.typed.receptionist")<?> key)
		```
		- #### key
		
		
		
		```
		[ServiceKey](ServiceKey.html "class in akka.actor.typed.receptionist")<?> key()
		```
		
		Scala API
		- #### getKey
		
		
		
		```
		[ServiceKey](ServiceKey.html "class in akka.actor.typed.receptionist")<?> getKey()
		```
		
		Java API
		- #### serviceInstance
		
		
		
		```
		<T> [ActorRef](../ActorRef.html "interface in akka.actor.typed")<T> serviceInstance​([ServiceKey](ServiceKey.html "class in akka.actor.typed.receptionist")<T> key)
		```
		
		Scala API
		 
		 Also, see `ServiceKey.Listing` for more convenient pattern matching
		- #### getServiceInstance
		
		
		
		```
		<T> [ActorRef](../ActorRef.html "interface in akka.actor.typed")<T> getServiceInstance​([ServiceKey](ServiceKey.html "class in akka.actor.typed.receptionist")<T> key)
		```
		
		Java API

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/internal/receptionist/ReceptionistMessages.Registered.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/receptionist/Receptionist.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/receptionist/ServiceKey.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/receptionist/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/receptionist/Receptionist.Registered.html](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/receptionist/Receptionist.Registered.html)*