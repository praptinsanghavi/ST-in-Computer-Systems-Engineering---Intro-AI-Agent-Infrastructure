---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:01:23Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/2.10/akka/stream/javadsl/Concat$.html
title: Concat$
---

# Concat$

## Content

Package [akka.stream.javadsl](package-summary.html)
## Class Concat$

- java.lang.Object
- - akka.stream.javadsl.Concat$

- ---

```
public class Concat$
extends java.lang.Object
```

Takes two streams and outputs an output stream formed from the two input streams
 by consuming one stream first emitting all of its elements, then consuming the
 second stream emitting all of its elements.
 
 '''Emits when''' the current stream has an element available; if the current input completes, it tries the next one
 

 '''Backpressures when''' downstream backpressures
 

 '''Completes when''' all upstreams complete
 

 '''Cancels when''' downstream cancels

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Concat$](Concat$.html "class in akka.stream.javadsl")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Concat$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<T> [Graph](../Graph.html "interface in akka.stream")<[UniformFanInShape](../UniformFanInShape.html "class in akka.stream")<T,​T>,​[NotUsed](../../NotUsed.html "class in akka")>` | `[create](#create())()` | Create a new anonymous `Concat` operator with the specified input types. |
	| `<T> [Graph](../Graph.html "interface in akka.stream")<[UniformFanInShape](../UniformFanInShape.html "class in akka.stream")<T,​T>,​[NotUsed](../../NotUsed.html "class in akka")>` | `[create](#create(int))​(int inputCount)` | Create a new anonymous `Concat` operator with the specified input types. |
	| `<T> [Graph](../Graph.html "interface in akka.stream")<[UniformFanInShape](../UniformFanInShape.html "class in akka.stream")<T,​T>,​[NotUsed](../../NotUsed.html "class in akka")>` | `[create](#create(int,boolean))​(int inputCount,  boolean detachedInputs)` | Create a new anonymous `Concat` operator with the specified input types. |
	| `<T> [Graph](../Graph.html "interface in akka.stream")<[UniformFanInShape](../UniformFanInShape.html "class in akka.stream")<T,​T>,​[NotUsed](../../NotUsed.html "class in akka")>` | `[create](#create(java.lang.Class))​(java.lang.Class<T> clazz)` | Create a new anonymous `Concat` operator with the specified input types. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [Concat$](Concat$.html "class in akka.stream.javadsl") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Concat$
		
		
		
		```
		public Concat$()
		```

	- ### Method Detail
	
	
	
		- #### create
		
		
		
		```
		public <T> [Graph](../Graph.html "interface in akka.stream")<[UniformFanInShape](../UniformFanInShape.html "class in akka.stream")<T,​T>,​[NotUsed](../../NotUsed.html "class in akka")> create()
		```
		
		Create a new anonymous `Concat` operator with the specified input types.
		- #### create
		
		
		
		```
		public <T> [Graph](../Graph.html "interface in akka.stream")<[UniformFanInShape](../UniformFanInShape.html "class in akka.stream")<T,​T>,​[NotUsed](../../NotUsed.html "class in akka")> create​(int inputCount)
		```
		
		Create a new anonymous `Concat` operator with the specified input types.
		- #### create
		
		
		
		```
		public <T> [Graph](../Graph.html "interface in akka.stream")<[UniformFanInShape](../UniformFanInShape.html "class in akka.stream")<T,​T>,​[NotUsed](../../NotUsed.html "class in akka")> create​(int inputCount,
		                                                                    boolean detachedInputs)
		```
		
		Create a new anonymous `Concat` operator with the specified input types.
		- #### create
		
		
		
		```
		public <T> [Graph](../Graph.html "interface in akka.stream")<[UniformFanInShape](../UniformFanInShape.html "class in akka.stream")<T,​T>,​[NotUsed](../../NotUsed.html "class in akka")> create​(java.lang.Class<T> clazz)
		```
		
		Create a new anonymous `Concat` operator with the specified input types.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/2.10/akka/NotUsed.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/Graph.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/UniformFanInShape.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/javadsl/Concat$.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/javadsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/2.10/akka/stream/javadsl/Concat$.html](https://doc.akka.io/japi/akka/2.10/akka/stream/javadsl/Concat$.html)*