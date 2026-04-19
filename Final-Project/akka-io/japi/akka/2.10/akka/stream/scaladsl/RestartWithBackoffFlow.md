---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:47:46Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/2.10/akka/stream/scaladsl/RestartWithBackoffFlow.html
title: RestartWithBackoffFlow
---

# RestartWithBackoffFlow

## Content

Package [akka.stream.scaladsl](package-summary.html)
## Class RestartWithBackoffFlow\<In,​Out\>

- java.lang.Object
- - [akka.stream.stage.GraphStageWithMaterializedValue](../stage/GraphStageWithMaterializedValue.html "class in akka.stream.stage")\<S,​[NotUsed](../../NotUsed.html "class in akka")\>
	- - [akka.stream.stage.GraphStage](../stage/GraphStage.html "class in akka.stream.stage")\<[FlowShape](../FlowShape.html "class in akka.stream")\<In,​Out\>\>
		- - akka.stream.scaladsl.RestartWithBackoffFlow\<In,​Out\>

- All Implemented Interfaces:
`[Graph](../Graph.html "interface in akka.stream")<[FlowShape](../FlowShape.html "class in akka.stream")<In,​Out>,​[NotUsed](../../NotUsed.html "class in akka")>`

---

```
public final class RestartWithBackoffFlow<In,​Out>
extends [GraphStage](../stage/GraphStage.html "class in akka.stream.stage")<[FlowShape](../FlowShape.html "class in akka.stream")<In,​Out>>
```

