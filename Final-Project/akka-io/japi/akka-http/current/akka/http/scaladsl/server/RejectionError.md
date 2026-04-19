---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:39:35Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/RejectionError.html
title: RejectionError
---

# RejectionError

## Content

Package [akka.http.scaladsl.server](package-summary.html)
## Class RejectionError

- java.lang.Object
- - java.lang.Throwable
	- - java.lang.Exception
		- - java.lang.RuntimeException
			- - akka.http.scaladsl.server.RejectionError

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class RejectionError
extends java.lang.RuntimeException
implements scala.Product, java.io.Serializable
```

A Throwable wrapping a Rejection.
 Can be used for marshalling `Future[T]` or `Try[T]` instances, whose failure side is supposed to trigger a route
 rejection rather than an Exception that is handled by the nearest ExceptionHandler.
 (Custom marshallers can of course use it as well.)

See Also:
[Serialized Form](../../../../serialized-form.html#akka.http.scaladsl.server.RejectionError)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[RejectionError](#%3Cinit%3E(akka.http.scaladsl.server.Rejection))​([Rejection](Rejection.html "interface in akka.http.scaladsl.server") rejection)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `abstract static R` | `[apply](#apply(T1))​(T1 v1)` |  |
	| `[Rejection](Rejection.html "interface in akka.http.scaladsl.server")` | `[rejection](#rejection())()` |  |
	| `static java.lang.String` | `[toString](#toString())()` |  |
	
	
		- ### Methods inherited from class java.lang.Throwable
		
		
		`addSuppressed, fillInStackTrace, getCause, getLocalizedMessage, getMessage, getStackTrace, getSuppressed, initCause, printStackTrace, printStackTrace, printStackTrace, setStackTrace, toString`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Equals
		
		
		`canEqual, equals`
		- ### Methods inherited from interface scala.Product
		
		
		`productArity, productElement, productElementName, productElementNames, productIterator, productPrefix`

- - ### Constructor Detail
	
	
	
		- #### RejectionError
		
		
		
		```
		public RejectionError​([Rejection](Rejection.html "interface in akka.http.scaladsl.server") rejection)
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public abstract static R apply​(T1 v1)
		```
		- #### toString
		
		
		
		```
		public static java.lang.String toString()
		```
		- #### rejection
		
		
		
		```
		public [Rejection](Rejection.html "interface in akka.http.scaladsl.server") rejection()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/Rejection.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/package-summary.html
- https://doc.akka.io/japi/akka-http/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/RejectionError.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/RejectionError.html)*