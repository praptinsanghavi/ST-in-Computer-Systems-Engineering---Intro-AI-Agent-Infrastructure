---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:07:07Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/stream/scaladsl/UnzipWith3.html
title: UnzipWith3
---

# UnzipWith3

## Content

Package [akka.stream.scaladsl](package-summary.html)
## Class UnzipWith3\<In,​A1,​A2,​A3\>

- java.lang.Object
- - [akka.stream.stage.GraphStageWithMaterializedValue](../stage/GraphStageWithMaterializedValue.html "class in akka.stream.stage")\<S,​[NotUsed](../../NotUsed.html "class in akka")\>
	- - [akka.stream.stage.GraphStage](../stage/GraphStage.html "class in akka.stream.stage")\<[FanOutShape3](../FanOutShape3.html "class in akka.stream")\<In,​A1,​A2,​A3\>\>
		- - akka.stream.scaladsl.UnzipWith3\<In,​A1,​A2,​A3\>

- All Implemented Interfaces:
`[Graph](../Graph.html "interface in akka.stream")<[FanOutShape3](../FanOutShape3.html "class in akka.stream")<In,​A1,​A2,​A3>,​[NotUsed](../../NotUsed.html "class in akka")>`

---

```
public class UnzipWith3<In,​A1,​A2,​A3>
extends [GraphStage](../stage/GraphStage.html "class in akka.stream.stage")<[FanOutShape3](../FanOutShape3.html "class in akka.stream")<In,​A1,​A2,​A3>>
```

