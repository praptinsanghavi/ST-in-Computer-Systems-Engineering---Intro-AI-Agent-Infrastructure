---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:18:47Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/stream/StreamRefSubscriptionTimeoutException.html
title: StreamRefSubscriptionTimeoutException
---

# StreamRefSubscriptionTimeoutException

## Content

Package [akka.stream](package-summary.html)
## Class StreamRefSubscriptionTimeoutException

- java.lang.Object
- - java.lang.Throwable
	- - java.lang.Exception
		- - java.lang.RuntimeException
			- - java.lang.IllegalStateException
				- - akka.stream.StreamRefSubscriptionTimeoutException

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class StreamRefSubscriptionTimeoutException
extends java.lang.IllegalStateException
implements scala.Product, java.io.Serializable
```

See Also:
[Serialized Form](../../serialized-form.html#akka.stream.StreamRefSubscriptionTimeoutException)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[StreamRefSubscriptionTimeoutException](#%3Cinit%3E(java.lang.String))​(java.lang.String msg)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [StreamRefSubscriptionTimeoutException](StreamRefSubscriptionTimeoutException.html "class in akka.stream")` | `[apply](#apply(java.lang.String))​(java.lang.String msg)` |  |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `[StreamRefSubscriptionTimeoutException](StreamRefSubscriptionTimeoutException.html "class in akka.stream")` | `[copy](#copy(java.lang.String))​(java.lang.String msg)` |  |
	| `java.lang.String` | `[copy$default$1](#copy$default$1())()` |  |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `java.lang.String` | `[msg](#msg())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `java.lang.String` | `[productElementName](#productElementName(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `static java.lang.String` | `[toString](#toString())()` |  |
	| `static scala.Option<java.lang.String>` | `[unapply](#unapply(akka.stream.StreamRefSubscriptionTimeoutException))​([StreamRefSubscriptionTimeoutException](StreamRefSubscriptionTimeoutException.html "class in akka.stream") x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Throwable
		
		
		`addSuppressed, fillInStackTrace, getCause, getLocalizedMessage, getMessage, getStackTrace, getSuppressed, initCause, printStackTrace, printStackTrace, printStackTrace, setStackTrace, toString`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementNames`

- - ### Constructor Detail
	
	
	
		- #### StreamRefSubscriptionTimeoutException
		
		
		
		```
		public StreamRefSubscriptionTimeoutException​(java.lang.String msg)
		```

	- ### Method Detail
	
	
	
		- #### toString
		
		
		
		```
		public static final java.lang.String toString()
		```
		- #### apply
		
		
		
		```
		public static [StreamRefSubscriptionTimeoutException](StreamRefSubscriptionTimeoutException.html "class in akka.stream") apply​(java.lang.String msg)
		```
		- #### unapply
		
		
		
		```
		public static scala.Option<java.lang.String> unapply​([StreamRefSubscriptionTimeoutException](StreamRefSubscriptionTimeoutException.html "class in akka.stream") x$0)
		```
		- #### msg
		
		
		
		```
		public java.lang.String msg()
		```
		- #### copy
		
		
		
		```
		public [StreamRefSubscriptionTimeoutException](StreamRefSubscriptionTimeoutException.html "class in akka.stream") copy​(java.lang.String msg)
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

- https://doc.akka.io/japi/akka-core/2.10/akka/stream/StreamRefSubscriptionTimeoutException.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/stream/StreamRefSubscriptionTimeoutException.html](https://doc.akka.io/japi/akka-core/2.10/akka/stream/StreamRefSubscriptionTimeoutException.html)*