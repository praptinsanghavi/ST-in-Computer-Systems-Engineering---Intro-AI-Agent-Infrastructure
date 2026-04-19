---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:41:25Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/Concat$.html
title: Concat$
---

# Concat$

## Content

Package [akka.stream.scaladsl](package-summary.html)
## Class Concat$

- java.lang.Object
- - akka.stream.scaladsl.Concat$

- ---

```
public class Concat$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Concat$](Concat$.html "class in akka.stream.scaladsl")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Concat$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<T> [Graph](../Graph.html "interface in akka.stream")<[UniformFanInShape](../UniformFanInShape.html "class in akka.stream")<T,​T>,​[NotUsed](../../NotUsed.html "class in akka")>` | `[apply](#apply(int))​(int inputPorts)` | Create a new `Concat`. |
	| `<T> [Graph](../Graph.html "interface in akka.stream")<[UniformFanInShape](../UniformFanInShape.html "class in akka.stream")<T,​T>,​[NotUsed](../../NotUsed.html "class in akka")>` | `[apply](#apply(int,boolean))​(int inputPorts,  boolean detachedInputs)` | Create a new `Concat` operator that will concatenate two or more streams. |
	| `<T> int` | `[apply$default$1](#apply$default$1())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [Concat$](Concat$.html "class in akka.stream.scaladsl") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Concat$
		
		
		
		```
		public Concat$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public <T> [Graph](../Graph.html "interface in akka.stream")<[UniformFanInShape](../UniformFanInShape.html "class in akka.stream")<T,​T>,​[NotUsed](../../NotUsed.html "class in akka")> apply​(int inputPorts)
		```
		
		Create a new `Concat`. Note that this for historical reasons creates a "detached" Concat which
		 will eagerly pull each input on materialization and act as a one element buffer for each input.
		- #### apply
		
		
		
		```
		public <T> [Graph](../Graph.html "interface in akka.stream")<[UniformFanInShape](../UniformFanInShape.html "class in akka.stream")<T,​T>,​[NotUsed](../../NotUsed.html "class in akka")> apply​(int inputPorts,
		                                                                   boolean detachedInputs)
		```
		
		Create a new `Concat` operator that will concatenate two or more streams.
		
		Parameters:
		`inputPorts` \- The number of fan\-in input ports
		`detachedInputs` \- If the ports should be detached (eagerly pull both inputs) useful to avoid deadlocks in graphs with loops
		Returns:
		- #### apply$default$1
		
		
		
		```
		public <T> int apply$default$1()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/NotUsed.html
- https://doc.akka.io/japi/akka/current/akka/stream/Graph.html
- https://doc.akka.io/japi/akka/current/akka/stream/UniformFanInShape.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/Concat$.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/Concat$.html](https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/Concat$.html)*