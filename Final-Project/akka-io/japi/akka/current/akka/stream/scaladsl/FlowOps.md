---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:40:47Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/FlowOps.html
title: FlowOps
---

# FlowOps

## Content

Package [akka.stream.scaladsl](package-summary.html)
## Interface FlowOps\<Out,​Mat\>

- All Known Subinterfaces:
`[FlowOpsMat](FlowOpsMat.html "interface in akka.stream.scaladsl")<Out,​Mat>`, `[SubFlow](SubFlow.html "interface in akka.stream.scaladsl")<Out,​Mat,​F,​C>`

All Known Implementing Classes:
`[Flow](Flow.html "class in akka.stream.scaladsl")`, `[Source](Source.html "class in akka.stream.scaladsl")`

---

```
public interface FlowOps<Out,​Mat>
```

Scala API: Operations offered by Sources and Flows with a free output side: the DSL flows left\-to\-right only.
 
 INTERNAL API: this trait will be changed in binary\-incompatible ways for classes that are derived from it!
 Do not implement this interface outside the Akka code base!
 

 Binary compatibility is only maintained for callers of this trait\&rsquo;s interface.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `<U,​M>[FlowOps](FlowOps.html "interface in akka.stream.scaladsl")` | `[$plus$plus](#$plus$plus(akka.stream.Graph))​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<U>,​M> that)` | Concatenates this [`Flow`](Flow.html "class in akka.stream.scaladsl") with the given [`Source`](Source.html "class in akka.stream.scaladsl") so the first element  emitted by that source is emitted after the last element of this  flow. |
	| `[FlowOps](FlowOps.html "interface in akka.stream.scaladsl")` | `[addAttributes](#addAttributes(akka.stream.Attributes))​([Attributes](../Attributes.html "class in akka.stream") attr)` |  |
	| `<Agg,​Emit>[FlowOps](FlowOps.html "interface in akka.stream.scaladsl")` | `[aggregateWithBoundary](#aggregateWithBoundary(scala.Function0,scala.Function2,scala.Function1,scala.Option))​(scala.Function0<Agg> allocate,  scala.Function2<Agg,​[Out](FlowOps.html "type parameter in FlowOps"),​scala.Tuple2<Agg,​java.lang.Object>> aggregate,  scala.Function1<Agg,​Emit> harvest,  scala.Option<scala.Tuple2<scala.Function1<Agg,​java.lang.Object>,​scala.concurrent.duration.FiniteDuration>> emitOnTimer)` | Aggregate input elements into an arbitrary data structure that can be completed and emitted downstream  when custom condition is met which can be triggered by aggregate or timer. |
	| `[FlowOps](FlowOps.html "interface in akka.stream.scaladsl")` | `[alsoTo](#alsoTo(akka.stream.Graph))​([Graph](../Graph.html "interface in akka.stream")<[SinkShape](../SinkShape.html "class in akka.stream")<[Out](FlowOps.html "type parameter in FlowOps")>,​?> that)` | Attaches the given [`Sink`](Sink.html "class in akka.stream.scaladsl") to this [`Source`](Source.html "class in akka.stream.scaladsl"), meaning that elements that pass  through will also be sent to the [`Sink`](Sink.html "class in akka.stream.scaladsl"). |
	| `[FlowOps](FlowOps.html "interface in akka.stream.scaladsl")` | `[alsoToAll](#alsoToAll(scala.collection.immutable.Seq))​(scala.collection.immutable.Seq<[Graph](../Graph.html "interface in akka.stream")<[SinkShape](../SinkShape.html "class in akka.stream")<[Out](FlowOps.html "type parameter in FlowOps")>,​?>> those)` | Attaches the given [`Sink`](Sink.html "class in akka.stream.scaladsl")s to this [`Source`](Source.html "class in akka.stream.scaladsl"), meaning that elements that pass  through will also be sent to the [`Sink`](Sink.html "class in akka.stream.scaladsl"). |
	| `<M> [Graph](../Graph.html "interface in akka.stream")<[FlowShape](../FlowShape.html "class in akka.stream")<[Out](FlowOps.html "type parameter in FlowOps"),​[Out](FlowOps.html "type parameter in FlowOps")>,​M>` | `[alsoToGraph](#alsoToGraph(akka.stream.Graph))​([Graph](../Graph.html "interface in akka.stream")<[SinkShape](../SinkShape.html "class in akka.stream")<[Out](FlowOps.html "type parameter in FlowOps")>,​M> that)` |  |
	| `<S> [FlowOps](FlowOps.html "interface in akka.stream.scaladsl")` | `[ask](#ask(int,akka.actor.ActorRef,akka.util.Timeout,scala.reflect.ClassTag))​(int parallelism,  [ActorRef](../../actor/ActorRef.html "class in akka.actor") ref,  [Timeout](../../util/Timeout.html "class in akka.util") timeout,  scala.reflect.ClassTag<S> tag)` | Use the `ask` pattern to send a request\-reply message to the target `ref` actor. |
	| `<S> [FlowOps](FlowOps.html "interface in akka.stream.scaladsl")` | `[ask](#ask(akka.actor.ActorRef,akka.util.Timeout,scala.reflect.ClassTag))​([ActorRef](../../actor/ActorRef.html "class in akka.actor") ref,  [Timeout](../../util/Timeout.html "class in akka.util") timeout,  scala.reflect.ClassTag<S> tag)` | Use the `ask` pattern to send a request\-reply message to the target `ref` actor. |
	| `[FlowOps](FlowOps.html "interface in akka.stream.scaladsl")` | `[async](#async())()` | Put an asynchronous boundary around this `Flow`. |
	| `[FlowOps](FlowOps.html "interface in akka.stream.scaladsl")` | `[backpressureTimeout](#backpressureTimeout(scala.concurrent.duration.FiniteDuration))​(scala.concurrent.duration.FiniteDuration timeout)` | If the time between the emission of an element and the following downstream demand exceeds the provided timeout,  the stream is failed with a [`BackpressureTimeoutException`](../BackpressureTimeoutException.html "class in akka.stream"). |
	| `<S> [FlowOps](FlowOps.html "interface in akka.stream.scaladsl")` | `[batch](#batch(long,scala.Function1,scala.Function2))​(long max,  scala.Function1<[Out](FlowOps.html "type parameter in FlowOps"),​S> seed,  scala.Function2<S,​[Out](FlowOps.html "type parameter in FlowOps"),​S> aggregate)` | Allows a faster upstream to progress independently of a slower subscriber by aggregating elements into batches  until the subscriber is ready to accept them. |
	| `<S> [FlowOps](FlowOps.html "interface in akka.stream.scaladsl")` | `[batchWeighted](#batchWeighted(long,scala.Function1,scala.Function1,scala.Function2))​(long max,  scala.Function1<[Out](FlowOps.html "type parameter in FlowOps"),​java.lang.Object> costFn,  scala.Function1<[Out](FlowOps.html "type parameter in FlowOps"),​S> seed,  scala.Function2<S,​[Out](FlowOps.html "type parameter in FlowOps"),​S> aggregate)` | Allows a faster upstream to progress independently of a slower subscriber by aggregating elements into batches  until the subscriber is ready to accept them. |
	| `[FlowOps](FlowOps.html "interface in akka.stream.scaladsl")` | `[buffer](#buffer(int,akka.stream.OverflowStrategy))​(int size,  [OverflowStrategy](../OverflowStrategy.html "class in akka.stream") overflowStrategy)` | Adds a fixed size buffer in the flow that allows to store elements from a faster upstream until it becomes full. |
	| `<T> [FlowOps](FlowOps.html "interface in akka.stream.scaladsl")` | `[collect](#collect(scala.PartialFunction))​(scala.PartialFunction<[Out](FlowOps.html "type parameter in FlowOps"),​T> pf)` | Transform this stream by applying the given partial function to each of the elements  on which the function is defined as they pass through this processing step. |
	| `<T> [FlowOps](FlowOps.html "interface in akka.stream.scaladsl")` | `[collectType](#collectType(scala.reflect.ClassTag))​(scala.reflect.ClassTag<T> tag)` | Transform this stream by testing the type of each of the elements  on which the element is an instance of the provided type as they pass through this processing step. |
	| `[FlowOps](FlowOps.html "interface in akka.stream.scaladsl")` | `[completionTimeout](#completionTimeout(scala.concurrent.duration.FiniteDuration))​(scala.concurrent.duration.FiniteDuration timeout)` | If the completion of the stream does not happen until the provided timeout, the stream is failed  with a [`CompletionTimeoutException`](../CompletionTimeoutException.html "class in akka.stream"). |
	| `<U,​Mat2>[FlowOps](FlowOps.html "interface in akka.stream.scaladsl")` | `[concat](#concat(akka.stream.Graph))​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<U>,​Mat2> that)` | Concatenate the given [`Source`](Source.html "class in akka.stream.scaladsl") to this [`Flow`](Flow.html "class in akka.stream.scaladsl"), meaning that once this  Flow\&rsquo;s input is exhausted and all result elements have been generated,  the Source\&rsquo;s elements will be produced. |
	| `<U> [FlowOps](FlowOps.html "interface in akka.stream.scaladsl")` | `[concatAllLazy](#concatAllLazy(scala.collection.immutable.Seq))​(scala.collection.immutable.Seq<[Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<U>,​?>> those)` | Concatenate the given [`Source`](Source.html "class in akka.stream.scaladsl")s to this [`Flow`](Flow.html "class in akka.stream.scaladsl"), meaning that once this  Flow\&rsquo;s input is exhausted and all result elements have been generated,  the [`Source`](Source.html "class in akka.stream.scaladsl")s' elements will be produced. |
	| `<U,​Mat2>[Graph](../Graph.html "interface in akka.stream")<[FlowShape](../FlowShape.html "class in akka.stream")<[Out](FlowOps.html "type parameter in FlowOps"),​U>,​Mat2>` | `[concatGraph](#concatGraph(akka.stream.Graph,boolean))​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<U>,​Mat2> that,  boolean detached)` |  |
	| `<U,​Mat2>[FlowOps](FlowOps.html "interface in akka.stream.scaladsl")` | `[concatLazy](#concatLazy(akka.stream.Graph))​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<U>,​Mat2> that)` | Concatenate the given [`Source`](Source.html "class in akka.stream.scaladsl") to this [`Flow`](Flow.html "class in akka.stream.scaladsl"), meaning that once this  Flow\&rsquo;s input is exhausted and all result elements have been generated,  the Source\&rsquo;s elements will be produced. |
	| `<O2> [FlowOps](FlowOps.html "interface in akka.stream.scaladsl")` | `[conflate](#conflate(scala.Function2))​(scala.Function2<O2,​O2,​O2> aggregate)` | Allows a faster upstream to progress independently of a slower subscriber by conflating elements into a summary  until the subscriber is ready to accept them. |
	| `<S> [FlowOps](FlowOps.html "interface in akka.stream.scaladsl")` | `[conflateWithSeed](#conflateWithSeed(scala.Function1,scala.Function2))​(scala.Function1<[Out](FlowOps.html "type parameter in FlowOps"),​S> seed,  scala.Function2<S,​[Out](FlowOps.html "type parameter in FlowOps"),​S> aggregate)` | Allows a faster upstream to progress independently of a slower subscriber by conflating elements into a summary  until the subscriber is ready to accept them. |
	| `[FlowOps](FlowOps.html "interface in akka.stream.scaladsl")` | `[delay](#delay(scala.concurrent.duration.FiniteDuration,akka.stream.DelayOverflowStrategy))​(scala.concurrent.duration.FiniteDuration of,  [DelayOverflowStrategy](../DelayOverflowStrategy.html "class in akka.stream") strategy)` | Shifts elements emission in time by a specified amount. |
	| `[DelayOverflowStrategy](../DelayOverflowStrategy.html "class in akka.stream")` | `[delay$default$2](#delay$default$2())()` |  |
	| `[FlowOps](FlowOps.html "interface in akka.stream.scaladsl")` | `[delayWith](#delayWith(scala.Function0,akka.stream.DelayOverflowStrategy))​(scala.Function0<[DelayStrategy](DelayStrategy.html "interface in akka.stream.scaladsl")<[Out](FlowOps.html "type parameter in FlowOps")>> delayStrategySupplier,  [DelayOverflowStrategy](../DelayOverflowStrategy.html "class in akka.stream") overFlowStrategy)` | Shifts elements emission in time by an amount individually determined through delay strategy a specified amount. |
	| `[FlowOps](FlowOps.html "interface in akka.stream.scaladsl")` | `[detach](#detach())()` | Detaches upstream demand from downstream demand without detaching the  stream rates; in other words acts like a buffer of size 1\. |
	| `[FlowOps](FlowOps.html "interface in akka.stream.scaladsl")` | `[divertTo](#divertTo(akka.stream.Graph,scala.Function1))​([Graph](../Graph.html "interface in akka.stream")<[SinkShape](../SinkShape.html "class in akka.stream")<[Out](FlowOps.html "type parameter in FlowOps")>,​?> that,  scala.Function1<[Out](FlowOps.html "type parameter in FlowOps"),​java.lang.Object> when)` | Attaches the given [`Sink`](Sink.html "class in akka.stream.scaladsl") to this [`Flow`](Flow.html "class in akka.stream.scaladsl"), meaning that elements will be sent to the [`Sink`](Sink.html "class in akka.stream.scaladsl")  instead of being passed through if the predicate `when` returns `true`. |
	| `<M> [Graph](../Graph.html "interface in akka.stream")<[FlowShape](../FlowShape.html "class in akka.stream")<[Out](FlowOps.html "type parameter in FlowOps"),​[Out](FlowOps.html "type parameter in FlowOps")>,​M>` | `[divertToGraph](#divertToGraph(akka.stream.Graph,scala.Function1))​([Graph](../Graph.html "interface in akka.stream")<[SinkShape](../SinkShape.html "class in akka.stream")<[Out](FlowOps.html "type parameter in FlowOps")>,​M> that,  scala.Function1<[Out](FlowOps.html "type parameter in FlowOps"),​java.lang.Object> when)` |  |
	| `[FlowOps](FlowOps.html "interface in akka.stream.scaladsl")` | `[drop](#drop(long))​(long n)` | Discard the given number of elements at the beginning of the stream. |
	| `[FlowOps](FlowOps.html "interface in akka.stream.scaladsl")` | `[dropWhile](#dropWhile(scala.Function1))​(scala.Function1<[Out](FlowOps.html "type parameter in FlowOps"),​java.lang.Object> p)` | Discard elements at the beginning of the stream while predicate is true. |
	| `[FlowOps](FlowOps.html "interface in akka.stream.scaladsl")` | `[dropWithin](#dropWithin(scala.concurrent.duration.FiniteDuration))​(scala.concurrent.duration.FiniteDuration d)` | Discard the elements received within the given duration at beginning of the stream. |
	| `<U> [FlowOps](FlowOps.html "interface in akka.stream.scaladsl")` | `[expand](#expand(scala.Function1))​(scala.Function1<[Out](FlowOps.html "type parameter in FlowOps"),​scala.collection.Iterator<U>> expander)` | Allows a faster downstream to progress independently of a slower upstream by extrapolating elements from an older  element until new element comes from the upstream. |
	| `<U> [FlowOps](FlowOps.html "interface in akka.stream.scaladsl")` | `[extrapolate](#extrapolate(scala.Function1,scala.Option))​(scala.Function1<U,​scala.collection.Iterator<U>> extrapolator,  scala.Option<U> initial)` | Allows a faster downstream to progress independent of a slower upstream. |
	| `<U> scala.None$` | `[extrapolate$default$2](#extrapolate$default$2())()` |  |
	| `[FlowOps](FlowOps.html "interface in akka.stream.scaladsl")` | `[filter](#filter(scala.Function1))​(scala.Function1<[Out](FlowOps.html "type parameter in FlowOps"),​java.lang.Object> p)` | Only pass on those elements that satisfy the given predicate. |
	| `[FlowOps](FlowOps.html "interface in akka.stream.scaladsl")` | `[filterNot](#filterNot(scala.Function1))​(scala.Function1<[Out](FlowOps.html "type parameter in FlowOps"),​java.lang.Object> p)` | Only pass on those elements that NOT satisfy the given predicate. |
	| `<T,​M>[FlowOps](FlowOps.html "interface in akka.stream.scaladsl")` | `[flatMapConcat](#flatMapConcat(scala.Function1))​(scala.Function1<[Out](FlowOps.html "type parameter in FlowOps"),​[Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<T>,​M>> f)` | Transform each input element into a `Source` of output elements that is  then flattened into the output stream by concatenation,  fully consuming one Source after the other. |
	| `<T,​M>[FlowOps](FlowOps.html "interface in akka.stream.scaladsl")` | `[flatMapMerge](#flatMapMerge(int,scala.Function1))​(int breadth,  scala.Function1<[Out](FlowOps.html "type parameter in FlowOps"),​[Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<T>,​M>> f)` | Transform each input element into a `Source` of output elements that is  then flattened into the output stream by merging, where at most `breadth`  substreams are being consumed at any given time. |
	| `<Out2,​Mat2>[FlowOps](FlowOps.html "interface in akka.stream.scaladsl")` | `[flatMapPrefix](#flatMapPrefix(int,scala.Function1))​(int n,  scala.Function1<scala.collection.immutable.Seq<[Out](FlowOps.html "type parameter in FlowOps")>,​[Flow](Flow.html "class in akka.stream.scaladsl")<[Out](FlowOps.html "type parameter in FlowOps"),​Out2,​Mat2>> f)` | Takes up to `n` elements from the stream (less than `n` only if the upstream completes before emitting `n` elements),  then apply `f` on these elements in order to obtain a flow, this flow is then materialized and the rest of the input is processed by this flow (similar to via). |
	| `<T> [FlowOps](FlowOps.html "interface in akka.stream.scaladsl")` | `[fold](#fold(T,scala.Function2))​(T zero,  scala.Function2<T,​[Out](FlowOps.html "type parameter in FlowOps"),​T> f)` | Similar to `scan` but only emits its result when the upstream completes,  after which it also completes. |
	| `<T> [FlowOps](FlowOps.html "interface in akka.stream.scaladsl")` | `[foldAsync](#foldAsync(T,scala.Function2))​(T zero,  scala.Function2<T,​[Out](FlowOps.html "type parameter in FlowOps"),​scala.concurrent.Future<T>> f)` | Similar to `fold` but with an asynchronous function. |
	| `<K> [SubFlow](SubFlow.html "interface in akka.stream.scaladsl")<[Out](FlowOps.html "type parameter in FlowOps"),​[Mat](FlowOps.html "type parameter in FlowOps"),​[FlowOps](FlowOps.html "interface in akka.stream.scaladsl"),​java.lang.Object>` | `[groupBy](#groupBy(int,scala.Function1))​(int maxSubstreams,  scala.Function1<[Out](FlowOps.html "type parameter in FlowOps"),​K> f)` | This operation demultiplexes the incoming stream into separate output  streams, one for each element key. |
	| `<K> [SubFlow](SubFlow.html "interface in akka.stream.scaladsl")<[Out](FlowOps.html "type parameter in FlowOps"),​[Mat](FlowOps.html "type parameter in FlowOps"),​[FlowOps](FlowOps.html "interface in akka.stream.scaladsl"),​java.lang.Object>` | `[groupBy](#groupBy(int,scala.Function1,boolean))​(int maxSubstreams,  scala.Function1<[Out](FlowOps.html "type parameter in FlowOps"),​K> f,  boolean allowClosedSubstreamRecreation)` | This operation demultiplexes the incoming stream into separate output  streams, one for each element key. |
	| `[FlowOps](FlowOps.html "interface in akka.stream.scaladsl")` | `[grouped](#grouped(int))​(int n)` | Chunk up this stream into groups of the given size, with the last group  possibly smaller than requested due to end\-of\-stream. |
	| `[FlowOps](FlowOps.html "interface in akka.stream.scaladsl")` | `[groupedWeighted](#groupedWeighted(long,scala.Function1))​(long minWeight,  scala.Function1<[Out](FlowOps.html "type parameter in FlowOps"),​java.lang.Object> costFn)` | Chunk up this stream into groups of elements that have a cumulative weight greater than or equal to  the `minWeight`, with the last group possibly smaller than requested `minWeight` due to end\-of\-stream. |
	| `[FlowOps](FlowOps.html "interface in akka.stream.scaladsl")` | `[groupedWeightedWithin](#groupedWeightedWithin(long,int,scala.concurrent.duration.FiniteDuration,scala.Function1))​(long maxWeight,  int maxNumber,  scala.concurrent.duration.FiniteDuration d,  scala.Function1<[Out](FlowOps.html "type parameter in FlowOps"),​java.lang.Object> costFn)` | Chunk up this stream into groups of elements received within a time window,  or limited by the weight and number of the elements, whatever happens first. |
	| `[FlowOps](FlowOps.html "interface in akka.stream.scaladsl")` | `[groupedWeightedWithin](#groupedWeightedWithin(long,scala.concurrent.duration.FiniteDuration,scala.Function1))​(long maxWeight,  scala.concurrent.duration.FiniteDuration d,  scala.Function1<[Out](FlowOps.html "type parameter in FlowOps"),​java.lang.Object> costFn)` | Chunk up this stream into groups of elements received within a time window,  or limited by the weight of the elements, whatever happens first. |
	| `[FlowOps](FlowOps.html "interface in akka.stream.scaladsl")` | `[groupedWithin](#groupedWithin(int,scala.concurrent.duration.FiniteDuration))​(int n,  scala.concurrent.duration.FiniteDuration d)` | Chunk up this stream into groups of elements received within a time window,  or limited by the given number of elements, whatever happens first. |
	| `[FlowOps](FlowOps.html "interface in akka.stream.scaladsl")` | `[idleTimeout](#idleTimeout(scala.concurrent.duration.FiniteDuration))​(scala.concurrent.duration.FiniteDuration timeout)` | If the time between two processed elements exceeds the provided timeout, the stream is failed  with a [`StreamIdleTimeoutException`](../StreamIdleTimeoutException.html "class in akka.stream"). |
	| `[FlowOps](FlowOps.html "interface in akka.stream.scaladsl")` | `[initialDelay](#initialDelay(scala.concurrent.duration.FiniteDuration))​(scala.concurrent.duration.FiniteDuration delay)` | Delays the initial element by the specified duration. |
	| `[FlowOps](FlowOps.html "interface in akka.stream.scaladsl")` | `[initialTimeout](#initialTimeout(scala.concurrent.duration.FiniteDuration))​(scala.concurrent.duration.FiniteDuration timeout)` | If the first element has not passed through this operator before the provided timeout, the stream is failed  with a [`InitialTimeoutException`](../InitialTimeoutException.html "class in akka.stream"). |
	| `<U> [FlowOps](FlowOps.html "interface in akka.stream.scaladsl")` | `[interleave](#interleave(akka.stream.Graph,int))​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<U>,​?> that,  int segmentSize)` | Interleave is a deterministic merge of the given [`Source`](Source.html "class in akka.stream.scaladsl") with elements of this [`Flow`](Flow.html "class in akka.stream.scaladsl"). |
	| `<U> [FlowOps](FlowOps.html "interface in akka.stream.scaladsl")` | `[interleave](#interleave(akka.stream.Graph,int,boolean))​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<U>,​?> that,  int segmentSize,  boolean eagerClose)` | Interleave is a deterministic merge of the given [`Source`](Source.html "class in akka.stream.scaladsl") with elements of this [`Flow`](Flow.html "class in akka.stream.scaladsl"). |
	| `<U> [FlowOps](FlowOps.html "interface in akka.stream.scaladsl")` | `[interleaveAll](#interleaveAll(scala.collection.immutable.Seq,int,boolean))​(scala.collection.immutable.Seq<[Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<U>,​?>> those,  int segmentSize,  boolean eagerClose)` | Interleave is a deterministic merge of the given [`Source`](Source.html "class in akka.stream.scaladsl")s with elements of this [`Flow`](Flow.html "class in akka.stream.scaladsl"). |
	| `<U,​M>[Graph](../Graph.html "interface in akka.stream")<[FlowShape](../FlowShape.html "class in akka.stream")<[Out](FlowOps.html "type parameter in FlowOps"),​U>,​M>` | `[interleaveGraph](#interleaveGraph(akka.stream.Graph,int,boolean))​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<U>,​M> that,  int segmentSize,  boolean eagerClose)` |  |
	| `<U,​M>boolean` | `[interleaveGraph$default$3](#interleaveGraph$default$3())()` |  |
	| `<U,​Mat2>[FlowOps](FlowOps.html "interface in akka.stream.scaladsl")` | `[internalConcat](#internalConcat(akka.stream.Graph,boolean))​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<U>,​Mat2> that,  boolean detached)` |  |
	| `<U> [FlowOps](FlowOps.html "interface in akka.stream.scaladsl")` | `[internalConcatAll](#internalConcatAll(akka.stream.Graph%5B%5D,boolean))​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<U>,​?>[] those,  boolean detached)` |  |
	| `<T> [FlowOps](FlowOps.html "interface in akka.stream.scaladsl")` | `[intersperse](#intersperse(T))​(T inject)` | Intersperses stream with provided element, similar to how `scala.collection.immutable.List.mkString`  injects a separator between a List's elements. |
	| `<T> [FlowOps](FlowOps.html "interface in akka.stream.scaladsl")` | `[intersperse](#intersperse(T,T,T))​(T start,  T inject,  T end)` | Intersperses stream with provided element, similar to how `scala.collection.immutable.List.mkString`  injects a separator between a List's elements. |
	| `<U> [FlowOps](FlowOps.html "interface in akka.stream.scaladsl")` | `[keepAlive](#keepAlive(scala.concurrent.duration.FiniteDuration,scala.Function0))​(scala.concurrent.duration.FiniteDuration maxIdle,  scala.Function0<U> injectedElem)` | Injects additional elements if upstream does not emit for a configured amount of time. |
	| `[FlowOps](FlowOps.html "interface in akka.stream.scaladsl")` | `[limit](#limit(long))​(long max)` | Ensure stream boundedness by limiting the number of elements from upstream. |
	| `<T> [FlowOps](FlowOps.html "interface in akka.stream.scaladsl")` | `[limitWeighted](#limitWeighted(long,scala.Function1))​(long max,  scala.Function1<[Out](FlowOps.html "type parameter in FlowOps"),​java.lang.Object> costFn)` | Ensure stream boundedness by evaluating the cost of incoming elements  using a cost function. |
	| `[FlowOps](FlowOps.html "interface in akka.stream.scaladsl")` | `[log](#log(java.lang.String,scala.Function1,akka.event.LoggingAdapter))​(java.lang.String name,  scala.Function1<[Out](FlowOps.html "type parameter in FlowOps"),​java.lang.Object> extract,  [LoggingAdapter](../../event/LoggingAdapter.html "interface in akka.event") log)` | Logs elements flowing through the stream as well as completion and erroring. |
	| `scala.Function1<[Out](FlowOps.html "type parameter in FlowOps"),​java.lang.Object>` | `[log$default$2](#log$default$2())()` |  |
	| `[LoggingAdapter](../../event/LoggingAdapter.html "interface in akka.event")` | `[log$default$3](#log$default$3(java.lang.String,scala.Function1))​(java.lang.String name,  scala.Function1<[Out](FlowOps.html "type parameter in FlowOps"),​java.lang.Object> extract)` |  |
	| `[FlowOps](FlowOps.html "interface in akka.stream.scaladsl")` | `[logWithMarker](#logWithMarker(java.lang.String,scala.Function1,scala.Function1,akka.event.MarkerLoggingAdapter))​(java.lang.String name,  scala.Function1<[Out](FlowOps.html "type parameter in FlowOps"),​[LogMarker](../../event/LogMarker.html "class in akka.event")> marker,  scala.Function1<[Out](FlowOps.html "type parameter in FlowOps"),​java.lang.Object> extract,  [MarkerLoggingAdapter](../../event/MarkerLoggingAdapter.html "class in akka.event") log)` | Logs elements flowing through the stream as well as completion and erroring. |
	| `scala.Function1<[Out](FlowOps.html "type parameter in FlowOps"),​java.lang.Object>` | `[logWithMarker$default$3](#logWithMarker$default$3())()` |  |
	| `[MarkerLoggingAdapter](../../event/MarkerLoggingAdapter.html "class in akka.event")` | `[logWithMarker$default$4](#logWithMarker$default$4(java.lang.String,scala.Function1,scala.Function1))​(java.lang.String name,  scala.Function1<[Out](FlowOps.html "type parameter in FlowOps"),​[LogMarker](../../event/LogMarker.html "class in akka.event")> marker,  scala.Function1<[Out](FlowOps.html "type parameter in FlowOps"),​java.lang.Object> extract)` |  |
	| `<T> [FlowOps](FlowOps.html "interface in akka.stream.scaladsl")` | `[map](#map(scala.Function1))​(scala.Function1<[Out](FlowOps.html "type parameter in FlowOps"),​T> f)` | Transform this stream by applying the given function to each of the elements  as they pass through this processing step. |
	| `<T> [FlowOps](FlowOps.html "interface in akka.stream.scaladsl")` | `[mapAsync](#mapAsync(int,scala.Function1))​(int parallelism,  scala.Function1<[Out](FlowOps.html "type parameter in FlowOps"),​scala.concurrent.Future<T>> f)` | Transform this stream by applying the given function to each of the elements  as they pass through this processing step. |
	| `<T,​P>[FlowOps](FlowOps.html "interface in akka.stream.scaladsl")` | `[mapAsyncPartitioned](#mapAsyncPartitioned(int,int,scala.Function1,scala.Function2))​(int parallelism,  int perPartition,  scala.Function1<[Out](FlowOps.html "type parameter in FlowOps"),​P> partitioner,  scala.Function2<[Out](FlowOps.html "type parameter in FlowOps"),​P,​scala.concurrent.Future<T>> f)` | Transform this stream by partitioning elements based on the provided partitioner as they  pass through this step and then applying a given `Future`\-returning function to each element  and its partition key. |
	| `<T> [FlowOps](FlowOps.html "interface in akka.stream.scaladsl")` | `[mapAsyncUnordered](#mapAsyncUnordered(int,scala.Function1))​(int parallelism,  scala.Function1<[Out](FlowOps.html "type parameter in FlowOps"),​scala.concurrent.Future<T>> f)` | Transform this stream by applying the given function to each of the elements  as they pass through this processing step. |
	| `<T> [FlowOps](FlowOps.html "interface in akka.stream.scaladsl")` | `[mapConcat](#mapConcat(scala.Function1))​(scala.Function1<[Out](FlowOps.html "type parameter in FlowOps"),​scala.collection.IterableOnce<T>> f)` | Transform each input element into an `Iterable` of output elements that is  then flattened into the output stream. |
	| `[FlowOps](FlowOps.html "interface in akka.stream.scaladsl")` | `[mapError](#mapError(scala.PartialFunction))​(scala.PartialFunction<java.lang.Throwable,​java.lang.Throwable> pf)` | While similar to [`<T>recover(scala.PartialFunction<java.lang.Throwable,T>)`](#recover(scala.PartialFunction)) this operator can be used to transform an error signal to a different one \*without\* logging  it as an error in the process. |
	| `<R,​T>[FlowOps](FlowOps.html "interface in akka.stream.scaladsl")` | `[mapWithResource](#mapWithResource(scala.Function0,scala.Function2,scala.Function1))​(scala.Function0<R> create,  scala.Function2<R,​[Out](FlowOps.html "type parameter in FlowOps"),​T> f,  scala.Function1<R,​scala.Option<T>> close)` | Transform each stream element with the help of a resource. |
	| `<U,​M>[FlowOps](FlowOps.html "interface in akka.stream.scaladsl")` | `[merge](#merge(akka.stream.Graph,boolean))​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<U>,​M> that,  boolean eagerComplete)` | Merge the given [`Source`](Source.html "class in akka.stream.scaladsl") to this [`Flow`](Flow.html "class in akka.stream.scaladsl"), taking elements as they arrive from input streams,  picking randomly when several elements ready. |
	| `<U,​M>boolean` | `[merge$default$2](#merge$default$2())()` |  |
	| `<U> [FlowOps](FlowOps.html "interface in akka.stream.scaladsl")` | `[mergeAll](#mergeAll(scala.collection.immutable.Seq,boolean))​(scala.collection.immutable.Seq<[Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<U>,​?>> those,  boolean eagerComplete)` | Merge the given [`Source`](Source.html "class in akka.stream.scaladsl")s to this [`Flow`](Flow.html "class in akka.stream.scaladsl"), taking elements as they arrive from input streams,  picking randomly when several elements ready. |
	| `<U,​M>[Graph](../Graph.html "interface in akka.stream")<[FlowShape](../FlowShape.html "class in akka.stream")<[Out](FlowOps.html "type parameter in FlowOps"),​U>,​M>` | `[mergeGraph](#mergeGraph(akka.stream.Graph,boolean))​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<U>,​M> that,  boolean eagerComplete)` |  |
	| `<U,​M>[FlowOps](FlowOps.html "interface in akka.stream.scaladsl")` | `[mergeLatest](#mergeLatest(akka.stream.Graph,boolean))​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<U>,​M> that,  boolean eagerComplete)` | MergeLatest joins elements from N input streams into stream of lists of size N. |
	| `<U,​M>boolean` | `[mergeLatest$default$2](#mergeLatest$default$2())()` |  |
	| `<U,​M>[Graph](../Graph.html "interface in akka.stream")<[FlowShape](../FlowShape.html "class in akka.stream")<[Out](FlowOps.html "type parameter in FlowOps"),​scala.collection.immutable.Seq<U>>,​M>` | `[mergeLatestGraph](#mergeLatestGraph(akka.stream.Graph,boolean))​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<U>,​M> that,  boolean eagerComplete)` |  |
	| `<U,​M>[FlowOps](FlowOps.html "interface in akka.stream.scaladsl")` | `[mergePreferred](#mergePreferred(akka.stream.Graph,boolean,boolean))​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<U>,​M> that,  boolean preferred,  boolean eagerComplete)` | Merge two sources. |
	| `<U,​M>boolean` | `[mergePreferred$default$3](#mergePreferred$default$3())()` |  |
	| `<U,​M>[Graph](../Graph.html "interface in akka.stream")<[FlowShape](../FlowShape.html "class in akka.stream")<[Out](FlowOps.html "type parameter in FlowOps"),​U>,​M>` | `[mergePreferredGraph](#mergePreferredGraph(akka.stream.Graph,boolean,boolean))​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<U>,​M> that,  boolean preferred,  boolean eagerComplete)` |  |
	| `<U,​M>[FlowOps](FlowOps.html "interface in akka.stream.scaladsl")` | `[mergePrioritized](#mergePrioritized(akka.stream.Graph,int,int,boolean))​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<U>,​M> that,  int leftPriority,  int rightPriority,  boolean eagerComplete)` | Merge two sources. |
	| `<U,​M>boolean` | `[mergePrioritized$default$4](#mergePrioritized$default$4())()` |  |
	| `<U,​M>[Graph](../Graph.html "interface in akka.stream")<[FlowShape](../FlowShape.html "class in akka.stream")<[Out](FlowOps.html "type parameter in FlowOps"),​U>,​M>` | `[mergePrioritizedGraph](#mergePrioritizedGraph(akka.stream.Graph,int,int,boolean))​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<U>,​M> that,  int leftPriority,  int rightPriority,  boolean eagerComplete)` |  |
	| `<U,​M>[FlowOps](FlowOps.html "interface in akka.stream.scaladsl")` | `[mergeSorted](#mergeSorted(akka.stream.Graph,scala.math.Ordering))​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<U>,​M> that,  scala.math.Ordering<U> ord)` | Merge the given [`Source`](Source.html "class in akka.stream.scaladsl") to this [`Flow`](Flow.html "class in akka.stream.scaladsl"), taking elements as they arrive from input streams,  picking always the smallest of the available elements (waiting for one element from each side  to be available). |
	| `<U,​M>[Graph](../Graph.html "interface in akka.stream")<[FlowShape](../FlowShape.html "class in akka.stream")<[Out](FlowOps.html "type parameter in FlowOps"),​U>,​M>` | `[mergeSortedGraph](#mergeSortedGraph(akka.stream.Graph,scala.math.Ordering))​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<U>,​M> that,  scala.math.Ordering<U> ord)` |  |
	| `[FlowOps](FlowOps.html "interface in akka.stream.scaladsl")` | `[named](#named(java.lang.String))​(java.lang.String name)` |  |
	| `[FlowOps](FlowOps.html "interface in akka.stream.scaladsl")` | `[onErrorComplete](#onErrorComplete(scala.PartialFunction))​(scala.PartialFunction<java.lang.Throwable,​java.lang.Object> pf)` | onErrorComplete allows to complete the stream when an upstream error occurs. |
	| `<T extends java.lang.Throwable>[FlowOps](FlowOps.html "interface in akka.stream.scaladsl")` | `[onErrorComplete](#onErrorComplete(scala.reflect.ClassTag))​(scala.reflect.ClassTag<T> tag)` | onErrorComplete allows to complete the stream when an upstream error occurs. |
	| `<U,​Mat2>[FlowOps](FlowOps.html "interface in akka.stream.scaladsl")` | `[orElse](#orElse(akka.stream.Graph))​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<U>,​Mat2> secondary)` | Provides a secondary source that will be consumed if this stream completes without any  elements passing by. |
	| `<U,​Mat2>[Graph](../Graph.html "interface in akka.stream")<[FlowShape](../FlowShape.html "class in akka.stream")<[Out](FlowOps.html "type parameter in FlowOps"),​U>,​Mat2>` | `[orElseGraph](#orElseGraph(akka.stream.Graph))​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<U>,​Mat2> secondary)` |  |
	| `<U> [FlowOps](FlowOps.html "interface in akka.stream.scaladsl")` | `[prefixAndTail](#prefixAndTail(int))​(int n)` | Takes up to `n` elements from the stream (less than `n` only if the upstream completes before emitting `n` elements)  and returns a pair containing a strict sequence of the taken element  and a stream representing the remaining elements. |
	| `<U,​Mat2>[FlowOps](FlowOps.html "interface in akka.stream.scaladsl")` | `[prepend](#prepend(akka.stream.Graph))​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<U>,​Mat2> that)` | Prepend the given [`Source`](Source.html "class in akka.stream.scaladsl") to this [`Flow`](Flow.html "class in akka.stream.scaladsl"), meaning that before elements  are generated from this Flow, the Source's elements will be produced until it  is exhausted, at which point Flow elements will start being produced. |
	| `<U,​Mat2>[Graph](../Graph.html "interface in akka.stream")<[FlowShape](../FlowShape.html "class in akka.stream")<[Out](FlowOps.html "type parameter in FlowOps"),​U>,​Mat2>` | `[prependGraph](#prependGraph(akka.stream.Graph,boolean))​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<U>,​Mat2> that,  boolean detached)` |  |
	| `<U,​Mat2>[FlowOps](FlowOps.html "interface in akka.stream.scaladsl")` | `[prependLazy](#prependLazy(akka.stream.Graph))​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<U>,​Mat2> that)` | Prepend the given [`Source`](Source.html "class in akka.stream.scaladsl") to this [`Flow`](Flow.html "class in akka.stream.scaladsl"), meaning that before elements  are generated from this Flow, the Source's elements will be produced until it  is exhausted, at which point Flow elements will start being produced. |
	| `<T> [FlowOps](FlowOps.html "interface in akka.stream.scaladsl")` | `[recover](#recover(scala.PartialFunction))​(scala.PartialFunction<java.lang.Throwable,​T> pf)` | Recover allows to send last element on failure and gracefully complete the stream  Since the underlying failure signal onError arrives out\-of\-band, it might jump over existing elements. |
	| `<T> [FlowOps](FlowOps.html "interface in akka.stream.scaladsl")` | `[recoverWith](#recoverWith(scala.PartialFunction))​(scala.PartialFunction<java.lang.Throwable,​[Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<T>,​[NotUsed](../../NotUsed.html "class in akka")>> pf)` | RecoverWith allows to switch to alternative Source on flow failure. |
	| `<T> [FlowOps](FlowOps.html "interface in akka.stream.scaladsl")` | `[recoverWithRetries](#recoverWithRetries(int,scala.PartialFunction))​(int attempts,  scala.PartialFunction<java.lang.Throwable,​[Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<T>,​[NotUsed](../../NotUsed.html "class in akka")>> pf)` | RecoverWithRetries allows to switch to alternative Source on flow failure. |
	| `<T> [FlowOps](FlowOps.html "interface in akka.stream.scaladsl")` | `[reduce](#reduce(scala.Function2))​(scala.Function2<T,​T,​T> f)` | Similar to `fold` but uses first element as zero element. |
	| `<T> [FlowOps](FlowOps.html "interface in akka.stream.scaladsl")` | `[scan](#scan(T,scala.Function2))​(T zero,  scala.Function2<T,​[Out](FlowOps.html "type parameter in FlowOps"),​T> f)` | Similar to `fold` but is not a terminal operation,  emits its current value which starts at `zero` and then  applies the current and next value to the given function `f`,  emitting the next current value. |
	| `<T> [FlowOps](FlowOps.html "interface in akka.stream.scaladsl")` | `[scanAsync](#scanAsync(T,scala.Function2))​(T zero,  scala.Function2<T,​[Out](FlowOps.html "type parameter in FlowOps"),​scala.concurrent.Future<T>> f)` | Similar to `scan` but with an asynchronous function,  emits its current value which starts at `zero` and then  applies the current and next value to the given function `f`,  emitting a `Future` that resolves to the next current value. |
	| `[FlowOps](FlowOps.html "interface in akka.stream.scaladsl")` | `[sliding](#sliding(int,int))​(int n,  int step)` | Apply a sliding window over the stream and return the windows as groups of elements, with the last group  possibly smaller than requested due to end\-of\-stream. |
	| `int` | `[sliding$default$2](#sliding$default$2())()` |  |
	| `[SubFlow](SubFlow.html "interface in akka.stream.scaladsl")<[Out](FlowOps.html "type parameter in FlowOps"),​[Mat](FlowOps.html "type parameter in FlowOps"),​[FlowOps](FlowOps.html "interface in akka.stream.scaladsl"),​java.lang.Object>` | `[splitAfter](#splitAfter(akka.stream.SubstreamCancelStrategy,scala.Function1))​([SubstreamCancelStrategy](../SubstreamCancelStrategy.html "class in akka.stream") substreamCancelStrategy,  scala.Function1<[Out](FlowOps.html "type parameter in FlowOps"),​java.lang.Object> p)` | This operation applies the given predicate to all incoming elements and  emits them to a stream of output streams. |
	| `[SubFlow](SubFlow.html "interface in akka.stream.scaladsl")<[Out](FlowOps.html "type parameter in FlowOps"),​[Mat](FlowOps.html "type parameter in FlowOps"),​[FlowOps](FlowOps.html "interface in akka.stream.scaladsl"),​java.lang.Object>` | `[splitAfter](#splitAfter(scala.Function1))​(scala.Function1<[Out](FlowOps.html "type parameter in FlowOps"),​java.lang.Object> p)` | This operation applies the given predicate to all incoming elements and  emits them to a stream of output streams. |
	| `[SubFlow](SubFlow.html "interface in akka.stream.scaladsl")<[Out](FlowOps.html "type parameter in FlowOps"),​[Mat](FlowOps.html "type parameter in FlowOps"),​[FlowOps](FlowOps.html "interface in akka.stream.scaladsl"),​java.lang.Object>` | `[splitWhen](#splitWhen(akka.stream.SubstreamCancelStrategy,scala.Function1))​([SubstreamCancelStrategy](../SubstreamCancelStrategy.html "class in akka.stream") substreamCancelStrategy,  scala.Function1<[Out](FlowOps.html "type parameter in FlowOps"),​java.lang.Object> p)` | This operation applies the given predicate to all incoming elements and  emits them to a stream of output streams, always beginning a new one with  the current element if the given predicate returns true for it. |
	| `[SubFlow](SubFlow.html "interface in akka.stream.scaladsl")<[Out](FlowOps.html "type parameter in FlowOps"),​[Mat](FlowOps.html "type parameter in FlowOps"),​[FlowOps](FlowOps.html "interface in akka.stream.scaladsl"),​java.lang.Object>` | `[splitWhen](#splitWhen(scala.Function1))​(scala.Function1<[Out](FlowOps.html "type parameter in FlowOps"),​java.lang.Object> p)` | This operation applies the given predicate to all incoming elements and  emits them to a stream of output streams, always beginning a new one with  the current element if the given predicate returns true for it. |
	| `<S,​T>[FlowOps](FlowOps.html "interface in akka.stream.scaladsl")` | `[statefulMap](#statefulMap(scala.Function0,scala.Function2,scala.Function1))​(scala.Function0<S> create,  scala.Function2<S,​[Out](FlowOps.html "type parameter in FlowOps"),​scala.Tuple2<S,​T>> f,  scala.Function1<S,​scala.Option<T>> onComplete)` | Transform each stream element with the help of a state. |
	| `<T> [FlowOps](FlowOps.html "interface in akka.stream.scaladsl")` | `[statefulMapConcat](#statefulMapConcat(scala.Function0))​(scala.Function0<scala.Function1<[Out](FlowOps.html "type parameter in FlowOps"),​scala.collection.IterableOnce<T>>> f)` | Transform each input element into an `Iterable` of output elements that is  then flattened into the output stream. |
	| `[FlowOps](FlowOps.html "interface in akka.stream.scaladsl")` | `[take](#take(long))​(long n)` | Terminate processing (and cancel the upstream publisher) after the given  number of elements. |
	| `[FlowOps](FlowOps.html "interface in akka.stream.scaladsl")` | `[takeWhile](#takeWhile(scala.Function1))​(scala.Function1<[Out](FlowOps.html "type parameter in FlowOps"),​java.lang.Object> p)` | Terminate processing (and cancel the upstream publisher) after predicate  returns false for the first time,  Due to input buffering some elements may have been requested from upstream publishers  that will then not be processed downstream of this step. |
	| `[FlowOps](FlowOps.html "interface in akka.stream.scaladsl")` | `[takeWhile](#takeWhile(scala.Function1,boolean))​(scala.Function1<[Out](FlowOps.html "type parameter in FlowOps"),​java.lang.Object> p,  boolean inclusive)` | Terminate processing (and cancel the upstream publisher) after predicate  returns false for the first time, including the first failed element iff inclusive is true  Due to input buffering some elements may have been requested from upstream publishers  that will then not be processed downstream of this step. |
	| `[FlowOps](FlowOps.html "interface in akka.stream.scaladsl")` | `[takeWithin](#takeWithin(scala.concurrent.duration.FiniteDuration))​(scala.concurrent.duration.FiniteDuration d)` | Terminate processing (and cancel the upstream publisher) after the given  duration. |
	| `[FlowOps](FlowOps.html "interface in akka.stream.scaladsl")` | `[throttle](#throttle(int,scala.concurrent.duration.FiniteDuration))​(int elements,  scala.concurrent.duration.FiniteDuration per)` | Sends elements downstream with speed limited to `elements/per`. |
	| `[FlowOps](FlowOps.html "interface in akka.stream.scaladsl")` | `[throttle](#throttle(int,scala.concurrent.duration.FiniteDuration,int,akka.stream.ThrottleMode))​(int elements,  scala.concurrent.duration.FiniteDuration per,  int maximumBurst,  [ThrottleMode](../ThrottleMode.html "class in akka.stream") mode)` | Sends elements downstream with speed limited to `elements/per`. |
	| `[FlowOps](FlowOps.html "interface in akka.stream.scaladsl")` | `[throttle](#throttle(int,scala.concurrent.duration.FiniteDuration,int,scala.Function1,akka.stream.ThrottleMode))​(int cost,  scala.concurrent.duration.FiniteDuration per,  int maximumBurst,  scala.Function1<[Out](FlowOps.html "type parameter in FlowOps"),​java.lang.Object> costCalculation,  [ThrottleMode](../ThrottleMode.html "class in akka.stream") mode)` | Sends elements downstream with speed limited to `cost/per`. |
	| `[FlowOps](FlowOps.html "interface in akka.stream.scaladsl")` | `[throttle](#throttle(int,scala.concurrent.duration.FiniteDuration,scala.Function1))​(int cost,  scala.concurrent.duration.FiniteDuration per,  scala.Function1<[Out](FlowOps.html "type parameter in FlowOps"),​java.lang.Object> costCalculation)` | Sends elements downstream with speed limited to `cost/per`. |
	| `[FlowOps](FlowOps.html "interface in akka.stream.scaladsl")` | `[throttle](#throttle(akka.stream.scaladsl.ThrottleControl))​([ThrottleControl](ThrottleControl.html "class in akka.stream.scaladsl") control)` | The `ThrottleControl` can be updated to change the throttle rate from the outside of the stream  and share a total rate limit between several streams. |
	| `[FlowOps](FlowOps.html "interface in akka.stream.scaladsl")` | `[throttle](#throttle(akka.stream.scaladsl.ThrottleControl,scala.Function1))​([ThrottleControl](ThrottleControl.html "class in akka.stream.scaladsl") control,  scala.Function1<[Out](FlowOps.html "type parameter in FlowOps"),​java.lang.Object> costCalculation)` | The `ThrottleControl` can be updated to change the throttle rate from the outside of the stream  and share a total rate limit between several streams. |
	| `<Mat2> java.lang.Object` | `[to](#to(akka.stream.Graph))​([Graph](../Graph.html "interface in akka.stream")<[SinkShape](../SinkShape.html "class in akka.stream")<[Out](FlowOps.html "type parameter in FlowOps")>,​Mat2> sink)` | Connect this [`Flow`](Flow.html "class in akka.stream.scaladsl") to a [`Sink`](Sink.html "class in akka.stream.scaladsl"), concatenating the processing steps of both. |
	| `<T,​Mat2>[FlowOps](FlowOps.html "interface in akka.stream.scaladsl")` | `[via](#via(akka.stream.Graph))​([Graph](../Graph.html "interface in akka.stream")<[FlowShape](../FlowShape.html "class in akka.stream")<[Out](FlowOps.html "type parameter in FlowOps"),​T>,​Mat2> flow)` |  |
	| `[FlowOps](FlowOps.html "interface in akka.stream.scaladsl")` | `[watch](#watch(akka.actor.ActorRef))​([ActorRef](../../actor/ActorRef.html "class in akka.actor") ref)` | The operator fails with an [`WatchedActorTerminatedException`](../WatchedActorTerminatedException.html "class in akka.stream") if the target actor is terminated. |
	| `[FlowOps](FlowOps.html "interface in akka.stream.scaladsl")` | `[wireTap](#wireTap(akka.stream.Graph))​([Graph](../Graph.html "interface in akka.stream")<[SinkShape](../SinkShape.html "class in akka.stream")<[Out](FlowOps.html "type parameter in FlowOps")>,​?> that)` | Attaches the given [`Sink`](Sink.html "class in akka.stream.scaladsl") to this [`Flow`](Flow.html "class in akka.stream.scaladsl") as a wire tap, meaning that elements that pass  through will also be sent to the wire\-tap Sink, without the latter affecting the mainline flow. |
	| `[FlowOps](FlowOps.html "interface in akka.stream.scaladsl")` | `[wireTap](#wireTap(scala.Function1))​(scala.Function1<[Out](FlowOps.html "type parameter in FlowOps"),​scala.runtime.BoxedUnit> f)` | This is a simplified version of `wireTap(Sink)` that takes only a simple function. |
	| `<M> [Graph](../Graph.html "interface in akka.stream")<[FlowShape](../FlowShape.html "class in akka.stream")<[Out](FlowOps.html "type parameter in FlowOps"),​[Out](FlowOps.html "type parameter in FlowOps")>,​M>` | `[wireTapGraph](#wireTapGraph(akka.stream.Graph))​([Graph](../Graph.html "interface in akka.stream")<[SinkShape](../SinkShape.html "class in akka.stream")<[Out](FlowOps.html "type parameter in FlowOps")>,​M> that)` |  |
	| `[FlowOps](FlowOps.html "interface in akka.stream.scaladsl")` | `[withAttributes](#withAttributes(akka.stream.Attributes))​([Attributes](../Attributes.html "class in akka.stream") attr)` |  |
	| `<U> [FlowOps](FlowOps.html "interface in akka.stream.scaladsl")` | `[zip](#zip(akka.stream.Graph))​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<U>,​?> that)` | Combine the elements of current flow and the given [`Source`](Source.html "class in akka.stream.scaladsl") into a stream of tuples. |
	| `<U,​A>[FlowOps](FlowOps.html "interface in akka.stream.scaladsl")` | `[zipAll](#zipAll(akka.stream.Graph,A,U))​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<U>,​?> that,  A thisElem,  U thatElem)` | Combine the elements of current flow and the given [`Source`](Source.html "class in akka.stream.scaladsl") into a stream of tuples. |
	| `<U,​A,​Mat2>[Flow](Flow.html "class in akka.stream.scaladsl")<[Out](FlowOps.html "type parameter in FlowOps"),​scala.Tuple2<A,​U>,​Mat2>` | `[zipAllFlow](#zipAllFlow(akka.stream.Graph,A,U))​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<U>,​Mat2> that,  A thisElem,  U thatElem)` |  |
	| `<U,​M>[Graph](../Graph.html "interface in akka.stream")<[FlowShape](../FlowShape.html "class in akka.stream")<[Out](FlowOps.html "type parameter in FlowOps"),​scala.Tuple2<[Out](FlowOps.html "type parameter in FlowOps"),​U>>,​M>` | `[zipGraph](#zipGraph(akka.stream.Graph))​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<U>,​M> that)` |  |
	| `<U> [FlowOps](FlowOps.html "interface in akka.stream.scaladsl")` | `[zipLatest](#zipLatest(akka.stream.Graph))​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<U>,​?> that)` | Combine the elements of 2 streams into a stream of tuples, picking always the latest element of each. |
	| `<U,​M>[Graph](../Graph.html "interface in akka.stream")<[FlowShape](../FlowShape.html "class in akka.stream")<[Out](FlowOps.html "type parameter in FlowOps"),​scala.Tuple2<[Out](FlowOps.html "type parameter in FlowOps"),​U>>,​M>` | `[zipLatestGraph](#zipLatestGraph(akka.stream.Graph))​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<U>,​M> that)` |  |
	| `<Out2,​Out3>[FlowOps](FlowOps.html "interface in akka.stream.scaladsl")` | `[zipLatestWith](#zipLatestWith(akka.stream.Graph,boolean,scala.Function2))​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<Out2>,​?> that,  boolean eagerComplete,  scala.Function2<[Out](FlowOps.html "type parameter in FlowOps"),​Out2,​Out3> combine)` | Combine the elements of multiple streams into a stream of combined elements using a combiner function,  picking always the latest of the elements of each source. |
	| `<Out2,​Out3>[FlowOps](FlowOps.html "interface in akka.stream.scaladsl")` | `[zipLatestWith](#zipLatestWith(akka.stream.Graph,scala.Function2))​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<Out2>,​?> that,  scala.Function2<[Out](FlowOps.html "type parameter in FlowOps"),​Out2,​Out3> combine)` | Combine the elements of multiple streams into a stream of combined elements using a combiner function,  picking always the latest of the elements of each source. |
	| `<Out2,​Out3,​M>[Graph](../Graph.html "interface in akka.stream")<[FlowShape](../FlowShape.html "class in akka.stream")<[Out](FlowOps.html "type parameter in FlowOps"),​Out3>,​M>` | `[zipLatestWithGraph](#zipLatestWithGraph(akka.stream.Graph,boolean,scala.Function2))​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<Out2>,​M> that,  boolean eagerComplete,  scala.Function2<[Out](FlowOps.html "type parameter in FlowOps"),​Out2,​Out3> combine)` |  |
	| `<Out2,​Out3,​M>[Graph](../Graph.html "interface in akka.stream")<[FlowShape](../FlowShape.html "class in akka.stream")<[Out](FlowOps.html "type parameter in FlowOps"),​Out3>,​M>` | `[zipLatestWithGraph](#zipLatestWithGraph(akka.stream.Graph,scala.Function2))​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<Out2>,​M> that,  scala.Function2<[Out](FlowOps.html "type parameter in FlowOps"),​Out2,​Out3> combine)` |  |
	| `<Out2,​Out3>[FlowOps](FlowOps.html "interface in akka.stream.scaladsl")` | `[zipWith](#zipWith(akka.stream.Graph,scala.Function2))​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<Out2>,​?> that,  scala.Function2<[Out](FlowOps.html "type parameter in FlowOps"),​Out2,​Out3> combine)` | Put together the elements of current flow and the given [`Source`](Source.html "class in akka.stream.scaladsl")  into a stream of combined elements using a combiner function. |
	| `<Out2,​Out3,​M>[Graph](../Graph.html "interface in akka.stream")<[FlowShape](../FlowShape.html "class in akka.stream")<[Out](FlowOps.html "type parameter in FlowOps"),​Out3>,​M>` | `[zipWithGraph](#zipWithGraph(akka.stream.Graph,scala.Function2))​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<Out2>,​M> that,  scala.Function2<[Out](FlowOps.html "type parameter in FlowOps"),​Out2,​Out3> combine)` |  |
	| `[FlowOps](FlowOps.html "interface in akka.stream.scaladsl")` | `[zipWithIndex](#zipWithIndex())()` | Combine the elements of current flow into a stream of tuples consisting  of all elements paired with their index. |

- - ### Method Detail
	
	
	
		- #### $plus$plus
		
		
		
		```
		<U,​M> [FlowOps](FlowOps.html "interface in akka.stream.scaladsl") $plus$plus​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<U>,​M> that)
		```
		
		Concatenates this [`Flow`](Flow.html "class in akka.stream.scaladsl") with the given [`Source`](Source.html "class in akka.stream.scaladsl") so the first element
		 emitted by that source is emitted after the last element of this
		 flow.
		 
		 This is a shorthand for [`<U,Mat2>concat(akka.stream.Graph<akka.stream.SourceShape<U>,Mat2>)`](#concat(akka.stream.Graph))
		- #### addAttributes
		
		
		
		```
		[FlowOps](FlowOps.html "interface in akka.stream.scaladsl") addAttributes​([Attributes](../Attributes.html "class in akka.stream") attr)
		```
		- #### aggregateWithBoundary
		
		
		
		```
		<Agg,​Emit> [FlowOps](FlowOps.html "interface in akka.stream.scaladsl") aggregateWithBoundary​(scala.Function0<Agg> allocate,
		                                               scala.Function2<Agg,​[Out](FlowOps.html "type parameter in FlowOps"),​scala.Tuple2<Agg,​java.lang.Object>> aggregate,
		                                               scala.Function1<Agg,​Emit> harvest,
		                                               scala.Option<scala.Tuple2<scala.Function1<Agg,​java.lang.Object>,​scala.concurrent.duration.FiniteDuration>> emitOnTimer)
		```
		
		Aggregate input elements into an arbitrary data structure that can be completed and emitted downstream
		 when custom condition is met which can be triggered by aggregate or timer.
		 It can be thought of a more general [`groupedWeightedWithin(long,scala.concurrent.duration.FiniteDuration,scala.Function1<Out,java.lang.Object>)`](#groupedWeightedWithin(long,scala.concurrent.duration.FiniteDuration,scala.Function1)).
		 
		 '''Emits when''' the aggregation function decides the aggregate is complete or the timer function returns true
		 
		
		
		 '''Backpressures when''' downstream backpressures and the aggregate is complete
		 
		
		
		 '''Completes when''' upstream completes and the last aggregate has been emitted downstream
		 
		
		
		 '''Cancels when''' downstream cancels
		 
		
		
		
		Parameters:
		`allocate` \- allocate the initial data structure for aggregated elements
		`aggregate` \- update the aggregated elements, return true if ready to emit after update.
		`harvest` \- this is invoked before emit within the current stage/operator
		`emitOnTimer` \- decide whether the current aggregated elements can be emitted, the custom function is invoked on every interval
		- #### alsoTo
		
		
		
		```
		[FlowOps](FlowOps.html "interface in akka.stream.scaladsl") alsoTo​([Graph](../Graph.html "interface in akka.stream")<[SinkShape](../SinkShape.html "class in akka.stream")<[Out](FlowOps.html "type parameter in FlowOps")>,​?> that)
		```
		
		Attaches the given [`Sink`](Sink.html "class in akka.stream.scaladsl") to this [`Source`](Source.html "class in akka.stream.scaladsl"), meaning that elements that pass
		 through will also be sent to the [`Sink`](Sink.html "class in akka.stream.scaladsl").
		 
		 It is similar to [`wireTap(scala.Function1<Out, scala.runtime.BoxedUnit>)`](#wireTap(scala.Function1)) but will backpressure instead of dropping elements when the given [`Sink`](Sink.html "class in akka.stream.scaladsl") is not ready.
		 
		
		
		 '''Emits when''' element is available and demand exists both from the Sink and the downstream.
		 
		
		
		 '''Backpressures when''' downstream or Sink backpressures
		 
		
		
		 '''Completes when''' upstream completes
		 
		
		
		 '''Cancels when''' downstream or Sink cancels
		- #### alsoToAll
		
		
		
		```
		[FlowOps](FlowOps.html "interface in akka.stream.scaladsl") alsoToAll​(scala.collection.immutable.Seq<[Graph](../Graph.html "interface in akka.stream")<[SinkShape](../SinkShape.html "class in akka.stream")<[Out](FlowOps.html "type parameter in FlowOps")>,​?>> those)
		```
		
		Attaches the given [`Sink`](Sink.html "class in akka.stream.scaladsl")s to this [`Source`](Source.html "class in akka.stream.scaladsl"), meaning that elements that pass
		 through will also be sent to the [`Sink`](Sink.html "class in akka.stream.scaladsl").
		 
		 It is similar to [`wireTap(scala.Function1<Out, scala.runtime.BoxedUnit>)`](#wireTap(scala.Function1)) but will backpressure instead of dropping elements when the given [`Sink`](Sink.html "class in akka.stream.scaladsl")s is not ready.
		 
		
		
		 '''Emits when''' element is available and demand exists both from the Sinks and the downstream.
		 
		
		
		 '''Backpressures when''' downstream or any of the [`Sink`](Sink.html "class in akka.stream.scaladsl")s backpressures
		 
		
		
		 '''Completes when''' upstream completes
		 
		
		
		 '''Cancels when''' downstream or any of the [`Sink`](Sink.html "class in akka.stream.scaladsl")s cancels
		- #### alsoToGraph
		
		
		
		```
		<M> [Graph](../Graph.html "interface in akka.stream")<[FlowShape](../FlowShape.html "class in akka.stream")<[Out](FlowOps.html "type parameter in FlowOps"),​[Out](FlowOps.html "type parameter in FlowOps")>,​M> alsoToGraph​([Graph](../Graph.html "interface in akka.stream")<[SinkShape](../SinkShape.html "class in akka.stream")<[Out](FlowOps.html "type parameter in FlowOps")>,​M> that)
		```
		- #### ask
		
		
		
		```
		<S> [FlowOps](FlowOps.html "interface in akka.stream.scaladsl") ask​([ActorRef](../../actor/ActorRef.html "class in akka.actor") ref,
		                [Timeout](../../util/Timeout.html "class in akka.util") timeout,
		                scala.reflect.ClassTag<S> tag)
		```
		
		Use the `ask` pattern to send a request\-reply message to the target `ref` actor.
		 If any of the asks times out it will fail the stream with a [`AskTimeoutException`](../../pattern/AskTimeoutException.html "class in akka.pattern").
		 
		 Do not forget to include the expected response type in the method call, like so:
		 
		
		
		
		
		
		```
		
		 flow.ask[ExpectedReply](ref)
		 
		```
		
		
		 otherwise `Nothing` will be assumed, which is most likely not what you want.
		 
		
		
		 Defaults to parallelism of 2 messages in flight, since while one ask message may be being worked on, the second one
		 still be in the mailbox, so defaulting to sending the second one a bit earlier than when first ask has replied maintains
		 a slightly healthier throughput.
		 
		
		
		 Similar to the plain ask pattern, the target actor is allowed to reply with `akka.util.Status`.
		 An `akka.util.Status#Failure` will cause the operator to fail with the cause carried in the `Failure` message.
		 
		
		
		 The operator fails with an [`WatchedActorTerminatedException`](../WatchedActorTerminatedException.html "class in akka.stream") if the target actor is terminated.
		 
		
		
		 Adheres to the `ActorAttributes.SupervisionStrategy` attribute.
		 
		
		
		 '''Emits when''' the futures (in submission order) created by the ask pattern internally are completed
		 
		
		
		 '''Backpressures when''' the number of futures reaches the configured parallelism and the downstream backpressures
		 
		
		
		 '''Completes when''' upstream completes and all futures have been completed and all elements have been emitted
		 
		
		
		 '''Fails when''' the passed in actor terminates, or a timeout is exceeded in any of the asks performed
		 
		
		
		 '''Cancels when''' downstream cancels
		- #### ask
		
		
		
		```
		<S> [FlowOps](FlowOps.html "interface in akka.stream.scaladsl") ask​(int parallelism,
		                [ActorRef](../../actor/ActorRef.html "class in akka.actor") ref,
		                [Timeout](../../util/Timeout.html "class in akka.util") timeout,
		                scala.reflect.ClassTag<S> tag)
		```
		
		Use the `ask` pattern to send a request\-reply message to the target `ref` actor.
		 If any of the asks times out it will fail the stream with a [`AskTimeoutException`](../../pattern/AskTimeoutException.html "class in akka.pattern").
		 
		 Do not forget to include the expected response type in the method call, like so:
		 
		
		
		
		
		
		```
		
		 flow.ask[ExpectedReply](parallelism = 4)(ref)
		 
		```
		
		
		 otherwise `Nothing` will be assumed, which is most likely not what you want.
		 
		
		
		 Parallelism limits the number of how many asks can be "in flight" at the same time.
		 Please note that the elements emitted by this operator are in\-order with regards to the asks being issued
		 (i.e. same behaviour as mapAsync).
		 
		
		
		 The operator fails with an [`WatchedActorTerminatedException`](../WatchedActorTerminatedException.html "class in akka.stream") if the target actor is terminated,
		 or with an `TimeoutException` in case the ask exceeds the timeout passed in.
		 
		
		
		 Adheres to the `ActorAttributes.SupervisionStrategy` attribute.
		 
		
		
		 '''Emits when''' the futures (in submission order) created by the ask pattern internally are completed
		 
		
		
		 '''Backpressures when''' the number of futures reaches the configured parallelism and the downstream backpressures
		 
		
		
		 '''Completes when''' upstream completes and all futures have been completed and all elements have been emitted
		 
		
		
		 '''Fails when''' the passed in actor terminates, or a timeout is exceeded in any of the asks performed
		 
		
		
		 '''Cancels when''' downstream cancels
		- #### async
		
		
		
		```
		[FlowOps](FlowOps.html "interface in akka.stream.scaladsl") async()
		```
		
		Put an asynchronous boundary around this `Flow`.
		 
		 If this is a `SubFlow` (created e.g. by `groupBy`), this creates an
		 asynchronous boundary around each materialized sub\-flow, not the
		 super\-flow. That way, the super\-flow will communicate with sub\-flows
		 asynchronously.
		- #### backpressureTimeout
		
		
		
		```
		[FlowOps](FlowOps.html "interface in akka.stream.scaladsl") backpressureTimeout​(scala.concurrent.duration.FiniteDuration timeout)
		```
		
		If the time between the emission of an element and the following downstream demand exceeds the provided timeout,
		 the stream is failed with a [`BackpressureTimeoutException`](../BackpressureTimeoutException.html "class in akka.stream"). The timeout is checked periodically,
		 so the resolution of the check is one period (equals to timeout value).
		 
		 '''Emits when''' upstream emits an element
		 
		
		
		 '''Backpressures when''' downstream backpressures
		 
		
		
		 '''Completes when''' upstream completes or fails if timeout elapses between element emission and downstream demand.
		 
		
		
		 '''Cancels when''' downstream cancels
		- #### batch
		
		
		
		```
		<S> [FlowOps](FlowOps.html "interface in akka.stream.scaladsl") batch​(long max,
		                  scala.Function1<[Out](FlowOps.html "type parameter in FlowOps"),​S> seed,
		                  scala.Function2<S,​[Out](FlowOps.html "type parameter in FlowOps"),​S> aggregate)
		```
		
		Allows a faster upstream to progress independently of a slower subscriber by aggregating elements into batches
		 until the subscriber is ready to accept them. For example a batch step might store received elements in
		 an array up to the allowed max limit if the upstream publisher is faster.
		 
		 This only rolls up elements if the upstream is faster, but if the downstream is faster it will not
		 duplicate elements.
		 
		
		
		 Adheres to the `ActorAttributes.SupervisionStrategy` attribute.
		 
		
		
		 '''Emits when''' downstream stops backpressuring and there is an aggregated element available
		 
		
		
		 '''Backpressures when''' there are `max` batched elements and 1 pending element and downstream backpressures
		 
		
		
		 '''Completes when''' upstream completes and there is no batched/pending element waiting
		 
		
		
		 '''Cancels when''' downstream cancels
		 
		
		
		 See also `FlowOps.conflateWithSeed`, `FlowOps.batchWeighted`
		
		
		
		
		Parameters:
		`max` \- maximum number of elements to batch before backpressuring upstream (must be positive non\-zero)
		`seed` \- Provides the first state for a batched value using the first unconsumed element as a start
		`aggregate` \- Takes the currently batched value and the current pending element to produce a new aggregate
		- #### batchWeighted
		
		
		
		```
		<S> [FlowOps](FlowOps.html "interface in akka.stream.scaladsl") batchWeighted​(long max,
		                          scala.Function1<[Out](FlowOps.html "type parameter in FlowOps"),​java.lang.Object> costFn,
		                          scala.Function1<[Out](FlowOps.html "type parameter in FlowOps"),​S> seed,
		                          scala.Function2<S,​[Out](FlowOps.html "type parameter in FlowOps"),​S> aggregate)
		```
		
		Allows a faster upstream to progress independently of a slower subscriber by aggregating elements into batches
		 until the subscriber is ready to accept them. For example a batch step might concatenate `ByteString`
		 elements up to the allowed max limit if the upstream publisher is faster.
		 
		 This element only rolls up elements if the upstream is faster, but if the downstream is faster it will not
		 duplicate elements.
		 
		
		
		 Batching will apply for all elements, even if a single element cost is greater than the total allowed limit.
		 In this case, previous batched elements will be emitted, then the "heavy" element will be emitted (after
		 being applied with the `seed` function) without batching further elements with it, and then the rest of the
		 incoming elements are batched.
		 
		
		
		 '''Emits when''' downstream stops backpressuring and there is a batched element available
		 
		
		
		 '''Backpressures when''' there are `max` weighted batched elements \+ 1 pending element and downstream backpressures
		 
		
		
		 '''Completes when''' upstream completes and there is no batched/pending element waiting
		 
		
		
		 '''Cancels when''' downstream cancels
		 
		
		
		 See also `FlowOps.conflateWithSeed`, `FlowOps.batch`
		
		
		
		
		Parameters:
		`max` \- maximum weight of elements to batch before backpressuring upstream (must be positive non\-zero)
		`costFn` \- a function to compute a single element weight
		`seed` \- Provides the first state for a batched value using the first unconsumed element as a start
		`aggregate` \- Takes the currently batched value and the current pending element to produce a new batch
		- #### buffer
		
		
		
		```
		[FlowOps](FlowOps.html "interface in akka.stream.scaladsl") buffer​(int size,
		               [OverflowStrategy](../OverflowStrategy.html "class in akka.stream") overflowStrategy)
		```
		
		Adds a fixed size buffer in the flow that allows to store elements from a faster upstream until it becomes full.
		 Depending on the defined [`OverflowStrategy`](../OverflowStrategy.html "class in akka.stream") it might drop elements or backpressure the upstream if
		 there is no space available
		 
		 '''Emits when''' downstream stops backpressuring and there is a pending element in the buffer
		 
		
		
		 '''Backpressures when''' downstream backpressures or depending on OverflowStrategy:
		 
		
		
			- Backpressure \- backpressures when buffer is full
			- DropHead, DropTail, DropBuffer \- never backpressures
			- Fail \- fails the stream if buffer gets full
		
		 '''Completes when''' upstream completes and buffered elements have been drained
		 
		
		
		 '''Cancels when''' downstream cancels
		 
		
		
		
		Parameters:
		`size` \- The size of the buffer in element count
		`overflowStrategy` \- Strategy that is used when incoming elements cannot fit inside the buffer
		- #### collect
		
		
		
		```
		<T> [FlowOps](FlowOps.html "interface in akka.stream.scaladsl") collect​(scala.PartialFunction<[Out](FlowOps.html "type parameter in FlowOps"),​T> pf)
		```
		
		Transform this stream by applying the given partial function to each of the elements
		 on which the function is defined as they pass through this processing step.
		 Non\-matching elements are filtered out.
		 
		 Adheres to the `ActorAttributes.SupervisionStrategy` attribute.
		 
		
		
		 '''Emits when''' the provided partial function is defined for the element
		 
		
		
		 '''Backpressures when''' the partial function is defined for the element and downstream backpressures
		 
		
		
		 '''Completes when''' upstream completes
		 
		
		
		 '''Cancels when''' downstream cancels
		- #### collectType
		
		
		
		```
		<T> [FlowOps](FlowOps.html "interface in akka.stream.scaladsl") collectType​(scala.reflect.ClassTag<T> tag)
		```
		
		Transform this stream by testing the type of each of the elements
		 on which the element is an instance of the provided type as they pass through this processing step.
		 
		 Non\-matching elements are filtered out.
		 
		
		
		 Adheres to the `ActorAttributes.SupervisionStrategy` attribute.
		 
		
		
		 '''Emits when''' the element is an instance of the provided type
		 
		
		
		 '''Backpressures when''' the element is an instance of the provided type and downstream backpressures
		 
		
		
		 '''Completes when''' upstream completes
		 
		
		
		 '''Cancels when''' downstream cancels
		- #### completionTimeout
		
		
		
		```
		[FlowOps](FlowOps.html "interface in akka.stream.scaladsl") completionTimeout​(scala.concurrent.duration.FiniteDuration timeout)
		```
		
		If the completion of the stream does not happen until the provided timeout, the stream is failed
		 with a [`CompletionTimeoutException`](../CompletionTimeoutException.html "class in akka.stream").
		 
		 '''Emits when''' upstream emits an element
		 
		
		
		 '''Backpressures when''' downstream backpressures
		 
		
		
		 '''Completes when''' upstream completes or fails if timeout elapses before upstream completes
		 
		
		
		 '''Cancels when''' downstream cancels
		- #### concat
		
		
		
		```
		<U,​Mat2> [FlowOps](FlowOps.html "interface in akka.stream.scaladsl") concat​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<U>,​Mat2> that)
		```
		
		Concatenate the given [`Source`](Source.html "class in akka.stream.scaladsl") to this [`Flow`](Flow.html "class in akka.stream.scaladsl"), meaning that once this
		 Flow\&rsquo;s input is exhausted and all result elements have been generated,
		 the Source\&rsquo;s elements will be produced.
		 
		 Note that the [`Source`](Source.html "class in akka.stream.scaladsl") is materialized together with this Flow and is "detached" meaning it will
		 in effect behave as a one element buffer in front of both the sources, that eagerly demands an element on start
		 (so it can not be combined with `Source.lazy` to defer materialization of `that`).
		 
		
		
		 The second source is then kept from producing elements by asserting back\-pressure until its time comes.
		 
		
		
		 When needing a concat operator that is not detached use [`concatLazy(akka.stream.Graph<akka.stream.SourceShape<U>, Mat2>)`](#concatLazy(akka.stream.Graph))
		
		
		
		 If this [`Flow`](Flow.html "class in akka.stream.scaladsl") gets upstream error \- no elements from the given [`Source`](Source.html "class in akka.stream.scaladsl") will be pulled.
		 
		
		
		 '''Emits when''' element is available from current stream or from the given [`Source`](Source.html "class in akka.stream.scaladsl") when current is completed
		 
		
		
		 '''Backpressures when''' downstream backpressures
		 
		
		
		 '''Completes when''' given [`Source`](Source.html "class in akka.stream.scaladsl") completes
		 
		
		
		 '''Cancels when''' downstream cancels
		- #### concatAllLazy
		
		
		
		```
		<U> [FlowOps](FlowOps.html "interface in akka.stream.scaladsl") concatAllLazy​(scala.collection.immutable.Seq<[Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<U>,​?>> those)
		```
		
		Concatenate the given [`Source`](Source.html "class in akka.stream.scaladsl")s to this [`Flow`](Flow.html "class in akka.stream.scaladsl"), meaning that once this
		 Flow\&rsquo;s input is exhausted and all result elements have been generated,
		 the [`Source`](Source.html "class in akka.stream.scaladsl")s' elements will be produced.
		 
		 Note that the [`Source`](Source.html "class in akka.stream.scaladsl")s are materialized together with this Flow. If `lazy` materialization is what is needed
		 the operator can be combined with for example `Source.lazySource` to defer materialization of `that` until the
		 time when this source completes.
		 
		
		
		 The second source is then kept from producing elements by asserting back\-pressure until its time comes.
		 
		
		
		 For a concat operator that is detached, use [`concat(akka.stream.Graph<akka.stream.SourceShape<U>, Mat2>)`](#concat(akka.stream.Graph))
		
		
		
		 If this [`Flow`](Flow.html "class in akka.stream.scaladsl") gets upstream error \- no elements from the given [`Source`](Source.html "class in akka.stream.scaladsl")s will be pulled.
		 
		
		
		 '''Emits when''' element is available from current stream or from the given [`Source`](Source.html "class in akka.stream.scaladsl")s when current is completed
		 
		
		
		 '''Backpressures when''' downstream backpressures
		 
		
		
		 '''Completes when''' given all those [`Source`](Source.html "class in akka.stream.scaladsl")s completes
		 
		
		
		 '''Cancels when''' downstream cancels
		- #### concatGraph
		
		
		
		```
		<U,​Mat2> [Graph](../Graph.html "interface in akka.stream")<[FlowShape](../FlowShape.html "class in akka.stream")<[Out](FlowOps.html "type parameter in FlowOps"),​U>,​Mat2> concatGraph​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<U>,​Mat2> that,
		                                                                    boolean detached)
		```
		- #### concatLazy
		
		
		
		```
		<U,​Mat2> [FlowOps](FlowOps.html "interface in akka.stream.scaladsl") concatLazy​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<U>,​Mat2> that)
		```
		
		Concatenate the given [`Source`](Source.html "class in akka.stream.scaladsl") to this [`Flow`](Flow.html "class in akka.stream.scaladsl"), meaning that once this
		 Flow\&rsquo;s input is exhausted and all result elements have been generated,
		 the Source\&rsquo;s elements will be produced.
		 
		 Note that the [`Source`](Source.html "class in akka.stream.scaladsl") is materialized together with this Flow. If `lazy` materialization is what is needed
		 the operator can be combined with for example `Source.lazySource` to defer materialization of `that` until the
		 time when this source completes.
		 
		
		
		 The second source is then kept from producing elements by asserting back\-pressure until its time comes.
		 
		
		
		 For a concat operator that is detached, use [`concat(akka.stream.Graph<akka.stream.SourceShape<U>, Mat2>)`](#concat(akka.stream.Graph))
		
		
		
		 If this [`Flow`](Flow.html "class in akka.stream.scaladsl") gets upstream error \- no elements from the given [`Source`](Source.html "class in akka.stream.scaladsl") will be pulled.
		 
		
		
		 '''Emits when''' element is available from current stream or from the given [`Source`](Source.html "class in akka.stream.scaladsl") when current is completed
		 
		
		
		 '''Backpressures when''' downstream backpressures
		 
		
		
		 '''Completes when''' given [`Source`](Source.html "class in akka.stream.scaladsl") completes
		 
		
		
		 '''Cancels when''' downstream cancels
		- #### conflate
		
		
		
		```
		<O2> [FlowOps](FlowOps.html "interface in akka.stream.scaladsl") conflate​(scala.Function2<O2,​O2,​O2> aggregate)
		```
		
		Allows a faster upstream to progress independently of a slower subscriber by conflating elements into a summary
		 until the subscriber is ready to accept them. For example a conflate step might average incoming numbers if the
		 upstream publisher is faster.
		 
		 This version of conflate does not change the output type of the stream. See `FlowOps.conflateWithSeed` for a
		 more flexible version that can take a seed function and transform elements while rolling up.
		 
		
		
		 This element only rolls up elements if the upstream is faster, but if the downstream is faster it will not
		 duplicate elements.
		 
		
		
		 Adheres to the `ActorAttributes.SupervisionStrategy` attribute.
		 
		
		
		 '''Emits when''' downstream stops backpressuring and there is a conflated element available
		 
		
		
		 '''Backpressures when''' never
		 
		
		
		 '''Completes when''' upstream completes
		 
		
		
		 '''Cancels when''' downstream cancels
		 
		
		
		
		Parameters:
		`aggregate` \- Takes the currently aggregated value and the current pending element to produce a new aggregate
		 
		 See also `FlowOps.conflate`, `FlowOps.limit`, `FlowOps.limitWeighted` `FlowOps.batch` `FlowOps.batchWeighted`
		- #### conflateWithSeed
		
		
		
		```
		<S> [FlowOps](FlowOps.html "interface in akka.stream.scaladsl") conflateWithSeed​(scala.Function1<[Out](FlowOps.html "type parameter in FlowOps"),​S> seed,
		                             scala.Function2<S,​[Out](FlowOps.html "type parameter in FlowOps"),​S> aggregate)
		```
		
		Allows a faster upstream to progress independently of a slower subscriber by conflating elements into a summary
		 until the subscriber is ready to accept them. For example a conflate step might average incoming numbers if the
		 upstream publisher is faster.
		 
		 This version of conflate allows to derive a seed from the first element and change the aggregated type to be
		 different than the input type. See `FlowOps.conflate` for a simpler version that does not change types.
		 
		
		
		 This element only rolls up elements if the upstream is faster, but if the downstream is faster it will not
		 duplicate elements.
		 
		
		
		 Adheres to the `ActorAttributes.SupervisionStrategy` attribute.
		 
		
		
		 '''Emits when''' downstream stops backpressuring and there is a conflated element available
		 
		
		
		 '''Backpressures when''' never
		 
		
		
		 '''Completes when''' upstream completes
		 
		
		
		 '''Cancels when''' downstream cancels
		 
		
		
		
		Parameters:
		`seed` \- Provides the first state for a conflated value using the first unconsumed element as a start
		`aggregate` \- Takes the currently aggregated value and the current pending element to produce a new aggregate
		 
		 See also `FlowOps.conflate`, `FlowOps.limit`, `FlowOps.limitWeighted` `FlowOps.batch` `FlowOps.batchWeighted`
		- #### delay
		
		
		
		```
		[FlowOps](FlowOps.html "interface in akka.stream.scaladsl") delay​(scala.concurrent.duration.FiniteDuration of,
		              [DelayOverflowStrategy](../DelayOverflowStrategy.html "class in akka.stream") strategy)
		```
		
		Shifts elements emission in time by a specified amount. It allows to store elements
		 in internal buffer while waiting for next element to be emitted. Depending on the defined
		 [`DelayOverflowStrategy`](../DelayOverflowStrategy.html "class in akka.stream") it might drop elements or backpressure the upstream if
		 there is no space available in the buffer.
		 
		 Delay precision is 10ms to avoid unnecessary timer scheduling cycles
		 
		
		
		 Internal buffer has default capacity 16\. You can set buffer size by calling `addAttributes(inputBuffer)`
		
		
		
		 '''Emits when''' there is a pending element in the buffer and configured time for this element elapsed
		 \* EmitEarly \- strategy do not wait to emit element if buffer is full
		 
		
		
		 '''Backpressures when''' depending on OverflowStrategy
		 \* Backpressure \- backpressures when buffer is full
		 \* DropHead, DropTail, DropBuffer \- never backpressures
		 \* Fail \- fails the stream if buffer gets full
		 
		
		
		 '''Completes when''' upstream completes and buffered elements have been drained
		 
		
		
		 '''Cancels when''' downstream cancels
		 
		
		
		
		Parameters:
		`of` \- time to shift all messages
		`strategy` \- Strategy that is used when incoming elements cannot fit inside the buffer
		- #### delay$default$2
		
		
		
		```
		[DelayOverflowStrategy](../DelayOverflowStrategy.html "class in akka.stream") delay$default$2()
		```
		- #### delayWith
		
		
		
		```
		[FlowOps](FlowOps.html "interface in akka.stream.scaladsl") delayWith​(scala.Function0<[DelayStrategy](DelayStrategy.html "interface in akka.stream.scaladsl")<[Out](FlowOps.html "type parameter in FlowOps")>> delayStrategySupplier,
		                  [DelayOverflowStrategy](../DelayOverflowStrategy.html "class in akka.stream") overFlowStrategy)
		```
		
		Shifts elements emission in time by an amount individually determined through delay strategy a specified amount.
		 It allows to store elements in internal buffer while waiting for next element to be emitted. Depending on the defined
		 [`DelayOverflowStrategy`](../DelayOverflowStrategy.html "class in akka.stream") it might drop elements or backpressure the upstream if
		 there is no space available in the buffer.
		 
		 It determines delay for each ongoing element invoking `DelayStrategy.nextDelay(elem: T): FiniteDuration`.
		 
		
		
		 Note that elements are not re\-ordered: if an element is given a delay much shorter than its predecessor,
		 it will still have to wait for the preceding element before being emitted.
		 It is also important to notice that `scaladsl.DelayStrategy` can be stateful.
		 
		
		
		 Delay precision is 10ms to avoid unnecessary timer scheduling cycles.
		 
		
		
		 Internal buffer has default capacity 16\. You can set buffer size by calling `addAttributes(inputBuffer)`
		
		
		
		 '''Emits when''' there is a pending element in the buffer and configured time for this element elapsed
		 \* EmitEarly \- strategy do not wait to emit element if buffer is full
		 
		
		
		 '''Backpressures when''' depending on OverflowStrategy
		 \* Backpressure \- backpressures when buffer is full
		 \* DropHead, DropTail, DropBuffer \- never backpressures
		 \* Fail \- fails the stream if buffer gets full
		 
		
		
		 '''Completes when''' upstream completes and buffered elements have been drained
		 
		
		
		 '''Cancels when''' downstream cancels
		 
		
		
		
		Parameters:
		`delayStrategySupplier` \- creates new [`DelayStrategy`](DelayStrategy.html "interface in akka.stream.scaladsl") object for each materialization
		`overFlowStrategy` \- Strategy that is used when incoming elements cannot fit inside the buffer
		- #### detach
		
		
		
		```
		[FlowOps](FlowOps.html "interface in akka.stream.scaladsl") detach()
		```
		
		Detaches upstream demand from downstream demand without detaching the
		 stream rates; in other words acts like a buffer of size 1\.
		 
		 '''Emits when''' upstream emits an element
		 
		
		
		 '''Backpressures when''' downstream backpressures
		 
		
		
		 '''Completes when''' upstream completes
		 
		
		
		 '''Cancels when''' downstream cancels
		- #### divertTo
		
		
		
		```
		[FlowOps](FlowOps.html "interface in akka.stream.scaladsl") divertTo​([Graph](../Graph.html "interface in akka.stream")<[SinkShape](../SinkShape.html "class in akka.stream")<[Out](FlowOps.html "type parameter in FlowOps")>,​?> that,
		                 scala.Function1<[Out](FlowOps.html "type parameter in FlowOps"),​java.lang.Object> when)
		```
		
		Attaches the given [`Sink`](Sink.html "class in akka.stream.scaladsl") to this [`Flow`](Flow.html "class in akka.stream.scaladsl"), meaning that elements will be sent to the [`Sink`](Sink.html "class in akka.stream.scaladsl")
		 instead of being passed through if the predicate `when` returns `true`.
		 
		 '''Emits when''' emits when an element is available from the input and the chosen output has demand
		 
		
		
		 '''Backpressures when''' the currently chosen output back\-pressures
		 
		
		
		 '''Completes when''' upstream completes and no output is pending
		 
		
		
		 '''Cancels when''' any of the downstreams cancel
		- #### divertToGraph
		
		
		
		```
		<M> [Graph](../Graph.html "interface in akka.stream")<[FlowShape](../FlowShape.html "class in akka.stream")<[Out](FlowOps.html "type parameter in FlowOps"),​[Out](FlowOps.html "type parameter in FlowOps")>,​M> divertToGraph​([Graph](../Graph.html "interface in akka.stream")<[SinkShape](../SinkShape.html "class in akka.stream")<[Out](FlowOps.html "type parameter in FlowOps")>,​M> that,
		                                                          scala.Function1<[Out](FlowOps.html "type parameter in FlowOps"),​java.lang.Object> when)
		```
		- #### drop
		
		
		
		```
		[FlowOps](FlowOps.html "interface in akka.stream.scaladsl") drop​(long n)
		```
		
		Discard the given number of elements at the beginning of the stream.
		 No elements will be dropped if `n` is zero or negative.
		 
		 '''Emits when''' the specified number of elements has been dropped already
		 
		
		
		 '''Backpressures when''' the specified number of elements has been dropped and downstream backpressures
		 
		
		
		 '''Completes when''' upstream completes
		 
		
		
		 '''Cancels when''' downstream cancels
		- #### dropWhile
		
		
		
		```
		[FlowOps](FlowOps.html "interface in akka.stream.scaladsl") dropWhile​(scala.Function1<[Out](FlowOps.html "type parameter in FlowOps"),​java.lang.Object> p)
		```
		
		Discard elements at the beginning of the stream while predicate is true.
		 All elements will be taken after predicate returns false first time.
		 
		 Adheres to the `ActorAttributes.SupervisionStrategy` attribute.
		 
		
		
		 '''Emits when''' predicate returned false and for all following stream elements
		 
		
		
		 '''Backpressures when''' predicate returned false and downstream backpressures
		 
		
		
		 '''Completes when''' upstream completes
		 
		
		
		 '''Cancels when''' downstream cancels
		- #### dropWithin
		
		
		
		```
		[FlowOps](FlowOps.html "interface in akka.stream.scaladsl") dropWithin​(scala.concurrent.duration.FiniteDuration d)
		```
		
		Discard the elements received within the given duration at beginning of the stream.
		 
		 '''Emits when''' the specified time elapsed and a new upstream element arrives
		 
		
		
		 '''Backpressures when''' downstream backpressures
		 
		
		
		 '''Completes when''' upstream completes
		 
		
		
		 '''Cancels when''' downstream cancels
		- #### expand
		
		
		
		```
		<U> [FlowOps](FlowOps.html "interface in akka.stream.scaladsl") expand​(scala.Function1<[Out](FlowOps.html "type parameter in FlowOps"),​scala.collection.Iterator<U>> expander)
		```
		
		Allows a faster downstream to progress independently of a slower upstream by extrapolating elements from an older
		 element until new element comes from the upstream. For example an expand step might repeat the last element for
		 the subscriber until it receives an update from upstream.
		 
		 This element will never "drop" upstream elements as all elements go through at least one extrapolation step.
		 This means that if the upstream is actually faster than the upstream it will be backpressured by the downstream
		 subscriber.
		 
		
		
		 Expand does not support `akka.stream.Supervision.Restart` and `akka.stream.Supervision.Resume`.
		 Exceptions from the `seed` function will complete the stream with failure.
		 
		
		
		 '''Emits when''' downstream stops backpressuring
		 
		
		
		 '''Backpressures when''' downstream backpressures or iterator runs empty
		 
		
		
		 '''Completes when''' upstream completes
		 
		
		
		 '''Cancels when''' downstream cancels
		 
		
		
		
		Parameters:
		`expander` \- Takes the current extrapolation state to produce an output element and the next extrapolation
		 state.
		- #### extrapolate
		
		
		
		```
		<U> [FlowOps](FlowOps.html "interface in akka.stream.scaladsl") extrapolate​(scala.Function1<U,​scala.collection.Iterator<U>> extrapolator,
		                        scala.Option<U> initial)
		```
		
		Allows a faster downstream to progress independent of a slower upstream.
		 
		 This is achieved by introducing "extrapolated" elements \- based on those from upstream \- whenever downstream
		 signals demand.
		 
		
		
		 Extrapolate does not support `akka.stream.Supervision.Restart` and `akka.stream.Supervision.Resume`.
		 Exceptions from the `extrapolate` function will complete the stream with failure.
		 
		
		
		 '''Emits when''' downstream stops backpressuring, AND EITHER upstream emits OR initial element is present OR
		 `extrapolate` is non\-empty and applicable
		 
		
		
		 '''Backpressures when''' downstream backpressures or current `extrapolate` runs empty
		 
		
		
		 '''Completes when''' upstream completes and current `extrapolate` runs empty
		 
		
		
		 '''Cancels when''' downstream cancels
		 
		
		
		
		Parameters:
		`extrapolator` \- takes the current upstream element and provides a sequence of "extrapolated" elements based
		 on the original, to be emitted in case downstream signals demand.
		`initial` \- the initial element to be emitted, in case upstream is able to stall the entire stream.
		- #### extrapolate$default$2
		
		
		
		```
		<U> scala.None$ extrapolate$default$2()
		```
		- #### filter
		
		
		
		```
		[FlowOps](FlowOps.html "interface in akka.stream.scaladsl") filter​(scala.Function1<[Out](FlowOps.html "type parameter in FlowOps"),​java.lang.Object> p)
		```
		
		Only pass on those elements that satisfy the given predicate.
		 
		 Adheres to the `ActorAttributes.SupervisionStrategy` attribute.
		 
		
		
		 '''Emits when''' the given predicate returns true for the element
		 
		
		
		 '''Backpressures when''' the given predicate returns true for the element and downstream backpressures
		 
		
		
		 '''Completes when''' upstream completes
		 
		
		
		 '''Cancels when''' downstream cancels
		- #### filterNot
		
		
		
		```
		[FlowOps](FlowOps.html "interface in akka.stream.scaladsl") filterNot​(scala.Function1<[Out](FlowOps.html "type parameter in FlowOps"),​java.lang.Object> p)
		```
		
		Only pass on those elements that NOT satisfy the given predicate.
		 
		 Adheres to the `ActorAttributes.SupervisionStrategy` attribute.
		 
		
		
		 '''Emits when''' the given predicate returns false for the element
		 
		
		
		 '''Backpressures when''' the given predicate returns false for the element and downstream backpressures
		 
		
		
		 '''Completes when''' upstream completes
		 
		
		
		 '''Cancels when''' downstream cancels
		- #### flatMapConcat
		
		
		
		```
		<T,​M> [FlowOps](FlowOps.html "interface in akka.stream.scaladsl") flatMapConcat​(scala.Function1<[Out](FlowOps.html "type parameter in FlowOps"),​[Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<T>,​M>> f)
		```
		
		Transform each input element into a `Source` of output elements that is
		 then flattened into the output stream by concatenation,
		 fully consuming one Source after the other.
		 
		 '''Emits when''' a currently consumed substream has an element available
		 
		
		
		 '''Backpressures when''' downstream backpressures
		 
		
		
		 '''Completes when''' upstream completes and all consumed substreams complete
		 
		
		
		 '''Cancels when''' downstream cancels
		- #### flatMapMerge
		
		
		
		```
		<T,​M> [FlowOps](FlowOps.html "interface in akka.stream.scaladsl") flatMapMerge​(int breadth,
		                                 scala.Function1<[Out](FlowOps.html "type parameter in FlowOps"),​[Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<T>,​M>> f)
		```
		
		Transform each input element into a `Source` of output elements that is
		 then flattened into the output stream by merging, where at most `breadth`
		 substreams are being consumed at any given time.
		 
		 '''Emits when''' a currently consumed substream has an element available
		 
		
		
		 '''Backpressures when''' downstream backpressures
		 
		
		
		 '''Completes when''' upstream completes and all consumed substreams complete
		 
		
		
		 '''Cancels when''' downstream cancels
		- #### flatMapPrefix
		
		
		
		```
		<Out2,​Mat2> [FlowOps](FlowOps.html "interface in akka.stream.scaladsl") flatMapPrefix​(int n,
		                                        scala.Function1<scala.collection.immutable.Seq<[Out](FlowOps.html "type parameter in FlowOps")>,​[Flow](Flow.html "class in akka.stream.scaladsl")<[Out](FlowOps.html "type parameter in FlowOps"),​Out2,​Mat2>> f)
		```
		
		Takes up to `n` elements from the stream (less than `n` only if the upstream completes before emitting `n` elements),
		 then apply `f` on these elements in order to obtain a flow, this flow is then materialized and the rest of the input is processed by this flow (similar to via).
		 This method returns a flow consuming the rest of the stream producing the materialized flow's output.
		 
		 '''Emits when''' the materialized flow emits.
		 Notice the first `n` elements are buffered internally before materializing the flow and connecting it to the rest of the upstream \- producing elements at its own discretion (might 'swallow' or multiply elements).
		 
		
		
		 '''Backpressures when''' the materialized flow backpressures
		 
		
		
		 '''Completes when''' the materialized flow completes.
		 If upstream completes before producing `n` elements, `f` will be applied with the provided elements,
		 the resulting flow will be materialized and signalled for upstream completion, it can then complete or continue to emit elements at its own discretion.
		 
		
		
		 '''Cancels when''' the materialized flow cancels.
		 When downstream cancels before materialization of the nested flow, the operator's default behaviour is to cancel immediately,
		 this behaviour can be controlled by setting the [`Attributes.NestedMaterializationCancellationPolicy`](../Attributes.NestedMaterializationCancellationPolicy.html "class in akka.stream") attribute on the flow.
		 When this attribute is configured to true, downstream cancellation is delayed until the nested flow's materialization which is then immediately cancelled (with the original cancellation cause).
		 
		
		
		
		Parameters:
		`n` \- the number of elements to accumulate before materializing the downstream flow.
		`f` \- a function that produces the downstream flow based on the upstream's prefix.
		- #### fold
		
		
		
		```
		<T> [FlowOps](FlowOps.html "interface in akka.stream.scaladsl") fold​(T zero,
		                 scala.Function2<T,​[Out](FlowOps.html "type parameter in FlowOps"),​T> f)
		```
		
		Similar to `scan` but only emits its result when the upstream completes,
		 after which it also completes. Applies the given function towards its current and next value,
		 yielding the next current value.
		 
		 If the function `f` throws an exception and the supervision decision is
		 `akka.stream.Supervision.Restart` current value starts at `zero` again
		 the stream will continue.
		 
		
		
		 Adheres to the `ActorAttributes.SupervisionStrategy` attribute.
		 
		
		
		 Note that the `zero` value must be immutable.
		 
		
		
		 '''Emits when''' upstream completes
		 
		
		
		 '''Backpressures when''' downstream backpressures
		 
		
		
		 '''Completes when''' upstream completes
		 
		
		
		 '''Cancels when''' downstream cancels
		 
		
		
		 See also `FlowOps.scan`
		- #### foldAsync
		
		
		
		```
		<T> [FlowOps](FlowOps.html "interface in akka.stream.scaladsl") foldAsync​(T zero,
		                      scala.Function2<T,​[Out](FlowOps.html "type parameter in FlowOps"),​scala.concurrent.Future<T>> f)
		```
		
		Similar to `fold` but with an asynchronous function.
		 Applies the given function towards its current and next value,
		 yielding the next current value.
		 
		 Adheres to the `ActorAttributes.SupervisionStrategy` attribute.
		 
		
		
		 If the function `f` returns a failure and the supervision decision is
		 `akka.stream.Supervision.Restart` current value starts at `zero` again
		 the stream will continue.
		 
		
		
		 Note that the `zero` value must be immutable.
		 
		
		
		 '''Emits when''' upstream completes
		 
		
		
		 '''Backpressures when''' downstream backpressures
		 
		
		
		 '''Completes when''' upstream completes
		 
		
		
		 '''Cancels when''' downstream cancels
		 
		
		
		 See also `FlowOps.fold`
		- #### groupBy
		
		
		
		```
		<K> [SubFlow](SubFlow.html "interface in akka.stream.scaladsl")<[Out](FlowOps.html "type parameter in FlowOps"),​[Mat](FlowOps.html "type parameter in FlowOps"),​[FlowOps](FlowOps.html "interface in akka.stream.scaladsl"),​java.lang.Object> groupBy​(int maxSubstreams,
		                                                                        scala.Function1<[Out](FlowOps.html "type parameter in FlowOps"),​K> f,
		                                                                        boolean allowClosedSubstreamRecreation)
		```
		
		This operation demultiplexes the incoming stream into separate output
		 streams, one for each element key. The key is computed for each element
		 using the given function. When a new key is encountered for the first time
		 a new substream is opened and subsequently fed with all elements belonging to
		 that key.
		 
		 WARNING: If `allowClosedSubstreamRecreation` is set to `false` (default behavior) the operator
		 keeps track of all keys of streams that have already been closed. If you expect an infinite
		 number of keys this can cause memory issues. Elements belonging to those keys are drained
		 directly and not send to the substream.
		 
		
		
		 Note: If `allowClosedSubstreamRecreation` is set to `true` substream completion and incoming
		 elements are subject to race\-conditions. If elements arrive for a stream that is in the process
		 of closing these elements might get lost.
		 
		
		
		 The object returned from this method is not a normal [`Source`](Source.html "class in akka.stream.scaladsl") or [`Flow`](Flow.html "class in akka.stream.scaladsl"),
		 it is a [`SubFlow`](SubFlow.html "interface in akka.stream.scaladsl"). This means that after this operator all transformations
		 are applied to all encountered substreams in the same fashion. Substream mode
		 is exited either by closing the substream (i.e. connecting it to a [`Sink`](Sink.html "class in akka.stream.scaladsl"))
		 or by merging the substreams back together; see the `to` and `mergeBack` methods
		 on [`SubFlow`](SubFlow.html "interface in akka.stream.scaladsl") for more information.
		 
		
		
		 It is important to note that the substreams also propagate back\-pressure as
		 any other stream, which means that blocking one substream will block the `groupBy`
		 operator itself—and thereby all substreams—once all internal or
		 explicit buffers are filled.
		 
		
		
		 If the group by function `f` throws an exception and the supervision decision
		 is `akka.stream.Supervision.Stop` the stream and substreams will be completed
		 with failure.
		 
		
		
		 If the group by function `f` throws an exception and the supervision decision
		 is `akka.stream.Supervision.Resume` or `akka.stream.Supervision.Restart`
		 the element is dropped and the stream and substreams continue.
		 
		
		
		 Function `f` MUST NOT return `null`. This will throw exception and trigger supervision decision mechanism.
		 
		
		
		 Adheres to the `ActorAttributes.SupervisionStrategy` attribute.
		 
		
		
		 '''Emits when''' an element for which the grouping function returns a group that has not yet been created.
		 Emits the new group
		 
		
		
		 '''Backpressures when''' there is an element pending for a group whose substream backpressures
		 
		
		
		 '''Completes when''' upstream completes
		 
		
		
		 '''Cancels when''' downstream cancels and all substreams cancel
		 
		
		
		
		Parameters:
		`maxSubstreams` \- configures the maximum number of substreams (keys)
		 that are supported; if more distinct keys are encountered then the stream fails
		`f` \- computes the key for each element
		`allowClosedSubstreamRecreation` \- enables recreation of already closed substreams if elements with their
		 corresponding keys arrive after completion
		- #### groupBy
		
		
		
		```
		<K> [SubFlow](SubFlow.html "interface in akka.stream.scaladsl")<[Out](FlowOps.html "type parameter in FlowOps"),​[Mat](FlowOps.html "type parameter in FlowOps"),​[FlowOps](FlowOps.html "interface in akka.stream.scaladsl"),​java.lang.Object> groupBy​(int maxSubstreams,
		                                                                        scala.Function1<[Out](FlowOps.html "type parameter in FlowOps"),​K> f)
		```
		
		This operation demultiplexes the incoming stream into separate output
		 streams, one for each element key. The key is computed for each element
		 using the given function. When a new key is encountered for the first time
		 a new substream is opened and subsequently fed with all elements belonging to
		 that key.
		 
		 WARNING: The operator keeps track of all keys of streams that have already been closed.
		 If you expect an infinite number of keys this can cause memory issues. Elements belonging
		 to those keys are drained directly and not send to the substream.
		 
		
		
		
		See Also:
		[`groupBy(int, scala.Function1<Out, K>, boolean)`](#groupBy(int,scala.Function1,boolean))
		- #### grouped
		
		
		
		```
		[FlowOps](FlowOps.html "interface in akka.stream.scaladsl") grouped​(int n)
		```
		
		Chunk up this stream into groups of the given size, with the last group
		 possibly smaller than requested due to end\-of\-stream.
		 
		`n` must be positive, otherwise IllegalArgumentException is thrown.
		 
		
		
		 '''Emits when''' the specified number of elements have been accumulated or upstream completed
		 
		
		
		 '''Backpressures when''' a group has been assembled and downstream backpressures
		 
		
		
		 '''Completes when''' upstream completes
		 
		
		
		 '''Cancels when''' downstream cancels
		- #### groupedWeighted
		
		
		
		```
		[FlowOps](FlowOps.html "interface in akka.stream.scaladsl") groupedWeighted​(long minWeight,
		                        scala.Function1<[Out](FlowOps.html "type parameter in FlowOps"),​java.lang.Object> costFn)
		```
		
		Chunk up this stream into groups of elements that have a cumulative weight greater than or equal to
		 the `minWeight`, with the last group possibly smaller than requested `minWeight` due to end\-of\-stream.
		 
		`minWeight` must be positive, otherwise IllegalArgumentException is thrown.
		 `costFn` must return a non\-negative result for all inputs, otherwise the stage will fail
		 with an IllegalArgumentException.
		 
		
		
		 '''Emits when''' the cumulative weight of elements is greater than or equal to the `minWeight` or upstream completed
		 
		
		
		 '''Backpressures when''' a buffered group weighs more than `minWeight` and downstream backpressures
		 
		
		
		 '''Completes when''' upstream completes
		 
		
		
		 '''Cancels when''' downstream cancels
		- #### groupedWeightedWithin
		
		
		
		```
		[FlowOps](FlowOps.html "interface in akka.stream.scaladsl") groupedWeightedWithin​(long maxWeight,
		                              scala.concurrent.duration.FiniteDuration d,
		                              scala.Function1<[Out](FlowOps.html "type parameter in FlowOps"),​java.lang.Object> costFn)
		```
		
		Chunk up this stream into groups of elements received within a time window,
		 or limited by the weight of the elements, whatever happens first.
		 Empty groups will not be emitted if no elements are received from upstream.
		 The last group before end\-of\-stream will contain the buffered elements
		 since the previously emitted group.
		 
		`maxWeight` must be positive, and `d` must be greater than 0 seconds, otherwise
		 IllegalArgumentException is thrown.
		 
		
		
		 '''Emits when''' the configured time elapses since the last group has been emitted or weight limit reached
		 
		
		
		 '''Backpressures when''' downstream backpressures, and buffered group (\+ pending element) weighs more than `maxWeight`
		
		
		
		 '''Completes when''' upstream completes (emits last group)
		 
		
		
		 '''Cancels when''' downstream completes
		- #### groupedWeightedWithin
		
		
		
		```
		[FlowOps](FlowOps.html "interface in akka.stream.scaladsl") groupedWeightedWithin​(long maxWeight,
		                              int maxNumber,
		                              scala.concurrent.duration.FiniteDuration d,
		                              scala.Function1<[Out](FlowOps.html "type parameter in FlowOps"),​java.lang.Object> costFn)
		```
		
		Chunk up this stream into groups of elements received within a time window,
		 or limited by the weight and number of the elements, whatever happens first.
		 Empty groups will not be emitted if no elements are received from upstream.
		 The last group before end\-of\-stream will contain the buffered elements
		 since the previously emitted group.
		 
		`maxWeight` must be positive, `maxNumber` must be positive, and `d` must be greater than 0 seconds,
		 otherwise IllegalArgumentException is thrown.
		 
		
		
		 '''Emits when''' the configured time elapses since the last group has been emitted or weight limit reached
		 
		
		
		 '''Backpressures when''' downstream backpressures, and buffered group (\+ pending element) weighs more than
		 `maxWeight` or has more than `maxNumber` elements
		 
		
		
		 '''Completes when''' upstream completes (emits last group)
		 
		
		
		 '''Cancels when''' downstream completes
		- #### groupedWithin
		
		
		
		```
		[FlowOps](FlowOps.html "interface in akka.stream.scaladsl") groupedWithin​(int n,
		                      scala.concurrent.duration.FiniteDuration d)
		```
		
		Chunk up this stream into groups of elements received within a time window,
		 or limited by the given number of elements, whatever happens first.
		 Empty groups will not be emitted if no elements are received from upstream.
		 The last group before end\-of\-stream will contain the buffered elements
		 since the previously emitted group.
		 
		`n` must be positive, and `d` must be greater than 0 seconds, otherwise
		 IllegalArgumentException is thrown.
		 
		
		
		 '''Emits when''' the configured time elapses since the last group has been emitted or `n` elements is buffered
		 
		
		
		 '''Backpressures when''' downstream backpressures, and there are `n+1` buffered elements
		 
		
		
		 '''Completes when''' upstream completes (emits last group)
		 
		
		
		 '''Cancels when''' downstream completes
		- #### idleTimeout
		
		
		
		```
		[FlowOps](FlowOps.html "interface in akka.stream.scaladsl") idleTimeout​(scala.concurrent.duration.FiniteDuration timeout)
		```
		
		If the time between two processed elements exceeds the provided timeout, the stream is failed
		 with a [`StreamIdleTimeoutException`](../StreamIdleTimeoutException.html "class in akka.stream"). The timeout is checked periodically,
		 so the resolution of the check is one period (equals to timeout value).
		 
		 '''Emits when''' upstream emits an element
		 
		
		
		 '''Backpressures when''' downstream backpressures
		 
		
		
		 '''Completes when''' upstream completes or fails if timeout elapses between two emitted elements
		 
		
		
		 '''Cancels when''' downstream cancels
		- #### initialDelay
		
		
		
		```
		[FlowOps](FlowOps.html "interface in akka.stream.scaladsl") initialDelay​(scala.concurrent.duration.FiniteDuration delay)
		```
		
		Delays the initial element by the specified duration.
		 
		 '''Emits when''' upstream emits an element if the initial delay is already elapsed
		 
		
		
		 '''Backpressures when''' downstream backpressures or initial delay is not yet elapsed
		 
		
		
		 '''Completes when''' upstream completes
		 
		
		
		 '''Cancels when''' downstream cancels
		- #### initialTimeout
		
		
		
		```
		[FlowOps](FlowOps.html "interface in akka.stream.scaladsl") initialTimeout​(scala.concurrent.duration.FiniteDuration timeout)
		```
		
		If the first element has not passed through this operator before the provided timeout, the stream is failed
		 with a [`InitialTimeoutException`](../InitialTimeoutException.html "class in akka.stream").
		 
		 '''Emits when''' upstream emits an element
		 
		
		
		 '''Backpressures when''' downstream backpressures
		 
		
		
		 '''Completes when''' upstream completes or fails if timeout elapses before first element arrives
		 
		
		
		 '''Cancels when''' downstream cancels
		- #### interleave
		
		
		
		```
		<U> [FlowOps](FlowOps.html "interface in akka.stream.scaladsl") interleave​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<U>,​?> that,
		                       int segmentSize)
		```
		
		Interleave is a deterministic merge of the given [`Source`](Source.html "class in akka.stream.scaladsl") with elements of this [`Flow`](Flow.html "class in akka.stream.scaladsl").
		 It first emits `segmentSize` number of elements from this flow to downstream, then \- same amount for `that`
		 source, then repeat process.
		 
		 Example:
		 
		
		
		```
		
		 Source(List(1, 2, 3)).interleave(List(4, 5, 6, 7), 2) // 1, 2, 4, 5, 3, 6, 7
		 
		```
		
		
		 After one of upstreams is complete then all the rest elements will be emitted from the second one
		 
		
		
		 If it gets error from one of upstreams \- stream completes with failure.
		 
		
		
		 '''Emits when''' element is available from the currently consumed upstream
		 
		
		
		 '''Backpressures when''' downstream backpressures. Signal to current
		 upstream, switch to next upstream when received `segmentSize` elements
		 
		
		
		 '''Completes when''' the [`Flow`](Flow.html "class in akka.stream.scaladsl") and given [`Source`](Source.html "class in akka.stream.scaladsl") completes
		 
		
		
		 '''Cancels when''' downstream cancels
		- #### interleave
		
		
		
		```
		<U> [FlowOps](FlowOps.html "interface in akka.stream.scaladsl") interleave​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<U>,​?> that,
		                       int segmentSize,
		                       boolean eagerClose)
		```
		
		Interleave is a deterministic merge of the given [`Source`](Source.html "class in akka.stream.scaladsl") with elements of this [`Flow`](Flow.html "class in akka.stream.scaladsl").
		 It first emits `segmentSize` number of elements from this flow to downstream, then \- same amount for `that`
		 source, then repeat process.
		 
		 If eagerClose is false and one of the upstreams complete the elements from the other upstream will continue passing
		 through the interleave operator. If eagerClose is true and one of the upstream complete interleave will cancel the
		 other upstream and complete itself.
		 
		
		
		 If it gets error from one of upstreams \- stream completes with failure.
		 
		
		
		 '''Emits when''' element is available from the currently consumed upstream
		 
		
		
		 '''Backpressures when''' downstream backpressures. Signal to current
		 upstream, switch to next upstream when received `segmentSize` elements
		 
		
		
		 '''Completes when''' the [`Flow`](Flow.html "class in akka.stream.scaladsl") and given [`Source`](Source.html "class in akka.stream.scaladsl") completes
		 
		
		
		 '''Cancels when''' downstream cancels
		- #### interleaveAll
		
		
		
		```
		<U> [FlowOps](FlowOps.html "interface in akka.stream.scaladsl") interleaveAll​(scala.collection.immutable.Seq<[Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<U>,​?>> those,
		                          int segmentSize,
		                          boolean eagerClose)
		```
		
		Interleave is a deterministic merge of the given [`Source`](Source.html "class in akka.stream.scaladsl")s with elements of this [`Flow`](Flow.html "class in akka.stream.scaladsl").
		 It first emits `segmentSize` number of elements from this flow to downstream, then \- same amount for `that`
		 source, then repeat process.
		 
		 If eagerClose is false and one of the upstreams complete the elements from the other upstream will continue passing
		 through the interleave operator. If eagerClose is true and one of the upstream complete interleave will cancel the
		 other upstream and complete itself.
		 
		
		
		 If it gets error from one of upstreams \- stream completes with failure.
		 
		
		
		 '''Emits when''' element is available from the currently consumed upstream
		 
		
		
		 '''Backpressures when''' downstream backpressures. Signal to current
		 upstream, switch to next upstream when received `segmentSize` elements
		 
		
		
		 '''Completes when''' the [`Flow`](Flow.html "class in akka.stream.scaladsl") and given [`Source`](Source.html "class in akka.stream.scaladsl") completes
		 
		
		
		 '''Cancels when''' downstream cancels
		- #### interleaveGraph
		
		
		
		```
		<U,​M> [Graph](../Graph.html "interface in akka.stream")<[FlowShape](../FlowShape.html "class in akka.stream")<[Out](FlowOps.html "type parameter in FlowOps"),​U>,​M> interleaveGraph​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<U>,​M> that,
		                                                                  int segmentSize,
		                                                                  boolean eagerClose)
		```
		- #### interleaveGraph$default$3
		
		
		
		```
		<U,​M> boolean interleaveGraph$default$3()
		```
		- #### internalConcat
		
		
		
		```
		<U,​Mat2> [FlowOps](FlowOps.html "interface in akka.stream.scaladsl") internalConcat​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<U>,​Mat2> that,
		                                      boolean detached)
		```
		- #### internalConcatAll
		
		
		
		```
		<U> [FlowOps](FlowOps.html "interface in akka.stream.scaladsl") internalConcatAll​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<U>,​?>[] those,
		                              boolean detached)
		```
		- #### intersperse
		
		
		
		```
		<T> [FlowOps](FlowOps.html "interface in akka.stream.scaladsl") intersperse​(T start,
		                        T inject,
		                        T end)
		```
		
		Intersperses stream with provided element, similar to how `scala.collection.immutable.List.mkString`
		 injects a separator between a List's elements.
		 
		 Additionally can inject start and end marker elements to stream.
		 
		
		
		 Examples:
		 
		
		
		
		
		
		```
		
		 val nums = Source(List(1,2,3)).map(_.toString)
		 nums.intersperse(",")            //   1 , 2 , 3
		 nums.intersperse("[", ",", "]")  // [ 1 , 2 , 3 ]
		 
		```
		
		
		 In case you want to only prepend or only append an element (yet still use the `intercept` feature
		 to inject a separator between elements, you may want to use the following pattern instead of the 3\-argument
		 version of intersperse (See `Source.concat` for semantics details):
		 
		
		
		
		
		
		```
		
		 Source.single(">> ") ++ Source(List("1", "2", "3")).intersperse(",")
		 Source(List("1", "2", "3")).intersperse(",") ++ Source.single("END")
		 
		```
		
		
		 '''Emits when''' upstream emits (or before with the `start` element if provided)
		 
		
		
		 '''Backpressures when''' downstream backpressures
		 
		
		
		 '''Completes when''' upstream completes
		 
		
		
		 '''Cancels when''' downstream cancels
		- #### intersperse
		
		
		
		```
		<T> [FlowOps](FlowOps.html "interface in akka.stream.scaladsl") intersperse​(T inject)
		```
		
		Intersperses stream with provided element, similar to how `scala.collection.immutable.List.mkString`
		 injects a separator between a List's elements.
		 
		 Additionally can inject start and end marker elements to stream.
		 
		
		
		 Examples:
		 
		
		
		
		
		
		```
		
		 val nums = Source(List(1,2,3)).map(_.toString)
		 nums.intersperse(",")            //   1 , 2 , 3
		 nums.intersperse("[", ",", "]")  // [ 1 , 2 , 3 ]
		 
		```
		
		
		 '''Emits when''' upstream emits (or before with the `start` element if provided)
		 
		
		
		 '''Backpressures when''' downstream backpressures
		 
		
		
		 '''Completes when''' upstream completes
		 
		
		
		 '''Cancels when''' downstream cancels
		- #### keepAlive
		
		
		
		```
		<U> [FlowOps](FlowOps.html "interface in akka.stream.scaladsl") keepAlive​(scala.concurrent.duration.FiniteDuration maxIdle,
		                      scala.Function0<U> injectedElem)
		```
		
		Injects additional elements if upstream does not emit for a configured amount of time. In other words, this
		 operator attempts to maintains a base rate of emitted elements towards the downstream.
		 
		 If the downstream backpressures then no element is injected until downstream demand arrives. Injected elements
		 do not accumulate during this period.
		 
		
		
		 Upstream elements are always preferred over injected elements.
		 
		
		
		 '''Emits when''' upstream emits an element or if the upstream was idle for the configured period
		 
		
		
		 '''Backpressures when''' downstream backpressures
		 
		
		
		 '''Completes when''' upstream completes
		 
		
		
		 '''Cancels when''' downstream cancels
		- #### limit
		
		
		
		```
		[FlowOps](FlowOps.html "interface in akka.stream.scaladsl") limit​(long max)
		```
		
		Ensure stream boundedness by limiting the number of elements from upstream.
		 If the number of incoming elements exceeds max, it will signal
		 upstream failure `StreamLimitException` downstream.
		 
		 Due to input buffering some elements may have been
		 requested from upstream publishers that will then not be processed downstream
		 of this step.
		 
		
		
		 '''Emits when''' upstream emits and the number of emitted elements has not reached max
		 
		
		
		 '''Backpressures when''' downstream backpressures
		 
		
		
		 '''Completes when''' upstream completes and the number of emitted elements has not reached max
		 
		
		
		 '''Errors when''' the total number of incoming element exceeds max
		 
		
		
		 '''Cancels when''' downstream cancels
		 
		
		
		 See also `FlowOps.take`, `FlowOps.takeWithin`, `FlowOps.takeWhile`
		- #### limitWeighted
		
		
		
		```
		<T> [FlowOps](FlowOps.html "interface in akka.stream.scaladsl") limitWeighted​(long max,
		                          scala.Function1<[Out](FlowOps.html "type parameter in FlowOps"),​java.lang.Object> costFn)
		```
		
		Ensure stream boundedness by evaluating the cost of incoming elements
		 using a cost function. Exactly how many elements will be allowed to travel downstream depends on the
		 evaluated cost of each element. If the accumulated cost exceeds max, it will signal
		 upstream failure `StreamLimitException` downstream.
		 
		 Due to input buffering some elements may have been
		 requested from upstream publishers that will then not be processed downstream
		 of this step.
		 
		
		
		 Adheres to the `ActorAttributes.SupervisionStrategy` attribute.
		 
		
		
		 '''Emits when''' upstream emits and the accumulated cost has not reached max
		 
		
		
		 '''Backpressures when''' downstream backpressures
		 
		
		
		 '''Completes when''' upstream completes and the number of emitted elements has not reached max
		 
		
		
		 '''Errors when''' when the accumulated cost exceeds max
		 
		
		
		 '''Cancels when''' downstream cancels
		 
		
		
		 See also `FlowOps.take`, `FlowOps.takeWithin`, `FlowOps.takeWhile`
		- #### log
		
		
		
		```
		[FlowOps](FlowOps.html "interface in akka.stream.scaladsl") log​(java.lang.String name,
		            scala.Function1<[Out](FlowOps.html "type parameter in FlowOps"),​java.lang.Object> extract,
		            [LoggingAdapter](../../event/LoggingAdapter.html "interface in akka.event") log)
		```
		
		Logs elements flowing through the stream as well as completion and erroring.
		 
		 By default element and completion signals are logged on debug level, and errors are logged on Error level.
		 This can be adjusted according to your needs by providing a custom `Attributes.LogLevels` attribute on the given Flow:
		 
		
		
		 Uses implicit `LoggingAdapter` if available, otherwise uses an internally created one,
		 which uses `akka.event.Logging(materializer.system, materializer)` as its source (use this class to configure slf4j loggers).
		 
		
		
		 Adheres to the `ActorAttributes.SupervisionStrategy` attribute.
		 
		
		
		 '''Emits when''' the mapping function returns an element
		 
		
		
		 '''Backpressures when''' downstream backpressures
		 
		
		
		 '''Completes when''' upstream completes
		 
		
		
		 '''Cancels when''' downstream cancels
		- #### log$default$2
		
		
		
		```
		scala.Function1<[Out](FlowOps.html "type parameter in FlowOps"),​java.lang.Object> log$default$2()
		```
		- #### log$default$3
		
		
		
		```
		[LoggingAdapter](../../event/LoggingAdapter.html "interface in akka.event") log$default$3​(java.lang.String name,
		                             scala.Function1<[Out](FlowOps.html "type parameter in FlowOps"),​java.lang.Object> extract)
		```
		- #### logWithMarker
		
		
		
		```
		[FlowOps](FlowOps.html "interface in akka.stream.scaladsl") logWithMarker​(java.lang.String name,
		                      scala.Function1<[Out](FlowOps.html "type parameter in FlowOps"),​[LogMarker](../../event/LogMarker.html "class in akka.event")> marker,
		                      scala.Function1<[Out](FlowOps.html "type parameter in FlowOps"),​java.lang.Object> extract,
		                      [MarkerLoggingAdapter](../../event/MarkerLoggingAdapter.html "class in akka.event") log)
		```
		
		Logs elements flowing through the stream as well as completion and erroring.
		 
		 By default element and completion signals are logged on debug level, and errors are logged on Error level.
		 This can be adjusted according to your needs by providing a custom `Attributes.LogLevels` attribute on the given Flow:
		 
		
		
		 Uses implicit `MarkerLoggingAdapter` if available, otherwise uses an internally created one,
		 which uses `akka.event.Logging.withMarker(materializer.system, materializer)` as its source (use this class to configure slf4j loggers).
		 
		
		
		 Adheres to the `ActorAttributes.SupervisionStrategy` attribute.
		 
		
		
		 '''Emits when''' the mapping function returns an element
		 
		
		
		 '''Backpressures when''' downstream backpressures
		 
		
		
		 '''Completes when''' upstream completes
		 
		
		
		 '''Cancels when''' downstream cancels
		- #### logWithMarker$default$3
		
		
		
		```
		scala.Function1<[Out](FlowOps.html "type parameter in FlowOps"),​java.lang.Object> logWithMarker$default$3()
		```
		- #### logWithMarker$default$4
		
		
		
		```
		[MarkerLoggingAdapter](../../event/MarkerLoggingAdapter.html "class in akka.event") logWithMarker$default$4​(java.lang.String name,
		                                             scala.Function1<[Out](FlowOps.html "type parameter in FlowOps"),​[LogMarker](../../event/LogMarker.html "class in akka.event")> marker,
		                                             scala.Function1<[Out](FlowOps.html "type parameter in FlowOps"),​java.lang.Object> extract)
		```
		- #### map
		
		
		
		```
		<T> [FlowOps](FlowOps.html "interface in akka.stream.scaladsl") map​(scala.Function1<[Out](FlowOps.html "type parameter in FlowOps"),​T> f)
		```
		
		Transform this stream by applying the given function to each of the elements
		 as they pass through this processing step.
		 
		 Adheres to the `ActorAttributes.SupervisionStrategy` attribute.
		 
		
		
		 '''Emits when''' the mapping function returns an element
		 
		
		
		 '''Backpressures when''' downstream backpressures
		 
		
		
		 '''Completes when''' upstream completes
		 
		
		
		 '''Cancels when''' downstream cancels
		- #### mapAsync
		
		
		
		```
		<T> [FlowOps](FlowOps.html "interface in akka.stream.scaladsl") mapAsync​(int parallelism,
		                     scala.Function1<[Out](FlowOps.html "type parameter in FlowOps"),​scala.concurrent.Future<T>> f)
		```
		
		Transform this stream by applying the given function to each of the elements
		 as they pass through this processing step. The function returns a `Future` and the
		 value of that future will be emitted downstream. The number of Futures
		 that shall run in parallel is given as the first argument to mapAsync.
		 These Futures may complete in any order, but the elements that
		 are emitted downstream are in the same order as received from upstream.
		 
		 If the function `f` throws an exception or if the `Future` is completed
		 with failure and the supervision decision is `akka.stream.Supervision.Stop`
		 the stream will be completed with failure.
		 
		
		
		 If the function `f` throws an exception or if the `Future` is completed
		 with failure and the supervision decision is `akka.stream.Supervision.Resume` or
		 `akka.stream.Supervision.Restart` the element is dropped and the stream continues.
		 
		
		
		 If the `Future` is completed with `null`, it is ignored and the next element is processed.
		 
		
		
		 The function `f` is always invoked on the elements in the order they arrive.
		 
		
		
		 Adheres to the `ActorAttributes.SupervisionStrategy` attribute.
		 
		
		
		 '''Emits when''' the Future returned by the provided function finishes for the next element in sequence
		 
		
		
		 '''Backpressures when''' the number of futures reaches the configured parallelism and the downstream
		 backpressures or the first future is not completed
		 
		
		
		 '''Completes when''' upstream completes and all futures have been completed and all elements have been emitted
		 
		
		
		 '''Cancels when''' downstream cancels
		- #### mapAsyncPartitioned
		
		
		
		```
		<T,​P> [FlowOps](FlowOps.html "interface in akka.stream.scaladsl") mapAsyncPartitioned​(int parallelism,
		                                        int perPartition,
		                                        scala.Function1<[Out](FlowOps.html "type parameter in FlowOps"),​P> partitioner,
		                                        scala.Function2<[Out](FlowOps.html "type parameter in FlowOps"),​P,​scala.concurrent.Future<T>> f)
		```
		
		Transform this stream by partitioning elements based on the provided partitioner as they
		 pass through this step and then applying a given `Future`\-returning function to each element
		 and its partition key. The value of the returned future, if successful, will be emitted
		 downstream.
		 
		 The number of Futures running at any given time is bounded by the 'parallelism' and 'perPartition'
		 values. The futures may complete in any order, but the results are emitted in the same order
		 as the corresponding elements were received.
		 
		
		
		 If the functions 'partitioner' or 'f' throw an exception, or the `Future` completes with failure,
		 supervision will be applied to determine a decision. If the decision is `akka.stream.Supervision.Stop`
		 the stream will be stopped with failure; otherwise, the element will be dropped and the stream continues.
		 
		
		
		 The function 'partitioner' is always invoked on the elements in the order they arrive.
		 
		
		
		 The function 'f' is invoked on elements with the same partition key in the order they arrive. The order
		 of invocation of 'f' for elements with different partition keys is undefined and subject to factors
		 including, but not limited to, the distribution of partition keys within the stream.
		 
		
		
		 Adheres to the `ActorAttributes.SupervisionStrategy` attribute.
		 
		
		
		 '''Emits when''' the Future returned by 'f' finishes for the next element in sequence
		 
		
		
		 '''Backpressures when''' the number of elements for which no resulting future has completed reaches the
		 configured parallelism and the downstream backpressures
		 
		
		
		 '''Completes when''' upstream completes and all futures have been completed and all results have been emitted
		 
		
		
		 '''Cancels when''' downstream cancels
		 
		
		
		
		Parameters:
		`parallelism` \- at most this many futures will be incomplete at any time
		`perPartition` \- at most this many futures will be incomplete for a given partition key at any time
		`partitioner` \- function to generate a partition key
		`f` \- function to generate a Future
		- #### mapAsyncUnordered
		
		
		
		```
		<T> [FlowOps](FlowOps.html "interface in akka.stream.scaladsl") mapAsyncUnordered​(int parallelism,
		                              scala.Function1<[Out](FlowOps.html "type parameter in FlowOps"),​scala.concurrent.Future<T>> f)
		```
		
		Transform this stream by applying the given function to each of the elements
		 as they pass through this processing step. The function returns a `Future` and the
		 value of that future will be emitted downstream. The number of Futures
		 that shall run in parallel is given as the first argument to mapAsyncUnordered.
		 Each processed element will be emitted downstream as soon as it is ready, i.e. it is possible
		 that the elements are not emitted downstream in the same order as received from upstream.
		 
		 If the function `f` throws an exception or if the `Future` is completed
		 with failure and the supervision decision is `akka.stream.Supervision.Stop`
		 the stream will be completed with failure.
		 
		
		
		 If the function `f` throws an exception or if the `Future` is completed
		 with failure and the supervision decision is `akka.stream.Supervision.Resume` or
		 `akka.stream.Supervision.Restart` the element is dropped and the stream continues.
		 
		
		
		 If the `Future` is completed with `null`, it is ignored and the next element is processed.
		 
		
		
		 The function `f` is always invoked on the elements in the order they arrive (even though the result of the futures
		 returned by `f` might be emitted in a different order).
		 
		
		
		 Adheres to the `ActorAttributes.SupervisionStrategy` attribute.
		 
		
		
		 '''Emits when''' any of the Futures returned by the provided function complete
		 
		
		
		 '''Backpressures when''' the number of futures reaches the configured parallelism and the downstream backpressures
		 
		
		
		 '''Completes when''' upstream completes and all futures have been completed and all elements have been emitted
		 
		
		
		 '''Cancels when''' downstream cancels
		- #### mapConcat
		
		
		
		```
		<T> [FlowOps](FlowOps.html "interface in akka.stream.scaladsl") mapConcat​(scala.Function1<[Out](FlowOps.html "type parameter in FlowOps"),​scala.collection.IterableOnce<T>> f)
		```
		
		Transform each input element into an `Iterable` of output elements that is
		 then flattened into the output stream.
		 
		 The returned `Iterable` MUST NOT contain `null` values,
		 as they are illegal as stream elements \- according to the Reactive Streams specification.
		 
		
		
		 '''Emits when''' the mapping function returns an element or there are still remaining elements
		 from the previously calculated collection
		 
		
		
		 '''Backpressures when''' downstream backpressures or there are still remaining elements from the
		 previously calculated collection
		 
		
		
		 '''Completes when''' upstream completes and all remaining elements have been emitted
		 
		
		
		 '''Cancels when''' downstream cancels
		- #### mapError
		
		
		
		```
		[FlowOps](FlowOps.html "interface in akka.stream.scaladsl") mapError​(scala.PartialFunction<java.lang.Throwable,​java.lang.Throwable> pf)
		```
		
		While similar to [`<T>recover(scala.PartialFunction<java.lang.Throwable,T>)`](#recover(scala.PartialFunction)) this operator can be used to transform an error signal to a different one \*without\* logging
		 it as an error in the process. So in that sense it is NOT exactly equivalent to `recover(t => throw t2)` since recover
		 would log the `t2` error.
		 
		 Since the underlying failure signal onError arrives out\-of\-band, it might jump over existing elements.
		 This operator can recover the failure signal, but not the skipped elements, which will be dropped.
		 
		
		
		 Similarly to [`<T>recover(scala.PartialFunction<java.lang.Throwable,T>)`](#recover(scala.PartialFunction)) throwing an exception inside `mapError` \_will\_ be logged.
		 
		
		
		 '''Emits when''' element is available from the upstream or upstream is failed and pf returns an element
		 
		
		
		 '''Backpressures when''' downstream backpressures
		 
		
		
		 '''Completes when''' upstream completes or upstream failed with exception pf can handle
		 
		
		
		 '''Cancels when''' downstream cancels
		- #### mapWithResource
		
		
		
		```
		<R,​T> [FlowOps](FlowOps.html "interface in akka.stream.scaladsl") mapWithResource​(scala.Function0<R> create,
		                                    scala.Function2<R,​[Out](FlowOps.html "type parameter in FlowOps"),​T> f,
		                                    scala.Function1<R,​scala.Option<T>> close)
		```
		
		Transform each stream element with the help of a resource.
		 
		 The resource creation function is invoked once when the stream is materialized and the returned resource is passed to
		 the mapping function for mapping the first element. The mapping function returns a mapped element to emit
		 downstream. The returned `T` MUST NOT be `null` as it is illegal as stream element \- according to the Reactive Streams specification.
		 
		
		
		 The `close` function is called only once when the upstream or downstream finishes or fails. You can do some clean\-up here,
		 and if the returned value is not empty, it will be emitted to the downstream if available, otherwise the value will be dropped.
		 
		
		
		 Early completion can be done with combination of the [`takeWhile(scala.Function1<Out,java.lang.Object>)`](#takeWhile(scala.Function1)) operator.
		 
		
		
		 Adheres to the `ActorAttributes.SupervisionStrategy` attribute.
		 
		
		
		 You can configure the default dispatcher for this Source by changing the `akka.stream.materializer.blocking-io-dispatcher` or
		 set it for a given Source by using `ActorAttributes`.
		 
		
		
		 '''Emits when''' the mapping function returns an element and downstream is ready to consume it
		 
		
		
		 '''Backpressures when''' downstream backpressures
		 
		
		
		 '''Completes when''' upstream completes
		 
		
		
		 '''Cancels when''' downstream cancels
		 
		
		
		
		Parameters:
		`create` \- function that creates the resource
		`f` \- function that transforms the upstream element and the resource to output element
		`close` \- function that closes the resource, optionally outputting a last element
		- #### merge
		
		
		
		```
		<U,​M> [FlowOps](FlowOps.html "interface in akka.stream.scaladsl") merge​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<U>,​M> that,
		                          boolean eagerComplete)
		```
		
		Merge the given [`Source`](Source.html "class in akka.stream.scaladsl") to this [`Flow`](Flow.html "class in akka.stream.scaladsl"), taking elements as they arrive from input streams,
		 picking randomly when several elements ready.
		 
		 '''Emits when''' one of the inputs has an element available
		 
		
		
		 '''Backpressures when''' downstream backpressures
		 
		
		
		 '''Completes when''' all upstreams complete (eagerComplete\=false) or one upstream completes (eagerComplete\=true), default value is `false`
		
		
		
		 '''Cancels when''' downstream cancels
		- #### merge$default$2
		
		
		
		```
		<U,​M> boolean merge$default$2()
		```
		- #### mergeAll
		
		
		
		```
		<U> [FlowOps](FlowOps.html "interface in akka.stream.scaladsl") mergeAll​(scala.collection.immutable.Seq<[Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<U>,​?>> those,
		                     boolean eagerComplete)
		```
		
		Merge the given [`Source`](Source.html "class in akka.stream.scaladsl")s to this [`Flow`](Flow.html "class in akka.stream.scaladsl"), taking elements as they arrive from input streams,
		 picking randomly when several elements ready.
		 
		 '''Emits when''' one of the inputs has an element available
		 
		
		
		 '''Backpressures when''' downstream backpressures
		 
		
		
		 '''Completes when''' all upstreams complete (eagerComplete\=false) or one upstream completes (eagerComplete\=true), default value is `false`
		
		
		
		 '''Cancels when''' downstream cancels
		- #### mergeGraph
		
		
		
		```
		<U,​M> [Graph](../Graph.html "interface in akka.stream")<[FlowShape](../FlowShape.html "class in akka.stream")<[Out](FlowOps.html "type parameter in FlowOps"),​U>,​M> mergeGraph​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<U>,​M> that,
		                                                             boolean eagerComplete)
		```
		- #### mergeLatest
		
		
		
		```
		<U,​M> [FlowOps](FlowOps.html "interface in akka.stream.scaladsl") mergeLatest​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<U>,​M> that,
		                                boolean eagerComplete)
		```
		
		MergeLatest joins elements from N input streams into stream of lists of size N.
		 i\-th element in list is the latest emitted element from i\-th input stream.
		 MergeLatest emits list for each element emitted from some input stream,
		 but only after each input stream emitted at least one element.
		 
		 '''Emits when''' an element is available from some input and each input emits at least one element from stream start
		 
		
		
		 '''Completes when''' all upstreams complete (eagerClose\=false) or one upstream completes (eagerClose\=true)
		- #### mergeLatest$default$2
		
		
		
		```
		<U,​M> boolean mergeLatest$default$2()
		```
		- #### mergeLatestGraph
		
		
		
		```
		<U,​M> [Graph](../Graph.html "interface in akka.stream")<[FlowShape](../FlowShape.html "class in akka.stream")<[Out](FlowOps.html "type parameter in FlowOps"),​scala.collection.immutable.Seq<U>>,​M> mergeLatestGraph​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<U>,​M> that,
		                                                                                                   boolean eagerComplete)
		```
		- #### mergePreferred
		
		
		
		```
		<U,​M> [FlowOps](FlowOps.html "interface in akka.stream.scaladsl") mergePreferred​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<U>,​M> that,
		                                   boolean preferred,
		                                   boolean eagerComplete)
		```
		
		Merge two sources. Prefer one source if both sources have elements ready.
		 
		 '''emits''' when one of the inputs has an element available. If multiple have elements available, prefer the 'right' one when 'preferred' is 'true', or the 'left' one when 'preferred' is 'false'.
		 
		
		
		 '''backpressures''' when downstream backpressures
		 
		
		
		 '''completes''' when all upstreams complete (This behavior is changeable to completing when any upstream completes by setting `eagerComplete=true`.)
		- #### mergePreferred$default$3
		
		
		
		```
		<U,​M> boolean mergePreferred$default$3()
		```
		- #### mergePreferredGraph
		
		
		
		```
		<U,​M> [Graph](../Graph.html "interface in akka.stream")<[FlowShape](../FlowShape.html "class in akka.stream")<[Out](FlowOps.html "type parameter in FlowOps"),​U>,​M> mergePreferredGraph​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<U>,​M> that,
		                                                                      boolean preferred,
		                                                                      boolean eagerComplete)
		```
		- #### mergePrioritized
		
		
		
		```
		<U,​M> [FlowOps](FlowOps.html "interface in akka.stream.scaladsl") mergePrioritized​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<U>,​M> that,
		                                     int leftPriority,
		                                     int rightPriority,
		                                     boolean eagerComplete)
		```
		
		Merge two sources. Prefer the sources depending on the 'priority' parameters.
		 
		 '''emits''' when one of the inputs has an element available, preferring inputs based on the 'priority' parameters if both have elements available
		 
		
		
		 '''backpressures''' when downstream backpressures
		 
		
		
		 '''completes''' when both upstreams complete (This behavior is changeable to completing when any upstream completes by setting `eagerComplete=true`.)
		- #### mergePrioritized$default$4
		
		
		
		```
		<U,​M> boolean mergePrioritized$default$4()
		```
		- #### mergePrioritizedGraph
		
		
		
		```
		<U,​M> [Graph](../Graph.html "interface in akka.stream")<[FlowShape](../FlowShape.html "class in akka.stream")<[Out](FlowOps.html "type parameter in FlowOps"),​U>,​M> mergePrioritizedGraph​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<U>,​M> that,
		                                                                        int leftPriority,
		                                                                        int rightPriority,
		                                                                        boolean eagerComplete)
		```
		- #### mergeSorted
		
		
		
		```
		<U,​M> [FlowOps](FlowOps.html "interface in akka.stream.scaladsl") mergeSorted​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<U>,​M> that,
		                                scala.math.Ordering<U> ord)
		```
		
		Merge the given [`Source`](Source.html "class in akka.stream.scaladsl") to this [`Flow`](Flow.html "class in akka.stream.scaladsl"), taking elements as they arrive from input streams,
		 picking always the smallest of the available elements (waiting for one element from each side
		 to be available). This means that possible contiguity of the input streams is not exploited to avoid
		 waiting for elements, this merge will block when one of the inputs does not have more elements (and
		 does not complete).
		 
		 '''Emits when''' all of the inputs have an element available
		 
		
		
		 '''Backpressures when''' downstream backpressures
		 
		
		
		 '''Completes when''' all upstreams complete
		 
		
		
		 '''Cancels when''' downstream cancels
		- #### mergeSortedGraph
		
		
		
		```
		<U,​M> [Graph](../Graph.html "interface in akka.stream")<[FlowShape](../FlowShape.html "class in akka.stream")<[Out](FlowOps.html "type parameter in FlowOps"),​U>,​M> mergeSortedGraph​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<U>,​M> that,
		                                                                   scala.math.Ordering<U> ord)
		```
		- #### named
		
		
		
		```
		[FlowOps](FlowOps.html "interface in akka.stream.scaladsl") named​(java.lang.String name)
		```
		- #### onErrorComplete
		
		
		
		```
		<T extends java.lang.Throwable> [FlowOps](FlowOps.html "interface in akka.stream.scaladsl") onErrorComplete​(scala.reflect.ClassTag<T> tag)
		```
		
		onErrorComplete allows to complete the stream when an upstream error occurs.
		 
		 Since the underlying failure signal onError arrives out\-of\-band, it might jump over existing elements.
		 This operator can recover the failure signal, but not the skipped elements, which will be dropped.
		 
		
		
		 '''Emits when''' element is available from the upstream
		 
		
		
		 '''Backpressures when''' downstream backpressures
		 
		
		
		 '''Completes when''' upstream completes or failed with exception is an instance of the provided type
		 
		
		
		 '''Cancels when''' downstream cancels
		- #### onErrorComplete
		
		
		
		```
		[FlowOps](FlowOps.html "interface in akka.stream.scaladsl") onErrorComplete​(scala.PartialFunction<java.lang.Throwable,​java.lang.Object> pf)
		```
		
		onErrorComplete allows to complete the stream when an upstream error occurs.
		 
		 Since the underlying failure signal onError arrives out\-of\-band, it might jump over existing elements.
		 This operator can recover the failure signal, but not the skipped elements, which will be dropped.
		 
		
		
		 '''Emits when''' element is available from the upstream
		 
		
		
		 '''Backpressures when''' downstream backpressures
		 
		
		
		 '''Completes when''' upstream completes or failed with exception pf can handle
		 
		
		
		 '''Cancels when''' downstream cancels
		- #### orElse
		
		
		
		```
		<U,​Mat2> [FlowOps](FlowOps.html "interface in akka.stream.scaladsl") orElse​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<U>,​Mat2> secondary)
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
		- #### orElseGraph
		
		
		
		```
		<U,​Mat2> [Graph](../Graph.html "interface in akka.stream")<[FlowShape](../FlowShape.html "class in akka.stream")<[Out](FlowOps.html "type parameter in FlowOps"),​U>,​Mat2> orElseGraph​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<U>,​Mat2> secondary)
		```
		- #### prefixAndTail
		
		
		
		```
		<U> [FlowOps](FlowOps.html "interface in akka.stream.scaladsl") prefixAndTail​(int n)
		```
		
		Takes up to `n` elements from the stream (less than `n` only if the upstream completes before emitting `n` elements)
		 and returns a pair containing a strict sequence of the taken element
		 and a stream representing the remaining elements. If ''n'' is zero or negative, then this will return a pair
		 of an empty collection and a stream containing the whole upstream unchanged.
		 
		 In case of an upstream error, depending on the current state
		 \- the master stream signals the error if less than `n` elements has been seen, and therefore the substream
		 has not yet been emitted
		 \- the tail substream signals the error after the prefix and tail has been emitted by the main stream
		 (at that point the main stream has already completed)
		 
		
		
		 '''Emits when''' the configured number of prefix elements are available. Emits this prefix, and the rest
		 as a substream
		 
		
		
		 '''Backpressures when''' downstream backpressures or substream backpressures
		 
		
		
		 '''Completes when''' prefix elements have been consumed and substream has been consumed
		 
		
		
		 '''Cancels when''' downstream cancels or substream cancels
		- #### prepend
		
		
		
		```
		<U,​Mat2> [FlowOps](FlowOps.html "interface in akka.stream.scaladsl") prepend​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<U>,​Mat2> that)
		```
		
		Prepend the given [`Source`](Source.html "class in akka.stream.scaladsl") to this [`Flow`](Flow.html "class in akka.stream.scaladsl"), meaning that before elements
		 are generated from this Flow, the Source's elements will be produced until it
		 is exhausted, at which point Flow elements will start being produced.
		 
		 Note that the [`Source`](Source.html "class in akka.stream.scaladsl") is materialized together with this Flow and is "detached" meaning
		 in effect behave as a one element buffer in front of both the sources, that eagerly demands an element on start
		 (so it can not be combined with `Source.lazy` to defer materialization of `that`).
		 
		
		
		 This flow will then be kept from producing elements by asserting back\-pressure until its time comes.
		 
		
		
		 When needing a prepend operator that is not detached use [`prependLazy(akka.stream.Graph<akka.stream.SourceShape<U>, Mat2>)`](#prependLazy(akka.stream.Graph))
		
		
		
		 '''Emits when''' element is available from the given [`Source`](Source.html "class in akka.stream.scaladsl") or from current stream when the [`Source`](Source.html "class in akka.stream.scaladsl") is completed
		 
		
		
		 '''Backpressures when''' downstream backpressures
		 
		
		
		 '''Completes when''' this [`Flow`](Flow.html "class in akka.stream.scaladsl") completes
		 
		
		
		 '''Cancels when''' downstream cancels
		- #### prependGraph
		
		
		
		```
		<U,​Mat2> [Graph](../Graph.html "interface in akka.stream")<[FlowShape](../FlowShape.html "class in akka.stream")<[Out](FlowOps.html "type parameter in FlowOps"),​U>,​Mat2> prependGraph​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<U>,​Mat2> that,
		                                                                     boolean detached)
		```
		- #### prependLazy
		
		
		
		```
		<U,​Mat2> [FlowOps](FlowOps.html "interface in akka.stream.scaladsl") prependLazy​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<U>,​Mat2> that)
		```
		
		Prepend the given [`Source`](Source.html "class in akka.stream.scaladsl") to this [`Flow`](Flow.html "class in akka.stream.scaladsl"), meaning that before elements
		 are generated from this Flow, the Source's elements will be produced until it
		 is exhausted, at which point Flow elements will start being produced.
		 
		 Note that the [`Source`](Source.html "class in akka.stream.scaladsl") is materialized together with this Flow and will then be kept from producing elements
		 by asserting back\-pressure until its time comes.
		 
		
		
		 When needing a prepend operator that is also detached use [`prepend(akka.stream.Graph<akka.stream.SourceShape<U>, Mat2>)`](#prepend(akka.stream.Graph))
		
		
		
		 If the given [`Source`](Source.html "class in akka.stream.scaladsl") gets upstream error \- no elements from this [`Flow`](Flow.html "class in akka.stream.scaladsl") will be pulled.
		 
		
		
		 '''Emits when''' element is available from the given [`Source`](Source.html "class in akka.stream.scaladsl") or from current stream when the [`Source`](Source.html "class in akka.stream.scaladsl") is completed
		 
		
		
		 '''Backpressures when''' downstream backpressures
		 
		
		
		 '''Completes when''' this [`Flow`](Flow.html "class in akka.stream.scaladsl") completes
		 
		
		
		 '''Cancels when''' downstream cancels
		- #### recover
		
		
		
		```
		<T> [FlowOps](FlowOps.html "interface in akka.stream.scaladsl") recover​(scala.PartialFunction<java.lang.Throwable,​T> pf)
		```
		
		Recover allows to send last element on failure and gracefully complete the stream
		 Since the underlying failure signal onError arrives out\-of\-band, it might jump over existing elements.
		 This operator can recover the failure signal, but not the skipped elements, which will be dropped.
		 
		 Throwing an exception inside `recover` \_will\_ be logged on ERROR level automatically.
		 
		
		
		 '''Emits when''' element is available from the upstream or upstream is failed and pf returns an element
		 
		
		
		 '''Backpressures when''' downstream backpressures
		 
		
		
		 '''Completes when''' upstream completes or upstream failed with exception pf can handle
		 
		
		
		 '''Cancels when''' downstream cancels
		- #### recoverWith
		
		
		
		```
		<T> [FlowOps](FlowOps.html "interface in akka.stream.scaladsl") recoverWith​(scala.PartialFunction<java.lang.Throwable,​[Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<T>,​[NotUsed](../../NotUsed.html "class in akka")>> pf)
		```
		
		RecoverWith allows to switch to alternative Source on flow failure. It will stay in effect after
		 a failure has been recovered so that each time there is a failure it is fed into the `pf` and a new
		 Source may be materialized.
		 
		 Since the underlying failure signal onError arrives out\-of\-band, it might jump over existing elements.
		 This operator can recover the failure signal, but not the skipped elements, which will be dropped.
		 
		
		
		 Throwing an exception inside `recoverWith` \_will\_ be logged on ERROR level automatically.
		 
		
		
		 '''Emits when''' element is available from the upstream or upstream is failed and element is available
		 from alternative Source
		 
		
		
		 '''Backpressures when''' downstream backpressures
		 
		
		
		 '''Completes when''' upstream completes or upstream failed with exception pf can handle
		 
		
		
		 '''Cancels when''' downstream cancels
		- #### recoverWithRetries
		
		
		
		```
		<T> [FlowOps](FlowOps.html "interface in akka.stream.scaladsl") recoverWithRetries​(int attempts,
		                               scala.PartialFunction<java.lang.Throwable,​[Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<T>,​[NotUsed](../../NotUsed.html "class in akka")>> pf)
		```
		
		RecoverWithRetries allows to switch to alternative Source on flow failure. It will stay in effect after
		 a failure has been recovered up to `attempts` number of times so that each time there is a failure
		 it is fed into the `pf` and a new Source may be materialized. Note that if you pass in 0, this won't
		 attempt to recover at all.
		 
		 A negative `attempts` number is interpreted as "infinite", which results in the exact same behavior as `recoverWith`.
		 
		
		
		 Since the underlying failure signal onError arrives out\-of\-band, it might jump over existing elements.
		 This operator can recover the failure signal, but not the skipped elements, which will be dropped.
		 
		
		
		 Throwing an exception inside `recoverWithRetries` \_will\_ be logged on ERROR level automatically.
		 
		
		
		 '''Emits when''' element is available from the upstream or upstream is failed and element is available
		 from alternative Source
		 
		
		
		 '''Backpressures when''' downstream backpressures
		 
		
		
		 '''Completes when''' upstream completes or upstream failed with exception pf can handle
		 
		
		
		 '''Cancels when''' downstream cancels
		 
		
		
		
		Parameters:
		`attempts` \- Maximum number of retries or \-1 to retry indefinitely
		`pf` \- Receives the failure cause and returns the new Source to be materialized if any
		- #### reduce
		
		
		
		```
		<T> [FlowOps](FlowOps.html "interface in akka.stream.scaladsl") reduce​(scala.Function2<T,​T,​T> f)
		```
		
		Similar to `fold` but uses first element as zero element.
		 Applies the given function towards its current and next value,
		 yielding the next current value.
		 
		 If the stream is empty (i.e. completes before signalling any elements),
		 the reduce operator will fail its downstream with a `NoSuchElementException`,
		 which is semantically in\-line with that Scala's standard library collections
		 do in such situations.
		 
		
		
		 Adheres to the `ActorAttributes.SupervisionStrategy` attribute.
		 
		
		
		 '''Emits when''' upstream completes
		 
		
		
		 '''Backpressures when''' downstream backpressures
		 
		
		
		 '''Completes when''' upstream completes
		 
		
		
		 '''Cancels when''' downstream cancels
		 
		
		
		 See also `FlowOps.fold`
		- #### scan
		
		
		
		```
		<T> [FlowOps](FlowOps.html "interface in akka.stream.scaladsl") scan​(T zero,
		                 scala.Function2<T,​[Out](FlowOps.html "type parameter in FlowOps"),​T> f)
		```
		
		Similar to `fold` but is not a terminal operation,
		 emits its current value which starts at `zero` and then
		 applies the current and next value to the given function `f`,
		 emitting the next current value.
		 
		 If the function `f` throws an exception and the supervision decision is
		 `akka.stream.Supervision.Restart` current value starts at `zero` again
		 the stream will continue.
		 
		
		
		 Adheres to the `ActorAttributes.SupervisionStrategy` attribute.
		 
		
		
		 Note that the `zero` value must be immutable.
		 
		
		
		 '''Emits when''' the function scanning the element returns a new element
		 
		
		
		 '''Backpressures when''' downstream backpressures
		 
		
		
		 '''Completes when''' upstream completes
		 
		
		
		 '''Cancels when''' downstream cancels
		 
		
		
		 See also `FlowOps.scanAsync`
		- #### scanAsync
		
		
		
		```
		<T> [FlowOps](FlowOps.html "interface in akka.stream.scaladsl") scanAsync​(T zero,
		                      scala.Function2<T,​[Out](FlowOps.html "type parameter in FlowOps"),​scala.concurrent.Future<T>> f)
		```
		
		Similar to `scan` but with an asynchronous function,
		 emits its current value which starts at `zero` and then
		 applies the current and next value to the given function `f`,
		 emitting a `Future` that resolves to the next current value.
		 
		 If the function `f` throws an exception and the supervision decision is
		 `akka.stream.Supervision.Restart` current value starts at `zero` again
		 the stream will continue.
		 
		
		
		 If the function `f` throws an exception and the supervision decision is
		 `akka.stream.Supervision.Resume` current value starts at the previous
		 current value, or zero when it doesn't have one, and the stream will continue.
		 
		
		
		 Adheres to the `ActorAttributes.SupervisionStrategy` attribute.
		 
		
		
		 Note that the `zero` value must be immutable.
		 
		
		
		 '''Emits when''' the future returned by `f` completes
		 
		
		
		 '''Backpressures when''' downstream backpressures
		 
		
		
		 '''Completes when''' upstream completes and the last future returned by `f` completes
		 
		
		
		 '''Cancels when''' downstream cancels
		 
		
		
		 See also `FlowOps.scan`
		- #### sliding
		
		
		
		```
		[FlowOps](FlowOps.html "interface in akka.stream.scaladsl") sliding​(int n,
		                int step)
		```
		
		Apply a sliding window over the stream and return the windows as groups of elements, with the last group
		 possibly smaller than requested due to end\-of\-stream.
		 
		`n` must be positive, otherwise IllegalArgumentException is thrown.
		 `step` must be positive, otherwise IllegalArgumentException is thrown.
		 
		
		
		 '''Emits when''' enough elements have been collected within the window or upstream completed
		 
		
		
		 '''Backpressures when''' a window has been assembled and downstream backpressures
		 
		
		
		 '''Completes when''' upstream completes
		 
		
		
		 '''Cancels when''' downstream cancels
		- #### sliding$default$2
		
		
		
		```
		int sliding$default$2()
		```
		- #### splitAfter
		
		
		
		```
		[SubFlow](SubFlow.html "interface in akka.stream.scaladsl")<[Out](FlowOps.html "type parameter in FlowOps"),​[Mat](FlowOps.html "type parameter in FlowOps"),​[FlowOps](FlowOps.html "interface in akka.stream.scaladsl"),​java.lang.Object> splitAfter​([SubstreamCancelStrategy](../SubstreamCancelStrategy.html "class in akka.stream") substreamCancelStrategy,
		                                                                       scala.Function1<[Out](FlowOps.html "type parameter in FlowOps"),​java.lang.Object> p)
		```
		
		This operation applies the given predicate to all incoming elements and
		 emits them to a stream of output streams. It \*ends\* the current substream when the
		 predicate is true. This means that for the following series of predicate values,
		 three substreams will be produced with lengths 2, 2, and 3:
		 
		
		
		
		```
		
		 false, true,        // elements go into first substream
		 false, true,        // elements go into second substream
		 false, false, true  // elements go into third substream
		 
		```
		
		
		 The object returned from this method is not a normal [`Source`](Source.html "class in akka.stream.scaladsl") or [`Flow`](Flow.html "class in akka.stream.scaladsl"),
		 it is a [`SubFlow`](SubFlow.html "interface in akka.stream.scaladsl"). This means that after this operator all transformations
		 are applied to all encountered substreams in the same fashion. Substream mode
		 is exited either by closing the substream (i.e. connecting it to a [`Sink`](Sink.html "class in akka.stream.scaladsl"))
		 or by merging the substreams back together; see the `to` and `mergeBack` methods
		 on [`SubFlow`](SubFlow.html "interface in akka.stream.scaladsl") for more information.
		 
		
		
		 It is important to note that the substreams also propagate back\-pressure as
		 any other stream, which means that blocking one substream will block the `splitAfter`
		 operator itself—and thereby all substreams—once all internal or
		 explicit buffers are filled.
		 
		
		
		 If the split predicate `p` throws an exception and the supervision decision
		 is `akka.stream.Supervision.Stop` the stream and substreams will be completed
		 with failure.
		 
		
		
		 If the split predicate `p` throws an exception and the supervision decision
		 is `akka.stream.Supervision.Resume` or `akka.stream.Supervision.Restart`
		 the element is dropped and the stream and substreams continue.
		 
		
		
		 '''Emits when''' an element passes through. When the provided predicate is true it emits the element
		 and opens a new substream for subsequent element
		 
		
		
		 '''Backpressures when''' there is an element pending for the next substream, but the previous
		 is not fully consumed yet, or the substream backpressures
		 
		
		
		 '''Completes when''' upstream completes
		 
		
		
		 '''Cancels when''' downstream cancels and substreams cancel on `SubstreamCancelStrategy.drain`, downstream
		 cancels or any substream cancels on `SubstreamCancelStrategy.propagate`
		
		
		
		 See also `FlowOps.splitWhen`.
		- #### splitAfter
		
		
		
		```
		[SubFlow](SubFlow.html "interface in akka.stream.scaladsl")<[Out](FlowOps.html "type parameter in FlowOps"),​[Mat](FlowOps.html "type parameter in FlowOps"),​[FlowOps](FlowOps.html "interface in akka.stream.scaladsl"),​java.lang.Object> splitAfter​(scala.Function1<[Out](FlowOps.html "type parameter in FlowOps"),​java.lang.Object> p)
		```
		
		This operation applies the given predicate to all incoming elements and
		 emits them to a stream of output streams. It \*ends\* the current substream when the
		 predicate is true.
		 
		
		See Also:
		[`splitAfter(akka.stream.SubstreamCancelStrategy, scala.Function1<Out, java.lang.Object>)`](#splitAfter(akka.stream.SubstreamCancelStrategy,scala.Function1))
		- #### splitWhen
		
		
		
		```
		[SubFlow](SubFlow.html "interface in akka.stream.scaladsl")<[Out](FlowOps.html "type parameter in FlowOps"),​[Mat](FlowOps.html "type parameter in FlowOps"),​[FlowOps](FlowOps.html "interface in akka.stream.scaladsl"),​java.lang.Object> splitWhen​([SubstreamCancelStrategy](../SubstreamCancelStrategy.html "class in akka.stream") substreamCancelStrategy,
		                                                                      scala.Function1<[Out](FlowOps.html "type parameter in FlowOps"),​java.lang.Object> p)
		```
		
		This operation applies the given predicate to all incoming elements and
		 emits them to a stream of output streams, always beginning a new one with
		 the current element if the given predicate returns true for it. This means
		 that for the following series of predicate values, three substreams will
		 be produced with lengths 1, 2, and 3:
		 
		
		
		
		```
		
		 false,             // element goes into first substream
		 true, false,       // elements go into second substream
		 true, false, false // elements go into third substream
		 
		```
		
		
		 In case the \*first\* element of the stream matches the predicate, the first
		 substream emitted by splitWhen will start from that element. For example:
		 
		
		
		
		
		
		```
		
		 true, false, false // first substream starts from the split-by element
		 true, false        // subsequent substreams operate the same way
		 
		```
		
		
		 The object returned from this method is not a normal [`Source`](Source.html "class in akka.stream.scaladsl") or [`Flow`](Flow.html "class in akka.stream.scaladsl"),
		 it is a [`SubFlow`](SubFlow.html "interface in akka.stream.scaladsl"). This means that after this operator all transformations
		 are applied to all encountered substreams in the same fashion. Substream mode
		 is exited either by closing the substream (i.e. connecting it to a [`Sink`](Sink.html "class in akka.stream.scaladsl"))
		 or by merging the substreams back together; see the `to` and `mergeBack` methods
		 on [`SubFlow`](SubFlow.html "interface in akka.stream.scaladsl") for more information.
		 
		
		
		 It is important to note that the substreams also propagate back\-pressure as
		 any other stream, which means that blocking one substream will block the `splitWhen`
		 operator itself—and thereby all substreams—once all internal or
		 explicit buffers are filled.
		 
		
		
		 If the split predicate `p` throws an exception and the supervision decision
		 is `akka.stream.Supervision.Stop` the stream and substreams will be completed
		 with failure.
		 
		
		
		 If the split predicate `p` throws an exception and the supervision decision
		 is `akka.stream.Supervision.Resume` or `akka.stream.Supervision.Restart`
		 the element is dropped and the stream and substreams continue.
		 
		
		
		 '''Emits when''' an element for which the provided predicate is true, opening and emitting
		 a new substream for subsequent element
		 
		
		
		 '''Backpressures when''' there is an element pending for the next substream, but the previous
		 is not fully consumed yet, or the substream backpressures
		 
		
		
		 '''Completes when''' upstream completes
		 
		
		
		 '''Cancels when''' downstream cancels and substreams cancel on `SubstreamCancelStrategy.drain`, downstream
		 cancels or any substream cancels on `SubstreamCancelStrategy.propagate`
		
		
		
		 See also `FlowOps.splitAfter`.
		- #### splitWhen
		
		
		
		```
		[SubFlow](SubFlow.html "interface in akka.stream.scaladsl")<[Out](FlowOps.html "type parameter in FlowOps"),​[Mat](FlowOps.html "type parameter in FlowOps"),​[FlowOps](FlowOps.html "interface in akka.stream.scaladsl"),​java.lang.Object> splitWhen​(scala.Function1<[Out](FlowOps.html "type parameter in FlowOps"),​java.lang.Object> p)
		```
		
		This operation applies the given predicate to all incoming elements and
		 emits them to a stream of output streams, always beginning a new one with
		 the current element if the given predicate returns true for it.
		 
		
		See Also:
		[`splitWhen(akka.stream.SubstreamCancelStrategy, scala.Function1<Out, java.lang.Object>)`](#splitWhen(akka.stream.SubstreamCancelStrategy,scala.Function1))
		- #### statefulMap
		
		
		
		```
		<S,​T> [FlowOps](FlowOps.html "interface in akka.stream.scaladsl") statefulMap​(scala.Function0<S> create,
		                                scala.Function2<S,​[Out](FlowOps.html "type parameter in FlowOps"),​scala.Tuple2<S,​T>> f,
		                                scala.Function1<S,​scala.Option<T>> onComplete)
		```
		
		Transform each stream element with the help of a state.
		 
		 The state creation function is invoked once when the stream is materialized and the returned state is passed to
		 the mapping function for mapping the first element. The mapping function returns a mapped element to emit
		 downstream and a state to pass to the next mapping function. The state can be the same for each mapping return,
		 be a new immutable state but it is also safe to use a mutable state. The returned `T` MUST NOT be `null` as it is
		 illegal as stream element \- according to the Reactive Streams specification. A `null` state is not allowed and will fail the stream.
		 
		
		
		 For stateless variant see `FlowOps.map`.
		 
		
		
		 The `onComplete` function is called only once when the upstream or downstream finished, You can do some clean\-up here,
		 and if the returned value is not empty, it will be emitted to the downstream if available, otherwise the value will be dropped.
		 
		
		
		 Adheres to the `ActorAttributes.SupervisionStrategy` attribute.
		 
		
		
		 '''Emits when''' the mapping function returns an element and downstream is ready to consume it
		 
		
		
		 '''Backpressures when''' downstream backpressures
		 
		
		
		 '''Completes when''' upstream completes
		 
		
		
		 '''Cancels when''' downstream cancels
		 
		
		
		
		Parameters:
		`create` \- a function that creates the initial state
		`f` \- a function that transforms the upstream element and the state into a pair of next state and output element
		`onComplete` \- a function that transforms the ongoing state into an optional output element
		- #### statefulMapConcat
		
		
		
		```
		<T> [FlowOps](FlowOps.html "interface in akka.stream.scaladsl") statefulMapConcat​(scala.Function0<scala.Function1<[Out](FlowOps.html "type parameter in FlowOps"),​scala.collection.IterableOnce<T>>> f)
		```
		
		Transform each input element into an `Iterable` of output elements that is
		 then flattened into the output stream. The transformation is meant to be stateful,
		 which is enabled by creating the transformation function anew for every materialization —
		 the returned function will typically close over mutable objects to store state between
		 invocations. For the stateless variant see `FlowOps.mapConcat`.
		 
		 The returned `Iterable` MUST NOT contain `null` values,
		 as they are illegal as stream elements \- according to the Reactive Streams specification.
		 
		
		
		 Adheres to the `ActorAttributes.SupervisionStrategy` attribute.
		 
		
		
		 '''Emits when''' the mapping function returns an element or there are still remaining elements
		 from the previously calculated collection
		 
		
		
		 '''Backpressures when''' downstream backpressures or there are still remaining elements from the
		 previously calculated collection
		 
		
		
		 '''Completes when''' upstream completes and all remaining elements has been emitted
		 
		
		
		 '''Cancels when''' downstream cancels
		 
		
		
		 See also `FlowOps.mapConcat`
		- #### take
		
		
		
		```
		[FlowOps](FlowOps.html "interface in akka.stream.scaladsl") take​(long n)
		```
		
		Terminate processing (and cancel the upstream publisher) after the given
		 number of elements. Due to input buffering some elements may have been
		 requested from upstream publishers that will then not be processed downstream
		 of this step.
		 
		 The stream will be completed without producing any elements if `n` is zero
		 or negative.
		 
		
		
		 '''Emits when''' the specified number of elements to take has not yet been reached
		 
		
		
		 '''Backpressures when''' downstream backpressures
		 
		
		
		 '''Completes when''' the defined number of elements has been taken or upstream completes
		 
		
		
		 '''Cancels when''' the defined number of elements has been taken or downstream cancels
		 
		
		
		 See also `FlowOps.limit`, `FlowOps.limitWeighted`
		- #### takeWhile
		
		
		
		```
		[FlowOps](FlowOps.html "interface in akka.stream.scaladsl") takeWhile​(scala.Function1<[Out](FlowOps.html "type parameter in FlowOps"),​java.lang.Object> p)
		```
		
		Terminate processing (and cancel the upstream publisher) after predicate
		 returns false for the first time,
		 Due to input buffering some elements may have been requested from upstream publishers
		 that will then not be processed downstream of this step.
		 
		 The stream will be completed without producing any elements if predicate is false for
		 the first stream element.
		 
		
		
		 '''Emits when''' the predicate is true
		 
		
		
		 '''Backpressures when''' downstream backpressures
		 
		
		
		 '''Completes when''' predicate returned false (or 1 after predicate returns false if `inclusive` or upstream completes
		 
		
		
		 '''Cancels when''' predicate returned false or downstream cancels
		 
		
		
		 See also `FlowOps.limit`, `FlowOps.limitWeighted`
		- #### takeWhile
		
		
		
		```
		[FlowOps](FlowOps.html "interface in akka.stream.scaladsl") takeWhile​(scala.Function1<[Out](FlowOps.html "type parameter in FlowOps"),​java.lang.Object> p,
		                  boolean inclusive)
		```
		
		Terminate processing (and cancel the upstream publisher) after predicate
		 returns false for the first time, including the first failed element iff inclusive is true
		 Due to input buffering some elements may have been requested from upstream publishers
		 that will then not be processed downstream of this step.
		 
		 The stream will be completed without producing any elements if predicate is false for
		 the first stream element.
		 
		
		
		 Adheres to the `ActorAttributes.SupervisionStrategy` attribute.
		 
		
		
		 '''Emits when''' the predicate is true
		 
		
		
		 '''Backpressures when''' downstream backpressures
		 
		
		
		 '''Completes when''' predicate returned false (or 1 after predicate returns false if `inclusive` or upstream completes
		 
		
		
		 '''Cancels when''' predicate returned false or downstream cancels
		 
		
		
		 See also `FlowOps.limit`, `FlowOps.limitWeighted`
		- #### takeWithin
		
		
		
		```
		[FlowOps](FlowOps.html "interface in akka.stream.scaladsl") takeWithin​(scala.concurrent.duration.FiniteDuration d)
		```
		
		Terminate processing (and cancel the upstream publisher) after the given
		 duration. Due to input buffering some elements may have been
		 requested from upstream publishers that will then not be processed downstream
		 of this step.
		 
		 Note that this can be combined with [`take(long)`](#take(long)) to limit the number of elements
		 within the duration.
		 
		
		
		 '''Emits when''' an upstream element arrives
		 
		
		
		 '''Backpressures when''' downstream backpressures
		 
		
		
		 '''Completes when''' upstream completes or timer fires
		 
		
		
		 '''Cancels when''' downstream cancels or timer fires
		- #### throttle
		
		
		
		```
		[FlowOps](FlowOps.html "interface in akka.stream.scaladsl") throttle​(int elements,
		                 scala.concurrent.duration.FiniteDuration per)
		```
		
		Sends elements downstream with speed limited to `elements/per`. In other words, this operator sets the maximum rate
		 for emitting messages. This operator works for streams where all elements have the same cost or length.
		 
		 Throttle implements the token bucket model. There is a bucket with a given token capacity (burst size).
		 Tokens drop into the bucket at a given rate and can be kept for later use up to bucket capacity
		 to allow some burstiness. Whenever the stream wants to send an element, it takes as many
		 tokens from the bucket as the element costs. If there isn't any, throttle waits until the
		 bucket accumulates enough tokens. Elements that cost more than the allowed burst will be delayed proportionally
		 to their cost minus available tokens, meeting the target rate. Bucket is full when the stream is first materialized and
		 started.
		 
		
		
		 The burst size is calculated based on the given rate (`cost/per`) as 0\.1 \* rate, for example:
		 \- rate \< 20/second \=\> burst size 1
		 \- rate 20/second \=\> burst size 2
		 \- rate 100/second \=\> burst size 10
		 \- rate 200/second \=\> burst size 20
		 
		
		
		 The throttle `mode` is `akka.stream.ThrottleMode.Shaping`, which pauses before emitting messages to
		 meet the throttle rate.
		 
		
		
		 '''Emits when''' upstream emits an element and configured time per each element elapsed
		 
		
		
		 '''Backpressures when''' downstream backpressures or the incoming rate is higher than the speed limit
		 
		
		
		 '''Completes when''' upstream completes
		 
		
		
		 '''Cancels when''' downstream cancels
		- #### throttle
		
		
		
		```
		[FlowOps](FlowOps.html "interface in akka.stream.scaladsl") throttle​(int elements,
		                 scala.concurrent.duration.FiniteDuration per,
		                 int maximumBurst,
		                 [ThrottleMode](../ThrottleMode.html "class in akka.stream") mode)
		```
		
		Sends elements downstream with speed limited to `elements/per`. In other words, this operator sets the maximum rate
		 for emitting messages. This operator works for streams where all elements have the same cost or length.
		 
		 Throttle implements the token bucket model. There is a bucket with a given token capacity (burst size or maximumBurst).
		 Tokens drop into the bucket at a given rate and can be kept for later use up to bucket capacity
		 to allow some burstiness. Whenever the stream wants to send an element, it takes as many
		 tokens from the bucket as the element costs. If there isn't any, throttle waits until the
		 bucket accumulates enough tokens. Elements that cost more than the allowed burst will be delayed proportionally
		 to their cost minus available tokens, meeting the target rate. Bucket is full when the stream is first materialized and started.
		 
		
		
		 Parameter `mode` manages behavior when upstream is faster than throttle rate:
		 \- `akka.stream.ThrottleMode.Shaping` makes pauses before emitting messages to meet the throttle rate
		 \- `akka.stream.ThrottleMode.Enforcing` fails with exception when upstream is faster than throttle rate. Enforcing
		 cannot emit elements that cost more than the maximumBurst
		 
		
		
		 It is recommended to use non\-zero burst sizes as they improve both performance and throttling precision by allowing
		 the implementation to avoid using the scheduler when input rates fall below the enforced limit and to reduce
		 most of the inaccuracy caused by the scheduler resolution (which is in the range of milliseconds).
		 
		
		
		 WARNING: Be aware that throttle is using scheduler to slow down the stream. This scheduler has minimal time of triggering
		 next push. Consequently it will slow down the stream as it has minimal pause for emitting. This can happen in
		 case burst is 0 and speed is higher than 30 events per second. You need to increase the `maximumBurst` if
		 elements arrive with small interval (30 milliseconds or less). Use the overloaded `throttle` method without
		 `maximumBurst` parameter to automatically calculate the `maximumBurst` based on the given rate (`cost/per`).
		 In other words the throttler always enforces the rate limit when `maximumBurst` parameter is given, but in
		 certain cases (mostly due to limited scheduler resolution) it enforces a tighter bound than what was prescribed.
		 
		
		
		 '''Emits when''' upstream emits an element and configured time per each element elapsed
		 
		
		
		 '''Backpressures when''' downstream backpressures or the incoming rate is higher than the speed limit
		 
		
		
		 '''Completes when''' upstream completes
		 
		
		
		 '''Cancels when''' downstream cancels
		- #### throttle
		
		
		
		```
		[FlowOps](FlowOps.html "interface in akka.stream.scaladsl") throttle​(int cost,
		                 scala.concurrent.duration.FiniteDuration per,
		                 scala.Function1<[Out](FlowOps.html "type parameter in FlowOps"),​java.lang.Object> costCalculation)
		```
		
		Sends elements downstream with speed limited to `cost/per`. Cost is
		 calculating for each element individually by calling `calculateCost` function.
		 This operator works for streams when elements have different cost(length).
		 Streams of `ByteString` for example.
		 
		 Throttle implements the token bucket model. There is a bucket with a given token capacity (burst size).
		 Tokens drop into the bucket at a given rate and can be kept for later use up to bucket capacity
		 to allow some burstiness. Whenever the stream wants to send an element, it takes as many
		 tokens from the bucket as the element costs. If there isn't any, throttle waits until the
		 bucket accumulates enough tokens. Elements that cost more than the allowed burst will be delayed proportionally
		 to their cost minus available tokens, meeting the target rate. Bucket is full when the stream is first materialized and
		 started.
		 
		
		
		 The burst size is calculated based on the given rate (`cost/per`) as 0\.1 \* rate, for example:
		 \- rate \< 20/second \=\> burst size 1
		 \- rate 20/second \=\> burst size 2
		 \- rate 100/second \=\> burst size 10
		 \- rate 200/second \=\> burst size 20
		 
		
		
		 The throttle `mode` is `akka.stream.ThrottleMode.Shaping`, which pauses before emitting messages to
		 meet the throttle rate.
		 
		
		
		 '''Emits when''' upstream emits an element and configured time per each element elapsed
		 
		
		
		 '''Backpressures when''' downstream backpressures or the incoming rate is higher than the speed limit
		 
		
		
		 '''Completes when''' upstream completes
		 
		
		
		 '''Cancels when''' downstream cancels
		- #### throttle
		
		
		
		```
		[FlowOps](FlowOps.html "interface in akka.stream.scaladsl") throttle​(int cost,
		                 scala.concurrent.duration.FiniteDuration per,
		                 int maximumBurst,
		                 scala.Function1<[Out](FlowOps.html "type parameter in FlowOps"),​java.lang.Object> costCalculation,
		                 [ThrottleMode](../ThrottleMode.html "class in akka.stream") mode)
		```
		
		Sends elements downstream with speed limited to `cost/per`. Cost is
		 calculating for each element individually by calling `calculateCost` function.
		 This operator works for streams when elements have different cost(length).
		 Streams of `ByteString` for example.
		 
		 Throttle implements the token bucket model. There is a bucket with a given token capacity (burst size or maximumBurst).
		 Tokens drop into the bucket at a given rate and can be kept for later use up to bucket capacity
		 to allow some burstiness. Whenever the stream wants to send an element, it takes as many
		 tokens from the bucket as the element costs. If there isn't any, throttle waits until the
		 bucket accumulates enough tokens. Elements that cost more than the allowed burst will be delayed proportionally
		 to their cost minus available tokens, meeting the target rate. Bucket is full when the stream is first materialized and started.
		 
		
		
		 Parameter `mode` manages behavior when upstream is faster than throttle rate:
		 \- `akka.stream.ThrottleMode.Shaping` makes pauses before emitting messages to meet the throttle rate
		 \- `akka.stream.ThrottleMode.Enforcing` fails with exception when upstream is faster than throttle rate. Enforcing
		 cannot emit elements that cost more than the maximumBurst
		 
		
		
		 It is recommended to use non\-zero burst sizes as they improve both performance and throttling precision by allowing
		 the implementation to avoid using the scheduler when input rates fall below the enforced limit and to reduce
		 most of the inaccuracy caused by the scheduler resolution (which is in the range of milliseconds).
		 
		
		
		 WARNING: Be aware that throttle is using scheduler to slow down the stream. This scheduler has minimal time of triggering
		 next push. Consequently it will slow down the stream as it has minimal pause for emitting. This can happen in
		 case burst is 0 and speed is higher than 30 events per second. You need to increase the `maximumBurst` if
		 elements arrive with small interval (30 milliseconds or less). Use the overloaded `throttle` method without
		 `maximumBurst` parameter to automatically calculate the `maximumBurst` based on the given rate (`cost/per`).
		 In other words the throttler always enforces the rate limit when `maximumBurst` parameter is given, but in
		 certain cases (mostly due to limited scheduler resolution) it enforces a tighter bound than what was prescribed.
		 
		
		
		 '''Emits when''' upstream emits an element and configured time per each element elapsed
		 
		
		
		 '''Backpressures when''' downstream backpressures or the incoming rate is higher than the speed limit
		 
		
		
		 '''Completes when''' upstream completes
		 
		
		
		 '''Cancels when''' downstream cancels
		- #### throttle
		
		
		
		```
		[FlowOps](FlowOps.html "interface in akka.stream.scaladsl") throttle​([ThrottleControl](ThrottleControl.html "class in akka.stream.scaladsl") control)
		```
		
		The `ThrottleControl` can be updated to change the throttle rate from the outside of the stream
		 and share a total rate limit between several streams.
		 Sends elements downstream with speed limited to `elements/per` as defined in the `ThrottleControl`.
		 In other words, this operator sets the maximum rate for emitting messages. This operator works for streams
		 where all elements have the same cost or length.
		 
		 Throttle implements the token bucket model. There is a bucket with a given token capacity (burst size).
		 Tokens drop into the bucket at a given rate and can be kept for later use up to bucket capacity
		 to allow some burstiness. Whenever the stream wants to send an element, it takes as many
		 tokens from the bucket as the element costs. If there isn't any, throttle waits until the
		 bucket accumulates enough tokens. Elements that cost more than the allowed burst will be delayed proportionally
		 to their cost minus available tokens, meeting the target rate. Bucket is full when the stream is first materialized and
		 started.
		 
		
		
		 The burst size is calculated based on the given rate (`cost/per`) as 0\.1 \* rate, for example:
		 \- rate \< 20/second \=\> burst size 1
		 \- rate 20/second \=\> burst size 2
		 \- rate 100/second \=\> burst size 10
		 \- rate 200/second \=\> burst size 20
		 
		
		
		 The throttle `mode` is `akka.stream.ThrottleMode.Shaping`, which pauses before emitting messages to
		 meet the throttle rate.
		 
		
		
		 '''Emits when''' upstream emits an element and configured time per each element elapsed
		 
		
		
		 '''Backpressures when''' downstream backpressures or the incoming rate is higher than the speed limit
		 
		
		
		 '''Completes when''' upstream completes
		 
		
		
		 '''Cancels when''' downstream cancels
		- #### throttle
		
		
		
		```
		[FlowOps](FlowOps.html "interface in akka.stream.scaladsl") throttle​([ThrottleControl](ThrottleControl.html "class in akka.stream.scaladsl") control,
		                 scala.Function1<[Out](FlowOps.html "type parameter in FlowOps"),​java.lang.Object> costCalculation)
		```
		
		The `ThrottleControl` can be updated to change the throttle rate from the outside of the stream
		 and share a total rate limit between several streams.
		 Sends elements downstream with speed limited to `cost/per` as defined in the `ThrottleControl`. Cost is
		 calculating for each element individually by calling `calculateCost` function.
		 This operator works for streams when elements have different cost(length).
		 Streams of `ByteString` for example.
		 
		 Throttle implements the token bucket model. There is a bucket with a given token capacity (burst size or maximumBurst).
		 Tokens drop into the bucket at a given rate and can be kept for later use up to bucket capacity
		 to allow some burstiness. Whenever the stream wants to send an element, it takes as many
		 tokens from the bucket as the element costs. If there isn't any, throttle waits until the
		 bucket accumulates enough tokens. Elements that cost more than the allowed burst will be delayed proportionally
		 to their cost minus available tokens, meeting the target rate. Bucket is full when the stream is first materialized and started.
		 
		
		
		 Parameter `mode` manages behavior when upstream is faster than throttle rate:
		 \- `akka.stream.ThrottleMode.Shaping` makes pauses before emitting messages to meet the throttle rate
		 \- `akka.stream.ThrottleMode.Enforcing` fails with exception when upstream is faster than throttle rate. Enforcing
		 cannot emit elements that cost more than the maximumBurst
		 
		
		
		 It is recommended to use non\-zero burst sizes as they improve both performance and throttling precision by allowing
		 the implementation to avoid using the scheduler when input rates fall below the enforced limit and to reduce
		 most of the inaccuracy caused by the scheduler resolution (which is in the range of milliseconds).
		 
		
		
		 WARNING: Be aware that throttle is using scheduler to slow down the stream. This scheduler has minimal time of triggering
		 next push. Consequently it will slow down the stream as it has minimal pause for emitting. This can happen in
		 case burst is 0 and speed is higher than 30 events per second. You need to increase the `maximumBurst` if
		 elements arrive with small interval (30 milliseconds or less). Use the overloaded `throttle` method without
		 `maximumBurst` parameter to automatically calculate the `maximumBurst` based on the given rate (`cost/per`).
		 In other words the throttler always enforces the rate limit when `maximumBurst` parameter is given, but in
		 certain cases (mostly due to limited scheduler resolution) it enforces a tighter bound than what was prescribed.
		 
		
		
		 '''Emits when''' upstream emits an element and configured time per each element elapsed
		 
		
		
		 '''Backpressures when''' downstream backpressures or the incoming rate is higher than the speed limit
		 
		
		
		 '''Completes when''' upstream completes
		 
		
		
		 '''Cancels when''' downstream cancels
		- #### to
		
		
		
		```
		<Mat2> java.lang.Object to​([Graph](../Graph.html "interface in akka.stream")<[SinkShape](../SinkShape.html "class in akka.stream")<[Out](FlowOps.html "type parameter in FlowOps")>,​Mat2> sink)
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
		 
		
		
		 See also `FlowOpsMat.toMat` when access to materialized values of the parameter is needed.
		- #### via
		
		
		
		```
		<T,​Mat2> [FlowOps](FlowOps.html "interface in akka.stream.scaladsl") via​([Graph](../Graph.html "interface in akka.stream")<[FlowShape](../FlowShape.html "class in akka.stream")<[Out](FlowOps.html "type parameter in FlowOps"),​T>,​Mat2> flow)
		```
		- #### watch
		
		
		
		```
		[FlowOps](FlowOps.html "interface in akka.stream.scaladsl") watch​([ActorRef](../../actor/ActorRef.html "class in akka.actor") ref)
		```
		
		The operator fails with an [`WatchedActorTerminatedException`](../WatchedActorTerminatedException.html "class in akka.stream") if the target actor is terminated.
		 
		 '''Emits when''' upstream emits
		 
		
		
		 '''Backpressures when''' downstream backpressures
		 
		
		
		 '''Completes when''' upstream completes
		 
		
		
		 '''Fails when''' the watched actor terminates
		 
		
		
		 '''Cancels when''' downstream cancels
		- #### wireTap
		
		
		
		```
		[FlowOps](FlowOps.html "interface in akka.stream.scaladsl") wireTap​(scala.Function1<[Out](FlowOps.html "type parameter in FlowOps"),​scala.runtime.BoxedUnit> f)
		```
		
		This is a simplified version of `wireTap(Sink)` that takes only a simple function.
		 Elements will be passed into this "side channel" function, and any of its results will be ignored.
		 
		 If the wire\-tap operation is slow (it backpressures), elements that would've been sent to it will be dropped instead.
		 It is similar to [`alsoTo(akka.stream.Graph<akka.stream.SinkShape<Out>, ?>)`](#alsoTo(akka.stream.Graph)) which does backpressure instead of dropping elements.
		 
		
		
		 This operation is useful for inspecting the passed through element, usually by means of side\-effecting
		 operations (such as `println`, or emitting metrics), for each element without having to modify it.
		 
		
		
		 For logging signals (elements, completion, error) consider using the [`log(java.lang.String,scala.Function1<Out,java.lang.Object>,akka.event.LoggingAdapter)`](#log(java.lang.String,scala.Function1,akka.event.LoggingAdapter)) operator instead,
		 along with appropriate `ActorAttributes.logLevels`.
		 
		
		
		 '''Emits when''' upstream emits an element; the same element will be passed to the attached function,
		 as well as to the downstream operator
		 
		
		
		 '''Backpressures when''' downstream backpressures
		 
		
		
		 '''Completes when''' upstream completes
		 
		
		
		 '''Cancels when''' downstream cancels
		- #### wireTap
		
		
		
		```
		[FlowOps](FlowOps.html "interface in akka.stream.scaladsl") wireTap​([Graph](../Graph.html "interface in akka.stream")<[SinkShape](../SinkShape.html "class in akka.stream")<[Out](FlowOps.html "type parameter in FlowOps")>,​?> that)
		```
		
		Attaches the given [`Sink`](Sink.html "class in akka.stream.scaladsl") to this [`Flow`](Flow.html "class in akka.stream.scaladsl") as a wire tap, meaning that elements that pass
		 through will also be sent to the wire\-tap Sink, without the latter affecting the mainline flow.
		 If the wire\-tap Sink backpressures, elements that would've been sent to it will be dropped instead.
		 
		 It is similar to [`alsoTo(akka.stream.Graph<akka.stream.SinkShape<Out>, ?>)`](#alsoTo(akka.stream.Graph)) which does backpressure instead of dropping elements.
		 
		
		
		 '''Emits when''' element is available and demand exists from the downstream; the element will
		 also be sent to the wire\-tap Sink if there is demand.
		 
		
		
		 '''Backpressures when''' downstream backpressures
		 
		
		
		 '''Completes when''' upstream completes
		 
		
		
		 '''Cancels when''' downstream cancels
		- #### wireTapGraph
		
		
		
		```
		<M> [Graph](../Graph.html "interface in akka.stream")<[FlowShape](../FlowShape.html "class in akka.stream")<[Out](FlowOps.html "type parameter in FlowOps"),​[Out](FlowOps.html "type parameter in FlowOps")>,​M> wireTapGraph​([Graph](../Graph.html "interface in akka.stream")<[SinkShape](../SinkShape.html "class in akka.stream")<[Out](FlowOps.html "type parameter in FlowOps")>,​M> that)
		```
		- #### withAttributes
		
		
		
		```
		[FlowOps](FlowOps.html "interface in akka.stream.scaladsl") withAttributes​([Attributes](../Attributes.html "class in akka.stream") attr)
		```
		- #### zip
		
		
		
		```
		<U> [FlowOps](FlowOps.html "interface in akka.stream.scaladsl") zip​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<U>,​?> that)
		```
		
		Combine the elements of current flow and the given [`Source`](Source.html "class in akka.stream.scaladsl") into a stream of tuples.
		 
		 '''Emits when''' all of the inputs have an element available
		 
		
		
		 '''Backpressures when''' downstream backpressures
		 
		
		
		 '''Completes when''' any upstream completes
		 
		
		
		 '''Cancels when''' downstream cancels
		- #### zipAll
		
		
		
		```
		<U,​A> [FlowOps](FlowOps.html "interface in akka.stream.scaladsl") zipAll​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<U>,​?> that,
		                           A thisElem,
		                           U thatElem)
		```
		
		Combine the elements of current flow and the given [`Source`](Source.html "class in akka.stream.scaladsl") into a stream of tuples.
		 
		 '''Emits when''' at first emits when both inputs emit, and then as long as any input emits (coupled to the default value of the completed input).
		 
		
		
		 '''Backpressures when''' downstream backpressures
		 
		
		
		 '''Completes when''' all upstream completes
		 
		
		
		 '''Cancels when''' downstream cancels
		- #### zipAllFlow
		
		
		
		```
		<U,​A,​Mat2> [Flow](Flow.html "class in akka.stream.scaladsl")<[Out](FlowOps.html "type parameter in FlowOps"),​scala.Tuple2<A,​U>,​Mat2> zipAllFlow​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<U>,​Mat2> that,
		                                                                                     A thisElem,
		                                                                                     U thatElem)
		```
		- #### zipGraph
		
		
		
		```
		<U,​M> [Graph](../Graph.html "interface in akka.stream")<[FlowShape](../FlowShape.html "class in akka.stream")<[Out](FlowOps.html "type parameter in FlowOps"),​scala.Tuple2<[Out](FlowOps.html "type parameter in FlowOps"),​U>>,​M> zipGraph​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<U>,​M> that)
		```
		- #### zipLatest
		
		
		
		```
		<U> [FlowOps](FlowOps.html "interface in akka.stream.scaladsl") zipLatest​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<U>,​?> that)
		```
		
		Combine the elements of 2 streams into a stream of tuples, picking always the latest element of each.
		 
		 A `ZipLatest` has a `left` and a `right` input port and one `out` port.
		 
		
		
		 No element is emitted until at least one element from each Source becomes available.
		 
		
		
		 '''Emits when''' all of the inputs have at least an element available, and then each time an element becomes
		 available on either of the inputs
		 
		
		
		 '''Backpressures when''' downstream backpressures
		 
		
		
		 '''Completes when''' any upstream completes
		 
		
		
		 '''Cancels when''' downstream cancels
		- #### zipLatestGraph
		
		
		
		```
		<U,​M> [Graph](../Graph.html "interface in akka.stream")<[FlowShape](../FlowShape.html "class in akka.stream")<[Out](FlowOps.html "type parameter in FlowOps"),​scala.Tuple2<[Out](FlowOps.html "type parameter in FlowOps"),​U>>,​M> zipLatestGraph​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<U>,​M> that)
		```
		- #### zipLatestWith
		
		
		
		```
		<Out2,​Out3> [FlowOps](FlowOps.html "interface in akka.stream.scaladsl") zipLatestWith​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<Out2>,​?> that,
		                                        scala.Function2<[Out](FlowOps.html "type parameter in FlowOps"),​Out2,​Out3> combine)
		```
		
		Combine the elements of multiple streams into a stream of combined elements using a combiner function,
		 picking always the latest of the elements of each source.
		 
		 No element is emitted until at least one element from each Source becomes available. Whenever a new
		 element appears, the zipping function is invoked with a tuple containing the new element
		 and the other last seen elements.
		 
		
		
		 '''Emits when''' all of the inputs have at least an element available, and then each time an element becomes
		 available on either of the inputs
		 
		
		
		 '''Backpressures when''' downstream backpressures
		 
		
		
		 '''Completes when''' any of the upstreams completes
		 
		
		
		 '''Cancels when''' downstream cancels
		- #### zipLatestWith
		
		
		
		```
		<Out2,​Out3> [FlowOps](FlowOps.html "interface in akka.stream.scaladsl") zipLatestWith​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<Out2>,​?> that,
		                                        boolean eagerComplete,
		                                        scala.Function2<[Out](FlowOps.html "type parameter in FlowOps"),​Out2,​Out3> combine)
		```
		
		Combine the elements of multiple streams into a stream of combined elements using a combiner function,
		 picking always the latest of the elements of each source.
		 
		 No element is emitted until at least one element from each Source becomes available. Whenever a new
		 element appears, the zipping function is invoked with a tuple containing the new element
		 and the other last seen elements.
		 
		
		
		 '''Emits when''' all of the inputs have at least an element available, and then each time an element becomes
		 available on either of the inputs
		 
		
		
		 '''Backpressures when''' downstream backpressures
		 
		
		
		 '''Completes when''' any upstream completes if `eagerComplete` is enabled or wait for all upstreams to complete
		 
		
		
		 '''Cancels when''' downstream cancels
		- #### zipLatestWithGraph
		
		
		
		```
		<Out2,​Out3,​M> [Graph](../Graph.html "interface in akka.stream")<[FlowShape](../FlowShape.html "class in akka.stream")<[Out](FlowOps.html "type parameter in FlowOps"),​Out3>,​M> zipLatestWithGraph​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<Out2>,​M> that,
		                                                                                      scala.Function2<[Out](FlowOps.html "type parameter in FlowOps"),​Out2,​Out3> combine)
		```
		- #### zipLatestWithGraph
		
		
		
		```
		<Out2,​Out3,​M> [Graph](../Graph.html "interface in akka.stream")<[FlowShape](../FlowShape.html "class in akka.stream")<[Out](FlowOps.html "type parameter in FlowOps"),​Out3>,​M> zipLatestWithGraph​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<Out2>,​M> that,
		                                                                                      boolean eagerComplete,
		                                                                                      scala.Function2<[Out](FlowOps.html "type parameter in FlowOps"),​Out2,​Out3> combine)
		```
		- #### zipWith
		
		
		
		```
		<Out2,​Out3> [FlowOps](FlowOps.html "interface in akka.stream.scaladsl") zipWith​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<Out2>,​?> that,
		                                  scala.Function2<[Out](FlowOps.html "type parameter in FlowOps"),​Out2,​Out3> combine)
		```
		
		Put together the elements of current flow and the given [`Source`](Source.html "class in akka.stream.scaladsl")
		 into a stream of combined elements using a combiner function.
		 
		 '''Emits when''' all of the inputs have an element available
		 
		
		
		 '''Backpressures when''' downstream backpressures
		 
		
		
		 '''Completes when''' any upstream completes
		 
		
		
		 '''Cancels when''' downstream cancels
		- #### zipWithGraph
		
		
		
		```
		<Out2,​Out3,​M> [Graph](../Graph.html "interface in akka.stream")<[FlowShape](../FlowShape.html "class in akka.stream")<[Out](FlowOps.html "type parameter in FlowOps"),​Out3>,​M> zipWithGraph​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<Out2>,​M> that,
		                                                                                scala.Function2<[Out](FlowOps.html "type parameter in FlowOps"),​Out2,​Out3> combine)
		```
		- #### zipWithIndex
		
		
		
		```
		[FlowOps](FlowOps.html "interface in akka.stream.scaladsl") zipWithIndex()
		```
		
		Combine the elements of current flow into a stream of tuples consisting
		 of all elements paired with their index. Indices start at 0\.
		 
		 '''Emits when''' upstream emits an element and is paired with their index
		 
		
		
		 '''Backpressures when''' downstream backpressures
		 
		
		
		 '''Completes when''' upstream completes
		 
		
		
		 '''Cancels when''' downstream cancels

## Code Examples

### Example 1: ask

```text
flow.ask[ExpectedReply](ref)
```

### Example 2: ask

```text
flow.ask[ExpectedReply](parallelism = 4)(ref)
```

### Example 3: interleave

```text
Source(List(1, 2, 3)).interleave(List(4, 5, 6, 7), 2) // 1, 2, 4, 5, 3, 6, 7
```

### Example 4: intersperse

```text
val nums = Source(List(1,2,3)).map(_.toString)
 nums.intersperse(",")            //   1 , 2 , 3
 nums.intersperse("[", ",", "]")  // [ 1 , 2 , 3 ]
```

### Example 5: intersperse

```text
Source.single(">> ") ++ Source(List("1", "2", "3")).intersperse(",")
 Source(List("1", "2", "3")).intersperse(",") ++ Source.single("END")
```

### Example 6: intersperse

```text
val nums = Source(List(1,2,3)).map(_.toString)
 nums.intersperse(",")            //   1 , 2 , 3
 nums.intersperse("[", ",", "]")  // [ 1 , 2 , 3 ]
```

### Example 7: splitAfter

```text
false, true,        // elements go into first substream
 false, true,        // elements go into second substream
 false, false, true  // elements go into third substream
```

### Example 8: splitWhen

```text
false,             // element goes into first substream
 true, false,       // elements go into second substream
 true, false, false // elements go into third substream
```

### Example 9: splitWhen

```text
true, false, false // first substream starts from the split-by element
 true, false        // subsequent substreams operate the same way
```

### Example 10: to

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

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/NotUsed.html
- https://doc.akka.io/japi/akka/current/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka/current/akka/event/LogMarker.html
- https://doc.akka.io/japi/akka/current/akka/event/LoggingAdapter.html
- https://doc.akka.io/japi/akka/current/akka/event/MarkerLoggingAdapter.html
- https://doc.akka.io/japi/akka/current/akka/pattern/AskTimeoutException.html
- https://doc.akka.io/japi/akka/current/akka/stream/Attributes.NestedMaterializationCancellationPolicy.html
- https://doc.akka.io/japi/akka/current/akka/stream/Attributes.html
- https://doc.akka.io/japi/akka/current/akka/stream/BackpressureTimeoutException.html
- https://doc.akka.io/japi/akka/current/akka/stream/CompletionTimeoutException.html
- https://doc.akka.io/japi/akka/current/akka/stream/DelayOverflowStrategy.html
- https://doc.akka.io/japi/akka/current/akka/stream/FlowShape.html
- https://doc.akka.io/japi/akka/current/akka/stream/Graph.html
- https://doc.akka.io/japi/akka/current/akka/stream/InitialTimeoutException.html
- https://doc.akka.io/japi/akka/current/akka/stream/OverflowStrategy.html
- https://doc.akka.io/japi/akka/current/akka/stream/SinkShape.html
- https://doc.akka.io/japi/akka/current/akka/stream/SourceShape.html
- https://doc.akka.io/japi/akka/current/akka/stream/StreamIdleTimeoutException.html
- https://doc.akka.io/japi/akka/current/akka/stream/SubstreamCancelStrategy.html
- https://doc.akka.io/japi/akka/current/akka/stream/ThrottleMode.html
- https://doc.akka.io/japi/akka/current/akka/stream/WatchedActorTerminatedException.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/DelayStrategy.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/Flow.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/FlowOps.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/FlowOpsMat.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/Sink.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/Source.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/SubFlow.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/ThrottleControl.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/util/Timeout.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/FlowOps.html](https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/FlowOps.html)*