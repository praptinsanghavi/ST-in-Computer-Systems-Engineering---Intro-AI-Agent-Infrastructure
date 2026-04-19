---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:55:51Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/receptionist/ReceptionistMessages.Subscribe$.html
title: ReceptionistMessages.Subscribe$
---

# ReceptionistMessages.Subscribe$

## Content

Package [akka.actor.typed.internal.receptionist](package-summary.html)
## Class ReceptionistMessages.Subscribe$

- java.lang.Object
- - akka.actor.typed.internal.receptionist.ReceptionistMessages.Subscribe$

- All Implemented Interfaces:
`java.io.Serializable`

Enclosing class:
[ReceptionistMessages](ReceptionistMessages.html "class in akka.actor.typed.internal.receptionist")

---

```
public static class ReceptionistMessages.Subscribe$
extends java.lang.Object
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../../../serialized-form.html#akka.actor.typed.internal.receptionist.ReceptionistMessages.Subscribe$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ReceptionistMessages.Subscribe$](ReceptionistMessages.Subscribe$.html "class in akka.actor.typed.internal.receptionist")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Subscribe$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<T> [ReceptionistMessages.Subscribe](ReceptionistMessages.Subscribe.html "class in akka.actor.typed.internal.receptionist")<T>` | `[apply](#apply(akka.actor.typed.receptionist.ServiceKey,akka.actor.typed.ActorRef))​([ServiceKey](../../receptionist/ServiceKey.html "class in akka.actor.typed.receptionist")<T> key,  [ActorRef](../../ActorRef.html "interface in akka.actor.typed")<[Receptionist.Listing](../../receptionist/Receptionist.Listing.html "interface in akka.actor.typed.receptionist")> subscriber)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `<T> scala.Option<scala.Tuple2<[ServiceKey](../../receptionist/ServiceKey.html "class in akka.actor.typed.receptionist")<T>,​[ActorRef](../../ActorRef.html "interface in akka.actor.typed")<[Receptionist.Listing](../../receptionist/Receptionist.Listing.html "interface in akka.actor.typed.receptionist")>>>` | `[unapply](#unapply(akka.actor.typed.internal.receptionist.ReceptionistMessages.Subscribe))​([ReceptionistMessages.Subscribe](ReceptionistMessages.Subscribe.html "class in akka.actor.typed.internal.receptionist")<T> x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ReceptionistMessages.Subscribe$](ReceptionistMessages.Subscribe$.html "class in akka.actor.typed.internal.receptionist") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Subscribe$
		
		
		
		```
		public Subscribe$()
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
		public <T> [ReceptionistMessages.Subscribe](ReceptionistMessages.Subscribe.html "class in akka.actor.typed.internal.receptionist")<T> apply​([ServiceKey](../../receptionist/ServiceKey.html "class in akka.actor.typed.receptionist")<T> key,
		                                                   [ActorRef](../../ActorRef.html "interface in akka.actor.typed")<[Receptionist.Listing](../../receptionist/Receptionist.Listing.html "interface in akka.actor.typed.receptionist")> subscriber)
		```
		- #### unapply
		
		
		
		```
		public <T> scala.Option<scala.Tuple2<[ServiceKey](../../receptionist/ServiceKey.html "class in akka.actor.typed.receptionist")<T>,​[ActorRef](../../ActorRef.html "interface in akka.actor.typed")<[Receptionist.Listing](../../receptionist/Receptionist.Listing.html "interface in akka.actor.typed.receptionist")>>> unapply​([ReceptionistMessages.Subscribe](ReceptionistMessages.Subscribe.html "class in akka.actor.typed.internal.receptionist")<T> x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/typed/ActorRef.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/receptionist/ReceptionistMessages.Subscribe$.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/receptionist/ReceptionistMessages.Subscribe.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/receptionist/ReceptionistMessages.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/receptionist/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/receptionist/Receptionist.Listing.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/receptionist/ServiceKey.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/receptionist/ReceptionistMessages.Subscribe$.html](https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/receptionist/ReceptionistMessages.Subscribe$.html)*