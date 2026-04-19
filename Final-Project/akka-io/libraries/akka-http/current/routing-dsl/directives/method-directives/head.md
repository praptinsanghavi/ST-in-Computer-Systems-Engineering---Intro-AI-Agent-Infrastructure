---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:57:31Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/method-directives/head.html
title: head • Akka HTTP
---

# head • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# head

Matches requests with HTTP method `HEAD`.

## Signature

```
def head: Directive0
```

## Description

This directive filters the incoming request by its HTTP method. Only requests with method `HEAD` are passed on to the inner route. All others are rejected with a [`MethodRejection`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/MethodRejection.html "akka.http.javadsl.server.MethodRejection")[`MethodRejection`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/MethodRejection.html "akka.http.scaladsl.server.MethodRejection"), which is translated into a `405 Method Not Allowed` response by the default [RejectionHandler](../../rejections.html#the-rejectionhandler).

Note
Akka HTTP can handle HEAD requests transparently by dispatching a GET request to the handler and stripping off the result body. See the `akka.http.server.transparent-head-requests` setting for how to enable this behavior.

## Example

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/directives/MethodDirectivesExamplesSpec.scala#L38-L43 "Go to snippet source")val route = head { complete("This is a HEAD request.") }

// tests:
Head("/") ~> route ~> check {
  responseAs[String] shouldEqual "This is a HEAD request."
}
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/directives/MethodDirectivesExamplesTest.java#L21-L91 "Go to snippet source")import static akka.http.javadsl.server.Directives.complete;
import static akka.http.javadsl.server.Directives.head;

final Route route = head(() -> complete("This is a HEAD request."));

testRoute(route).run(HttpRequest.HEAD("/")).assertEntity(
    "This is a HEAD request.");
```

## Code Examples

### Example 1: Signature

```scala
def head: Directive0
```

### Example 2: Example

```scala
val route = head { complete("This is a HEAD request.") }

// tests:
Head("/") ~> route ~> check {
  responseAs[String] shouldEqual "This is a HEAD request."
}
```

### Example 3: Example

```java
import static akka.http.javadsl.server.Directives.complete;
import static akka.http.javadsl.server.Directives.head;

final Route route = head(() -> complete("This is a HEAD request."));

testRoute(route).run(HttpRequest.HEAD("/")).assertEntity(
    "This is a HEAD request.");
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/MethodRejection.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/MethodRejection.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/method-directives/get.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/method-directives/method.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/rejections.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/method-directives/head.html](https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/method-directives/head.html)*