---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:07:25Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/stream/scaladsl/ZipLatestWith19.html
title: ZipLatestWith19
---

# ZipLatestWith19

## Content

Package [akka.stream.scaladsl](package-summary.html)
## Class ZipLatestWith19\<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​A17,​A18,​A19,​O\>

- java.lang.Object
- - [akka.stream.stage.GraphStageWithMaterializedValue](../stage/GraphStageWithMaterializedValue.html "class in akka.stream.stage")\<S,​[NotUsed](../../NotUsed.html "class in akka")\>
	- - [akka.stream.stage.GraphStage](../stage/GraphStage.html "class in akka.stream.stage")\<[FanInShape19](../FanInShape19.html "class in akka.stream")\<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​A17,​A18,​A19,​O\>\>
		- - akka.stream.scaladsl.ZipLatestWith19\<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​A17,​A18,​A19,​O\>

- All Implemented Interfaces:
`[Graph](../Graph.html "interface in akka.stream")<[FanInShape19](../FanInShape19.html "class in akka.stream")<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​A17,​A18,​A19,​O>,​[NotUsed](../../NotUsed.html "class in akka")>`

---

```
public class ZipLatestWith19<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​A17,​A18,​A19,​O>
extends [GraphStage](../stage/GraphStage.html "class in akka.stream.stage")<[FanInShape19](../FanInShape19.html "class in akka.stream")<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​A17,​A18,​A19,​O>>
```

