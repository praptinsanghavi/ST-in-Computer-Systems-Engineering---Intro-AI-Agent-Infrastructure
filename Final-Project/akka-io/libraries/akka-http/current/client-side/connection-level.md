---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:17:17Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/client-side/connection-level.html
title: Connection-Level Client-Side API • Akka HTTP
---

# Connection-Level Client-Side API • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Connection\-Level Client\-Side API

The connection\-level API is the lowest\-level client\-side API Akka HTTP provides. It gives you full control over when HTTP connections are opened and closed and how requests are to be sent across which connection. As such it offers the highest flexibility at the cost of providing the least convenience.

Note
It is recommended to first read the [Implications of the streaming nature of Request/Response Entities](../implications-of-streaming-http-entity.html) section, as it explains the underlying full\-stack streaming concepts, which may be unexpected when coming from a background with non\-“streaming first” HTTP Clients.

## Opening HTTP Connections

With the connection\-level API you open a new HTTP connection to a target endpoint by materializing a [`Flow`](https://doc.akka.io/japi/akka/2.10/akka/stream/javadsl/Flow.html "akka.stream.javadsl.Flow")[`Flow`](https://doc.akka.io/api/akka/2.10/akka/stream/scaladsl/Flow.html "akka.stream.scaladsl.Flow") returned by the builder returned by `Http().connectionTo(...)``Http.get(system).connectionTo(...)` method. Here is an example:

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/HttpClientOutgoingConnection.scala "Go to snippet source")/*
 * Copyright (C) 2020-2025 Lightbend Inc. <https://akka.io>
 */

package docs.http.scaladsl

import akka.actor.ActorSystem
import akka.http.scaladsl.Http
import akka.http.scaladsl.model._
import akka.stream.scaladsl._

import scala.concurrent.Future
import scala.util.{ Failure, Success }

object HttpClientOutgoingConnection {
  def main(args: Array[String]): Unit = {
    implicit val system = ActorSystem()
    implicit val executionContext = system.dispatcher

    val connectionFlow: Flow[HttpRequest, HttpResponse, Future[Http.OutgoingConnection]] =
      Http().connectionTo("akka.io").http()

    def dispatchRequest(request: HttpRequest): Future[HttpResponse] =
      // This is actually a bad idea in general. Even if the `connectionFlow` was instantiated only once above,
      // a new connection is opened every single time, `runWith` is called. Materialization (the `runWith` call)
      // and opening up a new connection is slow.
      //
      // The `outgoingConnection` API is very low-level. Use it only if you already have a `Source[HttpRequest, _]`
      // (other than Source.single) available that you want to use to run requests on a single persistent HTTP
      // connection.
      //
      // Unfortunately, this case is so uncommon, that we couldn't come up with a good example.
      //
      // In almost all cases it is better to use the `Http().singleRequest()` API instead.
      Source.single(request)
        .via(connectionFlow)
        .runWith(Sink.head)

    val responseFuture: Future[HttpResponse] = dispatchRequest(HttpRequest(uri = "/"))

    responseFuture.andThen {
      case Success(_) => println("request succeeded")
      case Failure(_) => println("request failed")
    }.andThen {
      case _ => system.terminate()
    }
  }
}
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/HttpClientExampleDocTest.java#L185-L204 "Go to snippet source")  
final ActorSystem system = ActorSystem.create();

final Flow<HttpRequest, HttpResponse, CompletionStage<OutgoingConnection>> connectionFlow =
        Http.get(system).connectionTo("akka.io").http();
final CompletionStage<HttpResponse> responseFuture =
        // This is actually a bad idea in general. Even if the `connectionFlow` was instantiated only once above,
        // a new connection is opened every single time, `runWith` is called. Materialization (the `runWith` call)
        // and opening up a new connection is slow.
        //
        // The `outgoingConnection` API is very low-level. Use it only if you already have a `Source[HttpRequest, _]`
        // (other than Source.single) available that you want to use to run requests on a single persistent HTTP
        // connection.
        //
        // Unfortunately, this case is so uncommon, that we couldn't come up with a good example.
        //
        // In almost all cases it is better to use the `Http().singleRequest()` API instead.
        Source.single(HttpRequest.create("/"))
                .via(connectionFlow)
                .runWith(Sink.<HttpResponse>head(), system);
