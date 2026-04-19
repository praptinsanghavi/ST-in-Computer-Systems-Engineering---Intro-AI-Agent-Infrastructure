---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:30:08Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/typed/javadsl/RetentionCriteria$.html
title: RetentionCriteria$
---

# RetentionCriteria$

## Content

Package [akka.persistence.typed.javadsl](package-summary.html)
## Class RetentionCriteria$

- java.lang.Object
- - akka.persistence.typed.javadsl.RetentionCriteria$

- ---

```
public class RetentionCriteria$
extends java.lang.Object
```

Criteria for retention/deletion of snapshots and events.

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [RetentionCriteria$](RetentionCriteria$.html "class in akka.persistence.typed.javadsl")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[RetentionCriteria$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[RetentionCriteria](RetentionCriteria.html "class in akka.persistence.typed.javadsl")` | `[disabled](#disabled())()` | Snapshots are not saved and deleted automatically, events are not deleted. |
	| `[SnapshotCountRetentionCriteria](SnapshotCountRetentionCriteria.html "class in akka.persistence.typed.javadsl")` | `[snapshotEvery](#snapshotEvery(int))​(int numberOfEvents)` | Save snapshots automatically every `numberOfEvents`. |
	| `[SnapshotCountRetentionCriteria](SnapshotCountRetentionCriteria.html "class in akka.persistence.typed.javadsl")` | `[snapshotEvery](#snapshotEvery(int,int))​(int numberOfEvents,  int keepNSnapshots)` | Save snapshots automatically every `numberOfEvents`. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [RetentionCriteria$](RetentionCriteria$.html "class in akka.persistence.typed.javadsl") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### RetentionCriteria$
		
		
		
		```
		public RetentionCriteria$()
		```

	- ### Method Detail
	
	
	
		- #### disabled
		
		
		
		```
		public [RetentionCriteria](RetentionCriteria.html "class in akka.persistence.typed.javadsl") disabled()
		```
		
		Snapshots are not saved and deleted automatically, events are not deleted.
		- #### snapshotEvery
		
		
		
		```
		public [SnapshotCountRetentionCriteria](SnapshotCountRetentionCriteria.html "class in akka.persistence.typed.javadsl") snapshotEvery​(int numberOfEvents,
		                                                    int keepNSnapshots)
		```
		
		Save snapshots automatically every `numberOfEvents`. Snapshots that have sequence number
		 less than the sequence number of the saved snapshot minus `keepNSnapshots * numberOfEvents` are automatically
		 deleted.
		 
		 Use `SnapshotCountRetentionCriteria.withDeleteEventsOnSnapshot` to
		 delete old events. Events are not deleted by default.
		 
		
		
		 If multiple events are persisted with a single Effect, the snapshot will happen after
		 all of the events are persisted rather than precisely every `numberOfEvents`.
		- #### snapshotEvery
		
		
		
		```
		public [SnapshotCountRetentionCriteria](SnapshotCountRetentionCriteria.html "class in akka.persistence.typed.javadsl") snapshotEvery​(int numberOfEvents)
		```
		
		Save snapshots automatically every `numberOfEvents`.
		 
		 Use `SnapshotCountRetentionCriteria.withDeleteEventsOnSnapshot` to
		 delete old events. Events are not deleted by default.
		 
		
		
		 If multiple events are persisted with a single Effect, the snapshot will happen after
		 all of the events are persisted rather than precisely every `numberOfEvents`.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/persistence/typed/javadsl/RetentionCriteria$.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/javadsl/RetentionCriteria.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/javadsl/SnapshotCountRetentionCriteria.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/javadsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/typed/javadsl/RetentionCriteria$.html](https://doc.akka.io/japi/akka/current/akka/persistence/typed/javadsl/RetentionCriteria$.html)*