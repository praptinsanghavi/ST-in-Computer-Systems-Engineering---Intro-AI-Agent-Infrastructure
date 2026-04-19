---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:09:26Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/RouteResults$.html
title: RouteResults$
---

# RouteResults$

## Content

Package [akka.http.javadsl.server](package-summary.html)
## Class RouteResults$

- java.lang.Object
- - akka.http.javadsl.server.RouteResults$

- ---

```
public class RouteResults$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [RouteResults$](RouteResults$.html "class in akka.http.javadsl.server")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[RouteResults$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[Complete](Complete.html "interface in akka.http.javadsl.server")` | `[complete](#complete(akka.http.javadsl.model.HttpResponse))​([HttpResponse](../model/HttpResponse.html "class in akka.http.javadsl.model") response)` |  |
	| `[Rejected](Rejected.html "interface in akka.http.javadsl.server")` | `[rejected](#rejected(java.lang.Iterable))​(java.lang.Iterable<[Rejection](Rejection.html "interface in akka.http.javadsl.server")> rejections)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [RouteResults$](RouteResults$.html "class in akka.http.javadsl.server") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### RouteResults$
		
		
		
		```
		public RouteResults$()
		```

	- ### Method Detail
	
	
	
		- #### complete
		
		
		
		```
		public [Complete](Complete.html "interface in akka.http.javadsl.server") complete​([HttpResponse](../model/HttpResponse.html "class in akka.http.javadsl.model") response)
		```
		- #### rejected
		
		
		
		```
		public [Rejected](Rejected.html "interface in akka.http.javadsl.server") rejected​(java.lang.Iterable<[Rejection](Rejection.html "interface in akka.http.javadsl.server")> rejections)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpResponse.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/Complete.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/Rejected.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/Rejection.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/RouteResults$.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/RouteResults$.html](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/RouteResults$.html)*