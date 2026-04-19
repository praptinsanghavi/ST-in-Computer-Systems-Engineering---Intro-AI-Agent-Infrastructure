---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:31:28Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpMethod$.html
title: HttpMethod$
---

# HttpMethod$

## Content

Package [akka.http.scaladsl.model](package-summary.html)
## Class HttpMethod$

- java.lang.Object
- - akka.http.scaladsl.model.HttpMethod$

- All Implemented Interfaces:
`java.io.Serializable`

---

```
public class HttpMethod$
extends java.lang.Object
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../../serialized-form.html#akka.http.scaladsl.model.HttpMethod$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [HttpMethod$](HttpMethod$.html "class in akka.http.scaladsl.model")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[HttpMethod$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) [Deprecated Methods](javascript:show(32);) 
	| Modifier and Type | Method | Description |
	| `[HttpMethod](HttpMethod.html "class in akka.http.scaladsl.model")` | `[custom](#custom(java.lang.String))​(java.lang.String name)` | Creates a custom method by name and assumes properties conservatively to be  safe \= false, idempotent \= false, requestEntityAcceptance \= Expected and contentLengthAllowed always true. |
	| `[HttpMethod](HttpMethod.html "class in akka.http.scaladsl.model")` | `[custom](#custom(java.lang.String,boolean,boolean,akka.http.scaladsl.model.RequestEntityAcceptance))​(java.lang.String name,  boolean safe,  boolean idempotent,  [RequestEntityAcceptance](RequestEntityAcceptance.html "interface in akka.http.scaladsl.model") requestEntityAcceptance)` | Deprecated. The created method will compute the presence of Content\-Length headers based on deprecated logic (before issue \#4213\). |
	| `[HttpMethod](HttpMethod.html "class in akka.http.scaladsl.model")` | `[custom](#custom(java.lang.String,boolean,boolean,akka.http.scaladsl.model.RequestEntityAcceptance,boolean))​(java.lang.String name,  boolean safe,  boolean idempotent,  [RequestEntityAcceptance](RequestEntityAcceptance.html "interface in akka.http.scaladsl.model") requestEntityAcceptance,  boolean contentLengthAllowed)` | Create a custom method type. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [HttpMethod$](HttpMethod$.html "class in akka.http.scaladsl.model") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### HttpMethod$
		
		
		
		```
		public HttpMethod$()
		```

	- ### Method Detail
	
	
	
		- #### custom
		
		
		
		```
		public [HttpMethod](HttpMethod.html "class in akka.http.scaladsl.model") custom​(java.lang.String name,
		                         boolean safe,
		                         boolean idempotent,
		                         [RequestEntityAcceptance](RequestEntityAcceptance.html "interface in akka.http.scaladsl.model") requestEntityAcceptance)
		```
		
		Deprecated.
		The created method will compute the presence of Content\-Length headers based on deprecated logic (before issue \#4213\).
		
		Create a custom method type.
		
		Parameters:
		`name` \- (undocumented)
		`safe` \- (undocumented)
		`idempotent` \- (undocumented)
		`requestEntityAcceptance` \- (undocumented)
		Returns:
		(undocumented)
		- #### custom
		
		
		
		```
		public [HttpMethod](HttpMethod.html "class in akka.http.scaladsl.model") custom​(java.lang.String name,
		                         boolean safe,
		                         boolean idempotent,
		                         [RequestEntityAcceptance](RequestEntityAcceptance.html "interface in akka.http.scaladsl.model") requestEntityAcceptance,
		                         boolean contentLengthAllowed)
		```
		
		Create a custom method type.
		
		Parameters:
		`name` \- (undocumented)
		`safe` \- (undocumented)
		`idempotent` \- (undocumented)
		`requestEntityAcceptance` \- (undocumented)
		`contentLengthAllowed` \- (undocumented)
		Returns:
		(undocumented)
		- #### custom
		
		
		
		```
		public [HttpMethod](HttpMethod.html "class in akka.http.scaladsl.model") custom​(java.lang.String name)
		```
		
		Creates a custom method by name and assumes properties conservatively to be
		 safe \= false, idempotent \= false, requestEntityAcceptance \= Expected and contentLengthAllowed always true.
		
		Parameters:
		`name` \- (undocumented)
		Returns:
		(undocumented)

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpMethod$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpMethod.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/RequestEntityAcceptance.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/package-summary.html
- https://doc.akka.io/japi/akka-http/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpMethod$.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpMethod$.html)*