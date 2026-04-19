---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:32:34Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ResponsePromise.html
title: ResponsePromise
---

# ResponsePromise

## Content

Package [akka.http.scaladsl.model](package-summary.html)
## Class ResponsePromise

- java.lang.Object
- - akka.http.scaladsl.model.ResponsePromise

- All Implemented Interfaces:
`[RequestResponseAssociation](../../javadsl/model/RequestResponseAssociation.html "interface in akka.http.javadsl.model")`, `[RequestResponseAssociation](RequestResponseAssociation.html "interface in akka.http.scaladsl.model")`

---

```
public final class ResponsePromise
extends java.lang.Object
implements [RequestResponseAssociation](RequestResponseAssociation.html "interface in akka.http.scaladsl.model")
```

An association for completing a future when the response arrives.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ResponsePromise](#%3Cinit%3E(scala.concurrent.Promise))​(scala.concurrent.Promise<[HttpResponse](HttpResponse.html "class in akka.http.scaladsl.model")> promise)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [ResponsePromise](ResponsePromise.html "class in akka.http.scaladsl.model")` | `[apply](#apply(scala.concurrent.Promise))​(scala.concurrent.Promise<[HttpResponse](HttpResponse.html "class in akka.http.scaladsl.model")> promise)` |  |
	| `static [AttributeKey](AttributeKey.html "class in akka.http.scaladsl.model")<[ResponsePromise](ResponsePromise.html "class in akka.http.scaladsl.model")>` | `[Key](#Key())()` |  |
	| `scala.concurrent.Promise<[HttpResponse](HttpResponse.html "class in akka.http.scaladsl.model")>` | `[promise](#promise())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### ResponsePromise
		
		
		
		```
		public ResponsePromise​(scala.concurrent.Promise<[HttpResponse](HttpResponse.html "class in akka.http.scaladsl.model")> promise)
		```

	- ### Method Detail
	
	
	
		- #### Key
		
		
		
		```
		public static [AttributeKey](AttributeKey.html "class in akka.http.scaladsl.model")<[ResponsePromise](ResponsePromise.html "class in akka.http.scaladsl.model")> Key()
		```
		- #### apply
		
		
		
		```
		public static [ResponsePromise](ResponsePromise.html "class in akka.http.scaladsl.model") apply​(scala.concurrent.Promise<[HttpResponse](HttpResponse.html "class in akka.http.scaladsl.model")> promise)
		```
		- #### promise
		
		
		
		```
		public scala.concurrent.Promise<[HttpResponse](HttpResponse.html "class in akka.http.scaladsl.model")> promise()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/RequestResponseAssociation.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/AttributeKey.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpResponse.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/RequestResponseAssociation.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ResponsePromise.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ResponsePromise.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ResponsePromise.html)*