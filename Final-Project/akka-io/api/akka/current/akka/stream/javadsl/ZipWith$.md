---
description: Akka 2.10.17 - akka.stream.javadsl.ZipWith
knowledge_type: official_documentation
scraped_at: '2026-04-05T22:32:33Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/stream/javadsl/ZipWith$.html
title: Akka 2.10.17 - akka.stream.javadsl.ZipWith
---

# Akka 2.10.17 - akka.stream.javadsl.ZipWith

> **Summary:** Akka 2.10.17 - akka.stream.javadsl.ZipWith

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
- ZipWith
- [ZipWithN](ZipWithN$.html "Combine the elements of multiple streams into a stream of lists using a combiner function.")
o[akka](../../index.html).[stream](../index.html).[javadsl](index.html)

# ZipWith[**](../../../akka/stream/javadsl/ZipWith$.html "Permalink")

### 

#### object ZipWith

Combine the elements of multiple streams into a stream of combined elements using a combiner function.

**Emits when** all of the inputs has an element available

**Backpressures when** downstream backpressures

**Completes when** any upstream completes

**Cancels when** downstream cancels

Source[ZipWith.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-stream/target/scala-2.13/src_managed/main/akka/stream/javadsl/ZipWith.scala#L24)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ZipWith
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../../akka/stream/javadsl/ZipWith$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/stream/javadsl/ZipWith$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/stream/javadsl/ZipWith$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../akka/stream/javadsl/ZipWith$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../../akka/stream/javadsl/ZipWith$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
6. [**](../../../akka/stream/javadsl/ZipWith$.html#create[A,B,Out](f:akka.japi.function.Function2[A,B,Out]):akka.stream.Graph[akka.stream.FanInShape2[A,B,Out],akka.NotUsed] "Permalink")  def create\[A, B, Out](f: [Function2](../../japi/function/Function2.html)\[A, B, Out]): [Graph](../Graph.html)\[[FanInShape2](../FanInShape2.html)\[A, B, Out], [NotUsed](../../NotUsed.html)]Create a new `ZipWith` vertex with the specified input types and zipping\-function `f`.

Create a new `ZipWith` vertex with the specified input types and zipping\-function `f`.

fzipping\-function from the input values to the output value
7. [**](../../../akka/stream/javadsl/ZipWith$.html#create10[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,Out](f:akka.japi.function.Function10[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,Out]):akka.stream.Graph[akka.stream.FanInShape10[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,Out],akka.NotUsed] "Permalink")  def create10\[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, Out](f: [Function10](../../japi/function/Function10.html)\[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, Out]): [Graph](../Graph.html)\[[FanInShape10](../FanInShape10.html)\[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, Out], [NotUsed](../../NotUsed.html)]Create a new `ZipWith` specialized for 10 inputs.

Create a new `ZipWith` specialized for 10 inputs.

fzipping\-function from the input values to the output value
8. [**](../../../akka/stream/javadsl/ZipWith$.html#create11[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,Out](f:akka.japi.function.Function11[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,Out]):akka.stream.Graph[akka.stream.FanInShape11[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,Out],akka.NotUsed] "Permalink")  def create11\[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, Out](f: [Function11](../../japi/function/Function11.html)\[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, Out]): [Graph](../Graph.html)\[[FanInShape11](../FanInShape11.html)\[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, Out], [NotUsed](../../NotUsed.html)]Create a new `ZipWith` specialized for 11 inputs.

Create a new `ZipWith` specialized for 11 inputs.

fzipping\-function from the input values to the output value
9. [**](../../../akka/stream/javadsl/ZipWith$.html#create12[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,Out](f:akka.japi.function.Function12[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,Out]):akka.stream.Graph[akka.stream.FanInShape12[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,Out],akka.NotUsed] "Permalink")  def create12\[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, Out](f: [Function12](../../japi/function/Function12.html)\[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, Out]): [Graph](../Graph.html)\[[FanInShape12](../FanInShape12.html)\[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, Out], [NotUsed](../../NotUsed.html)]Create a new `ZipWith` specialized for 12 inputs.

Create a new `ZipWith` specialized for 12 inputs.

fzipping\-function from the input values to the output value
10. [**](../../../akka/stream/javadsl/ZipWith$.html#create13[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,Out](f:akka.japi.function.Function13[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,Out]):akka.stream.Graph[akka.stream.FanInShape13[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,Out],akka.NotUsed] "Permalink")  def create13\[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, Out](f: [Function13](../../japi/function/Function13.html)\[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, Out]): [Graph](../Graph.html)\[[FanInShape13](../FanInShape13.html)\[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, Out], [NotUsed](../../NotUsed.html)]Create a new `ZipWith` specialized for 13 inputs.

Create a new `ZipWith` specialized for 13 inputs.

fzipping\-function from the input values to the output value
11. [**](../../../akka/stream/javadsl/ZipWith$.html#create14[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,Out](f:akka.japi.function.Function14[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,Out]):akka.stream.Graph[akka.stream.FanInShape14[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,Out],akka.NotUsed] "Permalink")  def create14\[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, Out](f: [Function14](../../japi/function/Function14.html)\[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, Out]): [Graph](../Graph.html)\[[FanInShape14](../FanInShape14.html)\[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, Out], [NotUsed](../../NotUsed.html)]Create a new `ZipWith` specialized for 14 inputs.

Create a new `ZipWith` specialized for 14 inputs.

fzipping\-function from the input values to the output value
12. [**](../../../akka/stream/javadsl/ZipWith$.html#create15[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,Out](f:akka.japi.function.Function15[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,Out]):akka.stream.Graph[akka.stream.FanInShape15[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,Out],akka.NotUsed] "Permalink")  def create15\[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, Out](f: [Function15](../../japi/function/Function15.html)\[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, Out]): [Graph](../Graph.html)\[[FanInShape15](../FanInShape15.html)\[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, Out], [NotUsed](../../NotUsed.html)]Create a new `ZipWith` specialized for 15 inputs.

Create a new `ZipWith` specialized for 15 inputs.

fzipping\-function from the input values to the output value
13. [**](../../../akka/stream/javadsl/ZipWith$.html#create16[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,Out](f:akka.japi.function.Function16[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,Out]):akka.stream.Graph[akka.stream.FanInShape16[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,Out],akka.NotUsed] "Permalink")  def create16\[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, Out](f: [Function16](../../japi/function/Function16.html)\[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, Out]): [Graph](../Graph.html)\[[FanInShape16](../FanInShape16.html)\[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, Out], [NotUsed](../../NotUsed.html)]Create a new `ZipWith` specialized for 16 inputs.

Create a new `ZipWith` specialized for 16 inputs.

fzipping\-function from the input values to the output value
14. [**](../../../akka/stream/javadsl/ZipWith$.html#create17[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,Out](f:akka.japi.function.Function17[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,Out]):akka.stream.Graph[akka.stream.FanInShape17[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,Out],akka.NotUsed] "Permalink")  def create17\[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, Out](f: [Function17](../../japi/function/Function17.html)\[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, Out]): [Graph](../Graph.html)\[[FanInShape17](../FanInShape17.html)\[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, Out], [NotUsed](../../NotUsed.html)]Create a new `ZipWith` specialized for 17 inputs.

Create a new `ZipWith` specialized for 17 inputs.

fzipping\-function from the input values to the output value
15. [**](../../../akka/stream/javadsl/ZipWith$.html#create18[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,Out](f:akka.japi.function.Function18[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,Out]):akka.stream.Graph[akka.stream.FanInShape18[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,Out],akka.NotUsed] "Permalink")  def create18\[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, Out](f: [Function18](../../japi/function/Function18.html)\[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, Out]): [Graph](../Graph.html)\[[FanInShape18](../FanInShape18.html)\[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, Out], [NotUsed](../../NotUsed.html)]Create a new `ZipWith` specialized for 18 inputs.

Create a new `ZipWith` specialized for 18 inputs.

fzipping\-function from the input values to the output value
16. [**](../../../akka/stream/javadsl/ZipWith$.html#create19[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,Out](f:akka.japi.function.Function19[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,Out]):akka.stream.Graph[akka.stream.FanInShape19[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,Out],akka.NotUsed] "Permalink")  def create19\[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, Out](f: [Function19](../../japi/function/Function19.html)\[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, Out]): [Graph](../Graph.html)\[[FanInShape19](../FanInShape19.html)\[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, Out], [NotUsed](../../NotUsed.html)]Create a new `ZipWith` specialized for 19 inputs.

Create a new `ZipWith` specialized for 19 inputs.

fzipping\-function from the input values to the output value
17. [**](../../../akka/stream/javadsl/ZipWith$.html#create20[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,Out](f:akka.japi.function.Function20[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,Out]):akka.stream.Graph[akka.stream.FanInShape20[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,Out],akka.NotUsed] "Permalink")  def create20\[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, Out](f: [Function20](../../japi/function/Function20.html)\[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, Out]): [Graph](../Graph.html)\[[FanInShape20](../FanInShape20.html)\[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, Out], [NotUsed](../../NotUsed.html)]Create a new `ZipWith` specialized for 20 inputs.

Create a new `ZipWith` specialized for 20 inputs.

fzipping\-function from the input values to the output value
18. [**](../../../akka/stream/javadsl/ZipWith$.html#create21[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,Out](f:akka.japi.function.Function21[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,Out]):akka.stream.Graph[akka.stream.FanInShape21[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,Out],akka.NotUsed] "Permalink")  def create21\[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, Out](f: [Function21](../../japi/function/Function21.html)\[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, Out]): [Graph](../Graph.html)\[[FanInShape21](../FanInShape21.html)\[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, Out], [NotUsed](../../NotUsed.html)]Create a new `ZipWith` specialized for 21 inputs.

Create a new `ZipWith` specialized for 21 inputs.

fzipping\-function from the input values to the output value
19. [**](../../../akka/stream/javadsl/ZipWith$.html#create22[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22,Out](f:akka.japi.function.Function22[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22,Out]):akka.stream.Graph[akka.stream.FanInShape22[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22,Out],akka.NotUsed] "Permalink")  def create22\[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, Out](f: [Function22](../../japi/function/Function22.html)\[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, Out]): [Graph](../Graph.html)\[[FanInShape22](../FanInShape22.html)\[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, Out], [NotUsed](../../NotUsed.html)]Create a new `ZipWith` specialized for 22 inputs.

Create a new `ZipWith` specialized for 22 inputs.

fzipping\-function from the input values to the output value
20. [**](../../../akka/stream/javadsl/ZipWith$.html#create3[T1,T2,T3,Out](f:akka.japi.function.Function3[T1,T2,T3,Out]):akka.stream.Graph[akka.stream.FanInShape3[T1,T2,T3,Out],akka.NotUsed] "Permalink")  def create3\[T1, T2, T3, Out](f: [Function3](../../japi/function/Function3.html)\[T1, T2, T3, Out]): [Graph](../Graph.html)\[[FanInShape3](../FanInShape3.html)\[T1, T2, T3, Out], [NotUsed](../../NotUsed.html)]Create a new `ZipWith` specialized for 3 inputs.

Create a new `ZipWith` specialized for 3 inputs.

fzipping\-function from the input values to the output value
21. [**](../../../akka/stream/javadsl/ZipWith$.html#create4[T1,T2,T3,T4,Out](f:akka.japi.function.Function4[T1,T2,T3,T4,Out]):akka.stream.Graph[akka.stream.FanInShape4[T1,T2,T3,T4,Out],akka.NotUsed] "Permalink")  def create4\[T1, T2, T3, T4, Out](f: [Function4](../../japi/function/Function4.html)\[T1, T2, T3, T4, Out]): [Graph](../Graph.html)\[[FanInShape4](../FanInShape4.html)\[T1, T2, T3, T4, Out], [NotUsed](../../NotUsed.html)]Create a new `ZipWith` specialized for 4 inputs.

Create a new `ZipWith` specialized for 4 inputs.

fzipping\-function from the input values to the output value
22. [**](../../../akka/stream/javadsl/ZipWith$.html#create5[T1,T2,T3,T4,T5,Out](f:akka.japi.function.Function5[T1,T2,T3,T4,T5,Out]):akka.stream.Graph[akka.stream.FanInShape5[T1,T2,T3,T4,T5,Out],akka.NotUsed] "Permalink")  def create5\[T1, T2, T3, T4, T5, Out](f: [Function5](../../japi/function/Function5.html)\[T1, T2, T3, T4, T5, Out]): [Graph](../Graph.html)\[[FanInShape5](../FanInShape5.html)\[T1, T2, T3, T4, T5, Out], [NotUsed](../../NotUsed.html)]Create a new `ZipWith` specialized for 5 inputs.

Create a new `ZipWith` specialized for 5 inputs.

fzipping\-function from the input values to the output value
23. [**](../../../akka/stream/javadsl/ZipWith$.html#create6[T1,T2,T3,T4,T5,T6,Out](f:akka.japi.function.Function6[T1,T2,T3,T4,T5,T6,Out]):akka.stream.Graph[akka.stream.FanInShape6[T1,T2,T3,T4,T5,T6,Out],akka.NotUsed] "Permalink")  def create6\[T1, T2, T3, T4, T5, T6, Out](f: [Function6](../../japi/function/Function6.html)\[T1, T2, T3, T4, T5, T6, Out]): [Graph](../Graph.html)\[[FanInShape6](../FanInShape6.html)\[T1, T2, T3, T4, T5, T6, Out], [NotUsed](../../NotUsed.html)]Create a new `ZipWith` specialized for 6 inputs.

Create a new `ZipWith` specialized for 6 inputs.

fzipping\-function from the input values to the output value
24. [**](../../../akka/stream/javadsl/ZipWith$.html#create7[T1,T2,T3,T4,T5,T6,T7,Out](f:akka.japi.function.Function7[T1,T2,T3,T4,T5,T6,T7,Out]):akka.stream.Graph[akka.stream.FanInShape7[T1,T2,T3,T4,T5,T6,T7,Out],akka.NotUsed] "Permalink")  def create7\[T1, T2, T3, T4, T5, T6, T7, Out](f: [Function7](../../japi/function/Function7.html)\[T1, T2, T3, T4, T5, T6, T7, Out]): [Graph](../Graph.html)\[[FanInShape7](../FanInShape7.html)\[T1, T2, T3, T4, T5, T6, T7, Out], [NotUsed](../../NotUsed.html)]Create a new `ZipWith` specialized for 7 inputs.

Create a new `ZipWith` specialized for 7 inputs.

fzipping\-function from the input values to the output value
25. [**](../../../akka/stream/javadsl/ZipWith$.html#create8[T1,T2,T3,T4,T5,T6,T7,T8,Out](f:akka.japi.function.Function8[T1,T2,T3,T4,T5,T6,T7,T8,Out]):akka.stream.Graph[akka.stream.FanInShape8[T1,T2,T3,T4,T5,T6,T7,T8,Out],akka.NotUsed] "Permalink")  def create8\[T1, T2, T3, T4, T5, T6, T7, T8, Out](f: [Function8](../../japi/function/Function8.html)\[T1, T2, T3, T4, T5, T6, T7, T8, Out]): [Graph](../Graph.html)\[[FanInShape8](../FanInShape8.html)\[T1, T2, T3, T4, T5, T6, T7, T8, Out], [NotUsed](../../NotUsed.html)]Create a new `ZipWith` specialized for 8 inputs.

Create a new `ZipWith` specialized for 8 inputs.

fzipping\-function from the input values to the output value
26. [**](../../../akka/stream/javadsl/ZipWith$.html#create9[T1,T2,T3,T4,T5,T6,T7,T8,T9,Out](f:akka.japi.function.Function9[T1,T2,T3,T4,T5,T6,T7,T8,T9,Out]):akka.stream.Graph[akka.stream.FanInShape9[T1,T2,T3,T4,T5,T6,T7,T8,T9,Out],akka.NotUsed] "Permalink")  def create9\[T1, T2, T3, T4, T5, T6, T7, T8, T9, Out](f: [Function9](../../japi/function/Function9.html)\[T1, T2, T3, T4, T5, T6, T7, T8, T9, Out]): [Graph](../Graph.html)\[[FanInShape9](../FanInShape9.html)\[T1, T2, T3, T4, T5, T6, T7, T8, T9, Out], [NotUsed](../../NotUsed.html)]Create a new `ZipWith` specialized for 9 inputs.

Create a new `ZipWith` specialized for 9 inputs.

fzipping\-function from the input values to the output value
27. [**](../../../akka/stream/javadsl/ZipWith$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
28. [**](../../../akka/stream/javadsl/ZipWith$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
29. [**](../../../akka/stream/javadsl/ZipWith$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
30. [**](../../../akka/stream/javadsl/ZipWith$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
31. [**](../../../akka/stream/javadsl/ZipWith$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
32. [**](../../../akka/stream/javadsl/ZipWith$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
33. [**](../../../akka/stream/javadsl/ZipWith$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
34. [**](../../../akka/stream/javadsl/ZipWith$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
35. [**](../../../akka/stream/javadsl/ZipWith$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
36. [**](../../../akka/stream/javadsl/ZipWith$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
37. [**](../../../akka/stream/javadsl/ZipWith$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
38. [**](../../../akka/stream/javadsl/ZipWith$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
39. [**](../../../akka/stream/javadsl/ZipWith$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/stream/javadsl/ZipWith$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/NotUsed.html
- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/akka/japi/function/Function10.html
- https://doc.akka.io/api/akka/current/akka/japi/function/Function11.html
- https://doc.akka.io/api/akka/current/akka/japi/function/Function12.html
- https://doc.akka.io/api/akka/current/akka/japi/function/Function13.html
- https://doc.akka.io/api/akka/current/akka/japi/function/Function14.html
- https://doc.akka.io/api/akka/current/akka/japi/function/Function15.html
- https://doc.akka.io/api/akka/current/akka/japi/function/Function16.html
- https://doc.akka.io/api/akka/current/akka/japi/function/Function17.html
- https://doc.akka.io/api/akka/current/akka/japi/function/Function18.html
- https://doc.akka.io/api/akka/current/akka/japi/function/Function19.html
- https://doc.akka.io/api/akka/current/akka/japi/function/Function2.html
- https://doc.akka.io/api/akka/current/akka/japi/function/Function20.html
- https://doc.akka.io/api/akka/current/akka/japi/function/Function21.html
- https://doc.akka.io/api/akka/current/akka/japi/function/Function22.html
- https://doc.akka.io/api/akka/current/akka/japi/function/Function3.html
- https://doc.akka.io/api/akka/current/akka/japi/function/Function4.html
- https://doc.akka.io/api/akka/current/akka/japi/function/Function5.html
- https://doc.akka.io/api/akka/current/akka/japi/function/Function6.html
- https://doc.akka.io/api/akka/current/akka/japi/function/Function7.html
- https://doc.akka.io/api/akka/current/akka/japi/function/Function8.html
- https://doc.akka.io/api/akka/current/akka/japi/function/Function9.html
- https://doc.akka.io/api/akka/current/akka/stream/FanInShape10.html
- https://doc.akka.io/api/akka/current/akka/stream/FanInShape11.html
- https://doc.akka.io/api/akka/current/akka/stream/FanInShape12.html
- https://doc.akka.io/api/akka/current/akka/stream/FanInShape13.html
- https://doc.akka.io/api/akka/current/akka/stream/FanInShape14.html
- https://doc.akka.io/api/akka/current/akka/stream/FanInShape15.html
- https://doc.akka.io/api/akka/current/akka/stream/FanInShape16.html
- https://doc.akka.io/api/akka/current/akka/stream/FanInShape17.html
- https://doc.akka.io/api/akka/current/akka/stream/FanInShape18.html
- https://doc.akka.io/api/akka/current/akka/stream/FanInShape19.html
- https://doc.akka.io/api/akka/current/akka/stream/FanInShape2.html
- https://doc.akka.io/api/akka/current/akka/stream/FanInShape20.html
- https://doc.akka.io/api/akka/current/akka/stream/FanInShape21.html
- https://doc.akka.io/api/akka/current/akka/stream/FanInShape22.html
- https://doc.akka.io/api/akka/current/akka/stream/FanInShape3.html
- https://doc.akka.io/api/akka/current/akka/stream/FanInShape4.html
- https://doc.akka.io/api/akka/current/akka/stream/FanInShape5.html
- https://doc.akka.io/api/akka/current/akka/stream/FanInShape6.html
- https://doc.akka.io/api/akka/current/akka/stream/FanInShape7.html
- https://doc.akka.io/api/akka/current/akka/stream/FanInShape8.html
- https://doc.akka.io/api/akka/current/akka/stream/FanInShape9.html
- https://doc.akka.io/api/akka/current/akka/stream/Graph.html
- https://doc.akka.io/api/akka/current/akka/stream/index.html
- https://doc.akka.io/api/akka/current/akka/stream/javadsl/AsPublisher.html
- https://doc.akka.io/api/akka/current/akka/stream/javadsl/Balance$.html
- https://doc.akka.io/api/akka/current/akka/stream/javadsl/BidiFlow$.html
- https://doc.akka.io/api/akka/current/akka/stream/javadsl/BidiFlow.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/stream/javadsl/ZipWith$.html](https://doc.akka.io/api/akka/current/akka/stream/javadsl/ZipWith$.html)*