---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:41:51Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/MergeSequence$.html
title: MergeSequence$
---

# MergeSequence$

## Content

Package [akka.stream.scaladsl](package-summary.html)
## Class MergeSequence$

- java.lang.Object
- - akka.stream.scaladsl.MergeSequence$

- ---

```
public class MergeSequence$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [MergeSequence$](MergeSequence$.html "class in akka.stream.scaladsl")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[MergeSequence$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<T> [Graph](../Graph.html "interface in akka.stream")<[UniformFanInShape](../UniformFanInShape.html "class in akka.stream")<T,​T>,​[NotUsed](../../NotUsed.html "class in akka")>` | `[apply](#apply(int,scala.Function1))​(int inputPorts,  scala.Function1<T,​java.lang.Object> extractSequence)` |  |
	| `<T> int` | `[apply$default$1](#apply$default$1())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [MergeSequence$](MergeSequence$.html "class in akka.stream.scaladsl") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### MergeSequence$
		
		
		
		```
		public MergeSequence$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public <T> [Graph](../Graph.html "interface in akka.stream")<[UniformFanInShape](../UniformFanInShape.html "class in akka.stream")<T,​T>,​[NotUsed](../../NotUsed.html "class in akka")> apply​(int inputPorts,
		                                                                   scala.Function1<T,​java.lang.Object> extractSequence)
		```
		- #### apply$default$1
		
		
		
		```
		public <T> int apply$default$1()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/NotUsed.html
- https://doc.akka.io/japi/akka/current/akka/stream/Graph.html
- https://doc.akka.io/japi/akka/current/akka/stream/UniformFanInShape.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/MergeSequence$.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/MergeSequence$.html](https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/MergeSequence$.html)*