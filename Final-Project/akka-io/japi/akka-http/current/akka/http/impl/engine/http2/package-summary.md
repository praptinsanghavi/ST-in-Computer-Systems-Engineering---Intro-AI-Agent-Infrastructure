---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:58:30Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/package-summary.html
title: akka.http.impl.engine.http2
---

# akka.http.impl.engine.http2

## Content

# Package akka.http.impl.engine.http2

- Interface Summary 
| Interface | Description |
| [ConfigurablePing.PingState](ConfigurablePing.PingState.html "interface in akka.http.impl.engine.http2") |  |
| --- | --- |
| [FrameEvent](FrameEvent.html "interface in akka.http.impl.engine.http2") | INTERNAL API |
| [FrameEvent.StreamFrameEvent](FrameEvent.StreamFrameEvent.html "interface in akka.http.impl.engine.http2") |  |
| [GenericOutlet](GenericOutlet.html "interface in akka.http.impl.engine.http2")\<T\> | INTERNAL API |
| [GenericOutletSupport](GenericOutletSupport.html "interface in akka.http.impl.engine.http2") | INTERNAL API |
| [Http2Multiplexer](Http2Multiplexer.html "interface in akka.http.impl.engine.http2") | INTERNAL API |
| [Http2MultiplexerSupport](Http2MultiplexerSupport.html "interface in akka.http.impl.engine.http2") | INTERNAL API |
| [Http2MultiplexerSupport.StateTimingSupport](Http2MultiplexerSupport.StateTimingSupport.html "interface in akka.http.impl.engine.http2") |  |
| [Http2StreamHandling](Http2StreamHandling.html "interface in akka.http.impl.engine.http2") | INTERNAL API |
| [Http2StreamHandling.OutStream](Http2StreamHandling.OutStream.html "interface in akka.http.impl.engine.http2") |  |
| [Http2StreamHandling.Sending](Http2StreamHandling.Sending.html "interface in akka.http.impl.engine.http2") |  |
| [IncomingFlowController](IncomingFlowController.html "interface in akka.http.impl.engine.http2") | INTERNAL API |
| [PriorityNode](PriorityNode.html "interface in akka.http.impl.engine.http2") | INTERNAL API |
| [PriorityTree](PriorityTree.html "interface in akka.http.impl.engine.http2") | INTERNAL API |
| [RequestParsing.ParseRequestResult](RequestParsing.ParseRequestResult.html "interface in akka.http.impl.engine.http2") |  |
| [StreamPrioritizer](StreamPrioritizer.html "interface in akka.http.impl.engine.http2") | INTERNAL API |
| [TelemetrySpi](TelemetrySpi.html "interface in akka.http.impl.engine.http2") | INTERNAL API |
- Class Summary 
| Class | Description |
| [BufferedOutlet](BufferedOutlet.html "class in akka.http.impl.engine.http2")\<T\> | INTERNAL API |
| --- | --- |
| [BufferedOutletExtended](BufferedOutletExtended.html "class in akka.http.impl.engine.http2")\<T\> | INTERNAL API |
| [ByteFlag](ByteFlag.html "class in akka.http.impl.engine.http2") | INTERNAL API |
| [ByteFlag$](ByteFlag$.html "class in akka.http.impl.engine.http2") | INTERNAL API |
| [ConfigurablePing](ConfigurablePing.html "class in akka.http.impl.engine.http2") | INTERNAL API |
| [ConfigurablePing.DisabledPingState$](ConfigurablePing.DisabledPingState$.html "class in akka.http.impl.engine.http2") |  |
| [ConfigurablePing.EnabledPingState](ConfigurablePing.EnabledPingState.html "class in akka.http.impl.engine.http2") |  |
| [ConfigurablePing.PingState$](ConfigurablePing.PingState$.html "class in akka.http.impl.engine.http2") |  |
| [ConfigurablePing.Tick$](ConfigurablePing.Tick$.html "class in akka.http.impl.engine.http2") |  |
| [ConfigurablePing$](ConfigurablePing$.html "class in akka.http.impl.engine.http2") | INTERNAL API |
| [FrameEvent.ContinuationFrame](FrameEvent.ContinuationFrame.html "class in akka.http.impl.engine.http2") |  |
| [FrameEvent.ContinuationFrame$](FrameEvent.ContinuationFrame$.html "class in akka.http.impl.engine.http2") |  |
| [FrameEvent.DataFrame](FrameEvent.DataFrame.html "class in akka.http.impl.engine.http2") |  |
| [FrameEvent.DataFrame$](FrameEvent.DataFrame$.html "class in akka.http.impl.engine.http2") |  |
| [FrameEvent.GoAwayFrame](FrameEvent.GoAwayFrame.html "class in akka.http.impl.engine.http2") |  |
| [FrameEvent.GoAwayFrame$](FrameEvent.GoAwayFrame$.html "class in akka.http.impl.engine.http2") |  |
| [FrameEvent.HeadersFrame](FrameEvent.HeadersFrame.html "class in akka.http.impl.engine.http2") | Representation of the wire\-level HEADERS frame. |
| [FrameEvent.HeadersFrame$](FrameEvent.HeadersFrame$.html "class in akka.http.impl.engine.http2") |  |
| [FrameEvent.ParsedHeadersFrame](FrameEvent.ParsedHeadersFrame.html "class in akka.http.impl.engine.http2") | Convenience (logical) representation of a parsed HEADERS frame with zero, one or  many CONTINUATIONS Frames into a single, decompressed object. |
| [FrameEvent.ParsedHeadersFrame$](FrameEvent.ParsedHeadersFrame$.html "class in akka.http.impl.engine.http2") |  |
| [FrameEvent.PingFrame](FrameEvent.PingFrame.html "class in akka.http.impl.engine.http2") |  |
| [FrameEvent.PingFrame$](FrameEvent.PingFrame$.html "class in akka.http.impl.engine.http2") |  |
| [FrameEvent.PriorityFrame](FrameEvent.PriorityFrame.html "class in akka.http.impl.engine.http2") |  |
| [FrameEvent.PriorityFrame$](FrameEvent.PriorityFrame$.html "class in akka.http.impl.engine.http2") |  |
| [FrameEvent.PushPromiseFrame](FrameEvent.PushPromiseFrame.html "class in akka.http.impl.engine.http2") |  |
| [FrameEvent.PushPromiseFrame$](FrameEvent.PushPromiseFrame$.html "class in akka.http.impl.engine.http2") |  |
| [FrameEvent.RstStreamFrame](FrameEvent.RstStreamFrame.html "class in akka.http.impl.engine.http2") |  |
| [FrameEvent.RstStreamFrame$](FrameEvent.RstStreamFrame$.html "class in akka.http.impl.engine.http2") |  |
| [FrameEvent.Setting](FrameEvent.Setting.html "class in akka.http.impl.engine.http2") |  |
| [FrameEvent.Setting$](FrameEvent.Setting$.html "class in akka.http.impl.engine.http2") |  |
| [FrameEvent.SettingsAckFrame](FrameEvent.SettingsAckFrame.html "class in akka.http.impl.engine.http2") |  |
| [FrameEvent.SettingsAckFrame$](FrameEvent.SettingsAckFrame$.html "class in akka.http.impl.engine.http2") |  |
| [FrameEvent.SettingsFrame](FrameEvent.SettingsFrame.html "class in akka.http.impl.engine.http2") |  |
| [FrameEvent.SettingsFrame$](FrameEvent.SettingsFrame$.html "class in akka.http.impl.engine.http2") |  |
| [FrameEvent.UnknownFrameEvent](FrameEvent.UnknownFrameEvent.html "class in akka.http.impl.engine.http2") | Dummy event for all unknown frames |
| [FrameEvent.UnknownFrameEvent$](FrameEvent.UnknownFrameEvent$.html "class in akka.http.impl.engine.http2") |  |
| [FrameEvent.WindowUpdateFrame](FrameEvent.WindowUpdateFrame.html "class in akka.http.impl.engine.http2") |  |
| [FrameEvent.WindowUpdateFrame$](FrameEvent.WindowUpdateFrame$.html "class in akka.http.impl.engine.http2") |  |
| [FrameEvent$](FrameEvent$.html "class in akka.http.impl.engine.http2") | INTERNAL API |
| [FrameLogger](FrameLogger.html "class in akka.http.impl.engine.http2") | INTERNAL API |
| [FrameLogger$](FrameLogger$.html "class in akka.http.impl.engine.http2") | INTERNAL API |
| [Http2](Http2.html "class in akka.http.impl.engine.http2") | INTERNAL API |
| [Http2$](Http2$.html "class in akka.http.impl.engine.http2") | INTERNAL API |
| [Http2AlpnSupport](Http2AlpnSupport.html "class in akka.http.impl.engine.http2") | INTERNAL API |
| [Http2AlpnSupport$](Http2AlpnSupport$.html "class in akka.http.impl.engine.http2") | INTERNAL API |
| [Http2Blueprint](Http2Blueprint.html "class in akka.http.impl.engine.http2") | INTERNAL API |
| [Http2Blueprint.BidiFlowExt](Http2Blueprint.BidiFlowExt.html "class in akka.http.impl.engine.http2")\<I1,​O1,​I2,​O2,​Mat\> |  |
| [Http2Blueprint$](Http2Blueprint$.html "class in akka.http.impl.engine.http2") | INTERNAL API |
| [Http2ClientDemux](Http2ClientDemux.html "class in akka.http.impl.engine.http2") | INTERNAL API |
| [Http2Compliance](Http2Compliance.html "class in akka.http.impl.engine.http2") | INTERNAL API |
| [Http2Compliance$](Http2Compliance$.html "class in akka.http.impl.engine.http2") | INTERNAL API |
| [Http2Demux](Http2Demux.html "class in akka.http.impl.engine.http2") | INTERNAL API |
| [Http2Demux.CompletionTimeout$](Http2Demux.CompletionTimeout$.html "class in akka.http.impl.engine.http2") |  |
| [Http2Demux.GoAwayGracePeriod$](Http2Demux.GoAwayGracePeriod$.html "class in akka.http.impl.engine.http2") |  |
| [Http2Demux$](Http2Demux$.html "class in akka.http.impl.engine.http2") |  |
| [Http2Ext](Http2Ext.html "class in akka.http.impl.engine.http2") | INTERNAL API |
| [Http2JDKAlpnSupport](Http2JDKAlpnSupport.html "class in akka.http.impl.engine.http2") | INTERNAL API |
| [Http2JDKAlpnSupport$](Http2JDKAlpnSupport$.html "class in akka.http.impl.engine.http2") | INTERNAL API |
| [Http2Protocol](Http2Protocol.html "class in akka.http.impl.engine.http2") | INTERNAL API |
| [Http2Protocol.ErrorCode](Http2Protocol.ErrorCode.html "class in akka.http.impl.engine.http2") |  |
| [Http2Protocol.ErrorCode$](Http2Protocol.ErrorCode$.html "class in akka.http.impl.engine.http2") |  |
| [Http2Protocol.ErrorCode$.CANCEL$](Http2Protocol.ErrorCode$.CANCEL$.html "class in akka.http.impl.engine.http2") | CANCEL (0x8\): Used by the endpoint to indicate that the stream is no  longer needed. |
| [Http2Protocol.ErrorCode$.COMPRESSION\_ERROR$](Http2Protocol.ErrorCode$.COMPRESSION_ERROR$.html "class in akka.http.impl.engine.http2") | COMPRESSION\_ERROR (0x9\): The endpoint is unable to maintain the  header compression context for the connection. |
| [Http2Protocol.ErrorCode$.CONNECT\_ERROR$](Http2Protocol.ErrorCode$.CONNECT_ERROR$.html "class in akka.http.impl.engine.http2") | CONNECT\_ERROR (0xa): The connection established in response to a  CONNECT request (Section 8\.3\) was reset or abnormally closed. |
| [Http2Protocol.ErrorCode$.ENHANCE\_YOUR\_CALM$](Http2Protocol.ErrorCode$.ENHANCE_YOUR_CALM$.html "class in akka.http.impl.engine.http2") | ENHANCE\_YOUR\_CALM (0xb): The endpoint detected that its peer is  exhibiting a behavior that might be generating excessive load. |
| [Http2Protocol.ErrorCode$.FLOW\_CONTROL\_ERROR$](Http2Protocol.ErrorCode$.FLOW_CONTROL_ERROR$.html "class in akka.http.impl.engine.http2") | FLOW\_CONTROL\_ERROR (0x3\): The endpoint detected that its peer  violated the flow\-control protocol. |
| [Http2Protocol.ErrorCode$.FRAME\_SIZE\_ERROR$](Http2Protocol.ErrorCode$.FRAME_SIZE_ERROR$.html "class in akka.http.impl.engine.http2") | FRAME\_SIZE\_ERROR (0x6\): The endpoint received a frame with an  invalid size. |
| [Http2Protocol.ErrorCode$.HTTP\_1\_1\_REQUIRED$](Http2Protocol.ErrorCode$.HTTP_1_1_REQUIRED$.html "class in akka.http.impl.engine.http2") | HTTP\_1\_1\_REQUIRED (0xd): The endpoint requires that HTTP/1\.1 be used  instead of HTTP/2\. |
| [Http2Protocol.ErrorCode$.INADEQUATE\_SECURITY$](Http2Protocol.ErrorCode$.INADEQUATE_SECURITY$.html "class in akka.http.impl.engine.http2") | INADEQUATE\_SECURITY (0xc): The underlying transport has properties  that do not meet minimum security requirements (see Section 9\.2\). |
| [Http2Protocol.ErrorCode$.INTERNAL\_ERROR$](Http2Protocol.ErrorCode$.INTERNAL_ERROR$.html "class in akka.http.impl.engine.http2") | INTERNAL\_ERROR (0x2\): The endpoint encountered an unexpected  internal error. |
| [Http2Protocol.ErrorCode$.NO\_ERROR$](Http2Protocol.ErrorCode$.NO_ERROR$.html "class in akka.http.impl.engine.http2") | NO\_ERROR (0x0\): The associated condition is not a result of an  error. |
| [Http2Protocol.ErrorCode$.PROTOCOL\_ERROR$](Http2Protocol.ErrorCode$.PROTOCOL_ERROR$.html "class in akka.http.impl.engine.http2") | PROTOCOL\_ERROR (0x1\): The endpoint detected an unspecific protocol  error. |
| [Http2Protocol.ErrorCode$.REFUSED\_STREAM$](Http2Protocol.ErrorCode$.REFUSED_STREAM$.html "class in akka.http.impl.engine.http2") | REFUSED\_STREAM (0x7\): The endpoint refused the stream prior to  performing any application processing (see Section 8\.1\.4 for  details). |
| [Http2Protocol.ErrorCode$.SETTINGS\_TIMEOUT$](Http2Protocol.ErrorCode$.SETTINGS_TIMEOUT$.html "class in akka.http.impl.engine.http2") | SETTINGS\_TIMEOUT (0x4\): The endpoint sent a SETTINGS frame but did  not receive a response in a timely manner. |
| [Http2Protocol.ErrorCode$.STREAM\_CLOSED$](Http2Protocol.ErrorCode$.STREAM_CLOSED$.html "class in akka.http.impl.engine.http2") | STREAM\_CLOSED (0x5\): The endpoint received a frame after a stream  was half\-closed. |
| [Http2Protocol.ErrorCode$.Unknown](Http2Protocol.ErrorCode$.Unknown.html "class in akka.http.impl.engine.http2") |  |
| [Http2Protocol.ErrorCode$.Unknown$](Http2Protocol.ErrorCode$.Unknown$.html "class in akka.http.impl.engine.http2") |  |
| [Http2Protocol.Flags$](Http2Protocol.Flags$.html "class in akka.http.impl.engine.http2") |  |
| [Http2Protocol.FrameType](Http2Protocol.FrameType.html "class in akka.http.impl.engine.http2") |  |
| [Http2Protocol.FrameType$](Http2Protocol.FrameType$.html "class in akka.http.impl.engine.http2") |  |
| [Http2Protocol.FrameType$.CONTINUATION$](Http2Protocol.FrameType$.CONTINUATION$.html "class in akka.http.impl.engine.http2") |  |
| [Http2Protocol.FrameType$.DATA$](Http2Protocol.FrameType$.DATA$.html "class in akka.http.impl.engine.http2") |  |
| [Http2Protocol.FrameType$.GOAWAY$](Http2Protocol.FrameType$.GOAWAY$.html "class in akka.http.impl.engine.http2") |  |
| [Http2Protocol.FrameType$.HEADERS$](Http2Protocol.FrameType$.HEADERS$.html "class in akka.http.impl.engine.http2") |  |
| [Http2Protocol.FrameType$.PING$](Http2Protocol.FrameType$.PING$.html "class in akka.http.impl.engine.http2") |  |
| [Http2Protocol.FrameType$.PRIORITY$](Http2Protocol.FrameType$.PRIORITY$.html "class in akka.http.impl.engine.http2") |  |
| [Http2Protocol.FrameType$.PUSH\_PROMISE$](Http2Protocol.FrameType$.PUSH_PROMISE$.html "class in akka.http.impl.engine.http2") |  |
| [Http2Protocol.FrameType$.RST\_STREAM$](Http2Protocol.FrameType$.RST_STREAM$.html "class in akka.http.impl.engine.http2") |  |
| [Http2Protocol.FrameType$.SETTINGS$](Http2Protocol.FrameType$.SETTINGS$.html "class in akka.http.impl.engine.http2") |  |
| [Http2Protocol.FrameType$.WINDOW\_UPDATE$](Http2Protocol.FrameType$.WINDOW_UPDATE$.html "class in akka.http.impl.engine.http2") |  |
| [Http2Protocol.SettingIdentifier](Http2Protocol.SettingIdentifier.html "class in akka.http.impl.engine.http2") |  |
| [Http2Protocol.SettingIdentifier$](Http2Protocol.SettingIdentifier$.html "class in akka.http.impl.engine.http2") |  |
| [Http2Protocol.SettingIdentifier$.SETTINGS\_ENABLE\_PUSH$](Http2Protocol.SettingIdentifier$.SETTINGS_ENABLE_PUSH$.html "class in akka.http.impl.engine.http2") | SETTINGS\_ENABLE\_PUSH (0x2\): This setting can be used to disable  server push (Section 8\.2\). |
| [Http2Protocol.SettingIdentifier$.SETTINGS\_HEADER\_TABLE\_SIZE$](Http2Protocol.SettingIdentifier$.SETTINGS_HEADER_TABLE_SIZE$.html "class in akka.http.impl.engine.http2") | SETTINGS\_HEADER\_TABLE\_SIZE (0x1\): Allows the sender to inform the  remote endpoint of the maximum size of the header compression  table used to decode header blocks, in octets. |
| [Http2Protocol.SettingIdentifier$.SETTINGS\_INITIAL\_WINDOW\_SIZE$](Http2Protocol.SettingIdentifier$.SETTINGS_INITIAL_WINDOW_SIZE$.html "class in akka.http.impl.engine.http2") | SETTINGS\_INITIAL\_WINDOW\_SIZE (0x4\): Indicates the sender's initial  window size (in octets) for stream\-level flow control. |
| [Http2Protocol.SettingIdentifier$.SETTINGS\_MAX\_CONCURRENT\_STREAMS$](Http2Protocol.SettingIdentifier$.SETTINGS_MAX_CONCURRENT_STREAMS$.html "class in akka.http.impl.engine.http2") | SETTINGS\_MAX\_CONCURRENT\_STREAMS (0x3\): Indicates the maximum number  of concurrent streams that the sender will allow. |
| [Http2Protocol.SettingIdentifier$.SETTINGS\_MAX\_FRAME\_SIZE$](Http2Protocol.SettingIdentifier$.SETTINGS_MAX_FRAME_SIZE$.html "class in akka.http.impl.engine.http2") | SETTINGS\_MAX\_FRAME\_SIZE (0x5\): Indicates the size of the largest  frame payload that the sender is willing to receive, in octets. |
| [Http2Protocol.SettingIdentifier$.SETTINGS\_MAX\_HEADER\_LIST\_SIZE$](Http2Protocol.SettingIdentifier$.SETTINGS_MAX_HEADER_LIST_SIZE$.html "class in akka.http.impl.engine.http2") | SETTINGS\_MAX\_HEADER\_LIST\_SIZE (0x6\): This advisory setting informs a  peer of the maximum size of header list that the sender is  prepared to accept, in octets. |
| [Http2Protocol$](Http2Protocol$.html "class in akka.http.impl.engine.http2") | INTERNAL API |
| [Http2ServerDemux](Http2ServerDemux.html "class in akka.http.impl.engine.http2") | INTERNAL API |
| [Http2ServerDemux$](Http2ServerDemux$.html "class in akka.http.impl.engine.http2") |  |
| [Http2StreamHandling.Closed$](Http2StreamHandling.Closed$.html "class in akka.http.impl.engine.http2") |  |
| [Http2StreamHandling.CollectingIncomingData](Http2StreamHandling.CollectingIncomingData.html "class in akka.http.impl.engine.http2") | Special state that allows collecting some incoming data before dispatching it either as strict or streamed entity |
| [Http2StreamHandling.CollectingIncomingData$](Http2StreamHandling.CollectingIncomingData$.html "class in akka.http.impl.engine.http2") |  |
| [Http2StreamHandling.HalfClosedLocal](Http2StreamHandling.HalfClosedLocal.html "class in akka.http.impl.engine.http2") | We have closed the outgoing stream, but the incoming stream is still going. |
| [Http2StreamHandling.HalfClosedLocal$](Http2StreamHandling.HalfClosedLocal$.html "class in akka.http.impl.engine.http2") |  |
| [Http2StreamHandling.HalfClosedLocalWaitingForPeerStream](Http2StreamHandling.HalfClosedLocalWaitingForPeerStream.html "class in akka.http.impl.engine.http2") |  |
| [Http2StreamHandling.HalfClosedLocalWaitingForPeerStream$](Http2StreamHandling.HalfClosedLocalWaitingForPeerStream$.html "class in akka.http.impl.engine.http2") |  |
| [Http2StreamHandling.HalfClosedRemoteSendingData](Http2StreamHandling.HalfClosedRemoteSendingData.html "class in akka.http.impl.engine.http2") | They have closed the incoming stream, but the outgoing stream is still going. |
| [Http2StreamHandling.HalfClosedRemoteSendingData$](Http2StreamHandling.HalfClosedRemoteSendingData$.html "class in akka.http.impl.engine.http2") |  |
| [Http2StreamHandling.HalfClosedRemoteWaitingForOutgoingStream](Http2StreamHandling.HalfClosedRemoteWaitingForOutgoingStream.html "class in akka.http.impl.engine.http2") |  |
| [Http2StreamHandling.HalfClosedRemoteWaitingForOutgoingStream$](Http2StreamHandling.HalfClosedRemoteWaitingForOutgoingStream$.html "class in akka.http.impl.engine.http2") |  |
| [Http2StreamHandling.Idle$](Http2StreamHandling.Idle$.html "class in akka.http.impl.engine.http2") |  |
| [Http2StreamHandling.IncomingStreamBuffer](Http2StreamHandling.IncomingStreamBuffer.html "class in akka.http.impl.engine.http2") |  |
| [Http2StreamHandling.Open](Http2StreamHandling.Open.html "class in akka.http.impl.engine.http2") |  |
| [Http2StreamHandling.Open$](Http2StreamHandling.Open$.html "class in akka.http.impl.engine.http2") |  |
| [Http2StreamHandling.OpenReceivingDataFirst](Http2StreamHandling.OpenReceivingDataFirst.html "class in akka.http.impl.engine.http2") |  |
| [Http2StreamHandling.OpenReceivingDataFirst$](Http2StreamHandling.OpenReceivingDataFirst$.html "class in akka.http.impl.engine.http2") |  |
| [Http2StreamHandling.OpenSendingData](Http2StreamHandling.OpenSendingData.html "class in akka.http.impl.engine.http2") |  |
| [Http2StreamHandling.OpenSendingData$](Http2StreamHandling.OpenSendingData$.html "class in akka.http.impl.engine.http2") |  |
| [Http2StreamHandling.OutStream$](Http2StreamHandling.OutStream$.html "class in akka.http.impl.engine.http2") |  |
| [Http2StreamHandling.OutStreamImpl](Http2StreamHandling.OutStreamImpl.html "class in akka.http.impl.engine.http2") |  |
| [Http2StreamHandling.ReceivingData](Http2StreamHandling.ReceivingData.html "class in akka.http.impl.engine.http2") |  |
| [Http2StreamHandling.ReceivingDataWithBuffer](Http2StreamHandling.ReceivingDataWithBuffer.html "class in akka.http.impl.engine.http2") |  |
| [Http2StreamHandling.StreamState](Http2StreamHandling.StreamState.html "class in akka.http.impl.engine.http2") | States roughly correspond to states as given in https://http2\.github.io/http2\-spec/\#StreamStates. |
| [Http2StreamHandling$](Http2StreamHandling$.html "class in akka.http.impl.engine.http2") |  |
| [Http2SubStream](Http2SubStream.html "class in akka.http.impl.engine.http2") | Represents one direction of an Http2 substream. |
| [Http2SubStream$](Http2SubStream$.html "class in akka.http.impl.engine.http2") |  |
| [HttpMessageRendering](HttpMessageRendering.html "class in akka.http.impl.engine.http2") | INTERNAL API |
| [HttpMessageRendering$](HttpMessageRendering$.html "class in akka.http.impl.engine.http2") | INTERNAL API |
| [IncomingFlowController.WindowIncrements](IncomingFlowController.WindowIncrements.html "class in akka.http.impl.engine.http2") |  |
| [IncomingFlowController.WindowIncrements$](IncomingFlowController.WindowIncrements$.html "class in akka.http.impl.engine.http2") |  |
| [IncomingFlowController$](IncomingFlowController$.html "class in akka.http.impl.engine.http2") | INTERNAL API |
| [MessageRendering](MessageRendering.html "class in akka.http.impl.engine.http2")\<R extends [HttpMessage](../../../scaladsl/model/HttpMessage.html "interface in akka.http.scaladsl.model")\> | INTERNAL API |
| [NoOpTelemetry](NoOpTelemetry.html "class in akka.http.impl.engine.http2") | INTERNAL API |
| [NoOpTelemetry$](NoOpTelemetry$.html "class in akka.http.impl.engine.http2") | INTERNAL API |
| [OutgoingConnectionBuilderImpl](OutgoingConnectionBuilderImpl.html "class in akka.http.impl.engine.http2") | INTERNAL API |
| [OutgoingConnectionBuilderImpl$](OutgoingConnectionBuilderImpl$.html "class in akka.http.impl.engine.http2") | INTERNAL API |
| [PriorityTree$](PriorityTree$.html "class in akka.http.impl.engine.http2") | INTERNAL API |
| [ProtocolSwitch](ProtocolSwitch.html "class in akka.http.impl.engine.http2") | INTERNAL API |
| [ProtocolSwitch$](ProtocolSwitch$.html "class in akka.http.impl.engine.http2") | INTERNAL API |
| [PullFrameResult](PullFrameResult.html "class in akka.http.impl.engine.http2") |  |
| [PullFrameResult.SendFrame](PullFrameResult.SendFrame.html "class in akka.http.impl.engine.http2") |  |
| [PullFrameResult.SendFrame$](PullFrameResult.SendFrame$.html "class in akka.http.impl.engine.http2") |  |
| [PullFrameResult.SendFrameAndTrailer](PullFrameResult.SendFrameAndTrailer.html "class in akka.http.impl.engine.http2") |  |
| [PullFrameResult.SendFrameAndTrailer$](PullFrameResult.SendFrameAndTrailer$.html "class in akka.http.impl.engine.http2") |  |
| [PullFrameResult$](PullFrameResult$.html "class in akka.http.impl.engine.http2") |  |
| [RequestErrorFlow](RequestErrorFlow.html "class in akka.http.impl.engine.http2") | INTERNAL API |
| [RequestErrorFlow$](RequestErrorFlow$.html "class in akka.http.impl.engine.http2") | INTERNAL API |
| [RequestParsing](RequestParsing.html "class in akka.http.impl.engine.http2") | INTERNAL API |
| [RequestParsing.BadRequest](RequestParsing.BadRequest.html "class in akka.http.impl.engine.http2") |  |
| [RequestParsing.BadRequest$](RequestParsing.BadRequest$.html "class in akka.http.impl.engine.http2") |  |
| [RequestParsing.OkRequest](RequestParsing.OkRequest.html "class in akka.http.impl.engine.http2") |  |
| [RequestParsing.OkRequest$](RequestParsing.OkRequest$.html "class in akka.http.impl.engine.http2") |  |
| [RequestParsing$](RequestParsing$.html "class in akka.http.impl.engine.http2") | INTERNAL API |
| [RequestRendering](RequestRendering.html "class in akka.http.impl.engine.http2") | INTERNAL API |
| [ResponseRendering](ResponseRendering.html "class in akka.http.impl.engine.http2") | INTERNAL API |
| [StreamPrioritizer.First$](StreamPrioritizer.First$.html "class in akka.http.impl.engine.http2") | A prioritizer that ignores priority information and just sends to the first stream |
| [StreamPrioritizer$](StreamPrioritizer$.html "class in akka.http.impl.engine.http2") | INTERNAL API |
| [TelemetryAttributes](TelemetryAttributes.html "class in akka.http.impl.engine.http2") | INTERNAL API |
| [TelemetryAttributes.ClientMeta](TelemetryAttributes.ClientMeta.html "class in akka.http.impl.engine.http2") |  |
| [TelemetryAttributes.ClientMeta$](TelemetryAttributes.ClientMeta$.html "class in akka.http.impl.engine.http2") |  |
| [TelemetryAttributes$](TelemetryAttributes$.html "class in akka.http.impl.engine.http2") | INTERNAL API |
| [TelemetrySpi$](TelemetrySpi$.html "class in akka.http.impl.engine.http2") | INTERNAL API |
- Exception Summary 
| Exception | Description |
| [Http2Compliance.Http2ProtocolException](Http2Compliance.Http2ProtocolException.html "class in akka.http.impl.engine.http2") |  |
| --- | --- |
| [Http2Compliance.Http2ProtocolStreamException](Http2Compliance.Http2ProtocolStreamException.html "class in akka.http.impl.engine.http2") |  |
| [Http2Compliance.IllegalHttp2FrameSize](Http2Compliance.IllegalHttp2FrameSize.html "class in akka.http.impl.engine.http2") |  |
| [Http2Compliance.IllegalHttp2StreamDependency](Http2Compliance.IllegalHttp2StreamDependency.html "class in akka.http.impl.engine.http2") |  |
| [Http2Compliance.IllegalHttp2StreamIdException](Http2Compliance.IllegalHttp2StreamIdException.html "class in akka.http.impl.engine.http2") |  |
| [Http2Compliance.IllegalPayloadInSettingsAckFrame](Http2Compliance.IllegalPayloadInSettingsAckFrame.html "class in akka.http.impl.engine.http2") |  |
| [Http2Compliance.IllegalPayloadLengthInSettingsFrame](Http2Compliance.IllegalPayloadLengthInSettingsFrame.html "class in akka.http.impl.engine.http2") |  |
| [Http2Compliance.MissingHttpIdHeaderException](Http2Compliance.MissingHttpIdHeaderException.html "class in akka.http.impl.engine.http2") |  |

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/BufferedOutlet.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/BufferedOutletExtended.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/ByteFlag$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/ByteFlag.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/ConfigurablePing$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/ConfigurablePing.DisabledPingState$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/ConfigurablePing.EnabledPingState.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/ConfigurablePing.PingState$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/ConfigurablePing.PingState.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/ConfigurablePing.Tick$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/ConfigurablePing.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/FrameEvent$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/FrameEvent.ContinuationFrame$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/FrameEvent.ContinuationFrame.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/FrameEvent.DataFrame$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/FrameEvent.DataFrame.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/FrameEvent.GoAwayFrame$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/FrameEvent.GoAwayFrame.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/FrameEvent.HeadersFrame$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/FrameEvent.HeadersFrame.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/FrameEvent.ParsedHeadersFrame$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/FrameEvent.ParsedHeadersFrame.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/FrameEvent.PingFrame$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/FrameEvent.PingFrame.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/FrameEvent.PriorityFrame$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/FrameEvent.PriorityFrame.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/FrameEvent.PushPromiseFrame$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/FrameEvent.PushPromiseFrame.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/FrameEvent.RstStreamFrame$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/FrameEvent.RstStreamFrame.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/FrameEvent.Setting$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/FrameEvent.Setting.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/FrameEvent.SettingsAckFrame$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/FrameEvent.SettingsAckFrame.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/FrameEvent.SettingsFrame$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/FrameEvent.SettingsFrame.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/FrameEvent.StreamFrameEvent.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/FrameEvent.UnknownFrameEvent$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/FrameEvent.UnknownFrameEvent.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/FrameEvent.WindowUpdateFrame$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/FrameEvent.WindowUpdateFrame.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/FrameEvent.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/FrameLogger$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/FrameLogger.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/GenericOutlet.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/GenericOutletSupport.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/Http2$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/Http2.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/Http2AlpnSupport$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/Http2AlpnSupport.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/package-summary.html](https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/package-summary.html)*