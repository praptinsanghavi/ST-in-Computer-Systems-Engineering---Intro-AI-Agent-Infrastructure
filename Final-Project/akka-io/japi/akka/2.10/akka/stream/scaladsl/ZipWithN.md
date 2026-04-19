---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:49:01Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/2.10/akka/stream/scaladsl/ZipWithN.html
title: ZipWithN
---

# ZipWithN

## Content

Package [akka.stream.scaladsl](package-summary.html)
## Class ZipWithN\<A,​O\>

- java.lang.Object
- - [akka.stream.stage.GraphStageWithMaterializedValue](../stage/GraphStageWithMaterializedValue.html "class in akka.stream.stage")\<S,​[NotUsed](../../NotUsed.html "class in akka")\>
	- - [akka.stream.stage.GraphStage](../stage/GraphStage.html "class in akka.stream.stage")\<[UniformFanInShape](../UniformFanInShape.html "class in akka.stream")\<A,​O\>\>
		- - akka.stream.scaladsl.ZipWithN\<A,​O\>

- All Implemented Interfaces:
`[Graph](../Graph.html "interface in akka.stream")<[UniformFanInShape](../UniformFanInShape.html "class in akka.stream")<A,​O>,​[NotUsed](../../NotUsed.html "class in akka")>`

Direct Known Subclasses:
`[ZipN](ZipN.html "class in akka.stream.scaladsl")`

---

```
public class ZipWithN<A,​O>
extends [GraphStage](../stage/GraphStage.html "class in akka.stream.stage")<[UniformFanInShape](../UniformFanInShape.html "class in akka.stream")<A,​O>>
```

Combine the elements of multiple streams into a stream of sequences using a combiner function.
 
 A `ZipWithN` has a `n` input ports and one `out` port
 

 '''Emits when''' all of the inputs has an element available
 

 '''Backpressures when''' downstream backpressures
 

 '''Completes when''' any upstream completes
 

 '''Cancels when''' downstream cancels

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface akka.stream.[Graph](../Graph.html "interface in akka.stream")
		
		
		`[Graph.GraphMapMatVal](../Graph.GraphMapMatVal.html "class in akka.stream")<[S](../Graph.GraphMapMatVal.html "type parameter in Graph.GraphMapMatVal") extends [Shape](../Shape.html "class in akka.stream"),​[M](../Graph.GraphMapMatVal.html "type parameter in Graph.GraphMapMatVal")>`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ZipWithN](#%3Cinit%3E(scala.Function1,int))​(scala.Function1<scala.collection.immutable.Seq<[A](ZipWithN.html "type parameter in ZipWithN")>,​[O](ZipWithN.html "type parameter in ZipWithN")> zipper,  int n)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static <A,​O>[ZipWithN](ZipWithN.html "class in akka.stream.scaladsl")<A,​O>` | `[apply](#apply(scala.Function1,int))​(scala.Function1<scala.collection.immutable.Seq<A>,​O> zipper,  int n)` | Create a new `ZipWithN`. |
	| `[GraphStageLogic](../stage/GraphStageLogic.html "class in akka.stream.stage")` | `[createLogic](#createLogic(akka.stream.Attributes))​([Attributes](../Attributes.html "class in akka.stream") inheritedAttributes)` |  |
	| `[Attributes](../Attributes.html "class in akka.stream")` | `[initialAttributes](#initialAttributes())()` |  |
	| `[Outlet](../Outlet.html "class in akka.stream")<[O](ZipWithN.html "type parameter in ZipWithN")>` | `[out](#out())()` |  |
	| `[UniformFanInShape](../UniformFanInShape.html "class in akka.stream")<[A](ZipWithN.html "type parameter in ZipWithN"),​[O](ZipWithN.html "type parameter in ZipWithN")>` | `[shape](#shape())()` | The shape of a graph is all that is externally visible: its inlets and outlets. |
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
	
	
	
		- #### ZipWithN
		
		
		
		```
		public ZipWithN​(scala.Function1<scala.collection.immutable.Seq<[A](ZipWithN.html "type parameter in ZipWithN")>,​[O](ZipWithN.html "type parameter in ZipWithN")> zipper,
		                int n)
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static <A,​O> [ZipWithN](ZipWithN.html "class in akka.stream.scaladsl")<A,​O> apply​(scala.Function1<scala.collection.immutable.Seq<A>,​O> zipper,
		                                                    int n)
		```
		
		Create a new `ZipWithN`.
		- #### initialAttributes
		
		
		
		```
		public [Attributes](../Attributes.html "class in akka.stream") initialAttributes()
		```
		
		
		Overrides:
		`[initialAttributes](../stage/GraphStageWithMaterializedValue.html#initialAttributes())` in class `[GraphStageWithMaterializedValue](../stage/GraphStageWithMaterializedValue.html "class in akka.stream.stage")<[UniformFanInShape](../UniformFanInShape.html "class in akka.stream")<[A](ZipWithN.html "type parameter in ZipWithN"),​[O](ZipWithN.html "type parameter in ZipWithN")>,​[NotUsed](../../NotUsed.html "class in akka")>`
		- #### shape
		
		
		
		```
		public [UniformFanInShape](../UniformFanInShape.html "class in akka.stream")<[A](ZipWithN.html "type parameter in ZipWithN"),​[O](ZipWithN.html "type parameter in ZipWithN")> shape()
		```
		
		Description copied from interface: `[Graph](../Graph.html#shape())`
		The shape of a graph is all that is externally visible: its inlets and outlets.
		- #### out
		
		
		
		```
		public [Outlet](../Outlet.html "class in akka.stream")<[O](ZipWithN.html "type parameter in ZipWithN")> out()
		```
		- #### createLogic
		
		
		
		```
		public [GraphStageLogic](../stage/GraphStageLogic.html "class in akka.stream.stage") createLogic​([Attributes](../Attributes.html "class in akka.stream") inheritedAttributes)
		```
		
		
		Specified by:
		`[createLogic](../stage/GraphStage.html#createLogic(akka.stream.Attributes))` in class `[GraphStage](../stage/GraphStage.html "class in akka.stream.stage")<[UniformFanInShape](../UniformFanInShape.html "class in akka.stream")<[A](ZipWithN.html "type parameter in ZipWithN"),​[O](ZipWithN.html "type parameter in ZipWithN")>>`
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
- https://doc.akka.io/japi/akka/2.10/akka/stream/Outlet.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/Shape.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/UniformFanInShape.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/scaladsl/ZipN.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/scaladsl/ZipWithN.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/scaladsl/package-summary.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/stage/GraphStage.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/stage/GraphStageLogic.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/stage/GraphStageWithMaterializedValue.html

---
*Source: [https://doc.akka.io/japi/akka/2.10/akka/stream/scaladsl/ZipWithN.html](https://doc.akka.io/japi/akka/2.10/akka/stream/scaladsl/ZipWithN.html)*