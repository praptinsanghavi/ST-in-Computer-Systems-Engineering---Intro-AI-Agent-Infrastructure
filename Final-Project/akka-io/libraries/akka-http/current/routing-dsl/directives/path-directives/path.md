---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:57:55Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/path-directives/path.html
title: path • Akka HTTP
---

# path • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# path

## Signature

```
def path[L](pm: PathMatcher[L]): Directive[L]
```

## Description

Matches the complete unmatched path of the [`RequestContext`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/RequestContext.html "akka.http.javadsl.server.RequestContext")[`RequestContext`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/RequestContext.html "akka.http.scaladsl.server.RequestContext") against the given `PathMatcher`, potentially extracts one or more values (depending on the type of the argument).

This directive filters incoming requests based on the part of their URI that hasn’t been matched yet by other potentially existing [pathPrefix](pathPrefix.html) directives on higher levels of the routing structure. Its one parameter is usually an expression evaluating to a `PathMatcher` instance (see also: [The PathMatcher DSL](../../path-matchers.html)).

As opposed to the [rawPathPrefix](rawPathPrefix.html) or [rawPathPrefixTest](rawPathPrefixTest.html) directives `path` automatically adds a leading slash to its `PathMatcher` argument, you therefore don’t have to start your matching expression with an explicit slash.

The `path` directive attempts to match the **complete** remaining path, not just a prefix. If you only want to match a path prefix and then delegate further filtering to a lower level in your routing structure use the [pathPrefix](pathPrefix.html) directive instead. As a consequence it doesn’t make sense to nest a `path` or [pathPrefix](pathPrefix.html) directive underneath another `path` directive, as there is no way that they will ever match (since the unmatched path underneath a `path` directive will always be empty). For a comparison between path directives check [Overview of path directives](index.html#overview-path).

Depending on the type of its `PathMatcher` argument the `path` directive extracts zero or more values from the URI. If the match fails the request is rejected with an [empty rejection set](../../rejections.html#empty-rejections).

Note
The empty string (also called empty word or identity) is a **neutral element** of string concatenation operation, so it will match everything, but remember that `path` requires whole remaining path being matched, so (`/`) will succeed and (`/whatever`) will fail. The [pathPrefix](pathPrefix.html) provides more liberal behaviour.

## Example

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/directives/PathDirectivesExamplesSpec.scala#L68-L103 "Go to snippet source")val route =
  concat(
    path("foo") {
      complete("/foo")
    },
    path("foo" / "bar") {
      complete("/foo/bar")
    },
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
  )

// tests:
Get("/") ~> route ~> check {
  handled shouldEqual false
}

Get("/foo") ~> route ~> check {
  responseAs[String] shouldEqual "/foo"
}

Get("/foo/bar") ~> route ~> check {
  responseAs[String] shouldEqual "/foo/bar"
}

Get("/ball/1337") ~> route ~> check {
  responseAs[String] shouldEqual "odd ball"
}
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/directives/PathDirectivesExamplesTest.java#L46-L163 "Go to snippet source")import static akka.http.javadsl.server.Directives.path;

// matches /foo/
path(segment("foo").slash(), () -> complete(StatusCodes.OK));

// matches /foo/bar
path(segment("foo").slash(segment("boo")), () -> complete(StatusCodes.OK));

// NOTE: matches /foo%2Fbar and doesn't match /foo/bar
path(segment("foo/bar"), () -> complete(StatusCodes.OK));

// NOTE: matches /foo/bar
path(separateOnSlashes("foo/bar"), () -> complete(StatusCodes.OK));

// matches e.g. /foo/123 and extracts "123" as a String
path(segment("foo").slash(segment(compile("\\d+"))), (value) ->
    complete(StatusCodes.OK));

// matches e.g. /foo/bar123 and extracts "123" as a String
path(segment("foo").slash(segment(compile("bar(\\d+)"))), (value) ->
    complete(StatusCodes.OK));

// similar to `path(Segments)`
path(neutral().repeat(0, 10), () -> complete(StatusCodes.OK));

// identical to path("foo" ~ (PathEnd | Slash))
path(segment("foo").orElse(slash()), () -> complete(StatusCodes.OK));
```

## Code Examples

### Example 1: Signature

```scala
def path[L](pm: PathMatcher[L]): Directive[L]
```

### Example 2: Example

```scala
val route =
  concat(
    path("foo") {
      complete("/foo")
    },
    path("foo" / "bar") {
      complete("/foo/bar")
    },
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
  )

// tests:
Get("/") ~> route ~> check {
  handled shouldEqual false
}

Get("/foo") ~> route ~> check {
  responseAs[String] shouldEqual "/foo"
}

Get("/foo/bar") ~> route ~> check {
  responseAs[String] shouldEqual "/foo/bar"
}

Get("/ball/1337") ~> route ~> check {
  responseAs[String] shouldEqual "odd ball"
}
```

### Example 3: Example

```java
import static akka.http.javadsl.server.Directives.path;

// matches /foo/
path(segment("foo").slash(), () -> complete(StatusCodes.OK));

// matches /foo/bar
path(segment("foo").slash(segment("boo")), () -> complete(StatusCodes.OK));

// NOTE: matches /foo%2Fbar and doesn't match /foo/bar
path(segment("foo/bar"), () -> complete(StatusCodes.OK));

// NOTE: matches /foo/bar
path(separateOnSlashes("foo/bar"), () -> complete(StatusCodes.OK));

// matches e.g. /foo/123 and extracts "123" as a String
path(segment("foo").slash(segment(compile("\\d+"))), (value) ->
    complete(StatusCodes.OK));

// matches e.g. /foo/bar123 and extracts "123" as a String
path(segment("foo").slash(segment(compile("bar(\\d+)"))), (value) ->
    complete(StatusCodes.OK));

// similar to `path(Segments)`
path(neutral().repeat(0, 10), () -> complete(StatusCodes.OK));

// identical to path("foo" ~ (PathEnd | Slash))
path(segment("foo").orElse(slash()), () -> complete(StatusCodes.OK));
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/RequestContext.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/RequestContext.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/path-directives/index.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/path-directives/pathEnd.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/path-directives/pathPrefix.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/path-directives/rawPathPrefix.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/path-directives/rawPathPrefixTest.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/path-matchers.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/rejections.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/path-directives/path.html](https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/path-directives/path.html)*