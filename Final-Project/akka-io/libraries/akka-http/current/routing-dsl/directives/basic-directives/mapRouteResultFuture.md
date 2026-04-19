---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:57:40Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/mapRouteResultFuture.html
title: mapRouteResultFuture • Akka HTTP
---

# mapRouteResultFuture • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# mapRouteResultFuture

## Signature

```
def mapRouteResultFuture(f: Future[RouteResult] => Future[RouteResult]): Directive0
```

## Description

Asynchronous version of [mapRouteResult](mapRouteResult.html).

It’s similar to [mapRouteResultWith](mapRouteResultWith.html), however it’s `Future[RouteResult] => Future[RouteResult]``Function<CompletionStage<RouteResult>, CompletionStage<RouteResult>>` instead of `RouteResult => Future[RouteResult]``Function<RouteResult, CompletionStage<RouteResult>>` which may be useful when combining multiple transformations and / or wanting to `recover` from a failed route result.

See [Result Transformation Directives](index.html#result-transformation-directives) for similar directives.

## Example

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/directives/BasicDirectivesExamplesSpec.scala#L322-L341 "Go to snippet source")val tryRecoverAddServer = mapRouteResultFuture { fr =>
  fr recover {
    case ex: IllegalArgumentException =>
      Complete(HttpResponse(StatusCodes.InternalServerError))
  } map {
    case Complete(res) => Complete(res.addHeader(Server("MyServer 1.0")))
    case rest          => rest
  }
}

val route =
  tryRecoverAddServer {
    complete("Hello world!")
  }

// tests:
Get("/") ~> route ~> check {
  status shouldEqual StatusCodes.OK
  header[Server] shouldEqual Some(Server("MyServer 1.0"))
}
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/directives/BasicDirectivesExamplesTest.java#L176-L556 "Go to snippet source")import static akka.http.javadsl.server.Directives.mapRouteResultFuture;

final Route route = mapRouteResultFuture(cr ->
  cr.exceptionally(t -> {
    if (t instanceof IllegalArgumentException) {
      return RouteResults.complete(
        HttpResponse.create().withStatus(StatusCodes.INTERNAL_SERVER_ERROR));
    } else {
      return null;
    }
  }).thenApply(rr -> {
    if (rr instanceof Complete) {
      final HttpResponse res = ((Complete) rr).getResponse();
      return RouteResults.complete(
        res.addHeader(Server.create(ProductVersion.create("MyServer", "1.0"))));
    } else {
      return rr;
    }
  }), () -> complete("Hello world!"));

// tests:
testRoute(route).run(HttpRequest.GET("/"))
  .assertStatusCode(StatusCodes.OK)
  .assertHeaderExists(Server.create(ProductVersion.create("MyServer", "1.0")));
```

## Code Examples

### Example 1: Signature

```scala
def mapRouteResultFuture(f: Future[RouteResult] => Future[RouteResult]): Directive0
```

### Example 2: Example

```scala
val tryRecoverAddServer = mapRouteResultFuture { fr =>
  fr recover {
    case ex: IllegalArgumentException =>
      Complete(HttpResponse(StatusCodes.InternalServerError))
  } map {
    case Complete(res) => Complete(res.addHeader(Server("MyServer 1.0")))
    case rest          => rest
  }
}

val route =
  tryRecoverAddServer {
    complete("Hello world!")
  }

// tests:
Get("/") ~> route ~> check {
  status shouldEqual StatusCodes.OK
  header[Server] shouldEqual Some(Server("MyServer 1.0"))
}
```

### Example 3: Example

```java
import static akka.http.javadsl.server.Directives.mapRouteResultFuture;

final Route route = mapRouteResultFuture(cr ->
  cr.exceptionally(t -> {
    if (t instanceof IllegalArgumentException) {
      return RouteResults.complete(
        HttpResponse.create().withStatus(StatusCodes.INTERNAL_SERVER_ERROR));
    } else {
      return null;
    }
  }).thenApply(rr -> {
    if (rr instanceof Complete) {
      final HttpResponse res = ((Complete) rr).getResponse();
      return RouteResults.complete(
        res.addHeader(Server.create(ProductVersion.create("MyServer", "1.0"))));
    } else {
      return rr;
    }
  }), () -> complete("Hello world!"));

// tests:
testRoute(route).run(HttpRequest.GET("/"))
  .assertStatusCode(StatusCodes.OK)
  .assertHeaderExists(Server.create(ProductVersion.create("MyServer", "1.0")));
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/index.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/mapRouteResult.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/mapRouteResultPF.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/mapRouteResultWith.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/mapRouteResultFuture.html](https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/mapRouteResultFuture.html)*