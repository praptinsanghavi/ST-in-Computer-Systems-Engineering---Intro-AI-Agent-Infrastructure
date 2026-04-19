---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:43:57Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/typed/SnapshotFailed.html
title: SnapshotFailed
---

# SnapshotFailed

## Content

Package [akka.persistence.typed](package-summary.html)
## Class SnapshotFailed

- java.lang.Object
- - akka.persistence.typed.SnapshotFailed

- All Implemented Interfaces:
`[Signal](../../actor/typed/Signal.html "interface in akka.actor.typed")`, `[EventSourcedSignal](EventSourcedSignal.html "interface in akka.persistence.typed")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class SnapshotFailed
extends java.lang.Object
implements [EventSourcedSignal](EventSourcedSignal.html "interface in akka.persistence.typed"), scala.Product, java.io.Serializable
```

See Also:
[Serialized Form](../../../serialized-form.html#akka.persistence.typed.SnapshotFailed)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[SnapshotFailed](#%3Cinit%3E(akka.persistence.typed.SnapshotMetadata,java.lang.Throwable))​([SnapshotMetadata](SnapshotMetadata.html "class in akka.persistence.typed") metadata,  java.lang.Throwable failure)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [SnapshotFailed](SnapshotFailed.html "class in akka.persistence.typed")` | `[apply](#apply(akka.persistence.typed.SnapshotMetadata,java.lang.Throwable))​([SnapshotMetadata](SnapshotMetadata.html "class in akka.persistence.typed") metadata,  java.lang.Throwable failure)` |  |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `[SnapshotFailed](SnapshotFailed.html "class in akka.persistence.typed")` | `[copy](#copy(akka.persistence.typed.SnapshotMetadata,java.lang.Throwable))​([SnapshotMetadata](SnapshotMetadata.html "class in akka.persistence.typed") metadata,  java.lang.Throwable failure)` |  |
	| `[SnapshotMetadata](SnapshotMetadata.html "class in akka.persistence.typed")` | `[copy$default$1](#copy$default$1())()` |  |
	| `java.lang.Throwable` | `[copy$default$2](#copy$default$2())()` |  |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `java.lang.Throwable` | `[failure](#failure())()` |  |
	| `java.lang.Throwable` | `[getFailure](#getFailure())()` | Java API |
	| `[SnapshotMetadata](SnapshotMetadata.html "class in akka.persistence.typed")` | `[getSnapshotMetadata](#getSnapshotMetadata())()` | Java API |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `[SnapshotMetadata](SnapshotMetadata.html "class in akka.persistence.typed")` | `[metadata](#metadata())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `java.lang.String` | `[productElementName](#productElementName(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `static scala.Option<scala.Tuple2<[SnapshotMetadata](SnapshotMetadata.html "class in akka.persistence.typed"),​java.lang.Throwable>>` | `[unapply](#unapply(akka.persistence.typed.SnapshotFailed))​([SnapshotFailed](SnapshotFailed.html "class in akka.persistence.typed") x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementNames`

- - ### Constructor Detail
	
	
	
		- #### SnapshotFailed
		
		
		
		```
		public SnapshotFailed​([SnapshotMetadata](SnapshotMetadata.html "class in akka.persistence.typed") metadata,
		                      java.lang.Throwable failure)
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static [SnapshotFailed](SnapshotFailed.html "class in akka.persistence.typed") apply​([SnapshotMetadata](SnapshotMetadata.html "class in akka.persistence.typed") metadata,
		                                   java.lang.Throwable failure)
		```
		- #### unapply
		
		
		
		```
		public static scala.Option<scala.Tuple2<[SnapshotMetadata](SnapshotMetadata.html "class in akka.persistence.typed"),​java.lang.Throwable>> unapply​([SnapshotFailed](SnapshotFailed.html "class in akka.persistence.typed") x$0)
		```
		- #### metadata
		
		
		
		```
		public [SnapshotMetadata](SnapshotMetadata.html "class in akka.persistence.typed") metadata()
		```
		- #### failure
		
		
		
		```
		public java.lang.Throwable failure()
		```
		- #### getFailure
		
		
		
		```
		public java.lang.Throwable getFailure()
		```
		
		Java API
		- #### getSnapshotMetadata
		
		
		
		```
		public [SnapshotMetadata](SnapshotMetadata.html "class in akka.persistence.typed") getSnapshotMetadata()
		```
		
		Java API
		- #### copy
		
		
		
		```
		public [SnapshotFailed](SnapshotFailed.html "class in akka.persistence.typed") copy​([SnapshotMetadata](SnapshotMetadata.html "class in akka.persistence.typed") metadata,
		                           java.lang.Throwable failure)
		```
		- #### copy$default$1
		
		
		
		```
		public [SnapshotMetadata](SnapshotMetadata.html "class in akka.persistence.typed") copy$default$1()
		```
		- #### copy$default$2
		
		
		
		```
		public java.lang.Throwable copy$default$2()
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

- https://doc.akka.io/japi/akka/current/akka/actor/typed/Signal.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/EventSourcedSignal.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/SnapshotFailed.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/SnapshotMetadata.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/typed/SnapshotFailed.html](https://doc.akka.io/japi/akka/current/akka/persistence/typed/SnapshotFailed.html)*