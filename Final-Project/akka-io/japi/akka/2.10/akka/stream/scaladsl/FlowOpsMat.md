---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:03:22Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/2.10/akka/stream/scaladsl/FlowOpsMat.html
title: FlowOpsMat
---

# FlowOpsMat

## Content

Package [akka.stream.scaladsl](package-summary.html)
## Interface FlowOpsMat\<Out,​Mat\>

- All Superinterfaces:
`[FlowOps](FlowOps.html "interface in akka.stream.scaladsl")<Out,​Mat>`

All Known Implementing Classes:
`[Flow](Flow.html "class in akka.stream.scaladsl")`, `[Source](Source.html "class in akka.stream.scaladsl")`

---

```
public interface FlowOpsMat<Out,​Mat>
extends [FlowOps](FlowOps.html "interface in akka.stream.scaladsl")<Out,​Mat>
```

INTERNAL API: this trait will be changed in binary\-incompatible ways for classes that are derived from it!
 Do not implement this interface outside the Akka code base!
 
 Binary compatibility is only maintained for callers of this trait\&rsquo;s interface.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `<Mat2,​Mat3>[FlowOpsMat](FlowOpsMat.html "interface in akka.stream.scaladsl")` | `[alsoToMat](#alsoToMat(akka.stream.Graph,scala.Function2))​([Graph](../Graph.html "interface in akka.stream")<[SinkShape](../SinkShape.html "class in akka.stream")<[Out](FlowOpsMat.html "type parameter in FlowOpsMat")>,​Mat2> that,  scala.Function2<[Mat](FlowOpsMat.html "type parameter in FlowOpsMat"),​Mat2,​Mat3> matF)` | Attaches the given [`Sink`](Sink.html "class in akka.stream.scaladsl") to this [`Flow`](Flow.html "class in akka.stream.scaladsl"), meaning that elements that pass  through will also be sent to the [`Sink`](Sink.html "class in akka.stream.scaladsl"). |
	| `<U,​Mat2,​Mat3>[FlowOpsMat](FlowOpsMat.html "interface in akka.stream.scaladsl")` | `[concatLazyMat](#concatLazyMat(akka.stream.Graph,scala.Function2))​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<U>,​Mat2> that,  scala.Function2<[Mat](FlowOpsMat.html "type parameter in FlowOpsMat"),​Mat2,​Mat3> matF)` | Concatenate the given [`Source`](Source.html "class in akka.stream.scaladsl") to this [`Flow`](Flow.html "class in akka.stream.scaladsl"), meaning that once this  Flow\&rsquo;s input is exhausted and all result elements have been generated,  the Source\&rsquo;s elements will be produced. |
	| `<U,​Mat2,​Mat3>[FlowOpsMat](FlowOpsMat.html "interface in akka.stream.scaladsl")` | `[concatMat](#concatMat(akka.stream.Graph,scala.Function2))​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<U>,​Mat2> that,  scala.Function2<[Mat](FlowOpsMat.html "type parameter in FlowOpsMat"),​Mat2,​Mat3> matF)` | Concatenate the given [`Source`](Source.html "class in akka.stream.scaladsl") to this [`Flow`](Flow.html "class in akka.stream.scaladsl"), meaning that once this  Flow\&rsquo;s input is exhausted and all result elements have been generated,  the Source\&rsquo;s elements will be produced. |
	| `<Mat2,​Mat3>[FlowOpsMat](FlowOpsMat.html "interface in akka.stream.scaladsl")` | `[divertToMat](#divertToMat(akka.stream.Graph,scala.Function1,scala.Function2))​([Graph](../Graph.html "interface in akka.stream")<[SinkShape](../SinkShape.html "class in akka.stream")<[Out](FlowOpsMat.html "type parameter in FlowOpsMat")>,​Mat2> that,  scala.Function1<[Out](FlowOpsMat.html "type parameter in FlowOpsMat"),​java.lang.Object> when,  scala.Function2<[Mat](FlowOpsMat.html "type parameter in FlowOpsMat"),​Mat2,​Mat3> matF)` | Attaches the given [`Sink`](Sink.html "class in akka.stream.scaladsl") to this [`Flow`](Flow.html "class in akka.stream.scaladsl"), meaning that elements will be sent to the [`Sink`](Sink.html "class in akka.stream.scaladsl")  instead of being passed through if the predicate `when` returns `true`. |
	| `<Out2,​Mat2,​Mat3>[FlowOpsMat](FlowOpsMat.html "interface in akka.stream.scaladsl")` | `[flatMapPrefixMat](#flatMapPrefixMat(int,scala.Function1,scala.Function2))​(int n,  scala.Function1<scala.collection.immutable.Seq<[Out](FlowOpsMat.html "type parameter in FlowOpsMat")>,​[Flow](Flow.html "class in akka.stream.scaladsl")<[Out](FlowOpsMat.html "type parameter in FlowOpsMat"),​Out2,​Mat2>> f,  scala.Function2<[Mat](FlowOpsMat.html "type parameter in FlowOpsMat"),​scala.concurrent.Future<Mat2>,​Mat3> matF)` | mat version of [`FlowOps.flatMapPrefix(int, scala.Function1<scala.collection.immutable.Seq<Out>, akka.stream.scaladsl.Flow<Out, Out2, Mat2>>)`](FlowOps.html#flatMapPrefix(int,scala.Function1)), this method gives access to a future materialized value of the downstream flow. |
	| `<U,​Mat2,​Mat3>[FlowOpsMat](FlowOpsMat.html "interface in akka.stream.scaladsl")` | `[interleaveMat](#interleaveMat(akka.stream.Graph,int,boolean,scala.Function2))​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<U>,​Mat2> that,  int segmentSize,  boolean eagerClose,  scala.Function2<[Mat](FlowOpsMat.html "type parameter in FlowOpsMat"),​Mat2,​Mat3> matF)` | Interleave is a deterministic merge of the given [`Source`](Source.html "class in akka.stream.scaladsl") with elements of this [`Flow`](Flow.html "class in akka.stream.scaladsl"). |
	| `<U,​Mat2,​Mat3>[FlowOpsMat](FlowOpsMat.html "interface in akka.stream.scaladsl")` | `[interleaveMat](#interleaveMat(akka.stream.Graph,int,scala.Function2))​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<U>,​Mat2> that,  int segmentSize,  scala.Function2<[Mat](FlowOpsMat.html "type parameter in FlowOpsMat"),​Mat2,​Mat3> matF)` | Interleave is a deterministic merge of the given [`Source`](Source.html "class in akka.stream.scaladsl") with elements of this [`Flow`](Flow.html "class in akka.stream.scaladsl"). |
	| `<Mat2> [FlowOpsMat](FlowOpsMat.html "interface in akka.stream.scaladsl")` | `[mapMaterializedValue](#mapMaterializedValue(scala.Function1))​(scala.Function1<[Mat](FlowOpsMat.html "type parameter in FlowOpsMat"),​Mat2> f)` | Transform the materialized value of this graph, leaving all other properties as they were. |
	| `<U,​Mat2,​Mat3>[FlowOpsMat](FlowOpsMat.html "interface in akka.stream.scaladsl")` | `[mergeLatestMat](#mergeLatestMat(akka.stream.Graph,boolean,scala.Function2))​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<U>,​Mat2> that,  boolean eagerClose,  scala.Function2<[Mat](FlowOpsMat.html "type parameter in FlowOpsMat"),​Mat2,​Mat3> matF)` | MergeLatest joins elements from N input streams into stream of lists of size N. |
	| `<U,​Mat2,​Mat3>[FlowOpsMat](FlowOpsMat.html "interface in akka.stream.scaladsl")` | `[mergeMat](#mergeMat(akka.stream.Graph,boolean,scala.Function2))​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<U>,​Mat2> that,  boolean eagerComplete,  scala.Function2<[Mat](FlowOpsMat.html "type parameter in FlowOpsMat"),​Mat2,​Mat3> matF)` | Merge the given [`Source`](Source.html "class in akka.stream.scaladsl") to this [`Flow`](Flow.html "class in akka.stream.scaladsl"), taking elements as they arrive from input streams,  picking randomly when several elements ready. |
	| `<U,​Mat2,​Mat3>boolean` | `[mergeMat$default$2](#mergeMat$default$2())()` |  |
	| `<U,​Mat2,​Mat3>[FlowOpsMat](FlowOpsMat.html "interface in akka.stream.scaladsl")` | `[mergePreferredMat](#mergePreferredMat(akka.stream.Graph,boolean,boolean,scala.Function2))​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<U>,​Mat2> that,  boolean preferred,  boolean eagerClose,  scala.Function2<[Mat](FlowOpsMat.html "type parameter in FlowOpsMat"),​Mat2,​Mat3> matF)` | Merge two sources. |
	| `<U,​Mat2,​Mat3>[FlowOpsMat](FlowOpsMat.html "interface in akka.stream.scaladsl")` | `[mergePrioritizedMat](#mergePrioritizedMat(akka.stream.Graph,int,int,boolean,scala.Function2))​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<U>,​Mat2> that,  int leftPriority,  int rightPriority,  boolean eagerClose,  scala.Function2<[Mat](FlowOpsMat.html "type parameter in FlowOpsMat"),​Mat2,​Mat3> matF)` | Merge two sources. |
	| `<U,​Mat2,​Mat3>[FlowOpsMat](FlowOpsMat.html "interface in akka.stream.scaladsl")` | `[mergeSortedMat](#mergeSortedMat(akka.stream.Graph,scala.Function2,scala.math.Ordering))​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<U>,​Mat2> that,  scala.Function2<[Mat](FlowOpsMat.html "type parameter in FlowOpsMat"),​Mat2,​Mat3> matF,  scala.math.Ordering<U> ord)` | Merge the given [`Source`](Source.html "class in akka.stream.scaladsl") to this [`Flow`](Flow.html "class in akka.stream.scaladsl"), taking elements as they arrive from input streams,  picking always the smallest of the available elements (waiting for one element from each side  to be available). |
	| `[FlowOpsMat](FlowOpsMat.html "interface in akka.stream.scaladsl")` | `[monitor](#monitor())()` | Materializes to `(Mat, FlowMonitor[Out])`, which is unlike most other operators (!),  in which usually the default materialized value keeping semantics is to keep the left value  (by passing `Keep.left()` to a `*Mat` version of a method). |
	| `<Mat2> [FlowOpsMat](FlowOpsMat.html "interface in akka.stream.scaladsl")` | `[monitorMat](#monitorMat(scala.Function2))​(scala.Function2<[Mat](FlowOpsMat.html "type parameter in FlowOpsMat"),​[FlowMonitor](../FlowMonitor.html "interface in akka.stream")<[Out](FlowOpsMat.html "type parameter in FlowOpsMat")>,​Mat2> combine)` | Materializes to `FlowMonitor[Out]` that allows monitoring of the current flow. |
	| `<U,​Mat2,​Mat3>[FlowOpsMat](FlowOpsMat.html "interface in akka.stream.scaladsl")` | `[orElseMat](#orElseMat(akka.stream.Graph,scala.Function2))​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<U>,​Mat2> secondary,  scala.Function2<[Mat](FlowOpsMat.html "type parameter in FlowOpsMat"),​Mat2,​Mat3> matF)` | Provides a secondary source that will be consumed if this stream completes without any  elements passing by. |
	| `<U,​Mat2,​Mat3>[FlowOpsMat](FlowOpsMat.html "interface in akka.stream.scaladsl")` | `[prependLazyMat](#prependLazyMat(akka.stream.Graph,scala.Function2))​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<U>,​Mat2> that,  scala.Function2<[Mat](FlowOpsMat.html "type parameter in FlowOpsMat"),​Mat2,​Mat3> matF)` | Prepend the given [`Source`](Source.html "class in akka.stream.scaladsl") to this [`Flow`](Flow.html "class in akka.stream.scaladsl"), meaning that before elements  are generated from this Flow, the Source's elements will be produced until it  is exhausted, at which point Flow elements will start being produced. |
	| `<U,​Mat2,​Mat3>[FlowOpsMat](FlowOpsMat.html "interface in akka.stream.scaladsl")` | `[prependMat](#prependMat(akka.stream.Graph,scala.Function2))​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<U>,​Mat2> that,  scala.Function2<[Mat](FlowOpsMat.html "type parameter in FlowOpsMat"),​Mat2,​Mat3> matF)` | Prepend the given [`Source`](Source.html "class in akka.stream.scaladsl") to this [`Flow`](Flow.html "class in akka.stream.scaladsl"), meaning that before elements  are generated from this Flow, the Source's elements will be produced until it  is exhausted, at which point Flow elements will start being produced. |
	| `<Mat2,​Mat3>[Graph](../Graph.html "interface in akka.stream")` | `[toMat](#toMat(akka.stream.Graph,scala.Function2))​([Graph](../Graph.html "interface in akka.stream")<[SinkShape](../SinkShape.html "class in akka.stream")<[Out](FlowOpsMat.html "type parameter in FlowOpsMat")>,​Mat2> sink,  scala.Function2<[Mat](FlowOpsMat.html "type parameter in FlowOpsMat"),​Mat2,​Mat3> combine)` | Connect this [`Flow`](Flow.html "class in akka.stream.scaladsl") to a [`Sink`](Sink.html "class in akka.stream.scaladsl"), concatenating the processing steps of both. |
	| `<T,​Mat2,​Mat3>[FlowOpsMat](FlowOpsMat.html "interface in akka.stream.scaladsl")` | `[viaMat](#viaMat(akka.stream.Graph,scala.Function2))​([Graph](../Graph.html "interface in akka.stream")<[FlowShape](../FlowShape.html "class in akka.stream")<[Out](FlowOpsMat.html "type parameter in FlowOpsMat"),​T>,​Mat2> flow,  scala.Function2<[Mat](FlowOpsMat.html "type parameter in FlowOpsMat"),​Mat2,​Mat3> combine)` | Transform this [`Flow`](Flow.html "class in akka.stream.scaladsl") by appending the given processing steps. |
	| `<Mat2> [FlowOpsMat](FlowOpsMat.html "interface in akka.stream.scaladsl")` | `[watchTermination](#watchTermination(scala.Function2))​(scala.Function2<[Mat](FlowOpsMat.html "type parameter in FlowOpsMat"),​scala.concurrent.Future<[Done](../../Done.html "class in akka")>,​Mat2> matF)` | Materializes to `Future[Done]` that completes on getting termination message. |
	| `<Mat2,​Mat3>[FlowOpsMat](FlowOpsMat.html "interface in akka.stream.scaladsl")` | `[wireTapMat](#wireTapMat(akka.stream.Graph,scala.Function2))​([Graph](../Graph.html "interface in akka.stream")<[SinkShape](../SinkShape.html "class in akka.stream")<[Out](FlowOpsMat.html "type parameter in FlowOpsMat")>,​Mat2> that,  scala.Function2<[Mat](FlowOpsMat.html "type parameter in FlowOpsMat"),​Mat2,​Mat3> matF)` | Attaches the given [`Sink`](Sink.html "class in akka.stream.scaladsl") to this [`Flow`](Flow.html "class in akka.stream.scaladsl") as a wire tap, meaning that elements that pass  through will also be sent to the wire\-tap Sink, without the latter affecting the mainline flow. |
	| `<U,​Mat2,​Mat3,​A>[FlowOpsMat](FlowOpsMat.html "interface in akka.stream.scaladsl")` | `[zipAllMat](#zipAllMat(akka.stream.Graph,A,U,scala.Function2))​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<U>,​Mat2> that,  A thisElem,  U thatElem,  scala.Function2<[Mat](FlowOpsMat.html "type parameter in FlowOpsMat"),​Mat2,​Mat3> matF)` | Combine the elements of current flow and the given [`Source`](Source.html "class in akka.stream.scaladsl") into a stream of tuples. |
	| `<U,​Mat2,​Mat3>[FlowOpsMat](FlowOpsMat.html "interface in akka.stream.scaladsl")` | `[zipLatestMat](#zipLatestMat(akka.stream.Graph,scala.Function2))​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<U>,​Mat2> that,  scala.Function2<[Mat](FlowOpsMat.html "type parameter in FlowOpsMat"),​Mat2,​Mat3> matF)` | Combine the elements of current flow and the given [`Source`](Source.html "class in akka.stream.scaladsl") into a stream of tuples,  picking always the latest of the elements of each source. |
	| `<Out2,​Out3,​Mat2,​Mat3>[FlowOpsMat](FlowOpsMat.html "interface in akka.stream.scaladsl")` | `[zipLatestWithMat](#zipLatestWithMat(akka.stream.Graph,boolean,scala.Function2,scala.Function2))​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<Out2>,​Mat2> that,  boolean eagerComplete,  scala.Function2<[Out](FlowOpsMat.html "type parameter in FlowOpsMat"),​Out2,​Out3> combine,  scala.Function2<[Mat](FlowOpsMat.html "type parameter in FlowOpsMat"),​Mat2,​Mat3> matF)` | Put together the elements of current flow and the given [`Source`](Source.html "class in akka.stream.scaladsl")  into a stream of combined elements using a combiner function, picking always the latest of the elements of each source. |
	| `<Out2,​Out3,​Mat2,​Mat3>[FlowOpsMat](FlowOpsMat.html "interface in akka.stream.scaladsl")` | `[zipLatestWithMat](#zipLatestWithMat(akka.stream.Graph,scala.Function2,scala.Function2))​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<Out2>,​Mat2> that,  scala.Function2<[Out](FlowOpsMat.html "type parameter in FlowOpsMat"),​Out2,​Out3> combine,  scala.Function2<[Mat](FlowOpsMat.html "type parameter in FlowOpsMat"),​Mat2,​Mat3> matF)` | Put together the elements of current flow and the given [`Source`](Source.html "class in akka.stream.scaladsl")  into a stream of combined elements using a combiner function, picking always the latest of the elements of each source. |
	| `<U,​Mat2,​Mat3>[FlowOpsMat](FlowOpsMat.html "interface in akka.stream.scaladsl")` | `[zipMat](#zipMat(akka.stream.Graph,scala.Function2))​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<U>,​Mat2> that,  scala.Function2<[Mat](FlowOpsMat.html "type parameter in FlowOpsMat"),​Mat2,​Mat3> matF)` | Combine the elements of current flow and the given [`Source`](Source.html "class in akka.stream.scaladsl") into a stream of tuples. |
	| `<Out2,​Out3,​Mat2,​Mat3>[FlowOpsMat](FlowOpsMat.html "interface in akka.stream.scaladsl")` | `[zipWithMat](#zipWithMat(akka.stream.Graph,scala.Function2,scala.Function2))​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<Out2>,​Mat2> that,  scala.Function2<[Out](FlowOpsMat.html "type parameter in FlowOpsMat"),​Out2,​Out3> combine,  scala.Function2<[Mat](FlowOpsMat.html "type parameter in FlowOpsMat"),​Mat2,​Mat3> matF)` | Put together the elements of current flow and the given [`Source`](Source.html "class in akka.stream.scaladsl")  into a stream of combined elements using a combiner function. |
	
	
		- ### Methods inherited from interface akka.stream.scaladsl.[FlowOps](FlowOps.html "interface in akka.stream.scaladsl")
		
		
		`[$plus$plus](FlowOps.html#$plus$plus(akka.stream.Graph)), [addAttributes](FlowOps.html#addAttributes(akka.stream.Attributes)), [aggregateWithBoundary](FlowOps.html#aggregateWithBoundary(scala.Function0,scala.Function2,scala.Function1,scala.Option)), [alsoTo](FlowOps.html#alsoTo(akka.stream.Graph)), [alsoToAll](FlowOps.html#alsoToAll(scala.collection.immutable.Seq)), [alsoToGraph](FlowOps.html#alsoToGraph(akka.stream.Graph)), [ask](FlowOps.html#ask(int,akka.actor.ActorRef,akka.util.Timeout,scala.reflect.ClassTag)), [ask](FlowOps.html#ask(akka.actor.ActorRef,akka.util.Timeout,scala.reflect.ClassTag)), [async](FlowOps.html#async()), [backpressureTimeout](FlowOps.html#backpressureTimeout(scala.concurrent.duration.FiniteDuration)), [batch](FlowOps.html#batch(long,scala.Function1,scala.Function2)), [batchWeighted](FlowOps.html#batchWeighted(long,scala.Function1,scala.Function1,scala.Function2)), [buffer](FlowOps.html#buffer(int,akka.stream.OverflowStrategy)), [collect](FlowOps.html#collect(scala.PartialFunction)), [collectType](FlowOps.html#collectType(scala.reflect.ClassTag)), [completionTimeout](FlowOps.html#completionTimeout(scala.concurrent.duration.FiniteDuration)), [concat](FlowOps.html#concat(akka.stream.Graph)), [concatAllLazy](FlowOps.html#concatAllLazy(scala.collection.immutable.Seq)), [concatGraph](FlowOps.html#concatGraph(akka.stream.Graph,boolean)), [concatLazy](FlowOps.html#concatLazy(akka.stream.Graph)), [conflate](FlowOps.html#conflate(scala.Function2)), [conflateWithSeed](FlowOps.html#conflateWithSeed(scala.Function1,scala.Function2)), [delay](FlowOps.html#delay(scala.concurrent.duration.FiniteDuration,akka.stream.DelayOverflowStrategy)), [delay$default$2](FlowOps.html#delay$default$2()), [delayWith](FlowOps.html#delayWith(scala.Function0,akka.stream.DelayOverflowStrategy)), [detach](FlowOps.html#detach()), [divertTo](FlowOps.html#divertTo(akka.stream.Graph,scala.Function1)), [divertToGraph](FlowOps.html#divertToGraph(akka.stream.Graph,scala.Function1)), [drop](FlowOps.html#drop(long)), [dropWhile](FlowOps.html#dropWhile(scala.Function1)), [dropWithin](FlowOps.html#dropWithin(scala.concurrent.duration.FiniteDuration)), [expand](FlowOps.html#expand(scala.Function1)), [extrapolate](FlowOps.html#extrapolate(scala.Function1,scala.Option)), [extrapolate$default$2](FlowOps.html#extrapolate$default$2()), [filter](FlowOps.html#filter(scala.Function1)), [filterNot](FlowOps.html#filterNot(scala.Function1)), [flatMapConcat](FlowOps.html#flatMapConcat(scala.Function1)), [flatMapMerge](FlowOps.html#flatMapMerge(int,scala.Function1)), [flatMapPrefix](FlowOps.html#flatMapPrefix(int,scala.Function1)), [fold](FlowOps.html#fold(T,scala.Function2)), [foldAsync](FlowOps.html#foldAsync(T,scala.Function2)), [groupBy](FlowOps.html#groupBy(int,scala.Function1)), [groupBy](FlowOps.html#groupBy(int,scala.Function1,boolean)), [grouped](FlowOps.html#grouped(int)), [groupedWeighted](FlowOps.html#groupedWeighted(long,scala.Function1)), [groupedWeightedWithin](FlowOps.html#groupedWeightedWithin(long,int,scala.concurrent.duration.FiniteDuration,scala.Function1)), [groupedWeightedWithin](FlowOps.html#groupedWeightedWithin(long,scala.concurrent.duration.FiniteDuration,scala.Function1)), [groupedWithin](FlowOps.html#groupedWithin(int,scala.concurrent.duration.FiniteDuration)), [idleTimeout](FlowOps.html#idleTimeout(scala.concurrent.duration.FiniteDuration)), [initialDelay](FlowOps.html#initialDelay(scala.concurrent.duration.FiniteDuration)), [initialTimeout](FlowOps.html#initialTimeout(scala.concurrent.duration.FiniteDuration)), [interleave](FlowOps.html#interleave(akka.stream.Graph,int)), [interleave](FlowOps.html#interleave(akka.stream.Graph,int,boolean)), [interleaveAll](FlowOps.html#interleaveAll(scala.collection.immutable.Seq,int,boolean)), [interleaveGraph](FlowOps.html#interleaveGraph(akka.stream.Graph,int,boolean)), [interleaveGraph$default$3](FlowOps.html#interleaveGraph$default$3()), [internalConcat](FlowOps.html#internalConcat(akka.stream.Graph,boolean)), [internalConcatAll](FlowOps.html#internalConcatAll(akka.stream.Graph%5B%5D,boolean)), [intersperse](FlowOps.html#intersperse(T)), [intersperse](FlowOps.html#intersperse(T,T,T)), [keepAlive](FlowOps.html#keepAlive(scala.concurrent.duration.FiniteDuration,scala.Function0)), [limit](FlowOps.html#limit(long)), [limitWeighted](FlowOps.html#limitWeighted(long,scala.Function1)), [log](FlowOps.html#log(java.lang.String,scala.Function1,akka.event.LoggingAdapter)), [log$default$2](FlowOps.html#log$default$2()), [log$default$3](FlowOps.html#log$default$3(java.lang.String,scala.Function1)), [logWithMarker](FlowOps.html#logWithMarker(java.lang.String,scala.Function1,scala.Function1,akka.event.MarkerLoggingAdapter)), [logWithMarker$default$3](FlowOps.html#logWithMarker$default$3()), [logWithMarker$default$4](FlowOps.html#logWithMarker$default$4(java.lang.String,scala.Function1,scala.Function1)), [map](FlowOps.html#map(scala.Function1)), [mapAsync](FlowOps.html#mapAsync(int,scala.Function1)), [mapAsyncPartitioned](FlowOps.html#mapAsyncPartitioned(int,int,scala.Function1,scala.Function2)), [mapAsyncUnordered](FlowOps.html#mapAsyncUnordered(int,scala.Function1)), [mapConcat](FlowOps.html#mapConcat(scala.Function1)), [mapError](FlowOps.html#mapError(scala.PartialFunction)), [mapWithResource](FlowOps.html#mapWithResource(scala.Function0,scala.Function2,scala.Function1)), [merge](FlowOps.html#merge(akka.stream.Graph,boolean)), [merge$default$2](FlowOps.html#merge$default$2()), [mergeAll](FlowOps.html#mergeAll(scala.collection.immutable.Seq,boolean)), [mergeGraph](FlowOps.html#mergeGraph(akka.stream.Graph,boolean)), [mergeLatest](FlowOps.html#mergeLatest(akka.stream.Graph,boolean)), [mergeLatest$default$2](FlowOps.html#mergeLatest$default$2()), [mergeLatestGraph](FlowOps.html#mergeLatestGraph(akka.stream.Graph,boolean)), [mergePreferred](FlowOps.html#mergePreferred(akka.stream.Graph,boolean,boolean)), [mergePreferred$default$3](FlowOps.html#mergePreferred$default$3()), [mergePreferredGraph](FlowOps.html#mergePreferredGraph(akka.stream.Graph,boolean,boolean)), [mergePrioritized](FlowOps.html#mergePrioritized(akka.stream.Graph,int,int,boolean)), [mergePrioritized$default$4](FlowOps.html#mergePrioritized$default$4()), [mergePrioritizedGraph](FlowOps.html#mergePrioritizedGraph(akka.stream.Graph,int,int,boolean)), [mergeSorted](FlowOps.html#mergeSorted(akka.stream.Graph,scala.math.Ordering)), [mergeSortedGraph](FlowOps.html#mergeSortedGraph(akka.stream.Graph,scala.math.Ordering)), [named](FlowOps.html#named(java.lang.String)), [onErrorComplete](FlowOps.html#onErrorComplete(scala.PartialFunction)), [onErrorComplete](FlowOps.html#onErrorComplete(scala.reflect.ClassTag)), [orElse](FlowOps.html#orElse(akka.stream.Graph)), [orElseGraph](FlowOps.html#orElseGraph(akka.stream.Graph)), [prefixAndTail](FlowOps.html#prefixAndTail(int)), [prepend](FlowOps.html#prepend(akka.stream.Graph)), [prependGraph](FlowOps.html#prependGraph(akka.stream.Graph,boolean)), [prependLazy](FlowOps.html#prependLazy(akka.stream.Graph)), [recover](FlowOps.html#recover(scala.PartialFunction)), [recoverWith](FlowOps.html#recoverWith(scala.PartialFunction)), [recoverWithRetries](FlowOps.html#recoverWithRetries(int,scala.PartialFunction)), [reduce](FlowOps.html#reduce(scala.Function2)), [scan](FlowOps.html#scan(T,scala.Function2)), [scanAsync](FlowOps.html#scanAsync(T,scala.Function2)), [sliding](FlowOps.html#sliding(int,int)), [sliding$default$2](FlowOps.html#sliding$default$2()), [splitAfter](FlowOps.html#splitAfter(akka.stream.SubstreamCancelStrategy,scala.Function1)), [splitAfter](FlowOps.html#splitAfter(scala.Function1)), [splitWhen](FlowOps.html#splitWhen(akka.stream.SubstreamCancelStrategy,scala.Function1)), [splitWhen](FlowOps.html#splitWhen(scala.Function1)), [statefulMap](FlowOps.html#statefulMap(scala.Function0,scala.Function2,scala.Function1)), [statefulMapConcat](FlowOps.html#statefulMapConcat(scala.Function0)), [take](FlowOps.html#take(long)), [takeWhile](FlowOps.html#takeWhile(scala.Function1)), [takeWhile](FlowOps.html#takeWhile(scala.Function1,boolean)), [takeWithin](FlowOps.html#takeWithin(scala.concurrent.duration.FiniteDuration)), [throttle](FlowOps.html#throttle(int,scala.concurrent.duration.FiniteDuration)), [throttle](FlowOps.html#throttle(int,scala.concurrent.duration.FiniteDuration,int,akka.stream.ThrottleMode)), [throttle](FlowOps.html#throttle(int,scala.concurrent.duration.FiniteDuration,int,scala.Function1,akka.stream.ThrottleMode)), [throttle](FlowOps.html#throttle(int,scala.concurrent.duration.FiniteDuration,scala.Function1)), [throttle](FlowOps.html#throttle(akka.stream.scaladsl.ThrottleControl)), [throttle](FlowOps.html#throttle(akka.stream.scaladsl.ThrottleControl,scala.Function1)), [to](FlowOps.html#to(akka.stream.Graph)), [via](FlowOps.html#via(akka.stream.Graph)), [watch](FlowOps.html#watch(akka.actor.ActorRef)), [wireTap](FlowOps.html#wireTap(akka.stream.Graph)), [wireTap](FlowOps.html#wireTap(scala.Function1)), [wireTapGraph](FlowOps.html#wireTapGraph(akka.stream.Graph)), [withAttributes](FlowOps.html#withAttributes(akka.stream.Attributes)), [zip](FlowOps.html#zip(akka.stream.Graph)), [zipAll](FlowOps.html#zipAll(akka.stream.Graph,A,U)), [zipAllFlow](FlowOps.html#zipAllFlow(akka.stream.Graph,A,U)), [zipGraph](FlowOps.html#zipGraph(akka.stream.Graph)), [zipLatest](FlowOps.html#zipLatest(akka.stream.Graph)), [zipLatestGraph](FlowOps.html#zipLatestGraph(akka.stream.Graph)), [zipLatestWith](FlowOps.html#zipLatestWith(akka.stream.Graph,boolean,scala.Function2)), [zipLatestWith](FlowOps.html#zipLatestWith(akka.stream.Graph,scala.Function2)), [zipLatestWithGraph](FlowOps.html#zipLatestWithGraph(akka.stream.Graph,boolean,scala.Function2)), [zipLatestWithGraph](FlowOps.html#zipLatestWithGraph(akka.stream.Graph,scala.Function2)), [zipWith](FlowOps.html#zipWith(akka.stream.Graph,scala.Function2)), [zipWithGraph](FlowOps.html#zipWithGraph(akka.stream.Graph,scala.Function2)), [zipWithIndex](FlowOps.html#zipWithIndex())`

- - ### Method Detail
	
	
	
		- #### alsoToMat
		
		
		
		```
		<Mat2,​Mat3> [FlowOpsMat](FlowOpsMat.html "interface in akka.stream.scaladsl") alsoToMat​([Graph](../Graph.html "interface in akka.stream")<[SinkShape](../SinkShape.html "class in akka.stream")<[Out](FlowOpsMat.html "type parameter in FlowOpsMat")>,​Mat2> that,
		                                       scala.Function2<[Mat](FlowOpsMat.html "type parameter in FlowOpsMat"),​Mat2,​Mat3> matF)
		```
		
		Attaches the given [`Sink`](Sink.html "class in akka.stream.scaladsl") to this [`Flow`](Flow.html "class in akka.stream.scaladsl"), meaning that elements that pass
		 through will also be sent to the [`Sink`](Sink.html "class in akka.stream.scaladsl").
		 
		
		See Also:
		[`It is recommended to use the internally optimized Keep.left and Keep.right combiners
		 where appropriate instead of manually writing functions that pass through one of the values.`](FlowOps.html#alsoTo(akka.stream.Graph))
		- #### concatLazyMat
		
		
		
		```
		<U,​Mat2,​Mat3> [FlowOpsMat](FlowOpsMat.html "interface in akka.stream.scaladsl") concatLazyMat​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<U>,​Mat2> that,
		                                                   scala.Function2<[Mat](FlowOpsMat.html "type parameter in FlowOpsMat"),​Mat2,​Mat3> matF)
		```
		
		Concatenate the given [`Source`](Source.html "class in akka.stream.scaladsl") to this [`Flow`](Flow.html "class in akka.stream.scaladsl"), meaning that once this
		 Flow\&rsquo;s input is exhausted and all result elements have been generated,
		 the Source\&rsquo;s elements will be produced.
		 
		 Note that the [`Source`](Source.html "class in akka.stream.scaladsl") is materialized together with this Flow, if `lazy` materialization is what is needed
		 the operator can be combined with `Source.lazy` to defer materialization of `that`.
		 
		
		
		 The second source is then kept from producing elements by asserting back\-pressure until its time comes.
		 
		
		
		 For a concat operator that is detached, use [`concatMat(akka.stream.Graph<akka.stream.SourceShape<U>, Mat2>, scala.Function2<Mat, Mat2, Mat3>)`](#concatMat(akka.stream.Graph,scala.Function2))
		- #### concatMat
		
		
		
		```
		<U,​Mat2,​Mat3> [FlowOpsMat](FlowOpsMat.html "interface in akka.stream.scaladsl") concatMat​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<U>,​Mat2> that,
		                                               scala.Function2<[Mat](FlowOpsMat.html "type parameter in FlowOpsMat"),​Mat2,​Mat3> matF)
		```
		
		Concatenate the given [`Source`](Source.html "class in akka.stream.scaladsl") to this [`Flow`](Flow.html "class in akka.stream.scaladsl"), meaning that once this
		 Flow\&rsquo;s input is exhausted and all result elements have been generated,
		 the Source\&rsquo;s elements will be produced.
		 
		 Note that the [`Source`](Source.html "class in akka.stream.scaladsl") is materialized together with this Flow and is "detached" meaning it will
		 in effect behave as a one element buffer in front of both the sources, that eagerly demands an element on start
		 (so it can not be combined with `Source.lazy` to defer materialization of `that`).
		 
		
		
		 The second source is then kept from producing elements by asserting back\-pressure until its time comes.
		 
		
		
		 When needing a concat operator that is not detached use [`concatLazyMat(akka.stream.Graph<akka.stream.SourceShape<U>, Mat2>, scala.Function2<Mat, Mat2, Mat3>)`](#concatLazyMat(akka.stream.Graph,scala.Function2))
		- #### divertToMat
		
		
		
		```
		<Mat2,​Mat3> [FlowOpsMat](FlowOpsMat.html "interface in akka.stream.scaladsl") divertToMat​([Graph](../Graph.html "interface in akka.stream")<[SinkShape](../SinkShape.html "class in akka.stream")<[Out](FlowOpsMat.html "type parameter in FlowOpsMat")>,​Mat2> that,
		                                         scala.Function1<[Out](FlowOpsMat.html "type parameter in FlowOpsMat"),​java.lang.Object> when,
		                                         scala.Function2<[Mat](FlowOpsMat.html "type parameter in FlowOpsMat"),​Mat2,​Mat3> matF)
		```
		
		Attaches the given [`Sink`](Sink.html "class in akka.stream.scaladsl") to this [`Flow`](Flow.html "class in akka.stream.scaladsl"), meaning that elements will be sent to the [`Sink`](Sink.html "class in akka.stream.scaladsl")
		 instead of being passed through if the predicate `when` returns `true`.
		 
		
		See Also:
		[`It is recommended to use the internally optimized Keep.left and Keep.right combiners
		 where appropriate instead of manually writing functions that pass through one of the values.`](FlowOps.html#divertTo(akka.stream.Graph,scala.Function1))
		- #### flatMapPrefixMat
		
		
		
		```
		<Out2,​Mat2,​Mat3> [FlowOpsMat](FlowOpsMat.html "interface in akka.stream.scaladsl") flatMapPrefixMat​(int n,
		                                                         scala.Function1<scala.collection.immutable.Seq<[Out](FlowOpsMat.html "type parameter in FlowOpsMat")>,​[Flow](Flow.html "class in akka.stream.scaladsl")<[Out](FlowOpsMat.html "type parameter in FlowOpsMat"),​Out2,​Mat2>> f,
		                                                         scala.Function2<[Mat](FlowOpsMat.html "type parameter in FlowOpsMat"),​scala.concurrent.Future<Mat2>,​Mat3> matF)
		```
		
		mat version of [`FlowOps.flatMapPrefix(int, scala.Function1<scala.collection.immutable.Seq<Out>, akka.stream.scaladsl.Flow<Out, Out2, Mat2>>)`](FlowOps.html#flatMapPrefix(int,scala.Function1)), this method gives access to a future materialized value of the downstream flow.
		 see [`FlowOps.flatMapPrefix(int, scala.Function1<scala.collection.immutable.Seq<Out>, akka.stream.scaladsl.Flow<Out, Out2, Mat2>>)`](FlowOps.html#flatMapPrefix(int,scala.Function1)) for details.
		- #### interleaveMat
		
		
		
		```
		<U,​Mat2,​Mat3> [FlowOpsMat](FlowOpsMat.html "interface in akka.stream.scaladsl") interleaveMat​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<U>,​Mat2> that,
		                                                   int segmentSize,
		                                                   scala.Function2<[Mat](FlowOpsMat.html "type parameter in FlowOpsMat"),​Mat2,​Mat3> matF)
		```
		
		Interleave is a deterministic merge of the given [`Source`](Source.html "class in akka.stream.scaladsl") with elements of this [`Flow`](Flow.html "class in akka.stream.scaladsl").
		 It first emits `segmentSize` number of elements from this flow to downstream, then \- same amount for `that` source,
		 then repeat process.
		 
		 After one of upstreams is complete then all the rest elements will be emitted from the second one
		 
		
		
		 If it gets error from one of upstreams \- stream completes with failure.
		- #### interleaveMat
		
		
		
		```
		<U,​Mat2,​Mat3> [FlowOpsMat](FlowOpsMat.html "interface in akka.stream.scaladsl") interleaveMat​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<U>,​Mat2> that,
		                                                   int segmentSize,
		                                                   boolean eagerClose,
		                                                   scala.Function2<[Mat](FlowOpsMat.html "type parameter in FlowOpsMat"),​Mat2,​Mat3> matF)
		```
		
		Interleave is a deterministic merge of the given [`Source`](Source.html "class in akka.stream.scaladsl") with elements of this [`Flow`](Flow.html "class in akka.stream.scaladsl").
		 It first emits `segmentSize` number of elements from this flow to downstream, then \- same amount for `that` source,
		 then repeat process.
		 
		 If eagerClose is false and one of the upstreams complete the elements from the other upstream will continue passing
		 through the interleave operator. If eagerClose is true and one of the upstream complete interleave will cancel the
		 other upstream and complete itself.
		 
		
		
		 If it gets error from one of upstreams \- stream completes with failure.
		- #### mapMaterializedValue
		
		
		
		```
		<Mat2> [FlowOpsMat](FlowOpsMat.html "interface in akka.stream.scaladsl") mapMaterializedValue​(scala.Function1<[Mat](FlowOpsMat.html "type parameter in FlowOpsMat"),​Mat2> f)
		```
		
		Transform the materialized value of this graph, leaving all other properties as they were.
		- #### mergeLatestMat
		
		
		
		```
		<U,​Mat2,​Mat3> [FlowOpsMat](FlowOpsMat.html "interface in akka.stream.scaladsl") mergeLatestMat​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<U>,​Mat2> that,
		                                                    boolean eagerClose,
		                                                    scala.Function2<[Mat](FlowOpsMat.html "type parameter in FlowOpsMat"),​Mat2,​Mat3> matF)
		```
		
		MergeLatest joins elements from N input streams into stream of lists of size N.
		 i\-th element in list is the latest emitted element from i\-th input stream.
		 MergeLatest emits list for each element emitted from some input stream,
		 but only after each input stream emitted at least one element.
		- #### mergeMat
		
		
		
		```
		<U,​Mat2,​Mat3> [FlowOpsMat](FlowOpsMat.html "interface in akka.stream.scaladsl") mergeMat​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<U>,​Mat2> that,
		                                              boolean eagerComplete,
		                                              scala.Function2<[Mat](FlowOpsMat.html "type parameter in FlowOpsMat"),​Mat2,​Mat3> matF)
		```
		
		Merge the given [`Source`](Source.html "class in akka.stream.scaladsl") to this [`Flow`](Flow.html "class in akka.stream.scaladsl"), taking elements as they arrive from input streams,
		 picking randomly when several elements ready.
		- #### mergeMat$default$2
		
		
		
		```
		<U,​Mat2,​Mat3> boolean mergeMat$default$2()
		```
		- #### mergePreferredMat
		
		
		
		```
		<U,​Mat2,​Mat3> [FlowOpsMat](FlowOpsMat.html "interface in akka.stream.scaladsl") mergePreferredMat​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<U>,​Mat2> that,
		                                                       boolean preferred,
		                                                       boolean eagerClose,
		                                                       scala.Function2<[Mat](FlowOpsMat.html "type parameter in FlowOpsMat"),​Mat2,​Mat3> matF)
		```
		
		Merge two sources. Prefer one source if both sources have elements ready.
		 
		
		See Also:
		[`It is recommended to use the internally optimized Keep.left and Keep.right combiners
		 where appropriate instead of manually writing functions that pass through one of the values.`](FlowOps.html#mergePreferred(akka.stream.Graph,boolean,boolean))
		- #### mergePrioritizedMat
		
		
		
		```
		<U,​Mat2,​Mat3> [FlowOpsMat](FlowOpsMat.html "interface in akka.stream.scaladsl") mergePrioritizedMat​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<U>,​Mat2> that,
		                                                         int leftPriority,
		                                                         int rightPriority,
		                                                         boolean eagerClose,
		                                                         scala.Function2<[Mat](FlowOpsMat.html "type parameter in FlowOpsMat"),​Mat2,​Mat3> matF)
		```
		
		Merge two sources. Prefer the sources depending on the 'priority' parameters.
		 
		 It is recommended to use the internally optimized `Keep.left` and `Keep.right` combiners
		 where appropriate instead of manually writing functions that pass through one of the values.
		- #### mergeSortedMat
		
		
		
		```
		<U,​Mat2,​Mat3> [FlowOpsMat](FlowOpsMat.html "interface in akka.stream.scaladsl") mergeSortedMat​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<U>,​Mat2> that,
		                                                    scala.Function2<[Mat](FlowOpsMat.html "type parameter in FlowOpsMat"),​Mat2,​Mat3> matF,
		                                                    scala.math.Ordering<U> ord)
		```
		
		Merge the given [`Source`](Source.html "class in akka.stream.scaladsl") to this [`Flow`](Flow.html "class in akka.stream.scaladsl"), taking elements as they arrive from input streams,
		 picking always the smallest of the available elements (waiting for one element from each side
		 to be available). This means that possible contiguity of the input streams is not exploited to avoid
		 waiting for elements, this merge will block when one of the inputs does not have more elements (and
		 does not complete).
		- #### monitor
		
		
		
		```
		[FlowOpsMat](FlowOpsMat.html "interface in akka.stream.scaladsl") monitor()
		```
		
		Materializes to `(Mat, FlowMonitor[Out])`, which is unlike most other operators (!),
		 in which usually the default materialized value keeping semantics is to keep the left value
		 (by passing `Keep.left()` to a `*Mat` version of a method). This operator is an exception from
		 that rule and keeps both values since dropping its sole purpose is to introduce that materialized value.
		 
		 The `FlowMonitor[Out]` allows monitoring of the current flow. All events are propagated
		 by the monitor unchanged. Note that the monitor inserts a memory barrier every time it processes an
		 event, and may therefor affect performance.
		- #### monitorMat
		
		
		
		```
		<Mat2> [FlowOpsMat](FlowOpsMat.html "interface in akka.stream.scaladsl") monitorMat​(scala.Function2<[Mat](FlowOpsMat.html "type parameter in FlowOpsMat"),​[FlowMonitor](../FlowMonitor.html "interface in akka.stream")<[Out](FlowOpsMat.html "type parameter in FlowOpsMat")>,​Mat2> combine)
		```
		
		Materializes to `FlowMonitor[Out]` that allows monitoring of the current flow. All events are propagated
		 by the monitor unchanged. Note that the monitor inserts a memory barrier every time it processes an
		 event, and may therefor affect performance.
		 
		 The `combine` function is used to combine the `FlowMonitor` with this flow's materialized value.
		- #### orElseMat
		
		
		
		```
		<U,​Mat2,​Mat3> [FlowOpsMat](FlowOpsMat.html "interface in akka.stream.scaladsl") orElseMat​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<U>,​Mat2> secondary,
		                                               scala.Function2<[Mat](FlowOpsMat.html "type parameter in FlowOpsMat"),​Mat2,​Mat3> matF)
		```
		
		Provides a secondary source that will be consumed if this stream completes without any
		 elements passing by. As soon as the first element comes through this stream, the alternative
		 will be cancelled.
		 
		 Note that this Flow will be materialized together with the [`Source`](Source.html "class in akka.stream.scaladsl") and just kept
		 from producing elements by asserting back\-pressure until its time comes or it gets
		 cancelled.
		 
		
		
		 On errors the operator is failed regardless of source of the error.
		 
		
		
		 '''Emits when''' element is available from first stream or first stream closed without emitting any elements and an element
		 is available from the second stream
		 
		
		
		 '''Backpressures when''' downstream backpressures
		 
		
		
		 '''Completes when''' the primary stream completes after emitting at least one element, when the primary stream completes
		 without emitting and the secondary stream already has completed or when the secondary stream completes
		 
		
		
		 '''Cancels when''' downstream cancels and additionally the alternative is cancelled as soon as an element passes
		 by from this stream.
		- #### prependLazyMat
		
		
		
		```
		<U,​Mat2,​Mat3> [FlowOpsMat](FlowOpsMat.html "interface in akka.stream.scaladsl") prependLazyMat​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<U>,​Mat2> that,
		                                                    scala.Function2<[Mat](FlowOpsMat.html "type parameter in FlowOpsMat"),​Mat2,​Mat3> matF)
		```
		
		Prepend the given [`Source`](Source.html "class in akka.stream.scaladsl") to this [`Flow`](Flow.html "class in akka.stream.scaladsl"), meaning that before elements
		 are generated from this Flow, the Source's elements will be produced until it
		 is exhausted, at which point Flow elements will start being produced.
		 
		 Note that the [`Source`](Source.html "class in akka.stream.scaladsl") is materialized together with this Flow and is "detached" meaning
		 in effect behave as a one element buffer in front of both the sources, that eagerly demands an element on start
		 (so it can not be combined with `Source.lazy` to defer materialization of `that`).
		 
		
		
		 This flow will then be kept from producing elements by asserting back\-pressure until its time comes.
		 
		
		
		 When needing a prepend operator that is not detached use [`prependLazyMat(akka.stream.Graph<akka.stream.SourceShape<U>, Mat2>, scala.Function2<Mat, Mat2, Mat3>)`](#prependLazyMat(akka.stream.Graph,scala.Function2))
		- #### prependMat
		
		
		
		```
		<U,​Mat2,​Mat3> [FlowOpsMat](FlowOpsMat.html "interface in akka.stream.scaladsl") prependMat​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<U>,​Mat2> that,
		                                                scala.Function2<[Mat](FlowOpsMat.html "type parameter in FlowOpsMat"),​Mat2,​Mat3> matF)
		```
		
		Prepend the given [`Source`](Source.html "class in akka.stream.scaladsl") to this [`Flow`](Flow.html "class in akka.stream.scaladsl"), meaning that before elements
		 are generated from this Flow, the Source's elements will be produced until it
		 is exhausted, at which point Flow elements will start being produced.
		 
		 Note that this Flow will be materialized together with the [`Source`](Source.html "class in akka.stream.scaladsl") and just kept
		 from producing elements by asserting back\-pressure until its time comes.
		 
		
		
		 If the given [`Source`](Source.html "class in akka.stream.scaladsl") gets upstream error \- no elements from this [`Flow`](Flow.html "class in akka.stream.scaladsl") will be pulled.
		 
		
		
		 When needing a concat operator that is not detached use [`prependLazyMat(akka.stream.Graph<akka.stream.SourceShape<U>, Mat2>, scala.Function2<Mat, Mat2, Mat3>)`](#prependLazyMat(akka.stream.Graph,scala.Function2))
		- #### toMat
		
		
		
		```
		<Mat2,​Mat3> [Graph](../Graph.html "interface in akka.stream") toMat​([Graph](../Graph.html "interface in akka.stream")<[SinkShape](../SinkShape.html "class in akka.stream")<[Out](FlowOpsMat.html "type parameter in FlowOpsMat")>,​Mat2> sink,
		                              scala.Function2<[Mat](FlowOpsMat.html "type parameter in FlowOpsMat"),​Mat2,​Mat3> combine)
		```
		
		Connect this [`Flow`](Flow.html "class in akka.stream.scaladsl") to a [`Sink`](Sink.html "class in akka.stream.scaladsl"), concatenating the processing steps of both.
		 
		```
		
		     +----------------------------+
		     | Resulting Sink             |
		     |                            |
		     |  +------+        +------+  |
		     |  |      |        |      |  |
		 In ~~> | flow | ~Out~> | sink |  |
		     |  |      |        |      |  |
		     |  +------+        +------+  |
		     +----------------------------+
		 
		```
		
		 The `combine` function is used to compose the materialized values of this flow and that
		 Sink into the materialized value of the resulting Sink.
		 
		 It is recommended to use the internally optimized `Keep.left` and `Keep.right` combiners
		 where appropriate instead of manually writing functions that pass through one of the values.
		- #### viaMat
		
		
		
		```
		<T,​Mat2,​Mat3> [FlowOpsMat](FlowOpsMat.html "interface in akka.stream.scaladsl") viaMat​([Graph](../Graph.html "interface in akka.stream")<[FlowShape](../FlowShape.html "class in akka.stream")<[Out](FlowOpsMat.html "type parameter in FlowOpsMat"),​T>,​Mat2> flow,
		                                            scala.Function2<[Mat](FlowOpsMat.html "type parameter in FlowOpsMat"),​Mat2,​Mat3> combine)
		```
		
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
		- #### watchTermination
		
		
		
		```
		<Mat2> [FlowOpsMat](FlowOpsMat.html "interface in akka.stream.scaladsl") watchTermination​(scala.Function2<[Mat](FlowOpsMat.html "type parameter in FlowOpsMat"),​scala.concurrent.Future<[Done](../../Done.html "class in akka")>,​Mat2> matF)
		```
		
		Materializes to `Future[Done]` that completes on getting termination message.
		 The Future completes with success when received complete message from upstream or cancel
		 from downstream. It fails with the propagated error when received error message from
		 upstream or downstream.
		 
		 It is recommended to use the internally optimized `Keep.left` and `Keep.right` combiners
		 where appropriate instead of manually writing functions that pass through one of the values.
		- #### wireTapMat
		
		
		
		```
		<Mat2,​Mat3> [FlowOpsMat](FlowOpsMat.html "interface in akka.stream.scaladsl") wireTapMat​([Graph](../Graph.html "interface in akka.stream")<[SinkShape](../SinkShape.html "class in akka.stream")<[Out](FlowOpsMat.html "type parameter in FlowOpsMat")>,​Mat2> that,
		                                        scala.Function2<[Mat](FlowOpsMat.html "type parameter in FlowOpsMat"),​Mat2,​Mat3> matF)
		```
		
		Attaches the given [`Sink`](Sink.html "class in akka.stream.scaladsl") to this [`Flow`](Flow.html "class in akka.stream.scaladsl") as a wire tap, meaning that elements that pass
		 through will also be sent to the wire\-tap Sink, without the latter affecting the mainline flow.
		 If the wire\-tap Sink backpressures, elements that would've been sent to it will be dropped instead.
		 
		 It is similar to [`alsoToMat(akka.stream.Graph<akka.stream.SinkShape<Out>, Mat2>, scala.Function2<Mat, Mat2, Mat3>)`](#alsoToMat(akka.stream.Graph,scala.Function2)) which does backpressure instead of dropping elements.
		 
		
		
		
		See Also:
		[`It is recommended to use the internally optimized Keep.left and Keep.right combiners
		 where appropriate instead of manually writing functions that pass through one of the values.`](FlowOps.html#wireTap(scala.Function1))
		- #### zipAllMat
		
		
		
		```
		<U,​Mat2,​Mat3,​A> [FlowOpsMat](FlowOpsMat.html "interface in akka.stream.scaladsl") zipAllMat​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<U>,​Mat2> that,
		                                                       A thisElem,
		                                                       U thatElem,
		                                                       scala.Function2<[Mat](FlowOpsMat.html "type parameter in FlowOpsMat"),​Mat2,​Mat3> matF)
		```
		
		Combine the elements of current flow and the given [`Source`](Source.html "class in akka.stream.scaladsl") into a stream of tuples.
		 
		
		See Also:
		[`'''Emits when''' at first emits when both inputs emit, and then as long as any input emits (coupled to the default value of the completed input).
		 
		 '''Backpressures when''' downstream backpressures
		 
		 '''Completes when''' all upstream completes
		 
		 '''Cancels when''' downstream cancels`](FlowOps.html#zipAll(akka.stream.Graph,A,U))
		- #### zipLatestMat
		
		
		
		```
		<U,​Mat2,​Mat3> [FlowOpsMat](FlowOpsMat.html "interface in akka.stream.scaladsl") zipLatestMat​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<U>,​Mat2> that,
		                                                  scala.Function2<[Mat](FlowOpsMat.html "type parameter in FlowOpsMat"),​Mat2,​Mat3> matF)
		```
		
		Combine the elements of current flow and the given [`Source`](Source.html "class in akka.stream.scaladsl") into a stream of tuples,
		 picking always the latest of the elements of each source.
		- #### zipLatestWithMat
		
		
		
		```
		<Out2,​Out3,​Mat2,​Mat3> [FlowOpsMat](FlowOpsMat.html "interface in akka.stream.scaladsl") zipLatestWithMat​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<Out2>,​Mat2> that,
		                                                                    scala.Function2<[Out](FlowOpsMat.html "type parameter in FlowOpsMat"),​Out2,​Out3> combine,
		                                                                    scala.Function2<[Mat](FlowOpsMat.html "type parameter in FlowOpsMat"),​Mat2,​Mat3> matF)
		```
		
		Put together the elements of current flow and the given [`Source`](Source.html "class in akka.stream.scaladsl")
		 into a stream of combined elements using a combiner function, picking always the latest of the elements of each source.
		- #### zipLatestWithMat
		
		
		
		```
		<Out2,​Out3,​Mat2,​Mat3> [FlowOpsMat](FlowOpsMat.html "interface in akka.stream.scaladsl") zipLatestWithMat​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<Out2>,​Mat2> that,
		                                                                    boolean eagerComplete,
		                                                                    scala.Function2<[Out](FlowOpsMat.html "type parameter in FlowOpsMat"),​Out2,​Out3> combine,
		                                                                    scala.Function2<[Mat](FlowOpsMat.html "type parameter in FlowOpsMat"),​Mat2,​Mat3> matF)
		```
		
		Put together the elements of current flow and the given [`Source`](Source.html "class in akka.stream.scaladsl")
		 into a stream of combined elements using a combiner function, picking always the latest of the elements of each source.
		- #### zipMat
		
		
		
		```
		<U,​Mat2,​Mat3> [FlowOpsMat](FlowOpsMat.html "interface in akka.stream.scaladsl") zipMat​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<U>,​Mat2> that,
		                                            scala.Function2<[Mat](FlowOpsMat.html "type parameter in FlowOpsMat"),​Mat2,​Mat3> matF)
		```
		
		Combine the elements of current flow and the given [`Source`](Source.html "class in akka.stream.scaladsl") into a stream of tuples.
		- #### zipWithMat
		
		
		
		```
		<Out2,​Out3,​Mat2,​Mat3> [FlowOpsMat](FlowOpsMat.html "interface in akka.stream.scaladsl") zipWithMat​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<Out2>,​Mat2> that,
		                                                              scala.Function2<[Out](FlowOpsMat.html "type parameter in FlowOpsMat"),​Out2,​Out3> combine,
		                                                              scala.Function2<[Mat](FlowOpsMat.html "type parameter in FlowOpsMat"),​Mat2,​Mat3> matF)
		```
		
		Put together the elements of current flow and the given [`Source`](Source.html "class in akka.stream.scaladsl")
		 into a stream of combined elements using a combiner function.

## Code Examples

### Example 1: toMat

```text
+----------------------------+
     | Resulting Sink             |
     |                            |
     |  +------+        +------+  |
     |  |      |        |      |  |
 In ~~> | flow | ~Out~> | sink |  |
     |  |      |        |      |  |
     |  +------+        +------+  |
     +----------------------------+
```

### Example 2: viaMat

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

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/2.10/akka/Done.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/FlowMonitor.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/FlowShape.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/Graph.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/SinkShape.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/SourceShape.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/scaladsl/Flow.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/scaladsl/FlowOps.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/scaladsl/FlowOpsMat.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/scaladsl/Sink.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/scaladsl/Source.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/scaladsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/2.10/akka/stream/scaladsl/FlowOpsMat.html](https://doc.akka.io/japi/akka/2.10/akka/stream/scaladsl/FlowOpsMat.html)*