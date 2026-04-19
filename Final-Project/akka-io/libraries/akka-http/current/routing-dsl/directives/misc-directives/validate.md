---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:58:15Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/misc-directives/validate.html
title: validate • Akka HTTP
---

# validate • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# validate

Allows validating a precondition before handling a route.

## Signature

```
def validate(check: => Boolean, errorMsg: String): Directive0
```

## Description

Checks an arbitrary condition and passes control to the inner route if it returns `true`. Otherwise, rejects the request with a [`ValidationRejection`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/ValidationRejection.html "akka.http.javadsl.server.ValidationRejection")[`ValidationRejection`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/ValidationRejection.html "akka.http.scaladsl.server.ValidationRejection") containing the given error message.

## Example

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/directives/MiscDirectivesExamplesSpec.scala#L99-L112 "Go to snippet source")val route =
  extractUri { uri =>
    validate(uri.path.toString.size < 5, s"Path too long: '${uri.path.toString}'") {
      complete(s"Full URI: $uri")
    }
  }

// tests:
Get("/234") ~> route ~> check {
  responseAs[String] shouldEqual "Full URI: http://example.com/234"
}
Get("/abcdefghijkl") ~> route ~> check {
  rejection shouldEqual ValidationRejection("Path too long: '/abcdefghijkl'", None)
}
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/directives/MiscDirectivesExamplesTest.java#L56-L220 "Go to snippet source")import static akka.http.javadsl.server.Directives.extractUri;
import static akka.http.javadsl.server.Directives.validate;

final Route route = extractUri(uri ->
  validate(() -> uri.path().length() < 5,
    "Path too long: " + uri.path(),
    () -> complete("Full URI: " + uri.toString()))
);

// tests:
testRoute(route).run(HttpRequest.GET("/234"))
  .assertEntity("Full URI: http://example.com/234");
testRoute(route).run(HttpRequest.GET("/abcdefghijkl"))
  .assertEntity("Path too long: /abcdefghijkl");
```

## Code Examples

### Example 1: Signature

```scala
def validate(check: => Boolean, errorMsg: String): Directive0
```

### Example 2: Example

```scala
val route =
  extractUri { uri =>
    validate(uri.path.toString.size < 5, s"Path too long: '${uri.path.toString}'") {
      complete(s"Full URI: $uri")
    }
  }

// tests:
Get("/234") ~> route ~> check {
  responseAs[String] shouldEqual "Full URI: http://example.com/234"
}
Get("/abcdefghijkl") ~> route ~> check {
  rejection shouldEqual ValidationRejection("Path too long: '/abcdefghijkl'", None)
}
```

### Example 3: Example

```java
import static akka.http.javadsl.server.Directives.extractUri;
import static akka.http.javadsl.server.Directives.validate;

final Route route = extractUri(uri ->
  validate(() -> uri.path().length() < 5,
    "Path too long: " + uri.path(),
    () -> complete("Full URI: " + uri.toString()))
);

// tests:
testRoute(route).run(HttpRequest.GET("/234"))
  .assertEntity("Full URI: http://example.com/234");
testRoute(route).run(HttpRequest.GET("/abcdefghijkl"))
  .assertEntity("Path too long: /abcdefghijkl");
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/ValidationRejection.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/ValidationRejection.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/misc-directives/selectPreferredLanguage.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/misc-directives/withoutSizeLimit.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/misc-directives/validate.html](https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/misc-directives/validate.html)*