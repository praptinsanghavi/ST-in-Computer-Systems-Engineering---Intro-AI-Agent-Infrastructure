---
description: Akka 2.10.11 - akka.stream.javadsl.Flow
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:23:41Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/stream/javadsl/Flow.html
title: Akka 2.10.11 - akka.stream.javadsl.Flow
---

# Akka 2.10.11 - akka.stream.javadsl.Flow

> **Summary:** Akka 2.10.11 - akka.stream.javadsl.Flow

## Content

Akka2\.10\.11 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/stream/index.html "Permalink")  package [stream](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/stream/javadsl/index.html "Permalink")  package [javadsl](index.html)Definition Classes[stream](../index.html)
- [AsPublisher](AsPublisher.html)
- [Balance](Balance$.html "Fan-out the stream to several streams.")
- [BidiFlow](BidiFlow.html)
- [Broadcast](Broadcast$.html "Fan-out the stream to several streams.")
- [BroadcastHub](BroadcastHub$.html "A BroadcastHub is a special streaming hub that is able to broadcast streamed elements to a dynamic set of consumers.")
- [Compression](Compression$.html)
- [Concat](Concat$.html "Takes two streams and outputs an output stream formed from the two input streams by consuming one stream first emitting all of its elements, then consuming the second stream emitting all of its elements.")
- [DelayStrategy](DelayStrategy.html "Allows to manage delay and can be stateful to compute delay for any sequence of elements, all elements go through nextDelay() updating state and returning delay for each element")
- [FileIO](FileIO$.html "Java API: Factories to create sinks and sources from files")
- Flow
- [FlowWithContext](FlowWithContext.html "A flow that provides operations which automatically propagate the context of an element.")
- [Framing](Framing$.html)
- [FramingTruncation](FramingTruncation.html "Determines mode in which Framing operates.")
- [GraphDSL](GraphDSL$.html)
- [JavaFlowSupport](JavaFlowSupport.html "For use only with JDK 9+.")
- [JsonFraming](JsonFraming$.html "Provides JSON framing operators that can separate valid JSON objects from incoming akka.util.ByteString objects.")
- [Keep](Keep$.html)
- [Merge](Merge$.html "Merge several streams, taking elements as they arrive from input streams (picking randomly when several have elements ready).")
- [MergeHub](MergeHub$.html "A MergeHub is a special streaming hub that is able to collect streamed elements from a dynamic set of producers.")
- [MergeLatest](MergeLatest$.html "MergeLatest joins elements from N input streams into stream of lists of size N.")
- [MergePreferred](MergePreferred$.html "Merge several streams, taking elements as they arrive from input streams (picking from preferred when several have elements ready).")
- [MergePrioritized](MergePrioritized$.html "Merge several streams, taking elements as they arrive from input streams (picking from prioritized once when several have elements ready).")
- [MergeSequence](MergeSequence$.html "Takes multiple streams whose elements in aggregate have a defined linear sequence with difference 1, starting at 0, and outputs a single stream containing these elements, in order.")
- [Partition](Partition$.html "Fan-out the stream to several streams.")
- [PartitionHub](PartitionHub$.html "A PartitionHub is a special streaming hub that is able to route streamed elements to a dynamic set of consumers.")
- [RestartFlow](RestartFlow$.html "A RestartFlow wraps a Flow that gets restarted when it completes or fails.")
- [RestartSink](RestartSink$.html "A RestartSink wraps a Sink that gets restarted when it completes or fails.")
- [RestartSource](RestartSource$.html "A RestartSource wraps a Source that gets restarted when it completes or fails.")
- [RestartSourceWithContext](RestartSourceWithContext$.html "A RestartSourceWithContext wraps a SourceWithContext that gets restarted when it completes or fails.")
- [RetryFlow](RetryFlow$.html)
- [RunnableGraph](RunnableGraph.html "Java API")
- [Sink](Sink.html "Java API")
- [SinkQueue](SinkQueue.html "This trait allows to have a queue as a sink for a stream.")
- [SinkQueueWithCancel](SinkQueueWithCancel.html "This trait adds cancel support to SinkQueue.")
- [Source](Source.html "Java API")
- [SourceQueue](SourceQueue.html "This trait allows to have a queue as a data source for some stream.")
- [SourceQueueWithComplete](SourceQueueWithComplete.html "This trait adds completion support to SourceQueue.")
- [SourceWithContext](SourceWithContext.html "A source that provides operations which automatically propagate the context of an element.")
- [StreamConverters](StreamConverters$.html "Converters for interacting with the blocking java.io streams APIs and Java 8 Streams")
- [StreamRefs](StreamRefs$.html "Factories for creating stream refs.")
- [SubFlow](SubFlow.html "A “stream of streams” sub-flow of data elements, e.g.")
- [SubSource](SubSource.html "A “stream of streams” sub-flow of data elements, e.g.")
- [TLS](TLS$.html "Stream cipher support based upon JSSE.")
- [TLSPlacebo](TLSPlacebo$.html "This object holds simple wrapping akka.stream.scaladsl.BidiFlow implementations that can be used instead of TLS when no encryption is desired.")
- [Tcp](Tcp.html)
- [ThrottleControl](ThrottleControl.html "Control the throttle rate from the outside of the stream, or share a common throttle rate across several streams.")
- [Unzip](Unzip$.html "Takes a stream of pair elements and splits each pair to two output streams.")
- [UnzipWith](UnzipWith$.html "Split one stream into several streams using a splitting function.")
- [Zip](Zip$.html "Combine the elements of 2 streams into a stream of tuples.")
- [ZipLatest](ZipLatest$.html "Combine the elements of 2 streams into a stream of tuples, picking always the latest element of each.")
- [ZipLatestWith](ZipLatestWith$.html "Combine the elements of multiple streams into a stream of combined elements using a combiner function, picking always the latest of the elements of each source.")
- [ZipN](ZipN$.html "Combine the elements of multiple streams into a stream of lists.")
- [ZipWith](ZipWith$.html "Combine the elements of multiple streams into a stream of combined elements using a combiner function.")
- [ZipWithN](ZipWithN$.html "Combine the elements of multiple streams into a stream of lists using a combiner function.")
[c](Flow$.html "See companion object")[akka](../../index.html).[stream](../index.html).[javadsl](index.html)

# [Flow](Flow$.html "See companion object")[**](../../../akka/stream/javadsl/Flow.html "Permalink")

### Companion [object Flow](Flow$.html "See companion object")

#### final  class Flow\[In, Out, Mat] extends [Graph](../Graph.html)\[[FlowShape](../FlowShape.html)\[In, Out], Mat]

A `Flow` is a set of stream processing steps that has one open input and one open output.

