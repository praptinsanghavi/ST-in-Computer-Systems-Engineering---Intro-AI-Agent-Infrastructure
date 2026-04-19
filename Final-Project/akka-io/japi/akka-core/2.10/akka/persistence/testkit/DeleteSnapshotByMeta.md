---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:34:14Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/DeleteSnapshotByMeta.html
title: DeleteSnapshotByMeta
---

# DeleteSnapshotByMeta

## Content

Package [akka.persistence.testkit](package-summary.html)
## Class DeleteSnapshotByMeta

- java.lang.Object
- - [akka.persistence.testkit.DeleteSnapshot](DeleteSnapshot.html "class in akka.persistence.testkit")
	- - akka.persistence.testkit.DeleteSnapshotByMeta

- All Implemented Interfaces:
`[SnapshotOperation](SnapshotOperation.html "interface in akka.persistence.testkit")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class DeleteSnapshotByMeta
extends [DeleteSnapshot](DeleteSnapshot.html "class in akka.persistence.testkit")
implements scala.Product, java.io.Serializable
```

Delete particular snapshot from storage by its metadata.

See Also:
[Serialized Form](../../../serialized-form.html#akka.persistence.testkit.DeleteSnapshotByMeta)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[DeleteSnapshotByMeta](#%3Cinit%3E(akka.persistence.testkit.SnapshotMeta))​([SnapshotMeta](SnapshotMeta.html "class in akka.persistence.testkit") metadata)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [DeleteSnapshotByMeta](DeleteSnapshotByMeta.html "class in akka.persistence.testkit")` | `[apply](#apply(akka.persistence.testkit.SnapshotMeta))​([SnapshotMeta](SnapshotMeta.html "class in akka.persistence.testkit") metadata)` |  |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `[DeleteSnapshotByMeta](DeleteSnapshotByMeta.html "class in akka.persistence.testkit")` | `[copy](#copy(akka.persistence.testkit.SnapshotMeta))​([SnapshotMeta](SnapshotMeta.html "class in akka.persistence.testkit") metadata)` |  |
	| `[SnapshotMeta](SnapshotMeta.html "class in akka.persistence.testkit")` | `[copy$default$1](#copy$default$1())()` |  |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `[SnapshotMeta](SnapshotMeta.html "class in akka.persistence.testkit")` | `[getMetadata](#getMetadata())()` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `[SnapshotMeta](SnapshotMeta.html "class in akka.persistence.testkit")` | `[metadata](#metadata())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `java.lang.String` | `[productElementName](#productElementName(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `static scala.Option<[SnapshotMeta](SnapshotMeta.html "class in akka.persistence.testkit")>` | `[unapply](#unapply(akka.persistence.testkit.DeleteSnapshotByMeta))​([DeleteSnapshotByMeta](DeleteSnapshotByMeta.html "class in akka.persistence.testkit") x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementNames`

- - ### Constructor Detail
	
	
	
		- #### DeleteSnapshotByMeta
		
		
		
		```
		public DeleteSnapshotByMeta​([SnapshotMeta](SnapshotMeta.html "class in akka.persistence.testkit") metadata)
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static [DeleteSnapshotByMeta](DeleteSnapshotByMeta.html "class in akka.persistence.testkit") apply​([SnapshotMeta](SnapshotMeta.html "class in akka.persistence.testkit") metadata)
		```
		- #### unapply
		
		
		
		```
		public static scala.Option<[SnapshotMeta](SnapshotMeta.html "class in akka.persistence.testkit")> unapply​([DeleteSnapshotByMeta](DeleteSnapshotByMeta.html "class in akka.persistence.testkit") x$0)
		```
		- #### metadata
		
		
		
		```
		public [SnapshotMeta](SnapshotMeta.html "class in akka.persistence.testkit") metadata()
		```
		- #### getMetadata
		
		
		
		```
		public [SnapshotMeta](SnapshotMeta.html "class in akka.persistence.testkit") getMetadata()
		```
		- #### copy
		
		
		
		```
		public [DeleteSnapshotByMeta](DeleteSnapshotByMeta.html "class in akka.persistence.testkit") copy​([SnapshotMeta](SnapshotMeta.html "class in akka.persistence.testkit") metadata)
		```
		- #### copy$default$1
		
		
		
		```
		public [SnapshotMeta](SnapshotMeta.html "class in akka.persistence.testkit") copy$default$1()
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

- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/DeleteSnapshot.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/DeleteSnapshotByMeta.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/SnapshotMeta.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/SnapshotOperation.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/DeleteSnapshotByMeta.html](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/DeleteSnapshotByMeta.html)*