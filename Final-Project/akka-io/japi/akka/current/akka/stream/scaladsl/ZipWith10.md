---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:43:49Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/ZipWith10.html
title: ZipWith10
---

# ZipWith10

## Content

Package [akka.stream.scaladsl](package-summary.html)
## Class ZipWith10\<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​O\>

- java.lang.Object
- - [akka.stream.stage.GraphStageWithMaterializedValue](../stage/GraphStageWithMaterializedValue.html "class in akka.stream.stage")\<S,​[NotUsed](../../NotUsed.html "class in akka")\>
	- - [akka.stream.stage.GraphStage](../stage/GraphStage.html "class in akka.stream.stage")\<[FanInShape10](../FanInShape10.html "class in akka.stream")\<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​O\>\>
		- - akka.stream.scaladsl.ZipWith10\<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​O\>

- All Implemented Interfaces:
`[Graph](../Graph.html "interface in akka.stream")<[FanInShape10](../FanInShape10.html "class in akka.stream")<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​O>,​[NotUsed](../../NotUsed.html "class in akka")>`

---

```
public class ZipWith10<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​O>
extends [GraphStage](../stage/GraphStage.html "class in akka.stream.stage")<[FanInShape10](../FanInShape10.html "class in akka.stream")<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​O>>
```

\`ZipWith\` specialized for 10 inputs

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface akka.stream.[Graph](../Graph.html "interface in akka.stream")
		
		
		`[Graph.GraphMapMatVal](../Graph.GraphMapMatVal.html "class in akka.stream")<[S](../Graph.GraphMapMatVal.html "type parameter in Graph.GraphMapMatVal") extends [Shape](../Shape.html "class in akka.stream"),​[M](../Graph.GraphMapMatVal.html "type parameter in Graph.GraphMapMatVal")>`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ZipWith10](#%3Cinit%3E(scala.Function10))​(scala.Function10<[A1](ZipWith10.html "type parameter in ZipWith10"),​[A2](ZipWith10.html "type parameter in ZipWith10"),​[A3](ZipWith10.html "type parameter in ZipWith10"),​[A4](ZipWith10.html "type parameter in ZipWith10"),​[A5](ZipWith10.html "type parameter in ZipWith10"),​[A6](ZipWith10.html "type parameter in ZipWith10"),​[A7](ZipWith10.html "type parameter in ZipWith10"),​[A8](ZipWith10.html "type parameter in ZipWith10"),​[A9](ZipWith10.html "type parameter in ZipWith10"),​[A10](ZipWith10.html "type parameter in ZipWith10"),​[O](ZipWith10.html "type parameter in ZipWith10")> zipper)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[GraphStageLogic](../stage/GraphStageLogic.html "class in akka.stream.stage")` | `[createLogic](#createLogic(akka.stream.Attributes))​([Attributes](../Attributes.html "class in akka.stream") inheritedAttributes)` |  |
	| `[Inlet](../Inlet.html "class in akka.stream")<[A1](ZipWith10.html "type parameter in ZipWith10")>` | `[in0](#in0())()` |  |
	| `[Inlet](../Inlet.html "class in akka.stream")<[A2](ZipWith10.html "type parameter in ZipWith10")>` | `[in1](#in1())()` |  |
	| `[Inlet](../Inlet.html "class in akka.stream")<[A3](ZipWith10.html "type parameter in ZipWith10")>` | `[in2](#in2())()` |  |
	| `[Inlet](../Inlet.html "class in akka.stream")<[A4](ZipWith10.html "type parameter in ZipWith10")>` | `[in3](#in3())()` |  |
	| `[Inlet](../Inlet.html "class in akka.stream")<[A5](ZipWith10.html "type parameter in ZipWith10")>` | `[in4](#in4())()` |  |
	| `[Inlet](../Inlet.html "class in akka.stream")<[A6](ZipWith10.html "type parameter in ZipWith10")>` | `[in5](#in5())()` |  |
	| `[Inlet](../Inlet.html "class in akka.stream")<[A7](ZipWith10.html "type parameter in ZipWith10")>` | `[in6](#in6())()` |  |
	| `[Inlet](../Inlet.html "class in akka.stream")<[A8](ZipWith10.html "type parameter in ZipWith10")>` | `[in7](#in7())()` |  |
	| `[Inlet](../Inlet.html "class in akka.stream")<[A9](ZipWith10.html "type parameter in ZipWith10")>` | `[in8](#in8())()` |  |
	| `[Inlet](../Inlet.html "class in akka.stream")<[A10](ZipWith10.html "type parameter in ZipWith10")>` | `[in9](#in9())()` |  |
	| `[Attributes](../Attributes.html "class in akka.stream")` | `[initialAttributes](#initialAttributes())()` |  |
	| `[Outlet](../Outlet.html "class in akka.stream")<[O](ZipWith10.html "type parameter in ZipWith10")>` | `[out](#out())()` |  |
	| `[FanInShape10](../FanInShape10.html "class in akka.stream")<[A1](ZipWith10.html "type parameter in ZipWith10"),​[A2](ZipWith10.html "type parameter in ZipWith10"),​[A3](ZipWith10.html "type parameter in ZipWith10"),​[A4](ZipWith10.html "type parameter in ZipWith10"),​[A5](ZipWith10.html "type parameter in ZipWith10"),​[A6](ZipWith10.html "type parameter in ZipWith10"),​[A7](ZipWith10.html "type parameter in ZipWith10"),​[A8](ZipWith10.html "type parameter in ZipWith10"),​[A9](ZipWith10.html "type parameter in ZipWith10"),​[A10](ZipWith10.html "type parameter in ZipWith10"),​[O](ZipWith10.html "type parameter in ZipWith10")>` | `[shape](#shape())()` | The shape of a graph is all that is externally visible: its inlets and outlets. |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Function10<[A1](ZipWith10.html "type parameter in ZipWith10"),​[A2](ZipWith10.html "type parameter in ZipWith10"),​[A3](ZipWith10.html "type parameter in ZipWith10"),​[A4](ZipWith10.html "type parameter in ZipWith10"),​[A5](ZipWith10.html "type parameter in ZipWith10"),​[A6](ZipWith10.html "type parameter in ZipWith10"),​[A7](ZipWith10.html "type parameter in ZipWith10"),​[A8](ZipWith10.html "type parameter in ZipWith10"),​[A9](ZipWith10.html "type parameter in ZipWith10"),​[A10](ZipWith10.html "type parameter in ZipWith10"),​[O](ZipWith10.html "type parameter in ZipWith10")>` | `[zipper](#zipper())()` |  |
	
	
		- ### Methods inherited from class akka.stream.stage.[GraphStage](../stage/GraphStage.html "class in akka.stream.stage")
		
		
		`[createLogicAndMaterializedValue](../stage/GraphStage.html#createLogicAndMaterializedValue(akka.stream.Attributes))`
		- ### Methods inherited from class akka.stream.stage.[GraphStageWithMaterializedValue](../stage/GraphStageWithMaterializedValue.html "class in akka.stream.stage")
		
		
		`[withAttributes](../stage/GraphStageWithMaterializedValue.html#withAttributes(akka.stream.Attributes))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface akka.stream.[Graph](../Graph.html "interface in akka.stream")
		
		
		`[addAttributes](../Graph.html#addAttributes(akka.stream.Attributes)), [async](../Graph.html#async()), [async](../Graph.html#async(java.lang.String)), [async](../Graph.html#async(java.lang.String,int)), [getAttributes](../Graph.html#getAttributes()), [named](../Graph.html#named(java.lang.String))`

- - ### Constructor Detail
	
	
	
		- #### ZipWith10
		
		
		
		```
		public ZipWith10​(scala.Function10<[A1](ZipWith10.html "type parameter in ZipWith10"),​[A2](ZipWith10.html "type parameter in ZipWith10"),​[A3](ZipWith10.html "type parameter in ZipWith10"),​[A4](ZipWith10.html "type parameter in ZipWith10"),​[A5](ZipWith10.html "type parameter in ZipWith10"),​[A6](ZipWith10.html "type parameter in ZipWith10"),​[A7](ZipWith10.html "type parameter in ZipWith10"),​[A8](ZipWith10.html "type parameter in ZipWith10"),​[A9](ZipWith10.html "type parameter in ZipWith10"),​[A10](ZipWith10.html "type parameter in ZipWith10"),​[O](ZipWith10.html "type parameter in ZipWith10")> zipper)
		```

	- ### Method Detail
	
	
	
		- #### createLogic
		
		
		
		```
		public [GraphStageLogic](../stage/GraphStageLogic.html "class in akka.stream.stage") createLogic​([Attributes](../Attributes.html "class in akka.stream") inheritedAttributes)
		```
		
		
		Specified by:
		`[createLogic](../stage/GraphStage.html#createLogic(akka.stream.Attributes))` in class `[GraphStage](../stage/GraphStage.html "class in akka.stream.stage")<[FanInShape10](../FanInShape10.html "class in akka.stream")<[A1](ZipWith10.html "type parameter in ZipWith10"),​[A2](ZipWith10.html "type parameter in ZipWith10"),​[A3](ZipWith10.html "type parameter in ZipWith10"),​[A4](ZipWith10.html "type parameter in ZipWith10"),​[A5](ZipWith10.html "type parameter in ZipWith10"),​[A6](ZipWith10.html "type parameter in ZipWith10"),​[A7](ZipWith10.html "type parameter in ZipWith10"),​[A8](ZipWith10.html "type parameter in ZipWith10"),​[A9](ZipWith10.html "type parameter in ZipWith10"),​[A10](ZipWith10.html "type parameter in ZipWith10"),​[O](ZipWith10.html "type parameter in ZipWith10")>>`
		- #### in0
		
		
		
		```
		public [Inlet](../Inlet.html "class in akka.stream")<[A1](ZipWith10.html "type parameter in ZipWith10")> in0()
		```
		- #### in1
		
		
		
		```
		public [Inlet](../Inlet.html "class in akka.stream")<[A2](ZipWith10.html "type parameter in ZipWith10")> in1()
		```
		- #### in2
		
		
		
		```
		public [Inlet](../Inlet.html "class in akka.stream")<[A3](ZipWith10.html "type parameter in ZipWith10")> in2()
		```
		- #### in3
		
		
		
		```
		public [Inlet](../Inlet.html "class in akka.stream")<[A4](ZipWith10.html "type parameter in ZipWith10")> in3()
		```
		- #### in4
		
		
		
		```
		public [Inlet](../Inlet.html "class in akka.stream")<[A5](ZipWith10.html "type parameter in ZipWith10")> in4()
		```
		- #### in5
		
		
		
		```
		public [Inlet](../Inlet.html "class in akka.stream")<[A6](ZipWith10.html "type parameter in ZipWith10")> in5()
		```
		- #### in6
		
		
		
		```
		public [Inlet](../Inlet.html "class in akka.stream")<[A7](ZipWith10.html "type parameter in ZipWith10")> in6()
		```
		- #### in7
		
		
		
		```
		public [Inlet](../Inlet.html "class in akka.stream")<[A8](ZipWith10.html "type parameter in ZipWith10")> in7()
		```
		- #### in8
		
		
		
		```
		public [Inlet](../Inlet.html "class in akka.stream")<[A9](ZipWith10.html "type parameter in ZipWith10")> in8()
		```
		- #### in9
		
		
		
		```
		public [Inlet](../Inlet.html "class in akka.stream")<[A10](ZipWith10.html "type parameter in ZipWith10")> in9()
		```
		- #### initialAttributes
		
		
		
		```
		public [Attributes](../Attributes.html "class in akka.stream") initialAttributes()
		```
		
		
		Overrides:
		`[initialAttributes](../stage/GraphStageWithMaterializedValue.html#initialAttributes())` in class `[GraphStageWithMaterializedValue](../stage/GraphStageWithMaterializedValue.html "class in akka.stream.stage")<[FanInShape10](../FanInShape10.html "class in akka.stream")<[A1](ZipWith10.html "type parameter in ZipWith10"),​[A2](ZipWith10.html "type parameter in ZipWith10"),​[A3](ZipWith10.html "type parameter in ZipWith10"),​[A4](ZipWith10.html "type parameter in ZipWith10"),​[A5](ZipWith10.html "type parameter in ZipWith10"),​[A6](ZipWith10.html "type parameter in ZipWith10"),​[A7](ZipWith10.html "type parameter in ZipWith10"),​[A8](ZipWith10.html "type parameter in ZipWith10"),​[A9](ZipWith10.html "type parameter in ZipWith10"),​[A10](ZipWith10.html "type parameter in ZipWith10"),​[O](ZipWith10.html "type parameter in ZipWith10")>,​[NotUsed](../../NotUsed.html "class in akka")>`
		- #### out
		
		
		
		```
		public [Outlet](../Outlet.html "class in akka.stream")<[O](ZipWith10.html "type parameter in ZipWith10")> out()
		```
		- #### shape
		
		
		
		```
		public [FanInShape10](../FanInShape10.html "class in akka.stream")<[A1](ZipWith10.html "type parameter in ZipWith10"),​[A2](ZipWith10.html "type parameter in ZipWith10"),​[A3](ZipWith10.html "type parameter in ZipWith10"),​[A4](ZipWith10.html "type parameter in ZipWith10"),​[A5](ZipWith10.html "type parameter in ZipWith10"),​[A6](ZipWith10.html "type parameter in ZipWith10"),​[A7](ZipWith10.html "type parameter in ZipWith10"),​[A8](ZipWith10.html "type parameter in ZipWith10"),​[A9](ZipWith10.html "type parameter in ZipWith10"),​[A10](ZipWith10.html "type parameter in ZipWith10"),​[O](ZipWith10.html "type parameter in ZipWith10")> shape()
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
		public scala.Function10<[A1](ZipWith10.html "type parameter in ZipWith10"),​[A2](ZipWith10.html "type parameter in ZipWith10"),​[A3](ZipWith10.html "type parameter in ZipWith10"),​[A4](ZipWith10.html "type parameter in ZipWith10"),​[A5](ZipWith10.html "type parameter in ZipWith10"),​[A6](ZipWith10.html "type parameter in ZipWith10"),​[A7](ZipWith10.html "type parameter in ZipWith10"),​[A8](ZipWith10.html "type parameter in ZipWith10"),​[A9](ZipWith10.html "type parameter in ZipWith10"),​[A10](ZipWith10.html "type parameter in ZipWith10"),​[O](ZipWith10.html "type parameter in ZipWith10")> zipper()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/NotUsed.html
- https://doc.akka.io/japi/akka/current/akka/stream/Attributes.html
- https://doc.akka.io/japi/akka/current/akka/stream/FanInShape10.html
- https://doc.akka.io/japi/akka/current/akka/stream/Graph.GraphMapMatVal.html
- https://doc.akka.io/japi/akka/current/akka/stream/Graph.html
- https://doc.akka.io/japi/akka/current/akka/stream/Inlet.html
- https://doc.akka.io/japi/akka/current/akka/stream/Outlet.html
- https://doc.akka.io/japi/akka/current/akka/stream/Shape.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/ZipWith10.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/stream/stage/GraphStage.html
- https://doc.akka.io/japi/akka/current/akka/stream/stage/GraphStageLogic.html
- https://doc.akka.io/japi/akka/current/akka/stream/stage/GraphStageWithMaterializedValue.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/ZipWith10.html](https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/ZipWith10.html)*