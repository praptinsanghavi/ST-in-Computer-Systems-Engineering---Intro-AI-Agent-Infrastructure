---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:57:29Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/websocket-directives/handleWebSocketMessagesForProtocol.html
title: handleWebSocketMessagesForProtocol • Akka HTTP
---

# handleWebSocketMessagesForProtocol • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# handleWebSocketMessagesForProtocol

## Signature

```
def handleWebSocketMessagesForProtocol(handler: Flow[Message, Message, Any], subprotocol: String): Route
```

## Description

Handles WebSocket requests with the given handler if the given subprotocol is offered in the `Sec-WebSocket-Protocol` header of the request and rejects other requests with an [`ExpectedWebSocketRequestRejection`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/ExpectedWebSocketRequestRejection.html "akka.http.javadsl.server.ExpectedWebSocketRequestRejection")[`ExpectedWebSocketRequestRejection`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/ExpectedWebSocketRequestRejection$.html "akka.http.scaladsl.server.ExpectedWebSocketRequestRejection") or an [`UnsupportedWebSocketSubprotocolRejection`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/UnsupportedWebSocketSubprotocolRejection.html "akka.http.javadsl.server.UnsupportedWebSocketSubprotocolRejection")[`UnsupportedWebSocketSubprotocolRejection`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/UnsupportedWebSocketSubprotocolRejection.html "akka.http.scaladsl.server.UnsupportedWebSocketSubprotocolRejection").

The directive first checks if the request was a valid WebSocket handshake request and if the request offers the passed subprotocol name. If yes, the directive completes the request with the passed handler. Otherwise, the request is either rejected with an [`ExpectedWebSocketRequestRejection`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/ExpectedWebSocketRequestRejection.html "akka.http.javadsl.server.ExpectedWebSocketRequestRejection")[`ExpectedWebSocketRequestRejection`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/ExpectedWebSocketRequestRejection$.html "akka.http.scaladsl.server.ExpectedWebSocketRequestRejection") or an [`UnsupportedWebSocketSubprotocolRejection`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/UnsupportedWebSocketSubprotocolRejection.html "akka.http.javadsl.server.UnsupportedWebSocketSubprotocolRejection")[`UnsupportedWebSocketSubprotocolRejection`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/UnsupportedWebSocketSubprotocolRejection.html "akka.http.scaladsl.server.UnsupportedWebSocketSubprotocolRejection").

To support several subprotocols, for example at the same path, several instances of `handleWebSocketMessagesForProtocol` can be chained using `~` as you can see in the below example.

For more information about the WebSocket support, see [Server\-Side WebSocket Support](../../../server-side/websocket-support.html).

## Example

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/directives/WebSocketDirectivesExamplesSpec.scala#L61-L104 "Go to snippet source")def greeterService: Flow[Message, Message, Any] =
  Flow[Message].mapConcat {
    case tm: TextMessage =>
      TextMessage(Source.single("Hello ") ++ tm.textStream ++ Source.single("!")) :: Nil
    case bm: BinaryMessage =>
      // ignore binary messages but drain content to avoid the stream being clogged
      bm.dataStream.runWith(Sink.ignore)
      Nil
  }

def echoService: Flow[Message, Message, Any] =
  Flow[Message]
    // needed because a noop flow hasn't any buffer that would start processing in tests
    .buffer(1, OverflowStrategy.backpressure)

def websocketMultipleProtocolRoute =
  path("services") {
    handleWebSocketMessagesForProtocol(greeterService, "greeter") ~
      handleWebSocketMessagesForProtocol(echoService, "echo")
  }

// tests:
val wsClient = WSProbe()

// WS creates a WebSocket request for testing
WS("/services", wsClient.flow, List("other", "echo")) ~>
  websocketMultipleProtocolRoute ~>
  check {
    expectWebSocketUpgradeWithProtocol { protocol =>
      protocol shouldEqual "echo"

      wsClient.sendMessage("Peter")
      wsClient.expectMessage("Peter")

      wsClient.sendMessage(BinaryMessage(ByteString("abcdef")))
      wsClient.expectMessage(ByteString("abcdef"))

      wsClient.sendMessage("John")
      wsClient.expectMessage("John")

      wsClient.sendCompletion()
      wsClient.expectCompletion()
    }
  }
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/directives/WebSocketDirectivesExamplesTest.java#L36-L139 "Go to snippet source")import static akka.http.javadsl.server.Directives.handleWebSocketMessagesForProtocol;

