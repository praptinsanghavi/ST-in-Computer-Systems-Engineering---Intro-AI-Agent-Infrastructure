---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:33:27Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/FrameEventParser$.html
title: FrameEventParser$
---

# FrameEventParser$

## Content

Package [akka.http.impl.engine.ws](package-summary.html)
## Class FrameEventParser$

- java.lang.Object
- - akka.stream.stage.GraphStageWithMaterializedValue\<S,​akka.NotUsed\>
	- - akka.stream.stage.GraphStage\<akka.stream.FlowShape\<akka.util.ByteString,​T\>\>
		- - akka.stream.impl.io.ByteStringParser\<[FrameEvent](FrameEvent.html "interface in akka.http.impl.engine.ws")\>
			- - akka.http.impl.engine.ws.FrameEventParser$

- All Implemented Interfaces:
`akka.stream.Graph<akka.stream.FlowShape<akka.util.ByteString,​[FrameEvent](FrameEvent.html "interface in akka.http.impl.engine.ws")>,​akka.NotUsed>`

---

```
public class FrameEventParser$
extends akka.stream.impl.io.ByteStringParser<[FrameEvent](FrameEvent.html "interface in akka.http.impl.engine.ws")>
```

Streaming parser for the WebSocket framing protocol as defined in RFC6455
 
 http://tools.ietf.org/html/rfc6455
 

 0 1 2 3
 0 1 2 3 4 5 6 7 8 9 0 1 2 3 4 5 6 7 8 9 0 1 2 3 4 5 6 7 8 9 0 1
 \+\-\+\-\+\-\+\-\+\-\-\-\-\-\-\-\+\-\+\-\-\-\-\-\-\-\-\-\-\-\-\-\+\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\+
 \|F\|R\|R\|R\| opcode\|M\| Payload len \| Extended payload length \|
 \|I\|S\|S\|S\| (4\) \|A\| (7\) \| (16/64\) \|
 \|N\|V\|V\|V\| \|S\| \| (if payload len\=\=126/127\) \|
 \| \|1\|2\|3\| \|K\| \| \|
 \+\-\+\-\+\-\+\-\+\-\-\-\-\-\-\-\+\-\+\-\-\-\-\-\-\-\-\-\-\-\-\-\+ \- \- \- \- \- \- \- \- \- \- \- \- \- \- \- \+
 \| Extended payload length continued, if payload len \=\= 127 \|
 \+ \- \- \- \- \- \- \- \- \- \- \- \- \- \- \- \+\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\+
 \| \|Masking\-key, if MASK set to 1 \|
 \+\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\+\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\+
 \| Masking\-key (continued) \| Payload Data \|
 \+\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\- \- \- \- \- \- \- \- \- \- \- \- \- \- \- \- \+
 : Payload Data continued ... :
 \+ \- \- \- \- \- \- \- \- \- \- \- \- \- \- \- \- \- \- \- \- \- \- \- \- \- \- \- \- \- \- \- \+
 \| Payload Data continued ... \|
 \+\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\+
 

 INTERNAL API

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from class akka.stream.impl.io.ByteStringParser
		
		
		`akka.stream.impl.io.ByteStringParser.ByteReader, akka.stream.impl.io.ByteStringParser.FinishedParser$, akka.stream.impl.io.ByteStringParser.ParseResult<T extends java.lang.Object>, akka.stream.impl.io.ByteStringParser.ParseResult$, akka.stream.impl.io.ByteStringParser.ParseStep<T extends java.lang.Object>, akka.stream.impl.io.ByteStringParser.ParsingException, akka.stream.impl.io.ByteStringParser.ParsingLogic`
		- ### Nested classes/interfaces inherited from interface akka.stream.Graph
		
		
		`akka.stream.Graph.GraphMapMatVal<S extends akka.stream.Shape,​M extends java.lang.Object>`

	- ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [FrameEventParser$](FrameEventParser$.html "class in akka.http.impl.engine.ws")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[FrameEventParser$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `akka.stream.impl.io.ByteStringParser.ParsingLogic` | `[createLogic](#createLogic(akka.stream.Attributes))​(akka.stream.Attributes attr)` |  |
	| `scala.Tuple2<akka.util.ByteString,​java.lang.Object>` | `[mask](#mask(akka.util.ByteString,int))​(akka.util.ByteString bytes,  int mask)` |  |
	| `akka.util.ByteString` | `[mask](#mask(akka.util.ByteString,scala.Option))​(akka.util.ByteString bytes,  scala.Option<java.lang.Object> _mask)` |  |
	| `scala.Option<scala.Tuple2<java.lang.Object,​java.lang.String>>` | `[parseCloseCode](#parseCloseCode(akka.util.ByteString))​(akka.util.ByteString data)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	
	
		- ### Methods inherited from class akka.stream.impl.io.ByteStringParser
		
		
		`akka$stream$impl$io$ByteStringParser$$bytesIn, akka$stream$impl$io$ByteStringParser$$objOut, CompactionThreshold, initialAttributes, NeedMoreData, shape`
		- ### Methods inherited from class akka.stream.stage.GraphStage
		
		
		`createLogicAndMaterializedValue`
		- ### Methods inherited from class akka.stream.stage.GraphStageWithMaterializedValue
		
		
		`addAttributes, async, async, async, createLogicAndMaterializedValue, getAttributes, named, traversalBuilder, withAttributes`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [FrameEventParser$](FrameEventParser$.html "class in akka.http.impl.engine.ws") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### FrameEventParser$
		
		
		
		```
		public FrameEventParser$()
		```

	- ### Method Detail
	
	
	
		- #### createLogic
		
		
		
		```
		public akka.stream.impl.io.ByteStringParser.ParsingLogic createLogic​(akka.stream.Attributes attr)
		```
		
		
		Specified by:
		`createLogic` in class `akka.stream.stage.GraphStage<akka.stream.FlowShape<akka.util.ByteString,​[FrameEvent](FrameEvent.html "interface in akka.http.impl.engine.ws")>>`
		- #### mask
		
		
		
		```
		public akka.util.ByteString mask​(akka.util.ByteString bytes,
		                                 scala.Option<java.lang.Object> _mask)
		```
		- #### mask
		
		
		
		```
		public scala.Tuple2<akka.util.ByteString,​java.lang.Object> mask​(akka.util.ByteString bytes,
		                                                                      int mask)
		```
		- #### parseCloseCode
		
		
		
		```
		public scala.Option<scala.Tuple2<java.lang.Object,​java.lang.String>> parseCloseCode​(akka.util.ByteString data)
		```
		- #### toString
		
		
		
		```
		public java.lang.String toString()
		```
		
		
		Overrides:
		`toString` in class `java.lang.Object`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/FrameEvent.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/FrameEventParser$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/FrameEventParser$.html](https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/FrameEventParser$.html)*