---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:42:07Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/RestartWithBackoffSink.html
title: RestartWithBackoffSink
---

# RestartWithBackoffSink

## Content

Package [akka.stream.scaladsl](package-summary.html)
## Class RestartWithBackoffSink\<T\>

- java.lang.Object
- - [akka.stream.stage.GraphStageWithMaterializedValue](../stage/GraphStageWithMaterializedValue.html "class in akka.stream.stage")\<S,​[NotUsed](../../NotUsed.html "class in akka")\>
	- - [akka.stream.stage.GraphStage](../stage/GraphStage.html "class in akka.stream.stage")\<[SinkShape](../SinkShape.html "class in akka.stream")\<T\>\>
		- - akka.stream.scaladsl.RestartWithBackoffSink\<T\>

- All Implemented Interfaces:
`[Graph](../Graph.html "interface in akka.stream")<[SinkShape](../SinkShape.html "class in akka.stream")<T>,​[NotUsed](../../NotUsed.html "class in akka")>`

---

```
public final class RestartWithBackoffSink<T>
extends [GraphStage](../stage/GraphStage.html "class in akka.stream.stage")<[SinkShape](../SinkShape.html "class in akka.stream")<T>>
```

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface akka.stream.[Graph](../Graph.html "interface in akka.stream")
		
		
		`[Graph.GraphMapMatVal](../Graph.GraphMapMatVal.html "class in akka.stream")<[S](../Graph.GraphMapMatVal.html "type parameter in Graph.GraphMapMatVal") extends [Shape](../Shape.html "class in akka.stream"),​[M](../Graph.GraphMapMatVal.html "type parameter in Graph.GraphMapMatVal")>`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[RestartWithBackoffSink](#%3Cinit%3E(scala.Function0,akka.stream.RestartSettings))​(scala.Function0<[Sink](Sink.html "class in akka.stream.scaladsl")<[T](RestartWithBackoffSink.html "type parameter in RestartWithBackoffSink"),​?>> sinkFactory,  [RestartSettings](../RestartSettings.html "class in akka.stream") restartSettings)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[RestartWithBackoffLogic](RestartWithBackoffLogic.html "class in akka.stream.scaladsl")<[SinkShape](../SinkShape.html "class in akka.stream")<[T](RestartWithBackoffSink.html "type parameter in RestartWithBackoffSink")>>` | `[createLogic](#createLogic(akka.stream.Attributes))​([Attributes](../Attributes.html "class in akka.stream") inheritedAttributes)` |  |
	| `[Inlet](../Inlet.html "class in akka.stream")<[T](RestartWithBackoffSink.html "type parameter in RestartWithBackoffSink")>` | `[in](#in())()` |  |
	| `[SinkShape](../SinkShape.html "class in akka.stream")<[T](RestartWithBackoffSink.html "type parameter in RestartWithBackoffSink")>` | `[shape](#shape())()` | The shape of a graph is all that is externally visible: its inlets and outlets. |
	
	
		- ### Methods inherited from class akka.stream.stage.[GraphStage](../stage/GraphStage.html "class in akka.stream.stage")
		
		
		`[createLogicAndMaterializedValue](../stage/GraphStage.html#createLogicAndMaterializedValue(akka.stream.Attributes))`
		- ### Methods inherited from class akka.stream.stage.[GraphStageWithMaterializedValue](../stage/GraphStageWithMaterializedValue.html "class in akka.stream.stage")
		
		
		`[initialAttributes](../stage/GraphStageWithMaterializedValue.html#initialAttributes()), [withAttributes](../stage/GraphStageWithMaterializedValue.html#withAttributes(akka.stream.Attributes))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.stream.[Graph](../Graph.html "interface in akka.stream")
		
		
		`[addAttributes](../Graph.html#addAttributes(akka.stream.Attributes)), [async](../Graph.html#async()), [async](../Graph.html#async(java.lang.String)), [async](../Graph.html#async(java.lang.String,int)), [getAttributes](../Graph.html#getAttributes()), [named](../Graph.html#named(java.lang.String))`

- - ### Constructor Detail
	
	
	
		- #### RestartWithBackoffSink
		
		
		
		```
		public RestartWithBackoffSink​(scala.Function0<[Sink](Sink.html "class in akka.stream.scaladsl")<[T](RestartWithBackoffSink.html "type parameter in RestartWithBackoffSink"),​?>> sinkFactory,
		                              [RestartSettings](../RestartSettings.html "class in akka.stream") restartSettings)
		```

	- ### Method Detail
	
	
	
		- #### createLogic
		
		
		
		```
		public [RestartWithBackoffLogic](RestartWithBackoffLogic.html "class in akka.stream.scaladsl")<[SinkShape](../SinkShape.html "class in akka.stream")<[T](RestartWithBackoffSink.html "type parameter in RestartWithBackoffSink")>> createLogic​([Attributes](../Attributes.html "class in akka.stream") inheritedAttributes)
		```
		
		
		Specified by:
		`[createLogic](../stage/GraphStage.html#createLogic(akka.stream.Attributes))` in class `[GraphStage](../stage/GraphStage.html "class in akka.stream.stage")<[SinkShape](../SinkShape.html "class in akka.stream")<[T](RestartWithBackoffSink.html "type parameter in RestartWithBackoffSink")>>`
		- #### in
		
		
		
		```
		public [Inlet](../Inlet.html "class in akka.stream")<[T](RestartWithBackoffSink.html "type parameter in RestartWithBackoffSink")> in()
		```
		- #### shape
		
		
		
		```
		public [SinkShape](../SinkShape.html "class in akka.stream")<[T](RestartWithBackoffSink.html "type parameter in RestartWithBackoffSink")> shape()
		```
		
		Description copied from interface: `[Graph](../Graph.html#shape())`
		The shape of a graph is all that is externally visible: its inlets and outlets.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/NotUsed.html
- https://doc.akka.io/japi/akka/current/akka/stream/Attributes.html
- https://doc.akka.io/japi/akka/current/akka/stream/Graph.GraphMapMatVal.html
- https://doc.akka.io/japi/akka/current/akka/stream/Graph.html
- https://doc.akka.io/japi/akka/current/akka/stream/Inlet.html
- https://doc.akka.io/japi/akka/current/akka/stream/RestartSettings.html
- https://doc.akka.io/japi/akka/current/akka/stream/Shape.html
- https://doc.akka.io/japi/akka/current/akka/stream/SinkShape.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/RestartWithBackoffLogic.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/RestartWithBackoffSink.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/Sink.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/stream/stage/GraphStage.html
- https://doc.akka.io/japi/akka/current/akka/stream/stage/GraphStageWithMaterializedValue.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/RestartWithBackoffSink.html](https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/RestartWithBackoffSink.html)*