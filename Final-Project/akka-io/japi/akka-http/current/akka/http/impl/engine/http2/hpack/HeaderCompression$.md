---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:32:06Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/hpack/HeaderCompression$.html
title: HeaderCompression$
---

# HeaderCompression$

## Content

Package [akka.http.impl.engine.http2\.hpack](package-summary.html)
## Class HeaderCompression$

- java.lang.Object
- - akka.stream.stage.GraphStageWithMaterializedValue\<S,​akka.NotUsed\>
	- - akka.stream.stage.GraphStage\<akka.stream.FlowShape\<[FrameEvent](../FrameEvent.html "interface in akka.http.impl.engine.http2"),​[FrameEvent](../FrameEvent.html "interface in akka.http.impl.engine.http2")\>\>
		- - akka.http.impl.engine.http2\.hpack.HeaderCompression$

- All Implemented Interfaces:
`akka.stream.Graph<akka.stream.FlowShape<[FrameEvent](../FrameEvent.html "interface in akka.http.impl.engine.http2"),​[FrameEvent](../FrameEvent.html "interface in akka.http.impl.engine.http2")>,​akka.NotUsed>`

---

```
public class HeaderCompression$
extends akka.stream.stage.GraphStage<akka.stream.FlowShape<[FrameEvent](../FrameEvent.html "interface in akka.http.impl.engine.http2"),​[FrameEvent](../FrameEvent.html "interface in akka.http.impl.engine.http2")>>
```

INTERNAL API

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface akka.stream.Graph
		
		
		`akka.stream.Graph.GraphMapMatVal<S extends akka.stream.Shape,​M extends java.lang.Object>`

	- ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [HeaderCompression$](HeaderCompression$.html "class in akka.http.impl.engine.http2.hpack")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[HeaderCompression$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `akka.stream.stage.GraphStageLogic` | `[createLogic](#createLogic(akka.stream.Attributes))​(akka.stream.Attributes inheritedAttributes)` |  |
	| `akka.stream.Inlet<[FrameEvent](../FrameEvent.html "interface in akka.http.impl.engine.http2")>` | `[eventsIn](#eventsIn())()` |  |
	| `akka.stream.Outlet<[FrameEvent](../FrameEvent.html "interface in akka.http.impl.engine.http2")>` | `[eventsOut](#eventsOut())()` |  |
	| `akka.stream.FlowShape<[FrameEvent](../FrameEvent.html "interface in akka.http.impl.engine.http2"),​[FrameEvent](../FrameEvent.html "interface in akka.http.impl.engine.http2")>` | `[shape](#shape())()` |  |
	
	
		- ### Methods inherited from class akka.stream.stage.GraphStage
		
		
		`createLogicAndMaterializedValue`
		- ### Methods inherited from class akka.stream.stage.GraphStageWithMaterializedValue
		
		
		`addAttributes, async, async, async, createLogicAndMaterializedValue, getAttributes, initialAttributes, named, traversalBuilder, withAttributes`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [HeaderCompression$](HeaderCompression$.html "class in akka.http.impl.engine.http2.hpack") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### HeaderCompression$
		
		
		
		```
		public HeaderCompression$()
		```

	- ### Method Detail
	
	
	
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
		- #### createLogic
		
		
		
		```
		public akka.stream.stage.GraphStageLogic createLogic​(akka.stream.Attributes inheritedAttributes)
		```
		
		
		Specified by:
		`createLogic` in class `akka.stream.stage.GraphStage<akka.stream.FlowShape<[FrameEvent](../FrameEvent.html "interface in akka.http.impl.engine.http2"),​[FrameEvent](../FrameEvent.html "interface in akka.http.impl.engine.http2")>>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/FrameEvent.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/hpack/HeaderCompression$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/hpack/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/hpack/HeaderCompression$.html](https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/hpack/HeaderCompression$.html)*