---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:44:39Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/stream/javadsl/GraphDSL.Builder.html
title: GraphDSL.Builder
---

# GraphDSL.Builder

## Content

Package [akka.stream.javadsl](package-summary.html)
## Class GraphDSL.Builder\<Mat\>

- java.lang.Object
- - akka.stream.javadsl.GraphDSL.Builder\<Mat\>

- Enclosing class:
[GraphDSL](GraphDSL.html "class in akka.stream.javadsl")

---

```
public static final class GraphDSL.Builder<Mat>
extends java.lang.Object
```

- - ### Nested Class Summary
	
	
	
	Nested Classes 
	| Modifier and Type | Class | Description |
	| `class` | `[GraphDSL.Builder.ForwardOps](GraphDSL.Builder.ForwardOps.html "class in akka.stream.javadsl")<[T](GraphDSL.Builder.ForwardOps.html "type parameter in GraphDSL.Builder.ForwardOps")>` |  |
	| `class` | `[GraphDSL.Builder.ReverseOps](GraphDSL.Builder.ReverseOps.html "class in akka.stream.javadsl")<[T](GraphDSL.Builder.ReverseOps.html "type parameter in GraphDSL.Builder.ReverseOps")>` |  |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Builder](#%3Cinit%3E(akka.stream.scaladsl.GraphDSL.Builder))​(akka.stream.scaladsl.GraphDSL.Builder<[Mat](GraphDSL.Builder.html "type parameter in GraphDSL.Builder")> delegate)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<S extends [Shape](../Shape.html "class in akka.stream")>S` | `[add](#add(akka.stream.Graph))​([Graph](../Graph.html "interface in akka.stream")<S,​?> graph)` | Import a graph into this module, performing a deep copy, discarding its  materialized value and returning the copied Ports that are now to be  connected. |
	| `<I,​O>[GraphDSL.Builder.ForwardOps](GraphDSL.Builder.ForwardOps.html "class in akka.stream.javadsl")<O>` | `[from](#from(akka.stream.FlowShape))​([FlowShape](../FlowShape.html "class in akka.stream")<I,​O> f)` |  |
	| `<T> [GraphDSL.Builder.ForwardOps](GraphDSL.Builder.ForwardOps.html "class in akka.stream.javadsl")<T>` | `[from](#from(akka.stream.Outlet))​([Outlet](../Outlet.html "class in akka.stream")<T> out)` |  |
	| `<T> [GraphDSL.Builder.ForwardOps](GraphDSL.Builder.ForwardOps.html "class in akka.stream.javadsl")<T>` | `[from](#from(akka.stream.SourceShape))​([SourceShape](../SourceShape.html "class in akka.stream")<T> src)` |  |
	| `<I,​O>[GraphDSL.Builder.ForwardOps](GraphDSL.Builder.ForwardOps.html "class in akka.stream.javadsl")<O>` | `[from](#from(akka.stream.UniformFanInShape))​([UniformFanInShape](../UniformFanInShape.html "class in akka.stream")<I,​O> j)` |  |
	| `<I,​O>[GraphDSL.Builder.ForwardOps](GraphDSL.Builder.ForwardOps.html "class in akka.stream.javadsl")<O>` | `[from](#from(akka.stream.UniformFanOutShape))​([UniformFanOutShape](../UniformFanOutShape.html "class in akka.stream")<I,​O> j)` |  |
	| `[Outlet](../Outlet.html "class in akka.stream")<[Mat](GraphDSL.Builder.html "type parameter in GraphDSL.Builder")>` | `[materializedValue](#materializedValue())()` | Returns an `Outlet` that gives access to the materialized value of this graph. |
	| `<I,​O>[GraphDSL.Builder.ReverseOps](GraphDSL.Builder.ReverseOps.html "class in akka.stream.javadsl")<I>` | `[to](#to(akka.stream.FlowShape))​([FlowShape](../FlowShape.html "class in akka.stream")<I,​O> f)` |  |
	| `<T> [GraphDSL.Builder.ReverseOps](GraphDSL.Builder.ReverseOps.html "class in akka.stream.javadsl")<T>` | `[to](#to(akka.stream.Inlet))​([Inlet](../Inlet.html "class in akka.stream")<T> in)` |  |
	| `<T> [GraphDSL.Builder.ReverseOps](GraphDSL.Builder.ReverseOps.html "class in akka.stream.javadsl")<T>` | `[to](#to(akka.stream.SinkShape))​([SinkShape](../SinkShape.html "class in akka.stream")<T> dst)` |  |
	| `<I,​O>[GraphDSL.Builder.ReverseOps](GraphDSL.Builder.ReverseOps.html "class in akka.stream.javadsl")<I>` | `[to](#to(akka.stream.UniformFanInShape))​([UniformFanInShape](../UniformFanInShape.html "class in akka.stream")<I,​O> j)` |  |
	| `<I,​O>[GraphDSL.Builder.ReverseOps](GraphDSL.Builder.ReverseOps.html "class in akka.stream.javadsl")<I>` | `[to](#to(akka.stream.UniformFanOutShape))​([UniformFanOutShape](../UniformFanOutShape.html "class in akka.stream")<I,​O> j)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### Builder
		
		
		
		```
		public Builder​(akka.stream.scaladsl.GraphDSL.Builder<[Mat](GraphDSL.Builder.html "type parameter in GraphDSL.Builder")> delegate)
		```

	- ### Method Detail
	
	
	
		- #### add
		
		
		
		```
		public <S extends [Shape](../Shape.html "class in akka.stream")> S add​([Graph](../Graph.html "interface in akka.stream")<S,​?> graph)
		```
		
		Import a graph into this module, performing a deep copy, discarding its
		 materialized value and returning the copied Ports that are now to be
		 connected.
		- #### from
		
		
		
		```
		public <T> [GraphDSL.Builder.ForwardOps](GraphDSL.Builder.ForwardOps.html "class in akka.stream.javadsl")<T> from​([Outlet](../Outlet.html "class in akka.stream")<T> out)
		```
		- #### from
		
		
		
		```
		public <T> [GraphDSL.Builder.ForwardOps](GraphDSL.Builder.ForwardOps.html "class in akka.stream.javadsl")<T> from​([SourceShape](../SourceShape.html "class in akka.stream")<T> src)
		```
		- #### from
		
		
		
		```
		public <I,​O> [GraphDSL.Builder.ForwardOps](GraphDSL.Builder.ForwardOps.html "class in akka.stream.javadsl")<O> from​([FlowShape](../FlowShape.html "class in akka.stream")<I,​O> f)
		```
		- #### from
		
		
		
		```
		public <I,​O> [GraphDSL.Builder.ForwardOps](GraphDSL.Builder.ForwardOps.html "class in akka.stream.javadsl")<O> from​([UniformFanInShape](../UniformFanInShape.html "class in akka.stream")<I,​O> j)
		```
		- #### from
		
		
		
		```
		public <I,​O> [GraphDSL.Builder.ForwardOps](GraphDSL.Builder.ForwardOps.html "class in akka.stream.javadsl")<O> from​([UniformFanOutShape](../UniformFanOutShape.html "class in akka.stream")<I,​O> j)
		```
		- #### materializedValue
		
		
		
		```
		public [Outlet](../Outlet.html "class in akka.stream")<[Mat](GraphDSL.Builder.html "type parameter in GraphDSL.Builder")> materializedValue()
		```
		
		Returns an `Outlet` that gives access to the materialized value of this graph. Once the graph is materialized
		 this outlet will emit exactly one element which is the materialized value. It is possible to expose this
		 outlet as an externally accessible outlet of a [`Source`](Source.html "class in akka.stream.javadsl"), [`Sink`](Sink.html "class in akka.stream.javadsl"), [`Flow`](Flow.html "class in akka.stream.javadsl") or [`BidiFlow`](BidiFlow.html "class in akka.stream.javadsl").
		 
		 It is possible to call this method multiple times to get multiple `Outlet` instances if necessary. All of
		 the outlets will emit the materialized value.
		 
		
		
		 Be careful to not to feed the result of this outlet to a operator that produces the materialized value itself (for
		 example to a [`Sink.fold(U, akka.japi.function.Function2<U, In, U>)`](Sink.html#fold(U,akka.japi.function.Function2)) that contributes to the materialized value) since that might lead to an unresolvable
		 dependency cycle.
		 
		
		
		
		Returns:
		The outlet that will emit the materialized value.
		- #### to
		
		
		
		```
		public <T> [GraphDSL.Builder.ReverseOps](GraphDSL.Builder.ReverseOps.html "class in akka.stream.javadsl")<T> to​([Inlet](../Inlet.html "class in akka.stream")<T> in)
		```
		- #### to
		
		
		
		```
		public <T> [GraphDSL.Builder.ReverseOps](GraphDSL.Builder.ReverseOps.html "class in akka.stream.javadsl")<T> to​([SinkShape](../SinkShape.html "class in akka.stream")<T> dst)
		```
		- #### to
		
		
		
		```
		public <I,​O> [GraphDSL.Builder.ReverseOps](GraphDSL.Builder.ReverseOps.html "class in akka.stream.javadsl")<I> to​([FlowShape](../FlowShape.html "class in akka.stream")<I,​O> f)
		```
		- #### to
		
		
		
		```
		public <I,​O> [GraphDSL.Builder.ReverseOps](GraphDSL.Builder.ReverseOps.html "class in akka.stream.javadsl")<I> to​([UniformFanInShape](../UniformFanInShape.html "class in akka.stream")<I,​O> j)
		```
		- #### to
		
		
		
		```
		public <I,​O> [GraphDSL.Builder.ReverseOps](GraphDSL.Builder.ReverseOps.html "class in akka.stream.javadsl")<I> to​([UniformFanOutShape](../UniformFanOutShape.html "class in akka.stream")<I,​O> j)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/stream/FlowShape.html
- https://doc.akka.io/japi/akka/current/akka/stream/Graph.html
- https://doc.akka.io/japi/akka/current/akka/stream/Inlet.html
- https://doc.akka.io/japi/akka/current/akka/stream/Outlet.html
- https://doc.akka.io/japi/akka/current/akka/stream/Shape.html
- https://doc.akka.io/japi/akka/current/akka/stream/SinkShape.html
- https://doc.akka.io/japi/akka/current/akka/stream/SourceShape.html
- https://doc.akka.io/japi/akka/current/akka/stream/UniformFanInShape.html
- https://doc.akka.io/japi/akka/current/akka/stream/UniformFanOutShape.html
- https://doc.akka.io/japi/akka/current/akka/stream/javadsl/BidiFlow.html
- https://doc.akka.io/japi/akka/current/akka/stream/javadsl/Flow.html
- https://doc.akka.io/japi/akka/current/akka/stream/javadsl/GraphDSL.Builder.ForwardOps.html
- https://doc.akka.io/japi/akka/current/akka/stream/javadsl/GraphDSL.Builder.ReverseOps.html
- https://doc.akka.io/japi/akka/current/akka/stream/javadsl/GraphDSL.Builder.html
- https://doc.akka.io/japi/akka/current/akka/stream/javadsl/GraphDSL.html
- https://doc.akka.io/japi/akka/current/akka/stream/javadsl/Sink.html
- https://doc.akka.io/japi/akka/current/akka/stream/javadsl/Source.html
- https://doc.akka.io/japi/akka/current/akka/stream/javadsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/stream/javadsl/GraphDSL.Builder.html](https://doc.akka.io/japi/akka/current/akka/stream/javadsl/GraphDSL.Builder.html)*