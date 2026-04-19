---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:57:38Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/mapRequestContext.html
title: mapRequestContext • Akka HTTP
---

# mapRequestContext • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# mapRequestContext

## Signature

```
def mapRequestContext(f: RequestContext => RequestContext): Directive0
```

## Description

Transforms the [`RequestContext`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/RequestContext.html "akka.http.javadsl.server.RequestContext")[`RequestContext`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/RequestContext.html "akka.http.scaladsl.server.RequestContext") before it is passed to the inner route.

The `mapRequestContext` directive is used as a building block for [Custom Directives](../custom-directives.html) to transform the request context before it is passed to the inner route. To change only the request value itself the [mapRequest](mapRequest.html) directive can be used instead.

See [Request Transforming Directives](index.html#request-transforming-directives) for an overview of similar directives.

## Example

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/directives/BasicDirectivesExamplesSpec.scala#L516-L529 "Go to snippet source")val replaceRequest =
  mapRequestContext(_.withRequest(HttpRequest(HttpMethods.POST)))

val route =
  replaceRequest {
    extractRequest { req =>
      complete(req.method.value)
    }
  }

// tests:
Get("/abc/def/ghi") ~> route ~> check {
  responseAs[String] shouldEqual "POST"
}
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/directives/BasicDirectivesExamplesTest.java#L215-L736 "Go to snippet source")import static akka.http.javadsl.server.Directives.complete;
import static akka.http.javadsl.server.Directives.extractRequest;
import static akka.http.javadsl.server.Directives.mapRequestContext;

final Route route = mapRequestContext(ctx ->
  ctx.withRequest(HttpRequest.create().withMethod(HttpMethods.POST)), () ->
  extractRequest(req -> complete(req.method().value()))
);

// tests:
testRoute(route).run(HttpRequest.GET("/abc/def/ghi"))
  .assertEntity("POST");
```

## Code Examples

### Example 1: Signature

```scala
def mapRequestContext(f: RequestContext => RequestContext): Directive0
```

### Example 2: Example

```scala
val replaceRequest =
  mapRequestContext(_.withRequest(HttpRequest(HttpMethods.POST)))

val route =
  replaceRequest {
    extractRequest { req =>
      complete(req.method.value)
    }
  }

// tests:
Get("/abc/def/ghi") ~> route ~> check {
  responseAs[String] shouldEqual "POST"
}
```

### Example 3: Example

```java
import static akka.http.javadsl.server.Directives.complete;
import static akka.http.javadsl.server.Directives.extractRequest;
import static akka.http.javadsl.server.Directives.mapRequestContext;

final Route route = mapRequestContext(ctx ->
  ctx.withRequest(HttpRequest.create().withMethod(HttpMethods.POST)), () ->
  extractRequest(req -> complete(req.method().value()))
);

// tests:
testRoute(route).run(HttpRequest.GET("/abc/def/ghi"))
  .assertEntity("POST");
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/RequestContext.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/RequestContext.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/index.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/mapRequest.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/mapResponse.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/custom-directives.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/mapRequestContext.html](https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/mapRequestContext.html)*