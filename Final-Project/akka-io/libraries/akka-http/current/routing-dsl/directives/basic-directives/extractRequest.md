---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:57:08Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/extractRequest.html
title: extractRequest • Akka HTTP
---

# extractRequest • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# extractRequest

## Signature

```
def extractRequest: Directive1[HttpRequest]
```

## Description

Extracts the complete [`HttpRequest`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpRequest.html "akka.http.javadsl.model.HttpRequest")[`HttpRequest`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpRequest.html "akka.http.scaladsl.model.HttpRequest") instance.

Use `extractRequest` to extract just the complete URI of the request. Usually there’s little use of extracting the complete request because extracting of most of the aspects of HttpRequests is handled by specialized directives. See [Request Directives](../by-trait.html#request-directives).

## Example

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/directives/BasicDirectivesExamplesSpec.scala#L667-L678 "Go to snippet source")val route =
  extractRequest { request =>
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
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/directives/BasicDirectivesExamplesTest.java#L132-L877 "Go to snippet source")import static akka.http.javadsl.server.Directives.extractRequest;

final Route route = extractRequest(request ->
  complete("Request method is " + request.method().name() +
             " and content-type is " + request.entity().getContentType())
);

// tests:
testRoute(route).run(HttpRequest.POST("/").withEntity("text"))
  .assertEntity("Request method is POST and content-type is text/plain; charset=UTF-8");
testRoute(route).run(HttpRequest.GET("/"))
  .assertEntity("Request method is GET and content-type is none/none");
```

## Code Examples

### Example 1: Signature

```scala
def extractRequest: Directive1[HttpRequest]
```

### Example 2: Example

```scala
val route =
  extractRequest { request =>
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
import static akka.http.javadsl.server.Directives.extractRequest;

final Route route = extractRequest(request ->
  complete("Request method is " + request.method().name() +
             " and content-type is " + request.entity().getContentType())
);

// tests:
testRoute(route).run(HttpRequest.POST("/").withEntity("text"))
  .assertEntity("Request method is POST and content-type is text/plain; charset=UTF-8");
testRoute(route).run(HttpRequest.GET("/"))
  .assertEntity("Request method is GET and content-type is none/none");
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpRequest.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpRequest.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/extractParserSettings.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/extractRequestContext.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/by-trait.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/extractRequest.html](https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/extractRequest.html)*