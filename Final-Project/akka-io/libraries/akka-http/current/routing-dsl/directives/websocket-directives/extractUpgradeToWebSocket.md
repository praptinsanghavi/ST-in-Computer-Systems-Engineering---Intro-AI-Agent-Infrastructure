---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:57:15Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/websocket-directives/extractUpgradeToWebSocket.html
title: extractUpgradeToWebSocket • Akka HTTP
---

# extractUpgradeToWebSocket • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# extractUpgradeToWebSocket

## Signature

```
def extractUpgradeToWebSocket: Directive1[UpgradeToWebSocket]
```

## Description

This directive is deprecated, see [extractWebSocketUpgrade](extractWebSocketUpgrade.html) instead.

If you are looking for a building block for [Custom Directives](../custom-directives.html) to provide the websocket upgrade information to the inner route, we recommend using the [`WebSocketUpgrade`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/ws/WebSocketUpgrade.html "akka.http.javadsl.model.ws.WebSocketUpgrade")[`WebSocketUpgrade`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/ws/WebSocketUpgrade.html "akka.http.scaladsl.model.ws.WebSocketUpgrade") [attribute](../../../common/http-model.html#attributes) instead:

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/directives/WebSocketDirectivesExamplesSpec.scala#L110-L136 "Go to snippet source")import akka.http.scaladsl.model.AttributeKeys.webSocketUpgrade

def echoService: Flow[Message, Message, Any] =
  Flow[Message]
    // needed because a noop flow hasn't any buffer that would start processing in tests
    .buffer(1, OverflowStrategy.backpressure)

def route =
  path("services") {
    extractWebSocketUpgrade { upgrade =>
      complete(upgrade.handleMessages(echoService, Some("echo")))
    }
  }

// tests:
val wsClient = WSProbe()

// WS creates a WebSocket request for testing
WS("/services", wsClient.flow, Nil) ~> route ~> check {
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
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/directives/WebSocketDirectivesExamplesTest.java#L146-L169 "Go to snippet source")final Flow<Message, Message, NotUsed> echoService = Flow.of(Message.class).buffer(1, OverflowStrategy.backpressure());

final Route websocketRoute = path("services", () ->
  concat(
    extractWebSocketUpgrade(upgrade ->
      complete(upgrade.handleMessagesWith(echoService, "echo"))
    )
  )
);

// tests:
// create a testing probe representing the client-side
final WSProbe wsClient = WSProbe.create(system(), materializer());

// WS creates a WebSocket request for testing
testRoute(websocketRoute)
  .run(WS(Uri.create("/services"), wsClient.flow(), materializer(), Collections.emptyList()))
  .assertHeaderExists(SecWebSocketProtocol.create("echo"));

wsClient.sendMessage("ping");
wsClient.expectMessage("ping");

wsClient.sendCompletion();
wsClient.expectCompletion();
```

## Code Examples

### Example 1: Signature

```scala
def extractUpgradeToWebSocket: Directive1[UpgradeToWebSocket]
```

### Example 2: Description

```scala
import akka.http.scaladsl.model.AttributeKeys.webSocketUpgrade

def echoService: Flow[Message, Message, Any] =
  Flow[Message]
    // needed because a noop flow hasn't any buffer that would start processing in tests
    .buffer(1, OverflowStrategy.backpressure)

def route =
  path("services") {
    extractWebSocketUpgrade { upgrade =>
      complete(upgrade.handleMessages(echoService, Some("echo")))
    }
  }

// tests:
val wsClient = WSProbe()

// WS creates a WebSocket request for testing
WS("/services", wsClient.flow, Nil) ~> route ~> check {
  expectWebSocketUpgradeWithProtocol { protocol =>
    protocol shouldEqual "echo"
    wsClient.sendMessage("ping")
    wsClient.expectMessage("ping")
    wsClient.sendCompletion()
    wsClient.expectCompletion()
  }
}
```

### Example 3: Description

```java
final Flow<Message, Message, NotUsed> echoService = Flow.of(Message.class).buffer(1, OverflowStrategy.backpressure());

final Route websocketRoute = path("services", () ->
  concat(
    extractWebSocketUpgrade(upgrade ->
      complete(upgrade.handleMessagesWith(echoService, "echo"))
    )
  )
);

// tests:
// create a testing probe representing the client-side
final WSProbe wsClient = WSProbe.create(system(), materializer());

// WS creates a WebSocket request for testing
testRoute(websocketRoute)
  .run(WS(Uri.create("/services"), wsClient.flow(), materializer(), Collections.emptyList()))
  .assertHeaderExists(SecWebSocketProtocol.create("echo"));

wsClient.sendMessage("ping");
wsClient.expectMessage("ping");

wsClient.sendCompletion();
wsClient.expectCompletion();
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/ws/WebSocketUpgrade.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/ws/WebSocketUpgrade.html
- https://doc.akka.io/libraries/akka-http/current/common/http-model.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/custom-directives.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/websocket-directives/extractOfferedWsProtocols.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/websocket-directives/extractWebSocketUpgrade.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/websocket-directives/extractUpgradeToWebSocket.html](https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/websocket-directives/extractUpgradeToWebSocket.html)*