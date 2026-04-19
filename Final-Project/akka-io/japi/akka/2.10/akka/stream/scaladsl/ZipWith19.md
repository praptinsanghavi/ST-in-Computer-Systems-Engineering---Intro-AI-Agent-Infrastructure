---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:48:48Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/2.10/akka/stream/scaladsl/ZipWith19.html
title: ZipWith19
---

# ZipWith19

## Content

Package [akka.stream.scaladsl](package-summary.html)
## Class ZipWith19\<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​A17,​A18,​A19,​O\>

- java.lang.Object
- - [akka.stream.stage.GraphStageWithMaterializedValue](../stage/GraphStageWithMaterializedValue.html "class in akka.stream.stage")\<S,​[NotUsed](../../NotUsed.html "class in akka")\>
	- - [akka.stream.stage.GraphStage](../stage/GraphStage.html "class in akka.stream.stage")\<[FanInShape19](../FanInShape19.html "class in akka.stream")\<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​A17,​A18,​A19,​O\>\>
		- - akka.stream.scaladsl.ZipWith19\<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​A17,​A18,​A19,​O\>

- All Implemented Interfaces:
`[Graph](../Graph.html "interface in akka.stream")<[FanInShape19](../FanInShape19.html "class in akka.stream")<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​A17,​A18,​A19,​O>,​[NotUsed](../../NotUsed.html "class in akka")>`

---

```
public class ZipWith19<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​A17,​A18,​A19,​O>
extends [GraphStage](../stage/GraphStage.html "class in akka.stream.stage")<[FanInShape19](../FanInShape19.html "class in akka.stream")<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​A17,​A18,​A19,​O>>
```

