---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:41:56Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/PartitionHub$.html
title: PartitionHub$
---

# PartitionHub$

## Content

Package [akka.stream.scaladsl](package-summary.html)
## Class PartitionHub$

- java.lang.Object
- - akka.stream.scaladsl.PartitionHub$

- ---

```
public class PartitionHub$
extends java.lang.Object
```

A `PartitionHub` is a special streaming hub that is able to route streamed elements to a dynamic set of consumers.
 It consists of two parts, a [`Sink`](Sink.html "class in akka.stream.scaladsl") and a [`Source`](Source.html "class in akka.stream.scaladsl"). The [`Sink`](Sink.html "class in akka.stream.scaladsl") e elements from a producer to the
 actually live consumers it has. The selection of consumer is done with a function. Each element can be routed to
 only one consumer. Once the producer has been materialized, the [`Sink`](Sink.html "class in akka.stream.scaladsl") it feeds into returns a
 materialized value which is the corresponding [`Source`](Source.html "class in akka.stream.scaladsl"). This [`Source`](Source.html "class in akka.stream.scaladsl") can be materialized an arbitrary number
 of times, where each of the new materializations will receive their elements from the original [`Sink`](Sink.html "class in akka.stream.scaladsl").

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [PartitionHub$](PartitionHub$.html "class in akka.stream.scaladsl")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[PartitionHub$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<T> [Sink](Sink.html "class in akka.stream.scaladsl")<T,​[Source](Source.html "class in akka.stream.scaladsl")<T,​[NotUsed](../../NotUsed.html "class in akka")>>` | `[sink](#sink(scala.Function2,int,int))​(scala.Function2<java.lang.Object,​T,​java.lang.Object> partitioner,  int startAfterNrOfConsumers,  int bufferSize)` | Creates a [`Sink`](Sink.html "class in akka.stream.scaladsl") that receives elements from its upstream producer and routes them to a dynamic set  of consumers. |
	| `<T> int` | `[sink$default$3](#sink$default$3())()` |  |
	| `<T> [Sink](Sink.html "class in akka.stream.scaladsl")<T,​[Source](Source.html "class in akka.stream.scaladsl")<T,​[NotUsed](../../NotUsed.html "class in akka")>>` | `[statefulSink](#statefulSink(scala.Function0,int,int))​(scala.Function0<scala.Function2<akka.stream.scaladsl.PartitionHub.ConsumerInfo,​T,​java.lang.Object>> partitioner,  int startAfterNrOfConsumers,  int bufferSize)` | Creates a [`Sink`](Sink.html "class in akka.stream.scaladsl") that receives elements from its upstream producer and routes them to a dynamic set  of consumers. |
	| `<T> int` | `[statefulSink$default$3](#statefulSink$default$3())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [PartitionHub$](PartitionHub$.html "class in akka.stream.scaladsl") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### PartitionHub$
		
		
		
		```
		public PartitionHub$()
		```

	- ### Method Detail
	
	
	
		- #### statefulSink
		
		
		
		```
		public <T> [Sink](Sink.html "class in akka.stream.scaladsl")<T,​[Source](Source.html "class in akka.stream.scaladsl")<T,​[NotUsed](../../NotUsed.html "class in akka")>> statefulSink​(scala.Function0<scala.Function2<akka.stream.scaladsl.PartitionHub.ConsumerInfo,​T,​java.lang.Object>> partitioner,
		                                                              int startAfterNrOfConsumers,
		                                                              int bufferSize)
		```
		
		Creates a [`Sink`](Sink.html "class in akka.stream.scaladsl") that receives elements from its upstream producer and routes them to a dynamic set
		 of consumers. After the [`Sink`](Sink.html "class in akka.stream.scaladsl") returned by this method is materialized, it returns a [`Source`](Source.html "class in akka.stream.scaladsl") as materialized
		 value. This [`Source`](Source.html "class in akka.stream.scaladsl") can be materialized an arbitrary number of times and each materialization will receive the
		 elements from the original [`Sink`](Sink.html "class in akka.stream.scaladsl").
		 
		 Every new materialization of the [`Sink`](Sink.html "class in akka.stream.scaladsl") results in a new, independent hub, which materializes to its own
		 [`Source`](Source.html "class in akka.stream.scaladsl") for consuming the [`Sink`](Sink.html "class in akka.stream.scaladsl") of that materialization.
		 
		
		
		 If the original [`Sink`](Sink.html "class in akka.stream.scaladsl") is failed, then the failure is immediately propagated to all of its materialized
		 [`Source`](Source.html "class in akka.stream.scaladsl")s (possibly jumping over already buffered elements). If the original [`Sink`](Sink.html "class in akka.stream.scaladsl") is completed, then
		 all corresponding [`Source`](Source.html "class in akka.stream.scaladsl")s are completed. Both failure and normal completion is "remembered" and later
		 materializations of the [`Source`](Source.html "class in akka.stream.scaladsl") will see the same (failure or completion) state. [`Source`](Source.html "class in akka.stream.scaladsl")s that are
		 cancelled are simply removed from the dynamic set of consumers.
		 
		
		
		 This `statefulSink` should be used when there is a need to keep mutable state in the partition function,
		 e.g. for implementing round\-robin or sticky session kind of routing. If state is not needed the [`sink(scala.Function2<java.lang.Object, T, java.lang.Object>, int, int)`](#sink(scala.Function2,int,int)) can
		 be more convenient to use.
		 
		
		
		
		Parameters:
		`partitioner` \- Function that decides where to route an element. It is a factory of a function to
		 to be able to hold stateful variables that are unique for each materialization. The function
		 takes two parameters; the first is information about active consumers, including an array of consumer
		 identifiers and the second is the stream element. The function should return the selected consumer
		 identifier for the given element. The function will never be called when there are no active consumers,
		 i.e. there is always at least one element in the array of identifiers.
		`startAfterNrOfConsumers` \- Elements are buffered until this number of consumers have been connected.
		 This is only used initially when the operator is starting up, i.e. it is not honored when consumers have
		 been removed (canceled).
		`bufferSize` \- Total number of elements that can be buffered. If this buffer is full, the producer
		 is backpressured.
		- #### statefulSink$default$3
		
		
		
		```
		public <T> int statefulSink$default$3()
		```
		- #### sink
		
		
		
		```
		public <T> [Sink](Sink.html "class in akka.stream.scaladsl")<T,​[Source](Source.html "class in akka.stream.scaladsl")<T,​[NotUsed](../../NotUsed.html "class in akka")>> sink​(scala.Function2<java.lang.Object,​T,​java.lang.Object> partitioner,
		                                                      int startAfterNrOfConsumers,
		                                                      int bufferSize)
		```
		
		Creates a [`Sink`](Sink.html "class in akka.stream.scaladsl") that receives elements from its upstream producer and routes them to a dynamic set
		 of consumers. After the [`Sink`](Sink.html "class in akka.stream.scaladsl") returned by this method is materialized, it returns a [`Source`](Source.html "class in akka.stream.scaladsl") as materialized
		 value. This [`Source`](Source.html "class in akka.stream.scaladsl") can be materialized an arbitrary number of times and each materialization will receive the
		 elements from the original [`Sink`](Sink.html "class in akka.stream.scaladsl").
		 
		 Every new materialization of the [`Sink`](Sink.html "class in akka.stream.scaladsl") results in a new, independent hub, which materializes to its own
		 [`Source`](Source.html "class in akka.stream.scaladsl") for consuming the [`Sink`](Sink.html "class in akka.stream.scaladsl") of that materialization.
		 
		
		
		 If the original [`Sink`](Sink.html "class in akka.stream.scaladsl") is failed, then the failure is immediately propagated to all of its materialized
		 [`Source`](Source.html "class in akka.stream.scaladsl")s (possibly jumping over already buffered elements). If the original [`Sink`](Sink.html "class in akka.stream.scaladsl") is completed, then
		 all corresponding [`Source`](Source.html "class in akka.stream.scaladsl")s are completed. Both failure and normal completion is "remembered" and later
		 materializations of the [`Source`](Source.html "class in akka.stream.scaladsl") will see the same (failure or completion) state. [`Source`](Source.html "class in akka.stream.scaladsl")s that are
		 cancelled are simply removed from the dynamic set of consumers.
		 
		
		
		 This `sink` should be used when the routing function is stateless, e.g. based on a hashed value of the
		 elements. Otherwise the [`statefulSink(scala.Function0<scala.Function2<akka.stream.scaladsl.PartitionHub.ConsumerInfo, T, java.lang.Object>>, int, int)`](#statefulSink(scala.Function0,int,int)) can be used to implement more advanced routing logic.
		 
		
		
		
		Parameters:
		`partitioner` \- Function that decides where to route an element. The function takes two parameters;
		 the first is the number of active consumers and the second is the stream element. The function should
		 return the index of the selected consumer for the given element, i.e. int greater than or equal to 0
		 and less than number of consumers. E.g. `(size, elem) => math.abs(elem.hashCode % size)`. It's also
		 possible to use `-1` to drop the element.
		`startAfterNrOfConsumers` \- Elements are buffered until this number of consumers have been connected.
		 This is only used initially when the operator is starting up, i.e. it is not honored when consumers have
		 been removed (canceled).
		`bufferSize` \- Total number of elements that can be buffered. If this buffer is full, the producer
		 is backpressured.
		- #### sink$default$3
		
		
		
		```
		public <T> int sink$default$3()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/NotUsed.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/PartitionHub$.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/Sink.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/Source.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/PartitionHub$.html](https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/PartitionHub$.html)*