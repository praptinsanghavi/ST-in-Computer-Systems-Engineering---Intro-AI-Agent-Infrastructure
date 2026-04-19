---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:28:50Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/2.8/akka/persistence/SnapshotSelectionCriteria.html
title: SnapshotSelectionCriteria
---

# SnapshotSelectionCriteria

## Content

Package [akka.persistence](package-summary.html)
## Class SnapshotSelectionCriteria

- java.lang.Object
- - akka.persistence.SnapshotSelectionCriteria

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class SnapshotSelectionCriteria
extends java.lang.Object
implements scala.Product, java.io.Serializable
```

Selection criteria for loading and deleting snapshots.
 
 param: maxSequenceNr upper bound for a selected snapshot's sequence number. Default is no upper bound,
 i.e. `Long.MaxValue`
 param: maxTimestamp upper bound for a selected snapshot's timestamp. Default is no upper bound,
 i.e. `Long.MaxValue`
 param: minSequenceNr lower bound for a selected snapshot's sequence number. Default is no lower bound,
 i.e. `0L`
 param: minTimestamp lower bound for a selected snapshot's timestamp. Default is no lower bound,
 i.e. `0L`

See Also:
[`Recovery`](Recovery.html "class in akka.persistence"), 
[Serialized Form](../../serialized-form.html#akka.persistence.SnapshotSelectionCriteria)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[SnapshotSelectionCriteria](#%3Cinit%3E(long,long,long,long))​(long maxSequenceNr,  long maxTimestamp,  long minSequenceNr,  long minTimestamp)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static long` | `[$lessinit$greater$default$1](#$lessinit$greater$default$1())()` |  |
	| `static long` | `[$lessinit$greater$default$2](#$lessinit$greater$default$2())()` |  |
	| `static long` | `[$lessinit$greater$default$3](#$lessinit$greater$default$3())()` |  |
	| `static long` | `[$lessinit$greater$default$4](#$lessinit$greater$default$4())()` |  |
	| `static [SnapshotSelectionCriteria](SnapshotSelectionCriteria.html "class in akka.persistence")` | `[apply](#apply(long,long,long,long))​(long maxSequenceNr,  long maxTimestamp,  long minSequenceNr,  long minTimestamp)` |  |
	| `static long` | `[apply$default$1](#apply$default$1())()` |  |
	| `static long` | `[apply$default$2](#apply$default$2())()` |  |
	| `static long` | `[apply$default$3](#apply$default$3())()` |  |
	| `static long` | `[apply$default$4](#apply$default$4())()` |  |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `[SnapshotSelectionCriteria](SnapshotSelectionCriteria.html "class in akka.persistence")` | `[copy](#copy(long,long,long,long))​(long maxSequenceNr,  long maxTimestamp,  long minSequenceNr,  long minTimestamp)` |  |
	| `long` | `[copy$default$1](#copy$default$1())()` |  |
	| `long` | `[copy$default$2](#copy$default$2())()` |  |
	| `long` | `[copy$default$3](#copy$default$3())()` |  |
	| `long` | `[copy$default$4](#copy$default$4())()` |  |
	| `static [SnapshotSelectionCriteria](SnapshotSelectionCriteria.html "class in akka.persistence")` | `[create](#create(long,long))​(long maxSequenceNr,  long maxTimestamp)` | Java API. |
	| `static [SnapshotSelectionCriteria](SnapshotSelectionCriteria.html "class in akka.persistence")` | `[create](#create(long,long,long,long))​(long maxSequenceNr,  long maxTimestamp,  long minSequenceNr,  long minTimestamp)` | Java API. |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `static [SnapshotSelectionCriteria](SnapshotSelectionCriteria.html "class in akka.persistence")` | `[latest](#latest())()` | Java API. |
	| `static [SnapshotSelectionCriteria](SnapshotSelectionCriteria.html "class in akka.persistence")` | `[Latest](#Latest())()` | The latest saved snapshot. |
	| `long` | `[maxSequenceNr](#maxSequenceNr())()` |  |
	| `long` | `[maxTimestamp](#maxTimestamp())()` |  |
	| `long` | `[minSequenceNr](#minSequenceNr())()` |  |
	| `long` | `[minTimestamp](#minTimestamp())()` |  |
	| `static [SnapshotSelectionCriteria](SnapshotSelectionCriteria.html "class in akka.persistence")` | `[none](#none())()` | Java API. |
	| `static [SnapshotSelectionCriteria](SnapshotSelectionCriteria.html "class in akka.persistence")` | `[None](#None())()` | No saved snapshot matches. |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `java.lang.String` | `[productElementName](#productElementName(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `static scala.Option<scala.Tuple4<java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object>>` | `[unapply](#unapply(akka.persistence.SnapshotSelectionCriteria))​([SnapshotSelectionCriteria](SnapshotSelectionCriteria.html "class in akka.persistence") x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementNames`

- - ### Constructor Detail
	
	
	
		- #### SnapshotSelectionCriteria
		
		
		
		```
		public SnapshotSelectionCriteria​(long maxSequenceNr,
		                                 long maxTimestamp,
		                                 long minSequenceNr,
		                                 long minTimestamp)
		```

	- ### Method Detail
	
	
	
		- #### $lessinit$greater$default$1
		
		
		
		```
		public static long $lessinit$greater$default$1()
		```
		- #### $lessinit$greater$default$2
		
		
		
		```
		public static long $lessinit$greater$default$2()
		```
		- #### $lessinit$greater$default$3
		
		
		
		```
		public static long $lessinit$greater$default$3()
		```
		- #### $lessinit$greater$default$4
		
		
		
		```
		public static long $lessinit$greater$default$4()
		```
		- #### Latest
		
		
		
		```
		public static [SnapshotSelectionCriteria](SnapshotSelectionCriteria.html "class in akka.persistence") Latest()
		```
		
		The latest saved snapshot.
		- #### None
		
		
		
		```
		public static [SnapshotSelectionCriteria](SnapshotSelectionCriteria.html "class in akka.persistence") None()
		```
		
		No saved snapshot matches.
		- #### create
		
		
		
		```
		public static [SnapshotSelectionCriteria](SnapshotSelectionCriteria.html "class in akka.persistence") create​(long maxSequenceNr,
		                                               long maxTimestamp)
		```
		
		Java API.
		- #### create
		
		
		
		```
		public static [SnapshotSelectionCriteria](SnapshotSelectionCriteria.html "class in akka.persistence") create​(long maxSequenceNr,
		                                               long maxTimestamp,
		                                               long minSequenceNr,
		                                               long minTimestamp)
		```
		
		Java API.
		- #### latest
		
		
		
		```
		public static [SnapshotSelectionCriteria](SnapshotSelectionCriteria.html "class in akka.persistence") latest()
		```
		
		Java API.
		- #### none
		
		
		
		```
		public static [SnapshotSelectionCriteria](SnapshotSelectionCriteria.html "class in akka.persistence") none()
		```
		
		Java API.
		- #### apply
		
		
		
		```
		public static [SnapshotSelectionCriteria](SnapshotSelectionCriteria.html "class in akka.persistence") apply​(long maxSequenceNr,
		                                              long maxTimestamp,
		                                              long minSequenceNr,
		                                              long minTimestamp)
		```
		- #### apply$default$1
		
		
		
		```
		public static long apply$default$1()
		```
		- #### apply$default$2
		
		
		
		```
		public static long apply$default$2()
		```
		- #### apply$default$3
		
		
		
		```
		public static long apply$default$3()
		```
		- #### apply$default$4
		
		
		
		```
		public static long apply$default$4()
		```
		- #### unapply
		
		
		
		```
		public static scala.Option<scala.Tuple4<java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object>> unapply​([SnapshotSelectionCriteria](SnapshotSelectionCriteria.html "class in akka.persistence") x$0)
		```
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
		- #### copy
		
		
		
		```
		public [SnapshotSelectionCriteria](SnapshotSelectionCriteria.html "class in akka.persistence") copy​(long maxSequenceNr,
		                                      long maxTimestamp,
		                                      long minSequenceNr,
		                                      long minTimestamp)
		```
		- #### copy$default$1
		
		
		
		```
		public long copy$default$1()
		```
		- #### copy$default$2
		
		
		
		```
		public long copy$default$2()
		```
		- #### copy$default$3
		
		
		
		```
		public long copy$default$3()
		```
		- #### copy$default$4
		
		
		
		```
		public long copy$default$4()
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

- https://doc.akka.io/japi/akka/2.8/akka/persistence/Recovery.html
- https://doc.akka.io/japi/akka/2.8/akka/persistence/SnapshotSelectionCriteria.html
- https://doc.akka.io/japi/akka/2.8/akka/persistence/package-summary.html
- https://doc.akka.io/japi/akka/2.8/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/2.8/akka/persistence/SnapshotSelectionCriteria.html](https://doc.akka.io/japi/akka/2.8/akka/persistence/SnapshotSelectionCriteria.html)*