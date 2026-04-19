---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:06:46Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/stream/scaladsl/Partition.html
title: Partition
---

# Partition

## Content

Package [akka.stream.scaladsl](package-summary.html)
## Class Partition\<T\>

- java.lang.Object
- - [akka.stream.stage.GraphStageWithMaterializedValue](../stage/GraphStageWithMaterializedValue.html "class in akka.stream.stage")\<S,​[NotUsed](../../NotUsed.html "class in akka")\>
	- - [akka.stream.stage.GraphStage](../stage/GraphStage.html "class in akka.stream.stage")\<[UniformFanOutShape](../UniformFanOutShape.html "class in akka.stream")\<T,​T\>\>
		- - akka.stream.scaladsl.Partition\<T\>

- All Implemented Interfaces:
`[Graph](../Graph.html "interface in akka.stream")<[UniformFanOutShape](../UniformFanOutShape.html "class in akka.stream")<T,​T>,​[NotUsed](../../NotUsed.html "class in akka")>`

---

```
public final class Partition<T>
extends [GraphStage](../stage/GraphStage.html "class in akka.stream.stage")<[UniformFanOutShape](../UniformFanOutShape.html "class in akka.stream")<T,​T>>
```

Fan\-out the stream to several streams. emitting an incoming upstream element to one downstream consumer according
 to the partitioner function applied to the element
 
 Adheres to the `ActorAttributes.SupervisionStrategy` attribute.
 

 '''Emits when''' emits when an element is available from the input and the chosen output has demand
 

 '''Backpressures when''' the currently chosen output back\-pressures
 

 '''Completes when''' upstream completes and no output is pending
 

 '''Cancels when''' all downstreams have cancelled (eagerCancel\=false) or one downstream cancels (eagerCancel\=true)

- - ### Nested Class Summary
	
	
	
	Nested Classes 
	| Modifier and Type | Class | Description |
	| `static class` | `[Partition.PartitionOutOfBoundsException](Partition.PartitionOutOfBoundsException.html "class in akka.stream.scaladsl")` |  |
	| `static class` | `[Partition.PartitionOutOfBoundsException$](Partition.PartitionOutOfBoundsException$.html "class in akka.stream.scaladsl")` |  |
	
	
		- ### Nested classes/interfaces inherited from interface akka.stream.[Graph](../Graph.html "interface in akka.stream")
		
		
		`[Graph.GraphMapMatVal](../Graph.GraphMapMatVal.html "class in akka.stream")<[S](../Graph.GraphMapMatVal.html "type parameter in Graph.GraphMapMatVal") extends [Shape](../Shape.html "class in akka.stream"),​[M](../Graph.GraphMapMatVal.html "type parameter in Graph.GraphMapMatVal")>`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Partition](#%3Cinit%3E(int,scala.Function1,boolean))​(int outputPorts,  scala.Function1<[T](Partition.html "type parameter in Partition"),​java.lang.Object> partitioner,  boolean eagerCancel)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static <T> [Partition](Partition.html "class in akka.stream.scaladsl")<T>` | `[apply](#apply(int,scala.Function1))​(int outputPorts,  scala.Function1<T,​java.lang.Object> partitioner)` | Create a new `Partition` operator with the specified input type. |
	| `[GraphStageLogic](../stage/GraphStageLogic.html "class in akka.stream.stage")` | `[createLogic](#createLogic(akka.stream.Attributes))​([Attributes](../Attributes.html "class in akka.stream") inheritedAttributes)` |  |
	| `boolean` | `[eagerCancel](#eagerCancel())()` |  |
	| `[Inlet](../Inlet.html "class in akka.stream")<[T](Partition.html "type parameter in Partition")>` | `[in](#in())()` |  |
	| `scala.collection.immutable.Seq<[Outlet](../Outlet.html "class in akka.stream")<[T](Partition.html "type parameter in Partition")>>` | `[out](#out())()` |  |
	| `int` | `[outputPorts](#outputPorts())()` |  |
	| `scala.Function1<[T](Partition.html "type parameter in Partition"),​java.lang.Object>` | `[partitioner](#partitioner())()` |  |
	| `[UniformFanOutShape](../UniformFanOutShape.html "class in akka.stream")<[T](Partition.html "type parameter in Partition"),​[T](Partition.html "type parameter in Partition")>` | `[shape](#shape())()` | The shape of a graph is all that is externally visible: its inlets and outlets. |
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
	
	
	
		- #### Partition
		
		
		
		```
		public Partition​(int outputPorts,
		                 scala.Function1<[T](Partition.html "type parameter in Partition"),​java.lang.Object> partitioner,
		                 boolean eagerCancel)
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static <T> [Partition](Partition.html "class in akka.stream.scaladsl")<T> apply​(int outputPorts,
		                                     scala.Function1<T,​java.lang.Object> partitioner)
		```
		
		Create a new `Partition` operator with the specified input type. This method sets `eagerCancel` to `false`.
		 To specify a different value for the `eagerCancel` parameter, then instantiate Partition using the constructor.
		 
		 If `eagerCancel` is true, partition cancels upstream if any of its downstreams cancel, if false, when all have cancelled.
		 
		
		
		
		Parameters:
		`outputPorts` \- number of output ports
		`partitioner` \- function deciding which output each element will be targeted
		- #### outputPorts
		
		
		
		```
		public int outputPorts()
		```
		- #### partitioner
		
		
		
		```
		public scala.Function1<[T](Partition.html "type parameter in Partition"),​java.lang.Object> partitioner()
		```
		- #### eagerCancel
		
		
		
		```
		public boolean eagerCancel()
		```
		- #### in
		
		
		
		```
		public [Inlet](../Inlet.html "class in akka.stream")<[T](Partition.html "type parameter in Partition")> in()
		```
		- #### out
		
		
		
		```
		public scala.collection.immutable.Seq<[Outlet](../Outlet.html "class in akka.stream")<[T](Partition.html "type parameter in Partition")>> out()
		```
		- #### shape
		
		
		
		```
		public [UniformFanOutShape](../UniformFanOutShape.html "class in akka.stream")<[T](Partition.html "type parameter in Partition"),​[T](Partition.html "type parameter in Partition")> shape()
		```
		
		Description copied from interface: `[Graph](../Graph.html#shape())`
		The shape of a graph is all that is externally visible: its inlets and outlets.
		- #### createLogic
		
		
		
		```
		public [GraphStageLogic](../stage/GraphStageLogic.html "class in akka.stream.stage") createLogic​([Attributes](../Attributes.html "class in akka.stream") inheritedAttributes)
		```
		
		
		Specified by:
		`[createLogic](../stage/GraphStage.html#createLogic(akka.stream.Attributes))` in class `[GraphStage](../stage/GraphStage.html "class in akka.stream.stage")<[UniformFanOutShape](../UniformFanOutShape.html "class in akka.stream")<[T](Partition.html "type parameter in Partition"),​[T](Partition.html "type parameter in Partition")>>`
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
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/UniformFanOutShape.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/scaladsl/Partition.PartitionOutOfBoundsException$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/scaladsl/Partition.PartitionOutOfBoundsException.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/scaladsl/Partition.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/scaladsl/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/stage/GraphStage.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/stage/GraphStageLogic.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/stage/GraphStageWithMaterializedValue.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/stream/scaladsl/Partition.html](https://doc.akka.io/japi/akka-core/2.10/akka/stream/scaladsl/Partition.html)*