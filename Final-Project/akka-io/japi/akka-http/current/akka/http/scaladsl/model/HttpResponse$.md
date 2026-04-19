---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:31:35Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpResponse$.html
title: HttpResponse$
---

# HttpResponse$

## Content

Package [akka.http.scaladsl.model](package-summary.html)
## Class HttpResponse$

- java.lang.Object
- - akka.http.scaladsl.model.HttpResponse$

- ---

```
public class HttpResponse$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [HttpResponse$](HttpResponse$.html "class in akka.http.scaladsl.model")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[HttpResponse$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[HttpResponse](HttpResponse.html "class in akka.http.scaladsl.model")` | `[apply](#apply(akka.http.scaladsl.model.StatusCode,scala.collection.immutable.Seq,akka.http.scaladsl.model.ResponseEntity,akka.http.scaladsl.model.HttpProtocol))​([StatusCode](StatusCode.html "class in akka.http.scaladsl.model") status,  scala.collection.immutable.Seq<[HttpHeader](HttpHeader.html "class in akka.http.scaladsl.model")> headers,  [ResponseEntity](ResponseEntity.html "interface in akka.http.scaladsl.model") entity,  [HttpProtocol](HttpProtocol.html "class in akka.http.scaladsl.model") protocol)` |  |
	| `[OptHttpResponse](OptHttpResponse.html "class in akka.http.scaladsl.model")` | `[unapply](#unapply(akka.http.scaladsl.model.HttpResponse))​([HttpResponse](HttpResponse.html "class in akka.http.scaladsl.model") any)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [HttpResponse$](HttpResponse$.html "class in akka.http.scaladsl.model") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### HttpResponse$
		
		
		
		```
		public HttpResponse$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public [HttpResponse](HttpResponse.html "class in akka.http.scaladsl.model") apply​([StatusCode](StatusCode.html "class in akka.http.scaladsl.model") status,
		                          scala.collection.immutable.Seq<[HttpHeader](HttpHeader.html "class in akka.http.scaladsl.model")> headers,
		                          [ResponseEntity](ResponseEntity.html "interface in akka.http.scaladsl.model") entity,
		                          [HttpProtocol](HttpProtocol.html "class in akka.http.scaladsl.model") protocol)
		```
		- #### unapply
		
		
		
		```
		public [OptHttpResponse](OptHttpResponse.html "class in akka.http.scaladsl.model") unapply​([HttpResponse](HttpResponse.html "class in akka.http.scaladsl.model") any)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpHeader.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpProtocol.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpResponse$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpResponse.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/OptHttpResponse.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ResponseEntity.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/StatusCode.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpResponse$.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpResponse$.html)*