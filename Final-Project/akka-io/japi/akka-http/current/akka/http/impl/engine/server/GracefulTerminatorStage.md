---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:33:08Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/server/GracefulTerminatorStage.html
title: GracefulTerminatorStage
---

# GracefulTerminatorStage

## Content

Package [akka.http.impl.engine.server](package-summary.html)
## Class GracefulTerminatorStage

- java.lang.Object
- - akka.stream.stage.GraphStageWithMaterializedValue\<akka.stream.BidiShape\<[HttpResponse](../../../scaladsl/model/HttpResponse.html "class in akka.http.scaladsl.model"),​[HttpResponse](../../../scaladsl/model/HttpResponse.html "class in akka.http.scaladsl.model"),​[HttpRequest](../../../scaladsl/model/HttpRequest.html "class in akka.http.scaladsl.model"),​[HttpRequest](../../../scaladsl/model/HttpRequest.html "class in akka.http.scaladsl.model")\>,​[ServerTerminator](ServerTerminator.html "interface in akka.http.impl.engine.server")\>
	- - akka.http.impl.engine.server.GracefulTerminatorStage

- All Implemented Interfaces:
`akka.stream.Graph<akka.stream.BidiShape<[HttpResponse](../../../scaladsl/model/HttpResponse.html "class in akka.http.scaladsl.model"),​[HttpResponse](../../../scaladsl/model/HttpResponse.html "class in akka.http.scaladsl.model"),​[HttpRequest](../../../scaladsl/model/HttpRequest.html "class in akka.http.scaladsl.model"),​[HttpRequest](../../../scaladsl/model/HttpRequest.html "class in akka.http.scaladsl.model")>,​[ServerTerminator](ServerTerminator.html "interface in akka.http.impl.engine.server")>`

---

```
public final class GracefulTerminatorStage
extends akka.stream.stage.GraphStageWithMaterializedValue<akka.stream.BidiShape<[HttpResponse](../../../scaladsl/model/HttpResponse.html "class in akka.http.scaladsl.model"),​[HttpResponse](../../../scaladsl/model/HttpResponse.html "class in akka.http.scaladsl.model"),​[HttpRequest](../../../scaladsl/model/HttpRequest.html "class in akka.http.scaladsl.model"),​[HttpRequest](../../../scaladsl/model/HttpRequest.html "class in akka.http.scaladsl.model")>,​[ServerTerminator](ServerTerminator.html "interface in akka.http.impl.engine.server")>
```

INTERNAL API: See detailed docs termination process on [`Http.ServerBinding`](../../../scaladsl/Http.ServerBinding.html "class in akka.http.scaladsl").
 
 Stage shape diagram:
 

```

                      +---+
 fromNet Request   -> | G | -> toUser Request
                      | T |
 toNet   Response  <- | S | <- fromUser Response
                      +---+
 
```

