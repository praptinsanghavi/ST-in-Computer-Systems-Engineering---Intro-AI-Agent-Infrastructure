---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:26:43Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/testkit/ExpectedRejection.html
title: ExpectedRejection
---

# ExpectedRejection

## Content

Package [akka.persistence.testkit](package-summary.html)
## Class ExpectedRejection

- java.lang.Object
- - java.lang.Throwable
	- - akka.persistence.testkit.ExpectedRejection

- All Implemented Interfaces:
`java.io.Serializable`

Direct Known Subclasses:
`[ExpectedRejection$](ExpectedRejection$.html "class in akka.persistence.testkit")`

---

```
public abstract class ExpectedRejection
extends java.lang.Throwable
```

See Also:
[Serialized Form](../../../serialized-form.html#akka.persistence.testkit.ExpectedRejection)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ExpectedRejection](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static void` | `[addSuppressed](#addSuppressed(java.lang.Throwable))​(java.lang.Throwable x$1)` |  |
	| `static java.lang.Throwable` | `[fillInStackTrace](#fillInStackTrace())()` |  |
	| `static java.lang.Throwable` | `[getCause](#getCause())()` |  |
	| `static [ExpectedRejection](ExpectedRejection.html "class in akka.persistence.testkit")` | `[getInstance](#getInstance())()` |  |
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
	
	
		- ### Methods inherited from class java.lang.Throwable
		
		
		`addSuppressed, fillInStackTrace, getCause, getLocalizedMessage, getMessage, getStackTrace, getSuppressed, initCause, printStackTrace, printStackTrace, printStackTrace, setStackTrace, toString`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### ExpectedRejection
		
		
		
		```
		public ExpectedRejection()
		```

	- ### Method Detail
	
	
	
		- #### getInstance
		
		
		
		```
		public static [ExpectedRejection](ExpectedRejection.html "class in akka.persistence.testkit") getInstance()
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
		- #### fillInStackTrace
		
		
		
		```
		public static java.lang.Throwable fillInStackTrace()
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

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/ExpectedRejection$.html
- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/ExpectedRejection.html
- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/testkit/ExpectedRejection.html](https://doc.akka.io/japi/akka/current/akka/persistence/testkit/ExpectedRejection.html)*