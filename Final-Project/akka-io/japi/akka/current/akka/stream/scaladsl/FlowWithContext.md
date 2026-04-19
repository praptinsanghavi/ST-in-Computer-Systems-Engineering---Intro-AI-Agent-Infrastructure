---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:40:50Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/FlowWithContext.html
title: FlowWithContext
---

# FlowWithContext

## Content

Package [akka.stream.scaladsl](package-summary.html)
## Class FlowWithContext\<In,​CtxIn,​Out,​CtxOut,​Mat\>

- java.lang.Object
- - akka.stream.GraphDelegate\<[FlowShape](../FlowShape.html "class in akka.stream")\<scala.Tuple2\<In,​CtxIn\>,​scala.Tuple2\<Out,​CtxOut\>\>,​Mat\>
	- - akka.stream.scaladsl.FlowWithContext\<In,​CtxIn,​Out,​CtxOut,​Mat\>

- All Implemented Interfaces:
`[Graph](../Graph.html "interface in akka.stream")<[FlowShape](../FlowShape.html "class in akka.stream")<scala.Tuple2<In,​CtxIn>,​scala.Tuple2<Out,​CtxOut>>,​Mat>`, `[FlowWithContextOps](FlowWithContextOps.html "interface in akka.stream.scaladsl")<Out,​CtxOut,​Mat>`

---

```
public final class FlowWithContext<In,​CtxIn,​Out,​CtxOut,​Mat>
extends akka.stream.GraphDelegate<[FlowShape](../FlowShape.html "class in akka.stream")<scala.Tuple2<In,​CtxIn>,​scala.Tuple2<Out,​CtxOut>>,​Mat>
implements [FlowWithContextOps](FlowWithContextOps.html "interface in akka.stream.scaladsl")<Out,​CtxOut,​Mat>
```

