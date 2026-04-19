---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:44:37Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/stream/javadsl/FlowWithContext.html
title: FlowWithContext
---

# FlowWithContext

## Content

Package [akka.stream.javadsl](package-summary.html)
## Class FlowWithContext\<In,​CtxIn,​Out,​CtxOut,​Mat\>

- java.lang.Object
- - akka.stream.GraphDelegate\<[FlowShape](../FlowShape.html "class in akka.stream")\<[Pair](../../japi/Pair.html "class in akka.japi")\<In,​CtxIn\>,​[Pair](../../japi/Pair.html "class in akka.japi")\<Out,​CtxOut\>\>,​Mat\>
	- - akka.stream.javadsl.FlowWithContext\<In,​CtxIn,​Out,​CtxOut,​Mat\>

- All Implemented Interfaces:
`[Graph](../Graph.html "interface in akka.stream")<[FlowShape](../FlowShape.html "class in akka.stream")<[Pair](../../japi/Pair.html "class in akka.japi")<In,​CtxIn>,​[Pair](../../japi/Pair.html "class in akka.japi")<Out,​CtxOut>>,​Mat>`

---

```
public final class FlowWithContext<In,​CtxIn,​Out,​CtxOut,​Mat>
extends akka.stream.GraphDelegate<[FlowShape](../FlowShape.html "class in akka.stream")<[Pair](../../japi/Pair.html "class in akka.japi")<In,​CtxIn>,​[Pair](../../japi/Pair.html "class in akka.japi")<Out,​CtxOut>>,​Mat>
```

