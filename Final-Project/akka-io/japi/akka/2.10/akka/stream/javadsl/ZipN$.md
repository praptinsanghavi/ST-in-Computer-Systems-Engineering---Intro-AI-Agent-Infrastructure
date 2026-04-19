---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:02:37Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/2.10/akka/stream/javadsl/ZipN$.html
title: ZipN$
---

# ZipN$

## Content

Package [akka.stream.javadsl](package-summary.html)
## Class ZipN$

- java.lang.Object
- - akka.stream.javadsl.ZipN$

- ---

```
public class ZipN$
extends java.lang.Object
```

Combine the elements of multiple streams into a stream of lists.
 
 A `ZipN` has a `n` input ports and one `out` port
 

 '''Emits when''' all of the inputs has an element available
 

 '''Backpressures when''' downstream backpressures
 

 '''Completes when''' any upstream completes
 

 '''Cancels when''' downstream cancels

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ZipN$](ZipN$.html "class in akka.stream.javadsl")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ZipN$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<A> [Graph](../Graph.html "interface in akka.stream")<[UniformFanInShape](../UniformFanInShape.html "class in akka.stream")<A,​java.util.List<A>>,​[NotUsed](../../NotUsed.html "class in akka")>` | `[create](#create(int))​(int n)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ZipN$](ZipN$.html "class in akka.stream.javadsl") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ZipN$
		
		
		
		```
		public ZipN$()
		```

	- ### Method Detail
	
	
	
		- #### create
		
		
		
		```
		public <A> [Graph](../Graph.html "interface in akka.stream")<[UniformFanInShape](../UniformFanInShape.html "class in akka.stream")<A,​java.util.List<A>>,​[NotUsed](../../NotUsed.html "class in akka")> create​(int n)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/2.10/akka/NotUsed.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/Graph.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/UniformFanInShape.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/javadsl/ZipN$.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/javadsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/2.10/akka/stream/javadsl/ZipN$.html](https://doc.akka.io/japi/akka/2.10/akka/stream/javadsl/ZipN$.html)*