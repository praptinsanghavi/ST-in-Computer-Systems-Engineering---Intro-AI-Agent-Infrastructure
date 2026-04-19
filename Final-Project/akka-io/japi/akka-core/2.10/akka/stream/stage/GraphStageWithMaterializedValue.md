---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:06:40Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/stream/stage/GraphStageWithMaterializedValue.html
title: GraphStageWithMaterializedValue
---

# GraphStageWithMaterializedValue

## Content

Package [akka.stream.stage](package-summary.html)
## Class GraphStageWithMaterializedValue\<S extends [Shape](../Shape.html "class in akka.stream"),​M\>

- java.lang.Object
- - akka.stream.stage.GraphStageWithMaterializedValue\<S,​M\>

- All Implemented Interfaces:
`[Graph](../Graph.html "interface in akka.stream")<S,​M>`

Direct Known Subclasses:
`[AbstractGraphStageWithMaterializedValue](AbstractGraphStageWithMaterializedValue.html "class in akka.stream.stage")`, `[GraphStage](GraphStage.html "class in akka.stream.stage")`, `[KillSwitches.UniqueBidiKillSwitchStage$](../KillSwitches.UniqueBidiKillSwitchStage$.html "class in akka.stream")`, `[KillSwitches.UniqueKillSwitchStage$](../KillSwitches.UniqueKillSwitchStage$.html "class in akka.stream")`

---

```
public abstract class GraphStageWithMaterializedValue<S extends [Shape](../Shape.html "class in akka.stream"),​M>
extends java.lang.Object
implements [Graph](../Graph.html "interface in akka.stream")<S,​M>
```

Scala API: A GraphStage represents a reusable graph stream processing operator.
 
 Extend this `GraphStageWithMaterializedValue` if you want to provide a materialized value,
 represented by the type parameter `M`. If your GraphStage does not need to provide a materialized
 value you can instead extende [`GraphStage`](GraphStage.html "class in akka.stream.stage") which materializes a `NotUsed` value.
 

 A GraphStage consists of a `Shape` which describes its input and output ports and a factory function that
 creates a [`GraphStageLogic`](GraphStageLogic.html "class in akka.stream.stage") which implements the processing logic that ties the ports together.
 

 See also [`AbstractGraphStageWithMaterializedValue`](AbstractGraphStageWithMaterializedValue.html "class in akka.stream.stage") for Java DSL for this operator.

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface akka.stream.[Graph](../Graph.html "interface in akka.stream")
		
		
		`[Graph.GraphMapMatVal](../Graph.GraphMapMatVal.html "class in akka.stream")<[S](../Graph.GraphMapMatVal.html "type parameter in Graph.GraphMapMatVal") extends [Shape](../Shape.html "class in akka.stream"),​[M](../Graph.GraphMapMatVal.html "type parameter in Graph.GraphMapMatVal")>`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[GraphStageWithMaterializedValue](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `abstract scala.Tuple2<[GraphStageLogic](GraphStageLogic.html "class in akka.stream.stage"),​[M](GraphStageWithMaterializedValue.html "type parameter in GraphStageWithMaterializedValue")>` | `[createLogicAndMaterializedValue](#createLogicAndMaterializedValue(akka.stream.Attributes))​([Attributes](../Attributes.html "class in akka.stream") inheritedAttributes)` |  |
	| `protected [Attributes](../Attributes.html "class in akka.stream")` | `[initialAttributes](#initialAttributes())()` |  |
	| `[Graph](../Graph.html "interface in akka.stream")<[S](GraphStageWithMaterializedValue.html "type parameter in GraphStageWithMaterializedValue"),​[M](GraphStageWithMaterializedValue.html "type parameter in GraphStageWithMaterializedValue")>` | `[withAttributes](#withAttributes(akka.stream.Attributes))​([Attributes](../Attributes.html "class in akka.stream") attr)` | Replace the attributes of this `Flow` with the given ones. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.stream.[Graph](../Graph.html "interface in akka.stream")
		
		
		`[addAttributes](../Graph.html#addAttributes(akka.stream.Attributes)), [async](../Graph.html#async()), [async](../Graph.html#async(java.lang.String)), [async](../Graph.html#async(java.lang.String,int)), [getAttributes](../Graph.html#getAttributes()), [named](../Graph.html#named(java.lang.String)), [shape](../Graph.html#shape())`

- - ### Constructor Detail
	
	
	
		- #### GraphStageWithMaterializedValue
		
		
		
		```
		public GraphStageWithMaterializedValue()
		```

	- ### Method Detail
	
	
	
		- #### createLogicAndMaterializedValue
		
		
		
		```
		public abstract scala.Tuple2<[GraphStageLogic](GraphStageLogic.html "class in akka.stream.stage"),​[M](GraphStageWithMaterializedValue.html "type parameter in GraphStageWithMaterializedValue")> createLogicAndMaterializedValue​([Attributes](../Attributes.html "class in akka.stream") inheritedAttributes)
		                                                                               throws java.lang.Exception
		```
		
		
		Throws:
		`java.lang.Exception`
		- #### initialAttributes
		
		
		
		```
		protected [Attributes](../Attributes.html "class in akka.stream") initialAttributes()
		```
		- #### withAttributes
		
		
		
		```
		public final [Graph](../Graph.html "interface in akka.stream")<[S](GraphStageWithMaterializedValue.html "type parameter in GraphStageWithMaterializedValue"),​[M](GraphStageWithMaterializedValue.html "type parameter in GraphStageWithMaterializedValue")> withAttributes​([Attributes](../Attributes.html "class in akka.stream") attr)
		```
		
		Description copied from interface: `[Graph](../Graph.html#withAttributes(akka.stream.Attributes))`
		Replace the attributes of this `Flow` with the given ones. If this Flow is a composite
		 of multiple graphs, new attributes on the composite will be less specific than attributes
		 set directly on the individual graphs of the composite.
		
		Specified by:
		`[withAttributes](../Graph.html#withAttributes(akka.stream.Attributes))` in interface `[Graph](../Graph.html "interface in akka.stream")<[S](GraphStageWithMaterializedValue.html "type parameter in GraphStageWithMaterializedValue") extends [Shape](../Shape.html "class in akka.stream"),​[M](GraphStageWithMaterializedValue.html "type parameter in GraphStageWithMaterializedValue")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/stream/Attributes.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/Graph.GraphMapMatVal.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/Graph.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/KillSwitches.UniqueBidiKillSwitchStage$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/KillSwitches.UniqueKillSwitchStage$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/Shape.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/stage/AbstractGraphStageWithMaterializedValue.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/stage/GraphStage.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/stage/GraphStageLogic.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/stage/GraphStageWithMaterializedValue.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/stage/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/stream/stage/GraphStageWithMaterializedValue.html](https://doc.akka.io/japi/akka-core/2.10/akka/stream/stage/GraphStageWithMaterializedValue.html)*