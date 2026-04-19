---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:57:37Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/mapInnerRoute.html
title: mapInnerRoute • Akka HTTP
---

# mapInnerRoute • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# mapInnerRoute

## Signature

```
def mapInnerRoute(f: Route => Route): Directive0
```

## Description

Changes the execution model of the inner route by wrapping it with arbitrary logic.

The `mapInnerRoute` directive is used as a building block for [Custom Directives](../custom-directives.html) to replace the inner route with any other route. Usually, the returned route wraps the original one with custom execution logic.

## Example

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/directives/BasicDirectivesExamplesSpec.scala#L383-L400 "Go to snippet source")val completeWithInnerException =
  mapInnerRoute { route => ctx =>
    try {
      route(ctx)
    } catch {
      case NonFatal(e) => ctx.complete(s"Got ${e.getClass.getSimpleName} '${e.getMessage}'")
    }
  }

val route =
  completeWithInnerException {
    complete(throw new IllegalArgumentException("BLIP! BLOP! Everything broke"))
  }

// tests:
Get("/") ~> route ~> check {
  responseAs[String] shouldEqual "Got IllegalArgumentException 'BLIP! BLOP! Everything broke'"
}
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/directives/BasicDirectivesExamplesTest.java#L188-L607 "Go to snippet source")import static akka.http.javadsl.server.Directives.mapInnerRoute;

// TODO: implement mapInnerRoute
```

## Code Examples

### Example 1: Signature

```scala
def mapInnerRoute(f: Route => Route): Directive0
```

### Example 2: Example

```scala
val completeWithInnerException =
  mapInnerRoute { route => ctx =>
    try {
      route(ctx)
    } catch {
      case NonFatal(e) => ctx.complete(s"Got ${e.getClass.getSimpleName} '${e.getMessage}'")
    }
  }

val route =
  completeWithInnerException {
    complete(throw new IllegalArgumentException("BLIP! BLOP! Everything broke"))
  }

// tests:
Get("/") ~> route ~> check {
  responseAs[String] shouldEqual "Got IllegalArgumentException 'BLIP! BLOP! Everything broke'"
}
```

### Example 3: Example

```java
import static akka.http.javadsl.server.Directives.mapInnerRoute;

// TODO: implement mapInnerRoute
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/extractUri.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/mapRejections.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/custom-directives.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/mapInnerRoute.html](https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/mapInnerRoute.html)*