---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:57:55Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/method-directives/patch.html
title: patch • Akka HTTP
---

# patch • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# patch

Matches requests with HTTP method `PATCH`.

## Signature

```
def patch: Directive0
```

## Description

This directive filters the incoming request by its HTTP method. Only requests with method `PATCH` are passed on to the inner route. All others are rejected with a [`MethodRejection`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/MethodRejection.html "akka.http.javadsl.server.MethodRejection")[`MethodRejection`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/MethodRejection.html "akka.http.scaladsl.server.MethodRejection"), which is translated into a `405 Method Not Allowed` response by the default [RejectionHandler](../../rejections.html#the-rejectionhandler).

## Example

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/directives/MethodDirectivesExamplesSpec.scala#L60-L65 "Go to snippet source")val route = patch { complete("This is a PATCH request.") }

// tests:
Patch("/", "patch content") ~> route ~> check {
  responseAs[String] shouldEqual "This is a PATCH request."
}
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/directives/MethodDirectivesExamplesTest.java#L31-L111 "Go to snippet source")import static akka.http.javadsl.server.Directives.complete;
import static akka.http.javadsl.server.Directives.patch;

final Route route = patch(() -> complete("This is a PATCH request."));

testRoute(route).run(HttpRequest.PATCH("/").withEntity("patch content"))
    .assertEntity("This is a PATCH request.");
```

## Code Examples

### Example 1: Signature

```scala
def patch: Directive0
```

### Example 2: Example

```scala
val route = patch { complete("This is a PATCH request.") }

// tests:
Patch("/", "patch content") ~> route ~> check {
  responseAs[String] shouldEqual "This is a PATCH request."
}
```

### Example 3: Example

```java
import static akka.http.javadsl.server.Directives.complete;
import static akka.http.javadsl.server.Directives.patch;

final Route route = patch(() -> complete("This is a PATCH request."));

testRoute(route).run(HttpRequest.PATCH("/").withEntity("patch content"))
    .assertEntity("This is a PATCH request.");
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/MethodRejection.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/MethodRejection.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/method-directives/overrideMethodWithParameter.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/method-directives/post.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/rejections.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/method-directives/patch.html](https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/method-directives/patch.html)*