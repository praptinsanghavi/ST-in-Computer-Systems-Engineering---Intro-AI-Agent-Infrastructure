---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:41:31Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/Interleave.html
title: Interleave
---

# Interleave

## Content

Package [akka.stream.scaladsl](package-summary.html)
## Class Interleave\<T\>

- java.lang.Object
- - [akka.stream.stage.GraphStageWithMaterializedValue](../stage/GraphStageWithMaterializedValue.html "class in akka.stream.stage")\<S,​[NotUsed](../../NotUsed.html "class in akka")\>
	- - [akka.stream.stage.GraphStage](../stage/GraphStage.html "class in akka.stream.stage")\<[UniformFanInShape](../UniformFanInShape.html "class in akka.stream")\<T,​T\>\>
		- - akka.stream.scaladsl.Interleave\<T\>

- All Implemented Interfaces:
`[Graph](../Graph.html "interface in akka.stream")<[UniformFanInShape](../UniformFanInShape.html "class in akka.stream")<T,​T>,​[NotUsed](../../NotUsed.html "class in akka")>`

---

```
public final class Interleave<T>
extends [GraphStage](../stage/GraphStage.html "class in akka.stream.stage")<[UniformFanInShape](../UniformFanInShape.html "class in akka.stream")<T,​T>>
```

