---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:35:34Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/RunnableGraph.html
title: RunnableGraph
---

# RunnableGraph

## Content

Package [akka.stream.javadsl](package-summary.html)
## Class RunnableGraph\<Mat\>

- java.lang.Object
- - akka.stream.javadsl.RunnableGraph\<Mat\>

- All Implemented Interfaces:
`[Graph](../Graph.html "interface in akka.stream")<[ClosedShape](../ClosedShape.html "class in akka.stream"),​Mat>`

---

```
public abstract class RunnableGraph<Mat>
extends java.lang.Object
implements [Graph](../Graph.html "interface in akka.stream")<[ClosedShape](../ClosedShape.html "class in akka.stream"),​Mat>
```

Java API
 
 Flow with attached input and output, can be executed.

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface akka.stream.[Graph](../Graph.html "interface in akka.stream")
		
		
		`[Graph.GraphMapMatVal](../Graph.GraphMapMatVal.html "class in akka.stream")<[S](../Graph.GraphMapMatVal.html "type parameter in Graph.GraphMapMatVal") extends [Shape](../Shape.html "class in akka.stream"),​[M](../Graph.GraphMapMatVal.html "type parameter in Graph.GraphMapMatVal")>`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[RunnableGraph](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[RunnableGraph](RunnableGraph.html "class in akka.stream.javadsl")<[Mat](RunnableGraph.html "type parameter in RunnableGraph")>` | `[addAttributes](#addAttributes(akka.stream.Attributes))​([Attributes](../Attributes.html "class in akka.stream") attr)` | Add the given attributes to this [`Graph`](../Graph.html "interface in akka.stream"). |
	| `abstract [RunnableGraph](../scaladsl/RunnableGraph.html "class in akka.stream.scaladsl")<[Mat](RunnableGraph.html "type parameter in RunnableGraph")>` | `[asScala](#asScala())()` | Converts this Java DSL element to its Scala DSL counterpart. |
	| `static <Mat> [RunnableGraph](RunnableGraph.html "class in akka.stream.javadsl")<Mat>` | `[fromGraph](#fromGraph(akka.stream.Graph))​([Graph](../Graph.html "interface in akka.stream")<[ClosedShape](../ClosedShape.html "class in akka.stream"),​Mat> graph)` | A graph with a closed shape is logically a runnable graph, this method makes  it so also in type. |
	| `abstract <Mat2> [RunnableGraph](RunnableGraph.html "class in akka.stream.javadsl")<Mat2>` | `[mapMaterializedValue](#mapMaterializedValue(akka.japi.function.Function))​([Function](../../japi/function/Function.html "interface in akka.japi.function")<[Mat](RunnableGraph.html "type parameter in RunnableGraph"),​Mat2> f)` | Transform only the materialized value of this RunnableGraph, leaving all other properties as they were. |
	| `[RunnableGraph](RunnableGraph.html "class in akka.stream.javadsl")<[Mat](RunnableGraph.html "type parameter in RunnableGraph")>` | `[named](#named(java.lang.String))​(java.lang.String name)` | Specifies the name of the Graph. |
	| `[Mat](RunnableGraph.html "type parameter in RunnableGraph")` | `[run](#run(akka.actor.ClassicActorSystemProvider))​([ClassicActorSystemProvider](../../actor/ClassicActorSystemProvider.html "interface in akka.actor") systemProvider)` | Run this flow and return the materialized values of the flow. |
	| `abstract [Mat](RunnableGraph.html "type parameter in RunnableGraph")` | `[run](#run(akka.stream.Materializer))​([Materializer](../Materializer.html "class in akka.stream") materializer)` | Run this flow using a special materializer and return the materialized values of the flow. |
	| `abstract [RunnableGraph](RunnableGraph.html "class in akka.stream.javadsl")<[Mat](RunnableGraph.html "type parameter in RunnableGraph")>` | `[withAttributes](#withAttributes(akka.stream.Attributes))​([Attributes](../Attributes.html "class in akka.stream") attr)` | Replace the attributes of this `Flow` with the given ones. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.stream.[Graph](../Graph.html "interface in akka.stream")
		
		
		`[async](../Graph.html#async()), [async](../Graph.html#async(java.lang.String)), [async](../Graph.html#async(java.lang.String,int)), [getAttributes](../Graph.html#getAttributes()), [shape](../Graph.html#shape()), [traversalBuilder](../Graph.html#traversalBuilder())`

- - ### Constructor Detail
	
	
	
		- #### RunnableGraph
		
		
		
		```
		public RunnableGraph()
		```

	- ### Method Detail
	
	
	
		- #### fromGraph
		
		
		
		```
		public static <Mat> [RunnableGraph](RunnableGraph.html "class in akka.stream.javadsl")<Mat> fromGraph​([Graph](../Graph.html "interface in akka.stream")<[ClosedShape](../ClosedShape.html "class in akka.stream"),​Mat> graph)
		```
		
		A graph with a closed shape is logically a runnable graph, this method makes
		 it so also in type.
		- #### run
		
		
		
		```
		public [Mat](RunnableGraph.html "type parameter in RunnableGraph") run​([ClassicActorSystemProvider](../../actor/ClassicActorSystemProvider.html "interface in akka.actor") systemProvider)
		```
		
		Run this flow and return the materialized values of the flow.
		 
		 Uses the system materializer.
		- #### run
		
		
		
		```
		public abstract [Mat](RunnableGraph.html "type parameter in RunnableGraph") run​([Materializer](../Materializer.html "class in akka.stream") materializer)
		```
		
		Run this flow using a special materializer and return the materialized values of the flow.
		 
		 Prefer the method taking an ActorSystem unless you have special requirements.
		- #### mapMaterializedValue
		
		
		
		```
		public abstract <Mat2> [RunnableGraph](RunnableGraph.html "class in akka.stream.javadsl")<Mat2> mapMaterializedValue​([Function](../../japi/function/Function.html "interface in akka.japi.function")<[Mat](RunnableGraph.html "type parameter in RunnableGraph"),​Mat2> f)
		```
		
		Transform only the materialized value of this RunnableGraph, leaving all other properties as they were.
		- #### withAttributes
		
		
		
		```
		public abstract [RunnableGraph](RunnableGraph.html "class in akka.stream.javadsl")<[Mat](RunnableGraph.html "type parameter in RunnableGraph")> withAttributes​([Attributes](../Attributes.html "class in akka.stream") attr)
		```
		
		Description copied from interface: `[Graph](../Graph.html#withAttributes(akka.stream.Attributes))`
		Replace the attributes of this `Flow` with the given ones. If this Flow is a composite
		 of multiple graphs, new attributes on the composite will be less specific than attributes
		 set directly on the individual graphs of the composite.
		
		Specified by:
		`[withAttributes](../Graph.html#withAttributes(akka.stream.Attributes))` in interface `[Graph](../Graph.html "interface in akka.stream")<[ClosedShape](../ClosedShape.html "class in akka.stream"),​[Mat](RunnableGraph.html "type parameter in RunnableGraph")>`
		- #### addAttributes
		
		
		
		```
		public [RunnableGraph](RunnableGraph.html "class in akka.stream.javadsl")<[Mat](RunnableGraph.html "type parameter in RunnableGraph")> addAttributes​([Attributes](../Attributes.html "class in akka.stream") attr)
		```
		
		Description copied from interface: `[Graph](../Graph.html#addAttributes(akka.stream.Attributes))`
		Add the given attributes to this [`Graph`](../Graph.html "interface in akka.stream"). If the specific attribute was already present
		 on this graph this means the added attribute will be more specific than the existing one.
		 If this Source is a composite of multiple graphs, new attributes on the composite will be
		 less specific than attributes set directly on the individual graphs of the composite.
		
		Specified by:
		`[addAttributes](../Graph.html#addAttributes(akka.stream.Attributes))` in interface `[Graph](../Graph.html "interface in akka.stream")<[ClosedShape](../ClosedShape.html "class in akka.stream"),​[Mat](RunnableGraph.html "type parameter in RunnableGraph")>`
		- #### named
		
		
		
		```
		public [RunnableGraph](RunnableGraph.html "class in akka.stream.javadsl")<[Mat](RunnableGraph.html "type parameter in RunnableGraph")> named​(java.lang.String name)
		```
		
		Description copied from interface: `[Graph](../Graph.html#named(java.lang.String))`
		Specifies the name of the Graph.
		 If the name is null or empty the name is ignored, i.e. `#none` is returned.
		
		Specified by:
		`[named](../Graph.html#named(java.lang.String))` in interface `[Graph](../Graph.html "interface in akka.stream")<[ClosedShape](../ClosedShape.html "class in akka.stream"),​[Mat](RunnableGraph.html "type parameter in RunnableGraph")>`
		- #### asScala
		
		
		
		```
		public abstract [RunnableGraph](../scaladsl/RunnableGraph.html "class in akka.stream.scaladsl")<[Mat](RunnableGraph.html "type parameter in RunnableGraph")> asScala()
		```
		
		Converts this Java DSL element to its Scala DSL counterpart.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ClassicActorSystemProvider.html
- https://doc.akka.io/japi/akka-core/2.10/akka/japi/function/Function.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/Attributes.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/ClosedShape.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/Graph.GraphMapMatVal.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/Graph.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/Materializer.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/Shape.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/RunnableGraph.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/scaladsl/RunnableGraph.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/RunnableGraph.html](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/RunnableGraph.html)*