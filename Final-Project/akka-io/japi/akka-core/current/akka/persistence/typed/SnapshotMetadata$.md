---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:56:53Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/current/akka/persistence/typed/SnapshotMetadata$.html
title: SnapshotMetadata$
---

# SnapshotMetadata$

## Content

Package [akka.persistence.typed](package-summary.html)
## Class SnapshotMetadata$

- java.lang.Object
- - akka.persistence.typed.SnapshotMetadata$

- ---

```
public class SnapshotMetadata$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [SnapshotMetadata$](SnapshotMetadata$.html "class in akka.persistence.typed")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[SnapshotMetadata$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[SnapshotMetadata](SnapshotMetadata.html "class in akka.persistence.typed")` | `[apply](#apply(java.lang.String,long,long))​(java.lang.String persistenceId,  long sequenceNr,  long timestamp)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [SnapshotMetadata$](SnapshotMetadata$.html "class in akka.persistence.typed") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### SnapshotMetadata$
		
		
		
		```
		public SnapshotMetadata$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public [SnapshotMetadata](SnapshotMetadata.html "class in akka.persistence.typed") apply​(java.lang.String persistenceId,
		                              long sequenceNr,
		                              long timestamp)
		```
		
		
		Parameters:
		`persistenceId` \- id of persistent actor from which the snapshot was taken.
		`sequenceNr` \- sequence number at which the snapshot was taken.
		`timestamp` \- time at which the snapshot was saved, defaults to 0 when unknown.
		 in milliseconds from the epoch of 1970\-01\-01T00:00:00Z.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/current/akka/persistence/typed/SnapshotMetadata$.html
- https://doc.akka.io/japi/akka-core/current/akka/persistence/typed/SnapshotMetadata.html
- https://doc.akka.io/japi/akka-core/current/akka/persistence/typed/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/current/akka/persistence/typed/SnapshotMetadata$.html](https://doc.akka.io/japi/akka-core/current/akka/persistence/typed/SnapshotMetadata$.html)*