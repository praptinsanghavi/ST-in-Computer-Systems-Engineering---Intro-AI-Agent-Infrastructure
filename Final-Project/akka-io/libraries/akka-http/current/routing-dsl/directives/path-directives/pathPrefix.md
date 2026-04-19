---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:57:57Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/path-directives/pathPrefix.html
title: pathPrefix • Akka HTTP
---

# pathPrefix • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# pathPrefix

## Signature

```
def pathPrefix[L](pm: PathMatcher[L]): Directive[L]
```

## Description

Matches and consumes a prefix of the unmatched path of the [`RequestContext`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/RequestContext.html "akka.http.javadsl.server.RequestContext")[`RequestContext`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/RequestContext.html "akka.http.scaladsl.server.RequestContext") against the given `PathMatcher`, potentially extracts one or more values (depending on the type of the argument).

This directive filters incoming requests based on the part of their URI that hasn’t been matched yet by other potentially existing `pathPrefix` or [rawPathPrefix](rawPathPrefix.html) directives on higher levels of the routing structure. Its one parameter is usually an expression evaluating to a `PathMatcher` instance (see also: [The PathMatcher DSL](../../path-matchers.html)).

As opposed to its [rawPathPrefix](rawPathPrefix.html) counterpart `pathPrefix` automatically adds a leading slash to its `PathMatcher` argument, you therefore don’t have to start your matching expression with an explicit slash. For a comparison between path directives check [Overview of path directives](index.html#overview-path).

Depending on the type of its `PathMatcher` argument the `pathPrefix` directive extracts zero or more values from the URI. If the match fails the request is rejected with an [empty rejection set](../../rejections.html#empty-rejections).

Note
The empty string (also called empty word or identity) is a **neutral element** of string concatenation operation, so it will match everything and consume nothing. The [path](path.html) provides more strict behaviour.

## Example

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/directives/PathDirectivesExamplesSpec.scala#L167-L190 "Go to snippet source")val route =
  pathPrefix("ball") {
    concat(
      pathEnd {
        complete("/ball")
      },
      path(IntNumber) { int =>
        complete(if (int % 2 == 0) "even ball" else "odd ball")
      }
    )
  }

// tests:
Get("/") ~> route ~> check {
  handled shouldEqual false
}

Get("/ball") ~> route ~> check {
  responseAs[String] shouldEqual "/ball"
}

Get("/ball/1337") ~> route ~> check {
  responseAs[String] shouldEqual "odd ball"
}
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/directives/PathDirectivesExamplesTest.java#L61-L255 "Go to snippet source")import static akka.http.javadsl.server.Directives.path;
import static akka.http.javadsl.server.Directives.pathEnd;
import static akka.http.javadsl.server.Directives.pathPrefix;
final Route route =
    concat(
        pathPrefix("ball", () ->
            concat(
                pathEnd(() -> complete("/ball")),
                path(integerSegment(), (i) ->
                    complete((i % 2 == 0) ? "even ball" : "odd ball"))
            )
        )
    );
// tests:
testRoute(route).run(HttpRequest.GET("/")).assertStatusCode(StatusCodes.NOT_FOUND);
testRoute(route).run(HttpRequest.GET("/ball")).assertEntity("/ball");
testRoute(route).run(HttpRequest.GET("/ball/1337")).assertEntity("odd ball");
```

## Code Examples

### Example 1: Signature

```scala
def pathPrefix[L](pm: PathMatcher[L]): Directive[L]
```

### Example 2: Example

```scala
val route =
  pathPrefix("ball") {
    concat(
      pathEnd {
        complete("/ball")
      },
      path(IntNumber) { int =>
        complete(if (int % 2 == 0) "even ball" else "odd ball")
      }
    )
  }

// tests:
Get("/") ~> route ~> check {
  handled shouldEqual false
}

Get("/ball") ~> route ~> check {
  responseAs[String] shouldEqual "/ball"
}

Get("/ball/1337") ~> route ~> check {
  responseAs[String] shouldEqual "odd ball"
}
```

### Example 3: Example

```java
import static akka.http.javadsl.server.Directives.path;
import static akka.http.javadsl.server.Directives.pathEnd;
import static akka.http.javadsl.server.Directives.pathPrefix;
final Route route =
    concat(
        pathPrefix("ball", () ->
            concat(
                pathEnd(() -> complete("/ball")),
                path(integerSegment(), (i) ->
                    complete((i % 2 == 0) ? "even ball" : "odd ball"))
            )
        )
    );
// tests:
testRoute(route).run(HttpRequest.GET("/")).assertStatusCode(StatusCodes.NOT_FOUND);
testRoute(route).run(HttpRequest.GET("/ball")).assertEntity("/ball");
testRoute(route).run(HttpRequest.GET("/ball/1337")).assertEntity("odd ball");
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/RequestContext.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/RequestContext.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/path-directives/index.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/path-directives/path.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/path-directives/pathEndOrSingleSlash.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/path-directives/pathPrefixTest.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/path-directives/rawPathPrefix.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/path-matchers.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/rejections.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/path-directives/pathPrefix.html](https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/path-directives/pathPrefix.html)*