---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:40:49Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/FlowWithContextOps.html
title: FlowWithContextOps
---

# FlowWithContextOps

## Content

Package [akka.stream.scaladsl](package-summary.html)
## Interface FlowWithContextOps\<Out,​Ctx,​Mat\>

- All Known Implementing Classes:
`[FlowWithContext](FlowWithContext.html "class in akka.stream.scaladsl")`, `[SourceWithContext](SourceWithContext.html "class in akka.stream.scaladsl")`

---

```
public interface FlowWithContextOps<Out,​Ctx,​Mat>
```

Shared stream operations for [`FlowWithContext`](FlowWithContext.html "class in akka.stream.scaladsl") and [`SourceWithContext`](SourceWithContext.html "class in akka.stream.scaladsl") that automatically propagate a context
 element with each data element.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `<Out2> [FlowWithContextOps](FlowWithContextOps.html "interface in akka.stream.scaladsl")` | `[collect](#collect(scala.PartialFunction))​(scala.PartialFunction<[Out](FlowWithContextOps.html "type parameter in FlowWithContextOps"),​Out2> f)` | Context\-preserving variant of `akka.stream.scaladsl.FlowOps.collect`. |
	| `[FlowWithContextOps](FlowWithContextOps.html "interface in akka.stream.scaladsl")` | `[filter](#filter(scala.Function1))​(scala.Function1<[Out](FlowWithContextOps.html "type parameter in FlowWithContextOps"),​java.lang.Object> pred)` | Context\-preserving variant of `akka.stream.scaladsl.FlowOps.filter`. |
	| `[FlowWithContextOps](FlowWithContextOps.html "interface in akka.stream.scaladsl")` | `[filterNot](#filterNot(scala.Function1))​(scala.Function1<[Out](FlowWithContextOps.html "type parameter in FlowWithContextOps"),​java.lang.Object> pred)` | Context\-preserving variant of `akka.stream.scaladsl.FlowOps.filterNot`. |
	| `<T,​C>[Flow](Flow.html "class in akka.stream.scaladsl")<scala.Tuple2<T,​C>,​scala.Tuple2<T,​C>,​[NotUsed](../../NotUsed.html "class in akka")>` | `[flow](#flow())()` |  |
	| `[FlowWithContextOps](FlowWithContextOps.html "interface in akka.stream.scaladsl")` | `[grouped](#grouped(int))​(int n)` | Context\-preserving variant of `akka.stream.scaladsl.FlowOps.grouped`. |
	| `[FlowWithContextOps](FlowWithContextOps.html "interface in akka.stream.scaladsl")` | `[log](#log(java.lang.String,scala.Function1,akka.event.LoggingAdapter))​(java.lang.String name,  scala.Function1<[Out](FlowWithContextOps.html "type parameter in FlowWithContextOps"),​java.lang.Object> extract,  [LoggingAdapter](../../event/LoggingAdapter.html "interface in akka.event") log)` | Context\-preserving variant of `akka.stream.scaladsl.FlowOps.log`. |
	| `scala.Function1<[Out](FlowWithContextOps.html "type parameter in FlowWithContextOps"),​java.lang.Object>` | `[log$default$2](#log$default$2())()` |  |
	| `[LoggingAdapter](../../event/LoggingAdapter.html "interface in akka.event")` | `[log$default$3](#log$default$3(java.lang.String,scala.Function1))​(java.lang.String name,  scala.Function1<[Out](FlowWithContextOps.html "type parameter in FlowWithContextOps"),​java.lang.Object> extract)` |  |
	| `[FlowWithContextOps](FlowWithContextOps.html "interface in akka.stream.scaladsl")` | `[logWithMarker](#logWithMarker(java.lang.String,scala.Function2,scala.Function1,akka.event.MarkerLoggingAdapter))​(java.lang.String name,  scala.Function2<[Out](FlowWithContextOps.html "type parameter in FlowWithContextOps"),​[Ctx](FlowWithContextOps.html "type parameter in FlowWithContextOps"),​[LogMarker](../../event/LogMarker.html "class in akka.event")> marker,  scala.Function1<[Out](FlowWithContextOps.html "type parameter in FlowWithContextOps"),​java.lang.Object> extract,  [MarkerLoggingAdapter](../../event/MarkerLoggingAdapter.html "class in akka.event") log)` | Context\-preserving variant of `akka.stream.scaladsl.FlowOps.logWithMarker`. |
	| `scala.Function1<[Out](FlowWithContextOps.html "type parameter in FlowWithContextOps"),​java.lang.Object>` | `[logWithMarker$default$3](#logWithMarker$default$3())()` |  |
	| `[MarkerLoggingAdapter](../../event/MarkerLoggingAdapter.html "class in akka.event")` | `[logWithMarker$default$4](#logWithMarker$default$4(java.lang.String,scala.Function2,scala.Function1))​(java.lang.String name,  scala.Function2<[Out](FlowWithContextOps.html "type parameter in FlowWithContextOps"),​[Ctx](FlowWithContextOps.html "type parameter in FlowWithContextOps"),​[LogMarker](../../event/LogMarker.html "class in akka.event")> marker,  scala.Function1<[Out](FlowWithContextOps.html "type parameter in FlowWithContextOps"),​java.lang.Object> extract)` |  |
	| `<Out2> [FlowWithContextOps](FlowWithContextOps.html "interface in akka.stream.scaladsl")` | `[map](#map(scala.Function1))​(scala.Function1<[Out](FlowWithContextOps.html "type parameter in FlowWithContextOps"),​Out2> f)` | Context\-preserving variant of `akka.stream.scaladsl.FlowOps.map`. |
	| `<Out2> [FlowWithContextOps](FlowWithContextOps.html "interface in akka.stream.scaladsl")` | `[mapAsync](#mapAsync(int,scala.Function1))​(int parallelism,  scala.Function1<[Out](FlowWithContextOps.html "type parameter in FlowWithContextOps"),​scala.concurrent.Future<Out2>> f)` | Context\-preserving variant of `akka.stream.scaladsl.FlowOps.mapAsync`. |
	| `<Out2,​P>[FlowWithContextOps](FlowWithContextOps.html "interface in akka.stream.scaladsl")` | `[mapAsyncPartitioned](#mapAsyncPartitioned(int,int,scala.Function1,scala.Function2))​(int parallelism,  int perPartition,  scala.Function1<[Out](FlowWithContextOps.html "type parameter in FlowWithContextOps"),​P> partitioner,  scala.Function2<[Out](FlowWithContextOps.html "type parameter in FlowWithContextOps"),​P,​scala.concurrent.Future<Out2>> f)` | Context\-preserving variant of `akka.stream.scaladsl.FlowOps.mapAsyncPartitioned`. |
	| `<Out2> [FlowWithContextOps](FlowWithContextOps.html "interface in akka.stream.scaladsl")` | `[mapConcat](#mapConcat(scala.Function1))​(scala.Function1<[Out](FlowWithContextOps.html "type parameter in FlowWithContextOps"),​scala.collection.IterableOnce<Out2>> f)` | Context\-preserving variant of `akka.stream.scaladsl.FlowOps.mapConcat`. |
	| `<Ctx2> [FlowWithContextOps](FlowWithContextOps.html "interface in akka.stream.scaladsl")` | `[mapContext](#mapContext(scala.Function1))​(scala.Function1<[Ctx](FlowWithContextOps.html "type parameter in FlowWithContextOps"),​Ctx2> f)` | Apply the given function to each context element (leaving the data elements unchanged). |
	| `[FlowWithContextOps](FlowWithContextOps.html "interface in akka.stream.scaladsl")` | `[mapError](#mapError(scala.PartialFunction))​(scala.PartialFunction<java.lang.Throwable,​java.lang.Throwable> pf)` | Context\-preserving variant of `akka.stream.scaladsl.FlowOps.mapError`. |
	| `[FlowWithContextOps](FlowWithContextOps.html "interface in akka.stream.scaladsl")` | `[sliding](#sliding(int,int))​(int n,  int step)` | Context\-preserving variant of `akka.stream.scaladsl.FlowOps.sliding`. |
	| `int` | `[sliding$default$2](#sliding$default$2())()` |  |
	| `[FlowWithContextOps](FlowWithContextOps.html "interface in akka.stream.scaladsl")` | `[throttle](#throttle(int,scala.concurrent.duration.FiniteDuration))​(int elements,  scala.concurrent.duration.FiniteDuration per)` | Context\-preserving variant of `akka.stream.scaladsl.FlowOps.throttle`. |
	| `[FlowWithContextOps](FlowWithContextOps.html "interface in akka.stream.scaladsl")` | `[throttle](#throttle(int,scala.concurrent.duration.FiniteDuration,int,akka.stream.ThrottleMode))​(int elements,  scala.concurrent.duration.FiniteDuration per,  int maximumBurst,  [ThrottleMode](../ThrottleMode.html "class in akka.stream") mode)` | Context\-preserving variant of `akka.stream.scaladsl.FlowOps.throttle`. |
	| `[FlowWithContextOps](FlowWithContextOps.html "interface in akka.stream.scaladsl")` | `[throttle](#throttle(int,scala.concurrent.duration.FiniteDuration,int,scala.Function1,akka.stream.ThrottleMode))​(int cost,  scala.concurrent.duration.FiniteDuration per,  int maximumBurst,  scala.Function1<[Out](FlowWithContextOps.html "type parameter in FlowWithContextOps"),​java.lang.Object> costCalculation,  [ThrottleMode](../ThrottleMode.html "class in akka.stream") mode)` | Context\-preserving variant of `akka.stream.scaladsl.FlowOps.throttle`. |
	| `[FlowWithContextOps](FlowWithContextOps.html "interface in akka.stream.scaladsl")` | `[throttle](#throttle(int,scala.concurrent.duration.FiniteDuration,scala.Function1))​(int cost,  scala.concurrent.duration.FiniteDuration per,  scala.Function1<[Out](FlowWithContextOps.html "type parameter in FlowWithContextOps"),​java.lang.Object> costCalculation)` | Context\-preserving variant of `akka.stream.scaladsl.FlowOps.throttle`. |
	| `[FlowWithContextOps](FlowWithContextOps.html "interface in akka.stream.scaladsl")` | `[throttle](#throttle(akka.stream.scaladsl.ThrottleControl))​([ThrottleControl](ThrottleControl.html "class in akka.stream.scaladsl") control)` | Context\-preserving variant of `akka.stream.scaladsl.FlowOps.throttle`. |
	| `[FlowWithContextOps](FlowWithContextOps.html "interface in akka.stream.scaladsl")` | `[throttle](#throttle(akka.stream.scaladsl.ThrottleControl,scala.Function1))​([ThrottleControl](ThrottleControl.html "class in akka.stream.scaladsl") control,  scala.Function1<[Out](FlowWithContextOps.html "type parameter in FlowWithContextOps"),​java.lang.Object> costCalculation)` | Context\-preserving variant of `akka.stream.scaladsl.FlowOps.throttle`. |
	| `<Out2,​Mat2>[FlowWithContextOps](FlowWithContextOps.html "interface in akka.stream.scaladsl")` | `[unsafeDataVia](#unsafeDataVia(akka.stream.Graph))​([Graph](../Graph.html "interface in akka.stream")<[FlowShape](../FlowShape.html "class in akka.stream")<[Out](FlowWithContextOps.html "type parameter in FlowWithContextOps"),​Out2>,​Mat2> viaFlow)` | Transform this flow by the regular flow. |
	| `<Out2,​Ctx2,​Mat2>[FlowWithContextOps](FlowWithContextOps.html "interface in akka.stream.scaladsl")` | `[via](#via(akka.stream.Graph))​([Graph](../Graph.html "interface in akka.stream")<[FlowShape](../FlowShape.html "class in akka.stream")<scala.Tuple2<[Out](FlowWithContextOps.html "type parameter in FlowWithContextOps"),​[Ctx](FlowWithContextOps.html "type parameter in FlowWithContextOps")>,​scala.Tuple2<Out2,​Ctx2>>,​Mat2> flow)` | Transform this flow by the regular flow. |
	| `<Out2,​Ctx2,​Mat2,​Mat3>[FlowWithContextOps](FlowWithContextOps.html "interface in akka.stream.scaladsl")` | `[viaMat](#viaMat(akka.stream.Graph,scala.Function2))​([Graph](../Graph.html "interface in akka.stream")<[FlowShape](../FlowShape.html "class in akka.stream")<scala.Tuple2<[Out](FlowWithContextOps.html "type parameter in FlowWithContextOps"),​[Ctx](FlowWithContextOps.html "type parameter in FlowWithContextOps")>,​scala.Tuple2<Out2,​Ctx2>>,​Mat2> flow,  scala.Function2<[Mat](FlowWithContextOps.html "type parameter in FlowWithContextOps"),​Mat2,​Mat3> combine)` | Transform this flow by the regular flow. |

