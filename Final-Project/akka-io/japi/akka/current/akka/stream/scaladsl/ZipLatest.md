---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:43:21Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/ZipLatest.html
title: ZipLatest
---

# ZipLatest

## Content

Package [akka.stream.scaladsl](package-summary.html)
## Class ZipLatest\<A,​B\>

- java.lang.Object
- - [akka.stream.stage.GraphStageWithMaterializedValue](../stage/GraphStageWithMaterializedValue.html "class in akka.stream.stage")\<S,​[NotUsed](../../NotUsed.html "class in akka")\>
	- - [akka.stream.stage.GraphStage](../stage/GraphStage.html "class in akka.stream.stage")\<[FanInShape2](../FanInShape2.html "class in akka.stream")\<A1,​A2,​O\>\>
		- - [akka.stream.scaladsl.ZipLatestWith2](ZipLatestWith2.html "class in akka.stream.scaladsl")\<A,​B,​scala.Tuple2\<A,​B\>\>
			- - akka.stream.scaladsl.ZipLatest\<A,​B\>

- All Implemented Interfaces:
`[Graph](../Graph.html "interface in akka.stream")<[FanInShape2](../FanInShape2.html "class in akka.stream")<A,​B,​scala.Tuple2<A,​B>>,​[NotUsed](../../NotUsed.html "class in akka")>`

---

```
public final class ZipLatest<A,​B>
extends [ZipLatestWith2](ZipLatestWith2.html "class in akka.stream.scaladsl")<A,​B,​scala.Tuple2<A,​B>>
```

Combine the elements of 2 streams into a stream of tuples, picking always the latest element of each.
 
 A `ZipLatest` has a `left` and a `right` input port and one `out` port.
 

 No element is emitted until at least one element from each Source becomes available.
 

 '''Emits when''' all of the inputs have at least an element available, and then each time an element becomes
 \* available on either of the inputs
 

 '''Backpressures when''' downstream backpressures
 

 '''Completes when''' any upstream completes if `eagerComplete` is enabled or wait for all upstreams to complete
 

 '''Cancels when''' downstream cancels

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface akka.stream.[Graph](../Graph.html "interface in akka.stream")
		
		
		`[Graph.GraphMapMatVal](../Graph.GraphMapMatVal.html "class in akka.stream")<[S](../Graph.GraphMapMatVal.html "type parameter in Graph.GraphMapMatVal") extends [Shape](../Shape.html "class in akka.stream"),​[M](../Graph.GraphMapMatVal.html "type parameter in Graph.GraphMapMatVal")>`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ZipLatest](#%3Cinit%3E())()` |  |
	| `[ZipLatest](#%3Cinit%3E(boolean))​(boolean eagerComplete)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static <A,​B>[ZipLatest](ZipLatest.html "class in akka.stream.scaladsl")<A,​B>` | `[apply](#apply())()` | Create a new `ZipLatest`. |
	| `static <A,​B>[ZipLatest](ZipLatest.html "class in akka.stream.scaladsl")<A,​B>` | `[apply](#apply(boolean))​(boolean eagerComplete)` | Create a new `ZipLatest`. |
	| `java.lang.String` | `[toString](#toString())()` |  |
	
	
		- ### Methods inherited from class akka.stream.scaladsl.[ZipLatestWith2](ZipLatestWith2.html "class in akka.stream.scaladsl")
		
		
		`[createLogic](ZipLatestWith2.html#createLogic(akka.stream.Attributes)), [eagerComplete](ZipLatestWith2.html#eagerComplete()), [in0](ZipLatestWith2.html#in0()), [in1](ZipLatestWith2.html#in1()), [initialAttributes](ZipLatestWith2.html#initialAttributes()), [out](ZipLatestWith2.html#out()), [shape](ZipLatestWith2.html#shape()), [zipper](ZipLatestWith2.html#zipper())`
		- ### Methods inherited from class akka.stream.stage.[GraphStage](../stage/GraphStage.html "class in akka.stream.stage")
		
		
		`[createLogicAndMaterializedValue](../stage/GraphStage.html#createLogicAndMaterializedValue(akka.stream.Attributes))`
		- ### Methods inherited from class akka.stream.stage.[GraphStageWithMaterializedValue](../stage/GraphStageWithMaterializedValue.html "class in akka.stream.stage")
		
		
		`[withAttributes](../stage/GraphStageWithMaterializedValue.html#withAttributes(akka.stream.Attributes))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface akka.stream.[Graph](../Graph.html "interface in akka.stream")
		
		
		`[addAttributes](../Graph.html#addAttributes(akka.stream.Attributes)), [async](../Graph.html#async()), [async](../Graph.html#async(java.lang.String)), [async](../Graph.html#async(java.lang.String,int)), [getAttributes](../Graph.html#getAttributes()), [named](../Graph.html#named(java.lang.String))`

- - ### Constructor Detail
	
	
	
		- #### ZipLatest
		
		
		
		```
		public ZipLatest​(boolean eagerComplete)
		```
		- #### ZipLatest
		
		
		
		```
		public ZipLatest()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static <A,​B> [ZipLatest](ZipLatest.html "class in akka.stream.scaladsl")<A,​B> apply()
		```
		
		Create a new `ZipLatest`.
		- #### apply
		
		
		
		```
		public static <A,​B> [ZipLatest](ZipLatest.html "class in akka.stream.scaladsl")<A,​B> apply​(boolean eagerComplete)
		```
		
		Create a new `ZipLatest`.
		- #### toString
		
		
		
		```
		public java.lang.String toString()
		```
		
		
		Overrides:
		`[toString](ZipLatestWith2.html#toString())` in class `[ZipLatestWith2](ZipLatestWith2.html "class in akka.stream.scaladsl")<[A](ZipLatest.html "type parameter in ZipLatest"),​[B](ZipLatest.html "type parameter in ZipLatest"),​scala.Tuple2<[A](ZipLatest.html "type parameter in ZipLatest"),​[B](ZipLatest.html "type parameter in ZipLatest")>>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/NotUsed.html
- https://doc.akka.io/japi/akka/current/akka/stream/FanInShape2.html
- https://doc.akka.io/japi/akka/current/akka/stream/Graph.GraphMapMatVal.html
- https://doc.akka.io/japi/akka/current/akka/stream/Graph.html
- https://doc.akka.io/japi/akka/current/akka/stream/Shape.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/ZipLatest.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/ZipLatestWith2.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/stream/stage/GraphStage.html
- https://doc.akka.io/japi/akka/current/akka/stream/stage/GraphStageWithMaterializedValue.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/ZipLatest.html](https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/ZipLatest.html)*