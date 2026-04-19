---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:54:44Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/scaladsl/RunnableGraph.html
title: RunnableGraph
---

# RunnableGraph

## Content

Package [akka.stream.scaladsl](package-summary.html)
## Class RunnableGraph\<Mat\>

- java.lang.Object
- - akka.stream.scaladsl.RunnableGraph\<Mat\>

- All Implemented Interfaces:
`[Graph](../Graph.html "interface in akka.stream")<[ClosedShape](../ClosedShape.html "class in akka.stream"),​Mat>`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class RunnableGraph<Mat>
extends java.lang.Object
implements [Graph](../Graph.html "interface in akka.stream")<[ClosedShape](../ClosedShape.html "class in akka.stream"),​Mat>, scala.Product, java.io.Serializable
```

See Also:
[Serialized Form](../../../serialized-form.html#akka.stream.scaladsl.RunnableGraph)

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface akka.stream.[Graph](../Graph.html "interface in akka.stream")
		
		
		`[Graph.GraphMapMatVal](../Graph.GraphMapMatVal.html "class in akka.stream")<[S](../Graph.GraphMapMatVal.html "type parameter in Graph.GraphMapMatVal") extends [Shape](../Shape.html "class in akka.stream"),​[M](../Graph.GraphMapMatVal.html "type parameter in Graph.GraphMapMatVal")>`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[RunnableGraph](#%3Cinit%3E(akka.stream.impl.TraversalBuilder))​(akka.stream.impl.TraversalBuilder traversalBuilder)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[RunnableGraph](RunnableGraph.html "class in akka.stream.scaladsl")<[Mat](RunnableGraph.html "type parameter in RunnableGraph")>` | `[addAttributes](#addAttributes(akka.stream.Attributes))​([Attributes](../Attributes.html "class in akka.stream") attr)` | Add the given attributes to this [`Graph`](../Graph.html "interface in akka.stream"). |
	| `static <Mat> [RunnableGraph](RunnableGraph.html "class in akka.stream.scaladsl")<Mat>` | `[apply](#apply(akka.stream.impl.TraversalBuilder))​(akka.stream.impl.TraversalBuilder traversalBuilder)` | Flow with attached input and output, can be executed. |
	| `[RunnableGraph](../javadsl/RunnableGraph.html "class in akka.stream.javadsl")<[Mat](RunnableGraph.html "type parameter in RunnableGraph")>` | `[asJava](#asJava())()` | Converts this Scala DSL element to it's Java DSL counterpart. |
	| `[RunnableGraph](RunnableGraph.html "class in akka.stream.scaladsl")<[Mat](RunnableGraph.html "type parameter in RunnableGraph")>` | `[async](#async())()` | Note that an async boundary around a runnable graph does not make sense |
	| `[RunnableGraph](RunnableGraph.html "class in akka.stream.scaladsl")<[Mat](RunnableGraph.html "type parameter in RunnableGraph")>` | `[async](#async(java.lang.String))​(java.lang.String dispatcher)` | Note that an async boundary around a runnable graph does not make sense |
	| `[RunnableGraph](RunnableGraph.html "class in akka.stream.scaladsl")<[Mat](RunnableGraph.html "type parameter in RunnableGraph")>` | `[async](#async(java.lang.String,int))​(java.lang.String dispatcher,  int inputBufferSize)` | Note that an async boundary around a runnable graph does not make sense |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `<Mat> [RunnableGraph](RunnableGraph.html "class in akka.stream.scaladsl")<Mat>` | `[copy](#copy(akka.stream.impl.TraversalBuilder))​(akka.stream.impl.TraversalBuilder traversalBuilder)` |  |
	| `<Mat> akka.stream.impl.TraversalBuilder` | `[copy$default$1](#copy$default$1())()` |  |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `static <Mat> [RunnableGraph](RunnableGraph.html "class in akka.stream.scaladsl")<Mat>` | `[fromGraph](#fromGraph(akka.stream.Graph))​([Graph](../Graph.html "interface in akka.stream")<[ClosedShape](../ClosedShape.html "class in akka.stream"),​Mat> g)` | A graph with a closed shape is logically a runnable graph, this method makes  it so also in type. |
	| `[Attributes](../Attributes.html "class in akka.stream")` | `[getAttributes](#getAttributes())()` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `<Mat2> [RunnableGraph](RunnableGraph.html "class in akka.stream.scaladsl")<Mat2>` | `[mapMaterializedValue](#mapMaterializedValue(scala.Function1))​(scala.Function1<[Mat](RunnableGraph.html "type parameter in RunnableGraph"),​Mat2> f)` | Transform only the materialized value of this RunnableGraph, leaving all other properties as they were. |
	| `[RunnableGraph](RunnableGraph.html "class in akka.stream.scaladsl")<[Mat](RunnableGraph.html "type parameter in RunnableGraph")>` | `[named](#named(java.lang.String))​(java.lang.String name)` | Specifies the name of the Graph. |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `java.lang.String` | `[productElementName](#productElementName(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `[Mat](RunnableGraph.html "type parameter in RunnableGraph")` | `[run](#run(akka.stream.Materializer))​([Materializer](../Materializer.html "class in akka.stream") materializer)` | Run this flow and return the materialized instance from the flow. |
	| `[ClosedShape$](../ClosedShape$.html "class in akka.stream")` | `[shape](#shape())()` | The shape of a graph is all that is externally visible: its inlets and outlets. |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `akka.stream.impl.TraversalBuilder` | `[traversalBuilder](#traversalBuilder())()` | INTERNAL API. |
	| `static <Mat> scala.Option<akka.stream.impl.TraversalBuilder>` | `[unapply](#unapply(akka.stream.scaladsl.RunnableGraph))​([RunnableGraph](RunnableGraph.html "class in akka.stream.scaladsl")<Mat> x$0)` |  |
	| `[RunnableGraph](RunnableGraph.html "class in akka.stream.scaladsl")<[Mat](RunnableGraph.html "type parameter in RunnableGraph")>` | `[withAttributes](#withAttributes(akka.stream.Attributes))​([Attributes](../Attributes.html "class in akka.stream") attr)` | Replace the attributes of this `Flow` with the given ones. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementNames`

- - ### Constructor Detail
	
	
	
		- #### RunnableGraph
		
		
		
		```
		public RunnableGraph​(akka.stream.impl.TraversalBuilder traversalBuilder)
		```

	- ### Method Detail
	
	
	
		- #### fromGraph
		
		
		
		```
		public static <Mat> [RunnableGraph](RunnableGraph.html "class in akka.stream.scaladsl")<Mat> fromGraph​([Graph](../Graph.html "interface in akka.stream")<[ClosedShape](../ClosedShape.html "class in akka.stream"),​Mat> g)
		```
		
		A graph with a closed shape is logically a runnable graph, this method makes
		 it so also in type.
		- #### apply
		
		
		
		```
		public static <Mat> [RunnableGraph](RunnableGraph.html "class in akka.stream.scaladsl")<Mat> apply​(akka.stream.impl.TraversalBuilder traversalBuilder)
		```
		
		Flow with attached input and output, can be executed.
		- #### unapply
		
		
		
		```
		public static <Mat> scala.Option<akka.stream.impl.TraversalBuilder> unapply​([RunnableGraph](RunnableGraph.html "class in akka.stream.scaladsl")<Mat> x$0)
		```
		- #### traversalBuilder
		
		
		
		```
		public akka.stream.impl.TraversalBuilder traversalBuilder()
		```
		
		Description copied from interface: `[Graph](../Graph.html#traversalBuilder())`
		INTERNAL API.
		 
		 Every materializable element must be backed by a stream layout module
		
		
		
		Specified by:
		`[traversalBuilder](../Graph.html#traversalBuilder())` in interface `[Graph](../Graph.html "interface in akka.stream")<[ClosedShape](../ClosedShape.html "class in akka.stream"),​[Mat](RunnableGraph.html "type parameter in RunnableGraph")>`
		- #### shape
		
		
		
		```
		public [ClosedShape$](../ClosedShape$.html "class in akka.stream") shape()
		```
		
		Description copied from interface: `[Graph](../Graph.html#shape())`
		The shape of a graph is all that is externally visible: its inlets and outlets.
		
		Specified by:
		`[shape](../Graph.html#shape())` in interface `[Graph](../Graph.html "interface in akka.stream")<[ClosedShape](../ClosedShape.html "class in akka.stream"),​[Mat](RunnableGraph.html "type parameter in RunnableGraph")>`
		- #### mapMaterializedValue
		
		
		
		```
		public <Mat2> [RunnableGraph](RunnableGraph.html "class in akka.stream.scaladsl")<Mat2> mapMaterializedValue​(scala.Function1<[Mat](RunnableGraph.html "type parameter in RunnableGraph"),​Mat2> f)
		```
		
		Transform only the materialized value of this RunnableGraph, leaving all other properties as they were.
		- #### run
		
		
		
		```
		public [Mat](RunnableGraph.html "type parameter in RunnableGraph") run​([Materializer](../Materializer.html "class in akka.stream") materializer)
		```
		
		Run this flow and return the materialized instance from the flow.
		 
		 Note that the `ActorSystem` can be used as the implicit `materializer` parameter to use the
		 [`SystemMaterializer`](../SystemMaterializer.html "class in akka.stream") for running the stream.
		- #### addAttributes
		
		
		
		```
		public [RunnableGraph](RunnableGraph.html "class in akka.stream.scaladsl")<[Mat](RunnableGraph.html "type parameter in RunnableGraph")> addAttributes​([Attributes](../Attributes.html "class in akka.stream") attr)
		```
		
		Description copied from interface: `[Graph](../Graph.html#addAttributes(akka.stream.Attributes))`
		Add the given attributes to this [`Graph`](../Graph.html "interface in akka.stream"). If the specific attribute was already present
		 on this graph this means the added attribute will be more specific than the existing one.
		 If this Source is a composite of multiple graphs, new attributes on the composite will be
		 less specific than attributes set directly on the individual graphs of the composite.
		
		Specified by:
		`[addAttributes](../Graph.html#addAttributes(akka.stream.Attributes))` in interface `[Graph](../Graph.html "interface in akka.stream")<[ClosedShape](../ClosedShape.html "class in akka.stream"),​[Mat](RunnableGraph.html "type parameter in RunnableGraph")>`
		- #### withAttributes
		
		
		
		```
		public [RunnableGraph](RunnableGraph.html "class in akka.stream.scaladsl")<[Mat](RunnableGraph.html "type parameter in RunnableGraph")> withAttributes​([Attributes](../Attributes.html "class in akka.stream") attr)
		```
		
		Description copied from interface: `[Graph](../Graph.html#withAttributes(akka.stream.Attributes))`
		Replace the attributes of this `Flow` with the given ones. If this Flow is a composite
		 of multiple graphs, new attributes on the composite will be less specific than attributes
		 set directly on the individual graphs of the composite.
		
		Specified by:
		`[withAttributes](../Graph.html#withAttributes(akka.stream.Attributes))` in interface `[Graph](../Graph.html "interface in akka.stream")<[ClosedShape](../ClosedShape.html "class in akka.stream"),​[Mat](RunnableGraph.html "type parameter in RunnableGraph")>`
		- #### named
		
		
		
		```
		public [RunnableGraph](RunnableGraph.html "class in akka.stream.scaladsl")<[Mat](RunnableGraph.html "type parameter in RunnableGraph")> named​(java.lang.String name)
		```
		
		Description copied from interface: `[Graph](../Graph.html#named(java.lang.String))`
		Specifies the name of the Graph.
		 If the name is null or empty the name is ignored, i.e. `#none` is returned.
		
		Specified by:
		`[named](../Graph.html#named(java.lang.String))` in interface `[Graph](../Graph.html "interface in akka.stream")<[ClosedShape](../ClosedShape.html "class in akka.stream"),​[Mat](RunnableGraph.html "type parameter in RunnableGraph")>`
		- #### async
		
		
		
		```
		public [RunnableGraph](RunnableGraph.html "class in akka.stream.scaladsl")<[Mat](RunnableGraph.html "type parameter in RunnableGraph")> async()
		```
		
		Note that an async boundary around a runnable graph does not make sense
		
		Specified by:
		`[async](../Graph.html#async())` in interface `[Graph](../Graph.html "interface in akka.stream")<[ClosedShape](../ClosedShape.html "class in akka.stream"),​[Mat](RunnableGraph.html "type parameter in RunnableGraph")>`
		- #### async
		
		
		
		```
		public [RunnableGraph](RunnableGraph.html "class in akka.stream.scaladsl")<[Mat](RunnableGraph.html "type parameter in RunnableGraph")> async​(java.lang.String dispatcher)
		```
		
		Note that an async boundary around a runnable graph does not make sense
		
		Specified by:
		`[async](../Graph.html#async(java.lang.String))` in interface `[Graph](../Graph.html "interface in akka.stream")<[ClosedShape](../ClosedShape.html "class in akka.stream"),​[Mat](RunnableGraph.html "type parameter in RunnableGraph")>`
		Parameters:
		`dispatcher` \- Run the graph on this dispatcher
		- #### async
		
		
		
		```
		public [RunnableGraph](RunnableGraph.html "class in akka.stream.scaladsl")<[Mat](RunnableGraph.html "type parameter in RunnableGraph")> async​(java.lang.String dispatcher,
		                                int inputBufferSize)
		```
		
		Note that an async boundary around a runnable graph does not make sense
		
		Specified by:
		`[async](../Graph.html#async(java.lang.String,int))` in interface `[Graph](../Graph.html "interface in akka.stream")<[ClosedShape](../ClosedShape.html "class in akka.stream"),​[Mat](RunnableGraph.html "type parameter in RunnableGraph")>`
		Parameters:
		`dispatcher` \- Run the graph on this dispatcher
		`inputBufferSize` \- Set the input buffer to this size for the graph
		- #### asJava
		
		
		
		```
		public [RunnableGraph](../javadsl/RunnableGraph.html "class in akka.stream.javadsl")<[Mat](RunnableGraph.html "type parameter in RunnableGraph")> asJava()
		```
		
		Converts this Scala DSL element to it's Java DSL counterpart.
		- #### getAttributes
		
		
		
		```
		public [Attributes](../Attributes.html "class in akka.stream") getAttributes()
		```
		
		
		Specified by:
		`[getAttributes](../Graph.html#getAttributes())` in interface `[Graph](../Graph.html "interface in akka.stream")<[ClosedShape](../ClosedShape.html "class in akka.stream"),​[Mat](RunnableGraph.html "type parameter in RunnableGraph")>`
		- #### copy
		
		
		
		```
		public <Mat> [RunnableGraph](RunnableGraph.html "class in akka.stream.scaladsl")<Mat> copy​(akka.stream.impl.TraversalBuilder traversalBuilder)
		```
		- #### copy$default$1
		
		
		
		```
		public <Mat> akka.stream.impl.TraversalBuilder copy$default$1()
		```
		- #### productPrefix
		
		
		
		```
		public java.lang.String productPrefix()
		```
		
		
		Specified by:
		`productPrefix` in interface `scala.Product`
		- #### productArity
		
		
		
		```
		public int productArity()
		```
		
		
		Specified by:
		`productArity` in interface `scala.Product`
		- #### productElement
		
		
		
		```
		public java.lang.Object productElement​(int x$1)
		```
		
		
		Specified by:
		`productElement` in interface `scala.Product`
		- #### productIterator
		
		
		
		```
		public scala.collection.Iterator<java.lang.Object> productIterator()
		```
		
		
		Specified by:
		`productIterator` in interface `scala.Product`
		- #### canEqual
		
		
		
		```
		public boolean canEqual​(java.lang.Object x$1)
		```
		
		
		Specified by:
		`canEqual` in interface `scala.Equals`
		- #### productElementName
		
		
		
		```
		public java.lang.String productElementName​(int x$1)
		```
		
		
		Specified by:
		`productElementName` in interface `scala.Product`
		- #### hashCode
		
		
		
		```
		public int hashCode()
		```
		
		
		Overrides:
		`hashCode` in class `java.lang.Object`
		- #### toString
		
		
		
		```
		public java.lang.String toString()
		```
		
		
		Overrides:
		`toString` in class `java.lang.Object`
		- #### equals
		
		
		
		```
		public boolean equals​(java.lang.Object x$1)
		```
		
		
		Specified by:
		`equals` in interface `scala.Equals`
		Overrides:
		`equals` in class `java.lang.Object`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/Attributes.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/ClosedShape$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/ClosedShape.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/Graph.GraphMapMatVal.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/Graph.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/Materializer.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/Shape.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/SystemMaterializer.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/javadsl/RunnableGraph.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/scaladsl/RunnableGraph.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/scaladsl/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/scaladsl/RunnableGraph.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/scaladsl/RunnableGraph.html)*