---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:23:21Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/SnapshotSelectionCriteria$.html
title: SnapshotSelectionCriteria$
---

# SnapshotSelectionCriteria$

## Content

Package [akka.persistence](package-summary.html)
## Class SnapshotSelectionCriteria$

- java.lang.Object
- - akka.persistence.SnapshotSelectionCriteria$

- All Implemented Interfaces:
`java.io.Serializable`

---

```
public class SnapshotSelectionCriteria$
extends java.lang.Object
implements java.io.Serializable
```

See Also:
[Serialized Form](../../serialized-form.html#akka.persistence.SnapshotSelectionCriteria$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [SnapshotSelectionCriteria$](SnapshotSelectionCriteria$.html "class in akka.persistence")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[SnapshotSelectionCriteria$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `long` | `[$lessinit$greater$default$1](#$lessinit$greater$default$1())()` |  |
	| `long` | `[$lessinit$greater$default$2](#$lessinit$greater$default$2())()` |  |
	| `long` | `[$lessinit$greater$default$3](#$lessinit$greater$default$3())()` |  |
	| `long` | `[$lessinit$greater$default$4](#$lessinit$greater$default$4())()` |  |
	| `[SnapshotSelectionCriteria](SnapshotSelectionCriteria.html "class in akka.persistence")` | `[apply](#apply(long,long,long,long))​(long maxSequenceNr,  long maxTimestamp,  long minSequenceNr,  long minTimestamp)` |  |
	| `long` | `[apply$default$1](#apply$default$1())()` |  |
	| `long` | `[apply$default$2](#apply$default$2())()` |  |
	| `long` | `[apply$default$3](#apply$default$3())()` |  |
	| `long` | `[apply$default$4](#apply$default$4())()` |  |
	| `[SnapshotSelectionCriteria](SnapshotSelectionCriteria.html "class in akka.persistence")` | `[create](#create(long,long))​(long maxSequenceNr,  long maxTimestamp)` | Java API. |
	| `[SnapshotSelectionCriteria](SnapshotSelectionCriteria.html "class in akka.persistence")` | `[create](#create(long,long,long,long))​(long maxSequenceNr,  long maxTimestamp,  long minSequenceNr,  long minTimestamp)` | Java API. |
	| `[SnapshotSelectionCriteria](SnapshotSelectionCriteria.html "class in akka.persistence")` | `[latest](#latest())()` | Java API. |
	| `[SnapshotSelectionCriteria](SnapshotSelectionCriteria.html "class in akka.persistence")` | `[Latest](#Latest())()` | The latest saved snapshot. |
	| `[SnapshotSelectionCriteria](SnapshotSelectionCriteria.html "class in akka.persistence")` | `[none](#none())()` | Java API. |
	| `[SnapshotSelectionCriteria](SnapshotSelectionCriteria.html "class in akka.persistence")` | `[None](#None())()` | No saved snapshot matches. |
	| `scala.Option<scala.Tuple4<java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object>>` | `[unapply](#unapply(akka.persistence.SnapshotSelectionCriteria))​([SnapshotSelectionCriteria](SnapshotSelectionCriteria.html "class in akka.persistence") x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [SnapshotSelectionCriteria$](SnapshotSelectionCriteria$.html "class in akka.persistence") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### SnapshotSelectionCriteria$
		
		
		
		```
		public SnapshotSelectionCriteria$()
		```

	- ### Method Detail
	
	
	
		- #### $lessinit$greater$default$1
		
		
		
		```
		public long $lessinit$greater$default$1()
		```
		- #### $lessinit$greater$default$2
		
		
		
		```
		public long $lessinit$greater$default$2()
		```
		- #### $lessinit$greater$default$3
		
		
		
		```
		public long $lessinit$greater$default$3()
		```
		- #### $lessinit$greater$default$4
		
		
		
		```
		public long $lessinit$greater$default$4()
		```
		- #### Latest
		
		
		
		```
		public [SnapshotSelectionCriteria](SnapshotSelectionCriteria.html "class in akka.persistence") Latest()
		```
		
		The latest saved snapshot.
		- #### None
		
		
		
		```
		public [SnapshotSelectionCriteria](SnapshotSelectionCriteria.html "class in akka.persistence") None()
		```
		
		No saved snapshot matches.
		- #### create
		
		
		
		```
		public [SnapshotSelectionCriteria](SnapshotSelectionCriteria.html "class in akka.persistence") create​(long maxSequenceNr,
		                                        long maxTimestamp)
		```
		
		Java API.
		- #### create
		
		
		
		```
		public [SnapshotSelectionCriteria](SnapshotSelectionCriteria.html "class in akka.persistence") create​(long maxSequenceNr,
		                                        long maxTimestamp,
		                                        long minSequenceNr,
		                                        long minTimestamp)
		```
		
		Java API.
		- #### latest
		
		
		
		```
		public [SnapshotSelectionCriteria](SnapshotSelectionCriteria.html "class in akka.persistence") latest()
		```
		
		Java API.
		- #### none
		
		
		
		```
		public [SnapshotSelectionCriteria](SnapshotSelectionCriteria.html "class in akka.persistence") none()
		```
		
		Java API.
		- #### apply
		
		
		
		```
		public [SnapshotSelectionCriteria](SnapshotSelectionCriteria.html "class in akka.persistence") apply​(long maxSequenceNr,
		                                       long maxTimestamp,
		                                       long minSequenceNr,
		                                       long minTimestamp)
		```
		- #### apply$default$1
		
		
		
		```
		public long apply$default$1()
		```
		- #### apply$default$2
		
		
		
		```
		public long apply$default$2()
		```
		- #### apply$default$3
		
		
		
		```
		public long apply$default$3()
		```
		- #### apply$default$4
		
		
		
		```
		public long apply$default$4()
		```
		- #### unapply
		
		
		
		```
		public scala.Option<scala.Tuple4<java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object>> unapply​([SnapshotSelectionCriteria](SnapshotSelectionCriteria.html "class in akka.persistence") x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/persistence/SnapshotSelectionCriteria$.html
- https://doc.akka.io/japi/akka/current/akka/persistence/SnapshotSelectionCriteria.html
- https://doc.akka.io/japi/akka/current/akka/persistence/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/SnapshotSelectionCriteria$.html](https://doc.akka.io/japi/akka/current/akka/persistence/SnapshotSelectionCriteria$.html)*