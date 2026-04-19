---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:44:11Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/ZipWith7.html
title: ZipWith7
---

# ZipWith7

## Content

Package [akka.stream.scaladsl](package-summary.html)
## Class ZipWith7\<A1,​A2,​A3,​A4,​A5,​A6,​A7,​O\>

- java.lang.Object
- - [akka.stream.stage.GraphStageWithMaterializedValue](../stage/GraphStageWithMaterializedValue.html "class in akka.stream.stage")\<S,​[NotUsed](../../NotUsed.html "class in akka")\>
	- - [akka.stream.stage.GraphStage](../stage/GraphStage.html "class in akka.stream.stage")\<[FanInShape7](../FanInShape7.html "class in akka.stream")\<A1,​A2,​A3,​A4,​A5,​A6,​A7,​O\>\>
		- - akka.stream.scaladsl.ZipWith7\<A1,​A2,​A3,​A4,​A5,​A6,​A7,​O\>

- All Implemented Interfaces:
`[Graph](../Graph.html "interface in akka.stream")<[FanInShape7](../FanInShape7.html "class in akka.stream")<A1,​A2,​A3,​A4,​A5,​A6,​A7,​O>,​[NotUsed](../../NotUsed.html "class in akka")>`

---

```
public class ZipWith7<A1,​A2,​A3,​A4,​A5,​A6,​A7,​O>
extends [GraphStage](../stage/GraphStage.html "class in akka.stream.stage")<[FanInShape7](../FanInShape7.html "class in akka.stream")<A1,​A2,​A3,​A4,​A5,​A6,​A7,​O>>
```

