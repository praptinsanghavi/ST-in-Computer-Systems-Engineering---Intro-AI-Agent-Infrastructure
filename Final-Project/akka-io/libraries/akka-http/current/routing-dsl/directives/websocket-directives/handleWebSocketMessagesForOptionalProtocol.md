---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:57:27Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/websocket-directives/handleWebSocketMessagesForOptionalProtocol.html
title: handleWebSocketMessagesForOptionalProtocol • Akka HTTP
---

# handleWebSocketMessagesForOptionalProtocol • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# handleWebSocketMessagesForOptionalProtocol

## Signature

```
def handleWebSocketMessagesForOptionalProtocol(handler: Flow[Message, Message, Any], subprotocol: Option[String]): Route
```

## Description

Handles WebSocket requests with the given handler and rejects other requests with an [`ExpectedWebSocketRequestRejection`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/ExpectedWebSocketRequestRejection.html "akka.http.javadsl.server.ExpectedWebSocketRequestRejection")[`ExpectedWebSocketRequestRejection`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/ExpectedWebSocketRequestRejection$.html "akka.http.scaladsl.server.ExpectedWebSocketRequestRejection").

If the `subprotocol` parameter is None[`empty`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#empty() "java.util.Optional") any WebSocket request is accepted. If the `subprotocol` parameter is `Some(protocol)`a non\-empty [`Optional`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html "java.util.Optional") a WebSocket request is only accepted if the list of subprotocols supported by the client (as announced in the WebSocket request) contains `protocol`matches the contained subprotocol. If the client did not offer the protocol in question the request is rejected with an [`UnsupportedWebSocketSubprotocolRejection`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/UnsupportedWebSocketSubprotocolRejection.html "akka.http.javadsl.server.UnsupportedWebSocketSubprotocolRejection")[`UnsupportedWebSocketSubprotocolRejection`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/UnsupportedWebSocketSubprotocolRejection.html "akka.http.scaladsl.server.UnsupportedWebSocketSubprotocolRejection").

To support several subprotocols you may chain several `handleWebSocketMessagesForOptionalProtocol` routes.

The `handleWebSocketMessagesForOptionalProtocol` directive is used as a building block for [WebSocket Directives](index.html) to handle websocket messages.

For more information about the WebSocket support, see [Server\-Side WebSocket Support](../../../server-side/websocket-support.html).

## Code Examples

### Example 1: Signature

```scala
def handleWebSocketMessagesForOptionalProtocol(handler: Flow[Message, Message, Any], subprotocol: Option[String]): Route
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/ExpectedWebSocketRequestRejection$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/UnsupportedWebSocketSubprotocolRejection.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/ExpectedWebSocketRequestRejection.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/UnsupportedWebSocketSubprotocolRejection.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/websocket-directives/handleWebSocketMessages.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/websocket-directives/handleWebSocketMessagesForProtocol.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/websocket-directives/index.html
- https://doc.akka.io/libraries/akka-http/current/server-side/websocket-support.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/websocket-directives/handleWebSocketMessagesForOptionalProtocol.html](https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/websocket-directives/handleWebSocketMessagesForOptionalProtocol.html)*