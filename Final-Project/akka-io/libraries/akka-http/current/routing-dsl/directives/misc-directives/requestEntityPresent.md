---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:58:04Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/misc-directives/requestEntityPresent.html
title: requestEntityPresent • Akka HTTP
---

# requestEntityPresent • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# requestEntityPresent

## Signature

```
def requestEntityPresent: Directive0
```

## Description

A simple filter that checks if the request entity is present and only then passes processing to the inner route. Otherwise, the request is rejected with [`RequestEntityExpectedRejection`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/RequestEntityExpectedRejection.html "akka.http.javadsl.server.RequestEntityExpectedRejection")[`RequestEntityExpectedRejection`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/RequestEntityExpectedRejection$.html "akka.http.scaladsl.server.RequestEntityExpectedRejection").

See also [requestEntityEmpty](requestEntityEmpty.html) for the opposite effect.

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
def requestEntityPresent: Directive0
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
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/RequestEntityExpectedRejection$.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/RequestEntityExpectedRejection.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/misc-directives/requestEntityEmpty.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/misc-directives/selectPreferredLanguage.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/misc-directives/requestEntityPresent.html](https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/misc-directives/requestEntityPresent.html)*