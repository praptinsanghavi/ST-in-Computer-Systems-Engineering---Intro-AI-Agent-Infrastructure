---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:31:53Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/RequestErrorFlow.html
title: RequestErrorFlow
---

# RequestErrorFlow

## Content

Package [akka.http.impl.engine.http2](package-summary.html)
## Class RequestErrorFlow

- java.lang.Object
- - akka.stream.stage.GraphStageWithMaterializedValue\<S,​akka.NotUsed\>
	- - akka.stream.stage.GraphStage\<akka.stream.BidiShape\<[HttpResponse](../../../scaladsl/model/HttpResponse.html "class in akka.http.scaladsl.model"),​[HttpResponse](../../../scaladsl/model/HttpResponse.html "class in akka.http.scaladsl.model"),​[RequestParsing.ParseRequestResult](RequestParsing.ParseRequestResult.html "interface in akka.http.impl.engine.http2"),​[HttpRequest](../../../scaladsl/model/HttpRequest.html "class in akka.http.scaladsl.model")\>\>
		- - akka.http.impl.engine.http2\.RequestErrorFlow

- All Implemented Interfaces:
`akka.stream.Graph<akka.stream.BidiShape<[HttpResponse](../../../scaladsl/model/HttpResponse.html "class in akka.http.scaladsl.model"),​[HttpResponse](../../../scaladsl/model/HttpResponse.html "class in akka.http.scaladsl.model"),​[RequestParsing.ParseRequestResult](RequestParsing.ParseRequestResult.html "interface in akka.http.impl.engine.http2"),​[HttpRequest](../../../scaladsl/model/HttpRequest.html "class in akka.http.scaladsl.model")>,​akka.NotUsed>`

---

```
public final class RequestErrorFlow
extends akka.stream.stage.GraphStage<akka.stream.BidiShape<[HttpResponse](../../../scaladsl/model/HttpResponse.html "class in akka.http.scaladsl.model"),​[HttpResponse](../../../scaladsl/model/HttpResponse.html "class in akka.http.scaladsl.model"),​[RequestParsing.ParseRequestResult](RequestParsing.ParseRequestResult.html "interface in akka.http.impl.engine.http2"),​[HttpRequest](../../../scaladsl/model/HttpRequest.html "class in akka.http.scaladsl.model")>>
```

