---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:48:55Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/2.10/akka/stream/scaladsl/ZipWith3.html
title: ZipWith3
---

# ZipWith3

## Content

Package [akka.stream.scaladsl](package-summary.html)
## Class ZipWith3\<A1,​A2,​A3,​O\>

- java.lang.Object
- - [akka.stream.stage.GraphStageWithMaterializedValue](../stage/GraphStageWithMaterializedValue.html "class in akka.stream.stage")\<S,​[NotUsed](../../NotUsed.html "class in akka")\>
	- - [akka.stream.stage.GraphStage](../stage/GraphStage.html "class in akka.stream.stage")\<[FanInShape3](../FanInShape3.html "class in akka.stream")\<A1,​A2,​A3,​O\>\>
		- - akka.stream.scaladsl.ZipWith3\<A1,​A2,​A3,​O\>

- All Implemented Interfaces:
`[Graph](../Graph.html "interface in akka.stream")<[FanInShape3](../FanInShape3.html "class in akka.stream")<A1,​A2,​A3,​O>,​[NotUsed](../../NotUsed.html "class in akka")>`

---

```
public class ZipWith3<A1,​A2,​A3,​O>
extends [GraphStage](../stage/GraphStage.html "class in akka.stream.stage")<[FanInShape3](../FanInShape3.html "class in akka.stream")<A1,​A2,​A3,​O>>
```