\`ZipWith\` specialized for 7 inputs

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface akka.stream.[Graph](../Graph.html "interface in akka.stream")
		
		
		`[Graph.GraphMapMatVal](../Graph.GraphMapMatVal.html "class in akka.stream")<[S](../Graph.GraphMapMatVal.html "type parameter in Graph.GraphMapMatVal") extends [Shape](../Shape.html "class in akka.stream"),​[M](../Graph.GraphMapMatVal.html "type parameter in Graph.GraphMapMatVal")>`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ZipWith7](#%3Cinit%3E(scala.Function7))​(scala.Function7<[A1](ZipWith7.html "type parameter in ZipWith7"),​[A2](ZipWith7.html "type parameter in ZipWith7"),​[A3](ZipWith7.html "type parameter in ZipWith7"),​[A4](ZipWith7.html "type parameter in ZipWith7"),​[A5](ZipWith7.html "type parameter in ZipWith7"),​[A6](ZipWith7.html "type parameter in ZipWith7"),​[A7](ZipWith7.html "type parameter in ZipWith7"),​[O](ZipWith7.html "type parameter in ZipWith7")> zipper)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[GraphStageLogic](../stage/GraphStageLogic.html "class in akka.stream.stage")` | `[createLogic](#createLogic(akka.stream.Attributes))​([Attributes](../Attributes.html "class in akka.stream") inheritedAttributes)` |  |
	| `[Inlet](../Inlet.html "class in akka.stream")<[A1](ZipWith7.html "type parameter in ZipWith7")>` | `[in0](#in0())()` |  |
	| `[Inlet](../Inlet.html "class in akka.stream")<[A2](ZipWith7.html "type parameter in ZipWith7")>` | `[in1](#in1())()` |  |
	| `[Inlet](../Inlet.html "class in akka.stream")<[A3](ZipWith7.html "type parameter in ZipWith7")>` | `[in2](#in2())()` |  |
	| `[Inlet](../Inlet.html "class in akka.stream")<[A4](ZipWith7.html "type parameter in ZipWith7")>` | `[in3](#in3())()` |  |
	| `[Inlet](../Inlet.html "class in akka.stream")<[A5](ZipWith7.html "type parameter in ZipWith7")>` | `[in4](#in4())()` |  |
	| `[Inlet](../Inlet.html "class in akka.stream")<[A6](ZipWith7.html "type parameter in ZipWith7")>` | `[in5](#in5())()` |  |
	| `[Inlet](../Inlet.html "class in akka.stream")<[A7](ZipWith7.html "type parameter in ZipWith7")>` | `[in6](#in6())()` |  |
	| `[Attributes](../Attributes.html "class in akka.stream")` | `[initialAttributes](#initialAttributes())()` |  |
	| `[Outlet](../Outlet.html "class in akka.stream")<[O](ZipWith7.html "type parameter in ZipWith7")>` | `[out](#out())()` |  |
	| `[FanInShape7](../FanInShape7.html "class in akka.stream")<[A1](ZipWith7.html "type parameter in ZipWith7"),​[A2](ZipWith7.html "type parameter in ZipWith7"),​[A3](ZipWith7.html "type parameter in ZipWith7"),​[A4](ZipWith7.html "type parameter in ZipWith7"),​[A5](ZipWith7.html "type parameter in ZipWith7"),​[A6](ZipWith7.html "type parameter in ZipWith7"),​[A7](ZipWith7.html "type parameter in ZipWith7"),​[O](ZipWith7.html "type parameter in ZipWith7")>` | `[shape](#shape())()` | The shape of a graph is all that is externally visible: its inlets and outlets. |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Function7<[A1](ZipWith7.html "type parameter in ZipWith7"),​[A2](ZipWith7.html "type parameter in ZipWith7"),​[A3](ZipWith7.html "type parameter in ZipWith7"),​[A4](ZipWith7.html "type parameter in ZipWith7"),​[A5](ZipWith7.html "type parameter in ZipWith7"),​[A6](ZipWith7.html "type parameter in ZipWith7"),​[A7](ZipWith7.html "type parameter in ZipWith7"),​[O](ZipWith7.html "type parameter in ZipWith7")>` | `[zipper](#zipper())()` |  |
	
	
		- ### Methods inherited from class akka.stream.stage.[GraphStage](../stage/GraphStage.html "class in akka.stream.stage")
		
		
		`[createLogicAndMaterializedValue](../stage/GraphStage.html#createLogicAndMaterializedValue(akka.stream.Attributes))`
		- ### Methods inherited from class akka.stream.stage.[GraphStageWithMaterializedValue](../stage/GraphStageWithMaterializedValue.html "class in akka.stream.stage")
		
		
		`[withAttributes](../stage/GraphStageWithMaterializedValue.html#withAttributes(akka.stream.Attributes))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface akka.stream.[Graph](../Graph.html "interface in akka.stream")
		
		
		`[addAttributes](../Graph.html#addAttributes(akka.stream.Attributes)), [async](../Graph.html#async()), [async](../Graph.html#async(java.lang.String)), [async](../Graph.html#async(java.lang.String,int)), [getAttributes](../Graph.html#getAttributes()), [named](../Graph.html#named(java.lang.String))`

- - ### Constructor Detail
	
	
	
		- #### ZipWith7
		
		
		
		```
		public ZipWith7​(scala.Function7<[A1](ZipWith7.html "type parameter in ZipWith7"),​[A2](ZipWith7.html "type parameter in ZipWith7"),​[A3](ZipWith7.html "type parameter in ZipWith7"),​[A4](ZipWith7.html "type parameter in ZipWith7"),​[A5](ZipWith7.html "type parameter in ZipWith7"),​[A6](ZipWith7.html "type parameter in ZipWith7"),​[A7](ZipWith7.html "type parameter in ZipWith7"),​[O](ZipWith7.html "type parameter in ZipWith7")> zipper)
		```

	- ### Method Detail
	
	
	
		- #### createLogic
		
		
		
		```
		public [GraphStageLogic](../stage/GraphStageLogic.html "class in akka.stream.stage") createLogic​([Attributes](../Attributes.html "class in akka.stream") inheritedAttributes)
		```
		
		
		Specified by:
		`[createLogic](../stage/GraphStage.html#createLogic(akka.stream.Attributes))` in class `[GraphStage](../stage/GraphStage.html "class in akka.stream.stage")<[FanInShape7](../FanInShape7.html "class in akka.stream")<[A1](ZipWith7.html "type parameter in ZipWith7"),​[A2](ZipWith7.html "type parameter in ZipWith7"),​[A3](ZipWith7.html "type parameter in ZipWith7"),​[A4](ZipWith7.html "type parameter in ZipWith7"),​[A5](ZipWith7.html "type parameter in ZipWith7"),​[A6](ZipWith7.html "type parameter in ZipWith7"),​[A7](ZipWith7.html "type parameter in ZipWith7"),​[O](ZipWith7.html "type parameter in ZipWith7")>>`
		- #### in0
		
		
		
		```
		public [Inlet](../Inlet.html "class in akka.stream")<[A1](ZipWith7.html "type parameter in ZipWith7")> in0()
		```
		- #### in1
		
		
		
		```
		public [Inlet](../Inlet.html "class in akka.stream")<[A2](ZipWith7.html "type parameter in ZipWith7")> in1()
		```
		- #### in2
		
		
		
		```
		public [Inlet](../Inlet.html "class in akka.stream")<[A3](ZipWith7.html "type parameter in ZipWith7")> in2()
		```
		- #### in3
		
		
		
		```
		public [Inlet](../Inlet.html "class in akka.stream")<[A4](ZipWith7.html "type parameter in ZipWith7")> in3()
		```
		- #### in4
		
		
		
		```
		public [Inlet](../Inlet.html "class in akka.stream")<[A5](ZipWith7.html "type parameter in ZipWith7")> in4()
		```
		- #### in5
		
		
		
		```
		public [Inlet](../Inlet.html "class in akka.stream")<[A6](ZipWith7.html "type parameter in ZipWith7")> in5()
		```
		- #### in6
		
		
		
		```
		public [Inlet](../Inlet.html "class in akka.stream")<[A7](ZipWith7.html "type parameter in ZipWith7")> in6()
		```
		- #### initialAttributes
		
		
		
		```
		public [Attributes](../Attributes.html "class in akka.stream") initialAttributes()
		```
		
		
		Overrides:
		`[initialAttributes](../stage/GraphStageWithMaterializedValue.html#initialAttributes())` in class `[GraphStageWithMaterializedValue](../stage/GraphStageWithMaterializedValue.html "class in akka.stream.stage")<[FanInShape7](../FanInShape7.html "class in akka.stream")<[A1](ZipWith7.html "type parameter in ZipWith7"),​[A2](ZipWith7.html "type parameter in ZipWith7"),​[A3](ZipWith7.html "type parameter in ZipWith7"),​[A4](ZipWith7.html "type parameter in ZipWith7"),​[A5](ZipWith7.html "type parameter in ZipWith7"),​[A6](ZipWith7.html "type parameter in ZipWith7"),​[A7](ZipWith7.html "type parameter in ZipWith7"),​[O](ZipWith7.html "type parameter in ZipWith7")>,​[NotUsed](../../NotUsed.html "class in akka")>`
		- #### out
		
		
		
		```
		public [Outlet](../Outlet.html "class in akka.stream")<[O](ZipWith7.html "type parameter in ZipWith7")> out()
		```
		- #### shape
		
		
		
		```
		public [FanInShape7](../FanInShape7.html "class in akka.stream")<[A1](ZipWith7.html "type parameter in ZipWith7"),​[A2](ZipWith7.html "type parameter in ZipWith7"),​[A3](ZipWith7.html "type parameter in ZipWith7"),​[A4](ZipWith7.html "type parameter in ZipWith7"),​[A5](ZipWith7.html "type parameter in ZipWith7"),​[A6](ZipWith7.html "type parameter in ZipWith7"),​[A7](ZipWith7.html "type parameter in ZipWith7"),​[O](ZipWith7.html "type parameter in ZipWith7")> shape()
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
		public scala.Function7<[A1](ZipWith7.html "type parameter in ZipWith7"),​[A2](ZipWith7.html "type parameter in ZipWith7"),​[A3](ZipWith7.html "type parameter in ZipWith7"),​[A4](ZipWith7.html "type parameter in ZipWith7"),​[A5](ZipWith7.html "type parameter in ZipWith7"),​[A6](ZipWith7.html "type parameter in ZipWith7"),​[A7](ZipWith7.html "type parameter in ZipWith7"),​[O](ZipWith7.html "type parameter in ZipWith7")> zipper()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/NotUsed.html
- https://doc.akka.io/japi/akka/current/akka/stream/Attributes.html
- https://doc.akka.io/japi/akka/current/akka/stream/FanInShape7.html
- https://doc.akka.io/japi/akka/current/akka/stream/Graph.GraphMapMatVal.html
- https://doc.akka.io/japi/akka/current/akka/stream/Graph.html
- https://doc.akka.io/japi/akka/current/akka/stream/Inlet.html
- https://doc.akka.io/japi/akka/current/akka/stream/Outlet.html
- https://doc.akka.io/japi/akka/current/akka/stream/Shape.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/ZipWith7.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/stream/stage/GraphStage.html
- https://doc.akka.io/japi/akka/current/akka/stream/stage/GraphStageLogic.html
- https://doc.akka.io/japi/akka/current/akka/stream/stage/GraphStageWithMaterializedValue.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/ZipWith7.html](https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/ZipWith7.html)*