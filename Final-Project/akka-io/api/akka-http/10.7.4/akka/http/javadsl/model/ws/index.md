---
description: Akka HTTP 10.7.4 - akka.http.javadsl.model.ws
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:45:20Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/ws/index.html
title: Akka HTTP 10.7.4 - akka.http.javadsl.model.ws
---

# Akka HTTP 10.7.4 - akka.http.javadsl.model.ws

> **Summary:** Akka HTTP 10.7.4 - akka.http.javadsl.model.ws

## Content

Akka HTTP10\.7\.4 \< Back****# Packages

- [**](../../../../../index.html "Permalink")  package [root](../../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/index.html "Permalink")  package [akka](../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/http/index.html "Permalink")  package [http](../../../index.html)Definition Classes[akka](../../../../index.html)
- [**](../../../../../akka/http/javadsl/index.html "Permalink")  package [javadsl](../../index.html)Definition Classes[http](../../../index.html)
- [**](../../../../../akka/http/javadsl/model/index.html "Permalink")  package [model](../index.html)Definition Classes[javadsl](../../index.html)
- [**](../../../../../akka/http/javadsl/model/headers/index.html "Permalink")  package [headers](../headers/index.html)Definition Classes[model](../index.html)
- [**](../../../../../akka/http/javadsl/model/sse/index.html "Permalink")  package [sse](../sse/index.html)Definition Classes[model](../index.html)
- [**](../../../../../akka/http/javadsl/model/ws/index.html "Permalink")  package wsDefinition Classes[model](../index.html)
- [BinaryMessage](BinaryMessage.html "Represents a WebSocket binary message.")
- [Message](Message.html "Represents a WebSocket message.")
- [PeerClosedConnectionException](PeerClosedConnectionException.html "A PeerClosedConnectionException will be reported to the WebSocket handler if the peer has closed the connection.")
- [TextMessage](TextMessage.html "Represents a WebSocket text message.")
- [UpgradeToWebSocket](UpgradeToWebSocket.html "A virtual header that WebSocket requests will contain.")
- [WebSocket](WebSocket$.html)
- [WebSocketRequest](WebSocketRequest.html "Represents a WebSocket request.")
- [WebSocketUpgrade](WebSocketUpgrade.html "An attribute that WebSocket requests will contain.")
- [WebSocketUpgradeResponse](WebSocketUpgradeResponse.html "Represents an upgrade response for a WebSocket upgrade request.")
p[akka](../../../../index.html).[http](../../../index.html).[javadsl](../../index.html).[model](../index.html)

# ws[**](../../../../../akka/http/javadsl/model/ws/index.html "Permalink")

#### package ws

Content Hierarchy****Ordering1. Alphabetic
Visibility1. Public
2. Protected
### Type Members

1. [**](../../../../../akka/http/javadsl/model/ws/BinaryMessage.html "Permalink") abstract  class [BinaryMessage](BinaryMessage.html "Represents a WebSocket binary message.") extends [Message](Message.html)Represents a WebSocket binary message.

