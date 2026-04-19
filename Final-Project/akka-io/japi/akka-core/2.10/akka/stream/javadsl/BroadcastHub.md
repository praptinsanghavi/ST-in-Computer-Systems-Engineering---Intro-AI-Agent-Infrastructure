---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:35:09Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/BroadcastHub.html
title: BroadcastHub
---

# BroadcastHub

## Content

Package [akka.stream.javadsl](package-summary.html)
## Class BroadcastHub

- java.lang.Object
- - akka.stream.javadsl.BroadcastHub

- ---

```
public class BroadcastHub
extends java.lang.Object
```

A BroadcastHub is a special streaming hub that is able to broadcast streamed elements to a dynamic set of consumers.
 It consists of two parts, a [`Sink`](Sink.html "class in akka.stream.javadsl") and a [`Source`](Source.html "class in akka.stream.javadsl"). The [`Sink`](Sink.html "class in akka.stream.javadsl") broadcasts elements from a producer to the
 actually live consumers it has. Once the producer has been materialized, the [`Sink`](Sink.html "class in akka.stream.javadsl") it feeds into returns a
 materialized value which is the corresponding [`Source`](Source.html "class in akka.stream.javadsl"). This [`Source`](Source.html "class in akka.stream.javadsl") can be materialized an arbitrary number
 of times, where each of the new materializations will receive their elements from the original [`Sink`](Sink.html "class in akka.stream.javadsl").

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[BroadcastHub](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static <T> [Sink](Sink.html "class in akka.stream.javadsl")<T,​[Source](Source.html "class in akka.stream.javadsl")<T,​[NotUsed](../../NotUsed.html "class in akka")>>` | `[of](#of(java.lang.Class))​(java.lang.Class<T> clazz)` | Creates a [`Sink`](Sink.html "class in akka.stream.javadsl") with default buffer size 256 that receives elements from its upstream producer and broadcasts them to a dynamic set  of consumers. |
	| `static <T> [Sink](Sink.html "class in akka.stream.javadsl")<T,​[Source](Source.html "class in akka.stream.javadsl")<T,​[NotUsed](../../NotUsed.html "class in akka")>>` | `[of](#of(java.lang.Class,int))​(java.lang.Class<T> clazz,  int bufferSize)` | Creates a [`Sink`](Sink.html "class in akka.stream.javadsl") that receives elements from its upstream producer and broadcasts them to a dynamic set  of consumers. |
	| `static <T> [Sink](Sink.html "class in akka.stream.javadsl")<T,​[Source](Source.html "class in akka.stream.javadsl")<T,​[NotUsed](../../NotUsed.html "class in akka")>>` | `[of](#of(java.lang.Class,int,int))​(java.lang.Class<T> clazz,  int startAfterNrOfConsumers,  int bufferSize)` | Creates a [`Sink`](Sink.html "class in akka.stream.javadsl") that receives elements from its upstream producer and broadcasts them to a dynamic set  of consumers. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### BroadcastHub
		
		
		
		```
		public BroadcastHub()
		```

	- ### Method Detail
	
	
	
		- #### of
		
		
		
		```
		public static <T> [Sink](Sink.html "class in akka.stream.javadsl")<T,​[Source](Source.html "class in akka.stream.javadsl")<T,​[NotUsed](../../NotUsed.html "class in akka")>> of​(java.lang.Class<T> clazz,
		                                                           int bufferSize)
		```
		
		Creates a [`Sink`](Sink.html "class in akka.stream.javadsl") that receives elements from its upstream producer and broadcasts them to a dynamic set
		 of consumers. After the [`Sink`](Sink.html "class in akka.stream.javadsl") returned by this method is materialized, it returns a [`Source`](Source.html "class in akka.stream.javadsl") as materialized
		 value. This [`Source`](Source.html "class in akka.stream.javadsl") can be materialized an arbitrary number of times and each materialization will receive the
		 broadcast elements from the original [`Sink`](Sink.html "class in akka.stream.javadsl").
		 
		 Every new materialization of the [`Sink`](Sink.html "class in akka.stream.javadsl") results in a new, independent hub, which materializes to its own
		 [`Source`](Source.html "class in akka.stream.javadsl") for consuming the [`Sink`](Sink.html "class in akka.stream.javadsl") of that materialization.
		 
		
		
		 If the original [`Sink`](Sink.html "class in akka.stream.javadsl") is failed, then the failure is immediately propagated to all of its materialized
		 [`Source`](Source.html "class in akka.stream.javadsl")s (possibly jumping over already buffered elements). If the original [`Sink`](Sink.html "class in akka.stream.javadsl") is completed, then
		 all corresponding [`Source`](Source.html "class in akka.stream.javadsl")s are completed. Both failure and normal completion is "remembered" and later
		 materializations of the [`Source`](Source.html "class in akka.stream.javadsl") will see the same (failure or completion) state. [`Source`](Source.html "class in akka.stream.javadsl")s that are
		 cancelled are simply removed from the dynamic set of consumers.
		 
		
		
		
		Parameters:
		`clazz` \- Type of elements this hub emits and consumes
		`bufferSize` \- Buffer size used by the producer. Gives an upper bound on how "far" from each other two
		 concurrent consumers can be in terms of element. If the buffer is full, the producer
		 is backpressured. Must be a power of two and less than 4096\.
		- #### of
		
		
		
		```
		public static <T> [Sink](Sink.html "class in akka.stream.javadsl")<T,​[Source](Source.html "class in akka.stream.javadsl")<T,​[NotUsed](../../NotUsed.html "class in akka")>> of​(java.lang.Class<T> clazz,
		                                                           int startAfterNrOfConsumers,
		                                                           int bufferSize)
		```
		
		Creates a [`Sink`](Sink.html "class in akka.stream.javadsl") that receives elements from its upstream producer and broadcasts them to a dynamic set
		 of consumers. After the [`Sink`](Sink.html "class in akka.stream.javadsl") returned by this method is materialized, it returns a [`Source`](Source.html "class in akka.stream.javadsl") as materialized
		 value. This [`Source`](Source.html "class in akka.stream.javadsl") can be materialized an arbitrary number of times and each materialization will receive the
		 broadcast elements from the original [`Sink`](Sink.html "class in akka.stream.javadsl").
		 
		 Every new materialization of the [`Sink`](Sink.html "class in akka.stream.javadsl") results in a new, independent hub, which materializes to its own
		 [`Source`](Source.html "class in akka.stream.javadsl") for consuming the [`Sink`](Sink.html "class in akka.stream.javadsl") of that materialization.
		 
		
		
		 If the original [`Sink`](Sink.html "class in akka.stream.javadsl") is failed, then the failure is immediately propagated to all of its materialized
		 [`Source`](Source.html "class in akka.stream.javadsl")s (possibly jumping over already buffered elements). If the original [`Sink`](Sink.html "class in akka.stream.javadsl") is completed, then
		 all corresponding [`Source`](Source.html "class in akka.stream.javadsl")s are completed. Both failure and normal completion is "remembered" and later
		 materializations of the [`Source`](Source.html "class in akka.stream.javadsl") will see the same (failure or completion) state. [`Source`](Source.html "class in akka.stream.javadsl")s that are
		 cancelled are simply removed from the dynamic set of consumers.
		 
		
		
		
		Parameters:
		`clazz` \- Type of elements this hub emits and consumes
		`startAfterNrOfConsumers` \- Elements are buffered until this number of consumers have been connected.
		 This is only used initially when the operator is starting up, i.e. it is not honored when consumers have
		 been removed (canceled).
		`bufferSize` \- Buffer size used by the producer. Gives an upper bound on how "far" from each other two
		 concurrent consumers can be in terms of element. If the buffer is full, the producer
		 is backpressured. Must be a power of two and less than 4096\.
		- #### of
		
		
		
		```
		public static <T> [Sink](Sink.html "class in akka.stream.javadsl")<T,​[Source](Source.html "class in akka.stream.javadsl")<T,​[NotUsed](../../NotUsed.html "class in akka")>> of​(java.lang.Class<T> clazz)
		```
		
		Creates a [`Sink`](Sink.html "class in akka.stream.javadsl") with default buffer size 256 that receives elements from its upstream producer and broadcasts them to a dynamic set
		 of consumers. After the [`Sink`](Sink.html "class in akka.stream.javadsl") returned by this method is materialized, it returns a [`Source`](Source.html "class in akka.stream.javadsl") as materialized
		 value. This [`Source`](Source.html "class in akka.stream.javadsl") can be materialized an arbitrary number of times and each materialization will receive the
		 broadcast elements from the original [`Sink`](Sink.html "class in akka.stream.javadsl").
		 
		 Every new materialization of the [`Sink`](Sink.html "class in akka.stream.javadsl") results in a new, independent hub, which materializes to its own
		 [`Source`](Source.html "class in akka.stream.javadsl") for consuming the [`Sink`](Sink.html "class in akka.stream.javadsl") of that materialization.
		 
		
		
		 If the original [`Sink`](Sink.html "class in akka.stream.javadsl") is failed, then the failure is immediately propagated to all of its materialized
		 [`Source`](Source.html "class in akka.stream.javadsl")s (possibly jumping over already buffered elements). If the original [`Sink`](Sink.html "class in akka.stream.javadsl") is completed, then
		 all corresponding [`Source`](Source.html "class in akka.stream.javadsl")s are completed. Both failure and normal completion is "remembered" and later
		 materializations of the [`Source`](Source.html "class in akka.stream.javadsl") will see the same (failure or completion) state. [`Source`](Source.html "class in akka.stream.javadsl")s that are
		 cancelled are simply removed from the dynamic set of consumers.
		 
		
		
		
		Parameters:
		`clazz` \- Type of elements this hub emits and consumes

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/NotUsed.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Sink.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/BroadcastHub.html](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/BroadcastHub.html)*