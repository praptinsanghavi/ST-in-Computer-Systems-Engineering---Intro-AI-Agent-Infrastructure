---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:57:08Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/extractRequestContext.html
title: extractRequestContext • Akka HTTP
---

# extractRequestContext • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# extractRequestContext

## Signature

```
def extractRequestContext: Directive1[RequestContext]
```

## Description

Extracts the request’s underlying [`RequestContext`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/RequestContext.html "akka.http.javadsl.server.RequestContext")[`RequestContext`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/RequestContext.html "akka.http.scaladsl.server.RequestContext").

This directive is used as a building block for most of the other directives, which extract the context and by inspecting some of it’s values can decide what to do with the request \- for example provide a value, or reject the request.

See also [extractRequest](extractRequest.html) if only interested in the [`HttpRequest`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpRequest.html "akka.http.javadsl.model.HttpRequest")[`HttpRequest`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpRequest.html "akka.http.scaladsl.model.HttpRequest") instance itself.

## Example

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/directives/BasicDirectivesExamplesSpec.scala#L734-L747 "Go to snippet source")val route =
  extractRequestContext { ctx =>
    ctx.log.debug("Using access to additional context available, like the logger.")
    val request = ctx.request
    complete(s"Request method is ${request.method.name} and content-type is ${request.entity.contentType}")
  }

// tests:
Post("/", "text") ~> route ~> check {
  responseAs[String] shouldEqual "Request method is POST and content-type is text/plain; charset=UTF-8"
}
Get("/") ~> route ~> check {
  responseAs[String] shouldEqual "Request method is GET and content-type is none/none"
}
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/directives/BasicDirectivesExamplesTest.java#L144-L924 "Go to snippet source")import static akka.http.javadsl.server.Directives.extractRequestContext;

final Route route = extractRequestContext(ctx -> {
  ctx.getLog().debug("Using access to additional context available, like the logger.");
  final HttpRequest request = ctx.getRequest();
  return complete("Request method is " + request.method().name() +
                    " and content-type is " + request.entity().getContentType());
});

// tests:
testRoute(route).run(HttpRequest.POST("/").withEntity("text"))
  .assertEntity("Request method is POST and content-type is text/plain; charset=UTF-8");
testRoute(route).run(HttpRequest.GET("/"))
  .assertEntity("Request method is GET and content-type is none/none");
```

## Code Examples

### Example 1: Signature

```scala
def extractRequestContext: Directive1[RequestContext]
```

### Example 2: Example

```scala
val route =
  extractRequestContext { ctx =>
    ctx.log.debug("Using access to additional context available, like the logger.")
    val request = ctx.request
    complete(s"Request method is ${request.method.name} and content-type is ${request.entity.contentType}")
  }

// tests:
Post("/", "text") ~> route ~> check {
  responseAs[String] shouldEqual "Request method is POST and content-type is text/plain; charset=UTF-8"
}
Get("/") ~> route ~> check {
  responseAs[String] shouldEqual "Request method is GET and content-type is none/none"
}
```

### Example 3: Example

```java
import static akka.http.javadsl.server.Directives.extractRequestContext;

final Route route = extractRequestContext(ctx -> {
  ctx.getLog().debug("Using access to additional context available, like the logger.");
  final HttpRequest request = ctx.getRequest();
  return complete("Request method is " + request.method().name() +
                    " and content-type is " + request.entity().getContentType());
});

// tests:
testRoute(route).run(HttpRequest.POST("/").withEntity("text"))
  .assertEntity("Request method is POST and content-type is text/plain; charset=UTF-8");
testRoute(route).run(HttpRequest.GET("/"))
  .assertEntity("Request method is GET and content-type is none/none");
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpRequest.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/RequestContext.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpRequest.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/RequestContext.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/extractRequest.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/extractRequestEntity.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/extractRequestContext.html](https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/extractRequestContext.html)*