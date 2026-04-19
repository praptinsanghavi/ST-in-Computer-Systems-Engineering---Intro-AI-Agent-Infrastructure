---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:56:23Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/cancelRejections.html
title: cancelRejections • Akka HTTP
---

# cancelRejections • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# cancelRejections

## Signature

```
def cancelRejections(classes: Class[_]*): Directive0
def cancelRejections(cancelFilter: Rejection => Boolean): Directive0
```

## Description

Adds a [`TransformationRejection`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/TransformationRejection.html "akka.http.javadsl.server.TransformationRejection")[`TransformationRejection`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/TransformationRejection.html "akka.http.scaladsl.server.TransformationRejection") cancelling all rejections created by the inner route for which the condition argument function returns `true`.

See also [cancelRejection](cancelRejection.html), for canceling a specific rejection.

Read [Rejections](../../rejections.html) to learn more about rejections.

For more advanced handling of rejections refer to the [handleRejections](../execution-directives/handleRejections.html) directive which provides a nicer DSL for building rejection handlers.

## Example

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/directives/BasicDirectivesExamplesSpec.scala#L630-L646 "Go to snippet source")def isMethodRejection: Rejection => Boolean = {
  case MethodRejection(_) => true
  case _                  => false
}

val route =
  cancelRejections(isMethodRejection) {
    post {
      complete("Result")
    }
  }

// tests:
Get("/") ~> route ~> check {
  rejections shouldEqual Nil
  handled shouldEqual false
}
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/directives/BasicDirectivesExamplesTest.java#L124-L847 "Go to snippet source")import static akka.http.javadsl.server.Directives.cancelRejections;

final Predicate<Rejection> isMethodRejection = p -> p instanceof MethodRejection;
final Route route = cancelRejections(
  isMethodRejection, () -> post(() -> complete("Result"))
);

// tests:
runRouteUnSealed(route, HttpRequest.GET("/"))
  .assertRejections();
```

## Code Examples

### Example 1: Signature

```scala
def cancelRejections(classes: Class[_]*): Directive0
def cancelRejections(cancelFilter: Rejection => Boolean): Directive0
```

### Example 2: Example

```scala
def isMethodRejection: Rejection => Boolean = {
  case MethodRejection(_) => true
  case _                  => false
}

val route =
  cancelRejections(isMethodRejection) {
    post {
      complete("Result")
    }
  }

// tests:
Get("/") ~> route ~> check {
  rejections shouldEqual Nil
  handled shouldEqual false
}
```

### Example 3: Example

```java
import static akka.http.javadsl.server.Directives.cancelRejections;

final Predicate<Rejection> isMethodRejection = p -> p instanceof MethodRejection;
final Route route = cancelRejections(
  isMethodRejection, () -> post(() -> complete("Result"))
);

// tests:
runRouteUnSealed(route, HttpRequest.GET("/"))
  .assertRejections();
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/TransformationRejection.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/TransformationRejection.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/cancelRejection.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/extract.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/execution-directives/handleRejections.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/rejections.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/cancelRejections.html](https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/cancelRejections.html)*