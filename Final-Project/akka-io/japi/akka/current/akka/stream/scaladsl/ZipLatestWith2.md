---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:43:36Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/ZipLatestWith2.html
title: ZipLatestWith2
---

# ZipLatestWith2

## Content

Package [akka.stream.scaladsl](package-summary.html)
## Class ZipLatestWith2\<A1,​A2,​O\>

- java.lang.Object
- - [akka.stream.stage.GraphStageWithMaterializedValue](../stage/GraphStageWithMaterializedValue.html "class in akka.stream.stage")\<S,​[NotUsed](../../NotUsed.html "class in akka")\>
	- - [akka.stream.stage.GraphStage](../stage/GraphStage.html "class in akka.stream.stage")\<[FanInShape2](../FanInShape2.html "class in akka.stream")\<A1,​A2,​O\>\>
		- - akka.stream.scaladsl.ZipLatestWith2\<A1,​A2,​O\>

- All Implemented Interfaces:
`[Graph](../Graph.html "interface in akka.stream")<[FanInShape2](../FanInShape2.html "class in akka.stream")<A1,​A2,​O>,​[NotUsed](../../NotUsed.html "class in akka")>`

Direct Known Subclasses:
`[ZipLatest](ZipLatest.html "class in akka.stream.scaladsl")`

---

```
public class ZipLatestWith2<A1,​A2,​O>
extends [GraphStage](../stage/GraphStage.html "class in akka.stream.stage")<[FanInShape2](../FanInShape2.html "class in akka.stream")<A1,​A2,​O>>
```

