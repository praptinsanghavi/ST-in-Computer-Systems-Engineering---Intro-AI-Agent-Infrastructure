---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:04:09Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/client-side/http2.html
title: Client-Side HTTP/2 (Preview) • Akka HTTP
---

# Client-Side HTTP/2 (Preview) • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Client\-Side HTTP/2 (Preview)

Warning
Client\-Side HTTP/2 support in akka\-http is currently available as a preview. This means it is ready to be evaluated, but the APIs and behavior are likely to change.

Note
It is recommended to first read the [Implications of the streaming nature of Request/Response Entities](../implications-of-streaming-http-entity.html) and [Host\-Level Client\-Side API](host-level.html) sections, as they explain the underlying full\-stack streaming concepts, tuning the client settings and HTTPS context and how to handle the Request\-Response Cycle, which may be unexpected when coming from a background with non\-“streaming first” HTTP Clients.

## Create the client

There are three mechanisms for a client to establish an HTTP/2 connection. Akka HTTP supports:

- HTTP/2 over TLS
- HTTP/2 over a plain TCP connection (“h2c with prior knowledge”)

Akka HTTP doesn’t support:

- HTTP `Upgrade` mechanism

### HTTP/2 over TLS

To create a client, use the `Http()` fluent API to connect and use the `http2()` creator:

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/Http2Spec.scala#L20-L58 "Go to snippet source")import akka.http.scaladsl.Http
Http().connectionTo("localhost").toPort(8443).http2()
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/Http2Test.java#L27-L57 "Go to snippet source")import akka.http.javadsl.Http;

Http.get(system)
        .connectionTo("127.0.0.1")
        .toPort(8443)
        .http2();
```

HTTP/2 over TLS needs [Application\-Layer Protocol Negotiation (ALPN)](https://en.wikipedia.org/wiki/Application-Layer_Protocol_Negotiation) to negotiate whether both client and server support HTTP/2\. The JVM provides ALPN support starting from JDK 8u252\. Make sure to use at least that version.

Akka HTTP does not currently support protocol negotiation to fall back to HTTP/1\.1 for this API. When the server does not support HTTP/2, the stream will fail.

### h2c with prior knowledge

The other option is to connect and start communicating in HTTP/2 immediately. You must know beforehand the target server supports HTTP/2 over a plain TCP connection. For this reason this approach is known as h2c with [Prior Knowledge](https://httpwg.org/specs/rfc7540.html#known-http) of HTTP/2 support.

To create a client, use the `Http()` fluent API to connect and use the `http2WithPriorKnowledge()` creator:

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/Http2Spec.scala#L20-L61 "Go to snippet source")import akka.http.scaladsl.Http
Http().connectionTo("localhost").toPort(8080).http2WithPriorKnowledge()
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/Http2Test.java#L27-L64 "Go to snippet source")import akka.http.javadsl.Http;

Http.get(system)
        .connectionTo("127.0.0.1")
        .toPort(8080)
        .http2WithPriorKnowledge();
```

### HTTP Upgrade mechanism

The Akka HTTP client doesn’t support HTTP/1 to HTTP/2 negotiation over plaintext using the `Upgrade` mechanism.

## Request\-response ordering

For HTTP/2 connections the responses are not guaranteed to arrive in the same order that the requests were emitted to the server, for example a request with a quickly available response may outrun a previous request that the server is slower to respond to. For HTTP/2 it is therefore important to have a way to correlate the response with the request it was made for. This can be achieved through a [`RequestResponseAssociation`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/RequestResponseAssociation.html "akka.http.javadsl.model.RequestResponseAssociation")[`RequestResponseAssociation`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/RequestResponseAssociation.html "akka.http.scaladsl.model.RequestResponseAssociation") set on the request, Akka HTTP will pass such association objects on to the response.

