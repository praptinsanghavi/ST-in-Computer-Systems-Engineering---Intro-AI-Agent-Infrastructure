---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:47:57Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/current/akka/stream/scaladsl/package-summary.html
title: akka.stream.scaladsl
---

# akka.stream.scaladsl

## Content

# Package akka.stream.scaladsl

- Interface Summary 
| Interface | Description |
| [DelayStrategy](DelayStrategy.html "interface in akka.stream.scaladsl")\<T\> | Allows to manage delay. |
| --- | --- |
| [FlowOps](FlowOps.html "interface in akka.stream.scaladsl")\<Out,​Mat\> | Scala API: Operations offered by Sources and Flows with a free output side: the DSL flows left\-to\-right only. |
| [FlowOpsMat](FlowOpsMat.html "interface in akka.stream.scaladsl")\<Out,​Mat\> | INTERNAL API: this trait will be changed in binary\-incompatible ways for classes that are derived from it!  Do not implement this interface outside the Akka code base! |
| [FlowWithContextOps](FlowWithContextOps.html "interface in akka.stream.scaladsl")\<Out,​Ctx,​Mat\> | Shared stream operations for [`FlowWithContext`](FlowWithContext.html "class in akka.stream.scaladsl") and [`SourceWithContext`](SourceWithContext.html "class in akka.stream.scaladsl") that automatically propagate a context  element with each data element. |
| [GraphApply](GraphApply.html "interface in akka.stream.scaladsl") |  |
| [ScalaSessionAPI](ScalaSessionAPI.html "interface in akka.stream.scaladsl") | Allows access to an SSLSession with Scala types |
| [SinkQueue](SinkQueue.html "interface in akka.stream.scaladsl")\<T\> | This trait allows to have a queue as a sink for a stream. |
| [SinkQueueWithCancel](SinkQueueWithCancel.html "interface in akka.stream.scaladsl")\<T\> | This trait adds cancel support to [`SinkQueue`](SinkQueue.html "interface in akka.stream.scaladsl"). |
| [SourceQueue](SourceQueue.html "interface in akka.stream.scaladsl")\<T\> | This trait allows to have a queue as a data source for some stream. |
| [SourceQueueWithComplete](SourceQueueWithComplete.html "interface in akka.stream.scaladsl")\<T\> | This trait adds completion support to [`SourceQueue`](SourceQueue.html "interface in akka.stream.scaladsl"). |
| [SubFlow](SubFlow.html "interface in akka.stream.scaladsl")\<Out,​Mat,​F,​C\> | A \&ldquo;stream of streams\&rdquo; sub\-flow of data elements, e.g. |
| [UnzipWithApply](UnzipWithApply.html "interface in akka.stream.scaladsl") |  |
| [UnzipWithApply.UnzipWithCreator](UnzipWithApply.UnzipWithCreator.html "interface in akka.stream.scaladsl")\<In,​Out,​T\> |  |
| [UnzipWithApply.UnzipWithCreator10](UnzipWithApply.UnzipWithCreator10.html "interface in akka.stream.scaladsl")\<In,​A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10\> |  |
| [UnzipWithApply.UnzipWithCreator11](UnzipWithApply.UnzipWithCreator11.html "interface in akka.stream.scaladsl")\<In,​A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11\> |  |
| [UnzipWithApply.UnzipWithCreator12](UnzipWithApply.UnzipWithCreator12.html "interface in akka.stream.scaladsl")\<In,​A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12\> |  |
| [UnzipWithApply.UnzipWithCreator13](UnzipWithApply.UnzipWithCreator13.html "interface in akka.stream.scaladsl")\<In,​A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13\> |  |
| [UnzipWithApply.UnzipWithCreator14](UnzipWithApply.UnzipWithCreator14.html "interface in akka.stream.scaladsl")\<In,​A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14\> |  |
| [UnzipWithApply.UnzipWithCreator15](UnzipWithApply.UnzipWithCreator15.html "interface in akka.stream.scaladsl")\<In,​A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15\> |  |
| [UnzipWithApply.UnzipWithCreator16](UnzipWithApply.UnzipWithCreator16.html "interface in akka.stream.scaladsl")\<In,​A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16\> |  |
| [UnzipWithApply.UnzipWithCreator17](UnzipWithApply.UnzipWithCreator17.html "interface in akka.stream.scaladsl")\<In,​A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​A17\> |  |
| [UnzipWithApply.UnzipWithCreator18](UnzipWithApply.UnzipWithCreator18.html "interface in akka.stream.scaladsl")\<In,​A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​A17,​A18\> |  |
| [UnzipWithApply.UnzipWithCreator19](UnzipWithApply.UnzipWithCreator19.html "interface in akka.stream.scaladsl")\<In,​A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​A17,​A18,​A19\> |  |
| [UnzipWithApply.UnzipWithCreator2](UnzipWithApply.UnzipWithCreator2.html "interface in akka.stream.scaladsl")\<In,​A1,​A2\> |  |
| [UnzipWithApply.UnzipWithCreator20](UnzipWithApply.UnzipWithCreator20.html "interface in akka.stream.scaladsl")\<In,​A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​A17,​A18,​A19,​A20\> |  |
| [UnzipWithApply.UnzipWithCreator21](UnzipWithApply.UnzipWithCreator21.html "interface in akka.stream.scaladsl")\<In,​A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​A17,​A18,​A19,​A20,​A21\> |  |
| [UnzipWithApply.UnzipWithCreator22](UnzipWithApply.UnzipWithCreator22.html "interface in akka.stream.scaladsl")\<In,​A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​A17,​A18,​A19,​A20,​A21,​A22\> |  |
| [UnzipWithApply.UnzipWithCreator3](UnzipWithApply.UnzipWithCreator3.html "interface in akka.stream.scaladsl")\<In,​A1,​A2,​A3\> |  |
| [UnzipWithApply.UnzipWithCreator4](UnzipWithApply.UnzipWithCreator4.html "interface in akka.stream.scaladsl")\<In,​A1,​A2,​A3,​A4\> |  |
| [UnzipWithApply.UnzipWithCreator5](UnzipWithApply.UnzipWithCreator5.html "interface in akka.stream.scaladsl")\<In,​A1,​A2,​A3,​A4,​A5\> |  |
| [UnzipWithApply.UnzipWithCreator6](UnzipWithApply.UnzipWithCreator6.html "interface in akka.stream.scaladsl")\<In,​A1,​A2,​A3,​A4,​A5,​A6\> |  |
| [UnzipWithApply.UnzipWithCreator7](UnzipWithApply.UnzipWithCreator7.html "interface in akka.stream.scaladsl")\<In,​A1,​A2,​A3,​A4,​A5,​A6,​A7\> |  |
| [UnzipWithApply.UnzipWithCreator8](UnzipWithApply.UnzipWithCreator8.html "interface in akka.stream.scaladsl")\<In,​A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8\> |  |
| [UnzipWithApply.UnzipWithCreator9](UnzipWithApply.UnzipWithCreator9.html "interface in akka.stream.scaladsl")\<In,​A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9\> |  |
| [ZipLatestWithApply](ZipLatestWithApply.html "interface in akka.stream.scaladsl") |  |
| [ZipWithApply](ZipWithApply.html "interface in akka.stream.scaladsl") |  |
- Class Summary 
| Class | Description |
| [Balance](Balance.html "class in akka.stream.scaladsl")\<T\> | Fan\-out the stream to several streams. |
| --- | --- |
| [Balance$](Balance$.html "class in akka.stream.scaladsl") |  |
| [BidiFlow](BidiFlow.html "class in akka.stream.scaladsl")\<I1,​O1,​I2,​O2,​Mat\> |  |
| [BidiFlow$](BidiFlow$.html "class in akka.stream.scaladsl") |  |
| [Broadcast](Broadcast.html "class in akka.stream.scaladsl")\<T\> | Fan\-out the stream to several streams emitting each incoming upstream element to all downstream consumers. |
| [Broadcast$](Broadcast$.html "class in akka.stream.scaladsl") |  |
| [BroadcastHub$](BroadcastHub$.html "class in akka.stream.scaladsl") | A BroadcastHub is a special streaming hub that is able to broadcast streamed elements to a dynamic set of consumers. |
| [Compression](Compression.html "class in akka.stream.scaladsl") |  |
| [Compression$](Compression$.html "class in akka.stream.scaladsl") |  |
| [Concat](Concat.html "class in akka.stream.scaladsl")\<T\> | Takes multiple streams and outputs one stream formed from the input streams  by first emitting all of the elements from the first stream and then emitting  all of the elements from the second stream, etc. |
| [Concat$](Concat$.html "class in akka.stream.scaladsl") |  |
| [DelayStrategy$](DelayStrategy$.html "class in akka.stream.scaladsl") |  |
| [FileIO](FileIO.html "class in akka.stream.scaladsl") | Factories to create sinks and sources from files |
| [FileIO$](FileIO$.html "class in akka.stream.scaladsl") | Factories to create sinks and sources from files |
| [Flow](Flow.html "class in akka.stream.scaladsl")\<In,​Out,​Mat\> | A `Flow` is a set of stream processing steps that has one open input and one open output. |
| [Flow$](Flow$.html "class in akka.stream.scaladsl") |  |
| [FlowWithContext](FlowWithContext.html "class in akka.stream.scaladsl")\<In,​CtxIn,​Out,​CtxOut,​Mat\> | A flow that provides operations which automatically propagate the context of an element. |
| [FlowWithContext$](FlowWithContext$.html "class in akka.stream.scaladsl") |  |
| [Framing](Framing.html "class in akka.stream.scaladsl") |  |
| [Framing$](Framing$.html "class in akka.stream.scaladsl") |  |
| [GraphDSL$](GraphDSL$.html "class in akka.stream.scaladsl") |  |
| [Interleave](Interleave.html "class in akka.stream.scaladsl")\<T\> | Interleave represents deterministic merge which takes N elements per input stream,  in\-order of inputs, emits them downstream and then cycles/"wraps\-around" the inputs. |
| [Interleave$](Interleave$.html "class in akka.stream.scaladsl") |  |
| [JavaFlowSupport](JavaFlowSupport.html "class in akka.stream.scaladsl") | For use only with `JDK 9+`. |
| [JavaFlowSupport.Flow$](JavaFlowSupport.Flow$.html "class in akka.stream.scaladsl") | [`Flow`](Flow.html "class in akka.stream.scaladsl") factories operating with `java.util.concurrent.Flow.*` interfaces. |
| [JavaFlowSupport.Sink$](JavaFlowSupport.Sink$.html "class in akka.stream.scaladsl") | [`Sink`](Sink.html "class in akka.stream.scaladsl") factories operating with `java.util.concurrent.Flow.*` interfaces. |
| [JavaFlowSupport.Source$](JavaFlowSupport.Source$.html "class in akka.stream.scaladsl") | [`Source`](Source.html "class in akka.stream.scaladsl") factories operating with `java.util.concurrent.Flow.*` interfaces. |
| [JavaFlowSupport$](JavaFlowSupport$.html "class in akka.stream.scaladsl") | For use only with `JDK 9+`. |
| [JsonFraming](JsonFraming.html "class in akka.stream.scaladsl") | Provides JSON framing operators that can separate valid JSON objects from incoming `ByteString` objects. |
| [JsonFraming.PartialObjectException$](JsonFraming.PartialObjectException$.html "class in akka.stream.scaladsl") |  |
| [JsonFraming$](JsonFraming$.html "class in akka.stream.scaladsl") | Provides JSON framing operators that can separate valid JSON objects from incoming `ByteString` objects. |
| [Keep](Keep.html "class in akka.stream.scaladsl") | Convenience functions for often\-encountered purposes like keeping only the  left (first) or only the right (second) of two input values. |
| [Keep$](Keep$.html "class in akka.stream.scaladsl") | Convenience functions for often\-encountered purposes like keeping only the  left (first) or only the right (second) of two input values. |
| [Merge](Merge.html "class in akka.stream.scaladsl")\<T\> | Merge several streams, taking elements as they arrive from input streams  (picking randomly when several have elements ready). |
| [Merge$](Merge$.html "class in akka.stream.scaladsl") |  |
| [MergeHub$](MergeHub$.html "class in akka.stream.scaladsl") | A MergeHub is a special streaming hub that is able to collect streamed elements from a dynamic set of  producers. |
| [MergeLatest](MergeLatest.html "class in akka.stream.scaladsl")\<T,​M\> |  |
| [MergeLatest$](MergeLatest$.html "class in akka.stream.scaladsl") | MergeLatest joins elements from N input streams into stream of lists of size N. |
| [MergePreferred](MergePreferred.html "class in akka.stream.scaladsl")\<T\> | Merge several streams, taking elements as they arrive from input streams  (picking from preferred when several have elements ready). |
| [MergePreferred.MergePreferredShape](MergePreferred.MergePreferredShape.html "class in akka.stream.scaladsl")\<T\> |  |
| [MergePreferred$](MergePreferred$.html "class in akka.stream.scaladsl") |  |
| [MergePrioritized](MergePrioritized.html "class in akka.stream.scaladsl")\<T\> | Merge several streams, taking elements as they arrive from input streams  (picking from prioritized once when several have elements ready). |
| [MergePrioritized$](MergePrioritized$.html "class in akka.stream.scaladsl") |  |
| [MergeSequence](MergeSequence.html "class in akka.stream.scaladsl")\<T\> | Takes multiple streams whose elements in aggregate have a defined linear  sequence with difference 1, starting at 0, and outputs a single stream  containing these elements, in order. |
| [MergeSequence$](MergeSequence$.html "class in akka.stream.scaladsl") |  |
| [MergeSorted](MergeSorted.html "class in akka.stream.scaladsl")\<T\> | Merge two pre\-sorted streams such that the resulting stream is sorted. |
| [OrElse$](OrElse$.html "class in akka.stream.scaladsl") |  |
| [Partition](Partition.html "class in akka.stream.scaladsl")\<T\> | Fan\-out the stream to several streams. |
| [Partition.PartitionOutOfBoundsException$](Partition.PartitionOutOfBoundsException$.html "class in akka.stream.scaladsl") |  |
| [Partition$](Partition$.html "class in akka.stream.scaladsl") |  |
| [PartitionHub$](PartitionHub$.html "class in akka.stream.scaladsl") | A `PartitionHub` is a special streaming hub that is able to route streamed elements to a dynamic set of consumers. |
| [RestartFlow](RestartFlow.html "class in akka.stream.scaladsl") | A RestartFlow wraps a [`Flow`](Flow.html "class in akka.stream.scaladsl") that gets restarted when it completes or fails. |
| [RestartFlow$](RestartFlow$.html "class in akka.stream.scaladsl") | A RestartFlow wraps a [`Flow`](Flow.html "class in akka.stream.scaladsl") that gets restarted when it completes or fails. |
| [RestartSink](RestartSink.html "class in akka.stream.scaladsl") | A RestartSink wraps a [`Sink`](Sink.html "class in akka.stream.scaladsl") that gets restarted when it completes or fails. |
| [RestartSink$](RestartSink$.html "class in akka.stream.scaladsl") | A RestartSink wraps a [`Sink`](Sink.html "class in akka.stream.scaladsl") that gets restarted when it completes or fails. |
| [RestartSource](RestartSource.html "class in akka.stream.scaladsl") | A RestartSource wraps a [`Source`](Source.html "class in akka.stream.scaladsl") that gets restarted when it completes or fails. |
| [RestartSource$](RestartSource$.html "class in akka.stream.scaladsl") | A RestartSource wraps a [`Source`](Source.html "class in akka.stream.scaladsl") that gets restarted when it completes or fails. |
| [RestartSourceWithContext](RestartSourceWithContext.html "class in akka.stream.scaladsl") | A RestartSourceWithContext wraps a [`SourceWithContext`](SourceWithContext.html "class in akka.stream.scaladsl") that gets restarted when it completes or fails. |
| [RestartSourceWithContext$](RestartSourceWithContext$.html "class in akka.stream.scaladsl") | A RestartSourceWithContext wraps a [`SourceWithContext`](SourceWithContext.html "class in akka.stream.scaladsl") that gets restarted when it completes or fails. |
| [RestartWithBackoffFlow](RestartWithBackoffFlow.html "class in akka.stream.scaladsl")\<In,​Out\> |  |
| [RestartWithBackoffFlow.Delay](RestartWithBackoffFlow.Delay.html "class in akka.stream.scaladsl") | Temporary attribute that can override the time a [`RestartWithBackoffFlow`](RestartWithBackoffFlow.html "class in akka.stream.scaladsl") waits  for a failure before cancelling. |
| [RestartWithBackoffFlow.Delay$](RestartWithBackoffFlow.Delay$.html "class in akka.stream.scaladsl") |  |
| [RestartWithBackoffFlow$](RestartWithBackoffFlow$.html "class in akka.stream.scaladsl") |  |
| [RestartWithBackoffLogic](RestartWithBackoffLogic.html "class in akka.stream.scaladsl")\<S extends [Shape](../Shape.html "class in akka.stream")\> | Shared logic for all restart with backoff logics. |
| [RestartWithBackoffSink](RestartWithBackoffSink.html "class in akka.stream.scaladsl")\<T\> |  |
| [RestartWithBackoffSource](RestartWithBackoffSource.html "class in akka.stream.scaladsl")\<T\> |  |
| [RetryFlow](RetryFlow.html "class in akka.stream.scaladsl") |  |
| [RetryFlow$](RetryFlow$.html "class in akka.stream.scaladsl") |  |
| [RunnableGraph](RunnableGraph.html "class in akka.stream.scaladsl")\<Mat\> |  |
| [RunnableGraph$](RunnableGraph$.html "class in akka.stream.scaladsl") |  |
| [ScalaSessionAPI$](ScalaSessionAPI$.html "class in akka.stream.scaladsl") |  |
| [Sink](Sink.html "class in akka.stream.scaladsl")\<In,​Mat\> | A `Sink` is a set of stream processing steps that has one open input. |
| [Sink$](Sink$.html "class in akka.stream.scaladsl") |  |
| [SinkQueueWithCancel.QueueOps](SinkQueueWithCancel.QueueOps.html "class in akka.stream.scaladsl")\<T\> |  |
| [SinkQueueWithCancel.QueueOps$](SinkQueueWithCancel.QueueOps$.html "class in akka.stream.scaladsl") |  |
| [SinkQueueWithCancel$](SinkQueueWithCancel$.html "class in akka.stream.scaladsl") |  |
| [Source](Source.html "class in akka.stream.scaladsl")\<Out,​Mat\> | A `Source` is a set of stream processing steps that has one open output. |
| [Source$](Source$.html "class in akka.stream.scaladsl") |  |
| [SourceQueueWithComplete.QueueOps](SourceQueueWithComplete.QueueOps.html "class in akka.stream.scaladsl")\<T\> |  |
| [SourceQueueWithComplete.QueueOps$](SourceQueueWithComplete.QueueOps$.html "class in akka.stream.scaladsl") |  |
| [SourceQueueWithComplete$](SourceQueueWithComplete$.html "class in akka.stream.scaladsl") |  |
| [SourceWithContext](SourceWithContext.html "class in akka.stream.scaladsl")\<Out,​Ctx,​Mat\> | A source that provides operations which automatically propagate the context of an element. |
| [SourceWithContext$](SourceWithContext$.html "class in akka.stream.scaladsl") |  |
| [StreamConverters](StreamConverters.html "class in akka.stream.scaladsl") | Converters for interacting with the blocking `java.io` streams APIs and Java 8 Streams |
| [StreamConverters$](StreamConverters$.html "class in akka.stream.scaladsl") | Converters for interacting with the blocking `java.io` streams APIs and Java 8 Streams |
| [StreamRefs](StreamRefs.html "class in akka.stream.scaladsl") | Factories for creating stream refs. |
| [StreamRefs$](StreamRefs$.html "class in akka.stream.scaladsl") | Factories for creating stream refs. |
| [Tcp](Tcp.html "class in akka.stream.scaladsl") |  |
| [Tcp.IncomingConnection](Tcp.IncomingConnection.html "class in akka.stream.scaladsl") | Represents an accepted incoming TCP connection. |
| [Tcp.IncomingConnection$](Tcp.IncomingConnection$.html "class in akka.stream.scaladsl") |  |
| [Tcp.OutgoingConnection](Tcp.OutgoingConnection.html "class in akka.stream.scaladsl") | Represents a prospective outgoing TCP connection. |
| [Tcp.OutgoingConnection$](Tcp.OutgoingConnection$.html "class in akka.stream.scaladsl") |  |
| [Tcp.ServerBinding](Tcp.ServerBinding.html "class in akka.stream.scaladsl") | Represents a successful TCP server binding. |
| [Tcp.ServerBinding$](Tcp.ServerBinding$.html "class in akka.stream.scaladsl") |  |
| [Tcp$](Tcp$.html "class in akka.stream.scaladsl") |  |
| [TcpAttributes](TcpAttributes.html "class in akka.stream.scaladsl") |  |
| [TcpAttributes.TcpWriteBufferSize](TcpAttributes.TcpWriteBufferSize.html "class in akka.stream.scaladsl") |  |
| [TcpAttributes.TcpWriteBufferSize$](TcpAttributes.TcpWriteBufferSize$.html "class in akka.stream.scaladsl") |  |
| [TcpAttributes$](TcpAttributes$.html "class in akka.stream.scaladsl") |  |
| [ThrottleControl](ThrottleControl.html "class in akka.stream.scaladsl") | Control the throttle rate from the outside of the stream, or share a common throttle rate  across several streams. |
| [TLS](TLS.html "class in akka.stream.scaladsl") | Stream cipher support based upon JSSE. |
| [TLS$](TLS$.html "class in akka.stream.scaladsl") | Stream cipher support based upon JSSE. |
| [TLSPlacebo](TLSPlacebo.html "class in akka.stream.scaladsl") | This object holds simple wrapping [`BidiFlow`](BidiFlow.html "class in akka.stream.scaladsl") implementations that can  be used instead of [`TLS`](TLS.html "class in akka.stream.scaladsl") when no encryption is desired. |
| [TLSPlacebo$](TLSPlacebo$.html "class in akka.stream.scaladsl") | This object holds simple wrapping [`BidiFlow`](BidiFlow.html "class in akka.stream.scaladsl") implementations that can  be used instead of [`TLS`](TLS.html "class in akka.stream.scaladsl") when no encryption is desired. |
| [Unzip](Unzip.html "class in akka.stream.scaladsl")\<A,​B\> | Takes a stream of pair elements and splits each pair to two output streams. |
| [Unzip$](Unzip$.html "class in akka.stream.scaladsl") | Takes a stream of pair elements and splits each pair to two output streams. |
| [UnzipWith](UnzipWith.html "class in akka.stream.scaladsl") | Transforms each element of input stream into multiple streams using a splitter function. |
| [UnzipWith$](UnzipWith$.html "class in akka.stream.scaladsl") | Transforms each element of input stream into multiple streams using a splitter function. |
| [UnzipWith10](UnzipWith10.html "class in akka.stream.scaladsl")\<In,​A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10\> | \`UnzipWith\` specialized for 10 outputs |
| [UnzipWith11](UnzipWith11.html "class in akka.stream.scaladsl")\<In,​A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11\> | \`UnzipWith\` specialized for 11 outputs |
| [UnzipWith12](UnzipWith12.html "class in akka.stream.scaladsl")\<In,​A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12\> | \`UnzipWith\` specialized for 12 outputs |
| [UnzipWith13](UnzipWith13.html "class in akka.stream.scaladsl")\<In,​A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13\> | \`UnzipWith\` specialized for 13 outputs |
| [UnzipWith14](UnzipWith14.html "class in akka.stream.scaladsl")\<In,​A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14\> | \`UnzipWith\` specialized for 14 outputs |
| [UnzipWith15](UnzipWith15.html "class in akka.stream.scaladsl")\<In,​A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15\> | \`UnzipWith\` specialized for 15 outputs |
| [UnzipWith16](UnzipWith16.html "class in akka.stream.scaladsl")\<In,​A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16\> | \`UnzipWith\` specialized for 16 outputs |
| [UnzipWith17](UnzipWith17.html "class in akka.stream.scaladsl")\<In,​A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​A17\> | \`UnzipWith\` specialized for 17 outputs |
| [UnzipWith18](UnzipWith18.html "class in akka.stream.scaladsl")\<In,​A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​A17,​A18\> | \`UnzipWith\` specialized for 18 outputs |
| [UnzipWith19](UnzipWith19.html "class in akka.stream.scaladsl")\<In,​A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​A17,​A18,​A19\> | \`UnzipWith\` specialized for 19 outputs |
| [UnzipWith2](UnzipWith2.html "class in akka.stream.scaladsl")\<In,​A1,​A2\> | \`UnzipWith\` specialized for 2 outputs |
| [UnzipWith20](UnzipWith20.html "class in akka.stream.scaladsl")\<In,​A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​A17,​A18,​A19,​A20\> | \`UnzipWith\` specialized for 20 outputs |
| [UnzipWith21](UnzipWith21.html "class in akka.stream.scaladsl")\<In,​A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​A17,​A18,​A19,​A20,​A21\> | \`UnzipWith\` specialized for 21 outputs |
| [UnzipWith22](UnzipWith22.html "class in akka.stream.scaladsl")\<In,​A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​A17,​A18,​A19,​A20,​A21,​A22\> | \`UnzipWith\` specialized for 22 outputs |
| [UnzipWith3](UnzipWith3.html "class in akka.stream.scaladsl")\<In,​A1,​A2,​A3\> | \`UnzipWith\` specialized for 3 outputs |
| [UnzipWith4](UnzipWith4.html "class in akka.stream.scaladsl")\<In,​A1,​A2,​A3,​A4\> | \`UnzipWith\` specialized for 4 outputs |
| [UnzipWith5](UnzipWith5.html "class in akka.stream.scaladsl")\<In,​A1,​A2,​A3,​A4,​A5\> | \`UnzipWith\` specialized for 5 outputs |
| [UnzipWith6](UnzipWith6.html "class in akka.stream.scaladsl")\<In,​A1,​A2,​A3,​A4,​A5,​A6\> | \`UnzipWith\` specialized for 6 outputs |
| [UnzipWith7](UnzipWith7.html "class in akka.stream.scaladsl")\<In,​A1,​A2,​A3,​A4,​A5,​A6,​A7\> | \`UnzipWith\` specialized for 7 outputs |
| [UnzipWith8](UnzipWith8.html "class in akka.stream.scaladsl")\<In,​A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8\> | \`UnzipWith\` specialized for 8 outputs |
| [UnzipWith9](UnzipWith9.html "class in akka.stream.scaladsl")\<In,​A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9\> | \`UnzipWith\` specialized for 9 outputs |
| [UnzipWithApply.UnzipWithCreatorObject10$](UnzipWithApply.UnzipWithCreatorObject10$.html "class in akka.stream.scaladsl") |  |
| [UnzipWithApply.UnzipWithCreatorObject11$](UnzipWithApply.UnzipWithCreatorObject11$.html "class in akka.stream.scaladsl") |  |
| [UnzipWithApply.UnzipWithCreatorObject12$](UnzipWithApply.UnzipWithCreatorObject12$.html "class in akka.stream.scaladsl") |  |
| [UnzipWithApply.UnzipWithCreatorObject13$](UnzipWithApply.UnzipWithCreatorObject13$.html "class in akka.stream.scaladsl") |  |
| [UnzipWithApply.UnzipWithCreatorObject14$](UnzipWithApply.UnzipWithCreatorObject14$.html "class in akka.stream.scaladsl") |  |
| [UnzipWithApply.UnzipWithCreatorObject15$](UnzipWithApply.UnzipWithCreatorObject15$.html "class in akka.stream.scaladsl") |  |
| [UnzipWithApply.UnzipWithCreatorObject16$](UnzipWithApply.UnzipWithCreatorObject16$.html "class in akka.stream.scaladsl") |  |
| [UnzipWithApply.UnzipWithCreatorObject17$](UnzipWithApply.UnzipWithCreatorObject17$.html "class in akka.stream.scaladsl") |  |
| [UnzipWithApply.UnzipWithCreatorObject18$](UnzipWithApply.UnzipWithCreatorObject18$.html "class in akka.stream.scaladsl") |  |
| [UnzipWithApply.UnzipWithCreatorObject19$](UnzipWithApply.UnzipWithCreatorObject19$.html "class in akka.stream.scaladsl") |  |
| [UnzipWithApply.UnzipWithCreatorObject2$](UnzipWithApply.UnzipWithCreatorObject2$.html "class in akka.stream.scaladsl") |  |
| [UnzipWithApply.UnzipWithCreatorObject20$](UnzipWithApply.UnzipWithCreatorObject20$.html "class in akka.stream.scaladsl") |  |
| [UnzipWithApply.UnzipWithCreatorObject21$](UnzipWithApply.UnzipWithCreatorObject21$.html "class in akka.stream.scaladsl") |  |
| [UnzipWithApply.UnzipWithCreatorObject22$](UnzipWithApply.UnzipWithCreatorObject22$.html "class in akka.stream.scaladsl") |  |
| [UnzipWithApply.UnzipWithCreatorObject3$](UnzipWithApply.UnzipWithCreatorObject3$.html "class in akka.stream.scaladsl") |  |
| [UnzipWithApply.UnzipWithCreatorObject4$](UnzipWithApply.UnzipWithCreatorObject4$.html "class in akka.stream.scaladsl") |  |
| [UnzipWithApply.UnzipWithCreatorObject5$](UnzipWithApply.UnzipWithCreatorObject5$.html "class in akka.stream.scaladsl") |  |
| [UnzipWithApply.UnzipWithCreatorObject6$](UnzipWithApply.UnzipWithCreatorObject6$.html "class in akka.stream.scaladsl") |  |
| [UnzipWithApply.UnzipWithCreatorObject7$](UnzipWithApply.UnzipWithCreatorObject7$.html "class in akka.stream.scaladsl") |  |
| [UnzipWithApply.UnzipWithCreatorObject8$](UnzipWithApply.UnzipWithCreatorObject8$.html "class in akka.stream.scaladsl") |  |
| [UnzipWithApply.UnzipWithCreatorObject9$](UnzipWithApply.UnzipWithCreatorObject9$.html "class in akka.stream.scaladsl") |  |
| [UnzipWithApply$](UnzipWithApply$.html "class in akka.stream.scaladsl") |  |
| [WireTap$](WireTap$.html "class in akka.stream.scaladsl") |  |
| [Zip](Zip.html "class in akka.stream.scaladsl")\<A,​B\> | Combine the elements of 2 streams into a stream of tuples. |
| [Zip$](Zip$.html "class in akka.stream.scaladsl") |  |
| [ZipLatest](ZipLatest.html "class in akka.stream.scaladsl")\<A,​B\> | Combine the elements of 2 streams into a stream of tuples, picking always the latest element of each. |
| [ZipLatest$](ZipLatest$.html "class in akka.stream.scaladsl") |  |
| [ZipLatestWith](ZipLatestWith.html "class in akka.stream.scaladsl") | Combine the elements of multiple streams into a stream of combined elements using a combiner function,  picking always the latest of the elements of each source. |
| [ZipLatestWith$](ZipLatestWith$.html "class in akka.stream.scaladsl") | Combine the elements of multiple streams into a stream of combined elements using a combiner function,  picking always the latest of the elements of each source. |
| [ZipLatestWith10](ZipLatestWith10.html "class in akka.stream.scaladsl")\<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​O\> | \`ZipLatestWith\` specialized for 10 inputs |
| [ZipLatestWith11](ZipLatestWith11.html "class in akka.stream.scaladsl")\<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​O\> | \`ZipLatestWith\` specialized for 11 inputs |
| [ZipLatestWith12](ZipLatestWith12.html "class in akka.stream.scaladsl")\<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​O\> | \`ZipLatestWith\` specialized for 12 inputs |
| [ZipLatestWith13](ZipLatestWith13.html "class in akka.stream.scaladsl")\<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​O\> | \`ZipLatestWith\` specialized for 13 inputs |
| [ZipLatestWith14](ZipLatestWith14.html "class in akka.stream.scaladsl")\<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​O\> | \`ZipLatestWith\` specialized for 14 inputs |
| [ZipLatestWith15](ZipLatestWith15.html "class in akka.stream.scaladsl")\<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​O\> | \`ZipLatestWith\` specialized for 15 inputs |
| [ZipLatestWith16](ZipLatestWith16.html "class in akka.stream.scaladsl")\<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​O\> | \`ZipLatestWith\` specialized for 16 inputs |
| [ZipLatestWith17](ZipLatestWith17.html "class in akka.stream.scaladsl")\<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​A17,​O\> | \`ZipLatestWith\` specialized for 17 inputs |
| [ZipLatestWith18](ZipLatestWith18.html "class in akka.stream.scaladsl")\<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​A17,​A18,​O\> | \`ZipLatestWith\` specialized for 18 inputs |
| [ZipLatestWith19](ZipLatestWith19.html "class in akka.stream.scaladsl")\<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​A17,​A18,​A19,​O\> | \`ZipLatestWith\` specialized for 19 inputs |
| [ZipLatestWith2](ZipLatestWith2.html "class in akka.stream.scaladsl")\<A1,​A2,​O\> | \`ZipLatestWith\` specialized for 2 inputs |
| [ZipLatestWith20](ZipLatestWith20.html "class in akka.stream.scaladsl")\<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​A17,​A18,​A19,​A20,​O\> | \`ZipLatestWith\` specialized for 20 inputs |
| [ZipLatestWith21](ZipLatestWith21.html "class in akka.stream.scaladsl")\<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​A17,​A18,​A19,​A20,​A21,​O\> | \`ZipLatestWith\` specialized for 21 inputs |
| [ZipLatestWith22](ZipLatestWith22.html "class in akka.stream.scaladsl")\<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​A17,​A18,​A19,​A20,​A21,​A22,​O\> | \`ZipLatestWith\` specialized for 22 inputs |
| [ZipLatestWith3](ZipLatestWith3.html "class in akka.stream.scaladsl")\<A1,​A2,​A3,​O\> | \`ZipLatestWith\` specialized for 3 inputs |
| [ZipLatestWith4](ZipLatestWith4.html "class in akka.stream.scaladsl")\<A1,​A2,​A3,​A4,​O\> | \`ZipLatestWith\` specialized for 4 inputs |
| [ZipLatestWith5](ZipLatestWith5.html "class in akka.stream.scaladsl")\<A1,​A2,​A3,​A4,​A5,​O\> | \`ZipLatestWith\` specialized for 5 inputs |
| [ZipLatestWith6](ZipLatestWith6.html "class in akka.stream.scaladsl")\<A1,​A2,​A3,​A4,​A5,​A6,​O\> | \`ZipLatestWith\` specialized for 6 inputs |
| [ZipLatestWith7](ZipLatestWith7.html "class in akka.stream.scaladsl")\<A1,​A2,​A3,​A4,​A5,​A6,​A7,​O\> | \`ZipLatestWith\` specialized for 7 inputs |
| [ZipLatestWith8](ZipLatestWith8.html "class in akka.stream.scaladsl")\<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​O\> | \`ZipLatestWith\` specialized for 8 inputs |
| [ZipLatestWith9](ZipLatestWith9.html "class in akka.stream.scaladsl")\<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​O\> | \`ZipLatestWith\` specialized for 9 inputs |
| [ZipN](ZipN.html "class in akka.stream.scaladsl")\<A\> | Combine the elements of multiple streams into a stream of sequences. |
| [ZipN$](ZipN$.html "class in akka.stream.scaladsl") |  |
| [ZipWith](ZipWith.html "class in akka.stream.scaladsl") | Combine the elements of multiple streams into a stream of combined elements using a combiner function. |
| [ZipWith$](ZipWith$.html "class in akka.stream.scaladsl") | Combine the elements of multiple streams into a stream of combined elements using a combiner function. |
| [ZipWith10](ZipWith10.html "class in akka.stream.scaladsl")\<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​O\> | \`ZipWith\` specialized for 10 inputs |
| [ZipWith11](ZipWith11.html "class in akka.stream.scaladsl")\<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​O\> | \`ZipWith\` specialized for 11 inputs |
| [ZipWith12](ZipWith12.html "class in akka.stream.scaladsl")\<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​O\> | \`ZipWith\` specialized for 12 inputs |
| [ZipWith13](ZipWith13.html "class in akka.stream.scaladsl")\<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​O\> | \`ZipWith\` specialized for 13 inputs |
| [ZipWith14](ZipWith14.html "class in akka.stream.scaladsl")\<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​O\> | \`ZipWith\` specialized for 14 inputs |
| [ZipWith15](ZipWith15.html "class in akka.stream.scaladsl")\<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​O\> | \`ZipWith\` specialized for 15 inputs |
| [ZipWith16](ZipWith16.html "class in akka.stream.scaladsl")\<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​O\> | \`ZipWith\` specialized for 16 inputs |
| [ZipWith17](ZipWith17.html "class in akka.stream.scaladsl")\<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​A17,​O\> | \`ZipWith\` specialized for 17 inputs |
| [ZipWith18](ZipWith18.html "class in akka.stream.scaladsl")\<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​A17,​A18,​O\> | \`ZipWith\` specialized for 18 inputs |
| [ZipWith19](ZipWith19.html "class in akka.stream.scaladsl")\<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​A17,​A18,​A19,​O\> | \`ZipWith\` specialized for 19 inputs |
| [ZipWith2](ZipWith2.html "class in akka.stream.scaladsl")\<A1,​A2,​O\> | \`ZipWith\` specialized for 2 inputs |
| [ZipWith20](ZipWith20.html "class in akka.stream.scaladsl")\<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​A17,​A18,​A19,​A20,​O\> | \`ZipWith\` specialized for 20 inputs |
| [ZipWith21](ZipWith21.html "class in akka.stream.scaladsl")\<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​A17,​A18,​A19,​A20,​A21,​O\> | \`ZipWith\` specialized for 21 inputs |
| [ZipWith22](ZipWith22.html "class in akka.stream.scaladsl")\<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​A17,​A18,​A19,​A20,​A21,​A22,​O\> | \`ZipWith\` specialized for 22 inputs |
| [ZipWith3](ZipWith3.html "class in akka.stream.scaladsl")\<A1,​A2,​A3,​O\> | \`ZipWith\` specialized for 3 inputs |
| [ZipWith4](ZipWith4.html "class in akka.stream.scaladsl")\<A1,​A2,​A3,​A4,​O\> | \`ZipWith\` specialized for 4 inputs |
| [ZipWith5](ZipWith5.html "class in akka.stream.scaladsl")\<A1,​A2,​A3,​A4,​A5,​O\> | \`ZipWith\` specialized for 5 inputs |
| [ZipWith6](ZipWith6.html "class in akka.stream.scaladsl")\<A1,​A2,​A3,​A4,​A5,​A6,​O\> | \`ZipWith\` specialized for 6 inputs |
| [ZipWith7](ZipWith7.html "class in akka.stream.scaladsl")\<A1,​A2,​A3,​A4,​A5,​A6,​A7,​O\> | \`ZipWith\` specialized for 7 inputs |
| [ZipWith8](ZipWith8.html "class in akka.stream.scaladsl")\<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​O\> | \`ZipWith\` specialized for 8 inputs |
| [ZipWith9](ZipWith9.html "class in akka.stream.scaladsl")\<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​O\> | \`ZipWith\` specialized for 9 inputs |
| [ZipWithN](ZipWithN.html "class in akka.stream.scaladsl")\<A,​O\> | Combine the elements of multiple streams into a stream of sequences using a combiner function. |
| [ZipWithN$](ZipWithN$.html "class in akka.stream.scaladsl") |  |
- Exception Summary 
| Exception | Description |
| [Framing.FramingException](Framing.FramingException.html "class in akka.stream.scaladsl") |  |
| --- | --- |
| [JsonFraming.PartialObjectException](JsonFraming.PartialObjectException.html "class in akka.stream.scaladsl") | Thrown if upstream completes with a partial object in the buffer. |
| [Partition.PartitionOutOfBoundsException](Partition.PartitionOutOfBoundsException.html "class in akka.stream.scaladsl") |  |
| [TcpIdleTimeoutException](TcpIdleTimeoutException.html "class in akka.stream.scaladsl") |  |

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/current/akka/stream/Shape.html
- https://doc.akka.io/japi/akka-core/current/akka/stream/scaladsl/Balance$.html
- https://doc.akka.io/japi/akka-core/current/akka/stream/scaladsl/Balance.html
- https://doc.akka.io/japi/akka-core/current/akka/stream/scaladsl/BidiFlow$.html
- https://doc.akka.io/japi/akka-core/current/akka/stream/scaladsl/BidiFlow.html
- https://doc.akka.io/japi/akka-core/current/akka/stream/scaladsl/Broadcast$.html
- https://doc.akka.io/japi/akka-core/current/akka/stream/scaladsl/Broadcast.html
- https://doc.akka.io/japi/akka-core/current/akka/stream/scaladsl/BroadcastHub$.html
- https://doc.akka.io/japi/akka-core/current/akka/stream/scaladsl/Compression$.html
- https://doc.akka.io/japi/akka-core/current/akka/stream/scaladsl/Compression.html
- https://doc.akka.io/japi/akka-core/current/akka/stream/scaladsl/Concat$.html
- https://doc.akka.io/japi/akka-core/current/akka/stream/scaladsl/Concat.html
- https://doc.akka.io/japi/akka-core/current/akka/stream/scaladsl/DelayStrategy$.html
- https://doc.akka.io/japi/akka-core/current/akka/stream/scaladsl/DelayStrategy.html
- https://doc.akka.io/japi/akka-core/current/akka/stream/scaladsl/FileIO$.html
- https://doc.akka.io/japi/akka-core/current/akka/stream/scaladsl/FileIO.html
- https://doc.akka.io/japi/akka-core/current/akka/stream/scaladsl/Flow$.html
- https://doc.akka.io/japi/akka-core/current/akka/stream/scaladsl/Flow.html
- https://doc.akka.io/japi/akka-core/current/akka/stream/scaladsl/FlowOps.html
- https://doc.akka.io/japi/akka-core/current/akka/stream/scaladsl/FlowOpsMat.html
- https://doc.akka.io/japi/akka-core/current/akka/stream/scaladsl/FlowWithContext$.html
- https://doc.akka.io/japi/akka-core/current/akka/stream/scaladsl/FlowWithContext.html
- https://doc.akka.io/japi/akka-core/current/akka/stream/scaladsl/FlowWithContextOps.html
- https://doc.akka.io/japi/akka-core/current/akka/stream/scaladsl/Framing$.html
- https://doc.akka.io/japi/akka-core/current/akka/stream/scaladsl/Framing.FramingException.html
- https://doc.akka.io/japi/akka-core/current/akka/stream/scaladsl/Framing.html
- https://doc.akka.io/japi/akka-core/current/akka/stream/scaladsl/GraphApply.html
- https://doc.akka.io/japi/akka-core/current/akka/stream/scaladsl/GraphDSL$.html
- https://doc.akka.io/japi/akka-core/current/akka/stream/scaladsl/Interleave$.html
- https://doc.akka.io/japi/akka-core/current/akka/stream/scaladsl/Interleave.html
- https://doc.akka.io/japi/akka-core/current/akka/stream/scaladsl/JavaFlowSupport$.html
- https://doc.akka.io/japi/akka-core/current/akka/stream/scaladsl/JavaFlowSupport.Flow$.html
- https://doc.akka.io/japi/akka-core/current/akka/stream/scaladsl/JavaFlowSupport.Sink$.html
- https://doc.akka.io/japi/akka-core/current/akka/stream/scaladsl/JavaFlowSupport.Source$.html
- https://doc.akka.io/japi/akka-core/current/akka/stream/scaladsl/JavaFlowSupport.html
- https://doc.akka.io/japi/akka-core/current/akka/stream/scaladsl/JsonFraming$.html
- https://doc.akka.io/japi/akka-core/current/akka/stream/scaladsl/JsonFraming.PartialObjectException$.html
- https://doc.akka.io/japi/akka-core/current/akka/stream/scaladsl/JsonFraming.PartialObjectException.html
- https://doc.akka.io/japi/akka-core/current/akka/stream/scaladsl/JsonFraming.html
- https://doc.akka.io/japi/akka-core/current/akka/stream/scaladsl/Keep$.html
- https://doc.akka.io/japi/akka-core/current/akka/stream/scaladsl/Keep.html
- https://doc.akka.io/japi/akka-core/current/akka/stream/scaladsl/Merge$.html
- https://doc.akka.io/japi/akka-core/current/akka/stream/scaladsl/Merge.html
- https://doc.akka.io/japi/akka-core/current/akka/stream/scaladsl/MergeHub$.html
- https://doc.akka.io/japi/akka-core/current/akka/stream/scaladsl/MergeLatest$.html
- https://doc.akka.io/japi/akka-core/current/akka/stream/scaladsl/MergeLatest.html
- https://doc.akka.io/japi/akka-core/current/akka/stream/scaladsl/MergePreferred$.html
- https://doc.akka.io/japi/akka-core/current/akka/stream/scaladsl/MergePreferred.MergePreferredShape.html
- https://doc.akka.io/japi/akka-core/current/akka/stream/scaladsl/MergePreferred.html
- https://doc.akka.io/japi/akka-core/current/akka/stream/scaladsl/MergePrioritized$.html

---
*Source: [https://doc.akka.io/japi/akka-core/current/akka/stream/scaladsl/package-summary.html](https://doc.akka.io/japi/akka-core/current/akka/stream/scaladsl/package-summary.html)*