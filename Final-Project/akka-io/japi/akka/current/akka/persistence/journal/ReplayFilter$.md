---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:24:29Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/journal/ReplayFilter$.html
title: ReplayFilter$
---

# ReplayFilter$

## Content

Package [akka.persistence.journal](package-summary.html)
## Class ReplayFilter$

- java.lang.Object
- - akka.persistence.journal.ReplayFilter$

- ---

```
public class ReplayFilter$
extends java.lang.Object
```

INTERNAL API
 
 Detect corrupt event stream during replay. It uses the writerUuid and the
 sequenceNr in the replayed events to find events emitted by overlapping writers.

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ReplayFilter$](ReplayFilter$.html "class in akka.persistence.journal")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ReplayFilter$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[Props](../../actor/Props.html "class in akka.actor")` | `[props](#props(akka.actor.ActorRef,akka.persistence.journal.ReplayFilter.Mode,int,int))​([ActorRef](../../actor/ActorRef.html "class in akka.actor") persistentActor,  akka.persistence.journal.ReplayFilter.Mode mode,  int windowSize,  int maxOldWriters)` |  |
	| `[Props](../../actor/Props.html "class in akka.actor")` | `[props](#props(akka.actor.ActorRef,akka.persistence.journal.ReplayFilter.Mode,int,int,boolean))​([ActorRef](../../actor/ActorRef.html "class in akka.actor") persistentActor,  akka.persistence.journal.ReplayFilter.Mode mode,  int windowSize,  int maxOldWriters,  boolean debugEnabled)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ReplayFilter$](ReplayFilter$.html "class in akka.persistence.journal") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ReplayFilter$
		
		
		
		```
		public ReplayFilter$()
		```

	- ### Method Detail
	
	
	
		- #### props
		
		
		
		```
		public [Props](../../actor/Props.html "class in akka.actor") props​([ActorRef](../../actor/ActorRef.html "class in akka.actor") persistentActor,
		                   akka.persistence.journal.ReplayFilter.Mode mode,
		                   int windowSize,
		                   int maxOldWriters,
		                   boolean debugEnabled)
		```
		- #### props
		
		
		
		```
		public [Props](../../actor/Props.html "class in akka.actor") props​([ActorRef](../../actor/ActorRef.html "class in akka.actor") persistentActor,
		                   akka.persistence.journal.ReplayFilter.Mode mode,
		                   int windowSize,
		                   int maxOldWriters)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka/current/akka/actor/Props.html
- https://doc.akka.io/japi/akka/current/akka/persistence/journal/ReplayFilter$.html
- https://doc.akka.io/japi/akka/current/akka/persistence/journal/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/journal/ReplayFilter$.html](https://doc.akka.io/japi/akka/current/akka/persistence/journal/ReplayFilter$.html)*