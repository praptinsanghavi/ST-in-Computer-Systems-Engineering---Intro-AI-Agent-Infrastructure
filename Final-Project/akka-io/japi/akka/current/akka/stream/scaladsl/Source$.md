---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:42:18Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/Source$.html
title: Source$
---

# Source$

## Content

Package [akka.stream.scaladsl](package-summary.html)
## Class Source$

- java.lang.Object
- - akka.stream.scaladsl.Source$

- ---

```
public class Source$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Source$](Source$.html "class in akka.stream.scaladsl")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Source$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) [Deprecated Methods](javascript:show(32);) 
	| Modifier and Type | Method | Description |
	| `<T> [Source](Source.html "class in akka.stream.scaladsl")<T,​[ActorRef](../../actor/ActorRef.html "class in akka.actor")>` | `[actorRef](#actorRef(int,akka.stream.OverflowStrategy))​(int bufferSize,  [OverflowStrategy](../OverflowStrategy.html "class in akka.stream") overflowStrategy)` | Deprecated. Use variant accepting completion and failure matchers instead. |
	| `<T> [Source](Source.html "class in akka.stream.scaladsl")<T,​[ActorRef](../../actor/ActorRef.html "class in akka.actor")>` | `[actorRef](#actorRef(scala.PartialFunction,scala.PartialFunction,int,akka.stream.OverflowStrategy))​(scala.PartialFunction<java.lang.Object,​[CompletionStrategy](../CompletionStrategy.html "interface in akka.stream")> completionMatcher,  scala.PartialFunction<java.lang.Object,​java.lang.Throwable> failureMatcher,  int bufferSize,  [OverflowStrategy](../OverflowStrategy.html "class in akka.stream") overflowStrategy)` | Creates a `Source` that is materialized as an [`ActorRef`](../../actor/ActorRef.html "class in akka.actor"). |
	| `<T> [Source](Source.html "class in akka.stream.scaladsl")<T,​[ActorRef](../../actor/ActorRef.html "class in akka.actor")>` | `[actorRefWithAck](#actorRefWithAck(java.lang.Object))​(java.lang.Object ackMessage)` | Deprecated. Use actorRefWithBackpressure accepting completion and failure matchers instead. |
	| `<T> [Source](Source.html "class in akka.stream.scaladsl")<T,​[ActorRef](../../actor/ActorRef.html "class in akka.actor")>` | `[actorRefWithBackpressure](#actorRefWithBackpressure(java.lang.Object,scala.PartialFunction,scala.PartialFunction))​(java.lang.Object ackMessage,  scala.PartialFunction<java.lang.Object,​[CompletionStrategy](../CompletionStrategy.html "interface in akka.stream")> completionMatcher,  scala.PartialFunction<java.lang.Object,​java.lang.Throwable> failureMatcher)` | Creates a `Source` that is materialized as an [`ActorRef`](../../actor/ActorRef.html "class in akka.actor"). |
	| `<T> [Source](Source.html "class in akka.stream.scaladsl")<T,​[NotUsed](../../NotUsed.html "class in akka")>` | `[apply](#apply(scala.collection.immutable.Iterable))​(scala.collection.immutable.Iterable<T> iterable)` | Helper to create [`Source`](Source.html "class in akka.stream.scaladsl") from `Iterable`. |
	| `<T> [Source](Source.html "class in akka.stream.scaladsl")<T,​org.reactivestreams.Subscriber<T>>` | `[asSubscriber](#asSubscriber())()` | Creates a `Source` that is materialized as a `Subscriber` |
	| `<T,​U>[Source](Source.html "class in akka.stream.scaladsl")<U,​[NotUsed](../../NotUsed.html "class in akka")>` | `[combine](#combine(akka.stream.scaladsl.Source,akka.stream.scaladsl.Source,scala.collection.immutable.Seq,scala.Function1))​([Source](Source.html "class in akka.stream.scaladsl")<T,​?> first,  [Source](Source.html "class in akka.stream.scaladsl")<T,​?> second,  scala.collection.immutable.Seq<[Source](Source.html "class in akka.stream.scaladsl")<T,​?>> rest,  scala.Function1<java.lang.Object,​[Graph](../Graph.html "interface in akka.stream")<[UniformFanInShape](../UniformFanInShape.html "class in akka.stream")<T,​U>,​[NotUsed](../../NotUsed.html "class in akka")>> fanInStrategy)` | Combines several sources with fan\-in strategy like [`Merge`](Merge.html "class in akka.stream.scaladsl") or [`Concat`](Concat.html "class in akka.stream.scaladsl") into a single [`Source`](Source.html "class in akka.stream.scaladsl"). |
	| `<T,​U,​M>[Source](Source.html "class in akka.stream.scaladsl")<U,​scala.collection.immutable.Seq<M>>` | `[combine](#combine(scala.collection.immutable.Seq,scala.Function1))​(scala.collection.immutable.Seq<[Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<T>,​M>> sources,  scala.Function1<java.lang.Object,​[Graph](../Graph.html "interface in akka.stream")<[UniformFanInShape](../UniformFanInShape.html "class in akka.stream")<T,​U>,​[NotUsed](../../NotUsed.html "class in akka")>> fanInStrategy)` | Combines several sources with fan\-in strategy like [`Merge`](Merge.html "class in akka.stream.scaladsl") or [`Concat`](Concat.html "class in akka.stream.scaladsl") into a single [`Source`](Source.html "class in akka.stream.scaladsl"). |
	| `<T,​U,​M1,​M2,​M>[Source](Source.html "class in akka.stream.scaladsl")<U,​M>` | `[combineMat](#combineMat(akka.stream.scaladsl.Source,akka.stream.scaladsl.Source,scala.Function1,scala.Function2))​([Source](Source.html "class in akka.stream.scaladsl")<T,​M1> first,  [Source](Source.html "class in akka.stream.scaladsl")<T,​M2> second,  scala.Function1<java.lang.Object,​[Graph](../Graph.html "interface in akka.stream")<[UniformFanInShape](../UniformFanInShape.html "class in akka.stream")<T,​U>,​[NotUsed](../../NotUsed.html "class in akka")>> fanInStrategy,  scala.Function2<M1,​M2,​M> matF)` | Combines two sources with fan\-in strategy like [`Merge`](Merge.html "class in akka.stream.scaladsl") or [`Concat`](Concat.html "class in akka.stream.scaladsl") into a single [`Source`](Source.html "class in akka.stream.scaladsl") with a materialized value. |
	| `<T> [Source](Source.html "class in akka.stream.scaladsl")<T,​[NotUsed](../../NotUsed.html "class in akka")>` | `[completionStage](#completionStage(java.util.concurrent.CompletionStage))​(java.util.concurrent.CompletionStage<T> completionStage)` | Emits a single value when the given `CompletionStage` is successfully completed and then completes the stream. |
	| `<T> [Source](Source.html "class in akka.stream.scaladsl")<T,​[NotUsed](../../NotUsed.html "class in akka")>` | `[cycle](#cycle(scala.Function0))​(scala.Function0<scala.collection.Iterator<T>> f)` | Creates a [`Source`](Source.html "class in akka.stream.scaladsl") that will continually produce elements in the order they are provided. |
	| `<T> [Source](Source.html "class in akka.stream.scaladsl")<T,​[NotUsed](../../NotUsed.html "class in akka")>` | `[empty](#empty())()` | A `Source` with no elements, i.e. |
	| `<T> [Source](Source.html "class in akka.stream.scaladsl")<T,​[NotUsed](../../NotUsed.html "class in akka")>` | `[failed](#failed(java.lang.Throwable))​(java.lang.Throwable cause)` | Create a `Source` that immediately ends the stream with the `cause` error to every connected `Sink`. |
	| `<T> [Source](Source.html "class in akka.stream.scaladsl")<T,​[NotUsed](../../NotUsed.html "class in akka")>` | `[fromCompletionStage](#fromCompletionStage(java.util.concurrent.CompletionStage))​(java.util.concurrent.CompletionStage<T> future)` | Deprecated. Use 'Source.completionStage' instead. |
	| `<T> [Source](Source.html "class in akka.stream.scaladsl")<T,​[NotUsed](../../NotUsed.html "class in akka")>` | `[fromFuture](#fromFuture(scala.concurrent.Future))​(scala.concurrent.Future<T> future)` | Deprecated. Use 'Source.future' instead. |
	| `<T,​M>[Source](Source.html "class in akka.stream.scaladsl")<T,​scala.concurrent.Future<M>>` | `[fromFutureSource](#fromFutureSource(scala.concurrent.Future))​(scala.concurrent.Future<[Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<T>,​M>> future)` | Deprecated. Use 'Source.futureSource' (potentially together with \`Source.fromGraph\`) instead. |
	| `<T,​M>[Source](Source.html "class in akka.stream.scaladsl")<T,​M>` | `[fromGraph](#fromGraph(akka.stream.Graph))​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<T>,​M> g)` | A graph with the shape of a source logically is a source, this method makes  it so also in type. |
	| `<T> [Source](Source.html "class in akka.stream.scaladsl")<T,​[NotUsed](../../NotUsed.html "class in akka")>` | `[fromIterator](#fromIterator(scala.Function0))​(scala.Function0<scala.collection.Iterator<T>> f)` | Helper to create a [`Source`](Source.html "class in akka.stream.scaladsl") from an `Iterator`. |
	| `<T,​S extends java.util.stream.BaseStream<T,​S>>[Source](Source.html "class in akka.stream.scaladsl")<T,​[NotUsed](../../NotUsed.html "class in akka")>` | `[fromJavaStream](#fromJavaStream(scala.Function0))​(scala.Function0<java.util.stream.BaseStream<T,​S>> stream)` | Creates a source that wraps a Java 8 Stream. |
	| `<T,​M>[Source](Source.html "class in akka.stream.scaladsl")<T,​scala.concurrent.Future<M>>` | `[fromMaterializer](#fromMaterializer(scala.Function2))​(scala.Function2<[Materializer](../Materializer.html "class in akka.stream"),​[Attributes](../Attributes.html "class in akka.stream"),​[Source](Source.html "class in akka.stream.scaladsl")<T,​M>> factory)` | Defers the creation of a [`Source`](Source.html "class in akka.stream.scaladsl") until materialization. |
	| `<T> [Source](Source.html "class in akka.stream.scaladsl")<T,​[NotUsed](../../NotUsed.html "class in akka")>` | `[fromPublisher](#fromPublisher(org.reactivestreams.Publisher))​(org.reactivestreams.Publisher<T> publisher)` | Helper to create [`Source`](Source.html "class in akka.stream.scaladsl") from `Publisher`. |
	| `<T,​M>[Source](Source.html "class in akka.stream.scaladsl")<T,​java.util.concurrent.CompletionStage<M>>` | `[fromSourceCompletionStage](#fromSourceCompletionStage(java.util.concurrent.CompletionStage))​(java.util.concurrent.CompletionStage<? extends [Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<T>,​M>> completion)` | Deprecated. Use scala\-compat CompletionStage to future converter and 'Source.futureSource' instead. |
	| `<T> [Source](Source.html "class in akka.stream.scaladsl")<T,​[NotUsed](../../NotUsed.html "class in akka")>` | `[future](#future(scala.concurrent.Future))​(scala.concurrent.Future<T> futureElement)` | Emits a single value when the given `Future` is successfully completed and then completes the stream. |
	| `<T,​M>[Source](Source.html "class in akka.stream.scaladsl")<T,​scala.concurrent.Future<M>>` | `[futureSource](#futureSource(scala.concurrent.Future))​(scala.concurrent.Future<[Source](Source.html "class in akka.stream.scaladsl")<T,​M>> futureSource)` | Turn a `Future[Source]` into a source that will emit the values of the source when the future completes successfully. |
	| `<T,​M>[Source](Source.html "class in akka.stream.scaladsl")<T,​scala.concurrent.Future<M>>` | `[lazily](#lazily(scala.Function0))​(scala.Function0<[Source](Source.html "class in akka.stream.scaladsl")<T,​M>> create)` | Deprecated. Use 'Source.lazySource' instead. |
	| `<T> [Source](Source.html "class in akka.stream.scaladsl")<T,​scala.concurrent.Future<[NotUsed](../../NotUsed.html "class in akka")>>` | `[lazilyAsync](#lazilyAsync(scala.Function0))​(scala.Function0<scala.concurrent.Future<T>> create)` | Deprecated. Use 'Source.lazyFuture' instead. |
	| `<T> [Source](Source.html "class in akka.stream.scaladsl")<T,​[NotUsed](../../NotUsed.html "class in akka")>` | `[lazyFuture](#lazyFuture(scala.Function0))​(scala.Function0<scala.concurrent.Future<T>> create)` | Defers invoking the `create` function to create a future element until there is downstream demand. |
	| `<T,​M>[Source](Source.html "class in akka.stream.scaladsl")<T,​scala.concurrent.Future<M>>` | `[lazyFutureSource](#lazyFutureSource(scala.Function0))​(scala.Function0<scala.concurrent.Future<[Source](Source.html "class in akka.stream.scaladsl")<T,​M>>> create)` | Defers invoking the `create` function to create a future source until there is downstream demand. |
	| `<T> [Source](Source.html "class in akka.stream.scaladsl")<T,​[NotUsed](../../NotUsed.html "class in akka")>` | `[lazySingle](#lazySingle(scala.Function0))​(scala.Function0<T> create)` | Defers invoking the `create` function to create a single element until there is downstream demand. |
	| `<T,​M>[Source](Source.html "class in akka.stream.scaladsl")<T,​scala.concurrent.Future<M>>` | `[lazySource](#lazySource(scala.Function0))​(scala.Function0<[Source](Source.html "class in akka.stream.scaladsl")<T,​M>> create)` | Defers invoking the `create` function to create a future source until there is downstream demand. |
	| `<T> [Source](Source.html "class in akka.stream.scaladsl")<T,​scala.concurrent.Promise<scala.Option<T>>>` | `[maybe](#maybe())()` | Create a `Source` which materializes a `Promise` which controls what element  will be emitted by the Source. |
	| `<T> [Source](Source.html "class in akka.stream.scaladsl")<T,​[NotUsed](../../NotUsed.html "class in akka")>` | `[mergePrioritizedN](#mergePrioritizedN(scala.collection.immutable.Seq,boolean))​(scala.collection.immutable.Seq<scala.Tuple2<[Source](Source.html "class in akka.stream.scaladsl")<T,​?>,​java.lang.Object>> sourcesAndPriorities,  boolean eagerComplete)` | Merge multiple [`Source`](Source.html "class in akka.stream.scaladsl")s. |
	| `<T> [Source](Source.html "class in akka.stream.scaladsl")<T,​[NotUsed](../../NotUsed.html "class in akka")>` | `[never](#never())()` | Never emits any elements, never completes and never fails. |
	| `<T> [Source](Source.html "class in akka.stream.scaladsl")<T,​[BoundedSourceQueue](../BoundedSourceQueue.html "interface in akka.stream")<T>>` | `[queue](#queue(int))​(int bufferSize)` | Creates a `Source` that is materialized as an [`BoundedSourceQueue`](../BoundedSourceQueue.html "interface in akka.stream"). |
	| `<T> [Source](Source.html "class in akka.stream.scaladsl")<T,​[SourceQueueWithComplete](SourceQueueWithComplete.html "interface in akka.stream.scaladsl")<T>>` | `[queue](#queue(int,akka.stream.OverflowStrategy))​(int bufferSize,  [OverflowStrategy](../OverflowStrategy.html "class in akka.stream") overflowStrategy)` | Creates a `Source` that is materialized as an [`SourceQueueWithComplete`](SourceQueueWithComplete.html "interface in akka.stream.scaladsl"). |
	| `<T> [Source](Source.html "class in akka.stream.scaladsl")<T,​[SourceQueueWithComplete](SourceQueueWithComplete.html "interface in akka.stream.scaladsl")<T>>` | `[queue](#queue(int,akka.stream.OverflowStrategy,int))​(int bufferSize,  [OverflowStrategy](../OverflowStrategy.html "class in akka.stream") overflowStrategy,  int maxConcurrentOffers)` | Creates a `Source` that is materialized as an [`SourceQueueWithComplete`](SourceQueueWithComplete.html "interface in akka.stream.scaladsl"). |
	| `<T> [Source](Source.html "class in akka.stream.scaladsl")<T,​[NotUsed](../../NotUsed.html "class in akka")>` | `[repeat](#repeat(T))​(T element)` | Create a `Source` that will continually emit the given element. |
	| `<T,​M>[Source](Source.html "class in akka.stream.scaladsl")<T,​scala.concurrent.Future<M>>` | `[setup](#setup(scala.Function2))​(scala.Function2<[ActorMaterializer](../ActorMaterializer.html "class in akka.stream"),​[Attributes](../Attributes.html "class in akka.stream"),​[Source](Source.html "class in akka.stream.scaladsl")<T,​M>> factory)` | Deprecated. Use 'fromMaterializer' instead. |
	| `<T> [SourceShape](../SourceShape.html "class in akka.stream")<T>` | `[shape](#shape(java.lang.String))​(java.lang.String name)` | INTERNAL API |
	| `<T> [Source](Source.html "class in akka.stream.scaladsl")<T,​[NotUsed](../../NotUsed.html "class in akka")>` | `[single](#single(T))​(T element)` | Create a `Source` with one element. |
	| `<T> [Source](Source.html "class in akka.stream.scaladsl")<T,​[Cancellable](../../actor/Cancellable.html "interface in akka.actor")>` | `[tick](#tick(scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,T))​(scala.concurrent.duration.FiniteDuration initialDelay,  scala.concurrent.duration.FiniteDuration interval,  T tick)` | Elements are emitted periodically with the specified interval. |
	| `<S,​E>[Source](Source.html "class in akka.stream.scaladsl")<E,​[NotUsed](../../NotUsed.html "class in akka")>` | `[unfold](#unfold(S,scala.Function1))​(S s,  scala.Function1<S,​scala.Option<scala.Tuple2<S,​E>>> f)` | Create a `Source` that will unfold a value of type `S` into  a pair of the next state `S` and output elements of type `E`. |
	| `<S,​E>[Source](Source.html "class in akka.stream.scaladsl")<E,​[NotUsed](../../NotUsed.html "class in akka")>` | `[unfoldAsync](#unfoldAsync(S,scala.Function1))​(S s,  scala.Function1<S,​scala.concurrent.Future<scala.Option<scala.Tuple2<S,​E>>>> f)` | Same as [`<S,E>unfold(S,scala.Function1<S,scala.Option<scala.Tuple2<S,E>>>)`](#unfold(S,scala.Function1)), but uses an async function to generate the next state\-element tuple. |
	| `<T,​S>[Source](Source.html "class in akka.stream.scaladsl")<T,​[NotUsed](../../NotUsed.html "class in akka")>` | `[unfoldResource](#unfoldResource(scala.Function0,scala.Function1,scala.Function1))​(scala.Function0<S> create,  scala.Function1<S,​scala.Option<T>> read,  scala.Function1<S,​scala.runtime.BoxedUnit> close)` | Start a new `Source` from some resource which can be opened, read and closed. |
	| `<T,​S>[Source](Source.html "class in akka.stream.scaladsl")<T,​[NotUsed](../../NotUsed.html "class in akka")>` | `[unfoldResourceAsync](#unfoldResourceAsync(scala.Function0,scala.Function1,scala.Function1))​(scala.Function0<scala.concurrent.Future<S>> create,  scala.Function1<S,​scala.concurrent.Future<scala.Option<T>>> read,  scala.Function1<S,​scala.concurrent.Future<[Done](../../Done.html "class in akka")>> close)` | Start a new `Source` from some resource which can be opened, read and closed. |
	| `<T> [Source](Source.html "class in akka.stream.scaladsl")<scala.collection.immutable.Seq<T>,​[NotUsed](../../NotUsed.html "class in akka")>` | `[zipN](#zipN(scala.collection.immutable.Seq))​(scala.collection.immutable.Seq<[Source](Source.html "class in akka.stream.scaladsl")<T,​?>> sources)` | Combine the elements of multiple streams into a stream of sequences. |
	| `<T,​O>[Source](Source.html "class in akka.stream.scaladsl")<O,​[NotUsed](../../NotUsed.html "class in akka")>` | `[zipWithN](#zipWithN(scala.Function1,scala.collection.immutable.Seq))​(scala.Function1<scala.collection.immutable.Seq<T>,​O> zipper,  scala.collection.immutable.Seq<[Source](Source.html "class in akka.stream.scaladsl")<T,​?>> sources)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [Source$](Source$.html "class in akka.stream.scaladsl") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Source$
		
		
		
		```
		public Source$()
		```

	- ### Method Detail
	
	
	
		- #### shape
		
		
		
		```
		public <T> [SourceShape](../SourceShape.html "class in akka.stream")<T> shape​(java.lang.String name)
		```
		
		INTERNAL API
		- #### fromPublisher
		
		
		
		```
		public <T> [Source](Source.html "class in akka.stream.scaladsl")<T,​[NotUsed](../../NotUsed.html "class in akka")> fromPublisher​(org.reactivestreams.Publisher<T> publisher)
		```
		
		Helper to create [`Source`](Source.html "class in akka.stream.scaladsl") from `Publisher`.
		 
		 Construct a transformation starting with given publisher. The transformation steps
		 are executed by a series of `Processor` instances
		 that mediate the flow of elements downstream and the propagation of
		 back\-pressure upstream.
		- #### fromIterator
		
		
		
		```
		public <T> [Source](Source.html "class in akka.stream.scaladsl")<T,​[NotUsed](../../NotUsed.html "class in akka")> fromIterator​(scala.Function0<scala.collection.Iterator<T>> f)
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
		public <T,​S extends java.util.stream.BaseStream<T,​S>> [Source](Source.html "class in akka.stream.scaladsl")<T,​[NotUsed](../../NotUsed.html "class in akka")> fromJavaStream​(scala.Function0<java.util.stream.BaseStream<T,​S>> stream)
		```
		
		Creates a source that wraps a Java 8 Stream. Source uses a stream iterator to get all its
		 elements and send them downstream on demand.
		 
		 You can use `Source.async` to create asynchronous boundaries between synchronous Java Stream
		 and the rest of flow.
		- #### cycle
		
		
		
		```
		public <T> [Source](Source.html "class in akka.stream.scaladsl")<T,​[NotUsed](../../NotUsed.html "class in akka")> cycle​(scala.Function0<scala.collection.Iterator<T>> f)
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
		public <T,​M> [Source](Source.html "class in akka.stream.scaladsl")<T,​M> fromGraph​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<T>,​M> g)
		```
		
		A graph with the shape of a source logically is a source, this method makes
		 it so also in type.
		- #### fromMaterializer
		
		
		
		```
		public <T,​M> [Source](Source.html "class in akka.stream.scaladsl")<T,​scala.concurrent.Future<M>> fromMaterializer​(scala.Function2<[Materializer](../Materializer.html "class in akka.stream"),​[Attributes](../Attributes.html "class in akka.stream"),​[Source](Source.html "class in akka.stream.scaladsl")<T,​M>> factory)
		```
		
		Defers the creation of a [`Source`](Source.html "class in akka.stream.scaladsl") until materialization. The `factory` function
		 exposes `Materializer` which is going to be used during materialization and
		 `Attributes` of the [`Source`](Source.html "class in akka.stream.scaladsl") returned by this method.
		- #### setup
		
		
		
		```
		public <T,​M> [Source](Source.html "class in akka.stream.scaladsl")<T,​scala.concurrent.Future<M>> setup​(scala.Function2<[ActorMaterializer](../ActorMaterializer.html "class in akka.stream"),​[Attributes](../Attributes.html "class in akka.stream"),​[Source](Source.html "class in akka.stream.scaladsl")<T,​M>> factory)
		```
		
		Deprecated.
		Use 'fromMaterializer' instead. Since 2\.6\.0\.
		
		Defers the creation of a [`Source`](Source.html "class in akka.stream.scaladsl") until materialization. The `factory` function
		 exposes `ActorMaterializer` which is going to be used during materialization and
		 `Attributes` of the [`Source`](Source.html "class in akka.stream.scaladsl") returned by this method.
		- #### apply
		
		
		
		```
		public <T> [Source](Source.html "class in akka.stream.scaladsl")<T,​[NotUsed](../../NotUsed.html "class in akka")> apply​(scala.collection.immutable.Iterable<T> iterable)
		```
		
		Helper to create [`Source`](Source.html "class in akka.stream.scaladsl") from `Iterable`.
		 Example usage: `Source(Seq(1,2,3))`
		
		 Starts a new `Source` from the given `Iterable`. This is like starting from an
		 Iterator, but every Subscriber directly attached to the Publisher of this
		 stream will see an individual flow of elements (always starting from the
		 beginning) regardless of when they subscribed.
		- #### fromFuture
		
		
		
		```
		public <T> [Source](Source.html "class in akka.stream.scaladsl")<T,​[NotUsed](../../NotUsed.html "class in akka")> fromFuture​(scala.concurrent.Future<T> future)
		```
		
		Deprecated.
		Use 'Source.future' instead. Since 2\.6\.0\.
		
		Starts a new `Source` from the given `Future`. The stream will consist of
		 one element when the `Future` is completed with a successful value, which
		 may happen before or after materializing the `Flow`.
		 The stream terminates with a failure if the `Future` is completed with a failure.
		- #### fromCompletionStage
		
		
		
		```
		public <T> [Source](Source.html "class in akka.stream.scaladsl")<T,​[NotUsed](../../NotUsed.html "class in akka")> fromCompletionStage​(java.util.concurrent.CompletionStage<T> future)
		```
		
		Deprecated.
		Use 'Source.completionStage' instead. Since 2\.6\.0\.
		
		Starts a new `Source` from the given `Future`. The stream will consist of
		 one element when the `Future` is completed with a successful value, which
		 may happen before or after materializing the `Flow`.
		 The stream terminates with a failure if the `Future` is completed with a failure.
		- #### fromFutureSource
		
		
		
		```
		public <T,​M> [Source](Source.html "class in akka.stream.scaladsl")<T,​scala.concurrent.Future<M>> fromFutureSource​(scala.concurrent.Future<[Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<T>,​M>> future)
		```
		
		Deprecated.
		Use 'Source.futureSource' (potentially together with \`Source.fromGraph\`) instead. Since 2\.6\.0\.
		
		Streams the elements of the given future source once it successfully completes.
		 If the `Future` fails the stream is failed with the exception from the future. If downstream cancels before the
		 stream completes the materialized `Future` will be failed with a `StreamDetachedException`
		- #### fromSourceCompletionStage
		
		
		
		```
		public <T,​M> [Source](Source.html "class in akka.stream.scaladsl")<T,​java.util.concurrent.CompletionStage<M>> fromSourceCompletionStage​(java.util.concurrent.CompletionStage<? extends [Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<T>,​M>> completion)
		```
		
		Deprecated.
		Use scala\-compat CompletionStage to future converter and 'Source.futureSource' instead. Since 2\.6\.0\.
		
		Streams the elements of an asynchronous source once its given `completion` operator completes.
		 If the `CompletionStage` fails the stream is failed with the exception from the future.
		 If downstream cancels before the stream completes the materialized `Future` will be failed
		 with a `StreamDetachedException`
		- #### tick
		
		
		
		```
		public <T> [Source](Source.html "class in akka.stream.scaladsl")<T,​[Cancellable](../../actor/Cancellable.html "interface in akka.actor")> tick​(scala.concurrent.duration.FiniteDuration initialDelay,
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
		public <T> [Source](Source.html "class in akka.stream.scaladsl")<T,​[NotUsed](../../NotUsed.html "class in akka")> single​(T element)
		```
		
		Create a `Source` with one element.
		 Every connected `Sink` of this stream will see an individual stream consisting of one element.
		- #### repeat
		
		
		
		```
		public <T> [Source](Source.html "class in akka.stream.scaladsl")<T,​[NotUsed](../../NotUsed.html "class in akka")> repeat​(T element)
		```
		
		Create a `Source` that will continually emit the given element.
		- #### unfold
		
		
		
		```
		public <S,​E> [Source](Source.html "class in akka.stream.scaladsl")<E,​[NotUsed](../../NotUsed.html "class in akka")> unfold​(S s,
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
		public <S,​E> [Source](Source.html "class in akka.stream.scaladsl")<E,​[NotUsed](../../NotUsed.html "class in akka")> unfoldAsync​(S s,
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
		public <T> [Source](Source.html "class in akka.stream.scaladsl")<T,​[NotUsed](../../NotUsed.html "class in akka")> empty()
		```
		
		A `Source` with no elements, i.e. an empty stream that is completed immediately for every connected `Sink`.
		- #### maybe
		
		
		
		```
		public <T> [Source](Source.html "class in akka.stream.scaladsl")<T,​scala.concurrent.Promise<scala.Option<T>>> maybe()
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
		public <T> [Source](Source.html "class in akka.stream.scaladsl")<T,​[NotUsed](../../NotUsed.html "class in akka")> failed​(java.lang.Throwable cause)
		```
		
		Create a `Source` that immediately ends the stream with the `cause` error to every connected `Sink`.
		- #### lazily
		
		
		
		```
		public <T,​M> [Source](Source.html "class in akka.stream.scaladsl")<T,​scala.concurrent.Future<M>> lazily​(scala.Function0<[Source](Source.html "class in akka.stream.scaladsl")<T,​M>> create)
		```
		
		Deprecated.
		Use 'Source.lazySource' instead. Since 2\.6\.0\.
		
		Creates a `Source` that is not materialized until there is downstream demand, when the source gets materialized
		 the materialized future is completed with its value, if downstream cancels or fails without any demand the
		 create factory is never called and the materialized `Future` is failed.
		- #### lazilyAsync
		
		
		
		```
		public <T> [Source](Source.html "class in akka.stream.scaladsl")<T,​scala.concurrent.Future<[NotUsed](../../NotUsed.html "class in akka")>> lazilyAsync​(scala.Function0<scala.concurrent.Future<T>> create)
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
		public <T> [Source](Source.html "class in akka.stream.scaladsl")<T,​[NotUsed](../../NotUsed.html "class in akka")> future​(scala.concurrent.Future<T> futureElement)
		```
		
		Emits a single value when the given `Future` is successfully completed and then completes the stream.
		 The stream fails if the `Future` is completed with a failure.
		- #### never
		
		
		
		```
		public <T> [Source](Source.html "class in akka.stream.scaladsl")<T,​[NotUsed](../../NotUsed.html "class in akka")> never()
		```
		
		Never emits any elements, never completes and never fails.
		 This stream could be useful in tests.
		- #### completionStage
		
		
		
		```
		public <T> [Source](Source.html "class in akka.stream.scaladsl")<T,​[NotUsed](../../NotUsed.html "class in akka")> completionStage​(java.util.concurrent.CompletionStage<T> completionStage)
		```
		
		Emits a single value when the given `CompletionStage` is successfully completed and then completes the stream.
		 If the `CompletionStage` is completed with a failure the stream is failed.
		 
		 Here for Java interoperability, the normal use from Scala should be `Source.future`
		- #### futureSource
		
		
		
		```
		public <T,​M> [Source](Source.html "class in akka.stream.scaladsl")<T,​scala.concurrent.Future<M>> futureSource​(scala.concurrent.Future<[Source](Source.html "class in akka.stream.scaladsl")<T,​M>> futureSource)
		```
		
		Turn a `Future[Source]` into a source that will emit the values of the source when the future completes successfully.
		 If the `Future` is completed with a failure the stream is failed.
		- #### lazySingle
		
		
		
		```
		public <T> [Source](Source.html "class in akka.stream.scaladsl")<T,​[NotUsed](../../NotUsed.html "class in akka")> lazySingle​(scala.Function0<T> create)
		```
		
		Defers invoking the `create` function to create a single element until there is downstream demand.
		 
		 If the `create` function fails when invoked the stream is failed.
		 
		
		
		 Note that asynchronous boundaries (and other operators) in the stream may do pre\-fetching which counter acts
		 the laziness and will trigger the factory immediately.
		- #### lazyFuture
		
		
		
		```
		public <T> [Source](Source.html "class in akka.stream.scaladsl")<T,​[NotUsed](../../NotUsed.html "class in akka")> lazyFuture​(scala.Function0<scala.concurrent.Future<T>> create)
		```
		
		Defers invoking the `create` function to create a future element until there is downstream demand.
		 
		 The returned future element will be emitted downstream when it completes, or fail the stream if the future
		 is failed or the `create` function itself fails.
		 
		
		
		 Note that asynchronous boundaries (and other operators) in the stream may do pre\-fetching which counter acts
		 the laziness and will trigger the factory immediately.
		- #### lazySource
		
		
		
		```
		public <T,​M> [Source](Source.html "class in akka.stream.scaladsl")<T,​scala.concurrent.Future<M>> lazySource​(scala.Function0<[Source](Source.html "class in akka.stream.scaladsl")<T,​M>> create)
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
		public <T,​M> [Source](Source.html "class in akka.stream.scaladsl")<T,​scala.concurrent.Future<M>> lazyFutureSource​(scala.Function0<scala.concurrent.Future<[Source](Source.html "class in akka.stream.scaladsl")<T,​M>>> create)
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
		public <T> [Source](Source.html "class in akka.stream.scaladsl")<T,​org.reactivestreams.Subscriber<T>> asSubscriber()
		```
		
		Creates a `Source` that is materialized as a `Subscriber`
		- #### actorRef
		
		
		
		```
		public <T> [Source](Source.html "class in akka.stream.scaladsl")<T,​[ActorRef](../../actor/ActorRef.html "class in akka.actor")> actorRef​(scala.PartialFunction<java.lang.Object,​[CompletionStrategy](../CompletionStrategy.html "interface in akka.stream")> completionMatcher,
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
		public <T> [Source](Source.html "class in akka.stream.scaladsl")<T,​[ActorRef](../../actor/ActorRef.html "class in akka.actor")> actorRef​(int bufferSize,
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
		public <T> [Source](Source.html "class in akka.stream.scaladsl")<T,​[ActorRef](../../actor/ActorRef.html "class in akka.actor")> actorRefWithBackpressure​(java.lang.Object ackMessage,
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
		public <T> [Source](Source.html "class in akka.stream.scaladsl")<T,​[ActorRef](../../actor/ActorRef.html "class in akka.actor")> actorRefWithAck​(java.lang.Object ackMessage)
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
		public <T,​U> [Source](Source.html "class in akka.stream.scaladsl")<U,​[NotUsed](../../NotUsed.html "class in akka")> combine​([Source](Source.html "class in akka.stream.scaladsl")<T,​?> first,
		                                                   [Source](Source.html "class in akka.stream.scaladsl")<T,​?> second,
		                                                   scala.collection.immutable.Seq<[Source](Source.html "class in akka.stream.scaladsl")<T,​?>> rest,
		                                                   scala.Function1<java.lang.Object,​[Graph](../Graph.html "interface in akka.stream")<[UniformFanInShape](../UniformFanInShape.html "class in akka.stream")<T,​U>,​[NotUsed](../../NotUsed.html "class in akka")>> fanInStrategy)
		```
		
		Combines several sources with fan\-in strategy like [`Merge`](Merge.html "class in akka.stream.scaladsl") or [`Concat`](Concat.html "class in akka.stream.scaladsl") into a single [`Source`](Source.html "class in akka.stream.scaladsl").
		- #### combine
		
		
		
		```
		public <T,​U,​M> [Source](Source.html "class in akka.stream.scaladsl")<U,​scala.collection.immutable.Seq<M>> combine​(scala.collection.immutable.Seq<[Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<T>,​M>> sources,
		                                                                                     scala.Function1<java.lang.Object,​[Graph](../Graph.html "interface in akka.stream")<[UniformFanInShape](../UniformFanInShape.html "class in akka.stream")<T,​U>,​[NotUsed](../../NotUsed.html "class in akka")>> fanInStrategy)
		```
		
		Combines several sources with fan\-in strategy like [`Merge`](Merge.html "class in akka.stream.scaladsl") or [`Concat`](Concat.html "class in akka.stream.scaladsl") into a single [`Source`](Source.html "class in akka.stream.scaladsl").
		- #### combineMat
		
		
		
		```
		public <T,​U,​M1,​M2,​M> [Source](Source.html "class in akka.stream.scaladsl")<U,​M> combineMat​([Source](Source.html "class in akka.stream.scaladsl")<T,​M1> first,
		                                                                          [Source](Source.html "class in akka.stream.scaladsl")<T,​M2> second,
		                                                                          scala.Function1<java.lang.Object,​[Graph](../Graph.html "interface in akka.stream")<[UniformFanInShape](../UniformFanInShape.html "class in akka.stream")<T,​U>,​[NotUsed](../../NotUsed.html "class in akka")>> fanInStrategy,
		                                                                          scala.Function2<M1,​M2,​M> matF)
		```
		
		Combines two sources with fan\-in strategy like [`Merge`](Merge.html "class in akka.stream.scaladsl") or [`Concat`](Concat.html "class in akka.stream.scaladsl") into a single [`Source`](Source.html "class in akka.stream.scaladsl") with a materialized value.
		- #### zipN
		
		
		
		```
		public <T> [Source](Source.html "class in akka.stream.scaladsl")<scala.collection.immutable.Seq<T>,​[NotUsed](../../NotUsed.html "class in akka")> zipN​(scala.collection.immutable.Seq<[Source](Source.html "class in akka.stream.scaladsl")<T,​?>> sources)
		```
		
		Combine the elements of multiple streams into a stream of sequences.
		- #### zipWithN
		
		
		
		```
		public <T,​O> [Source](Source.html "class in akka.stream.scaladsl")<O,​[NotUsed](../../NotUsed.html "class in akka")> zipWithN​(scala.Function1<scala.collection.immutable.Seq<T>,​O> zipper,
		                                                    scala.collection.immutable.Seq<[Source](Source.html "class in akka.stream.scaladsl")<T,​?>> sources)
		```
		- #### queue
		
		
		
		```
		public <T> [Source](Source.html "class in akka.stream.scaladsl")<T,​[BoundedSourceQueue](../BoundedSourceQueue.html "interface in akka.stream")<T>> queue​(int bufferSize)
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
		public <T> [Source](Source.html "class in akka.stream.scaladsl")<T,​[SourceQueueWithComplete](SourceQueueWithComplete.html "interface in akka.stream.scaladsl")<T>> queue​(int bufferSize,
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
		public <T> [Source](Source.html "class in akka.stream.scaladsl")<T,​[SourceQueueWithComplete](SourceQueueWithComplete.html "interface in akka.stream.scaladsl")<T>> queue​(int bufferSize,
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
		public <T,​S> [Source](Source.html "class in akka.stream.scaladsl")<T,​[NotUsed](../../NotUsed.html "class in akka")> unfoldResource​(scala.Function0<S> create,
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
		public <T,​S> [Source](Source.html "class in akka.stream.scaladsl")<T,​[NotUsed](../../NotUsed.html "class in akka")> unfoldResourceAsync​(scala.Function0<scala.concurrent.Future<S>> create,
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
		public <T> [Source](Source.html "class in akka.stream.scaladsl")<T,​[NotUsed](../../NotUsed.html "class in akka")> mergePrioritizedN​(scala.collection.immutable.Seq<scala.Tuple2<[Source](Source.html "class in akka.stream.scaladsl")<T,​?>,​java.lang.Object>> sourcesAndPriorities,
		                                                     boolean eagerComplete)
		```
		
		Merge multiple [`Source`](Source.html "class in akka.stream.scaladsl")s. Prefer the sources depending on the 'priority' parameters.
		 The provided sources and priorities must have the same size and order.
		 
		 '''emits''' when one of the inputs has an element available, preferring inputs based on the 'priority' parameters if both have elements available
		 
		
		
		 '''backpressures''' when downstream backpressures
		 
		
		
		 '''completes''' when both upstreams complete (This behavior is changeable to completing when any upstream completes by setting `eagerComplete=true`.)
		 
		
		
		 '''Cancels when''' downstream cancels

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

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/Done.html
- https://doc.akka.io/japi/akka/current/akka/NotUsed.html
- https://doc.akka.io/japi/akka/current/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka/current/akka/actor/Cancellable.html
- https://doc.akka.io/japi/akka/current/akka/actor/PoisonPill.html
- https://doc.akka.io/japi/akka/current/akka/actor/Status.Failure.html
- https://doc.akka.io/japi/akka/current/akka/actor/Status.Success.html
- https://doc.akka.io/japi/akka/current/akka/stream/ActorMaterializer.html
- https://doc.akka.io/japi/akka/current/akka/stream/Attributes.html
- https://doc.akka.io/japi/akka/current/akka/stream/BoundedSourceQueue.html
- https://doc.akka.io/japi/akka/current/akka/stream/CompletionStrategy.html
- https://doc.akka.io/japi/akka/current/akka/stream/Graph.html
- https://doc.akka.io/japi/akka/current/akka/stream/Materializer.html
- https://doc.akka.io/japi/akka/current/akka/stream/NeverMaterializedException.html
- https://doc.akka.io/japi/akka/current/akka/stream/OverflowStrategy.html
- https://doc.akka.io/japi/akka/current/akka/stream/QueueOfferResult.html
- https://doc.akka.io/japi/akka/current/akka/stream/SourceShape.html
- https://doc.akka.io/japi/akka/current/akka/stream/UniformFanInShape.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/Concat.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/Merge.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/Source$.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/Source.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/SourceQueueWithComplete.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/Source$.html](https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/Source$.html)*