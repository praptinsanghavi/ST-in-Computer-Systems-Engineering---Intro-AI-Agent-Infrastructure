---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:06:45Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/stream/scaladsl/MergeSorted.html
title: MergeSorted
---

# MergeSorted

## Content

Package [akka.stream.scaladsl](package-summary.html)
## Class MergeSorted\<T\>

- java.lang.Object
- - [akka.stream.stage.GraphStageWithMaterializedValue](../stage/GraphStageWithMaterializedValue.html "class in akka.stream.stage")\<S,​[NotUsed](../../NotUsed.html "class in akka")\>
	- - [akka.stream.stage.GraphStage](../stage/GraphStage.html "class in akka.stream.stage")\<[FanInShape2](../FanInShape2.html "class in akka.stream")\<T,​T,​T\>\>
		- - akka.stream.scaladsl.MergeSorted\<T\>

- All Implemented Interfaces:
`[Graph](../Graph.html "interface in akka.stream")<[FanInShape2](../FanInShape2.html "class in akka.stream")<T,​T,​T>,​[NotUsed](../../NotUsed.html "class in akka")>`

---

```
public final class MergeSorted<T>
extends [GraphStage](../stage/GraphStage.html "class in akka.stream.stage")<[FanInShape2](../FanInShape2.html "class in akka.stream")<T,​T,​T>>
```

Merge two pre\-sorted streams such that the resulting stream is sorted.
 
 '''Emits when''' both inputs have an element available
 

 '''Backpressures when''' downstream backpressures
 

 '''Completes when''' all upstreams complete
 

 '''Cancels when''' downstream cancels

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface akka.stream.[Graph](../Graph.html "interface in akka.stream")
		
		
		`[Graph.GraphMapMatVal](../Graph.GraphMapMatVal.html "class in akka.stream")<[S](../Graph.GraphMapMatVal.html "type parameter in Graph.GraphMapMatVal") extends [Shape](../Shape.html "class in akka.stream"),​[M](../Graph.GraphMapMatVal.html "type parameter in Graph.GraphMapMatVal")>`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[MergeSorted](#%3Cinit%3E(scala.math.Ordering))​(scala.math.Ordering<[T](MergeSorted.html "type parameter in MergeSorted")> evidence$1)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[GraphStageLogic](../stage/GraphStageLogic.html "class in akka.stream.stage")` | `[createLogic](#createLogic(akka.stream.Attributes))​([Attributes](../Attributes.html "class in akka.stream") attr)` |  |
	| `[FanInShape2](../FanInShape2.html "class in akka.stream")<[T](MergeSorted.html "type parameter in MergeSorted"),​[T](MergeSorted.html "type parameter in MergeSorted"),​[T](MergeSorted.html "type parameter in MergeSorted")>` | `[shape](#shape())()` | The shape of a graph is all that is externally visible: its inlets and outlets. |
	
	
		- ### Methods inherited from class akka.stream.stage.[GraphStage](../stage/GraphStage.html "class in akka.stream.stage")
		
		
		`[createLogicAndMaterializedValue](../stage/GraphStage.html#createLogicAndMaterializedValue(akka.stream.Attributes))`
		- ### Methods inherited from class akka.stream.stage.[GraphStageWithMaterializedValue](../stage/GraphStageWithMaterializedValue.html "class in akka.stream.stage")
		
		
		`[initialAttributes](../stage/GraphStageWithMaterializedValue.html#initialAttributes()), [withAttributes](../stage/GraphStageWithMaterializedValue.html#withAttributes(akka.stream.Attributes))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.stream.[Graph](../Graph.html "interface in akka.stream")
		
		
		`[addAttributes](../Graph.html#addAttributes(akka.stream.Attributes)), [async](../Graph.html#async()), [async](../Graph.html#async(java.lang.String)), [async](../Graph.html#async(java.lang.String,int)), [getAttributes](../Graph.html#getAttributes()), [named](../Graph.html#named(java.lang.String))`

- - ### Constructor Detail
	
	
	
		- #### MergeSorted
		
		
		
		```
		public MergeSorted​(scala.math.Ordering<[T](MergeSorted.html "type parameter in MergeSorted")> evidence$1)
		```

	- ### Method Detail
	
	
	
		- #### createLogic
		
		
		
		```
		public [GraphStageLogic](../stage/GraphStageLogic.html "class in akka.stream.stage") createLogic​([Attributes](../Attributes.html "class in akka.stream") attr)
		```
		
		
		Specified by:
		`[createLogic](../stage/GraphStage.html#createLogic(akka.stream.Attributes))` in class `[GraphStage](../stage/GraphStage.html "class in akka.stream.stage")<[FanInShape2](../FanInShape2.html "class in akka.stream")<[T](MergeSorted.html "type parameter in MergeSorted"),​[T](MergeSorted.html "type parameter in MergeSorted"),​[T](MergeSorted.html "type parameter in MergeSorted")>>`
		- #### shape
		
		
		
		```
		public [FanInShape2](../FanInShape2.html "class in akka.stream")<[T](MergeSorted.html "type parameter in MergeSorted"),​[T](MergeSorted.html "type parameter in MergeSorted"),​[T](MergeSorted.html "type parameter in MergeSorted")> shape()
		```
		
		Description copied from interface: `[Graph](../Graph.html#shape())`
		The shape of a graph is all that is externally visible: its inlets and outlets.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/NotUsed.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/Attributes.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/FanInShape2.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/Graph.GraphMapMatVal.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/Graph.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/Shape.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/scaladsl/MergeSorted.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/scaladsl/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/stage/GraphStage.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/stage/GraphStageLogic.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/stage/GraphStageWithMaterializedValue.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/stream/scaladsl/MergeSorted.html](https://doc.akka.io/japi/akka-core/2.10/akka/stream/scaladsl/MergeSorted.html)*