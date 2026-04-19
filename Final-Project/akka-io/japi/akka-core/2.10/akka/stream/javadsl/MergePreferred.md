---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:52:04Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/MergePreferred.html
title: MergePreferred
---

# MergePreferred

## Content

Package [akka.stream.javadsl](package-summary.html)
## Class MergePreferred

- java.lang.Object
- - akka.stream.javadsl.MergePreferred

- ---

```
public class MergePreferred
extends java.lang.Object
```

Merge several streams, taking elements as they arrive from input streams
 (picking from preferred when several have elements ready).
 
 '''Emits when''' one of the inputs has an element available, preferring
 a specified input if multiple have elements available
 

 '''Backpressures when''' downstream backpressures
 

 '''Completes when''' all upstreams complete (eagerComplete\=false) or one upstream completes (eagerComplete\=true)
 

 '''Cancels when''' downstream cancels

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[MergePreferred](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static <T> [Graph](../Graph.html "interface in akka.stream")<[MergePreferred.MergePreferredShape](../scaladsl/MergePreferred.MergePreferredShape.html "class in akka.stream.scaladsl")<T>,​[NotUsed](../../NotUsed.html "class in akka")>` | `[create](#create(int))​(int secondaryPorts)` | Create a new `MergePreferred` operator with the specified output type. |
	| `static <T> [Graph](../Graph.html "interface in akka.stream")<[MergePreferred.MergePreferredShape](../scaladsl/MergePreferred.MergePreferredShape.html "class in akka.stream.scaladsl")<T>,​[NotUsed](../../NotUsed.html "class in akka")>` | `[create](#create(int,boolean))​(int secondaryPorts,  boolean eagerComplete)` | Create a new `MergePreferred` operator with the specified output type. |
	| `static <T> [Graph](../Graph.html "interface in akka.stream")<[MergePreferred.MergePreferredShape](../scaladsl/MergePreferred.MergePreferredShape.html "class in akka.stream.scaladsl")<T>,​[NotUsed](../../NotUsed.html "class in akka")>` | `[create](#create(java.lang.Class,int))​(java.lang.Class<T> clazz,  int secondaryPorts)` | Create a new `MergePreferred` operator with the specified output type. |
	| `static <T> [Graph](../Graph.html "interface in akka.stream")<[MergePreferred.MergePreferredShape](../scaladsl/MergePreferred.MergePreferredShape.html "class in akka.stream.scaladsl")<T>,​[NotUsed](../../NotUsed.html "class in akka")>` | `[create](#create(java.lang.Class,int,boolean))​(java.lang.Class<T> clazz,  int secondaryPorts,  boolean eagerComplete)` | Create a new `MergePreferred` operator with the specified output type. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### MergePreferred
		
		
		
		```
		public MergePreferred()
		```

	- ### Method Detail
	
	
	
		- #### create
		
		
		
		```
		public static <T> [Graph](../Graph.html "interface in akka.stream")<[MergePreferred.MergePreferredShape](../scaladsl/MergePreferred.MergePreferredShape.html "class in akka.stream.scaladsl")<T>,​[NotUsed](../../NotUsed.html "class in akka")> create​(int secondaryPorts)
		```
		
		Create a new `MergePreferred` operator with the specified output type.
		- #### create
		
		
		
		```
		public static <T> [Graph](../Graph.html "interface in akka.stream")<[MergePreferred.MergePreferredShape](../scaladsl/MergePreferred.MergePreferredShape.html "class in akka.stream.scaladsl")<T>,​[NotUsed](../../NotUsed.html "class in akka")> create​(java.lang.Class<T> clazz,
		                                                                                    int secondaryPorts)
		```
		
		Create a new `MergePreferred` operator with the specified output type.
		- #### create
		
		
		
		```
		public static <T> [Graph](../Graph.html "interface in akka.stream")<[MergePreferred.MergePreferredShape](../scaladsl/MergePreferred.MergePreferredShape.html "class in akka.stream.scaladsl")<T>,​[NotUsed](../../NotUsed.html "class in akka")> create​(int secondaryPorts,
		                                                                                    boolean eagerComplete)
		```
		
		Create a new `MergePreferred` operator with the specified output type.
		 
		
		Parameters:
		`eagerComplete` \- set to true in order to make this operator eagerly
		 finish as soon as one of its inputs completes
		- #### create
		
		
		
		```
		public static <T> [Graph](../Graph.html "interface in akka.stream")<[MergePreferred.MergePreferredShape](../scaladsl/MergePreferred.MergePreferredShape.html "class in akka.stream.scaladsl")<T>,​[NotUsed](../../NotUsed.html "class in akka")> create​(java.lang.Class<T> clazz,
		                                                                                    int secondaryPorts,
		                                                                                    boolean eagerComplete)
		```
		
		Create a new `MergePreferred` operator with the specified output type.
		 
		
		Parameters:
		`eagerComplete` \- set to true in order to make this operator eagerly
		 finish as soon as one of its inputs completes

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/NotUsed.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/Graph.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/scaladsl/MergePreferred.MergePreferredShape.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/MergePreferred.html](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/MergePreferred.html)*