In this sample the built\-in `akka.http.scaladsl.model.ResponsePromise``akka.http.javadsl.model.ResponseFuture` `RequestResponseAssociation` is used to return a `Future``CompletionStage` for the response:

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/Http2ClientApp.scala#L41-L93 "Go to snippet source")val dispatch = singleRequest(Http().connectionTo("doc.akka.io").http2())

dispatch(
  HttpRequest(
    uri = "https://doc.akka.io/api/akka/current/akka/actor/typed/scaladsl/index.html",
    headers = headers.`Accept-Encoding`(HttpEncodings.gzip) :: Nil)
).onComplete { res =>
    println(s"[1] Got index.html: $res")
    res.get.entity.dataBytes.runWith(Sink.ignore).onComplete(res => println(s"Finished reading [1] $res"))
  }

def singleRequest(connection: Flow[HttpRequest, HttpResponse, Any], bufferSize: Int = 100): HttpRequest => Future[HttpResponse] = {
  val queue =
    Source.queue(bufferSize, OverflowStrategy.dropNew)
      .via(connection)
      .to(Sink.foreach { response =>
        // complete the response promise with the response when it arrives
        val responseAssociation = response.attribute(ResponsePromise.Key).get
        responseAssociation.promise.trySuccess(response)
      })
      .run()

  req => {
    // create a promise of the response for each request and set it as an attribute on the request
    val p = Promise[HttpResponse]()
    queue.offer(req.addAttribute(ResponsePromise.Key, ResponsePromise(p)))
      // return the future response
      .flatMap(_ => p.future)
  }
}
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/Http2ClientApp.java#L49-L102 "Go to snippet source")  Function<HttpRequest, CompletionStage<HttpResponse>> dispatch =
      singleRequest(system, Http.get(system).connectionTo("doc.akka.io").http2());

  dispatch.apply(
      HttpRequest.create(
          "https://doc.akka.io/api/akka/current/akka/actor/typed/scaladsl/index.html").withHeaders(
          Arrays.asList(AcceptEncoding.create(HttpEncodings.GZIP))
      )
  ).thenAccept(res -> {
    System.out.println("[1] Got index.html: " + res);
    res.entity().getDataBytes().runWith(Sink.ignore(), mat)
        .thenAccept(consumedRes -> System.out.println("Finished reading [1] " + consumedRes));
  });

private static Function<HttpRequest, CompletionStage<HttpResponse>> singleRequest(ActorSystem system, Flow<HttpRequest, HttpResponse, ?> connection) {
  SourceQueueWithComplete<HttpRequest> queue =
      Source.<HttpRequest>queue(100, OverflowStrategy.dropNew())
          .via(connection)
          .to(Sink.foreach(res -> {
            try {
              // complete the future with the response when it arrives
              ResponseFuture responseFuture = res.getAttribute(ResponseFuture.KEY()).get();
              responseFuture.future().complete(res);
            } catch (Exception ex) {
              ex.printStackTrace();
            }
          }))
      .run(SystemMaterializer.get(system).materializer());

  return (HttpRequest req) -> {
    // create a future of the response for each request and set it as an attribute on the request
    CompletableFuture<HttpResponse> future = new CompletableFuture<>();
    ResponseFuture attribute = new ResponseFuture(future);
    return queue.offer(req.addAttribute(ResponseFuture.KEY(), attribute))
        // return the future response
        .thenCompose(__ -> attribute.future());
  };
}
```

## Code Examples

### Example 1: HTTP/2 over TLS

```scala
import akka.http.scaladsl.Http
Http().connectionTo("localhost").toPort(8443).http2()
```

### Example 2: HTTP/2 over TLS

```java
import akka.http.javadsl.Http;

Http.get(system)
        .connectionTo("127.0.0.1")
        .toPort(8443)
        .http2();
```

### Example 3: h2c with prior knowledge

```scala
import akka.http.scaladsl.Http
Http().connectionTo("localhost").toPort(8080).http2WithPriorKnowledge()
```

### Example 4: h2c with prior knowledge

```java
import akka.http.javadsl.Http;

