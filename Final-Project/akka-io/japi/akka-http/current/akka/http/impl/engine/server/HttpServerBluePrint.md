---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:33:14Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/server/HttpServerBluePrint.PrepareRequests.html
title: HttpServerBluePrint.PrepareRequests
---

# HttpServerBluePrint.PrepareRequests

## Content

Package [akka.http.impl.engine.server](package-summary.html)
## Class HttpServerBluePrint.PrepareRequests

- java.lang.Object
- - akka.stream.stage.GraphStageWithMaterializedValue\<S,​akka.NotUsed\>
	- - akka.stream.stage.GraphStage\<akka.stream.FlowShape\<[ParserOutput.RequestOutput](../parsing/ParserOutput.RequestOutput.html "interface in akka.http.impl.engine.parsing"),​[HttpRequest](../../../scaladsl/model/HttpRequest.html "class in akka.http.scaladsl.model")\>\>
		- - akka.http.impl.engine.server.HttpServerBluePrint.PrepareRequests

- All Implemented Interfaces:
`akka.stream.Graph<akka.stream.FlowShape<[ParserOutput.RequestOutput](../parsing/ParserOutput.RequestOutput.html "interface in akka.http.impl.engine.parsing"),​[HttpRequest](../../../scaladsl/model/HttpRequest.html "class in akka.http.scaladsl.model")>,​akka.NotUsed>`

Enclosing class:
[HttpServerBluePrint](HttpServerBluePrint.html "class in akka.http.impl.engine.server")

---

```
public static final class HttpServerBluePrint.PrepareRequests
extends akka.stream.stage.GraphStage<akka.stream.FlowShape<[ParserOutput.RequestOutput](../parsing/ParserOutput.RequestOutput.html "interface in akka.http.impl.engine.parsing"),​[HttpRequest](../../../scaladsl/model/HttpRequest.html "class in akka.http.scaladsl.model")>>
```

Two state stage, either transforms an incoming RequestOutput into a HttpRequest with strict entity and then pushes
 that (the "idle" inHandler) or creates a HttpRequest with a streamed entity and switch to a state which will push
 incoming chunks into the streaming entity until end of request is reached (the StreamedEntityCreator case in create
 entity).

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface akka.stream.Graph
		
		
		`akka.stream.Graph.GraphMapMatVal<S extends akka.stream.Shape,​M extends java.lang.Object>`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[PrepareRequests](#%3Cinit%3E(akka.http.scaladsl.settings.ServerSettings))​([ServerSettings](../../../scaladsl/settings/ServerSettings.html "class in akka.http.scaladsl.settings") settings)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `akka.stream.stage.GraphStageLogic` | `[createLogic](#createLogic(akka.stream.Attributes))​(akka.stream.Attributes inheritedAttributes)` |  |
	| `akka.stream.Inlet<[ParserOutput.RequestOutput](../parsing/ParserOutput.RequestOutput.html "interface in akka.http.impl.engine.parsing")>` | `[in](#in())()` |  |
	| `akka.stream.Outlet<[HttpRequest](../../../scaladsl/model/HttpRequest.html "class in akka.http.scaladsl.model")>` | `[out](#out())()` |  |
	| `akka.stream.FlowShape<[ParserOutput.RequestOutput](../parsing/ParserOutput.RequestOutput.html "interface in akka.http.impl.engine.parsing"),​[HttpRequest](../../../scaladsl/model/HttpRequest.html "class in akka.http.scaladsl.model")>` | `[shape](#shape())()` |  |
	
	
		- ### Methods inherited from class akka.stream.stage.GraphStage
		
		
		`createLogicAndMaterializedValue`
		- ### Methods inherited from class akka.stream.stage.GraphStageWithMaterializedValue
		
		
		`addAttributes, async, async, async, createLogicAndMaterializedValue, getAttributes, initialAttributes, named, traversalBuilder, withAttributes`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### PrepareRequests
		
		
		
		```
		public PrepareRequests​([ServerSettings](../../../scaladsl/settings/ServerSettings.html "class in akka.http.scaladsl.settings") settings)
		```

	- ### Method Detail
	
	
	
		- #### createLogic
		
		
		
		```
		public akka.stream.stage.GraphStageLogic createLogic​(akka.stream.Attributes inheritedAttributes)
		```
		
		
		Specified by:
		`createLogic` in class `akka.stream.stage.GraphStage<akka.stream.FlowShape<[ParserOutput.RequestOutput](../parsing/ParserOutput.RequestOutput.html "interface in akka.http.impl.engine.parsing"),​[HttpRequest](../../../scaladsl/model/HttpRequest.html "class in akka.http.scaladsl.model")>>`
		- #### in
		
		
		
		```
		public akka.stream.Inlet<[ParserOutput.RequestOutput](../parsing/ParserOutput.RequestOutput.html "interface in akka.http.impl.engine.parsing")> in()
		```
		- #### out
		
		
		
		```
		public akka.stream.Outlet<[HttpRequest](../../../scaladsl/model/HttpRequest.html "class in akka.http.scaladsl.model")> out()
		```
		- #### shape
		
		
		
		```
		public akka.stream.FlowShape<[ParserOutput.RequestOutput](../parsing/ParserOutput.RequestOutput.html "interface in akka.http.impl.engine.parsing"),​[HttpRequest](../../../scaladsl/model/HttpRequest.html "class in akka.http.scaladsl.model")> shape()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/parsing/ParserOutput.RequestOutput.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/server/HttpServerBluePrint.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/server/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpRequest.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/settings/ServerSettings.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/server/HttpServerBluePrint.PrepareRequests.html](https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/server/HttpServerBluePrint.PrepareRequests.html)*