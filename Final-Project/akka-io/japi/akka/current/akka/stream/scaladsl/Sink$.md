---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:42:14Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/Sink$.html
title: Sink$
---

# Sink$

## Content

Package [akka.stream.scaladsl](package-summary.html)
## Class Sink$

- java.lang.Object
- - akka.stream.scaladsl.Sink$

- ---

```
public class Sink$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Sink$](Sink$.html "class in akka.stream.scaladsl")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Sink$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) [Deprecated Methods](javascript:show(32);) 
	| Modifier and Type | Method | Description |
	| `<T> [Sink](Sink.html "class in akka.stream.scaladsl")<T,​[NotUsed](../../NotUsed.html "class in akka")>` | `[actorRef](#actorRef(akka.actor.ActorRef,java.lang.Object))​([ActorRef](../../actor/ActorRef.html "class in akka.actor") ref,  java.lang.Object onCompleteMessage)` | Deprecated. Use variant accepting both on complete and on failure message. |
	| `<T> [Sink](Sink.html "class in akka.stream.scaladsl")<T,​[NotUsed](../../NotUsed.html "class in akka")>` | `[actorRef](#actorRef(akka.actor.ActorRef,java.lang.Object,scala.Function1))​([ActorRef](../../actor/ActorRef.html "class in akka.actor") ref,  java.lang.Object onCompleteMessage,  scala.Function1<java.lang.Throwable,​java.lang.Object> onFailureMessage)` | INTERNAL API |
	| `<T> [Sink](Sink.html "class in akka.stream.scaladsl")<T,​[NotUsed](../../NotUsed.html "class in akka")>` | `[actorRefWithAck](#actorRefWithAck(akka.actor.ActorRef,java.lang.Object,java.lang.Object,java.lang.Object,scala.Function1))​([ActorRef](../../actor/ActorRef.html "class in akka.actor") ref,  java.lang.Object onInitMessage,  java.lang.Object ackMessage,  java.lang.Object onCompleteMessage,  scala.Function1<java.lang.Throwable,​java.lang.Object> onFailureMessage)` | Deprecated. Use actorRefWithBackpressure accepting completion and failure matchers instead. |
	| `<T> scala.Function1<java.lang.Throwable,​java.lang.Object>` | `[actorRefWithAck$default$5](#actorRefWithAck$default$5())()` |  |
	| `<T> [Sink](Sink.html "class in akka.stream.scaladsl")<T,​[NotUsed](../../NotUsed.html "class in akka")>` | `[actorRefWithBackpressure](#actorRefWithBackpressure(akka.actor.ActorRef,java.lang.Object,java.lang.Object,java.lang.Object,scala.Function1))​([ActorRef](../../actor/ActorRef.html "class in akka.actor") ref,  java.lang.Object onInitMessage,  java.lang.Object ackMessage,  java.lang.Object onCompleteMessage,  scala.Function1<java.lang.Throwable,​java.lang.Object> onFailureMessage)` | Sends the elements of the stream to the given `ActorRef` that sends back back\-pressure signal. |
	| `<T> [Sink](Sink.html "class in akka.stream.scaladsl")<T,​[NotUsed](../../NotUsed.html "class in akka")>` | `[actorRefWithBackpressure](#actorRefWithBackpressure(akka.actor.ActorRef,java.lang.Object,java.lang.Object,scala.Function1))​([ActorRef](../../actor/ActorRef.html "class in akka.actor") ref,  java.lang.Object onInitMessage,  java.lang.Object onCompleteMessage,  scala.Function1<java.lang.Throwable,​java.lang.Object> onFailureMessage)` | Sends the elements of the stream to the given `ActorRef` that sends back back\-pressure signal. |
	| `<T> [Sink](Sink.html "class in akka.stream.scaladsl")<T,​org.reactivestreams.Publisher<T>>` | `[asPublisher](#asPublisher(boolean))​(boolean fanout)` | A `Sink` that materializes into a `Publisher`. |
	| `<T> [Sink](Sink.html "class in akka.stream.scaladsl")<T,​[NotUsed](../../NotUsed.html "class in akka")>` | `[cancelled](#cancelled())()` | A `Sink` that immediately cancels its upstream after materialization. |
	| `<T,​That>[Sink](Sink.html "class in akka.stream.scaladsl")<T,​scala.concurrent.Future<That>>` | `[collection](#collection(scala.collection.Factory))​(scala.collection.Factory<T,​That> cbf)` | A `Sink` that keeps on collecting incoming elements until upstream terminates. |
	| `<T,​U>[Sink](Sink.html "class in akka.stream.scaladsl")<T,​[NotUsed](../../NotUsed.html "class in akka")>` | `[combine](#combine(akka.stream.scaladsl.Sink,akka.stream.scaladsl.Sink,scala.collection.immutable.Seq,scala.Function1))​([Sink](Sink.html "class in akka.stream.scaladsl")<U,​?> first,  [Sink](Sink.html "class in akka.stream.scaladsl")<U,​?> second,  scala.collection.immutable.Seq<[Sink](Sink.html "class in akka.stream.scaladsl")<U,​?>> rest,  scala.Function1<java.lang.Object,​[Graph](../Graph.html "interface in akka.stream")<[UniformFanOutShape](../UniformFanOutShape.html "class in akka.stream")<T,​U>,​[NotUsed](../../NotUsed.html "class in akka")>> fanOutStrategy)` | Combine several sinks with fan\-out strategy like `Broadcast` or `Balance` and returns `Sink`. |
	| `<T,​U,​M>[Sink](Sink.html "class in akka.stream.scaladsl")<T,​scala.collection.immutable.Seq<M>>` | `[combine](#combine(scala.collection.immutable.Seq,scala.Function1))​(scala.collection.immutable.Seq<[Graph](../Graph.html "interface in akka.stream")<[SinkShape](../SinkShape.html "class in akka.stream")<U>,​M>> sinks,  scala.Function1<java.lang.Object,​[Graph](../Graph.html "interface in akka.stream")<[UniformFanOutShape](../UniformFanOutShape.html "class in akka.stream")<T,​U>,​[NotUsed](../../NotUsed.html "class in akka")>> fanOutStrategy)` | Combine several sinks with fan\-out strategy like `Broadcast` or `Balance` and returns `Sink`. |
	| `<T,​U,​M1,​M2,​M>[Sink](Sink.html "class in akka.stream.scaladsl")<T,​M>` | `[combineMat](#combineMat(akka.stream.scaladsl.Sink,akka.stream.scaladsl.Sink,scala.Function1,scala.Function2))​([Sink](Sink.html "class in akka.stream.scaladsl")<U,​M1> first,  [Sink](Sink.html "class in akka.stream.scaladsl")<U,​M2> second,  scala.Function1<java.lang.Object,​[Graph](../Graph.html "interface in akka.stream")<[UniformFanOutShape](../UniformFanOutShape.html "class in akka.stream")<T,​U>,​[NotUsed](../../NotUsed.html "class in akka")>> fanOutStrategy,  scala.Function2<M1,​M2,​M> matF)` | Combine two sinks with fan\-out strategy like `Broadcast` or `Balance` and returns `Sink` with 2 outlets. |
	| `<U,​T>[Sink](Sink.html "class in akka.stream.scaladsl")<T,​scala.concurrent.Future<U>>` | `[fold](#fold(U,scala.Function2))​(U zero,  scala.Function2<U,​T,​U> f)` | A `Sink` that will invoke the given function for every received element, giving it its previous  output (or the given `zero` value) and the element as input. |
	| `<U,​T>[Sink](Sink.html "class in akka.stream.scaladsl")<T,​scala.concurrent.Future<U>>` | `[foldAsync](#foldAsync(U,scala.Function2))​(U zero,  scala.Function2<U,​T,​scala.concurrent.Future<U>> f)` | A `Sink` that will invoke the given asynchronous function for every received element, giving it its previous  output (or the given `zero` value) and the element as input. |
	| `<T> [Sink](Sink.html "class in akka.stream.scaladsl")<T,​scala.concurrent.Future<[Done](../../Done.html "class in akka")>>` | `[foreach](#foreach(scala.Function1))​(scala.Function1<T,​scala.runtime.BoxedUnit> f)` | A `Sink` that will invoke the given procedure for each received element. |
	| `<T> [Sink](Sink.html "class in akka.stream.scaladsl")<T,​scala.concurrent.Future<[Done](../../Done.html "class in akka")>>` | `[foreachAsync](#foreachAsync(int,scala.Function1))​(int parallelism,  scala.Function1<T,​scala.concurrent.Future<scala.runtime.BoxedUnit>> f)` | A `Sink` that will invoke the given procedure asynchronously for each received element. |
	| `<T,​M>[Sink](Sink.html "class in akka.stream.scaladsl")<T,​M>` | `[fromGraph](#fromGraph(akka.stream.Graph))​([Graph](../Graph.html "interface in akka.stream")<[SinkShape](../SinkShape.html "class in akka.stream")<T>,​M> g)` | A graph with the shape of a sink logically is a sink, this method makes  it so also in type. |
	| `<T,​M>[Sink](Sink.html "class in akka.stream.scaladsl")<T,​scala.concurrent.Future<M>>` | `[fromMaterializer](#fromMaterializer(scala.Function2))​(scala.Function2<[Materializer](../Materializer.html "class in akka.stream"),​[Attributes](../Attributes.html "class in akka.stream"),​[Sink](Sink.html "class in akka.stream.scaladsl")<T,​M>> factory)` | Defers the creation of a [`Sink`](Sink.html "class in akka.stream.scaladsl") until materialization. |
	| `<T> [Sink](Sink.html "class in akka.stream.scaladsl")<T,​[NotUsed](../../NotUsed.html "class in akka")>` | `[fromSubscriber](#fromSubscriber(org.reactivestreams.Subscriber))​(org.reactivestreams.Subscriber<T> subscriber)` | Helper to create [`Sink`](Sink.html "class in akka.stream.scaladsl") from `Subscriber`. |
	| `<T,​M>[Sink](Sink.html "class in akka.stream.scaladsl")<T,​scala.concurrent.Future<M>>` | `[futureSink](#futureSink(scala.concurrent.Future))​(scala.concurrent.Future<[Sink](Sink.html "class in akka.stream.scaladsl")<T,​M>> future)` | Turn a `Future[Sink]` into a Sink that will consume the values of the source when the future completes successfully. |
	| `<T> [Sink](Sink.html "class in akka.stream.scaladsl")<T,​scala.concurrent.Future<T>>` | `[head](#head())()` | A `Sink` that materializes into a `Future` of the first value received. |
	| `<T> [Sink](Sink.html "class in akka.stream.scaladsl")<T,​scala.concurrent.Future<scala.Option<T>>>` | `[headOption](#headOption())()` | A `Sink` that materializes into a `Future` of the optional first value received. |
	| `[Sink](Sink.html "class in akka.stream.scaladsl")<java.lang.Object,​scala.concurrent.Future<[Done](../../Done.html "class in akka")>>` | `[ignore](#ignore())()` | A `Sink` that will consume the stream and discard the elements. |
	| `<T> [Sink](Sink.html "class in akka.stream.scaladsl")<T,​scala.concurrent.Future<T>>` | `[last](#last())()` | A `Sink` that materializes into a `Future` of the last value received. |
	| `<T> [Sink](Sink.html "class in akka.stream.scaladsl")<T,​scala.concurrent.Future<scala.Option<T>>>` | `[lastOption](#lastOption())()` | A `Sink` that materializes into a `Future` of the optional last value received. |
	| `<T,​M>[Sink](Sink.html "class in akka.stream.scaladsl")<T,​scala.concurrent.Future<M>>` | `[lazyFutureSink](#lazyFutureSink(scala.Function0))​(scala.Function0<scala.concurrent.Future<[Sink](Sink.html "class in akka.stream.scaladsl")<T,​M>>> create)` | Defers invoking the `create` function to create a future sink until there is a first element passed from upstream. |
	| `<T,​M>[Sink](Sink.html "class in akka.stream.scaladsl")<T,​scala.concurrent.Future<M>>` | `[lazyInit](#lazyInit(scala.Function1,scala.Function0))​(scala.Function1<T,​scala.concurrent.Future<[Sink](Sink.html "class in akka.stream.scaladsl")<T,​M>>> sinkFactory,  scala.Function0<M> fallback)` | Deprecated. Use 'Sink.lazyFutureSink' in combination with 'Flow.prefixAndTail(1\)' instead. |
	| `<T,​M>[Sink](Sink.html "class in akka.stream.scaladsl")<T,​scala.concurrent.Future<scala.Option<M>>>` | `[lazyInitAsync](#lazyInitAsync(scala.Function0))​(scala.Function0<scala.concurrent.Future<[Sink](Sink.html "class in akka.stream.scaladsl")<T,​M>>> sinkFactory)` | Deprecated. Use 'Sink.lazyFutureSink' instead. |
	| `<T,​M>[Sink](Sink.html "class in akka.stream.scaladsl")<T,​scala.concurrent.Future<M>>` | `[lazySink](#lazySink(scala.Function0))​(scala.Function0<[Sink](Sink.html "class in akka.stream.scaladsl")<T,​M>> create)` | Defers invoking the `create` function to create a sink until there is a first element passed from upstream. |
	| `[Sink](Sink.html "class in akka.stream.scaladsl")<java.lang.Object,​scala.concurrent.Future<[Done](../../Done.html "class in akka")>>` | `[never](#never())()` | A [`Sink`](Sink.html "class in akka.stream.scaladsl") that will always backpressure never cancel and never consume any elements from the stream. |
	| `<T> [Sink](Sink.html "class in akka.stream.scaladsl")<T,​[NotUsed](../../NotUsed.html "class in akka")>` | `[onComplete](#onComplete(scala.Function1))​(scala.Function1<scala.util.Try<[Done](../../Done.html "class in akka")>,​scala.runtime.BoxedUnit> callback)` | A `Sink` that when the flow is completed, either through a failure or normal  completion, apply the provided function with `Success`  or `Failure`. |
	| `<T> [Sink](Sink.html "class in akka.stream.scaladsl")<T,​[SinkQueueWithCancel](SinkQueueWithCancel.html "interface in akka.stream.scaladsl")<T>>` | `[queue](#queue())()` | Creates a `Sink` that is materialized as an [`SinkQueueWithCancel`](SinkQueueWithCancel.html "interface in akka.stream.scaladsl"). |
	| `<T> [Sink](Sink.html "class in akka.stream.scaladsl")<T,​[SinkQueueWithCancel](SinkQueueWithCancel.html "interface in akka.stream.scaladsl")<T>>` | `[queue](#queue(int))​(int maxConcurrentPulls)` | Creates a `Sink` that is materialized as an [`SinkQueueWithCancel`](SinkQueueWithCancel.html "interface in akka.stream.scaladsl"). |
	| `<T> [Sink](Sink.html "class in akka.stream.scaladsl")<T,​scala.concurrent.Future<T>>` | `[reduce](#reduce(scala.Function2))​(scala.Function2<T,​T,​T> f)` | A `Sink` that will invoke the given function for every received element, giving it its previous  output (from the second element) and the element as input. |
	| `<T> [Sink](Sink.html "class in akka.stream.scaladsl")<T,​scala.concurrent.Future<scala.collection.immutable.Seq<T>>>` | `[seq](#seq())()` | A `Sink` that keeps on collecting incoming elements until upstream terminates. |
	| `<T,​M>[Sink](Sink.html "class in akka.stream.scaladsl")<T,​scala.concurrent.Future<M>>` | `[setup](#setup(scala.Function2))​(scala.Function2<[ActorMaterializer](../ActorMaterializer.html "class in akka.stream"),​[Attributes](../Attributes.html "class in akka.stream"),​[Sink](Sink.html "class in akka.stream.scaladsl")<T,​M>> factory)` | Deprecated. Use 'fromMaterializer' instead. |
	| `<T> [SinkShape](../SinkShape.html "class in akka.stream")<T>` | `[shape](#shape(java.lang.String))​(java.lang.String name)` | INTERNAL API |
	| `<T> [Sink](Sink.html "class in akka.stream.scaladsl")<T,​scala.concurrent.Future<scala.collection.immutable.Seq<T>>>` | `[takeLast](#takeLast(int))​(int n)` | A `Sink` that materializes into a a `Future` of `immutable.Seq[T]` containing the last `n` collected elements. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [Sink$](Sink$.html "class in akka.stream.scaladsl") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Sink$
		
		
		
		```
		public Sink$()
		```

	- ### Method Detail
	
	
	
		- #### shape
		
		
		
		```
		public <T> [SinkShape](../SinkShape.html "class in akka.stream")<T> shape​(java.lang.String name)
		```
		
		INTERNAL API
		- #### fromGraph
		
		
		
		```
		public <T,​M> [Sink](Sink.html "class in akka.stream.scaladsl")<T,​M> fromGraph​([Graph](../Graph.html "interface in akka.stream")<[SinkShape](../SinkShape.html "class in akka.stream")<T>,​M> g)
		```
		
		A graph with the shape of a sink logically is a sink, this method makes
		 it so also in type.
		- #### fromMaterializer
		
		
		
		```
		public <T,​M> [Sink](Sink.html "class in akka.stream.scaladsl")<T,​scala.concurrent.Future<M>> fromMaterializer​(scala.Function2<[Materializer](../Materializer.html "class in akka.stream"),​[Attributes](../Attributes.html "class in akka.stream"),​[Sink](Sink.html "class in akka.stream.scaladsl")<T,​M>> factory)
		```
		
		Defers the creation of a [`Sink`](Sink.html "class in akka.stream.scaladsl") until materialization. The `factory` function
		 exposes `Materializer` which is going to be used during materialization and
		 `Attributes` of the [`Sink`](Sink.html "class in akka.stream.scaladsl") returned by this method.
		- #### setup
		
		
		
		```
		public <T,​M> [Sink](Sink.html "class in akka.stream.scaladsl")<T,​scala.concurrent.Future<M>> setup​(scala.Function2<[ActorMaterializer](../ActorMaterializer.html "class in akka.stream"),​[Attributes](../Attributes.html "class in akka.stream"),​[Sink](Sink.html "class in akka.stream.scaladsl")<T,​M>> factory)
		```
		
		Deprecated.
		Use 'fromMaterializer' instead. Since 2\.6\.0\.
		
		Defers the creation of a [`Sink`](Sink.html "class in akka.stream.scaladsl") until materialization. The `factory` function
		 exposes `ActorMaterializer` which is going to be used during materialization and
		 `Attributes` of the [`Sink`](Sink.html "class in akka.stream.scaladsl") returned by this method.
		- #### fromSubscriber
		
		
		
		```
		public <T> [Sink](Sink.html "class in akka.stream.scaladsl")<T,​[NotUsed](../../NotUsed.html "class in akka")> fromSubscriber​(org.reactivestreams.Subscriber<T> subscriber)
		```
		
		Helper to create [`Sink`](Sink.html "class in akka.stream.scaladsl") from `Subscriber`.
		- #### cancelled
		
		
		
		```
		public <T> [Sink](Sink.html "class in akka.stream.scaladsl")<T,​[NotUsed](../../NotUsed.html "class in akka")> cancelled()
		```
		
		A `Sink` that immediately cancels its upstream after materialization.
		- #### head
		
		
		
		```
		public <T> [Sink](Sink.html "class in akka.stream.scaladsl")<T,​scala.concurrent.Future<T>> head()
		```
		
		A `Sink` that materializes into a `Future` of the first value received.
		 If the stream completes before signaling at least a single element, the Future will be failed with a `NoSuchElementException`.
		 If the stream signals an error errors before signaling at least a single element, the Future will be failed with the streams exception.
		 
		 See also [`<T>headOption()`](#headOption()).
		- #### headOption
		
		
		
		```
		public <T> [Sink](Sink.html "class in akka.stream.scaladsl")<T,​scala.concurrent.Future<scala.Option<T>>> headOption()
		```
		
		A `Sink` that materializes into a `Future` of the optional first value received.
		 If the stream completes before signaling at least a single element, the value of the Future will be `None`.
		 If the stream signals an error errors before signaling at least a single element, the Future will be failed with the streams exception.
		 
		 See also [`<T>head()`](#head()).
		- #### last
		
		
		
		```
		public <T> [Sink](Sink.html "class in akka.stream.scaladsl")<T,​scala.concurrent.Future<T>> last()
		```
		
		A `Sink` that materializes into a `Future` of the last value received.
		 If the stream completes before signaling at least a single element, the Future will be failed with a `NoSuchElementException`.
		 If the stream signals an error, the Future will be failed with the stream's exception.
		 
		 See also [`<T>lastOption()`](#lastOption()), [`<T>takeLast(int)`](#takeLast(int)).
		- #### lastOption
		
		
		
		```
		public <T> [Sink](Sink.html "class in akka.stream.scaladsl")<T,​scala.concurrent.Future<scala.Option<T>>> lastOption()
		```
		
		A `Sink` that materializes into a `Future` of the optional last value received.
		 If the stream completes before signaling at least a single element, the value of the Future will be `None`.
		 If the stream signals an error, the Future will be failed with the stream's exception.
		 
		 See also [`<T>last()`](#last()), [`<T>takeLast(int)`](#takeLast(int)).
		- #### takeLast
		
		
		
		```
		public <T> [Sink](Sink.html "class in akka.stream.scaladsl")<T,​scala.concurrent.Future<scala.collection.immutable.Seq<T>>> takeLast​(int n)
		```
		
		A `Sink` that materializes into a a `Future` of `immutable.Seq[T]` containing the last `n` collected elements.
		 
		 If the stream completes before signaling at least n elements, the `Future` will complete with all elements seen so far.
		 If the stream never completes, the `Future` will never complete.
		 If there is a failure signaled in the stream the `Future` will be completed with failure.
		- #### seq
		
		
		
		```
		public <T> [Sink](Sink.html "class in akka.stream.scaladsl")<T,​scala.concurrent.Future<scala.collection.immutable.Seq<T>>> seq()
		```
		
		A `Sink` that keeps on collecting incoming elements until upstream terminates.
		 As upstream may be unbounded, `Flow[T].take` or the stricter `Flow[T].limit` (and their variants)
		 may be used to ensure boundedness.
		 Materializes into a `Future` of `Seq[T]` containing all the collected elements.
		 `Seq` is limited to `Int.MaxValue` elements, this Sink will cancel the stream
		 after having received that many elements.
		 
		 See also `Flow.limit`, `Flow.limitWeighted`, `Flow.take`, `Flow.takeWithin`, `Flow.takeWhile`
		- #### collection
		
		
		
		```
		public <T,​That> [Sink](Sink.html "class in akka.stream.scaladsl")<T,​scala.concurrent.Future<That>> collection​(scala.collection.Factory<T,​That> cbf)
		```
		
		A `Sink` that keeps on collecting incoming elements until upstream terminates.
		 As upstream may be unbounded, `Flow[T].take` or the stricter `Flow[T].limit` (and their variants)
		 may be used to ensure boundedness.
		 Materializes into a `Future` of `That[T]` containing all the collected elements.
		 `That[T]` is limited to the limitations of the CanBuildFrom associated with it. For example, `Seq` is limited to
		 `Int.MaxValue` elements. See \[The Architecture of Scala 2\.13's Collections](https://docs.scala\-lang.org/overviews/core/architecture\-of\-scala\-213\-collections.html) for more info.
		 This Sink will cancel the stream after having received that many elements.
		 
		 See also `Flow.limit`, `Flow.limitWeighted`, `Flow.take`, `Flow.takeWithin`, `Flow.takeWhile`
		- #### asPublisher
		
		
		
		```
		public <T> [Sink](Sink.html "class in akka.stream.scaladsl")<T,​org.reactivestreams.Publisher<T>> asPublisher​(boolean fanout)
		```
		
		A `Sink` that materializes into a `Publisher`.
		 
		 If `fanout` is `true`, the materialized `Publisher` will support multiple `Subscriber`s and
		 the size of the `inputBuffer` configured for this operator becomes the maximum number of elements that
		 the fastest `Subscriber` can be ahead of the slowest one before slowing
		 the processing down due to back pressure.
		 
		
		
		 If `fanout` is `false` then the materialized `Publisher` will only support a single `Subscriber` and
		 reject any additional `Subscriber`s.
		- #### ignore
		
		
		
		```
		public [Sink](Sink.html "class in akka.stream.scaladsl")<java.lang.Object,​scala.concurrent.Future<[Done](../../Done.html "class in akka")>> ignore()
		```
		
		A `Sink` that will consume the stream and discard the elements.
		- #### never
		
		
		
		```
		public [Sink](Sink.html "class in akka.stream.scaladsl")<java.lang.Object,​scala.concurrent.Future<[Done](../../Done.html "class in akka")>> never()
		```
		
		A [`Sink`](Sink.html "class in akka.stream.scaladsl") that will always backpressure never cancel and never consume any elements from the stream.
		- #### foreach
		
		
		
		```
		public <T> [Sink](Sink.html "class in akka.stream.scaladsl")<T,​scala.concurrent.Future<[Done](../../Done.html "class in akka")>> foreach​(scala.Function1<T,​scala.runtime.BoxedUnit> f)
		```
		
		A `Sink` that will invoke the given procedure for each received element. The sink is materialized
		 into a `Future` which will be completed with `Success` when reaching the
		 normal end of the stream, or completed with `Failure` if there is a failure signaled in
		 the stream.
		- #### foreachAsync
		
		
		
		```
		public <T> [Sink](Sink.html "class in akka.stream.scaladsl")<T,​scala.concurrent.Future<[Done](../../Done.html "class in akka")>> foreachAsync​(int parallelism,
		                                                                    scala.Function1<T,​scala.concurrent.Future<scala.runtime.BoxedUnit>> f)
		```
		
		A `Sink` that will invoke the given procedure asynchronously for each received element. The sink is materialized
		 into a `Future` which will be completed with `Success` when reaching the
		 normal end of the stream, or completed with `Failure` if there is a failure signaled in
		 the stream.
		- #### combine
		
		
		
		```
		public <T,​U> [Sink](Sink.html "class in akka.stream.scaladsl")<T,​[NotUsed](../../NotUsed.html "class in akka")> combine​([Sink](Sink.html "class in akka.stream.scaladsl")<U,​?> first,
		                                                 [Sink](Sink.html "class in akka.stream.scaladsl")<U,​?> second,
		                                                 scala.collection.immutable.Seq<[Sink](Sink.html "class in akka.stream.scaladsl")<U,​?>> rest,
		                                                 scala.Function1<java.lang.Object,​[Graph](../Graph.html "interface in akka.stream")<[UniformFanOutShape](../UniformFanOutShape.html "class in akka.stream")<T,​U>,​[NotUsed](../../NotUsed.html "class in akka")>> fanOutStrategy)
		```
		
		Combine several sinks with fan\-out strategy like `Broadcast` or `Balance` and returns `Sink`.
		- #### combineMat
		
		
		
		```
		public <T,​U,​M1,​M2,​M> [Sink](Sink.html "class in akka.stream.scaladsl")<T,​M> combineMat​([Sink](Sink.html "class in akka.stream.scaladsl")<U,​M1> first,
		                                                                        [Sink](Sink.html "class in akka.stream.scaladsl")<U,​M2> second,
		                                                                        scala.Function1<java.lang.Object,​[Graph](../Graph.html "interface in akka.stream")<[UniformFanOutShape](../UniformFanOutShape.html "class in akka.stream")<T,​U>,​[NotUsed](../../NotUsed.html "class in akka")>> fanOutStrategy,
		                                                                        scala.Function2<M1,​M2,​M> matF)
		```
		
		Combine two sinks with fan\-out strategy like `Broadcast` or `Balance` and returns `Sink` with 2 outlets.
		- #### combine
		
		
		
		```
		public <T,​U,​M> [Sink](Sink.html "class in akka.stream.scaladsl")<T,​scala.collection.immutable.Seq<M>> combine​(scala.collection.immutable.Seq<[Graph](../Graph.html "interface in akka.stream")<[SinkShape](../SinkShape.html "class in akka.stream")<U>,​M>> sinks,
		                                                                                   scala.Function1<java.lang.Object,​[Graph](../Graph.html "interface in akka.stream")<[UniformFanOutShape](../UniformFanOutShape.html "class in akka.stream")<T,​U>,​[NotUsed](../../NotUsed.html "class in akka")>> fanOutStrategy)
		```
		
		Combine several sinks with fan\-out strategy like `Broadcast` or `Balance` and returns `Sink`.
		 The fanoutGraph's outlets size must match the provides sinks'.
		- #### fold
		
		
		
		```
		public <U,​T> [Sink](Sink.html "class in akka.stream.scaladsl")<T,​scala.concurrent.Future<U>> fold​(U zero,
		                                                                 scala.Function2<U,​T,​U> f)
		```
		
		A `Sink` that will invoke the given function for every received element, giving it its previous
		 output (or the given `zero` value) and the element as input.
		 The returned `Future` will be completed with value of the final
		 function evaluation when the input stream ends, or completed with `Failure`
		 if there is a failure signaled in the stream.
		 
		
		See Also:
		[`foldAsync(U, scala.Function2<U, T, scala.concurrent.Future<U>>)`](#foldAsync(U,scala.Function2))
		- #### foldAsync
		
		
		
		```
		public <U,​T> [Sink](Sink.html "class in akka.stream.scaladsl")<T,​scala.concurrent.Future<U>> foldAsync​(U zero,
		                                                                      scala.Function2<U,​T,​scala.concurrent.Future<U>> f)
		```
		
		A `Sink` that will invoke the given asynchronous function for every received element, giving it its previous
		 output (or the given `zero` value) and the element as input.
		 The returned `Future` will be completed with value of the final
		 function evaluation when the input stream ends, or completed with `Failure`
		 if there is a failure signaled in the stream.
		 
		
		See Also:
		[`fold(U, scala.Function2<U, T, U>)`](#fold(U,scala.Function2))
		- #### reduce
		
		
		
		```
		public <T> [Sink](Sink.html "class in akka.stream.scaladsl")<T,​scala.concurrent.Future<T>> reduce​(scala.Function2<T,​T,​T> f)
		```
		
		A `Sink` that will invoke the given function for every received element, giving it its previous
		 output (from the second element) and the element as input.
		 The returned `Future` will be completed with value of the final
		 function evaluation when the input stream ends, or completed with `Failure`
		 if there is a failure signaled in the stream.
		 
		 If the stream is empty (i.e. completes before signalling any elements),
		 the reduce operator will fail its downstream with a `NoSuchElementException`,
		 which is semantically in\-line with that Scala's standard library collections
		 do in such situations.
		 
		
		
		 Adheres to the `ActorAttributes.SupervisionStrategy` attribute.
		- #### onComplete
		
		
		
		```
		public <T> [Sink](Sink.html "class in akka.stream.scaladsl")<T,​[NotUsed](../../NotUsed.html "class in akka")> onComplete​(scala.Function1<scala.util.Try<[Done](../../Done.html "class in akka")>,​scala.runtime.BoxedUnit> callback)
		```
		
		A `Sink` that when the flow is completed, either through a failure or normal
		 completion, apply the provided function with `Success`
		 or `Failure`.
		- #### actorRef
		
		
		
		```
		public <T> [Sink](Sink.html "class in akka.stream.scaladsl")<T,​[NotUsed](../../NotUsed.html "class in akka")> actorRef​([ActorRef](../../actor/ActorRef.html "class in akka.actor") ref,
		                                          java.lang.Object onCompleteMessage,
		                                          scala.Function1<java.lang.Throwable,​java.lang.Object> onFailureMessage)
		```
		
		INTERNAL API
		 
		 Sends the elements of the stream to the given `ActorRef`.
		 If the target actor terminates the stream will be canceled.
		 When the stream is completed successfully the given `onCompleteMessage`
		 will be sent to the destination actor.
		 When the stream is completed with failure the `onFailureMessage` will be invoked
		 and its result will be sent to the destination actor.
		 
		
		
		 It will request at most `maxInputBufferSize` number of elements from
		 upstream, but there is no back\-pressure signal from the destination actor,
		 i.e. if the actor is not consuming the messages fast enough the mailbox
		 of the actor will grow. For potentially slow consumer actors it is recommended
		 to use a bounded mailbox with zero `mailbox-push-timeout-time` or use a rate
		 limiting operator in front of this `Sink`.
		- #### actorRef
		
		
		
		```
		public <T> [Sink](Sink.html "class in akka.stream.scaladsl")<T,​[NotUsed](../../NotUsed.html "class in akka")> actorRef​([ActorRef](../../actor/ActorRef.html "class in akka.actor") ref,
		                                          java.lang.Object onCompleteMessage)
		```
		
		Deprecated.
		Use variant accepting both on complete and on failure message. Since 2\.6\.0\.
		
		Sends the elements of the stream to the given `ActorRef`.
		 If the target actor terminates the stream will be canceled.
		 When the stream is completed successfully the given `onCompleteMessage`
		 will be sent to the destination actor.
		 When the stream is completed with failure a [`Status.Failure`](../../actor/Status.Failure.html "class in akka.actor")
		 message will be sent to the destination actor.
		 
		 It will request at most `maxInputBufferSize` number of elements from
		 upstream, but there is no back\-pressure signal from the destination actor,
		 i.e. if the actor is not consuming the messages fast enough the mailbox
		 of the actor will grow. For potentially slow consumer actors it is recommended
		 to use a bounded mailbox with zero `mailbox-push-timeout-time` or use a rate
		 limiting operator in front of this `Sink`.
		- #### actorRefWithBackpressure
		
		
		
		```
		public <T> [Sink](Sink.html "class in akka.stream.scaladsl")<T,​[NotUsed](../../NotUsed.html "class in akka")> actorRefWithBackpressure​([ActorRef](../../actor/ActorRef.html "class in akka.actor") ref,
		                                                          java.lang.Object onInitMessage,
		                                                          java.lang.Object ackMessage,
		                                                          java.lang.Object onCompleteMessage,
		                                                          scala.Function1<java.lang.Throwable,​java.lang.Object> onFailureMessage)
		```
		
		Sends the elements of the stream to the given `ActorRef` that sends back back\-pressure signal.
		 First element is always `onInitMessage`, then stream is waiting for acknowledgement message
		 `ackMessage` from the given actor which means that it is ready to process
		 elements. It also requires `ackMessage` message after each stream element
		 to make backpressure work.
		 
		 If the target actor terminates the stream will be canceled.
		 When the stream is completed successfully the given `onCompleteMessage`
		 will be sent to the destination actor.
		 When the stream is completed with failure \- result of `onFailureMessage(throwable)`
		 function will be sent to the destination actor.
		- #### actorRefWithBackpressure
		
		
		
		```
		public <T> [Sink](Sink.html "class in akka.stream.scaladsl")<T,​[NotUsed](../../NotUsed.html "class in akka")> actorRefWithBackpressure​([ActorRef](../../actor/ActorRef.html "class in akka.actor") ref,
		                                                          java.lang.Object onInitMessage,
		                                                          java.lang.Object onCompleteMessage,
		                                                          scala.Function1<java.lang.Throwable,​java.lang.Object> onFailureMessage)
		```
		
		Sends the elements of the stream to the given `ActorRef` that sends back back\-pressure signal.
		 First element is always `onInitMessage`, then stream is waiting for acknowledgement message
		 from the given actor which means that it is ready to process
		 elements. It also requires an ack message after each stream element
		 to make backpressure work. This variant will consider any message as ack message.
		 
		 If the target actor terminates the stream will be canceled.
		 When the stream is completed successfully the given `onCompleteMessage`
		 will be sent to the destination actor.
		 When the stream is completed with failure \- result of `onFailureMessage(throwable)`
		 function will be sent to the destination actor.
		- #### actorRefWithAck
		
		
		
		```
		public <T> [Sink](Sink.html "class in akka.stream.scaladsl")<T,​[NotUsed](../../NotUsed.html "class in akka")> actorRefWithAck​([ActorRef](../../actor/ActorRef.html "class in akka.actor") ref,
		                                                 java.lang.Object onInitMessage,
		                                                 java.lang.Object ackMessage,
		                                                 java.lang.Object onCompleteMessage,
		                                                 scala.Function1<java.lang.Throwable,​java.lang.Object> onFailureMessage)
		```
		
		Deprecated.
		Use actorRefWithBackpressure accepting completion and failure matchers instead. Since 2\.6\.0\.
		
		Sends the elements of the stream to the given `ActorRef` that sends back back\-pressure signal.
		 First element is always `onInitMessage`, then stream is waiting for acknowledgement message
		 `ackMessage` from the given actor which means that it is ready to process
		 elements. It also requires `ackMessage` message after each stream element
		 to make backpressure work.
		 
		 If the target actor terminates the stream will be canceled.
		 When the stream is completed successfully the given `onCompleteMessage`
		 will be sent to the destination actor.
		 When the stream is completed with failure \- result of `onFailureMessage(throwable)`
		 function will be sent to the destination actor.
		- #### actorRefWithAck$default$5
		
		
		
		```
		public <T> scala.Function1<java.lang.Throwable,​java.lang.Object> actorRefWithAck$default$5()
		```
		- #### queue
		
		
		
		```
		public <T> [Sink](Sink.html "class in akka.stream.scaladsl")<T,​[SinkQueueWithCancel](SinkQueueWithCancel.html "interface in akka.stream.scaladsl")<T>> queue​(int maxConcurrentPulls)
		```
		
		Creates a `Sink` that is materialized as an [`SinkQueueWithCancel`](SinkQueueWithCancel.html "interface in akka.stream.scaladsl").
		 `akka.stream.scaladsl.SinkQueueWithCancel.pull` method is pulling element from the stream and returns Future\[Option\[T].
		 `Future` completes when element is available.
		 
		 Before calling pull method second time you need to ensure that number of pending pulls is less then maxConcurrentPulls
		 or wait until some of the previous Futures completes.
		 Pull returns Failed future with ''IllegalStateException'' if there will be more then maxConcurrentPulls number of pending pulls.
		 
		
		
		`Sink` will request at most number of elements equal to size of `inputBuffer` from
		 upstream and then stop back pressure. You can configure size of input
		 buffer by using `Sink.withAttributes` method.
		 
		
		
		 For stream completion you need to pull all elements from [`SinkQueueWithCancel`](SinkQueueWithCancel.html "interface in akka.stream.scaladsl") including last None
		 as completion marker
		 
		
		
		 See also [`SinkQueueWithCancel`](SinkQueueWithCancel.html "interface in akka.stream.scaladsl")
		- #### queue
		
		
		
		```
		public <T> [Sink](Sink.html "class in akka.stream.scaladsl")<T,​[SinkQueueWithCancel](SinkQueueWithCancel.html "interface in akka.stream.scaladsl")<T>> queue()
		```
		
		Creates a `Sink` that is materialized as an [`SinkQueueWithCancel`](SinkQueueWithCancel.html "interface in akka.stream.scaladsl").
		 `akka.stream.scaladsl.SinkQueueWithCancel.pull` method is pulling element from the stream and returns Future\[Option\[T}.
		 `Future` completes when element is available.
		 
		 Before calling pull method second time you need to wait until previous Future completes.
		 Pull returns Failed future with ''IllegalStateException'' if previous future has not yet completed.
		 
		
		
		`Sink` will request at most number of elements equal to size of `inputBuffer` from
		 upstream and then stop back pressure. You can configure size of input
		 buffer by using `Sink.withAttributes` method.
		 
		
		
		 For stream completion you need to pull all elements from [`SinkQueueWithCancel`](SinkQueueWithCancel.html "interface in akka.stream.scaladsl") including last None
		 as completion marker
		 
		
		
		 See also [`SinkQueueWithCancel`](SinkQueueWithCancel.html "interface in akka.stream.scaladsl")
		- #### lazyInit
		
		
		
		```
		public <T,​M> [Sink](Sink.html "class in akka.stream.scaladsl")<T,​scala.concurrent.Future<M>> lazyInit​(scala.Function1<T,​scala.concurrent.Future<[Sink](Sink.html "class in akka.stream.scaladsl")<T,​M>>> sinkFactory,
		                                                                     scala.Function0<M> fallback)
		```
		
		Deprecated.
		Use 'Sink.lazyFutureSink' in combination with 'Flow.prefixAndTail(1\)' instead. Since 2\.6\.0\.
		
		Creates a real `Sink` upon receiving the first element. Internal `Sink` will not be created if there are no elements,
		 because of completion or error.
		 
		 If upstream completes before an element was received then the `Future` is completed with the value created by fallback.
		 If upstream fails before an element was received, `sinkFactory` throws an exception, or materialization of the internal
		 sink fails then the `Future` is completed with the exception.
		 Otherwise the `Future` is completed with the materialized value of the internal sink.
		- #### lazyInitAsync
		
		
		
		```
		public <T,​M> [Sink](Sink.html "class in akka.stream.scaladsl")<T,​scala.concurrent.Future<scala.Option<M>>> lazyInitAsync​(scala.Function0<scala.concurrent.Future<[Sink](Sink.html "class in akka.stream.scaladsl")<T,​M>>> sinkFactory)
		```
		
		Deprecated.
		Use 'Sink.lazyFutureSink' instead. Since 2\.6\.0\.
		
		Creates a real `Sink` upon receiving the first element. Internal `Sink` will not be created if there are no elements,
		 because of completion or error.
		 
		 If upstream completes before an element was received then the `Future` is completed with `None`.
		 If upstream fails before an element was received, `sinkFactory` throws an exception, or materialization of the internal
		 sink fails then the `Future` is completed with the exception.
		 Otherwise the `Future` is completed with the materialized value of the internal sink.
		- #### futureSink
		
		
		
		```
		public <T,​M> [Sink](Sink.html "class in akka.stream.scaladsl")<T,​scala.concurrent.Future<M>> futureSink​(scala.concurrent.Future<[Sink](Sink.html "class in akka.stream.scaladsl")<T,​M>> future)
		```
		
		Turn a `Future[Sink]` into a Sink that will consume the values of the source when the future completes successfully.
		 If the `Future` is completed with a failure the stream is failed.
		 
		 The materialized future value is completed with the materialized value of the future sink or failed with a
		 `NeverMaterializedException` if upstream fails or downstream cancels before the future has completed.
		- #### lazySink
		
		
		
		```
		public <T,​M> [Sink](Sink.html "class in akka.stream.scaladsl")<T,​scala.concurrent.Future<M>> lazySink​(scala.Function0<[Sink](Sink.html "class in akka.stream.scaladsl")<T,​M>> create)
		```
		
		Defers invoking the `create` function to create a sink until there is a first element passed from upstream.
		 
		 The materialized future value is completed with the materialized value of the created sink when that has successfully
		 been materialized.
		 
		
		
		 If the `create` function throws or returns or the stream fails to materialize, in this
		 case the materialized future value is failed with a [`NeverMaterializedException`](../NeverMaterializedException.html "class in akka.stream").
		- #### lazyFutureSink
		
		
		
		```
		public <T,​M> [Sink](Sink.html "class in akka.stream.scaladsl")<T,​scala.concurrent.Future<M>> lazyFutureSink​(scala.Function0<scala.concurrent.Future<[Sink](Sink.html "class in akka.stream.scaladsl")<T,​M>>> create)
		```
		
		Defers invoking the `create` function to create a future sink until there is a first element passed from upstream.
		 
		 The materialized future value is completed with the materialized value of the created sink when that has successfully
		 been materialized.
		 
		
		
		 If the `create` function throws or returns a future that is failed, or the stream fails to materialize, in this
		 case the materialized future value is failed with a [`NeverMaterializedException`](../NeverMaterializedException.html "class in akka.stream").

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/Done.html
- https://doc.akka.io/japi/akka/current/akka/NotUsed.html
- https://doc.akka.io/japi/akka/current/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka/current/akka/actor/Status.Failure.html
- https://doc.akka.io/japi/akka/current/akka/stream/ActorMaterializer.html
- https://doc.akka.io/japi/akka/current/akka/stream/Attributes.html
- https://doc.akka.io/japi/akka/current/akka/stream/Graph.html
- https://doc.akka.io/japi/akka/current/akka/stream/Materializer.html
- https://doc.akka.io/japi/akka/current/akka/stream/NeverMaterializedException.html
- https://doc.akka.io/japi/akka/current/akka/stream/SinkShape.html
- https://doc.akka.io/japi/akka/current/akka/stream/UniformFanOutShape.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/Sink$.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/Sink.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/SinkQueueWithCancel.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/Sink$.html](https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/Sink$.html)*