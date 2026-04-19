---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:44:57Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/stream/javadsl/MergePrioritized$.html
title: MergePrioritized$
---

# MergePrioritized$

## Content

Package [akka.stream.javadsl](package-summary.html)
## Class MergePrioritized$

- java.lang.Object
- - akka.stream.javadsl.MergePrioritized$

- ---

```
public class MergePrioritized$
extends java.lang.Object
```

Merge several streams, taking elements as they arrive from input streams
 (picking from prioritized once when several have elements ready).
 
 A `MergePrioritized` has one `out` port, one or more input port with their priorities.
 

 '''Emits when''' one of the inputs has an element available, preferring
 a input based on its priority if multiple have elements available
 

 '''Backpressures when''' downstream backpressures
 

 '''Completes when''' all upstreams complete (eagerComplete\=false) or one upstream completes (eagerComplete\=true), default value is `false`

 '''Cancels when''' downstream cancels
 

 A `Broadcast` has one `in` port and 2 or more `out` ports.

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [MergePrioritized$](MergePrioritized$.html "class in akka.stream.javadsl")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[MergePrioritized$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<T> [Graph](../Graph.html "interface in akka.stream")<[UniformFanInShape](../UniformFanInShape.html "class in akka.stream")<T,​T>,​[NotUsed](../../NotUsed.html "class in akka")>` | `[create](#create(int%5B%5D))​(int[] priorities)` | Create a new `MergePrioritized` operator with the specified output type. |
	| `<T> [Graph](../Graph.html "interface in akka.stream")<[UniformFanInShape](../UniformFanInShape.html "class in akka.stream")<T,​T>,​[NotUsed](../../NotUsed.html "class in akka")>` | `[create](#create(int%5B%5D,boolean))​(int[] priorities,  boolean eagerComplete)` | Create a new `MergePrioritized` operator with the specified output type. |
	| `<T> [Graph](../Graph.html "interface in akka.stream")<[UniformFanInShape](../UniformFanInShape.html "class in akka.stream")<T,​T>,​[NotUsed](../../NotUsed.html "class in akka")>` | `[create](#create(java.lang.Class,int%5B%5D))​(java.lang.Class<T> clazz,  int[] priorities)` | Create a new `MergePrioritized` operator with the specified output type. |
	| `<T> [Graph](../Graph.html "interface in akka.stream")<[UniformFanInShape](../UniformFanInShape.html "class in akka.stream")<T,​T>,​[NotUsed](../../NotUsed.html "class in akka")>` | `[create](#create(java.lang.Class,int%5B%5D,boolean))​(java.lang.Class<T> clazz,  int[] priorities,  boolean eagerComplete)` | Create a new `MergePrioritized` operator with the specified output type. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [MergePrioritized$](MergePrioritized$.html "class in akka.stream.javadsl") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### MergePrioritized$
		
		
		
		```
		public MergePrioritized$()
		```

	- ### Method Detail
	
	
	
		- #### create
		
		
		
		```
		public <T> [Graph](../Graph.html "interface in akka.stream")<[UniformFanInShape](../UniformFanInShape.html "class in akka.stream")<T,​T>,​[NotUsed](../../NotUsed.html "class in akka")> create​(int[] priorities)
		```
		
		Create a new `MergePrioritized` operator with the specified output type.
		- #### create
		
		
		
		```
		public <T> [Graph](../Graph.html "interface in akka.stream")<[UniformFanInShape](../UniformFanInShape.html "class in akka.stream")<T,​T>,​[NotUsed](../../NotUsed.html "class in akka")> create​(java.lang.Class<T> clazz,
		                                                                    int[] priorities)
		```
		
		Create a new `MergePrioritized` operator with the specified output type.
		- #### create
		
		
		
		```
		public <T> [Graph](../Graph.html "interface in akka.stream")<[UniformFanInShape](../UniformFanInShape.html "class in akka.stream")<T,​T>,​[NotUsed](../../NotUsed.html "class in akka")> create​(int[] priorities,
		                                                                    boolean eagerComplete)
		```
		
		Create a new `MergePrioritized` operator with the specified output type.
		 
		
		Parameters:
		`eagerComplete` \- set to true in order to make this operator eagerly
		 finish as soon as one of its inputs completes
		- #### create
		
		
		
		```
		public <T> [Graph](../Graph.html "interface in akka.stream")<[UniformFanInShape](../UniformFanInShape.html "class in akka.stream")<T,​T>,​[NotUsed](../../NotUsed.html "class in akka")> create​(java.lang.Class<T> clazz,
		                                                                    int[] priorities,
		                                                                    boolean eagerComplete)
		```
		
		Create a new `MergePrioritized` operator with the specified output type.
		 
		
		Parameters:
		`eagerComplete` \- set to true in order to make this operator eagerly
		 finish as soon as one of its inputs completes

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/NotUsed.html
- https://doc.akka.io/japi/akka/current/akka/stream/Graph.html
- https://doc.akka.io/japi/akka/current/akka/stream/UniformFanInShape.html
- https://doc.akka.io/japi/akka/current/akka/stream/javadsl/MergePrioritized$.html
- https://doc.akka.io/japi/akka/current/akka/stream/javadsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/stream/javadsl/MergePrioritized$.html](https://doc.akka.io/japi/akka/current/akka/stream/javadsl/MergePrioritized$.html)*