A flow that provides operations which automatically propagate the context of an element.
 Only a subset of common operations from [`FlowOps`](FlowOps.html "interface in akka.stream.scaladsl") is supported. As an escape hatch you can
 use `FlowWithContextOps.via` to manually provide the context propagation for otherwise unsupported
 operations.
 
 An "empty" flow can be created by calling `FlowWithContext[Ctx, T]`.

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface akka.stream.[Graph](../Graph.html "interface in akka.stream")
		
		
		`[Graph.GraphMapMatVal](../Graph.GraphMapMatVal.html "class in akka.stream")<[S](../Graph.GraphMapMatVal.html "type parameter in Graph.GraphMapMatVal") extends [Shape](../Shape.html "class in akka.stream"),​[M](../Graph.GraphMapMatVal.html "type parameter in Graph.GraphMapMatVal")>`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[FlowWithContext](#%3Cinit%3E(akka.stream.scaladsl.Flow))​([Flow](Flow.html "class in akka.stream.scaladsl")<scala.Tuple2<[In](FlowWithContext.html "type parameter in FlowWithContext"),​[CtxIn](FlowWithContext.html "type parameter in FlowWithContext")>,​scala.Tuple2<[Out](FlowWithContext.html "type parameter in FlowWithContext"),​[CtxOut](FlowWithContext.html "type parameter in FlowWithContext")>,​[Mat](FlowWithContext.html "type parameter in FlowWithContext")> delegate)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static <In,​Ctx>[FlowWithContext](FlowWithContext.html "class in akka.stream.scaladsl")<In,​Ctx,​In,​Ctx,​[NotUsed](../../NotUsed.html "class in akka")>` | `[apply](#apply())()` | Creates an "empty" FlowWithContext that passes elements through with their context unchanged. |
	| `[Flow](Flow.html "class in akka.stream.scaladsl")<scala.Tuple2<[In](FlowWithContext.html "type parameter in FlowWithContext"),​[CtxIn](FlowWithContext.html "type parameter in FlowWithContext")>,​scala.Tuple2<[Out](FlowWithContext.html "type parameter in FlowWithContext"),​[CtxOut](FlowWithContext.html "type parameter in FlowWithContext")>,​[Mat](FlowWithContext.html "type parameter in FlowWithContext")>` | `[asFlow](#asFlow())()` |  |
	| `<JIn extends [In](FlowWithContext.html "type parameter in FlowWithContext"),​JCtxIn extends [CtxIn](FlowWithContext.html "type parameter in FlowWithContext"),​JOut,​JCtxOut,​JMat>[FlowWithContext](../javadsl/FlowWithContext.html "class in akka.stream.javadsl")<JIn,​JCtxIn,​JOut,​JCtxOut,​JMat>` | `[asJava](#asJava())()` |  |
	| `static <In,​CtxIn,​Out,​CtxOut,​Mat>[FlowWithContext](FlowWithContext.html "class in akka.stream.scaladsl")<In,​CtxIn,​Out,​CtxOut,​Mat>` | `[fromTuples](#fromTuples(akka.stream.scaladsl.Flow))​([Flow](Flow.html "class in akka.stream.scaladsl")<scala.Tuple2<In,​CtxIn>,​scala.Tuple2<Out,​CtxOut>,​Mat> flow)` | Creates a FlowWithContext from a regular flow that operates on a tuple of `(data, context)` elements. |
	| `<Mat2> [FlowWithContext](FlowWithContext.html "class in akka.stream.scaladsl")<[In](FlowWithContext.html "type parameter in FlowWithContext"),​[CtxIn](FlowWithContext.html "type parameter in FlowWithContext"),​[Out](FlowWithContext.html "type parameter in FlowWithContext"),​[CtxOut](FlowWithContext.html "type parameter in FlowWithContext"),​Mat2>` | `[mapMaterializedValue](#mapMaterializedValue(scala.Function1))​(scala.Function1<[Mat](FlowWithContext.html "type parameter in FlowWithContext"),​Mat2> f)` | Context\-preserving variant of `akka.stream.scaladsl.Flow.mapMaterializedValue`. |
	| `<Out2,​Mat2>[FlowWithContext](FlowWithContext.html "class in akka.stream.scaladsl")<[In](FlowWithContext.html "type parameter in FlowWithContext"),​[CtxIn](FlowWithContext.html "type parameter in FlowWithContext"),​Out2,​[CtxOut](FlowWithContext.html "type parameter in FlowWithContext"),​[Mat](FlowWithContext.html "type parameter in FlowWithContext")>` | `[unsafeDataVia](#unsafeDataVia(akka.stream.Graph))​([Graph](../Graph.html "interface in akka.stream")<[FlowShape](../FlowShape.html "class in akka.stream")<[Out](FlowWithContext.html "type parameter in FlowWithContext"),​Out2>,​Mat2> viaFlow)` | Transform this flow by the regular flow. |
	| `<Out2,​Ctx2,​Mat2>[FlowWithContext](FlowWithContext.html "class in akka.stream.scaladsl")<[In](FlowWithContext.html "type parameter in FlowWithContext"),​[CtxIn](FlowWithContext.html "type parameter in FlowWithContext"),​Out2,​Ctx2,​[Mat](FlowWithContext.html "type parameter in FlowWithContext")>` | `[via](#via(akka.stream.Graph))​([Graph](../Graph.html "interface in akka.stream")<[FlowShape](../FlowShape.html "class in akka.stream")<scala.Tuple2<[Out](FlowWithContext.html "type parameter in FlowWithContext"),​[CtxOut](FlowWithContext.html "type parameter in FlowWithContext")>,​scala.Tuple2<Out2,​Ctx2>>,​Mat2> viaFlow)` | Transform this flow by the regular flow. |
	| `<Out2,​Ctx2,​Mat2,​Mat3>[FlowWithContext](FlowWithContext.html "class in akka.stream.scaladsl")<[In](FlowWithContext.html "type parameter in FlowWithContext"),​[CtxIn](FlowWithContext.html "type parameter in FlowWithContext"),​Out2,​Ctx2,​Mat3>` | `[viaMat](#viaMat(akka.stream.Graph,scala.Function2))​([Graph](../Graph.html "interface in akka.stream")<[FlowShape](../FlowShape.html "class in akka.stream")<scala.Tuple2<[Out](FlowWithContext.html "type parameter in FlowWithContext"),​[CtxOut](FlowWithContext.html "type parameter in FlowWithContext")>,​scala.Tuple2<Out2,​Ctx2>>,​Mat2> flow,  scala.Function2<[Mat](FlowWithContext.html "type parameter in FlowWithContext"),​Mat2,​Mat3> combine)` | Transform this flow by the regular flow. |
	| `[FlowWithContext](FlowWithContext.html "class in akka.stream.scaladsl")<[In](FlowWithContext.html "type parameter in FlowWithContext"),​[CtxIn](FlowWithContext.html "type parameter in FlowWithContext"),​[Out](FlowWithContext.html "type parameter in FlowWithContext"),​[CtxOut](FlowWithContext.html "type parameter in FlowWithContext"),​[Mat](FlowWithContext.html "type parameter in FlowWithContext")>` | `[withAttributes](#withAttributes(akka.stream.Attributes))​([Attributes](../Attributes.html "class in akka.stream") attr)` | Context\-preserving variant of `akka.stream.scaladsl.Flow.withAttributes`. |
	
	
		- ### Methods inherited from class akka.stream.GraphDelegate
		
		
		`addAttributes, async, async, async, getAttributes, named, shape, traversalBuilder`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.stream.scaladsl.[FlowWithContextOps](FlowWithContextOps.html "interface in akka.stream.scaladsl")
		
		
		`[collect](FlowWithContextOps.html#collect(scala.PartialFunction)), [filter](FlowWithContextOps.html#filter(scala.Function1)), [filterNot](FlowWithContextOps.html#filterNot(scala.Function1)), [flow](FlowWithContextOps.html#flow()), [grouped](FlowWithContextOps.html#grouped(int)), [log](FlowWithContextOps.html#log(java.lang.String,scala.Function1,akka.event.LoggingAdapter)), [log$default$2](FlowWithContextOps.html#log$default$2()), [log$default$3](FlowWithContextOps.html#log$default$3(java.lang.String,scala.Function1)), [logWithMarker](FlowWithContextOps.html#logWithMarker(java.lang.String,scala.Function2,scala.Function1,akka.event.MarkerLoggingAdapter)), [logWithMarker$default$3](FlowWithContextOps.html#logWithMarker$default$3()), [logWithMarker$default$4](FlowWithContextOps.html#logWithMarker$default$4(java.lang.String,scala.Function2,scala.Function1)), [map](FlowWithContextOps.html#map(scala.Function1)), [mapAsync](FlowWithContextOps.html#mapAsync(int,scala.Function1)), [mapAsyncPartitioned](FlowWithContextOps.html#mapAsyncPartitioned(int,int,scala.Function1,scala.Function2)), [mapConcat](FlowWithContextOps.html#mapConcat(scala.Function1)), [mapContext](FlowWithContextOps.html#mapContext(scala.Function1)), [mapError](FlowWithContextOps.html#mapError(scala.PartialFunction)), [sliding](FlowWithContextOps.html#sliding(int,int)), [sliding$default$2](FlowWithContextOps.html#sliding$default$2()), [throttle](FlowWithContextOps.html#throttle(int,scala.concurrent.duration.FiniteDuration)), [throttle](FlowWithContextOps.html#throttle(int,scala.concurrent.duration.FiniteDuration,int,akka.stream.ThrottleMode)), [throttle](FlowWithContextOps.html#throttle(int,scala.concurrent.duration.FiniteDuration,int,scala.Function1,akka.stream.ThrottleMode)), [throttle](FlowWithContextOps.html#throttle(int,scala.concurrent.duration.FiniteDuration,scala.Function1)), [throttle](FlowWithContextOps.html#throttle(akka.stream.scaladsl.ThrottleControl)), [throttle](FlowWithContextOps.html#throttle(akka.stream.scaladsl.ThrottleControl,scala.Function1))`

- - ### Constructor Detail
	
	
	
		- #### FlowWithContext
		
		
		
		```
		public FlowWithContext​([Flow](Flow.html "class in akka.stream.scaladsl")<scala.Tuple2<[In](FlowWithContext.html "type parameter in FlowWithContext"),​[CtxIn](FlowWithContext.html "type parameter in FlowWithContext")>,​scala.Tuple2<[Out](FlowWithContext.html "type parameter in FlowWithContext"),​[CtxOut](FlowWithContext.html "type parameter in FlowWithContext")>,​[Mat](FlowWithContext.html "type parameter in FlowWithContext")> delegate)
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static <In,​Ctx> [FlowWithContext](FlowWithContext.html "class in akka.stream.scaladsl")<In,​Ctx,​In,​Ctx,​[NotUsed](../../NotUsed.html "class in akka")> apply()
		```
		
		Creates an "empty" FlowWithContext that passes elements through with their context unchanged.
		- #### fromTuples
		
		
		
		```
		public static <In,​CtxIn,​Out,​CtxOut,​Mat> [FlowWithContext](FlowWithContext.html "class in akka.stream.scaladsl")<In,​CtxIn,​Out,​CtxOut,​Mat> fromTuples​([Flow](Flow.html "class in akka.stream.scaladsl")<scala.Tuple2<In,​CtxIn>,​scala.Tuple2<Out,​CtxOut>,​Mat> flow)
		```
		
		Creates a FlowWithContext from a regular flow that operates on a tuple of `(data, context)` elements.
		- #### via
		
		
		
		```
		public <Out2,​Ctx2,​Mat2> [FlowWithContext](FlowWithContext.html "class in akka.stream.scaladsl")<[In](FlowWithContext.html "type parameter in FlowWithContext"),​[CtxIn](FlowWithContext.html "type parameter in FlowWithContext"),​Out2,​Ctx2,​[Mat](FlowWithContext.html "type parameter in FlowWithContext")> via​([Graph](../Graph.html "interface in akka.stream")<[FlowShape](../FlowShape.html "class in akka.stream")<scala.Tuple2<[Out](FlowWithContext.html "type parameter in FlowWithContext"),​[CtxOut](FlowWithContext.html "type parameter in FlowWithContext")>,​scala.Tuple2<Out2,​Ctx2>>,​Mat2> viaFlow)
		```
		
		Description copied from interface: `[FlowWithContextOps](FlowWithContextOps.html#via(akka.stream.Graph))`
		Transform this flow by the regular flow. The given flow must support manual context propagation by
		 taking and producing tuples of (data, context).
		 
		 It is up to the implementer to ensure the inner flow does not exhibit any behaviour that is not expected
		 by the downstream elements, such as reordering. For more background on these requirements
		 see https://doc.akka.io/libraries/akka\-core/current/stream/stream\-context.html.
		 
		
		
		 This can be used as an escape hatch for operations that are not (yet) provided with automatic
		 context propagation here.
		 
		
		
		
		Specified by:
		`[via](FlowWithContextOps.html#via(akka.stream.Graph))` in interface `[FlowWithContextOps](FlowWithContextOps.html "interface in akka.stream.scaladsl")<[In](FlowWithContext.html "type parameter in FlowWithContext"),​[CtxIn](FlowWithContext.html "type parameter in FlowWithContext"),​[Out](FlowWithContext.html "type parameter in FlowWithContext")>`
		See Also:
		`akka.stream.scaladsl.FlowOps.via`
		- #### unsafeDataVia
		
		
		
		```
		public <Out2,​Mat2> [FlowWithContext](FlowWithContext.html "class in akka.stream.scaladsl")<[In](FlowWithContext.html "type parameter in FlowWithContext"),​[CtxIn](FlowWithContext.html "type parameter in FlowWithContext"),​Out2,​[CtxOut](FlowWithContext.html "type parameter in FlowWithContext"),​[Mat](FlowWithContext.html "type parameter in FlowWithContext")> unsafeDataVia​([Graph](../Graph.html "interface in akka.stream")<[FlowShape](../FlowShape.html "class in akka.stream")<[Out](FlowWithContext.html "type parameter in FlowWithContext"),​Out2>,​Mat2> viaFlow)
		```
		
		Description copied from interface: `[FlowWithContextOps](FlowWithContextOps.html#unsafeDataVia(akka.stream.Graph))`
		Transform this flow by the regular flow. The given flow works on the data portion of the stream and
		 ignores the context.
		 
		 The given flow \*must\* not re\-order, drop or emit multiple elements for one incoming
		 element, the sequence of incoming contexts is re\-combined with the outgoing
		 elements of the stream. If a flow not fulfilling this requirement is used the stream
		 will not fail but continue running in a corrupt state and re\-combine incorrect pairs
		 of elements and contexts or deadlock.
		 
		
		
		 For more background on these requirements
		 see https://doc.akka.io/libraries/akka\-core/current/stream/stream\-context.html.
		
		
		
		Specified by:
		`[unsafeDataVia](FlowWithContextOps.html#unsafeDataVia(akka.stream.Graph))` in interface `[FlowWithContextOps](FlowWithContextOps.html "interface in akka.stream.scaladsl")<[In](FlowWithContext.html "type parameter in FlowWithContext"),​[CtxIn](FlowWithContext.html "type parameter in FlowWithContext"),​[Out](FlowWithContext.html "type parameter in FlowWithContext")>`
		- #### viaMat
		
		
		
		```
		public <Out2,​Ctx2,​Mat2,​Mat3> [FlowWithContext](FlowWithContext.html "class in akka.stream.scaladsl")<[In](FlowWithContext.html "type parameter in FlowWithContext"),​[CtxIn](FlowWithContext.html "type parameter in FlowWithContext"),​Out2,​Ctx2,​Mat3> viaMat​([Graph](../Graph.html "interface in akka.stream")<[FlowShape](../FlowShape.html "class in akka.stream")<scala.Tuple2<[Out](FlowWithContext.html "type parameter in FlowWithContext"),​[CtxOut](FlowWithContext.html "type parameter in FlowWithContext")>,​scala.Tuple2<Out2,​Ctx2>>,​Mat2> flow,
		                                                                                                                       scala.Function2<[Mat](FlowWithContext.html "type parameter in FlowWithContext"),​Mat2,​Mat3> combine)
		```
		
		Description copied from interface: `[FlowWithContextOps](FlowWithContextOps.html#viaMat(akka.stream.Graph,scala.Function2))`
		Transform this flow by the regular flow. The given flow must support manual context propagation by
		 taking and producing tuples of (data, context).
		 
		 It is up to the implementer to ensure the inner flow does not exhibit any behaviour that is not expected
		 by the downstream elements, such as reordering. For more background on these requirements
		 see https://doc.akka.io/libraries/akka\-core/current/stream/stream\-context.html.
		 
		
		
		 This can be used as an escape hatch for operations that are not (yet) provided with automatic
		 context propagation here.
		 
		
		
		 The `combine` function is used to compose the materialized values of this flow and that
		 flow into the materialized value of the resulting Flow.
		 
		
		
		
		Specified by:
		`[viaMat](FlowWithContextOps.html#viaMat(akka.stream.Graph,scala.Function2))` in interface `[FlowWithContextOps](FlowWithContextOps.html "interface in akka.stream.scaladsl")<[In](FlowWithContext.html "type parameter in FlowWithContext"),​[CtxIn](FlowWithContext.html "type parameter in FlowWithContext"),​[Out](FlowWithContext.html "type parameter in FlowWithContext")>`
		See Also:
		`akka.stream.scaladsl.FlowOpsMat.viaMat`
		- #### withAttributes
		
		
		
		```
		public [FlowWithContext](FlowWithContext.html "class in akka.stream.scaladsl")<[In](FlowWithContext.html "type parameter in FlowWithContext"),​[CtxIn](FlowWithContext.html "type parameter in FlowWithContext"),​[Out](FlowWithContext.html "type parameter in FlowWithContext"),​[CtxOut](FlowWithContext.html "type parameter in FlowWithContext"),​[Mat](FlowWithContext.html "type parameter in FlowWithContext")> withAttributes​([Attributes](../Attributes.html "class in akka.stream") attr)
		```
		
		Context\-preserving variant of `akka.stream.scaladsl.Flow.withAttributes`.
		 
		
		Specified by:
		`[withAttributes](../Graph.html#withAttributes(akka.stream.Attributes))` in interface `[Graph](../Graph.html "interface in akka.stream")<[In](FlowWithContext.html "type parameter in FlowWithContext"),​[CtxIn](FlowWithContext.html "type parameter in FlowWithContext")>`
		See Also:
		`akka.stream.scaladsl.Flow.withAttributes`
		- #### mapMaterializedValue
		
		
		
		```
		public <Mat2> [FlowWithContext](FlowWithContext.html "class in akka.stream.scaladsl")<[In](FlowWithContext.html "type parameter in FlowWithContext"),​[CtxIn](FlowWithContext.html "type parameter in FlowWithContext"),​[Out](FlowWithContext.html "type parameter in FlowWithContext"),​[CtxOut](FlowWithContext.html "type parameter in FlowWithContext"),​Mat2> mapMaterializedValue​(scala.Function1<[Mat](FlowWithContext.html "type parameter in FlowWithContext"),​Mat2> f)
		```
		
		Context\-preserving variant of `akka.stream.scaladsl.Flow.mapMaterializedValue`.
		 
		
		See Also:
		`akka.stream.scaladsl.Flow.mapMaterializedValue`
		- #### asFlow
		
		
		
		```
		public [Flow](Flow.html "class in akka.stream.scaladsl")<scala.Tuple2<[In](FlowWithContext.html "type parameter in FlowWithContext"),​[CtxIn](FlowWithContext.html "type parameter in FlowWithContext")>,​scala.Tuple2<[Out](FlowWithContext.html "type parameter in FlowWithContext"),​[CtxOut](FlowWithContext.html "type parameter in FlowWithContext")>,​[Mat](FlowWithContext.html "type parameter in FlowWithContext")> asFlow()
		```
		- #### asJava
		
		
		
		```
		public <JIn extends [In](FlowWithContext.html "type parameter in FlowWithContext"),​JCtxIn extends [CtxIn](FlowWithContext.html "type parameter in FlowWithContext"),​JOut,​JCtxOut,​JMat> [FlowWithContext](../javadsl/FlowWithContext.html "class in akka.stream.javadsl")<JIn,​JCtxIn,​JOut,​JCtxOut,​JMat> asJava()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/NotUsed.html
- https://doc.akka.io/japi/akka/current/akka/stream/Attributes.html
- https://doc.akka.io/japi/akka/current/akka/stream/FlowShape.html
- https://doc.akka.io/japi/akka/current/akka/stream/Graph.GraphMapMatVal.html
- https://doc.akka.io/japi/akka/current/akka/stream/Graph.html
- https://doc.akka.io/japi/akka/current/akka/stream/Shape.html
- https://doc.akka.io/japi/akka/current/akka/stream/javadsl/FlowWithContext.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/Flow.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/FlowOps.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/FlowWithContext.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/FlowWithContextOps.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/FlowWithContext.html](https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/FlowWithContext.html)*