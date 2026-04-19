---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:44:01Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/typed/SnapshotSelectionCriteria.html
title: SnapshotSelectionCriteria
---

# SnapshotSelectionCriteria

## Content

Package [akka.persistence.typed](package-summary.html)
## Class SnapshotSelectionCriteria

- java.lang.Object
- - akka.persistence.typed.SnapshotSelectionCriteria

- ---

```
public final class SnapshotSelectionCriteria
extends java.lang.Object
```

Selection criteria for loading and deleting snapshots.

- - ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object other)` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `static [SnapshotSelectionCriteria](SnapshotSelectionCriteria.html "class in akka.persistence.typed")` | `[latest](#latest())()` | The latest saved snapshot. |
	| `long` | `[maxSequenceNr](#maxSequenceNr())()` |  |
	| `long` | `[maxTimestamp](#maxTimestamp())()` |  |
	| `long` | `[minSequenceNr](#minSequenceNr())()` |  |
	| `long` | `[minTimestamp](#minTimestamp())()` |  |
	| `static [SnapshotSelectionCriteria](SnapshotSelectionCriteria.html "class in akka.persistence.typed")` | `[none](#none())()` | No saved snapshot matches. |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `[SnapshotSelectionCriteria](SnapshotSelectionCriteria.html "class in akka.persistence.typed")` | `[withMaxSequenceNr](#withMaxSequenceNr(long))​(long newMaxSequenceNr)` | upper bound for a selected snapshot's sequence number |
	| `[SnapshotSelectionCriteria](SnapshotSelectionCriteria.html "class in akka.persistence.typed")` | `[withMaxTimestamp](#withMaxTimestamp(long))​(long newMaxTimestamp)` | upper bound for a selected snapshot's timestamp, in milliseconds from the epoch  of 1970\-01\-01T00:00:00Z. |
	| `[SnapshotSelectionCriteria](SnapshotSelectionCriteria.html "class in akka.persistence.typed")` | `[withMinSequenceNr](#withMinSequenceNr(long))​(long newMinSequenceNr)` | lower bound for a selected snapshot's sequence number |
	| `[SnapshotSelectionCriteria](SnapshotSelectionCriteria.html "class in akka.persistence.typed")` | `[withMinTimestamp](#withMinTimestamp(long))​(long newMinTimestamp)` | lower bound for a selected snapshot's timestamp, in milliseconds from the epoch  of 1970\-01\-01T00:00:00Z. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`

- - ### Method Detail
	
	
	
		- #### latest
		
		
		
		```
		public static [SnapshotSelectionCriteria](SnapshotSelectionCriteria.html "class in akka.persistence.typed") latest()
		```
		
		The latest saved snapshot.
		- #### none
		
		
		
		```
		public static [SnapshotSelectionCriteria](SnapshotSelectionCriteria.html "class in akka.persistence.typed") none()
		```
		
		No saved snapshot matches.
		- #### maxSequenceNr
		
		
		
		```
		public long maxSequenceNr()
		```
		- #### maxTimestamp
		
		
		
		```
		public long maxTimestamp()
		```
		- #### minSequenceNr
		
		
		
		```
		public long minSequenceNr()
		```
		- #### minTimestamp
		
		
		
		```
		public long minTimestamp()
		```
		- #### withMaxSequenceNr
		
		
		
		```
		public [SnapshotSelectionCriteria](SnapshotSelectionCriteria.html "class in akka.persistence.typed") withMaxSequenceNr​(long newMaxSequenceNr)
		```
		
		upper bound for a selected snapshot's sequence number
		- #### withMaxTimestamp
		
		
		
		```
		public [SnapshotSelectionCriteria](SnapshotSelectionCriteria.html "class in akka.persistence.typed") withMaxTimestamp​(long newMaxTimestamp)
		```
		
		upper bound for a selected snapshot's timestamp, in milliseconds from the epoch
		 of 1970\-01\-01T00:00:00Z.
		- #### withMinSequenceNr
		
		
		
		```
		public [SnapshotSelectionCriteria](SnapshotSelectionCriteria.html "class in akka.persistence.typed") withMinSequenceNr​(long newMinSequenceNr)
		```
		
		lower bound for a selected snapshot's sequence number
		- #### withMinTimestamp
		
		
		
		```
		public [SnapshotSelectionCriteria](SnapshotSelectionCriteria.html "class in akka.persistence.typed") withMinTimestamp​(long newMinTimestamp)
		```
		
		lower bound for a selected snapshot's timestamp, in milliseconds from the epoch
		 of 1970\-01\-01T00:00:00Z.
		- #### toString
		
		
		
		```
		public java.lang.String toString()
		```
		
		
		Overrides:
		`toString` in class `java.lang.Object`
		- #### equals
		
		
		
		```
		public boolean equals​(java.lang.Object other)
		```
		
		
		Overrides:
		`equals` in class `java.lang.Object`
		- #### hashCode
		
		
		
		```
		public int hashCode()
		```
		
		
		Overrides:
		`hashCode` in class `java.lang.Object`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/persistence/typed/SnapshotSelectionCriteria.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/typed/SnapshotSelectionCriteria.html](https://doc.akka.io/japi/akka/current/akka/persistence/typed/SnapshotSelectionCriteria.html)*