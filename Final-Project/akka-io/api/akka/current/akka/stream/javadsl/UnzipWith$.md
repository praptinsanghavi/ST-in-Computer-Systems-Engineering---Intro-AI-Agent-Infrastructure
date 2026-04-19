---
description: Akka 2.10.17 - akka.stream.javadsl.UnzipWith
knowledge_type: official_documentation
scraped_at: '2026-04-05T22:32:21Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/stream/javadsl/UnzipWith$.html
title: Akka 2.10.17 - akka.stream.javadsl.UnzipWith
---

# Akka 2.10.17 - akka.stream.javadsl.UnzipWith

> **Summary:** Akka 2.10.17 - akka.stream.javadsl.UnzipWith

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
- UnzipWith
- [Zip](Zip$.html "Combine the elements of 2 streams into a stream of tuples.")
- [ZipLatest](ZipLatest$.html "Combine the elements of 2 streams into a stream of tuples, picking always the latest element of each.")
- [ZipLatestWith](ZipLatestWith$.html "Combine the elements of multiple streams into a stream of combined elements using a combiner function, picking always the latest of the elements of each source.")
- [ZipN](ZipN$.html "Combine the elements of multiple streams into a stream of lists.")
- [ZipWith](ZipWith$.html "Combine the elements of multiple streams into a stream of combined elements using a combiner function.")
- [ZipWithN](ZipWithN$.html "Combine the elements of multiple streams into a stream of lists using a combiner function.")
o[akka](../../index.html).[stream](../index.html).[javadsl](index.html)

# UnzipWith[**](../../../akka/stream/javadsl/UnzipWith$.html "Permalink")

### 

#### object UnzipWith

Split one stream into several streams using a splitting function.

**Emits when** all of the outputs stops backpressuring and there is an input element available

**Backpressures when** any of the outputs backpressures

**Completes when** upstream completes

**Cancels when** any downstream cancels

