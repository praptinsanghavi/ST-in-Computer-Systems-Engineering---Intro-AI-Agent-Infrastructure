---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:57:57Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/path-directives/pathEndOrSingleSlash.html
title: pathEndOrSingleSlash • Akka HTTP
---

# pathEndOrSingleSlash • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# pathEndOrSingleSlash

## Signature

```
def pathEndOrSingleSlash: Directive0
```

## Description

Only passes the request to its inner route if the unmatched path of the [`RequestContext`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/RequestContext.html "akka.http.javadsl.server.RequestContext")[`RequestContext`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/RequestContext.html "akka.http.scaladsl.server.RequestContext") is either empty or contains only one single slash.

This directive is a simple alias for `rawPathPrefix(Slash.? ~ PathEnd)` and is mostly used on an inner\-level to discriminate “path already fully matched” from other alternatives (see the example below). For a comparison between path directives check [Overview of path directives](index.html#overview-path).

It is equivalent to `pathEnd | pathSingleSlash` but slightly more efficient.

## Example

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/directives/PathDirectivesExamplesSpec.scala#L138-L161 "Go to snippet source")val route =
  pathPrefix("foo") {
    concat(
      pathEndOrSingleSlash {
        complete("/foo")
      },
      path("bar") {
        complete("/foo/bar")
      }
    )
  }

// tests:
Get("/foo") ~> route ~> check {
  responseAs[String] shouldEqual "/foo"
}

Get("/foo/") ~> route ~> check {
  responseAs[String] shouldEqual "/foo"
}

Get("/foo/bar") ~> route ~> check {
  responseAs[String] shouldEqual "/foo/bar"
}
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/directives/PathDirectivesExamplesTest.java#L56-L235 "Go to snippet source")import static akka.http.javadsl.server.Directives.complete;
import static akka.http.javadsl.server.Directives.path;
import static akka.http.javadsl.server.Directives.pathEndOrSingleSlash;
final Route route =
    concat(
        pathPrefix("foo", () ->
            concat(
                pathEndOrSingleSlash(() -> complete("/foo")),
                path("bar", () -> complete("/foo/bar"))
            )
        )
    );
// tests:
testRoute(route).run(HttpRequest.GET("/foo")).assertEntity("/foo");
testRoute(route).run(HttpRequest.GET("/foo/")).assertEntity("/foo");
testRoute(route).run(HttpRequest.GET("/foo/bar")).assertEntity("/foo/bar");
```

## Code Examples

### Example 1: Signature

```scala
def pathEndOrSingleSlash: Directive0
```

### Example 2: Example

```scala
val route =
  pathPrefix("foo") {
    concat(
      pathEndOrSingleSlash {
        complete("/foo")
      },
      path("bar") {
        complete("/foo/bar")
      }
    )
  }

// tests:
Get("/foo") ~> route ~> check {
  responseAs[String] shouldEqual "/foo"
}

Get("/foo/") ~> route ~> check {
  responseAs[String] shouldEqual "/foo"
}

Get("/foo/bar") ~> route ~> check {
  responseAs[String] shouldEqual "/foo/bar"
}
```

### Example 3: Example

```java
import static akka.http.javadsl.server.Directives.complete;
import static akka.http.javadsl.server.Directives.path;
import static akka.http.javadsl.server.Directives.pathEndOrSingleSlash;
final Route route =
    concat(
        pathPrefix("foo", () ->
            concat(
                pathEndOrSingleSlash(() -> complete("/foo")),
                path("bar", () -> complete("/foo/bar"))
            )
        )
    );
// tests:
testRoute(route).run(HttpRequest.GET("/foo")).assertEntity("/foo");
testRoute(route).run(HttpRequest.GET("/foo/")).assertEntity("/foo");
testRoute(route).run(HttpRequest.GET("/foo/bar")).assertEntity("/foo/bar");
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/RequestContext.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/RequestContext.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/path-directives/index.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/path-directives/pathEnd.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/path-directives/pathPrefix.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/path-directives/pathEndOrSingleSlash.html](https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/path-directives/pathEndOrSingleSlash.html)*