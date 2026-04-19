---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:57:01Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/websocket-directives/extractOfferedWsProtocols.html
title: extractOfferedWsProtocols • Akka HTTP
---

# extractOfferedWsProtocols • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# extractOfferedWsProtocols

## Signature

```
def extractOfferedWsProtocols: Directive1[immutable.Seq[String]]
```

## Description

Extracts the list of WebSocket subprotocols as offered by the client in the `Sec-WebSocket-Protocol` header if this is a WebSocket request. Rejects with an [`ExpectedWebSocketRequestRejection`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/ExpectedWebSocketRequestRejection.html "akka.http.javadsl.server.ExpectedWebSocketRequestRejection")[`ExpectedWebSocketRequestRejection`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/ExpectedWebSocketRequestRejection$.html "akka.http.scaladsl.server.ExpectedWebSocketRequestRejection"), otherwise.

The `extractOfferedWsProtocols` directive is used as a building block for [Custom Directives](../custom-directives.html) to provide the extracted protocols to the inner route.

## Example

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/directives/WebSocketDirectivesExamplesSpec.scala#L142-L166 "Go to snippet source")def echoService: Flow[Message, Message, Any] =
  Flow[Message]
    // needed because a noop flow hasn't any buffer that would start processing in tests
    .buffer(1, OverflowStrategy.backpressure)

def route =
  path("services") {
    extractOfferedWsProtocols { protocols =>
      handleWebSocketMessagesForOptionalProtocol(echoService, protocols.headOption)
    }
  }

// tests:
val wsClient = WSProbe()

// WS creates a WebSocket request for testing
WS("/services", wsClient.flow, List("echo", "alfa", "kilo")) ~> route ~> check {
  expectWebSocketUpgradeWithProtocol { protocol =>
    protocol shouldEqual "echo"
    wsClient.sendMessage("ping")
    wsClient.expectMessage("ping")
    wsClient.sendCompletion()
    wsClient.expectCompletion()
  }
}
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/directives/WebSocketDirectivesExamplesTest.java#L46-L198 "Go to snippet source")import static akka.http.javadsl.server.Directives.extractOfferedWsProtocols;
import static akka.http.javadsl.server.Directives.handleWebSocketMessagesForOptionalProtocol;

final Flow<Message, Message, NotUsed> echoService = Flow.of(Message.class).buffer(1, OverflowStrategy.backpressure());

final Route websocketRoute = path("services", () ->
  concat(
    extractOfferedWsProtocols(protocols ->
      handleWebSocketMessagesForOptionalProtocol(echoService, protocols.stream().findFirst())
    )
  )
);

// tests:
// create a testing probe representing the client-side
final WSProbe wsClient = WSProbe.create(system(), materializer());

testRoute(websocketRoute)
  .run(WS(Uri.create("/services"), wsClient.flow(), materializer(), Arrays.asList("echo", "alfa", "kilo")))
  .assertHeaderExists(SecWebSocketProtocol.create("echo"));

wsClient.sendMessage("ping");
wsClient.expectMessage("ping");

wsClient.sendCompletion();
wsClient.expectCompletion();
```

## Code Examples

### Example 1: Signature

```scala
def extractOfferedWsProtocols: Directive1[immutable.Seq[String]]
```

### Example 2: Example

```scala
def echoService: Flow[Message, Message, Any] =
  Flow[Message]
    // needed because a noop flow hasn't any buffer that would start processing in tests
    .buffer(1, OverflowStrategy.backpressure)

def route =
  path("services") {
    extractOfferedWsProtocols { protocols =>
      handleWebSocketMessagesForOptionalProtocol(echoService, protocols.headOption)
    }
  }

// tests:
val wsClient = WSProbe()

// WS creates a WebSocket request for testing
WS("/services", wsClient.flow, List("echo", "alfa", "kilo")) ~> route ~> check {
  expectWebSocketUpgradeWithProtocol { protocol =>
    protocol shouldEqual "echo"
    wsClient.sendMessage("ping")
    wsClient.expectMessage("ping")
    wsClient.sendCompletion()
    wsClient.expectCompletion()
  }
}
```

### Example 3: Example

```java
import static akka.http.javadsl.server.Directives.extractOfferedWsProtocols;
import static akka.http.javadsl.server.Directives.handleWebSocketMessagesForOptionalProtocol;

final Flow<Message, Message, NotUsed> echoService = Flow.of(Message.class).buffer(1, OverflowStrategy.backpressure());

final Route websocketRoute = path("services", () ->
  concat(
    extractOfferedWsProtocols(protocols ->
      handleWebSocketMessagesForOptionalProtocol(echoService, protocols.stream().findFirst())
    )
  )
);

// tests:
// create a testing probe representing the client-side
final WSProbe wsClient = WSProbe.create(system(), materializer());

testRoute(websocketRoute)
  .run(WS(Uri.create("/services"), wsClient.flow(), materializer(), Arrays.asList("echo", "alfa", "kilo")))
  .assertHeaderExists(SecWebSocketProtocol.create("echo"));

wsClient.sendMessage("ping");
wsClient.expectMessage("ping");

wsClient.sendCompletion();
wsClient.expectCompletion();
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/ExpectedWebSocketRequestRejection$.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/ExpectedWebSocketRequestRejection.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/custom-directives.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/websocket-directives/extractUpgradeToWebSocket.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/websocket-directives/index.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/websocket-directives/extractOfferedWsProtocols.html](https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/websocket-directives/extractOfferedWsProtocols.html)*