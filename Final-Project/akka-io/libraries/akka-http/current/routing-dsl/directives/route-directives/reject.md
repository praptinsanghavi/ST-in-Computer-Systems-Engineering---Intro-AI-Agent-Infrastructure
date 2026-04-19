---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:58:03Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/route-directives/reject.html
title: reject • Akka HTTP
---

# reject • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# reject

## Signature

```
def reject: StandardRoute
def reject(rejections: Rejection*): StandardRoute
```

## Description

Explicitly rejects the request optionally using the given rejection(s).

`reject` uses the given rejection instances (which might be the empty `Seq`) to construct a [`Route`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/index.html#Route=akka.http.scaladsl.server.RequestContext=%3Escala.concurrent.Future[akka.http.scaladsl.server.RouteResult] "akka.http.scaladsl.server")[`Route`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/Route.html "akka.http.javadsl.server.Route") which simply calls `requestContext.reject`. See the chapter on [Rejections](../../rejections.html) for more information on what this means.

After the request has been rejected at the respective point it will continue to flow through the routing structure in the search for a route that is able to complete it.

The explicit `reject` directive is used mostly when building [Custom Directives](../custom-directives.html), e.g. inside of a `flatMap` modifier for “filtering out” certain cases.

## Example

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/directives/RouteDirectivesExamplesSpec.scala#L14-L131 "Go to snippet source")import akka.http.scaladsl.model._
import akka.http.scaladsl.server.ValidationRejection

val route =
  concat(
    path("a") {
      reject // don't handle here, continue on
    },
    path("a") {
      complete("foo")
    },
    path("b") {
      // trigger a ValidationRejection explicitly
      // rather than through the `validate` directive
      reject(ValidationRejection("Restricted!"))
    }
  )

// tests:
Get("/a") ~> route ~> check {
  responseAs[String] shouldEqual "foo"
}

Get("/b") ~> route ~> check {
  rejection shouldEqual ValidationRejection("Restricted!")
}
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/directives/RouteDirectivesExamplesTest.java#L28-L128 "Go to snippet source")import akka.http.javadsl.server.Directives;

import static akka.http.javadsl.server.Directives.complete;
import static akka.http.javadsl.server.Directives.path;
import static akka.http.javadsl.server.Directives.reject;
final Route route = concat(
  path("a", Directives::reject), // don't handle here, continue on
  path("a", () -> complete("foo")),
  path("b", () -> reject(Rejections.validationRejection("Restricted!")))
);

// tests:
testRoute(route).run(HttpRequest.GET("/a"))
  .assertEntity("foo");

runRouteUnSealed(route, HttpRequest.GET("/b"))
  .assertRejections(Rejections.validationRejection("Restricted!"));
```

## Code Examples

### Example 1: Signature

```scala
def reject: StandardRoute
def reject(rejections: Rejection*): StandardRoute
```

### Example 2: Example

```scala
import akka.http.scaladsl.model._
import akka.http.scaladsl.server.ValidationRejection

val route =
  concat(
    path("a") {
      reject // don't handle here, continue on
    },
    path("a") {
      complete("foo")
    },
    path("b") {
      // trigger a ValidationRejection explicitly
      // rather than through the `validate` directive
      reject(ValidationRejection("Restricted!"))
    }
  )

// tests:
Get("/a") ~> route ~> check {
  responseAs[String] shouldEqual "foo"
}

Get("/b") ~> route ~> check {
  rejection shouldEqual ValidationRejection("Restricted!")
}
```

### Example 3: Example

```java
import akka.http.javadsl.server.Directives;

import static akka.http.javadsl.server.Directives.complete;
import static akka.http.javadsl.server.Directives.path;
import static akka.http.javadsl.server.Directives.reject;
final Route route = concat(
  path("a", Directives::reject), // don't handle here, continue on
  path("a", () -> complete("foo")),
  path("b", () -> reject(Rejections.validationRejection("Restricted!")))
);

// tests:
testRoute(route).run(HttpRequest.GET("/a"))
  .assertEntity("foo");

runRouteUnSealed(route, HttpRequest.GET("/b"))
  .assertRejections(Rejections.validationRejection("Restricted!"));
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/index.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/Route.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/custom-directives.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/route-directives/redirect.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/scheme-directives/index.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/rejections.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/route-directives/reject.html](https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/route-directives/reject.html)*