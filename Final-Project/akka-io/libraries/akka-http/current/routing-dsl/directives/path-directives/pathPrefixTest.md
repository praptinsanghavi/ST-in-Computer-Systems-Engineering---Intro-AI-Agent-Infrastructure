---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:57:56Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/path-directives/pathPrefixTest.html
title: pathPrefixTest • Akka HTTP
---

# pathPrefixTest • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# pathPrefixTest

## Signature

```
def pathPrefixTest[L](pm: PathMatcher[L]): Directive[L]
```

## Description

Checks whether the unmatched path of the [`RequestContext`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/RequestContext.html "akka.http.javadsl.server.RequestContext")[`RequestContext`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/RequestContext.html "akka.http.scaladsl.server.RequestContext") has a prefix matched by the given `PathMatcher`. Potentially extracts one or more values (depending on the type of the argument) but doesn’t consume its match from the unmatched path.

This directive is very similar to the [pathPrefix](pathPrefix.html) directive with the one difference that the path prefix it matched (if it matched) is *not* consumed. The unmatched path of the [`RequestContext`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/RequestContext.html "akka.http.javadsl.server.RequestContext")[`RequestContext`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/RequestContext.html "akka.http.scaladsl.server.RequestContext") is therefore left as is even in the case that the directive successfully matched and the request is passed on to its inner route.

For more info on how to create a `PathMatcher` see [The PathMatcher DSL](../../path-matchers.html).

As opposed to its [rawPathPrefixTest](rawPathPrefixTest.html) counterpart `pathPrefixTest` automatically adds a leading slash to its `PathMatcher` argument, you therefore don’t have to start your matching expression with an explicit slash.

Depending on the type of its `PathMatcher` argument the `pathPrefixTest` directive extracts zero or more values from the URI. If the match fails the request is rejected with an [empty rejection set](../../rejections.html#empty-rejections).

## Example

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/directives/PathDirectivesExamplesSpec.scala#L59-L63 "Go to snippet source")val completeWithUnmatchedPath =
  extractUnmatchedPath { p =>
    complete(p.toString)
  }

val route =
  pathPrefixTest("foo" | "bar") {
    concat(
      pathPrefix("foo") { completeWithUnmatchedPath },
      pathPrefix("bar") { completeWithUnmatchedPath }
    )
  }

// tests:
Get("/foo/doo") ~> route ~> check {
  responseAs[String] shouldEqual "/doo"
}

Get("/bar/yes") ~> route ~> check {
  responseAs[String] shouldEqual "/yes"
}
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/directives/PathDirectivesExamplesTest.java#L66-L273 "Go to snippet source")import static akka.http.javadsl.server.Directives.path;
import static akka.http.javadsl.server.Directives.pathEnd;
import static akka.http.javadsl.server.Directives.pathPrefix;
import static akka.http.javadsl.server.Directives.pathPrefixTest;
final Route route =
    concat(
        pathPrefixTest(segment("foo").orElse("bar"), () ->
            concat(
                  pathPrefix("foo", () -> completeWithUnmatchedPath.get()),
                  pathPrefix("bar", () -> completeWithUnmatchedPath.get())
            )
        )
    );
// tests:
testRoute(route).run(HttpRequest.GET("/foo/doo")).assertEntity("/doo");
testRoute(route).run(HttpRequest.GET("/bar/yes")).assertEntity("/yes");
```

## Code Examples

### Example 1: Signature

```scala
def pathPrefixTest[L](pm: PathMatcher[L]): Directive[L]
```

### Example 2: Example

```scala
val completeWithUnmatchedPath =
  extractUnmatchedPath { p =>
    complete(p.toString)
  }

val route =
  pathPrefixTest("foo" | "bar") {
    concat(
      pathPrefix("foo") { completeWithUnmatchedPath },
      pathPrefix("bar") { completeWithUnmatchedPath }
    )
  }

// tests:
Get("/foo/doo") ~> route ~> check {
  responseAs[String] shouldEqual "/doo"
}

Get("/bar/yes") ~> route ~> check {
  responseAs[String] shouldEqual "/yes"
}
```

### Example 3: Example

```java
import static akka.http.javadsl.server.Directives.path;
import static akka.http.javadsl.server.Directives.pathEnd;
import static akka.http.javadsl.server.Directives.pathPrefix;
import static akka.http.javadsl.server.Directives.pathPrefixTest;
final Route route =
    concat(
        pathPrefixTest(segment("foo").orElse("bar"), () ->
            concat(
                  pathPrefix("foo", () -> completeWithUnmatchedPath.get()),
                  pathPrefix("bar", () -> completeWithUnmatchedPath.get())
            )
        )
    );
// tests:
testRoute(route).run(HttpRequest.GET("/foo/doo")).assertEntity("/doo");
testRoute(route).run(HttpRequest.GET("/bar/yes")).assertEntity("/yes");
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/RequestContext.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/RequestContext.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/path-directives/pathPrefix.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/path-directives/pathSingleSlash.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/path-directives/rawPathPrefixTest.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/path-matchers.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/rejections.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/path-directives/pathPrefixTest.html](https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/path-directives/pathPrefixTest.html)*