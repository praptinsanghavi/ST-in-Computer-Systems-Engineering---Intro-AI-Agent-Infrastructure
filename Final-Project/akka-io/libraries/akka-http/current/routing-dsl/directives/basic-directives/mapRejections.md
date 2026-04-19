---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:57:37Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/mapRejections.html
title: mapRejections • Akka HTTP
---

# mapRejections • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# mapRejections

## Signature

```
def mapRejections(f: immutable.Seq[Rejection] => immutable.Seq[Rejection]): Directive0
```

## Description

**Low level directive** – unless you’re sure you need to be working on this low\-level you might instead want to try the [handleRejections](../execution-directives/handleRejections.html) directive which provides a nicer DSL for building rejection handlers.

The `mapRejections` directive is used as a building block for [Custom Directives](../custom-directives.html) to transform a list of rejections from the inner route to a new list of rejections.

See [Response Transforming Directives](index.html#response-transforming-directives) for similar directives.

## Example

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/directives/BasicDirectivesExamplesSpec.scala#L405-L419 "Go to snippet source")// ignore any rejections and replace them by AuthorizationFailedRejection
val replaceByAuthorizationFailed = mapRejections(_ => List(AuthorizationFailedRejection))
val route =
  replaceByAuthorizationFailed {
    path("abc")(complete("abc"))
  }

// tests:
Get("/") ~> route ~> check {
  rejection shouldEqual AuthorizationFailedRejection
}

Get("/abc") ~> route ~> check {
  status shouldEqual StatusCodes.OK
}
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/directives/BasicDirectivesExamplesTest.java#L192-L624 "Go to snippet source")import static akka.http.javadsl.server.Directives.mapRejections;

// ignore any rejections and replace them by AuthorizationFailedRejection
final Route route = mapRejections(
  rejections -> Collections.singletonList((Rejection) Rejections.authorizationFailed()),
  () -> path("abc", () -> complete("abc"))
);

// tests:
runRouteUnSealed(route, HttpRequest.GET("/"))
  .assertRejections(Rejections.authorizationFailed());
testRoute(route).run(HttpRequest.GET("/abc"))
  .assertStatusCode(StatusCodes.OK);
```

## Code Examples

### Example 1: Signature

```scala
def mapRejections(f: immutable.Seq[Rejection] => immutable.Seq[Rejection]): Directive0
```

### Example 2: Example

```scala
// ignore any rejections and replace them by AuthorizationFailedRejection
val replaceByAuthorizationFailed = mapRejections(_ => List(AuthorizationFailedRejection))
val route =
  replaceByAuthorizationFailed {
    path("abc")(complete("abc"))
  }

// tests:
Get("/") ~> route ~> check {
  rejection shouldEqual AuthorizationFailedRejection
}

Get("/abc") ~> route ~> check {
  status shouldEqual StatusCodes.OK
}
```

### Example 3: Example

```java
import static akka.http.javadsl.server.Directives.mapRejections;

// ignore any rejections and replace them by AuthorizationFailedRejection
final Route route = mapRejections(
  rejections -> Collections.singletonList((Rejection) Rejections.authorizationFailed()),
  () -> path("abc", () -> complete("abc"))
);

// tests:
runRouteUnSealed(route, HttpRequest.GET("/"))
  .assertRejections(Rejections.authorizationFailed());
testRoute(route).run(HttpRequest.GET("/abc"))
  .assertStatusCode(StatusCodes.OK);
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/index.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/mapInnerRoute.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/mapRequest.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/custom-directives.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/execution-directives/handleRejections.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/mapRejections.html](https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/mapRejections.html)*