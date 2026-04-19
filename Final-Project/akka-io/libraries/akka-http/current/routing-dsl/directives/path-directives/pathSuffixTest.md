---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:57:58Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/path-directives/pathSuffixTest.html
title: pathSuffixTest • Akka HTTP
---

# pathSuffixTest • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# pathSuffixTest

## Signature

```
def pathSuffixTest[L](pm: PathMatcher[L]): Directive[L]
```

## Description

Checks whether the unmatched path of the [`RequestContext`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/RequestContext.html "akka.http.javadsl.server.RequestContext")[`RequestContext`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/RequestContext.html "akka.http.scaladsl.server.RequestContext") has a suffix matched by the given `PathMatcher`. Potentially extracts one or more values (depending on the type of the argument) but doesn’t consume its match from the unmatched path.

This directive is very similar to the [pathSuffix](pathSuffix.html) directive with the one difference that the path suffix it matched (if it matched) is *not* consumed. The unmatched path of the [`RequestContext`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/RequestContext.html "akka.http.javadsl.server.RequestContext")[`RequestContext`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/RequestContext.html "akka.http.scaladsl.server.RequestContext") is therefore left as is even in the case that the directive successfully matched and the request is passed on to its inner route.

As opposed to [pathPrefixTest](pathPrefixTest.html) this directive matches and consumes the unmatched path from the right, i.e. the end.

Caution
For efficiency reasons, the given `PathMatcher` must match the desired suffix in reversed\-segment order, i.e. `pathSuffixTest("baz" / "bar")` would match `/foo/bar/baz`! The order within a segment match is not reversed.

Depending on the type of its `PathMatcher` argument the `pathSuffixTest` directive extracts zero or more values from the URI. If the match fails the request is rejected with an [empty rejection set](../../rejections.html#empty-rejections).

## Example

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/directives/PathDirectivesExamplesSpec.scala#L59-L63 "Go to snippet source")val completeWithUnmatchedPath =
  extractUnmatchedPath { p =>
    complete(p.toString)
  }

val route =
  concat(
    pathSuffixTest(Slash) {
      complete("slashed")
    },
    complete("unslashed")
  )

// tests:
Get("/foo/") ~> route ~> check {
  responseAs[String] shouldEqual "slashed"
}
Get("/foo") ~> route ~> check {
  responseAs[String] shouldEqual "unslashed"
}
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/directives/PathDirectivesExamplesTest.java#L82-L327 "Go to snippet source")import static akka.http.javadsl.server.Directives.complete;
import static akka.http.javadsl.server.Directives.pathSuffixTest;
final Route route =
    concat(
        pathSuffixTest(slash(), () -> complete("slashed")),
        complete("unslashed")
    );
// tests:
testRoute(route).run(HttpRequest.GET("/foo/")).assertEntity("slashed");
testRoute(route).run(HttpRequest.GET("/foo")).assertEntity("unslashed");
```

## Code Examples

### Example 1: Signature

```scala
def pathSuffixTest[L](pm: PathMatcher[L]): Directive[L]
```

### Example 2: Example

```scala
val completeWithUnmatchedPath =
  extractUnmatchedPath { p =>
    complete(p.toString)
  }

val route =
  concat(
    pathSuffixTest(Slash) {
      complete("slashed")
    },
    complete("unslashed")
  )

// tests:
Get("/foo/") ~> route ~> check {
  responseAs[String] shouldEqual "slashed"
}
Get("/foo") ~> route ~> check {
  responseAs[String] shouldEqual "unslashed"
}
```

### Example 3: Example

```java
import static akka.http.javadsl.server.Directives.complete;
import static akka.http.javadsl.server.Directives.pathSuffixTest;
final Route route =
    concat(
        pathSuffixTest(slash(), () -> complete("slashed")),
        complete("unslashed")
    );
// tests:
testRoute(route).run(HttpRequest.GET("/foo/")).assertEntity("slashed");
testRoute(route).run(HttpRequest.GET("/foo")).assertEntity("unslashed");
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/RequestContext.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/RequestContext.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/path-directives/pathPrefixTest.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/path-directives/pathSuffix.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/path-directives/rawPathPrefix.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/rejections.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/path-directives/pathSuffixTest.html](https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/path-directives/pathSuffixTest.html)*