Represents a WebSocket binary message. A binary message can either be strict in which case
the complete data is already available or it can be streamed in which case [getStreamedData](BinaryMessage.html#getStreamedData:akka.stream.javadsl.Source[akka.util.ByteString,_])
will return a Source streaming the data as it comes in.
2. [**](../../../../../akka/http/javadsl/model/ws/Message.html "Permalink") abstract  class [Message](Message.html "Represents a WebSocket message.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Represents a WebSocket message.

Represents a WebSocket message. A message can either be a binary message or a text message.

Annotations@DoNotInherit()
3. [**](../../../../../akka/http/javadsl/model/ws/PeerClosedConnectionException.html "Permalink")  trait [PeerClosedConnectionException](PeerClosedConnectionException.html "A PeerClosedConnectionException will be reported to the WebSocket handler if the peer has closed the connection.") extends RuntimeExceptionA PeerClosedConnectionException will be reported to the WebSocket handler if the peer has closed the connection.

A PeerClosedConnectionException will be reported to the WebSocket handler if the peer has closed the connection.
`closeCode` and `closeReason` contain close messages as reported by the peer.
4. [**](../../../../../akka/http/javadsl/model/ws/TextMessage.html "Permalink") abstract  class [TextMessage](TextMessage.html "Represents a WebSocket text message.") extends [Message](Message.html)Represents a WebSocket text message.

Represents a WebSocket text message. A text message can either be strict in which case
the complete data is already available or it can be streamed in which case [getStreamedText](TextMessage.html#getStreamedText:akka.stream.javadsl.Source[String,_])
will return a Source streaming the data as it comes in.
5. [**](../../../../../akka/http/javadsl/model/ws/WebSocketRequest.html "Permalink") abstract  class [WebSocketRequest](WebSocketRequest.html "Represents a WebSocket request.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Represents a WebSocket request.

Represents a WebSocket request. Use `WebSocketRequest.create` to create a request
for a target URI and then use `addHeader` or `requestSubprotocol` to set optional
details.
6. [**](../../../../../akka/http/javadsl/model/ws/WebSocketUpgrade.html "Permalink")  trait [WebSocketUpgrade](WebSocketUpgrade.html "An attribute that WebSocket requests will contain.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)An attribute that WebSocket requests will contain.

An attribute that WebSocket requests will contain. Use [WebSocketUpgrade.handleMessagesWith](WebSocketUpgrade.html#handleMessagesWith(inSink:akka.stream.Graph[akka.stream.SinkShape[akka.http.javadsl.model.ws.Message],_],outSource:akka.stream.Graph[akka.stream.SourceShape[akka.http.javadsl.model.ws.Message],_],subprotocol:String):akka.http.javadsl.model.HttpResponse) to
create a WebSocket handshake response and handle the WebSocket message stream with the given handler.

This is a low\-level API. You might want to use `handleWebSocketMessages` instead as documented
at https://doc.akka.io/libraries/akka\-http/current/server\-side/websocket\-support.html\#routing\-support
7. [**](../../../../../akka/http/javadsl/model/ws/WebSocketUpgradeResponse.html "Permalink")  trait [WebSocketUpgradeResponse](WebSocketUpgradeResponse.html "Represents an upgrade response for a WebSocket upgrade request.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Represents an upgrade response for a WebSocket upgrade request.

Represents an upgrade response for a WebSocket upgrade request. Can either be valid, in which
case the `chosenSubprotocol` method is valid, or if invalid, the `invalidationReason` method
can be used to find out why the upgrade failed.
### Deprecated Type Members

1. [**](../../../../../akka/http/javadsl/model/ws/UpgradeToWebSocket.html "Permalink")  trait [UpgradeToWebSocket](UpgradeToWebSocket.html "A virtual header that WebSocket requests will contain.") extends [scaladsl.model.HttpHeader](../../../scaladsl/model/HttpHeader.html) with [WebSocketUpgrade](WebSocketUpgrade.html)A virtual header that WebSocket requests will contain.

A virtual header that WebSocket requests will contain. Use [UpgradeToWebSocket.handleMessagesWith](UpgradeToWebSocket.html#handleMessagesWith(inSink:akka.stream.Graph[akka.stream.SinkShape[akka.http.javadsl.model.ws.Message],_],outSource:akka.stream.Graph[akka.stream.SourceShape[akka.http.javadsl.model.ws.Message],_],subprotocol:String):akka.http.javadsl.model.HttpResponse) to
create a WebSocket handshake response and handle the WebSocket message stream with the given handler.

This low\-level API is expected to be replaced by an Attribute in the future.

In any case, you might want to use `handleWebSocketMessages` instead as documented
at https://doc.akka.io/libraries/akka\-http/current/server\-side/websocket\-support.html\#routing\-support

Annotations@Deprecated @deprecated Deprecated*(Since version 10\.2\.0\)* use the WebSocketUpgrade attribute instead
### Value Members

1. [**](../../../../../akka/http/javadsl/model/ws/BinaryMessage$.html "Permalink")  object [BinaryMessage](BinaryMessage$.html)
2. [**](../../../../../akka/http/javadsl/model/ws/Message$.html "Permalink")  object [Message](Message$.html)
3. [**](../../../../../akka/http/javadsl/model/ws/TextMessage$.html "Permalink")  object [TextMessage](TextMessage$.html)
4. [**](../../../../../akka/http/javadsl/model/ws/WebSocket$.html "Permalink")  object [WebSocket](WebSocket$.html)
5. [**](../../../../../akka/http/javadsl/model/ws/WebSocketRequest$.html "Permalink")  object [WebSocketRequest](WebSocketRequest$.html)
6. [**](../../../../../akka/http/javadsl/model/ws/WebSocketUpgradeResponse$.html "Permalink")  object [WebSocketUpgradeResponse](WebSocketUpgradeResponse$.html)
### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-http/10.7.4/akka/http/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/headers/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/sse/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/ws/BinaryMessage$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/ws/BinaryMessage.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/ws/Message$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/ws/Message.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/ws/PeerClosedConnectionException.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/ws/TextMessage$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/ws/TextMessage.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/ws/UpgradeToWebSocket.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/ws/WebSocket$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/ws/WebSocketRequest$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/ws/WebSocketRequest.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/ws/WebSocketUpgrade.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/ws/WebSocketUpgradeResponse$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/ws/WebSocketUpgradeResponse.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/ws/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpHeader.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/index.html
- https://doc.akka.io/api/akka-http/10.7.4/index.html

---
*Source: [https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/ws/index.html](https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/ws/index.html)*