\`ZipWith\` specialized for 3 inputs

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface akka.stream.[Graph](../Graph.html "interface in akka.stream")
		
		
		`[Graph.GraphMapMatVal](../Graph.GraphMapMatVal.html "class in akka.stream")<[S](../Graph.GraphMapMatVal.html "type parameter in Graph.GraphMapMatVal") extends [Shape](../Shape.html "class in akka.stream"),​[M](../Graph.GraphMapMatVal.html "type parameter in Graph.GraphMapMatVal")>`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ZipWith3](#%3Cinit%3E(scala.Function3))​(scala.Function3<[A1](ZipWith3.html "type parameter in ZipWith3"),​[A2](ZipWith3.html "type parameter in ZipWith3"),​[A3](ZipWith3.html "type parameter in ZipWith3"),​[O](ZipWith3.html "type parameter in ZipWith3")> zipper)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[GraphStageLogic](../stage/GraphStageLogic.html "class in akka.stream.stage")` | `[createLogic](#createLogic(akka.stream.Attributes))​([Attributes](../Attributes.html "class in akka.stream") inheritedAttributes)` |  |
	| `[Inlet](../Inlet.html "class in akka.stream")<[A1](ZipWith3.html "type parameter in ZipWith3")>` | `[in0](#in0())()` |  |
	| `[Inlet](../Inlet.html "class in akka.stream")<[A2](ZipWith3.html "type parameter in ZipWith3")>` | `[in1](#in1())()` |  |
	| `[Inlet](../Inlet.html "class in akka.stream")<[A3](ZipWith3.html "type parameter in ZipWith3")>` | `[in2](#in2())()` |  |
	| `[Attributes](../Attributes.html "class in akka.stream")` | `[initialAttributes](#initialAttributes())()` |  |
	| `[Outlet](../Outlet.html "class in akka.stream")<[O](ZipWith3.html "type parameter in ZipWith3")>` | `[out](#out())()` |  |
	| `[FanInShape3](../FanInShape3.html "class in akka.stream")<[A1](ZipWith3.html "type parameter in ZipWith3"),​[A2](ZipWith3.html "type parameter in ZipWith3"),​[A3](ZipWith3.html "type parameter in ZipWith3"),​[O](ZipWith3.html "type parameter in ZipWith3")>` | `[shape](#shape())()` | The shape of a graph is all that is externally visible: its inlets and outlets. |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Function3<[A1](ZipWith3.html "type parameter in ZipWith3"),​[A2](ZipWith3.html "type parameter in ZipWith3"),​[A3](ZipWith3.html "type parameter in ZipWith3"),​[O](ZipWith3.html "type parameter in ZipWith3")>` | `[zipper](#zipper())()` |  |
	
	
		- ### Methods inherited from class akka.stream.stage.[GraphStage](../stage/GraphStage.html "class in akka.stream.stage")
		
		
		`[createLogicAndMaterializedValue](../stage/GraphStage.html#createLogicAndMaterializedValue(akka.stream.Attributes))`
		- ### Methods inherited from class akka.stream.stage.[GraphStageWithMaterializedValue](../stage/GraphStageWithMaterializedValue.html "class in akka.stream.stage")
		
		
		`[withAttributes](../stage/GraphStageWithMaterializedValue.html#withAttributes(akka.stream.Attributes))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface akka.stream.[Graph](../Graph.html "interface in akka.stream")
		
		
		`[addAttributes](../Graph.html#addAttributes(akka.stream.Attributes)), [async](../Graph.html#async()), [async](../Graph.html#async(java.lang.String)), [async](../Graph.html#async(java.lang.String,int)), [getAttributes](../Graph.html#getAttributes()), [named](../Graph.html#named(java.lang.String))`

- - ### Constructor Detail
	
	
	
		- #### ZipWith3
		
		
		
		```
		public ZipWith3​(scala.Function3<[A1](ZipWith3.html "type parameter in ZipWith3"),​[A2](ZipWith3.html "type parameter in ZipWith3"),​[A3](ZipWith3.html "type parameter in ZipWith3"),​[O](ZipWith3.html "type parameter in ZipWith3")> zipper)
		```

	- ### Method Detail
	
	
	
		- #### createLogic
		
		
		
		```
		public [GraphStageLogic](../stage/GraphStageLogic.html "class in akka.stream.stage") createLogic​([Attributes](../Attributes.html "class in akka.stream") inheritedAttributes)
		```
		
		
		Specified by:
		`[createLogic](../stage/GraphStage.html#createLogic(akka.stream.Attributes))` in class `[GraphStage](../stage/GraphStage.html "class in akka.stream.stage")<[FanInShape3](../FanInShape3.html "class in akka.stream")<[A1](ZipWith3.html "type parameter in ZipWith3"),​[A2](ZipWith3.html "type parameter in ZipWith3"),​[A3](ZipWith3.html "type parameter in ZipWith3"),​[O](ZipWith3.html "type parameter in ZipWith3")>>`
		- #### in0
		
		
		
		```
		public [Inlet](../Inlet.html "class in akka.stream")<[A1](ZipWith3.html "type parameter in ZipWith3")> in0()
		```
		- #### in1
		
		
		
		```
		public [Inlet](../Inlet.html "class in akka.stream")<[A2](ZipWith3.html "type parameter in ZipWith3")> in1()
		```
		- #### in2
		
		
		
		```
		public [Inlet](../Inlet.html "class in akka.stream")<[A3](ZipWith3.html "type parameter in ZipWith3")> in2()
		```
		- #### initialAttributes
		
		
		
		```
		public [Attributes](../Attributes.html "class in akka.stream") initialAttributes()
		```
		
		
		Overrides:
		`[initialAttributes](../stage/GraphStageWithMaterializedValue.html#initialAttributes())` in class `[GraphStageWithMaterializedValue](../stage/GraphStageWithMaterializedValue.html "class in akka.stream.stage")<[FanInShape3](../FanInShape3.html "class in akka.stream")<[A1](ZipWith3.html "type parameter in ZipWith3"),​[A2](ZipWith3.html "type parameter in ZipWith3"),​[A3](ZipWith3.html "type parameter in ZipWith3"),​[O](ZipWith3.html "type parameter in ZipWith3")>,​[NotUsed](../../NotUsed.html "class in akka")>`
		- #### out
		
		
		
		```
		public [Outlet](../Outlet.html "class in akka.stream")<[O](ZipWith3.html "type parameter in ZipWith3")> out()
		```
		- #### shape
		
		
		
		```
		public [FanInShape3](../FanInShape3.html "class in akka.stream")<[A1](ZipWith3.html "type parameter in ZipWith3"),​[A2](ZipWith3.html "type parameter in ZipWith3"),​[A3](ZipWith3.html "type parameter in ZipWith3"),​[O](ZipWith3.html "type parameter in ZipWith3")> shape()
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
		public scala.Function3<[A1](ZipWith3.html "type parameter in ZipWith3"),​[A2](ZipWith3.html "type parameter in ZipWith3"),​[A3](ZipWith3.html "type parameter in ZipWith3"),​[O](ZipWith3.html "type parameter in ZipWith3")> zipper()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/2.10/akka/NotUsed.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/Attributes.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/FanInShape3.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/Graph.GraphMapMatVal.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/Graph.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/Inlet.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/Outlet.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/Shape.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/scaladsl/ZipWith3.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/scaladsl/package-summary.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/stage/GraphStage.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/stage/GraphStageLogic.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/stage/GraphStageWithMaterializedValue.html

---
*Source: [https://doc.akka.io/japi/akka/2.10/akka/stream/scaladsl/ZipWith3.html](https://doc.akka.io/japi/akka/2.10/akka/stream/scaladsl/ZipWith3.html)*