---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:32:31Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/parsing/HttpRequestParser.html
title: HttpRequestParser
---

# HttpRequestParser

## Content

Package [akka.http.impl.engine.parsing](package-summary.html)
## Class HttpRequestParser

- java.lang.Object
- - akka.stream.stage.GraphStageWithMaterializedValue\<S,​akka.NotUsed\>
	- - akka.stream.stage.GraphStage\<akka.stream.FlowShape\<akka.stream.TLSProtocol.SessionBytes,​[ParserOutput.RequestOutput](ParserOutput.RequestOutput.html "interface in akka.http.impl.engine.parsing")\>\>
		- - akka.http.impl.engine.parsing.HttpRequestParser

- All Implemented Interfaces:
`akka.stream.Graph<akka.stream.FlowShape<akka.stream.TLSProtocol.SessionBytes,​[ParserOutput.RequestOutput](ParserOutput.RequestOutput.html "interface in akka.http.impl.engine.parsing")>,​akka.NotUsed>`

---

```
public final class HttpRequestParser
extends akka.stream.stage.GraphStage<akka.stream.FlowShape<akka.stream.TLSProtocol.SessionBytes,​[ParserOutput.RequestOutput](ParserOutput.RequestOutput.html "interface in akka.http.impl.engine.parsing")>>
```

INTERNAL API

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface akka.stream.Graph
		
		
		`akka.stream.Graph.GraphMapMatVal<S extends akka.stream.Shape,​M extends java.lang.Object>`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[HttpRequestParser](#%3Cinit%3E(akka.http.scaladsl.settings.ParserSettings,akka.http.scaladsl.settings.WebSocketSettings,boolean,akka.http.impl.engine.parsing.HttpHeaderParser))​([ParserSettings](../../../scaladsl/settings/ParserSettings.html "class in akka.http.scaladsl.settings") settings,  [WebSocketSettings](../../../scaladsl/settings/WebSocketSettings.html "class in akka.http.scaladsl.settings") websocketSettings,  boolean rawRequestUriHeader,  [HttpHeaderParser](HttpHeaderParser.html "class in akka.http.impl.engine.parsing") headerParser)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `akka.stream.stage.GraphStageLogic` | `[createLogic](#createLogic(akka.stream.Attributes))​(akka.stream.Attributes inheritedAttributes)` |  |
	| `akka.stream.Inlet<akka.stream.TLSProtocol.SessionBytes>` | `[in](#in())()` |  |
	| `protected akka.stream.Attributes` | `[initialAttributes](#initialAttributes())()` |  |
	| `akka.stream.Outlet<[ParserOutput.RequestOutput](ParserOutput.RequestOutput.html "interface in akka.http.impl.engine.parsing")>` | `[out](#out())()` |  |
	| `akka.stream.FlowShape<akka.stream.TLSProtocol.SessionBytes,​[ParserOutput.RequestOutput](ParserOutput.RequestOutput.html "interface in akka.http.impl.engine.parsing")>` | `[shape](#shape())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	
	
		- ### Methods inherited from class akka.stream.stage.GraphStage
		
		
		`createLogicAndMaterializedValue`
		- ### Methods inherited from class akka.stream.stage.GraphStageWithMaterializedValue
		
		
		`addAttributes, async, async, async, createLogicAndMaterializedValue, getAttributes, named, traversalBuilder, withAttributes`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### HttpRequestParser
		
		
		
		```
		public HttpRequestParser​([ParserSettings](../../../scaladsl/settings/ParserSettings.html "class in akka.http.scaladsl.settings") settings,
		                         [WebSocketSettings](../../../scaladsl/settings/WebSocketSettings.html "class in akka.http.scaladsl.settings") websocketSettings,
		                         boolean rawRequestUriHeader,
		                         [HttpHeaderParser](HttpHeaderParser.html "class in akka.http.impl.engine.parsing") headerParser)
		```

	- ### Method Detail
	
	
	
		- #### createLogic
		
		
		
		```
		public akka.stream.stage.GraphStageLogic createLogic​(akka.stream.Attributes inheritedAttributes)
		```
		
		
		Specified by:
		`createLogic` in class `akka.stream.stage.GraphStage<akka.stream.FlowShape<akka.stream.TLSProtocol.SessionBytes,​[ParserOutput.RequestOutput](ParserOutput.RequestOutput.html "interface in akka.http.impl.engine.parsing")>>`
		- #### in
		
		
		
		```
		public akka.stream.Inlet<akka.stream.TLSProtocol.SessionBytes> in()
		```
		- #### initialAttributes
		
		
		
		```
		protected akka.stream.Attributes initialAttributes()
		```
		
		
		Overrides:
		`initialAttributes` in class `akka.stream.stage.GraphStageWithMaterializedValue<akka.stream.FlowShape<akka.stream.TLSProtocol.SessionBytes,​[ParserOutput.RequestOutput](ParserOutput.RequestOutput.html "interface in akka.http.impl.engine.parsing")>,​akka.NotUsed>`
		- #### out
		
		
		
		```
		public akka.stream.Outlet<[ParserOutput.RequestOutput](ParserOutput.RequestOutput.html "interface in akka.http.impl.engine.parsing")> out()
		```
		- #### shape
		
		
		
		```
		public akka.stream.FlowShape<akka.stream.TLSProtocol.SessionBytes,​[ParserOutput.RequestOutput](ParserOutput.RequestOutput.html "interface in akka.http.impl.engine.parsing")> shape()
		```
		- #### toString
		
		
		
		```
		public java.lang.String toString()
		```
		
		
		Overrides:
		`toString` in class `java.lang.Object`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/parsing/HttpHeaderParser.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/parsing/ParserOutput.RequestOutput.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/parsing/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/settings/ParserSettings.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/settings/WebSocketSettings.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/parsing/HttpRequestParser.html](https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/parsing/HttpRequestParser.html)*