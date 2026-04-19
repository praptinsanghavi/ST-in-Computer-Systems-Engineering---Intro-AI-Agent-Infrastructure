---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:57:27Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/websocket-directives/handleWebSocketMessages.html
title: handleWebSocketMessages • Akka HTTP
---

# handleWebSocketMessages • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# handleWebSocketMessages

## Signature

```
def handleWebSocketMessages(handler: Flow[Message, Message, Any]): Route
```

## Description

The directive first checks if the request was a valid WebSocket handshake request and if yes, it completes the request with the passed handler. Otherwise, the request is rejected with an [`ExpectedWebSocketRequestRejection`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/ExpectedWebSocketRequestRejection.html "akka.http.javadsl.server.ExpectedWebSocketRequestRejection")[`ExpectedWebSocketRequestRejection`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/ExpectedWebSocketRequestRejection$.html "akka.http.scaladsl.server.ExpectedWebSocketRequestRejection").

WebSocket subprotocols offered in the `Sec-WebSocket-Protocol` header of the request are ignored. If you want to support several protocols use the [handleWebSocketMessagesForProtocol](handleWebSocketMessagesForProtocol.html) directive, instead.

For more information about the WebSocket support, see [Server\-Side WebSocket Support](../../../server-side/websocket-support.html).

## Example

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/directives/WebSocketDirectivesExamplesSpec.scala#L19-L55 "Go to snippet source")def greeter: Flow[Message, Message, Any] =
  Flow[Message].mapConcat {
    case tm: TextMessage =>
      TextMessage(Source.single("Hello ") ++ tm.textStream ++ Source.single("!")) :: Nil
    case bm: BinaryMessage =>
      // ignore binary messages but drain content to avoid the stream being clogged
      bm.dataStream.runWith(Sink.ignore)
      Nil
  }
val websocketRoute =
  path("greeter") {
    handleWebSocketMessages(greeter)
  }

// tests:
// create a testing probe representing the client-side
val wsClient = WSProbe()

// WS creates a WebSocket request for testing
WS("/greeter", wsClient.flow) ~> websocketRoute ~>
  check {
    // check response for WS Upgrade headers
    isWebSocketUpgrade shouldEqual true

    // manually run a WS conversation
    wsClient.sendMessage("Peter")
    wsClient.expectMessage("Hello Peter!")

    wsClient.sendMessage(BinaryMessage(ByteString("abcdef")))
    wsClient.expectNoMessage(100.millis)

    wsClient.sendMessage("John")
    wsClient.expectMessage("Hello John!")

    wsClient.sendCompletion()
    wsClient.expectCompletion()
  }
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/directives/WebSocketDirectivesExamplesTest.java#L31-L91 "Go to snippet source")import static akka.http.javadsl.server.Directives.path;
import static akka.http.javadsl.server.Directives.handleWebSocketMessages;

final Flow<Message, Message, NotUsed> greeter = Flow.of(Message.class).mapConcat(msg -> {
  if (msg instanceof TextMessage) {
    final TextMessage tm = (TextMessage) msg;
    final TextMessage ret = TextMessage.create(Source.single("Hello ").concat(tm.getStreamedText()).concat(Source.single("!")));
    return Collections.singletonList(ret);
  } else if (msg instanceof BinaryMessage) {
    final BinaryMessage bm = (BinaryMessage) msg;
    bm.getStreamedData().runWith(Sink.ignore(), materializer());
    return Collections.emptyList();
  } else {
    throw new IllegalArgumentException("Unsupported message type!");
  }
});

final Route websocketRoute = path("greeter", () ->
  handleWebSocketMessages(greeter)
);

// create a testing probe representing the client-side
final WSProbe wsClient = WSProbe.create(system(), materializer());

// WS creates a WebSocket request for testing
testRoute(websocketRoute).run(WS(Uri.create("/greeter"), wsClient.flow(), materializer()))
  .assertStatusCode(StatusCodes.SWITCHING_PROTOCOLS);

// manually run a WS conversation
wsClient.sendMessage("Peter");
wsClient.expectMessage("Hello Peter!");

