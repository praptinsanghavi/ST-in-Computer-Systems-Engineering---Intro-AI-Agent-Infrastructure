---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:47:41Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/2.10/akka/stream/scaladsl/MergeLatest.html
title: MergeLatest
---

# MergeLatest

## Content

Package [akka.stream.scaladsl](package-summary.html)
## Class MergeLatest\<T,​M\>

- java.lang.Object
- - [akka.stream.stage.GraphStageWithMaterializedValue](../stage/GraphStageWithMaterializedValue.html "class in akka.stream.stage")\<S,​[NotUsed](../../NotUsed.html "class in akka")\>
	- - [akka.stream.stage.GraphStage](../stage/GraphStage.html "class in akka.stream.stage")\<[UniformFanInShape](../UniformFanInShape.html "class in akka.stream")\<T,​M\>\>
		- - akka.stream.scaladsl.MergeLatest\<T,​M\>

- All Implemented Interfaces:
`[Graph](../Graph.html "interface in akka.stream")<[UniformFanInShape](../UniformFanInShape.html "class in akka.stream")<T,​M>,​[NotUsed](../../NotUsed.html "class in akka")>`

---

```
public final class MergeLatest<T,​M>
extends [GraphStage](../stage/GraphStage.html "class in akka.stream.stage")<[UniformFanInShape](../UniformFanInShape.html "class in akka.stream")<T,​M>>
```

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface akka.stream.[Graph](../Graph.html "interface in akka.stream")
		
		
		`[Graph.GraphMapMatVal](../Graph.GraphMapMatVal.html "class in akka.stream")<[S](../Graph.GraphMapMatVal.html "type parameter in Graph.GraphMapMatVal") extends [Shape](../Shape.html "class in akka.stream"),​[M](../Graph.GraphMapMatVal.html "type parameter in Graph.GraphMapMatVal")>`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[MergeLatest](#%3Cinit%3E(int,boolean,scala.Function1))​(int inputPorts,  boolean eagerClose,  scala.Function1<java.lang.Object,​[M](MergeLatest.html "type parameter in MergeLatest")> buildElem)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static <T> [GraphStage](../stage/GraphStage.html "class in akka.stream.stage")<[UniformFanInShape](../UniformFanInShape.html "class in akka.stream")<T,​scala.collection.immutable.List<T>>>` | `[apply](#apply(int,boolean))​(int inputPorts,  boolean eagerComplete)` | Create a new `MergeLatest` with the specified number of input ports. |
	| `static <T> boolean` | `[apply$default$2](#apply$default$2())()` |  |
	| `[GraphStageLogic](../stage/GraphStageLogic.html "class in akka.stream.stage")` | `[createLogic](#createLogic(akka.stream.Attributes))​([Attributes](../Attributes.html "class in akka.stream") inheritedAttributes)` |  |
	| `boolean` | `[eagerClose](#eagerClose())()` |  |
	| `scala.collection.immutable.IndexedSeq<[Inlet](../Inlet.html "class in akka.stream")<[T](MergeLatest.html "type parameter in MergeLatest")>>` | `[in](#in())()` |  |
	| `int` | `[inputPorts](#inputPorts())()` |  |
	| `[Outlet](../Outlet.html "class in akka.stream")<[M](MergeLatest.html "type parameter in MergeLatest")>` | `[out](#out())()` |  |
	| `[UniformFanInShape](../UniformFanInShape.html "class in akka.stream")<[T](MergeLatest.html "type parameter in MergeLatest"),​[M](MergeLatest.html "type parameter in MergeLatest")>` | `[shape](#shape())()` | The shape of a graph is all that is externally visible: its inlets and outlets. |
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
	
	
	
		- #### MergeLatest
		
		
		
		```
		public MergeLatest​(int inputPorts,
		                   boolean eagerClose,
		                   scala.Function1<java.lang.Object,​[M](MergeLatest.html "type parameter in MergeLatest")> buildElem)
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static <T> [GraphStage](../stage/GraphStage.html "class in akka.stream.stage")<[UniformFanInShape](../UniformFanInShape.html "class in akka.stream")<T,​scala.collection.immutable.List<T>>> apply​(int inputPorts,
		                                                                                                  boolean eagerComplete)
		```
		
		Create a new `MergeLatest` with the specified number of input ports.
		 
		
		Parameters:
		`inputPorts` \- number of input ports
		`eagerComplete` \- if true, the merge latest will complete as soon as one of its inputs completes.
		- #### apply$default$2
		
		
		
		```
		public static <T> boolean apply$default$2()
		```
		- #### inputPorts
		
		
		
		```
		public int inputPorts()
		```
		- #### eagerClose
		
		
		
		```
		public boolean eagerClose()
		```
		- #### in
		
		
		
		```
		public scala.collection.immutable.IndexedSeq<[Inlet](../Inlet.html "class in akka.stream")<[T](MergeLatest.html "type parameter in MergeLatest")>> in()
		```
		- #### out
		
		
		
		```
		public [Outlet](../Outlet.html "class in akka.stream")<[M](MergeLatest.html "type parameter in MergeLatest")> out()
		```
		- #### shape
		
		
		
		```
		public [UniformFanInShape](../UniformFanInShape.html "class in akka.stream")<[T](MergeLatest.html "type parameter in MergeLatest"),​[M](MergeLatest.html "type parameter in MergeLatest")> shape()
		```
		
		Description copied from interface: `[Graph](../Graph.html#shape())`
		The shape of a graph is all that is externally visible: its inlets and outlets.
		- #### createLogic
		
		
		
		```
		public [GraphStageLogic](../stage/GraphStageLogic.html "class in akka.stream.stage") createLogic​([Attributes](../Attributes.html "class in akka.stream") inheritedAttributes)
		```
		
		
		Specified by:
		`[createLogic](../stage/GraphStage.html#createLogic(akka.stream.Attributes))` in class `[GraphStage](../stage/GraphStage.html "class in akka.stream.stage")<[UniformFanInShape](../UniformFanInShape.html "class in akka.stream")<[T](MergeLatest.html "type parameter in MergeLatest"),​[M](MergeLatest.html "type parameter in MergeLatest")>>`
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
- https://doc.akka.io/japi/akka/2.10/akka/stream/scaladsl/MergeLatest.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/scaladsl/package-summary.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/stage/GraphStage.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/stage/GraphStageLogic.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/stage/GraphStageWithMaterializedValue.html

---
*Source: [https://doc.akka.io/japi/akka/2.10/akka/stream/scaladsl/MergeLatest.html](https://doc.akka.io/japi/akka/2.10/akka/stream/scaladsl/MergeLatest.html)*