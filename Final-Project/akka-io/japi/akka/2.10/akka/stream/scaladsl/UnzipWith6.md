---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:48:09Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/2.10/akka/stream/scaladsl/UnzipWith6.html
title: UnzipWith6
---

# UnzipWith6

## Content

Package [akka.stream.scaladsl](package-summary.html)
## Class UnzipWith6\<In,​A1,​A2,​A3,​A4,​A5,​A6\>

- java.lang.Object
- - [akka.stream.stage.GraphStageWithMaterializedValue](../stage/GraphStageWithMaterializedValue.html "class in akka.stream.stage")\<S,​[NotUsed](../../NotUsed.html "class in akka")\>
	- - [akka.stream.stage.GraphStage](../stage/GraphStage.html "class in akka.stream.stage")\<[FanOutShape6](../FanOutShape6.html "class in akka.stream")\<In,​A1,​A2,​A3,​A4,​A5,​A6\>\>
		- - akka.stream.scaladsl.UnzipWith6\<In,​A1,​A2,​A3,​A4,​A5,​A6\>

- All Implemented Interfaces:
`[Graph](../Graph.html "interface in akka.stream")<[FanOutShape6](../FanOutShape6.html "class in akka.stream")<In,​A1,​A2,​A3,​A4,​A5,​A6>,​[NotUsed](../../NotUsed.html "class in akka")>`

---

```
public class UnzipWith6<In,​A1,​A2,​A3,​A4,​A5,​A6>
extends [GraphStage](../stage/GraphStage.html "class in akka.stream.stage")<[FanOutShape6](../FanOutShape6.html "class in akka.stream")<In,​A1,​A2,​A3,​A4,​A5,​A6>>
```

