---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:45:01Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/stream/javadsl/Partition$.html
title: Partition$
---

# Partition$

## Content

Package [akka.stream.javadsl](package-summary.html)
## Class Partition$

- java.lang.Object
- - akka.stream.javadsl.Partition$

- ---

```
public class Partition$
extends java.lang.Object
```

Fan\-out the stream to several streams. emitting an incoming upstream element to one downstream consumer according
 to the partitioner function applied to the element
 
 Adheres to the `ActorAttributes.SupervisionStrategy` attribute.
 

 '''Emits when''' all of the outputs stops backpressuring and there is an input element available
 

 '''Backpressures when''' one of the outputs backpressure
 

 '''Completes when''' upstream completes
 

 '''Cancels when'''
 when any (eagerCancel\=true) or all (eagerCancel\=false) of the downstreams cancel

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Partition$](Partition$.html "class in akka.stream.javadsl")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Partition$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<T> [Graph](../Graph.html "interface in akka.stream")<[UniformFanOutShape](../UniformFanOutShape.html "class in akka.stream")<T,​T>,​[NotUsed](../../NotUsed.html "class in akka")>` | `[create](#create(int,akka.japi.function.Function))​(int outputCount,  [Function](../../japi/function/Function.html "interface in akka.japi.function")<T,​java.lang.Integer> partitioner)` | Create a new `Partition` operator with the specified input type, `eagerCancel` is `false`. |
	| `<T> [Graph](../Graph.html "interface in akka.stream")<[UniformFanOutShape](../UniformFanOutShape.html "class in akka.stream")<T,​T>,​[NotUsed](../../NotUsed.html "class in akka")>` | `[create](#create(int,akka.japi.function.Function,boolean))​(int outputCount,  [Function](../../japi/function/Function.html "interface in akka.japi.function")<T,​java.lang.Integer> partitioner,  boolean eagerCancel)` | Create a new `Partition` operator with the specified input type. |
	| `<T> [Graph](../Graph.html "interface in akka.stream")<[UniformFanOutShape](../UniformFanOutShape.html "class in akka.stream")<T,​T>,​[NotUsed](../../NotUsed.html "class in akka")>` | `[create](#create(java.lang.Class,int,akka.japi.function.Function))​(java.lang.Class<T> clazz,  int outputCount,  [Function](../../japi/function/Function.html "interface in akka.japi.function")<T,​java.lang.Integer> partitioner)` | Create a new `Partition` operator with the specified input type, `eagerCancel` is `false`. |
	| `<T> [Graph](../Graph.html "interface in akka.stream")<[UniformFanOutShape](../UniformFanOutShape.html "class in akka.stream")<T,​T>,​[NotUsed](../../NotUsed.html "class in akka")>` | `[create](#create(java.lang.Class,int,akka.japi.function.Function,boolean))​(java.lang.Class<T> clazz,  int outputCount,  [Function](../../japi/function/Function.html "interface in akka.japi.function")<T,​java.lang.Integer> partitioner,  boolean eagerCancel)` | Create a new `Partition` operator with the specified input type. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [Partition$](Partition$.html "class in akka.stream.javadsl") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Partition$
		
		
		
		```
		public Partition$()
		```

	- ### Method Detail
	
	
	
		- #### create
		
		
		
		```
		public <T> [Graph](../Graph.html "interface in akka.stream")<[UniformFanOutShape](../UniformFanOutShape.html "class in akka.stream")<T,​T>,​[NotUsed](../../NotUsed.html "class in akka")> create​(int outputCount,
		                                                                     [Function](../../japi/function/Function.html "interface in akka.japi.function")<T,​java.lang.Integer> partitioner)
		```
		
		Create a new `Partition` operator with the specified input type, `eagerCancel` is `false`.
		 
		
		Parameters:
		`outputCount` \- number of output ports
		`partitioner` \- function deciding which output each element will be targeted
		- #### create
		
		
		
		```
		public <T> [Graph](../Graph.html "interface in akka.stream")<[UniformFanOutShape](../UniformFanOutShape.html "class in akka.stream")<T,​T>,​[NotUsed](../../NotUsed.html "class in akka")> create​(int outputCount,
		                                                                     [Function](../../japi/function/Function.html "interface in akka.japi.function")<T,​java.lang.Integer> partitioner,
		                                                                     boolean eagerCancel)
		```
		
		Create a new `Partition` operator with the specified input type.
		 
		
		Parameters:
		`outputCount` \- number of output ports
		`partitioner` \- function deciding which output each element will be targeted
		`eagerCancel` \- this operator cancels, when any (true) or all (false) of the downstreams cancel
		- #### create
		
		
		
		```
		public <T> [Graph](../Graph.html "interface in akka.stream")<[UniformFanOutShape](../UniformFanOutShape.html "class in akka.stream")<T,​T>,​[NotUsed](../../NotUsed.html "class in akka")> create​(java.lang.Class<T> clazz,
		                                                                     int outputCount,
		                                                                     [Function](../../japi/function/Function.html "interface in akka.japi.function")<T,​java.lang.Integer> partitioner)
		```
		
		Create a new `Partition` operator with the specified input type, `eagerCancel` is `false`.
		 
		
		Parameters:
		`clazz` \- a type hint for this method
		`outputCount` \- number of output ports
		`partitioner` \- function deciding which output each element will be targeted
		- #### create
		
		
		
		```
		public <T> [Graph](../Graph.html "interface in akka.stream")<[UniformFanOutShape](../UniformFanOutShape.html "class in akka.stream")<T,​T>,​[NotUsed](../../NotUsed.html "class in akka")> create​(java.lang.Class<T> clazz,
		                                                                     int outputCount,
		                                                                     [Function](../../japi/function/Function.html "interface in akka.japi.function")<T,​java.lang.Integer> partitioner,
		                                                                     boolean eagerCancel)
		```
		
		Create a new `Partition` operator with the specified input type.
		 
		
		Parameters:
		`clazz` \- a type hint for this method
		`outputCount` \- number of output ports
		`partitioner` \- function deciding which output each element will be targeted
		`eagerCancel` \- this operator cancels, when any (true) or all (false) of the downstreams cancel

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/NotUsed.html
- https://doc.akka.io/japi/akka/current/akka/japi/function/Function.html
- https://doc.akka.io/japi/akka/current/akka/stream/Graph.html
- https://doc.akka.io/japi/akka/current/akka/stream/UniformFanOutShape.html
- https://doc.akka.io/japi/akka/current/akka/stream/javadsl/Partition$.html
- https://doc.akka.io/japi/akka/current/akka/stream/javadsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/stream/javadsl/Partition$.html](https://doc.akka.io/japi/akka/current/akka/stream/javadsl/Partition$.html)*