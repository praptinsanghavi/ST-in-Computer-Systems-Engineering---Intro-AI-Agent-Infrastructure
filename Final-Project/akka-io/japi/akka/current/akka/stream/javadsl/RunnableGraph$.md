---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:45:24Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/stream/javadsl/RunnableGraph$.html
title: RunnableGraph$
---

# RunnableGraph$

## Content

Package [akka.stream.javadsl](package-summary.html)
## Class RunnableGraph$

- java.lang.Object
- - akka.stream.javadsl.RunnableGraph$

- ---

```
public class RunnableGraph$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [RunnableGraph$](RunnableGraph$.html "class in akka.stream.javadsl")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[RunnableGraph$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<Mat> [RunnableGraph](RunnableGraph.html "class in akka.stream.javadsl")<Mat>` | `[fromGraph](#fromGraph(akka.stream.Graph))​([Graph](../Graph.html "interface in akka.stream")<[ClosedShape](../ClosedShape.html "class in akka.stream"),​Mat> graph)` | A graph with a closed shape is logically a runnable graph, this method makes  it so also in type. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [RunnableGraph$](RunnableGraph$.html "class in akka.stream.javadsl") MODULE$
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
		public <Mat> [RunnableGraph](RunnableGraph.html "class in akka.stream.javadsl")<Mat> fromGraph​([Graph](../Graph.html "interface in akka.stream")<[ClosedShape](../ClosedShape.html "class in akka.stream"),​Mat> graph)
		```
		
		A graph with a closed shape is logically a runnable graph, this method makes
		 it so also in type.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/stream/ClosedShape.html
- https://doc.akka.io/japi/akka/current/akka/stream/Graph.html
- https://doc.akka.io/japi/akka/current/akka/stream/javadsl/RunnableGraph$.html
- https://doc.akka.io/japi/akka/current/akka/stream/javadsl/RunnableGraph.html
- https://doc.akka.io/japi/akka/current/akka/stream/javadsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/stream/javadsl/RunnableGraph$.html](https://doc.akka.io/japi/akka/current/akka/stream/javadsl/RunnableGraph$.html)*