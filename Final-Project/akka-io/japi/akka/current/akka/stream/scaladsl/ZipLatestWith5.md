---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:43:41Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/ZipLatestWith5.html
title: ZipLatestWith5
---

# ZipLatestWith5

## Content

Package [akka.stream.scaladsl](package-summary.html)
## Class ZipLatestWith5\<A1,​A2,​A3,​A4,​A5,​O\>

- java.lang.Object
- - [akka.stream.stage.GraphStageWithMaterializedValue](../stage/GraphStageWithMaterializedValue.html "class in akka.stream.stage")\<S,​[NotUsed](../../NotUsed.html "class in akka")\>
	- - [akka.stream.stage.GraphStage](../stage/GraphStage.html "class in akka.stream.stage")\<[FanInShape5](../FanInShape5.html "class in akka.stream")\<A1,​A2,​A3,​A4,​A5,​O\>\>
		- - akka.stream.scaladsl.ZipLatestWith5\<A1,​A2,​A3,​A4,​A5,​O\>

- All Implemented Interfaces:
`[Graph](../Graph.html "interface in akka.stream")<[FanInShape5](../FanInShape5.html "class in akka.stream")<A1,​A2,​A3,​A4,​A5,​O>,​[NotUsed](../../NotUsed.html "class in akka")>`

---

```
public class ZipLatestWith5<A1,​A2,​A3,​A4,​A5,​O>
extends [GraphStage](../stage/GraphStage.html "class in akka.stream.stage")<[FanInShape5](../FanInShape5.html "class in akka.stream")<A1,​A2,​A3,​A4,​A5,​O>>
```

