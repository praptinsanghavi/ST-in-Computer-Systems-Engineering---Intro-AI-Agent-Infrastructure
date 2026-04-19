---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:06:40Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/stream/scaladsl/Concat.html
title: Concat
---

# Concat

## Content

Package [akka.stream.scaladsl](package-summary.html)
## Class Concat\<T\>

- java.lang.Object
- - [akka.stream.stage.GraphStageWithMaterializedValue](../stage/GraphStageWithMaterializedValue.html "class in akka.stream.stage")\<S,​[NotUsed](../../NotUsed.html "class in akka")\>
	- - [akka.stream.stage.GraphStage](../stage/GraphStage.html "class in akka.stream.stage")\<[UniformFanInShape](../UniformFanInShape.html "class in akka.stream")\<T,​T\>\>
		- - akka.stream.scaladsl.Concat\<T\>

- All Implemented Interfaces:
`[Graph](../Graph.html "interface in akka.stream")<[UniformFanInShape](../UniformFanInShape.html "class in akka.stream")<T,​T>,​[NotUsed](../../NotUsed.html "class in akka")>`

---

```
public final class Concat<T>
extends [GraphStage](../stage/GraphStage.html "class in akka.stream.stage")<[UniformFanInShape](../UniformFanInShape.html "class in akka.stream")<T,​T>>
```

