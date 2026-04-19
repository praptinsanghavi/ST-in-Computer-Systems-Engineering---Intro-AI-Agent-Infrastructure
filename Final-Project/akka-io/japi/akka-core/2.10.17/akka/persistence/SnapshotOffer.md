---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:44:13Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/SnapshotOffer.html
title: SnapshotOffer
---

# SnapshotOffer

## Content

Package [akka.persistence](package-summary.html)
## Class SnapshotOffer

- java.lang.Object
- - akka.persistence.SnapshotOffer

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class SnapshotOffer
extends java.lang.Object
implements scala.Product, java.io.Serializable
```

Offers a [`PersistentActor`](PersistentActor.html "interface in akka.persistence") a previously saved `snapshot` during recovery. This offer is received
 before any further replayed messages.

See Also:
[Serialized Form](../../serialized-form.html#akka.persistence.SnapshotOffer)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[SnapshotOffer](#%3Cinit%3E(akka.persistence.SnapshotMetadata,java.lang.Object))​([SnapshotMetadata](SnapshotMetadata.html "class in akka.persistence") metadata,  java.lang.Object snapshot)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [SnapshotOffer](SnapshotOffer.html "class in akka.persistence")` | `[apply](#apply(akka.persistence.SnapshotMetadata,java.lang.Object))​([SnapshotMetadata](SnapshotMetadata.html "class in akka.persistence") metadata,  java.lang.Object snapshot)` |  |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `[SnapshotOffer](SnapshotOffer.html "class in akka.persistence")` | `[copy](#copy(akka.persistence.SnapshotMetadata,java.lang.Object))​([SnapshotMetadata](SnapshotMetadata.html "class in akka.persistence") metadata,  java.lang.Object snapshot)` |  |
	| `[SnapshotMetadata](SnapshotMetadata.html "class in akka.persistence")` | `[copy$default$1](#copy$default$1())()` |  |
	| `java.lang.Object` | `[copy$default$2](#copy$default$2())()` |  |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `[SnapshotMetadata](SnapshotMetadata.html "class in akka.persistence")` | `[metadata](#metadata())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `java.lang.String` | `[productElementName](#productElementName(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `java.lang.Object` | `[snapshot](#snapshot())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `static scala.Option<scala.Tuple2<[SnapshotMetadata](SnapshotMetadata.html "class in akka.persistence"),​java.lang.Object>>` | `[unapply](#unapply(akka.persistence.SnapshotOffer))​([SnapshotOffer](SnapshotOffer.html "class in akka.persistence") x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementNames`

- - ### Constructor Detail
	
	
	
		- #### SnapshotOffer
		
		
		
		```
		public SnapshotOffer​([SnapshotMetadata](SnapshotMetadata.html "class in akka.persistence") metadata,
		                     java.lang.Object snapshot)
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static [SnapshotOffer](SnapshotOffer.html "class in akka.persistence") apply​([SnapshotMetadata](SnapshotMetadata.html "class in akka.persistence") metadata,
		                                  java.lang.Object snapshot)
		```
		- #### unapply
		
		
		
		```
		public static scala.Option<scala.Tuple2<[SnapshotMetadata](SnapshotMetadata.html "class in akka.persistence"),​java.lang.Object>> unapply​([SnapshotOffer](SnapshotOffer.html "class in akka.persistence") x$0)
		```
		- #### metadata
		
		
		
		```
		public [SnapshotMetadata](SnapshotMetadata.html "class in akka.persistence") metadata()
		```
		- #### snapshot
		
		
		
		```
		public java.lang.Object snapshot()
		```
		- #### copy
		
		
		
		```
		public [SnapshotOffer](SnapshotOffer.html "class in akka.persistence") copy​([SnapshotMetadata](SnapshotMetadata.html "class in akka.persistence") metadata,
		                          java.lang.Object snapshot)
		```
		- #### copy$default$1
		
		
		
		```
		public [SnapshotMetadata](SnapshotMetadata.html "class in akka.persistence") copy$default$1()
		```
		- #### copy$default$2
		
		
		
		```
		public java.lang.Object copy$default$2()
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

- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/PersistentActor.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/SnapshotMetadata.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/SnapshotOffer.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/SnapshotOffer.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/SnapshotOffer.html)*