final Flow<Message, Message, NotUsed> greeterService = Flow.of(Message.class).mapConcat(msg -> {
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

final Flow<Message, Message, NotUsed> echoService = Flow.of(Message.class).buffer(1, OverflowStrategy.backpressure());

final Route websocketMultipleProtocolRoute = path("services", () ->
  concat(
    handleWebSocketMessagesForProtocol(greeterService, "greeter"),
    handleWebSocketMessagesForProtocol(echoService, "echo")
  )
);

// create a testing probe representing the client-side
final WSProbe wsClient = WSProbe.create(system(), materializer());

// WS creates a WebSocket request for testing
testRoute(websocketMultipleProtocolRoute)
  .run(WS(Uri.create("/services"), wsClient.flow(), materializer(), Arrays.asList("other", "echo")))
  .assertHeaderExists(SecWebSocketProtocol.create("echo"));

wsClient.sendMessage("Peter");
wsClient.expectMessage("Peter");

wsClient.sendMessage(BinaryMessage.create(ByteString.fromString("abcdef")));
wsClient.expectMessage(ByteString.fromString("abcdef"));

wsClient.sendMessage("John");
wsClient.expectMessage("John");

wsClient.sendCompletion();
wsClient.expectCompletion();
```

## Code Examples

### Example 1: Signature

```scala
def handleWebSocketMessagesForProtocol(handler: Flow[Message, Message, Any], subprotocol: String): Route
```

### Example 2: Example

```scala
def greeterService: Flow[Message, Message, Any] =
  Flow[Message].mapConcat {
    case tm: TextMessage =>
      TextMessage(Source.single("Hello ") ++ tm.textStream ++ Source.single("!")) :: Nil
    case bm: BinaryMessage =>
      // ignore binary messages but drain content to avoid the stream being clogged
      bm.dataStream.runWith(Sink.ignore)
      Nil
  }

def echoService: Flow[Message, Message, Any] =
  Flow[Message]
    // needed because a noop flow hasn't any buffer that would start processing in tests
    .buffer(1, OverflowStrategy.backpressure)

def websocketMultipleProtocolRoute =
  path("services") {
    handleWebSocketMessagesForProtocol(greeterService, "greeter") ~
      handleWebSocketMessagesForProtocol(echoService, "echo")
  }

// tests:
val wsClient = WSProbe()

// WS creates a WebSocket request for testing
WS("/services", wsClient.flow, List("other", "echo")) ~>
  websocketMultipleProtocolRoute ~>
  check {
    expectWebSocketUpgradeWithProtocol { protocol =>
      protocol shouldEqual "echo"

      wsClient.sendMessage("Peter")
      wsClient.expectMessage("Peter")

      wsClient.sendMessage(BinaryMessage(ByteString("abcdef")))
      wsClient.expectMessage(ByteString("abcdef"))

      wsClient.sendMessage("John")
      wsClient.expectMessage("John")

      wsClient.sendCompletion()
      wsClient.expectCompletion()
    }
  }
```

### Example 3: Example

```java
import static akka.http.javadsl.server.Directives.handleWebSocketMessagesForProtocol;

final Flow<Message, Message, NotUsed> greeterService = Flow.of(Message.class).mapConcat(msg -> {
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

final Flow<Message, Message, NotUsed> echoService = Flow.of(Message.class).buffer(1, OverflowStrategy.backpressure());

final Route websocketMultipleProtocolRoute = path("services", () ->
  concat(
    handleWebSocketMessagesForProtocol(greeterService, "greeter"),
    handleWebSocketMessagesForProtocol(echoService, "echo")
  )
);

// create a testing probe representing the client-side
final WSProbe wsClient = WSProbe.create(system(), materializer());

// WS creates a WebSocket request for testing
testRoute(websocketMultipleProtocolRoute)
  .run(WS(Uri.create("/services"), wsClient.flow(), materializer(), Arrays.asList("other", "echo")))
  .assertHeaderExists(SecWebSocketProtocol.create("echo"));

wsClient.sendMessage("Peter");
wsClient.expectMessage("Peter");

wsClient.sendMessage(BinaryMessage.create(ByteString.fromString("abcdef")));
wsClient.expectMessage(ByteString.fromString("abcdef"));

wsClient.sendMessage("John");
wsClient.expectMessage("John");

wsClient.sendCompletion();
wsClient.expectCompletion();
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/ExpectedWebSocketRequestRejection$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/UnsupportedWebSocketSubprotocolRejection.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/ExpectedWebSocketRequestRejection.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/UnsupportedWebSocketSubprotocolRejection.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/timeout-directives/index.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/websocket-directives/handleWebSocketMessagesForOptionalProtocol.html
- https://doc.akka.io/libraries/akka-http/current/server-side/websocket-support.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/websocket-directives/handleWebSocketMessagesForProtocol.html](https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/websocket-directives/handleWebSocketMessagesForProtocol.html)*