Source[Flow.scala](https://github.com/akka/akka-core/tree/v2.10.11/akka-stream/src/main/scala/akka/stream/javadsl/Flow.scala#L398)Linear Supertypes[Graph](../Graph.html)\[[FlowShape](../FlowShape.html)\[In, Out], Mat], [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Flow
2. Graph
3. AnyRef
4. Any
Implicitly  
1. by GraphMapMatVal
2. by any2stringadd
3. by StringFormat
4. by Ensuring
5. by ArrowAssoc
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Instance Constructors

1. [**](../../../akka/stream/javadsl/Flow.html#<init>(delegate:akka.stream.scaladsl.Flow[In,Out,Mat]):akka.stream.javadsl.Flow[In,Out,Mat] "Permalink")  new Flow(delegate: [scaladsl.Flow](../scaladsl/Flow.html)\[In, Out, Mat])
### Type Members

1. [**](../../../akka/stream/javadsl/Flow.html#Shape=S@scala.annotation.unchecked.uncheckedVariance "Permalink")  type Shape \= [FlowShape](../FlowShape.html)\[In, Out]Type\-level accessor for the shape parameter of this graph.

Type\-level accessor for the shape parameter of this graph.

Definition Classes[Graph](../Graph.html)
### Value Members

1. [**](../../../akka/stream/javadsl/Flow.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/stream/javadsl/Flow.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/stream/javadsl/Flow.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from Flow\[In, Out, Mat] toany2stringadd\[Flow\[In, Out, Mat]] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/stream/javadsl/Flow.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (Flow\[In, Out, Mat], B)ImplicitThis member is added by an implicit conversion from Flow\[In, Out, Mat] toArrowAssoc\[Flow\[In, Out, Mat]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/stream/javadsl/Flow.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/stream/javadsl/Flow.html#addAttributes(attr:akka.stream.Attributes):akka.stream.javadsl.Flow[In,Out,Mat] "Permalink")  def addAttributes(attr: [Attributes](../Attributes.html)): Flow\[In, Out, Mat]Add the given attributes to this Flow.

Add the given attributes to this Flow. If the specific attribute was already present
on this graph this means the added attribute will be more specific than the existing one.
If this Flow is a composite of multiple graphs, new attributes on the composite will be
less specific than attributes set directly on the individual graphs of the composite.

Definition ClassesFlow → [Graph](../Graph.html)
7. [**](../../../akka/stream/javadsl/Flow.html#aggregateWithBoundary[Agg,Emit](allocate:java.util.function.Supplier[Agg])(aggregate:akka.japi.function.Function2[Agg,Out,akka.japi.Pair[Agg,Boolean]],harvest:akka.japi.function.Function[Agg,Emit],emitOnTimer:akka.japi.Pair[java.util.function.Predicate[Agg],java.time.Duration]):akka.stream.javadsl.Flow[In,Emit,Mat] "Permalink")  def aggregateWithBoundary\[Agg, Emit](allocate: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[Agg])(aggregate: [Function2](../../japi/function/Function2.html)\[Agg, Out, [Pair](../../japi/Pair.html)\[Agg, [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)]], harvest: [Function](../../japi/function/Function.html)\[Agg, Emit], emitOnTimer: [Pair](../../japi/Pair.html)\[[Predicate](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Predicate.html#java.util.function.Predicate)\[Agg], [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration)]): Flow\[In, Emit, Mat]Aggregate input elements into an arbitrary data structure that can be completed and emitted downstream
when custom condition is met which can be triggered by aggregate or timer.

Aggregate input elements into an arbitrary data structure that can be completed and emitted downstream
when custom condition is met which can be triggered by aggregate or timer.
It can be thought of a more general [groupedWeightedWithin](#groupedWeightedWithin(maxWeight:Long,maxNumber:Int,costFn:akka.japi.function.Function[Out,Long],duration:java.time.Duration):akka.stream.javadsl.Flow[In,java.util.List[Out],Mat]).

**Emits when** the aggregation function decides the aggregate is complete or the timer function returns true

**Backpressures when** downstream backpressures and the aggregate is complete

**Completes when** upstream completes and the last aggregate has been emitted downstream

**Cancels when** downstream cancels

allocateallocate the initial data structure for aggregated elements

aggregateupdate the aggregated elements, return true if ready to emit after update.

harvestthis is invoked before emit within the current stage/operator

emitOnTimerdecide whether the current aggregated elements can be emitted, the custom function is invoked on every interval

Annotations@[ApiMayChange](../../annotation/ApiMayChange.html)()
8. [**](../../../akka/stream/javadsl/Flow.html#alsoTo(that:akka.stream.Graph[akka.stream.SinkShape[Out],_]):akka.stream.javadsl.Flow[In,Out,Mat] "Permalink")  def alsoTo(that: [Graph](../Graph.html)\[[SinkShape](../SinkShape.html)\[Out], \_]): Flow\[In, Out, Mat]Attaches the given [Sink](Sink.html) to this Flow, meaning that elements that passes
through will also be sent to the [Sink](Sink.html).

Attaches the given [Sink](Sink.html) to this Flow, meaning that elements that passes
through will also be sent to the [Sink](Sink.html).

It is similar to [\#wireTap](#wireTap(that:akka.stream.Graph[akka.stream.SinkShape[Out],_]):akka.stream.javadsl.Flow[In,Out,Mat]) but will backpressure instead of dropping elements when the given [Sink](Sink.html) is not ready.

**Emits when** element is available and demand exists both from the Sink and the downstream.

**Backpressures when** downstream or Sink backpressures

**Completes when** upstream completes

**Cancels when** downstream or Sink cancels
9. [**](../../../akka/stream/javadsl/Flow.html#alsoToAll(those:akka.stream.Graph[akka.stream.SinkShape[Out],_]*):akka.stream.javadsl.Flow[In,Out,Mat] "Permalink")  def alsoToAll(those: [Graph](../Graph.html)\[[SinkShape](../SinkShape.html)\[Out], \_]\*): Flow\[In, Out, Mat]Attaches the given [Sink](Sink.html)s to this Flow, meaning that elements that passes
through will also be sent to all those [Sink](Sink.html)s.

Attaches the given [Sink](Sink.html)s to this Flow, meaning that elements that passes
through will also be sent to all those [Sink](Sink.html)s.

It is similar to [\#wireTap](#wireTap(that:akka.stream.Graph[akka.stream.SinkShape[Out],_]):akka.stream.javadsl.Flow[In,Out,Mat]) but will backpressure instead of dropping elements when the given [Sink](Sink.html)s is not ready.

**Emits when** element is available and demand exists both from the Sinks and the downstream.

**Backpressures when** downstream or any of the [Sink](Sink.html)s backpressures

**Completes when** upstream completes

**Cancels when** downstream or any of the [Sink](Sink.html)s cancels

Annotations@varargs() @SafeVarargs()
10. [**](../../../akka/stream/javadsl/Flow.html#alsoToMat[M2,M3](that:akka.stream.Graph[akka.stream.SinkShape[Out],M2],matF:akka.japi.function.Function2[Mat,M2,M3]):akka.stream.javadsl.Flow[In,Out,M3] "Permalink")  def alsoToMat\[M2, M3](that: [Graph](../Graph.html)\[[SinkShape](../SinkShape.html)\[Out], M2], matF: [Function2](../../japi/function/Function2.html)\[Mat, M2, M3]): Flow\[In, Out, M3]Attaches the given [Sink](Sink.html) to this Flow, meaning that elements that passes
through will also be sent to the [Sink](Sink.html).

Attaches the given [Sink](Sink.html) to this Flow, meaning that elements that passes
through will also be sent to the [Sink](Sink.html).

It is similar to [\#wireTapMat](#wireTapMat[M2,M3](that:akka.stream.Graph[akka.stream.SinkShape[Out],M2],matF:akka.japi.function.Function2[Mat,M2,M3]):akka.stream.javadsl.Flow[In,Out,M3]) but will backpressure instead of dropping elements when the given [Sink](Sink.html) is not ready.

It is recommended to use the internally optimized `Keep.left` and `Keep.right` combiners
where appropriate instead of manually writing functions that pass through one of the values.

See also[\#alsoTo](#alsoTo(that:akka.stream.Graph[akka.stream.SinkShape[Out],_]):akka.stream.javadsl.Flow[In,Out,Mat])
11. [**](../../../akka/stream/javadsl/Flow.html#asFlowWithContext[U,CtxU,CtxOut](collapseContext:akka.japi.function.Function2[U,CtxU,In],extractContext:akka.japi.function.Function[Out,CtxOut]):akka.stream.javadsl.FlowWithContext[U,CtxU,Out,CtxOut,Mat] "Permalink")  def asFlowWithContext\[U, CtxU, CtxOut](collapseContext: [Function2](../../japi/function/Function2.html)\[U, CtxU, In], extractContext: [Function](../../japi/function/Function.html)\[Out, CtxOut]): [FlowWithContext](FlowWithContext.html)\[U, CtxU, Out, CtxOut, Mat]Turns a Flow into a FlowWithContext which manages a context per element along a stream.

Turns a Flow into a FlowWithContext which manages a context per element along a stream.

collapseContextturn each incoming pair of element and context value into an element of this Flow

extractContextturn each outgoing element of this Flow into an outgoing context value
12. [**](../../../akka/stream/javadsl/Flow.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
13. [**](../../../akka/stream/javadsl/Flow.html#asScala:akka.stream.scaladsl.Flow[In,Out,Mat] "Permalink")  def asScala: [scaladsl.Flow](../scaladsl/Flow.html)\[In, Out, Mat]Converts this Flow to its Scala DSL counterpart
14. [**](../../../akka/stream/javadsl/Flow.html#ask[S](parallelism:Int,ref:akka.actor.ActorRef,mapTo:Class[S],timeout:akka.util.Timeout):akka.stream.javadsl.Flow[In,S,Mat] "Permalink")  def ask\[S](parallelism: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), ref: [ActorRef](../../actor/ActorRef.html), mapTo: Class\[S], timeout: [Timeout](../../util/Timeout.html)): Flow\[In, S, Mat]Use the `ask` pattern to send a request\-reply message to the target `ref` actor.

Use the `ask` pattern to send a request\-reply message to the target `ref` actor.
If any of the asks times out it will fail the stream with a [akka.pattern.AskTimeoutException](../../pattern/AskTimeoutException.html).

The `mapTo` class parameter is used to cast the incoming responses to the expected response type.

Similar to the plain ask pattern, the target actor is allowed to reply with `akka.util.Status`.
An `akka.util.Status#Failure` will cause the operator to fail with the cause carried in the `Failure` message.

Parallelism limits the number of how many asks can be "in flight" at the same time.
Please note that the elements emitted by this operator are in\-order with regards to the asks being issued
(i.e. same behaviour as mapAsync).

The operator fails with an [akka.stream.WatchedActorTerminatedException](../WatchedActorTerminatedException.html) if the target actor is terminated.

Adheres to the [ActorAttributes.SupervisionStrategy](../ActorAttributes$$SupervisionStrategy.html) attribute.

**Emits when** any of the CompletionStages returned by the provided function complete

**Backpressures when** the number of futures reaches the configured parallelism and the downstream backpressures

**Completes when** upstream completes and all futures have been completed and all elements have been emitted

**Fails when** the passed in actor terminates, or a timeout is exceeded in any of the asks performed

**Cancels when** downstream cancels
15. [**](../../../akka/stream/javadsl/Flow.html#ask[S](ref:akka.actor.ActorRef,mapTo:Class[S],timeout:akka.util.Timeout):akka.stream.javadsl.Flow[In,S,Mat] "Permalink")  def ask\[S](ref: [ActorRef](../../actor/ActorRef.html), mapTo: Class\[S], timeout: [Timeout](../../util/Timeout.html)): Flow\[In, S, Mat]Use the `ask` pattern to send a request\-reply message to the target `ref` actor.

Use the `ask` pattern to send a request\-reply message to the target `ref` actor.
If any of the asks times out it will fail the stream with a [akka.pattern.AskTimeoutException](../../pattern/AskTimeoutException.html).

The `mapTo` class parameter is used to cast the incoming responses to the expected response type.

Similar to the plain ask pattern, the target actor is allowed to reply with `akka.util.Status`.
An `akka.util.Status#Failure` will cause the operator to fail with the cause carried in the `Failure` message.

Defaults to parallelism of 2 messages in flight, since while one ask message may be being worked on, the second one
still be in the mailbox, so defaulting to sending the second one a bit earlier than when first ask has replied maintains
a slightly healthier throughput.

The operator fails with an [akka.stream.WatchedActorTerminatedException](../WatchedActorTerminatedException.html) if the target actor is terminated.

Adheres to the [ActorAttributes.SupervisionStrategy](../ActorAttributes$$SupervisionStrategy.html) attribute.

**Emits when** any of the CompletionStages returned by the provided function complete

**Backpressures when** the number of futures reaches the configured parallelism and the downstream backpressures

**Completes when** upstream completes and all futures have been completed and all elements have been emitted

**Fails when** the passed in actor terminates, or a timeout is exceeded in any of the asks performed

**Cancels when** downstream cancels
16. [**](../../../akka/stream/javadsl/Flow.html#async(dispatcher:String,inputBufferSize:Int):akka.stream.javadsl.Flow[In,Out,Mat] "Permalink")  def async(dispatcher: String, inputBufferSize: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): Flow\[In, Out, Mat]Put an asynchronous boundary around this `Flow`

Put an asynchronous boundary around this `Flow`

dispatcherRun the graph on this dispatcher

inputBufferSizeSet the input buffer to this size for the graph

Definition ClassesFlow → [Graph](../Graph.html)
17. [**](../../../akka/stream/javadsl/Flow.html#async(dispatcher:String):akka.stream.javadsl.Flow[In,Out,Mat] "Permalink")  def async(dispatcher: String): Flow\[In, Out, Mat]Put an asynchronous boundary around this `Flow`

Put an asynchronous boundary around this `Flow`

dispatcherRun the graph on this dispatcher

Definition ClassesFlow → [Graph](../Graph.html)
18. [**](../../../akka/stream/javadsl/Flow.html#async:akka.stream.javadsl.Flow[In,Out,Mat] "Permalink")  def async: Flow\[In, Out, Mat]Put an asynchronous boundary around this `Flow`

Put an asynchronous boundary around this `Flow`

Definition ClassesFlow → [Graph](../Graph.html)
19. [**](../../../akka/stream/javadsl/Flow.html#backpressureTimeout(timeout:java.time.Duration):akka.stream.javadsl.Flow[In,Out,Mat] "Permalink")  def backpressureTimeout(timeout: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration)): Flow\[In, Out, Mat]If the time between the emission of an element and the following downstream demand exceeds the provided timeout,
the stream is failed with a [akka.stream.BackpressureTimeoutException](../BackpressureTimeoutException.html).

If the time between the emission of an element and the following downstream demand exceeds the provided timeout,
the stream is failed with a [akka.stream.BackpressureTimeoutException](../BackpressureTimeoutException.html). The timeout is checked periodically,
so the resolution of the check is one period (equals to timeout value).

**Emits when** upstream emits an element

**Backpressures when** downstream backpressures

**Completes when** upstream completes or fails if timeout elapses between element emission and downstream demand.

**Cancels when** downstream cancels
20. [**](../../../akka/stream/javadsl/Flow.html#batch[S](max:Long,seed:akka.japi.function.Function[Out,S],aggregate:akka.japi.function.Function2[S,Out,S]):akka.stream.javadsl.Flow[In,S,Mat] "Permalink")  def batch\[S](max: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), seed: [Function](../../japi/function/Function.html)\[Out, S], aggregate: [Function2](../../japi/function/Function2.html)\[S, Out, S]): Flow\[In, S, Mat]Allows a faster upstream to progress independently of a slower subscriber by aggregating elements into batches
until the subscriber is ready to accept them.

Allows a faster upstream to progress independently of a slower subscriber by aggregating elements into batches
until the subscriber is ready to accept them. For example a batch step might store received elements in
an array up to the allowed max limit if the upstream publisher is faster.

This element only rolls up elements if the upstream is faster, but if the downstream is faster it will not
duplicate elements.

Adheres to the [ActorAttributes.SupervisionStrategy](../ActorAttributes$$SupervisionStrategy.html) attribute.

**Emits when** downstream stops backpressuring and there is an aggregated element available

**Backpressures when** there are `max` batched elements and 1 pending element and downstream backpressures

**Completes when** upstream completes and there is no batched/pending element waiting

**Cancels when** downstream cancels

See also [Flow.conflate](#conflate(aggregate:akka.japi.function.Function2[Out,Out,Out]):akka.stream.javadsl.Flow[In,Out,Mat]), [Flow.batchWeighted](#batchWeighted[S](max:Long,costFn:akka.japi.function.Function[Out,Long],seed:akka.japi.function.Function[Out,S],aggregate:akka.japi.function.Function2[S,Out,S]):akka.stream.javadsl.Flow[In,S,Mat])

maxmaximum number of elements to batch before backpressuring upstream (must be positive non\-zero)

seedProvides the first state for a batched value using the first unconsumed element as a start

aggregateTakes the currently batched value and the current pending element to produce a new aggregate
21. [**](../../../akka/stream/javadsl/Flow.html#batchWeighted[S](max:Long,costFn:akka.japi.function.Function[Out,Long],seed:akka.japi.function.Function[Out,S],aggregate:akka.japi.function.Function2[S,Out,S]):akka.stream.javadsl.Flow[In,S,Mat] "Permalink")  def batchWeighted\[S](max: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), costFn: [Function](../../japi/function/Function.html)\[Out, [Long](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Long.html#java.lang.Long)], seed: [Function](../../japi/function/Function.html)\[Out, S], aggregate: [Function2](../../japi/function/Function2.html)\[S, Out, S]): Flow\[In, S, Mat]Allows a faster upstream to progress independently of a slower subscriber by aggregating elements into batches
until the subscriber is ready to accept them.

Allows a faster upstream to progress independently of a slower subscriber by aggregating elements into batches
until the subscriber is ready to accept them. For example a batch step might concatenate `ByteString`
elements up to the allowed max limit if the upstream publisher is faster.

This element only rolls up elements if the upstream is faster, but if the downstream is faster it will not
duplicate elements.

Batching will apply for all elements, even if a single element cost is greater than the total allowed limit.
In this case, previous batched elements will be emitted, then the "heavy" element will be emitted (after
being applied with the `seed` function) without batching further elements with it, and then the rest of the
incoming elements are batched.

**Emits when** downstream stops backpressuring and there is a batched element available

**Backpressures when** there are `max` weighted batched elements \+ 1 pending element and downstream backpressures

**Completes when** upstream completes and there is no batched/pending element waiting

**Cancels when** downstream cancels

See also [Flow.conflate](#conflate(aggregate:akka.japi.function.Function2[Out,Out,Out]):akka.stream.javadsl.Flow[In,Out,Mat]), [Flow.batch](#batch[S](max:Long,seed:akka.japi.function.Function[Out,S],aggregate:akka.japi.function.Function2[S,Out,S]):akka.stream.javadsl.Flow[In,S,Mat])

maxmaximum weight of elements to batch before backpressuring upstream (must be positive non\-zero)

costFna function to compute a single element weight

seedProvides the first state for a batched value using the first unconsumed element as a start

aggregateTakes the currently batched value and the current pending element to produce a new batch
22. [**](../../../akka/stream/javadsl/Flow.html#buffer(size:Int,overflowStrategy:akka.stream.OverflowStrategy):akka.stream.javadsl.Flow[In,Out,Mat] "Permalink")  def buffer(size: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), overflowStrategy: [OverflowStrategy](../OverflowStrategy.html)): Flow\[In, Out, Mat]Adds a fixed size buffer in the flow that allows to store elements from a faster upstream until it becomes full.

Adds a fixed size buffer in the flow that allows to store elements from a faster upstream until it becomes full.
Depending on the defined [akka.stream.OverflowStrategy](../OverflowStrategy.html) it might drop elements or backpressure the upstream if
there is no space available

**Emits when** downstream stops backpressuring and there is a pending element in the buffer

**Backpressures when** downstream backpressures or depending on OverflowStrategy:

	- Backpressure \- backpressures when buffer is full
	- DropHead, DropTail, DropBuffer \- never backpressures
	- Fail \- fails the stream if buffer gets full**Completes when** upstream completes and buffered elements have been drained

**Cancels when** downstream cancels

sizeThe size of the buffer in element count

overflowStrategyStrategy that is used when incoming elements cannot fit inside the buffer
23. [**](../../../akka/stream/javadsl/Flow.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
24. [**](../../../akka/stream/javadsl/Flow.html#collect[T](pf:PartialFunction[Out,T]):akka.stream.javadsl.Flow[In,T,Mat] "Permalink")  def collect\[T](pf: [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[Out, T]): Flow\[In, T, Mat]Transform this stream by applying the given partial function to each of the elements
on which the function is defined as they pass through this processing step.

Transform this stream by applying the given partial function to each of the elements
on which the function is defined as they pass through this processing step.
Non\-matching elements are filtered out.

Adheres to the [ActorAttributes.SupervisionStrategy](../ActorAttributes$$SupervisionStrategy.html) attribute.

**Emits when** the provided partial function is defined for the element

**Backpressures when** the partial function is defined for the element and downstream backpressures

**Completes when** upstream completes

**Cancels when** downstream cancels
25. [**](../../../akka/stream/javadsl/Flow.html#collectType[T](clazz:Class[T]):akka.stream.javadsl.Flow[In,T,Mat] "Permalink")  def collectType\[T](clazz: Class\[T]): Flow\[In, T, Mat]Transform this stream by testing the type of each of the elements
on which the element is an instance of the provided type as they pass through this processing step.

Transform this stream by testing the type of each of the elements
on which the element is an instance of the provided type as they pass through this processing step.
Non\-matching elements are filtered out.

Adheres to the [ActorAttributes.SupervisionStrategy](../ActorAttributes$$SupervisionStrategy.html) attribute.

**Emits when** the element is an instance of the provided type

**Backpressures when** the element is an instance of the provided type and downstream backpressures

**Completes when** upstream completes

**Cancels when** downstream cancels
26. [**](../../../akka/stream/javadsl/Flow.html#completionTimeout(timeout:java.time.Duration):akka.stream.javadsl.Flow[In,Out,Mat] "Permalink")  def completionTimeout(timeout: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration)): Flow\[In, Out, Mat]If the completion of the stream does not happen until the provided timeout, the stream is failed
with a [akka.stream.CompletionTimeoutException](../CompletionTimeoutException.html).

If the completion of the stream does not happen until the provided timeout, the stream is failed
with a [akka.stream.CompletionTimeoutException](../CompletionTimeoutException.html).

**Emits when** upstream emits an element

**Backpressures when** downstream backpressures

**Completes when** upstream completes or fails if timeout elapses before upstream completes

**Cancels when** downstream cancels
27. [**](../../../akka/stream/javadsl/Flow.html#concat[M](that:akka.stream.Graph[akka.stream.SourceShape[Out],M]):akka.stream.javadsl.Flow[In,Out,Mat] "Permalink")  def concat\[M](that: [Graph](../Graph.html)\[[SourceShape](../SourceShape.html)\[Out], M]): Flow\[In, Out, Mat]Concatenate the given [Source](Source.html) to this Flow, meaning that once this
Flow’s input is exhausted and all result elements have been generated,
the Source’s elements will be produced.

Concatenate the given [Source](Source.html) to this Flow, meaning that once this
Flow’s input is exhausted and all result elements have been generated,
the Source’s elements will be produced.

Note that the [Source](Source.html) is materialized together with this Flow and is "detached" meaning it will
in effect behave as a one element buffer in front of both the sources, that eagerly demands an element on start
(so it can not be combined with `Source.lazy` to defer materialization of `that`).

The second source is then kept from producing elements by asserting back\-pressure until its time comes.

When needing a concat operator that is not detached use [\#concatLazy](#concatLazy[M](that:akka.stream.Graph[akka.stream.SourceShape[Out],M]):akka.stream.javadsl.Flow[In,Out,Mat])

**Emits when** element is available from current stream or from the given [Source](Source.html) when current is completed

**Backpressures when** downstream backpressures

**Completes when** given [Source](Source.html) completes

**Cancels when** downstream cancels
28. [**](../../../akka/stream/javadsl/Flow.html#concatAllLazy(those:akka.stream.Graph[akka.stream.SourceShape[Out],_]*):akka.stream.javadsl.Flow[In,Out,Mat] "Permalink")  def concatAllLazy(those: [Graph](../Graph.html)\[[SourceShape](../SourceShape.html)\[Out], \_]\*): Flow\[In, Out, Mat]Concatenate the given [Source](Source.html)s to this Flow, meaning that once this
Flow’s input is exhausted and all result elements have been generated,
the Source’s elements will be produced.

Concatenate the given [Source](Source.html)s to this Flow, meaning that once this
Flow’s input is exhausted and all result elements have been generated,
the Source’s elements will be produced.

Note that the [Source](Source.html)s are materialized together with this Flow. If `lazy` materialization is what is needed
the operator can be combined with for example `Source.lazySource` to defer materialization of `that` until the
time when this source completes.

The second source is then kept from producing elements by asserting back\-pressure until its time comes.

For a concat operator that is detached, use [\#concat](#concat[M](that:akka.stream.Graph[akka.stream.SourceShape[Out],M]):akka.stream.javadsl.Flow[In,Out,Mat])

If this Flow gets upstream error \- no elements from the given [Source](Source.html)s will be pulled.

**Emits when** element is available from current stream or from the given [Source](Source.html)s when current is completed

**Backpressures when** downstream backpressures

**Completes when** given all those [Source](Source.html)s completes

**Cancels when** downstream cancels

Annotations@varargs() @SafeVarargs()
29. [**](../../../akka/stream/javadsl/Flow.html#concatLazy[M](that:akka.stream.Graph[akka.stream.SourceShape[Out],M]):akka.stream.javadsl.Flow[In,Out,Mat] "Permalink")  def concatLazy\[M](that: [Graph](../Graph.html)\[[SourceShape](../SourceShape.html)\[Out], M]): Flow\[In, Out, Mat]Concatenate the given [Source](Source.html) to this Flow, meaning that once this
Flow’s input is exhausted and all result elements have been generated,
the Source’s elements will be produced.

Concatenate the given [Source](Source.html) to this Flow, meaning that once this
Flow’s input is exhausted and all result elements have been generated,
the Source’s elements will be produced.

Note that the [Source](Source.html) is materialized together with this Flow. If `lazy` materialization is what is needed
the operator can be combined with for example `Source.lazySource` to defer materialization of `that` until the
time when this source completes.

The second source is then kept from producing elements by asserting back\-pressure until its time comes.

For a concat operator that is detached, use [\#concat](#concat[M](that:akka.stream.Graph[akka.stream.SourceShape[Out],M]):akka.stream.javadsl.Flow[In,Out,Mat])

If this Flow gets upstream error \- no elements from the given [Source](Source.html) will be pulled.

**Emits when** element is available from current stream or from the given [Source](Source.html) when current is completed

**Backpressures when** downstream backpressures

**Completes when** given [Source](Source.html) completes

**Cancels when** downstream cancels
30. [**](../../../akka/stream/javadsl/Flow.html#concatLazyMat[M,M2](that:akka.stream.Graph[akka.stream.SourceShape[Out],M],matF:akka.japi.function.Function2[Mat,M,M2]):akka.stream.javadsl.Flow[In,Out,M2] "Permalink")  def concatLazyMat\[M, M2](that: [Graph](../Graph.html)\[[SourceShape](../SourceShape.html)\[Out], M], matF: [Function2](../../japi/function/Function2.html)\[Mat, M, M2]): Flow\[In, Out, M2]Concatenate the given [Source](Source.html) to this Flow, meaning that once this
Flow’s input is exhausted and all result elements have been generated,
the Source’s elements will be produced.

Concatenate the given [Source](Source.html) to this Flow, meaning that once this
Flow’s input is exhausted and all result elements have been generated,
the Source’s elements will be produced.

Note that the [Source](Source.html) is materialized together with this Flow, if `lazy` materialization is what is needed
the operator can be combined with `Source.lazy` to defer materialization of `that`.

The second source is then kept from producing elements by asserting back\-pressure until its time comes.

For a concat operator that is detached, use [\#concatMat](#concatMat[M,M2](that:akka.stream.Graph[akka.stream.SourceShape[Out],M],matF:akka.japi.function.Function2[Mat,M,M2]):akka.stream.javadsl.Flow[In,Out,M2])

See also[\#concatLazy](#concatLazy[M](that:akka.stream.Graph[akka.stream.SourceShape[Out],M]):akka.stream.javadsl.Flow[In,Out,Mat]).
It is recommended to use the internally optimized `Keep.left` and `Keep.right` combiners
where appropriate instead of manually writing functions that pass through one of the values.
31. [**](../../../akka/stream/javadsl/Flow.html#concatMat[M,M2](that:akka.stream.Graph[akka.stream.SourceShape[Out],M],matF:akka.japi.function.Function2[Mat,M,M2]):akka.stream.javadsl.Flow[In,Out,M2] "Permalink")  def concatMat\[M, M2](that: [Graph](../Graph.html)\[[SourceShape](../SourceShape.html)\[Out], M], matF: [Function2](../../japi/function/Function2.html)\[Mat, M, M2]): Flow\[In, Out, M2]Concatenate the given [Source](Source.html) to this Flow, meaning that once this
Flow’s input is exhausted and all result elements have been generated,
the Source’s elements will be produced.

Concatenate the given [Source](Source.html) to this Flow, meaning that once this
Flow’s input is exhausted and all result elements have been generated,
the Source’s elements will be produced.

Note that the [Source](Source.html) is materialized together with this Flow and is "detached" meaning it will
in effect behave as a one element buffer in front of both the sources, that eagerly demands an element on start
(so it can not be combined with `Source.lazy` to defer materialization of `that`).

The second source is then kept from producing elements by asserting back\-pressure until its time comes.

When needing a concat operator that is not detached use [\#concatLazyMat](#concatLazyMat[M,M2](that:akka.stream.Graph[akka.stream.SourceShape[Out],M],matF:akka.japi.function.Function2[Mat,M,M2]):akka.stream.javadsl.Flow[In,Out,M2])

It is recommended to use the internally optimized `Keep.left` and `Keep.right` combiners
where appropriate instead of manually writing functions that pass through one of the values.

See also[\#concat](#concat[M](that:akka.stream.Graph[akka.stream.SourceShape[Out],M]):akka.stream.javadsl.Flow[In,Out,Mat])
32. [**](../../../akka/stream/javadsl/Flow.html#conflate(aggregate:akka.japi.function.Function2[Out,Out,Out]):akka.stream.javadsl.Flow[In,Out,Mat] "Permalink")  def conflate(aggregate: [Function2](../../japi/function/Function2.html)\[Out, Out, Out]): Flow\[In, Out, Mat]Allows a faster upstream to progress independently of a slower subscriber by conflating elements into a summary
until the subscriber is ready to accept them.

Allows a faster upstream to progress independently of a slower subscriber by conflating elements into a summary
until the subscriber is ready to accept them. For example a conflate step might average incoming numbers if the
upstream publisher is faster.

This version of conflate does not change the output type of the stream. See [Flow.conflateWithSeed](#conflateWithSeed[S](seed:akka.japi.function.Function[Out,S],aggregate:akka.japi.function.Function2[S,Out,S]):akka.stream.javadsl.Flow[In,S,Mat]) for a
more flexible version that can take a seed function and transform elements while rolling up.

This element only rolls up elements if the upstream is faster, but if the downstream is faster it will not
duplicate elements.

Adheres to the [ActorAttributes.SupervisionStrategy](../ActorAttributes$$SupervisionStrategy.html) attribute.

**Emits when** downstream stops backpressuring and there is a conflated element available

**Backpressures when** never

**Completes when** upstream completes

**Cancels when** downstream cancels

see also [Flow.conflateWithSeed](#conflateWithSeed[S](seed:akka.japi.function.Function[Out,S],aggregate:akka.japi.function.Function2[S,Out,S]):akka.stream.javadsl.Flow[In,S,Mat]) [Flow.batch](#batch[S](max:Long,seed:akka.japi.function.Function[Out,S],aggregate:akka.japi.function.Function2[S,Out,S]):akka.stream.javadsl.Flow[In,S,Mat]) [Flow.batchWeighted](#batchWeighted[S](max:Long,costFn:akka.japi.function.Function[Out,Long],seed:akka.japi.function.Function[Out,S],aggregate:akka.japi.function.Function2[S,Out,S]):akka.stream.javadsl.Flow[In,S,Mat])

aggregateTakes the currently aggregated value and the current pending element to produce a new aggregate
33. [**](../../../akka/stream/javadsl/Flow.html#conflateWithSeed[S](seed:akka.japi.function.Function[Out,S],aggregate:akka.japi.function.Function2[S,Out,S]):akka.stream.javadsl.Flow[In,S,Mat] "Permalink")  def conflateWithSeed\[S](seed: [Function](../../japi/function/Function.html)\[Out, S], aggregate: [Function2](../../japi/function/Function2.html)\[S, Out, S]): Flow\[In, S, Mat]Allows a faster upstream to progress independently of a slower subscriber by conflating elements into a summary
until the subscriber is ready to accept them.

Allows a faster upstream to progress independently of a slower subscriber by conflating elements into a summary
until the subscriber is ready to accept them. For example a conflate step might average incoming numbers if the
upstream publisher is faster.

This version of conflate allows to derive a seed from the first element and change the aggregated type to be
different than the input type. See [Flow.conflate](#conflate(aggregate:akka.japi.function.Function2[Out,Out,Out]):akka.stream.javadsl.Flow[In,Out,Mat]) for a simpler version that does not change types.

This element only rolls up elements if the upstream is faster, but if the downstream is faster it will not
duplicate elements.

Adheres to the [ActorAttributes.SupervisionStrategy](../ActorAttributes$$SupervisionStrategy.html) attribute.

**Emits when** downstream stops backpressuring and there is a conflated element available

**Backpressures when** never

**Completes when** upstream completes

**Cancels when** downstream cancels

see also [Flow.conflate](#conflate(aggregate:akka.japi.function.Function2[Out,Out,Out]):akka.stream.javadsl.Flow[In,Out,Mat]) [Flow.batch](#batch[S](max:Long,seed:akka.japi.function.Function[Out,S],aggregate:akka.japi.function.Function2[S,Out,S]):akka.stream.javadsl.Flow[In,S,Mat]) [Flow.batchWeighted](#batchWeighted[S](max:Long,costFn:akka.japi.function.Function[Out,Long],seed:akka.japi.function.Function[Out,S],aggregate:akka.japi.function.Function2[S,Out,S]):akka.stream.javadsl.Flow[In,S,Mat])

seedProvides the first state for a conflated value using the first unconsumed element as a start

aggregateTakes the currently aggregated value and the current pending element to produce a new aggregate
34. [**](../../../akka/stream/javadsl/Flow.html#contramap[In2](f:akka.japi.function.Function[In2,In]):akka.stream.javadsl.Flow[In2,Out,Mat] "Permalink")  def contramap\[In2](f: [Function](../../japi/function/Function.html)\[In2, In]): Flow\[In2, Out, Mat]Transform this Flow by applying a function to each \*incoming\* upstream element before
it is passed to the Flow

Transform this Flow by applying a function to each \*incoming\* upstream element before
it is passed to the Flow

**Backpressures when** original Flow backpressures

**Cancels when** original Flow cancels
35. [**](../../../akka/stream/javadsl/Flow.html#delay(of:java.time.Duration,strategy:akka.stream.DelayOverflowStrategy):akka.stream.javadsl.Flow[In,Out,Mat] "Permalink")  def delay(of: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration), strategy: [DelayOverflowStrategy](../DelayOverflowStrategy.html)): Flow\[In, Out, Mat]Shifts elements emission in time by a specified amount.

Shifts elements emission in time by a specified amount. It allows to store elements
in internal buffer while waiting for next element to be emitted. Depending on the defined
[akka.stream.DelayOverflowStrategy](../DelayOverflowStrategy.html) it might drop elements or backpressure the upstream if
there is no space available in the buffer.

Delay precision is 10ms to avoid unnecessary timer scheduling cycles

Internal buffer has default capacity 16\. You can set buffer size by calling `addAttributes(inputBuffer)`

**Emits when** there is a pending element in the buffer and configured time for this element elapsed
 \* EmitEarly \- strategy do not wait to emit element if buffer is full

**Backpressures when** depending on OverflowStrategy
 \* Backpressure \- backpressures when buffer is full
 \* DropHead, DropTail, DropBuffer \- never backpressures
 \* Fail \- fails the stream if buffer gets full

**Completes when** upstream completes and buffered elements have been drained

**Cancels when** downstream cancels

oftime to shift all messages

strategyStrategy that is used when incoming elements cannot fit inside the buffer
36. [**](../../../akka/stream/javadsl/Flow.html#delayWith(delayStrategySupplier:java.util.function.Supplier[akka.stream.javadsl.DelayStrategy[Out]],overFlowStrategy:akka.stream.DelayOverflowStrategy):akka.stream.javadsl.Flow[In,Out,Mat] "Permalink")  def delayWith(delayStrategySupplier: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[DelayStrategy](DelayStrategy.html)\[Out]], overFlowStrategy: [DelayOverflowStrategy](../DelayOverflowStrategy.html)): Flow\[In, Out, Mat]Shifts elements emission in time by an amount individually determined through delay strategy a specified amount.

Shifts elements emission in time by an amount individually determined through delay strategy a specified amount.
It allows to store elements in internal buffer while waiting for next element to be emitted. Depending on the defined
[akka.stream.DelayOverflowStrategy](../DelayOverflowStrategy.html) it might drop elements or backpressure the upstream if
there is no space available in the buffer.

It determines delay for each ongoing element invoking `DelayStrategy.nextDelay(elem: T): FiniteDuration`.

Note that elements are not re\-ordered: if an element is given a delay much shorter than its predecessor,
it will still have to wait for the preceding element before being emitted.
It is also important to notice that [DelayStrategy](DelayStrategy.html) can be stateful.

Delay precision is 10ms to avoid unnecessary timer scheduling cycles.

Internal buffer has default capacity 16\. You can set buffer size by calling `addAttributes(inputBuffer)`

**Emits when** there is a pending element in the buffer and configured time for this element elapsed
 \* EmitEarly \- strategy do not wait to emit element if buffer is full

**Backpressures when** depending on OverflowStrategy
 \* Backpressure \- backpressures when buffer is full
 \* DropHead, DropTail, DropBuffer \- never backpressures
 \* Fail \- fails the stream if buffer gets full

**Completes when** upstream completes and buffered elements have been drained

**Cancels when** downstream cancels

delayStrategySuppliercreates new [DelayStrategy](DelayStrategy.html) object for each materialization

overFlowStrategyStrategy that is used when incoming elements cannot fit inside the buffer
37. [**](../../../akka/stream/javadsl/Flow.html#detach:akka.stream.javadsl.Flow[In,Out,Mat] "Permalink")  def detach: Flow\[In, Out, Mat]Detaches upstream demand from downstream demand without detaching the
stream rates; in other words acts like a buffer of size 1\.

Detaches upstream demand from downstream demand without detaching the
stream rates; in other words acts like a buffer of size 1\.

**Emits when** upstream emits an element

**Backpressures when** downstream backpressures

**Completes when** upstream completes

**Cancels when** downstream cancels
38. [**](../../../akka/stream/javadsl/Flow.html#divertTo(that:akka.stream.Graph[akka.stream.SinkShape[Out],_],when:akka.japi.function.Predicate[Out]):akka.stream.javadsl.Flow[In,Out,Mat] "Permalink")  def divertTo(that: [Graph](../Graph.html)\[[SinkShape](../SinkShape.html)\[Out], \_], when: [Predicate](../../japi/function/Predicate.html)\[Out]): Flow\[In, Out, Mat]Attaches the given [Sink](Sink.html) to this Flow, meaning that elements will be sent to the [Sink](Sink.html)
instead of being passed through if the predicate `when` returns `true`.

Attaches the given [Sink](Sink.html) to this Flow, meaning that elements will be sent to the [Sink](Sink.html)
instead of being passed through if the predicate `when` returns `true`.

**Emits when** emits when an element is available from the input and the chosen output has demand

**Backpressures when** the currently chosen output back\-pressures

**Completes when** upstream completes and no output is pending

**Cancels when** any of the downstreams cancel
39. [**](../../../akka/stream/javadsl/Flow.html#divertToMat[M2,M3](that:akka.stream.Graph[akka.stream.SinkShape[Out],M2],when:akka.japi.function.Predicate[Out],matF:akka.japi.function.Function2[Mat,M2,M3]):akka.stream.javadsl.Flow[In,Out,M3] "Permalink")  def divertToMat\[M2, M3](that: [Graph](../Graph.html)\[[SinkShape](../SinkShape.html)\[Out], M2], when: [Predicate](../../japi/function/Predicate.html)\[Out], matF: [Function2](../../japi/function/Function2.html)\[Mat, M2, M3]): Flow\[In, Out, M3]Attaches the given [Sink](Sink.html) to this Flow, meaning that elements will be sent to the [Sink](Sink.html)
instead of being passed through if the predicate `when` returns `true`.

Attaches the given [Sink](Sink.html) to this Flow, meaning that elements will be sent to the [Sink](Sink.html)
instead of being passed through if the predicate `when` returns `true`.

See also[\#divertTo](#divertTo(that:akka.stream.Graph[akka.stream.SinkShape[Out],_],when:akka.japi.function.Predicate[Out]):akka.stream.javadsl.Flow[In,Out,Mat])
It is recommended to use the internally optimized `Keep.left` and `Keep.right` combiners
where appropriate instead of manually writing functions that pass through one of the values.
40. [**](../../../akka/stream/javadsl/Flow.html#drop(n:Long):akka.stream.javadsl.Flow[In,Out,Mat] "Permalink")  def drop(n: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): Flow\[In, Out, Mat]Discard the given number of elements at the beginning of the stream.

Discard the given number of elements at the beginning of the stream.
No elements will be dropped if `n` is zero or negative.

**Emits when** the specified number of elements has been dropped already

**Backpressures when** the specified number of elements has been dropped and downstream backpressures

**Completes when** upstream completes

**Cancels when** downstream cancels
41. [**](../../../akka/stream/javadsl/Flow.html#dropWhile(p:akka.japi.function.Predicate[Out]):akka.stream.javadsl.Flow[In,Out,Mat] "Permalink")  def dropWhile(p: [Predicate](../../japi/function/Predicate.html)\[Out]): Flow\[In, Out, Mat]Discard elements at the beginning of the stream while predicate is true.

Discard elements at the beginning of the stream while predicate is true.
All elements will be taken after predicate returns false first time.

Adheres to the [ActorAttributes.SupervisionStrategy](../ActorAttributes$$SupervisionStrategy.html) attribute.

**Emits when** predicate returned false and for all following stream elements

**Backpressures when** predicate returned false and downstream backpressures

**Completes when** upstream completes

**Cancels when** downstream cancels
42. [**](../../../akka/stream/javadsl/Flow.html#dropWithin(duration:java.time.Duration):akka.stream.javadsl.Flow[In,Out,Mat] "Permalink")  def dropWithin(duration: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration)): Flow\[In, Out, Mat]Discard the elements received within the given duration at beginning of the stream.

Discard the elements received within the given duration at beginning of the stream.

**Emits when** the specified time elapsed and a new upstream element arrives

**Backpressures when** downstream backpressures

**Completes when** upstream completes

**Cancels when** downstream cancels
43. [**](../../../akka/stream/javadsl/Flow.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (Flow\[In, Out, Mat]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): Flow\[In, Out, Mat]ImplicitThis member is added by an implicit conversion from Flow\[In, Out, Mat] toEnsuring\[Flow\[In, Out, Mat]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
44. [**](../../../akka/stream/javadsl/Flow.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (Flow\[In, Out, Mat]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): Flow\[In, Out, Mat]ImplicitThis member is added by an implicit conversion from Flow\[In, Out, Mat] toEnsuring\[Flow\[In, Out, Mat]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
45. [**](../../../akka/stream/javadsl/Flow.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): Flow\[In, Out, Mat]ImplicitThis member is added by an implicit conversion from Flow\[In, Out, Mat] toEnsuring\[Flow\[In, Out, Mat]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
46. [**](../../../akka/stream/javadsl/Flow.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): Flow\[In, Out, Mat]ImplicitThis member is added by an implicit conversion from Flow\[In, Out, Mat] toEnsuring\[Flow\[In, Out, Mat]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
47. [**](../../../akka/stream/javadsl/Flow.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
48. [**](../../../akka/stream/javadsl/Flow.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
49. [**](../../../akka/stream/javadsl/Flow.html#expand[U](expander:akka.japi.function.Function[Out,java.util.Iterator[U]]):akka.stream.javadsl.Flow[In,U,Mat] "Permalink")  def expand\[U](expander: [Function](../../japi/function/Function.html)\[Out, [Iterator](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Iterator.html#java.util.Iterator)\[U]]): Flow\[In, U, Mat]Allows a faster downstream to progress independently of a slower upstream by extrapolating elements from an older
element until new element comes from the upstream.

Allows a faster downstream to progress independently of a slower upstream by extrapolating elements from an older
element until new element comes from the upstream. For example an expand step might repeat the last element for
the subscriber until it receives an update from upstream.

This element will never "drop" upstream elements as all elements go through at least one extrapolation step.
This means that if the upstream is actually faster than the upstream it will be backpressured by the downstream
subscriber.

Expand does not support [akka.stream.Supervision\#restart](../Supervision$.html#restart:akka.stream.Supervision.Restart.type) and [akka.stream.Supervision\#resume](../Supervision$.html#resume:akka.stream.Supervision.Resume.type).
Exceptions from the `expander` function will complete the stream with failure.

See also [\#extrapolate](#extrapolate(extrapolator:akka.japi.function.Function[Out@scala.annotation.unchecked.uncheckedVariance,java.util.Iterator[Out@scala.annotation.unchecked.uncheckedVariance]],initial:Out@scala.annotation.unchecked.uncheckedVariance):akka.stream.javadsl.Flow[In,Out,Mat]) for a version that always preserves the original element and allows for an initial "startup" element.

**Emits when** downstream stops backpressuring

**Backpressures when** downstream backpressures or iterator runs empty

**Completes when** upstream completes

**Cancels when** downstream cancels

expanderTakes the current extrapolation state to produce an output element and the next extrapolation
 state.

See also[\#extrapolate](#extrapolate(extrapolator:akka.japi.function.Function[Out@scala.annotation.unchecked.uncheckedVariance,java.util.Iterator[Out@scala.annotation.unchecked.uncheckedVariance]],initial:Out@scala.annotation.unchecked.uncheckedVariance):akka.stream.javadsl.Flow[In,Out,Mat])
50. [**](../../../akka/stream/javadsl/Flow.html#extrapolate(extrapolator:akka.japi.function.Function[Out@scala.annotation.unchecked.uncheckedVariance,java.util.Iterator[Out@scala.annotation.unchecked.uncheckedVariance]],initial:Out@scala.annotation.unchecked.uncheckedVariance):akka.stream.javadsl.Flow[In,Out,Mat] "Permalink")  def extrapolate(extrapolator: [Function](../../japi/function/Function.html)\[Out, [Iterator](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Iterator.html#java.util.Iterator)\[Out]], initial: Out): Flow\[In, Out, Mat]Allows a faster downstream to progress independent of a slower upstream.

Allows a faster downstream to progress independent of a slower upstream.

This is achieved by introducing "extrapolated" elements \- based on those from upstream \- whenever downstream
signals demand.

Extrapolate does not support [akka.stream.Supervision\#restart](../Supervision$.html#restart:akka.stream.Supervision.Restart.type) and [akka.stream.Supervision\#resume](../Supervision$.html#resume:akka.stream.Supervision.Resume.type).
Exceptions from the `extrapolate` function will complete the stream with failure.

See also [\#expand](#expand[U](expander:akka.japi.function.Function[Out,java.util.Iterator[U]]):akka.stream.javadsl.Flow[In,U,Mat]) for a version that can overwrite the original element.

**Emits when** downstream stops backpressuring, AND EITHER upstream emits OR initial element is present OR
`extrapolate` is non\-empty and applicable

**Backpressures when** downstream backpressures or current `extrapolate` runs empty

**Completes when** upstream completes and current `extrapolate` runs empty

**Cancels when** downstream cancels

extrapolatorTakes the current upstream element and provides a sequence of "extrapolated" elements based
 on the original, to be emitted in case downstream signals demand.

initialThe initial element to be emitted, in case upstream is able to stall the entire stream.

See also[\#expand](#expand[U](expander:akka.japi.function.Function[Out,java.util.Iterator[U]]):akka.stream.javadsl.Flow[In,U,Mat])
51. [**](../../../akka/stream/javadsl/Flow.html#extrapolate(extrapolator:akka.japi.function.Function[Out@scala.annotation.unchecked.uncheckedVariance,java.util.Iterator[Out@scala.annotation.unchecked.uncheckedVariance]]):akka.stream.javadsl.Flow[In,Out,Mat] "Permalink")  def extrapolate(extrapolator: [Function](../../japi/function/Function.html)\[Out, [Iterator](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Iterator.html#java.util.Iterator)\[Out]]): Flow\[In, Out, Mat]Allows a faster downstream to progress independent of a slower upstream.

Allows a faster downstream to progress independent of a slower upstream.

This is achieved by introducing "extrapolated" elements \- based on those from upstream \- whenever downstream
signals demand.

Extrapolate does not support [akka.stream.Supervision\#restart](../Supervision$.html#restart:akka.stream.Supervision.Restart.type) and [akka.stream.Supervision\#resume](../Supervision$.html#resume:akka.stream.Supervision.Resume.type).
Exceptions from the `extrapolate` function will complete the stream with failure.

See also [\#expand](#expand[U](expander:akka.japi.function.Function[Out,java.util.Iterator[U]]):akka.stream.javadsl.Flow[In,U,Mat]) for a version that can overwrite the original element.

**Emits when** downstream stops backpressuring, AND EITHER upstream emits OR initial element is present OR
`extrapolate` is non\-empty and applicable

**Backpressures when** downstream backpressures or current `extrapolate` runs empty

**Completes when** upstream completes and current `extrapolate` runs empty

**Cancels when** downstream cancels

extrapolatorTakes the current upstream element and provides a sequence of "extrapolated" elements based
 on the original, to be emitted in case downstream signals demand.

See also[\#expand](#expand[U](expander:akka.japi.function.Function[Out,java.util.Iterator[U]]):akka.stream.javadsl.Flow[In,U,Mat])
52. [**](../../../akka/stream/javadsl/Flow.html#filter(p:akka.japi.function.Predicate[Out]):akka.stream.javadsl.Flow[In,Out,Mat] "Permalink")  def filter(p: [Predicate](../../japi/function/Predicate.html)\[Out]): Flow\[In, Out, Mat]Only pass on those elements that satisfy the given predicate.

Only pass on those elements that satisfy the given predicate.

Adheres to the [ActorAttributes.SupervisionStrategy](../ActorAttributes$$SupervisionStrategy.html) attribute.

**Emits when** the given predicate returns true for the element

**Backpressures when** the given predicate returns true for the element and downstream backpressures

**Completes when** upstream completes

**Cancels when** downstream cancels
53. [**](../../../akka/stream/javadsl/Flow.html#filterNot(p:akka.japi.function.Predicate[Out]):akka.stream.javadsl.Flow[In,Out,Mat] "Permalink")  def filterNot(p: [Predicate](../../japi/function/Predicate.html)\[Out]): Flow\[In, Out, Mat]Only pass on those elements that NOT satisfy the given predicate.

Only pass on those elements that NOT satisfy the given predicate.

Adheres to the [ActorAttributes.SupervisionStrategy](../ActorAttributes$$SupervisionStrategy.html) attribute.

**Emits when** the given predicate returns false for the element

**Backpressures when** the given predicate returns false for the element and downstream backpressures

**Completes when** upstream completes

**Cancels when** downstream cancels
54. [**](../../../akka/stream/javadsl/Flow.html#flatMapConcat[T,M](f:akka.japi.function.Function[Out,_<:akka.stream.Graph[akka.stream.SourceShape[T],M]]):akka.stream.javadsl.Flow[In,T,Mat] "Permalink")  def flatMapConcat\[T, M](f: [Function](../../japi/function/Function.html)\[Out, \_ \<: [Graph](../Graph.html)\[[SourceShape](../SourceShape.html)\[T], M]]): Flow\[In, T, Mat]Transform each input element into a `Source` of output elements that is
then flattened into the output stream by concatenation,
fully consuming one Source after the other.

Transform each input element into a `Source` of output elements that is
then flattened into the output stream by concatenation,
fully consuming one Source after the other.

**Emits when** a currently consumed substream has an element available

**Backpressures when** downstream backpressures

**Completes when** upstream completes and all consumed substreams complete

**Cancels when** downstream cancels
55. [**](../../../akka/stream/javadsl/Flow.html#flatMapMerge[T,M](breadth:Int,f:akka.japi.function.Function[Out,_<:akka.stream.Graph[akka.stream.SourceShape[T],M]]):akka.stream.javadsl.Flow[In,T,Mat] "Permalink")  def flatMapMerge\[T, M](breadth: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), f: [Function](../../japi/function/Function.html)\[Out, \_ \<: [Graph](../Graph.html)\[[SourceShape](../SourceShape.html)\[T], M]]): Flow\[In, T, Mat]Transform each input element into a `Source` of output elements that is
then flattened into the output stream by merging, where at most `breadth`
substreams are being consumed at any given time.

Transform each input element into a `Source` of output elements that is
then flattened into the output stream by merging, where at most `breadth`
substreams are being consumed at any given time.

**Emits when** a currently consumed substream has an element available

**Backpressures when** downstream backpressures

**Completes when** upstream completes and all consumed substreams complete

**Cancels when** downstream cancels
56. [**](../../../akka/stream/javadsl/Flow.html#flatMapPrefix[Out2,Mat2](n:Int,f:akka.japi.function.Function[Iterable[Out],akka.stream.javadsl.Flow[Out,Out2,Mat2]]):akka.stream.javadsl.Flow[In,Out2,Mat] "Permalink")  def flatMapPrefix\[Out2, Mat2](n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), f: [Function](../../japi/function/Function.html)\[[Iterable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Iterable.html#java.lang.Iterable)\[Out], Flow\[Out, Out2, Mat2]]): Flow\[In, Out2, Mat]Takes up to `n` elements from the stream (less than `n` only if the upstream completes before emitting `n` elements),
then apply `f` on these elements in order to obtain a flow, this flow is then materialized and the rest of the input is processed by this flow (similar to via).

Takes up to `n` elements from the stream (less than `n` only if the upstream completes before emitting `n` elements),
then apply `f` on these elements in order to obtain a flow, this flow is then materialized and the rest of the input is processed by this flow (similar to via).
This method returns a flow consuming the rest of the stream producing the materialized flow's output.

**Emits when** the materialized flow emits.
 Notice the first `n` elements are buffered internally before materializing the flow and connecting it to the rest of the upstream \- producing elements at its own discretion (might 'swallow' or multiply elements).

**Backpressures when** downstream backpressures

**Completes when** the materialized flow completes.
 If upstream completes before producing `n` elements, `f` will be applied with the provided elements,
 the resulting flow will be materialized and signalled for upstream completion, it can then complete or continue to emit elements at its own discretion.

**Cancels when** the materialized flow cancels.
 Notice that when downstream cancels prior to prefix completion, the cancellation cause is stashed until prefix completion (or upstream completion) and then handed to the materialized flow.

nthe number of elements to accumulate before materializing the downstream flow.

fa function that produces the downstream flow based on the upstream's prefix.
57. [**](../../../akka/stream/javadsl/Flow.html#flatMapPrefixMat[Out2,Mat2,Mat3](n:Int,f:akka.japi.function.Function[Iterable[Out],akka.stream.javadsl.Flow[Out,Out2,Mat2]],matF:akka.japi.function.Function2[Mat,java.util.concurrent.CompletionStage[Mat2],Mat3]):akka.stream.javadsl.Flow[In,Out2,Mat3] "Permalink")  def flatMapPrefixMat\[Out2, Mat2, Mat3](n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), f: [Function](../../japi/function/Function.html)\[[Iterable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Iterable.html#java.lang.Iterable)\[Out], Flow\[Out, Out2, Mat2]], matF: [Function2](../../japi/function/Function2.html)\[Mat, [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[Mat2], Mat3]): Flow\[In, Out2, Mat3]mat version of [\#flatMapPrefix](#flatMapPrefix[Out2,Mat2](n:Int,f:akka.japi.function.Function[Iterable[Out],akka.stream.javadsl.Flow[Out,Out2,Mat2]]):akka.stream.javadsl.Flow[In,Out2,Mat]), this method gives access to a future materialized value of the downstream flow (as a completion stage).

mat version of [\#flatMapPrefix](#flatMapPrefix[Out2,Mat2](n:Int,f:akka.japi.function.Function[Iterable[Out],akka.stream.javadsl.Flow[Out,Out2,Mat2]]):akka.stream.javadsl.Flow[In,Out2,Mat]), this method gives access to a future materialized value of the downstream flow (as a completion stage).
see [\#flatMapPrefix](#flatMapPrefix[Out2,Mat2](n:Int,f:akka.japi.function.Function[Iterable[Out],akka.stream.javadsl.Flow[Out,Out2,Mat2]]):akka.stream.javadsl.Flow[In,Out2,Mat]) for details.
58. [**](../../../akka/stream/javadsl/Flow.html#fold[T](zero:T)(f:akka.japi.function.Function2[T,Out,T]):akka.stream.javadsl.Flow[In,T,Mat] "Permalink")  def fold\[T](zero: T)(f: [Function2](../../japi/function/Function2.html)\[T, Out, T]): Flow\[In, T, Mat]Similar to `scan` but only emits its result when the upstream completes,
after which it also completes.

Similar to `scan` but only emits its result when the upstream completes,
after which it also completes. Applies the given function `f` towards its current and next value,
yielding the next current value.

Adheres to the [ActorAttributes.SupervisionStrategy](../ActorAttributes$$SupervisionStrategy.html) attribute.

If the function `f` throws an exception and the supervision decision is
[akka.stream.Supervision\#restart](../Supervision$.html#restart:akka.stream.Supervision.Restart.type) current value starts at `zero` again
the stream will continue.

Note that the `zero` value must be immutable.

**Emits when** upstream completes

**Backpressures when** downstream backpressures

**Completes when** upstream completes

**Cancels when** downstream cancels
59. [**](../../../akka/stream/javadsl/Flow.html#foldAsync[T](zero:T)(f:akka.japi.function.Function2[T,Out,java.util.concurrent.CompletionStage[T]]):akka.stream.javadsl.Flow[In,T,Mat] "Permalink")  def foldAsync\[T](zero: T)(f: [Function2](../../japi/function/Function2.html)\[T, Out, [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[T]]): Flow\[In, T, Mat]Similar to `fold` but with an asynchronous function.

Similar to `fold` but with an asynchronous function.
Applies the given function towards its current and next value,
yielding the next current value.

Adheres to the [ActorAttributes.SupervisionStrategy](../ActorAttributes$$SupervisionStrategy.html) attribute.

If the function `f` returns a failure and the supervision decision is
[akka.stream.Supervision.Restart](../Supervision$$Restart$.html) current value starts at `zero` again
the stream will continue.

Note that the `zero` value must be immutable.

**Emits when** upstream completes

**Backpressures when** downstream backpressures

**Completes when** upstream completes

**Cancels when** downstream cancels
60. [**](../../../akka/stream/javadsl/Flow.html#getAttributes:akka.stream.Attributes "Permalink")  def getAttributes: [Attributes](../Attributes.html)Definition ClassesFlow → [Graph](../Graph.html)
61. [**](../../../akka/stream/javadsl/Flow.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
62. [**](../../../akka/stream/javadsl/Flow.html#groupBy[K](maxSubstreams:Int,f:akka.japi.function.Function[Out,K]):akka.stream.javadsl.SubFlow[In,Out,Mat] "Permalink")  def groupBy\[K](maxSubstreams: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), f: [Function](../../japi/function/Function.html)\[Out, K]): [SubFlow](SubFlow.html)\[In, Out, Mat]This operation demultiplexes the incoming stream into separate output
streams, one for each element key.

This operation demultiplexes the incoming stream into separate output
streams, one for each element key. The key is computed for each element
using the given function. When a new key is encountered for the first time
a new substream is opened and subsequently fed with all elements belonging to
that key.

WARNING: The operator keeps track of all keys of streams that have already been closed.
If you expect an infinite number of keys this can cause memory issues. Elements belonging
to those keys are drained directly and not send to the substream.

See also[\#groupBy](#groupBy[K](maxSubstreams:Int,f:akka.japi.function.Function[Out,K]):akka.stream.javadsl.SubFlow[In,Out,Mat])
63. [**](../../../akka/stream/javadsl/Flow.html#groupBy[K](maxSubstreams:Int,f:akka.japi.function.Function[Out,K],allowClosedSubstreamRecreation:Boolean):akka.stream.javadsl.SubFlow[In,Out,Mat] "Permalink")  def groupBy\[K](maxSubstreams: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), f: [Function](../../japi/function/Function.html)\[Out, K], allowClosedSubstreamRecreation: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): [SubFlow](SubFlow.html)\[In, Out, Mat]This operation demultiplexes the incoming stream into separate output
streams, one for each element key.

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

The object returned from this method is not a normal Flow,
it is a [SubFlow](SubFlow.html). This means that after this operator all transformations
are applied to all encountered substreams in the same fashion. Substream mode
is exited either by closing the substream (i.e. connecting it to a [Sink](Sink.html))
or by merging the substreams back together; see the `to` and `mergeBack` methods
on [SubFlow](SubFlow.html) for more information.

It is important to note that the substreams also propagate back\-pressure as
any other stream, which means that blocking one substream will block the `groupBy`
operator itself—and thereby all substreams—once all internal or
explicit buffers are filled.

If the group by function `f` throws an exception and the supervision decision
is [akka.stream.Supervision\#stop](../Supervision$.html#stop:akka.stream.Supervision.Stop.type) the stream and substreams will be completed
with failure.

If the group by function `f` throws an exception and the supervision decision
is [akka.stream.Supervision\#resume](../Supervision$.html#resume:akka.stream.Supervision.Resume.type) or [akka.stream.Supervision\#restart](../Supervision$.html#restart:akka.stream.Supervision.Restart.type)
the element is dropped and the stream and substreams continue.

Function `f` MUST NOT return `null`. This will throw exception and trigger supervision decision mechanism.

**Emits when** an element for which the grouping function returns a group that has not yet been created.
Emits the new group

**Backpressures when** there is an element pending for a group whose substream backpressures

**Completes when** upstream completes

**Cancels when** downstream cancels and all substreams cancel

maxSubstreamsconfigures the maximum number of substreams (keys)
 that are supported; if more distinct keys are encountered then the stream fails

fcomputes the key for each element

allowClosedSubstreamRecreationenables recreation of already closed substreams if elements with their
 corresponding keys arrive after completion
64. [**](../../../akka/stream/javadsl/Flow.html#grouped(n:Int):akka.stream.javadsl.Flow[In,java.util.List[Out],Mat] "Permalink")  def grouped(n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): Flow\[In, [List](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/List.html#java.util.List)\[Out], Mat]Chunk up this stream into groups of the given size, with the last group
possibly smaller than requested due to end\-of\-stream.

Chunk up this stream into groups of the given size, with the last group
possibly smaller than requested due to end\-of\-stream.

`n` must be positive, otherwise IllegalArgumentException is thrown.

**Emits when** the specified number of elements has been accumulated or upstream completed

**Backpressures when** a group has been assembled and downstream backpressures

**Completes when** upstream completes

**Cancels when** downstream cancels
65. [**](../../../akka/stream/javadsl/Flow.html#groupedWeighted(minWeight:Long)(costFn:java.util.function.Function[Out,Long]):akka.stream.javadsl.Flow[In,java.util.List[Out],Mat] "Permalink")  def groupedWeighted(minWeight: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long))(costFn: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[Out, [Long](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Long.html#java.lang.Long)]): Flow\[In, [List](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/List.html#java.util.List)\[Out], Mat]Chunk up this stream into groups of elements that have a cumulative weight greater than or equal to
the `minWeight`, with the last group possibly smaller than requested `minWeight` due to end\-of\-stream.

Chunk up this stream into groups of elements that have a cumulative weight greater than or equal to
the `minWeight`, with the last group possibly smaller than requested `minWeight` due to end\-of\-stream.

`minWeight` must be positive, otherwise IllegalArgumentException is thrown.
`costFn` must return a non\-negative result for all inputs, otherwise the stage will fail
with an IllegalArgumentException.

**Emits when** the cumulative weight of elements is greater than or equal to the `minWeight` or upstream completed

**Backpressures when** a buffered group weighs more than `minWeight` and downstream backpressures

**Completes when** upstream completes

**Cancels when** downstream cancels
66. [**](../../../akka/stream/javadsl/Flow.html#groupedWeightedWithin(maxWeight:Long,maxNumber:Int,costFn:akka.japi.function.Function[Out,Long],duration:java.time.Duration):akka.stream.javadsl.Flow[In,java.util.List[Out],Mat] "Permalink")  def groupedWeightedWithin(maxWeight: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), maxNumber: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), costFn: [Function](../../japi/function/Function.html)\[Out, [Long](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Long.html#java.lang.Long)], duration: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration)): Flow\[In, [List](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/List.html#java.util.List)\[Out], Mat]Chunk up this stream into groups of elements received within a time window,
or limited by the weight and number of the elements, whatever happens first.

Chunk up this stream into groups of elements received within a time window,
or limited by the weight and number of the elements, whatever happens first.
Empty groups will not be emitted if no elements are received from upstream.
The last group before end\-of\-stream will contain the buffered elements
since the previously emitted group.

**Emits when** the configured time elapses since the last group has been emitted or weight limit reached

**Backpressures when** downstream backpressures, and buffered group (\+ pending element) weighs more than
`maxWeight` or has more than `maxNumber` elements

**Completes when** upstream completes (emits last group)

**Cancels when** downstream completes

`maxWeight` must be positive, `maxNumber` must be positive, and `duration` must be greater than 0 seconds,
otherwise IllegalArgumentException is thrown.
67. [**](../../../akka/stream/javadsl/Flow.html#groupedWeightedWithin(maxWeight:Long,costFn:akka.japi.function.Function[Out,Long],duration:java.time.Duration):akka.stream.javadsl.Flow[In,java.util.List[Out],Mat] "Permalink")  def groupedWeightedWithin(maxWeight: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), costFn: [Function](../../japi/function/Function.html)\[Out, [Long](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Long.html#java.lang.Long)], duration: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration)): Flow\[In, [List](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/List.html#java.util.List)\[Out], Mat]Chunk up this stream into groups of elements received within a time window,
or limited by the weight of the elements, whatever happens first.

Chunk up this stream into groups of elements received within a time window,
or limited by the weight of the elements, whatever happens first.
Empty groups will not be emitted if no elements are received from upstream.
The last group before end\-of\-stream will contain the buffered elements
since the previously emitted group.

**Emits when** the configured time elapses since the last group has been emitted or weight limit reached

**Backpressures when** downstream backpressures, and buffered group (\+ pending element) weighs more than `maxWeight`

**Completes when** upstream completes (emits last group)

**Cancels when** downstream completes

`maxWeight` must be positive, and `duration` must be greater than 0 seconds, otherwise
IllegalArgumentException is thrown.
68. [**](../../../akka/stream/javadsl/Flow.html#groupedWithin(maxNumber:Int,duration:java.time.Duration):akka.stream.javadsl.Flow[In,java.util.List[Out],Mat] "Permalink")  def groupedWithin(maxNumber: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), duration: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration)): Flow\[In, [List](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/List.html#java.util.List)\[Out], Mat]Chunk up this stream into groups of elements received within a time window,
or limited by the given number of elements, whatever happens first.

Chunk up this stream into groups of elements received within a time window,
or limited by the given number of elements, whatever happens first.
Empty groups will not be emitted if no elements are received from upstream.
The last group before end\-of\-stream will contain the buffered elements
since the previously emitted group.

**Emits when** the configured time elapses since the last group has been emitted or `n` elements is buffered

**Backpressures when** downstream backpressures, and there are `n+1` buffered elements

**Completes when** upstream completes (emits last group)

**Cancels when** downstream completes

`maxNumber` must be positive, and `duration` must be greater than 0 seconds, otherwise
IllegalArgumentException is thrown.
69. [**](../../../akka/stream/javadsl/Flow.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
70. [**](../../../akka/stream/javadsl/Flow.html#idleTimeout(timeout:java.time.Duration):akka.stream.javadsl.Flow[In,Out,Mat] "Permalink")  def idleTimeout(timeout: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration)): Flow\[In, Out, Mat]If the time between two processed elements exceeds the provided timeout, the stream is failed
with a [akka.stream.StreamIdleTimeoutException](../StreamIdleTimeoutException.html).

If the time between two processed elements exceeds the provided timeout, the stream is failed
with a [akka.stream.StreamIdleTimeoutException](../StreamIdleTimeoutException.html). The timeout is checked periodically,
so the resolution of the check is one period (equals to timeout value).

**Emits when** upstream emits an element

**Backpressures when** downstream backpressures

**Completes when** upstream completes or fails if timeout elapses between two emitted elements

**Cancels when** downstream cancels
71. [**](../../../akka/stream/javadsl/Flow.html#initialDelay(delay:java.time.Duration):akka.stream.javadsl.Flow[In,Out,Mat] "Permalink")  def initialDelay(delay: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration)): Flow\[In, Out, Mat]Delays the initial element by the specified duration.

Delays the initial element by the specified duration.

**Emits when** upstream emits an element if the initial delay is already elapsed

**Backpressures when** downstream backpressures or initial delay is not yet elapsed

**Completes when** upstream completes

**Cancels when** downstream cancels
72. [**](../../../akka/stream/javadsl/Flow.html#initialTimeout(timeout:java.time.Duration):akka.stream.javadsl.Flow[In,Out,Mat] "Permalink")  def initialTimeout(timeout: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration)): Flow\[In, Out, Mat]If the first element has not passed through this operator before the provided timeout, the stream is failed
with a [akka.stream.InitialTimeoutException](../InitialTimeoutException.html).

If the first element has not passed through this operator before the provided timeout, the stream is failed
with a [akka.stream.InitialTimeoutException](../InitialTimeoutException.html).

**Emits when** upstream emits an element

**Backpressures when** downstream backpressures

**Completes when** upstream completes or fails if timeout elapses before first element arrives

**Cancels when** downstream cancels
73. [**](../../../akka/stream/javadsl/Flow.html#interleave(that:akka.stream.Graph[akka.stream.SourceShape[Out],_],segmentSize:Int,eagerClose:Boolean):akka.stream.javadsl.Flow[In,Out,Mat] "Permalink")  def interleave(that: [Graph](../Graph.html)\[[SourceShape](../SourceShape.html)\[Out], \_], segmentSize: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), eagerClose: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): Flow\[In, Out, Mat]Interleave is a deterministic merge of the given [Source](Source.html) with elements of this Flow.

Interleave is a deterministic merge of the given [Source](Source.html) with elements of this Flow.
It first emits `segmentSize` number of elements from this flow to downstream, then \- same amount for `that` source,
then repeat process.

If eagerClose is false and one of the upstreams complete the elements from the other upstream will continue passing
through the interleave operator. If eagerClose is true and one of the upstream complete interleave will cancel the
other upstream and complete itself.

If this Flow or [Source](Source.html) gets upstream error \- stream completes with failure.

**Emits when** element is available from the currently consumed upstream

**Backpressures when** downstream backpressures. Signal to current
upstream, switch to next upstream when received `segmentSize` elements

**Completes when** the Flow and given [Source](Source.html) completes

**Cancels when** downstream cancels
74. [**](../../../akka/stream/javadsl/Flow.html#interleave(that:akka.stream.Graph[akka.stream.SourceShape[Out],_],segmentSize:Int):akka.stream.javadsl.Flow[In,Out,Mat] "Permalink")  def interleave(that: [Graph](../Graph.html)\[[SourceShape](../SourceShape.html)\[Out], \_], segmentSize: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): Flow\[In, Out, Mat]Interleave is a deterministic merge of the given [Source](Source.html) with elements of this Flow.

Interleave is a deterministic merge of the given [Source](Source.html) with elements of this Flow.
It first emits `segmentSize` number of elements from this flow to downstream, then \- same amount for `that` source,
then repeat process.

Example:

```
Source<Integer, ?> src = Source.from(Arrays.asList(1, 2, 3))
Flow<Integer, Integer, ?> flow = flow.interleave(Source.from(Arrays.asList(4, 5, 6, 7)), 2)
src.via(flow) // 1, 2, 4, 5, 3, 6, 7
```
After one of upstreams is complete than all the rest elements will be emitted from the second one

If this Flow or [Source](Source.html) gets upstream error \- stream completes with failure.

**Emits when** element is available from the currently consumed upstream

**Backpressures when** downstream backpressures. Signal to current
upstream, switch to next upstream when received `segmentSize` elements

**Completes when** the Flow and given [Source](Source.html) completes

**Cancels when** downstream cancels
75. [**](../../../akka/stream/javadsl/Flow.html#interleaveAll(those:java.util.List[_<:akka.stream.Graph[akka.stream.SourceShape[Out],_]],segmentSize:Int,eagerClose:Boolean):akka.stream.javadsl.Flow[In,Out,Mat] "Permalink")  def interleaveAll(those: [List](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/List.html#java.util.List)\[\_ \<: [Graph](../Graph.html)\[[SourceShape](../SourceShape.html)\[Out], \_]], segmentSize: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), eagerClose: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): Flow\[In, Out, Mat]Interleave is a deterministic merge of the given [Source](Source.html)s with elements of this Flow.

Interleave is a deterministic merge of the given [Source](Source.html)s with elements of this Flow.
It first emits `segmentSize` number of elements from this flow to downstream, then \- same amount for `that` source,
then repeat process.

If eagerClose is false and one of the upstreams complete the elements from the other upstream will continue passing
through the interleave operator. If eagerClose is true and one of the upstream complete interleave will cancel the
other upstream and complete itself.

If this Flow or [Source](Source.html) gets upstream error \- stream completes with failure.

**Emits when** element is available from the currently consumed upstream

**Backpressures when** downstream backpressures. Signal to current
upstream, switch to next upstream when received `segmentSize` elements

**Completes when** the Flow and given [Source](Source.html) completes

**Cancels when** downstream cancels
76. [**](../../../akka/stream/javadsl/Flow.html#interleaveMat[M,M2](that:akka.stream.Graph[akka.stream.SourceShape[Out],M],segmentSize:Int,eagerClose:Boolean,matF:akka.japi.function.Function2[Mat,M,M2]):akka.stream.javadsl.Flow[In,Out,M2] "Permalink")  def interleaveMat\[M, M2](that: [Graph](../Graph.html)\[[SourceShape](../SourceShape.html)\[Out], M], segmentSize: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), eagerClose: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), matF: [Function2](../../japi/function/Function2.html)\[Mat, M, M2]): Flow\[In, Out, M2]Interleave is a deterministic merge of the given [Source](Source.html) with elements of this Flow.

Interleave is a deterministic merge of the given [Source](Source.html) with elements of this Flow.
It first emits `segmentSize` number of elements from this flow to downstream, then \- same amount for `that` source,
then repeat process.

If eagerClose is false and one of the upstreams complete the elements from the other upstream will continue passing
through the interleave operator. If eagerClose is true and one of the upstream complete interleave will cancel the
other upstream and complete itself.

If this Flow or [Source](Source.html) gets upstream error \- stream completes with failure.

It is recommended to use the internally optimized `Keep.left` and `Keep.right` combiners
where appropriate instead of manually writing functions that pass through one of the values.

See also[\#interleave](#interleave(that:akka.stream.Graph[akka.stream.SourceShape[Out],_],segmentSize:Int,eagerClose:Boolean):akka.stream.javadsl.Flow[In,Out,Mat])
77. [**](../../../akka/stream/javadsl/Flow.html#interleaveMat[M,M2](that:akka.stream.Graph[akka.stream.SourceShape[Out],M],segmentSize:Int,matF:akka.japi.function.Function2[Mat,M,M2]):akka.stream.javadsl.Flow[In,Out,M2] "Permalink")  def interleaveMat\[M, M2](that: [Graph](../Graph.html)\[[SourceShape](../SourceShape.html)\[Out], M], segmentSize: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), matF: [Function2](../../japi/function/Function2.html)\[Mat, M, M2]): Flow\[In, Out, M2]Interleave is a deterministic merge of the given [Source](Source.html) with elements of this Flow.

Interleave is a deterministic merge of the given [Source](Source.html) with elements of this Flow.
It first emits `segmentSize` number of elements from this flow to downstream, then \- same amount for `that` source,
then repeat process.

After one of upstreams is complete than all the rest elements will be emitted from the second one

If this Flow or [Source](Source.html) gets upstream error \- stream completes with failure.

It is recommended to use the internally optimized `Keep.left` and `Keep.right` combiners
where appropriate instead of manually writing functions that pass through one of the values.

See also[\#interleave](#interleave(that:akka.stream.Graph[akka.stream.SourceShape[Out],_],segmentSize:Int,eagerClose:Boolean):akka.stream.javadsl.Flow[In,Out,Mat])
78. [**](../../../akka/stream/javadsl/Flow.html#intersperse(inject:Out):akka.stream.javadsl.Flow[In,Out,Mat] "Permalink")  def intersperse(inject: Out): Flow\[In, Out, Mat]Intersperses stream with provided element, similar to how [scala.collection.immutable.List.mkString](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/List.html#mkString:String)
injects a separator between a List's elements.

Intersperses stream with provided element, similar to how [scala.collection.immutable.List.mkString](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/List.html#mkString:String)
injects a separator between a List's elements.

Additionally can inject start and end marker elements to stream.

Examples:

```
Source<Integer, ?> nums = Source.from(Arrays.asList(0, 1, 2, 3));
nums.intersperse(",");            //   1 , 2 , 3
nums.intersperse("[", ",", "]");  // [ 1 , 2 , 3 ]
```
**Emits when** upstream emits (or before with the `start` element if provided)

**Backpressures when** downstream backpressures

**Completes when** upstream completes

**Cancels when** downstream cancels
79. [**](../../../akka/stream/javadsl/Flow.html#intersperse(start:Out,inject:Out,end:Out):akka.stream.javadsl.Flow[In,Out,Mat] "Permalink")  def intersperse(start: Out, inject: Out, end: Out): Flow\[In, Out, Mat]Intersperses stream with provided element, similar to how [scala.collection.immutable.List.mkString](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/List.html#mkString:String)
injects a separator between a List's elements.

Intersperses stream with provided element, similar to how [scala.collection.immutable.List.mkString](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/List.html#mkString:String)
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
version of intersperse (See [Source.concat](Source.html#concat[M](that:akka.stream.Graph[akka.stream.SourceShape[Out],M]):akka.stream.javadsl.Source[Out,Mat]) for semantics details):

```
Source.single(">> ").concat(flow.intersperse(","))
flow.intersperse(",").concat(Source.single("END"))
```
**Emits when** upstream emits (or before with the `start` element if provided)

**Backpressures when** downstream backpressures

**Completes when** upstream completes

**Cancels when** downstream cancels
80. [**](../../../akka/stream/javadsl/Flow.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
81. [**](../../../akka/stream/javadsl/Flow.html#join[I2,O1,Mat2](bidi:akka.stream.Graph[akka.stream.BidiShape[Out,O1,I2,In],Mat2]):akka.stream.javadsl.Flow[I2,O1,Mat] "Permalink")  def join\[I2, O1, Mat2](bidi: [Graph](../Graph.html)\[[BidiShape](../BidiShape.html)\[Out, O1, I2, In], Mat2]): Flow\[I2, O1, Mat]Join this Flow to a [BidiFlow](BidiFlow.html) to close off the “top” of the protocol stack:

Join this Flow to a [BidiFlow](BidiFlow.html) to close off the “top” of the protocol stack:

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
The materialized value of the combined Flow will be the materialized
value of the current flow (ignoring the [BidiFlow](BidiFlow.html)’s value), use
[joinMat](#joinMat[I2,O1,Mat2,M](bidi:akka.stream.Graph[akka.stream.BidiShape[Out,O1,I2,In],Mat2],combine:akka.japi.function.Function2[Mat,Mat2,M]):akka.stream.javadsl.Flow[I2,O1,M]) if a different strategy is needed.
82. [**](../../../akka/stream/javadsl/Flow.html#join[M](flow:akka.stream.Graph[akka.stream.FlowShape[Out,In],M]):akka.stream.javadsl.RunnableGraph[Mat] "Permalink")  def join\[M](flow: [Graph](../Graph.html)\[[FlowShape](../FlowShape.html)\[Out, In], M]): [RunnableGraph](RunnableGraph.html)\[Mat]Join this Flow to another Flow, by cross connecting the inputs and outputs, creating a [RunnableGraph](RunnableGraph.html).

Join this Flow to another Flow, by cross connecting the inputs and outputs, creating a [RunnableGraph](RunnableGraph.html).

```
+------+        +-------+
|      | ~Out~> |       |
| this |        | other |
|      | <~In~  |       |
+------+        +-------+
```
The materialized value of the combined Flow will be the materialized
value of the current flow (ignoring the other Flow’s value), use
`joinMat` if a different strategy is needed.

See also [joinMat](#joinMat[I2,O1,Mat2,M](bidi:akka.stream.Graph[akka.stream.BidiShape[Out,O1,I2,In],Mat2],combine:akka.japi.function.Function2[Mat,Mat2,M]):akka.stream.javadsl.Flow[I2,O1,M]) when access to materialized values of the parameter is needed.
83. [**](../../../akka/stream/javadsl/Flow.html#joinMat[I2,O1,Mat2,M](bidi:akka.stream.Graph[akka.stream.BidiShape[Out,O1,I2,In],Mat2],combine:akka.japi.function.Function2[Mat,Mat2,M]):akka.stream.javadsl.Flow[I2,O1,M] "Permalink")  def joinMat\[I2, O1, Mat2, M](bidi: [Graph](../Graph.html)\[[BidiShape](../BidiShape.html)\[Out, O1, I2, In], Mat2], combine: [Function2](../../japi/function/Function2.html)\[Mat, Mat2, M]): Flow\[I2, O1, M]Join this Flow to a [BidiFlow](BidiFlow.html) to close off the “top” of the protocol stack:

Join this Flow to a [BidiFlow](BidiFlow.html) to close off the “top” of the protocol stack:

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
[BidiFlow](BidiFlow.html) into the materialized value of the resulting Flow.

It is recommended to use the internally optimized `Keep.left` and `Keep.right` combiners
where appropriate instead of manually writing functions that pass through one of the values.

See also [viaMat](#viaMat[T,M,M2](flow:akka.stream.Graph[akka.stream.FlowShape[Out,T],M],combine:akka.japi.function.Function2[Mat,M,M2]):akka.stream.javadsl.Flow[In,T,M2]) when access to materialized values of the parameter is needed.
84. [**](../../../akka/stream/javadsl/Flow.html#joinMat[M,M2](flow:akka.stream.Graph[akka.stream.FlowShape[Out,In],M],combine:akka.japi.function.Function2[Mat,M,M2]):akka.stream.javadsl.RunnableGraph[M2] "Permalink")  def joinMat\[M, M2](flow: [Graph](../Graph.html)\[[FlowShape](../FlowShape.html)\[Out, In], M], combine: [Function2](../../japi/function/Function2.html)\[Mat, M, M2]): [RunnableGraph](RunnableGraph.html)\[M2]Join this Flow to another Flow, by cross connecting the inputs and outputs, creating a [RunnableGraph](RunnableGraph.html)

Join this Flow to another Flow, by cross connecting the inputs and outputs, creating a [RunnableGraph](RunnableGraph.html)

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
85. [**](../../../akka/stream/javadsl/Flow.html#keepAlive(maxIdle:java.time.Duration,injectedElem:akka.japi.function.Creator[Out]):akka.stream.javadsl.Flow[In,Out,Mat] "Permalink")  def keepAlive(maxIdle: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration), injectedElem: [Creator](../../japi/function/Creator.html)\[Out]): Flow\[In, Out, Mat]Injects additional elements if upstream does not emit for a configured amount of time.

Injects additional elements if upstream does not emit for a configured amount of time. In other words, this
operator attempts to maintains a base rate of emitted elements towards the downstream.

If the downstream backpressures then no element is injected until downstream demand arrives. Injected elements
do not accumulate during this period.

Upstream elements are always preferred over injected elements.

**Emits when** upstream emits an element or if the upstream was idle for the configured period

**Backpressures when** downstream backpressures

**Completes when** upstream completes

**Cancels when** downstream cancels
86. [**](../../../akka/stream/javadsl/Flow.html#limit(n:Long):akka.stream.javadsl.Flow[In,Out,Mat] "Permalink")  def limit(n: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): Flow\[In, Out, Mat]Ensure stream boundedness by limiting the number of elements from upstream.

Ensure stream boundedness by limiting the number of elements from upstream.
If the number of incoming elements exceeds max, it will signal
upstream failure `StreamLimitException` downstream.

Due to input buffering some elements may have been
requested from upstream publishers that will then not be processed downstream
of this step.

The stream will be completed without producing any elements if `n` is zero
or negative.

**Emits when** the specified number of elements to take has not yet been reached

**Backpressures when** downstream backpressures

**Completes when** the defined number of elements has been taken or upstream completes

**Errors when** the total number of incoming element exceeds max

**Cancels when** the defined number of elements has been taken or downstream cancels

See also [Flow.take](#take(n:Long):akka.stream.javadsl.Flow[In,Out,Mat]), [Flow.takeWithin](#takeWithin(duration:java.time.Duration):akka.stream.javadsl.Flow[In,Out,Mat]), [Flow.takeWhile](#takeWhile(p:akka.japi.function.Predicate[Out]):akka.stream.javadsl.Flow[In,Out,Mat])
87. [**](../../../akka/stream/javadsl/Flow.html#limitWeighted(n:Long)(costFn:akka.japi.function.Function[Out,Long]):akka.stream.javadsl.Flow[In,Out,Mat] "Permalink")  def limitWeighted(n: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long))(costFn: [Function](../../japi/function/Function.html)\[Out, [Long](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Long.html#java.lang.Long)]): Flow\[In, Out, Mat]Ensure stream boundedness by evaluating the cost of incoming elements
using a cost function.

Ensure stream boundedness by evaluating the cost of incoming elements
using a cost function. Exactly how many elements will be allowed to travel downstream depends on the
evaluated cost of each element. If the accumulated cost exceeds max, it will signal
upstream failure `StreamLimitException` downstream.

Due to input buffering some elements may have been
requested from upstream publishers that will then not be processed downstream
of this step.

The stream will be completed without producing any elements if `n` is zero
or negative.

Adheres to the [ActorAttributes.SupervisionStrategy](../ActorAttributes$$SupervisionStrategy.html) attribute.

**Emits when** the specified number of elements to take has not yet been reached

**Backpressures when** downstream backpressures

**Completes when** the defined number of elements has been taken or upstream completes

**Errors when** when the accumulated cost exceeds max

**Cancels when** the defined number of elements has been taken or downstream cancels

See also [Flow.take](#take(n:Long):akka.stream.javadsl.Flow[In,Out,Mat]), [Flow.takeWithin](#takeWithin(duration:java.time.Duration):akka.stream.javadsl.Flow[In,Out,Mat]), [Flow.takeWhile](#takeWhile(p:akka.japi.function.Predicate[Out]):akka.stream.javadsl.Flow[In,Out,Mat])
88. [**](../../../akka/stream/javadsl/Flow.html#log(name:String):akka.stream.javadsl.Flow[In,Out,Mat] "Permalink")  def log(name: String): Flow\[In, Out, Mat]Logs elements flowing through the stream as well as completion and erroring.

Logs elements flowing through the stream as well as completion and erroring.

By default element and completion signals are logged on debug level, and errors are logged on Error level.
This can be adjusted according to your needs by providing a custom [Attributes.LogLevels](../Attributes$$LogLevels.html) attribute on the given Flow.

Uses an internally created LoggingAdapter which uses `akka.stream.Log` as it's source (use this class to configure slf4j loggers).

**Emits when** the mapping function returns an element

**Backpressures when** downstream backpressures

**Completes when** upstream completes

**Cancels when** downstream cancels
89. [**](../../../akka/stream/javadsl/Flow.html#log(name:String,log:akka.event.LoggingAdapter):akka.stream.javadsl.Flow[In,Out,Mat] "Permalink")  def log(name: String, log: [LoggingAdapter](../../event/LoggingAdapter.html)): Flow\[In, Out, Mat]Logs elements flowing through the stream as well as completion and erroring.

Logs elements flowing through the stream as well as completion and erroring.

By default element and completion signals are logged on debug level, and errors are logged on Error level.
This can be adjusted according to your needs by providing a custom [Attributes.LogLevels](../Attributes$$LogLevels.html) attribute on the given Flow:

Uses the given LoggingAdapter for logging.

**Emits when** the mapping function returns an element

**Backpressures when** downstream backpressures

**Completes when** upstream completes

**Cancels when** downstream cancels
90. [**](../../../akka/stream/javadsl/Flow.html#log(name:String,extract:akka.japi.function.Function[Out,Any]):akka.stream.javadsl.Flow[In,Out,Mat] "Permalink")  def log(name: String, extract: [Function](../../japi/function/Function.html)\[Out, [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)]): Flow\[In, Out, Mat]Logs elements flowing through the stream as well as completion and erroring.

Logs elements flowing through the stream as well as completion and erroring.

By default element and completion signals are logged on debug level, and errors are logged on Error level.
This can be adjusted according to your needs by providing a custom [Attributes.LogLevels](../Attributes$$LogLevels.html) attribute on the given Flow:

The `extract` function will be applied to each element before logging, so it is possible to log only those fields
of a complex object flowing through this element.

Uses an internally created LoggingAdapter which uses `akka.stream.Log` as it's source (use this class to configure slf4j loggers).

**Emits when** the mapping function returns an element

**Backpressures when** downstream backpressures

**Completes when** upstream completes

**Cancels when** downstream cancels
91. [**](../../../akka/stream/javadsl/Flow.html#log(name:String,extract:akka.japi.function.Function[Out,Any],log:akka.event.LoggingAdapter):akka.stream.javadsl.Flow[In,Out,Mat] "Permalink")  def log(name: String, extract: [Function](../../japi/function/Function.html)\[Out, [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)], log: [LoggingAdapter](../../event/LoggingAdapter.html)): Flow\[In, Out, Mat]Logs elements flowing through the stream as well as completion and erroring.

Logs elements flowing through the stream as well as completion and erroring.

By default element and completion signals are logged on debug level, and errors are logged on Error level.
This can be adjusted according to your needs by providing a custom [Attributes.LogLevels](../Attributes$$LogLevels.html) attribute on the given Flow:

The `extract` function will be applied to each element before logging, so it is possible to log only those fields
of a complex object flowing through this element.

Uses the given LoggingAdapter for logging.

Adheres to the [ActorAttributes.SupervisionStrategy](../ActorAttributes$$SupervisionStrategy.html) attribute.

**Emits when** the mapping function returns an element

**Backpressures when** downstream backpressures

**Completes when** upstream completes

**Cancels when** downstream cancels
92. [**](../../../akka/stream/javadsl/Flow.html#logWithMarker(name:String,marker:akka.japi.function.Function[Out,akka.event.LogMarker]):akka.stream.javadsl.Flow[In,Out,Mat] "Permalink")  def logWithMarker(name: String, marker: [Function](../../japi/function/Function.html)\[Out, [LogMarker](../../event/LogMarker.html)]): Flow\[In, Out, Mat]Logs elements flowing through the stream as well as completion and erroring.

Logs elements flowing through the stream as well as completion and erroring.

By default element and completion signals are logged on debug level, and errors are logged on Error level.
This can be adjusted according to your needs by providing a custom [Attributes.LogLevels](../Attributes$$LogLevels.html) attribute on the given Flow.

Uses an internally created MarkerLoggingAdapter which uses `akka.stream.Log` as it's source (use this class to configure slf4j loggers).

**Emits when** the mapping function returns an element

**Backpressures when** downstream backpressures

**Completes when** upstream completes

**Cancels when** downstream cancels
93. [**](../../../akka/stream/javadsl/Flow.html#logWithMarker(name:String,marker:akka.japi.function.Function[Out,akka.event.LogMarker],log:akka.event.MarkerLoggingAdapter):akka.stream.javadsl.Flow[In,Out,Mat] "Permalink")  def logWithMarker(name: String, marker: [Function](../../japi/function/Function.html)\[Out, [LogMarker](../../event/LogMarker.html)], log: [MarkerLoggingAdapter](../../event/MarkerLoggingAdapter.html)): Flow\[In, Out, Mat]Logs elements flowing through the stream as well as completion and erroring.

Logs elements flowing through the stream as well as completion and erroring.

By default element and completion signals are logged on debug level, and errors are logged on Error level.
This can be adjusted according to your needs by providing a custom [Attributes.LogLevels](../Attributes$$LogLevels.html) attribute on the given Flow:

Uses the given MarkerLoggingAdapter for logging.

**Emits when** the mapping function returns an element

**Backpressures when** downstream backpressures

**Completes when** upstream completes

**Cancels when** downstream cancels
94. [**](../../../akka/stream/javadsl/Flow.html#logWithMarker(name:String,marker:akka.japi.function.Function[Out,akka.event.LogMarker],extract:akka.japi.function.Function[Out,Any]):akka.stream.javadsl.Flow[In,Out,Mat] "Permalink")  def logWithMarker(name: String, marker: [Function](../../japi/function/Function.html)\[Out, [LogMarker](../../event/LogMarker.html)], extract: [Function](../../japi/function/Function.html)\[Out, [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)]): Flow\[In, Out, Mat]Logs elements flowing through the stream as well as completion and erroring.

Logs elements flowing through the stream as well as completion and erroring.

By default element and completion signals are logged on debug level, and errors are logged on Error level.
This can be adjusted according to your needs by providing a custom [Attributes.LogLevels](../Attributes$$LogLevels.html) attribute on the given Flow:

The `extract` function will be applied to each element before logging, so it is possible to log only those fields
of a complex object flowing through this element.

Uses an internally created MarkerLoggingAdapter which uses `akka.stream.Log` as it's source (use this class to configure slf4j loggers).

**Emits when** the mapping function returns an element

**Backpressures when** downstream backpressures

**Completes when** upstream completes

**Cancels when** downstream cancels
95. [**](../../../akka/stream/javadsl/Flow.html#logWithMarker(name:String,marker:akka.japi.function.Function[Out,akka.event.LogMarker],extract:akka.japi.function.Function[Out,Any],log:akka.event.MarkerLoggingAdapter):akka.stream.javadsl.Flow[In,Out,Mat] "Permalink")  def logWithMarker(name: String, marker: [Function](../../japi/function/Function.html)\[Out, [LogMarker](../../event/LogMarker.html)], extract: [Function](../../japi/function/Function.html)\[Out, [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)], log: [MarkerLoggingAdapter](../../event/MarkerLoggingAdapter.html)): Flow\[In, Out, Mat]Logs elements flowing through the stream as well as completion and erroring.

Logs elements flowing through the stream as well as completion and erroring.

By default element and completion signals are logged on debug level, and errors are logged on Error level.
This can be adjusted according to your needs by providing a custom [Attributes.LogLevels](../Attributes$$LogLevels.html) attribute on the given Flow:

The `extract` function will be applied to each element before logging, so it is possible to log only those fields
of a complex object flowing through this element.

Uses the given MarkerLoggingAdapter for logging.

Adheres to the [ActorAttributes.SupervisionStrategy](../ActorAttributes$$SupervisionStrategy.html) attribute.

**Emits when** the mapping function returns an element

**Backpressures when** downstream backpressures

**Completes when** upstream completes

**Cancels when** downstream cancels
96. [**](../../../akka/stream/javadsl/Flow.html#map[T](f:akka.japi.function.Function[Out,T]):akka.stream.javadsl.Flow[In,T,Mat] "Permalink")  def map\[T](f: [Function](../../japi/function/Function.html)\[Out, T]): Flow\[In, T, Mat]Transform this stream by applying the given function to each of the elements
as they pass through this processing step.

Transform this stream by applying the given function to each of the elements
as they pass through this processing step.

Adheres to the [ActorAttributes.SupervisionStrategy](../ActorAttributes$$SupervisionStrategy.html) attribute.

**Emits when** the mapping function returns an element

**Backpressures when** downstream backpressures

**Completes when** upstream completes

**Cancels when** downstream cancels
97. [**](../../../akka/stream/javadsl/Flow.html#mapAsync[T](parallelism:Int,f:akka.japi.function.Function[Out,java.util.concurrent.CompletionStage[T]]):akka.stream.javadsl.Flow[In,T,Mat] "Permalink")  def mapAsync\[T](parallelism: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), f: [Function](../../japi/function/Function.html)\[Out, [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[T]]): Flow\[In, T, Mat]Transform this stream by applying the given function to each of the elements
as they pass through this processing step.

Transform this stream by applying the given function to each of the elements
as they pass through this processing step. The function returns a `CompletionStage` and the
value of that future will be emitted downstream. The number of CompletionStages
that shall run in parallel is given as the first argument to `mapAsync`.
These CompletionStages may complete in any order, but the elements that
are emitted downstream are in the same order as received from upstream.

If the function `f` throws an exception or if the `CompletionStage` is completed
with failure and the supervision decision is [akka.stream.Supervision\#stop](../Supervision$.html#stop:akka.stream.Supervision.Stop.type)
the stream will be completed with failure.

If the function `f` throws an exception or if the `CompletionStage` is completed
with failure and the supervision decision is [akka.stream.Supervision\#resume](../Supervision$.html#resume:akka.stream.Supervision.Resume.type) or
[akka.stream.Supervision\#restart](../Supervision$.html#restart:akka.stream.Supervision.Restart.type) the element is dropped and the stream continues.

If the `CompletionStage` is completed with `null`, it is ignored and the next element is processed.

The function `f` is always invoked on the elements in the order they arrive.

**Emits when** the CompletionStage returned by the provided function finishes for the next element in sequence

**Backpressures when** the number of CompletionStages reaches the configured parallelism and the downstream
backpressures or the first future is not completed

**Completes when** upstream completes and all CompletionStages have been completed and all elements have been emitted

**Cancels when** downstream cancels

See also[\#mapAsyncUnordered](#mapAsyncUnordered[T](parallelism:Int,f:akka.japi.function.Function[Out,java.util.concurrent.CompletionStage[T]]):akka.stream.javadsl.Flow[In,T,Mat]) and [\#mapAsyncPartitioned](#mapAsyncPartitioned[T,P](parallelism:Int,perPartition:Int,partitioner:akka.japi.function.Function[Out,P],f:java.util.function.BiFunction[Out,P,java.util.concurrent.CompletionStage[T]]):akka.stream.javadsl.Flow[In,T,Mat])
98. [**](../../../akka/stream/javadsl/Flow.html#mapAsyncPartitioned[T,P](parallelism:Int,perPartition:Int,partitioner:akka.japi.function.Function[Out,P],f:java.util.function.BiFunction[Out,P,java.util.concurrent.CompletionStage[T]]):akka.stream.javadsl.Flow[In,T,Mat] "Permalink")  def mapAsyncPartitioned\[T, P](parallelism: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), perPartition: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), partitioner: [Function](../../japi/function/Function.html)\[Out, P], f: [BiFunction](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/BiFunction.html#java.util.function.BiFunction)\[Out, P, [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[T]]): Flow\[In, T, Mat]Transform this stream by partitioning elements based on the provided partitioner as they pass through this
processing step and then applying a given `CompletionStage`\-returning function to each element and its
partition key.

Transform this stream by partitioning elements based on the provided partitioner as they pass through this
processing step and then applying a given `CompletionStage`\-returning function to each element and its
partition key. The value of the returned future, if successful, will be emitted downstream.

The number of CompletionStages running at any given time is bounded by the 'parallelism' and 'perPartition'
values. The CompletionStages may complete in any order, but the results are emitted in the same order as
the corresponding elements were received.

If the functions 'partitioner' or 'f' throw an exception, or if the 'CompletionStage' is completed with failure,
supervision will be applied to determine a decision. If the decision is [akka.stream.Supervision\#stop](../Supervision$.html#stop:akka.stream.Supervision.Stop.type), the
stream will be completed with failure; otherwise the element will be dropped and the stream continues.

The function 'partitioner' is always invoked on the elements in the order they arrive.

The function 'f' is invoked on elements with the same partition key in the order they arrive. The order of
invocation of 'f' for elements with different partition keys is undefined and subject to factors including, but
not limited to, the distribution of partition keys within the stream.

**Emits when** the CompletionStage returned by the provided function 'f' finishes for the next element in
sequence

**Backpressures when** the number of elements for which no resulting CompletionStage has completed reaches the
configured parallelism and the downstream backpressures or the first CompletionStage has not completed

**Completes when** upstream completes and all CompletionStages have been completed and all elements have
been emitted

**Cancels when** downstream cancels

See also[\#mapAsync](#mapAsync[T](parallelism:Int,f:akka.japi.function.Function[Out,java.util.concurrent.CompletionStage[T]]):akka.stream.javadsl.Flow[In,T,Mat]) and [\#mapAsyncUnordered](#mapAsyncUnordered[T](parallelism:Int,f:akka.japi.function.Function[Out,java.util.concurrent.CompletionStage[T]]):akka.stream.javadsl.Flow[In,T,Mat])
99. [**](../../../akka/stream/javadsl/Flow.html#mapAsyncUnordered[T](parallelism:Int,f:akka.japi.function.Function[Out,java.util.concurrent.CompletionStage[T]]):akka.stream.javadsl.Flow[In,T,Mat] "Permalink")  def mapAsyncUnordered\[T](parallelism: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), f: [Function](../../japi/function/Function.html)\[Out, [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[T]]): Flow\[In, T, Mat]Transform this stream by applying the given function to each of the elements
as they pass through this processing step.

Transform this stream by applying the given function to each of the elements
as they pass through this processing step. The function returns a `CompletionStage` and the
value of that future will be emitted downstream. The number of CompletionStages
that shall run in parallel is given as the first argument to `mapAsyncUnordered`.
Each processed element will be emitted downstream as soon as it is ready, i.e. it is possible
that the elements are not emitted downstream in the same order as received from upstream.

If the function `f` throws an exception or if the `CompletionStage` is completed
with failure and the supervision decision is [akka.stream.Supervision\#stop](../Supervision$.html#stop:akka.stream.Supervision.Stop.type)
the stream will be completed with failure.

If the function `f` throws an exception or if the `CompletionStage` is completed
with failure and the supervision decision is [akka.stream.Supervision\#resume](../Supervision$.html#resume:akka.stream.Supervision.Resume.type) or
[akka.stream.Supervision\#restart](../Supervision$.html#restart:akka.stream.Supervision.Restart.type) the element is dropped and the stream continues.

If the `CompletionStage` is completed with `null`, it is ignored and the next element is processed.

The function `f` is always invoked on the elements in the order they arrive (even though the result of the futures
returned by `f` might be emitted in a different order).

Adheres to the [ActorAttributes.SupervisionStrategy](../ActorAttributes$$SupervisionStrategy.html) attribute.

**Emits when** any of the CompletionStages returned by the provided function complete

**Backpressures when** the number of CompletionStages reaches the configured parallelism and the downstream backpressures

**Completes when** upstream completes and all CompletionStages have been completed and all elements have been emitted

**Cancels when** downstream cancels

See also[\#mapAsync](#mapAsync[T](parallelism:Int,f:akka.japi.function.Function[Out,java.util.concurrent.CompletionStage[T]]):akka.stream.javadsl.Flow[In,T,Mat]) and [\#mapAsyncPartitioned](#mapAsyncPartitioned[T,P](parallelism:Int,perPartition:Int,partitioner:akka.japi.function.Function[Out,P],f:java.util.function.BiFunction[Out,P,java.util.concurrent.CompletionStage[T]]):akka.stream.javadsl.Flow[In,T,Mat])
100. [**](../../../akka/stream/javadsl/Flow.html#mapConcat[T](f:akka.japi.function.Function[Out,Iterable[T]]):akka.stream.javadsl.Flow[In,T,Mat] "Permalink")  def mapConcat\[T](f: [Function](../../japi/function/Function.html)\[Out, [Iterable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Iterable.html#java.lang.Iterable)\[T]]): Flow\[In, T, Mat]Transform each input element into an `Iterable` of output elements that is
then flattened into the output stream.

Transform each input element into an `Iterable` of output elements that is
then flattened into the output stream.

Make sure that the `Iterable` is immutable or at least not modified after
being used as an output sequence. Otherwise the stream may fail with
`ConcurrentModificationException` or other more subtle errors may occur.

The returned `Iterable` MUST NOT contain `null` values,
as they are illegal as stream elements \- according to the Reactive Streams specification.

**Emits when** the mapping function returns an element or there are still remaining elements
from the previously calculated collection

**Backpressures when** downstream backpressures or there are still remaining elements from the
previously calculated collection

**Completes when** upstream completes and all remaining elements have been emitted

**Cancels when** downstream cancels
101. [**](../../../akka/stream/javadsl/Flow.html#mapError[E<:Throwable](clazz:Class[E],f:akka.japi.function.Function[E,Throwable]):akka.stream.javadsl.Flow[In,Out,Mat] "Permalink")  def mapError\[E \<: Throwable](clazz: Class\[E], f: [Function](../../japi/function/Function.html)\[E, Throwable]): Flow\[In, Out, Mat]While similar to [recover](#recover(clazz:Class[_<:Throwable],supplier:java.util.function.Supplier[Out]):akka.stream.javadsl.Flow[In,Out,Mat]) this operator can be used to transform an error signal to a different one \*without\* logging
it as an error in the process.

While similar to [recover](#recover(clazz:Class[_<:Throwable],supplier:java.util.function.Supplier[Out]):akka.stream.javadsl.Flow[In,Out,Mat]) this operator can be used to transform an error signal to a different one \*without\* logging
it as an error in the process. So in that sense it is NOT exactly equivalent to `recover(t => throw t2)` since recover
would log the `t2` error.

Since the underlying failure signal onError arrives out\-of\-band, it might jump over existing elements.
This operator can recover the failure signal, but not the skipped elements, which will be dropped.

Similarly to [recover](#recover(clazz:Class[_<:Throwable],supplier:java.util.function.Supplier[Out]):akka.stream.javadsl.Flow[In,Out,Mat]) throwing an exception inside `mapError` \_will\_ be logged.

**Emits when** element is available from the upstream or upstream is failed and pf returns an element

**Backpressures when** downstream backpressures

**Completes when** upstream completes or upstream failed with exception pf can handle

**Cancels when** downstream cancels
102. [**](../../../akka/stream/javadsl/Flow.html#mapError(pf:PartialFunction[Throwable,Throwable]):akka.stream.javadsl.Flow[In,Out,Mat] "Permalink")  def mapError(pf: [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[Throwable, Throwable]): Flow\[In, Out, Mat]While similar to [recover](#recover(clazz:Class[_<:Throwable],supplier:java.util.function.Supplier[Out]):akka.stream.javadsl.Flow[In,Out,Mat]) this operator can be used to transform an error signal to a different one \*without\* logging
it as an error in the process.

While similar to [recover](#recover(clazz:Class[_<:Throwable],supplier:java.util.function.Supplier[Out]):akka.stream.javadsl.Flow[In,Out,Mat]) this operator can be used to transform an error signal to a different one \*without\* logging
it as an error in the process. So in that sense it is NOT exactly equivalent to `recover(t => throw t2)` since recover
would log the `t2` error.

Since the underlying failure signal onError arrives out\-of\-band, it might jump over existing elements.
This operator can recover the failure signal, but not the skipped elements, which will be dropped.

Similarly to [recover](#recover(clazz:Class[_<:Throwable],supplier:java.util.function.Supplier[Out]):akka.stream.javadsl.Flow[In,Out,Mat]) throwing an exception inside `mapError` \_will\_ be logged.

**Emits when** element is available from the upstream or upstream is failed and pf returns an element

**Backpressures when** downstream backpressures

**Completes when** upstream completes or upstream failed with exception pf can handle

**Cancels when** downstream cancels
103. [**](../../../akka/stream/javadsl/Flow.html#mapMaterializedValue[Mat2](f:akka.japi.function.Function[Mat,Mat2]):akka.stream.javadsl.Flow[In,Out,Mat2] "Permalink")  def mapMaterializedValue\[Mat2](f: [Function](../../japi/function/Function.html)\[Mat, Mat2]): Flow\[In, Out, Mat2]Transform only the materialized value of this Flow, leaving all other properties as they were.
104. [**](../../../akka/stream/javadsl/Flow.html#mapWithResource[R,T](create:java.util.function.Supplier[R],f:java.util.function.BiFunction[R,Out,T],close:java.util.function.Function[R,java.util.Optional[T]]):akka.stream.javadsl.Flow[In,T,Mat] "Permalink")  def mapWithResource\[R, T](create: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[R], f: [BiFunction](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/BiFunction.html#java.util.function.BiFunction)\[R, Out, T], close: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[R, [Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[T]]): Flow\[In, T, Mat]Transform each stream element with the help of a resource.

Transform each stream element with the help of a resource.

The resource creation function is invoked once when the stream is materialized and the returned resource is passed to
the mapping function for mapping the first element. The mapping function returns a mapped element to emit
downstream. The returned `T` MUST NOT be `null` as it is illegal as stream element \- according to the Reactive Streams specification.

The `close` function is called only once when the upstream or downstream finishes or fails. You can do some clean\-up here,
and if the returned value is not empty, it will be emitted to the downstream if available, otherwise the value will be dropped.

Early completion can be done with combination of the [takeWhile](#takeWhile(p:akka.japi.function.Predicate[Out]):akka.stream.javadsl.Flow[In,Out,Mat]) operator.

Adheres to the [ActorAttributes.SupervisionStrategy](../ActorAttributes$$SupervisionStrategy.html) attribute.

You can configure the default dispatcher for this Source by changing the `akka.stream.materializer.blocking-io-dispatcher` or
set it for a given Source by using [ActorAttributes](../ActorAttributes$.html).

**Emits when** the mapping function returns an element and downstream is ready to consume it

**Backpressures when** downstream backpressures

**Completes when** upstream completes

**Cancels when** downstream cancels

Rthe type of the resource

Tthe type of the output elements

createfunction that creates the resource

ffunction that transforms the upstream element and the resource to output element

closefunction that closes the resource, optionally outputting a last element
105. [**](../../../akka/stream/javadsl/Flow.html#merge(that:akka.stream.Graph[akka.stream.SourceShape[Out],_],eagerComplete:Boolean):akka.stream.javadsl.Flow[In,Out,Mat] "Permalink")  def merge(that: [Graph](../Graph.html)\[[SourceShape](../SourceShape.html)\[Out], \_], eagerComplete: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): Flow\[In, Out, Mat]Merge the given [Source](Source.html) to this Flow, taking elements as they arrive from input streams,
picking randomly when several elements ready.

Merge the given [Source](Source.html) to this Flow, taking elements as they arrive from input streams,
picking randomly when several elements ready.

**Emits when** one of the inputs has an element available

**Backpressures when** downstream backpressures

**Completes when** all upstreams complete (eagerComplete\=false) or one upstream completes (eagerComplete\=true), default value is `false`

**Cancels when** downstream cancels
106. [**](../../../akka/stream/javadsl/Flow.html#merge(that:akka.stream.Graph[akka.stream.SourceShape[Out],_]):akka.stream.javadsl.Flow[In,Out,Mat] "Permalink")  def merge(that: [Graph](../Graph.html)\[[SourceShape](../SourceShape.html)\[Out], \_]): Flow\[In, Out, Mat]Merge the given [Source](Source.html) to this Flow, taking elements as they arrive from input streams,
picking randomly when several elements ready.

Merge the given [Source](Source.html) to this Flow, taking elements as they arrive from input streams,
picking randomly when several elements ready.

**Emits when** one of the inputs has an element available

**Backpressures when** downstream backpressures

**Completes when** all upstreams complete

**Cancels when** downstream cancels
107. [**](../../../akka/stream/javadsl/Flow.html#mergeAll(those:java.util.List[_<:akka.stream.Graph[akka.stream.SourceShape[Out],_]],eagerComplete:Boolean):akka.stream.javadsl.Flow[In,Out,Mat] "Permalink")  def mergeAll(those: [List](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/List.html#java.util.List)\[\_ \<: [Graph](../Graph.html)\[[SourceShape](../SourceShape.html)\[Out], \_]], eagerComplete: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): Flow\[In, Out, Mat]Merge the given [Source](Source.html)s to this Flow, taking elements as they arrive from input streams,
picking randomly when several elements ready.

Merge the given [Source](Source.html)s to this Flow, taking elements as they arrive from input streams,
picking randomly when several elements ready.

**Emits when** one of the inputs has an element available

**Backpressures when** downstream backpressures

**Completes when** all upstreams complete (eagerComplete\=false) or one upstream completes (eagerComplete\=true), default value is `false`

**Cancels when** downstream cancels
108. [**](../../../akka/stream/javadsl/Flow.html#mergeLatest(that:akka.stream.Graph[akka.stream.SourceShape[Out],_],eagerComplete:Boolean):akka.stream.javadsl.Flow[In,java.util.List[Out],Mat] "Permalink")  def mergeLatest(that: [Graph](../Graph.html)\[[SourceShape](../SourceShape.html)\[Out], \_], eagerComplete: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): Flow\[In, [List](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/List.html#java.util.List)\[Out], Mat]MergeLatest joins elements from N input streams into stream of lists of size N.

MergeLatest joins elements from N input streams into stream of lists of size N.
i\-th element in list is the latest emitted element from i\-th input stream.
MergeLatest emits list for each element emitted from some input stream,
but only after each input stream emitted at least one element.

**Emits when** an element is available from some input and each input emits at least one element from stream start

**Completes when** all upstreams complete (eagerClose\=false) or one upstream completes (eagerClose\=true)
109. [**](../../../akka/stream/javadsl/Flow.html#mergeLatestMat[Mat2,Mat3](that:akka.stream.Graph[akka.stream.SourceShape[Out],Mat2],eagerComplete:Boolean,matF:akka.japi.function.Function2[Mat,Mat2,Mat3]):akka.stream.javadsl.Flow[In,java.util.List[Out],Mat3] "Permalink")  def mergeLatestMat\[Mat2, Mat3](that: [Graph](../Graph.html)\[[SourceShape](../SourceShape.html)\[Out], Mat2], eagerComplete: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), matF: [Function2](../../japi/function/Function2.html)\[Mat, Mat2, Mat3]): Flow\[In, [List](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/List.html#java.util.List)\[Out], Mat3]MergeLatest joins elements from N input streams into stream of lists of size N.

MergeLatest joins elements from N input streams into stream of lists of size N.
i\-th element in list is the latest emitted element from i\-th input stream.
MergeLatest emits list for each element emitted from some input stream,
but only after each input stream emitted at least one element.

It is recommended to use the internally optimized `Keep.left` and `Keep.right` combiners
where appropriate instead of manually writing functions that pass through one of the values.
110. [**](../../../akka/stream/javadsl/Flow.html#mergeMat[M,M2](that:akka.stream.Graph[akka.stream.SourceShape[Out],M],matF:akka.japi.function.Function2[Mat,M,M2],eagerComplete:Boolean):akka.stream.javadsl.Flow[In,Out,M2] "Permalink")  def mergeMat\[M, M2](that: [Graph](../Graph.html)\[[SourceShape](../SourceShape.html)\[Out], M], matF: [Function2](../../japi/function/Function2.html)\[Mat, M, M2], eagerComplete: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): Flow\[In, Out, M2]Merge the given [Source](Source.html) to this Flow, taking elements as they arrive from input streams,
picking randomly when several elements ready.

Merge the given [Source](Source.html) to this Flow, taking elements as they arrive from input streams,
picking randomly when several elements ready.

It is recommended to use the internally optimized `Keep.left` and `Keep.right` combiners
where appropriate instead of manually writing functions that pass through one of the values.

See also[\#merge](#merge(that:akka.stream.Graph[akka.stream.SourceShape[Out],_],eagerComplete:Boolean):akka.stream.javadsl.Flow[In,Out,Mat])
111. [**](../../../akka/stream/javadsl/Flow.html#mergeMat[M,M2](that:akka.stream.Graph[akka.stream.SourceShape[Out],M],matF:akka.japi.function.Function2[Mat,M,M2]):akka.stream.javadsl.Flow[In,Out,M2] "Permalink")  def mergeMat\[M, M2](that: [Graph](../Graph.html)\[[SourceShape](../SourceShape.html)\[Out], M], matF: [Function2](../../japi/function/Function2.html)\[Mat, M, M2]): Flow\[In, Out, M2]Merge the given [Source](Source.html) to this Flow, taking elements as they arrive from input streams,
picking randomly when several elements ready.

Merge the given [Source](Source.html) to this Flow, taking elements as they arrive from input streams,
picking randomly when several elements ready.

It is recommended to use the internally optimized `Keep.left` and `Keep.right` combiners
where appropriate instead of manually writing functions that pass through one of the values.

See also[\#merge](#merge(that:akka.stream.Graph[akka.stream.SourceShape[Out],_],eagerComplete:Boolean):akka.stream.javadsl.Flow[In,Out,Mat])
112. [**](../../../akka/stream/javadsl/Flow.html#mergePreferred(that:akka.stream.Graph[akka.stream.SourceShape[Out],_],preferred:Boolean,eagerComplete:Boolean):akka.stream.javadsl.Flow[In,Out,Mat] "Permalink")  def mergePreferred(that: [Graph](../Graph.html)\[[SourceShape](../SourceShape.html)\[Out], \_], preferred: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), eagerComplete: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): Flow\[In, Out, Mat]Merge two sources.

Merge two sources. Prefer one source if both sources have elements ready.

**emits** when one of the inputs has an element available. If multiple have elements available, prefer the 'right' one when 'preferred' is 'true', or the 'left' one when 'preferred' is 'false'.

**backpressures** when downstream backpressures

**completes** when all upstreams complete (This behavior is changeable to completing when any upstream completes by setting `eagerComplete=true`.)
113. [**](../../../akka/stream/javadsl/Flow.html#mergePreferredMat[Mat2,Mat3](that:akka.stream.Graph[akka.stream.SourceShape[Out],Mat2],preferred:Boolean,eagerComplete:Boolean,matF:akka.japi.function.Function2[Mat,Mat2,Mat3]):akka.stream.javadsl.Flow[In,Out,Mat3] "Permalink")  def mergePreferredMat\[Mat2, Mat3](that: [Graph](../Graph.html)\[[SourceShape](../SourceShape.html)\[Out], Mat2], preferred: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), eagerComplete: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), matF: [Function2](../../japi/function/Function2.html)\[Mat, Mat2, Mat3]): Flow\[In, Out, Mat3]Merge two sources.

Merge two sources. Prefer one source if both sources have elements ready.

It is recommended to use the internally optimized `Keep.left` and `Keep.right` combiners
where appropriate instead of manually writing functions that pass through one of the values.
114. [**](../../../akka/stream/javadsl/Flow.html#mergePrioritized(that:akka.stream.Graph[akka.stream.SourceShape[Out],_],leftPriority:Int,rightPriority:Int,eagerComplete:Boolean):akka.stream.javadsl.Flow[In,Out,Mat] "Permalink")  def mergePrioritized(that: [Graph](../Graph.html)\[[SourceShape](../SourceShape.html)\[Out], \_], leftPriority: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), rightPriority: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), eagerComplete: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): Flow\[In, Out, Mat]Merge two sources.

Merge two sources. Prefer the sources depending on the 'priority' parameters.

**emits** when one of the inputs has an element available, preferring inputs based on the 'priority' parameters if both have elements available

**backpressures** when downstream backpressures

**completes** when both upstreams complete (This behavior is changeable to completing when any upstream completes by setting `eagerComplete=true`.)
115. [**](../../../akka/stream/javadsl/Flow.html#mergePrioritizedMat[Mat2,Mat3](that:akka.stream.Graph[akka.stream.SourceShape[Out],Mat2],leftPriority:Int,rightPriority:Int,eagerComplete:Boolean,matF:akka.japi.function.Function2[Mat,Mat2,Mat3]):akka.stream.javadsl.Flow[In,Out,Mat3] "Permalink")  def mergePrioritizedMat\[Mat2, Mat3](that: [Graph](../Graph.html)\[[SourceShape](../SourceShape.html)\[Out], Mat2], leftPriority: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), rightPriority: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), eagerComplete: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), matF: [Function2](../../japi/function/Function2.html)\[Mat, Mat2, Mat3]): Flow\[In, Out, Mat3]Merge two sources.

Merge two sources. Prefer the sources depending on the 'priority' parameters.

It is recommended to use the internally optimized `Keep.left` and `Keep.right` combiners
where appropriate instead of manually writing functions that pass through one of the values.
116. [**](../../../akka/stream/javadsl/Flow.html#mergeSorted[M](that:akka.stream.Graph[akka.stream.SourceShape[Out],M],comp:java.util.Comparator[Out]):akka.stream.javadsl.Flow[In,Out,Mat] "Permalink")  def mergeSorted\[M](that: [Graph](../Graph.html)\[[SourceShape](../SourceShape.html)\[Out], M], comp: [Comparator](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Comparator.html#java.util.Comparator)\[Out]): Flow\[In, Out, Mat]Merge the given [Source](Source.html) to this Flow, taking elements as they arrive from input streams,
picking always the smallest of the available elements (waiting for one element from each side
to be available).

Merge the given [Source](Source.html) to this Flow, taking elements as they arrive from input streams,
picking always the smallest of the available elements (waiting for one element from each side
to be available). This means that possible contiguity of the input streams is not exploited to avoid
waiting for elements, this merge will block when one of the inputs does not have more elements (and
does not complete).

**Emits when** all of the inputs have an element available

**Backpressures when** downstream backpressures

**Completes when** all upstreams complete

**Cancels when** downstream cancels
117. [**](../../../akka/stream/javadsl/Flow.html#mergeSortedMat[Mat2,Mat3](that:akka.stream.Graph[akka.stream.SourceShape[Out],Mat2],comp:java.util.Comparator[Out],matF:akka.japi.function.Function2[Mat,Mat2,Mat3]):akka.stream.javadsl.Flow[In,Out,Mat3] "Permalink")  def mergeSortedMat\[Mat2, Mat3](that: [Graph](../Graph.html)\[[SourceShape](../SourceShape.html)\[Out], Mat2], comp: [Comparator](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Comparator.html#java.util.Comparator)\[Out], matF: [Function2](../../japi/function/Function2.html)\[Mat, Mat2, Mat3]): Flow\[In, Out, Mat3]Merge the given [Source](Source.html) to this Flow, taking elements as they arrive from input streams,
picking always the smallest of the available elements (waiting for one element from each side
to be available).

Merge the given [Source](Source.html) to this Flow, taking elements as they arrive from input streams,
picking always the smallest of the available elements (waiting for one element from each side
to be available). This means that possible contiguity of the input streams is not exploited to avoid
waiting for elements, this merge will block when one of the inputs does not have more elements (and
does not complete).

It is recommended to use the internally optimized `Keep.left` and `Keep.right` combiners
where appropriate instead of manually writing functions that pass through one of the values.

See also[\#mergeSorted](#mergeSorted[M](that:akka.stream.Graph[akka.stream.SourceShape[Out],M],comp:java.util.Comparator[Out]):akka.stream.javadsl.Flow[In,Out,Mat]).
118. [**](../../../akka/stream/javadsl/Flow.html#monitor():akka.stream.javadsl.Flow[In,Out,akka.japi.Pair[Mat,akka.stream.FlowMonitor[Out]]] "Permalink")  def monitor(): Flow\[In, Out, [Pair](../../japi/Pair.html)\[Mat, [FlowMonitor](../FlowMonitor.html)\[Out]]]Materializes to `Pair<Mat, FlowMonitor<<Out>>`, which is unlike most other operators (!),
in which usually the default materialized value keeping semantics is to keep the left value
(by passing `Keep.left()` to a `*Mat` version of a method).

Materializes to `Pair<Mat, FlowMonitor<<Out>>`, which is unlike most other operators (!),
in which usually the default materialized value keeping semantics is to keep the left value
(by passing `Keep.left()` to a `*Mat` version of a method). This operator is an exception from
that rule and keeps both values since dropping its sole purpose is to introduce that materialized value.

The `FlowMonitor[Out]` allows monitoring of the current flow. All events are propagated
by the monitor unchanged. Note that the monitor inserts a memory barrier every time it processes an
event, and may therefor affect performance.
119. [**](../../../akka/stream/javadsl/Flow.html#monitorMat[M](combine:akka.japi.function.Function2[Mat,akka.stream.FlowMonitor[Out],M]):akka.stream.javadsl.Flow[In,Out,M] "Permalink")  def monitorMat\[M](combine: [Function2](../../japi/function/Function2.html)\[Mat, [FlowMonitor](../FlowMonitor.html)\[Out], M]): Flow\[In, Out, M]Materializes to `FlowMonitor[Out]` that allows monitoring of the current flow.

Materializes to `FlowMonitor[Out]` that allows monitoring of the current flow. All events are propagated
by the monitor unchanged. Note that the monitor inserts a memory barrier every time it processes an
event, and may therefor affect performance.

The `combine` function is used to combine the `FlowMonitor` with this flow's materialized value.
120. [**](../../../akka/stream/javadsl/Flow.html#named(name:String):akka.stream.javadsl.Flow[In,Out,Mat] "Permalink")  def named(name: String): Flow\[In, Out, Mat]Add a `name` attribute to this Flow.

Add a `name` attribute to this Flow.

Definition ClassesFlow → [Graph](../Graph.html)
121. [**](../../../akka/stream/javadsl/Flow.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
122. [**](../../../akka/stream/javadsl/Flow.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
123. [**](../../../akka/stream/javadsl/Flow.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
124. [**](../../../akka/stream/javadsl/Flow.html#onErrorComplete(predicate:java.util.function.Predicate[_>:Throwable]):akka.stream.javadsl.Flow[In,Out,Mat] "Permalink")  def onErrorComplete(predicate: [Predicate](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Predicate.html#java.util.function.Predicate)\[\_ \>: Throwable]): Flow\[In, Out, Mat]onErrorComplete allows to complete the stream when an upstream error occurs.

onErrorComplete allows to complete the stream when an upstream error occurs.

Since the underlying failure signal onError arrives out\-of\-band, it might jump over existing elements.
This operator can recover the failure signal, but not the skipped elements, which will be dropped.

**Emits when** element is available from the upstream

**Backpressures when** downstream backpressures

**Completes when** upstream completes or failed with predicate return ture

**Cancels when** downstream cancels
125. [**](../../../akka/stream/javadsl/Flow.html#onErrorComplete(clazz:Class[_<:Throwable]):akka.stream.javadsl.Flow[In,Out,Mat] "Permalink")  def onErrorComplete(clazz: Class\[\_ \<: Throwable]): Flow\[In, Out, Mat]onErrorComplete allows to complete the stream when an upstream error occurs.

onErrorComplete allows to complete the stream when an upstream error occurs.

Since the underlying failure signal onError arrives out\-of\-band, it might jump over existing elements.
This operator can recover the failure signal, but not the skipped elements, which will be dropped.

**Emits when** element is available from the upstream

**Backpressures when** downstream backpressures

**Completes when** upstream completes or failed with exception is an instance of the provided type

**Cancels when** downstream cancels
126. [**](../../../akka/stream/javadsl/Flow.html#onErrorComplete():akka.stream.javadsl.Flow[In,Out,Mat] "Permalink")  def onErrorComplete(): Flow\[In, Out, Mat]onErrorComplete allows to complete the stream when an upstream error occurs.

onErrorComplete allows to complete the stream when an upstream error occurs.

Since the underlying failure signal onError arrives out\-of\-band, it might jump over existing elements.
This operator can recover the failure signal, but not the skipped elements, which will be dropped.

**Emits when** element is available from the upstream

**Backpressures when** downstream backpressures

**Completes when** upstream completes or failed with exception is an instance of the provided type

**Cancels when** downstream cancels
127. [**](../../../akka/stream/javadsl/Flow.html#orElse[M](secondary:akka.stream.Graph[akka.stream.SourceShape[Out],M]):akka.stream.javadsl.Flow[In,Out,Mat] "Permalink")  def orElse\[M](secondary: [Graph](../Graph.html)\[[SourceShape](../SourceShape.html)\[Out], M]): Flow\[In, Out, Mat]Provides a secondary source that will be consumed if this source completes without any
elements passing by.

Provides a secondary source that will be consumed if this source completes without any
elements passing by. As soon as the first element comes through this stream, the alternative
will be cancelled.

Note that this Flow will be materialized together with the [Source](Source.html) and just kept
from producing elements by asserting back\-pressure until its time comes or it gets
cancelled.

On errors the operator is failed regardless of source of the error.

**Emits when** element is available from first stream or first stream closed without emitting any elements and an element
 is available from the second stream

**Backpressures when** downstream backpressures

**Completes when** the primary stream completes after emitting at least one element, when the primary stream completes
 without emitting and the secondary stream already has completed or when the secondary stream completes

**Cancels when** downstream cancels and additionally the alternative is cancelled as soon as an element passes
 by from this stream.
128. [**](../../../akka/stream/javadsl/Flow.html#orElseMat[M2,M3](secondary:akka.stream.Graph[akka.stream.SourceShape[Out],M2],matF:akka.japi.function.Function2[Mat,M2,M3]):akka.stream.javadsl.Flow[In,Out,M3] "Permalink")  def orElseMat\[M2, M3](secondary: [Graph](../Graph.html)\[[SourceShape](../SourceShape.html)\[Out], M2], matF: [Function2](../../japi/function/Function2.html)\[Mat, M2, M3]): Flow\[In, Out, M3]Provides a secondary source that will be consumed if this source completes without any
elements passing by.

Provides a secondary source that will be consumed if this source completes without any
elements passing by. As soon as the first element comes through this stream, the alternative
will be cancelled.

It is recommended to use the internally optimized `Keep.left` and `Keep.right` combiners
where appropriate instead of manually writing functions that pass through one of the values.

See also[\#orElse](#orElse[M](secondary:akka.stream.Graph[akka.stream.SourceShape[Out],M]):akka.stream.javadsl.Flow[In,Out,Mat])
129. [**](../../../akka/stream/javadsl/Flow.html#preMaterialize(materializer:akka.stream.Materializer):akka.japi.Pair[Mat@scala.annotation.unchecked.uncheckedVariance,akka.stream.javadsl.Flow[In,Out,akka.NotUsed]] "Permalink")  def preMaterialize(materializer: [Materializer](../Materializer.html)): [Pair](../../japi/Pair.html)\[Mat, Flow\[In, Out, [NotUsed](../../NotUsed.html)]]Materializes this Flow, immediately returning (1\) its materialized value, and (2\) a newly materialized Flow.

Materializes this Flow, immediately returning (1\) its materialized value, and (2\) a newly materialized Flow.
The returned flow is partial materialized and do not support multiple times materialization.

Note that `preMaterialize` is implemented through a reactive streams `Publisher` and `Subscriber` pair which means that
a buffer is introduced and that errors are not propagated upstream but are turned into cancellations without error details.
130. [**](../../../akka/stream/javadsl/Flow.html#preMaterialize(systemProvider:akka.actor.ClassicActorSystemProvider):akka.japi.Pair[Mat@scala.annotation.unchecked.uncheckedVariance,akka.stream.javadsl.Flow[In,Out,akka.NotUsed]] "Permalink")  def preMaterialize(systemProvider: [ClassicActorSystemProvider](../../actor/ClassicActorSystemProvider.html)): [Pair](../../japi/Pair.html)\[Mat, Flow\[In, Out, [NotUsed](../../NotUsed.html)]]Materializes this Flow, immediately returning (1\) its materialized value, and (2\) a newly materialized Flow.

Materializes this Flow, immediately returning (1\) its materialized value, and (2\) a newly materialized Flow.

Note that `preMaterialize` is implemented through a reactive streams `Publisher` and `Subscriber` pair which means that
a buffer is introduced and that errors are not propagated upstream but are turned into cancellations without error details.
131. [**](../../../akka/stream/javadsl/Flow.html#prefixAndTail(n:Int):akka.stream.javadsl.Flow[In,akka.japi.Pair[java.util.List[Out],akka.stream.javadsl.Source[Out,akka.NotUsed]],Mat] "Permalink")  def prefixAndTail(n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): Flow\[In, [Pair](../../japi/Pair.html)\[[List](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/List.html#java.util.List)\[Out], [Source](Source.html)\[Out, [NotUsed](../../NotUsed.html)]], Mat]Takes up to `n` elements from the stream (less than `n` if the upstream completes before emitting `n` elements)
and returns a pair containing a strict sequence of the taken element
and a stream representing the remaining elements.

Takes up to `n` elements from the stream (less than `n` if the upstream completes before emitting `n` elements)
and returns a pair containing a strict sequence of the taken element
and a stream representing the remaining elements. If *n* is zero or negative, then this will return a pair
of an empty collection and a stream containing the whole upstream unchanged.

In case of an upstream error, depending on the current state

	- the master stream signals the error if less than `n` elements have been seen, and therefore the substream
	 has not yet been emitted
	- the tail substream signals the error after the prefix and tail has been emitted by the main stream
	 (at that point the main stream has already completed)**Emits when** the configured number of prefix elements are available. Emits this prefix, and the rest
as a substream

**Backpressures when** downstream backpressures or substream backpressures

**Completes when** prefix elements have been consumed and substream has been consumed

**Cancels when** downstream cancels or substream cancels
132. [**](../../../akka/stream/javadsl/Flow.html#prepend[M](that:akka.stream.Graph[akka.stream.SourceShape[Out],M]):akka.stream.javadsl.Flow[In,Out,Mat] "Permalink")  def prepend\[M](that: [Graph](../Graph.html)\[[SourceShape](../SourceShape.html)\[Out], M]): Flow\[In, Out, Mat]Prepend the given [Source](Source.html) to this Flow, meaning that before elements
are generated from this Flow, the Source's elements will be produced until it
is exhausted, at which point Flow elements will start being produced.

Prepend the given [Source](Source.html) to this Flow, meaning that before elements
are generated from this Flow, the Source's elements will be produced until it
is exhausted, at which point Flow elements will start being produced.

Note that the [Source](Source.html) is materialized together with this Flow and is "detached" meaning
in effect behave as a one element buffer in front of both the sources, that eagerly demands an element on start
(so it can not be combined with `Source.lazy` to defer materialization of `that`).

This flow will then be kept from producing elements by asserting back\-pressure until its time comes.

When needing a prepend operator that is not detached use [\#prependLazy](#prependLazy[M](that:akka.stream.Graph[akka.stream.SourceShape[Out],M]):akka.stream.javadsl.Flow[In,Out,Mat])

**Emits when** element is available from the given [Source](Source.html) or from current stream when the [Source](Source.html) is completed

**Backpressures when** downstream backpressures

**Completes when** this Flow completes

**Cancels when** downstream cancels
133. [**](../../../akka/stream/javadsl/Flow.html#prependLazy[M](that:akka.stream.Graph[akka.stream.SourceShape[Out],M]):akka.stream.javadsl.Flow[In,Out,Mat] "Permalink")  def prependLazy\[M](that: [Graph](../Graph.html)\[[SourceShape](../SourceShape.html)\[Out], M]): Flow\[In, Out, Mat]Prepend the given [Source](Source.html) to this Flow, meaning that before elements
are generated from this Flow, the Source's elements will be produced until it
is exhausted, at which point Flow elements will start being produced.

Prepend the given [Source](Source.html) to this Flow, meaning that before elements
are generated from this Flow, the Source's elements will be produced until it
is exhausted, at which point Flow elements will start being produced.

Note that the [Source](Source.html) is materialized together with this Flow and will then be kept from producing elements
by asserting back\-pressure until its time comes.

When needing a prepend operator that is also detached use [\#prepend](#prepend[M](that:akka.stream.Graph[akka.stream.SourceShape[Out],M]):akka.stream.javadsl.Flow[In,Out,Mat])

If the given [Source](Source.html) gets upstream error \- no elements from this Flow will be pulled.

**Emits when** element is available from the given [Source](Source.html) or from current stream when the [Source](Source.html) is completed

**Backpressures when** downstream backpressures

**Completes when** this Flow completes

**Cancels when** downstream cancels
134. [**](../../../akka/stream/javadsl/Flow.html#prependLazyMat[M,M2](that:akka.stream.Graph[akka.stream.SourceShape[Out],M],matF:akka.japi.function.Function2[Mat,M,M2]):akka.stream.javadsl.Flow[In,Out,M2] "Permalink")  def prependLazyMat\[M, M2](that: [Graph](../Graph.html)\[[SourceShape](../SourceShape.html)\[Out], M], matF: [Function2](../../japi/function/Function2.html)\[Mat, M, M2]): Flow\[In, Out, M2]Prepend the given [Source](Source.html) to this Flow, meaning that before elements
are generated from this Flow, the Source's elements will be produced until it
is exhausted, at which point Flow elements will start being produced.

Prepend the given [Source](Source.html) to this Flow, meaning that before elements
are generated from this Flow, the Source's elements will be produced until it
is exhausted, at which point Flow elements will start being produced.

Note that the [Source](Source.html) is materialized together with this Flow.

This flow will then be kept from producing elements by asserting back\-pressure until its time comes.

When needing a prepend operator that is detached use [\#prependMat](#prependMat[M,M2](that:akka.stream.Graph[akka.stream.SourceShape[Out],M],matF:akka.japi.function.Function2[Mat,M,M2]):akka.stream.javadsl.Flow[In,Out,M2])

See also[\#prependLazy](#prependLazy[M](that:akka.stream.Graph[akka.stream.SourceShape[Out],M]):akka.stream.javadsl.Flow[In,Out,Mat]).
It is recommended to use the internally optimized `Keep.left` and `Keep.right` combiners
where appropriate instead of manually writing functions that pass through one of the values.
135. [**](../../../akka/stream/javadsl/Flow.html#prependMat[M,M2](that:akka.stream.Graph[akka.stream.SourceShape[Out],M],matF:akka.japi.function.Function2[Mat,M,M2]):akka.stream.javadsl.Flow[In,Out,M2] "Permalink")  def prependMat\[M, M2](that: [Graph](../Graph.html)\[[SourceShape](../SourceShape.html)\[Out], M], matF: [Function2](../../japi/function/Function2.html)\[Mat, M, M2]): Flow\[In, Out, M2]Prepend the given [Source](Source.html) to this Flow, meaning that before elements
are generated from this Flow, the Source's elements will be produced until it
is exhausted, at which point Flow elements will start being produced.

Prepend the given [Source](Source.html) to this Flow, meaning that before elements
are generated from this Flow, the Source's elements will be produced until it
is exhausted, at which point Flow elements will start being produced.

Note that this Flow will be materialized together with the [Source](Source.html) and just kept
from producing elements by asserting back\-pressure until its time comes.

When needing a prepend operator that is not detached use [\#prependLazyMat](#prependLazyMat[M,M2](that:akka.stream.Graph[akka.stream.SourceShape[Out],M],matF:akka.japi.function.Function2[Mat,M,M2]):akka.stream.javadsl.Flow[In,Out,M2])

It is recommended to use the internally optimized `Keep.left` and `Keep.right` combiners
where appropriate instead of manually writing functions that pass through one of the values.

See also[\#prepend](#prepend[M](that:akka.stream.Graph[akka.stream.SourceShape[Out],M]):akka.stream.javadsl.Flow[In,Out,Mat])
136. [**](../../../akka/stream/javadsl/Flow.html#recover(clazz:Class[_<:Throwable],supplier:java.util.function.Supplier[Out]):akka.stream.javadsl.Flow[In,Out,Mat] "Permalink")  def recover(clazz: Class\[\_ \<: Throwable], supplier: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[Out]): Flow\[In, Out, Mat]Recover allows to send last element on failure and gracefully complete the stream
Since the underlying failure signal onError arrives out\-of\-band, it might jump over existing elements.

Recover allows to send last element on failure and gracefully complete the stream
Since the underlying failure signal onError arrives out\-of\-band, it might jump over existing elements.
This operator can recover the failure signal, but not the skipped elements, which will be dropped.

Throwing an exception inside `recover` \_will\_ be logged on ERROR level automatically.

**Emits when** element is available from the upstream or upstream is failed and pf returns an element

**Backpressures when** downstream backpressures

**Completes when** upstream completes or upstream failed with exception pf can handle

**Cancels when** downstream cancels
137. [**](../../../akka/stream/javadsl/Flow.html#recover(pf:PartialFunction[Throwable,Out]):akka.stream.javadsl.Flow[In,Out,Mat] "Permalink")  def recover(pf: [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[Throwable, Out]): Flow\[In, Out, Mat]Recover allows to send last element on failure and gracefully complete the stream
Since the underlying failure signal onError arrives out\-of\-band, it might jump over existing elements.

Recover allows to send last element on failure and gracefully complete the stream
Since the underlying failure signal onError arrives out\-of\-band, it might jump over existing elements.
This operator can recover the failure signal, but not the skipped elements, which will be dropped.

Throwing an exception inside `recover` \_will\_ be logged on ERROR level automatically.

**Emits when** element is available from the upstream or upstream is failed and pf returns an element

**Backpressures when** downstream backpressures

**Completes when** upstream completes or upstream failed with exception pf can handle

**Cancels when** downstream cancels
138. [**](../../../akka/stream/javadsl/Flow.html#recoverWith(pf:PartialFunction[Throwable,_<:akka.stream.Graph[akka.stream.SourceShape[Out],akka.NotUsed]]):akka.stream.javadsl.Flow[In,Out,Mat] "Permalink")  def recoverWith(pf: [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[Throwable, \_ \<: [Graph](../Graph.html)\[[SourceShape](../SourceShape.html)\[Out], [NotUsed](../../NotUsed.html)]]): Flow\[In, Out, Mat]RecoverWith allows to switch to alternative Source on flow failure.

RecoverWith allows to switch to alternative Source on flow failure. It will stay in effect after
a failure has been recovered so that each time there is a failure it is fed into the `pf` and a new
Source may be materialized.

Since the underlying failure signal onError arrives out\-of\-band, it might jump over existing elements.
This operator can recover the failure signal, but not the skipped elements, which will be dropped.

Throwing an exception inside `recoverWith` \_will\_ be logged on ERROR level automatically.

**Emits when** element is available from the upstream or upstream is failed and element is available
from alternative Source

**Backpressures when** downstream backpressures

**Completes when** upstream completes or upstream failed with exception pf can handle

**Cancels when** downstream cancels
139. [**](../../../akka/stream/javadsl/Flow.html#recoverWithRetries(attempts:Int,clazz:Class[_<:Throwable],supplier:java.util.function.Supplier[akka.stream.Graph[akka.stream.SourceShape[Out],akka.NotUsed]]):akka.stream.javadsl.Flow[In,Out,Mat] "Permalink")  def recoverWithRetries(attempts: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), clazz: Class\[\_ \<: Throwable], supplier: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Graph](../Graph.html)\[[SourceShape](../SourceShape.html)\[Out], [NotUsed](../../NotUsed.html)]]): Flow\[In, Out, Mat]RecoverWithRetries allows to switch to alternative Source on flow failure.

RecoverWithRetries allows to switch to alternative Source on flow failure. It will stay in effect after
a failure has been recovered up to `attempts` number of times so that each time there is a failure
it is fed into the `pf` and a new Source may be materialized. Note that if you pass in 0, this won't
attempt to recover at all.

A negative `attempts` number is interpreted as "infinite", which results in the exact same behavior as `recoverWith`.

Since the underlying failure signal onError arrives out\-of\-band, it might jump over existing elements.
This operator can recover the failure signal, but not the skipped elements, which will be dropped.

Throwing an exception inside `recoverWithRetries` \_will\_ be logged on ERROR level automatically.

**Emits when** element is available from the upstream or upstream is failed and element is available
from alternative Source

**Backpressures when** downstream backpressures

**Completes when** upstream completes or upstream failed with exception pf can handle

**Cancels when** downstream cancels

attemptsMaximum number of retries or \-1 to retry indefinitely

clazzthe class object of the failure cause

suppliersupply the new Source to be materialized
140. [**](../../../akka/stream/javadsl/Flow.html#recoverWithRetries(attempts:Int,pf:PartialFunction[Throwable,akka.stream.Graph[akka.stream.SourceShape[Out],akka.NotUsed]]):akka.stream.javadsl.Flow[In,Out,Mat] "Permalink")  def recoverWithRetries(attempts: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), pf: [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[Throwable, [Graph](../Graph.html)\[[SourceShape](../SourceShape.html)\[Out], [NotUsed](../../NotUsed.html)]]): Flow\[In, Out, Mat]RecoverWithRetries allows to switch to alternative Source on flow failure.

RecoverWithRetries allows to switch to alternative Source on flow failure. It will stay in effect after
a failure has been recovered up to `attempts` number of times so that each time there is a failure
it is fed into the `pf` and a new Source may be materialized. Note that if you pass in 0, this won't
attempt to recover at all.

A negative `attempts` number is interpreted as "infinite", which results in the exact same behavior as `recoverWith`.

Since the underlying failure signal onError arrives out\-of\-band, it might jump over existing elements.
This operator can recover the failure signal, but not the skipped elements, which will be dropped.

Throwing an exception inside `recoverWithRetries` \_will\_ be logged on ERROR level automatically.

**Emits when** element is available from the upstream or upstream is failed and element is available
from alternative Source

**Backpressures when** downstream backpressures

**Completes when** upstream completes or upstream failed with exception pf can handle

**Cancels when** downstream cancels

attemptsMaximum number of retries or \-1 to retry indefinitely

pfReceives the failure cause and returns the new Source to be materialized if any
141. [**](../../../akka/stream/javadsl/Flow.html#reduce(f:akka.japi.function.Function2[Out,Out,Out]):akka.stream.javadsl.Flow[In,Out,Mat] "Permalink")  def reduce(f: [Function2](../../japi/function/Function2.html)\[Out, Out, Out]): Flow\[In, Out, Mat]Similar to `fold` but uses first element as zero element.

Similar to `fold` but uses first element as zero element.
Applies the given function towards its current and next value,
yielding the next current value.

If the stream is empty (i.e. completes before signalling any elements),
the reduce operator will fail its downstream with a NoSuchElementException,
which is semantically in\-line with that Scala's standard library collections
do in such situations.

Adheres to the [ActorAttributes.SupervisionStrategy](../ActorAttributes$$SupervisionStrategy.html) attribute.

**Emits when** upstream completes

**Backpressures when** downstream backpressures

**Completes when** upstream completes

**Cancels when** downstream cancels
142. [**](../../../akka/stream/javadsl/Flow.html#runWith[T,U](source:akka.stream.Graph[akka.stream.SourceShape[In],T],sink:akka.stream.Graph[akka.stream.SinkShape[Out],U],materializer:akka.stream.Materializer):akka.japi.Pair[T,U] "Permalink")  def runWith\[T, U](source: [Graph](../Graph.html)\[[SourceShape](../SourceShape.html)\[In], T], sink: [Graph](../Graph.html)\[[SinkShape](../SinkShape.html)\[Out], U], materializer: [Materializer](../Materializer.html)): [Pair](../../japi/Pair.html)\[T, U]Connect the `Source` to this `Flow` and then connect it to the `Sink` and run it.

Connect the `Source` to this `Flow` and then connect it to the `Sink` and run it.

The returned tuple contains the materialized values of the `Source` and `Sink`,
e.g. the `Subscriber` of a `Source.asSubscriber` and `Publisher` of a `Sink.asPublisher`.

Prefer the method taking an ActorSystem unless you have special requirements.

Tmaterialized type of given Source

Umaterialized type of given Sink
143. [**](../../../akka/stream/javadsl/Flow.html#runWith[T,U](source:akka.stream.Graph[akka.stream.SourceShape[In],T],sink:akka.stream.Graph[akka.stream.SinkShape[Out],U],systemProvider:akka.actor.ClassicActorSystemProvider):akka.japi.Pair[T,U] "Permalink")  def runWith\[T, U](source: [Graph](../Graph.html)\[[SourceShape](../SourceShape.html)\[In], T], sink: [Graph](../Graph.html)\[[SinkShape](../SinkShape.html)\[Out], U], systemProvider: [ClassicActorSystemProvider](../../actor/ClassicActorSystemProvider.html)): [Pair](../../japi/Pair.html)\[T, U]Connect the `Source` to this `Flow` and then connect it to the `Sink` and run it.

Connect the `Source` to this `Flow` and then connect it to the `Sink` and run it.

The returned tuple contains the materialized values of the `Source` and `Sink`,
e.g. the `Subscriber` of a `Source.asSubscriber` and `Publisher` of a `Sink.asPublisher`.

Tmaterialized type of given Source

Umaterialized type of given Sink
144. [**](../../../akka/stream/javadsl/Flow.html#scan[T](zero:T)(f:akka.japi.function.Function2[T,Out,T]):akka.stream.javadsl.Flow[In,T,Mat] "Permalink")  def scan\[T](zero: T)(f: [Function2](../../japi/function/Function2.html)\[T, Out, T]): Flow\[In, T, Mat]Similar to `fold` but is not a terminal operation,
emits its current value which starts at `zero` and then
applies the current and next value to the given function `f`,
emitting the next current value.

Similar to `fold` but is not a terminal operation,
emits its current value which starts at `zero` and then
applies the current and next value to the given function `f`,
emitting the next current value.

If the function `f` throws an exception and the supervision decision is
[akka.stream.Supervision\#restart](../Supervision$.html#restart:akka.stream.Supervision.Restart.type) current value starts at `zero` again
the stream will continue.

Adheres to the [ActorAttributes.SupervisionStrategy](../ActorAttributes$$SupervisionStrategy.html) attribute.

Note that the `zero` value must be immutable.

**Emits when** the function scanning the element returns a new element

**Backpressures when** downstream backpressures

**Completes when** upstream completes

**Cancels when** downstream cancels
145. [**](../../../akka/stream/javadsl/Flow.html#scanAsync[T](zero:T)(f:akka.japi.function.Function2[T,Out,java.util.concurrent.CompletionStage[T]]):akka.stream.javadsl.Flow[In,T,Mat] "Permalink")  def scanAsync\[T](zero: T)(f: [Function2](../../japi/function/Function2.html)\[T, Out, [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[T]]): Flow\[In, T, Mat]Similar to `scan` but with a asynchronous function,
emits its current value which starts at `zero` and then
applies the current and next value to the given function `f`,
emitting a `Future` that resolves to the next current value.

Similar to `scan` but with a asynchronous function,
emits its current value which starts at `zero` and then
applies the current and next value to the given function `f`,
emitting a `Future` that resolves to the next current value.

If the function `f` throws an exception and the supervision decision is
[akka.stream.Supervision.Restart](../Supervision$$Restart$.html) current value starts at `zero` again
the stream will continue.

If the function `f` throws an exception and the supervision decision is
[akka.stream.Supervision.Resume](../Supervision$$Resume$.html) current value starts at the previous
current value, or zero when it doesn't have one, and the stream will continue.

Adheres to the [ActorAttributes.SupervisionStrategy](../ActorAttributes$$SupervisionStrategy.html) attribute.

Note that the `zero` value must be immutable.

**Emits when** the future returned by f `completes`

**Backpressures when** downstream backpressures

**Completes when** upstream completes and the last future returned by `f` completes

**Cancels when** downstream cancels

See also [\#scan](#scan[T](zero:T)(f:akka.japi.function.Function2[T,Out,T]):akka.stream.javadsl.Flow[In,T,Mat])
146. [**](../../../akka/stream/javadsl/Flow.html#shape:akka.stream.FlowShape[In,Out] "Permalink")  def shape: [FlowShape](../FlowShape.html)\[In, Out]The shape of a graph is all that is externally visible: its inlets and outlets.

The shape of a graph is all that is externally visible: its inlets and outlets.

Definition ClassesFlow → [Graph](../Graph.html)
147. [**](../../../akka/stream/javadsl/Flow.html#sliding(n:Int,step:Int):akka.stream.javadsl.Flow[In,java.util.List[Out],Mat] "Permalink")  def sliding(n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), step: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int) \= 1): Flow\[In, [List](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/List.html#java.util.List)\[Out], Mat]Apply a sliding window over the stream and return the windows as groups of elements, with the last group
possibly smaller than requested due to end\-of\-stream.

Apply a sliding window over the stream and return the windows as groups of elements, with the last group
possibly smaller than requested due to end\-of\-stream.

`n` must be positive, otherwise IllegalArgumentException is thrown.
`step` must be positive, otherwise IllegalArgumentException is thrown.

**Emits when** enough elements have been collected within the window or upstream completed

**Backpressures when** a window has been assembled and downstream backpressures

**Completes when** upstream completes

**Cancels when** downstream cancels
148. [**](../../../akka/stream/javadsl/Flow.html#splitAfter(substreamCancelStrategy:akka.stream.SubstreamCancelStrategy)(p:akka.japi.function.Predicate[Out]):akka.stream.javadsl.SubFlow[In,Out,Mat] "Permalink")  def splitAfter(substreamCancelStrategy: [SubstreamCancelStrategy](../SubstreamCancelStrategy.html))(p: [Predicate](../../japi/function/Predicate.html)\[Out]): [SubFlow](SubFlow.html)\[In, Out, Mat]This operation applies the given predicate to all incoming elements and
emits them to a stream of output streams.

This operation applies the given predicate to all incoming elements and
emits them to a stream of output streams. It \*ends\* the current substream when the
predicate is true.

See also[\#splitAfter](#splitAfter(substreamCancelStrategy:akka.stream.SubstreamCancelStrategy)(p:akka.japi.function.Predicate[Out]):akka.stream.javadsl.SubFlow[In,Out,Mat])
149. [**](../../../akka/stream/javadsl/Flow.html#splitAfter(p:akka.japi.function.Predicate[Out]):akka.stream.javadsl.SubFlow[In,Out,Mat] "Permalink")  def splitAfter(p: [Predicate](../../japi/function/Predicate.html)\[Out]): [SubFlow](SubFlow.html)\[In, Out, Mat]This operation applies the given predicate to all incoming elements and
emits them to a stream of output streams.

This operation applies the given predicate to all incoming elements and
emits them to a stream of output streams. It \*ends\* the current substream when the
predicate is true. This means that for the following series of predicate values,
three substreams will be produced with lengths 2, 2, and 3:

```
false, true,        // elements go into first substream
false, true,        // elements go into second substream
false, false, true  // elements go into third substream
```
The object returned from this method is not a normal Flow,
it is a [SubFlow](SubFlow.html). This means that after this operator all transformations
are applied to all encountered substreams in the same fashion. Substream mode
is exited either by closing the substream (i.e. connecting it to a [Sink](Sink.html))
or by merging the substreams back together; see the `to` and `mergeBack` methods
on [SubFlow](SubFlow.html) for more information.

It is important to note that the substreams also propagate back\-pressure as
any other stream, which means that blocking one substream will block the `splitAfter`
operator itself—and thereby all substreams—once all internal or
explicit buffers are filled.

If the split predicate `p` throws an exception and the supervision decision
is [akka.stream.Supervision.Stop](../Supervision$$Stop$.html) the stream and substreams will be completed
with failure.

If the split predicate `p` throws an exception and the supervision decision
is [akka.stream.Supervision.Resume](../Supervision$$Resume$.html) or [akka.stream.Supervision.Restart](../Supervision$$Restart$.html)
the element is dropped and the stream and substreams continue.

**Emits when** an element passes through. When the provided predicate is true it emits the element
and opens a new substream for subsequent element

**Backpressures when** there is an element pending for the next substream, but the previous
is not fully consumed yet, or the substream backpressures

**Completes when** upstream completes

**Cancels when** downstream cancels and substreams cancel on `SubstreamCancelStrategy.drain`, downstream
cancels or any substream cancels on `SubstreamCancelStrategy.propagate`

See also [Flow.splitWhen](#splitWhen(substreamCancelStrategy:akka.stream.SubstreamCancelStrategy)(p:akka.japi.function.Predicate[Out]):akka.stream.javadsl.SubFlow[In,Out,Mat]).
150. [**](../../../akka/stream/javadsl/Flow.html#splitWhen(substreamCancelStrategy:akka.stream.SubstreamCancelStrategy)(p:akka.japi.function.Predicate[Out]):akka.stream.javadsl.SubFlow[In,Out,Mat] "Permalink")  def splitWhen(substreamCancelStrategy: [SubstreamCancelStrategy](../SubstreamCancelStrategy.html))(p: [Predicate](../../japi/function/Predicate.html)\[Out]): [SubFlow](SubFlow.html)\[In, Out, Mat]This operation applies the given predicate to all incoming elements and
emits them to a stream of output streams, always beginning a new one with
the current element if the given predicate returns true for it.

This operation applies the given predicate to all incoming elements and
emits them to a stream of output streams, always beginning a new one with
the current element if the given predicate returns true for it.

See also[\#splitWhen](#splitWhen(substreamCancelStrategy:akka.stream.SubstreamCancelStrategy)(p:akka.japi.function.Predicate[Out]):akka.stream.javadsl.SubFlow[In,Out,Mat])
151. [**](../../../akka/stream/javadsl/Flow.html#splitWhen(p:akka.japi.function.Predicate[Out]):akka.stream.javadsl.SubFlow[In,Out,Mat] "Permalink")  def splitWhen(p: [Predicate](../../japi/function/Predicate.html)\[Out]): [SubFlow](SubFlow.html)\[In, Out, Mat]This operation applies the given predicate to all incoming elements and
emits them to a stream of output streams, always beginning a new one with
the current element if the given predicate returns true for it.

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
The object returned from this method is not a normal Flow,
it is a [SubFlow](SubFlow.html). This means that after this operator all transformations
are applied to all encountered substreams in the same fashion. Substream mode
is exited either by closing the substream (i.e. connecting it to a [Sink](Sink.html))
or by merging the substreams back together; see the `to` and `mergeBack` methods
on [SubFlow](SubFlow.html) for more information.

It is important to note that the substreams also propagate back\-pressure as
any other stream, which means that blocking one substream will block the `splitWhen`
operator itself—and thereby all substreams—once all internal or
explicit buffers are filled.

If the split predicate `p` throws an exception and the supervision decision
is [akka.stream.Supervision\#stop](../Supervision$.html#stop:akka.stream.Supervision.Stop.type) the stream and substreams will be completed
with failure.

If the split predicate `p` throws an exception and the supervision decision
is [akka.stream.Supervision\#resume](../Supervision$.html#resume:akka.stream.Supervision.Resume.type) or [akka.stream.Supervision\#restart](../Supervision$.html#restart:akka.stream.Supervision.Restart.type)
the element is dropped and the stream and substreams continue.

**Emits when** an element for which the provided predicate is true, opening and emitting
a new substream for subsequent element

**Backpressures when** there is an element pending for the next substream, but the previous
is not fully consumed yet, or the substream backpressures

**Completes when** upstream completes

**Cancels when** downstream cancels and substreams cancel on `SubstreamCancelStrategy.drain()`, downstream
cancels or any substream cancels on `SubstreamCancelStrategy.propagate()`

See also [Flow.splitAfter](#splitAfter(substreamCancelStrategy:akka.stream.SubstreamCancelStrategy)(p:akka.japi.function.Predicate[Out]):akka.stream.javadsl.SubFlow[In,Out,Mat]).
152. [**](../../../akka/stream/javadsl/Flow.html#statefulMap[S,T](create:akka.japi.function.Creator[S],f:akka.japi.function.Function2[S,Out,akka.japi.Pair[S,T]],onComplete:akka.japi.function.Function[S,java.util.Optional[T]]):akka.stream.javadsl.Flow[In,T,Mat] "Permalink")  def statefulMap\[S, T](create: [Creator](../../japi/function/Creator.html)\[S], f: [Function2](../../japi/function/Function2.html)\[S, Out, [Pair](../../japi/Pair.html)\[S, T]], onComplete: [Function](../../japi/function/Function.html)\[S, [Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[T]]): Flow\[In, T, Mat]Transform each stream element with the help of a state.

Transform each stream element with the help of a state.

The state creation function is invoked once when the stream is materialized and the returned state is passed to
the mapping function for mapping the first element. The mapping function returns a mapped element to emit
downstream and a state to pass to the next mapping function. The state can be the same for each mapping return,
be a new immutable state but it is also safe to use a mutable state. The returned `T` MUST NOT be `null` as it is
illegal as stream element \- according to the Reactive Streams specification. A `null` state is not allowed and will fail the stream.

For stateless variant see [map](#map[T](f:akka.japi.function.Function[Out,T]):akka.stream.javadsl.Flow[In,T,Mat]).

The `onComplete` function is called only once when the upstream or downstream finished, You can do some clean\-up here,
and if the returned value is not empty, it will be emitted to the downstream if available, otherwise the value will be dropped.

Adheres to the [ActorAttributes.SupervisionStrategy](../ActorAttributes$$SupervisionStrategy.html) attribute.

**Emits when** the mapping function returns an element and downstream is ready to consume it

**Backpressures when** downstream backpressures

**Completes when** upstream completes

**Cancels when** downstream cancels

Sthe type of the state

Tthe type of the output elements

createa function that creates the initial state

fa function that transforms the upstream element and the state into a pair of next state and output element

onCompletea function that transforms the ongoing state into an optional output element
153. [**](../../../akka/stream/javadsl/Flow.html#statefulMapConcat[T](f:akka.japi.function.Creator[akka.japi.function.Function[Out,Iterable[T]]]):akka.stream.javadsl.Flow[In,T,Mat] "Permalink")  def statefulMapConcat\[T](f: [Creator](../../japi/function/Creator.html)\[[Function](../../japi/function/Function.html)\[Out, [Iterable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Iterable.html#java.lang.Iterable)\[T]]]): Flow\[In, T, Mat]Transform each input element into an `Iterable` of output elements that is
then flattened into the output stream.

Transform each input element into an `Iterable` of output elements that is
then flattened into the output stream. The transformation is meant to be stateful,
which is enabled by creating the transformation function anew for every materialization —
the returned function will typically close over mutable objects to store state between
invocations. For the stateless variant see [\#mapConcat](#mapConcat[T](f:akka.japi.function.Function[Out,Iterable[T]]):akka.stream.javadsl.Flow[In,T,Mat]).

Make sure that the `Iterable` is immutable or at least not modified after
being used as an output sequence. Otherwise the stream may fail with
`ConcurrentModificationException` or other more subtle errors may occur.

The returned `Iterable` MUST NOT contain `null` values,
as they are illegal as stream elements \- according to the Reactive Streams specification.

Adheres to the [ActorAttributes.SupervisionStrategy](../ActorAttributes$$SupervisionStrategy.html) attribute.

**Emits when** the mapping function returns an element or there are still remaining elements
from the previously calculated collection

**Backpressures when** downstream backpressures or there are still remaining elements from the
previously calculated collection

**Completes when** upstream completes and all remaining elements has been emitted

**Cancels when** downstream cancels
154. [**](../../../akka/stream/javadsl/Flow.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
155. [**](../../../akka/stream/javadsl/Flow.html#take(n:Long):akka.stream.javadsl.Flow[In,Out,Mat] "Permalink")  def take(n: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): Flow\[In, Out, Mat]Terminate processing (and cancel the upstream publisher) after the given
number of elements.

Terminate processing (and cancel the upstream publisher) after the given
number of elements. Due to input buffering some elements may have been
requested from upstream publishers that will then not be processed downstream
of this step.

The stream will be completed without producing any elements if `n` is zero
or negative.

**Emits when** the specified number of elements to take has not yet been reached

**Backpressures when** downstream backpressures

**Completes when** the defined number of elements has been taken or upstream completes

**Cancels when** the defined number of elements has been taken or downstream cancels

See also [Flow.limit](#limit(n:Long):akka.stream.javadsl.Flow[In,Out,Mat]), [Flow.limitWeighted](#limitWeighted(n:Long)(costFn:akka.japi.function.Function[Out,Long]):akka.stream.javadsl.Flow[In,Out,Mat])
156. [**](../../../akka/stream/javadsl/Flow.html#takeWhile(p:akka.japi.function.Predicate[Out]):akka.stream.javadsl.Flow[In,Out,Mat] "Permalink")  def takeWhile(p: [Predicate](../../japi/function/Predicate.html)\[Out]): Flow\[In, Out, Mat]Terminate processing (and cancel the upstream publisher) after predicate
returns false for the first time.

Terminate processing (and cancel the upstream publisher) after predicate
returns false for the first time. When inclusive is `true`, include the element
for which the predicate returned `false`.
Due to input buffering some elements may have been requested from upstream publishers
that will then not be processed downstream of this step.

The stream will be completed without producing any elements if predicate is false for
the first stream element.

**Emits when** the predicate is true

**Backpressures when** downstream backpressures

**Completes when** predicate returned false (or 1 after predicate returns false if `inclusive` or upstream completes

**Cancels when** predicate returned false or downstream cancels

See also [Flow.limit](#limit(n:Long):akka.stream.javadsl.Flow[In,Out,Mat]), [Flow.limitWeighted](#limitWeighted(n:Long)(costFn:akka.japi.function.Function[Out,Long]):akka.stream.javadsl.Flow[In,Out,Mat])
157. [**](../../../akka/stream/javadsl/Flow.html#takeWhile(p:akka.japi.function.Predicate[Out],inclusive:Boolean):akka.stream.javadsl.Flow[In,Out,Mat] "Permalink")  def takeWhile(p: [Predicate](../../japi/function/Predicate.html)\[Out], inclusive: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): Flow\[In, Out, Mat]Terminate processing (and cancel the upstream publisher) after predicate
returns false for the first time.

Terminate processing (and cancel the upstream publisher) after predicate
returns false for the first time. When inclusive is `true`, include the element
for which the predicate returned `false`.
Due to input buffering some elements may have been requested from upstream publishers
that will then not be processed downstream of this step.

The stream will be completed without producing any elements if predicate is false for
the first stream element.

Adheres to the [ActorAttributes.SupervisionStrategy](../ActorAttributes$$SupervisionStrategy.html) attribute.

**Emits when** the predicate is true

**Backpressures when** downstream backpressures

**Completes when** predicate returned false (or 1 after predicate returns false if `inclusive` or upstream completes

**Cancels when** predicate returned false or downstream cancels

See also [Flow.limit](#limit(n:Long):akka.stream.javadsl.Flow[In,Out,Mat]), [Flow.limitWeighted](#limitWeighted(n:Long)(costFn:akka.japi.function.Function[Out,Long]):akka.stream.javadsl.Flow[In,Out,Mat])
158. [**](../../../akka/stream/javadsl/Flow.html#takeWithin(duration:java.time.Duration):akka.stream.javadsl.Flow[In,Out,Mat] "Permalink")  def takeWithin(duration: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration)): Flow\[In, Out, Mat]Terminate processing (and cancel the upstream publisher) after the given
duration.

Terminate processing (and cancel the upstream publisher) after the given
duration. Due to input buffering some elements may have been
requested from upstream publishers that will then not be processed downstream
of this step.

Note that this can be combined with [\#take](#take(n:Long):akka.stream.javadsl.Flow[In,Out,Mat]) to limit the number of elements
within the duration.

**Emits when** an upstream element arrives

**Backpressures when** downstream backpressures

**Completes when** upstream completes or timer fires

**Cancels when** downstream cancels or timer fires

See also [Flow.limit](#limit(n:Long):akka.stream.javadsl.Flow[In,Out,Mat]), [Flow.limitWeighted](#limitWeighted(n:Long)(costFn:akka.japi.function.Function[Out,Long]):akka.stream.javadsl.Flow[In,Out,Mat])
159. [**](../../../akka/stream/javadsl/Flow.html#throttle(control:akka.stream.javadsl.ThrottleControl,costCalculation:akka.japi.function.Function[Out,Integer]):akka.stream.javadsl.Flow[In,Out,Mat] "Permalink")  def throttle(control: [ThrottleControl](ThrottleControl.html), costCalculation: [Function](../../japi/function/Function.html)\[Out, [Integer](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Integer.html#java.lang.Integer)]): Flow\[In, Out, Mat]The `ThrottleControl` can be updated to change the throttle rate from the outside of the stream
and share a total rate limit between several streams.

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

	- [akka.stream.ThrottleMode.Shaping](../ThrottleMode$$Shaping$.html) makes pauses before emitting messages to meet the throttle rate
	- [akka.stream.ThrottleMode.Enforcing](../ThrottleMode$$Enforcing$.html) fails with exception when upstream is faster than throttle rate. Enforcing
	 cannot emit elements that cost more than the maximumBurstIt is recommended to use non\-zero burst sizes as they improve both performance and throttling precision by allowing
the implementation to avoid using the scheduler when input rates fall below the enforced limit and to reduce
most of the inaccuracy caused by the scheduler resolution (which is in the range of milliseconds).

 WARNING: Be aware that throttle is using scheduler to slow down the stream. This scheduler has minimal time of triggering
 next push. Consequently it will slow down the stream as it has minimal pause for emitting. This can happen in
 case burst is 0 and speed is higher than 30 events per second. You need to increase the `maximumBurst` if
 elements arrive with small interval (30 milliseconds or less). Use the overloaded `throttle` method without
 `maximumBurst` parameter to automatically calculate the `maximumBurst` based on the given rate (`cost/per`).
 In other words the throttler always enforces the rate limit when `maximumBurst` parameter is given, but in
 certain cases (mostly due to limited scheduler resolution) it enforces a tighter bound than what was prescribed.

**Emits when** upstream emits an element and configured time per each element elapsed

**Backpressures when** downstream backpressures or the incoming rate is higher than the speed limit

**Completes when** upstream completes

**Cancels when** downstream cancels
160. [**](../../../akka/stream/javadsl/Flow.html#throttle(control:akka.stream.javadsl.ThrottleControl):akka.stream.javadsl.Flow[In,Out,Mat] "Permalink")  def throttle(control: [ThrottleControl](ThrottleControl.html)): Flow\[In, Out, Mat]The `ThrottleControl` can be updated to change the throttle rate from the outside of the stream
and share a total rate limit between several streams.

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

The throttle `mode` is [akka.stream.ThrottleMode.Shaping](../ThrottleMode$$Shaping$.html), which pauses before emitting messages to
meet the throttle rate.

**Emits when** upstream emits an element and configured time per each element elapsed

**Backpressures when** downstream backpressures or the incoming rate is higher than the speed limit

**Completes when** upstream completes

**Cancels when** downstream cancels
161. [**](../../../akka/stream/javadsl/Flow.html#throttle(cost:Int,per:java.time.Duration,maximumBurst:Int,costCalculation:akka.japi.function.Function[Out,Integer],mode:akka.stream.ThrottleMode):akka.stream.javadsl.Flow[In,Out,Mat] "Permalink")  def throttle(cost: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), per: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration), maximumBurst: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), costCalculation: [Function](../../japi/function/Function.html)\[Out, [Integer](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Integer.html#java.lang.Integer)], mode: [ThrottleMode](../ThrottleMode.html)): Flow\[In, Out, Mat]Sends elements downstream with speed limited to `cost/per`.

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

	- [akka.stream.ThrottleMode.Shaping](../ThrottleMode$$Shaping$.html) makes pauses before emitting messages to meet the throttle rate
	- [akka.stream.ThrottleMode.Enforcing](../ThrottleMode$$Enforcing$.html) fails with exception when upstream is faster than throttle rate. Enforcing
	 cannot emit elements that cost more than the maximumBurstIt is recommended to use non\-zero burst sizes as they improve both performance and throttling precision by allowing
the implementation to avoid using the scheduler when input rates fall below the enforced limit and to reduce
most of the inaccuracy caused by the scheduler resolution (which is in the range of milliseconds).

 WARNING: Be aware that throttle is using scheduler to slow down the stream. This scheduler has minimal time of triggering
 next push. Consequently it will slow down the stream as it has minimal pause for emitting. This can happen in
 case burst is 0 and speed is higher than 30 events per second. You need to increase the `maximumBurst` if
 elements arrive with small interval (30 milliseconds or less). Use the overloaded `throttle` method without
 `maximumBurst` parameter to automatically calculate the `maximumBurst` based on the given rate (`cost/per`).
 In other words the throttler always enforces the rate limit when `maximumBurst` parameter is given, but in
 certain cases (mostly due to limited scheduler resolution) it enforces a tighter bound than what was prescribed.

**Emits when** upstream emits an element and configured time per each element elapsed

**Backpressures when** downstream backpressures or the incoming rate is higher than the speed limit

**Completes when** upstream completes

**Cancels when** downstream cancels
162. [**](../../../akka/stream/javadsl/Flow.html#throttle(cost:Int,per:java.time.Duration,costCalculation:akka.japi.function.Function[Out,Integer]):akka.stream.javadsl.Flow[In,Out,Mat] "Permalink")  def throttle(cost: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), per: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration), costCalculation: [Function](../../japi/function/Function.html)\[Out, [Integer](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Integer.html#java.lang.Integer)]): Flow\[In, Out, Mat]Sends elements downstream with speed limited to `cost/per`.

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

The throttle `mode` is [akka.stream.ThrottleMode.Shaping](../ThrottleMode$$Shaping$.html), which pauses before emitting messages to
meet the throttle rate.

**Emits when** upstream emits an element and configured time per each element elapsed

**Backpressures when** downstream backpressures or the incoming rate is higher than the speed limit

**Completes when** upstream completes

**Cancels when** downstream cancels
163. [**](../../../akka/stream/javadsl/Flow.html#throttle(elements:Int,per:java.time.Duration,maximumBurst:Int,mode:akka.stream.ThrottleMode):akka.stream.javadsl.Flow[In,Out,Mat] "Permalink")  def throttle(elements: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), per: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration), maximumBurst: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), mode: [ThrottleMode](../ThrottleMode.html)): Flow\[In, Out, Mat]Sends elements downstream with speed limited to `elements/per`.

Sends elements downstream with speed limited to `elements/per`. In other words, this operator sets the maximum rate
for emitting messages. This operator works for streams where all elements have the same cost or length.

Throttle implements the token bucket model. There is a bucket with a given token capacity (burst size or maximumBurst).
Tokens drop into the bucket at a given rate and can be kept for later use up to bucket capacity
to allow some burstiness. Whenever the stream wants to send an element, it takes as many
tokens from the bucket as the element costs. If there isn't any, throttle waits until the
bucket accumulates enough tokens. Elements that cost more than the allowed burst will be delayed proportionally
to their cost minus available tokens, meeting the target rate. Bucket is full when the stream is first materialized and started.

Parameter `mode` manages behavior when upstream is faster than throttle rate:

	- [akka.stream.ThrottleMode.Shaping](../ThrottleMode$$Shaping$.html) makes pauses before emitting messages to meet the throttle rate
	- [akka.stream.ThrottleMode.Enforcing](../ThrottleMode$$Enforcing$.html) fails with exception when upstream is faster than throttle rateIt is recommended to use non\-zero burst sizes as they improve both performance and throttling precision by allowing
the implementation to avoid using the scheduler when input rates fall below the enforced limit and to reduce
most of the inaccuracy caused by the scheduler resolution (which is in the range of milliseconds).

 WARNING: Be aware that throttle is using scheduler to slow down the stream. This scheduler has minimal time of triggering
 next push. Consequently it will slow down the stream as it has minimal pause for emitting. This can happen in
 case burst is 0 and speed is higher than 30 events per second. You need to increase the `maximumBurst` if
 elements arrive with small interval (30 milliseconds or less). Use the overloaded `throttle` method without
 `maximumBurst` parameter to automatically calculate the `maximumBurst` based on the given rate (`cost/per`).
 In other words the throttler always enforces the rate limit when `maximumBurst` parameter is given, but in
 certain cases (mostly due to limited scheduler resolution) it enforces a tighter bound than what was prescribed.

**Emits when** upstream emits an element and configured time per each element elapsed

**Backpressures when** downstream backpressures or the incoming rate is higher than the speed limit

**Completes when** upstream completes

**Cancels when** downstream cancels
164. [**](../../../akka/stream/javadsl/Flow.html#throttle(elements:Int,per:java.time.Duration):akka.stream.javadsl.Flow[In,Out,Mat] "Permalink")  def throttle(elements: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), per: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration)): Flow\[In, Out, Mat]Sends elements downstream with speed limited to `elements/per`.

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

The throttle `mode` is [akka.stream.ThrottleMode.Shaping](../ThrottleMode$$Shaping$.html), which pauses before emitting messages to
meet the throttle rate.

**Emits when** upstream emits an element and configured time per each element elapsed

**Backpressures when** downstream backpressures or the incoming rate is higher than the speed limit

**Completes when** upstream completes

**Cancels when** downstream cancels
165. [**](../../../akka/stream/javadsl/Flow.html#to(sink:akka.stream.Graph[akka.stream.SinkShape[Out],_]):akka.stream.javadsl.Sink[In,Mat] "Permalink")  def to(sink: [Graph](../Graph.html)\[[SinkShape](../SinkShape.html)\[Out], \_]): [Sink](Sink.html)\[In, Mat]Connect this Flow to a [Sink](Sink.html), concatenating the processing steps of both.

Connect this Flow to a [Sink](Sink.html), concatenating the processing steps of both.

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
The materialized value of the combined [Sink](Sink.html) will be the materialized
value of the current flow (ignoring the given Sink’s value), use
`toMat` if a different strategy is needed.

See also [toMat](#toMat[M,M2](sink:akka.stream.Graph[akka.stream.SinkShape[Out],M],combine:akka.japi.function.Function2[Mat,M,M2]):akka.stream.javadsl.Sink[In,M2]) when access to materialized values of the parameter is needed.
166. [**](../../../akka/stream/javadsl/Flow.html#toMat[M,M2](sink:akka.stream.Graph[akka.stream.SinkShape[Out],M],combine:akka.japi.function.Function2[Mat,M,M2]):akka.stream.javadsl.Sink[In,M2] "Permalink")  def toMat\[M, M2](sink: [Graph](../Graph.html)\[[SinkShape](../SinkShape.html)\[Out], M], combine: [Function2](../../japi/function/Function2.html)\[Mat, M, M2]): [Sink](Sink.html)\[In, M2]Connect this Flow to a [Sink](Sink.html), concatenating the processing steps of both.

Connect this Flow to a [Sink](Sink.html), concatenating the processing steps of both.

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
167. [**](../../../akka/stream/javadsl/Flow.html#toProcessor:akka.stream.javadsl.RunnableGraph[org.reactivestreams.Processor[In,Out]] "Permalink")  def toProcessor: [RunnableGraph](RunnableGraph.html)\[Processor\[In, Out]]Converts this Flow to a [RunnableGraph](RunnableGraph.html) that materializes to a Reactive Streams org.reactivestreams.Processor
which implements the operations encapsulated by this Flow.

Converts this Flow to a [RunnableGraph](RunnableGraph.html) that materializes to a Reactive Streams org.reactivestreams.Processor
which implements the operations encapsulated by this Flow. Every materialization results in a new Processor
instance, i.e. the returned [RunnableGraph](RunnableGraph.html) is reusable.

returnsA [RunnableGraph](RunnableGraph.html) that materializes to a Processor when run() is called on it.
168. [**](../../../akka/stream/javadsl/Flow.html#toString():String "Permalink")  def toString(): StringDefinition ClassesFlow → AnyRef → Any
169. [**](../../../akka/stream/javadsl/Flow.html#traversalBuilder:akka.stream.impl.LinearTraversalBuilder "Permalink")  def traversalBuilder: LinearTraversalBuilderINTERNAL API.

INTERNAL API.

Every materializable element must be backed by a stream layout module

Definition ClassesFlow → [Graph](../Graph.html)
170. [**](../../../akka/stream/javadsl/Flow.html#via[T,M](flow:akka.stream.Graph[akka.stream.FlowShape[Out,T],M]):akka.stream.javadsl.Flow[In,T,Mat] "Permalink")  def via\[T, M](flow: [Graph](../Graph.html)\[[FlowShape](../FlowShape.html)\[Out, T], M]): Flow\[In, T, Mat]Transform this Flow by appending the given processing steps.

Transform this Flow by appending the given processing steps.

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
The materialized value of the combined Flow will be the materialized
value of the current flow (ignoring the other Flow’s value), use
`viaMat` if a different strategy is needed.

See also [viaMat](#viaMat[T,M,M2](flow:akka.stream.Graph[akka.stream.FlowShape[Out,T],M],combine:akka.japi.function.Function2[Mat,M,M2]):akka.stream.javadsl.Flow[In,T,M2]) when access to materialized values of the parameter is needed.
171. [**](../../../akka/stream/javadsl/Flow.html#viaMat[T,M,M2](flow:akka.stream.Graph[akka.stream.FlowShape[Out,T],M],combine:akka.japi.function.Function2[Mat,M,M2]):akka.stream.javadsl.Flow[In,T,M2] "Permalink")  def viaMat\[T, M, M2](flow: [Graph](../Graph.html)\[[FlowShape](../FlowShape.html)\[Out, T], M], combine: [Function2](../../japi/function/Function2.html)\[Mat, M, M2]): Flow\[In, T, M2]Transform this Flow by appending the given processing steps.

Transform this Flow by appending the given processing steps.

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
172. [**](../../../akka/stream/javadsl/Flow.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
173. [**](../../../akka/stream/javadsl/Flow.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
174. [**](../../../akka/stream/javadsl/Flow.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
175. [**](../../../akka/stream/javadsl/Flow.html#watch(ref:akka.actor.ActorRef):akka.stream.javadsl.Flow[In,Out,Mat] "Permalink")  def watch(ref: [ActorRef](../../actor/ActorRef.html)): Flow\[In, Out, Mat]The operator fails with an [akka.stream.WatchedActorTerminatedException](../WatchedActorTerminatedException.html) if the target actor is terminated.

The operator fails with an [akka.stream.WatchedActorTerminatedException](../WatchedActorTerminatedException.html) if the target actor is terminated.

**Emits when** upstream emits

**Backpressures when** downstream backpressures

**Completes when** upstream completes

**Fails when** the watched actor terminates

**Cancels when** downstream cancels
176. [**](../../../akka/stream/javadsl/Flow.html#watchTermination[M]()(matF:akka.japi.function.Function2[Mat,java.util.concurrent.CompletionStage[akka.Done],M]):akka.stream.javadsl.Flow[In,Out,M] "Permalink")  def watchTermination\[M]()(matF: [Function2](../../japi/function/Function2.html)\[Mat, [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[Done](../../Done.html)], M]): Flow\[In, Out, M]Materializes to `CompletionStage<Done>` that completes on getting termination message.

Materializes to `CompletionStage<Done>` that completes on getting termination message.
The future completes with success when received complete message from upstream or cancel
from downstream. It fails with the same error when received error message from
downstream.

It is recommended to use the internally optimized `Keep.left` and `Keep.right` combiners
where appropriate instead of manually writing functions that pass through one of the values.
177. [**](../../../akka/stream/javadsl/Flow.html#wireTap(that:akka.stream.Graph[akka.stream.SinkShape[Out],_]):akka.stream.javadsl.Flow[In,Out,Mat] "Permalink")  def wireTap(that: [Graph](../Graph.html)\[[SinkShape](../SinkShape.html)\[Out], \_]): Flow\[In, Out, Mat]Attaches the given [Sink](Sink.html) to this Flow as a wire tap, meaning that elements that pass
through will also be sent to the wire\-tap Sink, without the latter affecting the mainline flow.

Attaches the given [Sink](Sink.html) to this Flow as a wire tap, meaning that elements that pass
through will also be sent to the wire\-tap Sink, without the latter affecting the mainline flow.
If the wire\-tap Sink backpressures, elements that would've been sent to it will be dropped instead.

It is similar to [\#alsoTo](#alsoTo(that:akka.stream.Graph[akka.stream.SinkShape[Out],_]):akka.stream.javadsl.Flow[In,Out,Mat]) which does backpressure instead of dropping elements.

**Emits when** element is available and demand exists from the downstream; the element will
also be sent to the wire\-tap Sink if there is demand.

**Backpressures when** downstream backpressures

**Completes when** upstream completes

**Cancels when** downstream cancels
178. [**](../../../akka/stream/javadsl/Flow.html#wireTap(f:akka.japi.function.Procedure[Out]):akka.stream.javadsl.Flow[In,Out,Mat] "Permalink")  def wireTap(f: [Procedure](../../japi/function/Procedure.html)\[Out]): Flow\[In, Out, Mat]This is a simplified version of `wireTap(Sink)` that takes only a simple procedure.

This is a simplified version of `wireTap(Sink)` that takes only a simple procedure.
Elements will be passed into this "side channel" function, and any of its results will be ignored.

If the wire\-tap operation is slow (it backpressures), elements that would've been sent to it will be dropped instead.
It is similar to [\#alsoTo](#alsoTo(that:akka.stream.Graph[akka.stream.SinkShape[Out],_]):akka.stream.javadsl.Flow[In,Out,Mat]) but will not affect (i.e. backpressure) the flow tapped into.

This operation is useful for inspecting the passed through element, usually by means of side\-effecting
operations (such as `println`, or emitting metrics), for each element without having to modify it.

For logging signals (elements, completion, error) consider using the [log](#log(name:String):akka.stream.javadsl.Flow[In,Out,Mat]) operator instead,
along with appropriate `ActorAttributes.logLevels`.

**Emits when** upstream emits an element; the same element will be passed to the attached function,
 as well as to the downstream operator

**Backpressures when** downstream backpressures

**Completes when** upstream completes

**Cancels when** downstream cancels
179. [**](../../../akka/stream/javadsl/Flow.html#wireTapMat[M2,M3](that:akka.stream.Graph[akka.stream.SinkShape[Out],M2],matF:akka.japi.function.Function2[Mat,M2,M3]):akka.stream.javadsl.Flow[In,Out,M3] "Permalink")  def wireTapMat\[M2, M3](that: [Graph](../Graph.html)\[[SinkShape](../SinkShape.html)\[Out], M2], matF: [Function2](../../japi/function/Function2.html)\[Mat, M2, M3]): Flow\[In, Out, M3]Attaches the given [Sink](Sink.html) to this Flow as a wire tap, meaning that elements that pass
through will also be sent to the wire\-tap Sink, without the latter affecting the mainline flow.

Attaches the given [Sink](Sink.html) to this Flow as a wire tap, meaning that elements that pass
through will also be sent to the wire\-tap Sink, without the latter affecting the mainline flow.
If the wire\-tap Sink backpressures, elements that would've been sent to it will be dropped instead.

It is similar to [\#alsoToMat](#alsoToMat[M2,M3](that:akka.stream.Graph[akka.stream.SinkShape[Out],M2],matF:akka.japi.function.Function2[Mat,M2,M3]):akka.stream.javadsl.Flow[In,Out,M3]) which does backpressure instead of dropping elements.

It is recommended to use the internally optimized `Keep.left` and `Keep.right` combiners
where appropriate instead of manually writing functions that pass through one of the values.

See also[\#wireTap](#wireTap(that:akka.stream.Graph[akka.stream.SinkShape[Out],_]):akka.stream.javadsl.Flow[In,Out,Mat])
180. [**](../../../akka/stream/javadsl/Flow.html#withAttributes(attr:akka.stream.Attributes):akka.stream.javadsl.Flow[In,Out,Mat] "Permalink")  def withAttributes(attr: [Attributes](../Attributes.html)): Flow\[In, Out, Mat]Replace the attributes of this Flow with the given ones.

Replace the attributes of this Flow with the given ones. If this Flow is a composite
of multiple graphs, new attributes on the composite will be less specific than attributes
set directly on the individual graphs of the composite.

Note that this operation has no effect on an empty Flow (because the attributes apply
only to the contained processing operators).

Definition ClassesFlow → [Graph](../Graph.html)
181. [**](../../../akka/stream/javadsl/Flow.html#zip[T](source:akka.stream.Graph[akka.stream.SourceShape[T],_]):akka.stream.javadsl.Flow[In,akka.japi.Pair[Out,T],Mat] "Permalink")  def zip\[T](source: [Graph](../Graph.html)\[[SourceShape](../SourceShape.html)\[T], \_]): Flow\[In, [Pair](../../japi/Pair.html)\[Out, T], Mat]Combine the elements of current Flow and the given [Source](Source.html) into a stream of tuples.

Combine the elements of current Flow and the given [Source](Source.html) into a stream of tuples.

**Emits when** all of the inputs have an element available

**Backpressures when** downstream backpressures

**Completes when** any upstream completes

**Cancels when** downstream cancels
182. [**](../../../akka/stream/javadsl/Flow.html#zipAll[U,A>:Out](that:akka.stream.Graph[akka.stream.SourceShape[U],_],thisElem:A,thatElem:U):akka.stream.javadsl.Flow[In,akka.japi.Pair[A,U],Mat] "Permalink")  def zipAll\[U, A \>: Out](that: [Graph](../Graph.html)\[[SourceShape](../SourceShape.html)\[U], \_], thisElem: A, thatElem: U): Flow\[In, [Pair](../../japi/Pair.html)\[A, U], Mat]Combine the elements of current flow and the given [Source](Source.html) into a stream of tuples.

Combine the elements of current flow and the given [Source](Source.html) into a stream of tuples.

**Emits when** at first emits when both inputs emit, and then as long as any input emits (coupled to the default value of the completed input).

**Backpressures when** downstream backpressures

**Completes when** all upstream completes

**Cancels when** downstream cancels
183. [**](../../../akka/stream/javadsl/Flow.html#zipAllMat[U,Mat2,Mat3,A>:Out](that:akka.stream.Graph[akka.stream.SourceShape[U],Mat2],thisElem:A,thatElem:U)(matF:(Mat,Mat2)=>Mat3):akka.stream.javadsl.Flow[In,akka.japi.Pair[A,U],Mat3] "Permalink")  def zipAllMat\[U, Mat2, Mat3, A \>: Out](that: [Graph](../Graph.html)\[[SourceShape](../SourceShape.html)\[U], Mat2], thisElem: A, thatElem: U)(matF: (Mat, Mat2) \=\> Mat3): Flow\[In, [Pair](../../japi/Pair.html)\[A, U], Mat3]Combine the elements of current flow and the given [Source](Source.html) into a stream of tuples.

Combine the elements of current flow and the given [Source](Source.html) into a stream of tuples.

See also[\#zipAll](#zipAll[U,A>:Out](that:akka.stream.Graph[akka.stream.SourceShape[U],_],thisElem:A,thatElem:U):akka.stream.javadsl.Flow[In,akka.japi.Pair[A,U],Mat])
**Emits when** at first emits when both inputs emit, and then as long as any input emits (coupled to the default value of the completed input).
**Backpressures when** downstream backpressures
**Completes when** all upstream completes
**Cancels when** downstream cancels
184. [**](../../../akka/stream/javadsl/Flow.html#zipLatest[T](source:akka.stream.Graph[akka.stream.SourceShape[T],_]):akka.stream.javadsl.Flow[In,akka.japi.Pair[Out,T],Mat] "Permalink")  def zipLatest\[T](source: [Graph](../Graph.html)\[[SourceShape](../SourceShape.html)\[T], \_]): Flow\[In, [Pair](../../japi/Pair.html)\[Out, T], Mat]Combine the elements of 2 streams into a stream of tuples, picking always the latest element of each.

Combine the elements of 2 streams into a stream of tuples, picking always the latest element of each.

A `ZipLatest` has a `left` and a `right` input port and one `out` port.

No element is emitted until at least one element from each Source becomes available.

**Emits when** all of the inputs have at least an element available, and then each time an element becomes
\* available on either of the inputs

**Backpressures when** downstream backpressures

**Completes when** any upstream completes

**Cancels when** downstream cancels
185. [**](../../../akka/stream/javadsl/Flow.html#zipLatestMat[T,M,M2](that:akka.stream.Graph[akka.stream.SourceShape[T],M],matF:akka.japi.function.Function2[Mat,M,M2]):akka.stream.javadsl.Flow[In,akka.japi.Pair[Out,T],M2] "Permalink")  def zipLatestMat\[T, M, M2](that: [Graph](../Graph.html)\[[SourceShape](../SourceShape.html)\[T], M], matF: [Function2](../../japi/function/Function2.html)\[Mat, M, M2]): Flow\[In, [Pair](../../japi/Pair.html)\[Out, T], M2]Combine the elements of current Flow and the given [Source](Source.html) into a stream of tuples, picking always the latest element of each.

Combine the elements of current Flow and the given [Source](Source.html) into a stream of tuples, picking always the latest element of each.

It is recommended to use the internally optimized `Keep.left` and `Keep.right` combiners
where appropriate instead of manually writing functions that pass through one of the values.

See also[\#zipLatest](#zipLatest[T](source:akka.stream.Graph[akka.stream.SourceShape[T],_]):akka.stream.javadsl.Flow[In,akka.japi.Pair[Out,T],Mat])
186. [**](../../../akka/stream/javadsl/Flow.html#zipLatestWith[Out2,Out3](that:akka.stream.Graph[akka.stream.SourceShape[Out2],_],eagerComplete:Boolean,combine:akka.japi.function.Function2[Out,Out2,Out3]):akka.stream.javadsl.Flow[In,Out3,Mat] "Permalink")  def zipLatestWith\[Out2, Out3](that: [Graph](../Graph.html)\[[SourceShape](../SourceShape.html)\[Out2], \_], eagerComplete: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), combine: [Function2](../../japi/function/Function2.html)\[Out, Out2, Out3]): Flow\[In, Out3, Mat]Combine the elements of multiple streams into a stream of combined elements using a combiner function,
picking always the latest of the elements of each source.

Combine the elements of multiple streams into a stream of combined elements using a combiner function,
picking always the latest of the elements of each source.

No element is emitted until at least one element from each Source becomes available. Whenever a new
element appears, the zipping function is invoked with a tuple containing the new element
and the other last seen elements.

 **Emits when** all of the inputs have at least an element available, and then each time an element becomes
 available on either of the inputs

 **Backpressures when** downstream backpressures

 **Completes when** any upstream completes if `eagerComplete` is enabled or wait for all upstreams to complete

 **Cancels when** downstream cancels
187. [**](../../../akka/stream/javadsl/Flow.html#zipLatestWith[Out2,Out3](that:akka.stream.Graph[akka.stream.SourceShape[Out2],_],combine:akka.japi.function.Function2[Out,Out2,Out3]):akka.stream.javadsl.Flow[In,Out3,Mat] "Permalink")  def zipLatestWith\[Out2, Out3](that: [Graph](../Graph.html)\[[SourceShape](../SourceShape.html)\[Out2], \_], combine: [Function2](../../japi/function/Function2.html)\[Out, Out2, Out3]): Flow\[In, Out3, Mat]Combine the elements of multiple streams into a stream of combined elements using a combiner function,
picking always the latest of the elements of each source.

Combine the elements of multiple streams into a stream of combined elements using a combiner function,
picking always the latest of the elements of each source.

No element is emitted until at least one element from each Source becomes available. Whenever a new
element appears, the zipping function is invoked with a tuple containing the new element
and the other last seen elements.

 **Emits when** all of the inputs have at least an element available, and then each time an element becomes
 available on either of the inputs

 **Backpressures when** downstream backpressures

 **Completes when** any of the upstreams completes

 **Cancels when** downstream cancels
188. [**](../../../akka/stream/javadsl/Flow.html#zipLatestWithMat[Out2,Out3,M,M2](that:akka.stream.Graph[akka.stream.SourceShape[Out2],M],combine:akka.japi.function.Function2[Out,Out2,Out3],matF:akka.japi.function.Function2[Mat,M,M2]):akka.stream.javadsl.Flow[In,Out3,M2] "Permalink")  def zipLatestWithMat\[Out2, Out3, M, M2](that: [Graph](../Graph.html)\[[SourceShape](../SourceShape.html)\[Out2], M], combine: [Function2](../../japi/function/Function2.html)\[Out, Out2, Out3], matF: [Function2](../../japi/function/Function2.html)\[Mat, M, M2]): Flow\[In, Out3, M2]Put together the elements of current Flow and the given [Source](Source.html)
into a stream of combined elements using a combiner function, picking always the latest element of each.

Put together the elements of current Flow and the given [Source](Source.html)
into a stream of combined elements using a combiner function, picking always the latest element of each.

It is recommended to use the internally optimized `Keep.left` and `Keep.right` combiners
where appropriate instead of manually writing functions that pass through one of the values.

See also[\#zipLatestWith](#zipLatestWith[Out2,Out3](that:akka.stream.Graph[akka.stream.SourceShape[Out2],_],eagerComplete:Boolean,combine:akka.japi.function.Function2[Out,Out2,Out3]):akka.stream.javadsl.Flow[In,Out3,Mat])
189. [**](../../../akka/stream/javadsl/Flow.html#zipLatestWithMat[Out2,Out3,M,M2](that:akka.stream.Graph[akka.stream.SourceShape[Out2],M],eagerComplete:Boolean,combine:akka.japi.function.Function2[Out,Out2,Out3],matF:akka.japi.function.Function2[Mat,M,M2]):akka.stream.javadsl.Flow[In,Out3,M2] "Permalink")  def zipLatestWithMat\[Out2, Out3, M, M2](that: [Graph](../Graph.html)\[[SourceShape](../SourceShape.html)\[Out2], M], eagerComplete: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), combine: [Function2](../../japi/function/Function2.html)\[Out, Out2, Out3], matF: [Function2](../../japi/function/Function2.html)\[Mat, M, M2]): Flow\[In, Out3, M2]Put together the elements of current Flow and the given [Source](Source.html)
into a stream of combined elements using a combiner function, picking always the latest element of each.

Put together the elements of current Flow and the given [Source](Source.html)
into a stream of combined elements using a combiner function, picking always the latest element of each.

It is recommended to use the internally optimized `Keep.left` and `Keep.right` combiners
where appropriate instead of manually writing functions that pass through one of the values.

See also[\#zipLatestWith](#zipLatestWith[Out2,Out3](that:akka.stream.Graph[akka.stream.SourceShape[Out2],_],eagerComplete:Boolean,combine:akka.japi.function.Function2[Out,Out2,Out3]):akka.stream.javadsl.Flow[In,Out3,Mat])
190. [**](../../../akka/stream/javadsl/Flow.html#zipMat[T,M,M2](that:akka.stream.Graph[akka.stream.SourceShape[T],M],matF:akka.japi.function.Function2[Mat,M,M2]):akka.stream.javadsl.Flow[In,akka.japi.Pair[Out,T],M2] "Permalink")  def zipMat\[T, M, M2](that: [Graph](../Graph.html)\[[SourceShape](../SourceShape.html)\[T], M], matF: [Function2](../../japi/function/Function2.html)\[Mat, M, M2]): Flow\[In, [Pair](../../japi/Pair.html)\[Out, T], M2]Combine the elements of current Flow and the given [Source](Source.html) into a stream of tuples.

Combine the elements of current Flow and the given [Source](Source.html) into a stream of tuples.

It is recommended to use the internally optimized `Keep.left` and `Keep.right` combiners
where appropriate instead of manually writing functions that pass through one of the values.

See also[\#zip](#zip[T](source:akka.stream.Graph[akka.stream.SourceShape[T],_]):akka.stream.javadsl.Flow[In,akka.japi.Pair[Out,T],Mat])
191. [**](../../../akka/stream/javadsl/Flow.html#zipWith[Out2,Out3](that:akka.stream.Graph[akka.stream.SourceShape[Out2],_],combine:akka.japi.function.Function2[Out,Out2,Out3]):akka.stream.javadsl.Flow[In,Out3,Mat] "Permalink")  def zipWith\[Out2, Out3](that: [Graph](../Graph.html)\[[SourceShape](../SourceShape.html)\[Out2], \_], combine: [Function2](../../japi/function/Function2.html)\[Out, Out2, Out3]): Flow\[In, Out3, Mat]Put together the elements of current Flow and the given [Source](Source.html)
into a stream of combined elements using a combiner function.

Put together the elements of current Flow and the given [Source](Source.html)
into a stream of combined elements using a combiner function.

**Emits when** all of the inputs have an element available

**Backpressures when** downstream backpressures

**Completes when** any upstream completes

**Cancels when** downstream cancels
192. [**](../../../akka/stream/javadsl/Flow.html#zipWithIndex:akka.stream.javadsl.Flow[In,akka.japi.Pair[Out,Long],Mat] "Permalink")  def zipWithIndex: Flow\[In, [Pair](../../japi/Pair.html)\[Out, [Long](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Long.html#java.lang.Long)], Mat]Combine the elements of current flow into a stream of tuples consisting
of all elements paired with their index.

Combine the elements of current flow into a stream of tuples consisting
of all elements paired with their index. Indices start at 0\.

**Emits when** upstream emits an element and is paired with their index

**Backpressures when** downstream backpressures

**Completes when** upstream completes

**Cancels when** downstream cancels
193. [**](../../../akka/stream/javadsl/Flow.html#zipWithMat[Out2,Out3,M,M2](that:akka.stream.Graph[akka.stream.SourceShape[Out2],M],combine:akka.japi.function.Function2[Out,Out2,Out3],matF:akka.japi.function.Function2[Mat,M,M2]):akka.stream.javadsl.Flow[In,Out3,M2] "Permalink")  def zipWithMat\[Out2, Out3, M, M2](that: [Graph](../Graph.html)\[[SourceShape](../SourceShape.html)\[Out2], M], combine: [Function2](../../japi/function/Function2.html)\[Out, Out2, Out3], matF: [Function2](../../japi/function/Function2.html)\[Mat, M, M2]): Flow\[In, Out3, M2]Put together the elements of current Flow and the given [Source](Source.html)
into a stream of combined elements using a combiner function.

Put together the elements of current Flow and the given [Source](Source.html)
into a stream of combined elements using a combiner function.

It is recommended to use the internally optimized `Keep.left` and `Keep.right` combiners
where appropriate instead of manually writing functions that pass through one of the values.

See also[\#zipWith](#zipWith[Out2,Out3](that:akka.stream.Graph[akka.stream.SourceShape[Out2],_],combine:akka.japi.function.Function2[Out,Out2,Out3]):akka.stream.javadsl.Flow[In,Out3,Mat])
### Shadowed Implicit Value Members

1. [**](../../../akka/stream/javadsl/Flow.html#mapMaterializedValue[M2](f:M=>M2):akka.stream.Graph[S,M2] "Permalink")  def mapMaterializedValue\[M2](f: (Mat) \=\> M2): [Graph](../Graph.html)\[[FlowShape](../FlowShape.html)\[In, Out], M2]Transform the materialized value of this Graph, leaving all other properties as they were.

Transform the materialized value of this Graph, leaving all other properties as they were.

ffunction to map the graph's materialized value

ImplicitThis member is added by an implicit conversion from Flow\[In, Out, Mat] to[GraphMapMatVal](../Graph$$GraphMapMatVal.html)\[[FlowShape](../FlowShape.html)\[In, Out], Mat] performed by method GraphMapMatVal in [akka.stream.Graph](../Graph$.html).ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(flow: GraphMapMatVal[FlowShape[In, Out], Mat]).mapMaterializedValue(f)
```
Definition Classes[GraphMapMatVal](../Graph$$GraphMapMatVal.html)
### Deprecated Value Members

1. [**](../../../akka/stream/javadsl/Flow.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../akka/stream/javadsl/Flow.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from Flow\[In, Out, Mat] toStringFormat\[Flow\[In, Out, Mat]] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/stream/javadsl/Flow.html#recoverWith(clazz:Class[_<:Throwable],supplier:java.util.function.Supplier[akka.stream.Graph[akka.stream.SourceShape[Out],akka.NotUsed]]):akka.stream.javadsl.Flow[In,Out,Mat] "Permalink")  def recoverWith(clazz: Class\[\_ \<: Throwable], supplier: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Graph](../Graph.html)\[[SourceShape](../SourceShape.html)\[Out], [NotUsed](../../NotUsed.html)]]): Flow\[In, Out, Mat]RecoverWith allows to switch to alternative Source on flow failure.

RecoverWith allows to switch to alternative Source on flow failure. It will stay in effect after
a failure has been recovered so that each time there is a failure it is fed into the `pf` and a new
Source may be materialized.

Since the underlying failure signal onError arrives out\-of\-band, it might jump over existing elements.
This operator can recover the failure signal, but not the skipped elements, which will be dropped.

Throwing an exception inside `recoverWith` \_will\_ be logged on ERROR level automatically.

**Emits when** element is available from the upstream or upstream is failed and element is available
from alternative Source

**Backpressures when** downstream backpressures

**Completes when** upstream completes or upstream failed with exception pf can handle

**Cancels when** downstream cancels

Deprecateduse `recoverWithRetries` instead
4. [**](../../../akka/stream/javadsl/Flow.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (Flow\[In, Out, Mat], B)ImplicitThis member is added by an implicit conversion from Flow\[In, Out, Mat] toArrowAssoc\[Flow\[In, Out, Mat]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Graph](../Graph.html)\[[FlowShape](../FlowShape.html)\[In, Out], Mat]

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion GraphMapMatVal fromFlow\[In, Out, Mat] to [GraphMapMatVal](../Graph$$GraphMapMatVal.html)\[[FlowShape](../FlowShape.html)\[In, Out], Mat]

### Inherited by implicit conversion any2stringadd fromFlow\[In, Out, Mat] to any2stringadd\[Flow\[In, Out, Mat]]

### Inherited by implicit conversion StringFormat fromFlow\[In, Out, Mat] to StringFormat\[Flow\[In, Out, Mat]]

### Inherited by implicit conversion Ensuring fromFlow\[In, Out, Mat] to Ensuring\[Flow\[In, Out, Mat]]

### Inherited by implicit conversion ArrowAssoc fromFlow\[In, Out, Mat] to ArrowAssoc\[Flow\[In, Out, Mat]]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.11/akka/Done.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/NotUsed.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ActorRef.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ClassicActorSystemProvider.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/annotation/ApiMayChange.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/event/LogMarker.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/event/LoggingAdapter.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/event/MarkerLoggingAdapter.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/index.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/japi/Pair.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/japi/function/Creator.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/japi/function/Function.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/japi/function/Function2.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/japi/function/Predicate.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/japi/function/Procedure.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/pattern/AskTimeoutException.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/ActorAttributes$$SupervisionStrategy.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/ActorAttributes$.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Attributes$$LogLevels.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Attributes.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/BackpressureTimeoutException.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/BidiShape.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/CompletionTimeoutException.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/DelayOverflowStrategy.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/FlowMonitor.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/FlowShape.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Graph$$GraphMapMatVal.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Graph$.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Graph.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/InitialTimeoutException.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Materializer.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/OverflowStrategy.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/SinkShape.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/SourceShape.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/StreamIdleTimeoutException.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/SubstreamCancelStrategy.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Supervision$$Restart$.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Supervision$$Resume$.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Supervision$$Stop$.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Supervision$.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/ThrottleMode$$Enforcing$.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/ThrottleMode$$Shaping$.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/ThrottleMode.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/WatchedActorTerminatedException.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/index.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/javadsl/AsPublisher.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/javadsl/Balance$.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/javadsl/BidiFlow$.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/javadsl/BidiFlow.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/javadsl/Broadcast$.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10.11/akka/stream/javadsl/Flow.html](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/javadsl/Flow.html)*