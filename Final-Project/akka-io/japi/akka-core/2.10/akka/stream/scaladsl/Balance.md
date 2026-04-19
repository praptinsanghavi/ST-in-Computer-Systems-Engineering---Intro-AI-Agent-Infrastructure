---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:06:40Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/stream/scaladsl/Balance.html
title: Balance
---

# Balance

## Content

Package [akka.stream.scaladsl](package-summary.html)
## Class Balance\<T\>

- java.lang.Object
- - [akka.stream.stage.GraphStageWithMaterializedValue](../stage/GraphStageWithMaterializedValue.html "class in akka.stream.stage")\<S,​[NotUsed](../../NotUsed.html "class in akka")\>
	- - [akka.stream.stage.GraphStage](../stage/GraphStage.html "class in akka.stream.stage")\<[UniformFanOutShape](../UniformFanOutShape.html "class in akka.stream")\<T,​T\>\>
		- - akka.stream.scaladsl.Balance\<T\>

- All Implemented Interfaces:
`[Graph](../Graph.html "interface in akka.stream")<[UniformFanOutShape](../UniformFanOutShape.html "class in akka.stream")<T,​T>,​[NotUsed](../../NotUsed.html "class in akka")>`

---

```
public final class Balance<T>
extends [GraphStage](../stage/GraphStage.html "class in akka.stream.stage")<[UniformFanOutShape](../UniformFanOutShape.html "class in akka.stream")<T,​T>>
```

