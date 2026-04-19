---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:30:10Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/typed/javadsl/SnapshotCountRetentionCriteria.html
title: SnapshotCountRetentionCriteria
---

# SnapshotCountRetentionCriteria

## Content

Package [akka.persistence.typed.javadsl](package-summary.html)
## Class SnapshotCountRetentionCriteria

- java.lang.Object
- - [akka.persistence.typed.javadsl.RetentionCriteria](RetentionCriteria.html "class in akka.persistence.typed.javadsl")
	- - akka.persistence.typed.javadsl.SnapshotCountRetentionCriteria

- ---

```
public abstract class SnapshotCountRetentionCriteria
extends [RetentionCriteria](RetentionCriteria.html "class in akka.persistence.typed.javadsl")
```

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[SnapshotCountRetentionCriteria](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `abstract [SnapshotCountRetentionCriteria](SnapshotCountRetentionCriteria.html "class in akka.persistence.typed.javadsl")` | `[withDeleteEventsOnSnapshot](#withDeleteEventsOnSnapshot())()` | Delete events after saving snapshot via `RetentionCriteria.snapshotEvery`. |
	
	
		- ### Methods inherited from class akka.persistence.typed.javadsl.[RetentionCriteria](RetentionCriteria.html "class in akka.persistence.typed.javadsl")
		
		
		`[asScala](RetentionCriteria.html#asScala()), [disabled](RetentionCriteria.html#disabled()), [snapshotEvery](RetentionCriteria.html#snapshotEvery(int)), [snapshotEvery](RetentionCriteria.html#snapshotEvery(int,int))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### SnapshotCountRetentionCriteria
		
		
		
		```
		public SnapshotCountRetentionCriteria()
		```

	- ### Method Detail
	
	
	
		- #### withDeleteEventsOnSnapshot
		
		
		
		```
		public abstract [SnapshotCountRetentionCriteria](SnapshotCountRetentionCriteria.html "class in akka.persistence.typed.javadsl") withDeleteEventsOnSnapshot()
		```
		
		Delete events after saving snapshot via `RetentionCriteria.snapshotEvery`.
		 Events that have sequence number less than the snapshot sequence number minus
		 `keepNSnapshots * numberOfEvents` are deleted.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/persistence/typed/javadsl/RetentionCriteria.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/javadsl/SnapshotCountRetentionCriteria.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/javadsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/typed/javadsl/SnapshotCountRetentionCriteria.html](https://doc.akka.io/japi/akka/current/akka/persistence/typed/javadsl/SnapshotCountRetentionCriteria.html)*