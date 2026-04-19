---
description: Akka HTTP 10.7.4 - akka.http.scaladsl.model.ws
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:50:49Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/ws/index.html
title: Akka HTTP 10.7.4 - akka.http.scaladsl.model.ws
---

# Akka HTTP 10.7.4 - akka.http.scaladsl.model.ws

> **Summary:** Akka HTTP 10.7.4 - akka.http.scaladsl.model.ws

## Content

Akka HTTP10\.7\.4 \< Back****# Packages

- [**](../../../../../index.html "Permalink")  package [root](../../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/index.html "Permalink")  package [akka](../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/http/index.html "Permalink")  package [http](../../../index.html)Definition Classes[akka](../../../../index.html)
- [**](../../../../../akka/http/scaladsl/index.html "Permalink")  package [scaladsl](../../index.html)Definition Classes[http](../../../index.html)
- [**](../../../../../akka/http/scaladsl/model/index.html "Permalink")  package [model](../index.html)Definition Classes[scaladsl](../../index.html)
- [**](../../../../../akka/http/scaladsl/model/headers/index.html "Permalink")  package [headers](../headers/index.html)Definition Classes[model](../index.html)
- [**](../../../../../akka/http/scaladsl/model/http2/index.html "Permalink")  package [http2](../http2/index.html)Definition Classes[model](../index.html)
- [**](../../../../../akka/http/scaladsl/model/sse/index.html "Permalink")  package [sse](../sse/index.html)Definition Classes[model](../index.html)
- [**](../../../../../akka/http/scaladsl/model/ws/index.html "Permalink")  package wsDefinition Classes[model](../index.html)
- [BinaryMessage](BinaryMessage.html "Represents a WebSocket binary message.")
- [InvalidUpgradeResponse](InvalidUpgradeResponse.html)
- [Message](Message.html "The ADT for WebSocket messages.")
- [PeerClosedConnectionException](PeerClosedConnectionException.html "A PeerClosedConnectionException will be reported to the WebSocket handler if the peer has closed the connection.")
- [TextMessage](TextMessage.html "Represents a WebSocket text message.")
- [UpgradeToWebSocket](UpgradeToWebSocket.html "A custom header that will be added to an WebSocket upgrade HttpRequest that enables a request handler to upgrade this connection to a WebSocket connection and registers a WebSocket handler.")
- [ValidUpgrade](ValidUpgrade.html)
- [WebSocketRequest](WebSocketRequest.html "Represents a WebSocket request.")
- [WebSocketUpgrade](WebSocketUpgrade.html "An attribute that will be added to an WebSocket upgrade HttpRequest that enables a request handler to upgrade this connection to a WebSocket connection and registers a WebSocket handler.")
- [WebSocketUpgradeResponse](WebSocketUpgradeResponse.html "Represents the response to a websocket upgrade request.")
p[akka](../../../../index.html).[http](../../../index.html).[scaladsl](../../index.html).[model](../index.html)

# ws[**](../../../../../akka/http/scaladsl/model/ws/index.html "Permalink")

#### package ws

Content Hierarchy****Ordering1. Alphabetic
Visibility1. Public
2. Protected
### Type Members

1. [**](../../../../../akka/http/scaladsl/model/ws/BinaryMessage.html "Permalink") sealed  trait [BinaryMessage](BinaryMessage.html "Represents a WebSocket binary message.") extends [javadsl.model.ws.BinaryMessage](../../../javadsl/model/ws/BinaryMessage.html) with [Message](Message.html)Represents a WebSocket binary message.

