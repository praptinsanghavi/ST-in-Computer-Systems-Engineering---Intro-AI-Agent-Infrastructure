---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:52:10Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/PartitionHub$.html
title: PartitionHub$
---

# PartitionHub$

## Content

Package [akka.stream.javadsl](package-summary.html)
## Class PartitionHub$

- java.lang.Object
- - akka.stream.javadsl.PartitionHub$

- ---

```
public class PartitionHub$
extends java.lang.Object
```

A `PartitionHub` is a special streaming hub that is able to route streamed elements to a dynamic set of consumers.
 It consists of two parts, a [`Sink`](Sink.html "class in akka.stream.javadsl") and a [`Source`](Source.html "class in akka.stream.javadsl"). The [`Sink`](Sink.html "class in akka.stream.javadsl") e elements from a producer to the
 actually live consumers it has. The selection of consumer is done with a function. Each element can be routed to
 only one consumer. Once the producer has been materialized, the [`Sink`](Sink.html "class in akka.stream.javadsl") it feeds into returns a
 materialized value which is the corresponding [`Source`](Source.html "class in akka.stream.javadsl"). This [`Source`](Source.html "class in akka.stream.javadsl") can be materialized an arbitrary number
 of times, where each of the new materializations will receive their elements from the original [`Sink`](Sink.html "class in akka.stream.javadsl").

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [PartitionHub$](PartitionHub$.html "class in akka.stream.javadsl")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[PartitionHub$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<T> [Sink](Sink.html "class in akka.stream.javadsl")<T,​[Source](Source.html "class in akka.stream.javadsl")<T,​[NotUsed](../../NotUsed.html "class in akka")>>` | `[of](#of(java.lang.Class,java.util.function.BiFunction,int))​(java.lang.Class<T> clazz,  java.util.function.BiFunction<java.lang.Integer,​T,​java.lang.Integer> partitioner,  int startAfterNrOfConsumers)` | Creates a [`Sink`](Sink.html "class in akka.stream.javadsl") with default buffer size 256 that receives elements from its upstream producer and routes them to a dynamic set  of consumers. |
	| `<T> [Sink](Sink.html "class in akka.stream.javadsl")<T,​[Source](Source.html "class in akka.stream.javadsl")<T,​[NotUsed](../../NotUsed.html "class in akka")>>` | `[of](#of(java.lang.Class,java.util.function.BiFunction,int,int))​(java.lang.Class<T> clazz,  java.util.function.BiFunction<java.lang.Integer,​T,​java.lang.Integer> partitioner,  int startAfterNrOfConsumers,  int bufferSize)` | Creates a [`Sink`](Sink.html "class in akka.stream.javadsl") that receives elements from its upstream producer and routes them to a dynamic set  of consumers. |
	| `<T> [Sink](Sink.html "class in akka.stream.javadsl")<T,​[Source](Source.html "class in akka.stream.javadsl")<T,​[NotUsed](../../NotUsed.html "class in akka")>>` | `[ofStateful](#ofStateful(java.lang.Class,java.util.function.Supplier,int))​(java.lang.Class<T> clazz,  java.util.function.Supplier<java.util.function.ToLongBiFunction<[PartitionHub.ConsumerInfo](PartitionHub.ConsumerInfo.html "interface in akka.stream.javadsl"),​T>> partitioner,  int startAfterNrOfConsumers)` | Creates a [`Sink`](Sink.html "class in akka.stream.javadsl") with default buffer size 256 that receives elements from its upstream producer and routes them to a dynamic set  of consumers. |
	| `<T> [Sink](Sink.html "class in akka.stream.javadsl")<T,​[Source](Source.html "class in akka.stream.javadsl")<T,​[NotUsed](../../NotUsed.html "class in akka")>>` | `[ofStateful](#ofStateful(java.lang.Class,java.util.function.Supplier,int,int))​(java.lang.Class<T> clazz,  java.util.function.Supplier<java.util.function.ToLongBiFunction<[PartitionHub.ConsumerInfo](PartitionHub.ConsumerInfo.html "interface in akka.stream.javadsl"),​T>> partitioner,  int startAfterNrOfConsumers,  int bufferSize)` | Creates a [`Sink`](Sink.html "class in akka.stream.javadsl") that receives elements from its upstream producer and routes them to a dynamic set  of consumers. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [PartitionHub$](PartitionHub$.html "class in akka.stream.javadsl") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### PartitionHub$
		
		
		
		```
		public PartitionHub$()
		```

	- ### Method Detail
	
	
	
		- #### ofStateful
		
		
		
		```
		public <T> [Sink](Sink.html "class in akka.stream.javadsl")<T,​[Source](Source.html "class in akka.stream.javadsl")<T,​[NotUsed](../../NotUsed.html "class in akka")>> ofStateful​(java.lang.Class<T> clazz,
		                                                            java.util.function.Supplier<java.util.function.ToLongBiFunction<[PartitionHub.ConsumerInfo](PartitionHub.ConsumerInfo.html "interface in akka.stream.javadsl"),​T>> partitioner,
		                                                            int startAfterNrOfConsumers,
		                                                            int bufferSize)
		```
		
		Creates a [`Sink`](Sink.html "class in akka.stream.javadsl") that receives elements from its upstream producer and routes them to a dynamic set
		 of consumers. After the [`Sink`](Sink.html "class in akka.stream.javadsl") returned by this method is materialized, it returns a [`Source`](Source.html "class in akka.stream.javadsl") as materialized
		 value. This [`Source`](Source.html "class in akka.stream.javadsl") can be materialized an arbitrary number of times and each materialization will receive the
		 elements from the original [`Sink`](Sink.html "class in akka.stream.javadsl").
		 
		 Every new materialization of the [`Sink`](Sink.html "class in akka.stream.javadsl") results in a new, independent hub, which materializes to its own
		 [`Source`](Source.html "class in akka.stream.javadsl") for consuming the [`Sink`](Sink.html "class in akka.stream.javadsl") of that materialization.
		 
		
		
		 If the original [`Sink`](Sink.html "class in akka.stream.javadsl") is failed, then the failure is immediately propagated to all of its materialized
		 [`Source`](Source.html "class in akka.stream.javadsl")s (possibly jumping over already buffered elements). If the original [`Sink`](Sink.html "class in akka.stream.javadsl") is completed, then
		 all corresponding [`Source`](Source.html "class in akka.stream.javadsl")s are completed. Both failure and normal completion is "remembered" and later
		 materializations of the [`Source`](Source.html "class in akka.stream.javadsl") will see the same (failure or completion) state. [`Source`](Source.html "class in akka.stream.javadsl")s that are
		 cancelled are simply removed from the dynamic set of consumers.
		 
		
		
		 This `statefulSink` should be used when there is a need to keep mutable state in the partition function,
		 e.g. for implementing round\-robin or sticky session kind of routing. If state is not needed the [`of(java.lang.Class<T>, java.util.function.BiFunction<java.lang.Integer, T, java.lang.Integer>, int, int)`](#of(java.lang.Class,java.util.function.BiFunction,int,int)) can
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
		- #### ofStateful
		
		
		
		```
		public <T> [Sink](Sink.html "class in akka.stream.javadsl")<T,​[Source](Source.html "class in akka.stream.javadsl")<T,​[NotUsed](../../NotUsed.html "class in akka")>> ofStateful​(java.lang.Class<T> clazz,
		                                                            java.util.function.Supplier<java.util.function.ToLongBiFunction<[PartitionHub.ConsumerInfo](PartitionHub.ConsumerInfo.html "interface in akka.stream.javadsl"),​T>> partitioner,
		                                                            int startAfterNrOfConsumers)
		```
		
		Creates a [`Sink`](Sink.html "class in akka.stream.javadsl") with default buffer size 256 that receives elements from its upstream producer and routes them to a dynamic set
		 of consumers. After the [`Sink`](Sink.html "class in akka.stream.javadsl") returned by this method is materialized, it returns a [`Source`](Source.html "class in akka.stream.javadsl") as materialized
		 value. This [`Source`](Source.html "class in akka.stream.javadsl") can be materialized an arbitrary number of times and each materialization will receive the
		 elements from the original [`Sink`](Sink.html "class in akka.stream.javadsl").
		 
		 Every new materialization of the [`Sink`](Sink.html "class in akka.stream.javadsl") results in a new, independent hub, which materializes to its own
		 [`Source`](Source.html "class in akka.stream.javadsl") for consuming the [`Sink`](Sink.html "class in akka.stream.javadsl") of that materialization.
		 
		
		
		 If the original [`Sink`](Sink.html "class in akka.stream.javadsl") is failed, then the failure is immediately propagated to all of its materialized
		 [`Source`](Source.html "class in akka.stream.javadsl")s (possibly jumping over already buffered elements). If the original [`Sink`](Sink.html "class in akka.stream.javadsl") is completed, then
		 all corresponding [`Source`](Source.html "class in akka.stream.javadsl")s are completed. Both failure and normal completion is "remembered" and later
		 materializations of the [`Source`](Source.html "class in akka.stream.javadsl") will see the same (failure or completion) state. [`Source`](Source.html "class in akka.stream.javadsl")s that are
		 cancelled are simply removed from the dynamic set of consumers.
		 
		
		
		 This `statefulSink` should be used when there is a need to keep mutable state in the partition function,
		 e.g. for implementing round\-robin or sticky session kind of routing. If state is not needed the [`of(java.lang.Class<T>, java.util.function.BiFunction<java.lang.Integer, T, java.lang.Integer>, int, int)`](#of(java.lang.Class,java.util.function.BiFunction,int,int)) can
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
		- #### of
		
		
		
		```
		public <T> [Sink](Sink.html "class in akka.stream.javadsl")<T,​[Source](Source.html "class in akka.stream.javadsl")<T,​[NotUsed](../../NotUsed.html "class in akka")>> of​(java.lang.Class<T> clazz,
		                                                    java.util.function.BiFunction<java.lang.Integer,​T,​java.lang.Integer> partitioner,
		                                                    int startAfterNrOfConsumers,
		                                                    int bufferSize)
		```
		
		Creates a [`Sink`](Sink.html "class in akka.stream.javadsl") that receives elements from its upstream producer and routes them to a dynamic set
		 of consumers. After the [`Sink`](Sink.html "class in akka.stream.javadsl") returned by this method is materialized, it returns a [`Source`](Source.html "class in akka.stream.javadsl") as materialized
		 value. This [`Source`](Source.html "class in akka.stream.javadsl") can be materialized an arbitrary number of times and each materialization will receive the
		 elements from the original [`Sink`](Sink.html "class in akka.stream.javadsl").
		 
		 Every new materialization of the [`Sink`](Sink.html "class in akka.stream.javadsl") results in a new, independent hub, which materializes to its own
		 [`Source`](Source.html "class in akka.stream.javadsl") for consuming the [`Sink`](Sink.html "class in akka.stream.javadsl") of that materialization.
		 
		
		
		 If the original [`Sink`](Sink.html "class in akka.stream.javadsl") is failed, then the failure is immediately propagated to all of its materialized
		 [`Source`](Source.html "class in akka.stream.javadsl")s (possibly jumping over already buffered elements). If the original [`Sink`](Sink.html "class in akka.stream.javadsl") is completed, then
		 all corresponding [`Source`](Source.html "class in akka.stream.javadsl")s are completed. Both failure and normal completion is "remembered" and later
		 materializations of the [`Source`](Source.html "class in akka.stream.javadsl") will see the same (failure or completion) state. [`Source`](Source.html "class in akka.stream.javadsl")s that are
		 cancelled are simply removed from the dynamic set of consumers.
		 
		
		
		 This `sink` should be used when the routing function is stateless, e.g. based on a hashed value of the
		 elements. Otherwise the [`ofStateful(java.lang.Class<T>, java.util.function.Supplier<java.util.function.ToLongBiFunction<akka.stream.javadsl.PartitionHub.ConsumerInfo, T>>, int, int)`](#ofStateful(java.lang.Class,java.util.function.Supplier,int,int)) can be used to implement more advanced routing logic.
		 
		
		
		
		Parameters:
		`partitioner` \- Function that decides where to route an element. The function takes two parameters;
		 the first is the number of active consumers and the second is the stream element. The function should
		 return the index of the selected consumer for the given element, i.e. int greater than or equal to 0
		 and less than number of consumers. E.g. `(size, elem) -> Math.abs(elem.hashCode() % size)`. It's also
		 possible to use `-1` to drop the element.
		`startAfterNrOfConsumers` \- Elements are buffered until this number of consumers have been connected.
		 This is only used initially when the operator is starting up, i.e. it is not honored when consumers have
		 been removed (canceled).
		`bufferSize` \- Total number of elements that can be buffered. If this buffer is full, the producer
		 is backpressured.
		- #### of
		
		
		
		```
		public <T> [Sink](Sink.html "class in akka.stream.javadsl")<T,​[Source](Source.html "class in akka.stream.javadsl")<T,​[NotUsed](../../NotUsed.html "class in akka")>> of​(java.lang.Class<T> clazz,
		                                                    java.util.function.BiFunction<java.lang.Integer,​T,​java.lang.Integer> partitioner,
		                                                    int startAfterNrOfConsumers)
		```
		
		Creates a [`Sink`](Sink.html "class in akka.stream.javadsl") with default buffer size 256 that receives elements from its upstream producer and routes them to a dynamic set
		 of consumers. After the [`Sink`](Sink.html "class in akka.stream.javadsl") returned by this method is materialized, it returns a [`Source`](Source.html "class in akka.stream.javadsl") as materialized
		 value. This [`Source`](Source.html "class in akka.stream.javadsl") can be materialized an arbitrary number of times and each materialization will receive the
		 elements from the original [`Sink`](Sink.html "class in akka.stream.javadsl").
		 
		 Every new materialization of the [`Sink`](Sink.html "class in akka.stream.javadsl") results in a new, independent hub, which materializes to its own
		 [`Source`](Source.html "class in akka.stream.javadsl") for consuming the [`Sink`](Sink.html "class in akka.stream.javadsl") of that materialization.
		 
		
		
		 If the original [`Sink`](Sink.html "class in akka.stream.javadsl") is failed, then the failure is immediately propagated to all of its materialized
		 [`Source`](Source.html "class in akka.stream.javadsl")s (possibly jumping over already buffered elements). If the original [`Sink`](Sink.html "class in akka.stream.javadsl") is completed, then
		 all corresponding [`Source`](Source.html "class in akka.stream.javadsl")s are completed. Both failure and normal completion is "remembered" and later
		 materializations of the [`Source`](Source.html "class in akka.stream.javadsl") will see the same (failure or completion) state. [`Source`](Source.html "class in akka.stream.javadsl")s that are
		 cancelled are simply removed from the dynamic set of consumers.
		 
		
		
		 This `sink` should be used when the routing function is stateless, e.g. based on a hashed value of the
		 elements. Otherwise the [`ofStateful(java.lang.Class<T>, java.util.function.Supplier<java.util.function.ToLongBiFunction<akka.stream.javadsl.PartitionHub.ConsumerInfo, T>>, int, int)`](#ofStateful(java.lang.Class,java.util.function.Supplier,int,int)) can be used to implement more advanced routing logic.
		 
		
		
		
		Parameters:
		`partitioner` \- Function that decides where to route an element. The function takes two parameters;
		 the first is the number of active consumers and the second is the stream element. The function should
		 return the index of the selected consumer for the given element, i.e. int greater than or equal to 0
		 and less than number of consumers. E.g. `(size, elem) -> Math.abs(elem.hashCode() % size)`. It's also
		 possible to use `-1` to drop the element.
		`startAfterNrOfConsumers` \- Elements are buffered until this number of consumers have been connected.
		 This is only used initially when the operator is starting up, i.e. it is not honored when consumers have
		 been removed (canceled).
		`bufferSize` \- Total number of elements that can be buffered. If this buffer is full, the producer
		 is backpressured.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/NotUsed.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/PartitionHub$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/PartitionHub.ConsumerInfo.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Sink.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/PartitionHub$.html](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/PartitionHub$.html)*