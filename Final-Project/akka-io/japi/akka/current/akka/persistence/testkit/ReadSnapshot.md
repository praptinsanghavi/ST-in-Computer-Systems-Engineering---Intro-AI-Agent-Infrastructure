---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:27:02Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/testkit/ReadSnapshot.html
title: ReadSnapshot
---

# ReadSnapshot

## Content

Package [akka.persistence.testkit](package-summary.html)
## Class ReadSnapshot

- java.lang.Object
- - akka.persistence.testkit.ReadSnapshot

- All Implemented Interfaces:
`[SnapshotOperation](SnapshotOperation.html "interface in akka.persistence.testkit")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class ReadSnapshot
extends java.lang.Object
implements [SnapshotOperation](SnapshotOperation.html "interface in akka.persistence.testkit"), scala.Product, java.io.Serializable
```

Storage read operation for recovery of the persistent actor.
 
 param: criteria criteria with which snapshot is searched
 param: snapshot snapshot found by criteria

See Also:
[Serialized Form](../../../serialized-form.html#akka.persistence.testkit.ReadSnapshot)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ReadSnapshot](#%3Cinit%3E(akka.persistence.SnapshotSelectionCriteria,scala.Option))​([SnapshotSelectionCriteria](../SnapshotSelectionCriteria.html "class in akka.persistence") criteria,  scala.Option<java.lang.Object> snapshot)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [ReadSnapshot](ReadSnapshot.html "class in akka.persistence.testkit")` | `[apply](#apply(akka.persistence.SnapshotSelectionCriteria,scala.Option))​([SnapshotSelectionCriteria](../SnapshotSelectionCriteria.html "class in akka.persistence") criteria,  scala.Option<java.lang.Object> snapshot)` |  |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `[ReadSnapshot](ReadSnapshot.html "class in akka.persistence.testkit")` | `[copy](#copy(akka.persistence.SnapshotSelectionCriteria,scala.Option))​([SnapshotSelectionCriteria](../SnapshotSelectionCriteria.html "class in akka.persistence") criteria,  scala.Option<java.lang.Object> snapshot)` |  |
	| `[SnapshotSelectionCriteria](../SnapshotSelectionCriteria.html "class in akka.persistence")` | `[copy$default$1](#copy$default$1())()` |  |
	| `scala.Option<java.lang.Object>` | `[copy$default$2](#copy$default$2())()` |  |
	| `[SnapshotSelectionCriteria](../SnapshotSelectionCriteria.html "class in akka.persistence")` | `[criteria](#criteria())()` |  |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `java.util.Optional<java.lang.Object>` | `[getSnapshot](#getSnapshot())()` |  |
	| `[SnapshotSelectionCriteria](../SnapshotSelectionCriteria.html "class in akka.persistence")` | `[getSnapshotSelectionCriteria](#getSnapshotSelectionCriteria())()` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `java.lang.String` | `[productElementName](#productElementName(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `scala.Option<java.lang.Object>` | `[snapshot](#snapshot())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `static scala.Option<scala.Tuple2<[SnapshotSelectionCriteria](../SnapshotSelectionCriteria.html "class in akka.persistence"),​scala.Option<java.lang.Object>>>` | `[unapply](#unapply(akka.persistence.testkit.ReadSnapshot))​([ReadSnapshot](ReadSnapshot.html "class in akka.persistence.testkit") x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementNames`

- - ### Constructor Detail
	
	
	
		- #### ReadSnapshot
		
		
		
		```
		public ReadSnapshot​([SnapshotSelectionCriteria](../SnapshotSelectionCriteria.html "class in akka.persistence") criteria,
		                    scala.Option<java.lang.Object> snapshot)
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static [ReadSnapshot](ReadSnapshot.html "class in akka.persistence.testkit") apply​([SnapshotSelectionCriteria](../SnapshotSelectionCriteria.html "class in akka.persistence") criteria,
		                                 scala.Option<java.lang.Object> snapshot)
		```
		- #### unapply
		
		
		
		```
		public static scala.Option<scala.Tuple2<[SnapshotSelectionCriteria](../SnapshotSelectionCriteria.html "class in akka.persistence"),​scala.Option<java.lang.Object>>> unapply​([ReadSnapshot](ReadSnapshot.html "class in akka.persistence.testkit") x$0)
		```
		- #### criteria
		
		
		
		```
		public [SnapshotSelectionCriteria](../SnapshotSelectionCriteria.html "class in akka.persistence") criteria()
		```
		- #### snapshot
		
		
		
		```
		public scala.Option<java.lang.Object> snapshot()
		```
		- #### getSnapshotSelectionCriteria
		
		
		
		```
		public [SnapshotSelectionCriteria](../SnapshotSelectionCriteria.html "class in akka.persistence") getSnapshotSelectionCriteria()
		```
		- #### getSnapshot
		
		
		
		```
		public java.util.Optional<java.lang.Object> getSnapshot()
		```
		- #### copy
		
		
		
		```
		public [ReadSnapshot](ReadSnapshot.html "class in akka.persistence.testkit") copy​([SnapshotSelectionCriteria](../SnapshotSelectionCriteria.html "class in akka.persistence") criteria,
		                         scala.Option<java.lang.Object> snapshot)
		```
		- #### copy$default$1
		
		
		
		```
		public [SnapshotSelectionCriteria](../SnapshotSelectionCriteria.html "class in akka.persistence") copy$default$1()
		```
		- #### copy$default$2
		
		
		
		```
		public scala.Option<java.lang.Object> copy$default$2()
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

- https://doc.akka.io/japi/akka/current/akka/persistence/SnapshotSelectionCriteria.html
- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/ReadSnapshot.html
- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/SnapshotOperation.html
- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/testkit/ReadSnapshot.html](https://doc.akka.io/japi/akka/current/akka/persistence/testkit/ReadSnapshot.html)*