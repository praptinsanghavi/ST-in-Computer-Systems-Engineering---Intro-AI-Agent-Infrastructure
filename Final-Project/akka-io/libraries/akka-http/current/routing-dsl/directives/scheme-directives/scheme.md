---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:58:11Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/scheme-directives/scheme.html
title: scheme • Akka HTTP
---

# scheme • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# scheme

## Signature

```
def scheme(name: String): Directive0
```

## Description

Rejects a request if its Uri scheme does not match a given one.

The `scheme` directive can be used to match requests by their Uri scheme, only passing through requests that match the specified scheme and rejecting all others.

A typical use case for the `scheme` directive would be to reject requests coming in over http instead of https, or to redirect such requests to the matching https URI with a `MovedPermanently`.

For simply extracting the scheme name, see the [extractScheme](extractScheme.html) directive.

## Example

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/directives/SchemeDirectivesExamplesSpec.scala#L26-L50 "Go to snippet source")import akka.http.scaladsl.model._
import akka.http.scaladsl.model.headers.Location
import StatusCodes.MovedPermanently

val route =
  concat(
    scheme("http") {
      extract(_.request.uri) { uri =>
        redirect(uri.copy(scheme = "https"), MovedPermanently)
      }
    },
    scheme("https") {
      complete(s"Safe and secure!")
    }
  )

// tests:
Get("http://www.example.com/hello") ~> route ~> check {
  status shouldEqual MovedPermanently
  header[Location] shouldEqual Some(Location(Uri("https://www.example.com/hello")))
}

Get("https://www.example.com/hello") ~> route ~> check {
  responseAs[String] shouldEqual "Safe and secure!"
}
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/directives/SchemeDirectivesExamplesTest.java#L21-L60 "Go to snippet source")import static akka.http.javadsl.server.Directives.complete;
import static akka.http.javadsl.server.Directives.extract;
import static akka.http.javadsl.server.Directives.redirect;
import static akka.http.javadsl.server.Directives.scheme;

final Route route = concat(
  scheme("http", ()->
    extract((ctx) -> ctx.getRequest().getUri(), (uri)->
      redirect(uri.scheme("https"), StatusCodes.MOVED_PERMANENTLY)
    )
  ),
  scheme("https", ()->
    complete("Safe and secure!")
  )
);

testRoute(route).run(HttpRequest.GET("http://www.example.com/hello"))
  .assertStatusCode(StatusCodes.MOVED_PERMANENTLY)
  .assertHeaderExists(Location.create("https://www.example.com/hello"))
;

testRoute(route).run(HttpRequest.GET("https://www.example.com/hello"))
  .assertEntity("Safe and secure!");
```

## Code Examples

### Example 1: Signature

```scala
def scheme(name: String): Directive0
```

### Example 2: Example

```scala
import akka.http.scaladsl.model._
import akka.http.scaladsl.model.headers.Location
import StatusCodes.MovedPermanently

val route =
  concat(
    scheme("http") {
      extract(_.request.uri) { uri =>
        redirect(uri.copy(scheme = "https"), MovedPermanently)
      }
    },
    scheme("https") {
      complete(s"Safe and secure!")
    }
  )

// tests:
Get("http://www.example.com/hello") ~> route ~> check {
  status shouldEqual MovedPermanently
  header[Location] shouldEqual Some(Location(Uri("https://www.example.com/hello")))
}

Get("https://www.example.com/hello") ~> route ~> check {
  responseAs[String] shouldEqual "Safe and secure!"
}
```

### Example 3: Example

```java
import static akka.http.javadsl.server.Directives.complete;
import static akka.http.javadsl.server.Directives.extract;
import static akka.http.javadsl.server.Directives.redirect;
import static akka.http.javadsl.server.Directives.scheme;

final Route route = concat(
  scheme("http", ()->
    extract((ctx) -> ctx.getRequest().getUri(), (uri)->
      redirect(uri.scheme("https"), StatusCodes.MOVED_PERMANENTLY)
    )
  ),
  scheme("https", ()->
    complete("Safe and secure!")
  )
);

testRoute(route).run(HttpRequest.GET("http://www.example.com/hello"))
  .assertStatusCode(StatusCodes.MOVED_PERMANENTLY)
  .assertHeaderExists(Location.create("https://www.example.com/hello"))
;

testRoute(route).run(HttpRequest.GET("https://www.example.com/hello"))
  .assertEntity("Safe and secure!");
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/scheme-directives/extractScheme.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/security-directives/index.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/scheme-directives/scheme.html](https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/scheme-directives/scheme.html)*