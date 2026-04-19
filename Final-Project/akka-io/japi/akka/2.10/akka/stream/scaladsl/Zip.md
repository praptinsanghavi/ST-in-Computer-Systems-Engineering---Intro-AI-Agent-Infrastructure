---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:02:51Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/2.10/akka/stream/scaladsl/Zip.html
title: Zip
---

# Zip

## Content

Package [akka.stream.scaladsl](package-summary.html)
## Class Zip\<A,​B\>

- java.lang.Object
- - [akka.stream.stage.GraphStageWithMaterializedValue](../stage/GraphStageWithMaterializedValue.html "class in akka.stream.stage")\<S,​[NotUsed](../../NotUsed.html "class in akka")\>
	- - [akka.stream.stage.GraphStage](../stage/GraphStage.html "class in akka.stream.stage")\<[FanInShape2](../FanInShape2.html "class in akka.stream")\<A1,​A2,​O\>\>
		- - [akka.stream.scaladsl.ZipWith2](ZipWith2.html "class in akka.stream.scaladsl")\<A,​B,​scala.Tuple2\<A,​B\>\>
			- - akka.stream.scaladsl.Zip\<A,​B\>

- All Implemented Interfaces:
`[Graph](../Graph.html "interface in akka.stream")<[FanInShape2](../FanInShape2.html "class in akka.stream")<A,​B,​scala.Tuple2<A,​B>>,​[NotUsed](../../NotUsed.html "class in akka")>`

---

```
public final class Zip<A,​B>
extends [ZipWith2](ZipWith2.html "class in akka.stream.scaladsl")<A,​B,​scala.Tuple2<A,​B>>
```

Combine the elements of 2 streams into a stream of tuples.
 
 A `Zip` has a `left` and a `right` input port and one `out` port
 

 '''Emits when''' all of the inputs has an element available
 

 '''Backpressures when''' downstream backpressures
 

 '''Completes when''' any upstream completes
 

 '''Cancels when''' downstream cancels

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface akka.stream.[Graph](../Graph.html "interface in akka.stream")
		
		
		`[Graph.GraphMapMatVal](../Graph.GraphMapMatVal.html "class in akka.stream")<[S](../Graph.GraphMapMatVal.html "type parameter in Graph.GraphMapMatVal") extends [Shape](../Shape.html "class in akka.stream"),​[M](../Graph.GraphMapMatVal.html "type parameter in Graph.GraphMapMatVal")>`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Zip](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static <A,​B>[Zip](Zip.html "class in akka.stream.scaladsl")<A,​B>` | `[apply](#apply())()` | Create a new `Zip`. |
	| `java.lang.String` | `[toString](#toString())()` |  |
	
	
		- ### Methods inherited from class akka.stream.scaladsl.[ZipWith2](ZipWith2.html "class in akka.stream.scaladsl")
		
		
		`[createLogic](ZipWith2.html#createLogic(akka.stream.Attributes)), [in0](ZipWith2.html#in0()), [in1](ZipWith2.html#in1()), [initialAttributes](ZipWith2.html#initialAttributes()), [out](ZipWith2.html#out()), [shape](ZipWith2.html#shape()), [zipper](ZipWith2.html#zipper())`
		- ### Methods inherited from class akka.stream.stage.[GraphStage](../stage/GraphStage.html "class in akka.stream.stage")
		
		
		`[createLogicAndMaterializedValue](../stage/GraphStage.html#createLogicAndMaterializedValue(akka.stream.Attributes))`
		- ### Methods inherited from class akka.stream.stage.[GraphStageWithMaterializedValue](../stage/GraphStageWithMaterializedValue.html "class in akka.stream.stage")
		
		
		`[withAttributes](../stage/GraphStageWithMaterializedValue.html#withAttributes(akka.stream.Attributes))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface akka.stream.[Graph](../Graph.html "interface in akka.stream")
		
		
		`[addAttributes](../Graph.html#addAttributes(akka.stream.Attributes)), [async](../Graph.html#async()), [async](../Graph.html#async(java.lang.String)), [async](../Graph.html#async(java.lang.String,int)), [getAttributes](../Graph.html#getAttributes()), [named](../Graph.html#named(java.lang.String))`

- - ### Constructor Detail
	
	
	
		- #### Zip
		
		
		
		```
		public Zip()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static <A,​B> [Zip](Zip.html "class in akka.stream.scaladsl")<A,​B> apply()
		```
		
		Create a new `Zip`.
		- #### toString
		
		
		
		```
		public java.lang.String toString()
		```
		
		
		Overrides:
		`[toString](ZipWith2.html#toString())` in class `[ZipWith2](ZipWith2.html "class in akka.stream.scaladsl")<[A](Zip.html "type parameter in Zip"),​[B](Zip.html "type parameter in Zip"),​scala.Tuple2<[A](Zip.html "type parameter in Zip"),​[B](Zip.html "type parameter in Zip")>>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/2.10/akka/NotUsed.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/FanInShape2.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/Graph.GraphMapMatVal.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/Graph.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/Shape.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/scaladsl/Zip.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/scaladsl/ZipWith2.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/scaladsl/package-summary.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/stage/GraphStage.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/stage/GraphStageWithMaterializedValue.html

---
*Source: [https://doc.akka.io/japi/akka/2.10/akka/stream/scaladsl/Zip.html](https://doc.akka.io/japi/akka/2.10/akka/stream/scaladsl/Zip.html)*