---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:56:20Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/cancelRejection.html
title: cancelRejection • Akka HTTP
---

# cancelRejection • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# cancelRejection

## Signature

```
def cancelRejection(rejection: Rejection): Directive0
```

## Description

Adds a [`TransformationRejection`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/TransformationRejection.html "akka.http.javadsl.server.TransformationRejection")[`TransformationRejection`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/TransformationRejection.html "akka.http.scaladsl.server.TransformationRejection") cancelling all rejections equal to the given one to the rejections potentially coming back from the inner route.

Read [Rejections](../../rejections.html) to learn more about rejections.

For more advanced handling of rejections refer to the [handleRejections](../execution-directives/handleRejections.html) directive which provides a nicer DSL for building rejection handlers.

## Example

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/directives/BasicDirectivesExamplesSpec.scala#L651-L662 "Go to snippet source")val route =
  cancelRejection(MethodRejection(HttpMethods.POST)) {
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
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/directives/BasicDirectivesExamplesTest.java#L128-L861 "Go to snippet source")import static akka.http.javadsl.server.Directives.cancelRejection;

final Route route = cancelRejection(Rejections.method(HttpMethods.POST), () ->
  post(() ->  complete("Result"))
);

// tests:
runRouteUnSealed(route, HttpRequest.GET("/"))
  .assertRejections();
```

## Code Examples

### Example 1: Signature

```scala
def cancelRejection(rejection: Rejection): Directive0
```

### Example 2: Example

```scala
val route =
  cancelRejection(MethodRejection(HttpMethods.POST)) {
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
import static akka.http.javadsl.server.Directives.cancelRejection;

final Route route = cancelRejection(Rejections.method(HttpMethods.POST), () ->
  post(() ->  complete("Result"))
);

// tests:
runRouteUnSealed(route, HttpRequest.GET("/"))
  .assertRejections();
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/TransformationRejection.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/TransformationRejection.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/cancelRejections.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/index.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/execution-directives/handleRejections.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/rejections.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/cancelRejection.html](https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/cancelRejection.html)*