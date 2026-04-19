---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:48:40Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/2.10/akka/stream/scaladsl/ZipWith13.html
title: ZipWith13
---

# ZipWith13

## Content

Package [akka.stream.scaladsl](package-summary.html)
## Class ZipWith13\<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​O\>

- java.lang.Object
- - [akka.stream.stage.GraphStageWithMaterializedValue](../stage/GraphStageWithMaterializedValue.html "class in akka.stream.stage")\<S,​[NotUsed](../../NotUsed.html "class in akka")\>
	- - [akka.stream.stage.GraphStage](../stage/GraphStage.html "class in akka.stream.stage")\<[FanInShape13](../FanInShape13.html "class in akka.stream")\<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​O\>\>
		- - akka.stream.scaladsl.ZipWith13\<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​O\>

- All Implemented Interfaces:
`[Graph](../Graph.html "interface in akka.stream")<[FanInShape13](../FanInShape13.html "class in akka.stream")<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​O>,​[NotUsed](../../NotUsed.html "class in akka")>`

---

```
public class ZipWith13<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​O>
extends [GraphStage](../stage/GraphStage.html "class in akka.stream.stage")<[FanInShape13](../FanInShape13.html "class in akka.stream")<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​O>>
```

\`ZipWith\` specialized for 13 inputs

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface akka.stream.[Graph](../Graph.html "interface in akka.stream")
		
		
		`[Graph.GraphMapMatVal](../Graph.GraphMapMatVal.html "class in akka.stream")<[S](../Graph.GraphMapMatVal.html "type parameter in Graph.GraphMapMatVal") extends [Shape](../Shape.html "class in akka.stream"),​[M](../Graph.GraphMapMatVal.html "type parameter in Graph.GraphMapMatVal")>`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ZipWith13](#%3Cinit%3E(scala.Function13))​(scala.Function13<[A1](ZipWith13.html "type parameter in ZipWith13"),​[A2](ZipWith13.html "type parameter in ZipWith13"),​[A3](ZipWith13.html "type parameter in ZipWith13"),​[A4](ZipWith13.html "type parameter in ZipWith13"),​[A5](ZipWith13.html "type parameter in ZipWith13"),​[A6](ZipWith13.html "type parameter in ZipWith13"),​[A7](ZipWith13.html "type parameter in ZipWith13"),​[A8](ZipWith13.html "type parameter in ZipWith13"),​[A9](ZipWith13.html "type parameter in ZipWith13"),​[A10](ZipWith13.html "type parameter in ZipWith13"),​[A11](ZipWith13.html "type parameter in ZipWith13"),​[A12](ZipWith13.html "type parameter in ZipWith13"),​[A13](ZipWith13.html "type parameter in ZipWith13"),​[O](ZipWith13.html "type parameter in ZipWith13")> zipper)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[GraphStageLogic](../stage/GraphStageLogic.html "class in akka.stream.stage")` | `[createLogic](#createLogic(akka.stream.Attributes))​([Attributes](../Attributes.html "class in akka.stream") inheritedAttributes)` |  |
	| `[Inlet](../Inlet.html "class in akka.stream")<[A1](ZipWith13.html "type parameter in ZipWith13")>` | `[in0](#in0())()` |  |
	| `[Inlet](../Inlet.html "class in akka.stream")<[A2](ZipWith13.html "type parameter in ZipWith13")>` | `[in1](#in1())()` |  |
	| `[Inlet](../Inlet.html "class in akka.stream")<[A11](ZipWith13.html "type parameter in ZipWith13")>` | `[in10](#in10())()` |  |
	| `[Inlet](../Inlet.html "class in akka.stream")<[A12](ZipWith13.html "type parameter in ZipWith13")>` | `[in11](#in11())()` |  |
	| `[Inlet](../Inlet.html "class in akka.stream")<[A13](ZipWith13.html "type parameter in ZipWith13")>` | `[in12](#in12())()` |  |
	| `[Inlet](../Inlet.html "class in akka.stream")<[A3](ZipWith13.html "type parameter in ZipWith13")>` | `[in2](#in2())()` |  |
	| `[Inlet](../Inlet.html "class in akka.stream")<[A4](ZipWith13.html "type parameter in ZipWith13")>` | `[in3](#in3())()` |  |
	| `[Inlet](../Inlet.html "class in akka.stream")<[A5](ZipWith13.html "type parameter in ZipWith13")>` | `[in4](#in4())()` |  |
	| `[Inlet](../Inlet.html "class in akka.stream")<[A6](ZipWith13.html "type parameter in ZipWith13")>` | `[in5](#in5())()` |  |
	| `[Inlet](../Inlet.html "class in akka.stream")<[A7](ZipWith13.html "type parameter in ZipWith13")>` | `[in6](#in6())()` |  |
	| `[Inlet](../Inlet.html "class in akka.stream")<[A8](ZipWith13.html "type parameter in ZipWith13")>` | `[in7](#in7())()` |  |
	| `[Inlet](../Inlet.html "class in akka.stream")<[A9](ZipWith13.html "type parameter in ZipWith13")>` | `[in8](#in8())()` |  |
	| `[Inlet](../Inlet.html "class in akka.stream")<[A10](ZipWith13.html "type parameter in ZipWith13")>` | `[in9](#in9())()` |  |
	| `[Attributes](../Attributes.html "class in akka.stream")` | `[initialAttributes](#initialAttributes())()` |  |
	| `[Outlet](../Outlet.html "class in akka.stream")<[O](ZipWith13.html "type parameter in ZipWith13")>` | `[out](#out())()` |  |
	| `[FanInShape13](../FanInShape13.html "class in akka.stream")<[A1](ZipWith13.html "type parameter in ZipWith13"),​[A2](ZipWith13.html "type parameter in ZipWith13"),​[A3](ZipWith13.html "type parameter in ZipWith13"),​[A4](ZipWith13.html "type parameter in ZipWith13"),​[A5](ZipWith13.html "type parameter in ZipWith13"),​[A6](ZipWith13.html "type parameter in ZipWith13"),​[A7](ZipWith13.html "type parameter in ZipWith13"),​[A8](ZipWith13.html "type parameter in ZipWith13"),​[A9](ZipWith13.html "type parameter in ZipWith13"),​[A10](ZipWith13.html "type parameter in ZipWith13"),​[A11](ZipWith13.html "type parameter in ZipWith13"),​[A12](ZipWith13.html "type parameter in ZipWith13"),​[A13](ZipWith13.html "type parameter in ZipWith13"),​[O](ZipWith13.html "type parameter in ZipWith13")>` | `[shape](#shape())()` | The shape of a graph is all that is externally visible: its inlets and outlets. |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Function13<[A1](ZipWith13.html "type parameter in ZipWith13"),​[A2](ZipWith13.html "type parameter in ZipWith13"),​[A3](ZipWith13.html "type parameter in ZipWith13"),​[A4](ZipWith13.html "type parameter in ZipWith13"),​[A5](ZipWith13.html "type parameter in ZipWith13"),​[A6](ZipWith13.html "type parameter in ZipWith13"),​[A7](ZipWith13.html "type parameter in ZipWith13"),​[A8](ZipWith13.html "type parameter in ZipWith13"),​[A9](ZipWith13.html "type parameter in ZipWith13"),​[A10](ZipWith13.html "type parameter in ZipWith13"),​[A11](ZipWith13.html "type parameter in ZipWith13"),​[A12](ZipWith13.html "type parameter in ZipWith13"),​[A13](ZipWith13.html "type parameter in ZipWith13"),​[O](ZipWith13.html "type parameter in ZipWith13")>` | `[zipper](#zipper())()` |  |
	
	
		- ### Methods inherited from class akka.stream.stage.[GraphStage](../stage/GraphStage.html "class in akka.stream.stage")
		
		
		`[createLogicAndMaterializedValue](../stage/GraphStage.html#createLogicAndMaterializedValue(akka.stream.Attributes))`
		- ### Methods inherited from class akka.stream.stage.[GraphStageWithMaterializedValue](../stage/GraphStageWithMaterializedValue.html "class in akka.stream.stage")
		
		
		`[withAttributes](../stage/GraphStageWithMaterializedValue.html#withAttributes(akka.stream.Attributes))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface akka.stream.[Graph](../Graph.html "interface in akka.stream")
		
		
		`[addAttributes](../Graph.html#addAttributes(akka.stream.Attributes)), [async](../Graph.html#async()), [async](../Graph.html#async(java.lang.String)), [async](../Graph.html#async(java.lang.String,int)), [getAttributes](../Graph.html#getAttributes()), [named](../Graph.html#named(java.lang.String))`

- - ### Constructor Detail
	
	
	
		- #### ZipWith13
		
		
		
		```
		public ZipWith13​(scala.Function13<[A1](ZipWith13.html "type parameter in ZipWith13"),​[A2](ZipWith13.html "type parameter in ZipWith13"),​[A3](ZipWith13.html "type parameter in ZipWith13"),​[A4](ZipWith13.html "type parameter in ZipWith13"),​[A5](ZipWith13.html "type parameter in ZipWith13"),​[A6](ZipWith13.html "type parameter in ZipWith13"),​[A7](ZipWith13.html "type parameter in ZipWith13"),​[A8](ZipWith13.html "type parameter in ZipWith13"),​[A9](ZipWith13.html "type parameter in ZipWith13"),​[A10](ZipWith13.html "type parameter in ZipWith13"),​[A11](ZipWith13.html "type parameter in ZipWith13"),​[A12](ZipWith13.html "type parameter in ZipWith13"),​[A13](ZipWith13.html "type parameter in ZipWith13"),​[O](ZipWith13.html "type parameter in ZipWith13")> zipper)
		```

	- ### Method Detail
	
	
	
		- #### createLogic
		
		
		
		```
		public [GraphStageLogic](../stage/GraphStageLogic.html "class in akka.stream.stage") createLogic​([Attributes](../Attributes.html "class in akka.stream") inheritedAttributes)
		```
		
		
		Specified by:
		`[createLogic](../stage/GraphStage.html#createLogic(akka.stream.Attributes))` in class `[GraphStage](../stage/GraphStage.html "class in akka.stream.stage")<[FanInShape13](../FanInShape13.html "class in akka.stream")<[A1](ZipWith13.html "type parameter in ZipWith13"),​[A2](ZipWith13.html "type parameter in ZipWith13"),​[A3](ZipWith13.html "type parameter in ZipWith13"),​[A4](ZipWith13.html "type parameter in ZipWith13"),​[A5](ZipWith13.html "type parameter in ZipWith13"),​[A6](ZipWith13.html "type parameter in ZipWith13"),​[A7](ZipWith13.html "type parameter in ZipWith13"),​[A8](ZipWith13.html "type parameter in ZipWith13"),​[A9](ZipWith13.html "type parameter in ZipWith13"),​[A10](ZipWith13.html "type parameter in ZipWith13"),​[A11](ZipWith13.html "type parameter in ZipWith13"),​[A12](ZipWith13.html "type parameter in ZipWith13"),​[A13](ZipWith13.html "type parameter in ZipWith13"),​[O](ZipWith13.html "type parameter in ZipWith13")>>`
		- #### in0
		
		
		
		```
		public [Inlet](../Inlet.html "class in akka.stream")<[A1](ZipWith13.html "type parameter in ZipWith13")> in0()
		```
		- #### in1
		
		
		
		```
		public [Inlet](../Inlet.html "class in akka.stream")<[A2](ZipWith13.html "type parameter in ZipWith13")> in1()
		```
		- #### in10
		
		
		
		```
		public [Inlet](../Inlet.html "class in akka.stream")<[A11](ZipWith13.html "type parameter in ZipWith13")> in10()
		```
		- #### in11
		
		
		
		```
		public [Inlet](../Inlet.html "class in akka.stream")<[A12](ZipWith13.html "type parameter in ZipWith13")> in11()
		```
		- #### in12
		
		
		
		```
		public [Inlet](../Inlet.html "class in akka.stream")<[A13](ZipWith13.html "type parameter in ZipWith13")> in12()
		```
		- #### in2
		
		
		
		```
		public [Inlet](../Inlet.html "class in akka.stream")<[A3](ZipWith13.html "type parameter in ZipWith13")> in2()
		```
		- #### in3
		
		
		
		```
		public [Inlet](../Inlet.html "class in akka.stream")<[A4](ZipWith13.html "type parameter in ZipWith13")> in3()
		```
		- #### in4
		
		
		
		```
		public [Inlet](../Inlet.html "class in akka.stream")<[A5](ZipWith13.html "type parameter in ZipWith13")> in4()
		```
		- #### in5
		
		
		
		```
		public [Inlet](../Inlet.html "class in akka.stream")<[A6](ZipWith13.html "type parameter in ZipWith13")> in5()
		```
		- #### in6
		
		
		
		```
		public [Inlet](../Inlet.html "class in akka.stream")<[A7](ZipWith13.html "type parameter in ZipWith13")> in6()
		```
		- #### in7
		
		
		
		```
		public [Inlet](../Inlet.html "class in akka.stream")<[A8](ZipWith13.html "type parameter in ZipWith13")> in7()
		```
		- #### in8
		
		
		
		```
		public [Inlet](../Inlet.html "class in akka.stream")<[A9](ZipWith13.html "type parameter in ZipWith13")> in8()
		```
		- #### in9
		
		
		
		```
		public [Inlet](../Inlet.html "class in akka.stream")<[A10](ZipWith13.html "type parameter in ZipWith13")> in9()
		```
		- #### initialAttributes
		
		
		
		```
		public [Attributes](../Attributes.html "class in akka.stream") initialAttributes()
		```
		
		
		Overrides:
		`[initialAttributes](../stage/GraphStageWithMaterializedValue.html#initialAttributes())` in class `[GraphStageWithMaterializedValue](../stage/GraphStageWithMaterializedValue.html "class in akka.stream.stage")<[FanInShape13](../FanInShape13.html "class in akka.stream")<[A1](ZipWith13.html "type parameter in ZipWith13"),​[A2](ZipWith13.html "type parameter in ZipWith13"),​[A3](ZipWith13.html "type parameter in ZipWith13"),​[A4](ZipWith13.html "type parameter in ZipWith13"),​[A5](ZipWith13.html "type parameter in ZipWith13"),​[A6](ZipWith13.html "type parameter in ZipWith13"),​[A7](ZipWith13.html "type parameter in ZipWith13"),​[A8](ZipWith13.html "type parameter in ZipWith13"),​[A9](ZipWith13.html "type parameter in ZipWith13"),​[A10](ZipWith13.html "type parameter in ZipWith13"),​[A11](ZipWith13.html "type parameter in ZipWith13"),​[A12](ZipWith13.html "type parameter in ZipWith13"),​[A13](ZipWith13.html "type parameter in ZipWith13"),​[O](ZipWith13.html "type parameter in ZipWith13")>,​[NotUsed](../../NotUsed.html "class in akka")>`
		- #### out
		
		
		
		```
		public [Outlet](../Outlet.html "class in akka.stream")<[O](ZipWith13.html "type parameter in ZipWith13")> out()
		```
		- #### shape
		
		
		
		```
		public [FanInShape13](../FanInShape13.html "class in akka.stream")<[A1](ZipWith13.html "type parameter in ZipWith13"),​[A2](ZipWith13.html "type parameter in ZipWith13"),​[A3](ZipWith13.html "type parameter in ZipWith13"),​[A4](ZipWith13.html "type parameter in ZipWith13"),​[A5](ZipWith13.html "type parameter in ZipWith13"),​[A6](ZipWith13.html "type parameter in ZipWith13"),​[A7](ZipWith13.html "type parameter in ZipWith13"),​[A8](ZipWith13.html "type parameter in ZipWith13"),​[A9](ZipWith13.html "type parameter in ZipWith13"),​[A10](ZipWith13.html "type parameter in ZipWith13"),​[A11](ZipWith13.html "type parameter in ZipWith13"),​[A12](ZipWith13.html "type parameter in ZipWith13"),​[A13](ZipWith13.html "type parameter in ZipWith13"),​[O](ZipWith13.html "type parameter in ZipWith13")> shape()
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
		public scala.Function13<[A1](ZipWith13.html "type parameter in ZipWith13"),​[A2](ZipWith13.html "type parameter in ZipWith13"),​[A3](ZipWith13.html "type parameter in ZipWith13"),​[A4](ZipWith13.html "type parameter in ZipWith13"),​[A5](ZipWith13.html "type parameter in ZipWith13"),​[A6](ZipWith13.html "type parameter in ZipWith13"),​[A7](ZipWith13.html "type parameter in ZipWith13"),​[A8](ZipWith13.html "type parameter in ZipWith13"),​[A9](ZipWith13.html "type parameter in ZipWith13"),​[A10](ZipWith13.html "type parameter in ZipWith13"),​[A11](ZipWith13.html "type parameter in ZipWith13"),​[A12](ZipWith13.html "type parameter in ZipWith13"),​[A13](ZipWith13.html "type parameter in ZipWith13"),​[O](ZipWith13.html "type parameter in ZipWith13")> zipper()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/2.10/akka/NotUsed.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/Attributes.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/FanInShape13.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/Graph.GraphMapMatVal.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/Graph.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/Inlet.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/Outlet.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/Shape.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/scaladsl/ZipWith13.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/scaladsl/package-summary.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/stage/GraphStage.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/stage/GraphStageLogic.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/stage/GraphStageWithMaterializedValue.html

---
*Source: [https://doc.akka.io/japi/akka/2.10/akka/stream/scaladsl/ZipWith13.html](https://doc.akka.io/japi/akka/2.10/akka/stream/scaladsl/ZipWith13.html)*