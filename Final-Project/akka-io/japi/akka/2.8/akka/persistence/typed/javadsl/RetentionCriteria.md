---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:25:19Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/2.8/akka/persistence/typed/javadsl/RetentionCriteria.html
title: RetentionCriteria
---

# RetentionCriteria

## Content

Package [akka.persistence.typed.javadsl](package-summary.html)
## Class RetentionCriteria

- java.lang.Object
- - akka.persistence.typed.javadsl.RetentionCriteria

- Direct Known Subclasses:
`[DisabledRetentionCriteria$](../internal/DisabledRetentionCriteria$.html "class in akka.persistence.typed.internal")`, `[SnapshotCountRetentionCriteria](SnapshotCountRetentionCriteria.html "class in akka.persistence.typed.javadsl")`

---

```
public abstract class RetentionCriteria
extends java.lang.Object
```

Criteria for retention/deletion of snapshots and events.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[RetentionCriteria](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `abstract [RetentionCriteria](../scaladsl/RetentionCriteria.html "interface in akka.persistence.typed.scaladsl")` | `[asScala](#asScala())()` |  |
	| `static [RetentionCriteria](RetentionCriteria.html "class in akka.persistence.typed.javadsl")` | `[disabled](#disabled())()` | Snapshots are not saved and deleted automatically, events are not deleted. |
	| `static [SnapshotCountRetentionCriteria](SnapshotCountRetentionCriteria.html "class in akka.persistence.typed.javadsl")` | `[snapshotEvery](#snapshotEvery(int))​(int numberOfEvents)` | Save snapshots automatically every `numberOfEvents`. |
	| `static [SnapshotCountRetentionCriteria](SnapshotCountRetentionCriteria.html "class in akka.persistence.typed.javadsl")` | `[snapshotEvery](#snapshotEvery(int,int))​(int numberOfEvents,  int keepNSnapshots)` | Save snapshots automatically every `numberOfEvents`. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### RetentionCriteria
		
		
		
		```
		public RetentionCriteria()
		```

	- ### Method Detail
	
	
	
		- #### disabled
		
		
		
		```
		public static [RetentionCriteria](RetentionCriteria.html "class in akka.persistence.typed.javadsl") disabled()
		```
		
		Snapshots are not saved and deleted automatically, events are not deleted.
		- #### snapshotEvery
		
		
		
		```
		public static [SnapshotCountRetentionCriteria](SnapshotCountRetentionCriteria.html "class in akka.persistence.typed.javadsl") snapshotEvery​(int numberOfEvents,
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
		public static [SnapshotCountRetentionCriteria](SnapshotCountRetentionCriteria.html "class in akka.persistence.typed.javadsl") snapshotEvery​(int numberOfEvents)
		```
		
		Save snapshots automatically every `numberOfEvents`.
		 
		 Use `SnapshotCountRetentionCriteria.withDeleteEventsOnSnapshot` to
		 delete old events. Events are not deleted by default.
		 
		
		
		 If multiple events are persisted with a single Effect, the snapshot will happen after
		 all of the events are persisted rather than precisely every `numberOfEvents`.
		- #### asScala
		
		
		
		```
		public abstract [RetentionCriteria](../scaladsl/RetentionCriteria.html "interface in akka.persistence.typed.scaladsl") asScala()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/2.8/akka/persistence/typed/internal/DisabledRetentionCriteria$.html
- https://doc.akka.io/japi/akka/2.8/akka/persistence/typed/javadsl/RetentionCriteria.html
- https://doc.akka.io/japi/akka/2.8/akka/persistence/typed/javadsl/SnapshotCountRetentionCriteria.html
- https://doc.akka.io/japi/akka/2.8/akka/persistence/typed/javadsl/package-summary.html
- https://doc.akka.io/japi/akka/2.8/akka/persistence/typed/scaladsl/RetentionCriteria.html

---
*Source: [https://doc.akka.io/japi/akka/2.8/akka/persistence/typed/javadsl/RetentionCriteria.html](https://doc.akka.io/japi/akka/2.8/akka/persistence/typed/javadsl/RetentionCriteria.html)*