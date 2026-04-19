---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:21:56Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/2.10/akka/stream/javadsl/SourceWithContext.html
title: SourceWithContext
---

# SourceWithContext

## Content

Package [akka.stream.javadsl](package-summary.html)
## Class SourceWithContext\<Out,​Ctx,​Mat\>

- java.lang.Object
- - akka.stream.GraphDelegate\<[SourceShape](../SourceShape.html "class in akka.stream")\<scala.Tuple2\<Out,​Ctx\>\>,​Mat\>
	- - akka.stream.javadsl.SourceWithContext\<Out,​Ctx,​Mat\>

- All Implemented Interfaces:
`[Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<scala.Tuple2<Out,​Ctx>>,​Mat>`

---

```
public final class SourceWithContext<Out,​Ctx,​Mat>
extends akka.stream.GraphDelegate<[SourceShape](../SourceShape.html "class in akka.stream")<scala.Tuple2<Out,​Ctx>>,​Mat>
```

A source that provides operations which automatically propagate the context of an element.
 Only a subset of common operations from [`Source`](Source.html "class in akka.stream.javadsl") is supported. As an escape hatch you can
 use [`via(akka.stream.Graph<akka.stream.FlowShape<akka.japi.Pair<Out, Ctx>, akka.japi.Pair<Out2, Ctx2>>, Mat2>)`](#via(akka.stream.Graph)) to manually provide the context propagation for otherwise unsupported
 operations.
 
 Can be created by calling `Source.asSourceWithContext`

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface akka.stream.[Graph](../Graph.html "interface in akka.stream")
		
		
		`[Graph.GraphMapMatVal](../Graph.GraphMapMatVal.html "class in akka.stream")<[S](../Graph.GraphMapMatVal.html "type parameter in Graph.GraphMapMatVal") extends [Shape](../Shape.html "class in akka.stream"),​[M](../Graph.GraphMapMatVal.html "type parameter in Graph.GraphMapMatVal")>`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[SourceWithContext](#%3Cinit%3E(akka.stream.scaladsl.SourceWithContext))​([SourceWithContext](../scaladsl/SourceWithContext.html "class in akka.stream.scaladsl")<[Out](SourceWithContext.html "type parameter in SourceWithContext"),​[Ctx](SourceWithContext.html "type parameter in SourceWithContext"),​[Mat](SourceWithContext.html "type parameter in SourceWithContext")> delegate)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[SourceWithContext](../scaladsl/SourceWithContext.html "class in akka.stream.scaladsl")<[Out](SourceWithContext.html "type parameter in SourceWithContext"),​[Ctx](SourceWithContext.html "type parameter in SourceWithContext"),​[Mat](SourceWithContext.html "type parameter in SourceWithContext")>` | `[asScala](#asScala())()` |  |
	| `[Source](Source.html "class in akka.stream.javadsl")<[Pair](../../japi/Pair.html "class in akka.japi")<[Out](SourceWithContext.html "type parameter in SourceWithContext"),​[Ctx](SourceWithContext.html "type parameter in SourceWithContext")>,​[Mat](SourceWithContext.html "type parameter in SourceWithContext")>` | `[asSource](#asSource())()` | Stops automatic context propagation from here and converts this to a regular  stream of a pair of (data, context). |
	| `<Out2> [SourceWithContext](SourceWithContext.html "class in akka.stream.javadsl")<Out2,​[Ctx](SourceWithContext.html "type parameter in SourceWithContext"),​[Mat](SourceWithContext.html "type parameter in SourceWithContext")>` | `[collect](#collect(scala.PartialFunction))​(scala.PartialFunction<[Out](SourceWithContext.html "type parameter in SourceWithContext"),​Out2> pf)` | Context\-preserving variant of `akka.stream.javadsl.Source.collect`. |
	| `[SourceWithContext](SourceWithContext.html "class in akka.stream.javadsl")<[Out](SourceWithContext.html "type parameter in SourceWithContext"),​[Ctx](SourceWithContext.html "type parameter in SourceWithContext"),​[Mat](SourceWithContext.html "type parameter in SourceWithContext")>` | `[filter](#filter(akka.japi.function.Predicate))​([Predicate](../../japi/function/Predicate.html "interface in akka.japi.function")<[Out](SourceWithContext.html "type parameter in SourceWithContext")> p)` | Context\-preserving variant of `akka.stream.javadsl.Source.filter`. |
	| `[SourceWithContext](SourceWithContext.html "class in akka.stream.javadsl")<[Out](SourceWithContext.html "type parameter in SourceWithContext"),​[Ctx](SourceWithContext.html "type parameter in SourceWithContext"),​[Mat](SourceWithContext.html "type parameter in SourceWithContext")>` | `[filterNot](#filterNot(akka.japi.function.Predicate))​([Predicate](../../japi/function/Predicate.html "interface in akka.japi.function")<[Out](SourceWithContext.html "type parameter in SourceWithContext")> p)` | Context\-preserving variant of `akka.stream.javadsl.Source.filterNot`. |
	| `static <Out,​CtxOut,​Mat>[SourceWithContext](SourceWithContext.html "class in akka.stream.javadsl")<Out,​CtxOut,​Mat>` | `[fromPairs](#fromPairs(akka.stream.javadsl.Source))​([Source](Source.html "class in akka.stream.javadsl")<[Pair](../../japi/Pair.html "class in akka.japi")<Out,​CtxOut>,​Mat> under)` | Creates a SourceWithContext from a regular flow that operates on `Pair` elements. |
	| `[SourceWithContext](SourceWithContext.html "class in akka.stream.javadsl")<java.util.List<[Out](SourceWithContext.html "type parameter in SourceWithContext")>,​java.util.List<[Ctx](SourceWithContext.html "type parameter in SourceWithContext")>,​[Mat](SourceWithContext.html "type parameter in SourceWithContext")>` | `[grouped](#grouped(int))​(int n)` | Context\-preserving variant of `akka.stream.javadsl.Source.grouped`. |
	| `[SourceWithContext](SourceWithContext.html "class in akka.stream.javadsl")<[Out](SourceWithContext.html "type parameter in SourceWithContext"),​[Ctx](SourceWithContext.html "type parameter in SourceWithContext"),​[Mat](SourceWithContext.html "type parameter in SourceWithContext")>` | `[log](#log(java.lang.String))​(java.lang.String name)` | Context\-preserving variant of `akka.stream.javadsl.Flow.log`. |
	| `[SourceWithContext](SourceWithContext.html "class in akka.stream.javadsl")<[Out](SourceWithContext.html "type parameter in SourceWithContext"),​[Ctx](SourceWithContext.html "type parameter in SourceWithContext"),​[Mat](SourceWithContext.html "type parameter in SourceWithContext")>` | `[log](#log(java.lang.String,akka.event.LoggingAdapter))​(java.lang.String name,  [LoggingAdapter](../../event/LoggingAdapter.html "interface in akka.event") log)` | Context\-preserving variant of `akka.stream.javadsl.Flow.log`. |
	| `[SourceWithContext](SourceWithContext.html "class in akka.stream.javadsl")<[Out](SourceWithContext.html "type parameter in SourceWithContext"),​[Ctx](SourceWithContext.html "type parameter in SourceWithContext"),​[Mat](SourceWithContext.html "type parameter in SourceWithContext")>` | `[log](#log(java.lang.String,akka.japi.function.Function))​(java.lang.String name,  [Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](SourceWithContext.html "type parameter in SourceWithContext"),​java.lang.Object> extract)` | Context\-preserving variant of `akka.stream.javadsl.Flow.log`. |
	| `[SourceWithContext](SourceWithContext.html "class in akka.stream.javadsl")<[Out](SourceWithContext.html "type parameter in SourceWithContext"),​[Ctx](SourceWithContext.html "type parameter in SourceWithContext"),​[Mat](SourceWithContext.html "type parameter in SourceWithContext")>` | `[log](#log(java.lang.String,akka.japi.function.Function,akka.event.LoggingAdapter))​(java.lang.String name,  [Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](SourceWithContext.html "type parameter in SourceWithContext"),​java.lang.Object> extract,  [LoggingAdapter](../../event/LoggingAdapter.html "interface in akka.event") log)` | Context\-preserving variant of `akka.stream.javadsl.Source.log`. |
	| `[SourceWithContext](SourceWithContext.html "class in akka.stream.javadsl")<[Out](SourceWithContext.html "type parameter in SourceWithContext"),​[Ctx](SourceWithContext.html "type parameter in SourceWithContext"),​[Mat](SourceWithContext.html "type parameter in SourceWithContext")>` | `[logWithMarker](#logWithMarker(java.lang.String,akka.japi.function.Function2))​(java.lang.String name,  [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<[Out](SourceWithContext.html "type parameter in SourceWithContext"),​[Ctx](SourceWithContext.html "type parameter in SourceWithContext"),​[LogMarker](../../event/LogMarker.html "class in akka.event")> marker)` | Context\-preserving variant of `akka.stream.javadsl.Flow.logWithMarker`. |
	| `[SourceWithContext](SourceWithContext.html "class in akka.stream.javadsl")<[Out](SourceWithContext.html "type parameter in SourceWithContext"),​[Ctx](SourceWithContext.html "type parameter in SourceWithContext"),​[Mat](SourceWithContext.html "type parameter in SourceWithContext")>` | `[logWithMarker](#logWithMarker(java.lang.String,akka.japi.function.Function2,akka.event.MarkerLoggingAdapter))​(java.lang.String name,  [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<[Out](SourceWithContext.html "type parameter in SourceWithContext"),​[Ctx](SourceWithContext.html "type parameter in SourceWithContext"),​[LogMarker](../../event/LogMarker.html "class in akka.event")> marker,  [MarkerLoggingAdapter](../../event/MarkerLoggingAdapter.html "class in akka.event") log)` | Context\-preserving variant of `akka.stream.javadsl.Flow.logWithMarker`. |
	| `[SourceWithContext](SourceWithContext.html "class in akka.stream.javadsl")<[Out](SourceWithContext.html "type parameter in SourceWithContext"),​[Ctx](SourceWithContext.html "type parameter in SourceWithContext"),​[Mat](SourceWithContext.html "type parameter in SourceWithContext")>` | `[logWithMarker](#logWithMarker(java.lang.String,akka.japi.function.Function2,akka.japi.function.Function))​(java.lang.String name,  [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<[Out](SourceWithContext.html "type parameter in SourceWithContext"),​[Ctx](SourceWithContext.html "type parameter in SourceWithContext"),​[LogMarker](../../event/LogMarker.html "class in akka.event")> marker,  [Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](SourceWithContext.html "type parameter in SourceWithContext"),​java.lang.Object> extract)` | Context\-preserving variant of `akka.stream.javadsl.Flow.logWithMarker`., |
	| `[SourceWithContext](SourceWithContext.html "class in akka.stream.javadsl")<[Out](SourceWithContext.html "type parameter in SourceWithContext"),​[Ctx](SourceWithContext.html "type parameter in SourceWithContext"),​[Mat](SourceWithContext.html "type parameter in SourceWithContext")>` | `[logWithMarker](#logWithMarker(java.lang.String,akka.japi.function.Function2,akka.japi.function.Function,akka.event.MarkerLoggingAdapter))​(java.lang.String name,  [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<[Out](SourceWithContext.html "type parameter in SourceWithContext"),​[Ctx](SourceWithContext.html "type parameter in SourceWithContext"),​[LogMarker](../../event/LogMarker.html "class in akka.event")> marker,  [Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](SourceWithContext.html "type parameter in SourceWithContext"),​java.lang.Object> extract,  [MarkerLoggingAdapter](../../event/MarkerLoggingAdapter.html "class in akka.event") log)` | Context\-preserving variant of `akka.stream.javadsl.Source.logWithMarker`. |
	| `<Out2> [SourceWithContext](SourceWithContext.html "class in akka.stream.javadsl")<Out2,​[Ctx](SourceWithContext.html "type parameter in SourceWithContext"),​[Mat](SourceWithContext.html "type parameter in SourceWithContext")>` | `[map](#map(akka.japi.function.Function))​([Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](SourceWithContext.html "type parameter in SourceWithContext"),​Out2> f)` | Context\-preserving variant of `akka.stream.javadsl.Source.map`. |
	| `<Out2> [SourceWithContext](SourceWithContext.html "class in akka.stream.javadsl")<Out2,​[Ctx](SourceWithContext.html "type parameter in SourceWithContext"),​[Mat](SourceWithContext.html "type parameter in SourceWithContext")>` | `[mapAsync](#mapAsync(int,akka.japi.function.Function))​(int parallelism,  [Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](SourceWithContext.html "type parameter in SourceWithContext"),​java.util.concurrent.CompletionStage<Out2>> f)` | Context\-preserving variant of `akka.stream.javadsl.Source.mapAsync`. |
	| `<Out2,​P>[SourceWithContext](SourceWithContext.html "class in akka.stream.javadsl")<Out2,​[Ctx](SourceWithContext.html "type parameter in SourceWithContext"),​[Mat](SourceWithContext.html "type parameter in SourceWithContext")>` | `[mapAsyncPartitioned](#mapAsyncPartitioned(int,int,akka.japi.function.Function,java.util.function.BiFunction))​(int parallelism,  int perPartition,  [Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](SourceWithContext.html "type parameter in SourceWithContext"),​P> partitioner,  java.util.function.BiFunction<[Out](SourceWithContext.html "type parameter in SourceWithContext"),​P,​java.util.concurrent.CompletionStage<Out2>> f)` | Context\-preserving variant of `akka.stream.javadsl.Source.mapAsyncPartitioned`. |
	| `<Out2> [SourceWithContext](SourceWithContext.html "class in akka.stream.javadsl")<Out2,​[Ctx](SourceWithContext.html "type parameter in SourceWithContext"),​[Mat](SourceWithContext.html "type parameter in SourceWithContext")>` | `[mapConcat](#mapConcat(akka.japi.function.Function))​([Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](SourceWithContext.html "type parameter in SourceWithContext"),​? extends java.lang.Iterable<Out2>> f)` | Context\-preserving variant of `akka.stream.javadsl.Source.mapConcat`. |
	| `<Ctx2> [SourceWithContext](SourceWithContext.html "class in akka.stream.javadsl")<[Out](SourceWithContext.html "type parameter in SourceWithContext"),​Ctx2,​[Mat](SourceWithContext.html "type parameter in SourceWithContext")>` | `[mapContext](#mapContext(akka.japi.function.Function))​([Function](../../japi/function/Function.html "interface in akka.japi.function")<[Ctx](SourceWithContext.html "type parameter in SourceWithContext"),​Ctx2> extractContext)` | Apply the given function to each context element (leaving the data elements unchanged). |
	| `[SourceWithContext](SourceWithContext.html "class in akka.stream.javadsl")<[Out](SourceWithContext.html "type parameter in SourceWithContext"),​[Ctx](SourceWithContext.html "type parameter in SourceWithContext"),​[Mat](SourceWithContext.html "type parameter in SourceWithContext")>` | `[mapError](#mapError(scala.PartialFunction))​(scala.PartialFunction<java.lang.Throwable,​java.lang.Throwable> pf)` | Context\-preserving variant of `akka.stream.javadsl.Source.mapError`. |
	| `<Mat2> [SourceWithContext](SourceWithContext.html "class in akka.stream.javadsl")<[Out](SourceWithContext.html "type parameter in SourceWithContext"),​[Ctx](SourceWithContext.html "type parameter in SourceWithContext"),​Mat2>` | `[mapMaterializedValue](#mapMaterializedValue(akka.japi.function.Function))​([Function](../../japi/function/Function.html "interface in akka.japi.function")<[Mat](SourceWithContext.html "type parameter in SourceWithContext"),​Mat2> f)` | Context\-preserving variant of `akka.stream.javadsl.Source.mapMaterializedValue`. |
	| `<M> M` | `[runWith](#runWith(akka.stream.Graph,akka.actor.ClassicActorSystemProvider))​([Graph](../Graph.html "interface in akka.stream")<[SinkShape](../SinkShape.html "class in akka.stream")<[Pair](../../japi/Pair.html "class in akka.japi")<[Out](SourceWithContext.html "type parameter in SourceWithContext"),​[Ctx](SourceWithContext.html "type parameter in SourceWithContext")>>,​M> sink,  [ClassicActorSystemProvider](../../actor/ClassicActorSystemProvider.html "interface in akka.actor") systemProvider)` | Connect this [`SourceWithContext`](SourceWithContext.html "class in akka.stream.javadsl") to a [`Sink`](Sink.html "class in akka.stream.javadsl") and run it. |
	| `<M> M` | `[runWith](#runWith(akka.stream.Graph,akka.stream.Materializer))​([Graph](../Graph.html "interface in akka.stream")<[SinkShape](../SinkShape.html "class in akka.stream")<[Pair](../../japi/Pair.html "class in akka.japi")<[Out](SourceWithContext.html "type parameter in SourceWithContext"),​[Ctx](SourceWithContext.html "type parameter in SourceWithContext")>>,​M> sink,  [Materializer](../Materializer.html "class in akka.stream") materializer)` | Connect this [`SourceWithContext`](SourceWithContext.html "class in akka.stream.javadsl") to a [`Sink`](Sink.html "class in akka.stream.javadsl") and run it. |
	| `[SourceWithContext](SourceWithContext.html "class in akka.stream.javadsl")<java.util.List<[Out](SourceWithContext.html "type parameter in SourceWithContext")>,​java.util.List<[Ctx](SourceWithContext.html "type parameter in SourceWithContext")>,​[Mat](SourceWithContext.html "type parameter in SourceWithContext")>` | `[sliding](#sliding(int,int))​(int n,  int step)` | Context\-preserving variant of `akka.stream.javadsl.Source.sliding`. |
	| `int` | `[sliding$default$2](#sliding$default$2())()` |  |
	| `[SourceWithContext](SourceWithContext.html "class in akka.stream.javadsl")<[Out](SourceWithContext.html "type parameter in SourceWithContext"),​[Ctx](SourceWithContext.html "type parameter in SourceWithContext"),​[Mat](SourceWithContext.html "type parameter in SourceWithContext")>` | `[throttle](#throttle(int,java.time.Duration))​(int elements,  java.time.Duration per)` | Context\-preserving variant of `akka.stream.javadsl.Source.throttle`. |
	| `[SourceWithContext](SourceWithContext.html "class in akka.stream.javadsl")<[Out](SourceWithContext.html "type parameter in SourceWithContext"),​[Ctx](SourceWithContext.html "type parameter in SourceWithContext"),​[Mat](SourceWithContext.html "type parameter in SourceWithContext")>` | `[throttle](#throttle(int,java.time.Duration,int,akka.japi.function.Function,akka.stream.ThrottleMode))​(int cost,  java.time.Duration per,  int maximumBurst,  [Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](SourceWithContext.html "type parameter in SourceWithContext"),​java.lang.Integer> costCalculation,  [ThrottleMode](../ThrottleMode.html "class in akka.stream") mode)` | Context\-preserving variant of `akka.stream.javadsl.Source.throttle`. |
	| `[SourceWithContext](SourceWithContext.html "class in akka.stream.javadsl")<[Out](SourceWithContext.html "type parameter in SourceWithContext"),​[Ctx](SourceWithContext.html "type parameter in SourceWithContext"),​[Mat](SourceWithContext.html "type parameter in SourceWithContext")>` | `[throttle](#throttle(int,java.time.Duration,int,akka.stream.ThrottleMode))​(int elements,  java.time.Duration per,  int maximumBurst,  [ThrottleMode](../ThrottleMode.html "class in akka.stream") mode)` | Context\-preserving variant of `akka.stream.javadsl.Source.throttle`. |
	| `[SourceWithContext](SourceWithContext.html "class in akka.stream.javadsl")<[Out](SourceWithContext.html "type parameter in SourceWithContext"),​[Ctx](SourceWithContext.html "type parameter in SourceWithContext"),​[Mat](SourceWithContext.html "type parameter in SourceWithContext")>` | `[throttle](#throttle(int,java.time.Duration,akka.japi.function.Function))​(int cost,  java.time.Duration per,  [Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](SourceWithContext.html "type parameter in SourceWithContext"),​java.lang.Integer> costCalculation)` | Context\-preserving variant of `akka.stream.javadsl.Source.throttle`. |
	| `[SourceWithContext](SourceWithContext.html "class in akka.stream.javadsl")<[Out](SourceWithContext.html "type parameter in SourceWithContext"),​[Ctx](SourceWithContext.html "type parameter in SourceWithContext"),​[Mat](SourceWithContext.html "type parameter in SourceWithContext")>` | `[throttle](#throttle(akka.stream.javadsl.ThrottleControl))​([ThrottleControl](ThrottleControl.html "class in akka.stream.javadsl") control)` | Context\-preserving variant of `akka.stream.javadsl.Source.throttle`. |
	| `[SourceWithContext](SourceWithContext.html "class in akka.stream.javadsl")<[Out](SourceWithContext.html "type parameter in SourceWithContext"),​[Ctx](SourceWithContext.html "type parameter in SourceWithContext"),​[Mat](SourceWithContext.html "type parameter in SourceWithContext")>` | `[throttle](#throttle(akka.stream.javadsl.ThrottleControl,akka.japi.function.Function))​([ThrottleControl](ThrottleControl.html "class in akka.stream.javadsl") control,  [Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](SourceWithContext.html "type parameter in SourceWithContext"),​java.lang.Integer> costCalculation)` | Context\-preserving variant of `akka.stream.javadsl.Source.throttle`. |
	| `<Mat2> [RunnableGraph](RunnableGraph.html "class in akka.stream.javadsl")<[Mat](SourceWithContext.html "type parameter in SourceWithContext")>` | `[to](#to(akka.stream.Graph))​([Graph](../Graph.html "interface in akka.stream")<[SinkShape](../SinkShape.html "class in akka.stream")<[Pair](../../japi/Pair.html "class in akka.japi")<[Out](SourceWithContext.html "type parameter in SourceWithContext"),​[Ctx](SourceWithContext.html "type parameter in SourceWithContext")>>,​Mat2> sink)` | Connect this [`SourceWithContext`](SourceWithContext.html "class in akka.stream.javadsl") to a [`Sink`](Sink.html "class in akka.stream.javadsl"),  concatenating the processing steps of both. |
	| `<Mat2,​Mat3>[RunnableGraph](RunnableGraph.html "class in akka.stream.javadsl")<Mat3>` | `[toMat](#toMat(akka.stream.Graph,akka.japi.function.Function2))​([Graph](../Graph.html "interface in akka.stream")<[SinkShape](../SinkShape.html "class in akka.stream")<[Pair](../../japi/Pair.html "class in akka.japi")<[Out](SourceWithContext.html "type parameter in SourceWithContext"),​[Ctx](SourceWithContext.html "type parameter in SourceWithContext")>>,​Mat2> sink,  [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<[Mat](SourceWithContext.html "type parameter in SourceWithContext"),​Mat2,​Mat3> combine)` | Connect this [`SourceWithContext`](SourceWithContext.html "class in akka.stream.javadsl") to a [`Sink`](Sink.html "class in akka.stream.javadsl"),  concatenating the processing steps of both. |
	| `<Out2,​Mat2>[SourceWithContext](SourceWithContext.html "class in akka.stream.javadsl")<Out2,​[Ctx](SourceWithContext.html "type parameter in SourceWithContext"),​[Mat](SourceWithContext.html "type parameter in SourceWithContext")>` | `[unsafeDataVia](#unsafeDataVia(akka.stream.Graph))​([Graph](../Graph.html "interface in akka.stream")<[FlowShape](../FlowShape.html "class in akka.stream")<[Out](SourceWithContext.html "type parameter in SourceWithContext"),​Out2>,​Mat2> viaFlow)` | Transform this flow by the regular flow. |
	| `<Out2,​Ctx2,​Mat2>[SourceWithContext](SourceWithContext.html "class in akka.stream.javadsl")<Out2,​Ctx2,​[Mat](SourceWithContext.html "type parameter in SourceWithContext")>` | `[via](#via(akka.stream.Graph))​([Graph](../Graph.html "interface in akka.stream")<[FlowShape](../FlowShape.html "class in akka.stream")<[Pair](../../japi/Pair.html "class in akka.japi")<[Out](SourceWithContext.html "type parameter in SourceWithContext"),​[Ctx](SourceWithContext.html "type parameter in SourceWithContext")>,​[Pair](../../japi/Pair.html "class in akka.japi")<Out2,​Ctx2>>,​Mat2> viaFlow)` | Transform this flow by the regular flow. |
	| `[SourceWithContext](SourceWithContext.html "class in akka.stream.javadsl")<[Out](SourceWithContext.html "type parameter in SourceWithContext"),​[Ctx](SourceWithContext.html "type parameter in SourceWithContext"),​[Mat](SourceWithContext.html "type parameter in SourceWithContext")>` | `[withAttributes](#withAttributes(akka.stream.Attributes))​([Attributes](../Attributes.html "class in akka.stream") attr)` | Context\-preserving variant of `akka.stream.javadsl.Source.withAttributes`. |
	
	
		- ### Methods inherited from class akka.stream.GraphDelegate
		
		
		`addAttributes, async, async, async, getAttributes, named, shape, traversalBuilder`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### SourceWithContext
		
		
		
		```
		public SourceWithContext​([SourceWithContext](../scaladsl/SourceWithContext.html "class in akka.stream.scaladsl")<[Out](SourceWithContext.html "type parameter in SourceWithContext"),​[Ctx](SourceWithContext.html "type parameter in SourceWithContext"),​[Mat](SourceWithContext.html "type parameter in SourceWithContext")> delegate)
		```

	- ### Method Detail
	
	
	
		- #### fromPairs
		
		
		
		```
		public static <Out,​CtxOut,​Mat> [SourceWithContext](SourceWithContext.html "class in akka.stream.javadsl")<Out,​CtxOut,​Mat> fromPairs​([Source](Source.html "class in akka.stream.javadsl")<[Pair](../../japi/Pair.html "class in akka.japi")<Out,​CtxOut>,​Mat> under)
		```
		
		Creates a SourceWithContext from a regular flow that operates on `Pair` elements.
		- #### via
		
		
		
		```
		public <Out2,​Ctx2,​Mat2> [SourceWithContext](SourceWithContext.html "class in akka.stream.javadsl")<Out2,​Ctx2,​[Mat](SourceWithContext.html "type parameter in SourceWithContext")> via​([Graph](../Graph.html "interface in akka.stream")<[FlowShape](../FlowShape.html "class in akka.stream")<[Pair](../../japi/Pair.html "class in akka.japi")<[Out](SourceWithContext.html "type parameter in SourceWithContext"),​[Ctx](SourceWithContext.html "type parameter in SourceWithContext")>,​[Pair](../../japi/Pair.html "class in akka.japi")<Out2,​Ctx2>>,​Mat2> viaFlow)
		```
		
		Transform this flow by the regular flow. The given flow must support manual context propagation by
		 taking and producing tuples of (data, context).
		 
		 It is up to the implementer to ensure the inner flow does not exhibit any behaviour that is not expected
		 by the downstream elements, such as reordering. For more background on these requirements
		 see https://doc.akka.io/libraries/akka\-core/current/stream/stream\-context.html.
		 
		
		
		 This can be used as an escape hatch for operations that are not (yet) provided with automatic
		 context propagation here.
		 
		
		
		
		See Also:
		`akka.stream.javadsl.Flow.via`
		- #### unsafeDataVia
		
		
		
		```
		public <Out2,​Mat2> [SourceWithContext](SourceWithContext.html "class in akka.stream.javadsl")<Out2,​[Ctx](SourceWithContext.html "type parameter in SourceWithContext"),​[Mat](SourceWithContext.html "type parameter in SourceWithContext")> unsafeDataVia​([Graph](../Graph.html "interface in akka.stream")<[FlowShape](../FlowShape.html "class in akka.stream")<[Out](SourceWithContext.html "type parameter in SourceWithContext"),​Out2>,​Mat2> viaFlow)
		```
		
		Transform this flow by the regular flow. The given flow works on the data portion of the stream and
		 ignores the context.
		 
		 The given flow \*must\* not re\-order, drop or emit multiple elements for one incoming
		 element, the sequence of incoming contexts is re\-combined with the outgoing
		 elements of the stream. If a flow not fulfilling this requirement is used the stream
		 will not fail but continue running in a corrupt state and re\-combine incorrect pairs
		 of elements and contexts or deadlock.
		 
		
		
		 For more background on these requirements
		 see https://doc.akka.io/libraries/akka\-core/current/stream/stream\-context.html.
		- #### withAttributes
		
		
		
		```
		public [SourceWithContext](SourceWithContext.html "class in akka.stream.javadsl")<[Out](SourceWithContext.html "type parameter in SourceWithContext"),​[Ctx](SourceWithContext.html "type parameter in SourceWithContext"),​[Mat](SourceWithContext.html "type parameter in SourceWithContext")> withAttributes​([Attributes](../Attributes.html "class in akka.stream") attr)
		```
		
		Context\-preserving variant of `akka.stream.javadsl.Source.withAttributes`.
		 
		
		See Also:
		`akka.stream.javadsl.Source.withAttributes`
		- #### mapError
		
		
		
		```
		public [SourceWithContext](SourceWithContext.html "class in akka.stream.javadsl")<[Out](SourceWithContext.html "type parameter in SourceWithContext"),​[Ctx](SourceWithContext.html "type parameter in SourceWithContext"),​[Mat](SourceWithContext.html "type parameter in SourceWithContext")> mapError​(scala.PartialFunction<java.lang.Throwable,​java.lang.Throwable> pf)
		```
		
		Context\-preserving variant of `akka.stream.javadsl.Source.mapError`.
		 
		
		See Also:
		`akka.stream.javadsl.Source.mapError`
		- #### mapMaterializedValue
		
		
		
		```
		public <Mat2> [SourceWithContext](SourceWithContext.html "class in akka.stream.javadsl")<[Out](SourceWithContext.html "type parameter in SourceWithContext"),​[Ctx](SourceWithContext.html "type parameter in SourceWithContext"),​Mat2> mapMaterializedValue​([Function](../../japi/function/Function.html "interface in akka.japi.function")<[Mat](SourceWithContext.html "type parameter in SourceWithContext"),​Mat2> f)
		```
		
		Context\-preserving variant of `akka.stream.javadsl.Source.mapMaterializedValue`.
		 
		
		See Also:
		`akka.stream.javadsl.Flow.mapMaterializedValue`
		- #### asSource
		
		
		
		```
		public [Source](Source.html "class in akka.stream.javadsl")<[Pair](../../japi/Pair.html "class in akka.japi")<[Out](SourceWithContext.html "type parameter in SourceWithContext"),​[Ctx](SourceWithContext.html "type parameter in SourceWithContext")>,​[Mat](SourceWithContext.html "type parameter in SourceWithContext")> asSource()
		```
		
		Stops automatic context propagation from here and converts this to a regular
		 stream of a pair of (data, context).
		- #### collect
		
		
		
		```
		public <Out2> [SourceWithContext](SourceWithContext.html "class in akka.stream.javadsl")<Out2,​[Ctx](SourceWithContext.html "type parameter in SourceWithContext"),​[Mat](SourceWithContext.html "type parameter in SourceWithContext")> collect​(scala.PartialFunction<[Out](SourceWithContext.html "type parameter in SourceWithContext"),​Out2> pf)
		```
		
		Context\-preserving variant of `akka.stream.javadsl.Source.collect`.
		 
		 Note, that the context of elements that are filtered out is skipped as well.
		 
		
		
		
		See Also:
		`akka.stream.javadsl.Source.collect`
		- #### filter
		
		
		
		```
		public [SourceWithContext](SourceWithContext.html "class in akka.stream.javadsl")<[Out](SourceWithContext.html "type parameter in SourceWithContext"),​[Ctx](SourceWithContext.html "type parameter in SourceWithContext"),​[Mat](SourceWithContext.html "type parameter in SourceWithContext")> filter​([Predicate](../../japi/function/Predicate.html "interface in akka.japi.function")<[Out](SourceWithContext.html "type parameter in SourceWithContext")> p)
		```
		
		Context\-preserving variant of `akka.stream.javadsl.Source.filter`.
		 
		 Note, that the context of elements that are filtered out is skipped as well.
		 
		
		
		
		See Also:
		`akka.stream.javadsl.Source.filter`
		- #### filterNot
		
		
		
		```
		public [SourceWithContext](SourceWithContext.html "class in akka.stream.javadsl")<[Out](SourceWithContext.html "type parameter in SourceWithContext"),​[Ctx](SourceWithContext.html "type parameter in SourceWithContext"),​[Mat](SourceWithContext.html "type parameter in SourceWithContext")> filterNot​([Predicate](../../japi/function/Predicate.html "interface in akka.japi.function")<[Out](SourceWithContext.html "type parameter in SourceWithContext")> p)
		```
		
		Context\-preserving variant of `akka.stream.javadsl.Source.filterNot`.
		 
		 Note, that the context of elements that are filtered out is skipped as well.
		 
		
		
		
		See Also:
		`akka.stream.javadsl.Source.filterNot`
		- #### grouped
		
		
		
		```
		public [SourceWithContext](SourceWithContext.html "class in akka.stream.javadsl")<java.util.List<[Out](SourceWithContext.html "type parameter in SourceWithContext")>,​java.util.List<[Ctx](SourceWithContext.html "type parameter in SourceWithContext")>,​[Mat](SourceWithContext.html "type parameter in SourceWithContext")> grouped​(int n)
		```
		
		Context\-preserving variant of `akka.stream.javadsl.Source.grouped`.
		 
		 Each output group will be associated with a `Seq` of corresponding context elements.
		 
		
		
		
		See Also:
		`akka.stream.javadsl.Source.grouped`
		- #### map
		
		
		
		```
		public <Out2> [SourceWithContext](SourceWithContext.html "class in akka.stream.javadsl")<Out2,​[Ctx](SourceWithContext.html "type parameter in SourceWithContext"),​[Mat](SourceWithContext.html "type parameter in SourceWithContext")> map​([Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](SourceWithContext.html "type parameter in SourceWithContext"),​Out2> f)
		```
		
		Context\-preserving variant of `akka.stream.javadsl.Source.map`.
		 
		
		See Also:
		`akka.stream.javadsl.Source.map`
		- #### mapAsync
		
		
		
		```
		public <Out2> [SourceWithContext](SourceWithContext.html "class in akka.stream.javadsl")<Out2,​[Ctx](SourceWithContext.html "type parameter in SourceWithContext"),​[Mat](SourceWithContext.html "type parameter in SourceWithContext")> mapAsync​(int parallelism,
		                                                                   [Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](SourceWithContext.html "type parameter in SourceWithContext"),​java.util.concurrent.CompletionStage<Out2>> f)
		```
		
		Context\-preserving variant of `akka.stream.javadsl.Source.mapAsync`.
		 
		
		See Also:
		`akka.stream.javadsl.Source.mapAsync`
		- #### mapAsyncPartitioned
		
		
		
		```
		public <Out2,​P> [SourceWithContext](SourceWithContext.html "class in akka.stream.javadsl")<Out2,​[Ctx](SourceWithContext.html "type parameter in SourceWithContext"),​[Mat](SourceWithContext.html "type parameter in SourceWithContext")> mapAsyncPartitioned​(int parallelism,
		                                                                                      int perPartition,
		                                                                                      [Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](SourceWithContext.html "type parameter in SourceWithContext"),​P> partitioner,
		                                                                                      java.util.function.BiFunction<[Out](SourceWithContext.html "type parameter in SourceWithContext"),​P,​java.util.concurrent.CompletionStage<Out2>> f)
		```
		
		Context\-preserving variant of `akka.stream.javadsl.Source.mapAsyncPartitioned`.
		 
		
		See Also:
		`akka.stream.javadsl.Source.mapAsyncPartitioned`
		- #### mapConcat
		
		
		
		```
		public <Out2> [SourceWithContext](SourceWithContext.html "class in akka.stream.javadsl")<Out2,​[Ctx](SourceWithContext.html "type parameter in SourceWithContext"),​[Mat](SourceWithContext.html "type parameter in SourceWithContext")> mapConcat​([Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](SourceWithContext.html "type parameter in SourceWithContext"),​? extends java.lang.Iterable<Out2>> f)
		```
		
		Context\-preserving variant of `akka.stream.javadsl.Source.mapConcat`.
		 
		 The context of the input element will be associated with each of the output elements calculated from
		 this input element.
		 
		
		
		 Example:
		 
		
		
		`def dup(element: String) = Seq(element, element)`
		
		
		
		 Input:
		 
		
		
		 ("a", 1\)
		 ("b", 2\)
		 
		
		
		 inputElements.mapConcat(dup)
		 
		
		
		 Output:
		 
		
		
		 ("a", 1\)
		 ("a", 1\)
		 ("b", 2\)
		 ("b", 2\)
		 
		
		
		
		
		See Also:
		`akka.stream.javadsl.Source.mapConcat`
		- #### mapContext
		
		
		
		```
		public <Ctx2> [SourceWithContext](SourceWithContext.html "class in akka.stream.javadsl")<[Out](SourceWithContext.html "type parameter in SourceWithContext"),​Ctx2,​[Mat](SourceWithContext.html "type parameter in SourceWithContext")> mapContext​([Function](../../japi/function/Function.html "interface in akka.japi.function")<[Ctx](SourceWithContext.html "type parameter in SourceWithContext"),​Ctx2> extractContext)
		```
		
		Apply the given function to each context element (leaving the data elements unchanged).
		- #### sliding
		
		
		
		```
		public [SourceWithContext](SourceWithContext.html "class in akka.stream.javadsl")<java.util.List<[Out](SourceWithContext.html "type parameter in SourceWithContext")>,​java.util.List<[Ctx](SourceWithContext.html "type parameter in SourceWithContext")>,​[Mat](SourceWithContext.html "type parameter in SourceWithContext")> sliding​(int n,
		                                                                                          int step)
		```
		
		Context\-preserving variant of `akka.stream.javadsl.Source.sliding`.
		 
		 Each output group will be associated with a `Seq` of corresponding context elements.
		 
		
		
		
		See Also:
		`akka.stream.javadsl.Source.sliding`
		- #### sliding$default$2
		
		
		
		```
		public int sliding$default$2()
		```
		- #### log
		
		
		
		```
		public [SourceWithContext](SourceWithContext.html "class in akka.stream.javadsl")<[Out](SourceWithContext.html "type parameter in SourceWithContext"),​[Ctx](SourceWithContext.html "type parameter in SourceWithContext"),​[Mat](SourceWithContext.html "type parameter in SourceWithContext")> log​(java.lang.String name,
		                                                      [Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](SourceWithContext.html "type parameter in SourceWithContext"),​java.lang.Object> extract,
		                                                      [LoggingAdapter](../../event/LoggingAdapter.html "interface in akka.event") log)
		```
		
		Context\-preserving variant of `akka.stream.javadsl.Source.log`.
		 
		
		See Also:
		`akka.stream.javadsl.Source.log`
		- #### log
		
		
		
		```
		public [SourceWithContext](SourceWithContext.html "class in akka.stream.javadsl")<[Out](SourceWithContext.html "type parameter in SourceWithContext"),​[Ctx](SourceWithContext.html "type parameter in SourceWithContext"),​[Mat](SourceWithContext.html "type parameter in SourceWithContext")> log​(java.lang.String name,
		                                                      [Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](SourceWithContext.html "type parameter in SourceWithContext"),​java.lang.Object> extract)
		```
		
		Context\-preserving variant of `akka.stream.javadsl.Flow.log`.
		 
		
		See Also:
		`akka.stream.javadsl.Flow.log`
		- #### log
		
		
		
		```
		public [SourceWithContext](SourceWithContext.html "class in akka.stream.javadsl")<[Out](SourceWithContext.html "type parameter in SourceWithContext"),​[Ctx](SourceWithContext.html "type parameter in SourceWithContext"),​[Mat](SourceWithContext.html "type parameter in SourceWithContext")> log​(java.lang.String name,
		                                                      [LoggingAdapter](../../event/LoggingAdapter.html "interface in akka.event") log)
		```
		
		Context\-preserving variant of `akka.stream.javadsl.Flow.log`.
		 
		
		See Also:
		`akka.stream.javadsl.Flow.log`
		- #### log
		
		
		
		```
		public [SourceWithContext](SourceWithContext.html "class in akka.stream.javadsl")<[Out](SourceWithContext.html "type parameter in SourceWithContext"),​[Ctx](SourceWithContext.html "type parameter in SourceWithContext"),​[Mat](SourceWithContext.html "type parameter in SourceWithContext")> log​(java.lang.String name)
		```
		
		Context\-preserving variant of `akka.stream.javadsl.Flow.log`.
		 
		
		See Also:
		`akka.stream.javadsl.Flow.log`
		- #### logWithMarker
		
		
		
		```
		public [SourceWithContext](SourceWithContext.html "class in akka.stream.javadsl")<[Out](SourceWithContext.html "type parameter in SourceWithContext"),​[Ctx](SourceWithContext.html "type parameter in SourceWithContext"),​[Mat](SourceWithContext.html "type parameter in SourceWithContext")> logWithMarker​(java.lang.String name,
		                                                                [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<[Out](SourceWithContext.html "type parameter in SourceWithContext"),​[Ctx](SourceWithContext.html "type parameter in SourceWithContext"),​[LogMarker](../../event/LogMarker.html "class in akka.event")> marker,
		                                                                [Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](SourceWithContext.html "type parameter in SourceWithContext"),​java.lang.Object> extract,
		                                                                [MarkerLoggingAdapter](../../event/MarkerLoggingAdapter.html "class in akka.event") log)
		```
		
		Context\-preserving variant of `akka.stream.javadsl.Source.logWithMarker`.
		 
		
		See Also:
		`akka.stream.javadsl.Source.logWithMarker`
		- #### logWithMarker
		
		
		
		```
		public [SourceWithContext](SourceWithContext.html "class in akka.stream.javadsl")<[Out](SourceWithContext.html "type parameter in SourceWithContext"),​[Ctx](SourceWithContext.html "type parameter in SourceWithContext"),​[Mat](SourceWithContext.html "type parameter in SourceWithContext")> logWithMarker​(java.lang.String name,
		                                                                [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<[Out](SourceWithContext.html "type parameter in SourceWithContext"),​[Ctx](SourceWithContext.html "type parameter in SourceWithContext"),​[LogMarker](../../event/LogMarker.html "class in akka.event")> marker,
		                                                                [Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](SourceWithContext.html "type parameter in SourceWithContext"),​java.lang.Object> extract)
		```
		
		Context\-preserving variant of `akka.stream.javadsl.Flow.logWithMarker`.,
		 
		
		See Also:
		`akka.stream.javadsl.Flow.logWithMarker`
		- #### logWithMarker
		
		
		
		```
		public [SourceWithContext](SourceWithContext.html "class in akka.stream.javadsl")<[Out](SourceWithContext.html "type parameter in SourceWithContext"),​[Ctx](SourceWithContext.html "type parameter in SourceWithContext"),​[Mat](SourceWithContext.html "type parameter in SourceWithContext")> logWithMarker​(java.lang.String name,
		                                                                [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<[Out](SourceWithContext.html "type parameter in SourceWithContext"),​[Ctx](SourceWithContext.html "type parameter in SourceWithContext"),​[LogMarker](../../event/LogMarker.html "class in akka.event")> marker,
		                                                                [MarkerLoggingAdapter](../../event/MarkerLoggingAdapter.html "class in akka.event") log)
		```
		
		Context\-preserving variant of `akka.stream.javadsl.Flow.logWithMarker`.
		 
		
		See Also:
		`akka.stream.javadsl.Flow.logWithMarker`
		- #### logWithMarker
		
		
		
		```
		public [SourceWithContext](SourceWithContext.html "class in akka.stream.javadsl")<[Out](SourceWithContext.html "type parameter in SourceWithContext"),​[Ctx](SourceWithContext.html "type parameter in SourceWithContext"),​[Mat](SourceWithContext.html "type parameter in SourceWithContext")> logWithMarker​(java.lang.String name,
		                                                                [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<[Out](SourceWithContext.html "type parameter in SourceWithContext"),​[Ctx](SourceWithContext.html "type parameter in SourceWithContext"),​[LogMarker](../../event/LogMarker.html "class in akka.event")> marker)
		```
		
		Context\-preserving variant of `akka.stream.javadsl.Flow.logWithMarker`.
		 
		
		See Also:
		`akka.stream.javadsl.Flow.logWithMarker`
		- #### throttle
		
		
		
		```
		public [SourceWithContext](SourceWithContext.html "class in akka.stream.javadsl")<[Out](SourceWithContext.html "type parameter in SourceWithContext"),​[Ctx](SourceWithContext.html "type parameter in SourceWithContext"),​[Mat](SourceWithContext.html "type parameter in SourceWithContext")> throttle​(int elements,
		                                                           java.time.Duration per)
		```
		
		Context\-preserving variant of `akka.stream.javadsl.Source.throttle`.
		 
		
		See Also:
		`akka.stream.javadsl.Source.throttle`
		- #### throttle
		
		
		
		```
		public [SourceWithContext](SourceWithContext.html "class in akka.stream.javadsl")<[Out](SourceWithContext.html "type parameter in SourceWithContext"),​[Ctx](SourceWithContext.html "type parameter in SourceWithContext"),​[Mat](SourceWithContext.html "type parameter in SourceWithContext")> throttle​(int elements,
		                                                           java.time.Duration per,
		                                                           int maximumBurst,
		                                                           [ThrottleMode](../ThrottleMode.html "class in akka.stream") mode)
		```
		
		Context\-preserving variant of `akka.stream.javadsl.Source.throttle`.
		 
		
		See Also:
		`akka.stream.javadsl.Source.throttle`
		- #### throttle
		
		
		
		```
		public [SourceWithContext](SourceWithContext.html "class in akka.stream.javadsl")<[Out](SourceWithContext.html "type parameter in SourceWithContext"),​[Ctx](SourceWithContext.html "type parameter in SourceWithContext"),​[Mat](SourceWithContext.html "type parameter in SourceWithContext")> throttle​(int cost,
		                                                           java.time.Duration per,
		                                                           [Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](SourceWithContext.html "type parameter in SourceWithContext"),​java.lang.Integer> costCalculation)
		```
		
		Context\-preserving variant of `akka.stream.javadsl.Source.throttle`.
		 
		
		See Also:
		`akka.stream.javadsl.Source.throttle`
		- #### throttle
		
		
		
		```
		public [SourceWithContext](SourceWithContext.html "class in akka.stream.javadsl")<[Out](SourceWithContext.html "type parameter in SourceWithContext"),​[Ctx](SourceWithContext.html "type parameter in SourceWithContext"),​[Mat](SourceWithContext.html "type parameter in SourceWithContext")> throttle​(int cost,
		                                                           java.time.Duration per,
		                                                           int maximumBurst,
		                                                           [Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](SourceWithContext.html "type parameter in SourceWithContext"),​java.lang.Integer> costCalculation,
		                                                           [ThrottleMode](../ThrottleMode.html "class in akka.stream") mode)
		```
		
		Context\-preserving variant of `akka.stream.javadsl.Source.throttle`.
		 
		
		See Also:
		`akka.stream.javadsl.Source.throttle`
		- #### throttle
		
		
		
		```
		public [SourceWithContext](SourceWithContext.html "class in akka.stream.javadsl")<[Out](SourceWithContext.html "type parameter in SourceWithContext"),​[Ctx](SourceWithContext.html "type parameter in SourceWithContext"),​[Mat](SourceWithContext.html "type parameter in SourceWithContext")> throttle​([ThrottleControl](ThrottleControl.html "class in akka.stream.javadsl") control)
		```
		
		Context\-preserving variant of `akka.stream.javadsl.Source.throttle`.
		 
		
		See Also:
		`akka.stream.javadsl.Source.throttle`
		- #### throttle
		
		
		
		```
		public [SourceWithContext](SourceWithContext.html "class in akka.stream.javadsl")<[Out](SourceWithContext.html "type parameter in SourceWithContext"),​[Ctx](SourceWithContext.html "type parameter in SourceWithContext"),​[Mat](SourceWithContext.html "type parameter in SourceWithContext")> throttle​([ThrottleControl](ThrottleControl.html "class in akka.stream.javadsl") control,
		                                                           [Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](SourceWithContext.html "type parameter in SourceWithContext"),​java.lang.Integer> costCalculation)
		```
		
		Context\-preserving variant of `akka.stream.javadsl.Source.throttle`.
		 
		
		See Also:
		`akka.stream.javadsl.Source.throttle`
		- #### to
		
		
		
		```
		public <Mat2> [RunnableGraph](RunnableGraph.html "class in akka.stream.javadsl")<[Mat](SourceWithContext.html "type parameter in SourceWithContext")> to​([Graph](../Graph.html "interface in akka.stream")<[SinkShape](../SinkShape.html "class in akka.stream")<[Pair](../../japi/Pair.html "class in akka.japi")<[Out](SourceWithContext.html "type parameter in SourceWithContext"),​[Ctx](SourceWithContext.html "type parameter in SourceWithContext")>>,​Mat2> sink)
		```
		
		Connect this [`SourceWithContext`](SourceWithContext.html "class in akka.stream.javadsl") to a [`Sink`](Sink.html "class in akka.stream.javadsl"),
		 concatenating the processing steps of both.
		- #### toMat
		
		
		
		```
		public <Mat2,​Mat3> [RunnableGraph](RunnableGraph.html "class in akka.stream.javadsl")<Mat3> toMat​([Graph](../Graph.html "interface in akka.stream")<[SinkShape](../SinkShape.html "class in akka.stream")<[Pair](../../japi/Pair.html "class in akka.japi")<[Out](SourceWithContext.html "type parameter in SourceWithContext"),​[Ctx](SourceWithContext.html "type parameter in SourceWithContext")>>,​Mat2> sink,
		                                                   [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<[Mat](SourceWithContext.html "type parameter in SourceWithContext"),​Mat2,​Mat3> combine)
		```
		
		Connect this [`SourceWithContext`](SourceWithContext.html "class in akka.stream.javadsl") to a [`Sink`](Sink.html "class in akka.stream.javadsl"),
		 concatenating the processing steps of both.
		- #### runWith
		
		
		
		```
		public <M> M runWith​([Graph](../Graph.html "interface in akka.stream")<[SinkShape](../SinkShape.html "class in akka.stream")<[Pair](../../japi/Pair.html "class in akka.japi")<[Out](SourceWithContext.html "type parameter in SourceWithContext"),​[Ctx](SourceWithContext.html "type parameter in SourceWithContext")>>,​M> sink,
		                     [ClassicActorSystemProvider](../../actor/ClassicActorSystemProvider.html "interface in akka.actor") systemProvider)
		```
		
		Connect this [`SourceWithContext`](SourceWithContext.html "class in akka.stream.javadsl") to a [`Sink`](Sink.html "class in akka.stream.javadsl") and run it.
		 The returned value is the materialized value of the `Sink`.
		- #### runWith
		
		
		
		```
		public <M> M runWith​([Graph](../Graph.html "interface in akka.stream")<[SinkShape](../SinkShape.html "class in akka.stream")<[Pair](../../japi/Pair.html "class in akka.japi")<[Out](SourceWithContext.html "type parameter in SourceWithContext"),​[Ctx](SourceWithContext.html "type parameter in SourceWithContext")>>,​M> sink,
		                     [Materializer](../Materializer.html "class in akka.stream") materializer)
		```
		
		Connect this [`SourceWithContext`](SourceWithContext.html "class in akka.stream.javadsl") to a [`Sink`](Sink.html "class in akka.stream.javadsl") and run it.
		 The returned value is the materialized value of the `Sink`.
		 
		 Prefer the method taking an ActorSystem unless you have special requirements.
		- #### asScala
		
		
		
		```
		public [SourceWithContext](../scaladsl/SourceWithContext.html "class in akka.stream.scaladsl")<[Out](SourceWithContext.html "type parameter in SourceWithContext"),​[Ctx](SourceWithContext.html "type parameter in SourceWithContext"),​[Mat](SourceWithContext.html "type parameter in SourceWithContext")> asScala()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/2.10/akka/actor/ClassicActorSystemProvider.html
- https://doc.akka.io/japi/akka/2.10/akka/event/LogMarker.html
- https://doc.akka.io/japi/akka/2.10/akka/event/LoggingAdapter.html
- https://doc.akka.io/japi/akka/2.10/akka/event/MarkerLoggingAdapter.html
- https://doc.akka.io/japi/akka/2.10/akka/japi/Pair.html
- https://doc.akka.io/japi/akka/2.10/akka/japi/function/Function.html
- https://doc.akka.io/japi/akka/2.10/akka/japi/function/Function2.html
- https://doc.akka.io/japi/akka/2.10/akka/japi/function/Predicate.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/Attributes.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/FlowShape.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/Graph.GraphMapMatVal.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/Graph.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/Materializer.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/Shape.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/SinkShape.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/SourceShape.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/ThrottleMode.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/javadsl/RunnableGraph.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/javadsl/Sink.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/javadsl/Source.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/javadsl/SourceWithContext.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/javadsl/ThrottleControl.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/javadsl/package-summary.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/scaladsl/SourceWithContext.html

---
*Source: [https://doc.akka.io/japi/akka/2.10/akka/stream/javadsl/SourceWithContext.html](https://doc.akka.io/japi/akka/2.10/akka/stream/javadsl/SourceWithContext.html)*