---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:07:33Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/stream/scaladsl/ZipLatestWith7.html
title: ZipLatestWith7
---

# ZipLatestWith7

## Content

Package [akka.stream.scaladsl](package-summary.html)
## Class ZipLatestWith7\<A1,​A2,​A3,​A4,​A5,​A6,​A7,​O\>

- java.lang.Object
- - [akka.stream.stage.GraphStageWithMaterializedValue](../stage/GraphStageWithMaterializedValue.html "class in akka.stream.stage")\<S,​[NotUsed](../../NotUsed.html "class in akka")\>
	- - [akka.stream.stage.GraphStage](../stage/GraphStage.html "class in akka.stream.stage")\<[FanInShape7](../FanInShape7.html "class in akka.stream")\<A1,​A2,​A3,​A4,​A5,​A6,​A7,​O\>\>
		- - akka.stream.scaladsl.ZipLatestWith7\<A1,​A2,​A3,​A4,​A5,​A6,​A7,​O\>

- All Implemented Interfaces:
`[Graph](../Graph.html "interface in akka.stream")<[FanInShape7](../FanInShape7.html "class in akka.stream")<A1,​A2,​A3,​A4,​A5,​A6,​A7,​O>,​[NotUsed](../../NotUsed.html "class in akka")>`

---

```
public class ZipLatestWith7<A1,​A2,​A3,​A4,​A5,​A6,​A7,​O>
extends [GraphStage](../stage/GraphStage.html "class in akka.stream.stage")<[FanInShape7](../FanInShape7.html "class in akka.stream")<A1,​A2,​A3,​A4,​A5,​A6,​A7,​O>>
```

