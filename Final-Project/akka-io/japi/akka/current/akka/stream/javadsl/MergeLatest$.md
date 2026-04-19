---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:44:55Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/stream/javadsl/MergeLatest$.html
title: MergeLatest$
---

# MergeLatest$

## Content

Package [akka.stream.javadsl](package-summary.html)
## Class MergeLatest$

- java.lang.Object
- - akka.stream.javadsl.MergeLatest$

- ---

```
public class MergeLatest$
extends java.lang.Object
```

MergeLatest joins elements from N input streams into stream of lists of size N.
 i\-th element in list is the latest emitted element from i\-th input stream.
 MergeLatest emits list for each element emitted from some input stream,
 but only after each stream emitted at least one element
 
 '''Emits when''' element is available from some input and each input emits at least one element from stream start
 

 '''Completes when''' all upstreams complete (eagerClose\=false) or one upstream completes (eagerClose\=true)
 

 '''Cancels when''' downstream cancels

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [MergeLatest$](MergeLatest$.html "class in akka.stream.javadsl")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[MergeLatest$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<T> [GraphStage](../stage/GraphStage.html "class in akka.stream.stage")<[UniformFanInShape](../UniformFanInShape.html "class in akka.stream")<T,​java.util.List<T>>>` | `[create](#create(int))​(int inputPorts)` | Create a new `MergeLatest` with the specified number of input ports. |
	| `<T> [GraphStage](../stage/GraphStage.html "class in akka.stream.stage")<[UniformFanInShape](../UniformFanInShape.html "class in akka.stream")<T,​java.util.List<T>>>` | `[create](#create(int,boolean))​(int inputPorts,  boolean eagerComplete)` | Create a new `MergeLatest` with the specified number of input ports. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [MergeLatest$](MergeLatest$.html "class in akka.stream.javadsl") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### MergeLatest$
		
		
		
		```
		public MergeLatest$()
		```

	- ### Method Detail
	
	
	
		- #### create
		
		
		
		```
		public <T> [GraphStage](../stage/GraphStage.html "class in akka.stream.stage")<[UniformFanInShape](../UniformFanInShape.html "class in akka.stream")<T,​java.util.List<T>>> create​(int inputPorts,
		                                                                           boolean eagerComplete)
		```
		
		Create a new `MergeLatest` with the specified number of input ports.
		 
		
		Parameters:
		`inputPorts` \- number of input ports
		`eagerComplete` \- if true, the merge latest will complete as soon as one of its inputs completes.
		- #### create
		
		
		
		```
		public <T> [GraphStage](../stage/GraphStage.html "class in akka.stream.stage")<[UniformFanInShape](../UniformFanInShape.html "class in akka.stream")<T,​java.util.List<T>>> create​(int inputPorts)
		```
		
		Create a new `MergeLatest` with the specified number of input ports.
		 
		
		Parameters:
		`inputPorts` \- number of input ports

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/stream/UniformFanInShape.html
- https://doc.akka.io/japi/akka/current/akka/stream/javadsl/MergeLatest$.html
- https://doc.akka.io/japi/akka/current/akka/stream/javadsl/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/stream/stage/GraphStage.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/stream/javadsl/MergeLatest$.html](https://doc.akka.io/japi/akka/current/akka/stream/javadsl/MergeLatest$.html)*