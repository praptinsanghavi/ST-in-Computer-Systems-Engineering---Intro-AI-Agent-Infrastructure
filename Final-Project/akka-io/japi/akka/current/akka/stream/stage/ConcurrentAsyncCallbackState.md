---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:46:33Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/stream/stage/ConcurrentAsyncCallbackState.Pending.html
title: ConcurrentAsyncCallbackState.Pending
---

# ConcurrentAsyncCallbackState.Pending

## Content

Package [akka.stream.stage](package-summary.html)
## Class ConcurrentAsyncCallbackState.Pending\<E\>

- java.lang.Object
- - akka.stream.stage.ConcurrentAsyncCallbackState.Pending\<E\>

- All Implemented Interfaces:
`[ConcurrentAsyncCallbackState.State](ConcurrentAsyncCallbackState.State.html "interface in akka.stream.stage")<E>`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

Enclosing class:
[ConcurrentAsyncCallbackState](ConcurrentAsyncCallbackState.html "class in akka.stream.stage")

---

```
public static final class ConcurrentAsyncCallbackState.Pending<E>
extends java.lang.Object
implements [ConcurrentAsyncCallbackState.State](ConcurrentAsyncCallbackState.State.html "interface in akka.stream.stage")<E>, scala.Product, java.io.Serializable
```

See Also:
[Serialized Form](../../../serialized-form.html#akka.stream.stage.ConcurrentAsyncCallbackState.Pending)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Pending](#%3Cinit%3E(scala.collection.immutable.List))​(scala.collection.immutable.List<[ConcurrentAsyncCallbackState.Event](ConcurrentAsyncCallbackState.Event.html "class in akka.stream.stage")<[E](ConcurrentAsyncCallbackState.Pending.html "type parameter in ConcurrentAsyncCallbackState.Pending")>> pendingEvents)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `<E> [ConcurrentAsyncCallbackState.Pending](ConcurrentAsyncCallbackState.Pending.html "class in akka.stream.stage")<E>` | `[copy](#copy(scala.collection.immutable.List))​(scala.collection.immutable.List<[ConcurrentAsyncCallbackState.Event](ConcurrentAsyncCallbackState.Event.html "class in akka.stream.stage")<E>> pendingEvents)` |  |
	| `<E> scala.collection.immutable.List<[ConcurrentAsyncCallbackState.Event](ConcurrentAsyncCallbackState.Event.html "class in akka.stream.stage")<E>>` | `[copy$default$1](#copy$default$1())()` |  |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `scala.collection.immutable.List<[ConcurrentAsyncCallbackState.Event](ConcurrentAsyncCallbackState.Event.html "class in akka.stream.stage")<[E](ConcurrentAsyncCallbackState.Pending.html "type parameter in ConcurrentAsyncCallbackState.Pending")>>` | `[pendingEvents](#pendingEvents())()` |  |
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
	
	
	
		- #### Pending
		
		
		
		```
		public Pending​(scala.collection.immutable.List<[ConcurrentAsyncCallbackState.Event](ConcurrentAsyncCallbackState.Event.html "class in akka.stream.stage")<[E](ConcurrentAsyncCallbackState.Pending.html "type parameter in ConcurrentAsyncCallbackState.Pending")>> pendingEvents)
		```

	- ### Method Detail
	
	
	
		- #### pendingEvents
		
		
		
		```
		public scala.collection.immutable.List<[ConcurrentAsyncCallbackState.Event](ConcurrentAsyncCallbackState.Event.html "class in akka.stream.stage")<[E](ConcurrentAsyncCallbackState.Pending.html "type parameter in ConcurrentAsyncCallbackState.Pending")>> pendingEvents()
		```
		- #### copy
		
		
		
		```
		public <E> [ConcurrentAsyncCallbackState.Pending](ConcurrentAsyncCallbackState.Pending.html "class in akka.stream.stage")<E> copy​(scala.collection.immutable.List<[ConcurrentAsyncCallbackState.Event](ConcurrentAsyncCallbackState.Event.html "class in akka.stream.stage")<E>> pendingEvents)
		```
		- #### copy$default$1
		
		
		
		```
		public <E> scala.collection.immutable.List<[ConcurrentAsyncCallbackState.Event](ConcurrentAsyncCallbackState.Event.html "class in akka.stream.stage")<E>> copy$default$1()
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

- https://doc.akka.io/japi/akka/current/akka/stream/stage/ConcurrentAsyncCallbackState.Event.html
- https://doc.akka.io/japi/akka/current/akka/stream/stage/ConcurrentAsyncCallbackState.Pending.html
- https://doc.akka.io/japi/akka/current/akka/stream/stage/ConcurrentAsyncCallbackState.State.html
- https://doc.akka.io/japi/akka/current/akka/stream/stage/ConcurrentAsyncCallbackState.html
- https://doc.akka.io/japi/akka/current/akka/stream/stage/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/stream/stage/ConcurrentAsyncCallbackState.Pending.html](https://doc.akka.io/japi/akka/current/akka/stream/stage/ConcurrentAsyncCallbackState.Pending.html)*