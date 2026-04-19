---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:48:06Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/testkit/WriteSnapshot.html
title: WriteSnapshot
---

# WriteSnapshot

## Content

Package [akka.persistence.testkit](package-summary.html)
## Class WriteSnapshot

- java.lang.Object
- - akka.persistence.testkit.WriteSnapshot

- All Implemented Interfaces:
`[SnapshotOperation](SnapshotOperation.html "interface in akka.persistence.testkit")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class WriteSnapshot
extends java.lang.Object
implements [SnapshotOperation](SnapshotOperation.html "interface in akka.persistence.testkit"), scala.Product, java.io.Serializable
```

Storage write operation to persist snapshot in the storage.
 
 param: metadata snapshot metadata
 param: snapshot snapshot payload

See Also:
[Serialized Form](../../../serialized-form.html#akka.persistence.testkit.WriteSnapshot)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[WriteSnapshot](#%3Cinit%3E(akka.persistence.testkit.SnapshotMeta,java.lang.Object))​([SnapshotMeta](SnapshotMeta.html "class in akka.persistence.testkit") metadata,  java.lang.Object snapshot)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [WriteSnapshot](WriteSnapshot.html "class in akka.persistence.testkit")` | `[apply](#apply(akka.persistence.testkit.SnapshotMeta,java.lang.Object))​([SnapshotMeta](SnapshotMeta.html "class in akka.persistence.testkit") metadata,  java.lang.Object snapshot)` |  |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `[WriteSnapshot](WriteSnapshot.html "class in akka.persistence.testkit")` | `[copy](#copy(akka.persistence.testkit.SnapshotMeta,java.lang.Object))​([SnapshotMeta](SnapshotMeta.html "class in akka.persistence.testkit") metadata,  java.lang.Object snapshot)` |  |
	| `[SnapshotMeta](SnapshotMeta.html "class in akka.persistence.testkit")` | `[copy$default$1](#copy$default$1())()` |  |
	| `java.lang.Object` | `[copy$default$2](#copy$default$2())()` |  |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `[SnapshotMeta](SnapshotMeta.html "class in akka.persistence.testkit")` | `[getMetadata](#getMetadata())()` |  |
	| `java.lang.Object` | `[getSnapshot](#getSnapshot())()` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `[SnapshotMeta](SnapshotMeta.html "class in akka.persistence.testkit")` | `[metadata](#metadata())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `java.lang.String` | `[productElementName](#productElementName(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `java.lang.Object` | `[snapshot](#snapshot())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `static scala.Option<scala.Tuple2<[SnapshotMeta](SnapshotMeta.html "class in akka.persistence.testkit"),​java.lang.Object>>` | `[unapply](#unapply(akka.persistence.testkit.WriteSnapshot))​([WriteSnapshot](WriteSnapshot.html "class in akka.persistence.testkit") x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementNames`

- - ### Constructor Detail
	
	
	
		- #### WriteSnapshot
		
		
		
		```
		public WriteSnapshot​([SnapshotMeta](SnapshotMeta.html "class in akka.persistence.testkit") metadata,
		                     java.lang.Object snapshot)
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static [WriteSnapshot](WriteSnapshot.html "class in akka.persistence.testkit") apply​([SnapshotMeta](SnapshotMeta.html "class in akka.persistence.testkit") metadata,
		                                  java.lang.Object snapshot)
		```
		- #### unapply
		
		
		
		```
		public static scala.Option<scala.Tuple2<[SnapshotMeta](SnapshotMeta.html "class in akka.persistence.testkit"),​java.lang.Object>> unapply​([WriteSnapshot](WriteSnapshot.html "class in akka.persistence.testkit") x$0)
		```
		- #### metadata
		
		
		
		```
		public [SnapshotMeta](SnapshotMeta.html "class in akka.persistence.testkit") metadata()
		```
		- #### snapshot
		
		
		
		```
		public java.lang.Object snapshot()
		```
		- #### getMetadata
		
		
		
		```
		public [SnapshotMeta](SnapshotMeta.html "class in akka.persistence.testkit") getMetadata()
		```
		- #### getSnapshot
		
		
		
		```
		public java.lang.Object getSnapshot()
		```
		- #### copy
		
		
		
		```
		public [WriteSnapshot](WriteSnapshot.html "class in akka.persistence.testkit") copy​([SnapshotMeta](SnapshotMeta.html "class in akka.persistence.testkit") metadata,
		                          java.lang.Object snapshot)
		```
		- #### copy$default$1
		
		
		
		```
		public [SnapshotMeta](SnapshotMeta.html "class in akka.persistence.testkit") copy$default$1()
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

- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/testkit/SnapshotMeta.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/testkit/SnapshotOperation.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/testkit/WriteSnapshot.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/testkit/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/testkit/WriteSnapshot.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/testkit/WriteSnapshot.html)*