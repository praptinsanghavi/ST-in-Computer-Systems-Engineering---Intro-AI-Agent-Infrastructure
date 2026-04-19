---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:42:48Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/UnzipWith15.html
title: UnzipWith15
---

# UnzipWith15

## Content

Package [akka.stream.scaladsl](package-summary.html)
## Class UnzipWith15\<In,​A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15\>

- java.lang.Object
- - [akka.stream.stage.GraphStageWithMaterializedValue](../stage/GraphStageWithMaterializedValue.html "class in akka.stream.stage")\<S,​[NotUsed](../../NotUsed.html "class in akka")\>
	- - [akka.stream.stage.GraphStage](../stage/GraphStage.html "class in akka.stream.stage")\<[FanOutShape15](../FanOutShape15.html "class in akka.stream")\<In,​A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15\>\>
		- - akka.stream.scaladsl.UnzipWith15\<In,​A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15\>

- All Implemented Interfaces:
`[Graph](../Graph.html "interface in akka.stream")<[FanOutShape15](../FanOutShape15.html "class in akka.stream")<In,​A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15>,​[NotUsed](../../NotUsed.html "class in akka")>`

---

```
public class UnzipWith15<In,​A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15>
extends [GraphStage](../stage/GraphStage.html "class in akka.stream.stage")<[FanOutShape15](../FanOutShape15.html "class in akka.stream")<In,​A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15>>
```

