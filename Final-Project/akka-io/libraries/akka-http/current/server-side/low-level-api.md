---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:23:26Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/server-side/low-level-api.html
title: Core Server API • Akka HTTP
---

# Core Server API • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Core Server API

The core Server API is scoped with a clear focus on the essential functionality of an HTTP/1\.1 server:

- Connection management
- Parsing and rendering of messages and headers
- Timeout management (for requests and connections)
- Response ordering (for transparent pipelining support)

All non\-core features of typical HTTP servers (like request routing, file serving, compression, etc.) are left to the [higher layers](../routing-dsl/index.html), they are not implemented by the `akka-http-core`\-level server itself. Apart from general focus this design keeps the server core small and light\-weight as well as easy to understand and maintain.

Note
It is recommended to read the [Implications of the streaming nature of Request/Response Entities](../implications-of-streaming-http-entity.html) section, as it explains the underlying full\-stack streaming concepts, which may be unexpected when coming from a background with non\-“streaming first” HTTP Servers.

## Streams and HTTP

The Akka HTTP server is implemented on top of [Streams](https://doc.akka.io/libraries/akka-core/2.10/stream/index.html) and makes heavy use of it \- in its implementation as well as on all levels of its API.

On the connection level Akka HTTP offers basically the same kind of interface as [Working with streaming IO](https://doc.akka.io/libraries/akka-core/2.10/stream/stream-io.html): A socket binding is represented as a stream of incoming connections. The application pulls connections from this stream source and, for each of them, provides a [`Flow<HttpRequest, HttpResponse, ?>`](https://doc.akka.io/japi/akka/2.10/akka/stream/javadsl/Flow.html "akka.stream.javadsl.Flow")[`Flow[HttpRequest, HttpResponse, _]`](https://doc.akka.io/api/akka/2.10/akka/stream/scaladsl/Flow.html "akka.stream.scaladsl.Flow") to “translate” requests into responses.

Apart from regarding a socket bound on the server\-side as a [`Source<IncomingConnection, ?>`](https://doc.akka.io/japi/akka/2.10/akka/stream/javadsl/Source.html "akka.stream.javadsl.Source")[`Source[IncomingConnection, _]`](https://doc.akka.io/api/akka/2.10/akka/stream/scaladsl/Source.html "akka.stream.scaladsl.Source") and each connection as a [`Source<HttpRequest, ?>`](https://doc.akka.io/japi/akka/2.10/akka/stream/javadsl/Source.html "akka.stream.javadsl.Source")[`Source[HttpRequest, _]`](https://doc.akka.io/api/akka/2.10/akka/stream/scaladsl/Source.html "akka.stream.scaladsl.Source") with a [`Sink<HttpResponse, ?>`](https://doc.akka.io/japi/akka/2.10/akka/stream/javadsl/Sink.html "akka.stream.javadsl.Sink")[`Sink[HttpResponse, _]`](https://doc.akka.io/api/akka/2.10/akka/stream/scaladsl/Sink.html "akka.stream.scaladsl.Sink") the stream abstraction is also present inside a single HTTP message: The entities of HTTP requests and responses are generally modeled as a [`Source<ByteString, ?>`](https://doc.akka.io/japi/akka/2.10/akka/stream/javadsl/Source.html "akka.stream.javadsl.Source")[`Source[ByteString, _]`](https://doc.akka.io/api/akka/2.10/akka/stream/scaladsl/Source.html "akka.stream.scaladsl.Source"). See also the [HTTP Model](../common/http-model.html) for more information on how HTTP messages are represented in Akka HTTP.

## Starting and Stopping

On the most basic level an Akka HTTP server is bound by invoking the `bind` method of the [`akka.http.scaladsl.Http`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/Http$.html "akka.http.scaladsl.Http")[`akka.http.javadsl.Http`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/Http.html "akka.http.javadsl.Http") extension:

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/HttpServerExampleSpec.scala#L32-L45 "Go to snippet source")import akka.actor.ActorSystem
import akka.http.scaladsl.Http
import akka.stream.scaladsl._

implicit val system = ActorSystem()
implicit val executionContext = system.dispatcher

val serverSource: Source[Http.IncomingConnection, Future[Http.ServerBinding]] =
  Http().newServerAt("localhost", 8080).connectionSource()
val bindingFuture: Future[Http.ServerBinding] =
  serverSource.to(Sink.foreach { connection => // foreach materializes the source
    println("Accepted new connection from " + connection.remoteAddress)
    // ... and then actually handle the connection
  }).run()
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/HttpServerExampleDocTest.java#L44-L55 "Go to snippet source")ActorSystem system = ActorSystem.create();
Materializer materializer = SystemMaterializer.get(system).materializer();

Source<IncomingConnection, CompletionStage<ServerBinding>> serverSource =
  Http.get(system).newServerAt("localhost", 8080).connectionSource();

CompletionStage<ServerBinding> serverBindingFuture =
  serverSource.to(Sink.foreach(connection -> {
      System.out.println("Accepted new connection from " + connection.remoteAddress());
      // ... and then actually handle the connection
    }
  )).run(materializer);
```

Arguments to the `Http().bind` method specify the interface and port to bind to and register interest in handling incoming HTTP connections. Additionally, the method also allows for the definition of socket options as well as a larger number of settings for configuring the server according to your needs.

The result of the `bind` method is a [`Source<Http.IncomingConnection>`](https://doc.akka.io/japi/akka/2.10/akka/stream/javadsl/Source.html "akka.stream.javadsl.Source")[`Source[Http.IncomingConnection]`](https://doc.akka.io/api/akka/2.10/akka/stream/scaladsl/Source.html "akka.stream.scaladsl.Source") which must be drained by the application in order to accept incoming connections. The actual binding is not performed before this source is materialized as part of a processing pipeline. In case the bind fails (e.g. because the port is already busy) the materialized stream will immediately be terminated with a respective exception. The binding is released (i.e. the underlying socket unbound) when the subscriber of the incoming connection source has cancelled its subscription. Alternatively one can use the `unbind()` method of the `Http.ServerBinding` instance that is created as part of the connection source’s materialization process. The `Http.ServerBinding` also provides a way to get a hold of the actual local address of the bound socket, which is useful for example when binding to port zero (and thus letting the OS pick an available port).

## Request\-Response Cycle

When a new connection has been accepted it will be published as an `Http.IncomingConnection` which consists of the remote address and methods to provide a [`Flow<HttpRequest, HttpResponse, ?>`](https://doc.akka.io/japi/akka/2.10/akka/stream/javadsl/Flow.html "akka.stream.javadsl.Flow")[`Flow[HttpRequest, HttpResponse, _]`](https://doc.akka.io/api/akka/2.10/akka/stream/scaladsl/Flow.html "akka.stream.scaladsl.Flow") to handle requests coming in over this connection.

Requests are handled by calling one of the `handleWithXXX` methods with a handler, which can either be

> - a [`Flow<HttpRequest, HttpResponse, ?>`](https://doc.akka.io/japi/akka/2.10/akka/stream/javadsl/Flow.html "akka.stream.javadsl.Flow")[`Flow[HttpRequest, HttpResponse, _]`](https://doc.akka.io/api/akka/2.10/akka/stream/scaladsl/Flow.html "akka.stream.scaladsl.Flow") for `handleWith`,
> - a function `HttpRequest => HttpResponse``Function<HttpRequest, HttpResponse>` for `handleWithSyncHandler`,
> - a function `HttpRequest => Future[HttpResponse]``Function<HttpRequest, CompletionStage<HttpResponse>>` for `handleWithAsyncHandler`.

Here is a complete example:

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/HttpServerExampleSpec.scala#L149-L184 "Go to snippet source")import akka.actor.ActorSystem
import akka.http.scaladsl.Http
import akka.http.scaladsl.model.HttpMethods._
import akka.http.scaladsl.model._
import akka.stream.scaladsl.Sink

implicit val system = ActorSystem()
implicit val executionContext = system.dispatcher

val serverSource = Http().newServerAt("localhost", 8080).connectionSource()

val requestHandler: HttpRequest => HttpResponse = {
  case HttpRequest(GET, Uri.Path("/"), _, _, _) =>
    HttpResponse(entity = HttpEntity(
      ContentTypes.`text/html(UTF-8)`,
      "<html><body>Hello world!</body></html>"))

  case HttpRequest(GET, Uri.Path("/ping"), _, _, _) =>
    HttpResponse(entity = "PONG!")

  case HttpRequest(GET, Uri.Path("/crash"), _, _, _) =>
    sys.error("BOOM!")

  case r: HttpRequest =>
    r.discardEntityBytes() // important to drain incoming HTTP Entity stream
    HttpResponse(404, entity = "Unknown resource!")
}

val bindingFuture: Future[Http.ServerBinding] =
  serverSource.to(Sink.foreach { connection =>
    println("Accepted new connection from " + connection.remoteAddress)

    connection handleWithSyncHandler requestHandler
    // this is equivalent to
    // connection handleWith { Flow[HttpRequest] map requestHandler }
  }).run()
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/HttpServerExampleDocTest.java#L154-L206 "Go to snippet source")ActorSystem system = ActorSystem.create();
  final Materializer materializer = SystemMaterializer.get(system).materializer();

  Source<IncomingConnection, CompletionStage<ServerBinding>> serverSource =
    Http.get(system).newServerAt("localhost", 8080).connectionSource();

  final Function<HttpRequest, HttpResponse> requestHandler =
    new Function<HttpRequest, HttpResponse>() {
      private final HttpResponse NOT_FOUND =
        HttpResponse.create()
          .withStatus(404)
          .withEntity("Unknown resource!");

      @Override
      public HttpResponse apply(HttpRequest request) throws Exception {
        Uri uri = request.getUri();
        if (request.method() == HttpMethods.GET) {
          if (uri.path().equals("/")) {
            return
              HttpResponse.create()
                .withEntity(ContentTypes.TEXT_HTML_UTF8,
                  "<html><body>Hello world!</body></html>");
          } else if (uri.path().equals("/hello")) {
            String name = uri.query().get("name").orElse("Mister X");

            return
              HttpResponse.create()
                .withEntity("Hello " + name + "!");
          } else if (uri.path().equals("/ping")) {
            return HttpResponse.create().withEntity("PONG!");
          } else {
            return NOT_FOUND;
          }
        } else {
          return NOT_FOUND;
        }
      }
    };

  CompletionStage<ServerBinding> serverBindingFuture =
    serverSource.to(Sink.foreach(connection -> {
      System.out.println("Accepted new connection from " + connection.remoteAddress());

      connection.handleWithSyncHandler(requestHandler, materializer);
      // this is equivalent to
      //connection.handleWith(Flow.of(HttpRequest.class).map(requestHandler), materializer);
    })).run(materializer);
```

In this example, a request is handled by transforming the request stream with a function `HttpRequest => HttpResponse``Function<HttpRequest, HttpResponse>` using `handleWithSyncHandler` (or equivalently, Akka Stream’s `map` operator). Depending on the use case many other ways of providing a request handler are conceivable using Akka Stream’s combinators. If the application provides a [`Flow`](https://doc.akka.io/japi/akka/2.10/akka/stream/javadsl/Flow.html "akka.stream.javadsl.Flow")[`Flow`](https://doc.akka.io/api/akka/2.10/akka/stream/scaladsl/Flow.html "akka.stream.scaladsl.Flow") it is also the responsibility of the application to generate exactly one response for every request and that the ordering of responses matches the ordering of the associated requests (which is relevant if HTTP pipelining is enabled where processing of multiple incoming requests may overlap). When relying on `handleWithSyncHandler` or `handleWithAsyncHandler`, or the `map` or `mapAsync` stream operators, this requirement will be automatically fulfilled.

See [Routing DSL Overview](../routing-dsl/overview.html) for a more convenient high\-level DSL to create request handlers.

### Streaming Request/Response Entities

Streaming of HTTP message entities is supported through subclasses of [`HttpEntity`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpEntity.html "akka.http.javadsl.model.HttpEntity")[`HttpEntity`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpEntity.html "akka.http.scaladsl.model.HttpEntity"). The application needs to be able to deal with streamed entities when receiving a request as well as, in many cases, when constructing responses. See [HttpEntity](../common/http-model.html#httpentity) for a description of the alternatives.

If you rely on the [Marshalling](../common/marshalling.html) and/or [Unmarshalling](../common/unmarshalling.html) facilities provided by Akka HTTP then the conversion of custom types to and from streamed entities can be quite convenient.

### Closing a connection

The HTTP connection will be closed when the handling [`Flow`](https://doc.akka.io/japi/akka/2.10/akka/stream/javadsl/Flow.html "akka.stream.javadsl.Flow")[`Flow`](https://doc.akka.io/api/akka/2.10/akka/stream/scaladsl/Flow.html "akka.stream.scaladsl.Flow") cancels its upstream subscription or the peer closes the connection. An often times more convenient alternative is to explicitly add a `Connection: close` header to an [`HttpResponse`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpResponse.html "akka.http.javadsl.model.HttpResponse")[`HttpResponse`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpResponse.html "akka.http.scaladsl.model.HttpResponse"). This response will then be the last one on the connection and the server will actively close the connection when it has been sent out.

Connection will also be closed if request entity has been cancelled (e.g. by attaching it to `Sink.cancelled()` or consumed only partially (e.g. by using `take` combinator). In order to prevent this behaviour entity should be explicitly drained by attaching it to `Sink.ignore()`.

## Configuring Server\-side HTTPS

For detailed documentation about configuring and using HTTPS on the server\-side refer to [Server\-Side HTTPS Support](server-https-support.html).

## Stand\-Alone HTTP Layer Usage

Due to its Reactive\-Streams\-based nature the Akka HTTP layer is fully detachable from the underlying TCP interface. While in most applications this “feature” will not be crucial it can be useful in certain cases to be able to “run” the HTTP layer (and, potentially, higher\-layers) against data that do not come from the network but rather some other source. Potential scenarios where this might be useful include tests, debugging or low\-level event\-sourcing (e.g by replaying network traffic).

On the server\-side the stand\-alone HTTP layer forms a [`BidiFlow`](https://doc.akka.io/japi/akka/2.10/akka/stream/javadsl/BidiFlow.html "akka.stream.javadsl.BidiFlow")[`BidiFlow`](https://doc.akka.io/api/akka/2.10/akka/stream/scaladsl/BidiFlow.html "akka.stream.scaladsl.BidiFlow") that is defined like this:

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/akka-http-core/src/main/scala/akka/http/scaladsl/Http.scala#L833-L845 "Go to snippet source")/**
 * The type of the server-side HTTP layer as a stand-alone BidiFlow
 * that can be put atop the TCP layer to form an HTTP server.
 *
 * {{{
 *                +------+
 * HttpResponse ~>|      |~> SslTlsOutbound
 *                | bidi |
 * HttpRequest  <~|      |<~ SslTlsInbound
 *                +------+
 * }}}
 */
type ServerLayer = BidiFlow[HttpResponse, SslTlsOutbound, SslTlsInbound, HttpRequest, NotUsed]
```

You create an instance of `Http.ServerLayer` by calling one of the two overloads of the `Http().serverLayer` method, which also allows for varying degrees of configuration.

On the server\-side the stand\-alone HTTP layer forms a [`BidiFlow<HttpResponse, SslTlsOutbound, SslTlsInbound, HttpRequest, NotUsed>`](https://doc.akka.io/japi/akka/2.10/akka/stream/javadsl/BidiFlow.html "akka.stream.javadsl.BidiFlow")[`BidiFlow[HttpResponse, SslTlsOutbound, SslTlsInbound, HttpRequest, NotUsed]`](https://doc.akka.io/api/akka/2.10/akka/stream/scaladsl/BidiFlow.html "akka.stream.scaladsl.BidiFlow"), that is a stage that “upgrades” a potentially encrypted raw connection to the HTTP level.

You create an instance of the layer by calling one of the two overloads of the `Http.get(system).serverLayer` method, which also allows for varying degrees of configuration. Note, that the returned instance is not reusable and can only be materialized once.

## Controlling server parallelism

Request handling can be parallelized on two axes, by handling several connections in parallel and by relying on HTTP pipelining to send several requests on one connection without waiting for a response first. In both cases the client controls the number of ongoing requests. To prevent being overloaded by too many requests, Akka HTTP can limit the number of requests it handles in parallel.

To limit the number of simultaneously open connections, use the `akka.http.server.max-connections` setting. This setting applies to all of `Http.bindAndHandle*` methods. If you use `Http.bind`, incoming connections are represented by a [`Source<IncomingConnection, ...>`](https://doc.akka.io/japi/akka/2.10/akka/stream/javadsl/Source.html "akka.stream.javadsl.Source")[`Source[IncomingConnection, ...]`](https://doc.akka.io/api/akka/2.10/akka/stream/scaladsl/Source.html "akka.stream.scaladsl.Source"). Use Akka Stream’s combinators to apply backpressure to control the flow of incoming connections, e.g. by using `throttle` or `mapAsync`.

HTTP pipelining is generally discouraged (and [disabled by most browsers](https://en.wikipedia.org/w/index.php?title=HTTP_pipelining&oldid=700966692#Implementation_in_web_browsers)) but is nevertheless fully supported in Akka HTTP. The limit is applied on two levels. First, there’s the `akka.http.server.pipelining-limit` config setting which prevents that more than the given number of outstanding requests is ever given to the user\-supplied handler\-flow. On the other hand, the handler flow itself can apply any kind of throttling itself. If you use the `Http.bindAndHandleAsync` entry\-point, you can specify the `parallelism` argument (which defaults to `1`, which means that pipelining is disabled) to control the number of concurrent requests per connection. If you use `Http.bindAndHandle` or `Http.bind`, the user\-supplied handler flow has full control over how many request it accepts simultaneously by applying backpressure. In this case, you can e.g. use Akka Stream’s `mapAsync` combinator with a given parallelism to limit the number of concurrently handled requests. Effectively, the more constraining one of these two measures, config setting and manual flow shaping, will determine how parallel requests on one connection are handled.

## Handling HTTP Server failures in the Low\-Level API

There are various situations when failure may occur while initialising or running an Akka HTTP server. Akka by default will log all these failures, however sometimes one may want to react to failures in addition to them just being logged, for example by shutting down the actor system, or notifying some external monitoring end\-point explicitly.

There are multiple things that can fail when creating and materializing an HTTP Server (similarly, the same applied to a plain streaming `Tcp()` server). The types of failures that can happen on different layers of the stack, starting from being unable to start the server, and ending with failing to unmarshal an HttpRequest, examples of failures include (from outer\-most, to inner\-most):

- Failure to `bind` to the specified address/port,
- Failure while accepting new `IncomingConnection`s, for example when the OS has run out of file descriptors or memory,
- Failure while handling a connection, for example if the incoming [`HttpRequest`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpRequest.html "akka.http.javadsl.model.HttpRequest")[`HttpRequest`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpRequest.html "akka.http.scaladsl.model.HttpRequest") is malformed.

This section describes how to handle each failure situation, and in which situations these failures may occur.

#### Bind failures

The first type of failure is when the server is unable to bind to the given port. For example when the port is already taken by another application, or if the port is privileged (i.e. only usable by `root`). In this case the “binding future” will fail immediately, and we can react to it by listening on the Future’sCompletionStage’s completion:

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/HttpServerExampleSpec.scala#L57-L77 "Go to snippet source")import akka.actor.ActorSystem
import akka.http.scaladsl.Http
import akka.http.scaladsl.Http.ServerBinding

import scala.concurrent.Future

implicit val system = ActorSystem()
// needed for the future foreach in the end
implicit val executionContext = system.dispatcher

// let's say the OS won't allow us to bind to 80.
val (host, port) = ("localhost", 80)
val serverSource = Http().newServerAt(host, port).connectionSource()

val bindingFuture: Future[ServerBinding] = serverSource
  .to(handleConnections) // Sink[Http.IncomingConnection, _]
  .run()

bindingFuture.failed.foreach { ex =>
  log.error(ex, "Failed to bind to {}:{}!", host, port)
}
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/HttpServerExampleDocTest.java#L62-L77 "Go to snippet source")ActorSystem system = ActorSystem.create();
Materializer materializer = SystemMaterializer.get(system).materializer();

Source<IncomingConnection, CompletionStage<ServerBinding>> serverSource =
  Http.get(system).newServerAt("localhost", 80).connectionSource();

CompletionStage<ServerBinding> serverBindingFuture =
  serverSource.to(Sink.foreach(connection -> {
      System.out.println("Accepted new connection from " + connection.remoteAddress());
      // ... and then actually handle the connection
    }
  )).run(materializer);

serverBindingFuture.whenCompleteAsync((binding, failure) -> {
  // possibly report the failure somewhere...
}, system.dispatcher());
```

Once the server has successfully bound to a port, the [`Source<IncomingConnection, ?>`](https://doc.akka.io/japi/akka/2.10/akka/stream/javadsl/Source.html "akka.stream.javadsl.Source")[`Source[IncomingConnection, _]`](https://doc.akka.io/api/akka/2.10/akka/stream/scaladsl/Source.html "akka.stream.scaladsl.Source") starts running and emitting new incoming connections. This source technically can signal a failure as well, however this should only happen in very dramatic situations such as running out of file descriptors or memory available to the system, such that it’s not able to accept a new incoming connection. Handling failures in Akka Streams is pretty straight forward, as failures are signaled through the stream starting from the stage which failed, all the way downstream to the final stages.

#### Connections Source failures

In the example below we add a custom [`GraphStage`](https://doc.akka.io/api/akka/2.10/akka/stream/stage/GraphStage.html "akka.stream.stage.GraphStage")[`GraphStage`](https://doc.akka.io/japi/akka/2.10/akka/stream/stage/GraphStage.html "akka.stream.stage.GraphStage") in order to react to the stream’s failure. See [Custom stream processing](https://doc.akka.io/libraries/akka-core/2.10/stream/stream-customize.html) for more on custom stages. We signal a `failureMonitor` actor with the cause why the stream is going down, and let the Actor handle the rest – maybe it’ll decide to restart the server or shutdown the ActorSystem, that however is not our concern anymore.

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/HttpServerExampleSpec.scala#L87-L109 "Go to snippet source")import akka.actor.ActorSystem
import akka.actor.ActorRef
import akka.http.scaladsl.Http
import akka.stream.scaladsl.Flow

implicit val system = ActorSystem()
implicit val executionContext = system.dispatcher

import Http._
val (host, port) = ("localhost", 8080)
val serverSource = Http().newServerAt(host, port).connectionSource()

val failureMonitor: ActorRef = system.actorOf(MyExampleMonitoringActor.props)

val reactToTopLevelFailures = Flow[IncomingConnection]
  .watchTermination()((_, termination) => termination.failed.foreach {
    cause => failureMonitor ! cause
  })

serverSource
  .via(reactToTopLevelFailures)
  .to(handleConnections) // Sink[Http.IncomingConnection, _]
  .run()
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/HttpServerExampleDocTest.java#L84-L107 "Go to snippet source")ActorSystem system = ActorSystem.create();
Materializer materializer = SystemMaterializer.get(system).materializer();

Source<IncomingConnection, CompletionStage<ServerBinding>> serverSource =
  Http.get(system).newServerAt("localhost", 8080).connectionSource();

Flow<IncomingConnection, IncomingConnection, NotUsed> failureDetection =
  Flow.of(IncomingConnection.class).watchTermination((notUsed, termination) -> {
    termination.whenComplete((done, cause) -> {
      if (cause != null) {
        // signal the failure to external monitoring service!
      }
    });
    return NotUsed.getInstance();
  });

CompletionStage<ServerBinding> serverBindingFuture =
  serverSource
    .via(failureDetection) // feed signals through our custom stage
    .to(Sink.foreach(connection -> {
      System.out.println("Accepted new connection from " + connection.remoteAddress());
      // ... and then actually handle the connection
    }))
    .run(materializer);
```

#### Connection failures

The third type of failure that can occur is when the connection has been properly established, however afterwards is terminated abruptly – for example by the client aborting the underlying TCP connection.

To handle this failure we can use the same pattern as in the previous snippet, however apply it to the connection’s Flow:

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/HttpServerExampleSpec.scala#L115-L143 "Go to snippet source")import akka.actor.ActorSystem
import akka.http.scaladsl.Http
import akka.http.scaladsl.model._
import akka.stream.scaladsl.Flow

implicit val system = ActorSystem()
implicit val executionContext = system.dispatcher

val (host, port) = ("localhost", 8080)
val serverSource = Http().newServerAt(host, port).connectionSource()

val reactToConnectionFailure = Flow[HttpRequest]
  .recover[HttpRequest] {
    case ex =>
      // handle the failure somehow
      throw ex
  }

val httpEcho = Flow[HttpRequest]
  .via(reactToConnectionFailure)
  .map { request =>
    // simple streaming (!) "echo" response:
    HttpResponse(entity = HttpEntity(ContentTypes.`text/plain(UTF-8)`, request.entity.dataBytes))
  }

serverSource
  .runForeach { con =>
    con.handleWith(httpEcho)
  }
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/HttpServerExampleDocTest.java#L114-L147 "Go to snippet source")ActorSystem system = ActorSystem.create();
Materializer materializer = SystemMaterializer.get(system).materializer();

Source<IncomingConnection, CompletionStage<ServerBinding>> serverSource =
  Http.get(system).newServerAt("localhost", 8080).connectionSource();

Flow<HttpRequest, HttpRequest, NotUsed> failureDetection =
  Flow.of(HttpRequest.class)
    .watchTermination((notUsed, termination) -> {
      termination.whenComplete((done, cause) -> {
        if (cause != null) {
          // signal the failure to external monitoring service!
        }
      });
      return NotUsed.getInstance();
    });

Flow<HttpRequest, HttpResponse, NotUsed> httpEcho =
  Flow.of(HttpRequest.class)
    .via(failureDetection)
    .map(request -> {
      Source<ByteString, Object> bytes = request.entity().getDataBytes();
      HttpEntity.Chunked entity = HttpEntities.create(ContentTypes.TEXT_PLAIN_UTF8, bytes);

      return HttpResponse.create()
        .withEntity(entity);
    });

CompletionStage<ServerBinding> serverBindingFuture =
  serverSource.to(Sink.foreach(conn -> {
      System.out.println("Accepted new connection from " + conn.remoteAddress());
      conn.handleWith(httpEcho, materializer);
    }
  )).run(materializer);
```

Note that this is when the TCP connection is closed correctly, if the client just goes away, for example because of a network failure, it will not be seen as this kind of stream failure. It will instead be detected through the [idle timeout](../common/timeouts.html#timeouts)).

These failures can be described more or less infrastructure related, they are failing bindings or connections. Most of the time you won’t need to dive into those very deeply, as Akka will simply log errors of this kind anyway, which is a reasonable default for such problems.

In order to learn more about handling exceptions in the actual routing layer, which is where your application code comes into the picture, refer to [Exception Handling](../routing-dsl/exception-handling.html) which focuses explicitly on explaining how exceptions thrown in routes can be handled and transformed into [`HttpResponse`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpResponse.html "akka.http.javadsl.model.HttpResponse")[`HttpResponse`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpResponse.html "akka.http.scaladsl.model.HttpResponse") s with appropriate error codes and human\-readable failure descriptions.

## Code Examples

### Example 1: Starting and Stopping

```scala
import akka.actor.ActorSystem
import akka.http.scaladsl.Http
import akka.stream.scaladsl._

implicit val system = ActorSystem()
implicit val executionContext = system.dispatcher

val serverSource: Source[Http.IncomingConnection, Future[Http.ServerBinding]] =
  Http().newServerAt("localhost", 8080).connectionSource()
val bindingFuture: Future[Http.ServerBinding] =
  serverSource.to(Sink.foreach { connection => // foreach materializes the source
    println("Accepted new connection from " + connection.remoteAddress)
    // ... and then actually handle the connection
  }).run()
```

### Example 2: Starting and Stopping

```java
ActorSystem system = ActorSystem.create();
Materializer materializer = SystemMaterializer.get(system).materializer();

Source<IncomingConnection, CompletionStage<ServerBinding>> serverSource =
  Http.get(system).newServerAt("localhost", 8080).connectionSource();

CompletionStage<ServerBinding> serverBindingFuture =
  serverSource.to(Sink.foreach(connection -> {
      System.out.println("Accepted new connection from " + connection.remoteAddress());
      // ... and then actually handle the connection
    }
  )).run(materializer);
```

### Example 3: Request-Response Cycle

```scala
import akka.actor.ActorSystem
import akka.http.scaladsl.Http
import akka.http.scaladsl.model.HttpMethods._
import akka.http.scaladsl.model._
import akka.stream.scaladsl.Sink

implicit val system = ActorSystem()
implicit val executionContext = system.dispatcher

val serverSource = Http().newServerAt("localhost", 8080).connectionSource()

val requestHandler: HttpRequest => HttpResponse = {
  case HttpRequest(GET, Uri.Path("/"), _, _, _) =>
    HttpResponse(entity = HttpEntity(
      ContentTypes.`text/html(UTF-8)`,
      "<html><body>Hello world!</body></html>"))

  case HttpRequest(GET, Uri.Path("/ping"), _, _, _) =>
    HttpResponse(entity = "PONG!")

  case HttpRequest(GET, Uri.Path("/crash"), _, _, _) =>
    sys.error("BOOM!")

  case r: HttpRequest =>
    r.discardEntityBytes() // important to drain incoming HTTP Entity stream
    HttpResponse(404, entity = "Unknown resource!")
}

val bindingFuture: Future[Http.ServerBinding] =
  serverSource.to(Sink.foreach { connection =>
    println("Accepted new connection from " + connection.remoteAddress)

    connection handleWithSyncHandler requestHandler
    // this is equivalent to
    // connection handleWith { Flow[HttpRequest] map requestHandler }
  }).run()
```

### Example 4: Request-Response Cycle

```java
ActorSystem system = ActorSystem.create();
  final Materializer materializer = SystemMaterializer.get(system).materializer();

  Source<IncomingConnection, CompletionStage<ServerBinding>> serverSource =
    Http.get(system).newServerAt("localhost", 8080).connectionSource();

  final Function<HttpRequest, HttpResponse> requestHandler =
    new Function<HttpRequest, HttpResponse>() {
      private final HttpResponse NOT_FOUND =
        HttpResponse.create()
          .withStatus(404)
          .withEntity("Unknown resource!");


      @Override
      public HttpResponse apply(HttpRequest request) throws Exception {
        Uri uri = request.getUri();
        if (request.method() == HttpMethods.GET) {
          if (uri.path().equals("/")) {
            return
              HttpResponse.create()
                .withEntity(ContentTypes.TEXT_HTML_UTF8,
                  "<html><body>Hello world!</body></html>");
          } else if (uri.path().equals("/hello")) {
            String name = uri.query().get("name").orElse("Mister X");

            return
              HttpResponse.create()
                .withEntity("Hello " + name + "!");
          } else if (uri.path().equals("/ping")) {
            return HttpResponse.create().withEntity("PONG!");
          } else {
            return NOT_FOUND;
          }
        } else {
          return NOT_FOUND;
        }
      }
    };

  CompletionStage<ServerBinding> serverBindingFuture =
    serverSource.to(Sink.foreach(connection -> {
      System.out.println("Accepted new connection from " + connection.remoteAddress());

      connection.handleWithSyncHandler(requestHandler, materializer);
      // this is equivalent to
      //connection.handleWith(Flow.of(HttpRequest.class).map(requestHandler), materializer);
    })).run(materializer);
```

### Example 5: Stand-Alone HTTP Layer Usage

```scala
/**
 * The type of the server-side HTTP layer as a stand-alone BidiFlow
 * that can be put atop the TCP layer to form an HTTP server.
 *
 * {{{
 *                +------+
 * HttpResponse ~>|      |~> SslTlsOutbound
 *                | bidi |
 * HttpRequest  <~|      |<~ SslTlsInbound
 *                +------+
 * }}}
 */
type ServerLayer = BidiFlow[HttpResponse, SslTlsOutbound, SslTlsInbound, HttpRequest, NotUsed]
```

### Example 6: Bind failures

```scala
import akka.actor.ActorSystem
import akka.http.scaladsl.Http
import akka.http.scaladsl.Http.ServerBinding

import scala.concurrent.Future

implicit val system = ActorSystem()
// needed for the future foreach in the end
implicit val executionContext = system.dispatcher

// let's say the OS won't allow us to bind to 80.
val (host, port) = ("localhost", 80)
val serverSource = Http().newServerAt(host, port).connectionSource()

val bindingFuture: Future[ServerBinding] = serverSource
  .to(handleConnections) // Sink[Http.IncomingConnection, _]
  .run()

bindingFuture.failed.foreach { ex =>
  log.error(ex, "Failed to bind to {}:{}!", host, port)
}
```

### Example 7: Bind failures

```java
ActorSystem system = ActorSystem.create();
Materializer materializer = SystemMaterializer.get(system).materializer();

Source<IncomingConnection, CompletionStage<ServerBinding>> serverSource =
  Http.get(system).newServerAt("localhost", 80).connectionSource();

CompletionStage<ServerBinding> serverBindingFuture =
  serverSource.to(Sink.foreach(connection -> {
      System.out.println("Accepted new connection from " + connection.remoteAddress());
      // ... and then actually handle the connection
    }
  )).run(materializer);

serverBindingFuture.whenCompleteAsync((binding, failure) -> {
  // possibly report the failure somewhere...
}, system.dispatcher());
```

### Example 8: Connections Source failures

```scala
import akka.actor.ActorSystem
import akka.actor.ActorRef
import akka.http.scaladsl.Http
import akka.stream.scaladsl.Flow

implicit val system = ActorSystem()
implicit val executionContext = system.dispatcher

import Http._
val (host, port) = ("localhost", 8080)
val serverSource = Http().newServerAt(host, port).connectionSource()

val failureMonitor: ActorRef = system.actorOf(MyExampleMonitoringActor.props)

val reactToTopLevelFailures = Flow[IncomingConnection]
  .watchTermination()((_, termination) => termination.failed.foreach {
    cause => failureMonitor ! cause
  })

serverSource
  .via(reactToTopLevelFailures)
  .to(handleConnections) // Sink[Http.IncomingConnection, _]
  .run()
```

### Example 9: Connections Source failures

```java
ActorSystem system = ActorSystem.create();
Materializer materializer = SystemMaterializer.get(system).materializer();

Source<IncomingConnection, CompletionStage<ServerBinding>> serverSource =
  Http.get(system).newServerAt("localhost", 8080).connectionSource();

Flow<IncomingConnection, IncomingConnection, NotUsed> failureDetection =
  Flow.of(IncomingConnection.class).watchTermination((notUsed, termination) -> {
    termination.whenComplete((done, cause) -> {
      if (cause != null) {
        // signal the failure to external monitoring service!
      }
    });
    return NotUsed.getInstance();
  });

CompletionStage<ServerBinding> serverBindingFuture =
  serverSource
    .via(failureDetection) // feed signals through our custom stage
    .to(Sink.foreach(connection -> {
      System.out.println("Accepted new connection from " + connection.remoteAddress());
      // ... and then actually handle the connection
    }))
    .run(materializer);
```

### Example 10: Connection failures

```scala
import akka.actor.ActorSystem
import akka.http.scaladsl.Http
import akka.http.scaladsl.model._
import akka.stream.scaladsl.Flow

implicit val system = ActorSystem()
implicit val executionContext = system.dispatcher

val (host, port) = ("localhost", 8080)
val serverSource = Http().newServerAt(host, port).connectionSource()

val reactToConnectionFailure = Flow[HttpRequest]
  .recover[HttpRequest] {
    case ex =>
      // handle the failure somehow
      throw ex
  }

val httpEcho = Flow[HttpRequest]
  .via(reactToConnectionFailure)
  .map { request =>
    // simple streaming (!) "echo" response:
    HttpResponse(entity = HttpEntity(ContentTypes.`text/plain(UTF-8)`, request.entity.dataBytes))
  }

serverSource
  .runForeach { con =>
    con.handleWith(httpEcho)
  }
```

### Example 11: Connection failures

```java
ActorSystem system = ActorSystem.create();
Materializer materializer = SystemMaterializer.get(system).materializer();

Source<IncomingConnection, CompletionStage<ServerBinding>> serverSource =
  Http.get(system).newServerAt("localhost", 8080).connectionSource();

Flow<HttpRequest, HttpRequest, NotUsed> failureDetection =
  Flow.of(HttpRequest.class)
    .watchTermination((notUsed, termination) -> {
      termination.whenComplete((done, cause) -> {
        if (cause != null) {
          // signal the failure to external monitoring service!
        }
      });
      return NotUsed.getInstance();
    });

Flow<HttpRequest, HttpResponse, NotUsed> httpEcho =
  Flow.of(HttpRequest.class)
    .via(failureDetection)
    .map(request -> {
      Source<ByteString, Object> bytes = request.entity().getDataBytes();
      HttpEntity.Chunked entity = HttpEntities.create(ContentTypes.TEXT_PLAIN_UTF8, bytes);

      return HttpResponse.create()
        .withEntity(entity);
    });

CompletionStage<ServerBinding> serverBindingFuture =
  serverSource.to(Sink.foreach(conn -> {
      System.out.println("Accepted new connection from " + conn.remoteAddress());
      conn.handleWith(httpEcho, materializer);
    }
  )).run(materializer);
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/Http$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpEntity.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpRequest.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpResponse.html
- https://doc.akka.io/api/akka/2.10/akka/stream/scaladsl/BidiFlow.html
- https://doc.akka.io/api/akka/2.10/akka/stream/scaladsl/Flow.html
- https://doc.akka.io/api/akka/2.10/akka/stream/scaladsl/Sink.html
- https://doc.akka.io/api/akka/2.10/akka/stream/scaladsl/Source.html
- https://doc.akka.io/api/akka/2.10/akka/stream/stage/GraphStage.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/Http.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpEntity.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpRequest.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpResponse.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/javadsl/BidiFlow.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/javadsl/Flow.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/javadsl/Sink.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/javadsl/Source.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/stage/GraphStage.html
- https://doc.akka.io/libraries/akka-core/2.10/stream/index.html
- https://doc.akka.io/libraries/akka-core/2.10/stream/stream-customize.html
- https://doc.akka.io/libraries/akka-core/2.10/stream/stream-io.html
- https://doc.akka.io/libraries/akka-http/current/common/http-model.html
- https://doc.akka.io/libraries/akka-http/current/common/marshalling.html
- https://doc.akka.io/libraries/akka-http/current/common/timeouts.html
- https://doc.akka.io/libraries/akka-http/current/common/unmarshalling.html
- https://doc.akka.io/libraries/akka-http/current/implications-of-streaming-http-entity.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/exception-handling.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/index.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/overview.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/testkit.html
- https://doc.akka.io/libraries/akka-http/current/server-side/server-https-support.html
- https://doc.akka.io/libraries/akka-http/current/server-side/websocket-support.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/server-side/low-level-api.html](https://doc.akka.io/libraries/akka-http/current/server-side/low-level-api.html)*