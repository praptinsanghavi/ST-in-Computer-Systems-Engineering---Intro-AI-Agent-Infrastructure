---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:28:23Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/websocket-directives/extractWebSocketUpgrade.html
title: extractWebSocketUpgrade • Akka HTTP
---

# extractWebSocketUpgrade • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# extractWebSocketUpgrade

## Signature

```
def extractWebSocketUpgrade: Directive1[WebSocketUpgrade]
```

## Description

The `extractWebSocketUpgrade` directive is used as a building block for [Custom Directives](../custom-directives.html) to provide the websocket upgrade information to the inner route.

## Example

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
def extractWebSocketUpgrade: Directive1[WebSocketUpgrade]
```

### Example 2: Example

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

### Example 3: Example

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
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/custom-directives.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/websocket-directives/extractUpgradeToWebSocket.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/websocket-directives/handleWebSocketMessages.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/websocket-directives/extractWebSocketUpgrade.html](https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/websocket-directives/extractWebSocketUpgrade.html)*