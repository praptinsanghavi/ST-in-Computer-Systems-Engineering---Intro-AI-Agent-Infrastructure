---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:57:51Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/method-directives/options.html
title: options • Akka HTTP
---

# options • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# options

Matches requests with HTTP method `OPTIONS`.

## Signature

```
def options: Directive0
```

## Description

This directive filters the incoming request by its HTTP method. Only requests with method `OPTIONS` are passed on to the inner route. All others are rejected with a [`MethodRejection`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/MethodRejection.html "akka.http.javadsl.server.MethodRejection")[`MethodRejection`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/MethodRejection.html "akka.http.scaladsl.server.MethodRejection"), which is translated into a `405 Method Not Allowed` response by the default [RejectionHandler](../../rejections.html#the-rejectionhandler).

## Example

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/directives/MethodDirectivesExamplesSpec.scala#L49-L54 "Go to snippet source")val route = options { complete("This is an OPTIONS request.") }

// tests:
Options("/") ~> route ~> check {
  responseAs[String] shouldEqual "This is an OPTIONS request."
}
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/directives/MethodDirectivesExamplesTest.java#L26-L101 "Go to snippet source")import static akka.http.javadsl.server.Directives.complete;
import static akka.http.javadsl.server.Directives.options;

final Route route = options(() -> complete("This is a OPTIONS request."));

testRoute(route).run(HttpRequest.OPTIONS("/")).assertEntity(
    "This is a OPTIONS request.");
```

## Code Examples

### Example 1: Signature

```scala
def options: Directive0
```

### Example 2: Example

```scala
val route = options { complete("This is an OPTIONS request.") }

// tests:
Options("/") ~> route ~> check {
  responseAs[String] shouldEqual "This is an OPTIONS request."
}
```

### Example 3: Example

```java
import static akka.http.javadsl.server.Directives.complete;
import static akka.http.javadsl.server.Directives.options;

final Route route = options(() -> complete("This is a OPTIONS request."));

testRoute(route).run(HttpRequest.OPTIONS("/")).assertEntity(
    "This is a OPTIONS request.");
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/MethodRejection.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/MethodRejection.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/method-directives/method.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/method-directives/overrideMethodWithParameter.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/rejections.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/method-directives/options.html](https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/method-directives/options.html)*