---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:41:32Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/Interleave$.html
title: Interleave$
---

# Interleave$

## Content

Package [akka.stream.scaladsl](package-summary.html)
## Class Interleave$

- java.lang.Object
- - akka.stream.scaladsl.Interleave$

- ---

```
public class Interleave$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Interleave$](Interleave$.html "class in akka.stream.scaladsl")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Interleave$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<T> [Graph](../Graph.html "interface in akka.stream")<[UniformFanInShape](../UniformFanInShape.html "class in akka.stream")<T,​T>,​[NotUsed](../../NotUsed.html "class in akka")>` | `[apply](#apply(int,int,boolean))​(int inputPorts,  int segmentSize,  boolean eagerClose)` | Create a new `Interleave` with the specified number of input ports and given size of elements  to take from each input. |
	| `<T> boolean` | `[apply$default$3](#apply$default$3())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [Interleave$](Interleave$.html "class in akka.stream.scaladsl") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Interleave$
		
		
		
		```
		public Interleave$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public <T> [Graph](../Graph.html "interface in akka.stream")<[UniformFanInShape](../UniformFanInShape.html "class in akka.stream")<T,​T>,​[NotUsed](../../NotUsed.html "class in akka")> apply​(int inputPorts,
		                                                                   int segmentSize,
		                                                                   boolean eagerClose)
		```
		
		Create a new `Interleave` with the specified number of input ports and given size of elements
		 to take from each input.
		 
		
		Parameters:
		`inputPorts` \- number of input ports
		`segmentSize` \- number of elements to send downstream before switching to next input port
		`eagerClose` \- if true, interleave completes upstream if any of its upstream completes.
		- #### apply$default$3
		
		
		
		```
		public <T> boolean apply$default$3()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/NotUsed.html
- https://doc.akka.io/japi/akka/current/akka/stream/Graph.html
- https://doc.akka.io/japi/akka/current/akka/stream/UniformFanInShape.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/Interleave$.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/Interleave$.html](https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/Interleave$.html)*