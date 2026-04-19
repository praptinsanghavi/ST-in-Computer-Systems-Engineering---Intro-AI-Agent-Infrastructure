---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:40:49Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/SourceWithContext.html
title: SourceWithContext
---

# SourceWithContext

## Content

Package [akka.stream.scaladsl](package-summary.html)
## Class SourceWithContext\<Out,​Ctx,​Mat\>

- java.lang.Object
- - akka.stream.GraphDelegate\<[SourceShape](../SourceShape.html "class in akka.stream")\<scala.Tuple2\<Out,​Ctx\>\>,​Mat\>
	- - akka.stream.scaladsl.SourceWithContext\<Out,​Ctx,​Mat\>

- All Implemented Interfaces:
`[Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<scala.Tuple2<Out,​Ctx>>,​Mat>`, `[FlowWithContextOps](FlowWithContextOps.html "interface in akka.stream.scaladsl")<Out,​Ctx,​Mat>`

---

```
public final class SourceWithContext<Out,​Ctx,​Mat>
extends akka.stream.GraphDelegate<[SourceShape](../SourceShape.html "class in akka.stream")<scala.Tuple2<Out,​Ctx>>,​Mat>
implements [FlowWithContextOps](FlowWithContextOps.html "interface in akka.stream.scaladsl")<Out,​Ctx,​Mat>
```

