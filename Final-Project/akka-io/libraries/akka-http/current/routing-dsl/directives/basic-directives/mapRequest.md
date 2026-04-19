---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:57:37Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/mapRequest.html
title: mapRequest • Akka HTTP
---

# mapRequest • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# mapRequest

## Signature

```
def mapRequest(f: HttpRequest => HttpRequest): Directive0
```

## Description

Transforms the request before it is handled by the inner route.

The `mapRequest` directive is used as a building block for [Custom Directives](../custom-directives.html) to transform a request before it is handled by the inner route. Changing the `request.uri` parameter has no effect on path matching in the inner route because the unmatched path is a separate field of the [`RequestContext`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/RequestContext.html "akka.http.javadsl.server.RequestContext")[`RequestContext`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/RequestContext.html "akka.http.scaladsl.server.RequestContext") value which is passed into routes. To change the unmatched path or other fields of the [`RequestContext`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/RequestContext.html "akka.http.javadsl.server.RequestContext")[`RequestContext`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/RequestContext.html "akka.http.scaladsl.server.RequestContext") use the [mapRequestContext](mapRequestContext.html) directive.

See [Request Transforming Directives](index.html#request-transforming-directives) for an overview of similar directives.

## Example

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/directives/BasicDirectivesExamplesSpec.scala#L501-L511 "Go to snippet source")def transformToPostRequest(req: HttpRequest): HttpRequest = req.withMethod(HttpMethods.POST)
val route =
  mapRequest(transformToPostRequest) {
    extractRequest { req =>
      complete(s"The request method was ${req.method.name}")
    }
  }

Get("/") ~> route ~> check {
  responseAs[String] shouldEqual "The request method was POST"
}
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/directives/BasicDirectivesExamplesTest.java#L104-L722 "Go to snippet source")import static akka.http.javadsl.server.Directives.mapRequest;

import static akka.http.javadsl.server.Directives.extractRequest;
import static akka.http.javadsl.server.Directives.mapRequest;

final Route route = mapRequest(req ->
  req.withMethod(HttpMethods.POST), () ->
  extractRequest(req -> complete("The request method was " + req.method().name()))
);

// tests:
testRoute(route).run(HttpRequest.GET("/"))
  .assertEntity("The request method was POST");
```

## Code Examples

### Example 1: Signature

```scala
def mapRequest(f: HttpRequest => HttpRequest): Directive0
```

### Example 2: Example

```scala
def transformToPostRequest(req: HttpRequest): HttpRequest = req.withMethod(HttpMethods.POST)
val route =
  mapRequest(transformToPostRequest) {
    extractRequest { req =>
      complete(s"The request method was ${req.method.name}")
    }
  }

Get("/") ~> route ~> check {
  responseAs[String] shouldEqual "The request method was POST"
}
```

### Example 3: Example

```java
import static akka.http.javadsl.server.Directives.mapRequest;

import static akka.http.javadsl.server.Directives.extractRequest;
import static akka.http.javadsl.server.Directives.mapRequest;

final Route route = mapRequest(req ->
  req.withMethod(HttpMethods.POST), () ->
  extractRequest(req -> complete("The request method was " + req.method().name()))
);

// tests:
testRoute(route).run(HttpRequest.GET("/"))
  .assertEntity("The request method was POST");
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/RequestContext.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/RequestContext.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/index.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/mapRejections.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/mapRequestContext.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/custom-directives.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/mapRequest.html](https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/mapRequest.html)*