wsClient.sendMessage(BinaryMessage.create(ByteString.fromString("abcdef")));
wsClient.expectNoMessage(FiniteDuration.create(100, TimeUnit.MILLISECONDS));

wsClient.sendMessage("John");
wsClient.expectMessage("Hello John!");

wsClient.sendCompletion();
wsClient.expectCompletion();
```

## Code Examples

### Example 1: Signature

```scala
def handleWebSocketMessages(handler: Flow[Message, Message, Any]): Route
```

### Example 2: Example

```scala
def greeter: Flow[Message, Message, Any] =
  Flow[Message].mapConcat {
    case tm: TextMessage =>
      TextMessage(Source.single("Hello ") ++ tm.textStream ++ Source.single("!")) :: Nil
    case bm: BinaryMessage =>
      // ignore binary messages but drain content to avoid the stream being clogged
      bm.dataStream.runWith(Sink.ignore)
      Nil
  }
val websocketRoute =
  path("greeter") {
    handleWebSocketMessages(greeter)
  }

// tests:
// create a testing probe representing the client-side
val wsClient = WSProbe()

// WS creates a WebSocket request for testing
WS("/greeter", wsClient.flow) ~> websocketRoute ~>
  check {
    // check response for WS Upgrade headers
    isWebSocketUpgrade shouldEqual true

    // manually run a WS conversation
    wsClient.sendMessage("Peter")
    wsClient.expectMessage("Hello Peter!")

    wsClient.sendMessage(BinaryMessage(ByteString("abcdef")))
    wsClient.expectNoMessage(100.millis)

    wsClient.sendMessage("John")
    wsClient.expectMessage("Hello John!")

    wsClient.sendCompletion()
    wsClient.expectCompletion()
  }
```

### Example 3: Example

```java
import static akka.http.javadsl.server.Directives.path;
import static akka.http.javadsl.server.Directives.handleWebSocketMessages;

final Flow<Message, Message, NotUsed> greeter = Flow.of(Message.class).mapConcat(msg -> {
  if (msg instanceof TextMessage) {
    final TextMessage tm = (TextMessage) msg;
    final TextMessage ret = TextMessage.create(Source.single("Hello ").concat(tm.getStreamedText()).concat(Source.single("!")));
    return Collections.singletonList(ret);
  } else if (msg instanceof BinaryMessage) {
    final BinaryMessage bm = (BinaryMessage) msg;
    bm.getStreamedData().runWith(Sink.ignore(), materializer());
    return Collections.emptyList();
  } else {
    throw new IllegalArgumentException("Unsupported message type!");
  }
});

final Route websocketRoute = path("greeter", () ->
  handleWebSocketMessages(greeter)
);

// create a testing probe representing the client-side
final WSProbe wsClient = WSProbe.create(system(), materializer());

// WS creates a WebSocket request for testing
testRoute(websocketRoute).run(WS(Uri.create("/greeter"), wsClient.flow(), materializer()))
  .assertStatusCode(StatusCodes.SWITCHING_PROTOCOLS);

// manually run a WS conversation
wsClient.sendMessage("Peter");
wsClient.expectMessage("Hello Peter!");

wsClient.sendMessage(BinaryMessage.create(ByteString.fromString("abcdef")));
wsClient.expectNoMessage(FiniteDuration.create(100, TimeUnit.MILLISECONDS));

wsClient.sendMessage("John");
wsClient.expectMessage("Hello John!");

wsClient.sendCompletion();
wsClient.expectCompletion();
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/ExpectedWebSocketRequestRejection$.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/ExpectedWebSocketRequestRejection.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/websocket-directives/extractWebSocketUpgrade.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/websocket-directives/handleWebSocketMessagesForOptionalProtocol.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/websocket-directives/handleWebSocketMessagesForProtocol.html
- https://doc.akka.io/libraries/akka-http/current/server-side/websocket-support.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/websocket-directives/handleWebSocketMessages.html](https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/websocket-directives/handleWebSocketMessages.html)*