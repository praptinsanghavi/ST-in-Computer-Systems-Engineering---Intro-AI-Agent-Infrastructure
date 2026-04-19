---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:46:04Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/stream/javadsl/ZipWithN$.html
title: ZipWithN$
---

# ZipWithN$

## Content

Package [akka.stream.javadsl](package-summary.html)
## Class ZipWithN$

- java.lang.Object
- - akka.stream.javadsl.ZipWithN$

- ---

```
public class ZipWithN$
extends java.lang.Object
```

Combine the elements of multiple streams into a stream of lists using a combiner function.
 
 A `ZipWithN` has a `n` input ports and one `out` port
 

 '''Emits when''' all of the inputs has an element available
 

 '''Backpressures when''' downstream backpressures
 

 '''Completes when''' any upstream completes
 

 '''Cancels when''' downstream cancels

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ZipWithN$](ZipWithN$.html "class in akka.stream.javadsl")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ZipWithN$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<A,​O>[Graph](../Graph.html "interface in akka.stream")<[UniformFanInShape](../UniformFanInShape.html "class in akka.stream")<A,​O>,​[NotUsed](../../NotUsed.html "class in akka")>` | `[create](#create(akka.japi.function.Function,int))​([Function](../../japi/function/Function.html "interface in akka.japi.function")<java.util.List<A>,​O> zipper,  int n)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ZipWithN$](ZipWithN$.html "class in akka.stream.javadsl") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ZipWithN$
		
		
		
		```
		public ZipWithN$()
		```

	- ### Method Detail
	
	
	
		- #### create
		
		
		
		```
		public <A,​O> [Graph](../Graph.html "interface in akka.stream")<[UniformFanInShape](../UniformFanInShape.html "class in akka.stream")<A,​O>,​[NotUsed](../../NotUsed.html "class in akka")> create​([Function](../../japi/function/Function.html "interface in akka.japi.function")<java.util.List<A>,​O> zipper,
		                                                                            int n)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/NotUsed.html
- https://doc.akka.io/japi/akka/current/akka/japi/function/Function.html
- https://doc.akka.io/japi/akka/current/akka/stream/Graph.html
- https://doc.akka.io/japi/akka/current/akka/stream/UniformFanInShape.html
- https://doc.akka.io/japi/akka/current/akka/stream/javadsl/ZipWithN$.html
- https://doc.akka.io/japi/akka/current/akka/stream/javadsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/stream/javadsl/ZipWithN$.html](https://doc.akka.io/japi/akka/current/akka/stream/javadsl/ZipWithN$.html)*