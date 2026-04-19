---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:47:39Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/2.10/akka/stream/scaladsl/Merge.html
title: Merge
---

# Merge

## Content

Package [akka.stream.scaladsl](package-summary.html)
## Class Merge\<T\>

- java.lang.Object
- - [akka.stream.stage.GraphStageWithMaterializedValue](../stage/GraphStageWithMaterializedValue.html "class in akka.stream.stage")\<S,​[NotUsed](../../NotUsed.html "class in akka")\>
	- - [akka.stream.stage.GraphStage](../stage/GraphStage.html "class in akka.stream.stage")\<[UniformFanInShape](../UniformFanInShape.html "class in akka.stream")\<T,​T\>\>
		- - akka.stream.scaladsl.Merge\<T\>

- All Implemented Interfaces:
`[Graph](../Graph.html "interface in akka.stream")<[UniformFanInShape](../UniformFanInShape.html "class in akka.stream")<T,​T>,​[NotUsed](../../NotUsed.html "class in akka")>`

---

```
public final class Merge<T>
extends [GraphStage](../stage/GraphStage.html "class in akka.stream.stage")<[UniformFanInShape](../UniformFanInShape.html "class in akka.stream")<T,​T>>
```

Merge several streams, taking elements as they arrive from input streams
 (picking randomly when several have elements ready).
 
 '''Emits when''' one of the inputs has an element available
 

 '''Backpressures when''' downstream backpressures
 

 '''Completes when''' all upstreams complete (eagerComplete\=false) or one upstream completes (eagerComplete\=true), default value is `false`

 '''Cancels when''' downstream cancels

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface akka.stream.[Graph](../Graph.html "interface in akka.stream")
		
		
		`[Graph.GraphMapMatVal](../Graph.GraphMapMatVal.html "class in akka.stream")<[S](../Graph.GraphMapMatVal.html "type parameter in Graph.GraphMapMatVal") extends [Shape](../Shape.html "class in akka.stream"),​[M](../Graph.GraphMapMatVal.html "type parameter in Graph.GraphMapMatVal")>`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Merge](#%3Cinit%3E(int,boolean))​(int inputPorts,  boolean eagerComplete)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static <T> [Merge](Merge.html "class in akka.stream.scaladsl")<T>` | `[apply](#apply(int,boolean))​(int inputPorts,  boolean eagerComplete)` | Create a new `Merge` with the specified number of input ports. |
	| `static <T> boolean` | `[apply$default$2](#apply$default$2())()` |  |
	| `[GraphStageLogic](../stage/GraphStageLogic.html "class in akka.stream.stage")` | `[createLogic](#createLogic(akka.stream.Attributes))​([Attributes](../Attributes.html "class in akka.stream") inheritedAttributes)` |  |
	| `boolean` | `[eagerComplete](#eagerComplete())()` |  |
	| `scala.collection.immutable.IndexedSeq<[Inlet](../Inlet.html "class in akka.stream")<[T](Merge.html "type parameter in Merge")>>` | `[in](#in())()` |  |
	| `[Attributes](../Attributes.html "class in akka.stream")` | `[initialAttributes](#initialAttributes())()` |  |
	| `int` | `[inputPorts](#inputPorts())()` |  |
	| `[Outlet](../Outlet.html "class in akka.stream")<[T](Merge.html "type parameter in Merge")>` | `[out](#out())()` |  |
	| `[UniformFanInShape](../UniformFanInShape.html "class in akka.stream")<[T](Merge.html "type parameter in Merge"),​[T](Merge.html "type parameter in Merge")>` | `[shape](#shape())()` | The shape of a graph is all that is externally visible: its inlets and outlets. |
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
	
	
	
		- #### Merge
		
		
		
		```
		public Merge​(int inputPorts,
		             boolean eagerComplete)
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static <T> [Merge](Merge.html "class in akka.stream.scaladsl")<T> apply​(int inputPorts,
		                                 boolean eagerComplete)
		```
		
		Create a new `Merge` with the specified number of input ports.
		 
		
		Parameters:
		`inputPorts` \- number of input ports
		`eagerComplete` \- if true, the merge will complete as soon as one of its inputs completes.
		- #### apply$default$2
		
		
		
		```
		public static <T> boolean apply$default$2()
		```
		- #### inputPorts
		
		
		
		```
		public int inputPorts()
		```
		- #### eagerComplete
		
		
		
		```
		public boolean eagerComplete()
		```
		- #### in
		
		
		
		```
		public scala.collection.immutable.IndexedSeq<[Inlet](../Inlet.html "class in akka.stream")<[T](Merge.html "type parameter in Merge")>> in()
		```
		- #### out
		
		
		
		```
		public [Outlet](../Outlet.html "class in akka.stream")<[T](Merge.html "type parameter in Merge")> out()
		```
		- #### initialAttributes
		
		
		
		```
		public [Attributes](../Attributes.html "class in akka.stream") initialAttributes()
		```
		
		
		Overrides:
		`[initialAttributes](../stage/GraphStageWithMaterializedValue.html#initialAttributes())` in class `[GraphStageWithMaterializedValue](../stage/GraphStageWithMaterializedValue.html "class in akka.stream.stage")<[UniformFanInShape](../UniformFanInShape.html "class in akka.stream")<[T](Merge.html "type parameter in Merge"),​[T](Merge.html "type parameter in Merge")>,​[NotUsed](../../NotUsed.html "class in akka")>`
		- #### shape
		
		
		
		```
		public [UniformFanInShape](../UniformFanInShape.html "class in akka.stream")<[T](Merge.html "type parameter in Merge"),​[T](Merge.html "type parameter in Merge")> shape()
		```
		
		Description copied from interface: `[Graph](../Graph.html#shape())`
		The shape of a graph is all that is externally visible: its inlets and outlets.
		- #### createLogic
		
		
		
		```
		public [GraphStageLogic](../stage/GraphStageLogic.html "class in akka.stream.stage") createLogic​([Attributes](../Attributes.html "class in akka.stream") inheritedAttributes)
		```
		
		
		Specified by:
		`[createLogic](../stage/GraphStage.html#createLogic(akka.stream.Attributes))` in class `[GraphStage](../stage/GraphStage.html "class in akka.stream.stage")<[UniformFanInShape](../UniformFanInShape.html "class in akka.stream")<[T](Merge.html "type parameter in Merge"),​[T](Merge.html "type parameter in Merge")>>`
		- #### toString
		
		
		
		```
		public java.lang.String toString()
		```
		
		
		Overrides:
		`toString` in class `java.lang.Object`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/2.10/akka/NotUsed.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/Attributes.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/Graph.GraphMapMatVal.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/Graph.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/Inlet.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/Outlet.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/Shape.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/UniformFanInShape.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/scaladsl/Merge.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/scaladsl/package-summary.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/stage/GraphStage.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/stage/GraphStageLogic.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/stage/GraphStageWithMaterializedValue.html

---
*Source: [https://doc.akka.io/japi/akka/2.10/akka/stream/scaladsl/Merge.html](https://doc.akka.io/japi/akka/2.10/akka/stream/scaladsl/Merge.html)*