\`ZipLatestWith\` specialized for 7 inputs

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface akka.stream.[Graph](../Graph.html "interface in akka.stream")
		
		
		`[Graph.GraphMapMatVal](../Graph.GraphMapMatVal.html "class in akka.stream")<[S](../Graph.GraphMapMatVal.html "type parameter in Graph.GraphMapMatVal") extends [Shape](../Shape.html "class in akka.stream"),​[M](../Graph.GraphMapMatVal.html "type parameter in Graph.GraphMapMatVal")>`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ZipLatestWith7](#%3Cinit%3E(scala.Function7))​(scala.Function7<[A1](ZipLatestWith7.html "type parameter in ZipLatestWith7"),​[A2](ZipLatestWith7.html "type parameter in ZipLatestWith7"),​[A3](ZipLatestWith7.html "type parameter in ZipLatestWith7"),​[A4](ZipLatestWith7.html "type parameter in ZipLatestWith7"),​[A5](ZipLatestWith7.html "type parameter in ZipLatestWith7"),​[A6](ZipLatestWith7.html "type parameter in ZipLatestWith7"),​[A7](ZipLatestWith7.html "type parameter in ZipLatestWith7"),​[O](ZipLatestWith7.html "type parameter in ZipLatestWith7")> zipper)` |  |
	| `[ZipLatestWith7](#%3Cinit%3E(scala.Function7,boolean))​(scala.Function7<[A1](ZipLatestWith7.html "type parameter in ZipLatestWith7"),​[A2](ZipLatestWith7.html "type parameter in ZipLatestWith7"),​[A3](ZipLatestWith7.html "type parameter in ZipLatestWith7"),​[A4](ZipLatestWith7.html "type parameter in ZipLatestWith7"),​[A5](ZipLatestWith7.html "type parameter in ZipLatestWith7"),​[A6](ZipLatestWith7.html "type parameter in ZipLatestWith7"),​[A7](ZipLatestWith7.html "type parameter in ZipLatestWith7"),​[O](ZipLatestWith7.html "type parameter in ZipLatestWith7")> zipper,  boolean eagerComplete)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[GraphStageLogic](../stage/GraphStageLogic.html "class in akka.stream.stage")` | `[createLogic](#createLogic(akka.stream.Attributes))​([Attributes](../Attributes.html "class in akka.stream") inheritedAttributes)` |  |
	| `boolean` | `[eagerComplete](#eagerComplete())()` |  |
	| `[Inlet](../Inlet.html "class in akka.stream")<[A1](ZipLatestWith7.html "type parameter in ZipLatestWith7")>` | `[in0](#in0())()` |  |
	| `[Inlet](../Inlet.html "class in akka.stream")<[A2](ZipLatestWith7.html "type parameter in ZipLatestWith7")>` | `[in1](#in1())()` |  |
	| `[Inlet](../Inlet.html "class in akka.stream")<[A3](ZipLatestWith7.html "type parameter in ZipLatestWith7")>` | `[in2](#in2())()` |  |
	| `[Inlet](../Inlet.html "class in akka.stream")<[A4](ZipLatestWith7.html "type parameter in ZipLatestWith7")>` | `[in3](#in3())()` |  |
	| `[Inlet](../Inlet.html "class in akka.stream")<[A5](ZipLatestWith7.html "type parameter in ZipLatestWith7")>` | `[in4](#in4())()` |  |
	| `[Inlet](../Inlet.html "class in akka.stream")<[A6](ZipLatestWith7.html "type parameter in ZipLatestWith7")>` | `[in5](#in5())()` |  |
	| `[Inlet](../Inlet.html "class in akka.stream")<[A7](ZipLatestWith7.html "type parameter in ZipLatestWith7")>` | `[in6](#in6())()` |  |
	| `[Attributes](../Attributes.html "class in akka.stream")` | `[initialAttributes](#initialAttributes())()` |  |
	| `[Outlet](../Outlet.html "class in akka.stream")<[O](ZipLatestWith7.html "type parameter in ZipLatestWith7")>` | `[out](#out())()` |  |
	| `[FanInShape7](../FanInShape7.html "class in akka.stream")<[A1](ZipLatestWith7.html "type parameter in ZipLatestWith7"),​[A2](ZipLatestWith7.html "type parameter in ZipLatestWith7"),​[A3](ZipLatestWith7.html "type parameter in ZipLatestWith7"),​[A4](ZipLatestWith7.html "type parameter in ZipLatestWith7"),​[A5](ZipLatestWith7.html "type parameter in ZipLatestWith7"),​[A6](ZipLatestWith7.html "type parameter in ZipLatestWith7"),​[A7](ZipLatestWith7.html "type parameter in ZipLatestWith7"),​[O](ZipLatestWith7.html "type parameter in ZipLatestWith7")>` | `[shape](#shape())()` | The shape of a graph is all that is externally visible: its inlets and outlets. |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Function7<[A1](ZipLatestWith7.html "type parameter in ZipLatestWith7"),​[A2](ZipLatestWith7.html "type parameter in ZipLatestWith7"),​[A3](ZipLatestWith7.html "type parameter in ZipLatestWith7"),​[A4](ZipLatestWith7.html "type parameter in ZipLatestWith7"),​[A5](ZipLatestWith7.html "type parameter in ZipLatestWith7"),​[A6](ZipLatestWith7.html "type parameter in ZipLatestWith7"),​[A7](ZipLatestWith7.html "type parameter in ZipLatestWith7"),​[O](ZipLatestWith7.html "type parameter in ZipLatestWith7")>` | `[zipper](#zipper())()` |  |
	
	
		- ### Methods inherited from class akka.stream.stage.[GraphStage](../stage/GraphStage.html "class in akka.stream.stage")
		
		
		`[createLogicAndMaterializedValue](../stage/GraphStage.html#createLogicAndMaterializedValue(akka.stream.Attributes))`
		- ### Methods inherited from class akka.stream.stage.[GraphStageWithMaterializedValue](../stage/GraphStageWithMaterializedValue.html "class in akka.stream.stage")
		
		
		`[withAttributes](../stage/GraphStageWithMaterializedValue.html#withAttributes(akka.stream.Attributes))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface akka.stream.[Graph](../Graph.html "interface in akka.stream")
		
		
		`[addAttributes](../Graph.html#addAttributes(akka.stream.Attributes)), [async](../Graph.html#async()), [async](../Graph.html#async(java.lang.String)), [async](../Graph.html#async(java.lang.String,int)), [getAttributes](../Graph.html#getAttributes()), [named](../Graph.html#named(java.lang.String))`

- - ### Constructor Detail
	
	
	
		- #### ZipLatestWith7
		
		
		
		```
		public ZipLatestWith7​(scala.Function7<[A1](ZipLatestWith7.html "type parameter in ZipLatestWith7"),​[A2](ZipLatestWith7.html "type parameter in ZipLatestWith7"),​[A3](ZipLatestWith7.html "type parameter in ZipLatestWith7"),​[A4](ZipLatestWith7.html "type parameter in ZipLatestWith7"),​[A5](ZipLatestWith7.html "type parameter in ZipLatestWith7"),​[A6](ZipLatestWith7.html "type parameter in ZipLatestWith7"),​[A7](ZipLatestWith7.html "type parameter in ZipLatestWith7"),​[O](ZipLatestWith7.html "type parameter in ZipLatestWith7")> zipper,
		                      boolean eagerComplete)
		```
		- #### ZipLatestWith7
		
		
		
		```
		public ZipLatestWith7​(scala.Function7<[A1](ZipLatestWith7.html "type parameter in ZipLatestWith7"),​[A2](ZipLatestWith7.html "type parameter in ZipLatestWith7"),​[A3](ZipLatestWith7.html "type parameter in ZipLatestWith7"),​[A4](ZipLatestWith7.html "type parameter in ZipLatestWith7"),​[A5](ZipLatestWith7.html "type parameter in ZipLatestWith7"),​[A6](ZipLatestWith7.html "type parameter in ZipLatestWith7"),​[A7](ZipLatestWith7.html "type parameter in ZipLatestWith7"),​[O](ZipLatestWith7.html "type parameter in ZipLatestWith7")> zipper)
		```

	- ### Method Detail
	
	
	
		- #### createLogic
		
		
		
		```
		public [GraphStageLogic](../stage/GraphStageLogic.html "class in akka.stream.stage") createLogic​([Attributes](../Attributes.html "class in akka.stream") inheritedAttributes)
		```
		
		
		Specified by:
		`[createLogic](../stage/GraphStage.html#createLogic(akka.stream.Attributes))` in class `[GraphStage](../stage/GraphStage.html "class in akka.stream.stage")<[FanInShape7](../FanInShape7.html "class in akka.stream")<[A1](ZipLatestWith7.html "type parameter in ZipLatestWith7"),​[A2](ZipLatestWith7.html "type parameter in ZipLatestWith7"),​[A3](ZipLatestWith7.html "type parameter in ZipLatestWith7"),​[A4](ZipLatestWith7.html "type parameter in ZipLatestWith7"),​[A5](ZipLatestWith7.html "type parameter in ZipLatestWith7"),​[A6](ZipLatestWith7.html "type parameter in ZipLatestWith7"),​[A7](ZipLatestWith7.html "type parameter in ZipLatestWith7"),​[O](ZipLatestWith7.html "type parameter in ZipLatestWith7")>>`
		- #### eagerComplete
		
		
		
		```
		public boolean eagerComplete()
		```
		- #### in0
		
		
		
		```
		public [Inlet](../Inlet.html "class in akka.stream")<[A1](ZipLatestWith7.html "type parameter in ZipLatestWith7")> in0()
		```
		- #### in1
		
		
		
		```
		public [Inlet](../Inlet.html "class in akka.stream")<[A2](ZipLatestWith7.html "type parameter in ZipLatestWith7")> in1()
		```
		- #### in2
		
		
		
		```
		public [Inlet](../Inlet.html "class in akka.stream")<[A3](ZipLatestWith7.html "type parameter in ZipLatestWith7")> in2()
		```
		- #### in3
		
		
		
		```
		public [Inlet](../Inlet.html "class in akka.stream")<[A4](ZipLatestWith7.html "type parameter in ZipLatestWith7")> in3()
		```
		- #### in4
		
		
		
		```
		public [Inlet](../Inlet.html "class in akka.stream")<[A5](ZipLatestWith7.html "type parameter in ZipLatestWith7")> in4()
		```
		- #### in5
		
		
		
		```
		public [Inlet](../Inlet.html "class in akka.stream")<[A6](ZipLatestWith7.html "type parameter in ZipLatestWith7")> in5()
		```
		- #### in6
		
		
		
		```
		public [Inlet](../Inlet.html "class in akka.stream")<[A7](ZipLatestWith7.html "type parameter in ZipLatestWith7")> in6()
		```
		- #### initialAttributes
		
		
		
		```
		public [Attributes](../Attributes.html "class in akka.stream") initialAttributes()
		```
		
		
		Overrides:
		`[initialAttributes](../stage/GraphStageWithMaterializedValue.html#initialAttributes())` in class `[GraphStageWithMaterializedValue](../stage/GraphStageWithMaterializedValue.html "class in akka.stream.stage")<[FanInShape7](../FanInShape7.html "class in akka.stream")<[A1](ZipLatestWith7.html "type parameter in ZipLatestWith7"),​[A2](ZipLatestWith7.html "type parameter in ZipLatestWith7"),​[A3](ZipLatestWith7.html "type parameter in ZipLatestWith7"),​[A4](ZipLatestWith7.html "type parameter in ZipLatestWith7"),​[A5](ZipLatestWith7.html "type parameter in ZipLatestWith7"),​[A6](ZipLatestWith7.html "type parameter in ZipLatestWith7"),​[A7](ZipLatestWith7.html "type parameter in ZipLatestWith7"),​[O](ZipLatestWith7.html "type parameter in ZipLatestWith7")>,​[NotUsed](../../NotUsed.html "class in akka")>`
		- #### out
		
		
		
		```
		public [Outlet](../Outlet.html "class in akka.stream")<[O](ZipLatestWith7.html "type parameter in ZipLatestWith7")> out()
		```
		- #### shape
		
		
		
		```
		public [FanInShape7](../FanInShape7.html "class in akka.stream")<[A1](ZipLatestWith7.html "type parameter in ZipLatestWith7"),​[A2](ZipLatestWith7.html "type parameter in ZipLatestWith7"),​[A3](ZipLatestWith7.html "type parameter in ZipLatestWith7"),​[A4](ZipLatestWith7.html "type parameter in ZipLatestWith7"),​[A5](ZipLatestWith7.html "type parameter in ZipLatestWith7"),​[A6](ZipLatestWith7.html "type parameter in ZipLatestWith7"),​[A7](ZipLatestWith7.html "type parameter in ZipLatestWith7"),​[O](ZipLatestWith7.html "type parameter in ZipLatestWith7")> shape()
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
		public scala.Function7<[A1](ZipLatestWith7.html "type parameter in ZipLatestWith7"),​[A2](ZipLatestWith7.html "type parameter in ZipLatestWith7"),​[A3](ZipLatestWith7.html "type parameter in ZipLatestWith7"),​[A4](ZipLatestWith7.html "type parameter in ZipLatestWith7"),​[A5](ZipLatestWith7.html "type parameter in ZipLatestWith7"),​[A6](ZipLatestWith7.html "type parameter in ZipLatestWith7"),​[A7](ZipLatestWith7.html "type parameter in ZipLatestWith7"),​[O](ZipLatestWith7.html "type parameter in ZipLatestWith7")> zipper()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/NotUsed.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/Attributes.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/FanInShape7.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/Graph.GraphMapMatVal.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/Graph.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/Inlet.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/Outlet.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/Shape.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/scaladsl/ZipLatestWith7.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/scaladsl/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/stage/GraphStage.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/stage/GraphStageLogic.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/stage/GraphStageWithMaterializedValue.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/stream/scaladsl/ZipLatestWith7.html](https://doc.akka.io/japi/akka-core/2.10/akka/stream/scaladsl/ZipLatestWith7.html)*