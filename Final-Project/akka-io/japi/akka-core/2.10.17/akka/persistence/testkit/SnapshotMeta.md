---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:47:44Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/testkit/SnapshotMeta.html
title: SnapshotMeta
---

# SnapshotMeta

## Content

Package [akka.persistence.testkit](package-summary.html)
## Class SnapshotMeta

- java.lang.Object
- - akka.persistence.testkit.SnapshotMeta

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class SnapshotMeta
extends java.lang.Object
implements scala.Product, java.io.Serializable
```

Snapshot metainformation.

See Also:
[Serialized Form](../../../serialized-form.html#akka.persistence.testkit.SnapshotMeta)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[SnapshotMeta](#%3Cinit%3E(long,long))​(long sequenceNr,  long timestamp)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static long` | `[$lessinit$greater$default$2](#$lessinit$greater$default$2())()` |  |
	| `static [SnapshotMeta](SnapshotMeta.html "class in akka.persistence.testkit")` | `[apply](#apply(long,long))​(long sequenceNr,  long timestamp)` |  |
	| `static long` | `[apply$default$2](#apply$default$2())()` |  |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `[SnapshotMeta](SnapshotMeta.html "class in akka.persistence.testkit")` | `[copy](#copy(long,long))​(long sequenceNr,  long timestamp)` |  |
	| `long` | `[copy$default$1](#copy$default$1())()` |  |
	| `long` | `[copy$default$2](#copy$default$2())()` |  |
	| `static [SnapshotMeta](SnapshotMeta.html "class in akka.persistence.testkit")` | `[create](#create(long))​(long sequenceNr)` |  |
	| `static [SnapshotMeta](SnapshotMeta.html "class in akka.persistence.testkit")` | `[create](#create(long,long))​(long sequenceNr,  long timestamp)` |  |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `long` | `[getSequenceNr](#getSequenceNr())()` |  |
	| `long` | `[getTimestamp](#getTimestamp())()` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `java.lang.String` | `[productElementName](#productElementName(int))​(int x$1)` |  |
	| `static scala.collection.Iterator<java.lang.String>` | `[productElementNames](#productElementNames())()` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `long` | `[sequenceNr](#sequenceNr())()` |  |
	| `long` | `[timestamp](#timestamp())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `static scala.Option<scala.Tuple2<java.lang.Object,​java.lang.Object>>` | `[unapply](#unapply(akka.persistence.testkit.SnapshotMeta))​([SnapshotMeta](SnapshotMeta.html "class in akka.persistence.testkit") x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementNames`

- - ### Constructor Detail
	
	
	
		- #### SnapshotMeta
		
		
		
		```
		public SnapshotMeta​(long sequenceNr,
		                    long timestamp)
		```

	- ### Method Detail
	
	
	
		- #### $lessinit$greater$default$2
		
		
		
		```
		public static long $lessinit$greater$default$2()
		```
		- #### create
		
		
		
		```
		public static [SnapshotMeta](SnapshotMeta.html "class in akka.persistence.testkit") create​(long sequenceNr,
		                                  long timestamp)
		```
		- #### create
		
		
		
		```
		public static [SnapshotMeta](SnapshotMeta.html "class in akka.persistence.testkit") create​(long sequenceNr)
		```
		- #### apply
		
		
		
		```
		public static [SnapshotMeta](SnapshotMeta.html "class in akka.persistence.testkit") apply​(long sequenceNr,
		                                 long timestamp)
		```
		- #### apply$default$2
		
		
		
		```
		public static long apply$default$2()
		```
		- #### unapply
		
		
		
		```
		public static scala.Option<scala.Tuple2<java.lang.Object,​java.lang.Object>> unapply​([SnapshotMeta](SnapshotMeta.html "class in akka.persistence.testkit") x$0)
		```
		- #### productElementNames
		
		
		
		```
		public static scala.collection.Iterator<java.lang.String> productElementNames()
		```
		- #### sequenceNr
		
		
		
		```
		public long sequenceNr()
		```
		- #### timestamp
		
		
		
		```
		public long timestamp()
		```
		- #### getSequenceNr
		
		
		
		```
		public long getSequenceNr()
		```
		- #### getTimestamp
		
		
		
		```
		public long getTimestamp()
		```
		- #### copy
		
		
		
		```
		public [SnapshotMeta](SnapshotMeta.html "class in akka.persistence.testkit") copy​(long sequenceNr,
		                         long timestamp)
		```
		- #### copy$default$1
		
		
		
		```
		public long copy$default$1()
		```
		- #### copy$default$2
		
		
		
		```
		public long copy$default$2()
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

- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/testkit/SnapshotMeta.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/testkit/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/testkit/SnapshotMeta.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/testkit/SnapshotMeta.html)*