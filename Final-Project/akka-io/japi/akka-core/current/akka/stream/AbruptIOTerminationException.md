---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:04:02Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/current/akka/stream/AbruptIOTerminationException.html
title: AbruptIOTerminationException
---

# AbruptIOTerminationException

## Content

Package [akka.stream](package-summary.html)
## Class AbruptIOTerminationException

- java.lang.Object
- - java.lang.Throwable
	- - java.lang.Exception
		- - java.lang.RuntimeException
			- - akka.stream.AbruptIOTerminationException

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Equals`, `scala.Product`, `scala.util.control.NoStackTrace`

---

```
public final class AbruptIOTerminationException
extends java.lang.RuntimeException
implements scala.util.control.NoStackTrace, scala.Product, java.io.Serializable
```

Deprecated.
use IOOperationIncompleteException. Since 2\.6\.0\.

This exception signals that a stream has been completed by an onError signal
 while there was still IO operations in progress.

See Also:
[Serialized Form](../../serialized-form.html#akka.stream.AbruptIOTerminationException)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[AbruptIOTerminationException](#%3Cinit%3E(akka.stream.IOResult,java.lang.Throwable))​([IOResult](IOResult.html "class in akka.stream") ioResult,  java.lang.Throwable cause)` | Deprecated. |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) [Deprecated Methods](javascript:show(32);) 
	| Modifier and Type | Method | Description |
	| `static [AbruptIOTerminationException](AbruptIOTerminationException.html "class in akka.stream")` | `[apply](#apply(akka.stream.IOResult,java.lang.Throwable))​([IOResult](IOResult.html "class in akka.stream") ioResult,  java.lang.Throwable cause)` | Deprecated. |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` | Deprecated. |
	| `java.lang.Throwable` | `[cause](#cause())()` | Deprecated. |
	| `[AbruptIOTerminationException](AbruptIOTerminationException.html "class in akka.stream")` | `[copy](#copy(akka.stream.IOResult,java.lang.Throwable))​([IOResult](IOResult.html "class in akka.stream") ioResult,  java.lang.Throwable cause)` | Deprecated. |
	| `[IOResult](IOResult.html "class in akka.stream")` | `[copy$default$1](#copy$default$1())()` | Deprecated. |
	| `java.lang.Throwable` | `[copy$default$2](#copy$default$2())()` | Deprecated. |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` | Deprecated. |
	| `int` | `[hashCode](#hashCode())()` | Deprecated. |
	| `[IOResult](IOResult.html "class in akka.stream")` | `[ioResult](#ioResult())()` | Deprecated. |
	| `int` | `[productArity](#productArity())()` | Deprecated. |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` | Deprecated. |
	| `java.lang.String` | `[productElementName](#productElementName(int))​(int x$1)` | Deprecated. |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` | Deprecated. |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` | Deprecated. |
	| `static java.lang.String` | `[toString](#toString())()` | Deprecated. |
	| `static scala.Option<scala.Tuple2<[IOResult](IOResult.html "class in akka.stream"),​java.lang.Throwable>>` | `[unapply](#unapply(akka.stream.AbruptIOTerminationException))​([AbruptIOTerminationException](AbruptIOTerminationException.html "class in akka.stream") x$0)` | Deprecated. |
	
	
		- ### Methods inherited from class java.lang.Throwable
		
		
		`addSuppressed, fillInStackTrace, getCause, getLocalizedMessage, getMessage, getStackTrace, getSuppressed, initCause, printStackTrace, printStackTrace, printStackTrace, setStackTrace, toString`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.util.control.NoStackTrace
		
		
		`fillInStackTrace`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementNames`

- - ### Constructor Detail
	
	
	
		- #### AbruptIOTerminationException
		
		
		
		```
		public AbruptIOTerminationException​([IOResult](IOResult.html "class in akka.stream") ioResult,
		                                    java.lang.Throwable cause)
		```
		
		Deprecated.

	- ### Method Detail
	
	
	
		- #### toString
		
		
		
		```
		public static final java.lang.String toString()
		```
		
		Deprecated.
		- #### apply
		
		
		
		```
		public static [AbruptIOTerminationException](AbruptIOTerminationException.html "class in akka.stream") apply​([IOResult](IOResult.html "class in akka.stream") ioResult,
		                                                 java.lang.Throwable cause)
		```
		
		Deprecated.
		- #### unapply
		
		
		
		```
		public static scala.Option<scala.Tuple2<[IOResult](IOResult.html "class in akka.stream"),​java.lang.Throwable>> unapply​([AbruptIOTerminationException](AbruptIOTerminationException.html "class in akka.stream") x$0)
		```
		
		Deprecated.
		- #### ioResult
		
		
		
		```
		public [IOResult](IOResult.html "class in akka.stream") ioResult()
		```
		
		Deprecated.
		- #### cause
		
		
		
		```
		public java.lang.Throwable cause()
		```
		
		Deprecated.
		- #### copy
		
		
		
		```
		public [AbruptIOTerminationException](AbruptIOTerminationException.html "class in akka.stream") copy​([IOResult](IOResult.html "class in akka.stream") ioResult,
		                                         java.lang.Throwable cause)
		```
		
		Deprecated.
		- #### copy$default$1
		
		
		
		```
		public [IOResult](IOResult.html "class in akka.stream") copy$default$1()
		```
		
		Deprecated.
		- #### copy$default$2
		
		
		
		```
		public java.lang.Throwable copy$default$2()
		```
		
		Deprecated.
		- #### productPrefix
		
		
		
		```
		public java.lang.String productPrefix()
		```
		
		Deprecated.
		
		Specified by:
		`productPrefix` in interface `scala.Product`
		- #### productArity
		
		
		
		```
		public int productArity()
		```
		
		Deprecated.
		
		Specified by:
		`productArity` in interface `scala.Product`
		- #### productElement
		
		
		
		```
		public java.lang.Object productElement​(int x$1)
		```
		
		Deprecated.
		
		Specified by:
		`productElement` in interface `scala.Product`
		- #### productIterator
		
		
		
		```
		public scala.collection.Iterator<java.lang.Object> productIterator()
		```
		
		Deprecated.
		
		Specified by:
		`productIterator` in interface `scala.Product`
		- #### canEqual
		
		
		
		```
		public boolean canEqual​(java.lang.Object x$1)
		```
		
		Deprecated.
		
		Specified by:
		`canEqual` in interface `scala.Equals`
		- #### productElementName
		
		
		
		```
		public java.lang.String productElementName​(int x$1)
		```
		
		Deprecated.
		
		Specified by:
		`productElementName` in interface `scala.Product`
		- #### hashCode
		
		
		
		```
		public int hashCode()
		```
		
		Deprecated.
		
		Overrides:
		`hashCode` in class `java.lang.Object`
		- #### equals
		
		
		
		```
		public boolean equals​(java.lang.Object x$1)
		```
		
		Deprecated.
		
		Specified by:
		`equals` in interface `scala.Equals`
		Overrides:
		`equals` in class `java.lang.Object`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/current/akka/stream/AbruptIOTerminationException.html
- https://doc.akka.io/japi/akka-core/current/akka/stream/IOResult.html
- https://doc.akka.io/japi/akka-core/current/akka/stream/package-summary.html
- https://doc.akka.io/japi/akka-core/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/current/akka/stream/AbruptIOTerminationException.html](https://doc.akka.io/japi/akka-core/current/akka/stream/AbruptIOTerminationException.html)*