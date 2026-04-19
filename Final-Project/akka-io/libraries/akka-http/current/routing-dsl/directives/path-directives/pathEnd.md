---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:57:55Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/path-directives/pathEnd.html
title: pathEnd • Akka HTTP
---

# pathEnd • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# pathEnd

## Signature

```
def pathEnd: Directive0
```

## Description

Only passes the request to its inner route if the unmatched path of the [`RequestContext`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/RequestContext.html "akka.http.javadsl.server.RequestContext")[`RequestContext`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/RequestContext.html "akka.http.scaladsl.server.RequestContext") is empty, i.e. the request path has been fully matched by a higher\-level [path](path.html) or [pathPrefix](pathPrefix.html) directive.

This directive is a simple alias for `rawPathPrefix(PathEnd)` and is mostly used on an inner\-level to discriminate “path already fully matched” from other alternatives (see the example below). For a comparison between path directives check [Overview of path directives](index.html#overview-path).

## Example

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/directives/PathDirectivesExamplesSpec.scala#L109-L132 "Go to snippet source")val route =
  pathPrefix("foo") {
    concat(
      pathEnd {
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
  handled shouldEqual false
}

Get("/foo/bar") ~> route ~> check {
  responseAs[String] shouldEqual "/foo/bar"
}
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/directives/PathDirectivesExamplesTest.java#L203-L216 "Go to snippet source")final Route route =
    concat(
        pathPrefix("foo", () ->
            concat(
                pathEnd(() -> complete("/foo")),
                path("bar", () -> complete("/foo/bar"))
            )
        )
    );

// tests:
testRoute(route).run(HttpRequest.GET("/foo")).assertEntity("/foo");
testRoute(route).run(HttpRequest.GET("/foo/")).assertStatusCode(StatusCodes.NOT_FOUND);
testRoute(route).run(HttpRequest.GET("/foo/bar")).assertEntity("/foo/bar");
```

## Code Examples

### Example 1: Signature

```scala
def pathEnd: Directive0
```

### Example 2: Example

```scala
val route =
  pathPrefix("foo") {
    concat(
      pathEnd {
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
  handled shouldEqual false
}

Get("/foo/bar") ~> route ~> check {
  responseAs[String] shouldEqual "/foo/bar"
}
```

### Example 3: Example

```java
final Route route =
    concat(
        pathPrefix("foo", () ->
            concat(
                pathEnd(() -> complete("/foo")),
                path("bar", () -> complete("/foo/bar"))
            )
        )
    );

// tests:
testRoute(route).run(HttpRequest.GET("/foo")).assertEntity("/foo");
testRoute(route).run(HttpRequest.GET("/foo/")).assertStatusCode(StatusCodes.NOT_FOUND);
testRoute(route).run(HttpRequest.GET("/foo/bar")).assertEntity("/foo/bar");
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/RequestContext.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/RequestContext.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/path-directives/index.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/path-directives/path.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/path-directives/pathEndOrSingleSlash.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/path-directives/pathPrefix.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/path-directives/pathEnd.html](https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/path-directives/pathEnd.html)*