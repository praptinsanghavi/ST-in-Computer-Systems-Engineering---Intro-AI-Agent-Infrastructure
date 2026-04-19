---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:07:47Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/stream/scaladsl/ZipWith17.html
title: ZipWith17
---

# ZipWith17

## Content

Package [akka.stream.scaladsl](package-summary.html)
## Class ZipWith17\<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​A17,​O\>

- java.lang.Object
- - [akka.stream.stage.GraphStageWithMaterializedValue](../stage/GraphStageWithMaterializedValue.html "class in akka.stream.stage")\<S,​[NotUsed](../../NotUsed.html "class in akka")\>
	- - [akka.stream.stage.GraphStage](../stage/GraphStage.html "class in akka.stream.stage")\<[FanInShape17](../FanInShape17.html "class in akka.stream")\<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​A17,​O\>\>
		- - akka.stream.scaladsl.ZipWith17\<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​A17,​O\>

- All Implemented Interfaces:
`[Graph](../Graph.html "interface in akka.stream")<[FanInShape17](../FanInShape17.html "class in akka.stream")<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​A17,​O>,​[NotUsed](../../NotUsed.html "class in akka")>`

---

```
public class ZipWith17<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​A17,​O>
extends [GraphStage](../stage/GraphStage.html "class in akka.stream.stage")<[FanInShape17](../FanInShape17.html "class in akka.stream")<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​A17,​O>>
```

