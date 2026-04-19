---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:31:52Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/RequestErrorFlow$.html
title: RequestErrorFlow$
---

# RequestErrorFlow$

## Content

Package [akka.http.impl.engine.http2](package-summary.html)
## Class RequestErrorFlow$

- java.lang.Object
- - akka.http.impl.engine.http2\.RequestErrorFlow$

- ---

```
public class RequestErrorFlow$
extends java.lang.Object
```

INTERNAL API

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [RequestErrorFlow$](RequestErrorFlow$.html "class in akka.http.impl.engine.http2")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[RequestErrorFlow$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `akka.stream.scaladsl.BidiFlow<[HttpResponse](../../../scaladsl/model/HttpResponse.html "class in akka.http.scaladsl.model"),​[HttpResponse](../../../scaladsl/model/HttpResponse.html "class in akka.http.scaladsl.model"),​[RequestParsing.ParseRequestResult](RequestParsing.ParseRequestResult.html "interface in akka.http.impl.engine.http2"),​[HttpRequest](../../../scaladsl/model/HttpRequest.html "class in akka.http.scaladsl.model"),​akka.NotUsed>` | `[apply](#apply())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [RequestErrorFlow$](RequestErrorFlow$.html "class in akka.http.impl.engine.http2") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### RequestErrorFlow$
		
		
		
		```
		public RequestErrorFlow$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public akka.stream.scaladsl.BidiFlow<[HttpResponse](../../../scaladsl/model/HttpResponse.html "class in akka.http.scaladsl.model"),​[HttpResponse](../../../scaladsl/model/HttpResponse.html "class in akka.http.scaladsl.model"),​[RequestParsing.ParseRequestResult](RequestParsing.ParseRequestResult.html "interface in akka.http.impl.engine.http2"),​[HttpRequest](../../../scaladsl/model/HttpRequest.html "class in akka.http.scaladsl.model"),​akka.NotUsed> apply()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/RequestErrorFlow$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/RequestParsing.ParseRequestResult.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpRequest.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpResponse.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/RequestErrorFlow$.html](https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/RequestErrorFlow$.html)*