INTERNAL API

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface akka.stream.Graph
		
		
		`akka.stream.Graph.GraphMapMatVal<S extends akka.stream.Shape,​M extends java.lang.Object>`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[RequestErrorFlow](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static akka.stream.scaladsl.BidiFlow<[HttpResponse](../../../scaladsl/model/HttpResponse.html "class in akka.http.scaladsl.model"),​[HttpResponse](../../../scaladsl/model/HttpResponse.html "class in akka.http.scaladsl.model"),​[RequestParsing.ParseRequestResult](RequestParsing.ParseRequestResult.html "interface in akka.http.impl.engine.http2"),​[HttpRequest](../../../scaladsl/model/HttpRequest.html "class in akka.http.scaladsl.model"),​akka.NotUsed>` | `[apply](#apply())()` |  |
	| `akka.stream.stage.GraphStageLogic` | `[createLogic](#createLogic(akka.stream.Attributes))​(akka.stream.Attributes inheritedAttributes)` |  |
	| `akka.stream.Inlet<[RequestParsing.ParseRequestResult](RequestParsing.ParseRequestResult.html "interface in akka.http.impl.engine.http2")>` | `[requestIn](#requestIn())()` |  |
	| `akka.stream.Outlet<[HttpRequest](../../../scaladsl/model/HttpRequest.html "class in akka.http.scaladsl.model")>` | `[requestOut](#requestOut())()` |  |
	| `akka.stream.Inlet<[HttpResponse](../../../scaladsl/model/HttpResponse.html "class in akka.http.scaladsl.model")>` | `[responseIn](#responseIn())()` |  |
	| `akka.stream.Outlet<[HttpResponse](../../../scaladsl/model/HttpResponse.html "class in akka.http.scaladsl.model")>` | `[responseOut](#responseOut())()` |  |
	| `akka.stream.BidiShape<[HttpResponse](../../../scaladsl/model/HttpResponse.html "class in akka.http.scaladsl.model"),​[HttpResponse](../../../scaladsl/model/HttpResponse.html "class in akka.http.scaladsl.model"),​[RequestParsing.ParseRequestResult](RequestParsing.ParseRequestResult.html "interface in akka.http.impl.engine.http2"),​[HttpRequest](../../../scaladsl/model/HttpRequest.html "class in akka.http.scaladsl.model")>` | `[shape](#shape())()` |  |
	
	
		- ### Methods inherited from class akka.stream.stage.GraphStage
		
		
		`createLogicAndMaterializedValue`
		- ### Methods inherited from class akka.stream.stage.GraphStageWithMaterializedValue
		
		
		`addAttributes, async, async, async, createLogicAndMaterializedValue, getAttributes, initialAttributes, named, traversalBuilder, withAttributes`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### RequestErrorFlow
		
		
		
		```
		public RequestErrorFlow()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static akka.stream.scaladsl.BidiFlow<[HttpResponse](../../../scaladsl/model/HttpResponse.html "class in akka.http.scaladsl.model"),​[HttpResponse](../../../scaladsl/model/HttpResponse.html "class in akka.http.scaladsl.model"),​[RequestParsing.ParseRequestResult](RequestParsing.ParseRequestResult.html "interface in akka.http.impl.engine.http2"),​[HttpRequest](../../../scaladsl/model/HttpRequest.html "class in akka.http.scaladsl.model"),​akka.NotUsed> apply()
		```
		- #### requestIn
		
		
		
		```
		public akka.stream.Inlet<[RequestParsing.ParseRequestResult](RequestParsing.ParseRequestResult.html "interface in akka.http.impl.engine.http2")> requestIn()
		```
		- #### requestOut
		
		
		
		```
		public akka.stream.Outlet<[HttpRequest](../../../scaladsl/model/HttpRequest.html "class in akka.http.scaladsl.model")> requestOut()
		```
		- #### responseIn
		
		
		
		```
		public akka.stream.Inlet<[HttpResponse](../../../scaladsl/model/HttpResponse.html "class in akka.http.scaladsl.model")> responseIn()
		```
		- #### responseOut
		
		
		
		```
		public akka.stream.Outlet<[HttpResponse](../../../scaladsl/model/HttpResponse.html "class in akka.http.scaladsl.model")> responseOut()
		```
		- #### shape
		
		
		
		```
		public akka.stream.BidiShape<[HttpResponse](../../../scaladsl/model/HttpResponse.html "class in akka.http.scaladsl.model"),​[HttpResponse](../../../scaladsl/model/HttpResponse.html "class in akka.http.scaladsl.model"),​[RequestParsing.ParseRequestResult](RequestParsing.ParseRequestResult.html "interface in akka.http.impl.engine.http2"),​[HttpRequest](../../../scaladsl/model/HttpRequest.html "class in akka.http.scaladsl.model")> shape()
		```
		- #### createLogic
		
		
		
		```
		public akka.stream.stage.GraphStageLogic createLogic​(akka.stream.Attributes inheritedAttributes)
		```
		
		
		Specified by:
		`createLogic` in class `akka.stream.stage.GraphStage<akka.stream.BidiShape<[HttpResponse](../../../scaladsl/model/HttpResponse.html "class in akka.http.scaladsl.model"),​[HttpResponse](../../../scaladsl/model/HttpResponse.html "class in akka.http.scaladsl.model"),​[RequestParsing.ParseRequestResult](RequestParsing.ParseRequestResult.html "interface in akka.http.impl.engine.http2"),​[HttpRequest](../../../scaladsl/model/HttpRequest.html "class in akka.http.scaladsl.model")>>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/RequestParsing.ParseRequestResult.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpRequest.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpResponse.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/RequestErrorFlow.html](https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/RequestErrorFlow.html)*