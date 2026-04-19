---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:01:15Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/2.10/akka/stream/javadsl/Balance.html
title: Balance
---

# Balance

## Content

Package [akka.stream.javadsl](package-summary.html)
## Class Balance

- java.lang.Object
- - akka.stream.javadsl.Balance

- ---

```
public class Balance
extends java.lang.Object
```

Fan\-out the stream to several streams. Each upstream element is emitted to the first available downstream consumer.
 It will not shutdown until the subscriptions for at least
 two downstream subscribers have been established.
 
 '''Emits when''' any of the outputs stops backpressuring; emits the element to the first available output
 

 '''Backpressures when''' all of the outputs backpressure
 

 '''Completes when''' upstream completes
 

 '''Cancels when''' If eagerCancel is enabled: when any downstream cancels; otherwise: when all downstreams cancel

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Balance](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static <T> [Graph](../Graph.html "interface in akka.stream")<[UniformFanOutShape](../UniformFanOutShape.html "class in akka.stream")<T,​T>,​[NotUsed](../../NotUsed.html "class in akka")>` | `[create](#create(int))​(int outputCount)` | Create a new `Balance` operator with the specified input type, both `waitForAllDownstreams` and `eagerCancel` are `false`. |
	| `static <T> [Graph](../Graph.html "interface in akka.stream")<[UniformFanOutShape](../UniformFanOutShape.html "class in akka.stream")<T,​T>,​[NotUsed](../../NotUsed.html "class in akka")>` | `[create](#create(int,boolean))​(int outputCount,  boolean waitForAllDownstreams)` | Create a new `Balance` operator with the specified input type, `eagerCancel` is `false`. |
	| `static <T> [Graph](../Graph.html "interface in akka.stream")<[UniformFanOutShape](../UniformFanOutShape.html "class in akka.stream")<T,​T>,​[NotUsed](../../NotUsed.html "class in akka")>` | `[create](#create(int,boolean,boolean))​(int outputCount,  boolean waitForAllDownstreams,  boolean eagerCancel)` | Create a new `Balance` operator with the specified input type. |
	| `static <T> [Graph](../Graph.html "interface in akka.stream")<[UniformFanOutShape](../UniformFanOutShape.html "class in akka.stream")<T,​T>,​[NotUsed](../../NotUsed.html "class in akka")>` | `[create](#create(java.lang.Class,int))​(java.lang.Class<T> clazz,  int outputCount)` | Create a new `Balance` operator with the specified input type, both `waitForAllDownstreams` and `eagerCancel` are `false`. |
	| `static <T> [Graph](../Graph.html "interface in akka.stream")<[UniformFanOutShape](../UniformFanOutShape.html "class in akka.stream")<T,​T>,​[NotUsed](../../NotUsed.html "class in akka")>` | `[create](#create(java.lang.Class,int,boolean))​(java.lang.Class<T> clazz,  int outputCount,  boolean waitForAllDownstreams)` | Create a new `Balance` operator with the specified input type, `eagerCancel` is `false`. |
	| `static <T> [Graph](../Graph.html "interface in akka.stream")<[UniformFanOutShape](../UniformFanOutShape.html "class in akka.stream")<T,​T>,​[NotUsed](../../NotUsed.html "class in akka")>` | `[create](#create(java.lang.Class,int,boolean,boolean))​(java.lang.Class<T> clazz,  int outputCount,  boolean waitForAllDownstreams,  boolean eagerCancel)` | Create a new `Balance` operator with the specified input type. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### Balance
		
		
		
		```
		public Balance()
		```

	- ### Method Detail
	
	
	
		- #### create
		
		
		
		```
		public static <T> [Graph](../Graph.html "interface in akka.stream")<[UniformFanOutShape](../UniformFanOutShape.html "class in akka.stream")<T,​T>,​[NotUsed](../../NotUsed.html "class in akka")> create​(int outputCount,
		                                                                            boolean waitForAllDownstreams)
		```
		
		Create a new `Balance` operator with the specified input type, `eagerCancel` is `false`.
		 
		
		Parameters:
		`outputCount` \- number of output ports
		`waitForAllDownstreams` \- if `true` it will not start emitting
		 elements to downstream outputs until all of them have requested at least one element
		- #### create
		
		
		
		```
		public static <T> [Graph](../Graph.html "interface in akka.stream")<[UniformFanOutShape](../UniformFanOutShape.html "class in akka.stream")<T,​T>,​[NotUsed](../../NotUsed.html "class in akka")> create​(int outputCount,
		                                                                            boolean waitForAllDownstreams,
		                                                                            boolean eagerCancel)
		```
		
		Create a new `Balance` operator with the specified input type.
		 
		
		Parameters:
		`outputCount` \- number of output ports
		`waitForAllDownstreams` \- if `true` it will not start emitting elements to downstream outputs until all of them have requested at least one element
		`eagerCancel` \- if true, balance cancels upstream if any of its downstreams cancel, if false, when all have cancelled.
		- #### create
		
		
		
		```
		public static <T> [Graph](../Graph.html "interface in akka.stream")<[UniformFanOutShape](../UniformFanOutShape.html "class in akka.stream")<T,​T>,​[NotUsed](../../NotUsed.html "class in akka")> create​(int outputCount)
		```
		
		Create a new `Balance` operator with the specified input type, both `waitForAllDownstreams` and `eagerCancel` are `false`.
		 
		
		Parameters:
		`outputCount` \- number of output ports
		- #### create
		
		
		
		```
		public static <T> [Graph](../Graph.html "interface in akka.stream")<[UniformFanOutShape](../UniformFanOutShape.html "class in akka.stream")<T,​T>,​[NotUsed](../../NotUsed.html "class in akka")> create​(java.lang.Class<T> clazz,
		                                                                            int outputCount)
		```
		
		Create a new `Balance` operator with the specified input type, both `waitForAllDownstreams` and `eagerCancel` are `false`.
		 
		
		Parameters:
		`clazz` \- a type hint for this method
		`outputCount` \- number of output ports
		- #### create
		
		
		
		```
		public static <T> [Graph](../Graph.html "interface in akka.stream")<[UniformFanOutShape](../UniformFanOutShape.html "class in akka.stream")<T,​T>,​[NotUsed](../../NotUsed.html "class in akka")> create​(java.lang.Class<T> clazz,
		                                                                            int outputCount,
		                                                                            boolean waitForAllDownstreams)
		```
		
		Create a new `Balance` operator with the specified input type, `eagerCancel` is `false`.
		 
		
		Parameters:
		`clazz` \- a type hint for this method
		`outputCount` \- number of output ports
		`waitForAllDownstreams` \- if `true` it will not start emitting elements to downstream outputs until all of them have requested at least one element
		- #### create
		
		
		
		```
		public static <T> [Graph](../Graph.html "interface in akka.stream")<[UniformFanOutShape](../UniformFanOutShape.html "class in akka.stream")<T,​T>,​[NotUsed](../../NotUsed.html "class in akka")> create​(java.lang.Class<T> clazz,
		                                                                            int outputCount,
		                                                                            boolean waitForAllDownstreams,
		                                                                            boolean eagerCancel)
		```
		
		Create a new `Balance` operator with the specified input type.
		 
		
		Parameters:
		`clazz` \- a type hint for this method
		`outputCount` \- number of output ports
		`waitForAllDownstreams` \- if `true` it will not start emitting elements to downstream outputs until all of them have requested at least one element
		`eagerCancel` \- if true, balance cancels upstream if any of its downstreams cancel, if false, when all have cancelled.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/2.10/akka/NotUsed.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/Graph.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/UniformFanOutShape.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/javadsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/2.10/akka/stream/javadsl/Balance.html](https://doc.akka.io/japi/akka/2.10/akka/stream/javadsl/Balance.html)*