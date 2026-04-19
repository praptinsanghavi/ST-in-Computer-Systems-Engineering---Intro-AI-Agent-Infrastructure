---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:17:16Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/client-side/request-level.html
title: Request-Level Client-Side API • Akka HTTP
---

# Request-Level Client-Side API • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Request\-Level Client\-Side API

The request\-level API is the recommended and most convenient way of using Akka HTTP’s client\-side functionality. It internally builds upon the [Host\-Level Client\-Side API](host-level.html) to provide you with a simple and easy\-to\-use way of retrieving HTTP responses from remote servers. Depending on your preference you can pick the [Future\-based variant](#future-based-variant) or [Flow\-based variant](#flow-based-variant).

Note
It is recommended to first read the [Implications of the streaming nature of Request/Response Entities](../implications-of-streaming-http-entity.html) section, as it explains the underlying full\-stack streaming concepts, which may be unexpected when coming from a background with non\-“streaming first” HTTP Clients.

Note
The request\-level API is implemented on top of a connection pool that is shared inside the actor system. A consequence of using a pool is that long\-running requests block a connection while running and starve other requests. Make sure not to use the request\-level API for long\-running requests like long\-polling GET requests. Use the [Connection\-Level Client\-Side API](connection-level.html) or an extra pool just for the long\-running connection instead.

## Future\-Based Variant

Most often, your HTTP client needs are very basic. You need the HTTP response for a certain request and don’t want to bother with setting up a full\-blown streaming infrastructure.

For these cases Akka HTTP offers the `Http().singleRequest(...)``Http.get(system).singleRequest(...)` method, which turns an [`HttpRequest`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpRequest.html "akka.http.javadsl.model.HttpRequest")[`HttpRequest`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpRequest.html "akka.http.scaladsl.model.HttpRequest") instance into `Future[HttpResponse]``CompletionStage<HttpResponse>`. Internally the request is dispatched across the (cached) host connection pool for the request’s effective URI.

The request must have either an absolute URI or a valid `Host` header, otherwise the returned future will be completed with an error.

### Example

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/HttpClientSingleRequest.scala "Go to snippet source")/*
 * Copyright (C) 2020-2025 Lightbend Inc. <https://akka.io>
 */

package docs.http.scaladsl

import akka.actor.typed.ActorSystem
import akka.actor.typed.scaladsl.Behaviors
import akka.http.scaladsl.Http
import akka.http.scaladsl.model._

import scala.concurrent.Future
import scala.util.{ Failure, Success }

object HttpClientSingleRequest {
  def main(args: Array[String]): Unit = {
    implicit val system = ActorSystem(Behaviors.empty, "SingleRequest")
    // needed for the future flatMap/onComplete in the end
    implicit val executionContext = system.executionContext

    val responseFuture: Future[HttpResponse] = Http().singleRequest(HttpRequest(uri = "http://akka.io"))

    responseFuture
      .onComplete {
        case Success(res) => println(res)
        case Failure(_)   => sys.error("something wrong")
      }
  }
}
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/HttpClientExampleDocTest.java#L212-L216 "Go to snippet source")final ActorSystem system = ActorSystem.create();

final CompletionStage<HttpResponse> responseFuture =
  Http.get(system)
      .singleRequest(HttpRequest.create("http://akka.io"));
```

### Using the Future\-Based API in Actors

When using the `Future``CompletionStage` based API from inside a classic Akka [`Actor`](https://doc.akka.io/api/akka/2.10/akka/actor/Actor.html "akka.actor.Actor")[`Actor`](https://doc.akka.io/japi/akka/2.10/akka/actor/Actor.html "akka.actor.Actor"), all the usual caveats apply to how one should deal with the futures completion. For example, you should not access the actor’s state from within the `Future``CompletionStage`’s callbacks (such as `map`, `onComplete`, …) and, instead, you should use the `pipeTo``pipe` pattern to pipe the result back to the actor as a message:

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/HttpClientExampleSpec.scala#L322-L351 "Go to snippet source")import akka.actor.{ Actor, ActorLogging, ActorSystem }
import akka.http.scaladsl.Http
import akka.http.scaladsl.model._
import akka.util.ByteString

class Myself extends Actor
  with ActorLogging {

  import akka.pattern.pipe
  import context.dispatcher

  implicit val system: ActorSystem = context.system
  val http = Http(system)

  override def preStart() = {
    http.singleRequest(HttpRequest(uri = "http://akka.io"))
      .pipeTo(self)
  }

  def receive = {
    case HttpResponse(StatusCodes.OK, headers, entity, _) =>
      entity.dataBytes.runFold(ByteString(""))(_ ++ _).foreach { body =>
        log.info("Got response, body: " + body.utf8String)
      }
    case resp @ HttpResponse(code, _, _, _) =>
      log.info("Request failed, response code: " + code)
      resp.discardEntityBytes()
  }

}
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/HttpClientExampleDocTest.java#L40-L238 "Go to snippet source")import akka.actor.AbstractActor;
import akka.http.javadsl.model.HttpRequest;
import akka.http.javadsl.model.HttpResponse;
import static akka.pattern.Patterns.pipe;

class SingleRequestInActorExample extends AbstractActor {
  final Http http = Http.get(context().system());
  final ExecutionContextExecutor dispatcher = context().dispatcher();

  @Override
  public Receive createReceive() {
    return receiveBuilder()
      .match(String.class, url -> pipe(fetch(url), dispatcher).to(self()))
      .build();
  }

  CompletionStage<HttpResponse> fetch(String url) {
    return http.singleRequest(HttpRequest.create(url));
  }
}
```

