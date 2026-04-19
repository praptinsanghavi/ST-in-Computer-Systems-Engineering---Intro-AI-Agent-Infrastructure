---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:29:10Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/typed/internal/Running$.html
title: Running$
---

# Running$

## Content

Package [akka.persistence.typed.internal](package-summary.html)
## Class Running$

- java.lang.Object
- - akka.persistence.typed.internal.Running$

- ---

```
public class Running$
extends java.lang.Object
```

INTERNAL API
 
 Conceptually fourth (of four) \-\- also known as 'final' or 'ultimate' \-\- form of EventSourcedBehavior.
 

 In this phase recovery has completed successfully and we continue handling incoming commands,
 as well as persisting new events as dictated by the user handlers.
 

 This behavior operates in three phases (also behaviors):
 \- HandlingCommands \- where the command handler is invoked for incoming commands
 \- PersistingEvents \- where incoming commands are stashed until persistence completes
 \- storingSnapshot \- where incoming commands are stashed until snapshot storage completes
 

 This is implemented as such to avoid creating many EventSourced Running instances,
 which perform the Persistence extension lookup on creation and similar things (config lookup)
 

 See previous `ReplayingEvents`.

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Running$](Running$.html "class in akka.persistence.typed.internal")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Running$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `java.lang.String` | `[formatTimestamp](#formatTimestamp(long))​(long time)` |  |
	| `<C,​E,​S>akka.persistence.typed.internal.Running.RunningState<S>` | `[startReplicationStream](#startReplicationStream(akka.persistence.typed.internal.BehaviorSetup,akka.persistence.typed.internal.Running.RunningState,akka.persistence.typed.internal.ReplicationSetup))​(akka.persistence.typed.internal.BehaviorSetup<C,​E,​S> setup,  akka.persistence.typed.internal.Running.RunningState<S> state,  akka.persistence.typed.internal.ReplicationSetup replicationSetup)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [Running$](Running$.html "class in akka.persistence.typed.internal") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Running$
		
		
		
		```
		public Running$()
		```

	- ### Method Detail
	
	
	
		- #### startReplicationStream
		
		
		
		```
		public <C,​E,​S> akka.persistence.typed.internal.Running.RunningState<S> startReplicationStream​(akka.persistence.typed.internal.BehaviorSetup<C,​E,​S> setup,
		                                                                                                          akka.persistence.typed.internal.Running.RunningState<S> state,
		                                                                                                          akka.persistence.typed.internal.ReplicationSetup replicationSetup)
		```
		- #### formatTimestamp
		
		
		
		```
		public java.lang.String formatTimestamp​(long time)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/persistence/typed/internal/Running$.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/internal/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/typed/internal/Running$.html](https://doc.akka.io/japi/akka/current/akka/persistence/typed/internal/Running$.html)*