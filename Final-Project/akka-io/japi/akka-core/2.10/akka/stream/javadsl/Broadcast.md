---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:17:48Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Broadcast.html
title: Broadcast
---

# Broadcast

## Content

Package [akka.stream.javadsl](package-summary.html)
## Class Broadcast

- java.lang.Object
- - akka.stream.javadsl.Broadcast

- ---

```
public class Broadcast
extends java.lang.Object
```

Fan\-out the stream to several streams. emitting each incoming upstream element to all downstream consumers.
 It will not shutdown until the subscriptions for at least
 two downstream subscribers have been established.
 
 '''Emits when''' all of the outputs stops backpressuring and there is an input element available
 

 '''Backpressures when''' any of the outputs backpressure
 

 '''Completes when''' upstream completes
 

 '''Cancels when'''
 If eagerCancel is enabled: when any downstream cancels; otherwise: when all downstreams cancel

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Broadcast](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static <T> [Graph](../Graph.html "interface in akka.stream")<[UniformFanOutShape](../UniformFanOutShape.html "class in akka.stream")<T,​T>,​[NotUsed](../../NotUsed.html "class in akka")>` | `[create](#create(int))​(int outputCount)` | Create a new `Broadcast` operator with the specified input type. |
	| `static <T> [Graph](../Graph.html "interface in akka.stream")<[UniformFanOutShape](../UniformFanOutShape.html "class in akka.stream")<T,​T>,​[NotUsed](../../NotUsed.html "class in akka")>` | `[create](#create(int,boolean))​(int outputCount,  boolean eagerCancel)` | Create a new `Broadcast` operator with the specified input type. |
	| `static <T> [Graph](../Graph.html "interface in akka.stream")<[UniformFanOutShape](../UniformFanOutShape.html "class in akka.stream")<T,​T>,​[NotUsed](../../NotUsed.html "class in akka")>` | `[create](#create(java.lang.Class,int))​(java.lang.Class<T> clazz,  int outputCount)` | Create a new `Broadcast` operator with the specified input type. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### Broadcast
		
		
		
		```
		public Broadcast()
		```

	- ### Method Detail
	
	
	
		- #### create
		
		
		
		```
		public static <T> [Graph](../Graph.html "interface in akka.stream")<[UniformFanOutShape](../UniformFanOutShape.html "class in akka.stream")<T,​T>,​[NotUsed](../../NotUsed.html "class in akka")> create​(int outputCount,
		                                                                            boolean eagerCancel)
		```
		
		Create a new `Broadcast` operator with the specified input type.
		 
		
		Parameters:
		`outputCount` \- number of output ports
		`eagerCancel` \- if true, broadcast cancels upstream if any of its downstreams cancel.
		- #### create
		
		
		
		```
		public static <T> [Graph](../Graph.html "interface in akka.stream")<[UniformFanOutShape](../UniformFanOutShape.html "class in akka.stream")<T,​T>,​[NotUsed](../../NotUsed.html "class in akka")> create​(int outputCount)
		```
		
		Create a new `Broadcast` operator with the specified input type.
		 
		
		Parameters:
		`outputCount` \- number of output ports
		- #### create
		
		
		
		```
		public static <T> [Graph](../Graph.html "interface in akka.stream")<[UniformFanOutShape](../UniformFanOutShape.html "class in akka.stream")<T,​T>,​[NotUsed](../../NotUsed.html "class in akka")> create​(java.lang.Class<T> clazz,
		                                                                            int outputCount)
		```
		
		Create a new `Broadcast` operator with the specified input type.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/NotUsed.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/Graph.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/UniformFanOutShape.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Broadcast.html](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Broadcast.html)*