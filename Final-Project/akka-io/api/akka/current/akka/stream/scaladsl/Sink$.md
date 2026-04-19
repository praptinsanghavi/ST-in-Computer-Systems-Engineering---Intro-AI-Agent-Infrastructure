---
description: Akka 2.10.17 - akka.stream.scaladsl.Sink
knowledge_type: official_documentation
scraped_at: '2026-04-05T22:07:42Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/stream/scaladsl/Sink$.html
title: Akka 2.10.17 - akka.stream.scaladsl.Sink
---

# Akka 2.10.17 - akka.stream.scaladsl.Sink

> **Summary:** Akka 2.10.17 - akka.stream.scaladsl.Sink

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
[o](Sink.html "See companion class")[akka](../../index.html).[stream](../index.html).[scaladsl](index.html)

# [Sink](Sink.html "See companion class")[**](../../../akka/stream/scaladsl/Sink$.html "Permalink")

### Companion [class Sink](Sink.html "See companion class")

#### object Sink

Source[Sink.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-stream/src/main/scala/akka/stream/scaladsl/Sink.scala#L135)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Sink
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../../akka/stream/scaladsl/Sink$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/stream/scaladsl/Sink$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/stream/scaladsl/Sink$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../akka/stream/scaladsl/Sink$.html#actorRef[T](ref:akka.actor.ActorRef,onCompleteMessage:Any,onFailureMessage:Throwable=>Any):akka.stream.scaladsl.Sink[T,akka.NotUsed] "Permalink")  def actorRef\[T](ref: [ActorRef](../../actor/ActorRef.html), onCompleteMessage: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), onFailureMessage: (Throwable) \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Sink](Sink.html)\[T, [NotUsed](../../NotUsed.html)]INTERNAL API

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
5. [**](../../../akka/stream/scaladsl/Sink$.html#actorRefWithBackpressure[T](ref:akka.actor.ActorRef,onInitMessage:Any,onCompleteMessage:Any,onFailureMessage:Throwable=>Any):akka.stream.scaladsl.Sink[T,akka.NotUsed] "Permalink")  def actorRefWithBackpressure\[T](ref: [ActorRef](../../actor/ActorRef.html), onInitMessage: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), onCompleteMessage: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), onFailureMessage: (Throwable) \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Sink](Sink.html)\[T, [NotUsed](../../NotUsed.html)]Sends the elements of the stream to the given `ActorRef` that sends back back\-pressure signal.

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
6. [**](../../../akka/stream/scaladsl/Sink$.html#actorRefWithBackpressure[T](ref:akka.actor.ActorRef,onInitMessage:Any,ackMessage:Any,onCompleteMessage:Any,onFailureMessage:Throwable=>Any):akka.stream.scaladsl.Sink[T,akka.NotUsed] "Permalink")  def actorRefWithBackpressure\[T](ref: [ActorRef](../../actor/ActorRef.html), onInitMessage: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), ackMessage: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), onCompleteMessage: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), onFailureMessage: (Throwable) \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Sink](Sink.html)\[T, [NotUsed](../../NotUsed.html)]Sends the elements of the stream to the given `ActorRef` that sends back back\-pressure signal.

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
7. [**](../../../akka/stream/scaladsl/Sink$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
8. [**](../../../akka/stream/scaladsl/Sink$.html#asPublisher[T](fanout:Boolean):akka.stream.scaladsl.Sink[T,org.reactivestreams.Publisher[T]] "Permalink")  def asPublisher\[T](fanout: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): [Sink](Sink.html)\[T, Publisher\[T]]A `Sink` that materializes into a org.reactivestreams.Publisher.

A `Sink` that materializes into a org.reactivestreams.Publisher.

If `fanout` is `true`, the materialized `Publisher` will support multiple `Subscriber`s and
the size of the `inputBuffer` configured for this operator becomes the maximum number of elements that
the fastest org.reactivestreams.Subscriber can be ahead of the slowest one before slowing
the processing down due to back pressure.

If `fanout` is `false` then the materialized `Publisher` will only support a single `Subscriber` and
reject any additional `Subscriber`s.
9. [**](../../../akka/stream/scaladsl/Sink$.html#cancelled[T]:akka.stream.scaladsl.Sink[T,akka.NotUsed] "Permalink")  def cancelled\[T]: [Sink](Sink.html)\[T, [NotUsed](../../NotUsed.html)]A `Sink` that immediately cancels its upstream after materialization.
10. [**](../../../akka/stream/scaladsl/Sink$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
11. [**](../../../akka/stream/scaladsl/Sink$.html#collection[T,That](implicitcbf:scala.collection.Factory[T,Thatwithscala.collection.immutable.Iterable[_]]):akka.stream.scaladsl.Sink[T,scala.concurrent.Future[That]] "Permalink")  def collection\[T, That](implicit cbf: [Factory](https://www.scala-lang.org/api/2.13.17/scala/collection/Factory.html#scala.collection.Factory)\[T, That with [Iterable](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Iterable.html#scala.collection.immutable.Iterable)\[\_]]): [Sink](Sink.html)\[T, [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[That]]A `Sink` that keeps on collecting incoming elements until upstream terminates.

A `Sink` that keeps on collecting incoming elements until upstream terminates.
As upstream may be unbounded, `Flow[T].take` or the stricter `Flow[T].limit` (and their variants)
may be used to ensure boundedness.
Materializes into a `Future` of `That[T]` containing all the collected elements.
`That[T]` is limited to the limitations of the CanBuildFrom associated with it. For example, `Seq` is limited to
`Int.MaxValue` elements. See \[The Architecture of Scala 2\.13's Collections](https://docs.scala\-lang.org/overviews/core/architecture\-of\-scala\-213\-collections.html) for more info.
This Sink will cancel the stream after having received that many elements.

See also [Flow.limit](Flow.html#limit(max:Long):FlowOps.this.Repr[Out]), [Flow.limitWeighted](Flow.html#limitWeighted[T](max:Long)(costFn:Out=>Long):FlowOps.this.Repr[Out]), [Flow.take](Flow.html#take(n:Long):FlowOps.this.Repr[Out]), [Flow.takeWithin](Flow.html#takeWithin(d:scala.concurrent.duration.FiniteDuration):FlowOps.this.Repr[Out]), [Flow.takeWhile](Flow.html#takeWhile(p:Out=>Boolean,inclusive:Boolean):FlowOps.this.Repr[Out])
12. [**](../../../akka/stream/scaladsl/Sink$.html#combine[T,U,M](sinks:Seq[akka.stream.Graph[akka.stream.SinkShape[U],M]])(fanOutStrategy:Int=>akka.stream.Graph[akka.stream.UniformFanOutShape[T,U],akka.NotUsed]):akka.stream.scaladsl.Sink[T,Seq[M]] "Permalink")  def combine\[T, U, M](sinks: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[[Graph](../Graph.html)\[[SinkShape](../SinkShape.html)\[U], M]])(fanOutStrategy: ([Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)) \=\> [Graph](../Graph.html)\[[UniformFanOutShape](../UniformFanOutShape.html)\[T, U], [NotUsed](../../NotUsed.html)]): [Sink](Sink.html)\[T, [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[M]]Combine several sinks with fan\-out strategy like `Broadcast` or `Balance` and returns `Sink`.

Combine several sinks with fan\-out strategy like `Broadcast` or `Balance` and returns `Sink`.
The fanoutGraph's outlets size must match the provides sinks'.
13. [**](../../../akka/stream/scaladsl/Sink$.html#combine[T,U](first:akka.stream.scaladsl.Sink[U,_],second:akka.stream.scaladsl.Sink[U,_],rest:akka.stream.scaladsl.Sink[U,_]*)(fanOutStrategy:Int=>akka.stream.Graph[akka.stream.UniformFanOutShape[T,U],akka.NotUsed]):akka.stream.scaladsl.Sink[T,akka.NotUsed] "Permalink")  def combine\[T, U](first: [Sink](Sink.html)\[U, \_], second: [Sink](Sink.html)\[U, \_], rest: [Sink](Sink.html)\[U, \_]\*)(fanOutStrategy: ([Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)) \=\> [Graph](../Graph.html)\[[UniformFanOutShape](../UniformFanOutShape.html)\[T, U], [NotUsed](../../NotUsed.html)]): [Sink](Sink.html)\[T, [NotUsed](../../NotUsed.html)]Combine several sinks with fan\-out strategy like `Broadcast` or `Balance` and returns `Sink`.
14. [**](../../../akka/stream/scaladsl/Sink$.html#combineMat[T,U,M1,M2,M](first:akka.stream.scaladsl.Sink[U,M1],second:akka.stream.scaladsl.Sink[U,M2])(fanOutStrategy:Int=>akka.stream.Graph[akka.stream.UniformFanOutShape[T,U],akka.NotUsed])(matF:(M1,M2)=>M):akka.stream.scaladsl.Sink[T,M] "Permalink")  def combineMat\[T, U, M1, M2, M](first: [Sink](Sink.html)\[U, M1], second: [Sink](Sink.html)\[U, M2])(fanOutStrategy: ([Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)) \=\> [Graph](../Graph.html)\[[UniformFanOutShape](../UniformFanOutShape.html)\[T, U], [NotUsed](../../NotUsed.html)])(matF: (M1, M2) \=\> M): [Sink](Sink.html)\[T, M]Combine two sinks with fan\-out strategy like `Broadcast` or `Balance` and returns `Sink` with 2 outlets.
15. [**](../../../akka/stream/scaladsl/Sink$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
16. [**](../../../akka/stream/scaladsl/Sink$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
17. [**](../../../akka/stream/scaladsl/Sink$.html#fold[U,T](zero:U)(f:(U,T)=>U):akka.stream.scaladsl.Sink[T,scala.concurrent.Future[U]] "Permalink")  def fold\[U, T](zero: U)(f: (U, T) \=\> U): [Sink](Sink.html)\[T, [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[U]]A `Sink` that will invoke the given function for every received element, giving it its previous
output (or the given `zero` value) and the element as input.

A `Sink` that will invoke the given function for every received element, giving it its previous
output (or the given `zero` value) and the element as input.
The returned [scala.concurrent.Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html) will be completed with value of the final
function evaluation when the input stream ends, or completed with `Failure`
if there is a failure signaled in the stream.

See also[\#foldAsync](#foldAsync[U,T](zero:U)(f:(U,T)=>scala.concurrent.Future[U]):akka.stream.scaladsl.Sink[T,scala.concurrent.Future[U]])
18. [**](../../../akka/stream/scaladsl/Sink$.html#foldAsync[U,T](zero:U)(f:(U,T)=>scala.concurrent.Future[U]):akka.stream.scaladsl.Sink[T,scala.concurrent.Future[U]] "Permalink")  def foldAsync\[U, T](zero: U)(f: (U, T) \=\> [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[U]): [Sink](Sink.html)\[T, [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[U]]A `Sink` that will invoke the given asynchronous function for every received element, giving it its previous
output (or the given `zero` value) and the element as input.

A `Sink` that will invoke the given asynchronous function for every received element, giving it its previous
output (or the given `zero` value) and the element as input.
The returned [scala.concurrent.Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html) will be completed with value of the final
function evaluation when the input stream ends, or completed with `Failure`
if there is a failure signaled in the stream.

See also[\#fold](#fold[U,T](zero:U)(f:(U,T)=>U):akka.stream.scaladsl.Sink[T,scala.concurrent.Future[U]])
19. [**](../../../akka/stream/scaladsl/Sink$.html#foreach[T](f:T=>Unit):akka.stream.scaladsl.Sink[T,scala.concurrent.Future[akka.Done]] "Permalink")  def foreach\[T](f: (T) \=\> [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)): [Sink](Sink.html)\[T, [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Done](../../Done.html)]]A `Sink` that will invoke the given procedure for each received element.

A `Sink` that will invoke the given procedure for each received element. The sink is materialized
into a [scala.concurrent.Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html) which will be completed with `Success` when reaching the
normal end of the stream, or completed with `Failure` if there is a failure signaled in
the stream.
20. [**](../../../akka/stream/scaladsl/Sink$.html#foreachAsync[T](parallelism:Int)(f:T=>scala.concurrent.Future[Unit]):akka.stream.scaladsl.Sink[T,scala.concurrent.Future[akka.Done]] "Permalink")  def foreachAsync\[T](parallelism: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int))(f: (T) \=\> [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)]): [Sink](Sink.html)\[T, [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Done](../../Done.html)]]A `Sink` that will invoke the given procedure asynchronously for each received element.

A `Sink` that will invoke the given procedure asynchronously for each received element. The sink is materialized
into a [scala.concurrent.Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html) which will be completed with `Success` when reaching the
normal end of the stream, or completed with `Failure` if there is a failure signaled in
the stream.
21. [**](../../../akka/stream/scaladsl/Sink$.html#fromGraph[T,M](g:akka.stream.Graph[akka.stream.SinkShape[T],M]):akka.stream.scaladsl.Sink[T,M] "Permalink")  def fromGraph\[T, M](g: [Graph](../Graph.html)\[[SinkShape](../SinkShape.html)\[T], M]): [Sink](Sink.html)\[T, M]A graph with the shape of a sink logically is a sink, this method makes
it so also in type.
22. [**](../../../akka/stream/scaladsl/Sink$.html#fromMaterializer[T,M](factory:(akka.stream.Materializer,akka.stream.Attributes)=>akka.stream.scaladsl.Sink[T,M]):akka.stream.scaladsl.Sink[T,scala.concurrent.Future[M]] "Permalink")  def fromMaterializer\[T, M](factory: ([Materializer](../Materializer.html), [Attributes](../Attributes.html)) \=\> [Sink](Sink.html)\[T, M]): [Sink](Sink.html)\[T, [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[M]]Defers the creation of a [Sink](Sink.html) until materialization.

Defers the creation of a [Sink](Sink.html) until materialization. The `factory` function
exposes [Materializer](../Materializer.html) which is going to be used during materialization and
[Attributes](../Attributes.html) of the [Sink](Sink.html) returned by this method.
23. [**](../../../akka/stream/scaladsl/Sink$.html#fromSubscriber[T](subscriber:org.reactivestreams.Subscriber[T]):akka.stream.scaladsl.Sink[T,akka.NotUsed] "Permalink")  def fromSubscriber\[T](subscriber: Subscriber\[T]): [Sink](Sink.html)\[T, [NotUsed](../../NotUsed.html)]Helper to create [Sink](Sink.html) from `Subscriber`.
24. [**](../../../akka/stream/scaladsl/Sink$.html#futureSink[T,M](future:scala.concurrent.Future[akka.stream.scaladsl.Sink[T,M]]):akka.stream.scaladsl.Sink[T,scala.concurrent.Future[M]] "Permalink")  def futureSink\[T, M](future: [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Sink](Sink.html)\[T, M]]): [Sink](Sink.html)\[T, [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[M]]Turn a `Future[Sink]` into a Sink that will consume the values of the source when the future completes successfully.

Turn a `Future[Sink]` into a Sink that will consume the values of the source when the future completes successfully.
If the `Future` is completed with a failure the stream is failed.

The materialized future value is completed with the materialized value of the future sink or failed with a
[NeverMaterializedException](../NeverMaterializedException.html) if upstream fails or downstream cancels before the future has completed.
25. [**](../../../akka/stream/scaladsl/Sink$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
26. [**](../../../akka/stream/scaladsl/Sink$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
27. [**](../../../akka/stream/scaladsl/Sink$.html#head[T]:akka.stream.scaladsl.Sink[T,scala.concurrent.Future[T]] "Permalink")  def head\[T]: [Sink](Sink.html)\[T, [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[T]]A `Sink` that materializes into a `Future` of the first value received.

A `Sink` that materializes into a `Future` of the first value received.
If the stream completes before signaling at least a single element, the Future will be failed with a NoSuchElementException.
If the stream signals an error errors before signaling at least a single element, the Future will be failed with the streams exception.

See also [headOption](#headOption[T]:akka.stream.scaladsl.Sink[T,scala.concurrent.Future[Option[T]]]).
28. [**](../../../akka/stream/scaladsl/Sink$.html#headOption[T]:akka.stream.scaladsl.Sink[T,scala.concurrent.Future[Option[T]]] "Permalink")  def headOption\[T]: [Sink](Sink.html)\[T, [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[T]]]A `Sink` that materializes into a `Future` of the optional first value received.

A `Sink` that materializes into a `Future` of the optional first value received.
If the stream completes before signaling at least a single element, the value of the Future will be None.
If the stream signals an error errors before signaling at least a single element, the Future will be failed with the streams exception.

See also [head](#head[T]:akka.stream.scaladsl.Sink[T,scala.concurrent.Future[T]]).
29. [**](../../../akka/stream/scaladsl/Sink$.html#ignore:akka.stream.scaladsl.Sink[Any,scala.concurrent.Future[akka.Done]] "Permalink")  def ignore: [Sink](Sink.html)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Done](../../Done.html)]]A `Sink` that will consume the stream and discard the elements.
30. [**](../../../akka/stream/scaladsl/Sink$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
31. [**](../../../akka/stream/scaladsl/Sink$.html#last[T]:akka.stream.scaladsl.Sink[T,scala.concurrent.Future[T]] "Permalink")  def last\[T]: [Sink](Sink.html)\[T, [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[T]]A `Sink` that materializes into a `Future` of the last value received.

A `Sink` that materializes into a `Future` of the last value received.
If the stream completes before signaling at least a single element, the Future will be failed with a NoSuchElementException.
If the stream signals an error, the Future will be failed with the stream's exception.

See also [lastOption](#lastOption[T]:akka.stream.scaladsl.Sink[T,scala.concurrent.Future[Option[T]]]), [takeLast](#takeLast[T](n:Int):akka.stream.scaladsl.Sink[T,scala.concurrent.Future[Seq[T]]]).
32. [**](../../../akka/stream/scaladsl/Sink$.html#lastOption[T]:akka.stream.scaladsl.Sink[T,scala.concurrent.Future[Option[T]]] "Permalink")  def lastOption\[T]: [Sink](Sink.html)\[T, [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[T]]]A `Sink` that materializes into a `Future` of the optional last value received.

A `Sink` that materializes into a `Future` of the optional last value received.
If the stream completes before signaling at least a single element, the value of the Future will be None.
If the stream signals an error, the Future will be failed with the stream's exception.

See also [last](#last[T]:akka.stream.scaladsl.Sink[T,scala.concurrent.Future[T]]), [takeLast](#takeLast[T](n:Int):akka.stream.scaladsl.Sink[T,scala.concurrent.Future[Seq[T]]]).
33. [**](../../../akka/stream/scaladsl/Sink$.html#lazyFutureSink[T,M](create:()=>scala.concurrent.Future[akka.stream.scaladsl.Sink[T,M]]):akka.stream.scaladsl.Sink[T,scala.concurrent.Future[M]] "Permalink")  def lazyFutureSink\[T, M](create: () \=\> [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Sink](Sink.html)\[T, M]]): [Sink](Sink.html)\[T, [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[M]]Defers invoking the `create` function to create a future sink until there is a first element passed from upstream.

Defers invoking the `create` function to create a future sink until there is a first element passed from upstream.

The materialized future value is completed with the materialized value of the created sink when that has successfully
been materialized.

If the `create` function throws or returns a future that is failed, or the stream fails to materialize, in this
case the materialized future value is failed with a [akka.stream.NeverMaterializedException](../NeverMaterializedException.html).
34. [**](../../../akka/stream/scaladsl/Sink$.html#lazySink[T,M](create:()=>akka.stream.scaladsl.Sink[T,M]):akka.stream.scaladsl.Sink[T,scala.concurrent.Future[M]] "Permalink")  def lazySink\[T, M](create: () \=\> [Sink](Sink.html)\[T, M]): [Sink](Sink.html)\[T, [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[M]]Defers invoking the `create` function to create a sink until there is a first element passed from upstream.

Defers invoking the `create` function to create a sink until there is a first element passed from upstream.

The materialized future value is completed with the materialized value of the created sink when that has successfully
been materialized.

If the `create` function throws or returns or the stream fails to materialize, in this
case the materialized future value is failed with a [akka.stream.NeverMaterializedException](../NeverMaterializedException.html).
35. [**](../../../akka/stream/scaladsl/Sink$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
36. [**](../../../akka/stream/scaladsl/Sink$.html#never:akka.stream.scaladsl.Sink[Any,scala.concurrent.Future[akka.Done]] "Permalink")  def never: [Sink](Sink.html)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Done](../../Done.html)]]A [Sink](Sink.html) that will always backpressure never cancel and never consume any elements from the stream.
37. [**](../../../akka/stream/scaladsl/Sink$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
38. [**](../../../akka/stream/scaladsl/Sink$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
39. [**](../../../akka/stream/scaladsl/Sink$.html#onComplete[T](callback:scala.util.Try[akka.Done]=>Unit):akka.stream.scaladsl.Sink[T,akka.NotUsed] "Permalink")  def onComplete\[T](callback: ([Try](https://www.scala-lang.org/api/2.13.17/scala/util/Try.html#scala.util.Try)\[[Done](../../Done.html)]) \=\> [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)): [Sink](Sink.html)\[T, [NotUsed](../../NotUsed.html)]A `Sink` that when the flow is completed, either through a failure or normal
completion, apply the provided function with [scala.util.Success](https://www.scala-lang.org/api/2.13.17/scala/util/Success.html)
or [scala.util.Failure](https://www.scala-lang.org/api/2.13.17/scala/util/Failure.html).
40. [**](../../../akka/stream/scaladsl/Sink$.html#queue[T]():akka.stream.scaladsl.Sink[T,akka.stream.scaladsl.SinkQueueWithCancel[T]] "Permalink")  def queue\[T](): [Sink](Sink.html)\[T, [SinkQueueWithCancel](SinkQueueWithCancel.html)\[T]]Creates a `Sink` that is materialized as an [akka.stream.scaladsl.SinkQueueWithCancel](SinkQueueWithCancel.html).

Creates a `Sink` that is materialized as an [akka.stream.scaladsl.SinkQueueWithCancel](SinkQueueWithCancel.html).
[akka.stream.scaladsl.SinkQueueWithCancel.pull](SinkQueueWithCancel.html#pull():scala.concurrent.Future[Option[T]]) method is pulling element from the stream and returns `Future[Option[T]]`.
`Future` completes when element is available.

Before calling pull method second time you need to wait until previous Future completes.
Pull returns Failed future with *IllegalStateException* if previous future has not yet completed.

`Sink` will request at most number of elements equal to size of `inputBuffer` from
upstream and then stop back pressure. You can configure size of input
buffer by using [Sink.withAttributes](Sink.html#withAttributes(attr:akka.stream.Attributes):akka.stream.scaladsl.Sink[In,Mat]) method.

For stream completion you need to pull all elements from [akka.stream.scaladsl.SinkQueueWithCancel](SinkQueueWithCancel.html) including last None
as completion marker

See also [akka.stream.scaladsl.SinkQueueWithCancel](SinkQueueWithCancel.html)
41. [**](../../../akka/stream/scaladsl/Sink$.html#queue[T](maxConcurrentPulls:Int):akka.stream.scaladsl.Sink[T,akka.stream.scaladsl.SinkQueueWithCancel[T]] "Permalink")  def queue\[T](maxConcurrentPulls: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Sink](Sink.html)\[T, [SinkQueueWithCancel](SinkQueueWithCancel.html)\[T]]Creates a `Sink` that is materialized as an [akka.stream.scaladsl.SinkQueueWithCancel](SinkQueueWithCancel.html).

Creates a `Sink` that is materialized as an [akka.stream.scaladsl.SinkQueueWithCancel](SinkQueueWithCancel.html).
[akka.stream.scaladsl.SinkQueueWithCancel.pull](SinkQueueWithCancel.html#pull():scala.concurrent.Future[Option[T]]) method is pulling element from the stream and returns `Future[Option[T]`.
`Future` completes when element is available.

Before calling pull method second time you need to ensure that number of pending pulls is less then `maxConcurrentPulls`
or wait until some of the previous Futures completes.
Pull returns Failed future with *IllegalStateException* if there will be more then `maxConcurrentPulls` number of pending pulls.

`Sink` will request at most number of elements equal to size of `inputBuffer` from
upstream and then stop back pressure. You can configure size of input
buffer by using [Sink.withAttributes](Sink.html#withAttributes(attr:akka.stream.Attributes):akka.stream.scaladsl.Sink[In,Mat]) method.

For stream completion you need to pull all elements from [akka.stream.scaladsl.SinkQueueWithCancel](SinkQueueWithCancel.html) including last None
as completion marker

See also [akka.stream.scaladsl.SinkQueueWithCancel](SinkQueueWithCancel.html)
42. [**](../../../akka/stream/scaladsl/Sink$.html#reduce[T](f:(T,T)=>T):akka.stream.scaladsl.Sink[T,scala.concurrent.Future[T]] "Permalink")  def reduce\[T](f: (T, T) \=\> T): [Sink](Sink.html)\[T, [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[T]]A `Sink` that will invoke the given function for every received element, giving it its previous
output (from the second element) and the element as input.

A `Sink` that will invoke the given function for every received element, giving it its previous
output (from the second element) and the element as input.
The returned [scala.concurrent.Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html) will be completed with value of the final
function evaluation when the input stream ends, or completed with `Failure`
if there is a failure signaled in the stream.

If the stream is empty (i.e. completes before signalling any elements),
the reduce operator will fail its downstream with a NoSuchElementException,
which is semantically in\-line with that Scala's standard library collections
do in such situations.

Adheres to the [ActorAttributes.SupervisionStrategy](../ActorAttributes$$SupervisionStrategy.html) attribute.
43. [**](../../../akka/stream/scaladsl/Sink$.html#seq[T]:akka.stream.scaladsl.Sink[T,scala.concurrent.Future[Seq[T]]] "Permalink")  def seq\[T]: [Sink](Sink.html)\[T, [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[T]]]A `Sink` that keeps on collecting incoming elements until upstream terminates.

A `Sink` that keeps on collecting incoming elements until upstream terminates.
As upstream may be unbounded, `Flow[T].take` or the stricter `Flow[T].limit` (and their variants)
may be used to ensure boundedness.
Materializes into a `Future` of `Seq[T]` containing all the collected elements.
`Seq` is limited to `Int.MaxValue` elements, this Sink will cancel the stream
after having received that many elements.

See also [Flow.limit](Flow.html#limit(max:Long):FlowOps.this.Repr[Out]), [Flow.limitWeighted](Flow.html#limitWeighted[T](max:Long)(costFn:Out=>Long):FlowOps.this.Repr[Out]), [Flow.take](Flow.html#take(n:Long):FlowOps.this.Repr[Out]), [Flow.takeWithin](Flow.html#takeWithin(d:scala.concurrent.duration.FiniteDuration):FlowOps.this.Repr[Out]), [Flow.takeWhile](Flow.html#takeWhile(p:Out=>Boolean,inclusive:Boolean):FlowOps.this.Repr[Out])
44. [**](../../../akka/stream/scaladsl/Sink$.html#shape[T](name:String):akka.stream.SinkShape[T] "Permalink")  def shape\[T](name: String): [SinkShape](../SinkShape.html)\[T]INTERNAL API
45. [**](../../../akka/stream/scaladsl/Sink$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
46. [**](../../../akka/stream/scaladsl/Sink$.html#takeLast[T](n:Int):akka.stream.scaladsl.Sink[T,scala.concurrent.Future[Seq[T]]] "Permalink")  def takeLast\[T](n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Sink](Sink.html)\[T, [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[T]]]A `Sink` that materializes into a a `Future` of `immutable.Seq[T]` containing the last `n` collected elements.

A `Sink` that materializes into a a `Future` of `immutable.Seq[T]` containing the last `n` collected elements.

If the stream completes before signaling at least n elements, the `Future` will complete with all elements seen so far.
If the stream never completes, the `Future` will never complete.
If there is a failure signaled in the stream the `Future` will be completed with failure.
47. [**](../../../akka/stream/scaladsl/Sink$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
48. [**](../../../akka/stream/scaladsl/Sink$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
49. [**](../../../akka/stream/scaladsl/Sink$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
50. [**](../../../akka/stream/scaladsl/Sink$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/stream/scaladsl/Sink$.html#actorRef[T](ref:akka.actor.ActorRef,onCompleteMessage:Any):akka.stream.scaladsl.Sink[T,akka.NotUsed] "Permalink")  def actorRef\[T](ref: [ActorRef](../../actor/ActorRef.html), onCompleteMessage: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Sink](Sink.html)\[T, [NotUsed](../../NotUsed.html)]Sends the elements of the stream to the given `ActorRef`.

Sends the elements of the stream to the given `ActorRef`.
If the target actor terminates the stream will be canceled.
When the stream is completed successfully the given `onCompleteMessage`
will be sent to the destination actor.
When the stream is completed with failure a [akka.actor.Status.Failure](../../actor/Status$$Failure.html)
message will be sent to the destination actor.

It will request at most `maxInputBufferSize` number of elements from
upstream, but there is no back\-pressure signal from the destination actor,
i.e. if the actor is not consuming the messages fast enough the mailbox
of the actor will grow. For potentially slow consumer actors it is recommended
to use a bounded mailbox with zero `mailbox-push-timeout-time` or use a rate
limiting operator in front of this `Sink`.

Annotations@deprecated Deprecated*(Since version 2\.6\.0\)* Use variant accepting both on complete and on failure message
2. [**](../../../akka/stream/scaladsl/Sink$.html#actorRefWithAck[T](ref:akka.actor.ActorRef,onInitMessage:Any,ackMessage:Any,onCompleteMessage:Any,onFailureMessage:Throwable=>Any):akka.stream.scaladsl.Sink[T,akka.NotUsed] "Permalink")  def actorRefWithAck\[T](ref: [ActorRef](../../actor/ActorRef.html), onInitMessage: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), ackMessage: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), onCompleteMessage: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), onFailureMessage: (Throwable) \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any) \= [Status.Failure.apply](../../index.html)): [Sink](Sink.html)\[T, [NotUsed](../../NotUsed.html)]Sends the elements of the stream to the given `ActorRef` that sends back back\-pressure signal.

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

Annotations@deprecated Deprecated*(Since version 2\.6\.0\)* Use actorRefWithBackpressure accepting completion and failure matchers instead
3. [**](../../../akka/stream/scaladsl/Sink$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
4. [**](../../../akka/stream/scaladsl/Sink$.html#lazyInit[T,M](sinkFactory:T=>scala.concurrent.Future[akka.stream.scaladsl.Sink[T,M]],fallback:()=>M):akka.stream.scaladsl.Sink[T,scala.concurrent.Future[M]] "Permalink")  def lazyInit\[T, M](sinkFactory: (T) \=\> [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Sink](Sink.html)\[T, M]], fallback: () \=\> M): [Sink](Sink.html)\[T, [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[M]]Creates a real `Sink` upon receiving the first element.

Creates a real `Sink` upon receiving the first element. Internal `Sink` will not be created if there are no elements,
because of completion or error.

If upstream completes before an element was received then the `Future` is completed with the value created by fallback.
If upstream fails before an element was received, `sinkFactory` throws an exception, or materialization of the internal
sink fails then the `Future` is completed with the exception.
Otherwise the `Future` is completed with the materialized value of the internal sink.

Annotations@deprecated Deprecated*(Since version 2\.6\.0\)* Use 'Sink.lazyFutureSink' in combination with 'Flow.prefixAndTail(1\)' instead
5. [**](../../../akka/stream/scaladsl/Sink$.html#lazyInitAsync[T,M](sinkFactory:()=>scala.concurrent.Future[akka.stream.scaladsl.Sink[T,M]]):akka.stream.scaladsl.Sink[T,scala.concurrent.Future[Option[M]]] "Permalink")  def lazyInitAsync\[T, M](sinkFactory: () \=\> [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Sink](Sink.html)\[T, M]]): [Sink](Sink.html)\[T, [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[M]]]Creates a real `Sink` upon receiving the first element.

Creates a real `Sink` upon receiving the first element. Internal `Sink` will not be created if there are no elements,
because of completion or error.

If upstream completes before an element was received then the `Future` is completed with `None`.
If upstream fails before an element was received, `sinkFactory` throws an exception, or materialization of the internal
sink fails then the `Future` is completed with the exception.
Otherwise the `Future` is completed with the materialized value of the internal sink.

Annotations@deprecated Deprecated*(Since version 2\.6\.0\)* Use 'Sink.lazyFutureSink' instead
6. [**](../../../akka/stream/scaladsl/Sink$.html#setup[T,M](factory:(akka.stream.ActorMaterializer,akka.stream.Attributes)=>akka.stream.scaladsl.Sink[T,M]):akka.stream.scaladsl.Sink[T,scala.concurrent.Future[M]] "Permalink")  def setup\[T, M](factory: ([ActorMaterializer](../ActorMaterializer.html), [Attributes](../Attributes.html)) \=\> [Sink](Sink.html)\[T, M]): [Sink](Sink.html)\[T, [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[M]]Defers the creation of a [Sink](Sink.html) until materialization.

Defers the creation of a [Sink](Sink.html) until materialization. The `factory` function
exposes [ActorMaterializer](../ActorMaterializer.html) which is going to be used during materialization and
[Attributes](../Attributes.html) of the [Sink](Sink.html) returned by this method.

Annotations@deprecated Deprecated*(Since version 2\.6\.0\)* Use 'fromMaterializer' instead
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/Done.html
- https://doc.akka.io/api/akka/current/akka/NotUsed.html
- https://doc.akka.io/api/akka/current/akka/actor/Actor.html
- https://doc.akka.io/api/akka/current/akka/actor/ActorRef.html
- https://doc.akka.io/api/akka/current/akka/actor/Status$$Failure.html
- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/akka/stream/ActorAttributes$$SupervisionStrategy.html
- https://doc.akka.io/api/akka/current/akka/stream/ActorMaterializer.html
- https://doc.akka.io/api/akka/current/akka/stream/Attributes.html
- https://doc.akka.io/api/akka/current/akka/stream/Graph.html
- https://doc.akka.io/api/akka/current/akka/stream/Materializer.html
- https://doc.akka.io/api/akka/current/akka/stream/NeverMaterializedException.html
- https://doc.akka.io/api/akka/current/akka/stream/SinkShape.html
- https://doc.akka.io/api/akka/current/akka/stream/UniformFanOutShape.html
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
- https://doc.akka.io/api/akka/current/akka/stream/scaladsl/Interleave$.html
- https://doc.akka.io/api/akka/current/akka/stream/scaladsl/Interleave.html
- https://doc.akka.io/api/akka/current/akka/stream/scaladsl/JavaFlowSupport$.html
- https://doc.akka.io/api/akka/current/akka/stream/scaladsl/JsonFraming$.html
- https://doc.akka.io/api/akka/current/akka/stream/scaladsl/Keep$.html
- https://doc.akka.io/api/akka/current/akka/stream/scaladsl/Merge$.html
- https://doc.akka.io/api/akka/current/akka/stream/scaladsl/Merge.html
- https://doc.akka.io/api/akka/current/akka/stream/scaladsl/MergeHub$.html
- https://doc.akka.io/api/akka/current/akka/stream/scaladsl/MergeLatest$.html
- https://doc.akka.io/api/akka/current/akka/stream/scaladsl/MergeLatest.html
- https://doc.akka.io/api/akka/current/akka/stream/scaladsl/MergePreferred$.html
- https://doc.akka.io/api/akka/current/akka/stream/scaladsl/MergePreferred.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/stream/scaladsl/Sink$.html](https://doc.akka.io/api/akka/current/akka/stream/scaladsl/Sink$.html)*