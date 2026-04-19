---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:29:02Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/typed/internal/ReplayingSnapshot$.html
title: ReplayingSnapshot$
---

# ReplayingSnapshot$

## Content

Package [akka.persistence.typed.internal](package-summary.html)
## Class ReplayingSnapshot$

- java.lang.Object
- - akka.persistence.typed.internal.ReplayingSnapshot$

- ---

```
public class ReplayingSnapshot$
extends java.lang.Object
```

INTERNAL API
 
 Second (of four) behavior of an EventSourcedBehavior.
 

 In this behavior the recovery process is initiated.
 We try to obtain a snapshot from the configured snapshot store,
 and if it exists, we use it instead of the initial `emptyState`.
 

 Once snapshot recovery is done (or no snapshot was selected),
 recovery of events continues in `ReplayingEvents`.
 

 See next behavior `ReplayingEvents`.
 See previous behavior `RequestingRecoveryPermit`.

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ReplayingSnapshot$](ReplayingSnapshot$.html "class in akka.persistence.typed.internal")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ReplayingSnapshot$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<C,​E,​S>[Behavior](../../../actor/typed/Behavior.html "class in akka.actor.typed")<[InternalProtocol](InternalProtocol.html "interface in akka.persistence.typed.internal")>` | `[apply](#apply(akka.persistence.typed.internal.BehaviorSetup,boolean))​(akka.persistence.typed.internal.BehaviorSetup<C,​E,​S> setup,  boolean receivedPoisonPill)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ReplayingSnapshot$](ReplayingSnapshot$.html "class in akka.persistence.typed.internal") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ReplayingSnapshot$
		
		
		
		```
		public ReplayingSnapshot$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public <C,​E,​S> [Behavior](../../../actor/typed/Behavior.html "class in akka.actor.typed")<[InternalProtocol](InternalProtocol.html "interface in akka.persistence.typed.internal")> apply​(akka.persistence.typed.internal.BehaviorSetup<C,​E,​S> setup,
		                                                            boolean receivedPoisonPill)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/typed/Behavior.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/internal/InternalProtocol.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/internal/ReplayingSnapshot$.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/internal/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/typed/internal/ReplayingSnapshot$.html](https://doc.akka.io/japi/akka/current/akka/persistence/typed/internal/ReplayingSnapshot$.html)*