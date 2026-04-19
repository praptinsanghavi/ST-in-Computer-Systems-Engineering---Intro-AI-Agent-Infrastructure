---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:42:23Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/testkit/RouteTestResultComponent.RouteTestResult.html
title: RouteTestResultComponent.RouteTestResult
---

# RouteTestResultComponent.RouteTestResult

## Content

Package [akka.http.scaladsl.testkit](package-summary.html)
## Class RouteTestResultComponent.RouteTestResult

- java.lang.Object
- - akka.http.scaladsl.testkit.RouteTestResultComponent.RouteTestResult

- Enclosing interface:
[RouteTestResultComponent](RouteTestResultComponent.html "interface in akka.http.scaladsl.testkit")

---

```
public static class RouteTestResultComponent.RouteTestResult
extends java.lang.Object
```

A receptacle for the response or rejections created by a route.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[RouteTestResult](#%3Cinit%3E(scala.concurrent.duration.FiniteDuration,akka.stream.Materializer))​(scala.concurrent.duration.FiniteDuration timeout,  akka.stream.Materializer fm)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[RouteTestResultComponent.RouteTestResult](RouteTestResultComponent.RouteTestResult.html "class in akka.http.scaladsl.testkit")` | `[awaitResult](#awaitResult())()` |  |
	| `scala.collection.immutable.Seq<[HttpEntity.ChunkStreamPart](../model/HttpEntity.ChunkStreamPart.html "class in akka.http.scaladsl.model")>` | `[chunks](#chunks())()` |  |
	| `akka.stream.scaladsl.Source<[HttpEntity.ChunkStreamPart](../model/HttpEntity.ChunkStreamPart.html "class in akka.http.scaladsl.model"),​java.lang.Object>` | `[chunksStream](#chunksStream())()` |  |
	| `[ResponseEntity](../model/ResponseEntity.html "interface in akka.http.scaladsl.model")` | `[entity](#entity())()` | Returns a "fresh" entity with a "fresh" unconsumed byte\- or chunk stream (if not strict) |
	| `boolean` | `[handled](#handled())()` |  |
	| `void` | `[handleResponse](#handleResponse(akka.http.scaladsl.model.HttpResponse))​([HttpResponse](../model/HttpResponse.html "class in akka.http.scaladsl.model") r)` |  |
	| `void` | `[handleResult](#handleResult(akka.http.scaladsl.server.RouteResult))​([RouteResult](../server/RouteResult.html "interface in akka.http.scaladsl.server") rr)` |  |
	| `[HttpResponse](../model/HttpResponse.html "class in akka.http.scaladsl.model")` | `[rawResponse](#rawResponse())()` |  |
	| `scala.collection.immutable.Seq<[Rejection](../server/Rejection.html "interface in akka.http.scaladsl.server")>` | `[rejections](#rejections())()` |  |
	| `[HttpResponse](../model/HttpResponse.html "class in akka.http.scaladsl.model")` | `[response](#response())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### RouteTestResult
		
		
		
		```
		public RouteTestResult​(scala.concurrent.duration.FiniteDuration timeout,
		                       akka.stream.Materializer fm)
		```

	- ### Method Detail
	
	
	
		- #### awaitResult
		
		
		
		```
		public [RouteTestResultComponent.RouteTestResult](RouteTestResultComponent.RouteTestResult.html "class in akka.http.scaladsl.testkit") awaitResult()
		```
		- #### chunks
		
		
		
		```
		public scala.collection.immutable.Seq<[HttpEntity.ChunkStreamPart](../model/HttpEntity.ChunkStreamPart.html "class in akka.http.scaladsl.model")> chunks()
		```
		- #### chunksStream
		
		
		
		```
		public akka.stream.scaladsl.Source<[HttpEntity.ChunkStreamPart](../model/HttpEntity.ChunkStreamPart.html "class in akka.http.scaladsl.model"),​java.lang.Object> chunksStream()
		```
		- #### entity
		
		
		
		```
		public [ResponseEntity](../model/ResponseEntity.html "interface in akka.http.scaladsl.model") entity()
		```
		
		Returns a "fresh" entity with a "fresh" unconsumed byte\- or chunk stream (if not strict)
		- #### handleResponse
		
		
		
		```
		public void handleResponse​([HttpResponse](../model/HttpResponse.html "class in akka.http.scaladsl.model") r)
		```
		- #### handleResult
		
		
		
		```
		public void handleResult​([RouteResult](../server/RouteResult.html "interface in akka.http.scaladsl.server") rr)
		```
		- #### handled
		
		
		
		```
		public boolean handled()
		```
		- #### rawResponse
		
		
		
		```
		public [HttpResponse](../model/HttpResponse.html "class in akka.http.scaladsl.model") rawResponse()
		```
		- #### rejections
		
		
		
		```
		public scala.collection.immutable.Seq<[Rejection](../server/Rejection.html "interface in akka.http.scaladsl.server")> rejections()
		```
		- #### response
		
		
		
		```
		public [HttpResponse](../model/HttpResponse.html "class in akka.http.scaladsl.model") response()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpEntity.ChunkStreamPart.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpResponse.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ResponseEntity.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/Rejection.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/RouteResult.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/testkit/RouteTestResultComponent.RouteTestResult.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/testkit/RouteTestResultComponent.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/testkit/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/testkit/RouteTestResultComponent.RouteTestResult.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/testkit/RouteTestResultComponent.RouteTestResult.html)*