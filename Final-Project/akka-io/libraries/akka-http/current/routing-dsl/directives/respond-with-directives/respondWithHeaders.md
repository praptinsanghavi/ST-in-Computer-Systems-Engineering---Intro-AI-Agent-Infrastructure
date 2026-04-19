---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:58:09Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/respond-with-directives/respondWithHeaders.html
title: respondWithHeaders • Akka HTTP
---

# respondWithHeaders • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# respondWithHeaders

## Signature

```
def respondWithHeaders(responseHeaders: HttpHeader*): Directive0
def respondWithHeaders(firstHeader: HttpHeader, otherHeaders: HttpHeader*): Directive0
def respondWithHeaders(responseHeaders: immutable.Seq[HttpHeader]): Directive0
```

## Description

Adds the given HTTP headers to all responses coming back from its inner route.

This directive transforms [`HttpResponse`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpResponse.html "akka.http.javadsl.model.HttpResponse")[`HttpResponse`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpResponse.html "akka.http.scaladsl.model.HttpResponse") and `ChunkedResponseStart` messages coming back from its inner route by adding the given [`HttpHeader`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpHeader.html "akka.http.javadsl.model.HttpHeader")[`HttpHeader`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpHeader.html "akka.http.scaladsl.model.HttpHeader") instances to the headers list.

See also [respondWithHeader](respondWithHeader.html) if you’d like to add just a single header.

## Example

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/directives/RespondWithDirectivesExamplesSpec.scala#L82-L94 "Go to snippet source")val route =
  path("foo") {
    respondWithHeaders(RawHeader("Funky-Muppet", "gonzo"), Origin(HttpOrigin("http://akka.io"))) {
      complete("beep")
    }
  }

// tests:
Get("/foo") ~> route ~> check {
  header("Funky-Muppet") shouldEqual Some(RawHeader("Funky-Muppet", "gonzo"))
  header[Origin] shouldEqual Some(Origin(HttpOrigin("http://akka.io")))
  responseAs[String] shouldEqual "beep"
}
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/directives/RespondWithDirectivesExamplesTest.java#L38-L134 "Go to snippet source")import static akka.http.javadsl.server.Directives.complete;
import static akka.http.javadsl.server.Directives.path;
import static akka.http.javadsl.server.Directives.respondWithDefaultHeaders;
import static akka.http.javadsl.server.Directives.respondWithHeaders;

final HttpHeader gonzo = RawHeader.create("Funky-Muppet", "gonzo");
final HttpHeader akka = Origin.create(HttpOrigin.parse("http://akka.io"));

final Route route = path("foo", () ->
        respondWithHeaders(Arrays.asList(gonzo, akka), () ->
                complete("beep")
        )
);

testRoute(route).run(HttpRequest.GET("/foo"))
        .assertHeaderExists("Funky-Muppet", "gonzo")
        .assertHeaderExists("Origin", "http://akka.io")
        .assertEntity("beep");

```

## Code Examples

### Example 1: Signature

```scala
def respondWithHeaders(responseHeaders: HttpHeader*): Directive0
def respondWithHeaders(firstHeader: HttpHeader, otherHeaders: HttpHeader*): Directive0
def respondWithHeaders(responseHeaders: immutable.Seq[HttpHeader]): Directive0
```

### Example 2: Example

```scala
val route =
  path("foo") {
    respondWithHeaders(RawHeader("Funky-Muppet", "gonzo"), Origin(HttpOrigin("http://akka.io"))) {
      complete("beep")
    }
  }

// tests:
Get("/foo") ~> route ~> check {
  header("Funky-Muppet") shouldEqual Some(RawHeader("Funky-Muppet", "gonzo"))
  header[Origin] shouldEqual Some(Origin(HttpOrigin("http://akka.io")))
  responseAs[String] shouldEqual "beep"
}
```

### Example 3: Example

```java
import static akka.http.javadsl.server.Directives.complete;
import static akka.http.javadsl.server.Directives.path;
import static akka.http.javadsl.server.Directives.respondWithDefaultHeaders;
import static akka.http.javadsl.server.Directives.respondWithHeaders;

final HttpHeader gonzo = RawHeader.create("Funky-Muppet", "gonzo");
final HttpHeader akka = Origin.create(HttpOrigin.parse("http://akka.io"));

final Route route = path("foo", () ->
        respondWithHeaders(Arrays.asList(gonzo, akka), () ->
                complete("beep")
        )
);

testRoute(route).run(HttpRequest.GET("/foo"))
        .assertHeaderExists("Funky-Muppet", "gonzo")
        .assertHeaderExists("Origin", "http://akka.io")
        .assertEntity("beep");
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpHeader.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpResponse.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpHeader.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpResponse.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/respond-with-directives/respondWithHeader.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/route-directives/index.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/respond-with-directives/respondWithHeaders.html](https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/respond-with-directives/respondWithHeaders.html)*