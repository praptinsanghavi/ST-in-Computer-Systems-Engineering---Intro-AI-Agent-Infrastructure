---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:57:58Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/method-directives/post.html
title: post • Akka HTTP
---

# post • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# post

Matches requests with HTTP method `POST`.

## Signature

```
def post: Directive0
```

## Description

This directive filters the incoming request by its HTTP method. Only requests with method `POST` are passed on to the inner route. All others are rejected with a [`MethodRejection`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/MethodRejection.html "akka.http.javadsl.server.MethodRejection")[`MethodRejection`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/MethodRejection.html "akka.http.scaladsl.server.MethodRejection"), which is translated into a `405 Method Not Allowed` response by the default [RejectionHandler](../../rejections.html#the-rejectionhandler).

## Example

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/directives/MethodDirectivesExamplesSpec.scala#L71-L76 "Go to snippet source")val route = post { complete("This is a POST request.") }

// tests:
Post("/", "post content") ~> route ~> check {
  responseAs[String] shouldEqual "This is a POST request."
}
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/directives/MethodDirectivesExamplesTest.java#L36-L121 "Go to snippet source")import static akka.http.javadsl.server.Directives.complete;
import static akka.http.javadsl.server.Directives.post;

final Route route = post(() -> complete("This is a POST request."));

testRoute(route).run(HttpRequest.POST("/").withEntity("post content"))
    .assertEntity("This is a POST request.");
```

## Code Examples

### Example 1: Signature

```scala
def post: Directive0
```

### Example 2: Example

```scala
val route = post { complete("This is a POST request.") }

// tests:
Post("/", "post content") ~> route ~> check {
  responseAs[String] shouldEqual "This is a POST request."
}
```

### Example 3: Example

```java
import static akka.http.javadsl.server.Directives.complete;
import static akka.http.javadsl.server.Directives.post;

final Route route = post(() -> complete("This is a POST request."));

testRoute(route).run(HttpRequest.POST("/").withEntity("post content"))
    .assertEntity("This is a POST request.");
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/MethodRejection.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/MethodRejection.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/method-directives/patch.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/method-directives/put.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/rejections.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/method-directives/post.html](https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/method-directives/post.html)*