\`ZipWith\` specialized for 17 inputs

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface akka.stream.[Graph](../Graph.html "interface in akka.stream")
		
		
		`[Graph.GraphMapMatVal](../Graph.GraphMapMatVal.html "class in akka.stream")<[S](../Graph.GraphMapMatVal.html "type parameter in Graph.GraphMapMatVal") extends [Shape](../Shape.html "class in akka.stream"),​[M](../Graph.GraphMapMatVal.html "type parameter in Graph.GraphMapMatVal")>`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ZipWith17](#%3Cinit%3E(scala.Function17))​(scala.Function17<[A1](ZipWith17.html "type parameter in ZipWith17"),​[A2](ZipWith17.html "type parameter in ZipWith17"),​[A3](ZipWith17.html "type parameter in ZipWith17"),​[A4](ZipWith17.html "type parameter in ZipWith17"),​[A5](ZipWith17.html "type parameter in ZipWith17"),​[A6](ZipWith17.html "type parameter in ZipWith17"),​[A7](ZipWith17.html "type parameter in ZipWith17"),​[A8](ZipWith17.html "type parameter in ZipWith17"),​[A9](ZipWith17.html "type parameter in ZipWith17"),​[A10](ZipWith17.html "type parameter in ZipWith17"),​[A11](ZipWith17.html "type parameter in ZipWith17"),​[A12](ZipWith17.html "type parameter in ZipWith17"),​[A13](ZipWith17.html "type parameter in ZipWith17"),​[A14](ZipWith17.html "type parameter in ZipWith17"),​[A15](ZipWith17.html "type parameter in ZipWith17"),​[A16](ZipWith17.html "type parameter in ZipWith17"),​[A17](ZipWith17.html "type parameter in ZipWith17"),​[O](ZipWith17.html "type parameter in ZipWith17")> zipper)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[GraphStageLogic](../stage/GraphStageLogic.html "class in akka.stream.stage")` | `[createLogic](#createLogic(akka.stream.Attributes))​([Attributes](../Attributes.html "class in akka.stream") inheritedAttributes)` |  |
	| `[Inlet](../Inlet.html "class in akka.stream")<[A1](ZipWith17.html "type parameter in ZipWith17")>` | `[in0](#in0())()` |  |
	| `[Inlet](../Inlet.html "class in akka.stream")<[A2](ZipWith17.html "type parameter in ZipWith17")>` | `[in1](#in1())()` |  |
	| `[Inlet](../Inlet.html "class in akka.stream")<[A11](ZipWith17.html "type parameter in ZipWith17")>` | `[in10](#in10())()` |  |
	| `[Inlet](../Inlet.html "class in akka.stream")<[A12](ZipWith17.html "type parameter in ZipWith17")>` | `[in11](#in11())()` |  |
	| `[Inlet](../Inlet.html "class in akka.stream")<[A13](ZipWith17.html "type parameter in ZipWith17")>` | `[in12](#in12())()` |  |
	| `[Inlet](../Inlet.html "class in akka.stream")<[A14](ZipWith17.html "type parameter in ZipWith17")>` | `[in13](#in13())()` |  |
	| `[Inlet](../Inlet.html "class in akka.stream")<[A15](ZipWith17.html "type parameter in ZipWith17")>` | `[in14](#in14())()` |  |
	| `[Inlet](../Inlet.html "class in akka.stream")<[A16](ZipWith17.html "type parameter in ZipWith17")>` | `[in15](#in15())()` |  |
	| `[Inlet](../Inlet.html "class in akka.stream")<[A17](ZipWith17.html "type parameter in ZipWith17")>` | `[in16](#in16())()` |  |
	| `[Inlet](../Inlet.html "class in akka.stream")<[A3](ZipWith17.html "type parameter in ZipWith17")>` | `[in2](#in2())()` |  |
	| `[Inlet](../Inlet.html "class in akka.stream")<[A4](ZipWith17.html "type parameter in ZipWith17")>` | `[in3](#in3())()` |  |
	| `[Inlet](../Inlet.html "class in akka.stream")<[A5](ZipWith17.html "type parameter in ZipWith17")>` | `[in4](#in4())()` |  |
	| `[Inlet](../Inlet.html "class in akka.stream")<[A6](ZipWith17.html "type parameter in ZipWith17")>` | `[in5](#in5())()` |  |
	| `[Inlet](../Inlet.html "class in akka.stream")<[A7](ZipWith17.html "type parameter in ZipWith17")>` | `[in6](#in6())()` |  |
	| `[Inlet](../Inlet.html "class in akka.stream")<[A8](ZipWith17.html "type parameter in ZipWith17")>` | `[in7](#in7())()` |  |
	| `[Inlet](../Inlet.html "class in akka.stream")<[A9](ZipWith17.html "type parameter in ZipWith17")>` | `[in8](#in8())()` |  |
	| `[Inlet](../Inlet.html "class in akka.stream")<[A10](ZipWith17.html "type parameter in ZipWith17")>` | `[in9](#in9())()` |  |
	| `[Attributes](../Attributes.html "class in akka.stream")` | `[initialAttributes](#initialAttributes())()` |  |
	| `[Outlet](../Outlet.html "class in akka.stream")<[O](ZipWith17.html "type parameter in ZipWith17")>` | `[out](#out())()` |  |
	| `[FanInShape17](../FanInShape17.html "class in akka.stream")<[A1](ZipWith17.html "type parameter in ZipWith17"),​[A2](ZipWith17.html "type parameter in ZipWith17"),​[A3](ZipWith17.html "type parameter in ZipWith17"),​[A4](ZipWith17.html "type parameter in ZipWith17"),​[A5](ZipWith17.html "type parameter in ZipWith17"),​[A6](ZipWith17.html "type parameter in ZipWith17"),​[A7](ZipWith17.html "type parameter in ZipWith17"),​[A8](ZipWith17.html "type parameter in ZipWith17"),​[A9](ZipWith17.html "type parameter in ZipWith17"),​[A10](ZipWith17.html "type parameter in ZipWith17"),​[A11](ZipWith17.html "type parameter in ZipWith17"),​[A12](ZipWith17.html "type parameter in ZipWith17"),​[A13](ZipWith17.html "type parameter in ZipWith17"),​[A14](ZipWith17.html "type parameter in ZipWith17"),​[A15](ZipWith17.html "type parameter in ZipWith17"),​[A16](ZipWith17.html "type parameter in ZipWith17"),​[A17](ZipWith17.html "type parameter in ZipWith17"),​[O](ZipWith17.html "type parameter in ZipWith17")>` | `[shape](#shape())()` | The shape of a graph is all that is externally visible: its inlets and outlets. |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Function17<[A1](ZipWith17.html "type parameter in ZipWith17"),​[A2](ZipWith17.html "type parameter in ZipWith17"),​[A3](ZipWith17.html "type parameter in ZipWith17"),​[A4](ZipWith17.html "type parameter in ZipWith17"),​[A5](ZipWith17.html "type parameter in ZipWith17"),​[A6](ZipWith17.html "type parameter in ZipWith17"),​[A7](ZipWith17.html "type parameter in ZipWith17"),​[A8](ZipWith17.html "type parameter in ZipWith17"),​[A9](ZipWith17.html "type parameter in ZipWith17"),​[A10](ZipWith17.html "type parameter in ZipWith17"),​[A11](ZipWith17.html "type parameter in ZipWith17"),​[A12](ZipWith17.html "type parameter in ZipWith17"),​[A13](ZipWith17.html "type parameter in ZipWith17"),​[A14](ZipWith17.html "type parameter in ZipWith17"),​[A15](ZipWith17.html "type parameter in ZipWith17"),​[A16](ZipWith17.html "type parameter in ZipWith17"),​[A17](ZipWith17.html "type parameter in ZipWith17"),​[O](ZipWith17.html "type parameter in ZipWith17")>` | `[zipper](#zipper())()` |  |
	
	
		- ### Methods inherited from class akka.stream.stage.[GraphStage](../stage/GraphStage.html "class in akka.stream.stage")
		
		
		`[createLogicAndMaterializedValue](../stage/GraphStage.html#createLogicAndMaterializedValue(akka.stream.Attributes))`
		- ### Methods inherited from class akka.stream.stage.[GraphStageWithMaterializedValue](../stage/GraphStageWithMaterializedValue.html "class in akka.stream.stage")
		
		
		`[withAttributes](../stage/GraphStageWithMaterializedValue.html#withAttributes(akka.stream.Attributes))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface akka.stream.[Graph](../Graph.html "interface in akka.stream")
		
		
		`[addAttributes](../Graph.html#addAttributes(akka.stream.Attributes)), [async](../Graph.html#async()), [async](../Graph.html#async(java.lang.String)), [async](../Graph.html#async(java.lang.String,int)), [getAttributes](../Graph.html#getAttributes()), [named](../Graph.html#named(java.lang.String))`

- - ### Constructor Detail
	
	
	
		- #### ZipWith17
		
		
		
		```
		public ZipWith17​(scala.Function17<[A1](ZipWith17.html "type parameter in ZipWith17"),​[A2](ZipWith17.html "type parameter in ZipWith17"),​[A3](ZipWith17.html "type parameter in ZipWith17"),​[A4](ZipWith17.html "type parameter in ZipWith17"),​[A5](ZipWith17.html "type parameter in ZipWith17"),​[A6](ZipWith17.html "type parameter in ZipWith17"),​[A7](ZipWith17.html "type parameter in ZipWith17"),​[A8](ZipWith17.html "type parameter in ZipWith17"),​[A9](ZipWith17.html "type parameter in ZipWith17"),​[A10](ZipWith17.html "type parameter in ZipWith17"),​[A11](ZipWith17.html "type parameter in ZipWith17"),​[A12](ZipWith17.html "type parameter in ZipWith17"),​[A13](ZipWith17.html "type parameter in ZipWith17"),​[A14](ZipWith17.html "type parameter in ZipWith17"),​[A15](ZipWith17.html "type parameter in ZipWith17"),​[A16](ZipWith17.html "type parameter in ZipWith17"),​[A17](ZipWith17.html "type parameter in ZipWith17"),​[O](ZipWith17.html "type parameter in ZipWith17")> zipper)
		```

	- ### Method Detail
	
	
	
		- #### createLogic
		
		
		
		```
		public [GraphStageLogic](../stage/GraphStageLogic.html "class in akka.stream.stage") createLogic​([Attributes](../Attributes.html "class in akka.stream") inheritedAttributes)
		```
		
		
		Specified by:
		`[createLogic](../stage/GraphStage.html#createLogic(akka.stream.Attributes))` in class `[GraphStage](../stage/GraphStage.html "class in akka.stream.stage")<[FanInShape17](../FanInShape17.html "class in akka.stream")<[A1](ZipWith17.html "type parameter in ZipWith17"),​[A2](ZipWith17.html "type parameter in ZipWith17"),​[A3](ZipWith17.html "type parameter in ZipWith17"),​[A4](ZipWith17.html "type parameter in ZipWith17"),​[A5](ZipWith17.html "type parameter in ZipWith17"),​[A6](ZipWith17.html "type parameter in ZipWith17"),​[A7](ZipWith17.html "type parameter in ZipWith17"),​[A8](ZipWith17.html "type parameter in ZipWith17"),​[A9](ZipWith17.html "type parameter in ZipWith17"),​[A10](ZipWith17.html "type parameter in ZipWith17"),​[A11](ZipWith17.html "type parameter in ZipWith17"),​[A12](ZipWith17.html "type parameter in ZipWith17"),​[A13](ZipWith17.html "type parameter in ZipWith17"),​[A14](ZipWith17.html "type parameter in ZipWith17"),​[A15](ZipWith17.html "type parameter in ZipWith17"),​[A16](ZipWith17.html "type parameter in ZipWith17"),​[A17](ZipWith17.html "type parameter in ZipWith17"),​[O](ZipWith17.html "type parameter in ZipWith17")>>`
		- #### in0
		
		
		
		```
		public [Inlet](../Inlet.html "class in akka.stream")<[A1](ZipWith17.html "type parameter in ZipWith17")> in0()
		```
		- #### in1
		
		
		
		```
		public [Inlet](../Inlet.html "class in akka.stream")<[A2](ZipWith17.html "type parameter in ZipWith17")> in1()
		```
		- #### in10
		
		
		
		```
		public [Inlet](../Inlet.html "class in akka.stream")<[A11](ZipWith17.html "type parameter in ZipWith17")> in10()
		```
		- #### in11
		
		
		
		```
		public [Inlet](../Inlet.html "class in akka.stream")<[A12](ZipWith17.html "type parameter in ZipWith17")> in11()
		```
		- #### in12
		
		
		
		```
		public [Inlet](../Inlet.html "class in akka.stream")<[A13](ZipWith17.html "type parameter in ZipWith17")> in12()
		```
		- #### in13
		
		
		
		```
		public [Inlet](../Inlet.html "class in akka.stream")<[A14](ZipWith17.html "type parameter in ZipWith17")> in13()
		```
		- #### in14
		
		
		
		```
		public [Inlet](../Inlet.html "class in akka.stream")<[A15](ZipWith17.html "type parameter in ZipWith17")> in14()
		```
		- #### in15
		
		
		
		```
		public [Inlet](../Inlet.html "class in akka.stream")<[A16](ZipWith17.html "type parameter in ZipWith17")> in15()
		```
		- #### in16
		
		
		
		```
		public [Inlet](../Inlet.html "class in akka.stream")<[A17](ZipWith17.html "type parameter in ZipWith17")> in16()
		```
		- #### in2
		
		
		
		```
		public [Inlet](../Inlet.html "class in akka.stream")<[A3](ZipWith17.html "type parameter in ZipWith17")> in2()
		```
		- #### in3
		
		
		
		```
		public [Inlet](../Inlet.html "class in akka.stream")<[A4](ZipWith17.html "type parameter in ZipWith17")> in3()
		```
		- #### in4
		
		
		
		```
		public [Inlet](../Inlet.html "class in akka.stream")<[A5](ZipWith17.html "type parameter in ZipWith17")> in4()
		```
		- #### in5
		
		
		
		```
		public [Inlet](../Inlet.html "class in akka.stream")<[A6](ZipWith17.html "type parameter in ZipWith17")> in5()
		```
		- #### in6
		
		
		
		```
		public [Inlet](../Inlet.html "class in akka.stream")<[A7](ZipWith17.html "type parameter in ZipWith17")> in6()
		```
		- #### in7
		
		
		
		```
		public [Inlet](../Inlet.html "class in akka.stream")<[A8](ZipWith17.html "type parameter in ZipWith17")> in7()
		```
		- #### in8
		
		
		
		```
		public [Inlet](../Inlet.html "class in akka.stream")<[A9](ZipWith17.html "type parameter in ZipWith17")> in8()
		```
		- #### in9
		
		
		
		```
		public [Inlet](../Inlet.html "class in akka.stream")<[A10](ZipWith17.html "type parameter in ZipWith17")> in9()
		```
		- #### initialAttributes
		
		
		
		```
		public [Attributes](../Attributes.html "class in akka.stream") initialAttributes()
		```
		
		
		Overrides:
		`[initialAttributes](../stage/GraphStageWithMaterializedValue.html#initialAttributes())` in class `[GraphStageWithMaterializedValue](../stage/GraphStageWithMaterializedValue.html "class in akka.stream.stage")<[FanInShape17](../FanInShape17.html "class in akka.stream")<[A1](ZipWith17.html "type parameter in ZipWith17"),​[A2](ZipWith17.html "type parameter in ZipWith17"),​[A3](ZipWith17.html "type parameter in ZipWith17"),​[A4](ZipWith17.html "type parameter in ZipWith17"),​[A5](ZipWith17.html "type parameter in ZipWith17"),​[A6](ZipWith17.html "type parameter in ZipWith17"),​[A7](ZipWith17.html "type parameter in ZipWith17"),​[A8](ZipWith17.html "type parameter in ZipWith17"),​[A9](ZipWith17.html "type parameter in ZipWith17"),​[A10](ZipWith17.html "type parameter in ZipWith17"),​[A11](ZipWith17.html "type parameter in ZipWith17"),​[A12](ZipWith17.html "type parameter in ZipWith17"),​[A13](ZipWith17.html "type parameter in ZipWith17"),​[A14](ZipWith17.html "type parameter in ZipWith17"),​[A15](ZipWith17.html "type parameter in ZipWith17"),​[A16](ZipWith17.html "type parameter in ZipWith17"),​[A17](ZipWith17.html "type parameter in ZipWith17"),​[O](ZipWith17.html "type parameter in ZipWith17")>,​[NotUsed](../../NotUsed.html "class in akka")>`
		- #### out
		
		
		
		```
		public [Outlet](../Outlet.html "class in akka.stream")<[O](ZipWith17.html "type parameter in ZipWith17")> out()
		```
		- #### shape
		
		
		
		```
		public [FanInShape17](../FanInShape17.html "class in akka.stream")<[A1](ZipWith17.html "type parameter in ZipWith17"),​[A2](ZipWith17.html "type parameter in ZipWith17"),​[A3](ZipWith17.html "type parameter in ZipWith17"),​[A4](ZipWith17.html "type parameter in ZipWith17"),​[A5](ZipWith17.html "type parameter in ZipWith17"),​[A6](ZipWith17.html "type parameter in ZipWith17"),​[A7](ZipWith17.html "type parameter in ZipWith17"),​[A8](ZipWith17.html "type parameter in ZipWith17"),​[A9](ZipWith17.html "type parameter in ZipWith17"),​[A10](ZipWith17.html "type parameter in ZipWith17"),​[A11](ZipWith17.html "type parameter in ZipWith17"),​[A12](ZipWith17.html "type parameter in ZipWith17"),​[A13](ZipWith17.html "type parameter in ZipWith17"),​[A14](ZipWith17.html "type parameter in ZipWith17"),​[A15](ZipWith17.html "type parameter in ZipWith17"),​[A16](ZipWith17.html "type parameter in ZipWith17"),​[A17](ZipWith17.html "type parameter in ZipWith17"),​[O](ZipWith17.html "type parameter in ZipWith17")> shape()
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
		public scala.Function17<[A1](ZipWith17.html "type parameter in ZipWith17"),​[A2](ZipWith17.html "type parameter in ZipWith17"),​[A3](ZipWith17.html "type parameter in ZipWith17"),​[A4](ZipWith17.html "type parameter in ZipWith17"),​[A5](ZipWith17.html "type parameter in ZipWith17"),​[A6](ZipWith17.html "type parameter in ZipWith17"),​[A7](ZipWith17.html "type parameter in ZipWith17"),​[A8](ZipWith17.html "type parameter in ZipWith17"),​[A9](ZipWith17.html "type parameter in ZipWith17"),​[A10](ZipWith17.html "type parameter in ZipWith17"),​[A11](ZipWith17.html "type parameter in ZipWith17"),​[A12](ZipWith17.html "type parameter in ZipWith17"),​[A13](ZipWith17.html "type parameter in ZipWith17"),​[A14](ZipWith17.html "type parameter in ZipWith17"),​[A15](ZipWith17.html "type parameter in ZipWith17"),​[A16](ZipWith17.html "type parameter in ZipWith17"),​[A17](ZipWith17.html "type parameter in ZipWith17"),​[O](ZipWith17.html "type parameter in ZipWith17")> zipper()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/NotUsed.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/Attributes.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/FanInShape17.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/Graph.GraphMapMatVal.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/Graph.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/Inlet.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/Outlet.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/Shape.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/scaladsl/ZipWith17.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/scaladsl/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/stage/GraphStage.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/stage/GraphStageLogic.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/stage/GraphStageWithMaterializedValue.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/stream/scaladsl/ZipWith17.html](https://doc.akka.io/japi/akka-core/2.10/akka/stream/scaladsl/ZipWith17.html)*