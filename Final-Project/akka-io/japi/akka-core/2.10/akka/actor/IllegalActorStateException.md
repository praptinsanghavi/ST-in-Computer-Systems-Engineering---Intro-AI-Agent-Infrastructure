---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:57:36Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/actor/IllegalActorStateException.html
title: IllegalActorStateException
---

# IllegalActorStateException

## Content

Package [akka.actor](package-summary.html)
## Class IllegalActorStateException

- java.lang.Object
- - java.lang.Throwable
	- - java.lang.Exception
		- - java.lang.RuntimeException
			- - [akka.AkkaException](../AkkaException.html "class in akka")
				- - akka.actor.IllegalActorStateException

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class IllegalActorStateException
extends [AkkaException](../AkkaException.html "class in akka")
implements scala.Product, java.io.Serializable
```

IllegalActorStateException is thrown when a core invariant in the Actor implementation has been violated.
 For instance, if you try to create an Actor that doesn't extend Actor.
 
 Not for user instatiation

See Also:
[Serialized Form](../../serialized-form.html#akka.actor.IllegalActorStateException)

- - ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [IllegalActorStateException](IllegalActorStateException.html "class in akka.actor")` | `[apply](#apply(java.lang.String))​(java.lang.String message)` |  |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `[IllegalActorStateException](IllegalActorStateException.html "class in akka.actor")` | `[copy](#copy(java.lang.String))​(java.lang.String message)` |  |
	| `java.lang.String` | `[copy$default$1](#copy$default$1())()` |  |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `java.lang.String` | `[message](#message())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `java.lang.String` | `[productElementName](#productElementName(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `static java.lang.String` | `[toString](#toString())()` |  |
	| `static scala.Option<java.lang.String>` | `[unapply](#unapply(akka.actor.IllegalActorStateException))​([IllegalActorStateException](IllegalActorStateException.html "class in akka.actor") x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Throwable
		
		
		`addSuppressed, fillInStackTrace, getCause, getLocalizedMessage, getMessage, getStackTrace, getSuppressed, initCause, printStackTrace, printStackTrace, printStackTrace, setStackTrace, toString`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementNames`

- - ### Method Detail
	
	
	
		- #### toString
		
		
		
		```
		public static final java.lang.String toString()
		```
		- #### apply
		
		
		
		```
		public static [IllegalActorStateException](IllegalActorStateException.html "class in akka.actor") apply​(java.lang.String message)
		```
		- #### unapply
		
		
		
		```
		public static scala.Option<java.lang.String> unapply​([IllegalActorStateException](IllegalActorStateException.html "class in akka.actor") x$0)
		```
		- #### message
		
		
		
		```
		public java.lang.String message()
		```
		- #### copy
		
		
		
		```
		public [IllegalActorStateException](IllegalActorStateException.html "class in akka.actor") copy​(java.lang.String message)
		```
		- #### copy$default$1
		
		
		
		```
		public java.lang.String copy$default$1()
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
		- #### equals
		
		
		
		```
		public boolean equals​(java.lang.Object x$1)
		```
		
		
		Specified by:
		`equals` in interface `scala.Equals`
		Overrides:
		`equals` in class `java.lang.Object`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/AkkaException.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/IllegalActorStateException.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/actor/IllegalActorStateException.html](https://doc.akka.io/japi/akka-core/2.10/akka/actor/IllegalActorStateException.html)*