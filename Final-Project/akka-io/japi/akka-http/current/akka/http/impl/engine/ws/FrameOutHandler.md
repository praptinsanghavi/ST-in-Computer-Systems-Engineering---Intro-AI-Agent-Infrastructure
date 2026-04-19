---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:33:37Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/FrameOutHandler.html
title: FrameOutHandler
---

# FrameOutHandler

## Content

Package [akka.http.impl.engine.ws](package-summary.html)
## Class FrameOutHandler

- java.lang.Object
- - akka.stream.stage.GraphStageWithMaterializedValue\<S,​akka.NotUsed\>
	- - akka.stream.stage.GraphStage\<akka.stream.FlowShape\<java.lang.Object,​[FrameStart](FrameStart.html "class in akka.http.impl.engine.ws")\>\>
		- - akka.http.impl.engine.ws.FrameOutHandler

- All Implemented Interfaces:
`akka.stream.Graph<akka.stream.FlowShape<java.lang.Object,​[FrameStart](FrameStart.html "class in akka.http.impl.engine.ws")>,​akka.NotUsed>`

---

```
public class FrameOutHandler
extends akka.stream.stage.GraphStage<akka.stream.FlowShape<java.lang.Object,​[FrameStart](FrameStart.html "class in akka.http.impl.engine.ws")>>
```

Implements the transport connection close handling at the end of the pipeline.
 
 INTERNAL API

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface akka.stream.Graph
		
		
		`akka.stream.Graph.GraphMapMatVal<S extends akka.stream.Shape,​M extends java.lang.Object>`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[FrameOutHandler](#%3Cinit%3E(boolean,scala.concurrent.duration.FiniteDuration,akka.event.LoggingAdapter))​(boolean serverSide,  scala.concurrent.duration.FiniteDuration _closeTimeout,  akka.event.LoggingAdapter log)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static akka.stream.scaladsl.Flow<java.lang.Object,​[FrameStart](FrameStart.html "class in akka.http.impl.engine.ws"),​akka.NotUsed>` | `[create](#create(boolean,scala.concurrent.duration.FiniteDuration,akka.event.LoggingAdapter))​(boolean serverSide,  scala.concurrent.duration.FiniteDuration closeTimeout,  akka.event.LoggingAdapter log)` |  |
	| `akka.stream.stage.GraphStageLogic` | `[createLogic](#createLogic(akka.stream.Attributes))​(akka.stream.Attributes inheritedAttributes)` |  |
	| `akka.stream.Inlet<java.lang.Object>` | `[in](#in())()` |  |
	| `akka.stream.Outlet<[FrameStart](FrameStart.html "class in akka.http.impl.engine.ws")>` | `[out](#out())()` |  |
	| `akka.stream.FlowShape<java.lang.Object,​[FrameStart](FrameStart.html "class in akka.http.impl.engine.ws")>` | `[shape](#shape())()` |  |
	
	
		- ### Methods inherited from class akka.stream.stage.GraphStage
		
		
		`createLogicAndMaterializedValue`
		- ### Methods inherited from class akka.stream.stage.GraphStageWithMaterializedValue
		
		
		`addAttributes, async, async, async, createLogicAndMaterializedValue, getAttributes, initialAttributes, named, traversalBuilder, withAttributes`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### FrameOutHandler
		
		
		
		```
		public FrameOutHandler​(boolean serverSide,
		                       scala.concurrent.duration.FiniteDuration _closeTimeout,
		                       akka.event.LoggingAdapter log)
		```

	- ### Method Detail
	
	
	
		- #### create
		
		
		
		```
		public static akka.stream.scaladsl.Flow<java.lang.Object,​[FrameStart](FrameStart.html "class in akka.http.impl.engine.ws"),​akka.NotUsed> create​(boolean serverSide,
		                                                                                                     scala.concurrent.duration.FiniteDuration closeTimeout,
		                                                                                                     akka.event.LoggingAdapter log)
		```
		- #### in
		
		
		
		```
		public akka.stream.Inlet<java.lang.Object> in()
		```
		- #### out
		
		
		
		```
		public akka.stream.Outlet<[FrameStart](FrameStart.html "class in akka.http.impl.engine.ws")> out()
		```
		- #### shape
		
		
		
		```
		public akka.stream.FlowShape<java.lang.Object,​[FrameStart](FrameStart.html "class in akka.http.impl.engine.ws")> shape()
		```
		- #### createLogic
		
		
		
		```
		public akka.stream.stage.GraphStageLogic createLogic​(akka.stream.Attributes inheritedAttributes)
		```
		
		
		Specified by:
		`createLogic` in class `akka.stream.stage.GraphStage<akka.stream.FlowShape<java.lang.Object,​[FrameStart](FrameStart.html "class in akka.http.impl.engine.ws")>>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/FrameStart.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/FrameOutHandler.html](https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/FrameOutHandler.html)*