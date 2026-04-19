---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:28:56Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/client/RequestBuilding.RequestBuilder.html
title: RequestBuilding.RequestBuilder
---

# RequestBuilding.RequestBuilder

## Content

Package [akka.http.scaladsl.client](package-summary.html)
## Class RequestBuilding.RequestBuilder

- java.lang.Object
- - akka.http.scaladsl.client.RequestBuilding.RequestBuilder

- Enclosing interface:
[RequestBuilding](RequestBuilding.html "interface in akka.http.scaladsl.client")

---

```
public static class RequestBuilding.RequestBuilder
extends java.lang.Object
```

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[RequestBuilder](#%3Cinit%3E(akka.http.scaladsl.model.HttpMethod))​([HttpMethod](../model/HttpMethod.html "class in akka.http.scaladsl.model") method)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[HttpRequest](../model/HttpRequest.html "class in akka.http.scaladsl.model")` | `[apply](#apply())()` |  |
	| `[HttpRequest](../model/HttpRequest.html "class in akka.http.scaladsl.model")` | `[apply](#apply(akka.http.scaladsl.model.Uri))​([Uri](../model/Uri.html "class in akka.http.scaladsl.model") uri)` |  |
	| `[HttpRequest](../model/HttpRequest.html "class in akka.http.scaladsl.model")` | `[apply](#apply(akka.http.scaladsl.model.Uri,akka.http.scaladsl.model.RequestEntity))​([Uri](../model/Uri.html "class in akka.http.scaladsl.model") uri,  [RequestEntity](../model/RequestEntity.html "interface in akka.http.scaladsl.model") entity)` |  |
	| `<T> [HttpRequest](../model/HttpRequest.html "class in akka.http.scaladsl.model")` | `[apply](#apply(akka.http.scaladsl.model.Uri,scala.Option,akka.http.scaladsl.marshalling.Marshaller,akka.util.Timeout,scala.concurrent.ExecutionContext))​([Uri](../model/Uri.html "class in akka.http.scaladsl.model") uri,  scala.Option<T> content,  [Marshaller](../marshalling/Marshaller.html "class in akka.http.scaladsl.marshalling")<T,​[RequestEntity](../model/RequestEntity.html "interface in akka.http.scaladsl.model")> m,  akka.util.Timeout timeout,  scala.concurrent.ExecutionContext ec)` |  |
	| `<T> [HttpRequest](../model/HttpRequest.html "class in akka.http.scaladsl.model")` | `[apply](#apply(akka.http.scaladsl.model.Uri,T,akka.http.scaladsl.marshalling.Marshaller,scala.concurrent.ExecutionContext))​([Uri](../model/Uri.html "class in akka.http.scaladsl.model") uri,  T content,  [Marshaller](../marshalling/Marshaller.html "class in akka.http.scaladsl.marshalling")<T,​[RequestEntity](../model/RequestEntity.html "interface in akka.http.scaladsl.model")> m,  scala.concurrent.ExecutionContext ec)` |  |
	| `[HttpRequest](../model/HttpRequest.html "class in akka.http.scaladsl.model")` | `[apply](#apply(java.lang.String))​(java.lang.String uri)` |  |
	| `[HttpRequest](../model/HttpRequest.html "class in akka.http.scaladsl.model")` | `[apply](#apply(java.lang.String,akka.http.scaladsl.model.RequestEntity))​(java.lang.String uri,  [RequestEntity](../model/RequestEntity.html "interface in akka.http.scaladsl.model") entity)` |  |
	| `<T> [HttpRequest](../model/HttpRequest.html "class in akka.http.scaladsl.model")` | `[apply](#apply(java.lang.String,scala.Option,akka.http.scaladsl.marshalling.Marshaller,scala.concurrent.ExecutionContext))​(java.lang.String uri,  scala.Option<T> content,  [Marshaller](../marshalling/Marshaller.html "class in akka.http.scaladsl.marshalling")<T,​[RequestEntity](../model/RequestEntity.html "interface in akka.http.scaladsl.model")> m,  scala.concurrent.ExecutionContext ec)` |  |
	| `<T> [HttpRequest](../model/HttpRequest.html "class in akka.http.scaladsl.model")` | `[apply](#apply(java.lang.String,T,akka.http.scaladsl.marshalling.Marshaller,scala.concurrent.ExecutionContext))​(java.lang.String uri,  T content,  [Marshaller](../marshalling/Marshaller.html "class in akka.http.scaladsl.marshalling")<T,​[RequestEntity](../model/RequestEntity.html "interface in akka.http.scaladsl.model")> m,  scala.concurrent.ExecutionContext ec)` |  |
	| `[HttpMethod](../model/HttpMethod.html "class in akka.http.scaladsl.model")` | `[method](#method())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### RequestBuilder
		
		
		
		```
		public RequestBuilder​([HttpMethod](../model/HttpMethod.html "class in akka.http.scaladsl.model") method)
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public [HttpRequest](../model/HttpRequest.html "class in akka.http.scaladsl.model") apply()
		```
		- #### apply
		
		
		
		```
		public [HttpRequest](../model/HttpRequest.html "class in akka.http.scaladsl.model") apply​(java.lang.String uri)
		```
		- #### apply
		
		
		
		```
		public <T> [HttpRequest](../model/HttpRequest.html "class in akka.http.scaladsl.model") apply​(java.lang.String uri,
		                             T content,
		                             [Marshaller](../marshalling/Marshaller.html "class in akka.http.scaladsl.marshalling")<T,​[RequestEntity](../model/RequestEntity.html "interface in akka.http.scaladsl.model")> m,
		                             scala.concurrent.ExecutionContext ec)
		```
		- #### apply
		
		
		
		```
		public <T> [HttpRequest](../model/HttpRequest.html "class in akka.http.scaladsl.model") apply​(java.lang.String uri,
		                             scala.Option<T> content,
		                             [Marshaller](../marshalling/Marshaller.html "class in akka.http.scaladsl.marshalling")<T,​[RequestEntity](../model/RequestEntity.html "interface in akka.http.scaladsl.model")> m,
		                             scala.concurrent.ExecutionContext ec)
		```
		- #### apply
		
		
		
		```
		public [HttpRequest](../model/HttpRequest.html "class in akka.http.scaladsl.model") apply​(java.lang.String uri,
		                         [RequestEntity](../model/RequestEntity.html "interface in akka.http.scaladsl.model") entity)
		```
		- #### apply
		
		
		
		```
		public [HttpRequest](../model/HttpRequest.html "class in akka.http.scaladsl.model") apply​([Uri](../model/Uri.html "class in akka.http.scaladsl.model") uri)
		```
		- #### apply
		
		
		
		```
		public <T> [HttpRequest](../model/HttpRequest.html "class in akka.http.scaladsl.model") apply​([Uri](../model/Uri.html "class in akka.http.scaladsl.model") uri,
		                             T content,
		                             [Marshaller](../marshalling/Marshaller.html "class in akka.http.scaladsl.marshalling")<T,​[RequestEntity](../model/RequestEntity.html "interface in akka.http.scaladsl.model")> m,
		                             scala.concurrent.ExecutionContext ec)
		```
		- #### apply
		
		
		
		```
		public <T> [HttpRequest](../model/HttpRequest.html "class in akka.http.scaladsl.model") apply​([Uri](../model/Uri.html "class in akka.http.scaladsl.model") uri,
		                             scala.Option<T> content,
		                             [Marshaller](../marshalling/Marshaller.html "class in akka.http.scaladsl.marshalling")<T,​[RequestEntity](../model/RequestEntity.html "interface in akka.http.scaladsl.model")> m,
		                             akka.util.Timeout timeout,
		                             scala.concurrent.ExecutionContext ec)
		```
		- #### apply
		
		
		
		```
		public [HttpRequest](../model/HttpRequest.html "class in akka.http.scaladsl.model") apply​([Uri](../model/Uri.html "class in akka.http.scaladsl.model") uri,
		                         [RequestEntity](../model/RequestEntity.html "interface in akka.http.scaladsl.model") entity)
		```
		- #### method
		
		
		
		```
		public [HttpMethod](../model/HttpMethod.html "class in akka.http.scaladsl.model") method()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/client/RequestBuilding.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/client/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshalling/Marshaller.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpMethod.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpRequest.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/RequestEntity.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/Uri.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/client/RequestBuilding.RequestBuilder.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/client/RequestBuilding.RequestBuilder.html)*