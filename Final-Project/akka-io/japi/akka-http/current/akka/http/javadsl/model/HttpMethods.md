---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:46:24Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/HttpMethods.html
title: HttpMethods
---

# HttpMethods

## Content

Package [akka.http.javadsl.model](package-summary.html)
## Class HttpMethods

- java.lang.Object
- - akka.http.javadsl.model.HttpMethods

- ---

```
public final class HttpMethods
extends java.lang.Object
```

Contains static constants for predefined method types.

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [HttpMethod](HttpMethod.html "class in akka.http.javadsl.model")` | `[CONNECT](#CONNECT)` |  |
	| `static [HttpMethod](HttpMethod.html "class in akka.http.javadsl.model")` | `[DELETE](#DELETE)` |  |
	| `static [HttpMethod](HttpMethod.html "class in akka.http.javadsl.model")` | `[GET](#GET)` |  |
	| `static [HttpMethod](HttpMethod.html "class in akka.http.javadsl.model")` | `[HEAD](#HEAD)` |  |
	| `static [HttpMethod](HttpMethod.html "class in akka.http.javadsl.model")` | `[OPTIONS](#OPTIONS)` |  |
	| `static [HttpMethod](HttpMethod.html "class in akka.http.javadsl.model")` | `[PATCH](#PATCH)` |  |
	| `static [HttpMethod](HttpMethod.html "class in akka.http.javadsl.model")` | `[POST](#POST)` |  |
	| `static [HttpMethod](HttpMethod.html "class in akka.http.javadsl.model")` | `[PUT](#PUT)` |  |
	| `static [HttpMethod](HttpMethod.html "class in akka.http.javadsl.model")` | `[TRACE](#TRACE)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Concrete Methods](javascript:show(8);) [Deprecated Methods](javascript:show(32);) 
	| Modifier and Type | Method | Description |
	| `static [HttpMethod](HttpMethod.html "class in akka.http.javadsl.model")` | `[custom](#custom(java.lang.String,boolean,boolean,akka.http.javadsl.model.RequestEntityAcceptance))​(java.lang.String value,  boolean safe,  boolean idempotent,  [RequestEntityAcceptance](RequestEntityAcceptance.html "class in akka.http.javadsl.model") requestEntityAcceptance)` | Deprecated. The created method will compute the presence of Content\-Length headers based on deprecated logic (before issue \#4213\). |
	| `static [HttpMethod](HttpMethod.html "class in akka.http.javadsl.model")` | `[custom](#custom(java.lang.String,boolean,boolean,akka.http.javadsl.model.RequestEntityAcceptance,boolean))​(java.lang.String value,  boolean safe,  boolean idempotent,  [RequestEntityAcceptance](RequestEntityAcceptance.html "class in akka.http.javadsl.model") requestEntityAcceptance,  boolean contentLengthAllowed)` | Create a custom method type. |
	| `static java.util.Optional<[HttpMethod](HttpMethod.html "class in akka.http.javadsl.model")>` | `[lookup](#lookup(java.lang.String))​(java.lang.String name)` | Looks up a predefined HTTP method with the given name. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### CONNECT
		
		
		
		```
		public static final [HttpMethod](HttpMethod.html "class in akka.http.javadsl.model") CONNECT
		```
		- #### DELETE
		
		
		
		```
		public static final [HttpMethod](HttpMethod.html "class in akka.http.javadsl.model") DELETE
		```
		- #### GET
		
		
		
		```
		public static final [HttpMethod](HttpMethod.html "class in akka.http.javadsl.model") GET
		```
		- #### HEAD
		
		
		
		```
		public static final [HttpMethod](HttpMethod.html "class in akka.http.javadsl.model") HEAD
		```
		- #### OPTIONS
		
		
		
		```
		public static final [HttpMethod](HttpMethod.html "class in akka.http.javadsl.model") OPTIONS
		```
		- #### PATCH
		
		
		
		```
		public static final [HttpMethod](HttpMethod.html "class in akka.http.javadsl.model") PATCH
		```
		- #### POST
		
		
		
		```
		public static final [HttpMethod](HttpMethod.html "class in akka.http.javadsl.model") POST
		```
		- #### PUT
		
		
		
		```
		public static final [HttpMethod](HttpMethod.html "class in akka.http.javadsl.model") PUT
		```
		- #### TRACE
		
		
		
		```
		public static final [HttpMethod](HttpMethod.html "class in akka.http.javadsl.model") TRACE
		```

	- ### Method Detail
	
	
	
		- #### custom
		
		
		
		```
		@Deprecated
		public static [HttpMethod](HttpMethod.html "class in akka.http.javadsl.model") custom​(java.lang.String value,
		                                boolean safe,
		                                boolean idempotent,
		                                [RequestEntityAcceptance](RequestEntityAcceptance.html "class in akka.http.javadsl.model") requestEntityAcceptance)
		```
		
		Deprecated.
		The created method will compute the presence of Content\-Length headers based on deprecated logic (before issue \#4213\).
		
		Create a custom method type.
		- #### custom
		
		
		
		```
		public static [HttpMethod](HttpMethod.html "class in akka.http.javadsl.model") custom​(java.lang.String value,
		                                boolean safe,
		                                boolean idempotent,
		                                [RequestEntityAcceptance](RequestEntityAcceptance.html "class in akka.http.javadsl.model") requestEntityAcceptance,
		                                boolean contentLengthAllowed)
		```
		
		Create a custom method type.
		- #### lookup
		
		
		
		```
		public static java.util.Optional<[HttpMethod](HttpMethod.html "class in akka.http.javadsl.model")> lookup​(java.lang.String name)
		```
		
		Looks up a predefined HTTP method with the given name.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/HttpMethod.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/RequestEntityAcceptance.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/HttpMethods.html](https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/HttpMethods.html)*