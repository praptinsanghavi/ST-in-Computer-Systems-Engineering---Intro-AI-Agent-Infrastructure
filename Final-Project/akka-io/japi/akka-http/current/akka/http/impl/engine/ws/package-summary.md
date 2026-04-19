---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:58:34Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/package-summary.html
title: akka.http.impl.engine.ws
---

# akka.http.impl.engine.ws

## Content

# Package akka.http.impl.engine.ws

- Interface Summary 
| Interface | Description |
| [FrameEvent](FrameEvent.html "interface in akka.http.impl.engine.ws") | The low\-level WebSocket framing model. |
| --- | --- |
| [FrameEventOrError](FrameEventOrError.html "interface in akka.http.impl.engine.ws") |  |
| [FrameHandler.BypassEvent](FrameHandler.BypassEvent.html "interface in akka.http.impl.engine.ws") |  |
| [FrameHandler.MessageDataPart](FrameHandler.MessageDataPart.html "interface in akka.http.impl.engine.ws") |  |
| [FrameHandler.MessagePart](FrameHandler.MessagePart.html "interface in akka.http.impl.engine.ws") |  |
| [FrameHandler.Output](FrameHandler.Output.html "interface in akka.http.impl.engine.ws") |  |
| [Protocol.Opcode](Protocol.Opcode.html "interface in akka.http.impl.engine.ws") |  |
| [StreamingCharsetDecoder](StreamingCharsetDecoder.html "interface in akka.http.impl.engine.ws") |  |
| [StreamingCharsetDecoderInstance](StreamingCharsetDecoderInstance.html "interface in akka.http.impl.engine.ws") |  |
- Class Summary 
| Class | Description |
| [FrameData](FrameData.html "class in akka.http.impl.engine.ws") | Frame data that was received after the start of the frame.. |
| --- | --- |
| [FrameData$](FrameData$.html "class in akka.http.impl.engine.ws") |  |
| [FrameError](FrameError.html "class in akka.http.impl.engine.ws") |  |
| [FrameError$](FrameError$.html "class in akka.http.impl.engine.ws") |  |
| [FrameEvent$](FrameEvent$.html "class in akka.http.impl.engine.ws") |  |
| [FrameEventParser](FrameEventParser.html "class in akka.http.impl.engine.ws") | Streaming parser for the WebSocket framing protocol as defined in RFC6455 |
| [FrameEventParser$](FrameEventParser$.html "class in akka.http.impl.engine.ws") | Streaming parser for the WebSocket framing protocol as defined in RFC6455 |
| [FrameEventRenderer](FrameEventRenderer.html "class in akka.http.impl.engine.ws") | Renders FrameEvents to ByteString. |
| [FrameHandler](FrameHandler.html "class in akka.http.impl.engine.ws") | The frame handler validates frames, multiplexes data to the user handler or to the bypass and  UTF\-8 decodes text frames. |
| [FrameHandler.ActivelyCloseWithCode](FrameHandler.ActivelyCloseWithCode.html "class in akka.http.impl.engine.ws") |  |
| [FrameHandler.ActivelyCloseWithCode$](FrameHandler.ActivelyCloseWithCode$.html "class in akka.http.impl.engine.ws") |  |
| [FrameHandler.BinaryMessagePart](FrameHandler.BinaryMessagePart.html "class in akka.http.impl.engine.ws") |  |
| [FrameHandler.BinaryMessagePart$](FrameHandler.BinaryMessagePart$.html "class in akka.http.impl.engine.ws") |  |
| [FrameHandler.DirectAnswer](FrameHandler.DirectAnswer.html "class in akka.http.impl.engine.ws") |  |
| [FrameHandler.DirectAnswer$](FrameHandler.DirectAnswer$.html "class in akka.http.impl.engine.ws") |  |
| [FrameHandler.MessageEnd$](FrameHandler.MessageEnd$.html "class in akka.http.impl.engine.ws") |  |
| [FrameHandler.PeerClosed](FrameHandler.PeerClosed.html "class in akka.http.impl.engine.ws") |  |
| [FrameHandler.PeerClosed$](FrameHandler.PeerClosed$.html "class in akka.http.impl.engine.ws") |  |
| [FrameHandler.TextMessagePart](FrameHandler.TextMessagePart.html "class in akka.http.impl.engine.ws") |  |
| [FrameHandler.TextMessagePart$](FrameHandler.TextMessagePart$.html "class in akka.http.impl.engine.ws") |  |
| [FrameHandler.UserHandlerCompleted$](FrameHandler.UserHandlerCompleted$.html "class in akka.http.impl.engine.ws") |  |
| [FrameHandler.UserHandlerErredOut](FrameHandler.UserHandlerErredOut.html "class in akka.http.impl.engine.ws") |  |
| [FrameHandler.UserHandlerErredOut$](FrameHandler.UserHandlerErredOut$.html "class in akka.http.impl.engine.ws") |  |
| [FrameHandler$](FrameHandler$.html "class in akka.http.impl.engine.ws") | The frame handler validates frames, multiplexes data to the user handler or to the bypass and  UTF\-8 decodes text frames. |
| [FrameHeader](FrameHeader.html "class in akka.http.impl.engine.ws") | Model of the frame header |
| [FrameHeader$](FrameHeader$.html "class in akka.http.impl.engine.ws") |  |
| [FrameLogger](FrameLogger.html "class in akka.http.impl.engine.ws") | INTERNAL API |
| [FrameLogger$](FrameLogger$.html "class in akka.http.impl.engine.ws") | INTERNAL API |
| [FrameOutHandler](FrameOutHandler.html "class in akka.http.impl.engine.ws") | Implements the transport connection close handling at the end of the pipeline. |
| [FrameOutHandler$](FrameOutHandler$.html "class in akka.http.impl.engine.ws") |  |
| [FrameStart](FrameStart.html "class in akka.http.impl.engine.ws") | Starts a frame. |
| [FrameStart$](FrameStart$.html "class in akka.http.impl.engine.ws") |  |
| [Handshake](Handshake.html "class in akka.http.impl.engine.ws") | Server\-side implementation of the WebSocket handshake |
| [Handshake.Client$](Handshake.Client$.html "class in akka.http.impl.engine.ws") |  |
| [Handshake.Server$](Handshake.Server$.html "class in akka.http.impl.engine.ws") |  |
| [Handshake$](Handshake$.html "class in akka.http.impl.engine.ws") | Server\-side implementation of the WebSocket handshake |
| [Masking](Masking.html "class in akka.http.impl.engine.ws") | Implements WebSocket Frame masking. |
| [Masking$](Masking$.html "class in akka.http.impl.engine.ws") | Implements WebSocket Frame masking. |
| [MessageToFrameRenderer](MessageToFrameRenderer.html "class in akka.http.impl.engine.ws") | Renders messages to full frames. |
| [MessageToFrameRenderer$](MessageToFrameRenderer$.html "class in akka.http.impl.engine.ws") | Renders messages to full frames. |
| [Protocol](Protocol.html "class in akka.http.impl.engine.ws") | Contains WebSocket protocol constants |
| [Protocol.CloseCodes$](Protocol.CloseCodes$.html "class in akka.http.impl.engine.ws") | Close status codes as defined at http://tools.ietf.org/html/rfc6455\#section\-7\.4\.1 |
| [Protocol.Opcode$](Protocol.Opcode$.html "class in akka.http.impl.engine.ws") |  |
| [Protocol.Opcode$.AbstractOpcode](Protocol.Opcode$.AbstractOpcode.html "class in akka.http.impl.engine.ws") |  |
| [Protocol.Opcode$.Binary$](Protocol.Opcode$.Binary$.html "class in akka.http.impl.engine.ws") |  |
| [Protocol.Opcode$.Close$](Protocol.Opcode$.Close$.html "class in akka.http.impl.engine.ws") |  |
| [Protocol.Opcode$.Continuation$](Protocol.Opcode$.Continuation$.html "class in akka.http.impl.engine.ws") |  |
| [Protocol.Opcode$.Other](Protocol.Opcode$.Other.html "class in akka.http.impl.engine.ws") |  |
| [Protocol.Opcode$.Other$](Protocol.Opcode$.Other$.html "class in akka.http.impl.engine.ws") |  |
| [Protocol.Opcode$.Ping$](Protocol.Opcode$.Ping$.html "class in akka.http.impl.engine.ws") |  |
| [Protocol.Opcode$.Pong$](Protocol.Opcode$.Pong$.html "class in akka.http.impl.engine.ws") |  |
| [Protocol.Opcode$.Text$](Protocol.Opcode$.Text$.html "class in akka.http.impl.engine.ws") |  |
| [Protocol$](Protocol$.html "class in akka.http.impl.engine.ws") | Contains WebSocket protocol constants |
| [ProtocolException$](ProtocolException$.html "class in akka.http.impl.engine.ws") |  |
| [Randoms](Randoms.html "class in akka.http.impl.engine.ws") | INTERNAL API |
| [Randoms.SecureRandomInstances$](Randoms.SecureRandomInstances$.html "class in akka.http.impl.engine.ws") | A factory that creates SecureRandom instances |
| [Randoms$](Randoms$.html "class in akka.http.impl.engine.ws") | INTERNAL API |
| [UpgradeToWebSocketLowLevel](UpgradeToWebSocketLowLevel.html "class in akka.http.impl.engine.ws") | Currently internal API to handle FrameEvents directly. |
| [Utf8Decoder](Utf8Decoder.html "class in akka.http.impl.engine.ws") | A Utf8 \-\> Utf16 (\= Java char) decoder. |
| [Utf8Decoder$](Utf8Decoder$.html "class in akka.http.impl.engine.ws") | A Utf8 \-\> Utf16 (\= Java char) decoder. |
| [Utf8Encoder](Utf8Encoder.html "class in akka.http.impl.engine.ws") | A utf16 (\= Java char) to utf8 encoder. |
| [Utf8Encoder$](Utf8Encoder$.html "class in akka.http.impl.engine.ws") | A utf16 (\= Java char) to utf8 encoder. |
| [WebSocket](WebSocket.html "class in akka.http.impl.engine.ws") | INTERNAL API |
| [WebSocket.Tick$](WebSocket.Tick$.html "class in akka.http.impl.engine.ws") |  |
| [WebSocket$](WebSocket$.html "class in akka.http.impl.engine.ws") | INTERNAL API |
| [WebSocketClientBlueprint](WebSocketClientBlueprint.html "class in akka.http.impl.engine.ws") | INTERNAL API |
| [WebSocketClientBlueprint$](WebSocketClientBlueprint$.html "class in akka.http.impl.engine.ws") | INTERNAL API |
- Exception Summary 
| Exception | Description |
| [ProtocolException](ProtocolException.html "class in akka.http.impl.engine.ws") | INTERNAL API |
| --- | --- |

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/FrameData$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/FrameData.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/FrameError$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/FrameError.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/FrameEvent$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/FrameEvent.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/FrameEventOrError.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/FrameEventParser$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/FrameEventParser.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/FrameEventRenderer.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/FrameHandler$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/FrameHandler.ActivelyCloseWithCode$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/FrameHandler.ActivelyCloseWithCode.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/FrameHandler.BinaryMessagePart$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/FrameHandler.BinaryMessagePart.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/FrameHandler.BypassEvent.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/FrameHandler.DirectAnswer$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/FrameHandler.DirectAnswer.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/FrameHandler.MessageDataPart.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/FrameHandler.MessageEnd$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/FrameHandler.MessagePart.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/FrameHandler.Output.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/FrameHandler.PeerClosed$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/FrameHandler.PeerClosed.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/FrameHandler.TextMessagePart$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/FrameHandler.TextMessagePart.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/FrameHandler.UserHandlerCompleted$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/FrameHandler.UserHandlerErredOut$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/FrameHandler.UserHandlerErredOut.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/FrameHandler.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/FrameHeader$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/FrameHeader.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/FrameLogger$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/FrameLogger.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/FrameOutHandler$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/FrameOutHandler.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/FrameStart$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/FrameStart.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/Handshake$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/Handshake.Client$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/Handshake.Server$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/Handshake.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/Masking$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/Masking.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/MessageToFrameRenderer$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/MessageToFrameRenderer.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/Protocol$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/Protocol.CloseCodes$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/Protocol.Opcode$.AbstractOpcode.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/Protocol.Opcode$.Binary$.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/package-summary.html](https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/package-summary.html)*