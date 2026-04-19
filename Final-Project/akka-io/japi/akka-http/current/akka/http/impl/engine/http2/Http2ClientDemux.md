---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:31:04Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/Http2ClientDemux.html
title: Http2ClientDemux
---

# Http2ClientDemux

## Content

Package [akka.http.impl.engine.http2](package-summary.html)
## Class Http2ClientDemux

- java.lang.Object
- - akka.stream.stage.GraphStageWithMaterializedValue\<akka.stream.BidiShape\<[Http2SubStream](Http2SubStream.html "class in akka.http.impl.engine.http2"),​[FrameEvent](FrameEvent.html "interface in akka.http.impl.engine.http2"),​[FrameEvent](FrameEvent.html "interface in akka.http.impl.engine.http2"),​[Http2SubStream](Http2SubStream.html "class in akka.http.impl.engine.http2")\>,​[ServerTerminator](../server/ServerTerminator.html "interface in akka.http.impl.engine.server")\>
	- - [akka.http.impl.engine.http2\.Http2Demux](Http2Demux.html "class in akka.http.impl.engine.http2")
		- - akka.http.impl.engine.http2\.Http2ClientDemux

- All Implemented Interfaces:
`akka.stream.Graph<akka.stream.BidiShape<[Http2SubStream](Http2SubStream.html "class in akka.http.impl.engine.http2"),​[FrameEvent](FrameEvent.html "interface in akka.http.impl.engine.http2"),​[FrameEvent](FrameEvent.html "interface in akka.http.impl.engine.http2"),​[Http2SubStream](Http2SubStream.html "class in akka.http.impl.engine.http2")>,​[ServerTerminator](../server/ServerTerminator.html "interface in akka.http.impl.engine.server")>`

---

```
public class Http2ClientDemux
extends [Http2Demux](Http2Demux.html "class in akka.http.impl.engine.http2")
```

INTERNAL API

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from class akka.http.impl.engine.http2\.[Http2Demux](Http2Demux.html "class in akka.http.impl.engine.http2")
		
		
		`[Http2Demux.CompletionTimeout$](Http2Demux.CompletionTimeout$.html "class in akka.http.impl.engine.http2"), [Http2Demux.GoAwayGracePeriod$](Http2Demux.GoAwayGracePeriod$.html "class in akka.http.impl.engine.http2")`
		- ### Nested classes/interfaces inherited from interface akka.stream.Graph
		
		
		`akka.stream.Graph.GraphMapMatVal<S extends akka.stream.Shape,​M extends java.lang.Object>`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Http2ClientDemux](#%3Cinit%3E(akka.http.scaladsl.settings.Http2ClientSettings,akka.http.impl.engine.parsing.HttpHeaderParser))​([Http2ClientSettings](../../../scaladsl/settings/Http2ClientSettings.html "interface in akka.http.scaladsl.settings") http2Settings,  [HttpHeaderParser](../parsing/HttpHeaderParser.html "class in akka.http.impl.engine.parsing") masterHttpHeaderParser)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `scala.concurrent.duration.FiniteDuration` | `[completionTimeout](#completionTimeout())()` |  |
	| `scala.Option<[HttpEntity.ChunkStreamPart](../../../scaladsl/model/HttpEntity.ChunkStreamPart.html "class in akka.http.scaladsl.model")>` | `[wrapTrailingHeaders](#wrapTrailingHeaders(akka.http.impl.engine.http2.FrameEvent.ParsedHeadersFrame))​([FrameEvent.ParsedHeadersFrame](FrameEvent.ParsedHeadersFrame.html "class in akka.http.impl.engine.http2") headers)` |  |
	
	
		- ### Methods inherited from class akka.http.impl.engine.http2\.[Http2Demux](Http2Demux.html "class in akka.http.impl.engine.http2")
		
		
		`[createLogicAndMaterializedValue](Http2Demux.html#createLogicAndMaterializedValue(akka.stream.Attributes)), [frameIn](Http2Demux.html#frameIn()), [frameOut](Http2Demux.html#frameOut()), [shape](Http2Demux.html#shape()), [streamFailureLogOverride](Http2Demux.html#streamFailureLogOverride()), [substreamIn](Http2Demux.html#substreamIn()), [substreamOut](Http2Demux.html#substreamOut())`
		- ### Methods inherited from class akka.stream.stage.GraphStageWithMaterializedValue
		
		
		`addAttributes, async, async, async, createLogicAndMaterializedValue, getAttributes, initialAttributes, named, traversalBuilder, withAttributes`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### Http2ClientDemux
		
		
		
		```
		public Http2ClientDemux​([Http2ClientSettings](../../../scaladsl/settings/Http2ClientSettings.html "interface in akka.http.scaladsl.settings") http2Settings,
		                        [HttpHeaderParser](../parsing/HttpHeaderParser.html "class in akka.http.impl.engine.parsing") masterHttpHeaderParser)
		```

	- ### Method Detail
	
	
	
		- #### completionTimeout
		
		
		
		```
		public scala.concurrent.duration.FiniteDuration completionTimeout()
		```
		
		
		Specified by:
		`[completionTimeout](Http2Demux.html#completionTimeout())` in class `[Http2Demux](Http2Demux.html "class in akka.http.impl.engine.http2")`
		- #### wrapTrailingHeaders
		
		
		
		```
		public scala.Option<[HttpEntity.ChunkStreamPart](../../../scaladsl/model/HttpEntity.ChunkStreamPart.html "class in akka.http.scaladsl.model")> wrapTrailingHeaders​([FrameEvent.ParsedHeadersFrame](FrameEvent.ParsedHeadersFrame.html "class in akka.http.impl.engine.http2") headers)
		```
		
		
		Specified by:
		`[wrapTrailingHeaders](Http2Demux.html#wrapTrailingHeaders(akka.http.impl.engine.http2.FrameEvent.ParsedHeadersFrame))` in class `[Http2Demux](Http2Demux.html "class in akka.http.impl.engine.http2")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/FrameEvent.ParsedHeadersFrame.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/FrameEvent.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/Http2Demux.CompletionTimeout$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/Http2Demux.GoAwayGracePeriod$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/Http2Demux.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/Http2SubStream.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/parsing/HttpHeaderParser.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/server/ServerTerminator.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpEntity.ChunkStreamPart.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/settings/Http2ClientSettings.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/Http2ClientDemux.html](https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/Http2ClientDemux.html)*