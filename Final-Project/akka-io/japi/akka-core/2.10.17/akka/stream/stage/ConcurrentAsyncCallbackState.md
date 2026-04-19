---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:55:12Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/stage/ConcurrentAsyncCallbackState.Pending$.html
title: ConcurrentAsyncCallbackState.Pending$
---

# ConcurrentAsyncCallbackState.Pending$

## Content

Package [akka.stream.stage](package-summary.html)
## Class ConcurrentAsyncCallbackState.Pending$

- java.lang.Object
- - akka.stream.stage.ConcurrentAsyncCallbackState.Pending$

- All Implemented Interfaces:
`java.io.Serializable`

Enclosing class:
[ConcurrentAsyncCallbackState](ConcurrentAsyncCallbackState.html "class in akka.stream.stage")

---

```
public static class ConcurrentAsyncCallbackState.Pending$
extends java.lang.Object
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../serialized-form.html#akka.stream.stage.ConcurrentAsyncCallbackState.Pending$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ConcurrentAsyncCallbackState.Pending$](ConcurrentAsyncCallbackState.Pending$.html "class in akka.stream.stage")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Pending$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<E> [ConcurrentAsyncCallbackState.Pending](ConcurrentAsyncCallbackState.Pending.html "class in akka.stream.stage")<E>` | `[apply](#apply(scala.collection.immutable.List))​(scala.collection.immutable.List<[ConcurrentAsyncCallbackState.Event](ConcurrentAsyncCallbackState.Event.html "class in akka.stream.stage")<E>> pendingEvents)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `<E> scala.Option<scala.collection.immutable.List<[ConcurrentAsyncCallbackState.Event](ConcurrentAsyncCallbackState.Event.html "class in akka.stream.stage")<E>>>` | `[unapply](#unapply(akka.stream.stage.ConcurrentAsyncCallbackState.Pending))​([ConcurrentAsyncCallbackState.Pending](ConcurrentAsyncCallbackState.Pending.html "class in akka.stream.stage")<E> x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ConcurrentAsyncCallbackState.Pending$](ConcurrentAsyncCallbackState.Pending$.html "class in akka.stream.stage") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Pending$
		
		
		
		```
		public Pending$()
		```

	- ### Method Detail
	
	
	
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Overrides:
		`toString` in class `java.lang.Object`
		- #### apply
		
		
		
		```
		public <E> [ConcurrentAsyncCallbackState.Pending](ConcurrentAsyncCallbackState.Pending.html "class in akka.stream.stage")<E> apply​(scala.collection.immutable.List<[ConcurrentAsyncCallbackState.Event](ConcurrentAsyncCallbackState.Event.html "class in akka.stream.stage")<E>> pendingEvents)
		```
		- #### unapply
		
		
		
		```
		public <E> scala.Option<scala.collection.immutable.List<[ConcurrentAsyncCallbackState.Event](ConcurrentAsyncCallbackState.Event.html "class in akka.stream.stage")<E>>> unapply​([ConcurrentAsyncCallbackState.Pending](ConcurrentAsyncCallbackState.Pending.html "class in akka.stream.stage")<E> x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/stage/ConcurrentAsyncCallbackState.Event.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/stage/ConcurrentAsyncCallbackState.Pending$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/stage/ConcurrentAsyncCallbackState.Pending.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/stage/ConcurrentAsyncCallbackState.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/stage/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/stage/ConcurrentAsyncCallbackState.Pending$.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/stage/ConcurrentAsyncCallbackState.Pending$.html)*