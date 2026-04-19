---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:21:30Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/MessageDispatcher$.html
title: MessageDispatcher$
---

# MessageDispatcher$

## Content

Package [akka.dispatch](package-summary.html)
## Class MessageDispatcher$

- java.lang.Object
- - akka.dispatch.MessageDispatcher$

- ---

```
public class MessageDispatcher$
extends java.lang.Object
```

INTERNAL API

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [MessageDispatcher$](MessageDispatcher$.html "class in akka.dispatch")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[MessageDispatcher$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[Index](../util/Index.html "class in akka.util")<[MessageDispatcher](MessageDispatcher.html "class in akka.dispatch"),​[ActorRef](../actor/ActorRef.html "class in akka.actor")>` | `[actors](#actors())()` |  |
	| `boolean` | `[debug](#debug())()` |  |
	| `void` | `[printActors](#printActors())()` |  |
	| `int` | `[RESCHEDULED](#RESCHEDULED())()` |  |
	| `int` | `[SCHEDULED](#SCHEDULED())()` |  |
	| `int` | `[UNSCHEDULED](#UNSCHEDULED())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [MessageDispatcher$](MessageDispatcher$.html "class in akka.dispatch") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### MessageDispatcher$
		
		
		
		```
		public MessageDispatcher$()
		```

	- ### Method Detail
	
	
	
		- #### UNSCHEDULED
		
		
		
		```
		public int UNSCHEDULED()
		```
		- #### SCHEDULED
		
		
		
		```
		public int SCHEDULED()
		```
		- #### RESCHEDULED
		
		
		
		```
		public int RESCHEDULED()
		```
		- #### debug
		
		
		
		```
		public final boolean debug()
		```
		- #### actors
		
		
		
		```
		public [Index](../util/Index.html "class in akka.util")<[MessageDispatcher](MessageDispatcher.html "class in akka.dispatch"),​[ActorRef](../actor/ActorRef.html "class in akka.actor")> actors()
		```
		- #### printActors
		
		
		
		```
		public void printActors()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/MessageDispatcher$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/MessageDispatcher.html
- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/akka/util/Index.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/MessageDispatcher$.html](https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/MessageDispatcher$.html)*