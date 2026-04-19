---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:57:10Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/scheme-directives/extractScheme.html
title: extractScheme • Akka HTTP
---

# extractScheme • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# extractScheme

## Signature

```
def extractScheme: Directive1[String]
```

## Description

Extracts the Uri scheme (i.e. “`http`”, “`https`”, etc.) for an incoming request.

For rejecting a request if it doesn’t match a specified scheme name, see the [scheme](scheme.html) directive.

## Example

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/directives/SchemeDirectivesExamplesSpec.scala#L12-L20 "Go to snippet source")val route =
  extractScheme { scheme =>
    complete(s"The scheme is '${scheme}'")
  }

// tests:
Get("https://www.example.com/") ~> route ~> check {
  responseAs[String] shouldEqual "The scheme is 'https'"
}
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/directives/SchemeDirectivesExamplesTest.java#L16-L36 "Go to snippet source")import static akka.http.javadsl.server.Directives.complete;
import static akka.http.javadsl.server.Directives.extractScheme;

final Route route = extractScheme((scheme) ->
                                  complete(String.format("The scheme is '%s'", scheme)));
testRoute(route).run(HttpRequest.GET("https://www.example.com/"))
  .assertEntity("The scheme is 'https'");
```

## Code Examples

### Example 1: Signature

```scala
def extractScheme: Directive1[String]
```

### Example 2: Example

```scala
val route =
  extractScheme { scheme =>
    complete(s"The scheme is '${scheme}'")
  }

// tests:
Get("https://www.example.com/") ~> route ~> check {
  responseAs[String] shouldEqual "The scheme is 'https'"
}
```

### Example 3: Example

```java
import static akka.http.javadsl.server.Directives.complete;
import static akka.http.javadsl.server.Directives.extractScheme;

final Route route = extractScheme((scheme) ->
                                  complete(String.format("The scheme is '%s'", scheme)));
testRoute(route).run(HttpRequest.GET("https://www.example.com/"))
  .assertEntity("The scheme is 'https'");
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/scheme-directives/index.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/scheme-directives/scheme.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/scheme-directives/extractScheme.html](https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/scheme-directives/extractScheme.html)*