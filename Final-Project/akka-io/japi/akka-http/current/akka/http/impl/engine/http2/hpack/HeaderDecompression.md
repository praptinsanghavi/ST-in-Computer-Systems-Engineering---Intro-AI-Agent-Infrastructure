---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:32:06Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/hpack/HeaderDecompression.html
title: HeaderDecompression
---

# HeaderDecompression

## Content

Package [akka.http.impl.engine.http2\.hpack](package-summary.html)
## Class HeaderDecompression

- java.lang.Object
- - akka.stream.stage.GraphStageWithMaterializedValue\<S,​akka.NotUsed\>
	- - akka.stream.stage.GraphStage\<akka.stream.FlowShape\<[FrameEvent](../FrameEvent.html "interface in akka.http.impl.engine.http2"),​[FrameEvent](../FrameEvent.html "interface in akka.http.impl.engine.http2")\>\>
		- - akka.http.impl.engine.http2\.hpack.HeaderDecompression

- All Implemented Interfaces:
`akka.stream.Graph<akka.stream.FlowShape<[FrameEvent](../FrameEvent.html "interface in akka.http.impl.engine.http2"),​[FrameEvent](../FrameEvent.html "interface in akka.http.impl.engine.http2")>,​akka.NotUsed>`

---

```
public final class HeaderDecompression
extends akka.stream.stage.GraphStage<akka.stream.FlowShape<[FrameEvent](../FrameEvent.html "interface in akka.http.impl.engine.http2"),​[FrameEvent](../FrameEvent.html "interface in akka.http.impl.engine.http2")>>
```

INTERNAL API
 
 Can be used on server and client side.

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface akka.stream.Graph
		
		
		`akka.stream.Graph.GraphMapMatVal<S extends akka.stream.Shape,​M extends java.lang.Object>`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[HeaderDecompression](#%3Cinit%3E(akka.http.impl.engine.parsing.HttpHeaderParser,akka.http.scaladsl.settings.ParserSettings))​([HttpHeaderParser](../../parsing/HttpHeaderParser.html "class in akka.http.impl.engine.parsing") masterHeaderParser,  [ParserSettings](../../../../scaladsl/settings/ParserSettings.html "class in akka.http.scaladsl.settings") parserSettings)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `akka.stream.stage.GraphStageLogic` | `[createLogic](#createLogic(akka.stream.Attributes))​(akka.stream.Attributes inheritedAttributes)` |  |
	| `akka.stream.Inlet<[FrameEvent](../FrameEvent.html "interface in akka.http.impl.engine.http2")>` | `[eventsIn](#eventsIn())()` |  |
	| `akka.stream.Outlet<[FrameEvent](../FrameEvent.html "interface in akka.http.impl.engine.http2")>` | `[eventsOut](#eventsOut())()` |  |
	| `akka.stream.FlowShape<[FrameEvent](../FrameEvent.html "interface in akka.http.impl.engine.http2"),​[FrameEvent](../FrameEvent.html "interface in akka.http.impl.engine.http2")>` | `[shape](#shape())()` |  |
	| `java.nio.charset.Charset` | `[US_ASCII](#US_ASCII())()` |  |
	| `java.nio.charset.Charset` | `[UTF8](#UTF8())()` |  |
	
	
		- ### Methods inherited from class akka.stream.stage.GraphStage
		
		
		`createLogicAndMaterializedValue`
		- ### Methods inherited from class akka.stream.stage.GraphStageWithMaterializedValue
		
		
		`addAttributes, async, async, async, createLogicAndMaterializedValue, getAttributes, initialAttributes, named, traversalBuilder, withAttributes`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### HeaderDecompression
		
		
		
		```
		public HeaderDecompression​([HttpHeaderParser](../../parsing/HttpHeaderParser.html "class in akka.http.impl.engine.parsing") masterHeaderParser,
		                           [ParserSettings](../../../../scaladsl/settings/ParserSettings.html "class in akka.http.scaladsl.settings") parserSettings)
		```

	- ### Method Detail
	
	
	
		- #### US\_ASCII
		
		
		
		```
		public java.nio.charset.Charset US_ASCII()
		```
		- #### UTF8
		
		
		
		```
		public java.nio.charset.Charset UTF8()
		```
		- #### createLogic
		
		
		
		```
		public akka.stream.stage.GraphStageLogic createLogic​(akka.stream.Attributes inheritedAttributes)
		```
		
		
		Specified by:
		`createLogic` in class `akka.stream.stage.GraphStage<akka.stream.FlowShape<[FrameEvent](../FrameEvent.html "interface in akka.http.impl.engine.http2"),​[FrameEvent](../FrameEvent.html "interface in akka.http.impl.engine.http2")>>`
		- #### eventsIn
		
		
		
		```
		public akka.stream.Inlet<[FrameEvent](../FrameEvent.html "interface in akka.http.impl.engine.http2")> eventsIn()
		```
		- #### eventsOut
		
		
		
		```
		public akka.stream.Outlet<[FrameEvent](../FrameEvent.html "interface in akka.http.impl.engine.http2")> eventsOut()
		```
		- #### shape
		
		
		
		```
		public akka.stream.FlowShape<[FrameEvent](../FrameEvent.html "interface in akka.http.impl.engine.http2"),​[FrameEvent](../FrameEvent.html "interface in akka.http.impl.engine.http2")> shape()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/FrameEvent.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/hpack/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/parsing/HttpHeaderParser.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/settings/ParserSettings.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/hpack/HeaderDecompression.html](https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/hpack/HeaderDecompression.html)*