\`UnzipWith\` specialized for 6 outputs

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface akka.stream.[Graph](../Graph.html "interface in akka.stream")
		
		
		`[Graph.GraphMapMatVal](../Graph.GraphMapMatVal.html "class in akka.stream")<[S](../Graph.GraphMapMatVal.html "type parameter in Graph.GraphMapMatVal") extends [Shape](../Shape.html "class in akka.stream"),​[M](../Graph.GraphMapMatVal.html "type parameter in Graph.GraphMapMatVal")>`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[UnzipWith6](#%3Cinit%3E(scala.Function1))​(scala.Function1<[In](UnzipWith6.html "type parameter in UnzipWith6"),​scala.Tuple6<[A1](UnzipWith6.html "type parameter in UnzipWith6"),​[A2](UnzipWith6.html "type parameter in UnzipWith6"),​[A3](UnzipWith6.html "type parameter in UnzipWith6"),​[A4](UnzipWith6.html "type parameter in UnzipWith6"),​[A5](UnzipWith6.html "type parameter in UnzipWith6"),​[A6](UnzipWith6.html "type parameter in UnzipWith6")>> unzipper)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[GraphStageLogic](../stage/GraphStageLogic.html "class in akka.stream.stage")` | `[createLogic](#createLogic(akka.stream.Attributes))​([Attributes](../Attributes.html "class in akka.stream") inheritedAttributes)` |  |
	| `[Inlet](../Inlet.html "class in akka.stream")<[In](UnzipWith6.html "type parameter in UnzipWith6")>` | `[in](#in())()` |  |
	| `[Attributes](../Attributes.html "class in akka.stream")` | `[initialAttributes](#initialAttributes())()` |  |
	| `[Outlet](../Outlet.html "class in akka.stream")<[A1](UnzipWith6.html "type parameter in UnzipWith6")>` | `[out0](#out0())()` |  |
	| `[Outlet](../Outlet.html "class in akka.stream")<[A2](UnzipWith6.html "type parameter in UnzipWith6")>` | `[out1](#out1())()` |  |
	| `[Outlet](../Outlet.html "class in akka.stream")<[A3](UnzipWith6.html "type parameter in UnzipWith6")>` | `[out2](#out2())()` |  |
	| `[Outlet](../Outlet.html "class in akka.stream")<[A4](UnzipWith6.html "type parameter in UnzipWith6")>` | `[out3](#out3())()` |  |
	| `[Outlet](../Outlet.html "class in akka.stream")<[A5](UnzipWith6.html "type parameter in UnzipWith6")>` | `[out4](#out4())()` |  |
	| `[Outlet](../Outlet.html "class in akka.stream")<[A6](UnzipWith6.html "type parameter in UnzipWith6")>` | `[out5](#out5())()` |  |
	| `[FanOutShape6](../FanOutShape6.html "class in akka.stream")<[In](UnzipWith6.html "type parameter in UnzipWith6"),​[A1](UnzipWith6.html "type parameter in UnzipWith6"),​[A2](UnzipWith6.html "type parameter in UnzipWith6"),​[A3](UnzipWith6.html "type parameter in UnzipWith6"),​[A4](UnzipWith6.html "type parameter in UnzipWith6"),​[A5](UnzipWith6.html "type parameter in UnzipWith6"),​[A6](UnzipWith6.html "type parameter in UnzipWith6")>` | `[shape](#shape())()` | The shape of a graph is all that is externally visible: its inlets and outlets. |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Function1<[In](UnzipWith6.html "type parameter in UnzipWith6"),​scala.Tuple6<[A1](UnzipWith6.html "type parameter in UnzipWith6"),​[A2](UnzipWith6.html "type parameter in UnzipWith6"),​[A3](UnzipWith6.html "type parameter in UnzipWith6"),​[A4](UnzipWith6.html "type parameter in UnzipWith6"),​[A5](UnzipWith6.html "type parameter in UnzipWith6"),​[A6](UnzipWith6.html "type parameter in UnzipWith6")>>` | `[unzipper](#unzipper())()` |  |
	
	
		- ### Methods inherited from class akka.stream.stage.[GraphStage](../stage/GraphStage.html "class in akka.stream.stage")
		
		
		`[createLogicAndMaterializedValue](../stage/GraphStage.html#createLogicAndMaterializedValue(akka.stream.Attributes))`
		- ### Methods inherited from class akka.stream.stage.[GraphStageWithMaterializedValue](../stage/GraphStageWithMaterializedValue.html "class in akka.stream.stage")
		
		
		`[withAttributes](../stage/GraphStageWithMaterializedValue.html#withAttributes(akka.stream.Attributes))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface akka.stream.[Graph](../Graph.html "interface in akka.stream")
		
		
		`[addAttributes](../Graph.html#addAttributes(akka.stream.Attributes)), [async](../Graph.html#async()), [async](../Graph.html#async(java.lang.String)), [async](../Graph.html#async(java.lang.String,int)), [getAttributes](../Graph.html#getAttributes()), [named](../Graph.html#named(java.lang.String))`

- - ### Constructor Detail
	
	
	
		- #### UnzipWith6
		
		
		
		```
		public UnzipWith6​(scala.Function1<[In](UnzipWith6.html "type parameter in UnzipWith6"),​scala.Tuple6<[A1](UnzipWith6.html "type parameter in UnzipWith6"),​[A2](UnzipWith6.html "type parameter in UnzipWith6"),​[A3](UnzipWith6.html "type parameter in UnzipWith6"),​[A4](UnzipWith6.html "type parameter in UnzipWith6"),​[A5](UnzipWith6.html "type parameter in UnzipWith6"),​[A6](UnzipWith6.html "type parameter in UnzipWith6")>> unzipper)
		```

	- ### Method Detail
	
	
	
		- #### createLogic
		
		
		
		```
		public [GraphStageLogic](../stage/GraphStageLogic.html "class in akka.stream.stage") createLogic​([Attributes](../Attributes.html "class in akka.stream") inheritedAttributes)
		```
		
		
		Specified by:
		`[createLogic](../stage/GraphStage.html#createLogic(akka.stream.Attributes))` in class `[GraphStage](../stage/GraphStage.html "class in akka.stream.stage")<[FanOutShape6](../FanOutShape6.html "class in akka.stream")<[In](UnzipWith6.html "type parameter in UnzipWith6"),​[A1](UnzipWith6.html "type parameter in UnzipWith6"),​[A2](UnzipWith6.html "type parameter in UnzipWith6"),​[A3](UnzipWith6.html "type parameter in UnzipWith6"),​[A4](UnzipWith6.html "type parameter in UnzipWith6"),​[A5](UnzipWith6.html "type parameter in UnzipWith6"),​[A6](UnzipWith6.html "type parameter in UnzipWith6")>>`
		- #### in
		
		
		
		```
		public [Inlet](../Inlet.html "class in akka.stream")<[In](UnzipWith6.html "type parameter in UnzipWith6")> in()
		```
		- #### initialAttributes
		
		
		
		```
		public [Attributes](../Attributes.html "class in akka.stream") initialAttributes()
		```
		
		
		Overrides:
		`[initialAttributes](../stage/GraphStageWithMaterializedValue.html#initialAttributes())` in class `[GraphStageWithMaterializedValue](../stage/GraphStageWithMaterializedValue.html "class in akka.stream.stage")<[FanOutShape6](../FanOutShape6.html "class in akka.stream")<[In](UnzipWith6.html "type parameter in UnzipWith6"),​[A1](UnzipWith6.html "type parameter in UnzipWith6"),​[A2](UnzipWith6.html "type parameter in UnzipWith6"),​[A3](UnzipWith6.html "type parameter in UnzipWith6"),​[A4](UnzipWith6.html "type parameter in UnzipWith6"),​[A5](UnzipWith6.html "type parameter in UnzipWith6"),​[A6](UnzipWith6.html "type parameter in UnzipWith6")>,​[NotUsed](../../NotUsed.html "class in akka")>`
		- #### out0
		
		
		
		```
		public [Outlet](../Outlet.html "class in akka.stream")<[A1](UnzipWith6.html "type parameter in UnzipWith6")> out0()
		```
		- #### out1
		
		
		
		```
		public [Outlet](../Outlet.html "class in akka.stream")<[A2](UnzipWith6.html "type parameter in UnzipWith6")> out1()
		```
		- #### out2
		
		
		
		```
		public [Outlet](../Outlet.html "class in akka.stream")<[A3](UnzipWith6.html "type parameter in UnzipWith6")> out2()
		```
		- #### out3
		
		
		
		```
		public [Outlet](../Outlet.html "class in akka.stream")<[A4](UnzipWith6.html "type parameter in UnzipWith6")> out3()
		```
		- #### out4
		
		
		
		```
		public [Outlet](../Outlet.html "class in akka.stream")<[A5](UnzipWith6.html "type parameter in UnzipWith6")> out4()
		```
		- #### out5
		
		
		
		```
		public [Outlet](../Outlet.html "class in akka.stream")<[A6](UnzipWith6.html "type parameter in UnzipWith6")> out5()
		```
		- #### shape
		
		
		
		```
		public [FanOutShape6](../FanOutShape6.html "class in akka.stream")<[In](UnzipWith6.html "type parameter in UnzipWith6"),​[A1](UnzipWith6.html "type parameter in UnzipWith6"),​[A2](UnzipWith6.html "type parameter in UnzipWith6"),​[A3](UnzipWith6.html "type parameter in UnzipWith6"),​[A4](UnzipWith6.html "type parameter in UnzipWith6"),​[A5](UnzipWith6.html "type parameter in UnzipWith6"),​[A6](UnzipWith6.html "type parameter in UnzipWith6")> shape()
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
		public scala.Function1<[In](UnzipWith6.html "type parameter in UnzipWith6"),​scala.Tuple6<[A1](UnzipWith6.html "type parameter in UnzipWith6"),​[A2](UnzipWith6.html "type parameter in UnzipWith6"),​[A3](UnzipWith6.html "type parameter in UnzipWith6"),​[A4](UnzipWith6.html "type parameter in UnzipWith6"),​[A5](UnzipWith6.html "type parameter in UnzipWith6"),​[A6](UnzipWith6.html "type parameter in UnzipWith6")>> unzipper()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/2.10/akka/NotUsed.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/Attributes.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/FanOutShape6.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/Graph.GraphMapMatVal.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/Graph.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/Inlet.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/Outlet.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/Shape.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/scaladsl/UnzipWith6.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/scaladsl/package-summary.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/stage/GraphStage.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/stage/GraphStageLogic.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/stage/GraphStageWithMaterializedValue.html

---
*Source: [https://doc.akka.io/japi/akka/2.10/akka/stream/scaladsl/UnzipWith6.html](https://doc.akka.io/japi/akka/2.10/akka/stream/scaladsl/UnzipWith6.html)*