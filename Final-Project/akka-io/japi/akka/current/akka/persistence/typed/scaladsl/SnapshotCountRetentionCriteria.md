---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:30:57Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/typed/scaladsl/SnapshotCountRetentionCriteria.html
title: SnapshotCountRetentionCriteria
---

# SnapshotCountRetentionCriteria

## Content

Package [akka.persistence.typed.scaladsl](package-summary.html)
## Interface SnapshotCountRetentionCriteria

- All Superinterfaces:
`[RetentionCriteria](RetentionCriteria.html "interface in akka.persistence.typed.scaladsl")`

---

```
public interface SnapshotCountRetentionCriteria
extends [RetentionCriteria](RetentionCriteria.html "interface in akka.persistence.typed.scaladsl")
```

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `[SnapshotCountRetentionCriteria](SnapshotCountRetentionCriteria.html "interface in akka.persistence.typed.scaladsl")` | `[withDeleteEventsOnSnapshot](#withDeleteEventsOnSnapshot())()` | Delete events after saving snapshot via `RetentionCriteria.snapshotEvery`. |
	
	
		- ### Methods inherited from interface akka.persistence.typed.scaladsl.[RetentionCriteria](RetentionCriteria.html "interface in akka.persistence.typed.scaladsl")
		
		
		`[asJava](RetentionCriteria.html#asJava())`

- - ### Method Detail
	
	
	
		- #### withDeleteEventsOnSnapshot
		
		
		
		```
		[SnapshotCountRetentionCriteria](SnapshotCountRetentionCriteria.html "interface in akka.persistence.typed.scaladsl") withDeleteEventsOnSnapshot()
		```
		
		Delete events after saving snapshot via `RetentionCriteria.snapshotEvery`.
		 Events that have sequence number less than the snapshot sequence number minus
		 `keepNSnapshots * numberOfEvents` are deleted.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/persistence/typed/scaladsl/RetentionCriteria.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/scaladsl/SnapshotCountRetentionCriteria.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/scaladsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/typed/scaladsl/SnapshotCountRetentionCriteria.html](https://doc.akka.io/japi/akka/current/akka/persistence/typed/scaladsl/SnapshotCountRetentionCriteria.html)*