- - ### Method Detail
	
	
	
		- #### collect
		
		
		
		```
		<Out2> [FlowWithContextOps](FlowWithContextOps.html "interface in akka.stream.scaladsl") collect​(scala.PartialFunction<[Out](FlowWithContextOps.html "type parameter in FlowWithContextOps"),​Out2> f)
		```
		
		Context\-preserving variant of `akka.stream.scaladsl.FlowOps.collect`.
		 
		 Note, that the context of elements that are filtered out is skipped as well.
		 
		
		
		
		See Also:
		`akka.stream.scaladsl.FlowOps.collect`
		- #### filter
		
		
		
		```
		[FlowWithContextOps](FlowWithContextOps.html "interface in akka.stream.scaladsl") filter​(scala.Function1<[Out](FlowWithContextOps.html "type parameter in FlowWithContextOps"),​java.lang.Object> pred)
		```
		
		Context\-preserving variant of `akka.stream.scaladsl.FlowOps.filter`.
		 
		 Note, that the context of elements that are filtered out is skipped as well.
		 
		
		
		
		See Also:
		`akka.stream.scaladsl.FlowOps.filter`
		- #### filterNot
		
		
		
		```
		[FlowWithContextOps](FlowWithContextOps.html "interface in akka.stream.scaladsl") filterNot​(scala.Function1<[Out](FlowWithContextOps.html "type parameter in FlowWithContextOps"),​java.lang.Object> pred)
		```
		
		Context\-preserving variant of `akka.stream.scaladsl.FlowOps.filterNot`.
		 
		 Note, that the context of elements that are filtered out is skipped as well.
		 
		
		
		
		See Also:
		`akka.stream.scaladsl.FlowOps.filterNot`
		- #### flow
		
		
		
		```
		<T,​C> [Flow](Flow.html "class in akka.stream.scaladsl")<scala.Tuple2<T,​C>,​scala.Tuple2<T,​C>,​[NotUsed](../../NotUsed.html "class in akka")> flow()
		```
		- #### grouped
		
		
		
		```
		[FlowWithContextOps](FlowWithContextOps.html "interface in akka.stream.scaladsl") grouped​(int n)
		```
		
		Context\-preserving variant of `akka.stream.scaladsl.FlowOps.grouped`.
		 
		 Each output group will be associated with a `Seq` of corresponding context elements.
		 
		
		
		
		See Also:
		`akka.stream.scaladsl.FlowOps.grouped`
		- #### log
		
		
		
		```
		[FlowWithContextOps](FlowWithContextOps.html "interface in akka.stream.scaladsl") log​(java.lang.String name,
		                       scala.Function1<[Out](FlowWithContextOps.html "type parameter in FlowWithContextOps"),​java.lang.Object> extract,
		                       [LoggingAdapter](../../event/LoggingAdapter.html "interface in akka.event") log)
		```
		
		Context\-preserving variant of `akka.stream.scaladsl.FlowOps.log`.
		 
		
		See Also:
		`akka.stream.scaladsl.FlowOps.log`
		- #### log$default$2
		
		
		
		```
		scala.Function1<[Out](FlowWithContextOps.html "type parameter in FlowWithContextOps"),​java.lang.Object> log$default$2()
		```
		- #### log$default$3
		
		
		
		```
		[LoggingAdapter](../../event/LoggingAdapter.html "interface in akka.event") log$default$3​(java.lang.String name,
		                             scala.Function1<[Out](FlowWithContextOps.html "type parameter in FlowWithContextOps"),​java.lang.Object> extract)
		```
		- #### logWithMarker
		
		
		
		```
		[FlowWithContextOps](FlowWithContextOps.html "interface in akka.stream.scaladsl") logWithMarker​(java.lang.String name,
		                                 scala.Function2<[Out](FlowWithContextOps.html "type parameter in FlowWithContextOps"),​[Ctx](FlowWithContextOps.html "type parameter in FlowWithContextOps"),​[LogMarker](../../event/LogMarker.html "class in akka.event")> marker,
		                                 scala.Function1<[Out](FlowWithContextOps.html "type parameter in FlowWithContextOps"),​java.lang.Object> extract,
		                                 [MarkerLoggingAdapter](../../event/MarkerLoggingAdapter.html "class in akka.event") log)
		```
		
		Context\-preserving variant of `akka.stream.scaladsl.FlowOps.logWithMarker`.
		 
		
		See Also:
		`akka.stream.scaladsl.FlowOps.logWithMarker`
		- #### logWithMarker$default$3
		
		
		
		```
		scala.Function1<[Out](FlowWithContextOps.html "type parameter in FlowWithContextOps"),​java.lang.Object> logWithMarker$default$3()
		```
		- #### logWithMarker$default$4
		
		
		
		```
		[MarkerLoggingAdapter](../../event/MarkerLoggingAdapter.html "class in akka.event") logWithMarker$default$4​(java.lang.String name,
		                                             scala.Function2<[Out](FlowWithContextOps.html "type parameter in FlowWithContextOps"),​[Ctx](FlowWithContextOps.html "type parameter in FlowWithContextOps"),​[LogMarker](../../event/LogMarker.html "class in akka.event")> marker,
		                                             scala.Function1<[Out](FlowWithContextOps.html "type parameter in FlowWithContextOps"),​java.lang.Object> extract)
		```
		- #### map
		
		
		
		```
		<Out2> [FlowWithContextOps](FlowWithContextOps.html "interface in akka.stream.scaladsl") map​(scala.Function1<[Out](FlowWithContextOps.html "type parameter in FlowWithContextOps"),​Out2> f)
		```
		
		Context\-preserving variant of `akka.stream.scaladsl.FlowOps.map`.
		 
		
		See Also:
		`akka.stream.scaladsl.FlowOps.map`
		- #### mapAsync
		
		
		
		```
		<Out2> [FlowWithContextOps](FlowWithContextOps.html "interface in akka.stream.scaladsl") mapAsync​(int parallelism,
		                                   scala.Function1<[Out](FlowWithContextOps.html "type parameter in FlowWithContextOps"),​scala.concurrent.Future<Out2>> f)
		```
		
		Context\-preserving variant of `akka.stream.scaladsl.FlowOps.mapAsync`.
		 
		
		See Also:
		`akka.stream.scaladsl.FlowOps.mapAsync`
		- #### mapAsyncPartitioned
		
		
		
		```
		<Out2,​P> [FlowWithContextOps](FlowWithContextOps.html "interface in akka.stream.scaladsl") mapAsyncPartitioned​(int parallelism,
		                                                      int perPartition,
		                                                      scala.Function1<[Out](FlowWithContextOps.html "type parameter in FlowWithContextOps"),​P> partitioner,
		                                                      scala.Function2<[Out](FlowWithContextOps.html "type parameter in FlowWithContextOps"),​P,​scala.concurrent.Future<Out2>> f)
		```
		
		Context\-preserving variant of `akka.stream.scaladsl.FlowOps.mapAsyncPartitioned`.
		 
		
		See Also:
		`akka.stream.scaladsl.FlowOps.mapAsyncPartitioned`
		- #### mapConcat
		
		
		
		```
		<Out2> [FlowWithContextOps](FlowWithContextOps.html "interface in akka.stream.scaladsl") mapConcat​(scala.Function1<[Out](FlowWithContextOps.html "type parameter in FlowWithContextOps"),​scala.collection.IterableOnce<Out2>> f)
		```
		
		Context\-preserving variant of `akka.stream.scaladsl.FlowOps.mapConcat`.
		 
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
		`akka.stream.scaladsl.FlowOps.mapConcat`
		- #### mapContext
		
		
		
		```
		<Ctx2> [FlowWithContextOps](FlowWithContextOps.html "interface in akka.stream.scaladsl") mapContext​(scala.Function1<[Ctx](FlowWithContextOps.html "type parameter in FlowWithContextOps"),​Ctx2> f)
		```
		
		Apply the given function to each context element (leaving the data elements unchanged).
		- #### mapError
		
		
		
		```
		[FlowWithContextOps](FlowWithContextOps.html "interface in akka.stream.scaladsl") mapError​(scala.PartialFunction<java.lang.Throwable,​java.lang.Throwable> pf)
		```
		
		Context\-preserving variant of `akka.stream.scaladsl.FlowOps.mapError`.
		 
		
		See Also:
		`akka.stream.scaladsl.FlowOps.mapError`
		- #### sliding
		
		
		
		```
		[FlowWithContextOps](FlowWithContextOps.html "interface in akka.stream.scaladsl") sliding​(int n,
		                           int step)
		```
		
		Context\-preserving variant of `akka.stream.scaladsl.FlowOps.sliding`.
		 
		 Each output group will be associated with a `Seq` of corresponding context elements.
		 
		
		
		
		See Also:
		`akka.stream.scaladsl.FlowOps.sliding`
		- #### sliding$default$2
		
		
		
		```
		int sliding$default$2()
		```
		- #### throttle
		
		
		
		```
		[FlowWithContextOps](FlowWithContextOps.html "interface in akka.stream.scaladsl") throttle​(int elements,
		                            scala.concurrent.duration.FiniteDuration per)
		```
		
		Context\-preserving variant of `akka.stream.scaladsl.FlowOps.throttle`.
		 
		
		See Also:
		`akka.stream.scaladsl.FlowOps.throttle`
		- #### throttle
		
		
		
		```
		[FlowWithContextOps](FlowWithContextOps.html "interface in akka.stream.scaladsl") throttle​(int elements,
		                            scala.concurrent.duration.FiniteDuration per,
		                            int maximumBurst,
		                            [ThrottleMode](../ThrottleMode.html "class in akka.stream") mode)
		```
		
		Context\-preserving variant of `akka.stream.scaladsl.FlowOps.throttle`.
		 
		
		See Also:
		`akka.stream.scaladsl.FlowOps.throttle`
		- #### throttle
		
		
		
		```
		[FlowWithContextOps](FlowWithContextOps.html "interface in akka.stream.scaladsl") throttle​(int cost,
		                            scala.concurrent.duration.FiniteDuration per,
		                            scala.Function1<[Out](FlowWithContextOps.html "type parameter in FlowWithContextOps"),​java.lang.Object> costCalculation)
		```
		
		Context\-preserving variant of `akka.stream.scaladsl.FlowOps.throttle`.
		 
		
		See Also:
		`akka.stream.scaladsl.FlowOps.throttle`
		- #### throttle
		
		
		
		```
		[FlowWithContextOps](FlowWithContextOps.html "interface in akka.stream.scaladsl") throttle​(int cost,
		                            scala.concurrent.duration.FiniteDuration per,
		                            int maximumBurst,
		                            scala.Function1<[Out](FlowWithContextOps.html "type parameter in FlowWithContextOps"),​java.lang.Object> costCalculation,
		                            [ThrottleMode](../ThrottleMode.html "class in akka.stream") mode)
		```
		
		Context\-preserving variant of `akka.stream.scaladsl.FlowOps.throttle`.
		 
		
		See Also:
		`akka.stream.scaladsl.FlowOps.throttle`
		- #### throttle
		
		
		
		```
		[FlowWithContextOps](FlowWithContextOps.html "interface in akka.stream.scaladsl") throttle​([ThrottleControl](ThrottleControl.html "class in akka.stream.scaladsl") control)
		```
		
		Context\-preserving variant of `akka.stream.scaladsl.FlowOps.throttle`.
		 
		
		See Also:
		`akka.stream.scaladsl.FlowOps.throttle`
		- #### throttle
		
		
		
		```
		[FlowWithContextOps](FlowWithContextOps.html "interface in akka.stream.scaladsl") throttle​([ThrottleControl](ThrottleControl.html "class in akka.stream.scaladsl") control,
		                            scala.Function1<[Out](FlowWithContextOps.html "type parameter in FlowWithContextOps"),​java.lang.Object> costCalculation)
		```
		
		Context\-preserving variant of `akka.stream.scaladsl.FlowOps.throttle`.
		 
		
		See Also:
		`akka.stream.scaladsl.FlowOps.throttle`
		- #### unsafeDataVia
		
		
		
		```
		<Out2,​Mat2> [FlowWithContextOps](FlowWithContextOps.html "interface in akka.stream.scaladsl") unsafeDataVia​([Graph](../Graph.html "interface in akka.stream")<[FlowShape](../FlowShape.html "class in akka.stream")<[Out](FlowWithContextOps.html "type parameter in FlowWithContextOps"),​Out2>,​Mat2> viaFlow)
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
		- #### via
		
		
		
		```
		<Out2,​Ctx2,​Mat2> [FlowWithContextOps](FlowWithContextOps.html "interface in akka.stream.scaladsl") via​([Graph](../Graph.html "interface in akka.stream")<[FlowShape](../FlowShape.html "class in akka.stream")<scala.Tuple2<[Out](FlowWithContextOps.html "type parameter in FlowWithContextOps"),​[Ctx](FlowWithContextOps.html "type parameter in FlowWithContextOps")>,​scala.Tuple2<Out2,​Ctx2>>,​Mat2> flow)
		```
		
		Transform this flow by the regular flow. The given flow must support manual context propagation by
		 taking and producing tuples of (data, context).
		 
		 It is up to the implementer to ensure the inner flow does not exhibit any behaviour that is not expected
		 by the downstream elements, such as reordering. For more background on these requirements
		 see https://doc.akka.io/libraries/akka\-core/current/stream/stream\-context.html.
		 
		
		
		 This can be used as an escape hatch for operations that are not (yet) provided with automatic
		 context propagation here.
		 
		
		
		
		See Also:
		`akka.stream.scaladsl.FlowOps.via`
		- #### viaMat
		
		
		
		```
		<Out2,​Ctx2,​Mat2,​Mat3> [FlowWithContextOps](FlowWithContextOps.html "interface in akka.stream.scaladsl") viaMat​([Graph](../Graph.html "interface in akka.stream")<[FlowShape](../FlowShape.html "class in akka.stream")<scala.Tuple2<[Out](FlowWithContextOps.html "type parameter in FlowWithContextOps"),​[Ctx](FlowWithContextOps.html "type parameter in FlowWithContextOps")>,​scala.Tuple2<Out2,​Ctx2>>,​Mat2> flow,
		                                                                  scala.Function2<[Mat](FlowWithContextOps.html "type parameter in FlowWithContextOps"),​Mat2,​Mat3> combine)
		```
		
		Transform this flow by the regular flow. The given flow must support manual context propagation by
		 taking and producing tuples of (data, context).
		 
		 It is up to the implementer to ensure the inner flow does not exhibit any behaviour that is not expected
		 by the downstream elements, such as reordering. For more background on these requirements
		 see https://doc.akka.io/libraries/akka\-core/current/stream/stream\-context.html.
		 
		
		
		 This can be used as an escape hatch for operations that are not (yet) provided with automatic
		 context propagation here.
		 
		
		
		 The `combine` function is used to compose the materialized values of this flow and that
		 flow into the materialized value of the resulting Flow.
		 
		
		
		
		See Also:
		`akka.stream.scaladsl.FlowOpsMat.viaMat`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/NotUsed.html
- https://doc.akka.io/japi/akka/current/akka/event/LogMarker.html
- https://doc.akka.io/japi/akka/current/akka/event/LoggingAdapter.html
- https://doc.akka.io/japi/akka/current/akka/event/MarkerLoggingAdapter.html
- https://doc.akka.io/japi/akka/current/akka/stream/FlowShape.html
- https://doc.akka.io/japi/akka/current/akka/stream/Graph.html
- https://doc.akka.io/japi/akka/current/akka/stream/ThrottleMode.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/Flow.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/FlowWithContext.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/FlowWithContextOps.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/SourceWithContext.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/ThrottleControl.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/FlowWithContextOps.html](https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/FlowWithContextOps.html)*