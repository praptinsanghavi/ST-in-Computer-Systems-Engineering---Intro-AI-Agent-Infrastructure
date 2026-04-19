---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:28:37Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/route-directives/handle.html
title: handle • Akka HTTP
---

# handle • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# handle

## Signature

```
def handle(handler: HttpRequest => Future[HttpResponse]): StandardRoute
def handle(handler: PartialFunction[HttpRequest, Future[HttpResponse]]): StandardRoute
def handle(handler: PartialFunction[HttpRequest, Future[HttpResponse]], rejections: Seq[Rejection]): StandardRoute
```

## Description

Creates a [`Route`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/index.html#Route=akka.http.scaladsl.server.RequestContext=%3Escala.concurrent.Future[akka.http.scaladsl.server.RouteResult] "akka.http.scaladsl.server")[`Route`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/Route.html "akka.http.javadsl.server.Route") that handles the request using a function or `PartialFunction` from [`HttpRequest`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpRequest.html "akka.http.javadsl.model.HttpRequest")[`HttpRequest`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpRequest.html "akka.http.scaladsl.model.HttpRequest") to a `Future``CompletionStage` of [`HttpResponse`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpResponse.html "akka.http.javadsl.model.HttpResponse")[`HttpResponse`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpResponse.html "akka.http.scaladsl.model.HttpResponse").

This directive can be used to include external components request processing components defined as a `Function` or `PartialFunction` (like [those provided by akka\-grpc](https://doc.akka.io/libraries/akka-grpc/current/server/walkthrough.html#serving-multiple-services)) into a routing tree defined by directives and routes.

For the `PartialFunction` variant, the given list of rejections will be used to reject the request with if the `PartialFunction` is not defined for a request. By default, an empty list of rejections will be used which is interpreted as “Not Found”.

There is also a strict version called [handleSync](handleSync.html).

## Example

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/directives/RouteDirectivesExamplesSpec.scala#L181-L203 "Go to snippet source")val handler: PartialFunction[HttpRequest, Future[HttpResponse]] = {
  case HttpRequest(HttpMethods.GET, Uri.Path("/value"), _, _, _) =>
    Future.successful(HttpResponse(entity = "23"))
}

val route =
  concat(
    handle(handler),
    complete("fallback")
  )

// tests:
Get("/value") ~> route ~> check {
  status shouldEqual StatusCodes.OK
  responseAs[String] shouldEqual "23"
}

// Uri doesn't match so function is never invoked and the request is rejected and the
// fallback completes the request.
Get("/other") ~> route ~> check {
  status shouldEqual StatusCodes.OK
  responseAs[String] shouldEqual "fallback"
}
```

## Code Examples

### Example 1: Signature

```scala
def handle(handler: HttpRequest => Future[HttpResponse]): StandardRoute
def handle(handler: PartialFunction[HttpRequest, Future[HttpResponse]]): StandardRoute
def handle(handler: PartialFunction[HttpRequest, Future[HttpResponse]], rejections: Seq[Rejection]): StandardRoute
```

### Example 2: Example

```scala
val handler: PartialFunction[HttpRequest, Future[HttpResponse]] = {
  case HttpRequest(HttpMethods.GET, Uri.Path("/value"), _, _, _) =>
    Future.successful(HttpResponse(entity = "23"))
}

val route =
  concat(
    handle(handler),
    complete("fallback")
  )

// tests:
Get("/value") ~> route ~> check {
  status shouldEqual StatusCodes.OK
  responseAs[String] shouldEqual "23"
}

// Uri doesn't match so function is never invoked and the request is rejected and the
// fallback completes the request.
Get("/other") ~> route ~> check {
  status shouldEqual StatusCodes.OK
  responseAs[String] shouldEqual "fallback"
}
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpRequest.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpResponse.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/index.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpRequest.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpResponse.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/Route.html
- https://doc.akka.io/libraries/akka-grpc/current/server/walkthrough.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/route-directives/failWith.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/route-directives/handleSync.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/route-directives/handle.html](https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/route-directives/handle.html)*