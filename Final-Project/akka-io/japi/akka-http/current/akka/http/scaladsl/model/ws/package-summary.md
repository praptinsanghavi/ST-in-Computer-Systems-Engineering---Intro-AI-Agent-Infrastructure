---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:58:50Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ws/package-summary.html
title: akka.http.scaladsl.model.ws
---

# akka.http.scaladsl.model.ws

## Content

# Package akka.http.scaladsl.model.ws

- Interface Summary 
| Interface | Description |
| [BinaryMessage](BinaryMessage.html "interface in akka.http.scaladsl.model.ws") | Represents a WebSocket binary message. |
| --- | --- |
| [Message](Message.html "interface in akka.http.scaladsl.model.ws") | The ADT for WebSocket messages. |
| [TextMessage](TextMessage.html "interface in akka.http.scaladsl.model.ws") | Represents a WebSocket text message. |
| [UpgradeToWebSocket](UpgradeToWebSocket.html "interface in akka.http.scaladsl.model.ws") | Deprecated. This low\-level API has been replaced by an attribute. |
| [WebSocketUpgrade](WebSocketUpgrade.html "interface in akka.http.scaladsl.model.ws") | An attribute that will be added to an WebSocket upgrade HttpRequest that  enables a request handler to upgrade this connection to a WebSocket connection and  registers a WebSocket handler. |
| [WebSocketUpgradeResponse](WebSocketUpgradeResponse.html "interface in akka.http.scaladsl.model.ws") | Represents the response to a websocket upgrade request. |
- Class Summary 
| Class | Description |
| [BinaryMessage.Streamed](BinaryMessage.Streamed.html "class in akka.http.scaladsl.model.ws") |  |
| --- | --- |
| [BinaryMessage.Streamed$](BinaryMessage.Streamed$.html "class in akka.http.scaladsl.model.ws") |  |
| [BinaryMessage.Strict](BinaryMessage.Strict.html "class in akka.http.scaladsl.model.ws") | A strict [`BinaryMessage`](BinaryMessage.html "interface in akka.http.scaladsl.model.ws") that contains the complete data as a `ByteString`. |
| [BinaryMessage.Strict$](BinaryMessage.Strict$.html "class in akka.http.scaladsl.model.ws") |  |
| [BinaryMessage$](BinaryMessage$.html "class in akka.http.scaladsl.model.ws") |  |
| [InvalidUpgradeResponse](InvalidUpgradeResponse.html "class in akka.http.scaladsl.model.ws") |  |
| [InvalidUpgradeResponse$](InvalidUpgradeResponse$.html "class in akka.http.scaladsl.model.ws") |  |
| [TextMessage.Streamed](TextMessage.Streamed.html "class in akka.http.scaladsl.model.ws") |  |
| [TextMessage.Streamed$](TextMessage.Streamed$.html "class in akka.http.scaladsl.model.ws") |  |
| [TextMessage.Strict](TextMessage.Strict.html "class in akka.http.scaladsl.model.ws") | A strict [`TextMessage`](TextMessage.html "interface in akka.http.scaladsl.model.ws") that contains the complete data as a `String`. |
| [TextMessage.Strict$](TextMessage.Strict$.html "class in akka.http.scaladsl.model.ws") |  |
| [TextMessage$](TextMessage$.html "class in akka.http.scaladsl.model.ws") |  |
| [ValidUpgrade](ValidUpgrade.html "class in akka.http.scaladsl.model.ws") |  |
| [ValidUpgrade$](ValidUpgrade$.html "class in akka.http.scaladsl.model.ws") |  |
| [WebSocketRequest](WebSocketRequest.html "class in akka.http.scaladsl.model.ws") | Represents a WebSocket request. |
| [WebSocketRequest$](WebSocketRequest$.html "class in akka.http.scaladsl.model.ws") |  |
- Exception Summary 
| Exception | Description |
| [PeerClosedConnectionException](PeerClosedConnectionException.html "class in akka.http.scaladsl.model.ws") | A PeerClosedConnectionException will be reported to the WebSocket handler if the peer has closed the connection. |
| --- | --- |

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ws/BinaryMessage$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ws/BinaryMessage.Streamed$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ws/BinaryMessage.Streamed.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ws/BinaryMessage.Strict$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ws/BinaryMessage.Strict.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ws/BinaryMessage.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ws/InvalidUpgradeResponse$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ws/InvalidUpgradeResponse.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ws/Message.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ws/PeerClosedConnectionException.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ws/TextMessage$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ws/TextMessage.Streamed$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ws/TextMessage.Streamed.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ws/TextMessage.Strict$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ws/TextMessage.Strict.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ws/TextMessage.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ws/UpgradeToWebSocket.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ws/ValidUpgrade$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ws/ValidUpgrade.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ws/WebSocketRequest$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ws/WebSocketRequest.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ws/WebSocketUpgrade.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ws/WebSocketUpgradeResponse.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ws/package-summary.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ws/package-summary.html)*