\`UnzipWith\` specialized for 3 outputs

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface akka.stream.[Graph](../Graph.html "interface in akka.stream")
		
		
		`[Graph.GraphMapMatVal](../Graph.GraphMapMatVal.html "class in akka.stream")<[S](../Graph.GraphMapMatVal.html "type parameter in Graph.GraphMapMatVal") extends [Shape](../Shape.html "class in akka.stream"),​[M](../Graph.GraphMapMatVal.html "type parameter in Graph.GraphMapMatVal")>`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[UnzipWith3](#%3Cinit%3E(scala.Function1))​(scala.Function1<[In](UnzipWith3.html "type parameter in UnzipWith3"),​scala.Tuple3<[A1](UnzipWith3.html "type parameter in UnzipWith3"),​[A2](UnzipWith3.html "type parameter in UnzipWith3"),​[A3](UnzipWith3.html "type parameter in UnzipWith3")>> unzipper)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[GraphStageLogic](../stage/GraphStageLogic.html "class in akka.stream.stage")` | `[createLogic](#createLogic(akka.stream.Attributes))​([Attributes](../Attributes.html "class in akka.stream") inheritedAttributes)` |  |
	| `[Inlet](../Inlet.html "class in akka.stream")<[In](UnzipWith3.html "type parameter in UnzipWith3")>` | `[in](#in())()` |  |
	| `[Attributes](../Attributes.html "class in akka.stream")` | `[initialAttributes](#initialAttributes())()` |  |
	| `[Outlet](../Outlet.html "class in akka.stream")<[A1](UnzipWith3.html "type parameter in UnzipWith3")>` | `[out0](#out0())()` |  |
	| `[Outlet](../Outlet.html "class in akka.stream")<[A2](UnzipWith3.html "type parameter in UnzipWith3")>` | `[out1](#out1())()` |  |
	| `[Outlet](../Outlet.html "class in akka.stream")<[A3](UnzipWith3.html "type parameter in UnzipWith3")>` | `[out2](#out2())()` |  |
	| `[FanOutShape3](../FanOutShape3.html "class in akka.stream")<[In](UnzipWith3.html "type parameter in UnzipWith3"),​[A1](UnzipWith3.html "type parameter in UnzipWith3"),​[A2](UnzipWith3.html "type parameter in UnzipWith3"),​[A3](UnzipWith3.html "type parameter in UnzipWith3")>` | `[shape](#shape())()` | The shape of a graph is all that is externally visible: its inlets and outlets. |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Function1<[In](UnzipWith3.html "type parameter in UnzipWith3"),​scala.Tuple3<[A1](UnzipWith3.html "type parameter in UnzipWith3"),​[A2](UnzipWith3.html "type parameter in UnzipWith3"),​[A3](UnzipWith3.html "type parameter in UnzipWith3")>>` | `[unzipper](#unzipper())()` |  |
	
	
		- ### Methods inherited from class akka.stream.stage.[GraphStage](../stage/GraphStage.html "class in akka.stream.stage")
		
		
		`[createLogicAndMaterializedValue](../stage/GraphStage.html#createLogicAndMaterializedValue(akka.stream.Attributes))`
		- ### Methods inherited from class akka.stream.stage.[GraphStageWithMaterializedValue](../stage/GraphStageWithMaterializedValue.html "class in akka.stream.stage")
		
		
		`[withAttributes](../stage/GraphStageWithMaterializedValue.html#withAttributes(akka.stream.Attributes))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface akka.stream.[Graph](../Graph.html "interface in akka.stream")
		
		
		`[addAttributes](../Graph.html#addAttributes(akka.stream.Attributes)), [async](../Graph.html#async()), [async](../Graph.html#async(java.lang.String)), [async](../Graph.html#async(java.lang.String,int)), [getAttributes](../Graph.html#getAttributes()), [named](../Graph.html#named(java.lang.String))`

- - ### Constructor Detail
	
	
	
		- #### UnzipWith3
		
		
		
		```
		public UnzipWith3​(scala.Function1<[In](UnzipWith3.html "type parameter in UnzipWith3"),​scala.Tuple3<[A1](UnzipWith3.html "type parameter in UnzipWith3"),​[A2](UnzipWith3.html "type parameter in UnzipWith3"),​[A3](UnzipWith3.html "type parameter in UnzipWith3")>> unzipper)
		```

	- ### Method Detail
	
	
	
		- #### createLogic
		
		
		
		```
		public [GraphStageLogic](../stage/GraphStageLogic.html "class in akka.stream.stage") createLogic​([Attributes](../Attributes.html "class in akka.stream") inheritedAttributes)
		```
		
		
		Specified by:
		`[createLogic](../stage/GraphStage.html#createLogic(akka.stream.Attributes))` in class `[GraphStage](../stage/GraphStage.html "class in akka.stream.stage")<[FanOutShape3](../FanOutShape3.html "class in akka.stream")<[In](UnzipWith3.html "type parameter in UnzipWith3"),​[A1](UnzipWith3.html "type parameter in UnzipWith3"),​[A2](UnzipWith3.html "type parameter in UnzipWith3"),​[A3](UnzipWith3.html "type parameter in UnzipWith3")>>`
		- #### in
		
		
		
		```
		public [Inlet](../Inlet.html "class in akka.stream")<[In](UnzipWith3.html "type parameter in UnzipWith3")> in()
		```
		- #### initialAttributes
		
		
		
		```
		public [Attributes](../Attributes.html "class in akka.stream") initialAttributes()
		```
		
		
		Overrides:
		`[initialAttributes](../stage/GraphStageWithMaterializedValue.html#initialAttributes())` in class `[GraphStageWithMaterializedValue](../stage/GraphStageWithMaterializedValue.html "class in akka.stream.stage")<[FanOutShape3](../FanOutShape3.html "class in akka.stream")<[In](UnzipWith3.html "type parameter in UnzipWith3"),​[A1](UnzipWith3.html "type parameter in UnzipWith3"),​[A2](UnzipWith3.html "type parameter in UnzipWith3"),​[A3](UnzipWith3.html "type parameter in UnzipWith3")>,​[NotUsed](../../NotUsed.html "class in akka")>`
		- #### out0
		
		
		
		```
		public [Outlet](../Outlet.html "class in akka.stream")<[A1](UnzipWith3.html "type parameter in UnzipWith3")> out0()
		```
		- #### out1
		
		
		
		```
		public [Outlet](../Outlet.html "class in akka.stream")<[A2](UnzipWith3.html "type parameter in UnzipWith3")> out1()
		```
		- #### out2
		
		
		
		```
		public [Outlet](../Outlet.html "class in akka.stream")<[A3](UnzipWith3.html "type parameter in UnzipWith3")> out2()
		```
		- #### shape
		
		
		
		```
		public [FanOutShape3](../FanOutShape3.html "class in akka.stream")<[In](UnzipWith3.html "type parameter in UnzipWith3"),​[A1](UnzipWith3.html "type parameter in UnzipWith3"),​[A2](UnzipWith3.html "type parameter in UnzipWith3"),​[A3](UnzipWith3.html "type parameter in UnzipWith3")> shape()
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
		public scala.Function1<[In](UnzipWith3.html "type parameter in UnzipWith3"),​scala.Tuple3<[A1](UnzipWith3.html "type parameter in UnzipWith3"),​[A2](UnzipWith3.html "type parameter in UnzipWith3"),​[A3](UnzipWith3.html "type parameter in UnzipWith3")>> unzipper()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/NotUsed.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/Attributes.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/FanOutShape3.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/Graph.GraphMapMatVal.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/Graph.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/Inlet.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/Outlet.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/Shape.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/scaladsl/UnzipWith3.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/scaladsl/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/stage/GraphStage.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/stage/GraphStageLogic.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/stage/GraphStageWithMaterializedValue.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/stream/scaladsl/UnzipWith3.html](https://doc.akka.io/japi/akka-core/2.10/akka/stream/scaladsl/UnzipWith3.html)*