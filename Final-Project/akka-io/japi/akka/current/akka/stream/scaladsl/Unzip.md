---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:42:39Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/Unzip.html
title: Unzip
---

# Unzip

## Content

Package [akka.stream.scaladsl](package-summary.html)
## Class Unzip\<A,​B\>

- java.lang.Object
- - [akka.stream.stage.GraphStageWithMaterializedValue](../stage/GraphStageWithMaterializedValue.html "class in akka.stream.stage")\<S,​[NotUsed](../../NotUsed.html "class in akka")\>
	- - [akka.stream.stage.GraphStage](../stage/GraphStage.html "class in akka.stream.stage")\<[FanOutShape2](../FanOutShape2.html "class in akka.stream")\<In,​A1,​A2\>\>
		- - [akka.stream.scaladsl.UnzipWith2](UnzipWith2.html "class in akka.stream.scaladsl")\<scala.Tuple2\<A,​B\>,​A,​B\>
			- - akka.stream.scaladsl.Unzip\<A,​B\>

- All Implemented Interfaces:
`[Graph](../Graph.html "interface in akka.stream")<[FanOutShape2](../FanOutShape2.html "class in akka.stream")<scala.Tuple2<A,​B>,​A,​B>,​[NotUsed](../../NotUsed.html "class in akka")>`

---

```
public final class Unzip<A,​B>
extends [UnzipWith2](UnzipWith2.html "class in akka.stream.scaladsl")<scala.Tuple2<A,​B>,​A,​B>
```

Takes a stream of pair elements and splits each pair to two output streams.
 
 An `Unzip` has one `in` port and one `left` and one `right` output port.
 

 '''Emits when''' all of the outputs stop backpressuring and there is an input element available
 

 '''Backpressures when''' any of the outputs backpressure
 

 '''Completes when''' upstream completes
 

 '''Cancels when''' any downstream cancels

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface akka.stream.[Graph](../Graph.html "interface in akka.stream")
		
		
		`[Graph.GraphMapMatVal](../Graph.GraphMapMatVal.html "class in akka.stream")<[S](../Graph.GraphMapMatVal.html "type parameter in Graph.GraphMapMatVal") extends [Shape](../Shape.html "class in akka.stream"),​[M](../Graph.GraphMapMatVal.html "type parameter in Graph.GraphMapMatVal")>`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Unzip](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static <A,​B>[Unzip](Unzip.html "class in akka.stream.scaladsl")<A,​B>` | `[apply](#apply())()` | Create a new `Unzip`. |
	| `java.lang.String` | `[toString](#toString())()` |  |
	
	
		- ### Methods inherited from class akka.stream.scaladsl.[UnzipWith2](UnzipWith2.html "class in akka.stream.scaladsl")
		
		
		`[createLogic](UnzipWith2.html#createLogic(akka.stream.Attributes)), [in](UnzipWith2.html#in()), [initialAttributes](UnzipWith2.html#initialAttributes()), [out0](UnzipWith2.html#out0()), [out1](UnzipWith2.html#out1()), [shape](UnzipWith2.html#shape()), [unzipper](UnzipWith2.html#unzipper())`
		- ### Methods inherited from class akka.stream.stage.[GraphStage](../stage/GraphStage.html "class in akka.stream.stage")
		
		
		`[createLogicAndMaterializedValue](../stage/GraphStage.html#createLogicAndMaterializedValue(akka.stream.Attributes))`
		- ### Methods inherited from class akka.stream.stage.[GraphStageWithMaterializedValue](../stage/GraphStageWithMaterializedValue.html "class in akka.stream.stage")
		
		
		`[withAttributes](../stage/GraphStageWithMaterializedValue.html#withAttributes(akka.stream.Attributes))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface akka.stream.[Graph](../Graph.html "interface in akka.stream")
		
		
		`[addAttributes](../Graph.html#addAttributes(akka.stream.Attributes)), [async](../Graph.html#async()), [async](../Graph.html#async(java.lang.String)), [async](../Graph.html#async(java.lang.String,int)), [getAttributes](../Graph.html#getAttributes()), [named](../Graph.html#named(java.lang.String))`

- - ### Constructor Detail
	
	
	
		- #### Unzip
		
		
		
		```
		public Unzip()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static <A,​B> [Unzip](Unzip.html "class in akka.stream.scaladsl")<A,​B> apply()
		```
		
		Create a new `Unzip`.
		- #### toString
		
		
		
		```
		public java.lang.String toString()
		```
		
		
		Overrides:
		`[toString](UnzipWith2.html#toString())` in class `[UnzipWith2](UnzipWith2.html "class in akka.stream.scaladsl")<scala.Tuple2<[A](Unzip.html "type parameter in Unzip"),​[B](Unzip.html "type parameter in Unzip")>,​[A](Unzip.html "type parameter in Unzip"),​[B](Unzip.html "type parameter in Unzip")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/NotUsed.html
- https://doc.akka.io/japi/akka/current/akka/stream/FanOutShape2.html
- https://doc.akka.io/japi/akka/current/akka/stream/Graph.GraphMapMatVal.html
- https://doc.akka.io/japi/akka/current/akka/stream/Graph.html
- https://doc.akka.io/japi/akka/current/akka/stream/Shape.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/Unzip.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/UnzipWith2.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/stream/stage/GraphStage.html
- https://doc.akka.io/japi/akka/current/akka/stream/stage/GraphStageWithMaterializedValue.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/Unzip.html](https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/Unzip.html)*