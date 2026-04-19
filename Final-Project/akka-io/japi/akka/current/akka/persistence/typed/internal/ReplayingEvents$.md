---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:29:01Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/typed/internal/ReplayingEvents$.html
title: ReplayingEvents$
---

# ReplayingEvents$

## Content

Package [akka.persistence.typed.internal](package-summary.html)
## Class ReplayingEvents$

- java.lang.Object
- - akka.persistence.typed.internal.ReplayingEvents$

- ---

```
public class ReplayingEvents$
extends java.lang.Object
```

INTERNAL API
 
 Third (of four) behavior of an EventSourcedBehavior.
 

 In this behavior we finally start replaying events, beginning from the last applied sequence number
 (i.e. the one up\-until\-which the snapshot recovery has brought us).
 

 Once recovery is completed, the actor becomes `Running`, stashed messages are flushed
 and control is given to the user's handlers to drive the actors behavior from there.
 

 See next behavior `Running`.
 See previous behavior `ReplayingSnapshot`.

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ReplayingEvents$](ReplayingEvents$.html "class in akka.persistence.typed.internal")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ReplayingEvents$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<C,​E,​S>[Behavior](../../../actor/typed/Behavior.html "class in akka.actor.typed")<[InternalProtocol](InternalProtocol.html "interface in akka.persistence.typed.internal")>` | `[apply](#apply(akka.persistence.typed.internal.BehaviorSetup,akka.persistence.typed.internal.ReplayingEvents.ReplayingState))​(akka.persistence.typed.internal.BehaviorSetup<C,​E,​S> setup,  akka.persistence.typed.internal.ReplayingEvents.ReplayingState<S> state)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ReplayingEvents$](ReplayingEvents$.html "class in akka.persistence.typed.internal") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ReplayingEvents$
		
		
		
		```
		public ReplayingEvents$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public <C,​E,​S> [Behavior](../../../actor/typed/Behavior.html "class in akka.actor.typed")<[InternalProtocol](InternalProtocol.html "interface in akka.persistence.typed.internal")> apply​(akka.persistence.typed.internal.BehaviorSetup<C,​E,​S> setup,
		                                                            akka.persistence.typed.internal.ReplayingEvents.ReplayingState<S> state)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/typed/Behavior.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/internal/InternalProtocol.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/internal/ReplayingEvents$.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/internal/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/typed/internal/ReplayingEvents$.html](https://doc.akka.io/japi/akka/current/akka/persistence/typed/internal/ReplayingEvents$.html)*