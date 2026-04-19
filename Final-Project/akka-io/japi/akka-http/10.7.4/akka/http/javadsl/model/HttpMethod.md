---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:05:52Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpMethod.html
title: HttpMethod
---

# HttpMethod

## Content

Package [akka.http.javadsl.model](package-summary.html)
## Class HttpMethod

- java.lang.Object
- - akka.http.javadsl.model.HttpMethod

- Direct Known Subclasses:
`[HttpMethod](../../scaladsl/model/HttpMethod.html "class in akka.http.scaladsl.model")`

---

```
public abstract class HttpMethod
extends java.lang.Object
```

Represents an HTTP request method. See [`HttpMethods`](HttpMethods.html "class in akka.http.javadsl.model") for a set of predefined methods
 and static constructors to create custom ones.

See Also:
[`for convenience access to often used values.`](HttpMethods.html "class in akka.http.javadsl.model")

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[HttpMethod](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `abstract boolean` | `[isEntityAccepted](#isEntityAccepted())()` | Returns if requests with this method may contain an entity. |
	| `abstract boolean` | `[isIdempotent](#isIdempotent())()` | Returns if this method is "idempotent" as defined in  http://tools.ietf.org/html/draft\-ietf\-httpbis\-p2\-semantics\-26\#section\-4\.2\.2 |
	| `abstract boolean` | `[isSafe](#isSafe())()` | Returns if this method is "safe" as defined in  http://tools.ietf.org/html/draft\-ietf\-httpbis\-p2\-semantics\-26\#section\-4\.2\.1 |
	| `java.lang.String` | `[name](#name())()` | Returns the name of the method, always equal to \[\[value]]. |
	| `abstract [RequestEntityAcceptance](RequestEntityAcceptance.html "class in akka.http.javadsl.model")` | `[requestEntityAcceptance](#requestEntityAcceptance())()` | Returns the entity acceptance level for this method. |
	| `abstract java.lang.String` | `[value](#value())()` | Returns the name of the method. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### HttpMethod
		
		
		
		```
		public HttpMethod()
		```

	- ### Method Detail
	
	
	
		- #### name
		
		
		
		```
		public final java.lang.String name()
		```
		
		Returns the name of the method, always equal to \[\[value]].
		- #### value
		
		
		
		```
		public abstract java.lang.String value()
		```
		
		Returns the name of the method.
		- #### isSafe
		
		
		
		```
		public abstract boolean isSafe()
		```
		
		Returns if this method is "safe" as defined in
		 http://tools.ietf.org/html/draft\-ietf\-httpbis\-p2\-semantics\-26\#section\-4\.2\.1
		- #### isIdempotent
		
		
		
		```
		public abstract boolean isIdempotent()
		```
		
		Returns if this method is "idempotent" as defined in
		 http://tools.ietf.org/html/draft\-ietf\-httpbis\-p2\-semantics\-26\#section\-4\.2\.2
		- #### isEntityAccepted
		
		
		
		```
		public abstract boolean isEntityAccepted()
		```
		
		Returns if requests with this method may contain an entity.
		- #### requestEntityAcceptance
		
		
		
		```
		public abstract [RequestEntityAcceptance](RequestEntityAcceptance.html "class in akka.http.javadsl.model") requestEntityAcceptance()
		```
		
		Returns the entity acceptance level for this method.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpMethods.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/RequestEntityAcceptance.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/package-summary.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/HttpMethod.html

---
*Source: [https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpMethod.html](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpMethod.html)*