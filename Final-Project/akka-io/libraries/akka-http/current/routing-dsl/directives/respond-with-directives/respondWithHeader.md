---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:58:09Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/respond-with-directives/respondWithHeader.html
title: respondWithHeader • Akka HTTP
---

# respondWithHeader • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# respondWithHeader

## Signature

```
def respondWithHeader(responseHeader: HttpHeader): Directive0
```

## Description

Adds a given HTTP header to all responses coming back from its inner route.

This directive transforms [`HttpResponse`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpResponse.html "akka.http.javadsl.model.HttpResponse")[`HttpResponse`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpResponse.html "akka.http.scaladsl.model.HttpResponse") and `ChunkedResponseStart` messages coming back from its inner route by adding the given [`HttpHeader`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpHeader.html "akka.http.javadsl.model.HttpHeader")[`HttpHeader`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpHeader.html "akka.http.scaladsl.model.HttpHeader") instance to the headers list.

See also [respondWithHeaders](respondWithHeaders.html) if you’d like to add more than one header.

## Example

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/directives/RespondWithDirectivesExamplesSpec.scala#L23-L34 "Go to snippet source")val route =
  path("foo") {
    respondWithHeader(RawHeader("Funky-Muppet", "gonzo")) {
      complete("beep")
    }
  }

// tests:
Get("/foo") ~> route ~> check {
  header("Funky-Muppet") shouldEqual Some(RawHeader("Funky-Muppet", "gonzo"))
  responseAs[String] shouldEqual "beep"
}
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/directives/RespondWithDirectivesExamplesTest.java#L25-L74 "Go to snippet source")import static akka.http.javadsl.server.Directives.complete;
import static akka.http.javadsl.server.Directives.path;
import static akka.http.javadsl.server.Directives.respondWithDefaultHeader;

final Route route = path("foo", () ->
        respondWithHeader(RawHeader.create("Funky-Muppet", "gonzo"), () ->
                complete("beep")));

testRoute(route).run(HttpRequest.GET("/foo"))
        .assertHeaderExists("Funky-Muppet", "gonzo")
        .assertEntity("beep");
```

## Code Examples

### Example 1: Signature

```scala
def respondWithHeader(responseHeader: HttpHeader): Directive0
```

### Example 2: Example

```scala
val route =
  path("foo") {
    respondWithHeader(RawHeader("Funky-Muppet", "gonzo")) {
      complete("beep")
    }
  }

// tests:
Get("/foo") ~> route ~> check {
  header("Funky-Muppet") shouldEqual Some(RawHeader("Funky-Muppet", "gonzo"))
  responseAs[String] shouldEqual "beep"
}
```

### Example 3: Example

```java
import static akka.http.javadsl.server.Directives.complete;
import static akka.http.javadsl.server.Directives.path;
import static akka.http.javadsl.server.Directives.respondWithDefaultHeader;

final Route route = path("foo", () ->
        respondWithHeader(RawHeader.create("Funky-Muppet", "gonzo"), () ->
                complete("beep")));

testRoute(route).run(HttpRequest.GET("/foo"))
        .assertHeaderExists("Funky-Muppet", "gonzo")
        .assertEntity("beep");
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpHeader.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpResponse.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpHeader.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpResponse.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/respond-with-directives/respondWithDefaultHeaders.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/respond-with-directives/respondWithHeaders.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/respond-with-directives/respondWithHeader.html](https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/respond-with-directives/respondWithHeader.html)*