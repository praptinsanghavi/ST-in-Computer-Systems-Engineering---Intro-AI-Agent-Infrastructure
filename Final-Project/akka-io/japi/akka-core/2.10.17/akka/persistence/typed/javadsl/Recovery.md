---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:48:28Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/javadsl/Recovery.html
title: Recovery
---

# Recovery

## Content

Package [akka.persistence.typed.javadsl](package-summary.html)
## Class Recovery

- java.lang.Object
- - akka.persistence.typed.javadsl.Recovery

- Direct Known Subclasses:
`[DefaultRecovery$](../internal/DefaultRecovery$.html "class in akka.persistence.typed.internal")`, `[DisabledRecovery$](../internal/DisabledRecovery$.html "class in akka.persistence.typed.internal")`, `[ReplayOnlyLastRecovery$](../internal/ReplayOnlyLastRecovery$.html "class in akka.persistence.typed.internal")`

---

```
public abstract class Recovery
extends java.lang.Object
```

Strategy for recovery of snapshots and events.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Recovery](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `abstract [Recovery](../scaladsl/Recovery.html "interface in akka.persistence.typed.scaladsl")` | `[asScala](#asScala())()` |  |
	| `static [Recovery](Recovery.html "class in akka.persistence.typed.javadsl")` | `[disabled](#disabled())()` | Neither snapshots nor events are recovered |
	| `static [Recovery](Recovery.html "class in akka.persistence.typed.javadsl")` | `[enabled](#enabled())()` | Snapshots and events are recovered |
	| `static [Recovery](Recovery.html "class in akka.persistence.typed.javadsl")` | `[replayOnlyLast](#replayOnlyLast())()` | Don't load snapshot and replay only last event. |
	| `static akka.persistence.typed.internal.RecoveryWithSnapshotSelectionCriteria` | `[withSnapshotSelectionCriteria](#withSnapshotSelectionCriteria(akka.persistence.typed.SnapshotSelectionCriteria))​([SnapshotSelectionCriteria](../SnapshotSelectionCriteria.html "class in akka.persistence.typed") snapshotSelectionCriteria)` | Changes the snapshot selection criteria used for the recovery. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### Recovery
		
		
		
		```
		public Recovery()
		```

	- ### Method Detail
	
	
	
		- #### enabled
		
		
		
		```
		public static [Recovery](Recovery.html "class in akka.persistence.typed.javadsl") enabled()
		```
		
		Snapshots and events are recovered
		- #### disabled
		
		
		
		```
		public static [Recovery](Recovery.html "class in akka.persistence.typed.javadsl") disabled()
		```
		
		Neither snapshots nor events are recovered
		- #### withSnapshotSelectionCriteria
		
		
		
		```
		public static akka.persistence.typed.internal.RecoveryWithSnapshotSelectionCriteria withSnapshotSelectionCriteria​([SnapshotSelectionCriteria](../SnapshotSelectionCriteria.html "class in akka.persistence.typed") snapshotSelectionCriteria)
		```
		
		Changes the snapshot selection criteria used for the recovery.
		 
		 By default the most recent snapshot is used, and the remaining state updates are recovered by replaying events
		 from the sequence number up until which the snapshot reached.
		 
		
		
		 You may configure the behavior to skip replaying snapshots completely, in which case the recovery will be
		 performed by replaying all events \-\- which may take a long time.
		- #### replayOnlyLast
		
		
		
		```
		public static [Recovery](Recovery.html "class in akka.persistence.typed.javadsl") replayOnlyLast()
		```
		
		Don't load snapshot and replay only last event.
		- #### asScala
		
		
		
		```
		public abstract [Recovery](../scaladsl/Recovery.html "interface in akka.persistence.typed.scaladsl") asScala()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/SnapshotSelectionCriteria.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/internal/DefaultRecovery$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/internal/DisabledRecovery$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/internal/ReplayOnlyLastRecovery$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/javadsl/Recovery.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/javadsl/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/scaladsl/Recovery.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/javadsl/Recovery.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/javadsl/Recovery.html)*