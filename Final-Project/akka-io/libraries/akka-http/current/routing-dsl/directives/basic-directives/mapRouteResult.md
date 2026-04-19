---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:57:40Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/mapRouteResult.html
title: mapRouteResult • Akka HTTP
---

# mapRouteResult • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# mapRouteResult

## Signature

```
def mapRouteResult(f: RouteResult => RouteResult): Directive0
```

## Description

Changes the message the inner route sends to the responder.

The `mapRouteResult` directive is used as a building block for [Custom Directives](../custom-directives.html) to transform the [RouteResult](../../routes.html#routeresult) coming back from the inner route.

See [Result Transformation Directives](index.html#result-transformation-directives) for similar directives.

## Example

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/directives/BasicDirectivesExamplesSpec.scala#L534-L546 "Go to snippet source")val rejectAll = // not particularly useful directive
  mapRouteResult {
    case _ => Rejected(List(AuthorizationFailedRejection))
  }
val route =
  rejectAll {
    complete("abc")
  }

// tests:
Get("/") ~> route ~> check {
  rejections.nonEmpty shouldEqual true
}
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/directives/BasicDirectivesExamplesTest.java#L100-L750 "Go to snippet source")import static akka.http.javadsl.server.Directives.mapRouteResult;

import static akka.http.javadsl.server.Directives.complete;
import static akka.http.javadsl.server.Directives.mapRouteResult;

// this directive is a joke, don't do that :-)
final Route route = mapRouteResult(r -> {
  if (r instanceof Complete) {
    final HttpResponse response = ((Complete) r).getResponse();
    return RouteResults.complete(response.withStatus(200));
  } else {
    return r;
  }
}, () -> complete(StatusCodes.ACCEPTED));

// tests:
testRoute(route).run(HttpRequest.GET("/"))
  .assertStatusCode(StatusCodes.OK);
final Route route = mapRouteResult(rr -> {
  final Iterable<Rejection> rejections = Collections.singletonList(Rejections.authorizationFailed());
  return RouteResults.rejected(rejections);
}, () -> complete("abc"));

// tests:
runRouteUnSealed(route, HttpRequest.GET("/"))
  .assertRejections(Rejections.authorizationFailed());
```

## Code Examples

### Example 1: Signature

```scala
def mapRouteResult(f: RouteResult => RouteResult): Directive0
```

### Example 2: Example

```scala
val rejectAll = // not particularly useful directive
  mapRouteResult {
    case _ => Rejected(List(AuthorizationFailedRejection))
  }
val route =
  rejectAll {
    complete("abc")
  }

// tests:
Get("/") ~> route ~> check {
  rejections.nonEmpty shouldEqual true
}
```

### Example 3: Example

```java
import static akka.http.javadsl.server.Directives.mapRouteResult;

import static akka.http.javadsl.server.Directives.complete;
import static akka.http.javadsl.server.Directives.mapRouteResult;

// this directive is a joke, don't do that :-)
final Route route = mapRouteResult(r -> {
  if (r instanceof Complete) {
    final HttpResponse response = ((Complete) r).getResponse();
    return RouteResults.complete(response.withStatus(200));
  } else {
    return r;
  }
}, () -> complete(StatusCodes.ACCEPTED));

// tests:
testRoute(route).run(HttpRequest.GET("/"))
  .assertStatusCode(StatusCodes.OK);
final Route route = mapRouteResult(rr -> {
  final Iterable<Rejection> rejections = Collections.singletonList(Rejections.authorizationFailed());
  return RouteResults.rejected(rejections);
}, () -> complete("abc"));

// tests:
runRouteUnSealed(route, HttpRequest.GET("/"))
  .assertRejections(Rejections.authorizationFailed());
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/index.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/mapResponseHeaders.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/mapRouteResultFuture.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/custom-directives.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/routes.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/mapRouteResult.html](https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/mapRouteResult.html)*