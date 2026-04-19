---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:41:22Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/BroadcastHub$.html
title: BroadcastHub$
---

# BroadcastHub$

## Content

Package [akka.stream.scaladsl](package-summary.html)
## Class BroadcastHub$

- java.lang.Object
- - akka.stream.scaladsl.BroadcastHub$

- ---

```
public class BroadcastHub$
extends java.lang.Object
```

A BroadcastHub is a special streaming hub that is able to broadcast streamed elements to a dynamic set of consumers.
 It consists of two parts, a [`Sink`](Sink.html "class in akka.stream.scaladsl") and a [`Source`](Source.html "class in akka.stream.scaladsl"). The [`Sink`](Sink.html "class in akka.stream.scaladsl") broadcasts elements from a producer to the
 actually live consumers it has. Once the producer has been materialized, the [`Sink`](Sink.html "class in akka.stream.scaladsl") it feeds into returns a
 materialized value which is the corresponding [`Source`](Source.html "class in akka.stream.scaladsl"). This [`Source`](Source.html "class in akka.stream.scaladsl") can be materialized an arbitrary number
 of times, where each of the new materializations will receive their elements from the original [`Sink`](Sink.html "class in akka.stream.scaladsl").

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [BroadcastHub$](BroadcastHub$.html "class in akka.stream.scaladsl")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[BroadcastHub$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<T> [Sink](Sink.html "class in akka.stream.scaladsl")<T,​[Source](Source.html "class in akka.stream.scaladsl")<T,​[NotUsed](../../NotUsed.html "class in akka")>>` | `[sink](#sink())()` | Creates a [`Sink`](Sink.html "class in akka.stream.scaladsl") with default buffer size 256 that receives elements from its upstream producer and broadcasts them to a dynamic set  of consumers. |
	| `<T> [Sink](Sink.html "class in akka.stream.scaladsl")<T,​[Source](Source.html "class in akka.stream.scaladsl")<T,​[NotUsed](../../NotUsed.html "class in akka")>>` | `[sink](#sink(int))​(int bufferSize)` | Creates a [`Sink`](Sink.html "class in akka.stream.scaladsl") that receives elements from its upstream producer and broadcasts them to a dynamic set  of consumers. |
	| `<T> [Sink](Sink.html "class in akka.stream.scaladsl")<T,​[Source](Source.html "class in akka.stream.scaladsl")<T,​[NotUsed](../../NotUsed.html "class in akka")>>` | `[sink](#sink(int,int))​(int startAfterNrOfConsumers,  int bufferSize)` | Creates a [`Sink`](Sink.html "class in akka.stream.scaladsl") that receives elements from its upstream producer and broadcasts them to a dynamic set  of consumers. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [BroadcastHub$](BroadcastHub$.html "class in akka.stream.scaladsl") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### BroadcastHub$
		
		
		
		```
		public BroadcastHub$()
		```

	- ### Method Detail
	
	
	
		- #### sink
		
		
		
		```
		public <T> [Sink](Sink.html "class in akka.stream.scaladsl")<T,​[Source](Source.html "class in akka.stream.scaladsl")<T,​[NotUsed](../../NotUsed.html "class in akka")>> sink​(int bufferSize)
		```
		
		Creates a [`Sink`](Sink.html "class in akka.stream.scaladsl") that receives elements from its upstream producer and broadcasts them to a dynamic set
		 of consumers. After the [`Sink`](Sink.html "class in akka.stream.scaladsl") returned by this method is materialized, it returns a [`Source`](Source.html "class in akka.stream.scaladsl") as materialized
		 value. This [`Source`](Source.html "class in akka.stream.scaladsl") can be materialized an arbitrary number of times and each materialization will receive the
		 broadcast elements from the original [`Sink`](Sink.html "class in akka.stream.scaladsl").
		 
		 Every new materialization of the [`Sink`](Sink.html "class in akka.stream.scaladsl") results in a new, independent hub, which materializes to its own
		 [`Source`](Source.html "class in akka.stream.scaladsl") for consuming the [`Sink`](Sink.html "class in akka.stream.scaladsl") of that materialization.
		 
		
		
		 If the original [`Sink`](Sink.html "class in akka.stream.scaladsl") is failed, then the failure is immediately propagated to all of its materialized
		 [`Source`](Source.html "class in akka.stream.scaladsl")s (possibly jumping over already buffered elements). If the original [`Sink`](Sink.html "class in akka.stream.scaladsl") is completed, then
		 all corresponding [`Source`](Source.html "class in akka.stream.scaladsl")s are completed. Both failure and normal completion is "remembered" and later
		 materializations of the [`Source`](Source.html "class in akka.stream.scaladsl") will see the same (failure or completion) state. [`Source`](Source.html "class in akka.stream.scaladsl")s that are
		 cancelled are simply removed from the dynamic set of consumers.
		 
		
		
		
		Parameters:
		`bufferSize` \- Buffer size used by the producer. Gives an upper bound on how "far" from each other two
		 concurrent consumers can be in terms of element. If this buffer is full, the producer
		 is backpressured. Must be a power of two and less than 4096\.
		- #### sink
		
		
		
		```
		public <T> [Sink](Sink.html "class in akka.stream.scaladsl")<T,​[Source](Source.html "class in akka.stream.scaladsl")<T,​[NotUsed](../../NotUsed.html "class in akka")>> sink​(int startAfterNrOfConsumers,
		                                                      int bufferSize)
		```
		
		Creates a [`Sink`](Sink.html "class in akka.stream.scaladsl") that receives elements from its upstream producer and broadcasts them to a dynamic set
		 of consumers. After the [`Sink`](Sink.html "class in akka.stream.scaladsl") returned by this method is materialized, it returns a [`Source`](Source.html "class in akka.stream.scaladsl") as materialized
		 value. This [`Source`](Source.html "class in akka.stream.scaladsl") can be materialized an arbitrary number of times and each materialization will receive the
		 broadcast elements from the original [`Sink`](Sink.html "class in akka.stream.scaladsl").
		 
		 Every new materialization of the [`Sink`](Sink.html "class in akka.stream.scaladsl") results in a new, independent hub, which materializes to its own
		 [`Source`](Source.html "class in akka.stream.scaladsl") for consuming the [`Sink`](Sink.html "class in akka.stream.scaladsl") of that materialization.
		 
		
		
		 If the original [`Sink`](Sink.html "class in akka.stream.scaladsl") is failed, then the failure is immediately propagated to all of its materialized
		 [`Source`](Source.html "class in akka.stream.scaladsl")s (possibly jumping over already buffered elements). If the original [`Sink`](Sink.html "class in akka.stream.scaladsl") is completed, then
		 all corresponding [`Source`](Source.html "class in akka.stream.scaladsl")s are completed. Both failure and normal completion is "remembered" and later
		 materializations of the [`Source`](Source.html "class in akka.stream.scaladsl") will see the same (failure or completion) state. [`Source`](Source.html "class in akka.stream.scaladsl")s that are
		 cancelled are simply removed from the dynamic set of consumers.
		 
		
		
		
		Parameters:
		`startAfterNrOfConsumers` \- Elements are buffered until this number of consumers have been connected.
		 This is only used initially when the operator is starting up, i.e. it is not honored when consumers have
		 been removed (canceled).
		`bufferSize` \- Buffer size used by the producer. Gives an upper bound on how "far" from each other two
		 concurrent consumers can be in terms of element. If this buffer is full, the producer
		 is backpressured. Must be a power of two and less than 4096\.
		- #### sink
		
		
		
		```
		public <T> [Sink](Sink.html "class in akka.stream.scaladsl")<T,​[Source](Source.html "class in akka.stream.scaladsl")<T,​[NotUsed](../../NotUsed.html "class in akka")>> sink()
		```
		
		Creates a [`Sink`](Sink.html "class in akka.stream.scaladsl") with default buffer size 256 that receives elements from its upstream producer and broadcasts them to a dynamic set
		 of consumers. After the [`Sink`](Sink.html "class in akka.stream.scaladsl") returned by this method is materialized, it returns a [`Source`](Source.html "class in akka.stream.scaladsl") as materialized
		 value. This [`Source`](Source.html "class in akka.stream.scaladsl") can be materialized arbitrary many times and each materialization will receive the
		 broadcast elements from the original [`Sink`](Sink.html "class in akka.stream.scaladsl").
		 
		 Every new materialization of the [`Sink`](Sink.html "class in akka.stream.scaladsl") results in a new, independent hub, which materializes to its own
		 [`Source`](Source.html "class in akka.stream.scaladsl") for consuming the [`Sink`](Sink.html "class in akka.stream.scaladsl") of that materialization.
		 
		
		
		 If the original [`Sink`](Sink.html "class in akka.stream.scaladsl") is failed, then the failure is immediately propagated to all of its materialized
		 [`Source`](Source.html "class in akka.stream.scaladsl")s (possibly jumping over already buffered elements). If the original [`Sink`](Sink.html "class in akka.stream.scaladsl") is completed, then
		 all corresponding [`Source`](Source.html "class in akka.stream.scaladsl")s are completed. Both failure and normal completion is "remembered" and later
		 materializations of the [`Source`](Source.html "class in akka.stream.scaladsl") will see the same (failure or completion) state. [`Source`](Source.html "class in akka.stream.scaladsl")s that are
		 cancelled are simply removed from the dynamic set of consumers.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/NotUsed.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/BroadcastHub$.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/Sink.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/Source.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/BroadcastHub$.html](https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/BroadcastHub$.html)*