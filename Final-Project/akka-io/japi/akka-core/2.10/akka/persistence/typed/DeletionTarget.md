---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:13:11Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/DeletionTarget.Individual.html
title: DeletionTarget.Individual
---

# DeletionTarget.Individual

## Content

Package [akka.persistence.typed](package-summary.html)
## Class DeletionTarget.Individual

- java.lang.Object
- - akka.persistence.typed.DeletionTarget.Individual

- All Implemented Interfaces:
`[DeletionTarget](DeletionTarget.html "interface in akka.persistence.typed")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

Enclosing interface:
[DeletionTarget](DeletionTarget.html "interface in akka.persistence.typed")

---

```
public static final class DeletionTarget.Individual
extends java.lang.Object
implements [DeletionTarget](DeletionTarget.html "interface in akka.persistence.typed"), scala.Product, java.io.Serializable
```

See Also:
[Serialized Form](../../../serialized-form.html#akka.persistence.typed.DeletionTarget.Individual)

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface akka.persistence.typed.[DeletionTarget](DeletionTarget.html "interface in akka.persistence.typed")
		
		
		`[DeletionTarget.Criteria](DeletionTarget.Criteria.html "class in akka.persistence.typed"), [DeletionTarget.Criteria$](DeletionTarget.Criteria$.html "class in akka.persistence.typed"), [DeletionTarget.Individual](DeletionTarget.Individual.html "class in akka.persistence.typed"), [DeletionTarget.Individual$](DeletionTarget.Individual$.html "class in akka.persistence.typed")`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Individual](#%3Cinit%3E(akka.persistence.typed.SnapshotMetadata))​([SnapshotMetadata](SnapshotMetadata.html "class in akka.persistence.typed") metadata)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `[DeletionTarget.Individual](DeletionTarget.Individual.html "class in akka.persistence.typed")` | `[copy](#copy(akka.persistence.typed.SnapshotMetadata))​([SnapshotMetadata](SnapshotMetadata.html "class in akka.persistence.typed") metadata)` |  |
	| `[SnapshotMetadata](SnapshotMetadata.html "class in akka.persistence.typed")` | `[copy$default$1](#copy$default$1())()` |  |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `[SnapshotMetadata](SnapshotMetadata.html "class in akka.persistence.typed")` | `[getSnapshotMetadata](#getSnapshotMetadata())()` | Java API |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `[SnapshotMetadata](SnapshotMetadata.html "class in akka.persistence.typed")` | `[metadata](#metadata())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `java.lang.String` | `[productElementName](#productElementName(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementNames`

- - ### Constructor Detail
	
	
	
		- #### Individual
		
		
		
		```
		public Individual​([SnapshotMetadata](SnapshotMetadata.html "class in akka.persistence.typed") metadata)
		```

	- ### Method Detail
	
	
	
		- #### metadata
		
		
		
		```
		public [SnapshotMetadata](SnapshotMetadata.html "class in akka.persistence.typed") metadata()
		```
		- #### getSnapshotMetadata
		
		
		
		```
		public [SnapshotMetadata](SnapshotMetadata.html "class in akka.persistence.typed") getSnapshotMetadata()
		```
		
		Java API
		- #### copy
		
		
		
		```
		public [DeletionTarget.Individual](DeletionTarget.Individual.html "class in akka.persistence.typed") copy​([SnapshotMetadata](SnapshotMetadata.html "class in akka.persistence.typed") metadata)
		```
		- #### copy$default$1
		
		
		
		```
		public [SnapshotMetadata](SnapshotMetadata.html "class in akka.persistence.typed") copy$default$1()
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

- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/DeletionTarget.Criteria$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/DeletionTarget.Criteria.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/DeletionTarget.Individual$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/DeletionTarget.Individual.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/DeletionTarget.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/SnapshotMetadata.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/DeletionTarget.Individual.html](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/DeletionTarget.Individual.html)*