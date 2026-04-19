---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:25:42Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/scaladsl/Flow.html
title: Flow
---

# Flow

## Content

Package [akka.stream.scaladsl](package-summary.html)
## Class Flow\<In,​Out,​Mat\>

- java.lang.Object
- - akka.stream.scaladsl.Flow\<In,​Out,​Mat\>

- All Implemented Interfaces:
`[Graph](../Graph.html "interface in akka.stream")<[FlowShape](../FlowShape.html "class in akka.stream")<In,​Out>,​Mat>`, `[FlowOps](FlowOps.html "interface in akka.stream.scaladsl")<Out,​Mat>`, `[FlowOpsMat](FlowOpsMat.html "interface in akka.stream.scaladsl")<Out,​Mat>`

---

```
public final class Flow<In,​Out,​Mat>
extends java.lang.Object
implements [FlowOpsMat](FlowOpsMat.html "interface in akka.stream.scaladsl")<Out,​Mat>, [Graph](../Graph.html "interface in akka.stream")<[FlowShape](../FlowShape.html "class in akka.stream")<In,​Out>,​Mat>
```

A `Flow` is a set of stream processing steps that has one open input and one open output.

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface akka.stream.[Graph](../Graph.html "interface in akka.stream")
		
		
		`[Graph.GraphMapMatVal](../Graph.GraphMapMatVal.html "class in akka.stream")<[S](../Graph.GraphMapMatVal.html "type parameter in Graph.GraphMapMatVal") extends [Shape](../Shape.html "class in akka.stream"),​[M](../Graph.GraphMapMatVal.html "type parameter in Graph.GraphMapMatVal")>`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Flow](#%3Cinit%3E(akka.stream.impl.LinearTraversalBuilder,akka.stream.FlowShape))​(akka.stream.impl.LinearTraversalBuilder traversalBuilder,  [FlowShape](../FlowShape.html "class in akka.stream")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow")> shape)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) [Deprecated Methods](javascript:show(32);) 
	| Modifier and Type | Method | Description |
	| `[Flow](Flow.html "class in akka.stream.scaladsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")>` | `[addAttributes](#addAttributes(akka.stream.Attributes))​([Attributes](../Attributes.html "class in akka.stream") attr)` | Add the given attributes to this [`Flow`](Flow.html "class in akka.stream.scaladsl"). |
	| `static <T> [Flow](Flow.html "class in akka.stream.scaladsl")<T,​T,​[NotUsed](../../NotUsed.html "class in akka")>` | `[apply](#apply())()` | Returns a `Flow` which outputs all its inputs. |
	| `<U,​CtxU,​CtxOut>[FlowWithContext](FlowWithContext.html "class in akka.stream.scaladsl")<U,​CtxU,​[Out](Flow.html "type parameter in Flow"),​CtxOut,​[Mat](Flow.html "type parameter in Flow")>` | `[asFlowWithContext](#asFlowWithContext(scala.Function2,scala.Function1))​(scala.Function2<U,​CtxU,​[In](Flow.html "type parameter in Flow")> collapseContext,  scala.Function1<[Out](Flow.html "type parameter in Flow"),​CtxOut> extractContext)` | Turns a Flow into a FlowWithContext which manages a context per element along a stream. |
	| `<JIn extends [In](Flow.html "type parameter in Flow")>[Flow](../javadsl/Flow.html "class in akka.stream.javadsl")<JIn,​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")>` | `[asJava](#asJava())()` | Converts this Scala DSL element to it's Java DSL counterpart. |
	| `[Flow](Flow.html "class in akka.stream.scaladsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")>` | `[async](#async())()` | Put an asynchronous boundary around this `Flow` |
	| `[Flow](Flow.html "class in akka.stream.scaladsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")>` | `[async](#async(java.lang.String))​(java.lang.String dispatcher)` | Put an asynchronous boundary around this `Flow` |
	| `[Flow](Flow.html "class in akka.stream.scaladsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")>` | `[async](#async(java.lang.String,int))​(java.lang.String dispatcher,  int inputBufferSize)` | Put an asynchronous boundary around this `Flow` |
	| `<In2> [Flow](Flow.html "class in akka.stream.scaladsl")<In2,​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")>` | `[contramap](#contramap(scala.Function1))​(scala.Function1<In2,​[In](Flow.html "type parameter in Flow")> f)` | Transform this Flow by applying a function to each \*incoming\* upstream element before  it is passed to the [`Flow`](Flow.html "class in akka.stream.scaladsl") |
	| `static <A,​B>[Flow](Flow.html "class in akka.stream.scaladsl")<A,​B,​[NotUsed](../../NotUsed.html "class in akka")>` | `[fromFunction](#fromFunction(scala.Function1))​(scala.Function1<A,​B> f)` | Creates a \[Flow] which will use the given function to transform its inputs to outputs. |
	| `static <I,​O,​M>[Flow](Flow.html "class in akka.stream.scaladsl")<I,​O,​M>` | `[fromGraph](#fromGraph(akka.stream.Graph))​([Graph](../Graph.html "interface in akka.stream")<[FlowShape](../FlowShape.html "class in akka.stream")<I,​O>,​M> g)` | A graph with the shape of a flow logically is a flow, this method makes  it so also in type. |
	| `static <T,​U,​M>[Flow](Flow.html "class in akka.stream.scaladsl")<T,​U,​scala.concurrent.Future<M>>` | `[fromMaterializer](#fromMaterializer(scala.Function2))​(scala.Function2<[Materializer](../Materializer.html "class in akka.stream"),​[Attributes](../Attributes.html "class in akka.stream"),​[Flow](Flow.html "class in akka.stream.scaladsl")<T,​U,​M>> factory)` | Defers the creation of a [`Flow`](Flow.html "class in akka.stream.scaladsl") until materialization. |
	| `static <I,​O>[Flow](Flow.html "class in akka.stream.scaladsl")<I,​O,​[NotUsed](../../NotUsed.html "class in akka")>` | `[fromProcessor](#fromProcessor(scala.Function0))​(scala.Function0<org.reactivestreams.Processor<I,​O>> processorFactory)` | Creates a Flow from a Reactive Streams `Processor` |
	| `static <I,​O,​M>[Flow](Flow.html "class in akka.stream.scaladsl")<I,​O,​M>` | `[fromProcessorMat](#fromProcessorMat(scala.Function0))​(scala.Function0<scala.Tuple2<org.reactivestreams.Processor<I,​O>,​M>> processorFactory)` | Creates a Flow from a Reactive Streams `Processor` and returns a materialized value. |
	| `static <I,​O>[Flow](Flow.html "class in akka.stream.scaladsl")<I,​O,​[NotUsed](../../NotUsed.html "class in akka")>` | `[fromSinkAndSource](#fromSinkAndSource(akka.stream.Graph,akka.stream.Graph))​([Graph](../Graph.html "interface in akka.stream")<[SinkShape](../SinkShape.html "class in akka.stream")<I>,​?> sink,  [Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<O>,​?> source)` | Creates a `Flow` from a `Sink` and a `Source` where the Flow's input  will be sent to the Sink and the Flow's output will come from the Source. |
	| `static <I,​O>[Flow](Flow.html "class in akka.stream.scaladsl")<I,​O,​[NotUsed](../../NotUsed.html "class in akka")>` | `[fromSinkAndSourceCoupled](#fromSinkAndSourceCoupled(akka.stream.Graph,akka.stream.Graph))​([Graph](../Graph.html "interface in akka.stream")<[SinkShape](../SinkShape.html "class in akka.stream")<I>,​?> sink,  [Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<O>,​?> source)` | Allows coupling termination (cancellation, completion, erroring) of Sinks and Sources while creating a Flow from them. |
	| `static <I,​O,​M1,​M2,​M>[Flow](Flow.html "class in akka.stream.scaladsl")<I,​O,​M>` | `[fromSinkAndSourceCoupledMat](#fromSinkAndSourceCoupledMat(akka.stream.Graph,akka.stream.Graph,scala.Function2))​([Graph](../Graph.html "interface in akka.stream")<[SinkShape](../SinkShape.html "class in akka.stream")<I>,​M1> sink,  [Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<O>,​M2> source,  scala.Function2<M1,​M2,​M> combine)` | Allows coupling termination (cancellation, completion, erroring) of Sinks and Sources while creating a Flow from them. |
	| `static <I,​O,​M1,​M2,​M>[Flow](Flow.html "class in akka.stream.scaladsl")<I,​O,​M>` | `[fromSinkAndSourceMat](#fromSinkAndSourceMat(akka.stream.Graph,akka.stream.Graph,scala.Function2))​([Graph](../Graph.html "interface in akka.stream")<[SinkShape](../SinkShape.html "class in akka.stream")<I>,​M1> sink,  [Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<O>,​M2> source,  scala.Function2<M1,​M2,​M> combine)` | Creates a `Flow` from a `Sink` and a `Source` where the Flow's input  will be sent to the Sink and the Flow's output will come from the Source. |
	| `static <I,​O,​M>[Flow](Flow.html "class in akka.stream.scaladsl")<I,​O,​scala.concurrent.Future<M>>` | `[futureFlow](#futureFlow(scala.concurrent.Future))​(scala.concurrent.Future<[Flow](Flow.html "class in akka.stream.scaladsl")<I,​O,​M>> flow)` | Turn a `Future[Flow]` into a flow that will consume the values of the source when the future completes successfully. |
	| `<I2,​O1,​Mat2>[Flow](Flow.html "class in akka.stream.scaladsl")<I2,​O1,​[Mat](Flow.html "type parameter in Flow")>` | `[join](#join(akka.stream.Graph))​([Graph](../Graph.html "interface in akka.stream")<[BidiShape](../BidiShape.html "class in akka.stream")<[Out](Flow.html "type parameter in Flow"),​O1,​I2,​[In](Flow.html "type parameter in Flow")>,​Mat2> bidi)` | Join this [`Flow`](Flow.html "class in akka.stream.scaladsl") to a [`BidiFlow`](BidiFlow.html "class in akka.stream.scaladsl") to close off the \&ldquo;top\&rdquo; of the protocol stack: |
	| `<Mat2> [RunnableGraph](RunnableGraph.html "class in akka.stream.scaladsl")<[Mat](Flow.html "type parameter in Flow")>` | `[join](#join(akka.stream.Graph))​([Graph](../Graph.html "interface in akka.stream")<[FlowShape](../FlowShape.html "class in akka.stream")<[Out](Flow.html "type parameter in Flow"),​[In](Flow.html "type parameter in Flow")>,​Mat2> flow)` | Join this [`Flow`](Flow.html "class in akka.stream.scaladsl") to another [`Flow`](Flow.html "class in akka.stream.scaladsl"), by cross connecting the inputs and outputs, creating a [`RunnableGraph`](RunnableGraph.html "class in akka.stream.scaladsl"). |
	| `<I2,​O1,​Mat2,​M>[Flow](Flow.html "class in akka.stream.scaladsl")<I2,​O1,​M>` | `[joinMat](#joinMat(akka.stream.Graph,scala.Function2))​([Graph](../Graph.html "interface in akka.stream")<[BidiShape](../BidiShape.html "class in akka.stream")<[Out](Flow.html "type parameter in Flow"),​O1,​I2,​[In](Flow.html "type parameter in Flow")>,​Mat2> bidi,  scala.Function2<[Mat](Flow.html "type parameter in Flow"),​Mat2,​M> combine)` | Join this [`Flow`](Flow.html "class in akka.stream.scaladsl") to a [`BidiFlow`](BidiFlow.html "class in akka.stream.scaladsl") to close off the \&ldquo;top\&rdquo; of the protocol stack: |
	| `<Mat2,​Mat3>[RunnableGraph](RunnableGraph.html "class in akka.stream.scaladsl")<Mat3>` | `[joinMat](#joinMat(akka.stream.Graph,scala.Function2))​([Graph](../Graph.html "interface in akka.stream")<[FlowShape](../FlowShape.html "class in akka.stream")<[Out](Flow.html "type parameter in Flow"),​[In](Flow.html "type parameter in Flow")>,​Mat2> flow,  scala.Function2<[Mat](Flow.html "type parameter in Flow"),​Mat2,​Mat3> combine)` | Join this [`Flow`](Flow.html "class in akka.stream.scaladsl") to another [`Flow`](Flow.html "class in akka.stream.scaladsl"), by cross connecting the inputs and outputs, creating a [`RunnableGraph`](RunnableGraph.html "class in akka.stream.scaladsl") |
	| `static <I,​O,​M>[Flow](Flow.html "class in akka.stream.scaladsl")<I,​O,​scala.concurrent.Future<M>>` | `[lazyFlow](#lazyFlow(scala.Function0))​(scala.Function0<[Flow](Flow.html "class in akka.stream.scaladsl")<I,​O,​M>> create)` | Defers invoking the `create` function to create a future flow until there is downstream demand and passing  that downstream demand upstream triggers the first element. |
	| `static <I,​O,​M>[Flow](Flow.html "class in akka.stream.scaladsl")<I,​O,​scala.concurrent.Future<M>>` | `[lazyFutureFlow](#lazyFutureFlow(scala.Function0))​(scala.Function0<scala.concurrent.Future<[Flow](Flow.html "class in akka.stream.scaladsl")<I,​O,​M>>> create)` | Defers invoking the `create` function to create a future flow until there downstream demand has caused upstream  to send a first element. |
	| `static <I,​O,​M>[Flow](Flow.html "class in akka.stream.scaladsl")<I,​O,​M>` | `[lazyInit](#lazyInit(scala.Function1,scala.Function0))​(scala.Function1<I,​scala.concurrent.Future<[Flow](Flow.html "class in akka.stream.scaladsl")<I,​O,​M>>> flowFactory,  scala.Function0<M> fallback)` | Deprecated. Use 'Flow.futureFlow' in combination with prefixAndTail(1\) instead, see \`futureFlow\` operator docs for details. |
	| `static <I,​O,​M>[Flow](Flow.html "class in akka.stream.scaladsl")<I,​O,​scala.concurrent.Future<scala.Option<M>>>` | `[lazyInitAsync](#lazyInitAsync(scala.Function0))​(scala.Function0<scala.concurrent.Future<[Flow](Flow.html "class in akka.stream.scaladsl")<I,​O,​M>>> flowFactory)` | Deprecated. Use 'Flow.lazyFutureFlow' instead. |
	| `<Mat2> [Flow](Flow.html "class in akka.stream.scaladsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​Mat2>` | `[mapMaterializedValue](#mapMaterializedValue(scala.Function1))​(scala.Function1<[Mat](Flow.html "type parameter in Flow"),​Mat2> f)` | Transform the materialized value of this Flow, leaving all other properties as they were. |
	| `[Flow](Flow.html "class in akka.stream.scaladsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")>` | `[named](#named(java.lang.String))​(java.lang.String name)` | Add a name attribute to this Flow. |
	| `scala.Tuple2<[Mat](Flow.html "type parameter in Flow"),​[Flow](Flow.html "class in akka.stream.scaladsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[NotUsed](../../NotUsed.html "class in akka")>>` | `[preMaterialize](#preMaterialize(akka.stream.Materializer))​([Materializer](../Materializer.html "class in akka.stream") materializer)` | Materializes this [`Flow`](Flow.html "class in akka.stream.scaladsl"), immediately returning (1\) its materialized value, and (2\) a newly materialized [`Flow`](Flow.html "class in akka.stream.scaladsl"). |
	| `<Mat1,​Mat2>scala.Tuple2<Mat1,​Mat2>` | `[runWith](#runWith(akka.stream.Graph,akka.stream.Graph,akka.stream.Materializer))​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<[In](Flow.html "type parameter in Flow")>,​Mat1> source,  [Graph](../Graph.html "interface in akka.stream")<[SinkShape](../SinkShape.html "class in akka.stream")<[Out](Flow.html "type parameter in Flow")>,​Mat2> sink,  [Materializer](../Materializer.html "class in akka.stream") materializer)` | Connect the `Source` to this `Flow` and then connect it to the `Sink` and run it. |
	| `static <T,​U,​M>[Flow](Flow.html "class in akka.stream.scaladsl")<T,​U,​scala.concurrent.Future<M>>` | `[setup](#setup(scala.Function2))​(scala.Function2<[ActorMaterializer](../ActorMaterializer.html "class in akka.stream"),​[Attributes](../Attributes.html "class in akka.stream"),​[Flow](Flow.html "class in akka.stream.scaladsl")<T,​U,​M>> factory)` | Deprecated. Use 'fromMaterializer' instead. |
	| `[FlowShape](../FlowShape.html "class in akka.stream")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow")>` | `[shape](#shape())()` | The shape of a graph is all that is externally visible: its inlets and outlets. |
	| `<Mat2> [Sink](Sink.html "class in akka.stream.scaladsl")<[In](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")>` | `[to](#to(akka.stream.Graph))​([Graph](../Graph.html "interface in akka.stream")<[SinkShape](../SinkShape.html "class in akka.stream")<[Out](Flow.html "type parameter in Flow")>,​Mat2> sink)` | Connect this [`Flow`](Flow.html "class in akka.stream.scaladsl") to a [`Sink`](Sink.html "class in akka.stream.scaladsl"), concatenating the processing steps of both. |
	| `<Mat2,​Mat3>[Sink](Sink.html "class in akka.stream.scaladsl")<[In](Flow.html "type parameter in Flow"),​Mat3>` | `[toMat](#toMat(akka.stream.Graph,scala.Function2))​([Graph](../Graph.html "interface in akka.stream")<[SinkShape](../SinkShape.html "class in akka.stream")<[Out](Flow.html "type parameter in Flow")>,​Mat2> sink,  scala.Function2<[Mat](Flow.html "type parameter in Flow"),​Mat2,​Mat3> combine)` | Connect this [`Flow`](Flow.html "class in akka.stream.scaladsl") to a [`Sink`](Sink.html "class in akka.stream.scaladsl"), concatenating the processing steps of both. |
	| `[RunnableGraph](RunnableGraph.html "class in akka.stream.scaladsl")<org.reactivestreams.Processor<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow")>>` | `[toProcessor](#toProcessor())()` | Converts this Flow to a [`RunnableGraph`](RunnableGraph.html "class in akka.stream.scaladsl") that materializes to a Reactive Streams `Processor`  which implements the operations encapsulated by this Flow. |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `akka.stream.impl.LinearTraversalBuilder` | `[traversalBuilder](#traversalBuilder())()` | INTERNAL API. |
	| `<T,​Mat2>[Flow](Flow.html "class in akka.stream.scaladsl")<[In](Flow.html "type parameter in Flow"),​T,​[Mat](Flow.html "type parameter in Flow")>` | `[via](#via(akka.stream.Graph))​([Graph](../Graph.html "interface in akka.stream")<[FlowShape](../FlowShape.html "class in akka.stream")<[Out](Flow.html "type parameter in Flow"),​T>,​Mat2> flow)` |  |
	| `<T,​Mat2,​Mat3>[Flow](Flow.html "class in akka.stream.scaladsl")<[In](Flow.html "type parameter in Flow"),​T,​Mat3>` | `[viaMat](#viaMat(akka.stream.Graph,scala.Function2))​([Graph](../Graph.html "interface in akka.stream")<[FlowShape](../FlowShape.html "class in akka.stream")<[Out](Flow.html "type parameter in Flow"),​T>,​Mat2> flow,  scala.Function2<[Mat](Flow.html "type parameter in Flow"),​Mat2,​Mat3> combine)` | Transform this [`Flow`](Flow.html "class in akka.stream.scaladsl") by appending the given processing steps. |
	| `[Flow](Flow.html "class in akka.stream.scaladsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")>` | `[withAttributes](#withAttributes(akka.stream.Attributes))​([Attributes](../Attributes.html "class in akka.stream") attr)` | Replace the attributes of this [`Flow`](Flow.html "class in akka.stream.scaladsl") with the given ones. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface akka.stream.scaladsl.[FlowOps](FlowOps.html "interface in akka.stream.scaladsl")
		
		
		`[$plus$plus](FlowOps.html#$plus$plus(akka.stream.Graph)), [aggregateWithBoundary](FlowOps.html#aggregateWithBoundary(scala.Function0,scala.Function2,scala.Function1,scala.Option)), [alsoTo](FlowOps.html#alsoTo(akka.stream.Graph)), [alsoToAll](FlowOps.html#alsoToAll(scala.collection.immutable.Seq)), [alsoToGraph](FlowOps.html#alsoToGraph(akka.stream.Graph)), [ask](FlowOps.html#ask(int,akka.actor.ActorRef,akka.util.Timeout,scala.reflect.ClassTag)), [ask](FlowOps.html#ask(akka.actor.ActorRef,akka.util.Timeout,scala.reflect.ClassTag)), [backpressureTimeout](FlowOps.html#backpressureTimeout(scala.concurrent.duration.FiniteDuration)), [batch](FlowOps.html#batch(long,scala.Function1,scala.Function2)), [batchWeighted](FlowOps.html#batchWeighted(long,scala.Function1,scala.Function1,scala.Function2)), [buffer](FlowOps.html#buffer(int,akka.stream.OverflowStrategy)), [collect](FlowOps.html#collect(scala.PartialFunction)), [collectType](FlowOps.html#collectType(scala.reflect.ClassTag)), [completionTimeout](FlowOps.html#completionTimeout(scala.concurrent.duration.FiniteDuration)), [concat](FlowOps.html#concat(akka.stream.Graph)), [concatAllLazy](FlowOps.html#concatAllLazy(scala.collection.immutable.Seq)), [concatGraph](FlowOps.html#concatGraph(akka.stream.Graph,boolean)), [concatLazy](FlowOps.html#concatLazy(akka.stream.Graph)), [conflate](FlowOps.html#conflate(scala.Function2)), [conflateWithSeed](FlowOps.html#conflateWithSeed(scala.Function1,scala.Function2)), [delay](FlowOps.html#delay(scala.concurrent.duration.FiniteDuration,akka.stream.DelayOverflowStrategy)), [delay$default$2](FlowOps.html#delay$default$2()), [delayWith](FlowOps.html#delayWith(scala.Function0,akka.stream.DelayOverflowStrategy)), [detach](FlowOps.html#detach()), [divertTo](FlowOps.html#divertTo(akka.stream.Graph,scala.Function1)), [divertToGraph](FlowOps.html#divertToGraph(akka.stream.Graph,scala.Function1)), [drop](FlowOps.html#drop(long)), [dropWhile](FlowOps.html#dropWhile(scala.Function1)), [dropWithin](FlowOps.html#dropWithin(scala.concurrent.duration.FiniteDuration)), [expand](FlowOps.html#expand(scala.Function1)), [extrapolate](FlowOps.html#extrapolate(scala.Function1,scala.Option)), [extrapolate$default$2](FlowOps.html#extrapolate$default$2()), [filter](FlowOps.html#filter(scala.Function1)), [filterNot](FlowOps.html#filterNot(scala.Function1)), [flatMapConcat](FlowOps.html#flatMapConcat(scala.Function1)), [flatMapMerge](FlowOps.html#flatMapMerge(int,scala.Function1)), [flatMapPrefix](FlowOps.html#flatMapPrefix(int,scala.Function1)), [fold](FlowOps.html#fold(T,scala.Function2)), [foldAsync](FlowOps.html#foldAsync(T,scala.Function2)), [groupBy](FlowOps.html#groupBy(int,scala.Function1)), [groupBy](FlowOps.html#groupBy(int,scala.Function1,boolean)), [grouped](FlowOps.html#grouped(int)), [groupedWeighted](FlowOps.html#groupedWeighted(long,scala.Function1)), [groupedWeightedWithin](FlowOps.html#groupedWeightedWithin(long,int,scala.concurrent.duration.FiniteDuration,scala.Function1)), [groupedWeightedWithin](FlowOps.html#groupedWeightedWithin(long,scala.concurrent.duration.FiniteDuration,scala.Function1)), [groupedWithin](FlowOps.html#groupedWithin(int,scala.concurrent.duration.FiniteDuration)), [idleTimeout](FlowOps.html#idleTimeout(scala.concurrent.duration.FiniteDuration)), [initialDelay](FlowOps.html#initialDelay(scala.concurrent.duration.FiniteDuration)), [initialTimeout](FlowOps.html#initialTimeout(scala.concurrent.duration.FiniteDuration)), [interleave](FlowOps.html#interleave(akka.stream.Graph,int)), [interleave](FlowOps.html#interleave(akka.stream.Graph,int,boolean)), [interleaveAll](FlowOps.html#interleaveAll(scala.collection.immutable.Seq,int,boolean)), [interleaveGraph](FlowOps.html#interleaveGraph(akka.stream.Graph,int,boolean)), [interleaveGraph$default$3](FlowOps.html#interleaveGraph$default$3()), [internalConcat](FlowOps.html#internalConcat(akka.stream.Graph,boolean)), [internalConcatAll](FlowOps.html#internalConcatAll(akka.stream.Graph%5B%5D,boolean)), [intersperse](FlowOps.html#intersperse(T)), [intersperse](FlowOps.html#intersperse(T,T,T)), [keepAlive](FlowOps.html#keepAlive(scala.concurrent.duration.FiniteDuration,scala.Function0)), [limit](FlowOps.html#limit(long)), [limitWeighted](FlowOps.html#limitWeighted(long,scala.Function1)), [log](FlowOps.html#log(java.lang.String,scala.Function1,akka.event.LoggingAdapter)), [log$default$2](FlowOps.html#log$default$2()), [log$default$3](FlowOps.html#log$default$3(java.lang.String,scala.Function1)), [logWithMarker](FlowOps.html#logWithMarker(java.lang.String,scala.Function1,scala.Function1,akka.event.MarkerLoggingAdapter)), [logWithMarker$default$3](FlowOps.html#logWithMarker$default$3()), [logWithMarker$default$4](FlowOps.html#logWithMarker$default$4(java.lang.String,scala.Function1,scala.Function1)), [map](FlowOps.html#map(scala.Function1)), [mapAsync](FlowOps.html#mapAsync(int,scala.Function1)), [mapAsyncPartitioned](FlowOps.html#mapAsyncPartitioned(int,int,scala.Function1,scala.Function2)), [mapAsyncUnordered](FlowOps.html#mapAsyncUnordered(int,scala.Function1)), [mapConcat](FlowOps.html#mapConcat(scala.Function1)), [mapError](FlowOps.html#mapError(scala.PartialFunction)), [mapWithResource](FlowOps.html#mapWithResource(scala.Function0,scala.Function2,scala.Function1)), [merge](FlowOps.html#merge(akka.stream.Graph,boolean)), [merge$default$2](FlowOps.html#merge$default$2()), [mergeAll](FlowOps.html#mergeAll(scala.collection.immutable.Seq,boolean)), [mergeGraph](FlowOps.html#mergeGraph(akka.stream.Graph,boolean)), [mergeLatest](FlowOps.html#mergeLatest(akka.stream.Graph,boolean)), [mergeLatest$default$2](FlowOps.html#mergeLatest$default$2()), [mergeLatestGraph](FlowOps.html#mergeLatestGraph(akka.stream.Graph,boolean)), [mergePreferred](FlowOps.html#mergePreferred(akka.stream.Graph,boolean,boolean)), [mergePreferred$default$3](FlowOps.html#mergePreferred$default$3()), [mergePreferredGraph](FlowOps.html#mergePreferredGraph(akka.stream.Graph,boolean,boolean)), [mergePrioritized](FlowOps.html#mergePrioritized(akka.stream.Graph,int,int,boolean)), [mergePrioritized$default$4](FlowOps.html#mergePrioritized$default$4()), [mergePrioritizedGraph](FlowOps.html#mergePrioritizedGraph(akka.stream.Graph,int,int,boolean)), [mergeSorted](FlowOps.html#mergeSorted(akka.stream.Graph,scala.math.Ordering)), [mergeSortedGraph](FlowOps.html#mergeSortedGraph(akka.stream.Graph,scala.math.Ordering)), [onErrorComplete](FlowOps.html#onErrorComplete(scala.PartialFunction)), [onErrorComplete](FlowOps.html#onErrorComplete(scala.reflect.ClassTag)), [orElse](FlowOps.html#orElse(akka.stream.Graph)), [orElseGraph](FlowOps.html#orElseGraph(akka.stream.Graph)), [prefixAndTail](FlowOps.html#prefixAndTail(int)), [prepend](FlowOps.html#prepend(akka.stream.Graph)), [prependGraph](FlowOps.html#prependGraph(akka.stream.Graph,boolean)), [prependLazy](FlowOps.html#prependLazy(akka.stream.Graph)), [recover](FlowOps.html#recover(scala.PartialFunction)), [recoverWith](FlowOps.html#recoverWith(scala.PartialFunction)), [recoverWithRetries](FlowOps.html#recoverWithRetries(int,scala.PartialFunction)), [reduce](FlowOps.html#reduce(scala.Function2)), [scan](FlowOps.html#scan(T,scala.Function2)), [scanAsync](FlowOps.html#scanAsync(T,scala.Function2)), [sliding](FlowOps.html#sliding(int,int)), [sliding$default$2](FlowOps.html#sliding$default$2()), [splitAfter](FlowOps.html#splitAfter(akka.stream.SubstreamCancelStrategy,scala.Function1)), [splitAfter](FlowOps.html#splitAfter(scala.Function1)), [splitWhen](FlowOps.html#splitWhen(akka.stream.SubstreamCancelStrategy,scala.Function1)), [splitWhen](FlowOps.html#splitWhen(scala.Function1)), [statefulMap](FlowOps.html#statefulMap(scala.Function0,scala.Function2,scala.Function1)), [statefulMapConcat](FlowOps.html#statefulMapConcat(scala.Function0)), [take](FlowOps.html#take(long)), [takeWhile](FlowOps.html#takeWhile(scala.Function1)), [takeWhile](FlowOps.html#takeWhile(scala.Function1,boolean)), [takeWithin](FlowOps.html#takeWithin(scala.concurrent.duration.FiniteDuration)), [throttle](FlowOps.html#throttle(int,scala.concurrent.duration.FiniteDuration)), [throttle](FlowOps.html#throttle(int,scala.concurrent.duration.FiniteDuration,int,akka.stream.ThrottleMode)), [throttle](FlowOps.html#throttle(int,scala.concurrent.duration.FiniteDuration,int,scala.Function1,akka.stream.ThrottleMode)), [throttle](FlowOps.html#throttle(int,scala.concurrent.duration.FiniteDuration,scala.Function1)), [throttle](FlowOps.html#throttle(akka.stream.scaladsl.ThrottleControl)), [throttle](FlowOps.html#throttle(akka.stream.scaladsl.ThrottleControl,scala.Function1)), [watch](FlowOps.html#watch(akka.actor.ActorRef)), [wireTap](FlowOps.html#wireTap(akka.stream.Graph)), [wireTap](FlowOps.html#wireTap(scala.Function1)), [wireTapGraph](FlowOps.html#wireTapGraph(akka.stream.Graph)), [zip](FlowOps.html#zip(akka.stream.Graph)), [zipAll](FlowOps.html#zipAll(akka.stream.Graph,A,U)), [zipAllFlow](FlowOps.html#zipAllFlow(akka.stream.Graph,A,U)), [zipGraph](FlowOps.html#zipGraph(akka.stream.Graph)), [zipLatest](FlowOps.html#zipLatest(akka.stream.Graph)), [zipLatestGraph](FlowOps.html#zipLatestGraph(akka.stream.Graph)), [zipLatestWith](FlowOps.html#zipLatestWith(akka.stream.Graph,boolean,scala.Function2)), [zipLatestWith](FlowOps.html#zipLatestWith(akka.stream.Graph,scala.Function2)), [zipLatestWithGraph](FlowOps.html#zipLatestWithGraph(akka.stream.Graph,boolean,scala.Function2)), [zipLatestWithGraph](FlowOps.html#zipLatestWithGraph(akka.stream.Graph,scala.Function2)), [zipWith](FlowOps.html#zipWith(akka.stream.Graph,scala.Function2)), [zipWithGraph](FlowOps.html#zipWithGraph(akka.stream.Graph,scala.Function2)), [zipWithIndex](FlowOps.html#zipWithIndex())`
		- ### Methods inherited from interface akka.stream.scaladsl.[FlowOpsMat](FlowOpsMat.html "interface in akka.stream.scaladsl")
		
		
		`[alsoToMat](FlowOpsMat.html#alsoToMat(akka.stream.Graph,scala.Function2)), [concatLazyMat](FlowOpsMat.html#concatLazyMat(akka.stream.Graph,scala.Function2)), [concatMat](FlowOpsMat.html#concatMat(akka.stream.Graph,scala.Function2)), [divertToMat](FlowOpsMat.html#divertToMat(akka.stream.Graph,scala.Function1,scala.Function2)), [flatMapPrefixMat](FlowOpsMat.html#flatMapPrefixMat(int,scala.Function1,scala.Function2)), [interleaveMat](FlowOpsMat.html#interleaveMat(akka.stream.Graph,int,boolean,scala.Function2)), [interleaveMat](FlowOpsMat.html#interleaveMat(akka.stream.Graph,int,scala.Function2)), [mergeLatestMat](FlowOpsMat.html#mergeLatestMat(akka.stream.Graph,boolean,scala.Function2)), [mergeMat](FlowOpsMat.html#mergeMat(akka.stream.Graph,boolean,scala.Function2)), [mergeMat$default$2](FlowOpsMat.html#mergeMat$default$2()), [mergePreferredMat](FlowOpsMat.html#mergePreferredMat(akka.stream.Graph,boolean,boolean,scala.Function2)), [mergePrioritizedMat](FlowOpsMat.html#mergePrioritizedMat(akka.stream.Graph,int,int,boolean,scala.Function2)), [mergeSortedMat](FlowOpsMat.html#mergeSortedMat(akka.stream.Graph,scala.Function2,scala.math.Ordering)), [monitor](FlowOpsMat.html#monitor()), [monitorMat](FlowOpsMat.html#monitorMat(scala.Function2)), [orElseMat](FlowOpsMat.html#orElseMat(akka.stream.Graph,scala.Function2)), [prependLazyMat](FlowOpsMat.html#prependLazyMat(akka.stream.Graph,scala.Function2)), [prependMat](FlowOpsMat.html#prependMat(akka.stream.Graph,scala.Function2)), [watchTermination](FlowOpsMat.html#watchTermination(scala.Function2)), [wireTapMat](FlowOpsMat.html#wireTapMat(akka.stream.Graph,scala.Function2)), [zipAllMat](FlowOpsMat.html#zipAllMat(akka.stream.Graph,A,U,scala.Function2)), [zipLatestMat](FlowOpsMat.html#zipLatestMat(akka.stream.Graph,scala.Function2)), [zipLatestWithMat](FlowOpsMat.html#zipLatestWithMat(akka.stream.Graph,boolean,scala.Function2,scala.Function2)), [zipLatestWithMat](FlowOpsMat.html#zipLatestWithMat(akka.stream.Graph,scala.Function2,scala.Function2)), [zipMat](FlowOpsMat.html#zipMat(akka.stream.Graph,scala.Function2)), [zipWithMat](FlowOpsMat.html#zipWithMat(akka.stream.Graph,scala.Function2,scala.Function2))`
		- ### Methods inherited from interface akka.stream.[Graph](../Graph.html "interface in akka.stream")
		
		
		`[getAttributes](../Graph.html#getAttributes())`

- - ### Constructor Detail
	
	
	
		- #### Flow
		
		
		
		```
		public Flow​(akka.stream.impl.LinearTraversalBuilder traversalBuilder,
		            [FlowShape](../FlowShape.html "class in akka.stream")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow")> shape)
		```

	- ### Method Detail
	
	
	
		- #### fromProcessor
		
		
		
		```
		public static <I,​O> [Flow](Flow.html "class in akka.stream.scaladsl")<I,​O,​[NotUsed](../../NotUsed.html "class in akka")> fromProcessor​(scala.Function0<org.reactivestreams.Processor<I,​O>> processorFactory)
		```
		
		Creates a Flow from a Reactive Streams `Processor`
		- #### fromProcessorMat
		
		
		
		```
		public static <I,​O,​M> [Flow](Flow.html "class in akka.stream.scaladsl")<I,​O,​M> fromProcessorMat​(scala.Function0<scala.Tuple2<org.reactivestreams.Processor<I,​O>,​M>> processorFactory)
		```
		
		Creates a Flow from a Reactive Streams `Processor` and returns a materialized value.
		- #### apply
		
		
		
		```
		public static <T> [Flow](Flow.html "class in akka.stream.scaladsl")<T,​T,​[NotUsed](../../NotUsed.html "class in akka")> apply()
		```
		
		Returns a `Flow` which outputs all its inputs.
		- #### fromFunction
		
		
		
		```
		public static <A,​B> [Flow](Flow.html "class in akka.stream.scaladsl")<A,​B,​[NotUsed](../../NotUsed.html "class in akka")> fromFunction​(scala.Function1<A,​B> f)
		```
		
		Creates a \[Flow] which will use the given function to transform its inputs to outputs. It is equivalent
		 to `Flow[T].map(f)`
		- #### fromGraph
		
		
		
		```
		public static <I,​O,​M> [Flow](Flow.html "class in akka.stream.scaladsl")<I,​O,​M> fromGraph​([Graph](../Graph.html "interface in akka.stream")<[FlowShape](../FlowShape.html "class in akka.stream")<I,​O>,​M> g)
		```
		
		A graph with the shape of a flow logically is a flow, this method makes
		 it so also in type.
		- #### fromMaterializer
		
		
		
		```
		public static <T,​U,​M> [Flow](Flow.html "class in akka.stream.scaladsl")<T,​U,​scala.concurrent.Future<M>> fromMaterializer​(scala.Function2<[Materializer](../Materializer.html "class in akka.stream"),​[Attributes](../Attributes.html "class in akka.stream"),​[Flow](Flow.html "class in akka.stream.scaladsl")<T,​U,​M>> factory)
		```
		
		Defers the creation of a [`Flow`](Flow.html "class in akka.stream.scaladsl") until materialization. The `factory` function
		 exposes `Materializer` which is going to be used during materialization and
		 `Attributes` of the [`Flow`](Flow.html "class in akka.stream.scaladsl") returned by this method.
		- #### setup
		
		
		
		```
		public static <T,​U,​M> [Flow](Flow.html "class in akka.stream.scaladsl")<T,​U,​scala.concurrent.Future<M>> setup​(scala.Function2<[ActorMaterializer](../ActorMaterializer.html "class in akka.stream"),​[Attributes](../Attributes.html "class in akka.stream"),​[Flow](Flow.html "class in akka.stream.scaladsl")<T,​U,​M>> factory)
		```
		
		Deprecated.
		Use 'fromMaterializer' instead. Since 2\.6\.0\.
		
		Defers the creation of a [`Flow`](Flow.html "class in akka.stream.scaladsl") until materialization. The `factory` function
		 exposes `ActorMaterializer` which is going to be used during materialization and
		 `Attributes` of the [`Flow`](Flow.html "class in akka.stream.scaladsl") returned by this method.
		- #### fromSinkAndSource
		
		
		
		```
		public static <I,​O> [Flow](Flow.html "class in akka.stream.scaladsl")<I,​O,​[NotUsed](../../NotUsed.html "class in akka")> fromSinkAndSource​([Graph](../Graph.html "interface in akka.stream")<[SinkShape](../SinkShape.html "class in akka.stream")<I>,​?> sink,
		                                                                          [Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<O>,​?> source)
		```
		
		Creates a `Flow` from a `Sink` and a `Source` where the Flow's input
		 will be sent to the Sink and the Flow's output will come from the Source.
		 
		 The resulting flow can be visualized as:
		 
		
		
		```
		
		     +----------------------------------------------+
		     | Resulting Flow[I, O, NotUsed]                |
		     |                                              |
		     |  +---------+                  +-----------+  |
		     |  |         |                  |           |  |
		 I  ~~> | Sink[I] | [no-connection!] | Source[O] | ~~> O
		     |  |         |                  |           |  |
		     |  +---------+                  +-----------+  |
		     +----------------------------------------------+
		 
		```
		
		
		 The completion of the Sink and Source sides of a Flow constructed using
		 this method are independent. So if the Sink receives a completion signal,
		 the Source side will remain unaware of that. If you are looking to couple
		 the termination signals of the two sides use `Flow.fromSinkAndSourceCoupled` instead.
		 
		
		
		 See also [`<I,O,M1,M2,M>fromSinkAndSourceMat(akka.stream.Graph<akka.stream.SinkShape<I>,M1>,akka.stream.Graph<akka.stream.SourceShape<O>,M2>,scala.Function2<M1,M2,M>)`](#fromSinkAndSourceMat(akka.stream.Graph,akka.stream.Graph,scala.Function2)) when access to materialized values of the parameters is needed.
		- #### fromSinkAndSourceMat
		
		
		
		```
		public static <I,​O,​M1,​M2,​M> [Flow](Flow.html "class in akka.stream.scaladsl")<I,​O,​M> fromSinkAndSourceMat​([Graph](../Graph.html "interface in akka.stream")<[SinkShape](../SinkShape.html "class in akka.stream")<I>,​M1> sink,
		                                                                                                 [Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<O>,​M2> source,
		                                                                                                 scala.Function2<M1,​M2,​M> combine)
		```
		
		Creates a `Flow` from a `Sink` and a `Source` where the Flow's input
		 will be sent to the Sink and the Flow's output will come from the Source.
		 
		 The resulting flow can be visualized as:
		 
		
		
		```
		
		     +-------------------------------------------------------+
		     | Resulting Flow[I, O, M]                              |
		     |                                                      |
		     |  +-------------+                  +---------------+  |
		     |  |             |                  |               |  |
		 I  ~~> | Sink[I, M1] | [no-connection!] | Source[O, M2] | ~~> O
		     |  |             |                  |               |  |
		     |  +-------------+                  +---------------+  |
		     +------------------------------------------------------+
		 
		```
		
		
		 The completion of the Sink and Source sides of a Flow constructed using
		 this method are independent. So if the Sink receives a completion signal,
		 the Source side will remain unaware of that. If you are looking to couple
		 the termination signals of the two sides use `Flow.fromSinkAndSourceCoupledMat` instead.
		 
		
		
		 The `combine` function is used to compose the materialized values of the `sink` and `source`
		 into the materialized value of the resulting [`Flow`](Flow.html "class in akka.stream.scaladsl").
		- #### fromSinkAndSourceCoupled
		
		
		
		```
		public static <I,​O> [Flow](Flow.html "class in akka.stream.scaladsl")<I,​O,​[NotUsed](../../NotUsed.html "class in akka")> fromSinkAndSourceCoupled​([Graph](../Graph.html "interface in akka.stream")<[SinkShape](../SinkShape.html "class in akka.stream")<I>,​?> sink,
		                                                                                 [Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<O>,​?> source)
		```
		
		Allows coupling termination (cancellation, completion, erroring) of Sinks and Sources while creating a Flow from them.
		 Similar to `Flow.fromSinkAndSource` however couples the termination of these two operators.
		 
		 The resulting flow can be visualized as:
		 
		
		
		```
		
		     +---------------------------------------------+
		     | Resulting Flow[I, O, NotUsed]               |
		     |                                             |
		     |  +---------+                 +-----------+  |
		     |  |         |                 |           |  |
		 I  ~~> | Sink[I] | ~~~(coupled)~~~ | Source[O] | ~~> O
		     |  |         |                 |           |  |
		     |  +---------+                 +-----------+  |
		     +---------------------------------------------+
		 
		```
		
		
		 E.g. if the emitted [`Flow`](Flow.html "class in akka.stream.scaladsl") gets a cancellation, the [`Source`](Source.html "class in akka.stream.scaladsl") of course is cancelled,
		 however the Sink will also be completed. The table below illustrates the effects in detail:
		 
		
		
		
		
		
		
		| Returned Flow | Sink (`in`) | Source (`out`) |
		| --- | --- | --- |
		| *cause:* upstream (sink\-side) receives completion | *effect:* receives completion | *effect:* receives cancel |
		| *cause:* upstream (sink\-side) receives error | *effect:* receives error | *effect:* receives cancel |
		| *cause:* downstream (source\-side) receives cancel | *effect:* completes | *effect:* receives cancel |
		| *effect:* cancels upstream, completes downstream | *effect:* completes | *cause:* signals complete |
		| *effect:* cancels upstream, errors downstream | *effect:* receives error | *cause:* signals error or throws |
		| *effect:* cancels upstream, completes downstream | *cause:* cancels | *effect:* receives cancel |
		
		
		
		 See also [`<I,O,M1,M2,M>fromSinkAndSourceCoupledMat(akka.stream.Graph<akka.stream.SinkShape<I>,M1>,akka.stream.Graph<akka.stream.SourceShape<O>,M2>,scala.Function2<M1,M2,M>)`](#fromSinkAndSourceCoupledMat(akka.stream.Graph,akka.stream.Graph,scala.Function2)) when access to materialized values of the parameters is needed.
		- #### fromSinkAndSourceCoupledMat
		
		
		
		```
		public static <I,​O,​M1,​M2,​M> [Flow](Flow.html "class in akka.stream.scaladsl")<I,​O,​M> fromSinkAndSourceCoupledMat​([Graph](../Graph.html "interface in akka.stream")<[SinkShape](../SinkShape.html "class in akka.stream")<I>,​M1> sink,
		                                                                                                        [Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<O>,​M2> source,
		                                                                                                        scala.Function2<M1,​M2,​M> combine)
		```
		
		Allows coupling termination (cancellation, completion, erroring) of Sinks and Sources while creating a Flow from them.
		 Similar to `Flow.fromSinkAndSource` however couples the termination of these two operators.
		 
		 The resulting flow can be visualized as:
		 
		
		
		```
		
		     +-----------------------------------------------------+
		     | Resulting Flow[I, O, M]                             |
		     |                                                     |
		     |  +-------------+                 +---------------+  |
		     |  |             |                 |               |  |
		 I  ~~> | Sink[I, M1] | ~~~(coupled)~~~ | Source[O, M2] | ~~> O
		     |  |             |                 |               |  |
		     |  +-------------+                 +---------------+  |
		     +-----------------------------------------------------+
		 
		```
		
		
		 E.g. if the emitted [`Flow`](Flow.html "class in akka.stream.scaladsl") gets a cancellation, the [`Source`](Source.html "class in akka.stream.scaladsl") of course is cancelled,
		 however the Sink will also be completed. The table on `Flow.fromSinkAndSourceCoupled`
		 illustrates the effects in detail.
		 
		
		
		 The `combine` function is used to compose the materialized values of the `sink` and `source`
		 into the materialized value of the resulting [`Flow`](Flow.html "class in akka.stream.scaladsl").
		- #### lazyInit
		
		
		
		```
		public static <I,​O,​M> [Flow](Flow.html "class in akka.stream.scaladsl")<I,​O,​M> lazyInit​(scala.Function1<I,​scala.concurrent.Future<[Flow](Flow.html "class in akka.stream.scaladsl")<I,​O,​M>>> flowFactory,
		                                                                   scala.Function0<M> fallback)
		```
		
		Deprecated.
		Use 'Flow.futureFlow' in combination with prefixAndTail(1\) instead, see \`futureFlow\` operator docs for details. Since 2\.6\.0\.
		
		Creates a real `Flow` upon receiving the first element. Internal `Flow` will not be created
		 if there are no elements, because of completion, cancellation, or error.
		 
		 The materialized value of the `Flow` is the value that is created by the `fallback` function.
		 
		
		
		 '''Emits when''' the internal flow is successfully created and it emits
		 
		
		
		 '''Backpressures when''' the internal flow is successfully created and it backpressures
		 
		
		
		 '''Completes when''' upstream completes and all elements have been emitted from the internal flow
		 
		
		
		 '''Cancels when''' downstream cancels (see below)
		 
		
		
		 The operator's default behaviour in case of downstream cancellation before nested flow materialization (future completion) is to cancel immediately.
		 This behaviour can be controlled by setting the `akka.stream.Attributes.NestedMaterializationCancellationPolicy.PropagateToNested` attribute,
		 this will delay downstream cancellation until nested flow's materialization which is then immediately cancelled (with the original cancellation cause).
		- #### lazyInitAsync
		
		
		
		```
		public static <I,​O,​M> [Flow](Flow.html "class in akka.stream.scaladsl")<I,​O,​scala.concurrent.Future<scala.Option<M>>> lazyInitAsync​(scala.Function0<scala.concurrent.Future<[Flow](Flow.html "class in akka.stream.scaladsl")<I,​O,​M>>> flowFactory)
		```
		
		Deprecated.
		Use 'Flow.lazyFutureFlow' instead. Since 2\.6\.0\.
		
		Creates a real `Flow` upon receiving the first element. Internal `Flow` will not be created
		 if there are no elements, because of completion, cancellation, or error.
		 
		 The materialized value of the `Flow` is a `Future[Option[M}` that is completed with `Some(mat)` when the internal
		 flow gets materialized or with `None` when there where no elements. If the flow materialization (including
		 the call of the `flowFactory`) fails then the future is completed with a failure.
		 
		
		
		 '''Emits when''' the internal flow is successfully created and it emits
		 
		
		
		 '''Backpressures when''' the internal flow is successfully created and it backpressures
		 
		
		
		 '''Completes when''' upstream completes and all elements have been emitted from the internal flow
		 
		
		
		 '''Cancels when''' downstream cancels (see below)
		 
		
		
		 The operator's default behaviour in case of downstream cancellation before nested flow materialization (future completion) is to cancel immediately.
		 This behaviour can be controlled by setting the `akka.stream.Attributes.NestedMaterializationCancellationPolicy.PropagateToNested` attribute,
		 this will delay downstream cancellation until nested flow's materialization which is then immediately cancelled (with the original cancellation cause).
		- #### futureFlow
		
		
		
		```
		public static <I,​O,​M> [Flow](Flow.html "class in akka.stream.scaladsl")<I,​O,​scala.concurrent.Future<M>> futureFlow​(scala.concurrent.Future<[Flow](Flow.html "class in akka.stream.scaladsl")<I,​O,​M>> flow)
		```
		
		Turn a `Future[Flow]` into a flow that will consume the values of the source when the future completes successfully.
		 If the `Future` is completed with a failure the stream is failed.
		 
		 The materialized future value is completed with the materialized value of the future flow or failed with a
		 `NeverMaterializedException` if upstream fails or downstream cancels before the future has completed.
		 
		
		
		 The operator's default behaviour in case of downstream cancellation before nested flow materialization (future completion) is to cancel immediately.
		 This behaviour can be controlled by setting the `akka.stream.Attributes.NestedMaterializationCancellationPolicy.PropagateToNested` attribute,
		 this will delay downstream cancellation until nested flow's materialization which is then immediately cancelled (with the original cancellation cause).
		- #### lazyFlow
		
		
		
		```
		public static <I,​O,​M> [Flow](Flow.html "class in akka.stream.scaladsl")<I,​O,​scala.concurrent.Future<M>> lazyFlow​(scala.Function0<[Flow](Flow.html "class in akka.stream.scaladsl")<I,​O,​M>> create)
		```
		
		Defers invoking the `create` function to create a future flow until there is downstream demand and passing
		 that downstream demand upstream triggers the first element.
		 
		 The materialized future value is completed with the materialized value of the created flow when that has successfully
		 been materialized.
		 
		
		
		 If the `create` function throws or returns a future that fails the stream is failed, in this case the materialized
		 future value is failed with a `NeverMaterializedException`.
		 
		
		
		 Note that asynchronous boundaries (and other operators) in the stream may do pre\-fetching which counter acts
		 the laziness and can trigger the factory earlier than expected.
		 
		
		
		 '''Emits when''' the internal flow is successfully created and it emits
		 
		
		
		 '''Backpressures when''' the internal flow is successfully created and it backpressures or downstream backpressures
		 
		
		
		 '''Completes when''' upstream completes and all elements have been emitted from the internal flow
		 
		
		
		 '''Cancels when''' downstream cancels (see below)
		 
		
		
		 The operator's default behaviour in case of downstream cancellation before nested flow materialization (future completion) is to cancel immediately.
		 This behaviour can be controlled by setting the `akka.stream.Attributes.NestedMaterializationCancellationPolicy.PropagateToNested` attribute,
		 this will delay downstream cancellation until nested flow's materialization which is then immediately cancelled (with the original cancellation cause).
		- #### lazyFutureFlow
		
		
		
		```
		public static <I,​O,​M> [Flow](Flow.html "class in akka.stream.scaladsl")<I,​O,​scala.concurrent.Future<M>> lazyFutureFlow​(scala.Function0<scala.concurrent.Future<[Flow](Flow.html "class in akka.stream.scaladsl")<I,​O,​M>>> create)
		```
		
		Defers invoking the `create` function to create a future flow until there downstream demand has caused upstream
		 to send a first element.
		 
		 The materialized future value is completed with the materialized value of the created flow when that has successfully
		 been materialized.
		 
		
		
		 If the `create` function throws or returns a future that fails the stream is failed, in this case the materialized
		 future value is failed with a `NeverMaterializedException`.
		 
		
		
		 Note that asynchronous boundaries (and other operators) in the stream may do pre\-fetching which counter acts
		 the laziness and can trigger the factory earlier than expected.
		 
		
		
		 '''Emits when''' the internal flow is successfully created and it emits
		 
		
		
		 '''Backpressures when''' the internal flow is successfully created and it backpressures or downstream backpressures
		 
		
		
		 '''Completes when''' upstream completes and all elements have been emitted from the internal flow
		 
		
		
		 '''Cancels when''' downstream cancels (see below)
		 
		
		
		 The operator's default behaviour in case of downstream cancellation before nested flow materialization (future completion) is to cancel immediately.
		 This behaviour can be controlled by setting the `akka.stream.Attributes.NestedMaterializationCancellationPolicy.PropagateToNested` attribute,
		 this will delay downstream cancellation until nested flow's materialization which is then immediately cancelled (with the original cancellation cause).
		- #### traversalBuilder
		
		
		
		```
		public akka.stream.impl.LinearTraversalBuilder traversalBuilder()
		```
		
		Description copied from interface: `[Graph](../Graph.html#traversalBuilder())`
		INTERNAL API.
		 
		 Every materializable element must be backed by a stream layout module
		
		
		
		Specified by:
		`[traversalBuilder](../Graph.html#traversalBuilder())` in interface `[Graph](../Graph.html "interface in akka.stream")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow")>`
		- #### shape
		
		
		
		```
		public [FlowShape](../FlowShape.html "class in akka.stream")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow")> shape()
		```
		
		Description copied from interface: `[Graph](../Graph.html#shape())`
		The shape of a graph is all that is externally visible: its inlets and outlets.
		
		Specified by:
		`[shape](../Graph.html#shape())` in interface `[Graph](../Graph.html "interface in akka.stream")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow")>`
		- #### toString
		
		
		
		```
		public java.lang.String toString()
		```
		
		
		Overrides:
		`toString` in class `java.lang.Object`
		- #### via
		
		
		
		```
		public <T,​Mat2> [Flow](Flow.html "class in akka.stream.scaladsl")<[In](Flow.html "type parameter in Flow"),​T,​[Mat](Flow.html "type parameter in Flow")> via​([Graph](../Graph.html "interface in akka.stream")<[FlowShape](../FlowShape.html "class in akka.stream")<[Out](Flow.html "type parameter in Flow"),​T>,​Mat2> flow)
		```
		
		
		Specified by:
		`[via](FlowOps.html#via(akka.stream.Graph))` in interface `[FlowOps](FlowOps.html "interface in akka.stream.scaladsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow")>`
		- #### viaMat
		
		
		
		```
		public <T,​Mat2,​Mat3> [Flow](Flow.html "class in akka.stream.scaladsl")<[In](Flow.html "type parameter in Flow"),​T,​Mat3> viaMat​([Graph](../Graph.html "interface in akka.stream")<[FlowShape](../FlowShape.html "class in akka.stream")<[Out](Flow.html "type parameter in Flow"),​T>,​Mat2> flow,
		                                                                    scala.Function2<[Mat](Flow.html "type parameter in Flow"),​Mat2,​Mat3> combine)
		```
		
		Description copied from interface: `[FlowOpsMat](FlowOpsMat.html#viaMat(akka.stream.Graph,scala.Function2))`
		Transform this [`Flow`](Flow.html "class in akka.stream.scaladsl") by appending the given processing steps.
		 
		```
		
		     +---------------------------------+
		     | Resulting Flow[In, T, M2]       |
		     |                                 |
		     |  +------+            +------+   |
		     |  |      |            |      |   |
		 In ~~> | this |  ~~Out~~>  | flow |  ~~> T
		     |  |   Mat|            |     M|   |
		     |  +------+            +------+   |
		     +---------------------------------+
		 
		```
		
		 The `combine` function is used to compose the materialized values of this flow and that
		 flow into the materialized value of the resulting Flow.
		 
		 It is recommended to use the internally optimized `Keep.left` and `Keep.right` combiners
		 where appropriate instead of manually writing functions that pass through one of the values.
		
		
		
		Specified by:
		`[viaMat](FlowOpsMat.html#viaMat(akka.stream.Graph,scala.Function2))` in interface `[FlowOpsMat](FlowOpsMat.html "interface in akka.stream.scaladsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow")>`
		- #### to
		
		
		
		```
		public <Mat2> [Sink](Sink.html "class in akka.stream.scaladsl")<[In](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")> to​([Graph](../Graph.html "interface in akka.stream")<[SinkShape](../SinkShape.html "class in akka.stream")<[Out](Flow.html "type parameter in Flow")>,​Mat2> sink)
		```
		
		Connect this [`Flow`](Flow.html "class in akka.stream.scaladsl") to a [`Sink`](Sink.html "class in akka.stream.scaladsl"), concatenating the processing steps of both.
		 
		```
		
		     +------------------------------+
		     | Resulting Sink[In, Mat]      |
		     |                              |
		     |  +------+          +------+  |
		     |  |      |          |      |  |
		 In ~~> | flow | ~~Out~~> | sink |  |
		     |  |   Mat|          |     M|  |
		     |  +------+          +------+  |
		     +------------------------------+
		 
		```
		
		 The materialized value of the combined [`Sink`](Sink.html "class in akka.stream.scaladsl") will be the materialized
		 value of the current flow (ignoring the given Sink\&rsquo;s value), use
		 {@link Flow\#toMat\[Mat2\* toMat} if a different strategy is needed.
		 
		 See also [`<Mat2,Mat3>toMat(akka.stream.Graph<akka.stream.SinkShape<Out>,Mat2>,scala.Function2<Mat,Mat2,Mat3>)`](#toMat(akka.stream.Graph,scala.Function2)) when access to materialized values of the parameter is needed.
		
		
		
		Specified by:
		`[to](FlowOps.html#to(akka.stream.Graph))` in interface `[FlowOps](FlowOps.html "interface in akka.stream.scaladsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow")>`
		- #### toMat
		
		
		
		```
		public <Mat2,​Mat3> [Sink](Sink.html "class in akka.stream.scaladsl")<[In](Flow.html "type parameter in Flow"),​Mat3> toMat​([Graph](../Graph.html "interface in akka.stream")<[SinkShape](../SinkShape.html "class in akka.stream")<[Out](Flow.html "type parameter in Flow")>,​Mat2> sink,
		                                                   scala.Function2<[Mat](Flow.html "type parameter in Flow"),​Mat2,​Mat3> combine)
		```
		
		Connect this [`Flow`](Flow.html "class in akka.stream.scaladsl") to a [`Sink`](Sink.html "class in akka.stream.scaladsl"), concatenating the processing steps of both.
		 
		```
		
		     +----------------------------+
		     | Resulting Sink[In, M2]     |
		     |                            |
		     |  +------+        +------+  |
		     |  |      |        |      |  |
		 In ~~> | flow | ~Out~> | sink |  |
		     |  |   Mat|        |     M|  |
		     |  +------+        +------+  |
		     +----------------------------+
		 
		```
		
		 The `combine` function is used to compose the materialized values of this flow and that
		 Sink into the materialized value of the resulting Sink.
		 
		 It is recommended to use the internally optimized `Keep.left` and `Keep.right` combiners
		 where appropriate instead of manually writing functions that pass through one of the values.
		
		
		
		Specified by:
		`[toMat](FlowOpsMat.html#toMat(akka.stream.Graph,scala.Function2))` in interface `[FlowOpsMat](FlowOpsMat.html "interface in akka.stream.scaladsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow")>`
		- #### mapMaterializedValue
		
		
		
		```
		public <Mat2> [Flow](Flow.html "class in akka.stream.scaladsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​Mat2> mapMaterializedValue​(scala.Function1<[Mat](Flow.html "type parameter in Flow"),​Mat2> f)
		```
		
		Transform the materialized value of this Flow, leaving all other properties as they were.
		
		Specified by:
		`[mapMaterializedValue](FlowOpsMat.html#mapMaterializedValue(scala.Function1))` in interface `[FlowOpsMat](FlowOpsMat.html "interface in akka.stream.scaladsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow")>`
		- #### preMaterialize
		
		
		
		```
		public scala.Tuple2<[Mat](Flow.html "type parameter in Flow"),​[Flow](Flow.html "class in akka.stream.scaladsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[NotUsed](../../NotUsed.html "class in akka")>> preMaterialize​([Materializer](../Materializer.html "class in akka.stream") materializer)
		```
		
		Materializes this [`Flow`](Flow.html "class in akka.stream.scaladsl"), immediately returning (1\) its materialized value, and (2\) a newly materialized [`Flow`](Flow.html "class in akka.stream.scaladsl").
		 The returned flow is partial materialized and do not support multiple times materialization.
		 
		 Note that `preMaterialize` is implemented through a reactive streams `Publisher` and `Subscriber` pair which means that
		 a buffer is introduced and that errors are not propagated upstream but are turned into cancellations without error details.
		- #### contramap
		
		
		
		```
		public <In2> [Flow](Flow.html "class in akka.stream.scaladsl")<In2,​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")> contramap​(scala.Function1<In2,​[In](Flow.html "type parameter in Flow")> f)
		```
		
		Transform this Flow by applying a function to each \*incoming\* upstream element before
		 it is passed to the [`Flow`](Flow.html "class in akka.stream.scaladsl")
		
		 '''Backpressures when''' original [`Flow`](Flow.html "class in akka.stream.scaladsl") backpressures
		 
		
		
		 '''Cancels when''' original [`Flow`](Flow.html "class in akka.stream.scaladsl") cancels
		- #### join
		
		
		
		```
		public <Mat2> [RunnableGraph](RunnableGraph.html "class in akka.stream.scaladsl")<[Mat](Flow.html "type parameter in Flow")> join​([Graph](../Graph.html "interface in akka.stream")<[FlowShape](../FlowShape.html "class in akka.stream")<[Out](Flow.html "type parameter in Flow"),​[In](Flow.html "type parameter in Flow")>,​Mat2> flow)
		```
		
		Join this [`Flow`](Flow.html "class in akka.stream.scaladsl") to another [`Flow`](Flow.html "class in akka.stream.scaladsl"), by cross connecting the inputs and outputs, creating a [`RunnableGraph`](RunnableGraph.html "class in akka.stream.scaladsl").
		 
		```
		
		 +------+        +-------+
		 |      | ~Out~> |       |
		 | this |        | other |
		 |      | <~In~  |       |
		 +------+        +-------+
		 
		```
		
		 The materialized value of the combined [`Flow`](Flow.html "class in akka.stream.scaladsl") will be the materialized
		 value of the current flow (ignoring the other Flow\&rsquo;s value), use
		 {@link Flow\#joinMat\[Mat2\* joinMat} if a different strategy is needed.
		- #### joinMat
		
		
		
		```
		public <Mat2,​Mat3> [RunnableGraph](RunnableGraph.html "class in akka.stream.scaladsl")<Mat3> joinMat​([Graph](../Graph.html "interface in akka.stream")<[FlowShape](../FlowShape.html "class in akka.stream")<[Out](Flow.html "type parameter in Flow"),​[In](Flow.html "type parameter in Flow")>,​Mat2> flow,
		                                                     scala.Function2<[Mat](Flow.html "type parameter in Flow"),​Mat2,​Mat3> combine)
		```
		
		Join this [`Flow`](Flow.html "class in akka.stream.scaladsl") to another [`Flow`](Flow.html "class in akka.stream.scaladsl"), by cross connecting the inputs and outputs, creating a [`RunnableGraph`](RunnableGraph.html "class in akka.stream.scaladsl")
		
		```
		
		 +------+        +-------+
		 |      | ~Out~> |       |
		 | this |        | other |
		 |      | <~In~  |       |
		 +------+        +-------+
		 
		```
		
		 The `combine` function is used to compose the materialized values of this flow and that
		 Flow into the materialized value of the resulting Flow.
		 
		 It is recommended to use the internally optimized `Keep.left` and `Keep.right` combiners
		 where appropriate instead of manually writing functions that pass through one of the values.
		- #### join
		
		
		
		```
		public <I2,​O1,​Mat2> [Flow](Flow.html "class in akka.stream.scaladsl")<I2,​O1,​[Mat](Flow.html "type parameter in Flow")> join​([Graph](../Graph.html "interface in akka.stream")<[BidiShape](../BidiShape.html "class in akka.stream")<[Out](Flow.html "type parameter in Flow"),​O1,​I2,​[In](Flow.html "type parameter in Flow")>,​Mat2> bidi)
		```
		
		Join this [`Flow`](Flow.html "class in akka.stream.scaladsl") to a [`BidiFlow`](BidiFlow.html "class in akka.stream.scaladsl") to close off the \&ldquo;top\&rdquo; of the protocol stack:
		 
		```
		
		 +---------------------------+
		 | Resulting Flow            |
		 |                           |
		 | +------+        +------+  |
		 | |      | ~Out~> |      | ~~> O1
		 | | flow |        | bidi |  |
		 | |      | <~In~  |      | <~~ I2
		 | +------+        +------+  |
		 +---------------------------+
		 
		```
		
		 The materialized value of the combined [`Flow`](Flow.html "class in akka.stream.scaladsl") will be the materialized
		 value of the current flow (ignoring the [`BidiFlow`](BidiFlow.html "class in akka.stream.scaladsl")\&rsquo;s value), use
		 {@link Flow\#joinMat\[I2\* joinMat} if a different strategy is needed.
		- #### joinMat
		
		
		
		```
		public <I2,​O1,​Mat2,​M> [Flow](Flow.html "class in akka.stream.scaladsl")<I2,​O1,​M> joinMat​([Graph](../Graph.html "interface in akka.stream")<[BidiShape](../BidiShape.html "class in akka.stream")<[Out](Flow.html "type parameter in Flow"),​O1,​I2,​[In](Flow.html "type parameter in Flow")>,​Mat2> bidi,
		                                                                          scala.Function2<[Mat](Flow.html "type parameter in Flow"),​Mat2,​M> combine)
		```
		
		Join this [`Flow`](Flow.html "class in akka.stream.scaladsl") to a [`BidiFlow`](BidiFlow.html "class in akka.stream.scaladsl") to close off the \&ldquo;top\&rdquo; of the protocol stack:
		 
		```
		
		 +---------------------------+
		 | Resulting Flow            |
		 |                           |
		 | +------+        +------+  |
		 | |      | ~Out~> |      | ~~> O1
		 | | flow |        | bidi |  |
		 | |      | <~In~  |      | <~~ I2
		 | +------+        +------+  |
		 +---------------------------+
		 
		```
		
		 The `combine` function is used to compose the materialized values of this flow and that
		 [`BidiFlow`](BidiFlow.html "class in akka.stream.scaladsl") into the materialized value of the resulting [`Flow`](Flow.html "class in akka.stream.scaladsl").
		 
		 It is recommended to use the internally optimized `Keep.left` and `Keep.right` combiners
		 where appropriate instead of manually writing functions that pass through one of the values.
		- #### withAttributes
		
		
		
		```
		public [Flow](Flow.html "class in akka.stream.scaladsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")> withAttributes​([Attributes](../Attributes.html "class in akka.stream") attr)
		```
		
		Replace the attributes of this [`Flow`](Flow.html "class in akka.stream.scaladsl") with the given ones. If this Flow is a composite
		 of multiple graphs, new attributes on the composite will be less specific than attributes
		 set directly on the individual graphs of the composite.
		 
		 Note that this operation has no effect on an empty Flow (because the attributes apply
		 only to the contained processing operators).
		
		
		
		Specified by:
		`[withAttributes](FlowOps.html#withAttributes(akka.stream.Attributes))` in interface `[FlowOps](FlowOps.html "interface in akka.stream.scaladsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow")>`
		Specified by:
		`[withAttributes](../Graph.html#withAttributes(akka.stream.Attributes))` in interface `[Graph](../Graph.html "interface in akka.stream")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow")>`
		- #### addAttributes
		
		
		
		```
		public [Flow](Flow.html "class in akka.stream.scaladsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")> addAttributes​([Attributes](../Attributes.html "class in akka.stream") attr)
		```
		
		Add the given attributes to this [`Flow`](Flow.html "class in akka.stream.scaladsl"). If the specific attribute was already present
		 on this graph this means the added attribute will be more specific than the existing one.
		 If this Flow is a composite of multiple graphs, new attributes on the composite will be
		 less specific than attributes set directly on the individual graphs of the composite.
		
		Specified by:
		`[addAttributes](FlowOps.html#addAttributes(akka.stream.Attributes))` in interface `[FlowOps](FlowOps.html "interface in akka.stream.scaladsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow")>`
		Specified by:
		`[addAttributes](../Graph.html#addAttributes(akka.stream.Attributes))` in interface `[Graph](../Graph.html "interface in akka.stream")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow")>`
		- #### named
		
		
		
		```
		public [Flow](Flow.html "class in akka.stream.scaladsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")> named​(java.lang.String name)
		```
		
		Add a name attribute to this Flow.
		
		Specified by:
		`[named](FlowOps.html#named(java.lang.String))` in interface `[FlowOps](FlowOps.html "interface in akka.stream.scaladsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow")>`
		Specified by:
		`[named](../Graph.html#named(java.lang.String))` in interface `[Graph](../Graph.html "interface in akka.stream")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow")>`
		- #### async
		
		
		
		```
		public [Flow](Flow.html "class in akka.stream.scaladsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")> async()
		```
		
		Put an asynchronous boundary around this `Flow`
		
		Specified by:
		`[async](FlowOps.html#async())` in interface `[FlowOps](FlowOps.html "interface in akka.stream.scaladsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow")>`
		Specified by:
		`[async](../Graph.html#async())` in interface `[Graph](../Graph.html "interface in akka.stream")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow")>`
		- #### async
		
		
		
		```
		public [Flow](Flow.html "class in akka.stream.scaladsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")> async​(java.lang.String dispatcher)
		```
		
		Put an asynchronous boundary around this `Flow`
		
		
		Specified by:
		`[async](../Graph.html#async(java.lang.String))` in interface `[Graph](../Graph.html "interface in akka.stream")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow")>`
		Parameters:
		`dispatcher` \- Run the graph on this dispatcher
		- #### async
		
		
		
		```
		public [Flow](Flow.html "class in akka.stream.scaladsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")> async​(java.lang.String dispatcher,
		                                          int inputBufferSize)
		```
		
		Put an asynchronous boundary around this `Flow`
		
		
		Specified by:
		`[async](../Graph.html#async(java.lang.String,int))` in interface `[Graph](../Graph.html "interface in akka.stream")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow")>`
		Parameters:
		`dispatcher` \- Run the graph on this dispatcher
		`inputBufferSize` \- Set the input buffer to this size for the graph
		- #### runWith
		
		
		
		```
		public <Mat1,​Mat2> scala.Tuple2<Mat1,​Mat2> runWith​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<[In](Flow.html "type parameter in Flow")>,​Mat1> source,
		                                                               [Graph](../Graph.html "interface in akka.stream")<[SinkShape](../SinkShape.html "class in akka.stream")<[Out](Flow.html "type parameter in Flow")>,​Mat2> sink,
		                                                               [Materializer](../Materializer.html "class in akka.stream") materializer)
		```
		
		Connect the `Source` to this `Flow` and then connect it to the `Sink` and run it. The returned tuple contains
		 the materialized values of the `Source` and `Sink`, e.g. the `Subscriber` of a of a `Source#subscriber` and
		 and `Publisher` of a `Sink#publisher`.
		 
		 Note that the `ActorSystem` can be used as the implicit `materializer` parameter to use the
		 [`SystemMaterializer`](../SystemMaterializer.html "class in akka.stream") for running the stream.
		- #### toProcessor
		
		
		
		```
		public [RunnableGraph](RunnableGraph.html "class in akka.stream.scaladsl")<org.reactivestreams.Processor<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow")>> toProcessor()
		```
		
		Converts this Flow to a [`RunnableGraph`](RunnableGraph.html "class in akka.stream.scaladsl") that materializes to a Reactive Streams `Processor`
		 which implements the operations encapsulated by this Flow. Every materialization results in a new Processor
		 instance, i.e. the returned [`RunnableGraph`](RunnableGraph.html "class in akka.stream.scaladsl") is reusable.
		 
		
		Returns:
		A [`RunnableGraph`](RunnableGraph.html "class in akka.stream.scaladsl") that materializes to a Processor when run() is called on it.
		- #### asFlowWithContext
		
		
		
		```
		public <U,​CtxU,​CtxOut> [FlowWithContext](FlowWithContext.html "class in akka.stream.scaladsl")<U,​CtxU,​[Out](Flow.html "type parameter in Flow"),​CtxOut,​[Mat](Flow.html "type parameter in Flow")> asFlowWithContext​(scala.Function2<U,​CtxU,​[In](Flow.html "type parameter in Flow")> collapseContext,
		                                                                                                                    scala.Function1<[Out](Flow.html "type parameter in Flow"),​CtxOut> extractContext)
		```
		
		Turns a Flow into a FlowWithContext which manages a context per element along a stream.
		 
		
		Parameters:
		`collapseContext` \- turn each incoming pair of element and context value into an element of this Flow
		`extractContext` \- turn each outgoing element of this Flow into an outgoing context value
		- #### asJava
		
		
		
		```
		public <JIn extends [In](Flow.html "type parameter in Flow")> [Flow](../javadsl/Flow.html "class in akka.stream.javadsl")<JIn,​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")> asJava()
		```
		
		Converts this Scala DSL element to it's Java DSL counterpart.

## Code Examples

### Example 1: fromSinkAndSource

```text
+----------------------------------------------+
     | Resulting Flow[I, O, NotUsed]                |
     |                                              |
     |  +---------+                  +-----------+  |
     |  |         |                  |           |  |
 I  ~~> | Sink[I] | [no-connection!] | Source[O] | ~~> O
     |  |         |                  |           |  |
     |  +---------+                  +-----------+  |
     +----------------------------------------------+
```

### Example 2: fromSinkAndSourceMat

```text
+-------------------------------------------------------+
     | Resulting Flow[I, O, M]                              |
     |                                                      |
     |  +-------------+                  +---------------+  |
     |  |             |                  |               |  |
 I  ~~> | Sink[I, M1] | [no-connection!] | Source[O, M2] | ~~> O
     |  |             |                  |               |  |
     |  +-------------+                  +---------------+  |
     +------------------------------------------------------+
```

### Example 3: fromSinkAndSourceCoupled

```text
+---------------------------------------------+
     | Resulting Flow[I, O, NotUsed]               |
     |                                             |
     |  +---------+                 +-----------+  |
     |  |         |                 |           |  |
 I  ~~> | Sink[I] | ~~~(coupled)~~~ | Source[O] | ~~> O
     |  |         |                 |           |  |
     |  +---------+                 +-----------+  |
     +---------------------------------------------+
```

### Example 4: fromSinkAndSourceCoupledMat

```text
+-----------------------------------------------------+
     | Resulting Flow[I, O, M]                             |
     |                                                     |
     |  +-------------+                 +---------------+  |
     |  |             |                 |               |  |
 I  ~~> | Sink[I, M1] | ~~~(coupled)~~~ | Source[O, M2] | ~~> O
     |  |             |                 |               |  |
     |  +-------------+                 +---------------+  |
     +-----------------------------------------------------+
```

### Example 5: viaMat

```text
+---------------------------------+
     | Resulting Flow[In, T, M2]       |
     |                                 |
     |  +------+            +------+   |
     |  |      |            |      |   |
 In ~~> | this |  ~~Out~~>  | flow |  ~~> T
     |  |   Mat|            |     M|   |
     |  +------+            +------+   |
     +---------------------------------+
```

### Example 6: to

```text
+------------------------------+
     | Resulting Sink[In, Mat]      |
     |                              |
     |  +------+          +------+  |
     |  |      |          |      |  |
 In ~~> | flow | ~~Out~~> | sink |  |
     |  |   Mat|          |     M|  |
     |  +------+          +------+  |
     +------------------------------+
```

### Example 7: toMat

```text
+----------------------------+
     | Resulting Sink[In, M2]     |
     |                            |
     |  +------+        +------+  |
     |  |      |        |      |  |
 In ~~> | flow | ~Out~> | sink |  |
     |  |   Mat|        |     M|  |
     |  +------+        +------+  |
     +----------------------------+
```

### Example 8: join

```text
+------+        +-------+
 |      | ~Out~> |       |
 | this |        | other |
 |      | <~In~  |       |
 +------+        +-------+
```

### Example 9: joinMat

```text
+------+        +-------+
 |      | ~Out~> |       |
 | this |        | other |
 |      | <~In~  |       |
 +------+        +-------+
```

### Example 10: join

```text
+---------------------------+
 | Resulting Flow            |
 |                           |
 | +------+        +------+  |
 | |      | ~Out~> |      | ~~> O1
 | | flow |        | bidi |  |
 | |      | <~In~  |      | <~~ I2
 | +------+        +------+  |
 +---------------------------+
```

### Example 11: joinMat

```text
+---------------------------+
 | Resulting Flow            |
 |                           |
 | +------+        +------+  |
 | |      | ~Out~> |      | ~~> O1
 | | flow |        | bidi |  |
 | |      | <~In~  |      | <~~ I2
 | +------+        +------+  |
 +---------------------------+
```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/NotUsed.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/ActorMaterializer.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/Attributes.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/BidiShape.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/FlowShape.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/Graph.GraphMapMatVal.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/Graph.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/Materializer.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/Shape.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/SinkShape.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/SourceShape.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/SystemMaterializer.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/javadsl/Flow.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/scaladsl/BidiFlow.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/scaladsl/Flow.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/scaladsl/FlowOps.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/scaladsl/FlowOpsMat.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/scaladsl/FlowWithContext.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/scaladsl/RunnableGraph.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/scaladsl/Sink.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/scaladsl/Source.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/scaladsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/scaladsl/Flow.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/scaladsl/Flow.html)*