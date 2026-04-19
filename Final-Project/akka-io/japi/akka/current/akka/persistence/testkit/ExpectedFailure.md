---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:26:40Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/testkit/ExpectedFailure.html
title: ExpectedFailure
---

# ExpectedFailure

## Content

Package [akka.persistence.testkit](package-summary.html)
## Class ExpectedFailure

- java.lang.Object
- - java.lang.Throwable
	- - akka.persistence.testkit.ExpectedFailure

- All Implemented Interfaces:
`java.io.Serializable`, `scala.util.control.NoStackTrace`

Direct Known Subclasses:
`[ExpectedFailure$](ExpectedFailure$.html "class in akka.persistence.testkit")`

---

```
public abstract class ExpectedFailure
extends java.lang.Throwable
implements scala.util.control.NoStackTrace
```

See Also:
[Serialized Form](../../../serialized-form.html#akka.persistence.testkit.ExpectedFailure)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ExpectedFailure](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static void` | `[addSuppressed](#addSuppressed(java.lang.Throwable))​(java.lang.Throwable x$1)` |  |
	| `static java.lang.Throwable` | `[fillInStackTrace](#fillInStackTrace())()` |  |
	| `static java.lang.Throwable` | `[getCause](#getCause())()` |  |
	| `static [ExpectedFailure](ExpectedFailure.html "class in akka.persistence.testkit")` | `[getInstance](#getInstance())()` |  |
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
		- ### Methods inherited from interface scala.util.control.NoStackTrace
		
		
		`fillInStackTrace`

- - ### Constructor Detail
	
	
	
		- #### ExpectedFailure
		
		
		
		```
		public ExpectedFailure()
		```

	- ### Method Detail
	
	
	
		- #### getInstance
		
		
		
		```
		public static [ExpectedFailure](ExpectedFailure.html "class in akka.persistence.testkit") getInstance()
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

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/ExpectedFailure$.html
- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/ExpectedFailure.html
- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/testkit/ExpectedFailure.html](https://doc.akka.io/japi/akka/current/akka/persistence/testkit/ExpectedFailure.html)*