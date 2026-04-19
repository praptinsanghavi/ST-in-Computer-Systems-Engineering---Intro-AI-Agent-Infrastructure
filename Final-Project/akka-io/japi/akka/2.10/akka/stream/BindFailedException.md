---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T17:05:01Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/2.10/akka/stream/BindFailedException.html
title: BindFailedException
---

# BindFailedException

## Content

Package [akka.stream](package-summary.html)
## Class BindFailedException

- java.lang.Object
- - java.lang.Throwable
	- - java.lang.Exception
		- - java.lang.RuntimeException
			- - [akka.stream.StreamTcpException](StreamTcpException.html "class in akka.stream")
				- - akka.stream.BindFailedException

- All Implemented Interfaces:
`java.io.Serializable`, `scala.util.control.NoStackTrace`

Direct Known Subclasses:
`[BindFailedException$](BindFailedException$.html "class in akka.stream")`

---

```
public class BindFailedException
extends [StreamTcpException](StreamTcpException.html "class in akka.stream")
```

See Also:
[Serialized Form](../../serialized-form.html#akka.stream.BindFailedException)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[BindFailedException](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static void` | `[addSuppressed](#addSuppressed(java.lang.Throwable))​(java.lang.Throwable x$1)` |  |
	| `static boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `abstract static boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object that)` |  |
	| `static java.lang.Throwable` | `[fillInStackTrace](#fillInStackTrace())()` |  |
	| `static java.lang.Throwable` | `[getCause](#getCause())()` |  |
	| `static java.lang.String` | `[getLocalizedMessage](#getLocalizedMessage())()` |  |
	| `static java.lang.String` | `[getMessage](#getMessage())()` |  |
	| `static java.lang.StackTraceElement[]` | `[getStackTrace](#getStackTrace())()` |  |
	| `static java.lang.Throwable[]` | `[getSuppressed](#getSuppressed())()` |  |
	| `static int` | `[hashCode](#hashCode())()` |  |
	| `static java.lang.Throwable` | `[initCause](#initCause(java.lang.Throwable))​(java.lang.Throwable x$1)` |  |
	| `static void` | `[printStackTrace](#printStackTrace())()` |  |
	| `static void` | `[printStackTrace](#printStackTrace(java.io.PrintStream))​(java.io.PrintStream x$1)` |  |
	| `static void` | `[printStackTrace](#printStackTrace(java.io.PrintWriter))​(java.io.PrintWriter x$1)` |  |
	| `static int` | `[productArity](#productArity())()` |  |
	| `static java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `static java.lang.String` | `[productElementName](#productElementName(int))​(int n)` |  |
	| `static scala.collection.Iterator<java.lang.String>` | `[productElementNames](#productElementNames())()` |  |
	| `static scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `static java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `static void` | `[setStackTrace](#setStackTrace(java.lang.StackTraceElement%5B%5D))​(java.lang.StackTraceElement[] x$1)` |  |
	| `static java.lang.String` | `[toString](#toString())()` |  |
	
	
		- ### Methods inherited from class java.lang.Throwable
		
		
		`addSuppressed, fillInStackTrace, getCause, getLocalizedMessage, getMessage, getStackTrace, getSuppressed, initCause, printStackTrace, printStackTrace, printStackTrace, setStackTrace, toString`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.util.control.NoStackTrace
		
		
		`fillInStackTrace`

- - ### Constructor Detail
	
	
	
		- #### BindFailedException
		
		
		
		```
		public BindFailedException()
		```

	- ### Method Detail
	
	
	
		- #### productPrefix
		
		
		
		```
		public static java.lang.String productPrefix()
		```
		- #### productArity
		
		
		
		```
		public static int productArity()
		```
		- #### productElement
		
		
		
		```
		public static java.lang.Object productElement​(int x$1)
		```
		- #### productIterator
		
		
		
		```
		public static scala.collection.Iterator<java.lang.Object> productIterator()
		```
		- #### canEqual
		
		
		
		```
		public static boolean canEqual​(java.lang.Object x$1)
		```
		- #### hashCode
		
		
		
		```
		public static int hashCode()
		```
		- #### getMessage
		
		
		
		```
		public static java.lang.String getMessage()
		```
		- #### getLocalizedMessage
		
		
		
		```
		public static java.lang.String getLocalizedMessage()
		```
		- #### getCause
		
		
		
		```
		public static java.lang.Throwable getCause()
		```
		- #### initCause
		
		
		
		```
		public static java.lang.Throwable initCause​(java.lang.Throwable x$1)
		```
		- #### toString
		
		
		
		```
		public static java.lang.String toString()
		```
		- #### printStackTrace
		
		
		
		```
		public static void printStackTrace()
		```
		- #### printStackTrace
		
		
		
		```
		public static void printStackTrace​(java.io.PrintStream x$1)
		```
		- #### printStackTrace
		
		
		
		```
		public static void printStackTrace​(java.io.PrintWriter x$1)
		```
		- #### getStackTrace
		
		
		
		```
		public static java.lang.StackTraceElement[] getStackTrace()
		```
		- #### setStackTrace
		
		
		
		```
		public static void setStackTrace​(java.lang.StackTraceElement[] x$1)
		```
		- #### addSuppressed
		
		
		
		```
		public static final void addSuppressed​(java.lang.Throwable x$1)
		```
		- #### getSuppressed
		
		
		
		```
		public static final java.lang.Throwable[] getSuppressed()
		```
		- #### fillInStackTrace
		
		
		
		```
		public static java.lang.Throwable fillInStackTrace()
		```
		- #### equals
		
		
		
		```
		public abstract static boolean equals​(java.lang.Object that)
		```
		- #### productElementName
		
		
		
		```
		public static java.lang.String productElementName​(int n)
		```
		- #### productElementNames
		
		
		
		```
		public static scala.collection.Iterator<java.lang.String> productElementNames()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/2.10/akka/stream/BindFailedException$.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/StreamTcpException.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/package-summary.html
- https://doc.akka.io/japi/akka/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/2.10/akka/stream/BindFailedException.html](https://doc.akka.io/japi/akka/2.10/akka/stream/BindFailedException.html)*