---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:02:12Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/2.10/akka/stream/javadsl/Source$.html
title: Source$
---

# Source$

## Content

Package [akka.stream.javadsl](package-summary.html)
## Class Source$

- java.lang.Object
- - akka.stream.javadsl.Source$

- ---

```
public class Source$
extends java.lang.Object
```

Java API

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Source$](Source$.html "class in akka.stream.javadsl")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Source$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) [Deprecated Methods](javascript:show(32);) 
	| Modifier and Type | Method | Description |
	| `<T> [Source](Source.html "class in akka.stream.javadsl")<T,​[ActorRef](../../actor/ActorRef.html "class in akka.actor")>` | `[actorRef](#actorRef(int,akka.stream.OverflowStrategy))​(int bufferSize,  [OverflowStrategy](../OverflowStrategy.html "class in akka.stream") overflowStrategy)` | Deprecated. Use variant accepting completion and failure matchers. |
	| `<T> [Source](Source.html "class in akka.stream.javadsl")<T,​[ActorRef](../../actor/ActorRef.html "class in akka.actor")>` | `[actorRef](#actorRef(akka.japi.function.Function,akka.japi.function.Function,int,akka.stream.OverflowStrategy))​([Function](../../japi/function/Function.html "interface in akka.japi.function")<java.lang.Object,​java.util.Optional<[CompletionStrategy](../CompletionStrategy.html "interface in akka.stream")>> completionMatcher,  [Function](../../japi/function/Function.html "interface in akka.japi.function")<java.lang.Object,​java.util.Optional<java.lang.Throwable>> failureMatcher,  int bufferSize,  [OverflowStrategy](../OverflowStrategy.html "class in akka.stream") overflowStrategy)` | Creates a `Source` that is materialized as an [`ActorRef`](../../actor/ActorRef.html "class in akka.actor"). |
	| `<T> [Source](Source.html "class in akka.stream.javadsl")<T,​[ActorRef](../../actor/ActorRef.html "class in akka.actor")>` | `[actorRefWithAck](#actorRefWithAck(java.lang.Object))​(java.lang.Object ackMessage)` | Deprecated. Use actorRefWithBackpressure accepting completion and failure matchers. |
	| `<T> [Source](Source.html "class in akka.stream.javadsl")<T,​[ActorRef](../../actor/ActorRef.html "class in akka.actor")>` | `[actorRefWithAck](#actorRefWithAck(java.lang.Object,akka.japi.function.Function,akka.japi.function.Function))​(java.lang.Object ackMessage,  [Function](../../japi/function/Function.html "interface in akka.japi.function")<java.lang.Object,​java.util.Optional<[CompletionStrategy](../CompletionStrategy.html "interface in akka.stream")>> completionMatcher,  [Function](../../japi/function/Function.html "interface in akka.japi.function")<java.lang.Object,​java.util.Optional<java.lang.Throwable>> failureMatcher)` | Deprecated. Use actorRefWithBackpressure instead |
	| `<T> [Source](Source.html "class in akka.stream.javadsl")<T,​[ActorRef](../../actor/ActorRef.html "class in akka.actor")>` | `[actorRefWithBackpressure](#actorRefWithBackpressure(java.lang.Object,akka.japi.function.Function,akka.japi.function.Function))​(java.lang.Object ackMessage,  [Function](../../japi/function/Function.html "interface in akka.japi.function")<java.lang.Object,​java.util.Optional<[CompletionStrategy](../CompletionStrategy.html "interface in akka.stream")>> completionMatcher,  [Function](../../japi/function/Function.html "interface in akka.japi.function")<java.lang.Object,​java.util.Optional<java.lang.Throwable>> failureMatcher)` | Creates a `Source` that is materialized as an [`ActorRef`](../../actor/ActorRef.html "class in akka.actor"). |
	| `<T> [Source](Source.html "class in akka.stream.javadsl")<T,​org.reactivestreams.Subscriber<T>>` | `[asSubscriber](#asSubscriber())()` | Creates a `Source` that is materialized as a `Subscriber` |
	| `<T,​U>[Source](Source.html "class in akka.stream.javadsl")<U,​[NotUsed](../../NotUsed.html "class in akka")>` | `[combine](#combine(akka.stream.javadsl.Source,akka.stream.javadsl.Source,java.util.List,akka.japi.function.Function))​([Source](Source.html "class in akka.stream.javadsl")<T,​?> first,  [Source](Source.html "class in akka.stream.javadsl")<T,​?> second,  java.util.List<[Source](Source.html "class in akka.stream.javadsl")<T,​?>> rest,  [Function](../../japi/function/Function.html "interface in akka.japi.function")<java.lang.Integer,​? extends [Graph](../Graph.html "interface in akka.stream")<[UniformFanInShape](../UniformFanInShape.html "class in akka.stream")<T,​U>,​[NotUsed](../../NotUsed.html "class in akka")>> fanInStrategy)` | Combines several sources with fan\-in strategy like [`Merge`](Merge.html "class in akka.stream.javadsl") or [`Concat`](Concat.html "class in akka.stream.javadsl") into a single [`Source`](Source.html "class in akka.stream.javadsl"). |
	| `<T,​U,​M>[Source](Source.html "class in akka.stream.javadsl")<U,​java.util.List<M>>` | `[combine](#combine(java.util.List,akka.japi.function.Function))​(java.util.List<? extends [Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<T>,​M>> sources,  [Function](../../japi/function/Function.html "interface in akka.japi.function")<java.lang.Integer,​[Graph](../Graph.html "interface in akka.stream")<[UniformFanInShape](../UniformFanInShape.html "class in akka.stream")<T,​U>,​[NotUsed](../../NotUsed.html "class in akka")>> fanInStrategy)` | Combines several sources with fan\-in strategy like [`Merge`](Merge.html "class in akka.stream.javadsl") or [`Concat`](Concat.html "class in akka.stream.javadsl") into a single [`Source`](Source.html "class in akka.stream.javadsl"). |
	| `<T,​U,​M1,​M2,​M>[Source](Source.html "class in akka.stream.javadsl")<U,​M>` | `[combineMat](#combineMat(akka.stream.javadsl.Source,akka.stream.javadsl.Source,akka.japi.function.Function,akka.japi.function.Function2))​([Source](Source.html "class in akka.stream.javadsl")<T,​M1> first,  [Source](Source.html "class in akka.stream.javadsl")<T,​M2> second,  [Function](../../japi/function/Function.html "interface in akka.japi.function")<java.lang.Integer,​? extends [Graph](../Graph.html "interface in akka.stream")<[UniformFanInShape](../UniformFanInShape.html "class in akka.stream")<T,​U>,​[NotUsed](../../NotUsed.html "class in akka")>> fanInStrategy,  [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<M1,​M2,​M> matF)` | Combines two sources with fan\-in strategy like `Merge` or `Concat` and returns `Source` with a materialized value. |
	| `<T> [Source](Source.html "class in akka.stream.javadsl")<T,​[NotUsed](../../NotUsed.html "class in akka")>` | `[completionStage](#completionStage(java.util.concurrent.CompletionStage))​(java.util.concurrent.CompletionStage<T> completionStage)` | Emits a single value when the given `CompletionStage` is successfully completed and then completes the stream. |
	| `<T,​M>[Source](Source.html "class in akka.stream.javadsl")<T,​java.util.concurrent.CompletionStage<M>>` | `[completionStageSource](#completionStageSource(java.util.concurrent.CompletionStage))​(java.util.concurrent.CompletionStage<[Source](Source.html "class in akka.stream.javadsl")<T,​M>> completionStageSource)` | Turn a `CompletionStage[Source]` into a source that will emit the values of the source when the future completes successfully. |
	| `<O> [Source](Source.html "class in akka.stream.javadsl")<O,​[NotUsed](../../NotUsed.html "class in akka")>` | `[cycle](#cycle(akka.japi.function.Creator))​([Creator](../../japi/function/Creator.html "interface in akka.japi.function")<java.util.Iterator<O>> f)` | Helper to create a 'cycled' [`Source`](Source.html "class in akka.stream.javadsl") that will continually produce elements in the order  they are provided. |
	| `<O> [Source](Source.html "class in akka.stream.javadsl")<O,​[NotUsed](../../NotUsed.html "class in akka")>` | `[empty](#empty())()` | Create a `Source` with no elements, i.e. |
	| `<T> [Source](Source.html "class in akka.stream.javadsl")<T,​[NotUsed](../../NotUsed.html "class in akka")>` | `[empty](#empty(java.lang.Class))​(java.lang.Class<T> clazz)` | Create a `Source` with no elements. |
	| `<T> [Source](Source.html "class in akka.stream.javadsl")<T,​[NotUsed](../../NotUsed.html "class in akka")>` | `[failed](#failed(java.lang.Throwable))​(java.lang.Throwable cause)` | Create a `Source` that immediately ends the stream with the `cause` failure to every connected `Sink`. |
	| `<O> [Source](Source.html "class in akka.stream.javadsl")<O,​[NotUsed](../../NotUsed.html "class in akka")>` | `[from](#from(java.lang.Iterable))​(java.lang.Iterable<O> iterable)` | Helper to create [`Source`](Source.html "class in akka.stream.javadsl") from `Iterable`. |
	| `<O> [Source](Source.html "class in akka.stream.javadsl")<O,​[NotUsed](../../NotUsed.html "class in akka")>` | `[fromCompletionStage](#fromCompletionStage(java.util.concurrent.CompletionStage))​(java.util.concurrent.CompletionStage<O> future)` | Deprecated. Use 'Source.completionStage' instead. |
	| `<O> [Source](Source.html "class in akka.stream.javadsl")<O,​[NotUsed](../../NotUsed.html "class in akka")>` | `[fromFuture](#fromFuture(scala.concurrent.Future))​(scala.concurrent.Future<O> future)` | Deprecated. Use 'Source.future' instead. |
	| `<T,​M>[Source](Source.html "class in akka.stream.javadsl")<T,​scala.concurrent.Future<M>>` | `[fromFutureSource](#fromFutureSource(scala.concurrent.Future))​(scala.concurrent.Future<? extends [Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<T>,​M>> future)` | Deprecated. Use 'Source.futureSource' (potentially together with \`Source.fromGraph\`) instead. |
	| `<T,​M>[Source](Source.html "class in akka.stream.javadsl")<T,​M>` | `[fromGraph](#fromGraph(akka.stream.Graph))​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<T>,​M> g)` | A graph with the shape of a source logically is a source, this method makes  it so also in type. |
	| `<O> [Source](Source.html "class in akka.stream.javadsl")<O,​[NotUsed](../../NotUsed.html "class in akka")>` | `[fromIterator](#fromIterator(akka.japi.function.Creator))​([Creator](../../japi/function/Creator.html "interface in akka.japi.function")<java.util.Iterator<O>> f)` | Helper to create a [`Source`](Source.html "class in akka.stream.javadsl") from an `Iterator`. |
	| `<O,​S extends java.util.stream.BaseStream<O,​S>>[Source](Source.html "class in akka.stream.javadsl")<O,​[NotUsed](../../NotUsed.html "class in akka")>` | `[fromJavaStream](#fromJavaStream(akka.japi.function.Creator))​([Creator](../../japi/function/Creator.html "interface in akka.japi.function")<java.util.stream.BaseStream<O,​S>> stream)` | Creates a source that wraps a Java 8 Stream. |
	| `<T,​M>[Source](Source.html "class in akka.stream.javadsl")<T,​java.util.concurrent.CompletionStage<M>>` | `[fromMaterializer](#fromMaterializer(java.util.function.BiFunction))​(java.util.function.BiFunction<[Materializer](../Materializer.html "class in akka.stream"),​[Attributes](../Attributes.html "class in akka.stream"),​[Source](Source.html "class in akka.stream.javadsl")<T,​M>> factory)` | Defers the creation of a [`Source`](Source.html "class in akka.stream.javadsl") until materialization. |
	| `<O> [Source](Source.html "class in akka.stream.javadsl")<O,​[NotUsed](../../NotUsed.html "class in akka")>` | `[fromPublisher](#fromPublisher(org.reactivestreams.Publisher))​(org.reactivestreams.Publisher<O> publisher)` | Helper to create [`Source`](Source.html "class in akka.stream.javadsl") from `Publisher`. |
	| `<T,​M>[Source](Source.html "class in akka.stream.javadsl")<T,​java.util.concurrent.CompletionStage<M>>` | `[fromSourceCompletionStage](#fromSourceCompletionStage(java.util.concurrent.CompletionStage))​(java.util.concurrent.CompletionStage<? extends [Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<T>,​M>> completion)` | Deprecated. Use 'Source.completionStageSource' (potentially together with \`Source.fromGraph\`) instead. |
	| `<T> [Source](Source.html "class in akka.stream.javadsl")<T,​[NotUsed](../../NotUsed.html "class in akka")>` | `[future](#future(scala.concurrent.Future))​(scala.concurrent.Future<T> futureElement)` | Emits a single value when the given Scala `Future` is successfully completed and then completes the stream. |
	| `<T,​M>[Source](Source.html "class in akka.stream.javadsl")<T,​java.util.concurrent.CompletionStage<M>>` | `[lazily](#lazily(akka.japi.function.Creator))​([Creator](../../japi/function/Creator.html "interface in akka.japi.function")<[Source](Source.html "class in akka.stream.javadsl")<T,​M>> create)` | Deprecated. Use 'Source.lazySource' instead. |
	| `<T> [Source](Source.html "class in akka.stream.javadsl")<T,​scala.concurrent.Future<[NotUsed](../../NotUsed.html "class in akka")>>` | `[lazilyAsync](#lazilyAsync(akka.japi.function.Creator))​([Creator](../../japi/function/Creator.html "interface in akka.japi.function")<java.util.concurrent.CompletionStage<T>> create)` | Deprecated. Use 'Source.lazyCompletionStage' instead. |
	| `<T> [Source](Source.html "class in akka.stream.javadsl")<T,​[NotUsed](../../NotUsed.html "class in akka")>` | `[lazyCompletionStage](#lazyCompletionStage(akka.japi.function.Creator))​([Creator](../../japi/function/Creator.html "interface in akka.japi.function")<java.util.concurrent.CompletionStage<T>> create)` | Defers invoking the `create` function to create a future element until there is downstream demand. |
	| `<T,​M>[Source](Source.html "class in akka.stream.javadsl")<T,​java.util.concurrent.CompletionStage<M>>` | `[lazyCompletionStageSource](#lazyCompletionStageSource(akka.japi.function.Creator))​([Creator](../../japi/function/Creator.html "interface in akka.japi.function")<java.util.concurrent.CompletionStage<[Source](Source.html "class in akka.stream.javadsl")<T,​M>>> create)` | Defers invoking the `create` function to create a future source until there is downstream demand. |
	| `<T> [Source](Source.html "class in akka.stream.javadsl")<T,​[NotUsed](../../NotUsed.html "class in akka")>` | `[lazySingle](#lazySingle(akka.japi.function.Creator))​([Creator](../../japi/function/Creator.html "interface in akka.japi.function")<T> create)` | Defers invoking the `create` function to create a single element until there is downstream demand. |
	| `<T,​M>[Source](Source.html "class in akka.stream.javadsl")<T,​java.util.concurrent.CompletionStage<M>>` | `[lazySource](#lazySource(akka.japi.function.Creator))​([Creator](../../japi/function/Creator.html "interface in akka.japi.function")<[Source](Source.html "class in akka.stream.javadsl")<T,​M>> create)` | Defers invoking the `create` function to create a future source until there is downstream demand. |
	| `<T> [Source](Source.html "class in akka.stream.javadsl")<T,​java.util.concurrent.CompletableFuture<java.util.Optional<T>>>` | `[maybe](#maybe())()` | Create a `Source` which materializes a `CompletableFuture` which controls what element  will be emitted by the Source. |
	| `<T> [Source](Source.html "class in akka.stream.javadsl")<T,​[NotUsed](../../NotUsed.html "class in akka")>` | `[mergePrioritizedN](#mergePrioritizedN(java.util.List,boolean))​(java.util.List<[Pair](../../japi/Pair.html "class in akka.japi")<[Source](Source.html "class in akka.stream.javadsl")<T,​?>,​java.lang.Integer>> sourcesAndPriorities,  boolean eagerComplete)` | Merge multiple [`Source`](Source.html "class in akka.stream.javadsl")s. |
	| `<T> [Source](Source.html "class in akka.stream.javadsl")<T,​[NotUsed](../../NotUsed.html "class in akka")>` | `[never](#never())()` | Never emits any elements, never completes and never fails. |
	| `<T> [Source](Source.html "class in akka.stream.javadsl")<T,​[BoundedSourceQueue](../BoundedSourceQueue.html "interface in akka.stream")<T>>` | `[queue](#queue(int))​(int bufferSize)` | Creates a `Source` that is materialized as an [`BoundedSourceQueue`](../BoundedSourceQueue.html "interface in akka.stream"). |
	| `<T> [Source](Source.html "class in akka.stream.javadsl")<T,​[SourceQueueWithComplete](SourceQueueWithComplete.html "interface in akka.stream.javadsl")<T>>` | `[queue](#queue(int,akka.stream.OverflowStrategy))​(int bufferSize,  [OverflowStrategy](../OverflowStrategy.html "class in akka.stream") overflowStrategy)` | Creates a `Source` that is materialized as an [`SourceQueueWithComplete`](SourceQueueWithComplete.html "interface in akka.stream.javadsl"). |
	| `<T> [Source](Source.html "class in akka.stream.javadsl")<T,​[SourceQueueWithComplete](SourceQueueWithComplete.html "interface in akka.stream.javadsl")<T>>` | `[queue](#queue(int,akka.stream.OverflowStrategy,int))​(int bufferSize,  [OverflowStrategy](../OverflowStrategy.html "class in akka.stream") overflowStrategy,  int maxConcurrentOffers)` | Creates a `Source` that is materialized as an [`SourceQueueWithComplete`](SourceQueueWithComplete.html "interface in akka.stream.javadsl"). |
	| `[Source](Source.html "class in akka.stream.javadsl")<java.lang.Integer,​[NotUsed](../../NotUsed.html "class in akka")>` | `[range](#range(int,int))​(int start,  int end)` | Creates [`Source`](Source.html "class in akka.stream.javadsl") that represents integer values in range ''\[start;end]'', step equals to 1\. |
	| `[Source](Source.html "class in akka.stream.javadsl")<java.lang.Integer,​[NotUsed](../../NotUsed.html "class in akka")>` | `[range](#range(int,int,int))​(int start,  int end,  int step)` | Creates [`Source`](Source.html "class in akka.stream.javadsl") that represents integer values in range ''\[start;end]'', with the given step. |
	| `<T> [Source](Source.html "class in akka.stream.javadsl")<T,​[NotUsed](../../NotUsed.html "class in akka")>` | `[repeat](#repeat(T))​(T element)` | Create a `Source` that will continually emit the given element. |
	| `<T,​M>[Source](Source.html "class in akka.stream.javadsl")<T,​java.util.concurrent.CompletionStage<M>>` | `[setup](#setup(java.util.function.BiFunction))​(java.util.function.BiFunction<[ActorMaterializer](../ActorMaterializer.html "class in akka.stream"),​[Attributes](../Attributes.html "class in akka.stream"),​[Source](Source.html "class in akka.stream.javadsl")<T,​M>> factory)` | Deprecated. Use 'fromMaterializer' instead. |
	| `<T> [Source](Source.html "class in akka.stream.javadsl")<T,​[NotUsed](../../NotUsed.html "class in akka")>` | `[single](#single(T))​(T element)` | Create a `Source` with one element. |
	| `<O> [Source](Source.html "class in akka.stream.javadsl")<O,​[Cancellable](../../actor/Cancellable.html "interface in akka.actor")>` | `[tick](#tick(java.time.Duration,java.time.Duration,O))​(java.time.Duration initialDelay,  java.time.Duration interval,  O tick)` | Elements are emitted periodically with the specified interval. |
	| `<S,​E>[Source](Source.html "class in akka.stream.javadsl")<E,​[NotUsed](../../NotUsed.html "class in akka")>` | `[unfold](#unfold(S,akka.japi.function.Function))​(S s,  [Function](../../japi/function/Function.html "interface in akka.japi.function")<S,​java.util.Optional<[Pair](../../japi/Pair.html "class in akka.japi")<S,​E>>> f)` | Create a `Source` that will unfold a value of type `S` into  a pair of the next state `S` and output elements of type `E`. |
	| `<S,​E>[Source](Source.html "class in akka.stream.javadsl")<E,​[NotUsed](../../NotUsed.html "class in akka")>` | `[unfoldAsync](#unfoldAsync(S,akka.japi.function.Function))​(S s,  [Function](../../japi/function/Function.html "interface in akka.japi.function")<S,​java.util.concurrent.CompletionStage<java.util.Optional<[Pair](../../japi/Pair.html "class in akka.japi")<S,​E>>>> f)` | Same as [`<S,E>unfold(S,akka.japi.function.Function<S,java.util.Optional<akka.japi.Pair<S,E>>>)`](#unfold(S,akka.japi.function.Function)), but uses an async function to generate the next state\-element tuple. |
	| `<T,​S>[Source](Source.html "class in akka.stream.javadsl")<T,​[NotUsed](../../NotUsed.html "class in akka")>` | `[unfoldResource](#unfoldResource(akka.japi.function.Creator,akka.japi.function.Function,akka.japi.function.Procedure))​([Creator](../../japi/function/Creator.html "interface in akka.japi.function")<S> create,  [Function](../../japi/function/Function.html "interface in akka.japi.function")<S,​java.util.Optional<T>> read,  [Procedure](../../japi/function/Procedure.html "interface in akka.japi.function")<S> close)` | Start a new `Source` from some resource which can be opened, read and closed. |
	| `<T,​S>[Source](Source.html "class in akka.stream.javadsl")<T,​[NotUsed](../../NotUsed.html "class in akka")>` | `[unfoldResourceAsync](#unfoldResourceAsync(akka.japi.function.Creator,akka.japi.function.Function,akka.japi.function.Function))​([Creator](../../japi/function/Creator.html "interface in akka.japi.function")<java.util.concurrent.CompletionStage<S>> create,  [Function](../../japi/function/Function.html "interface in akka.japi.function")<S,​java.util.concurrent.CompletionStage<java.util.Optional<T>>> read,  [Function](../../japi/function/Function.html "interface in akka.japi.function")<S,​java.util.concurrent.CompletionStage<[Done](../../Done.html "class in akka")>> close)` | Start a new `Source` from some resource which can be opened, read and closed. |
	| `<SuperOut,​Out extends SuperOut,​Mat>[Source](Source.html "class in akka.stream.javadsl")<SuperOut,​Mat>` | `[upcast](#upcast(akka.stream.javadsl.Source))​([Source](Source.html "class in akka.stream.javadsl")<Out,​Mat> source)` | Upcast a stream of elements to a stream of supertypes of that element. |
	| `<T> [Source](Source.html "class in akka.stream.javadsl")<java.util.List<T>,​[NotUsed](../../NotUsed.html "class in akka")>` | `[zipN](#zipN(java.util.List))​(java.util.List<[Source](Source.html "class in akka.stream.javadsl")<T,​?>> sources)` | Combine the elements of multiple streams into a stream of lists. |
	| `<T,​O>[Source](Source.html "class in akka.stream.javadsl")<O,​[NotUsed](../../NotUsed.html "class in akka")>` | `[zipWithN](#zipWithN(akka.japi.function.Function,java.util.List))​([Function](../../japi/function/Function.html "interface in akka.japi.function")<java.util.List<T>,​O> zipper,  java.util.List<[Source](Source.html "class in akka.stream.javadsl")<T,​?>> sources)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [Source$](Source$.html "class in akka.stream.javadsl") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Source$
		
		
		
		```
		public Source$()
		```

	- ### Method Detail
	
	
	
		- #### empty
		
		
		
		```
		public <O> [Source](Source.html "class in akka.stream.javadsl")<O,​[NotUsed](../../NotUsed.html "class in akka")> empty()
		```
		
		Create a `Source` with no elements, i.e. an empty stream that is completed immediately
		 for every connected `Sink`.
		- #### empty
		
		
		
		```
		public <T> [Source](Source.html "class in akka.stream.javadsl")<T,​[NotUsed](../../NotUsed.html "class in akka")> empty​(java.lang.Class<T> clazz)
		```
		
		Create a `Source` with no elements. The result is the same as calling `Source.empty()`
		- #### maybe
		
		
		
		```
		public <T> [Source](Source.html "class in akka.stream.javadsl")<T,​java.util.concurrent.CompletableFuture<java.util.Optional<T>>> maybe()
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
		public <O> [Source](Source.html "class in akka.stream.javadsl")<O,​[NotUsed](../../NotUsed.html "class in akka")> fromPublisher​(org.reactivestreams.Publisher<O> publisher)
		```
		
		Helper to create [`Source`](Source.html "class in akka.stream.javadsl") from `Publisher`.
		 
		 Construct a transformation starting with given publisher. The transformation steps
		 are executed by a series of `Processor` instances
		 that mediate the flow of elements downstream and the propagation of
		 back\-pressure upstream.
		- #### fromIterator
		
		
		
		```
		public <O> [Source](Source.html "class in akka.stream.javadsl")<O,​[NotUsed](../../NotUsed.html "class in akka")> fromIterator​([Creator](../../japi/function/Creator.html "interface in akka.japi.function")<java.util.Iterator<O>> f)
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
		public <O,​S extends java.util.stream.BaseStream<O,​S>> [Source](Source.html "class in akka.stream.javadsl")<O,​[NotUsed](../../NotUsed.html "class in akka")> fromJavaStream​([Creator](../../japi/function/Creator.html "interface in akka.japi.function")<java.util.stream.BaseStream<O,​S>> stream)
		```
		
		Creates a source that wraps a Java 8 Stream. Source uses a stream iterator to get all its
		 elements and send them downstream on demand.
		 
		 You can use `Source.async` to create asynchronous boundaries between synchronous java stream
		 and the rest of flow.
		- #### cycle
		
		
		
		```
		public <O> [Source](Source.html "class in akka.stream.javadsl")<O,​[NotUsed](../../NotUsed.html "class in akka")> cycle​([Creator](../../japi/function/Creator.html "interface in akka.japi.function")<java.util.Iterator<O>> f)
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
		public <O> [Source](Source.html "class in akka.stream.javadsl")<O,​[NotUsed](../../NotUsed.html "class in akka")> from​(java.lang.Iterable<O> iterable)
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
		public [Source](Source.html "class in akka.stream.javadsl")<java.lang.Integer,​[NotUsed](../../NotUsed.html "class in akka")> range​(int start,
		                                                     int end)
		```
		
		Creates [`Source`](Source.html "class in akka.stream.javadsl") that represents integer values in range ''\[start;end]'', step equals to 1\.
		 It allows to create `Source` out of range as simply as on Scala `Source(1 to N)`
		
		 Uses {@link scala.collection.immutable.Range.inclusive(Int, Int)} internally
		- #### range
		
		
		
		```
		public [Source](Source.html "class in akka.stream.javadsl")<java.lang.Integer,​[NotUsed](../../NotUsed.html "class in akka")> range​(int start,
		                                                     int end,
		                                                     int step)
		```
		
		Creates [`Source`](Source.html "class in akka.stream.javadsl") that represents integer values in range ''\[start;end]'', with the given step.
		 It allows to create `Source` out of range as simply as on Scala `Source(1 to N)`
		
		 Uses {@link scala.collection.immutable.Range.inclusive(Int, Int, Int)} internally
		- #### fromFuture
		
		
		
		```
		public <O> [Source](Source.html "class in akka.stream.javadsl")<O,​[NotUsed](../../NotUsed.html "class in akka")> fromFuture​(scala.concurrent.Future<O> future)
		```
		
		Deprecated.
		Use 'Source.future' instead. Since 2\.6\.0\.
		
		Start a new `Source` from the given `Future`. The stream will consist of
		 one element when the `Future` is completed with a successful value, which
		 may happen before or after materializing the `Flow`.
		 The stream terminates with a failure if the `Future` is completed with a failure.
		- #### fromCompletionStage
		
		
		
		```
		public <O> [Source](Source.html "class in akka.stream.javadsl")<O,​[NotUsed](../../NotUsed.html "class in akka")> fromCompletionStage​(java.util.concurrent.CompletionStage<O> future)
		```
		
		Deprecated.
		Use 'Source.completionStage' instead. Since 2\.6\.0\.
		
		Starts a new `Source` from the given `CompletionStage`. The stream will consist of
		 one element when the `CompletionStage` is completed with a successful value, which
		 may happen before or after materializing the `Flow`.
		 The stream terminates with a failure if the `CompletionStage` is completed with a failure.
		- #### fromFutureSource
		
		
		
		```
		public <T,​M> [Source](Source.html "class in akka.stream.javadsl")<T,​scala.concurrent.Future<M>> fromFutureSource​(scala.concurrent.Future<? extends [Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<T>,​M>> future)
		```
		
		Deprecated.
		Use 'Source.futureSource' (potentially together with \`Source.fromGraph\`) instead. Since 2\.6\.0\.
		
		Streams the elements of the given future source once it successfully completes.
		 If the `Future` fails the stream is failed with the exception from the future. If downstream cancels before the
		 stream completes the materialized `Future` will be failed with a `StreamDetachedException`.
		- #### fromSourceCompletionStage
		
		
		
		```
		public <T,​M> [Source](Source.html "class in akka.stream.javadsl")<T,​java.util.concurrent.CompletionStage<M>> fromSourceCompletionStage​(java.util.concurrent.CompletionStage<? extends [Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<T>,​M>> completion)
		```
		
		Deprecated.
		Use 'Source.completionStageSource' (potentially together with \`Source.fromGraph\`) instead. Since 2\.6\.0\.
		
		Streams the elements of an asynchronous source once its given `CompletionStage` completes.
		 If the `CompletionStage` fails the stream is failed with the exception from the future.
		 If downstream cancels before the stream completes the materialized `CompletionStage` will be failed
		 with a `StreamDetachedException`
		- #### tick
		
		
		
		```
		public <O> [Source](Source.html "class in akka.stream.javadsl")<O,​[Cancellable](../../actor/Cancellable.html "interface in akka.actor")> tick​(java.time.Duration initialDelay,
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
		public <T> [Source](Source.html "class in akka.stream.javadsl")<T,​[NotUsed](../../NotUsed.html "class in akka")> single​(T element)
		```
		
		Create a `Source` with one element.
		 Every connected `Sink` of this stream will see an individual stream consisting of one element.
		- #### repeat
		
		
		
		```
		public <T> [Source](Source.html "class in akka.stream.javadsl")<T,​[NotUsed](../../NotUsed.html "class in akka")> repeat​(T element)
		```
		
		Create a `Source` that will continually emit the given element.
		- #### unfold
		
		
		
		```
		public <S,​E> [Source](Source.html "class in akka.stream.javadsl")<E,​[NotUsed](../../NotUsed.html "class in akka")> unfold​(S s,
		                                                  [Function](../../japi/function/Function.html "interface in akka.japi.function")<S,​java.util.Optional<[Pair](../../japi/Pair.html "class in akka.japi")<S,​E>>> f)
		```
		
		Create a `Source` that will unfold a value of type `S` into
		 a pair of the next state `S` and output elements of type `E`.
		- #### unfoldAsync
		
		
		
		```
		public <S,​E> [Source](Source.html "class in akka.stream.javadsl")<E,​[NotUsed](../../NotUsed.html "class in akka")> unfoldAsync​(S s,
		                                                       [Function](../../japi/function/Function.html "interface in akka.japi.function")<S,​java.util.concurrent.CompletionStage<java.util.Optional<[Pair](../../japi/Pair.html "class in akka.japi")<S,​E>>>> f)
		```
		
		Same as [`<S,E>unfold(S,akka.japi.function.Function<S,java.util.Optional<akka.japi.Pair<S,E>>>)`](#unfold(S,akka.japi.function.Function)), but uses an async function to generate the next state\-element tuple.
		- #### failed
		
		
		
		```
		public <T> [Source](Source.html "class in akka.stream.javadsl")<T,​[NotUsed](../../NotUsed.html "class in akka")> failed​(java.lang.Throwable cause)
		```
		
		Create a `Source` that immediately ends the stream with the `cause` failure to every connected `Sink`.
		- #### lazily
		
		
		
		```
		public <T,​M> [Source](Source.html "class in akka.stream.javadsl")<T,​java.util.concurrent.CompletionStage<M>> lazily​([Creator](../../japi/function/Creator.html "interface in akka.japi.function")<[Source](Source.html "class in akka.stream.javadsl")<T,​M>> create)
		```
		
		Deprecated.
		Use 'Source.lazySource' instead. Since 2\.6\.0\.
		
		Creates a `Source` that is not materialized until there is downstream demand, when the source gets materialized
		 the materialized future is completed with its value, if downstream cancels or fails without any demand the
		 `create` factory is never called and the materialized `CompletionStage` is failed.
		- #### lazilyAsync
		
		
		
		```
		public <T> [Source](Source.html "class in akka.stream.javadsl")<T,​scala.concurrent.Future<[NotUsed](../../NotUsed.html "class in akka")>> lazilyAsync​([Creator](../../japi/function/Creator.html "interface in akka.japi.function")<java.util.concurrent.CompletionStage<T>> create)
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
		public <T> [Source](Source.html "class in akka.stream.javadsl")<T,​[NotUsed](../../NotUsed.html "class in akka")> future​(scala.concurrent.Future<T> futureElement)
		```
		
		Emits a single value when the given Scala `Future` is successfully completed and then completes the stream.
		 The stream fails if the `Future` is completed with a failure.
		 
		 Here for Java interoperability, the normal use from Java should be `Source.completionStage`
		- #### never
		
		
		
		```
		public <T> [Source](Source.html "class in akka.stream.javadsl")<T,​[NotUsed](../../NotUsed.html "class in akka")> never()
		```
		
		Never emits any elements, never completes and never fails.
		 This stream could be useful in tests.
		- #### completionStage
		
		
		
		```
		public <T> [Source](Source.html "class in akka.stream.javadsl")<T,​[NotUsed](../../NotUsed.html "class in akka")> completionStage​(java.util.concurrent.CompletionStage<T> completionStage)
		```
		
		Emits a single value when the given `CompletionStage` is successfully completed and then completes the stream.
		 If the `CompletionStage` is completed with a failure the stream is failed.
		- #### completionStageSource
		
		
		
		```
		public <T,​M> [Source](Source.html "class in akka.stream.javadsl")<T,​java.util.concurrent.CompletionStage<M>> completionStageSource​(java.util.concurrent.CompletionStage<[Source](Source.html "class in akka.stream.javadsl")<T,​M>> completionStageSource)
		```
		
		Turn a `CompletionStage[Source]` into a source that will emit the values of the source when the future completes successfully.
		 If the `CompletionStage` is completed with a failure the stream is failed.
		- #### lazySingle
		
		
		
		```
		public <T> [Source](Source.html "class in akka.stream.javadsl")<T,​[NotUsed](../../NotUsed.html "class in akka")> lazySingle​([Creator](../../japi/function/Creator.html "interface in akka.japi.function")<T> create)
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
		public <T> [Source](Source.html "class in akka.stream.javadsl")<T,​[NotUsed](../../NotUsed.html "class in akka")> lazyCompletionStage​([Creator](../../japi/function/Creator.html "interface in akka.japi.function")<java.util.concurrent.CompletionStage<T>> create)
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
		public <T,​M> [Source](Source.html "class in akka.stream.javadsl")<T,​java.util.concurrent.CompletionStage<M>> lazySource​([Creator](../../japi/function/Creator.html "interface in akka.japi.function")<[Source](Source.html "class in akka.stream.javadsl")<T,​M>> create)
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
		public <T,​M> [Source](Source.html "class in akka.stream.javadsl")<T,​java.util.concurrent.CompletionStage<M>> lazyCompletionStageSource​([Creator](../../japi/function/Creator.html "interface in akka.japi.function")<java.util.concurrent.CompletionStage<[Source](Source.html "class in akka.stream.javadsl")<T,​M>>> create)
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
		public <T> [Source](Source.html "class in akka.stream.javadsl")<T,​org.reactivestreams.Subscriber<T>> asSubscriber()
		```
		
		Creates a `Source` that is materialized as a `Subscriber`
		- #### actorRef
		
		
		
		```
		public <T> [Source](Source.html "class in akka.stream.javadsl")<T,​[ActorRef](../../actor/ActorRef.html "class in akka.actor")> actorRef​([Function](../../japi/function/Function.html "interface in akka.japi.function")<java.lang.Object,​java.util.Optional<[CompletionStrategy](../CompletionStrategy.html "interface in akka.stream")>> completionMatcher,
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
		public <T> [Source](Source.html "class in akka.stream.javadsl")<T,​[ActorRef](../../actor/ActorRef.html "class in akka.actor")> actorRef​(int bufferSize,
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
		public <T> [Source](Source.html "class in akka.stream.javadsl")<T,​[ActorRef](../../actor/ActorRef.html "class in akka.actor")> actorRefWithBackpressure​(java.lang.Object ackMessage,
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
		public <T> [Source](Source.html "class in akka.stream.javadsl")<T,​[ActorRef](../../actor/ActorRef.html "class in akka.actor")> actorRefWithAck​(java.lang.Object ackMessage,
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
		public <T> [Source](Source.html "class in akka.stream.javadsl")<T,​[ActorRef](../../actor/ActorRef.html "class in akka.actor")> actorRefWithAck​(java.lang.Object ackMessage)
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
		public <T,​M> [Source](Source.html "class in akka.stream.javadsl")<T,​M> fromGraph​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<T>,​M> g)
		```
		
		A graph with the shape of a source logically is a source, this method makes
		 it so also in type.
		- #### fromMaterializer
		
		
		
		```
		public <T,​M> [Source](Source.html "class in akka.stream.javadsl")<T,​java.util.concurrent.CompletionStage<M>> fromMaterializer​(java.util.function.BiFunction<[Materializer](../Materializer.html "class in akka.stream"),​[Attributes](../Attributes.html "class in akka.stream"),​[Source](Source.html "class in akka.stream.javadsl")<T,​M>> factory)
		```
		
		Defers the creation of a [`Source`](Source.html "class in akka.stream.javadsl") until materialization. The `factory` function
		 exposes `Materializer` which is going to be used during materialization and
		 `Attributes` of the [`Source`](Source.html "class in akka.stream.javadsl") returned by this method.
		- #### setup
		
		
		
		```
		public <T,​M> [Source](Source.html "class in akka.stream.javadsl")<T,​java.util.concurrent.CompletionStage<M>> setup​(java.util.function.BiFunction<[ActorMaterializer](../ActorMaterializer.html "class in akka.stream"),​[Attributes](../Attributes.html "class in akka.stream"),​[Source](Source.html "class in akka.stream.javadsl")<T,​M>> factory)
		```
		
		Deprecated.
		Use 'fromMaterializer' instead. Since 2\.6\.0\.
		
		Defers the creation of a [`Source`](Source.html "class in akka.stream.javadsl") until materialization. The `factory` function
		 exposes `ActorMaterializer` which is going to be used during materialization and
		 `Attributes` of the [`Source`](Source.html "class in akka.stream.javadsl") returned by this method.
		- #### combine
		
		
		
		```
		public <T,​U> [Source](Source.html "class in akka.stream.javadsl")<U,​[NotUsed](../../NotUsed.html "class in akka")> combine​([Source](Source.html "class in akka.stream.javadsl")<T,​?> first,
		                                                   [Source](Source.html "class in akka.stream.javadsl")<T,​?> second,
		                                                   java.util.List<[Source](Source.html "class in akka.stream.javadsl")<T,​?>> rest,
		                                                   [Function](../../japi/function/Function.html "interface in akka.japi.function")<java.lang.Integer,​? extends [Graph](../Graph.html "interface in akka.stream")<[UniformFanInShape](../UniformFanInShape.html "class in akka.stream")<T,​U>,​[NotUsed](../../NotUsed.html "class in akka")>> fanInStrategy)
		```
		
		Combines several sources with fan\-in strategy like [`Merge`](Merge.html "class in akka.stream.javadsl") or [`Concat`](Concat.html "class in akka.stream.javadsl") into a single [`Source`](Source.html "class in akka.stream.javadsl").
		- #### combineMat
		
		
		
		```
		public <T,​U,​M1,​M2,​M> [Source](Source.html "class in akka.stream.javadsl")<U,​M> combineMat​([Source](Source.html "class in akka.stream.javadsl")<T,​M1> first,
		                                                                          [Source](Source.html "class in akka.stream.javadsl")<T,​M2> second,
		                                                                          [Function](../../japi/function/Function.html "interface in akka.japi.function")<java.lang.Integer,​? extends [Graph](../Graph.html "interface in akka.stream")<[UniformFanInShape](../UniformFanInShape.html "class in akka.stream")<T,​U>,​[NotUsed](../../NotUsed.html "class in akka")>> fanInStrategy,
		                                                                          [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<M1,​M2,​M> matF)
		```
		
		Combines two sources with fan\-in strategy like `Merge` or `Concat` and returns `Source` with a materialized value.
		- #### combine
		
		
		
		```
		public <T,​U,​M> [Source](Source.html "class in akka.stream.javadsl")<U,​java.util.List<M>> combine​(java.util.List<? extends [Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<T>,​M>> sources,
		                                                                     [Function](../../japi/function/Function.html "interface in akka.japi.function")<java.lang.Integer,​[Graph](../Graph.html "interface in akka.stream")<[UniformFanInShape](../UniformFanInShape.html "class in akka.stream")<T,​U>,​[NotUsed](../../NotUsed.html "class in akka")>> fanInStrategy)
		```
		
		Combines several sources with fan\-in strategy like [`Merge`](Merge.html "class in akka.stream.javadsl") or [`Concat`](Concat.html "class in akka.stream.javadsl") into a single [`Source`](Source.html "class in akka.stream.javadsl").
		- #### zipN
		
		
		
		```
		public <T> [Source](Source.html "class in akka.stream.javadsl")<java.util.List<T>,​[NotUsed](../../NotUsed.html "class in akka")> zipN​(java.util.List<[Source](Source.html "class in akka.stream.javadsl")<T,​?>> sources)
		```
		
		Combine the elements of multiple streams into a stream of lists.
		- #### zipWithN
		
		
		
		```
		public <T,​O> [Source](Source.html "class in akka.stream.javadsl")<O,​[NotUsed](../../NotUsed.html "class in akka")> zipWithN​([Function](../../japi/function/Function.html "interface in akka.japi.function")<java.util.List<T>,​O> zipper,
		                                                    java.util.List<[Source](Source.html "class in akka.stream.javadsl")<T,​?>> sources)
		```
		- #### queue
		
		
		
		```
		public <T> [Source](Source.html "class in akka.stream.javadsl")<T,​[BoundedSourceQueue](../BoundedSourceQueue.html "interface in akka.stream")<T>> queue​(int bufferSize)
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
		public <T> [Source](Source.html "class in akka.stream.javadsl")<T,​[SourceQueueWithComplete](SourceQueueWithComplete.html "interface in akka.stream.javadsl")<T>> queue​(int bufferSize,
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
		public <T> [Source](Source.html "class in akka.stream.javadsl")<T,​[SourceQueueWithComplete](SourceQueueWithComplete.html "interface in akka.stream.javadsl")<T>> queue​(int bufferSize,
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
		public <T,​S> [Source](Source.html "class in akka.stream.javadsl")<T,​[NotUsed](../../NotUsed.html "class in akka")> unfoldResource​([Creator](../../japi/function/Creator.html "interface in akka.japi.function")<S> create,
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
		public <T,​S> [Source](Source.html "class in akka.stream.javadsl")<T,​[NotUsed](../../NotUsed.html "class in akka")> unfoldResourceAsync​([Creator](../../japi/function/Creator.html "interface in akka.japi.function")<java.util.concurrent.CompletionStage<S>> create,
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
		public <SuperOut,​Out extends SuperOut,​Mat> [Source](Source.html "class in akka.stream.javadsl")<SuperOut,​Mat> upcast​([Source](Source.html "class in akka.stream.javadsl")<Out,​Mat> source)
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
		public <T> [Source](Source.html "class in akka.stream.javadsl")<T,​[NotUsed](../../NotUsed.html "class in akka")> mergePrioritizedN​(java.util.List<[Pair](../../japi/Pair.html "class in akka.japi")<[Source](Source.html "class in akka.stream.javadsl")<T,​?>,​java.lang.Integer>> sourcesAndPriorities,
		                                                     boolean eagerComplete)
		```
		
		Merge multiple [`Source`](Source.html "class in akka.stream.javadsl")s. Prefer the sources depending on the 'priority' parameters.
		 The provided sources and priorities must have the same size and order.
		 
		 '''emits''' when one of the inputs has an element available, preferring inputs based on the 'priority' parameters if both have elements available
		 
		
		
		 '''backpressures''' when downstream backpressures
		 
		
		
		 '''completes''' when both upstreams complete (This behavior is changeable to completing when any upstream completes by setting `eagerComplete=true`.)
		 
		
		
		 '''Cancels when''' downstream cancels

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

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/2.10/akka/Done.html
- https://doc.akka.io/japi/akka/2.10/akka/NotUsed.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/Cancellable.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/PoisonPill.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/Status.Failure.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/Status.Success.html
- https://doc.akka.io/japi/akka/2.10/akka/japi/Pair.html
- https://doc.akka.io/japi/akka/2.10/akka/japi/function/Creator.html
- https://doc.akka.io/japi/akka/2.10/akka/japi/function/Function.html
- https://doc.akka.io/japi/akka/2.10/akka/japi/function/Function2.html
- https://doc.akka.io/japi/akka/2.10/akka/japi/function/Procedure.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/ActorMaterializer.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/Attributes.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/BoundedSourceQueue.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/CompletionStrategy.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/Graph.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/Materializer.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/NeverMaterializedException.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/OverflowStrategy.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/QueueOfferResult.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/SourceShape.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/UniformFanInShape.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/javadsl/Concat.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/javadsl/Merge.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/javadsl/Source$.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/javadsl/Source.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/javadsl/SourceQueueWithComplete.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/javadsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/2.10/akka/stream/javadsl/Source$.html](https://doc.akka.io/japi/akka/2.10/akka/stream/javadsl/Source$.html)*