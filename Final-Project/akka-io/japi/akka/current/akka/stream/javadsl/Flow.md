---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:46:14Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/stream/javadsl/Flow.html
title: Flow
---

# Flow

## Content

Package [akka.stream.javadsl](package-summary.html)
## Class Flow\<In,​Out,​Mat\>

- java.lang.Object
- - akka.stream.javadsl.Flow\<In,​Out,​Mat\>

- All Implemented Interfaces:
`[Graph](../Graph.html "interface in akka.stream")<[FlowShape](../FlowShape.html "class in akka.stream")<In,​Out>,​Mat>`

---

```
public final class Flow<In,​Out,​Mat>
extends java.lang.Object
implements [Graph](../Graph.html "interface in akka.stream")<[FlowShape](../FlowShape.html "class in akka.stream")<In,​Out>,​Mat>
```

A `Flow` is a set of stream processing steps that has one open input and one open output.

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface akka.stream.[Graph](../Graph.html "interface in akka.stream")
		
		
		`[Graph.GraphMapMatVal](../Graph.GraphMapMatVal.html "class in akka.stream")<[S](../Graph.GraphMapMatVal.html "type parameter in Graph.GraphMapMatVal") extends [Shape](../Shape.html "class in akka.stream"),​[M](../Graph.GraphMapMatVal.html "type parameter in Graph.GraphMapMatVal")>`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Flow](#%3Cinit%3E(akka.stream.scaladsl.Flow))​([Flow](../scaladsl/Flow.html "class in akka.stream.scaladsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")> delegate)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) [Deprecated Methods](javascript:show(32);) 
	| Modifier and Type | Method | Description |
	| `[Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")>` | `[addAttributes](#addAttributes(akka.stream.Attributes))​([Attributes](../Attributes.html "class in akka.stream") attr)` | Add the given attributes to this [`Flow`](Flow.html "class in akka.stream.javadsl"). |
	| `<Agg,​Emit>[Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​Emit,​[Mat](Flow.html "type parameter in Flow")>` | `[aggregateWithBoundary](#aggregateWithBoundary(java.util.function.Supplier,akka.japi.function.Function2,akka.japi.function.Function,akka.japi.Pair))​(java.util.function.Supplier<Agg> allocate,  [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<Agg,​[Out](Flow.html "type parameter in Flow"),​[Pair](../../japi/Pair.html "class in akka.japi")<Agg,​java.lang.Object>> aggregate,  [Function](../../japi/function/Function.html "interface in akka.japi.function")<Agg,​Emit> harvest,  [Pair](../../japi/Pair.html "class in akka.japi")<java.util.function.Predicate<Agg>,​java.time.Duration> emitOnTimer)` | Aggregate input elements into an arbitrary data structure that can be completed and emitted downstream  when custom condition is met which can be triggered by aggregate or timer. |
	| `[Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")>` | `[alsoTo](#alsoTo(akka.stream.Graph))​([Graph](../Graph.html "interface in akka.stream")<[SinkShape](../SinkShape.html "class in akka.stream")<[Out](Flow.html "type parameter in Flow")>,​?> that)` | Attaches the given [`Sink`](Sink.html "class in akka.stream.javadsl") to this [`Flow`](Flow.html "class in akka.stream.javadsl"), meaning that elements that passes  through will also be sent to the [`Sink`](Sink.html "class in akka.stream.javadsl"). |
	| `[Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")>` | `[alsoToAll](#alsoToAll(akka.stream.Graph...))​([Graph](../Graph.html "interface in akka.stream")<[SinkShape](../SinkShape.html "class in akka.stream")<[Out](Flow.html "type parameter in Flow")>,​?>... those)` | Attaches the given [`Sink`](Sink.html "class in akka.stream.javadsl")s to this [`Flow`](Flow.html "class in akka.stream.javadsl"), meaning that elements that passes  through will also be sent to all those [`Sink`](Sink.html "class in akka.stream.javadsl")s. |
	| `[Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")>` | `[alsoToAll](#alsoToAll(scala.collection.immutable.Seq))​(scala.collection.immutable.Seq<[Graph](../Graph.html "interface in akka.stream")<[SinkShape](../SinkShape.html "class in akka.stream")<[Out](Flow.html "type parameter in Flow")>,​?>> those)` | Attaches the given [`Sink`](Sink.html "class in akka.stream.javadsl")s to this [`Flow`](Flow.html "class in akka.stream.javadsl"), meaning that elements that passes  through will also be sent to all those [`Sink`](Sink.html "class in akka.stream.javadsl")s. |
	| `<M2,​M3>[Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​M3>` | `[alsoToMat](#alsoToMat(akka.stream.Graph,akka.japi.function.Function2))​([Graph](../Graph.html "interface in akka.stream")<[SinkShape](../SinkShape.html "class in akka.stream")<[Out](Flow.html "type parameter in Flow")>,​M2> that,  [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<[Mat](Flow.html "type parameter in Flow"),​M2,​M3> matF)` | Attaches the given [`Sink`](Sink.html "class in akka.stream.javadsl") to this [`Flow`](Flow.html "class in akka.stream.javadsl"), meaning that elements that passes  through will also be sent to the [`Sink`](Sink.html "class in akka.stream.javadsl"). |
	| `<U,​CtxU,​CtxOut>[FlowWithContext](FlowWithContext.html "class in akka.stream.javadsl")<U,​CtxU,​[Out](Flow.html "type parameter in Flow"),​CtxOut,​[Mat](Flow.html "type parameter in Flow")>` | `[asFlowWithContext](#asFlowWithContext(akka.japi.function.Function2,akka.japi.function.Function))​([Function2](../../japi/function/Function2.html "interface in akka.japi.function")<U,​CtxU,​[In](Flow.html "type parameter in Flow")> collapseContext,  [Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](Flow.html "type parameter in Flow"),​CtxOut> extractContext)` | Turns a Flow into a FlowWithContext which manages a context per element along a stream. |
	| `<S> [Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​S,​[Mat](Flow.html "type parameter in Flow")>` | `[ask](#ask(int,akka.actor.ActorRef,java.lang.Class,akka.util.Timeout))​(int parallelism,  [ActorRef](../../actor/ActorRef.html "class in akka.actor") ref,  java.lang.Class<S> mapTo,  [Timeout](../../util/Timeout.html "class in akka.util") timeout)` | Use the `ask` pattern to send a request\-reply message to the target `ref` actor. |
	| `<S> [Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​S,​[Mat](Flow.html "type parameter in Flow")>` | `[ask](#ask(akka.actor.ActorRef,java.lang.Class,akka.util.Timeout))​([ActorRef](../../actor/ActorRef.html "class in akka.actor") ref,  java.lang.Class<S> mapTo,  [Timeout](../../util/Timeout.html "class in akka.util") timeout)` | Use the `ask` pattern to send a request\-reply message to the target `ref` actor. |
	| `[Flow](../scaladsl/Flow.html "class in akka.stream.scaladsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")>` | `[asScala](#asScala())()` | Converts this Flow to its Scala DSL counterpart |
	| `[Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")>` | `[async](#async())()` | Put an asynchronous boundary around this `Flow` |
	| `[Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")>` | `[async](#async(java.lang.String))​(java.lang.String dispatcher)` | Put an asynchronous boundary around this `Flow` |
	| `[Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")>` | `[async](#async(java.lang.String,int))​(java.lang.String dispatcher,  int inputBufferSize)` | Put an asynchronous boundary around this `Flow` |
	| `[Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")>` | `[backpressureTimeout](#backpressureTimeout(java.time.Duration))​(java.time.Duration timeout)` | If the time between the emission of an element and the following downstream demand exceeds the provided timeout,  the stream is failed with a [`BackpressureTimeoutException`](../BackpressureTimeoutException.html "class in akka.stream"). |
	| `<S> [Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​S,​[Mat](Flow.html "type parameter in Flow")>` | `[batch](#batch(long,akka.japi.function.Function,akka.japi.function.Function2))​(long max,  [Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](Flow.html "type parameter in Flow"),​S> seed,  [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<S,​[Out](Flow.html "type parameter in Flow"),​S> aggregate)` | Allows a faster upstream to progress independently of a slower subscriber by aggregating elements into batches  until the subscriber is ready to accept them. |
	| `<S> [Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​S,​[Mat](Flow.html "type parameter in Flow")>` | `[batchWeighted](#batchWeighted(long,akka.japi.function.Function,akka.japi.function.Function,akka.japi.function.Function2))​(long max,  [Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](Flow.html "type parameter in Flow"),​java.lang.Long> costFn,  [Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](Flow.html "type parameter in Flow"),​S> seed,  [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<S,​[Out](Flow.html "type parameter in Flow"),​S> aggregate)` | Allows a faster upstream to progress independently of a slower subscriber by aggregating elements into batches  until the subscriber is ready to accept them. |
	| `[Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")>` | `[buffer](#buffer(int,akka.stream.OverflowStrategy))​(int size,  [OverflowStrategy](../OverflowStrategy.html "class in akka.stream") overflowStrategy)` | Adds a fixed size buffer in the flow that allows to store elements from a faster upstream until it becomes full. |
	| `<T> [Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​T,​[Mat](Flow.html "type parameter in Flow")>` | `[collect](#collect(scala.PartialFunction))​(scala.PartialFunction<[Out](Flow.html "type parameter in Flow"),​T> pf)` | Transform this stream by applying the given partial function to each of the elements  on which the function is defined as they pass through this processing step. |
	| `<T> [Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​T,​[Mat](Flow.html "type parameter in Flow")>` | `[collectType](#collectType(java.lang.Class))​(java.lang.Class<T> clazz)` | Transform this stream by testing the type of each of the elements  on which the element is an instance of the provided type as they pass through this processing step. |
	| `static <I,​O,​M>[Flow](Flow.html "class in akka.stream.javadsl")<I,​O,​java.util.concurrent.CompletionStage<M>>` | `[completionStageFlow](#completionStageFlow(java.util.concurrent.CompletionStage))​(java.util.concurrent.CompletionStage<[Flow](Flow.html "class in akka.stream.javadsl")<I,​O,​M>> flow)` | Turn a `CompletionStage` into a flow that will consume the values of the source when the future completes successfully. |
	| `[Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")>` | `[completionTimeout](#completionTimeout(java.time.Duration))​(java.time.Duration timeout)` | If the completion of the stream does not happen until the provided timeout, the stream is failed  with a [`CompletionTimeoutException`](../CompletionTimeoutException.html "class in akka.stream"). |
	| `<M> [Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")>` | `[concat](#concat(akka.stream.Graph))​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<[Out](Flow.html "type parameter in Flow")>,​M> that)` | Concatenate the given [`Source`](Source.html "class in akka.stream.javadsl") to this [`Flow`](Flow.html "class in akka.stream.javadsl"), meaning that once this  Flow\&rsquo;s input is exhausted and all result elements have been generated,  the Source\&rsquo;s elements will be produced. |
	| `[Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")>` | `[concatAllLazy](#concatAllLazy(akka.stream.Graph...))​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<[Out](Flow.html "type parameter in Flow")>,​?>... those)` | Concatenate the given [`Source`](Source.html "class in akka.stream.javadsl")s to this [`Flow`](Flow.html "class in akka.stream.javadsl"), meaning that once this  Flow\&rsquo;s input is exhausted and all result elements have been generated,  the Source\&rsquo;s elements will be produced. |
	| `[Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")>` | `[concatAllLazy](#concatAllLazy(scala.collection.immutable.Seq))​(scala.collection.immutable.Seq<[Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<[Out](Flow.html "type parameter in Flow")>,​?>> those)` | Concatenate the given [`Source`](Source.html "class in akka.stream.javadsl")s to this [`Flow`](Flow.html "class in akka.stream.javadsl"), meaning that once this  Flow\&rsquo;s input is exhausted and all result elements have been generated,  the Source\&rsquo;s elements will be produced. |
	| `<M> [Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")>` | `[concatLazy](#concatLazy(akka.stream.Graph))​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<[Out](Flow.html "type parameter in Flow")>,​M> that)` | Concatenate the given [`Source`](Source.html "class in akka.stream.javadsl") to this [`Flow`](Flow.html "class in akka.stream.javadsl"), meaning that once this  Flow\&rsquo;s input is exhausted and all result elements have been generated,  the Source\&rsquo;s elements will be produced. |
	| `<M,​M2>[Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​M2>` | `[concatLazyMat](#concatLazyMat(akka.stream.Graph,akka.japi.function.Function2))​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<[Out](Flow.html "type parameter in Flow")>,​M> that,  [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<[Mat](Flow.html "type parameter in Flow"),​M,​M2> matF)` | Concatenate the given [`Source`](Source.html "class in akka.stream.javadsl") to this [`Flow`](Flow.html "class in akka.stream.javadsl"), meaning that once this  Flow\&rsquo;s input is exhausted and all result elements have been generated,  the Source\&rsquo;s elements will be produced. |
	| `<M,​M2>[Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​M2>` | `[concatMat](#concatMat(akka.stream.Graph,akka.japi.function.Function2))​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<[Out](Flow.html "type parameter in Flow")>,​M> that,  [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<[Mat](Flow.html "type parameter in Flow"),​M,​M2> matF)` | Concatenate the given [`Source`](Source.html "class in akka.stream.javadsl") to this [`Flow`](Flow.html "class in akka.stream.javadsl"), meaning that once this  Flow\&rsquo;s input is exhausted and all result elements have been generated,  the Source\&rsquo;s elements will be produced. |
	| `[Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")>` | `[conflate](#conflate(akka.japi.function.Function2))​([Function2](../../japi/function/Function2.html "interface in akka.japi.function")<[Out](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow")> aggregate)` | Allows a faster upstream to progress independently of a slower subscriber by conflating elements into a summary  until the subscriber is ready to accept them. |
	| `<S> [Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​S,​[Mat](Flow.html "type parameter in Flow")>` | `[conflateWithSeed](#conflateWithSeed(akka.japi.function.Function,akka.japi.function.Function2))​([Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](Flow.html "type parameter in Flow"),​S> seed,  [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<S,​[Out](Flow.html "type parameter in Flow"),​S> aggregate)` | Allows a faster upstream to progress independently of a slower subscriber by conflating elements into a summary  until the subscriber is ready to accept them. |
	| `<In2> [Flow](Flow.html "class in akka.stream.javadsl")<In2,​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")>` | `[contramap](#contramap(akka.japi.function.Function))​([Function](../../japi/function/Function.html "interface in akka.japi.function")<In2,​[In](Flow.html "type parameter in Flow")> f)` | Transform this Flow by applying a function to each \*incoming\* upstream element before  it is passed to the [`Flow`](Flow.html "class in akka.stream.javadsl") |
	| `static <T> [Flow](Flow.html "class in akka.stream.javadsl")<T,​T,​[NotUsed](../../NotUsed.html "class in akka")>` | `[create](#create())()` | Create a \`Flow\` which can process elements of type \`T\`. |
	| `[Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")>` | `[delay](#delay(java.time.Duration,akka.stream.DelayOverflowStrategy))​(java.time.Duration of,  [DelayOverflowStrategy](../DelayOverflowStrategy.html "class in akka.stream") strategy)` | Shifts elements emission in time by a specified amount. |
	| `[Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")>` | `[delayWith](#delayWith(java.util.function.Supplier,akka.stream.DelayOverflowStrategy))​(java.util.function.Supplier<[DelayStrategy](DelayStrategy.html "interface in akka.stream.javadsl")<[Out](Flow.html "type parameter in Flow")>> delayStrategySupplier,  [DelayOverflowStrategy](../DelayOverflowStrategy.html "class in akka.stream") overFlowStrategy)` | Shifts elements emission in time by an amount individually determined through delay strategy a specified amount. |
	| `[Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")>` | `[detach](#detach())()` | Detaches upstream demand from downstream demand without detaching the  stream rates; in other words acts like a buffer of size 1\. |
	| `[Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")>` | `[divertTo](#divertTo(akka.stream.Graph,akka.japi.function.Predicate))​([Graph](../Graph.html "interface in akka.stream")<[SinkShape](../SinkShape.html "class in akka.stream")<[Out](Flow.html "type parameter in Flow")>,​?> that,  [Predicate](../../japi/function/Predicate.html "interface in akka.japi.function")<[Out](Flow.html "type parameter in Flow")> when)` | Attaches the given [`Sink`](Sink.html "class in akka.stream.javadsl") to this [`Flow`](Flow.html "class in akka.stream.javadsl"), meaning that elements will be sent to the [`Sink`](Sink.html "class in akka.stream.javadsl")  instead of being passed through if the predicate `when` returns `true`. |
	| `<M2,​M3>[Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​M3>` | `[divertToMat](#divertToMat(akka.stream.Graph,akka.japi.function.Predicate,akka.japi.function.Function2))​([Graph](../Graph.html "interface in akka.stream")<[SinkShape](../SinkShape.html "class in akka.stream")<[Out](Flow.html "type parameter in Flow")>,​M2> that,  [Predicate](../../japi/function/Predicate.html "interface in akka.japi.function")<[Out](Flow.html "type parameter in Flow")> when,  [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<[Mat](Flow.html "type parameter in Flow"),​M2,​M3> matF)` | Attaches the given [`Sink`](Sink.html "class in akka.stream.javadsl") to this [`Flow`](Flow.html "class in akka.stream.javadsl"), meaning that elements will be sent to the [`Sink`](Sink.html "class in akka.stream.javadsl")  instead of being passed through if the predicate `when` returns `true`. |
	| `[Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")>` | `[drop](#drop(long))​(long n)` | Discard the given number of elements at the beginning of the stream. |
	| `[Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")>` | `[dropWhile](#dropWhile(akka.japi.function.Predicate))​([Predicate](../../japi/function/Predicate.html "interface in akka.japi.function")<[Out](Flow.html "type parameter in Flow")> p)` | Discard elements at the beginning of the stream while predicate is true. |
	| `[Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")>` | `[dropWithin](#dropWithin(java.time.Duration))​(java.time.Duration duration)` | Discard the elements received within the given duration at beginning of the stream. |
	| `<U> [Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​U,​[Mat](Flow.html "type parameter in Flow")>` | `[expand](#expand(akka.japi.function.Function))​([Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](Flow.html "type parameter in Flow"),​java.util.Iterator<U>> expander)` | Allows a faster downstream to progress independently of a slower upstream by extrapolating elements from an older  element until new element comes from the upstream. |
	| `[Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")>` | `[extrapolate](#extrapolate(akka.japi.function.Function))​([Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](Flow.html "type parameter in Flow"),​java.util.Iterator<[Out](Flow.html "type parameter in Flow")>> extrapolator)` | Allows a faster downstream to progress independent of a slower upstream. |
	| `[Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")>` | `[extrapolate](#extrapolate(akka.japi.function.Function,Out))​([Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](Flow.html "type parameter in Flow"),​java.util.Iterator<[Out](Flow.html "type parameter in Flow")>> extrapolator,  [Out](Flow.html "type parameter in Flow") initial)` | Allows a faster downstream to progress independent of a slower upstream. |
	| `[Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")>` | `[filter](#filter(akka.japi.function.Predicate))​([Predicate](../../japi/function/Predicate.html "interface in akka.japi.function")<[Out](Flow.html "type parameter in Flow")> p)` | Only pass on those elements that satisfy the given predicate. |
	| `[Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")>` | `[filterNot](#filterNot(akka.japi.function.Predicate))​([Predicate](../../japi/function/Predicate.html "interface in akka.japi.function")<[Out](Flow.html "type parameter in Flow")> p)` | Only pass on those elements that NOT satisfy the given predicate. |
	| `<T,​M>[Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​T,​[Mat](Flow.html "type parameter in Flow")>` | `[flatMapConcat](#flatMapConcat(akka.japi.function.Function))​([Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](Flow.html "type parameter in Flow"),​? extends [Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<T>,​M>> f)` | Transform each input element into a `Source` of output elements that is  then flattened into the output stream by concatenation,  fully consuming one Source after the other. |
	| `<T,​M>[Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​T,​[Mat](Flow.html "type parameter in Flow")>` | `[flatMapMerge](#flatMapMerge(int,akka.japi.function.Function))​(int breadth,  [Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](Flow.html "type parameter in Flow"),​? extends [Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<T>,​M>> f)` | Transform each input element into a `Source` of output elements that is  then flattened into the output stream by merging, where at most `breadth`  substreams are being consumed at any given time. |
	| `<Out2,​Mat2>[Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​Out2,​[Mat](Flow.html "type parameter in Flow")>` | `[flatMapPrefix](#flatMapPrefix(int,akka.japi.function.Function))​(int n,  [Function](../../japi/function/Function.html "interface in akka.japi.function")<java.lang.Iterable<[Out](Flow.html "type parameter in Flow")>,​[Flow](Flow.html "class in akka.stream.javadsl")<[Out](Flow.html "type parameter in Flow"),​Out2,​Mat2>> f)` | Takes up to `n` elements from the stream (less than `n` only if the upstream completes before emitting `n` elements),  then apply `f` on these elements in order to obtain a flow, this flow is then materialized and the rest of the input is processed by this flow (similar to via). |
	| `<Out2,​Mat2,​Mat3>[Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​Out2,​Mat3>` | `[flatMapPrefixMat](#flatMapPrefixMat(int,akka.japi.function.Function,akka.japi.function.Function2))​(int n,  [Function](../../japi/function/Function.html "interface in akka.japi.function")<java.lang.Iterable<[Out](Flow.html "type parameter in Flow")>,​[Flow](Flow.html "class in akka.stream.javadsl")<[Out](Flow.html "type parameter in Flow"),​Out2,​Mat2>> f,  [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<[Mat](Flow.html "type parameter in Flow"),​java.util.concurrent.CompletionStage<Mat2>,​Mat3> matF)` | mat version of [`flatMapPrefix(int, akka.japi.function.Function<java.lang.Iterable<Out>, akka.stream.javadsl.Flow<Out, Out2, Mat2>>)`](#flatMapPrefix(int,akka.japi.function.Function)), this method gives access to a future materialized value of the downstream flow (as a completion stage). |
	| `static <Out,​In extends java.util.Optional<Out>>[Flow](Flow.html "class in akka.stream.javadsl")<In,​Out,​[NotUsed](../../NotUsed.html "class in akka")>` | `[flattenOptional](#flattenOptional())()` | Collect the value of `Optional` from the elements passing through this flow, empty `Optional` is filtered out. |
	| `<T> [Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​T,​[Mat](Flow.html "type parameter in Flow")>` | `[fold](#fold(T,akka.japi.function.Function2))​(T zero,  [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<T,​[Out](Flow.html "type parameter in Flow"),​T> f)` | Similar to `scan` but only emits its result when the upstream completes,  after which it also completes. |
	| `<T> [Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​T,​[Mat](Flow.html "type parameter in Flow")>` | `[foldAsync](#foldAsync(T,akka.japi.function.Function2))​(T zero,  [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<T,​[Out](Flow.html "type parameter in Flow"),​java.util.concurrent.CompletionStage<T>> f)` | Similar to `fold` but with an asynchronous function. |
	| `static <I,​O>[Flow](Flow.html "class in akka.stream.javadsl")<I,​O,​[NotUsed](../../NotUsed.html "class in akka")>` | `[fromFunction](#fromFunction(akka.japi.function.Function))​([Function](../../japi/function/Function.html "interface in akka.japi.function")<I,​O> f)` | Creates a \[Flow] which will use the given function to transform its inputs to outputs. |
	| `static <I,​O,​M>[Flow](Flow.html "class in akka.stream.javadsl")<I,​O,​M>` | `[fromGraph](#fromGraph(akka.stream.Graph))​([Graph](../Graph.html "interface in akka.stream")<[FlowShape](../FlowShape.html "class in akka.stream")<I,​O>,​M> g)` | A graph with the shape of a flow logically is a flow, this method makes it so also in type. |
	| `static <I,​O,​M>[Flow](Flow.html "class in akka.stream.javadsl")<I,​O,​java.util.concurrent.CompletionStage<M>>` | `[fromMaterializer](#fromMaterializer(java.util.function.BiFunction))​(java.util.function.BiFunction<[Materializer](../Materializer.html "class in akka.stream"),​[Attributes](../Attributes.html "class in akka.stream"),​[Flow](Flow.html "class in akka.stream.javadsl")<I,​O,​M>> factory)` | Defers the creation of a [`Flow`](Flow.html "class in akka.stream.javadsl") until materialization. |
	| `static <I,​O>[Flow](Flow.html "class in akka.stream.javadsl")<I,​O,​[NotUsed](../../NotUsed.html "class in akka")>` | `[fromProcessor](#fromProcessor(akka.japi.function.Creator))​([Creator](../../japi/function/Creator.html "interface in akka.japi.function")<org.reactivestreams.Processor<I,​O>> processorFactory)` |  |
	| `static <I,​O,​Mat>[Flow](Flow.html "class in akka.stream.javadsl")<I,​O,​Mat>` | `[fromProcessorMat](#fromProcessorMat(akka.japi.function.Creator))​([Creator](../../japi/function/Creator.html "interface in akka.japi.function")<[Pair](../../japi/Pair.html "class in akka.japi")<org.reactivestreams.Processor<I,​O>,​Mat>> processorFactory)` |  |
	| `static <I,​O>[Flow](Flow.html "class in akka.stream.javadsl")<I,​O,​[NotUsed](../../NotUsed.html "class in akka")>` | `[fromSinkAndSource](#fromSinkAndSource(akka.stream.Graph,akka.stream.Graph))​([Graph](../Graph.html "interface in akka.stream")<[SinkShape](../SinkShape.html "class in akka.stream")<I>,​?> sink,  [Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<O>,​?> source)` | Creates a `Flow` from a `Sink` and a `Source` where the Flow's input  will be sent to the Sink and the Flow's output will come from the Source. |
	| `static <I,​O>[Flow](Flow.html "class in akka.stream.javadsl")<I,​O,​[NotUsed](../../NotUsed.html "class in akka")>` | `[fromSinkAndSourceCoupled](#fromSinkAndSourceCoupled(akka.stream.Graph,akka.stream.Graph))​([Graph](../Graph.html "interface in akka.stream")<[SinkShape](../SinkShape.html "class in akka.stream")<I>,​?> sink,  [Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<O>,​?> source)` | Allows coupling termination (cancellation, completion, erroring) of Sinks and Sources while creating a Flow from them. |
	| `static <I,​O,​M1,​M2,​M>[Flow](Flow.html "class in akka.stream.javadsl")<I,​O,​M>` | `[fromSinkAndSourceCoupledMat](#fromSinkAndSourceCoupledMat(akka.stream.Graph,akka.stream.Graph,akka.japi.function.Function2))​([Graph](../Graph.html "interface in akka.stream")<[SinkShape](../SinkShape.html "class in akka.stream")<I>,​M1> sink,  [Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<O>,​M2> source,  [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<M1,​M2,​M> combine)` | Allows coupling termination (cancellation, completion, erroring) of Sinks and Sources while creating a Flow from them. |
	| `static <I,​O,​M1,​M2,​M>[Flow](Flow.html "class in akka.stream.javadsl")<I,​O,​M>` | `[fromSinkAndSourceMat](#fromSinkAndSourceMat(akka.stream.Graph,akka.stream.Graph,akka.japi.function.Function2))​([Graph](../Graph.html "interface in akka.stream")<[SinkShape](../SinkShape.html "class in akka.stream")<I>,​M1> sink,  [Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<O>,​M2> source,  [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<M1,​M2,​M> combine)` | Creates a `Flow` from a `Sink` and a `Source` where the Flow's input  will be sent to the Sink and the Flow's output will come from the Source. |
	| `[Attributes](../Attributes.html "class in akka.stream")` | `[getAttributes](#getAttributes())()` |  |
	| `<K> [SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")>` | `[groupBy](#groupBy(int,akka.japi.function.Function))​(int maxSubstreams,  [Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](Flow.html "type parameter in Flow"),​K> f)` | This operation demultiplexes the incoming stream into separate output  streams, one for each element key. |
	| `<K> [SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")>` | `[groupBy](#groupBy(int,akka.japi.function.Function,boolean))​(int maxSubstreams,  [Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](Flow.html "type parameter in Flow"),​K> f,  boolean allowClosedSubstreamRecreation)` | This operation demultiplexes the incoming stream into separate output  streams, one for each element key. |
	| `[Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​java.util.List<[Out](Flow.html "type parameter in Flow")>,​[Mat](Flow.html "type parameter in Flow")>` | `[grouped](#grouped(int))​(int n)` | Chunk up this stream into groups of the given size, with the last group  possibly smaller than requested due to end\-of\-stream. |
	| `[Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​java.util.List<[Out](Flow.html "type parameter in Flow")>,​[Mat](Flow.html "type parameter in Flow")>` | `[groupedWeighted](#groupedWeighted(long,java.util.function.Function))​(long minWeight,  java.util.function.Function<[Out](Flow.html "type parameter in Flow"),​java.lang.Long> costFn)` | Chunk up this stream into groups of elements that have a cumulative weight greater than or equal to  the `minWeight`, with the last group possibly smaller than requested `minWeight` due to end\-of\-stream. |
	| `[Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​java.util.List<[Out](Flow.html "type parameter in Flow")>,​[Mat](Flow.html "type parameter in Flow")>` | `[groupedWeightedWithin](#groupedWeightedWithin(long,int,akka.japi.function.Function,java.time.Duration))​(long maxWeight,  int maxNumber,  [Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](Flow.html "type parameter in Flow"),​java.lang.Long> costFn,  java.time.Duration duration)` | Chunk up this stream into groups of elements received within a time window,  or limited by the weight and number of the elements, whatever happens first. |
	| `[Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​java.util.List<[Out](Flow.html "type parameter in Flow")>,​[Mat](Flow.html "type parameter in Flow")>` | `[groupedWeightedWithin](#groupedWeightedWithin(long,akka.japi.function.Function,java.time.Duration))​(long maxWeight,  [Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](Flow.html "type parameter in Flow"),​java.lang.Long> costFn,  java.time.Duration duration)` | Chunk up this stream into groups of elements received within a time window,  or limited by the weight of the elements, whatever happens first. |
	| `[Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​java.util.List<[Out](Flow.html "type parameter in Flow")>,​[Mat](Flow.html "type parameter in Flow")>` | `[groupedWithin](#groupedWithin(int,java.time.Duration))​(int maxNumber,  java.time.Duration duration)` | Chunk up this stream into groups of elements received within a time window,  or limited by the given number of elements, whatever happens first. |
	| `[Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")>` | `[idleTimeout](#idleTimeout(java.time.Duration))​(java.time.Duration timeout)` | If the time between two processed elements exceeds the provided timeout, the stream is failed  with a [`StreamIdleTimeoutException`](../StreamIdleTimeoutException.html "class in akka.stream"). |
	| `[Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")>` | `[initialDelay](#initialDelay(java.time.Duration))​(java.time.Duration delay)` | Delays the initial element by the specified duration. |
	| `[Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")>` | `[initialTimeout](#initialTimeout(java.time.Duration))​(java.time.Duration timeout)` | If the first element has not passed through this operator before the provided timeout, the stream is failed  with a [`InitialTimeoutException`](../InitialTimeoutException.html "class in akka.stream"). |
	| `[Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")>` | `[interleave](#interleave(akka.stream.Graph,int))​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<[Out](Flow.html "type parameter in Flow")>,​?> that,  int segmentSize)` | Interleave is a deterministic merge of the given [`Source`](Source.html "class in akka.stream.javadsl") with elements of this [`Flow`](Flow.html "class in akka.stream.javadsl"). |
	| `[Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")>` | `[interleave](#interleave(akka.stream.Graph,int,boolean))​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<[Out](Flow.html "type parameter in Flow")>,​?> that,  int segmentSize,  boolean eagerClose)` | Interleave is a deterministic merge of the given [`Source`](Source.html "class in akka.stream.javadsl") with elements of this [`Flow`](Flow.html "class in akka.stream.javadsl"). |
	| `[Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")>` | `[interleaveAll](#interleaveAll(java.util.List,int,boolean))​(java.util.List<? extends [Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<[Out](Flow.html "type parameter in Flow")>,​?>> those,  int segmentSize,  boolean eagerClose)` | Interleave is a deterministic merge of the given [`Source`](Source.html "class in akka.stream.javadsl")s with elements of this [`Flow`](Flow.html "class in akka.stream.javadsl"). |
	| `<M,​M2>[Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​M2>` | `[interleaveMat](#interleaveMat(akka.stream.Graph,int,boolean,akka.japi.function.Function2))​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<[Out](Flow.html "type parameter in Flow")>,​M> that,  int segmentSize,  boolean eagerClose,  [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<[Mat](Flow.html "type parameter in Flow"),​M,​M2> matF)` | Interleave is a deterministic merge of the given [`Source`](Source.html "class in akka.stream.javadsl") with elements of this [`Flow`](Flow.html "class in akka.stream.javadsl"). |
	| `<M,​M2>[Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​M2>` | `[interleaveMat](#interleaveMat(akka.stream.Graph,int,akka.japi.function.Function2))​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<[Out](Flow.html "type parameter in Flow")>,​M> that,  int segmentSize,  [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<[Mat](Flow.html "type parameter in Flow"),​M,​M2> matF)` | Interleave is a deterministic merge of the given [`Source`](Source.html "class in akka.stream.javadsl") with elements of this [`Flow`](Flow.html "class in akka.stream.javadsl"). |
	| `[Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")>` | `[intersperse](#intersperse(Out))​([Out](Flow.html "type parameter in Flow") inject)` | Intersperses stream with provided element, similar to how `scala.collection.immutable.List.mkString`  injects a separator between a List's elements. |
	| `[Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")>` | `[intersperse](#intersperse(Out,Out,Out))​([Out](Flow.html "type parameter in Flow") start,  [Out](Flow.html "type parameter in Flow") inject,  [Out](Flow.html "type parameter in Flow") end)` | Intersperses stream with provided element, similar to how `scala.collection.immutable.List.mkString`  injects a separator between a List's elements. |
	| `<I2,​O1,​Mat2>[Flow](Flow.html "class in akka.stream.javadsl")<I2,​O1,​[Mat](Flow.html "type parameter in Flow")>` | `[join](#join(akka.stream.Graph))​([Graph](../Graph.html "interface in akka.stream")<[BidiShape](../BidiShape.html "class in akka.stream")<[Out](Flow.html "type parameter in Flow"),​O1,​I2,​[In](Flow.html "type parameter in Flow")>,​Mat2> bidi)` | Join this [`Flow`](Flow.html "class in akka.stream.javadsl") to a [`BidiFlow`](BidiFlow.html "class in akka.stream.javadsl") to close off the \&ldquo;top\&rdquo; of the protocol stack: |
	| `<M> [RunnableGraph](RunnableGraph.html "class in akka.stream.javadsl")<[Mat](Flow.html "type parameter in Flow")>` | `[join](#join(akka.stream.Graph))​([Graph](../Graph.html "interface in akka.stream")<[FlowShape](../FlowShape.html "class in akka.stream")<[Out](Flow.html "type parameter in Flow"),​[In](Flow.html "type parameter in Flow")>,​M> flow)` | Join this [`Flow`](Flow.html "class in akka.stream.javadsl") to another [`Flow`](Flow.html "class in akka.stream.javadsl"), by cross connecting the inputs and outputs, creating a [`RunnableGraph`](RunnableGraph.html "class in akka.stream.javadsl"). |
	| `<I2,​O1,​Mat2,​M>[Flow](Flow.html "class in akka.stream.javadsl")<I2,​O1,​M>` | `[joinMat](#joinMat(akka.stream.Graph,akka.japi.function.Function2))​([Graph](../Graph.html "interface in akka.stream")<[BidiShape](../BidiShape.html "class in akka.stream")<[Out](Flow.html "type parameter in Flow"),​O1,​I2,​[In](Flow.html "type parameter in Flow")>,​Mat2> bidi,  [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<[Mat](Flow.html "type parameter in Flow"),​Mat2,​M> combine)` | Join this [`Flow`](Flow.html "class in akka.stream.javadsl") to a [`BidiFlow`](BidiFlow.html "class in akka.stream.javadsl") to close off the \&ldquo;top\&rdquo; of the protocol stack: |
	| `<M,​M2>[RunnableGraph](RunnableGraph.html "class in akka.stream.javadsl")<M2>` | `[joinMat](#joinMat(akka.stream.Graph,akka.japi.function.Function2))​([Graph](../Graph.html "interface in akka.stream")<[FlowShape](../FlowShape.html "class in akka.stream")<[Out](Flow.html "type parameter in Flow"),​[In](Flow.html "type parameter in Flow")>,​M> flow,  [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<[Mat](Flow.html "type parameter in Flow"),​M,​M2> combine)` | Join this [`Flow`](Flow.html "class in akka.stream.javadsl") to another [`Flow`](Flow.html "class in akka.stream.javadsl"), by cross connecting the inputs and outputs, creating a [`RunnableGraph`](RunnableGraph.html "class in akka.stream.javadsl") |
	| `[Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")>` | `[keepAlive](#keepAlive(java.time.Duration,akka.japi.function.Creator))​(java.time.Duration maxIdle,  [Creator](../../japi/function/Creator.html "interface in akka.japi.function")<[Out](Flow.html "type parameter in Flow")> injectedElem)` | Injects additional elements if upstream does not emit for a configured amount of time. |
	| `static <I,​O,​M>[Flow](Flow.html "class in akka.stream.javadsl")<I,​O,​java.util.concurrent.CompletionStage<M>>` | `[lazyCompletionStageFlow](#lazyCompletionStageFlow(akka.japi.function.Creator))​([Creator](../../japi/function/Creator.html "interface in akka.japi.function")<java.util.concurrent.CompletionStage<[Flow](Flow.html "class in akka.stream.javadsl")<I,​O,​M>>> create)` | Defers invoking the `create` function to create a future flow until there downstream demand has caused upstream  to send a first element. |
	| `static <I,​O,​M>[Flow](Flow.html "class in akka.stream.javadsl")<I,​O,​java.util.concurrent.CompletionStage<M>>` | `[lazyFlow](#lazyFlow(akka.japi.function.Creator))​([Creator](../../japi/function/Creator.html "interface in akka.japi.function")<[Flow](Flow.html "class in akka.stream.javadsl")<I,​O,​M>> create)` | Defers invoking the `create` function to create a future flow until there is downstream demand and passing  that downstream demand upstream triggers the first element. |
	| `static <I,​O,​M>[Flow](Flow.html "class in akka.stream.javadsl")<I,​O,​M>` | `[lazyInit](#lazyInit(akka.japi.function.Function,akka.japi.function.Creator))​([Function](../../japi/function/Function.html "interface in akka.japi.function")<I,​java.util.concurrent.CompletionStage<[Flow](Flow.html "class in akka.stream.javadsl")<I,​O,​M>>> flowFactory,  [Creator](../../japi/function/Creator.html "interface in akka.japi.function")<M> fallback)` | Deprecated. Use 'Flow.completionStageFlow' in combination with prefixAndTail(1\) instead, see \`completionStageFlow\` operator docs for details. |
	| `static <I,​O,​M>[Flow](Flow.html "class in akka.stream.javadsl")<I,​O,​java.util.concurrent.CompletionStage<java.util.Optional<M>>>` | `[lazyInitAsync](#lazyInitAsync(akka.japi.function.Creator))​([Creator](../../japi/function/Creator.html "interface in akka.japi.function")<java.util.concurrent.CompletionStage<[Flow](Flow.html "class in akka.stream.javadsl")<I,​O,​M>>> flowFactory)` | Deprecated. Use 'Flow.lazyCompletionStageFlow' instead. |
	| `[Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")>` | `[limit](#limit(long))​(long n)` | Ensure stream boundedness by limiting the number of elements from upstream. |
	| `[Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")>` | `[limitWeighted](#limitWeighted(long,akka.japi.function.Function))​(long n,  [Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](Flow.html "type parameter in Flow"),​java.lang.Long> costFn)` | Ensure stream boundedness by evaluating the cost of incoming elements  using a cost function. |
	| `[Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")>` | `[log](#log(java.lang.String))​(java.lang.String name)` | Logs elements flowing through the stream as well as completion and erroring. |
	| `[Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")>` | `[log](#log(java.lang.String,akka.event.LoggingAdapter))​(java.lang.String name,  [LoggingAdapter](../../event/LoggingAdapter.html "interface in akka.event") log)` | Logs elements flowing through the stream as well as completion and erroring. |
	| `[Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")>` | `[log](#log(java.lang.String,akka.japi.function.Function))​(java.lang.String name,  [Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](Flow.html "type parameter in Flow"),​java.lang.Object> extract)` | Logs elements flowing through the stream as well as completion and erroring. |
	| `[Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")>` | `[log](#log(java.lang.String,akka.japi.function.Function,akka.event.LoggingAdapter))​(java.lang.String name,  [Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](Flow.html "type parameter in Flow"),​java.lang.Object> extract,  [LoggingAdapter](../../event/LoggingAdapter.html "interface in akka.event") log)` | Logs elements flowing through the stream as well as completion and erroring. |
	| `[Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")>` | `[logWithMarker](#logWithMarker(java.lang.String,akka.japi.function.Function))​(java.lang.String name,  [Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](Flow.html "type parameter in Flow"),​[LogMarker](../../event/LogMarker.html "class in akka.event")> marker)` | Logs elements flowing through the stream as well as completion and erroring. |
	| `[Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")>` | `[logWithMarker](#logWithMarker(java.lang.String,akka.japi.function.Function,akka.event.MarkerLoggingAdapter))​(java.lang.String name,  [Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](Flow.html "type parameter in Flow"),​[LogMarker](../../event/LogMarker.html "class in akka.event")> marker,  [MarkerLoggingAdapter](../../event/MarkerLoggingAdapter.html "class in akka.event") log)` | Logs elements flowing through the stream as well as completion and erroring. |
	| `[Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")>` | `[logWithMarker](#logWithMarker(java.lang.String,akka.japi.function.Function,akka.japi.function.Function))​(java.lang.String name,  [Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](Flow.html "type parameter in Flow"),​[LogMarker](../../event/LogMarker.html "class in akka.event")> marker,  [Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](Flow.html "type parameter in Flow"),​java.lang.Object> extract)` | Logs elements flowing through the stream as well as completion and erroring. |
	| `[Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")>` | `[logWithMarker](#logWithMarker(java.lang.String,akka.japi.function.Function,akka.japi.function.Function,akka.event.MarkerLoggingAdapter))​(java.lang.String name,  [Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](Flow.html "type parameter in Flow"),​[LogMarker](../../event/LogMarker.html "class in akka.event")> marker,  [Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](Flow.html "type parameter in Flow"),​java.lang.Object> extract,  [MarkerLoggingAdapter](../../event/MarkerLoggingAdapter.html "class in akka.event") log)` | Logs elements flowing through the stream as well as completion and erroring. |
	| `<T> [Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​T,​[Mat](Flow.html "type parameter in Flow")>` | `[map](#map(akka.japi.function.Function))​([Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](Flow.html "type parameter in Flow"),​T> f)` | Transform this stream by applying the given function to each of the elements  as they pass through this processing step. |
	| `<T> [Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​T,​[Mat](Flow.html "type parameter in Flow")>` | `[mapAsync](#mapAsync(int,akka.japi.function.Function))​(int parallelism,  [Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](Flow.html "type parameter in Flow"),​java.util.concurrent.CompletionStage<T>> f)` | Transform this stream by applying the given function to each of the elements  as they pass through this processing step. |
	| `<T,​P>[Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​T,​[Mat](Flow.html "type parameter in Flow")>` | `[mapAsyncPartitioned](#mapAsyncPartitioned(int,int,akka.japi.function.Function,java.util.function.BiFunction))​(int parallelism,  int perPartition,  [Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](Flow.html "type parameter in Flow"),​P> partitioner,  java.util.function.BiFunction<[Out](Flow.html "type parameter in Flow"),​P,​java.util.concurrent.CompletionStage<T>> f)` | Transform this stream by partitioning elements based on the provided partitioner as they pass through this  processing step and then applying a given `CompletionStage`\-returning function to each element and its  partition key. |
	| `<T> [Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​T,​[Mat](Flow.html "type parameter in Flow")>` | `[mapAsyncUnordered](#mapAsyncUnordered(int,akka.japi.function.Function))​(int parallelism,  [Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](Flow.html "type parameter in Flow"),​java.util.concurrent.CompletionStage<T>> f)` | Transform this stream by applying the given function to each of the elements  as they pass through this processing step. |
	| `<T> [Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​T,​[Mat](Flow.html "type parameter in Flow")>` | `[mapConcat](#mapConcat(akka.japi.function.Function))​([Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](Flow.html "type parameter in Flow"),​java.lang.Iterable<T>> f)` | Transform each input element into an `Iterable` of output elements that is  then flattened into the output stream. |
	| `<E extends java.lang.Throwable>[Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")>` | `[mapError](#mapError(java.lang.Class,akka.japi.function.Function))​(java.lang.Class<E> clazz,  [Function](../../japi/function/Function.html "interface in akka.japi.function")<E,​java.lang.Throwable> f)` | While similar to [`recover(scala.PartialFunction<java.lang.Throwable,Out>)`](#recover(scala.PartialFunction)) this operator can be used to transform an error signal to a different one \*without\* logging  it as an error in the process. |
	| `[Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")>` | `[mapError](#mapError(scala.PartialFunction))​(scala.PartialFunction<java.lang.Throwable,​java.lang.Throwable> pf)` | While similar to [`recover(scala.PartialFunction<java.lang.Throwable,Out>)`](#recover(scala.PartialFunction)) this operator can be used to transform an error signal to a different one \*without\* logging  it as an error in the process. |
	| `<Mat2> [Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​Mat2>` | `[mapMaterializedValue](#mapMaterializedValue(akka.japi.function.Function))​([Function](../../japi/function/Function.html "interface in akka.japi.function")<[Mat](Flow.html "type parameter in Flow"),​Mat2> f)` | Transform only the materialized value of this Flow, leaving all other properties as they were. |
	| `<R,​T>[Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​T,​[Mat](Flow.html "type parameter in Flow")>` | `[mapWithResource](#mapWithResource(java.util.function.Supplier,java.util.function.BiFunction,java.util.function.Function))​(java.util.function.Supplier<R> create,  java.util.function.BiFunction<R,​[Out](Flow.html "type parameter in Flow"),​T> f,  java.util.function.Function<R,​java.util.Optional<T>> close)` | Transform each stream element with the help of a resource. |
	| `[Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")>` | `[merge](#merge(akka.stream.Graph))​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<[Out](Flow.html "type parameter in Flow")>,​?> that)` | Merge the given [`Source`](Source.html "class in akka.stream.javadsl") to this [`Flow`](Flow.html "class in akka.stream.javadsl"), taking elements as they arrive from input streams,  picking randomly when several elements ready. |
	| `[Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")>` | `[merge](#merge(akka.stream.Graph,boolean))​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<[Out](Flow.html "type parameter in Flow")>,​?> that,  boolean eagerComplete)` | Merge the given [`Source`](Source.html "class in akka.stream.javadsl") to this [`Flow`](Flow.html "class in akka.stream.javadsl"), taking elements as they arrive from input streams,  picking randomly when several elements ready. |
	| `[Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")>` | `[mergeAll](#mergeAll(java.util.List,boolean))​(java.util.List<? extends [Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<[Out](Flow.html "type parameter in Flow")>,​?>> those,  boolean eagerComplete)` | Merge the given [`Source`](Source.html "class in akka.stream.javadsl")s to this [`Flow`](Flow.html "class in akka.stream.javadsl"), taking elements as they arrive from input streams,  picking randomly when several elements ready. |
	| `[Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​java.util.List<[Out](Flow.html "type parameter in Flow")>,​[Mat](Flow.html "type parameter in Flow")>` | `[mergeLatest](#mergeLatest(akka.stream.Graph,boolean))​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<[Out](Flow.html "type parameter in Flow")>,​?> that,  boolean eagerComplete)` | MergeLatest joins elements from N input streams into stream of lists of size N. |
	| `<Mat2,​Mat3>[Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​java.util.List<[Out](Flow.html "type parameter in Flow")>,​Mat3>` | `[mergeLatestMat](#mergeLatestMat(akka.stream.Graph,boolean,akka.japi.function.Function2))​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<[Out](Flow.html "type parameter in Flow")>,​Mat2> that,  boolean eagerComplete,  [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<[Mat](Flow.html "type parameter in Flow"),​Mat2,​Mat3> matF)` | MergeLatest joins elements from N input streams into stream of lists of size N. |
	| `<M,​M2>[Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​M2>` | `[mergeMat](#mergeMat(akka.stream.Graph,akka.japi.function.Function2))​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<[Out](Flow.html "type parameter in Flow")>,​M> that,  [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<[Mat](Flow.html "type parameter in Flow"),​M,​M2> matF)` | Merge the given [`Source`](Source.html "class in akka.stream.javadsl") to this [`Flow`](Flow.html "class in akka.stream.javadsl"), taking elements as they arrive from input streams,  picking randomly when several elements ready. |
	| `<M,​M2>[Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​M2>` | `[mergeMat](#mergeMat(akka.stream.Graph,akka.japi.function.Function2,boolean))​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<[Out](Flow.html "type parameter in Flow")>,​M> that,  [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<[Mat](Flow.html "type parameter in Flow"),​M,​M2> matF,  boolean eagerComplete)` | Merge the given [`Source`](Source.html "class in akka.stream.javadsl") to this [`Flow`](Flow.html "class in akka.stream.javadsl"), taking elements as they arrive from input streams,  picking randomly when several elements ready. |
	| `[Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")>` | `[mergePreferred](#mergePreferred(akka.stream.Graph,boolean,boolean))​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<[Out](Flow.html "type parameter in Flow")>,​?> that,  boolean preferred,  boolean eagerComplete)` | Merge two sources. |
	| `<Mat2,​Mat3>[Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​Mat3>` | `[mergePreferredMat](#mergePreferredMat(akka.stream.Graph,boolean,boolean,akka.japi.function.Function2))​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<[Out](Flow.html "type parameter in Flow")>,​Mat2> that,  boolean preferred,  boolean eagerComplete,  [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<[Mat](Flow.html "type parameter in Flow"),​Mat2,​Mat3> matF)` | Merge two sources. |
	| `[Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")>` | `[mergePrioritized](#mergePrioritized(akka.stream.Graph,int,int,boolean))​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<[Out](Flow.html "type parameter in Flow")>,​?> that,  int leftPriority,  int rightPriority,  boolean eagerComplete)` | Merge two sources. |
	| `<Mat2,​Mat3>[Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​Mat3>` | `[mergePrioritizedMat](#mergePrioritizedMat(akka.stream.Graph,int,int,boolean,akka.japi.function.Function2))​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<[Out](Flow.html "type parameter in Flow")>,​Mat2> that,  int leftPriority,  int rightPriority,  boolean eagerComplete,  [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<[Mat](Flow.html "type parameter in Flow"),​Mat2,​Mat3> matF)` | Merge two sources. |
	| `<M> [Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")>` | `[mergeSorted](#mergeSorted(akka.stream.Graph,java.util.Comparator))​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<[Out](Flow.html "type parameter in Flow")>,​M> that,  java.util.Comparator<[Out](Flow.html "type parameter in Flow")> comp)` | Merge the given [`Source`](Source.html "class in akka.stream.javadsl") to this [`Flow`](Flow.html "class in akka.stream.javadsl"), taking elements as they arrive from input streams,  picking always the smallest of the available elements (waiting for one element from each side  to be available). |
	| `<Mat2,​Mat3>[Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​Mat3>` | `[mergeSortedMat](#mergeSortedMat(akka.stream.Graph,java.util.Comparator,akka.japi.function.Function2))​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<[Out](Flow.html "type parameter in Flow")>,​Mat2> that,  java.util.Comparator<[Out](Flow.html "type parameter in Flow")> comp,  [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<[Mat](Flow.html "type parameter in Flow"),​Mat2,​Mat3> matF)` | Merge the given [`Source`](Source.html "class in akka.stream.javadsl") to this [`Flow`](Flow.html "class in akka.stream.javadsl"), taking elements as they arrive from input streams,  picking always the smallest of the available elements (waiting for one element from each side  to be available). |
	| `[Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Pair](../../japi/Pair.html "class in akka.japi")<[Mat](Flow.html "type parameter in Flow"),​[FlowMonitor](../FlowMonitor.html "interface in akka.stream")<[Out](Flow.html "type parameter in Flow")>>>` | `[monitor](#monitor())()` | Materializes to `Pair>`, which is unlike most other operators (!),  in which usually the default materialized value keeping semantics is to keep the left value  (by passing `Keep.left()` to a `*Mat` version of a method). |
	| `<M> [Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​M>` | `[monitorMat](#monitorMat(akka.japi.function.Function2))​([Function2](../../japi/function/Function2.html "interface in akka.japi.function")<[Mat](Flow.html "type parameter in Flow"),​[FlowMonitor](../FlowMonitor.html "interface in akka.stream")<[Out](Flow.html "type parameter in Flow")>,​M> combine)` | Materializes to `FlowMonitor[Out]` that allows monitoring of the current flow. |
	| `[Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")>` | `[named](#named(java.lang.String))​(java.lang.String name)` | Add a name attribute to this Flow. |
	| `static <T> [Flow](Flow.html "class in akka.stream.javadsl")<T,​T,​[NotUsed](../../NotUsed.html "class in akka")>` | `[of](#of(java.lang.Class))​(java.lang.Class<T> clazz)` | Create a \`Flow\` which can process elements of type \`T\`. |
	| `[Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")>` | `[onErrorComplete](#onErrorComplete())()` | onErrorComplete allows to complete the stream when an upstream error occurs. |
	| `[Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")>` | `[onErrorComplete](#onErrorComplete(java.lang.Class))​(java.lang.Class<? extends java.lang.Throwable> clazz)` | onErrorComplete allows to complete the stream when an upstream error occurs. |
	| `[Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")>` | `[onErrorComplete](#onErrorComplete(java.util.function.Predicate))​(java.util.function.Predicate<? super java.lang.Throwable> predicate)` | onErrorComplete allows to complete the stream when an upstream error occurs. |
	| `<M> [Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")>` | `[orElse](#orElse(akka.stream.Graph))​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<[Out](Flow.html "type parameter in Flow")>,​M> secondary)` | Provides a secondary source that will be consumed if this source completes without any  elements passing by. |
	| `<M2,​M3>[Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​M3>` | `[orElseMat](#orElseMat(akka.stream.Graph,akka.japi.function.Function2))​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<[Out](Flow.html "type parameter in Flow")>,​M2> secondary,  [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<[Mat](Flow.html "type parameter in Flow"),​M2,​M3> matF)` | Provides a secondary source that will be consumed if this source completes without any  elements passing by. |
	| `[Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Pair](../../japi/Pair.html "class in akka.japi")<java.util.List<[Out](Flow.html "type parameter in Flow")>,​[Source](Source.html "class in akka.stream.javadsl")<[Out](Flow.html "type parameter in Flow"),​[NotUsed](../../NotUsed.html "class in akka")>>,​[Mat](Flow.html "type parameter in Flow")>` | `[prefixAndTail](#prefixAndTail(int))​(int n)` | Takes up to `n` elements from the stream (less than `n` if the upstream completes before emitting `n` elements)  and returns a pair containing a strict sequence of the taken element  and a stream representing the remaining elements. |
	| `[Pair](../../japi/Pair.html "class in akka.japi")<[Mat](Flow.html "type parameter in Flow"),​[Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[NotUsed](../../NotUsed.html "class in akka")>>` | `[preMaterialize](#preMaterialize(akka.actor.ClassicActorSystemProvider))​([ClassicActorSystemProvider](../../actor/ClassicActorSystemProvider.html "interface in akka.actor") systemProvider)` | Materializes this [`Flow`](Flow.html "class in akka.stream.javadsl"), immediately returning (1\) its materialized value, and (2\) a newly materialized [`Flow`](Flow.html "class in akka.stream.javadsl"). |
	| `[Pair](../../japi/Pair.html "class in akka.japi")<[Mat](Flow.html "type parameter in Flow"),​[Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[NotUsed](../../NotUsed.html "class in akka")>>` | `[preMaterialize](#preMaterialize(akka.stream.Materializer))​([Materializer](../Materializer.html "class in akka.stream") materializer)` | Materializes this [`Flow`](Flow.html "class in akka.stream.javadsl"), immediately returning (1\) its materialized value, and (2\) a newly materialized [`Flow`](Flow.html "class in akka.stream.javadsl"). |
	| `<M> [Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")>` | `[prepend](#prepend(akka.stream.Graph))​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<[Out](Flow.html "type parameter in Flow")>,​M> that)` | Prepend the given [`Source`](Source.html "class in akka.stream.javadsl") to this [`Flow`](Flow.html "class in akka.stream.javadsl"), meaning that before elements  are generated from this Flow, the Source's elements will be produced until it  is exhausted, at which point Flow elements will start being produced. |
	| `<M> [Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")>` | `[prependLazy](#prependLazy(akka.stream.Graph))​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<[Out](Flow.html "type parameter in Flow")>,​M> that)` | Prepend the given [`Source`](Source.html "class in akka.stream.javadsl") to this [`Flow`](Flow.html "class in akka.stream.javadsl"), meaning that before elements  are generated from this Flow, the Source's elements will be produced until it  is exhausted, at which point Flow elements will start being produced. |
	| `<M,​M2>[Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​M2>` | `[prependLazyMat](#prependLazyMat(akka.stream.Graph,akka.japi.function.Function2))​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<[Out](Flow.html "type parameter in Flow")>,​M> that,  [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<[Mat](Flow.html "type parameter in Flow"),​M,​M2> matF)` | Prepend the given [`Source`](Source.html "class in akka.stream.javadsl") to this [`Flow`](Flow.html "class in akka.stream.javadsl"), meaning that before elements  are generated from this Flow, the Source's elements will be produced until it  is exhausted, at which point Flow elements will start being produced. |
	| `<M,​M2>[Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​M2>` | `[prependMat](#prependMat(akka.stream.Graph,akka.japi.function.Function2))​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<[Out](Flow.html "type parameter in Flow")>,​M> that,  [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<[Mat](Flow.html "type parameter in Flow"),​M,​M2> matF)` | Prepend the given [`Source`](Source.html "class in akka.stream.javadsl") to this [`Flow`](Flow.html "class in akka.stream.javadsl"), meaning that before elements  are generated from this Flow, the Source's elements will be produced until it  is exhausted, at which point Flow elements will start being produced. |
	| `[Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")>` | `[recover](#recover(java.lang.Class,java.util.function.Supplier))​(java.lang.Class<? extends java.lang.Throwable> clazz,  java.util.function.Supplier<[Out](Flow.html "type parameter in Flow")> supplier)` | Recover allows to send last element on failure and gracefully complete the stream  Since the underlying failure signal onError arrives out\-of\-band, it might jump over existing elements. |
	| `[Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")>` | `[recover](#recover(scala.PartialFunction))​(scala.PartialFunction<java.lang.Throwable,​[Out](Flow.html "type parameter in Flow")> pf)` | Recover allows to send last element on failure and gracefully complete the stream  Since the underlying failure signal onError arrives out\-of\-band, it might jump over existing elements. |
	| `[Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")>` | `[recoverWith](#recoverWith(java.lang.Class,java.util.function.Supplier))​(java.lang.Class<? extends java.lang.Throwable> clazz,  java.util.function.Supplier<[Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<[Out](Flow.html "type parameter in Flow")>,​[NotUsed](../../NotUsed.html "class in akka")>> supplier)` | Deprecated. use `recoverWithRetries` instead |
	| `[Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")>` | `[recoverWith](#recoverWith(scala.PartialFunction))​(scala.PartialFunction<java.lang.Throwable,​? extends [Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<[Out](Flow.html "type parameter in Flow")>,​[NotUsed](../../NotUsed.html "class in akka")>> pf)` | RecoverWith allows to switch to alternative Source on flow failure. |
	| `[Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")>` | `[recoverWithRetries](#recoverWithRetries(int,java.lang.Class,java.util.function.Supplier))​(int attempts,  java.lang.Class<? extends java.lang.Throwable> clazz,  java.util.function.Supplier<[Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<[Out](Flow.html "type parameter in Flow")>,​[NotUsed](../../NotUsed.html "class in akka")>> supplier)` | RecoverWithRetries allows to switch to alternative Source on flow failure. |
	| `[Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")>` | `[recoverWithRetries](#recoverWithRetries(int,scala.PartialFunction))​(int attempts,  scala.PartialFunction<java.lang.Throwable,​[Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<[Out](Flow.html "type parameter in Flow")>,​[NotUsed](../../NotUsed.html "class in akka")>> pf)` | RecoverWithRetries allows to switch to alternative Source on flow failure. |
	| `[Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")>` | `[reduce](#reduce(akka.japi.function.Function2))​([Function2](../../japi/function/Function2.html "interface in akka.japi.function")<[Out](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow")> f)` | Similar to `fold` but uses first element as zero element. |
	| `<T,​U>[Pair](../../japi/Pair.html "class in akka.japi")<T,​U>` | `[runWith](#runWith(akka.stream.Graph,akka.stream.Graph,akka.actor.ClassicActorSystemProvider))​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<[In](Flow.html "type parameter in Flow")>,​T> source,  [Graph](../Graph.html "interface in akka.stream")<[SinkShape](../SinkShape.html "class in akka.stream")<[Out](Flow.html "type parameter in Flow")>,​U> sink,  [ClassicActorSystemProvider](../../actor/ClassicActorSystemProvider.html "interface in akka.actor") systemProvider)` | Connect the `Source` to this `Flow` and then connect it to the `Sink` and run it. |
	| `<T,​U>[Pair](../../japi/Pair.html "class in akka.japi")<T,​U>` | `[runWith](#runWith(akka.stream.Graph,akka.stream.Graph,akka.stream.Materializer))​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<[In](Flow.html "type parameter in Flow")>,​T> source,  [Graph](../Graph.html "interface in akka.stream")<[SinkShape](../SinkShape.html "class in akka.stream")<[Out](Flow.html "type parameter in Flow")>,​U> sink,  [Materializer](../Materializer.html "class in akka.stream") materializer)` | Connect the `Source` to this `Flow` and then connect it to the `Sink` and run it. |
	| `<T> [Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​T,​[Mat](Flow.html "type parameter in Flow")>` | `[scan](#scan(T,akka.japi.function.Function2))​(T zero,  [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<T,​[Out](Flow.html "type parameter in Flow"),​T> f)` | Similar to `fold` but is not a terminal operation,  emits its current value which starts at `zero` and then  applies the current and next value to the given function `f`,  emitting the next current value. |
	| `<T> [Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​T,​[Mat](Flow.html "type parameter in Flow")>` | `[scanAsync](#scanAsync(T,akka.japi.function.Function2))​(T zero,  [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<T,​[Out](Flow.html "type parameter in Flow"),​java.util.concurrent.CompletionStage<T>> f)` | Similar to `scan` but with a asynchronous function,  emits its current value which starts at `zero` and then  applies the current and next value to the given function `f`,  emitting a `Future` that resolves to the next current value. |
	| `static <I,​O,​M>[Flow](Flow.html "class in akka.stream.javadsl")<I,​O,​java.util.concurrent.CompletionStage<M>>` | `[setup](#setup(java.util.function.BiFunction))​(java.util.function.BiFunction<[ActorMaterializer](../ActorMaterializer.html "class in akka.stream"),​[Attributes](../Attributes.html "class in akka.stream"),​[Flow](Flow.html "class in akka.stream.javadsl")<I,​O,​M>> factory)` | Deprecated. Use 'fromMaterializer' instead. |
	| `[FlowShape](../FlowShape.html "class in akka.stream")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow")>` | `[shape](#shape())()` | The shape of a graph is all that is externally visible: its inlets and outlets. |
	| `[Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​java.util.List<[Out](Flow.html "type parameter in Flow")>,​[Mat](Flow.html "type parameter in Flow")>` | `[sliding](#sliding(int,int))​(int n,  int step)` | Apply a sliding window over the stream and return the windows as groups of elements, with the last group  possibly smaller than requested due to end\-of\-stream. |
	| `int` | `[sliding$default$2](#sliding$default$2())()` |  |
	| `[SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")>` | `[splitAfter](#splitAfter(akka.japi.function.Predicate))​([Predicate](../../japi/function/Predicate.html "interface in akka.japi.function")<[Out](Flow.html "type parameter in Flow")> p)` | This operation applies the given predicate to all incoming elements and  emits them to a stream of output streams. |
	| `[SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")>` | `[splitAfter](#splitAfter(akka.stream.SubstreamCancelStrategy,akka.japi.function.Predicate))​([SubstreamCancelStrategy](../SubstreamCancelStrategy.html "class in akka.stream") substreamCancelStrategy,  [Predicate](../../japi/function/Predicate.html "interface in akka.japi.function")<[Out](Flow.html "type parameter in Flow")> p)` | This operation applies the given predicate to all incoming elements and  emits them to a stream of output streams. |
	| `[SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")>` | `[splitWhen](#splitWhen(akka.japi.function.Predicate))​([Predicate](../../japi/function/Predicate.html "interface in akka.japi.function")<[Out](Flow.html "type parameter in Flow")> p)` | This operation applies the given predicate to all incoming elements and  emits them to a stream of output streams, always beginning a new one with  the current element if the given predicate returns true for it. |
	| `[SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")>` | `[splitWhen](#splitWhen(akka.stream.SubstreamCancelStrategy,akka.japi.function.Predicate))​([SubstreamCancelStrategy](../SubstreamCancelStrategy.html "class in akka.stream") substreamCancelStrategy,  [Predicate](../../japi/function/Predicate.html "interface in akka.japi.function")<[Out](Flow.html "type parameter in Flow")> p)` | This operation applies the given predicate to all incoming elements and  emits them to a stream of output streams, always beginning a new one with  the current element if the given predicate returns true for it. |
	| `<S,​T>[Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​T,​[Mat](Flow.html "type parameter in Flow")>` | `[statefulMap](#statefulMap(akka.japi.function.Creator,akka.japi.function.Function2,akka.japi.function.Function))​([Creator](../../japi/function/Creator.html "interface in akka.japi.function")<S> create,  [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<S,​[Out](Flow.html "type parameter in Flow"),​[Pair](../../japi/Pair.html "class in akka.japi")<S,​T>> f,  [Function](../../japi/function/Function.html "interface in akka.japi.function")<S,​java.util.Optional<T>> onComplete)` | Transform each stream element with the help of a state. |
	| `<T> [Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​T,​[Mat](Flow.html "type parameter in Flow")>` | `[statefulMapConcat](#statefulMapConcat(akka.japi.function.Creator))​([Creator](../../japi/function/Creator.html "interface in akka.japi.function")<[Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](Flow.html "type parameter in Flow"),​java.lang.Iterable<T>>> f)` | Transform each input element into an `Iterable` of output elements that is  then flattened into the output stream. |
	| `[Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")>` | `[take](#take(long))​(long n)` | Terminate processing (and cancel the upstream publisher) after the given  number of elements. |
	| `[Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")>` | `[takeWhile](#takeWhile(akka.japi.function.Predicate))​([Predicate](../../japi/function/Predicate.html "interface in akka.japi.function")<[Out](Flow.html "type parameter in Flow")> p)` | Terminate processing (and cancel the upstream publisher) after predicate  returns false for the first time. |
	| `[Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")>` | `[takeWhile](#takeWhile(akka.japi.function.Predicate,boolean))​([Predicate](../../japi/function/Predicate.html "interface in akka.japi.function")<[Out](Flow.html "type parameter in Flow")> p,  boolean inclusive)` | Terminate processing (and cancel the upstream publisher) after predicate  returns false for the first time. |
	| `[Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")>` | `[takeWithin](#takeWithin(java.time.Duration))​(java.time.Duration duration)` | Terminate processing (and cancel the upstream publisher) after the given  duration. |
	| `[Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")>` | `[throttle](#throttle(int,java.time.Duration))​(int elements,  java.time.Duration per)` | Sends elements downstream with speed limited to `elements/per`. |
	| `[Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")>` | `[throttle](#throttle(int,java.time.Duration,int,akka.japi.function.Function,akka.stream.ThrottleMode))​(int cost,  java.time.Duration per,  int maximumBurst,  [Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](Flow.html "type parameter in Flow"),​java.lang.Integer> costCalculation,  [ThrottleMode](../ThrottleMode.html "class in akka.stream") mode)` | Sends elements downstream with speed limited to `cost/per`. |
	| `[Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")>` | `[throttle](#throttle(int,java.time.Duration,int,akka.stream.ThrottleMode))​(int elements,  java.time.Duration per,  int maximumBurst,  [ThrottleMode](../ThrottleMode.html "class in akka.stream") mode)` | Sends elements downstream with speed limited to `elements/per`. |
	| `[Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")>` | `[throttle](#throttle(int,java.time.Duration,akka.japi.function.Function))​(int cost,  java.time.Duration per,  [Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](Flow.html "type parameter in Flow"),​java.lang.Integer> costCalculation)` | Sends elements downstream with speed limited to `cost/per`. |
	| `[Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")>` | `[throttle](#throttle(akka.stream.javadsl.ThrottleControl))​([ThrottleControl](ThrottleControl.html "class in akka.stream.javadsl") control)` | The `ThrottleControl` can be updated to change the throttle rate from the outside of the stream  and share a total rate limit between several streams. |
	| `[Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")>` | `[throttle](#throttle(akka.stream.javadsl.ThrottleControl,akka.japi.function.Function))​([ThrottleControl](ThrottleControl.html "class in akka.stream.javadsl") control,  [Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](Flow.html "type parameter in Flow"),​java.lang.Integer> costCalculation)` | The `ThrottleControl` can be updated to change the throttle rate from the outside of the stream  and share a total rate limit between several streams. |
	| `[Sink](Sink.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")>` | `[to](#to(akka.stream.Graph))​([Graph](../Graph.html "interface in akka.stream")<[SinkShape](../SinkShape.html "class in akka.stream")<[Out](Flow.html "type parameter in Flow")>,​?> sink)` | Connect this [`Flow`](Flow.html "class in akka.stream.javadsl") to a [`Sink`](Sink.html "class in akka.stream.javadsl"), concatenating the processing steps of both. |
	| `<M,​M2>[Sink](Sink.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​M2>` | `[toMat](#toMat(akka.stream.Graph,akka.japi.function.Function2))​([Graph](../Graph.html "interface in akka.stream")<[SinkShape](../SinkShape.html "class in akka.stream")<[Out](Flow.html "type parameter in Flow")>,​M> sink,  [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<[Mat](Flow.html "type parameter in Flow"),​M,​M2> combine)` | Connect this [`Flow`](Flow.html "class in akka.stream.javadsl") to a [`Sink`](Sink.html "class in akka.stream.javadsl"), concatenating the processing steps of both. |
	| `[RunnableGraph](RunnableGraph.html "class in akka.stream.javadsl")<org.reactivestreams.Processor<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow")>>` | `[toProcessor](#toProcessor())()` | Converts this Flow to a [`RunnableGraph`](RunnableGraph.html "class in akka.stream.javadsl") that materializes to a Reactive Streams `Processor`  which implements the operations encapsulated by this Flow. |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `akka.stream.impl.LinearTraversalBuilder` | `[traversalBuilder](#traversalBuilder())()` | INTERNAL API. |
	| `static <In,​SuperOut,​Out extends SuperOut,​M>[Flow](Flow.html "class in akka.stream.javadsl")<In,​SuperOut,​M>` | `[upcast](#upcast(akka.stream.javadsl.Flow))​([Flow](Flow.html "class in akka.stream.javadsl")<In,​Out,​M> flow)` | Upcast a stream of elements to a stream of supertypes of that element. |
	| `<T,​M>[Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​T,​[Mat](Flow.html "type parameter in Flow")>` | `[via](#via(akka.stream.Graph))​([Graph](../Graph.html "interface in akka.stream")<[FlowShape](../FlowShape.html "class in akka.stream")<[Out](Flow.html "type parameter in Flow"),​T>,​M> flow)` | Transform this [`Flow`](Flow.html "class in akka.stream.javadsl") by appending the given processing steps. |
	| `<T,​M,​M2>[Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​T,​M2>` | `[viaMat](#viaMat(akka.stream.Graph,akka.japi.function.Function2))​([Graph](../Graph.html "interface in akka.stream")<[FlowShape](../FlowShape.html "class in akka.stream")<[Out](Flow.html "type parameter in Flow"),​T>,​M> flow,  [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<[Mat](Flow.html "type parameter in Flow"),​M,​M2> combine)` | Transform this [`Flow`](Flow.html "class in akka.stream.javadsl") by appending the given processing steps. |
	| `[Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")>` | `[watch](#watch(akka.actor.ActorRef))​([ActorRef](../../actor/ActorRef.html "class in akka.actor") ref)` | The operator fails with an [`WatchedActorTerminatedException`](../WatchedActorTerminatedException.html "class in akka.stream") if the target actor is terminated. |
	| `<M> [Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​M>` | `[watchTermination](#watchTermination(akka.japi.function.Function2))​([Function2](../../japi/function/Function2.html "interface in akka.japi.function")<[Mat](Flow.html "type parameter in Flow"),​java.util.concurrent.CompletionStage<[Done](../../Done.html "class in akka")>,​M> matF)` | Materializes to `CompletionStage` that completes on getting termination message. |
	| `[Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")>` | `[wireTap](#wireTap(akka.japi.function.Procedure))​([Procedure](../../japi/function/Procedure.html "interface in akka.japi.function")<[Out](Flow.html "type parameter in Flow")> f)` | This is a simplified version of `wireTap(Sink)` that takes only a simple procedure. |
	| `[Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")>` | `[wireTap](#wireTap(akka.stream.Graph))​([Graph](../Graph.html "interface in akka.stream")<[SinkShape](../SinkShape.html "class in akka.stream")<[Out](Flow.html "type parameter in Flow")>,​?> that)` | Attaches the given [`Sink`](Sink.html "class in akka.stream.javadsl") to this [`Flow`](Flow.html "class in akka.stream.javadsl") as a wire tap, meaning that elements that pass  through will also be sent to the wire\-tap Sink, without the latter affecting the mainline flow. |
	| `<M2,​M3>[Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​M3>` | `[wireTapMat](#wireTapMat(akka.stream.Graph,akka.japi.function.Function2))​([Graph](../Graph.html "interface in akka.stream")<[SinkShape](../SinkShape.html "class in akka.stream")<[Out](Flow.html "type parameter in Flow")>,​M2> that,  [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<[Mat](Flow.html "type parameter in Flow"),​M2,​M3> matF)` | Attaches the given [`Sink`](Sink.html "class in akka.stream.javadsl") to this [`Flow`](Flow.html "class in akka.stream.javadsl") as a wire tap, meaning that elements that pass  through will also be sent to the wire\-tap Sink, without the latter affecting the mainline flow. |
	| `[Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")>` | `[withAttributes](#withAttributes(akka.stream.Attributes))​([Attributes](../Attributes.html "class in akka.stream") attr)` | Replace the attributes of this [`Flow`](Flow.html "class in akka.stream.javadsl") with the given ones. |
	| `<T> [Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Pair](../../japi/Pair.html "class in akka.japi")<[Out](Flow.html "type parameter in Flow"),​T>,​[Mat](Flow.html "type parameter in Flow")>` | `[zip](#zip(akka.stream.Graph))​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<T>,​?> source)` | Combine the elements of current [`Flow`](Flow.html "class in akka.stream.javadsl") and the given [`Source`](Source.html "class in akka.stream.javadsl") into a stream of tuples. |
	| `<U,​A>[Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Pair](../../japi/Pair.html "class in akka.japi")<A,​U>,​[Mat](Flow.html "type parameter in Flow")>` | `[zipAll](#zipAll(akka.stream.Graph,A,U))​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<U>,​?> that,  A thisElem,  U thatElem)` | Combine the elements of current flow and the given [`Source`](Source.html "class in akka.stream.javadsl") into a stream of tuples. |
	| `<U,​Mat2,​Mat3,​A>[Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Pair](../../japi/Pair.html "class in akka.japi")<A,​U>,​Mat3>` | `[zipAllMat](#zipAllMat(akka.stream.Graph,A,U,scala.Function2))​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<U>,​Mat2> that,  A thisElem,  U thatElem,  scala.Function2<[Mat](Flow.html "type parameter in Flow"),​Mat2,​Mat3> matF)` | Combine the elements of current flow and the given [`Source`](Source.html "class in akka.stream.javadsl") into a stream of tuples. |
	| `<T> [Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Pair](../../japi/Pair.html "class in akka.japi")<[Out](Flow.html "type parameter in Flow"),​T>,​[Mat](Flow.html "type parameter in Flow")>` | `[zipLatest](#zipLatest(akka.stream.Graph))​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<T>,​?> source)` | Combine the elements of 2 streams into a stream of tuples, picking always the latest element of each. |
	| `<T,​M,​M2>[Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Pair](../../japi/Pair.html "class in akka.japi")<[Out](Flow.html "type parameter in Flow"),​T>,​M2>` | `[zipLatestMat](#zipLatestMat(akka.stream.Graph,akka.japi.function.Function2))​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<T>,​M> that,  [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<[Mat](Flow.html "type parameter in Flow"),​M,​M2> matF)` | Combine the elements of current [`Flow`](Flow.html "class in akka.stream.javadsl") and the given [`Source`](Source.html "class in akka.stream.javadsl") into a stream of tuples, picking always the latest element of each. |
	| `<Out2,​Out3>[Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​Out3,​[Mat](Flow.html "type parameter in Flow")>` | `[zipLatestWith](#zipLatestWith(akka.stream.Graph,boolean,akka.japi.function.Function2))​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<Out2>,​?> that,  boolean eagerComplete,  [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<[Out](Flow.html "type parameter in Flow"),​Out2,​Out3> combine)` | Combine the elements of multiple streams into a stream of combined elements using a combiner function,  picking always the latest of the elements of each source. |
	| `<Out2,​Out3>[Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​Out3,​[Mat](Flow.html "type parameter in Flow")>` | `[zipLatestWith](#zipLatestWith(akka.stream.Graph,akka.japi.function.Function2))​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<Out2>,​?> that,  [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<[Out](Flow.html "type parameter in Flow"),​Out2,​Out3> combine)` | Combine the elements of multiple streams into a stream of combined elements using a combiner function,  picking always the latest of the elements of each source. |
	| `<Out2,​Out3,​M,​M2>[Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​Out3,​M2>` | `[zipLatestWithMat](#zipLatestWithMat(akka.stream.Graph,boolean,akka.japi.function.Function2,akka.japi.function.Function2))​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<Out2>,​M> that,  boolean eagerComplete,  [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<[Out](Flow.html "type parameter in Flow"),​Out2,​Out3> combine,  [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<[Mat](Flow.html "type parameter in Flow"),​M,​M2> matF)` | Put together the elements of current [`Flow`](Flow.html "class in akka.stream.javadsl") and the given [`Source`](Source.html "class in akka.stream.javadsl")  into a stream of combined elements using a combiner function, picking always the latest element of each. |
	| `<Out2,​Out3,​M,​M2>[Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​Out3,​M2>` | `[zipLatestWithMat](#zipLatestWithMat(akka.stream.Graph,akka.japi.function.Function2,akka.japi.function.Function2))​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<Out2>,​M> that,  [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<[Out](Flow.html "type parameter in Flow"),​Out2,​Out3> combine,  [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<[Mat](Flow.html "type parameter in Flow"),​M,​M2> matF)` | Put together the elements of current [`Flow`](Flow.html "class in akka.stream.javadsl") and the given [`Source`](Source.html "class in akka.stream.javadsl")  into a stream of combined elements using a combiner function, picking always the latest element of each. |
	| `<T,​M,​M2>[Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Pair](../../japi/Pair.html "class in akka.japi")<[Out](Flow.html "type parameter in Flow"),​T>,​M2>` | `[zipMat](#zipMat(akka.stream.Graph,akka.japi.function.Function2))​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<T>,​M> that,  [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<[Mat](Flow.html "type parameter in Flow"),​M,​M2> matF)` | Combine the elements of current [`Flow`](Flow.html "class in akka.stream.javadsl") and the given [`Source`](Source.html "class in akka.stream.javadsl") into a stream of tuples. |
	| `<Out2,​Out3>[Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​Out3,​[Mat](Flow.html "type parameter in Flow")>` | `[zipWith](#zipWith(akka.stream.Graph,akka.japi.function.Function2))​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<Out2>,​?> that,  [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<[Out](Flow.html "type parameter in Flow"),​Out2,​Out3> combine)` | Put together the elements of current [`Flow`](Flow.html "class in akka.stream.javadsl") and the given [`Source`](Source.html "class in akka.stream.javadsl")  into a stream of combined elements using a combiner function. |
	| `[Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Pair](../../japi/Pair.html "class in akka.japi")<[Out](Flow.html "type parameter in Flow"),​java.lang.Long>,​[Mat](Flow.html "type parameter in Flow")>` | `[zipWithIndex](#zipWithIndex())()` | Combine the elements of current flow into a stream of tuples consisting  of all elements paired with their index. |
	| `<Out2,​Out3,​M,​M2>[Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​Out3,​M2>` | `[zipWithMat](#zipWithMat(akka.stream.Graph,akka.japi.function.Function2,akka.japi.function.Function2))​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<Out2>,​M> that,  [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<[Out](Flow.html "type parameter in Flow"),​Out2,​Out3> combine,  [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<[Mat](Flow.html "type parameter in Flow"),​M,​M2> matF)` | Put together the elements of current [`Flow`](Flow.html "class in akka.stream.javadsl") and the given [`Source`](Source.html "class in akka.stream.javadsl")  into a stream of combined elements using a combiner function. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### Flow
		
		
		
		```
		public Flow​([Flow](../scaladsl/Flow.html "class in akka.stream.scaladsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")> delegate)
		```

	- ### Method Detail
	
	
	
		- #### create
		
		
		
		```
		public static <T> [Flow](Flow.html "class in akka.stream.javadsl")<T,​T,​[NotUsed](../../NotUsed.html "class in akka")> create()
		```
		
		Create a \`Flow\` which can process elements of type \`T\`.
		- #### fromProcessor
		
		
		
		```
		public static <I,​O> [Flow](Flow.html "class in akka.stream.javadsl")<I,​O,​[NotUsed](../../NotUsed.html "class in akka")> fromProcessor​([Creator](../../japi/function/Creator.html "interface in akka.japi.function")<org.reactivestreams.Processor<I,​O>> processorFactory)
		```
		- #### fromProcessorMat
		
		
		
		```
		public static <I,​O,​Mat> [Flow](Flow.html "class in akka.stream.javadsl")<I,​O,​Mat> fromProcessorMat​([Creator](../../japi/function/Creator.html "interface in akka.japi.function")<[Pair](../../japi/Pair.html "class in akka.japi")<org.reactivestreams.Processor<I,​O>,​Mat>> processorFactory)
		```
		- #### fromFunction
		
		
		
		```
		public static <I,​O> [Flow](Flow.html "class in akka.stream.javadsl")<I,​O,​[NotUsed](../../NotUsed.html "class in akka")> fromFunction​([Function](../../japi/function/Function.html "interface in akka.japi.function")<I,​O> f)
		```
		
		Creates a \[Flow] which will use the given function to transform its inputs to outputs. It is equivalent
		 to `Flow.create[T].map(f)`
		- #### of
		
		
		
		```
		public static <T> [Flow](Flow.html "class in akka.stream.javadsl")<T,​T,​[NotUsed](../../NotUsed.html "class in akka")> of​(java.lang.Class<T> clazz)
		```
		
		Create a \`Flow\` which can process elements of type \`T\`.
		- #### fromGraph
		
		
		
		```
		public static <I,​O,​M> [Flow](Flow.html "class in akka.stream.javadsl")<I,​O,​M> fromGraph​([Graph](../Graph.html "interface in akka.stream")<[FlowShape](../FlowShape.html "class in akka.stream")<I,​O>,​M> g)
		```
		
		A graph with the shape of a flow logically is a flow, this method makes it so also in type.
		- #### fromMaterializer
		
		
		
		```
		public static <I,​O,​M> [Flow](Flow.html "class in akka.stream.javadsl")<I,​O,​java.util.concurrent.CompletionStage<M>> fromMaterializer​(java.util.function.BiFunction<[Materializer](../Materializer.html "class in akka.stream"),​[Attributes](../Attributes.html "class in akka.stream"),​[Flow](Flow.html "class in akka.stream.javadsl")<I,​O,​M>> factory)
		```
		
		Defers the creation of a [`Flow`](Flow.html "class in akka.stream.javadsl") until materialization. The `factory` function
		 exposes `Materializer` which is going to be used during materialization and
		 `Attributes` of the [`Flow`](Flow.html "class in akka.stream.javadsl") returned by this method.
		- #### setup
		
		
		
		```
		public static <I,​O,​M> [Flow](Flow.html "class in akka.stream.javadsl")<I,​O,​java.util.concurrent.CompletionStage<M>> setup​(java.util.function.BiFunction<[ActorMaterializer](../ActorMaterializer.html "class in akka.stream"),​[Attributes](../Attributes.html "class in akka.stream"),​[Flow](Flow.html "class in akka.stream.javadsl")<I,​O,​M>> factory)
		```
		
		Deprecated.
		Use 'fromMaterializer' instead. Since 2\.6\.0\.
		
		Defers the creation of a [`Flow`](Flow.html "class in akka.stream.javadsl") until materialization. The `factory` function
		 exposes `ActorMaterializer` which is going to be used during materialization and
		 `Attributes` of the [`Flow`](Flow.html "class in akka.stream.javadsl") returned by this method.
		- #### fromSinkAndSource
		
		
		
		```
		public static <I,​O> [Flow](Flow.html "class in akka.stream.javadsl")<I,​O,​[NotUsed](../../NotUsed.html "class in akka")> fromSinkAndSource​([Graph](../Graph.html "interface in akka.stream")<[SinkShape](../SinkShape.html "class in akka.stream")<I>,​?> sink,
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
		 
		
		
		 See also [`<I,O,M1,M2,M>fromSinkAndSourceMat(akka.stream.Graph<akka.stream.SinkShape<I>,M1>,akka.stream.Graph<akka.stream.SourceShape<O>,M2>,akka.japi.function.Function2<M1,M2,M>)`](#fromSinkAndSourceMat(akka.stream.Graph,akka.stream.Graph,akka.japi.function.Function2)) when access to materialized values of the parameters is needed.
		- #### fromSinkAndSourceMat
		
		
		
		```
		public static <I,​O,​M1,​M2,​M> [Flow](Flow.html "class in akka.stream.javadsl")<I,​O,​M> fromSinkAndSourceMat​([Graph](../Graph.html "interface in akka.stream")<[SinkShape](../SinkShape.html "class in akka.stream")<I>,​M1> sink,
		                                                                                                 [Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<O>,​M2> source,
		                                                                                                 [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<M1,​M2,​M> combine)
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
		 into the materialized value of the resulting [`Flow`](Flow.html "class in akka.stream.javadsl").
		- #### fromSinkAndSourceCoupled
		
		
		
		```
		public static <I,​O> [Flow](Flow.html "class in akka.stream.javadsl")<I,​O,​[NotUsed](../../NotUsed.html "class in akka")> fromSinkAndSourceCoupled​([Graph](../Graph.html "interface in akka.stream")<[SinkShape](../SinkShape.html "class in akka.stream")<I>,​?> sink,
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
		
		
		 E.g. if the emitted [`Flow`](Flow.html "class in akka.stream.javadsl") gets a cancellation, the [`Source`](Source.html "class in akka.stream.javadsl") of course is cancelled,
		 however the Sink will also be completed. The table below illustrates the effects in detail:
		 
		
		
		
		
		
		
		| Returned Flow | Sink (`in`) | Source (`out`) |
		| --- | --- | --- |
		| *cause:* upstream (sink\-side) receives completion | *effect:* receives completion | *effect:* receives cancel |
		| *cause:* upstream (sink\-side) receives error | *effect:* receives error | *effect:* receives cancel |
		| *cause:* downstream (source\-side) receives cancel | *effect:* completes | *effect:* receives cancel |
		| *effect:* cancels upstream, completes downstream | *effect:* completes | *cause:* signals complete |
		| *effect:* cancels upstream, errors downstream | *effect:* receives error | *cause:* signals error or throws |
		| *effect:* cancels upstream, completes downstream | *cause:* cancels | *effect:* receives cancel |
		
		
		
		 See also [`<I,O,M1,M2,M>fromSinkAndSourceCoupledMat(akka.stream.Graph<akka.stream.SinkShape<I>,M1>,akka.stream.Graph<akka.stream.SourceShape<O>,M2>,akka.japi.function.Function2<M1,M2,M>)`](#fromSinkAndSourceCoupledMat(akka.stream.Graph,akka.stream.Graph,akka.japi.function.Function2)) when access to materialized values of the parameters is needed.
		- #### fromSinkAndSourceCoupledMat
		
		
		
		```
		public static <I,​O,​M1,​M2,​M> [Flow](Flow.html "class in akka.stream.javadsl")<I,​O,​M> fromSinkAndSourceCoupledMat​([Graph](../Graph.html "interface in akka.stream")<[SinkShape](../SinkShape.html "class in akka.stream")<I>,​M1> sink,
		                                                                                                        [Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<O>,​M2> source,
		                                                                                                        [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<M1,​M2,​M> combine)
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
		
		
		 E.g. if the emitted [`Flow`](Flow.html "class in akka.stream.javadsl") gets a cancellation, the [`Source`](Source.html "class in akka.stream.javadsl") of course is cancelled,
		 however the Sink will also be completed. The table on `Flow.fromSinkAndSourceCoupled`
		 illustrates the effects in detail.
		 
		
		
		 The `combine` function is used to compose the materialized values of the `sink` and `source`
		 into the materialized value of the resulting [`Flow`](Flow.html "class in akka.stream.javadsl").
		- #### lazyInit
		
		
		
		```
		public static <I,​O,​M> [Flow](Flow.html "class in akka.stream.javadsl")<I,​O,​M> lazyInit​([Function](../../japi/function/Function.html "interface in akka.japi.function")<I,​java.util.concurrent.CompletionStage<[Flow](Flow.html "class in akka.stream.javadsl")<I,​O,​M>>> flowFactory,
		                                                                   [Creator](../../japi/function/Creator.html "interface in akka.japi.function")<M> fallback)
		```
		
		Deprecated.
		Use 'Flow.completionStageFlow' in combination with prefixAndTail(1\) instead, see \`completionStageFlow\` operator docs for details. Since 2\.6\.0\.
		
		Creates a real `Flow` upon receiving the first element. Internal `Flow` will not be created
		 if there are no elements, because of completion, cancellation, or error.
		 
		 The materialized value of the `Flow` is the value that is created by the `fallback` function.
		 
		
		
		 '''Emits when''' the internal flow is successfully created and it emits
		 
		
		
		 '''Backpressures when''' the internal flow is successfully created and it backpressures
		 
		
		
		 '''Completes when''' upstream completes and all elements have been emitted from the internal flow
		 
		
		
		 '''Cancels when''' downstream cancels
		- #### lazyInitAsync
		
		
		
		```
		public static <I,​O,​M> [Flow](Flow.html "class in akka.stream.javadsl")<I,​O,​java.util.concurrent.CompletionStage<java.util.Optional<M>>> lazyInitAsync​([Creator](../../japi/function/Creator.html "interface in akka.japi.function")<java.util.concurrent.CompletionStage<[Flow](Flow.html "class in akka.stream.javadsl")<I,​O,​M>>> flowFactory)
		```
		
		Deprecated.
		Use 'Flow.lazyCompletionStageFlow' instead. Since 2\.6\.0\.
		
		Creates a real `Flow` upon receiving the first element. Internal `Flow` will not be created
		 if there are no elements, because of completion, cancellation, or error.
		 
		 The materialized value of the `Flow` is a `Future[Option[M}` that is completed with `Some(mat)` when the internal
		 flow gets materialized or with `None` when there where no elements. If the flow materialization (including
		 the call of the `flowFactory`) fails then the future is completed with a failure.
		 
		
		
		 '''Emits when''' the internal flow is successfully created and it emits
		 
		
		
		 '''Backpressures when''' the internal flow is successfully created and it backpressures
		 
		
		
		 '''Completes when''' upstream completes and all elements have been emitted from the internal flow
		 
		
		
		 '''Cancels when''' downstream cancels
		- #### completionStageFlow
		
		
		
		```
		public static <I,​O,​M> [Flow](Flow.html "class in akka.stream.javadsl")<I,​O,​java.util.concurrent.CompletionStage<M>> completionStageFlow​(java.util.concurrent.CompletionStage<[Flow](Flow.html "class in akka.stream.javadsl")<I,​O,​M>> flow)
		```
		
		Turn a `CompletionStage` into a flow that will consume the values of the source when the future completes successfully.
		 If the `Future` is completed with a failure the stream is failed.
		 
		 The materialized completion stage value is completed with the materialized value of the future flow or failed with a
		 `NeverMaterializedException` if upstream fails or downstream cancels before the completion stage has completed.
		- #### lazyFlow
		
		
		
		```
		public static <I,​O,​M> [Flow](Flow.html "class in akka.stream.javadsl")<I,​O,​java.util.concurrent.CompletionStage<M>> lazyFlow​([Creator](../../japi/function/Creator.html "interface in akka.japi.function")<[Flow](Flow.html "class in akka.stream.javadsl")<I,​O,​M>> create)
		```
		
		Defers invoking the `create` function to create a future flow until there is downstream demand and passing
		 that downstream demand upstream triggers the first element.
		 
		 Note that asynchronous boundaries (and other operators) in the stream may do pre\-fetching which counter acts
		 the laziness and can trigger the factory earlier than expected.
		 
		
		
		 '''Emits when''' the internal flow is successfully created and it emits
		 
		
		
		 '''Backpressures when''' the internal flow is successfully created and it backpressures or downstream backpressures
		 
		
		
		 '''Completes when''' upstream completes and all elements have been emitted from the internal flow
		 
		
		
		 '''Cancels when''' downstream cancels
		- #### lazyCompletionStageFlow
		
		
		
		```
		public static <I,​O,​M> [Flow](Flow.html "class in akka.stream.javadsl")<I,​O,​java.util.concurrent.CompletionStage<M>> lazyCompletionStageFlow​([Creator](../../japi/function/Creator.html "interface in akka.japi.function")<java.util.concurrent.CompletionStage<[Flow](Flow.html "class in akka.stream.javadsl")<I,​O,​M>>> create)
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
		 
		
		
		 '''Cancels when''' downstream cancels
		- #### upcast
		
		
		
		```
		public static <In,​SuperOut,​Out extends SuperOut,​M> [Flow](Flow.html "class in akka.stream.javadsl")<In,​SuperOut,​M> upcast​([Flow](Flow.html "class in akka.stream.javadsl")<In,​Out,​M> flow)
		```
		
		Upcast a stream of elements to a stream of supertypes of that element. Useful in combination with
		 fan\-in operators where you do not want to pay the cost of casting each element in a `map`.
		 
		
		Returns:
		A flow that accepts `In` and outputs elements of the super type
		- #### flattenOptional
		
		
		
		```
		public static <Out,​In extends java.util.Optional<Out>> [Flow](Flow.html "class in akka.stream.javadsl")<In,​Out,​[NotUsed](../../NotUsed.html "class in akka")> flattenOptional()
		```
		
		Collect the value of `Optional` from the elements passing through this flow, empty `Optional` is filtered out.
		 
		 Adheres to the `ActorAttributes.SupervisionStrategy` attribute.
		 
		
		
		 '''Emits when''' the current `Optional`'s value is present.
		 
		
		
		 '''Backpressures when''' the value of the current `Optional` is present and downstream backpressures
		 
		
		
		 '''Completes when''' upstream completes
		 
		
		
		 '''Cancels when''' downstream cancels
		 \*
		- #### concatAllLazy
		
		
		
		```
		public [Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")> concatAllLazy​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<[Out](Flow.html "type parameter in Flow")>,​?>... those)
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
		public [Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")> alsoToAll​([Graph](../Graph.html "interface in akka.stream")<[SinkShape](../SinkShape.html "class in akka.stream")<[Out](Flow.html "type parameter in Flow")>,​?>... those)
		```
		
		Attaches the given [`Sink`](Sink.html "class in akka.stream.javadsl")s to this [`Flow`](Flow.html "class in akka.stream.javadsl"), meaning that elements that passes
		 through will also be sent to all those [`Sink`](Sink.html "class in akka.stream.javadsl")s.
		 
		 It is similar to [`wireTap(akka.japi.function.Procedure<Out>)`](#wireTap(akka.japi.function.Procedure)) but will backpressure instead of dropping elements when the given [`Sink`](Sink.html "class in akka.stream.javadsl")s is not ready.
		 
		
		
		 '''Emits when''' element is available and demand exists both from the Sinks and the downstream.
		 
		
		
		 '''Backpressures when''' downstream or any of the [`Sink`](Sink.html "class in akka.stream.javadsl")s backpressures
		 
		
		
		 '''Completes when''' upstream completes
		 
		
		
		 '''Cancels when''' downstream or any of the [`Sink`](Sink.html "class in akka.stream.javadsl")s cancels
		- #### shape
		
		
		
		```
		public [FlowShape](../FlowShape.html "class in akka.stream")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow")> shape()
		```
		
		Description copied from interface: `[Graph](../Graph.html#shape())`
		The shape of a graph is all that is externally visible: its inlets and outlets.
		
		Specified by:
		`[shape](../Graph.html#shape())` in interface `[Graph](../Graph.html "interface in akka.stream")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow")>`
		- #### traversalBuilder
		
		
		
		```
		public akka.stream.impl.LinearTraversalBuilder traversalBuilder()
		```
		
		Description copied from interface: `[Graph](../Graph.html#traversalBuilder())`
		INTERNAL API.
		 
		 Every materializable element must be backed by a stream layout module
		
		
		
		Specified by:
		`[traversalBuilder](../Graph.html#traversalBuilder())` in interface `[Graph](../Graph.html "interface in akka.stream")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow")>`
		- #### toString
		
		
		
		```
		public java.lang.String toString()
		```
		
		
		Overrides:
		`toString` in class `java.lang.Object`
		- #### asScala
		
		
		
		```
		public [Flow](../scaladsl/Flow.html "class in akka.stream.scaladsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")> asScala()
		```
		
		Converts this Flow to its Scala DSL counterpart
		- #### mapMaterializedValue
		
		
		
		```
		public <Mat2> [Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​Mat2> mapMaterializedValue​([Function](../../japi/function/Function.html "interface in akka.japi.function")<[Mat](Flow.html "type parameter in Flow"),​Mat2> f)
		```
		
		Transform only the materialized value of this Flow, leaving all other properties as they were.
		- #### preMaterialize
		
		
		
		```
		public [Pair](../../japi/Pair.html "class in akka.japi")<[Mat](Flow.html "type parameter in Flow"),​[Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[NotUsed](../../NotUsed.html "class in akka")>> preMaterialize​([ClassicActorSystemProvider](../../actor/ClassicActorSystemProvider.html "interface in akka.actor") systemProvider)
		```
		
		Materializes this [`Flow`](Flow.html "class in akka.stream.javadsl"), immediately returning (1\) its materialized value, and (2\) a newly materialized [`Flow`](Flow.html "class in akka.stream.javadsl").
		 
		 Note that `preMaterialize` is implemented through a reactive streams `Publisher` and `Subscriber` pair which means that
		 a buffer is introduced and that errors are not propagated upstream but are turned into cancellations without error details.
		- #### preMaterialize
		
		
		
		```
		public [Pair](../../japi/Pair.html "class in akka.japi")<[Mat](Flow.html "type parameter in Flow"),​[Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[NotUsed](../../NotUsed.html "class in akka")>> preMaterialize​([Materializer](../Materializer.html "class in akka.stream") materializer)
		```
		
		Materializes this [`Flow`](Flow.html "class in akka.stream.javadsl"), immediately returning (1\) its materialized value, and (2\) a newly materialized [`Flow`](Flow.html "class in akka.stream.javadsl").
		 The returned flow is partial materialized and do not support multiple times materialization.
		 
		 Note that `preMaterialize` is implemented through a reactive streams `Publisher` and `Subscriber` pair which means that
		 a buffer is introduced and that errors are not propagated upstream but are turned into cancellations without error details.
		- #### via
		
		
		
		```
		public <T,​M> [Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​T,​[Mat](Flow.html "type parameter in Flow")> via​([Graph](../Graph.html "interface in akka.stream")<[FlowShape](../FlowShape.html "class in akka.stream")<[Out](Flow.html "type parameter in Flow"),​T>,​M> flow)
		```
		
		Transform this [`Flow`](Flow.html "class in akka.stream.javadsl") by appending the given processing steps.
		 
		```
		
		     +---------------------------------+
		     | Resulting Flow[In, T, Mat]  |
		     |                                 |
		     |  +------+             +------+  |
		     |  |      |             |      |  |
		 In ~~> | this |  ~~Out~~>   | flow | ~~> T
		     |  |   Mat|             |     M|  |
		     |  +------+             +------+  |
		     +---------------------------------+
		 
		```
		
		 The materialized value of the combined [`Flow`](Flow.html "class in akka.stream.javadsl") will be the materialized
		 value of the current flow (ignoring the other Flow\&rsquo;s value), use
		 `viaMat` if a different strategy is needed.
		 
		 See also [`<T,M,M2>viaMat(akka.stream.Graph<akka.stream.FlowShape<Out,T>,M>,akka.japi.function.Function2<Mat,M,M2>)`](#viaMat(akka.stream.Graph,akka.japi.function.Function2)) when access to materialized values of the parameter is needed.
		- #### viaMat
		
		
		
		```
		public <T,​M,​M2> [Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​T,​M2> viaMat​([Graph](../Graph.html "interface in akka.stream")<[FlowShape](../FlowShape.html "class in akka.stream")<[Out](Flow.html "type parameter in Flow"),​T>,​M> flow,
		                                                             [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<[Mat](Flow.html "type parameter in Flow"),​M,​M2> combine)
		```
		
		Transform this [`Flow`](Flow.html "class in akka.stream.javadsl") by appending the given processing steps.
		 
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
		- #### contramap
		
		
		
		```
		public <In2> [Flow](Flow.html "class in akka.stream.javadsl")<In2,​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")> contramap​([Function](../../japi/function/Function.html "interface in akka.japi.function")<In2,​[In](Flow.html "type parameter in Flow")> f)
		```
		
		Transform this Flow by applying a function to each \*incoming\* upstream element before
		 it is passed to the [`Flow`](Flow.html "class in akka.stream.javadsl")
		
		 '''Backpressures when''' original [`Flow`](Flow.html "class in akka.stream.javadsl") backpressures
		 
		
		
		 '''Cancels when''' original [`Flow`](Flow.html "class in akka.stream.javadsl") cancels
		- #### to
		
		
		
		```
		public [Sink](Sink.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")> to​([Graph](../Graph.html "interface in akka.stream")<[SinkShape](../SinkShape.html "class in akka.stream")<[Out](Flow.html "type parameter in Flow")>,​?> sink)
		```
		
		Connect this [`Flow`](Flow.html "class in akka.stream.javadsl") to a [`Sink`](Sink.html "class in akka.stream.javadsl"), concatenating the processing steps of both.
		 
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
		
		 The materialized value of the combined [`Sink`](Sink.html "class in akka.stream.javadsl") will be the materialized
		 value of the current flow (ignoring the given Sink\&rsquo;s value), use
		 `toMat` if a different strategy is needed.
		 
		 See also [`<M,M2>toMat(akka.stream.Graph<akka.stream.SinkShape<Out>,M>,akka.japi.function.Function2<Mat,M,M2>)`](#toMat(akka.stream.Graph,akka.japi.function.Function2)) when access to materialized values of the parameter is needed.
		- #### toMat
		
		
		
		```
		public <M,​M2> [Sink](Sink.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​M2> toMat​([Graph](../Graph.html "interface in akka.stream")<[SinkShape](../SinkShape.html "class in akka.stream")<[Out](Flow.html "type parameter in Flow")>,​M> sink,
		                                            [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<[Mat](Flow.html "type parameter in Flow"),​M,​M2> combine)
		```
		
		Connect this [`Flow`](Flow.html "class in akka.stream.javadsl") to a [`Sink`](Sink.html "class in akka.stream.javadsl"), concatenating the processing steps of both.
		 
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
		- #### join
		
		
		
		```
		public <M> [RunnableGraph](RunnableGraph.html "class in akka.stream.javadsl")<[Mat](Flow.html "type parameter in Flow")> join​([Graph](../Graph.html "interface in akka.stream")<[FlowShape](../FlowShape.html "class in akka.stream")<[Out](Flow.html "type parameter in Flow"),​[In](Flow.html "type parameter in Flow")>,​M> flow)
		```
		
		Join this [`Flow`](Flow.html "class in akka.stream.javadsl") to another [`Flow`](Flow.html "class in akka.stream.javadsl"), by cross connecting the inputs and outputs, creating a [`RunnableGraph`](RunnableGraph.html "class in akka.stream.javadsl").
		 
		```
		
		 +------+        +-------+
		 |      | ~Out~> |       |
		 | this |        | other |
		 |      | <~In~  |       |
		 +------+        +-------+
		 
		```
		
		 The materialized value of the combined [`Flow`](Flow.html "class in akka.stream.javadsl") will be the materialized
		 value of the current flow (ignoring the other Flow\&rsquo;s value), use
		 `joinMat` if a different strategy is needed.
		 
		 See also [`<M,M2>joinMat(akka.stream.Graph<akka.stream.FlowShape<Out,In>,M>,akka.japi.function.Function2<Mat,M,M2>)`](#joinMat(akka.stream.Graph,akka.japi.function.Function2)) when access to materialized values of the parameter is needed.
		- #### joinMat
		
		
		
		```
		public <M,​M2> [RunnableGraph](RunnableGraph.html "class in akka.stream.javadsl")<M2> joinMat​([Graph](../Graph.html "interface in akka.stream")<[FlowShape](../FlowShape.html "class in akka.stream")<[Out](Flow.html "type parameter in Flow"),​[In](Flow.html "type parameter in Flow")>,​M> flow,
		                                              [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<[Mat](Flow.html "type parameter in Flow"),​M,​M2> combine)
		```
		
		Join this [`Flow`](Flow.html "class in akka.stream.javadsl") to another [`Flow`](Flow.html "class in akka.stream.javadsl"), by cross connecting the inputs and outputs, creating a [`RunnableGraph`](RunnableGraph.html "class in akka.stream.javadsl")
		
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
		public <I2,​O1,​Mat2> [Flow](Flow.html "class in akka.stream.javadsl")<I2,​O1,​[Mat](Flow.html "type parameter in Flow")> join​([Graph](../Graph.html "interface in akka.stream")<[BidiShape](../BidiShape.html "class in akka.stream")<[Out](Flow.html "type parameter in Flow"),​O1,​I2,​[In](Flow.html "type parameter in Flow")>,​Mat2> bidi)
		```
		
		Join this [`Flow`](Flow.html "class in akka.stream.javadsl") to a [`BidiFlow`](BidiFlow.html "class in akka.stream.javadsl") to close off the \&ldquo;top\&rdquo; of the protocol stack:
		 
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
		
		 The materialized value of the combined [`Flow`](Flow.html "class in akka.stream.javadsl") will be the materialized
		 value of the current flow (ignoring the [`BidiFlow`](BidiFlow.html "class in akka.stream.javadsl")\&rsquo;s value), use
		 {@link Flow\#joinMat\[I2\* joinMat} if a different strategy is needed.
		- #### joinMat
		
		
		
		```
		public <I2,​O1,​Mat2,​M> [Flow](Flow.html "class in akka.stream.javadsl")<I2,​O1,​M> joinMat​([Graph](../Graph.html "interface in akka.stream")<[BidiShape](../BidiShape.html "class in akka.stream")<[Out](Flow.html "type parameter in Flow"),​O1,​I2,​[In](Flow.html "type parameter in Flow")>,​Mat2> bidi,
		                                                                          [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<[Mat](Flow.html "type parameter in Flow"),​Mat2,​M> combine)
		```
		
		Join this [`Flow`](Flow.html "class in akka.stream.javadsl") to a [`BidiFlow`](BidiFlow.html "class in akka.stream.javadsl") to close off the \&ldquo;top\&rdquo; of the protocol stack:
		 
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
		 [`BidiFlow`](BidiFlow.html "class in akka.stream.javadsl") into the materialized value of the resulting [`Flow`](Flow.html "class in akka.stream.javadsl").
		 
		 It is recommended to use the internally optimized `Keep.left` and `Keep.right` combiners
		 where appropriate instead of manually writing functions that pass through one of the values.
		 
		
		
		 See also [`<T,M,M2>viaMat(akka.stream.Graph<akka.stream.FlowShape<Out,T>,M>,akka.japi.function.Function2<Mat,M,M2>)`](#viaMat(akka.stream.Graph,akka.japi.function.Function2)) when access to materialized values of the parameter is needed.
		- #### runWith
		
		
		
		```
		public <T,​U> [Pair](../../japi/Pair.html "class in akka.japi")<T,​U> runWith​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<[In](Flow.html "type parameter in Flow")>,​T> source,
		                                           [Graph](../Graph.html "interface in akka.stream")<[SinkShape](../SinkShape.html "class in akka.stream")<[Out](Flow.html "type parameter in Flow")>,​U> sink,
		                                           [ClassicActorSystemProvider](../../actor/ClassicActorSystemProvider.html "interface in akka.actor") systemProvider)
		```
		
		Connect the `Source` to this `Flow` and then connect it to the `Sink` and run it.
		 
		 The returned tuple contains the materialized values of the `Source` and `Sink`,
		 e.g. the `Subscriber` of a `Source.asSubscriber` and `Publisher` of a `Sink.asPublisher`.
		- #### runWith
		
		
		
		```
		public <T,​U> [Pair](../../japi/Pair.html "class in akka.japi")<T,​U> runWith​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<[In](Flow.html "type parameter in Flow")>,​T> source,
		                                           [Graph](../Graph.html "interface in akka.stream")<[SinkShape](../SinkShape.html "class in akka.stream")<[Out](Flow.html "type parameter in Flow")>,​U> sink,
		                                           [Materializer](../Materializer.html "class in akka.stream") materializer)
		```
		
		Connect the `Source` to this `Flow` and then connect it to the `Sink` and run it.
		 
		 The returned tuple contains the materialized values of the `Source` and `Sink`,
		 e.g. the `Subscriber` of a `Source.asSubscriber` and `Publisher` of a `Sink.asPublisher`.
		 
		
		
		 Prefer the method taking an ActorSystem unless you have special requirements.
		- #### map
		
		
		
		```
		public <T> [Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​T,​[Mat](Flow.html "type parameter in Flow")> map​([Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](Flow.html "type parameter in Flow"),​T> f)
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
		public [Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")> wireTap​([Procedure](../../japi/function/Procedure.html "interface in akka.japi.function")<[Out](Flow.html "type parameter in Flow")> f)
		```
		
		This is a simplified version of `wireTap(Sink)` that takes only a simple procedure.
		 Elements will be passed into this "side channel" function, and any of its results will be ignored.
		 
		 If the wire\-tap operation is slow (it backpressures), elements that would've been sent to it will be dropped instead.
		 It is similar to [`alsoTo(akka.stream.Graph<akka.stream.SinkShape<Out>, ?>)`](#alsoTo(akka.stream.Graph)) but will not affect (i.e. backpressure) the flow tapped into.
		 
		
		
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
		public <T> [Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​T,​[Mat](Flow.html "type parameter in Flow")> mapConcat​([Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](Flow.html "type parameter in Flow"),​java.lang.Iterable<T>> f)
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
		 
		
		
		 '''Completes when''' upstream completes and all remaining elements have been emitted
		 
		
		
		 '''Cancels when''' downstream cancels
		- #### statefulMap
		
		
		
		```
		public <S,​T> [Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​T,​[Mat](Flow.html "type parameter in Flow")> statefulMap​([Creator](../../japi/function/Creator.html "interface in akka.japi.function")<S> create,
		                                                          [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<S,​[Out](Flow.html "type parameter in Flow"),​[Pair](../../japi/Pair.html "class in akka.japi")<S,​T>> f,
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
		public <R,​T> [Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​T,​[Mat](Flow.html "type parameter in Flow")> mapWithResource​(java.util.function.Supplier<R> create,
		                                                              java.util.function.BiFunction<R,​[Out](Flow.html "type parameter in Flow"),​T> f,
		                                                              java.util.function.Function<R,​java.util.Optional<T>> close)
		```
		
		Transform each stream element with the help of a resource.
		 
		 The resource creation function is invoked once when the stream is materialized and the returned resource is passed to
		 the mapping function for mapping the first element. The mapping function returns a mapped element to emit
		 downstream. The returned `T` MUST NOT be `null` as it is illegal as stream element \- according to the Reactive Streams specification.
		 
		
		
		 The `close` function is called only once when the upstream or downstream finishes or fails. You can do some clean\-up here,
		 and if the returned value is not empty, it will be emitted to the downstream if available, otherwise the value will be dropped.
		 
		
		
		 Early completion can be done with combination of the [`takeWhile(akka.japi.function.Predicate<Out>,boolean)`](#takeWhile(akka.japi.function.Predicate,boolean)) operator.
		 
		
		
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
		public <T> [Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​T,​[Mat](Flow.html "type parameter in Flow")> statefulMapConcat​([Creator](../../japi/function/Creator.html "interface in akka.japi.function")<[Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](Flow.html "type parameter in Flow"),​java.lang.Iterable<T>>> f)
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
		public <T> [Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​T,​[Mat](Flow.html "type parameter in Flow")> mapAsync​(int parallelism,
		                                               [Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](Flow.html "type parameter in Flow"),​java.util.concurrent.CompletionStage<T>> f)
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
		 
		
		
		 '''Emits when''' the CompletionStage returned by the provided function finishes for the next element in sequence
		 
		
		
		 '''Backpressures when''' the number of CompletionStages reaches the configured parallelism and the downstream
		 backpressures or the first future is not completed
		 
		
		
		 '''Completes when''' upstream completes and all CompletionStages have been completed and all elements have been emitted
		 
		
		
		 '''Cancels when''' downstream cancels
		- #### mapAsyncPartitioned
		
		
		
		```
		public <T,​P> [Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​T,​[Mat](Flow.html "type parameter in Flow")> mapAsyncPartitioned​(int parallelism,
		                                                                  int perPartition,
		                                                                  [Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](Flow.html "type parameter in Flow"),​P> partitioner,
		                                                                  java.util.function.BiFunction<[Out](Flow.html "type parameter in Flow"),​P,​java.util.concurrent.CompletionStage<T>> f)
		```
		
		Transform this stream by partitioning elements based on the provided partitioner as they pass through this
		 processing step and then applying a given `CompletionStage`\-returning function to each element and its
		 partition key. The value of the returned future, if successful, will be emitted downstream.
		 
		 The number of CompletionStages running at any given time is bounded by the 'parallelism' and 'perPartition'
		 values. The CompletionStages may complete in any order, but the results are emitted in the same order as
		 the corresponding elements were received.
		 
		
		
		 If the functions 'partitioner' or 'f' throw an exception, or if the 'CompletionStage' is completed with failure,
		 supervision will be applied to determine a decision. If the decision is [`Supervision.stop()`](../Supervision.html#stop()), the
		 stream will be completed with failure; otherwise the element will be dropped and the stream continues.
		 
		
		
		 The function 'partitioner' is always invoked on the elements in the order they arrive.
		 
		
		
		 The function 'f' is invoked on elements with the same partition key in the order they arrive. The order of
		 invocation of 'f' for elements with different partition keys is undefined and subject to factors including, but
		 not limited to, the distribution of partition keys within the stream.
		 
		
		
		 '''Emits when''' the CompletionStage returned by the provided function 'f' finishes for the next element in
		 sequence
		 
		
		
		 '''Backpressures when''' the number of elements for which no resulting CompletionStage has completed reaches the
		 configured parallelism and the downstream backpressures or the first CompletionStage has not completed
		 
		
		
		 '''Completes when''' upstream completes and all CompletionStages have been completed and all elements have
		 been emitted
		 
		
		
		 '''Cancels when''' downstream cancels
		- #### mapAsyncUnordered
		
		
		
		```
		public <T> [Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​T,​[Mat](Flow.html "type parameter in Flow")> mapAsyncUnordered​(int parallelism,
		                                                        [Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](Flow.html "type parameter in Flow"),​java.util.concurrent.CompletionStage<T>> f)
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
		 
		
		
		 If the `CompletionStage` is completed with `null`, it is ignored and the next element is processed.
		 
		
		
		 The function `f` is always invoked on the elements in the order they arrive (even though the result of the futures
		 returned by `f` might be emitted in a different order).
		 
		
		
		 Adheres to the `ActorAttributes.SupervisionStrategy` attribute.
		 
		
		
		 '''Emits when''' any of the CompletionStages returned by the provided function complete
		 
		
		
		 '''Backpressures when''' the number of CompletionStages reaches the configured parallelism and the downstream backpressures
		 
		
		
		 '''Completes when''' upstream completes and all CompletionStages have been completed and all elements have been emitted
		 
		
		
		 '''Cancels when''' downstream cancels
		- #### ask
		
		
		
		```
		public <S> [Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​S,​[Mat](Flow.html "type parameter in Flow")> ask​([ActorRef](../../actor/ActorRef.html "class in akka.actor") ref,
		                                          java.lang.Class<S> mapTo,
		                                          [Timeout](../../util/Timeout.html "class in akka.util") timeout)
		```
		
		Use the `ask` pattern to send a request\-reply message to the target `ref` actor.
		 If any of the asks times out it will fail the stream with a [`AskTimeoutException`](../../pattern/AskTimeoutException.html "class in akka.pattern").
		 
		 The `mapTo` class parameter is used to cast the incoming responses to the expected response type.
		 
		
		
		 Similar to the plain ask pattern, the target actor is allowed to reply with `akka.util.Status`.
		 An `akka.util.Status#Failure` will cause the operator to fail with the cause carried in the `Failure` message.
		 
		
		
		 Defaults to parallelism of 2 messages in flight, since while one ask message may be being worked on, the second one
		 still be in the mailbox, so defaulting to sending the second one a bit earlier than when first ask has replied maintains
		 a slightly healthier throughput.
		 
		
		
		 The operator fails with an [`WatchedActorTerminatedException`](../WatchedActorTerminatedException.html "class in akka.stream") if the target actor is terminated.
		 
		
		
		 Adheres to the `ActorAttributes.SupervisionStrategy` attribute.
		 
		
		
		 '''Emits when''' any of the CompletionStages returned by the provided function complete
		 
		
		
		 '''Backpressures when''' the number of futures reaches the configured parallelism and the downstream backpressures
		 
		
		
		 '''Completes when''' upstream completes and all futures have been completed and all elements have been emitted
		 
		
		
		 '''Fails when''' the passed in actor terminates, or a timeout is exceeded in any of the asks performed
		 
		
		
		 '''Cancels when''' downstream cancels
		- #### ask
		
		
		
		```
		public <S> [Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​S,​[Mat](Flow.html "type parameter in Flow")> ask​(int parallelism,
		                                          [ActorRef](../../actor/ActorRef.html "class in akka.actor") ref,
		                                          java.lang.Class<S> mapTo,
		                                          [Timeout](../../util/Timeout.html "class in akka.util") timeout)
		```
		
		Use the `ask` pattern to send a request\-reply message to the target `ref` actor.
		 If any of the asks times out it will fail the stream with a [`AskTimeoutException`](../../pattern/AskTimeoutException.html "class in akka.pattern").
		 
		 The `mapTo` class parameter is used to cast the incoming responses to the expected response type.
		 
		
		
		 Similar to the plain ask pattern, the target actor is allowed to reply with `akka.util.Status`.
		 An `akka.util.Status#Failure` will cause the operator to fail with the cause carried in the `Failure` message.
		 
		
		
		 Parallelism limits the number of how many asks can be "in flight" at the same time.
		 Please note that the elements emitted by this operator are in\-order with regards to the asks being issued
		 (i.e. same behaviour as mapAsync).
		 
		
		
		 The operator fails with an [`WatchedActorTerminatedException`](../WatchedActorTerminatedException.html "class in akka.stream") if the target actor is terminated.
		 
		
		
		 Adheres to the `ActorAttributes.SupervisionStrategy` attribute.
		 
		
		
		 '''Emits when''' any of the CompletionStages returned by the provided function complete
		 
		
		
		 '''Backpressures when''' the number of futures reaches the configured parallelism and the downstream backpressures
		 
		
		
		 '''Completes when''' upstream completes and all futures have been completed and all elements have been emitted
		 
		
		
		 '''Fails when''' the passed in actor terminates, or a timeout is exceeded in any of the asks performed
		 
		
		
		 '''Cancels when''' downstream cancels
		- #### watch
		
		
		
		```
		public [Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")> watch​([ActorRef](../../actor/ActorRef.html "class in akka.actor") ref)
		```
		
		The operator fails with an [`WatchedActorTerminatedException`](../WatchedActorTerminatedException.html "class in akka.stream") if the target actor is terminated.
		 
		 '''Emits when''' upstream emits
		 
		
		
		 '''Backpressures when''' downstream backpressures
		 
		
		
		 '''Completes when''' upstream completes
		 
		
		
		 '''Fails when''' the watched actor terminates
		 
		
		
		 '''Cancels when''' downstream cancels
		- #### filter
		
		
		
		```
		public [Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")> filter​([Predicate](../../japi/function/Predicate.html "interface in akka.japi.function")<[Out](Flow.html "type parameter in Flow")> p)
		```
		
		Only pass on those elements that satisfy the given predicate.
		 
		 Adheres to the `ActorAttributes.SupervisionStrategy` attribute.
		 
		
		
		 '''Emits when''' the given predicate returns true for the element
		 
		
		
		 '''Backpressures when''' the given predicate returns true for the element and downstream backpressures
		 
		
		
		 '''Completes when''' upstream completes
		 
		
		
		 '''Cancels when''' downstream cancels
		- #### filterNot
		
		
		
		```
		public [Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")> filterNot​([Predicate](../../japi/function/Predicate.html "interface in akka.japi.function")<[Out](Flow.html "type parameter in Flow")> p)
		```
		
		Only pass on those elements that NOT satisfy the given predicate.
		 
		 Adheres to the `ActorAttributes.SupervisionStrategy` attribute.
		 
		
		
		 '''Emits when''' the given predicate returns false for the element
		 
		
		
		 '''Backpressures when''' the given predicate returns false for the element and downstream backpressures
		 
		
		
		 '''Completes when''' upstream completes
		 
		
		
		 '''Cancels when''' downstream cancels
		- #### collect
		
		
		
		```
		public <T> [Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​T,​[Mat](Flow.html "type parameter in Flow")> collect​(scala.PartialFunction<[Out](Flow.html "type parameter in Flow"),​T> pf)
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
		public <T> [Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​T,​[Mat](Flow.html "type parameter in Flow")> collectType​(java.lang.Class<T> clazz)
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
		public [Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​java.util.List<[Out](Flow.html "type parameter in Flow")>,​[Mat](Flow.html "type parameter in Flow")> grouped​(int n)
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
		public [Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​java.util.List<[Out](Flow.html "type parameter in Flow")>,​[Mat](Flow.html "type parameter in Flow")> groupedWeighted​(long minWeight,
		                                                                    java.util.function.Function<[Out](Flow.html "type parameter in Flow"),​java.lang.Long> costFn)
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
		public [Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")> limit​(long n)
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
		 
		
		
		 '''Errors when''' the total number of incoming element exceeds max
		 
		
		
		 '''Cancels when''' the defined number of elements has been taken or downstream cancels
		 
		
		
		 See also `Flow.take`, `Flow.takeWithin`, `Flow.takeWhile`
		- #### limitWeighted
		
		
		
		```
		public [Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")> limitWeighted​(long n,
		                                                  [Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](Flow.html "type parameter in Flow"),​java.lang.Long> costFn)
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
		 
		
		
		 '''Errors when''' when the accumulated cost exceeds max
		 
		
		
		 '''Cancels when''' the defined number of elements has been taken or downstream cancels
		 
		
		
		 See also `Flow.take`, `Flow.takeWithin`, `Flow.takeWhile`
		- #### sliding
		
		
		
		```
		public [Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​java.util.List<[Out](Flow.html "type parameter in Flow")>,​[Mat](Flow.html "type parameter in Flow")> sliding​(int n,
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
		public <T> [Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​T,​[Mat](Flow.html "type parameter in Flow")> scan​(T zero,
		                                           [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<T,​[Out](Flow.html "type parameter in Flow"),​T> f)
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
		public <T> [Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​T,​[Mat](Flow.html "type parameter in Flow")> scanAsync​(T zero,
		                                                [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<T,​[Out](Flow.html "type parameter in Flow"),​java.util.concurrent.CompletionStage<T>> f)
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
		public <T> [Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​T,​[Mat](Flow.html "type parameter in Flow")> fold​(T zero,
		                                           [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<T,​[Out](Flow.html "type parameter in Flow"),​T> f)
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
		public <T> [Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​T,​[Mat](Flow.html "type parameter in Flow")> foldAsync​(T zero,
		                                                [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<T,​[Out](Flow.html "type parameter in Flow"),​java.util.concurrent.CompletionStage<T>> f)
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
		public [Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")> reduce​([Function2](../../japi/function/Function2.html "interface in akka.japi.function")<[Out](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow")> f)
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
		- #### intersperse
		
		
		
		```
		public [Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")> intersperse​([Out](Flow.html "type parameter in Flow") start,
		                                                [Out](Flow.html "type parameter in Flow") inject,
		                                                [Out](Flow.html "type parameter in Flow") end)
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
		public [Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")> intersperse​([Out](Flow.html "type parameter in Flow") inject)
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
		public [Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​java.util.List<[Out](Flow.html "type parameter in Flow")>,​[Mat](Flow.html "type parameter in Flow")> groupedWithin​(int maxNumber,
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
		public [Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​java.util.List<[Out](Flow.html "type parameter in Flow")>,​[Mat](Flow.html "type parameter in Flow")> groupedWeightedWithin​(long maxWeight,
		                                                                          [Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](Flow.html "type parameter in Flow"),​java.lang.Long> costFn,
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
		public [Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​java.util.List<[Out](Flow.html "type parameter in Flow")>,​[Mat](Flow.html "type parameter in Flow")> groupedWeightedWithin​(long maxWeight,
		                                                                          int maxNumber,
		                                                                          [Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](Flow.html "type parameter in Flow"),​java.lang.Long> costFn,
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
		public [Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")> delay​(java.time.Duration of,
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
		- #### delayWith
		
		
		
		```
		public [Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")> delayWith​(java.util.function.Supplier<[DelayStrategy](DelayStrategy.html "interface in akka.stream.javadsl")<[Out](Flow.html "type parameter in Flow")>> delayStrategySupplier,
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
		public [Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")> drop​(long n)
		```
		
		Discard the given number of elements at the beginning of the stream.
		 No elements will be dropped if `n` is zero or negative.
		 
		 '''Emits when''' the specified number of elements has been dropped already
		 
		
		
		 '''Backpressures when''' the specified number of elements has been dropped and downstream backpressures
		 
		
		
		 '''Completes when''' upstream completes
		 
		
		
		 '''Cancels when''' downstream cancels
		- #### dropWithin
		
		
		
		```
		public [Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")> dropWithin​(java.time.Duration duration)
		```
		
		Discard the elements received within the given duration at beginning of the stream.
		 
		 '''Emits when''' the specified time elapsed and a new upstream element arrives
		 
		
		
		 '''Backpressures when''' downstream backpressures
		 
		
		
		 '''Completes when''' upstream completes
		 
		
		
		 '''Cancels when''' downstream cancels
		- #### takeWhile
		
		
		
		```
		public [Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")> takeWhile​([Predicate](../../japi/function/Predicate.html "interface in akka.japi.function")<[Out](Flow.html "type parameter in Flow")> p,
		                                              boolean inclusive)
		```
		
		Terminate processing (and cancel the upstream publisher) after predicate
		 returns false for the first time. When inclusive is `true`, include the element
		 for which the predicate returned `false`.
		 Due to input buffering some elements may have been requested from upstream publishers
		 that will then not be processed downstream of this step.
		 
		 The stream will be completed without producing any elements if predicate is false for
		 the first stream element.
		 
		
		
		 Adheres to the `ActorAttributes.SupervisionStrategy` attribute.
		 
		
		
		 '''Emits when''' the predicate is true
		 
		
		
		 '''Backpressures when''' downstream backpressures
		 
		
		
		 '''Completes when''' predicate returned false (or 1 after predicate returns false if `inclusive` or upstream completes
		 
		
		
		 '''Cancels when''' predicate returned false or downstream cancels
		 
		
		
		 See also `Flow.limit`, `Flow.limitWeighted`
		- #### takeWhile
		
		
		
		```
		public [Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")> takeWhile​([Predicate](../../japi/function/Predicate.html "interface in akka.japi.function")<[Out](Flow.html "type parameter in Flow")> p)
		```
		
		Terminate processing (and cancel the upstream publisher) after predicate
		 returns false for the first time. When inclusive is `true`, include the element
		 for which the predicate returned `false`.
		 Due to input buffering some elements may have been requested from upstream publishers
		 that will then not be processed downstream of this step.
		 
		 The stream will be completed without producing any elements if predicate is false for
		 the first stream element.
		 
		
		
		 '''Emits when''' the predicate is true
		 
		
		
		 '''Backpressures when''' downstream backpressures
		 
		
		
		 '''Completes when''' predicate returned false (or 1 after predicate returns false if `inclusive` or upstream completes
		 
		
		
		 '''Cancels when''' predicate returned false or downstream cancels
		 
		
		
		 See also `Flow.limit`, `Flow.limitWeighted`
		- #### dropWhile
		
		
		
		```
		public [Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")> dropWhile​([Predicate](../../japi/function/Predicate.html "interface in akka.japi.function")<[Out](Flow.html "type parameter in Flow")> p)
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
		public [Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")> recover​(scala.PartialFunction<java.lang.Throwable,​[Out](Flow.html "type parameter in Flow")> pf)
		```
		
		Recover allows to send last element on failure and gracefully complete the stream
		 Since the underlying failure signal onError arrives out\-of\-band, it might jump over existing elements.
		 This operator can recover the failure signal, but not the skipped elements, which will be dropped.
		 
		 Throwing an exception inside `recover` \_will\_ be logged on ERROR level automatically.
		 
		
		
		 '''Emits when''' element is available from the upstream or upstream is failed and pf returns an element
		 
		
		
		 '''Backpressures when''' downstream backpressures
		 
		
		
		 '''Completes when''' upstream completes or upstream failed with exception pf can handle
		 
		
		
		 '''Cancels when''' downstream cancels
		- #### recover
		
		
		
		```
		public [Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")> recover​(java.lang.Class<? extends java.lang.Throwable> clazz,
		                                            java.util.function.Supplier<[Out](Flow.html "type parameter in Flow")> supplier)
		```
		
		Recover allows to send last element on failure and gracefully complete the stream
		 Since the underlying failure signal onError arrives out\-of\-band, it might jump over existing elements.
		 This operator can recover the failure signal, but not the skipped elements, which will be dropped.
		 
		 Throwing an exception inside `recover` \_will\_ be logged on ERROR level automatically.
		 
		
		
		 '''Emits when''' element is available from the upstream or upstream is failed and pf returns an element
		 
		
		
		 '''Backpressures when''' downstream backpressures
		 
		
		
		 '''Completes when''' upstream completes or upstream failed with exception pf can handle
		 
		
		
		 '''Cancels when''' downstream cancels
		- #### mapError
		
		
		
		```
		public [Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")> mapError​(scala.PartialFunction<java.lang.Throwable,​java.lang.Throwable> pf)
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
		public <E extends java.lang.Throwable> [Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")> mapError​(java.lang.Class<E> clazz,
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
		- #### recoverWith
		
		
		
		```
		public [Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")> recoverWith​(scala.PartialFunction<java.lang.Throwable,​? extends [Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<[Out](Flow.html "type parameter in Flow")>,​[NotUsed](../../NotUsed.html "class in akka")>> pf)
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
		- #### recoverWith
		
		
		
		```
		public [Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")> recoverWith​(java.lang.Class<? extends java.lang.Throwable> clazz,
		                                                java.util.function.Supplier<[Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<[Out](Flow.html "type parameter in Flow")>,​[NotUsed](../../NotUsed.html "class in akka")>> supplier)
		```
		
		Deprecated.
		use `recoverWithRetries` instead
		
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
		- #### onErrorComplete
		
		
		
		```
		public [Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")> onErrorComplete()
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
		public [Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")> onErrorComplete​(java.lang.Class<? extends java.lang.Throwable> clazz)
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
		public [Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")> onErrorComplete​(java.util.function.Predicate<? super java.lang.Throwable> predicate)
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
		public [Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")> recoverWithRetries​(int attempts,
		                                                       scala.PartialFunction<java.lang.Throwable,​[Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<[Out](Flow.html "type parameter in Flow")>,​[NotUsed](../../NotUsed.html "class in akka")>> pf)
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
		- #### recoverWithRetries
		
		
		
		```
		public [Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")> recoverWithRetries​(int attempts,
		                                                       java.lang.Class<? extends java.lang.Throwable> clazz,
		                                                       java.util.function.Supplier<[Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<[Out](Flow.html "type parameter in Flow")>,​[NotUsed](../../NotUsed.html "class in akka")>> supplier)
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
		`clazz` \- the class object of the failure cause
		`supplier` \- supply the new Source to be materialized
		- #### take
		
		
		
		```
		public [Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")> take​(long n)
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
		 
		
		
		 See also `Flow.limit`, `Flow.limitWeighted`
		- #### takeWithin
		
		
		
		```
		public [Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")> takeWithin​(java.time.Duration duration)
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
		 
		
		
		 See also `Flow.limit`, `Flow.limitWeighted`
		- #### conflateWithSeed
		
		
		
		```
		public <S> [Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​S,​[Mat](Flow.html "type parameter in Flow")> conflateWithSeed​([Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](Flow.html "type parameter in Flow"),​S> seed,
		                                                       [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<S,​[Out](Flow.html "type parameter in Flow"),​S> aggregate)
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
		 
		
		
		 see also `Flow.conflate` `Flow.batch` `Flow.batchWeighted`
		
		
		
		
		Parameters:
		`seed` \- Provides the first state for a conflated value using the first unconsumed element as a start
		`aggregate` \- Takes the currently aggregated value and the current pending element to produce a new aggregate
		- #### conflate
		
		
		
		```
		public [Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")> conflate​([Function2](../../japi/function/Function2.html "interface in akka.japi.function")<[Out](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow")> aggregate)
		```
		
		Allows a faster upstream to progress independently of a slower subscriber by conflating elements into a summary
		 until the subscriber is ready to accept them. For example a conflate step might average incoming numbers if the
		 upstream publisher is faster.
		 
		 This version of conflate does not change the output type of the stream. See `Flow.conflateWithSeed` for a
		 more flexible version that can take a seed function and transform elements while rolling up.
		 
		
		
		 This element only rolls up elements if the upstream is faster, but if the downstream is faster it will not
		 duplicate elements.
		 
		
		
		 Adheres to the `ActorAttributes.SupervisionStrategy` attribute.
		 
		
		
		 '''Emits when''' downstream stops backpressuring and there is a conflated element available
		 
		
		
		 '''Backpressures when''' never
		 
		
		
		 '''Completes when''' upstream completes
		 
		
		
		 '''Cancels when''' downstream cancels
		 
		
		
		 see also `Flow.conflateWithSeed` `Flow.batch` `Flow.batchWeighted`
		
		
		
		
		Parameters:
		`aggregate` \- Takes the currently aggregated value and the current pending element to produce a new aggregate
		- #### batch
		
		
		
		```
		public <S> [Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​S,​[Mat](Flow.html "type parameter in Flow")> batch​(long max,
		                                            [Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](Flow.html "type parameter in Flow"),​S> seed,
		                                            [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<S,​[Out](Flow.html "type parameter in Flow"),​S> aggregate)
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
		 
		
		
		 See also `Flow.conflate`, `Flow.batchWeighted`
		
		
		
		
		Parameters:
		`max` \- maximum number of elements to batch before backpressuring upstream (must be positive non\-zero)
		`seed` \- Provides the first state for a batched value using the first unconsumed element as a start
		`aggregate` \- Takes the currently batched value and the current pending element to produce a new aggregate
		- #### batchWeighted
		
		
		
		```
		public <S> [Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​S,​[Mat](Flow.html "type parameter in Flow")> batchWeighted​(long max,
		                                                    [Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](Flow.html "type parameter in Flow"),​java.lang.Long> costFn,
		                                                    [Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](Flow.html "type parameter in Flow"),​S> seed,
		                                                    [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<S,​[Out](Flow.html "type parameter in Flow"),​S> aggregate)
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
		 
		
		
		 See also `Flow.conflate`, `Flow.batch`
		
		
		
		
		Parameters:
		`max` \- maximum weight of elements to batch before backpressuring upstream (must be positive non\-zero)
		`costFn` \- a function to compute a single element weight
		`seed` \- Provides the first state for a batched value using the first unconsumed element as a start
		`aggregate` \- Takes the currently batched value and the current pending element to produce a new batch
		- #### expand
		
		
		
		```
		public <U> [Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​U,​[Mat](Flow.html "type parameter in Flow")> expand​([Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](Flow.html "type parameter in Flow"),​java.util.Iterator<U>> expander)
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
		See Also:
		[`extrapolate(akka.japi.function.Function<Out, java.util.Iterator<Out>>)`](#extrapolate(akka.japi.function.Function))
		- #### extrapolate
		
		
		
		```
		public [Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")> extrapolate​([Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](Flow.html "type parameter in Flow"),​java.util.Iterator<[Out](Flow.html "type parameter in Flow")>> extrapolator)
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
		`extrapolator` \- Takes the current upstream element and provides a sequence of "extrapolated" elements based
		 on the original, to be emitted in case downstream signals demand.
		See Also:
		[`expand(akka.japi.function.Function<Out, java.util.Iterator<U>>)`](#expand(akka.japi.function.Function))
		- #### extrapolate
		
		
		
		```
		public [Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")> extrapolate​([Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](Flow.html "type parameter in Flow"),​java.util.Iterator<[Out](Flow.html "type parameter in Flow")>> extrapolator,
		                                                [Out](Flow.html "type parameter in Flow") initial)
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
		`extrapolator` \- Takes the current upstream element and provides a sequence of "extrapolated" elements based
		 on the original, to be emitted in case downstream signals demand.
		`initial` \- The initial element to be emitted, in case upstream is able to stall the entire stream.
		See Also:
		[`expand(akka.japi.function.Function<Out, java.util.Iterator<U>>)`](#expand(akka.japi.function.Function))
		- #### buffer
		
		
		
		```
		public [Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")> buffer​(int size,
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
		- #### prefixAndTail
		
		
		
		```
		public [Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Pair](../../japi/Pair.html "class in akka.japi")<java.util.List<[Out](Flow.html "type parameter in Flow")>,​[Source](Source.html "class in akka.stream.javadsl")<[Out](Flow.html "type parameter in Flow"),​[NotUsed](../../NotUsed.html "class in akka")>>,​[Mat](Flow.html "type parameter in Flow")> prefixAndTail​(int n)
		```
		
		Takes up to `n` elements from the stream (less than `n` if the upstream completes before emitting `n` elements)
		 and returns a pair containing a strict sequence of the taken element
		 and a stream representing the remaining elements. If ''n'' is zero or negative, then this will return a pair
		 of an empty collection and a stream containing the whole upstream unchanged.
		 
		 In case of an upstream error, depending on the current state
		 \- the master stream signals the error if less than `n` elements have been seen, and therefore the substream
		 has not yet been emitted
		 \- the tail substream signals the error after the prefix and tail has been emitted by the main stream
		 (at that point the main stream has already completed)
		 
		
		
		 '''Emits when''' the configured number of prefix elements are available. Emits this prefix, and the rest
		 as a substream
		 
		
		
		 '''Backpressures when''' downstream backpressures or substream backpressures
		 
		
		
		 '''Completes when''' prefix elements have been consumed and substream has been consumed
		 
		
		
		 '''Cancels when''' downstream cancels or substream cancels
		- #### flatMapPrefix
		
		
		
		```
		public <Out2,​Mat2> [Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​Out2,​[Mat](Flow.html "type parameter in Flow")> flatMapPrefix​(int n,
		                                                                     [Function](../../japi/function/Function.html "interface in akka.japi.function")<java.lang.Iterable<[Out](Flow.html "type parameter in Flow")>,​[Flow](Flow.html "class in akka.stream.javadsl")<[Out](Flow.html "type parameter in Flow"),​Out2,​Mat2>> f)
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
		- #### flatMapPrefixMat
		
		
		
		```
		public <Out2,​Mat2,​Mat3> [Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​Out2,​Mat3> flatMapPrefixMat​(int n,
		                                                                                    [Function](../../japi/function/Function.html "interface in akka.japi.function")<java.lang.Iterable<[Out](Flow.html "type parameter in Flow")>,​[Flow](Flow.html "class in akka.stream.javadsl")<[Out](Flow.html "type parameter in Flow"),​Out2,​Mat2>> f,
		                                                                                    [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<[Mat](Flow.html "type parameter in Flow"),​java.util.concurrent.CompletionStage<Mat2>,​Mat3> matF)
		```
		
		mat version of [`flatMapPrefix(int, akka.japi.function.Function<java.lang.Iterable<Out>, akka.stream.javadsl.Flow<Out, Out2, Mat2>>)`](#flatMapPrefix(int,akka.japi.function.Function)), this method gives access to a future materialized value of the downstream flow (as a completion stage).
		 see [`flatMapPrefix(int, akka.japi.function.Function<java.lang.Iterable<Out>, akka.stream.javadsl.Flow<Out, Out2, Mat2>>)`](#flatMapPrefix(int,akka.japi.function.Function)) for details.
		- #### groupBy
		
		
		
		```
		public <K> [SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")> groupBy​(int maxSubstreams,
		                                                   [Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](Flow.html "type parameter in Flow"),​K> f,
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
		 
		
		
		 The object returned from this method is not a normal [`Flow`](Flow.html "class in akka.stream.javadsl"),
		 it is a [`SubFlow`](SubFlow.html "class in akka.stream.javadsl"). This means that after this operator all transformations
		 are applied to all encountered substreams in the same fashion. Substream mode
		 is exited either by closing the substream (i.e. connecting it to a [`Sink`](Sink.html "class in akka.stream.javadsl"))
		 or by merging the substreams back together; see the `to` and `mergeBack` methods
		 on [`SubFlow`](SubFlow.html "class in akka.stream.javadsl") for more information.
		 
		
		
		 It is important to note that the substreams also propagate back\-pressure as
		 any other stream, which means that blocking one substream will block the `groupBy`
		 operator itself—and thereby all substreams—once all internal or
		 explicit buffers are filled.
		 
		
		
		 If the group by function `f` throws an exception and the supervision decision
		 is [`Supervision.stop()`](../Supervision.html#stop()) the stream and substreams will be completed
		 with failure.
		 
		
		
		 If the group by function `f` throws an exception and the supervision decision
		 is [`Supervision.resume()`](../Supervision.html#resume()) or [`Supervision.restart()`](../Supervision.html#restart())
		 the element is dropped and the stream and substreams continue.
		 
		
		
		 Function `f` MUST NOT return `null`. This will throw exception and trigger supervision decision mechanism.
		 
		
		
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
		public <K> [SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")> groupBy​(int maxSubstreams,
		                                                   [Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](Flow.html "type parameter in Flow"),​K> f)
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
		[`groupBy(int, akka.japi.function.Function<Out, K>, boolean)`](#groupBy(int,akka.japi.function.Function,boolean))
		- #### splitWhen
		
		
		
		```
		public [SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")> splitWhen​([Predicate](../../japi/function/Predicate.html "interface in akka.japi.function")<[Out](Flow.html "type parameter in Flow")> p)
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
		
		
		 The object returned from this method is not a normal [`Flow`](Flow.html "class in akka.stream.javadsl"),
		 it is a [`SubFlow`](SubFlow.html "class in akka.stream.javadsl"). This means that after this operator all transformations
		 are applied to all encountered substreams in the same fashion. Substream mode
		 is exited either by closing the substream (i.e. connecting it to a [`Sink`](Sink.html "class in akka.stream.javadsl"))
		 or by merging the substreams back together; see the `to` and `mergeBack` methods
		 on [`SubFlow`](SubFlow.html "class in akka.stream.javadsl") for more information.
		 
		
		
		 It is important to note that the substreams also propagate back\-pressure as
		 any other stream, which means that blocking one substream will block the `splitWhen`
		 operator itself—and thereby all substreams—once all internal or
		 explicit buffers are filled.
		 
		
		
		 If the split predicate `p` throws an exception and the supervision decision
		 is [`Supervision.stop()`](../Supervision.html#stop()) the stream and substreams will be completed
		 with failure.
		 
		
		
		 If the split predicate `p` throws an exception and the supervision decision
		 is [`Supervision.resume()`](../Supervision.html#resume()) or [`Supervision.restart()`](../Supervision.html#restart())
		 the element is dropped and the stream and substreams continue.
		 
		
		
		 '''Emits when''' an element for which the provided predicate is true, opening and emitting
		 a new substream for subsequent element
		 
		
		
		 '''Backpressures when''' there is an element pending for the next substream, but the previous
		 is not fully consumed yet, or the substream backpressures
		 
		
		
		 '''Completes when''' upstream completes
		 
		
		
		 '''Cancels when''' downstream cancels and substreams cancel on `SubstreamCancelStrategy.drain()`, downstream
		 cancels or any substream cancels on `SubstreamCancelStrategy.propagate()`
		
		
		
		 See also `Flow.splitAfter`.
		- #### splitWhen
		
		
		
		```
		public [SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")> splitWhen​([SubstreamCancelStrategy](../SubstreamCancelStrategy.html "class in akka.stream") substreamCancelStrategy,
		                                                 [Predicate](../../japi/function/Predicate.html "interface in akka.japi.function")<[Out](Flow.html "type parameter in Flow")> p)
		```
		
		This operation applies the given predicate to all incoming elements and
		 emits them to a stream of output streams, always beginning a new one with
		 the current element if the given predicate returns true for it.
		 
		
		See Also:
		[`splitWhen(akka.japi.function.Predicate<Out>)`](#splitWhen(akka.japi.function.Predicate))
		- #### splitAfter
		
		
		
		```
		public [SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")> splitAfter​([Predicate](../../japi/function/Predicate.html "interface in akka.japi.function")<[Out](Flow.html "type parameter in Flow")> p)
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
		
		
		 The object returned from this method is not a normal [`Flow`](Flow.html "class in akka.stream.javadsl"),
		 it is a [`SubFlow`](SubFlow.html "class in akka.stream.javadsl"). This means that after this operator all transformations
		 are applied to all encountered substreams in the same fashion. Substream mode
		 is exited either by closing the substream (i.e. connecting it to a [`Sink`](Sink.html "class in akka.stream.javadsl"))
		 or by merging the substreams back together; see the `to` and `mergeBack` methods
		 on [`SubFlow`](SubFlow.html "class in akka.stream.javadsl") for more information.
		 
		
		
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
		
		
		
		 See also `Flow.splitWhen`.
		- #### splitAfter
		
		
		
		```
		public [SubFlow](SubFlow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")> splitAfter​([SubstreamCancelStrategy](../SubstreamCancelStrategy.html "class in akka.stream") substreamCancelStrategy,
		                                                  [Predicate](../../japi/function/Predicate.html "interface in akka.japi.function")<[Out](Flow.html "type parameter in Flow")> p)
		```
		
		This operation applies the given predicate to all incoming elements and
		 emits them to a stream of output streams. It \*ends\* the current substream when the
		 predicate is true.
		 
		
		See Also:
		[`splitAfter(akka.japi.function.Predicate<Out>)`](#splitAfter(akka.japi.function.Predicate))
		- #### flatMapConcat
		
		
		
		```
		public <T,​M> [Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​T,​[Mat](Flow.html "type parameter in Flow")> flatMapConcat​([Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](Flow.html "type parameter in Flow"),​? extends [Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<T>,​M>> f)
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
		public <T,​M> [Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​T,​[Mat](Flow.html "type parameter in Flow")> flatMapMerge​(int breadth,
		                                                           [Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](Flow.html "type parameter in Flow"),​? extends [Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<T>,​M>> f)
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
		public <M> [Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")> concat​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<[Out](Flow.html "type parameter in Flow")>,​M> that)
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
		public <M> [Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")> concatLazy​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<[Out](Flow.html "type parameter in Flow")>,​M> that)
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
		public [Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")> concatAllLazy​(scala.collection.immutable.Seq<[Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<[Out](Flow.html "type parameter in Flow")>,​?>> those)
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
		- #### concatMat
		
		
		
		```
		public <M,​M2> [Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​M2> concatMat​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<[Out](Flow.html "type parameter in Flow")>,​M> that,
		                                                          [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<[Mat](Flow.html "type parameter in Flow"),​M,​M2> matF)
		```
		
		Concatenate the given [`Source`](Source.html "class in akka.stream.javadsl") to this [`Flow`](Flow.html "class in akka.stream.javadsl"), meaning that once this
		 Flow\&rsquo;s input is exhausted and all result elements have been generated,
		 the Source\&rsquo;s elements will be produced.
		 
		 Note that the [`Source`](Source.html "class in akka.stream.javadsl") is materialized together with this Flow and is "detached" meaning it will
		 in effect behave as a one element buffer in front of both the sources, that eagerly demands an element on start
		 (so it can not be combined with `Source.lazy` to defer materialization of `that`).
		 
		
		
		 The second source is then kept from producing elements by asserting back\-pressure until its time comes.
		 
		
		
		 When needing a concat operator that is not detached use [`concatLazyMat(akka.stream.Graph<akka.stream.SourceShape<Out>, M>, akka.japi.function.Function2<Mat, M, M2>)`](#concatLazyMat(akka.stream.Graph,akka.japi.function.Function2))
		
		
		
		 It is recommended to use the internally optimized `Keep.left` and `Keep.right` combiners
		 where appropriate instead of manually writing functions that pass through one of the values.
		 
		
		
		
		See Also:
		[`concat(akka.stream.Graph<akka.stream.SourceShape<Out>, M>)`](#concat(akka.stream.Graph))
		- #### concatLazyMat
		
		
		
		```
		public <M,​M2> [Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​M2> concatLazyMat​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<[Out](Flow.html "type parameter in Flow")>,​M> that,
		                                                              [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<[Mat](Flow.html "type parameter in Flow"),​M,​M2> matF)
		```
		
		Concatenate the given [`Source`](Source.html "class in akka.stream.javadsl") to this [`Flow`](Flow.html "class in akka.stream.javadsl"), meaning that once this
		 Flow\&rsquo;s input is exhausted and all result elements have been generated,
		 the Source\&rsquo;s elements will be produced.
		 
		 Note that the [`Source`](Source.html "class in akka.stream.javadsl") is materialized together with this Flow, if `lazy` materialization is what is needed
		 the operator can be combined with `Source.lazy` to defer materialization of `that`.
		 
		
		
		 The second source is then kept from producing elements by asserting back\-pressure until its time comes.
		 
		
		
		 For a concat operator that is detached, use [`concatMat(akka.stream.Graph<akka.stream.SourceShape<Out>, M>, akka.japi.function.Function2<Mat, M, M2>)`](#concatMat(akka.stream.Graph,akka.japi.function.Function2))
		- #### prepend
		
		
		
		```
		public <M> [Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")> prepend​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<[Out](Flow.html "type parameter in Flow")>,​M> that)
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
		public <M> [Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")> prependLazy​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<[Out](Flow.html "type parameter in Flow")>,​M> that)
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
		- #### prependMat
		
		
		
		```
		public <M,​M2> [Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​M2> prependMat​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<[Out](Flow.html "type parameter in Flow")>,​M> that,
		                                                           [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<[Mat](Flow.html "type parameter in Flow"),​M,​M2> matF)
		```
		
		Prepend the given [`Source`](Source.html "class in akka.stream.javadsl") to this [`Flow`](Flow.html "class in akka.stream.javadsl"), meaning that before elements
		 are generated from this Flow, the Source's elements will be produced until it
		 is exhausted, at which point Flow elements will start being produced.
		 
		 Note that this Flow will be materialized together with the [`Source`](Source.html "class in akka.stream.javadsl") and just kept
		 from producing elements by asserting back\-pressure until its time comes.
		 
		
		
		 When needing a prepend operator that is not detached use [`prependLazyMat(akka.stream.Graph<akka.stream.SourceShape<Out>, M>, akka.japi.function.Function2<Mat, M, M2>)`](#prependLazyMat(akka.stream.Graph,akka.japi.function.Function2))
		
		
		
		 It is recommended to use the internally optimized `Keep.left` and `Keep.right` combiners
		 where appropriate instead of manually writing functions that pass through one of the values.
		 
		
		
		
		See Also:
		[`prepend(akka.stream.Graph<akka.stream.SourceShape<Out>, M>)`](#prepend(akka.stream.Graph))
		- #### prependLazyMat
		
		
		
		```
		public <M,​M2> [Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​M2> prependLazyMat​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<[Out](Flow.html "type parameter in Flow")>,​M> that,
		                                                               [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<[Mat](Flow.html "type parameter in Flow"),​M,​M2> matF)
		```
		
		Prepend the given [`Source`](Source.html "class in akka.stream.javadsl") to this [`Flow`](Flow.html "class in akka.stream.javadsl"), meaning that before elements
		 are generated from this Flow, the Source's elements will be produced until it
		 is exhausted, at which point Flow elements will start being produced.
		 
		 Note that the [`Source`](Source.html "class in akka.stream.javadsl") is materialized together with this Flow.
		 
		
		
		 This flow will then be kept from producing elements by asserting back\-pressure until its time comes.
		 
		
		
		 When needing a prepend operator that is detached use [`prependMat(akka.stream.Graph<akka.stream.SourceShape<Out>, M>, akka.japi.function.Function2<Mat, M, M2>)`](#prependMat(akka.stream.Graph,akka.japi.function.Function2))
		- #### orElse
		
		
		
		```
		public <M> [Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")> orElse​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<[Out](Flow.html "type parameter in Flow")>,​M> secondary)
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
		- #### orElseMat
		
		
		
		```
		public <M2,​M3> [Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​M3> orElseMat​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<[Out](Flow.html "type parameter in Flow")>,​M2> secondary,
		                                                           [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<[Mat](Flow.html "type parameter in Flow"),​M2,​M3> matF)
		```
		
		Provides a secondary source that will be consumed if this source completes without any
		 elements passing by. As soon as the first element comes through this stream, the alternative
		 will be cancelled.
		 
		 It is recommended to use the internally optimized `Keep.left` and `Keep.right` combiners
		 where appropriate instead of manually writing functions that pass through one of the values.
		 
		
		
		
		See Also:
		[`orElse(akka.stream.Graph<akka.stream.SourceShape<Out>, M>)`](#orElse(akka.stream.Graph))
		- #### alsoTo
		
		
		
		```
		public [Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")> alsoTo​([Graph](../Graph.html "interface in akka.stream")<[SinkShape](../SinkShape.html "class in akka.stream")<[Out](Flow.html "type parameter in Flow")>,​?> that)
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
		public [Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")> alsoToAll​(scala.collection.immutable.Seq<[Graph](../Graph.html "interface in akka.stream")<[SinkShape](../SinkShape.html "class in akka.stream")<[Out](Flow.html "type parameter in Flow")>,​?>> those)
		```
		
		Attaches the given [`Sink`](Sink.html "class in akka.stream.javadsl")s to this [`Flow`](Flow.html "class in akka.stream.javadsl"), meaning that elements that passes
		 through will also be sent to all those [`Sink`](Sink.html "class in akka.stream.javadsl")s.
		 
		 It is similar to [`wireTap(akka.japi.function.Procedure<Out>)`](#wireTap(akka.japi.function.Procedure)) but will backpressure instead of dropping elements when the given [`Sink`](Sink.html "class in akka.stream.javadsl")s is not ready.
		 
		
		
		 '''Emits when''' element is available and demand exists both from the Sinks and the downstream.
		 
		
		
		 '''Backpressures when''' downstream or any of the [`Sink`](Sink.html "class in akka.stream.javadsl")s backpressures
		 
		
		
		 '''Completes when''' upstream completes
		 
		
		
		 '''Cancels when''' downstream or any of the [`Sink`](Sink.html "class in akka.stream.javadsl")s cancels
		- #### alsoToMat
		
		
		
		```
		public <M2,​M3> [Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​M3> alsoToMat​([Graph](../Graph.html "interface in akka.stream")<[SinkShape](../SinkShape.html "class in akka.stream")<[Out](Flow.html "type parameter in Flow")>,​M2> that,
		                                                           [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<[Mat](Flow.html "type parameter in Flow"),​M2,​M3> matF)
		```
		
		Attaches the given [`Sink`](Sink.html "class in akka.stream.javadsl") to this [`Flow`](Flow.html "class in akka.stream.javadsl"), meaning that elements that passes
		 through will also be sent to the [`Sink`](Sink.html "class in akka.stream.javadsl").
		 
		 It is similar to [`wireTapMat(akka.stream.Graph<akka.stream.SinkShape<Out>, M2>, akka.japi.function.Function2<Mat, M2, M3>)`](#wireTapMat(akka.stream.Graph,akka.japi.function.Function2)) but will backpressure instead of dropping elements when the given [`Sink`](Sink.html "class in akka.stream.javadsl") is not ready.
		 
		
		
		 It is recommended to use the internally optimized `Keep.left` and `Keep.right` combiners
		 where appropriate instead of manually writing functions that pass through one of the values.
		 
		
		
		
		See Also:
		[`alsoTo(akka.stream.Graph<akka.stream.SinkShape<Out>, ?>)`](#alsoTo(akka.stream.Graph))
		- #### divertTo
		
		
		
		```
		public [Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")> divertTo​([Graph](../Graph.html "interface in akka.stream")<[SinkShape](../SinkShape.html "class in akka.stream")<[Out](Flow.html "type parameter in Flow")>,​?> that,
		                                             [Predicate](../../japi/function/Predicate.html "interface in akka.japi.function")<[Out](Flow.html "type parameter in Flow")> when)
		```
		
		Attaches the given [`Sink`](Sink.html "class in akka.stream.javadsl") to this [`Flow`](Flow.html "class in akka.stream.javadsl"), meaning that elements will be sent to the [`Sink`](Sink.html "class in akka.stream.javadsl")
		 instead of being passed through if the predicate `when` returns `true`.
		 
		 '''Emits when''' emits when an element is available from the input and the chosen output has demand
		 
		
		
		 '''Backpressures when''' the currently chosen output back\-pressures
		 
		
		
		 '''Completes when''' upstream completes and no output is pending
		 
		
		
		 '''Cancels when''' any of the downstreams cancel
		- #### divertToMat
		
		
		
		```
		public <M2,​M3> [Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​M3> divertToMat​([Graph](../Graph.html "interface in akka.stream")<[SinkShape](../SinkShape.html "class in akka.stream")<[Out](Flow.html "type parameter in Flow")>,​M2> that,
		                                                             [Predicate](../../japi/function/Predicate.html "interface in akka.japi.function")<[Out](Flow.html "type parameter in Flow")> when,
		                                                             [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<[Mat](Flow.html "type parameter in Flow"),​M2,​M3> matF)
		```
		
		Attaches the given [`Sink`](Sink.html "class in akka.stream.javadsl") to this [`Flow`](Flow.html "class in akka.stream.javadsl"), meaning that elements will be sent to the [`Sink`](Sink.html "class in akka.stream.javadsl")
		 instead of being passed through if the predicate `when` returns `true`.
		 
		
		See Also:
		[`It is recommended to use the internally optimized Keep.left and Keep.right combiners
		 where appropriate instead of manually writing functions that pass through one of the values.`](#divertTo(akka.stream.Graph,akka.japi.function.Predicate))
		- #### wireTap
		
		
		
		```
		public [Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")> wireTap​([Graph](../Graph.html "interface in akka.stream")<[SinkShape](../SinkShape.html "class in akka.stream")<[Out](Flow.html "type parameter in Flow")>,​?> that)
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
		- #### wireTapMat
		
		
		
		```
		public <M2,​M3> [Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​M3> wireTapMat​([Graph](../Graph.html "interface in akka.stream")<[SinkShape](../SinkShape.html "class in akka.stream")<[Out](Flow.html "type parameter in Flow")>,​M2> that,
		                                                            [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<[Mat](Flow.html "type parameter in Flow"),​M2,​M3> matF)
		```
		
		Attaches the given [`Sink`](Sink.html "class in akka.stream.javadsl") to this [`Flow`](Flow.html "class in akka.stream.javadsl") as a wire tap, meaning that elements that pass
		 through will also be sent to the wire\-tap Sink, without the latter affecting the mainline flow.
		 If the wire\-tap Sink backpressures, elements that would've been sent to it will be dropped instead.
		 
		 It is similar to [`alsoToMat(akka.stream.Graph<akka.stream.SinkShape<Out>, M2>, akka.japi.function.Function2<Mat, M2, M3>)`](#alsoToMat(akka.stream.Graph,akka.japi.function.Function2)) which does backpressure instead of dropping elements.
		 
		
		
		 It is recommended to use the internally optimized `Keep.left` and `Keep.right` combiners
		 where appropriate instead of manually writing functions that pass through one of the values.
		 
		
		
		
		See Also:
		[`wireTap(akka.japi.function.Procedure<Out>)`](#wireTap(akka.japi.function.Procedure))
		- #### interleave
		
		
		
		```
		public [Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")> interleave​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<[Out](Flow.html "type parameter in Flow")>,​?> that,
		                                               int segmentSize)
		```
		
		Interleave is a deterministic merge of the given [`Source`](Source.html "class in akka.stream.javadsl") with elements of this [`Flow`](Flow.html "class in akka.stream.javadsl").
		 It first emits `segmentSize` number of elements from this flow to downstream, then \- same amount for `that` source,
		 then repeat process.
		 
		 Example:
		 
		
		
		```
		
		 Source<Integer, ?> src = Source.from(Arrays.asList(1, 2, 3))
		 Flow<Integer, Integer, ?> flow = flow.interleave(Source.from(Arrays.asList(4, 5, 6, 7)), 2)
		 src.via(flow) // 1, 2, 4, 5, 3, 6, 7
		 
		```
		
		
		 After one of upstreams is complete than all the rest elements will be emitted from the second one
		 
		
		
		 If this [`Flow`](Flow.html "class in akka.stream.javadsl") or [`Source`](Source.html "class in akka.stream.javadsl") gets upstream error \- stream completes with failure.
		 
		
		
		 '''Emits when''' element is available from the currently consumed upstream
		 
		
		
		 '''Backpressures when''' downstream backpressures. Signal to current
		 upstream, switch to next upstream when received `segmentSize` elements
		 
		
		
		 '''Completes when''' the [`Flow`](Flow.html "class in akka.stream.javadsl") and given [`Source`](Source.html "class in akka.stream.javadsl") completes
		 
		
		
		 '''Cancels when''' downstream cancels
		- #### interleave
		
		
		
		```
		public [Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")> interleave​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<[Out](Flow.html "type parameter in Flow")>,​?> that,
		                                               int segmentSize,
		                                               boolean eagerClose)
		```
		
		Interleave is a deterministic merge of the given [`Source`](Source.html "class in akka.stream.javadsl") with elements of this [`Flow`](Flow.html "class in akka.stream.javadsl").
		 It first emits `segmentSize` number of elements from this flow to downstream, then \- same amount for `that` source,
		 then repeat process.
		 
		 If eagerClose is false and one of the upstreams complete the elements from the other upstream will continue passing
		 through the interleave operator. If eagerClose is true and one of the upstream complete interleave will cancel the
		 other upstream and complete itself.
		 
		
		
		 If this [`Flow`](Flow.html "class in akka.stream.javadsl") or [`Source`](Source.html "class in akka.stream.javadsl") gets upstream error \- stream completes with failure.
		 
		
		
		 '''Emits when''' element is available from the currently consumed upstream
		 
		
		
		 '''Backpressures when''' downstream backpressures. Signal to current
		 upstream, switch to next upstream when received `segmentSize` elements
		 
		
		
		 '''Completes when''' the [`Flow`](Flow.html "class in akka.stream.javadsl") and given [`Source`](Source.html "class in akka.stream.javadsl") completes
		 
		
		
		 '''Cancels when''' downstream cancels
		- #### interleaveMat
		
		
		
		```
		public <M,​M2> [Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​M2> interleaveMat​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<[Out](Flow.html "type parameter in Flow")>,​M> that,
		                                                              int segmentSize,
		                                                              [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<[Mat](Flow.html "type parameter in Flow"),​M,​M2> matF)
		```
		
		Interleave is a deterministic merge of the given [`Source`](Source.html "class in akka.stream.javadsl") with elements of this [`Flow`](Flow.html "class in akka.stream.javadsl").
		 It first emits `segmentSize` number of elements from this flow to downstream, then \- same amount for `that` source,
		 then repeat process.
		 
		 After one of upstreams is complete than all the rest elements will be emitted from the second one
		 
		
		
		 If this [`Flow`](Flow.html "class in akka.stream.javadsl") or [`Source`](Source.html "class in akka.stream.javadsl") gets upstream error \- stream completes with failure.
		 
		
		
		 It is recommended to use the internally optimized `Keep.left` and `Keep.right` combiners
		 where appropriate instead of manually writing functions that pass through one of the values.
		 
		
		
		
		See Also:
		[`interleave(akka.stream.Graph<akka.stream.SourceShape<Out>, ?>, int)`](#interleave(akka.stream.Graph,int))
		- #### interleaveMat
		
		
		
		```
		public <M,​M2> [Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​M2> interleaveMat​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<[Out](Flow.html "type parameter in Flow")>,​M> that,
		                                                              int segmentSize,
		                                                              boolean eagerClose,
		                                                              [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<[Mat](Flow.html "type parameter in Flow"),​M,​M2> matF)
		```
		
		Interleave is a deterministic merge of the given [`Source`](Source.html "class in akka.stream.javadsl") with elements of this [`Flow`](Flow.html "class in akka.stream.javadsl").
		 It first emits `segmentSize` number of elements from this flow to downstream, then \- same amount for `that` source,
		 then repeat process.
		 
		 If eagerClose is false and one of the upstreams complete the elements from the other upstream will continue passing
		 through the interleave operator. If eagerClose is true and one of the upstream complete interleave will cancel the
		 other upstream and complete itself.
		 
		
		
		 If this [`Flow`](Flow.html "class in akka.stream.javadsl") or [`Source`](Source.html "class in akka.stream.javadsl") gets upstream error \- stream completes with failure.
		 
		
		
		 It is recommended to use the internally optimized `Keep.left` and `Keep.right` combiners
		 where appropriate instead of manually writing functions that pass through one of the values.
		 
		
		
		
		See Also:
		[`interleave(akka.stream.Graph<akka.stream.SourceShape<Out>, ?>, int)`](#interleave(akka.stream.Graph,int))
		- #### interleaveAll
		
		
		
		```
		public [Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")> interleaveAll​(java.util.List<? extends [Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<[Out](Flow.html "type parameter in Flow")>,​?>> those,
		                                                  int segmentSize,
		                                                  boolean eagerClose)
		```
		
		Interleave is a deterministic merge of the given [`Source`](Source.html "class in akka.stream.javadsl")s with elements of this [`Flow`](Flow.html "class in akka.stream.javadsl").
		 It first emits `segmentSize` number of elements from this flow to downstream, then \- same amount for `that` source,
		 then repeat process.
		 
		 If eagerClose is false and one of the upstreams complete the elements from the other upstream will continue passing
		 through the interleave operator. If eagerClose is true and one of the upstream complete interleave will cancel the
		 other upstream and complete itself.
		 
		
		
		 If this [`Flow`](Flow.html "class in akka.stream.javadsl") or [`Source`](Source.html "class in akka.stream.javadsl") gets upstream error \- stream completes with failure.
		 
		
		
		 '''Emits when''' element is available from the currently consumed upstream
		 
		
		
		 '''Backpressures when''' downstream backpressures. Signal to current
		 upstream, switch to next upstream when received `segmentSize` elements
		 
		
		
		 '''Completes when''' the [`Flow`](Flow.html "class in akka.stream.javadsl") and given [`Source`](Source.html "class in akka.stream.javadsl") completes
		 
		
		
		 '''Cancels when''' downstream cancels
		- #### merge
		
		
		
		```
		public [Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")> merge​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<[Out](Flow.html "type parameter in Flow")>,​?> that)
		```
		
		Merge the given [`Source`](Source.html "class in akka.stream.javadsl") to this [`Flow`](Flow.html "class in akka.stream.javadsl"), taking elements as they arrive from input streams,
		 picking randomly when several elements ready.
		 
		 '''Emits when''' one of the inputs has an element available
		 
		
		
		 '''Backpressures when''' downstream backpressures
		 
		
		
		 '''Completes when''' all upstreams complete
		 
		
		
		 '''Cancels when''' downstream cancels
		- #### merge
		
		
		
		```
		public [Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")> merge​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<[Out](Flow.html "type parameter in Flow")>,​?> that,
		                                          boolean eagerComplete)
		```
		
		Merge the given [`Source`](Source.html "class in akka.stream.javadsl") to this [`Flow`](Flow.html "class in akka.stream.javadsl"), taking elements as they arrive from input streams,
		 picking randomly when several elements ready.
		 
		 '''Emits when''' one of the inputs has an element available
		 
		
		
		 '''Backpressures when''' downstream backpressures
		 
		
		
		 '''Completes when''' all upstreams complete (eagerComplete\=false) or one upstream completes (eagerComplete\=true), default value is `false`
		
		
		
		 '''Cancels when''' downstream cancels
		- #### mergeMat
		
		
		
		```
		public <M,​M2> [Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​M2> mergeMat​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<[Out](Flow.html "type parameter in Flow")>,​M> that,
		                                                         [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<[Mat](Flow.html "type parameter in Flow"),​M,​M2> matF)
		```
		
		Merge the given [`Source`](Source.html "class in akka.stream.javadsl") to this [`Flow`](Flow.html "class in akka.stream.javadsl"), taking elements as they arrive from input streams,
		 picking randomly when several elements ready.
		 
		 It is recommended to use the internally optimized `Keep.left` and `Keep.right` combiners
		 where appropriate instead of manually writing functions that pass through one of the values.
		 
		
		
		
		See Also:
		[`merge(akka.stream.Graph<akka.stream.SourceShape<Out>, ?>)`](#merge(akka.stream.Graph))
		- #### mergeMat
		
		
		
		```
		public <M,​M2> [Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​M2> mergeMat​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<[Out](Flow.html "type parameter in Flow")>,​M> that,
		                                                         [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<[Mat](Flow.html "type parameter in Flow"),​M,​M2> matF,
		                                                         boolean eagerComplete)
		```
		
		Merge the given [`Source`](Source.html "class in akka.stream.javadsl") to this [`Flow`](Flow.html "class in akka.stream.javadsl"), taking elements as they arrive from input streams,
		 picking randomly when several elements ready.
		 
		 It is recommended to use the internally optimized `Keep.left` and `Keep.right` combiners
		 where appropriate instead of manually writing functions that pass through one of the values.
		 
		
		
		
		See Also:
		[`merge(akka.stream.Graph<akka.stream.SourceShape<Out>, ?>)`](#merge(akka.stream.Graph))
		- #### mergeAll
		
		
		
		```
		public [Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")> mergeAll​(java.util.List<? extends [Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<[Out](Flow.html "type parameter in Flow")>,​?>> those,
		                                             boolean eagerComplete)
		```
		
		Merge the given [`Source`](Source.html "class in akka.stream.javadsl")s to this [`Flow`](Flow.html "class in akka.stream.javadsl"), taking elements as they arrive from input streams,
		 picking randomly when several elements ready.
		 
		 '''Emits when''' one of the inputs has an element available
		 
		
		
		 '''Backpressures when''' downstream backpressures
		 
		
		
		 '''Completes when''' all upstreams complete (eagerComplete\=false) or one upstream completes (eagerComplete\=true), default value is `false`
		
		
		
		 '''Cancels when''' downstream cancels
		- #### mergeLatest
		
		
		
		```
		public [Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​java.util.List<[Out](Flow.html "type parameter in Flow")>,​[Mat](Flow.html "type parameter in Flow")> mergeLatest​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<[Out](Flow.html "type parameter in Flow")>,​?> that,
		                                                                boolean eagerComplete)
		```
		
		MergeLatest joins elements from N input streams into stream of lists of size N.
		 i\-th element in list is the latest emitted element from i\-th input stream.
		 MergeLatest emits list for each element emitted from some input stream,
		 but only after each input stream emitted at least one element.
		 
		 '''Emits when''' an element is available from some input and each input emits at least one element from stream start
		 
		
		
		 '''Completes when''' all upstreams complete (eagerClose\=false) or one upstream completes (eagerClose\=true)
		- #### mergeLatestMat
		
		
		
		```
		public <Mat2,​Mat3> [Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​java.util.List<[Out](Flow.html "type parameter in Flow")>,​Mat3> mergeLatestMat​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<[Out](Flow.html "type parameter in Flow")>,​Mat2> that,
		                                                                                      boolean eagerComplete,
		                                                                                      [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<[Mat](Flow.html "type parameter in Flow"),​Mat2,​Mat3> matF)
		```
		
		MergeLatest joins elements from N input streams into stream of lists of size N.
		 i\-th element in list is the latest emitted element from i\-th input stream.
		 MergeLatest emits list for each element emitted from some input stream,
		 but only after each input stream emitted at least one element.
		 
		 It is recommended to use the internally optimized `Keep.left` and `Keep.right` combiners
		 where appropriate instead of manually writing functions that pass through one of the values.
		- #### mergePreferred
		
		
		
		```
		public [Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")> mergePreferred​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<[Out](Flow.html "type parameter in Flow")>,​?> that,
		                                                   boolean preferred,
		                                                   boolean eagerComplete)
		```
		
		Merge two sources. Prefer one source if both sources have elements ready.
		 
		 '''emits''' when one of the inputs has an element available. If multiple have elements available, prefer the 'right' one when 'preferred' is 'true', or the 'left' one when 'preferred' is 'false'.
		 
		
		
		 '''backpressures''' when downstream backpressures
		 
		
		
		 '''completes''' when all upstreams complete (This behavior is changeable to completing when any upstream completes by setting `eagerComplete=true`.)
		- #### mergePreferredMat
		
		
		
		```
		public <Mat2,​Mat3> [Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​Mat3> mergePreferredMat​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<[Out](Flow.html "type parameter in Flow")>,​Mat2> that,
		                                                                         boolean preferred,
		                                                                         boolean eagerComplete,
		                                                                         [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<[Mat](Flow.html "type parameter in Flow"),​Mat2,​Mat3> matF)
		```
		
		Merge two sources. Prefer one source if both sources have elements ready.
		 
		 It is recommended to use the internally optimized `Keep.left` and `Keep.right` combiners
		 where appropriate instead of manually writing functions that pass through one of the values.
		- #### mergePrioritized
		
		
		
		```
		public [Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")> mergePrioritized​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<[Out](Flow.html "type parameter in Flow")>,​?> that,
		                                                     int leftPriority,
		                                                     int rightPriority,
		                                                     boolean eagerComplete)
		```
		
		Merge two sources. Prefer the sources depending on the 'priority' parameters.
		 
		 '''emits''' when one of the inputs has an element available, preferring inputs based on the 'priority' parameters if both have elements available
		 
		
		
		 '''backpressures''' when downstream backpressures
		 
		
		
		 '''completes''' when both upstreams complete (This behavior is changeable to completing when any upstream completes by setting `eagerComplete=true`.)
		- #### mergePrioritizedMat
		
		
		
		```
		public <Mat2,​Mat3> [Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​Mat3> mergePrioritizedMat​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<[Out](Flow.html "type parameter in Flow")>,​Mat2> that,
		                                                                           int leftPriority,
		                                                                           int rightPriority,
		                                                                           boolean eagerComplete,
		                                                                           [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<[Mat](Flow.html "type parameter in Flow"),​Mat2,​Mat3> matF)
		```
		
		Merge two sources. Prefer the sources depending on the 'priority' parameters.
		 
		 It is recommended to use the internally optimized `Keep.left` and `Keep.right` combiners
		 where appropriate instead of manually writing functions that pass through one of the values.
		- #### mergeSorted
		
		
		
		```
		public <M> [Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")> mergeSorted​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<[Out](Flow.html "type parameter in Flow")>,​M> that,
		                                                    java.util.Comparator<[Out](Flow.html "type parameter in Flow")> comp)
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
		- #### mergeSortedMat
		
		
		
		```
		public <Mat2,​Mat3> [Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​Mat3> mergeSortedMat​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<[Out](Flow.html "type parameter in Flow")>,​Mat2> that,
		                                                                      java.util.Comparator<[Out](Flow.html "type parameter in Flow")> comp,
		                                                                      [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<[Mat](Flow.html "type parameter in Flow"),​Mat2,​Mat3> matF)
		```
		
		Merge the given [`Source`](Source.html "class in akka.stream.javadsl") to this [`Flow`](Flow.html "class in akka.stream.javadsl"), taking elements as they arrive from input streams,
		 picking always the smallest of the available elements (waiting for one element from each side
		 to be available). This means that possible contiguity of the input streams is not exploited to avoid
		 waiting for elements, this merge will block when one of the inputs does not have more elements (and
		 does not complete).
		 
		 It is recommended to use the internally optimized `Keep.left` and `Keep.right` combiners
		 where appropriate instead of manually writing functions that pass through one of the values.
		- #### zip
		
		
		
		```
		public <T> [Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Pair](../../japi/Pair.html "class in akka.japi")<[Out](Flow.html "type parameter in Flow"),​T>,​[Mat](Flow.html "type parameter in Flow")> zip​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<T>,​?> source)
		```
		
		Combine the elements of current [`Flow`](Flow.html "class in akka.stream.javadsl") and the given [`Source`](Source.html "class in akka.stream.javadsl") into a stream of tuples.
		 
		 '''Emits when''' all of the inputs have an element available
		 
		
		
		 '''Backpressures when''' downstream backpressures
		 
		
		
		 '''Completes when''' any upstream completes
		 
		
		
		 '''Cancels when''' downstream cancels
		- #### zipMat
		
		
		
		```
		public <T,​M,​M2> [Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Pair](../../japi/Pair.html "class in akka.japi")<[Out](Flow.html "type parameter in Flow"),​T>,​M2> zipMat​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<T>,​M> that,
		                                                                             [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<[Mat](Flow.html "type parameter in Flow"),​M,​M2> matF)
		```
		
		Combine the elements of current [`Flow`](Flow.html "class in akka.stream.javadsl") and the given [`Source`](Source.html "class in akka.stream.javadsl") into a stream of tuples.
		 
		 It is recommended to use the internally optimized `Keep.left` and `Keep.right` combiners
		 where appropriate instead of manually writing functions that pass through one of the values.
		 
		
		
		
		See Also:
		[`zip(akka.stream.Graph<akka.stream.SourceShape<T>, ?>)`](#zip(akka.stream.Graph))
		- #### zipAll
		
		
		
		```
		public <U,​A> [Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Pair](../../japi/Pair.html "class in akka.japi")<A,​U>,​[Mat](Flow.html "type parameter in Flow")> zipAll​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<U>,​?> that,
		                                                                   A thisElem,
		                                                                   U thatElem)
		```
		
		Combine the elements of current flow and the given [`Source`](Source.html "class in akka.stream.javadsl") into a stream of tuples.
		 
		 '''Emits when''' at first emits when both inputs emit, and then as long as any input emits (coupled to the default value of the completed input).
		 
		
		
		 '''Backpressures when''' downstream backpressures
		 
		
		
		 '''Completes when''' all upstream completes
		 
		
		
		 '''Cancels when''' downstream cancels
		- #### zipAllMat
		
		
		
		```
		public <U,​Mat2,​Mat3,​A> [Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Pair](../../japi/Pair.html "class in akka.japi")<A,​U>,​Mat3> zipAllMat​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<U>,​Mat2> that,
		                                                                                             A thisElem,
		                                                                                             U thatElem,
		                                                                                             scala.Function2<[Mat](Flow.html "type parameter in Flow"),​Mat2,​Mat3> matF)
		```
		
		Combine the elements of current flow and the given [`Source`](Source.html "class in akka.stream.javadsl") into a stream of tuples.
		 
		
		See Also:
		[`'''Emits when''' at first emits when both inputs emit, and then as long as any input emits (coupled to the default value of the completed input).
		 
		 '''Backpressures when''' downstream backpressures
		 
		 '''Completes when''' all upstream completes
		 
		 '''Cancels when''' downstream cancels`](#zipAll(akka.stream.Graph,A,U))
		- #### zipLatest
		
		
		
		```
		public <T> [Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Pair](../../japi/Pair.html "class in akka.japi")<[Out](Flow.html "type parameter in Flow"),​T>,​[Mat](Flow.html "type parameter in Flow")> zipLatest​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<T>,​?> source)
		```
		
		Combine the elements of 2 streams into a stream of tuples, picking always the latest element of each.
		 
		 A `ZipLatest` has a `left` and a `right` input port and one `out` port.
		 
		
		
		 No element is emitted until at least one element from each Source becomes available.
		 
		
		
		 '''Emits when''' all of the inputs have at least an element available, and then each time an element becomes
		 \* available on either of the inputs
		 
		
		
		 '''Backpressures when''' downstream backpressures
		 
		
		
		 '''Completes when''' any upstream completes
		 
		
		
		 '''Cancels when''' downstream cancels
		- #### zipLatestMat
		
		
		
		```
		public <T,​M,​M2> [Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Pair](../../japi/Pair.html "class in akka.japi")<[Out](Flow.html "type parameter in Flow"),​T>,​M2> zipLatestMat​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<T>,​M> that,
		                                                                                   [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<[Mat](Flow.html "type parameter in Flow"),​M,​M2> matF)
		```
		
		Combine the elements of current [`Flow`](Flow.html "class in akka.stream.javadsl") and the given [`Source`](Source.html "class in akka.stream.javadsl") into a stream of tuples, picking always the latest element of each.
		 
		 It is recommended to use the internally optimized `Keep.left` and `Keep.right` combiners
		 where appropriate instead of manually writing functions that pass through one of the values.
		 
		
		
		
		See Also:
		[`zipLatest(akka.stream.Graph<akka.stream.SourceShape<T>, ?>)`](#zipLatest(akka.stream.Graph))
		- #### zipWith
		
		
		
		```
		public <Out2,​Out3> [Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​Out3,​[Mat](Flow.html "type parameter in Flow")> zipWith​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<Out2>,​?> that,
		                                                               [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<[Out](Flow.html "type parameter in Flow"),​Out2,​Out3> combine)
		```
		
		Put together the elements of current [`Flow`](Flow.html "class in akka.stream.javadsl") and the given [`Source`](Source.html "class in akka.stream.javadsl")
		 into a stream of combined elements using a combiner function.
		 
		 '''Emits when''' all of the inputs have an element available
		 
		
		
		 '''Backpressures when''' downstream backpressures
		 
		
		
		 '''Completes when''' any upstream completes
		 
		
		
		 '''Cancels when''' downstream cancels
		- #### zipWithMat
		
		
		
		```
		public <Out2,​Out3,​M,​M2> [Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​Out3,​M2> zipWithMat​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<Out2>,​M> that,
		                                                                                  [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<[Out](Flow.html "type parameter in Flow"),​Out2,​Out3> combine,
		                                                                                  [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<[Mat](Flow.html "type parameter in Flow"),​M,​M2> matF)
		```
		
		Put together the elements of current [`Flow`](Flow.html "class in akka.stream.javadsl") and the given [`Source`](Source.html "class in akka.stream.javadsl")
		 into a stream of combined elements using a combiner function.
		 
		 It is recommended to use the internally optimized `Keep.left` and `Keep.right` combiners
		 where appropriate instead of manually writing functions that pass through one of the values.
		 
		
		
		
		See Also:
		[`zipWith(akka.stream.Graph<akka.stream.SourceShape<Out2>, ?>, akka.japi.function.Function2<Out, Out2, Out3>)`](#zipWith(akka.stream.Graph,akka.japi.function.Function2))
		- #### zipLatestWith
		
		
		
		```
		public <Out2,​Out3> [Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​Out3,​[Mat](Flow.html "type parameter in Flow")> zipLatestWith​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<Out2>,​?> that,
		                                                                     [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<[Out](Flow.html "type parameter in Flow"),​Out2,​Out3> combine)
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
		public <Out2,​Out3> [Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​Out3,​[Mat](Flow.html "type parameter in Flow")> zipLatestWith​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<Out2>,​?> that,
		                                                                     boolean eagerComplete,
		                                                                     [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<[Out](Flow.html "type parameter in Flow"),​Out2,​Out3> combine)
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
		- #### zipLatestWithMat
		
		
		
		```
		public <Out2,​Out3,​M,​M2> [Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​Out3,​M2> zipLatestWithMat​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<Out2>,​M> that,
		                                                                                        boolean eagerComplete,
		                                                                                        [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<[Out](Flow.html "type parameter in Flow"),​Out2,​Out3> combine,
		                                                                                        [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<[Mat](Flow.html "type parameter in Flow"),​M,​M2> matF)
		```
		
		Put together the elements of current [`Flow`](Flow.html "class in akka.stream.javadsl") and the given [`Source`](Source.html "class in akka.stream.javadsl")
		 into a stream of combined elements using a combiner function, picking always the latest element of each.
		 
		 It is recommended to use the internally optimized `Keep.left` and `Keep.right` combiners
		 where appropriate instead of manually writing functions that pass through one of the values.
		 
		
		
		
		See Also:
		[`zipLatestWith(akka.stream.Graph<akka.stream.SourceShape<Out2>, ?>, akka.japi.function.Function2<Out, Out2, Out3>)`](#zipLatestWith(akka.stream.Graph,akka.japi.function.Function2))
		- #### zipLatestWithMat
		
		
		
		```
		public <Out2,​Out3,​M,​M2> [Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​Out3,​M2> zipLatestWithMat​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<Out2>,​M> that,
		                                                                                        [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<[Out](Flow.html "type parameter in Flow"),​Out2,​Out3> combine,
		                                                                                        [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<[Mat](Flow.html "type parameter in Flow"),​M,​M2> matF)
		```
		
		Put together the elements of current [`Flow`](Flow.html "class in akka.stream.javadsl") and the given [`Source`](Source.html "class in akka.stream.javadsl")
		 into a stream of combined elements using a combiner function, picking always the latest element of each.
		 
		 It is recommended to use the internally optimized `Keep.left` and `Keep.right` combiners
		 where appropriate instead of manually writing functions that pass through one of the values.
		 
		
		
		
		See Also:
		[`zipLatestWith(akka.stream.Graph<akka.stream.SourceShape<Out2>, ?>, akka.japi.function.Function2<Out, Out2, Out3>)`](#zipLatestWith(akka.stream.Graph,akka.japi.function.Function2))
		- #### zipWithIndex
		
		
		
		```
		public [Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Pair](../../japi/Pair.html "class in akka.japi")<[Out](Flow.html "type parameter in Flow"),​java.lang.Long>,​[Mat](Flow.html "type parameter in Flow")> zipWithIndex()
		```
		
		Combine the elements of current flow into a stream of tuples consisting
		 of all elements paired with their index. Indices start at 0\.
		 
		 '''Emits when''' upstream emits an element and is paired with their index
		 
		
		
		 '''Backpressures when''' downstream backpressures
		 
		
		
		 '''Completes when''' upstream completes
		 
		
		
		 '''Cancels when''' downstream cancels
		- #### initialTimeout
		
		
		
		```
		public [Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")> initialTimeout​(java.time.Duration timeout)
		```
		
		If the first element has not passed through this operator before the provided timeout, the stream is failed
		 with a [`InitialTimeoutException`](../InitialTimeoutException.html "class in akka.stream").
		 
		 '''Emits when''' upstream emits an element
		 
		
		
		 '''Backpressures when''' downstream backpressures
		 
		
		
		 '''Completes when''' upstream completes or fails if timeout elapses before first element arrives
		 
		
		
		 '''Cancels when''' downstream cancels
		- #### completionTimeout
		
		
		
		```
		public [Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")> completionTimeout​(java.time.Duration timeout)
		```
		
		If the completion of the stream does not happen until the provided timeout, the stream is failed
		 with a [`CompletionTimeoutException`](../CompletionTimeoutException.html "class in akka.stream").
		 
		 '''Emits when''' upstream emits an element
		 
		
		
		 '''Backpressures when''' downstream backpressures
		 
		
		
		 '''Completes when''' upstream completes or fails if timeout elapses before upstream completes
		 
		
		
		 '''Cancels when''' downstream cancels
		- #### idleTimeout
		
		
		
		```
		public [Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")> idleTimeout​(java.time.Duration timeout)
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
		public [Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")> backpressureTimeout​(java.time.Duration timeout)
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
		public [Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")> keepAlive​(java.time.Duration maxIdle,
		                                              [Creator](../../japi/function/Creator.html "interface in akka.japi.function")<[Out](Flow.html "type parameter in Flow")> injectedElem)
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
		public [Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")> throttle​(int elements,
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
		public [Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")> throttle​(int elements,
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
		public [Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")> throttle​(int cost,
		                                             java.time.Duration per,
		                                             [Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](Flow.html "type parameter in Flow"),​java.lang.Integer> costCalculation)
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
		public [Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")> throttle​(int cost,
		                                             java.time.Duration per,
		                                             int maximumBurst,
		                                             [Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](Flow.html "type parameter in Flow"),​java.lang.Integer> costCalculation,
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
		public [Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")> throttle​([ThrottleControl](ThrottleControl.html "class in akka.stream.javadsl") control)
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
		public [Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")> throttle​([ThrottleControl](ThrottleControl.html "class in akka.stream.javadsl") control,
		                                             [Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](Flow.html "type parameter in Flow"),​java.lang.Integer> costCalculation)
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
		- #### detach
		
		
		
		```
		public [Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")> detach()
		```
		
		Detaches upstream demand from downstream demand without detaching the
		 stream rates; in other words acts like a buffer of size 1\.
		 
		 '''Emits when''' upstream emits an element
		 
		
		
		 '''Backpressures when''' downstream backpressures
		 
		
		
		 '''Completes when''' upstream completes
		 
		
		
		 '''Cancels when''' downstream cancels
		- #### watchTermination
		
		
		
		```
		public <M> [Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​M> watchTermination​([Function2](../../japi/function/Function2.html "interface in akka.japi.function")<[Mat](Flow.html "type parameter in Flow"),​java.util.concurrent.CompletionStage<[Done](../../Done.html "class in akka")>,​M> matF)
		```
		
		Materializes to `CompletionStage` that completes on getting termination message.
		 The future completes with success when received complete message from upstream or cancel
		 from downstream. It fails with the same error when received error message from
		 downstream.
		 
		 It is recommended to use the internally optimized `Keep.left` and `Keep.right` combiners
		 where appropriate instead of manually writing functions that pass through one of the values.
		- #### monitorMat
		
		
		
		```
		public <M> [Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​M> monitorMat​([Function2](../../japi/function/Function2.html "interface in akka.japi.function")<[Mat](Flow.html "type parameter in Flow"),​[FlowMonitor](../FlowMonitor.html "interface in akka.stream")<[Out](Flow.html "type parameter in Flow")>,​M> combine)
		```
		
		Materializes to `FlowMonitor[Out]` that allows monitoring of the current flow. All events are propagated
		 by the monitor unchanged. Note that the monitor inserts a memory barrier every time it processes an
		 event, and may therefor affect performance.
		 
		 The `combine` function is used to combine the `FlowMonitor` with this flow's materialized value.
		- #### monitor
		
		
		
		```
		public [Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Pair](../../japi/Pair.html "class in akka.japi")<[Mat](Flow.html "type parameter in Flow"),​[FlowMonitor](../FlowMonitor.html "interface in akka.stream")<[Out](Flow.html "type parameter in Flow")>>> monitor()
		```
		
		Materializes to `Pair>`, which is unlike most other operators (!),
		 in which usually the default materialized value keeping semantics is to keep the left value
		 (by passing `Keep.left()` to a `*Mat` version of a method). This operator is an exception from
		 that rule and keeps both values since dropping its sole purpose is to introduce that materialized value.
		 
		 The `FlowMonitor[Out]` allows monitoring of the current flow. All events are propagated
		 by the monitor unchanged. Note that the monitor inserts a memory barrier every time it processes an
		 event, and may therefor affect performance.
		- #### initialDelay
		
		
		
		```
		public [Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")> initialDelay​(java.time.Duration delay)
		```
		
		Delays the initial element by the specified duration.
		 
		 '''Emits when''' upstream emits an element if the initial delay is already elapsed
		 
		
		
		 '''Backpressures when''' downstream backpressures or initial delay is not yet elapsed
		 
		
		
		 '''Completes when''' upstream completes
		 
		
		
		 '''Cancels when''' downstream cancels
		- #### withAttributes
		
		
		
		```
		public [Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")> withAttributes​([Attributes](../Attributes.html "class in akka.stream") attr)
		```
		
		Replace the attributes of this [`Flow`](Flow.html "class in akka.stream.javadsl") with the given ones. If this Flow is a composite
		 of multiple graphs, new attributes on the composite will be less specific than attributes
		 set directly on the individual graphs of the composite.
		 
		 Note that this operation has no effect on an empty Flow (because the attributes apply
		 only to the contained processing operators).
		
		
		
		Specified by:
		`[withAttributes](../Graph.html#withAttributes(akka.stream.Attributes))` in interface `[Graph](../Graph.html "interface in akka.stream")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow")>`
		- #### addAttributes
		
		
		
		```
		public [Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")> addAttributes​([Attributes](../Attributes.html "class in akka.stream") attr)
		```
		
		Add the given attributes to this [`Flow`](Flow.html "class in akka.stream.javadsl"). If the specific attribute was already present
		 on this graph this means the added attribute will be more specific than the existing one.
		 If this Flow is a composite of multiple graphs, new attributes on the composite will be
		 less specific than attributes set directly on the individual graphs of the composite.
		
		Specified by:
		`[addAttributes](../Graph.html#addAttributes(akka.stream.Attributes))` in interface `[Graph](../Graph.html "interface in akka.stream")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow")>`
		- #### named
		
		
		
		```
		public [Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")> named​(java.lang.String name)
		```
		
		Add a name attribute to this Flow.
		
		Specified by:
		`[named](../Graph.html#named(java.lang.String))` in interface `[Graph](../Graph.html "interface in akka.stream")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow")>`
		- #### async
		
		
		
		```
		public [Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")> async()
		```
		
		Put an asynchronous boundary around this `Flow`
		
		Specified by:
		`[async](../Graph.html#async())` in interface `[Graph](../Graph.html "interface in akka.stream")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow")>`
		- #### async
		
		
		
		```
		public [Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")> async​(java.lang.String dispatcher)
		```
		
		Put an asynchronous boundary around this `Flow`
		
		
		Specified by:
		`[async](../Graph.html#async(java.lang.String))` in interface `[Graph](../Graph.html "interface in akka.stream")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow")>`
		Parameters:
		`dispatcher` \- Run the graph on this dispatcher
		- #### async
		
		
		
		```
		public [Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")> async​(java.lang.String dispatcher,
		                                          int inputBufferSize)
		```
		
		Put an asynchronous boundary around this `Flow`
		
		
		Specified by:
		`[async](../Graph.html#async(java.lang.String,int))` in interface `[Graph](../Graph.html "interface in akka.stream")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow")>`
		Parameters:
		`dispatcher` \- Run the graph on this dispatcher
		`inputBufferSize` \- Set the input buffer to this size for the graph
		- #### log
		
		
		
		```
		public [Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")> log​(java.lang.String name,
		                                        [Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](Flow.html "type parameter in Flow"),​java.lang.Object> extract,
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
		public [Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")> log​(java.lang.String name,
		                                        [Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](Flow.html "type parameter in Flow"),​java.lang.Object> extract)
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
		public [Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")> log​(java.lang.String name,
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
		public [Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")> log​(java.lang.String name)
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
		public [Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")> logWithMarker​(java.lang.String name,
		                                                  [Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](Flow.html "type parameter in Flow"),​[LogMarker](../../event/LogMarker.html "class in akka.event")> marker,
		                                                  [Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](Flow.html "type parameter in Flow"),​java.lang.Object> extract,
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
		public [Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")> logWithMarker​(java.lang.String name,
		                                                  [Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](Flow.html "type parameter in Flow"),​[LogMarker](../../event/LogMarker.html "class in akka.event")> marker,
		                                                  [Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](Flow.html "type parameter in Flow"),​java.lang.Object> extract)
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
		public [Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")> logWithMarker​(java.lang.String name,
		                                                  [Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](Flow.html "type parameter in Flow"),​[LogMarker](../../event/LogMarker.html "class in akka.event")> marker,
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
		public [Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow"),​[Mat](Flow.html "type parameter in Flow")> logWithMarker​(java.lang.String name,
		                                                  [Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](Flow.html "type parameter in Flow"),​[LogMarker](../../event/LogMarker.html "class in akka.event")> marker)
		```
		
		Logs elements flowing through the stream as well as completion and erroring.
		 
		 By default element and completion signals are logged on debug level, and errors are logged on Error level.
		 This can be adjusted according to your needs by providing a custom `Attributes.LogLevels` attribute on the given Flow.
		 
		
		
		 Uses an internally created `MarkerLoggingAdapter` which uses `akka.stream.Log` as it's source (use this class to configure slf4j loggers).
		 
		
		
		 '''Emits when''' the mapping function returns an element
		 
		
		
		 '''Backpressures when''' downstream backpressures
		 
		
		
		 '''Completes when''' upstream completes
		 
		
		
		 '''Cancels when''' downstream cancels
		- #### toProcessor
		
		
		
		```
		public [RunnableGraph](RunnableGraph.html "class in akka.stream.javadsl")<org.reactivestreams.Processor<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow")>> toProcessor()
		```
		
		Converts this Flow to a [`RunnableGraph`](RunnableGraph.html "class in akka.stream.javadsl") that materializes to a Reactive Streams `Processor`
		 which implements the operations encapsulated by this Flow. Every materialization results in a new Processor
		 instance, i.e. the returned [`RunnableGraph`](RunnableGraph.html "class in akka.stream.javadsl") is reusable.
		 
		
		Returns:
		A [`RunnableGraph`](RunnableGraph.html "class in akka.stream.javadsl") that materializes to a Processor when run() is called on it.
		- #### asFlowWithContext
		
		
		
		```
		public <U,​CtxU,​CtxOut> [FlowWithContext](FlowWithContext.html "class in akka.stream.javadsl")<U,​CtxU,​[Out](Flow.html "type parameter in Flow"),​CtxOut,​[Mat](Flow.html "type parameter in Flow")> asFlowWithContext​([Function2](../../japi/function/Function2.html "interface in akka.japi.function")<U,​CtxU,​[In](Flow.html "type parameter in Flow")> collapseContext,
		                                                                                                                    [Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](Flow.html "type parameter in Flow"),​CtxOut> extractContext)
		```
		
		Turns a Flow into a FlowWithContext which manages a context per element along a stream.
		 
		
		Parameters:
		`collapseContext` \- turn each incoming pair of element and context value into an element of this Flow
		`extractContext` \- turn each outgoing element of this Flow into an outgoing context value
		- #### aggregateWithBoundary
		
		
		
		```
		public <Agg,​Emit> [Flow](Flow.html "class in akka.stream.javadsl")<[In](Flow.html "type parameter in Flow"),​Emit,​[Mat](Flow.html "type parameter in Flow")> aggregateWithBoundary​(java.util.function.Supplier<Agg> allocate,
		                                                                            [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<Agg,​[Out](Flow.html "type parameter in Flow"),​[Pair](../../japi/Pair.html "class in akka.japi")<Agg,​java.lang.Object>> aggregate,
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
		- #### getAttributes
		
		
		
		```
		public [Attributes](../Attributes.html "class in akka.stream") getAttributes()
		```
		
		
		Specified by:
		`[getAttributes](../Graph.html#getAttributes())` in interface `[Graph](../Graph.html "interface in akka.stream")<[In](Flow.html "type parameter in Flow"),​[Out](Flow.html "type parameter in Flow")>`

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

### Example 5: via

```text
+---------------------------------+
     | Resulting Flow[In, T, Mat]  |
     |                                 |
     |  +------+             +------+  |
     |  |      |             |      |  |
 In ~~> | this |  ~~Out~~>   | flow | ~~> T
     |  |   Mat|             |     M|  |
     |  +------+             +------+  |
     +---------------------------------+
```

### Example 6: viaMat

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

### Example 7: to

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

### Example 8: toMat

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

### Example 9: join

```text
+------+        +-------+
 |      | ~Out~> |       |
 | this |        | other |
 |      | <~In~  |       |
 +------+        +-------+
```

### Example 10: joinMat

```text
+------+        +-------+
 |      | ~Out~> |       |
 | this |        | other |
 |      | <~In~  |       |
 +------+        +-------+
```

### Example 11: join

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

### Example 12: joinMat

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

### Example 13: intersperse

```text
Source<Integer, ?> nums = Source.from(Arrays.asList(0, 1, 2, 3));
 nums.intersperse(",");            //   1 , 2 , 3
 nums.intersperse("[", ",", "]");  // [ 1 , 2 , 3 ]
```

### Example 14: intersperse

```text
Source.single(">> ").concat(flow.intersperse(","))
 flow.intersperse(",").concat(Source.single("END"))
```

### Example 15: intersperse

```text
Source<Integer, ?> nums = Source.from(Arrays.asList(0, 1, 2, 3));
 nums.intersperse(",");            //   1 , 2 , 3
 nums.intersperse("[", ",", "]");  // [ 1 , 2 , 3 ]
```

### Example 16: splitWhen

```text
false,             // element goes into first substream
 true, false,       // elements go into second substream
 true, false, false // elements go into third substream
```

### Example 17: splitWhen

```text
true, false, false // first substream starts from the split-by element
 true, false        // subsequent substreams operate the same way
```

### Example 18: splitAfter

```text
false, true,        // elements go into first substream
 false, true,        // elements go into second substream
 false, false, true  // elements go into third substream
```

### Example 19: interleave

```text
Source<Integer, ?> src = Source.from(Arrays.asList(1, 2, 3))
 Flow<Integer, Integer, ?> flow = flow.interleave(Source.from(Arrays.asList(4, 5, 6, 7)), 2)
 src.via(flow) // 1, 2, 4, 5, 3, 6, 7
```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/Done.html
- https://doc.akka.io/japi/akka/current/akka/NotUsed.html
- https://doc.akka.io/japi/akka/current/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka/current/akka/actor/ClassicActorSystemProvider.html
- https://doc.akka.io/japi/akka/current/akka/event/LogMarker.html
- https://doc.akka.io/japi/akka/current/akka/event/LoggingAdapter.html
- https://doc.akka.io/japi/akka/current/akka/event/MarkerLoggingAdapter.html
- https://doc.akka.io/japi/akka/current/akka/japi/Pair.html
- https://doc.akka.io/japi/akka/current/akka/japi/function/Creator.html
- https://doc.akka.io/japi/akka/current/akka/japi/function/Function.html
- https://doc.akka.io/japi/akka/current/akka/japi/function/Function2.html
- https://doc.akka.io/japi/akka/current/akka/japi/function/Predicate.html
- https://doc.akka.io/japi/akka/current/akka/japi/function/Procedure.html
- https://doc.akka.io/japi/akka/current/akka/pattern/AskTimeoutException.html
- https://doc.akka.io/japi/akka/current/akka/stream/ActorMaterializer.html
- https://doc.akka.io/japi/akka/current/akka/stream/Attributes.html
- https://doc.akka.io/japi/akka/current/akka/stream/BackpressureTimeoutException.html
- https://doc.akka.io/japi/akka/current/akka/stream/BidiShape.html
- https://doc.akka.io/japi/akka/current/akka/stream/CompletionTimeoutException.html
- https://doc.akka.io/japi/akka/current/akka/stream/DelayOverflowStrategy.html
- https://doc.akka.io/japi/akka/current/akka/stream/FlowMonitor.html
- https://doc.akka.io/japi/akka/current/akka/stream/FlowShape.html
- https://doc.akka.io/japi/akka/current/akka/stream/Graph.GraphMapMatVal.html
- https://doc.akka.io/japi/akka/current/akka/stream/Graph.html
- https://doc.akka.io/japi/akka/current/akka/stream/InitialTimeoutException.html
- https://doc.akka.io/japi/akka/current/akka/stream/Materializer.html
- https://doc.akka.io/japi/akka/current/akka/stream/OverflowStrategy.html
- https://doc.akka.io/japi/akka/current/akka/stream/Shape.html
- https://doc.akka.io/japi/akka/current/akka/stream/SinkShape.html
- https://doc.akka.io/japi/akka/current/akka/stream/SourceShape.html
- https://doc.akka.io/japi/akka/current/akka/stream/StreamIdleTimeoutException.html
- https://doc.akka.io/japi/akka/current/akka/stream/SubstreamCancelStrategy.html
- https://doc.akka.io/japi/akka/current/akka/stream/Supervision.html
- https://doc.akka.io/japi/akka/current/akka/stream/ThrottleMode.html
- https://doc.akka.io/japi/akka/current/akka/stream/WatchedActorTerminatedException.html
- https://doc.akka.io/japi/akka/current/akka/stream/javadsl/BidiFlow.html
- https://doc.akka.io/japi/akka/current/akka/stream/javadsl/DelayStrategy.html
- https://doc.akka.io/japi/akka/current/akka/stream/javadsl/Flow.html
- https://doc.akka.io/japi/akka/current/akka/stream/javadsl/FlowWithContext.html
- https://doc.akka.io/japi/akka/current/akka/stream/javadsl/RunnableGraph.html
- https://doc.akka.io/japi/akka/current/akka/stream/javadsl/Sink.html
- https://doc.akka.io/japi/akka/current/akka/stream/javadsl/Source.html
- https://doc.akka.io/japi/akka/current/akka/stream/javadsl/SubFlow.html
- https://doc.akka.io/japi/akka/current/akka/stream/javadsl/ThrottleControl.html
- https://doc.akka.io/japi/akka/current/akka/stream/javadsl/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/Flow.html
- https://doc.akka.io/japi/akka/current/akka/util/Timeout.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/stream/javadsl/Flow.html](https://doc.akka.io/japi/akka/current/akka/stream/javadsl/Flow.html)*