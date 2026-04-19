---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:22:56Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/Recovery$.html
title: Recovery$
---

# Recovery$

## Content

Package [akka.persistence](package-summary.html)
## Class Recovery$

- java.lang.Object
- - akka.persistence.Recovery$

- All Implemented Interfaces:
`java.io.Serializable`

---

```
public class Recovery$
extends java.lang.Object
implements java.io.Serializable
```

See Also:
[Serialized Form](../../serialized-form.html#akka.persistence.Recovery$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Recovery$](Recovery$.html "class in akka.persistence")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Recovery$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[SnapshotSelectionCriteria](SnapshotSelectionCriteria.html "class in akka.persistence")` | `[$lessinit$greater$default$1](#$lessinit$greater$default$1())()` |  |
	| `long` | `[$lessinit$greater$default$2](#$lessinit$greater$default$2())()` |  |
	| `long` | `[$lessinit$greater$default$3](#$lessinit$greater$default$3())()` |  |
	| `[Recovery](Recovery.html "class in akka.persistence")` | `[apply](#apply(akka.persistence.SnapshotSelectionCriteria,long,long))​([SnapshotSelectionCriteria](SnapshotSelectionCriteria.html "class in akka.persistence") fromSnapshot,  long toSequenceNr,  long replayMax)` |  |
	| `[SnapshotSelectionCriteria](SnapshotSelectionCriteria.html "class in akka.persistence")` | `[apply$default$1](#apply$default$1())()` |  |
	| `long` | `[apply$default$2](#apply$default$2())()` |  |
	| `long` | `[apply$default$3](#apply$default$3())()` |  |
	| `[Recovery](Recovery.html "class in akka.persistence")` | `[create](#create())()` | Java API |
	| `[Recovery](Recovery.html "class in akka.persistence")` | `[create](#create(long))​(long toSequenceNr)` | Java API |
	| `[Recovery](Recovery.html "class in akka.persistence")` | `[create](#create(akka.persistence.SnapshotSelectionCriteria))​([SnapshotSelectionCriteria](SnapshotSelectionCriteria.html "class in akka.persistence") fromSnapshot)` | Java API |
	| `[Recovery](Recovery.html "class in akka.persistence")` | `[create](#create(akka.persistence.SnapshotSelectionCriteria,long))​([SnapshotSelectionCriteria](SnapshotSelectionCriteria.html "class in akka.persistence") fromSnapshot,  long toSequenceNr)` | Java API |
	| `[Recovery](Recovery.html "class in akka.persistence")` | `[create](#create(akka.persistence.SnapshotSelectionCriteria,long,long))​([SnapshotSelectionCriteria](SnapshotSelectionCriteria.html "class in akka.persistence") fromSnapshot,  long toSequenceNr,  long replayMax)` | Java API |
	| `[Recovery](Recovery.html "class in akka.persistence")` | `[none](#none())()` | Convenience method for skipping recovery in [`PersistentActor`](PersistentActor.html "interface in akka.persistence"). |
	| `scala.Option<scala.Tuple3<[SnapshotSelectionCriteria](SnapshotSelectionCriteria.html "class in akka.persistence"),​java.lang.Object,​java.lang.Object>>` | `[unapply](#unapply(akka.persistence.Recovery))​([Recovery](Recovery.html "class in akka.persistence") x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [Recovery$](Recovery$.html "class in akka.persistence") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Recovery$
		
		
		
		```
		public Recovery$()
		```

	- ### Method Detail
	
	
	
		- #### $lessinit$greater$default$1
		
		
		
		```
		public [SnapshotSelectionCriteria](SnapshotSelectionCriteria.html "class in akka.persistence") $lessinit$greater$default$1()
		```
		- #### $lessinit$greater$default$2
		
		
		
		```
		public long $lessinit$greater$default$2()
		```
		- #### $lessinit$greater$default$3
		
		
		
		```
		public long $lessinit$greater$default$3()
		```
		- #### none
		
		
		
		```
		public [Recovery](Recovery.html "class in akka.persistence") none()
		```
		
		Convenience method for skipping recovery in [`PersistentActor`](PersistentActor.html "interface in akka.persistence").
		 
		 It will still retrieve previously highest sequence number so that new events are persisted with
		 higher sequence numbers rather than starting from 1 and assuming that there are no
		 previous event with that sequence number.
		 
		
		
		
		See Also:
		[`Recovery`](Recovery.html "class in akka.persistence")
		- #### create
		
		
		
		```
		public [Recovery](Recovery.html "class in akka.persistence") create()
		```
		
		Java API
		
		See Also:
		[`Recovery`](Recovery.html "class in akka.persistence")
		- #### create
		
		
		
		```
		public [Recovery](Recovery.html "class in akka.persistence") create​(long toSequenceNr)
		```
		
		Java API
		
		See Also:
		[`Recovery`](Recovery.html "class in akka.persistence")
		- #### create
		
		
		
		```
		public [Recovery](Recovery.html "class in akka.persistence") create​([SnapshotSelectionCriteria](SnapshotSelectionCriteria.html "class in akka.persistence") fromSnapshot)
		```
		
		Java API
		
		See Also:
		[`Recovery`](Recovery.html "class in akka.persistence")
		- #### create
		
		
		
		```
		public [Recovery](Recovery.html "class in akka.persistence") create​([SnapshotSelectionCriteria](SnapshotSelectionCriteria.html "class in akka.persistence") fromSnapshot,
		                       long toSequenceNr)
		```
		
		Java API
		
		See Also:
		[`Recovery`](Recovery.html "class in akka.persistence")
		- #### create
		
		
		
		```
		public [Recovery](Recovery.html "class in akka.persistence") create​([SnapshotSelectionCriteria](SnapshotSelectionCriteria.html "class in akka.persistence") fromSnapshot,
		                       long toSequenceNr,
		                       long replayMax)
		```
		
		Java API
		
		See Also:
		[`Recovery`](Recovery.html "class in akka.persistence")
		- #### apply
		
		
		
		```
		public [Recovery](Recovery.html "class in akka.persistence") apply​([SnapshotSelectionCriteria](SnapshotSelectionCriteria.html "class in akka.persistence") fromSnapshot,
		                      long toSequenceNr,
		                      long replayMax)
		```
		- #### apply$default$1
		
		
		
		```
		public [SnapshotSelectionCriteria](SnapshotSelectionCriteria.html "class in akka.persistence") apply$default$1()
		```
		- #### apply$default$2
		
		
		
		```
		public long apply$default$2()
		```
		- #### apply$default$3
		
		
		
		```
		public long apply$default$3()
		```
		- #### unapply
		
		
		
		```
		public scala.Option<scala.Tuple3<[SnapshotSelectionCriteria](SnapshotSelectionCriteria.html "class in akka.persistence"),​java.lang.Object,​java.lang.Object>> unapply​([Recovery](Recovery.html "class in akka.persistence") x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/persistence/PersistentActor.html
- https://doc.akka.io/japi/akka/current/akka/persistence/Recovery$.html
- https://doc.akka.io/japi/akka/current/akka/persistence/Recovery.html
- https://doc.akka.io/japi/akka/current/akka/persistence/SnapshotSelectionCriteria.html
- https://doc.akka.io/japi/akka/current/akka/persistence/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/Recovery$.html](https://doc.akka.io/japi/akka/current/akka/persistence/Recovery$.html)*