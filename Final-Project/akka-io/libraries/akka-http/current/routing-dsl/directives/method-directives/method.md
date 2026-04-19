---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:57:42Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/method-directives/method.html
title: method • Akka HTTP
---

# method • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# method

Matches HTTP requests based on their method.

## Signature

```
def method(httpMethod: HttpMethod): Directive0
```

## Description

This directive filters the incoming request by its HTTP method. Only requests with the specified method are passed on to the inner route. All others are rejected with a [`MethodRejection`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/MethodRejection.html "akka.http.javadsl.server.MethodRejection")[`MethodRejection`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/MethodRejection.html "akka.http.scaladsl.server.MethodRejection"), which is translated into a `405 Method Not Allowed` response by the default [RejectionHandler](../../rejections.html#the-rejectionhandler).

## Example

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/directives/MethodDirectivesExamplesSpec.scala#L93-L103 "Go to snippet source")val route = method(HttpMethods.PUT) { complete("This is a PUT request.") }

// tests:
Put("/", "put content") ~> route ~> check {
  responseAs[String] shouldEqual "This is a PUT request."
}

Get("/") ~> Route.seal(route) ~> check {
  status shouldEqual StatusCodes.MethodNotAllowed
  responseAs[String] shouldEqual "HTTP method not allowed, supported methods: PUT"
}
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/directives/MethodDirectivesExamplesTest.java#L46-L145 "Go to snippet source")import static akka.http.javadsl.server.Directives.complete;
import static akka.http.javadsl.server.Directives.method;

final Route route = method(HttpMethods.PUT,
    () -> complete("This is a PUT request."));

testRoute(route).run(HttpRequest.PUT("/").withEntity("put content"))
    .assertEntity("This is a PUT request.");

testRoute(route).run(HttpRequest.GET("/")).assertStatusCode(
    StatusCodes.METHOD_NOT_ALLOWED);
```

## Code Examples

### Example 1: Signature

```scala
def method(httpMethod: HttpMethod): Directive0
```

### Example 2: Example

```scala
val route = method(HttpMethods.PUT) { complete("This is a PUT request.") }

// tests:
Put("/", "put content") ~> route ~> check {
  responseAs[String] shouldEqual "This is a PUT request."
}

Get("/") ~> Route.seal(route) ~> check {
  status shouldEqual StatusCodes.MethodNotAllowed
  responseAs[String] shouldEqual "HTTP method not allowed, supported methods: PUT"
}
```

### Example 3: Example

```java
import static akka.http.javadsl.server.Directives.complete;
import static akka.http.javadsl.server.Directives.method;

final Route route = method(HttpMethods.PUT,
    () -> complete("This is a PUT request."));

testRoute(route).run(HttpRequest.PUT("/").withEntity("put content"))
    .assertEntity("This is a PUT request.");

testRoute(route).run(HttpRequest.GET("/")).assertStatusCode(
    StatusCodes.METHOD_NOT_ALLOWED);
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/MethodRejection.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/MethodRejection.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/method-directives/head.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/method-directives/options.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/rejections.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/method-directives/method.html](https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/method-directives/method.html)*