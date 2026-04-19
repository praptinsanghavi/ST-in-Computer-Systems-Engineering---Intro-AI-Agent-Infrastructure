---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:46:37Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/ResponseFuture.html
title: ResponseFuture
---

# ResponseFuture

## Content

Package [akka.http.javadsl.model](package-summary.html)
## Class ResponseFuture

- java.lang.Object
- - akka.http.javadsl.model.ResponseFuture

- All Implemented Interfaces:
`[RequestResponseAssociation](RequestResponseAssociation.html "interface in akka.http.javadsl.model")`, `[RequestResponseAssociation](../../scaladsl/model/RequestResponseAssociation.html "interface in akka.http.scaladsl.model")`

---

```
public final class ResponseFuture
extends java.lang.Object
implements [RequestResponseAssociation](../../scaladsl/model/RequestResponseAssociation.html "interface in akka.http.scaladsl.model")
```

An association for completing a future when the response arrives.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ResponseFuture](#%3Cinit%3E(java.util.concurrent.CompletableFuture))​(java.util.concurrent.CompletableFuture<[HttpResponse](HttpResponse.html "class in akka.http.javadsl.model")> future)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [ResponseFuture](ResponseFuture.html "class in akka.http.javadsl.model")` | `[apply](#apply(java.util.concurrent.CompletableFuture))​(java.util.concurrent.CompletableFuture<[HttpResponse](HttpResponse.html "class in akka.http.javadsl.model")> promise)` |  |
	| `java.util.concurrent.CompletableFuture<[HttpResponse](HttpResponse.html "class in akka.http.javadsl.model")>` | `[future](#future())()` |  |
	| `static [AttributeKey](AttributeKey.html "class in akka.http.javadsl.model")<[ResponseFuture](ResponseFuture.html "class in akka.http.javadsl.model")>` | `[KEY](#KEY())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### ResponseFuture
		
		
		
		```
		public ResponseFuture​(java.util.concurrent.CompletableFuture<[HttpResponse](HttpResponse.html "class in akka.http.javadsl.model")> future)
		```

	- ### Method Detail
	
	
	
		- #### KEY
		
		
		
		```
		public static [AttributeKey](AttributeKey.html "class in akka.http.javadsl.model")<[ResponseFuture](ResponseFuture.html "class in akka.http.javadsl.model")> KEY()
		```
		- #### apply
		
		
		
		```
		public static [ResponseFuture](ResponseFuture.html "class in akka.http.javadsl.model") apply​(java.util.concurrent.CompletableFuture<[HttpResponse](HttpResponse.html "class in akka.http.javadsl.model")> promise)
		```
		- #### future
		
		
		
		```
		public java.util.concurrent.CompletableFuture<[HttpResponse](HttpResponse.html "class in akka.http.javadsl.model")> future()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/AttributeKey.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/HttpResponse.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/RequestResponseAssociation.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/ResponseFuture.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/RequestResponseAssociation.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/ResponseFuture.html](https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/ResponseFuture.html)*