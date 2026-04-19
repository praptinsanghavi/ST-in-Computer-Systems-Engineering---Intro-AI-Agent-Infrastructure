---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:41:51Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/MergePrioritized$.html
title: MergePrioritized$
---

# MergePrioritized$

## Content

Package [akka.stream.scaladsl](package-summary.html)
## Class MergePrioritized$

- java.lang.Object
- - akka.stream.scaladsl.MergePrioritized$

- ---

```
public class MergePrioritized$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [MergePrioritized$](MergePrioritized$.html "class in akka.stream.scaladsl")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[MergePrioritized$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<T> [GraphStage](../stage/GraphStage.html "class in akka.stream.stage")<[UniformFanInShape](../UniformFanInShape.html "class in akka.stream")<T,​T>>` | `[apply](#apply(scala.collection.immutable.Seq,boolean))​(scala.collection.immutable.Seq<java.lang.Object> priorities,  boolean eagerComplete)` | Create a new `MergePrioritized` with specified number of input ports. |
	| `<T> boolean` | `[apply$default$2](#apply$default$2())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [MergePrioritized$](MergePrioritized$.html "class in akka.stream.scaladsl") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### MergePrioritized$
		
		
		
		```
		public MergePrioritized$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public <T> [GraphStage](../stage/GraphStage.html "class in akka.stream.stage")<[UniformFanInShape](../UniformFanInShape.html "class in akka.stream")<T,​T>> apply​(scala.collection.immutable.Seq<java.lang.Object> priorities,
		                                                          boolean eagerComplete)
		```
		
		Create a new `MergePrioritized` with specified number of input ports.
		 
		
		Parameters:
		`priorities` \- priorities of the input ports
		`eagerComplete` \- if true, the merge will complete as soon as one of its inputs completes.
		- #### apply$default$2
		
		
		
		```
		public <T> boolean apply$default$2()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/stream/UniformFanInShape.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/MergePrioritized$.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/stream/stage/GraphStage.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/MergePrioritized$.html](https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/MergePrioritized$.html)*