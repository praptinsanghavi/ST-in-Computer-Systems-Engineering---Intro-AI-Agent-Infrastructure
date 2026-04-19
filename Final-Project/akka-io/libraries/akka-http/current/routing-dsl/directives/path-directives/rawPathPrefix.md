---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:58:00Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/path-directives/rawPathPrefix.html
title: rawPathPrefix • Akka HTTP
---

# rawPathPrefix • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# rawPathPrefix

## Signature

```
def rawPathPrefix[L](pm: PathMatcher[L]): Directive[L]
```

## Description

Matches and consumes a prefix of the unmatched path of the [`RequestContext`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/RequestContext.html "akka.http.javadsl.server.RequestContext")[`RequestContext`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/RequestContext.html "akka.http.scaladsl.server.RequestContext") against the given `PathMatcher`, potentially extracts one or more values (depending on the type of the argument).

This directive filters incoming requests based on the part of their URI that hasn’t been matched yet by other potentially existing `rawPathPrefix` or [pathPrefix](pathPrefix.html) directives on higher levels of the routing structure. Its one parameter is usually an expression evaluating to a `PathMatcher` instance (see also: [The PathMatcher DSL](../../path-matchers.html)).

As opposed to its [pathPrefix](pathPrefix.html) counterpart `rawPathPrefix` does *not* automatically add a leading slash to its `PathMatcher` argument. Rather its `PathMatcher` argument is applied to the unmatched path as is. For a comparison between path directives check [Overview of path directives](index.html#overview-path).

Depending on the type of its `PathMatcher` argument the `rawPathPrefix` directive extracts zero or more values from the URI. If the match fails the request is rejected with an [empty rejection set](../../rejections.html#empty-rejections).

## Example

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/directives/PathDirectivesExamplesSpec.scala#L59-L63 "Go to snippet source")val completeWithUnmatchedPath =
  extractUnmatchedPath { p =>
    complete(p.toString)
  }

val route =
  pathPrefix("foo") {
    concat(
      rawPathPrefix("bar") { completeWithUnmatchedPath },
      rawPathPrefix("doo") { completeWithUnmatchedPath }
    )
  }

// tests:
Get("/foobar/baz") ~> route ~> check {
  responseAs[String] shouldEqual "/baz"
}

Get("/foodoo/baz") ~> route ~> check {
  responseAs[String] shouldEqual "/baz"
}
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/directives/PathDirectivesExamplesTest.java#L90-L360 "Go to snippet source")import static akka.http.javadsl.server.Directives.complete;
import static akka.http.javadsl.server.Directives.rawPathPrefixTest;
final Route route =
    concat(
        pathPrefix("foo", () ->
            rawPathPrefixTest("bar", () -> completeWithUnmatchedPath.get())
        )
    );
// tests:
testRoute(route).run(HttpRequest.GET("/foobar")).assertEntity("bar");
testRoute(route).run(HttpRequest.GET("/foobaz")).assertStatusCode(StatusCodes.NOT_FOUND);
```

## Code Examples

### Example 1: Signature

```scala
def rawPathPrefix[L](pm: PathMatcher[L]): Directive[L]
```

### Example 2: Example

```scala
val completeWithUnmatchedPath =
  extractUnmatchedPath { p =>
    complete(p.toString)
  }

val route =
  pathPrefix("foo") {
    concat(
      rawPathPrefix("bar") { completeWithUnmatchedPath },
      rawPathPrefix("doo") { completeWithUnmatchedPath }
    )
  }

// tests:
Get("/foobar/baz") ~> route ~> check {
  responseAs[String] shouldEqual "/baz"
}

Get("/foodoo/baz") ~> route ~> check {
  responseAs[String] shouldEqual "/baz"
}
```

### Example 3: Example

```java
import static akka.http.javadsl.server.Directives.complete;
import static akka.http.javadsl.server.Directives.rawPathPrefixTest;
final Route route =
    concat(
        pathPrefix("foo", () ->
            rawPathPrefixTest("bar", () -> completeWithUnmatchedPath.get())
        )
    );
// tests:
testRoute(route).run(HttpRequest.GET("/foobar")).assertEntity("bar");
testRoute(route).run(HttpRequest.GET("/foobaz")).assertStatusCode(StatusCodes.NOT_FOUND);
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/RequestContext.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/RequestContext.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/path-directives/index.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/path-directives/pathPrefix.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/path-directives/pathSuffixTest.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/path-directives/rawPathPrefixTest.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/path-matchers.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/rejections.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/path-directives/rawPathPrefix.html](https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/path-directives/rawPathPrefix.html)*