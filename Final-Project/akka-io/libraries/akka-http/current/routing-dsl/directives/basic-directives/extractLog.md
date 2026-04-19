---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:56:57Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/extractLog.html
title: extractLog • Akka HTTP
---

# extractLog • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# extractLog

## Signature

```
def extractLog: Directive1[LoggingAdapter]
```

## Description

Extracts a [`LoggingAdapter`](https://doc.akka.io/api/akka/2.10/akka/event/LoggingAdapter.html "akka.event.LoggingAdapter")[`LoggingAdapter`](https://doc.akka.io/japi/akka/2.10/akka/event/LoggingAdapter.html "akka.event.LoggingAdapter") from the request context which can be used for logging inside the route.

The `extractLog` directive is used for providing logging to routes, such that they don’t have to depend on closing over a logger provided in the class body.

See [extract](extract.html) and [Providing Values to Inner Routes](index.html#providedirectives) for an overview of similar directives.

## Example

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/directives/BasicDirectivesExamplesSpec.scala#L39-L48 "Go to snippet source")val route =
  extractLog { log =>
    log.debug("I'm logging things in much detail..!")
    complete("It's amazing!")
  }

// tests:
Get("/abcdef") ~> route ~> check {
  responseAs[String] shouldEqual "It's amazing!"
}
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/directives/BasicDirectivesExamplesTest.java#L64-L286 "Go to snippet source")import static akka.http.javadsl.server.Directives.extractLog;

final Route route = extractLog(log -> {
  log.debug("I'm logging things in much detail..!");
  return complete("It's amazing!");
});

// tests:
testRoute(route).run(HttpRequest.GET("/abcdef"))
  .assertEntity("It's amazing!");
```

## Code Examples

### Example 1: Signature

```scala
def extractLog: Directive1[LoggingAdapter]
```

### Example 2: Example

```scala
val route =
  extractLog { log =>
    log.debug("I'm logging things in much detail..!")
    complete("It's amazing!")
  }

// tests:
Get("/abcdef") ~> route ~> check {
  responseAs[String] shouldEqual "It's amazing!"
}
```

### Example 3: Example

```java
import static akka.http.javadsl.server.Directives.extractLog;

final Route route = extractLog(log -> {
  log.debug("I'm logging things in much detail..!");
  return complete("It's amazing!");
});

// tests:
testRoute(route).run(HttpRequest.GET("/abcdef"))
  .assertEntity("It's amazing!");
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka/2.10/akka/event/LoggingAdapter.html
- https://doc.akka.io/japi/akka/2.10/akka/event/LoggingAdapter.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/extract.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/extractExecutionContext.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/extractMatchedPath.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/index.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/extractLog.html](https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/extractLog.html)*