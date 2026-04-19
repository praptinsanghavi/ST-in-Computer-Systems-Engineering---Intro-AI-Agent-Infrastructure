---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:29:21Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/route-directives/handleSync.html
title: handleSync • Akka HTTP
---

# handleSync • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# handleSync

## Signature

```
def handleSync(handler: HttpRequest => HttpResponse): StandardRoute
def handleSync(handler: PartialFunction[HttpRequest, HttpResponse]): StandardRoute
def handleSync(handler: PartialFunction[HttpRequest, HttpResponse], rejections: Seq[Rejection]): StandardRoute
```

## Description

Creates a [`Route`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/index.html#Route=akka.http.scaladsl.server.RequestContext=%3Escala.concurrent.Future[akka.http.scaladsl.server.RouteResult] "akka.http.scaladsl.server")[`Route`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/Route.html "akka.http.javadsl.server.Route") that handles the request using a function or `PartialFunction` from [`HttpRequest`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpRequest.html "akka.http.javadsl.model.HttpRequest")[`HttpRequest`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpRequest.html "akka.http.scaladsl.model.HttpRequest") to a [`HttpResponse`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpResponse.html "akka.http.javadsl.model.HttpResponse")[`HttpResponse`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpResponse.html "akka.http.scaladsl.model.HttpResponse").

This directive can be used to include components into a routing tree that have been defined only in terms of the low\-level model classes. 

This is a strict version of [handle](handle.html).

## Example

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/directives/RouteDirectivesExamplesSpec.scala#L209-L230 "Go to snippet source")val handler: PartialFunction[HttpRequest, HttpResponse] = {
  case HttpRequest(HttpMethods.GET, Uri.Path("/value"), _, _, _) => HttpResponse(entity = "23")
}

val route =
  concat(
    handleSync(handler),
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
def handleSync(handler: HttpRequest => HttpResponse): StandardRoute
def handleSync(handler: PartialFunction[HttpRequest, HttpResponse]): StandardRoute
def handleSync(handler: PartialFunction[HttpRequest, HttpResponse], rejections: Seq[Rejection]): StandardRoute
```

### Example 2: Example

```scala
val handler: PartialFunction[HttpRequest, HttpResponse] = {
  case HttpRequest(HttpMethods.GET, Uri.Path("/value"), _, _, _) => HttpResponse(entity = "23")
}

val route =
  concat(
    handleSync(handler),
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
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/route-directives/handle.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/route-directives/redirect.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/route-directives/handleSync.html](https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/route-directives/handleSync.html)*