A flow that provides operations which automatically propagate the context of an element.
 Only a subset of common operations from [`Flow`](Flow.html "class in akka.stream.javadsl") is supported. As an escape hatch you can
 use `FlowWithContext.via` to manually provide the context propagation for otherwise unsupported
 operations.
 
 An "empty" flow can be created by calling `FlowWithContext[Ctx, T]`.

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface akka.stream.[Graph](../Graph.html "interface in akka.stream")
		
		
		`[Graph.GraphMapMatVal](../Graph.GraphMapMatVal.html "class in akka.stream")<[S](../Graph.GraphMapMatVal.html "type parameter in Graph.GraphMapMatVal") extends [Shape](../Shape.html "class in akka.stream"),​[M](../Graph.GraphMapMatVal.html "type parameter in Graph.GraphMapMatVal")>`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[FlowWithContext](#%3Cinit%3E(akka.stream.javadsl.Flow))​([Flow](Flow.html "class in akka.stream.javadsl")<[Pair](../../japi/Pair.html "class in akka.japi")<[In](FlowWithContext.html "type parameter in FlowWithContext"),​[CtxIn](FlowWithContext.html "type parameter in FlowWithContext")>,​[Pair](../../japi/Pair.html "class in akka.japi")<[Out](FlowWithContext.html "type parameter in FlowWithContext"),​[CtxOut](FlowWithContext.html "type parameter in FlowWithContext")>,​[Mat](FlowWithContext.html "type parameter in FlowWithContext")> delegate)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[Flow](Flow.html "class in akka.stream.javadsl")<[Pair](../../japi/Pair.html "class in akka.japi")<[In](FlowWithContext.html "type parameter in FlowWithContext"),​[CtxIn](FlowWithContext.html "type parameter in FlowWithContext")>,​[Pair](../../japi/Pair.html "class in akka.japi")<[Out](FlowWithContext.html "type parameter in FlowWithContext"),​[CtxOut](FlowWithContext.html "type parameter in FlowWithContext")>,​[Mat](FlowWithContext.html "type parameter in FlowWithContext")>` | `[asFlow](#asFlow())()` | Creates a regular flow of pairs (data, context). |
	| `[FlowWithContext](../scaladsl/FlowWithContext.html "class in akka.stream.scaladsl")<[In](FlowWithContext.html "type parameter in FlowWithContext"),​[CtxIn](FlowWithContext.html "type parameter in FlowWithContext"),​[Out](FlowWithContext.html "type parameter in FlowWithContext"),​[CtxOut](FlowWithContext.html "type parameter in FlowWithContext"),​[Mat](FlowWithContext.html "type parameter in FlowWithContext")>` | `[asScala](#asScala())()` |  |
	| `<Out2> [FlowWithContext](FlowWithContext.html "class in akka.stream.javadsl")<[In](FlowWithContext.html "type parameter in FlowWithContext"),​[CtxIn](FlowWithContext.html "type parameter in FlowWithContext"),​Out2,​[CtxOut](FlowWithContext.html "type parameter in FlowWithContext"),​[Mat](FlowWithContext.html "type parameter in FlowWithContext")>` | `[collect](#collect(scala.PartialFunction))​(scala.PartialFunction<[Out](FlowWithContext.html "type parameter in FlowWithContext"),​Out2> pf)` | Context\-preserving variant of `akka.stream.javadsl.Flow.collect`. |
	| `static <In,​Ctx>[FlowWithContext](FlowWithContext.html "class in akka.stream.javadsl")<In,​Ctx,​In,​Ctx,​[NotUsed](../../NotUsed.html "class in akka")>` | `[create](#create())()` |  |
	| `[FlowWithContext](FlowWithContext.html "class in akka.stream.javadsl")<[In](FlowWithContext.html "type parameter in FlowWithContext"),​[CtxIn](FlowWithContext.html "type parameter in FlowWithContext"),​[Out](FlowWithContext.html "type parameter in FlowWithContext"),​[CtxOut](FlowWithContext.html "type parameter in FlowWithContext"),​[Mat](FlowWithContext.html "type parameter in FlowWithContext")>` | `[filter](#filter(akka.japi.function.Predicate))​([Predicate](../../japi/function/Predicate.html "interface in akka.japi.function")<[Out](FlowWithContext.html "type parameter in FlowWithContext")> p)` | Context\-preserving variant of `akka.stream.javadsl.Flow.filter`. |
	| `[FlowWithContext](FlowWithContext.html "class in akka.stream.javadsl")<[In](FlowWithContext.html "type parameter in FlowWithContext"),​[CtxIn](FlowWithContext.html "type parameter in FlowWithContext"),​[Out](FlowWithContext.html "type parameter in FlowWithContext"),​[CtxOut](FlowWithContext.html "type parameter in FlowWithContext"),​[Mat](FlowWithContext.html "type parameter in FlowWithContext")>` | `[filterNot](#filterNot(akka.japi.function.Predicate))​([Predicate](../../japi/function/Predicate.html "interface in akka.japi.function")<[Out](FlowWithContext.html "type parameter in FlowWithContext")> p)` | Context\-preserving variant of `akka.stream.javadsl.Flow.filterNot`. |
	| `static <In,​CtxIn,​Out,​CtxOut,​Mat>[FlowWithContext](FlowWithContext.html "class in akka.stream.javadsl")<In,​CtxIn,​Out,​CtxOut,​Mat>` | `[fromPairs](#fromPairs(akka.stream.javadsl.Flow))​([Flow](Flow.html "class in akka.stream.javadsl")<[Pair](../../japi/Pair.html "class in akka.japi")<In,​CtxIn>,​[Pair](../../japi/Pair.html "class in akka.japi")<Out,​CtxOut>,​Mat> under)` | Creates a FlowWithContext from a regular flow that operates on `Pair` elements. |
	| `[FlowWithContext](FlowWithContext.html "class in akka.stream.javadsl")<[In](FlowWithContext.html "type parameter in FlowWithContext"),​[CtxIn](FlowWithContext.html "type parameter in FlowWithContext"),​java.util.List<[Out](FlowWithContext.html "type parameter in FlowWithContext")>,​java.util.List<[CtxOut](FlowWithContext.html "type parameter in FlowWithContext")>,​[Mat](FlowWithContext.html "type parameter in FlowWithContext")>` | `[grouped](#grouped(int))​(int n)` | Context\-preserving variant of `akka.stream.javadsl.Flow.grouped`. |
	| `[FlowWithContext](FlowWithContext.html "class in akka.stream.javadsl")<[In](FlowWithContext.html "type parameter in FlowWithContext"),​[CtxIn](FlowWithContext.html "type parameter in FlowWithContext"),​[Out](FlowWithContext.html "type parameter in FlowWithContext"),​[CtxOut](FlowWithContext.html "type parameter in FlowWithContext"),​[Mat](FlowWithContext.html "type parameter in FlowWithContext")>` | `[log](#log(java.lang.String))​(java.lang.String name)` | Context\-preserving variant of `akka.stream.javadsl.Flow.log`. |
	| `[FlowWithContext](FlowWithContext.html "class in akka.stream.javadsl")<[In](FlowWithContext.html "type parameter in FlowWithContext"),​[CtxIn](FlowWithContext.html "type parameter in FlowWithContext"),​[Out](FlowWithContext.html "type parameter in FlowWithContext"),​[CtxOut](FlowWithContext.html "type parameter in FlowWithContext"),​[Mat](FlowWithContext.html "type parameter in FlowWithContext")>` | `[log](#log(java.lang.String,akka.event.LoggingAdapter))​(java.lang.String name,  [LoggingAdapter](../../event/LoggingAdapter.html "interface in akka.event") log)` | Context\-preserving variant of `akka.stream.javadsl.Flow.log`. |
	| `[FlowWithContext](FlowWithContext.html "class in akka.stream.javadsl")<[In](FlowWithContext.html "type parameter in FlowWithContext"),​[CtxIn](FlowWithContext.html "type parameter in FlowWithContext"),​[Out](FlowWithContext.html "type parameter in FlowWithContext"),​[CtxOut](FlowWithContext.html "type parameter in FlowWithContext"),​[Mat](FlowWithContext.html "type parameter in FlowWithContext")>` | `[log](#log(java.lang.String,akka.japi.function.Function))​(java.lang.String name,  [Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](FlowWithContext.html "type parameter in FlowWithContext"),​java.lang.Object> extract)` | Context\-preserving variant of `akka.stream.javadsl.Flow.log`. |
	| `[FlowWithContext](FlowWithContext.html "class in akka.stream.javadsl")<[In](FlowWithContext.html "type parameter in FlowWithContext"),​[CtxIn](FlowWithContext.html "type parameter in FlowWithContext"),​[Out](FlowWithContext.html "type parameter in FlowWithContext"),​[CtxOut](FlowWithContext.html "type parameter in FlowWithContext"),​[Mat](FlowWithContext.html "type parameter in FlowWithContext")>` | `[log](#log(java.lang.String,akka.japi.function.Function,akka.event.LoggingAdapter))​(java.lang.String name,  [Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](FlowWithContext.html "type parameter in FlowWithContext"),​java.lang.Object> extract,  [LoggingAdapter](../../event/LoggingAdapter.html "interface in akka.event") log)` | Context\-preserving variant of `akka.stream.javadsl.Flow.log`. |
	| `[FlowWithContext](FlowWithContext.html "class in akka.stream.javadsl")<[In](FlowWithContext.html "type parameter in FlowWithContext"),​[CtxIn](FlowWithContext.html "type parameter in FlowWithContext"),​[Out](FlowWithContext.html "type parameter in FlowWithContext"),​[CtxOut](FlowWithContext.html "type parameter in FlowWithContext"),​[Mat](FlowWithContext.html "type parameter in FlowWithContext")>` | `[logWithMarker](#logWithMarker(java.lang.String,akka.japi.function.Function2))​(java.lang.String name,  [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<[Out](FlowWithContext.html "type parameter in FlowWithContext"),​[CtxOut](FlowWithContext.html "type parameter in FlowWithContext"),​[LogMarker](../../event/LogMarker.html "class in akka.event")> marker)` | Context\-preserving variant of `akka.stream.javadsl.Flow.logWithMarker`. |
	| `[FlowWithContext](FlowWithContext.html "class in akka.stream.javadsl")<[In](FlowWithContext.html "type parameter in FlowWithContext"),​[CtxIn](FlowWithContext.html "type parameter in FlowWithContext"),​[Out](FlowWithContext.html "type parameter in FlowWithContext"),​[CtxOut](FlowWithContext.html "type parameter in FlowWithContext"),​[Mat](FlowWithContext.html "type parameter in FlowWithContext")>` | `[logWithMarker](#logWithMarker(java.lang.String,akka.japi.function.Function2,akka.event.MarkerLoggingAdapter))​(java.lang.String name,  [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<[Out](FlowWithContext.html "type parameter in FlowWithContext"),​[CtxOut](FlowWithContext.html "type parameter in FlowWithContext"),​[LogMarker](../../event/LogMarker.html "class in akka.event")> marker,  [MarkerLoggingAdapter](../../event/MarkerLoggingAdapter.html "class in akka.event") log)` | Context\-preserving variant of `akka.stream.javadsl.Flow.logWithMarker`. |
	| `[FlowWithContext](FlowWithContext.html "class in akka.stream.javadsl")<[In](FlowWithContext.html "type parameter in FlowWithContext"),​[CtxIn](FlowWithContext.html "type parameter in FlowWithContext"),​[Out](FlowWithContext.html "type parameter in FlowWithContext"),​[CtxOut](FlowWithContext.html "type parameter in FlowWithContext"),​[Mat](FlowWithContext.html "type parameter in FlowWithContext")>` | `[logWithMarker](#logWithMarker(java.lang.String,akka.japi.function.Function2,akka.japi.function.Function))​(java.lang.String name,  [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<[Out](FlowWithContext.html "type parameter in FlowWithContext"),​[CtxOut](FlowWithContext.html "type parameter in FlowWithContext"),​[LogMarker](../../event/LogMarker.html "class in akka.event")> marker,  [Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](FlowWithContext.html "type parameter in FlowWithContext"),​java.lang.Object> extract)` | Context\-preserving variant of `akka.stream.javadsl.Flow.logWithMarker`. |
	| `[FlowWithContext](FlowWithContext.html "class in akka.stream.javadsl")<[In](FlowWithContext.html "type parameter in FlowWithContext"),​[CtxIn](FlowWithContext.html "type parameter in FlowWithContext"),​[Out](FlowWithContext.html "type parameter in FlowWithContext"),​[CtxOut](FlowWithContext.html "type parameter in FlowWithContext"),​[Mat](FlowWithContext.html "type parameter in FlowWithContext")>` | `[logWithMarker](#logWithMarker(java.lang.String,akka.japi.function.Function2,akka.japi.function.Function,akka.event.MarkerLoggingAdapter))​(java.lang.String name,  [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<[Out](FlowWithContext.html "type parameter in FlowWithContext"),​[CtxOut](FlowWithContext.html "type parameter in FlowWithContext"),​[LogMarker](../../event/LogMarker.html "class in akka.event")> marker,  [Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](FlowWithContext.html "type parameter in FlowWithContext"),​java.lang.Object> extract,  [MarkerLoggingAdapter](../../event/MarkerLoggingAdapter.html "class in akka.event") log)` | Context\-preserving variant of `akka.stream.javadsl.Flow.logWithMarker`. |
	| `<Out2> [FlowWithContext](FlowWithContext.html "class in akka.stream.javadsl")<[In](FlowWithContext.html "type parameter in FlowWithContext"),​[CtxIn](FlowWithContext.html "type parameter in FlowWithContext"),​Out2,​[CtxOut](FlowWithContext.html "type parameter in FlowWithContext"),​[Mat](FlowWithContext.html "type parameter in FlowWithContext")>` | `[map](#map(akka.japi.function.Function))​([Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](FlowWithContext.html "type parameter in FlowWithContext"),​Out2> f)` | Context\-preserving variant of `akka.stream.javadsl.Flow.map`. |
	| `<Out2> [FlowWithContext](FlowWithContext.html "class in akka.stream.javadsl")<[In](FlowWithContext.html "type parameter in FlowWithContext"),​[CtxIn](FlowWithContext.html "type parameter in FlowWithContext"),​Out2,​[CtxOut](FlowWithContext.html "type parameter in FlowWithContext"),​[Mat](FlowWithContext.html "type parameter in FlowWithContext")>` | `[mapAsync](#mapAsync(int,akka.japi.function.Function))​(int parallelism,  [Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](FlowWithContext.html "type parameter in FlowWithContext"),​java.util.concurrent.CompletionStage<Out2>> f)` | Context\-preserving variant of `akka.stream.javadsl.Flow.mapAsync` |
	| `<Out2,​P>[FlowWithContext](FlowWithContext.html "class in akka.stream.javadsl")<[In](FlowWithContext.html "type parameter in FlowWithContext"),​[CtxIn](FlowWithContext.html "type parameter in FlowWithContext"),​Out2,​[CtxOut](FlowWithContext.html "type parameter in FlowWithContext"),​[Mat](FlowWithContext.html "type parameter in FlowWithContext")>` | `[mapAsyncPartitioned](#mapAsyncPartitioned(int,int,akka.japi.function.Function,java.util.function.BiFunction))​(int parallelism,  int perPartition,  [Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](FlowWithContext.html "type parameter in FlowWithContext"),​P> partitioner,  java.util.function.BiFunction<[Out](FlowWithContext.html "type parameter in FlowWithContext"),​P,​java.util.concurrent.CompletionStage<Out2>> f)` | Context\-preserving variant of `akka.stream.javadsl.Flow.mapAsyncPartitioned` |
	| `<Out2> [FlowWithContext](FlowWithContext.html "class in akka.stream.javadsl")<[In](FlowWithContext.html "type parameter in FlowWithContext"),​[CtxIn](FlowWithContext.html "type parameter in FlowWithContext"),​Out2,​[CtxOut](FlowWithContext.html "type parameter in FlowWithContext"),​[Mat](FlowWithContext.html "type parameter in FlowWithContext")>` | `[mapConcat](#mapConcat(akka.japi.function.Function))​([Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](FlowWithContext.html "type parameter in FlowWithContext"),​? extends java.lang.Iterable<Out2>> f)` | Context\-preserving variant of `akka.stream.javadsl.Flow.mapConcat`. |
	| `<CtxOut2> [FlowWithContext](FlowWithContext.html "class in akka.stream.javadsl")<[In](FlowWithContext.html "type parameter in FlowWithContext"),​[CtxIn](FlowWithContext.html "type parameter in FlowWithContext"),​[Out](FlowWithContext.html "type parameter in FlowWithContext"),​CtxOut2,​[Mat](FlowWithContext.html "type parameter in FlowWithContext")>` | `[mapContext](#mapContext(akka.japi.function.Function))​([Function](../../japi/function/Function.html "interface in akka.japi.function")<[CtxOut](FlowWithContext.html "type parameter in FlowWithContext"),​CtxOut2> extractContext)` | Apply the given function to each context element (leaving the data elements unchanged). |
	| `[FlowWithContext](FlowWithContext.html "class in akka.stream.javadsl")<[In](FlowWithContext.html "type parameter in FlowWithContext"),​[CtxIn](FlowWithContext.html "type parameter in FlowWithContext"),​[Out](FlowWithContext.html "type parameter in FlowWithContext"),​[CtxOut](FlowWithContext.html "type parameter in FlowWithContext"),​[Mat](FlowWithContext.html "type parameter in FlowWithContext")>` | `[mapError](#mapError(scala.PartialFunction))​(scala.PartialFunction<java.lang.Throwable,​java.lang.Throwable> pf)` | Context\-preserving variant of `akka.stream.javadsl.Flow.mapError`. |
	| `<Mat2> [FlowWithContext](FlowWithContext.html "class in akka.stream.javadsl")<[In](FlowWithContext.html "type parameter in FlowWithContext"),​[CtxIn](FlowWithContext.html "type parameter in FlowWithContext"),​[Out](FlowWithContext.html "type parameter in FlowWithContext"),​[CtxOut](FlowWithContext.html "type parameter in FlowWithContext"),​Mat2>` | `[mapMaterializedValue](#mapMaterializedValue(akka.japi.function.Function))​([Function](../../japi/function/Function.html "interface in akka.japi.function")<[Mat](FlowWithContext.html "type parameter in FlowWithContext"),​Mat2> f)` | Context\-preserving variant of `akka.stream.javadsl.Flow.mapMaterializedValue`. |
	| `[FlowWithContext](FlowWithContext.html "class in akka.stream.javadsl")<[In](FlowWithContext.html "type parameter in FlowWithContext"),​[CtxIn](FlowWithContext.html "type parameter in FlowWithContext"),​java.util.List<[Out](FlowWithContext.html "type parameter in FlowWithContext")>,​java.util.List<[CtxOut](FlowWithContext.html "type parameter in FlowWithContext")>,​[Mat](FlowWithContext.html "type parameter in FlowWithContext")>` | `[sliding](#sliding(int,int))​(int n,  int step)` | Context\-preserving variant of `akka.stream.javadsl.Flow.sliding`. |
	| `int` | `[sliding$default$2](#sliding$default$2())()` |  |
	| `[FlowWithContext](FlowWithContext.html "class in akka.stream.javadsl")<[In](FlowWithContext.html "type parameter in FlowWithContext"),​[CtxIn](FlowWithContext.html "type parameter in FlowWithContext"),​[Out](FlowWithContext.html "type parameter in FlowWithContext"),​[CtxOut](FlowWithContext.html "type parameter in FlowWithContext"),​[Mat](FlowWithContext.html "type parameter in FlowWithContext")>` | `[throttle](#throttle(int,java.time.Duration))​(int elements,  java.time.Duration per)` | Context\-preserving variant of `akka.stream.javadsl.Flow.throttle`. |
	| `[FlowWithContext](FlowWithContext.html "class in akka.stream.javadsl")<[In](FlowWithContext.html "type parameter in FlowWithContext"),​[CtxIn](FlowWithContext.html "type parameter in FlowWithContext"),​[Out](FlowWithContext.html "type parameter in FlowWithContext"),​[CtxOut](FlowWithContext.html "type parameter in FlowWithContext"),​[Mat](FlowWithContext.html "type parameter in FlowWithContext")>` | `[throttle](#throttle(int,java.time.Duration,int,akka.japi.function.Function,akka.stream.ThrottleMode))​(int cost,  java.time.Duration per,  int maximumBurst,  [Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](FlowWithContext.html "type parameter in FlowWithContext"),​java.lang.Integer> costCalculation,  [ThrottleMode](../ThrottleMode.html "class in akka.stream") mode)` | Context\-preserving variant of `akka.stream.javadsl.Flow.throttle`. |
	| `[FlowWithContext](FlowWithContext.html "class in akka.stream.javadsl")<[In](FlowWithContext.html "type parameter in FlowWithContext"),​[CtxIn](FlowWithContext.html "type parameter in FlowWithContext"),​[Out](FlowWithContext.html "type parameter in FlowWithContext"),​[CtxOut](FlowWithContext.html "type parameter in FlowWithContext"),​[Mat](FlowWithContext.html "type parameter in FlowWithContext")>` | `[throttle](#throttle(int,java.time.Duration,int,akka.stream.ThrottleMode))​(int elements,  java.time.Duration per,  int maximumBurst,  [ThrottleMode](../ThrottleMode.html "class in akka.stream") mode)` | Context\-preserving variant of `akka.stream.javadsl.Flow.throttle`. |
	| `[FlowWithContext](FlowWithContext.html "class in akka.stream.javadsl")<[In](FlowWithContext.html "type parameter in FlowWithContext"),​[CtxIn](FlowWithContext.html "type parameter in FlowWithContext"),​[Out](FlowWithContext.html "type parameter in FlowWithContext"),​[CtxOut](FlowWithContext.html "type parameter in FlowWithContext"),​[Mat](FlowWithContext.html "type parameter in FlowWithContext")>` | `[throttle](#throttle(int,java.time.Duration,akka.japi.function.Function))​(int cost,  java.time.Duration per,  [Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](FlowWithContext.html "type parameter in FlowWithContext"),​java.lang.Integer> costCalculation)` | Context\-preserving variant of `akka.stream.javadsl.Flow.throttle`. |
	| `[FlowWithContext](FlowWithContext.html "class in akka.stream.javadsl")<[In](FlowWithContext.html "type parameter in FlowWithContext"),​[CtxIn](FlowWithContext.html "type parameter in FlowWithContext"),​[Out](FlowWithContext.html "type parameter in FlowWithContext"),​[CtxOut](FlowWithContext.html "type parameter in FlowWithContext"),​[Mat](FlowWithContext.html "type parameter in FlowWithContext")>` | `[throttle](#throttle(akka.stream.javadsl.ThrottleControl))​([ThrottleControl](ThrottleControl.html "class in akka.stream.javadsl") control)` | Context\-preserving variant of `akka.stream.javadsl.Flow.throttle`. |
	| `[FlowWithContext](FlowWithContext.html "class in akka.stream.javadsl")<[In](FlowWithContext.html "type parameter in FlowWithContext"),​[CtxIn](FlowWithContext.html "type parameter in FlowWithContext"),​[Out](FlowWithContext.html "type parameter in FlowWithContext"),​[CtxOut](FlowWithContext.html "type parameter in FlowWithContext"),​[Mat](FlowWithContext.html "type parameter in FlowWithContext")>` | `[throttle](#throttle(akka.stream.javadsl.ThrottleControl,akka.japi.function.Function))​([ThrottleControl](ThrottleControl.html "class in akka.stream.javadsl") control,  [Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](FlowWithContext.html "type parameter in FlowWithContext"),​java.lang.Integer> costCalculation)` | Context\-preserving variant of `akka.stream.javadsl.Flow.throttle`. |
	| `<Out2,​Mat2>[FlowWithContext](FlowWithContext.html "class in akka.stream.javadsl")<[In](FlowWithContext.html "type parameter in FlowWithContext"),​[CtxIn](FlowWithContext.html "type parameter in FlowWithContext"),​Out2,​[CtxOut](FlowWithContext.html "type parameter in FlowWithContext"),​[Mat](FlowWithContext.html "type parameter in FlowWithContext")>` | `[unsafeDataVia](#unsafeDataVia(akka.stream.Graph))​([Graph](../Graph.html "interface in akka.stream")<[FlowShape](../FlowShape.html "class in akka.stream")<[Out](FlowWithContext.html "type parameter in FlowWithContext"),​Out2>,​Mat2> viaFlow)` | Transform this flow by the regular flow. |
	| `<Out2,​CtxOut2,​Mat2>[FlowWithContext](FlowWithContext.html "class in akka.stream.javadsl")<[In](FlowWithContext.html "type parameter in FlowWithContext"),​[CtxIn](FlowWithContext.html "type parameter in FlowWithContext"),​Out2,​CtxOut2,​[Mat](FlowWithContext.html "type parameter in FlowWithContext")>` | `[via](#via(akka.stream.Graph))​([Graph](../Graph.html "interface in akka.stream")<[FlowShape](../FlowShape.html "class in akka.stream")<[Pair](../../japi/Pair.html "class in akka.japi")<[Out](FlowWithContext.html "type parameter in FlowWithContext"),​[CtxOut](FlowWithContext.html "type parameter in FlowWithContext")>,​[Pair](../../japi/Pair.html "class in akka.japi")<Out2,​CtxOut2>>,​Mat2> viaFlow)` | Transform this flow by the regular flow. |
	| `[FlowWithContext](FlowWithContext.html "class in akka.stream.javadsl")<[In](FlowWithContext.html "type parameter in FlowWithContext"),​[CtxIn](FlowWithContext.html "type parameter in FlowWithContext"),​[Out](FlowWithContext.html "type parameter in FlowWithContext"),​[CtxOut](FlowWithContext.html "type parameter in FlowWithContext"),​[Mat](FlowWithContext.html "type parameter in FlowWithContext")>` | `[withAttributes](#withAttributes(akka.stream.Attributes))​([Attributes](../Attributes.html "class in akka.stream") attr)` | Context\-preserving variant of `akka.stream.javadsl.Flow.withAttributes`. |
	
	
		- ### Methods inherited from class akka.stream.GraphDelegate
		
		
		`addAttributes, async, async, async, getAttributes, named, shape, traversalBuilder`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### FlowWithContext
		
		
		
		```
		public FlowWithContext​([Flow](Flow.html "class in akka.stream.javadsl")<[Pair](../../japi/Pair.html "class in akka.japi")<[In](FlowWithContext.html "type parameter in FlowWithContext"),​[CtxIn](FlowWithContext.html "type parameter in FlowWithContext")>,​[Pair](../../japi/Pair.html "class in akka.japi")<[Out](FlowWithContext.html "type parameter in FlowWithContext"),​[CtxOut](FlowWithContext.html "type parameter in FlowWithContext")>,​[Mat](FlowWithContext.html "type parameter in FlowWithContext")> delegate)
		```

	- ### Method Detail
	
	
	
		- #### create
		
		
		
		```
		public static <In,​Ctx> [FlowWithContext](FlowWithContext.html "class in akka.stream.javadsl")<In,​Ctx,​In,​Ctx,​[NotUsed](../../NotUsed.html "class in akka")> create()
		```
		- #### fromPairs
		
		
		
		```
		public static <In,​CtxIn,​Out,​CtxOut,​Mat> [FlowWithContext](FlowWithContext.html "class in akka.stream.javadsl")<In,​CtxIn,​Out,​CtxOut,​Mat> fromPairs​([Flow](Flow.html "class in akka.stream.javadsl")<[Pair](../../japi/Pair.html "class in akka.japi")<In,​CtxIn>,​[Pair](../../japi/Pair.html "class in akka.japi")<Out,​CtxOut>,​Mat> under)
		```
		
		Creates a FlowWithContext from a regular flow that operates on `Pair` elements.
		- #### via
		
		
		
		```
		public <Out2,​CtxOut2,​Mat2> [FlowWithContext](FlowWithContext.html "class in akka.stream.javadsl")<[In](FlowWithContext.html "type parameter in FlowWithContext"),​[CtxIn](FlowWithContext.html "type parameter in FlowWithContext"),​Out2,​CtxOut2,​[Mat](FlowWithContext.html "type parameter in FlowWithContext")> via​([Graph](../Graph.html "interface in akka.stream")<[FlowShape](../FlowShape.html "class in akka.stream")<[Pair](../../japi/Pair.html "class in akka.japi")<[Out](FlowWithContext.html "type parameter in FlowWithContext"),​[CtxOut](FlowWithContext.html "type parameter in FlowWithContext")>,​[Pair](../../japi/Pair.html "class in akka.japi")<Out2,​CtxOut2>>,​Mat2> viaFlow)
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
		public <Out2,​Mat2> [FlowWithContext](FlowWithContext.html "class in akka.stream.javadsl")<[In](FlowWithContext.html "type parameter in FlowWithContext"),​[CtxIn](FlowWithContext.html "type parameter in FlowWithContext"),​Out2,​[CtxOut](FlowWithContext.html "type parameter in FlowWithContext"),​[Mat](FlowWithContext.html "type parameter in FlowWithContext")> unsafeDataVia​([Graph](../Graph.html "interface in akka.stream")<[FlowShape](../FlowShape.html "class in akka.stream")<[Out](FlowWithContext.html "type parameter in FlowWithContext"),​Out2>,​Mat2> viaFlow)
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
		public [FlowWithContext](FlowWithContext.html "class in akka.stream.javadsl")<[In](FlowWithContext.html "type parameter in FlowWithContext"),​[CtxIn](FlowWithContext.html "type parameter in FlowWithContext"),​[Out](FlowWithContext.html "type parameter in FlowWithContext"),​[CtxOut](FlowWithContext.html "type parameter in FlowWithContext"),​[Mat](FlowWithContext.html "type parameter in FlowWithContext")> withAttributes​([Attributes](../Attributes.html "class in akka.stream") attr)
		```
		
		Context\-preserving variant of `akka.stream.javadsl.Flow.withAttributes`.
		 
		
		See Also:
		`akka.stream.javadsl.Flow.withAttributes`
		- #### mapError
		
		
		
		```
		public [FlowWithContext](FlowWithContext.html "class in akka.stream.javadsl")<[In](FlowWithContext.html "type parameter in FlowWithContext"),​[CtxIn](FlowWithContext.html "type parameter in FlowWithContext"),​[Out](FlowWithContext.html "type parameter in FlowWithContext"),​[CtxOut](FlowWithContext.html "type parameter in FlowWithContext"),​[Mat](FlowWithContext.html "type parameter in FlowWithContext")> mapError​(scala.PartialFunction<java.lang.Throwable,​java.lang.Throwable> pf)
		```
		
		Context\-preserving variant of `akka.stream.javadsl.Flow.mapError`.
		 
		
		See Also:
		`akka.stream.javadsl.Flow.mapError`
		- #### mapMaterializedValue
		
		
		
		```
		public <Mat2> [FlowWithContext](FlowWithContext.html "class in akka.stream.javadsl")<[In](FlowWithContext.html "type parameter in FlowWithContext"),​[CtxIn](FlowWithContext.html "type parameter in FlowWithContext"),​[Out](FlowWithContext.html "type parameter in FlowWithContext"),​[CtxOut](FlowWithContext.html "type parameter in FlowWithContext"),​Mat2> mapMaterializedValue​([Function](../../japi/function/Function.html "interface in akka.japi.function")<[Mat](FlowWithContext.html "type parameter in FlowWithContext"),​Mat2> f)
		```
		
		Context\-preserving variant of `akka.stream.javadsl.Flow.mapMaterializedValue`.
		 
		
		See Also:
		`akka.stream.javadsl.Flow.mapMaterializedValue`
		- #### asFlow
		
		
		
		```
		public [Flow](Flow.html "class in akka.stream.javadsl")<[Pair](../../japi/Pair.html "class in akka.japi")<[In](FlowWithContext.html "type parameter in FlowWithContext"),​[CtxIn](FlowWithContext.html "type parameter in FlowWithContext")>,​[Pair](../../japi/Pair.html "class in akka.japi")<[Out](FlowWithContext.html "type parameter in FlowWithContext"),​[CtxOut](FlowWithContext.html "type parameter in FlowWithContext")>,​[Mat](FlowWithContext.html "type parameter in FlowWithContext")> asFlow()
		```
		
		Creates a regular flow of pairs (data, context).
		- #### collect
		
		
		
		```
		public <Out2> [FlowWithContext](FlowWithContext.html "class in akka.stream.javadsl")<[In](FlowWithContext.html "type parameter in FlowWithContext"),​[CtxIn](FlowWithContext.html "type parameter in FlowWithContext"),​Out2,​[CtxOut](FlowWithContext.html "type parameter in FlowWithContext"),​[Mat](FlowWithContext.html "type parameter in FlowWithContext")> collect​(scala.PartialFunction<[Out](FlowWithContext.html "type parameter in FlowWithContext"),​Out2> pf)
		```
		
		Context\-preserving variant of `akka.stream.javadsl.Flow.collect`.
		 
		 Note, that the context of elements that are filtered out is skipped as well.
		 
		
		
		
		See Also:
		`akka.stream.javadsl.Flow.collect`
		- #### filter
		
		
		
		```
		public [FlowWithContext](FlowWithContext.html "class in akka.stream.javadsl")<[In](FlowWithContext.html "type parameter in FlowWithContext"),​[CtxIn](FlowWithContext.html "type parameter in FlowWithContext"),​[Out](FlowWithContext.html "type parameter in FlowWithContext"),​[CtxOut](FlowWithContext.html "type parameter in FlowWithContext"),​[Mat](FlowWithContext.html "type parameter in FlowWithContext")> filter​([Predicate](../../japi/function/Predicate.html "interface in akka.japi.function")<[Out](FlowWithContext.html "type parameter in FlowWithContext")> p)
		```
		
		Context\-preserving variant of `akka.stream.javadsl.Flow.filter`.
		 
		 Note, that the context of elements that are filtered out is skipped as well.
		 
		
		
		
		See Also:
		`akka.stream.javadsl.Flow.filter`
		- #### filterNot
		
		
		
		```
		public [FlowWithContext](FlowWithContext.html "class in akka.stream.javadsl")<[In](FlowWithContext.html "type parameter in FlowWithContext"),​[CtxIn](FlowWithContext.html "type parameter in FlowWithContext"),​[Out](FlowWithContext.html "type parameter in FlowWithContext"),​[CtxOut](FlowWithContext.html "type parameter in FlowWithContext"),​[Mat](FlowWithContext.html "type parameter in FlowWithContext")> filterNot​([Predicate](../../japi/function/Predicate.html "interface in akka.japi.function")<[Out](FlowWithContext.html "type parameter in FlowWithContext")> p)
		```
		
		Context\-preserving variant of `akka.stream.javadsl.Flow.filterNot`.
		 
		 Note, that the context of elements that are filtered out is skipped as well.
		 
		
		
		
		See Also:
		`akka.stream.javadsl.Flow.filterNot`
		- #### grouped
		
		
		
		```
		public [FlowWithContext](FlowWithContext.html "class in akka.stream.javadsl")<[In](FlowWithContext.html "type parameter in FlowWithContext"),​[CtxIn](FlowWithContext.html "type parameter in FlowWithContext"),​java.util.List<[Out](FlowWithContext.html "type parameter in FlowWithContext")>,​java.util.List<[CtxOut](FlowWithContext.html "type parameter in FlowWithContext")>,​[Mat](FlowWithContext.html "type parameter in FlowWithContext")> grouped​(int n)
		```
		
		Context\-preserving variant of `akka.stream.javadsl.Flow.grouped`.
		 
		 Each output group will be associated with a `Seq` of corresponding context elements.
		 
		
		
		
		See Also:
		`akka.stream.javadsl.Flow.grouped`
		- #### map
		
		
		
		```
		public <Out2> [FlowWithContext](FlowWithContext.html "class in akka.stream.javadsl")<[In](FlowWithContext.html "type parameter in FlowWithContext"),​[CtxIn](FlowWithContext.html "type parameter in FlowWithContext"),​Out2,​[CtxOut](FlowWithContext.html "type parameter in FlowWithContext"),​[Mat](FlowWithContext.html "type parameter in FlowWithContext")> map​([Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](FlowWithContext.html "type parameter in FlowWithContext"),​Out2> f)
		```
		
		Context\-preserving variant of `akka.stream.javadsl.Flow.map`.
		 
		
		See Also:
		`akka.stream.javadsl.Flow.map`
		- #### mapAsync
		
		
		
		```
		public <Out2> [FlowWithContext](FlowWithContext.html "class in akka.stream.javadsl")<[In](FlowWithContext.html "type parameter in FlowWithContext"),​[CtxIn](FlowWithContext.html "type parameter in FlowWithContext"),​Out2,​[CtxOut](FlowWithContext.html "type parameter in FlowWithContext"),​[Mat](FlowWithContext.html "type parameter in FlowWithContext")> mapAsync​(int parallelism,
		                                                                                         [Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](FlowWithContext.html "type parameter in FlowWithContext"),​java.util.concurrent.CompletionStage<Out2>> f)
		```
		
		Context\-preserving variant of `akka.stream.javadsl.Flow.mapAsync`
		
		
		See Also:
		`akka.stream.javadsl.Flow.mapAsync`
		- #### mapAsyncPartitioned
		
		
		
		```
		public <Out2,​P> [FlowWithContext](FlowWithContext.html "class in akka.stream.javadsl")<[In](FlowWithContext.html "type parameter in FlowWithContext"),​[CtxIn](FlowWithContext.html "type parameter in FlowWithContext"),​Out2,​[CtxOut](FlowWithContext.html "type parameter in FlowWithContext"),​[Mat](FlowWithContext.html "type parameter in FlowWithContext")> mapAsyncPartitioned​(int parallelism,
		                                                                                                            int perPartition,
		                                                                                                            [Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](FlowWithContext.html "type parameter in FlowWithContext"),​P> partitioner,
		                                                                                                            java.util.function.BiFunction<[Out](FlowWithContext.html "type parameter in FlowWithContext"),​P,​java.util.concurrent.CompletionStage<Out2>> f)
		```
		
		Context\-preserving variant of `akka.stream.javadsl.Flow.mapAsyncPartitioned`
		
		
		See Also:
		`akka.stream.javadsl.Flow.mapAsyncPartitioned`
		- #### mapConcat
		
		
		
		```
		public <Out2> [FlowWithContext](FlowWithContext.html "class in akka.stream.javadsl")<[In](FlowWithContext.html "type parameter in FlowWithContext"),​[CtxIn](FlowWithContext.html "type parameter in FlowWithContext"),​Out2,​[CtxOut](FlowWithContext.html "type parameter in FlowWithContext"),​[Mat](FlowWithContext.html "type parameter in FlowWithContext")> mapConcat​([Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](FlowWithContext.html "type parameter in FlowWithContext"),​? extends java.lang.Iterable<Out2>> f)
		```
		
		Context\-preserving variant of `akka.stream.javadsl.Flow.mapConcat`.
		 
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
		`akka.stream.javadsl.Flow.mapConcat`
		- #### mapContext
		
		
		
		```
		public <CtxOut2> [FlowWithContext](FlowWithContext.html "class in akka.stream.javadsl")<[In](FlowWithContext.html "type parameter in FlowWithContext"),​[CtxIn](FlowWithContext.html "type parameter in FlowWithContext"),​[Out](FlowWithContext.html "type parameter in FlowWithContext"),​CtxOut2,​[Mat](FlowWithContext.html "type parameter in FlowWithContext")> mapContext​([Function](../../japi/function/Function.html "interface in akka.japi.function")<[CtxOut](FlowWithContext.html "type parameter in FlowWithContext"),​CtxOut2> extractContext)
		```
		
		Apply the given function to each context element (leaving the data elements unchanged).
		- #### sliding
		
		
		
		```
		public [FlowWithContext](FlowWithContext.html "class in akka.stream.javadsl")<[In](FlowWithContext.html "type parameter in FlowWithContext"),​[CtxIn](FlowWithContext.html "type parameter in FlowWithContext"),​java.util.List<[Out](FlowWithContext.html "type parameter in FlowWithContext")>,​java.util.List<[CtxOut](FlowWithContext.html "type parameter in FlowWithContext")>,​[Mat](FlowWithContext.html "type parameter in FlowWithContext")> sliding​(int n,
		                                                                                                                int step)
		```
		
		Context\-preserving variant of `akka.stream.javadsl.Flow.sliding`.
		 
		 Each output group will be associated with a `Seq` of corresponding context elements.
		 
		
		
		
		See Also:
		`akka.stream.javadsl.Flow.sliding`
		- #### sliding$default$2
		
		
		
		```
		public int sliding$default$2()
		```
		- #### log
		
		
		
		```
		public [FlowWithContext](FlowWithContext.html "class in akka.stream.javadsl")<[In](FlowWithContext.html "type parameter in FlowWithContext"),​[CtxIn](FlowWithContext.html "type parameter in FlowWithContext"),​[Out](FlowWithContext.html "type parameter in FlowWithContext"),​[CtxOut](FlowWithContext.html "type parameter in FlowWithContext"),​[Mat](FlowWithContext.html "type parameter in FlowWithContext")> log​(java.lang.String name,
		                                                                            [Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](FlowWithContext.html "type parameter in FlowWithContext"),​java.lang.Object> extract,
		                                                                            [LoggingAdapter](../../event/LoggingAdapter.html "interface in akka.event") log)
		```
		
		Context\-preserving variant of `akka.stream.javadsl.Flow.log`.
		 
		
		See Also:
		`akka.stream.javadsl.Flow.log`
		- #### log
		
		
		
		```
		public [FlowWithContext](FlowWithContext.html "class in akka.stream.javadsl")<[In](FlowWithContext.html "type parameter in FlowWithContext"),​[CtxIn](FlowWithContext.html "type parameter in FlowWithContext"),​[Out](FlowWithContext.html "type parameter in FlowWithContext"),​[CtxOut](FlowWithContext.html "type parameter in FlowWithContext"),​[Mat](FlowWithContext.html "type parameter in FlowWithContext")> log​(java.lang.String name,
		                                                                            [Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](FlowWithContext.html "type parameter in FlowWithContext"),​java.lang.Object> extract)
		```
		
		Context\-preserving variant of `akka.stream.javadsl.Flow.log`.
		 
		
		See Also:
		`akka.stream.javadsl.Flow.log`
		- #### log
		
		
		
		```
		public [FlowWithContext](FlowWithContext.html "class in akka.stream.javadsl")<[In](FlowWithContext.html "type parameter in FlowWithContext"),​[CtxIn](FlowWithContext.html "type parameter in FlowWithContext"),​[Out](FlowWithContext.html "type parameter in FlowWithContext"),​[CtxOut](FlowWithContext.html "type parameter in FlowWithContext"),​[Mat](FlowWithContext.html "type parameter in FlowWithContext")> log​(java.lang.String name,
		                                                                            [LoggingAdapter](../../event/LoggingAdapter.html "interface in akka.event") log)
		```
		
		Context\-preserving variant of `akka.stream.javadsl.Flow.log`.
		 
		
		See Also:
		`akka.stream.javadsl.Flow.log`
		- #### log
		
		
		
		```
		public [FlowWithContext](FlowWithContext.html "class in akka.stream.javadsl")<[In](FlowWithContext.html "type parameter in FlowWithContext"),​[CtxIn](FlowWithContext.html "type parameter in FlowWithContext"),​[Out](FlowWithContext.html "type parameter in FlowWithContext"),​[CtxOut](FlowWithContext.html "type parameter in FlowWithContext"),​[Mat](FlowWithContext.html "type parameter in FlowWithContext")> log​(java.lang.String name)
		```
		
		Context\-preserving variant of `akka.stream.javadsl.Flow.log`.
		 
		
		See Also:
		`akka.stream.javadsl.Flow.log`
		- #### logWithMarker
		
		
		
		```
		public [FlowWithContext](FlowWithContext.html "class in akka.stream.javadsl")<[In](FlowWithContext.html "type parameter in FlowWithContext"),​[CtxIn](FlowWithContext.html "type parameter in FlowWithContext"),​[Out](FlowWithContext.html "type parameter in FlowWithContext"),​[CtxOut](FlowWithContext.html "type parameter in FlowWithContext"),​[Mat](FlowWithContext.html "type parameter in FlowWithContext")> logWithMarker​(java.lang.String name,
		                                                                                      [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<[Out](FlowWithContext.html "type parameter in FlowWithContext"),​[CtxOut](FlowWithContext.html "type parameter in FlowWithContext"),​[LogMarker](../../event/LogMarker.html "class in akka.event")> marker,
		                                                                                      [Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](FlowWithContext.html "type parameter in FlowWithContext"),​java.lang.Object> extract,
		                                                                                      [MarkerLoggingAdapter](../../event/MarkerLoggingAdapter.html "class in akka.event") log)
		```
		
		Context\-preserving variant of `akka.stream.javadsl.Flow.logWithMarker`.
		 
		
		See Also:
		`akka.stream.javadsl.Flow.logWithMarker`
		- #### logWithMarker
		
		
		
		```
		public [FlowWithContext](FlowWithContext.html "class in akka.stream.javadsl")<[In](FlowWithContext.html "type parameter in FlowWithContext"),​[CtxIn](FlowWithContext.html "type parameter in FlowWithContext"),​[Out](FlowWithContext.html "type parameter in FlowWithContext"),​[CtxOut](FlowWithContext.html "type parameter in FlowWithContext"),​[Mat](FlowWithContext.html "type parameter in FlowWithContext")> logWithMarker​(java.lang.String name,
		                                                                                      [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<[Out](FlowWithContext.html "type parameter in FlowWithContext"),​[CtxOut](FlowWithContext.html "type parameter in FlowWithContext"),​[LogMarker](../../event/LogMarker.html "class in akka.event")> marker,
		                                                                                      [Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](FlowWithContext.html "type parameter in FlowWithContext"),​java.lang.Object> extract)
		```
		
		Context\-preserving variant of `akka.stream.javadsl.Flow.logWithMarker`.
		 
		
		See Also:
		`akka.stream.javadsl.Flow.logWithMarker`
		- #### logWithMarker
		
		
		
		```
		public [FlowWithContext](FlowWithContext.html "class in akka.stream.javadsl")<[In](FlowWithContext.html "type parameter in FlowWithContext"),​[CtxIn](FlowWithContext.html "type parameter in FlowWithContext"),​[Out](FlowWithContext.html "type parameter in FlowWithContext"),​[CtxOut](FlowWithContext.html "type parameter in FlowWithContext"),​[Mat](FlowWithContext.html "type parameter in FlowWithContext")> logWithMarker​(java.lang.String name,
		                                                                                      [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<[Out](FlowWithContext.html "type parameter in FlowWithContext"),​[CtxOut](FlowWithContext.html "type parameter in FlowWithContext"),​[LogMarker](../../event/LogMarker.html "class in akka.event")> marker,
		                                                                                      [MarkerLoggingAdapter](../../event/MarkerLoggingAdapter.html "class in akka.event") log)
		```
		
		Context\-preserving variant of `akka.stream.javadsl.Flow.logWithMarker`.
		 
		
		See Also:
		`akka.stream.javadsl.Flow.logWithMarker`
		- #### logWithMarker
		
		
		
		```
		public [FlowWithContext](FlowWithContext.html "class in akka.stream.javadsl")<[In](FlowWithContext.html "type parameter in FlowWithContext"),​[CtxIn](FlowWithContext.html "type parameter in FlowWithContext"),​[Out](FlowWithContext.html "type parameter in FlowWithContext"),​[CtxOut](FlowWithContext.html "type parameter in FlowWithContext"),​[Mat](FlowWithContext.html "type parameter in FlowWithContext")> logWithMarker​(java.lang.String name,
		                                                                                      [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<[Out](FlowWithContext.html "type parameter in FlowWithContext"),​[CtxOut](FlowWithContext.html "type parameter in FlowWithContext"),​[LogMarker](../../event/LogMarker.html "class in akka.event")> marker)
		```
		
		Context\-preserving variant of `akka.stream.javadsl.Flow.logWithMarker`.
		 
		
		See Also:
		`akka.stream.javadsl.Flow.logWithMarker`
		- #### throttle
		
		
		
		```
		public [FlowWithContext](FlowWithContext.html "class in akka.stream.javadsl")<[In](FlowWithContext.html "type parameter in FlowWithContext"),​[CtxIn](FlowWithContext.html "type parameter in FlowWithContext"),​[Out](FlowWithContext.html "type parameter in FlowWithContext"),​[CtxOut](FlowWithContext.html "type parameter in FlowWithContext"),​[Mat](FlowWithContext.html "type parameter in FlowWithContext")> throttle​(int elements,
		                                                                                 java.time.Duration per)
		```
		
		Context\-preserving variant of `akka.stream.javadsl.Flow.throttle`.
		 
		
		See Also:
		`akka.stream.javadsl.Flow.throttle`
		- #### throttle
		
		
		
		```
		public [FlowWithContext](FlowWithContext.html "class in akka.stream.javadsl")<[In](FlowWithContext.html "type parameter in FlowWithContext"),​[CtxIn](FlowWithContext.html "type parameter in FlowWithContext"),​[Out](FlowWithContext.html "type parameter in FlowWithContext"),​[CtxOut](FlowWithContext.html "type parameter in FlowWithContext"),​[Mat](FlowWithContext.html "type parameter in FlowWithContext")> throttle​(int elements,
		                                                                                 java.time.Duration per,
		                                                                                 int maximumBurst,
		                                                                                 [ThrottleMode](../ThrottleMode.html "class in akka.stream") mode)
		```
		
		Context\-preserving variant of `akka.stream.javadsl.Flow.throttle`.
		 
		
		See Also:
		`akka.stream.javadsl.Flow.throttle`
		- #### throttle
		
		
		
		```
		public [FlowWithContext](FlowWithContext.html "class in akka.stream.javadsl")<[In](FlowWithContext.html "type parameter in FlowWithContext"),​[CtxIn](FlowWithContext.html "type parameter in FlowWithContext"),​[Out](FlowWithContext.html "type parameter in FlowWithContext"),​[CtxOut](FlowWithContext.html "type parameter in FlowWithContext"),​[Mat](FlowWithContext.html "type parameter in FlowWithContext")> throttle​(int cost,
		                                                                                 java.time.Duration per,
		                                                                                 [Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](FlowWithContext.html "type parameter in FlowWithContext"),​java.lang.Integer> costCalculation)
		```
		
		Context\-preserving variant of `akka.stream.javadsl.Flow.throttle`.
		 
		
		See Also:
		`akka.stream.javadsl.Flow.throttle`
		- #### throttle
		
		
		
		```
		public [FlowWithContext](FlowWithContext.html "class in akka.stream.javadsl")<[In](FlowWithContext.html "type parameter in FlowWithContext"),​[CtxIn](FlowWithContext.html "type parameter in FlowWithContext"),​[Out](FlowWithContext.html "type parameter in FlowWithContext"),​[CtxOut](FlowWithContext.html "type parameter in FlowWithContext"),​[Mat](FlowWithContext.html "type parameter in FlowWithContext")> throttle​(int cost,
		                                                                                 java.time.Duration per,
		                                                                                 int maximumBurst,
		                                                                                 [Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](FlowWithContext.html "type parameter in FlowWithContext"),​java.lang.Integer> costCalculation,
		                                                                                 [ThrottleMode](../ThrottleMode.html "class in akka.stream") mode)
		```
		
		Context\-preserving variant of `akka.stream.javadsl.Flow.throttle`.
		 
		
		See Also:
		`akka.stream.javadsl.Flow.throttle`
		- #### throttle
		
		
		
		```
		public [FlowWithContext](FlowWithContext.html "class in akka.stream.javadsl")<[In](FlowWithContext.html "type parameter in FlowWithContext"),​[CtxIn](FlowWithContext.html "type parameter in FlowWithContext"),​[Out](FlowWithContext.html "type parameter in FlowWithContext"),​[CtxOut](FlowWithContext.html "type parameter in FlowWithContext"),​[Mat](FlowWithContext.html "type parameter in FlowWithContext")> throttle​([ThrottleControl](ThrottleControl.html "class in akka.stream.javadsl") control)
		```
		
		Context\-preserving variant of `akka.stream.javadsl.Flow.throttle`.
		 
		
		See Also:
		`akka.stream.javadsl.Flow.throttle`
		- #### throttle
		
		
		
		```
		public [FlowWithContext](FlowWithContext.html "class in akka.stream.javadsl")<[In](FlowWithContext.html "type parameter in FlowWithContext"),​[CtxIn](FlowWithContext.html "type parameter in FlowWithContext"),​[Out](FlowWithContext.html "type parameter in FlowWithContext"),​[CtxOut](FlowWithContext.html "type parameter in FlowWithContext"),​[Mat](FlowWithContext.html "type parameter in FlowWithContext")> throttle​([ThrottleControl](ThrottleControl.html "class in akka.stream.javadsl") control,
		                                                                                 [Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](FlowWithContext.html "type parameter in FlowWithContext"),​java.lang.Integer> costCalculation)
		```
		
		Context\-preserving variant of `akka.stream.javadsl.Flow.throttle`.
		 
		
		See Also:
		`akka.stream.javadsl.Flow.throttle`
		- #### asScala
		
		
		
		```
		public [FlowWithContext](../scaladsl/FlowWithContext.html "class in akka.stream.scaladsl")<[In](FlowWithContext.html "type parameter in FlowWithContext"),​[CtxIn](FlowWithContext.html "type parameter in FlowWithContext"),​[Out](FlowWithContext.html "type parameter in FlowWithContext"),​[CtxOut](FlowWithContext.html "type parameter in FlowWithContext"),​[Mat](FlowWithContext.html "type parameter in FlowWithContext")> asScala()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/NotUsed.html
- https://doc.akka.io/japi/akka/current/akka/event/LogMarker.html
- https://doc.akka.io/japi/akka/current/akka/event/LoggingAdapter.html
- https://doc.akka.io/japi/akka/current/akka/event/MarkerLoggingAdapter.html
- https://doc.akka.io/japi/akka/current/akka/japi/Pair.html
- https://doc.akka.io/japi/akka/current/akka/japi/function/Function.html
- https://doc.akka.io/japi/akka/current/akka/japi/function/Function2.html
- https://doc.akka.io/japi/akka/current/akka/japi/function/Predicate.html
- https://doc.akka.io/japi/akka/current/akka/stream/Attributes.html
- https://doc.akka.io/japi/akka/current/akka/stream/FlowShape.html
- https://doc.akka.io/japi/akka/current/akka/stream/Graph.GraphMapMatVal.html
- https://doc.akka.io/japi/akka/current/akka/stream/Graph.html
- https://doc.akka.io/japi/akka/current/akka/stream/Shape.html
- https://doc.akka.io/japi/akka/current/akka/stream/ThrottleMode.html
- https://doc.akka.io/japi/akka/current/akka/stream/javadsl/Flow.html
- https://doc.akka.io/japi/akka/current/akka/stream/javadsl/FlowWithContext.html
- https://doc.akka.io/japi/akka/current/akka/stream/javadsl/ThrottleControl.html
- https://doc.akka.io/japi/akka/current/akka/stream/javadsl/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/FlowWithContext.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/stream/javadsl/FlowWithContext.html](https://doc.akka.io/japi/akka/current/akka/stream/javadsl/FlowWithContext.html)*