Takes multiple streams and outputs one stream formed from the input streams
 by first emitting all of the elements from the first stream and then emitting
 all of the elements from the second stream, etc.
 
 A `Concat` has one `first` port, one `second` port and one `out` port.
 

 '''Emits when''' the current stream has an element available; if the current input completes, it tries the next one
 

 '''Backpressures when''' downstream backpressures
 

 '''Completes when''' all upstreams complete
 

 '''Cancels when''' downstream cancels

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface akka.stream.[Graph](../Graph.html "interface in akka.stream")
		
		
		`[Graph.GraphMapMatVal](../Graph.GraphMapMatVal.html "class in akka.stream")<[S](../Graph.GraphMapMatVal.html "type parameter in Graph.GraphMapMatVal") extends [Shape](../Shape.html "class in akka.stream"),​[M](../Graph.GraphMapMatVal.html "type parameter in Graph.GraphMapMatVal")>`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Concat](#%3Cinit%3E(int))​(int inputPorts)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static <T> [Graph](../Graph.html "interface in akka.stream")<[UniformFanInShape](../UniformFanInShape.html "class in akka.stream")<T,​T>,​[NotUsed](../../NotUsed.html "class in akka")>` | `[apply](#apply(int))​(int inputPorts)` | Create a new `Concat`. |
	| `static <T> [Graph](../Graph.html "interface in akka.stream")<[UniformFanInShape](../UniformFanInShape.html "class in akka.stream")<T,​T>,​[NotUsed](../../NotUsed.html "class in akka")>` | `[apply](#apply(int,boolean))​(int inputPorts,  boolean detachedInputs)` | Create a new `Concat` operator that will concatenate two or more streams. |
	| `static <T> int` | `[apply$default$1](#apply$default$1())()` |  |
	| `[GraphStageLogic](../stage/GraphStageLogic.html "class in akka.stream.stage")` | `[createLogic](#createLogic(akka.stream.Attributes))​([Attributes](../Attributes.html "class in akka.stream") inheritedAttributes)` |  |
	| `scala.collection.immutable.IndexedSeq<[Inlet](../Inlet.html "class in akka.stream")<[T](Concat.html "type parameter in Concat")>>` | `[in](#in())()` |  |
	| `[Attributes](../Attributes.html "class in akka.stream")` | `[initialAttributes](#initialAttributes())()` |  |
	| `int` | `[inputPorts](#inputPorts())()` |  |
	| `[Outlet](../Outlet.html "class in akka.stream")<[T](Concat.html "type parameter in Concat")>` | `[out](#out())()` |  |
	| `[UniformFanInShape](../UniformFanInShape.html "class in akka.stream")<[T](Concat.html "type parameter in Concat"),​[T](Concat.html "type parameter in Concat")>` | `[shape](#shape())()` | The shape of a graph is all that is externally visible: its inlets and outlets. |
	| `java.lang.String` | `[toString](#toString())()` |  |
	
	
		- ### Methods inherited from class akka.stream.stage.[GraphStage](../stage/GraphStage.html "class in akka.stream.stage")
		
		
		`[createLogicAndMaterializedValue](../stage/GraphStage.html#createLogicAndMaterializedValue(akka.stream.Attributes))`
		- ### Methods inherited from class akka.stream.stage.[GraphStageWithMaterializedValue](../stage/GraphStageWithMaterializedValue.html "class in akka.stream.stage")
		
		
		`[withAttributes](../stage/GraphStageWithMaterializedValue.html#withAttributes(akka.stream.Attributes))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface akka.stream.[Graph](../Graph.html "interface in akka.stream")
		
		
		`[addAttributes](../Graph.html#addAttributes(akka.stream.Attributes)), [async](../Graph.html#async()), [async](../Graph.html#async(java.lang.String)), [async](../Graph.html#async(java.lang.String,int)), [getAttributes](../Graph.html#getAttributes()), [named](../Graph.html#named(java.lang.String))`

- - ### Constructor Detail
	
	
	
		- #### Concat
		
		
		
		```
		public Concat​(int inputPorts)
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static <T> [Graph](../Graph.html "interface in akka.stream")<[UniformFanInShape](../UniformFanInShape.html "class in akka.stream")<T,​T>,​[NotUsed](../../NotUsed.html "class in akka")> apply​(int inputPorts)
		```
		
		Create a new `Concat`. Note that this for historical reasons creates a "detached" Concat which
		 will eagerly pull each input on materialization and act as a one element buffer for each input.
		- #### apply
		
		
		
		```
		public static <T> [Graph](../Graph.html "interface in akka.stream")<[UniformFanInShape](../UniformFanInShape.html "class in akka.stream")<T,​T>,​[NotUsed](../../NotUsed.html "class in akka")> apply​(int inputPorts,
		                                                                          boolean detachedInputs)
		```
		
		Create a new `Concat` operator that will concatenate two or more streams.
		
		Parameters:
		`inputPorts` \- The number of fan\-in input ports
		`detachedInputs` \- If the ports should be detached (eagerly pull both inputs) useful to avoid deadlocks in graphs with loops
		Returns:
		- #### apply$default$1
		
		
		
		```
		public static <T> int apply$default$1()
		```
		- #### inputPorts
		
		
		
		```
		public int inputPorts()
		```
		- #### in
		
		
		
		```
		public scala.collection.immutable.IndexedSeq<[Inlet](../Inlet.html "class in akka.stream")<[T](Concat.html "type parameter in Concat")>> in()
		```
		- #### out
		
		
		
		```
		public [Outlet](../Outlet.html "class in akka.stream")<[T](Concat.html "type parameter in Concat")> out()
		```
		- #### initialAttributes
		
		
		
		```
		public [Attributes](../Attributes.html "class in akka.stream") initialAttributes()
		```
		
		
		Overrides:
		`[initialAttributes](../stage/GraphStageWithMaterializedValue.html#initialAttributes())` in class `[GraphStageWithMaterializedValue](../stage/GraphStageWithMaterializedValue.html "class in akka.stream.stage")<[UniformFanInShape](../UniformFanInShape.html "class in akka.stream")<[T](Concat.html "type parameter in Concat"),​[T](Concat.html "type parameter in Concat")>,​[NotUsed](../../NotUsed.html "class in akka")>`
		- #### shape
		
		
		
		```
		public [UniformFanInShape](../UniformFanInShape.html "class in akka.stream")<[T](Concat.html "type parameter in Concat"),​[T](Concat.html "type parameter in Concat")> shape()
		```
		
		Description copied from interface: `[Graph](../Graph.html#shape())`
		The shape of a graph is all that is externally visible: its inlets and outlets.
		- #### createLogic
		
		
		
		```
		public [GraphStageLogic](../stage/GraphStageLogic.html "class in akka.stream.stage") createLogic​([Attributes](../Attributes.html "class in akka.stream") inheritedAttributes)
		```
		
		
		Specified by:
		`[createLogic](../stage/GraphStage.html#createLogic(akka.stream.Attributes))` in class `[GraphStage](../stage/GraphStage.html "class in akka.stream.stage")<[UniformFanInShape](../UniformFanInShape.html "class in akka.stream")<[T](Concat.html "type parameter in Concat"),​[T](Concat.html "type parameter in Concat")>>`
		- #### toString
		
		
		
		```
		public java.lang.String toString()
		```
		
		
		Overrides:
		`toString` in class `java.lang.Object`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/NotUsed.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/Attributes.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/Graph.GraphMapMatVal.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/Graph.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/Inlet.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/Outlet.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/Shape.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/UniformFanInShape.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/scaladsl/Concat.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/scaladsl/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/stage/GraphStage.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/stage/GraphStageLogic.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/stage/GraphStageWithMaterializedValue.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/stream/scaladsl/Concat.html](https://doc.akka.io/japi/akka-core/2.10/akka/stream/scaladsl/Concat.html)*