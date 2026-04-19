---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:31:49Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/typed/state/internal/Recovering$.html
title: Recovering$
---

# Recovering$

## Content

Package [akka.persistence.typed.state.internal](package-summary.html)
## Class Recovering$

- java.lang.Object
- - akka.persistence.typed.state.internal.Recovering$

- ---

```
public class Recovering$
extends java.lang.Object
```

INTERNAL API
 
 Second (of three) behavior of a `DurableStateBehavior`.
 

 In this behavior the recovery process is initiated.
 We try to obtain the state from the configured `DurableStateStore`,
 and if it exists, we use it instead of the initial `emptyState`.
 

 See next behavior `Running`.
 See previous behavior `RequestingRecoveryPermit`.

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Recovering$](Recovering$.html "class in akka.persistence.typed.state.internal")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Recovering$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<C,​S>[Behavior](../../../../actor/typed/Behavior.html "class in akka.actor.typed")<[InternalProtocol](InternalProtocol.html "interface in akka.persistence.typed.state.internal")>` | `[apply](#apply(akka.persistence.typed.state.internal.BehaviorSetup,boolean))​(akka.persistence.typed.state.internal.BehaviorSetup<C,​S> setup,  boolean receivedPoisonPill)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [Recovering$](Recovering$.html "class in akka.persistence.typed.state.internal") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Recovering$
		
		
		
		```
		public Recovering$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public <C,​S> [Behavior](../../../../actor/typed/Behavior.html "class in akka.actor.typed")<[InternalProtocol](InternalProtocol.html "interface in akka.persistence.typed.state.internal")> apply​(akka.persistence.typed.state.internal.BehaviorSetup<C,​S> setup,
		                                                    boolean receivedPoisonPill)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/typed/Behavior.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/state/internal/InternalProtocol.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/state/internal/Recovering$.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/state/internal/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/typed/state/internal/Recovering$.html](https://doc.akka.io/japi/akka/current/akka/persistence/typed/state/internal/Recovering$.html)*