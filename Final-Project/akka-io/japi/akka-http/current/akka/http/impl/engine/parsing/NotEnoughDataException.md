---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:32:33Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/parsing/NotEnoughDataException.html
title: NotEnoughDataException
---

# NotEnoughDataException

## Content

Package [akka.http.impl.engine.parsing](package-summary.html)
## Class NotEnoughDataException

- java.lang.Object
- - akka.http.impl.engine.parsing.NotEnoughDataException

- ---

```
public class NotEnoughDataException
extends java.lang.Object
```

INTERNAL API

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[NotEnoughDataException](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static void` | `[addSuppressed](#addSuppressed(java.lang.Throwable))​(java.lang.Throwable x$1)` |  |
	| `static java.lang.Throwable` | `[fillInStackTrace](#fillInStackTrace())()` |  |
	| `static java.lang.Throwable` | `[getCause](#getCause())()` |  |
	| `static java.lang.String` | `[getLocalizedMessage](#getLocalizedMessage())()` |  |
	| `static java.lang.String` | `[getMessage](#getMessage())()` |  |
	| `static java.lang.StackTraceElement[]` | `[getStackTrace](#getStackTrace())()` |  |
	| `static java.lang.Throwable[]` | `[getSuppressed](#getSuppressed())()` |  |
	| `static java.lang.Throwable` | `[initCause](#initCause(java.lang.Throwable))​(java.lang.Throwable x$1)` |  |
	| `static void` | `[printStackTrace](#printStackTrace())()` |  |
	| `static void` | `[printStackTrace](#printStackTrace(java.io.PrintStream))​(java.io.PrintStream x$1)` |  |
	| `static void` | `[printStackTrace](#printStackTrace(java.io.PrintWriter))​(java.io.PrintWriter x$1)` |  |
	| `static void` | `[setStackTrace](#setStackTrace(java.lang.StackTraceElement%5B%5D))​(java.lang.StackTraceElement[] x$1)` |  |
	| `static java.lang.String` | `[toString](#toString())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### NotEnoughDataException
		
		
		
		```
		public NotEnoughDataException()
		```

	- ### Method Detail
	
	
	
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

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/parsing/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/parsing/NotEnoughDataException.html](https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/parsing/NotEnoughDataException.html)*