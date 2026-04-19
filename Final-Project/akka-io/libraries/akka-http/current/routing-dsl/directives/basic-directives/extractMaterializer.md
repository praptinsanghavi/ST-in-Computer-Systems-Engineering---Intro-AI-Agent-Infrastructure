---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:56:54Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/extractMaterializer.html
title: extractMaterializer • Akka HTTP
---

# extractMaterializer • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# extractMaterializer

## Signature

```
def extractMaterializer: Directive1[Materializer]
```

## Description

Extracts the [`Materializer`](https://doc.akka.io/api/akka/2.10/akka/stream/Materializer.html "akka.stream.Materializer")[`Materializer`](https://doc.akka.io/japi/akka/2.10/akka/stream/Materializer.html "akka.stream.Materializer") from the [`RequestContext`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/RequestContext.html "akka.http.javadsl.server.RequestContext")[`RequestContext`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/RequestContext.html "akka.http.scaladsl.server.RequestContext"), which can be useful when you want to run an Akka Stream directly in your route.

See also [withMaterializer](withMaterializer.html) to see how to customise the used materializer for specific inner routes.

## Example

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/directives/BasicDirectivesExamplesSpec.scala#L84-L98 "Go to snippet source")val route =
  path("sample") {
    extractMaterializer { materializer =>
      complete {
        // explicitly use the `materializer`:
        Source.single(s"Materialized by ${SystemMaterializer(system).materializer.##}!")
          .runWith(Sink.head)(materializer)
      }
    }
  } // default materializer will be used

// tests:
Get("/sample") ~> route ~> check {
  responseAs[String] shouldEqual s"Materialized by ${SystemMaterializer(system).materializer.##}!"
}
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/directives/BasicDirectivesExamplesTest.java#L72-L337 "Go to snippet source")import static akka.http.javadsl.server.Directives.extractMaterializer;

final Route route = path("sample", () ->
  extractMaterializer(mat ->
    onSuccess(() ->
      // explicitly use the materializer:
      Source.single("Materialized by " + mat.hashCode() + "!")
        .runWith(Sink.head(), mat), Directives::complete
    )
  )
); // default materializer will be used

testRoute(route).run(HttpRequest.GET("/sample"))
  .assertEntity("Materialized by " + materializer().hashCode()+ "!");
```

## Code Examples

### Example 1: Signature

```scala
def extractMaterializer: Directive1[Materializer]
```

### Example 2: Example

```scala
val route =
  path("sample") {
    extractMaterializer { materializer =>
      complete {
        // explicitly use the `materializer`:
        Source.single(s"Materialized by ${SystemMaterializer(system).materializer.##}!")
          .runWith(Sink.head)(materializer)
      }
    }
  } // default materializer will be used

// tests:
Get("/sample") ~> route ~> check {
  responseAs[String] shouldEqual s"Materialized by ${SystemMaterializer(system).materializer.##}!"
}
```

### Example 3: Example

```java
import static akka.http.javadsl.server.Directives.extractMaterializer;

final Route route = path("sample", () ->
  extractMaterializer(mat ->
    onSuccess(() ->
      // explicitly use the materializer:
      Source.single("Materialized by " + mat.hashCode() + "!")
        .runWith(Sink.head(), mat), Directives::complete
    )
  )
); // default materializer will be used

testRoute(route).run(HttpRequest.GET("/sample"))
  .assertEntity("Materialized by " + materializer().hashCode()+ "!");
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/RequestContext.html
- https://doc.akka.io/api/akka/2.10/akka/stream/Materializer.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/RequestContext.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/Materializer.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/extractMatchedPath.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/extractParserSettings.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/withMaterializer.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/extractMaterializer.html](https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/extractMaterializer.html)*