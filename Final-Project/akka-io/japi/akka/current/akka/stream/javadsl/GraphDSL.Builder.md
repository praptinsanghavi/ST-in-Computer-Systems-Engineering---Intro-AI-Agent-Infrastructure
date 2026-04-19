---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:44:26Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/stream/javadsl/GraphDSL.Builder.ReverseOps.html
title: GraphDSL.Builder.ReverseOps
---

# GraphDSL.Builder.ReverseOps

## Content

Package [akka.stream.javadsl](package-summary.html)
## Class GraphDSL.Builder.ReverseOps\<T\>

- java.lang.Object
- - akka.stream.javadsl.GraphDSL.Builder.ReverseOps\<T\>

- Enclosing class:
[GraphDSL.Builder](GraphDSL.Builder.html "class in akka.stream.javadsl")\<[Mat](GraphDSL.Builder.html "type parameter in GraphDSL.Builder")\>

---

```
public final class GraphDSL.Builder.ReverseOps<T>
extends java.lang.Object
```

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ReverseOps](#%3Cinit%3E(akka.stream.Inlet))​([Inlet](../Inlet.html "class in akka.stream")<[T](GraphDSL.Builder.ReverseOps.html "type parameter in GraphDSL.Builder.ReverseOps")> out)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[GraphDSL.Builder](GraphDSL.Builder.html "class in akka.stream.javadsl")<[Mat](GraphDSL.Builder.html "type parameter in GraphDSL.Builder")>` | `[from](#from(akka.stream.SourceShape))​([SourceShape](../SourceShape.html "class in akka.stream")<? extends [T](GraphDSL.Builder.ReverseOps.html "type parameter in GraphDSL.Builder.ReverseOps")> dst)` |  |
	| `<U> [GraphDSL.Builder](GraphDSL.Builder.html "class in akka.stream.javadsl")<[Mat](GraphDSL.Builder.html "type parameter in GraphDSL.Builder")>` | `[fromFanIn](#fromFanIn(akka.stream.UniformFanInShape))​([UniformFanInShape](../UniformFanInShape.html "class in akka.stream")<U,​? extends [T](GraphDSL.Builder.ReverseOps.html "type parameter in GraphDSL.Builder.ReverseOps")> j)` |  |
	| `<U> [GraphDSL.Builder](GraphDSL.Builder.html "class in akka.stream.javadsl")<[Mat](GraphDSL.Builder.html "type parameter in GraphDSL.Builder")>` | `[fromFanOut](#fromFanOut(akka.stream.UniformFanOutShape))​([UniformFanOutShape](../UniformFanOutShape.html "class in akka.stream")<U,​? extends [T](GraphDSL.Builder.ReverseOps.html "type parameter in GraphDSL.Builder.ReverseOps")> j)` |  |
	| `[GraphDSL.Builder](GraphDSL.Builder.html "class in akka.stream.javadsl")<[Mat](GraphDSL.Builder.html "type parameter in GraphDSL.Builder")>` | `[fromOutlet](#fromOutlet(akka.stream.Outlet))​([Outlet](../Outlet.html "class in akka.stream")<? extends [T](GraphDSL.Builder.ReverseOps.html "type parameter in GraphDSL.Builder.ReverseOps")> dst)` |  |
	| `<U> [GraphDSL.Builder.ReverseOps](GraphDSL.Builder.ReverseOps.html "class in akka.stream.javadsl")<U>` | `[via](#via(akka.stream.FlowShape))​([FlowShape](../FlowShape.html "class in akka.stream")<U,​? extends [T](GraphDSL.Builder.ReverseOps.html "type parameter in GraphDSL.Builder.ReverseOps")> f)` |  |
	| `<U> [GraphDSL.Builder.ReverseOps](GraphDSL.Builder.ReverseOps.html "class in akka.stream.javadsl")<U>` | `[viaFanIn](#viaFanIn(akka.stream.UniformFanInShape))​([UniformFanInShape](../UniformFanInShape.html "class in akka.stream")<U,​? extends [T](GraphDSL.Builder.ReverseOps.html "type parameter in GraphDSL.Builder.ReverseOps")> j)` |  |
	| `<U> [GraphDSL.Builder.ReverseOps](GraphDSL.Builder.ReverseOps.html "class in akka.stream.javadsl")<U>` | `[viaFanOut](#viaFanOut(akka.stream.UniformFanOutShape))​([UniformFanOutShape](../UniformFanOutShape.html "class in akka.stream")<U,​? extends [T](GraphDSL.Builder.ReverseOps.html "type parameter in GraphDSL.Builder.ReverseOps")> j)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### ReverseOps
		
		
		
		```
		public ReverseOps​([Inlet](../Inlet.html "class in akka.stream")<[T](GraphDSL.Builder.ReverseOps.html "type parameter in GraphDSL.Builder.ReverseOps")> out)
		```

	- ### Method Detail
	
	
	
		- #### from
		
		
		
		```
		public [GraphDSL.Builder](GraphDSL.Builder.html "class in akka.stream.javadsl")<[Mat](GraphDSL.Builder.html "type parameter in GraphDSL.Builder")> from​([SourceShape](../SourceShape.html "class in akka.stream")<? extends [T](GraphDSL.Builder.ReverseOps.html "type parameter in GraphDSL.Builder.ReverseOps")> dst)
		```
		- #### fromFanIn
		
		
		
		```
		public <U> [GraphDSL.Builder](GraphDSL.Builder.html "class in akka.stream.javadsl")<[Mat](GraphDSL.Builder.html "type parameter in GraphDSL.Builder")> fromFanIn​([UniformFanInShape](../UniformFanInShape.html "class in akka.stream")<U,​? extends [T](GraphDSL.Builder.ReverseOps.html "type parameter in GraphDSL.Builder.ReverseOps")> j)
		```
		- #### fromFanOut
		
		
		
		```
		public <U> [GraphDSL.Builder](GraphDSL.Builder.html "class in akka.stream.javadsl")<[Mat](GraphDSL.Builder.html "type parameter in GraphDSL.Builder")> fromFanOut​([UniformFanOutShape](../UniformFanOutShape.html "class in akka.stream")<U,​? extends [T](GraphDSL.Builder.ReverseOps.html "type parameter in GraphDSL.Builder.ReverseOps")> j)
		```
		- #### fromOutlet
		
		
		
		```
		public [GraphDSL.Builder](GraphDSL.Builder.html "class in akka.stream.javadsl")<[Mat](GraphDSL.Builder.html "type parameter in GraphDSL.Builder")> fromOutlet​([Outlet](../Outlet.html "class in akka.stream")<? extends [T](GraphDSL.Builder.ReverseOps.html "type parameter in GraphDSL.Builder.ReverseOps")> dst)
		```
		- #### via
		
		
		
		```
		public <U> [GraphDSL.Builder.ReverseOps](GraphDSL.Builder.ReverseOps.html "class in akka.stream.javadsl")<U> via​([FlowShape](../FlowShape.html "class in akka.stream")<U,​? extends [T](GraphDSL.Builder.ReverseOps.html "type parameter in GraphDSL.Builder.ReverseOps")> f)
		```
		- #### viaFanIn
		
		
		
		```
		public <U> [GraphDSL.Builder.ReverseOps](GraphDSL.Builder.ReverseOps.html "class in akka.stream.javadsl")<U> viaFanIn​([UniformFanInShape](../UniformFanInShape.html "class in akka.stream")<U,​? extends [T](GraphDSL.Builder.ReverseOps.html "type parameter in GraphDSL.Builder.ReverseOps")> j)
		```
		- #### viaFanOut
		
		
		
		```
		public <U> [GraphDSL.Builder.ReverseOps](GraphDSL.Builder.ReverseOps.html "class in akka.stream.javadsl")<U> viaFanOut​([UniformFanOutShape](../UniformFanOutShape.html "class in akka.stream")<U,​? extends [T](GraphDSL.Builder.ReverseOps.html "type parameter in GraphDSL.Builder.ReverseOps")> j)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/stream/FlowShape.html
- https://doc.akka.io/japi/akka/current/akka/stream/Inlet.html
- https://doc.akka.io/japi/akka/current/akka/stream/Outlet.html
- https://doc.akka.io/japi/akka/current/akka/stream/SourceShape.html
- https://doc.akka.io/japi/akka/current/akka/stream/UniformFanInShape.html
- https://doc.akka.io/japi/akka/current/akka/stream/UniformFanOutShape.html
- https://doc.akka.io/japi/akka/current/akka/stream/javadsl/GraphDSL.Builder.ReverseOps.html
- https://doc.akka.io/japi/akka/current/akka/stream/javadsl/GraphDSL.Builder.html
- https://doc.akka.io/japi/akka/current/akka/stream/javadsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/stream/javadsl/GraphDSL.Builder.ReverseOps.html](https://doc.akka.io/japi/akka/current/akka/stream/javadsl/GraphDSL.Builder.ReverseOps.html)*