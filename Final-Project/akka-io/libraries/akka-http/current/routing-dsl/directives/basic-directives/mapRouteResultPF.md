---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:57:40Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/mapRouteResultPF.html
title: mapRouteResultPF • Akka HTTP
---

# mapRouteResultPF • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# mapRouteResultPF

## Signature

```
def mapRouteResultPF(f: PartialFunction[RouteResult, RouteResult]): Directive0
```

## Description

*Partial Function* version of [mapRouteResult](mapRouteResult.html).

Changes the message the inner route sends to the responder.

The `mapRouteResult` directive is used as a building block for [Custom Directives](../custom-directives.html) to transform the [RouteResult](../../routes.html#routeresult) coming back from the inner route. It’s similar to the [mapRouteResult](mapRouteResult.html) directive but allows to specify a partial function that doesn’t have to handle all potential [`RouteResult`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/RouteResult.html "akka.http.javadsl.server.RouteResult")[`RouteResult`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/RouteResult.html "akka.http.scaladsl.server.RouteResult") instances.

See [Result Transformation Directives](index.html#result-transformation-directives) for similar directives.

## Example

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/directives/BasicDirectivesExamplesSpec.scala#L551-L564 "Go to snippet source")case object MyCustomRejection extends Rejection
val rejectRejections = // not particularly useful directive
  mapRouteResultPF {
    case Rejected(_) => Rejected(List(AuthorizationFailedRejection))
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
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/directives/BasicDirectivesExamplesTest.java#L108-L769 "Go to snippet source")import static akka.http.javadsl.server.Directives.mapRouteResultPF;

import static akka.http.javadsl.server.Directives.mapRouteResultPF;
import static akka.http.javadsl.server.Directives.reject;

final Route route = mapRouteResultPF(
  new PFBuilder<RouteResult, RouteResult>()
    .match(Rejected.class, rejected -> {
      final Iterable<Rejection> rejections =
        Collections.singletonList(Rejections.authorizationFailed());
      return RouteResults.rejected(rejections);
    }).build(), () -> reject(new MyCustomRejection()));

// tests:
runRouteUnSealed(route, HttpRequest.GET("/"))
  .assertRejections(Rejections.authorizationFailed());
```

## Code Examples

### Example 1: Signature

```scala
def mapRouteResultPF(f: PartialFunction[RouteResult, RouteResult]): Directive0
```

### Example 2: Example

```scala
case object MyCustomRejection extends Rejection
val rejectRejections = // not particularly useful directive
  mapRouteResultPF {
    case Rejected(_) => Rejected(List(AuthorizationFailedRejection))
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
import static akka.http.javadsl.server.Directives.mapRouteResultPF;

import static akka.http.javadsl.server.Directives.mapRouteResultPF;
import static akka.http.javadsl.server.Directives.reject;

final Route route = mapRouteResultPF(
  new PFBuilder<RouteResult, RouteResult>()
    .match(Rejected.class, rejected -> {
      final Iterable<Rejection> rejections =
        Collections.singletonList(Rejections.authorizationFailed());
      return RouteResults.rejected(rejections);
    }).build(), () -> reject(new MyCustomRejection()));

// tests:
runRouteUnSealed(route, HttpRequest.GET("/"))
  .assertRejections(Rejections.authorizationFailed());
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/RouteResult.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/RouteResult.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/index.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/mapRouteResult.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/mapRouteResultFuture.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/mapRouteResultWithPF.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/custom-directives.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/routes.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/mapRouteResultPF.html](https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/mapRouteResultPF.html)*