- - ### Nested Class Summary
	
	
	
	Nested Classes 
	| Modifier and Type | Class | Description |
	| `static class` | `[RestartWithBackoffFlow.Delay](RestartWithBackoffFlow.Delay.html "class in akka.stream.scaladsl")` | Temporary attribute that can override the time a [`RestartWithBackoffFlow`](RestartWithBackoffFlow.html "class in akka.stream.scaladsl") waits  for a failure before cancelling. |
	| `static class` | `[RestartWithBackoffFlow.Delay$](RestartWithBackoffFlow.Delay$.html "class in akka.stream.scaladsl")` |  |
	
	
		- ### Nested classes/interfaces inherited from interface akka.stream.[Graph](../Graph.html "interface in akka.stream")
		
		
		`[Graph.GraphMapMatVal](../Graph.GraphMapMatVal.html "class in akka.stream")<[S](../Graph.GraphMapMatVal.html "type parameter in Graph.GraphMapMatVal") extends [Shape](../Shape.html "class in akka.stream"),​[M](../Graph.GraphMapMatVal.html "type parameter in Graph.GraphMapMatVal")>`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[RestartWithBackoffFlow](#%3Cinit%3E(scala.Function0,akka.stream.RestartSettings,boolean))​(scala.Function0<[Flow](Flow.html "class in akka.stream.scaladsl")<[In](RestartWithBackoffFlow.html "type parameter in RestartWithBackoffFlow"),​[Out](RestartWithBackoffFlow.html "type parameter in RestartWithBackoffFlow"),​?>> flowFactory,  [RestartSettings](../RestartSettings.html "class in akka.stream") settings,  boolean onlyOnFailures)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[RestartWithBackoffLogic](RestartWithBackoffLogic.html "class in akka.stream.scaladsl")<[FlowShape](../FlowShape.html "class in akka.stream")<[In](RestartWithBackoffFlow.html "type parameter in RestartWithBackoffFlow"),​[Out](RestartWithBackoffFlow.html "type parameter in RestartWithBackoffFlow")>>` | `[createLogic](#createLogic(akka.stream.Attributes))​([Attributes](../Attributes.html "class in akka.stream") inheritedAttributes)` |  |
	| `[Inlet](../Inlet.html "class in akka.stream")<[In](RestartWithBackoffFlow.html "type parameter in RestartWithBackoffFlow")>` | `[in](#in())()` |  |
	| `[Outlet](../Outlet.html "class in akka.stream")<[Out](RestartWithBackoffFlow.html "type parameter in RestartWithBackoffFlow")>` | `[out](#out())()` |  |
	| `[FlowShape](../FlowShape.html "class in akka.stream")<[In](RestartWithBackoffFlow.html "type parameter in RestartWithBackoffFlow"),​[Out](RestartWithBackoffFlow.html "type parameter in RestartWithBackoffFlow")>` | `[shape](#shape())()` | The shape of a graph is all that is externally visible: its inlets and outlets. |
	
	
		- ### Methods inherited from class akka.stream.stage.[GraphStage](../stage/GraphStage.html "class in akka.stream.stage")
		
		
		`[createLogicAndMaterializedValue](../stage/GraphStage.html#createLogicAndMaterializedValue(akka.stream.Attributes))`
		- ### Methods inherited from class akka.stream.stage.[GraphStageWithMaterializedValue](../stage/GraphStageWithMaterializedValue.html "class in akka.stream.stage")
		
		
		`[initialAttributes](../stage/GraphStageWithMaterializedValue.html#initialAttributes()), [withAttributes](../stage/GraphStageWithMaterializedValue.html#withAttributes(akka.stream.Attributes))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.stream.[Graph](../Graph.html "interface in akka.stream")
		
		
		`[addAttributes](../Graph.html#addAttributes(akka.stream.Attributes)), [async](../Graph.html#async()), [async](../Graph.html#async(java.lang.String)), [async](../Graph.html#async(java.lang.String,int)), [getAttributes](../Graph.html#getAttributes()), [named](../Graph.html#named(java.lang.String))`

- - ### Constructor Detail
	
	
	
		- #### RestartWithBackoffFlow
		
		
		
		```
		public RestartWithBackoffFlow​(scala.Function0<[Flow](Flow.html "class in akka.stream.scaladsl")<[In](RestartWithBackoffFlow.html "type parameter in RestartWithBackoffFlow"),​[Out](RestartWithBackoffFlow.html "type parameter in RestartWithBackoffFlow"),​?>> flowFactory,
		                              [RestartSettings](../RestartSettings.html "class in akka.stream") settings,
		                              boolean onlyOnFailures)
		```

	- ### Method Detail
	
	
	
		- #### in
		
		
		
		```
		public [Inlet](../Inlet.html "class in akka.stream")<[In](RestartWithBackoffFlow.html "type parameter in RestartWithBackoffFlow")> in()
		```
		- #### out
		
		
		
		```
		public [Outlet](../Outlet.html "class in akka.stream")<[Out](RestartWithBackoffFlow.html "type parameter in RestartWithBackoffFlow")> out()
		```
		- #### shape
		
		
		
		```
		public [FlowShape](../FlowShape.html "class in akka.stream")<[In](RestartWithBackoffFlow.html "type parameter in RestartWithBackoffFlow"),​[Out](RestartWithBackoffFlow.html "type parameter in RestartWithBackoffFlow")> shape()
		```
		
		Description copied from interface: `[Graph](../Graph.html#shape())`
		The shape of a graph is all that is externally visible: its inlets and outlets.
		- #### createLogic
		
		
		
		```
		public [RestartWithBackoffLogic](RestartWithBackoffLogic.html "class in akka.stream.scaladsl")<[FlowShape](../FlowShape.html "class in akka.stream")<[In](RestartWithBackoffFlow.html "type parameter in RestartWithBackoffFlow"),​[Out](RestartWithBackoffFlow.html "type parameter in RestartWithBackoffFlow")>> createLogic​([Attributes](../Attributes.html "class in akka.stream") inheritedAttributes)
		```
		
		
		Specified by:
		`[createLogic](../stage/GraphStage.html#createLogic(akka.stream.Attributes))` in class `[GraphStage](../stage/GraphStage.html "class in akka.stream.stage")<[FlowShape](../FlowShape.html "class in akka.stream")<[In](RestartWithBackoffFlow.html "type parameter in RestartWithBackoffFlow"),​[Out](RestartWithBackoffFlow.html "type parameter in RestartWithBackoffFlow")>>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/2.10/akka/NotUsed.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/Attributes.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/FlowShape.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/Graph.GraphMapMatVal.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/Graph.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/Inlet.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/Outlet.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/RestartSettings.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/Shape.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/scaladsl/Flow.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/scaladsl/RestartWithBackoffFlow.Delay$.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/scaladsl/RestartWithBackoffFlow.Delay.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/scaladsl/RestartWithBackoffFlow.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/scaladsl/RestartWithBackoffLogic.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/scaladsl/package-summary.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/stage/GraphStage.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/stage/GraphStageWithMaterializedValue.html

---
*Source: [https://doc.akka.io/japi/akka/2.10/akka/stream/scaladsl/RestartWithBackoffFlow.html](https://doc.akka.io/japi/akka/2.10/akka/stream/scaladsl/RestartWithBackoffFlow.html)*