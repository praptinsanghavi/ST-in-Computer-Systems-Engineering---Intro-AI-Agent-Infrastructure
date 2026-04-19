---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:22:56Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/Recovery.html
title: Recovery
---

# Recovery

## Content

Package [akka.persistence](package-summary.html)
## Class Recovery

- java.lang.Object
- - akka.persistence.Recovery

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class Recovery
extends java.lang.Object
implements scala.Product, java.io.Serializable
```

Recovery mode configuration object to be returned in [`PersistenceRecovery.recovery()`](PersistenceRecovery.html#recovery()).
 
 By default recovers from latest snapshot replays through to the last available event (last sequenceId).
 

 Recovery will start from a snapshot if the persistent actor has previously saved one or more snapshots
 and at least one of these snapshots matches the specified `fromSnapshot` criteria.
 Otherwise, recovery will start from scratch by replaying all stored events.
 

 If recovery starts from a snapshot, the persistent actor is offered that snapshot with a [`SnapshotOffer`](SnapshotOffer.html "class in akka.persistence")
 message, followed by replayed messages, if any, that are younger than the snapshot, up to the
 specified upper sequence number bound (`toSequenceNr`).
 

 param: fromSnapshot criteria for selecting a saved snapshot from which recovery should start. Default
 is latest (\= youngest) snapshot.
 param: toSequenceNr upper sequence number bound (inclusive) for recovery. Default is no upper bound.
 param: replayMax maximum number of messages to replay. Default is no limit.

See Also:
[Serialized Form](../../serialized-form.html#akka.persistence.Recovery)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Recovery](#%3Cinit%3E(akka.persistence.SnapshotSelectionCriteria,long,long))​([SnapshotSelectionCriteria](SnapshotSelectionCriteria.html "class in akka.persistence") fromSnapshot,  long toSequenceNr,  long replayMax)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [SnapshotSelectionCriteria](SnapshotSelectionCriteria.html "class in akka.persistence")` | `[$lessinit$greater$default$1](#$lessinit$greater$default$1())()` |  |
	| `static long` | `[$lessinit$greater$default$2](#$lessinit$greater$default$2())()` |  |
	| `static long` | `[$lessinit$greater$default$3](#$lessinit$greater$default$3())()` |  |
	| `static [Recovery](Recovery.html "class in akka.persistence")` | `[apply](#apply(akka.persistence.SnapshotSelectionCriteria,long,long))​([SnapshotSelectionCriteria](SnapshotSelectionCriteria.html "class in akka.persistence") fromSnapshot,  long toSequenceNr,  long replayMax)` |  |
	| `static [SnapshotSelectionCriteria](SnapshotSelectionCriteria.html "class in akka.persistence")` | `[apply$default$1](#apply$default$1())()` |  |
	| `static long` | `[apply$default$2](#apply$default$2())()` |  |
	| `static long` | `[apply$default$3](#apply$default$3())()` |  |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `[Recovery](Recovery.html "class in akka.persistence")` | `[copy](#copy(akka.persistence.SnapshotSelectionCriteria,long,long))​([SnapshotSelectionCriteria](SnapshotSelectionCriteria.html "class in akka.persistence") fromSnapshot,  long toSequenceNr,  long replayMax)` |  |
	| `[SnapshotSelectionCriteria](SnapshotSelectionCriteria.html "class in akka.persistence")` | `[copy$default$1](#copy$default$1())()` |  |
	| `long` | `[copy$default$2](#copy$default$2())()` |  |
	| `long` | `[copy$default$3](#copy$default$3())()` |  |
	| `static [Recovery](Recovery.html "class in akka.persistence")` | `[create](#create())()` | Java API |
	| `static [Recovery](Recovery.html "class in akka.persistence")` | `[create](#create(long))​(long toSequenceNr)` | Java API |
	| `static [Recovery](Recovery.html "class in akka.persistence")` | `[create](#create(akka.persistence.SnapshotSelectionCriteria))​([SnapshotSelectionCriteria](SnapshotSelectionCriteria.html "class in akka.persistence") fromSnapshot)` | Java API |
	| `static [Recovery](Recovery.html "class in akka.persistence")` | `[create](#create(akka.persistence.SnapshotSelectionCriteria,long))​([SnapshotSelectionCriteria](SnapshotSelectionCriteria.html "class in akka.persistence") fromSnapshot,  long toSequenceNr)` | Java API |
	| `static [Recovery](Recovery.html "class in akka.persistence")` | `[create](#create(akka.persistence.SnapshotSelectionCriteria,long,long))​([SnapshotSelectionCriteria](SnapshotSelectionCriteria.html "class in akka.persistence") fromSnapshot,  long toSequenceNr,  long replayMax)` | Java API |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `[SnapshotSelectionCriteria](SnapshotSelectionCriteria.html "class in akka.persistence")` | `[fromSnapshot](#fromSnapshot())()` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `static [Recovery](Recovery.html "class in akka.persistence")` | `[none](#none())()` | Convenience method for skipping recovery in [`PersistentActor`](PersistentActor.html "interface in akka.persistence"). |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `java.lang.String` | `[productElementName](#productElementName(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `long` | `[replayMax](#replayMax())()` |  |
	| `long` | `[toSequenceNr](#toSequenceNr())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `static scala.Option<scala.Tuple3<[SnapshotSelectionCriteria](SnapshotSelectionCriteria.html "class in akka.persistence"),​java.lang.Object,​java.lang.Object>>` | `[unapply](#unapply(akka.persistence.Recovery))​([Recovery](Recovery.html "class in akka.persistence") x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementNames`

- - ### Constructor Detail
	
	
	
		- #### Recovery
		
		
		
		```
		public Recovery​([SnapshotSelectionCriteria](SnapshotSelectionCriteria.html "class in akka.persistence") fromSnapshot,
		                long toSequenceNr,
		                long replayMax)
		```

	- ### Method Detail
	
	
	
		- #### $lessinit$greater$default$1
		
		
		
		```
		public static [SnapshotSelectionCriteria](SnapshotSelectionCriteria.html "class in akka.persistence") $lessinit$greater$default$1()
		```
		- #### $lessinit$greater$default$2
		
		
		
		```
		public static long $lessinit$greater$default$2()
		```
		- #### $lessinit$greater$default$3
		
		
		
		```
		public static long $lessinit$greater$default$3()
		```
		- #### none
		
		
		
		```
		public static [Recovery](Recovery.html "class in akka.persistence") none()
		```
		
		Convenience method for skipping recovery in [`PersistentActor`](PersistentActor.html "interface in akka.persistence").
		 
		 It will still retrieve previously highest sequence number so that new events are persisted with
		 higher sequence numbers rather than starting from 1 and assuming that there are no
		 previous event with that sequence number.
		 
		
		
		
		See Also:
		[`Recovery`](Recovery.html "class in akka.persistence")
		- #### create
		
		
		
		```
		public static [Recovery](Recovery.html "class in akka.persistence") create()
		```
		
		Java API
		
		See Also:
		[`Recovery`](Recovery.html "class in akka.persistence")
		- #### create
		
		
		
		```
		public static [Recovery](Recovery.html "class in akka.persistence") create​(long toSequenceNr)
		```
		
		Java API
		
		See Also:
		[`Recovery`](Recovery.html "class in akka.persistence")
		- #### create
		
		
		
		```
		public static [Recovery](Recovery.html "class in akka.persistence") create​([SnapshotSelectionCriteria](SnapshotSelectionCriteria.html "class in akka.persistence") fromSnapshot)
		```
		
		Java API
		
		See Also:
		[`Recovery`](Recovery.html "class in akka.persistence")
		- #### create
		
		
		
		```
		public static [Recovery](Recovery.html "class in akka.persistence") create​([SnapshotSelectionCriteria](SnapshotSelectionCriteria.html "class in akka.persistence") fromSnapshot,
		                              long toSequenceNr)
		```
		
		Java API
		
		See Also:
		[`Recovery`](Recovery.html "class in akka.persistence")
		- #### create
		
		
		
		```
		public static [Recovery](Recovery.html "class in akka.persistence") create​([SnapshotSelectionCriteria](SnapshotSelectionCriteria.html "class in akka.persistence") fromSnapshot,
		                              long toSequenceNr,
		                              long replayMax)
		```
		
		Java API
		
		See Also:
		[`Recovery`](Recovery.html "class in akka.persistence")
		- #### apply
		
		
		
		```
		public static [Recovery](Recovery.html "class in akka.persistence") apply​([SnapshotSelectionCriteria](SnapshotSelectionCriteria.html "class in akka.persistence") fromSnapshot,
		                             long toSequenceNr,
		                             long replayMax)
		```
		- #### apply$default$1
		
		
		
		```
		public static [SnapshotSelectionCriteria](SnapshotSelectionCriteria.html "class in akka.persistence") apply$default$1()
		```
		- #### apply$default$2
		
		
		
		```
		public static long apply$default$2()
		```
		- #### apply$default$3
		
		
		
		```
		public static long apply$default$3()
		```
		- #### unapply
		
		
		
		```
		public static scala.Option<scala.Tuple3<[SnapshotSelectionCriteria](SnapshotSelectionCriteria.html "class in akka.persistence"),​java.lang.Object,​java.lang.Object>> unapply​([Recovery](Recovery.html "class in akka.persistence") x$0)
		```
		- #### fromSnapshot
		
		
		
		```
		public [SnapshotSelectionCriteria](SnapshotSelectionCriteria.html "class in akka.persistence") fromSnapshot()
		```
		- #### toSequenceNr
		
		
		
		```
		public long toSequenceNr()
		```
		- #### replayMax
		
		
		
		```
		public long replayMax()
		```
		- #### copy
		
		
		
		```
		public [Recovery](Recovery.html "class in akka.persistence") copy​([SnapshotSelectionCriteria](SnapshotSelectionCriteria.html "class in akka.persistence") fromSnapshot,
		                     long toSequenceNr,
		                     long replayMax)
		```
		- #### copy$default$1
		
		
		
		```
		public [SnapshotSelectionCriteria](SnapshotSelectionCriteria.html "class in akka.persistence") copy$default$1()
		```
		- #### copy$default$2
		
		
		
		```
		public long copy$default$2()
		```
		- #### copy$default$3
		
		
		
		```
		public long copy$default$3()
		```
		- #### productPrefix
		
		
		
		```
		public java.lang.String productPrefix()
		```
		
		
		Specified by:
		`productPrefix` in interface `scala.Product`
		- #### productArity
		
		
		
		```
		public int productArity()
		```
		
		
		Specified by:
		`productArity` in interface `scala.Product`
		- #### productElement
		
		
		
		```
		public java.lang.Object productElement​(int x$1)
		```
		
		
		Specified by:
		`productElement` in interface `scala.Product`
		- #### productIterator
		
		
		
		```
		public scala.collection.Iterator<java.lang.Object> productIterator()
		```
		
		
		Specified by:
		`productIterator` in interface `scala.Product`
		- #### canEqual
		
		
		
		```
		public boolean canEqual​(java.lang.Object x$1)
		```
		
		
		Specified by:
		`canEqual` in interface `scala.Equals`
		- #### productElementName
		
		
		
		```
		public java.lang.String productElementName​(int x$1)
		```
		
		
		Specified by:
		`productElementName` in interface `scala.Product`
		- #### hashCode
		
		
		
		```
		public int hashCode()
		```
		
		
		Overrides:
		`hashCode` in class `java.lang.Object`
		- #### toString
		
		
		
		```
		public java.lang.String toString()
		```
		
		
		Overrides:
		`toString` in class `java.lang.Object`
		- #### equals
		
		
		
		```
		public boolean equals​(java.lang.Object x$1)
		```
		
		
		Specified by:
		`equals` in interface `scala.Equals`
		Overrides:
		`equals` in class `java.lang.Object`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/persistence/PersistenceRecovery.html
- https://doc.akka.io/japi/akka/current/akka/persistence/PersistentActor.html
- https://doc.akka.io/japi/akka/current/akka/persistence/Recovery.html
- https://doc.akka.io/japi/akka/current/akka/persistence/SnapshotOffer.html
- https://doc.akka.io/japi/akka/current/akka/persistence/SnapshotSelectionCriteria.html
- https://doc.akka.io/japi/akka/current/akka/persistence/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/Recovery.html](https://doc.akka.io/japi/akka/current/akka/persistence/Recovery.html)*