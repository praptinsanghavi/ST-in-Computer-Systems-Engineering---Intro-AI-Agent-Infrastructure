---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:57:58Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/path-directives/pathSuffix.html
title: pathSuffix • Akka HTTP
---

# pathSuffix • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# pathSuffix

## Signature

```
def pathSuffix[L](pm: PathMatcher[L]): Directive[L]
```

## Description

Matches and consumes a suffix of the unmatched path of the [`RequestContext`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/RequestContext.html "akka.http.javadsl.server.RequestContext")[`RequestContext`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/RequestContext.html "akka.http.scaladsl.server.RequestContext") against the given `PathMatcher`, potentially extracts one or more values (depending on the type of the argument).

This directive filters incoming requests based on the part of their URI that hasn’t been matched yet by other potentially existing path matching directives on higher levels of the routing structure. Its one parameter is usually an expression evaluating to a `PathMatcher` instance (see also: [The PathMatcher DSL](../../path-matchers.html)).

As opposed to [pathPrefix](pathPrefix.html) this directive matches and consumes the unmatched path from the right, i.e. the end.

Caution
For efficiency reasons, the given `PathMatcher` must match the desired suffix in reversed\-segment order, i.e. `pathSuffix("baz" / "bar")` would match `/foo/bar/baz`! The order within a segment match is not reversed.

Depending on the type of its `PathMatcher` argument the `pathPrefix` directive extracts zero or more values from the URI. If the match fails the request is rejected with an [empty rejection set](../../rejections.html#empty-rejections).

## Example

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/directives/PathDirectivesExamplesSpec.scala#L59-L63 "Go to snippet source")val completeWithUnmatchedPath =
  extractUnmatchedPath { p =>
    complete(p.toString)
  }

val route =
  pathPrefix("start") {
    concat(
      pathSuffix("end") {
        completeWithUnmatchedPath
      },
      pathSuffix("foo" / "bar" ~ "baz") {
        completeWithUnmatchedPath
      }
    )
  }

// tests:
Get("/start/middle/end") ~> route ~> check {
  responseAs[String] shouldEqual "/middle/"
}

Get("/start/something/barbaz/foo") ~> route ~> check {
  responseAs[String] shouldEqual "/something/"
}
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/directives/PathDirectivesExamplesTest.java#L78-L313 "Go to snippet source")import static akka.http.javadsl.server.Directives.pathPrefix;
import static akka.http.javadsl.server.Directives.pathSuffix;
final Route route =
    concat(
        pathPrefix("start", () ->
            concat(
                pathSuffix("end", () -> completeWithUnmatchedPath.get()),
                pathSuffix(segment("foo").slash("bar").concat("baz"), () ->
                    completeWithUnmatchedPath.get())
            )
        )
    );
// tests:
testRoute(route).run(HttpRequest.GET("/start/middle/end")).assertEntity("/middle/");
testRoute(route).run(HttpRequest.GET("/start/something/barbaz/foo")).assertEntity("/something/");
```

## Code Examples

### Example 1: Signature

```scala
def pathSuffix[L](pm: PathMatcher[L]): Directive[L]
```

### Example 2: Example

```scala
val completeWithUnmatchedPath =
  extractUnmatchedPath { p =>
    complete(p.toString)
  }

val route =
  pathPrefix("start") {
    concat(
      pathSuffix("end") {
        completeWithUnmatchedPath
      },
      pathSuffix("foo" / "bar" ~ "baz") {
        completeWithUnmatchedPath
      }
    )
  }

// tests:
Get("/start/middle/end") ~> route ~> check {
  responseAs[String] shouldEqual "/middle/"
}

Get("/start/something/barbaz/foo") ~> route ~> check {
  responseAs[String] shouldEqual "/something/"
}
```

### Example 3: Example

```java
import static akka.http.javadsl.server.Directives.pathPrefix;
import static akka.http.javadsl.server.Directives.pathSuffix;
final Route route =
    concat(
        pathPrefix("start", () ->
            concat(
                pathSuffix("end", () -> completeWithUnmatchedPath.get()),
                pathSuffix(segment("foo").slash("bar").concat("baz"), () ->
                    completeWithUnmatchedPath.get())
            )
        )
    );
// tests:
testRoute(route).run(HttpRequest.GET("/start/middle/end")).assertEntity("/middle/");
testRoute(route).run(HttpRequest.GET("/start/something/barbaz/foo")).assertEntity("/something/");
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/RequestContext.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/RequestContext.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/path-directives/pathPrefix.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/path-directives/pathSingleSlash.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/path-directives/pathSuffixTest.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/path-matchers.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/rejections.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/path-directives/pathSuffix.html](https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/path-directives/pathSuffix.html)*