\`ZipWith\` specialized for 19 inputs

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface akka.stream.[Graph](../Graph.html "interface in akka.stream")
		
		
		`[Graph.GraphMapMatVal](../Graph.GraphMapMatVal.html "class in akka.stream")<[S](../Graph.GraphMapMatVal.html "type parameter in Graph.GraphMapMatVal") extends [Shape](../Shape.html "class in akka.stream"),​[M](../Graph.GraphMapMatVal.html "type parameter in Graph.GraphMapMatVal")>`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ZipWith19](#%3Cinit%3E(scala.Function19))​(scala.Function19<[A1](ZipWith19.html "type parameter in ZipWith19"),​[A2](ZipWith19.html "type parameter in ZipWith19"),​[A3](ZipWith19.html "type parameter in ZipWith19"),​[A4](ZipWith19.html "type parameter in ZipWith19"),​[A5](ZipWith19.html "type parameter in ZipWith19"),​[A6](ZipWith19.html "type parameter in ZipWith19"),​[A7](ZipWith19.html "type parameter in ZipWith19"),​[A8](ZipWith19.html "type parameter in ZipWith19"),​[A9](ZipWith19.html "type parameter in ZipWith19"),​[A10](ZipWith19.html "type parameter in ZipWith19"),​[A11](ZipWith19.html "type parameter in ZipWith19"),​[A12](ZipWith19.html "type parameter in ZipWith19"),​[A13](ZipWith19.html "type parameter in ZipWith19"),​[A14](ZipWith19.html "type parameter in ZipWith19"),​[A15](ZipWith19.html "type parameter in ZipWith19"),​[A16](ZipWith19.html "type parameter in ZipWith19"),​[A17](ZipWith19.html "type parameter in ZipWith19"),​[A18](ZipWith19.html "type parameter in ZipWith19"),​[A19](ZipWith19.html "type parameter in ZipWith19"),​[O](ZipWith19.html "type parameter in ZipWith19")> zipper)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[GraphStageLogic](../stage/GraphStageLogic.html "class in akka.stream.stage")` | `[createLogic](#createLogic(akka.stream.Attributes))​([Attributes](../Attributes.html "class in akka.stream") inheritedAttributes)` |  |
	| `[Inlet](../Inlet.html "class in akka.stream")<[A1](ZipWith19.html "type parameter in ZipWith19")>` | `[in0](#in0())()` |  |
	| `[Inlet](../Inlet.html "class in akka.stream")<[A2](ZipWith19.html "type parameter in ZipWith19")>` | `[in1](#in1())()` |  |
	| `[Inlet](../Inlet.html "class in akka.stream")<[A11](ZipWith19.html "type parameter in ZipWith19")>` | `[in10](#in10())()` |  |
	| `[Inlet](../Inlet.html "class in akka.stream")<[A12](ZipWith19.html "type parameter in ZipWith19")>` | `[in11](#in11())()` |  |
	| `[Inlet](../Inlet.html "class in akka.stream")<[A13](ZipWith19.html "type parameter in ZipWith19")>` | `[in12](#in12())()` |  |
	| `[Inlet](../Inlet.html "class in akka.stream")<[A14](ZipWith19.html "type parameter in ZipWith19")>` | `[in13](#in13())()` |  |
	| `[Inlet](../Inlet.html "class in akka.stream")<[A15](ZipWith19.html "type parameter in ZipWith19")>` | `[in14](#in14())()` |  |
	| `[Inlet](../Inlet.html "class in akka.stream")<[A16](ZipWith19.html "type parameter in ZipWith19")>` | `[in15](#in15())()` |  |
	| `[Inlet](../Inlet.html "class in akka.stream")<[A17](ZipWith19.html "type parameter in ZipWith19")>` | `[in16](#in16())()` |  |
	| `[Inlet](../Inlet.html "class in akka.stream")<[A18](ZipWith19.html "type parameter in ZipWith19")>` | `[in17](#in17())()` |  |
	| `[Inlet](../Inlet.html "class in akka.stream")<[A19](ZipWith19.html "type parameter in ZipWith19")>` | `[in18](#in18())()` |  |
	| `[Inlet](../Inlet.html "class in akka.stream")<[A3](ZipWith19.html "type parameter in ZipWith19")>` | `[in2](#in2())()` |  |
	| `[Inlet](../Inlet.html "class in akka.stream")<[A4](ZipWith19.html "type parameter in ZipWith19")>` | `[in3](#in3())()` |  |
	| `[Inlet](../Inlet.html "class in akka.stream")<[A5](ZipWith19.html "type parameter in ZipWith19")>` | `[in4](#in4())()` |  |
	| `[Inlet](../Inlet.html "class in akka.stream")<[A6](ZipWith19.html "type parameter in ZipWith19")>` | `[in5](#in5())()` |  |
	| `[Inlet](../Inlet.html "class in akka.stream")<[A7](ZipWith19.html "type parameter in ZipWith19")>` | `[in6](#in6())()` |  |
	| `[Inlet](../Inlet.html "class in akka.stream")<[A8](ZipWith19.html "type parameter in ZipWith19")>` | `[in7](#in7())()` |  |
	| `[Inlet](../Inlet.html "class in akka.stream")<[A9](ZipWith19.html "type parameter in ZipWith19")>` | `[in8](#in8())()` |  |
	| `[Inlet](../Inlet.html "class in akka.stream")<[A10](ZipWith19.html "type parameter in ZipWith19")>` | `[in9](#in9())()` |  |
	| `[Attributes](../Attributes.html "class in akka.stream")` | `[initialAttributes](#initialAttributes())()` |  |
	| `[Outlet](../Outlet.html "class in akka.stream")<[O](ZipWith19.html "type parameter in ZipWith19")>` | `[out](#out())()` |  |
	| `[FanInShape19](../FanInShape19.html "class in akka.stream")<[A1](ZipWith19.html "type parameter in ZipWith19"),​[A2](ZipWith19.html "type parameter in ZipWith19"),​[A3](ZipWith19.html "type parameter in ZipWith19"),​[A4](ZipWith19.html "type parameter in ZipWith19"),​[A5](ZipWith19.html "type parameter in ZipWith19"),​[A6](ZipWith19.html "type parameter in ZipWith19"),​[A7](ZipWith19.html "type parameter in ZipWith19"),​[A8](ZipWith19.html "type parameter in ZipWith19"),​[A9](ZipWith19.html "type parameter in ZipWith19"),​[A10](ZipWith19.html "type parameter in ZipWith19"),​[A11](ZipWith19.html "type parameter in ZipWith19"),​[A12](ZipWith19.html "type parameter in ZipWith19"),​[A13](ZipWith19.html "type parameter in ZipWith19"),​[A14](ZipWith19.html "type parameter in ZipWith19"),​[A15](ZipWith19.html "type parameter in ZipWith19"),​[A16](ZipWith19.html "type parameter in ZipWith19"),​[A17](ZipWith19.html "type parameter in ZipWith19"),​[A18](ZipWith19.html "type parameter in ZipWith19"),​[A19](ZipWith19.html "type parameter in ZipWith19"),​[O](ZipWith19.html "type parameter in ZipWith19")>` | `[shape](#shape())()` | The shape of a graph is all that is externally visible: its inlets and outlets. |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Function19<[A1](ZipWith19.html "type parameter in ZipWith19"),​[A2](ZipWith19.html "type parameter in ZipWith19"),​[A3](ZipWith19.html "type parameter in ZipWith19"),​[A4](ZipWith19.html "type parameter in ZipWith19"),​[A5](ZipWith19.html "type parameter in ZipWith19"),​[A6](ZipWith19.html "type parameter in ZipWith19"),​[A7](ZipWith19.html "type parameter in ZipWith19"),​[A8](ZipWith19.html "type parameter in ZipWith19"),​[A9](ZipWith19.html "type parameter in ZipWith19"),​[A10](ZipWith19.html "type parameter in ZipWith19"),​[A11](ZipWith19.html "type parameter in ZipWith19"),​[A12](ZipWith19.html "type parameter in ZipWith19"),​[A13](ZipWith19.html "type parameter in ZipWith19"),​[A14](ZipWith19.html "type parameter in ZipWith19"),​[A15](ZipWith19.html "type parameter in ZipWith19"),​[A16](ZipWith19.html "type parameter in ZipWith19"),​[A17](ZipWith19.html "type parameter in ZipWith19"),​[A18](ZipWith19.html "type parameter in ZipWith19"),​[A19](ZipWith19.html "type parameter in ZipWith19"),​[O](ZipWith19.html "type parameter in ZipWith19")>` | `[zipper](#zipper())()` |  |
	
	
		- ### Methods inherited from class akka.stream.stage.[GraphStage](../stage/GraphStage.html "class in akka.stream.stage")
		
		
		`[createLogicAndMaterializedValue](../stage/GraphStage.html#createLogicAndMaterializedValue(akka.stream.Attributes))`
		- ### Methods inherited from class akka.stream.stage.[GraphStageWithMaterializedValue](../stage/GraphStageWithMaterializedValue.html "class in akka.stream.stage")
		
		
		`[withAttributes](../stage/GraphStageWithMaterializedValue.html#withAttributes(akka.stream.Attributes))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface akka.stream.[Graph](../Graph.html "interface in akka.stream")
		
		
		`[addAttributes](../Graph.html#addAttributes(akka.stream.Attributes)), [async](../Graph.html#async()), [async](../Graph.html#async(java.lang.String)), [async](../Graph.html#async(java.lang.String,int)), [getAttributes](../Graph.html#getAttributes()), [named](../Graph.html#named(java.lang.String))`

- - ### Constructor Detail
	
	
	
		- #### ZipWith19
		
		
		
		```
		public ZipWith19​(scala.Function19<[A1](ZipWith19.html "type parameter in ZipWith19"),​[A2](ZipWith19.html "type parameter in ZipWith19"),​[A3](ZipWith19.html "type parameter in ZipWith19"),​[A4](ZipWith19.html "type parameter in ZipWith19"),​[A5](ZipWith19.html "type parameter in ZipWith19"),​[A6](ZipWith19.html "type parameter in ZipWith19"),​[A7](ZipWith19.html "type parameter in ZipWith19"),​[A8](ZipWith19.html "type parameter in ZipWith19"),​[A9](ZipWith19.html "type parameter in ZipWith19"),​[A10](ZipWith19.html "type parameter in ZipWith19"),​[A11](ZipWith19.html "type parameter in ZipWith19"),​[A12](ZipWith19.html "type parameter in ZipWith19"),​[A13](ZipWith19.html "type parameter in ZipWith19"),​[A14](ZipWith19.html "type parameter in ZipWith19"),​[A15](ZipWith19.html "type parameter in ZipWith19"),​[A16](ZipWith19.html "type parameter in ZipWith19"),​[A17](ZipWith19.html "type parameter in ZipWith19"),​[A18](ZipWith19.html "type parameter in ZipWith19"),​[A19](ZipWith19.html "type parameter in ZipWith19"),​[O](ZipWith19.html "type parameter in ZipWith19")> zipper)
		```

	- ### Method Detail
	
	
	
		- #### createLogic
		
		
		
		```
		public [GraphStageLogic](../stage/GraphStageLogic.html "class in akka.stream.stage") createLogic​([Attributes](../Attributes.html "class in akka.stream") inheritedAttributes)
		```
		
		
		Specified by:
		`[createLogic](../stage/GraphStage.html#createLogic(akka.stream.Attributes))` in class `[GraphStage](../stage/GraphStage.html "class in akka.stream.stage")<[FanInShape19](../FanInShape19.html "class in akka.stream")<[A1](ZipWith19.html "type parameter in ZipWith19"),​[A2](ZipWith19.html "type parameter in ZipWith19"),​[A3](ZipWith19.html "type parameter in ZipWith19"),​[A4](ZipWith19.html "type parameter in ZipWith19"),​[A5](ZipWith19.html "type parameter in ZipWith19"),​[A6](ZipWith19.html "type parameter in ZipWith19"),​[A7](ZipWith19.html "type parameter in ZipWith19"),​[A8](ZipWith19.html "type parameter in ZipWith19"),​[A9](ZipWith19.html "type parameter in ZipWith19"),​[A10](ZipWith19.html "type parameter in ZipWith19"),​[A11](ZipWith19.html "type parameter in ZipWith19"),​[A12](ZipWith19.html "type parameter in ZipWith19"),​[A13](ZipWith19.html "type parameter in ZipWith19"),​[A14](ZipWith19.html "type parameter in ZipWith19"),​[A15](ZipWith19.html "type parameter in ZipWith19"),​[A16](ZipWith19.html "type parameter in ZipWith19"),​[A17](ZipWith19.html "type parameter in ZipWith19"),​[A18](ZipWith19.html "type parameter in ZipWith19"),​[A19](ZipWith19.html "type parameter in ZipWith19"),​[O](ZipWith19.html "type parameter in ZipWith19")>>`
		- #### in0
		
		
		
		```
		public [Inlet](../Inlet.html "class in akka.stream")<[A1](ZipWith19.html "type parameter in ZipWith19")> in0()
		```
		- #### in1
		
		
		
		```
		public [Inlet](../Inlet.html "class in akka.stream")<[A2](ZipWith19.html "type parameter in ZipWith19")> in1()
		```
		- #### in10
		
		
		
		```
		public [Inlet](../Inlet.html "class in akka.stream")<[A11](ZipWith19.html "type parameter in ZipWith19")> in10()
		```
		- #### in11
		
		
		
		```
		public [Inlet](../Inlet.html "class in akka.stream")<[A12](ZipWith19.html "type parameter in ZipWith19")> in11()
		```
		- #### in12
		
		
		
		```
		public [Inlet](../Inlet.html "class in akka.stream")<[A13](ZipWith19.html "type parameter in ZipWith19")> in12()
		```
		- #### in13
		
		
		
		```
		public [Inlet](../Inlet.html "class in akka.stream")<[A14](ZipWith19.html "type parameter in ZipWith19")> in13()
		```
		- #### in14
		
		
		
		```
		public [Inlet](../Inlet.html "class in akka.stream")<[A15](ZipWith19.html "type parameter in ZipWith19")> in14()
		```
		- #### in15
		
		
		
		```
		public [Inlet](../Inlet.html "class in akka.stream")<[A16](ZipWith19.html "type parameter in ZipWith19")> in15()
		```
		- #### in16
		
		
		
		```
		public [Inlet](../Inlet.html "class in akka.stream")<[A17](ZipWith19.html "type parameter in ZipWith19")> in16()
		```
		- #### in17
		
		
		
		```
		public [Inlet](../Inlet.html "class in akka.stream")<[A18](ZipWith19.html "type parameter in ZipWith19")> in17()
		```
		- #### in18
		
		
		
		```
		public [Inlet](../Inlet.html "class in akka.stream")<[A19](ZipWith19.html "type parameter in ZipWith19")> in18()
		```
		- #### in2
		
		
		
		```
		public [Inlet](../Inlet.html "class in akka.stream")<[A3](ZipWith19.html "type parameter in ZipWith19")> in2()
		```
		- #### in3
		
		
		
		```
		public [Inlet](../Inlet.html "class in akka.stream")<[A4](ZipWith19.html "type parameter in ZipWith19")> in3()
		```
		- #### in4
		
		
		
		```
		public [Inlet](../Inlet.html "class in akka.stream")<[A5](ZipWith19.html "type parameter in ZipWith19")> in4()
		```
		- #### in5
		
		
		
		```
		public [Inlet](../Inlet.html "class in akka.stream")<[A6](ZipWith19.html "type parameter in ZipWith19")> in5()
		```
		- #### in6
		
		
		
		```
		public [Inlet](../Inlet.html "class in akka.stream")<[A7](ZipWith19.html "type parameter in ZipWith19")> in6()
		```
		- #### in7
		
		
		
		```
		public [Inlet](../Inlet.html "class in akka.stream")<[A8](ZipWith19.html "type parameter in ZipWith19")> in7()
		```
		- #### in8
		
		
		
		```
		public [Inlet](../Inlet.html "class in akka.stream")<[A9](ZipWith19.html "type parameter in ZipWith19")> in8()
		```
		- #### in9
		
		
		
		```
		public [Inlet](../Inlet.html "class in akka.stream")<[A10](ZipWith19.html "type parameter in ZipWith19")> in9()
		```
		- #### initialAttributes
		
		
		
		```
		public [Attributes](../Attributes.html "class in akka.stream") initialAttributes()
		```
		
		
		Overrides:
		`[initialAttributes](../stage/GraphStageWithMaterializedValue.html#initialAttributes())` in class `[GraphStageWithMaterializedValue](../stage/GraphStageWithMaterializedValue.html "class in akka.stream.stage")<[FanInShape19](../FanInShape19.html "class in akka.stream")<[A1](ZipWith19.html "type parameter in ZipWith19"),​[A2](ZipWith19.html "type parameter in ZipWith19"),​[A3](ZipWith19.html "type parameter in ZipWith19"),​[A4](ZipWith19.html "type parameter in ZipWith19"),​[A5](ZipWith19.html "type parameter in ZipWith19"),​[A6](ZipWith19.html "type parameter in ZipWith19"),​[A7](ZipWith19.html "type parameter in ZipWith19"),​[A8](ZipWith19.html "type parameter in ZipWith19"),​[A9](ZipWith19.html "type parameter in ZipWith19"),​[A10](ZipWith19.html "type parameter in ZipWith19"),​[A11](ZipWith19.html "type parameter in ZipWith19"),​[A12](ZipWith19.html "type parameter in ZipWith19"),​[A13](ZipWith19.html "type parameter in ZipWith19"),​[A14](ZipWith19.html "type parameter in ZipWith19"),​[A15](ZipWith19.html "type parameter in ZipWith19"),​[A16](ZipWith19.html "type parameter in ZipWith19"),​[A17](ZipWith19.html "type parameter in ZipWith19"),​[A18](ZipWith19.html "type parameter in ZipWith19"),​[A19](ZipWith19.html "type parameter in ZipWith19"),​[O](ZipWith19.html "type parameter in ZipWith19")>,​[NotUsed](../../NotUsed.html "class in akka")>`
		- #### out
		
		
		
		```
		public [Outlet](../Outlet.html "class in akka.stream")<[O](ZipWith19.html "type parameter in ZipWith19")> out()
		```
		- #### shape
		
		
		
		```
		public [FanInShape19](../FanInShape19.html "class in akka.stream")<[A1](ZipWith19.html "type parameter in ZipWith19"),​[A2](ZipWith19.html "type parameter in ZipWith19"),​[A3](ZipWith19.html "type parameter in ZipWith19"),​[A4](ZipWith19.html "type parameter in ZipWith19"),​[A5](ZipWith19.html "type parameter in ZipWith19"),​[A6](ZipWith19.html "type parameter in ZipWith19"),​[A7](ZipWith19.html "type parameter in ZipWith19"),​[A8](ZipWith19.html "type parameter in ZipWith19"),​[A9](ZipWith19.html "type parameter in ZipWith19"),​[A10](ZipWith19.html "type parameter in ZipWith19"),​[A11](ZipWith19.html "type parameter in ZipWith19"),​[A12](ZipWith19.html "type parameter in ZipWith19"),​[A13](ZipWith19.html "type parameter in ZipWith19"),​[A14](ZipWith19.html "type parameter in ZipWith19"),​[A15](ZipWith19.html "type parameter in ZipWith19"),​[A16](ZipWith19.html "type parameter in ZipWith19"),​[A17](ZipWith19.html "type parameter in ZipWith19"),​[A18](ZipWith19.html "type parameter in ZipWith19"),​[A19](ZipWith19.html "type parameter in ZipWith19"),​[O](ZipWith19.html "type parameter in ZipWith19")> shape()
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
		public scala.Function19<[A1](ZipWith19.html "type parameter in ZipWith19"),​[A2](ZipWith19.html "type parameter in ZipWith19"),​[A3](ZipWith19.html "type parameter in ZipWith19"),​[A4](ZipWith19.html "type parameter in ZipWith19"),​[A5](ZipWith19.html "type parameter in ZipWith19"),​[A6](ZipWith19.html "type parameter in ZipWith19"),​[A7](ZipWith19.html "type parameter in ZipWith19"),​[A8](ZipWith19.html "type parameter in ZipWith19"),​[A9](ZipWith19.html "type parameter in ZipWith19"),​[A10](ZipWith19.html "type parameter in ZipWith19"),​[A11](ZipWith19.html "type parameter in ZipWith19"),​[A12](ZipWith19.html "type parameter in ZipWith19"),​[A13](ZipWith19.html "type parameter in ZipWith19"),​[A14](ZipWith19.html "type parameter in ZipWith19"),​[A15](ZipWith19.html "type parameter in ZipWith19"),​[A16](ZipWith19.html "type parameter in ZipWith19"),​[A17](ZipWith19.html "type parameter in ZipWith19"),​[A18](ZipWith19.html "type parameter in ZipWith19"),​[A19](ZipWith19.html "type parameter in ZipWith19"),​[O](ZipWith19.html "type parameter in ZipWith19")> zipper()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/2.10/akka/NotUsed.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/Attributes.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/FanInShape19.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/Graph.GraphMapMatVal.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/Graph.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/Inlet.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/Outlet.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/Shape.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/scaladsl/ZipWith19.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/scaladsl/package-summary.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/stage/GraphStage.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/stage/GraphStageLogic.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/stage/GraphStageWithMaterializedValue.html

---
*Source: [https://doc.akka.io/japi/akka/2.10/akka/stream/scaladsl/ZipWith19.html](https://doc.akka.io/japi/akka/2.10/akka/stream/scaladsl/ZipWith19.html)*