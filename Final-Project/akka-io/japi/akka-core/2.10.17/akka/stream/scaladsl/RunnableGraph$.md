---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:54:43Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/scaladsl/RunnableGraph$.html
title: RunnableGraph$
---

# RunnableGraph$

## Content

Package [akka.stream.scaladsl](package-summary.html)
## Class RunnableGraph$

- java.lang.Object
- - akka.stream.scaladsl.RunnableGraph$

- All Implemented Interfaces:
`java.io.Serializable`

---

```
public class RunnableGraph$
extends java.lang.Object
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../serialized-form.html#akka.stream.scaladsl.RunnableGraph$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [RunnableGraph$](RunnableGraph$.html "class in akka.stream.scaladsl")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[RunnableGraph$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<Mat> [RunnableGraph](RunnableGraph.html "class in akka.stream.scaladsl")<Mat>` | `[apply](#apply(akka.stream.impl.TraversalBuilder))​(akka.stream.impl.TraversalBuilder traversalBuilder)` | Flow with attached input and output, can be executed. |
	| `<Mat> [RunnableGraph](RunnableGraph.html "class in akka.stream.scaladsl")<Mat>` | `[fromGraph](#fromGraph(akka.stream.Graph))​([Graph](../Graph.html "interface in akka.stream")<[ClosedShape](../ClosedShape.html "class in akka.stream"),​Mat> g)` | A graph with a closed shape is logically a runnable graph, this method makes  it so also in type. |
	| `<Mat> scala.Option<akka.stream.impl.TraversalBuilder>` | `[unapply](#unapply(akka.stream.scaladsl.RunnableGraph))​([RunnableGraph](RunnableGraph.html "class in akka.stream.scaladsl")<Mat> x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [RunnableGraph$](RunnableGraph$.html "class in akka.stream.scaladsl") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### RunnableGraph$
		
		
		
		```
		public RunnableGraph$()
		```

	- ### Method Detail
	
	
	
		- #### fromGraph
		
		
		
		```
		public <Mat> [RunnableGraph](RunnableGraph.html "class in akka.stream.scaladsl")<Mat> fromGraph​([Graph](../Graph.html "interface in akka.stream")<[ClosedShape](../ClosedShape.html "class in akka.stream"),​Mat> g)
		```
		
		A graph with a closed shape is logically a runnable graph, this method makes
		 it so also in type.
		- #### apply
		
		
		
		```
		public <Mat> [RunnableGraph](RunnableGraph.html "class in akka.stream.scaladsl")<Mat> apply​(akka.stream.impl.TraversalBuilder traversalBuilder)
		```
		
		Flow with attached input and output, can be executed.
		- #### unapply
		
		
		
		```
		public <Mat> scala.Option<akka.stream.impl.TraversalBuilder> unapply​([RunnableGraph](RunnableGraph.html "class in akka.stream.scaladsl")<Mat> x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/ClosedShape.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/Graph.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/scaladsl/RunnableGraph$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/scaladsl/RunnableGraph.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/scaladsl/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/scaladsl/RunnableGraph$.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/scaladsl/RunnableGraph$.html)*