---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:57:15Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/extractUnmatchedPath.html
title: extractUnmatchedPath • Akka HTTP
---

# extractUnmatchedPath • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# extractUnmatchedPath

## Signature

```
def extractUnmatchedPath: Directive1[Uri.Path]
```

## Description

Extracts the unmatched path from the request context.

The `extractUnmatchedPath` directive extracts the remaining path that was not yet matched by any of the [PathDirectives](../path-directives/index.html) (or any custom ones that change the unmatched path field of the request context). You can use it for building directives that handle complete suffixes of paths (like the `getFromDirectory` directives and similar ones).

Use `mapUnmatchedPath` to change the value of the unmatched path.

See also [extractMatchedPath](extractMatchedPath.html) to see similar directive for matched path.

## Example

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/directives/BasicDirectivesExamplesSpec.scala#L811-L824 "Go to snippet source")val route =
  pathPrefix("abc") {
    extractUnmatchedPath { remaining =>
      complete(s"Unmatched: '$remaining'")
    }
  }

// tests:
Get("/abc") ~> route ~> check {
  responseAs[String] shouldEqual "Unmatched: ''"
}
Get("/abc/456") ~> route ~> check {
  responseAs[String] shouldEqual "Unmatched: '/456'"
}
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/directives/BasicDirectivesExamplesTest.java#L247-L1015 "Go to snippet source")import static akka.http.javadsl.server.Directives.complete;
import static akka.http.javadsl.server.Directives.extractUnmatchedPath;

final Route route = pathPrefix("abc", () ->
  extractUnmatchedPath(remaining ->
    complete("Unmatched: '" + remaining + "'")
  )
);

// tests:
testRoute(route).run(HttpRequest.GET("/abc"))
  .assertEntity("Unmatched: ''");
testRoute(route).run(HttpRequest.GET("/abc/456"))
  .assertEntity("Unmatched: '/456'");
```

## Code Examples

### Example 1: Signature

```scala
def extractUnmatchedPath: Directive1[Uri.Path]
```

### Example 2: Example

```scala
val route =
  pathPrefix("abc") {
    extractUnmatchedPath { remaining =>
      complete(s"Unmatched: '$remaining'")
    }
  }

// tests:
Get("/abc") ~> route ~> check {
  responseAs[String] shouldEqual "Unmatched: ''"
}
Get("/abc/456") ~> route ~> check {
  responseAs[String] shouldEqual "Unmatched: '/456'"
}
```

### Example 3: Example

```java
import static akka.http.javadsl.server.Directives.complete;
import static akka.http.javadsl.server.Directives.extractUnmatchedPath;

final Route route = pathPrefix("abc", () ->
  extractUnmatchedPath(remaining ->
    complete("Unmatched: '" + remaining + "'")
  )
);

// tests:
testRoute(route).run(HttpRequest.GET("/abc"))
  .assertEntity("Unmatched: ''");
testRoute(route).run(HttpRequest.GET("/abc/456"))
  .assertEntity("Unmatched: '/456'");
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/extractMatchedPath.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/extractStrictEntity.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/extractUri.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/path-directives/index.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/extractUnmatchedPath.html](https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/extractUnmatchedPath.html)*