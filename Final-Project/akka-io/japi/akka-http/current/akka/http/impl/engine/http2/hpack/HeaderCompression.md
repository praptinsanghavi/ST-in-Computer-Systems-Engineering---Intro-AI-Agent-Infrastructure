---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:32:06Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/hpack/HeaderCompression.html
title: HeaderCompression
---

# HeaderCompression

## Content

Package [akka.http.impl.engine.http2\.hpack](package-summary.html)
## Class HeaderCompression

- java.lang.Object
- - akka.http.impl.engine.http2\.hpack.HeaderCompression

- ---

```
public class HeaderCompression
extends java.lang.Object
```

INTERNAL API

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[HeaderCompression](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static akka.stream.Graph<S,​M>` | `[addAttributes](#addAttributes(akka.stream.Attributes))​(akka.stream.Attributes attr)` |  |
	| `static akka.stream.Graph<S,​M>` | `[async](#async())()` |  |
	| `static akka.stream.Graph<S,​M>` | `[async](#async(java.lang.String))​(java.lang.String dispatcher)` |  |
	| `static akka.stream.Graph<S,​M>` | `[async](#async(java.lang.String,int))​(java.lang.String dispatcher,  int inputBufferSize)` |  |
	| `static akka.stream.stage.GraphStageLogic` | `[createLogic](#createLogic(akka.stream.Attributes))​(akka.stream.Attributes inheritedAttributes)` |  |
	| `static scala.Tuple2<akka.stream.stage.GraphStageLogic,​akka.NotUsed>` | `[createLogicAndMaterializedValue](#createLogicAndMaterializedValue(akka.stream.Attributes))​(akka.stream.Attributes inheritedAttributes)` |  |
	| `static scala.Tuple2<akka.stream.stage.GraphStageLogic,​M>` | `[createLogicAndMaterializedValue](#createLogicAndMaterializedValue(akka.stream.Attributes,akka.stream.Materializer))​(akka.stream.Attributes inheritedAttributes,  akka.stream.Materializer materializer)` |  |
	| `static akka.stream.Inlet<[FrameEvent](../FrameEvent.html "interface in akka.http.impl.engine.http2")>` | `[eventsIn](#eventsIn())()` |  |
	| `static akka.stream.Outlet<[FrameEvent](../FrameEvent.html "interface in akka.http.impl.engine.http2")>` | `[eventsOut](#eventsOut())()` |  |
	| `static akka.stream.Attributes` | `[getAttributes](#getAttributes())()` |  |
	| `protected static akka.stream.Attributes` | `[initialAttributes](#initialAttributes())()` |  |
	| `static akka.stream.Graph<S,​M>` | `[named](#named(java.lang.String))​(java.lang.String name)` |  |
	| `static akka.stream.FlowShape<[FrameEvent](../FrameEvent.html "interface in akka.http.impl.engine.http2"),​[FrameEvent](../FrameEvent.html "interface in akka.http.impl.engine.http2")>` | `[shape](#shape())()` |  |
	| `static akka.stream.impl.TraversalBuilder` | `[traversalBuilder](#traversalBuilder())()` |  |
	| `static akka.stream.Graph<S,​M>` | `[withAttributes](#withAttributes(akka.stream.Attributes))​(akka.stream.Attributes attr)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### HeaderCompression
		
		
		
		```
		public HeaderCompression()
		```

	- ### Method Detail
	
	
	
		- #### eventsIn
		
		
		
		```
		public static akka.stream.Inlet<[FrameEvent](../FrameEvent.html "interface in akka.http.impl.engine.http2")> eventsIn()
		```
		- #### eventsOut
		
		
		
		```
		public static akka.stream.Outlet<[FrameEvent](../FrameEvent.html "interface in akka.http.impl.engine.http2")> eventsOut()
		```
		- #### shape
		
		
		
		```
		public static akka.stream.FlowShape<[FrameEvent](../FrameEvent.html "interface in akka.http.impl.engine.http2"),​[FrameEvent](../FrameEvent.html "interface in akka.http.impl.engine.http2")> shape()
		```
		- #### createLogic
		
		
		
		```
		public static akka.stream.stage.GraphStageLogic createLogic​(akka.stream.Attributes inheritedAttributes)
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
		- #### initialAttributes
		
		
		
		```
		protected static akka.stream.Attributes initialAttributes()
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

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/FrameEvent.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/hpack/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/hpack/HeaderCompression.html](https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/hpack/HeaderCompression.html)*