---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:39:32Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/ValidationRejection.html
title: ValidationRejection
---

# ValidationRejection

## Content

Package [akka.http.scaladsl.server](package-summary.html)
## Class ValidationRejection

- java.lang.Object
- - akka.http.scaladsl.server.ValidationRejection

- All Implemented Interfaces:
`[Rejection](../../javadsl/server/Rejection.html "interface in akka.http.javadsl.server")`, `[ValidationRejection](../../javadsl/server/ValidationRejection.html "interface in akka.http.javadsl.server")`, `[Rejection](Rejection.html "interface in akka.http.scaladsl.server")`, `[RejectionWithOptionalCause](RejectionWithOptionalCause.html "interface in akka.http.scaladsl.server")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class ValidationRejection
extends java.lang.Object
implements [ValidationRejection](../../javadsl/server/ValidationRejection.html "interface in akka.http.javadsl.server"), [RejectionWithOptionalCause](RejectionWithOptionalCause.html "interface in akka.http.scaladsl.server"), scala.Product, java.io.Serializable
```

Rejection created by the `validation` directive as well as for `IllegalArgumentExceptions`
 thrown by domain model constructors (e.g. via `require`).
 It signals that an expected value was semantically invalid.

See Also:
[Serialized Form](../../../../serialized-form.html#akka.http.scaladsl.server.ValidationRejection)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ValidationRejection](#%3Cinit%3E(java.lang.String,scala.Option))​(java.lang.String message,  scala.Option<java.lang.Throwable> cause)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `abstract static R` | `[apply](#apply(T1,T2))​(T1 v1,  T2 v2)` |  |
	| `scala.Option<java.lang.Throwable>` | `[cause](#cause())()` |  |
	| `java.lang.String` | `[message](#message())()` |  |
	| `static java.lang.String` | `[toString](#toString())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface scala.Equals
		
		
		`canEqual, equals`
		- ### Methods inherited from interface scala.Product
		
		
		`productArity, productElement, productElementName, productElementNames, productIterator, productPrefix`
		- ### Methods inherited from interface akka.http.scaladsl.server.[RejectionWithOptionalCause](RejectionWithOptionalCause.html "interface in akka.http.scaladsl.server")
		
		
		`[getCause](RejectionWithOptionalCause.html#getCause())`
		- ### Methods inherited from interface akka.http.javadsl.server.[ValidationRejection](../../javadsl/server/ValidationRejection.html "interface in akka.http.javadsl.server")
		
		
		`[getCause](../../javadsl/server/ValidationRejection.html#getCause())`

- - ### Constructor Detail
	
	
	
		- #### ValidationRejection
		
		
		
		```
		public ValidationRejection​(java.lang.String message,
		                           scala.Option<java.lang.Throwable> cause)
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public abstract static R apply​(T1 v1,
		                               T2 v2)
		```
		- #### toString
		
		
		
		```
		public static java.lang.String toString()
		```
		- #### message
		
		
		
		```
		public java.lang.String message()
		```
		
		
		Specified by:
		`[message](../../javadsl/server/ValidationRejection.html#message())` in interface `[ValidationRejection](../../javadsl/server/ValidationRejection.html "interface in akka.http.javadsl.server")`
		- #### cause
		
		
		
		```
		public scala.Option<java.lang.Throwable> cause()
		```
		
		
		Specified by:
		`[cause](RejectionWithOptionalCause.html#cause())` in interface `[RejectionWithOptionalCause](RejectionWithOptionalCause.html "interface in akka.http.scaladsl.server")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/Rejection.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/ValidationRejection.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/Rejection.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/RejectionWithOptionalCause.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/package-summary.html
- https://doc.akka.io/japi/akka-http/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/ValidationRejection.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/ValidationRejection.html)*