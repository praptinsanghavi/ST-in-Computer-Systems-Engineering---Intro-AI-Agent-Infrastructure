---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:06:40Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/stream/scaladsl/Broadcast.html
title: Broadcast
---

# Broadcast

## Content

Package [akka.stream.scaladsl](package-summary.html)
## Class Broadcast\<T\>

- java.lang.Object
- - [akka.stream.stage.GraphStageWithMaterializedValue](../stage/GraphStageWithMaterializedValue.html "class in akka.stream.stage")\<S,​[NotUsed](../../NotUsed.html "class in akka")\>
	- - [akka.stream.stage.GraphStage](../stage/GraphStage.html "class in akka.stream.stage")\<[UniformFanOutShape](../UniformFanOutShape.html "class in akka.stream")\<T,​T\>\>
		- - akka.stream.scaladsl.Broadcast\<T\>

- All Implemented Interfaces:
`[Graph](../Graph.html "interface in akka.stream")<[UniformFanOutShape](../UniformFanOutShape.html "class in akka.stream")<T,​T>,​[NotUsed](../../NotUsed.html "class in akka")>`

---

```
public final class Broadcast<T>
extends [GraphStage](../stage/GraphStage.html "class in akka.stream.stage")<[UniformFanOutShape](../UniformFanOutShape.html "class in akka.stream")<T,​T>>
```

Fan\-out the stream to several streams emitting each incoming upstream element to all downstream consumers.
 It will not shut down until the subscriptions for at least two downstream subscribers have been established.
 
 '''Emits when''' all of the outputs stops backpressuring and there is an input element available
 

 '''Backpressures when''' any of the outputs backpressure
 

 '''Completes when''' upstream completes
 

 '''Cancels when'''
 If eagerCancel is enabled: when any downstream cancels; otherwise: when all downstreams cancel

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface akka.stream.[Graph](../Graph.html "interface in akka.stream")
		
		
		`[Graph.GraphMapMatVal](../Graph.GraphMapMatVal.html "class in akka.stream")<[S](../Graph.GraphMapMatVal.html "type parameter in Graph.GraphMapMatVal") extends [Shape](../Shape.html "class in akka.stream"),​[M](../Graph.GraphMapMatVal.html "type parameter in Graph.GraphMapMatVal")>`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Broadcast](#%3Cinit%3E(int,boolean))​(int outputPorts,  boolean eagerCancel)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static <T> [Broadcast](Broadcast.html "class in akka.stream.scaladsl")<T>` | `[apply](#apply(int,boolean))​(int outputPorts,  boolean eagerCancel)` | Create a new `Broadcast` with the specified number of output ports. |
	| `static <T> boolean` | `[apply$default$2](#apply$default$2())()` |  |
	| `[GraphStageLogic](../stage/GraphStageLogic.html "class in akka.stream.stage")` | `[createLogic](#createLogic(akka.stream.Attributes))​([Attributes](../Attributes.html "class in akka.stream") inheritedAttributes)` |  |
	| `boolean` | `[eagerCancel](#eagerCancel())()` |  |
	| `[Inlet](../Inlet.html "class in akka.stream")<[T](Broadcast.html "type parameter in Broadcast")>` | `[in](#in())()` |  |
	| `[Attributes](../Attributes.html "class in akka.stream")` | `[initialAttributes](#initialAttributes())()` |  |
	| `scala.collection.immutable.IndexedSeq<[Outlet](../Outlet.html "class in akka.stream")<[T](Broadcast.html "type parameter in Broadcast")>>` | `[out](#out())()` |  |
	| `int` | `[outputPorts](#outputPorts())()` |  |
	| `[UniformFanOutShape](../UniformFanOutShape.html "class in akka.stream")<[T](Broadcast.html "type parameter in Broadcast"),​[T](Broadcast.html "type parameter in Broadcast")>` | `[shape](#shape())()` | The shape of a graph is all that is externally visible: its inlets and outlets. |
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
	
	
	
		- #### Broadcast
		
		
		
		```
		public Broadcast​(int outputPorts,
		                 boolean eagerCancel)
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static <T> [Broadcast](Broadcast.html "class in akka.stream.scaladsl")<T> apply​(int outputPorts,
		                                     boolean eagerCancel)
		```
		
		Create a new `Broadcast` with the specified number of output ports.
		 
		
		Parameters:
		`outputPorts` \- number of output ports
		`eagerCancel` \- if true, broadcast cancels upstream if any of its downstreams cancel.
		- #### apply$default$2
		
		
		
		```
		public static <T> boolean apply$default$2()
		```
		- #### outputPorts
		
		
		
		```
		public int outputPorts()
		```
		- #### eagerCancel
		
		
		
		```
		public boolean eagerCancel()
		```
		- #### in
		
		
		
		```
		public [Inlet](../Inlet.html "class in akka.stream")<[T](Broadcast.html "type parameter in Broadcast")> in()
		```
		- #### out
		
		
		
		```
		public scala.collection.immutable.IndexedSeq<[Outlet](../Outlet.html "class in akka.stream")<[T](Broadcast.html "type parameter in Broadcast")>> out()
		```
		- #### initialAttributes
		
		
		
		```
		public [Attributes](../Attributes.html "class in akka.stream") initialAttributes()
		```
		
		
		Overrides:
		`[initialAttributes](../stage/GraphStageWithMaterializedValue.html#initialAttributes())` in class `[GraphStageWithMaterializedValue](../stage/GraphStageWithMaterializedValue.html "class in akka.stream.stage")<[UniformFanOutShape](../UniformFanOutShape.html "class in akka.stream")<[T](Broadcast.html "type parameter in Broadcast"),​[T](Broadcast.html "type parameter in Broadcast")>,​[NotUsed](../../NotUsed.html "class in akka")>`
		- #### shape
		
		
		
		```
		public [UniformFanOutShape](../UniformFanOutShape.html "class in akka.stream")<[T](Broadcast.html "type parameter in Broadcast"),​[T](Broadcast.html "type parameter in Broadcast")> shape()
		```
		
		Description copied from interface: `[Graph](../Graph.html#shape())`
		The shape of a graph is all that is externally visible: its inlets and outlets.
		- #### createLogic
		
		
		
		```
		public [GraphStageLogic](../stage/GraphStageLogic.html "class in akka.stream.stage") createLogic​([Attributes](../Attributes.html "class in akka.stream") inheritedAttributes)
		```
		
		
		Specified by:
		`[createLogic](../stage/GraphStage.html#createLogic(akka.stream.Attributes))` in class `[GraphStage](../stage/GraphStage.html "class in akka.stream.stage")<[UniformFanOutShape](../UniformFanOutShape.html "class in akka.stream")<[T](Broadcast.html "type parameter in Broadcast"),​[T](Broadcast.html "type parameter in Broadcast")>>`
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
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/scaladsl/Broadcast.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/scaladsl/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/stage/GraphStage.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/stage/GraphStageLogic.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/stage/GraphStageWithMaterializedValue.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/stream/scaladsl/Broadcast.html](https://doc.akka.io/japi/akka-core/2.10/akka/stream/scaladsl/Broadcast.html)*