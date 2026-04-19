---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:29:57Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/client/PoolInterface.PoolInterfaceStage.html
title: PoolInterface.PoolInterfaceStage
---

# PoolInterface.PoolInterfaceStage

## Content

Package [akka.http.impl.engine.client](package-summary.html)
## Class PoolInterface.PoolInterfaceStage

- java.lang.Object
- - akka.stream.stage.GraphStageWithMaterializedValue\<akka.stream.FlowShape\<[PoolFlow.ResponseContext](PoolFlow.ResponseContext.html "class in akka.http.impl.engine.client"),​[PoolFlow.RequestContext](PoolFlow.RequestContext.html "class in akka.http.impl.engine.client")\>,​[PoolInterface](PoolInterface.html "interface in akka.http.impl.engine.client")\>
	- - akka.http.impl.engine.client.PoolInterface.PoolInterfaceStage

- All Implemented Interfaces:
`akka.stream.Graph<akka.stream.FlowShape<[PoolFlow.ResponseContext](PoolFlow.ResponseContext.html "class in akka.http.impl.engine.client"),​[PoolFlow.RequestContext](PoolFlow.RequestContext.html "class in akka.http.impl.engine.client")>,​[PoolInterface](PoolInterface.html "interface in akka.http.impl.engine.client")>`

Enclosing interface:
[PoolInterface](PoolInterface.html "interface in akka.http.impl.engine.client")

---

```
public static class PoolInterface.PoolInterfaceStage
extends akka.stream.stage.GraphStageWithMaterializedValue<akka.stream.FlowShape<[PoolFlow.ResponseContext](PoolFlow.ResponseContext.html "class in akka.http.impl.engine.client"),​[PoolFlow.RequestContext](PoolFlow.RequestContext.html "class in akka.http.impl.engine.client")>,​[PoolInterface](PoolInterface.html "interface in akka.http.impl.engine.client")>
```

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface akka.stream.Graph
		
		
		`akka.stream.Graph.GraphMapMatVal<S extends akka.stream.Shape,​M extends java.lang.Object>`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[PoolInterfaceStage](#%3Cinit%3E(akka.http.impl.engine.client.PoolId,akka.http.impl.engine.client.PoolMaster,int,akka.event.LoggingAdapter))​([PoolId](PoolId.html "class in akka.http.impl.engine.client") poolId,  [PoolMaster](PoolMaster.html "class in akka.http.impl.engine.client") master,  int bufferSize,  akka.event.LoggingAdapter log)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `scala.Tuple2<akka.stream.stage.GraphStageLogic,​[PoolInterface](PoolInterface.html "interface in akka.http.impl.engine.client")>` | `[createLogicAndMaterializedValue](#createLogicAndMaterializedValue(akka.stream.Attributes))​(akka.stream.Attributes inheritedAttributes)` |  |
	| `scala.Tuple2<akka.stream.stage.GraphStageLogic,​[PoolInterface](PoolInterface.html "interface in akka.http.impl.engine.client")>` | `[createLogicAndMaterializedValue](#createLogicAndMaterializedValue(akka.stream.Attributes,akka.stream.Materializer))​(akka.stream.Attributes inheritedAttributes,  akka.stream.Materializer _materializer)` |  |
	| `akka.stream.FlowShape<[PoolFlow.ResponseContext](PoolFlow.ResponseContext.html "class in akka.http.impl.engine.client"),​[PoolFlow.RequestContext](PoolFlow.RequestContext.html "class in akka.http.impl.engine.client")>` | `[shape](#shape())()` |  |
	
	
		- ### Methods inherited from class akka.stream.stage.GraphStageWithMaterializedValue
		
		
		`addAttributes, async, async, async, getAttributes, initialAttributes, named, traversalBuilder, withAttributes`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### PoolInterfaceStage
		
		
		
		```
		public PoolInterfaceStage​([PoolId](PoolId.html "class in akka.http.impl.engine.client") poolId,
		                          [PoolMaster](PoolMaster.html "class in akka.http.impl.engine.client") master,
		                          int bufferSize,
		                          akka.event.LoggingAdapter log)
		```

	- ### Method Detail
	
	
	
		- #### createLogicAndMaterializedValue
		
		
		
		```
		public scala.Tuple2<akka.stream.stage.GraphStageLogic,​[PoolInterface](PoolInterface.html "interface in akka.http.impl.engine.client")> createLogicAndMaterializedValue​(akka.stream.Attributes inheritedAttributes)
		```
		
		
		Specified by:
		`createLogicAndMaterializedValue` in class `akka.stream.stage.GraphStageWithMaterializedValue<akka.stream.FlowShape<[PoolFlow.ResponseContext](PoolFlow.ResponseContext.html "class in akka.http.impl.engine.client"),​[PoolFlow.RequestContext](PoolFlow.RequestContext.html "class in akka.http.impl.engine.client")>,​[PoolInterface](PoolInterface.html "interface in akka.http.impl.engine.client")>`
		- #### createLogicAndMaterializedValue
		
		
		
		```
		public scala.Tuple2<akka.stream.stage.GraphStageLogic,​[PoolInterface](PoolInterface.html "interface in akka.http.impl.engine.client")> createLogicAndMaterializedValue​(akka.stream.Attributes inheritedAttributes,
		                                                                                                           akka.stream.Materializer _materializer)
		```
		
		
		Overrides:
		`createLogicAndMaterializedValue` in class `akka.stream.stage.GraphStageWithMaterializedValue<akka.stream.FlowShape<[PoolFlow.ResponseContext](PoolFlow.ResponseContext.html "class in akka.http.impl.engine.client"),​[PoolFlow.RequestContext](PoolFlow.RequestContext.html "class in akka.http.impl.engine.client")>,​[PoolInterface](PoolInterface.html "interface in akka.http.impl.engine.client")>`
		- #### shape
		
		
		
		```
		public akka.stream.FlowShape<[PoolFlow.ResponseContext](PoolFlow.ResponseContext.html "class in akka.http.impl.engine.client"),​[PoolFlow.RequestContext](PoolFlow.RequestContext.html "class in akka.http.impl.engine.client")> shape()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/client/PoolFlow.RequestContext.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/client/PoolFlow.ResponseContext.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/client/PoolId.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/client/PoolInterface.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/client/PoolMaster.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/client/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/client/PoolInterface.PoolInterfaceStage.html](https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/client/PoolInterface.PoolInterfaceStage.html)*