---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:58:00Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/path-directives/rawPathPrefixTest.html
title: rawPathPrefixTest • Akka HTTP
---

# rawPathPrefixTest • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# rawPathPrefixTest

## Signature

```
def rawPathPrefixTest[L](pm: PathMatcher[L]): Directive[L]
```

## Description

Checks whether the unmatched path of the [`RequestContext`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/RequestContext.html "akka.http.javadsl.server.RequestContext")[`RequestContext`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/RequestContext.html "akka.http.scaladsl.server.RequestContext") has a prefix matched by the given `PathMatcher`. Potentially extracts one or more values (depending on the type of the argument) but doesn’t consume its match from the unmatched path.

This directive is very similar to the [pathPrefix](pathPrefix.html) directive with the one difference that the path prefix it matched (if it matched) is *not* consumed. The unmatched path of the [`RequestContext`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/RequestContext.html "akka.http.javadsl.server.RequestContext")[`RequestContext`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/RequestContext.html "akka.http.scaladsl.server.RequestContext") is therefore left as is even in the case that the directive successfully matched and the request is passed on to its inner route.

For more info on how to create a `PathMatcher` see [The PathMatcher DSL](../../path-matchers.html).

As opposed to its [pathPrefixTest](pathPrefixTest.html) counterpart `rawPathPrefixTest` does *not* automatically add a leading slash to its `PathMatcher` argument. Rather its `PathMatcher` argument is applied to the unmatched path as is.

Depending on the type of its `PathMatcher` argument the `rawPathPrefixTest` directive extracts zero or more values from the URI. If the match fails the request is rejected with an [empty rejection set](../../rejections.html#empty-rejections).

## Example

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/directives/PathDirectivesExamplesSpec.scala#L59-L63 "Go to snippet source")val completeWithUnmatchedPath =
  extractUnmatchedPath { p =>
    complete(p.toString)
  }

val route =
  pathPrefix("foo") {
    rawPathPrefixTest("bar") {
      completeWithUnmatchedPath
    }
  }

// tests:
Get("/foobar") ~> route ~> check {
  responseAs[String] shouldEqual "bar"
}

Get("/foobaz") ~> route ~> check {
  handled shouldEqual false
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
def rawPathPrefixTest[L](pm: PathMatcher[L]): Directive[L]
```

### Example 2: Example

```scala
val completeWithUnmatchedPath =
  extractUnmatchedPath { p =>
    complete(p.toString)
  }

val route =
  pathPrefix("foo") {
    rawPathPrefixTest("bar") {
      completeWithUnmatchedPath
    }
  }

// tests:
Get("/foobar") ~> route ~> check {
  responseAs[String] shouldEqual "bar"
}

Get("/foobaz") ~> route ~> check {
  handled shouldEqual false
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
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/path-directives/pathPrefix.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/path-directives/pathPrefixTest.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/path-directives/rawPathPrefix.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/path-directives/redirectToNoTrailingSlashIfPresent.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/path-matchers.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/rejections.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/path-directives/rawPathPrefixTest.html](https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/path-directives/rawPathPrefixTest.html)*