---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:47:20Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/stream/IOResult.html
title: IOResult
---

# IOResult

## Content

Package [akka.stream](package-summary.html)
## Class IOResult

- java.lang.Object
- - akka.stream.IOResult

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class IOResult
extends java.lang.Object
implements scala.Product, java.io.Serializable
```

Holds a result of an IO operation.
 
 param: count Numeric value depending on context, for example IO operations performed or bytes processed.
 param: status Status of the result. Can be either [`Done`](../Done.html "class in akka") or an exception.

See Also:
[Serialized Form](../../serialized-form.html#akka.stream.IOResult)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[IOResult](#%3Cinit%3E(long,scala.util.Try))​(long count,  scala.util.Try<[Done](../Done.html "class in akka")> status)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) [Deprecated Methods](javascript:show(32);) 
	| Modifier and Type | Method | Description |
	| `static [IOResult](IOResult.html "class in akka.stream")` | `[apply](#apply(long))​(long count)` |  |
	| `static [IOResult](IOResult.html "class in akka.stream")` | `[apply](#apply(long,scala.util.Try))​(long count,  scala.util.Try<[Done](../Done.html "class in akka")> status)` |  |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `[IOResult](IOResult.html "class in akka.stream")` | `[copy](#copy(long,scala.util.Try))​(long count,  scala.util.Try<[Done](../Done.html "class in akka")> status)` |  |
	| `long` | `[copy$default$1](#copy$default$1())()` |  |
	| `scala.util.Try<[Done](../Done.html "class in akka")>` | `[copy$default$2](#copy$default$2())()` |  |
	| `long` | `[count](#count())()` |  |
	| `static [IOResult](IOResult.html "class in akka.stream")` | `[createFailed](#createFailed(long,java.lang.Throwable))​(long count,  java.lang.Throwable ex)` | Deprecated. use IOOperationIncompleteException. |
	| `static [IOResult](IOResult.html "class in akka.stream")` | `[createSuccessful](#createSuccessful(long))​(long count)` | JAVA API: Creates successful IOResult |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `long` | `[getCount](#getCount())()` | Java API: Numeric value depending on context, for example IO operations performed or bytes processed. |
	| `java.lang.Throwable` | `[getError](#getError())()` | Deprecated. status is always set to Success(Done). |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `java.lang.String` | `[productElementName](#productElementName(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `scala.util.Try<[Done](../Done.html "class in akka")>` | `[status](#status())()` | Deprecated. status is always set to Success(Done). |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `static scala.Option<scala.Tuple2<java.lang.Object,​scala.util.Try<[Done](../Done.html "class in akka")>>>` | `[unapply](#unapply(akka.stream.IOResult))​([IOResult](IOResult.html "class in akka.stream") x$0)` |  |
	| `boolean` | `[wasSuccessful](#wasSuccessful())()` | Deprecated. status is always set to Success(Done). |
	| `[IOResult](IOResult.html "class in akka.stream")` | `[withCount](#withCount(long))​(long value)` |  |
	| `[IOResult](IOResult.html "class in akka.stream")` | `[withStatus](#withStatus(scala.util.Try))​(scala.util.Try<[Done](../Done.html "class in akka")> value)` | Deprecated. status is always set to Success(Done). |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementNames`

- - ### Constructor Detail
	
	
	
		- #### IOResult
		
		
		
		```
		public IOResult​(long count,
		                scala.util.Try<[Done](../Done.html "class in akka")> status)
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static [IOResult](IOResult.html "class in akka.stream") apply​(long count)
		```
		- #### createSuccessful
		
		
		
		```
		public static [IOResult](IOResult.html "class in akka.stream") createSuccessful​(long count)
		```
		
		JAVA API: Creates successful IOResult
		- #### createFailed
		
		
		
		```
		public static [IOResult](IOResult.html "class in akka.stream") createFailed​(long count,
		                                    java.lang.Throwable ex)
		```
		
		Deprecated.
		use IOOperationIncompleteException. Since 2\.6\.0\.
		- #### apply
		
		
		
		```
		public static [IOResult](IOResult.html "class in akka.stream") apply​(long count,
		                             scala.util.Try<[Done](../Done.html "class in akka")> status)
		```
		- #### unapply
		
		
		
		```
		public static scala.Option<scala.Tuple2<java.lang.Object,​scala.util.Try<[Done](../Done.html "class in akka")>>> unapply​([IOResult](IOResult.html "class in akka.stream") x$0)
		```
		- #### count
		
		
		
		```
		public long count()
		```
		- #### status
		
		
		
		```
		public scala.util.Try<[Done](../Done.html "class in akka")> status()
		```
		
		Deprecated.
		status is always set to Success(Done). Since 2\.6\.0\.
		- #### withCount
		
		
		
		```
		public [IOResult](IOResult.html "class in akka.stream") withCount​(long value)
		```
		- #### withStatus
		
		
		
		```
		public [IOResult](IOResult.html "class in akka.stream") withStatus​(scala.util.Try<[Done](../Done.html "class in akka")> value)
		```
		
		Deprecated.
		status is always set to Success(Done). Since 2\.6\.0\.
		- #### getCount
		
		
		
		```
		public long getCount()
		```
		
		Java API: Numeric value depending on context, for example IO operations performed or bytes processed.
		- #### wasSuccessful
		
		
		
		```
		public boolean wasSuccessful()
		```
		
		Deprecated.
		status is always set to Success(Done). Since 2\.6\.0\.
		
		Java API: Indicates whether IO operation completed successfully or not.
		- #### getError
		
		
		
		```
		public java.lang.Throwable getError()
		```
		
		Deprecated.
		status is always set to Success(Done). Since 2\.6\.0\.
		
		Java API: If the IO operation resulted in an error, returns the corresponding `Throwable`
		 or throws `UnsupportedOperationException` otherwise.
		- #### copy
		
		
		
		```
		public [IOResult](IOResult.html "class in akka.stream") copy​(long count,
		                     scala.util.Try<[Done](../Done.html "class in akka")> status)
		```
		- #### copy$default$1
		
		
		
		```
		public long copy$default$1()
		```
		- #### copy$default$2
		
		
		
		```
		public scala.util.Try<[Done](../Done.html "class in akka")> copy$default$2()
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

- https://doc.akka.io/japi/akka/current/akka/Done.html
- https://doc.akka.io/japi/akka/current/akka/stream/IOResult.html
- https://doc.akka.io/japi/akka/current/akka/stream/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/stream/IOResult.html](https://doc.akka.io/japi/akka/current/akka/stream/IOResult.html)*