\`UnzipWith\` specialized for 15 outputs

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface akka.stream.[Graph](../Graph.html "interface in akka.stream")
		
		
		`[Graph.GraphMapMatVal](../Graph.GraphMapMatVal.html "class in akka.stream")<[S](../Graph.GraphMapMatVal.html "type parameter in Graph.GraphMapMatVal") extends [Shape](../Shape.html "class in akka.stream"),​[M](../Graph.GraphMapMatVal.html "type parameter in Graph.GraphMapMatVal")>`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[UnzipWith15](#%3Cinit%3E(scala.Function1))​(scala.Function1<[In](UnzipWith15.html "type parameter in UnzipWith15"),​scala.Tuple15<[A1](UnzipWith15.html "type parameter in UnzipWith15"),​[A2](UnzipWith15.html "type parameter in UnzipWith15"),​[A3](UnzipWith15.html "type parameter in UnzipWith15"),​[A4](UnzipWith15.html "type parameter in UnzipWith15"),​[A5](UnzipWith15.html "type parameter in UnzipWith15"),​[A6](UnzipWith15.html "type parameter in UnzipWith15"),​[A7](UnzipWith15.html "type parameter in UnzipWith15"),​[A8](UnzipWith15.html "type parameter in UnzipWith15"),​[A9](UnzipWith15.html "type parameter in UnzipWith15"),​[A10](UnzipWith15.html "type parameter in UnzipWith15"),​[A11](UnzipWith15.html "type parameter in UnzipWith15"),​[A12](UnzipWith15.html "type parameter in UnzipWith15"),​[A13](UnzipWith15.html "type parameter in UnzipWith15"),​[A14](UnzipWith15.html "type parameter in UnzipWith15"),​[A15](UnzipWith15.html "type parameter in UnzipWith15")>> unzipper)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[GraphStageLogic](../stage/GraphStageLogic.html "class in akka.stream.stage")` | `[createLogic](#createLogic(akka.stream.Attributes))​([Attributes](../Attributes.html "class in akka.stream") inheritedAttributes)` |  |
	| `[Inlet](../Inlet.html "class in akka.stream")<[In](UnzipWith15.html "type parameter in UnzipWith15")>` | `[in](#in())()` |  |
	| `[Attributes](../Attributes.html "class in akka.stream")` | `[initialAttributes](#initialAttributes())()` |  |
	| `[Outlet](../Outlet.html "class in akka.stream")<[A1](UnzipWith15.html "type parameter in UnzipWith15")>` | `[out0](#out0())()` |  |
	| `[Outlet](../Outlet.html "class in akka.stream")<[A2](UnzipWith15.html "type parameter in UnzipWith15")>` | `[out1](#out1())()` |  |
	| `[Outlet](../Outlet.html "class in akka.stream")<[A11](UnzipWith15.html "type parameter in UnzipWith15")>` | `[out10](#out10())()` |  |
	| `[Outlet](../Outlet.html "class in akka.stream")<[A12](UnzipWith15.html "type parameter in UnzipWith15")>` | `[out11](#out11())()` |  |
	| `[Outlet](../Outlet.html "class in akka.stream")<[A13](UnzipWith15.html "type parameter in UnzipWith15")>` | `[out12](#out12())()` |  |
	| `[Outlet](../Outlet.html "class in akka.stream")<[A14](UnzipWith15.html "type parameter in UnzipWith15")>` | `[out13](#out13())()` |  |
	| `[Outlet](../Outlet.html "class in akka.stream")<[A15](UnzipWith15.html "type parameter in UnzipWith15")>` | `[out14](#out14())()` |  |
	| `[Outlet](../Outlet.html "class in akka.stream")<[A3](UnzipWith15.html "type parameter in UnzipWith15")>` | `[out2](#out2())()` |  |
	| `[Outlet](../Outlet.html "class in akka.stream")<[A4](UnzipWith15.html "type parameter in UnzipWith15")>` | `[out3](#out3())()` |  |
	| `[Outlet](../Outlet.html "class in akka.stream")<[A5](UnzipWith15.html "type parameter in UnzipWith15")>` | `[out4](#out4())()` |  |
	| `[Outlet](../Outlet.html "class in akka.stream")<[A6](UnzipWith15.html "type parameter in UnzipWith15")>` | `[out5](#out5())()` |  |
	| `[Outlet](../Outlet.html "class in akka.stream")<[A7](UnzipWith15.html "type parameter in UnzipWith15")>` | `[out6](#out6())()` |  |
	| `[Outlet](../Outlet.html "class in akka.stream")<[A8](UnzipWith15.html "type parameter in UnzipWith15")>` | `[out7](#out7())()` |  |
	| `[Outlet](../Outlet.html "class in akka.stream")<[A9](UnzipWith15.html "type parameter in UnzipWith15")>` | `[out8](#out8())()` |  |
	| `[Outlet](../Outlet.html "class in akka.stream")<[A10](UnzipWith15.html "type parameter in UnzipWith15")>` | `[out9](#out9())()` |  |
	| `[FanOutShape15](../FanOutShape15.html "class in akka.stream")<[In](UnzipWith15.html "type parameter in UnzipWith15"),​[A1](UnzipWith15.html "type parameter in UnzipWith15"),​[A2](UnzipWith15.html "type parameter in UnzipWith15"),​[A3](UnzipWith15.html "type parameter in UnzipWith15"),​[A4](UnzipWith15.html "type parameter in UnzipWith15"),​[A5](UnzipWith15.html "type parameter in UnzipWith15"),​[A6](UnzipWith15.html "type parameter in UnzipWith15"),​[A7](UnzipWith15.html "type parameter in UnzipWith15"),​[A8](UnzipWith15.html "type parameter in UnzipWith15"),​[A9](UnzipWith15.html "type parameter in UnzipWith15"),​[A10](UnzipWith15.html "type parameter in UnzipWith15"),​[A11](UnzipWith15.html "type parameter in UnzipWith15"),​[A12](UnzipWith15.html "type parameter in UnzipWith15"),​[A13](UnzipWith15.html "type parameter in UnzipWith15"),​[A14](UnzipWith15.html "type parameter in UnzipWith15"),​[A15](UnzipWith15.html "type parameter in UnzipWith15")>` | `[shape](#shape())()` | The shape of a graph is all that is externally visible: its inlets and outlets. |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Function1<[In](UnzipWith15.html "type parameter in UnzipWith15"),​scala.Tuple15<[A1](UnzipWith15.html "type parameter in UnzipWith15"),​[A2](UnzipWith15.html "type parameter in UnzipWith15"),​[A3](UnzipWith15.html "type parameter in UnzipWith15"),​[A4](UnzipWith15.html "type parameter in UnzipWith15"),​[A5](UnzipWith15.html "type parameter in UnzipWith15"),​[A6](UnzipWith15.html "type parameter in UnzipWith15"),​[A7](UnzipWith15.html "type parameter in UnzipWith15"),​[A8](UnzipWith15.html "type parameter in UnzipWith15"),​[A9](UnzipWith15.html "type parameter in UnzipWith15"),​[A10](UnzipWith15.html "type parameter in UnzipWith15"),​[A11](UnzipWith15.html "type parameter in UnzipWith15"),​[A12](UnzipWith15.html "type parameter in UnzipWith15"),​[A13](UnzipWith15.html "type parameter in UnzipWith15"),​[A14](UnzipWith15.html "type parameter in UnzipWith15"),​[A15](UnzipWith15.html "type parameter in UnzipWith15")>>` | `[unzipper](#unzipper())()` |  |
	
	
		- ### Methods inherited from class akka.stream.stage.[GraphStage](../stage/GraphStage.html "class in akka.stream.stage")
		
		
		`[createLogicAndMaterializedValue](../stage/GraphStage.html#createLogicAndMaterializedValue(akka.stream.Attributes))`
		- ### Methods inherited from class akka.stream.stage.[GraphStageWithMaterializedValue](../stage/GraphStageWithMaterializedValue.html "class in akka.stream.stage")
		
		
		`[withAttributes](../stage/GraphStageWithMaterializedValue.html#withAttributes(akka.stream.Attributes))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface akka.stream.[Graph](../Graph.html "interface in akka.stream")
		
		
		`[addAttributes](../Graph.html#addAttributes(akka.stream.Attributes)), [async](../Graph.html#async()), [async](../Graph.html#async(java.lang.String)), [async](../Graph.html#async(java.lang.String,int)), [getAttributes](../Graph.html#getAttributes()), [named](../Graph.html#named(java.lang.String))`

- - ### Constructor Detail
	
	
	
		- #### UnzipWith15
		
		
		
		```
		public UnzipWith15​(scala.Function1<[In](UnzipWith15.html "type parameter in UnzipWith15"),​scala.Tuple15<[A1](UnzipWith15.html "type parameter in UnzipWith15"),​[A2](UnzipWith15.html "type parameter in UnzipWith15"),​[A3](UnzipWith15.html "type parameter in UnzipWith15"),​[A4](UnzipWith15.html "type parameter in UnzipWith15"),​[A5](UnzipWith15.html "type parameter in UnzipWith15"),​[A6](UnzipWith15.html "type parameter in UnzipWith15"),​[A7](UnzipWith15.html "type parameter in UnzipWith15"),​[A8](UnzipWith15.html "type parameter in UnzipWith15"),​[A9](UnzipWith15.html "type parameter in UnzipWith15"),​[A10](UnzipWith15.html "type parameter in UnzipWith15"),​[A11](UnzipWith15.html "type parameter in UnzipWith15"),​[A12](UnzipWith15.html "type parameter in UnzipWith15"),​[A13](UnzipWith15.html "type parameter in UnzipWith15"),​[A14](UnzipWith15.html "type parameter in UnzipWith15"),​[A15](UnzipWith15.html "type parameter in UnzipWith15")>> unzipper)
		```

	- ### Method Detail
	
	
	
		- #### createLogic
		
		
		
		```
		public [GraphStageLogic](../stage/GraphStageLogic.html "class in akka.stream.stage") createLogic​([Attributes](../Attributes.html "class in akka.stream") inheritedAttributes)
		```
		
		
		Specified by:
		`[createLogic](../stage/GraphStage.html#createLogic(akka.stream.Attributes))` in class `[GraphStage](../stage/GraphStage.html "class in akka.stream.stage")<[FanOutShape15](../FanOutShape15.html "class in akka.stream")<[In](UnzipWith15.html "type parameter in UnzipWith15"),​[A1](UnzipWith15.html "type parameter in UnzipWith15"),​[A2](UnzipWith15.html "type parameter in UnzipWith15"),​[A3](UnzipWith15.html "type parameter in UnzipWith15"),​[A4](UnzipWith15.html "type parameter in UnzipWith15"),​[A5](UnzipWith15.html "type parameter in UnzipWith15"),​[A6](UnzipWith15.html "type parameter in UnzipWith15"),​[A7](UnzipWith15.html "type parameter in UnzipWith15"),​[A8](UnzipWith15.html "type parameter in UnzipWith15"),​[A9](UnzipWith15.html "type parameter in UnzipWith15"),​[A10](UnzipWith15.html "type parameter in UnzipWith15"),​[A11](UnzipWith15.html "type parameter in UnzipWith15"),​[A12](UnzipWith15.html "type parameter in UnzipWith15"),​[A13](UnzipWith15.html "type parameter in UnzipWith15"),​[A14](UnzipWith15.html "type parameter in UnzipWith15"),​[A15](UnzipWith15.html "type parameter in UnzipWith15")>>`
		- #### in
		
		
		
		```
		public [Inlet](../Inlet.html "class in akka.stream")<[In](UnzipWith15.html "type parameter in UnzipWith15")> in()
		```
		- #### initialAttributes
		
		
		
		```
		public [Attributes](../Attributes.html "class in akka.stream") initialAttributes()
		```
		
		
		Overrides:
		`[initialAttributes](../stage/GraphStageWithMaterializedValue.html#initialAttributes())` in class `[GraphStageWithMaterializedValue](../stage/GraphStageWithMaterializedValue.html "class in akka.stream.stage")<[FanOutShape15](../FanOutShape15.html "class in akka.stream")<[In](UnzipWith15.html "type parameter in UnzipWith15"),​[A1](UnzipWith15.html "type parameter in UnzipWith15"),​[A2](UnzipWith15.html "type parameter in UnzipWith15"),​[A3](UnzipWith15.html "type parameter in UnzipWith15"),​[A4](UnzipWith15.html "type parameter in UnzipWith15"),​[A5](UnzipWith15.html "type parameter in UnzipWith15"),​[A6](UnzipWith15.html "type parameter in UnzipWith15"),​[A7](UnzipWith15.html "type parameter in UnzipWith15"),​[A8](UnzipWith15.html "type parameter in UnzipWith15"),​[A9](UnzipWith15.html "type parameter in UnzipWith15"),​[A10](UnzipWith15.html "type parameter in UnzipWith15"),​[A11](UnzipWith15.html "type parameter in UnzipWith15"),​[A12](UnzipWith15.html "type parameter in UnzipWith15"),​[A13](UnzipWith15.html "type parameter in UnzipWith15"),​[A14](UnzipWith15.html "type parameter in UnzipWith15"),​[A15](UnzipWith15.html "type parameter in UnzipWith15")>,​[NotUsed](../../NotUsed.html "class in akka")>`
		- #### out0
		
		
		
		```
		public [Outlet](../Outlet.html "class in akka.stream")<[A1](UnzipWith15.html "type parameter in UnzipWith15")> out0()
		```
		- #### out1
		
		
		
		```
		public [Outlet](../Outlet.html "class in akka.stream")<[A2](UnzipWith15.html "type parameter in UnzipWith15")> out1()
		```
		- #### out10
		
		
		
		```
		public [Outlet](../Outlet.html "class in akka.stream")<[A11](UnzipWith15.html "type parameter in UnzipWith15")> out10()
		```
		- #### out11
		
		
		
		```
		public [Outlet](../Outlet.html "class in akka.stream")<[A12](UnzipWith15.html "type parameter in UnzipWith15")> out11()
		```
		- #### out12
		
		
		
		```
		public [Outlet](../Outlet.html "class in akka.stream")<[A13](UnzipWith15.html "type parameter in UnzipWith15")> out12()
		```
		- #### out13
		
		
		
		```
		public [Outlet](../Outlet.html "class in akka.stream")<[A14](UnzipWith15.html "type parameter in UnzipWith15")> out13()
		```
		- #### out14
		
		
		
		```
		public [Outlet](../Outlet.html "class in akka.stream")<[A15](UnzipWith15.html "type parameter in UnzipWith15")> out14()
		```
		- #### out2
		
		
		
		```
		public [Outlet](../Outlet.html "class in akka.stream")<[A3](UnzipWith15.html "type parameter in UnzipWith15")> out2()
		```
		- #### out3
		
		
		
		```
		public [Outlet](../Outlet.html "class in akka.stream")<[A4](UnzipWith15.html "type parameter in UnzipWith15")> out3()
		```
		- #### out4
		
		
		
		```
		public [Outlet](../Outlet.html "class in akka.stream")<[A5](UnzipWith15.html "type parameter in UnzipWith15")> out4()
		```
		- #### out5
		
		
		
		```
		public [Outlet](../Outlet.html "class in akka.stream")<[A6](UnzipWith15.html "type parameter in UnzipWith15")> out5()
		```
		- #### out6
		
		
		
		```
		public [Outlet](../Outlet.html "class in akka.stream")<[A7](UnzipWith15.html "type parameter in UnzipWith15")> out6()
		```
		- #### out7
		
		
		
		```
		public [Outlet](../Outlet.html "class in akka.stream")<[A8](UnzipWith15.html "type parameter in UnzipWith15")> out7()
		```
		- #### out8
		
		
		
		```
		public [Outlet](../Outlet.html "class in akka.stream")<[A9](UnzipWith15.html "type parameter in UnzipWith15")> out8()
		```
		- #### out9
		
		
		
		```
		public [Outlet](../Outlet.html "class in akka.stream")<[A10](UnzipWith15.html "type parameter in UnzipWith15")> out9()
		```
		- #### shape
		
		
		
		```
		public [FanOutShape15](../FanOutShape15.html "class in akka.stream")<[In](UnzipWith15.html "type parameter in UnzipWith15"),​[A1](UnzipWith15.html "type parameter in UnzipWith15"),​[A2](UnzipWith15.html "type parameter in UnzipWith15"),​[A3](UnzipWith15.html "type parameter in UnzipWith15"),​[A4](UnzipWith15.html "type parameter in UnzipWith15"),​[A5](UnzipWith15.html "type parameter in UnzipWith15"),​[A6](UnzipWith15.html "type parameter in UnzipWith15"),​[A7](UnzipWith15.html "type parameter in UnzipWith15"),​[A8](UnzipWith15.html "type parameter in UnzipWith15"),​[A9](UnzipWith15.html "type parameter in UnzipWith15"),​[A10](UnzipWith15.html "type parameter in UnzipWith15"),​[A11](UnzipWith15.html "type parameter in UnzipWith15"),​[A12](UnzipWith15.html "type parameter in UnzipWith15"),​[A13](UnzipWith15.html "type parameter in UnzipWith15"),​[A14](UnzipWith15.html "type parameter in UnzipWith15"),​[A15](UnzipWith15.html "type parameter in UnzipWith15")> shape()
		```
		
		Description copied from interface: `[Graph](../Graph.html#shape())`
		The shape of a graph is all that is externally visible: its inlets and outlets.
		- #### toString
		
		
		
		```
		public java.lang.String toString()
		```
		
		
		Overrides:
		`toString` in class `java.lang.Object`
		- #### unzipper
		
		
		
		```
		public scala.Function1<[In](UnzipWith15.html "type parameter in UnzipWith15"),​scala.Tuple15<[A1](UnzipWith15.html "type parameter in UnzipWith15"),​[A2](UnzipWith15.html "type parameter in UnzipWith15"),​[A3](UnzipWith15.html "type parameter in UnzipWith15"),​[A4](UnzipWith15.html "type parameter in UnzipWith15"),​[A5](UnzipWith15.html "type parameter in UnzipWith15"),​[A6](UnzipWith15.html "type parameter in UnzipWith15"),​[A7](UnzipWith15.html "type parameter in UnzipWith15"),​[A8](UnzipWith15.html "type parameter in UnzipWith15"),​[A9](UnzipWith15.html "type parameter in UnzipWith15"),​[A10](UnzipWith15.html "type parameter in UnzipWith15"),​[A11](UnzipWith15.html "type parameter in UnzipWith15"),​[A12](UnzipWith15.html "type parameter in UnzipWith15"),​[A13](UnzipWith15.html "type parameter in UnzipWith15"),​[A14](UnzipWith15.html "type parameter in UnzipWith15"),​[A15](UnzipWith15.html "type parameter in UnzipWith15")>> unzipper()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/NotUsed.html
- https://doc.akka.io/japi/akka/current/akka/stream/Attributes.html
- https://doc.akka.io/japi/akka/current/akka/stream/FanOutShape15.html
- https://doc.akka.io/japi/akka/current/akka/stream/Graph.GraphMapMatVal.html
- https://doc.akka.io/japi/akka/current/akka/stream/Graph.html
- https://doc.akka.io/japi/akka/current/akka/stream/Inlet.html
- https://doc.akka.io/japi/akka/current/akka/stream/Outlet.html
- https://doc.akka.io/japi/akka/current/akka/stream/Shape.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/UnzipWith15.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/stream/stage/GraphStage.html
- https://doc.akka.io/japi/akka/current/akka/stream/stage/GraphStageLogic.html
- https://doc.akka.io/japi/akka/current/akka/stream/stage/GraphStageWithMaterializedValue.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/UnzipWith15.html](https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/UnzipWith15.html)*