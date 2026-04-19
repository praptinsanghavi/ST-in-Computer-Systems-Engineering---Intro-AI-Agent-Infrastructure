---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:35:14Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/SubFlow.html
title: SubFlow
---

# SubFlow

## Content

Package [akka.stream.javadsl](package-summary.html)
## Class SubFlow\<In,​Out,​Mat\>

- java.lang.Object
- - akka.stream.javadsl.SubFlow\<In,​Out,​Mat\>

- ---

```
public final class SubFlow<In,​Out,​Mat>
extends java.lang.Object
```

A \&ldquo;stream of streams\&rdquo; sub\-flow of data elements, e.g. produced by `groupBy`.
 SubFlows cannot contribute to the super\-flow\&rsquo;s materialized value since they
 are materialized later, during the runtime of the flow graph processing.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[SubFlow](#%3Cinit%3E(akka.stream.scaladsl.SubFlow))​([SubFlow](../scaladsl/SubFlow.html "interface in akka.stream.scaladsl")<[Out](SubFlow.html "type parameter in SubFlow"),​[Mat](SubFlow.html "type parameter in SubFlow"),​[Flow](../scaladsl/Flow.html "class in akka.stream.scaladsl")<[In](SubFlow.html "type parameter in SubFlow"),​java.lang.Object,​[Mat](SubFlow.html "type parameter in SubFlow")>,​[Sink](../scaladsl/Sink.html "class in akka.stream.scaladsl")<[In](SubFlow.html "type parameter in SubFlow"),​[Mat](SubFlow.html "type parameter in SubFlow")>> delegate)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​[Out](SubFlow.html "type parameter in SubFlow"),​[Mat](SubFlow.html "type parameter in SubFlow")>` | `[addAttributes](#addAttributes(akka.stream.Attributes))​([Attributes](../Attributes.html "class in akka.stream") attr)` | Add the given attributes to this Source. |
	| `<Agg,​Emit>[SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​Emit,​[Mat](SubFlow.html "type parameter in SubFlow")>` | `[aggregateWithBoundary](#aggregateWithBoundary(java.util.function.Supplier,akka.japi.function.Function2,akka.japi.function.Function,akka.japi.Pair))​(java.util.function.Supplier<Agg> allocate,  [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<Agg,​[Out](SubFlow.html "type parameter in SubFlow"),​[Pair](../../japi/Pair.html "class in akka.japi")<Agg,​java.lang.Object>> aggregate,  [Function](../../japi/function/Function.html "interface in akka.japi.function")<Agg,​Emit> harvest,  [Pair](../../japi/Pair.html "class in akka.japi")<java.util.function.Predicate<Agg>,​java.time.Duration> emitOnTimer)` | Aggregate input elements into an arbitrary data structure that can be completed and emitted downstream  when custom condition is met which can be triggered by aggregate or timer. |
	| `[SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​[Out](SubFlow.html "type parameter in SubFlow"),​[Mat](SubFlow.html "type parameter in SubFlow")>` | `[alsoTo](#alsoTo(akka.stream.Graph))​([Graph](../Graph.html "interface in akka.stream")<[SinkShape](../SinkShape.html "class in akka.stream")<[Out](SubFlow.html "type parameter in SubFlow")>,​?> that)` | Attaches the given [`Sink`](Sink.html "class in akka.stream.javadsl") to this [`Flow`](Flow.html "class in akka.stream.javadsl"), meaning that elements that passes  through will also be sent to the [`Sink`](Sink.html "class in akka.stream.javadsl"). |
	| `[SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​[Out](SubFlow.html "type parameter in SubFlow"),​[Mat](SubFlow.html "type parameter in SubFlow")>` | `[alsoToAll](#alsoToAll(akka.stream.Graph...))​([Graph](../Graph.html "interface in akka.stream")<[SinkShape](../SinkShape.html "class in akka.stream")<[Out](SubFlow.html "type parameter in SubFlow")>,​?>... those)` | Attaches the given [`Sink`](Sink.html "class in akka.stream.javadsl")s to this [`Flow`](Flow.html "class in akka.stream.javadsl"), meaning that elements that passes  through will also be sent to all those [`Sink`](Sink.html "class in akka.stream.javadsl")s. |
	| `[SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​[Out](SubFlow.html "type parameter in SubFlow"),​[Mat](SubFlow.html "type parameter in SubFlow")>` | `[alsoToAll](#alsoToAll(scala.collection.immutable.Seq))​(scala.collection.immutable.Seq<[Graph](../Graph.html "interface in akka.stream")<[SinkShape](../SinkShape.html "class in akka.stream")<[Out](SubFlow.html "type parameter in SubFlow")>,​?>> those)` | Attaches the given [`Sink`](Sink.html "class in akka.stream.javadsl")s to this [`Flow`](Flow.html "class in akka.stream.javadsl"), meaning that elements that passes  through will also be sent to all those [`Sink`](Sink.html "class in akka.stream.javadsl")s. |
	| `[SubFlow](../scaladsl/SubFlow.html "interface in akka.stream.scaladsl")<[Out](SubFlow.html "type parameter in SubFlow"),​[Mat](SubFlow.html "type parameter in SubFlow"),​[Flow](../scaladsl/Flow.html "class in akka.stream.scaladsl")<[In](SubFlow.html "type parameter in SubFlow"),​java.lang.Object,​[Mat](SubFlow.html "type parameter in SubFlow")>,​[Sink](../scaladsl/Sink.html "class in akka.stream.scaladsl")<[In](SubFlow.html "type parameter in SubFlow"),​[Mat](SubFlow.html "type parameter in SubFlow")>>` | `[asScala](#asScala())()` | Converts this Flow to its Scala DSL counterpart |
	| `[SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​[Out](SubFlow.html "type parameter in SubFlow"),​[Mat](SubFlow.html "type parameter in SubFlow")>` | `[async](#async())()` | Put an asynchronous boundary around this `SubFlow` |
	| `[SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​[Out](SubFlow.html "type parameter in SubFlow"),​[Mat](SubFlow.html "type parameter in SubFlow")>` | `[backpressureTimeout](#backpressureTimeout(java.time.Duration))​(java.time.Duration timeout)` | If the time between the emission of an element and the following downstream demand exceeds the provided timeout,  the stream is failed with a [`BackpressureTimeoutException`](../BackpressureTimeoutException.html "class in akka.stream"). |
	| `<S> [SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​S,​[Mat](SubFlow.html "type parameter in SubFlow")>` | `[batch](#batch(long,akka.japi.function.Function,akka.japi.function.Function2))​(long max,  [Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](SubFlow.html "type parameter in SubFlow"),​S> seed,  [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<S,​[Out](SubFlow.html "type parameter in SubFlow"),​S> aggregate)` | Allows a faster upstream to progress independently of a slower subscriber by aggregating elements into batches  until the subscriber is ready to accept them. |
	| `<S> [SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​S,​[Mat](SubFlow.html "type parameter in SubFlow")>` | `[batchWeighted](#batchWeighted(long,akka.japi.function.Function,akka.japi.function.Function,akka.japi.function.Function2))​(long max,  [Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](SubFlow.html "type parameter in SubFlow"),​java.lang.Long> costFn,  [Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](SubFlow.html "type parameter in SubFlow"),​S> seed,  [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<S,​[Out](SubFlow.html "type parameter in SubFlow"),​S> aggregate)` | Allows a faster upstream to progress independently of a slower subscriber by aggregating elements into batches  until the subscriber is ready to accept them. |
	| `[SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​[Out](SubFlow.html "type parameter in SubFlow"),​[Mat](SubFlow.html "type parameter in SubFlow")>` | `[buffer](#buffer(int,akka.stream.OverflowStrategy))​(int size,  [OverflowStrategy](../OverflowStrategy.html "class in akka.stream") overflowStrategy)` | Adds a fixed size buffer in the flow that allows to store elements from a faster upstream until it becomes full. |
	| `<T> [SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​T,​[Mat](SubFlow.html "type parameter in SubFlow")>` | `[collect](#collect(scala.PartialFunction))​(scala.PartialFunction<[Out](SubFlow.html "type parameter in SubFlow"),​T> pf)` | Transform this stream by applying the given partial function to each of the elements  on which the function is defined as they pass through this processing step. |
	| `<T> [SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​T,​[Mat](SubFlow.html "type parameter in SubFlow")>` | `[collectType](#collectType(java.lang.Class))​(java.lang.Class<T> clazz)` | Transform this stream by testing the type of each of the elements  on which the element is an instance of the provided type as they pass through this processing step. |
	| `[SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​[Out](SubFlow.html "type parameter in SubFlow"),​[Mat](SubFlow.html "type parameter in SubFlow")>` | `[completionTimeout](#completionTimeout(java.time.Duration))​(java.time.Duration timeout)` | If the completion of the stream does not happen until the provided timeout, the stream is failed  with a [`CompletionTimeoutException`](../CompletionTimeoutException.html "class in akka.stream"). |
	| `<M> [SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​[Out](SubFlow.html "type parameter in SubFlow"),​[Mat](SubFlow.html "type parameter in SubFlow")>` | `[concat](#concat(akka.stream.Graph))​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<[Out](SubFlow.html "type parameter in SubFlow")>,​M> that)` | Concatenate the given [`Source`](Source.html "class in akka.stream.javadsl") to this [`Flow`](Flow.html "class in akka.stream.javadsl"), meaning that once this  Flow\&rsquo;s input is exhausted and all result elements have been generated,  the Source\&rsquo;s elements will be produced. |
	| `[SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​[Out](SubFlow.html "type parameter in SubFlow"),​[Mat](SubFlow.html "type parameter in SubFlow")>` | `[concatAllLazy](#concatAllLazy(akka.stream.Graph...))​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<[Out](SubFlow.html "type parameter in SubFlow")>,​?>... those)` | Concatenate the given [`Source`](Source.html "class in akka.stream.javadsl")s to this [`Flow`](Flow.html "class in akka.stream.javadsl"), meaning that once this  Flow\&rsquo;s input is exhausted and all result elements have been generated,  the Source\&rsquo;s elements will be produced. |
	| `[SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​[Out](SubFlow.html "type parameter in SubFlow"),​[Mat](SubFlow.html "type parameter in SubFlow")>` | `[concatAllLazy](#concatAllLazy(scala.collection.immutable.Seq))​(scala.collection.immutable.Seq<[Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<[Out](SubFlow.html "type parameter in SubFlow")>,​?>> those)` | Concatenate the given [`Source`](Source.html "class in akka.stream.javadsl")s to this [`Flow`](Flow.html "class in akka.stream.javadsl"), meaning that once this  Flow\&rsquo;s input is exhausted and all result elements have been generated,  the Source\&rsquo;s elements will be produced. |
	| `<M> [SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​[Out](SubFlow.html "type parameter in SubFlow"),​[Mat](SubFlow.html "type parameter in SubFlow")>` | `[concatLazy](#concatLazy(akka.stream.Graph))​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<[Out](SubFlow.html "type parameter in SubFlow")>,​M> that)` | Concatenate the given [`Source`](Source.html "class in akka.stream.javadsl") to this [`Flow`](Flow.html "class in akka.stream.javadsl"), meaning that once this  Flow\&rsquo;s input is exhausted and all result elements have been generated,  the Source\&rsquo;s elements will be produced. |
	| `[Flow](Flow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​[Out](SubFlow.html "type parameter in SubFlow"),​[Mat](SubFlow.html "type parameter in SubFlow")>` | `[concatSubstreams](#concatSubstreams())()` | Flatten the sub\-flows back into the super\-flow by concatenating them. |
	| `[SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​[Out](SubFlow.html "type parameter in SubFlow"),​[Mat](SubFlow.html "type parameter in SubFlow")>` | `[conflate](#conflate(akka.japi.function.Function2))​([Function2](../../japi/function/Function2.html "interface in akka.japi.function")<[Out](SubFlow.html "type parameter in SubFlow"),​[Out](SubFlow.html "type parameter in SubFlow"),​[Out](SubFlow.html "type parameter in SubFlow")> aggregate)` | Allows a faster upstream to progress independently of a slower subscriber by conflating elements into a summary  until the subscriber is ready to accept them. |
	| `<S> [SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​S,​[Mat](SubFlow.html "type parameter in SubFlow")>` | `[conflateWithSeed](#conflateWithSeed(akka.japi.function.Function,akka.japi.function.Function2))​([Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](SubFlow.html "type parameter in SubFlow"),​S> seed,  [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<S,​[Out](SubFlow.html "type parameter in SubFlow"),​S> aggregate)` | Allows a faster upstream to progress independently of a slower subscriber by conflating elements into a summary  until the subscriber is ready to accept them. |
	| `[SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​[Out](SubFlow.html "type parameter in SubFlow"),​[Mat](SubFlow.html "type parameter in SubFlow")>` | `[delay](#delay(java.time.Duration,akka.stream.DelayOverflowStrategy))​(java.time.Duration of,  [DelayOverflowStrategy](../DelayOverflowStrategy.html "class in akka.stream") strategy)` | Shifts elements emission in time by a specified amount. |
	| `[SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​[Out](SubFlow.html "type parameter in SubFlow"),​[Mat](SubFlow.html "type parameter in SubFlow")>` | `[delayWith](#delayWith(java.util.function.Supplier,akka.stream.DelayOverflowStrategy))​(java.util.function.Supplier<[DelayStrategy](DelayStrategy.html "interface in akka.stream.javadsl")<[Out](SubFlow.html "type parameter in SubFlow")>> delayStrategySupplier,  [DelayOverflowStrategy](../DelayOverflowStrategy.html "class in akka.stream") overFlowStrategy)` | Shifts elements emission in time by an amount individually determined through delay strategy a specified amount. |
	| `[SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​[Out](SubFlow.html "type parameter in SubFlow"),​[Mat](SubFlow.html "type parameter in SubFlow")>` | `[detach](#detach())()` | Detaches upstream demand from downstream demand without detaching the  stream rates; in other words acts like a buffer of size 1\. |
	| `[SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​[Out](SubFlow.html "type parameter in SubFlow"),​[Mat](SubFlow.html "type parameter in SubFlow")>` | `[divertTo](#divertTo(akka.stream.Graph,akka.japi.function.Predicate))​([Graph](../Graph.html "interface in akka.stream")<[SinkShape](../SinkShape.html "class in akka.stream")<[Out](SubFlow.html "type parameter in SubFlow")>,​?> that,  [Predicate](../../japi/function/Predicate.html "interface in akka.japi.function")<[Out](SubFlow.html "type parameter in SubFlow")> when)` | Attaches the given [`Sink`](Sink.html "class in akka.stream.javadsl") to this [`Flow`](Flow.html "class in akka.stream.javadsl"), meaning that elements will be sent to the [`Sink`](Sink.html "class in akka.stream.javadsl")  instead of being passed through if the predicate `when` returns `true`. |
	| `[SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​[Out](SubFlow.html "type parameter in SubFlow"),​[Mat](SubFlow.html "type parameter in SubFlow")>` | `[drop](#drop(long))​(long n)` | Discard the given number of elements at the beginning of the stream. |
	| `[SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​[Out](SubFlow.html "type parameter in SubFlow"),​[Mat](SubFlow.html "type parameter in SubFlow")>` | `[dropWhile](#dropWhile(akka.japi.function.Predicate))​([Predicate](../../japi/function/Predicate.html "interface in akka.japi.function")<[Out](SubFlow.html "type parameter in SubFlow")> p)` | Discard elements at the beginning of the stream while predicate is true. |
	| `[SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​[Out](SubFlow.html "type parameter in SubFlow"),​[Mat](SubFlow.html "type parameter in SubFlow")>` | `[dropWithin](#dropWithin(java.time.Duration))​(java.time.Duration duration)` | Discard the elements received within the given duration at beginning of the stream. |
	| `<U> [SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​U,​[Mat](SubFlow.html "type parameter in SubFlow")>` | `[expand](#expand(akka.japi.function.Function))​([Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](SubFlow.html "type parameter in SubFlow"),​java.util.Iterator<U>> expander)` | Allows a faster downstream to progress independently of a slower upstream by extrapolating elements from an older  element until new element comes from the upstream. |
	| `[SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​[Out](SubFlow.html "type parameter in SubFlow"),​[Mat](SubFlow.html "type parameter in SubFlow")>` | `[extrapolate](#extrapolate(akka.japi.function.Function))​([Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](SubFlow.html "type parameter in SubFlow"),​java.util.Iterator<[Out](SubFlow.html "type parameter in SubFlow")>> extrapolator)` | Allows a faster downstream to progress independent of a slower upstream. |
	| `[SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​[Out](SubFlow.html "type parameter in SubFlow"),​[Mat](SubFlow.html "type parameter in SubFlow")>` | `[extrapolate](#extrapolate(akka.japi.function.Function,Out))​([Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](SubFlow.html "type parameter in SubFlow"),​java.util.Iterator<[Out](SubFlow.html "type parameter in SubFlow")>> extrapolator,  [Out](SubFlow.html "type parameter in SubFlow") initial)` | Allows a faster downstream to progress independent of a slower upstream. |
	| `[SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​[Out](SubFlow.html "type parameter in SubFlow"),​[Mat](SubFlow.html "type parameter in SubFlow")>` | `[filter](#filter(akka.japi.function.Predicate))​([Predicate](../../japi/function/Predicate.html "interface in akka.japi.function")<[Out](SubFlow.html "type parameter in SubFlow")> p)` | Only pass on those elements that satisfy the given predicate. |
	| `[SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​[Out](SubFlow.html "type parameter in SubFlow"),​[Mat](SubFlow.html "type parameter in SubFlow")>` | `[filterNot](#filterNot(akka.japi.function.Predicate))​([Predicate](../../japi/function/Predicate.html "interface in akka.japi.function")<[Out](SubFlow.html "type parameter in SubFlow")> p)` | Only pass on those elements that NOT satisfy the given predicate. |
	| `<T,​M>[SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​T,​[Mat](SubFlow.html "type parameter in SubFlow")>` | `[flatMapConcat](#flatMapConcat(akka.japi.function.Function))​([Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](SubFlow.html "type parameter in SubFlow"),​? extends [Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<T>,​M>> f)` | Transform each input element into a `Source` of output elements that is  then flattened into the output stream by concatenation,  fully consuming one Source after the other. |
	| `<T,​M>[SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​T,​[Mat](SubFlow.html "type parameter in SubFlow")>` | `[flatMapMerge](#flatMapMerge(int,akka.japi.function.Function))​(int breadth,  [Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](SubFlow.html "type parameter in SubFlow"),​? extends [Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<T>,​M>> f)` | Transform each input element into a `Source` of output elements that is  then flattened into the output stream by merging, where at most `breadth`  substreams are being consumed at any given time. |
	| `<Out2,​Mat2>[SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​Out2,​[Mat](SubFlow.html "type parameter in SubFlow")>` | `[flatMapPrefix](#flatMapPrefix(int,akka.japi.function.Function))​(int n,  [Function](../../japi/function/Function.html "interface in akka.japi.function")<java.lang.Iterable<[Out](SubFlow.html "type parameter in SubFlow")>,​[Flow](Flow.html "class in akka.stream.javadsl")<[Out](SubFlow.html "type parameter in SubFlow"),​Out2,​Mat2>> f)` | Takes up to `n` elements from the stream (less than `n` only if the upstream completes before emitting `n` elements),  then apply `f` on these elements in order to obtain a flow, this flow is then materialized and the rest of the input is processed by this flow (similar to via). |
	| `<T> [SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​T,​[Mat](SubFlow.html "type parameter in SubFlow")>` | `[fold](#fold(T,akka.japi.function.Function2))​(T zero,  [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<T,​[Out](SubFlow.html "type parameter in SubFlow"),​T> f)` | Similar to `scan` but only emits its result when the upstream completes,  after which it also completes. |
	| `<T> [SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​T,​[Mat](SubFlow.html "type parameter in SubFlow")>` | `[foldAsync](#foldAsync(T,akka.japi.function.Function2))​(T zero,  [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<T,​[Out](SubFlow.html "type parameter in SubFlow"),​java.util.concurrent.CompletionStage<T>> f)` | Similar to `fold` but with an asynchronous function. |
	| `[SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​java.util.List<[Out](SubFlow.html "type parameter in SubFlow")>,​[Mat](SubFlow.html "type parameter in SubFlow")>` | `[grouped](#grouped(int))​(int n)` | Chunk up this stream into groups of the given size, with the last group  possibly smaller than requested due to end\-of\-stream. |
	| `[SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​java.util.List<[Out](SubFlow.html "type parameter in SubFlow")>,​[Mat](SubFlow.html "type parameter in SubFlow")>` | `[groupedWeighted](#groupedWeighted(long,akka.japi.function.Function))​(long minWeight,  [Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](SubFlow.html "type parameter in SubFlow"),​java.lang.Long> costFn)` | Chunk up this stream into groups of elements that have a cumulative weight greater than or equal to  the `minWeight`, with the last group possibly smaller than requested `minWeight` due to end\-of\-stream. |
	| `[SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​java.util.List<[Out](SubFlow.html "type parameter in SubFlow")>,​[Mat](SubFlow.html "type parameter in SubFlow")>` | `[groupedWeightedWithin](#groupedWeightedWithin(long,int,akka.japi.function.Function,java.time.Duration))​(long maxWeight,  int maxNumber,  [Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](SubFlow.html "type parameter in SubFlow"),​java.lang.Long> costFn,  java.time.Duration duration)` | Chunk up this stream into groups of elements received within a time window,  or limited by the weight and number of the elements, whatever happens first. |
	| `[SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​java.util.List<[Out](SubFlow.html "type parameter in SubFlow")>,​[Mat](SubFlow.html "type parameter in SubFlow")>` | `[groupedWeightedWithin](#groupedWeightedWithin(long,akka.japi.function.Function,java.time.Duration))​(long maxWeight,  [Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](SubFlow.html "type parameter in SubFlow"),​java.lang.Long> costFn,  java.time.Duration duration)` | Chunk up this stream into groups of elements received within a time window,  or limited by the weight of the elements, whatever happens first. |
	| `[SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​java.util.List<[Out](SubFlow.html "type parameter in SubFlow")>,​[Mat](SubFlow.html "type parameter in SubFlow")>` | `[groupedWithin](#groupedWithin(int,java.time.Duration))​(int maxNumber,  java.time.Duration duration)` | Chunk up this stream into groups of elements received within a time window,  or limited by the given number of elements, whatever happens first. |
	| `[SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​[Out](SubFlow.html "type parameter in SubFlow"),​[Mat](SubFlow.html "type parameter in SubFlow")>` | `[idleTimeout](#idleTimeout(java.time.Duration))​(java.time.Duration timeout)` | If the time between two processed elements exceeds the provided timeout, the stream is failed  with a [`StreamIdleTimeoutException`](../StreamIdleTimeoutException.html "class in akka.stream"). |
	| `[SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​[Out](SubFlow.html "type parameter in SubFlow"),​[Mat](SubFlow.html "type parameter in SubFlow")>` | `[initialDelay](#initialDelay(java.time.Duration))​(java.time.Duration delay)` | Delays the initial element by the specified duration. |
	| `[SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​[Out](SubFlow.html "type parameter in SubFlow"),​[Mat](SubFlow.html "type parameter in SubFlow")>` | `[initialTimeout](#initialTimeout(java.time.Duration))​(java.time.Duration timeout)` | If the first element has not passed through this operator before the provided timeout, the stream is failed  with a [`InitialTimeoutException`](../InitialTimeoutException.html "class in akka.stream"). |
	| `[SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​[Out](SubFlow.html "type parameter in SubFlow"),​[Mat](SubFlow.html "type parameter in SubFlow")>` | `[interleave](#interleave(akka.stream.Graph,int))​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<[Out](SubFlow.html "type parameter in SubFlow")>,​?> that,  int segmentSize)` | Interleave is a deterministic merge of the given [`Source`](Source.html "class in akka.stream.javadsl") with elements of this [`Flow`](Flow.html "class in akka.stream.javadsl"). |
	| `[SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​[Out](SubFlow.html "type parameter in SubFlow"),​[Mat](SubFlow.html "type parameter in SubFlow")>` | `[interleaveAll](#interleaveAll(java.util.List,int,boolean))​(java.util.List<? extends [Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<[Out](SubFlow.html "type parameter in SubFlow")>,​?>> those,  int segmentSize,  boolean eagerClose)` | Interleave is a deterministic merge of the given [`Source`](Source.html "class in akka.stream.javadsl")s with elements of this [`Flow`](Flow.html "class in akka.stream.javadsl"). |
	| `[SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​[Out](SubFlow.html "type parameter in SubFlow"),​[Mat](SubFlow.html "type parameter in SubFlow")>` | `[intersperse](#intersperse(Out))​([Out](SubFlow.html "type parameter in SubFlow") inject)` | Intersperses stream with provided element, similar to how `scala.collection.immutable.List.mkString`  injects a separator between a List's elements. |
	| `[SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​[Out](SubFlow.html "type parameter in SubFlow"),​[Mat](SubFlow.html "type parameter in SubFlow")>` | `[intersperse](#intersperse(Out,Out,Out))​([Out](SubFlow.html "type parameter in SubFlow") start,  [Out](SubFlow.html "type parameter in SubFlow") inject,  [Out](SubFlow.html "type parameter in SubFlow") end)` | Intersperses stream with provided element, similar to how `scala.collection.immutable.List.mkString`  injects a separator between a List's elements. |
	| `[SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​[Out](SubFlow.html "type parameter in SubFlow"),​[Mat](SubFlow.html "type parameter in SubFlow")>` | `[keepAlive](#keepAlive(java.time.Duration,akka.japi.function.Creator))​(java.time.Duration maxIdle,  [Creator](../../japi/function/Creator.html "interface in akka.japi.function")<[Out](SubFlow.html "type parameter in SubFlow")> injectedElem)` | Injects additional elements if upstream does not emit for a configured amount of time. |
	| `[SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​[Out](SubFlow.html "type parameter in SubFlow"),​[Mat](SubFlow.html "type parameter in SubFlow")>` | `[limit](#limit(long))​(long n)` | Ensure stream boundedness by limiting the number of elements from upstream. |
	| `[SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​[Out](SubFlow.html "type parameter in SubFlow"),​[Mat](SubFlow.html "type parameter in SubFlow")>` | `[limitWeighted](#limitWeighted(long,akka.japi.function.Function))​(long n,  [Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](SubFlow.html "type parameter in SubFlow"),​java.lang.Long> costFn)` | Ensure stream boundedness by evaluating the cost of incoming elements  using a cost function. |
	| `[SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​[Out](SubFlow.html "type parameter in SubFlow"),​[Mat](SubFlow.html "type parameter in SubFlow")>` | `[log](#log(java.lang.String))​(java.lang.String name)` | Logs elements flowing through the stream as well as completion and erroring. |
	| `[SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​[Out](SubFlow.html "type parameter in SubFlow"),​[Mat](SubFlow.html "type parameter in SubFlow")>` | `[log](#log(java.lang.String,akka.event.LoggingAdapter))​(java.lang.String name,  [LoggingAdapter](../../event/LoggingAdapter.html "interface in akka.event") log)` | Logs elements flowing through the stream as well as completion and erroring. |
	| `[SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​[Out](SubFlow.html "type parameter in SubFlow"),​[Mat](SubFlow.html "type parameter in SubFlow")>` | `[log](#log(java.lang.String,akka.japi.function.Function))​(java.lang.String name,  [Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](SubFlow.html "type parameter in SubFlow"),​java.lang.Object> extract)` | Logs elements flowing through the stream as well as completion and erroring. |
	| `[SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​[Out](SubFlow.html "type parameter in SubFlow"),​[Mat](SubFlow.html "type parameter in SubFlow")>` | `[log](#log(java.lang.String,akka.japi.function.Function,akka.event.LoggingAdapter))​(java.lang.String name,  [Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](SubFlow.html "type parameter in SubFlow"),​java.lang.Object> extract,  [LoggingAdapter](../../event/LoggingAdapter.html "interface in akka.event") log)` | Logs elements flowing through the stream as well as completion and erroring. |
	| `[SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​[Out](SubFlow.html "type parameter in SubFlow"),​[Mat](SubFlow.html "type parameter in SubFlow")>` | `[logWithMarker](#logWithMarker(java.lang.String,akka.japi.function.Function))​(java.lang.String name,  [Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](SubFlow.html "type parameter in SubFlow"),​[LogMarker](../../event/LogMarker.html "class in akka.event")> marker)` | Logs elements flowing through the stream as well as completion and erroring. |
	| `[SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​[Out](SubFlow.html "type parameter in SubFlow"),​[Mat](SubFlow.html "type parameter in SubFlow")>` | `[logWithMarker](#logWithMarker(java.lang.String,akka.japi.function.Function,akka.event.MarkerLoggingAdapter))​(java.lang.String name,  [Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](SubFlow.html "type parameter in SubFlow"),​[LogMarker](../../event/LogMarker.html "class in akka.event")> marker,  [MarkerLoggingAdapter](../../event/MarkerLoggingAdapter.html "class in akka.event") log)` | Logs elements flowing through the stream as well as completion and erroring. |
	| `[SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​[Out](SubFlow.html "type parameter in SubFlow"),​[Mat](SubFlow.html "type parameter in SubFlow")>` | `[logWithMarker](#logWithMarker(java.lang.String,akka.japi.function.Function,akka.japi.function.Function))​(java.lang.String name,  [Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](SubFlow.html "type parameter in SubFlow"),​[LogMarker](../../event/LogMarker.html "class in akka.event")> marker,  [Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](SubFlow.html "type parameter in SubFlow"),​java.lang.Object> extract)` | Logs elements flowing through the stream as well as completion and erroring. |
	| `[SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​[Out](SubFlow.html "type parameter in SubFlow"),​[Mat](SubFlow.html "type parameter in SubFlow")>` | `[logWithMarker](#logWithMarker(java.lang.String,akka.japi.function.Function,akka.japi.function.Function,akka.event.MarkerLoggingAdapter))​(java.lang.String name,  [Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](SubFlow.html "type parameter in SubFlow"),​[LogMarker](../../event/LogMarker.html "class in akka.event")> marker,  [Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](SubFlow.html "type parameter in SubFlow"),​java.lang.Object> extract,  [MarkerLoggingAdapter](../../event/MarkerLoggingAdapter.html "class in akka.event") log)` | Logs elements flowing through the stream as well as completion and erroring. |
	| `<T> [SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​T,​[Mat](SubFlow.html "type parameter in SubFlow")>` | `[map](#map(akka.japi.function.Function))​([Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](SubFlow.html "type parameter in SubFlow"),​T> f)` | Transform this stream by applying the given function to each of the elements  as they pass through this processing step. |
	| `<T> [SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​T,​[Mat](SubFlow.html "type parameter in SubFlow")>` | `[mapAsync](#mapAsync(int,akka.japi.function.Function))​(int parallelism,  [Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](SubFlow.html "type parameter in SubFlow"),​java.util.concurrent.CompletionStage<T>> f)` | Transform this stream by applying the given function to each of the elements  as they pass through this processing step. |
	| `<T,​P>[SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​T,​[Mat](SubFlow.html "type parameter in SubFlow")>` | `[mapAsyncPartitioned](#mapAsyncPartitioned(int,int,akka.japi.function.Function,java.util.function.BiFunction))​(int parallelism,  int perPartition,  [Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](SubFlow.html "type parameter in SubFlow"),​P> partitioner,  java.util.function.BiFunction<[Out](SubFlow.html "type parameter in SubFlow"),​P,​java.util.concurrent.CompletionStage<T>> f)` |  |
	| `<T> [SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​T,​[Mat](SubFlow.html "type parameter in SubFlow")>` | `[mapAsyncUnordered](#mapAsyncUnordered(int,akka.japi.function.Function))​(int parallelism,  [Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](SubFlow.html "type parameter in SubFlow"),​java.util.concurrent.CompletionStage<T>> f)` | Transform this stream by applying the given function to each of the elements  as they pass through this processing step. |
	| `<T> [SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​T,​[Mat](SubFlow.html "type parameter in SubFlow")>` | `[mapConcat](#mapConcat(akka.japi.function.Function))​([Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](SubFlow.html "type parameter in SubFlow"),​java.lang.Iterable<T>> f)` | Transform each input element into an `Iterable` of output elements that is  then flattened into the output stream. |
	| `<E extends java.lang.Throwable>[SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​[Out](SubFlow.html "type parameter in SubFlow"),​[Mat](SubFlow.html "type parameter in SubFlow")>` | `[mapError](#mapError(java.lang.Class,akka.japi.function.Function))​(java.lang.Class<E> clazz,  [Function](../../japi/function/Function.html "interface in akka.japi.function")<E,​java.lang.Throwable> f)` | While similar to [`recover(scala.PartialFunction<java.lang.Throwable,Out>)`](#recover(scala.PartialFunction)) this operator can be used to transform an error signal to a different one \*without\* logging  it as an error in the process. |
	| `[SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​[Out](SubFlow.html "type parameter in SubFlow"),​[Mat](SubFlow.html "type parameter in SubFlow")>` | `[mapError](#mapError(scala.PartialFunction))​(scala.PartialFunction<java.lang.Throwable,​java.lang.Throwable> pf)` | While similar to [`recover(scala.PartialFunction<java.lang.Throwable,Out>)`](#recover(scala.PartialFunction)) this operator can be used to transform an error signal to a different one \*without\* logging  it as an error in the process. |
	| `<R,​T>[SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​T,​[Mat](SubFlow.html "type parameter in SubFlow")>` | `[mapWithResource](#mapWithResource(java.util.function.Supplier,java.util.function.BiFunction,java.util.function.Function))​(java.util.function.Supplier<R> create,  java.util.function.BiFunction<R,​[Out](SubFlow.html "type parameter in SubFlow"),​T> f,  java.util.function.Function<R,​java.util.Optional<T>> close)` | Transform each stream element with the help of a resource. |
	| `[SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​[Out](SubFlow.html "type parameter in SubFlow"),​[Mat](SubFlow.html "type parameter in SubFlow")>` | `[merge](#merge(akka.stream.Graph))​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<[Out](SubFlow.html "type parameter in SubFlow")>,​?> that)` | Merge the given [`Source`](Source.html "class in akka.stream.javadsl") to this [`Flow`](Flow.html "class in akka.stream.javadsl"), taking elements as they arrive from input streams,  picking randomly when several elements ready. |
	| `[SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​[Out](SubFlow.html "type parameter in SubFlow"),​[Mat](SubFlow.html "type parameter in SubFlow")>` | `[mergeAll](#mergeAll(java.util.List,boolean))​(java.util.List<? extends [Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<[Out](SubFlow.html "type parameter in SubFlow")>,​?>> those,  boolean eagerComplete)` | Merge the given [`Source`](Source.html "class in akka.stream.javadsl")s to this [`Flow`](Flow.html "class in akka.stream.javadsl"), taking elements as they arrive from input streams,  picking randomly when several elements ready. |
	| `<M> [SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​java.util.List<[Out](SubFlow.html "type parameter in SubFlow")>,​[Mat](SubFlow.html "type parameter in SubFlow")>` | `[mergeLatest](#mergeLatest(akka.stream.Graph,boolean))​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<[Out](SubFlow.html "type parameter in SubFlow")>,​M> that,  boolean eagerComplete)` | MergeLatest joins elements from N input streams into stream of lists of size N. |
	| `<M> [SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​[Out](SubFlow.html "type parameter in SubFlow"),​[Mat](SubFlow.html "type parameter in SubFlow")>` | `[mergePreferred](#mergePreferred(akka.stream.Graph,boolean,boolean))​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<[Out](SubFlow.html "type parameter in SubFlow")>,​M> that,  boolean preferred,  boolean eagerComplete)` | Merge two sources. |
	| `<M> [SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​[Out](SubFlow.html "type parameter in SubFlow"),​[Mat](SubFlow.html "type parameter in SubFlow")>` | `[mergePrioritized](#mergePrioritized(akka.stream.Graph,int,int,boolean))​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<[Out](SubFlow.html "type parameter in SubFlow")>,​M> that,  int leftPriority,  int rightPriority,  boolean eagerComplete)` | Merge two sources. |
	| `<M> [SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​[Out](SubFlow.html "type parameter in SubFlow"),​[Mat](SubFlow.html "type parameter in SubFlow")>` | `[mergeSorted](#mergeSorted(akka.stream.Graph,java.util.Comparator))​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<[Out](SubFlow.html "type parameter in SubFlow")>,​M> that,  java.util.Comparator<[Out](SubFlow.html "type parameter in SubFlow")> comp)` | Merge the given [`Source`](Source.html "class in akka.stream.javadsl") to this [`Flow`](Flow.html "class in akka.stream.javadsl"), taking elements as they arrive from input streams,  picking always the smallest of the available elements (waiting for one element from each side  to be available). |
	| `[Flow](Flow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​[Out](SubFlow.html "type parameter in SubFlow"),​[Mat](SubFlow.html "type parameter in SubFlow")>` | `[mergeSubstreams](#mergeSubstreams())()` | Flatten the sub\-flows back into the super\-flow by performing a merge  without parallelism limit (i.e. |
	| `[Flow](Flow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​[Out](SubFlow.html "type parameter in SubFlow"),​[Mat](SubFlow.html "type parameter in SubFlow")>` | `[mergeSubstreamsWithParallelism](#mergeSubstreamsWithParallelism(int))​(int parallelism)` | Flatten the sub\-flows back into the super\-flow by performing a merge  with the given parallelism limit. |
	| `[SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​[Out](SubFlow.html "type parameter in SubFlow"),​[Mat](SubFlow.html "type parameter in SubFlow")>` | `[named](#named(java.lang.String))​(java.lang.String name)` | Add a name attribute to this Flow. |
	| `[SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​[Out](SubFlow.html "type parameter in SubFlow"),​[Mat](SubFlow.html "type parameter in SubFlow")>` | `[onErrorComplete](#onErrorComplete())()` | onErrorComplete allows to complete the stream when an upstream error occurs. |
	| `[SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​[Out](SubFlow.html "type parameter in SubFlow"),​[Mat](SubFlow.html "type parameter in SubFlow")>` | `[onErrorComplete](#onErrorComplete(java.lang.Class))​(java.lang.Class<? extends java.lang.Throwable> clazz)` | onErrorComplete allows to complete the stream when an upstream error occurs. |
	| `[SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​[Out](SubFlow.html "type parameter in SubFlow"),​[Mat](SubFlow.html "type parameter in SubFlow")>` | `[onErrorComplete](#onErrorComplete(java.util.function.Predicate))​(java.util.function.Predicate<? super java.lang.Throwable> predicate)` | onErrorComplete allows to complete the stream when an upstream error occurs. |
	| `<M> [SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​[Out](SubFlow.html "type parameter in SubFlow"),​[Mat](SubFlow.html "type parameter in SubFlow")>` | `[orElse](#orElse(akka.stream.Graph))​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<[Out](SubFlow.html "type parameter in SubFlow")>,​M> secondary)` | Provides a secondary source that will be consumed if this source completes without any  elements passing by. |
	| `[SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​[Pair](../../japi/Pair.html "class in akka.japi")<java.util.List<[Out](SubFlow.html "type parameter in SubFlow")>,​[Source](Source.html "class in akka.stream.javadsl")<[Out](SubFlow.html "type parameter in SubFlow"),​[NotUsed](../../NotUsed.html "class in akka")>>,​[Mat](SubFlow.html "type parameter in SubFlow")>` | `[prefixAndTail](#prefixAndTail(int))​(int n)` | Takes up to `n` elements from the stream (less than `n` only if the upstream completes before emitting `n` elements)  and returns a pair containing a strict sequence of the taken element  and a stream representing the remaining elements. |
	| `<M> [SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​[Out](SubFlow.html "type parameter in SubFlow"),​[Mat](SubFlow.html "type parameter in SubFlow")>` | `[prepend](#prepend(akka.stream.Graph))​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<[Out](SubFlow.html "type parameter in SubFlow")>,​M> that)` | Prepend the given [`Source`](Source.html "class in akka.stream.javadsl") to this [`Flow`](Flow.html "class in akka.stream.javadsl"), meaning that before elements  are generated from this Flow, the Source's elements will be produced until it  is exhausted, at which point Flow elements will start being produced. |
	| `<M> [SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​[Out](SubFlow.html "type parameter in SubFlow"),​[Mat](SubFlow.html "type parameter in SubFlow")>` | `[prependLazy](#prependLazy(akka.stream.Graph))​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<[Out](SubFlow.html "type parameter in SubFlow")>,​M> that)` | Prepend the given [`Source`](Source.html "class in akka.stream.javadsl") to this [`Flow`](Flow.html "class in akka.stream.javadsl"), meaning that before elements  are generated from this Flow, the Source's elements will be produced until it  is exhausted, at which point Flow elements will start being produced. |
	| `[SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​[Out](SubFlow.html "type parameter in SubFlow"),​[Mat](SubFlow.html "type parameter in SubFlow")>` | `[recover](#recover(scala.PartialFunction))​(scala.PartialFunction<java.lang.Throwable,​[Out](SubFlow.html "type parameter in SubFlow")> pf)` | Recover allows to send last element on failure and gracefully complete the stream  Since the underlying failure signal onError arrives out\-of\-band, it might jump over existing elements. |
	| `[SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​[Out](SubFlow.html "type parameter in SubFlow"),​[Mat](SubFlow.html "type parameter in SubFlow")>` | `[recoverWith](#recoverWith(scala.PartialFunction))​(scala.PartialFunction<java.lang.Throwable,​[Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<[Out](SubFlow.html "type parameter in SubFlow")>,​[NotUsed](../../NotUsed.html "class in akka")>> pf)` | RecoverWith allows to switch to alternative Source on flow failure. |
	| `[SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​[Out](SubFlow.html "type parameter in SubFlow"),​[Mat](SubFlow.html "type parameter in SubFlow")>` | `[recoverWithRetries](#recoverWithRetries(int,scala.PartialFunction))​(int attempts,  scala.PartialFunction<java.lang.Throwable,​[Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<[Out](SubFlow.html "type parameter in SubFlow")>,​[NotUsed](../../NotUsed.html "class in akka")>> pf)` | RecoverWithRetries allows to switch to alternative Source on flow failure. |
	| `[SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​[Out](SubFlow.html "type parameter in SubFlow"),​[Mat](SubFlow.html "type parameter in SubFlow")>` | `[reduce](#reduce(akka.japi.function.Function2))​([Function2](../../japi/function/Function2.html "interface in akka.japi.function")<[Out](SubFlow.html "type parameter in SubFlow"),​[Out](SubFlow.html "type parameter in SubFlow"),​[Out](SubFlow.html "type parameter in SubFlow")> f)` | Similar to `fold` but uses first element as zero element. |
	| `<T> [SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​T,​[Mat](SubFlow.html "type parameter in SubFlow")>` | `[scan](#scan(T,akka.japi.function.Function2))​(T zero,  [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<T,​[Out](SubFlow.html "type parameter in SubFlow"),​T> f)` | Similar to `fold` but is not a terminal operation,  emits its current value which starts at `zero` and then  applies the current and next value to the given function `f`,  emitting the next current value. |
	| `<T> [SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​T,​[Mat](SubFlow.html "type parameter in SubFlow")>` | `[scanAsync](#scanAsync(T,akka.japi.function.Function2))​(T zero,  [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<T,​[Out](SubFlow.html "type parameter in SubFlow"),​java.util.concurrent.CompletionStage<T>> f)` | Similar to `scan` but with a asynchronous function,  emits its current value which starts at `zero` and then  applies the current and next value to the given function `f`,  emitting a `Future` that resolves to the next current value. |
	| `[SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​java.util.List<[Out](SubFlow.html "type parameter in SubFlow")>,​[Mat](SubFlow.html "type parameter in SubFlow")>` | `[sliding](#sliding(int,int))​(int n,  int step)` | Apply a sliding window over the stream and return the windows as groups of elements, with the last group  possibly smaller than requested due to end\-of\-stream. |
	| `int` | `[sliding$default$2](#sliding$default$2())()` |  |
	| `<S,​T>[SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​T,​[Mat](SubFlow.html "type parameter in SubFlow")>` | `[statefulMap](#statefulMap(akka.japi.function.Creator,akka.japi.function.Function2,akka.japi.function.Function))​([Creator](../../japi/function/Creator.html "interface in akka.japi.function")<S> create,  [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<S,​[Out](SubFlow.html "type parameter in SubFlow"),​[Pair](../../japi/Pair.html "class in akka.japi")<S,​T>> f,  [Function](../../japi/function/Function.html "interface in akka.japi.function")<S,​java.util.Optional<T>> onComplete)` | Transform each stream element with the help of a state. |
	| `<T> [SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​T,​[Mat](SubFlow.html "type parameter in SubFlow")>` | `[statefulMapConcat](#statefulMapConcat(akka.japi.function.Creator))​([Creator](../../japi/function/Creator.html "interface in akka.japi.function")<[Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](SubFlow.html "type parameter in SubFlow"),​java.lang.Iterable<T>>> f)` | Transform each input element into an `Iterable` of output elements that is  then flattened into the output stream. |
	| `[SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​[Out](SubFlow.html "type parameter in SubFlow"),​[Mat](SubFlow.html "type parameter in SubFlow")>` | `[take](#take(long))​(long n)` | Terminate processing (and cancel the upstream publisher) after the given  number of elements. |
	| `[SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​[Out](SubFlow.html "type parameter in SubFlow"),​[Mat](SubFlow.html "type parameter in SubFlow")>` | `[takeWhile](#takeWhile(akka.japi.function.Predicate))​([Predicate](../../japi/function/Predicate.html "interface in akka.japi.function")<[Out](SubFlow.html "type parameter in SubFlow")> p)` | Terminate processing (and cancel the upstream publisher) after predicate  returns false for the first time,  Due to input buffering some elements may have been requested from upstream publishers  that will then not be processed downstream of this step. |
	| `[SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​[Out](SubFlow.html "type parameter in SubFlow"),​[Mat](SubFlow.html "type parameter in SubFlow")>` | `[takeWhile](#takeWhile(akka.japi.function.Predicate,boolean))​([Predicate](../../japi/function/Predicate.html "interface in akka.japi.function")<[Out](SubFlow.html "type parameter in SubFlow")> p,  boolean inclusive)` | Terminate processing (and cancel the upstream publisher) after predicate  returns false for the first time, including the first failed element iff inclusive is true  Due to input buffering some elements may have been requested from upstream publishers  that will then not be processed downstream of this step. |
	| `[SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​[Out](SubFlow.html "type parameter in SubFlow"),​[Mat](SubFlow.html "type parameter in SubFlow")>` | `[takeWithin](#takeWithin(java.time.Duration))​(java.time.Duration duration)` | Terminate processing (and cancel the upstream publisher) after the given  duration. |
	| `[SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​[Out](SubFlow.html "type parameter in SubFlow"),​[Mat](SubFlow.html "type parameter in SubFlow")>` | `[throttle](#throttle(int,java.time.Duration))​(int elements,  java.time.Duration per)` | Sends elements downstream with speed limited to `elements/per`. |
	| `[SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​[Out](SubFlow.html "type parameter in SubFlow"),​[Mat](SubFlow.html "type parameter in SubFlow")>` | `[throttle](#throttle(int,java.time.Duration,int,akka.japi.function.Function,akka.stream.ThrottleMode))​(int cost,  java.time.Duration per,  int maximumBurst,  [Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](SubFlow.html "type parameter in SubFlow"),​java.lang.Integer> costCalculation,  [ThrottleMode](../ThrottleMode.html "class in akka.stream") mode)` | Sends elements downstream with speed limited to `cost/per`. |
	| `[SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​[Out](SubFlow.html "type parameter in SubFlow"),​[Mat](SubFlow.html "type parameter in SubFlow")>` | `[throttle](#throttle(int,java.time.Duration,int,akka.stream.ThrottleMode))​(int elements,  java.time.Duration per,  int maximumBurst,  [ThrottleMode](../ThrottleMode.html "class in akka.stream") mode)` | Sends elements downstream with speed limited to `elements/per`. |
	| `[SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​[Out](SubFlow.html "type parameter in SubFlow"),​[Mat](SubFlow.html "type parameter in SubFlow")>` | `[throttle](#throttle(int,java.time.Duration,akka.japi.function.Function))​(int cost,  java.time.Duration per,  [Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](SubFlow.html "type parameter in SubFlow"),​java.lang.Integer> costCalculation)` | Sends elements downstream with speed limited to `cost/per`. |
	| `[SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​[Out](SubFlow.html "type parameter in SubFlow"),​[Mat](SubFlow.html "type parameter in SubFlow")>` | `[throttle](#throttle(akka.stream.javadsl.ThrottleControl))​([ThrottleControl](ThrottleControl.html "class in akka.stream.javadsl") control)` |  |
	| `[SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​[Out](SubFlow.html "type parameter in SubFlow"),​[Mat](SubFlow.html "type parameter in SubFlow")>` | `[throttle](#throttle(akka.stream.javadsl.ThrottleControl,akka.japi.function.Function))​([ThrottleControl](ThrottleControl.html "class in akka.stream.javadsl") control,  [Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](SubFlow.html "type parameter in SubFlow"),​java.lang.Integer> costCalculation)` |  |
	| `[Sink](Sink.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​[Mat](SubFlow.html "type parameter in SubFlow")>` | `[to](#to(akka.stream.Graph))​([Graph](../Graph.html "interface in akka.stream")<[SinkShape](../SinkShape.html "class in akka.stream")<[Out](SubFlow.html "type parameter in SubFlow")>,​?> sink)` | Connect this [`SubFlow`](SubFlow.html "class in akka.stream.javadsl") to a [`Sink`](Sink.html "class in akka.stream.javadsl"), concatenating the processing steps of both. |
	| `static <In,​SuperOut,​Out extends SuperOut,​M>[SubFlow](SubFlow.html "class in akka.stream.javadsl")<In,​SuperOut,​M>` | `[upcast](#upcast(akka.stream.javadsl.SubFlow))​([SubFlow](SubFlow.html "class in akka.stream.javadsl")<In,​Out,​M> flow)` | Upcast a stream of elements to a stream of supertypes of that element. |
	| `<T,​M>[SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​T,​[Mat](SubFlow.html "type parameter in SubFlow")>` | `[via](#via(akka.stream.Graph))​([Graph](../Graph.html "interface in akka.stream")<[FlowShape](../FlowShape.html "class in akka.stream")<[Out](SubFlow.html "type parameter in SubFlow"),​T>,​M> flow)` | Transform this [`Flow`](Flow.html "class in akka.stream.javadsl") by appending the given processing steps. |
	| `[SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​[Out](SubFlow.html "type parameter in SubFlow"),​[Mat](SubFlow.html "type parameter in SubFlow")>` | `[wireTap](#wireTap(akka.japi.function.Procedure))​([Procedure](../../japi/function/Procedure.html "interface in akka.japi.function")<[Out](SubFlow.html "type parameter in SubFlow")> f)` | This is a simplified version of `wireTap(Sink)` that takes only a simple procedure. |
	| `[SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​[Out](SubFlow.html "type parameter in SubFlow"),​[Mat](SubFlow.html "type parameter in SubFlow")>` | `[wireTap](#wireTap(akka.stream.Graph))​([Graph](../Graph.html "interface in akka.stream")<[SinkShape](../SinkShape.html "class in akka.stream")<[Out](SubFlow.html "type parameter in SubFlow")>,​?> that)` | Attaches the given [`Sink`](Sink.html "class in akka.stream.javadsl") to this [`Flow`](Flow.html "class in akka.stream.javadsl") as a wire tap, meaning that elements that pass  through will also be sent to the wire\-tap Sink, without the latter affecting the mainline flow. |
	| `[SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​[Out](SubFlow.html "type parameter in SubFlow"),​[Mat](SubFlow.html "type parameter in SubFlow")>` | `[withAttributes](#withAttributes(akka.stream.Attributes))​([Attributes](../Attributes.html "class in akka.stream") attr)` | Change the attributes of this [`Source`](Source.html "class in akka.stream.javadsl") to the given ones and seal the list  of attributes. |
	| `<T> [SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​[Pair](../../japi/Pair.html "class in akka.japi")<[Out](SubFlow.html "type parameter in SubFlow"),​T>,​[Mat](SubFlow.html "type parameter in SubFlow")>` | `[zip](#zip(akka.stream.Graph))​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<T>,​?> source)` | Combine the elements of current [`Flow`](Flow.html "class in akka.stream.javadsl") and the given [`Source`](Source.html "class in akka.stream.javadsl") into a stream of tuples. |
	| `<U,​A>[SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​[Pair](../../japi/Pair.html "class in akka.japi")<A,​U>,​[Mat](SubFlow.html "type parameter in SubFlow")>` | `[zipAll](#zipAll(akka.stream.Graph,A,U))​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<U>,​?> that,  A thisElem,  U thatElem)` | Combine the elements of current flow and the given [`Source`](Source.html "class in akka.stream.javadsl") into a stream of tuples. |
	| `<T> [SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​[Pair](../../japi/Pair.html "class in akka.japi")<[Out](SubFlow.html "type parameter in SubFlow"),​T>,​[Mat](SubFlow.html "type parameter in SubFlow")>` | `[zipLatest](#zipLatest(akka.stream.Graph))​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<T>,​?> source)` | Combine the elements of current [`Flow`](Flow.html "class in akka.stream.javadsl") and the given [`Source`](Source.html "class in akka.stream.javadsl") into a stream of tuples, picking always the latest element of each. |
	| `<Out2,​Out3>[SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​Out3,​[Mat](SubFlow.html "type parameter in SubFlow")>` | `[zipLatestWith](#zipLatestWith(akka.stream.Graph,akka.japi.function.Function2))​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<Out2>,​?> that,  [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<[Out](SubFlow.html "type parameter in SubFlow"),​Out2,​Out3> combine)` | Put together the elements of current [`Flow`](Flow.html "class in akka.stream.javadsl") and the given [`Source`](Source.html "class in akka.stream.javadsl")  into a stream of combined elements using a combiner function, picking always the latest element of each. |
	| `<Out2,​Out3>[SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​Out3,​[Mat](SubFlow.html "type parameter in SubFlow")>` | `[zipWith](#zipWith(akka.stream.Graph,akka.japi.function.Function2))​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<Out2>,​?> that,  [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<[Out](SubFlow.html "type parameter in SubFlow"),​Out2,​Out3> combine)` | Put together the elements of current [`Flow`](Flow.html "class in akka.stream.javadsl") and the given [`Source`](Source.html "class in akka.stream.javadsl")  into a stream of combined elements using a combiner function. |
	| `[SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​[Pair](../../japi/Pair.html "class in akka.japi")<[Out](SubFlow.html "type parameter in SubFlow"),​java.lang.Long>,​[Mat](SubFlow.html "type parameter in SubFlow")>` | `[zipWithIndex](#zipWithIndex())()` | Combine the elements of current [`Flow`](Flow.html "class in akka.stream.javadsl") into a stream of tuples consisting  of all elements paired with their index. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### SubFlow
		
		
		
		```
		public SubFlow​([SubFlow](../scaladsl/SubFlow.html "interface in akka.stream.scaladsl")<[Out](SubFlow.html "type parameter in SubFlow"),​[Mat](SubFlow.html "type parameter in SubFlow"),​[Flow](../scaladsl/Flow.html "class in akka.stream.scaladsl")<[In](SubFlow.html "type parameter in SubFlow"),​java.lang.Object,​[Mat](SubFlow.html "type parameter in SubFlow")>,​[Sink](../scaladsl/Sink.html "class in akka.stream.scaladsl")<[In](SubFlow.html "type parameter in SubFlow"),​[Mat](SubFlow.html "type parameter in SubFlow")>> delegate)
		```

	- ### Method Detail
	
	
	
		- #### upcast
		
		
		
		```
		public static <In,​SuperOut,​Out extends SuperOut,​M> [SubFlow](SubFlow.html "class in akka.stream.javadsl")<In,​SuperOut,​M> upcast​([SubFlow](SubFlow.html "class in akka.stream.javadsl")<In,​Out,​M> flow)
		```
		
		Upcast a stream of elements to a stream of supertypes of that element. Useful in combination with
		 fan\-in operators where you do not want to pay the cost of casting each element in a `map`.
		 
		
		Returns:
		A flow that accepts `In` and outputs elements of the super type
		- #### concatAllLazy
		
		
		
		```
		public [SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​[Out](SubFlow.html "type parameter in SubFlow"),​[Mat](SubFlow.html "type parameter in SubFlow")> concatAllLazy​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<[Out](SubFlow.html "type parameter in SubFlow")>,​?>... those)
		```
		
		Concatenate the given [`Source`](Source.html "class in akka.stream.javadsl")s to this [`Flow`](Flow.html "class in akka.stream.javadsl"), meaning that once this
		 Flow\&rsquo;s input is exhausted and all result elements have been generated,
		 the Source\&rsquo;s elements will be produced.
		 
		 Note that the [`Source`](Source.html "class in akka.stream.javadsl")s are materialized together with this Flow. If `lazy` materialization is what is needed
		 the operator can be combined with for example `Source.lazySource` to defer materialization of `that` until the
		 time when this source completes.
		 
		
		
		 The second source is then kept from producing elements by asserting back\-pressure until its time comes.
		 
		
		
		 For a concat operator that is detached, use [`concat(akka.stream.Graph<akka.stream.SourceShape<Out>, M>)`](#concat(akka.stream.Graph))
		
		
		
		 If this [`Flow`](Flow.html "class in akka.stream.javadsl") gets upstream error \- no elements from the given [`Source`](Source.html "class in akka.stream.javadsl")s will be pulled.
		 
		
		
		 '''Emits when''' element is available from current stream or from the given [`Source`](Source.html "class in akka.stream.javadsl")s when current is completed
		 
		
		
		 '''Backpressures when''' downstream backpressures
		 
		
		
		 '''Completes when''' given all those [`Source`](Source.html "class in akka.stream.javadsl")s completes
		 
		
		
		 '''Cancels when''' downstream cancels
		- #### alsoToAll
		
		
		
		```
		public [SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​[Out](SubFlow.html "type parameter in SubFlow"),​[Mat](SubFlow.html "type parameter in SubFlow")> alsoToAll​([Graph](../Graph.html "interface in akka.stream")<[SinkShape](../SinkShape.html "class in akka.stream")<[Out](SubFlow.html "type parameter in SubFlow")>,​?>... those)
		```
		
		Attaches the given [`Sink`](Sink.html "class in akka.stream.javadsl")s to this [`Flow`](Flow.html "class in akka.stream.javadsl"), meaning that elements that passes
		 through will also be sent to all those [`Sink`](Sink.html "class in akka.stream.javadsl")s.
		 
		 It is similar to [`wireTap(akka.japi.function.Procedure<Out>)`](#wireTap(akka.japi.function.Procedure)) but will backpressure instead of dropping elements when the given [`Sink`](Sink.html "class in akka.stream.javadsl")s is not ready.
		 
		
		
		 '''Emits when''' element is available and demand exists both from the Sinks and the downstream.
		 
		
		
		 '''Backpressures when''' downstream or any of the [`Sink`](Sink.html "class in akka.stream.javadsl")s backpressures
		 
		
		
		 '''Completes when''' upstream completes
		 
		
		
		 '''Cancels when''' downstream or any of the [`Sink`](Sink.html "class in akka.stream.javadsl")s cancels
		- #### asScala
		
		
		
		```
		public [SubFlow](../scaladsl/SubFlow.html "interface in akka.stream.scaladsl")<[Out](SubFlow.html "type parameter in SubFlow"),​[Mat](SubFlow.html "type parameter in SubFlow"),​[Flow](../scaladsl/Flow.html "class in akka.stream.scaladsl")<[In](SubFlow.html "type parameter in SubFlow"),​java.lang.Object,​[Mat](SubFlow.html "type parameter in SubFlow")>,​[Sink](../scaladsl/Sink.html "class in akka.stream.scaladsl")<[In](SubFlow.html "type parameter in SubFlow"),​[Mat](SubFlow.html "type parameter in SubFlow")>> asScala()
		```
		
		Converts this Flow to its Scala DSL counterpart
		- #### mergeSubstreams
		
		
		
		```
		public [Flow](Flow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​[Out](SubFlow.html "type parameter in SubFlow"),​[Mat](SubFlow.html "type parameter in SubFlow")> mergeSubstreams()
		```
		
		Flatten the sub\-flows back into the super\-flow by performing a merge
		 without parallelism limit (i.e. having an unbounded number of sub\-flows
		 active concurrently).
		 
		 This is identical in effect to `mergeSubstreamsWithParallelism(Integer.MAX_VALUE)`.
		- #### mergeSubstreamsWithParallelism
		
		
		
		```
		public [Flow](Flow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​[Out](SubFlow.html "type parameter in SubFlow"),​[Mat](SubFlow.html "type parameter in SubFlow")> mergeSubstreamsWithParallelism​(int parallelism)
		```
		
		Flatten the sub\-flows back into the super\-flow by performing a merge
		 with the given parallelism limit. This means that only up to `parallelism`
		 substreams will be executed at any given time. Substreams that are not
		 yet executed are also not materialized, meaning that back\-pressure will
		 be exerted at the operator that creates the substreams when the parallelism
		 limit is reached.
		- #### concatSubstreams
		
		
		
		```
		public [Flow](Flow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​[Out](SubFlow.html "type parameter in SubFlow"),​[Mat](SubFlow.html "type parameter in SubFlow")> concatSubstreams()
		```
		
		Flatten the sub\-flows back into the super\-flow by concatenating them.
		 This is usually a bad idea when combined with `groupBy` since it can
		 easily lead to deadlock—the concatenation does not consume from the second
		 substream until the first has finished and the `groupBy` operator will get
		 back\-pressure from the second stream.
		 
		 This is identical in effect to `mergeSubstreamsWithParallelism(1)`.
		- #### via
		
		
		
		```
		public <T,​M> [SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​T,​[Mat](SubFlow.html "type parameter in SubFlow")> via​([Graph](../Graph.html "interface in akka.stream")<[FlowShape](../FlowShape.html "class in akka.stream")<[Out](SubFlow.html "type parameter in SubFlow"),​T>,​M> flow)
		```
		
		Transform this [`Flow`](Flow.html "class in akka.stream.javadsl") by appending the given processing steps.
		 
		
		
		
		```
		
		     +----------------------------+
		     | Resulting Flow             |
		     |                            |
		     |  +------+        +------+  |
		     |  |      |        |      |  |
		 In ~~> | this | ~Out~> | flow | ~~> T
		     |  |      |        |      |  |
		     |  +------+        +------+  |
		     +----------------------------+
		 
		```
		
		
		 The materialized value of the combined [`Flow`](Flow.html "class in akka.stream.javadsl") will be the materialized
		 value of the current flow (ignoring the other Flow\&rsquo;s value), use
		 [`viaMat`](Flow.html#viaMat(akka.stream.Graph,akka.japi.function.Function2)) if a different strategy is needed.
		- #### to
		
		
		
		```
		public [Sink](Sink.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​[Mat](SubFlow.html "type parameter in SubFlow")> to​([Graph](../Graph.html "interface in akka.stream")<[SinkShape](../SinkShape.html "class in akka.stream")<[Out](SubFlow.html "type parameter in SubFlow")>,​?> sink)
		```
		
		Connect this [`SubFlow`](SubFlow.html "class in akka.stream.javadsl") to a [`Sink`](Sink.html "class in akka.stream.javadsl"), concatenating the processing steps of both.
		 This means that all sub\-flows that result from the previous sub\-stream operator
		 will be attached to the given sink.
		 
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
		
		
		 Note that attributes set on the returned graph, including async boundaries are now for the entire graph and not
		 the `SubFlow`. for example `async` will not have any effect as the returned graph is the entire, closed graph.
		- #### map
		
		
		
		```
		public <T> [SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​T,​[Mat](SubFlow.html "type parameter in SubFlow")> map​([Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](SubFlow.html "type parameter in SubFlow"),​T> f)
		```
		
		Transform this stream by applying the given function to each of the elements
		 as they pass through this processing step.
		 
		 Adheres to the `ActorAttributes.SupervisionStrategy` attribute.
		 
		
		
		 '''Emits when''' the mapping function returns an element
		 
		
		
		 '''Backpressures when''' downstream backpressures
		 
		
		
		 '''Completes when''' upstream completes
		 
		
		
		 '''Cancels when''' downstream cancels
		- #### wireTap
		
		
		
		```
		public [SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​[Out](SubFlow.html "type parameter in SubFlow"),​[Mat](SubFlow.html "type parameter in SubFlow")> wireTap​([Procedure](../../japi/function/Procedure.html "interface in akka.japi.function")<[Out](SubFlow.html "type parameter in SubFlow")> f)
		```
		
		This is a simplified version of `wireTap(Sink)` that takes only a simple procedure.
		 Elements will be passed into this "side channel" function, and any of its results will be ignored.
		 
		 If the wire\-tap operation is slow (it backpressures), elements that would've been sent to it will be dropped instead.
		 It is similar to [`alsoTo(akka.stream.Graph<akka.stream.SinkShape<Out>, ?>)`](#alsoTo(akka.stream.Graph)) which does backpressure instead of dropping elements.
		 
		
		
		 This operation is useful for inspecting the passed through element, usually by means of side\-effecting
		 operations (such as `println`, or emitting metrics), for each element without having to modify it.
		 
		
		
		 For logging signals (elements, completion, error) consider using the [`log(java.lang.String,akka.japi.function.Function<Out,java.lang.Object>,akka.event.LoggingAdapter)`](#log(java.lang.String,akka.japi.function.Function,akka.event.LoggingAdapter)) operator instead,
		 along with appropriate `ActorAttributes.logLevels`.
		 
		
		
		 '''Emits when''' upstream emits an element; the same element will be passed to the attached function,
		 as well as to the downstream operator
		 
		
		
		 '''Backpressures when''' downstream backpressures
		 
		
		
		 '''Completes when''' upstream completes
		 
		
		
		 '''Cancels when''' downstream cancels
		- #### mapConcat
		
		
		
		```
		public <T> [SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​T,​[Mat](SubFlow.html "type parameter in SubFlow")> mapConcat​([Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](SubFlow.html "type parameter in SubFlow"),​java.lang.Iterable<T>> f)
		```
		
		Transform each input element into an `Iterable` of output elements that is
		 then flattened into the output stream.
		 
		 Make sure that the `Iterable` is immutable or at least not modified after
		 being used as an output sequence. Otherwise the stream may fail with
		 `ConcurrentModificationException` or other more subtle errors may occur.
		 
		
		
		 The returned `Iterable` MUST NOT contain `null` values,
		 as they are illegal as stream elements \- according to the Reactive Streams specification.
		 
		
		
		 '''Emits when''' the mapping function returns an element or there are still remaining elements
		 from the previously calculated collection
		 
		
		
		 '''Backpressures when''' downstream backpressures or there are still remaining elements from the
		 previously calculated collection
		 
		
		
		 '''Completes when''' upstream completes and all remaining elements has been emitted
		 
		
		
		 '''Cancels when''' downstream cancels
		- #### statefulMap
		
		
		
		```
		public <S,​T> [SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​T,​[Mat](SubFlow.html "type parameter in SubFlow")> statefulMap​([Creator](../../japi/function/Creator.html "interface in akka.japi.function")<S> create,
		                                                             [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<S,​[Out](SubFlow.html "type parameter in SubFlow"),​[Pair](../../japi/Pair.html "class in akka.japi")<S,​T>> f,
		                                                             [Function](../../japi/function/Function.html "interface in akka.japi.function")<S,​java.util.Optional<T>> onComplete)
		```
		
		Transform each stream element with the help of a state.
		 
		 The state creation function is invoked once when the stream is materialized and the returned state is passed to
		 the mapping function for mapping the first element. The mapping function returns a mapped element to emit
		 downstream and a state to pass to the next mapping function. The state can be the same for each mapping return,
		 be a new immutable state but it is also safe to use a mutable state. The returned `T` MUST NOT be `null` as it is
		 illegal as stream element \- according to the Reactive Streams specification. A `null` state is not allowed and will fail the stream.
		 
		
		
		 For stateless variant see [`<T>map(akka.japi.function.Function<Out,T>)`](#map(akka.japi.function.Function)).
		 
		
		
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
		- #### mapWithResource
		
		
		
		```
		public <R,​T> [SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​T,​[Mat](SubFlow.html "type parameter in SubFlow")> mapWithResource​(java.util.function.Supplier<R> create,
		                                                                 java.util.function.BiFunction<R,​[Out](SubFlow.html "type parameter in SubFlow"),​T> f,
		                                                                 java.util.function.Function<R,​java.util.Optional<T>> close)
		```
		
		Transform each stream element with the help of a resource.
		 
		 The resource creation function is invoked once when the stream is materialized and the returned resource is passed to
		 the mapping function for mapping the first element. The mapping function returns a mapped element to emit
		 downstream. The returned `T` MUST NOT be `null` as it is illegal as stream element \- according to the Reactive Streams specification.
		 
		
		
		 The `close` function is called only once when the upstream or downstream finishes or fails. You can do some clean\-up here,
		 and if the returned value is not empty, it will be emitted to the downstream if available, otherwise the value will be dropped.
		 
		
		
		 Early completion can be done with combination of the [`takeWhile(akka.japi.function.Predicate<Out>)`](#takeWhile(akka.japi.function.Predicate)) operator.
		 
		
		
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
		- #### statefulMapConcat
		
		
		
		```
		public <T> [SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​T,​[Mat](SubFlow.html "type parameter in SubFlow")> statefulMapConcat​([Creator](../../japi/function/Creator.html "interface in akka.japi.function")<[Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](SubFlow.html "type parameter in SubFlow"),​java.lang.Iterable<T>>> f)
		```
		
		Transform each input element into an `Iterable` of output elements that is
		 then flattened into the output stream. The transformation is meant to be stateful,
		 which is enabled by creating the transformation function anew for every materialization —
		 the returned function will typically close over mutable objects to store state between
		 invocations. For the stateless variant see [`mapConcat(akka.japi.function.Function<Out, java.lang.Iterable<T>>)`](#mapConcat(akka.japi.function.Function)).
		 
		 Make sure that the `Iterable` is immutable or at least not modified after
		 being used as an output sequence. Otherwise the stream may fail with
		 `ConcurrentModificationException` or other more subtle errors may occur.
		 
		
		
		 The returned `Iterable` MUST NOT contain `null` values,
		 as they are illegal as stream elements \- according to the Reactive Streams specification.
		 
		
		
		 Adheres to the `ActorAttributes.SupervisionStrategy` attribute.
		 
		
		
		 '''Emits when''' the mapping function returns an element or there are still remaining elements
		 from the previously calculated collection
		 
		
		
		 '''Backpressures when''' downstream backpressures or there are still remaining elements from the
		 previously calculated collection
		 
		
		
		 '''Completes when''' upstream completes and all remaining elements has been emitted
		 
		
		
		 '''Cancels when''' downstream cancels
		- #### mapAsync
		
		
		
		```
		public <T> [SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​T,​[Mat](SubFlow.html "type parameter in SubFlow")> mapAsync​(int parallelism,
		                                                  [Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](SubFlow.html "type parameter in SubFlow"),​java.util.concurrent.CompletionStage<T>> f)
		```
		
		Transform this stream by applying the given function to each of the elements
		 as they pass through this processing step. The function returns a `CompletionStage` and the
		 value of that future will be emitted downstream. The number of CompletionStages
		 that shall run in parallel is given as the first argument to mapAsync.
		 These CompletionStages may complete in any order, but the elements that
		 are emitted downstream are in the same order as received from upstream.
		 
		 If the function `f` throws an exception or if the `CompletionStage` is completed
		 with failure and the supervision decision is [`Supervision.stop()`](../Supervision.html#stop())
		 the stream will be completed with failure.
		 
		
		
		 If the function `f` throws an exception or if the `CompletionStage` is completed
		 with failure and the supervision decision is [`Supervision.resume()`](../Supervision.html#resume()) or
		 [`Supervision.restart()`](../Supervision.html#restart()) the element is dropped and the stream continues.
		 
		
		
		 If the `CompletionStage` is completed with `null`, it is ignored and the next element is processed.
		 
		
		
		 The function `f` is always invoked on the elements in the order they arrive.
		 
		
		
		 Adheres to the `ActorAttributes.SupervisionStrategy` attribute.
		 
		
		
		 '''Emits when''' the CompletionStage returned by the provided function finishes for the next element in sequence
		 
		
		
		 '''Backpressures when''' the number of CompletionStages reaches the configured parallelism and the downstream
		 backpressures or the first CompletionStage is not completed
		 
		
		
		 '''Completes when''' upstream completes and all CompletionStages has been completed and all elements has been emitted
		 
		
		
		 '''Cancels when''' downstream cancels
		 
		
		
		
		See Also:
		[`mapAsyncUnordered(int, akka.japi.function.Function<Out, java.util.concurrent.CompletionStage<T>>)`](#mapAsyncUnordered(int,akka.japi.function.Function))
		- #### mapAsyncPartitioned
		
		
		
		```
		public <T,​P> [SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​T,​[Mat](SubFlow.html "type parameter in SubFlow")> mapAsyncPartitioned​(int parallelism,
		                                                                     int perPartition,
		                                                                     [Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](SubFlow.html "type parameter in SubFlow"),​P> partitioner,
		                                                                     java.util.function.BiFunction<[Out](SubFlow.html "type parameter in SubFlow"),​P,​java.util.concurrent.CompletionStage<T>> f)
		```
		
		
		See Also:
		`akka.stream.javadsl.Flow.mapAsyncPartitioned`
		- #### mapAsyncUnordered
		
		
		
		```
		public <T> [SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​T,​[Mat](SubFlow.html "type parameter in SubFlow")> mapAsyncUnordered​(int parallelism,
		                                                           [Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](SubFlow.html "type parameter in SubFlow"),​java.util.concurrent.CompletionStage<T>> f)
		```
		
		Transform this stream by applying the given function to each of the elements
		 as they pass through this processing step. The function returns a `CompletionStage` and the
		 value of that future will be emitted downstream. The number of CompletionStages
		 that shall run in parallel is given as the first argument to mapAsyncUnordered.
		 Each processed element will be emitted downstream as soon as it is ready, i.e. it is possible
		 that the elements are not emitted downstream in the same order as received from upstream.
		 
		 If the function `f` throws an exception or if the `CompletionStage` is completed
		 with failure and the supervision decision is [`Supervision.stop()`](../Supervision.html#stop())
		 the stream will be completed with failure.
		 
		
		
		 If the function `f` throws an exception or if the `CompletionStage` is completed
		 with failure and the supervision decision is [`Supervision.resume()`](../Supervision.html#resume()) or
		 [`Supervision.restart()`](../Supervision.html#restart()) the element is dropped and the stream continues.
		 
		
		
		 The function `f` is always invoked on the elements in the order they arrive (even though the result of the CompletionStages
		 returned by `f` might be emitted in a different order).
		 
		
		
		 If the `CompletionStage` is completed with `null`, it is ignored and the next element is processed.
		 
		
		
		 Adheres to the `ActorAttributes.SupervisionStrategy` attribute.
		 
		
		
		 '''Emits when''' any of the CompletionStages returned by the provided function complete
		 
		
		
		 '''Backpressures when''' the number of CompletionStages reaches the configured parallelism and the downstream backpressures
		 
		
		
		 '''Completes when''' upstream completes and all CompletionStages have been completed and all elements has been emitted
		 
		
		
		 '''Cancels when''' downstream cancels
		 
		
		
		
		See Also:
		[`mapAsync(int, akka.japi.function.Function<Out, java.util.concurrent.CompletionStage<T>>)`](#mapAsync(int,akka.japi.function.Function))
		- #### filter
		
		
		
		```
		public [SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​[Out](SubFlow.html "type parameter in SubFlow"),​[Mat](SubFlow.html "type parameter in SubFlow")> filter​([Predicate](../../japi/function/Predicate.html "interface in akka.japi.function")<[Out](SubFlow.html "type parameter in SubFlow")> p)
		```
		
		Only pass on those elements that satisfy the given predicate.
		 
		 Adheres to the `ActorAttributes.SupervisionStrategy` attribute.
		 
		
		
		 '''Emits when''' the given predicate returns true for the element
		 
		
		
		 '''Backpressures when''' the given predicate returns true for the element and downstream backpressures
		 
		
		
		 '''Completes when''' upstream completes
		 
		
		
		 '''Cancels when''' downstream cancels
		- #### filterNot
		
		
		
		```
		public [SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​[Out](SubFlow.html "type parameter in SubFlow"),​[Mat](SubFlow.html "type parameter in SubFlow")> filterNot​([Predicate](../../japi/function/Predicate.html "interface in akka.japi.function")<[Out](SubFlow.html "type parameter in SubFlow")> p)
		```
		
		Only pass on those elements that NOT satisfy the given predicate.
		 
		 Adheres to the `ActorAttributes.SupervisionStrategy` attribute.
		 
		
		
		 '''Emits when''' the given predicate returns false for the element
		 
		
		
		 '''Backpressures when''' the given predicate returns false for the element and downstream backpressures
		 
		
		
		 '''Completes when''' upstream completes
		 
		
		
		 '''Cancels when''' downstream cancels
		- #### collect
		
		
		
		```
		public <T> [SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​T,​[Mat](SubFlow.html "type parameter in SubFlow")> collect​(scala.PartialFunction<[Out](SubFlow.html "type parameter in SubFlow"),​T> pf)
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
		public <T> [SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​T,​[Mat](SubFlow.html "type parameter in SubFlow")> collectType​(java.lang.Class<T> clazz)
		```
		
		Transform this stream by testing the type of each of the elements
		 on which the element is an instance of the provided type as they pass through this processing step.
		 Non\-matching elements are filtered out.
		 
		 Adheres to the `ActorAttributes.SupervisionStrategy` attribute.
		 
		
		
		 '''Emits when''' the element is an instance of the provided type
		 
		
		
		 '''Backpressures when''' the element is an instance of the provided type and downstream backpressures
		 
		
		
		 '''Completes when''' upstream completes
		 
		
		
		 '''Cancels when''' downstream cancels
		- #### grouped
		
		
		
		```
		public [SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​java.util.List<[Out](SubFlow.html "type parameter in SubFlow")>,​[Mat](SubFlow.html "type parameter in SubFlow")> grouped​(int n)
		```
		
		Chunk up this stream into groups of the given size, with the last group
		 possibly smaller than requested due to end\-of\-stream.
		 
		`n` must be positive, otherwise IllegalArgumentException is thrown.
		 
		
		
		 '''Emits when''' the specified number of elements has been accumulated or upstream completed
		 
		
		
		 '''Backpressures when''' a group has been assembled and downstream backpressures
		 
		
		
		 '''Completes when''' upstream completes
		 
		
		
		 '''Cancels when''' downstream cancels
		- #### groupedWeighted
		
		
		
		```
		public [SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​java.util.List<[Out](SubFlow.html "type parameter in SubFlow")>,​[Mat](SubFlow.html "type parameter in SubFlow")> groupedWeighted​(long minWeight,
		                                                                       [Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](SubFlow.html "type parameter in SubFlow"),​java.lang.Long> costFn)
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
		- #### limit
		
		
		
		```
		public [SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​[Out](SubFlow.html "type parameter in SubFlow"),​[Mat](SubFlow.html "type parameter in SubFlow")> limit​(long n)
		```
		
		Ensure stream boundedness by limiting the number of elements from upstream.
		 If the number of incoming elements exceeds max, it will signal
		 upstream failure `StreamLimitException` downstream.
		 
		 Due to input buffering some elements may have been
		 requested from upstream publishers that will then not be processed downstream
		 of this step.
		 
		
		
		 The stream will be completed without producing any elements if `n` is zero
		 or negative.
		 
		
		
		 '''Emits when''' the specified number of elements to take has not yet been reached
		 
		
		
		 '''Backpressures when''' downstream backpressures
		 
		
		
		 '''Completes when''' the defined number of elements has been taken or upstream completes
		 
		
		
		 '''Cancels when''' the defined number of elements has been taken or downstream cancels
		 
		
		
		 See also `Flow.take`, `Flow.takeWithin`, `Flow.takeWhile`
		- #### limitWeighted
		
		
		
		```
		public [SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​[Out](SubFlow.html "type parameter in SubFlow"),​[Mat](SubFlow.html "type parameter in SubFlow")> limitWeighted​(long n,
		                                                     [Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](SubFlow.html "type parameter in SubFlow"),​java.lang.Long> costFn)
		```
		
		Ensure stream boundedness by evaluating the cost of incoming elements
		 using a cost function. Exactly how many elements will be allowed to travel downstream depends on the
		 evaluated cost of each element. If the accumulated cost exceeds max, it will signal
		 upstream failure `StreamLimitException` downstream.
		 
		 Due to input buffering some elements may have been
		 requested from upstream publishers that will then not be processed downstream
		 of this step.
		 
		
		
		 The stream will be completed without producing any elements if `n` is zero
		 or negative.
		 
		
		
		 Adheres to the `ActorAttributes.SupervisionStrategy` attribute.
		 
		
		
		 '''Emits when''' the specified number of elements to take has not yet been reached
		 
		
		
		 '''Backpressures when''' downstream backpressures
		 
		
		
		 '''Completes when''' the defined number of elements has been taken or upstream completes
		 
		
		
		 '''Cancels when''' the defined number of elements has been taken or downstream cancels
		 
		
		
		 See also `Flow.take`, `Flow.takeWithin`, `Flow.takeWhile`
		- #### sliding
		
		
		
		```
		public [SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​java.util.List<[Out](SubFlow.html "type parameter in SubFlow")>,​[Mat](SubFlow.html "type parameter in SubFlow")> sliding​(int n,
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
		public int sliding$default$2()
		```
		- #### scan
		
		
		
		```
		public <T> [SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​T,​[Mat](SubFlow.html "type parameter in SubFlow")> scan​(T zero,
		                                              [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<T,​[Out](SubFlow.html "type parameter in SubFlow"),​T> f)
		```
		
		Similar to `fold` but is not a terminal operation,
		 emits its current value which starts at `zero` and then
		 applies the current and next value to the given function `f`,
		 emitting the next current value.
		 
		 If the function `f` throws an exception and the supervision decision is
		 [`Supervision.restart()`](../Supervision.html#restart()) current value starts at `zero` again
		 the stream will continue.
		 
		
		
		 Adheres to the `ActorAttributes.SupervisionStrategy` attribute.
		 
		
		
		 Note that the `zero` value must be immutable.
		 
		
		
		 '''Emits when''' the function scanning the element returns a new element
		 
		
		
		 '''Backpressures when''' downstream backpressures
		 
		
		
		 '''Completes when''' upstream completes
		 
		
		
		 '''Cancels when''' downstream cancels
		- #### scanAsync
		
		
		
		```
		public <T> [SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​T,​[Mat](SubFlow.html "type parameter in SubFlow")> scanAsync​(T zero,
		                                                   [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<T,​[Out](SubFlow.html "type parameter in SubFlow"),​java.util.concurrent.CompletionStage<T>> f)
		```
		
		Similar to `scan` but with a asynchronous function,
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
		 
		
		
		 '''Emits when''' the future returned by f `completes`
		
		
		
		 '''Backpressures when''' downstream backpressures
		 
		
		
		 '''Completes when''' upstream completes and the last future returned by `f` completes
		 
		
		
		 '''Cancels when''' downstream cancels
		 
		
		
		 See also [`scan(T, akka.japi.function.Function2<T, Out, T>)`](#scan(T,akka.japi.function.Function2))
		- #### fold
		
		
		
		```
		public <T> [SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​T,​[Mat](SubFlow.html "type parameter in SubFlow")> fold​(T zero,
		                                              [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<T,​[Out](SubFlow.html "type parameter in SubFlow"),​T> f)
		```
		
		Similar to `scan` but only emits its result when the upstream completes,
		 after which it also completes. Applies the given function `f` towards its current and next value,
		 yielding the next current value.
		 
		 Adheres to the `ActorAttributes.SupervisionStrategy` attribute.
		 
		
		
		 If the function `f` throws an exception and the supervision decision is
		 [`Supervision.restart()`](../Supervision.html#restart()) current value starts at `zero` again
		 the stream will continue.
		 
		
		
		 Note that the `zero` value must be immutable.
		 
		
		
		 '''Emits when''' upstream completes
		 
		
		
		 '''Backpressures when''' downstream backpressures
		 
		
		
		 '''Completes when''' upstream completes
		 
		
		
		 '''Cancels when''' downstream cancels
		- #### foldAsync
		
		
		
		```
		public <T> [SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​T,​[Mat](SubFlow.html "type parameter in SubFlow")> foldAsync​(T zero,
		                                                   [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<T,​[Out](SubFlow.html "type parameter in SubFlow"),​java.util.concurrent.CompletionStage<T>> f)
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
		- #### reduce
		
		
		
		```
		public [SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​[Out](SubFlow.html "type parameter in SubFlow"),​[Mat](SubFlow.html "type parameter in SubFlow")> reduce​([Function2](../../japi/function/Function2.html "interface in akka.japi.function")<[Out](SubFlow.html "type parameter in SubFlow"),​[Out](SubFlow.html "type parameter in SubFlow"),​[Out](SubFlow.html "type parameter in SubFlow")> f)
		```
		
		Similar to `fold` but uses first element as zero element.
		 Applies the given function towards its current and next value,
		 yielding the next current value.
		 
		 Adheres to the `ActorAttributes.SupervisionStrategy` attribute.
		 
		
		
		 '''Emits when''' upstream completes
		 
		
		
		 '''Backpressures when''' downstream backpressures
		 
		
		
		 '''Completes when''' upstream completes
		 
		
		
		 '''Cancels when''' downstream cancels
		- #### intersperse
		
		
		
		```
		public [SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​[Out](SubFlow.html "type parameter in SubFlow"),​[Mat](SubFlow.html "type parameter in SubFlow")> intersperse​([Out](SubFlow.html "type parameter in SubFlow") start,
		                                                   [Out](SubFlow.html "type parameter in SubFlow") inject,
		                                                   [Out](SubFlow.html "type parameter in SubFlow") end)
		```
		
		Intersperses stream with provided element, similar to how `scala.collection.immutable.List.mkString`
		 injects a separator between a List's elements.
		 
		 Additionally can inject start and end marker elements to stream.
		 
		
		
		 Examples:
		 
		
		
		
		
		
		```
		
		 Source<Integer, ?> nums = Source.from(Arrays.asList(0, 1, 2, 3));
		 nums.intersperse(",");            //   1 , 2 , 3
		 nums.intersperse("[", ",", "]");  // [ 1 , 2 , 3 ]
		 
		```
		
		
		 In case you want to only prepend or only append an element (yet still use the `intercept` feature
		 to inject a separator between elements, you may want to use the following pattern instead of the 3\-argument
		 version of intersperse (See `Source.concat` for semantics details):
		 
		
		
		
		
		
		```
		
		 Source.single(">> ").concat(flow.intersperse(","))
		 flow.intersperse(",").concat(Source.single("END"))
		 
		```
		
		
		 '''Emits when''' upstream emits (or before with the `start` element if provided)
		 
		
		
		 '''Backpressures when''' downstream backpressures
		 
		
		
		 '''Completes when''' upstream completes
		 
		
		
		 '''Cancels when''' downstream cancels
		- #### intersperse
		
		
		
		```
		public [SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​[Out](SubFlow.html "type parameter in SubFlow"),​[Mat](SubFlow.html "type parameter in SubFlow")> intersperse​([Out](SubFlow.html "type parameter in SubFlow") inject)
		```
		
		Intersperses stream with provided element, similar to how `scala.collection.immutable.List.mkString`
		 injects a separator between a List's elements.
		 
		 Additionally can inject start and end marker elements to stream.
		 
		
		
		 Examples:
		 
		
		
		
		
		
		```
		
		 Source<Integer, ?> nums = Source.from(Arrays.asList(0, 1, 2, 3));
		 nums.intersperse(",");            //   1 , 2 , 3
		 nums.intersperse("[", ",", "]");  // [ 1 , 2 , 3 ]
		 
		```
		
		
		 '''Emits when''' upstream emits (or before with the `start` element if provided)
		 
		
		
		 '''Backpressures when''' downstream backpressures
		 
		
		
		 '''Completes when''' upstream completes
		 
		
		
		 '''Cancels when''' downstream cancels
		- #### groupedWithin
		
		
		
		```
		public [SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​java.util.List<[Out](SubFlow.html "type parameter in SubFlow")>,​[Mat](SubFlow.html "type parameter in SubFlow")> groupedWithin​(int maxNumber,
		                                                                     java.time.Duration duration)
		```
		
		Chunk up this stream into groups of elements received within a time window,
		 or limited by the given number of elements, whatever happens first.
		 Empty groups will not be emitted if no elements are received from upstream.
		 The last group before end\-of\-stream will contain the buffered elements
		 since the previously emitted group.
		 
		 '''Emits when''' the configured time elapses since the last group has been emitted or `n` elements is buffered
		 
		
		
		 '''Backpressures when''' downstream backpressures, and there are `n+1` buffered elements
		 
		
		
		 '''Completes when''' upstream completes (emits last group)
		 
		
		
		 '''Cancels when''' downstream completes
		 
		
		
		`maxNumber` must be positive, and `duration` must be greater than 0 seconds, otherwise
		 IllegalArgumentException is thrown.
		- #### groupedWeightedWithin
		
		
		
		```
		public [SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​java.util.List<[Out](SubFlow.html "type parameter in SubFlow")>,​[Mat](SubFlow.html "type parameter in SubFlow")> groupedWeightedWithin​(long maxWeight,
		                                                                             [Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](SubFlow.html "type parameter in SubFlow"),​java.lang.Long> costFn,
		                                                                             java.time.Duration duration)
		```
		
		Chunk up this stream into groups of elements received within a time window,
		 or limited by the weight of the elements, whatever happens first.
		 Empty groups will not be emitted if no elements are received from upstream.
		 The last group before end\-of\-stream will contain the buffered elements
		 since the previously emitted group.
		 
		 '''Emits when''' the configured time elapses since the last group has been emitted or weight limit reached
		 
		
		
		 '''Backpressures when''' downstream backpressures, and buffered group (\+ pending element) weighs more than `maxWeight`
		
		
		
		 '''Completes when''' upstream completes (emits last group)
		 
		
		
		 '''Cancels when''' downstream completes
		 
		
		
		`maxWeight` must be positive, and `duration` must be greater than 0 seconds, otherwise
		 IllegalArgumentException is thrown.
		- #### groupedWeightedWithin
		
		
		
		```
		public [SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​java.util.List<[Out](SubFlow.html "type parameter in SubFlow")>,​[Mat](SubFlow.html "type parameter in SubFlow")> groupedWeightedWithin​(long maxWeight,
		                                                                             int maxNumber,
		                                                                             [Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](SubFlow.html "type parameter in SubFlow"),​java.lang.Long> costFn,
		                                                                             java.time.Duration duration)
		```
		
		Chunk up this stream into groups of elements received within a time window,
		 or limited by the weight and number of the elements, whatever happens first.
		 Empty groups will not be emitted if no elements are received from upstream.
		 The last group before end\-of\-stream will contain the buffered elements
		 since the previously emitted group.
		 
		 '''Emits when''' the configured time elapses since the last group has been emitted or weight limit reached
		 
		
		
		 '''Backpressures when''' downstream backpressures, and buffered group (\+ pending element) weighs more than
		 `maxWeight` or has more than `maxNumber` elements
		 
		
		
		 '''Completes when''' upstream completes (emits last group)
		 
		
		
		 '''Cancels when''' downstream completes
		 
		
		
		`maxWeight` must be positive, `maxNumber` must be positive, and `duration` must be greater than 0 seconds,
		 otherwise IllegalArgumentException is thrown.
		- #### delay
		
		
		
		```
		public [SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​[Out](SubFlow.html "type parameter in SubFlow"),​[Mat](SubFlow.html "type parameter in SubFlow")> delay​(java.time.Duration of,
		                                             [DelayOverflowStrategy](../DelayOverflowStrategy.html "class in akka.stream") strategy)
		```
		
		Shifts elements emission in time by a specified amount. It allows to store elements
		 in internal buffer while waiting for next element to be emitted. Depending on the defined
		 [`DelayOverflowStrategy`](../DelayOverflowStrategy.html "class in akka.stream") it might drop elements or backpressure the upstream if
		 there is no space available in the buffer.
		 
		 Delay precision is 10ms to avoid unnecessary timer scheduling cycles
		 
		
		
		 Internal buffer has default capacity 16\. You can set buffer size by calling `withAttributes(inputBuffer)`
		
		
		
		 '''Emits when''' there is a pending element in the buffer and configured time for this element elapsed
		 \* EmitEarly \- strategy do not wait to emit element if buffer is full
		 
		
		
		 '''Backpressures when''' depending on OverflowStrategy
		 \* Backpressure \- backpressures when buffer is full
		 \* DropHead, DropTail, DropBuffer \- never backpressures
		 \* Fail \- fails the stream if buffer gets full
		 
		
		
		 '''Completes when''' upstream completes and buffered elements has been drained
		 
		
		
		 '''Cancels when''' downstream cancels
		 
		
		
		
		Parameters:
		`of` \- time to shift all messages
		`strategy` \- Strategy that is used when incoming elements cannot fit inside the buffer
		- #### delayWith
		
		
		
		```
		public [SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​[Out](SubFlow.html "type parameter in SubFlow"),​[Mat](SubFlow.html "type parameter in SubFlow")> delayWith​(java.util.function.Supplier<[DelayStrategy](DelayStrategy.html "interface in akka.stream.javadsl")<[Out](SubFlow.html "type parameter in SubFlow")>> delayStrategySupplier,
		                                                 [DelayOverflowStrategy](../DelayOverflowStrategy.html "class in akka.stream") overFlowStrategy)
		```
		
		Shifts elements emission in time by an amount individually determined through delay strategy a specified amount.
		 It allows to store elements in internal buffer while waiting for next element to be emitted. Depending on the defined
		 [`DelayOverflowStrategy`](../DelayOverflowStrategy.html "class in akka.stream") it might drop elements or backpressure the upstream if
		 there is no space available in the buffer.
		 
		 It determines delay for each ongoing element invoking `DelayStrategy.nextDelay(elem: T): FiniteDuration`.
		 
		
		
		 Note that elements are not re\-ordered: if an element is given a delay much shorter than its predecessor,
		 it will still have to wait for the preceding element before being emitted.
		 It is also important to notice that [`DelayStrategy`](DelayStrategy.html "interface in akka.stream.javadsl") can be stateful.
		 
		
		
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
		`delayStrategySupplier` \- creates new [`DelayStrategy`](DelayStrategy.html "interface in akka.stream.javadsl") object for each materialization
		`overFlowStrategy` \- Strategy that is used when incoming elements cannot fit inside the buffer
		- #### drop
		
		
		
		```
		public [SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​[Out](SubFlow.html "type parameter in SubFlow"),​[Mat](SubFlow.html "type parameter in SubFlow")> drop​(long n)
		```
		
		Discard the given number of elements at the beginning of the stream.
		 No elements will be dropped if `n` is zero or negative.
		 
		 '''Emits when''' the specified number of elements has been dropped already
		 
		
		
		 '''Backpressures when''' the specified number of elements has been dropped and downstream backpressures
		 
		
		
		 '''Completes when''' upstream completes
		 
		
		
		 '''Cancels when''' downstream cancels
		- #### dropWithin
		
		
		
		```
		public [SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​[Out](SubFlow.html "type parameter in SubFlow"),​[Mat](SubFlow.html "type parameter in SubFlow")> dropWithin​(java.time.Duration duration)
		```
		
		Discard the elements received within the given duration at beginning of the stream.
		 
		 '''Emits when''' the specified time elapsed and a new upstream element arrives
		 
		
		
		 '''Backpressures when''' downstream backpressures
		 
		
		
		 '''Completes when''' upstream completes
		 
		
		
		 '''Cancels when''' downstream cancels
		- #### takeWhile
		
		
		
		```
		public [SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​[Out](SubFlow.html "type parameter in SubFlow"),​[Mat](SubFlow.html "type parameter in SubFlow")> takeWhile​([Predicate](../../japi/function/Predicate.html "interface in akka.japi.function")<[Out](SubFlow.html "type parameter in SubFlow")> p)
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
		- #### takeWhile
		
		
		
		```
		public [SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​[Out](SubFlow.html "type parameter in SubFlow"),​[Mat](SubFlow.html "type parameter in SubFlow")> takeWhile​([Predicate](../../japi/function/Predicate.html "interface in akka.japi.function")<[Out](SubFlow.html "type parameter in SubFlow")> p,
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
		- #### dropWhile
		
		
		
		```
		public [SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​[Out](SubFlow.html "type parameter in SubFlow"),​[Mat](SubFlow.html "type parameter in SubFlow")> dropWhile​([Predicate](../../japi/function/Predicate.html "interface in akka.japi.function")<[Out](SubFlow.html "type parameter in SubFlow")> p)
		```
		
		Discard elements at the beginning of the stream while predicate is true.
		 All elements will be taken after predicate returns false first time.
		 
		 Adheres to the `ActorAttributes.SupervisionStrategy` attribute.
		 
		
		
		 '''Emits when''' predicate returned false and for all following stream elements
		 
		
		
		 '''Backpressures when''' predicate returned false and downstream backpressures
		 
		
		
		 '''Completes when''' upstream completes
		 
		
		
		 '''Cancels when''' downstream cancels
		- #### recover
		
		
		
		```
		public [SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​[Out](SubFlow.html "type parameter in SubFlow"),​[Mat](SubFlow.html "type parameter in SubFlow")> recover​(scala.PartialFunction<java.lang.Throwable,​[Out](SubFlow.html "type parameter in SubFlow")> pf)
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
		public [SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​[Out](SubFlow.html "type parameter in SubFlow"),​[Mat](SubFlow.html "type parameter in SubFlow")> recoverWith​(scala.PartialFunction<java.lang.Throwable,​[Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<[Out](SubFlow.html "type parameter in SubFlow")>,​[NotUsed](../../NotUsed.html "class in akka")>> pf)
		```
		
		RecoverWith allows to switch to alternative Source on flow failure. It will stay in effect after
		 a failure has been recovered so that each time there is a failure it is fed into the `pf` and a new
		 Source may be materialized.
		 
		 Since the underlying failure signal onError arrives out\-of\-band, it might jump over existing elements.
		 This operator can recover the failure signal, but not the skipped elements, which will be dropped.
		 
		
		
		 Throwing an exception inside recoverWith \_will\_ be logged on ERROR level automatically.
		 
		
		
		 '''Emits when''' element is available from the upstream or upstream is failed and element is available
		 from alternative Source
		 
		
		
		 '''Backpressures when''' downstream backpressures
		 
		
		
		 '''Completes when''' upstream completes or upstream failed with exception pf can handle
		 
		
		
		 '''Cancels when''' downstream cancels
		- #### onErrorComplete
		
		
		
		```
		public [SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​[Out](SubFlow.html "type parameter in SubFlow"),​[Mat](SubFlow.html "type parameter in SubFlow")> onErrorComplete()
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
		public [SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​[Out](SubFlow.html "type parameter in SubFlow"),​[Mat](SubFlow.html "type parameter in SubFlow")> onErrorComplete​(java.lang.Class<? extends java.lang.Throwable> clazz)
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
		public [SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​[Out](SubFlow.html "type parameter in SubFlow"),​[Mat](SubFlow.html "type parameter in SubFlow")> onErrorComplete​(java.util.function.Predicate<? super java.lang.Throwable> predicate)
		```
		
		onErrorComplete allows to complete the stream when an upstream error occurs.
		 
		 Since the underlying failure signal onError arrives out\-of\-band, it might jump over existing elements.
		 This operator can recover the failure signal, but not the skipped elements, which will be dropped.
		 
		
		
		 '''Emits when''' element is available from the upstream
		 
		
		
		 '''Backpressures when''' downstream backpressures
		 
		
		
		 '''Completes when''' upstream completes or failed with predicate return ture
		 
		
		
		 '''Cancels when''' downstream cancels
		- #### recoverWithRetries
		
		
		
		```
		public [SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​[Out](SubFlow.html "type parameter in SubFlow"),​[Mat](SubFlow.html "type parameter in SubFlow")> recoverWithRetries​(int attempts,
		                                                          scala.PartialFunction<java.lang.Throwable,​[Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<[Out](SubFlow.html "type parameter in SubFlow")>,​[NotUsed](../../NotUsed.html "class in akka")>> pf)
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
		- #### mapError
		
		
		
		```
		public [SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​[Out](SubFlow.html "type parameter in SubFlow"),​[Mat](SubFlow.html "type parameter in SubFlow")> mapError​(scala.PartialFunction<java.lang.Throwable,​java.lang.Throwable> pf)
		```
		
		While similar to [`recover(scala.PartialFunction<java.lang.Throwable,Out>)`](#recover(scala.PartialFunction)) this operator can be used to transform an error signal to a different one \*without\* logging
		 it as an error in the process. So in that sense it is NOT exactly equivalent to `recover(t => throw t2)` since recover
		 would log the `t2` error.
		 
		 Since the underlying failure signal onError arrives out\-of\-band, it might jump over existing elements.
		 This operator can recover the failure signal, but not the skipped elements, which will be dropped.
		 
		
		
		 Similarly to [`recover(scala.PartialFunction<java.lang.Throwable,Out>)`](#recover(scala.PartialFunction)) throwing an exception inside `mapError` \_will\_ be logged.
		 
		
		
		 '''Emits when''' element is available from the upstream or upstream is failed and pf returns an element
		 
		
		
		 '''Backpressures when''' downstream backpressures
		 
		
		
		 '''Completes when''' upstream completes or upstream failed with exception pf can handle
		 
		
		
		 '''Cancels when''' downstream cancels
		- #### mapError
		
		
		
		```
		public <E extends java.lang.Throwable> [SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​[Out](SubFlow.html "type parameter in SubFlow"),​[Mat](SubFlow.html "type parameter in SubFlow")> mapError​(java.lang.Class<E> clazz,
		                                                                                [Function](../../japi/function/Function.html "interface in akka.japi.function")<E,​java.lang.Throwable> f)
		```
		
		While similar to [`recover(scala.PartialFunction<java.lang.Throwable,Out>)`](#recover(scala.PartialFunction)) this operator can be used to transform an error signal to a different one \*without\* logging
		 it as an error in the process. So in that sense it is NOT exactly equivalent to `recover(t => throw t2)` since recover
		 would log the `t2` error.
		 
		 Since the underlying failure signal onError arrives out\-of\-band, it might jump over existing elements.
		 This operator can recover the failure signal, but not the skipped elements, which will be dropped.
		 
		
		
		 Similarly to [`recover(scala.PartialFunction<java.lang.Throwable,Out>)`](#recover(scala.PartialFunction)) throwing an exception inside `mapError` \_will\_ be logged.
		 
		
		
		 '''Emits when''' element is available from the upstream or upstream is failed and pf returns an element
		 
		
		
		 '''Backpressures when''' downstream backpressures
		 
		
		
		 '''Completes when''' upstream completes or upstream failed with exception pf can handle
		 
		
		
		 '''Cancels when''' downstream cancels
		- #### take
		
		
		
		```
		public [SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​[Out](SubFlow.html "type parameter in SubFlow"),​[Mat](SubFlow.html "type parameter in SubFlow")> take​(long n)
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
		- #### takeWithin
		
		
		
		```
		public [SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​[Out](SubFlow.html "type parameter in SubFlow"),​[Mat](SubFlow.html "type parameter in SubFlow")> takeWithin​(java.time.Duration duration)
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
		- #### conflateWithSeed
		
		
		
		```
		public <S> [SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​S,​[Mat](SubFlow.html "type parameter in SubFlow")> conflateWithSeed​([Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](SubFlow.html "type parameter in SubFlow"),​S> seed,
		                                                          [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<S,​[Out](SubFlow.html "type parameter in SubFlow"),​S> aggregate)
		```
		
		Allows a faster upstream to progress independently of a slower subscriber by conflating elements into a summary
		 until the subscriber is ready to accept them. For example a conflate step might average incoming numbers if the
		 upstream publisher is faster.
		 
		 This version of conflate allows to derive a seed from the first element and change the aggregated type to be
		 different than the input type. See `Flow.conflate` for a simpler version that does not change types.
		 
		
		
		 This element only rolls up elements if the upstream is faster, but if the downstream is faster it will not
		 duplicate elements.
		 
		
		
		 Adheres to the `ActorAttributes.SupervisionStrategy` attribute.
		 
		
		
		 '''Emits when''' downstream stops backpressuring and there is a conflated element available
		 
		
		
		 '''Backpressures when''' never
		 
		
		
		 '''Completes when''' upstream completes
		 
		
		
		 '''Cancels when''' downstream cancels
		 
		
		
		 see also `SubFlow.conflate` `SubFlow.batch` `SubFlow.batchWeighted`
		
		
		
		
		Parameters:
		`seed` \- Provides the first state for a conflated value using the first unconsumed element as a start
		`aggregate` \- Takes the currently aggregated value and the current pending element to produce a new aggregate
		- #### conflate
		
		
		
		```
		public [SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​[Out](SubFlow.html "type parameter in SubFlow"),​[Mat](SubFlow.html "type parameter in SubFlow")> conflate​([Function2](../../japi/function/Function2.html "interface in akka.japi.function")<[Out](SubFlow.html "type parameter in SubFlow"),​[Out](SubFlow.html "type parameter in SubFlow"),​[Out](SubFlow.html "type parameter in SubFlow")> aggregate)
		```
		
		Allows a faster upstream to progress independently of a slower subscriber by conflating elements into a summary
		 until the subscriber is ready to accept them. For example a conflate step might average incoming numbers if the
		 upstream publisher is faster.
		 
		 This version of conflate does not change the output type of the stream. See `SubFlow.conflateWithSeed` for a
		 more flexible version that can take a seed function and transform elements while rolling up.
		 
		
		
		 This element only rolls up elements if the upstream is faster, but if the downstream is faster it will not
		 duplicate elements.
		 
		
		
		 Adheres to the `ActorAttributes.SupervisionStrategy` attribute.
		 
		
		
		 '''Emits when''' downstream stops backpressuring and there is a conflated element available
		 
		
		
		 '''Backpressures when''' never
		 
		
		
		 '''Completes when''' upstream completes
		 
		
		
		 '''Cancels when''' downstream cancels
		 
		
		
		 see also `SubFlow.conflateWithSeed` `SubFlow.batch` `SubFlow.batchWeighted`
		
		
		
		
		Parameters:
		`aggregate` \- Takes the currently aggregated value and the current pending element to produce a new aggregate
		- #### batch
		
		
		
		```
		public <S> [SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​S,​[Mat](SubFlow.html "type parameter in SubFlow")> batch​(long max,
		                                               [Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](SubFlow.html "type parameter in SubFlow"),​S> seed,
		                                               [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<S,​[Out](SubFlow.html "type parameter in SubFlow"),​S> aggregate)
		```
		
		Allows a faster upstream to progress independently of a slower subscriber by aggregating elements into batches
		 until the subscriber is ready to accept them. For example a batch step might store received elements in
		 an array up to the allowed max limit if the upstream publisher is faster.
		 
		 This element only rolls up elements if the upstream is faster, but if the downstream is faster it will not
		 duplicate elements.
		 
		
		
		 Adheres to the `ActorAttributes.SupervisionStrategy` attribute.
		 
		
		
		 '''Emits when''' downstream stops backpressuring and there is an aggregated element available
		 
		
		
		 '''Backpressures when''' there are `max` batched elements and 1 pending element and downstream backpressures
		 
		
		
		 '''Completes when''' upstream completes and there is no batched/pending element waiting
		 
		
		
		 '''Cancels when''' downstream cancels
		 
		
		
		 See also `SubFlow.conflate`, `SubFlow.batchWeighted`
		
		
		
		
		Parameters:
		`max` \- maximum number of elements to batch before backpressuring upstream (must be positive non\-zero)
		`seed` \- Provides the first state for a batched value using the first unconsumed element as a start
		`aggregate` \- Takes the currently batched value and the current pending element to produce a new aggregate
		- #### batchWeighted
		
		
		
		```
		public <S> [SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​S,​[Mat](SubFlow.html "type parameter in SubFlow")> batchWeighted​(long max,
		                                                       [Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](SubFlow.html "type parameter in SubFlow"),​java.lang.Long> costFn,
		                                                       [Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](SubFlow.html "type parameter in SubFlow"),​S> seed,
		                                                       [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<S,​[Out](SubFlow.html "type parameter in SubFlow"),​S> aggregate)
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
		 
		
		
		 See also `SubFlow.conflate`, `SubFlow.batch`
		
		
		
		
		Parameters:
		`max` \- maximum weight of elements to batch before backpressuring upstream (must be positive non\-zero)
		`costFn` \- a function to compute a single element weight
		`seed` \- Provides the first state for a batched value using the first unconsumed element as a start
		`aggregate` \- Takes the currently batched value and the current pending element to produce a new batch
		- #### expand
		
		
		
		```
		public <U> [SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​U,​[Mat](SubFlow.html "type parameter in SubFlow")> expand​([Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](SubFlow.html "type parameter in SubFlow"),​java.util.Iterator<U>> expander)
		```
		
		Allows a faster downstream to progress independently of a slower upstream by extrapolating elements from an older
		 element until new element comes from the upstream. For example an expand step might repeat the last element for
		 the subscriber until it receives an update from upstream.
		 
		 This element will never "drop" upstream elements as all elements go through at least one extrapolation step.
		 This means that if the upstream is actually faster than the upstream it will be backpressured by the downstream
		 subscriber.
		 
		
		
		 Expand does not support [`Supervision.restart()`](../Supervision.html#restart()) and [`Supervision.resume()`](../Supervision.html#resume()).
		 Exceptions from the `expander` function will complete the stream with failure.
		 
		
		
		 See also [`extrapolate(akka.japi.function.Function<Out, java.util.Iterator<Out>>)`](#extrapolate(akka.japi.function.Function)) for a version that always preserves the original element and allows for an initial "startup" element.
		 
		
		
		 '''Emits when''' downstream stops backpressuring
		 
		
		
		 '''Backpressures when''' downstream backpressures or iterator runs empty
		 
		
		
		 '''Completes when''' upstream completes
		 
		
		
		 '''Cancels when''' downstream cancels
		 
		
		
		
		Parameters:
		`expander` \- Takes the current extrapolation state to produce an output element and the next extrapolation
		 state.
		- #### extrapolate
		
		
		
		```
		public [SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​[Out](SubFlow.html "type parameter in SubFlow"),​[Mat](SubFlow.html "type parameter in SubFlow")> extrapolate​([Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](SubFlow.html "type parameter in SubFlow"),​java.util.Iterator<[Out](SubFlow.html "type parameter in SubFlow")>> extrapolator)
		```
		
		Allows a faster downstream to progress independent of a slower upstream.
		 
		 This is achieved by introducing "extrapolated" elements \- based on those from upstream \- whenever downstream
		 signals demand.
		 
		
		
		 Extrapolate does not support [`Supervision.restart()`](../Supervision.html#restart()) and [`Supervision.resume()`](../Supervision.html#resume()).
		 Exceptions from the `extrapolate` function will complete the stream with failure.
		 
		
		
		 See also [`expand(akka.japi.function.Function<Out, java.util.Iterator<U>>)`](#expand(akka.japi.function.Function)) for a version that can overwrite the original element.
		 
		
		
		 '''Emits when''' downstream stops backpressuring, AND EITHER upstream emits OR initial element is present OR
		 `extrapolate` is non\-empty and applicable
		 
		
		
		 '''Backpressures when''' downstream backpressures or current `extrapolate` runs empty
		 
		
		
		 '''Completes when''' upstream completes and current `extrapolate` runs empty
		 
		
		
		 '''Cancels when''' downstream cancels
		 
		
		
		
		Parameters:
		`extrapolator` \- takes the current upstream element and provides a sequence of "extrapolated" elements based
		 on the original, to be emitted in case downstream signals demand.
		See Also:
		[`expand(akka.japi.function.Function<Out, java.util.Iterator<U>>)`](#expand(akka.japi.function.Function))
		- #### extrapolate
		
		
		
		```
		public [SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​[Out](SubFlow.html "type parameter in SubFlow"),​[Mat](SubFlow.html "type parameter in SubFlow")> extrapolate​([Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](SubFlow.html "type parameter in SubFlow"),​java.util.Iterator<[Out](SubFlow.html "type parameter in SubFlow")>> extrapolator,
		                                                   [Out](SubFlow.html "type parameter in SubFlow") initial)
		```
		
		Allows a faster downstream to progress independent of a slower upstream.
		 
		 This is achieved by introducing "extrapolated" elements \- based on those from upstream \- whenever downstream
		 signals demand.
		 
		
		
		 Extrapolate does not support [`Supervision.restart()`](../Supervision.html#restart()) and [`Supervision.resume()`](../Supervision.html#resume()).
		 Exceptions from the `extrapolate` function will complete the stream with failure.
		 
		
		
		 See also [`expand(akka.japi.function.Function<Out, java.util.Iterator<U>>)`](#expand(akka.japi.function.Function)) for a version that can overwrite the original element.
		 
		
		
		 '''Emits when''' downstream stops backpressuring, AND EITHER upstream emits OR initial element is present OR
		 `extrapolate` is non\-empty and applicable
		 
		
		
		 '''Backpressures when''' downstream backpressures or current `extrapolate` runs empty
		 
		
		
		 '''Completes when''' upstream completes and current `extrapolate` runs empty
		 
		
		
		 '''Cancels when''' downstream cancels
		 
		
		
		
		Parameters:
		`extrapolator` \- takes the current upstream element and provides a sequence of "extrapolated" elements based
		 on the original, to be emitted in case downstream signals demand.
		`initial` \- the initial element to be emitted, in case upstream is able to stall the entire stream.
		See Also:
		[`expand(akka.japi.function.Function<Out, java.util.Iterator<U>>)`](#expand(akka.japi.function.Function))
		- #### buffer
		
		
		
		```
		public [SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​[Out](SubFlow.html "type parameter in SubFlow"),​[Mat](SubFlow.html "type parameter in SubFlow")> buffer​(int size,
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
		
		 '''Completes when''' upstream completes and buffered elements has been drained
		 
		
		
		 '''Cancels when''' downstream cancels
		 
		
		
		
		Parameters:
		`size` \- The size of the buffer in element count
		`overflowStrategy` \- Strategy that is used when incoming elements cannot fit inside the buffer
		- #### prefixAndTail
		
		
		
		```
		public [SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​[Pair](../../japi/Pair.html "class in akka.japi")<java.util.List<[Out](SubFlow.html "type parameter in SubFlow")>,​[Source](Source.html "class in akka.stream.javadsl")<[Out](SubFlow.html "type parameter in SubFlow"),​[NotUsed](../../NotUsed.html "class in akka")>>,​[Mat](SubFlow.html "type parameter in SubFlow")> prefixAndTail​(int n)
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
		 
		
		
		 '''Completes when''' prefix elements has been consumed and substream has been consumed
		 
		
		
		 '''Cancels when''' downstream cancels or substream cancels
		- #### flatMapPrefix
		
		
		
		```
		public <Out2,​Mat2> [SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​Out2,​[Mat](SubFlow.html "type parameter in SubFlow")> flatMapPrefix​(int n,
		                                                                        [Function](../../japi/function/Function.html "interface in akka.japi.function")<java.lang.Iterable<[Out](SubFlow.html "type parameter in SubFlow")>,​[Flow](Flow.html "class in akka.stream.javadsl")<[Out](SubFlow.html "type parameter in SubFlow"),​Out2,​Mat2>> f)
		```
		
		Takes up to `n` elements from the stream (less than `n` only if the upstream completes before emitting `n` elements),
		 then apply `f` on these elements in order to obtain a flow, this flow is then materialized and the rest of the input is processed by this flow (similar to via).
		 This method returns a flow consuming the rest of the stream producing the materialized flow's output.
		 
		 '''Emits when''' the materialized flow emits.
		 Notice the first `n` elements are buffered internally before materializing the flow and connecting it to the rest of the upstream \- producing elements at its own discretion (might 'swallow' or multiply elements).
		 
		
		
		 '''Backpressures when''' downstream backpressures
		 
		
		
		 '''Completes when''' the materialized flow completes.
		 If upstream completes before producing `n` elements, `f` will be applied with the provided elements,
		 the resulting flow will be materialized and signalled for upstream completion, it can then complete or continue to emit elements at its own discretion.
		 
		
		
		 '''Cancels when''' the materialized flow cancels.
		 Notice that when downstream cancels prior to prefix completion, the cancellation cause is stashed until prefix completion (or upstream completion) and then handed to the materialized flow.
		 
		
		
		
		Parameters:
		`n` \- the number of elements to accumulate before materializing the downstream flow.
		`f` \- a function that produces the downstream flow based on the upstream's prefix.
		- #### flatMapConcat
		
		
		
		```
		public <T,​M> [SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​T,​[Mat](SubFlow.html "type parameter in SubFlow")> flatMapConcat​([Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](SubFlow.html "type parameter in SubFlow"),​? extends [Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<T>,​M>> f)
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
		public <T,​M> [SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​T,​[Mat](SubFlow.html "type parameter in SubFlow")> flatMapMerge​(int breadth,
		                                                              [Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](SubFlow.html "type parameter in SubFlow"),​? extends [Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<T>,​M>> f)
		```
		
		Transform each input element into a `Source` of output elements that is
		 then flattened into the output stream by merging, where at most `breadth`
		 substreams are being consumed at any given time.
		 
		 '''Emits when''' a currently consumed substream has an element available
		 
		
		
		 '''Backpressures when''' downstream backpressures
		 
		
		
		 '''Completes when''' upstream completes and all consumed substreams complete
		 
		
		
		 '''Cancels when''' downstream cancels
		- #### concat
		
		
		
		```
		public <M> [SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​[Out](SubFlow.html "type parameter in SubFlow"),​[Mat](SubFlow.html "type parameter in SubFlow")> concat​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<[Out](SubFlow.html "type parameter in SubFlow")>,​M> that)
		```
		
		Concatenate the given [`Source`](Source.html "class in akka.stream.javadsl") to this [`Flow`](Flow.html "class in akka.stream.javadsl"), meaning that once this
		 Flow\&rsquo;s input is exhausted and all result elements have been generated,
		 the Source\&rsquo;s elements will be produced.
		 
		 Note that the [`Source`](Source.html "class in akka.stream.javadsl") is materialized together with this Flow and is "detached" meaning it will
		 in effect behave as a one element buffer in front of both the sources, that eagerly demands an element on start
		 (so it can not be combined with `Source.lazy` to defer materialization of `that`).
		 
		
		
		 The second source is then kept from producing elements by asserting back\-pressure until its time comes.
		 
		
		
		 When needing a concat operator that is not detached use [`concatLazy(akka.stream.Graph<akka.stream.SourceShape<Out>, M>)`](#concatLazy(akka.stream.Graph))
		
		
		
		 '''Emits when''' element is available from current stream or from the given [`Source`](Source.html "class in akka.stream.javadsl") when current is completed
		 
		
		
		 '''Backpressures when''' downstream backpressures
		 
		
		
		 '''Completes when''' given [`Source`](Source.html "class in akka.stream.javadsl") completes
		 
		
		
		 '''Cancels when''' downstream cancels
		- #### concatLazy
		
		
		
		```
		public <M> [SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​[Out](SubFlow.html "type parameter in SubFlow"),​[Mat](SubFlow.html "type parameter in SubFlow")> concatLazy​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<[Out](SubFlow.html "type parameter in SubFlow")>,​M> that)
		```
		
		Concatenate the given [`Source`](Source.html "class in akka.stream.javadsl") to this [`Flow`](Flow.html "class in akka.stream.javadsl"), meaning that once this
		 Flow\&rsquo;s input is exhausted and all result elements have been generated,
		 the Source\&rsquo;s elements will be produced.
		 
		 Note that the [`Source`](Source.html "class in akka.stream.javadsl") is materialized together with this Flow. If `lazy` materialization is what is needed
		 the operator can be combined with for example `Source.lazySource` to defer materialization of `that` until the
		 time when this source completes.
		 
		
		
		 The second source is then kept from producing elements by asserting back\-pressure until its time comes.
		 
		
		
		 For a concat operator that is detached, use [`concat(akka.stream.Graph<akka.stream.SourceShape<Out>, M>)`](#concat(akka.stream.Graph))
		
		
		
		 If this [`Flow`](Flow.html "class in akka.stream.javadsl") gets upstream error \- no elements from the given [`Source`](Source.html "class in akka.stream.javadsl") will be pulled.
		 
		
		
		 '''Emits when''' element is available from current stream or from the given [`Source`](Source.html "class in akka.stream.javadsl") when current is completed
		 
		
		
		 '''Backpressures when''' downstream backpressures
		 
		
		
		 '''Completes when''' given [`Source`](Source.html "class in akka.stream.javadsl") completes
		 
		
		
		 '''Cancels when''' downstream cancels
		- #### concatAllLazy
		
		
		
		```
		public [SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​[Out](SubFlow.html "type parameter in SubFlow"),​[Mat](SubFlow.html "type parameter in SubFlow")> concatAllLazy​(scala.collection.immutable.Seq<[Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<[Out](SubFlow.html "type parameter in SubFlow")>,​?>> those)
		```
		
		Concatenate the given [`Source`](Source.html "class in akka.stream.javadsl")s to this [`Flow`](Flow.html "class in akka.stream.javadsl"), meaning that once this
		 Flow\&rsquo;s input is exhausted and all result elements have been generated,
		 the Source\&rsquo;s elements will be produced.
		 
		 Note that the [`Source`](Source.html "class in akka.stream.javadsl")s are materialized together with this Flow. If `lazy` materialization is what is needed
		 the operator can be combined with for example `Source.lazySource` to defer materialization of `that` until the
		 time when this source completes.
		 
		
		
		 The second source is then kept from producing elements by asserting back\-pressure until its time comes.
		 
		
		
		 For a concat operator that is detached, use [`concat(akka.stream.Graph<akka.stream.SourceShape<Out>, M>)`](#concat(akka.stream.Graph))
		
		
		
		 If this [`Flow`](Flow.html "class in akka.stream.javadsl") gets upstream error \- no elements from the given [`Source`](Source.html "class in akka.stream.javadsl")s will be pulled.
		 
		
		
		 '''Emits when''' element is available from current stream or from the given [`Source`](Source.html "class in akka.stream.javadsl")s when current is completed
		 
		
		
		 '''Backpressures when''' downstream backpressures
		 
		
		
		 '''Completes when''' given all those [`Source`](Source.html "class in akka.stream.javadsl")s completes
		 
		
		
		 '''Cancels when''' downstream cancels
		- #### prepend
		
		
		
		```
		public <M> [SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​[Out](SubFlow.html "type parameter in SubFlow"),​[Mat](SubFlow.html "type parameter in SubFlow")> prepend​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<[Out](SubFlow.html "type parameter in SubFlow")>,​M> that)
		```
		
		Prepend the given [`Source`](Source.html "class in akka.stream.javadsl") to this [`Flow`](Flow.html "class in akka.stream.javadsl"), meaning that before elements
		 are generated from this Flow, the Source's elements will be produced until it
		 is exhausted, at which point Flow elements will start being produced.
		 
		 Note that the [`Source`](Source.html "class in akka.stream.javadsl") is materialized together with this Flow and is "detached" meaning
		 in effect behave as a one element buffer in front of both the sources, that eagerly demands an element on start
		 (so it can not be combined with `Source.lazy` to defer materialization of `that`).
		 
		
		
		 This flow will then be kept from producing elements by asserting back\-pressure until its time comes.
		 
		
		
		 When needing a prepend operator that is not detached use [`prependLazy(akka.stream.Graph<akka.stream.SourceShape<Out>, M>)`](#prependLazy(akka.stream.Graph))
		
		
		
		 '''Emits when''' element is available from the given [`Source`](Source.html "class in akka.stream.javadsl") or from current stream when the [`Source`](Source.html "class in akka.stream.javadsl") is completed
		 
		
		
		 '''Backpressures when''' downstream backpressures
		 
		
		
		 '''Completes when''' this [`Flow`](Flow.html "class in akka.stream.javadsl") completes
		 
		
		
		 '''Cancels when''' downstream cancels
		- #### prependLazy
		
		
		
		```
		public <M> [SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​[Out](SubFlow.html "type parameter in SubFlow"),​[Mat](SubFlow.html "type parameter in SubFlow")> prependLazy​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<[Out](SubFlow.html "type parameter in SubFlow")>,​M> that)
		```
		
		Prepend the given [`Source`](Source.html "class in akka.stream.javadsl") to this [`Flow`](Flow.html "class in akka.stream.javadsl"), meaning that before elements
		 are generated from this Flow, the Source's elements will be produced until it
		 is exhausted, at which point Flow elements will start being produced.
		 
		 Note that the [`Source`](Source.html "class in akka.stream.javadsl") is materialized together with this Flow and will then be kept from producing elements
		 by asserting back\-pressure until its time comes.
		 
		
		
		 When needing a prepend operator that is also detached use [`prepend(akka.stream.Graph<akka.stream.SourceShape<Out>, M>)`](#prepend(akka.stream.Graph))
		
		
		
		 If the given [`Source`](Source.html "class in akka.stream.javadsl") gets upstream error \- no elements from this [`Flow`](Flow.html "class in akka.stream.javadsl") will be pulled.
		 
		
		
		 '''Emits when''' element is available from the given [`Source`](Source.html "class in akka.stream.javadsl") or from current stream when the [`Source`](Source.html "class in akka.stream.javadsl") is completed
		 
		
		
		 '''Backpressures when''' downstream backpressures
		 
		
		
		 '''Completes when''' this [`Flow`](Flow.html "class in akka.stream.javadsl") completes
		 
		
		
		 '''Cancels when''' downstream cancels
		- #### orElse
		
		
		
		```
		public <M> [SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​[Out](SubFlow.html "type parameter in SubFlow"),​[Mat](SubFlow.html "type parameter in SubFlow")> orElse​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<[Out](SubFlow.html "type parameter in SubFlow")>,​M> secondary)
		```
		
		Provides a secondary source that will be consumed if this source completes without any
		 elements passing by. As soon as the first element comes through this stream, the alternative
		 will be cancelled.
		 
		 Note that this Flow will be materialized together with the [`Source`](Source.html "class in akka.stream.javadsl") and just kept
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
		- #### alsoTo
		
		
		
		```
		public [SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​[Out](SubFlow.html "type parameter in SubFlow"),​[Mat](SubFlow.html "type parameter in SubFlow")> alsoTo​([Graph](../Graph.html "interface in akka.stream")<[SinkShape](../SinkShape.html "class in akka.stream")<[Out](SubFlow.html "type parameter in SubFlow")>,​?> that)
		```
		
		Attaches the given [`Sink`](Sink.html "class in akka.stream.javadsl") to this [`Flow`](Flow.html "class in akka.stream.javadsl"), meaning that elements that passes
		 through will also be sent to the [`Sink`](Sink.html "class in akka.stream.javadsl").
		 
		 It is similar to [`wireTap(akka.japi.function.Procedure<Out>)`](#wireTap(akka.japi.function.Procedure)) but will backpressure instead of dropping elements when the given [`Sink`](Sink.html "class in akka.stream.javadsl") is not ready.
		 
		
		
		 '''Emits when''' element is available and demand exists both from the Sink and the downstream.
		 
		
		
		 '''Backpressures when''' downstream or Sink backpressures
		 
		
		
		 '''Completes when''' upstream completes
		 
		
		
		 '''Cancels when''' downstream or Sink cancels
		- #### alsoToAll
		
		
		
		```
		public [SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​[Out](SubFlow.html "type parameter in SubFlow"),​[Mat](SubFlow.html "type parameter in SubFlow")> alsoToAll​(scala.collection.immutable.Seq<[Graph](../Graph.html "interface in akka.stream")<[SinkShape](../SinkShape.html "class in akka.stream")<[Out](SubFlow.html "type parameter in SubFlow")>,​?>> those)
		```
		
		Attaches the given [`Sink`](Sink.html "class in akka.stream.javadsl")s to this [`Flow`](Flow.html "class in akka.stream.javadsl"), meaning that elements that passes
		 through will also be sent to all those [`Sink`](Sink.html "class in akka.stream.javadsl")s.
		 
		 It is similar to [`wireTap(akka.japi.function.Procedure<Out>)`](#wireTap(akka.japi.function.Procedure)) but will backpressure instead of dropping elements when the given [`Sink`](Sink.html "class in akka.stream.javadsl")s is not ready.
		 
		
		
		 '''Emits when''' element is available and demand exists both from the Sinks and the downstream.
		 
		
		
		 '''Backpressures when''' downstream or any of the [`Sink`](Sink.html "class in akka.stream.javadsl")s backpressures
		 
		
		
		 '''Completes when''' upstream completes
		 
		
		
		 '''Cancels when''' downstream or any of the [`Sink`](Sink.html "class in akka.stream.javadsl")s cancels
		- #### divertTo
		
		
		
		```
		public [SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​[Out](SubFlow.html "type parameter in SubFlow"),​[Mat](SubFlow.html "type parameter in SubFlow")> divertTo​([Graph](../Graph.html "interface in akka.stream")<[SinkShape](../SinkShape.html "class in akka.stream")<[Out](SubFlow.html "type parameter in SubFlow")>,​?> that,
		                                                [Predicate](../../japi/function/Predicate.html "interface in akka.japi.function")<[Out](SubFlow.html "type parameter in SubFlow")> when)
		```
		
		Attaches the given [`Sink`](Sink.html "class in akka.stream.javadsl") to this [`Flow`](Flow.html "class in akka.stream.javadsl"), meaning that elements will be sent to the [`Sink`](Sink.html "class in akka.stream.javadsl")
		 instead of being passed through if the predicate `when` returns `true`.
		 
		 '''Emits when''' emits when an element is available from the input and the chosen output has demand
		 
		
		
		 '''Backpressures when''' the currently chosen output back\-pressures
		 
		
		
		 '''Completes when''' upstream completes and no output is pending
		 
		
		
		 '''Cancels when''' any of the downstreams cancel
		- #### wireTap
		
		
		
		```
		public [SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​[Out](SubFlow.html "type parameter in SubFlow"),​[Mat](SubFlow.html "type parameter in SubFlow")> wireTap​([Graph](../Graph.html "interface in akka.stream")<[SinkShape](../SinkShape.html "class in akka.stream")<[Out](SubFlow.html "type parameter in SubFlow")>,​?> that)
		```
		
		Attaches the given [`Sink`](Sink.html "class in akka.stream.javadsl") to this [`Flow`](Flow.html "class in akka.stream.javadsl") as a wire tap, meaning that elements that pass
		 through will also be sent to the wire\-tap Sink, without the latter affecting the mainline flow.
		 If the wire\-tap Sink backpressures, elements that would've been sent to it will be dropped instead.
		 
		 It is similar to [`alsoTo(akka.stream.Graph<akka.stream.SinkShape<Out>, ?>)`](#alsoTo(akka.stream.Graph)) which does backpressure instead of dropping elements.
		 
		
		
		 '''Emits when''' element is available and demand exists from the downstream; the element will
		 also be sent to the wire\-tap Sink if there is demand.
		 
		
		
		 '''Backpressures when''' downstream backpressures
		 
		
		
		 '''Completes when''' upstream completes
		 
		
		
		 '''Cancels when''' downstream cancels
		- #### merge
		
		
		
		```
		public [SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​[Out](SubFlow.html "type parameter in SubFlow"),​[Mat](SubFlow.html "type parameter in SubFlow")> merge​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<[Out](SubFlow.html "type parameter in SubFlow")>,​?> that)
		```
		
		Merge the given [`Source`](Source.html "class in akka.stream.javadsl") to this [`Flow`](Flow.html "class in akka.stream.javadsl"), taking elements as they arrive from input streams,
		 picking randomly when several elements ready.
		 
		 '''Emits when''' one of the inputs has an element available
		 
		
		
		 '''Backpressures when''' downstream backpressures
		 
		
		
		 '''Completes when''' all upstreams complete
		 
		
		
		 '''Cancels when''' downstream cancels
		- #### mergeAll
		
		
		
		```
		public [SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​[Out](SubFlow.html "type parameter in SubFlow"),​[Mat](SubFlow.html "type parameter in SubFlow")> mergeAll​(java.util.List<? extends [Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<[Out](SubFlow.html "type parameter in SubFlow")>,​?>> those,
		                                                boolean eagerComplete)
		```
		
		Merge the given [`Source`](Source.html "class in akka.stream.javadsl")s to this [`Flow`](Flow.html "class in akka.stream.javadsl"), taking elements as they arrive from input streams,
		 picking randomly when several elements ready.
		 
		 '''Emits when''' one of the inputs has an element available
		 
		
		
		 '''Backpressures when''' downstream backpressures
		 
		
		
		 '''Completes when''' all upstreams complete (eagerComplete\=false) or one upstream completes (eagerComplete\=true), default value is `false`
		
		
		
		 '''Cancels when''' downstream cancels
		- #### interleave
		
		
		
		```
		public [SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​[Out](SubFlow.html "type parameter in SubFlow"),​[Mat](SubFlow.html "type parameter in SubFlow")> interleave​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<[Out](SubFlow.html "type parameter in SubFlow")>,​?> that,
		                                                  int segmentSize)
		```
		
		Interleave is a deterministic merge of the given [`Source`](Source.html "class in akka.stream.javadsl") with elements of this [`Flow`](Flow.html "class in akka.stream.javadsl").
		 It first emits `segmentSize` number of elements from this flow to downstream, then \- same amount for `that`
		 source, then repeat process.
		 
		 Example:
		 
		
		
		```
		
		 Source(List(1, 2, 3)).interleave(List(4, 5, 6, 7), 2) // 1, 2, 4, 5, 3, 6, 7
		 
		```
		
		
		 After one of upstreams is complete than all the rest elements will be emitted from the second one
		 
		
		
		 If it gets error from one of upstreams \- stream completes with failure.
		 
		
		
		 '''Emits when''' element is available from the currently consumed upstream
		 
		
		
		 '''Backpressures when''' downstream backpressures. Signal to current
		 upstream, switch to next upstream when received `segmentSize` elements
		 
		
		
		 '''Completes when''' the [`Flow`](Flow.html "class in akka.stream.javadsl") and given [`Source`](Source.html "class in akka.stream.javadsl") completes
		 
		
		
		 '''Cancels when''' downstream cancels
		- #### interleaveAll
		
		
		
		```
		public [SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​[Out](SubFlow.html "type parameter in SubFlow"),​[Mat](SubFlow.html "type parameter in SubFlow")> interleaveAll​(java.util.List<? extends [Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<[Out](SubFlow.html "type parameter in SubFlow")>,​?>> those,
		                                                     int segmentSize,
		                                                     boolean eagerClose)
		```
		
		Interleave is a deterministic merge of the given [`Source`](Source.html "class in akka.stream.javadsl")s with elements of this [`Flow`](Flow.html "class in akka.stream.javadsl").
		 It first emits `segmentSize` number of elements from this flow to downstream, then \- same amount for `that`
		 source, then repeat process.
		 
		 If eagerClose is false and one of the upstreams complete the elements from the other upstream will continue passing
		 through the interleave operator. If eagerClose is true and one of the upstream complete interleave will cancel the
		 other upstream and complete itself.
		 
		
		
		 If it gets error from one of upstreams \- stream completes with failure.
		 
		
		
		 '''Emits when''' element is available from the currently consumed upstream
		 
		
		
		 '''Backpressures when''' downstream backpressures. Signal to current
		 upstream, switch to next upstream when received `segmentSize` elements
		 
		
		
		 '''Completes when''' the [`Flow`](Flow.html "class in akka.stream.javadsl") and given [`Source`](Source.html "class in akka.stream.javadsl") completes
		 
		
		
		 '''Cancels when''' downstream cancels
		- #### mergeLatest
		
		
		
		```
		public <M> [SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​java.util.List<[Out](SubFlow.html "type parameter in SubFlow")>,​[Mat](SubFlow.html "type parameter in SubFlow")> mergeLatest​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<[Out](SubFlow.html "type parameter in SubFlow")>,​M> that,
		                                                                       boolean eagerComplete)
		```
		
		MergeLatest joins elements from N input streams into stream of lists of size N.
		 i\-th element in list is the latest emitted element from i\-th input stream.
		 MergeLatest emits list for each element emitted from some input stream,
		 but only after each input stream emitted at least one element.
		 
		 '''Emits when''' an element is available from some input and each input emits at least one element from stream start
		 
		
		
		 '''Completes when''' all upstreams complete (eagerClose\=false) or one upstream completes (eagerClose\=true)
		- #### mergePreferred
		
		
		
		```
		public <M> [SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​[Out](SubFlow.html "type parameter in SubFlow"),​[Mat](SubFlow.html "type parameter in SubFlow")> mergePreferred​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<[Out](SubFlow.html "type parameter in SubFlow")>,​M> that,
		                                                          boolean preferred,
		                                                          boolean eagerComplete)
		```
		
		Merge two sources. Prefer one source if both sources have elements ready.
		 
		 '''emits''' when one of the inputs has an element available. If multiple have elements available, prefer the 'right' one when 'preferred' is 'true', or the 'left' one when 'preferred' is 'false'.
		 
		
		
		 '''backpressures''' when downstream backpressures
		 
		
		
		 '''completes''' when all upstreams complete (This behavior is changeable to completing when any upstream completes by setting `eagerComplete=true`.)
		- #### mergePrioritized
		
		
		
		```
		public <M> [SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​[Out](SubFlow.html "type parameter in SubFlow"),​[Mat](SubFlow.html "type parameter in SubFlow")> mergePrioritized​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<[Out](SubFlow.html "type parameter in SubFlow")>,​M> that,
		                                                            int leftPriority,
		                                                            int rightPriority,
		                                                            boolean eagerComplete)
		```
		
		Merge two sources. Prefer the sources depending on the 'priority' parameters.
		 
		 '''emits''' when one of the inputs has an element available, preferring inputs based on the 'priority' parameters if both have elements available
		 
		
		
		 '''backpressures''' when downstream backpressures
		 
		
		
		 '''completes''' when both upstreams complete (This behavior is changeable to completing when any upstream completes by setting `eagerComplete=true`.)
		- #### mergeSorted
		
		
		
		```
		public <M> [SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​[Out](SubFlow.html "type parameter in SubFlow"),​[Mat](SubFlow.html "type parameter in SubFlow")> mergeSorted​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<[Out](SubFlow.html "type parameter in SubFlow")>,​M> that,
		                                                       java.util.Comparator<[Out](SubFlow.html "type parameter in SubFlow")> comp)
		```
		
		Merge the given [`Source`](Source.html "class in akka.stream.javadsl") to this [`Flow`](Flow.html "class in akka.stream.javadsl"), taking elements as they arrive from input streams,
		 picking always the smallest of the available elements (waiting for one element from each side
		 to be available). This means that possible contiguity of the input streams is not exploited to avoid
		 waiting for elements, this merge will block when one of the inputs does not have more elements (and
		 does not complete).
		 
		 '''Emits when''' all of the inputs have an element available
		 
		
		
		 '''Backpressures when''' downstream backpressures
		 
		
		
		 '''Completes when''' all upstreams complete
		 
		
		
		 '''Cancels when''' downstream cancels
		- #### zip
		
		
		
		```
		public <T> [SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​[Pair](../../japi/Pair.html "class in akka.japi")<[Out](SubFlow.html "type parameter in SubFlow"),​T>,​[Mat](SubFlow.html "type parameter in SubFlow")> zip​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<T>,​?> source)
		```
		
		Combine the elements of current [`Flow`](Flow.html "class in akka.stream.javadsl") and the given [`Source`](Source.html "class in akka.stream.javadsl") into a stream of tuples.
		 
		 '''Emits when''' all of the inputs has an element available
		 
		
		
		 '''Backpressures when''' downstream backpressures
		 
		
		
		 '''Completes when''' any upstream completes
		 
		
		
		 '''Cancels when''' downstream cancels
		- #### zipAll
		
		
		
		```
		public <U,​A> [SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​[Pair](../../japi/Pair.html "class in akka.japi")<A,​U>,​[Mat](SubFlow.html "type parameter in SubFlow")> zipAll​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<U>,​?> that,
		                                                                      A thisElem,
		                                                                      U thatElem)
		```
		
		Combine the elements of current flow and the given [`Source`](Source.html "class in akka.stream.javadsl") into a stream of tuples.
		 
		 '''Emits when''' at first emits when both inputs emit, and then as long as any input emits (coupled to the default value of the completed input).
		 
		
		
		 '''Backpressures when''' downstream backpressures
		 
		
		
		 '''Completes when''' all upstream completes
		 
		
		
		 '''Cancels when''' downstream cancels
		- #### zipLatest
		
		
		
		```
		public <T> [SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​[Pair](../../japi/Pair.html "class in akka.japi")<[Out](SubFlow.html "type parameter in SubFlow"),​T>,​[Mat](SubFlow.html "type parameter in SubFlow")> zipLatest​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<T>,​?> source)
		```
		
		Combine the elements of current [`Flow`](Flow.html "class in akka.stream.javadsl") and the given [`Source`](Source.html "class in akka.stream.javadsl") into a stream of tuples, picking always the latest element of each.
		 
		 '''Emits when''' all of the inputs have at least an element available, and then each time an element becomes
		 available on either of the inputs
		 
		
		
		 '''Backpressures when''' downstream backpressures
		 
		
		
		 '''Completes when''' any upstream completes
		 
		
		
		 '''Cancels when''' downstream cancels
		- #### zipWith
		
		
		
		```
		public <Out2,​Out3> [SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​Out3,​[Mat](SubFlow.html "type parameter in SubFlow")> zipWith​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<Out2>,​?> that,
		                                                                  [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<[Out](SubFlow.html "type parameter in SubFlow"),​Out2,​Out3> combine)
		```
		
		Put together the elements of current [`Flow`](Flow.html "class in akka.stream.javadsl") and the given [`Source`](Source.html "class in akka.stream.javadsl")
		 into a stream of combined elements using a combiner function.
		 
		 '''Emits when''' all of the inputs has an element available
		 
		
		
		 '''Backpressures when''' downstream backpressures
		 
		
		
		 '''Completes when''' any upstream completes
		 
		
		
		 '''Cancels when''' downstream cancels
		- #### zipLatestWith
		
		
		
		```
		public <Out2,​Out3> [SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​Out3,​[Mat](SubFlow.html "type parameter in SubFlow")> zipLatestWith​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<Out2>,​?> that,
		                                                                        [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<[Out](SubFlow.html "type parameter in SubFlow"),​Out2,​Out3> combine)
		```
		
		Put together the elements of current [`Flow`](Flow.html "class in akka.stream.javadsl") and the given [`Source`](Source.html "class in akka.stream.javadsl")
		 into a stream of combined elements using a combiner function, picking always the latest element of each.
		 
		 '''Emits when''' all of the inputs have at least an element available, and then each time an element becomes
		 available on either of the inputs
		 
		
		
		 '''Backpressures when''' downstream backpressures
		 
		
		
		 '''Completes when''' any upstream completes
		 
		
		
		 '''Cancels when''' downstream cancels
		- #### zipWithIndex
		
		
		
		```
		public [SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​[Pair](../../japi/Pair.html "class in akka.japi")<[Out](SubFlow.html "type parameter in SubFlow"),​java.lang.Long>,​[Mat](SubFlow.html "type parameter in SubFlow")> zipWithIndex()
		```
		
		Combine the elements of current [`Flow`](Flow.html "class in akka.stream.javadsl") into a stream of tuples consisting
		 of all elements paired with their index. Indices start at 0\.
		 
		 '''Emits when''' upstream emits an element and is paired with their index
		 
		
		
		 '''Backpressures when''' downstream backpressures
		 
		
		
		 '''Completes when''' upstream completes
		 
		
		
		 '''Cancels when''' downstream cancels
		- #### initialTimeout
		
		
		
		```
		public [SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​[Out](SubFlow.html "type parameter in SubFlow"),​[Mat](SubFlow.html "type parameter in SubFlow")> initialTimeout​(java.time.Duration timeout)
		```
		
		If the first element has not passed through this operator before the provided timeout, the stream is failed
		 with a [`InitialTimeoutException`](../InitialTimeoutException.html "class in akka.stream").
		 
		 '''Emits when''' upstream emits an element
		 
		
		
		 '''Backpressures when''' downstream backpressures
		 
		
		
		 '''Completes when''' upstream completes or fails if timeout elapses before first element arrives
		 
		
		
		 '''Cancels when''' downstream cancels
		- #### completionTimeout
		
		
		
		```
		public [SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​[Out](SubFlow.html "type parameter in SubFlow"),​[Mat](SubFlow.html "type parameter in SubFlow")> completionTimeout​(java.time.Duration timeout)
		```
		
		If the completion of the stream does not happen until the provided timeout, the stream is failed
		 with a [`CompletionTimeoutException`](../CompletionTimeoutException.html "class in akka.stream").
		 
		 '''Emits when''' upstream emits an element
		 
		
		
		 '''Backpressures when''' downstream backpressures
		 
		
		
		 '''Completes when''' upstream completes or fails if timeout elapses before upstream completes
		 
		
		
		 '''Cancels when''' downstream cancels
		- #### idleTimeout
		
		
		
		```
		public [SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​[Out](SubFlow.html "type parameter in SubFlow"),​[Mat](SubFlow.html "type parameter in SubFlow")> idleTimeout​(java.time.Duration timeout)
		```
		
		If the time between two processed elements exceeds the provided timeout, the stream is failed
		 with a [`StreamIdleTimeoutException`](../StreamIdleTimeoutException.html "class in akka.stream"). The timeout is checked periodically,
		 so the resolution of the check is one period (equals to timeout value).
		 
		 '''Emits when''' upstream emits an element
		 
		
		
		 '''Backpressures when''' downstream backpressures
		 
		
		
		 '''Completes when''' upstream completes or fails if timeout elapses between two emitted elements
		 
		
		
		 '''Cancels when''' downstream cancels
		- #### backpressureTimeout
		
		
		
		```
		public [SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​[Out](SubFlow.html "type parameter in SubFlow"),​[Mat](SubFlow.html "type parameter in SubFlow")> backpressureTimeout​(java.time.Duration timeout)
		```
		
		If the time between the emission of an element and the following downstream demand exceeds the provided timeout,
		 the stream is failed with a [`BackpressureTimeoutException`](../BackpressureTimeoutException.html "class in akka.stream"). The timeout is checked periodically,
		 so the resolution of the check is one period (equals to timeout value).
		 
		 '''Emits when''' upstream emits an element
		 
		
		
		 '''Backpressures when''' downstream backpressures
		 
		
		
		 '''Completes when''' upstream completes or fails if timeout elapses between element emission and downstream demand.
		 
		
		
		 '''Cancels when''' downstream cancels
		- #### keepAlive
		
		
		
		```
		public [SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​[Out](SubFlow.html "type parameter in SubFlow"),​[Mat](SubFlow.html "type parameter in SubFlow")> keepAlive​(java.time.Duration maxIdle,
		                                                 [Creator](../../japi/function/Creator.html "interface in akka.japi.function")<[Out](SubFlow.html "type parameter in SubFlow")> injectedElem)
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
		- #### throttle
		
		
		
		```
		public [SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​[Out](SubFlow.html "type parameter in SubFlow"),​[Mat](SubFlow.html "type parameter in SubFlow")> throttle​(int elements,
		                                                java.time.Duration per)
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
		public [SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​[Out](SubFlow.html "type parameter in SubFlow"),​[Mat](SubFlow.html "type parameter in SubFlow")> throttle​(int elements,
		                                                java.time.Duration per,
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
		 \- `akka.stream.ThrottleMode.Enforcing` fails with exception when upstream is faster than throttle rate
		 
		
		
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
		public [SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​[Out](SubFlow.html "type parameter in SubFlow"),​[Mat](SubFlow.html "type parameter in SubFlow")> throttle​(int cost,
		                                                java.time.Duration per,
		                                                [Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](SubFlow.html "type parameter in SubFlow"),​java.lang.Integer> costCalculation)
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
		public [SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​[Out](SubFlow.html "type parameter in SubFlow"),​[Mat](SubFlow.html "type parameter in SubFlow")> throttle​(int cost,
		                                                java.time.Duration per,
		                                                int maximumBurst,
		                                                [Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](SubFlow.html "type parameter in SubFlow"),​java.lang.Integer> costCalculation,
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
		public [SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​[Out](SubFlow.html "type parameter in SubFlow"),​[Mat](SubFlow.html "type parameter in SubFlow")> throttle​([ThrottleControl](ThrottleControl.html "class in akka.stream.javadsl") control)
		```
		
		
		See Also:
		`akka.stream.javadsl.Flow.throttle`
		- #### throttle
		
		
		
		```
		public [SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​[Out](SubFlow.html "type parameter in SubFlow"),​[Mat](SubFlow.html "type parameter in SubFlow")> throttle​([ThrottleControl](ThrottleControl.html "class in akka.stream.javadsl") control,
		                                                [Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](SubFlow.html "type parameter in SubFlow"),​java.lang.Integer> costCalculation)
		```
		
		
		See Also:
		`akka.stream.javadsl.Flow.throttle`
		- #### detach
		
		
		
		```
		public [SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​[Out](SubFlow.html "type parameter in SubFlow"),​[Mat](SubFlow.html "type parameter in SubFlow")> detach()
		```
		
		Detaches upstream demand from downstream demand without detaching the
		 stream rates; in other words acts like a buffer of size 1\.
		 
		 '''Emits when''' upstream emits an element
		 
		
		
		 '''Backpressures when''' downstream backpressures
		 
		
		
		 '''Completes when''' upstream completes
		 
		
		
		 '''Cancels when''' downstream cancels
		- #### initialDelay
		
		
		
		```
		public [SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​[Out](SubFlow.html "type parameter in SubFlow"),​[Mat](SubFlow.html "type parameter in SubFlow")> initialDelay​(java.time.Duration delay)
		```
		
		Delays the initial element by the specified duration.
		 
		 '''Emits when''' upstream emits an element if the initial delay is already elapsed
		 
		
		
		 '''Backpressures when''' downstream backpressures or initial delay is not yet elapsed
		 
		
		
		 '''Completes when''' upstream completes
		 
		
		
		 '''Cancels when''' downstream cancels
		- #### withAttributes
		
		
		
		```
		public [SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​[Out](SubFlow.html "type parameter in SubFlow"),​[Mat](SubFlow.html "type parameter in SubFlow")> withAttributes​([Attributes](../Attributes.html "class in akka.stream") attr)
		```
		
		Change the attributes of this [`Source`](Source.html "class in akka.stream.javadsl") to the given ones and seal the list
		 of attributes. This means that further calls will not be able to remove these
		 attributes, but instead add new ones. Note that this
		 operation has no effect on an empty Flow (because the attributes apply
		 only to the contained processing operators).
		- #### addAttributes
		
		
		
		```
		public [SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​[Out](SubFlow.html "type parameter in SubFlow"),​[Mat](SubFlow.html "type parameter in SubFlow")> addAttributes​([Attributes](../Attributes.html "class in akka.stream") attr)
		```
		
		Add the given attributes to this Source. Further calls to `withAttributes`
		 will not remove these attributes. Note that this
		 operation has no effect on an empty Flow (because the attributes apply
		 only to the contained processing operators).
		- #### named
		
		
		
		```
		public [SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​[Out](SubFlow.html "type parameter in SubFlow"),​[Mat](SubFlow.html "type parameter in SubFlow")> named​(java.lang.String name)
		```
		
		Add a name attribute to this Flow.
		- #### async
		
		
		
		```
		public [SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​[Out](SubFlow.html "type parameter in SubFlow"),​[Mat](SubFlow.html "type parameter in SubFlow")> async()
		```
		
		Put an asynchronous boundary around this `SubFlow`
		- #### log
		
		
		
		```
		public [SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​[Out](SubFlow.html "type parameter in SubFlow"),​[Mat](SubFlow.html "type parameter in SubFlow")> log​(java.lang.String name,
		                                           [Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](SubFlow.html "type parameter in SubFlow"),​java.lang.Object> extract,
		                                           [LoggingAdapter](../../event/LoggingAdapter.html "interface in akka.event") log)
		```
		
		Logs elements flowing through the stream as well as completion and erroring.
		 
		 By default element and completion signals are logged on debug level, and errors are logged on Error level.
		 This can be adjusted according to your needs by providing a custom `Attributes.LogLevels` attribute on the given Flow:
		 
		
		
		 The `extract` function will be applied to each element before logging, so it is possible to log only those fields
		 of a complex object flowing through this element.
		 
		
		
		 Uses the given `LoggingAdapter` for logging.
		 
		
		
		 Adheres to the `ActorAttributes.SupervisionStrategy` attribute.
		 
		
		
		 '''Emits when''' the mapping function returns an element
		 
		
		
		 '''Backpressures when''' downstream backpressures
		 
		
		
		 '''Completes when''' upstream completes
		 
		
		
		 '''Cancels when''' downstream cancels
		- #### log
		
		
		
		```
		public [SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​[Out](SubFlow.html "type parameter in SubFlow"),​[Mat](SubFlow.html "type parameter in SubFlow")> log​(java.lang.String name,
		                                           [Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](SubFlow.html "type parameter in SubFlow"),​java.lang.Object> extract)
		```
		
		Logs elements flowing through the stream as well as completion and erroring.
		 
		 By default element and completion signals are logged on debug level, and errors are logged on Error level.
		 This can be adjusted according to your needs by providing a custom `Attributes.LogLevels` attribute on the given Flow:
		 
		
		
		 The `extract` function will be applied to each element before logging, so it is possible to log only those fields
		 of a complex object flowing through this element.
		 
		
		
		 Uses an internally created `LoggingAdapter` which uses `akka.stream.Log` as it's source (use this class to configure slf4j loggers).
		 
		
		
		 '''Emits when''' the mapping function returns an element
		 
		
		
		 '''Backpressures when''' downstream backpressures
		 
		
		
		 '''Completes when''' upstream completes
		 
		
		
		 '''Cancels when''' downstream cancels
		- #### log
		
		
		
		```
		public [SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​[Out](SubFlow.html "type parameter in SubFlow"),​[Mat](SubFlow.html "type parameter in SubFlow")> log​(java.lang.String name,
		                                           [LoggingAdapter](../../event/LoggingAdapter.html "interface in akka.event") log)
		```
		
		Logs elements flowing through the stream as well as completion and erroring.
		 
		 By default element and completion signals are logged on debug level, and errors are logged on Error level.
		 This can be adjusted according to your needs by providing a custom `Attributes.LogLevels` attribute on the given Flow:
		 
		
		
		 Uses the given `LoggingAdapter` for logging.
		 
		
		
		 '''Emits when''' the mapping function returns an element
		 
		
		
		 '''Backpressures when''' downstream backpressures
		 
		
		
		 '''Completes when''' upstream completes
		 
		
		
		 '''Cancels when''' downstream cancels
		- #### log
		
		
		
		```
		public [SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​[Out](SubFlow.html "type parameter in SubFlow"),​[Mat](SubFlow.html "type parameter in SubFlow")> log​(java.lang.String name)
		```
		
		Logs elements flowing through the stream as well as completion and erroring.
		 
		 By default element and completion signals are logged on debug level, and errors are logged on Error level.
		 This can be adjusted according to your needs by providing a custom `Attributes.LogLevels` attribute on the given Flow.
		 
		
		
		 Uses an internally created `LoggingAdapter` which uses `akka.stream.Log` as it's source (use this class to configure slf4j loggers).
		 
		
		
		 '''Emits when''' the mapping function returns an element
		 
		
		
		 '''Backpressures when''' downstream backpressures
		 
		
		
		 '''Completes when''' upstream completes
		 
		
		
		 '''Cancels when''' downstream cancels
		- #### logWithMarker
		
		
		
		```
		public [SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​[Out](SubFlow.html "type parameter in SubFlow"),​[Mat](SubFlow.html "type parameter in SubFlow")> logWithMarker​(java.lang.String name,
		                                                     [Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](SubFlow.html "type parameter in SubFlow"),​[LogMarker](../../event/LogMarker.html "class in akka.event")> marker,
		                                                     [Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](SubFlow.html "type parameter in SubFlow"),​java.lang.Object> extract,
		                                                     [MarkerLoggingAdapter](../../event/MarkerLoggingAdapter.html "class in akka.event") log)
		```
		
		Logs elements flowing through the stream as well as completion and erroring.
		 
		 By default element and completion signals are logged on debug level, and errors are logged on Error level.
		 This can be adjusted according to your needs by providing a custom `Attributes.LogLevels` attribute on the given Flow:
		 
		
		
		 The `extract` function will be applied to each element before logging, so it is possible to log only those fields
		 of a complex object flowing through this element.
		 
		
		
		 Uses the given `MarkerLoggingAdapter` for logging.
		 
		
		
		 Adheres to the `ActorAttributes.SupervisionStrategy` attribute.
		 
		
		
		 '''Emits when''' the mapping function returns an element
		 
		
		
		 '''Backpressures when''' downstream backpressures
		 
		
		
		 '''Completes when''' upstream completes
		 
		
		
		 '''Cancels when''' downstream cancels
		- #### logWithMarker
		
		
		
		```
		public [SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​[Out](SubFlow.html "type parameter in SubFlow"),​[Mat](SubFlow.html "type parameter in SubFlow")> logWithMarker​(java.lang.String name,
		                                                     [Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](SubFlow.html "type parameter in SubFlow"),​[LogMarker](../../event/LogMarker.html "class in akka.event")> marker,
		                                                     [Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](SubFlow.html "type parameter in SubFlow"),​java.lang.Object> extract)
		```
		
		Logs elements flowing through the stream as well as completion and erroring.
		 
		 By default element and completion signals are logged on debug level, and errors are logged on Error level.
		 This can be adjusted according to your needs by providing a custom `Attributes.LogLevels` attribute on the given Flow:
		 
		
		
		 The `extract` function will be applied to each element before logging, so it is possible to log only those fields
		 of a complex object flowing through this element.
		 
		
		
		 Uses an internally created `MarkerLoggingAdapter` which uses `akka.stream.Log` as it's source (use this class to configure slf4j loggers).
		 
		
		
		 '''Emits when''' the mapping function returns an element
		 
		
		
		 '''Backpressures when''' downstream backpressures
		 
		
		
		 '''Completes when''' upstream completes
		 
		
		
		 '''Cancels when''' downstream cancels
		- #### logWithMarker
		
		
		
		```
		public [SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​[Out](SubFlow.html "type parameter in SubFlow"),​[Mat](SubFlow.html "type parameter in SubFlow")> logWithMarker​(java.lang.String name,
		                                                     [Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](SubFlow.html "type parameter in SubFlow"),​[LogMarker](../../event/LogMarker.html "class in akka.event")> marker,
		                                                     [MarkerLoggingAdapter](../../event/MarkerLoggingAdapter.html "class in akka.event") log)
		```
		
		Logs elements flowing through the stream as well as completion and erroring.
		 
		 By default element and completion signals are logged on debug level, and errors are logged on Error level.
		 This can be adjusted according to your needs by providing a custom `Attributes.LogLevels` attribute on the given Flow:
		 
		
		
		 Uses the given `MarkerLoggingAdapter` for logging.
		 
		
		
		 '''Emits when''' the mapping function returns an element
		 
		
		
		 '''Backpressures when''' downstream backpressures
		 
		
		
		 '''Completes when''' upstream completes
		 
		
		
		 '''Cancels when''' downstream cancels
		- #### logWithMarker
		
		
		
		```
		public [SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​[Out](SubFlow.html "type parameter in SubFlow"),​[Mat](SubFlow.html "type parameter in SubFlow")> logWithMarker​(java.lang.String name,
		                                                     [Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](SubFlow.html "type parameter in SubFlow"),​[LogMarker](../../event/LogMarker.html "class in akka.event")> marker)
		```
		
		Logs elements flowing through the stream as well as completion and erroring.
		 
		 By default element and completion signals are logged on debug level, and errors are logged on Error level.
		 This can be adjusted according to your needs by providing a custom `Attributes.LogLevels` attribute on the given Flow.
		 
		
		
		 Uses an internally created `MarkerLoggingAdapter` which uses `akka.stream.Log` as it's source (use this class to configure slf4j loggers).
		 
		
		
		 '''Emits when''' the mapping function returns an element
		 
		
		
		 '''Backpressures when''' downstream backpressures
		 
		
		
		 '''Completes when''' upstream completes
		 
		
		
		 '''Cancels when''' downstream cancels
		- #### aggregateWithBoundary
		
		
		
		```
		public <Agg,​Emit> [SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](SubFlow.html "type parameter in SubFlow"),​Emit,​[Mat](SubFlow.html "type parameter in SubFlow")> aggregateWithBoundary​(java.util.function.Supplier<Agg> allocate,
		                                                                               [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<Agg,​[Out](SubFlow.html "type parameter in SubFlow"),​[Pair](../../japi/Pair.html "class in akka.japi")<Agg,​java.lang.Object>> aggregate,
		                                                                               [Function](../../japi/function/Function.html "interface in akka.japi.function")<Agg,​Emit> harvest,
		                                                                               [Pair](../../japi/Pair.html "class in akka.japi")<java.util.function.Predicate<Agg>,​java.time.Duration> emitOnTimer)
		```
		
		Aggregate input elements into an arbitrary data structure that can be completed and emitted downstream
		 when custom condition is met which can be triggered by aggregate or timer.
		 It can be thought of a more general [`groupedWeightedWithin(long,akka.japi.function.Function<Out,java.lang.Long>,java.time.Duration)`](#groupedWeightedWithin(long,akka.japi.function.Function,java.time.Duration)).
		 
		 '''Emits when''' the aggregation function decides the aggregate is complete or the timer function returns true
		 
		
		
		 '''Backpressures when''' downstream backpressures and the aggregate is complete
		 
		
		
		 '''Completes when''' upstream completes and the last aggregate has been emitted downstream
		 
		
		
		 '''Cancels when''' downstream cancels
		 
		
		
		
		Parameters:
		`allocate` \- allocate the initial data structure for aggregated elements
		`aggregate` \- update the aggregated elements, return true if ready to emit after update.
		`harvest` \- this is invoked before emit within the current stage/operator
		`emitOnTimer` \- decide whether the current aggregated elements can be emitted, the custom function is invoked on every interval

## Code Examples

### Example 1: via

```text
+----------------------------+
     | Resulting Flow             |
     |                            |
     |  +------+        +------+  |
     |  |      |        |      |  |
 In ~~> | this | ~Out~> | flow | ~~> T
     |  |      |        |      |  |
     |  +------+        +------+  |
     +----------------------------+
```

### Example 2: to

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

### Example 3: intersperse

```text
Source<Integer, ?> nums = Source.from(Arrays.asList(0, 1, 2, 3));
 nums.intersperse(",");            //   1 , 2 , 3
 nums.intersperse("[", ",", "]");  // [ 1 , 2 , 3 ]
```

### Example 4: intersperse

```text
Source.single(">> ").concat(flow.intersperse(","))
 flow.intersperse(",").concat(Source.single("END"))
```

### Example 5: intersperse

```text
Source<Integer, ?> nums = Source.from(Arrays.asList(0, 1, 2, 3));
 nums.intersperse(",");            //   1 , 2 , 3
 nums.intersperse("[", ",", "]");  // [ 1 , 2 , 3 ]
```

### Example 6: interleave

```text
Source(List(1, 2, 3)).interleave(List(4, 5, 6, 7), 2) // 1, 2, 4, 5, 3, 6, 7
```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/NotUsed.html
- https://doc.akka.io/japi/akka-core/2.10/akka/event/LogMarker.html
- https://doc.akka.io/japi/akka-core/2.10/akka/event/LoggingAdapter.html
- https://doc.akka.io/japi/akka-core/2.10/akka/event/MarkerLoggingAdapter.html
- https://doc.akka.io/japi/akka-core/2.10/akka/japi/Pair.html
- https://doc.akka.io/japi/akka-core/2.10/akka/japi/function/Creator.html
- https://doc.akka.io/japi/akka-core/2.10/akka/japi/function/Function.html
- https://doc.akka.io/japi/akka-core/2.10/akka/japi/function/Function2.html
- https://doc.akka.io/japi/akka-core/2.10/akka/japi/function/Predicate.html
- https://doc.akka.io/japi/akka-core/2.10/akka/japi/function/Procedure.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/Attributes.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/BackpressureTimeoutException.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/CompletionTimeoutException.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/DelayOverflowStrategy.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/FlowShape.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/Graph.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/InitialTimeoutException.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/OverflowStrategy.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/SinkShape.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/SourceShape.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/StreamIdleTimeoutException.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/Supervision.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/ThrottleMode.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/DelayStrategy.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Sink.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/SubFlow.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/ThrottleControl.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/scaladsl/Flow.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/scaladsl/Sink.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/scaladsl/SubFlow.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/SubFlow.html](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/SubFlow.html)*