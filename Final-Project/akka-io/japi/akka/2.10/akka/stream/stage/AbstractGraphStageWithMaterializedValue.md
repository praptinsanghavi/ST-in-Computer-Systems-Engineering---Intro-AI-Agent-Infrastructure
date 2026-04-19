---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:02:40Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/2.10/akka/stream/stage/AbstractGraphStageWithMaterializedValue.html
title: AbstractGraphStageWithMaterializedValue
---

# AbstractGraphStageWithMaterializedValue

## Content

Package [akka.stream.stage](package-summary.html)
## Class AbstractGraphStageWithMaterializedValue\<S extends [Shape](../Shape.html "class in akka.stream"),​M\>

- java.lang.Object
- - [akka.stream.stage.GraphStageWithMaterializedValue](GraphStageWithMaterializedValue.html "class in akka.stream.stage")\<S,​M\>
	- - akka.stream.stage.AbstractGraphStageWithMaterializedValue\<S,​M\>

- All Implemented Interfaces:
`[Graph](../Graph.html "interface in akka.stream")<S,​M>`

---

```
public abstract class AbstractGraphStageWithMaterializedValue<S extends [Shape](../Shape.html "class in akka.stream"),​M>
extends [GraphStageWithMaterializedValue](GraphStageWithMaterializedValue.html "class in akka.stream.stage")<S,​M>
```

Java API: A GraphStage represents a reusable graph stream processing operator.
 
 Extend this `AbstractGraphStageWithMaterializedValue` if you want to provide a materialized value,
 represented by the type parameter `M`. If your GraphStage does not need to provide a materialized
 value you can instead extend [`GraphStage`](GraphStage.html "class in akka.stream.stage") which materializes a `NotUsed` value.
 

 A GraphStage consists of a `Shape` which describes its input and output ports and a factory function that
 creates a [`GraphStageLogic`](GraphStageLogic.html "class in akka.stream.stage") which implements the processing logic that ties the ports together.
 

 See also [`GraphStageWithMaterializedValue`](GraphStageWithMaterializedValue.html "class in akka.stream.stage") for Scala DSL for this operator.

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface akka.stream.[Graph](../Graph.html "interface in akka.stream")
		
		
		`[Graph.GraphMapMatVal](../Graph.GraphMapMatVal.html "class in akka.stream")<[S](../Graph.GraphMapMatVal.html "type parameter in Graph.GraphMapMatVal") extends [Shape](../Shape.html "class in akka.stream"),​[M](../Graph.GraphMapMatVal.html "type parameter in Graph.GraphMapMatVal")>`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[AbstractGraphStageWithMaterializedValue](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `scala.Tuple2<[GraphStageLogic](GraphStageLogic.html "class in akka.stream.stage"),​[M](AbstractGraphStageWithMaterializedValue.html "type parameter in AbstractGraphStageWithMaterializedValue")>` | `[createLogicAndMaterializedValue](#createLogicAndMaterializedValue(akka.stream.Attributes))​([Attributes](../Attributes.html "class in akka.stream") inheritedAttributes)` |  |
	| `abstract [Pair](../../japi/Pair.html "class in akka.japi")<[GraphStageLogic](GraphStageLogic.html "class in akka.stream.stage"),​[M](AbstractGraphStageWithMaterializedValue.html "type parameter in AbstractGraphStageWithMaterializedValue")>` | `[createLogicAndMaterializedValuePair](#createLogicAndMaterializedValuePair(akka.stream.Attributes))​([Attributes](../Attributes.html "class in akka.stream") inheritedAttributes)` |  |
	
	
		- ### Methods inherited from class akka.stream.stage.[GraphStageWithMaterializedValue](GraphStageWithMaterializedValue.html "class in akka.stream.stage")
		
		
		`[initialAttributes](GraphStageWithMaterializedValue.html#initialAttributes()), [withAttributes](GraphStageWithMaterializedValue.html#withAttributes(akka.stream.Attributes))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.stream.[Graph](../Graph.html "interface in akka.stream")
		
		
		`[addAttributes](../Graph.html#addAttributes(akka.stream.Attributes)), [async](../Graph.html#async()), [async](../Graph.html#async(java.lang.String)), [async](../Graph.html#async(java.lang.String,int)), [getAttributes](../Graph.html#getAttributes()), [named](../Graph.html#named(java.lang.String)), [shape](../Graph.html#shape())`

- - ### Constructor Detail
	
	
	
		- #### AbstractGraphStageWithMaterializedValue
		
		
		
		```
		public AbstractGraphStageWithMaterializedValue()
		```

	- ### Method Detail
	
	
	
		- #### createLogicAndMaterializedValue
		
		
		
		```
		public final scala.Tuple2<[GraphStageLogic](GraphStageLogic.html "class in akka.stream.stage"),​[M](AbstractGraphStageWithMaterializedValue.html "type parameter in AbstractGraphStageWithMaterializedValue")> createLogicAndMaterializedValue​([Attributes](../Attributes.html "class in akka.stream") inheritedAttributes)
		                                                                            throws java.lang.Exception
		```
		
		
		Specified by:
		`[createLogicAndMaterializedValue](GraphStageWithMaterializedValue.html#createLogicAndMaterializedValue(akka.stream.Attributes))` in class `[GraphStageWithMaterializedValue](GraphStageWithMaterializedValue.html "class in akka.stream.stage")<[S](AbstractGraphStageWithMaterializedValue.html "type parameter in AbstractGraphStageWithMaterializedValue") extends [Shape](../Shape.html "class in akka.stream"),​[M](AbstractGraphStageWithMaterializedValue.html "type parameter in AbstractGraphStageWithMaterializedValue")>`
		Throws:
		`java.lang.Exception`
		- #### createLogicAndMaterializedValuePair
		
		
		
		```
		public abstract [Pair](../../japi/Pair.html "class in akka.japi")<[GraphStageLogic](GraphStageLogic.html "class in akka.stream.stage"),​[M](AbstractGraphStageWithMaterializedValue.html "type parameter in AbstractGraphStageWithMaterializedValue")> createLogicAndMaterializedValuePair​([Attributes](../Attributes.html "class in akka.stream") inheritedAttributes)
		                                                                           throws java.lang.Exception
		```
		
		
		Throws:
		`java.lang.Exception`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/2.10/akka/japi/Pair.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/Attributes.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/Graph.GraphMapMatVal.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/Graph.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/Shape.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/stage/AbstractGraphStageWithMaterializedValue.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/stage/GraphStage.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/stage/GraphStageLogic.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/stage/GraphStageWithMaterializedValue.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/stage/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/2.10/akka/stream/stage/AbstractGraphStageWithMaterializedValue.html](https://doc.akka.io/japi/akka/2.10/akka/stream/stage/AbstractGraphStageWithMaterializedValue.html)*