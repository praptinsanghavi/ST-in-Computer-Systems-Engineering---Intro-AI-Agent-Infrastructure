---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:56:52Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/current/akka/persistence/typed/SnapshotMetadata.html
title: SnapshotMetadata
---

# SnapshotMetadata

## Content

Package [akka.persistence.typed](package-summary.html)
## Class SnapshotMetadata

- java.lang.Object
- - akka.persistence.typed.SnapshotMetadata

- ---

```
public final class SnapshotMetadata
extends java.lang.Object
```

Snapshot metadata.
 
 param: persistenceId id of persistent actor from which the snapshot was taken.
 param: sequenceNr sequence number at which the snapshot was taken.
 param: timestamp time at which the snapshot was saved, defaults to 0 when unknown.
 in milliseconds from the epoch of 1970\-01\-01T00:00:00Z.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[SnapshotMetadata](#%3Cinit%3E(java.lang.String,long,long))​(java.lang.String persistenceId,  long sequenceNr,  long timestamp)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [SnapshotMetadata](SnapshotMetadata.html "class in akka.persistence.typed")` | `[apply](#apply(java.lang.String,long,long))​(java.lang.String persistenceId,  long sequenceNr,  long timestamp)` |  |
	| `java.lang.String` | `[persistenceId](#persistenceId())()` |  |
	| `long` | `[sequenceNr](#sequenceNr())()` |  |
	| `long` | `[timestamp](#timestamp())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### SnapshotMetadata
		
		
		
		```
		public SnapshotMetadata​(java.lang.String persistenceId,
		                        long sequenceNr,
		                        long timestamp)
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static [SnapshotMetadata](SnapshotMetadata.html "class in akka.persistence.typed") apply​(java.lang.String persistenceId,
		                                     long sequenceNr,
		                                     long timestamp)
		```
		
		
		Parameters:
		`persistenceId` \- id of persistent actor from which the snapshot was taken.
		`sequenceNr` \- sequence number at which the snapshot was taken.
		`timestamp` \- time at which the snapshot was saved, defaults to 0 when unknown.
		 in milliseconds from the epoch of 1970\-01\-01T00:00:00Z.
		- #### persistenceId
		
		
		
		```
		public java.lang.String persistenceId()
		```
		- #### sequenceNr
		
		
		
		```
		public long sequenceNr()
		```
		- #### timestamp
		
		
		
		```
		public long timestamp()
		```
		- #### toString
		
		
		
		```
		public java.lang.String toString()
		```
		
		
		Overrides:
		`toString` in class `java.lang.Object`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/current/akka/persistence/typed/SnapshotMetadata.html
- https://doc.akka.io/japi/akka-core/current/akka/persistence/typed/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/current/akka/persistence/typed/SnapshotMetadata.html](https://doc.akka.io/japi/akka-core/current/akka/persistence/typed/SnapshotMetadata.html)*