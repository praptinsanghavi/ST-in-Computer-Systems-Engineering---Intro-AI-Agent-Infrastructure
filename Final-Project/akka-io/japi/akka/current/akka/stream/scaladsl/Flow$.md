---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:41:27Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/Flow$.html
title: Flow$
---

# Flow$

## Content

Package [akka.stream.scaladsl](package-summary.html)
## Class Flow$

- java.lang.Object
- - akka.stream.scaladsl.Flow$

- ---

```
public class Flow$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Flow$](Flow$.html "class in akka.stream.scaladsl")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Flow$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) [Deprecated Methods](javascript:show(32);) 
	| Modifier and Type | Method | Description |
	| `<T> [Flow](Flow.html "class in akka.stream.scaladsl")<T,​T,​[NotUsed](../../NotUsed.html "class in akka")>` | `[apply](#apply())()` | Returns a `Flow` which outputs all its inputs. |
	| `<A,​B>[Flow](Flow.html "class in akka.stream.scaladsl")<A,​B,​[NotUsed](../../NotUsed.html "class in akka")>` | `[fromFunction](#fromFunction(scala.Function1))​(scala.Function1<A,​B> f)` | Creates a \[Flow] which will use the given function to transform its inputs to outputs. |
	| `<I,​O,​M>[Flow](Flow.html "class in akka.stream.scaladsl")<I,​O,​M>` | `[fromGraph](#fromGraph(akka.stream.Graph))​([Graph](../Graph.html "interface in akka.stream")<[FlowShape](../FlowShape.html "class in akka.stream")<I,​O>,​M> g)` | A graph with the shape of a flow logically is a flow, this method makes  it so also in type. |
	| `<T,​U,​M>[Flow](Flow.html "class in akka.stream.scaladsl")<T,​U,​scala.concurrent.Future<M>>` | `[fromMaterializer](#fromMaterializer(scala.Function2))​(scala.Function2<[Materializer](../Materializer.html "class in akka.stream"),​[Attributes](../Attributes.html "class in akka.stream"),​[Flow](Flow.html "class in akka.stream.scaladsl")<T,​U,​M>> factory)` | Defers the creation of a [`Flow`](Flow.html "class in akka.stream.scaladsl") until materialization. |
	| `<I,​O>[Flow](Flow.html "class in akka.stream.scaladsl")<I,​O,​[NotUsed](../../NotUsed.html "class in akka")>` | `[fromProcessor](#fromProcessor(scala.Function0))​(scala.Function0<org.reactivestreams.Processor<I,​O>> processorFactory)` | Creates a Flow from a Reactive Streams `Processor` |
	| `<I,​O,​M>[Flow](Flow.html "class in akka.stream.scaladsl")<I,​O,​M>` | `[fromProcessorMat](#fromProcessorMat(scala.Function0))​(scala.Function0<scala.Tuple2<org.reactivestreams.Processor<I,​O>,​M>> processorFactory)` | Creates a Flow from a Reactive Streams `Processor` and returns a materialized value. |
	| `<I,​O>[Flow](Flow.html "class in akka.stream.scaladsl")<I,​O,​[NotUsed](../../NotUsed.html "class in akka")>` | `[fromSinkAndSource](#fromSinkAndSource(akka.stream.Graph,akka.stream.Graph))​([Graph](../Graph.html "interface in akka.stream")<[SinkShape](../SinkShape.html "class in akka.stream")<I>,​?> sink,  [Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<O>,​?> source)` | Creates a `Flow` from a `Sink` and a `Source` where the Flow's input  will be sent to the Sink and the Flow's output will come from the Source. |
	| `<I,​O>[Flow](Flow.html "class in akka.stream.scaladsl")<I,​O,​[NotUsed](../../NotUsed.html "class in akka")>` | `[fromSinkAndSourceCoupled](#fromSinkAndSourceCoupled(akka.stream.Graph,akka.stream.Graph))​([Graph](../Graph.html "interface in akka.stream")<[SinkShape](../SinkShape.html "class in akka.stream")<I>,​?> sink,  [Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<O>,​?> source)` | Allows coupling termination (cancellation, completion, erroring) of Sinks and Sources while creating a Flow from them. |
	| `<I,​O,​M1,​M2,​M>[Flow](Flow.html "class in akka.stream.scaladsl")<I,​O,​M>` | `[fromSinkAndSourceCoupledMat](#fromSinkAndSourceCoupledMat(akka.stream.Graph,akka.stream.Graph,scala.Function2))​([Graph](../Graph.html "interface in akka.stream")<[SinkShape](../SinkShape.html "class in akka.stream")<I>,​M1> sink,  [Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<O>,​M2> source,  scala.Function2<M1,​M2,​M> combine)` | Allows coupling termination (cancellation, completion, erroring) of Sinks and Sources while creating a Flow from them. |
	| `<I,​O,​M1,​M2,​M>[Flow](Flow.html "class in akka.stream.scaladsl")<I,​O,​M>` | `[fromSinkAndSourceMat](#fromSinkAndSourceMat(akka.stream.Graph,akka.stream.Graph,scala.Function2))​([Graph](../Graph.html "interface in akka.stream")<[SinkShape](../SinkShape.html "class in akka.stream")<I>,​M1> sink,  [Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<O>,​M2> source,  scala.Function2<M1,​M2,​M> combine)` | Creates a `Flow` from a `Sink` and a `Source` where the Flow's input  will be sent to the Sink and the Flow's output will come from the Source. |
	| `<I,​O,​M>[Flow](Flow.html "class in akka.stream.scaladsl")<I,​O,​scala.concurrent.Future<M>>` | `[futureFlow](#futureFlow(scala.concurrent.Future))​(scala.concurrent.Future<[Flow](Flow.html "class in akka.stream.scaladsl")<I,​O,​M>> flow)` | Turn a `Future[Flow]` into a flow that will consume the values of the source when the future completes successfully. |
	| `<I,​O,​M>[Flow](Flow.html "class in akka.stream.scaladsl")<I,​O,​scala.concurrent.Future<M>>` | `[lazyFlow](#lazyFlow(scala.Function0))​(scala.Function0<[Flow](Flow.html "class in akka.stream.scaladsl")<I,​O,​M>> create)` | Defers invoking the `create` function to create a future flow until there is downstream demand and passing  that downstream demand upstream triggers the first element. |
	| `<I,​O,​M>[Flow](Flow.html "class in akka.stream.scaladsl")<I,​O,​scala.concurrent.Future<M>>` | `[lazyFutureFlow](#lazyFutureFlow(scala.Function0))​(scala.Function0<scala.concurrent.Future<[Flow](Flow.html "class in akka.stream.scaladsl")<I,​O,​M>>> create)` | Defers invoking the `create` function to create a future flow until there downstream demand has caused upstream  to send a first element. |
	| `<I,​O,​M>[Flow](Flow.html "class in akka.stream.scaladsl")<I,​O,​M>` | `[lazyInit](#lazyInit(scala.Function1,scala.Function0))​(scala.Function1<I,​scala.concurrent.Future<[Flow](Flow.html "class in akka.stream.scaladsl")<I,​O,​M>>> flowFactory,  scala.Function0<M> fallback)` | Deprecated. Use 'Flow.futureFlow' in combination with prefixAndTail(1\) instead, see \`futureFlow\` operator docs for details. |
	| `<I,​O,​M>[Flow](Flow.html "class in akka.stream.scaladsl")<I,​O,​scala.concurrent.Future<scala.Option<M>>>` | `[lazyInitAsync](#lazyInitAsync(scala.Function0))​(scala.Function0<scala.concurrent.Future<[Flow](Flow.html "class in akka.stream.scaladsl")<I,​O,​M>>> flowFactory)` | Deprecated. Use 'Flow.lazyFutureFlow' instead. |
	| `<T,​U,​M>[Flow](Flow.html "class in akka.stream.scaladsl")<T,​U,​scala.concurrent.Future<M>>` | `[setup](#setup(scala.Function2))​(scala.Function2<[ActorMaterializer](../ActorMaterializer.html "class in akka.stream"),​[Attributes](../Attributes.html "class in akka.stream"),​[Flow](Flow.html "class in akka.stream.scaladsl")<T,​U,​M>> factory)` | Deprecated. Use 'fromMaterializer' instead. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [Flow$](Flow$.html "class in akka.stream.scaladsl") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Flow$
		
		
		
		```
		public Flow$()
		```

	- ### Method Detail
	
	
	
		- #### fromProcessor
		
		
		
		```
		public <I,​O> [Flow](Flow.html "class in akka.stream.scaladsl")<I,​O,​[NotUsed](../../NotUsed.html "class in akka")> fromProcessor​(scala.Function0<org.reactivestreams.Processor<I,​O>> processorFactory)
		```
		
		Creates a Flow from a Reactive Streams `Processor`
		- #### fromProcessorMat
		
		
		
		```
		public <I,​O,​M> [Flow](Flow.html "class in akka.stream.scaladsl")<I,​O,​M> fromProcessorMat​(scala.Function0<scala.Tuple2<org.reactivestreams.Processor<I,​O>,​M>> processorFactory)
		```
		
		Creates a Flow from a Reactive Streams `Processor` and returns a materialized value.
		- #### apply
		
		
		
		```
		public <T> [Flow](Flow.html "class in akka.stream.scaladsl")<T,​T,​[NotUsed](../../NotUsed.html "class in akka")> apply()
		```
		
		Returns a `Flow` which outputs all its inputs.
		- #### fromFunction
		
		
		
		```
		public <A,​B> [Flow](Flow.html "class in akka.stream.scaladsl")<A,​B,​[NotUsed](../../NotUsed.html "class in akka")> fromFunction​(scala.Function1<A,​B> f)
		```
		
		Creates a \[Flow] which will use the given function to transform its inputs to outputs. It is equivalent
		 to `Flow[T].map(f)`
		- #### fromGraph
		
		
		
		```
		public <I,​O,​M> [Flow](Flow.html "class in akka.stream.scaladsl")<I,​O,​M> fromGraph​([Graph](../Graph.html "interface in akka.stream")<[FlowShape](../FlowShape.html "class in akka.stream")<I,​O>,​M> g)
		```
		
		A graph with the shape of a flow logically is a flow, this method makes
		 it so also in type.
		- #### fromMaterializer
		
		
		
		```
		public <T,​U,​M> [Flow](Flow.html "class in akka.stream.scaladsl")<T,​U,​scala.concurrent.Future<M>> fromMaterializer​(scala.Function2<[Materializer](../Materializer.html "class in akka.stream"),​[Attributes](../Attributes.html "class in akka.stream"),​[Flow](Flow.html "class in akka.stream.scaladsl")<T,​U,​M>> factory)
		```
		
		Defers the creation of a [`Flow`](Flow.html "class in akka.stream.scaladsl") until materialization. The `factory` function
		 exposes `Materializer` which is going to be used during materialization and
		 `Attributes` of the [`Flow`](Flow.html "class in akka.stream.scaladsl") returned by this method.
		- #### setup
		
		
		
		```
		public <T,​U,​M> [Flow](Flow.html "class in akka.stream.scaladsl")<T,​U,​scala.concurrent.Future<M>> setup​(scala.Function2<[ActorMaterializer](../ActorMaterializer.html "class in akka.stream"),​[Attributes](../Attributes.html "class in akka.stream"),​[Flow](Flow.html "class in akka.stream.scaladsl")<T,​U,​M>> factory)
		```
		
		Deprecated.
		Use 'fromMaterializer' instead. Since 2\.6\.0\.
		
		Defers the creation of a [`Flow`](Flow.html "class in akka.stream.scaladsl") until materialization. The `factory` function
		 exposes `ActorMaterializer` which is going to be used during materialization and
		 `Attributes` of the [`Flow`](Flow.html "class in akka.stream.scaladsl") returned by this method.
		- #### fromSinkAndSource
		
		
		
		```
		public <I,​O> [Flow](Flow.html "class in akka.stream.scaladsl")<I,​O,​[NotUsed](../../NotUsed.html "class in akka")> fromSinkAndSource​([Graph](../Graph.html "interface in akka.stream")<[SinkShape](../SinkShape.html "class in akka.stream")<I>,​?> sink,
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
		 
		
		
		 See also [`<I,O,M1,M2,M>fromSinkAndSourceMat(akka.stream.Graph<akka.stream.SinkShape<I>,M1>,akka.stream.Graph<akka.stream.SourceShape<O>,M2>,scala.Function2<M1,M2,M>)`](#fromSinkAndSourceMat(akka.stream.Graph,akka.stream.Graph,scala.Function2)) when access to materialized values of the parameters is needed.
		- #### fromSinkAndSourceMat
		
		
		
		```
		public <I,​O,​M1,​M2,​M> [Flow](Flow.html "class in akka.stream.scaladsl")<I,​O,​M> fromSinkAndSourceMat​([Graph](../Graph.html "interface in akka.stream")<[SinkShape](../SinkShape.html "class in akka.stream")<I>,​M1> sink,
		                                                                                          [Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<O>,​M2> source,
		                                                                                          scala.Function2<M1,​M2,​M> combine)
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
		 into the materialized value of the resulting [`Flow`](Flow.html "class in akka.stream.scaladsl").
		- #### fromSinkAndSourceCoupled
		
		
		
		```
		public <I,​O> [Flow](Flow.html "class in akka.stream.scaladsl")<I,​O,​[NotUsed](../../NotUsed.html "class in akka")> fromSinkAndSourceCoupled​([Graph](../Graph.html "interface in akka.stream")<[SinkShape](../SinkShape.html "class in akka.stream")<I>,​?> sink,
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
		
		
		 E.g. if the emitted [`Flow`](Flow.html "class in akka.stream.scaladsl") gets a cancellation, the [`Source`](Source.html "class in akka.stream.scaladsl") of course is cancelled,
		 however the Sink will also be completed. The table below illustrates the effects in detail:
		 
		
		
		
		
		
		
		| Returned Flow | Sink (`in`) | Source (`out`) |
		| --- | --- | --- |
		| *cause:* upstream (sink\-side) receives completion | *effect:* receives completion | *effect:* receives cancel |
		| *cause:* upstream (sink\-side) receives error | *effect:* receives error | *effect:* receives cancel |
		| *cause:* downstream (source\-side) receives cancel | *effect:* completes | *effect:* receives cancel |
		| *effect:* cancels upstream, completes downstream | *effect:* completes | *cause:* signals complete |
		| *effect:* cancels upstream, errors downstream | *effect:* receives error | *cause:* signals error or throws |
		| *effect:* cancels upstream, completes downstream | *cause:* cancels | *effect:* receives cancel |
		
		
		
		 See also [`<I,O,M1,M2,M>fromSinkAndSourceCoupledMat(akka.stream.Graph<akka.stream.SinkShape<I>,M1>,akka.stream.Graph<akka.stream.SourceShape<O>,M2>,scala.Function2<M1,M2,M>)`](#fromSinkAndSourceCoupledMat(akka.stream.Graph,akka.stream.Graph,scala.Function2)) when access to materialized values of the parameters is needed.
		- #### fromSinkAndSourceCoupledMat
		
		
		
		```
		public <I,​O,​M1,​M2,​M> [Flow](Flow.html "class in akka.stream.scaladsl")<I,​O,​M> fromSinkAndSourceCoupledMat​([Graph](../Graph.html "interface in akka.stream")<[SinkShape](../SinkShape.html "class in akka.stream")<I>,​M1> sink,
		                                                                                                 [Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<O>,​M2> source,
		                                                                                                 scala.Function2<M1,​M2,​M> combine)
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
		
		
		 E.g. if the emitted [`Flow`](Flow.html "class in akka.stream.scaladsl") gets a cancellation, the [`Source`](Source.html "class in akka.stream.scaladsl") of course is cancelled,
		 however the Sink will also be completed. The table on `Flow.fromSinkAndSourceCoupled`
		 illustrates the effects in detail.
		 
		
		
		 The `combine` function is used to compose the materialized values of the `sink` and `source`
		 into the materialized value of the resulting [`Flow`](Flow.html "class in akka.stream.scaladsl").
		- #### lazyInit
		
		
		
		```
		public <I,​O,​M> [Flow](Flow.html "class in akka.stream.scaladsl")<I,​O,​M> lazyInit​(scala.Function1<I,​scala.concurrent.Future<[Flow](Flow.html "class in akka.stream.scaladsl")<I,​O,​M>>> flowFactory,
		                                                            scala.Function0<M> fallback)
		```
		
		Deprecated.
		Use 'Flow.futureFlow' in combination with prefixAndTail(1\) instead, see \`futureFlow\` operator docs for details. Since 2\.6\.0\.
		
		Creates a real `Flow` upon receiving the first element. Internal `Flow` will not be created
		 if there are no elements, because of completion, cancellation, or error.
		 
		 The materialized value of the `Flow` is the value that is created by the `fallback` function.
		 
		
		
		 '''Emits when''' the internal flow is successfully created and it emits
		 
		
		
		 '''Backpressures when''' the internal flow is successfully created and it backpressures
		 
		
		
		 '''Completes when''' upstream completes and all elements have been emitted from the internal flow
		 
		
		
		 '''Cancels when''' downstream cancels (see below)
		 
		
		
		 The operator's default behaviour in case of downstream cancellation before nested flow materialization (future completion) is to cancel immediately.
		 This behaviour can be controlled by setting the `akka.stream.Attributes.NestedMaterializationCancellationPolicy.PropagateToNested` attribute,
		 this will delay downstream cancellation until nested flow's materialization which is then immediately cancelled (with the original cancellation cause).
		- #### lazyInitAsync
		
		
		
		```
		public <I,​O,​M> [Flow](Flow.html "class in akka.stream.scaladsl")<I,​O,​scala.concurrent.Future<scala.Option<M>>> lazyInitAsync​(scala.Function0<scala.concurrent.Future<[Flow](Flow.html "class in akka.stream.scaladsl")<I,​O,​M>>> flowFactory)
		```
		
		Deprecated.
		Use 'Flow.lazyFutureFlow' instead. Since 2\.6\.0\.
		
		Creates a real `Flow` upon receiving the first element. Internal `Flow` will not be created
		 if there are no elements, because of completion, cancellation, or error.
		 
		 The materialized value of the `Flow` is a `Future[Option[M}` that is completed with `Some(mat)` when the internal
		 flow gets materialized or with `None` when there where no elements. If the flow materialization (including
		 the call of the `flowFactory`) fails then the future is completed with a failure.
		 
		
		
		 '''Emits when''' the internal flow is successfully created and it emits
		 
		
		
		 '''Backpressures when''' the internal flow is successfully created and it backpressures
		 
		
		
		 '''Completes when''' upstream completes and all elements have been emitted from the internal flow
		 
		
		
		 '''Cancels when''' downstream cancels (see below)
		 
		
		
		 The operator's default behaviour in case of downstream cancellation before nested flow materialization (future completion) is to cancel immediately.
		 This behaviour can be controlled by setting the `akka.stream.Attributes.NestedMaterializationCancellationPolicy.PropagateToNested` attribute,
		 this will delay downstream cancellation until nested flow's materialization which is then immediately cancelled (with the original cancellation cause).
		- #### futureFlow
		
		
		
		```
		public <I,​O,​M> [Flow](Flow.html "class in akka.stream.scaladsl")<I,​O,​scala.concurrent.Future<M>> futureFlow​(scala.concurrent.Future<[Flow](Flow.html "class in akka.stream.scaladsl")<I,​O,​M>> flow)
		```
		
		Turn a `Future[Flow]` into a flow that will consume the values of the source when the future completes successfully.
		 If the `Future` is completed with a failure the stream is failed.
		 
		 The materialized future value is completed with the materialized value of the future flow or failed with a
		 `NeverMaterializedException` if upstream fails or downstream cancels before the future has completed.
		 
		
		
		 The operator's default behaviour in case of downstream cancellation before nested flow materialization (future completion) is to cancel immediately.
		 This behaviour can be controlled by setting the `akka.stream.Attributes.NestedMaterializationCancellationPolicy.PropagateToNested` attribute,
		 this will delay downstream cancellation until nested flow's materialization which is then immediately cancelled (with the original cancellation cause).
		- #### lazyFlow
		
		
		
		```
		public <I,​O,​M> [Flow](Flow.html "class in akka.stream.scaladsl")<I,​O,​scala.concurrent.Future<M>> lazyFlow​(scala.Function0<[Flow](Flow.html "class in akka.stream.scaladsl")<I,​O,​M>> create)
		```
		
		Defers invoking the `create` function to create a future flow until there is downstream demand and passing
		 that downstream demand upstream triggers the first element.
		 
		 The materialized future value is completed with the materialized value of the created flow when that has successfully
		 been materialized.
		 
		
		
		 If the `create` function throws or returns a future that fails the stream is failed, in this case the materialized
		 future value is failed with a `NeverMaterializedException`.
		 
		
		
		 Note that asynchronous boundaries (and other operators) in the stream may do pre\-fetching which counter acts
		 the laziness and can trigger the factory earlier than expected.
		 
		
		
		 '''Emits when''' the internal flow is successfully created and it emits
		 
		
		
		 '''Backpressures when''' the internal flow is successfully created and it backpressures or downstream backpressures
		 
		
		
		 '''Completes when''' upstream completes and all elements have been emitted from the internal flow
		 
		
		
		 '''Cancels when''' downstream cancels (see below)
		 
		
		
		 The operator's default behaviour in case of downstream cancellation before nested flow materialization (future completion) is to cancel immediately.
		 This behaviour can be controlled by setting the `akka.stream.Attributes.NestedMaterializationCancellationPolicy.PropagateToNested` attribute,
		 this will delay downstream cancellation until nested flow's materialization which is then immediately cancelled (with the original cancellation cause).
		- #### lazyFutureFlow
		
		
		
		```
		public <I,​O,​M> [Flow](Flow.html "class in akka.stream.scaladsl")<I,​O,​scala.concurrent.Future<M>> lazyFutureFlow​(scala.Function0<scala.concurrent.Future<[Flow](Flow.html "class in akka.stream.scaladsl")<I,​O,​M>>> create)
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
		 
		
		
		 '''Cancels when''' downstream cancels (see below)
		 
		
		
		 The operator's default behaviour in case of downstream cancellation before nested flow materialization (future completion) is to cancel immediately.
		 This behaviour can be controlled by setting the `akka.stream.Attributes.NestedMaterializationCancellationPolicy.PropagateToNested` attribute,
		 this will delay downstream cancellation until nested flow's materialization which is then immediately cancelled (with the original cancellation cause).

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

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/NotUsed.html
- https://doc.akka.io/japi/akka/current/akka/stream/ActorMaterializer.html
- https://doc.akka.io/japi/akka/current/akka/stream/Attributes.html
- https://doc.akka.io/japi/akka/current/akka/stream/FlowShape.html
- https://doc.akka.io/japi/akka/current/akka/stream/Graph.html
- https://doc.akka.io/japi/akka/current/akka/stream/Materializer.html
- https://doc.akka.io/japi/akka/current/akka/stream/SinkShape.html
- https://doc.akka.io/japi/akka/current/akka/stream/SourceShape.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/Flow$.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/Flow.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/Source.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/Flow$.html](https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/Flow$.html)*