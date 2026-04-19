---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:56:30Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/method-directives/delete.html
title: delete • Akka HTTP
---

# delete • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# delete

Matches requests with HTTP method `DELETE`.

## Signature

```
def delete: Directive0
```

## Description

This directive filters an incoming request by its HTTP method. Only requests with method `DELETE` are passed on to the inner route. All others are rejected with a [`MethodRejection`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/MethodRejection.html "akka.http.javadsl.server.MethodRejection")[`MethodRejection`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/MethodRejection.html "akka.http.scaladsl.server.MethodRejection"), which is translated into a `405 Method Not Allowed` response by the default [RejectionHandler](../../rejections.html#the-rejectionhandler).

## Example

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/directives/MethodDirectivesExamplesSpec.scala#L16-L21 "Go to snippet source")val route = delete { complete("This is a DELETE request.") }

// tests:
Delete("/") ~> route ~> check {
  responseAs[String] shouldEqual "This is a DELETE request."
}
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/directives/MethodDirectivesExamplesTest.java#L16-L71 "Go to snippet source")import static akka.http.javadsl.server.Directives.complete;
import static akka.http.javadsl.server.Directives.delete;

final Route route = delete(() -> complete("This is a DELETE request."));

testRoute(route).run(HttpRequest.DELETE("/")).assertEntity(
    "This is a DELETE request.");
```

## Code Examples

### Example 1: Signature

```scala
def delete: Directive0
```

### Example 2: Example

```scala
val route = delete { complete("This is a DELETE request.") }

// tests:
Delete("/") ~> route ~> check {
  responseAs[String] shouldEqual "This is a DELETE request."
}
```

### Example 3: Example

```java
import static akka.http.javadsl.server.Directives.complete;
import static akka.http.javadsl.server.Directives.delete;

final Route route = delete(() -> complete("This is a DELETE request."));

testRoute(route).run(HttpRequest.DELETE("/")).assertEntity(
    "This is a DELETE request.");
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/MethodRejection.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/MethodRejection.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/method-directives/extractMethod.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/method-directives/index.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/rejections.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/method-directives/delete.html](https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/method-directives/delete.html)*