Fan\-out the stream to several streams. Each upstream element is emitted to the first available downstream consumer.
 It will not shut down until the subscriptions
 for at least two downstream subscribers have been established.
 
 A `Balance` has one `in` port and 2 or more `out` ports.
 

 '''Emits when''' any of the outputs stops backpressuring; emits the element to the first available output
 

 '''Backpressures when''' all of the outputs backpressure
 

 '''Completes when''' upstream completes
 

 '''Cancels when''' If eagerCancel is enabled: when any downstream cancels; otherwise: when all downstreams cancel

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface akka.stream.[Graph](../Graph.html "interface in akka.stream")
		
		
		`[Graph.GraphMapMatVal](../Graph.GraphMapMatVal.html "class in akka.stream")<[S](../Graph.GraphMapMatVal.html "type parameter in Graph.GraphMapMatVal") extends [Shape](../Shape.html "class in akka.stream"),​[M](../Graph.GraphMapMatVal.html "type parameter in Graph.GraphMapMatVal")>`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Balance](#%3Cinit%3E(int,boolean,boolean))​(int outputPorts,  boolean waitForAllDownstreams,  boolean eagerCancel)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static <T> [Balance](Balance.html "class in akka.stream.scaladsl")<T>` | `[apply](#apply(int,boolean))​(int outputPorts,  boolean waitForAllDownstreams)` | Create a new `Balance` with the specified number of output ports. |
	| `static <T> boolean` | `[apply$default$2](#apply$default$2())()` |  |
	| `[GraphStageLogic](../stage/GraphStageLogic.html "class in akka.stream.stage")` | `[createLogic](#createLogic(akka.stream.Attributes))​([Attributes](../Attributes.html "class in akka.stream") inheritedAttributes)` |  |
	| `boolean` | `[eagerCancel](#eagerCancel())()` |  |
	| `[Inlet](../Inlet.html "class in akka.stream")<[T](Balance.html "type parameter in Balance")>` | `[in](#in())()` |  |
	| `[Attributes](../Attributes.html "class in akka.stream")` | `[initialAttributes](#initialAttributes())()` |  |
	| `scala.collection.immutable.IndexedSeq<[Outlet](../Outlet.html "class in akka.stream")<[T](Balance.html "type parameter in Balance")>>` | `[out](#out())()` |  |
	| `int` | `[outputPorts](#outputPorts())()` |  |
	| `[UniformFanOutShape](../UniformFanOutShape.html "class in akka.stream")<[T](Balance.html "type parameter in Balance"),​[T](Balance.html "type parameter in Balance")>` | `[shape](#shape())()` | The shape of a graph is all that is externally visible: its inlets and outlets. |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `boolean` | `[waitForAllDownstreams](#waitForAllDownstreams())()` |  |
	
	
		- ### Methods inherited from class akka.stream.stage.[GraphStage](../stage/GraphStage.html "class in akka.stream.stage")
		
		
		`[createLogicAndMaterializedValue](../stage/GraphStage.html#createLogicAndMaterializedValue(akka.stream.Attributes))`
		- ### Methods inherited from class akka.stream.stage.[GraphStageWithMaterializedValue](../stage/GraphStageWithMaterializedValue.html "class in akka.stream.stage")
		
		
		`[withAttributes](../stage/GraphStageWithMaterializedValue.html#withAttributes(akka.stream.Attributes))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface akka.stream.[Graph](../Graph.html "interface in akka.stream")
		
		
		`[addAttributes](../Graph.html#addAttributes(akka.stream.Attributes)), [async](../Graph.html#async()), [async](../Graph.html#async(java.lang.String)), [async](../Graph.html#async(java.lang.String,int)), [getAttributes](../Graph.html#getAttributes()), [named](../Graph.html#named(java.lang.String))`

- - ### Constructor Detail
	
	
	
		- #### Balance
		
		
		
		```
		public Balance​(int outputPorts,
		               boolean waitForAllDownstreams,
		               boolean eagerCancel)
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static <T> [Balance](Balance.html "class in akka.stream.scaladsl")<T> apply​(int outputPorts,
		                                   boolean waitForAllDownstreams)
		```
		
		Create a new `Balance` with the specified number of output ports. This method sets `eagerCancel` to `false`.
		 To specify a different value for the `eagerCancel` parameter, then instantiate Balance using the constructor.
		 
		 If `eagerCancel` is true, balance cancels upstream if any of its downstreams cancel, if false, when all have cancelled.
		 
		
		
		
		Parameters:
		`outputPorts` \- number of output ports
		`waitForAllDownstreams` \- if you use `waitForAllDownstreams = true` it will not start emitting
		 elements to downstream outputs until all of them have requested at least one element,
		 default value is `false`
		- #### apply$default$2
		
		
		
		```
		public static <T> boolean apply$default$2()
		```
		- #### outputPorts
		
		
		
		```
		public int outputPorts()
		```
		- #### waitForAllDownstreams
		
		
		
		```
		public boolean waitForAllDownstreams()
		```
		- #### eagerCancel
		
		
		
		```
		public boolean eagerCancel()
		```
		- #### in
		
		
		
		```
		public [Inlet](../Inlet.html "class in akka.stream")<[T](Balance.html "type parameter in Balance")> in()
		```
		- #### out
		
		
		
		```
		public scala.collection.immutable.IndexedSeq<[Outlet](../Outlet.html "class in akka.stream")<[T](Balance.html "type parameter in Balance")>> out()
		```
		- #### initialAttributes
		
		
		
		```
		public [Attributes](../Attributes.html "class in akka.stream") initialAttributes()
		```
		
		
		Overrides:
		`[initialAttributes](../stage/GraphStageWithMaterializedValue.html#initialAttributes())` in class `[GraphStageWithMaterializedValue](../stage/GraphStageWithMaterializedValue.html "class in akka.stream.stage")<[UniformFanOutShape](../UniformFanOutShape.html "class in akka.stream")<[T](Balance.html "type parameter in Balance"),​[T](Balance.html "type parameter in Balance")>,​[NotUsed](../../NotUsed.html "class in akka")>`
		- #### shape
		
		
		
		```
		public [UniformFanOutShape](../UniformFanOutShape.html "class in akka.stream")<[T](Balance.html "type parameter in Balance"),​[T](Balance.html "type parameter in Balance")> shape()
		```
		
		Description copied from interface: `[Graph](../Graph.html#shape())`
		The shape of a graph is all that is externally visible: its inlets and outlets.
		- #### createLogic
		
		
		
		```
		public [GraphStageLogic](../stage/GraphStageLogic.html "class in akka.stream.stage") createLogic​([Attributes](../Attributes.html "class in akka.stream") inheritedAttributes)
		```
		
		
		Specified by:
		`[createLogic](../stage/GraphStage.html#createLogic(akka.stream.Attributes))` in class `[GraphStage](../stage/GraphStage.html "class in akka.stream.stage")<[UniformFanOutShape](../UniformFanOutShape.html "class in akka.stream")<[T](Balance.html "type parameter in Balance"),​[T](Balance.html "type parameter in Balance")>>`
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
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/scaladsl/Balance.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/scaladsl/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/stage/GraphStage.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/stage/GraphStageLogic.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/stage/GraphStageWithMaterializedValue.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/stream/scaladsl/Balance.html](https://doc.akka.io/japi/akka-core/2.10/akka/stream/scaladsl/Balance.html)*