---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:57:23Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/method-directives/get.html
title: get • Akka HTTP
---

# get • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# get

Matches requests with HTTP method `GET`.

## Signature

```
def get: Directive0
```

## Description

This directive filters the incoming request by its HTTP method. Only requests with method `GET` are passed on to the inner route. All others are rejected with a [`MethodRejection`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/MethodRejection.html "akka.http.javadsl.server.MethodRejection")[`MethodRejection`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/MethodRejection.html "akka.http.scaladsl.server.MethodRejection"), which is translated into a `405 Method Not Allowed` response by the default [RejectionHandler](../../rejections.html#the-rejectionhandler).

## Example

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/directives/MethodDirectivesExamplesSpec.scala#L27-L32 "Go to snippet source")val route = get { complete("This is a GET request.") }

// tests:
Get("/") ~> route ~> check {
  responseAs[String] shouldEqual "This is a GET request."
}
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/directives/MethodDirectivesExamplesTest.java#L78-L81 "Go to snippet source")final Route route = get(() -> complete("This is a GET request."));

testRoute(route).run(HttpRequest.GET("/")).assertEntity(
    "This is a GET request.");
```

## Code Examples

### Example 1: Signature

```scala
def get: Directive0
```

### Example 2: Example

```scala
val route = get { complete("This is a GET request.") }

// tests:
Get("/") ~> route ~> check {
  responseAs[String] shouldEqual "This is a GET request."
}
```

### Example 3: Example

```java
final Route route = get(() -> complete("This is a GET request."));

testRoute(route).run(HttpRequest.GET("/")).assertEntity(
    "This is a GET request.");
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/MethodRejection.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/MethodRejection.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/method-directives/extractMethod.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/method-directives/head.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/rejections.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/method-directives/get.html](https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/method-directives/get.html)*