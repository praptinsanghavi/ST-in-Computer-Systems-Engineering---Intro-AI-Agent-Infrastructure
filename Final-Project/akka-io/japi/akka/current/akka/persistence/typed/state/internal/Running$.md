---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:31:48Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/typed/state/internal/Running$.html
title: Running$
---

# Running$

## Content

Package [akka.persistence.typed.state.internal](package-summary.html)
## Class Running$

- java.lang.Object
- - akka.persistence.typed.state.internal.Running$

- ---

```
public class Running$
extends java.lang.Object
```

INTERNAL API
 
 Conceptually third (of three) \-\- also known as 'final' or 'ultimate' \-\- form of `DurableStateBehavior`.
 

 In this phase recovery has completed successfully and we continue handling incoming commands,
 as well as persisting new state as dictated by the user handlers.
 

 This behavior operates in two phases (also behaviors):
 \- HandlingCommands \- where the command handler is invoked for incoming commands
 \- PersistingState \- where incoming commands are stashed until persistence completes
 

 This is implemented as such to avoid creating many Running instances,
 which perform the Persistence extension lookup on creation and similar things (config lookup)
 

 See previous `Recovering`.

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Running$](Running$.html "class in akka.persistence.typed.state.internal")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Running$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [Running$](Running$.html "class in akka.persistence.typed.state.internal") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Running$
		
		
		
		```
		public Running$()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/persistence/typed/state/internal/Running$.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/state/internal/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/typed/state/internal/Running$.html](https://doc.akka.io/japi/akka/current/akka/persistence/typed/state/internal/Running$.html)*