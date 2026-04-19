---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:57:42Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/mapUnmatchedPath.html
title: mapUnmatchedPath • Akka HTTP
---

# mapUnmatchedPath • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# mapUnmatchedPath

## Signature

```
def mapUnmatchedPath(f: Uri.Path => Uri.Path): Directive0
```

## Description

Transforms the unmatchedPath field of the request context for inner routes.

The `mapUnmatchedPath` directive is used as a building block for writing [Custom Directives](../custom-directives.html). You can use it for implementing custom path matching directives.

Use `extractUnmatchedPath` for extracting the current value of the unmatched path.

## Example

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/directives/BasicDirectivesExamplesSpec.scala#L782-L806 "Go to snippet source")def ignore456(path: Uri.Path) = path match {
  case s @ Uri.Path.Segment(head, tail) if head.startsWith("456") =>
    val newHead = head.drop(3)
    if (newHead.isEmpty) tail
    else s.copy(head = head.drop(3))
  case _ => path
}
val ignoring456 = mapUnmatchedPath(ignore456)

val route =
  pathPrefix("123") {
    ignoring456 {
      path("abc") {
        complete("Content")
      }
    }
  }

// tests:
Get("/123/abc") ~> route ~> check {
  responseAs[String] shouldEqual "Content"
}
Get("/123456/abc") ~> route ~> check {
  responseAs[String] shouldEqual "Content"
}
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/directives/BasicDirectivesExamplesTest.java#L160-L998 "Go to snippet source")import static akka.http.javadsl.server.Directives.mapUnmatchedPath;

final Function<String, String> ignore456 = path -> {
  int slashPos = path.indexOf("/");
  if (slashPos != -1) {
    String head = path.substring(0, slashPos);
    String tail = path.substring(slashPos);
    if (head.length() <= 3) {
      return tail;
    } else {
      return path.substring(3);
    }
  } else {
    return path;
  }
};

final Route route = pathPrefix("123", () ->
  mapUnmatchedPath(ignore456, () ->
    path("abc", () ->
      complete("Content")
    )
  )
);

// tests:
testRoute(route).run(HttpRequest.GET("/123/abc"))
  .assertEntity("Content");
testRoute(route).run(HttpRequest.GET("/123456/abc"))
  .assertEntity("Content");
```

## Code Examples

### Example 1: Signature

```scala
def mapUnmatchedPath(f: Uri.Path => Uri.Path): Directive0
```

### Example 2: Example

```scala
def ignore456(path: Uri.Path) = path match {
  case s @ Uri.Path.Segment(head, tail) if head.startsWith("456") =>
    val newHead = head.drop(3)
    if (newHead.isEmpty) tail
    else s.copy(head = head.drop(3))
  case _ => path
}
val ignoring456 = mapUnmatchedPath(ignore456)

val route =
  pathPrefix("123") {
    ignoring456 {
      path("abc") {
        complete("Content")
      }
    }
  }

// tests:
Get("/123/abc") ~> route ~> check {
  responseAs[String] shouldEqual "Content"
}
Get("/123456/abc") ~> route ~> check {
  responseAs[String] shouldEqual "Content"
}
```

### Example 3: Example

```java
import static akka.http.javadsl.server.Directives.mapUnmatchedPath;

final Function<String, String> ignore456 = path -> {
  int slashPos = path.indexOf("/");
  if (slashPos != -1) {
    String head = path.substring(0, slashPos);
    String tail = path.substring(slashPos);
    if (head.length() <= 3) {
      return tail;
    } else {
      return path.substring(3);
    }
  } else {
    return path;
  }
};

final Route route = pathPrefix("123", () ->
  mapUnmatchedPath(ignore456, () ->
    path("abc", () ->
      complete("Content")
    )
  )
);

// tests:
testRoute(route).run(HttpRequest.GET("/123/abc"))
  .assertEntity("Content");
testRoute(route).run(HttpRequest.GET("/123456/abc"))
  .assertEntity("Content");
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/mapSettings.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/pass.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/custom-directives.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/mapUnmatchedPath.html](https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/mapUnmatchedPath.html)*