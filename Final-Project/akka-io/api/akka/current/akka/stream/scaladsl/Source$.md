---
description: Akka 2.10.17 - akka.stream.scaladsl.Source
knowledge_type: official_documentation
scraped_at: '2026-04-05T22:07:52Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/stream/scaladsl/Source$.html
title: Akka 2.10.17 - akka.stream.scaladsl.Source
---

# Akka 2.10.17 - akka.stream.scaladsl.Source

> **Summary:** Akka 2.10.17 - akka.stream.scaladsl.Source

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/stream/index.html "Permalink")  package [stream](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/stream/scaladsl/index.html "Permalink")  package [scaladsl](index.html "Scala API: The flow DSL allows the formulation of stream transformations based on some input.")Scala API: The flow DSL allows the formulation of stream transformations based on some
input.

Scala API: The flow DSL allows the formulation of stream transformations based on some
input. The starting point is called [Source](Source.html) and can be a collection, an iterator,
a block of code which is evaluated repeatedly or a org.reactivestreams.Publisher.
A flow with an attached input and open output is also a [Source](Source.html).

A flow may also be defined without an attached input or output and that is then
a [Flow](Flow.html). The `Flow` can be connected to the `Source` later by using [Source\#via](Source.html#via[T,Mat2](flow:akka.stream.Graph[akka.stream.FlowShape[Out,T],Mat2]):Source.this.Repr[T]) with
the flow as argument, and it remains a [Source](Source.html).

Transformations can be appended to `Source` and `Flow` with the operations
defined in [FlowOps](FlowOps.html). Each DSL element produces a new flow that can be further transformed,
building up a description of the complete transformation pipeline.

The termination point of a flow is called [Sink](Sink.html) and can for example be a `Future` or
org.reactivestreams.Subscriber. A flow with an attached output and open input
is also a [Sink](Sink.html).

If a flow has both an attached input and an attached output it becomes a [RunnableGraph](RunnableGraph.html).
In order to execute this pipeline the flow must be materialized by calling [RunnableGraph\#run](RunnableGraph.html#run()(implicitmaterializer:akka.stream.Materializer):Mat) on it.

You can create your `Source`, `Flow` and `Sink` in any order and then wire them together before
they are materialized by connecting them using [Flow\#via](Flow.html#via[T,Mat2](flow:akka.stream.Graph[akka.stream.FlowShape[Out,T],Mat2]):Flow.this.Repr[T]) and [Flow\#to](Flow.html#to[Mat2](sink:akka.stream.Graph[akka.stream.SinkShape[Out],Mat2]):akka.stream.scaladsl.Sink[In,Mat]), or connecting them into a
[GraphDSL](GraphDSL$.html) with fan\-in and fan\-out elements.

See [Reactive Streams](https://github.com/reactive-streams/reactive-streams/) for
details on org.reactivestreams.Publisher and org.reactivestreams.Subscriber.

It should be noted that the streams modeled by this library are “hot”,
meaning that they asynchronously flow through a series of processors without
detailed control by the user. In particular it is not predictable how many
elements a given transformation step might buffer before handing elements
downstream, which means that transformation functions may be invoked more
often than for corresponding transformations on strict collections like
List. \*An important consequence\* is that elements that were produced
into a stream may be discarded by later processors, e.g. when using the
\#take operator.

By default every operation is executed within its own [akka.actor.Actor](../../actor/Actor.html)
to enable full pipelining of the chained set of computations. This behavior
is determined by the [akka.stream.Materializer](../Materializer.html) which is required
by those methods that materialize the Flow into a series of
org.reactivestreams.Processor instances. The returned reactive stream
is fully started and active.

Definition Classes[stream](../index.html)
- [Balance](Balance.html "Fan-out the stream to several streams.")
- [BidiFlow](BidiFlow.html)
- [Broadcast](Broadcast.html "Fan-out the stream to several streams emitting each incoming upstream element to all downstream consumers.")
- [BroadcastHub](BroadcastHub$.html "A BroadcastHub is a special streaming hub that is able to broadcast streamed elements to a dynamic set of consumers.")
- [Compression](Compression$.html)
- [Concat](Concat.html "Takes multiple streams and outputs one stream formed from the input streams by first emitting all of the elements from the first stream and then emitting all of the elements from the second stream, etc.")
- [DelayStrategy](DelayStrategy.html "Allows to manage delay.")
- [FileIO](FileIO$.html "Factories to create sinks and sources from files")
- [Flow](Flow.html "A Flow is a set of stream processing steps that has one open input and one open output.")
- [FlowOps](FlowOps.html "Scala API: Operations offered by Sources and Flows with a free output side: the DSL flows left-to-right only.")
- [FlowOpsMat](FlowOpsMat.html "INTERNAL API: this trait will be changed in binary-incompatible ways for classes that are derived from it! Do not implement this interface outside the Akka code base!")
- [FlowWithContext](FlowWithContext.html "A flow that provides operations which automatically propagate the context of an element.")
- [FlowWithContextOps](FlowWithContextOps.html "Shared stream operations for FlowWithContext and SourceWithContext that automatically propagate a context element with each data element.")
- [Framing](Framing$.html)
- [GraphApply](GraphApply.html)
- [GraphDSL](GraphDSL$.html)
- [Interleave](Interleave.html "Interleave represents deterministic merge which takes N elements per input stream, in-order of inputs, emits them downstream and then cycles/\"wraps-around\" the inputs.")
- [JavaFlowSupport](JavaFlowSupport$.html "For use only with JDK 9+.")
- [JsonFraming](JsonFraming$.html "Provides JSON framing operators that can separate valid JSON objects from incoming ByteString objects.")
- [Keep](Keep$.html "Convenience functions for often-encountered purposes like keeping only the left (first) or only the right (second) of two input values.")
- [Merge](Merge.html "Merge several streams, taking elements as they arrive from input streams (picking randomly when several have elements ready).")
- [MergeHub](MergeHub$.html "A MergeHub is a special streaming hub that is able to collect streamed elements from a dynamic set of producers.")
- [MergeLatest](MergeLatest.html)
- [MergePreferred](MergePreferred.html "Merge several streams, taking elements as they arrive from input streams (picking from preferred when several have elements ready).")
- [MergePrioritized](MergePrioritized.html "Merge several streams, taking elements as they arrive from input streams (picking from prioritized once when several have elements ready).")
- [MergeSequence](MergeSequence.html "Takes multiple streams whose elements in aggregate have a defined linear sequence with difference 1, starting at 0, and outputs a single stream containing these elements, in order.")
- [MergeSorted](MergeSorted.html "Merge two pre-sorted streams such that the resulting stream is sorted.")
- [OrElse](OrElse$.html)
- [Partition](Partition.html "Fan-out the stream to several streams.")
- [PartitionHub](PartitionHub$.html "A PartitionHub is a special streaming hub that is able to route streamed elements to a dynamic set of consumers.")
- [RestartFlow](RestartFlow$.html "A RestartFlow wraps a Flow that gets restarted when it completes or fails.")
- [RestartSink](RestartSink$.html "A RestartSink wraps a Sink that gets restarted when it completes or fails.")
- [RestartSource](RestartSource$.html "A RestartSource wraps a Source that gets restarted when it completes or fails.")
- [RestartSourceWithContext](RestartSourceWithContext$.html "A RestartSourceWithContext wraps a SourceWithContext that gets restarted when it completes or fails.")
- [RestartWithBackoffFlow](RestartWithBackoffFlow$.html)
- [RetryFlow](RetryFlow$.html)
- [RunnableGraph](RunnableGraph.html "Flow with attached input and output, can be executed.")
- [ScalaSessionAPI](ScalaSessionAPI.html "Allows access to an SSLSession with Scala types")
- [Sink](Sink.html "A Sink is a set of stream processing steps that has one open input.")
- [SinkQueue](SinkQueue.html "This trait allows to have a queue as a sink for a stream.")
- [SinkQueueWithCancel](SinkQueueWithCancel.html "This trait adds cancel support to SinkQueue.")
- [SinkToCompletionStage](package$$SinkToCompletionStage.html)
- [Source](Source.html "A Source is a set of stream processing steps that has one open output.")
- [SourceQueue](SourceQueue.html "This trait allows to have a queue as a data source for some stream.")
- [SourceQueueWithComplete](SourceQueueWithComplete.html "This trait adds completion support to SourceQueue.")
- [SourceToCompletionStage](package$$SourceToCompletionStage.html)
- [SourceWithContext](SourceWithContext.html "A source that provides operations which automatically propagate the context of an element.")
- [StreamConverters](StreamConverters$.html "Converters for interacting with the blocking java.io streams APIs and Java 8 Streams")
- [StreamRefs](StreamRefs$.html "Factories for creating stream refs.")
- [SubFlow](SubFlow.html "A “stream of streams” sub-flow of data elements, e.g.")
- [TLS](TLS$.html "Stream cipher support based upon JSSE.")
- [TLSPlacebo](TLSPlacebo$.html "This object holds simple wrapping akka.stream.scaladsl.BidiFlow implementations that can be used instead of TLS when no encryption is desired.")
- [Tcp](Tcp.html)
- [TcpAttributes](TcpAttributes$.html)
- [TcpIdleTimeoutException](TcpIdleTimeoutException.html)
- [ThrottleControl](ThrottleControl.html "Control the throttle rate from the outside of the stream, or share a common throttle rate across several streams.")
- [Unzip](Unzip.html "Takes a stream of pair elements and splits each pair to two output streams.")
- [UnzipWith](UnzipWith$.html "Transforms each element of input stream into multiple streams using a splitter function.")
- [UnzipWith10](UnzipWith10.html "UnzipWith specialized for 10 outputs")
- [UnzipWith11](UnzipWith11.html "UnzipWith specialized for 11 outputs")
- [UnzipWith12](UnzipWith12.html "UnzipWith specialized for 12 outputs")
- [UnzipWith13](UnzipWith13.html "UnzipWith specialized for 13 outputs")
- [UnzipWith14](UnzipWith14.html "UnzipWith specialized for 14 outputs")
- [UnzipWith15](UnzipWith15.html "UnzipWith specialized for 15 outputs")
- [UnzipWith16](UnzipWith16.html "UnzipWith specialized for 16 outputs")
- [UnzipWith17](UnzipWith17.html "UnzipWith specialized for 17 outputs")
- [UnzipWith18](UnzipWith18.html "UnzipWith specialized for 18 outputs")
- [UnzipWith19](UnzipWith19.html "UnzipWith specialized for 19 outputs")
- [UnzipWith2](UnzipWith2.html "UnzipWith specialized for 2 outputs")
- [UnzipWith20](UnzipWith20.html "UnzipWith specialized for 20 outputs")
- [UnzipWith21](UnzipWith21.html "UnzipWith specialized for 21 outputs")
- [UnzipWith22](UnzipWith22.html "UnzipWith specialized for 22 outputs")
- [UnzipWith3](UnzipWith3.html "UnzipWith specialized for 3 outputs")
- [UnzipWith4](UnzipWith4.html "UnzipWith specialized for 4 outputs")
- [UnzipWith5](UnzipWith5.html "UnzipWith specialized for 5 outputs")
- [UnzipWith6](UnzipWith6.html "UnzipWith specialized for 6 outputs")
- [UnzipWith7](UnzipWith7.html "UnzipWith specialized for 7 outputs")
- [UnzipWith8](UnzipWith8.html "UnzipWith specialized for 8 outputs")
- [UnzipWith9](UnzipWith9.html "UnzipWith specialized for 9 outputs")
- [UnzipWithApply](UnzipWithApply.html)
- [WireTap](WireTap$.html)
- [Zip](Zip.html "Combine the elements of 2 streams into a stream of tuples.")
- [ZipLatest](ZipLatest.html "Combine the elements of 2 streams into a stream of tuples, picking always the latest element of each.")
- [ZipLatestWith](ZipLatestWith$.html "Combine the elements of multiple streams into a stream of combined elements using a combiner function, picking always the latest of the elements of each source.")
- [ZipLatestWith10](ZipLatestWith10.html "ZipLatestWith specialized for 10 inputs")
- [ZipLatestWith11](ZipLatestWith11.html "ZipLatestWith specialized for 11 inputs")
- [ZipLatestWith12](ZipLatestWith12.html "ZipLatestWith specialized for 12 inputs")
- [ZipLatestWith13](ZipLatestWith13.html "ZipLatestWith specialized for 13 inputs")
- [ZipLatestWith14](ZipLatestWith14.html "ZipLatestWith specialized for 14 inputs")
- [ZipLatestWith15](ZipLatestWith15.html "ZipLatestWith specialized for 15 inputs")
- [ZipLatestWith16](ZipLatestWith16.html "ZipLatestWith specialized for 16 inputs")
- [ZipLatestWith17](ZipLatestWith17.html "ZipLatestWith specialized for 17 inputs")
- [ZipLatestWith18](ZipLatestWith18.html "ZipLatestWith specialized for 18 inputs")
- [ZipLatestWith19](ZipLatestWith19.html "ZipLatestWith specialized for 19 inputs")
- [ZipLatestWith2](ZipLatestWith2.html "ZipLatestWith specialized for 2 inputs")
- [ZipLatestWith20](ZipLatestWith20.html "ZipLatestWith specialized for 20 inputs")
- [ZipLatestWith21](ZipLatestWith21.html "ZipLatestWith specialized for 21 inputs")
- [ZipLatestWith22](ZipLatestWith22.html "ZipLatestWith specialized for 22 inputs")
- [ZipLatestWith3](ZipLatestWith3.html "ZipLatestWith specialized for 3 inputs")
- [ZipLatestWith4](ZipLatestWith4.html "ZipLatestWith specialized for 4 inputs")
- [ZipLatestWith5](ZipLatestWith5.html "ZipLatestWith specialized for 5 inputs")
- [ZipLatestWith6](ZipLatestWith6.html "ZipLatestWith specialized for 6 inputs")
- [ZipLatestWith7](ZipLatestWith7.html "ZipLatestWith specialized for 7 inputs")
- [ZipLatestWith8](ZipLatestWith8.html "ZipLatestWith specialized for 8 inputs")
- [ZipLatestWith9](ZipLatestWith9.html "ZipLatestWith specialized for 9 inputs")
- [ZipLatestWithApply](ZipLatestWithApply.html)
- [ZipN](ZipN.html "Combine the elements of multiple streams into a stream of sequences.")
- [ZipWith](ZipWith$.html "Combine the elements of multiple streams into a stream of combined elements using a combiner function.")
- [ZipWith10](ZipWith10.html "ZipWith specialized for 10 inputs")
- [ZipWith11](ZipWith11.html "ZipWith specialized for 11 inputs")
- [ZipWith12](ZipWith12.html "ZipWith specialized for 12 inputs")
- [ZipWith13](ZipWith13.html "ZipWith specialized for 13 inputs")
- [ZipWith14](ZipWith14.html "ZipWith specialized for 14 inputs")
- [ZipWith15](ZipWith15.html "ZipWith specialized for 15 inputs")
- [ZipWith16](ZipWith16.html "ZipWith specialized for 16 inputs")
- [ZipWith17](ZipWith17.html "ZipWith specialized for 17 inputs")
- [ZipWith18](ZipWith18.html "ZipWith specialized for 18 inputs")
- [ZipWith19](ZipWith19.html "ZipWith specialized for 19 inputs")
- [ZipWith2](ZipWith2.html "ZipWith specialized for 2 inputs")
- [ZipWith20](ZipWith20.html "ZipWith specialized for 20 inputs")
- [ZipWith21](ZipWith21.html "ZipWith specialized for 21 inputs")
- [ZipWith22](ZipWith22.html "ZipWith specialized for 22 inputs")
- [ZipWith3](ZipWith3.html "ZipWith specialized for 3 inputs")
- [ZipWith4](ZipWith4.html "ZipWith specialized for 4 inputs")
- [ZipWith5](ZipWith5.html "ZipWith specialized for 5 inputs")
- [ZipWith6](ZipWith6.html "ZipWith specialized for 6 inputs")
- [ZipWith7](ZipWith7.html "ZipWith specialized for 7 inputs")
- [ZipWith8](ZipWith8.html "ZipWith specialized for 8 inputs")
- [ZipWith9](ZipWith9.html "ZipWith specialized for 9 inputs")
- [ZipWithApply](ZipWithApply.html)
- [ZipWithN](ZipWithN.html "Combine the elements of multiple streams into a stream of sequences using a combiner function.")
[o](Source.html "See companion class")[akka](../../index.html).[stream](../index.html).[scaladsl](index.html)

# [Source](Source.html "See companion class")[**](../../../akka/stream/scaladsl/Source$.html "Permalink")

### Companion [class Source](Source.html "See companion class")

#### object Source

Source[Source.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-stream/src/main/scala/akka/stream/scaladsl/Source.scala#L241)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Source
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../../akka/stream/scaladsl/Source$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/stream/scaladsl/Source$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/stream/scaladsl/Source$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../akka/stream/scaladsl/Source$.html#actorRef[T](completionMatcher:PartialFunction[Any,akka.stream.CompletionStrategy],failureMatcher:PartialFunction[Any,Throwable],bufferSize:Int,overflowStrategy:akka.stream.OverflowStrategy):akka.stream.scaladsl.Source[T,akka.actor.ActorRef] "Permalink")  def actorRef\[T](completionMatcher: [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), [CompletionStrategy](../CompletionStrategy.html)], failureMatcher: [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), Throwable], bufferSize: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), overflowStrategy: [OverflowStrategy](../OverflowStrategy.html)): [Source](Source.html)\[T, [ActorRef](../../actor/ActorRef.html)]Creates a `Source` that is materialized as an [akka.actor.ActorRef](../../actor/ActorRef.html).

Creates a `Source` that is materialized as an [akka.actor.ActorRef](../../actor/ActorRef.html).
Messages sent to this actor will be emitted to the stream if there is demand from downstream,
otherwise they will be buffered until request for demand is received.

Depending on the defined [akka.stream.OverflowStrategy](../OverflowStrategy.html) it might drop elements if
there is no space available in the buffer.

The strategy [akka.stream.OverflowStrategy.backpressure](../OverflowStrategy$.html#backpressure:akka.stream.OverflowStrategy) is not supported, and an
IllegalArgument("Backpressure overflowStrategy not supported") will be thrown if it is passed as argument.

The buffer can be disabled by using `bufferSize` of 0 and then received messages are dropped if there is no demand
from downstream. When `bufferSize` is 0 the `overflowStrategy` does not matter.

The stream can be completed successfully by sending the actor reference a message that is matched by
`completionMatcher` in which case already buffered elements will be signaled before signaling
completion.

The stream can be completed with failure by sending a message that is matched by `failureMatcher`. The extracted
Throwable will be used to fail the stream. In case the Actor is still draining its internal buffer (after having received
a message matched by `completionMatcher`) before signaling completion and it receives a message matched by `failureMatcher`,
the failure will be signaled downstream immediately (instead of the completion signal).

Note that terminating the actor without first completing it, either with a success or a
failure, will prevent the actor triggering downstream completion and the stream will continue
to run even though the source actor is dead. Therefore you should \*\*not\*\* attempt to
manually terminate the actor such as with a [akka.actor.PoisonPill](../../actor/PoisonPill.html).

The actor will be stopped when the stream is completed, failed or canceled from downstream,
i.e. you can watch it to get notified when that happens.

See also [akka.stream.scaladsl.Source.queue](#queue[T](bufferSize:Int,overflowStrategy:akka.stream.OverflowStrategy,maxConcurrentOffers:Int):akka.stream.scaladsl.Source[T,akka.stream.scaladsl.SourceQueueWithComplete[T]]).

completionMatchercatches the completion message to end the stream

failureMatchercatches the failure message to fail the stream

bufferSizeThe size of the buffer in element count

overflowStrategyStrategy that is used when incoming elements cannot fit inside the buffer
5. [**](../../../akka/stream/scaladsl/Source$.html#actorRefWithBackpressure[T](ackMessage:Any,completionMatcher:PartialFunction[Any,akka.stream.CompletionStrategy],failureMatcher:PartialFunction[Any,Throwable]):akka.stream.scaladsl.Source[T,akka.actor.ActorRef] "Permalink")  def actorRefWithBackpressure\[T](ackMessage: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), completionMatcher: [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), [CompletionStrategy](../CompletionStrategy.html)], failureMatcher: [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), Throwable]): [Source](Source.html)\[T, [ActorRef](../../actor/ActorRef.html)]Creates a `Source` that is materialized as an [akka.actor.ActorRef](../../actor/ActorRef.html).

Creates a `Source` that is materialized as an [akka.actor.ActorRef](../../actor/ActorRef.html).
Messages sent to this actor will be emitted to the stream if there is demand from downstream,
and a new message will only be accepted after the previous messages has been consumed and acknowledged back.
The stream will complete with failure if a message is sent before the acknowledgement has been replied back.

The stream can be completed with failure by sending a message that is matched by `failureMatcher`. The extracted
Throwable will be used to fail the stream. In case the Actor is still draining its internal buffer (after having received
a message matched by `completionMatcher`) before signaling completion and it receives a message matched by `failureMatcher`,
the failure will be signaled downstream immediately (instead of the completion signal).

The actor will be stopped when the stream is completed, failed or canceled from downstream,
i.e. you can watch it to get notified when that happens.
6. [**](../../../akka/stream/scaladsl/Source$.html#apply[T](iterable:scala.collection.immutable.Iterable[T]):akka.stream.scaladsl.Source[T,akka.NotUsed] "Permalink")  def apply\[T](iterable: [Iterable](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Iterable.html#scala.collection.immutable.Iterable)\[T]): [Source](Source.html)\[T, [NotUsed](../../NotUsed.html)]Helper to create [Source](Source.html) from `Iterable`.

Helper to create [Source](Source.html) from `Iterable`.
Example usage: `Source(Seq(1,2,3))`

Starts a new `Source` from the given `Iterable`. This is like starting from an
Iterator, but every Subscriber directly attached to the Publisher of this
stream will see an individual flow of elements (always starting from the
beginning) regardless of when they subscribed.
7. [**](../../../akka/stream/scaladsl/Source$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
8. [**](../../../akka/stream/scaladsl/Source$.html#asSubscriber[T]:akka.stream.scaladsl.Source[T,org.reactivestreams.Subscriber[T]] "Permalink")  def asSubscriber\[T]: [Source](Source.html)\[T, Subscriber\[T]]Creates a `Source` that is materialized as a org.reactivestreams.Subscriber
9. [**](../../../akka/stream/scaladsl/Source$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
10. [**](../../../akka/stream/scaladsl/Source$.html#combine[T,U,M](sources:Seq[akka.stream.Graph[akka.stream.SourceShape[T],M]])(fanInStrategy:Int=>akka.stream.Graph[akka.stream.UniformFanInShape[T,U],akka.NotUsed]):akka.stream.scaladsl.Source[U,Seq[M]] "Permalink")  def combine\[T, U, M](sources: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[[Graph](../Graph.html)\[[SourceShape](../SourceShape.html)\[T], M]])(fanInStrategy: ([Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)) \=\> [Graph](../Graph.html)\[[UniformFanInShape](../UniformFanInShape.html)\[T, U], [NotUsed](../../NotUsed.html)]): [Source](Source.html)\[U, [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[M]]Combines several sources with fan\-in strategy like [Merge](Merge.html) or [Concat](Concat.html) into a single [Source](Source.html).
11. [**](../../../akka/stream/scaladsl/Source$.html#combine[T,U](first:akka.stream.scaladsl.Source[T,_],second:akka.stream.scaladsl.Source[T,_],rest:akka.stream.scaladsl.Source[T,_]*)(fanInStrategy:Int=>akka.stream.Graph[akka.stream.UniformFanInShape[T,U],akka.NotUsed]):akka.stream.scaladsl.Source[U,akka.NotUsed] "Permalink")  def combine\[T, U](first: [Source](Source.html)\[T, \_], second: [Source](Source.html)\[T, \_], rest: [Source](Source.html)\[T, \_]\*)(fanInStrategy: ([Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)) \=\> [Graph](../Graph.html)\[[UniformFanInShape](../UniformFanInShape.html)\[T, U], [NotUsed](../../NotUsed.html)]): [Source](Source.html)\[U, [NotUsed](../../NotUsed.html)]Combines several sources with fan\-in strategy like [Merge](Merge.html) or [Concat](Concat.html) into a single [Source](Source.html).
12. [**](../../../akka/stream/scaladsl/Source$.html#combineMat[T,U,M1,M2,M](first:akka.stream.scaladsl.Source[T,M1],second:akka.stream.scaladsl.Source[T,M2])(fanInStrategy:Int=>akka.stream.Graph[akka.stream.UniformFanInShape[T,U],akka.NotUsed])(matF:(M1,M2)=>M):akka.stream.scaladsl.Source[U,M] "Permalink")  def combineMat\[T, U, M1, M2, M](first: [Source](Source.html)\[T, M1], second: [Source](Source.html)\[T, M2])(fanInStrategy: ([Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)) \=\> [Graph](../Graph.html)\[[UniformFanInShape](../UniformFanInShape.html)\[T, U], [NotUsed](../../NotUsed.html)])(matF: (M1, M2) \=\> M): [Source](Source.html)\[U, M]Combines two sources with fan\-in strategy like [Merge](Merge.html) or [Concat](Concat.html) into a single [Source](Source.html) with a materialized value.
13. [**](../../../akka/stream/scaladsl/Source$.html#completionStage[T](completionStage:java.util.concurrent.CompletionStage[T]):akka.stream.scaladsl.Source[T,akka.NotUsed] "Permalink")  def completionStage\[T](completionStage: [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[T]): [Source](Source.html)\[T, [NotUsed](../../NotUsed.html)]Emits a single value when the given `CompletionStage` is successfully completed and then completes the stream.

Emits a single value when the given `CompletionStage` is successfully completed and then completes the stream.
If the `CompletionStage` is completed with a failure the stream is failed.

Here for Java interoperability, the normal use from Scala should be [Source.future](#future[T](futureElement:scala.concurrent.Future[T]):akka.stream.scaladsl.Source[T,akka.NotUsed])
14. [**](../../../akka/stream/scaladsl/Source$.html#cycle[T](f:()=>Iterator[T]):akka.stream.scaladsl.Source[T,akka.NotUsed] "Permalink")  def cycle\[T](f: () \=\> Iterator\[T]): [Source](Source.html)\[T, [NotUsed](../../NotUsed.html)]Creates a [Source](Source.html) that will continually produce elements in the order they are provided.

Creates a [Source](Source.html) that will continually produce elements in the order they are provided.

The following example produces a [Source](Source.html) that repeatedly cycles through the integers from 0 to 9:

```
Source.cycle(() => Iterator.range(0, 10))
```
The function `f` is invoked to obtain an Iterator and elements are emitted into the stream as
provided by that iterator. If the iterator is finite, the function `f` invoked again, as necessary,
when the elements from the previous iteration are exhausted. If every call to the function `f` returns
an iterator that produces the same elements in the same order, then the [Source](Source.html) can be described
as cyclic. However, `f` is not required to behave that way, in which case the [Source](Source.html) will not be cyclic.

The [Source](Source.html) fails if `f` returns an empty iterator.
15. [**](../../../akka/stream/scaladsl/Source$.html#empty[T]:akka.stream.scaladsl.Source[T,akka.NotUsed] "Permalink")  def empty\[T]: [Source](Source.html)\[T, [NotUsed](../../NotUsed.html)]A `Source` with no elements, i.e.

A `Source` with no elements, i.e. an empty stream that is completed immediately for every connected `Sink`.
16. [**](../../../akka/stream/scaladsl/Source$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
17. [**](../../../akka/stream/scaladsl/Source$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
18. [**](../../../akka/stream/scaladsl/Source$.html#failed[T](cause:Throwable):akka.stream.scaladsl.Source[T,akka.NotUsed] "Permalink")  def failed\[T](cause: Throwable): [Source](Source.html)\[T, [NotUsed](../../NotUsed.html)]Create a `Source` that immediately ends the stream with the `cause` error to every connected `Sink`.
19. [**](../../../akka/stream/scaladsl/Source$.html#fromGraph[T,M](g:akka.stream.Graph[akka.stream.SourceShape[T],M]):akka.stream.scaladsl.Source[T,M] "Permalink")  def fromGraph\[T, M](g: [Graph](../Graph.html)\[[SourceShape](../SourceShape.html)\[T], M]): [Source](Source.html)\[T, M]A graph with the shape of a source logically is a source, this method makes
it so also in type.
20. [**](../../../akka/stream/scaladsl/Source$.html#fromIterator[T](f:()=>Iterator[T]):akka.stream.scaladsl.Source[T,akka.NotUsed] "Permalink")  def fromIterator\[T](f: () \=\> Iterator\[T]): [Source](Source.html)\[T, [NotUsed](../../NotUsed.html)]Helper to create a [Source](Source.html) from an `Iterator`.

Helper to create a [Source](Source.html) from an `Iterator`.

Example usage: `Source.fromIterator(() => Iterator.from(0))`

Start a new `Source` from the given function that produces an Iterator.
The produced stream of elements will continue until the iterator runs empty
or fails during evaluation of the `next()` method.
Elements are pulled out of the iterator in accordance with the demand coming
from the downstream transformation steps.
21. [**](../../../akka/stream/scaladsl/Source$.html#fromJavaStream[T,S<:java.util.stream.BaseStream[T,S]](stream:()=>java.util.stream.BaseStream[T,S]):akka.stream.scaladsl.Source[T,akka.NotUsed] "Permalink")  def fromJavaStream\[T, S \<: [BaseStream](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/stream/BaseStream.html#java.util.stream.BaseStream)\[T, S]](stream: () \=\> [BaseStream](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/stream/BaseStream.html#java.util.stream.BaseStream)\[T, S]): [Source](Source.html)\[T, [NotUsed](../../NotUsed.html)]Creates a source that wraps a Java 8 `Stream`.

Creates a source that wraps a Java 8 `Stream`. `Source` uses a stream iterator to get all its
elements and send them downstream on demand.

You can use [Source.async](Source.html#async(dispatcher:String,inputBufferSize:Int):Source.this.Repr[Out]) to create asynchronous boundaries between synchronous Java `Stream`
and the rest of flow.
22. [**](../../../akka/stream/scaladsl/Source$.html#fromMaterializer[T,M](factory:(akka.stream.Materializer,akka.stream.Attributes)=>akka.stream.scaladsl.Source[T,M]):akka.stream.scaladsl.Source[T,scala.concurrent.Future[M]] "Permalink")  def fromMaterializer\[T, M](factory: ([Materializer](../Materializer.html), [Attributes](../Attributes.html)) \=\> [Source](Source.html)\[T, M]): [Source](Source.html)\[T, [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[M]]Defers the creation of a [Source](Source.html) until materialization.

Defers the creation of a [Source](Source.html) until materialization. The `factory` function
exposes [Materializer](../Materializer.html) which is going to be used during materialization and
[Attributes](../Attributes.html) of the [Source](Source.html) returned by this method.
23. [**](../../../akka/stream/scaladsl/Source$.html#fromPublisher[T](publisher:org.reactivestreams.Publisher[T]):akka.stream.scaladsl.Source[T,akka.NotUsed] "Permalink")  def fromPublisher\[T](publisher: Publisher\[T]): [Source](Source.html)\[T, [NotUsed](../../NotUsed.html)]Helper to create [Source](Source.html) from `Publisher`.

Helper to create [Source](Source.html) from `Publisher`.

Construct a transformation starting with given publisher. The transformation steps
are executed by a series of org.reactivestreams.Processor instances
that mediate the flow of elements downstream and the propagation of
back\-pressure upstream.
24. [**](../../../akka/stream/scaladsl/Source$.html#future[T](futureElement:scala.concurrent.Future[T]):akka.stream.scaladsl.Source[T,akka.NotUsed] "Permalink")  def future\[T](futureElement: [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[T]): [Source](Source.html)\[T, [NotUsed](../../NotUsed.html)]Emits a single value when the given `Future` is successfully completed and then completes the stream.

Emits a single value when the given `Future` is successfully completed and then completes the stream.
The stream fails if the `Future` is completed with a failure.
25. [**](../../../akka/stream/scaladsl/Source$.html#futureSource[T,M](futureSource:scala.concurrent.Future[akka.stream.scaladsl.Source[T,M]]):akka.stream.scaladsl.Source[T,scala.concurrent.Future[M]] "Permalink")  def futureSource\[T, M](futureSource: [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Source](Source.html)\[T, M]]): [Source](Source.html)\[T, [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[M]]Turn a `Future[Source]` into a source that will emit the values of the source when the future completes successfully.

Turn a `Future[Source]` into a source that will emit the values of the source when the future completes successfully.
If the `Future` is completed with a failure the stream is failed.
26. [**](../../../akka/stream/scaladsl/Source$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
27. [**](../../../akka/stream/scaladsl/Source$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
28. [**](../../../akka/stream/scaladsl/Source$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
29. [**](../../../akka/stream/scaladsl/Source$.html#lazyFuture[T](create:()=>scala.concurrent.Future[T]):akka.stream.scaladsl.Source[T,akka.NotUsed] "Permalink")  def lazyFuture\[T](create: () \=\> [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[T]): [Source](Source.html)\[T, [NotUsed](../../NotUsed.html)]Defers invoking the `create` function to create a future element until there is downstream demand.

Defers invoking the `create` function to create a future element until there is downstream demand.

The returned future element will be emitted downstream when it completes, or fail the stream if the future
is failed or the `create` function itself fails.

Note that asynchronous boundaries (and other operators) in the stream may do pre\-fetching which counter acts
the laziness and will trigger the factory immediately.
30. [**](../../../akka/stream/scaladsl/Source$.html#lazyFutureSource[T,M](create:()=>scala.concurrent.Future[akka.stream.scaladsl.Source[T,M]]):akka.stream.scaladsl.Source[T,scala.concurrent.Future[M]] "Permalink")  def lazyFutureSource\[T, M](create: () \=\> [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Source](Source.html)\[T, M]]): [Source](Source.html)\[T, [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[M]]Defers invoking the `create` function to create a future source until there is downstream demand.

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
is failed with a [akka.stream.NeverMaterializedException](../NeverMaterializedException.html)
31. [**](../../../akka/stream/scaladsl/Source$.html#lazySingle[T](create:()=>T):akka.stream.scaladsl.Source[T,akka.NotUsed] "Permalink")  def lazySingle\[T](create: () \=\> T): [Source](Source.html)\[T, [NotUsed](../../NotUsed.html)]Defers invoking the `create` function to create a single element until there is downstream demand.

Defers invoking the `create` function to create a single element until there is downstream demand.

If the `create` function fails when invoked the stream is failed.

Note that asynchronous boundaries (and other operators) in the stream may do pre\-fetching which counter acts
the laziness and will trigger the factory immediately.
32. [**](../../../akka/stream/scaladsl/Source$.html#lazySource[T,M](create:()=>akka.stream.scaladsl.Source[T,M]):akka.stream.scaladsl.Source[T,scala.concurrent.Future[M]] "Permalink")  def lazySource\[T, M](create: () \=\> [Source](Source.html)\[T, M]): [Source](Source.html)\[T, [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[M]]Defers invoking the `create` function to create a future source until there is downstream demand.

Defers invoking the `create` function to create a future source until there is downstream demand.

The returned source will emit downstream and behave just like it was the outer source. Downstream completes
when the created source completes and fails when the created source fails.

Note that asynchronous boundaries (and other operators) in the stream may do pre\-fetching which counter acts
the laziness and will trigger the factory immediately.

The materialized future value is completed with the materialized value of the created source when
it has been materialized. If the function throws or the source materialization fails the future materialized value
is failed with the thrown exception.

If downstream cancels or fails before the function is invoked the materialized value
is failed with a [akka.stream.NeverMaterializedException](../NeverMaterializedException.html)
33. [**](../../../akka/stream/scaladsl/Source$.html#maybe[T]:akka.stream.scaladsl.Source[T,scala.concurrent.Promise[Option[T]]] "Permalink")  def maybe\[T]: [Source](Source.html)\[T, [Promise](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Promise.html#scala.concurrent.Promise)\[[Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[T]]]Create a `Source` which materializes a [scala.concurrent.Promise](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Promise.html) which controls what element
will be emitted by the Source.

Create a `Source` which materializes a [scala.concurrent.Promise](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Promise.html) which controls what element
will be emitted by the Source.
If the materialized promise is completed with a Some, that value will be produced downstream,
followed by completion.
If the materialized promise is completed with a None, no value will be produced downstream and completion will
be signalled immediately.
If the materialized promise is completed with a failure, then the source will fail with that error.
If the downstream of this source cancels or fails before the promise has been completed, then the promise will be completed
with None.
34. [**](../../../akka/stream/scaladsl/Source$.html#mergePrioritizedN[T](sourcesAndPriorities:Seq[(akka.stream.scaladsl.Source[T,_],Int)],eagerComplete:Boolean):akka.stream.scaladsl.Source[T,akka.NotUsed] "Permalink")  def mergePrioritizedN\[T](sourcesAndPriorities: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[([Source](Source.html)\[T, \_], [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int))], eagerComplete: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): [Source](Source.html)\[T, [NotUsed](../../NotUsed.html)]Merge multiple [Source](Source.html)s.

Merge multiple [Source](Source.html)s. Prefer the sources depending on the 'priority' parameters.
The provided sources and priorities must have the same size and order.

**emits** when one of the inputs has an element available, preferring inputs based on the 'priority' parameters if both have elements available

**backpressures** when downstream backpressures

**completes** when both upstreams complete (This behavior is changeable to completing when any upstream completes by setting `eagerComplete=true`.)

**Cancels when** downstream cancels
35. [**](../../../akka/stream/scaladsl/Source$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
36. [**](../../../akka/stream/scaladsl/Source$.html#never[T]:akka.stream.scaladsl.Source[T,akka.NotUsed] "Permalink")  def never\[T]: [Source](Source.html)\[T, [NotUsed](../../NotUsed.html)]Never emits any elements, never completes and never fails.

Never emits any elements, never completes and never fails.
This stream could be useful in tests.
37. [**](../../../akka/stream/scaladsl/Source$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
38. [**](../../../akka/stream/scaladsl/Source$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
39. [**](../../../akka/stream/scaladsl/Source$.html#queue[T](bufferSize:Int,overflowStrategy:akka.stream.OverflowStrategy,maxConcurrentOffers:Int):akka.stream.scaladsl.Source[T,akka.stream.scaladsl.SourceQueueWithComplete[T]] "Permalink")  def queue\[T](bufferSize: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), overflowStrategy: [OverflowStrategy](../OverflowStrategy.html), maxConcurrentOffers: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Source](Source.html)\[T, [SourceQueueWithComplete](SourceQueueWithComplete.html)\[T]]Creates a `Source` that is materialized as an [akka.stream.scaladsl.SourceQueueWithComplete](SourceQueueWithComplete.html).

Creates a `Source` that is materialized as an [akka.stream.scaladsl.SourceQueueWithComplete](SourceQueueWithComplete.html).
You can push elements to the queue and they will be emitted to the stream if there is demand from downstream,
otherwise they will be buffered until request for demand is received. Elements in the buffer will be discarded
if downstream is terminated.

Depending on the defined [akka.stream.OverflowStrategy](../OverflowStrategy.html) it might drop elements if
there is no space available in the buffer.

Acknowledgement mechanism is available.
[akka.stream.scaladsl.SourceQueueWithComplete.offer](SourceQueueWithComplete.html#offer(elem:T):scala.concurrent.Future[akka.stream.QueueOfferResult]) returns `Future[QueueOfferResult]` which completes with
`QueueOfferResult.Enqueued` if element was added to buffer or sent downstream. It completes with
`QueueOfferResult.Dropped` if element was dropped. Can also complete with `QueueOfferResult.Failure` \-
when stream failed or `QueueOfferResult.QueueClosed` when downstream is completed.

The strategy [akka.stream.OverflowStrategy.backpressure](../OverflowStrategy$.html#backpressure:akka.stream.OverflowStrategy) will not complete `maxConcurrentOffers` number of
`offer():Future` call when buffer is full.

Instead of using the strategy [akka.stream.OverflowStrategy.dropNew](../OverflowStrategy$.html#dropNew:akka.stream.OverflowStrategy) it's recommended to use
`Source.queue(bufferSize)` instead which returns a [QueueOfferResult](../QueueOfferResult.html) synchronously.

You can watch accessibility of stream with [akka.stream.scaladsl.SourceQueueWithComplete.watchCompletion](SourceQueueWithComplete.html#watchCompletion():scala.concurrent.Future[akka.Done]).
It returns future that completes with success when the operator is completed or fails when the stream is failed.

The buffer can be disabled by using `bufferSize` of 0 and then received message will wait
for downstream demand unless there is another message waiting for downstream demand, in that case
offer result will be completed according to the overflow strategy.

The materialized SourceQueue may be used by up to maxConcurrentOffers concurrent producers.

bufferSizesize of buffer in element count

overflowStrategyStrategy that is used when incoming elements cannot fit inside the buffer

maxConcurrentOffersmaximum number of pending offers when buffer is full, should be greater than 0, not
 applicable when `OverflowStrategy.dropNew` is used
40. [**](../../../akka/stream/scaladsl/Source$.html#queue[T](bufferSize:Int,overflowStrategy:akka.stream.OverflowStrategy):akka.stream.scaladsl.Source[T,akka.stream.scaladsl.SourceQueueWithComplete[T]] "Permalink")  def queue\[T](bufferSize: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), overflowStrategy: [OverflowStrategy](../OverflowStrategy.html)): [Source](Source.html)\[T, [SourceQueueWithComplete](SourceQueueWithComplete.html)\[T]]Creates a `Source` that is materialized as an [akka.stream.scaladsl.SourceQueueWithComplete](SourceQueueWithComplete.html).

Creates a `Source` that is materialized as an [akka.stream.scaladsl.SourceQueueWithComplete](SourceQueueWithComplete.html).
You can push elements to the queue and they will be emitted to the stream if there is demand from downstream,
otherwise they will be buffered until request for demand is received. Elements in the buffer will be discarded
if downstream is terminated.

Depending on the defined [akka.stream.OverflowStrategy](../OverflowStrategy.html) it might drop elements if
there is no space available in the buffer.

Acknowledgement mechanism is available.
[akka.stream.scaladsl.SourceQueueWithComplete.offer](SourceQueueWithComplete.html#offer(elem:T):scala.concurrent.Future[akka.stream.QueueOfferResult]) returns `Future[QueueOfferResult]` which completes with
`QueueOfferResult.Enqueued` if element was added to buffer or sent downstream. It completes with
`QueueOfferResult.Dropped` if element was dropped. Can also complete with `QueueOfferResult.Failure` \-
when stream failed or `QueueOfferResult.QueueClosed` when downstream is completed.

The strategy [akka.stream.OverflowStrategy.backpressure](../OverflowStrategy$.html#backpressure:akka.stream.OverflowStrategy) will not complete last `offer():Future`
call when buffer is full.

Instead of using the strategy [akka.stream.OverflowStrategy.dropNew](../OverflowStrategy$.html#dropNew:akka.stream.OverflowStrategy) it's recommended to use
`Source.queue(bufferSize)` instead which returns a [QueueOfferResult](../QueueOfferResult.html) synchronously.

You can watch accessibility of stream with [akka.stream.scaladsl.SourceQueueWithComplete.watchCompletion](SourceQueueWithComplete.html#watchCompletion():scala.concurrent.Future[akka.Done]).
It returns future that completes with success when the operator is completed or fails when the stream is failed.

The buffer can be disabled by using `bufferSize` of 0 and then received message will wait
for downstream demand unless there is another message waiting for downstream demand, in that case
offer result will be completed according to the overflow strategy.

The materialized SourceQueue may only be used from a single producer.

bufferSizesize of buffer in element count

overflowStrategyStrategy that is used when incoming elements cannot fit inside the buffer
41. [**](../../../akka/stream/scaladsl/Source$.html#queue[T](bufferSize:Int):akka.stream.scaladsl.Source[T,akka.stream.BoundedSourceQueue[T]] "Permalink")  def queue\[T](bufferSize: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Source](Source.html)\[T, [BoundedSourceQueue](../BoundedSourceQueue.html)\[T]]Creates a `Source` that is materialized as an [akka.stream.BoundedSourceQueue](../BoundedSourceQueue.html).

Creates a `Source` that is materialized as an [akka.stream.BoundedSourceQueue](../BoundedSourceQueue.html).
You can push elements to the queue and they will be emitted to the stream if there is demand from downstream,
otherwise they will be buffered until request for demand is received. The buffer size is passed in as a parameter.
Elements in the buffer will be discarded if downstream is terminated.

Pushed elements may be dropped if there is no space available in the buffer. Elements will also be dropped if the
queue is failed through the materialized `BoundedQueueSource` or the `Source` is cancelled by the downstream.
An element that was reported to be `enqueued` is not guaranteed to be processed by the rest of the stream. If the
queue is failed by calling `BoundedQueueSource.fail` or the downstream cancels the stream, elements in the buffer
are discarded.

Acknowledgement of pushed elements is immediate.
[akka.stream.BoundedSourceQueue.offer](../BoundedSourceQueue.html#offer(elem:T):akka.stream.QueueOfferResult) returns [akka.stream.QueueOfferResult](../QueueOfferResult.html) which is implemented as:

`QueueOfferResult.Enqueued` element was added to buffer, but may still be discarded later when the queue is
 failed or cancelled
`QueueOfferResult.Dropped` element was dropped
`QueueOfferResult.QueueComplete` the queue was completed with [akka.stream.BoundedSourceQueue.complete](../BoundedSourceQueue.html#complete():Unit)
`QueueOfferResult.Failure` the queue was failed with [akka.stream.BoundedSourceQueue.fail](../BoundedSourceQueue.html#fail(ex:Throwable):Unit) or if
 the stream failed

bufferSizesize of the buffer in number of elements
42. [**](../../../akka/stream/scaladsl/Source$.html#repeat[T](element:T):akka.stream.scaladsl.Source[T,akka.NotUsed] "Permalink")  def repeat\[T](element: T): [Source](Source.html)\[T, [NotUsed](../../NotUsed.html)]Create a `Source` that will continually emit the given element.
43. [**](../../../akka/stream/scaladsl/Source$.html#shape[T](name:String):akka.stream.SourceShape[T] "Permalink")  def shape\[T](name: String): [SourceShape](../SourceShape.html)\[T]INTERNAL API
44. [**](../../../akka/stream/scaladsl/Source$.html#single[T](element:T):akka.stream.scaladsl.Source[T,akka.NotUsed] "Permalink")  def single\[T](element: T): [Source](Source.html)\[T, [NotUsed](../../NotUsed.html)]Create a `Source` with one element.

Create a `Source` with one element.
Every connected `Sink` of this stream will see an individual stream consisting of one element.
45. [**](../../../akka/stream/scaladsl/Source$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
46. [**](../../../akka/stream/scaladsl/Source$.html#tick[T](initialDelay:scala.concurrent.duration.FiniteDuration,interval:scala.concurrent.duration.FiniteDuration,tick:T):akka.stream.scaladsl.Source[T,akka.actor.Cancellable] "Permalink")  def tick\[T](initialDelay: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), interval: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), tick: T): [Source](Source.html)\[T, [Cancellable](../../actor/Cancellable.html)]Elements are emitted periodically with the specified interval.

Elements are emitted periodically with the specified interval.
The tick element will be delivered to downstream consumers that has requested any elements.
If a consumer has not requested any elements at the point in time when the tick
element is produced it will not receive that tick element later. It will
receive new tick elements as soon as it has requested more elements.
47. [**](../../../akka/stream/scaladsl/Source$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
48. [**](../../../akka/stream/scaladsl/Source$.html#unfold[S,E](s:S)(f:S=>Option[(S,E)]):akka.stream.scaladsl.Source[E,akka.NotUsed] "Permalink")  def unfold\[S, E](s: S)(f: (S) \=\> [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[(S, E)]): [Source](Source.html)\[E, [NotUsed](../../NotUsed.html)]Create a `Source` that will unfold a value of type `S` into
a pair of the next state `S` and output elements of type `E`.

Create a `Source` that will unfold a value of type `S` into
a pair of the next state `S` and output elements of type `E`.

For example, all the Fibonacci numbers under 10M:

```
Source.unfold(0 -> 1) {
 case (a, _) if a > 10000000 => None
 case (a, b) => Some((b -> (a + b)) -> a)
}
```
49. [**](../../../akka/stream/scaladsl/Source$.html#unfoldAsync[S,E](s:S)(f:S=>scala.concurrent.Future[Option[(S,E)]]):akka.stream.scaladsl.Source[E,akka.NotUsed] "Permalink")  def unfoldAsync\[S, E](s: S)(f: (S) \=\> [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[(S, E)]]): [Source](Source.html)\[E, [NotUsed](../../NotUsed.html)]Same as [unfold](#unfold[S,E](s:S)(f:S=>Option[(S,E)]):akka.stream.scaladsl.Source[E,akka.NotUsed]), but uses an async function to generate the next state\-element tuple.

Same as [unfold](#unfold[S,E](s:S)(f:S=>Option[(S,E)]):akka.stream.scaladsl.Source[E,akka.NotUsed]), but uses an async function to generate the next state\-element tuple.

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
50. [**](../../../akka/stream/scaladsl/Source$.html#unfoldResource[T,S](create:()=>S,read:S=>Option[T],close:S=>Unit):akka.stream.scaladsl.Source[T,akka.NotUsed] "Permalink")  def unfoldResource\[T, S](create: () \=\> S, read: (S) \=\> [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[T], close: (S) \=\> [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)): [Source](Source.html)\[T, [NotUsed](../../NotUsed.html)]Start a new `Source` from some resource which can be opened, read and closed.

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
set it for a given Source by using [ActorAttributes](../ActorAttributes$.html).

Adheres to the [ActorAttributes.SupervisionStrategy](../ActorAttributes$$SupervisionStrategy.html) attribute.

create\- function that is called on stream start and creates/opens resource.

read\- function that reads data from opened resource. It is called each time backpressure signal
 is received. Stream calls close and completes when `read` returns None.

close\- function that closes resource
51. [**](../../../akka/stream/scaladsl/Source$.html#unfoldResourceAsync[T,S](create:()=>scala.concurrent.Future[S],read:S=>scala.concurrent.Future[Option[T]],close:S=>scala.concurrent.Future[akka.Done]):akka.stream.scaladsl.Source[T,akka.NotUsed] "Permalink")  def unfoldResourceAsync\[T, S](create: () \=\> [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[S], read: (S) \=\> [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[T]], close: (S) \=\> [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Done](../../Done.html)]): [Source](Source.html)\[T, [NotUsed](../../NotUsed.html)]Start a new `Source` from some resource which can be opened, read and closed.

Start a new `Source` from some resource which can be opened, read and closed.
It's similar to `unfoldResource` but takes functions that return `Futures` instead of plain values.

You can use the supervision strategy to handle exceptions for `read` function or failures of produced `Futures`.
All exceptions thrown by `create` or `close` as well as fails of returned futures will fail the stream.

`Restart` supervision strategy will close and create resource. Default strategy is `Stop` which means
that stream will be terminated on error in `read` function (or future) by default.

You can configure the default dispatcher for this Source by changing the `akka.stream.materializer.blocking-io-dispatcher` or
set it for a given Source by using [ActorAttributes](../ActorAttributes$.html).

Adheres to the [ActorAttributes.SupervisionStrategy](../ActorAttributes$$SupervisionStrategy.html) attribute.

create\- function that is called on stream start and creates/opens resource.

read\- function that reads data from opened resource. It is called each time backpressure signal
 is received. Stream calls close and completes when `Future` from read function returns None.

close\- function that closes resource
52. [**](../../../akka/stream/scaladsl/Source$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
53. [**](../../../akka/stream/scaladsl/Source$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
54. [**](../../../akka/stream/scaladsl/Source$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
55. [**](../../../akka/stream/scaladsl/Source$.html#zipN[T](sources:Seq[akka.stream.scaladsl.Source[T,_]]):akka.stream.scaladsl.Source[Seq[T],akka.NotUsed] "Permalink")  def zipN\[T](sources: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[[Source](Source.html)\[T, \_]]): [Source](Source.html)\[[Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[T], [NotUsed](../../NotUsed.html)]Combine the elements of multiple streams into a stream of sequences.
56. [**](../../../akka/stream/scaladsl/Source$.html#zipWithN[T,O](zipper:Seq[T]=>O)(sources:Seq[akka.stream.scaladsl.Source[T,_]]):akka.stream.scaladsl.Source[O,akka.NotUsed] "Permalink")  def zipWithN\[T, O](zipper: ([Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[T]) \=\> O)(sources: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[[Source](Source.html)\[T, \_]]): [Source](Source.html)\[O, [NotUsed](../../NotUsed.html)]
### Deprecated Value Members

1. [**](../../../akka/stream/scaladsl/Source$.html#actorRef[T](bufferSize:Int,overflowStrategy:akka.stream.OverflowStrategy):akka.stream.scaladsl.Source[T,akka.actor.ActorRef] "Permalink")  def actorRef\[T](bufferSize: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), overflowStrategy: [OverflowStrategy](../OverflowStrategy.html)): [Source](Source.html)\[T, [ActorRef](../../actor/ActorRef.html)]Creates a `Source` that is materialized as an [akka.actor.ActorRef](../../actor/ActorRef.html).

Creates a `Source` that is materialized as an [akka.actor.ActorRef](../../actor/ActorRef.html).
Messages sent to this actor will be emitted to the stream if there is demand from downstream,
otherwise they will be buffered until request for demand is received.

Depending on the defined [akka.stream.OverflowStrategy](../OverflowStrategy.html) it might drop elements if
there is no space available in the buffer.

The strategy [akka.stream.OverflowStrategy.backpressure](../OverflowStrategy$.html#backpressure:akka.stream.OverflowStrategy) is not supported, and an
IllegalArgument("Backpressure overflowStrategy not supported") will be thrown if it is passed as argument.

The buffer can be disabled by using `bufferSize` of 0 and then received messages are dropped if there is no demand
from downstream. When `bufferSize` is 0 the `overflowStrategy` does not matter.

The stream can be completed successfully by sending the actor reference a [akka.actor.Status.Success](../../actor/Status$$Success.html).
If the content is [akka.stream.CompletionStrategy.immediately](../CompletionStrategy$.html#immediately:akka.stream.CompletionStrategy) the completion will be signaled immediately.
Otherwise, if the content is [akka.stream.CompletionStrategy.draining](../CompletionStrategy$.html#draining:akka.stream.CompletionStrategy) (or anything else)
already buffered elements will be sent out before signaling completion.
Using [akka.actor.PoisonPill](../../actor/PoisonPill.html) or [akka.actor.ActorSystem.stop](../../actor/ActorSystem.html#stop(actor:akka.actor.ActorRef):Unit) to stop the actor and complete the stream is \*not supported\*.

The stream can be completed with failure by sending a [akka.actor.Status.Failure](../../actor/Status$$Failure.html) to the
actor reference. In case the Actor is still draining its internal buffer (after having received
a [akka.actor.Status.Success](../../actor/Status$$Success.html)) before signaling completion and it receives a [akka.actor.Status.Failure](../../actor/Status$$Failure.html),
the failure will be signaled downstream immediately (instead of the completion signal).

The actor will be stopped when the stream is canceled from downstream,
i.e. you can watch it to get notified when that happens.

See also [akka.stream.scaladsl.Source.queue](#queue[T](bufferSize:Int,overflowStrategy:akka.stream.OverflowStrategy,maxConcurrentOffers:Int):akka.stream.scaladsl.Source[T,akka.stream.scaladsl.SourceQueueWithComplete[T]]).

bufferSizeThe size of the buffer in element count

overflowStrategyStrategy that is used when incoming elements cannot fit inside the buffer

Annotations@deprecated Deprecated*(Since version 2\.6\.0\)* Use variant accepting completion and failure matchers instead
2. [**](../../../akka/stream/scaladsl/Source$.html#actorRefWithAck[T](ackMessage:Any):akka.stream.scaladsl.Source[T,akka.actor.ActorRef] "Permalink")  def actorRefWithAck\[T](ackMessage: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Source](Source.html)\[T, [ActorRef](../../actor/ActorRef.html)]Creates a `Source` that is materialized as an [akka.actor.ActorRef](../../actor/ActorRef.html).

Creates a `Source` that is materialized as an [akka.actor.ActorRef](../../actor/ActorRef.html).
Messages sent to this actor will be emitted to the stream if there is demand from downstream,
and a new message will only be accepted after the previous messages has been consumed and acknowledged back.
The stream will complete with failure if a message is sent before the acknowledgement has been replied back.

The stream can be completed successfully by sending the actor reference a [akka.actor.Status.Success](../../actor/Status$$Success.html).
If the content is [akka.stream.CompletionStrategy.immediately](../CompletionStrategy$.html#immediately:akka.stream.CompletionStrategy) the completion will be signaled immediately,
otherwise if the content is [akka.stream.CompletionStrategy.draining](../CompletionStrategy$.html#draining:akka.stream.CompletionStrategy) (or anything else)
already buffered element will be signaled before signaling completion.

The stream can be completed with failure by sending a [akka.actor.Status.Failure](../../actor/Status$$Failure.html) to the
actor reference. In case the Actor is still draining its internal buffer (after having received
a [akka.actor.Status.Success](../../actor/Status$$Success.html)) before signaling completion and it receives a [akka.actor.Status.Failure](../../actor/Status$$Failure.html),
the failure will be signaled downstream immediately (instead of the completion signal).

The actor will be stopped when the stream is completed, failed or canceled from downstream,
i.e. you can watch it to get notified when that happens.

Annotations@deprecated Deprecated*(Since version 2\.6\.0\)* Use actorRefWithBackpressure accepting completion and failure matchers instead
3. [**](../../../akka/stream/scaladsl/Source$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
4. [**](../../../akka/stream/scaladsl/Source$.html#fromCompletionStage[T](future:java.util.concurrent.CompletionStage[T]):akka.stream.scaladsl.Source[T,akka.NotUsed] "Permalink")  def fromCompletionStage\[T](future: [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[T]): [Source](Source.html)\[T, [NotUsed](../../NotUsed.html)]Starts a new `Source` from the given `Future`.

Starts a new `Source` from the given `Future`. The stream will consist of
one element when the `Future` is completed with a successful value, which
may happen before or after materializing the `Flow`.
The stream terminates with a failure if the `Future` is completed with a failure.

Annotations@deprecated Deprecated*(Since version 2\.6\.0\)* Use 'Source.completionStage' instead
5. [**](../../../akka/stream/scaladsl/Source$.html#fromFuture[T](future:scala.concurrent.Future[T]):akka.stream.scaladsl.Source[T,akka.NotUsed] "Permalink")  def fromFuture\[T](future: [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[T]): [Source](Source.html)\[T, [NotUsed](../../NotUsed.html)]Starts a new `Source` from the given `Future`.

Starts a new `Source` from the given `Future`. The stream will consist of
one element when the `Future` is completed with a successful value, which
may happen before or after materializing the `Flow`.
The stream terminates with a failure if the `Future` is completed with a failure.

Annotations@deprecated Deprecated*(Since version 2\.6\.0\)* Use 'Source.future' instead
6. [**](../../../akka/stream/scaladsl/Source$.html#fromFutureSource[T,M](future:scala.concurrent.Future[akka.stream.Graph[akka.stream.SourceShape[T],M]]):akka.stream.scaladsl.Source[T,scala.concurrent.Future[M]] "Permalink")  def fromFutureSource\[T, M](future: [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Graph](../Graph.html)\[[SourceShape](../SourceShape.html)\[T], M]]): [Source](Source.html)\[T, [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[M]]Streams the elements of the given future source once it successfully completes.

Streams the elements of the given future source once it successfully completes.
If the Future fails the stream is failed with the exception from the future. If downstream cancels before the
stream completes the materialized `Future` will be failed with a [StreamDetachedException](../StreamDetachedException.html)

Annotations@deprecated Deprecated*(Since version 2\.6\.0\)* Use 'Source.futureSource' (potentially together with `Source.fromGraph`) instead
7. [**](../../../akka/stream/scaladsl/Source$.html#fromSourceCompletionStage[T,M](completion:java.util.concurrent.CompletionStage[_<:akka.stream.Graph[akka.stream.SourceShape[T],M]]):akka.stream.scaladsl.Source[T,java.util.concurrent.CompletionStage[M]] "Permalink")  def fromSourceCompletionStage\[T, M](completion: [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[\_ \<: [Graph](../Graph.html)\[[SourceShape](../SourceShape.html)\[T], M]]): [Source](Source.html)\[T, [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[M]]Streams the elements of an asynchronous source once its given `completion` operator completes.

Streams the elements of an asynchronous source once its given `completion` operator completes.
If the CompletionStage fails the stream is failed with the exception from the future.
If downstream cancels before the stream completes the materialized `Future` will be failed
with a [StreamDetachedException](../StreamDetachedException.html)

Annotations@deprecated Deprecated*(Since version 2\.6\.0\)* Use scala\-compat CompletionStage to future converter and 'Source.futureSource' instead
8. [**](../../../akka/stream/scaladsl/Source$.html#lazily[T,M](create:()=>akka.stream.scaladsl.Source[T,M]):akka.stream.scaladsl.Source[T,scala.concurrent.Future[M]] "Permalink")  def lazily\[T, M](create: () \=\> [Source](Source.html)\[T, M]): [Source](Source.html)\[T, [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[M]]Creates a `Source` that is not materialized until there is downstream demand, when the source gets materialized
the materialized future is completed with its value, if downstream cancels or fails without any demand the
create factory is never called and the materialized `Future` is failed.

Creates a `Source` that is not materialized until there is downstream demand, when the source gets materialized
the materialized future is completed with its value, if downstream cancels or fails without any demand the
create factory is never called and the materialized `Future` is failed.

Annotations@deprecated Deprecated*(Since version 2\.6\.0\)* Use 'Source.lazySource' instead
9. [**](../../../akka/stream/scaladsl/Source$.html#lazilyAsync[T](create:()=>scala.concurrent.Future[T]):akka.stream.scaladsl.Source[T,scala.concurrent.Future[akka.NotUsed]] "Permalink")  def lazilyAsync\[T](create: () \=\> [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[T]): [Source](Source.html)\[T, [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[NotUsed](../../NotUsed.html)]]Creates a `Source` from supplied future factory that is not called until downstream demand.

Creates a `Source` from supplied future factory that is not called until downstream demand. When source gets
materialized the materialized future is completed with the value from the factory. If downstream cancels or fails
without any demand the create factory is never called and the materialized `Future` is failed.

Annotations@deprecated Deprecated*(Since version 2\.6\.0\)* Use 'Source.lazyFuture' instead

See also[Source.lazily](#lazily[T,M](create:()=>akka.stream.scaladsl.Source[T,M]):akka.stream.scaladsl.Source[T,scala.concurrent.Future[M]])
10. [**](../../../akka/stream/scaladsl/Source$.html#setup[T,M](factory:(akka.stream.ActorMaterializer,akka.stream.Attributes)=>akka.stream.scaladsl.Source[T,M]):akka.stream.scaladsl.Source[T,scala.concurrent.Future[M]] "Permalink")  def setup\[T, M](factory: ([ActorMaterializer](../ActorMaterializer.html), [Attributes](../Attributes.html)) \=\> [Source](Source.html)\[T, M]): [Source](Source.html)\[T, [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[M]]Defers the creation of a [Source](Source.html) until materialization.

Defers the creation of a [Source](Source.html) until materialization. The `factory` function
exposes [ActorMaterializer](../ActorMaterializer.html) which is going to be used during materialization and
[Attributes](../Attributes.html) of the [Source](Source.html) returned by this method.

Annotations@deprecated Deprecated*(Since version 2\.6\.0\)* Use 'fromMaterializer' instead
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/Done.html
- https://doc.akka.io/api/akka/current/akka/NotUsed.html
- https://doc.akka.io/api/akka/current/akka/actor/Actor.html
- https://doc.akka.io/api/akka/current/akka/actor/ActorRef.html
- https://doc.akka.io/api/akka/current/akka/actor/ActorSystem.html
- https://doc.akka.io/api/akka/current/akka/actor/Cancellable.html
- https://doc.akka.io/api/akka/current/akka/actor/PoisonPill.html
- https://doc.akka.io/api/akka/current/akka/actor/Status$$Failure.html
- https://doc.akka.io/api/akka/current/akka/actor/Status$$Success.html
- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/akka/stream/ActorAttributes$$SupervisionStrategy.html
- https://doc.akka.io/api/akka/current/akka/stream/ActorAttributes$.html
- https://doc.akka.io/api/akka/current/akka/stream/ActorMaterializer.html
- https://doc.akka.io/api/akka/current/akka/stream/Attributes.html
- https://doc.akka.io/api/akka/current/akka/stream/BoundedSourceQueue.html
- https://doc.akka.io/api/akka/current/akka/stream/CompletionStrategy$.html
- https://doc.akka.io/api/akka/current/akka/stream/CompletionStrategy.html
- https://doc.akka.io/api/akka/current/akka/stream/Graph.html
- https://doc.akka.io/api/akka/current/akka/stream/Materializer.html
- https://doc.akka.io/api/akka/current/akka/stream/NeverMaterializedException.html
- https://doc.akka.io/api/akka/current/akka/stream/OverflowStrategy$.html
- https://doc.akka.io/api/akka/current/akka/stream/OverflowStrategy.html
- https://doc.akka.io/api/akka/current/akka/stream/QueueOfferResult.html
- https://doc.akka.io/api/akka/current/akka/stream/SourceShape.html
- https://doc.akka.io/api/akka/current/akka/stream/StreamDetachedException.html
- https://doc.akka.io/api/akka/current/akka/stream/UniformFanInShape.html
- https://doc.akka.io/api/akka/current/akka/stream/index.html
- https://doc.akka.io/api/akka/current/akka/stream/scaladsl/Balance$.html
- https://doc.akka.io/api/akka/current/akka/stream/scaladsl/Balance.html
- https://doc.akka.io/api/akka/current/akka/stream/scaladsl/BidiFlow$.html
- https://doc.akka.io/api/akka/current/akka/stream/scaladsl/BidiFlow.html
- https://doc.akka.io/api/akka/current/akka/stream/scaladsl/Broadcast$.html
- https://doc.akka.io/api/akka/current/akka/stream/scaladsl/Broadcast.html
- https://doc.akka.io/api/akka/current/akka/stream/scaladsl/BroadcastHub$.html
- https://doc.akka.io/api/akka/current/akka/stream/scaladsl/Compression$.html
- https://doc.akka.io/api/akka/current/akka/stream/scaladsl/Concat$.html
- https://doc.akka.io/api/akka/current/akka/stream/scaladsl/Concat.html
- https://doc.akka.io/api/akka/current/akka/stream/scaladsl/DelayStrategy$.html
- https://doc.akka.io/api/akka/current/akka/stream/scaladsl/DelayStrategy.html
- https://doc.akka.io/api/akka/current/akka/stream/scaladsl/FileIO$.html
- https://doc.akka.io/api/akka/current/akka/stream/scaladsl/Flow$.html
- https://doc.akka.io/api/akka/current/akka/stream/scaladsl/Flow.html
- https://doc.akka.io/api/akka/current/akka/stream/scaladsl/FlowOps.html
- https://doc.akka.io/api/akka/current/akka/stream/scaladsl/FlowOpsMat.html
- https://doc.akka.io/api/akka/current/akka/stream/scaladsl/FlowWithContext$.html
- https://doc.akka.io/api/akka/current/akka/stream/scaladsl/FlowWithContext.html
- https://doc.akka.io/api/akka/current/akka/stream/scaladsl/FlowWithContextOps.html
- https://doc.akka.io/api/akka/current/akka/stream/scaladsl/Framing$.html
- https://doc.akka.io/api/akka/current/akka/stream/scaladsl/GraphApply.html
- https://doc.akka.io/api/akka/current/akka/stream/scaladsl/GraphDSL$.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/stream/scaladsl/Source$.html](https://doc.akka.io/api/akka/current/akka/stream/scaladsl/Source$.html)*