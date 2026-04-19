---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:12:51Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/ExpectedFailure$.html
title: ExpectedFailure$
---

# ExpectedFailure$

## Content

Package [akka.persistence.testkit](package-summary.html)
## Class ExpectedFailure$

- java.lang.Object
- - java.lang.Throwable
	- - [akka.persistence.testkit.ExpectedFailure](ExpectedFailure.html "class in akka.persistence.testkit")
		- - akka.persistence.testkit.ExpectedFailure$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.util.control.NoStackTrace`

---

```
public class ExpectedFailure$
extends [ExpectedFailure](ExpectedFailure.html "class in akka.persistence.testkit")
```

See Also:
[Serialized Form](../../../serialized-form.html#akka.persistence.testkit.ExpectedFailure$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ExpectedFailure$](ExpectedFailure$.html "class in akka.persistence.testkit")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ExpectedFailure$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ExpectedFailure](ExpectedFailure.html "class in akka.persistence.testkit")` | `[getInstance](#getInstance())()` |  |
	
	
		- ### Methods inherited from class akka.persistence.testkit.[ExpectedFailure](ExpectedFailure.html "class in akka.persistence.testkit")
		
		
		`[addSuppressed](ExpectedFailure.html#addSuppressed(java.lang.Throwable)), [fillInStackTrace](ExpectedFailure.html#fillInStackTrace()), [getCause](ExpectedFailure.html#getCause()), [getLocalizedMessage](ExpectedFailure.html#getLocalizedMessage()), [getMessage](ExpectedFailure.html#getMessage()), [getStackTrace](ExpectedFailure.html#getStackTrace()), [getSuppressed](ExpectedFailure.html#getSuppressed()), [initCause](ExpectedFailure.html#initCause(java.lang.Throwable)), [printStackTrace](ExpectedFailure.html#printStackTrace()), [printStackTrace](ExpectedFailure.html#printStackTrace(java.io.PrintStream)), [printStackTrace](ExpectedFailure.html#printStackTrace(java.io.PrintWriter)), [setStackTrace](ExpectedFailure.html#setStackTrace(java.lang.StackTraceElement%5B%5D)), [toString](ExpectedFailure.html#toString())`
		- ### Methods inherited from class java.lang.Throwable
		
		
		`addSuppressed, fillInStackTrace, getCause, getLocalizedMessage, getMessage, getStackTrace, getSuppressed, initCause, printStackTrace, printStackTrace, printStackTrace, setStackTrace, toString`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.util.control.NoStackTrace
		
		
		`fillInStackTrace`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ExpectedFailure$](ExpectedFailure$.html "class in akka.persistence.testkit") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ExpectedFailure$
		
		
		
		```
		public ExpectedFailure$()
		```

	- ### Method Detail
	
	
	
		- #### getInstance
		
		
		
		```
		public [ExpectedFailure](ExpectedFailure.html "class in akka.persistence.testkit") getInstance()
		```
		
		
		Overrides:
		`[getInstance](ExpectedFailure.html#getInstance())` in class `[ExpectedFailure](ExpectedFailure.html "class in akka.persistence.testkit")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/ExpectedFailure$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/ExpectedFailure.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/ExpectedFailure$.html](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/ExpectedFailure$.html)*