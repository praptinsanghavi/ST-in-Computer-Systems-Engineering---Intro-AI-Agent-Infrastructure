---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:17:18Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/common/sse-support.html
title: Server-Sent Events Support • Akka HTTP
---

# Server-Sent Events Support • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Server\-Sent Events Support

Server\-Sent Events (SSE) is a lightweight and [standardized](https://www.w3.org/TR/html/) protocol for pushing notifications from an HTTP server to a client. In contrast to WebSocket, which offers bi\-directional communication, SSE only allows for one\-way communication from the server to the client. If that’s all you need, SSE has the advantages to be much simpler, to rely on HTTP only and to offer retry semantics on broken connections by the browser.

According to the SSE specification clients can request an event stream from the server via HTTP. The server responds with the media type `text/event-stream` which has the fixed character encoding UTF\-8 and keeps the response open to send events to the client when available. Events are textual structures which carry fields and are terminated by an empty line, e.g.

```
data: { "username": "John Doe" }
event: added
id: 42

data: another event

```

Clients can optionally signal the last seen event to the server via the `Last-Event-ID``LastEventId` header, e.g. after a reconnect.

## Model

Akka HTTP represents event streams as [`Source<ServerSentEvent, ?>`](https://doc.akka.io/japi/akka/2.10/akka/stream/javadsl/Source.html "akka.stream.javadsl.Source")[`Source[ServerSentEvent, _]`](https://doc.akka.io/api/akka/2.10/akka/stream/scaladsl/Source.html "akka.stream.scaladsl.Source") where [`ServerSentEvent`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/sse/ServerSentEvent.html "akka.http.javadsl.model.sse.ServerSentEvent")[`ServerSentEvent`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/sse/ServerSentEvent.html "akka.http.scaladsl.model.sse.ServerSentEvent") is a case class with the following read\-only properties:

- `data: String``String data` – the actual payload, may span multiple lines
- `eventType: Option[String]``Optional<String> type` – optional qualifier, e.g. “added”, “removed”, etc.
- `id: Option[String]``Optional<String> id` – optional identifier
- `retry: Option[Int]``OptionalInt retry` – optional reconnection delay in milliseconds

In accordance to the SSE specification Akka HTTP also provides the `Last-Event-ID``LastEventId` header and the `text/event-stream``TEXT_EVENT_STREAM` media type.

## Server\-side usage: marshalling

In order to respond to an HTTP request with an event stream, you have to bring the implicit `ToResponseMarshaller[Source[ServerSentEvent, \_]]` defined by [`EventStreamMarshalling`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/marshalling/sse/EventStreamMarshalling.html "akka.http.javadsl.marshalling.sse.EventStreamMarshalling")[`EventStreamMarshalling`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/marshalling/sse/EventStreamMarshalling.html "akka.http.scaladsl.marshalling.sse.EventStreamMarshalling") into the scope defining the respective routeuse the `EventStreamMarshalling.toEventStream` marshaller:

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/ServerSentEventsExampleSpec.scala#L14-L39 "Go to snippet source")import akka.NotUsed
import akka.stream.scaladsl.Source

import akka.http.scaladsl.Http
import akka.http.scaladsl.unmarshalling.Unmarshal
import akka.http.scaladsl.model.sse.ServerSentEvent
import scala.concurrent.duration._

import java.time.LocalTime
import java.time.format.DateTimeFormatter.ISO_LOCAL_TIME

def route: Route = {
  import akka.http.scaladsl.marshalling.sse.EventStreamMarshalling._

  path("events") {
    get {
      complete {
        Source
          .tick(2.seconds, 2.seconds, NotUsed)
          .map(_ => LocalTime.now())
          .map(time => ServerSentEvent(ISO_LOCAL_TIME.format(time)))
          .keepAlive(1.second, () => ServerSentEvent.heartbeat)
      }
    }
  }
}
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/akka-http-tests/src/test/java/akka/http/javadsl/marshalling/sse/EventStreamMarshallingTest.java#L39-L42 "Go to snippet source")final List<ServerSentEvent> events = new ArrayList<>();
events.add(ServerSentEvent.create("1"));
events.add(ServerSentEvent.create("2"));
final Route route = completeOK(Source.from(events), EventStreamMarshalling.toEventStream());
```

## Client\-side usage: unmarshalling

In order to unmarshal an event stream as [`Source<ServerSentEvent, ?>`](https://doc.akka.io/japi/akka/2.10/akka/stream/javadsl/Source.html "akka.stream.javadsl.Source")[`Source[ServerSentEvent, _]`](https://doc.akka.io/api/akka/2.10/akka/stream/scaladsl/Source.html "akka.stream.scaladsl.Source"), you have to bring the implicit `FromEntityUnmarshaller[Source[ServerSentEvent, _]]` defined by [`EventStreamUnmarshalling`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/unmarshalling/sse/EventStreamUnmarshalling.html "akka.http.javadsl.unmarshalling.sse.EventStreamUnmarshalling")[`EventStreamUnmarshalling`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/unmarshalling/sse/EventStreamUnmarshalling.html "akka.http.scaladsl.unmarshalling.sse.EventStreamUnmarshalling") into scopeuse the `EventStreamUnmarshalling.fromEventsStream` unmarshaller:

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/ServerSentEventsExampleSpec.scala#L43-L48 "Go to snippet source")import akka.http.scaladsl.unmarshalling.sse.EventStreamUnmarshalling._

Http()
  .singleRequest(Get("http://localhost:8000/events"))
  .flatMap(Unmarshal(_).to[Source[ServerSentEvent, NotUsed]])
  .foreach(_.runForeach(println))
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/akka-http-tests/src/test/java/akka/http/javadsl/unmarshalling/sse/EventStreamUnmarshallingTest.java#L45-L50 "Go to snippet source")List<ServerSentEvent> unmarshalledEvents =
        EventStreamUnmarshalling.fromEventsStream(system)
                .unmarshal(entity, system)
                .thenCompose(source -> source.runWith(Sink.seq(), mat))
                .toCompletableFuture()
                .get(3000, TimeUnit.SECONDS);
```

Notice that if you are looking for a resilient way to permanently subscribe to an event stream, Alpakka provides the [EventSource](https://doc.akka.io/libraries/alpakka/current/sse.html) connector which reconnects automatically with the id of the last seen event.

## Code Examples

### Example 1: Server-Sent Events Support

```text
data: { "username": "John Doe" }
event: added
id: 42

data: another event
```

### Example 2: Server-side usage: marshalling

```scala
import akka.NotUsed
import akka.stream.scaladsl.Source

import akka.http.scaladsl.Http
import akka.http.scaladsl.unmarshalling.Unmarshal
import akka.http.scaladsl.model.sse.ServerSentEvent
import scala.concurrent.duration._

import java.time.LocalTime
import java.time.format.DateTimeFormatter.ISO_LOCAL_TIME

def route: Route = {
  import akka.http.scaladsl.marshalling.sse.EventStreamMarshalling._

  path("events") {
    get {
      complete {
        Source
          .tick(2.seconds, 2.seconds, NotUsed)
          .map(_ => LocalTime.now())
          .map(time => ServerSentEvent(ISO_LOCAL_TIME.format(time)))
          .keepAlive(1.second, () => ServerSentEvent.heartbeat)
      }
    }
  }
}
```

### Example 3: Server-side usage: marshalling

```java
final List<ServerSentEvent> events = new ArrayList<>();
events.add(ServerSentEvent.create("1"));
events.add(ServerSentEvent.create("2"));
final Route route = completeOK(Source.from(events), EventStreamMarshalling.toEventStream());
```

### Example 4: Client-side usage: unmarshalling

```scala
import akka.http.scaladsl.unmarshalling.sse.EventStreamUnmarshalling._

Http()
  .singleRequest(Get("http://localhost:8000/events"))
  .flatMap(Unmarshal(_).to[Source[ServerSentEvent, NotUsed]])
  .foreach(_.runForeach(println))
```

### Example 5: Client-side usage: unmarshalling

```java
List<ServerSentEvent> unmarshalledEvents =
        EventStreamUnmarshalling.fromEventsStream(system)
                .unmarshal(entity, system)
                .thenCompose(source -> source.runWith(Sink.seq(), mat))
                .toCompletableFuture()
                .get(3000, TimeUnit.SECONDS);
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/marshalling/sse/EventStreamMarshalling.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/sse/ServerSentEvent.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/unmarshalling/sse/EventStreamUnmarshalling.html
- https://doc.akka.io/api/akka/2.10/akka/stream/scaladsl/Source.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/marshalling/sse/EventStreamMarshalling.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/sse/ServerSentEvent.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/unmarshalling/sse/EventStreamUnmarshalling.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/javadsl/Source.html
- https://doc.akka.io/libraries/akka-http/current/common/timeouts.html
- https://doc.akka.io/libraries/akka-http/current/common/xml-support.html
- https://doc.akka.io/libraries/alpakka/current/sse.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/common/sse-support.html](https://doc.akka.io/libraries/akka-http/current/common/sse-support.html)*