---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:57:41Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/mapRouteResultWithPF.html
title: mapRouteResultWithPF • Akka HTTP
---

# mapRouteResultWithPF • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# mapRouteResultWithPF

## Signature

```
def mapRouteResultWithPF(f: PartialFunction[RouteResult, Future[RouteResult]]): Directive0
```

## Description

Asynchronous variant of [mapRouteResultPF](mapRouteResultPF.html).

Changes the message the inner route sends to the responder.

The `mapRouteResult` directive is used as a building block for [Custom Directives](../custom-directives.html) to transform the [RouteResult](../../routes.html#routeresult) coming back from the inner route.

See [Result Transformation Directives](index.html#result-transformation-directives) for similar directives.

## Example

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/directives/BasicDirectivesExamplesSpec.scala#L569-L582 "Go to snippet source")case object MyCustomRejection extends Rejection
val rejectRejections = // not particularly useful directive
  mapRouteResultWithPF {
    case Rejected(_) => Future(Rejected(List(AuthorizationFailedRejection)))
  }
val route =
  rejectRejections {
    reject(MyCustomRejection)
  }

// tests:
Get("/") ~> route ~> check {
  rejection shouldEqual AuthorizationFailedRejection
}
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/directives/BasicDirectivesExamplesTest.java#L112-L787 "Go to snippet source")import static akka.http.javadsl.server.Directives.mapRouteResultWithPF;

import static akka.http.javadsl.server.Directives.mapRouteResultWithPF;
import static akka.http.javadsl.server.Directives.reject;

final Route route = mapRouteResultWithPF(
  new PFBuilder<RouteResult, CompletionStage<RouteResult>>()
  .match(Rejected.class, rejected -> CompletableFuture.supplyAsync(() -> {
    final Iterable<Rejection> rejections =
      Collections.singletonList(Rejections.authorizationFailed());
    return RouteResults.rejected(rejections);
  })
).build(), () -> reject(new MyCustomRejection()));

// tests:
runRouteUnSealed(route, HttpRequest.GET("/"))
  .assertRejections(Rejections.authorizationFailed());
```

## Code Examples

### Example 1: Signature

```scala
def mapRouteResultWithPF(f: PartialFunction[RouteResult, Future[RouteResult]]): Directive0
```

### Example 2: Example

```scala
case object MyCustomRejection extends Rejection
val rejectRejections = // not particularly useful directive
  mapRouteResultWithPF {
    case Rejected(_) => Future(Rejected(List(AuthorizationFailedRejection)))
  }
val route =
  rejectRejections {
    reject(MyCustomRejection)
  }

// tests:
Get("/") ~> route ~> check {
  rejection shouldEqual AuthorizationFailedRejection
}
```

### Example 3: Example

```java
import static akka.http.javadsl.server.Directives.mapRouteResultWithPF;

import static akka.http.javadsl.server.Directives.mapRouteResultWithPF;
import static akka.http.javadsl.server.Directives.reject;

final Route route = mapRouteResultWithPF(
  new PFBuilder<RouteResult, CompletionStage<RouteResult>>()
  .match(Rejected.class, rejected -> CompletableFuture.supplyAsync(() -> {
    final Iterable<Rejection> rejections =
      Collections.singletonList(Rejections.authorizationFailed());
    return RouteResults.rejected(rejections);
  })
).build(), () -> reject(new MyCustomRejection()));

// tests:
runRouteUnSealed(route, HttpRequest.GET("/"))
  .assertRejections(Rejections.authorizationFailed());
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/index.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/mapRouteResultPF.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/mapRouteResultWith.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/custom-directives.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/routes.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/mapRouteResultWithPF.html](https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/mapRouteResultWithPF.html)*