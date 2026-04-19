---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:57:56Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/path-directives/pathSingleSlash.html
title: pathSingleSlash • Akka HTTP
---

# pathSingleSlash • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# pathSingleSlash

## Signature

```
def pathSingleSlash: Directive0
```

## Description

Only passes the request to its inner route if the unmatched path of the [`RequestContext`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/RequestContext.html "akka.http.javadsl.server.RequestContext")[`RequestContext`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/RequestContext.html "akka.http.scaladsl.server.RequestContext") contains exactly one single slash.

This directive is a simple alias for `pathPrefix(PathEnd)` and is mostly used for matching requests to the root URI (`/`) on an inner\-level to discriminate “all path segments matched” from other alternatives (see the example below). For a comparison between path directives check [Overview of path directives](index.html#overview-path).

## Example

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/directives/PathDirectivesExamplesSpec.scala#L217-L249 "Go to snippet source")val route =
  concat(
    pathSingleSlash {
      complete("root")
    },
    pathPrefix("ball") {
      concat(
        pathSingleSlash {
          complete("/ball/")
        },
        path(IntNumber) { int =>
          complete(if (int % 2 == 0) "even ball" else "odd ball")
        }
      )
    }
  )

// tests:
Get("/") ~> route ~> check {
  responseAs[String] shouldEqual "root"
}

Get("/ball") ~> route ~> check {
  handled shouldEqual false
}

Get("/ball/") ~> route ~> check {
  responseAs[String] shouldEqual "/ball/"
}

Get("/ball/1337") ~> route ~> check {
  responseAs[String] shouldEqual "odd ball"
}
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/directives/PathDirectivesExamplesTest.java#L72-L294 "Go to snippet source")import static akka.http.javadsl.server.Directives.complete;
import static akka.http.javadsl.server.Directives.path;
import static akka.http.javadsl.server.Directives.pathPrefix;
import static akka.http.javadsl.server.Directives.pathSingleSlash;
final Route route =
    concat(
        pathSingleSlash(() -> complete("root")),
        pathPrefix("ball", () ->
            concat(
                pathSingleSlash(() -> complete("/ball/")),
                path(integerSegment(), (i) -> complete((i % 2 == 0) ? "even ball" : "odd ball"))
            )
        )
    );
// tests:
testRoute(route).run(HttpRequest.GET("/")).assertEntity("root");
testRoute(route).run(HttpRequest.GET("/ball")).assertStatusCode(StatusCodes.NOT_FOUND);
testRoute(route).run(HttpRequest.GET("/ball/")).assertEntity("/ball/");
testRoute(route).run(HttpRequest.GET("/ball/1337")).assertEntity("odd ball");
```

## Code Examples

### Example 1: Signature

```scala
def pathSingleSlash: Directive0
```

### Example 2: Example

```scala
val route =
  concat(
    pathSingleSlash {
      complete("root")
    },
    pathPrefix("ball") {
      concat(
        pathSingleSlash {
          complete("/ball/")
        },
        path(IntNumber) { int =>
          complete(if (int % 2 == 0) "even ball" else "odd ball")
        }
      )
    }
  )

// tests:
Get("/") ~> route ~> check {
  responseAs[String] shouldEqual "root"
}

Get("/ball") ~> route ~> check {
  handled shouldEqual false
}

Get("/ball/") ~> route ~> check {
  responseAs[String] shouldEqual "/ball/"
}

Get("/ball/1337") ~> route ~> check {
  responseAs[String] shouldEqual "odd ball"
}
```

### Example 3: Example

```java
import static akka.http.javadsl.server.Directives.complete;
import static akka.http.javadsl.server.Directives.path;
import static akka.http.javadsl.server.Directives.pathPrefix;
import static akka.http.javadsl.server.Directives.pathSingleSlash;
final Route route =
    concat(
        pathSingleSlash(() -> complete("root")),
        pathPrefix("ball", () ->
            concat(
                pathSingleSlash(() -> complete("/ball/")),
                path(integerSegment(), (i) -> complete((i % 2 == 0) ? "even ball" : "odd ball"))
            )
        )
    );
// tests:
testRoute(route).run(HttpRequest.GET("/")).assertEntity("root");
testRoute(route).run(HttpRequest.GET("/ball")).assertStatusCode(StatusCodes.NOT_FOUND);
testRoute(route).run(HttpRequest.GET("/ball/")).assertEntity("/ball/");
testRoute(route).run(HttpRequest.GET("/ball/1337")).assertEntity("odd ball");
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/RequestContext.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/RequestContext.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/path-directives/index.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/path-directives/pathPrefixTest.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/path-directives/pathSuffix.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/path-directives/pathSingleSlash.html](https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/path-directives/pathSingleSlash.html)*