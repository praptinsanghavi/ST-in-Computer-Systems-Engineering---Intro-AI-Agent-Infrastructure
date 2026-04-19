---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:01:43Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/2.10/akka/stream/javadsl/MergeHub$.html
title: MergeHub$
---

# MergeHub$

## Content

Package [akka.stream.javadsl](package-summary.html)
## Class MergeHub$

- java.lang.Object
- - akka.stream.javadsl.MergeHub$

- ---

```
public class MergeHub$
extends java.lang.Object
```

A MergeHub is a special streaming hub that is able to collect streamed elements from a dynamic set of
 producers. It consists of two parts, a [`Source`](Source.html "class in akka.stream.javadsl") and a [`Sink`](Sink.html "class in akka.stream.javadsl"). The [`Source`](Source.html "class in akka.stream.javadsl") streams the element to a consumer from
 its merged inputs. Once the consumer has been materialized, the [`Source`](Source.html "class in akka.stream.javadsl") returns a materialized value which is
 the corresponding [`Sink`](Sink.html "class in akka.stream.javadsl"). This [`Sink`](Sink.html "class in akka.stream.javadsl") can then be materialized arbitrary many times, where each of the new
 materializations will feed its consumed elements to the original [`Source`](Source.html "class in akka.stream.javadsl").

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [MergeHub$](MergeHub$.html "class in akka.stream.javadsl")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[MergeHub$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<T> [Source](Source.html "class in akka.stream.javadsl")<T,​[Sink](Sink.html "class in akka.stream.javadsl")<T,​[NotUsed](../../NotUsed.html "class in akka")>>` | `[of](#of(java.lang.Class))​(java.lang.Class<T> clazz)` | Creates a [`Source`](Source.html "class in akka.stream.javadsl") that emits elements merged from a dynamic set of producers. |
	| `<T> [Source](Source.html "class in akka.stream.javadsl")<T,​[Sink](Sink.html "class in akka.stream.javadsl")<T,​[NotUsed](../../NotUsed.html "class in akka")>>` | `[of](#of(java.lang.Class,int))​(java.lang.Class<T> clazz,  int perProducerBufferSize)` | Creates a [`Source`](Source.html "class in akka.stream.javadsl") that emits elements merged from a dynamic set of producers. |
	| `<T> [Source](Source.html "class in akka.stream.javadsl")<T,​[Pair](../../japi/Pair.html "class in akka.japi")<[Sink](Sink.html "class in akka.stream.javadsl")<T,​[NotUsed](../../NotUsed.html "class in akka")>,​[MergeHub.DrainingControl](MergeHub.DrainingControl.html "interface in akka.stream.javadsl")>>` | `[withDraining](#withDraining(java.lang.Class))​(java.lang.Class<T> clazz)` | Creates a [`Source`](Source.html "class in akka.stream.javadsl") that emits elements merged from a dynamic set of producers. |
	| `<T> [Source](Source.html "class in akka.stream.javadsl")<T,​[Pair](../../japi/Pair.html "class in akka.japi")<[Sink](Sink.html "class in akka.stream.javadsl")<T,​[NotUsed](../../NotUsed.html "class in akka")>,​[MergeHub.DrainingControl](MergeHub.DrainingControl.html "interface in akka.stream.javadsl")>>` | `[withDraining](#withDraining(java.lang.Class,int))​(java.lang.Class<T> clazz,  int perProducerBufferSize)` | Creates a [`Source`](Source.html "class in akka.stream.javadsl") that emits elements merged from a dynamic set of producers. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [MergeHub$](MergeHub$.html "class in akka.stream.javadsl") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### MergeHub$
		
		
		
		```
		public MergeHub$()
		```

	- ### Method Detail
	
	
	
		- #### of
		
		
		
		```
		public <T> [Source](Source.html "class in akka.stream.javadsl")<T,​[Sink](Sink.html "class in akka.stream.javadsl")<T,​[NotUsed](../../NotUsed.html "class in akka")>> of​(java.lang.Class<T> clazz,
		                                                    int perProducerBufferSize)
		```
		
		Creates a [`Source`](Source.html "class in akka.stream.javadsl") that emits elements merged from a dynamic set of producers. After the [`Source`](Source.html "class in akka.stream.javadsl") returned
		 by this method is materialized, it returns a [`Sink`](Sink.html "class in akka.stream.javadsl") as a materialized value. This [`Sink`](Sink.html "class in akka.stream.javadsl") can be materialized
		 arbitrary many times and each of the materializations will feed the elements into the original [`Source`](Source.html "class in akka.stream.javadsl").
		 
		 Every new materialization of the [`Source`](Source.html "class in akka.stream.javadsl") results in a new, independent hub, which materializes to its own
		 [`Sink`](Sink.html "class in akka.stream.javadsl") for feeding that materialization.
		 
		
		
		 Completed or failed [`Sink`](Sink.html "class in akka.stream.javadsl")s are simply removed. Once the [`Source`](Source.html "class in akka.stream.javadsl") is cancelled, the Hub is considered closed
		 and any new producers using the [`Sink`](Sink.html "class in akka.stream.javadsl") will be cancelled.
		 
		
		
		
		Parameters:
		`clazz` \- Type of elements this hub emits and consumes
		`perProducerBufferSize` \- Buffer space used per producer.
		- #### withDraining
		
		
		
		```
		public <T> [Source](Source.html "class in akka.stream.javadsl")<T,​[Pair](../../japi/Pair.html "class in akka.japi")<[Sink](Sink.html "class in akka.stream.javadsl")<T,​[NotUsed](../../NotUsed.html "class in akka")>,​[MergeHub.DrainingControl](MergeHub.DrainingControl.html "interface in akka.stream.javadsl")>> withDraining​(java.lang.Class<T> clazz,
		                                                                                                   int perProducerBufferSize)
		```
		
		Creates a [`Source`](Source.html "class in akka.stream.javadsl") that emits elements merged from a dynamic set of producers. After the [`Source`](Source.html "class in akka.stream.javadsl") returned
		 by this method is materialized, it returns a [`Sink`](Sink.html "class in akka.stream.javadsl") as a materialized value. This [`Sink`](Sink.html "class in akka.stream.javadsl") can be materialized
		 arbitrarily many times and each of the materializations will feed the elements into the original [`Source`](Source.html "class in akka.stream.javadsl").
		 
		 Every new materialization of the [`Source`](Source.html "class in akka.stream.javadsl") results in a new, independent hub, which materializes to its own
		 [`Sink`](Sink.html "class in akka.stream.javadsl") for feeding that materialization.
		 
		
		
		 Completed or failed [`Sink`](Sink.html "class in akka.stream.javadsl")s are simply removed. Once the [`Source`](Source.html "class in akka.stream.javadsl") is cancelled, the Hub is considered closed
		 and any new producers using the [`Sink`](Sink.html "class in akka.stream.javadsl") will be cancelled.
		 
		
		
		 The materialized `DrainingControl` can be used to drain the Hub: any new produces using the [`Sink`](Sink.html "class in akka.stream.javadsl") will be cancelled
		 and the Hub will be closed completing the [`Source`](Source.html "class in akka.stream.javadsl") as soon as all currently connected producers complete.
		 
		
		
		
		Parameters:
		`clazz` \- Type of elements this hub emits and consumes
		`perProducerBufferSize` \- Buffer space used per producer. Default value is 16\.
		- #### of
		
		
		
		```
		public <T> [Source](Source.html "class in akka.stream.javadsl")<T,​[Sink](Sink.html "class in akka.stream.javadsl")<T,​[NotUsed](../../NotUsed.html "class in akka")>> of​(java.lang.Class<T> clazz)
		```
		
		Creates a [`Source`](Source.html "class in akka.stream.javadsl") that emits elements merged from a dynamic set of producers. After the [`Source`](Source.html "class in akka.stream.javadsl") returned
		 by this method is materialized, it returns a [`Sink`](Sink.html "class in akka.stream.javadsl") as a materialized value. This [`Sink`](Sink.html "class in akka.stream.javadsl") can be materialized
		 arbitrary many times and each of the materializations will feed the elements into the original [`Source`](Source.html "class in akka.stream.javadsl").
		 
		 Every new materialization of the [`Source`](Source.html "class in akka.stream.javadsl") results in a new, independent hub, which materializes to its own
		 [`Sink`](Sink.html "class in akka.stream.javadsl") for feeding that materialization.
		 
		
		
		 Completed or failed [`Sink`](Sink.html "class in akka.stream.javadsl")s are simply removed. Once the [`Source`](Source.html "class in akka.stream.javadsl") is cancelled, the Hub is considered closed
		 and any new producers using the [`Sink`](Sink.html "class in akka.stream.javadsl") will be cancelled.
		 
		
		
		
		Parameters:
		`clazz` \- Type of elements this hub emits and consumes
		- #### withDraining
		
		
		
		```
		public <T> [Source](Source.html "class in akka.stream.javadsl")<T,​[Pair](../../japi/Pair.html "class in akka.japi")<[Sink](Sink.html "class in akka.stream.javadsl")<T,​[NotUsed](../../NotUsed.html "class in akka")>,​[MergeHub.DrainingControl](MergeHub.DrainingControl.html "interface in akka.stream.javadsl")>> withDraining​(java.lang.Class<T> clazz)
		```
		
		Creates a [`Source`](Source.html "class in akka.stream.javadsl") that emits elements merged from a dynamic set of producers. After the [`Source`](Source.html "class in akka.stream.javadsl") returned
		 by this method is materialized, it returns a [`Sink`](Sink.html "class in akka.stream.javadsl") as a materialized value. This [`Sink`](Sink.html "class in akka.stream.javadsl") can be materialized
		 arbitrarily many times and each of the materializations will feed the elements into the original [`Source`](Source.html "class in akka.stream.javadsl").
		 
		 Every new materialization of the [`Source`](Source.html "class in akka.stream.javadsl") results in a new, independent hub, which materializes to its own
		 [`Sink`](Sink.html "class in akka.stream.javadsl") for feeding that materialization.
		 
		
		
		 Completed or failed [`Sink`](Sink.html "class in akka.stream.javadsl")s are simply removed. Once the [`Source`](Source.html "class in akka.stream.javadsl") is cancelled, the Hub is considered closed
		 and any new producers using the [`Sink`](Sink.html "class in akka.stream.javadsl") will be cancelled.
		 
		
		
		 The materialized `DrainingControl` can be used to drain the Hub: any new produces using the [`Sink`](Sink.html "class in akka.stream.javadsl") will be cancelled
		 and the Hub will be closed completing the [`Source`](Source.html "class in akka.stream.javadsl") as soon as all currently connected producers complete.
		 
		
		
		
		Parameters:
		`clazz` \- Type of elements this hub emits and consumes

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/2.10/akka/NotUsed.html
- https://doc.akka.io/japi/akka/2.10/akka/japi/Pair.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/javadsl/MergeHub$.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/javadsl/MergeHub.DrainingControl.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/javadsl/Sink.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/javadsl/Source.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/javadsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/2.10/akka/stream/javadsl/MergeHub$.html](https://doc.akka.io/japi/akka/2.10/akka/stream/javadsl/MergeHub$.html)*