- - ### Nested Class Summary
	
	
	
	Nested Classes 
	| Modifier and Type | Class | Description |
	| `class` | `[GracefulTerminatorStage.ConnectionTerminator](GracefulTerminatorStage.ConnectionTerminator.html "class in akka.http.impl.engine.server")` |  |
	
	
		- ### Nested classes/interfaces inherited from interface akka.stream.Graph
		
		
		`akka.stream.Graph.GraphMapMatVal<S extends akka.stream.Shape,​M extends java.lang.Object>`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[GracefulTerminatorStage](#%3Cinit%3E(akka.http.scaladsl.settings.ServerSettings))​([ServerSettings](../../../scaladsl/settings/ServerSettings.html "class in akka.http.scaladsl.settings") settings)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static akka.stream.scaladsl.BidiFlow<[HttpResponse](../../../scaladsl/model/HttpResponse.html "class in akka.http.scaladsl.model"),​[HttpResponse](../../../scaladsl/model/HttpResponse.html "class in akka.http.scaladsl.model"),​[HttpRequest](../../../scaladsl/model/HttpRequest.html "class in akka.http.scaladsl.model"),​[HttpRequest](../../../scaladsl/model/HttpRequest.html "class in akka.http.scaladsl.model"),​[ServerTerminator](ServerTerminator.html "interface in akka.http.impl.engine.server")>` | `[apply](#apply(akka.actor.ActorSystem,akka.http.scaladsl.settings.ServerSettings))​(akka.actor.ActorSystem system,  [ServerSettings](../../../scaladsl/settings/ServerSettings.html "class in akka.http.scaladsl.settings") serverSettings)` |  |
	| `scala.Tuple2<akka.stream.stage.GraphStageLogic,​[ServerTerminator](ServerTerminator.html "interface in akka.http.impl.engine.server")>` | `[createLogicAndMaterializedValue](#createLogicAndMaterializedValue(akka.stream.Attributes))​(akka.stream.Attributes inheritedAttributes)` |  |
	| `akka.stream.Inlet<[HttpRequest](../../../scaladsl/model/HttpRequest.html "class in akka.http.scaladsl.model")>` | `[fromNet](#fromNet())()` |  |
	| `akka.stream.Inlet<[HttpResponse](../../../scaladsl/model/HttpResponse.html "class in akka.http.scaladsl.model")>` | `[fromUser](#fromUser())()` |  |
	| `akka.stream.BidiShape<[HttpResponse](../../../scaladsl/model/HttpResponse.html "class in akka.http.scaladsl.model"),​[HttpResponse](../../../scaladsl/model/HttpResponse.html "class in akka.http.scaladsl.model"),​[HttpRequest](../../../scaladsl/model/HttpRequest.html "class in akka.http.scaladsl.model"),​[HttpRequest](../../../scaladsl/model/HttpRequest.html "class in akka.http.scaladsl.model")>` | `[shape](#shape())()` |  |
	| `java.lang.String` | `[TerminationDeadlineTimerKey](#TerminationDeadlineTimerKey())()` |  |
	| `akka.stream.Outlet<[HttpResponse](../../../scaladsl/model/HttpResponse.html "class in akka.http.scaladsl.model")>` | `[toNet](#toNet())()` |  |
	| `akka.stream.Outlet<[HttpRequest](../../../scaladsl/model/HttpRequest.html "class in akka.http.scaladsl.model")>` | `[toUser](#toUser())()` |  |
	
	
		- ### Methods inherited from class akka.stream.stage.GraphStageWithMaterializedValue
		
		
		`addAttributes, async, async, async, createLogicAndMaterializedValue, getAttributes, initialAttributes, named, traversalBuilder, withAttributes`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### GracefulTerminatorStage
		
		
		
		```
		public GracefulTerminatorStage​([ServerSettings](../../../scaladsl/settings/ServerSettings.html "class in akka.http.scaladsl.settings") settings)
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static akka.stream.scaladsl.BidiFlow<[HttpResponse](../../../scaladsl/model/HttpResponse.html "class in akka.http.scaladsl.model"),​[HttpResponse](../../../scaladsl/model/HttpResponse.html "class in akka.http.scaladsl.model"),​[HttpRequest](../../../scaladsl/model/HttpRequest.html "class in akka.http.scaladsl.model"),​[HttpRequest](../../../scaladsl/model/HttpRequest.html "class in akka.http.scaladsl.model"),​[ServerTerminator](ServerTerminator.html "interface in akka.http.impl.engine.server")> apply​(akka.actor.ActorSystem system,
		                                                                                                                                              [ServerSettings](../../../scaladsl/settings/ServerSettings.html "class in akka.http.scaladsl.settings") serverSettings)
		```
		- #### fromNet
		
		
		
		```
		public akka.stream.Inlet<[HttpRequest](../../../scaladsl/model/HttpRequest.html "class in akka.http.scaladsl.model")> fromNet()
		```
		- #### toUser
		
		
		
		```
		public akka.stream.Outlet<[HttpRequest](../../../scaladsl/model/HttpRequest.html "class in akka.http.scaladsl.model")> toUser()
		```
		- #### fromUser
		
		
		
		```
		public akka.stream.Inlet<[HttpResponse](../../../scaladsl/model/HttpResponse.html "class in akka.http.scaladsl.model")> fromUser()
		```
		- #### toNet
		
		
		
		```
		public akka.stream.Outlet<[HttpResponse](../../../scaladsl/model/HttpResponse.html "class in akka.http.scaladsl.model")> toNet()
		```
		- #### shape
		
		
		
		```
		public akka.stream.BidiShape<[HttpResponse](../../../scaladsl/model/HttpResponse.html "class in akka.http.scaladsl.model"),​[HttpResponse](../../../scaladsl/model/HttpResponse.html "class in akka.http.scaladsl.model"),​[HttpRequest](../../../scaladsl/model/HttpRequest.html "class in akka.http.scaladsl.model"),​[HttpRequest](../../../scaladsl/model/HttpRequest.html "class in akka.http.scaladsl.model")> shape()
		```
		- #### TerminationDeadlineTimerKey
		
		
		
		```
		public final java.lang.String TerminationDeadlineTimerKey()
		```
		- #### createLogicAndMaterializedValue
		
		
		
		```
		public scala.Tuple2<akka.stream.stage.GraphStageLogic,​[ServerTerminator](ServerTerminator.html "interface in akka.http.impl.engine.server")> createLogicAndMaterializedValue​(akka.stream.Attributes inheritedAttributes)
		```
		
		
		Specified by:
		`createLogicAndMaterializedValue` in class `akka.stream.stage.GraphStageWithMaterializedValue<akka.stream.BidiShape<[HttpResponse](../../../scaladsl/model/HttpResponse.html "class in akka.http.scaladsl.model"),​[HttpResponse](../../../scaladsl/model/HttpResponse.html "class in akka.http.scaladsl.model"),​[HttpRequest](../../../scaladsl/model/HttpRequest.html "class in akka.http.scaladsl.model"),​[HttpRequest](../../../scaladsl/model/HttpRequest.html "class in akka.http.scaladsl.model")>,​[ServerTerminator](ServerTerminator.html "interface in akka.http.impl.engine.server")>`

## Code Examples

### Example 1: Class GracefulTerminatorStage

```text
+---+
 fromNet Request   -> | G | -> toUser Request
                      | T |
 toNet   Response  <- | S | <- fromUser Response
                      +---+
```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/server/GracefulTerminatorStage.ConnectionTerminator.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/server/ServerTerminator.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/server/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/Http.ServerBinding.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpRequest.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpResponse.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/settings/ServerSettings.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/server/GracefulTerminatorStage.html](https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/server/GracefulTerminatorStage.html)*