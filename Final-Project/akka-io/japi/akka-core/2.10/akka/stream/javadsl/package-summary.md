---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:35:21Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/package-summary.html
title: akka.stream.javadsl
---

# akka.stream.javadsl

## Content

# Package akka.stream.javadsl

- Interface Summary 
| Interface | Description |
| [DelayStrategy](DelayStrategy.html "interface in akka.stream.javadsl")\<T\> | Allows to manage delay and can be stateful to compute delay for any sequence of elements,  all elements go through nextDelay() updating state and returning delay for each element |
| --- | --- |
| [MergeHub.DrainingControl](MergeHub.DrainingControl.html "interface in akka.stream.javadsl") | A DrainingControl object is created during the materialization of a MergeHub and allows to initiate the draining  and eventual completion of the Hub from the outside. |
| [PartitionHub.ConsumerInfo](PartitionHub.ConsumerInfo.html "interface in akka.stream.javadsl") |  |
| [SinkQueue](SinkQueue.html "interface in akka.stream.javadsl")\<T\> | This trait allows to have a queue as a sink for a stream. |
| [SinkQueueWithCancel](SinkQueueWithCancel.html "interface in akka.stream.javadsl")\<T\> | This trait adds cancel support to [`SinkQueue`](SinkQueue.html "interface in akka.stream.javadsl"). |
| [SourceQueue](SourceQueue.html "interface in akka.stream.javadsl")\<T\> | This trait allows to have a queue as a data source for some stream. |
| [SourceQueueWithComplete](SourceQueueWithComplete.html "interface in akka.stream.javadsl")\<T\> | This trait adds completion support to [`SourceQueue`](SourceQueue.html "interface in akka.stream.javadsl"). |
- Class Summary 
| Class | Description |
| [Balance](Balance.html "class in akka.stream.javadsl") | Fan\-out the stream to several streams. |
| --- | --- |
| [Balance$](Balance$.html "class in akka.stream.javadsl") | Fan\-out the stream to several streams. |
| [BidiFlow](BidiFlow.html "class in akka.stream.javadsl")\<I1,​O1,​I2,​O2,​Mat\> |  |
| [BidiFlow$](BidiFlow$.html "class in akka.stream.javadsl") |  |
| [Broadcast](Broadcast.html "class in akka.stream.javadsl") | Fan\-out the stream to several streams. |
| [Broadcast$](Broadcast$.html "class in akka.stream.javadsl") | Fan\-out the stream to several streams. |
| [BroadcastHub](BroadcastHub.html "class in akka.stream.javadsl") | A BroadcastHub is a special streaming hub that is able to broadcast streamed elements to a dynamic set of consumers. |
| [BroadcastHub$](BroadcastHub$.html "class in akka.stream.javadsl") | A BroadcastHub is a special streaming hub that is able to broadcast streamed elements to a dynamic set of consumers. |
| [Compression](Compression.html "class in akka.stream.javadsl") |  |
| [Compression$](Compression$.html "class in akka.stream.javadsl") |  |
| [Concat](Concat.html "class in akka.stream.javadsl") | Takes two streams and outputs an output stream formed from the two input streams  by consuming one stream first emitting all of its elements, then consuming the  second stream emitting all of its elements. |
| [Concat$](Concat$.html "class in akka.stream.javadsl") | Takes two streams and outputs an output stream formed from the two input streams  by consuming one stream first emitting all of its elements, then consuming the  second stream emitting all of its elements. |
| [DelayStrategy$](DelayStrategy$.html "class in akka.stream.javadsl") |  |
| [FileIO](FileIO.html "class in akka.stream.javadsl") | Java API: Factories to create sinks and sources from files |
| [FileIO$](FileIO$.html "class in akka.stream.javadsl") | Java API: Factories to create sinks and sources from files |
| [Flow](Flow.html "class in akka.stream.javadsl")\<In,​Out,​Mat\> | A `Flow` is a set of stream processing steps that has one open input and one open output. |
| [Flow$](Flow$.html "class in akka.stream.javadsl") |  |
| [FlowWithContext](FlowWithContext.html "class in akka.stream.javadsl")\<In,​CtxIn,​Out,​CtxOut,​Mat\> | A flow that provides operations which automatically propagate the context of an element. |
| [FlowWithContext$](FlowWithContext$.html "class in akka.stream.javadsl") |  |
| [Framing](Framing.html "class in akka.stream.javadsl") |  |
| [Framing$](Framing$.html "class in akka.stream.javadsl") |  |
| [GraphDSL](GraphDSL.html "class in akka.stream.javadsl") |  |
| [GraphDSL.Builder](GraphDSL.Builder.html "class in akka.stream.javadsl")\<Mat\> |  |
| [GraphDSL$](GraphDSL$.html "class in akka.stream.javadsl") |  |
| [JavaFlowSupport](JavaFlowSupport.html "class in akka.stream.javadsl") | For use only with \`JDK 9\+\`. |
| [JavaFlowSupport.Flow](JavaFlowSupport.Flow.html "class in akka.stream.javadsl") | {@link akka.stream.javadsl.Flow]] factories operating with `java.util.concurrent.Flow.*` interfaces. |
| [JavaFlowSupport.Sink](JavaFlowSupport.Sink.html "class in akka.stream.javadsl") | [`Sink`](Sink.html "class in akka.stream.javadsl") factories operating with `java.util.concurrent.Flow.*`  interfaces. |
| [JavaFlowSupport.Source](JavaFlowSupport.Source.html "class in akka.stream.javadsl") | {@link akka.stream.javadsl.Flow]] factories operating with `java.util.concurrent.Flow.*` interfaces. |
| [JsonFraming](JsonFraming.html "class in akka.stream.javadsl") | Provides JSON framing operators that can separate valid JSON objects from incoming [`ByteString`](../../util/ByteString.html "class in akka.util") objects. |
| [JsonFraming$](JsonFraming$.html "class in akka.stream.javadsl") | Provides JSON framing operators that can separate valid JSON objects from incoming [`ByteString`](../../util/ByteString.html "class in akka.util") objects. |
| [Keep](Keep.html "class in akka.stream.javadsl") |  |
| [Keep$](Keep$.html "class in akka.stream.javadsl") |  |
| [Merge](Merge.html "class in akka.stream.javadsl") | Merge several streams, taking elements as they arrive from input streams  (picking randomly when several have elements ready). |
| [Merge$](Merge$.html "class in akka.stream.javadsl") | Merge several streams, taking elements as they arrive from input streams  (picking randomly when several have elements ready). |
| [MergeHub](MergeHub.html "class in akka.stream.javadsl") | A MergeHub is a special streaming hub that is able to collect streamed elements from a dynamic set of  producers. |
| [MergeHub$](MergeHub$.html "class in akka.stream.javadsl") | A MergeHub is a special streaming hub that is able to collect streamed elements from a dynamic set of  producers. |
| [MergeLatest](MergeLatest.html "class in akka.stream.javadsl") | MergeLatest joins elements from N input streams into stream of lists of size N. |
| [MergeLatest$](MergeLatest$.html "class in akka.stream.javadsl") | MergeLatest joins elements from N input streams into stream of lists of size N. |
| [MergePreferred](MergePreferred.html "class in akka.stream.javadsl") | Merge several streams, taking elements as they arrive from input streams  (picking from preferred when several have elements ready). |
| [MergePreferred$](MergePreferred$.html "class in akka.stream.javadsl") | Merge several streams, taking elements as they arrive from input streams  (picking from preferred when several have elements ready). |
| [MergePrioritized](MergePrioritized.html "class in akka.stream.javadsl") | Merge several streams, taking elements as they arrive from input streams  (picking from prioritized once when several have elements ready). |
| [MergePrioritized$](MergePrioritized$.html "class in akka.stream.javadsl") | Merge several streams, taking elements as they arrive from input streams  (picking from prioritized once when several have elements ready). |
| [MergeSequence](MergeSequence.html "class in akka.stream.javadsl") | Takes multiple streams whose elements in aggregate have a defined linear  sequence with difference 1, starting at 0, and outputs a single stream  containing these elements, in order. |
| [MergeSequence$](MergeSequence$.html "class in akka.stream.javadsl") | Takes multiple streams whose elements in aggregate have a defined linear  sequence with difference 1, starting at 0, and outputs a single stream  containing these elements, in order. |
| [Partition](Partition.html "class in akka.stream.javadsl") | Fan\-out the stream to several streams. |
| [Partition$](Partition$.html "class in akka.stream.javadsl") | Fan\-out the stream to several streams. |
| [PartitionHub](PartitionHub.html "class in akka.stream.javadsl") | A `PartitionHub` is a special streaming hub that is able to route streamed elements to a dynamic set of consumers. |
| [PartitionHub$](PartitionHub$.html "class in akka.stream.javadsl") | A `PartitionHub` is a special streaming hub that is able to route streamed elements to a dynamic set of consumers. |
| [RestartFlow](RestartFlow.html "class in akka.stream.javadsl") | A RestartFlow wraps a [`Flow`](Flow.html "class in akka.stream.javadsl") that gets restarted when it completes or fails. |
| [RestartFlow$](RestartFlow$.html "class in akka.stream.javadsl") | A RestartFlow wraps a [`Flow`](Flow.html "class in akka.stream.javadsl") that gets restarted when it completes or fails. |
| [RestartSink](RestartSink.html "class in akka.stream.javadsl") | A RestartSink wraps a [`Sink`](Sink.html "class in akka.stream.javadsl") that gets restarted when it completes or fails. |
| [RestartSink$](RestartSink$.html "class in akka.stream.javadsl") | A RestartSink wraps a [`Sink`](Sink.html "class in akka.stream.javadsl") that gets restarted when it completes or fails. |
| [RestartSource](RestartSource.html "class in akka.stream.javadsl") | A RestartSource wraps a [`Source`](Source.html "class in akka.stream.javadsl") that gets restarted when it completes or fails. |
| [RestartSource$](RestartSource$.html "class in akka.stream.javadsl") | A RestartSource wraps a [`Source`](Source.html "class in akka.stream.javadsl") that gets restarted when it completes or fails. |
| [RestartSourceWithContext](RestartSourceWithContext.html "class in akka.stream.javadsl") | A RestartSourceWithContext wraps a [`SourceWithContext`](SourceWithContext.html "class in akka.stream.javadsl") that gets restarted when it completes or fails. |
| [RestartSourceWithContext$](RestartSourceWithContext$.html "class in akka.stream.javadsl") | A RestartSourceWithContext wraps a [`SourceWithContext`](SourceWithContext.html "class in akka.stream.javadsl") that gets restarted when it completes or fails. |
| [RetryFlow](RetryFlow.html "class in akka.stream.javadsl") |  |
| [RetryFlow$](RetryFlow$.html "class in akka.stream.javadsl") |  |
| [RunnableGraph](RunnableGraph.html "class in akka.stream.javadsl")\<Mat\> | Java API |
| [RunnableGraph$](RunnableGraph$.html "class in akka.stream.javadsl") |  |
| [Sink](Sink.html "class in akka.stream.javadsl")\<In,​Mat\> | Java API |
| [Sink$](Sink$.html "class in akka.stream.javadsl") | Java API |
| [SinkQueueWithCancel$](SinkQueueWithCancel$.html "class in akka.stream.javadsl") |  |
| [Source](Source.html "class in akka.stream.javadsl")\<Out,​Mat\> | Java API |
| [Source$](Source$.html "class in akka.stream.javadsl") | Java API |
| [SourceQueueWithComplete$](SourceQueueWithComplete$.html "class in akka.stream.javadsl") |  |
| [SourceWithContext](SourceWithContext.html "class in akka.stream.javadsl")\<Out,​Ctx,​Mat\> | A source that provides operations which automatically propagate the context of an element. |
| [SourceWithContext$](SourceWithContext$.html "class in akka.stream.javadsl") |  |
| [StreamConverters](StreamConverters.html "class in akka.stream.javadsl") | Converters for interacting with the blocking `java.io` streams APIs and Java 8 Streams |
| [StreamConverters$](StreamConverters$.html "class in akka.stream.javadsl") | Converters for interacting with the blocking `java.io` streams APIs and Java 8 Streams |
| [StreamRefs](StreamRefs.html "class in akka.stream.javadsl") | Factories for creating stream refs. |
| [StreamRefs$](StreamRefs$.html "class in akka.stream.javadsl") | Factories for creating stream refs. |
| [SubFlow](SubFlow.html "class in akka.stream.javadsl")\<In,​Out,​Mat\> | A \&ldquo;stream of streams\&rdquo; sub\-flow of data elements, e.g. |
| [SubFlow$](SubFlow$.html "class in akka.stream.javadsl") |  |
| [SubSource](SubSource.html "class in akka.stream.javadsl")\<Out,​Mat\> | A \&ldquo;stream of streams\&rdquo; sub\-flow of data elements, e.g. |
| [SubSource$](SubSource$.html "class in akka.stream.javadsl") | \* Upcast a stream of elements to a stream of supertypes of that element. |
| [Tcp](Tcp.html "class in akka.stream.javadsl") |  |
| [Tcp.IncomingConnection](Tcp.IncomingConnection.html "class in akka.stream.javadsl") | Represents an accepted incoming TCP connection. |
| [Tcp.OutgoingConnection](Tcp.OutgoingConnection.html "class in akka.stream.javadsl") | Represents a prospective outgoing TCP connection. |
| [Tcp.ServerBinding](Tcp.ServerBinding.html "class in akka.stream.javadsl") | Represents a prospective TCP server binding. |
| [Tcp$](Tcp$.html "class in akka.stream.javadsl") |  |
| [ThrottleControl](ThrottleControl.html "class in akka.stream.javadsl") | Control the throttle rate from the outside of the stream, or share a common throttle rate  across several streams. |
| [TLS](TLS.html "class in akka.stream.javadsl") | Stream cipher support based upon JSSE. |
| [TLS$](TLS$.html "class in akka.stream.javadsl") | Stream cipher support based upon JSSE. |
| [TLSPlacebo](TLSPlacebo.html "class in akka.stream.javadsl") | This object holds simple wrapping [`BidiFlow`](../scaladsl/BidiFlow.html "class in akka.stream.scaladsl") implementations that can  be used instead of [`TLS`](TLS.html "class in akka.stream.javadsl") when no encryption is desired. |
| [TLSPlacebo$](TLSPlacebo$.html "class in akka.stream.javadsl") | This object holds simple wrapping [`BidiFlow`](../scaladsl/BidiFlow.html "class in akka.stream.scaladsl") implementations that can  be used instead of [`TLS`](TLS.html "class in akka.stream.javadsl") when no encryption is desired. |
| [Unzip](Unzip.html "class in akka.stream.javadsl") | Takes a stream of pair elements and splits each pair to two output streams. |
| [Unzip$](Unzip$.html "class in akka.stream.javadsl") | Takes a stream of pair elements and splits each pair to two output streams. |
| [UnzipWith](UnzipWith.html "class in akka.stream.javadsl") | Split one stream into several streams using a splitting function. |
| [UnzipWith$](UnzipWith$.html "class in akka.stream.javadsl") | Split one stream into several streams using a splitting function. |
| [Zip](Zip.html "class in akka.stream.javadsl") | Combine the elements of 2 streams into a stream of tuples. |
| [Zip$](Zip$.html "class in akka.stream.javadsl") | Combine the elements of 2 streams into a stream of tuples. |
| [ZipLatest](ZipLatest.html "class in akka.stream.javadsl") | Combine the elements of 2 streams into a stream of tuples, picking always the latest element of each. |
| [ZipLatest$](ZipLatest$.html "class in akka.stream.javadsl") | Combine the elements of 2 streams into a stream of tuples, picking always the latest element of each. |
| [ZipLatestWith](ZipLatestWith.html "class in akka.stream.javadsl") | Combine the elements of multiple streams into a stream of combined elements using a combiner function,  picking always the latest of the elements of each source. |
| [ZipLatestWith$](ZipLatestWith$.html "class in akka.stream.javadsl") | Combine the elements of multiple streams into a stream of combined elements using a combiner function,  picking always the latest of the elements of each source. |
| [ZipN](ZipN.html "class in akka.stream.javadsl") | Combine the elements of multiple streams into a stream of lists. |
| [ZipN$](ZipN$.html "class in akka.stream.javadsl") | Combine the elements of multiple streams into a stream of lists. |
| [ZipWith](ZipWith.html "class in akka.stream.javadsl") | Combine the elements of multiple streams into a stream of combined elements using a combiner function. |
| [ZipWith$](ZipWith$.html "class in akka.stream.javadsl") | Combine the elements of multiple streams into a stream of combined elements using a combiner function. |
| [ZipWithN](ZipWithN.html "class in akka.stream.javadsl") | Combine the elements of multiple streams into a stream of lists using a combiner function. |
| [ZipWithN$](ZipWithN$.html "class in akka.stream.javadsl") | Combine the elements of multiple streams into a stream of lists using a combiner function. |
- Enum Summary 
| Enum | Description |
| [AsPublisher](AsPublisher.html "enum in akka.stream.javadsl") |  |
| --- | --- |
| [FramingTruncation](FramingTruncation.html "enum in akka.stream.javadsl") | Determines mode in which \[\[Framing]] operates. |

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/AsPublisher.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Balance$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Balance.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/BidiFlow$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/BidiFlow.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Broadcast$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Broadcast.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/BroadcastHub$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/BroadcastHub.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Compression$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Compression.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Concat$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Concat.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/DelayStrategy$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/DelayStrategy.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/FileIO$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/FileIO.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/FlowWithContext$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/FlowWithContext.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Framing$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Framing.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/FramingTruncation.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/GraphDSL$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/GraphDSL.Builder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/GraphDSL.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/JavaFlowSupport.Flow.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/JavaFlowSupport.Sink.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/JavaFlowSupport.Source.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/JavaFlowSupport.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/JsonFraming$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/JsonFraming.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Keep$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Keep.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Merge$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Merge.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/MergeHub$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/MergeHub.DrainingControl.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/MergeHub.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/MergeLatest$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/MergeLatest.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/MergePreferred$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/MergePreferred.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/MergePrioritized$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/MergePrioritized.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/MergeSequence$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/MergeSequence.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Partition$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Partition.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/package-summary.html](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/package-summary.html)*