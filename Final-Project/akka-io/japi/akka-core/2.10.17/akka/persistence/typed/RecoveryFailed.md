---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:02:23Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/RecoveryFailed.html
title: RecoveryFailed
---

# RecoveryFailed

## Content

Package [akka.persistence.typed](package-summary.html)
## Class RecoveryFailed

- java.lang.Object
- - akka.persistence.typed.RecoveryFailed

- All Implemented Interfaces:
`[Signal](../../actor/typed/Signal.html "interface in akka.actor.typed")`, `[EventSourcedSignal](EventSourcedSignal.html "interface in akka.persistence.typed")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class RecoveryFailed
extends java.lang.Object
implements [EventSourcedSignal](EventSourcedSignal.html "interface in akka.persistence.typed"), scala.Product, java.io.Serializable
```

See Also:
[Serialized Form](../../../serialized-form.html#akka.persistence.typed.RecoveryFailed)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[RecoveryFailed](#%3Cinit%3E(java.lang.Throwable))​(java.lang.Throwable failure)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [RecoveryFailed](RecoveryFailed.html "class in akka.persistence.typed")` | `[apply](#apply(java.lang.Throwable))​(java.lang.Throwable failure)` |  |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `[RecoveryFailed](RecoveryFailed.html "class in akka.persistence.typed")` | `[copy](#copy(java.lang.Throwable))​(java.lang.Throwable failure)` |  |
	| `java.lang.Throwable` | `[copy$default$1](#copy$default$1())()` |  |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `java.lang.Throwable` | `[failure](#failure())()` |  |
	| `java.lang.Throwable` | `[getFailure](#getFailure())()` | Java API |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `java.lang.String` | `[productElementName](#productElementName(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `static scala.Option<java.lang.Throwable>` | `[unapply](#unapply(akka.persistence.typed.RecoveryFailed))​([RecoveryFailed](RecoveryFailed.html "class in akka.persistence.typed") x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementNames`

- - ### Constructor Detail
	
	
	
		- #### RecoveryFailed
		
		
		
		```
		public RecoveryFailed​(java.lang.Throwable failure)
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static [RecoveryFailed](RecoveryFailed.html "class in akka.persistence.typed") apply​(java.lang.Throwable failure)
		```
		- #### unapply
		
		
		
		```
		public static scala.Option<java.lang.Throwable> unapply​([RecoveryFailed](RecoveryFailed.html "class in akka.persistence.typed") x$0)
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
		- #### copy
		
		
		
		```
		public [RecoveryFailed](RecoveryFailed.html "class in akka.persistence.typed") copy​(java.lang.Throwable failure)
		```
		- #### copy$default$1
		
		
		
		```
		public java.lang.Throwable copy$default$1()
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

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/Signal.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/EventSourcedSignal.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/RecoveryFailed.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/RecoveryFailed.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/RecoveryFailed.html)*