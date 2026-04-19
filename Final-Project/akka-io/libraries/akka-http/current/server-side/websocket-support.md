---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:13:00Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/server-side/websocket-support.html
title: Server WebSocket Support • Akka HTTP
---

# Server WebSocket Support • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Server WebSocket Support

WebSocket is a protocol that provides a bi\-directional channel between browser and webserver usually run over an upgraded HTTP(S) connection. Data is exchanged in messages whereby a message can either be binary data or Unicode text.

Akka HTTP provides a stream\-based implementation of the WebSocket protocol that hides the low\-level details of the underlying binary framing wire\-protocol and provides a simple API to implement services using WebSocket.

## Model

The basic unit of data exchange in the WebSocket protocol is a message. A message can either be binary message, i.e. a sequence of octets or a text message, i.e. a sequence of Unicode code points.

In the data model the two kinds of messages, binary and text messages, are represented by the two classes [`BinaryMessage`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/ws/BinaryMessage.html "akka.http.javadsl.model.ws.BinaryMessage")[`BinaryMessage`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/ws/BinaryMessage.html "akka.http.scaladsl.model.ws.BinaryMessage") and [`TextMessage`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/ws/TextMessage.html "akka.http.javadsl.model.ws.TextMessage")[`TextMessage`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/ws/TextMessage.html "akka.http.scaladsl.model.ws.TextMessage") deriving from a common superclass [`Message`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/ws/Message.html "akka.http.scaladsl.model.ws.Message")[`Message`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/ws/Message.html "akka.http.javadsl.model.ws.Message"). The subclasses [`BinaryMessage`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/ws/BinaryMessage.html "akka.http.javadsl.model.ws.BinaryMessage")[`BinaryMessage`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/ws/BinaryMessage.html "akka.http.scaladsl.model.ws.BinaryMessage") and [`TextMessage`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/ws/TextMessage.html "akka.http.javadsl.model.ws.TextMessage")[`TextMessage`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/ws/TextMessage.html "akka.http.scaladsl.model.ws.TextMessage") contain methods to access the data. The superclass [`Message`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/ws/Message.html "akka.http.javadsl.model.ws.Message") contains `isText` and `isBinary` methods to distinguish a message and `asBinaryMessage` and `asTextMessage` methods to cast a message.] Take the API of [`TextMessage`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/ws/TextMessage.html "akka.http.javadsl.model.ws.TextMessage")[`TextMessage`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/ws/TextMessage.html "akka.http.scaladsl.model.ws.TextMessage") as an example ([`BinaryMessage`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/ws/BinaryMessage.html "akka.http.javadsl.model.ws.BinaryMessage")[`BinaryMessage`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/ws/BinaryMessage.html "akka.http.scaladsl.model.ws.BinaryMessage") is very similar with `String` replaced by [`ByteString`](https://doc.akka.io/api/akka/2.10/akka/util/ByteString.html "akka.util.ByteString")[`ByteString`](https://doc.akka.io/japi/akka/2.10/akka/util/ByteString.html "akka.util.ByteString")):

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/akka-http-core/src/main/scala/akka/http/scaladsl/model/ws/Message.scala#L18-L110 "Go to snippet source")/**
 * The ADT for WebSocket messages. A message can either be a binary or a text message.
 */
sealed trait Message extends akka.http.javadsl.model.ws.Message

/**
 * Represents a WebSocket text message. A text message can either be a [[TextMessage.Strict]] in which case
 * the complete data is already available or it can be [[TextMessage.Streamed]] in which case `textStream`
 * will return a Source streaming the data as it comes in.
 */
sealed trait TextMessage extends akka.http.javadsl.model.ws.TextMessage with Message {
  /**
   * The contents of this message as a stream.
   */
  def textStream: Source[String, _]

  /**
   * Collects all possible parts and returns a potentially future Strict Message for easier processing.
   * The Future is failed with an TimeoutException if the stream isn't completed after the given timeout.
   */
  def toStrict(timeout: FiniteDuration)(implicit fm: Materializer): Future[TextMessage.Strict] =
    this match {
      case TextMessage.Strict(text) => Future.successful(TextMessage.Strict(text))
      case TextMessage.Streamed(textStream) => textStream
        .completionTimeout(timeout)
        .runFold(new StringBuilder())((b, s) => b.append(s))
        .map(b => b.toString)(fm.executionContext)
        .map(text => TextMessage.Strict(text))(fm.executionContext)
    }

  /** Java API */
  override def getStreamedText: javadsl.Source[String, _] = textStream.asJava
  override def asScala: TextMessage = this
  override def toStrict(timeoutMillis: Long, materializer: Materializer): CompletionStage[TextMessage.Strict] = toStrict(timeoutMillis.millis)(materializer).asJava
}
sealed trait BinaryMessage extends akka.http.javadsl.model.ws.BinaryMessage with Message {
  /**
   * The contents of this message as a stream.
   */
  def dataStream: Source[ByteString, _]

  /**
   * Collects all possible parts and returns a potentially future Strict Message for easier processing.
   * The Future is failed with an TimeoutException if the stream isn't completed after the given timeout.
   */
  def toStrict(timeout: FiniteDuration)(implicit fm: Materializer): Future[BinaryMessage.Strict] =
    this match {
      case BinaryMessage.Strict(binary) => Future.successful(BinaryMessage.Strict(binary))
      case BinaryMessage.Streamed(binaryStream) => binaryStream
        .completionTimeout(timeout)
        .runFold(new ByteStringBuilder())((b, e) => b.append(e))
        .map(b => b.result())(fm.executionContext)
        .map(binary => BinaryMessage.Strict(binary))(fm.executionContext)
    }

  /** Java API */
  override def getStreamedData: javadsl.Source[ByteString, _] = dataStream.asJava
  override def asScala: BinaryMessage = this
  override def toStrict(timeoutMillis: Long, materializer: Materializer): CompletionStage[BinaryMessage.Strict] = toStrict(timeoutMillis.millis)(materializer).asJava
}
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/akka-http-core/src/main/scala/akka/http/javadsl/model/ws/Message.scala#L58-L75 "Go to snippet source")abstract class TextMessage extends Message {
  /**
   * Returns a source of the text message data.
   */
  def getStreamedText: Source[String, _]

  /**
   * Returns the strict message text if this message is strict, throws otherwise.
   */
  def getStrictText: String
}
```

The data of a message is provided as a stream because WebSocket messages do not have a predefined size and could (in theory) be infinitely long. However, only one message can be open per direction of the WebSocket connection, so that many application level protocols will want to make use of the delineation into (small) messages to transport single application\-level data units like “one event” or “one chat message”.

Many messages are small enough to be sent or received in one go. As an opportunity for optimization, the model provides the notion of a “strict” message to represent cases where a whole message was received in one go. Strict messages are represented with the `Strict` subclass for each kind of message which contains data as a strict, i.e. non\-streamed, [`ByteString`](https://doc.akka.io/api/akka/2.10/akka/util/ByteString.html "akka.util.ByteString")[`ByteString`](https://doc.akka.io/japi/akka/2.10/akka/util/ByteString.html "akka.util.ByteString") or `String`. If `TextMessage.isStrict` returns true, the complete data is already available and can be accessed with `TextMessage.getStrictText` (analogously for [`BinaryMessage`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/ws/BinaryMessage.html "akka.http.javadsl.model.ws.BinaryMessage")[`BinaryMessage`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/ws/BinaryMessage.html "akka.http.scaladsl.model.ws.BinaryMessage")).

When receiving data from the network connection the WebSocket implementation tries to create a strict message whenever possible, i.e. when the complete data was received in one chunk. However, the actual chunking of messages over a network connection and through the various streaming abstraction layers is not deterministic from the perspective of the application. Therefore, application code must be able to handle both streamed and strict messages and not expect certain messages to be strict. (Particularly, note that tests against `localhost` will behave differently than tests against remote peers where data is received over a physical network connection.)

For sending data, you can use `TextMessage.apply(text: String)``TextMessage.create(String)` to create a strict message if the complete message has already been assembled. Otherwise, use `TextMessage.apply(textStream: Source[String, \_])``TextMessage.create(Source<String, ?>)` to create a streaming message from an Akka Stream source.

## Routing support

To handle websocket requests, you can either use the directive described in this section, or use the more low\-level [WebSocketUpgrade](websocket-support.html#websocketupgrade) attribute described in the next section.

The routing DSL provides the [handleWebSocketMessages](../routing-dsl/directives/websocket-directives/handleWebSocketMessages.html) directive to install a WebSocket handler if a request is a WebSocket request. Otherwise, the directive rejects the request.

Let’s look at how the above example can be rewritten using the high\-level routing DSL.

Instead of writing the request handler manually, the routing behavior of the app is defined by a route that uses the [handleWebSocketMessages](../routing-dsl/directives/websocket-directives/handleWebSocketMessages.html) directive:

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
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/WebSocketRoutingExample.java#L19-L24 "Go to snippet source")public Route createRoute() {
  return
    path("greeter", () ->
      handleWebSocketMessages(greeter())
    );
}
```

The handling code itself will be the same as with using the low\-level API.

The example also includes code demonstrating the testkit support for WebSocket services. It allows to create WebSocket requests to run against a route using *WS* which can be used to provide a mock WebSocket probe that allows manual testing of the WebSocket handler’s behavior if the request was accepted.

See the [full routing example](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/WebSocketCoreExample.java).

## WebSocketUpgrade

To handle websocket requests, you can either use the [`WebSocketUpgrade`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/ws/WebSocketUpgrade.html "akka.http.javadsl.model.ws.WebSocketUpgrade")[`WebSocketUpgrade`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/ws/WebSocketUpgrade.html "akka.http.scaladsl.model.ws.WebSocketUpgrade") attribute directly, or use the more high\-level [Routing Support](websocket-support.html#routing-support) described above.

The entrypoint for the WebSocket API is the [`WebSocketUpgrade`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/ws/WebSocketUpgrade.html "akka.http.javadsl.model.ws.WebSocketUpgrade")[`WebSocketUpgrade`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/ws/WebSocketUpgrade.html "akka.http.scaladsl.model.ws.WebSocketUpgrade") attribute which is added to a request if Akka HTTP encounters a WebSocket upgrade request.

The WebSocket specification mandates that details of the WebSocket connection are negotiated by placing special\-purpose HTTP headers into request and response of the HTTP upgrade. In Akka HTTP these HTTP\-level details of the WebSocket handshake are hidden from the application and don’t need to be managed manually.

Instead, the [`WebSocketUpgrade`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/ws/WebSocketUpgrade.html "akka.http.javadsl.model.ws.WebSocketUpgrade")[`WebSocketUpgrade`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/ws/WebSocketUpgrade.html "akka.http.scaladsl.model.ws.WebSocketUpgrade") attribute represents a valid WebSocket upgrade request. An application can detect a WebSocket upgrade request by looking for the [`WebSocketUpgrade`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/ws/WebSocketUpgrade.html "akka.http.javadsl.model.ws.WebSocketUpgrade")[`WebSocketUpgrade`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/ws/WebSocketUpgrade.html "akka.http.scaladsl.model.ws.WebSocketUpgrade") attribute. It can choose to accept the upgrade and start a WebSocket connection by responding to that request with an [`HttpResponse`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpResponse.html "akka.http.javadsl.model.HttpResponse")[`HttpResponse`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpResponse.html "akka.http.scaladsl.model.HttpResponse") generated by one of the `WebSocketUpgradeWebSocketUpgrade.handleMessagesWith` methods. In its most general form this method expects two arguments: first, a handler [`Flow<Message, Message, Any>`](https://doc.akka.io/japi/akka/2.10/akka/stream/javadsl/Flow.html "akka.stream.javadsl.Flow")[`Flow[Message, Message, Any]`](https://doc.akka.io/api/akka/2.10/akka/stream/scaladsl/Flow.html "akka.stream.scaladsl.Flow")[`Flow<Message, Message, ?>`](https://doc.akka.io/japi/akka/2.10/akka/stream/javadsl/Flow.html "akka.stream.javadsl.Flow")[`Flow[Message, Message, ?]`](https://doc.akka.io/api/akka/2.10/akka/stream/scaladsl/Flow.html "akka.stream.scaladsl.Flow") that will be used to handle WebSocket messages on this connection. Second, the application can optionally choose one of the proposed application\-level sub\-protocols by inspecting the values of `WebSocketUpgrade.requestedProtocols``WebSocketUpgrade.getRequestedProtocols` and pass the chosen protocol value to `handleMessages``handleMessagesWith`.

### Handling Messages

A message handler is expected to be implemented as a [`Flow<Message, Message, Any>`](https://doc.akka.io/japi/akka/2.10/akka/stream/javadsl/Flow.html "akka.stream.javadsl.Flow")[`Flow[Message, Message, Any]`](https://doc.akka.io/api/akka/2.10/akka/stream/scaladsl/Flow.html "akka.stream.scaladsl.Flow")[`Flow<Message, Message, ?>`](https://doc.akka.io/japi/akka/2.10/akka/stream/javadsl/Flow.html "akka.stream.javadsl.Flow")[`Flow[Message, Message, ?]`](https://doc.akka.io/api/akka/2.10/akka/stream/scaladsl/Flow.html "akka.stream.scaladsl.Flow"). For typical request\-response scenarios this fits very well and such a [`Flow`](https://doc.akka.io/japi/akka/2.10/akka/stream/javadsl/Flow.html "akka.stream.javadsl.Flow")[`Flow`](https://doc.akka.io/api/akka/2.10/akka/stream/scaladsl/Flow.html "akka.stream.scaladsl.Flow") can be constructed from a simple function by using `Flow[Message].map` or `Flow[Message].mapAsync``Flow.<Message>create().map` or `Flow.<Message>create().mapAsync`.

There are other use\-cases, e.g. in a server\-push model, where a server message is sent spontaneously, or in a true bi\-directional scenario where input and output aren’t logically connected. Providing the handler as a [`Flow`](https://doc.akka.io/japi/akka/2.10/akka/stream/javadsl/Flow.html "akka.stream.javadsl.Flow")[`Flow`](https://doc.akka.io/api/akka/2.10/akka/stream/scaladsl/Flow.html "akka.stream.scaladsl.Flow") in these cases may not fit. Another method named `WebSocketUpgrade.handleMessagesWithSinkSource`An overload of `WebSocketUpgrade.handleMessagesWith` is provided, instead, which allows to pass an output\-generating [`Source<Message, ?>`](https://doc.akka.io/japi/akka/2.10/akka/stream/javadsl/Source.html "akka.stream.javadsl.Source")[`Source[Message, _]`](https://doc.akka.io/api/akka/2.10/akka/stream/scaladsl/Source.html "akka.stream.scaladsl.Source") and an input\-receiving [`Sink<Message, ?>`](https://doc.akka.io/japi/akka/2.10/akka/stream/javadsl/Sink.html "akka.stream.javadsl.Sink")[`Sink[Message, _]`](https://doc.akka.io/api/akka/2.10/akka/stream/scaladsl/Sink.html "akka.stream.scaladsl.Sink") independently.

Note that a handler is required to consume the data stream of each message to make place for new messages. Otherwise, subsequent messages may be stuck and message traffic in this direction will stall.

### Example

Let’s look at an [example](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/WebSocketExampleSpec.scala)[example](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/WebSocketCoreExample.java).

WebSocket requests come in like any other requests. In the example, requests to `/greeter` are expected to be WebSocket requests:

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/WebSocketExampleSpec.scala#L54-L63 "Go to snippet source")val requestHandler: HttpRequest => HttpResponse = {
  case req @ HttpRequest(GET, Uri.Path("/greeter"), _, _, _) =>
    req.attribute(AttributeKeys.webSocketUpgrade) match {
      case Some(upgrade) => upgrade.handleMessages(greeterWebSocketService)
      case None          => HttpResponse(400, entity = "Not a valid websocket request!")
    }
  case r: HttpRequest =>
    r.discardEntityBytes() // important to drain incoming HTTP Entity stream
    HttpResponse(404, entity = "Unknown resource!")
}
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/WebSocketCoreExample.java#L47-L63 "Go to snippet source")public static HttpResponse handleRequest(HttpRequest request) {
  System.out.println("Handling request to " + request.getUri());

  if (request.getUri().path().equals("/greeter")) {
    return request.getAttribute(AttributeKeys.webSocketUpgrade())
      .map(upgrade -> {
        Flow<Message, Message, NotUsed> greeterFlow = greeter();
        HttpResponse response = upgrade.handleMessagesWith(greeterFlow);
        return response;
      })
      .orElse(
        HttpResponse.create().withStatus(StatusCodes.BAD_REQUEST).withEntity("Expected WebSocket request")
      );
  } else {
    return HttpResponse.create().withStatus(404);
  }
}
```

It uses pattern matching onlooks at the path and then inspects the request to query for the [`WebSocketUpgrade`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/ws/WebSocketUpgrade.html "akka.http.javadsl.model.ws.WebSocketUpgrade")[`WebSocketUpgrade`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/ws/WebSocketUpgrade.html "akka.http.scaladsl.model.ws.WebSocketUpgrade") attribute. If such an attribute is found, it is used to generate a response by passing a handler for WebSocket messages to the `handleMessages``handleMessagesWith` method. If no such attribute is found a `400 Bad Request` response is generated.

You can also use the [`WebSocket.handleWebSocketRequestWith`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/ws/WebSocket.html "akka.http.javadsl.model.ws.WebSocket") helper method which can be used if only WebSocket requests are expected. The method looks for the [`WebSocketUpgrade`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/ws/WebSocketUpgrade.html "akka.http.javadsl.model.ws.WebSocketUpgrade")[`WebSocketUpgrade`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/ws/WebSocketUpgrade.html "akka.http.scaladsl.model.ws.WebSocketUpgrade") attribute and returns a response that will install the passed WebSocket handler if the header is found. If the request is no WebSocket request it will return a `400 Bad Request` error response.

In the example, the passed handler expects text messages where each message is expected to contain a (person’s) name and then responds with another text message that contains a greeting:

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/WebSocketExampleSpec.scala#L36-L50 "Go to snippet source")// The Greeter WebSocket Service expects a "name" per message and
// returns a greeting message for that name
val greeterWebSocketService =
  Flow[Message]
    .mapConcat {
      // we match but don't actually consume the text message here,
      // rather we simply stream it back as the tail of the response
      // this means we might start sending the response even before the
      // end of the incoming message has been received
      case tm: TextMessage => TextMessage(Source.single("Hello ") ++ tm.textStream) :: Nil
      case bm: BinaryMessage =>
        // ignore binary messages but drain content to avoid the stream being clogged
        bm.dataStream.runWith(Sink.ignore)
        Nil
    }
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/WebSocketCoreExample.java#L86-L118 "Go to snippet source")  
/**
 * A handler that treats incoming messages as a name,
 * and responds with a greeting to that name
 */
public static Flow<Message, Message, NotUsed> greeter() {
  return
    Flow.<Message>create()
      .collect(new JavaPartialFunction<Message, Message>() {
        @Override
        public Message apply(Message msg, boolean isCheck) throws Exception {
          if (isCheck) {
            if (msg.isText()) {
              return null;
            } else {
              throw noMatch();
            }
          } else {
            return handleTextMessage(msg.asTextMessage());
          }
        }
      });
}

public static TextMessage handleTextMessage(TextMessage msg) {
  if (msg.isStrict()) // optimization that directly creates a simple response...
  {
    return TextMessage.create("Hello " + msg.getStrictText());
  } else // ... this would suffice to handle all text messages in a streaming fashion
  {
    return TextMessage.create(Source.single("Hello ").concat(msg.getStreamedText()));
  }
}
```

Note
Inactive WebSocket connections will be dropped according to the [idle\-timeout settings](../common/timeouts.html#idle-timeouts). In case you need to keep inactive connections alive, you can either tweak your idle\-timeout or inject ‘keep\-alive’ messages regularly.

## Automatic keep\-alive Ping support

For long running websocket connections it may be beneficial to enable automatic heartbeat using `Ping` frames. Those are often used as a way to keep otherwise idle connections from being closed and also a way of ensuring the connection remains usable even after no data frames are communicated over a longer period of time. Such heartbeat may be initiated by either side of the connection, and the choice which side performs the heart beating is use\-case dependent. 

This is supported in a transparent way via configuration in Akka HTTP, and you can enable it by setting the: `akka.http.server.websocket.periodic-keep-alive-max-idle = 1 second` to a specified max idle timeout. The keep alive triggers when no other messages are in\-flight during the such configured period. Akka HTTP will then automatically send a [`Ping` frame](https://datatracker.ietf.org/doc/html/rfc6455#section-5.5.2) for each of such idle intervals.

By default, the automatic keep\-alive feature is disabled.

### Custom keep\-alive data payloads

By default, pings do not carry any payload, as it is often enough to simply push *any* frame over the connection to ensure the connection stays healthy (or detect if it was severed), however you may configure them to carry a custom payload, to do this you can provide a function that will be asked to emit the payload for each of the ping messages generated:

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/WebSocketExampleSpec.scala#L122-L128 "Go to snippet source")val defaultSettings = ServerSettings(system)

val pingCounter = new AtomicInteger()

Http().newServerAt("127.0.0.1", 0)
  .adaptSettings(_.mapWebsocketSettings(_.withPeriodicKeepAliveData(() => ByteString(s"debug-${pingCounter.incrementAndGet()}"))))
  .bind(route)
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/WebSocketCoreExample.java#L125-L140 "Go to snippet source")ServerSettings defaultSettings = ServerSettings.create(system);

AtomicInteger pingCounter = new AtomicInteger();

WebSocketSettings customWebsocketSettings = defaultSettings.getWebsocketSettings()
    .withPeriodicKeepAliveData(() ->
        ByteString.fromString(String.format("debug-%d", pingCounter.incrementAndGet()))
    );

ServerSettings customServerSettings = defaultSettings.withWebsocketSettings(customWebsocketSettings);

Http http = Http.get(system);
http.newServerAt("127.0.0.1", 8080)
    .withSettings(customServerSettings)
    .bindFlow(handler);
```

### Uni\-directional Pong keep\-alive

A Ping response will always be replied to by the client\-side with an appropriate `Pong` reply, carrying the same payload. It is also possible to configure the keep\-alive mechanism to send `Pong` frames instead of `Ping` frames, which enables an [uni\-directional heartbeat](https://datatracker.ietf.org/doc/html/rfc6455#section-5.5.3) mechanism (in which case the client side will *not* reply to such heartbeat). You can configure this mode by setting: `akka.http.server.websocket.periodic-keep-alive-mode = pong`.

## Code Examples

### Example 1: Model

```scala
/**
 * The ADT for WebSocket messages. A message can either be a binary or a text message.
 */
sealed trait Message extends akka.http.javadsl.model.ws.Message

/**
 * Represents a WebSocket text message. A text message can either be a [[TextMessage.Strict]] in which case
 * the complete data is already available or it can be [[TextMessage.Streamed]] in which case `textStream`
 * will return a Source streaming the data as it comes in.
 */
sealed trait TextMessage extends akka.http.javadsl.model.ws.TextMessage with Message {
  /**
   * The contents of this message as a stream.
   */
  def textStream: Source[String, _]

  /**
   * Collects all possible parts and returns a potentially future Strict Message for easier processing.
   * The Future is failed with an TimeoutException if the stream isn't completed after the given timeout.
   */
  def toStrict(timeout: FiniteDuration)(implicit fm: Materializer): Future[TextMessage.Strict] =
    this match {
      case TextMessage.Strict(text) => Future.successful(TextMessage.Strict(text))
      case TextMessage.Streamed(textStream) => textStream
        .completionTimeout(timeout)
        .runFold(new StringBuilder())((b, s) => b.append(s))
        .map(b => b.toString)(fm.executionContext)
        .map(text => TextMessage.Strict(text))(fm.executionContext)
    }

  /** Java API */
  override def getStreamedText: javadsl.Source[String, _] = textStream.asJava
  override def asScala: TextMessage = this
  override def toStrict(timeoutMillis: Long, materializer: Materializer): CompletionStage[TextMessage.Strict] = toStrict(timeoutMillis.millis)(materializer).asJava
}
sealed trait BinaryMessage extends akka.http.javadsl.model.ws.BinaryMessage with Message {
  /**
   * The contents of this message as a stream.
   */
  def dataStream: Source[ByteString, _]

  /**
   * Collects all possible parts and returns a potentially future Strict Message for easier processing.
   * The Future is failed with an TimeoutException if the stream isn't completed after the given timeout.
   */
  def toStrict(timeout: FiniteDuration)(implicit fm: Materializer): Future[BinaryMessage.Strict] =
    this match {
      case BinaryMessage.Strict(binary) => Future.successful(BinaryMessage.Strict(binary))
      case BinaryMessage.Streamed(binaryStream) => binaryStream
        .completionTimeout(timeout)
        .runFold(new ByteStringBuilder())((b, e) => b.append(e))
        .map(b => b.result())(fm.executionContext)
        .map(binary => BinaryMessage.Strict(binary))(fm.executionContext)
    }

  /** Java API */
  override def getStreamedData: javadsl.Source[ByteString, _] = dataStream.asJava
  override def asScala: BinaryMessage = this
  override def toStrict(timeoutMillis: Long, materializer: Materializer): CompletionStage[BinaryMessage.Strict] = toStrict(timeoutMillis.millis)(materializer).asJava
}
```

### Example 2: Model

```scala
abstract class TextMessage extends Message {
  /**
   * Returns a source of the text message data.
   */
  def getStreamedText: Source[String, _]

  /**
   * Returns the strict message text if this message is strict, throws otherwise.
   */
  def getStrictText: String
}
```

### Example 3: Routing support

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

### Example 4: Routing support

```java
public Route createRoute() {
  return
    path("greeter", () ->
      handleWebSocketMessages(greeter())
    );
}
```

### Example 5: Example

```scala
val requestHandler: HttpRequest => HttpResponse = {
  case req @ HttpRequest(GET, Uri.Path("/greeter"), _, _, _) =>
    req.attribute(AttributeKeys.webSocketUpgrade) match {
      case Some(upgrade) => upgrade.handleMessages(greeterWebSocketService)
      case None          => HttpResponse(400, entity = "Not a valid websocket request!")
    }
  case r: HttpRequest =>
    r.discardEntityBytes() // important to drain incoming HTTP Entity stream
    HttpResponse(404, entity = "Unknown resource!")
}
```

### Example 6: Example

```java
public static HttpResponse handleRequest(HttpRequest request) {
  System.out.println("Handling request to " + request.getUri());

  if (request.getUri().path().equals("/greeter")) {
    return request.getAttribute(AttributeKeys.webSocketUpgrade())
      .map(upgrade -> {
        Flow<Message, Message, NotUsed> greeterFlow = greeter();
        HttpResponse response = upgrade.handleMessagesWith(greeterFlow);
        return response;
      })
      .orElse(
        HttpResponse.create().withStatus(StatusCodes.BAD_REQUEST).withEntity("Expected WebSocket request")
      );
  } else {
    return HttpResponse.create().withStatus(404);
  }
}
```

### Example 7: Example

```scala
// The Greeter WebSocket Service expects a "name" per message and
// returns a greeting message for that name
val greeterWebSocketService =
  Flow[Message]
    .mapConcat {
      // we match but don't actually consume the text message here,
      // rather we simply stream it back as the tail of the response
      // this means we might start sending the response even before the
      // end of the incoming message has been received
      case tm: TextMessage => TextMessage(Source.single("Hello ") ++ tm.textStream) :: Nil
      case bm: BinaryMessage =>
        // ignore binary messages but drain content to avoid the stream being clogged
        bm.dataStream.runWith(Sink.ignore)
        Nil
    }
```

### Example 8: Example

```java
/**
 * A handler that treats incoming messages as a name,
 * and responds with a greeting to that name
 */
public static Flow<Message, Message, NotUsed> greeter() {
  return
    Flow.<Message>create()
      .collect(new JavaPartialFunction<Message, Message>() {
        @Override
        public Message apply(Message msg, boolean isCheck) throws Exception {
          if (isCheck) {
            if (msg.isText()) {
              return null;
            } else {
              throw noMatch();
            }
          } else {
            return handleTextMessage(msg.asTextMessage());
          }
        }
      });
}

public static TextMessage handleTextMessage(TextMessage msg) {
  if (msg.isStrict()) // optimization that directly creates a simple response...
  {
    return TextMessage.create("Hello " + msg.getStrictText());
  } else // ... this would suffice to handle all text messages in a streaming fashion
  {
    return TextMessage.create(Source.single("Hello ").concat(msg.getStreamedText()));
  }
}
```

### Example 9: Custom keep-alive data payloads

```scala
val defaultSettings = ServerSettings(system)

val pingCounter = new AtomicInteger()

Http().newServerAt("127.0.0.1", 0)
  .adaptSettings(_.mapWebsocketSettings(_.withPeriodicKeepAliveData(() => ByteString(s"debug-${pingCounter.incrementAndGet()}"))))
  .bind(route)
```

### Example 10: Custom keep-alive data payloads

```java
ServerSettings defaultSettings = ServerSettings.create(system);

AtomicInteger pingCounter = new AtomicInteger();

WebSocketSettings customWebsocketSettings = defaultSettings.getWebsocketSettings()
    .withPeriodicKeepAliveData(() ->
        ByteString.fromString(String.format("debug-%d", pingCounter.incrementAndGet()))
    );


ServerSettings customServerSettings = defaultSettings.withWebsocketSettings(customWebsocketSettings);

Http http = Http.get(system);
http.newServerAt("127.0.0.1", 8080)
    .withSettings(customServerSettings)
    .bindFlow(handler);
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpResponse.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/ws/BinaryMessage.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/ws/Message.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/ws/TextMessage.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/ws/WebSocketUpgrade.html
- https://doc.akka.io/api/akka/2.10/akka/stream/scaladsl/Flow.html
- https://doc.akka.io/api/akka/2.10/akka/stream/scaladsl/Sink.html
- https://doc.akka.io/api/akka/2.10/akka/stream/scaladsl/Source.html
- https://doc.akka.io/api/akka/2.10/akka/util/ByteString.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpResponse.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/ws/BinaryMessage.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/ws/Message.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/ws/TextMessage.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/ws/WebSocket.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/ws/WebSocketUpgrade.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/javadsl/Flow.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/javadsl/Sink.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/javadsl/Source.html
- https://doc.akka.io/japi/akka/2.10/akka/util/ByteString.html
- https://doc.akka.io/libraries/akka-http/current/common/timeouts.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/websocket-directives/handleWebSocketMessages.html
- https://doc.akka.io/libraries/akka-http/current/server-side/low-level-api.html
- https://doc.akka.io/libraries/akka-http/current/server-side/server-https-support.html
- https://doc.akka.io/libraries/akka-http/current/server-side/websocket-support.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/server-side/websocket-support.html](https://doc.akka.io/libraries/akka-http/current/server-side/websocket-support.html)*