A source that provides operations which automatically propagate the context of an element.
 Only a subset of common operations from [`FlowOps`](FlowOps.html "interface in akka.stream.scaladsl") is supported. As an escape hatch you can
 use `FlowWithContextOps.via` to manually provide the context propagation for otherwise unsupported
 operations.
 
 Can be created by calling `Source.asSourceWithContext`

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface akka.stream.[Graph](../Graph.html "interface in akka.stream")
		
		
		`[Graph.GraphMapMatVal](../Graph.GraphMapMatVal.html "class in akka.stream")<[S](../Graph.GraphMapMatVal.html "type parameter in Graph.GraphMapMatVal") extends [Shape](../Shape.html "class in akka.stream"),​[M](../Graph.GraphMapMatVal.html "type parameter in Graph.GraphMapMatVal")>`

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<JOut,​JCtx,​JMat>[SourceWithContext](../javadsl/SourceWithContext.html "class in akka.stream.javadsl")<JOut,​JCtx,​JMat>` | `[asJava](#asJava())()` |  |
	| `[Source](Source.html "class in akka.stream.scaladsl")<scala.Tuple2<[Out](SourceWithContext.html "type parameter in SourceWithContext"),​[Ctx](SourceWithContext.html "type parameter in SourceWithContext")>,​[Mat](SourceWithContext.html "type parameter in SourceWithContext")>` | `[asSource](#asSource())()` | Stops automatic context propagation from here and converts this to a regular  stream of a pair of (data, context). |
	| `static <Out,​CtxOut,​Mat>[SourceWithContext](SourceWithContext.html "class in akka.stream.scaladsl")<Out,​CtxOut,​Mat>` | `[fromTuples](#fromTuples(akka.stream.scaladsl.Source))​([Source](Source.html "class in akka.stream.scaladsl")<scala.Tuple2<Out,​CtxOut>,​Mat> source)` | Creates a SourceWithContext from a regular source that operates on a tuple of `(data, context)` elements. |
	| `<Mat2> [SourceWithContext](SourceWithContext.html "class in akka.stream.scaladsl")<[Out](SourceWithContext.html "type parameter in SourceWithContext"),​[Ctx](SourceWithContext.html "type parameter in SourceWithContext"),​Mat2>` | `[mapMaterializedValue](#mapMaterializedValue(scala.Function1))​(scala.Function1<[Mat](SourceWithContext.html "type parameter in SourceWithContext"),​Mat2> f)` | Context\-preserving variant of `akka.stream.scaladsl.Source.mapMaterializedValue`. |
	| `<Mat2> Mat2` | `[runWith](#runWith(akka.stream.Graph,akka.stream.Materializer))​([Graph](../Graph.html "interface in akka.stream")<[SinkShape](../SinkShape.html "class in akka.stream")<scala.Tuple2<[Out](SourceWithContext.html "type parameter in SourceWithContext"),​[Ctx](SourceWithContext.html "type parameter in SourceWithContext")>>,​Mat2> sink,  [Materializer](../Materializer.html "class in akka.stream") materializer)` | Connect this [`SourceWithContext`](SourceWithContext.html "class in akka.stream.scaladsl") to a [`Sink`](Sink.html "class in akka.stream.scaladsl") and run it. |
	| `<Mat2> [RunnableGraph](RunnableGraph.html "class in akka.stream.scaladsl")<[Mat](SourceWithContext.html "type parameter in SourceWithContext")>` | `[to](#to(akka.stream.Graph))​([Graph](../Graph.html "interface in akka.stream")<[SinkShape](../SinkShape.html "class in akka.stream")<scala.Tuple2<[Out](SourceWithContext.html "type parameter in SourceWithContext"),​[Ctx](SourceWithContext.html "type parameter in SourceWithContext")>>,​Mat2> sink)` | Connect this [`SourceWithContext`](SourceWithContext.html "class in akka.stream.scaladsl") to a [`Sink`](Sink.html "class in akka.stream.scaladsl"),  concatenating the processing steps of both. |
	| `<Mat2,​Mat3>[RunnableGraph](RunnableGraph.html "class in akka.stream.scaladsl")<Mat3>` | `[toMat](#toMat(akka.stream.Graph,scala.Function2))​([Graph](../Graph.html "interface in akka.stream")<[SinkShape](../SinkShape.html "class in akka.stream")<scala.Tuple2<[Out](SourceWithContext.html "type parameter in SourceWithContext"),​[Ctx](SourceWithContext.html "type parameter in SourceWithContext")>>,​Mat2> sink,  scala.Function2<[Mat](SourceWithContext.html "type parameter in SourceWithContext"),​Mat2,​Mat3> combine)` | Connect this [`SourceWithContext`](SourceWithContext.html "class in akka.stream.scaladsl") to a [`Sink`](Sink.html "class in akka.stream.scaladsl"),  concatenating the processing steps of both. |
	| `<Out2,​Mat2>[SourceWithContext](SourceWithContext.html "class in akka.stream.scaladsl")<Out2,​[Ctx](SourceWithContext.html "type parameter in SourceWithContext"),​[Mat](SourceWithContext.html "type parameter in SourceWithContext")>` | `[unsafeDataVia](#unsafeDataVia(akka.stream.Graph))​([Graph](../Graph.html "interface in akka.stream")<[FlowShape](../FlowShape.html "class in akka.stream")<[Out](SourceWithContext.html "type parameter in SourceWithContext"),​Out2>,​Mat2> viaFlow)` | Transform this flow by the regular flow. |
	| `<Out2,​Ctx2,​Mat2>[SourceWithContext](SourceWithContext.html "class in akka.stream.scaladsl")<Out2,​Ctx2,​[Mat](SourceWithContext.html "type parameter in SourceWithContext")>` | `[via](#via(akka.stream.Graph))​([Graph](../Graph.html "interface in akka.stream")<[FlowShape](../FlowShape.html "class in akka.stream")<scala.Tuple2<[Out](SourceWithContext.html "type parameter in SourceWithContext"),​[Ctx](SourceWithContext.html "type parameter in SourceWithContext")>,​scala.Tuple2<Out2,​Ctx2>>,​Mat2> viaFlow)` | Transform this flow by the regular flow. |
	| `<Out2,​Ctx2,​Mat2,​Mat3>[SourceWithContext](SourceWithContext.html "class in akka.stream.scaladsl")<Out2,​Ctx2,​Mat3>` | `[viaMat](#viaMat(akka.stream.Graph,scala.Function2))​([Graph](../Graph.html "interface in akka.stream")<[FlowShape](../FlowShape.html "class in akka.stream")<scala.Tuple2<[Out](SourceWithContext.html "type parameter in SourceWithContext"),​[Ctx](SourceWithContext.html "type parameter in SourceWithContext")>,​scala.Tuple2<Out2,​Ctx2>>,​Mat2> flow,  scala.Function2<[Mat](SourceWithContext.html "type parameter in SourceWithContext"),​Mat2,​Mat3> combine)` | Transform this flow by the regular flow. |
	| `[SourceWithContext](SourceWithContext.html "class in akka.stream.scaladsl")<[Out](SourceWithContext.html "type parameter in SourceWithContext"),​[Ctx](SourceWithContext.html "type parameter in SourceWithContext"),​[Mat](SourceWithContext.html "type parameter in SourceWithContext")>` | `[withAttributes](#withAttributes(akka.stream.Attributes))​([Attributes](../Attributes.html "class in akka.stream") attr)` | Context\-preserving variant of `akka.stream.scaladsl.Source.withAttributes`. |
	
	
		- ### Methods inherited from class akka.stream.GraphDelegate
		
		
		`addAttributes, async, async, async, getAttributes, named, shape, traversalBuilder`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.stream.scaladsl.[FlowWithContextOps](FlowWithContextOps.html "interface in akka.stream.scaladsl")
		
		
		`[collect](FlowWithContextOps.html#collect(scala.PartialFunction)), [filter](FlowWithContextOps.html#filter(scala.Function1)), [filterNot](FlowWithContextOps.html#filterNot(scala.Function1)), [flow](FlowWithContextOps.html#flow()), [grouped](FlowWithContextOps.html#grouped(int)), [log](FlowWithContextOps.html#log(java.lang.String,scala.Function1,akka.event.LoggingAdapter)), [log$default$2](FlowWithContextOps.html#log$default$2()), [log$default$3](FlowWithContextOps.html#log$default$3(java.lang.String,scala.Function1)), [logWithMarker](FlowWithContextOps.html#logWithMarker(java.lang.String,scala.Function2,scala.Function1,akka.event.MarkerLoggingAdapter)), [logWithMarker$default$3](FlowWithContextOps.html#logWithMarker$default$3()), [logWithMarker$default$4](FlowWithContextOps.html#logWithMarker$default$4(java.lang.String,scala.Function2,scala.Function1)), [map](FlowWithContextOps.html#map(scala.Function1)), [mapAsync](FlowWithContextOps.html#mapAsync(int,scala.Function1)), [mapAsyncPartitioned](FlowWithContextOps.html#mapAsyncPartitioned(int,int,scala.Function1,scala.Function2)), [mapConcat](FlowWithContextOps.html#mapConcat(scala.Function1)), [mapContext](FlowWithContextOps.html#mapContext(scala.Function1)), [mapError](FlowWithContextOps.html#mapError(scala.PartialFunction)), [sliding](FlowWithContextOps.html#sliding(int,int)), [sliding$default$2](FlowWithContextOps.html#sliding$default$2()), [throttle](FlowWithContextOps.html#throttle(int,scala.concurrent.duration.FiniteDuration)), [throttle](FlowWithContextOps.html#throttle(int,scala.concurrent.duration.FiniteDuration,int,akka.stream.ThrottleMode)), [throttle](FlowWithContextOps.html#throttle(int,scala.concurrent.duration.FiniteDuration,int,scala.Function1,akka.stream.ThrottleMode)), [throttle](FlowWithContextOps.html#throttle(int,scala.concurrent.duration.FiniteDuration,scala.Function1)), [throttle](FlowWithContextOps.html#throttle(akka.stream.scaladsl.ThrottleControl)), [throttle](FlowWithContextOps.html#throttle(akka.stream.scaladsl.ThrottleControl,scala.Function1))`

- - ### Method Detail
	
	
	
		- #### fromTuples
		
		
		
		```
		public static <Out,​CtxOut,​Mat> [SourceWithContext](SourceWithContext.html "class in akka.stream.scaladsl")<Out,​CtxOut,​Mat> fromTuples​([Source](Source.html "class in akka.stream.scaladsl")<scala.Tuple2<Out,​CtxOut>,​Mat> source)
		```
		
		Creates a SourceWithContext from a regular source that operates on a tuple of `(data, context)` elements.
		- #### via
		
		
		
		```
		public <Out2,​Ctx2,​Mat2> [SourceWithContext](SourceWithContext.html "class in akka.stream.scaladsl")<Out2,​Ctx2,​[Mat](SourceWithContext.html "type parameter in SourceWithContext")> via​([Graph](../Graph.html "interface in akka.stream")<[FlowShape](../FlowShape.html "class in akka.stream")<scala.Tuple2<[Out](SourceWithContext.html "type parameter in SourceWithContext"),​[Ctx](SourceWithContext.html "type parameter in SourceWithContext")>,​scala.Tuple2<Out2,​Ctx2>>,​Mat2> viaFlow)
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
		`[via](FlowWithContextOps.html#via(akka.stream.Graph))` in interface `[FlowWithContextOps](FlowWithContextOps.html "interface in akka.stream.scaladsl")<[Out](SourceWithContext.html "type parameter in SourceWithContext"),​[Ctx](SourceWithContext.html "type parameter in SourceWithContext"),​[Mat](SourceWithContext.html "type parameter in SourceWithContext")>`
		See Also:
		`akka.stream.scaladsl.FlowOps.via`
		- #### unsafeDataVia
		
		
		
		```
		public <Out2,​Mat2> [SourceWithContext](SourceWithContext.html "class in akka.stream.scaladsl")<Out2,​[Ctx](SourceWithContext.html "type parameter in SourceWithContext"),​[Mat](SourceWithContext.html "type parameter in SourceWithContext")> unsafeDataVia​([Graph](../Graph.html "interface in akka.stream")<[FlowShape](../FlowShape.html "class in akka.stream")<[Out](SourceWithContext.html "type parameter in SourceWithContext"),​Out2>,​Mat2> viaFlow)
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
		`[unsafeDataVia](FlowWithContextOps.html#unsafeDataVia(akka.stream.Graph))` in interface `[FlowWithContextOps](FlowWithContextOps.html "interface in akka.stream.scaladsl")<[Out](SourceWithContext.html "type parameter in SourceWithContext"),​[Ctx](SourceWithContext.html "type parameter in SourceWithContext"),​[Mat](SourceWithContext.html "type parameter in SourceWithContext")>`
		- #### viaMat
		
		
		
		```
		public <Out2,​Ctx2,​Mat2,​Mat3> [SourceWithContext](SourceWithContext.html "class in akka.stream.scaladsl")<Out2,​Ctx2,​Mat3> viaMat​([Graph](../Graph.html "interface in akka.stream")<[FlowShape](../FlowShape.html "class in akka.stream")<scala.Tuple2<[Out](SourceWithContext.html "type parameter in SourceWithContext"),​[Ctx](SourceWithContext.html "type parameter in SourceWithContext")>,​scala.Tuple2<Out2,​Ctx2>>,​Mat2> flow,
		                                                                                                    scala.Function2<[Mat](SourceWithContext.html "type parameter in SourceWithContext"),​Mat2,​Mat3> combine)
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
		`[viaMat](FlowWithContextOps.html#viaMat(akka.stream.Graph,scala.Function2))` in interface `[FlowWithContextOps](FlowWithContextOps.html "interface in akka.stream.scaladsl")<[Out](SourceWithContext.html "type parameter in SourceWithContext"),​[Ctx](SourceWithContext.html "type parameter in SourceWithContext"),​[Mat](SourceWithContext.html "type parameter in SourceWithContext")>`
		See Also:
		`akka.stream.scaladsl.FlowOpsMat.viaMat`
		- #### withAttributes
		
		
		
		```
		public [SourceWithContext](SourceWithContext.html "class in akka.stream.scaladsl")<[Out](SourceWithContext.html "type parameter in SourceWithContext"),​[Ctx](SourceWithContext.html "type parameter in SourceWithContext"),​[Mat](SourceWithContext.html "type parameter in SourceWithContext")> withAttributes​([Attributes](../Attributes.html "class in akka.stream") attr)
		```
		
		Context\-preserving variant of `akka.stream.scaladsl.Source.withAttributes`.
		 
		
		Specified by:
		`[withAttributes](../Graph.html#withAttributes(akka.stream.Attributes))` in interface `[Graph](../Graph.html "interface in akka.stream")<[Out](SourceWithContext.html "type parameter in SourceWithContext"),​[Ctx](SourceWithContext.html "type parameter in SourceWithContext")>`
		See Also:
		`akka.stream.scaladsl.Source.withAttributes`
		- #### mapMaterializedValue
		
		
		
		```
		public <Mat2> [SourceWithContext](SourceWithContext.html "class in akka.stream.scaladsl")<[Out](SourceWithContext.html "type parameter in SourceWithContext"),​[Ctx](SourceWithContext.html "type parameter in SourceWithContext"),​Mat2> mapMaterializedValue​(scala.Function1<[Mat](SourceWithContext.html "type parameter in SourceWithContext"),​Mat2> f)
		```
		
		Context\-preserving variant of `akka.stream.scaladsl.Source.mapMaterializedValue`.
		 
		
		See Also:
		`akka.stream.scaladsl.Source.mapMaterializedValue`
		- #### to
		
		
		
		```
		public <Mat2> [RunnableGraph](RunnableGraph.html "class in akka.stream.scaladsl")<[Mat](SourceWithContext.html "type parameter in SourceWithContext")> to​([Graph](../Graph.html "interface in akka.stream")<[SinkShape](../SinkShape.html "class in akka.stream")<scala.Tuple2<[Out](SourceWithContext.html "type parameter in SourceWithContext"),​[Ctx](SourceWithContext.html "type parameter in SourceWithContext")>>,​Mat2> sink)
		```
		
		Connect this [`SourceWithContext`](SourceWithContext.html "class in akka.stream.scaladsl") to a [`Sink`](Sink.html "class in akka.stream.scaladsl"),
		 concatenating the processing steps of both.
		- #### toMat
		
		
		
		```
		public <Mat2,​Mat3> [RunnableGraph](RunnableGraph.html "class in akka.stream.scaladsl")<Mat3> toMat​([Graph](../Graph.html "interface in akka.stream")<[SinkShape](../SinkShape.html "class in akka.stream")<scala.Tuple2<[Out](SourceWithContext.html "type parameter in SourceWithContext"),​[Ctx](SourceWithContext.html "type parameter in SourceWithContext")>>,​Mat2> sink,
		                                                   scala.Function2<[Mat](SourceWithContext.html "type parameter in SourceWithContext"),​Mat2,​Mat3> combine)
		```
		
		Connect this [`SourceWithContext`](SourceWithContext.html "class in akka.stream.scaladsl") to a [`Sink`](Sink.html "class in akka.stream.scaladsl"),
		 concatenating the processing steps of both.
		- #### runWith
		
		
		
		```
		public <Mat2> Mat2 runWith​([Graph](../Graph.html "interface in akka.stream")<[SinkShape](../SinkShape.html "class in akka.stream")<scala.Tuple2<[Out](SourceWithContext.html "type parameter in SourceWithContext"),​[Ctx](SourceWithContext.html "type parameter in SourceWithContext")>>,​Mat2> sink,
		                           [Materializer](../Materializer.html "class in akka.stream") materializer)
		```
		
		Connect this [`SourceWithContext`](SourceWithContext.html "class in akka.stream.scaladsl") to a [`Sink`](Sink.html "class in akka.stream.scaladsl") and run it.
		 The returned value is the materialized value of the `Sink`.
		 
		 Note that the `ActorSystem` can be used as the implicit `materializer` parameter to use the
		 [`SystemMaterializer`](../SystemMaterializer.html "class in akka.stream") for running the stream.
		- #### asSource
		
		
		
		```
		public [Source](Source.html "class in akka.stream.scaladsl")<scala.Tuple2<[Out](SourceWithContext.html "type parameter in SourceWithContext"),​[Ctx](SourceWithContext.html "type parameter in SourceWithContext")>,​[Mat](SourceWithContext.html "type parameter in SourceWithContext")> asSource()
		```
		
		Stops automatic context propagation from here and converts this to a regular
		 stream of a pair of (data, context).
		- #### asJava
		
		
		
		```
		public <JOut,​JCtx,​JMat> [SourceWithContext](../javadsl/SourceWithContext.html "class in akka.stream.javadsl")<JOut,​JCtx,​JMat> asJava()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/stream/Attributes.html
- https://doc.akka.io/japi/akka/current/akka/stream/FlowShape.html
- https://doc.akka.io/japi/akka/current/akka/stream/Graph.GraphMapMatVal.html
- https://doc.akka.io/japi/akka/current/akka/stream/Graph.html
- https://doc.akka.io/japi/akka/current/akka/stream/Materializer.html
- https://doc.akka.io/japi/akka/current/akka/stream/Shape.html
- https://doc.akka.io/japi/akka/current/akka/stream/SinkShape.html
- https://doc.akka.io/japi/akka/current/akka/stream/SourceShape.html
- https://doc.akka.io/japi/akka/current/akka/stream/SystemMaterializer.html
- https://doc.akka.io/japi/akka/current/akka/stream/javadsl/SourceWithContext.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/FlowOps.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/FlowWithContextOps.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/RunnableGraph.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/Sink.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/Source.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/SourceWithContext.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/SourceWithContext.html](https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/SourceWithContext.html)*