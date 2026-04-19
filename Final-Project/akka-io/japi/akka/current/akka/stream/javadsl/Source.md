---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:45:16Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/stream/javadsl/Source.html
title: Source
---

# Source

## Content

Package [akka.stream.javadsl](package-summary.html)
## Class Source\<Out,​Mat\>

- java.lang.Object
- - akka.stream.javadsl.Source\<Out,​Mat\>

- All Implemented Interfaces:
`[Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<Out>,​Mat>`

---

```
public final class Source<Out,​Mat>
extends java.lang.Object
implements [Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<Out>,​Mat>
```

Java API
 
 A `Source` is a set of stream processing steps that has one open output and an attached input.
 Can be used as a `Publisher`

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface akka.stream.[Graph](../Graph.html "interface in akka.stream")
		
		
		`[Graph.GraphMapMatVal](../Graph.GraphMapMatVal.html "class in akka.stream")<[S](../Graph.GraphMapMatVal.html "type parameter in Graph.GraphMapMatVal") extends [Shape](../Shape.html "class in akka.stream"),​[M](../Graph.GraphMapMatVal.html "type parameter in Graph.GraphMapMatVal")>`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Source](#%3Cinit%3E(akka.stream.scaladsl.Source))​([Source](../scaladsl/Source.html "class in akka.stream.scaladsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")> delegate)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) [Deprecated Methods](javascript:show(32);) 
	| Modifier and Type | Method | Description |
	| `static <T> [Source](Source.html "class in akka.stream.javadsl")<T,​[ActorRef](../../actor/ActorRef.html "class in akka.actor")>` | `[actorRef](#actorRef(int,akka.stream.OverflowStrategy))​(int bufferSize,  [OverflowStrategy](../OverflowStrategy.html "class in akka.stream") overflowStrategy)` | Deprecated. Use variant accepting completion and failure matchers. |
	| `static <T> [Source](Source.html "class in akka.stream.javadsl")<T,​[ActorRef](../../actor/ActorRef.html "class in akka.actor")>` | `[actorRef](#actorRef(akka.japi.function.Function,akka.japi.function.Function,int,akka.stream.OverflowStrategy))​([Function](../../japi/function/Function.html "interface in akka.japi.function")<java.lang.Object,​java.util.Optional<[CompletionStrategy](../CompletionStrategy.html "interface in akka.stream")>> completionMatcher,  [Function](../../japi/function/Function.html "interface in akka.japi.function")<java.lang.Object,​java.util.Optional<java.lang.Throwable>> failureMatcher,  int bufferSize,  [OverflowStrategy](../OverflowStrategy.html "class in akka.stream") overflowStrategy)` | Creates a `Source` that is materialized as an [`ActorRef`](../../actor/ActorRef.html "class in akka.actor"). |
	| `static <T> [Source](Source.html "class in akka.stream.javadsl")<T,​[ActorRef](../../actor/ActorRef.html "class in akka.actor")>` | `[actorRefWithAck](#actorRefWithAck(java.lang.Object))​(java.lang.Object ackMessage)` | Deprecated. Use actorRefWithBackpressure accepting completion and failure matchers. |
	| `static <T> [Source](Source.html "class in akka.stream.javadsl")<T,​[ActorRef](../../actor/ActorRef.html "class in akka.actor")>` | `[actorRefWithAck](#actorRefWithAck(java.lang.Object,akka.japi.function.Function,akka.japi.function.Function))​(java.lang.Object ackMessage,  [Function](../../japi/function/Function.html "interface in akka.japi.function")<java.lang.Object,​java.util.Optional<[CompletionStrategy](../CompletionStrategy.html "interface in akka.stream")>> completionMatcher,  [Function](../../japi/function/Function.html "interface in akka.japi.function")<java.lang.Object,​java.util.Optional<java.lang.Throwable>> failureMatcher)` | Deprecated. Use actorRefWithBackpressure instead |
	| `static <T> [Source](Source.html "class in akka.stream.javadsl")<T,​[ActorRef](../../actor/ActorRef.html "class in akka.actor")>` | `[actorRefWithBackpressure](#actorRefWithBackpressure(java.lang.Object,akka.japi.function.Function,akka.japi.function.Function))​(java.lang.Object ackMessage,  [Function](../../japi/function/Function.html "interface in akka.japi.function")<java.lang.Object,​java.util.Optional<[CompletionStrategy](../CompletionStrategy.html "interface in akka.stream")>> completionMatcher,  [Function](../../japi/function/Function.html "interface in akka.japi.function")<java.lang.Object,​java.util.Optional<java.lang.Throwable>> failureMatcher)` | Creates a `Source` that is materialized as an [`ActorRef`](../../actor/ActorRef.html "class in akka.actor"). |
	| `[Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")>` | `[addAttributes](#addAttributes(akka.stream.Attributes))​([Attributes](../Attributes.html "class in akka.stream") attr)` | Add the given attributes to this [`Source`](Source.html "class in akka.stream.javadsl"). |
	| `<Agg,​Emit>[Source](Source.html "class in akka.stream.javadsl")<Emit,​[Mat](Source.html "type parameter in Source")>` | `[aggregateWithBoundary](#aggregateWithBoundary(java.util.function.Supplier,akka.japi.function.Function2,akka.japi.function.Function,akka.japi.Pair))​(java.util.function.Supplier<Agg> allocate,  [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<Agg,​[Out](Source.html "type parameter in Source"),​[Pair](../../japi/Pair.html "class in akka.japi")<Agg,​java.lang.Object>> aggregate,  [Function](../../japi/function/Function.html "interface in akka.japi.function")<Agg,​Emit> harvest,  [Pair](../../japi/Pair.html "class in akka.japi")<java.util.function.Predicate<Agg>,​java.time.Duration> emitOnTimer)` | Aggregate input elements into an arbitrary data structure that can be completed and emitted downstream  when custom condition is met which can be triggered by aggregate or timer. |
	| `[Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")>` | `[alsoTo](#alsoTo(akka.stream.Graph))​([Graph](../Graph.html "interface in akka.stream")<[SinkShape](../SinkShape.html "class in akka.stream")<[Out](Source.html "type parameter in Source")>,​?> that)` | Attaches the given [`Sink`](Sink.html "class in akka.stream.javadsl") to this [`Source`](Source.html "class in akka.stream.javadsl"), meaning that elements that passes  through will also be sent to the [`Sink`](Sink.html "class in akka.stream.javadsl"). |
	| `[Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")>` | `[alsoToAll](#alsoToAll(akka.stream.Graph...))​([Graph](../Graph.html "interface in akka.stream")<[SinkShape](../SinkShape.html "class in akka.stream")<[Out](Source.html "type parameter in Source")>,​?>... those)` | Attaches the given [`Sink`](Sink.html "class in akka.stream.javadsl")s to this [`Source`](Source.html "class in akka.stream.javadsl"), meaning that elements that passes  through will also be sent to all those [`Sink`](Sink.html "class in akka.stream.javadsl")s. |
	| `[Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")>` | `[alsoToAll](#alsoToAll(scala.collection.immutable.Seq))​(scala.collection.immutable.Seq<[Graph](../Graph.html "interface in akka.stream")<[SinkShape](../SinkShape.html "class in akka.stream")<[Out](Source.html "type parameter in Source")>,​?>> those)` | Attaches the given [`Sink`](Sink.html "class in akka.stream.javadsl")s to this [`Source`](Source.html "class in akka.stream.javadsl"), meaning that elements that passes  through will also be sent to all those [`Sink`](Sink.html "class in akka.stream.javadsl")s. |
	| `<M2,​M3>[Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​M3>` | `[alsoToMat](#alsoToMat(akka.stream.Graph,akka.japi.function.Function2))​([Graph](../Graph.html "interface in akka.stream")<[SinkShape](../SinkShape.html "class in akka.stream")<[Out](Source.html "type parameter in Source")>,​M2> that,  [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<[Mat](Source.html "type parameter in Source"),​M2,​M3> matF)` | Attaches the given [`Sink`](Sink.html "class in akka.stream.javadsl") to this [`Flow`](Flow.html "class in akka.stream.javadsl"), meaning that elements that passes  through will also be sent to the [`Sink`](Sink.html "class in akka.stream.javadsl"). |
	| `<S> [Source](Source.html "class in akka.stream.javadsl")<S,​[Mat](Source.html "type parameter in Source")>` | `[ask](#ask(int,akka.actor.ActorRef,java.lang.Class,akka.util.Timeout))​(int parallelism,  [ActorRef](../../actor/ActorRef.html "class in akka.actor") ref,  java.lang.Class<S> mapTo,  [Timeout](../../util/Timeout.html "class in akka.util") timeout)` | Use the `ask` pattern to send a request\-reply message to the target `ref` actor. |
	| `<S> [Source](Source.html "class in akka.stream.javadsl")<S,​[Mat](Source.html "type parameter in Source")>` | `[ask](#ask(akka.actor.ActorRef,java.lang.Class,akka.util.Timeout))​([ActorRef](../../actor/ActorRef.html "class in akka.actor") ref,  java.lang.Class<S> mapTo,  [Timeout](../../util/Timeout.html "class in akka.util") timeout)` | Use the `ask` pattern to send a request\-reply message to the target `ref` actor. |
	| `[Source](../scaladsl/Source.html "class in akka.stream.scaladsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")>` | `[asScala](#asScala())()` | Converts this Java DSL element to its Scala DSL counterpart. |
	| `<Ctx> [SourceWithContext](SourceWithContext.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​Ctx,​[Mat](Source.html "type parameter in Source")>` | `[asSourceWithContext](#asSourceWithContext(akka.japi.function.Function))​([Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](Source.html "type parameter in Source"),​Ctx> extractContext)` | Transform this source whose element is e into a source producing tuple (e, f(e)) |
	| `static <T> [Source](Source.html "class in akka.stream.javadsl")<T,​org.reactivestreams.Subscriber<T>>` | `[asSubscriber](#asSubscriber())()` | Creates a `Source` that is materialized as a `Subscriber` |
	| `[Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")>` | `[async](#async())()` | Put an asynchronous boundary around this `Source` |
	| `[Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")>` | `[async](#async(java.lang.String))​(java.lang.String dispatcher)` | Put an asynchronous boundary around this `Source` |
	| `[Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")>` | `[async](#async(java.lang.String,int))​(java.lang.String dispatcher,  int inputBufferSize)` | Put an asynchronous boundary around this `Source` |
	| `[Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")>` | `[backpressureTimeout](#backpressureTimeout(java.time.Duration))​(java.time.Duration timeout)` | If the time between the emission of an element and the following downstream demand exceeds the provided timeout,  the stream is failed with a [`BackpressureTimeoutException`](../BackpressureTimeoutException.html "class in akka.stream"). |
	| `<S> [Source](Source.html "class in akka.stream.javadsl")<S,​[Mat](Source.html "type parameter in Source")>` | `[batch](#batch(long,akka.japi.function.Function,akka.japi.function.Function2))​(long max,  [Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](Source.html "type parameter in Source"),​S> seed,  [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<S,​[Out](Source.html "type parameter in Source"),​S> aggregate)` | Allows a faster upstream to progress independently of a slower subscriber by aggregating elements into batches  until the subscriber is ready to accept them. |
	| `<S> [Source](Source.html "class in akka.stream.javadsl")<S,​[Mat](Source.html "type parameter in Source")>` | `[batchWeighted](#batchWeighted(long,akka.japi.function.Function,akka.japi.function.Function,akka.japi.function.Function2))​(long max,  [Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](Source.html "type parameter in Source"),​java.lang.Long> costFn,  [Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](Source.html "type parameter in Source"),​S> seed,  [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<S,​[Out](Source.html "type parameter in Source"),​S> aggregate)` | Allows a faster upstream to progress independently of a slower subscriber by aggregating elements into batches  until the subscriber is ready to accept them. |
	| `[Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")>` | `[buffer](#buffer(int,akka.stream.OverflowStrategy))​(int size,  [OverflowStrategy](../OverflowStrategy.html "class in akka.stream") overflowStrategy)` | Adds a fixed size buffer in the flow that allows to store elements from a faster upstream until it becomes full. |
	| `<T> [Source](Source.html "class in akka.stream.javadsl")<T,​[Mat](Source.html "type parameter in Source")>` | `[collect](#collect(scala.PartialFunction))​(scala.PartialFunction<[Out](Source.html "type parameter in Source"),​T> pf)` | Transform this stream by applying the given partial function to each of the elements  on which the function is defined as they pass through this processing step. |
	| `<T> [Source](Source.html "class in akka.stream.javadsl")<T,​[Mat](Source.html "type parameter in Source")>` | `[collectType](#collectType(java.lang.Class))​(java.lang.Class<T> clazz)` | Transform this stream by testing the type of each of the elements  on which the element is an instance of the provided type as they pass through this processing step. |
	| `static <T,​U>[Source](Source.html "class in akka.stream.javadsl")<U,​[NotUsed](../../NotUsed.html "class in akka")>` | `[combine](#combine(akka.stream.javadsl.Source,akka.stream.javadsl.Source,java.util.List,akka.japi.function.Function))​([Source](Source.html "class in akka.stream.javadsl")<T,​?> first,  [Source](Source.html "class in akka.stream.javadsl")<T,​?> second,  java.util.List<[Source](Source.html "class in akka.stream.javadsl")<T,​?>> rest,  [Function](../../japi/function/Function.html "interface in akka.japi.function")<java.lang.Integer,​? extends [Graph](../Graph.html "interface in akka.stream")<[UniformFanInShape](../UniformFanInShape.html "class in akka.stream")<T,​U>,​[NotUsed](../../NotUsed.html "class in akka")>> fanInStrategy)` | Combines several sources with fan\-in strategy like [`Merge`](Merge.html "class in akka.stream.javadsl") or [`Concat`](Concat.html "class in akka.stream.javadsl") into a single [`Source`](Source.html "class in akka.stream.javadsl"). |
	| `static <T,​U,​M>[Source](Source.html "class in akka.stream.javadsl")<U,​java.util.List<M>>` | `[combine](#combine(java.util.List,akka.japi.function.Function))​(java.util.List<? extends [Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<T>,​M>> sources,  [Function](../../japi/function/Function.html "interface in akka.japi.function")<java.lang.Integer,​[Graph](../Graph.html "interface in akka.stream")<[UniformFanInShape](../UniformFanInShape.html "class in akka.stream")<T,​U>,​[NotUsed](../../NotUsed.html "class in akka")>> fanInStrategy)` | Combines several sources with fan\-in strategy like [`Merge`](Merge.html "class in akka.stream.javadsl") or [`Concat`](Concat.html "class in akka.stream.javadsl") into a single [`Source`](Source.html "class in akka.stream.javadsl"). |
	| `static <T,​U,​M1,​M2,​M>[Source](Source.html "class in akka.stream.javadsl")<U,​M>` | `[combineMat](#combineMat(akka.stream.javadsl.Source,akka.stream.javadsl.Source,akka.japi.function.Function,akka.japi.function.Function2))​([Source](Source.html "class in akka.stream.javadsl")<T,​M1> first,  [Source](Source.html "class in akka.stream.javadsl")<T,​M2> second,  [Function](../../japi/function/Function.html "interface in akka.japi.function")<java.lang.Integer,​? extends [Graph](../Graph.html "interface in akka.stream")<[UniformFanInShape](../UniformFanInShape.html "class in akka.stream")<T,​U>,​[NotUsed](../../NotUsed.html "class in akka")>> fanInStrategy,  [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<M1,​M2,​M> matF)` | Combines two sources with fan\-in strategy like `Merge` or `Concat` and returns `Source` with a materialized value. |
	| `static <T> [Source](Source.html "class in akka.stream.javadsl")<T,​[NotUsed](../../NotUsed.html "class in akka")>` | `[completionStage](#completionStage(java.util.concurrent.CompletionStage))​(java.util.concurrent.CompletionStage<T> completionStage)` | Emits a single value when the given `CompletionStage` is successfully completed and then completes the stream. |
	| `static <T,​M>[Source](Source.html "class in akka.stream.javadsl")<T,​java.util.concurrent.CompletionStage<M>>` | `[completionStageSource](#completionStageSource(java.util.concurrent.CompletionStage))​(java.util.concurrent.CompletionStage<[Source](Source.html "class in akka.stream.javadsl")<T,​M>> completionStageSource)` | Turn a `CompletionStage[Source]` into a source that will emit the values of the source when the future completes successfully. |
	| `[Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")>` | `[completionTimeout](#completionTimeout(java.time.Duration))​(java.time.Duration timeout)` | If the completion of the stream does not happen until the provided timeout, the stream is failed  with a [`CompletionTimeoutException`](../CompletionTimeoutException.html "class in akka.stream"). |
	| `<M> [Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")>` | `[concat](#concat(akka.stream.Graph))​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<[Out](Source.html "type parameter in Source")>,​M> that)` | Concatenate this [`Source`](Source.html "class in akka.stream.javadsl") with the given one, meaning that once current  is exhausted and all result elements have been generated,  the given source elements will be produced. |
	| `[Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")>` | `[concatAllLazy](#concatAllLazy(akka.stream.Graph...))​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<[Out](Source.html "type parameter in Source")>,​?>... those)` | Concatenate the given [`Source`](Source.html "class in akka.stream.javadsl")s to this one, meaning that once this  Flow\&rsquo;s input is exhausted and all result elements have been generated,  the Source\&rsquo;s elements will be produced. |
	| `[Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")>` | `[concatAllLazy](#concatAllLazy(scala.collection.immutable.Seq))​(scala.collection.immutable.Seq<[Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<[Out](Source.html "type parameter in Source")>,​?>> those)` | Concatenate the given [`Source`](Source.html "class in akka.stream.javadsl")s to this one, meaning that once this  Flow\&rsquo;s input is exhausted and all result elements have been generated,  the Source\&rsquo;s elements will be produced. |
	| `<M> [Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")>` | `[concatLazy](#concatLazy(akka.stream.Graph))​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<[Out](Source.html "type parameter in Source")>,​M> that)` | Concatenate the given [`Source`](Source.html "class in akka.stream.javadsl") to this [`Flow`](Flow.html "class in akka.stream.javadsl"), meaning that once this  Flow\&rsquo;s input is exhausted and all result elements have been generated,  the Source\&rsquo;s elements will be produced. |
	| `<M,​M2>[Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​M2>` | `[concatLazyMat](#concatLazyMat(akka.stream.Graph,akka.japi.function.Function2))​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<[Out](Source.html "type parameter in Source")>,​M> that,  [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<[Mat](Source.html "type parameter in Source"),​M,​M2> matF)` | Concatenate the given [`Source`](Source.html "class in akka.stream.javadsl") to this [`Flow`](Flow.html "class in akka.stream.javadsl"), meaning that once this  Flow\&rsquo;s input is exhausted and all result elements have been generated,  the Source\&rsquo;s elements will be produced. |
	| `<M,​M2>[Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​M2>` | `[concatMat](#concatMat(akka.stream.Graph,akka.japi.function.Function2))​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<[Out](Source.html "type parameter in Source")>,​M> that,  [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<[Mat](Source.html "type parameter in Source"),​M,​M2> matF)` | Concatenate this [`Source`](Source.html "class in akka.stream.javadsl") with the given one, meaning that once current  is exhausted and all result elements have been generated,  the given source elements will be produced. |
	| `[Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")>` | `[conflate](#conflate(akka.japi.function.Function2))​([Function2](../../japi/function/Function2.html "interface in akka.japi.function")<[Out](Source.html "type parameter in Source"),​[Out](Source.html "type parameter in Source"),​[Out](Source.html "type parameter in Source")> aggregate)` | Allows a faster upstream to progress independently of a slower subscriber by conflating elements into a summary  until the subscriber is ready to accept them. |
	| `<S> [Source](Source.html "class in akka.stream.javadsl")<S,​[Mat](Source.html "type parameter in Source")>` | `[conflateWithSeed](#conflateWithSeed(akka.japi.function.Function,akka.japi.function.Function2))​([Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](Source.html "type parameter in Source"),​S> seed,  [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<S,​[Out](Source.html "type parameter in Source"),​S> aggregate)` | Allows a faster upstream to progress independently of a slower subscriber by conflating elements into a summary  until the subscriber is ready to accept them. |
	| `static <O> [Source](Source.html "class in akka.stream.javadsl")<O,​[NotUsed](../../NotUsed.html "class in akka")>` | `[cycle](#cycle(akka.japi.function.Creator))​([Creator](../../japi/function/Creator.html "interface in akka.japi.function")<java.util.Iterator<O>> f)` | Helper to create a 'cycled' [`Source`](Source.html "class in akka.stream.javadsl") that will continually produce elements in the order  they are provided. |
	| `[Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")>` | `[delay](#delay(java.time.Duration,akka.stream.DelayOverflowStrategy))​(java.time.Duration of,  [DelayOverflowStrategy](../DelayOverflowStrategy.html "class in akka.stream") strategy)` | Shifts elements emission in time by a specified amount. |
	| `[Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")>` | `[delayWith](#delayWith(java.util.function.Supplier,akka.stream.DelayOverflowStrategy))​(java.util.function.Supplier<[DelayStrategy](DelayStrategy.html "interface in akka.stream.javadsl")<[Out](Source.html "type parameter in Source")>> delayStrategySupplier,  [DelayOverflowStrategy](../DelayOverflowStrategy.html "class in akka.stream") overFlowStrategy)` | Shifts elements emission in time by an amount individually determined through delay strategy a specified amount. |
	| `[Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")>` | `[detach](#detach())()` | Detaches upstream demand from downstream demand without detaching the  stream rates; in other words acts like a buffer of size 1\. |
	| `[Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")>` | `[divertTo](#divertTo(akka.stream.Graph,akka.japi.function.Predicate))​([Graph](../Graph.html "interface in akka.stream")<[SinkShape](../SinkShape.html "class in akka.stream")<[Out](Source.html "type parameter in Source")>,​?> that,  [Predicate](../../japi/function/Predicate.html "interface in akka.japi.function")<[Out](Source.html "type parameter in Source")> when)` | Attaches the given [`Sink`](Sink.html "class in akka.stream.javadsl") to this [`Flow`](Flow.html "class in akka.stream.javadsl"), meaning that elements will be sent to the [`Sink`](Sink.html "class in akka.stream.javadsl")  instead of being passed through if the predicate `when` returns `true`. |
	| `<M2,​M3>[Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​M3>` | `[divertToMat](#divertToMat(akka.stream.Graph,akka.japi.function.Predicate,akka.japi.function.Function2))​([Graph](../Graph.html "interface in akka.stream")<[SinkShape](../SinkShape.html "class in akka.stream")<[Out](Source.html "type parameter in Source")>,​M2> that,  [Predicate](../../japi/function/Predicate.html "interface in akka.japi.function")<[Out](Source.html "type parameter in Source")> when,  [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<[Mat](Source.html "type parameter in Source"),​M2,​M3> matF)` | Attaches the given [`Sink`](Sink.html "class in akka.stream.javadsl") to this [`Flow`](Flow.html "class in akka.stream.javadsl"), meaning that elements will be sent to the [`Sink`](Sink.html "class in akka.stream.javadsl")  instead of being passed through if the predicate `when` returns `true`. |
	| `[Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")>` | `[drop](#drop(long))​(long n)` | Discard the given number of elements at the beginning of the stream. |
	| `[Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")>` | `[dropWhile](#dropWhile(akka.japi.function.Predicate))​([Predicate](../../japi/function/Predicate.html "interface in akka.japi.function")<[Out](Source.html "type parameter in Source")> p)` | Discard elements at the beginning of the stream while predicate is true. |
	| `[Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")>` | `[dropWithin](#dropWithin(java.time.Duration))​(java.time.Duration duration)` | Discard the elements received within the given duration at beginning of the stream. |
	| `static <O> [Source](Source.html "class in akka.stream.javadsl")<O,​[NotUsed](../../NotUsed.html "class in akka")>` | `[empty](#empty())()` | Create a `Source` with no elements, i.e. |
	| `static <T> [Source](Source.html "class in akka.stream.javadsl")<T,​[NotUsed](../../NotUsed.html "class in akka")>` | `[empty](#empty(java.lang.Class))​(java.lang.Class<T> clazz)` | Create a `Source` with no elements. |
	| `<U> [Source](Source.html "class in akka.stream.javadsl")<U,​[Mat](Source.html "type parameter in Source")>` | `[expand](#expand(akka.japi.function.Function))​([Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](Source.html "type parameter in Source"),​java.util.Iterator<U>> expander)` | Allows a faster downstream to progress independently of a slower publisher by extrapolating elements from an older  element until new element comes from the upstream. |
	| `[Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")>` | `[extrapolate](#extrapolate(akka.japi.function.Function))​([Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](Source.html "type parameter in Source"),​java.util.Iterator<[Out](Source.html "type parameter in Source")>> extrapolator)` | Allows a faster downstream to progress independent of a slower upstream. |
	| `[Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")>` | `[extrapolate](#extrapolate(akka.japi.function.Function,Out))​([Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](Source.html "type parameter in Source"),​java.util.Iterator<[Out](Source.html "type parameter in Source")>> extrapolator,  [Out](Source.html "type parameter in Source") initial)` | Allows a faster downstream to progress independent of a slower upstream. |
	| `static <T> [Source](Source.html "class in akka.stream.javadsl")<T,​[NotUsed](../../NotUsed.html "class in akka")>` | `[failed](#failed(java.lang.Throwable))​(java.lang.Throwable cause)` | Create a `Source` that immediately ends the stream with the `cause` failure to every connected `Sink`. |
	| `[Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")>` | `[filter](#filter(akka.japi.function.Predicate))​([Predicate](../../japi/function/Predicate.html "interface in akka.japi.function")<[Out](Source.html "type parameter in Source")> p)` | Only pass on those elements that satisfy the given predicate. |
	| `[Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")>` | `[filterNot](#filterNot(akka.japi.function.Predicate))​([Predicate](../../japi/function/Predicate.html "interface in akka.japi.function")<[Out](Source.html "type parameter in Source")> p)` | Only pass on those elements that NOT satisfy the given predicate. |
	| `<T,​M>[Source](Source.html "class in akka.stream.javadsl")<T,​[Mat](Source.html "type parameter in Source")>` | `[flatMapConcat](#flatMapConcat(akka.japi.function.Function))​([Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](Source.html "type parameter in Source"),​? extends [Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<T>,​M>> f)` | Transform each input element into a `Source` of output elements that is  then flattened into the output stream by concatenation,  fully consuming one Source after the other. |
	| `<T,​M>[Source](Source.html "class in akka.stream.javadsl")<T,​[Mat](Source.html "type parameter in Source")>` | `[flatMapMerge](#flatMapMerge(int,akka.japi.function.Function))​(int breadth,  [Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](Source.html "type parameter in Source"),​? extends [Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<T>,​M>> f)` | Transform each input element into a `Source` of output elements that is  then flattened into the output stream by merging, where at most `breadth`  substreams are being consumed at any given time. |
	| `<Out2,​Mat2>[Source](Source.html "class in akka.stream.javadsl")<Out2,​[Mat](Source.html "type parameter in Source")>` | `[flatMapPrefix](#flatMapPrefix(int,akka.japi.function.Function))​(int n,  [Function](../../japi/function/Function.html "interface in akka.japi.function")<java.lang.Iterable<[Out](Source.html "type parameter in Source")>,​[Flow](Flow.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​Out2,​Mat2>> f)` | Takes up to `n` elements from the stream (less than `n` only if the upstream completes before emitting `n` elements),  then apply `f` on these elements in order to obtain a flow, this flow is then materialized and the rest of the input is processed by this flow (similar to via). |
	| `<Out2,​Mat2,​Mat3>[Source](Source.html "class in akka.stream.javadsl")<Out2,​Mat3>` | `[flatMapPrefixMat](#flatMapPrefixMat(int,akka.japi.function.Function,akka.japi.function.Function2))​(int n,  [Function](../../japi/function/Function.html "interface in akka.japi.function")<java.lang.Iterable<[Out](Source.html "type parameter in Source")>,​[Flow](Flow.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​Out2,​Mat2>> f,  [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<[Mat](Source.html "type parameter in Source"),​java.util.concurrent.CompletionStage<Mat2>,​Mat3> matF)` | mat version of [`flatMapPrefix(int, akka.japi.function.Function<java.lang.Iterable<Out>, akka.stream.javadsl.Flow<Out, Out2, Mat2>>)`](#flatMapPrefix(int,akka.japi.function.Function)), this method gives access to a future materialized value of the downstream flow (as a completion stage). |
	| `<T> [Source](Source.html "class in akka.stream.javadsl")<T,​[Mat](Source.html "type parameter in Source")>` | `[fold](#fold(T,akka.japi.function.Function2))​(T zero,  [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<T,​[Out](Source.html "type parameter in Source"),​T> f)` | Similar to `scan` but only emits its result when the upstream completes,  after which it also completes. |
	| `<T> [Source](Source.html "class in akka.stream.javadsl")<T,​[Mat](Source.html "type parameter in Source")>` | `[foldAsync](#foldAsync(T,akka.japi.function.Function2))​(T zero,  [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<T,​[Out](Source.html "type parameter in Source"),​java.util.concurrent.CompletionStage<T>> f)` | Similar to `fold` but with an asynchronous function. |
	| `static <O> [Source](Source.html "class in akka.stream.javadsl")<O,​[NotUsed](../../NotUsed.html "class in akka")>` | `[from](#from(java.lang.Iterable))​(java.lang.Iterable<O> iterable)` | Helper to create [`Source`](Source.html "class in akka.stream.javadsl") from `Iterable`. |
	| `static <O> [Source](Source.html "class in akka.stream.javadsl")<O,​[NotUsed](../../NotUsed.html "class in akka")>` | `[fromCompletionStage](#fromCompletionStage(java.util.concurrent.CompletionStage))​(java.util.concurrent.CompletionStage<O> future)` | Deprecated. Use 'Source.completionStage' instead. |
	| `static <O> [Source](Source.html "class in akka.stream.javadsl")<O,​[NotUsed](../../NotUsed.html "class in akka")>` | `[fromFuture](#fromFuture(scala.concurrent.Future))​(scala.concurrent.Future<O> future)` | Deprecated. Use 'Source.future' instead. |
	| `static <T,​M>[Source](Source.html "class in akka.stream.javadsl")<T,​scala.concurrent.Future<M>>` | `[fromFutureSource](#fromFutureSource(scala.concurrent.Future))​(scala.concurrent.Future<? extends [Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<T>,​M>> future)` | Deprecated. Use 'Source.futureSource' (potentially together with \`Source.fromGraph\`) instead. |
	| `static <T,​M>[Source](Source.html "class in akka.stream.javadsl")<T,​M>` | `[fromGraph](#fromGraph(akka.stream.Graph))​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<T>,​M> g)` | A graph with the shape of a source logically is a source, this method makes  it so also in type. |
	| `static <O> [Source](Source.html "class in akka.stream.javadsl")<O,​[NotUsed](../../NotUsed.html "class in akka")>` | `[fromIterator](#fromIterator(akka.japi.function.Creator))​([Creator](../../japi/function/Creator.html "interface in akka.japi.function")<java.util.Iterator<O>> f)` | Helper to create a [`Source`](Source.html "class in akka.stream.javadsl") from an `Iterator`. |
	| `static <O,​S extends java.util.stream.BaseStream<O,​S>>[Source](Source.html "class in akka.stream.javadsl")<O,​[NotUsed](../../NotUsed.html "class in akka")>` | `[fromJavaStream](#fromJavaStream(akka.japi.function.Creator))​([Creator](../../japi/function/Creator.html "interface in akka.japi.function")<java.util.stream.BaseStream<O,​S>> stream)` | Creates a source that wraps a Java 8 Stream. |
	| `static <T,​M>[Source](Source.html "class in akka.stream.javadsl")<T,​java.util.concurrent.CompletionStage<M>>` | `[fromMaterializer](#fromMaterializer(java.util.function.BiFunction))​(java.util.function.BiFunction<[Materializer](../Materializer.html "class in akka.stream"),​[Attributes](../Attributes.html "class in akka.stream"),​[Source](Source.html "class in akka.stream.javadsl")<T,​M>> factory)` | Defers the creation of a [`Source`](Source.html "class in akka.stream.javadsl") until materialization. |
	| `static <O> [Source](Source.html "class in akka.stream.javadsl")<O,​[NotUsed](../../NotUsed.html "class in akka")>` | `[fromPublisher](#fromPublisher(org.reactivestreams.Publisher))​(org.reactivestreams.Publisher<O> publisher)` | Helper to create [`Source`](Source.html "class in akka.stream.javadsl") from `Publisher`. |
	| `static <T,​M>[Source](Source.html "class in akka.stream.javadsl")<T,​java.util.concurrent.CompletionStage<M>>` | `[fromSourceCompletionStage](#fromSourceCompletionStage(java.util.concurrent.CompletionStage))​(java.util.concurrent.CompletionStage<? extends [Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<T>,​M>> completion)` | Deprecated. Use 'Source.completionStageSource' (potentially together with \`Source.fromGraph\`) instead. |
	| `static <T> [Source](Source.html "class in akka.stream.javadsl")<T,​[NotUsed](../../NotUsed.html "class in akka")>` | `[future](#future(scala.concurrent.Future))​(scala.concurrent.Future<T> futureElement)` | Emits a single value when the given Scala `Future` is successfully completed and then completes the stream. |
	| `[Attributes](../Attributes.html "class in akka.stream")` | `[getAttributes](#getAttributes())()` |  |
	| `<K> [SubSource](SubSource.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")>` | `[groupBy](#groupBy(int,akka.japi.function.Function))​(int maxSubstreams,  [Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](Source.html "type parameter in Source"),​K> f)` | This operation demultiplexes the incoming stream into separate output  streams, one for each element key. |
	| `<K> [SubSource](SubSource.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")>` | `[groupBy](#groupBy(int,akka.japi.function.Function,boolean))​(int maxSubstreams,  [Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](Source.html "type parameter in Source"),​K> f,  boolean allowClosedSubstreamRecreation)` | This operation demultiplexes the incoming stream into separate output  streams, one for each element key. |
	| `[Source](Source.html "class in akka.stream.javadsl")<java.util.List<[Out](Source.html "type parameter in Source")>,​[Mat](Source.html "type parameter in Source")>` | `[grouped](#grouped(int))​(int n)` | Chunk up this stream into groups of the given size, with the last group  possibly smaller than requested due to end\-of\-stream. |
	| `[Source](Source.html "class in akka.stream.javadsl")<java.util.List<[Out](Source.html "type parameter in Source")>,​[Mat](Source.html "type parameter in Source")>` | `[groupedWeighted](#groupedWeighted(long,java.util.function.Function))​(long minWeight,  java.util.function.Function<[Out](Source.html "type parameter in Source"),​java.lang.Long> costFn)` | Chunk up this stream into groups of elements that have a cumulative weight greater than or equal to  the `minWeight`, with the last group possibly smaller than requested `minWeight` due to end\-of\-stream. |
	| `[Source](Source.html "class in akka.stream.javadsl")<java.util.List<[Out](Source.html "type parameter in Source")>,​[Mat](Source.html "type parameter in Source")>` | `[groupedWeightedWithin](#groupedWeightedWithin(long,int,akka.japi.function.Function,java.time.Duration))​(long maxWeight,  int maxNumber,  [Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](Source.html "type parameter in Source"),​java.lang.Long> costFn,  java.time.Duration duration)` | Chunk up this stream into groups of elements received within a time window,  or limited by the weight and number of the elements, whatever happens first. |
	| `[Source](Source.html "class in akka.stream.javadsl")<java.util.List<[Out](Source.html "type parameter in Source")>,​[Mat](Source.html "type parameter in Source")>` | `[groupedWeightedWithin](#groupedWeightedWithin(long,akka.japi.function.Function,java.time.Duration))​(long maxWeight,  [Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](Source.html "type parameter in Source"),​java.lang.Long> costFn,  java.time.Duration duration)` | Chunk up this stream into groups of elements received within a time window,  or limited by the weight of the elements, whatever happens first. |
	| `[Source](Source.html "class in akka.stream.javadsl")<java.util.List<[Out](Source.html "type parameter in Source")>,​[Mat](Source.html "type parameter in Source")>` | `[groupedWithin](#groupedWithin(int,java.time.Duration))​(int maxNumber,  java.time.Duration duration)` | Chunk up this stream into groups of elements received within a time window,  or limited by the given number of elements, whatever happens first. |
	| `[Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")>` | `[idleTimeout](#idleTimeout(java.time.Duration))​(java.time.Duration timeout)` | If the time between two processed elements exceeds the provided timeout, the stream is failed  with a [`StreamIdleTimeoutException`](../StreamIdleTimeoutException.html "class in akka.stream"). |
	| `[Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")>` | `[initialDelay](#initialDelay(java.time.Duration))​(java.time.Duration delay)` | Delays the initial element by the specified duration. |
	| `[Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")>` | `[initialTimeout](#initialTimeout(java.time.Duration))​(java.time.Duration timeout)` | If the first element has not passed through this operator before the provided timeout, the stream is failed  with a [`InitialTimeoutException`](../InitialTimeoutException.html "class in akka.stream"). |
	| `[Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")>` | `[interleave](#interleave(akka.stream.Graph,int))​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<[Out](Source.html "type parameter in Source")>,​?> that,  int segmentSize)` | Interleave is a deterministic merge of the given [`Source`](Source.html "class in akka.stream.javadsl") with elements of this [`Source`](Source.html "class in akka.stream.javadsl"). |
	| `[Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")>` | `[interleave](#interleave(akka.stream.Graph,int,boolean))​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<[Out](Source.html "type parameter in Source")>,​?> that,  int segmentSize,  boolean eagerClose)` | Interleave is a deterministic merge of the given [`Source`](Source.html "class in akka.stream.javadsl") with elements of this [`Flow`](Flow.html "class in akka.stream.javadsl"). |
	| `[Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")>` | `[interleaveAll](#interleaveAll(java.util.List,int,boolean))​(java.util.List<? extends [Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<[Out](Source.html "type parameter in Source")>,​?>> those,  int segmentSize,  boolean eagerClose)` | Interleave is a deterministic merge of the given [`Source`](Source.html "class in akka.stream.javadsl") with elements of this [`Flow`](Flow.html "class in akka.stream.javadsl"). |
	| `<M,​M2>[Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​M2>` | `[interleaveMat](#interleaveMat(akka.stream.Graph,int,boolean,akka.japi.function.Function2))​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<[Out](Source.html "type parameter in Source")>,​M> that,  int segmentSize,  boolean eagerClose,  [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<[Mat](Source.html "type parameter in Source"),​M,​M2> matF)` | Interleave is a deterministic merge of the given [`Source`](Source.html "class in akka.stream.javadsl") with elements of this [`Source`](Source.html "class in akka.stream.javadsl"). |
	| `<M,​M2>[Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​M2>` | `[interleaveMat](#interleaveMat(akka.stream.Graph,int,akka.japi.function.Function2))​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<[Out](Source.html "type parameter in Source")>,​M> that,  int segmentSize,  [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<[Mat](Source.html "type parameter in Source"),​M,​M2> matF)` | Interleave is a deterministic merge of the given [`Source`](Source.html "class in akka.stream.javadsl") with elements of this [`Source`](Source.html "class in akka.stream.javadsl"). |
	| `[Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")>` | `[intersperse](#intersperse(Out))​([Out](Source.html "type parameter in Source") inject)` | Intersperses stream with provided element, similar to how `scala.collection.immutable.List.mkString`  injects a separator between a List's elements. |
	| `[Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")>` | `[intersperse](#intersperse(Out,Out,Out))​([Out](Source.html "type parameter in Source") start,  [Out](Source.html "type parameter in Source") inject,  [Out](Source.html "type parameter in Source") end)` | Intersperses stream with provided element, similar to how `scala.collection.immutable.List.mkString`  injects a separator between a List's elements. |
	| `[Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")>` | `[keepAlive](#keepAlive(java.time.Duration,akka.japi.function.Creator))​(java.time.Duration maxIdle,  [Creator](../../japi/function/Creator.html "interface in akka.japi.function")<[Out](Source.html "type parameter in Source")> injectedElem)` | Injects additional elements if upstream does not emit for a configured amount of time. |
	| `static <T,​M>[Source](Source.html "class in akka.stream.javadsl")<T,​java.util.concurrent.CompletionStage<M>>` | `[lazily](#lazily(akka.japi.function.Creator))​([Creator](../../japi/function/Creator.html "interface in akka.japi.function")<[Source](Source.html "class in akka.stream.javadsl")<T,​M>> create)` | Deprecated. Use 'Source.lazySource' instead. |
	| `static <T> [Source](Source.html "class in akka.stream.javadsl")<T,​scala.concurrent.Future<[NotUsed](../../NotUsed.html "class in akka")>>` | `[lazilyAsync](#lazilyAsync(akka.japi.function.Creator))​([Creator](../../japi/function/Creator.html "interface in akka.japi.function")<java.util.concurrent.CompletionStage<T>> create)` | Deprecated. Use 'Source.lazyCompletionStage' instead. |
	| `static <T> [Source](Source.html "class in akka.stream.javadsl")<T,​[NotUsed](../../NotUsed.html "class in akka")>` | `[lazyCompletionStage](#lazyCompletionStage(akka.japi.function.Creator))​([Creator](../../japi/function/Creator.html "interface in akka.japi.function")<java.util.concurrent.CompletionStage<T>> create)` | Defers invoking the `create` function to create a future element until there is downstream demand. |
	| `static <T,​M>[Source](Source.html "class in akka.stream.javadsl")<T,​java.util.concurrent.CompletionStage<M>>` | `[lazyCompletionStageSource](#lazyCompletionStageSource(akka.japi.function.Creator))​([Creator](../../japi/function/Creator.html "interface in akka.japi.function")<java.util.concurrent.CompletionStage<[Source](Source.html "class in akka.stream.javadsl")<T,​M>>> create)` | Defers invoking the `create` function to create a future source until there is downstream demand. |
	| `static <T> [Source](Source.html "class in akka.stream.javadsl")<T,​[NotUsed](../../NotUsed.html "class in akka")>` | `[lazySingle](#lazySingle(akka.japi.function.Creator))​([Creator](../../japi/function/Creator.html "interface in akka.japi.function")<T> create)` | Defers invoking the `create` function to create a single element until there is downstream demand. |
	| `static <T,​M>[Source](Source.html "class in akka.stream.javadsl")<T,​java.util.concurrent.CompletionStage<M>>` | `[lazySource](#lazySource(akka.japi.function.Creator))​([Creator](../../japi/function/Creator.html "interface in akka.japi.function")<[Source](Source.html "class in akka.stream.javadsl")<T,​M>> create)` | Defers invoking the `create` function to create a future source until there is downstream demand. |
	| `[Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")>` | `[limit](#limit(int))​(int n)` | Ensure stream boundedness by limiting the number of elements from upstream. |
	| `[Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")>` | `[limitWeighted](#limitWeighted(long,akka.japi.function.Function))​(long n,  [Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](Source.html "type parameter in Source"),​java.lang.Long> costFn)` | Ensure stream boundedness by evaluating the cost of incoming elements  using a cost function. |
	| `[Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")>` | `[log](#log(java.lang.String))​(java.lang.String name)` | Logs elements flowing through the stream as well as completion and erroring. |
	| `[Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")>` | `[log](#log(java.lang.String,akka.event.LoggingAdapter))​(java.lang.String name,  [LoggingAdapter](../../event/LoggingAdapter.html "interface in akka.event") log)` | Logs elements flowing through the stream as well as completion and erroring. |
	| `[Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")>` | `[log](#log(java.lang.String,akka.japi.function.Function))​(java.lang.String name,  [Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](Source.html "type parameter in Source"),​java.lang.Object> extract)` | Logs elements flowing through the stream as well as completion and erroring. |
	| `[Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")>` | `[log](#log(java.lang.String,akka.japi.function.Function,akka.event.LoggingAdapter))​(java.lang.String name,  [Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](Source.html "type parameter in Source"),​java.lang.Object> extract,  [LoggingAdapter](../../event/LoggingAdapter.html "interface in akka.event") log)` | Logs elements flowing through the stream as well as completion and erroring. |
	| `[Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")>` | `[logWithMarker](#logWithMarker(java.lang.String,akka.japi.function.Function))​(java.lang.String name,  [Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](Source.html "type parameter in Source"),​[LogMarker](../../event/LogMarker.html "class in akka.event")> marker)` | Logs elements flowing through the stream as well as completion and erroring. |
	| `[Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")>` | `[logWithMarker](#logWithMarker(java.lang.String,akka.japi.function.Function,akka.event.MarkerLoggingAdapter))​(java.lang.String name,  [Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](Source.html "type parameter in Source"),​[LogMarker](../../event/LogMarker.html "class in akka.event")> marker,  [MarkerLoggingAdapter](../../event/MarkerLoggingAdapter.html "class in akka.event") log)` | Logs elements flowing through the stream as well as completion and erroring. |
	| `[Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")>` | `[logWithMarker](#logWithMarker(java.lang.String,akka.japi.function.Function,akka.japi.function.Function))​(java.lang.String name,  [Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](Source.html "type parameter in Source"),​[LogMarker](../../event/LogMarker.html "class in akka.event")> marker,  [Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](Source.html "type parameter in Source"),​java.lang.Object> extract)` | Logs elements flowing through the stream as well as completion and erroring. |
	| `[Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")>` | `[logWithMarker](#logWithMarker(java.lang.String,akka.japi.function.Function,akka.japi.function.Function,akka.event.MarkerLoggingAdapter))​(java.lang.String name,  [Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](Source.html "type parameter in Source"),​[LogMarker](../../event/LogMarker.html "class in akka.event")> marker,  [Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](Source.html "type parameter in Source"),​java.lang.Object> extract,  [MarkerLoggingAdapter](../../event/MarkerLoggingAdapter.html "class in akka.event") log)` | Logs elements flowing through the stream as well as completion and erroring. |
	| `<T> [Source](Source.html "class in akka.stream.javadsl")<T,​[Mat](Source.html "type parameter in Source")>` | `[map](#map(akka.japi.function.Function))​([Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](Source.html "type parameter in Source"),​T> f)` | Transform this stream by applying the given function to each of the elements  as they pass through this processing step. |
	| `<T> [Source](Source.html "class in akka.stream.javadsl")<T,​[Mat](Source.html "type parameter in Source")>` | `[mapAsync](#mapAsync(int,akka.japi.function.Function))​(int parallelism,  [Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](Source.html "type parameter in Source"),​java.util.concurrent.CompletionStage<T>> f)` | Transform this stream by applying the given function to each of the elements  as they pass through this processing step. |
	| `<T,​P>[Source](Source.html "class in akka.stream.javadsl")<T,​[Mat](Source.html "type parameter in Source")>` | `[mapAsyncPartitioned](#mapAsyncPartitioned(int,int,akka.japi.function.Function,java.util.function.BiFunction))​(int parallelism,  int perPartition,  [Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](Source.html "type parameter in Source"),​P> partitioner,  java.util.function.BiFunction<[Out](Source.html "type parameter in Source"),​P,​java.util.concurrent.CompletionStage<T>> f)` |  |
	| `<T> [Source](Source.html "class in akka.stream.javadsl")<T,​[Mat](Source.html "type parameter in Source")>` | `[mapAsyncUnordered](#mapAsyncUnordered(int,akka.japi.function.Function))​(int parallelism,  [Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](Source.html "type parameter in Source"),​java.util.concurrent.CompletionStage<T>> f)` | Transform this stream by applying the given function to each of the elements  as they pass through this processing step. |
	| `<T> [Source](Source.html "class in akka.stream.javadsl")<T,​[Mat](Source.html "type parameter in Source")>` | `[mapConcat](#mapConcat(akka.japi.function.Function))​([Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](Source.html "type parameter in Source"),​? extends java.lang.Iterable<T>> f)` | Transform each input element into an `Iterable` of output elements that is  then flattened into the output stream. |
	| `<E extends java.lang.Throwable>[Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")>` | `[mapError](#mapError(java.lang.Class,akka.japi.function.Function))​(java.lang.Class<E> clazz,  [Function](../../japi/function/Function.html "interface in akka.japi.function")<E,​java.lang.Throwable> f)` | While similar to [`recover(scala.PartialFunction<java.lang.Throwable,Out>)`](#recover(scala.PartialFunction)) this operator can be used to transform an error signal to a different one \*without\* logging  it as an error in the process. |
	| `[Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")>` | `[mapError](#mapError(scala.PartialFunction))​(scala.PartialFunction<java.lang.Throwable,​java.lang.Throwable> pf)` | While similar to [`recover(scala.PartialFunction<java.lang.Throwable,Out>)`](#recover(scala.PartialFunction)) this operator can be used to transform an error signal to a different one \*without\* logging  it as an error in the process. |
	| `<Mat2> [Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​Mat2>` | `[mapMaterializedValue](#mapMaterializedValue(akka.japi.function.Function))​([Function](../../japi/function/Function.html "interface in akka.japi.function")<[Mat](Source.html "type parameter in Source"),​Mat2> f)` | Transform only the materialized value of this Source, leaving all other properties as they were. |
	| `<R,​T>[Source](Source.html "class in akka.stream.javadsl")<T,​[Mat](Source.html "type parameter in Source")>` | `[mapWithResource](#mapWithResource(java.util.function.Supplier,java.util.function.BiFunction,java.util.function.Function))​(java.util.function.Supplier<R> create,  java.util.function.BiFunction<R,​[Out](Source.html "type parameter in Source"),​T> f,  java.util.function.Function<R,​java.util.Optional<T>> close)` | Transform each stream element with the help of a resource. |
	| `static <T> [Source](Source.html "class in akka.stream.javadsl")<T,​java.util.concurrent.CompletableFuture<java.util.Optional<T>>>` | `[maybe](#maybe())()` | Create a `Source` which materializes a `CompletableFuture` which controls what element  will be emitted by the Source. |
	| `[Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")>` | `[merge](#merge(akka.stream.Graph))​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<[Out](Source.html "type parameter in Source")>,​?> that)` | Merge the given [`Source`](Source.html "class in akka.stream.javadsl") to the current one, taking elements as they arrive from input streams,  picking randomly when several elements ready. |
	| `[Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")>` | `[merge](#merge(akka.stream.Graph,boolean))​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<[Out](Source.html "type parameter in Source")>,​?> that,  boolean eagerComplete)` | Merge the given [`Source`](Source.html "class in akka.stream.javadsl") to the current one, taking elements as they arrive from input streams,  picking randomly when several elements ready. |
	| `[Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")>` | `[mergeAll](#mergeAll(java.util.List,boolean))​(java.util.List<? extends [Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<[Out](Source.html "type parameter in Source")>,​?>> those,  boolean eagerComplete)` | Merge the given [`Source`](Source.html "class in akka.stream.javadsl")s to the current one, taking elements as they arrive from input streams,  picking randomly when several elements ready. |
	| `<M> [Source](Source.html "class in akka.stream.javadsl")<java.util.List<[Out](Source.html "type parameter in Source")>,​[Mat](Source.html "type parameter in Source")>` | `[mergeLatest](#mergeLatest(akka.stream.Graph,boolean))​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<[Out](Source.html "type parameter in Source")>,​M> that,  boolean eagerComplete)` | MergeLatest joins elements from N input streams into stream of lists of size N. |
	| `<Mat2,​Mat3>[Source](Source.html "class in akka.stream.javadsl")<java.util.List<[Out](Source.html "type parameter in Source")>,​Mat3>` | `[mergeLatestMat](#mergeLatestMat(akka.stream.Graph,boolean,akka.japi.function.Function2))​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<[Out](Source.html "type parameter in Source")>,​Mat2> that,  boolean eagerComplete,  [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<[Mat](Source.html "type parameter in Source"),​Mat2,​Mat3> matF)` | MergeLatest joins elements from N input streams into stream of lists of size N. |
	| `<M,​M2>[Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​M2>` | `[mergeMat](#mergeMat(akka.stream.Graph,akka.japi.function.Function2))​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<[Out](Source.html "type parameter in Source")>,​M> that,  [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<[Mat](Source.html "type parameter in Source"),​M,​M2> matF)` | Merge the given [`Source`](Source.html "class in akka.stream.javadsl") to the current one, taking elements as they arrive from input streams,  picking randomly when several elements ready. |
	| `<M,​M2>[Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​M2>` | `[mergeMat](#mergeMat(akka.stream.Graph,akka.japi.function.Function2,boolean))​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<[Out](Source.html "type parameter in Source")>,​M> that,  [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<[Mat](Source.html "type parameter in Source"),​M,​M2> matF,  boolean eagerComplete)` | Merge the given [`Source`](Source.html "class in akka.stream.javadsl") to the current one, taking elements as they arrive from input streams,  picking randomly when several elements ready. |
	| `<M> [Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")>` | `[mergePreferred](#mergePreferred(akka.stream.Graph,boolean,boolean))​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<[Out](Source.html "type parameter in Source")>,​M> that,  boolean preferred,  boolean eagerComplete)` | Merge two sources. |
	| `<Mat2,​Mat3>[Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​Mat3>` | `[mergePreferredMat](#mergePreferredMat(akka.stream.Graph,boolean,boolean,akka.japi.function.Function2))​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<[Out](Source.html "type parameter in Source")>,​Mat2> that,  boolean preferred,  boolean eagerComplete,  [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<[Mat](Source.html "type parameter in Source"),​Mat2,​Mat3> matF)` | Merge two sources. |
	| `<M> [Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")>` | `[mergePrioritized](#mergePrioritized(akka.stream.Graph,int,int,boolean))​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<[Out](Source.html "type parameter in Source")>,​M> that,  int leftPriority,  int rightPriority,  boolean eagerComplete)` | Merge two sources. |
	| `<Mat2,​Mat3>[Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​Mat3>` | `[mergePrioritizedMat](#mergePrioritizedMat(akka.stream.Graph,int,int,boolean,akka.japi.function.Function2))​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<[Out](Source.html "type parameter in Source")>,​Mat2> that,  int leftPriority,  int rightPriority,  boolean eagerComplete,  [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<[Mat](Source.html "type parameter in Source"),​Mat2,​Mat3> matF)` | Merge multiple sources. |
	| `static <T> [Source](Source.html "class in akka.stream.javadsl")<T,​[NotUsed](../../NotUsed.html "class in akka")>` | `[mergePrioritizedN](#mergePrioritizedN(java.util.List,boolean))​(java.util.List<[Pair](../../japi/Pair.html "class in akka.japi")<[Source](Source.html "class in akka.stream.javadsl")<T,​?>,​java.lang.Integer>> sourcesAndPriorities,  boolean eagerComplete)` | Merge multiple [`Source`](Source.html "class in akka.stream.javadsl")s. |
	| `<M> [Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")>` | `[mergeSorted](#mergeSorted(akka.stream.Graph,java.util.Comparator))​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<[Out](Source.html "type parameter in Source")>,​M> that,  java.util.Comparator<[Out](Source.html "type parameter in Source")> comp)` | Merge the given [`Source`](Source.html "class in akka.stream.javadsl") to this [`Source`](Source.html "class in akka.stream.javadsl"), taking elements as they arrive from input streams,  picking always the smallest of the available elements (waiting for one element from each side  to be available). |
	| `<Mat2,​Mat3>[Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​Mat3>` | `[mergeSortedMat](#mergeSortedMat(akka.stream.Graph,java.util.Comparator,akka.japi.function.Function2))​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<[Out](Source.html "type parameter in Source")>,​Mat2> that,  java.util.Comparator<[Out](Source.html "type parameter in Source")> comp,  [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<[Mat](Source.html "type parameter in Source"),​Mat2,​Mat3> matF)` | Merge the given [`Source`](Source.html "class in akka.stream.javadsl") to this [`Source`](Source.html "class in akka.stream.javadsl"), taking elements as they arrive from input streams,  picking always the smallest of the available elements (waiting for one element from each side  to be available). |
	| `[Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​[Pair](../../japi/Pair.html "class in akka.japi")<[Mat](Source.html "type parameter in Source"),​[FlowMonitor](../FlowMonitor.html "interface in akka.stream")<[Out](Source.html "type parameter in Source")>>>` | `[monitor](#monitor())()` | Materializes to `Pair>`, which is unlike most other operators (!),  in which usually the default materialized value keeping semantics is to keep the left value  (by passing `Keep.left()` to a `*Mat` version of a method). |
	| `<M> [Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​M>` | `[monitorMat](#monitorMat(akka.japi.function.Function2))​([Function2](../../japi/function/Function2.html "interface in akka.japi.function")<[Mat](Source.html "type parameter in Source"),​[FlowMonitor](../FlowMonitor.html "interface in akka.stream")<[Out](Source.html "type parameter in Source")>,​M> combine)` | Materializes to `FlowMonitor[Out]` that allows monitoring of the current flow. |
	| `[Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")>` | `[named](#named(java.lang.String))​(java.lang.String name)` | Add a name attribute to this Source. |
	| `static <T> [Source](Source.html "class in akka.stream.javadsl")<T,​[NotUsed](../../NotUsed.html "class in akka")>` | `[never](#never())()` | Never emits any elements, never completes and never fails. |
	| `[Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")>` | `[onErrorComplete](#onErrorComplete())()` | onErrorComplete allows to complete the stream when an upstream error occurs. |
	| `[Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")>` | `[onErrorComplete](#onErrorComplete(java.lang.Class))​(java.lang.Class<? extends java.lang.Throwable> clazz)` | onErrorComplete allows to complete the stream when an upstream error occurs. |
	| `[Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")>` | `[onErrorComplete](#onErrorComplete(java.util.function.Predicate))​(java.util.function.Predicate<? super java.lang.Throwable> predicate)` | onErrorComplete allows to complete the stream when an upstream error occurs. |
	| `<M> [Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")>` | `[orElse](#orElse(akka.stream.Graph))​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<[Out](Source.html "type parameter in Source")>,​M> secondary)` | Provides a secondary source that will be consumed if this source completes without any  elements passing by. |
	| `<M,​M2>[Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​M2>` | `[orElseMat](#orElseMat(akka.stream.Graph,akka.japi.function.Function2))​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<[Out](Source.html "type parameter in Source")>,​M> secondary,  [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<[Mat](Source.html "type parameter in Source"),​M,​M2> matF)` | Provides a secondary source that will be consumed if this source completes without any  elements passing by. |
	| `[Source](Source.html "class in akka.stream.javadsl")<[Pair](../../japi/Pair.html "class in akka.japi")<java.util.List<[Out](Source.html "type parameter in Source")>,​[Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​[NotUsed](../../NotUsed.html "class in akka")>>,​[Mat](Source.html "type parameter in Source")>` | `[prefixAndTail](#prefixAndTail(int))​(int n)` | Takes up to `n` elements from the stream (less than `n` if the upstream completes before emitting `n` elements)  and returns a pair containing a strict sequence of the taken element  and a stream representing the remaining elements. |
	| `[Pair](../../japi/Pair.html "class in akka.japi")<[Mat](Source.html "type parameter in Source"),​[Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​[NotUsed](../../NotUsed.html "class in akka")>>` | `[preMaterialize](#preMaterialize(akka.actor.ClassicActorSystemProvider))​([ClassicActorSystemProvider](../../actor/ClassicActorSystemProvider.html "interface in akka.actor") systemProvider)` | Materializes this Source, immediately returning (1\) its materialized value, and (2\) a new Source  that can be used to consume elements from the newly materialized Source. |
	| `[Pair](../../japi/Pair.html "class in akka.japi")<[Mat](Source.html "type parameter in Source"),​[Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​[NotUsed](../../NotUsed.html "class in akka")>>` | `[preMaterialize](#preMaterialize(akka.stream.Materializer))​([Materializer](../Materializer.html "class in akka.stream") materializer)` | Materializes this Source, immediately returning (1\) its materialized value, and (2\) a new Source  that can be used to consume elements from the newly materialized Source. |
	| `<M> [Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")>` | `[prepend](#prepend(akka.stream.Graph))​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<[Out](Source.html "type parameter in Source")>,​M> that)` | Prepend the given [`Source`](Source.html "class in akka.stream.javadsl") to this one, meaning that once the given source  is exhausted and all result elements have been generated, the current source's  elements will be produced. |
	| `<M> [Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")>` | `[prependLazy](#prependLazy(akka.stream.Graph))​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<[Out](Source.html "type parameter in Source")>,​M> that)` | Prepend the given [`Source`](Source.html "class in akka.stream.javadsl") to this [`Flow`](Flow.html "class in akka.stream.javadsl"), meaning that before elements  are generated from this Flow, the Source's elements will be produced until it  is exhausted, at which point Flow elements will start being produced. |
	| `<M,​M2>[Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​M2>` | `[prependLazyMat](#prependLazyMat(akka.stream.Graph,akka.japi.function.Function2))​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<[Out](Source.html "type parameter in Source")>,​M> that,  [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<[Mat](Source.html "type parameter in Source"),​M,​M2> matF)` | Prepend the given [`Source`](Source.html "class in akka.stream.javadsl") to this [`Flow`](Flow.html "class in akka.stream.javadsl"), meaning that before elements  are generated from this Flow, the Source's elements will be produced until it  is exhausted, at which point Flow elements will start being produced. |
	| `<M,​M2>[Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​M2>` | `[prependMat](#prependMat(akka.stream.Graph,akka.japi.function.Function2))​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<[Out](Source.html "type parameter in Source")>,​M> that,  [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<[Mat](Source.html "type parameter in Source"),​M,​M2> matF)` | Prepend the given [`Source`](Source.html "class in akka.stream.javadsl") to this one, meaning that once the given source  is exhausted and all result elements have been generated, the current source's  elements will be produced. |
	| `static <T> [Source](Source.html "class in akka.stream.javadsl")<T,​[BoundedSourceQueue](../BoundedSourceQueue.html "interface in akka.stream")<T>>` | `[queue](#queue(int))​(int bufferSize)` | Creates a `Source` that is materialized as an [`BoundedSourceQueue`](../BoundedSourceQueue.html "interface in akka.stream"). |
	| `static <T> [Source](Source.html "class in akka.stream.javadsl")<T,​[SourceQueueWithComplete](SourceQueueWithComplete.html "interface in akka.stream.javadsl")<T>>` | `[queue](#queue(int,akka.stream.OverflowStrategy))​(int bufferSize,  [OverflowStrategy](../OverflowStrategy.html "class in akka.stream") overflowStrategy)` | Creates a `Source` that is materialized as an [`SourceQueueWithComplete`](SourceQueueWithComplete.html "interface in akka.stream.javadsl"). |
	| `static <T> [Source](Source.html "class in akka.stream.javadsl")<T,​[SourceQueueWithComplete](SourceQueueWithComplete.html "interface in akka.stream.javadsl")<T>>` | `[queue](#queue(int,akka.stream.OverflowStrategy,int))​(int bufferSize,  [OverflowStrategy](../OverflowStrategy.html "class in akka.stream") overflowStrategy,  int maxConcurrentOffers)` | Creates a `Source` that is materialized as an [`SourceQueueWithComplete`](SourceQueueWithComplete.html "interface in akka.stream.javadsl"). |
	| `static [Source](Source.html "class in akka.stream.javadsl")<java.lang.Integer,​[NotUsed](../../NotUsed.html "class in akka")>` | `[range](#range(int,int))​(int start,  int end)` | Creates [`Source`](Source.html "class in akka.stream.javadsl") that represents integer values in range ''\[start;end]'', step equals to 1\. |
	| `static [Source](Source.html "class in akka.stream.javadsl")<java.lang.Integer,​[NotUsed](../../NotUsed.html "class in akka")>` | `[range](#range(int,int,int))​(int start,  int end,  int step)` | Creates [`Source`](Source.html "class in akka.stream.javadsl") that represents integer values in range ''\[start;end]'', with the given step. |
	| `[Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")>` | `[recover](#recover(java.lang.Class,java.util.function.Supplier))​(java.lang.Class<? extends java.lang.Throwable> clazz,  java.util.function.Supplier<[Out](Source.html "type parameter in Source")> supplier)` | Recover allows to send last element on failure and gracefully complete the stream  Since the underlying failure signal onError arrives out\-of\-band, it might jump over existing elements. |
	| `[Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")>` | `[recover](#recover(scala.PartialFunction))​(scala.PartialFunction<java.lang.Throwable,​[Out](Source.html "type parameter in Source")> pf)` | Recover allows to send last element on failure and gracefully complete the stream  Since the underlying failure signal onError arrives out\-of\-band, it might jump over existing elements. |
	| `[Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")>` | `[recoverWith](#recoverWith(java.lang.Class,java.util.function.Supplier))​(java.lang.Class<? extends java.lang.Throwable> clazz,  java.util.function.Supplier<[Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<[Out](Source.html "type parameter in Source")>,​[NotUsed](../../NotUsed.html "class in akka")>> supplier)` | Deprecated. use `recoverWithRetries` instead |
	| `[Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")>` | `[recoverWith](#recoverWith(scala.PartialFunction))​(scala.PartialFunction<java.lang.Throwable,​? extends [Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<[Out](Source.html "type parameter in Source")>,​[NotUsed](../../NotUsed.html "class in akka")>> pf)` | Deprecated. use `recoverWithRetries` instead |
	| `[Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")>` | `[recoverWithRetries](#recoverWithRetries(int,java.lang.Class,java.util.function.Supplier))​(int attempts,  java.lang.Class<? extends java.lang.Throwable> clazz,  java.util.function.Supplier<[Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<[Out](Source.html "type parameter in Source")>,​[NotUsed](../../NotUsed.html "class in akka")>> supplier)` | RecoverWithRetries allows to switch to alternative Source on flow failure. |
	| `[Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")>` | `[recoverWithRetries](#recoverWithRetries(int,scala.PartialFunction))​(int attempts,  scala.PartialFunction<java.lang.Throwable,​? extends [Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<[Out](Source.html "type parameter in Source")>,​[NotUsed](../../NotUsed.html "class in akka")>> pf)` | RecoverWithRetries allows to switch to alternative Source on flow failure. |
	| `[Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")>` | `[reduce](#reduce(akka.japi.function.Function2))​([Function2](../../japi/function/Function2.html "interface in akka.japi.function")<[Out](Source.html "type parameter in Source"),​[Out](Source.html "type parameter in Source"),​[Out](Source.html "type parameter in Source")> f)` | Similar to `fold` but uses first element as zero element. |
	| `static <T> [Source](Source.html "class in akka.stream.javadsl")<T,​[NotUsed](../../NotUsed.html "class in akka")>` | `[repeat](#repeat(T))​(T element)` | Create a `Source` that will continually emit the given element. |
	| `java.util.concurrent.CompletionStage<[Done](../../Done.html "class in akka")>` | `[run](#run(akka.actor.ClassicActorSystemProvider))​([ClassicActorSystemProvider](../../actor/ClassicActorSystemProvider.html "interface in akka.actor") systemProvider)` | Connect this `Source` to the `Sink.ignore` and run it. |
	| `java.util.concurrent.CompletionStage<[Done](../../Done.html "class in akka")>` | `[run](#run(akka.stream.Materializer))​([Materializer](../Materializer.html "class in akka.stream") materializer)` | Connect this `Source` to the `Sink.ignore` and run it. |
	| `<U> java.util.concurrent.CompletionStage<U>` | `[runFold](#runFold(U,akka.japi.function.Function2,akka.actor.ClassicActorSystemProvider))​(U zero,  [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<U,​[Out](Source.html "type parameter in Source"),​U> f,  [ClassicActorSystemProvider](../../actor/ClassicActorSystemProvider.html "interface in akka.actor") systemProvider)` | Shortcut for running this `Source` with a fold function. |
	| `<U> java.util.concurrent.CompletionStage<U>` | `[runFold](#runFold(U,akka.japi.function.Function2,akka.stream.Materializer))​(U zero,  [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<U,​[Out](Source.html "type parameter in Source"),​U> f,  [Materializer](../Materializer.html "class in akka.stream") materializer)` | Shortcut for running this `Source` with a fold function. |
	| `<U> java.util.concurrent.CompletionStage<U>` | `[runFoldAsync](#runFoldAsync(U,akka.japi.function.Function2,akka.actor.ClassicActorSystemProvider))​(U zero,  [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<U,​[Out](Source.html "type parameter in Source"),​java.util.concurrent.CompletionStage<U>> f,  [ClassicActorSystemProvider](../../actor/ClassicActorSystemProvider.html "interface in akka.actor") systemProvider)` | Shortcut for running this `Source` with an asynchronous fold function. |
	| `<U> java.util.concurrent.CompletionStage<U>` | `[runFoldAsync](#runFoldAsync(U,akka.japi.function.Function2,akka.stream.Materializer))​(U zero,  [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<U,​[Out](Source.html "type parameter in Source"),​java.util.concurrent.CompletionStage<U>> f,  [Materializer](../Materializer.html "class in akka.stream") materializer)` | Shortcut for running this `Source` with an asynchronous fold function. |
	| `java.util.concurrent.CompletionStage<[Done](../../Done.html "class in akka")>` | `[runForeach](#runForeach(akka.japi.function.Procedure,akka.actor.ClassicActorSystemProvider))​([Procedure](../../japi/function/Procedure.html "interface in akka.japi.function")<[Out](Source.html "type parameter in Source")> f,  [ClassicActorSystemProvider](../../actor/ClassicActorSystemProvider.html "interface in akka.actor") systemProvider)` | Shortcut for running this `Source` with a foreach procedure. |
	| `java.util.concurrent.CompletionStage<[Done](../../Done.html "class in akka")>` | `[runForeach](#runForeach(akka.japi.function.Procedure,akka.stream.Materializer))​([Procedure](../../japi/function/Procedure.html "interface in akka.japi.function")<[Out](Source.html "type parameter in Source")> f,  [Materializer](../Materializer.html "class in akka.stream") materializer)` | Shortcut for running this `Source` with a foreach procedure. |
	| `java.util.concurrent.CompletionStage<[Out](Source.html "type parameter in Source")>` | `[runReduce](#runReduce(akka.japi.function.Function2,akka.actor.ClassicActorSystemProvider))​([Function2](../../japi/function/Function2.html "interface in akka.japi.function")<[Out](Source.html "type parameter in Source"),​[Out](Source.html "type parameter in Source"),​[Out](Source.html "type parameter in Source")> f,  [ClassicActorSystemProvider](../../actor/ClassicActorSystemProvider.html "interface in akka.actor") systemProvider)` | Shortcut for running this `Source` with a reduce function. |
	| `java.util.concurrent.CompletionStage<[Out](Source.html "type parameter in Source")>` | `[runReduce](#runReduce(akka.japi.function.Function2,akka.stream.Materializer))​([Function2](../../japi/function/Function2.html "interface in akka.japi.function")<[Out](Source.html "type parameter in Source"),​[Out](Source.html "type parameter in Source"),​[Out](Source.html "type parameter in Source")> f,  [Materializer](../Materializer.html "class in akka.stream") materializer)` | Shortcut for running this `Source` with a reduce function. |
	| `<M> M` | `[runWith](#runWith(akka.stream.Graph,akka.actor.ClassicActorSystemProvider))​([Graph](../Graph.html "interface in akka.stream")<[SinkShape](../SinkShape.html "class in akka.stream")<[Out](Source.html "type parameter in Source")>,​M> sink,  [ClassicActorSystemProvider](../../actor/ClassicActorSystemProvider.html "interface in akka.actor") systemProvider)` | Connect this `Source` to a `Sink` and run it. |
	| `<M> M` | `[runWith](#runWith(akka.stream.Graph,akka.stream.Materializer))​([Graph](../Graph.html "interface in akka.stream")<[SinkShape](../SinkShape.html "class in akka.stream")<[Out](Source.html "type parameter in Source")>,​M> sink,  [Materializer](../Materializer.html "class in akka.stream") materializer)` | Connect this `Source` to a `Sink` and run it. |
	| `<T> [Source](Source.html "class in akka.stream.javadsl")<T,​[Mat](Source.html "type parameter in Source")>` | `[scan](#scan(T,akka.japi.function.Function2))​(T zero,  [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<T,​[Out](Source.html "type parameter in Source"),​T> f)` | Similar to `fold` but is not a terminal operation,  emits its current value which starts at `zero` and then  applies the current and next value to the given function `f`,  emitting the next current value. |
	| `<T> [Source](Source.html "class in akka.stream.javadsl")<T,​[Mat](Source.html "type parameter in Source")>` | `[scanAsync](#scanAsync(T,akka.japi.function.Function2))​(T zero,  [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<T,​[Out](Source.html "type parameter in Source"),​java.util.concurrent.CompletionStage<T>> f)` | Similar to `scan` but with a asynchronous function,  emits its current value which starts at `zero` and then  applies the current and next value to the given function `f`,  emitting a `Future` that resolves to the next current value. |
	| `static <T,​M>[Source](Source.html "class in akka.stream.javadsl")<T,​java.util.concurrent.CompletionStage<M>>` | `[setup](#setup(java.util.function.BiFunction))​(java.util.function.BiFunction<[ActorMaterializer](../ActorMaterializer.html "class in akka.stream"),​[Attributes](../Attributes.html "class in akka.stream"),​[Source](Source.html "class in akka.stream.javadsl")<T,​M>> factory)` | Deprecated. Use 'fromMaterializer' instead. |
	| `[SourceShape](../SourceShape.html "class in akka.stream")<[Out](Source.html "type parameter in Source")>` | `[shape](#shape())()` | The shape of a graph is all that is externally visible: its inlets and outlets. |
	| `static <T> [Source](Source.html "class in akka.stream.javadsl")<T,​[NotUsed](../../NotUsed.html "class in akka")>` | `[single](#single(T))​(T element)` | Create a `Source` with one element. |
	| `[Source](Source.html "class in akka.stream.javadsl")<java.util.List<[Out](Source.html "type parameter in Source")>,​[Mat](Source.html "type parameter in Source")>` | `[sliding](#sliding(int,int))​(int n,  int step)` | Apply a sliding window over the stream and return the windows as groups of elements, with the last group  possibly smaller than requested due to end\-of\-stream. |
	| `[SubSource](SubSource.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")>` | `[splitAfter](#splitAfter(akka.japi.function.Predicate))​([Predicate](../../japi/function/Predicate.html "interface in akka.japi.function")<[Out](Source.html "type parameter in Source")> p)` | This operation applies the given predicate to all incoming elements and  emits them to a stream of output streams. |
	| `[SubSource](SubSource.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")>` | `[splitAfter](#splitAfter(akka.stream.SubstreamCancelStrategy,akka.japi.function.Predicate))​([SubstreamCancelStrategy](../SubstreamCancelStrategy.html "class in akka.stream") substreamCancelStrategy,  [Predicate](../../japi/function/Predicate.html "interface in akka.japi.function")<[Out](Source.html "type parameter in Source")> p)` | This operation applies the given predicate to all incoming elements and  emits them to a stream of output streams. |
	| `[SubSource](SubSource.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")>` | `[splitWhen](#splitWhen(akka.japi.function.Predicate))​([Predicate](../../japi/function/Predicate.html "interface in akka.japi.function")<[Out](Source.html "type parameter in Source")> p)` | This operation applies the given predicate to all incoming elements and  emits them to a stream of output streams, always beginning a new one with  the current element if the given predicate returns true for it. |
	| `[SubSource](SubSource.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")>` | `[splitWhen](#splitWhen(akka.stream.SubstreamCancelStrategy,akka.japi.function.Predicate))​([SubstreamCancelStrategy](../SubstreamCancelStrategy.html "class in akka.stream") substreamCancelStrategy,  [Predicate](../../japi/function/Predicate.html "interface in akka.japi.function")<[Out](Source.html "type parameter in Source")> p)` | This operation applies the given predicate to all incoming elements and  emits them to a stream of output streams, always beginning a new one with  the current element if the given predicate returns true for it. |
	| `<S,​T>[Source](Source.html "class in akka.stream.javadsl")<T,​[Mat](Source.html "type parameter in Source")>` | `[statefulMap](#statefulMap(akka.japi.function.Creator,akka.japi.function.Function2,akka.japi.function.Function))​([Creator](../../japi/function/Creator.html "interface in akka.japi.function")<S> create,  [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<S,​[Out](Source.html "type parameter in Source"),​[Pair](../../japi/Pair.html "class in akka.japi")<S,​T>> f,  [Function](../../japi/function/Function.html "interface in akka.japi.function")<S,​java.util.Optional<T>> onComplete)` | Transform each stream element with the help of a state. |
	| `<T> [Source](Source.html "class in akka.stream.javadsl")<T,​[Mat](Source.html "type parameter in Source")>` | `[statefulMapConcat](#statefulMapConcat(akka.japi.function.Creator))​([Creator](../../japi/function/Creator.html "interface in akka.japi.function")<[Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](Source.html "type parameter in Source"),​java.lang.Iterable<T>>> f)` | Transform each input element into an `Iterable` of output elements that is  then flattened into the output stream. |
	| `[Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")>` | `[take](#take(long))​(long n)` | Terminate processing (and cancel the upstream publisher) after the given  number of elements. |
	| `[Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")>` | `[takeWhile](#takeWhile(akka.japi.function.Predicate))​([Predicate](../../japi/function/Predicate.html "interface in akka.japi.function")<[Out](Source.html "type parameter in Source")> p)` | Terminate processing (and cancel the upstream publisher) after predicate  returns false for the first time. |
	| `[Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")>` | `[takeWhile](#takeWhile(akka.japi.function.Predicate,boolean))​([Predicate](../../japi/function/Predicate.html "interface in akka.japi.function")<[Out](Source.html "type parameter in Source")> p,  boolean inclusive)` | Terminate processing (and cancel the upstream publisher) after predicate  returns false for the first time, including the first failed element if inclusive is true  Due to input buffering some elements may have been requested from upstream publishers  that will then not be processed downstream of this step. |
	| `[Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")>` | `[takeWithin](#takeWithin(java.time.Duration))​(java.time.Duration duration)` | Terminate processing (and cancel the upstream publisher) after the given  duration. |
	| `[Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")>` | `[throttle](#throttle(int,java.time.Duration))​(int elements,  java.time.Duration per)` | Sends elements downstream with speed limited to `elements/per`. |
	| `[Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")>` | `[throttle](#throttle(int,java.time.Duration,int,akka.japi.function.Function,akka.stream.ThrottleMode))​(int cost,  java.time.Duration per,  int maximumBurst,  [Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](Source.html "type parameter in Source"),​java.lang.Integer> costCalculation,  [ThrottleMode](../ThrottleMode.html "class in akka.stream") mode)` | Sends elements downstream with speed limited to `cost/per`. |
	| `[Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")>` | `[throttle](#throttle(int,java.time.Duration,int,akka.stream.ThrottleMode))​(int elements,  java.time.Duration per,  int maximumBurst,  [ThrottleMode](../ThrottleMode.html "class in akka.stream") mode)` | Sends elements downstream with speed limited to `elements/per`. |
	| `[Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")>` | `[throttle](#throttle(int,java.time.Duration,akka.japi.function.Function))​(int cost,  java.time.Duration per,  [Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](Source.html "type parameter in Source"),​java.lang.Integer> costCalculation)` | Sends elements downstream with speed limited to `cost/per`. |
	| `[Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")>` | `[throttle](#throttle(akka.stream.javadsl.ThrottleControl))​([ThrottleControl](ThrottleControl.html "class in akka.stream.javadsl") control)` | The `ThrottleControl` can be updated to change the throttle rate from the outside of the stream  and share a total rate limit between several streams. |
	| `[Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")>` | `[throttle](#throttle(akka.stream.javadsl.ThrottleControl,akka.japi.function.Function))​([ThrottleControl](ThrottleControl.html "class in akka.stream.javadsl") control,  [Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](Source.html "type parameter in Source"),​java.lang.Integer> costCalculation)` | The `ThrottleControl` can be updated to change the throttle rate from the outside of the stream  and share a total rate limit between several streams. |
	| `static <O> [Source](Source.html "class in akka.stream.javadsl")<O,​[Cancellable](../../actor/Cancellable.html "interface in akka.actor")>` | `[tick](#tick(java.time.Duration,java.time.Duration,O))​(java.time.Duration initialDelay,  java.time.Duration interval,  O tick)` | Elements are emitted periodically with the specified interval. |
	| `<M> [RunnableGraph](RunnableGraph.html "class in akka.stream.javadsl")<[Mat](Source.html "type parameter in Source")>` | `[to](#to(akka.stream.Graph))​([Graph](../Graph.html "interface in akka.stream")<[SinkShape](../SinkShape.html "class in akka.stream")<[Out](Source.html "type parameter in Source")>,​M> sink)` | Connect this [`Source`](Source.html "class in akka.stream.javadsl") to a [`Sink`](Sink.html "class in akka.stream.javadsl"), concatenating the processing steps of both. |
	| `<M,​M2>[RunnableGraph](RunnableGraph.html "class in akka.stream.javadsl")<M2>` | `[toMat](#toMat(akka.stream.Graph,akka.japi.function.Function2))​([Graph](../Graph.html "interface in akka.stream")<[SinkShape](../SinkShape.html "class in akka.stream")<[Out](Source.html "type parameter in Source")>,​M> sink,  [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<[Mat](Source.html "type parameter in Source"),​M,​M2> combine)` | Connect this [`Source`](Source.html "class in akka.stream.javadsl") to a [`Sink`](Sink.html "class in akka.stream.javadsl"), concatenating the processing steps of both. |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `akka.stream.impl.LinearTraversalBuilder` | `[traversalBuilder](#traversalBuilder())()` | INTERNAL API. |
	| `static <S,​E>[Source](Source.html "class in akka.stream.javadsl")<E,​[NotUsed](../../NotUsed.html "class in akka")>` | `[unfold](#unfold(S,akka.japi.function.Function))​(S s,  [Function](../../japi/function/Function.html "interface in akka.japi.function")<S,​java.util.Optional<[Pair](../../japi/Pair.html "class in akka.japi")<S,​E>>> f)` | Create a `Source` that will unfold a value of type `S` into  a pair of the next state `S` and output elements of type `E`. |
	| `static <S,​E>[Source](Source.html "class in akka.stream.javadsl")<E,​[NotUsed](../../NotUsed.html "class in akka")>` | `[unfoldAsync](#unfoldAsync(S,akka.japi.function.Function))​(S s,  [Function](../../japi/function/Function.html "interface in akka.japi.function")<S,​java.util.concurrent.CompletionStage<java.util.Optional<[Pair](../../japi/Pair.html "class in akka.japi")<S,​E>>>> f)` | Same as [`<S,E>unfold(S,akka.japi.function.Function<S,java.util.Optional<akka.japi.Pair<S,E>>>)`](#unfold(S,akka.japi.function.Function)), but uses an async function to generate the next state\-element tuple. |
	| `static <T,​S>[Source](Source.html "class in akka.stream.javadsl")<T,​[NotUsed](../../NotUsed.html "class in akka")>` | `[unfoldResource](#unfoldResource(akka.japi.function.Creator,akka.japi.function.Function,akka.japi.function.Procedure))​([Creator](../../japi/function/Creator.html "interface in akka.japi.function")<S> create,  [Function](../../japi/function/Function.html "interface in akka.japi.function")<S,​java.util.Optional<T>> read,  [Procedure](../../japi/function/Procedure.html "interface in akka.japi.function")<S> close)` | Start a new `Source` from some resource which can be opened, read and closed. |
	| `static <T,​S>[Source](Source.html "class in akka.stream.javadsl")<T,​[NotUsed](../../NotUsed.html "class in akka")>` | `[unfoldResourceAsync](#unfoldResourceAsync(akka.japi.function.Creator,akka.japi.function.Function,akka.japi.function.Function))​([Creator](../../japi/function/Creator.html "interface in akka.japi.function")<java.util.concurrent.CompletionStage<S>> create,  [Function](../../japi/function/Function.html "interface in akka.japi.function")<S,​java.util.concurrent.CompletionStage<java.util.Optional<T>>> read,  [Function](../../japi/function/Function.html "interface in akka.japi.function")<S,​java.util.concurrent.CompletionStage<[Done](../../Done.html "class in akka")>> close)` | Start a new `Source` from some resource which can be opened, read and closed. |
	| `static <SuperOut,​Out extends SuperOut,​Mat>[Source](Source.html "class in akka.stream.javadsl")<SuperOut,​Mat>` | `[upcast](#upcast(akka.stream.javadsl.Source))​([Source](Source.html "class in akka.stream.javadsl")<Out,​Mat> source)` | Upcast a stream of elements to a stream of supertypes of that element. |
	| `<T,​M>[Source](Source.html "class in akka.stream.javadsl")<T,​[Mat](Source.html "type parameter in Source")>` | `[via](#via(akka.stream.Graph))​([Graph](../Graph.html "interface in akka.stream")<[FlowShape](../FlowShape.html "class in akka.stream")<[Out](Source.html "type parameter in Source"),​T>,​M> flow)` | Transform this [`Source`](Source.html "class in akka.stream.javadsl") by appending the given processing operators. |
	| `<T,​M,​M2>[Source](Source.html "class in akka.stream.javadsl")<T,​M2>` | `[viaMat](#viaMat(akka.stream.Graph,akka.japi.function.Function2))​([Graph](../Graph.html "interface in akka.stream")<[FlowShape](../FlowShape.html "class in akka.stream")<[Out](Source.html "type parameter in Source"),​T>,​M> flow,  [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<[Mat](Source.html "type parameter in Source"),​M,​M2> combine)` | Transform this [`Source`](Source.html "class in akka.stream.javadsl") by appending the given processing operators. |
	| `[Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")>` | `[watch](#watch(akka.actor.ActorRef))​([ActorRef](../../actor/ActorRef.html "class in akka.actor") ref)` | The operator fails with an [`WatchedActorTerminatedException`](../WatchedActorTerminatedException.html "class in akka.stream") if the target actor is terminated. |
	| `<M> [Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​M>` | `[watchTermination](#watchTermination(akka.japi.function.Function2))​([Function2](../../japi/function/Function2.html "interface in akka.japi.function")<[Mat](Source.html "type parameter in Source"),​java.util.concurrent.CompletionStage<[Done](../../Done.html "class in akka")>,​M> matF)` | Materializes to `Future[Done]` that completes on getting termination message. |
	| `[Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")>` | `[wireTap](#wireTap(akka.japi.function.Procedure))​([Procedure](../../japi/function/Procedure.html "interface in akka.japi.function")<[Out](Source.html "type parameter in Source")> f)` | This is a simplified version of `wireTap(Sink)` that takes only a simple procedure. |
	| `[Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")>` | `[wireTap](#wireTap(akka.stream.Graph))​([Graph](../Graph.html "interface in akka.stream")<[SinkShape](../SinkShape.html "class in akka.stream")<[Out](Source.html "type parameter in Source")>,​?> that)` | Attaches the given [`Sink`](Sink.html "class in akka.stream.javadsl") to this [`Flow`](Flow.html "class in akka.stream.javadsl") as a wire tap, meaning that elements that pass  through will also be sent to the wire\-tap Sink, without the latter affecting the mainline flow. |
	| `<M2,​M3>[Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​M3>` | `[wireTapMat](#wireTapMat(akka.stream.Graph,akka.japi.function.Function2))​([Graph](../Graph.html "interface in akka.stream")<[SinkShape](../SinkShape.html "class in akka.stream")<[Out](Source.html "type parameter in Source")>,​M2> that,  [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<[Mat](Source.html "type parameter in Source"),​M2,​M3> matF)` | Attaches the given [`Sink`](Sink.html "class in akka.stream.javadsl") to this [`Flow`](Flow.html "class in akka.stream.javadsl") as a wire tap, meaning that elements that pass  through will also be sent to the wire\-tap Sink, without the latter affecting the mainline flow. |
	| `[Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")>` | `[withAttributes](#withAttributes(akka.stream.Attributes))​([Attributes](../Attributes.html "class in akka.stream") attr)` | Replace the attributes of this [`Source`](Source.html "class in akka.stream.javadsl") with the given ones. |
	| `<T> [Source](Source.html "class in akka.stream.javadsl")<[Pair](../../japi/Pair.html "class in akka.japi")<[Out](Source.html "type parameter in Source"),​T>,​[Mat](Source.html "type parameter in Source")>` | `[zip](#zip(akka.stream.Graph))​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<T>,​?> that)` | Combine the elements of current [`Source`](Source.html "class in akka.stream.javadsl") and the given one into a stream of tuples. |
	| `<U,​A>[Source](Source.html "class in akka.stream.javadsl")<[Pair](../../japi/Pair.html "class in akka.japi")<A,​U>,​[Mat](Source.html "type parameter in Source")>` | `[zipAll](#zipAll(akka.stream.Graph,A,U))​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<U>,​?> that,  A thisElem,  U thatElem)` | Combine the elements of current flow and the given [`Source`](Source.html "class in akka.stream.javadsl") into a stream of tuples. |
	| `<U,​Mat2,​Mat3,​A>[Source](Source.html "class in akka.stream.javadsl")<[Pair](../../japi/Pair.html "class in akka.japi")<A,​U>,​Mat3>` | `[zipAllMat](#zipAllMat(akka.stream.Graph,A,U,scala.Function2))​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<U>,​Mat2> that,  A thisElem,  U thatElem,  scala.Function2<[Mat](Source.html "type parameter in Source"),​Mat2,​Mat3> matF)` | Combine the elements of current flow and the given [`Source`](Source.html "class in akka.stream.javadsl") into a stream of tuples. |
	| `<T> [Source](Source.html "class in akka.stream.javadsl")<[Pair](../../japi/Pair.html "class in akka.japi")<[Out](Source.html "type parameter in Source"),​T>,​[Mat](Source.html "type parameter in Source")>` | `[zipLatest](#zipLatest(akka.stream.Graph))​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<T>,​?> that)` | Combine the elements of 2 streams into a stream of tuples, picking always the latest element of each. |
	| `<T,​M,​M2>[Source](Source.html "class in akka.stream.javadsl")<[Pair](../../japi/Pair.html "class in akka.japi")<[Out](Source.html "type parameter in Source"),​T>,​M2>` | `[zipLatestMat](#zipLatestMat(akka.stream.Graph,akka.japi.function.Function2))​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<T>,​M> that,  [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<[Mat](Source.html "type parameter in Source"),​M,​M2> matF)` | Combine the elements of current [`Source`](Source.html "class in akka.stream.javadsl") and the given one into a stream of tuples, picking always the latest element of each. |
	| `<Out2,​Out3>[Source](Source.html "class in akka.stream.javadsl")<Out3,​[Mat](Source.html "type parameter in Source")>` | `[zipLatestWith](#zipLatestWith(akka.stream.Graph,boolean,akka.japi.function.Function2))​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<Out2>,​?> that,  boolean eagerComplete,  [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<[Out](Source.html "type parameter in Source"),​Out2,​Out3> combine)` | Combine the elements of multiple streams into a stream of combined elements using a combiner function,  picking always the latest of the elements of each source. |
	| `<Out2,​Out3>[Source](Source.html "class in akka.stream.javadsl")<Out3,​[Mat](Source.html "type parameter in Source")>` | `[zipLatestWith](#zipLatestWith(akka.stream.Graph,akka.japi.function.Function2))​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<Out2>,​?> that,  [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<[Out](Source.html "type parameter in Source"),​Out2,​Out3> combine)` | Combine the elements of multiple streams into a stream of combined elements using a combiner function,  picking always the latest of the elements of each source. |
	| `<Out2,​Out3,​M,​M2>[Source](Source.html "class in akka.stream.javadsl")<Out3,​M2>` | `[zipLatestWithMat](#zipLatestWithMat(akka.stream.Graph,boolean,akka.japi.function.Function2,akka.japi.function.Function2))​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<Out2>,​M> that,  boolean eagerComplete,  [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<[Out](Source.html "type parameter in Source"),​Out2,​Out3> combine,  [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<[Mat](Source.html "type parameter in Source"),​M,​M2> matF)` | Put together the elements of current [`Source`](Source.html "class in akka.stream.javadsl") and the given one  into a stream of combined elements using a combiner function,  picking always the latest of the elements of each source. |
	| `<Out2,​Out3,​M,​M2>[Source](Source.html "class in akka.stream.javadsl")<Out3,​M2>` | `[zipLatestWithMat](#zipLatestWithMat(akka.stream.Graph,akka.japi.function.Function2,akka.japi.function.Function2))​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<Out2>,​M> that,  [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<[Out](Source.html "type parameter in Source"),​Out2,​Out3> combine,  [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<[Mat](Source.html "type parameter in Source"),​M,​M2> matF)` | Put together the elements of current [`Source`](Source.html "class in akka.stream.javadsl") and the given one  into a stream of combined elements using a combiner function,  picking always the latest of the elements of each source. |
	| `<T,​M,​M2>[Source](Source.html "class in akka.stream.javadsl")<[Pair](../../japi/Pair.html "class in akka.japi")<[Out](Source.html "type parameter in Source"),​T>,​M2>` | `[zipMat](#zipMat(akka.stream.Graph,akka.japi.function.Function2))​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<T>,​M> that,  [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<[Mat](Source.html "type parameter in Source"),​M,​M2> matF)` | Combine the elements of current [`Source`](Source.html "class in akka.stream.javadsl") and the given one into a stream of tuples. |
	| `static <T> [Source](Source.html "class in akka.stream.javadsl")<java.util.List<T>,​[NotUsed](../../NotUsed.html "class in akka")>` | `[zipN](#zipN(java.util.List))​(java.util.List<[Source](Source.html "class in akka.stream.javadsl")<T,​?>> sources)` | Combine the elements of multiple streams into a stream of lists. |
	| `<Out2,​Out3>[Source](Source.html "class in akka.stream.javadsl")<Out3,​[Mat](Source.html "type parameter in Source")>` | `[zipWith](#zipWith(akka.stream.Graph,akka.japi.function.Function2))​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<Out2>,​?> that,  [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<[Out](Source.html "type parameter in Source"),​Out2,​Out3> combine)` | Put together the elements of current [`Source`](Source.html "class in akka.stream.javadsl") and the given one  into a stream of combined elements using a combiner function. |
	| `[Source](Source.html "class in akka.stream.javadsl")<[Pair](../../japi/Pair.html "class in akka.japi")<[Out](Source.html "type parameter in Source"),​java.lang.Long>,​[Mat](Source.html "type parameter in Source")>` | `[zipWithIndex](#zipWithIndex())()` | Combine the elements of current [`Source`](Source.html "class in akka.stream.javadsl") into a stream of tuples consisting  of all elements paired with their index. |
	| `<Out2,​Out3,​M,​M2>[Source](Source.html "class in akka.stream.javadsl")<Out3,​M2>` | `[zipWithMat](#zipWithMat(akka.stream.Graph,akka.japi.function.Function2,akka.japi.function.Function2))​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<Out2>,​M> that,  [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<[Out](Source.html "type parameter in Source"),​Out2,​Out3> combine,  [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<[Mat](Source.html "type parameter in Source"),​M,​M2> matF)` | Put together the elements of current [`Source`](Source.html "class in akka.stream.javadsl") and the given one  into a stream of combined elements using a combiner function. |
	| `static <T,​O>[Source](Source.html "class in akka.stream.javadsl")<O,​[NotUsed](../../NotUsed.html "class in akka")>` | `[zipWithN](#zipWithN(akka.japi.function.Function,java.util.List))​([Function](../../japi/function/Function.html "interface in akka.japi.function")<java.util.List<T>,​O> zipper,  java.util.List<[Source](Source.html "class in akka.stream.javadsl")<T,​?>> sources)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### Source
		
		
		
		```
		public Source​([Source](../scaladsl/Source.html "class in akka.stream.scaladsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")> delegate)
		```

	- ### Method Detail
	
	
	
		- #### empty
		
		
		
		```
		public static <O> [Source](Source.html "class in akka.stream.javadsl")<O,​[NotUsed](../../NotUsed.html "class in akka")> empty()
		```
		
		Create a `Source` with no elements, i.e. an empty stream that is completed immediately
		 for every connected `Sink`.
		- #### empty
		
		
		
		```
		public static <T> [Source](Source.html "class in akka.stream.javadsl")<T,​[NotUsed](../../NotUsed.html "class in akka")> empty​(java.lang.Class<T> clazz)
		```
		
		Create a `Source` with no elements. The result is the same as calling `Source.empty()`
		- #### maybe
		
		
		
		```
		public static <T> [Source](Source.html "class in akka.stream.javadsl")<T,​java.util.concurrent.CompletableFuture<java.util.Optional<T>>> maybe()
		```
		
		Create a `Source` which materializes a `CompletableFuture` which controls what element
		 will be emitted by the Source.
		 If the materialized promise is completed with a filled Optional, that value will be produced downstream,
		 followed by completion.
		 If the materialized promise is completed with an empty Optional, no value will be produced downstream and completion will
		 be signalled immediately.
		 If the materialized promise is completed with a failure, then the source will fail with that error.
		 If the downstream of this source cancels or fails before the promise has been completed, then the promise will be completed
		 with an empty Optional.
		- #### fromPublisher
		
		
		
		```
		public static <O> [Source](Source.html "class in akka.stream.javadsl")<O,​[NotUsed](../../NotUsed.html "class in akka")> fromPublisher​(org.reactivestreams.Publisher<O> publisher)
		```
		
		Helper to create [`Source`](Source.html "class in akka.stream.javadsl") from `Publisher`.
		 
		 Construct a transformation starting with given publisher. The transformation steps
		 are executed by a series of `Processor` instances
		 that mediate the flow of elements downstream and the propagation of
		 back\-pressure upstream.
		- #### fromIterator
		
		
		
		```
		public static <O> [Source](Source.html "class in akka.stream.javadsl")<O,​[NotUsed](../../NotUsed.html "class in akka")> fromIterator​([Creator](../../japi/function/Creator.html "interface in akka.japi.function")<java.util.Iterator<O>> f)
		```
		
		Helper to create a [`Source`](Source.html "class in akka.stream.javadsl") from an `Iterator`.
		 Example usage:
		 
		
		
		
		```
		
		 List<Integer> data = new ArrayList<Integer>();
		 data.add(1);
		 data.add(2);
		 data.add(3);
		 Source.from(() -> data.iterator());
		 
		```
		
		
		 Start a new `Source` from the given Iterator. The produced stream of elements
		 will continue until the iterator runs empty or fails during evaluation of
		 the `next()` method. Elements are pulled out of the iterator
		 in accordance with the demand coming from the downstream transformation
		 steps.
		- #### fromJavaStream
		
		
		
		```
		public static <O,​S extends java.util.stream.BaseStream<O,​S>> [Source](Source.html "class in akka.stream.javadsl")<O,​[NotUsed](../../NotUsed.html "class in akka")> fromJavaStream​([Creator](../../japi/function/Creator.html "interface in akka.japi.function")<java.util.stream.BaseStream<O,​S>> stream)
		```
		
		Creates a source that wraps a Java 8 Stream. Source uses a stream iterator to get all its
		 elements and send them downstream on demand.
		 
		 You can use `Source.async` to create asynchronous boundaries between synchronous java stream
		 and the rest of flow.
		- #### cycle
		
		
		
		```
		public static <O> [Source](Source.html "class in akka.stream.javadsl")<O,​[NotUsed](../../NotUsed.html "class in akka")> cycle​([Creator](../../japi/function/Creator.html "interface in akka.japi.function")<java.util.Iterator<O>> f)
		```
		
		Helper to create a 'cycled' [`Source`](Source.html "class in akka.stream.javadsl") that will continually produce elements in the order
		 they are provided.
		 
		 Example usage:
		 
		
		
		
		
		
		```
		
		 Source.cycle(() -> Arrays.asList(1, 2, 3).iterator());
		 
		```
		
		
		 The function `f` is invoked to obtain an iterator and elements are emitted into the stream as
		 provided by that iterator. If the iterator is finite, the function `f` invoked again, as necessary,
		 when the elements from the previous iteration are exhausted. If every call to function `f` returns
		 an iterator that produces the same elements in the same order, then the [`Source`](Source.html "class in akka.stream.javadsl") will effectively
		 be cyclic. However, `f` is not required to behave that way, in which case the [`Source`](Source.html "class in akka.stream.javadsl") will not be cyclic.
		 
		
		
		 The [`Source`](Source.html "class in akka.stream.javadsl") fails if `f` returns an empty iterator.
		- #### from
		
		
		
		```
		public static <O> [Source](Source.html "class in akka.stream.javadsl")<O,​[NotUsed](../../NotUsed.html "class in akka")> from​(java.lang.Iterable<O> iterable)
		```
		
		Helper to create [`Source`](Source.html "class in akka.stream.javadsl") from `Iterable`.
		 Example usage:
		 
		```
		
		 List<Integer> data = new ArrayList<Integer>();
		 data.add(1);
		 data.add(2);
		 data.add(3);
		 Source.from(data);
		 
		```
		
		
		 Starts a new `Source` from the given `Iterable`. This is like starting from an
		 Iterator, but every Subscriber directly attached to the Publisher of this
		 stream will see an individual flow of elements (always starting from the
		 beginning) regardless of when they subscribed.
		 
		
		
		 Make sure that the `Iterable` is immutable or at least not modified after
		 being used as a `Source`. Otherwise the stream may fail with
		 `ConcurrentModificationException` or other more subtle errors may occur.
		- #### range
		
		
		
		```
		public static [Source](Source.html "class in akka.stream.javadsl")<java.lang.Integer,​[NotUsed](../../NotUsed.html "class in akka")> range​(int start,
		                                                            int end)
		```
		
		Creates [`Source`](Source.html "class in akka.stream.javadsl") that represents integer values in range ''\[start;end]'', step equals to 1\.
		 It allows to create `Source` out of range as simply as on Scala `Source(1 to N)`
		
		 Uses {@link scala.collection.immutable.Range.inclusive(Int, Int)} internally
		- #### range
		
		
		
		```
		public static [Source](Source.html "class in akka.stream.javadsl")<java.lang.Integer,​[NotUsed](../../NotUsed.html "class in akka")> range​(int start,
		                                                            int end,
		                                                            int step)
		```
		
		Creates [`Source`](Source.html "class in akka.stream.javadsl") that represents integer values in range ''\[start;end]'', with the given step.
		 It allows to create `Source` out of range as simply as on Scala `Source(1 to N)`
		
		 Uses {@link scala.collection.immutable.Range.inclusive(Int, Int, Int)} internally
		- #### fromFuture
		
		
		
		```
		public static <O> [Source](Source.html "class in akka.stream.javadsl")<O,​[NotUsed](../../NotUsed.html "class in akka")> fromFuture​(scala.concurrent.Future<O> future)
		```
		
		Deprecated.
		Use 'Source.future' instead. Since 2\.6\.0\.
		
		Start a new `Source` from the given `Future`. The stream will consist of
		 one element when the `Future` is completed with a successful value, which
		 may happen before or after materializing the `Flow`.
		 The stream terminates with a failure if the `Future` is completed with a failure.
		- #### fromCompletionStage
		
		
		
		```
		public static <O> [Source](Source.html "class in akka.stream.javadsl")<O,​[NotUsed](../../NotUsed.html "class in akka")> fromCompletionStage​(java.util.concurrent.CompletionStage<O> future)
		```
		
		Deprecated.
		Use 'Source.completionStage' instead. Since 2\.6\.0\.
		
		Starts a new `Source` from the given `CompletionStage`. The stream will consist of
		 one element when the `CompletionStage` is completed with a successful value, which
		 may happen before or after materializing the `Flow`.
		 The stream terminates with a failure if the `CompletionStage` is completed with a failure.
		- #### fromFutureSource
		
		
		
		```
		public static <T,​M> [Source](Source.html "class in akka.stream.javadsl")<T,​scala.concurrent.Future<M>> fromFutureSource​(scala.concurrent.Future<? extends [Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<T>,​M>> future)
		```
		
		Deprecated.
		Use 'Source.futureSource' (potentially together with \`Source.fromGraph\`) instead. Since 2\.6\.0\.
		
		Streams the elements of the given future source once it successfully completes.
		 If the `Future` fails the stream is failed with the exception from the future. If downstream cancels before the
		 stream completes the materialized `Future` will be failed with a `StreamDetachedException`.
		- #### fromSourceCompletionStage
		
		
		
		```
		public static <T,​M> [Source](Source.html "class in akka.stream.javadsl")<T,​java.util.concurrent.CompletionStage<M>> fromSourceCompletionStage​(java.util.concurrent.CompletionStage<? extends [Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<T>,​M>> completion)
		```
		
		Deprecated.
		Use 'Source.completionStageSource' (potentially together with \`Source.fromGraph\`) instead. Since 2\.6\.0\.
		
		Streams the elements of an asynchronous source once its given `CompletionStage` completes.
		 If the `CompletionStage` fails the stream is failed with the exception from the future.
		 If downstream cancels before the stream completes the materialized `CompletionStage` will be failed
		 with a `StreamDetachedException`
		- #### tick
		
		
		
		```
		public static <O> [Source](Source.html "class in akka.stream.javadsl")<O,​[Cancellable](../../actor/Cancellable.html "interface in akka.actor")> tick​(java.time.Duration initialDelay,
		                                                   java.time.Duration interval,
		                                                   O tick)
		```
		
		Elements are emitted periodically with the specified interval.
		 The tick element will be delivered to downstream consumers that has requested any elements.
		 If a consumer has not requested any elements at the point in time when the tick
		 element is produced it will not receive that tick element later. It will
		 receive new tick elements as soon as it has requested more elements.
		- #### single
		
		
		
		```
		public static <T> [Source](Source.html "class in akka.stream.javadsl")<T,​[NotUsed](../../NotUsed.html "class in akka")> single​(T element)
		```
		
		Create a `Source` with one element.
		 Every connected `Sink` of this stream will see an individual stream consisting of one element.
		- #### repeat
		
		
		
		```
		public static <T> [Source](Source.html "class in akka.stream.javadsl")<T,​[NotUsed](../../NotUsed.html "class in akka")> repeat​(T element)
		```
		
		Create a `Source` that will continually emit the given element.
		- #### unfold
		
		
		
		```
		public static <S,​E> [Source](Source.html "class in akka.stream.javadsl")<E,​[NotUsed](../../NotUsed.html "class in akka")> unfold​(S s,
		                                                         [Function](../../japi/function/Function.html "interface in akka.japi.function")<S,​java.util.Optional<[Pair](../../japi/Pair.html "class in akka.japi")<S,​E>>> f)
		```
		
		Create a `Source` that will unfold a value of type `S` into
		 a pair of the next state `S` and output elements of type `E`.
		- #### unfoldAsync
		
		
		
		```
		public static <S,​E> [Source](Source.html "class in akka.stream.javadsl")<E,​[NotUsed](../../NotUsed.html "class in akka")> unfoldAsync​(S s,
		                                                              [Function](../../japi/function/Function.html "interface in akka.japi.function")<S,​java.util.concurrent.CompletionStage<java.util.Optional<[Pair](../../japi/Pair.html "class in akka.japi")<S,​E>>>> f)
		```
		
		Same as [`<S,E>unfold(S,akka.japi.function.Function<S,java.util.Optional<akka.japi.Pair<S,E>>>)`](#unfold(S,akka.japi.function.Function)), but uses an async function to generate the next state\-element tuple.
		- #### failed
		
		
		
		```
		public static <T> [Source](Source.html "class in akka.stream.javadsl")<T,​[NotUsed](../../NotUsed.html "class in akka")> failed​(java.lang.Throwable cause)
		```
		
		Create a `Source` that immediately ends the stream with the `cause` failure to every connected `Sink`.
		- #### lazily
		
		
		
		```
		public static <T,​M> [Source](Source.html "class in akka.stream.javadsl")<T,​java.util.concurrent.CompletionStage<M>> lazily​([Creator](../../japi/function/Creator.html "interface in akka.japi.function")<[Source](Source.html "class in akka.stream.javadsl")<T,​M>> create)
		```
		
		Deprecated.
		Use 'Source.lazySource' instead. Since 2\.6\.0\.
		
		Creates a `Source` that is not materialized until there is downstream demand, when the source gets materialized
		 the materialized future is completed with its value, if downstream cancels or fails without any demand the
		 `create` factory is never called and the materialized `CompletionStage` is failed.
		- #### lazilyAsync
		
		
		
		```
		public static <T> [Source](Source.html "class in akka.stream.javadsl")<T,​scala.concurrent.Future<[NotUsed](../../NotUsed.html "class in akka")>> lazilyAsync​([Creator](../../japi/function/Creator.html "interface in akka.japi.function")<java.util.concurrent.CompletionStage<T>> create)
		```
		
		Deprecated.
		Use 'Source.lazyCompletionStage' instead. Since 2\.6\.0\.
		
		Creates a `Source` from supplied future factory that is not called until downstream demand. When source gets
		 materialized the materialized future is completed with the value from the factory. If downstream cancels or fails
		 without any demand the create factory is never called and the materialized `Future` is failed.
		 
		
		See Also:
		`Source.lazily`
		- #### future
		
		
		
		```
		public static <T> [Source](Source.html "class in akka.stream.javadsl")<T,​[NotUsed](../../NotUsed.html "class in akka")> future​(scala.concurrent.Future<T> futureElement)
		```
		
		Emits a single value when the given Scala `Future` is successfully completed and then completes the stream.
		 The stream fails if the `Future` is completed with a failure.
		 
		 Here for Java interoperability, the normal use from Java should be `Source.completionStage`
		- #### never
		
		
		
		```
		public static <T> [Source](Source.html "class in akka.stream.javadsl")<T,​[NotUsed](../../NotUsed.html "class in akka")> never()
		```
		
		Never emits any elements, never completes and never fails.
		 This stream could be useful in tests.
		- #### completionStage
		
		
		
		```
		public static <T> [Source](Source.html "class in akka.stream.javadsl")<T,​[NotUsed](../../NotUsed.html "class in akka")> completionStage​(java.util.concurrent.CompletionStage<T> completionStage)
		```
		
		Emits a single value when the given `CompletionStage` is successfully completed and then completes the stream.
		 If the `CompletionStage` is completed with a failure the stream is failed.
		- #### completionStageSource
		
		
		
		```
		public static <T,​M> [Source](Source.html "class in akka.stream.javadsl")<T,​java.util.concurrent.CompletionStage<M>> completionStageSource​(java.util.concurrent.CompletionStage<[Source](Source.html "class in akka.stream.javadsl")<T,​M>> completionStageSource)
		```
		
		Turn a `CompletionStage[Source]` into a source that will emit the values of the source when the future completes successfully.
		 If the `CompletionStage` is completed with a failure the stream is failed.
		- #### lazySingle
		
		
		
		```
		public static <T> [Source](Source.html "class in akka.stream.javadsl")<T,​[NotUsed](../../NotUsed.html "class in akka")> lazySingle​([Creator](../../japi/function/Creator.html "interface in akka.japi.function")<T> create)
		```
		
		Defers invoking the `create` function to create a single element until there is downstream demand.
		 
		 If the `create` function fails when invoked the stream is failed.
		 
		
		
		 Note that asynchronous boundaries (and other operators) in the stream may do pre\-fetching which counter acts
		 the laziness and will trigger the factory immediately.
		 
		
		
		 The materialized future `Done` value is completed when the `create` function has successfully been invoked,
		 if the function throws the future materialized value is failed with that exception.
		 If downstream cancels or fails before the function is invoked the materialized value
		 is failed with a [`NeverMaterializedException`](../NeverMaterializedException.html "class in akka.stream")
		- #### lazyCompletionStage
		
		
		
		```
		public static <T> [Source](Source.html "class in akka.stream.javadsl")<T,​[NotUsed](../../NotUsed.html "class in akka")> lazyCompletionStage​([Creator](../../japi/function/Creator.html "interface in akka.japi.function")<java.util.concurrent.CompletionStage<T>> create)
		```
		
		Defers invoking the `create` function to create a future element until there is downstream demand.
		 
		 The returned future element will be emitted downstream when it completes, or fail the stream if the future
		 is failed or the `create` function itself fails.
		 
		
		
		 Note that asynchronous boundaries (and other operators) in the stream may do pre\-fetching which counter acts
		 the laziness and will trigger the factory immediately.
		 
		
		
		 The materialized future `Done` value is completed when the `create` function has successfully been invoked and the future completes,
		 if the function throws or the future fails the future materialized value is failed with that exception.
		 If downstream cancels or fails before the function is invoked the materialized value
		 is failed with a [`NeverMaterializedException`](../NeverMaterializedException.html "class in akka.stream")
		- #### lazySource
		
		
		
		```
		public static <T,​M> [Source](Source.html "class in akka.stream.javadsl")<T,​java.util.concurrent.CompletionStage<M>> lazySource​([Creator](../../japi/function/Creator.html "interface in akka.japi.function")<[Source](Source.html "class in akka.stream.javadsl")<T,​M>> create)
		```
		
		Defers invoking the `create` function to create a future source until there is downstream demand.
		 
		 The returned source will emit downstream and behave just like it was the outer source. Downstream completes
		 when the created source completes and fails when the created source fails.
		 
		
		
		 Note that asynchronous boundaries (and other operators) in the stream may do pre\-fetching which counter acts
		 the laziness and will trigger the factory immediately.
		 
		
		
		 The materialized future value is completed with the materialized value of the created source when
		 it has been materialized. If the function throws or the source materialization fails the future materialized value
		 is failed with the thrown exception.
		 
		
		
		 If downstream cancels or fails before the function is invoked the materialized value
		 is failed with a [`NeverMaterializedException`](../NeverMaterializedException.html "class in akka.stream")
		- #### lazyCompletionStageSource
		
		
		
		```
		public static <T,​M> [Source](Source.html "class in akka.stream.javadsl")<T,​java.util.concurrent.CompletionStage<M>> lazyCompletionStageSource​([Creator](../../japi/function/Creator.html "interface in akka.japi.function")<java.util.concurrent.CompletionStage<[Source](Source.html "class in akka.stream.javadsl")<T,​M>>> create)
		```
		
		Defers invoking the `create` function to create a future source until there is downstream demand.
		 
		 The returned future source will emit downstream and behave just like it was the outer source when the `CompletionStage` completes
		 successfully. Downstream completes when the created source completes and fails when the created source fails.
		 If the `CompletionStage` or the `create` function fails the stream is failed.
		 
		
		
		 Note that asynchronous boundaries (and other operators) in the stream may do pre\-fetching which counter acts
		 the laziness and triggers the factory immediately.
		 
		
		
		 The materialized `CompletionStage` value is completed with the materialized value of the created source when
		 it has been materialized. If the function throws or the source materialization fails the future materialized value
		 is failed with the thrown exception.
		 
		
		
		 If downstream cancels or fails before the function is invoked the materialized value
		 is failed with a [`NeverMaterializedException`](../NeverMaterializedException.html "class in akka.stream")
		- #### asSubscriber
		
		
		
		```
		public static <T> [Source](Source.html "class in akka.stream.javadsl")<T,​org.reactivestreams.Subscriber<T>> asSubscriber()
		```
		
		Creates a `Source` that is materialized as a `Subscriber`
		- #### actorRef
		
		
		
		```
		public static <T> [Source](Source.html "class in akka.stream.javadsl")<T,​[ActorRef](../../actor/ActorRef.html "class in akka.actor")> actorRef​([Function](../../japi/function/Function.html "interface in akka.japi.function")<java.lang.Object,​java.util.Optional<[CompletionStrategy](../CompletionStrategy.html "interface in akka.stream")>> completionMatcher,
		                                                    [Function](../../japi/function/Function.html "interface in akka.japi.function")<java.lang.Object,​java.util.Optional<java.lang.Throwable>> failureMatcher,
		                                                    int bufferSize,
		                                                    [OverflowStrategy](../OverflowStrategy.html "class in akka.stream") overflowStrategy)
		```
		
		Creates a `Source` that is materialized as an [`ActorRef`](../../actor/ActorRef.html "class in akka.actor").
		 Messages sent to this actor will be emitted to the stream if there is demand from downstream,
		 otherwise they will be buffered until request for demand is received.
		 
		 Depending on the defined [`OverflowStrategy`](../OverflowStrategy.html "class in akka.stream") it might drop elements if
		 there is no space available in the buffer.
		 
		
		
		 The strategy `akka.stream.OverflowStrategy.backpressure` is not supported, and an
		 IllegalArgument("Backpressure overflowStrategy not supported") will be thrown if it is passed as argument.
		 
		
		
		 The buffer can be disabled by using `bufferSize` of 0 and then received messages are dropped if there is no demand
		 from downstream. When `bufferSize` is 0 the `overflowStrategy` does not matter.
		 
		
		
		 The stream can be completed successfully by sending the actor reference a message that is matched by
		 `completionMatcher` in which case already buffered elements will be signaled before signaling
		 completion.
		 
		
		
		 The stream can be completed with failure by sending a message that is matched by `failureMatcher`. The extracted
		 `Throwable` will be used to fail the stream. In case the Actor is still draining its internal buffer (after having received
		 a message matched by `completionMatcher`) before signaling completion and it receives a message matched by `failureMatcher`,
		 the failure will be signaled downstream immediately (instead of the completion signal).
		 
		
		
		 Note that terminating the actor without first completing it, either with a success or a
		 failure, will prevent the actor triggering downstream completion and the stream will continue
		 to run even though the source actor is dead. Therefore you should \*\*not\*\* attempt to
		 manually terminate the actor such as with a [`PoisonPill`](../../actor/PoisonPill.html "class in akka.actor").
		 
		
		
		 The actor will be stopped when the stream is completed, failed or canceled from downstream,
		 i.e. you can watch it to get notified when that happens.
		 
		
		
		 See also `akka.stream.scaladsl.Source.queue`.
		 
		
		
		
		Parameters:
		`completionMatcher` \- catches the completion message to end the stream
		`failureMatcher` \- catches the failure message to fail the stream
		`bufferSize` \- The size of the buffer in element count
		`overflowStrategy` \- Strategy that is used when incoming elements cannot fit inside the buffer
		- #### actorRef
		
		
		
		```
		public static <T> [Source](Source.html "class in akka.stream.javadsl")<T,​[ActorRef](../../actor/ActorRef.html "class in akka.actor")> actorRef​(int bufferSize,
		                                                    [OverflowStrategy](../OverflowStrategy.html "class in akka.stream") overflowStrategy)
		```
		
		Deprecated.
		Use variant accepting completion and failure matchers. Since 2\.6\.0\.
		
		Creates a `Source` that is materialized as an [`ActorRef`](../../actor/ActorRef.html "class in akka.actor").
		 Messages sent to this actor will be emitted to the stream if there is demand from downstream,
		 otherwise they will be buffered until request for demand is received.
		 
		 Depending on the defined [`OverflowStrategy`](../OverflowStrategy.html "class in akka.stream") it might drop elements if
		 there is no space available in the buffer.
		 
		
		
		 The strategy `akka.stream.OverflowStrategy.backpressure` is not supported, and an
		 IllegalArgument("Backpressure overflowStrategy not supported") will be thrown if it is passed as argument.
		 
		
		
		 The buffer can be disabled by using `bufferSize` of 0 and then received messages are dropped if there is no demand
		 from downstream. When `bufferSize` is 0 the `overflowStrategy` does not matter.
		 
		
		
		 The stream can be completed successfully by sending the actor reference a [`Status.Success`](../../actor/Status.Success.html "class in akka.actor")
		 (whose content will be ignored) in which case already buffered elements will be signaled before signaling
		 completion.
		 
		
		
		 The stream can be completed successfully by sending the actor reference a [`Status.Success`](../../actor/Status.Success.html "class in akka.actor").
		 If the content is `akka.stream.CompletionStrategy.immediately` the completion will be signaled immediately,
		 otherwise if the content is `akka.stream.CompletionStrategy.draining` (or anything else)
		 already buffered elements will be signaled before signaling completion.
		 Sending [`PoisonPill`](../../actor/PoisonPill.html "class in akka.actor") will signal completion immediately but this behavior is deprecated and scheduled to be removed.
		 
		
		
		 The stream can be completed with failure by sending a [`Status.Failure`](../../actor/Status.Failure.html "class in akka.actor") to the
		 actor reference. In case the Actor is still draining its internal buffer (after having received
		 a [`Status.Success`](../../actor/Status.Success.html "class in akka.actor")) before signaling completion and it receives a [`Status.Failure`](../../actor/Status.Failure.html "class in akka.actor"),
		 the failure will be signaled downstream immediately (instead of the completion signal).
		 
		
		
		 Note that terminating the actor without first completing it, either with a success or a
		 failure, will prevent the actor triggering downstream completion and the stream will continue
		 to run even though the source actor is dead. Therefore you should \*\*not\*\* attempt to
		 manually terminate the actor such as with a [`PoisonPill`](../../actor/PoisonPill.html "class in akka.actor").
		 
		
		
		 The actor will be stopped when the stream is completed, failed or canceled from downstream,
		 i.e. you can watch it to get notified when that happens.
		 
		
		
		 See also `akka.stream.javadsl.Source.queue`.
		 
		
		
		
		Parameters:
		`bufferSize` \- The size of the buffer in element count
		`overflowStrategy` \- Strategy that is used when incoming elements cannot fit inside the buffer
		- #### actorRefWithBackpressure
		
		
		
		```
		public static <T> [Source](Source.html "class in akka.stream.javadsl")<T,​[ActorRef](../../actor/ActorRef.html "class in akka.actor")> actorRefWithBackpressure​(java.lang.Object ackMessage,
		                                                                    [Function](../../japi/function/Function.html "interface in akka.japi.function")<java.lang.Object,​java.util.Optional<[CompletionStrategy](../CompletionStrategy.html "interface in akka.stream")>> completionMatcher,
		                                                                    [Function](../../japi/function/Function.html "interface in akka.japi.function")<java.lang.Object,​java.util.Optional<java.lang.Throwable>> failureMatcher)
		```
		
		Creates a `Source` that is materialized as an [`ActorRef`](../../actor/ActorRef.html "class in akka.actor").
		 Messages sent to this actor will be emitted to the stream if there is demand from downstream,
		 and a new message will only be accepted after the previous messages has been consumed and acknowledged back.
		 The stream will complete with failure if a message is sent before the acknowledgement has been replied back.
		 
		 The stream can be completed with failure by sending a message that is matched by `failureMatcher`. The extracted
		 `Throwable` will be used to fail the stream. In case the Actor is still draining its internal buffer (after having received
		 a message matched by `completionMatcher`) before signaling completion and it receives a message matched by `failureMatcher`,
		 the failure will be signaled downstream immediately (instead of the completion signal).
		 
		
		
		 The actor will be stopped when the stream is completed, failed or canceled from downstream,
		 i.e. you can watch it to get notified when that happens.
		- #### actorRefWithAck
		
		
		
		```
		public static <T> [Source](Source.html "class in akka.stream.javadsl")<T,​[ActorRef](../../actor/ActorRef.html "class in akka.actor")> actorRefWithAck​(java.lang.Object ackMessage,
		                                                           [Function](../../japi/function/Function.html "interface in akka.japi.function")<java.lang.Object,​java.util.Optional<[CompletionStrategy](../CompletionStrategy.html "interface in akka.stream")>> completionMatcher,
		                                                           [Function](../../japi/function/Function.html "interface in akka.japi.function")<java.lang.Object,​java.util.Optional<java.lang.Throwable>> failureMatcher)
		```
		
		Deprecated.
		Use actorRefWithBackpressure instead
		
		Creates a `Source` that is materialized as an [`ActorRef`](../../actor/ActorRef.html "class in akka.actor").
		 Messages sent to this actor will be emitted to the stream if there is demand from downstream,
		 and a new message will only be accepted after the previous messages has been consumed and acknowledged back.
		 The stream will complete with failure if a message is sent before the acknowledgement has been replied back.
		 
		 The stream can be completed with failure by sending a message that is matched by `failureMatcher`. The extracted
		 `Throwable` will be used to fail the stream. In case the Actor is still draining its internal buffer (after having received
		 a message matched by `completionMatcher`) before signaling completion and it receives a message matched by `failureMatcher`,
		 the failure will be signaled downstream immediately (instead of the completion signal).
		 
		
		
		 The actor will be stopped when the stream is completed, failed or canceled from downstream,
		 i.e. you can watch it to get notified when that happens.
		- #### actorRefWithAck
		
		
		
		```
		public static <T> [Source](Source.html "class in akka.stream.javadsl")<T,​[ActorRef](../../actor/ActorRef.html "class in akka.actor")> actorRefWithAck​(java.lang.Object ackMessage)
		```
		
		Deprecated.
		Use actorRefWithBackpressure accepting completion and failure matchers. Since 2\.6\.0\.
		
		Creates a `Source` that is materialized as an [`ActorRef`](../../actor/ActorRef.html "class in akka.actor").
		 Messages sent to this actor will be emitted to the stream if there is demand from downstream,
		 and a new message will only be accepted after the previous messages has been consumed and acknowledged back.
		 The stream will complete with failure if a message is sent before the acknowledgement has been replied back.
		 
		 The stream can be completed successfully by sending the actor reference a [`Status.Success`](../../actor/Status.Success.html "class in akka.actor").
		 If the content is `akka.stream.CompletionStrategy.immediately` the completion will be signaled immediately,
		 otherwise if the content is `akka.stream.CompletionStrategy.draining` (or anything else)
		 already buffered element will be signaled before signaling completion.
		 
		
		
		 The stream can be completed with failure by sending a [`Status.Failure`](../../actor/Status.Failure.html "class in akka.actor") to the
		 actor reference. In case the Actor is still draining its internal buffer (after having received
		 a [`Status.Success`](../../actor/Status.Success.html "class in akka.actor")) before signaling completion and it receives a [`Status.Failure`](../../actor/Status.Failure.html "class in akka.actor"),
		 the failure will be signaled downstream immediately (instead of the completion signal).
		 
		
		
		 The actor will be stopped when the stream is completed, failed or canceled from downstream,
		 i.e. you can watch it to get notified when that happens.
		- #### fromGraph
		
		
		
		```
		public static <T,​M> [Source](Source.html "class in akka.stream.javadsl")<T,​M> fromGraph​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<T>,​M> g)
		```
		
		A graph with the shape of a source logically is a source, this method makes
		 it so also in type.
		- #### fromMaterializer
		
		
		
		```
		public static <T,​M> [Source](Source.html "class in akka.stream.javadsl")<T,​java.util.concurrent.CompletionStage<M>> fromMaterializer​(java.util.function.BiFunction<[Materializer](../Materializer.html "class in akka.stream"),​[Attributes](../Attributes.html "class in akka.stream"),​[Source](Source.html "class in akka.stream.javadsl")<T,​M>> factory)
		```
		
		Defers the creation of a [`Source`](Source.html "class in akka.stream.javadsl") until materialization. The `factory` function
		 exposes `Materializer` which is going to be used during materialization and
		 `Attributes` of the [`Source`](Source.html "class in akka.stream.javadsl") returned by this method.
		- #### setup
		
		
		
		```
		public static <T,​M> [Source](Source.html "class in akka.stream.javadsl")<T,​java.util.concurrent.CompletionStage<M>> setup​(java.util.function.BiFunction<[ActorMaterializer](../ActorMaterializer.html "class in akka.stream"),​[Attributes](../Attributes.html "class in akka.stream"),​[Source](Source.html "class in akka.stream.javadsl")<T,​M>> factory)
		```
		
		Deprecated.
		Use 'fromMaterializer' instead. Since 2\.6\.0\.
		
		Defers the creation of a [`Source`](Source.html "class in akka.stream.javadsl") until materialization. The `factory` function
		 exposes `ActorMaterializer` which is going to be used during materialization and
		 `Attributes` of the [`Source`](Source.html "class in akka.stream.javadsl") returned by this method.
		- #### combine
		
		
		
		```
		public static <T,​U> [Source](Source.html "class in akka.stream.javadsl")<U,​[NotUsed](../../NotUsed.html "class in akka")> combine​([Source](Source.html "class in akka.stream.javadsl")<T,​?> first,
		                                                          [Source](Source.html "class in akka.stream.javadsl")<T,​?> second,
		                                                          java.util.List<[Source](Source.html "class in akka.stream.javadsl")<T,​?>> rest,
		                                                          [Function](../../japi/function/Function.html "interface in akka.japi.function")<java.lang.Integer,​? extends [Graph](../Graph.html "interface in akka.stream")<[UniformFanInShape](../UniformFanInShape.html "class in akka.stream")<T,​U>,​[NotUsed](../../NotUsed.html "class in akka")>> fanInStrategy)
		```
		
		Combines several sources with fan\-in strategy like [`Merge`](Merge.html "class in akka.stream.javadsl") or [`Concat`](Concat.html "class in akka.stream.javadsl") into a single [`Source`](Source.html "class in akka.stream.javadsl").
		- #### combineMat
		
		
		
		```
		public static <T,​U,​M1,​M2,​M> [Source](Source.html "class in akka.stream.javadsl")<U,​M> combineMat​([Source](Source.html "class in akka.stream.javadsl")<T,​M1> first,
		                                                                                 [Source](Source.html "class in akka.stream.javadsl")<T,​M2> second,
		                                                                                 [Function](../../japi/function/Function.html "interface in akka.japi.function")<java.lang.Integer,​? extends [Graph](../Graph.html "interface in akka.stream")<[UniformFanInShape](../UniformFanInShape.html "class in akka.stream")<T,​U>,​[NotUsed](../../NotUsed.html "class in akka")>> fanInStrategy,
		                                                                                 [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<M1,​M2,​M> matF)
		```
		
		Combines two sources with fan\-in strategy like `Merge` or `Concat` and returns `Source` with a materialized value.
		- #### combine
		
		
		
		```
		public static <T,​U,​M> [Source](Source.html "class in akka.stream.javadsl")<U,​java.util.List<M>> combine​(java.util.List<? extends [Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<T>,​M>> sources,
		                                                                            [Function](../../japi/function/Function.html "interface in akka.japi.function")<java.lang.Integer,​[Graph](../Graph.html "interface in akka.stream")<[UniformFanInShape](../UniformFanInShape.html "class in akka.stream")<T,​U>,​[NotUsed](../../NotUsed.html "class in akka")>> fanInStrategy)
		```
		
		Combines several sources with fan\-in strategy like [`Merge`](Merge.html "class in akka.stream.javadsl") or [`Concat`](Concat.html "class in akka.stream.javadsl") into a single [`Source`](Source.html "class in akka.stream.javadsl").
		- #### zipN
		
		
		
		```
		public static <T> [Source](Source.html "class in akka.stream.javadsl")<java.util.List<T>,​[NotUsed](../../NotUsed.html "class in akka")> zipN​(java.util.List<[Source](Source.html "class in akka.stream.javadsl")<T,​?>> sources)
		```
		
		Combine the elements of multiple streams into a stream of lists.
		- #### zipWithN
		
		
		
		```
		public static <T,​O> [Source](Source.html "class in akka.stream.javadsl")<O,​[NotUsed](../../NotUsed.html "class in akka")> zipWithN​([Function](../../japi/function/Function.html "interface in akka.japi.function")<java.util.List<T>,​O> zipper,
		                                                           java.util.List<[Source](Source.html "class in akka.stream.javadsl")<T,​?>> sources)
		```
		- #### queue
		
		
		
		```
		public static <T> [Source](Source.html "class in akka.stream.javadsl")<T,​[BoundedSourceQueue](../BoundedSourceQueue.html "interface in akka.stream")<T>> queue​(int bufferSize)
		```
		
		Creates a `Source` that is materialized as an [`BoundedSourceQueue`](../BoundedSourceQueue.html "interface in akka.stream").
		 You can push elements to the queue and they will be emitted to the stream if there is demand from downstream,
		 otherwise they will be buffered until request for demand is received. The buffer size is passed in as a parameter.
		 Elements in the buffer will be discarded if downstream is terminated.
		 
		 Pushed elements may be dropped if there is no space available in the buffer. Elements will also be dropped if the
		 queue is failed through the materialized `BoundedQueueSource` or the `Source` is cancelled by the downstream.
		 An element that was reported to be `enqueued` is not guaranteed to be processed by the rest of the stream. If the
		 queue is failed by calling `BoundedQueueSource.fail` or the downstream cancels the stream, elements in the buffer
		 are discarded.
		 
		
		
		 Acknowledgement of pushed elements is immediate.
		 `akka.stream.BoundedSourceQueue.offer` returns [`QueueOfferResult`](../QueueOfferResult.html "class in akka.stream") which is implemented as:
		 
		
		
		`QueueOfferResult.enqueued()` element was added to buffer, but may still be discarded later when the queue is
		 failed or cancelled
		 `QueueOfferResult.dropped()` element was dropped
		 `QueueOfferResult.QueueClosed` the queue was completed with `akka.stream.BoundedSourceQueue.complete`
		`QueueOfferResult.Failure` the queue was failed with `akka.stream.BoundedSourceQueue.fail` or if the
		 stream failed
		 
		
		
		
		Parameters:
		`bufferSize` \- size of the buffer in number of elements
		- #### queue
		
		
		
		```
		public static <T> [Source](Source.html "class in akka.stream.javadsl")<T,​[SourceQueueWithComplete](SourceQueueWithComplete.html "interface in akka.stream.javadsl")<T>> queue​(int bufferSize,
		                                                                   [OverflowStrategy](../OverflowStrategy.html "class in akka.stream") overflowStrategy)
		```
		
		Creates a `Source` that is materialized as an [`SourceQueueWithComplete`](SourceQueueWithComplete.html "interface in akka.stream.javadsl").
		 You can push elements to the queue and they will be emitted to the stream if there is demand from downstream,
		 otherwise they will be buffered until request for demand is received. Elements in the buffer will be discarded
		 if downstream is terminated.
		 
		 Depending on the defined [`OverflowStrategy`](../OverflowStrategy.html "class in akka.stream") it might drop elements if
		 there is no space available in the buffer.
		 
		
		
		 Acknowledgement mechanism is available.
		 `akka.stream.javadsl.SourceQueueWithComplete.offer` returns `CompletionStage` which completes with
		 `QueueOfferResult.enqueued()` if element was added to buffer or sent downstream. It completes with
		 `QueueOfferResult.dropped()` if element was dropped. Can also complete with `QueueOfferResult.Failure` \-
		 when stream failed or `QueueOfferResult.QueueClosed` when downstream is completed.
		 
		
		
		 The strategy `akka.stream.OverflowStrategy.backpressure` will not complete last `offer():CompletionStage`
		 call when buffer is full.
		 
		
		
		 Instead of using the strategy `akka.stream.OverflowStrategy.dropNew` it's recommended to use
		 `Source.queue(bufferSize)` instead which returns a `QueueOfferResult` synchronously.
		 
		
		
		 You can watch accessibility of stream with `akka.stream.javadsl.SourceQueueWithComplete.watchCompletion`.
		 It returns a future that completes with success when this operator is completed or fails when stream is failed.
		 
		
		
		 The buffer can be disabled by using `bufferSize` of 0 and then received message will wait
		 for downstream demand unless there is another message waiting for downstream demand, in that case
		 offer result will be completed according to the overflow strategy.
		 
		
		
		 The materialized SourceQueue may only be used from a single producer.
		 
		
		
		
		Parameters:
		`bufferSize` \- size of buffer in element count
		`overflowStrategy` \- Strategy that is used when incoming elements cannot fit inside the buffer
		- #### queue
		
		
		
		```
		public static <T> [Source](Source.html "class in akka.stream.javadsl")<T,​[SourceQueueWithComplete](SourceQueueWithComplete.html "interface in akka.stream.javadsl")<T>> queue​(int bufferSize,
		                                                                   [OverflowStrategy](../OverflowStrategy.html "class in akka.stream") overflowStrategy,
		                                                                   int maxConcurrentOffers)
		```
		
		Creates a `Source` that is materialized as an [`SourceQueueWithComplete`](SourceQueueWithComplete.html "interface in akka.stream.javadsl").
		 You can push elements to the queue and they will be emitted to the stream if there is demand from downstream,
		 otherwise they will be buffered until request for demand is received. Elements in the buffer will be discarded
		 if downstream is terminated.
		 
		 Depending on the defined [`OverflowStrategy`](../OverflowStrategy.html "class in akka.stream") it might drop elements if
		 there is no space available in the buffer.
		 
		
		
		 Acknowledgement mechanism is available.
		 `akka.stream.javadsl.SourceQueueWithComplete.offer` returns `CompletionStage` which completes with
		 `QueueOfferResult.enqueued()` if element was added to buffer or sent downstream. It completes with
		 `QueueOfferResult.dropped()` if element was dropped. Can also complete with `QueueOfferResult.Failure` \-
		 when stream failed or `QueueOfferResult.QueueClosed` when downstream is completed.
		 
		
		
		 The strategy `akka.stream.OverflowStrategy.backpressure` will not complete `maxConcurrentOffers` number of
		 `offer():CompletionStage` call when buffer is full.
		 
		
		
		 Instead of using the strategy `akka.stream.OverflowStrategy.dropNew` it's recommended to use
		 `Source.queue(bufferSize)` instead which returns a `QueueOfferResult` synchronously.
		 
		
		
		 You can watch accessibility of stream with `akka.stream.javadsl.SourceQueueWithComplete.watchCompletion`.
		 It returns a future that completes with success when this operator is completed or fails when stream is failed.
		 
		
		
		 The buffer can be disabled by using `bufferSize` of 0 and then received message will wait
		 for downstream demand unless there is another message waiting for downstream demand, in that case
		 offer result will be completed according to the overflow strategy.
		 
		
		
		 The materialized SourceQueue may be used by up to maxConcurrentOffers concurrent producers.
		 
		
		
		
		Parameters:
		`bufferSize` \- size of buffer in element count
		`overflowStrategy` \- Strategy that is used when incoming elements cannot fit inside the buffer
		`maxConcurrentOffers` \- maximum number of pending offers when buffer is full, should be greater than 0, not
		 applicable when `OverflowStrategy.dropNew` is used
		- #### unfoldResource
		
		
		
		```
		public static <T,​S> [Source](Source.html "class in akka.stream.javadsl")<T,​[NotUsed](../../NotUsed.html "class in akka")> unfoldResource​([Creator](../../japi/function/Creator.html "interface in akka.japi.function")<S> create,
		                                                                 [Function](../../japi/function/Function.html "interface in akka.japi.function")<S,​java.util.Optional<T>> read,
		                                                                 [Procedure](../../japi/function/Procedure.html "interface in akka.japi.function")<S> close)
		```
		
		Start a new `Source` from some resource which can be opened, read and closed.
		 Interaction with resource happens in a blocking way.
		 
		 Example:
		 
		
		
		```
		
		 Source.unfoldResource(
		   () -> new BufferedReader(new FileReader("...")),
		   reader -> reader.readLine(),
		   reader -> reader.close())
		 
		```
		
		
		 You can use the supervision strategy to handle exceptions for `read` function. All exceptions thrown by `create`
		 or `close` will fail the stream.
		 
		
		
		`Restart` supervision strategy will close and create blocking IO again. Default strategy is `Stop` which means
		 that stream will be terminated on error in `read` function by default.
		 
		
		
		 You can configure the default dispatcher for this Source by changing the `akka.stream.materializer.blocking-io-dispatcher` or
		 set it for a given Source by using `ActorAttributes`.
		 
		
		
		 Adheres to the `ActorAttributes.SupervisionStrategy` attribute.
		 
		
		
		
		Parameters:
		`create` \- \- function that is called on stream start and creates/opens resource.
		`read` \- \- function that reads data from opened resource. It is called each time backpressure signal
		 is received. Stream calls close and completes when `read` returns an empty Optional.
		`close` \- \- function that closes resource
		- #### unfoldResourceAsync
		
		
		
		```
		public static <T,​S> [Source](Source.html "class in akka.stream.javadsl")<T,​[NotUsed](../../NotUsed.html "class in akka")> unfoldResourceAsync​([Creator](../../japi/function/Creator.html "interface in akka.japi.function")<java.util.concurrent.CompletionStage<S>> create,
		                                                                      [Function](../../japi/function/Function.html "interface in akka.japi.function")<S,​java.util.concurrent.CompletionStage<java.util.Optional<T>>> read,
		                                                                      [Function](../../japi/function/Function.html "interface in akka.japi.function")<S,​java.util.concurrent.CompletionStage<[Done](../../Done.html "class in akka")>> close)
		```
		
		Start a new `Source` from some resource which can be opened, read and closed.
		 It's similar to `unfoldResource` but takes functions that return `CompletionStage` instead of plain values.
		 
		 You can use the supervision strategy to handle exceptions for `read` function or failures of produced `Futures`.
		 All exceptions thrown by `create` or `close` as well as fails of returned futures will fail the stream.
		 
		
		
		`Restart` supervision strategy will close and create resource. Default strategy is `Stop` which means
		 that stream will be terminated on error in `read` function (or future) by default.
		 
		
		
		 You can configure the default dispatcher for this Source by changing the `akka.stream.materializer.blocking-io-dispatcher` or
		 set it for a given Source by using `ActorAttributes`.
		 
		
		
		 Adheres to the `ActorAttributes.SupervisionStrategy` attribute.
		 
		
		
		
		Parameters:
		`create` \- \- function that is called on stream start and creates/opens resource.
		`read` \- \- function that reads data from opened resource. It is called each time backpressure signal
		 is received. Stream calls close and completes when `CompletionStage` from read function returns an empty Optional.
		`close` \- \- function that closes resource
		- #### upcast
		
		
		
		```
		public static <SuperOut,​Out extends SuperOut,​Mat> [Source](Source.html "class in akka.stream.javadsl")<SuperOut,​Mat> upcast​([Source](Source.html "class in akka.stream.javadsl")<Out,​Mat> source)
		```
		
		Upcast a stream of elements to a stream of supertypes of that element. Useful in combination with
		 fan\-in operators where you do not want to pay the cost of casting each element in a `map`.
		 
		 Example:
		 
		
		
		
		
		
		```
		
		 Source<Apple, NotUsed> apples = Source.single(new Apple());
		 Source<Orange, NotUsed> oranges = Source.single(new Orange());
		 Source<Fruit, NotUsed> appleFruits = Source.upcast(apples);
		 Source<Fruit, NotUsed> orangeFruits = Source.upcast(oranges);
		
		 Source<Fruit, NotUsed> fruits = appleFruits.merge(orangeFruits);
		 
		```
		
		
		
		Returns:
		A source with the supertype as elements
		- #### mergePrioritizedN
		
		
		
		```
		public static <T> [Source](Source.html "class in akka.stream.javadsl")<T,​[NotUsed](../../NotUsed.html "class in akka")> mergePrioritizedN​(java.util.List<[Pair](../../japi/Pair.html "class in akka.japi")<[Source](Source.html "class in akka.stream.javadsl")<T,​?>,​java.lang.Integer>> sourcesAndPriorities,
		                                                            boolean eagerComplete)
		```
		
		Merge multiple [`Source`](Source.html "class in akka.stream.javadsl")s. Prefer the sources depending on the 'priority' parameters.
		 The provided sources and priorities must have the same size and order.
		 
		 '''emits''' when one of the inputs has an element available, preferring inputs based on the 'priority' parameters if both have elements available
		 
		
		
		 '''backpressures''' when downstream backpressures
		 
		
		
		 '''completes''' when both upstreams complete (This behavior is changeable to completing when any upstream completes by setting `eagerComplete=true`.)
		 
		
		
		 '''Cancels when''' downstream cancels
		- #### concatAllLazy
		
		
		
		```
		public [Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")> concatAllLazy​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<[Out](Source.html "type parameter in Source")>,​?>... those)
		```
		
		Concatenate the given [`Source`](Source.html "class in akka.stream.javadsl")s to this one, meaning that once this
		 Flow\&rsquo;s input is exhausted and all result elements have been generated,
		 the Source\&rsquo;s elements will be produced.
		 
		 Note that the [`Source`](Source.html "class in akka.stream.javadsl")s are materialized together with this Flow. If `lazy` materialization is what is needed
		 the operator can be combined with for example `Source.lazySource` to defer materialization of `that` until the
		 time when this source completes.
		 
		
		
		 The second source is then kept from producing elements by asserting back\-pressure until its time comes.
		 
		
		
		 For a concat operator that is detached, use [`concat(akka.stream.Graph<akka.stream.SourceShape<Out>, M>)`](#concat(akka.stream.Graph))
		
		
		
		 If this [`Source`](Source.html "class in akka.stream.javadsl") gets upstream error \- no elements from the given [`Source`](Source.html "class in akka.stream.javadsl")s will be pulled.
		 
		
		
		 '''Emits when''' element is available from current stream or from the given [`Source`](Source.html "class in akka.stream.javadsl")s when current is completed
		 
		
		
		 '''Backpressures when''' downstream backpressures
		 
		
		
		 '''Completes when''' all the given [`Source`](Source.html "class in akka.stream.javadsl")s completes
		 
		
		
		 '''Cancels when''' downstream cancels
		- #### alsoToAll
		
		
		
		```
		public [Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")> alsoToAll​([Graph](../Graph.html "interface in akka.stream")<[SinkShape](../SinkShape.html "class in akka.stream")<[Out](Source.html "type parameter in Source")>,​?>... those)
		```
		
		Attaches the given [`Sink`](Sink.html "class in akka.stream.javadsl")s to this [`Source`](Source.html "class in akka.stream.javadsl"), meaning that elements that passes
		 through will also be sent to all those [`Sink`](Sink.html "class in akka.stream.javadsl")s.
		 
		 It is similar to [`wireTap(akka.stream.Graph<akka.stream.SinkShape<Out>, ?>)`](#wireTap(akka.stream.Graph)) but will backpressure instead of dropping elements when the given [`Sink`](Sink.html "class in akka.stream.javadsl")s is not ready.
		 
		
		
		 '''Emits when''' element is available and demand exists both from the Sinks and the downstream.
		 
		
		
		 '''Backpressures when''' downstream or any of the [`Sink`](Sink.html "class in akka.stream.javadsl")s backpressures
		 
		
		
		 '''Completes when''' upstream completes
		 
		
		
		 '''Cancels when''' downstream or any of the [`Sink`](Sink.html "class in akka.stream.javadsl")s cancels
		- #### shape
		
		
		
		```
		public [SourceShape](../SourceShape.html "class in akka.stream")<[Out](Source.html "type parameter in Source")> shape()
		```
		
		Description copied from interface: `[Graph](../Graph.html#shape())`
		The shape of a graph is all that is externally visible: its inlets and outlets.
		
		Specified by:
		`[shape](../Graph.html#shape())` in interface `[Graph](../Graph.html "interface in akka.stream")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")>`
		- #### traversalBuilder
		
		
		
		```
		public akka.stream.impl.LinearTraversalBuilder traversalBuilder()
		```
		
		Description copied from interface: `[Graph](../Graph.html#traversalBuilder())`
		INTERNAL API.
		 
		 Every materializable element must be backed by a stream layout module
		
		
		
		Specified by:
		`[traversalBuilder](../Graph.html#traversalBuilder())` in interface `[Graph](../Graph.html "interface in akka.stream")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")>`
		- #### toString
		
		
		
		```
		public java.lang.String toString()
		```
		
		
		Overrides:
		`toString` in class `java.lang.Object`
		- #### asScala
		
		
		
		```
		public [Source](../scaladsl/Source.html "class in akka.stream.scaladsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")> asScala()
		```
		
		Converts this Java DSL element to its Scala DSL counterpart.
		- #### mapMaterializedValue
		
		
		
		```
		public <Mat2> [Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​Mat2> mapMaterializedValue​([Function](../../japi/function/Function.html "interface in akka.japi.function")<[Mat](Source.html "type parameter in Source"),​Mat2> f)
		```
		
		Transform only the materialized value of this Source, leaving all other properties as they were.
		- #### preMaterialize
		
		
		
		```
		public [Pair](../../japi/Pair.html "class in akka.japi")<[Mat](Source.html "type parameter in Source"),​[Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​[NotUsed](../../NotUsed.html "class in akka")>> preMaterialize​([ClassicActorSystemProvider](../../actor/ClassicActorSystemProvider.html "interface in akka.actor") systemProvider)
		```
		
		Materializes this Source, immediately returning (1\) its materialized value, and (2\) a new Source
		 that can be used to consume elements from the newly materialized Source.
		 
		 Note that the `ActorSystem` can be used as the `systemProvider` parameter.
		 
		
		
		 Note that `preMaterialize` is implemented through a reactive streams `Publisher` which means that
		 a buffer is introduced and that errors are not propagated upstream but are turned into cancellations without error details.
		- #### preMaterialize
		
		
		
		```
		public [Pair](../../japi/Pair.html "class in akka.japi")<[Mat](Source.html "type parameter in Source"),​[Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​[NotUsed](../../NotUsed.html "class in akka")>> preMaterialize​([Materializer](../Materializer.html "class in akka.stream") materializer)
		```
		
		Materializes this Source, immediately returning (1\) its materialized value, and (2\) a new Source
		 that can be used to consume elements from the newly materialized Source.
		 
		 Prefer the method taking an `ActorSystem` unless you have special requirements.
		- #### via
		
		
		
		```
		public <T,​M> [Source](Source.html "class in akka.stream.javadsl")<T,​[Mat](Source.html "type parameter in Source")> via​([Graph](../Graph.html "interface in akka.stream")<[FlowShape](../FlowShape.html "class in akka.stream")<[Out](Source.html "type parameter in Source"),​T>,​M> flow)
		```
		
		Transform this [`Source`](Source.html "class in akka.stream.javadsl") by appending the given processing operators.
		 
		```
		
		     +----------------------------+
		     | Resulting Source           |
		     |                            |
		     |  +------+        +------+  |
		     |  |      |        |      |  |
		     |  | this | ~Out~> | flow | ~~> T
		     |  |      |        |      |  |
		     |  +------+        +------+  |
		     +----------------------------+
		 
		```
		
		 The materialized value of the combined [`Flow`](Flow.html "class in akka.stream.javadsl") will be the materialized
		 value of the current flow (ignoring the other Flow\&rsquo;s value), use
		 `viaMat` if a different strategy is needed.
		- #### viaMat
		
		
		
		```
		public <T,​M,​M2> [Source](Source.html "class in akka.stream.javadsl")<T,​M2> viaMat​([Graph](../Graph.html "interface in akka.stream")<[FlowShape](../FlowShape.html "class in akka.stream")<[Out](Source.html "type parameter in Source"),​T>,​M> flow,
		                                                      [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<[Mat](Source.html "type parameter in Source"),​M,​M2> combine)
		```
		
		Transform this [`Source`](Source.html "class in akka.stream.javadsl") by appending the given processing operators.
		 
		```
		
		     +----------------------------+
		     | Resulting Source           |
		     |                            |
		     |  +------+        +------+  |
		     |  |      |        |      |  |
		     |  | this | ~Out~> | flow | ~~> T
		     |  |      |        |      |  |
		     |  +------+        +------+  |
		     +----------------------------+
		 
		```
		
		 The `combine` function is used to compose the materialized values of this flow and that
		 flow into the materialized value of the resulting Flow.
		 
		 It is recommended to use the internally optimized `Keep.left` and `Keep.right` combiners
		 where appropriate instead of manually writing functions that pass through one of the values.
		- #### to
		
		
		
		```
		public <M> [RunnableGraph](RunnableGraph.html "class in akka.stream.javadsl")<[Mat](Source.html "type parameter in Source")> to​([Graph](../Graph.html "interface in akka.stream")<[SinkShape](../SinkShape.html "class in akka.stream")<[Out](Source.html "type parameter in Source")>,​M> sink)
		```
		
		Connect this [`Source`](Source.html "class in akka.stream.javadsl") to a [`Sink`](Sink.html "class in akka.stream.javadsl"), concatenating the processing steps of both.
		 
		```
		
		     +----------------------------+
		     | Resulting RunnableGraph    |
		     |                            |
		     |  +------+        +------+  |
		     |  |      |        |      |  |
		     |  | this | ~Out~> | sink |  |
		     |  |      |        |      |  |
		     |  +------+        +------+  |
		     +----------------------------+
		 
		```
		
		 The materialized value of the combined [`Sink`](Sink.html "class in akka.stream.javadsl") will be the materialized
		 value of the current flow (ignoring the given Sink\&rsquo;s value), use
		 `toMat` if a different strategy is needed.
		- #### toMat
		
		
		
		```
		public <M,​M2> [RunnableGraph](RunnableGraph.html "class in akka.stream.javadsl")<M2> toMat​([Graph](../Graph.html "interface in akka.stream")<[SinkShape](../SinkShape.html "class in akka.stream")<[Out](Source.html "type parameter in Source")>,​M> sink,
		                                            [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<[Mat](Source.html "type parameter in Source"),​M,​M2> combine)
		```
		
		Connect this [`Source`](Source.html "class in akka.stream.javadsl") to a [`Sink`](Sink.html "class in akka.stream.javadsl"), concatenating the processing steps of both.
		 
		```
		
		     +----------------------------+
		     | Resulting RunnableGraph    |
		     |                            |
		     |  +------+        +------+  |
		     |  |      |        |      |  |
		     |  | this | ~Out~> | sink |  |
		     |  |      |        |      |  |
		     |  +------+        +------+  |
		     +----------------------------+
		 
		```
		
		 The `combine` function is used to compose the materialized values of this flow and that
		 Sink into the materialized value of the resulting Sink.
		 
		 It is recommended to use the internally optimized `Keep.left` and `Keep.right` combiners
		 where appropriate instead of manually writing functions that pass through one of the values.
		- #### run
		
		
		
		```
		public java.util.concurrent.CompletionStage<[Done](../../Done.html "class in akka")> run​([Materializer](../Materializer.html "class in akka.stream") materializer)
		```
		
		Connect this `Source` to the `Sink.ignore` and run it. Elements from the stream will be consumed and discarded.
		 
		 Note that the `ActorSystem` can be used as the `materializer` parameter to use the
		 [`SystemMaterializer`](../SystemMaterializer.html "class in akka.stream") for running the stream.
		- #### run
		
		
		
		```
		public java.util.concurrent.CompletionStage<[Done](../../Done.html "class in akka")> run​([ClassicActorSystemProvider](../../actor/ClassicActorSystemProvider.html "interface in akka.actor") systemProvider)
		```
		
		Connect this `Source` to the `Sink.ignore` and run it. Elements from the stream will be consumed and discarded.
		 
		 Note that the `ActorSystem` can be used as the `systemProvider` parameter to use the
		 [`SystemMaterializer`](../SystemMaterializer.html "class in akka.stream") for running the stream.
		- #### runWith
		
		
		
		```
		public <M> M runWith​([Graph](../Graph.html "interface in akka.stream")<[SinkShape](../SinkShape.html "class in akka.stream")<[Out](Source.html "type parameter in Source")>,​M> sink,
		                     [ClassicActorSystemProvider](../../actor/ClassicActorSystemProvider.html "interface in akka.actor") systemProvider)
		```
		
		Connect this `Source` to a `Sink` and run it. The returned value is the materialized value
		 of the `Sink`, e.g. the `Publisher` of a `Sink.asPublisher`.
		 
		 Note that the classic or typed `ActorSystem` can be used as the `systemProvider` parameter.
		- #### runWith
		
		
		
		```
		public <M> M runWith​([Graph](../Graph.html "interface in akka.stream")<[SinkShape](../SinkShape.html "class in akka.stream")<[Out](Source.html "type parameter in Source")>,​M> sink,
		                     [Materializer](../Materializer.html "class in akka.stream") materializer)
		```
		
		Connect this `Source` to a `Sink` and run it. The returned value is the materialized value
		 of the `Sink`, e.g. the `Publisher` of a `Sink.asPublisher`.
		 
		 Prefer the method taking an `ActorSystem` unless you have special requirements
		- #### runFold
		
		
		
		```
		public <U> java.util.concurrent.CompletionStage<U> runFold​(U zero,
		                                                           [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<U,​[Out](Source.html "type parameter in Source"),​U> f,
		                                                           [ClassicActorSystemProvider](../../actor/ClassicActorSystemProvider.html "interface in akka.actor") systemProvider)
		```
		
		Shortcut for running this `Source` with a fold function.
		 The given function is invoked for every received element, giving it its previous
		 output (or the given `zero` value) and the element as input.
		 The returned `CompletionStage` will be completed with value of the final
		 function evaluation when the input stream ends, or completed with `Failure`
		 if there is a failure is signaled in the stream.
		 
		 Note that the classic or typed `ActorSystem` can be used as the `systemProvider` parameter.
		- #### runFold
		
		
		
		```
		public <U> java.util.concurrent.CompletionStage<U> runFold​(U zero,
		                                                           [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<U,​[Out](Source.html "type parameter in Source"),​U> f,
		                                                           [Materializer](../Materializer.html "class in akka.stream") materializer)
		```
		
		Shortcut for running this `Source` with a fold function.
		 The given function is invoked for every received element, giving it its previous
		 output (or the given `zero` value) and the element as input.
		 The returned `CompletionStage` will be completed with value of the final
		 function evaluation when the input stream ends, or completed with `Failure`
		 if there is a failure is signaled in the stream.
		 
		 Prefer the method taking an ActorSystem unless you have special requirements.
		- #### runFoldAsync
		
		
		
		```
		public <U> java.util.concurrent.CompletionStage<U> runFoldAsync​(U zero,
		                                                                [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<U,​[Out](Source.html "type parameter in Source"),​java.util.concurrent.CompletionStage<U>> f,
		                                                                [ClassicActorSystemProvider](../../actor/ClassicActorSystemProvider.html "interface in akka.actor") systemProvider)
		```
		
		Shortcut for running this `Source` with an asynchronous fold function.
		 The given function is invoked for every received element, giving it its previous
		 output (or the given `zero` value) and the element as input.
		 The returned `CompletionStage` will be completed with value of the final
		 function evaluation when the input stream ends, or completed with `Failure`
		 if there is a failure is signaled in the stream.
		 
		 Note that the classic or typed `ActorSystem` can be used as the `systemProvider` parameter.
		- #### runFoldAsync
		
		
		
		```
		public <U> java.util.concurrent.CompletionStage<U> runFoldAsync​(U zero,
		                                                                [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<U,​[Out](Source.html "type parameter in Source"),​java.util.concurrent.CompletionStage<U>> f,
		                                                                [Materializer](../Materializer.html "class in akka.stream") materializer)
		```
		
		Shortcut for running this `Source` with an asynchronous fold function.
		 The given function is invoked for every received element, giving it its previous
		 output (or the given `zero` value) and the element as input.
		 The returned `CompletionStage` will be completed with value of the final
		 function evaluation when the input stream ends, or completed with `Failure`
		 if there is a failure is signaled in the stream.
		 
		 Prefer the method taking an `ActorSystem` unless you have special requirements
		- #### runReduce
		
		
		
		```
		public java.util.concurrent.CompletionStage<[Out](Source.html "type parameter in Source")> runReduce​([Function2](../../japi/function/Function2.html "interface in akka.japi.function")<[Out](Source.html "type parameter in Source"),​[Out](Source.html "type parameter in Source"),​[Out](Source.html "type parameter in Source")> f,
		                                                           [ClassicActorSystemProvider](../../actor/ClassicActorSystemProvider.html "interface in akka.actor") systemProvider)
		```
		
		Shortcut for running this `Source` with a reduce function.
		 The given function is invoked for every received element, giving it its previous
		 output (from the second ones) an the element as input.
		 The returned `CompletionStage` will be completed with value of the final
		 function evaluation when the input stream ends, or completed with `Failure`
		 if there is a failure is signaled in the stream.
		 
		 If the stream is empty (i.e. completes before signalling any elements),
		 the reduce operator will fail its downstream with a `NoSuchElementException`,
		 which is semantically in\-line with that Scala's standard library collections
		 do in such situations.
		 
		
		
		 Note that the classic or typed `ActorSystem` can be used as the `systemProvider` parameter.
		- #### runReduce
		
		
		
		```
		public java.util.concurrent.CompletionStage<[Out](Source.html "type parameter in Source")> runReduce​([Function2](../../japi/function/Function2.html "interface in akka.japi.function")<[Out](Source.html "type parameter in Source"),​[Out](Source.html "type parameter in Source"),​[Out](Source.html "type parameter in Source")> f,
		                                                           [Materializer](../Materializer.html "class in akka.stream") materializer)
		```
		
		Shortcut for running this `Source` with a reduce function.
		 The given function is invoked for every received element, giving it its previous
		 output (from the second ones) an the element as input.
		 The returned `CompletionStage` will be completed with value of the final
		 function evaluation when the input stream ends, or completed with `Failure`
		 if there is a failure is signaled in the stream.
		 
		 If the stream is empty (i.e. completes before signalling any elements),
		 the reduce operator will fail its downstream with a `NoSuchElementException`,
		 which is semantically in\-line with that Scala's standard library collections
		 do in such situations.
		 
		
		
		 Prefer the method taking an `ActorSystem` unless you have special requirements
		- #### concat
		
		
		
		```
		public <M> [Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")> concat​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<[Out](Source.html "type parameter in Source")>,​M> that)
		```
		
		Concatenate this [`Source`](Source.html "class in akka.stream.javadsl") with the given one, meaning that once current
		 is exhausted and all result elements have been generated,
		 the given source elements will be produced.
		 
		 Note that the [`Source`](Source.html "class in akka.stream.javadsl") is materialized together with this Flow and is "detached" meaning it will
		 in effect behave as a one element buffer in front of both the sources, that eagerly demands an element on start
		 (so it can not be combined with `Source.lazy` to defer materialization of `that`).
		 
		
		
		 The second source is then kept from producing elements by asserting back\-pressure until its time comes.
		 
		
		
		 When needing a concat operator that is not detached use [`concatLazy(akka.stream.Graph<akka.stream.SourceShape<Out>, M>)`](#concatLazy(akka.stream.Graph))
		
		
		
		 '''Emits when''' element is available from current source or from the given [`Source`](Source.html "class in akka.stream.javadsl") when current is completed
		 
		
		
		 '''Backpressures when''' downstream backpressures
		 
		
		
		 '''Completes when''' given [`Source`](Source.html "class in akka.stream.javadsl") completes
		 
		
		
		 '''Cancels when''' downstream cancels
		- #### concatLazy
		
		
		
		```
		public <M> [Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")> concatLazy​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<[Out](Source.html "type parameter in Source")>,​M> that)
		```
		
		Concatenate the given [`Source`](Source.html "class in akka.stream.javadsl") to this [`Flow`](Flow.html "class in akka.stream.javadsl"), meaning that once this
		 Flow\&rsquo;s input is exhausted and all result elements have been generated,
		 the Source\&rsquo;s elements will be produced.
		 
		 Note that the [`Source`](Source.html "class in akka.stream.javadsl") is materialized together with this Flow. If `lazy` materialization is what is needed
		 the operator can be combined with for example `Source.lazySource` to defer materialization of `that` until the
		 time when this source completes.
		 
		
		
		 The second source is then kept from producing elements by asserting back\-pressure until its time comes.
		 
		
		
		 For a concat operator that is detached, use [`concat(akka.stream.Graph<akka.stream.SourceShape<Out>, M>)`](#concat(akka.stream.Graph))
		
		
		
		 If this [`Source`](Source.html "class in akka.stream.javadsl") gets upstream error \- no elements from the given [`Source`](Source.html "class in akka.stream.javadsl") will be pulled.
		 
		
		
		 '''Emits when''' element is available from current stream or from the given [`Source`](Source.html "class in akka.stream.javadsl") when current is completed
		 
		
		
		 '''Backpressures when''' downstream backpressures
		 
		
		
		 '''Completes when''' given [`Source`](Source.html "class in akka.stream.javadsl") completes
		 
		
		
		 '''Cancels when''' downstream cancels
		- #### concatAllLazy
		
		
		
		```
		public [Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")> concatAllLazy​(scala.collection.immutable.Seq<[Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<[Out](Source.html "type parameter in Source")>,​?>> those)
		```
		
		Concatenate the given [`Source`](Source.html "class in akka.stream.javadsl")s to this one, meaning that once this
		 Flow\&rsquo;s input is exhausted and all result elements have been generated,
		 the Source\&rsquo;s elements will be produced.
		 
		 Note that the [`Source`](Source.html "class in akka.stream.javadsl")s are materialized together with this Flow. If `lazy` materialization is what is needed
		 the operator can be combined with for example `Source.lazySource` to defer materialization of `that` until the
		 time when this source completes.
		 
		
		
		 The second source is then kept from producing elements by asserting back\-pressure until its time comes.
		 
		
		
		 For a concat operator that is detached, use [`concat(akka.stream.Graph<akka.stream.SourceShape<Out>, M>)`](#concat(akka.stream.Graph))
		
		
		
		 If this [`Source`](Source.html "class in akka.stream.javadsl") gets upstream error \- no elements from the given [`Source`](Source.html "class in akka.stream.javadsl")s will be pulled.
		 
		
		
		 '''Emits when''' element is available from current stream or from the given [`Source`](Source.html "class in akka.stream.javadsl")s when current is completed
		 
		
		
		 '''Backpressures when''' downstream backpressures
		 
		
		
		 '''Completes when''' all the given [`Source`](Source.html "class in akka.stream.javadsl")s completes
		 
		
		
		 '''Cancels when''' downstream cancels
		- #### concatMat
		
		
		
		```
		public <M,​M2> [Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​M2> concatMat​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<[Out](Source.html "type parameter in Source")>,​M> that,
		                                                   [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<[Mat](Source.html "type parameter in Source"),​M,​M2> matF)
		```
		
		Concatenate this [`Source`](Source.html "class in akka.stream.javadsl") with the given one, meaning that once current
		 is exhausted and all result elements have been generated,
		 the given source elements will be produced.
		 
		 Note that the [`Source`](Source.html "class in akka.stream.javadsl") is materialized together with this Flow and is "detached" meaning it will
		 in effect behave as a one element buffer in front of both the sources, that eagerly demands an element on start
		 (so it can not be combined with `Source.lazy` to defer materialization of `that`).
		 
		
		
		 The second source is then kept from producing elements by asserting back\-pressure until its time comes.
		 
		
		
		 When needing a concat operator that is not detached use [`concatLazyMat(akka.stream.Graph<akka.stream.SourceShape<Out>, M>, akka.japi.function.Function2<Mat, M, M2>)`](#concatLazyMat(akka.stream.Graph,akka.japi.function.Function2))
		
		
		
		 It is recommended to use the internally optimized `Keep.left` and `Keep.right` combiners
		 where appropriate instead of manually writing functions that pass through one of the values.
		- #### concatLazyMat
		
		
		
		```
		public <M,​M2> [Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​M2> concatLazyMat​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<[Out](Source.html "type parameter in Source")>,​M> that,
		                                                       [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<[Mat](Source.html "type parameter in Source"),​M,​M2> matF)
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
		public <M> [Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")> prepend​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<[Out](Source.html "type parameter in Source")>,​M> that)
		```
		
		Prepend the given [`Source`](Source.html "class in akka.stream.javadsl") to this one, meaning that once the given source
		 is exhausted and all result elements have been generated, the current source's
		 elements will be produced.
		 
		 Note that the [`Source`](Source.html "class in akka.stream.javadsl") is materialized together with this Flow and is "detached" meaning
		 in effect behave as a one element buffer in front of both the sources, that eagerly demands an element on start
		 (so it can not be combined with `Source.lazy` to defer materialization of `that`).
		 
		
		
		 This flow will then be kept from producing elements by asserting back\-pressure until its time comes.
		 
		
		
		 When needing a prepend operator that is not detached use [`prependLazy(akka.stream.Graph<akka.stream.SourceShape<Out>, M>)`](#prependLazy(akka.stream.Graph))
		
		
		
		 '''Emits when''' element is available from current source or from the given [`Source`](Source.html "class in akka.stream.javadsl") when current is completed
		 
		
		
		 '''Backpressures when''' downstream backpressures
		 
		
		
		 '''Completes when''' given [`Source`](Source.html "class in akka.stream.javadsl") completes
		 
		
		
		 '''Cancels when''' downstream cancels
		- #### prependLazy
		
		
		
		```
		public <M> [Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")> prependLazy​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<[Out](Source.html "type parameter in Source")>,​M> that)
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
		public <M,​M2> [Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​M2> prependMat​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<[Out](Source.html "type parameter in Source")>,​M> that,
		                                                    [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<[Mat](Source.html "type parameter in Source"),​M,​M2> matF)
		```
		
		Prepend the given [`Source`](Source.html "class in akka.stream.javadsl") to this one, meaning that once the given source
		 is exhausted and all result elements have been generated, the current source's
		 elements will be produced.
		 
		 Note that this Flow will be materialized together with the [`Source`](Source.html "class in akka.stream.javadsl") and just kept
		 from producing elements by asserting back\-pressure until its time comes.
		 
		
		
		 When needing a prepend operator that is not detached use [`prependLazyMat(akka.stream.Graph<akka.stream.SourceShape<Out>, M>, akka.japi.function.Function2<Mat, M, M2>)`](#prependLazyMat(akka.stream.Graph,akka.japi.function.Function2))
		
		
		
		 It is recommended to use the internally optimized `Keep.left` and `Keep.right` combiners
		 where appropriate instead of manually writing functions that pass through one of the values.
		- #### prependLazyMat
		
		
		
		```
		public <M,​M2> [Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​M2> prependLazyMat​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<[Out](Source.html "type parameter in Source")>,​M> that,
		                                                        [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<[Mat](Source.html "type parameter in Source"),​M,​M2> matF)
		```
		
		Prepend the given [`Source`](Source.html "class in akka.stream.javadsl") to this [`Flow`](Flow.html "class in akka.stream.javadsl"), meaning that before elements
		 are generated from this Flow, the Source's elements will be produced until it
		 is exhausted, at which point Flow elements will start being produced.
		 
		 Note that the [`Source`](Source.html "class in akka.stream.javadsl") is materialized together with this Flow.
		 
		
		
		 This flow will then be kept from producing elements by asserting back\-pressure until its time comes.
		 
		
		
		 When needing a prepend operator that is detached use [`prependMat(akka.stream.Graph<akka.stream.SourceShape<Out>, M>, akka.japi.function.Function2<Mat, M, M2>)`](#prependMat(akka.stream.Graph,akka.japi.function.Function2))
		- #### orElse
		
		
		
		```
		public <M> [Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")> orElse​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<[Out](Source.html "type parameter in Source")>,​M> secondary)
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
		public <M,​M2> [Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​M2> orElseMat​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<[Out](Source.html "type parameter in Source")>,​M> secondary,
		                                                   [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<[Mat](Source.html "type parameter in Source"),​M,​M2> matF)
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
		public [Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")> alsoTo​([Graph](../Graph.html "interface in akka.stream")<[SinkShape](../SinkShape.html "class in akka.stream")<[Out](Source.html "type parameter in Source")>,​?> that)
		```
		
		Attaches the given [`Sink`](Sink.html "class in akka.stream.javadsl") to this [`Source`](Source.html "class in akka.stream.javadsl"), meaning that elements that passes
		 through will also be sent to the [`Sink`](Sink.html "class in akka.stream.javadsl").
		 
		 It is similar to [`wireTap(akka.stream.Graph<akka.stream.SinkShape<Out>, ?>)`](#wireTap(akka.stream.Graph)) but will backpressure instead of dropping elements when the given [`Sink`](Sink.html "class in akka.stream.javadsl") is not ready.
		 
		
		
		 '''Emits when''' element is available and demand exists both from the Sink and the downstream.
		 
		
		
		 '''Backpressures when''' downstream or Sink backpressures
		 
		
		
		 '''Completes when''' upstream completes
		 
		
		
		 '''Cancels when''' downstream or Sink cancels
		- #### alsoToAll
		
		
		
		```
		public [Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")> alsoToAll​(scala.collection.immutable.Seq<[Graph](../Graph.html "interface in akka.stream")<[SinkShape](../SinkShape.html "class in akka.stream")<[Out](Source.html "type parameter in Source")>,​?>> those)
		```
		
		Attaches the given [`Sink`](Sink.html "class in akka.stream.javadsl")s to this [`Source`](Source.html "class in akka.stream.javadsl"), meaning that elements that passes
		 through will also be sent to all those [`Sink`](Sink.html "class in akka.stream.javadsl")s.
		 
		 It is similar to [`wireTap(akka.stream.Graph<akka.stream.SinkShape<Out>, ?>)`](#wireTap(akka.stream.Graph)) but will backpressure instead of dropping elements when the given [`Sink`](Sink.html "class in akka.stream.javadsl")s is not ready.
		 
		
		
		 '''Emits when''' element is available and demand exists both from the Sinks and the downstream.
		 
		
		
		 '''Backpressures when''' downstream or any of the [`Sink`](Sink.html "class in akka.stream.javadsl")s backpressures
		 
		
		
		 '''Completes when''' upstream completes
		 
		
		
		 '''Cancels when''' downstream or any of the [`Sink`](Sink.html "class in akka.stream.javadsl")s cancels
		- #### alsoToMat
		
		
		
		```
		public <M2,​M3> [Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​M3> alsoToMat​([Graph](../Graph.html "interface in akka.stream")<[SinkShape](../SinkShape.html "class in akka.stream")<[Out](Source.html "type parameter in Source")>,​M2> that,
		                                                    [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<[Mat](Source.html "type parameter in Source"),​M2,​M3> matF)
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
		public [Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")> divertTo​([Graph](../Graph.html "interface in akka.stream")<[SinkShape](../SinkShape.html "class in akka.stream")<[Out](Source.html "type parameter in Source")>,​?> that,
		                                      [Predicate](../../japi/function/Predicate.html "interface in akka.japi.function")<[Out](Source.html "type parameter in Source")> when)
		```
		
		Attaches the given [`Sink`](Sink.html "class in akka.stream.javadsl") to this [`Flow`](Flow.html "class in akka.stream.javadsl"), meaning that elements will be sent to the [`Sink`](Sink.html "class in akka.stream.javadsl")
		 instead of being passed through if the predicate `when` returns `true`.
		 
		 '''Emits when''' emits when an element is available from the input and the chosen output has demand
		 
		
		
		 '''Backpressures when''' the currently chosen output back\-pressures
		 
		
		
		 '''Completes when''' upstream completes and no output is pending
		 
		
		
		 '''Cancels when''' any of the downstreams cancel
		- #### divertToMat
		
		
		
		```
		public <M2,​M3> [Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​M3> divertToMat​([Graph](../Graph.html "interface in akka.stream")<[SinkShape](../SinkShape.html "class in akka.stream")<[Out](Source.html "type parameter in Source")>,​M2> that,
		                                                      [Predicate](../../japi/function/Predicate.html "interface in akka.japi.function")<[Out](Source.html "type parameter in Source")> when,
		                                                      [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<[Mat](Source.html "type parameter in Source"),​M2,​M3> matF)
		```
		
		Attaches the given [`Sink`](Sink.html "class in akka.stream.javadsl") to this [`Flow`](Flow.html "class in akka.stream.javadsl"), meaning that elements will be sent to the [`Sink`](Sink.html "class in akka.stream.javadsl")
		 instead of being passed through if the predicate `when` returns `true`.
		 
		
		See Also:
		[`It is recommended to use the internally optimized Keep.left and Keep.right combiners
		 where appropriate instead of manually writing functions that pass through one of the values.`](#divertTo(akka.stream.Graph,akka.japi.function.Predicate))
		- #### wireTap
		
		
		
		```
		public [Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")> wireTap​([Graph](../Graph.html "interface in akka.stream")<[SinkShape](../SinkShape.html "class in akka.stream")<[Out](Source.html "type parameter in Source")>,​?> that)
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
		public <M2,​M3> [Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​M3> wireTapMat​([Graph](../Graph.html "interface in akka.stream")<[SinkShape](../SinkShape.html "class in akka.stream")<[Out](Source.html "type parameter in Source")>,​M2> that,
		                                                     [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<[Mat](Source.html "type parameter in Source"),​M2,​M3> matF)
		```
		
		Attaches the given [`Sink`](Sink.html "class in akka.stream.javadsl") to this [`Flow`](Flow.html "class in akka.stream.javadsl") as a wire tap, meaning that elements that pass
		 through will also be sent to the wire\-tap Sink, without the latter affecting the mainline flow.
		 If the wire\-tap Sink backpressures, elements that would've been sent to it will be dropped instead.
		 
		 It is similar to [`alsoToMat(akka.stream.Graph<akka.stream.SinkShape<Out>, M2>, akka.japi.function.Function2<Mat, M2, M3>)`](#alsoToMat(akka.stream.Graph,akka.japi.function.Function2)) which does backpressure instead of dropping elements.
		 
		
		
		 It is recommended to use the internally optimized `Keep.left` and `Keep.right` combiners
		 where appropriate instead of manually writing functions that pass through one of the values.
		 
		
		
		
		See Also:
		[`wireTap(akka.stream.Graph<akka.stream.SinkShape<Out>, ?>)`](#wireTap(akka.stream.Graph))
		- #### interleave
		
		
		
		```
		public [Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")> interleave​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<[Out](Source.html "type parameter in Source")>,​?> that,
		                                        int segmentSize)
		```
		
		Interleave is a deterministic merge of the given [`Source`](Source.html "class in akka.stream.javadsl") with elements of this [`Source`](Source.html "class in akka.stream.javadsl").
		 It first emits `segmentSize` number of elements from this flow to downstream, then \- same amount for `that` source,
		 then repeat process.
		 
		 Example:
		 
		
		
		```
		
		 Source.from(Arrays.asList(1, 2, 3)).interleave(Source.from(Arrays.asList(4, 5, 6, 7), 2)
		 // 1, 2, 4, 5, 3, 6, 7
		 
		```
		
		
		 After one of sources is complete than all the rest elements will be emitted from the second one
		 
		
		
		 If one of sources gets upstream error \- stream completes with failure.
		 
		
		
		 '''Emits when''' element is available from the currently consumed upstream
		 
		
		
		 '''Backpressures when''' downstream backpressures. Signal to current
		 upstream, switch to next upstream when received `segmentSize` elements
		 
		
		
		 '''Completes when''' this [`Source`](Source.html "class in akka.stream.javadsl") and given one completes
		 
		
		
		 '''Cancels when''' downstream cancels
		- #### interleave
		
		
		
		```
		public [Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")> interleave​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<[Out](Source.html "type parameter in Source")>,​?> that,
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
		public <M,​M2> [Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​M2> interleaveMat​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<[Out](Source.html "type parameter in Source")>,​M> that,
		                                                       int segmentSize,
		                                                       [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<[Mat](Source.html "type parameter in Source"),​M,​M2> matF)
		```
		
		Interleave is a deterministic merge of the given [`Source`](Source.html "class in akka.stream.javadsl") with elements of this [`Source`](Source.html "class in akka.stream.javadsl").
		 It first emits `segmentSize` number of elements from this flow to downstream, then \- same amount for `that` source,
		 then repeat process.
		 
		 After one of sources is complete than all the rest elements will be emitted from the second one
		 
		
		
		 If one of sources gets upstream error \- stream completes with failure.
		 
		
		
		 It is recommended to use the internally optimized `Keep.left` and `Keep.right` combiners
		 where appropriate instead of manually writing functions that pass through one of the values.
		- #### interleaveMat
		
		
		
		```
		public <M,​M2> [Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​M2> interleaveMat​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<[Out](Source.html "type parameter in Source")>,​M> that,
		                                                       int segmentSize,
		                                                       boolean eagerClose,
		                                                       [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<[Mat](Source.html "type parameter in Source"),​M,​M2> matF)
		```
		
		Interleave is a deterministic merge of the given [`Source`](Source.html "class in akka.stream.javadsl") with elements of this [`Source`](Source.html "class in akka.stream.javadsl").
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
		public [Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")> interleaveAll​(java.util.List<? extends [Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<[Out](Source.html "type parameter in Source")>,​?>> those,
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
		- #### merge
		
		
		
		```
		public [Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")> merge​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<[Out](Source.html "type parameter in Source")>,​?> that)
		```
		
		Merge the given [`Source`](Source.html "class in akka.stream.javadsl") to the current one, taking elements as they arrive from input streams,
		 picking randomly when several elements ready.
		 
		 '''Emits when''' one of the inputs has an element available
		 
		
		
		 '''Backpressures when''' downstream backpressures
		 
		
		
		 '''Completes when''' all upstreams complete
		 
		
		
		 '''Cancels when''' downstream cancels
		- #### merge
		
		
		
		```
		public [Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")> merge​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<[Out](Source.html "type parameter in Source")>,​?> that,
		                                   boolean eagerComplete)
		```
		
		Merge the given [`Source`](Source.html "class in akka.stream.javadsl") to the current one, taking elements as they arrive from input streams,
		 picking randomly when several elements ready.
		 
		 '''Emits when''' one of the inputs has an element available
		 
		
		
		 '''Backpressures when''' downstream backpressures
		 
		
		
		 '''Completes when''' all upstreams complete (eagerComplete\=false) or one upstream completes (eagerComplete\=true), default value is `false`
		
		
		
		 '''Cancels when''' downstream cancels
		- #### mergeMat
		
		
		
		```
		public <M,​M2> [Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​M2> mergeMat​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<[Out](Source.html "type parameter in Source")>,​M> that,
		                                                  [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<[Mat](Source.html "type parameter in Source"),​M,​M2> matF)
		```
		
		Merge the given [`Source`](Source.html "class in akka.stream.javadsl") to the current one, taking elements as they arrive from input streams,
		 picking randomly when several elements ready.
		 
		 It is recommended to use the internally optimized `Keep.left` and `Keep.right` combiners
		 where appropriate instead of manually writing functions that pass through one of the values.
		- #### mergeMat
		
		
		
		```
		public <M,​M2> [Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​M2> mergeMat​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<[Out](Source.html "type parameter in Source")>,​M> that,
		                                                  [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<[Mat](Source.html "type parameter in Source"),​M,​M2> matF,
		                                                  boolean eagerComplete)
		```
		
		Merge the given [`Source`](Source.html "class in akka.stream.javadsl") to the current one, taking elements as they arrive from input streams,
		 picking randomly when several elements ready.
		 
		 It is recommended to use the internally optimized `Keep.left` and `Keep.right` combiners
		 where appropriate instead of manually writing functions that pass through one of the values.
		 
		
		
		
		See Also:
		[`merge(akka.stream.Graph<akka.stream.SourceShape<Out>, ?>)`](#merge(akka.stream.Graph))
		- #### mergeAll
		
		
		
		```
		public [Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")> mergeAll​(java.util.List<? extends [Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<[Out](Source.html "type parameter in Source")>,​?>> those,
		                                      boolean eagerComplete)
		```
		
		Merge the given [`Source`](Source.html "class in akka.stream.javadsl")s to the current one, taking elements as they arrive from input streams,
		 picking randomly when several elements ready.
		 
		 '''Emits when''' one of the inputs has an element available
		 
		
		
		 '''Backpressures when''' downstream backpressures
		 
		
		
		 '''Completes when''' all upstreams complete (eagerComplete\=false) or one upstream completes (eagerComplete\=true), default value is `false`
		
		
		
		 '''Cancels when''' downstream cancels
		- #### mergeLatest
		
		
		
		```
		public <M> [Source](Source.html "class in akka.stream.javadsl")<java.util.List<[Out](Source.html "type parameter in Source")>,​[Mat](Source.html "type parameter in Source")> mergeLatest​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<[Out](Source.html "type parameter in Source")>,​M> that,
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
		public <Mat2,​Mat3> [Source](Source.html "class in akka.stream.javadsl")<java.util.List<[Out](Source.html "type parameter in Source")>,​Mat3> mergeLatestMat​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<[Out](Source.html "type parameter in Source")>,​Mat2> that,
		                                                                               boolean eagerComplete,
		                                                                               [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<[Mat](Source.html "type parameter in Source"),​Mat2,​Mat3> matF)
		```
		
		MergeLatest joins elements from N input streams into stream of lists of size N.
		 i\-th element in list is the latest emitted element from i\-th input stream.
		 MergeLatest emits list for each element emitted from some input stream,
		 but only after each input stream emitted at least one element.
		- #### mergePreferred
		
		
		
		```
		public <M> [Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")> mergePreferred​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<[Out](Source.html "type parameter in Source")>,​M> that,
		                                                boolean preferred,
		                                                boolean eagerComplete)
		```
		
		Merge two sources. Prefer one source if both sources have elements ready.
		 
		 '''emits''' when one of the inputs has an element available. If multiple have elements available, prefer the 'right' one when 'preferred' is 'true', or the 'left' one when 'preferred' is 'false'.
		 
		
		
		 '''backpressures''' when downstream backpressures
		 
		
		
		 '''completes''' when all upstreams complete (This behavior is changeable to completing when any upstream completes by setting `eagerComplete=true`.)
		- #### mergePreferredMat
		
		
		
		```
		public <Mat2,​Mat3> [Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​Mat3> mergePreferredMat​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<[Out](Source.html "type parameter in Source")>,​Mat2> that,
		                                                                  boolean preferred,
		                                                                  boolean eagerComplete,
		                                                                  [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<[Mat](Source.html "type parameter in Source"),​Mat2,​Mat3> matF)
		```
		
		Merge two sources. Prefer one source if both sources have elements ready.
		 
		
		See Also:
		[`It is recommended to use the internally optimized Keep.left and Keep.right combiners
		 where appropriate instead of manually writing functions that pass through one of the values.`](#mergePreferred(akka.stream.Graph,boolean,boolean))
		- #### mergePrioritized
		
		
		
		```
		public <M> [Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")> mergePrioritized​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<[Out](Source.html "type parameter in Source")>,​M> that,
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
		public <Mat2,​Mat3> [Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​Mat3> mergePrioritizedMat​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<[Out](Source.html "type parameter in Source")>,​Mat2> that,
		                                                                    int leftPriority,
		                                                                    int rightPriority,
		                                                                    boolean eagerComplete,
		                                                                    [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<[Mat](Source.html "type parameter in Source"),​Mat2,​Mat3> matF)
		```
		
		Merge multiple sources. Prefer the sources depending on the 'priority' parameters.
		 
		 It is recommended to use the internally optimized `Keep.left` and `Keep.right` combiners
		 where appropriate instead of manually writing functions that pass through one of the values.
		- #### mergeSorted
		
		
		
		```
		public <M> [Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")> mergeSorted​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<[Out](Source.html "type parameter in Source")>,​M> that,
		                                             java.util.Comparator<[Out](Source.html "type parameter in Source")> comp)
		```
		
		Merge the given [`Source`](Source.html "class in akka.stream.javadsl") to this [`Source`](Source.html "class in akka.stream.javadsl"), taking elements as they arrive from input streams,
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
		public <Mat2,​Mat3> [Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​Mat3> mergeSortedMat​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<[Out](Source.html "type parameter in Source")>,​Mat2> that,
		                                                               java.util.Comparator<[Out](Source.html "type parameter in Source")> comp,
		                                                               [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<[Mat](Source.html "type parameter in Source"),​Mat2,​Mat3> matF)
		```
		
		Merge the given [`Source`](Source.html "class in akka.stream.javadsl") to this [`Source`](Source.html "class in akka.stream.javadsl"), taking elements as they arrive from input streams,
		 picking always the smallest of the available elements (waiting for one element from each side
		 to be available). This means that possible contiguity of the input streams is not exploited to avoid
		 waiting for elements, this merge will block when one of the inputs does not have more elements (and
		 does not complete).
		 
		 It is recommended to use the internally optimized `Keep.left` and `Keep.right` combiners
		 where appropriate instead of manually writing functions that pass through one of the values.
		- #### zip
		
		
		
		```
		public <T> [Source](Source.html "class in akka.stream.javadsl")<[Pair](../../japi/Pair.html "class in akka.japi")<[Out](Source.html "type parameter in Source"),​T>,​[Mat](Source.html "type parameter in Source")> zip​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<T>,​?> that)
		```
		
		Combine the elements of current [`Source`](Source.html "class in akka.stream.javadsl") and the given one into a stream of tuples.
		 
		 '''Emits when''' all of the inputs has an element available
		 
		
		
		 '''Backpressures when''' downstream backpressures
		 
		
		
		 '''Completes when''' any upstream completes
		 
		
		
		 '''Cancels when''' downstream cancels
		- #### zipMat
		
		
		
		```
		public <T,​M,​M2> [Source](Source.html "class in akka.stream.javadsl")<[Pair](../../japi/Pair.html "class in akka.japi")<[Out](Source.html "type parameter in Source"),​T>,​M2> zipMat​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<T>,​M> that,
		                                                                      [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<[Mat](Source.html "type parameter in Source"),​M,​M2> matF)
		```
		
		Combine the elements of current [`Source`](Source.html "class in akka.stream.javadsl") and the given one into a stream of tuples.
		 
		 It is recommended to use the internally optimized `Keep.left` and `Keep.right` combiners
		 where appropriate instead of manually writing functions that pass through one of the values.
		- #### zipAll
		
		
		
		```
		public <U,​A> [Source](Source.html "class in akka.stream.javadsl")<[Pair](../../japi/Pair.html "class in akka.japi")<A,​U>,​[Mat](Source.html "type parameter in Source")> zipAll​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<U>,​?> that,
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
		public <U,​Mat2,​Mat3,​A> [Source](Source.html "class in akka.stream.javadsl")<[Pair](../../japi/Pair.html "class in akka.japi")<A,​U>,​Mat3> zipAllMat​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<U>,​Mat2> that,
		                                                                                      A thisElem,
		                                                                                      U thatElem,
		                                                                                      scala.Function2<[Mat](Source.html "type parameter in Source"),​Mat2,​Mat3> matF)
		```
		
		Combine the elements of current flow and the given [`Source`](Source.html "class in akka.stream.javadsl") into a stream of tuples.
		 
		
		See Also:
		[`'''Emits when''' at first emits when both inputs emit, and then as long as any input emits (coupled to the default value of the completed input).
		 
		 '''Backpressures when''' downstream backpressures
		 
		 '''Completes when''' all upstream completes
		 
		 '''Cancels when''' downstream cancels`](#zipAll(akka.stream.Graph,A,U))
		- #### zipLatest
		
		
		
		```
		public <T> [Source](Source.html "class in akka.stream.javadsl")<[Pair](../../japi/Pair.html "class in akka.japi")<[Out](Source.html "type parameter in Source"),​T>,​[Mat](Source.html "type parameter in Source")> zipLatest​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<T>,​?> that)
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
		public <T,​M,​M2> [Source](Source.html "class in akka.stream.javadsl")<[Pair](../../japi/Pair.html "class in akka.japi")<[Out](Source.html "type parameter in Source"),​T>,​M2> zipLatestMat​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<T>,​M> that,
		                                                                            [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<[Mat](Source.html "type parameter in Source"),​M,​M2> matF)
		```
		
		Combine the elements of current [`Source`](Source.html "class in akka.stream.javadsl") and the given one into a stream of tuples, picking always the latest element of each.
		 
		 It is recommended to use the internally optimized `Keep.left` and `Keep.right` combiners
		 where appropriate instead of manually writing functions that pass through one of the values.
		- #### zipWith
		
		
		
		```
		public <Out2,​Out3> [Source](Source.html "class in akka.stream.javadsl")<Out3,​[Mat](Source.html "type parameter in Source")> zipWith​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<Out2>,​?> that,
		                                                        [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<[Out](Source.html "type parameter in Source"),​Out2,​Out3> combine)
		```
		
		Put together the elements of current [`Source`](Source.html "class in akka.stream.javadsl") and the given one
		 into a stream of combined elements using a combiner function.
		 
		 '''Emits when''' all of the inputs has an element available
		 
		
		
		 '''Backpressures when''' downstream backpressures
		 
		
		
		 '''Completes when''' any upstream completes
		 
		
		
		 '''Cancels when''' downstream cancels
		- #### zipWithMat
		
		
		
		```
		public <Out2,​Out3,​M,​M2> [Source](Source.html "class in akka.stream.javadsl")<Out3,​M2> zipWithMat​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<Out2>,​M> that,
		                                                                           [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<[Out](Source.html "type parameter in Source"),​Out2,​Out3> combine,
		                                                                           [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<[Mat](Source.html "type parameter in Source"),​M,​M2> matF)
		```
		
		Put together the elements of current [`Source`](Source.html "class in akka.stream.javadsl") and the given one
		 into a stream of combined elements using a combiner function.
		 
		 It is recommended to use the internally optimized `Keep.left` and `Keep.right` combiners
		 where appropriate instead of manually writing functions that pass through one of the values.
		- #### zipLatestWith
		
		
		
		```
		public <Out2,​Out3> [Source](Source.html "class in akka.stream.javadsl")<Out3,​[Mat](Source.html "type parameter in Source")> zipLatestWith​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<Out2>,​?> that,
		                                                              [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<[Out](Source.html "type parameter in Source"),​Out2,​Out3> combine)
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
		public <Out2,​Out3> [Source](Source.html "class in akka.stream.javadsl")<Out3,​[Mat](Source.html "type parameter in Source")> zipLatestWith​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<Out2>,​?> that,
		                                                              boolean eagerComplete,
		                                                              [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<[Out](Source.html "type parameter in Source"),​Out2,​Out3> combine)
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
		public <Out2,​Out3,​M,​M2> [Source](Source.html "class in akka.stream.javadsl")<Out3,​M2> zipLatestWithMat​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<Out2>,​M> that,
		                                                                                 [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<[Out](Source.html "type parameter in Source"),​Out2,​Out3> combine,
		                                                                                 [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<[Mat](Source.html "type parameter in Source"),​M,​M2> matF)
		```
		
		Put together the elements of current [`Source`](Source.html "class in akka.stream.javadsl") and the given one
		 into a stream of combined elements using a combiner function,
		 picking always the latest of the elements of each source.
		 
		 It is recommended to use the internally optimized `Keep.left` and `Keep.right` combiners
		 where appropriate instead of manually writing functions that pass through one of the values.
		- #### zipLatestWithMat
		
		
		
		```
		public <Out2,​Out3,​M,​M2> [Source](Source.html "class in akka.stream.javadsl")<Out3,​M2> zipLatestWithMat​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<Out2>,​M> that,
		                                                                                 boolean eagerComplete,
		                                                                                 [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<[Out](Source.html "type parameter in Source"),​Out2,​Out3> combine,
		                                                                                 [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<[Mat](Source.html "type parameter in Source"),​M,​M2> matF)
		```
		
		Put together the elements of current [`Source`](Source.html "class in akka.stream.javadsl") and the given one
		 into a stream of combined elements using a combiner function,
		 picking always the latest of the elements of each source.
		 
		 It is recommended to use the internally optimized `Keep.left` and `Keep.right` combiners
		 where appropriate instead of manually writing functions that pass through one of the values.
		- #### zipWithIndex
		
		
		
		```
		public [Source](Source.html "class in akka.stream.javadsl")<[Pair](../../japi/Pair.html "class in akka.japi")<[Out](Source.html "type parameter in Source"),​java.lang.Long>,​[Mat](Source.html "type parameter in Source")> zipWithIndex()
		```
		
		Combine the elements of current [`Source`](Source.html "class in akka.stream.javadsl") into a stream of tuples consisting
		 of all elements paired with their index. Indices start at 0\.
		 
		 '''Emits when''' upstream emits an element and is paired with their index
		 
		
		
		 '''Backpressures when''' downstream backpressures
		 
		
		
		 '''Completes when''' upstream completes
		 
		
		
		 '''Cancels when''' downstream cancels
		- #### runForeach
		
		
		
		```
		public java.util.concurrent.CompletionStage<[Done](../../Done.html "class in akka")> runForeach​([Procedure](../../japi/function/Procedure.html "interface in akka.japi.function")<[Out](Source.html "type parameter in Source")> f,
		                                                             [ClassicActorSystemProvider](../../actor/ClassicActorSystemProvider.html "interface in akka.actor") systemProvider)
		```
		
		Shortcut for running this `Source` with a foreach procedure. The given procedure is invoked
		 for each received element.
		 The returned `CompletionStage` will be completed normally when reaching the
		 normal end of the stream, or completed exceptionally if there is a failure is signaled in
		 the stream.
		 
		 Note that the classic or typed `ActorSystem` can be used as the `systemProvider` parameter.
		- #### runForeach
		
		
		
		```
		public java.util.concurrent.CompletionStage<[Done](../../Done.html "class in akka")> runForeach​([Procedure](../../japi/function/Procedure.html "interface in akka.japi.function")<[Out](Source.html "type parameter in Source")> f,
		                                                             [Materializer](../Materializer.html "class in akka.stream") materializer)
		```
		
		Shortcut for running this `Source` with a foreach procedure. The given procedure is invoked
		 for each received element.
		 The returned `CompletionStage` will be completed normally when reaching the
		 normal end of the stream, or completed exceptionally if there is a failure is signaled in
		 the stream.
		 
		 Prefer the method taking an `ActorSystem` unless you have special requirements
		- #### map
		
		
		
		```
		public <T> [Source](Source.html "class in akka.stream.javadsl")<T,​[Mat](Source.html "type parameter in Source")> map​([Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](Source.html "type parameter in Source"),​T> f)
		```
		
		Transform this stream by applying the given function to each of the elements
		 as they pass through this processing step.
		 
		 '''Emits when''' the mapping function returns an element
		 
		
		
		 '''Backpressures when''' downstream backpressures
		 
		
		
		 '''Completes when''' upstream completes
		 
		
		
		 '''Cancels when''' downstream cancels
		- #### wireTap
		
		
		
		```
		public [Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")> wireTap​([Procedure](../../japi/function/Procedure.html "interface in akka.japi.function")<[Out](Source.html "type parameter in Source")> f)
		```
		
		This is a simplified version of `wireTap(Sink)` that takes only a simple procedure.
		 Elements will be passed into this "side channel" function, and any of its results will be ignored.
		 
		 If the wire\-tap operation is slow (it backpressures), elements that would've been sent to it will be dropped instead.
		 
		
		
		 It is similar to [`alsoTo(akka.stream.Graph<akka.stream.SinkShape<Out>, ?>)`](#alsoTo(akka.stream.Graph)) which does backpressure instead of dropping elements.
		 
		
		
		 This operation is useful for inspecting the passed through element, usually by means of side\-effecting
		 operations (such as `println`, or emitting metrics), for each element without having to modify it.
		 
		
		
		 For logging signals (elements, completion, error) consider using the [`log(java.lang.String,akka.japi.function.Function<Out,java.lang.Object>,akka.event.LoggingAdapter)`](#log(java.lang.String,akka.japi.function.Function,akka.event.LoggingAdapter)) operator instead,
		 along with appropriate `ActorAttributes.createLogLevels`.
		 
		
		
		 '''Emits when''' upstream emits an element
		 
		
		
		 '''Backpressures when''' downstream backpressures
		 
		
		
		 '''Completes when''' upstream completes
		 
		
		
		 '''Cancels when''' downstream cancels; Note that failures of the `f` function will not cause cancellation
		- #### recover
		
		
		
		```
		public [Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")> recover​(scala.PartialFunction<java.lang.Throwable,​[Out](Source.html "type parameter in Source")> pf)
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
		public [Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")> recover​(java.lang.Class<? extends java.lang.Throwable> clazz,
		                                     java.util.function.Supplier<[Out](Source.html "type parameter in Source")> supplier)
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
		public [Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")> mapError​(scala.PartialFunction<java.lang.Throwable,​java.lang.Throwable> pf)
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
		public <E extends java.lang.Throwable> [Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")> mapError​(java.lang.Class<E> clazz,
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
		public [Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")> recoverWith​(scala.PartialFunction<java.lang.Throwable,​? extends [Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<[Out](Source.html "type parameter in Source")>,​[NotUsed](../../NotUsed.html "class in akka")>> pf)
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
		- #### recoverWith
		
		
		
		```
		public [Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")> recoverWith​(java.lang.Class<? extends java.lang.Throwable> clazz,
		                                         java.util.function.Supplier<[Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<[Out](Source.html "type parameter in Source")>,​[NotUsed](../../NotUsed.html "class in akka")>> supplier)
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
		public [Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")> onErrorComplete()
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
		public [Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")> onErrorComplete​(java.lang.Class<? extends java.lang.Throwable> clazz)
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
		public [Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")> onErrorComplete​(java.util.function.Predicate<? super java.lang.Throwable> predicate)
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
		public [Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")> recoverWithRetries​(int attempts,
		                                                scala.PartialFunction<java.lang.Throwable,​? extends [Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<[Out](Source.html "type parameter in Source")>,​[NotUsed](../../NotUsed.html "class in akka")>> pf)
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
		- #### recoverWithRetries
		
		
		
		```
		public [Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")> recoverWithRetries​(int attempts,
		                                                java.lang.Class<? extends java.lang.Throwable> clazz,
		                                                java.util.function.Supplier<[Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<[Out](Source.html "type parameter in Source")>,​[NotUsed](../../NotUsed.html "class in akka")>> supplier)
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
		- #### mapConcat
		
		
		
		```
		public <T> [Source](Source.html "class in akka.stream.javadsl")<T,​[Mat](Source.html "type parameter in Source")> mapConcat​([Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](Source.html "type parameter in Source"),​? extends java.lang.Iterable<T>> f)
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
		public <S,​T> [Source](Source.html "class in akka.stream.javadsl")<T,​[Mat](Source.html "type parameter in Source")> statefulMap​([Creator](../../japi/function/Creator.html "interface in akka.japi.function")<S> create,
		                                                   [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<S,​[Out](Source.html "type parameter in Source"),​[Pair](../../japi/Pair.html "class in akka.japi")<S,​T>> f,
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
		public <R,​T> [Source](Source.html "class in akka.stream.javadsl")<T,​[Mat](Source.html "type parameter in Source")> mapWithResource​(java.util.function.Supplier<R> create,
		                                                       java.util.function.BiFunction<R,​[Out](Source.html "type parameter in Source"),​T> f,
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
		public <T> [Source](Source.html "class in akka.stream.javadsl")<T,​[Mat](Source.html "type parameter in Source")> statefulMapConcat​([Creator](../../japi/function/Creator.html "interface in akka.japi.function")<[Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](Source.html "type parameter in Source"),​java.lang.Iterable<T>>> f)
		```
		
		Transform each input element into an `Iterable` of output elements that is
		 then flattened into the output stream. The transformation is meant to be stateful,
		 which is enabled by creating the transformation function anew for every materialization —
		 the returned function will typically close over mutable objects to store state between
		 invocations. For the stateless variant see [`mapConcat(akka.japi.function.Function<Out, ? extends java.lang.Iterable<T>>)`](#mapConcat(akka.japi.function.Function)).
		 
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
		public <T> [Source](Source.html "class in akka.stream.javadsl")<T,​[Mat](Source.html "type parameter in Source")> mapAsync​(int parallelism,
		                                        [Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](Source.html "type parameter in Source"),​java.util.concurrent.CompletionStage<T>> f)
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
		public <T,​P> [Source](Source.html "class in akka.stream.javadsl")<T,​[Mat](Source.html "type parameter in Source")> mapAsyncPartitioned​(int parallelism,
		                                                           int perPartition,
		                                                           [Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](Source.html "type parameter in Source"),​P> partitioner,
		                                                           java.util.function.BiFunction<[Out](Source.html "type parameter in Source"),​P,​java.util.concurrent.CompletionStage<T>> f)
		```
		
		
		See Also:
		`akka.stream.javadsl.Flow.mapAsyncPartitioned`
		- #### mapAsyncUnordered
		
		
		
		```
		public <T> [Source](Source.html "class in akka.stream.javadsl")<T,​[Mat](Source.html "type parameter in Source")> mapAsyncUnordered​(int parallelism,
		                                                 [Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](Source.html "type parameter in Source"),​java.util.concurrent.CompletionStage<T>> f)
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
		 
		
		
		 '''Completes when''' upstream completes and all CompletionStages has been completed and all elements has been emitted
		 
		
		
		 '''Cancels when''' downstream cancels
		 
		
		
		
		See Also:
		[`mapAsync(int, akka.japi.function.Function<Out, java.util.concurrent.CompletionStage<T>>)`](#mapAsync(int,akka.japi.function.Function))
		- #### ask
		
		
		
		```
		public <S> [Source](Source.html "class in akka.stream.javadsl")<S,​[Mat](Source.html "type parameter in Source")> ask​([ActorRef](../../actor/ActorRef.html "class in akka.actor") ref,
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
		public <S> [Source](Source.html "class in akka.stream.javadsl")<S,​[Mat](Source.html "type parameter in Source")> ask​(int parallelism,
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
		public [Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")> watch​([ActorRef](../../actor/ActorRef.html "class in akka.actor") ref)
		```
		
		The operator fails with an [`WatchedActorTerminatedException`](../WatchedActorTerminatedException.html "class in akka.stream") if the target actor is terminated.
		 
		 '''Emits when''' upstream emits
		 
		
		
		 '''Backpressures when''' downstream backpressures
		 
		
		
		 '''Completes when''' upstream completes
		 
		
		
		 '''Fails when''' the watched actor terminates
		 
		
		
		 '''Cancels when''' downstream cancels
		- #### filter
		
		
		
		```
		public [Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")> filter​([Predicate](../../japi/function/Predicate.html "interface in akka.japi.function")<[Out](Source.html "type parameter in Source")> p)
		```
		
		Only pass on those elements that satisfy the given predicate.
		 
		 Adheres to the `ActorAttributes.SupervisionStrategy` attribute.
		 
		
		
		 '''Emits when''' the given predicate returns true for the element
		 
		
		
		 '''Backpressures when''' the given predicate returns true for the element and downstream backpressures
		 
		
		
		 '''Completes when''' upstream completes
		 
		
		
		 '''Cancels when''' downstream cancels
		- #### filterNot
		
		
		
		```
		public [Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")> filterNot​([Predicate](../../japi/function/Predicate.html "interface in akka.japi.function")<[Out](Source.html "type parameter in Source")> p)
		```
		
		Only pass on those elements that NOT satisfy the given predicate.
		 
		 Adheres to the `ActorAttributes.SupervisionStrategy` attribute.
		 
		
		
		 '''Emits when''' the given predicate returns false for the element
		 
		
		
		 '''Backpressures when''' the given predicate returns false for the element and downstream backpressures
		 
		
		
		 '''Completes when''' upstream completes
		 
		
		
		 '''Cancels when''' downstream cancels
		- #### collect
		
		
		
		```
		public <T> [Source](Source.html "class in akka.stream.javadsl")<T,​[Mat](Source.html "type parameter in Source")> collect​(scala.PartialFunction<[Out](Source.html "type parameter in Source"),​T> pf)
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
		public <T> [Source](Source.html "class in akka.stream.javadsl")<T,​[Mat](Source.html "type parameter in Source")> collectType​(java.lang.Class<T> clazz)
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
		public [Source](Source.html "class in akka.stream.javadsl")<java.util.List<[Out](Source.html "type parameter in Source")>,​[Mat](Source.html "type parameter in Source")> grouped​(int n)
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
		public [Source](Source.html "class in akka.stream.javadsl")<java.util.List<[Out](Source.html "type parameter in Source")>,​[Mat](Source.html "type parameter in Source")> groupedWeighted​(long minWeight,
		                                                             java.util.function.Function<[Out](Source.html "type parameter in Source"),​java.lang.Long> costFn)
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
		public [Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")> limit​(int n)
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
		public [Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")> limitWeighted​(long n,
		                                           [Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](Source.html "type parameter in Source"),​java.lang.Long> costFn)
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
		public [Source](Source.html "class in akka.stream.javadsl")<java.util.List<[Out](Source.html "type parameter in Source")>,​[Mat](Source.html "type parameter in Source")> sliding​(int n,
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
		- #### scan
		
		
		
		```
		public <T> [Source](Source.html "class in akka.stream.javadsl")<T,​[Mat](Source.html "type parameter in Source")> scan​(T zero,
		                                    [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<T,​[Out](Source.html "type parameter in Source"),​T> f)
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
		public <T> [Source](Source.html "class in akka.stream.javadsl")<T,​[Mat](Source.html "type parameter in Source")> scanAsync​(T zero,
		                                         [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<T,​[Out](Source.html "type parameter in Source"),​java.util.concurrent.CompletionStage<T>> f)
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
		 
		
		
		 See also `FlowOps#scan`
		- #### fold
		
		
		
		```
		public <T> [Source](Source.html "class in akka.stream.javadsl")<T,​[Mat](Source.html "type parameter in Source")> fold​(T zero,
		                                    [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<T,​[Out](Source.html "type parameter in Source"),​T> f)
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
		public <T> [Source](Source.html "class in akka.stream.javadsl")<T,​[Mat](Source.html "type parameter in Source")> foldAsync​(T zero,
		                                         [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<T,​[Out](Source.html "type parameter in Source"),​java.util.concurrent.CompletionStage<T>> f)
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
		public [Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")> reduce​([Function2](../../japi/function/Function2.html "interface in akka.japi.function")<[Out](Source.html "type parameter in Source"),​[Out](Source.html "type parameter in Source"),​[Out](Source.html "type parameter in Source")> f)
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
		public [Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")> intersperse​([Out](Source.html "type parameter in Source") start,
		                                         [Out](Source.html "type parameter in Source") inject,
		                                         [Out](Source.html "type parameter in Source") end)
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
		
		 Source.single(">> ").concat(list.intersperse(","))
		 list.intersperse(",").concat(Source.single("END"))
		 
		```
		
		 '''Emits when''' upstream emits (or before with the `start` element if provided)
		 
		 '''Backpressures when''' downstream backpressures
		 
		
		
		 '''Completes when''' upstream completes
		 
		
		
		 '''Cancels when''' downstream cancels
		- #### intersperse
		
		
		
		```
		public [Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")> intersperse​([Out](Source.html "type parameter in Source") inject)
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
		public [Source](Source.html "class in akka.stream.javadsl")<java.util.List<[Out](Source.html "type parameter in Source")>,​[Mat](Source.html "type parameter in Source")> groupedWithin​(int maxNumber,
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
		public [Source](Source.html "class in akka.stream.javadsl")<java.util.List<[Out](Source.html "type parameter in Source")>,​[Mat](Source.html "type parameter in Source")> groupedWeightedWithin​(long maxWeight,
		                                                                   [Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](Source.html "type parameter in Source"),​java.lang.Long> costFn,
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
		public [Source](Source.html "class in akka.stream.javadsl")<java.util.List<[Out](Source.html "type parameter in Source")>,​[Mat](Source.html "type parameter in Source")> groupedWeightedWithin​(long maxWeight,
		                                                                   int maxNumber,
		                                                                   [Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](Source.html "type parameter in Source"),​java.lang.Long> costFn,
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
		public [Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")> delay​(java.time.Duration of,
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
		public [Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")> delayWith​(java.util.function.Supplier<[DelayStrategy](DelayStrategy.html "interface in akka.stream.javadsl")<[Out](Source.html "type parameter in Source")>> delayStrategySupplier,
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
		public [Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")> drop​(long n)
		```
		
		Discard the given number of elements at the beginning of the stream.
		 No elements will be dropped if `n` is zero or negative.
		 
		 '''Emits when''' the specified number of elements has been dropped already
		 
		
		
		 '''Backpressures when''' the specified number of elements has been dropped and downstream backpressures
		 
		
		
		 '''Completes when''' upstream completes
		 
		
		
		 '''Cancels when''' downstream cancels
		- #### dropWithin
		
		
		
		```
		public [Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")> dropWithin​(java.time.Duration duration)
		```
		
		Discard the elements received within the given duration at beginning of the stream.
		 
		 '''Emits when''' the specified time elapsed and a new upstream element arrives
		 
		
		
		 '''Backpressures when''' downstream backpressures
		 
		
		
		 '''Completes when''' upstream completes
		 
		
		
		 '''Cancels when''' downstream cancels
		- #### takeWhile
		
		
		
		```
		public [Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")> takeWhile​([Predicate](../../japi/function/Predicate.html "interface in akka.japi.function")<[Out](Source.html "type parameter in Source")> p,
		                                       boolean inclusive)
		```
		
		Terminate processing (and cancel the upstream publisher) after predicate
		 returns false for the first time, including the first failed element if inclusive is true
		 Due to input buffering some elements may have been requested from upstream publishers
		 that will then not be processed downstream of this step.
		 
		 The stream will be completed without producing any elements if predicate is false for
		 the first stream element.
		 
		
		
		 Adheres to the `ActorAttributes.SupervisionStrategy` attribute.
		 
		
		
		 '''Emits when''' the predicate is true
		 
		
		
		 '''Backpressures when''' downstream backpressures
		 
		
		
		 '''Completes when''' predicate returned false (or 1 after predicate returns false if `inclusive` or upstream completes
		 
		
		
		 '''Cancels when''' predicate returned false or downstream cancels
		 
		
		
		 See also `Source.limit`, `Source.limitWeighted`
		- #### takeWhile
		
		
		
		```
		public [Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")> takeWhile​([Predicate](../../japi/function/Predicate.html "interface in akka.japi.function")<[Out](Source.html "type parameter in Source")> p)
		```
		
		Terminate processing (and cancel the upstream publisher) after predicate
		 returns false for the first time. Due to input buffering some elements may have been
		 requested from upstream publishers that will then not be processed downstream
		 of this step.
		 
		 The stream will be completed without producing any elements if predicate is false for
		 the first stream element.
		 
		
		
		 '''Emits when''' the predicate is true
		 
		
		
		 '''Backpressures when''' downstream backpressures
		 
		
		
		 '''Completes when''' predicate returned false or upstream completes
		 
		
		
		 '''Cancels when''' predicate returned false or downstream cancels
		 
		
		
		 See also `Source.limit`, `Source.limitWeighted`
		- #### dropWhile
		
		
		
		```
		public [Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")> dropWhile​([Predicate](../../japi/function/Predicate.html "interface in akka.japi.function")<[Out](Source.html "type parameter in Source")> p)
		```
		
		Discard elements at the beginning of the stream while predicate is true.
		 No elements will be dropped after predicate first time returned false.
		 
		 Adheres to the `ActorAttributes.SupervisionStrategy` attribute.
		 
		
		
		 '''Emits when''' predicate returned false and for all following stream elements
		 
		
		
		 '''Backpressures when''' predicate returned false and downstream backpressures
		 
		
		
		 '''Completes when''' upstream completes
		 
		
		
		 '''Cancels when''' downstream cancels
		 
		
		
		
		Parameters:
		`p` \- predicate is evaluated for each new element until first time returns false
		- #### take
		
		
		
		```
		public [Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")> take​(long n)
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
		public [Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")> takeWithin​(java.time.Duration duration)
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
		public <S> [Source](Source.html "class in akka.stream.javadsl")<S,​[Mat](Source.html "type parameter in Source")> conflateWithSeed​([Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](Source.html "type parameter in Source"),​S> seed,
		                                                [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<S,​[Out](Source.html "type parameter in Source"),​S> aggregate)
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
		 
		
		
		 see also `Source.conflate` `Source.batch` `Source.batchWeighted`
		
		
		
		
		Parameters:
		`seed` \- Provides the first state for a conflated value using the first unconsumed element as a start
		`aggregate` \- Takes the currently aggregated value and the current pending element to produce a new aggregate
		- #### conflate
		
		
		
		```
		public [Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")> conflate​([Function2](../../japi/function/Function2.html "interface in akka.japi.function")<[Out](Source.html "type parameter in Source"),​[Out](Source.html "type parameter in Source"),​[Out](Source.html "type parameter in Source")> aggregate)
		```
		
		Allows a faster upstream to progress independently of a slower subscriber by conflating elements into a summary
		 until the subscriber is ready to accept them. For example a conflate step might average incoming numbers if the
		 upstream publisher is faster.
		 This version of conflate does not change the output type of the stream. See `Source.conflateWithSeed` for a
		 more flexible version that can take a seed function and transform elements while rolling up.
		 
		 This element only rolls up elements if the upstream is faster, but if the downstream is faster it will not
		 duplicate elements.
		 
		
		
		 Adheres to the `ActorAttributes.SupervisionStrategy` attribute.
		 
		
		
		 '''Emits when''' downstream stops backpressuring and there is a conflated element available
		 
		
		
		 '''Backpressures when''' never
		 
		
		
		 '''Completes when''' upstream completes
		 
		
		
		 '''Cancels when''' downstream cancels
		 
		
		
		 see also `Source.conflateWithSeed` `Source.batch` `Source.batchWeighted`
		
		
		
		
		Parameters:
		`aggregate` \- Takes the currently aggregated value and the current pending element to produce a new aggregate
		- #### batch
		
		
		
		```
		public <S> [Source](Source.html "class in akka.stream.javadsl")<S,​[Mat](Source.html "type parameter in Source")> batch​(long max,
		                                     [Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](Source.html "type parameter in Source"),​S> seed,
		                                     [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<S,​[Out](Source.html "type parameter in Source"),​S> aggregate)
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
		 
		
		
		 See also `Source.conflate`, `Source.batchWeighted`
		
		
		
		
		Parameters:
		`max` \- maximum number of elements to batch before backpressuring upstream (must be positive non\-zero)
		`seed` \- Provides the first state for a batched value using the first unconsumed element as a start
		`aggregate` \- Takes the currently batched value and the current pending element to produce a new aggregate
		- #### batchWeighted
		
		
		
		```
		public <S> [Source](Source.html "class in akka.stream.javadsl")<S,​[Mat](Source.html "type parameter in Source")> batchWeighted​(long max,
		                                             [Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](Source.html "type parameter in Source"),​java.lang.Long> costFn,
		                                             [Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](Source.html "type parameter in Source"),​S> seed,
		                                             [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<S,​[Out](Source.html "type parameter in Source"),​S> aggregate)
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
		 
		
		
		 See also `Source.conflate`, `Source.batch`
		
		
		
		
		Parameters:
		`max` \- maximum weight of elements to batch before backpressuring upstream (must be positive non\-zero)
		`costFn` \- a function to compute a single element weight
		`seed` \- Provides the first state for a batched value using the first unconsumed element as a start
		`aggregate` \- Takes the currently batched value and the current pending element to produce a new batch
		- #### expand
		
		
		
		```
		public <U> [Source](Source.html "class in akka.stream.javadsl")<U,​[Mat](Source.html "type parameter in Source")> expand​([Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](Source.html "type parameter in Source"),​java.util.Iterator<U>> expander)
		```
		
		Allows a faster downstream to progress independently of a slower publisher by extrapolating elements from an older
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
		public [Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")> extrapolate​([Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](Source.html "type parameter in Source"),​java.util.Iterator<[Out](Source.html "type parameter in Source")>> extrapolator)
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
		public [Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")> extrapolate​([Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](Source.html "type parameter in Source"),​java.util.Iterator<[Out](Source.html "type parameter in Source")>> extrapolator,
		                                         [Out](Source.html "type parameter in Source") initial)
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
		public [Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")> buffer​(int size,
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
		public [Source](Source.html "class in akka.stream.javadsl")<[Pair](../../japi/Pair.html "class in akka.japi")<java.util.List<[Out](Source.html "type parameter in Source")>,​[Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​[NotUsed](../../NotUsed.html "class in akka")>>,​[Mat](Source.html "type parameter in Source")> prefixAndTail​(int n)
		```
		
		Takes up to `n` elements from the stream (less than `n` if the upstream completes before emitting `n` elements)
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
		public <Out2,​Mat2> [Source](Source.html "class in akka.stream.javadsl")<Out2,​[Mat](Source.html "type parameter in Source")> flatMapPrefix​(int n,
		                                                              [Function](../../japi/function/Function.html "interface in akka.japi.function")<java.lang.Iterable<[Out](Source.html "type parameter in Source")>,​[Flow](Flow.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​Out2,​Mat2>> f)
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
		public <Out2,​Mat2,​Mat3> [Source](Source.html "class in akka.stream.javadsl")<Out2,​Mat3> flatMapPrefixMat​(int n,
		                                                                             [Function](../../japi/function/Function.html "interface in akka.japi.function")<java.lang.Iterable<[Out](Source.html "type parameter in Source")>,​[Flow](Flow.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​Out2,​Mat2>> f,
		                                                                             [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<[Mat](Source.html "type parameter in Source"),​java.util.concurrent.CompletionStage<Mat2>,​Mat3> matF)
		```
		
		mat version of [`flatMapPrefix(int, akka.japi.function.Function<java.lang.Iterable<Out>, akka.stream.javadsl.Flow<Out, Out2, Mat2>>)`](#flatMapPrefix(int,akka.japi.function.Function)), this method gives access to a future materialized value of the downstream flow (as a completion stage).
		 see [`flatMapPrefix(int, akka.japi.function.Function<java.lang.Iterable<Out>, akka.stream.javadsl.Flow<Out, Out2, Mat2>>)`](#flatMapPrefix(int,akka.japi.function.Function)) for details.
		- #### groupBy
		
		
		
		```
		public <K> [SubSource](SubSource.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")> groupBy​(int maxSubstreams,
		                                            [Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](Source.html "type parameter in Source"),​K> f,
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
		public <K> [SubSource](SubSource.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")> groupBy​(int maxSubstreams,
		                                            [Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](Source.html "type parameter in Source"),​K> f)
		```
		
		This operation demultiplexes the incoming stream into separate output
		 streams, one for each element key. The key is computed for each element
		 using the given function. When a new key is encountered for the first time
		 a new substream is opened and subsequently fed with all elements belonging to
		 that key.
		 
		 The object returned from this method is not a normal [`Flow`](Flow.html "class in akka.stream.javadsl"),
		 it is a [`SubSource`](SubSource.html "class in akka.stream.javadsl"). This means that after this operator all transformations
		 are applied to all encountered substreams in the same fashion. Substream mode
		 is exited either by closing the substream (i.e. connecting it to a [`Sink`](Sink.html "class in akka.stream.javadsl"))
		 or by merging the substreams back together; see the `to` and `mergeBack` methods
		 on [`SubSource`](SubSource.html "class in akka.stream.javadsl") for more information.
		 
		
		
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
		 
		
		
		 Adheres to the `ActorAttributes.SupervisionStrategy` attribute.
		 
		
		
		 '''Emits when''' an element for which the grouping function returns a group that has not yet been created.
		 Emits the new group
		 
		
		
		 '''Backpressures when''' there is an element pending for a group whose substream backpressures
		 
		
		
		 '''Completes when''' upstream completes
		 
		
		
		 '''Cancels when''' downstream cancels and all substreams cancel
		 
		
		
		
		Parameters:
		`maxSubstreams` \- configures the maximum number of substreams (keys)
		 that are supported; if more distinct keys are encountered then the stream fails
		- #### splitWhen
		
		
		
		```
		public [SubSource](SubSource.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")> splitWhen​([Predicate](../../japi/function/Predicate.html "interface in akka.japi.function")<[Out](Source.html "type parameter in Source")> p)
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
		 it is a [`SubSource`](SubSource.html "class in akka.stream.javadsl"). This means that after this operator all transformations
		 are applied to all encountered substreams in the same fashion. Substream mode
		 is exited either by closing the substream (i.e. connecting it to a [`Sink`](Sink.html "class in akka.stream.javadsl"))
		 or by merging the substreams back together; see the `to` and `mergeBack` methods
		 on [`SubSource`](SubSource.html "class in akka.stream.javadsl") for more information.
		 
		
		
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
		 
		
		
		 '''Emits when''' an element for which the provided predicate is true, opening and emitting a new substream for subsequent element
		 
		
		
		 '''Backpressures when''' there is an element pending for the next substream, but the previous is not fully consumed yet, or the substream backpressures
		 
		
		
		 '''Completes when''' upstream completes
		 
		
		
		 '''Cancels when''' downstream cancels and substreams cancel
		 
		
		
		 See also `Source.splitAfter`.
		- #### splitWhen
		
		
		
		```
		public [SubSource](SubSource.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")> splitWhen​([SubstreamCancelStrategy](../SubstreamCancelStrategy.html "class in akka.stream") substreamCancelStrategy,
		                                          [Predicate](../../japi/function/Predicate.html "interface in akka.japi.function")<[Out](Source.html "type parameter in Source")> p)
		```
		
		This operation applies the given predicate to all incoming elements and
		 emits them to a stream of output streams, always beginning a new one with
		 the current element if the given predicate returns true for it.
		 
		
		See Also:
		[`splitWhen(akka.japi.function.Predicate<Out>)`](#splitWhen(akka.japi.function.Predicate))
		- #### splitAfter
		
		
		
		```
		public [SubSource](SubSource.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")> splitAfter​([Predicate](../../japi/function/Predicate.html "interface in akka.japi.function")<[Out](Source.html "type parameter in Source")> p)
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
		 it is a [`SubSource`](SubSource.html "class in akka.stream.javadsl"). This means that after this operator all transformations
		 are applied to all encountered substreams in the same fashion. Substream mode
		 is exited either by closing the substream (i.e. connecting it to a [`Sink`](Sink.html "class in akka.stream.javadsl"))
		 or by merging the substreams back together; see the `to` and `mergeBack` methods
		 on [`SubSource`](SubSource.html "class in akka.stream.javadsl") for more information.
		 
		
		
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
		 
		
		
		 '''Cancels when''' downstream cancels and substreams cancel
		 
		
		
		 See also `Source.splitWhen`.
		- #### splitAfter
		
		
		
		```
		public [SubSource](SubSource.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")> splitAfter​([SubstreamCancelStrategy](../SubstreamCancelStrategy.html "class in akka.stream") substreamCancelStrategy,
		                                           [Predicate](../../japi/function/Predicate.html "interface in akka.japi.function")<[Out](Source.html "type parameter in Source")> p)
		```
		
		This operation applies the given predicate to all incoming elements and
		 emits them to a stream of output streams. It \*ends\* the current substream when the
		 predicate is true.
		 
		
		See Also:
		[`splitAfter(akka.japi.function.Predicate<Out>)`](#splitAfter(akka.japi.function.Predicate))
		- #### flatMapConcat
		
		
		
		```
		public <T,​M> [Source](Source.html "class in akka.stream.javadsl")<T,​[Mat](Source.html "type parameter in Source")> flatMapConcat​([Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](Source.html "type parameter in Source"),​? extends [Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<T>,​M>> f)
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
		public <T,​M> [Source](Source.html "class in akka.stream.javadsl")<T,​[Mat](Source.html "type parameter in Source")> flatMapMerge​(int breadth,
		                                                    [Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](Source.html "type parameter in Source"),​? extends [Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<T>,​M>> f)
		```
		
		Transform each input element into a `Source` of output elements that is
		 then flattened into the output stream by merging, where at most `breadth`
		 substreams are being consumed at any given time.
		 
		 '''Emits when''' a currently consumed substream has an element available
		 
		
		
		 '''Backpressures when''' downstream backpressures
		 
		
		
		 '''Completes when''' upstream completes and all consumed substreams complete
		 
		
		
		 '''Cancels when''' downstream cancels
		- #### initialTimeout
		
		
		
		```
		public [Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")> initialTimeout​(java.time.Duration timeout)
		```
		
		If the first element has not passed through this operator before the provided timeout, the stream is failed
		 with a [`InitialTimeoutException`](../InitialTimeoutException.html "class in akka.stream").
		 
		 '''Emits when''' upstream emits an element
		 
		
		
		 '''Backpressures when''' downstream backpressures
		 
		
		
		 '''Completes when''' upstream completes or fails if timeout elapses before first element arrives
		 
		
		
		 '''Cancels when''' downstream cancels
		- #### completionTimeout
		
		
		
		```
		public [Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")> completionTimeout​(java.time.Duration timeout)
		```
		
		If the completion of the stream does not happen until the provided timeout, the stream is failed
		 with a [`CompletionTimeoutException`](../CompletionTimeoutException.html "class in akka.stream").
		 
		 '''Emits when''' upstream emits an element
		 
		
		
		 '''Backpressures when''' downstream backpressures
		 
		
		
		 '''Completes when''' upstream completes or fails if timeout elapses before upstream completes
		 
		
		
		 '''Cancels when''' downstream cancels
		- #### idleTimeout
		
		
		
		```
		public [Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")> idleTimeout​(java.time.Duration timeout)
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
		public [Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")> backpressureTimeout​(java.time.Duration timeout)
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
		public [Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")> keepAlive​(java.time.Duration maxIdle,
		                                       [Creator](../../japi/function/Creator.html "interface in akka.japi.function")<[Out](Source.html "type parameter in Source")> injectedElem)
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
		public [Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")> throttle​(int elements,
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
		public [Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")> throttle​(int elements,
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
		public [Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")> throttle​(int cost,
		                                      java.time.Duration per,
		                                      [Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](Source.html "type parameter in Source"),​java.lang.Integer> costCalculation)
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
		public [Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")> throttle​(int cost,
		                                      java.time.Duration per,
		                                      int maximumBurst,
		                                      [Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](Source.html "type parameter in Source"),​java.lang.Integer> costCalculation,
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
		public [Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")> throttle​([ThrottleControl](ThrottleControl.html "class in akka.stream.javadsl") control)
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
		public [Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")> throttle​([ThrottleControl](ThrottleControl.html "class in akka.stream.javadsl") control,
		                                      [Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](Source.html "type parameter in Source"),​java.lang.Integer> costCalculation)
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
		public [Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")> detach()
		```
		
		Detaches upstream demand from downstream demand without detaching the
		 stream rates; in other words acts like a buffer of size 1\.
		 
		 '''Emits when''' upstream emits an element
		 
		
		
		 '''Backpressures when''' downstream backpressures
		 
		
		
		 '''Completes when''' upstream completes
		 
		
		
		 '''Cancels when''' downstream cancels
		- #### watchTermination
		
		
		
		```
		public <M> [Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​M> watchTermination​([Function2](../../japi/function/Function2.html "interface in akka.japi.function")<[Mat](Source.html "type parameter in Source"),​java.util.concurrent.CompletionStage<[Done](../../Done.html "class in akka")>,​M> matF)
		```
		
		Materializes to `Future[Done]` that completes on getting termination message.
		 The Future completes with success when received complete message from upstream or cancel
		 from downstream. It fails with the same error when received error message from
		 downstream.
		 
		 It is recommended to use the internally optimized `Keep.left` and `Keep.right` combiners
		 where appropriate instead of manually writing functions that pass through one of the values.
		- #### monitorMat
		
		
		
		```
		public <M> [Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​M> monitorMat​([Function2](../../japi/function/Function2.html "interface in akka.japi.function")<[Mat](Source.html "type parameter in Source"),​[FlowMonitor](../FlowMonitor.html "interface in akka.stream")<[Out](Source.html "type parameter in Source")>,​M> combine)
		```
		
		Materializes to `FlowMonitor[Out]` that allows monitoring of the current flow. All events are propagated
		 by the monitor unchanged. Note that the monitor inserts a memory barrier every time it processes an
		 event, and may therefor affect performance.
		 The `combine` function is used to combine the `FlowMonitor` with this flow's materialized value.
		- #### monitor
		
		
		
		```
		public [Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​[Pair](../../japi/Pair.html "class in akka.japi")<[Mat](Source.html "type parameter in Source"),​[FlowMonitor](../FlowMonitor.html "interface in akka.stream")<[Out](Source.html "type parameter in Source")>>> monitor()
		```
		
		Materializes to `Pair>`, which is unlike most other operators (!),
		 in which usually the default materialized value keeping semantics is to keep the left value
		 (by passing `Keep.left()` to a `*Mat` version of a method). This operator is an exception from
		 that rule and keeps both values since dropping its sole purpose is to introduce that materialized value.
		 
		 The `FlowMonitor` allows monitoring of the current flow. All events are propagated
		 by the monitor unchanged. Note that the monitor inserts a memory barrier every time it processes an
		 event, and may therefor affect performance.
		- #### initialDelay
		
		
		
		```
		public [Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")> initialDelay​(java.time.Duration delay)
		```
		
		Delays the initial element by the specified duration.
		 
		 '''Emits when''' upstream emits an element if the initial delay is already elapsed
		 
		
		
		 '''Backpressures when''' downstream backpressures or initial delay is not yet elapsed
		 
		
		
		 '''Completes when''' upstream completes
		 
		
		
		 '''Cancels when''' downstream cancels
		- #### withAttributes
		
		
		
		```
		public [Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")> withAttributes​([Attributes](../Attributes.html "class in akka.stream") attr)
		```
		
		Replace the attributes of this [`Source`](Source.html "class in akka.stream.javadsl") with the given ones. If this Source is a composite
		 of multiple graphs, new attributes on the composite will be less specific than attributes
		 set directly on the individual graphs of the composite.
		
		Specified by:
		`[withAttributes](../Graph.html#withAttributes(akka.stream.Attributes))` in interface `[Graph](../Graph.html "interface in akka.stream")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")>`
		- #### addAttributes
		
		
		
		```
		public [Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")> addAttributes​([Attributes](../Attributes.html "class in akka.stream") attr)
		```
		
		Add the given attributes to this [`Source`](Source.html "class in akka.stream.javadsl"). If the specific attribute was already present
		 on this graph this means the added attribute will be more specific than the existing one.
		 If this Source is a composite of multiple graphs, new attributes on the composite will be
		 less specific than attributes set directly on the individual graphs of the composite.
		
		Specified by:
		`[addAttributes](../Graph.html#addAttributes(akka.stream.Attributes))` in interface `[Graph](../Graph.html "interface in akka.stream")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")>`
		- #### named
		
		
		
		```
		public [Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")> named​(java.lang.String name)
		```
		
		Add a name attribute to this Source.
		
		Specified by:
		`[named](../Graph.html#named(java.lang.String))` in interface `[Graph](../Graph.html "interface in akka.stream")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")>`
		- #### async
		
		
		
		```
		public [Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")> async()
		```
		
		Put an asynchronous boundary around this `Source`
		
		Specified by:
		`[async](../Graph.html#async())` in interface `[Graph](../Graph.html "interface in akka.stream")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")>`
		- #### async
		
		
		
		```
		public [Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")> async​(java.lang.String dispatcher)
		```
		
		Put an asynchronous boundary around this `Source`
		
		
		Specified by:
		`[async](../Graph.html#async(java.lang.String))` in interface `[Graph](../Graph.html "interface in akka.stream")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")>`
		Parameters:
		`dispatcher` \- Run the graph on this dispatcher
		- #### async
		
		
		
		```
		public [Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")> async​(java.lang.String dispatcher,
		                                   int inputBufferSize)
		```
		
		Put an asynchronous boundary around this `Source`
		
		
		Specified by:
		`[async](../Graph.html#async(java.lang.String,int))` in interface `[Graph](../Graph.html "interface in akka.stream")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")>`
		Parameters:
		`dispatcher` \- Run the graph on this dispatcher
		`inputBufferSize` \- Set the input buffer to this size for the graph
		- #### log
		
		
		
		```
		public [Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")> log​(java.lang.String name,
		                                 [Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](Source.html "type parameter in Source"),​java.lang.Object> extract,
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
		public [Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")> log​(java.lang.String name,
		                                 [Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](Source.html "type parameter in Source"),​java.lang.Object> extract)
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
		public [Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")> log​(java.lang.String name,
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
		public [Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")> log​(java.lang.String name)
		```
		
		Logs elements flowing through the stream as well as completion and erroring.
		 
		 By default element and completion signals are logged on debug level, and errors are logged on Error level.
		 This can be adjusted according to your needs by providing a custom `Attributes.LogLevels` attribute on the given Flow:
		 
		
		
		 Uses an internally created `LoggingAdapter` which uses `akka.stream.Log` as it's source (use this class to configure slf4j loggers).
		 
		
		
		 '''Emits when''' the mapping function returns an element
		 
		
		
		 '''Backpressures when''' downstream backpressures
		 
		
		
		 '''Completes when''' upstream completes
		 
		
		
		 '''Cancels when''' downstream cancels
		- #### logWithMarker
		
		
		
		```
		public [Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")> logWithMarker​(java.lang.String name,
		                                           [Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](Source.html "type parameter in Source"),​[LogMarker](../../event/LogMarker.html "class in akka.event")> marker,
		                                           [Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](Source.html "type parameter in Source"),​java.lang.Object> extract,
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
		public [Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")> logWithMarker​(java.lang.String name,
		                                           [Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](Source.html "type parameter in Source"),​[LogMarker](../../event/LogMarker.html "class in akka.event")> marker,
		                                           [Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](Source.html "type parameter in Source"),​java.lang.Object> extract)
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
		public [Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")> logWithMarker​(java.lang.String name,
		                                           [Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](Source.html "type parameter in Source"),​[LogMarker](../../event/LogMarker.html "class in akka.event")> marker,
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
		public [Source](Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")> logWithMarker​(java.lang.String name,
		                                           [Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](Source.html "type parameter in Source"),​[LogMarker](../../event/LogMarker.html "class in akka.event")> marker)
		```
		
		Logs elements flowing through the stream as well as completion and erroring.
		 
		 By default element and completion signals are logged on debug level, and errors are logged on Error level.
		 This can be adjusted according to your needs by providing a custom `Attributes.LogLevels` attribute on the given Flow:
		 
		
		
		 Uses an internally created `MarkerLoggingAdapter` which uses `akka.stream.Log` as it's source (use this class to configure slf4j loggers).
		 
		
		
		 '''Emits when''' the mapping function returns an element
		 
		
		
		 '''Backpressures when''' downstream backpressures
		 
		
		
		 '''Completes when''' upstream completes
		 
		
		
		 '''Cancels when''' downstream cancels
		- #### asSourceWithContext
		
		
		
		```
		public <Ctx> [SourceWithContext](SourceWithContext.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​Ctx,​[Mat](Source.html "type parameter in Source")> asSourceWithContext​([Function](../../japi/function/Function.html "interface in akka.japi.function")<[Out](Source.html "type parameter in Source"),​Ctx> extractContext)
		```
		
		Transform this source whose element is e into a source producing tuple (e, f(e))
		- #### aggregateWithBoundary
		
		
		
		```
		public <Agg,​Emit> [Source](Source.html "class in akka.stream.javadsl")<Emit,​[Mat](Source.html "type parameter in Source")> aggregateWithBoundary​(java.util.function.Supplier<Agg> allocate,
		                                                                     [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<Agg,​[Out](Source.html "type parameter in Source"),​[Pair](../../japi/Pair.html "class in akka.japi")<Agg,​java.lang.Object>> aggregate,
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
		`[getAttributes](../Graph.html#getAttributes())` in interface `[Graph](../Graph.html "interface in akka.stream")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")>`

## Code Examples

### Example 1: fromIterator

```text
List<Integer> data = new ArrayList<Integer>();
 data.add(1);
 data.add(2);
 data.add(3);
 Source.from(() -> data.iterator());
```

### Example 2: cycle

```text
Source.cycle(() -> Arrays.asList(1, 2, 3).iterator());
```

### Example 3: from

```text
List<Integer> data = new ArrayList<Integer>();
 data.add(1);
 data.add(2);
 data.add(3);
 Source.from(data);
```

### Example 4: unfoldResource

```text
Source.unfoldResource(
   () -> new BufferedReader(new FileReader("...")),
   reader -> reader.readLine(),
   reader -> reader.close())
```

### Example 5: upcast

```text
Source<Apple, NotUsed> apples = Source.single(new Apple());
 Source<Orange, NotUsed> oranges = Source.single(new Orange());
 Source<Fruit, NotUsed> appleFruits = Source.upcast(apples);
 Source<Fruit, NotUsed> orangeFruits = Source.upcast(oranges);

 Source<Fruit, NotUsed> fruits = appleFruits.merge(orangeFruits);
```

### Example 6: via

```text
+----------------------------+
     | Resulting Source           |
     |                            |
     |  +------+        +------+  |
     |  |      |        |      |  |
     |  | this | ~Out~> | flow | ~~> T
     |  |      |        |      |  |
     |  +------+        +------+  |
     +----------------------------+
```

### Example 7: viaMat

```text
+----------------------------+
     | Resulting Source           |
     |                            |
     |  +------+        +------+  |
     |  |      |        |      |  |
     |  | this | ~Out~> | flow | ~~> T
     |  |      |        |      |  |
     |  +------+        +------+  |
     +----------------------------+
```

### Example 8: to

```text
+----------------------------+
     | Resulting RunnableGraph    |
     |                            |
     |  +------+        +------+  |
     |  |      |        |      |  |
     |  | this | ~Out~> | sink |  |
     |  |      |        |      |  |
     |  +------+        +------+  |
     +----------------------------+
```

### Example 9: toMat

```text
+----------------------------+
     | Resulting RunnableGraph    |
     |                            |
     |  +------+        +------+  |
     |  |      |        |      |  |
     |  | this | ~Out~> | sink |  |
     |  |      |        |      |  |
     |  +------+        +------+  |
     +----------------------------+
```

### Example 10: interleave

```text
Source.from(Arrays.asList(1, 2, 3)).interleave(Source.from(Arrays.asList(4, 5, 6, 7), 2)
 // 1, 2, 4, 5, 3, 6, 7
```

### Example 11: intersperse

```text
Source<Integer, ?> nums = Source.from(Arrays.asList(0, 1, 2, 3));
 nums.intersperse(",");            //   1 , 2 , 3
 nums.intersperse("[", ",", "]");  // [ 1 , 2 , 3 ]
```

### Example 12: intersperse

```text
Source.single(">> ").concat(list.intersperse(","))
 list.intersperse(",").concat(Source.single("END"))
```

### Example 13: intersperse

```text
Source<Integer, ?> nums = Source.from(Arrays.asList(0, 1, 2, 3));
 nums.intersperse(",");            //   1 , 2 , 3
 nums.intersperse("[", ",", "]");  // [ 1 , 2 , 3 ]
```

### Example 14: splitWhen

```text
false,             // element goes into first substream
 true, false,       // elements go into second substream
 true, false, false // elements go into third substream
```

### Example 15: splitWhen

```text
true, false, false // first substream starts from the split-by element
 true, false        // subsequent substreams operate the same way
```

### Example 16: splitAfter

```text
false, true,        // elements go into first substream
 false, true,        // elements go into second substream
 false, false, true  // elements go into third substream
```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/Done.html
- https://doc.akka.io/japi/akka/current/akka/NotUsed.html
- https://doc.akka.io/japi/akka/current/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka/current/akka/actor/Cancellable.html
- https://doc.akka.io/japi/akka/current/akka/actor/ClassicActorSystemProvider.html
- https://doc.akka.io/japi/akka/current/akka/actor/PoisonPill.html
- https://doc.akka.io/japi/akka/current/akka/actor/Status.Failure.html
- https://doc.akka.io/japi/akka/current/akka/actor/Status.Success.html
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
- https://doc.akka.io/japi/akka/current/akka/stream/BoundedSourceQueue.html
- https://doc.akka.io/japi/akka/current/akka/stream/CompletionStrategy.html
- https://doc.akka.io/japi/akka/current/akka/stream/CompletionTimeoutException.html
- https://doc.akka.io/japi/akka/current/akka/stream/DelayOverflowStrategy.html
- https://doc.akka.io/japi/akka/current/akka/stream/FlowMonitor.html
- https://doc.akka.io/japi/akka/current/akka/stream/FlowShape.html
- https://doc.akka.io/japi/akka/current/akka/stream/Graph.GraphMapMatVal.html
- https://doc.akka.io/japi/akka/current/akka/stream/Graph.html
- https://doc.akka.io/japi/akka/current/akka/stream/InitialTimeoutException.html
- https://doc.akka.io/japi/akka/current/akka/stream/Materializer.html
- https://doc.akka.io/japi/akka/current/akka/stream/NeverMaterializedException.html
- https://doc.akka.io/japi/akka/current/akka/stream/OverflowStrategy.html
- https://doc.akka.io/japi/akka/current/akka/stream/QueueOfferResult.html
- https://doc.akka.io/japi/akka/current/akka/stream/Shape.html
- https://doc.akka.io/japi/akka/current/akka/stream/SinkShape.html
- https://doc.akka.io/japi/akka/current/akka/stream/SourceShape.html
- https://doc.akka.io/japi/akka/current/akka/stream/StreamIdleTimeoutException.html
- https://doc.akka.io/japi/akka/current/akka/stream/SubstreamCancelStrategy.html
- https://doc.akka.io/japi/akka/current/akka/stream/Supervision.html
- https://doc.akka.io/japi/akka/current/akka/stream/SystemMaterializer.html
- https://doc.akka.io/japi/akka/current/akka/stream/ThrottleMode.html
- https://doc.akka.io/japi/akka/current/akka/stream/UniformFanInShape.html
- https://doc.akka.io/japi/akka/current/akka/stream/WatchedActorTerminatedException.html
- https://doc.akka.io/japi/akka/current/akka/stream/javadsl/Concat.html
- https://doc.akka.io/japi/akka/current/akka/stream/javadsl/DelayStrategy.html
- https://doc.akka.io/japi/akka/current/akka/stream/javadsl/Flow.html
- https://doc.akka.io/japi/akka/current/akka/stream/javadsl/Merge.html
- https://doc.akka.io/japi/akka/current/akka/stream/javadsl/RunnableGraph.html
- https://doc.akka.io/japi/akka/current/akka/stream/javadsl/Sink.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/stream/javadsl/Source.html](https://doc.akka.io/japi/akka/current/akka/stream/javadsl/Source.html)*