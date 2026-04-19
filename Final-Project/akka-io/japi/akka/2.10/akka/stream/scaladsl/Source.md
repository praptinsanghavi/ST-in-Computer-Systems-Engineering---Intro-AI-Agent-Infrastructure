---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:21:55Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/2.10/akka/stream/scaladsl/Source.html
title: Source
---

# Source

## Content

Package [akka.stream.scaladsl](package-summary.html)
## Class Source\<Out,​Mat\>

- java.lang.Object
- - akka.stream.scaladsl.Source\<Out,​Mat\>

- All Implemented Interfaces:
`[Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<Out>,​Mat>`, `[FlowOps](FlowOps.html "interface in akka.stream.scaladsl")<Out,​Mat>`, `[FlowOpsMat](FlowOpsMat.html "interface in akka.stream.scaladsl")<Out,​Mat>`

---

```
public final class Source<Out,​Mat>
extends java.lang.Object
implements [FlowOpsMat](FlowOpsMat.html "interface in akka.stream.scaladsl")<Out,​Mat>, [Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<Out>,​Mat>
```

A `Source` is a set of stream processing steps that has one open output. It can comprise
 any number of internal sources and transformations that are wired together, or it can be
 an \&ldquo;atomic\&rdquo; source, e.g. from a collection or a file. Materialization turns a Source into
 a Reactive Streams `Publisher` (at least conceptually).

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface akka.stream.[Graph](../Graph.html "interface in akka.stream")
		
		
		`[Graph.GraphMapMatVal](../Graph.GraphMapMatVal.html "class in akka.stream")<[S](../Graph.GraphMapMatVal.html "type parameter in Graph.GraphMapMatVal") extends [Shape](../Shape.html "class in akka.stream"),​[M](../Graph.GraphMapMatVal.html "type parameter in Graph.GraphMapMatVal")>`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Source](#%3Cinit%3E(akka.stream.impl.LinearTraversalBuilder,akka.stream.SourceShape))​(akka.stream.impl.LinearTraversalBuilder traversalBuilder,  [SourceShape](../SourceShape.html "class in akka.stream")<[Out](Source.html "type parameter in Source")> shape)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) [Deprecated Methods](javascript:show(32);) 
	| Modifier and Type | Method | Description |
	| `static <T> [Source](Source.html "class in akka.stream.scaladsl")<T,​[ActorRef](../../actor/ActorRef.html "class in akka.actor")>` | `[actorRef](#actorRef(int,akka.stream.OverflowStrategy))​(int bufferSize,  [OverflowStrategy](../OverflowStrategy.html "class in akka.stream") overflowStrategy)` | Deprecated. Use variant accepting completion and failure matchers instead. |
	| `static <T> [Source](Source.html "class in akka.stream.scaladsl")<T,​[ActorRef](../../actor/ActorRef.html "class in akka.actor")>` | `[actorRef](#actorRef(scala.PartialFunction,scala.PartialFunction,int,akka.stream.OverflowStrategy))​(scala.PartialFunction<java.lang.Object,​[CompletionStrategy](../CompletionStrategy.html "interface in akka.stream")> completionMatcher,  scala.PartialFunction<java.lang.Object,​java.lang.Throwable> failureMatcher,  int bufferSize,  [OverflowStrategy](../OverflowStrategy.html "class in akka.stream") overflowStrategy)` | Creates a `Source` that is materialized as an [`ActorRef`](../../actor/ActorRef.html "class in akka.actor"). |
	| `static <T> [Source](Source.html "class in akka.stream.scaladsl")<T,​[ActorRef](../../actor/ActorRef.html "class in akka.actor")>` | `[actorRefWithAck](#actorRefWithAck(java.lang.Object))​(java.lang.Object ackMessage)` | Deprecated. Use actorRefWithBackpressure accepting completion and failure matchers instead. |
	| `static <T> [Source](Source.html "class in akka.stream.scaladsl")<T,​[ActorRef](../../actor/ActorRef.html "class in akka.actor")>` | `[actorRefWithBackpressure](#actorRefWithBackpressure(java.lang.Object,scala.PartialFunction,scala.PartialFunction))​(java.lang.Object ackMessage,  scala.PartialFunction<java.lang.Object,​[CompletionStrategy](../CompletionStrategy.html "interface in akka.stream")> completionMatcher,  scala.PartialFunction<java.lang.Object,​java.lang.Throwable> failureMatcher)` | Creates a `Source` that is materialized as an [`ActorRef`](../../actor/ActorRef.html "class in akka.actor"). |
	| `[Source](Source.html "class in akka.stream.scaladsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")>` | `[addAttributes](#addAttributes(akka.stream.Attributes))​([Attributes](../Attributes.html "class in akka.stream") attr)` | Add the given attributes to this Source. |
	| `static <T> [Source](Source.html "class in akka.stream.scaladsl")<T,​[NotUsed](../../NotUsed.html "class in akka")>` | `[apply](#apply(scala.collection.immutable.Iterable))​(scala.collection.immutable.Iterable<T> iterable)` | Helper to create [`Source`](Source.html "class in akka.stream.scaladsl") from `Iterable`. |
	| `[Source](../javadsl/Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")>` | `[asJava](#asJava())()` | Converts this Scala DSL element to it's Java DSL counterpart. |
	| `<Ctx> [SourceWithContext](SourceWithContext.html "class in akka.stream.scaladsl")<[Out](Source.html "type parameter in Source"),​Ctx,​[Mat](Source.html "type parameter in Source")>` | `[asSourceWithContext](#asSourceWithContext(scala.Function1))​(scala.Function1<[Out](Source.html "type parameter in Source"),​Ctx> f)` | Transform this source whose element is e into a source producing tuple (e, f(e)) |
	| `static <T> [Source](Source.html "class in akka.stream.scaladsl")<T,​org.reactivestreams.Subscriber<T>>` | `[asSubscriber](#asSubscriber())()` | Creates a `Source` that is materialized as a `Subscriber` |
	| `[Source](Source.html "class in akka.stream.scaladsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")>` | `[async](#async())()` | Put an asynchronous boundary around this `Source` |
	| `[Source](Source.html "class in akka.stream.scaladsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")>` | `[async](#async(java.lang.String))​(java.lang.String dispatcher)` | Put an asynchronous boundary around this `Graph` |
	| `[Source](Source.html "class in akka.stream.scaladsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")>` | `[async](#async(java.lang.String,int))​(java.lang.String dispatcher,  int inputBufferSize)` | Put an asynchronous boundary around this `Graph` |
	| `static <T,​U>[Source](Source.html "class in akka.stream.scaladsl")<U,​[NotUsed](../../NotUsed.html "class in akka")>` | `[combine](#combine(akka.stream.scaladsl.Source,akka.stream.scaladsl.Source,scala.collection.immutable.Seq,scala.Function1))​([Source](Source.html "class in akka.stream.scaladsl")<T,​?> first,  [Source](Source.html "class in akka.stream.scaladsl")<T,​?> second,  scala.collection.immutable.Seq<[Source](Source.html "class in akka.stream.scaladsl")<T,​?>> rest,  scala.Function1<java.lang.Object,​[Graph](../Graph.html "interface in akka.stream")<[UniformFanInShape](../UniformFanInShape.html "class in akka.stream")<T,​U>,​[NotUsed](../../NotUsed.html "class in akka")>> fanInStrategy)` | Combines several sources with fan\-in strategy like [`Merge`](Merge.html "class in akka.stream.scaladsl") or [`Concat`](Concat.html "class in akka.stream.scaladsl") into a single [`Source`](Source.html "class in akka.stream.scaladsl"). |
	| `static <T,​U,​M>[Source](Source.html "class in akka.stream.scaladsl")<U,​scala.collection.immutable.Seq<M>>` | `[combine](#combine(scala.collection.immutable.Seq,scala.Function1))​(scala.collection.immutable.Seq<[Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<T>,​M>> sources,  scala.Function1<java.lang.Object,​[Graph](../Graph.html "interface in akka.stream")<[UniformFanInShape](../UniformFanInShape.html "class in akka.stream")<T,​U>,​[NotUsed](../../NotUsed.html "class in akka")>> fanInStrategy)` | Combines several sources with fan\-in strategy like [`Merge`](Merge.html "class in akka.stream.scaladsl") or [`Concat`](Concat.html "class in akka.stream.scaladsl") into a single [`Source`](Source.html "class in akka.stream.scaladsl"). |
	| `static <T,​U,​M1,​M2,​M>[Source](Source.html "class in akka.stream.scaladsl")<U,​M>` | `[combineMat](#combineMat(akka.stream.scaladsl.Source,akka.stream.scaladsl.Source,scala.Function1,scala.Function2))​([Source](Source.html "class in akka.stream.scaladsl")<T,​M1> first,  [Source](Source.html "class in akka.stream.scaladsl")<T,​M2> second,  scala.Function1<java.lang.Object,​[Graph](../Graph.html "interface in akka.stream")<[UniformFanInShape](../UniformFanInShape.html "class in akka.stream")<T,​U>,​[NotUsed](../../NotUsed.html "class in akka")>> fanInStrategy,  scala.Function2<M1,​M2,​M> matF)` | Combines two sources with fan\-in strategy like [`Merge`](Merge.html "class in akka.stream.scaladsl") or [`Concat`](Concat.html "class in akka.stream.scaladsl") into a single [`Source`](Source.html "class in akka.stream.scaladsl") with a materialized value. |
	| `static <T> [Source](Source.html "class in akka.stream.scaladsl")<T,​[NotUsed](../../NotUsed.html "class in akka")>` | `[completionStage](#completionStage(java.util.concurrent.CompletionStage))​(java.util.concurrent.CompletionStage<T> completionStage)` | Emits a single value when the given `CompletionStage` is successfully completed and then completes the stream. |
	| `static <T> [Source](Source.html "class in akka.stream.scaladsl")<T,​[NotUsed](../../NotUsed.html "class in akka")>` | `[cycle](#cycle(scala.Function0))​(scala.Function0<scala.collection.Iterator<T>> f)` | Creates a [`Source`](Source.html "class in akka.stream.scaladsl") that will continually produce elements in the order they are provided. |
	| `static <T> [Source](Source.html "class in akka.stream.scaladsl")<T,​[NotUsed](../../NotUsed.html "class in akka")>` | `[empty](#empty())()` | A `Source` with no elements, i.e. |
	| `static <T> [Source](Source.html "class in akka.stream.scaladsl")<T,​[NotUsed](../../NotUsed.html "class in akka")>` | `[failed](#failed(java.lang.Throwable))​(java.lang.Throwable cause)` | Create a `Source` that immediately ends the stream with the `cause` error to every connected `Sink`. |
	| `static <T> [Source](Source.html "class in akka.stream.scaladsl")<T,​[NotUsed](../../NotUsed.html "class in akka")>` | `[fromCompletionStage](#fromCompletionStage(java.util.concurrent.CompletionStage))​(java.util.concurrent.CompletionStage<T> future)` | Deprecated. Use 'Source.completionStage' instead. |
	| `static <T> [Source](Source.html "class in akka.stream.scaladsl")<T,​[NotUsed](../../NotUsed.html "class in akka")>` | `[fromFuture](#fromFuture(scala.concurrent.Future))​(scala.concurrent.Future<T> future)` | Deprecated. Use 'Source.future' instead. |
	| `static <T,​M>[Source](Source.html "class in akka.stream.scaladsl")<T,​scala.concurrent.Future<M>>` | `[fromFutureSource](#fromFutureSource(scala.concurrent.Future))​(scala.concurrent.Future<[Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<T>,​M>> future)` | Deprecated. Use 'Source.futureSource' (potentially together with \`Source.fromGraph\`) instead. |
	| `static <T,​M>[Source](Source.html "class in akka.stream.scaladsl")<T,​M>` | `[fromGraph](#fromGraph(akka.stream.Graph))​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<T>,​M> g)` | A graph with the shape of a source logically is a source, this method makes  it so also in type. |
	| `static <T> [Source](Source.html "class in akka.stream.scaladsl")<T,​[NotUsed](../../NotUsed.html "class in akka")>` | `[fromIterator](#fromIterator(scala.Function0))​(scala.Function0<scala.collection.Iterator<T>> f)` | Helper to create a [`Source`](Source.html "class in akka.stream.scaladsl") from an `Iterator`. |
	| `static <T,​S extends java.util.stream.BaseStream<T,​S>>[Source](Source.html "class in akka.stream.scaladsl")<T,​[NotUsed](../../NotUsed.html "class in akka")>` | `[fromJavaStream](#fromJavaStream(scala.Function0))​(scala.Function0<java.util.stream.BaseStream<T,​S>> stream)` | Creates a source that wraps a Java 8 Stream. |
	| `static <T,​M>[Source](Source.html "class in akka.stream.scaladsl")<T,​scala.concurrent.Future<M>>` | `[fromMaterializer](#fromMaterializer(scala.Function2))​(scala.Function2<[Materializer](../Materializer.html "class in akka.stream"),​[Attributes](../Attributes.html "class in akka.stream"),​[Source](Source.html "class in akka.stream.scaladsl")<T,​M>> factory)` | Defers the creation of a [`Source`](Source.html "class in akka.stream.scaladsl") until materialization. |
	| `static <T> [Source](Source.html "class in akka.stream.scaladsl")<T,​[NotUsed](../../NotUsed.html "class in akka")>` | `[fromPublisher](#fromPublisher(org.reactivestreams.Publisher))​(org.reactivestreams.Publisher<T> publisher)` | Helper to create [`Source`](Source.html "class in akka.stream.scaladsl") from `Publisher`. |
	| `static <T,​M>[Source](Source.html "class in akka.stream.scaladsl")<T,​java.util.concurrent.CompletionStage<M>>` | `[fromSourceCompletionStage](#fromSourceCompletionStage(java.util.concurrent.CompletionStage))​(java.util.concurrent.CompletionStage<? extends [Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<T>,​M>> completion)` | Deprecated. Use scala\-compat CompletionStage to future converter and 'Source.futureSource' instead. |
	| `static <T> [Source](Source.html "class in akka.stream.scaladsl")<T,​[NotUsed](../../NotUsed.html "class in akka")>` | `[future](#future(scala.concurrent.Future))​(scala.concurrent.Future<T> futureElement)` | Emits a single value when the given `Future` is successfully completed and then completes the stream. |
	| `static <T,​M>[Source](Source.html "class in akka.stream.scaladsl")<T,​scala.concurrent.Future<M>>` | `[futureSource](#futureSource(scala.concurrent.Future))​(scala.concurrent.Future<[Source](Source.html "class in akka.stream.scaladsl")<T,​M>> futureSource)` | Turn a `Future[Source]` into a source that will emit the values of the source when the future completes successfully. |
	| `[Attributes](../Attributes.html "class in akka.stream")` | `[getAttributes](#getAttributes())()` |  |
	| `static <T,​M>[Source](Source.html "class in akka.stream.scaladsl")<T,​scala.concurrent.Future<M>>` | `[lazily](#lazily(scala.Function0))​(scala.Function0<[Source](Source.html "class in akka.stream.scaladsl")<T,​M>> create)` | Deprecated. Use 'Source.lazySource' instead. |
	| `static <T> [Source](Source.html "class in akka.stream.scaladsl")<T,​scala.concurrent.Future<[NotUsed](../../NotUsed.html "class in akka")>>` | `[lazilyAsync](#lazilyAsync(scala.Function0))​(scala.Function0<scala.concurrent.Future<T>> create)` | Deprecated. Use 'Source.lazyFuture' instead. |
	| `static <T> [Source](Source.html "class in akka.stream.scaladsl")<T,​[NotUsed](../../NotUsed.html "class in akka")>` | `[lazyFuture](#lazyFuture(scala.Function0))​(scala.Function0<scala.concurrent.Future<T>> create)` | Defers invoking the `create` function to create a future element until there is downstream demand. |
	| `static <T,​M>[Source](Source.html "class in akka.stream.scaladsl")<T,​scala.concurrent.Future<M>>` | `[lazyFutureSource](#lazyFutureSource(scala.Function0))​(scala.Function0<scala.concurrent.Future<[Source](Source.html "class in akka.stream.scaladsl")<T,​M>>> create)` | Defers invoking the `create` function to create a future source until there is downstream demand. |
	| `static <T> [Source](Source.html "class in akka.stream.scaladsl")<T,​[NotUsed](../../NotUsed.html "class in akka")>` | `[lazySingle](#lazySingle(scala.Function0))​(scala.Function0<T> create)` | Defers invoking the `create` function to create a single element until there is downstream demand. |
	| `static <T,​M>[Source](Source.html "class in akka.stream.scaladsl")<T,​scala.concurrent.Future<M>>` | `[lazySource](#lazySource(scala.Function0))​(scala.Function0<[Source](Source.html "class in akka.stream.scaladsl")<T,​M>> create)` | Defers invoking the `create` function to create a future source until there is downstream demand. |
	| `<Mat2> [Source](Source.html "class in akka.stream.scaladsl")<[Out](Source.html "type parameter in Source"),​Mat2>` | `[mapMaterializedValue](#mapMaterializedValue(scala.Function1))​(scala.Function1<[Mat](Source.html "type parameter in Source"),​Mat2> f)` | Transform only the materialized value of this Source, leaving all other properties as they were. |
	| `static <T> [Source](Source.html "class in akka.stream.scaladsl")<T,​scala.concurrent.Promise<scala.Option<T>>>` | `[maybe](#maybe())()` | Create a `Source` which materializes a `Promise` which controls what element  will be emitted by the Source. |
	| `static <T> [Source](Source.html "class in akka.stream.scaladsl")<T,​[NotUsed](../../NotUsed.html "class in akka")>` | `[mergePrioritizedN](#mergePrioritizedN(scala.collection.immutable.Seq,boolean))​(scala.collection.immutable.Seq<scala.Tuple2<[Source](Source.html "class in akka.stream.scaladsl")<T,​?>,​java.lang.Object>> sourcesAndPriorities,  boolean eagerComplete)` | Merge multiple [`Source`](Source.html "class in akka.stream.scaladsl")s. |
	| `[Source](Source.html "class in akka.stream.scaladsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")>` | `[named](#named(java.lang.String))​(java.lang.String name)` | Add a name attribute to this Source. |
	| `static <T> [Source](Source.html "class in akka.stream.scaladsl")<T,​[NotUsed](../../NotUsed.html "class in akka")>` | `[never](#never())()` | Never emits any elements, never completes and never fails. |
	| `scala.Tuple2<[Mat](Source.html "type parameter in Source"),​[Source](Source.html "class in akka.stream.scaladsl")<[Out](Source.html "type parameter in Source"),​[NotUsed](../../NotUsed.html "class in akka")>>` | `[preMaterialize](#preMaterialize(akka.stream.Materializer))​([Materializer](../Materializer.html "class in akka.stream") materializer)` | Materializes this Source, immediately returning (1\) its materialized value, and (2\) a new Source  that can be used to consume elements from the newly materialized Source. |
	| `static <T> [Source](Source.html "class in akka.stream.scaladsl")<T,​[BoundedSourceQueue](../BoundedSourceQueue.html "interface in akka.stream")<T>>` | `[queue](#queue(int))​(int bufferSize)` | Creates a `Source` that is materialized as an [`BoundedSourceQueue`](../BoundedSourceQueue.html "interface in akka.stream"). |
	| `static <T> [Source](Source.html "class in akka.stream.scaladsl")<T,​[SourceQueueWithComplete](SourceQueueWithComplete.html "interface in akka.stream.scaladsl")<T>>` | `[queue](#queue(int,akka.stream.OverflowStrategy))​(int bufferSize,  [OverflowStrategy](../OverflowStrategy.html "class in akka.stream") overflowStrategy)` | Creates a `Source` that is materialized as an [`SourceQueueWithComplete`](SourceQueueWithComplete.html "interface in akka.stream.scaladsl"). |
	| `static <T> [Source](Source.html "class in akka.stream.scaladsl")<T,​[SourceQueueWithComplete](SourceQueueWithComplete.html "interface in akka.stream.scaladsl")<T>>` | `[queue](#queue(int,akka.stream.OverflowStrategy,int))​(int bufferSize,  [OverflowStrategy](../OverflowStrategy.html "class in akka.stream") overflowStrategy,  int maxConcurrentOffers)` | Creates a `Source` that is materialized as an [`SourceQueueWithComplete`](SourceQueueWithComplete.html "interface in akka.stream.scaladsl"). |
	| `static <T> [Source](Source.html "class in akka.stream.scaladsl")<T,​[NotUsed](../../NotUsed.html "class in akka")>` | `[repeat](#repeat(T))​(T element)` | Create a `Source` that will continually emit the given element. |
	| `scala.concurrent.Future<[Done](../../Done.html "class in akka")>` | `[run](#run(akka.stream.Materializer))​([Materializer](../Materializer.html "class in akka.stream") materializer)` | Connect this `Source` to the `Sink.ignore` and run it. |
	| `<U> scala.concurrent.Future<U>` | `[runFold](#runFold(U,scala.Function2,akka.stream.Materializer))​(U zero,  scala.Function2<U,​[Out](Source.html "type parameter in Source"),​U> f,  [Materializer](../Materializer.html "class in akka.stream") materializer)` | Shortcut for running this `Source` with a fold function. |
	| `<U> scala.concurrent.Future<U>` | `[runFoldAsync](#runFoldAsync(U,scala.Function2,akka.stream.Materializer))​(U zero,  scala.Function2<U,​[Out](Source.html "type parameter in Source"),​scala.concurrent.Future<U>> f,  [Materializer](../Materializer.html "class in akka.stream") materializer)` | Shortcut for running this `Source` with a foldAsync function. |
	| `scala.concurrent.Future<[Done](../../Done.html "class in akka")>` | `[runForeach](#runForeach(scala.Function1,akka.stream.Materializer))​(scala.Function1<[Out](Source.html "type parameter in Source"),​scala.runtime.BoxedUnit> f,  [Materializer](../Materializer.html "class in akka.stream") materializer)` | Shortcut for running this `Source` with a foreach procedure. |
	| `<U> scala.concurrent.Future<U>` | `[runReduce](#runReduce(scala.Function2,akka.stream.Materializer))​(scala.Function2<U,​U,​U> f,  [Materializer](../Materializer.html "class in akka.stream") materializer)` | Shortcut for running this `Source` with a reduce function. |
	| `<Mat2> Mat2` | `[runWith](#runWith(akka.stream.Graph,akka.stream.Materializer))​([Graph](../Graph.html "interface in akka.stream")<[SinkShape](../SinkShape.html "class in akka.stream")<[Out](Source.html "type parameter in Source")>,​Mat2> sink,  [Materializer](../Materializer.html "class in akka.stream") materializer)` | Connect this `Source` to a `Sink` and run it. |
	| `static <T,​M>[Source](Source.html "class in akka.stream.scaladsl")<T,​scala.concurrent.Future<M>>` | `[setup](#setup(scala.Function2))​(scala.Function2<[ActorMaterializer](../ActorMaterializer.html "class in akka.stream"),​[Attributes](../Attributes.html "class in akka.stream"),​[Source](Source.html "class in akka.stream.scaladsl")<T,​M>> factory)` | Deprecated. Use 'fromMaterializer' instead. |
	| `[SourceShape](../SourceShape.html "class in akka.stream")<[Out](Source.html "type parameter in Source")>` | `[shape](#shape())()` | The shape of a graph is all that is externally visible: its inlets and outlets. |
	| `static <T> [Source](Source.html "class in akka.stream.scaladsl")<T,​[NotUsed](../../NotUsed.html "class in akka")>` | `[single](#single(T))​(T element)` | Create a `Source` with one element. |
	| `static <T> [Source](Source.html "class in akka.stream.scaladsl")<T,​[Cancellable](../../actor/Cancellable.html "interface in akka.actor")>` | `[tick](#tick(scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,T))​(scala.concurrent.duration.FiniteDuration initialDelay,  scala.concurrent.duration.FiniteDuration interval,  T tick)` | Elements are emitted periodically with the specified interval. |
	| `<Mat2> [RunnableGraph](RunnableGraph.html "class in akka.stream.scaladsl")<[Mat](Source.html "type parameter in Source")>` | `[to](#to(akka.stream.Graph))​([Graph](../Graph.html "interface in akka.stream")<[SinkShape](../SinkShape.html "class in akka.stream")<[Out](Source.html "type parameter in Source")>,​Mat2> sink)` | Connect this [`Source`](Source.html "class in akka.stream.scaladsl") to a [`Sink`](Sink.html "class in akka.stream.scaladsl"),  concatenating the processing steps of both. |
	| `<Mat2,​Mat3>[RunnableGraph](RunnableGraph.html "class in akka.stream.scaladsl")<Mat3>` | `[toMat](#toMat(akka.stream.Graph,scala.Function2))​([Graph](../Graph.html "interface in akka.stream")<[SinkShape](../SinkShape.html "class in akka.stream")<[Out](Source.html "type parameter in Source")>,​Mat2> sink,  scala.Function2<[Mat](Source.html "type parameter in Source"),​Mat2,​Mat3> combine)` | Connect this [`Source`](Source.html "class in akka.stream.scaladsl") to a [`Sink`](Sink.html "class in akka.stream.scaladsl"),  concatenating the processing steps of both. |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `akka.stream.impl.LinearTraversalBuilder` | `[traversalBuilder](#traversalBuilder())()` | INTERNAL API. |
	| `static <S,​E>[Source](Source.html "class in akka.stream.scaladsl")<E,​[NotUsed](../../NotUsed.html "class in akka")>` | `[unfold](#unfold(S,scala.Function1))​(S s,  scala.Function1<S,​scala.Option<scala.Tuple2<S,​E>>> f)` | Create a `Source` that will unfold a value of type `S` into  a pair of the next state `S` and output elements of type `E`. |
	| `static <S,​E>[Source](Source.html "class in akka.stream.scaladsl")<E,​[NotUsed](../../NotUsed.html "class in akka")>` | `[unfoldAsync](#unfoldAsync(S,scala.Function1))​(S s,  scala.Function1<S,​scala.concurrent.Future<scala.Option<scala.Tuple2<S,​E>>>> f)` | Same as [`<S,E>unfold(S,scala.Function1<S,scala.Option<scala.Tuple2<S,E>>>)`](#unfold(S,scala.Function1)), but uses an async function to generate the next state\-element tuple. |
	| `static <T,​S>[Source](Source.html "class in akka.stream.scaladsl")<T,​[NotUsed](../../NotUsed.html "class in akka")>` | `[unfoldResource](#unfoldResource(scala.Function0,scala.Function1,scala.Function1))​(scala.Function0<S> create,  scala.Function1<S,​scala.Option<T>> read,  scala.Function1<S,​scala.runtime.BoxedUnit> close)` | Start a new `Source` from some resource which can be opened, read and closed. |
	| `static <T,​S>[Source](Source.html "class in akka.stream.scaladsl")<T,​[NotUsed](../../NotUsed.html "class in akka")>` | `[unfoldResourceAsync](#unfoldResourceAsync(scala.Function0,scala.Function1,scala.Function1))​(scala.Function0<scala.concurrent.Future<S>> create,  scala.Function1<S,​scala.concurrent.Future<scala.Option<T>>> read,  scala.Function1<S,​scala.concurrent.Future<[Done](../../Done.html "class in akka")>> close)` | Start a new `Source` from some resource which can be opened, read and closed. |
	| `<T,​Mat2>[Source](Source.html "class in akka.stream.scaladsl")<T,​[Mat](Source.html "type parameter in Source")>` | `[via](#via(akka.stream.Graph))​([Graph](../Graph.html "interface in akka.stream")<[FlowShape](../FlowShape.html "class in akka.stream")<[Out](Source.html "type parameter in Source"),​T>,​Mat2> flow)` |  |
	| `<T,​Mat2,​Mat3>[Source](Source.html "class in akka.stream.scaladsl")<T,​Mat3>` | `[viaMat](#viaMat(akka.stream.Graph,scala.Function2))​([Graph](../Graph.html "interface in akka.stream")<[FlowShape](../FlowShape.html "class in akka.stream")<[Out](Source.html "type parameter in Source"),​T>,​Mat2> flow,  scala.Function2<[Mat](Source.html "type parameter in Source"),​Mat2,​Mat3> combine)` | Transform this [`Flow`](Flow.html "class in akka.stream.scaladsl") by appending the given processing steps. |
	| `[Source](Source.html "class in akka.stream.scaladsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")>` | `[withAttributes](#withAttributes(akka.stream.Attributes))​([Attributes](../Attributes.html "class in akka.stream") attr)` | Replace the attributes of this [`Source`](Source.html "class in akka.stream.scaladsl") with the given ones. |
	| `static <T> [Source](Source.html "class in akka.stream.scaladsl")<scala.collection.immutable.Seq<T>,​[NotUsed](../../NotUsed.html "class in akka")>` | `[zipN](#zipN(scala.collection.immutable.Seq))​(scala.collection.immutable.Seq<[Source](Source.html "class in akka.stream.scaladsl")<T,​?>> sources)` | Combine the elements of multiple streams into a stream of sequences. |
	| `static <T,​O>[Source](Source.html "class in akka.stream.scaladsl")<O,​[NotUsed](../../NotUsed.html "class in akka")>` | `[zipWithN](#zipWithN(scala.Function1,scala.collection.immutable.Seq))​(scala.Function1<scala.collection.immutable.Seq<T>,​O> zipper,  scala.collection.immutable.Seq<[Source](Source.html "class in akka.stream.scaladsl")<T,​?>> sources)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface akka.stream.scaladsl.[FlowOps](FlowOps.html "interface in akka.stream.scaladsl")
		
		
		`[$plus$plus](FlowOps.html#$plus$plus(akka.stream.Graph)), [aggregateWithBoundary](FlowOps.html#aggregateWithBoundary(scala.Function0,scala.Function2,scala.Function1,scala.Option)), [alsoTo](FlowOps.html#alsoTo(akka.stream.Graph)), [alsoToAll](FlowOps.html#alsoToAll(scala.collection.immutable.Seq)), [alsoToGraph](FlowOps.html#alsoToGraph(akka.stream.Graph)), [ask](FlowOps.html#ask(int,akka.actor.ActorRef,akka.util.Timeout,scala.reflect.ClassTag)), [ask](FlowOps.html#ask(akka.actor.ActorRef,akka.util.Timeout,scala.reflect.ClassTag)), [backpressureTimeout](FlowOps.html#backpressureTimeout(scala.concurrent.duration.FiniteDuration)), [batch](FlowOps.html#batch(long,scala.Function1,scala.Function2)), [batchWeighted](FlowOps.html#batchWeighted(long,scala.Function1,scala.Function1,scala.Function2)), [buffer](FlowOps.html#buffer(int,akka.stream.OverflowStrategy)), [collect](FlowOps.html#collect(scala.PartialFunction)), [collectType](FlowOps.html#collectType(scala.reflect.ClassTag)), [completionTimeout](FlowOps.html#completionTimeout(scala.concurrent.duration.FiniteDuration)), [concat](FlowOps.html#concat(akka.stream.Graph)), [concatAllLazy](FlowOps.html#concatAllLazy(scala.collection.immutable.Seq)), [concatGraph](FlowOps.html#concatGraph(akka.stream.Graph,boolean)), [concatLazy](FlowOps.html#concatLazy(akka.stream.Graph)), [conflate](FlowOps.html#conflate(scala.Function2)), [conflateWithSeed](FlowOps.html#conflateWithSeed(scala.Function1,scala.Function2)), [delay](FlowOps.html#delay(scala.concurrent.duration.FiniteDuration,akka.stream.DelayOverflowStrategy)), [delay$default$2](FlowOps.html#delay$default$2()), [delayWith](FlowOps.html#delayWith(scala.Function0,akka.stream.DelayOverflowStrategy)), [detach](FlowOps.html#detach()), [divertTo](FlowOps.html#divertTo(akka.stream.Graph,scala.Function1)), [divertToGraph](FlowOps.html#divertToGraph(akka.stream.Graph,scala.Function1)), [drop](FlowOps.html#drop(long)), [dropWhile](FlowOps.html#dropWhile(scala.Function1)), [dropWithin](FlowOps.html#dropWithin(scala.concurrent.duration.FiniteDuration)), [expand](FlowOps.html#expand(scala.Function1)), [extrapolate](FlowOps.html#extrapolate(scala.Function1,scala.Option)), [extrapolate$default$2](FlowOps.html#extrapolate$default$2()), [filter](FlowOps.html#filter(scala.Function1)), [filterNot](FlowOps.html#filterNot(scala.Function1)), [flatMapConcat](FlowOps.html#flatMapConcat(scala.Function1)), [flatMapMerge](FlowOps.html#flatMapMerge(int,scala.Function1)), [flatMapPrefix](FlowOps.html#flatMapPrefix(int,scala.Function1)), [fold](FlowOps.html#fold(T,scala.Function2)), [foldAsync](FlowOps.html#foldAsync(T,scala.Function2)), [groupBy](FlowOps.html#groupBy(int,scala.Function1)), [groupBy](FlowOps.html#groupBy(int,scala.Function1,boolean)), [grouped](FlowOps.html#grouped(int)), [groupedWeighted](FlowOps.html#groupedWeighted(long,scala.Function1)), [groupedWeightedWithin](FlowOps.html#groupedWeightedWithin(long,int,scala.concurrent.duration.FiniteDuration,scala.Function1)), [groupedWeightedWithin](FlowOps.html#groupedWeightedWithin(long,scala.concurrent.duration.FiniteDuration,scala.Function1)), [groupedWithin](FlowOps.html#groupedWithin(int,scala.concurrent.duration.FiniteDuration)), [idleTimeout](FlowOps.html#idleTimeout(scala.concurrent.duration.FiniteDuration)), [initialDelay](FlowOps.html#initialDelay(scala.concurrent.duration.FiniteDuration)), [initialTimeout](FlowOps.html#initialTimeout(scala.concurrent.duration.FiniteDuration)), [interleave](FlowOps.html#interleave(akka.stream.Graph,int)), [interleave](FlowOps.html#interleave(akka.stream.Graph,int,boolean)), [interleaveAll](FlowOps.html#interleaveAll(scala.collection.immutable.Seq,int,boolean)), [interleaveGraph](FlowOps.html#interleaveGraph(akka.stream.Graph,int,boolean)), [interleaveGraph$default$3](FlowOps.html#interleaveGraph$default$3()), [internalConcat](FlowOps.html#internalConcat(akka.stream.Graph,boolean)), [internalConcatAll](FlowOps.html#internalConcatAll(akka.stream.Graph%5B%5D,boolean)), [intersperse](FlowOps.html#intersperse(T)), [intersperse](FlowOps.html#intersperse(T,T,T)), [keepAlive](FlowOps.html#keepAlive(scala.concurrent.duration.FiniteDuration,scala.Function0)), [limit](FlowOps.html#limit(long)), [limitWeighted](FlowOps.html#limitWeighted(long,scala.Function1)), [log](FlowOps.html#log(java.lang.String,scala.Function1,akka.event.LoggingAdapter)), [log$default$2](FlowOps.html#log$default$2()), [log$default$3](FlowOps.html#log$default$3(java.lang.String,scala.Function1)), [logWithMarker](FlowOps.html#logWithMarker(java.lang.String,scala.Function1,scala.Function1,akka.event.MarkerLoggingAdapter)), [logWithMarker$default$3](FlowOps.html#logWithMarker$default$3()), [logWithMarker$default$4](FlowOps.html#logWithMarker$default$4(java.lang.String,scala.Function1,scala.Function1)), [map](FlowOps.html#map(scala.Function1)), [mapAsync](FlowOps.html#mapAsync(int,scala.Function1)), [mapAsyncPartitioned](FlowOps.html#mapAsyncPartitioned(int,int,scala.Function1,scala.Function2)), [mapAsyncUnordered](FlowOps.html#mapAsyncUnordered(int,scala.Function1)), [mapConcat](FlowOps.html#mapConcat(scala.Function1)), [mapError](FlowOps.html#mapError(scala.PartialFunction)), [mapWithResource](FlowOps.html#mapWithResource(scala.Function0,scala.Function2,scala.Function1)), [merge](FlowOps.html#merge(akka.stream.Graph,boolean)), [merge$default$2](FlowOps.html#merge$default$2()), [mergeAll](FlowOps.html#mergeAll(scala.collection.immutable.Seq,boolean)), [mergeGraph](FlowOps.html#mergeGraph(akka.stream.Graph,boolean)), [mergeLatest](FlowOps.html#mergeLatest(akka.stream.Graph,boolean)), [mergeLatest$default$2](FlowOps.html#mergeLatest$default$2()), [mergeLatestGraph](FlowOps.html#mergeLatestGraph(akka.stream.Graph,boolean)), [mergePreferred](FlowOps.html#mergePreferred(akka.stream.Graph,boolean,boolean)), [mergePreferred$default$3](FlowOps.html#mergePreferred$default$3()), [mergePreferredGraph](FlowOps.html#mergePreferredGraph(akka.stream.Graph,boolean,boolean)), [mergePrioritized](FlowOps.html#mergePrioritized(akka.stream.Graph,int,int,boolean)), [mergePrioritized$default$4](FlowOps.html#mergePrioritized$default$4()), [mergePrioritizedGraph](FlowOps.html#mergePrioritizedGraph(akka.stream.Graph,int,int,boolean)), [mergeSorted](FlowOps.html#mergeSorted(akka.stream.Graph,scala.math.Ordering)), [mergeSortedGraph](FlowOps.html#mergeSortedGraph(akka.stream.Graph,scala.math.Ordering)), [onErrorComplete](FlowOps.html#onErrorComplete(scala.PartialFunction)), [onErrorComplete](FlowOps.html#onErrorComplete(scala.reflect.ClassTag)), [orElse](FlowOps.html#orElse(akka.stream.Graph)), [orElseGraph](FlowOps.html#orElseGraph(akka.stream.Graph)), [prefixAndTail](FlowOps.html#prefixAndTail(int)), [prepend](FlowOps.html#prepend(akka.stream.Graph)), [prependGraph](FlowOps.html#prependGraph(akka.stream.Graph,boolean)), [prependLazy](FlowOps.html#prependLazy(akka.stream.Graph)), [recover](FlowOps.html#recover(scala.PartialFunction)), [recoverWith](FlowOps.html#recoverWith(scala.PartialFunction)), [recoverWithRetries](FlowOps.html#recoverWithRetries(int,scala.PartialFunction)), [reduce](FlowOps.html#reduce(scala.Function2)), [scan](FlowOps.html#scan(T,scala.Function2)), [scanAsync](FlowOps.html#scanAsync(T,scala.Function2)), [sliding](FlowOps.html#sliding(int,int)), [sliding$default$2](FlowOps.html#sliding$default$2()), [splitAfter](FlowOps.html#splitAfter(akka.stream.SubstreamCancelStrategy,scala.Function1)), [splitAfter](FlowOps.html#splitAfter(scala.Function1)), [splitWhen](FlowOps.html#splitWhen(akka.stream.SubstreamCancelStrategy,scala.Function1)), [splitWhen](FlowOps.html#splitWhen(scala.Function1)), [statefulMap](FlowOps.html#statefulMap(scala.Function0,scala.Function2,scala.Function1)), [statefulMapConcat](FlowOps.html#statefulMapConcat(scala.Function0)), [take](FlowOps.html#take(long)), [takeWhile](FlowOps.html#takeWhile(scala.Function1)), [takeWhile](FlowOps.html#takeWhile(scala.Function1,boolean)), [takeWithin](FlowOps.html#takeWithin(scala.concurrent.duration.FiniteDuration)), [throttle](FlowOps.html#throttle(int,scala.concurrent.duration.FiniteDuration)), [throttle](FlowOps.html#throttle(int,scala.concurrent.duration.FiniteDuration,int,akka.stream.ThrottleMode)), [throttle](FlowOps.html#throttle(int,scala.concurrent.duration.FiniteDuration,int,scala.Function1,akka.stream.ThrottleMode)), [throttle](FlowOps.html#throttle(int,scala.concurrent.duration.FiniteDuration,scala.Function1)), [throttle](FlowOps.html#throttle(akka.stream.scaladsl.ThrottleControl)), [throttle](FlowOps.html#throttle(akka.stream.scaladsl.ThrottleControl,scala.Function1)), [watch](FlowOps.html#watch(akka.actor.ActorRef)), [wireTap](FlowOps.html#wireTap(akka.stream.Graph)), [wireTap](FlowOps.html#wireTap(scala.Function1)), [wireTapGraph](FlowOps.html#wireTapGraph(akka.stream.Graph)), [zip](FlowOps.html#zip(akka.stream.Graph)), [zipAll](FlowOps.html#zipAll(akka.stream.Graph,A,U)), [zipAllFlow](FlowOps.html#zipAllFlow(akka.stream.Graph,A,U)), [zipGraph](FlowOps.html#zipGraph(akka.stream.Graph)), [zipLatest](FlowOps.html#zipLatest(akka.stream.Graph)), [zipLatestGraph](FlowOps.html#zipLatestGraph(akka.stream.Graph)), [zipLatestWith](FlowOps.html#zipLatestWith(akka.stream.Graph,boolean,scala.Function2)), [zipLatestWith](FlowOps.html#zipLatestWith(akka.stream.Graph,scala.Function2)), [zipLatestWithGraph](FlowOps.html#zipLatestWithGraph(akka.stream.Graph,boolean,scala.Function2)), [zipLatestWithGraph](FlowOps.html#zipLatestWithGraph(akka.stream.Graph,scala.Function2)), [zipWith](FlowOps.html#zipWith(akka.stream.Graph,scala.Function2)), [zipWithGraph](FlowOps.html#zipWithGraph(akka.stream.Graph,scala.Function2)), [zipWithIndex](FlowOps.html#zipWithIndex())`
		- ### Methods inherited from interface akka.stream.scaladsl.[FlowOpsMat](FlowOpsMat.html "interface in akka.stream.scaladsl")
		
		
		`[alsoToMat](FlowOpsMat.html#alsoToMat(akka.stream.Graph,scala.Function2)), [concatLazyMat](FlowOpsMat.html#concatLazyMat(akka.stream.Graph,scala.Function2)), [concatMat](FlowOpsMat.html#concatMat(akka.stream.Graph,scala.Function2)), [divertToMat](FlowOpsMat.html#divertToMat(akka.stream.Graph,scala.Function1,scala.Function2)), [flatMapPrefixMat](FlowOpsMat.html#flatMapPrefixMat(int,scala.Function1,scala.Function2)), [interleaveMat](FlowOpsMat.html#interleaveMat(akka.stream.Graph,int,boolean,scala.Function2)), [interleaveMat](FlowOpsMat.html#interleaveMat(akka.stream.Graph,int,scala.Function2)), [mergeLatestMat](FlowOpsMat.html#mergeLatestMat(akka.stream.Graph,boolean,scala.Function2)), [mergeMat](FlowOpsMat.html#mergeMat(akka.stream.Graph,boolean,scala.Function2)), [mergeMat$default$2](FlowOpsMat.html#mergeMat$default$2()), [mergePreferredMat](FlowOpsMat.html#mergePreferredMat(akka.stream.Graph,boolean,boolean,scala.Function2)), [mergePrioritizedMat](FlowOpsMat.html#mergePrioritizedMat(akka.stream.Graph,int,int,boolean,scala.Function2)), [mergeSortedMat](FlowOpsMat.html#mergeSortedMat(akka.stream.Graph,scala.Function2,scala.math.Ordering)), [monitor](FlowOpsMat.html#monitor()), [monitorMat](FlowOpsMat.html#monitorMat(scala.Function2)), [orElseMat](FlowOpsMat.html#orElseMat(akka.stream.Graph,scala.Function2)), [prependLazyMat](FlowOpsMat.html#prependLazyMat(akka.stream.Graph,scala.Function2)), [prependMat](FlowOpsMat.html#prependMat(akka.stream.Graph,scala.Function2)), [watchTermination](FlowOpsMat.html#watchTermination(scala.Function2)), [wireTapMat](FlowOpsMat.html#wireTapMat(akka.stream.Graph,scala.Function2)), [zipAllMat](FlowOpsMat.html#zipAllMat(akka.stream.Graph,A,U,scala.Function2)), [zipLatestMat](FlowOpsMat.html#zipLatestMat(akka.stream.Graph,scala.Function2)), [zipLatestWithMat](FlowOpsMat.html#zipLatestWithMat(akka.stream.Graph,boolean,scala.Function2,scala.Function2)), [zipLatestWithMat](FlowOpsMat.html#zipLatestWithMat(akka.stream.Graph,scala.Function2,scala.Function2)), [zipMat](FlowOpsMat.html#zipMat(akka.stream.Graph,scala.Function2)), [zipWithMat](FlowOpsMat.html#zipWithMat(akka.stream.Graph,scala.Function2,scala.Function2))`

- - ### Constructor Detail
	
	
	
		- #### Source
		
		
		
		```
		public Source​(akka.stream.impl.LinearTraversalBuilder traversalBuilder,
		              [SourceShape](../SourceShape.html "class in akka.stream")<[Out](Source.html "type parameter in Source")> shape)
		```

	- ### Method Detail
	
	
	
		- #### fromPublisher
		
		
		
		```
		public static <T> [Source](Source.html "class in akka.stream.scaladsl")<T,​[NotUsed](../../NotUsed.html "class in akka")> fromPublisher​(org.reactivestreams.Publisher<T> publisher)
		```
		
		Helper to create [`Source`](Source.html "class in akka.stream.scaladsl") from `Publisher`.
		 
		 Construct a transformation starting with given publisher. The transformation steps
		 are executed by a series of `Processor` instances
		 that mediate the flow of elements downstream and the propagation of
		 back\-pressure upstream.
		- #### fromIterator
		
		
		
		```
		public static <T> [Source](Source.html "class in akka.stream.scaladsl")<T,​[NotUsed](../../NotUsed.html "class in akka")> fromIterator​(scala.Function0<scala.collection.Iterator<T>> f)
		```
		
		Helper to create a [`Source`](Source.html "class in akka.stream.scaladsl") from an `Iterator`.
		 
		 Example usage: `Source.fromIterator(() => Iterator.from(0))`
		
		
		
		 Start a new `Source` from the given function that produces an `Iterator`.
		 The produced stream of elements will continue until the iterator runs empty
		 or fails during evaluation of the `next()` method.
		 Elements are pulled out of the iterator in accordance with the demand coming
		 from the downstream transformation steps.
		- #### fromJavaStream
		
		
		
		```
		public static <T,​S extends java.util.stream.BaseStream<T,​S>> [Source](Source.html "class in akka.stream.scaladsl")<T,​[NotUsed](../../NotUsed.html "class in akka")> fromJavaStream​(scala.Function0<java.util.stream.BaseStream<T,​S>> stream)
		```
		
		Creates a source that wraps a Java 8 Stream. Source uses a stream iterator to get all its
		 elements and send them downstream on demand.
		 
		 You can use `Source.async` to create asynchronous boundaries between synchronous Java Stream
		 and the rest of flow.
		- #### cycle
		
		
		
		```
		public static <T> [Source](Source.html "class in akka.stream.scaladsl")<T,​[NotUsed](../../NotUsed.html "class in akka")> cycle​(scala.Function0<scala.collection.Iterator<T>> f)
		```
		
		Creates a [`Source`](Source.html "class in akka.stream.scaladsl") that will continually produce elements in the order they are provided.
		 
		 The following example produces a [`Source`](Source.html "class in akka.stream.scaladsl") that repeatedly cycles through the integers from 0 to 9:
		 
		
		
		```
		
		   Source.cycle(() => Iterator.range(0, 10))
		 
		```
		
		
		 The function `f` is invoked to obtain an `Iterator` and elements are emitted into the stream as
		 provided by that iterator. If the iterator is finite, the function `f` invoked again, as necessary,
		 when the elements from the previous iteration are exhausted. If every call to the function `f` returns
		 an iterator that produces the same elements in the same order, then the [`Source`](Source.html "class in akka.stream.scaladsl") can be described
		 as cyclic. However, `f` is not required to behave that way, in which case the [`Source`](Source.html "class in akka.stream.scaladsl") will not be cyclic.
		 
		
		
		 The [`Source`](Source.html "class in akka.stream.scaladsl") fails if `f` returns an empty iterator.
		- #### fromGraph
		
		
		
		```
		public static <T,​M> [Source](Source.html "class in akka.stream.scaladsl")<T,​M> fromGraph​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<T>,​M> g)
		```
		
		A graph with the shape of a source logically is a source, this method makes
		 it so also in type.
		- #### fromMaterializer
		
		
		
		```
		public static <T,​M> [Source](Source.html "class in akka.stream.scaladsl")<T,​scala.concurrent.Future<M>> fromMaterializer​(scala.Function2<[Materializer](../Materializer.html "class in akka.stream"),​[Attributes](../Attributes.html "class in akka.stream"),​[Source](Source.html "class in akka.stream.scaladsl")<T,​M>> factory)
		```
		
		Defers the creation of a [`Source`](Source.html "class in akka.stream.scaladsl") until materialization. The `factory` function
		 exposes `Materializer` which is going to be used during materialization and
		 `Attributes` of the [`Source`](Source.html "class in akka.stream.scaladsl") returned by this method.
		- #### setup
		
		
		
		```
		public static <T,​M> [Source](Source.html "class in akka.stream.scaladsl")<T,​scala.concurrent.Future<M>> setup​(scala.Function2<[ActorMaterializer](../ActorMaterializer.html "class in akka.stream"),​[Attributes](../Attributes.html "class in akka.stream"),​[Source](Source.html "class in akka.stream.scaladsl")<T,​M>> factory)
		```
		
		Deprecated.
		Use 'fromMaterializer' instead. Since 2\.6\.0\.
		
		Defers the creation of a [`Source`](Source.html "class in akka.stream.scaladsl") until materialization. The `factory` function
		 exposes `ActorMaterializer` which is going to be used during materialization and
		 `Attributes` of the [`Source`](Source.html "class in akka.stream.scaladsl") returned by this method.
		- #### apply
		
		
		
		```
		public static <T> [Source](Source.html "class in akka.stream.scaladsl")<T,​[NotUsed](../../NotUsed.html "class in akka")> apply​(scala.collection.immutable.Iterable<T> iterable)
		```
		
		Helper to create [`Source`](Source.html "class in akka.stream.scaladsl") from `Iterable`.
		 Example usage: `Source(Seq(1,2,3))`
		
		 Starts a new `Source` from the given `Iterable`. This is like starting from an
		 Iterator, but every Subscriber directly attached to the Publisher of this
		 stream will see an individual flow of elements (always starting from the
		 beginning) regardless of when they subscribed.
		- #### fromFuture
		
		
		
		```
		public static <T> [Source](Source.html "class in akka.stream.scaladsl")<T,​[NotUsed](../../NotUsed.html "class in akka")> fromFuture​(scala.concurrent.Future<T> future)
		```
		
		Deprecated.
		Use 'Source.future' instead. Since 2\.6\.0\.
		
		Starts a new `Source` from the given `Future`. The stream will consist of
		 one element when the `Future` is completed with a successful value, which
		 may happen before or after materializing the `Flow`.
		 The stream terminates with a failure if the `Future` is completed with a failure.
		- #### fromCompletionStage
		
		
		
		```
		public static <T> [Source](Source.html "class in akka.stream.scaladsl")<T,​[NotUsed](../../NotUsed.html "class in akka")> fromCompletionStage​(java.util.concurrent.CompletionStage<T> future)
		```
		
		Deprecated.
		Use 'Source.completionStage' instead. Since 2\.6\.0\.
		
		Starts a new `Source` from the given `Future`. The stream will consist of
		 one element when the `Future` is completed with a successful value, which
		 may happen before or after materializing the `Flow`.
		 The stream terminates with a failure if the `Future` is completed with a failure.
		- #### fromFutureSource
		
		
		
		```
		public static <T,​M> [Source](Source.html "class in akka.stream.scaladsl")<T,​scala.concurrent.Future<M>> fromFutureSource​(scala.concurrent.Future<[Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<T>,​M>> future)
		```
		
		Deprecated.
		Use 'Source.futureSource' (potentially together with \`Source.fromGraph\`) instead. Since 2\.6\.0\.
		
		Streams the elements of the given future source once it successfully completes.
		 If the `Future` fails the stream is failed with the exception from the future. If downstream cancels before the
		 stream completes the materialized `Future` will be failed with a `StreamDetachedException`
		- #### fromSourceCompletionStage
		
		
		
		```
		public static <T,​M> [Source](Source.html "class in akka.stream.scaladsl")<T,​java.util.concurrent.CompletionStage<M>> fromSourceCompletionStage​(java.util.concurrent.CompletionStage<? extends [Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<T>,​M>> completion)
		```
		
		Deprecated.
		Use scala\-compat CompletionStage to future converter and 'Source.futureSource' instead. Since 2\.6\.0\.
		
		Streams the elements of an asynchronous source once its given `completion` operator completes.
		 If the `CompletionStage` fails the stream is failed with the exception from the future.
		 If downstream cancels before the stream completes the materialized `Future` will be failed
		 with a `StreamDetachedException`
		- #### tick
		
		
		
		```
		public static <T> [Source](Source.html "class in akka.stream.scaladsl")<T,​[Cancellable](../../actor/Cancellable.html "interface in akka.actor")> tick​(scala.concurrent.duration.FiniteDuration initialDelay,
		                                                   scala.concurrent.duration.FiniteDuration interval,
		                                                   T tick)
		```
		
		Elements are emitted periodically with the specified interval.
		 The tick element will be delivered to downstream consumers that has requested any elements.
		 If a consumer has not requested any elements at the point in time when the tick
		 element is produced it will not receive that tick element later. It will
		 receive new tick elements as soon as it has requested more elements.
		- #### single
		
		
		
		```
		public static <T> [Source](Source.html "class in akka.stream.scaladsl")<T,​[NotUsed](../../NotUsed.html "class in akka")> single​(T element)
		```
		
		Create a `Source` with one element.
		 Every connected `Sink` of this stream will see an individual stream consisting of one element.
		- #### repeat
		
		
		
		```
		public static <T> [Source](Source.html "class in akka.stream.scaladsl")<T,​[NotUsed](../../NotUsed.html "class in akka")> repeat​(T element)
		```
		
		Create a `Source` that will continually emit the given element.
		- #### unfold
		
		
		
		```
		public static <S,​E> [Source](Source.html "class in akka.stream.scaladsl")<E,​[NotUsed](../../NotUsed.html "class in akka")> unfold​(S s,
		                                                         scala.Function1<S,​scala.Option<scala.Tuple2<S,​E>>> f)
		```
		
		Create a `Source` that will unfold a value of type `S` into
		 a pair of the next state `S` and output elements of type `E`.
		 
		 For example, all the Fibonacci numbers under 10M:
		 
		
		
		
		
		
		```
		
		   Source.unfold(0 -> 1) {
		    case (a, _) if a > 10000000 => None
		    case (a, b) => Some((b -> (a + b)) -> a)
		   }
		 
		```
		- #### unfoldAsync
		
		
		
		```
		public static <S,​E> [Source](Source.html "class in akka.stream.scaladsl")<E,​[NotUsed](../../NotUsed.html "class in akka")> unfoldAsync​(S s,
		                                                              scala.Function1<S,​scala.concurrent.Future<scala.Option<scala.Tuple2<S,​E>>>> f)
		```
		
		Same as [`<S,E>unfold(S,scala.Function1<S,scala.Option<scala.Tuple2<S,E>>>)`](#unfold(S,scala.Function1)), but uses an async function to generate the next state\-element tuple.
		 
		 async fibonacci example:
		 
		
		
		
		
		
		```
		
		   Source.unfoldAsync(0 -> 1) {
		    case (a, _) if a > 10000000 => Future.successful(None)
		    case (a, b) => Future{
		      Thread.sleep(1000)
		      Some((b -> (a + b)) -> a)
		    }
		   }
		 
		```
		- #### empty
		
		
		
		```
		public static <T> [Source](Source.html "class in akka.stream.scaladsl")<T,​[NotUsed](../../NotUsed.html "class in akka")> empty()
		```
		
		A `Source` with no elements, i.e. an empty stream that is completed immediately for every connected `Sink`.
		- #### maybe
		
		
		
		```
		public static <T> [Source](Source.html "class in akka.stream.scaladsl")<T,​scala.concurrent.Promise<scala.Option<T>>> maybe()
		```
		
		Create a `Source` which materializes a `Promise` which controls what element
		 will be emitted by the Source.
		 If the materialized promise is completed with a Some, that value will be produced downstream,
		 followed by completion.
		 If the materialized promise is completed with a None, no value will be produced downstream and completion will
		 be signalled immediately.
		 If the materialized promise is completed with a failure, then the source will fail with that error.
		 If the downstream of this source cancels or fails before the promise has been completed, then the promise will be completed
		 with None.
		- #### failed
		
		
		
		```
		public static <T> [Source](Source.html "class in akka.stream.scaladsl")<T,​[NotUsed](../../NotUsed.html "class in akka")> failed​(java.lang.Throwable cause)
		```
		
		Create a `Source` that immediately ends the stream with the `cause` error to every connected `Sink`.
		- #### lazily
		
		
		
		```
		public static <T,​M> [Source](Source.html "class in akka.stream.scaladsl")<T,​scala.concurrent.Future<M>> lazily​(scala.Function0<[Source](Source.html "class in akka.stream.scaladsl")<T,​M>> create)
		```
		
		Deprecated.
		Use 'Source.lazySource' instead. Since 2\.6\.0\.
		
		Creates a `Source` that is not materialized until there is downstream demand, when the source gets materialized
		 the materialized future is completed with its value, if downstream cancels or fails without any demand the
		 create factory is never called and the materialized `Future` is failed.
		- #### lazilyAsync
		
		
		
		```
		public static <T> [Source](Source.html "class in akka.stream.scaladsl")<T,​scala.concurrent.Future<[NotUsed](../../NotUsed.html "class in akka")>> lazilyAsync​(scala.Function0<scala.concurrent.Future<T>> create)
		```
		
		Deprecated.
		Use 'Source.lazyFuture' instead. Since 2\.6\.0\.
		
		Creates a `Source` from supplied future factory that is not called until downstream demand. When source gets
		 materialized the materialized future is completed with the value from the factory. If downstream cancels or fails
		 without any demand the create factory is never called and the materialized `Future` is failed.
		 
		
		See Also:
		`Source.lazily`
		- #### future
		
		
		
		```
		public static <T> [Source](Source.html "class in akka.stream.scaladsl")<T,​[NotUsed](../../NotUsed.html "class in akka")> future​(scala.concurrent.Future<T> futureElement)
		```
		
		Emits a single value when the given `Future` is successfully completed and then completes the stream.
		 The stream fails if the `Future` is completed with a failure.
		- #### never
		
		
		
		```
		public static <T> [Source](Source.html "class in akka.stream.scaladsl")<T,​[NotUsed](../../NotUsed.html "class in akka")> never()
		```
		
		Never emits any elements, never completes and never fails.
		 This stream could be useful in tests.
		- #### completionStage
		
		
		
		```
		public static <T> [Source](Source.html "class in akka.stream.scaladsl")<T,​[NotUsed](../../NotUsed.html "class in akka")> completionStage​(java.util.concurrent.CompletionStage<T> completionStage)
		```
		
		Emits a single value when the given `CompletionStage` is successfully completed and then completes the stream.
		 If the `CompletionStage` is completed with a failure the stream is failed.
		 
		 Here for Java interoperability, the normal use from Scala should be `Source.future`
		- #### futureSource
		
		
		
		```
		public static <T,​M> [Source](Source.html "class in akka.stream.scaladsl")<T,​scala.concurrent.Future<M>> futureSource​(scala.concurrent.Future<[Source](Source.html "class in akka.stream.scaladsl")<T,​M>> futureSource)
		```
		
		Turn a `Future[Source]` into a source that will emit the values of the source when the future completes successfully.
		 If the `Future` is completed with a failure the stream is failed.
		- #### lazySingle
		
		
		
		```
		public static <T> [Source](Source.html "class in akka.stream.scaladsl")<T,​[NotUsed](../../NotUsed.html "class in akka")> lazySingle​(scala.Function0<T> create)
		```
		
		Defers invoking the `create` function to create a single element until there is downstream demand.
		 
		 If the `create` function fails when invoked the stream is failed.
		 
		
		
		 Note that asynchronous boundaries (and other operators) in the stream may do pre\-fetching which counter acts
		 the laziness and will trigger the factory immediately.
		- #### lazyFuture
		
		
		
		```
		public static <T> [Source](Source.html "class in akka.stream.scaladsl")<T,​[NotUsed](../../NotUsed.html "class in akka")> lazyFuture​(scala.Function0<scala.concurrent.Future<T>> create)
		```
		
		Defers invoking the `create` function to create a future element until there is downstream demand.
		 
		 The returned future element will be emitted downstream when it completes, or fail the stream if the future
		 is failed or the `create` function itself fails.
		 
		
		
		 Note that asynchronous boundaries (and other operators) in the stream may do pre\-fetching which counter acts
		 the laziness and will trigger the factory immediately.
		- #### lazySource
		
		
		
		```
		public static <T,​M> [Source](Source.html "class in akka.stream.scaladsl")<T,​scala.concurrent.Future<M>> lazySource​(scala.Function0<[Source](Source.html "class in akka.stream.scaladsl")<T,​M>> create)
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
		- #### lazyFutureSource
		
		
		
		```
		public static <T,​M> [Source](Source.html "class in akka.stream.scaladsl")<T,​scala.concurrent.Future<M>> lazyFutureSource​(scala.Function0<scala.concurrent.Future<[Source](Source.html "class in akka.stream.scaladsl")<T,​M>>> create)
		```
		
		Defers invoking the `create` function to create a future source until there is downstream demand.
		 
		 The returned future source will emit downstream and behave just like it was the outer source when the future completes
		 successfully. Downstream completes when the created source completes and fails when the created source fails.
		 If the future or the `create` function fails the stream is failed.
		 
		
		
		 Note that asynchronous boundaries (and other operators) in the stream may do pre\-fetching which counter acts
		 the laziness and triggers the factory immediately.
		 
		
		
		 The materialized future value is completed with the materialized value of the created source when
		 it has been materialized. If the function throws or the source materialization fails the future materialized value
		 is failed with the thrown exception.
		 
		
		
		 If downstream cancels or fails before the function is invoked the materialized value
		 is failed with a [`NeverMaterializedException`](../NeverMaterializedException.html "class in akka.stream")
		- #### asSubscriber
		
		
		
		```
		public static <T> [Source](Source.html "class in akka.stream.scaladsl")<T,​org.reactivestreams.Subscriber<T>> asSubscriber()
		```
		
		Creates a `Source` that is materialized as a `Subscriber`
		- #### actorRef
		
		
		
		```
		public static <T> [Source](Source.html "class in akka.stream.scaladsl")<T,​[ActorRef](../../actor/ActorRef.html "class in akka.actor")> actorRef​(scala.PartialFunction<java.lang.Object,​[CompletionStrategy](../CompletionStrategy.html "interface in akka.stream")> completionMatcher,
		                                                    scala.PartialFunction<java.lang.Object,​java.lang.Throwable> failureMatcher,
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
		public static <T> [Source](Source.html "class in akka.stream.scaladsl")<T,​[ActorRef](../../actor/ActorRef.html "class in akka.actor")> actorRef​(int bufferSize,
		                                                    [OverflowStrategy](../OverflowStrategy.html "class in akka.stream") overflowStrategy)
		```
		
		Deprecated.
		Use variant accepting completion and failure matchers instead. Since 2\.6\.0\.
		
		Creates a `Source` that is materialized as an [`ActorRef`](../../actor/ActorRef.html "class in akka.actor").
		 Messages sent to this actor will be emitted to the stream if there is demand from downstream,
		 otherwise they will be buffered until request for demand is received.
		 
		 Depending on the defined [`OverflowStrategy`](../OverflowStrategy.html "class in akka.stream") it might drop elements if
		 there is no space available in the buffer.
		 
		
		
		 The strategy `akka.stream.OverflowStrategy.backpressure` is not supported, and an
		 IllegalArgument("Backpressure overflowStrategy not supported") will be thrown if it is passed as argument.
		 
		
		
		 The buffer can be disabled by using `bufferSize` of 0 and then received messages are dropped if there is no demand
		 from downstream. When `bufferSize` is 0 the `overflowStrategy` does not matter.
		 
		
		
		 The stream can be completed successfully by sending the actor reference a [`Status.Success`](../../actor/Status.Success.html "class in akka.actor").
		 If the content is `akka.stream.CompletionStrategy.immediately` the completion will be signaled immediately.
		 Otherwise, if the content is `akka.stream.CompletionStrategy.draining` (or anything else)
		 already buffered elements will be sent out before signaling completion.
		 Using [`PoisonPill`](../../actor/PoisonPill.html "class in akka.actor") or `akka.actor.ActorSystem.stop` to stop the actor and complete the stream is \*not supported\*.
		 
		
		
		 The stream can be completed with failure by sending a [`Status.Failure`](../../actor/Status.Failure.html "class in akka.actor") to the
		 actor reference. In case the Actor is still draining its internal buffer (after having received
		 a [`Status.Success`](../../actor/Status.Success.html "class in akka.actor")) before signaling completion and it receives a [`Status.Failure`](../../actor/Status.Failure.html "class in akka.actor"),
		 the failure will be signaled downstream immediately (instead of the completion signal).
		 
		
		
		 The actor will be stopped when the stream is canceled from downstream,
		 i.e. you can watch it to get notified when that happens.
		 
		
		
		 See also `akka.stream.scaladsl.Source.queue`.
		 
		
		
		
		Parameters:
		`bufferSize` \- The size of the buffer in element count
		`overflowStrategy` \- Strategy that is used when incoming elements cannot fit inside the buffer
		- #### actorRefWithBackpressure
		
		
		
		```
		public static <T> [Source](Source.html "class in akka.stream.scaladsl")<T,​[ActorRef](../../actor/ActorRef.html "class in akka.actor")> actorRefWithBackpressure​(java.lang.Object ackMessage,
		                                                                    scala.PartialFunction<java.lang.Object,​[CompletionStrategy](../CompletionStrategy.html "interface in akka.stream")> completionMatcher,
		                                                                    scala.PartialFunction<java.lang.Object,​java.lang.Throwable> failureMatcher)
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
		public static <T> [Source](Source.html "class in akka.stream.scaladsl")<T,​[ActorRef](../../actor/ActorRef.html "class in akka.actor")> actorRefWithAck​(java.lang.Object ackMessage)
		```
		
		Deprecated.
		Use actorRefWithBackpressure accepting completion and failure matchers instead. Since 2\.6\.0\.
		
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
		- #### combine
		
		
		
		```
		public static <T,​U> [Source](Source.html "class in akka.stream.scaladsl")<U,​[NotUsed](../../NotUsed.html "class in akka")> combine​([Source](Source.html "class in akka.stream.scaladsl")<T,​?> first,
		                                                          [Source](Source.html "class in akka.stream.scaladsl")<T,​?> second,
		                                                          scala.collection.immutable.Seq<[Source](Source.html "class in akka.stream.scaladsl")<T,​?>> rest,
		                                                          scala.Function1<java.lang.Object,​[Graph](../Graph.html "interface in akka.stream")<[UniformFanInShape](../UniformFanInShape.html "class in akka.stream")<T,​U>,​[NotUsed](../../NotUsed.html "class in akka")>> fanInStrategy)
		```
		
		Combines several sources with fan\-in strategy like [`Merge`](Merge.html "class in akka.stream.scaladsl") or [`Concat`](Concat.html "class in akka.stream.scaladsl") into a single [`Source`](Source.html "class in akka.stream.scaladsl").
		- #### combine
		
		
		
		```
		public static <T,​U,​M> [Source](Source.html "class in akka.stream.scaladsl")<U,​scala.collection.immutable.Seq<M>> combine​(scala.collection.immutable.Seq<[Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<T>,​M>> sources,
		                                                                                            scala.Function1<java.lang.Object,​[Graph](../Graph.html "interface in akka.stream")<[UniformFanInShape](../UniformFanInShape.html "class in akka.stream")<T,​U>,​[NotUsed](../../NotUsed.html "class in akka")>> fanInStrategy)
		```
		
		Combines several sources with fan\-in strategy like [`Merge`](Merge.html "class in akka.stream.scaladsl") or [`Concat`](Concat.html "class in akka.stream.scaladsl") into a single [`Source`](Source.html "class in akka.stream.scaladsl").
		- #### combineMat
		
		
		
		```
		public static <T,​U,​M1,​M2,​M> [Source](Source.html "class in akka.stream.scaladsl")<U,​M> combineMat​([Source](Source.html "class in akka.stream.scaladsl")<T,​M1> first,
		                                                                                 [Source](Source.html "class in akka.stream.scaladsl")<T,​M2> second,
		                                                                                 scala.Function1<java.lang.Object,​[Graph](../Graph.html "interface in akka.stream")<[UniformFanInShape](../UniformFanInShape.html "class in akka.stream")<T,​U>,​[NotUsed](../../NotUsed.html "class in akka")>> fanInStrategy,
		                                                                                 scala.Function2<M1,​M2,​M> matF)
		```
		
		Combines two sources with fan\-in strategy like [`Merge`](Merge.html "class in akka.stream.scaladsl") or [`Concat`](Concat.html "class in akka.stream.scaladsl") into a single [`Source`](Source.html "class in akka.stream.scaladsl") with a materialized value.
		- #### zipN
		
		
		
		```
		public static <T> [Source](Source.html "class in akka.stream.scaladsl")<scala.collection.immutable.Seq<T>,​[NotUsed](../../NotUsed.html "class in akka")> zipN​(scala.collection.immutable.Seq<[Source](Source.html "class in akka.stream.scaladsl")<T,​?>> sources)
		```
		
		Combine the elements of multiple streams into a stream of sequences.
		- #### zipWithN
		
		
		
		```
		public static <T,​O> [Source](Source.html "class in akka.stream.scaladsl")<O,​[NotUsed](../../NotUsed.html "class in akka")> zipWithN​(scala.Function1<scala.collection.immutable.Seq<T>,​O> zipper,
		                                                           scala.collection.immutable.Seq<[Source](Source.html "class in akka.stream.scaladsl")<T,​?>> sources)
		```
		- #### queue
		
		
		
		```
		public static <T> [Source](Source.html "class in akka.stream.scaladsl")<T,​[BoundedSourceQueue](../BoundedSourceQueue.html "interface in akka.stream")<T>> queue​(int bufferSize)
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
		 
		
		
		`QueueOfferResult.Enqueued` element was added to buffer, but may still be discarded later when the queue is
		 failed or cancelled
		 `QueueOfferResult.Dropped` element was dropped
		 `QueueOfferResult.QueueComplete` the queue was completed with `akka.stream.BoundedSourceQueue.complete`
		`QueueOfferResult.Failure` the queue was failed with `akka.stream.BoundedSourceQueue.fail` or if
		 the stream failed
		 
		
		
		
		Parameters:
		`bufferSize` \- size of the buffer in number of elements
		- #### queue
		
		
		
		```
		public static <T> [Source](Source.html "class in akka.stream.scaladsl")<T,​[SourceQueueWithComplete](SourceQueueWithComplete.html "interface in akka.stream.scaladsl")<T>> queue​(int bufferSize,
		                                                                   [OverflowStrategy](../OverflowStrategy.html "class in akka.stream") overflowStrategy)
		```
		
		Creates a `Source` that is materialized as an [`SourceQueueWithComplete`](SourceQueueWithComplete.html "interface in akka.stream.scaladsl").
		 You can push elements to the queue and they will be emitted to the stream if there is demand from downstream,
		 otherwise they will be buffered until request for demand is received. Elements in the buffer will be discarded
		 if downstream is terminated.
		 
		 Depending on the defined [`OverflowStrategy`](../OverflowStrategy.html "class in akka.stream") it might drop elements if
		 there is no space available in the buffer.
		 
		
		
		 Acknowledgement mechanism is available.
		 `akka.stream.scaladsl.SourceQueueWithComplete.offer` returns `Future[QueueOfferResult]` which completes with
		 `QueueOfferResult.Enqueued` if element was added to buffer or sent downstream. It completes with
		 `QueueOfferResult.Dropped` if element was dropped. Can also complete with `QueueOfferResult.Failure` \-
		 when stream failed or `QueueOfferResult.QueueClosed` when downstream is completed.
		 
		
		
		 The strategy `akka.stream.OverflowStrategy.backpressure` will not complete last `offer():Future`
		 call when buffer is full.
		 
		
		
		 Instead of using the strategy `akka.stream.OverflowStrategy.dropNew` it's recommended to use
		 `Source.queue(bufferSize)` instead which returns a `QueueOfferResult` synchronously.
		 
		
		
		 You can watch accessibility of stream with `akka.stream.scaladsl.SourceQueueWithComplete.watchCompletion`.
		 It returns future that completes with success when the operator is completed or fails when the stream is failed.
		 
		
		
		 The buffer can be disabled by using `bufferSize` of 0 and then received message will wait
		 for downstream demand unless there is another message waiting for downstream demand, in that case
		 offer result will be completed according to the overflow strategy.
		 
		
		
		 The materialized SourceQueue may only be used from a single producer.
		 
		
		
		
		Parameters:
		`bufferSize` \- size of buffer in element count
		`overflowStrategy` \- Strategy that is used when incoming elements cannot fit inside the buffer
		- #### queue
		
		
		
		```
		public static <T> [Source](Source.html "class in akka.stream.scaladsl")<T,​[SourceQueueWithComplete](SourceQueueWithComplete.html "interface in akka.stream.scaladsl")<T>> queue​(int bufferSize,
		                                                                   [OverflowStrategy](../OverflowStrategy.html "class in akka.stream") overflowStrategy,
		                                                                   int maxConcurrentOffers)
		```
		
		Creates a `Source` that is materialized as an [`SourceQueueWithComplete`](SourceQueueWithComplete.html "interface in akka.stream.scaladsl").
		 You can push elements to the queue and they will be emitted to the stream if there is demand from downstream,
		 otherwise they will be buffered until request for demand is received. Elements in the buffer will be discarded
		 if downstream is terminated.
		 
		 Depending on the defined [`OverflowStrategy`](../OverflowStrategy.html "class in akka.stream") it might drop elements if
		 there is no space available in the buffer.
		 
		
		
		 Acknowledgement mechanism is available.
		 `akka.stream.scaladsl.SourceQueueWithComplete.offer` returns `Future[QueueOfferResult]` which completes with
		 `QueueOfferResult.Enqueued` if element was added to buffer or sent downstream. It completes with
		 `QueueOfferResult.Dropped` if element was dropped. Can also complete with `QueueOfferResult.Failure` \-
		 when stream failed or `QueueOfferResult.QueueClosed` when downstream is completed.
		 
		
		
		 The strategy `akka.stream.OverflowStrategy.backpressure` will not complete `maxConcurrentOffers` number of
		 `offer():Future` call when buffer is full.
		 
		
		
		 Instead of using the strategy `akka.stream.OverflowStrategy.dropNew` it's recommended to use
		 `Source.queue(bufferSize)` instead which returns a `QueueOfferResult` synchronously.
		 
		
		
		 You can watch accessibility of stream with `akka.stream.scaladsl.SourceQueueWithComplete.watchCompletion`.
		 It returns future that completes with success when the operator is completed or fails when the stream is failed.
		 
		
		
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
		public static <T,​S> [Source](Source.html "class in akka.stream.scaladsl")<T,​[NotUsed](../../NotUsed.html "class in akka")> unfoldResource​(scala.Function0<S> create,
		                                                                 scala.Function1<S,​scala.Option<T>> read,
		                                                                 scala.Function1<S,​scala.runtime.BoxedUnit> close)
		```
		
		Start a new `Source` from some resource which can be opened, read and closed.
		 Interaction with resource happens in a blocking way.
		 
		 Example:
		 
		
		
		```
		
		 Source.unfoldResource(
		   () => new BufferedReader(new FileReader("...")),
		   reader => Option(reader.readLine()),
		   reader => reader.close())
		 
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
		 is received. Stream calls close and completes when `read` returns None.
		`close` \- \- function that closes resource
		- #### unfoldResourceAsync
		
		
		
		```
		public static <T,​S> [Source](Source.html "class in akka.stream.scaladsl")<T,​[NotUsed](../../NotUsed.html "class in akka")> unfoldResourceAsync​(scala.Function0<scala.concurrent.Future<S>> create,
		                                                                      scala.Function1<S,​scala.concurrent.Future<scala.Option<T>>> read,
		                                                                      scala.Function1<S,​scala.concurrent.Future<[Done](../../Done.html "class in akka")>> close)
		```
		
		Start a new `Source` from some resource which can be opened, read and closed.
		 It's similar to `unfoldResource` but takes functions that return `Futures` instead of plain values.
		 
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
		 is received. Stream calls close and completes when `Future` from read function returns None.
		`close` \- \- function that closes resource
		- #### mergePrioritizedN
		
		
		
		```
		public static <T> [Source](Source.html "class in akka.stream.scaladsl")<T,​[NotUsed](../../NotUsed.html "class in akka")> mergePrioritizedN​(scala.collection.immutable.Seq<scala.Tuple2<[Source](Source.html "class in akka.stream.scaladsl")<T,​?>,​java.lang.Object>> sourcesAndPriorities,
		                                                            boolean eagerComplete)
		```
		
		Merge multiple [`Source`](Source.html "class in akka.stream.scaladsl")s. Prefer the sources depending on the 'priority' parameters.
		 The provided sources and priorities must have the same size and order.
		 
		 '''emits''' when one of the inputs has an element available, preferring inputs based on the 'priority' parameters if both have elements available
		 
		
		
		 '''backpressures''' when downstream backpressures
		 
		
		
		 '''completes''' when both upstreams complete (This behavior is changeable to completing when any upstream completes by setting `eagerComplete=true`.)
		 
		
		
		 '''Cancels when''' downstream cancels
		- #### traversalBuilder
		
		
		
		```
		public akka.stream.impl.LinearTraversalBuilder traversalBuilder()
		```
		
		Description copied from interface: `[Graph](../Graph.html#traversalBuilder())`
		INTERNAL API.
		 
		 Every materializable element must be backed by a stream layout module
		
		
		
		Specified by:
		`[traversalBuilder](../Graph.html#traversalBuilder())` in interface `[Graph](../Graph.html "interface in akka.stream")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")>`
		- #### shape
		
		
		
		```
		public [SourceShape](../SourceShape.html "class in akka.stream")<[Out](Source.html "type parameter in Source")> shape()
		```
		
		Description copied from interface: `[Graph](../Graph.html#shape())`
		The shape of a graph is all that is externally visible: its inlets and outlets.
		
		Specified by:
		`[shape](../Graph.html#shape())` in interface `[Graph](../Graph.html "interface in akka.stream")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")>`
		- #### toString
		
		
		
		```
		public java.lang.String toString()
		```
		
		
		Overrides:
		`toString` in class `java.lang.Object`
		- #### via
		
		
		
		```
		public <T,​Mat2> [Source](Source.html "class in akka.stream.scaladsl")<T,​[Mat](Source.html "type parameter in Source")> via​([Graph](../Graph.html "interface in akka.stream")<[FlowShape](../FlowShape.html "class in akka.stream")<[Out](Source.html "type parameter in Source"),​T>,​Mat2> flow)
		```
		
		
		Specified by:
		`[via](FlowOps.html#via(akka.stream.Graph))` in interface `[FlowOps](FlowOps.html "interface in akka.stream.scaladsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")>`
		- #### viaMat
		
		
		
		```
		public <T,​Mat2,​Mat3> [Source](Source.html "class in akka.stream.scaladsl")<T,​Mat3> viaMat​([Graph](../Graph.html "interface in akka.stream")<[FlowShape](../FlowShape.html "class in akka.stream")<[Out](Source.html "type parameter in Source"),​T>,​Mat2> flow,
		                                                             scala.Function2<[Mat](Source.html "type parameter in Source"),​Mat2,​Mat3> combine)
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
		`[viaMat](FlowOpsMat.html#viaMat(akka.stream.Graph,scala.Function2))` in interface `[FlowOpsMat](FlowOpsMat.html "interface in akka.stream.scaladsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")>`
		- #### to
		
		
		
		```
		public <Mat2> [RunnableGraph](RunnableGraph.html "class in akka.stream.scaladsl")<[Mat](Source.html "type parameter in Source")> to​([Graph](../Graph.html "interface in akka.stream")<[SinkShape](../SinkShape.html "class in akka.stream")<[Out](Source.html "type parameter in Source")>,​Mat2> sink)
		```
		
		Connect this [`Source`](Source.html "class in akka.stream.scaladsl") to a [`Sink`](Sink.html "class in akka.stream.scaladsl"),
		 concatenating the processing steps of both.
		
		Specified by:
		`[to](FlowOps.html#to(akka.stream.Graph))` in interface `[FlowOps](FlowOps.html "interface in akka.stream.scaladsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")>`
		- #### toMat
		
		
		
		```
		public <Mat2,​Mat3> [RunnableGraph](RunnableGraph.html "class in akka.stream.scaladsl")<Mat3> toMat​([Graph](../Graph.html "interface in akka.stream")<[SinkShape](../SinkShape.html "class in akka.stream")<[Out](Source.html "type parameter in Source")>,​Mat2> sink,
		                                                   scala.Function2<[Mat](Source.html "type parameter in Source"),​Mat2,​Mat3> combine)
		```
		
		Connect this [`Source`](Source.html "class in akka.stream.scaladsl") to a [`Sink`](Sink.html "class in akka.stream.scaladsl"),
		 concatenating the processing steps of both.
		
		Specified by:
		`[toMat](FlowOpsMat.html#toMat(akka.stream.Graph,scala.Function2))` in interface `[FlowOpsMat](FlowOpsMat.html "interface in akka.stream.scaladsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")>`
		- #### mapMaterializedValue
		
		
		
		```
		public <Mat2> [Source](Source.html "class in akka.stream.scaladsl")<[Out](Source.html "type parameter in Source"),​Mat2> mapMaterializedValue​(scala.Function1<[Mat](Source.html "type parameter in Source"),​Mat2> f)
		```
		
		Transform only the materialized value of this Source, leaving all other properties as they were.
		
		Specified by:
		`[mapMaterializedValue](FlowOpsMat.html#mapMaterializedValue(scala.Function1))` in interface `[FlowOpsMat](FlowOpsMat.html "interface in akka.stream.scaladsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")>`
		- #### preMaterialize
		
		
		
		```
		public scala.Tuple2<[Mat](Source.html "type parameter in Source"),​[Source](Source.html "class in akka.stream.scaladsl")<[Out](Source.html "type parameter in Source"),​[NotUsed](../../NotUsed.html "class in akka")>> preMaterialize​([Materializer](../Materializer.html "class in akka.stream") materializer)
		```
		
		Materializes this Source, immediately returning (1\) its materialized value, and (2\) a new Source
		 that can be used to consume elements from the newly materialized Source.
		 
		 Note that `preMaterialize` is implemented through a reactive streams `Publisher` which means that
		 a buffer is introduced and that errors are not propagated upstream but are turned into cancellations without error details.
		- #### run
		
		
		
		```
		public scala.concurrent.Future<[Done](../../Done.html "class in akka")> run​([Materializer](../Materializer.html "class in akka.stream") materializer)
		```
		
		Connect this `Source` to the `Sink.ignore` and run it. Elements from the stream will be consumed and discarded.
		 
		 Note that the `ActorSystem` can be used as the implicit `materializer` parameter to use the
		 [`SystemMaterializer`](../SystemMaterializer.html "class in akka.stream") for running the stream.
		- #### runWith
		
		
		
		```
		public <Mat2> Mat2 runWith​([Graph](../Graph.html "interface in akka.stream")<[SinkShape](../SinkShape.html "class in akka.stream")<[Out](Source.html "type parameter in Source")>,​Mat2> sink,
		                           [Materializer](../Materializer.html "class in akka.stream") materializer)
		```
		
		Connect this `Source` to a `Sink` and run it. The returned value is the materialized value
		 of the `Sink`, e.g. the `Publisher` of a `akka.stream.scaladsl.Sink#publisher`.
		 
		 Note that the `ActorSystem` can be used as the implicit `materializer` parameter to use the
		 [`SystemMaterializer`](../SystemMaterializer.html "class in akka.stream") for running the stream.
		- #### runFold
		
		
		
		```
		public <U> scala.concurrent.Future<U> runFold​(U zero,
		                                              scala.Function2<U,​[Out](Source.html "type parameter in Source"),​U> f,
		                                              [Materializer](../Materializer.html "class in akka.stream") materializer)
		```
		
		Shortcut for running this `Source` with a fold function.
		 The given function is invoked for every received element, giving it its previous
		 output (or the given `zero` value) and the element as input.
		 The returned `Future` will be completed with value of the final
		 function evaluation when the input stream ends, or completed with `Failure`
		 if there is a failure signaled in the stream.
		 
		 Note that the `ActorSystem` can be used as the implicit `materializer` parameter to use the
		 [`SystemMaterializer`](../SystemMaterializer.html "class in akka.stream") for running the stream.
		- #### runFoldAsync
		
		
		
		```
		public <U> scala.concurrent.Future<U> runFoldAsync​(U zero,
		                                                   scala.Function2<U,​[Out](Source.html "type parameter in Source"),​scala.concurrent.Future<U>> f,
		                                                   [Materializer](../Materializer.html "class in akka.stream") materializer)
		```
		
		Shortcut for running this `Source` with a foldAsync function.
		 The given function is invoked for every received element, giving it its previous
		 output (or the given `zero` value) and the element as input.
		 The returned `Future` will be completed with value of the final
		 function evaluation when the input stream ends, or completed with `Failure`
		 if there is a failure signaled in the stream.
		 
		 Note that the `ActorSystem` can be used as the implicit `materializer` parameter to use the
		 [`SystemMaterializer`](../SystemMaterializer.html "class in akka.stream") for running the stream.
		- #### runReduce
		
		
		
		```
		public <U> scala.concurrent.Future<U> runReduce​(scala.Function2<U,​U,​U> f,
		                                                [Materializer](../Materializer.html "class in akka.stream") materializer)
		```
		
		Shortcut for running this `Source` with a reduce function.
		 The given function is invoked for every received element, giving it its previous
		 output (from the second element) and the element as input.
		 The returned `Future` will be completed with value of the final
		 function evaluation when the input stream ends, or completed with `Failure`
		 if there is a failure signaled in the stream.
		 
		 If the stream is empty (i.e. completes before signalling any elements),
		 the reduce operator will fail its downstream with a `NoSuchElementException`,
		 which is semantically in\-line with that Scala's standard library collections
		 do in such situations.
		 
		
		
		 Note that the `ActorSystem` can be used as the implicit `materializer` parameter to use the
		 [`SystemMaterializer`](../SystemMaterializer.html "class in akka.stream") for running the stream.
		- #### runForeach
		
		
		
		```
		public scala.concurrent.Future<[Done](../../Done.html "class in akka")> runForeach​(scala.Function1<[Out](Source.html "type parameter in Source"),​scala.runtime.BoxedUnit> f,
		                                                [Materializer](../Materializer.html "class in akka.stream") materializer)
		```
		
		Shortcut for running this `Source` with a foreach procedure. The given procedure is invoked
		 for each received element.
		 The returned `Future` will be completed with `Success` when reaching the
		 normal end of the stream, or completed with `Failure` if there is a failure signaled in
		 the stream.
		 
		 Note that the `ActorSystem` can be used as the implicit `materializer` parameter to use the
		 [`SystemMaterializer`](../SystemMaterializer.html "class in akka.stream") for running the stream.
		- #### withAttributes
		
		
		
		```
		public [Source](Source.html "class in akka.stream.scaladsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")> withAttributes​([Attributes](../Attributes.html "class in akka.stream") attr)
		```
		
		Replace the attributes of this [`Source`](Source.html "class in akka.stream.scaladsl") with the given ones. If this Source is a composite
		 of multiple graphs, new attributes on the composite will be less specific than attributes
		 set directly on the individual graphs of the composite.
		
		Specified by:
		`[withAttributes](FlowOps.html#withAttributes(akka.stream.Attributes))` in interface `[FlowOps](FlowOps.html "interface in akka.stream.scaladsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")>`
		Specified by:
		`[withAttributes](../Graph.html#withAttributes(akka.stream.Attributes))` in interface `[Graph](../Graph.html "interface in akka.stream")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")>`
		- #### addAttributes
		
		
		
		```
		public [Source](Source.html "class in akka.stream.scaladsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")> addAttributes​([Attributes](../Attributes.html "class in akka.stream") attr)
		```
		
		Add the given attributes to this Source. If the specific attribute was already on this source
		 it will replace the previous value. If this Source is a composite
		 of multiple graphs, the added attributes will be on the composite and therefore less specific than attributes
		 set directly on the individual graphs of the composite.
		
		Specified by:
		`[addAttributes](FlowOps.html#addAttributes(akka.stream.Attributes))` in interface `[FlowOps](FlowOps.html "interface in akka.stream.scaladsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")>`
		Specified by:
		`[addAttributes](../Graph.html#addAttributes(akka.stream.Attributes))` in interface `[Graph](../Graph.html "interface in akka.stream")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")>`
		- #### named
		
		
		
		```
		public [Source](Source.html "class in akka.stream.scaladsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")> named​(java.lang.String name)
		```
		
		Add a name attribute to this Source.
		
		Specified by:
		`[named](FlowOps.html#named(java.lang.String))` in interface `[FlowOps](FlowOps.html "interface in akka.stream.scaladsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")>`
		Specified by:
		`[named](../Graph.html#named(java.lang.String))` in interface `[Graph](../Graph.html "interface in akka.stream")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")>`
		- #### async
		
		
		
		```
		public [Source](Source.html "class in akka.stream.scaladsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")> async()
		```
		
		Put an asynchronous boundary around this `Source`
		
		Specified by:
		`[async](FlowOps.html#async())` in interface `[FlowOps](FlowOps.html "interface in akka.stream.scaladsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")>`
		Specified by:
		`[async](../Graph.html#async())` in interface `[Graph](../Graph.html "interface in akka.stream")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")>`
		- #### async
		
		
		
		```
		public [Source](Source.html "class in akka.stream.scaladsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")> async​(java.lang.String dispatcher)
		```
		
		Put an asynchronous boundary around this `Graph`
		
		
		Specified by:
		`[async](../Graph.html#async(java.lang.String))` in interface `[Graph](../Graph.html "interface in akka.stream")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")>`
		Parameters:
		`dispatcher` \- Run the graph on this dispatcher
		- #### async
		
		
		
		```
		public [Source](Source.html "class in akka.stream.scaladsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")> async​(java.lang.String dispatcher,
		                                   int inputBufferSize)
		```
		
		Put an asynchronous boundary around this `Graph`
		
		
		Specified by:
		`[async](../Graph.html#async(java.lang.String,int))` in interface `[Graph](../Graph.html "interface in akka.stream")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")>`
		Parameters:
		`dispatcher` \- Run the graph on this dispatcher
		`inputBufferSize` \- Set the input buffer to this size for the graph
		- #### asJava
		
		
		
		```
		public [Source](../javadsl/Source.html "class in akka.stream.javadsl")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")> asJava()
		```
		
		Converts this Scala DSL element to it's Java DSL counterpart.
		- #### asSourceWithContext
		
		
		
		```
		public <Ctx> [SourceWithContext](SourceWithContext.html "class in akka.stream.scaladsl")<[Out](Source.html "type parameter in Source"),​Ctx,​[Mat](Source.html "type parameter in Source")> asSourceWithContext​(scala.Function1<[Out](Source.html "type parameter in Source"),​Ctx> f)
		```
		
		Transform this source whose element is e into a source producing tuple (e, f(e))
		- #### getAttributes
		
		
		
		```
		public [Attributes](../Attributes.html "class in akka.stream") getAttributes()
		```
		
		
		Specified by:
		`[getAttributes](../Graph.html#getAttributes())` in interface `[Graph](../Graph.html "interface in akka.stream")<[Out](Source.html "type parameter in Source"),​[Mat](Source.html "type parameter in Source")>`

## Code Examples

### Example 1: cycle

```text
Source.cycle(() => Iterator.range(0, 10))
```

### Example 2: unfold

```text
Source.unfold(0 -> 1) {
    case (a, _) if a > 10000000 => None
    case (a, b) => Some((b -> (a + b)) -> a)
   }
```

### Example 3: unfoldAsync

```text
Source.unfoldAsync(0 -> 1) {
    case (a, _) if a > 10000000 => Future.successful(None)
    case (a, b) => Future{
      Thread.sleep(1000)
      Some((b -> (a + b)) -> a)
    }
   }
```

### Example 4: unfoldResource

```text
Source.unfoldResource(
   () => new BufferedReader(new FileReader("...")),
   reader => Option(reader.readLine()),
   reader => reader.close())
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

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/2.10/akka/Done.html
- https://doc.akka.io/japi/akka/2.10/akka/NotUsed.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/Cancellable.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/PoisonPill.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/Status.Failure.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/Status.Success.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/ActorMaterializer.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/Attributes.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/BoundedSourceQueue.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/CompletionStrategy.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/FlowShape.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/Graph.GraphMapMatVal.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/Graph.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/Materializer.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/NeverMaterializedException.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/OverflowStrategy.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/QueueOfferResult.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/Shape.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/SinkShape.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/SourceShape.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/SystemMaterializer.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/UniformFanInShape.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/javadsl/Source.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/scaladsl/Concat.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/scaladsl/Flow.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/scaladsl/FlowOps.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/scaladsl/FlowOpsMat.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/scaladsl/Merge.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/scaladsl/RunnableGraph.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/scaladsl/Sink.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/scaladsl/Source.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/scaladsl/SourceQueueWithComplete.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/scaladsl/SourceWithContext.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/scaladsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/2.10/akka/stream/scaladsl/Source.html](https://doc.akka.io/japi/akka/2.10/akka/stream/scaladsl/Source.html)*