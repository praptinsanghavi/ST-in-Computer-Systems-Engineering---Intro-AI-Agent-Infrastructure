---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:35:52Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/DeleteSnapshotsCompleted.html
title: DeleteSnapshotsCompleted
---

# DeleteSnapshotsCompleted

## Content

Package [akka.persistence.typed](package-summary.html)
## Class DeleteSnapshotsCompleted

- java.lang.Object
- - akka.persistence.typed.DeleteSnapshotsCompleted

- All Implemented Interfaces:
`[Signal](../../actor/typed/Signal.html "interface in akka.actor.typed")`, `[EventSourcedSignal](EventSourcedSignal.html "interface in akka.persistence.typed")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class DeleteSnapshotsCompleted
extends java.lang.Object
implements [EventSourcedSignal](EventSourcedSignal.html "interface in akka.persistence.typed"), scala.Product, java.io.Serializable
```

See Also:
[Serialized Form](../../../serialized-form.html#akka.persistence.typed.DeleteSnapshotsCompleted)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[DeleteSnapshotsCompleted](#%3Cinit%3E(akka.persistence.typed.DeletionTarget))​([DeletionTarget](DeletionTarget.html "interface in akka.persistence.typed") target)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [DeleteSnapshotsCompleted](DeleteSnapshotsCompleted.html "class in akka.persistence.typed")` | `[apply](#apply(akka.persistence.typed.DeletionTarget))​([DeletionTarget](DeletionTarget.html "interface in akka.persistence.typed") target)` |  |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `[DeleteSnapshotsCompleted](DeleteSnapshotsCompleted.html "class in akka.persistence.typed")` | `[copy](#copy(akka.persistence.typed.DeletionTarget))​([DeletionTarget](DeletionTarget.html "interface in akka.persistence.typed") target)` |  |
	| `[DeletionTarget](DeletionTarget.html "interface in akka.persistence.typed")` | `[copy$default$1](#copy$default$1())()` |  |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `[DeletionTarget](DeletionTarget.html "interface in akka.persistence.typed")` | `[getTarget](#getTarget())()` | Java API |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `java.lang.String` | `[productElementName](#productElementName(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `[DeletionTarget](DeletionTarget.html "interface in akka.persistence.typed")` | `[target](#target())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `static scala.Option<[DeletionTarget](DeletionTarget.html "interface in akka.persistence.typed")>` | `[unapply](#unapply(akka.persistence.typed.DeleteSnapshotsCompleted))​([DeleteSnapshotsCompleted](DeleteSnapshotsCompleted.html "class in akka.persistence.typed") x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementNames`

- - ### Constructor Detail
	
	
	
		- #### DeleteSnapshotsCompleted
		
		
		
		```
		public DeleteSnapshotsCompleted​([DeletionTarget](DeletionTarget.html "interface in akka.persistence.typed") target)
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static [DeleteSnapshotsCompleted](DeleteSnapshotsCompleted.html "class in akka.persistence.typed") apply​([DeletionTarget](DeletionTarget.html "interface in akka.persistence.typed") target)
		```
		- #### unapply
		
		
		
		```
		public static scala.Option<[DeletionTarget](DeletionTarget.html "interface in akka.persistence.typed")> unapply​([DeleteSnapshotsCompleted](DeleteSnapshotsCompleted.html "class in akka.persistence.typed") x$0)
		```
		- #### target
		
		
		
		```
		public [DeletionTarget](DeletionTarget.html "interface in akka.persistence.typed") target()
		```
		- #### getTarget
		
		
		
		```
		public [DeletionTarget](DeletionTarget.html "interface in akka.persistence.typed") getTarget()
		```
		
		Java API
		- #### copy
		
		
		
		```
		public [DeleteSnapshotsCompleted](DeleteSnapshotsCompleted.html "class in akka.persistence.typed") copy​([DeletionTarget](DeletionTarget.html "interface in akka.persistence.typed") target)
		```
		- #### copy$default$1
		
		
		
		```
		public [DeletionTarget](DeletionTarget.html "interface in akka.persistence.typed") copy$default$1()
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

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/Signal.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/DeleteSnapshotsCompleted.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/DeletionTarget.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/EventSourcedSignal.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/DeleteSnapshotsCompleted.html](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/DeleteSnapshotsCompleted.html)*