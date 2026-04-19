---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:45:57Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/stream/javadsl/ZipN.html
title: ZipN
---

# ZipN

## Content

Package [akka.stream.javadsl](package-summary.html)
## Class ZipN

- java.lang.Object
- - akka.stream.javadsl.ZipN

- ---

```
public class ZipN
extends java.lang.Object
```

Combine the elements of multiple streams into a stream of lists.
 
 A `ZipN` has a `n` input ports and one `out` port
 

 '''Emits when''' all of the inputs has an element available
 

 '''Backpressures when''' downstream backpressures
 

 '''Completes when''' any upstream completes
 

 '''Cancels when''' downstream cancels

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ZipN](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static <A> [Graph](../Graph.html "interface in akka.stream")<[UniformFanInShape](../UniformFanInShape.html "class in akka.stream")<A,​java.util.List<A>>,​[NotUsed](../../NotUsed.html "class in akka")>` | `[create](#create(int))​(int n)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### ZipN
		
		
		
		```
		public ZipN()
		```

	- ### Method Detail
	
	
	
		- #### create
		
		
		
		```
		public static <A> [Graph](../Graph.html "interface in akka.stream")<[UniformFanInShape](../UniformFanInShape.html "class in akka.stream")<A,​java.util.List<A>>,​[NotUsed](../../NotUsed.html "class in akka")> create​(int n)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/NotUsed.html
- https://doc.akka.io/japi/akka/current/akka/stream/Graph.html
- https://doc.akka.io/japi/akka/current/akka/stream/UniformFanInShape.html
- https://doc.akka.io/japi/akka/current/akka/stream/javadsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/stream/javadsl/ZipN.html](https://doc.akka.io/japi/akka/current/akka/stream/javadsl/ZipN.html)*