\`ZipLatestWith\` specialized for 2 inputs

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface akka.stream.[Graph](../Graph.html "interface in akka.stream")
		
		
		`[Graph.GraphMapMatVal](../Graph.GraphMapMatVal.html "class in akka.stream")<[S](../Graph.GraphMapMatVal.html "type parameter in Graph.GraphMapMatVal") extends [Shape](../Shape.html "class in akka.stream"),​[M](../Graph.GraphMapMatVal.html "type parameter in Graph.GraphMapMatVal")>`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ZipLatestWith2](#%3Cinit%3E(scala.Function2))​(scala.Function2<[A1](ZipLatestWith2.html "type parameter in ZipLatestWith2"),​[A2](ZipLatestWith2.html "type parameter in ZipLatestWith2"),​[O](ZipLatestWith2.html "type parameter in ZipLatestWith2")> zipper)` |  |
	| `[ZipLatestWith2](#%3Cinit%3E(scala.Function2,boolean))​(scala.Function2<[A1](ZipLatestWith2.html "type parameter in ZipLatestWith2"),​[A2](ZipLatestWith2.html "type parameter in ZipLatestWith2"),​[O](ZipLatestWith2.html "type parameter in ZipLatestWith2")> zipper,  boolean eagerComplete)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[GraphStageLogic](../stage/GraphStageLogic.html "class in akka.stream.stage")` | `[createLogic](#createLogic(akka.stream.Attributes))​([Attributes](../Attributes.html "class in akka.stream") inheritedAttributes)` |  |
	| `boolean` | `[eagerComplete](#eagerComplete())()` |  |
	| `[Inlet](../Inlet.html "class in akka.stream")<[A1](ZipLatestWith2.html "type parameter in ZipLatestWith2")>` | `[in0](#in0())()` |  |
	| `[Inlet](../Inlet.html "class in akka.stream")<[A2](ZipLatestWith2.html "type parameter in ZipLatestWith2")>` | `[in1](#in1())()` |  |
	| `[Attributes](../Attributes.html "class in akka.stream")` | `[initialAttributes](#initialAttributes())()` |  |
	| `[Outlet](../Outlet.html "class in akka.stream")<[O](ZipLatestWith2.html "type parameter in ZipLatestWith2")>` | `[out](#out())()` |  |
	| `[FanInShape2](../FanInShape2.html "class in akka.stream")<[A1](ZipLatestWith2.html "type parameter in ZipLatestWith2"),​[A2](ZipLatestWith2.html "type parameter in ZipLatestWith2"),​[O](ZipLatestWith2.html "type parameter in ZipLatestWith2")>` | `[shape](#shape())()` | The shape of a graph is all that is externally visible: its inlets and outlets. |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Function2<[A1](ZipLatestWith2.html "type parameter in ZipLatestWith2"),​[A2](ZipLatestWith2.html "type parameter in ZipLatestWith2"),​[O](ZipLatestWith2.html "type parameter in ZipLatestWith2")>` | `[zipper](#zipper())()` |  |
	
	
		- ### Methods inherited from class akka.stream.stage.[GraphStage](../stage/GraphStage.html "class in akka.stream.stage")
		
		
		`[createLogicAndMaterializedValue](../stage/GraphStage.html#createLogicAndMaterializedValue(akka.stream.Attributes))`
		- ### Methods inherited from class akka.stream.stage.[GraphStageWithMaterializedValue](../stage/GraphStageWithMaterializedValue.html "class in akka.stream.stage")
		
		
		`[withAttributes](../stage/GraphStageWithMaterializedValue.html#withAttributes(akka.stream.Attributes))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface akka.stream.[Graph](../Graph.html "interface in akka.stream")
		
		
		`[addAttributes](../Graph.html#addAttributes(akka.stream.Attributes)), [async](../Graph.html#async()), [async](../Graph.html#async(java.lang.String)), [async](../Graph.html#async(java.lang.String,int)), [getAttributes](../Graph.html#getAttributes()), [named](../Graph.html#named(java.lang.String))`

- - ### Constructor Detail
	
	
	
		- #### ZipLatestWith2
		
		
		
		```
		public ZipLatestWith2​(scala.Function2<[A1](ZipLatestWith2.html "type parameter in ZipLatestWith2"),​[A2](ZipLatestWith2.html "type parameter in ZipLatestWith2"),​[O](ZipLatestWith2.html "type parameter in ZipLatestWith2")> zipper,
		                      boolean eagerComplete)
		```
		- #### ZipLatestWith2
		
		
		
		```
		public ZipLatestWith2​(scala.Function2<[A1](ZipLatestWith2.html "type parameter in ZipLatestWith2"),​[A2](ZipLatestWith2.html "type parameter in ZipLatestWith2"),​[O](ZipLatestWith2.html "type parameter in ZipLatestWith2")> zipper)
		```

	- ### Method Detail
	
	
	
		- #### createLogic
		
		
		
		```
		public [GraphStageLogic](../stage/GraphStageLogic.html "class in akka.stream.stage") createLogic​([Attributes](../Attributes.html "class in akka.stream") inheritedAttributes)
		```
		
		
		Specified by:
		`[createLogic](../stage/GraphStage.html#createLogic(akka.stream.Attributes))` in class `[GraphStage](../stage/GraphStage.html "class in akka.stream.stage")<[FanInShape2](../FanInShape2.html "class in akka.stream")<[A1](ZipLatestWith2.html "type parameter in ZipLatestWith2"),​[A2](ZipLatestWith2.html "type parameter in ZipLatestWith2"),​[O](ZipLatestWith2.html "type parameter in ZipLatestWith2")>>`
		- #### eagerComplete
		
		
		
		```
		public boolean eagerComplete()
		```
		- #### in0
		
		
		
		```
		public [Inlet](../Inlet.html "class in akka.stream")<[A1](ZipLatestWith2.html "type parameter in ZipLatestWith2")> in0()
		```
		- #### in1
		
		
		
		```
		public [Inlet](../Inlet.html "class in akka.stream")<[A2](ZipLatestWith2.html "type parameter in ZipLatestWith2")> in1()
		```
		- #### initialAttributes
		
		
		
		```
		public [Attributes](../Attributes.html "class in akka.stream") initialAttributes()
		```
		
		
		Overrides:
		`[initialAttributes](../stage/GraphStageWithMaterializedValue.html#initialAttributes())` in class `[GraphStageWithMaterializedValue](../stage/GraphStageWithMaterializedValue.html "class in akka.stream.stage")<[FanInShape2](../FanInShape2.html "class in akka.stream")<[A1](ZipLatestWith2.html "type parameter in ZipLatestWith2"),​[A2](ZipLatestWith2.html "type parameter in ZipLatestWith2"),​[O](ZipLatestWith2.html "type parameter in ZipLatestWith2")>,​[NotUsed](../../NotUsed.html "class in akka")>`
		- #### out
		
		
		
		```
		public [Outlet](../Outlet.html "class in akka.stream")<[O](ZipLatestWith2.html "type parameter in ZipLatestWith2")> out()
		```
		- #### shape
		
		
		
		```
		public [FanInShape2](../FanInShape2.html "class in akka.stream")<[A1](ZipLatestWith2.html "type parameter in ZipLatestWith2"),​[A2](ZipLatestWith2.html "type parameter in ZipLatestWith2"),​[O](ZipLatestWith2.html "type parameter in ZipLatestWith2")> shape()
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
		public scala.Function2<[A1](ZipLatestWith2.html "type parameter in ZipLatestWith2"),​[A2](ZipLatestWith2.html "type parameter in ZipLatestWith2"),​[O](ZipLatestWith2.html "type parameter in ZipLatestWith2")> zipper()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/NotUsed.html
- https://doc.akka.io/japi/akka/current/akka/stream/Attributes.html
- https://doc.akka.io/japi/akka/current/akka/stream/FanInShape2.html
- https://doc.akka.io/japi/akka/current/akka/stream/Graph.GraphMapMatVal.html
- https://doc.akka.io/japi/akka/current/akka/stream/Graph.html
- https://doc.akka.io/japi/akka/current/akka/stream/Inlet.html
- https://doc.akka.io/japi/akka/current/akka/stream/Outlet.html
- https://doc.akka.io/japi/akka/current/akka/stream/Shape.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/ZipLatest.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/ZipLatestWith2.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/stream/stage/GraphStage.html
- https://doc.akka.io/japi/akka/current/akka/stream/stage/GraphStageLogic.html
- https://doc.akka.io/japi/akka/current/akka/stream/stage/GraphStageWithMaterializedValue.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/ZipLatestWith2.html](https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/ZipLatestWith2.html)*