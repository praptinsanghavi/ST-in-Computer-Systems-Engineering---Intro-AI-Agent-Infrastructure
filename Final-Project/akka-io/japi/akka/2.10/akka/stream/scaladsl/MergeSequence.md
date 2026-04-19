---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:47:43Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/2.10/akka/stream/scaladsl/MergeSequence.html
title: MergeSequence
---

# MergeSequence

## Content

Package [akka.stream.scaladsl](package-summary.html)
## Class MergeSequence\<T\>

- java.lang.Object
- - [akka.stream.stage.GraphStageWithMaterializedValue](../stage/GraphStageWithMaterializedValue.html "class in akka.stream.stage")\<S,​[NotUsed](../../NotUsed.html "class in akka")\>
	- - [akka.stream.stage.GraphStage](../stage/GraphStage.html "class in akka.stream.stage")\<[UniformFanInShape](../UniformFanInShape.html "class in akka.stream")\<T,​T\>\>
		- - akka.stream.scaladsl.MergeSequence\<T\>

- All Implemented Interfaces:
`[Graph](../Graph.html "interface in akka.stream")<[UniformFanInShape](../UniformFanInShape.html "class in akka.stream")<T,​T>,​[NotUsed](../../NotUsed.html "class in akka")>`

---

```
public final class MergeSequence<T>
extends [GraphStage](../stage/GraphStage.html "class in akka.stream.stage")<[UniformFanInShape](../UniformFanInShape.html "class in akka.stream")<T,​T>>
```

Takes multiple streams whose elements in aggregate have a defined linear
 sequence with difference 1, starting at 0, and outputs a single stream
 containing these elements, in order. That is, given a set of input streams
 with combined elements \*ek\*:
 
 \*e0\*, \*e1\*, \*e2\*, ..., \*en\*
 

 This will output a stream ordered by \*k\*.
 

 The elements in the input streams must already be sorted according to the
 sequence. The input streams do not need to be linear, but the aggregate
 stream must be linear, no element \*k\* may be skipped or duplicated, either
 of these conditions will cause the stream to fail.
 

 The typical use case for this is to merge a partitioned stream back
 together while maintaining order. This can be achieved by first using
 `zipWithIndex` on the input stream, then partitioning using a
 [`Partition`](Partition.html "class in akka.stream.scaladsl") fanout, and then maintaining the index through the processing
 of each partition before bringing together with this stage.
 

 '''Emits when''' one of the upstreams has the next expected element in the
 sequence available.
 

 '''Backpressures when''' downstream backpressures
 

 '''Completes when''' all upstreams complete
 

 '''Cancels when''' downstream cancels

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface akka.stream.[Graph](../Graph.html "interface in akka.stream")
		
		
		`[Graph.GraphMapMatVal](../Graph.GraphMapMatVal.html "class in akka.stream")<[S](../Graph.GraphMapMatVal.html "type parameter in Graph.GraphMapMatVal") extends [Shape](../Shape.html "class in akka.stream"),​[M](../Graph.GraphMapMatVal.html "type parameter in Graph.GraphMapMatVal")>`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[MergeSequence](#%3Cinit%3E(int,scala.Function1))​(int inputPorts,  scala.Function1<[T](MergeSequence.html "type parameter in MergeSequence"),​java.lang.Object> extractSequence)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static <T> [Graph](../Graph.html "interface in akka.stream")<[UniformFanInShape](../UniformFanInShape.html "class in akka.stream")<T,​T>,​[NotUsed](../../NotUsed.html "class in akka")>` | `[apply](#apply(int,scala.Function1))​(int inputPorts,  scala.Function1<T,​java.lang.Object> extractSequence)` |  |
	| `static <T> int` | `[apply$default$1](#apply$default$1())()` |  |
	| `[GraphStageLogic](../stage/GraphStageLogic.html "class in akka.stream.stage")` | `[createLogic](#createLogic(akka.stream.Attributes))​([Attributes](../Attributes.html "class in akka.stream") inheritedAttributes)` |  |
	| `int` | `[inputPorts](#inputPorts())()` |  |
	| `[UniformFanInShape](../UniformFanInShape.html "class in akka.stream")<[T](MergeSequence.html "type parameter in MergeSequence"),​[T](MergeSequence.html "type parameter in MergeSequence")>` | `[shape](#shape())()` | The shape of a graph is all that is externally visible: its inlets and outlets. |
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
	
	
	
		- #### MergeSequence
		
		
		
		```
		public MergeSequence​(int inputPorts,
		                     scala.Function1<[T](MergeSequence.html "type parameter in MergeSequence"),​java.lang.Object> extractSequence)
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static <T> [Graph](../Graph.html "interface in akka.stream")<[UniformFanInShape](../UniformFanInShape.html "class in akka.stream")<T,​T>,​[NotUsed](../../NotUsed.html "class in akka")> apply​(int inputPorts,
		                                                                          scala.Function1<T,​java.lang.Object> extractSequence)
		```
		- #### apply$default$1
		
		
		
		```
		public static <T> int apply$default$1()
		```
		- #### inputPorts
		
		
		
		```
		public int inputPorts()
		```
		- #### shape
		
		
		
		```
		public [UniformFanInShape](../UniformFanInShape.html "class in akka.stream")<[T](MergeSequence.html "type parameter in MergeSequence"),​[T](MergeSequence.html "type parameter in MergeSequence")> shape()
		```
		
		Description copied from interface: `[Graph](../Graph.html#shape())`
		The shape of a graph is all that is externally visible: its inlets and outlets.
		- #### createLogic
		
		
		
		```
		public [GraphStageLogic](../stage/GraphStageLogic.html "class in akka.stream.stage") createLogic​([Attributes](../Attributes.html "class in akka.stream") inheritedAttributes)
		```
		
		
		Specified by:
		`[createLogic](../stage/GraphStage.html#createLogic(akka.stream.Attributes))` in class `[GraphStage](../stage/GraphStage.html "class in akka.stream.stage")<[UniformFanInShape](../UniformFanInShape.html "class in akka.stream")<[T](MergeSequence.html "type parameter in MergeSequence"),​[T](MergeSequence.html "type parameter in MergeSequence")>>`
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
- https://doc.akka.io/japi/akka/2.10/akka/stream/Shape.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/UniformFanInShape.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/scaladsl/MergeSequence.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/scaladsl/Partition.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/scaladsl/package-summary.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/stage/GraphStage.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/stage/GraphStageLogic.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/stage/GraphStageWithMaterializedValue.html

---
*Source: [https://doc.akka.io/japi/akka/2.10/akka/stream/scaladsl/MergeSequence.html](https://doc.akka.io/japi/akka/2.10/akka/stream/scaladsl/MergeSequence.html)*