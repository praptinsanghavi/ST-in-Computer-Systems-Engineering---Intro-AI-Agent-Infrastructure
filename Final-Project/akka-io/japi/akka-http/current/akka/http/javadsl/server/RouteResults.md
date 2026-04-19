---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:47:55Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/RouteResults.html
title: RouteResults
---

# RouteResults

## Content

Package [akka.http.javadsl.server](package-summary.html)
## Class RouteResults

- java.lang.Object
- - akka.http.javadsl.server.RouteResults

- ---

```
public class RouteResults
extends java.lang.Object
```

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[RouteResults](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [Complete](Complete.html "interface in akka.http.javadsl.server")` | `[complete](#complete(akka.http.javadsl.model.HttpResponse))​([HttpResponse](../model/HttpResponse.html "class in akka.http.javadsl.model") response)` |  |
	| `static [Rejected](Rejected.html "interface in akka.http.javadsl.server")` | `[rejected](#rejected(java.lang.Iterable))​(java.lang.Iterable<[Rejection](Rejection.html "interface in akka.http.javadsl.server")> rejections)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### RouteResults
		
		
		
		```
		public RouteResults()
		```

	- ### Method Detail
	
	
	
		- #### complete
		
		
		
		```
		public static [Complete](Complete.html "interface in akka.http.javadsl.server") complete​([HttpResponse](../model/HttpResponse.html "class in akka.http.javadsl.model") response)
		```
		- #### rejected
		
		
		
		```
		public static [Rejected](Rejected.html "interface in akka.http.javadsl.server") rejected​(java.lang.Iterable<[Rejection](Rejection.html "interface in akka.http.javadsl.server")> rejections)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/HttpResponse.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/Complete.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/Rejected.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/Rejection.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/RouteResults.html](https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/RouteResults.html)*