Interleave represents deterministic merge which takes N elements per input stream,
 in\-order of inputs, emits them downstream and then cycles/"wraps\-around" the inputs.
 
 '''Emits when''' element is available from current input (depending on phase)
 

 '''Backpressures when''' downstream backpressures
 

 '''Completes when''' all upstreams complete (eagerClose\=false) or one upstream completes (eagerClose\=true)
 

 '''Cancels when''' downstream cancels

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface akka.stream.[Graph](../Graph.html "interface in akka.stream")
		
		
		`[Graph.GraphMapMatVal](../Graph.GraphMapMatVal.html "class in akka.stream")<[S](../Graph.GraphMapMatVal.html "type parameter in Graph.GraphMapMatVal") extends [Shape](../Shape.html "class in akka.stream"),​[M](../Graph.GraphMapMatVal.html "type parameter in Graph.GraphMapMatVal")>`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Interleave](#%3Cinit%3E(int,int,boolean))​(int inputPorts,  int segmentSize,  boolean eagerClose)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static <T> [Graph](../Graph.html "interface in akka.stream")<[UniformFanInShape](../UniformFanInShape.html "class in akka.stream")<T,​T>,​[NotUsed](../../NotUsed.html "class in akka")>` | `[apply](#apply(int,int,boolean))​(int inputPorts,  int segmentSize,  boolean eagerClose)` | Create a new `Interleave` with the specified number of input ports and given size of elements  to take from each input. |
	| `static <T> boolean` | `[apply$default$3](#apply$default$3())()` |  |
	| `[GraphStageLogic](../stage/GraphStageLogic.html "class in akka.stream.stage")` | `[createLogic](#createLogic(akka.stream.Attributes))​([Attributes](../Attributes.html "class in akka.stream") inheritedAttributes)` |  |
	| `boolean` | `[eagerClose](#eagerClose())()` |  |
	| `scala.collection.immutable.IndexedSeq<[Inlet](../Inlet.html "class in akka.stream")<[T](Interleave.html "type parameter in Interleave")>>` | `[in](#in())()` |  |
	| `int` | `[inputPorts](#inputPorts())()` |  |
	| `[Outlet](../Outlet.html "class in akka.stream")<[T](Interleave.html "type parameter in Interleave")>` | `[out](#out())()` |  |
	| `int` | `[segmentSize](#segmentSize())()` |  |
	| `[UniformFanInShape](../UniformFanInShape.html "class in akka.stream")<[T](Interleave.html "type parameter in Interleave"),​[T](Interleave.html "type parameter in Interleave")>` | `[shape](#shape())()` | The shape of a graph is all that is externally visible: its inlets and outlets. |
	| `java.lang.String` | `[toString](#toString())()` |  |
	
	
		- ### Methods inherited from class akka.stream.stage.[GraphStage](../stage/GraphStage.html "class in akka.stream.stage")
		
		
		`[createLogicAndMaterializedValue](../stage/GraphStage.html#createLogicAndMaterializedValue(akka.stream.Attributes))`
		- ### Methods inherited from class akka.stream.stage.[GraphStageWithMaterializedValue](../stage/GraphStageWithMaterializedValue.html "class in akka.stream.stage")
		
		
		`[initialAttributes](../stage/GraphStageWithMaterializedValue.html#initialAttributes()), [withAttributes](../stage/GraphStageWithMaterializedValue.html#withAttributes(akka.stream.Attributes))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface akka.stream.[Graph](../Graph.html "interface in akka.stream")
		
		
		`[addAttributes](../Graph.html#addAttributes(akka.stream.Attributes)), [async](../Graph.html#async()), [async](../Graph.html#async(java.lang.String)), [async](../Graph.html#async(java.lang.String,int)), [getAttributes](../Graph.html#getAttributes()), [named](../Graph.html#named(java.lang.String))`

- - ### Constructor Detail
	
	
	
		- #### Interleave
		
		
		
		```
		public Interleave​(int inputPorts,
		                  int segmentSize,
		                  boolean eagerClose)
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static <T> [Graph](../Graph.html "interface in akka.stream")<[UniformFanInShape](../UniformFanInShape.html "class in akka.stream")<T,​T>,​[NotUsed](../../NotUsed.html "class in akka")> apply​(int inputPorts,
		                                                                          int segmentSize,
		                                                                          boolean eagerClose)
		```
		
		Create a new `Interleave` with the specified number of input ports and given size of elements
		 to take from each input.
		 
		
		Parameters:
		`inputPorts` \- number of input ports
		`segmentSize` \- number of elements to send downstream before switching to next input port
		`eagerClose` \- if true, interleave completes upstream if any of its upstream completes.
		- #### apply$default$3
		
		
		
		```
		public static <T> boolean apply$default$3()
		```
		- #### inputPorts
		
		
		
		```
		public int inputPorts()
		```
		- #### segmentSize
		
		
		
		```
		public int segmentSize()
		```
		- #### eagerClose
		
		
		
		```
		public boolean eagerClose()
		```
		- #### in
		
		
		
		```
		public scala.collection.immutable.IndexedSeq<[Inlet](../Inlet.html "class in akka.stream")<[T](Interleave.html "type parameter in Interleave")>> in()
		```
		- #### out
		
		
		
		```
		public [Outlet](../Outlet.html "class in akka.stream")<[T](Interleave.html "type parameter in Interleave")> out()
		```
		- #### shape
		
		
		
		```
		public [UniformFanInShape](../UniformFanInShape.html "class in akka.stream")<[T](Interleave.html "type parameter in Interleave"),​[T](Interleave.html "type parameter in Interleave")> shape()
		```
		
		Description copied from interface: `[Graph](../Graph.html#shape())`
		The shape of a graph is all that is externally visible: its inlets and outlets.
		- #### createLogic
		
		
		
		```
		public [GraphStageLogic](../stage/GraphStageLogic.html "class in akka.stream.stage") createLogic​([Attributes](../Attributes.html "class in akka.stream") inheritedAttributes)
		```
		
		
		Specified by:
		`[createLogic](../stage/GraphStage.html#createLogic(akka.stream.Attributes))` in class `[GraphStage](../stage/GraphStage.html "class in akka.stream.stage")<[UniformFanInShape](../UniformFanInShape.html "class in akka.stream")<[T](Interleave.html "type parameter in Interleave"),​[T](Interleave.html "type parameter in Interleave")>>`
		- #### toString
		
		
		
		```
		public java.lang.String toString()
		```
		
		
		Overrides:
		`toString` in class `java.lang.Object`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/NotUsed.html
- https://doc.akka.io/japi/akka/current/akka/stream/Attributes.html
- https://doc.akka.io/japi/akka/current/akka/stream/Graph.GraphMapMatVal.html
- https://doc.akka.io/japi/akka/current/akka/stream/Graph.html
- https://doc.akka.io/japi/akka/current/akka/stream/Inlet.html
- https://doc.akka.io/japi/akka/current/akka/stream/Outlet.html
- https://doc.akka.io/japi/akka/current/akka/stream/Shape.html
- https://doc.akka.io/japi/akka/current/akka/stream/UniformFanInShape.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/Interleave.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/stream/stage/GraphStage.html
- https://doc.akka.io/japi/akka/current/akka/stream/stage/GraphStageLogic.html
- https://doc.akka.io/japi/akka/current/akka/stream/stage/GraphStageWithMaterializedValue.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/Interleave.html](https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/Interleave.html)*