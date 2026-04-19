---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:56:54Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/extractMatchedPath.html
title: extractMatchedPath • Akka HTTP
---

# extractMatchedPath • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# extractMatchedPath

## Signature

```
def extractMatchedPath: Directive1[Uri.Path]
```

## Description

Extracts the matched path from the request context.

The `extractMatchedPath` directive extracts the path that was already matched by any of the [PathDirectives](../path-directives/index.html) (or any custom ones that change the unmatched path field of the request context). You can use it for building directives that use already matched part in their logic.

See also [extractUnmatchedPath](extractUnmatchedPath.html) to see similar directive for unmatched path.

## Example

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/directives/BasicDirectivesExamplesSpec.scala#L715-L729 "Go to snippet source")val route =
  pathPrefix("abc") {
    extractMatchedPath { matched =>
      complete(matched.toString)
    }
  }

// tests:
Get("/abc") ~> route ~> check {
  responseAs[String] shouldEqual "/abc"
}
Get("/abc/xyz") ~> route ~> check {
  responseAs[String] shouldEqual "/abc"
}

```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/directives/BasicDirectivesExamplesTest.java#L152-L948 "Go to snippet source")import static akka.http.javadsl.server.Directives.extractMatchedPath;

final Route route = pathPrefix("abc", () -> extractMatchedPath(Directives::complete));

// tests:
testRoute(route).run(HttpRequest.GET("/abc")).assertEntity("/abc");
testRoute(route).run(HttpRequest.GET("/abc/xyz")).assertEntity("/abc");
```

## Code Examples

### Example 1: Signature

```scala
def extractMatchedPath: Directive1[Uri.Path]
```

### Example 2: Example

```scala
val route =
  pathPrefix("abc") {
    extractMatchedPath { matched =>
      complete(matched.toString)
    }
  }

// tests:
Get("/abc") ~> route ~> check {
  responseAs[String] shouldEqual "/abc"
}
Get("/abc/xyz") ~> route ~> check {
  responseAs[String] shouldEqual "/abc"
}
```

### Example 3: Example

```java
import static akka.http.javadsl.server.Directives.extractMatchedPath;

final Route route = pathPrefix("abc", () -> extractMatchedPath(Directives::complete));

// tests:
testRoute(route).run(HttpRequest.GET("/abc")).assertEntity("/abc");
testRoute(route).run(HttpRequest.GET("/abc/xyz")).assertEntity("/abc");
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/extractLog.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/extractMaterializer.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/extractUnmatchedPath.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/path-directives/index.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/extractMatchedPath.html](https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/extractMatchedPath.html)*