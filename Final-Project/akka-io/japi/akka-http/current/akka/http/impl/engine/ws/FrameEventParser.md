---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:33:27Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/FrameEventParser.html
title: FrameEventParser
---

# FrameEventParser

## Content

Package [akka.http.impl.engine.ws](package-summary.html)
## Class FrameEventParser

- java.lang.Object
- - akka.http.impl.engine.ws.FrameEventParser

- ---

```
public class FrameEventParser
extends java.lang.Object
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

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[FrameEventParser](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static akka.stream.Graph<S,​M>` | `[addAttributes](#addAttributes(akka.stream.Attributes))​(akka.stream.Attributes attr)` |  |
	| `static akka.stream.Graph<S,​M>` | `[async](#async())()` |  |
	| `static akka.stream.Graph<S,​M>` | `[async](#async(java.lang.String))​(java.lang.String dispatcher)` |  |
	| `static akka.stream.Graph<S,​M>` | `[async](#async(java.lang.String,int))​(java.lang.String dispatcher,  int inputBufferSize)` |  |
	| `static akka.stream.impl.io.ByteStringParser.ParsingLogic` | `[createLogic](#createLogic(akka.stream.Attributes))​(akka.stream.Attributes attr)` |  |
	| `static scala.Tuple2<akka.stream.stage.GraphStageLogic,​akka.NotUsed>` | `[createLogicAndMaterializedValue](#createLogicAndMaterializedValue(akka.stream.Attributes))​(akka.stream.Attributes inheritedAttributes)` |  |
	| `static scala.Tuple2<akka.stream.stage.GraphStageLogic,​M>` | `[createLogicAndMaterializedValue](#createLogicAndMaterializedValue(akka.stream.Attributes,akka.stream.Materializer))​(akka.stream.Attributes inheritedAttributes,  akka.stream.Materializer materializer)` |  |
	| `static akka.stream.Attributes` | `[getAttributes](#getAttributes())()` |  |
	| `static akka.stream.Attributes` | `[initialAttributes](#initialAttributes())()` |  |
	| `static scala.Tuple2<akka.util.ByteString,​java.lang.Object>` | `[mask](#mask(akka.util.ByteString,int))​(akka.util.ByteString bytes,  int mask)` |  |
	| `static akka.util.ByteString` | `[mask](#mask(akka.util.ByteString,scala.Option))​(akka.util.ByteString bytes,  scala.Option<java.lang.Object> _mask)` |  |
	| `static akka.stream.Graph<S,​M>` | `[named](#named(java.lang.String))​(java.lang.String name)` |  |
	| `static scala.Option<scala.Tuple2<java.lang.Object,​java.lang.String>>` | `[parseCloseCode](#parseCloseCode(akka.util.ByteString))​(akka.util.ByteString data)` |  |
	| `static akka.stream.FlowShape<akka.util.ByteString,​T>` | `[shape](#shape())()` |  |
	| `static java.lang.String` | `[toString](#toString())()` |  |
	| `static akka.stream.impl.TraversalBuilder` | `[traversalBuilder](#traversalBuilder())()` |  |
	| `static akka.stream.Graph<S,​M>` | `[withAttributes](#withAttributes(akka.stream.Attributes))​(akka.stream.Attributes attr)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### FrameEventParser
		
		
		
		```
		public FrameEventParser()
		```

	- ### Method Detail
	
	
	
		- #### createLogic
		
		
		
		```
		public static akka.stream.impl.io.ByteStringParser.ParsingLogic createLogic​(akka.stream.Attributes attr)
		```
		- #### mask
		
		
		
		```
		public static akka.util.ByteString mask​(akka.util.ByteString bytes,
		                                        scala.Option<java.lang.Object> _mask)
		```
		- #### mask
		
		
		
		```
		public static scala.Tuple2<akka.util.ByteString,​java.lang.Object> mask​(akka.util.ByteString bytes,
		                                                                             int mask)
		```
		- #### parseCloseCode
		
		
		
		```
		public static scala.Option<scala.Tuple2<java.lang.Object,​java.lang.String>> parseCloseCode​(akka.util.ByteString data)
		```
		- #### toString
		
		
		
		```
		public static java.lang.String toString()
		```
		- #### named
		
		
		
		```
		public static akka.stream.Graph<S,​M> named​(java.lang.String name)
		```
		- #### async
		
		
		
		```
		public static akka.stream.Graph<S,​M> async()
		```
		- #### async
		
		
		
		```
		public static akka.stream.Graph<S,​M> async​(java.lang.String dispatcher)
		```
		- #### async
		
		
		
		```
		public static akka.stream.Graph<S,​M> async​(java.lang.String dispatcher,
		                                                 int inputBufferSize)
		```
		- #### addAttributes
		
		
		
		```
		public static akka.stream.Graph<S,​M> addAttributes​(akka.stream.Attributes attr)
		```
		- #### getAttributes
		
		
		
		```
		public static akka.stream.Attributes getAttributes()
		```
		- #### createLogicAndMaterializedValue
		
		
		
		```
		public static scala.Tuple2<akka.stream.stage.GraphStageLogic,​M> createLogicAndMaterializedValue​(akka.stream.Attributes inheritedAttributes,
		                                                                                                      akka.stream.Materializer materializer)
		```
		- #### traversalBuilder
		
		
		
		```
		public static final akka.stream.impl.TraversalBuilder traversalBuilder()
		```
		- #### withAttributes
		
		
		
		```
		public static final akka.stream.Graph<S,​M> withAttributes​(akka.stream.Attributes attr)
		```
		- #### createLogicAndMaterializedValue
		
		
		
		```
		public static final scala.Tuple2<akka.stream.stage.GraphStageLogic,​akka.NotUsed> createLogicAndMaterializedValue​(akka.stream.Attributes inheritedAttributes)
		```
		- #### initialAttributes
		
		
		
		```
		public static akka.stream.Attributes initialAttributes()
		```
		- #### shape
		
		
		
		```
		public static final akka.stream.FlowShape<akka.util.ByteString,​T> shape()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/FrameEventParser.html](https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/FrameEventParser.html)*