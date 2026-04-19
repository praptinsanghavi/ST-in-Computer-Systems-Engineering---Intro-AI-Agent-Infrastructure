---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:01:29Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/2.10/akka/stream/javadsl/Flow$.html
title: Flow$
---

# Flow$

## Content

Package [akka.stream.javadsl](package-summary.html)
## Class Flow$

- java.lang.Object
- - akka.stream.javadsl.Flow$

- ---

```
public class Flow$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Flow$](Flow$.html "class in akka.stream.javadsl")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Flow$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) [Deprecated Methods](javascript:show(32);) 
	| Modifier and Type | Method | Description |
	| `<I,​O,​M>[Flow](Flow.html "class in akka.stream.javadsl")<I,​O,​java.util.concurrent.CompletionStage<M>>` | `[completionStageFlow](#completionStageFlow(java.util.concurrent.CompletionStage))​(java.util.concurrent.CompletionStage<[Flow](Flow.html "class in akka.stream.javadsl")<I,​O,​M>> flow)` | Turn a `CompletionStage` into a flow that will consume the values of the source when the future completes successfully. |
	| `<T> [Flow](Flow.html "class in akka.stream.javadsl")<T,​T,​[NotUsed](../../NotUsed.html "class in akka")>` | `[create](#create())()` | Create a \`Flow\` which can process elements of type \`T\`. |
	| `<Out,​In extends java.util.Optional<Out>>[Flow](Flow.html "class in akka.stream.javadsl")<In,​Out,​[NotUsed](../../NotUsed.html "class in akka")>` | `[flattenOptional](#flattenOptional())()` | Collect the value of `Optional` from the elements passing through this flow, empty `Optional` is filtered out. |
	| `<I,​O>[Flow](Flow.html "class in akka.stream.javadsl")<I,​O,​[NotUsed](../../NotUsed.html "class in akka")>` | `[fromFunction](#fromFunction(akka.japi.function.Function))​([Function](../../japi/function/Function.html "interface in akka.japi.function")<I,​O> f)` | Creates a \[Flow] which will use the given function to transform its inputs to outputs. |
	| `<I,​O,​M>[Flow](Flow.html "class in akka.stream.javadsl")<I,​O,​M>` | `[fromGraph](#fromGraph(akka.stream.Graph))​([Graph](../Graph.html "interface in akka.stream")<[FlowShape](../FlowShape.html "class in akka.stream")<I,​O>,​M> g)` | A graph with the shape of a flow logically is a flow, this method makes it so also in type. |
	| `<I,​O,​M>[Flow](Flow.html "class in akka.stream.javadsl")<I,​O,​java.util.concurrent.CompletionStage<M>>` | `[fromMaterializer](#fromMaterializer(java.util.function.BiFunction))​(java.util.function.BiFunction<[Materializer](../Materializer.html "class in akka.stream"),​[Attributes](../Attributes.html "class in akka.stream"),​[Flow](Flow.html "class in akka.stream.javadsl")<I,​O,​M>> factory)` | Defers the creation of a [`Flow`](Flow.html "class in akka.stream.javadsl") until materialization. |
	| `<I,​O>[Flow](Flow.html "class in akka.stream.javadsl")<I,​O,​[NotUsed](../../NotUsed.html "class in akka")>` | `[fromProcessor](#fromProcessor(akka.japi.function.Creator))​([Creator](../../japi/function/Creator.html "interface in akka.japi.function")<org.reactivestreams.Processor<I,​O>> processorFactory)` |  |
	| `<I,​O,​Mat>[Flow](Flow.html "class in akka.stream.javadsl")<I,​O,​Mat>` | `[fromProcessorMat](#fromProcessorMat(akka.japi.function.Creator))​([Creator](../../japi/function/Creator.html "interface in akka.japi.function")<[Pair](../../japi/Pair.html "class in akka.japi")<org.reactivestreams.Processor<I,​O>,​Mat>> processorFactory)` |  |
	| `<I,​O>[Flow](Flow.html "class in akka.stream.javadsl")<I,​O,​[NotUsed](../../NotUsed.html "class in akka")>` | `[fromSinkAndSource](#fromSinkAndSource(akka.stream.Graph,akka.stream.Graph))​([Graph](../Graph.html "interface in akka.stream")<[SinkShape](../SinkShape.html "class in akka.stream")<I>,​?> sink,  [Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<O>,​?> source)` | Creates a `Flow` from a `Sink` and a `Source` where the Flow's input  will be sent to the Sink and the Flow's output will come from the Source. |
	| `<I,​O>[Flow](Flow.html "class in akka.stream.javadsl")<I,​O,​[NotUsed](../../NotUsed.html "class in akka")>` | `[fromSinkAndSourceCoupled](#fromSinkAndSourceCoupled(akka.stream.Graph,akka.stream.Graph))​([Graph](../Graph.html "interface in akka.stream")<[SinkShape](../SinkShape.html "class in akka.stream")<I>,​?> sink,  [Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<O>,​?> source)` | Allows coupling termination (cancellation, completion, erroring) of Sinks and Sources while creating a Flow from them. |
	| `<I,​O,​M1,​M2,​M>[Flow](Flow.html "class in akka.stream.javadsl")<I,​O,​M>` | `[fromSinkAndSourceCoupledMat](#fromSinkAndSourceCoupledMat(akka.stream.Graph,akka.stream.Graph,akka.japi.function.Function2))​([Graph](../Graph.html "interface in akka.stream")<[SinkShape](../SinkShape.html "class in akka.stream")<I>,​M1> sink,  [Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<O>,​M2> source,  [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<M1,​M2,​M> combine)` | Allows coupling termination (cancellation, completion, erroring) of Sinks and Sources while creating a Flow from them. |
	| `<I,​O,​M1,​M2,​M>[Flow](Flow.html "class in akka.stream.javadsl")<I,​O,​M>` | `[fromSinkAndSourceMat](#fromSinkAndSourceMat(akka.stream.Graph,akka.stream.Graph,akka.japi.function.Function2))​([Graph](../Graph.html "interface in akka.stream")<[SinkShape](../SinkShape.html "class in akka.stream")<I>,​M1> sink,  [Graph](../Graph.html "interface in akka.stream")<[SourceShape](../SourceShape.html "class in akka.stream")<O>,​M2> source,  [Function2](../../japi/function/Function2.html "interface in akka.japi.function")<M1,​M2,​M> combine)` | Creates a `Flow` from a `Sink` and a `Source` where the Flow's input  will be sent to the Sink and the Flow's output will come from the Source. |
	| `<I,​O,​M>[Flow](Flow.html "class in akka.stream.javadsl")<I,​O,​java.util.concurrent.CompletionStage<M>>` | `[lazyCompletionStageFlow](#lazyCompletionStageFlow(akka.japi.function.Creator))​([Creator](../../japi/function/Creator.html "interface in akka.japi.function")<java.util.concurrent.CompletionStage<[Flow](Flow.html "class in akka.stream.javadsl")<I,​O,​M>>> create)` | Defers invoking the `create` function to create a future flow until there downstream demand has caused upstream  to send a first element. |
	| `<I,​O,​M>[Flow](Flow.html "class in akka.stream.javadsl")<I,​O,​java.util.concurrent.CompletionStage<M>>` | `[lazyFlow](#lazyFlow(akka.japi.function.Creator))​([Creator](../../japi/function/Creator.html "interface in akka.japi.function")<[Flow](Flow.html "class in akka.stream.javadsl")<I,​O,​M>> create)` | Defers invoking the `create` function to create a future flow until there is downstream demand and passing  that downstream demand upstream triggers the first element. |
	| `<I,​O,​M>[Flow](Flow.html "class in akka.stream.javadsl")<I,​O,​M>` | `[lazyInit](#lazyInit(akka.japi.function.Function,akka.japi.function.Creator))​([Function](../../japi/function/Function.html "interface in akka.japi.function")<I,​java.util.concurrent.CompletionStage<[Flow](Flow.html "class in akka.stream.javadsl")<I,​O,​M>>> flowFactory,  [Creator](../../japi/function/Creator.html "interface in akka.japi.function")<M> fallback)` | Deprecated. Use 'Flow.completionStageFlow' in combination with prefixAndTail(1\) instead, see \`completionStageFlow\` operator docs for details. |
	| `<I,​O,​M>[Flow](Flow.html "class in akka.stream.javadsl")<I,​O,​java.util.concurrent.CompletionStage<java.util.Optional<M>>>` | `[lazyInitAsync](#lazyInitAsync(akka.japi.function.Creator))​([Creator](../../japi/function/Creator.html "interface in akka.japi.function")<java.util.concurrent.CompletionStage<[Flow](Flow.html "class in akka.stream.javadsl")<I,​O,​M>>> flowFactory)` | Deprecated. Use 'Flow.lazyCompletionStageFlow' instead. |
	| `<T> [Flow](Flow.html "class in akka.stream.javadsl")<T,​T,​[NotUsed](../../NotUsed.html "class in akka")>` | `[of](#of(java.lang.Class))​(java.lang.Class<T> clazz)` | Create a \`Flow\` which can process elements of type \`T\`. |
	| `<I,​O,​M>[Flow](Flow.html "class in akka.stream.javadsl")<I,​O,​java.util.concurrent.CompletionStage<M>>` | `[setup](#setup(java.util.function.BiFunction))​(java.util.function.BiFunction<[ActorMaterializer](../ActorMaterializer.html "class in akka.stream"),​[Attributes](../Attributes.html "class in akka.stream"),​[Flow](Flow.html "class in akka.stream.javadsl")<I,​O,​M>> factory)` | Deprecated. Use 'fromMaterializer' instead. |
	| `<In,​SuperOut,​Out extends SuperOut,​M>[Flow](Flow.html "class in akka.stream.javadsl")<In,​SuperOut,​M>` | `[upcast](#upcast(akka.stream.javadsl.Flow))​([Flow](Flow.html "class in akka.stream.javadsl")<In,​Out,​M> flow)` | Upcast a stream of elements to a stream of supertypes of that element. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [Flow$](Flow$.html "class in akka.stream.javadsl") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Flow$
		
		
		
		```
		public Flow$()
		```

	- ### Method Detail
	
	
	
		- #### create
		
		
		
		```
		public <T> [Flow](Flow.html "class in akka.stream.javadsl")<T,​T,​[NotUsed](../../NotUsed.html "class in akka")> create()
		```
		
		Create a \`Flow\` which can process elements of type \`T\`.
		- #### fromProcessor
		
		
		
		```
		public <I,​O> [Flow](Flow.html "class in akka.stream.javadsl")<I,​O,​[NotUsed](../../NotUsed.html "class in akka")> fromProcessor​([Creator](../../japi/function/Creator.html "interface in akka.japi.function")<org.reactivestreams.Processor<I,​O>> processorFactory)
		```
		- #### fromProcessorMat
		
		
		
		```
		public <I,​O,​Mat> [Flow](Flow.html "class in akka.stream.javadsl")<I,​O,​Mat> fromProcessorMat​([Creator](../../japi/function/Creator.html "interface in akka.japi.function")<[Pair](../../japi/Pair.html "class in akka.japi")<org.reactivestreams.Processor<I,​O>,​Mat>> processorFactory)
		```
		- #### fromFunction
		
		
		
		```
		public <I,​O> [Flow](Flow.html "class in akka.stream.javadsl")<I,​O,​[NotUsed](../../NotUsed.html "class in akka")> fromFunction​([Function](../../japi/function/Function.html "interface in akka.japi.function")<I,​O> f)
		```
		
		Creates a \[Flow] which will use the given function to transform its inputs to outputs. It is equivalent
		 to `Flow.create[T].map(f)`
		- #### of
		
		
		
		```
		public <T> [Flow](Flow.html "class in akka.stream.javadsl")<T,​T,​[NotUsed](../../NotUsed.html "class in akka")> of​(java.lang.Class<T> clazz)
		```
		
		Create a \`Flow\` which can process elements of type \`T\`.
		- #### fromGraph
		
		
		
		```
		public <I,​O,​M> [Flow](Flow.html "class in akka.stream.javadsl")<I,​O,​M> fromGraph​([Graph](../Graph.html "interface in akka.stream")<[FlowShape](../FlowShape.html "class in akka.stream")<I,​O>,​M> g)
		```
		
		A graph with the shape of a flow logically is a flow, this method makes it so also in type.
		- #### fromMaterializer
		
		
		
		```
		public <I,​O,​M> [Flow](Flow.html "class in akka.stream.javadsl")<I,​O,​java.util.concurrent.CompletionStage<M>> fromMaterializer​(java.util.function.BiFunction<[Materializer](../Materializer.html "class in akka.stream"),​[Attributes](../Attributes.html "class in akka.stream"),​[Flow](Flow.html "class in akka.stream.javadsl")<I,​O,​M>> factory)
		```
		
		Defers the creation of a [`Flow`](Flow.html "class in akka.stream.javadsl") until materialization. The `factory` function
		 exposes `Materializer` which is going to be used during materialization and
		 `Attributes` of the [`Flow`](Flow.html "class in akka.stream.javadsl") returned by this method.
		- #### setup
		
		
		
		```
		public <I,​O,​M> [Flow](Flow.html "class in akka.stream.javadsl")<I,​O,​java.util.concurrent.CompletionStage<M>> setup​(java.util.function.BiFunction<[ActorMaterializer](../ActorMaterializer.html "class in akka.stream"),​[Attributes](../Attributes.html "class in akka.stream"),​[Flow](Flow.html "class in akka.stream.javadsl")<I,​O,​M>> factory)
		```
		
		Deprecated.
		Use 'fromMaterializer' instead. Since 2\.6\.0\.
		
		Defers the creation of a [`Flow`](Flow.html "class in akka.stream.javadsl") until materialization. The `factory` function
		 exposes `ActorMaterializer` which is going to be used during materialization and
		 `Attributes` of the [`Flow`](Flow.html "class in akka.stream.javadsl") returned by this method.
		- #### fromSinkAndSource
		
		
		
		```
		public <I,​O> [Flow](Flow.html "class in akka.stream.javadsl")<I,​O,​[NotUsed](../../NotUsed.html "class in akka")> fromSinkAndSource​([Graph](../Graph.html "interface in akka.stream")<[SinkShape](../SinkShape.html "class in akka.stream")<I>,​?> sink,
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
		public <I,​O,​M1,​M2,​M> [Flow](Flow.html "class in akka.stream.javadsl")<I,​O,​M> fromSinkAndSourceMat​([Graph](../Graph.html "interface in akka.stream")<[SinkShape](../SinkShape.html "class in akka.stream")<I>,​M1> sink,
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
		public <I,​O> [Flow](Flow.html "class in akka.stream.javadsl")<I,​O,​[NotUsed](../../NotUsed.html "class in akka")> fromSinkAndSourceCoupled​([Graph](../Graph.html "interface in akka.stream")<[SinkShape](../SinkShape.html "class in akka.stream")<I>,​?> sink,
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
		public <I,​O,​M1,​M2,​M> [Flow](Flow.html "class in akka.stream.javadsl")<I,​O,​M> fromSinkAndSourceCoupledMat​([Graph](../Graph.html "interface in akka.stream")<[SinkShape](../SinkShape.html "class in akka.stream")<I>,​M1> sink,
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
		public <I,​O,​M> [Flow](Flow.html "class in akka.stream.javadsl")<I,​O,​M> lazyInit​([Function](../../japi/function/Function.html "interface in akka.japi.function")<I,​java.util.concurrent.CompletionStage<[Flow](Flow.html "class in akka.stream.javadsl")<I,​O,​M>>> flowFactory,
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
		public <I,​O,​M> [Flow](Flow.html "class in akka.stream.javadsl")<I,​O,​java.util.concurrent.CompletionStage<java.util.Optional<M>>> lazyInitAsync​([Creator](../../japi/function/Creator.html "interface in akka.japi.function")<java.util.concurrent.CompletionStage<[Flow](Flow.html "class in akka.stream.javadsl")<I,​O,​M>>> flowFactory)
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
		public <I,​O,​M> [Flow](Flow.html "class in akka.stream.javadsl")<I,​O,​java.util.concurrent.CompletionStage<M>> completionStageFlow​(java.util.concurrent.CompletionStage<[Flow](Flow.html "class in akka.stream.javadsl")<I,​O,​M>> flow)
		```
		
		Turn a `CompletionStage` into a flow that will consume the values of the source when the future completes successfully.
		 If the `Future` is completed with a failure the stream is failed.
		 
		 The materialized completion stage value is completed with the materialized value of the future flow or failed with a
		 `NeverMaterializedException` if upstream fails or downstream cancels before the completion stage has completed.
		- #### lazyFlow
		
		
		
		```
		public <I,​O,​M> [Flow](Flow.html "class in akka.stream.javadsl")<I,​O,​java.util.concurrent.CompletionStage<M>> lazyFlow​([Creator](../../japi/function/Creator.html "interface in akka.japi.function")<[Flow](Flow.html "class in akka.stream.javadsl")<I,​O,​M>> create)
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
		public <I,​O,​M> [Flow](Flow.html "class in akka.stream.javadsl")<I,​O,​java.util.concurrent.CompletionStage<M>> lazyCompletionStageFlow​([Creator](../../japi/function/Creator.html "interface in akka.japi.function")<java.util.concurrent.CompletionStage<[Flow](Flow.html "class in akka.stream.javadsl")<I,​O,​M>>> create)
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
		public <In,​SuperOut,​Out extends SuperOut,​M> [Flow](Flow.html "class in akka.stream.javadsl")<In,​SuperOut,​M> upcast​([Flow](Flow.html "class in akka.stream.javadsl")<In,​Out,​M> flow)
		```
		
		Upcast a stream of elements to a stream of supertypes of that element. Useful in combination with
		 fan\-in operators where you do not want to pay the cost of casting each element in a `map`.
		 
		
		Returns:
		A flow that accepts `In` and outputs elements of the super type
		- #### flattenOptional
		
		
		
		```
		public <Out,​In extends java.util.Optional<Out>> [Flow](Flow.html "class in akka.stream.javadsl")<In,​Out,​[NotUsed](../../NotUsed.html "class in akka")> flattenOptional()
		```
		
		Collect the value of `Optional` from the elements passing through this flow, empty `Optional` is filtered out.
		 
		 Adheres to the `ActorAttributes.SupervisionStrategy` attribute.
		 
		
		
		 '''Emits when''' the current `Optional`'s value is present.
		 
		
		
		 '''Backpressures when''' the value of the current `Optional` is present and downstream backpressures
		 
		
		
		 '''Completes when''' upstream completes
		 
		
		
		 '''Cancels when''' downstream cancels
		 \*

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

- https://doc.akka.io/japi/akka/2.10/akka/NotUsed.html
- https://doc.akka.io/japi/akka/2.10/akka/japi/Pair.html
- https://doc.akka.io/japi/akka/2.10/akka/japi/function/Creator.html
- https://doc.akka.io/japi/akka/2.10/akka/japi/function/Function.html
- https://doc.akka.io/japi/akka/2.10/akka/japi/function/Function2.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/ActorMaterializer.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/Attributes.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/FlowShape.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/Graph.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/Materializer.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/SinkShape.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/SourceShape.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/javadsl/Flow$.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/javadsl/Flow.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/javadsl/Source.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/javadsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/2.10/akka/stream/javadsl/Flow$.html](https://doc.akka.io/japi/akka/2.10/akka/stream/javadsl/Flow$.html)*