```

In addition to the host name and port the builder [`OutgoingConnectionBuilder`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/OutgoingConnectionBuilder.html "akka.http.javadsl.OutgoingConnectionBuilder")[`OutgoingConnectionBuilder`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/OutgoingConnectionBuilder.html "akka.http.scaladsl.OutgoingConnectionBuilder") returned by `Http().connectionTo(...)``Http.get(system).connectionTo(...)` method also allows you to specify additional properties and as the final step deciding which protocol to use (HTTP/1, HTTP/1 over TLS, HTTP/2 over TLS or HTTP/2 with prior knowledge over a plaintext connection). For details on using HTTP/2 see [Client\-Side HTTP/2](http2.html).

No connection is attempted until the returned flow is actually materialized! If the flow is materialized several times then several independent connections will be opened (one per materialization). If the connection attempt fails, for whatever reason, the materialized flow will be immediately terminated with a respective exception.

## Request\-Response Cycle

Once the connection flow has been materialized it is ready to consume [`HttpRequest`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpRequest.html "akka.http.javadsl.model.HttpRequest")[`HttpRequest`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpRequest.html "akka.http.scaladsl.model.HttpRequest") instances from the source it is attached to. Each request is sent across the connection and incoming responses dispatched to the downstream pipeline. Of course and as always, back\-pressure is adequately maintained across all parts of the connection. This means that, if the downstream pipeline consuming the HTTP responses is slow, the request source will eventually be slowed down in sending requests.

Any errors occurring on the underlying connection are surfaced as exceptions terminating the response stream (and canceling the request source).

## Closing Connections

Akka HTTP actively closes an established connection upon reception of a response containing `Connection: close` header. The connection can also be closed by the server.

An application can actively trigger the closing of the connection by completing the request stream. In this case the underlying TCP connection will be closed when the last pending response has been received.

The connection will also be closed if the response entity is cancelled (e.g. by attaching it to `Sink.cancelled()`) or consumed only partially (e.g. by using `take` combinator). In order to prevent this behaviour the entity should be explicitly drained by attaching it to `Sink.ignore()`.

## Timeouts

Currently Akka HTTP doesn’t implement client\-side request timeout checking itself as this functionality can be regarded as a more general purpose streaming infrastructure feature.

It should be noted that Akka Streams provide various timeout functionality so any API that uses streams can benefit from the stream stages such as `idleTimeout`, `backpressureTimeout`, `completionTimeout`, `initialTimeout` and `throttle`. To learn more about these refer to their documentation in Akka Streams.

For more details about timeout support in Akka HTTP in general refer to [Akka HTTP Timeouts](../common/timeouts.html).

## Stand\-Alone HTTP Layer Usage

Due to its Reactive\-Streams\-based nature the Akka HTTP layer is fully detachable from the underlying TCP interface. While in most applications this “feature” will not be crucial it can be useful in certain cases to be able to “run” the HTTP layer (and, potentially, higher\-layers) against data that do not come from the network but rather some other source. Potential scenarios where this might be useful include tests, debugging or low\-level event\-sourcing (e.g. by replaying network traffic).

On the client\-side the stand\-alone HTTP layer forms a `BidiStage` stage that “upgrades” a potentially encrypted raw connection to the HTTP level. It is defined like this:

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/akka-http-core/src/main/scala/akka/http/scaladsl/Http.scala#L849-L861 "Go to snippet source")/**
 * The type of the client-side HTTP layer as a stand-alone BidiFlow
 * that can be put atop the TCP layer to form an HTTP client.
 *
 * {{{
 *                +------+
 * HttpRequest  ~>|      |~> SslTlsOutbound
 *                | bidi |
 * HttpResponse <~|      |<~ SslTlsInbound
 *                +------+
 * }}}
 */
type ClientLayer = BidiFlow[HttpRequest, SslTlsOutbound, SslTlsInbound, HttpResponse, NotUsed]
```

```
BidiFlow<HttpRequest, SslTlsOutbound, SslTlsInbound, HttpResponse, NotUsed>

```

You create an instance of `Http.ClientLayer`the layer by calling one of the two overloads of the `Http().clientLayer``Http.get(system).clientLayer` method, which also allows for varying degrees of configuration.

## Code Examples

### Example 1: Opening HTTP Connections

