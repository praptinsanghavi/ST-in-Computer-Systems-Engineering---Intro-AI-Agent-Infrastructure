---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:29:24Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/DataMapper$.html
title: DataMapper$
---

# DataMapper$

## Content

Package [akka.http.scaladsl.coding](package-summary.html)
## Class DataMapper$

- java.lang.Object
- - akka.http.scaladsl.coding.DataMapper$

- ---

```
public class DataMapper$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [DataMapper$](DataMapper$.html "class in akka.http.scaladsl.coding")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[DataMapper$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<T,​E>[DataMapper](DataMapper.html "interface in akka.http.scaladsl.coding")<T>` | `[mapMessage](#mapMessage(akka.http.scaladsl.coding.DataMapper,scala.Function2))​([DataMapper](DataMapper.html "interface in akka.http.scaladsl.coding")<E> entityMapper,  scala.Function2<T,​scala.Function1<E,​E>,​T> mapEntity)` |  |
	| `[DataMapper](DataMapper.html "interface in akka.http.scaladsl.coding")<[HttpRequest](../model/HttpRequest.html "class in akka.http.scaladsl.model")>` | `[mapRequest](#mapRequest())()` |  |
	| `[DataMapper](DataMapper.html "interface in akka.http.scaladsl.coding")<[RequestEntity](../model/RequestEntity.html "interface in akka.http.scaladsl.model")>` | `[mapRequestEntity](#mapRequestEntity())()` |  |
	| `[DataMapper](DataMapper.html "interface in akka.http.scaladsl.coding")<[HttpResponse](../model/HttpResponse.html "class in akka.http.scaladsl.model")>` | `[mapResponse](#mapResponse())()` |  |
	| `[DataMapper](DataMapper.html "interface in akka.http.scaladsl.coding")<[ResponseEntity](../model/ResponseEntity.html "interface in akka.http.scaladsl.model")>` | `[mapResponseEntity](#mapResponseEntity())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [DataMapper$](DataMapper$.html "class in akka.http.scaladsl.coding") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### DataMapper$
		
		
		
		```
		public DataMapper$()
		```

	- ### Method Detail
	
	
	
		- #### mapRequestEntity
		
		
		
		```
		public [DataMapper](DataMapper.html "interface in akka.http.scaladsl.coding")<[RequestEntity](../model/RequestEntity.html "interface in akka.http.scaladsl.model")> mapRequestEntity()
		```
		- #### mapResponseEntity
		
		
		
		```
		public [DataMapper](DataMapper.html "interface in akka.http.scaladsl.coding")<[ResponseEntity](../model/ResponseEntity.html "interface in akka.http.scaladsl.model")> mapResponseEntity()
		```
		- #### mapRequest
		
		
		
		```
		public [DataMapper](DataMapper.html "interface in akka.http.scaladsl.coding")<[HttpRequest](../model/HttpRequest.html "class in akka.http.scaladsl.model")> mapRequest()
		```
		- #### mapResponse
		
		
		
		```
		public [DataMapper](DataMapper.html "interface in akka.http.scaladsl.coding")<[HttpResponse](../model/HttpResponse.html "class in akka.http.scaladsl.model")> mapResponse()
		```
		- #### mapMessage
		
		
		
		```
		public <T,​E> [DataMapper](DataMapper.html "interface in akka.http.scaladsl.coding")<T> mapMessage​([DataMapper](DataMapper.html "interface in akka.http.scaladsl.coding")<E> entityMapper,
		                                            scala.Function2<T,​scala.Function1<E,​E>,​T> mapEntity)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/DataMapper$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/DataMapper.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpRequest.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpResponse.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/RequestEntity.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ResponseEntity.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/DataMapper$.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/DataMapper$.html)*