\`ZipLatestWith\` specialized for 5 inputs

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface akka.stream.[Graph](../Graph.html "interface in akka.stream")
		
		
		`[Graph.GraphMapMatVal](../Graph.GraphMapMatVal.html "class in akka.stream")<[S](../Graph.GraphMapMatVal.html "type parameter in Graph.GraphMapMatVal") extends [Shape](../Shape.html "class in akka.stream"),​[M](../Graph.GraphMapMatVal.html "type parameter in Graph.GraphMapMatVal")>`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ZipLatestWith5](#%3Cinit%3E(scala.Function5))​(scala.Function5<[A1](ZipLatestWith5.html "type parameter in ZipLatestWith5"),​[A2](ZipLatestWith5.html "type parameter in ZipLatestWith5"),​[A3](ZipLatestWith5.html "type parameter in ZipLatestWith5"),​[A4](ZipLatestWith5.html "type parameter in ZipLatestWith5"),​[A5](ZipLatestWith5.html "type parameter in ZipLatestWith5"),​[O](ZipLatestWith5.html "type parameter in ZipLatestWith5")> zipper)` |  |
	| `[ZipLatestWith5](#%3Cinit%3E(scala.Function5,boolean))​(scala.Function5<[A1](ZipLatestWith5.html "type parameter in ZipLatestWith5"),​[A2](ZipLatestWith5.html "type parameter in ZipLatestWith5"),​[A3](ZipLatestWith5.html "type parameter in ZipLatestWith5"),​[A4](ZipLatestWith5.html "type parameter in ZipLatestWith5"),​[A5](ZipLatestWith5.html "type parameter in ZipLatestWith5"),​[O](ZipLatestWith5.html "type parameter in ZipLatestWith5")> zipper,  boolean eagerComplete)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[GraphStageLogic](../stage/GraphStageLogic.html "class in akka.stream.stage")` | `[createLogic](#createLogic(akka.stream.Attributes))​([Attributes](../Attributes.html "class in akka.stream") inheritedAttributes)` |  |
	| `boolean` | `[eagerComplete](#eagerComplete())()` |  |
	| `[Inlet](../Inlet.html "class in akka.stream")<[A1](ZipLatestWith5.html "type parameter in ZipLatestWith5")>` | `[in0](#in0())()` |  |
	| `[Inlet](../Inlet.html "class in akka.stream")<[A2](ZipLatestWith5.html "type parameter in ZipLatestWith5")>` | `[in1](#in1())()` |  |
	| `[Inlet](../Inlet.html "class in akka.stream")<[A3](ZipLatestWith5.html "type parameter in ZipLatestWith5")>` | `[in2](#in2())()` |  |
	| `[Inlet](../Inlet.html "class in akka.stream")<[A4](ZipLatestWith5.html "type parameter in ZipLatestWith5")>` | `[in3](#in3())()` |  |
	| `[Inlet](../Inlet.html "class in akka.stream")<[A5](ZipLatestWith5.html "type parameter in ZipLatestWith5")>` | `[in4](#in4())()` |  |
	| `[Attributes](../Attributes.html "class in akka.stream")` | `[initialAttributes](#initialAttributes())()` |  |
	| `[Outlet](../Outlet.html "class in akka.stream")<[O](ZipLatestWith5.html "type parameter in ZipLatestWith5")>` | `[out](#out())()` |  |
	| `[FanInShape5](../FanInShape5.html "class in akka.stream")<[A1](ZipLatestWith5.html "type parameter in ZipLatestWith5"),​[A2](ZipLatestWith5.html "type parameter in ZipLatestWith5"),​[A3](ZipLatestWith5.html "type parameter in ZipLatestWith5"),​[A4](ZipLatestWith5.html "type parameter in ZipLatestWith5"),​[A5](ZipLatestWith5.html "type parameter in ZipLatestWith5"),​[O](ZipLatestWith5.html "type parameter in ZipLatestWith5")>` | `[shape](#shape())()` | The shape of a graph is all that is externally visible: its inlets and outlets. |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Function5<[A1](ZipLatestWith5.html "type parameter in ZipLatestWith5"),​[A2](ZipLatestWith5.html "type parameter in ZipLatestWith5"),​[A3](ZipLatestWith5.html "type parameter in ZipLatestWith5"),​[A4](ZipLatestWith5.html "type parameter in ZipLatestWith5"),​[A5](ZipLatestWith5.html "type parameter in ZipLatestWith5"),​[O](ZipLatestWith5.html "type parameter in ZipLatestWith5")>` | `[zipper](#zipper())()` |  |
	
	
		- ### Methods inherited from class akka.stream.stage.[GraphStage](../stage/GraphStage.html "class in akka.stream.stage")
		
		
		`[createLogicAndMaterializedValue](../stage/GraphStage.html#createLogicAndMaterializedValue(akka.stream.Attributes))`
		- ### Methods inherited from class akka.stream.stage.[GraphStageWithMaterializedValue](../stage/GraphStageWithMaterializedValue.html "class in akka.stream.stage")
		
		
		`[withAttributes](../stage/GraphStageWithMaterializedValue.html#withAttributes(akka.stream.Attributes))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface akka.stream.[Graph](../Graph.html "interface in akka.stream")
		
		
		`[addAttributes](../Graph.html#addAttributes(akka.stream.Attributes)), [async](../Graph.html#async()), [async](../Graph.html#async(java.lang.String)), [async](../Graph.html#async(java.lang.String,int)), [getAttributes](../Graph.html#getAttributes()), [named](../Graph.html#named(java.lang.String))`

- - ### Constructor Detail
	
	
	
		- #### ZipLatestWith5
		
		
		
		```
		public ZipLatestWith5​(scala.Function5<[A1](ZipLatestWith5.html "type parameter in ZipLatestWith5"),​[A2](ZipLatestWith5.html "type parameter in ZipLatestWith5"),​[A3](ZipLatestWith5.html "type parameter in ZipLatestWith5"),​[A4](ZipLatestWith5.html "type parameter in ZipLatestWith5"),​[A5](ZipLatestWith5.html "type parameter in ZipLatestWith5"),​[O](ZipLatestWith5.html "type parameter in ZipLatestWith5")> zipper,
		                      boolean eagerComplete)
		```
		- #### ZipLatestWith5
		
		
		
		```
		public ZipLatestWith5​(scala.Function5<[A1](ZipLatestWith5.html "type parameter in ZipLatestWith5"),​[A2](ZipLatestWith5.html "type parameter in ZipLatestWith5"),​[A3](ZipLatestWith5.html "type parameter in ZipLatestWith5"),​[A4](ZipLatestWith5.html "type parameter in ZipLatestWith5"),​[A5](ZipLatestWith5.html "type parameter in ZipLatestWith5"),​[O](ZipLatestWith5.html "type parameter in ZipLatestWith5")> zipper)
		```

	- ### Method Detail
	
	
	
		- #### createLogic
		
		
		
		```
		public [GraphStageLogic](../stage/GraphStageLogic.html "class in akka.stream.stage") createLogic​([Attributes](../Attributes.html "class in akka.stream") inheritedAttributes)
		```
		
		
		Specified by:
		`[createLogic](../stage/GraphStage.html#createLogic(akka.stream.Attributes))` in class `[GraphStage](../stage/GraphStage.html "class in akka.stream.stage")<[FanInShape5](../FanInShape5.html "class in akka.stream")<[A1](ZipLatestWith5.html "type parameter in ZipLatestWith5"),​[A2](ZipLatestWith5.html "type parameter in ZipLatestWith5"),​[A3](ZipLatestWith5.html "type parameter in ZipLatestWith5"),​[A4](ZipLatestWith5.html "type parameter in ZipLatestWith5"),​[A5](ZipLatestWith5.html "type parameter in ZipLatestWith5"),​[O](ZipLatestWith5.html "type parameter in ZipLatestWith5")>>`
		- #### eagerComplete
		
		
		
		```
		public boolean eagerComplete()
		```
		- #### in0
		
		
		
		```
		public [Inlet](../Inlet.html "class in akka.stream")<[A1](ZipLatestWith5.html "type parameter in ZipLatestWith5")> in0()
		```
		- #### in1
		
		
		
		```
		public [Inlet](../Inlet.html "class in akka.stream")<[A2](ZipLatestWith5.html "type parameter in ZipLatestWith5")> in1()
		```
		- #### in2
		
		
		
		```
		public [Inlet](../Inlet.html "class in akka.stream")<[A3](ZipLatestWith5.html "type parameter in ZipLatestWith5")> in2()
		```
		- #### in3
		
		
		
		```
		public [Inlet](../Inlet.html "class in akka.stream")<[A4](ZipLatestWith5.html "type parameter in ZipLatestWith5")> in3()
		```
		- #### in4
		
		
		
		```
		public [Inlet](../Inlet.html "class in akka.stream")<[A5](ZipLatestWith5.html "type parameter in ZipLatestWith5")> in4()
		```
		- #### initialAttributes
		
		
		
		```
		public [Attributes](../Attributes.html "class in akka.stream") initialAttributes()
		```
		
		
		Overrides:
		`[initialAttributes](../stage/GraphStageWithMaterializedValue.html#initialAttributes())` in class `[GraphStageWithMaterializedValue](../stage/GraphStageWithMaterializedValue.html "class in akka.stream.stage")<[FanInShape5](../FanInShape5.html "class in akka.stream")<[A1](ZipLatestWith5.html "type parameter in ZipLatestWith5"),​[A2](ZipLatestWith5.html "type parameter in ZipLatestWith5"),​[A3](ZipLatestWith5.html "type parameter in ZipLatestWith5"),​[A4](ZipLatestWith5.html "type parameter in ZipLatestWith5"),​[A5](ZipLatestWith5.html "type parameter in ZipLatestWith5"),​[O](ZipLatestWith5.html "type parameter in ZipLatestWith5")>,​[NotUsed](../../NotUsed.html "class in akka")>`
		- #### out
		
		
		
		```
		public [Outlet](../Outlet.html "class in akka.stream")<[O](ZipLatestWith5.html "type parameter in ZipLatestWith5")> out()
		```
		- #### shape
		
		
		
		```
		public [FanInShape5](../FanInShape5.html "class in akka.stream")<[A1](ZipLatestWith5.html "type parameter in ZipLatestWith5"),​[A2](ZipLatestWith5.html "type parameter in ZipLatestWith5"),​[A3](ZipLatestWith5.html "type parameter in ZipLatestWith5"),​[A4](ZipLatestWith5.html "type parameter in ZipLatestWith5"),​[A5](ZipLatestWith5.html "type parameter in ZipLatestWith5"),​[O](ZipLatestWith5.html "type parameter in ZipLatestWith5")> shape()
		```
		
		Description copied from interface: `[Graph](../Graph.html#shape())`
		The shape of a graph is all that is externally visible: its inlets and outlets.
		- #### toString
		
		
		
		```
		public java.lang.String toString()
		```
		
		
		Overrides:
		`toString` in class `java.lang.Object`
		- #### zipper
		
		
		
		```
		public scala.Function5<[A1](ZipLatestWith5.html "type parameter in ZipLatestWith5"),​[A2](ZipLatestWith5.html "type parameter in ZipLatestWith5"),​[A3](ZipLatestWith5.html "type parameter in ZipLatestWith5"),​[A4](ZipLatestWith5.html "type parameter in ZipLatestWith5"),​[A5](ZipLatestWith5.html "type parameter in ZipLatestWith5"),​[O](ZipLatestWith5.html "type parameter in ZipLatestWith5")> zipper()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/NotUsed.html
- https://doc.akka.io/japi/akka/current/akka/stream/Attributes.html
- https://doc.akka.io/japi/akka/current/akka/stream/FanInShape5.html
- https://doc.akka.io/japi/akka/current/akka/stream/Graph.GraphMapMatVal.html
- https://doc.akka.io/japi/akka/current/akka/stream/Graph.html
- https://doc.akka.io/japi/akka/current/akka/stream/Inlet.html
- https://doc.akka.io/japi/akka/current/akka/stream/Outlet.html
- https://doc.akka.io/japi/akka/current/akka/stream/Shape.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/ZipLatestWith5.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/stream/stage/GraphStage.html
- https://doc.akka.io/japi/akka/current/akka/stream/stage/GraphStageLogic.html
- https://doc.akka.io/japi/akka/current/akka/stream/stage/GraphStageWithMaterializedValue.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/ZipLatestWith5.html](https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/ZipLatestWith5.html)*