Http.get(system)
        .connectionTo("127.0.0.1")
        .toPort(8080)
        .http2WithPriorKnowledge();
```

### Example 5: Request-response ordering

```scala
val dispatch = singleRequest(Http().connectionTo("doc.akka.io").http2())

dispatch(
  HttpRequest(
    uri = "https://doc.akka.io/api/akka/current/akka/actor/typed/scaladsl/index.html",
    headers = headers.`Accept-Encoding`(HttpEncodings.gzip) :: Nil)
).onComplete { res =>
    println(s"[1] Got index.html: $res")
    res.get.entity.dataBytes.runWith(Sink.ignore).onComplete(res => println(s"Finished reading [1] $res"))
  }

def singleRequest(connection: Flow[HttpRequest, HttpResponse, Any], bufferSize: Int = 100): HttpRequest => Future[HttpResponse] = {
  val queue =
    Source.queue(bufferSize, OverflowStrategy.dropNew)
      .via(connection)
      .to(Sink.foreach { response =>
        // complete the response promise with the response when it arrives
        val responseAssociation = response.attribute(ResponsePromise.Key).get
        responseAssociation.promise.trySuccess(response)
      })
      .run()

  req => {
    // create a promise of the response for each request and set it as an attribute on the request
    val p = Promise[HttpResponse]()
    queue.offer(req.addAttribute(ResponsePromise.Key, ResponsePromise(p)))
      // return the future response
      .flatMap(_ => p.future)
  }
}
```

### Example 6: Request-response ordering

```java
Function<HttpRequest, CompletionStage<HttpResponse>> dispatch =
      singleRequest(system, Http.get(system).connectionTo("doc.akka.io").http2());

  dispatch.apply(
      HttpRequest.create(
          "https://doc.akka.io/api/akka/current/akka/actor/typed/scaladsl/index.html").withHeaders(
          Arrays.asList(AcceptEncoding.create(HttpEncodings.GZIP))
      )
  ).thenAccept(res -> {
    System.out.println("[1] Got index.html: " + res);
    res.entity().getDataBytes().runWith(Sink.ignore(), mat)
        .thenAccept(consumedRes -> System.out.println("Finished reading [1] " + consumedRes));
  });

private static Function<HttpRequest, CompletionStage<HttpResponse>> singleRequest(ActorSystem system, Flow<HttpRequest, HttpResponse, ?> connection) {
  SourceQueueWithComplete<HttpRequest> queue =
      Source.<HttpRequest>queue(100, OverflowStrategy.dropNew())
          .via(connection)
          .to(Sink.foreach(res -> {
            try {
              // complete the future with the response when it arrives
              ResponseFuture responseFuture = res.getAttribute(ResponseFuture.KEY()).get();
              responseFuture.future().complete(res);
            } catch (Exception ex) {
              ex.printStackTrace();
            }
          }))
      .run(SystemMaterializer.get(system).materializer());

  return (HttpRequest req) -> {
    // create a future of the response for each request and set it as an attribute on the request
    CompletableFuture<HttpResponse> future = new CompletableFuture<>();
    ResponseFuture attribute = new ResponseFuture(future);
    return queue.offer(req.addAttribute(ResponseFuture.KEY(), attribute))
        // return the future response
        .thenCompose(__ -> attribute.future());
  };
}
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/RequestResponseAssociation.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/RequestResponseAssociation.html
- https://doc.akka.io/libraries/akka-http/current/client-side/host-level.html
- https://doc.akka.io/libraries/akka-http/current/client-side/websocket-support.html
- https://doc.akka.io/libraries/akka-http/current/extensions.html
- https://doc.akka.io/libraries/akka-http/current/implications-of-streaming-http-entity.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/client-side/http2.html](https://doc.akka.io/libraries/akka-http/current/client-side/http2.html)*