---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:12:52Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/2.10/akka/stream/javadsl/Sink.html
title: Sink
---

# Sink

## Content

Package [akka.stream.javadsl](package-summary.html)
## Class Sink\<In,​Mat\>

- java.lang.Object
- - akka.stream.javadsl.Sink\<In,​Mat\>

- All Implemented Interfaces:
`[Graph](../Graph.html "interface in akka.stream")<[SinkShape](../SinkShape.html "class in akka.stream")<In>,​Mat>`

---

```
public final class Sink<In,​Mat>
extends java.lang.Object
implements [Graph](../Graph.html "interface in akka.stream")<[SinkShape](../SinkShape.html "class in akka.stream")<In>,​Mat>
```

Java API
 
 A `Sink` is a set of stream processing steps that has one open input.
 Can be used as a `Subscriber`

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface akka.stream.[Graph](../Graph.html "interface in akka.stream")
		
		
		`[Graph.GraphMapMatVal](../Graph.GraphMapMatVal.html "class in akka.stream")<[S](../Graph.GraphMapMatVal.html "type parameter in Graph.GraphMapMatVal") extends [Shape](../Shape.html "class in akka.stream"),​[M](../Graph.GraphMapMatVal.html "type parameter in Graph.GraphMapMatVal")>`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Sink](#%3Cinit%3E(akka.stream.scaladsl.Sink))​([Sink](../scaladsl/Sink.html "class in akka.stream.scaladsl")<[In](Sink.html "type parameter in Sink"),​[Mat](Sink.html "type parameter in Sink")> delegate)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) [Deprecated Methods](javascript:show(32);) 
	| Modifier and Type | Method | Description |
	| `static <In> [Sink](Sink.html "class in akka.stream.javadsl")<In,​[NotUsed](../../NotUsed.html "class in akka")>` | `[actorRef](#actorRef(akka.actor.ActorRef,java.lang.Object))​([ActorRef](../../actor/ActorRef.html "class in akka.actor") ref,  java.lang.Object onCompleteMessage)` | Sends the elements of the stream to the given `ActorRef`. |
	| `static <In> [Sink](Sink.html "class in akka.stream.javadsl")<In,​[NotUsed](../../NotUsed.html "class in akka")>` | `[actorRefWithAck](#actorRefWithAck(akka.actor.ActorRef,java.lang.Object,java.lang.Object,java.lang.Object,akka.japi.function.Function))​([ActorRef](../../actor/ActorRef.html "class in akka.actor") ref,  java.lang.Object onInitMessage,  java.lang.Object ackMessage,  java.lang.Object onCompleteMessage,  [Function](../../japi/function/Function.html "interface in akka.japi.function")<java.lang.Throwable,​java.lang.Object> onFailureMessage)` | Deprecated. Use actorRefWithBackpressure instead |
	| `static <In> [Sink](Sink.html "class in akka.stream.javadsl")<In,​[NotUsed](../../NotUsed.html "class in akka")>` | `[actorRefWithBackpressure](#actorRefWithBackpressure(akka.actor.ActorRef,java.lang.Object,java.lang.Object,akka.japi.function.Function))​([ActorRef](../../actor/ActorRef.html "class in akka.actor") ref,  java.lang.Object onInitMessage,  java.lang.Object onCompleteMessage,  [Function](../../japi/function/Function.html "interface in akka.japi.function")<java.lang.Throwable,​java.lang.Object> onFailureMessage)` | Sends the elements of the stream to the given `ActorRef` that sends back back\-pressure signal. |
	| `static <In> [Sink](Sink.html "class in akka.stream.javadsl")<In,​[NotUsed](../../NotUsed.html "class in akka")>` | `[actorRefWithBackpressure](#actorRefWithBackpressure(akka.actor.ActorRef,java.lang.Object,java.lang.Object,java.lang.Object,akka.japi.function.Function))​([ActorRef](../../actor/ActorRef.html "class in akka.actor") ref,  java.lang.Object onInitMessage,  java.lang.Object ackMessage,  java.lang.Object onCompleteMessage,  [Function](../../japi/function/Function.html "interface in akka.japi.function")<java.lang.Throwable,​java.lang.Object> onFailureMessage)` | Sends the elements of the stream to the given `ActorRef` that sends back back\-pressure signal. |
	| `[Sink](Sink.html "class in akka.stream.javadsl")<[In](Sink.html "type parameter in Sink"),​[Mat](Sink.html "type parameter in Sink")>` | `[addAttributes](#addAttributes(akka.stream.Attributes))​([Attributes](../Attributes.html "class in akka.stream") attr)` | Add the given attributes to this [`Sink`](Sink.html "class in akka.stream.javadsl"). |
	| `static <T> [Sink](Sink.html "class in akka.stream.javadsl")<T,​org.reactivestreams.Publisher<T>>` | `[asPublisher](#asPublisher(akka.stream.javadsl.AsPublisher))​([AsPublisher](AsPublisher.html "enum in akka.stream.javadsl") fanout)` | A `Sink` that materializes into a `Publisher`. |
	| `[Sink](../scaladsl/Sink.html "class in akka.stream.scaladsl")<[In](Sink.html "type parameter in Sink"),​[Mat](Sink.html "type parameter in Sink")>` | `[asScala](#asScala())()` | Converts this Sink to its Scala DSL counterpart. |
	| `[Sink](Sink.html "class in akka.stream.javadsl")<[In](Sink.html "type parameter in Sink"),​[Mat](Sink.html "type parameter in Sink")>` | `[async](#async())()` | Put an asynchronous boundary around this `Sink` |
	| `[Sink](Sink.html "class in akka.stream.javadsl")<[In](Sink.html "type parameter in Sink"),​[Mat](Sink.html "type parameter in Sink")>` | `[async](#async(java.lang.String))​(java.lang.String dispatcher)` | Put an asynchronous boundary around this `Sink` |
	| `[Sink](Sink.html "class in akka.stream.javadsl")<[In](Sink.html "type parameter in Sink"),​[Mat](Sink.html "type parameter in Sink")>` | `[async](#async(java.lang.String,int))​(java.lang.String dispatcher,  int inputBufferSize)` | Put an asynchronous boundary around this `Sink` |
	| `static <T> [Sink](Sink.html "class in akka.stream.javadsl")<T,​[NotUsed](../../NotUsed.html "class in akka")>` | `[cancelled](#cancelled())()` | A `Sink` that immediately cancels its upstream after materialization. |
	| `static <U,​In>[Sink](Sink.html "class in akka.stream.javadsl")<In,​java.util.concurrent.CompletionStage<U>>` | `[collect](#collect(java.util.stream.Collector))​(java.util.stream.Collector<In,​?,​U> collector)` | Creates a sink which materializes into a CompletionStage which will be completed with a result of the Java Collector  transformation and reduction operations. |
	| `static <T,​U>[Sink](Sink.html "class in akka.stream.javadsl")<T,​[NotUsed](../../NotUsed.html "class in akka")>` | `[combine](#combine(akka.stream.javadsl.Sink,akka.stream.javadsl.Sink,java.util.List,akka.japi.function.Function))​([Sink](Sink.html "class in akka.stream.javadsl")<U,​?> output1,  [Sink](Sink.html "class in akka.stream.javadsl")<U,​?> output2,  java.util.List<[Sink](Sink.html "class in akka.stream.javadsl")<U,​?>> rest,  [Function](../../japi/function/Function.html "interface in akka.japi.function")<java.lang.Integer,​[Graph](../Graph.html "interface in akka.stream")<[UniformFanOutShape](../UniformFanOutShape.html "class in akka.stream")<T,​U>,​[NotUsed](../../NotUsed.html "class in akka")>> fanOutStrategy)` | Combine several sinks with fan\-out strategy like `Broadcast` or `Balance` and returns `Sink`. |
	| `static <T,​U,​M>[Sink](Sink.html "class in akka.stream.javadsl")<T,​java.util.List<M>>` | `[combine](#combine(java.util.List,akka.japi.function.Function))​(java.util.List<? extends [Graph](../Graph.html "interface in akka.stream")<[SinkShape](../SinkShape.html "class in akka.stream")<U>,​M>> sinks,  [Function](../../japi/function/Function.html "interface in akka.japi.function")<java.lang.Integer,​[Graph](../Graph.html "interface in akka.stream")<[UniformFanOutShape](../UniformFanOutShape.html "class in akka.stream")<T,​U>,​[NotUsed](../../NotUsed.html "class in akka")>> fanOutStrategy)` | Combine several sinks with fan\-out strategy like `Broadcast` or `Balance` and returns `Sink`. |
	| `static <T,​U,​M1,​M2,​M>[Sink](Sink.html "class in akka.stream.javadsl")<T,​M>` | `[combineMat](#combineMat(akka.stream.javadsl.Sink,akka.stream.javadsl.Sink,akka.japi.function.Function,akka.japi.function.Function2))​([Sink](Sink.html "class in akka.stream.javadsl")<U,​M1> first,  [Sink](Sink.html "class in akka.stream.javadsl")<U,​M2> second,  [Function](../../japi/function/Function.html "interface in akka.japi.function")<java.lang.Integer,​[Graph](../Graph.html "interface in akka.stream")<[UniformFanOutShape](../UniformFanOutShape.html "class in akka.stream")<T,​U>,​[NotUsed](../../NotUsed.html "class in akka")>> fanOutStrategy,  [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<M1,​M2,​M> matF)` | Combine two sinks with fan\-out strategy like `Broadcast` or `Balance` and returns `Sink` with 2 outlets. |
	| `static <T,​M>[Sink](Sink.html "class in akka.stream.javadsl")<T,​java.util.concurrent.CompletionStage<M>>` | `[completionStageSink](#completionStageSink(java.util.concurrent.CompletionStage))​(java.util.concurrent.CompletionStage<[Sink](Sink.html "class in akka.stream.javadsl")<T,​M>> future)` | Turn a `Future[Sink]` into a Sink that will consume the values of the source when the future completes successfully. |
	| `<In2> [Sink](Sink.html "class in akka.stream.javadsl")<In2,​[Mat](Sink.html "type parameter in Sink")>` | `[contramap](#contramap(akka.japi.function.Function))​([Function](../../japi/function/Function.html "interface in akka.japi.function")<In2,​[In](Sink.html "type parameter in Sink")> f)` | Transform this Sink by applying a function to each \*incoming\* upstream element before  it is passed to the [`Sink`](Sink.html "class in akka.stream.javadsl") |
	| `static <U,​In>[Sink](Sink.html "class in akka.stream.javadsl")<In,​java.util.concurrent.CompletionStage<U>>` | `[fold](#fold(U,akka.japi.function.Function2))​(U zero,  [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<U,​In,​U> f)` | A `Sink` that will invoke the given function for every received element, giving it its previous  output (or the given `zero` value) and the element as input. |
	| `static <U,​In>[Sink](Sink.html "class in akka.stream.javadsl")<In,​java.util.concurrent.CompletionStage<U>>` | `[foldAsync](#foldAsync(U,akka.japi.function.Function2))​(U zero,  [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<U,​In,​java.util.concurrent.CompletionStage<U>> f)` | A `Sink` that will invoke the given asynchronous function for every received element, giving it its previous  output (or the given `zero` value) and the element as input. |
	| `static <T> [Sink](Sink.html "class in akka.stream.javadsl")<T,​java.util.concurrent.CompletionStage<[Done](../../Done.html "class in akka")>>` | `[foreach](#foreach(akka.japi.function.Procedure))​([Procedure](../../japi/function/Procedure.html "interface in akka.japi.function")<T> f)` | A `Sink` that will invoke the given procedure for each received element. |
	| `static <T> [Sink](Sink.html "class in akka.stream.javadsl")<T,​java.util.concurrent.CompletionStage<[Done](../../Done.html "class in akka")>>` | `[foreachAsync](#foreachAsync(int,akka.japi.function.Function))​(int parallelism,  [Function](../../japi/function/Function.html "interface in akka.japi.function")<T,​java.util.concurrent.CompletionStage<java.lang.Void>> f)` | A `Sink` that will invoke the given procedure asynchronously for each received element. |
	| `static <T,​M>[Sink](Sink.html "class in akka.stream.javadsl")<T,​M>` | `[fromGraph](#fromGraph(akka.stream.Graph))​([Graph](../Graph.html "interface in akka.stream")<[SinkShape](../SinkShape.html "class in akka.stream")<T>,​M> g)` | A graph with the shape of a sink logically is a sink, this method makes  it so also in type. |
	| `static <T,​M>[Sink](Sink.html "class in akka.stream.javadsl")<T,​java.util.concurrent.CompletionStage<M>>` | `[fromMaterializer](#fromMaterializer(java.util.function.BiFunction))​(java.util.function.BiFunction<[Materializer](../Materializer.html "class in akka.stream"),​[Attributes](../Attributes.html "class in akka.stream"),​[Sink](Sink.html "class in akka.stream.javadsl")<T,​M>> factory)` | Defers the creation of a [`Sink`](Sink.html "class in akka.stream.javadsl") until materialization. |
	| `static <In> [Sink](Sink.html "class in akka.stream.javadsl")<In,​[NotUsed](../../NotUsed.html "class in akka")>` | `[fromSubscriber](#fromSubscriber(org.reactivestreams.Subscriber))​(org.reactivestreams.Subscriber<In> subs)` | Helper to create [`Sink`](Sink.html "class in akka.stream.javadsl") from `Subscriber`. |
	| `[Attributes](../Attributes.html "class in akka.stream")` | `[getAttributes](#getAttributes())()` |  |
	| `static <In> [Sink](Sink.html "class in akka.stream.javadsl")<In,​java.util.concurrent.CompletionStage<In>>` | `[head](#head())()` | A `Sink` that materializes into a `CompletionStage` of the first value received. |
	| `static <In> [Sink](Sink.html "class in akka.stream.javadsl")<In,​java.util.concurrent.CompletionStage<java.util.Optional<In>>>` | `[headOption](#headOption())()` | A `Sink` that materializes into a `CompletionStage` of the optional first value received. |
	| `static <T> [Sink](Sink.html "class in akka.stream.javadsl")<T,​java.util.concurrent.CompletionStage<[Done](../../Done.html "class in akka")>>` | `[ignore](#ignore())()` | A `Sink` that will consume the stream and discard the elements. |
	| `static <In> [Sink](Sink.html "class in akka.stream.javadsl")<In,​java.util.concurrent.CompletionStage<In>>` | `[last](#last())()` | A `Sink` that materializes into a `CompletionStage` of the last value received. |
	| `static <In> [Sink](Sink.html "class in akka.stream.javadsl")<In,​java.util.concurrent.CompletionStage<java.util.Optional<In>>>` | `[lastOption](#lastOption())()` | A `Sink` that materializes into a `CompletionStage` of the optional last value received. |
	| `static <T,​M>[Sink](Sink.html "class in akka.stream.javadsl")<T,​java.util.concurrent.CompletionStage<M>>` | `[lazyCompletionStageSink](#lazyCompletionStageSink(akka.japi.function.Creator))​([Creator](../../japi/function/Creator.html "interface in akka.japi.function")<java.util.concurrent.CompletionStage<[Sink](Sink.html "class in akka.stream.javadsl")<T,​M>>> create)` | Defers invoking the `create` function to create a future sink until there is a first element passed from upstream. |
	| `static <T,​M>[Sink](Sink.html "class in akka.stream.javadsl")<T,​java.util.concurrent.CompletionStage<M>>` | `[lazyInit](#lazyInit(akka.japi.function.Function,akka.japi.function.Creator))​([Function](../../japi/function/Function.html "interface in akka.japi.function")<T,​java.util.concurrent.CompletionStage<[Sink](Sink.html "class in akka.stream.javadsl")<T,​M>>> sinkFactory,  [Creator](../../japi/function/Creator.html "interface in akka.japi.function")<M> fallback)` | Deprecated. Use 'Sink.lazyCompletionStageSink' in combination with 'Flow.prefixAndTail(1\)' instead. |
	| `static <T,​M>[Sink](Sink.html "class in akka.stream.javadsl")<T,​java.util.concurrent.CompletionStage<java.util.Optional<M>>>` | `[lazyInitAsync](#lazyInitAsync(akka.japi.function.Creator))​([Creator](../../japi/function/Creator.html "interface in akka.japi.function")<java.util.concurrent.CompletionStage<[Sink](Sink.html "class in akka.stream.javadsl")<T,​M>>> sinkFactory)` | Deprecated. Use 'Sink.lazyCompletionStageSink' instead. |
	| `static <T,​M>[Sink](Sink.html "class in akka.stream.javadsl")<T,​java.util.concurrent.CompletionStage<M>>` | `[lazySink](#lazySink(akka.japi.function.Creator))​([Creator](../../japi/function/Creator.html "interface in akka.japi.function")<[Sink](Sink.html "class in akka.stream.javadsl")<T,​M>> create)` | Defers invoking the `create` function to create a sink until there is a first element passed from upstream. |
	| `<Mat2> [Sink](Sink.html "class in akka.stream.javadsl")<[In](Sink.html "type parameter in Sink"),​Mat2>` | `[mapMaterializedValue](#mapMaterializedValue(akka.japi.function.Function))​([Function](../../japi/function/Function.html "interface in akka.japi.function")<[Mat](Sink.html "type parameter in Sink"),​Mat2> f)` | Transform only the materialized value of this Sink, leaving all other properties as they were. |
	| `[Sink](Sink.html "class in akka.stream.javadsl")<[In](Sink.html "type parameter in Sink"),​[Mat](Sink.html "type parameter in Sink")>` | `[named](#named(java.lang.String))​(java.lang.String name)` | Add a name attribute to this Sink. |
	| `static <T> [Sink](Sink.html "class in akka.stream.javadsl")<T,​java.util.concurrent.CompletionStage<[Done](../../Done.html "class in akka")>>` | `[never](#never())()` | A [`Sink`](Sink.html "class in akka.stream.javadsl") that will always backpressure never cancel and never consume any elements from the stream. |
	| `static <In> [Sink](Sink.html "class in akka.stream.javadsl")<In,​[NotUsed](../../NotUsed.html "class in akka")>` | `[onComplete](#onComplete(akka.japi.function.Procedure))​([Procedure](../../japi/function/Procedure.html "interface in akka.japi.function")<scala.util.Try<[Done](../../Done.html "class in akka")>> callback)` | A `Sink` that when the flow is completed, either through a failure or normal  completion, apply the provided function with `Success`  or `Failure`. |
	| `[Pair](../../japi/Pair.html "class in akka.japi")<[Mat](Sink.html "type parameter in Sink"),​[Sink](Sink.html "class in akka.stream.javadsl")<[In](Sink.html "type parameter in Sink"),​[NotUsed](../../NotUsed.html "class in akka")>>` | `[preMaterialize](#preMaterialize(akka.actor.ClassicActorSystemProvider))​([ClassicActorSystemProvider](../../actor/ClassicActorSystemProvider.html "interface in akka.actor") systemProvider)` | Materializes this Sink, immediately returning (1\) its materialized value, and (2\) a new Sink  that can be consume elements 'into' the pre\-materialized one. |
	| `[Pair](../../japi/Pair.html "class in akka.japi")<[Mat](Sink.html "type parameter in Sink"),​[Sink](Sink.html "class in akka.stream.javadsl")<[In](Sink.html "type parameter in Sink"),​[NotUsed](../../NotUsed.html "class in akka")>>` | `[preMaterialize](#preMaterialize(akka.stream.Materializer))​([Materializer](../Materializer.html "class in akka.stream") materializer)` | Materializes this Sink, immediately returning (1\) its materialized value, and (2\) a new Sink  that can be consume elements 'into' the pre\-materialized one. |
	| `static <T> [Sink](Sink.html "class in akka.stream.javadsl")<T,​[SinkQueueWithCancel](SinkQueueWithCancel.html "interface in akka.stream.javadsl")<T>>` | `[queue](#queue())()` | Creates a `Sink` that is materialized as an [`SinkQueueWithCancel`](SinkQueueWithCancel.html "interface in akka.stream.javadsl"). |
	| `static <T> [Sink](Sink.html "class in akka.stream.javadsl")<T,​[SinkQueueWithCancel](SinkQueueWithCancel.html "interface in akka.stream.javadsl")<T>>` | `[queue](#queue(int))​(int maxConcurrentPulls)` | Creates a `Sink` that is materialized as an [`SinkQueueWithCancel`](SinkQueueWithCancel.html "interface in akka.stream.javadsl"). |
	| `static <In> [Sink](Sink.html "class in akka.stream.javadsl")<In,​java.util.concurrent.CompletionStage<In>>` | `[reduce](#reduce(akka.japi.function.Function2))​([Function2](../../japi/function/Function2.html "interface in akka.japi.function")<In,​In,​In> f)` | A `Sink` that will invoke the given function for every received element, giving it its previous  output (from the second element) and the element as input. |
	| `<M> M` | `[runWith](#runWith(akka.stream.Graph,akka.actor.ClassicActorSystemProvider))​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<[In](Sink.html "type parameter in Sink")>,​M> source,  [ClassicActorSystemProvider](../../actor/ClassicActorSystemProvider.html "interface in akka.actor") systemProvider)` | Connect this `Sink` to a `Source` and run it. |
	| `<M> M` | `[runWith](#runWith(akka.stream.Graph,akka.stream.Materializer))​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<[In](Sink.html "type parameter in Sink")>,​M> source,  [Materializer](../Materializer.html "class in akka.stream") materializer)` | Connect this `Sink` to a `Source` and run it. |
	| `static <In> [Sink](Sink.html "class in akka.stream.javadsl")<In,​java.util.concurrent.CompletionStage<java.util.List<In>>>` | `[seq](#seq())()` | A `Sink` that keeps on collecting incoming elements until upstream terminates. |
	| `static <T,​M>[Sink](Sink.html "class in akka.stream.javadsl")<T,​java.util.concurrent.CompletionStage<M>>` | `[setup](#setup(java.util.function.BiFunction))​(java.util.function.BiFunction<[ActorMaterializer](../ActorMaterializer.html "class in akka.stream"),​[Attributes](../Attributes.html "class in akka.stream"),​[Sink](Sink.html "class in akka.stream.javadsl")<T,​M>> factory)` | Deprecated. Use 'fromMaterializer' instead. |
	| `[SinkShape](../SinkShape.html "class in akka.stream")<[In](Sink.html "type parameter in Sink")>` | `[shape](#shape())()` | The shape of a graph is all that is externally visible: its inlets and outlets. |
	| `static <In> [Sink](Sink.html "class in akka.stream.javadsl")<In,​java.util.concurrent.CompletionStage<java.util.List<In>>>` | `[takeLast](#takeLast(int))​(int n)` | A `Sink` that materializes into a a `CompletionStage` of `List` containing the last `n` collected elements. |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `akka.stream.impl.LinearTraversalBuilder` | `[traversalBuilder](#traversalBuilder())()` | INTERNAL API. |
	| `[Sink](Sink.html "class in akka.stream.javadsl")<[In](Sink.html "type parameter in Sink"),​[Mat](Sink.html "type parameter in Sink")>` | `[withAttributes](#withAttributes(akka.stream.Attributes))​([Attributes](../Attributes.html "class in akka.stream") attr)` | Replace the attributes of this [`Sink`](Sink.html "class in akka.stream.javadsl") with the given ones. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### Sink
		
		
		
		```
		public Sink​([Sink](../scaladsl/Sink.html "class in akka.stream.scaladsl")<[In](Sink.html "type parameter in Sink"),​[Mat](Sink.html "type parameter in Sink")> delegate)
		```

	- ### Method Detail
	
	
	
		- #### fold
		
		
		
		```
		public static <U,​In> [Sink](Sink.html "class in akka.stream.javadsl")<In,​java.util.concurrent.CompletionStage<U>> fold​(U zero,
		                                                                                       [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<U,​In,​U> f)
		```
		
		A `Sink` that will invoke the given function for every received element, giving it its previous
		 output (or the given `zero` value) and the element as input.
		 The returned `CompletionStage` will be completed with value of the final
		 function evaluation when the input stream ends, or completed with `Failure`
		 if there is a failure is signaled in the stream.
		- #### foldAsync
		
		
		
		```
		public static <U,​In> [Sink](Sink.html "class in akka.stream.javadsl")<In,​java.util.concurrent.CompletionStage<U>> foldAsync​(U zero,
		                                                                                            [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<U,​In,​java.util.concurrent.CompletionStage<U>> f)
		```
		
		A `Sink` that will invoke the given asynchronous function for every received element, giving it its previous
		 output (or the given `zero` value) and the element as input.
		 The returned `CompletionStage` will be completed with value of the final
		 function evaluation when the input stream ends, or completed with `Failure`
		 if there is a failure is signaled in the stream.
		- #### collect
		
		
		
		```
		public static <U,​In> [Sink](Sink.html "class in akka.stream.javadsl")<In,​java.util.concurrent.CompletionStage<U>> collect​(java.util.stream.Collector<In,​?,​U> collector)
		```
		
		Creates a sink which materializes into a CompletionStage which will be completed with a result of the Java Collector
		 transformation and reduction operations. This allows usage of Java streams transformations for reactive streams.
		 The Collector will trigger demand downstream. Elements emitted through the stream will be accumulated into a mutable
		 result container, optionally transformed into a final representation after all input elements have been processed.
		 The Collector can also do reduction at the end. Reduction processing is performed sequentially.
		- #### reduce
		
		
		
		```
		public static <In> [Sink](Sink.html "class in akka.stream.javadsl")<In,​java.util.concurrent.CompletionStage<In>> reduce​([Function2](../../japi/function/Function2.html "interface in akka.japi.function")<In,​In,​In> f)
		```
		
		A `Sink` that will invoke the given function for every received element, giving it its previous
		 output (from the second element) and the element as input.
		 The returned `CompletionStage` will be completed with value of the final
		 function evaluation when the input stream ends, or completed with `Failure`
		 if there is a failure signaled in the stream.
		 
		 If the stream is empty (i.e. completes before signalling any elements),
		 the reduce operator will fail its downstream with a `NoSuchElementException`,
		 which is semantically in\-line with that Scala's standard library collections
		 do in such situations.
		- #### fromSubscriber
		
		
		
		```
		public static <In> [Sink](Sink.html "class in akka.stream.javadsl")<In,​[NotUsed](../../NotUsed.html "class in akka")> fromSubscriber​(org.reactivestreams.Subscriber<In> subs)
		```
		
		Helper to create [`Sink`](Sink.html "class in akka.stream.javadsl") from `Subscriber`.
		- #### cancelled
		
		
		
		```
		public static <T> [Sink](Sink.html "class in akka.stream.javadsl")<T,​[NotUsed](../../NotUsed.html "class in akka")> cancelled()
		```
		
		A `Sink` that immediately cancels its upstream after materialization.
		- #### ignore
		
		
		
		```
		public static <T> [Sink](Sink.html "class in akka.stream.javadsl")<T,​java.util.concurrent.CompletionStage<[Done](../../Done.html "class in akka")>> ignore()
		```
		
		A `Sink` that will consume the stream and discard the elements.
		- #### never
		
		
		
		```
		public static <T> [Sink](Sink.html "class in akka.stream.javadsl")<T,​java.util.concurrent.CompletionStage<[Done](../../Done.html "class in akka")>> never()
		```
		
		A [`Sink`](Sink.html "class in akka.stream.javadsl") that will always backpressure never cancel and never consume any elements from the stream.
		- #### asPublisher
		
		
		
		```
		public static <T> [Sink](Sink.html "class in akka.stream.javadsl")<T,​org.reactivestreams.Publisher<T>> asPublisher​([AsPublisher](AsPublisher.html "enum in akka.stream.javadsl") fanout)
		```
		
		A `Sink` that materializes into a `Publisher`.
		 
		 If `fanout` is `true`, the materialized `Publisher` will support multiple `Subscriber`s and
		 the size of the `inputBuffer` configured for this operator becomes the maximum number of elements that
		 the fastest `Subscriber` can be ahead of the slowest one before slowing
		 the processing down due to back pressure.
		 
		
		
		 If `fanout` is `false` then the materialized `Publisher` will only support a single `Subscriber` and
		 reject any additional `Subscriber`s.
		- #### foreach
		
		
		
		```
		public static <T> [Sink](Sink.html "class in akka.stream.javadsl")<T,​java.util.concurrent.CompletionStage<[Done](../../Done.html "class in akka")>> foreach​([Procedure](../../japi/function/Procedure.html "interface in akka.japi.function")<T> f)
		```
		
		A `Sink` that will invoke the given procedure for each received element. The sink is materialized
		 into a `CompletionStage` which will be completed with `Success` when reaching the
		 normal end of the stream, or completed with `Failure` if there is a failure signaled in
		 the stream.
		- #### foreachAsync
		
		
		
		```
		public static <T> [Sink](Sink.html "class in akka.stream.javadsl")<T,​java.util.concurrent.CompletionStage<[Done](../../Done.html "class in akka")>> foreachAsync​(int parallelism,
		                                                                                        [Function](../../japi/function/Function.html "interface in akka.japi.function")<T,​java.util.concurrent.CompletionStage<java.lang.Void>> f)
		```
		
		A `Sink` that will invoke the given procedure asynchronously for each received element. The sink is materialized
		 into a `CompletionStage` which will be completed with `Success` when reaching the
		 normal end of the stream, or completed with `Failure` if there is a failure signaled in
		 the stream.
		- #### onComplete
		
		
		
		```
		public static <In> [Sink](Sink.html "class in akka.stream.javadsl")<In,​[NotUsed](../../NotUsed.html "class in akka")> onComplete​([Procedure](../../japi/function/Procedure.html "interface in akka.japi.function")<scala.util.Try<[Done](../../Done.html "class in akka")>> callback)
		```
		
		A `Sink` that when the flow is completed, either through a failure or normal
		 completion, apply the provided function with `Success`
		 or `Failure`.
		- #### head
		
		
		
		```
		public static <In> [Sink](Sink.html "class in akka.stream.javadsl")<In,​java.util.concurrent.CompletionStage<In>> head()
		```
		
		A `Sink` that materializes into a `CompletionStage` of the first value received.
		 If the stream completes before signaling at least a single element, the CompletionStage will be failed with a `NoSuchElementException`.
		 If the stream signals an error before signaling at least a single element, the CompletionStage will be failed with the streams exception.
		 
		 See also [`<In>headOption()`](#headOption()).
		- #### headOption
		
		
		
		```
		public static <In> [Sink](Sink.html "class in akka.stream.javadsl")<In,​java.util.concurrent.CompletionStage<java.util.Optional<In>>> headOption()
		```
		
		A `Sink` that materializes into a `CompletionStage` of the optional first value received.
		 If the stream completes before signaling at least a single element, the value of the CompletionStage will be an empty `Optional`.
		 If the stream signals an error errors before signaling at least a single element, the CompletionStage will be failed with the streams exception.
		 
		 See also [`<In>head()`](#head()).
		- #### last
		
		
		
		```
		public static <In> [Sink](Sink.html "class in akka.stream.javadsl")<In,​java.util.concurrent.CompletionStage<In>> last()
		```
		
		A `Sink` that materializes into a `CompletionStage` of the last value received.
		 If the stream completes before signaling at least a single element, the CompletionStage will be failed with a `NoSuchElementException`.
		 If the stream signals an error errors before signaling at least a single element, the CompletionStage will be failed with the streams exception.
		 
		 See also [`<In>lastOption()`](#lastOption()), [`<In>takeLast(int)`](#takeLast(int)).
		- #### lastOption
		
		
		
		```
		public static <In> [Sink](Sink.html "class in akka.stream.javadsl")<In,​java.util.concurrent.CompletionStage<java.util.Optional<In>>> lastOption()
		```
		
		A `Sink` that materializes into a `CompletionStage` of the optional last value received.
		 If the stream completes before signaling at least a single element, the value of the CompletionStage will be an empty `Optional`.
		 If the stream signals an error errors before signaling at least a single element, the CompletionStage will be failed with the streams exception.
		 
		 See also [`<In>head()`](#head()), [`<In>takeLast(int)`](#takeLast(int)).
		- #### takeLast
		
		
		
		```
		public static <In> [Sink](Sink.html "class in akka.stream.javadsl")<In,​java.util.concurrent.CompletionStage<java.util.List<In>>> takeLast​(int n)
		```
		
		A `Sink` that materializes into a a `CompletionStage` of `List` containing the last `n` collected elements.
		 
		 If the stream completes before signaling at least n elements, the `CompletionStage` will complete with all elements seen so far.
		 If the stream never completes the `CompletionStage` will never complete.
		 If there is a failure signaled in the stream the `CompletionStage` will be completed with failure.
		- #### seq
		
		
		
		```
		public static <In> [Sink](Sink.html "class in akka.stream.javadsl")<In,​java.util.concurrent.CompletionStage<java.util.List<In>>> seq()
		```
		
		A `Sink` that keeps on collecting incoming elements until upstream terminates.
		 As upstream may be unbounded, `Flow[T].take` or the stricter `Flow[T].limit` (and their variants)
		 may be used to ensure boundedness.
		 Materializes into a `CompletionStage` of `Seq[T]` containing all the collected elements.
		 `List` is limited to `Integer.MAX_VALUE` elements, this Sink will cancel the stream
		 after having received that many elements.
		 
		 See also `Flow.limit`, `Flow.limitWeighted`, `Flow.take`, `Flow.takeWithin`, `Flow.takeWhile`
		- #### actorRef
		
		
		
		```
		public static <In> [Sink](Sink.html "class in akka.stream.javadsl")<In,​[NotUsed](../../NotUsed.html "class in akka")> actorRef​([ActorRef](../../actor/ActorRef.html "class in akka.actor") ref,
		                                                   java.lang.Object onCompleteMessage)
		```
		
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
		public static <In> [Sink](Sink.html "class in akka.stream.javadsl")<In,​[NotUsed](../../NotUsed.html "class in akka")> actorRefWithBackpressure​([ActorRef](../../actor/ActorRef.html "class in akka.actor") ref,
		                                                                   java.lang.Object onInitMessage,
		                                                                   java.lang.Object ackMessage,
		                                                                   java.lang.Object onCompleteMessage,
		                                                                   [Function](../../japi/function/Function.html "interface in akka.japi.function")<java.lang.Throwable,​java.lang.Object> onFailureMessage)
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
		 message will be sent to the destination actor.
		- #### actorRefWithBackpressure
		
		
		
		```
		public static <In> [Sink](Sink.html "class in akka.stream.javadsl")<In,​[NotUsed](../../NotUsed.html "class in akka")> actorRefWithBackpressure​([ActorRef](../../actor/ActorRef.html "class in akka.actor") ref,
		                                                                   java.lang.Object onInitMessage,
		                                                                   java.lang.Object onCompleteMessage,
		                                                                   [Function](../../japi/function/Function.html "interface in akka.japi.function")<java.lang.Throwable,​java.lang.Object> onFailureMessage)
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
		 message will be sent to the destination actor.
		- #### actorRefWithAck
		
		
		
		```
		public static <In> [Sink](Sink.html "class in akka.stream.javadsl")<In,​[NotUsed](../../NotUsed.html "class in akka")> actorRefWithAck​([ActorRef](../../actor/ActorRef.html "class in akka.actor") ref,
		                                                          java.lang.Object onInitMessage,
		                                                          java.lang.Object ackMessage,
		                                                          java.lang.Object onCompleteMessage,
		                                                          [Function](../../japi/function/Function.html "interface in akka.japi.function")<java.lang.Throwable,​java.lang.Object> onFailureMessage)
		```
		
		Deprecated.
		Use actorRefWithBackpressure instead
		
		Sends the elements of the stream to the given `ActorRef` that sends back back\-pressure signal.
		 First element is always `onInitMessage`, then stream is waiting for acknowledgement message
		 `ackMessage` from the given actor which means that it is ready to process
		 elements. It also requires `ackMessage` message after each stream element
		 to make backpressure work.
		 
		 If the target actor terminates the stream will be canceled.
		 When the stream is completed successfully the given `onCompleteMessage`
		 will be sent to the destination actor.
		 When the stream is completed with failure \- result of `onFailureMessage(throwable)`
		 message will be sent to the destination actor.
		- #### fromGraph
		
		
		
		```
		public static <T,​M> [Sink](Sink.html "class in akka.stream.javadsl")<T,​M> fromGraph​([Graph](../Graph.html "interface in akka.stream")<[SinkShape](../SinkShape.html "class in akka.stream")<T>,​M> g)
		```
		
		A graph with the shape of a sink logically is a sink, this method makes
		 it so also in type.
		- #### fromMaterializer
		
		
		
		```
		public static <T,​M> [Sink](Sink.html "class in akka.stream.javadsl")<T,​java.util.concurrent.CompletionStage<M>> fromMaterializer​(java.util.function.BiFunction<[Materializer](../Materializer.html "class in akka.stream"),​[Attributes](../Attributes.html "class in akka.stream"),​[Sink](Sink.html "class in akka.stream.javadsl")<T,​M>> factory)
		```
		
		Defers the creation of a [`Sink`](Sink.html "class in akka.stream.javadsl") until materialization. The `factory` function
		 exposes `Materializer` which is going to be used during materialization and
		 `Attributes` of the [`Sink`](Sink.html "class in akka.stream.javadsl") returned by this method.
		- #### setup
		
		
		
		```
		public static <T,​M> [Sink](Sink.html "class in akka.stream.javadsl")<T,​java.util.concurrent.CompletionStage<M>> setup​(java.util.function.BiFunction<[ActorMaterializer](../ActorMaterializer.html "class in akka.stream"),​[Attributes](../Attributes.html "class in akka.stream"),​[Sink](Sink.html "class in akka.stream.javadsl")<T,​M>> factory)
		```
		
		Deprecated.
		Use 'fromMaterializer' instead. Since 2\.6\.0\.
		
		Defers the creation of a [`Sink`](Sink.html "class in akka.stream.javadsl") until materialization. The `factory` function
		 exposes `ActorMaterializer` which is going to be used during materialization and
		 `Attributes` of the [`Sink`](Sink.html "class in akka.stream.javadsl") returned by this method.
		- #### combine
		
		
		
		```
		public static <T,​U> [Sink](Sink.html "class in akka.stream.javadsl")<T,​[NotUsed](../../NotUsed.html "class in akka")> combine​([Sink](Sink.html "class in akka.stream.javadsl")<U,​?> output1,
		                                                        [Sink](Sink.html "class in akka.stream.javadsl")<U,​?> output2,
		                                                        java.util.List<[Sink](Sink.html "class in akka.stream.javadsl")<U,​?>> rest,
		                                                        [Function](../../japi/function/Function.html "interface in akka.japi.function")<java.lang.Integer,​[Graph](../Graph.html "interface in akka.stream")<[UniformFanOutShape](../UniformFanOutShape.html "class in akka.stream")<T,​U>,​[NotUsed](../../NotUsed.html "class in akka")>> fanOutStrategy)
		```
		
		Combine several sinks with fan\-out strategy like `Broadcast` or `Balance` and returns `Sink`.
		- #### combineMat
		
		
		
		```
		public static <T,​U,​M1,​M2,​M> [Sink](Sink.html "class in akka.stream.javadsl")<T,​M> combineMat​([Sink](Sink.html "class in akka.stream.javadsl")<U,​M1> first,
		                                                                               [Sink](Sink.html "class in akka.stream.javadsl")<U,​M2> second,
		                                                                               [Function](../../japi/function/Function.html "interface in akka.japi.function")<java.lang.Integer,​[Graph](../Graph.html "interface in akka.stream")<[UniformFanOutShape](../UniformFanOutShape.html "class in akka.stream")<T,​U>,​[NotUsed](../../NotUsed.html "class in akka")>> fanOutStrategy,
		                                                                               [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<M1,​M2,​M> matF)
		```
		
		Combine two sinks with fan\-out strategy like `Broadcast` or `Balance` and returns `Sink` with 2 outlets.
		- #### combine
		
		
		
		```
		public static <T,​U,​M> [Sink](Sink.html "class in akka.stream.javadsl")<T,​java.util.List<M>> combine​(java.util.List<? extends [Graph](../Graph.html "interface in akka.stream")<[SinkShape](../SinkShape.html "class in akka.stream")<U>,​M>> sinks,
		                                                                          [Function](../../japi/function/Function.html "interface in akka.japi.function")<java.lang.Integer,​[Graph](../Graph.html "interface in akka.stream")<[UniformFanOutShape](../UniformFanOutShape.html "class in akka.stream")<T,​U>,​[NotUsed](../../NotUsed.html "class in akka")>> fanOutStrategy)
		```
		
		Combine several sinks with fan\-out strategy like `Broadcast` or `Balance` and returns `Sink`.
		 The fanoutGraph's outlets size must match the provides sinks'.
		- #### queue
		
		
		
		```
		public static <T> [Sink](Sink.html "class in akka.stream.javadsl")<T,​[SinkQueueWithCancel](SinkQueueWithCancel.html "interface in akka.stream.javadsl")<T>> queue​(int maxConcurrentPulls)
		```
		
		Creates a `Sink` that is materialized as an [`SinkQueueWithCancel`](SinkQueueWithCancel.html "interface in akka.stream.javadsl").
		 `akka.stream.javadsl.SinkQueueWithCancel.pull` method is pulling element from the stream and returns CompletionStage\[Option\[T}.
		 `CompletionStage` completes when element is available.
		 
		 Before calling pull method second time you need to ensure that number of pending pulls is less then maxConcurrentPulls
		 or wait until some of the previous Futures completes.
		 Pull returns Failed future with ''IllegalStateException'' if there will be more then maxConcurrentPulls number of pending pulls.
		 
		
		
		`Sink` will request at most number of elements equal to size of `inputBuffer` from
		 upstream and then stop back pressure. You can configure size of input
		 buffer by using `Sink.withAttributes` method.
		 
		
		
		 For stream completion you need to pull all elements from [`SinkQueueWithCancel`](SinkQueueWithCancel.html "interface in akka.stream.javadsl") including last None
		 as completion marker
		 
		
		
		
		See Also:
		[`SinkQueueWithCancel`](SinkQueueWithCancel.html "interface in akka.stream.javadsl")
		- #### queue
		
		
		
		```
		public static <T> [Sink](Sink.html "class in akka.stream.javadsl")<T,​[SinkQueueWithCancel](SinkQueueWithCancel.html "interface in akka.stream.javadsl")<T>> queue()
		```
		
		Creates a `Sink` that is materialized as an [`SinkQueueWithCancel`](SinkQueueWithCancel.html "interface in akka.stream.javadsl").
		 `akka.stream.javadsl.SinkQueueWithCancel.pull` method is pulling element from the stream and returns CompletionStage\[Option\[T}.
		 `CompletionStage` completes when element is available.
		 
		 Before calling pull method second time you need to wait until previous CompletionStage completes.
		 Pull returns Failed future with ''IllegalStateException'' if previous future has not yet completed.
		 
		
		
		`Sink` will request at most number of elements equal to size of `inputBuffer` from
		 upstream and then stop back pressure. You can configure size of input
		 buffer by using `Sink.withAttributes` method.
		 
		
		
		 For stream completion you need to pull all elements from [`SinkQueueWithCancel`](SinkQueueWithCancel.html "interface in akka.stream.javadsl") including last None
		 as completion marker
		 
		
		
		
		See Also:
		[`SinkQueueWithCancel`](SinkQueueWithCancel.html "interface in akka.stream.javadsl")
		- #### lazyInit
		
		
		
		```
		public static <T,​M> [Sink](Sink.html "class in akka.stream.javadsl")<T,​java.util.concurrent.CompletionStage<M>> lazyInit​([Function](../../japi/function/Function.html "interface in akka.japi.function")<T,​java.util.concurrent.CompletionStage<[Sink](Sink.html "class in akka.stream.javadsl")<T,​M>>> sinkFactory,
		                                                                                         [Creator](../../japi/function/Creator.html "interface in akka.japi.function")<M> fallback)
		```
		
		Deprecated.
		Use 'Sink.lazyCompletionStageSink' in combination with 'Flow.prefixAndTail(1\)' instead. Since 2\.6\.0\.
		
		Creates a real `Sink` upon receiving the first element. Internal `Sink` will not be created if there are no elements,
		 because of completion or error.
		 
		 If upstream completes before an element was received then the `Future` is completed with the value created by fallback.
		 If upstream fails before an element was received, `sinkFactory` throws an exception, or materialization of the internal
		 sink fails then the `Future` is completed with the exception.
		 Otherwise the `Future` is completed with the materialized value of the internal sink.
		- #### lazyInitAsync
		
		
		
		```
		public static <T,​M> [Sink](Sink.html "class in akka.stream.javadsl")<T,​java.util.concurrent.CompletionStage<java.util.Optional<M>>> lazyInitAsync​([Creator](../../japi/function/Creator.html "interface in akka.japi.function")<java.util.concurrent.CompletionStage<[Sink](Sink.html "class in akka.stream.javadsl")<T,​M>>> sinkFactory)
		```
		
		Deprecated.
		Use 'Sink.lazyCompletionStageSink' instead. Since 2\.6\.0\.
		
		Creates a real `Sink` upon receiving the first element. Internal `Sink` will not be created if there are no elements,
		 because of completion or error.
		 
		 If upstream completes before an element was received then the `Future` is completed with `None`.
		 If upstream fails before an element was received, `sinkFactory` throws an exception, or materialization of the internal
		 sink fails then the `Future` is completed with the exception.
		 Otherwise the `Future` is completed with the materialized value of the internal sink.
		- #### completionStageSink
		
		
		
		```
		public static <T,​M> [Sink](Sink.html "class in akka.stream.javadsl")<T,​java.util.concurrent.CompletionStage<M>> completionStageSink​(java.util.concurrent.CompletionStage<[Sink](Sink.html "class in akka.stream.javadsl")<T,​M>> future)
		```
		
		Turn a `Future[Sink]` into a Sink that will consume the values of the source when the future completes successfully.
		 If the `Future` is completed with a failure the stream is failed.
		 
		 The materialized future value is completed with the materialized value of the future sink or failed with a
		 `NeverMaterializedException` if upstream fails or downstream cancels before the future has completed.
		- #### lazySink
		
		
		
		```
		public static <T,​M> [Sink](Sink.html "class in akka.stream.javadsl")<T,​java.util.concurrent.CompletionStage<M>> lazySink​([Creator](../../japi/function/Creator.html "interface in akka.japi.function")<[Sink](Sink.html "class in akka.stream.javadsl")<T,​M>> create)
		```
		
		Defers invoking the `create` function to create a sink until there is a first element passed from upstream.
		 
		 The materialized future value is completed with the materialized value of the created sink when that has successfully
		 been materialized.
		 
		
		
		 If the `create` function throws or returns or the stream fails to materialize, in this
		 case the materialized future value is failed with a [`NeverMaterializedException`](../NeverMaterializedException.html "class in akka.stream").
		- #### lazyCompletionStageSink
		
		
		
		```
		public static <T,​M> [Sink](Sink.html "class in akka.stream.javadsl")<T,​java.util.concurrent.CompletionStage<M>> lazyCompletionStageSink​([Creator](../../japi/function/Creator.html "interface in akka.japi.function")<java.util.concurrent.CompletionStage<[Sink](Sink.html "class in akka.stream.javadsl")<T,​M>>> create)
		```
		
		Defers invoking the `create` function to create a future sink until there is a first element passed from upstream.
		 
		 The materialized future value is completed with the materialized value of the created sink when that has successfully
		 been materialized.
		 
		
		
		 If the `create` function throws or returns a future that is failed, or the stream fails to materialize, in this
		 case the materialized future value is failed with a [`NeverMaterializedException`](../NeverMaterializedException.html "class in akka.stream").
		- #### shape
		
		
		
		```
		public [SinkShape](../SinkShape.html "class in akka.stream")<[In](Sink.html "type parameter in Sink")> shape()
		```
		
		Description copied from interface: `[Graph](../Graph.html#shape())`
		The shape of a graph is all that is externally visible: its inlets and outlets.
		
		Specified by:
		`[shape](../Graph.html#shape())` in interface `[Graph](../Graph.html "interface in akka.stream")<[In](Sink.html "type parameter in Sink"),​[Mat](Sink.html "type parameter in Sink")>`
		- #### traversalBuilder
		
		
		
		```
		public akka.stream.impl.LinearTraversalBuilder traversalBuilder()
		```
		
		Description copied from interface: `[Graph](../Graph.html#traversalBuilder())`
		INTERNAL API.
		 
		 Every materializable element must be backed by a stream layout module
		
		
		
		Specified by:
		`[traversalBuilder](../Graph.html#traversalBuilder())` in interface `[Graph](../Graph.html "interface in akka.stream")<[In](Sink.html "type parameter in Sink"),​[Mat](Sink.html "type parameter in Sink")>`
		- #### toString
		
		
		
		```
		public java.lang.String toString()
		```
		
		
		Overrides:
		`toString` in class `java.lang.Object`
		- #### asScala
		
		
		
		```
		public [Sink](../scaladsl/Sink.html "class in akka.stream.scaladsl")<[In](Sink.html "type parameter in Sink"),​[Mat](Sink.html "type parameter in Sink")> asScala()
		```
		
		Converts this Sink to its Scala DSL counterpart.
		- #### runWith
		
		
		
		```
		public <M> M runWith​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<[In](Sink.html "type parameter in Sink")>,​M> source,
		                     [ClassicActorSystemProvider](../../actor/ClassicActorSystemProvider.html "interface in akka.actor") systemProvider)
		```
		
		Connect this `Sink` to a `Source` and run it.
		 
		 Note that the `ActorSystem` can be used as the `systemProvider` parameter.
		- #### runWith
		
		
		
		```
		public <M> M runWith​([Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<[In](Sink.html "type parameter in Sink")>,​M> source,
		                     [Materializer](../Materializer.html "class in akka.stream") materializer)
		```
		
		Connect this `Sink` to a `Source` and run it.
		- #### contramap
		
		
		
		```
		public <In2> [Sink](Sink.html "class in akka.stream.javadsl")<In2,​[Mat](Sink.html "type parameter in Sink")> contramap​([Function](../../japi/function/Function.html "interface in akka.japi.function")<In2,​[In](Sink.html "type parameter in Sink")> f)
		```
		
		Transform this Sink by applying a function to each \*incoming\* upstream element before
		 it is passed to the [`Sink`](Sink.html "class in akka.stream.javadsl")
		
		 '''Backpressures when''' original [`Sink`](Sink.html "class in akka.stream.javadsl") backpressures
		 
		
		
		 '''Cancels when''' original [`Sink`](Sink.html "class in akka.stream.javadsl") backpressures
		- #### mapMaterializedValue
		
		
		
		```
		public <Mat2> [Sink](Sink.html "class in akka.stream.javadsl")<[In](Sink.html "type parameter in Sink"),​Mat2> mapMaterializedValue​([Function](../../japi/function/Function.html "interface in akka.japi.function")<[Mat](Sink.html "type parameter in Sink"),​Mat2> f)
		```
		
		Transform only the materialized value of this Sink, leaving all other properties as they were.
		- #### preMaterialize
		
		
		
		```
		public [Pair](../../japi/Pair.html "class in akka.japi")<[Mat](Sink.html "type parameter in Sink"),​[Sink](Sink.html "class in akka.stream.javadsl")<[In](Sink.html "type parameter in Sink"),​[NotUsed](../../NotUsed.html "class in akka")>> preMaterialize​([ClassicActorSystemProvider](../../actor/ClassicActorSystemProvider.html "interface in akka.actor") systemProvider)
		```
		
		Materializes this Sink, immediately returning (1\) its materialized value, and (2\) a new Sink
		 that can be consume elements 'into' the pre\-materialized one.
		 
		 Useful for when you need a materialized value of a Sink when handing it out to someone to materialize it for you.
		 
		
		
		 Note that the `ActorSystem` can be used as the `systemProvider` parameter.
		 
		
		
		 Note that `preMaterialize` is implemented through a reactive streams `Subscriber` which means that a buffer is introduced
		 and that errors are not propagated upstream but are turned into cancellations without error details.
		- #### preMaterialize
		
		
		
		```
		public [Pair](../../japi/Pair.html "class in akka.japi")<[Mat](Sink.html "type parameter in Sink"),​[Sink](Sink.html "class in akka.stream.javadsl")<[In](Sink.html "type parameter in Sink"),​[NotUsed](../../NotUsed.html "class in akka")>> preMaterialize​([Materializer](../Materializer.html "class in akka.stream") materializer)
		```
		
		Materializes this Sink, immediately returning (1\) its materialized value, and (2\) a new Sink
		 that can be consume elements 'into' the pre\-materialized one.
		 
		 Useful for when you need a materialized value of a Sink when handing it out to someone to materialize it for you.
		 
		
		
		 Prefer the method taking an ActorSystem unless you have special requirements.
		- #### withAttributes
		
		
		
		```
		public [Sink](Sink.html "class in akka.stream.javadsl")<[In](Sink.html "type parameter in Sink"),​[Mat](Sink.html "type parameter in Sink")> withAttributes​([Attributes](../Attributes.html "class in akka.stream") attr)
		```
		
		Replace the attributes of this [`Sink`](Sink.html "class in akka.stream.javadsl") with the given ones. If this Sink is a composite
		 of multiple graphs, new attributes on the composite will be less specific than attributes
		 set directly on the individual graphs of the composite.
		
		Specified by:
		`[withAttributes](../Graph.html#withAttributes(akka.stream.Attributes))` in interface `[Graph](../Graph.html "interface in akka.stream")<[In](Sink.html "type parameter in Sink"),​[Mat](Sink.html "type parameter in Sink")>`
		- #### addAttributes
		
		
		
		```
		public [Sink](Sink.html "class in akka.stream.javadsl")<[In](Sink.html "type parameter in Sink"),​[Mat](Sink.html "type parameter in Sink")> addAttributes​([Attributes](../Attributes.html "class in akka.stream") attr)
		```
		
		Add the given attributes to this [`Sink`](Sink.html "class in akka.stream.javadsl"). If the specific attribute was already present
		 on this graph this means the added attribute will be more specific than the existing one.
		 If this Sink is a composite of multiple graphs, new attributes on the composite will be
		 less specific than attributes set directly on the individual graphs of the composite.
		
		Specified by:
		`[addAttributes](../Graph.html#addAttributes(akka.stream.Attributes))` in interface `[Graph](../Graph.html "interface in akka.stream")<[In](Sink.html "type parameter in Sink"),​[Mat](Sink.html "type parameter in Sink")>`
		- #### named
		
		
		
		```
		public [Sink](Sink.html "class in akka.stream.javadsl")<[In](Sink.html "type parameter in Sink"),​[Mat](Sink.html "type parameter in Sink")> named​(java.lang.String name)
		```
		
		Add a name attribute to this Sink.
		
		Specified by:
		`[named](../Graph.html#named(java.lang.String))` in interface `[Graph](../Graph.html "interface in akka.stream")<[In](Sink.html "type parameter in Sink"),​[Mat](Sink.html "type parameter in Sink")>`
		- #### async
		
		
		
		```
		public [Sink](Sink.html "class in akka.stream.javadsl")<[In](Sink.html "type parameter in Sink"),​[Mat](Sink.html "type parameter in Sink")> async()
		```
		
		Put an asynchronous boundary around this `Sink`
		
		Specified by:
		`[async](../Graph.html#async())` in interface `[Graph](../Graph.html "interface in akka.stream")<[In](Sink.html "type parameter in Sink"),​[Mat](Sink.html "type parameter in Sink")>`
		- #### async
		
		
		
		```
		public [Sink](Sink.html "class in akka.stream.javadsl")<[In](Sink.html "type parameter in Sink"),​[Mat](Sink.html "type parameter in Sink")> async​(java.lang.String dispatcher)
		```
		
		Put an asynchronous boundary around this `Sink`
		
		
		Specified by:
		`[async](../Graph.html#async(java.lang.String))` in interface `[Graph](../Graph.html "interface in akka.stream")<[In](Sink.html "type parameter in Sink"),​[Mat](Sink.html "type parameter in Sink")>`
		Parameters:
		`dispatcher` \- Run the graph on this dispatcher
		- #### async
		
		
		
		```
		public [Sink](Sink.html "class in akka.stream.javadsl")<[In](Sink.html "type parameter in Sink"),​[Mat](Sink.html "type parameter in Sink")> async​(java.lang.String dispatcher,
		                                int inputBufferSize)
		```
		
		Put an asynchronous boundary around this `Sink`
		
		
		Specified by:
		`[async](../Graph.html#async(java.lang.String,int))` in interface `[Graph](../Graph.html "interface in akka.stream")<[In](Sink.html "type parameter in Sink"),​[Mat](Sink.html "type parameter in Sink")>`
		Parameters:
		`dispatcher` \- Run the graph on this dispatcher
		`inputBufferSize` \- Set the input buffer to this size for the graph
		- #### getAttributes
		
		
		
		```
		public [Attributes](../Attributes.html "class in akka.stream") getAttributes()
		```
		
		
		Specified by:
		`[getAttributes](../Graph.html#getAttributes())` in interface `[Graph](../Graph.html "interface in akka.stream")<[In](Sink.html "type parameter in Sink"),​[Mat](Sink.html "type parameter in Sink")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/2.10/akka/Done.html
- https://doc.akka.io/japi/akka/2.10/akka/NotUsed.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/ClassicActorSystemProvider.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/Status.Failure.html
- https://doc.akka.io/japi/akka/2.10/akka/japi/Pair.html
- https://doc.akka.io/japi/akka/2.10/akka/japi/function/Creator.html
- https://doc.akka.io/japi/akka/2.10/akka/japi/function/Function.html
- https://doc.akka.io/japi/akka/2.10/akka/japi/function/Function2.html
- https://doc.akka.io/japi/akka/2.10/akka/japi/function/Procedure.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/ActorMaterializer.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/Attributes.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/Graph.GraphMapMatVal.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/Graph.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/Materializer.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/NeverMaterializedException.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/Shape.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/SinkShape.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/SourceShape.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/UniformFanOutShape.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/javadsl/AsPublisher.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/javadsl/Sink.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/javadsl/SinkQueueWithCancel.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/javadsl/package-summary.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/scaladsl/Sink.html

---
*Source: [https://doc.akka.io/japi/akka/2.10/akka/stream/javadsl/Sink.html](https://doc.akka.io/japi/akka/2.10/akka/stream/javadsl/Sink.html)*