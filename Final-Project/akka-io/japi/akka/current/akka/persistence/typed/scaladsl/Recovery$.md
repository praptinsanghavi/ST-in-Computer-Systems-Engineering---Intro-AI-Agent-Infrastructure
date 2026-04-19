---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:31:03Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/typed/scaladsl/Recovery$.html
title: Recovery$
---

# Recovery$

## Content

Package [akka.persistence.typed.scaladsl](package-summary.html)
## Class Recovery$

- java.lang.Object
- - akka.persistence.typed.scaladsl.Recovery$

- ---

```
public class Recovery$
extends java.lang.Object
```

Strategy for recovery of snapshots and events.

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Recovery$](Recovery$.html "class in akka.persistence.typed.scaladsl")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Recovery$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[Recovery](Recovery.html "interface in akka.persistence.typed.scaladsl")` | `[disabled](#disabled())()` | Neither snapshots nor events are recovered |
	| `[Recovery](Recovery.html "interface in akka.persistence.typed.scaladsl")` | `[replayOnlyLast](#replayOnlyLast())()` | Don't load snapshot and replay only last event. |
	| `akka.persistence.typed.internal.RecoveryWithSnapshotSelectionCriteria` | `[withSnapshotSelectionCriteria](#withSnapshotSelectionCriteria(akka.persistence.typed.SnapshotSelectionCriteria))​([SnapshotSelectionCriteria](../SnapshotSelectionCriteria.html "class in akka.persistence.typed") snapshotSelectionCriteria)` | Changes the snapshot selection criteria used for the recovery. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [Recovery$](Recovery$.html "class in akka.persistence.typed.scaladsl") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Recovery$
		
		
		
		```
		public Recovery$()
		```

	- ### Method Detail
	
	
	
		- #### disabled
		
		
		
		```
		public [Recovery](Recovery.html "interface in akka.persistence.typed.scaladsl") disabled()
		```
		
		Neither snapshots nor events are recovered
		- #### withSnapshotSelectionCriteria
		
		
		
		```
		public akka.persistence.typed.internal.RecoveryWithSnapshotSelectionCriteria withSnapshotSelectionCriteria​([SnapshotSelectionCriteria](../SnapshotSelectionCriteria.html "class in akka.persistence.typed") snapshotSelectionCriteria)
		```
		
		Changes the snapshot selection criteria used for the recovery.
		 
		 By default the most recent snapshot is used, and the remaining state updates are recovered by replaying events
		 from the sequence number up until which the snapshot reached.
		 
		
		
		 You may configure the behavior to skip replaying snapshots completely, in which case the recovery will be
		 performed by replaying all events \-\- which may take a long time.
		- #### replayOnlyLast
		
		
		
		```
		public [Recovery](Recovery.html "interface in akka.persistence.typed.scaladsl") replayOnlyLast()
		```
		
		Don't load snapshot and replay only last event.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/persistence/typed/SnapshotSelectionCriteria.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/scaladsl/Recovery$.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/scaladsl/Recovery.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/scaladsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/typed/scaladsl/Recovery$.html](https://doc.akka.io/japi/akka/current/akka/persistence/typed/scaladsl/Recovery$.html)*