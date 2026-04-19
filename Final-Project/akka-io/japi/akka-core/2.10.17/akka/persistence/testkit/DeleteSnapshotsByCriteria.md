---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:47:45Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/testkit/DeleteSnapshotsByCriteria.html
title: DeleteSnapshotsByCriteria
---

# DeleteSnapshotsByCriteria

## Content

Package [akka.persistence.testkit](package-summary.html)
## Class DeleteSnapshotsByCriteria

- java.lang.Object
- - [akka.persistence.testkit.DeleteSnapshot](DeleteSnapshot.html "class in akka.persistence.testkit")
	- - akka.persistence.testkit.DeleteSnapshotsByCriteria

- All Implemented Interfaces:
`[SnapshotOperation](SnapshotOperation.html "interface in akka.persistence.testkit")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class DeleteSnapshotsByCriteria
extends [DeleteSnapshot](DeleteSnapshot.html "class in akka.persistence.testkit")
implements scala.Product, java.io.Serializable
```

Delete snapshots from storage by criteria.

See Also:
[Serialized Form](../../../serialized-form.html#akka.persistence.testkit.DeleteSnapshotsByCriteria)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[DeleteSnapshotsByCriteria](#%3Cinit%3E(akka.persistence.SnapshotSelectionCriteria))​([SnapshotSelectionCriteria](../SnapshotSelectionCriteria.html "class in akka.persistence") criteria)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [DeleteSnapshotsByCriteria](DeleteSnapshotsByCriteria.html "class in akka.persistence.testkit")` | `[apply](#apply(akka.persistence.SnapshotSelectionCriteria))​([SnapshotSelectionCriteria](../SnapshotSelectionCriteria.html "class in akka.persistence") criteria)` |  |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `[DeleteSnapshotsByCriteria](DeleteSnapshotsByCriteria.html "class in akka.persistence.testkit")` | `[copy](#copy(akka.persistence.SnapshotSelectionCriteria))​([SnapshotSelectionCriteria](../SnapshotSelectionCriteria.html "class in akka.persistence") criteria)` |  |
	| `[SnapshotSelectionCriteria](../SnapshotSelectionCriteria.html "class in akka.persistence")` | `[copy$default$1](#copy$default$1())()` |  |
	| `[SnapshotSelectionCriteria](../SnapshotSelectionCriteria.html "class in akka.persistence")` | `[criteria](#criteria())()` |  |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `[SnapshotSelectionCriteria](../SnapshotSelectionCriteria.html "class in akka.persistence")` | `[getCriteria](#getCriteria())()` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `java.lang.String` | `[productElementName](#productElementName(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `static scala.Option<[SnapshotSelectionCriteria](../SnapshotSelectionCriteria.html "class in akka.persistence")>` | `[unapply](#unapply(akka.persistence.testkit.DeleteSnapshotsByCriteria))​([DeleteSnapshotsByCriteria](DeleteSnapshotsByCriteria.html "class in akka.persistence.testkit") x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementNames`

- - ### Constructor Detail
	
	
	
		- #### DeleteSnapshotsByCriteria
		
		
		
		```
		public DeleteSnapshotsByCriteria​([SnapshotSelectionCriteria](../SnapshotSelectionCriteria.html "class in akka.persistence") criteria)
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static [DeleteSnapshotsByCriteria](DeleteSnapshotsByCriteria.html "class in akka.persistence.testkit") apply​([SnapshotSelectionCriteria](../SnapshotSelectionCriteria.html "class in akka.persistence") criteria)
		```
		- #### unapply
		
		
		
		```
		public static scala.Option<[SnapshotSelectionCriteria](../SnapshotSelectionCriteria.html "class in akka.persistence")> unapply​([DeleteSnapshotsByCriteria](DeleteSnapshotsByCriteria.html "class in akka.persistence.testkit") x$0)
		```
		- #### criteria
		
		
		
		```
		public [SnapshotSelectionCriteria](../SnapshotSelectionCriteria.html "class in akka.persistence") criteria()
		```
		- #### getCriteria
		
		
		
		```
		public [SnapshotSelectionCriteria](../SnapshotSelectionCriteria.html "class in akka.persistence") getCriteria()
		```
		- #### copy
		
		
		
		```
		public [DeleteSnapshotsByCriteria](DeleteSnapshotsByCriteria.html "class in akka.persistence.testkit") copy​([SnapshotSelectionCriteria](../SnapshotSelectionCriteria.html "class in akka.persistence") criteria)
		```
		- #### copy$default$1
		
		
		
		```
		public [SnapshotSelectionCriteria](../SnapshotSelectionCriteria.html "class in akka.persistence") copy$default$1()
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

- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/SnapshotSelectionCriteria.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/testkit/DeleteSnapshot.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/testkit/DeleteSnapshotsByCriteria.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/testkit/SnapshotOperation.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/testkit/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/testkit/DeleteSnapshotsByCriteria.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/testkit/DeleteSnapshotsByCriteria.html)*