```scala
/*
 * Copyright (C) 2020-2025 Lightbend Inc. <https://akka.io>
 */

package docs.http.scaladsl

import akka.actor.ActorSystem
import akka.http.scaladsl.Http
import akka.http.scaladsl.model._
import akka.stream.scaladsl._

import scala.concurrent.Future
import scala.util.{ Failure, Success }

object HttpClientOutgoingConnection {
  def main(args: Array[String]): Unit = {
    implicit val system = ActorSystem()
    implicit val executionContext = system.dispatcher

    val connectionFlow: Flow[HttpRequest, HttpResponse, Future[Http.OutgoingConnection]] =
      Http().connectionTo("akka.io").http()

    def dispatchRequest(request: HttpRequest): Future[HttpResponse] =
      // This is actually a bad idea in general. Even if the `connectionFlow` was instantiated only once above,
      // a new connection is opened every single time, `runWith` is called. Materialization (the `runWith` call)
      // and opening up a new connection is slow.
      //
      // The `outgoingConnection` API is very low-level. Use it only if you already have a `Source[HttpRequest, _]`
      // (other than Source.single) available that you want to use to run requests on a single persistent HTTP
      // connection.
      //
      // Unfortunately, this case is so uncommon, that we couldn't come up with a good example.
      //
      // In almost all cases it is better to use the `Http().singleRequest()` API instead.
      Source.single(request)
        .via(connectionFlow)
        .runWith(Sink.head)

    val responseFuture: Future[HttpResponse] = dispatchRequest(HttpRequest(uri = "/"))

    responseFuture.andThen {
      case Success(_) => println("request succeeded")
      case Failure(_) => println("request failed")
    }.andThen {
      case _ => system.terminate()
    }
  }
}
```

### Example 2: Opening HTTP Connections

```java
final ActorSystem system = ActorSystem.create();

final Flow<HttpRequest, HttpResponse, CompletionStage<OutgoingConnection>> connectionFlow =
        Http.get(system).connectionTo("akka.io").http();
final CompletionStage<HttpResponse> responseFuture =
        // This is actually a bad idea in general. Even if the `connectionFlow` was instantiated only once above,
        // a new connection is opened every single time, `runWith` is called. Materialization (the `runWith` call)
        // and opening up a new connection is slow.
        //
        // The `outgoingConnection` API is very low-level. Use it only if you already have a `Source[HttpRequest, _]`
        // (other than Source.single) available that you want to use to run requests on a single persistent HTTP
        // connection.
        //
        // Unfortunately, this case is so uncommon, that we couldn't come up with a good example.
        //
        // In almost all cases it is better to use the `Http().singleRequest()` API instead.
        Source.single(HttpRequest.create("/"))
                .via(connectionFlow)
                .runWith(Sink.<HttpResponse>head(), system);
```

### Example 3: Stand-Alone HTTP Layer Usage

```scala
/**
 * The type of the client-side HTTP layer as a stand-alone BidiFlow
 * that can be put atop the TCP layer to form an HTTP client.
 *
 * {{{
 *                +------+
 * HttpRequest  ~>|      |~> SslTlsOutbound
 *                | bidi |
 * HttpResponse <~|      |<~ SslTlsInbound
 *                +------+
 * }}}
 */
type ClientLayer = BidiFlow[HttpRequest, SslTlsOutbound, SslTlsInbound, HttpResponse, NotUsed]
```

### Example 4: Stand-Alone HTTP Layer Usage

```java
BidiFlow<HttpRequest, SslTlsOutbound, SslTlsInbound, HttpResponse, NotUsed>
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/OutgoingConnectionBuilder.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpRequest.html
- https://doc.akka.io/api/akka/2.10/akka/stream/scaladsl/Flow.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/OutgoingConnectionBuilder.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpRequest.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/javadsl/Flow.html
- https://doc.akka.io/libraries/akka-http/current/client-side/host-level.html
- https://doc.akka.io/libraries/akka-http/current/client-side/http2.html
- https://doc.akka.io/libraries/akka-http/current/client-side/pool-overflow.html
- https://doc.akka.io/libraries/akka-http/current/common/timeouts.html
- https://doc.akka.io/libraries/akka-http/current/implications-of-streaming-http-entity.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/client-side/connection-level.html](https://doc.akka.io/libraries/akka-http/current/client-side/connection-level.html)*