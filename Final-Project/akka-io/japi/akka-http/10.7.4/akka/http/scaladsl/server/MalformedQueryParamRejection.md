---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:10:34Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/MalformedQueryParamRejection.html
title: MalformedQueryParamRejection
---

# MalformedQueryParamRejection

## Content

Package [akka.http.scaladsl.server](package-summary.html)
## Class MalformedQueryParamRejection

- java.lang.Object
- - akka.http.scaladsl.server.MalformedQueryParamRejection

- All Implemented Interfaces:
`[MalformedQueryParamRejection](../../javadsl/server/MalformedQueryParamRejection.html "interface in akka.http.javadsl.server")`, `[Rejection](../../javadsl/server/Rejection.html "interface in akka.http.javadsl.server")`, `[Rejection](Rejection.html "interface in akka.http.scaladsl.server")`, `[RejectionWithOptionalCause](RejectionWithOptionalCause.html "interface in akka.http.scaladsl.server")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class MalformedQueryParamRejection
extends java.lang.Object
implements [MalformedQueryParamRejection](../../javadsl/server/MalformedQueryParamRejection.html "interface in akka.http.javadsl.server"), [RejectionWithOptionalCause](RejectionWithOptionalCause.html "interface in akka.http.scaladsl.server"), scala.Product, java.io.Serializable
```

Rejection created by parameter filters.
 Signals that the request was rejected because a query parameter could not be interpreted.

See Also:
[Serialized Form](../../../../serialized-form.html#akka.http.scaladsl.server.MalformedQueryParamRejection)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[MalformedQueryParamRejection](#%3Cinit%3E(java.lang.String,java.lang.String,scala.Option))​(java.lang.String parameterName,  java.lang.String errorMsg,  scala.Option<java.lang.Throwable> cause)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `abstract static R` | `[apply](#apply(T1,T2,T3))​(T1 v1,  T2 v2,  T3 v3)` |  |
	| `scala.Option<java.lang.Throwable>` | `[cause](#cause())()` |  |
	| `java.lang.String` | `[errorMsg](#errorMsg())()` |  |
	| `java.lang.String` | `[parameterName](#parameterName())()` |  |
	| `static java.lang.String` | `[toString](#toString())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface scala.Equals
		
		
		`canEqual, equals`
		- ### Methods inherited from interface akka.http.javadsl.server.[MalformedQueryParamRejection](../../javadsl/server/MalformedQueryParamRejection.html "interface in akka.http.javadsl.server")
		
		
		`[getCause](../../javadsl/server/MalformedQueryParamRejection.html#getCause())`
		- ### Methods inherited from interface scala.Product
		
		
		`productArity, productElement, productElementName, productElementNames, productIterator, productPrefix`
		- ### Methods inherited from interface akka.http.scaladsl.server.[RejectionWithOptionalCause](RejectionWithOptionalCause.html "interface in akka.http.scaladsl.server")
		
		
		`[getCause](RejectionWithOptionalCause.html#getCause())`

- - ### Constructor Detail
	
	
	
		- #### MalformedQueryParamRejection
		
		
		
		```
		public MalformedQueryParamRejection​(java.lang.String parameterName,
		                                    java.lang.String errorMsg,
		                                    scala.Option<java.lang.Throwable> cause)
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public abstract static R apply​(T1 v1,
		                               T2 v2,
		                               T3 v3)
		```
		- #### toString
		
		
		
		```
		public static java.lang.String toString()
		```
		- #### parameterName
		
		
		
		```
		public java.lang.String parameterName()
		```
		
		
		Specified by:
		`[parameterName](../../javadsl/server/MalformedQueryParamRejection.html#parameterName())` in interface `[MalformedQueryParamRejection](../../javadsl/server/MalformedQueryParamRejection.html "interface in akka.http.javadsl.server")`
		- #### errorMsg
		
		
		
		```
		public java.lang.String errorMsg()
		```
		
		
		Specified by:
		`[errorMsg](../../javadsl/server/MalformedQueryParamRejection.html#errorMsg())` in interface `[MalformedQueryParamRejection](../../javadsl/server/MalformedQueryParamRejection.html "interface in akka.http.javadsl.server")`
		- #### cause
		
		
		
		```
		public scala.Option<java.lang.Throwable> cause()
		```
		
		
		Specified by:
		`[cause](RejectionWithOptionalCause.html#cause())` in interface `[RejectionWithOptionalCause](RejectionWithOptionalCause.html "interface in akka.http.scaladsl.server")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/MalformedQueryParamRejection.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/Rejection.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/Rejection.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/RejectionWithOptionalCause.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/package-summary.html
- https://doc.akka.io/japi/akka-http/10.7.4/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/MalformedQueryParamRejection.html](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/MalformedQueryParamRejection.html)*