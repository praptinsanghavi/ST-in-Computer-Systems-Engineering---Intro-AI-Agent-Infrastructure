---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:33:28Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/FrameEventRenderer.html
title: FrameEventRenderer
---

# FrameEventRenderer

## Content

Package [akka.http.impl.engine.ws](package-summary.html)
## Class FrameEventRenderer

- java.lang.Object
- - akka.stream.stage.GraphStageWithMaterializedValue\<S,​akka.NotUsed\>
	- - akka.stream.stage.GraphStage\<akka.stream.FlowShape\<[FrameEvent](FrameEvent.html "interface in akka.http.impl.engine.ws"),​akka.util.ByteString\>\>
		- - akka.http.impl.engine.ws.FrameEventRenderer

- All Implemented Interfaces:
`akka.stream.Graph<akka.stream.FlowShape<[FrameEvent](FrameEvent.html "interface in akka.http.impl.engine.ws"),​akka.util.ByteString>,​akka.NotUsed>`

---

```
public final class FrameEventRenderer
extends akka.stream.stage.GraphStage<akka.stream.FlowShape<[FrameEvent](FrameEvent.html "interface in akka.http.impl.engine.ws"),​akka.util.ByteString>>
```

Renders FrameEvents to ByteString.
 
 INTERNAL API

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface akka.stream.Graph
		
		
		`akka.stream.Graph.GraphMapMatVal<S extends akka.stream.Shape,​M extends java.lang.Object>`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[FrameEventRenderer](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `akka.stream.stage.GraphStageLogic` | `[createLogic](#createLogic(akka.stream.Attributes))​(akka.stream.Attributes inheritedAttributes)` |  |
	| `akka.stream.Inlet<[FrameEvent](FrameEvent.html "interface in akka.http.impl.engine.ws")>` | `[in](#in())()` |  |
	| `akka.stream.Outlet<akka.util.ByteString>` | `[out](#out())()` |  |
	| `akka.stream.FlowShape<[FrameEvent](FrameEvent.html "interface in akka.http.impl.engine.ws"),​akka.util.ByteString>` | `[shape](#shape())()` |  |
	
	
		- ### Methods inherited from class akka.stream.stage.GraphStage
		
		
		`createLogicAndMaterializedValue`
		- ### Methods inherited from class akka.stream.stage.GraphStageWithMaterializedValue
		
		
		`addAttributes, async, async, async, createLogicAndMaterializedValue, getAttributes, initialAttributes, named, traversalBuilder, withAttributes`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### FrameEventRenderer
		
		
		
		```
		public FrameEventRenderer()
		```

	- ### Method Detail
	
	
	
		- #### createLogic
		
		
		
		```
		public akka.stream.stage.GraphStageLogic createLogic​(akka.stream.Attributes inheritedAttributes)
		```
		
		
		Specified by:
		`createLogic` in class `akka.stream.stage.GraphStage<akka.stream.FlowShape<[FrameEvent](FrameEvent.html "interface in akka.http.impl.engine.ws"),​akka.util.ByteString>>`
		- #### in
		
		
		
		```
		public akka.stream.Inlet<[FrameEvent](FrameEvent.html "interface in akka.http.impl.engine.ws")> in()
		```
		- #### out
		
		
		
		```
		public akka.stream.Outlet<akka.util.ByteString> out()
		```
		- #### shape
		
		
		
		```
		public akka.stream.FlowShape<[FrameEvent](FrameEvent.html "interface in akka.http.impl.engine.ws"),​akka.util.ByteString> shape()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/FrameEvent.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/FrameEventRenderer.html](https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/FrameEventRenderer.html)*