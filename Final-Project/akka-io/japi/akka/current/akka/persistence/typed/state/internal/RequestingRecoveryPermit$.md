---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:31:48Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/typed/state/internal/RequestingRecoveryPermit$.html
title: RequestingRecoveryPermit$
---

# RequestingRecoveryPermit$

## Content

Package [akka.persistence.typed.state.internal](package-summary.html)
## Class RequestingRecoveryPermit$

- java.lang.Object
- - akka.persistence.typed.state.internal.RequestingRecoveryPermit$

- ---

```
public class RequestingRecoveryPermit$
extends java.lang.Object
```

INTERNAL API
 
 First (of three) behavior of a `DurableStateBehavior`.
 

 Requests a permit to start recovery of this actor; this is tone to avoid
 hammering the store with too many concurrently recovering actors.
 

 See next behavior `Recovering`.

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [RequestingRecoveryPermit$](RequestingRecoveryPermit$.html "class in akka.persistence.typed.state.internal")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[RequestingRecoveryPermit$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<C,​S>[Behavior](../../../../actor/typed/Behavior.html "class in akka.actor.typed")<[InternalProtocol](InternalProtocol.html "interface in akka.persistence.typed.state.internal")>` | `[apply](#apply(akka.persistence.typed.state.internal.BehaviorSetup))​(akka.persistence.typed.state.internal.BehaviorSetup<C,​S> setup)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [RequestingRecoveryPermit$](RequestingRecoveryPermit$.html "class in akka.persistence.typed.state.internal") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### RequestingRecoveryPermit$
		
		
		
		```
		public RequestingRecoveryPermit$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public <C,​S> [Behavior](../../../../actor/typed/Behavior.html "class in akka.actor.typed")<[InternalProtocol](InternalProtocol.html "interface in akka.persistence.typed.state.internal")> apply​(akka.persistence.typed.state.internal.BehaviorSetup<C,​S> setup)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/typed/Behavior.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/state/internal/InternalProtocol.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/state/internal/RequestingRecoveryPermit$.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/state/internal/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/typed/state/internal/RequestingRecoveryPermit$.html](https://doc.akka.io/japi/akka/current/akka/persistence/typed/state/internal/RequestingRecoveryPermit$.html)*