\`ZipLatestWith\` specialized for 19 inputs

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface akka.stream.[Graph](../Graph.html "interface in akka.stream")
		
		
		`[Graph.GraphMapMatVal](../Graph.GraphMapMatVal.html "class in akka.stream")<[S](../Graph.GraphMapMatVal.html "type parameter in Graph.GraphMapMatVal") extends [Shape](../Shape.html "class in akka.stream"),​[M](../Graph.GraphMapMatVal.html "type parameter in Graph.GraphMapMatVal")>`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ZipLatestWith19](#%3Cinit%3E(scala.Function19))​(scala.Function19<[A1](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[A2](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[A3](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[A4](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[A5](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[A6](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[A7](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[A8](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[A9](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[A10](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[A11](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[A12](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[A13](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[A14](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[A15](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[A16](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[A17](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[A18](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[A19](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[O](ZipLatestWith19.html "type parameter in ZipLatestWith19")> zipper)` |  |
	| `[ZipLatestWith19](#%3Cinit%3E(scala.Function19,boolean))​(scala.Function19<[A1](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[A2](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[A3](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[A4](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[A5](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[A6](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[A7](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[A8](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[A9](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[A10](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[A11](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[A12](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[A13](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[A14](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[A15](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[A16](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[A17](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[A18](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[A19](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[O](ZipLatestWith19.html "type parameter in ZipLatestWith19")> zipper,  boolean eagerComplete)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[GraphStageLogic](../stage/GraphStageLogic.html "class in akka.stream.stage")` | `[createLogic](#createLogic(akka.stream.Attributes))​([Attributes](../Attributes.html "class in akka.stream") inheritedAttributes)` |  |
	| `boolean` | `[eagerComplete](#eagerComplete())()` |  |
	| `[Inlet](../Inlet.html "class in akka.stream")<[A1](ZipLatestWith19.html "type parameter in ZipLatestWith19")>` | `[in0](#in0())()` |  |
	| `[Inlet](../Inlet.html "class in akka.stream")<[A2](ZipLatestWith19.html "type parameter in ZipLatestWith19")>` | `[in1](#in1())()` |  |
	| `[Inlet](../Inlet.html "class in akka.stream")<[A11](ZipLatestWith19.html "type parameter in ZipLatestWith19")>` | `[in10](#in10())()` |  |
	| `[Inlet](../Inlet.html "class in akka.stream")<[A12](ZipLatestWith19.html "type parameter in ZipLatestWith19")>` | `[in11](#in11())()` |  |
	| `[Inlet](../Inlet.html "class in akka.stream")<[A13](ZipLatestWith19.html "type parameter in ZipLatestWith19")>` | `[in12](#in12())()` |  |
	| `[Inlet](../Inlet.html "class in akka.stream")<[A14](ZipLatestWith19.html "type parameter in ZipLatestWith19")>` | `[in13](#in13())()` |  |
	| `[Inlet](../Inlet.html "class in akka.stream")<[A15](ZipLatestWith19.html "type parameter in ZipLatestWith19")>` | `[in14](#in14())()` |  |
	| `[Inlet](../Inlet.html "class in akka.stream")<[A16](ZipLatestWith19.html "type parameter in ZipLatestWith19")>` | `[in15](#in15())()` |  |
	| `[Inlet](../Inlet.html "class in akka.stream")<[A17](ZipLatestWith19.html "type parameter in ZipLatestWith19")>` | `[in16](#in16())()` |  |
	| `[Inlet](../Inlet.html "class in akka.stream")<[A18](ZipLatestWith19.html "type parameter in ZipLatestWith19")>` | `[in17](#in17())()` |  |
	| `[Inlet](../Inlet.html "class in akka.stream")<[A19](ZipLatestWith19.html "type parameter in ZipLatestWith19")>` | `[in18](#in18())()` |  |
	| `[Inlet](../Inlet.html "class in akka.stream")<[A3](ZipLatestWith19.html "type parameter in ZipLatestWith19")>` | `[in2](#in2())()` |  |
	| `[Inlet](../Inlet.html "class in akka.stream")<[A4](ZipLatestWith19.html "type parameter in ZipLatestWith19")>` | `[in3](#in3())()` |  |
	| `[Inlet](../Inlet.html "class in akka.stream")<[A5](ZipLatestWith19.html "type parameter in ZipLatestWith19")>` | `[in4](#in4())()` |  |
	| `[Inlet](../Inlet.html "class in akka.stream")<[A6](ZipLatestWith19.html "type parameter in ZipLatestWith19")>` | `[in5](#in5())()` |  |
	| `[Inlet](../Inlet.html "class in akka.stream")<[A7](ZipLatestWith19.html "type parameter in ZipLatestWith19")>` | `[in6](#in6())()` |  |
	| `[Inlet](../Inlet.html "class in akka.stream")<[A8](ZipLatestWith19.html "type parameter in ZipLatestWith19")>` | `[in7](#in7())()` |  |
	| `[Inlet](../Inlet.html "class in akka.stream")<[A9](ZipLatestWith19.html "type parameter in ZipLatestWith19")>` | `[in8](#in8())()` |  |
	| `[Inlet](../Inlet.html "class in akka.stream")<[A10](ZipLatestWith19.html "type parameter in ZipLatestWith19")>` | `[in9](#in9())()` |  |
	| `[Attributes](../Attributes.html "class in akka.stream")` | `[initialAttributes](#initialAttributes())()` |  |
	| `[Outlet](../Outlet.html "class in akka.stream")<[O](ZipLatestWith19.html "type parameter in ZipLatestWith19")>` | `[out](#out())()` |  |
	| `[FanInShape19](../FanInShape19.html "class in akka.stream")<[A1](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[A2](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[A3](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[A4](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[A5](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[A6](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[A7](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[A8](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[A9](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[A10](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[A11](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[A12](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[A13](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[A14](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[A15](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[A16](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[A17](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[A18](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[A19](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[O](ZipLatestWith19.html "type parameter in ZipLatestWith19")>` | `[shape](#shape())()` | The shape of a graph is all that is externally visible: its inlets and outlets. |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Function19<[A1](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[A2](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[A3](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[A4](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[A5](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[A6](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[A7](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[A8](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[A9](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[A10](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[A11](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[A12](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[A13](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[A14](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[A15](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[A16](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[A17](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[A18](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[A19](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[O](ZipLatestWith19.html "type parameter in ZipLatestWith19")>` | `[zipper](#zipper())()` |  |
	
	
		- ### Methods inherited from class akka.stream.stage.[GraphStage](../stage/GraphStage.html "class in akka.stream.stage")
		
		
		`[createLogicAndMaterializedValue](../stage/GraphStage.html#createLogicAndMaterializedValue(akka.stream.Attributes))`
		- ### Methods inherited from class akka.stream.stage.[GraphStageWithMaterializedValue](../stage/GraphStageWithMaterializedValue.html "class in akka.stream.stage")
		
		
		`[withAttributes](../stage/GraphStageWithMaterializedValue.html#withAttributes(akka.stream.Attributes))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface akka.stream.[Graph](../Graph.html "interface in akka.stream")
		
		
		`[addAttributes](../Graph.html#addAttributes(akka.stream.Attributes)), [async](../Graph.html#async()), [async](../Graph.html#async(java.lang.String)), [async](../Graph.html#async(java.lang.String,int)), [getAttributes](../Graph.html#getAttributes()), [named](../Graph.html#named(java.lang.String))`

- - ### Constructor Detail
	
	
	
		- #### ZipLatestWith19
		
		
		
		```
		public ZipLatestWith19​(scala.Function19<[A1](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[A2](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[A3](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[A4](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[A5](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[A6](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[A7](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[A8](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[A9](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[A10](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[A11](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[A12](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[A13](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[A14](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[A15](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[A16](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[A17](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[A18](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[A19](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[O](ZipLatestWith19.html "type parameter in ZipLatestWith19")> zipper,
		                       boolean eagerComplete)
		```
		- #### ZipLatestWith19
		
		
		
		```
		public ZipLatestWith19​(scala.Function19<[A1](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[A2](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[A3](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[A4](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[A5](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[A6](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[A7](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[A8](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[A9](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[A10](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[A11](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[A12](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[A13](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[A14](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[A15](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[A16](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[A17](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[A18](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[A19](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[O](ZipLatestWith19.html "type parameter in ZipLatestWith19")> zipper)
		```

	- ### Method Detail
	
	
	
		- #### createLogic
		
		
		
		```
		public [GraphStageLogic](../stage/GraphStageLogic.html "class in akka.stream.stage") createLogic​([Attributes](../Attributes.html "class in akka.stream") inheritedAttributes)
		```
		
		
		Specified by:
		`[createLogic](../stage/GraphStage.html#createLogic(akka.stream.Attributes))` in class `[GraphStage](../stage/GraphStage.html "class in akka.stream.stage")<[FanInShape19](../FanInShape19.html "class in akka.stream")<[A1](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[A2](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[A3](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[A4](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[A5](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[A6](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[A7](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[A8](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[A9](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[A10](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[A11](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[A12](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[A13](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[A14](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[A15](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[A16](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[A17](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[A18](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[A19](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[O](ZipLatestWith19.html "type parameter in ZipLatestWith19")>>`
		- #### eagerComplete
		
		
		
		```
		public boolean eagerComplete()
		```
		- #### in0
		
		
		
		```
		public [Inlet](../Inlet.html "class in akka.stream")<[A1](ZipLatestWith19.html "type parameter in ZipLatestWith19")> in0()
		```
		- #### in1
		
		
		
		```
		public [Inlet](../Inlet.html "class in akka.stream")<[A2](ZipLatestWith19.html "type parameter in ZipLatestWith19")> in1()
		```
		- #### in10
		
		
		
		```
		public [Inlet](../Inlet.html "class in akka.stream")<[A11](ZipLatestWith19.html "type parameter in ZipLatestWith19")> in10()
		```
		- #### in11
		
		
		
		```
		public [Inlet](../Inlet.html "class in akka.stream")<[A12](ZipLatestWith19.html "type parameter in ZipLatestWith19")> in11()
		```
		- #### in12
		
		
		
		```
		public [Inlet](../Inlet.html "class in akka.stream")<[A13](ZipLatestWith19.html "type parameter in ZipLatestWith19")> in12()
		```
		- #### in13
		
		
		
		```
		public [Inlet](../Inlet.html "class in akka.stream")<[A14](ZipLatestWith19.html "type parameter in ZipLatestWith19")> in13()
		```
		- #### in14
		
		
		
		```
		public [Inlet](../Inlet.html "class in akka.stream")<[A15](ZipLatestWith19.html "type parameter in ZipLatestWith19")> in14()
		```
		- #### in15
		
		
		
		```
		public [Inlet](../Inlet.html "class in akka.stream")<[A16](ZipLatestWith19.html "type parameter in ZipLatestWith19")> in15()
		```
		- #### in16
		
		
		
		```
		public [Inlet](../Inlet.html "class in akka.stream")<[A17](ZipLatestWith19.html "type parameter in ZipLatestWith19")> in16()
		```
		- #### in17
		
		
		
		```
		public [Inlet](../Inlet.html "class in akka.stream")<[A18](ZipLatestWith19.html "type parameter in ZipLatestWith19")> in17()
		```
		- #### in18
		
		
		
		```
		public [Inlet](../Inlet.html "class in akka.stream")<[A19](ZipLatestWith19.html "type parameter in ZipLatestWith19")> in18()
		```
		- #### in2
		
		
		
		```
		public [Inlet](../Inlet.html "class in akka.stream")<[A3](ZipLatestWith19.html "type parameter in ZipLatestWith19")> in2()
		```
		- #### in3
		
		
		
		```
		public [Inlet](../Inlet.html "class in akka.stream")<[A4](ZipLatestWith19.html "type parameter in ZipLatestWith19")> in3()
		```
		- #### in4
		
		
		
		```
		public [Inlet](../Inlet.html "class in akka.stream")<[A5](ZipLatestWith19.html "type parameter in ZipLatestWith19")> in4()
		```
		- #### in5
		
		
		
		```
		public [Inlet](../Inlet.html "class in akka.stream")<[A6](ZipLatestWith19.html "type parameter in ZipLatestWith19")> in5()
		```
		- #### in6
		
		
		
		```
		public [Inlet](../Inlet.html "class in akka.stream")<[A7](ZipLatestWith19.html "type parameter in ZipLatestWith19")> in6()
		```
		- #### in7
		
		
		
		```
		public [Inlet](../Inlet.html "class in akka.stream")<[A8](ZipLatestWith19.html "type parameter in ZipLatestWith19")> in7()
		```
		- #### in8
		
		
		
		```
		public [Inlet](../Inlet.html "class in akka.stream")<[A9](ZipLatestWith19.html "type parameter in ZipLatestWith19")> in8()
		```
		- #### in9
		
		
		
		```
		public [Inlet](../Inlet.html "class in akka.stream")<[A10](ZipLatestWith19.html "type parameter in ZipLatestWith19")> in9()
		```
		- #### initialAttributes
		
		
		
		```
		public [Attributes](../Attributes.html "class in akka.stream") initialAttributes()
		```
		
		
		Overrides:
		`[initialAttributes](../stage/GraphStageWithMaterializedValue.html#initialAttributes())` in class `[GraphStageWithMaterializedValue](../stage/GraphStageWithMaterializedValue.html "class in akka.stream.stage")<[FanInShape19](../FanInShape19.html "class in akka.stream")<[A1](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[A2](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[A3](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[A4](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[A5](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[A6](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[A7](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[A8](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[A9](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[A10](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[A11](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[A12](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[A13](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[A14](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[A15](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[A16](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[A17](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[A18](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[A19](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[O](ZipLatestWith19.html "type parameter in ZipLatestWith19")>,​[NotUsed](../../NotUsed.html "class in akka")>`
		- #### out
		
		
		
		```
		public [Outlet](../Outlet.html "class in akka.stream")<[O](ZipLatestWith19.html "type parameter in ZipLatestWith19")> out()
		```
		- #### shape
		
		
		
		```
		public [FanInShape19](../FanInShape19.html "class in akka.stream")<[A1](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[A2](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[A3](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[A4](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[A5](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[A6](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[A7](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[A8](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[A9](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[A10](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[A11](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[A12](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[A13](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[A14](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[A15](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[A16](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[A17](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[A18](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[A19](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[O](ZipLatestWith19.html "type parameter in ZipLatestWith19")> shape()
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
		public scala.Function19<[A1](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[A2](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[A3](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[A4](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[A5](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[A6](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[A7](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[A8](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[A9](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[A10](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[A11](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[A12](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[A13](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[A14](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[A15](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[A16](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[A17](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[A18](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[A19](ZipLatestWith19.html "type parameter in ZipLatestWith19"),​[O](ZipLatestWith19.html "type parameter in ZipLatestWith19")> zipper()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/NotUsed.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/Attributes.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/FanInShape19.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/Graph.GraphMapMatVal.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/Graph.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/Inlet.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/Outlet.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/Shape.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/scaladsl/ZipLatestWith19.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/scaladsl/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/stage/GraphStage.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/stage/GraphStageLogic.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/stage/GraphStageWithMaterializedValue.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/stream/scaladsl/ZipLatestWith19.html](https://doc.akka.io/japi/akka-core/2.10/akka/stream/scaladsl/ZipLatestWith19.html)*