Source[UnzipWith.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-stream/target/scala-2.13/src_managed/main/akka/stream/javadsl/UnzipWith.scala#L26)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. UnzipWith
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../../akka/stream/javadsl/UnzipWith$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/stream/javadsl/UnzipWith$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/stream/javadsl/UnzipWith$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../akka/stream/javadsl/UnzipWith$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../../akka/stream/javadsl/UnzipWith$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
6. [**](../../../akka/stream/javadsl/UnzipWith$.html#create[In,A,B](f:akka.japi.function.Function[In,akka.japi.Pair[A,B]]):akka.stream.Graph[akka.stream.FanOutShape2[In,A,B],akka.NotUsed] "Permalink")  def create\[In, A, B](f: [Function](../../japi/function/Function.html)\[In, [Pair](../../japi/Pair.html)\[A, B]]): [Graph](../Graph.html)\[[FanOutShape2](../FanOutShape2.html)\[In, A, B], [NotUsed](../../NotUsed.html)]Create a new `UnzipWith` vertex with the specified input type and unzipping\-function `f`.

Create a new `UnzipWith` vertex with the specified input type and unzipping\-function `f`.

funzipping\-function from the input value to the pair of output values
7. [**](../../../akka/stream/javadsl/UnzipWith$.html#create10[In,T1,T2,T3,T4,T5,T6,T7,T8,T9,T10](f:akka.japi.function.Function[In,akka.japi.tuple.Tuple10[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10]]):akka.stream.Graph[akka.stream.FanOutShape10[In,T1,T2,T3,T4,T5,T6,T7,T8,T9,T10],akka.NotUsed] "Permalink")  def create10\[In, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10](f: [Function](../../japi/function/Function.html)\[In, [Tuple10](../../japi/tuple/Tuple10.html)\[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10]]): [Graph](../Graph.html)\[[FanOutShape10](../FanOutShape10.html)\[In, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10], [NotUsed](../../NotUsed.html)]Create a new `UnzipWith` specialized for 10 outputs.

Create a new `UnzipWith` specialized for 10 outputs.

funzipping\-function from the input value to the output values
8. [**](../../../akka/stream/javadsl/UnzipWith$.html#create11[In,T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11](f:akka.japi.function.Function[In,akka.japi.tuple.Tuple11[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11]]):akka.stream.Graph[akka.stream.FanOutShape11[In,T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11],akka.NotUsed] "Permalink")  def create11\[In, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11](f: [Function](../../japi/function/Function.html)\[In, [Tuple11](../../japi/tuple/Tuple11.html)\[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11]]): [Graph](../Graph.html)\[[FanOutShape11](../FanOutShape11.html)\[In, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11], [NotUsed](../../NotUsed.html)]Create a new `UnzipWith` specialized for 11 outputs.

Create a new `UnzipWith` specialized for 11 outputs.

funzipping\-function from the input value to the output values
9. [**](../../../akka/stream/javadsl/UnzipWith$.html#create12[In,T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12](f:akka.japi.function.Function[In,akka.japi.tuple.Tuple12[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12]]):akka.stream.Graph[akka.stream.FanOutShape12[In,T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12],akka.NotUsed] "Permalink")  def create12\[In, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12](f: [Function](../../japi/function/Function.html)\[In, [Tuple12](../../japi/tuple/Tuple12.html)\[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12]]): [Graph](../Graph.html)\[[FanOutShape12](../FanOutShape12.html)\[In, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12], [NotUsed](../../NotUsed.html)]Create a new `UnzipWith` specialized for 12 outputs.

Create a new `UnzipWith` specialized for 12 outputs.

funzipping\-function from the input value to the output values
10. [**](../../../akka/stream/javadsl/UnzipWith$.html#create13[In,T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13](f:akka.japi.function.Function[In,akka.japi.tuple.Tuple13[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13]]):akka.stream.Graph[akka.stream.FanOutShape13[In,T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13],akka.NotUsed] "Permalink")  def create13\[In, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13](f: [Function](../../japi/function/Function.html)\[In, [Tuple13](../../japi/tuple/Tuple13.html)\[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13]]): [Graph](../Graph.html)\[[FanOutShape13](../FanOutShape13.html)\[In, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13], [NotUsed](../../NotUsed.html)]Create a new `UnzipWith` specialized for 13 outputs.

Create a new `UnzipWith` specialized for 13 outputs.

funzipping\-function from the input value to the output values
11. [**](../../../akka/stream/javadsl/UnzipWith$.html#create14[In,T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](f:akka.japi.function.Function[In,akka.japi.tuple.Tuple14[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14]]):akka.stream.Graph[akka.stream.FanOutShape14[In,T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14],akka.NotUsed] "Permalink")  def create14\[In, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14](f: [Function](../../japi/function/Function.html)\[In, [Tuple14](../../japi/tuple/Tuple14.html)\[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14]]): [Graph](../Graph.html)\[[FanOutShape14](../FanOutShape14.html)\[In, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14], [NotUsed](../../NotUsed.html)]Create a new `UnzipWith` specialized for 14 outputs.

Create a new `UnzipWith` specialized for 14 outputs.

funzipping\-function from the input value to the output values
12. [**](../../../akka/stream/javadsl/UnzipWith$.html#create15[In,T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](f:akka.japi.function.Function[In,akka.japi.tuple.Tuple15[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15]]):akka.stream.Graph[akka.stream.FanOutShape15[In,T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15],akka.NotUsed] "Permalink")  def create15\[In, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15](f: [Function](../../japi/function/Function.html)\[In, [Tuple15](../../japi/tuple/Tuple15.html)\[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15]]): [Graph](../Graph.html)\[[FanOutShape15](../FanOutShape15.html)\[In, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15], [NotUsed](../../NotUsed.html)]Create a new `UnzipWith` specialized for 15 outputs.

Create a new `UnzipWith` specialized for 15 outputs.

funzipping\-function from the input value to the output values
13. [**](../../../akka/stream/javadsl/UnzipWith$.html#create16[In,T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](f:akka.japi.function.Function[In,akka.japi.tuple.Tuple16[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16]]):akka.stream.Graph[akka.stream.FanOutShape16[In,T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16],akka.NotUsed] "Permalink")  def create16\[In, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16](f: [Function](../../japi/function/Function.html)\[In, [Tuple16](../../japi/tuple/Tuple16.html)\[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16]]): [Graph](../Graph.html)\[[FanOutShape16](../FanOutShape16.html)\[In, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16], [NotUsed](../../NotUsed.html)]Create a new `UnzipWith` specialized for 16 outputs.

Create a new `UnzipWith` specialized for 16 outputs.

funzipping\-function from the input value to the output values
14. [**](../../../akka/stream/javadsl/UnzipWith$.html#create17[In,T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17](f:akka.japi.function.Function[In,akka.japi.tuple.Tuple17[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17]]):akka.stream.Graph[akka.stream.FanOutShape17[In,T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17],akka.NotUsed] "Permalink")  def create17\[In, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17](f: [Function](../../japi/function/Function.html)\[In, [Tuple17](../../japi/tuple/Tuple17.html)\[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17]]): [Graph](../Graph.html)\[[FanOutShape17](../FanOutShape17.html)\[In, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17], [NotUsed](../../NotUsed.html)]Create a new `UnzipWith` specialized for 17 outputs.

Create a new `UnzipWith` specialized for 17 outputs.

funzipping\-function from the input value to the output values
15. [**](../../../akka/stream/javadsl/UnzipWith$.html#create18[In,T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18](f:akka.japi.function.Function[In,akka.japi.tuple.Tuple18[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18]]):akka.stream.Graph[akka.stream.FanOutShape18[In,T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18],akka.NotUsed] "Permalink")  def create18\[In, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18](f: [Function](../../japi/function/Function.html)\[In, [Tuple18](../../japi/tuple/Tuple18.html)\[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18]]): [Graph](../Graph.html)\[[FanOutShape18](../FanOutShape18.html)\[In, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18], [NotUsed](../../NotUsed.html)]Create a new `UnzipWith` specialized for 18 outputs.

Create a new `UnzipWith` specialized for 18 outputs.

funzipping\-function from the input value to the output values
16. [**](../../../akka/stream/javadsl/UnzipWith$.html#create19[In,T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19](f:akka.japi.function.Function[In,akka.japi.tuple.Tuple19[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19]]):akka.stream.Graph[akka.stream.FanOutShape19[In,T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19],akka.NotUsed] "Permalink")  def create19\[In, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19](f: [Function](../../japi/function/Function.html)\[In, [Tuple19](../../japi/tuple/Tuple19.html)\[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19]]): [Graph](../Graph.html)\[[FanOutShape19](../FanOutShape19.html)\[In, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19], [NotUsed](../../NotUsed.html)]Create a new `UnzipWith` specialized for 19 outputs.

Create a new `UnzipWith` specialized for 19 outputs.

funzipping\-function from the input value to the output values
17. [**](../../../akka/stream/javadsl/UnzipWith$.html#create20[In,T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20](f:akka.japi.function.Function[In,akka.japi.tuple.Tuple20[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20]]):akka.stream.Graph[akka.stream.FanOutShape20[In,T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20],akka.NotUsed] "Permalink")  def create20\[In, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20](f: [Function](../../japi/function/Function.html)\[In, [Tuple20](../../japi/tuple/Tuple20.html)\[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20]]): [Graph](../Graph.html)\[[FanOutShape20](../FanOutShape20.html)\[In, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20], [NotUsed](../../NotUsed.html)]Create a new `UnzipWith` specialized for 20 outputs.

Create a new `UnzipWith` specialized for 20 outputs.

funzipping\-function from the input value to the output values
18. [**](../../../akka/stream/javadsl/UnzipWith$.html#create21[In,T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21](f:akka.japi.function.Function[In,akka.japi.tuple.Tuple21[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21]]):akka.stream.Graph[akka.stream.FanOutShape21[In,T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21],akka.NotUsed] "Permalink")  def create21\[In, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21](f: [Function](../../japi/function/Function.html)\[In, [Tuple21](../../japi/tuple/Tuple21.html)\[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21]]): [Graph](../Graph.html)\[[FanOutShape21](../FanOutShape21.html)\[In, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21], [NotUsed](../../NotUsed.html)]Create a new `UnzipWith` specialized for 21 outputs.

Create a new `UnzipWith` specialized for 21 outputs.

funzipping\-function from the input value to the output values
19. [**](../../../akka/stream/javadsl/UnzipWith$.html#create22[In,T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22](f:akka.japi.function.Function[In,akka.japi.tuple.Tuple22[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22]]):akka.stream.Graph[akka.stream.FanOutShape22[In,T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22],akka.NotUsed] "Permalink")  def create22\[In, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22](f: [Function](../../japi/function/Function.html)\[In, [Tuple22](../../japi/tuple/Tuple22.html)\[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22]]): [Graph](../Graph.html)\[[FanOutShape22](../FanOutShape22.html)\[In, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22], [NotUsed](../../NotUsed.html)]Create a new `UnzipWith` specialized for 22 outputs.

Create a new `UnzipWith` specialized for 22 outputs.

funzipping\-function from the input value to the output values
20. [**](../../../akka/stream/javadsl/UnzipWith$.html#create3[In,T1,T2,T3](f:akka.japi.function.Function[In,akka.japi.tuple.Tuple3[T1,T2,T3]]):akka.stream.Graph[akka.stream.FanOutShape3[In,T1,T2,T3],akka.NotUsed] "Permalink")  def create3\[In, T1, T2, T3](f: [Function](../../japi/function/Function.html)\[In, [Tuple3](../../japi/tuple/Tuple3.html)\[T1, T2, T3]]): [Graph](../Graph.html)\[[FanOutShape3](../FanOutShape3.html)\[In, T1, T2, T3], [NotUsed](../../NotUsed.html)]Create a new `UnzipWith` specialized for 3 outputs.

Create a new `UnzipWith` specialized for 3 outputs.

funzipping\-function from the input value to the output values
21. [**](../../../akka/stream/javadsl/UnzipWith$.html#create4[In,T1,T2,T3,T4](f:akka.japi.function.Function[In,akka.japi.tuple.Tuple4[T1,T2,T3,T4]]):akka.stream.Graph[akka.stream.FanOutShape4[In,T1,T2,T3,T4],akka.NotUsed] "Permalink")  def create4\[In, T1, T2, T3, T4](f: [Function](../../japi/function/Function.html)\[In, [Tuple4](../../japi/tuple/Tuple4.html)\[T1, T2, T3, T4]]): [Graph](../Graph.html)\[[FanOutShape4](../FanOutShape4.html)\[In, T1, T2, T3, T4], [NotUsed](../../NotUsed.html)]Create a new `UnzipWith` specialized for 4 outputs.

Create a new `UnzipWith` specialized for 4 outputs.

funzipping\-function from the input value to the output values
22. [**](../../../akka/stream/javadsl/UnzipWith$.html#create5[In,T1,T2,T3,T4,T5](f:akka.japi.function.Function[In,akka.japi.tuple.Tuple5[T1,T2,T3,T4,T5]]):akka.stream.Graph[akka.stream.FanOutShape5[In,T1,T2,T3,T4,T5],akka.NotUsed] "Permalink")  def create5\[In, T1, T2, T3, T4, T5](f: [Function](../../japi/function/Function.html)\[In, [Tuple5](../../japi/tuple/Tuple5.html)\[T1, T2, T3, T4, T5]]): [Graph](../Graph.html)\[[FanOutShape5](../FanOutShape5.html)\[In, T1, T2, T3, T4, T5], [NotUsed](../../NotUsed.html)]Create a new `UnzipWith` specialized for 5 outputs.

Create a new `UnzipWith` specialized for 5 outputs.

funzipping\-function from the input value to the output values
23. [**](../../../akka/stream/javadsl/UnzipWith$.html#create6[In,T1,T2,T3,T4,T5,T6](f:akka.japi.function.Function[In,akka.japi.tuple.Tuple6[T1,T2,T3,T4,T5,T6]]):akka.stream.Graph[akka.stream.FanOutShape6[In,T1,T2,T3,T4,T5,T6],akka.NotUsed] "Permalink")  def create6\[In, T1, T2, T3, T4, T5, T6](f: [Function](../../japi/function/Function.html)\[In, [Tuple6](../../japi/tuple/Tuple6.html)\[T1, T2, T3, T4, T5, T6]]): [Graph](../Graph.html)\[[FanOutShape6](../FanOutShape6.html)\[In, T1, T2, T3, T4, T5, T6], [NotUsed](../../NotUsed.html)]Create a new `UnzipWith` specialized for 6 outputs.

Create a new `UnzipWith` specialized for 6 outputs.

funzipping\-function from the input value to the output values
24. [**](../../../akka/stream/javadsl/UnzipWith$.html#create7[In,T1,T2,T3,T4,T5,T6,T7](f:akka.japi.function.Function[In,akka.japi.tuple.Tuple7[T1,T2,T3,T4,T5,T6,T7]]):akka.stream.Graph[akka.stream.FanOutShape7[In,T1,T2,T3,T4,T5,T6,T7],akka.NotUsed] "Permalink")  def create7\[In, T1, T2, T3, T4, T5, T6, T7](f: [Function](../../japi/function/Function.html)\[In, [Tuple7](../../japi/tuple/Tuple7.html)\[T1, T2, T3, T4, T5, T6, T7]]): [Graph](../Graph.html)\[[FanOutShape7](../FanOutShape7.html)\[In, T1, T2, T3, T4, T5, T6, T7], [NotUsed](../../NotUsed.html)]Create a new `UnzipWith` specialized for 7 outputs.

Create a new `UnzipWith` specialized for 7 outputs.

funzipping\-function from the input value to the output values
25. [**](../../../akka/stream/javadsl/UnzipWith$.html#create8[In,T1,T2,T3,T4,T5,T6,T7,T8](f:akka.japi.function.Function[In,akka.japi.tuple.Tuple8[T1,T2,T3,T4,T5,T6,T7,T8]]):akka.stream.Graph[akka.stream.FanOutShape8[In,T1,T2,T3,T4,T5,T6,T7,T8],akka.NotUsed] "Permalink")  def create8\[In, T1, T2, T3, T4, T5, T6, T7, T8](f: [Function](../../japi/function/Function.html)\[In, [Tuple8](../../japi/tuple/Tuple8.html)\[T1, T2, T3, T4, T5, T6, T7, T8]]): [Graph](../Graph.html)\[[FanOutShape8](../FanOutShape8.html)\[In, T1, T2, T3, T4, T5, T6, T7, T8], [NotUsed](../../NotUsed.html)]Create a new `UnzipWith` specialized for 8 outputs.

Create a new `UnzipWith` specialized for 8 outputs.

funzipping\-function from the input value to the output values
26. [**](../../../akka/stream/javadsl/UnzipWith$.html#create9[In,T1,T2,T3,T4,T5,T6,T7,T8,T9](f:akka.japi.function.Function[In,akka.japi.tuple.Tuple9[T1,T2,T3,T4,T5,T6,T7,T8,T9]]):akka.stream.Graph[akka.stream.FanOutShape9[In,T1,T2,T3,T4,T5,T6,T7,T8,T9],akka.NotUsed] "Permalink")  def create9\[In, T1, T2, T3, T4, T5, T6, T7, T8, T9](f: [Function](../../japi/function/Function.html)\[In, [Tuple9](../../japi/tuple/Tuple9.html)\[T1, T2, T3, T4, T5, T6, T7, T8, T9]]): [Graph](../Graph.html)\[[FanOutShape9](../FanOutShape9.html)\[In, T1, T2, T3, T4, T5, T6, T7, T8, T9], [NotUsed](../../NotUsed.html)]Create a new `UnzipWith` specialized for 9 outputs.

Create a new `UnzipWith` specialized for 9 outputs.

funzipping\-function from the input value to the output values
27. [**](../../../akka/stream/javadsl/UnzipWith$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
28. [**](../../../akka/stream/javadsl/UnzipWith$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
29. [**](../../../akka/stream/javadsl/UnzipWith$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
30. [**](../../../akka/stream/javadsl/UnzipWith$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
31. [**](../../../akka/stream/javadsl/UnzipWith$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
32. [**](../../../akka/stream/javadsl/UnzipWith$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
33. [**](../../../akka/stream/javadsl/UnzipWith$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
34. [**](../../../akka/stream/javadsl/UnzipWith$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
35. [**](../../../akka/stream/javadsl/UnzipWith$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
36. [**](../../../akka/stream/javadsl/UnzipWith$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
37. [**](../../../akka/stream/javadsl/UnzipWith$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
38. [**](../../../akka/stream/javadsl/UnzipWith$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
39. [**](../../../akka/stream/javadsl/UnzipWith$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/stream/javadsl/UnzipWith$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/NotUsed.html
- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/akka/japi/Pair.html
- https://doc.akka.io/api/akka/current/akka/japi/function/Function.html
- https://doc.akka.io/api/akka/current/akka/japi/tuple/Tuple10.html
- https://doc.akka.io/api/akka/current/akka/japi/tuple/Tuple11.html
- https://doc.akka.io/api/akka/current/akka/japi/tuple/Tuple12.html
- https://doc.akka.io/api/akka/current/akka/japi/tuple/Tuple13.html
- https://doc.akka.io/api/akka/current/akka/japi/tuple/Tuple14.html
- https://doc.akka.io/api/akka/current/akka/japi/tuple/Tuple15.html
- https://doc.akka.io/api/akka/current/akka/japi/tuple/Tuple16.html
- https://doc.akka.io/api/akka/current/akka/japi/tuple/Tuple17.html
- https://doc.akka.io/api/akka/current/akka/japi/tuple/Tuple18.html
- https://doc.akka.io/api/akka/current/akka/japi/tuple/Tuple19.html
- https://doc.akka.io/api/akka/current/akka/japi/tuple/Tuple20.html
- https://doc.akka.io/api/akka/current/akka/japi/tuple/Tuple21.html
- https://doc.akka.io/api/akka/current/akka/japi/tuple/Tuple22.html
- https://doc.akka.io/api/akka/current/akka/japi/tuple/Tuple3.html
- https://doc.akka.io/api/akka/current/akka/japi/tuple/Tuple4.html
- https://doc.akka.io/api/akka/current/akka/japi/tuple/Tuple5.html
- https://doc.akka.io/api/akka/current/akka/japi/tuple/Tuple6.html
- https://doc.akka.io/api/akka/current/akka/japi/tuple/Tuple7.html
- https://doc.akka.io/api/akka/current/akka/japi/tuple/Tuple8.html
- https://doc.akka.io/api/akka/current/akka/japi/tuple/Tuple9.html
- https://doc.akka.io/api/akka/current/akka/stream/FanOutShape10.html
- https://doc.akka.io/api/akka/current/akka/stream/FanOutShape11.html
- https://doc.akka.io/api/akka/current/akka/stream/FanOutShape12.html
- https://doc.akka.io/api/akka/current/akka/stream/FanOutShape13.html
- https://doc.akka.io/api/akka/current/akka/stream/FanOutShape14.html
- https://doc.akka.io/api/akka/current/akka/stream/FanOutShape15.html
- https://doc.akka.io/api/akka/current/akka/stream/FanOutShape16.html
- https://doc.akka.io/api/akka/current/akka/stream/FanOutShape17.html
- https://doc.akka.io/api/akka/current/akka/stream/FanOutShape18.html
- https://doc.akka.io/api/akka/current/akka/stream/FanOutShape19.html
- https://doc.akka.io/api/akka/current/akka/stream/FanOutShape2.html
- https://doc.akka.io/api/akka/current/akka/stream/FanOutShape20.html
- https://doc.akka.io/api/akka/current/akka/stream/FanOutShape21.html
- https://doc.akka.io/api/akka/current/akka/stream/FanOutShape22.html
- https://doc.akka.io/api/akka/current/akka/stream/FanOutShape3.html
- https://doc.akka.io/api/akka/current/akka/stream/FanOutShape4.html
- https://doc.akka.io/api/akka/current/akka/stream/FanOutShape5.html
- https://doc.akka.io/api/akka/current/akka/stream/FanOutShape6.html
- https://doc.akka.io/api/akka/current/akka/stream/FanOutShape7.html
- https://doc.akka.io/api/akka/current/akka/stream/FanOutShape8.html
- https://doc.akka.io/api/akka/current/akka/stream/FanOutShape9.html
- https://doc.akka.io/api/akka/current/akka/stream/Graph.html
- https://doc.akka.io/api/akka/current/akka/stream/index.html
- https://doc.akka.io/api/akka/current/akka/stream/javadsl/AsPublisher.html
- https://doc.akka.io/api/akka/current/akka/stream/javadsl/Balance$.html
- https://doc.akka.io/api/akka/current/akka/stream/javadsl/BidiFlow$.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/stream/javadsl/UnzipWith$.html](https://doc.akka.io/api/akka/current/akka/stream/javadsl/UnzipWith$.html)*