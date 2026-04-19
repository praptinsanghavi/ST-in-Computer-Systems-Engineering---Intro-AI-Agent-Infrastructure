---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:51:29Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/SnapshotSelectionCriteria$.html
title: SnapshotSelectionCriteria$
---

# SnapshotSelectionCriteria$

## Content

Package [akka.persistence.typed](package-summary.html)
## Class SnapshotSelectionCriteria$

- java.lang.Object
- - akka.persistence.typed.SnapshotSelectionCriteria$

- ---

```
public class SnapshotSelectionCriteria$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [SnapshotSelectionCriteria$](SnapshotSelectionCriteria$.html "class in akka.persistence.typed")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[SnapshotSelectionCriteria$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[SnapshotSelectionCriteria](SnapshotSelectionCriteria.html "class in akka.persistence.typed")` | `[latest](#latest())()` | The latest saved snapshot. |
	| `[SnapshotSelectionCriteria](SnapshotSelectionCriteria.html "class in akka.persistence.typed")` | `[none](#none())()` | No saved snapshot matches. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [SnapshotSelectionCriteria$](SnapshotSelectionCriteria$.html "class in akka.persistence.typed") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### SnapshotSelectionCriteria$
		
		
		
		```
		public SnapshotSelectionCriteria$()
		```

	- ### Method Detail
	
	
	
		- #### latest
		
		
		
		```
		public [SnapshotSelectionCriteria](SnapshotSelectionCriteria.html "class in akka.persistence.typed") latest()
		```
		
		The latest saved snapshot.
		- #### none
		
		
		
		```
		public [SnapshotSelectionCriteria](SnapshotSelectionCriteria.html "class in akka.persistence.typed") none()
		```
		
		No saved snapshot matches.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/SnapshotSelectionCriteria$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/SnapshotSelectionCriteria.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/SnapshotSelectionCriteria$.html](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/SnapshotSelectionCriteria$.html)*