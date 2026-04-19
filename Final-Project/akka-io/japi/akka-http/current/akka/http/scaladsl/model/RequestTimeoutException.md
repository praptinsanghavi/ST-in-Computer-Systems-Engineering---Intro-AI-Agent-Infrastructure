---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:33:42Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/RequestTimeoutException.html
title: RequestTimeoutException
---

# RequestTimeoutException

## Content

Package [akka.http.scaladsl.model](package-summary.html)
## Class RequestTimeoutException

- java.lang.Object
- - java.lang.Throwable
	- - java.lang.Exception
		- - java.lang.RuntimeException
			- - akka.http.scaladsl.model.RequestTimeoutException

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public class RequestTimeoutException
extends java.lang.RuntimeException
implements scala.Product, java.io.Serializable
```

See Also:
[Serialized Form](../../../../serialized-form.html#akka.http.scaladsl.model.RequestTimeoutException)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[RequestTimeoutException](#%3Cinit%3E(akka.http.scaladsl.model.HttpRequest,java.lang.String))​([HttpRequest](HttpRequest.html "class in akka.http.scaladsl.model") request,  java.lang.String message)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `abstract static R` | `[apply](#apply(T1,T2))​(T1 v1,  T2 v2)` |  |
	| `java.lang.String` | `[message](#message())()` |  |
	| `[HttpRequest](HttpRequest.html "class in akka.http.scaladsl.model")` | `[request](#request())()` |  |
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
	
	
	
		- #### RequestTimeoutException
		
		
		
		```
		public RequestTimeoutException​([HttpRequest](HttpRequest.html "class in akka.http.scaladsl.model") request,
		                               java.lang.String message)
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
		- #### request
		
		
		
		```
		public [HttpRequest](HttpRequest.html "class in akka.http.scaladsl.model") request()
		```
		- #### message
		
		
		
		```
		public java.lang.String message()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpRequest.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/package-summary.html
- https://doc.akka.io/japi/akka-http/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/RequestTimeoutException.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/RequestTimeoutException.html)*