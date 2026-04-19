---
description: Akka 2.10.17 - akka.stream.javadsl.Sink
knowledge_type: official_documentation
scraped_at: '2026-04-05T22:31:51Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/stream/javadsl/Sink$.html
title: Akka 2.10.17 - akka.stream.javadsl.Sink
---

# Akka 2.10.17 - akka.stream.javadsl.Sink

> **Summary:** Akka 2.10.17 - akka.stream.javadsl.Sink

## Content

Akka2\.10\.17 \< Back****# Packages

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
- [Flow](Flow.html "A Flow is a set of stream processing steps that has one open input and one open output.")
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
[o](Sink.html "See companion class")[akka](../../index.html).[stream](../index.html).[javadsl](index.html)

# [Sink](Sink.html "See companion class")[**](../../../akka/stream/javadsl/Sink$.html "Permalink")

### Companion [class Sink](Sink.html "See companion class")

#### object Sink

Java API

Source[Sink.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-stream/src/main/scala/akka/stream/javadsl/Sink.scala#L38)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
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

1. [**](../../../akka/stream/javadsl/Sink$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/stream/javadsl/Sink$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/stream/javadsl/Sink$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../akka/stream/javadsl/Sink$.html#actorRef[In](ref:akka.actor.ActorRef,onCompleteMessage:Any):akka.stream.javadsl.Sink[In,akka.NotUsed] "Permalink")  def actorRef\[In](ref: [ActorRef](../../actor/ActorRef.html), onCompleteMessage: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Sink](Sink.html)\[In, [NotUsed](../../NotUsed.html)]Sends the elements of the stream to the given `ActorRef`.

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
5. [**](../../../akka/stream/javadsl/Sink$.html#actorRefWithBackpressure[In](ref:akka.actor.ActorRef,onInitMessage:Any,onCompleteMessage:Any,onFailureMessage:akka.japi.function.Function[Throwable,Any]):akka.stream.javadsl.Sink[In,akka.NotUsed] "Permalink")  def actorRefWithBackpressure\[In](ref: [ActorRef](../../actor/ActorRef.html), onInitMessage: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), onCompleteMessage: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), onFailureMessage: [Function](../../japi/function/Function.html)\[Throwable, [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)]): [Sink](Sink.html)\[In, [NotUsed](../../NotUsed.html)]Sends the elements of the stream to the given `ActorRef` that sends back back\-pressure signal.

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
6. [**](../../../akka/stream/javadsl/Sink$.html#actorRefWithBackpressure[In](ref:akka.actor.ActorRef,onInitMessage:Any,ackMessage:Any,onCompleteMessage:Any,onFailureMessage:akka.japi.function.Function[Throwable,Any]):akka.stream.javadsl.Sink[In,akka.NotUsed] "Permalink")  def actorRefWithBackpressure\[In](ref: [ActorRef](../../actor/ActorRef.html), onInitMessage: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), ackMessage: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), onCompleteMessage: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), onFailureMessage: [Function](../../japi/function/Function.html)\[Throwable, [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)]): [Sink](Sink.html)\[In, [NotUsed](../../NotUsed.html)]Sends the elements of the stream to the given `ActorRef` that sends back back\-pressure signal.

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
7. [**](../../../akka/stream/javadsl/Sink$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
8. [**](../../../akka/stream/javadsl/Sink$.html#asPublisher[T](fanout:akka.stream.javadsl.AsPublisher):akka.stream.javadsl.Sink[T,org.reactivestreams.Publisher[T]] "Permalink")  def asPublisher\[T](fanout: [AsPublisher](AsPublisher.html)): [Sink](Sink.html)\[T, Publisher\[T]]A `Sink` that materializes into a org.reactivestreams.Publisher.

A `Sink` that materializes into a org.reactivestreams.Publisher.

If `fanout` is `true`, the materialized `Publisher` will support multiple `Subscriber`s and
the size of the `inputBuffer` configured for this operator becomes the maximum number of elements that
the fastest org.reactivestreams.Subscriber can be ahead of the slowest one before slowing
the processing down due to back pressure.

If `fanout` is `false` then the materialized `Publisher` will only support a single `Subscriber` and
reject any additional `Subscriber`s.
9. [**](../../../akka/stream/javadsl/Sink$.html#cancelled[T]():akka.stream.javadsl.Sink[T,akka.NotUsed] "Permalink")  def cancelled\[T](): [Sink](Sink.html)\[T, [NotUsed](../../NotUsed.html)]A `Sink` that immediately cancels its upstream after materialization.
10. [**](../../../akka/stream/javadsl/Sink$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
11. [**](../../../akka/stream/javadsl/Sink$.html#collect[U,In](collector:java.util.stream.Collector[In,_,U]):akka.stream.javadsl.Sink[In,java.util.concurrent.CompletionStage[U]] "Permalink")  def collect\[U, In](collector: [Collector](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/stream/Collector.html#java.util.stream.Collector)\[In, \_, U]): [Sink](Sink.html)\[In, [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[U]]Creates a sink which materializes into a `CompletionStage` which will be completed with a result of the Java `Collector`
transformation and reduction operations.

Creates a sink which materializes into a `CompletionStage` which will be completed with a result of the Java `Collector`
transformation and reduction operations. This allows usage of Java streams transformations for reactive streams.
The `Collector` will trigger demand downstream. Elements emitted through the stream will be accumulated into a mutable
result container, optionally transformed into a final representation after all input elements have been processed.
The `Collector` can also do reduction at the end. Reduction processing is performed sequentially.
12. [**](../../../akka/stream/javadsl/Sink$.html#combine[T,U,M](sinks:java.util.List[_<:akka.stream.Graph[akka.stream.SinkShape[U],M]],fanOutStrategy:akka.japi.function.Function[Integer,akka.stream.Graph[akka.stream.UniformFanOutShape[T,U],akka.NotUsed]]):akka.stream.javadsl.Sink[T,java.util.List[M]] "Permalink")  def combine\[T, U, M](sinks: [List](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/List.html#java.util.List)\[\_ \<: [Graph](../Graph.html)\[[SinkShape](../SinkShape.html)\[U], M]], fanOutStrategy: [Function](../../japi/function/Function.html)\[[Integer](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Integer.html#java.lang.Integer), [Graph](../Graph.html)\[[UniformFanOutShape](../UniformFanOutShape.html)\[T, U], [NotUsed](../../NotUsed.html)]]): [Sink](Sink.html)\[T, [List](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/List.html#java.util.List)\[M]]Combine several sinks with fan\-out strategy like `Broadcast` or `Balance` and returns `Sink`.

Combine several sinks with fan\-out strategy like `Broadcast` or `Balance` and returns `Sink`.
The fanoutGraph's outlets size must match the provides sinks'.
13. [**](../../../akka/stream/javadsl/Sink$.html#combine[T,U](output1:akka.stream.javadsl.Sink[U,_],output2:akka.stream.javadsl.Sink[U,_],rest:java.util.List[akka.stream.javadsl.Sink[U,_]],fanOutStrategy:akka.japi.function.Function[Integer,akka.stream.Graph[akka.stream.UniformFanOutShape[T,U],akka.NotUsed]]):akka.stream.javadsl.Sink[T,akka.NotUsed] "Permalink")  def combine\[T, U](output1: [Sink](Sink.html)\[U, \_], output2: [Sink](Sink.html)\[U, \_], rest: [List](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/List.html#java.util.List)\[[Sink](Sink.html)\[U, \_]], fanOutStrategy: [Function](../../japi/function/Function.html)\[[Integer](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Integer.html#java.lang.Integer), [Graph](../Graph.html)\[[UniformFanOutShape](../UniformFanOutShape.html)\[T, U], [NotUsed](../../NotUsed.html)]]): [Sink](Sink.html)\[T, [NotUsed](../../NotUsed.html)]Combine several sinks with fan\-out strategy like `Broadcast` or `Balance` and returns `Sink`.
14. [**](../../../akka/stream/javadsl/Sink$.html#combineMat[T,U,M1,M2,M](first:akka.stream.javadsl.Sink[U,M1],second:akka.stream.javadsl.Sink[U,M2],fanOutStrategy:akka.japi.function.Function[Integer,akka.stream.Graph[akka.stream.UniformFanOutShape[T,U],akka.NotUsed]],matF:akka.japi.function.Function2[M1,M2,M]):akka.stream.javadsl.Sink[T,M] "Permalink")  def combineMat\[T, U, M1, M2, M](first: [Sink](Sink.html)\[U, M1], second: [Sink](Sink.html)\[U, M2], fanOutStrategy: [Function](../../japi/function/Function.html)\[[Integer](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Integer.html#java.lang.Integer), [Graph](../Graph.html)\[[UniformFanOutShape](../UniformFanOutShape.html)\[T, U], [NotUsed](../../NotUsed.html)]], matF: [Function2](../../japi/function/Function2.html)\[M1, M2, M]): [Sink](Sink.html)\[T, M]Combine two sinks with fan\-out strategy like `Broadcast` or `Balance` and returns `Sink` with 2 outlets.
15. [**](../../../akka/stream/javadsl/Sink$.html#completionStageSink[T,M](future:java.util.concurrent.CompletionStage[akka.stream.javadsl.Sink[T,M]]):akka.stream.javadsl.Sink[T,java.util.concurrent.CompletionStage[M]] "Permalink")  def completionStageSink\[T, M](future: [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[Sink](Sink.html)\[T, M]]): [Sink](Sink.html)\[T, [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[M]]Turn a `Future[Sink]` into a Sink that will consume the values of the source when the future completes successfully.

Turn a `Future[Sink]` into a Sink that will consume the values of the source when the future completes successfully.
If the `Future` is completed with a failure the stream is failed.

The materialized future value is completed with the materialized value of the future sink or failed with a
[NeverMaterializedException](../NeverMaterializedException.html) if upstream fails or downstream cancels before the future has completed.
16. [**](../../../akka/stream/javadsl/Sink$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
17. [**](../../../akka/stream/javadsl/Sink$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
18. [**](../../../akka/stream/javadsl/Sink$.html#fold[U,In](zero:U,f:akka.japi.function.Function2[U,In,U]):akka.stream.javadsl.Sink[In,java.util.concurrent.CompletionStage[U]] "Permalink")  def fold\[U, In](zero: U, f: [Function2](../../japi/function/Function2.html)\[U, In, U]): [Sink](Sink.html)\[In, [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[U]]A `Sink` that will invoke the given function for every received element, giving it its previous
output (or the given `zero` value) and the element as input.

A `Sink` that will invoke the given function for every received element, giving it its previous
output (or the given `zero` value) and the element as input.
The returned [java.util.concurrent.CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html) will be completed with value of the final
function evaluation when the input stream ends, or completed with `Failure`
if there is a failure is signaled in the stream.
19. [**](../../../akka/stream/javadsl/Sink$.html#foldAsync[U,In](zero:U,f:akka.japi.function.Function2[U,In,java.util.concurrent.CompletionStage[U]]):akka.stream.javadsl.Sink[In,java.util.concurrent.CompletionStage[U]] "Permalink")  def foldAsync\[U, In](zero: U, f: [Function2](../../japi/function/Function2.html)\[U, In, [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[U]]): [Sink](Sink.html)\[In, [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[U]]A `Sink` that will invoke the given asynchronous function for every received element, giving it its previous
output (or the given `zero` value) and the element as input.

A `Sink` that will invoke the given asynchronous function for every received element, giving it its previous
output (or the given `zero` value) and the element as input.
The returned [java.util.concurrent.CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html) will be completed with value of the final
function evaluation when the input stream ends, or completed with `Failure`
if there is a failure is signaled in the stream.
20. [**](../../../akka/stream/javadsl/Sink$.html#foreach[T](f:akka.japi.function.Procedure[T]):akka.stream.javadsl.Sink[T,java.util.concurrent.CompletionStage[akka.Done]] "Permalink")  def foreach\[T](f: [Procedure](../../japi/function/Procedure.html)\[T]): [Sink](Sink.html)\[T, [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[Done](../../Done.html)]]A `Sink` that will invoke the given procedure for each received element.

A `Sink` that will invoke the given procedure for each received element. The sink is materialized
into a [java.util.concurrent.CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html) which will be completed with `Success` when reaching the
normal end of the stream, or completed with `Failure` if there is a failure signaled in
the stream.
21. [**](../../../akka/stream/javadsl/Sink$.html#foreachAsync[T](parallelism:Int)(f:akka.japi.function.Function[T,java.util.concurrent.CompletionStage[Void]]):akka.stream.javadsl.Sink[T,java.util.concurrent.CompletionStage[akka.Done]] "Permalink")  def foreachAsync\[T](parallelism: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int))(f: [Function](../../japi/function/Function.html)\[T, [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[Void](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Void.html#java.lang.Void)]]): [Sink](Sink.html)\[T, [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[Done](../../Done.html)]]A `Sink` that will invoke the given procedure asynchronously for each received element.

A `Sink` that will invoke the given procedure asynchronously for each received element. The sink is materialized
into a [java.util.concurrent.CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html) which will be completed with `Success` when reaching the
normal end of the stream, or completed with `Failure` if there is a failure signaled in
the stream.
22. [**](../../../akka/stream/javadsl/Sink$.html#fromGraph[T,M](g:akka.stream.Graph[akka.stream.SinkShape[T],M]):akka.stream.javadsl.Sink[T,M] "Permalink")  def fromGraph\[T, M](g: [Graph](../Graph.html)\[[SinkShape](../SinkShape.html)\[T], M]): [Sink](Sink.html)\[T, M]A graph with the shape of a sink logically is a sink, this method makes
it so also in type.
23. [**](../../../akka/stream/javadsl/Sink$.html#fromMaterializer[T,M](factory:java.util.function.BiFunction[akka.stream.Materializer,akka.stream.Attributes,akka.stream.javadsl.Sink[T,M]]):akka.stream.javadsl.Sink[T,java.util.concurrent.CompletionStage[M]] "Permalink")  def fromMaterializer\[T, M](factory: [BiFunction](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/BiFunction.html#java.util.function.BiFunction)\[[Materializer](../Materializer.html), [Attributes](../Attributes.html), [Sink](Sink.html)\[T, M]]): [Sink](Sink.html)\[T, [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[M]]Defers the creation of a [Sink](Sink.html) until materialization.

Defers the creation of a [Sink](Sink.html) until materialization. The `factory` function
exposes [Materializer](../Materializer.html) which is going to be used during materialization and
[Attributes](../Attributes.html) of the [Sink](Sink.html) returned by this method.
24. [**](../../../akka/stream/javadsl/Sink$.html#fromSubscriber[In](subs:org.reactivestreams.Subscriber[In]):akka.stream.javadsl.Sink[In,akka.NotUsed] "Permalink")  def fromSubscriber\[In](subs: Subscriber\[In]): [Sink](Sink.html)\[In, [NotUsed](../../NotUsed.html)]Helper to create [Sink](Sink.html) from `Subscriber`.
25. [**](../../../akka/stream/javadsl/Sink$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
26. [**](../../../akka/stream/javadsl/Sink$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
27. [**](../../../akka/stream/javadsl/Sink$.html#head[In]():akka.stream.javadsl.Sink[In,java.util.concurrent.CompletionStage[In]] "Permalink")  def head\[In](): [Sink](Sink.html)\[In, [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[In]]A `Sink` that materializes into a `CompletionStage` of the first value received.

A `Sink` that materializes into a `CompletionStage` of the first value received.
If the stream completes before signaling at least a single element, the CompletionStage will be failed with a NoSuchElementException.
If the stream signals an error before signaling at least a single element, the CompletionStage will be failed with the streams exception.

See also [headOption](#headOption[In]():akka.stream.javadsl.Sink[In,java.util.concurrent.CompletionStage[java.util.Optional[In]]]).
28. [**](../../../akka/stream/javadsl/Sink$.html#headOption[In]():akka.stream.javadsl.Sink[In,java.util.concurrent.CompletionStage[java.util.Optional[In]]] "Permalink")  def headOption\[In](): [Sink](Sink.html)\[In, [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[In]]]A `Sink` that materializes into a `CompletionStage` of the optional first value received.

A `Sink` that materializes into a `CompletionStage` of the optional first value received.
If the stream completes before signaling at least a single element, the value of the CompletionStage will be an empty [java.util.Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html).
If the stream signals an error errors before signaling at least a single element, the CompletionStage will be failed with the streams exception.

See also [head](#head[In]():akka.stream.javadsl.Sink[In,java.util.concurrent.CompletionStage[In]]).
29. [**](../../../akka/stream/javadsl/Sink$.html#ignore[T]():akka.stream.javadsl.Sink[T,java.util.concurrent.CompletionStage[akka.Done]] "Permalink")  def ignore\[T](): [Sink](Sink.html)\[T, [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[Done](../../Done.html)]]A `Sink` that will consume the stream and discard the elements.
30. [**](../../../akka/stream/javadsl/Sink$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
31. [**](../../../akka/stream/javadsl/Sink$.html#last[In]():akka.stream.javadsl.Sink[In,java.util.concurrent.CompletionStage[In]] "Permalink")  def last\[In](): [Sink](Sink.html)\[In, [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[In]]A `Sink` that materializes into a `CompletionStage` of the last value received.

A `Sink` that materializes into a `CompletionStage` of the last value received.
If the stream completes before signaling at least a single element, the CompletionStage will be failed with a NoSuchElementException.
If the stream signals an error errors before signaling at least a single element, the CompletionStage will be failed with the streams exception.

See also [lastOption](#lastOption[In]():akka.stream.javadsl.Sink[In,java.util.concurrent.CompletionStage[java.util.Optional[In]]]), [takeLast](#takeLast[In](n:Int):akka.stream.javadsl.Sink[In,java.util.concurrent.CompletionStage[java.util.List[In]]]).
32. [**](../../../akka/stream/javadsl/Sink$.html#lastOption[In]():akka.stream.javadsl.Sink[In,java.util.concurrent.CompletionStage[java.util.Optional[In]]] "Permalink")  def lastOption\[In](): [Sink](Sink.html)\[In, [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[In]]]A `Sink` that materializes into a `CompletionStage` of the optional last value received.

A `Sink` that materializes into a `CompletionStage` of the optional last value received.
If the stream completes before signaling at least a single element, the value of the CompletionStage will be an empty [java.util.Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html).
If the stream signals an error errors before signaling at least a single element, the CompletionStage will be failed with the streams exception.

See also [head](#head[In]():akka.stream.javadsl.Sink[In,java.util.concurrent.CompletionStage[In]]), [takeLast](#takeLast[In](n:Int):akka.stream.javadsl.Sink[In,java.util.concurrent.CompletionStage[java.util.List[In]]]).
33. [**](../../../akka/stream/javadsl/Sink$.html#lazyCompletionStageSink[T,M](create:akka.japi.function.Creator[java.util.concurrent.CompletionStage[akka.stream.javadsl.Sink[T,M]]]):akka.stream.javadsl.Sink[T,java.util.concurrent.CompletionStage[M]] "Permalink")  def lazyCompletionStageSink\[T, M](create: [Creator](../../japi/function/Creator.html)\[[CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[Sink](Sink.html)\[T, M]]]): [Sink](Sink.html)\[T, [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[M]]Defers invoking the `create` function to create a future sink until there is a first element passed from upstream.

Defers invoking the `create` function to create a future sink until there is a first element passed from upstream.

The materialized future value is completed with the materialized value of the created sink when that has successfully
been materialized.

If the `create` function throws or returns a future that is failed, or the stream fails to materialize, in this
case the materialized future value is failed with a [akka.stream.NeverMaterializedException](../NeverMaterializedException.html).
34. [**](../../../akka/stream/javadsl/Sink$.html#lazySink[T,M](create:akka.japi.function.Creator[akka.stream.javadsl.Sink[T,M]]):akka.stream.javadsl.Sink[T,java.util.concurrent.CompletionStage[M]] "Permalink")  def lazySink\[T, M](create: [Creator](../../japi/function/Creator.html)\[[Sink](Sink.html)\[T, M]]): [Sink](Sink.html)\[T, [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[M]]Defers invoking the `create` function to create a sink until there is a first element passed from upstream.

Defers invoking the `create` function to create a sink until there is a first element passed from upstream.

The materialized future value is completed with the materialized value of the created sink when that has successfully
been materialized.

If the `create` function throws or returns or the stream fails to materialize, in this
case the materialized future value is failed with a [akka.stream.NeverMaterializedException](../NeverMaterializedException.html).
35. [**](../../../akka/stream/javadsl/Sink$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
36. [**](../../../akka/stream/javadsl/Sink$.html#never[T]:akka.stream.javadsl.Sink[T,java.util.concurrent.CompletionStage[akka.Done]] "Permalink")  def never\[T]: [Sink](Sink.html)\[T, [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[Done](../../Done.html)]]A [Sink](Sink.html) that will always backpressure never cancel and never consume any elements from the stream.
37. [**](../../../akka/stream/javadsl/Sink$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
38. [**](../../../akka/stream/javadsl/Sink$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
39. [**](../../../akka/stream/javadsl/Sink$.html#onComplete[In](callback:akka.japi.function.Procedure[scala.util.Try[akka.Done]]):akka.stream.javadsl.Sink[In,akka.NotUsed] "Permalink")  def onComplete\[In](callback: [Procedure](../../japi/function/Procedure.html)\[[Try](https://www.scala-lang.org/api/2.13.17/scala/util/Try.html#scala.util.Try)\[[Done](../../Done.html)]]): [Sink](Sink.html)\[In, [NotUsed](../../NotUsed.html)]A `Sink` that when the flow is completed, either through a failure or normal
completion, apply the provided function with [scala.util.Success](https://www.scala-lang.org/api/2.13.17/scala/util/Success.html)
or [scala.util.Failure](https://www.scala-lang.org/api/2.13.17/scala/util/Failure.html).
40. [**](../../../akka/stream/javadsl/Sink$.html#queue[T]():akka.stream.javadsl.Sink[T,akka.stream.javadsl.SinkQueueWithCancel[T]] "Permalink")  def queue\[T](): [Sink](Sink.html)\[T, [SinkQueueWithCancel](SinkQueueWithCancel.html)\[T]]Creates a `Sink` that is materialized as an [akka.stream.javadsl.SinkQueueWithCancel](SinkQueueWithCancel.html).

Creates a `Sink` that is materialized as an [akka.stream.javadsl.SinkQueueWithCancel](SinkQueueWithCancel.html).
[akka.stream.javadsl.SinkQueueWithCancel.pull](SinkQueueWithCancel.html#pull():java.util.concurrent.CompletionStage[java.util.Optional[T]]) method is pulling element from the stream and returns `CompletionStage[Option[T]]`.
`CompletionStage` completes when element is available.

Before calling pull method second time you need to wait until previous CompletionStage completes.
Pull returns Failed future with *IllegalStateException* if previous future has not yet completed.

`Sink` will request at most number of elements equal to size of `inputBuffer` from
upstream and then stop back pressure. You can configure size of input
buffer by using [Sink.withAttributes](Sink.html#withAttributes(attr:akka.stream.Attributes):akka.stream.javadsl.Sink[In,Mat]) method.

For stream completion you need to pull all elements from [akka.stream.javadsl.SinkQueueWithCancel](SinkQueueWithCancel.html) including last None
as completion marker

See also[akka.stream.javadsl.SinkQueueWithCancel](SinkQueueWithCancel.html)
41. [**](../../../akka/stream/javadsl/Sink$.html#queue[T](maxConcurrentPulls:Int):akka.stream.javadsl.Sink[T,akka.stream.javadsl.SinkQueueWithCancel[T]] "Permalink")  def queue\[T](maxConcurrentPulls: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Sink](Sink.html)\[T, [SinkQueueWithCancel](SinkQueueWithCancel.html)\[T]]Creates a `Sink` that is materialized as an [akka.stream.javadsl.SinkQueueWithCancel](SinkQueueWithCancel.html).

Creates a `Sink` that is materialized as an [akka.stream.javadsl.SinkQueueWithCancel](SinkQueueWithCancel.html).
[akka.stream.javadsl.SinkQueueWithCancel.pull](SinkQueueWithCancel.html#pull():java.util.concurrent.CompletionStage[java.util.Optional[T]]) method is pulling element from the stream and returns `CompletionStage[Option[T]]`.
`CompletionStage` completes when element is available.

Before calling pull method second time you need to ensure that number of pending pulls is less then `maxConcurrentPulls`
or wait until some of the previous Futures completes.
Pull returns Failed future with *IllegalStateException* if there will be more then `maxConcurrentPulls` number of pending pulls.

`Sink` will request at most number of elements equal to size of `inputBuffer` from
upstream and then stop back pressure. You can configure size of input
buffer by using [Sink.withAttributes](Sink.html#withAttributes(attr:akka.stream.Attributes):akka.stream.javadsl.Sink[In,Mat]) method.

For stream completion you need to pull all elements from [akka.stream.javadsl.SinkQueueWithCancel](SinkQueueWithCancel.html) including last None
as completion marker

See also[akka.stream.javadsl.SinkQueueWithCancel](SinkQueueWithCancel.html)
42. [**](../../../akka/stream/javadsl/Sink$.html#reduce[In](f:akka.japi.function.Function2[In,In,In]):akka.stream.javadsl.Sink[In,java.util.concurrent.CompletionStage[In]] "Permalink")  def reduce\[In](f: [Function2](../../japi/function/Function2.html)\[In, In, In]): [Sink](Sink.html)\[In, [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[In]]A `Sink` that will invoke the given function for every received element, giving it its previous
output (from the second element) and the element as input.

A `Sink` that will invoke the given function for every received element, giving it its previous
output (from the second element) and the element as input.
The returned [java.util.concurrent.CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html) will be completed with value of the final
function evaluation when the input stream ends, or completed with `Failure`
if there is a failure signaled in the stream.

If the stream is empty (i.e. completes before signalling any elements),
the reduce operator will fail its downstream with a NoSuchElementException,
which is semantically in\-line with that Scala's standard library collections
do in such situations.
43. [**](../../../akka/stream/javadsl/Sink$.html#seq[In]:akka.stream.javadsl.Sink[In,java.util.concurrent.CompletionStage[java.util.List[In]]] "Permalink")  def seq\[In]: [Sink](Sink.html)\[In, [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[List](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/List.html#java.util.List)\[In]]]A `Sink` that keeps on collecting incoming elements until upstream terminates.

A `Sink` that keeps on collecting incoming elements until upstream terminates.
As upstream may be unbounded, `Flow[T].take` or the stricter `Flow[T].limit` (and their variants)
may be used to ensure boundedness.
Materializes into a `CompletionStage` of `Seq[T]` containing all the collected elements.
`List` is limited to `Integer.MAX_VALUE` elements, this Sink will cancel the stream
after having received that many elements.

See also [Flow.limit](Flow.html#limit(n:Long):akka.stream.javadsl.Flow[In,Out,Mat]), [Flow.limitWeighted](Flow.html#limitWeighted(n:Long)(costFn:akka.japi.function.Function[Out,Long]):akka.stream.javadsl.Flow[In,Out,Mat]), [Flow.take](Flow.html#take(n:Long):akka.stream.javadsl.Flow[In,Out,Mat]), [Flow.takeWithin](Flow.html#takeWithin(duration:java.time.Duration):akka.stream.javadsl.Flow[In,Out,Mat]), [Flow.takeWhile](Flow.html#takeWhile(p:akka.japi.function.Predicate[Out]):akka.stream.javadsl.Flow[In,Out,Mat])
44. [**](../../../akka/stream/javadsl/Sink$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
45. [**](../../../akka/stream/javadsl/Sink$.html#takeLast[In](n:Int):akka.stream.javadsl.Sink[In,java.util.concurrent.CompletionStage[java.util.List[In]]] "Permalink")  def takeLast\[In](n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Sink](Sink.html)\[In, [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[List](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/List.html#java.util.List)\[In]]]A `Sink` that materializes into a a `CompletionStage` of `List<In>` containing the last `n` collected elements.

A `Sink` that materializes into a a `CompletionStage` of `List<In>` containing the last `n` collected elements.

If the stream completes before signaling at least n elements, the `CompletionStage` will complete with all elements seen so far.
If the stream never completes the `CompletionStage` will never complete.
If there is a failure signaled in the stream the `CompletionStage` will be completed with failure.
46. [**](../../../akka/stream/javadsl/Sink$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
47. [**](../../../akka/stream/javadsl/Sink$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
48. [**](../../../akka/stream/javadsl/Sink$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
49. [**](../../../akka/stream/javadsl/Sink$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/stream/javadsl/Sink$.html#actorRefWithAck[In](ref:akka.actor.ActorRef,onInitMessage:Any,ackMessage:Any,onCompleteMessage:Any,onFailureMessage:akka.japi.function.Function[Throwable,Any]):akka.stream.javadsl.Sink[In,akka.NotUsed] "Permalink")  def actorRefWithAck\[In](ref: [ActorRef](../../actor/ActorRef.html), onInitMessage: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), ackMessage: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), onCompleteMessage: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), onFailureMessage: [Function](../../japi/function/Function.html)\[Throwable, [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)]): [Sink](Sink.html)\[In, [NotUsed](../../NotUsed.html)]Sends the elements of the stream to the given `ActorRef` that sends back back\-pressure signal.

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

Annotations@Deprecated @deprecated Deprecated*(Since version 2\.6\.0\)* Use actorRefWithBackpressure instead
2. [**](../../../akka/stream/javadsl/Sink$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
3. [**](../../../akka/stream/javadsl/Sink$.html#lazyInit[T,M](sinkFactory:akka.japi.function.Function[T,java.util.concurrent.CompletionStage[akka.stream.javadsl.Sink[T,M]]],fallback:akka.japi.function.Creator[M]):akka.stream.javadsl.Sink[T,java.util.concurrent.CompletionStage[M]] "Permalink")  def lazyInit\[T, M](sinkFactory: [Function](../../japi/function/Function.html)\[T, [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[Sink](Sink.html)\[T, M]]], fallback: [Creator](../../japi/function/Creator.html)\[M]): [Sink](Sink.html)\[T, [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[M]]Creates a real `Sink` upon receiving the first element.

Creates a real `Sink` upon receiving the first element. Internal `Sink` will not be created if there are no elements,
because of completion or error.

If upstream completes before an element was received then the `Future` is completed with the value created by fallback.
If upstream fails before an element was received, `sinkFactory` throws an exception, or materialization of the internal
sink fails then the `Future` is completed with the exception.
Otherwise the `Future` is completed with the materialized value of the internal sink.

Annotations@deprecated Deprecated*(Since version 2\.6\.0\)* Use 'Sink.lazyCompletionStageSink' in combination with 'Flow.prefixAndTail(1\)' instead
4. [**](../../../akka/stream/javadsl/Sink$.html#lazyInitAsync[T,M](sinkFactory:akka.japi.function.Creator[java.util.concurrent.CompletionStage[akka.stream.javadsl.Sink[T,M]]]):akka.stream.javadsl.Sink[T,java.util.concurrent.CompletionStage[java.util.Optional[M]]] "Permalink")  def lazyInitAsync\[T, M](sinkFactory: [Creator](../../japi/function/Creator.html)\[[CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[Sink](Sink.html)\[T, M]]]): [Sink](Sink.html)\[T, [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[M]]]Creates a real `Sink` upon receiving the first element.

Creates a real `Sink` upon receiving the first element. Internal `Sink` will not be created if there are no elements,
because of completion or error.

If upstream completes before an element was received then the `Future` is completed with `None`.
If upstream fails before an element was received, `sinkFactory` throws an exception, or materialization of the internal
sink fails then the `Future` is completed with the exception.
Otherwise the `Future` is completed with the materialized value of the internal sink.

Annotations@deprecated Deprecated*(Since version 2\.6\.0\)* Use 'Sink.lazyCompletionStageSink' instead
5. [**](../../../akka/stream/javadsl/Sink$.html#setup[T,M](factory:java.util.function.BiFunction[akka.stream.ActorMaterializer,akka.stream.Attributes,akka.stream.javadsl.Sink[T,M]]):akka.stream.javadsl.Sink[T,java.util.concurrent.CompletionStage[M]] "Permalink")  def setup\[T, M](factory: [BiFunction](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/BiFunction.html#java.util.function.BiFunction)\[[ActorMaterializer](../ActorMaterializer.html), [Attributes](../Attributes.html), [Sink](Sink.html)\[T, M]]): [Sink](Sink.html)\[T, [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[M]]Defers the creation of a [Sink](Sink.html) until materialization.

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
- https://doc.akka.io/api/akka/current/akka/actor/ActorRef.html
- https://doc.akka.io/api/akka/current/akka/actor/Status$$Failure.html
- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/akka/japi/function/Creator.html
- https://doc.akka.io/api/akka/current/akka/japi/function/Function.html
- https://doc.akka.io/api/akka/current/akka/japi/function/Function2.html
- https://doc.akka.io/api/akka/current/akka/japi/function/Procedure.html
- https://doc.akka.io/api/akka/current/akka/stream/ActorMaterializer.html
- https://doc.akka.io/api/akka/current/akka/stream/Attributes.html
- https://doc.akka.io/api/akka/current/akka/stream/Graph.html
- https://doc.akka.io/api/akka/current/akka/stream/Materializer.html
- https://doc.akka.io/api/akka/current/akka/stream/NeverMaterializedException.html
- https://doc.akka.io/api/akka/current/akka/stream/SinkShape.html
- https://doc.akka.io/api/akka/current/akka/stream/UniformFanOutShape.html
- https://doc.akka.io/api/akka/current/akka/stream/index.html
- https://doc.akka.io/api/akka/current/akka/stream/javadsl/AsPublisher.html
- https://doc.akka.io/api/akka/current/akka/stream/javadsl/Balance$.html
- https://doc.akka.io/api/akka/current/akka/stream/javadsl/BidiFlow$.html
- https://doc.akka.io/api/akka/current/akka/stream/javadsl/BidiFlow.html
- https://doc.akka.io/api/akka/current/akka/stream/javadsl/Broadcast$.html
- https://doc.akka.io/api/akka/current/akka/stream/javadsl/BroadcastHub$.html
- https://doc.akka.io/api/akka/current/akka/stream/javadsl/Compression$.html
- https://doc.akka.io/api/akka/current/akka/stream/javadsl/Concat$.html
- https://doc.akka.io/api/akka/current/akka/stream/javadsl/DelayStrategy$.html
- https://doc.akka.io/api/akka/current/akka/stream/javadsl/DelayStrategy.html
- https://doc.akka.io/api/akka/current/akka/stream/javadsl/FileIO$.html
- https://doc.akka.io/api/akka/current/akka/stream/javadsl/Flow$.html
- https://doc.akka.io/api/akka/current/akka/stream/javadsl/Flow.html
- https://doc.akka.io/api/akka/current/akka/stream/javadsl/FlowWithContext$.html
- https://doc.akka.io/api/akka/current/akka/stream/javadsl/FlowWithContext.html
- https://doc.akka.io/api/akka/current/akka/stream/javadsl/Framing$.html
- https://doc.akka.io/api/akka/current/akka/stream/javadsl/FramingTruncation.html
- https://doc.akka.io/api/akka/current/akka/stream/javadsl/GraphDSL$.html
- https://doc.akka.io/api/akka/current/akka/stream/javadsl/JavaFlowSupport.html
- https://doc.akka.io/api/akka/current/akka/stream/javadsl/JsonFraming$.html
- https://doc.akka.io/api/akka/current/akka/stream/javadsl/Keep$.html
- https://doc.akka.io/api/akka/current/akka/stream/javadsl/Merge$.html
- https://doc.akka.io/api/akka/current/akka/stream/javadsl/MergeHub$.html
- https://doc.akka.io/api/akka/current/akka/stream/javadsl/MergeLatest$.html
- https://doc.akka.io/api/akka/current/akka/stream/javadsl/MergePreferred$.html
- https://doc.akka.io/api/akka/current/akka/stream/javadsl/MergePrioritized$.html
- https://doc.akka.io/api/akka/current/akka/stream/javadsl/MergeSequence$.html
- https://doc.akka.io/api/akka/current/akka/stream/javadsl/Partition$.html
- https://doc.akka.io/api/akka/current/akka/stream/javadsl/PartitionHub$.html
- https://doc.akka.io/api/akka/current/akka/stream/javadsl/RestartFlow$.html
- https://doc.akka.io/api/akka/current/akka/stream/javadsl/RestartSink$.html
- https://doc.akka.io/api/akka/current/akka/stream/javadsl/RestartSource$.html
- https://doc.akka.io/api/akka/current/akka/stream/javadsl/RestartSourceWithContext$.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/stream/javadsl/Sink$.html](https://doc.akka.io/api/akka/current/akka/stream/javadsl/Sink$.html)*