Warning
Always make sure you consume the response entity streams (of type [`Source<ByteString,Unit>`](https://doc.akka.io/japi/akka/2.10/akka/stream/javadsl/Source.html "akka.stream.javadsl.Source")[`Source[ByteString,Unit]`](https://doc.akka.io/api/akka/2.10/akka/stream/scaladsl/Source.html "akka.stream.scaladsl.Source")[`Source<ByteString, Object>`](https://doc.akka.io/japi/akka/2.10/akka/stream/javadsl/Source.html "akka.stream.javadsl.Source")[`Source[ByteString, Object]`](https://doc.akka.io/api/akka/2.10/akka/stream/scaladsl/Source.html "akka.stream.scaladsl.Source")). Connect the response entity `Source` to a [`Sink`](https://doc.akka.io/japi/akka/2.10/akka/stream/javadsl/Sink.html "akka.stream.javadsl.Sink")[`Sink`](https://doc.akka.io/api/akka/2.10/akka/stream/scaladsl/Sink.html "akka.stream.scaladsl.Sink"), or call `response.discardEntityBytes()``response.discardEntityBytes(Materializer)` if you don’t care about the response entity. 

Read the [Implications of the streaming nature of Request/Response Entities](../implications-of-streaming-http-entity.html) section for more details.

If the application doesn’t subscribe to the response entity within `akka.http.host-connection-pool.response-entity-subscription-timeout`, the stream will fail with a `TimeoutException: Response entity was not subscribed after ...`.

## Flow\-Based Variant

The Flow\-based variant of the request\-level client\-side API is presented by the `Http().superPool(...)``Http.get(system).superPool(...)` method. It creates a new “super connection pool flow”, which routes incoming requests to a (cached) host connection pool depending on their respective effective URIs.

The [`Flow`](https://doc.akka.io/japi/akka/2.10/akka/stream/javadsl/Flow.html "akka.stream.javadsl.Flow")[`Flow`](https://doc.akka.io/api/akka/2.10/akka/stream/scaladsl/Flow.html "akka.stream.scaladsl.Flow") returned by `Http().superPool(...)``Http.get(system).superPool(...)` is very similar to the one from the [Host\-Level Client\-Side API](host-level.html), so the section on [Using a Host Connection Pool](host-level.html#using-a-host-connection-pool) also applies here.

However, there is one notable difference between a “host connection pool client flow” for the Host\-Level API and a “super\-pool flow” from the Request\-Level API:

- In a “host connection pool client flow” the flow has an implicit target host context. Therefore, the requests it takes don’t need to have absolute URIs or a valid `Host` header because the host connection pool will automatically add a `Host` header if required.

For a “super\-pool flow” in the Request\-Level API this is not the case. All requests to a super\-pool must either have an absolute URI or a valid `Host` header, because otherwise it’d be impossible to find out which target endpoint to direct the request to.

## Collecting headers from a server response

Sometimes we would like to get only headers of specific type which are sent from a server. In order to collect headers in a type safe way Akka HTTP API provides a type for each HTTP header. Here is an example for getting all cookies set by a server (`Set-Cookie` header):

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/HttpClientCollectingHeaders.scala "Go to snippet source")/*
 * Copyright (C) 2020-2025 Lightbend Inc. <https://akka.io>
 */

package docs.http.scaladsl

import akka.actor.ActorSystem
import akka.http.scaladsl.Http
import akka.http.scaladsl.model.headers.`Set-Cookie`
import akka.http.scaladsl.model._

import scala.concurrent.ExecutionContextExecutor
import scala.concurrent.Future

class HttpClientCollectingHeaders {
  def main(args: Array[String]): Unit = {
    implicit val system: ActorSystem = ActorSystem()
    implicit val executionContext: ExecutionContextExecutor = system.dispatcher

    val responseFuture: Future[HttpResponse] = Http().singleRequest(HttpRequest(uri = "http://akka.io"))

    responseFuture.map {
      case response @ HttpResponse(StatusCodes.OK, _, _, _) =>
        val setCookies = response.headers[`Set-Cookie`]
        println(s"Cookies set by a server: $setCookies")
        response.discardEntityBytes()
      case _ => sys.error("something wrong")
    }
  }
}
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/HttpClientExampleDocTest.java#L297-L302 "Go to snippet source")final HttpResponse response = responseFromSomewhere();

final Iterable<SetCookie> setCookies = response.getHeaders(SetCookie.class);

System.out.println("Cookies set by a server: " + setCookies);
response.discardEntityBytes(system);
```

## Code Examples

### Example 1: Example

```scala
/*
 * Copyright (C) 2020-2025 Lightbend Inc. <https://akka.io>
 */

package docs.http.scaladsl

import akka.actor.typed.ActorSystem
import akka.actor.typed.scaladsl.Behaviors
import akka.http.scaladsl.Http
import akka.http.scaladsl.model._

import scala.concurrent.Future
import scala.util.{ Failure, Success }

object HttpClientSingleRequest {
  def main(args: Array[String]): Unit = {
    implicit val system = ActorSystem(Behaviors.empty, "SingleRequest")
    // needed for the future flatMap/onComplete in the end
    implicit val executionContext = system.executionContext

    val responseFuture: Future[HttpResponse] = Http().singleRequest(HttpRequest(uri = "http://akka.io"))

    responseFuture
      .onComplete {
        case Success(res) => println(res)
        case Failure(_)   => sys.error("something wrong")
      }
  }
}
```

### Example 2: Example

```java
final ActorSystem system = ActorSystem.create();

final CompletionStage<HttpResponse> responseFuture =
  Http.get(system)
      .singleRequest(HttpRequest.create("http://akka.io"));
```

### Example 3: Using the Future-Based API in Actors

```scala
import akka.actor.{ Actor, ActorLogging, ActorSystem }
import akka.http.scaladsl.Http
import akka.http.scaladsl.model._
import akka.util.ByteString

class Myself extends Actor
  with ActorLogging {

  import akka.pattern.pipe
  import context.dispatcher

  implicit val system: ActorSystem = context.system
  val http = Http(system)

  override def preStart() = {
    http.singleRequest(HttpRequest(uri = "http://akka.io"))
      .pipeTo(self)
  }

  def receive = {
    case HttpResponse(StatusCodes.OK, headers, entity, _) =>
      entity.dataBytes.runFold(ByteString(""))(_ ++ _).foreach { body =>
        log.info("Got response, body: " + body.utf8String)
      }
    case resp @ HttpResponse(code, _, _, _) =>
      log.info("Request failed, response code: " + code)
      resp.discardEntityBytes()
  }

}
```

### Example 4: Using the Future-Based API in Actors

```java
import akka.actor.AbstractActor;
import akka.http.javadsl.model.HttpRequest;
import akka.http.javadsl.model.HttpResponse;
import static akka.pattern.Patterns.pipe;

class SingleRequestInActorExample extends AbstractActor {
  final Http http = Http.get(context().system());
  final ExecutionContextExecutor dispatcher = context().dispatcher();

  @Override
  public Receive createReceive() {
    return receiveBuilder()
      .match(String.class, url -> pipe(fetch(url), dispatcher).to(self()))
      .build();
  }

  CompletionStage<HttpResponse> fetch(String url) {
    return http.singleRequest(HttpRequest.create(url));
  }
}
```

### Example 5: Collecting headers from a server response

```scala
/*
 * Copyright (C) 2020-2025 Lightbend Inc. <https://akka.io>
 */

package docs.http.scaladsl

import akka.actor.ActorSystem
import akka.http.scaladsl.Http
import akka.http.scaladsl.model.headers.`Set-Cookie`
import akka.http.scaladsl.model._

import scala.concurrent.ExecutionContextExecutor
import scala.concurrent.Future

class HttpClientCollectingHeaders {
  def main(args: Array[String]): Unit = {
    implicit val system: ActorSystem = ActorSystem()
    implicit val executionContext: ExecutionContextExecutor = system.dispatcher

    val responseFuture: Future[HttpResponse] = Http().singleRequest(HttpRequest(uri = "http://akka.io"))

    responseFuture.map {
      case response @ HttpResponse(StatusCodes.OK, _, _, _) =>
        val setCookies = response.headers[`Set-Cookie`]
        println(s"Cookies set by a server: $setCookies")
        response.discardEntityBytes()
      case _ => sys.error("something wrong")
    }
  }
}
```

### Example 6: Collecting headers from a server response

```java
final HttpResponse response = responseFromSomewhere();

final Iterable<SetCookie> setCookies = response.getHeaders(SetCookie.class);

System.out.println("Cookies set by a server: " + setCookies);
response.discardEntityBytes(system);
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpRequest.html
- https://doc.akka.io/api/akka/2.10/akka/actor/Actor.html
- https://doc.akka.io/api/akka/2.10/akka/stream/scaladsl/Flow.html
- https://doc.akka.io/api/akka/2.10/akka/stream/scaladsl/Sink.html
- https://doc.akka.io/api/akka/2.10/akka/stream/scaladsl/Source.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpRequest.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/Actor.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/javadsl/Flow.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/javadsl/Sink.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/javadsl/Source.html
- https://doc.akka.io/libraries/akka-http/current/client-side/connection-level.html
- https://doc.akka.io/libraries/akka-http/current/client-side/host-level.html
- https://doc.akka.io/libraries/akka-http/current/client-side/request-and-response.html
- https://doc.akka.io/libraries/akka-http/current/implications-of-streaming-http-entity.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/client-side/request-level.html](https://doc.akka.io/libraries/akka-http/current/client-side/request-level.html)*