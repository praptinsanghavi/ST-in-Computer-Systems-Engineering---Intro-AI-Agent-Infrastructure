---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:58:05Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/misc-directives/requestEntityEmpty.html
title: requestEntityEmpty • Akka HTTP
---

# requestEntityEmpty • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# requestEntityEmpty

## Signature

```
def requestEntityEmpty: Directive0
```

## Description

A filter that checks if the request entity is empty and only then passes processing to the inner route. Otherwise, the request is rejected.

See also [requestEntityPresent](requestEntityPresent.html) for the opposite effect.

## Example

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/directives/MiscDirectivesExamplesSpec.scala#L55-L71 "Go to snippet source")val route =
  concat(
    requestEntityEmpty {
      complete("request entity empty")
    },
    requestEntityPresent {
      complete("request entity present")
    }
  )

// tests:
Post("/", "text") ~> Route.seal(route) ~> check {
  responseAs[String] shouldEqual "request entity present"
}
Post("/") ~> route ~> check {
  responseAs[String] shouldEqual "request entity empty"
}
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/directives/MiscDirectivesExamplesTest.java#L45-L177 "Go to snippet source")import static akka.http.javadsl.server.Directives.complete;
import static akka.http.javadsl.server.Directives.requestEntityEmpty;
import static akka.http.javadsl.server.Directives.requestEntityPresent;

final Route route = requestEntityEmpty(() ->
  complete("request entity empty")
).orElse(requestEntityPresent(() ->
  complete("request entity present")
));

// tests:
testRoute(route).run(HttpRequest.POST("/"))
  .assertEntity("request entity empty");
testRoute(route).run(HttpRequest.POST("/").withEntity("foo"))
  .assertEntity("request entity present");
```

## Code Examples

### Example 1: Signature

```scala
def requestEntityEmpty: Directive0
```

### Example 2: Example

```scala
val route =
  concat(
    requestEntityEmpty {
      complete("request entity empty")
    },
    requestEntityPresent {
      complete("request entity present")
    }
  )

// tests:
Post("/", "text") ~> Route.seal(route) ~> check {
  responseAs[String] shouldEqual "request entity present"
}
Post("/") ~> route ~> check {
  responseAs[String] shouldEqual "request entity empty"
}
```

### Example 3: Example

```java
import static akka.http.javadsl.server.Directives.complete;
import static akka.http.javadsl.server.Directives.requestEntityEmpty;
import static akka.http.javadsl.server.Directives.requestEntityPresent;

final Route route = requestEntityEmpty(() ->
  complete("request entity empty")
).orElse(requestEntityPresent(() ->
  complete("request entity present")
));

// tests:
testRoute(route).run(HttpRequest.POST("/"))
  .assertEntity("request entity empty");
testRoute(route).run(HttpRequest.POST("/").withEntity("foo"))
  .assertEntity("request entity present");
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/misc-directives/rejectEmptyResponse.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/misc-directives/requestEntityPresent.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/misc-directives/requestEntityEmpty.html](https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/misc-directives/requestEntityEmpty.html)*