Represents a WebSocket binary message. A binary message can either be [BinaryMessage.Strict](BinaryMessage$$Strict.html) in which case
the complete data is already available or it can be [BinaryMessage.Streamed](BinaryMessage$$Streamed.html) in which case `dataStream`
will return a Source streaming the data as it comes in.
2. [**](../../../../../akka/http/scaladsl/model/ws/InvalidUpgradeResponse.html "Permalink") final  case class [InvalidUpgradeResponse](InvalidUpgradeResponse.html)(response: [HttpResponse](../HttpResponse.html), cause: String) extends [WebSocketUpgradeResponse](WebSocketUpgradeResponse.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
3. [**](../../../../../akka/http/scaladsl/model/ws/Message.html "Permalink") sealed  trait [Message](Message.html "The ADT for WebSocket messages.") extends [javadsl.model.ws.Message](../../../javadsl/model/ws/Message.html)The ADT for WebSocket messages.

The ADT for WebSocket messages. A message can either be a binary or a text message.
4. [**](../../../../../akka/http/scaladsl/model/ws/PeerClosedConnectionException.html "Permalink")  class [PeerClosedConnectionException](PeerClosedConnectionException.html "A PeerClosedConnectionException will be reported to the WebSocket handler if the peer has closed the connection.") extends RuntimeException with [javadsl.model.ws.PeerClosedConnectionException](../../../javadsl/model/ws/PeerClosedConnectionException.html)A PeerClosedConnectionException will be reported to the WebSocket handler if the peer has closed the connection.

A PeerClosedConnectionException will be reported to the WebSocket handler if the peer has closed the connection.
`closeCode` and `closeReason` contain close messages as reported by the peer.
5. [**](../../../../../akka/http/scaladsl/model/ws/TextMessage.html "Permalink") sealed  trait [TextMessage](TextMessage.html "Represents a WebSocket text message.") extends [javadsl.model.ws.TextMessage](../../../javadsl/model/ws/TextMessage.html) with [Message](Message.html)Represents a WebSocket text message.

Represents a WebSocket text message. A text message can either be a [TextMessage.Strict](TextMessage$$Strict.html) in which case
the complete data is already available or it can be [TextMessage.Streamed](TextMessage$$Streamed.html) in which case `textStream`
will return a Source streaming the data as it comes in.
6. [**](../../../../../akka/http/scaladsl/model/ws/ValidUpgrade.html "Permalink") final  case class [ValidUpgrade](ValidUpgrade.html)(response: [HttpResponse](../HttpResponse.html), chosenSubprotocol: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[String]) extends [WebSocketUpgradeResponse](WebSocketUpgradeResponse.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
7. [**](../../../../../akka/http/scaladsl/model/ws/WebSocketRequest.html "Permalink") final  case class [WebSocketRequest](WebSocketRequest.html "Represents a WebSocket request.")(uri: [Uri](../Uri.html), extraHeaders: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[[HttpHeader](../HttpHeader.html)] \= Nil, subprotocol: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[String] \= None) extends [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableRepresents a WebSocket request.

Represents a WebSocket request.

uriThe target URI to connect to.

extraHeadersExtra headers to add to the WebSocket request.

subprotocolWebSocket subprotocols (comma separated) if required.
8. [**](../../../../../akka/http/scaladsl/model/ws/WebSocketUpgrade.html "Permalink")  trait [WebSocketUpgrade](WebSocketUpgrade.html "An attribute that will be added to an WebSocket upgrade HttpRequest that enables a request handler to upgrade this connection to a WebSocket connection and registers a WebSocket handler.") extends [javadsl.model.ws.WebSocketUpgrade](../../../javadsl/model/ws/WebSocketUpgrade.html)An attribute that will be added to an WebSocket upgrade HttpRequest that
enables a request handler to upgrade this connection to a WebSocket connection and
registers a WebSocket handler.

An attribute that will be added to an WebSocket upgrade HttpRequest that
enables a request handler to upgrade this connection to a WebSocket connection and
registers a WebSocket handler.

This is a low\-level API. You might want to use `handleWebSocketMessages` instead as documented
at https://doc.akka.io/libraries/akka\-http/current/server\-side/websocket\-support.html\#routing\-support
9. [**](../../../../../akka/http/scaladsl/model/ws/WebSocketUpgradeResponse.html "Permalink") sealed  trait [WebSocketUpgradeResponse](WebSocketUpgradeResponse.html "Represents the response to a websocket upgrade request.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Represents the response to a websocket upgrade request.

Represents the response to a websocket upgrade request. Can either be [ValidUpgrade](ValidUpgrade.html) or [InvalidUpgradeResponse](InvalidUpgradeResponse.html).
### Deprecated Type Members

1. [**](../../../../../akka/http/scaladsl/model/ws/UpgradeToWebSocket.html "Permalink")  trait [UpgradeToWebSocket](UpgradeToWebSocket.html "A custom header that will be added to an WebSocket upgrade HttpRequest that enables a request handler to upgrade this connection to a WebSocket connection and registers a WebSocket handler.") extends [HttpHeader](../HttpHeader.html) with [javadsl.model.ws.UpgradeToWebSocket](../../../javadsl/model/ws/UpgradeToWebSocket.html) with [WebSocketUpgrade](WebSocketUpgrade.html)A custom header that will be added to an WebSocket upgrade HttpRequest that
enables a request handler to upgrade this connection to a WebSocket connection and
registers a WebSocket handler.

A custom header that will be added to an WebSocket upgrade HttpRequest that
enables a request handler to upgrade this connection to a WebSocket connection and
registers a WebSocket handler.

Annotations@deprecated Deprecated*(Since version 10\.2\.0\)* This low\-level API has been replaced by an attribute.
### Value Members

1. [**](../../../../../akka/http/scaladsl/model/ws/BinaryMessage$.html "Permalink")  object [BinaryMessage](BinaryMessage$.html)
2. [**](../../../../../akka/http/scaladsl/model/ws/TextMessage$.html "Permalink")  object [TextMessage](TextMessage$.html)
3. [**](../../../../../akka/http/scaladsl/model/ws/WebSocketRequest$.html "Permalink")  object [WebSocketRequest](WebSocketRequest$.html) extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)
### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-http/current/akka/http/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/ws/BinaryMessage.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/ws/Message.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/ws/PeerClosedConnectionException.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/ws/TextMessage.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/ws/UpgradeToWebSocket.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/ws/WebSocketUpgrade.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/HttpHeader.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/HttpResponse.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/Uri.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/headers/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/http2/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/sse/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/ws/BinaryMessage$$Streamed.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/ws/BinaryMessage$$Strict.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/ws/BinaryMessage$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/ws/BinaryMessage.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/ws/InvalidUpgradeResponse.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/ws/Message.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/ws/PeerClosedConnectionException.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/ws/TextMessage$$Streamed.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/ws/TextMessage$$Strict.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/ws/TextMessage$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/ws/TextMessage.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/ws/UpgradeToWebSocket.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/ws/ValidUpgrade.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/ws/WebSocketRequest$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/ws/WebSocketRequest.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/ws/WebSocketUpgrade.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/ws/WebSocketUpgradeResponse.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/ws/index.html
- https://doc.akka.io/api/akka-http/current/akka/index.html
- https://doc.akka.io/api/akka-http/current/index.html

---
*Source: [https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/ws/index.html](https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/ws/index.html)*