---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:17:15Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/2.10/akka/pattern/AskTimeoutException.html
title: AskTimeoutException
---

# AskTimeoutException

## Content

Package [akka.pattern](package-summary.html)
## Class AskTimeoutException

- java.lang.Object
- - java.lang.Throwable
	- - java.lang.Exception
		- - java.util.concurrent.TimeoutException
			- - akka.pattern.AskTimeoutException

- All Implemented Interfaces:
`java.io.Serializable`, `scala.util.control.NoStackTrace`

---

```
public class AskTimeoutException
extends java.util.concurrent.TimeoutException
implements scala.util.control.NoStackTrace
```

This is what is used to complete a Future that is returned from an ask/? call,
 when it times out. A typical reason for `AskTimeoutException` is that the recipient
 actor didn't send a reply.

See Also:
[Serialized Form](../../serialized-form.html#akka.pattern.AskTimeoutException)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[AskTimeoutException](#%3Cinit%3E(java.lang.String))​(java.lang.String message)` |  |
	| `[AskTimeoutException](#%3Cinit%3E(java.lang.String,java.lang.Throwable))​(java.lang.String message,  java.lang.Throwable cause)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `java.lang.Throwable` | `[getCause](#getCause())()` |  |
	
	
		- ### Methods inherited from class java.lang.Throwable
		
		
		`addSuppressed, fillInStackTrace, getLocalizedMessage, getMessage, getStackTrace, getSuppressed, initCause, printStackTrace, printStackTrace, printStackTrace, setStackTrace, toString`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.util.control.NoStackTrace
		
		
		`fillInStackTrace`

- - ### Constructor Detail
	
	
	
		- #### AskTimeoutException
		
		
		
		```
		public AskTimeoutException​(java.lang.String message,
		                           java.lang.Throwable cause)
		```
		- #### AskTimeoutException
		
		
		
		```
		public AskTimeoutException​(java.lang.String message)
		```

	- ### Method Detail
	
	
	
		- #### getCause
		
		
		
		```
		public java.lang.Throwable getCause()
		```
		
		
		Overrides:
		`getCause` in class `java.lang.Throwable`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/2.10/akka/pattern/package-summary.html
- https://doc.akka.io/japi/akka/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/2.10/akka/pattern/AskTimeoutException.html](https://doc.akka.io/japi/akka/2.10/akka/pattern/AskTimeoutException.html)*