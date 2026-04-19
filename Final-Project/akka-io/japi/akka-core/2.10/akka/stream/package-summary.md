---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:04:57Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/stream/package-summary.html
title: akka.stream
---

# akka.stream

## Content

# Package akka.stream

- Interface Summary 
| Interface | Description |
| [Attributes.Attribute](Attributes.Attribute.html "interface in akka.stream") | Note that more attributes for the [`Materializer`](Materializer.html "class in akka.stream") are defined in [`ActorAttributes`](ActorAttributes.html "class in akka.stream"). |
| --- | --- |
| [Attributes.CancellationStrategy$.Strategy](Attributes.CancellationStrategy$.Strategy.html "interface in akka.stream") | Not for user extension |
| [Attributes.MandatoryAttribute](Attributes.MandatoryAttribute.html "interface in akka.stream") | Attributes that are always present (is defined with default values by the materializer) |
| [BoundedSourceQueue](BoundedSourceQueue.html "interface in akka.stream")\<T\> | A queue of the given size that gives immediate feedback whether an element could be enqueued or not. |
| [CompletionStrategy](CompletionStrategy.html "interface in akka.stream") |  |
| [FanInShape.Init](FanInShape.Init.html "interface in akka.stream")\<O\> |  |
| [FanOutShape.Init](FanOutShape.Init.html "interface in akka.stream")\<I\> |  |
| [FlowMonitor](FlowMonitor.html "interface in akka.stream")\<T\> | Used to monitor the state of a stream |
| [FlowMonitorState.StreamState](FlowMonitorState.StreamState.html "interface in akka.stream")\<U\> |  |
| [Graph](Graph.html "interface in akka.stream")\<S extends [Shape](Shape.html "class in akka.stream"),​M\> | Not intended to be directly extended by user classes |
| [KillSwitch](KillSwitch.html "interface in akka.stream") | A [`KillSwitch`](KillSwitch.html "interface in akka.stream") allows completion of [`Graph`](Graph.html "interface in akka.stream")s from the outside by completing [`Graph`](Graph.html "interface in akka.stream")s of [`FlowShape`](FlowShape.html "class in akka.stream") linked  to the switch. |
| [MaterializerLoggingProvider](MaterializerLoggingProvider.html "interface in akka.stream") | Not for user extension |
| [SinkRef](SinkRef.html "interface in akka.stream")\<In\> | A [`SinkRef`](SinkRef.html "interface in akka.stream") allows sharing a "reference" to a `Sink` with others, with the main purpose of crossing a network boundary. |
| [SourceRef](SourceRef.html "interface in akka.stream")\<T\> | A SourceRef allows sharing a "reference" with others, with the main purpose of crossing a network boundary. |
| [StreamRefAttributes.StreamRefAttribute](StreamRefAttributes.StreamRefAttribute.html "interface in akka.stream") | Attributes specific to stream refs. |
| [StreamRefMessages.ActorRefOrBuilder](StreamRefMessages.ActorRefOrBuilder.html "interface in akka.stream") |  |
| [StreamRefMessages.CumulativeDemandOrBuilder](StreamRefMessages.CumulativeDemandOrBuilder.html "interface in akka.stream") |  |
| [StreamRefMessages.OnSubscribeHandshakeOrBuilder](StreamRefMessages.OnSubscribeHandshakeOrBuilder.html "interface in akka.stream") |  |
| [StreamRefMessages.PayloadOrBuilder](StreamRefMessages.PayloadOrBuilder.html "interface in akka.stream") |  |
| [StreamRefMessages.RemoteStreamCompletedOrBuilder](StreamRefMessages.RemoteStreamCompletedOrBuilder.html "interface in akka.stream") |  |
| [StreamRefMessages.RemoteStreamFailureOrBuilder](StreamRefMessages.RemoteStreamFailureOrBuilder.html "interface in akka.stream") |  |
| [StreamRefMessages.SequencedOnNextOrBuilder](StreamRefMessages.SequencedOnNextOrBuilder.html "interface in akka.stream") |  |
| [StreamRefMessages.SinkRefOrBuilder](StreamRefMessages.SinkRefOrBuilder.html "interface in akka.stream") |  |
| [StreamRefMessages.SourceRefOrBuilder](StreamRefMessages.SourceRefOrBuilder.html "interface in akka.stream") |  |
| [StreamRefResolver](StreamRefResolver.html "interface in akka.stream") | The stream ref resolver provides a way to serialize and deserialize streamrefs in user serializers. |
| [StreamRefSettings](StreamRefSettings.html "interface in akka.stream") | Settings specific to [`SourceRef`](SourceRef.html "interface in akka.stream") and [`SinkRef`](SinkRef.html "interface in akka.stream"). |
| [SubscriptionWithCancelException](SubscriptionWithCancelException.html "interface in akka.stream") | Extension of Subscription that allows to pass a cause when a subscription is cancelled. |
| [Supervision.Directive](Supervision.Directive.html "interface in akka.stream") |  |
| [TLSProtocol.SslTlsInbound](TLSProtocol.SslTlsInbound.html "interface in akka.stream") | This is the supertype of all messages that the SslTls operator emits on the  plaintext side. |
| [TLSProtocol.SslTlsOutbound](TLSProtocol.SslTlsOutbound.html "interface in akka.stream") | This is the supertype of all messages that the SslTls operator accepts on its  plaintext side. |
- Class Summary 
| Class | Description |
| [AbruptIOTerminationException$](AbruptIOTerminationException$.html "class in akka.stream") |  |
| --- | --- |
| [AbruptTerminationException$](AbruptTerminationException$.html "class in akka.stream") |  |
| [AbstractShape](AbstractShape.html "class in akka.stream") | Java API for creating custom [`Shape`](Shape.html "class in akka.stream") types. |
| [ActorAttributes](ActorAttributes.html "class in akka.stream") | Attributes for the [`Materializer`](Materializer.html "class in akka.stream"). |
| [ActorAttributes.DebugLogging](ActorAttributes.DebugLogging.html "class in akka.stream") | Enables additional low level troubleshooting logging at DEBUG log level |
| [ActorAttributes.DebugLogging$](ActorAttributes.DebugLogging$.html "class in akka.stream") |  |
| [ActorAttributes.Dispatcher](ActorAttributes.Dispatcher.html "class in akka.stream") | Configures the dispatcher to be used by streams. |
| [ActorAttributes.Dispatcher$](ActorAttributes.Dispatcher$.html "class in akka.stream") |  |
| [ActorAttributes.FuzzingMode](ActorAttributes.FuzzingMode.html "class in akka.stream") | Test utility: fuzzing mode means that GraphStage events are not processed  in FIFO order within a fused subgraph, but randomized. |
| [ActorAttributes.FuzzingMode$](ActorAttributes.FuzzingMode$.html "class in akka.stream") |  |
| [ActorAttributes.MaxFixedBufferSize](ActorAttributes.MaxFixedBufferSize.html "class in akka.stream") | Configure the maximum buffer size for which a FixedSizeBuffer will be preallocated. |
| [ActorAttributes.MaxFixedBufferSize$](ActorAttributes.MaxFixedBufferSize$.html "class in akka.stream") |  |
| [ActorAttributes.OutputBurstLimit](ActorAttributes.OutputBurstLimit.html "class in akka.stream") | Maximum number of elements emitted in batch if downstream signals large demand. |
| [ActorAttributes.OutputBurstLimit$](ActorAttributes.OutputBurstLimit$.html "class in akka.stream") |  |
| [ActorAttributes.StreamSubscriptionTimeout](ActorAttributes.StreamSubscriptionTimeout.html "class in akka.stream") | Defines a timeout for stream subscription and what action to take when that hits. |
| [ActorAttributes.StreamSubscriptionTimeout$](ActorAttributes.StreamSubscriptionTimeout$.html "class in akka.stream") |  |
| [ActorAttributes.SupervisionStrategy](ActorAttributes.SupervisionStrategy.html "class in akka.stream") |  |
| [ActorAttributes.SupervisionStrategy$](ActorAttributes.SupervisionStrategy$.html "class in akka.stream") |  |
| [ActorAttributes.SyncProcessingLimit](ActorAttributes.SyncProcessingLimit.html "class in akka.stream") | Limit for number of messages that can be processed synchronously in stream to substream communication. |
| [ActorAttributes.SyncProcessingLimit$](ActorAttributes.SyncProcessingLimit$.html "class in akka.stream") |  |
| [ActorAttributes$](ActorAttributes$.html "class in akka.stream") | Attributes for the [`Materializer`](Materializer.html "class in akka.stream"). |
| [ActorMaterializer](ActorMaterializer.html "class in akka.stream") | Deprecated. The Materializer now has all methods the ActorMaterializer used to have. |
| [ActorMaterializer$](ActorMaterializer$.html "class in akka.stream") |  |
| [ActorMaterializerHelper](ActorMaterializerHelper.html "class in akka.stream") | INTERNAL API |
| [ActorMaterializerHelper$](ActorMaterializerHelper$.html "class in akka.stream") | INTERNAL API |
| [ActorMaterializerSettings](ActorMaterializerSettings.html "class in akka.stream") | This class describes the configurable properties of the [`ActorMaterializer`](ActorMaterializer.html "class in akka.stream"). |
| [ActorMaterializerSettings$](ActorMaterializerSettings$.html "class in akka.stream") |  |
| [AmorphousShape](AmorphousShape.html "class in akka.stream") | This type of [`Shape`](Shape.html "class in akka.stream") can express any number of inputs and outputs at the  expense of forgetting about their specific types. |
| [AmorphousShape$](AmorphousShape$.html "class in akka.stream") |  |
| [Attributes](Attributes.html "class in akka.stream") | Holds attributes which can be used to alter [`Flow`](scaladsl/Flow.html "class in akka.stream.scaladsl") / [`Flow`](javadsl/Flow.html "class in akka.stream.javadsl")  or `GraphDSL` / [`GraphDSL`](javadsl/GraphDSL.html "class in akka.stream.javadsl") materialization. |
| [Attributes.AsyncBoundary$](Attributes.AsyncBoundary$.html "class in akka.stream") |  |
| [Attributes.CancellationStrategy](Attributes.CancellationStrategy.html "class in akka.stream") | Cancellation strategies provide a way to configure the behavior of a stage when `cancelStage` is called. |
| [Attributes.CancellationStrategy$](Attributes.CancellationStrategy$.html "class in akka.stream") |  |
| [Attributes.CancellationStrategy$.AfterDelay](Attributes.CancellationStrategy$.AfterDelay.html "class in akka.stream") | Strategy that allows to delay any action when `cancelStage` is invoked. |
| [Attributes.CancellationStrategy$.AfterDelay$](Attributes.CancellationStrategy$.AfterDelay$.html "class in akka.stream") |  |
| [Attributes.CancellationStrategy$.CompleteStage$](Attributes.CancellationStrategy$.CompleteStage$.html "class in akka.stream") | Strategy that treats `cancelStage` the same as `completeStage`, i.e. |
| [Attributes.CancellationStrategy$.FailStage$](Attributes.CancellationStrategy$.FailStage$.html "class in akka.stream") | Strategy that treats `cancelStage` the same as `failStage`, i.e. |
| [Attributes.CancellationStrategy$.PropagateFailure$](Attributes.CancellationStrategy$.PropagateFailure$.html "class in akka.stream") | Strategy that treats `cancelStage` in different ways depending on the cause that was given to the cancellation. |
| [Attributes.InputBuffer](Attributes.InputBuffer.html "class in akka.stream") | Each asynchronous piece of a materialized stream topology is executed by one Actor  that manages an input buffer for all inlets of its shape. |
| [Attributes.InputBuffer$](Attributes.InputBuffer$.html "class in akka.stream") |  |
| [Attributes.LogLevels](Attributes.LogLevels.html "class in akka.stream") |  |
| [Attributes.LogLevels$](Attributes.LogLevels$.html "class in akka.stream") |  |
| [Attributes.Name](Attributes.Name.html "class in akka.stream") |  |
| [Attributes.Name$](Attributes.Name$.html "class in akka.stream") |  |
| [Attributes.NestedMaterializationCancellationPolicy](Attributes.NestedMaterializationCancellationPolicy.html "class in akka.stream") | Nested materialization cancellation strategy provides a way to configure the cancellation behavior of stages that materialize a nested flow. |
| [Attributes.NestedMaterializationCancellationPolicy$](Attributes.NestedMaterializationCancellationPolicy$.html "class in akka.stream") |  |
| [Attributes.SourceLocation](Attributes.SourceLocation.html "class in akka.stream") | Attribute that contains the source location of for example a lambda passed to an operator, useful for example  for debugging. |
| [Attributes.SourceLocation$](Attributes.SourceLocation$.html "class in akka.stream") |  |
| [Attributes$](Attributes$.html "class in akka.stream") | Note that more attributes for the [`Materializer`](Materializer.html "class in akka.stream") are defined in [`ActorAttributes`](ActorAttributes.html "class in akka.stream"). |
| [BidiShape](BidiShape.html "class in akka.stream")\<In1,​Out1,​In2,​Out2\> | A bidirectional flow of elements that consequently has two inputs and two  outputs, arranged like this: |
| [BidiShape$](BidiShape$.html "class in akka.stream") |  |
| [BufferOverflowException$](BufferOverflowException$.html "class in akka.stream") |  |
| [Client](Client.html "class in akka.stream") | The client is usually the side that consumes the service provided by its  interlocutor. |
| [Client$](Client$.html "class in akka.stream") |  |
| [ClosedShape](ClosedShape.html "class in akka.stream") | This [`Shape`](Shape.html "class in akka.stream") is used for graphs that have neither open inputs nor open  outputs. |
| [ClosedShape$](ClosedShape$.html "class in akka.stream") |  |
| [CompletionStrategy.Draining$](CompletionStrategy.Draining$.html "class in akka.stream") | INTERNAL API |
| [CompletionStrategy.Immediately$](CompletionStrategy.Immediately$.html "class in akka.stream") | INTERNAL API |
| [CompletionStrategy$](CompletionStrategy$.html "class in akka.stream") |  |
| [DelayOverflowStrategy](DelayOverflowStrategy.html "class in akka.stream") | Represents a strategy that decides how to deal with a buffer of time based operator  that is full but is about to receive a new element. |
| [DelayOverflowStrategy$](DelayOverflowStrategy$.html "class in akka.stream") |  |
| [EagerClose](EagerClose.html "class in akka.stream") | see [`TLSClosing`](TLSClosing.html "class in akka.stream") |
| [EagerClose$](EagerClose$.html "class in akka.stream") |  |
| [FanInShape](FanInShape.html "class in akka.stream")\<O\> |  |
| [FanInShape.Name](FanInShape.Name.html "class in akka.stream")\<O\> |  |
| [FanInShape.Name$](FanInShape.Name$.html "class in akka.stream") |  |
| [FanInShape.Ports](FanInShape.Ports.html "class in akka.stream")\<O\> |  |
| [FanInShape.Ports$](FanInShape.Ports$.html "class in akka.stream") |  |
| [FanInShape$](FanInShape$.html "class in akka.stream") |  |
| [FanInShape10](FanInShape10.html "class in akka.stream")\<T0,​T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​O\> |  |
| [FanInShape11](FanInShape11.html "class in akka.stream")\<T0,​T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​O\> |  |
| [FanInShape12](FanInShape12.html "class in akka.stream")\<T0,​T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​O\> |  |
| [FanInShape13](FanInShape13.html "class in akka.stream")\<T0,​T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​O\> |  |
| [FanInShape14](FanInShape14.html "class in akka.stream")\<T0,​T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​O\> |  |
| [FanInShape15](FanInShape15.html "class in akka.stream")\<T0,​T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​O\> |  |
| [FanInShape16](FanInShape16.html "class in akka.stream")\<T0,​T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​O\> |  |
| [FanInShape17](FanInShape17.html "class in akka.stream")\<T0,​T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​O\> |  |
| [FanInShape18](FanInShape18.html "class in akka.stream")\<T0,​T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​O\> |  |
| [FanInShape19](FanInShape19.html "class in akka.stream")\<T0,​T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​O\> |  |
| [FanInShape2](FanInShape2.html "class in akka.stream")\<T0,​T1,​O\> |  |
| [FanInShape20](FanInShape20.html "class in akka.stream")\<T0,​T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19,​O\> |  |
| [FanInShape21](FanInShape21.html "class in akka.stream")\<T0,​T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19,​T20,​O\> |  |
| [FanInShape22](FanInShape22.html "class in akka.stream")\<T0,​T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19,​T20,​T21,​O\> |  |
| [FanInShape3](FanInShape3.html "class in akka.stream")\<T0,​T1,​T2,​O\> |  |
| [FanInShape4](FanInShape4.html "class in akka.stream")\<T0,​T1,​T2,​T3,​O\> |  |
| [FanInShape5](FanInShape5.html "class in akka.stream")\<T0,​T1,​T2,​T3,​T4,​O\> |  |
| [FanInShape6](FanInShape6.html "class in akka.stream")\<T0,​T1,​T2,​T3,​T4,​T5,​O\> |  |
| [FanInShape7](FanInShape7.html "class in akka.stream")\<T0,​T1,​T2,​T3,​T4,​T5,​T6,​O\> |  |
| [FanInShape8](FanInShape8.html "class in akka.stream")\<T0,​T1,​T2,​T3,​T4,​T5,​T6,​T7,​O\> |  |
| [FanInShape9](FanInShape9.html "class in akka.stream")\<T0,​T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​O\> |  |
| [FanOutShape](FanOutShape.html "class in akka.stream")\<I\> |  |
| [FanOutShape.Name](FanOutShape.Name.html "class in akka.stream")\<I\> |  |
| [FanOutShape.Name$](FanOutShape.Name$.html "class in akka.stream") |  |
| [FanOutShape.Ports](FanOutShape.Ports.html "class in akka.stream")\<I\> |  |
| [FanOutShape.Ports$](FanOutShape.Ports$.html "class in akka.stream") |  |
| [FanOutShape$](FanOutShape$.html "class in akka.stream") |  |
| [FanOutShape10](FanOutShape10.html "class in akka.stream")\<I,​O0,​O1,​O2,​O3,​O4,​O5,​O6,​O7,​O8,​O9\> |  |
| [FanOutShape11](FanOutShape11.html "class in akka.stream")\<I,​O0,​O1,​O2,​O3,​O4,​O5,​O6,​O7,​O8,​O9,​O10\> |  |
| [FanOutShape12](FanOutShape12.html "class in akka.stream")\<I,​O0,​O1,​O2,​O3,​O4,​O5,​O6,​O7,​O8,​O9,​O10,​O11\> |  |
| [FanOutShape13](FanOutShape13.html "class in akka.stream")\<I,​O0,​O1,​O2,​O3,​O4,​O5,​O6,​O7,​O8,​O9,​O10,​O11,​O12\> |  |
| [FanOutShape14](FanOutShape14.html "class in akka.stream")\<I,​O0,​O1,​O2,​O3,​O4,​O5,​O6,​O7,​O8,​O9,​O10,​O11,​O12,​O13\> |  |
| [FanOutShape15](FanOutShape15.html "class in akka.stream")\<I,​O0,​O1,​O2,​O3,​O4,​O5,​O6,​O7,​O8,​O9,​O10,​O11,​O12,​O13,​O14\> |  |
| [FanOutShape16](FanOutShape16.html "class in akka.stream")\<I,​O0,​O1,​O2,​O3,​O4,​O5,​O6,​O7,​O8,​O9,​O10,​O11,​O12,​O13,​O14,​O15\> |  |
| [FanOutShape17](FanOutShape17.html "class in akka.stream")\<I,​O0,​O1,​O2,​O3,​O4,​O5,​O6,​O7,​O8,​O9,​O10,​O11,​O12,​O13,​O14,​O15,​O16\> |  |
| [FanOutShape18](FanOutShape18.html "class in akka.stream")\<I,​O0,​O1,​O2,​O3,​O4,​O5,​O6,​O7,​O8,​O9,​O10,​O11,​O12,​O13,​O14,​O15,​O16,​O17\> |  |
| [FanOutShape19](FanOutShape19.html "class in akka.stream")\<I,​O0,​O1,​O2,​O3,​O4,​O5,​O6,​O7,​O8,​O9,​O10,​O11,​O12,​O13,​O14,​O15,​O16,​O17,​O18\> |  |
| [FanOutShape2](FanOutShape2.html "class in akka.stream")\<I,​O0,​O1\> |  |
| [FanOutShape20](FanOutShape20.html "class in akka.stream")\<I,​O0,​O1,​O2,​O3,​O4,​O5,​O6,​O7,​O8,​O9,​O10,​O11,​O12,​O13,​O14,​O15,​O16,​O17,​O18,​O19\> |  |
| [FanOutShape21](FanOutShape21.html "class in akka.stream")\<I,​O0,​O1,​O2,​O3,​O4,​O5,​O6,​O7,​O8,​O9,​O10,​O11,​O12,​O13,​O14,​O15,​O16,​O17,​O18,​O19,​O20\> |  |
| [FanOutShape22](FanOutShape22.html "class in akka.stream")\<I,​O0,​O1,​O2,​O3,​O4,​O5,​O6,​O7,​O8,​O9,​O10,​O11,​O12,​O13,​O14,​O15,​O16,​O17,​O18,​O19,​O20,​O21\> |  |
| [FanOutShape3](FanOutShape3.html "class in akka.stream")\<I,​O0,​O1,​O2\> |  |
| [FanOutShape4](FanOutShape4.html "class in akka.stream")\<I,​O0,​O1,​O2,​O3\> |  |
| [FanOutShape5](FanOutShape5.html "class in akka.stream")\<I,​O0,​O1,​O2,​O3,​O4\> |  |
| [FanOutShape6](FanOutShape6.html "class in akka.stream")\<I,​O0,​O1,​O2,​O3,​O4,​O5\> |  |
| [FanOutShape7](FanOutShape7.html "class in akka.stream")\<I,​O0,​O1,​O2,​O3,​O4,​O5,​O6\> |  |
| [FanOutShape8](FanOutShape8.html "class in akka.stream")\<I,​O0,​O1,​O2,​O3,​O4,​O5,​O6,​O7\> |  |
| [FanOutShape9](FanOutShape9.html "class in akka.stream")\<I,​O0,​O1,​O2,​O3,​O4,​O5,​O6,​O7,​O8\> |  |
| [FlowMonitorState](FlowMonitorState.html "class in akka.stream") |  |
| [FlowMonitorState.Failed](FlowMonitorState.Failed.html "class in akka.stream") | Stream failed |
| [FlowMonitorState.Failed$](FlowMonitorState.Failed$.html "class in akka.stream") |  |
| [FlowMonitorState.Finished$](FlowMonitorState.Finished$.html "class in akka.stream") | Stream completed successfully |
| [FlowMonitorState.Initialized$](FlowMonitorState.Initialized$.html "class in akka.stream") | Stream was created, but no events have passed through it |
| [FlowMonitorState.Received](FlowMonitorState.Received.html "class in akka.stream")\<U\> | Stream processed a message |
| [FlowMonitorState.Received$](FlowMonitorState.Received$.html "class in akka.stream") |  |
| [FlowMonitorState$](FlowMonitorState$.html "class in akka.stream") |  |
| [FlowShape](FlowShape.html "class in akka.stream")\<I,​O\> | A Flow [`Shape`](Shape.html "class in akka.stream") has exactly one input and one output, it looks from the  outside like a pipe (but it can be a complex topology of streams within of  course). |
| [FlowShape$](FlowShape$.html "class in akka.stream") |  |
| [Graph.GraphMapMatVal](Graph.GraphMapMatVal.html "class in akka.stream")\<S extends [Shape](Shape.html "class in akka.stream"),​M\> | Scala API, see https://github.com/akka/akka\-core/issues/28501 for discussion why this can't be an instance method on class Graph. |
| [Graph$](Graph$.html "class in akka.stream") |  |
| [IgnoreBoth](IgnoreBoth.html "class in akka.stream") | see [`TLSClosing`](TLSClosing.html "class in akka.stream") |
| [IgnoreBoth$](IgnoreBoth$.html "class in akka.stream") |  |
| [IgnoreCancel](IgnoreCancel.html "class in akka.stream") | see [`TLSClosing`](TLSClosing.html "class in akka.stream") |
| [IgnoreCancel$](IgnoreCancel$.html "class in akka.stream") |  |
| [IgnoreComplete](IgnoreComplete.html "class in akka.stream") | see [`TLSClosing`](TLSClosing.html "class in akka.stream") |
| [IgnoreComplete$](IgnoreComplete$.html "class in akka.stream") |  |
| [Inlet](Inlet.html "class in akka.stream")\<T\> |  |
| [Inlet$](Inlet$.html "class in akka.stream") | An Inlet is a typed input to a Shape. |
| [InPort](InPort.html "class in akka.stream") | An input port of a StreamLayout.Module. |
| [InvalidPartnerActorException$](InvalidPartnerActorException$.html "class in akka.stream") |  |
| [InvalidSequenceNumberException$](InvalidSequenceNumberException$.html "class in akka.stream") |  |
| [IOResult](IOResult.html "class in akka.stream") | Holds a result of an IO operation. |
| [IOResult$](IOResult$.html "class in akka.stream") |  |
| [IOSettings](IOSettings.html "class in akka.stream") |  |
| [IOSettings$](IOSettings$.html "class in akka.stream") |  |
| [KillSwitches](KillSwitches.html "class in akka.stream") | Creates shared or single kill switches which can be used to control completion of graphs from the outside. |
| [KillSwitches.KillableGraphStageLogic](KillSwitches.KillableGraphStageLogic.html "class in akka.stream") |  |
| [KillSwitches.UniqueBidiKillSwitchStage$](KillSwitches.UniqueBidiKillSwitchStage$.html "class in akka.stream") |  |
| [KillSwitches.UniqueKillSwitchStage$](KillSwitches.UniqueKillSwitchStage$.html "class in akka.stream") |  |
| [KillSwitches$](KillSwitches$.html "class in akka.stream") | Creates shared or single kill switches which can be used to control completion of graphs from the outside. |
| [MaterializationContext$](MaterializationContext$.html "class in akka.stream") |  |
| [MaterializationException$](MaterializationException$.html "class in akka.stream") |  |
| [Materializer](Materializer.html "class in akka.stream") | The Materializer is the component responsible for turning a stream blueprint into a running stream. |
| [Materializer$](Materializer$.html "class in akka.stream") |  |
| [Outlet](Outlet.html "class in akka.stream")\<T\> |  |
| [Outlet$](Outlet$.html "class in akka.stream") | An Outlet is a typed output to a Shape. |
| [OutPort](OutPort.html "class in akka.stream") | An output port of a StreamLayout.Module. |
| [OverflowStrategies](OverflowStrategies.html "class in akka.stream") |  |
| [OverflowStrategies.Backpressure$](OverflowStrategies.Backpressure$.html "class in akka.stream") |  |
| [OverflowStrategies.DropBuffer$](OverflowStrategies.DropBuffer$.html "class in akka.stream") |  |
| [OverflowStrategies.DropHead$](OverflowStrategies.DropHead$.html "class in akka.stream") |  |
| [OverflowStrategies.DropNew$](OverflowStrategies.DropNew$.html "class in akka.stream") |  |
| [OverflowStrategies.DropTail$](OverflowStrategies.DropTail$.html "class in akka.stream") |  |
| [OverflowStrategies.EmitEarly$](OverflowStrategies.EmitEarly$.html "class in akka.stream") | INTERNAL API |
| [OverflowStrategies.Fail$](OverflowStrategies.Fail$.html "class in akka.stream") |  |
| [OverflowStrategies$](OverflowStrategies$.html "class in akka.stream") |  |
| [OverflowStrategy](OverflowStrategy.html "class in akka.stream") | Represents a strategy that decides how to deal with a buffer that is full but is  about to receive a new element. |
| [OverflowStrategy$](OverflowStrategy$.html "class in akka.stream") |  |
| [QueueCompletionResult](QueueCompletionResult.html "class in akka.stream") | Not for user extension |
| [QueueOfferResult](QueueOfferResult.html "class in akka.stream") | Not for user extension |
| [QueueOfferResult.Dropped$](QueueOfferResult.Dropped$.html "class in akka.stream") | Type is used to indicate that stream is dropped an element |
| [QueueOfferResult.Enqueued$](QueueOfferResult.Enqueued$.html "class in akka.stream") | Type is used to indicate that stream is successfully enqueued an element |
| [QueueOfferResult.Failure](QueueOfferResult.Failure.html "class in akka.stream") | Type is used to indicate that stream is failed before or during call to the stream  param: cause \- exception that stream failed with |
| [QueueOfferResult.Failure$](QueueOfferResult.Failure$.html "class in akka.stream") |  |
| [QueueOfferResult.QueueClosed$](QueueOfferResult.QueueClosed$.html "class in akka.stream") | Type is used to indicate that stream is completed before call |
| [QueueOfferResult$](QueueOfferResult$.html "class in akka.stream") | Contains types that is used as return types for streams Source queues |
| [RemoteStreamRefActorTerminatedException$](RemoteStreamRefActorTerminatedException$.html "class in akka.stream") |  |
| [RestartSettings](RestartSettings.html "class in akka.stream") |  |
| [RestartSettings.LogSettings](RestartSettings.LogSettings.html "class in akka.stream") |  |
| [RestartSettings.LogSettings$](RestartSettings.LogSettings$.html "class in akka.stream") |  |
| [RestartSettings$](RestartSettings$.html "class in akka.stream") |  |
| [Server](Server.html "class in akka.stream") | The server is usually the side the provides the service to its interlocutor. |
| [Server$](Server$.html "class in akka.stream") |  |
| [Shape](Shape.html "class in akka.stream") | A Shape describes the inlets and outlets of a [`Graph`](Graph.html "interface in akka.stream"). |
| [Shape$](Shape$.html "class in akka.stream") | INTERNAL API |
| [SharedKillSwitch](SharedKillSwitch.html "class in akka.stream") | A [`SharedKillSwitch`](SharedKillSwitch.html "class in akka.stream") is a provider for [`Graph`](Graph.html "interface in akka.stream")s of [`FlowShape`](FlowShape.html "class in akka.stream") that can be completed or failed from the outside. |
| [SinkRef$](SinkRef$.html "class in akka.stream") | See full documentation on [`SinkRef`](SinkRef.html "interface in akka.stream"). |
| [SinkShape](SinkShape.html "class in akka.stream")\<T\> | A Sink [`Shape`](Shape.html "class in akka.stream") has exactly one input and no outputs, it models a data sink. |
| [SinkShape$](SinkShape$.html "class in akka.stream") |  |
| [SourceRef$](SourceRef$.html "class in akka.stream") | See full documentation on [`SourceRef`](SourceRef.html "interface in akka.stream"). |
| [SourceShape](SourceShape.html "class in akka.stream")\<T\> | A Source [`Shape`](Shape.html "class in akka.stream") has exactly one output and no inputs, it models a source  of data. |
| [SourceShape$](SourceShape$.html "class in akka.stream") |  |
| [StreamRefAttributes](StreamRefAttributes.html "class in akka.stream") | Attributes for stream refs ([`SourceRef`](SourceRef.html "interface in akka.stream") and [`SinkRef`](SinkRef.html "interface in akka.stream")). |
| [StreamRefAttributes.BufferCapacity](StreamRefAttributes.BufferCapacity.html "class in akka.stream") |  |
| [StreamRefAttributes.BufferCapacity$](StreamRefAttributes.BufferCapacity$.html "class in akka.stream") |  |
| [StreamRefAttributes.DemandRedeliveryInterval](StreamRefAttributes.DemandRedeliveryInterval.html "class in akka.stream") |  |
| [StreamRefAttributes.DemandRedeliveryInterval$](StreamRefAttributes.DemandRedeliveryInterval$.html "class in akka.stream") |  |
| [StreamRefAttributes.FinalTerminationSignalDeadline](StreamRefAttributes.FinalTerminationSignalDeadline.html "class in akka.stream") |  |
| [StreamRefAttributes.FinalTerminationSignalDeadline$](StreamRefAttributes.FinalTerminationSignalDeadline$.html "class in akka.stream") |  |
| [StreamRefAttributes.SubscriptionTimeout](StreamRefAttributes.SubscriptionTimeout.html "class in akka.stream") |  |
| [StreamRefAttributes.SubscriptionTimeout$](StreamRefAttributes.SubscriptionTimeout$.html "class in akka.stream") |  |
| [StreamRefAttributes$](StreamRefAttributes$.html "class in akka.stream") | Attributes for stream refs ([`SourceRef`](SourceRef.html "interface in akka.stream") and [`SinkRef`](SinkRef.html "interface in akka.stream")). |
| [StreamRefMessages](StreamRefMessages.html "class in akka.stream") |  |
| [StreamRefMessages.ActorRef](StreamRefMessages.ActorRef.html "class in akka.stream") | Protobuf type `ActorRef` |
| [StreamRefMessages.ActorRef.Builder](StreamRefMessages.ActorRef.Builder.html "class in akka.stream") | Protobuf type `ActorRef` |
| [StreamRefMessages.CumulativeDemand](StreamRefMessages.CumulativeDemand.html "class in akka.stream") | Protobuf type `CumulativeDemand` |
| [StreamRefMessages.CumulativeDemand.Builder](StreamRefMessages.CumulativeDemand.Builder.html "class in akka.stream") | Protobuf type `CumulativeDemand` |
| [StreamRefMessages.OnSubscribeHandshake](StreamRefMessages.OnSubscribeHandshake.html "class in akka.stream") | Protobuf type `OnSubscribeHandshake` |
| [StreamRefMessages.OnSubscribeHandshake.Builder](StreamRefMessages.OnSubscribeHandshake.Builder.html "class in akka.stream") | Protobuf type `OnSubscribeHandshake` |
| [StreamRefMessages.Payload](StreamRefMessages.Payload.html "class in akka.stream") | Protobuf type `Payload` |
| [StreamRefMessages.Payload.Builder](StreamRefMessages.Payload.Builder.html "class in akka.stream") | Protobuf type `Payload` |
| [StreamRefMessages.RemoteStreamCompleted](StreamRefMessages.RemoteStreamCompleted.html "class in akka.stream") | Protobuf type `RemoteStreamCompleted` |
| [StreamRefMessages.RemoteStreamCompleted.Builder](StreamRefMessages.RemoteStreamCompleted.Builder.html "class in akka.stream") | Protobuf type `RemoteStreamCompleted` |
| [StreamRefMessages.RemoteStreamFailure](StreamRefMessages.RemoteStreamFailure.html "class in akka.stream") | Protobuf type `RemoteStreamFailure` |
| [StreamRefMessages.RemoteStreamFailure.Builder](StreamRefMessages.RemoteStreamFailure.Builder.html "class in akka.stream") | Protobuf type `RemoteStreamFailure` |
| [StreamRefMessages.SequencedOnNext](StreamRefMessages.SequencedOnNext.html "class in akka.stream") | Protobuf type `SequencedOnNext` |
| [StreamRefMessages.SequencedOnNext.Builder](StreamRefMessages.SequencedOnNext.Builder.html "class in akka.stream") | Protobuf type `SequencedOnNext` |
| [StreamRefMessages.SinkRef](StreamRefMessages.SinkRef.html "class in akka.stream") | Protobuf type `SinkRef` |
| [StreamRefMessages.SinkRef.Builder](StreamRefMessages.SinkRef.Builder.html "class in akka.stream") | Protobuf type `SinkRef` |
| [StreamRefMessages.SourceRef](StreamRefMessages.SourceRef.html "class in akka.stream") | Protobuf type `SourceRef` |
| [StreamRefMessages.SourceRef.Builder](StreamRefMessages.SourceRef.Builder.html "class in akka.stream") | Protobuf type `SourceRef` |
| [StreamRefResolver$](StreamRefResolver$.html "class in akka.stream") | The stream ref resolver extension provides a way to serialize and deserialize streamrefs in user serializers. |
| [StreamRefSettings$](StreamRefSettings$.html "class in akka.stream") |  |
| [StreamRefSubscriptionTimeoutException$](StreamRefSubscriptionTimeoutException$.html "class in akka.stream") |  |
| [StreamSubscriptionTimeoutSettings](StreamSubscriptionTimeoutSettings.html "class in akka.stream") | Leaked publishers and subscribers are cleaned up when they are not used within a given  deadline, configured by [`StreamSubscriptionTimeoutSettings`](StreamSubscriptionTimeoutSettings.html "class in akka.stream"). |
| [StreamSubscriptionTimeoutSettings$](StreamSubscriptionTimeoutSettings$.html "class in akka.stream") |  |
| [StreamSubscriptionTimeoutTerminationMode](StreamSubscriptionTimeoutTerminationMode.html "class in akka.stream") | This mode describes what shall happen when the subscription timeout expires for  substream Publishers created by operations like `prefixAndTail`. |
| [StreamSubscriptionTimeoutTerminationMode.CancelTermination$](StreamSubscriptionTimeoutTerminationMode.CancelTermination$.html "class in akka.stream") |  |
| [StreamSubscriptionTimeoutTerminationMode.NoopTermination$](StreamSubscriptionTimeoutTerminationMode.NoopTermination$.html "class in akka.stream") |  |
| [StreamSubscriptionTimeoutTerminationMode.WarnTermination$](StreamSubscriptionTimeoutTerminationMode.WarnTermination$.html "class in akka.stream") |  |
| [StreamSubscriptionTimeoutTerminationMode$](StreamSubscriptionTimeoutTerminationMode$.html "class in akka.stream") |  |
| [SubscriptionWithCancelException$](SubscriptionWithCancelException$.html "class in akka.stream") |  |
| [SubstreamCancelStrategies](SubstreamCancelStrategies.html "class in akka.stream") |  |
| [SubstreamCancelStrategies.Drain$](SubstreamCancelStrategies.Drain$.html "class in akka.stream") | INTERNAL API |
| [SubstreamCancelStrategies.Propagate$](SubstreamCancelStrategies.Propagate$.html "class in akka.stream") | INTERNAL API |
| [SubstreamCancelStrategies$](SubstreamCancelStrategies$.html "class in akka.stream") |  |
| [SubstreamCancelStrategy](SubstreamCancelStrategy.html "class in akka.stream") | Represents a strategy that decides how to deal with substream events. |
| [SubstreamCancelStrategy$](SubstreamCancelStrategy$.html "class in akka.stream") |  |
| [Supervision](Supervision.html "class in akka.stream") |  |
| [Supervision.Restart$](Supervision.Restart$.html "class in akka.stream") | Scala API: The element is dropped and the stream continues after restarting the operator  if application code for processing an element throws an exception. |
| [Supervision.Resume$](Supervision.Resume$.html "class in akka.stream") | Scala API: The element is dropped and the stream continues if application code for processing  an element throws an exception. |
| [Supervision.Stop$](Supervision.Stop$.html "class in akka.stream") | Scala API: The stream will be completed with failure if application code for processing an element  throws an exception. |
| [Supervision$](Supervision$.html "class in akka.stream") |  |
| [SystemMaterializer](SystemMaterializer.html "class in akka.stream") |  |
| [SystemMaterializer$](SystemMaterializer$.html "class in akka.stream") | The system materializer is a default materializer to use for most cases running streams, it is a single instance  per actor system that is tied to the lifecycle of that system. |
| [TargetRefNotInitializedYetException$](TargetRefNotInitializedYetException$.html "class in akka.stream") |  |
| [ThrottleMode](ThrottleMode.html "class in akka.stream") | Represents a mode that decides how to deal exceed rate for Throttle operator |
| [ThrottleMode.Enforcing$](ThrottleMode.Enforcing$.html "class in akka.stream") | Makes throttle fail with exception when upstream is faster than throttle rate |
| [ThrottleMode.Shaping$](ThrottleMode.Shaping$.html "class in akka.stream") | Tells throttle to make pauses before emitting messages to meet the throttle rate |
| [ThrottleMode$](ThrottleMode$.html "class in akka.stream") |  |
| [TLSClientAuth](TLSClientAuth.html "class in akka.stream") | An SSLEngine can either demand, allow or ignore its peer\&rsquo;s authentication  (via certificates), where `Need` will fail the handshake if the peer does  not provide valid credentials, `Want` allows the peer to send credentials  and verifies them if provided, and `None` disables peer certificate  verification. |
| [TLSClientAuth.Need$](TLSClientAuth.Need$.html "class in akka.stream") |  |
| [TLSClientAuth.None$](TLSClientAuth.None$.html "class in akka.stream") |  |
| [TLSClientAuth.Want$](TLSClientAuth.Want$.html "class in akka.stream") |  |
| [TLSClientAuth$](TLSClientAuth$.html "class in akka.stream") |  |
| [TLSClosing](TLSClosing.html "class in akka.stream") | All streams in Akka are unidirectional: while in a complex flow graph data  may flow in multiple directions these individual flows are independent from  each other. |
| [TLSClosing$](TLSClosing$.html "class in akka.stream") |  |
| [TLSProtocol](TLSProtocol.html "class in akka.stream") |  |
| [TLSProtocol.NegotiateNewSession](TLSProtocol.NegotiateNewSession.html "class in akka.stream") | Initiate a new session negotiation. |
| [TLSProtocol.NegotiateNewSession$](TLSProtocol.NegotiateNewSession$.html "class in akka.stream") |  |
| [TLSProtocol.SendBytes](TLSProtocol.SendBytes.html "class in akka.stream") | Send the given [`ByteString`](../util/ByteString.html "class in akka.util") across the encrypted session to the  peer. |
| [TLSProtocol.SendBytes$](TLSProtocol.SendBytes$.html "class in akka.stream") |  |
| [TLSProtocol.SessionBytes](TLSProtocol.SessionBytes.html "class in akka.stream") | Plaintext bytes emitted by the SSLEngine are received over one specific  encryption session and this class bundles the bytes with the SSLSession  object. |
| [TLSProtocol.SessionBytes$](TLSProtocol.SessionBytes$.html "class in akka.stream") |  |
| [TLSProtocol.SessionTruncated](TLSProtocol.SessionTruncated.html "class in akka.stream") | If the underlying transport is closed before the final TLS closure command  is received from the peer then the SSLEngine will throw an SSLException that  warns about possible truncation attacks. |
| [TLSProtocol.SessionTruncated$](TLSProtocol.SessionTruncated$.html "class in akka.stream") |  |
| [TLSProtocol$](TLSProtocol$.html "class in akka.stream") |  |
| [TLSRole](TLSRole.html "class in akka.stream") |  |
| [TLSRole$](TLSRole$.html "class in akka.stream") | Many protocols are asymmetric and distinguish between the client and the  server, where the latter listens passively for messages and the former  actively initiates the exchange. |
| [UniformFanInShape](UniformFanInShape.html "class in akka.stream")\<T,​O\> |  |
| [UniformFanInShape$](UniformFanInShape$.html "class in akka.stream") |  |
| [UniformFanOutShape](UniformFanOutShape.html "class in akka.stream")\<I,​O\> |  |
| [UniformFanOutShape$](UniformFanOutShape$.html "class in akka.stream") |  |
| [UniqueKillSwitch](UniqueKillSwitch.html "class in akka.stream") | A [`UniqueKillSwitch`](UniqueKillSwitch.html "class in akka.stream") is always a result of a materialization (unlike [`SharedKillSwitch`](SharedKillSwitch.html "class in akka.stream") which is constructed  before any materialization) and it always controls that graph and operator which yielded the materialized value. |
- Exception Summary 
| Exception | Description |
| [AbruptIOTerminationException](AbruptIOTerminationException.html "class in akka.stream") | Deprecated. use IOOperationIncompleteException. |
| --- | --- |
| [AbruptStageTerminationException](AbruptStageTerminationException.html "class in akka.stream") | Signal that the operator was abruptly terminated, usually seen as a call to `postStop` of the `GraphStageLogic` without  any of the handler callbacks seeing completion or failure from upstream or cancellation from downstream. |
| [AbruptStreamTerminationException](AbruptStreamTerminationException.html "class in akka.stream") | A base exception for abrupt stream termination. |
| [AbruptTerminationException](AbruptTerminationException.html "class in akka.stream") | This exception signals that an actor implementing a Reactive Streams Subscriber, Publisher or Processor  has been terminated without being notified by an onError, onComplete or cancel signal. |
| [BackpressureTimeoutException](BackpressureTimeoutException.html "class in akka.stream") |  |
| [BindFailedException](BindFailedException.html "class in akka.stream") |  |
| [BindFailedException$](BindFailedException$.html "class in akka.stream") | Deprecated. BindFailedException object will never be thrown. |
| [BufferOverflowException](BufferOverflowException.html "class in akka.stream") |  |
| [CompletionTimeoutException](CompletionTimeoutException.html "class in akka.stream") |  |
| [ConnectionException](ConnectionException.html "class in akka.stream") |  |
| [InitialTimeoutException](InitialTimeoutException.html "class in akka.stream") |  |
| [InvalidPartnerActorException](InvalidPartnerActorException.html "class in akka.stream") | Stream refs establish a connection between a local and remote actor, representing the origin and remote sides  of a stream. |
| [InvalidSequenceNumberException](InvalidSequenceNumberException.html "class in akka.stream") |  |
| [IOOperationIncompleteException](IOOperationIncompleteException.html "class in akka.stream") | This exception signals that a stream has been completed or has an error while  there was still IO operations in progress |
| [MaterializationException](MaterializationException.html "class in akka.stream") | This exception or subtypes thereof should be used to signal materialization  failures. |
| [NeverMaterializedException](NeverMaterializedException.html "class in akka.stream") |  |
| [RateExceededException](RateExceededException.html "class in akka.stream") | Exception that is thrown when rated controlled by stream is exceeded |
| [RemoteStreamRefActorTerminatedException](RemoteStreamRefActorTerminatedException.html "class in akka.stream") |  |
| [StreamDetachedException](StreamDetachedException.html "class in akka.stream") | This exception signals that materialized value is already detached from stream. |
| [StreamIdleTimeoutException](StreamIdleTimeoutException.html "class in akka.stream") |  |
| [StreamLimitReachedException](StreamLimitReachedException.html "class in akka.stream") |  |
| [StreamRefSubscriptionTimeoutException](StreamRefSubscriptionTimeoutException.html "class in akka.stream") |  |
| [StreamTcpException](StreamTcpException.html "class in akka.stream") |  |
| [StreamTimeoutException](StreamTimeoutException.html "class in akka.stream") | Base class for timeout exceptions specific to Akka Streams |
| [SubscriptionWithCancelException.NoMoreElementsNeeded$](SubscriptionWithCancelException.NoMoreElementsNeeded$.html "class in akka.stream") |  |
| [SubscriptionWithCancelException.NonFailureCancellation](SubscriptionWithCancelException.NonFailureCancellation.html "class in akka.stream") | Not for user extension |
| [SubscriptionWithCancelException.StageWasCompleted$](SubscriptionWithCancelException.StageWasCompleted$.html "class in akka.stream") |  |
| [TargetRefNotInitializedYetException](TargetRefNotInitializedYetException.html "class in akka.stream") |  |
| [TooManySubstreamsOpenException](TooManySubstreamsOpenException.html "class in akka.stream") | This exception signals that the maximum number of substreams declared has been exceeded. |
| [WatchedActorTerminatedException](WatchedActorTerminatedException.html "class in akka.stream") | Used as failure exception by an `ask` operator if the target actor terminates. |

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/stream/AbruptIOTerminationException$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/AbruptIOTerminationException.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/AbruptStageTerminationException.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/AbruptStreamTerminationException.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/AbruptTerminationException$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/AbruptTerminationException.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/AbstractShape.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/ActorAttributes$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/ActorAttributes.DebugLogging$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/ActorAttributes.DebugLogging.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/ActorAttributes.Dispatcher$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/ActorAttributes.Dispatcher.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/ActorAttributes.FuzzingMode$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/ActorAttributes.FuzzingMode.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/ActorAttributes.MaxFixedBufferSize$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/ActorAttributes.MaxFixedBufferSize.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/ActorAttributes.OutputBurstLimit$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/ActorAttributes.OutputBurstLimit.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/ActorAttributes.StreamSubscriptionTimeout$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/ActorAttributes.StreamSubscriptionTimeout.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/ActorAttributes.SupervisionStrategy$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/ActorAttributes.SupervisionStrategy.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/ActorAttributes.SyncProcessingLimit$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/ActorAttributes.SyncProcessingLimit.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/ActorAttributes.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/ActorMaterializer$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/ActorMaterializer.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/ActorMaterializerHelper$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/ActorMaterializerHelper.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/ActorMaterializerSettings$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/ActorMaterializerSettings.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/AmorphousShape$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/AmorphousShape.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/Attributes$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/Attributes.AsyncBoundary$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/Attributes.Attribute.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/Attributes.CancellationStrategy$.AfterDelay$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/Attributes.CancellationStrategy$.AfterDelay.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/Attributes.CancellationStrategy$.CompleteStage$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/Attributes.CancellationStrategy$.FailStage$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/Attributes.CancellationStrategy$.PropagateFailure$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/Attributes.CancellationStrategy$.Strategy.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/Attributes.CancellationStrategy$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/Attributes.CancellationStrategy.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/Attributes.InputBuffer$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/Attributes.InputBuffer.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/Attributes.LogLevels$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/Attributes.LogLevels.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/Attributes.MandatoryAttribute.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/Attributes.Name$.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/stream/package-summary.html](https://doc.akka.io/japi/akka-core/2.10/akka/stream/package-summary.html)*