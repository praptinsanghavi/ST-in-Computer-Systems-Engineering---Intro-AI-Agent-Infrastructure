---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:43:46Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/ZipN.html
title: ZipN
---

# ZipN

## Content

Package [akka.stream.scaladsl](package-summary.html)
## Class ZipN\<A\>

- java.lang.Object
- - [akka.stream.stage.GraphStageWithMaterializedValue](../stage/GraphStageWithMaterializedValue.html "class in akka.stream.stage")\<S,​[NotUsed](../../NotUsed.html "class in akka")\>
	- - [akka.stream.stage.GraphStage](../stage/GraphStage.html "class in akka.stream.stage")\<[UniformFanInShape](../UniformFanInShape.html "class in akka.stream")\<A,​O\>\>
		- - [akka.stream.scaladsl.ZipWithN](ZipWithN.html "class in akka.stream.scaladsl")\<A,​scala.collection.immutable.Seq\<A\>\>
			- - akka.stream.scaladsl.ZipN\<A\>

- All Implemented Interfaces:
`[Graph](../Graph.html "interface in akka.stream")<[UniformFanInShape](../UniformFanInShape.html "class in akka.stream")<A,​scala.collection.immutable.Seq<A>>,​[NotUsed](../../NotUsed.html "class in akka")>`

---

```
public final class ZipN<A>
extends [ZipWithN](ZipWithN.html "class in akka.stream.scaladsl")<A,​scala.collection.immutable.Seq<A>>
```

Combine the elements of multiple streams into a stream of sequences.
 
 A `ZipN` has a `n` input ports and one `out` port
 

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
	| `[ZipN](#%3Cinit%3E(int))​(int n)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static <A> [ZipN](ZipN.html "class in akka.stream.scaladsl")<A>` | `[apply](#apply(int))​(int n)` | Create a new `ZipN`. |
	| `[Attributes](../Attributes.html "class in akka.stream")` | `[initialAttributes](#initialAttributes())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	
	
		- ### Methods inherited from class akka.stream.scaladsl.[ZipWithN](ZipWithN.html "class in akka.stream.scaladsl")
		
		
		`[apply](ZipWithN.html#apply(scala.Function1,int)), [createLogic](ZipWithN.html#createLogic(akka.stream.Attributes)), [out](ZipWithN.html#out()), [shape](ZipWithN.html#shape())`
		- ### Methods inherited from class akka.stream.stage.[GraphStage](../stage/GraphStage.html "class in akka.stream.stage")
		
		
		`[createLogicAndMaterializedValue](../stage/GraphStage.html#createLogicAndMaterializedValue(akka.stream.Attributes))`
		- ### Methods inherited from class akka.stream.stage.[GraphStageWithMaterializedValue](../stage/GraphStageWithMaterializedValue.html "class in akka.stream.stage")
		
		
		`[withAttributes](../stage/GraphStageWithMaterializedValue.html#withAttributes(akka.stream.Attributes))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface akka.stream.[Graph](../Graph.html "interface in akka.stream")
		
		
		`[addAttributes](../Graph.html#addAttributes(akka.stream.Attributes)), [async](../Graph.html#async()), [async](../Graph.html#async(java.lang.String)), [async](../Graph.html#async(java.lang.String,int)), [getAttributes](../Graph.html#getAttributes()), [named](../Graph.html#named(java.lang.String))`

- - ### Constructor Detail
	
	
	
		- #### ZipN
		
		
		
		```
		public ZipN​(int n)
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static <A> [ZipN](ZipN.html "class in akka.stream.scaladsl")<A> apply​(int n)
		```
		
		Create a new `ZipN`.
		- #### initialAttributes
		
		
		
		```
		public [Attributes](../Attributes.html "class in akka.stream") initialAttributes()
		```
		
		
		Overrides:
		`[initialAttributes](ZipWithN.html#initialAttributes())` in class `[ZipWithN](ZipWithN.html "class in akka.stream.scaladsl")<[A](ZipN.html "type parameter in ZipN"),​scala.collection.immutable.Seq<[A](ZipN.html "type parameter in ZipN")>>`
		- #### toString
		
		
		
		```
		public java.lang.String toString()
		```
		
		
		Overrides:
		`[toString](ZipWithN.html#toString())` in class `[ZipWithN](ZipWithN.html "class in akka.stream.scaladsl")<[A](ZipN.html "type parameter in ZipN"),​scala.collection.immutable.Seq<[A](ZipN.html "type parameter in ZipN")>>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/NotUsed.html
- https://doc.akka.io/japi/akka/current/akka/stream/Attributes.html
- https://doc.akka.io/japi/akka/current/akka/stream/Graph.GraphMapMatVal.html
- https://doc.akka.io/japi/akka/current/akka/stream/Graph.html
- https://doc.akka.io/japi/akka/current/akka/stream/Shape.html
- https://doc.akka.io/japi/akka/current/akka/stream/UniformFanInShape.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/ZipN.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/ZipWithN.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/stream/stage/GraphStage.html
- https://doc.akka.io/japi/akka/current/akka/stream/stage/GraphStageWithMaterializedValue.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/ZipN.html](https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/ZipN.html)*