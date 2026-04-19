---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:46:48Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/2.10/akka/stream/scaladsl/BidiFlow.html
title: BidiFlow
---

# BidiFlow

## Content

Package [akka.stream.scaladsl](package-summary.html)
## Class BidiFlow\<I1,​O1,​I2,​O2,​Mat\>

- java.lang.Object
- - akka.stream.scaladsl.BidiFlow\<I1,​O1,​I2,​O2,​Mat\>

- All Implemented Interfaces:
`[Graph](../Graph.html "interface in akka.stream")<[BidiShape](../BidiShape.html "class in akka.stream")<I1,​O1,​I2,​O2>,​Mat>`

---

```
public final class BidiFlow<I1,​O1,​I2,​O2,​Mat>
extends java.lang.Object
implements [Graph](../Graph.html "interface in akka.stream")<[BidiShape](../BidiShape.html "class in akka.stream")<I1,​O1,​I2,​O2>,​Mat>
```

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface akka.stream.[Graph](../Graph.html "interface in akka.stream")
		
		
		`[Graph.GraphMapMatVal](../Graph.GraphMapMatVal.html "class in akka.stream")<[S](../Graph.GraphMapMatVal.html "type parameter in Graph.GraphMapMatVal") extends [Shape](../Shape.html "class in akka.stream"),​[M](../Graph.GraphMapMatVal.html "type parameter in Graph.GraphMapMatVal")>`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[BidiFlow](#%3Cinit%3E(akka.stream.impl.TraversalBuilder,akka.stream.BidiShape))​(akka.stream.impl.TraversalBuilder traversalBuilder,  [BidiShape](../BidiShape.html "class in akka.stream")<[I1](BidiFlow.html "type parameter in BidiFlow"),​[O1](BidiFlow.html "type parameter in BidiFlow"),​[I2](BidiFlow.html "type parameter in BidiFlow"),​[O2](BidiFlow.html "type parameter in BidiFlow")> shape)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[BidiFlow](BidiFlow.html "class in akka.stream.scaladsl")<[I1](BidiFlow.html "type parameter in BidiFlow"),​[O1](BidiFlow.html "type parameter in BidiFlow"),​[I2](BidiFlow.html "type parameter in BidiFlow"),​[O2](BidiFlow.html "type parameter in BidiFlow"),​[Mat](BidiFlow.html "type parameter in BidiFlow")>` | `[addAttributes](#addAttributes(akka.stream.Attributes))​([Attributes](../Attributes.html "class in akka.stream") attr)` | Add the given attributes to this Source. |
	| `<JI1 extends [I1](BidiFlow.html "type parameter in BidiFlow"),​JO1,​JI2 extends [I2](BidiFlow.html "type parameter in BidiFlow"),​JO2,​JMat>[BidiFlow](../javadsl/BidiFlow.html "class in akka.stream.javadsl")<JI1,​JO1,​JI2,​JO2,​JMat>` | `[asJava](#asJava())()` |  |
	| `[BidiFlow](BidiFlow.html "class in akka.stream.scaladsl")<[I1](BidiFlow.html "type parameter in BidiFlow"),​[O1](BidiFlow.html "type parameter in BidiFlow"),​[I2](BidiFlow.html "type parameter in BidiFlow"),​[O2](BidiFlow.html "type parameter in BidiFlow"),​[Mat](BidiFlow.html "type parameter in BidiFlow")>` | `[async](#async())()` | Put an asynchronous boundary around this `BidiFlow` |
	| `[BidiFlow](BidiFlow.html "class in akka.stream.scaladsl")<[I1](BidiFlow.html "type parameter in BidiFlow"),​[O1](BidiFlow.html "type parameter in BidiFlow"),​[I2](BidiFlow.html "type parameter in BidiFlow"),​[O2](BidiFlow.html "type parameter in BidiFlow"),​[Mat](BidiFlow.html "type parameter in BidiFlow")>` | `[async](#async(java.lang.String))​(java.lang.String dispatcher)` | Put an asynchronous boundary around this `BidiFlow` |
	| `[BidiFlow](BidiFlow.html "class in akka.stream.scaladsl")<[I1](BidiFlow.html "type parameter in BidiFlow"),​[O1](BidiFlow.html "type parameter in BidiFlow"),​[I2](BidiFlow.html "type parameter in BidiFlow"),​[O2](BidiFlow.html "type parameter in BidiFlow"),​[Mat](BidiFlow.html "type parameter in BidiFlow")>` | `[async](#async(java.lang.String,int))​(java.lang.String dispatcher,  int inputBufferSize)` | Put an asynchronous boundary around this `BidiFlow` |
	| `<OO1,​II2,​Mat2>[BidiFlow](BidiFlow.html "class in akka.stream.scaladsl")<[I1](BidiFlow.html "type parameter in BidiFlow"),​OO1,​II2,​[O2](BidiFlow.html "type parameter in BidiFlow"),​[Mat](BidiFlow.html "type parameter in BidiFlow")>` | `[atop](#atop(akka.stream.Graph))​([Graph](../Graph.html "interface in akka.stream")<[BidiShape](../BidiShape.html "class in akka.stream")<[O1](BidiFlow.html "type parameter in BidiFlow"),​OO1,​II2,​[I2](BidiFlow.html "type parameter in BidiFlow")>,​Mat2> bidi)` | Add the given BidiFlow as the next step in a bidirectional transformation  pipeline. |
	| `<OO1,​II2,​Mat2,​M>[BidiFlow](BidiFlow.html "class in akka.stream.scaladsl")<[I1](BidiFlow.html "type parameter in BidiFlow"),​OO1,​II2,​[O2](BidiFlow.html "type parameter in BidiFlow"),​M>` | `[atopMat](#atopMat(akka.stream.Graph,scala.Function2))​([Graph](../Graph.html "interface in akka.stream")<[BidiShape](../BidiShape.html "class in akka.stream")<[O1](BidiFlow.html "type parameter in BidiFlow"),​OO1,​II2,​[I2](BidiFlow.html "type parameter in BidiFlow")>,​Mat2> bidi,  scala.Function2<[Mat](BidiFlow.html "type parameter in BidiFlow"),​Mat2,​M> combine)` | Add the given BidiFlow as the next step in a bidirectional transformation  pipeline. |
	| `static <I,​O>[BidiFlow](BidiFlow.html "class in akka.stream.scaladsl")<I,​I,​O,​O,​[NotUsed](../../NotUsed.html "class in akka")>` | `[bidirectionalIdleTimeout](#bidirectionalIdleTimeout(scala.concurrent.duration.FiniteDuration))​(scala.concurrent.duration.FiniteDuration timeout)` | If the time between two processed elements \*in any direction\* exceed the provided timeout, the stream is failed  with a [`StreamIdleTimeoutException`](../StreamIdleTimeoutException.html "class in akka.stream"). |
	| `static <I1,​O1,​I2,​O2,​M1,​M2>[BidiFlow](BidiFlow.html "class in akka.stream.scaladsl")<I1,​O1,​I2,​O2,​[NotUsed](../../NotUsed.html "class in akka")>` | `[fromFlows](#fromFlows(akka.stream.Graph,akka.stream.Graph))​([Graph](../Graph.html "interface in akka.stream")<[FlowShape](../FlowShape.html "class in akka.stream")<I1,​O1>,​M1> flow1,  [Graph](../Graph.html "interface in akka.stream")<[FlowShape](../FlowShape.html "class in akka.stream")<I2,​O2>,​M2> flow2)` | Wraps two Flows to create a ''BidiFlow''. |
	| `static <I1,​O1,​I2,​O2,​M1,​M2,​M>[BidiFlow](BidiFlow.html "class in akka.stream.scaladsl")<I1,​O1,​I2,​O2,​M>` | `[fromFlowsMat](#fromFlowsMat(akka.stream.Graph,akka.stream.Graph,scala.Function2))​([Graph](../Graph.html "interface in akka.stream")<[FlowShape](../FlowShape.html "class in akka.stream")<I1,​O1>,​M1> flow1,  [Graph](../Graph.html "interface in akka.stream")<[FlowShape](../FlowShape.html "class in akka.stream")<I2,​O2>,​M2> flow2,  scala.Function2<M1,​M2,​M> combine)` | Wraps two Flows to create a ''BidiFlow''. |
	| `static <I1,​O1,​I2,​O2>[BidiFlow](BidiFlow.html "class in akka.stream.scaladsl")<I1,​O1,​I2,​O2,​[NotUsed](../../NotUsed.html "class in akka")>` | `[fromFunctions](#fromFunctions(scala.Function1,scala.Function1))​(scala.Function1<I1,​O1> outbound,  scala.Function1<I2,​O2> inbound)` | Create a BidiFlow where the top and bottom flows are just one simple mapping  operator each, expressed by the two functions. |
	| `static <I1,​O1,​I2,​O2,​Mat>[BidiFlow](BidiFlow.html "class in akka.stream.scaladsl")<I1,​O1,​I2,​O2,​Mat>` | `[fromGraph](#fromGraph(akka.stream.Graph))​([Graph](../Graph.html "interface in akka.stream")<[BidiShape](../BidiShape.html "class in akka.stream")<I1,​O1,​I2,​O2>,​Mat> graph)` | A graph with the shape of a flow logically is a flow, this method makes  it so also in type. |
	| `[Attributes](../Attributes.html "class in akka.stream")` | `[getAttributes](#getAttributes())()` |  |
	| `static <A,​B>[BidiFlow](BidiFlow.html "class in akka.stream.scaladsl")<A,​A,​B,​B,​[NotUsed](../../NotUsed.html "class in akka")>` | `[identity](#identity())()` |  |
	| `<Mat2> [Flow](Flow.html "class in akka.stream.scaladsl")<[I1](BidiFlow.html "type parameter in BidiFlow"),​[O2](BidiFlow.html "type parameter in BidiFlow"),​[Mat](BidiFlow.html "type parameter in BidiFlow")>` | `[join](#join(akka.stream.Graph))​([Graph](../Graph.html "interface in akka.stream")<[FlowShape](../FlowShape.html "class in akka.stream")<[O1](BidiFlow.html "type parameter in BidiFlow"),​[I2](BidiFlow.html "type parameter in BidiFlow")>,​Mat2> flow)` | Add the given Flow as the final step in a bidirectional transformation  pipeline. |
	| `<Mat2,​M>[Flow](Flow.html "class in akka.stream.scaladsl")<[I1](BidiFlow.html "type parameter in BidiFlow"),​[O2](BidiFlow.html "type parameter in BidiFlow"),​M>` | `[joinMat](#joinMat(akka.stream.Graph,scala.Function2))​([Graph](../Graph.html "interface in akka.stream")<[FlowShape](../FlowShape.html "class in akka.stream")<[O1](BidiFlow.html "type parameter in BidiFlow"),​[I2](BidiFlow.html "type parameter in BidiFlow")>,​Mat2> flow,  scala.Function2<[Mat](BidiFlow.html "type parameter in BidiFlow"),​Mat2,​M> combine)` | Add the given Flow as the final step in a bidirectional transformation  pipeline. |
	| `<Mat2> [BidiFlow](BidiFlow.html "class in akka.stream.scaladsl")<[I1](BidiFlow.html "type parameter in BidiFlow"),​[O1](BidiFlow.html "type parameter in BidiFlow"),​[I2](BidiFlow.html "type parameter in BidiFlow"),​[O2](BidiFlow.html "type parameter in BidiFlow"),​Mat2>` | `[mapMaterializedValue](#mapMaterializedValue(scala.Function1))​(scala.Function1<[Mat](BidiFlow.html "type parameter in BidiFlow"),​Mat2> f)` | Transform only the materialized value of this BidiFlow, leaving all other properties as they were. |
	| `[BidiFlow](BidiFlow.html "class in akka.stream.scaladsl")<[I1](BidiFlow.html "type parameter in BidiFlow"),​[O1](BidiFlow.html "type parameter in BidiFlow"),​[I2](BidiFlow.html "type parameter in BidiFlow"),​[O2](BidiFlow.html "type parameter in BidiFlow"),​[Mat](BidiFlow.html "type parameter in BidiFlow")>` | `[named](#named(java.lang.String))​(java.lang.String name)` | Add a name attribute to this Flow. |
	| `[BidiFlow](BidiFlow.html "class in akka.stream.scaladsl")<[I2](BidiFlow.html "type parameter in BidiFlow"),​[O2](BidiFlow.html "type parameter in BidiFlow"),​[I1](BidiFlow.html "type parameter in BidiFlow"),​[O1](BidiFlow.html "type parameter in BidiFlow"),​[Mat](BidiFlow.html "type parameter in BidiFlow")>` | `[reversed](#reversed())()` | Turn this BidiFlow around by 180 degrees, logically flipping it upside down in a protocol stack. |
	| `[BidiShape](../BidiShape.html "class in akka.stream")<[I1](BidiFlow.html "type parameter in BidiFlow"),​[O1](BidiFlow.html "type parameter in BidiFlow"),​[I2](BidiFlow.html "type parameter in BidiFlow"),​[O2](BidiFlow.html "type parameter in BidiFlow")>` | `[shape](#shape())()` | The shape of a graph is all that is externally visible: its inlets and outlets. |
	| `akka.stream.impl.TraversalBuilder` | `[traversalBuilder](#traversalBuilder())()` | INTERNAL API. |
	| `[BidiFlow](BidiFlow.html "class in akka.stream.scaladsl")<[I1](BidiFlow.html "type parameter in BidiFlow"),​[O1](BidiFlow.html "type parameter in BidiFlow"),​[I2](BidiFlow.html "type parameter in BidiFlow"),​[O2](BidiFlow.html "type parameter in BidiFlow"),​[Mat](BidiFlow.html "type parameter in BidiFlow")>` | `[withAttributes](#withAttributes(akka.stream.Attributes))​([Attributes](../Attributes.html "class in akka.stream") attr)` | Change the attributes of this [`Source`](Source.html "class in akka.stream.scaladsl") to the given ones and seal the list  of attributes. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### BidiFlow
		
		
		
		```
		public BidiFlow​(akka.stream.impl.TraversalBuilder traversalBuilder,
		                [BidiShape](../BidiShape.html "class in akka.stream")<[I1](BidiFlow.html "type parameter in BidiFlow"),​[O1](BidiFlow.html "type parameter in BidiFlow"),​[I2](BidiFlow.html "type parameter in BidiFlow"),​[O2](BidiFlow.html "type parameter in BidiFlow")> shape)
		```

	- ### Method Detail
	
	
	
		- #### identity
		
		
		
		```
		public static <A,​B> [BidiFlow](BidiFlow.html "class in akka.stream.scaladsl")<A,​A,​B,​B,​[NotUsed](../../NotUsed.html "class in akka")> identity()
		```
		- #### fromGraph
		
		
		
		```
		public static <I1,​O1,​I2,​O2,​Mat> [BidiFlow](BidiFlow.html "class in akka.stream.scaladsl")<I1,​O1,​I2,​O2,​Mat> fromGraph​([Graph](../Graph.html "interface in akka.stream")<[BidiShape](../BidiShape.html "class in akka.stream")<I1,​O1,​I2,​O2>,​Mat> graph)
		```
		
		A graph with the shape of a flow logically is a flow, this method makes
		 it so also in type.
		- #### fromFlowsMat
		
		
		
		```
		public static <I1,​O1,​I2,​O2,​M1,​M2,​M> [BidiFlow](BidiFlow.html "class in akka.stream.scaladsl")<I1,​O1,​I2,​O2,​M> fromFlowsMat​([Graph](../Graph.html "interface in akka.stream")<[FlowShape](../FlowShape.html "class in akka.stream")<I1,​O1>,​M1> flow1,
		                                                                                                                                     [Graph](../Graph.html "interface in akka.stream")<[FlowShape](../FlowShape.html "class in akka.stream")<I2,​O2>,​M2> flow2,
		                                                                                                                                     scala.Function2<M1,​M2,​M> combine)
		```
		
		Wraps two Flows to create a ''BidiFlow''. The materialized value of the resulting BidiFlow is determined
		 by the combiner function passed in the second argument list.
		 
		
		
		
		```
		
		     +----------------------------+
		     | Resulting BidiFlow         |
		     |                            |
		     |  +----------------------+  |
		 I1 ~~> |        Flow1         | ~~> O1
		     |  +----------------------+  |
		     |                            |
		     |  +----------------------+  |
		 O2 <~~ |        Flow2         | <~~ I2
		     |  +----------------------+  |
		     +----------------------------+
		 
		```
		- #### fromFlows
		
		
		
		```
		public static <I1,​O1,​I2,​O2,​M1,​M2> [BidiFlow](BidiFlow.html "class in akka.stream.scaladsl")<I1,​O1,​I2,​O2,​[NotUsed](../../NotUsed.html "class in akka")> fromFlows​([Graph](../Graph.html "interface in akka.stream")<[FlowShape](../FlowShape.html "class in akka.stream")<I1,​O1>,​M1> flow1,
		                                                                                                                                [Graph](../Graph.html "interface in akka.stream")<[FlowShape](../FlowShape.html "class in akka.stream")<I2,​O2>,​M2> flow2)
		```
		
		Wraps two Flows to create a ''BidiFlow''. The materialized value of the resulting BidiFlow is Unit.
		 
		
		
		
		```
		
		     +----------------------------+
		     | Resulting BidiFlow         |
		     |                            |
		     |  +----------------------+  |
		 I1 ~~> |        Flow1         | ~~> O1
		     |  +----------------------+  |
		     |                            |
		     |  +----------------------+  |
		 O2 <~~ |        Flow2         | <~~ I2
		     |  +----------------------+  |
		     +----------------------------+
		 
		```
		- #### fromFunctions
		
		
		
		```
		public static <I1,​O1,​I2,​O2> [BidiFlow](BidiFlow.html "class in akka.stream.scaladsl")<I1,​O1,​I2,​O2,​[NotUsed](../../NotUsed.html "class in akka")> fromFunctions​(scala.Function1<I1,​O1> outbound,
		                                                                                                                  scala.Function1<I2,​O2> inbound)
		```
		
		Create a BidiFlow where the top and bottom flows are just one simple mapping
		 operator each, expressed by the two functions.
		- #### bidirectionalIdleTimeout
		
		
		
		```
		public static <I,​O> [BidiFlow](BidiFlow.html "class in akka.stream.scaladsl")<I,​I,​O,​O,​[NotUsed](../../NotUsed.html "class in akka")> bidirectionalIdleTimeout​(scala.concurrent.duration.FiniteDuration timeout)
		```
		
		If the time between two processed elements \*in any direction\* exceed the provided timeout, the stream is failed
		 with a [`StreamIdleTimeoutException`](../StreamIdleTimeoutException.html "class in akka.stream").
		 
		 There is a difference between this operator and having two idleTimeout Flows assembled into a BidiStage.
		 If the timeout is configured to be 1 seconds, then this operator will not fail even though there are elements flowing
		 every second in one direction, but no elements are flowing in the other direction. I.e. this operator considers
		 the \*joint\* frequencies of the elements in both directions.
		- #### traversalBuilder
		
		
		
		```
		public akka.stream.impl.TraversalBuilder traversalBuilder()
		```
		
		Description copied from interface: `[Graph](../Graph.html#traversalBuilder())`
		INTERNAL API.
		 
		 Every materializable element must be backed by a stream layout module
		
		
		
		Specified by:
		`[traversalBuilder](../Graph.html#traversalBuilder())` in interface `[Graph](../Graph.html "interface in akka.stream")<[I1](BidiFlow.html "type parameter in BidiFlow"),​[O1](BidiFlow.html "type parameter in BidiFlow")>`
		- #### shape
		
		
		
		```
		public [BidiShape](../BidiShape.html "class in akka.stream")<[I1](BidiFlow.html "type parameter in BidiFlow"),​[O1](BidiFlow.html "type parameter in BidiFlow"),​[I2](BidiFlow.html "type parameter in BidiFlow"),​[O2](BidiFlow.html "type parameter in BidiFlow")> shape()
		```
		
		Description copied from interface: `[Graph](../Graph.html#shape())`
		The shape of a graph is all that is externally visible: its inlets and outlets.
		
		Specified by:
		`[shape](../Graph.html#shape())` in interface `[Graph](../Graph.html "interface in akka.stream")<[I1](BidiFlow.html "type parameter in BidiFlow"),​[O1](BidiFlow.html "type parameter in BidiFlow")>`
		- #### asJava
		
		
		
		```
		public <JI1 extends [I1](BidiFlow.html "type parameter in BidiFlow"),​JO1,​JI2 extends [I2](BidiFlow.html "type parameter in BidiFlow"),​JO2,​JMat> [BidiFlow](../javadsl/BidiFlow.html "class in akka.stream.javadsl")<JI1,​JO1,​JI2,​JO2,​JMat> asJava()
		```
		- #### atop
		
		
		
		```
		public <OO1,​II2,​Mat2> [BidiFlow](BidiFlow.html "class in akka.stream.scaladsl")<[I1](BidiFlow.html "type parameter in BidiFlow"),​OO1,​II2,​[O2](BidiFlow.html "type parameter in BidiFlow"),​[Mat](BidiFlow.html "type parameter in BidiFlow")> atop​([Graph](../Graph.html "interface in akka.stream")<[BidiShape](../BidiShape.html "class in akka.stream")<[O1](BidiFlow.html "type parameter in BidiFlow"),​OO1,​II2,​[I2](BidiFlow.html "type parameter in BidiFlow")>,​Mat2> bidi)
		```
		
		Add the given BidiFlow as the next step in a bidirectional transformation
		 pipeline. By convention protocol stacks are growing to the left: the right most is the bottom
		 layer, the closest to the metal.
		 
		```
		
		     +----------------------------+
		     | Resulting BidiFlow         |
		     |                            |
		     |  +------+        +------+  |
		 I1 ~~> |      |  ~O1~> |      | ~~> OO1
		     |  | this |        | bidi |  |
		 O2 <~~ |      | <~I2~  |      | <~~ II2
		     |  +------+        +------+  |
		     +----------------------------+
		 
		```
		
		 The materialized value of the combined [`BidiFlow`](BidiFlow.html "class in akka.stream.scaladsl") will be the materialized
		 value of the current flow (ignoring the other BidiFlow\&rsquo;s value), use
		 [`atopMat`](#atopMat(akka.stream.Graph,scala.Function2)) if a different strategy is needed.
		- #### atopMat
		
		
		
		```
		public <OO1,​II2,​Mat2,​M> [BidiFlow](BidiFlow.html "class in akka.stream.scaladsl")<[I1](BidiFlow.html "type parameter in BidiFlow"),​OO1,​II2,​[O2](BidiFlow.html "type parameter in BidiFlow"),​M> atopMat​([Graph](../Graph.html "interface in akka.stream")<[BidiShape](../BidiShape.html "class in akka.stream")<[O1](BidiFlow.html "type parameter in BidiFlow"),​OO1,​II2,​[I2](BidiFlow.html "type parameter in BidiFlow")>,​Mat2> bidi,
		                                                                                                    scala.Function2<[Mat](BidiFlow.html "type parameter in BidiFlow"),​Mat2,​M> combine)
		```
		
		Add the given BidiFlow as the next step in a bidirectional transformation
		 pipeline. By convention protocol stacks are growing to the left: the right most is the bottom
		 layer, the closest to the metal.
		 
		```
		
		     +----------------------------+
		     | Resulting BidiFlow         |
		     |                            |
		     |  +------+        +------+  |
		 I1 ~~> |      |  ~O1~> |      | ~~> OO1
		     |  | this |        | bidi |  |
		 O2 <~~ |      | <~I2~  |      | <~~ II2
		     |  +------+        +------+  |
		     +----------------------------+
		 
		```
		
		 The `combine` function is used to compose the materialized values of this flow and that
		 flow into the materialized value of the resulting BidiFlow.
		- #### join
		
		
		
		```
		public <Mat2> [Flow](Flow.html "class in akka.stream.scaladsl")<[I1](BidiFlow.html "type parameter in BidiFlow"),​[O2](BidiFlow.html "type parameter in BidiFlow"),​[Mat](BidiFlow.html "type parameter in BidiFlow")> join​([Graph](../Graph.html "interface in akka.stream")<[FlowShape](../FlowShape.html "class in akka.stream")<[O1](BidiFlow.html "type parameter in BidiFlow"),​[I2](BidiFlow.html "type parameter in BidiFlow")>,​Mat2> flow)
		```
		
		Add the given Flow as the final step in a bidirectional transformation
		 pipeline. By convention protocol stacks are growing to the left: the right most is the bottom
		 layer, the closest to the metal.
		 
		```
		
		     +---------------------------+
		     | Resulting Flow            |
		     |                           |
		     |  +------+        +------+ |
		 I1 ~~> |      |  ~O1~> |      | |
		     |  | this |        | flow | |
		 O2 <~~ |      | <~I2~  |      | |
		     |  +------+        +------+ |
		     +---------------------------+
		 
		```
		
		 The materialized value of the combined [`Flow`](Flow.html "class in akka.stream.scaladsl") will be the materialized
		 value of the current flow (ignoring the other Flow\&rsquo;s value), use
		 [`joinMat`](#joinMat(akka.stream.Graph,scala.Function2)) if a different strategy is needed.
		- #### joinMat
		
		
		
		```
		public <Mat2,​M> [Flow](Flow.html "class in akka.stream.scaladsl")<[I1](BidiFlow.html "type parameter in BidiFlow"),​[O2](BidiFlow.html "type parameter in BidiFlow"),​M> joinMat​([Graph](../Graph.html "interface in akka.stream")<[FlowShape](../FlowShape.html "class in akka.stream")<[O1](BidiFlow.html "type parameter in BidiFlow"),​[I2](BidiFlow.html "type parameter in BidiFlow")>,​Mat2> flow,
		                                                        scala.Function2<[Mat](BidiFlow.html "type parameter in BidiFlow"),​Mat2,​M> combine)
		```
		
		Add the given Flow as the final step in a bidirectional transformation
		 pipeline. By convention protocol stacks are growing to the left: the right most is the bottom
		 layer, the closest to the metal.
		 
		```
		
		     +---------------------------+
		     | Resulting Flow            |
		     |                           |
		     |  +------+        +------+ |
		 I1 ~~> |      |  ~O1~> |      | |
		     |  | this |        | flow | |
		 O2 <~~ |      | <~I2~  |      | |
		     |  +------+        +------+ |
		     +---------------------------+
		 
		```
		
		 The `combine` function is used to compose the materialized values of this flow and that
		 flow into the materialized value of the resulting [`Flow`](Flow.html "class in akka.stream.scaladsl").
		- #### reversed
		
		
		
		```
		public [BidiFlow](BidiFlow.html "class in akka.stream.scaladsl")<[I2](BidiFlow.html "type parameter in BidiFlow"),​[O2](BidiFlow.html "type parameter in BidiFlow"),​[I1](BidiFlow.html "type parameter in BidiFlow"),​[O1](BidiFlow.html "type parameter in BidiFlow"),​[Mat](BidiFlow.html "type parameter in BidiFlow")> reversed()
		```
		
		Turn this BidiFlow around by 180 degrees, logically flipping it upside down in a protocol stack.
		- #### mapMaterializedValue
		
		
		
		```
		public <Mat2> [BidiFlow](BidiFlow.html "class in akka.stream.scaladsl")<[I1](BidiFlow.html "type parameter in BidiFlow"),​[O1](BidiFlow.html "type parameter in BidiFlow"),​[I2](BidiFlow.html "type parameter in BidiFlow"),​[O2](BidiFlow.html "type parameter in BidiFlow"),​Mat2> mapMaterializedValue​(scala.Function1<[Mat](BidiFlow.html "type parameter in BidiFlow"),​Mat2> f)
		```
		
		Transform only the materialized value of this BidiFlow, leaving all other properties as they were.
		- #### withAttributes
		
		
		
		```
		public [BidiFlow](BidiFlow.html "class in akka.stream.scaladsl")<[I1](BidiFlow.html "type parameter in BidiFlow"),​[O1](BidiFlow.html "type parameter in BidiFlow"),​[I2](BidiFlow.html "type parameter in BidiFlow"),​[O2](BidiFlow.html "type parameter in BidiFlow"),​[Mat](BidiFlow.html "type parameter in BidiFlow")> withAttributes​([Attributes](../Attributes.html "class in akka.stream") attr)
		```
		
		Change the attributes of this [`Source`](Source.html "class in akka.stream.scaladsl") to the given ones and seal the list
		 of attributes. This means that further calls will not be able to remove these
		 attributes, but instead add new ones. Note that this
		 operation has no effect on an empty Flow (because the attributes apply
		 only to the contained processing operators).
		
		Specified by:
		`[withAttributes](../Graph.html#withAttributes(akka.stream.Attributes))` in interface `[Graph](../Graph.html "interface in akka.stream")<[I1](BidiFlow.html "type parameter in BidiFlow"),​[O1](BidiFlow.html "type parameter in BidiFlow")>`
		- #### addAttributes
		
		
		
		```
		public [BidiFlow](BidiFlow.html "class in akka.stream.scaladsl")<[I1](BidiFlow.html "type parameter in BidiFlow"),​[O1](BidiFlow.html "type parameter in BidiFlow"),​[I2](BidiFlow.html "type parameter in BidiFlow"),​[O2](BidiFlow.html "type parameter in BidiFlow"),​[Mat](BidiFlow.html "type parameter in BidiFlow")> addAttributes​([Attributes](../Attributes.html "class in akka.stream") attr)
		```
		
		Add the given attributes to this Source. Further calls to `withAttributes`
		 will not remove these attributes. Note that this
		 operation has no effect on an empty Flow (because the attributes apply
		 only to the contained processing operators).
		
		Specified by:
		`[addAttributes](../Graph.html#addAttributes(akka.stream.Attributes))` in interface `[Graph](../Graph.html "interface in akka.stream")<[I1](BidiFlow.html "type parameter in BidiFlow"),​[O1](BidiFlow.html "type parameter in BidiFlow")>`
		- #### named
		
		
		
		```
		public [BidiFlow](BidiFlow.html "class in akka.stream.scaladsl")<[I1](BidiFlow.html "type parameter in BidiFlow"),​[O1](BidiFlow.html "type parameter in BidiFlow"),​[I2](BidiFlow.html "type parameter in BidiFlow"),​[O2](BidiFlow.html "type parameter in BidiFlow"),​[Mat](BidiFlow.html "type parameter in BidiFlow")> named​(java.lang.String name)
		```
		
		Add a name attribute to this Flow.
		
		Specified by:
		`[named](../Graph.html#named(java.lang.String))` in interface `[Graph](../Graph.html "interface in akka.stream")<[I1](BidiFlow.html "type parameter in BidiFlow"),​[O1](BidiFlow.html "type parameter in BidiFlow")>`
		- #### async
		
		
		
		```
		public [BidiFlow](BidiFlow.html "class in akka.stream.scaladsl")<[I1](BidiFlow.html "type parameter in BidiFlow"),​[O1](BidiFlow.html "type parameter in BidiFlow"),​[I2](BidiFlow.html "type parameter in BidiFlow"),​[O2](BidiFlow.html "type parameter in BidiFlow"),​[Mat](BidiFlow.html "type parameter in BidiFlow")> async()
		```
		
		Put an asynchronous boundary around this `BidiFlow`
		
		Specified by:
		`[async](../Graph.html#async())` in interface `[Graph](../Graph.html "interface in akka.stream")<[I1](BidiFlow.html "type parameter in BidiFlow"),​[O1](BidiFlow.html "type parameter in BidiFlow")>`
		- #### async
		
		
		
		```
		public [BidiFlow](BidiFlow.html "class in akka.stream.scaladsl")<[I1](BidiFlow.html "type parameter in BidiFlow"),​[O1](BidiFlow.html "type parameter in BidiFlow"),​[I2](BidiFlow.html "type parameter in BidiFlow"),​[O2](BidiFlow.html "type parameter in BidiFlow"),​[Mat](BidiFlow.html "type parameter in BidiFlow")> async​(java.lang.String dispatcher)
		```
		
		Put an asynchronous boundary around this `BidiFlow`
		
		
		Specified by:
		`[async](../Graph.html#async(java.lang.String))` in interface `[Graph](../Graph.html "interface in akka.stream")<[I1](BidiFlow.html "type parameter in BidiFlow"),​[O1](BidiFlow.html "type parameter in BidiFlow")>`
		Parameters:
		`dispatcher` \- Run the graph on this dispatcher
		- #### async
		
		
		
		```
		public [BidiFlow](BidiFlow.html "class in akka.stream.scaladsl")<[I1](BidiFlow.html "type parameter in BidiFlow"),​[O1](BidiFlow.html "type parameter in BidiFlow"),​[I2](BidiFlow.html "type parameter in BidiFlow"),​[O2](BidiFlow.html "type parameter in BidiFlow"),​[Mat](BidiFlow.html "type parameter in BidiFlow")> async​(java.lang.String dispatcher,
		                                                               int inputBufferSize)
		```
		
		Put an asynchronous boundary around this `BidiFlow`
		
		
		Specified by:
		`[async](../Graph.html#async(java.lang.String,int))` in interface `[Graph](../Graph.html "interface in akka.stream")<[I1](BidiFlow.html "type parameter in BidiFlow"),​[O1](BidiFlow.html "type parameter in BidiFlow")>`
		Parameters:
		`dispatcher` \- Run the graph on this dispatcher
		`inputBufferSize` \- Set the input buffer to this size for the graph
		- #### getAttributes
		
		
		
		```
		public [Attributes](../Attributes.html "class in akka.stream") getAttributes()
		```
		
		
		Specified by:
		`[getAttributes](../Graph.html#getAttributes())` in interface `[Graph](../Graph.html "interface in akka.stream")<[I1](BidiFlow.html "type parameter in BidiFlow"),​[O1](BidiFlow.html "type parameter in BidiFlow")>`

## Code Examples

### Example 1: fromFlowsMat

```text
+----------------------------+
     | Resulting BidiFlow         |
     |                            |
     |  +----------------------+  |
 I1 ~~> |        Flow1         | ~~> O1
     |  +----------------------+  |
     |                            |
     |  +----------------------+  |
 O2 <~~ |        Flow2         | <~~ I2
     |  +----------------------+  |
     +----------------------------+
```

### Example 2: fromFlows

```text
+----------------------------+
     | Resulting BidiFlow         |
     |                            |
     |  +----------------------+  |
 I1 ~~> |        Flow1         | ~~> O1
     |  +----------------------+  |
     |                            |
     |  +----------------------+  |
 O2 <~~ |        Flow2         | <~~ I2
     |  +----------------------+  |
     +----------------------------+
```

### Example 3: atop

```text
+----------------------------+
     | Resulting BidiFlow         |
     |                            |
     |  +------+        +------+  |
 I1 ~~> |      |  ~O1~> |      | ~~> OO1
     |  | this |        | bidi |  |
 O2 <~~ |      | <~I2~  |      | <~~ II2
     |  +------+        +------+  |
     +----------------------------+
```

### Example 4: atopMat

```text
+----------------------------+
     | Resulting BidiFlow         |
     |                            |
     |  +------+        +------+  |
 I1 ~~> |      |  ~O1~> |      | ~~> OO1
     |  | this |        | bidi |  |
 O2 <~~ |      | <~I2~  |      | <~~ II2
     |  +------+        +------+  |
     +----------------------------+
```

### Example 5: join

```text
+---------------------------+
     | Resulting Flow            |
     |                           |
     |  +------+        +------+ |
 I1 ~~> |      |  ~O1~> |      | |
     |  | this |        | flow | |
 O2 <~~ |      | <~I2~  |      | |
     |  +------+        +------+ |
     +---------------------------+
```

### Example 6: joinMat

```text
+---------------------------+
     | Resulting Flow            |
     |                           |
     |  +------+        +------+ |
 I1 ~~> |      |  ~O1~> |      | |
     |  | this |        | flow | |
 O2 <~~ |      | <~I2~  |      | |
     |  +------+        +------+ |
     +---------------------------+
```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/2.10/akka/NotUsed.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/Attributes.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/BidiShape.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/FlowShape.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/Graph.GraphMapMatVal.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/Graph.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/Shape.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/StreamIdleTimeoutException.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/javadsl/BidiFlow.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/scaladsl/BidiFlow.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/scaladsl/Flow.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/scaladsl/Source.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/scaladsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/2.10/akka/stream/scaladsl/BidiFlow.html](https://doc.akka.io/japi/akka/2.10/akka/stream/scaladsl/BidiFlow.html)*