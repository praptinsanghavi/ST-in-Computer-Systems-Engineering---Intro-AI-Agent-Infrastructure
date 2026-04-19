---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:30:14Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/framing/Http2FrameParsing.html
title: Http2FrameParsing
---

# Http2FrameParsing

## Content

Package [akka.http.impl.engine.http2\.framing](package-summary.html)
## Class Http2FrameParsing

- java.lang.Object
- - akka.stream.stage.GraphStageWithMaterializedValue\<S,​akka.NotUsed\>
	- - akka.stream.stage.GraphStage\<akka.stream.FlowShape\<akka.util.ByteString,​T\>\>
		- - akka.stream.impl.io.ByteStringParser\<[FrameEvent](../FrameEvent.html "interface in akka.http.impl.engine.http2")\>
			- - akka.http.impl.engine.http2\.framing.Http2FrameParsing

- All Implemented Interfaces:
`akka.stream.Graph<akka.stream.FlowShape<akka.util.ByteString,​[FrameEvent](../FrameEvent.html "interface in akka.http.impl.engine.http2")>,​akka.NotUsed>`

---

```
public class Http2FrameParsing
extends akka.stream.impl.io.ByteStringParser<[FrameEvent](../FrameEvent.html "interface in akka.http.impl.engine.http2")>
```

INTERNAL API

- - ### Nested Class Summary
	
	
	
	Nested Classes 
	| Modifier and Type | Class | Description |
	| `class` | `[Http2FrameParsing.Step](Http2FrameParsing.Step.html "class in akka.http.impl.engine.http2.framing")` |  |
	
	
		- ### Nested classes/interfaces inherited from class akka.stream.impl.io.ByteStringParser
		
		
		`akka.stream.impl.io.ByteStringParser.ByteReader, akka.stream.impl.io.ByteStringParser.FinishedParser$, akka.stream.impl.io.ByteStringParser.ParseResult<T extends java.lang.Object>, akka.stream.impl.io.ByteStringParser.ParseResult$, akka.stream.impl.io.ByteStringParser.ParseStep<T extends java.lang.Object>, akka.stream.impl.io.ByteStringParser.ParsingException, akka.stream.impl.io.ByteStringParser.ParsingLogic`
		- ### Nested classes/interfaces inherited from interface akka.stream.Graph
		
		
		`akka.stream.Graph.GraphMapMatVal<S extends akka.stream.Shape,​M extends java.lang.Object>`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Http2FrameParsing](#%3Cinit%3E(boolean,akka.event.LoggingAdapter))​(boolean shouldReadPreface,  akka.event.LoggingAdapter log)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `akka.stream.stage.GraphStageLogic` | `[createLogic](#createLogic(akka.stream.Attributes))​(akka.stream.Attributes inheritedAttributes)` |  |
	| `static [FrameEvent](../FrameEvent.html "interface in akka.http.impl.engine.http2")` | `[parseFrame](#parseFrame(akka.http.impl.engine.http2.Http2Protocol.FrameType,akka.http.impl.engine.http2.ByteFlag,int,akka.stream.impl.io.ByteStringParser.ByteReader,akka.event.LoggingAdapter))​([Http2Protocol.FrameType](../Http2Protocol.FrameType.html "class in akka.http.impl.engine.http2") tpe,  [ByteFlag](../ByteFlag.html "class in akka.http.impl.engine.http2") flags,  int streamId,  akka.stream.impl.io.ByteStringParser.ByteReader payload,  akka.event.LoggingAdapter log)` |  |
	| `static scala.collection.immutable.Seq<[FrameEvent.Setting](../FrameEvent.Setting.html "class in akka.http.impl.engine.http2")>` | `[readSettings](#readSettings(akka.stream.impl.io.ByteStringParser.ByteReader,akka.event.LoggingAdapter))​(akka.stream.impl.io.ByteStringParser.ByteReader payload,  akka.event.LoggingAdapter log)` |  |
	
	
		- ### Methods inherited from class akka.stream.impl.io.ByteStringParser
		
		
		`akka$stream$impl$io$ByteStringParser$$bytesIn, akka$stream$impl$io$ByteStringParser$$objOut, CompactionThreshold, initialAttributes, NeedMoreData, shape`
		- ### Methods inherited from class akka.stream.stage.GraphStage
		
		
		`createLogicAndMaterializedValue`
		- ### Methods inherited from class akka.stream.stage.GraphStageWithMaterializedValue
		
		
		`addAttributes, async, async, async, createLogicAndMaterializedValue, getAttributes, named, traversalBuilder, withAttributes`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### Http2FrameParsing
		
		
		
		```
		public Http2FrameParsing​(boolean shouldReadPreface,
		                         akka.event.LoggingAdapter log)
		```

	- ### Method Detail
	
	
	
		- #### readSettings
		
		
		
		```
		public static scala.collection.immutable.Seq<[FrameEvent.Setting](../FrameEvent.Setting.html "class in akka.http.impl.engine.http2")> readSettings​(akka.stream.impl.io.ByteStringParser.ByteReader payload,
		                                                                              akka.event.LoggingAdapter log)
		```
		- #### parseFrame
		
		
		
		```
		public static [FrameEvent](../FrameEvent.html "interface in akka.http.impl.engine.http2") parseFrame​([Http2Protocol.FrameType](../Http2Protocol.FrameType.html "class in akka.http.impl.engine.http2") tpe,
		                                    [ByteFlag](../ByteFlag.html "class in akka.http.impl.engine.http2") flags,
		                                    int streamId,
		                                    akka.stream.impl.io.ByteStringParser.ByteReader payload,
		                                    akka.event.LoggingAdapter log)
		```
		- #### createLogic
		
		
		
		```
		public akka.stream.stage.GraphStageLogic createLogic​(akka.stream.Attributes inheritedAttributes)
		```
		
		
		Specified by:
		`createLogic` in class `akka.stream.stage.GraphStage<akka.stream.FlowShape<akka.util.ByteString,​[FrameEvent](../FrameEvent.html "interface in akka.http.impl.engine.http2")>>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/ByteFlag.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/FrameEvent.Setting.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/FrameEvent.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/Http2Protocol.FrameType.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/framing/Http2FrameParsing.Step.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/framing/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/framing/Http2FrameParsing.html](https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/framing/Http2FrameParsing.html)*