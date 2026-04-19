---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:57:16Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/extractUri.html
title: extractUri • Akka HTTP
---

# extractUri • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# extractUri

## Signature

```
def extractUri: Directive1[Uri]
```

## Description

Access the full URI of the request.

Use [SchemeDirectives](../scheme-directives/index.html), [HostDirectives](../host-directives/index.html), [PathDirectives](../path-directives/index.html), and [ParameterDirectives](../parameter-directives/index.html) for more targeted access to parts of the URI.

## Example

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/directives/BasicDirectivesExamplesSpec.scala#L765-L777 "Go to snippet source")val route =
  extractUri { uri =>
    complete(s"Full URI: $uri")
  }

// tests:
Get("/") ~> route ~> check {
  // tests are executed with the host assumed to be "example.com"
  responseAs[String] shouldEqual "Full URI: http://example.com/"
}
Get("/test") ~> route ~> check {
  responseAs[String] shouldEqual "Full URI: http://example.com/test"
}
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/directives/BasicDirectivesExamplesTest.java#L156-L964 "Go to snippet source")import static akka.http.javadsl.server.Directives.extractUri;

final Route route = extractUri(uri ->
  complete("Full URI: " + uri)
);

// tests:
// tests are executed with the host assumed to be "example.com"
testRoute(route).run(HttpRequest.GET("/"))
  .assertEntity("Full URI: http://example.com/");
testRoute(route).run(HttpRequest.GET("/test"))
  .assertEntity("Full URI: http://example.com/test");
```

## Code Examples

### Example 1: Signature

```scala
def extractUri: Directive1[Uri]
```

### Example 2: Example

```scala
val route =
  extractUri { uri =>
    complete(s"Full URI: $uri")
  }

// tests:
Get("/") ~> route ~> check {
  // tests are executed with the host assumed to be "example.com"
  responseAs[String] shouldEqual "Full URI: http://example.com/"
}
Get("/test") ~> route ~> check {
  responseAs[String] shouldEqual "Full URI: http://example.com/test"
}
```

### Example 3: Example

```java
import static akka.http.javadsl.server.Directives.extractUri;

final Route route = extractUri(uri ->
  complete("Full URI: " + uri)
);

// tests:
// tests are executed with the host assumed to be "example.com"
testRoute(route).run(HttpRequest.GET("/"))
  .assertEntity("Full URI: http://example.com/");
testRoute(route).run(HttpRequest.GET("/test"))
  .assertEntity("Full URI: http://example.com/test");
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/extractUnmatchedPath.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/mapInnerRoute.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/host-directives/index.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/parameter-directives/index.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/path-directives/index.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/scheme-directives/index.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/extractUri.html](https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/extractUri.html)*