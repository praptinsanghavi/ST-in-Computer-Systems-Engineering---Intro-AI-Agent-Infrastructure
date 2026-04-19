---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:35:16Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/MergeSequence.html
title: MergeSequence
---

# MergeSequence

## Content

Package [akka.stream.javadsl](package-summary.html)
## Class MergeSequence

- java.lang.Object
- - akka.stream.javadsl.MergeSequence

- ---

```
public class MergeSequence
extends java.lang.Object
```

Takes multiple streams whose elements in aggregate have a defined linear
 sequence with difference 1, starting at 0, and outputs a single stream
 containing these elements, in order. That is, given a set of input streams
 with combined elements \*ek\*:
 
 \*e0\*, \*e1\*, \*e2\*, ..., \*en\*
 

 This will output a stream ordered by \*k\*.
 

 The elements in the input streams must already be sorted according to the
 sequence. The input streams do not need to be linear, but the aggregate
 stream must be linear, no element \*k\* may be skipped or duplicated, either
 of these conditions will cause the stream to fail.
 

 The typical use case for this is to merge a partitioned stream back
 together while maintaining order. This can be achieved by first using
 `zipWithIndex` on the input stream, then partitioning using a
 [`Partition`](Partition.html "class in akka.stream.javadsl") fanout, and then maintaining the index through the processing
 of each partition before bringing together with this stage.
 

 '''Emits when''' one of the upstreams has the next expected element in the
 sequence available.
 

 '''Backpressures when''' downstream backpressures
 

 '''Completes when''' all upstreams complete
 

 '''Cancels when''' downstream cancels

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[MergeSequence](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static <T> [Graph](../Graph.html "interface in akka.stream")<[UniformFanInShape](../UniformFanInShape.html "class in akka.stream")<T,​T>,​[NotUsed](../../NotUsed.html "class in akka")>` | `[create](#create(int,akka.japi.function.Function))​(int inputCount,  [Function](../../japi/function/Function.html "interface in akka.japi.function")<T,​java.lang.Object> extractSequence)` | Create a new anonymous `MergeSequence` operator. |
	| `static <T> [Graph](../Graph.html "interface in akka.stream")<[UniformFanInShape](../UniformFanInShape.html "class in akka.stream")<T,​T>,​[NotUsed](../../NotUsed.html "class in akka")>` | `[create](#create(akka.japi.function.Function))​([Function](../../japi/function/Function.html "interface in akka.japi.function")<T,​java.lang.Object> extractSequence)` | Create a new anonymous `MergeSequence` operator with two input ports. |
	| `static <T> [Graph](../Graph.html "interface in akka.stream")<[UniformFanInShape](../UniformFanInShape.html "class in akka.stream")<T,​T>,​[NotUsed](../../NotUsed.html "class in akka")>` | `[create](#create(java.lang.Class,int,akka.japi.function.Function))​(java.lang.Class<T> clazz,  int inputCount,  [Function](../../japi/function/Function.html "interface in akka.japi.function")<T,​java.lang.Object> extractSequence)` | Create a new anonymous `Concat` operator with the specified input types. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### MergeSequence
		
		
		
		```
		public MergeSequence()
		```

	- ### Method Detail
	
	
	
		- #### create
		
		
		
		```
		public static <T> [Graph](../Graph.html "interface in akka.stream")<[UniformFanInShape](../UniformFanInShape.html "class in akka.stream")<T,​T>,​[NotUsed](../../NotUsed.html "class in akka")> create​([Function](../../japi/function/Function.html "interface in akka.japi.function")<T,​java.lang.Object> extractSequence)
		```
		
		Create a new anonymous `MergeSequence` operator with two input ports.
		 
		
		Parameters:
		`extractSequence` \- The function to extract the sequence from an element.
		- #### create
		
		
		
		```
		public static <T> [Graph](../Graph.html "interface in akka.stream")<[UniformFanInShape](../UniformFanInShape.html "class in akka.stream")<T,​T>,​[NotUsed](../../NotUsed.html "class in akka")> create​(int inputCount,
		                                                                           [Function](../../japi/function/Function.html "interface in akka.japi.function")<T,​java.lang.Object> extractSequence)
		```
		
		Create a new anonymous `MergeSequence` operator.
		 
		
		Parameters:
		`inputCount` \- The number of input streams.
		`extractSequence` \- The function to extract the sequence from an element.
		- #### create
		
		
		
		```
		public static <T> [Graph](../Graph.html "interface in akka.stream")<[UniformFanInShape](../UniformFanInShape.html "class in akka.stream")<T,​T>,​[NotUsed](../../NotUsed.html "class in akka")> create​(java.lang.Class<T> clazz,
		                                                                           int inputCount,
		                                                                           [Function](../../japi/function/Function.html "interface in akka.japi.function")<T,​java.lang.Object> extractSequence)
		```
		
		Create a new anonymous `Concat` operator with the specified input types.
		 
		
		Parameters:
		`clazz` \- a type hint for this method
		`inputCount` \- The number of input streams.
		`extractSequence` \- The function to extract the sequence from an element.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/NotUsed.html
- https://doc.akka.io/japi/akka-core/2.10/akka/japi/function/Function.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/Graph.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/UniformFanInShape.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Partition.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/MergeSequence.html](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/MergeSequence.html)*