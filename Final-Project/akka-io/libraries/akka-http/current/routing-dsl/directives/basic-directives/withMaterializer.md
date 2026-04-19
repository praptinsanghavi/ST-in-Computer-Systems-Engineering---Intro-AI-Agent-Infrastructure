---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:58:17Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/withMaterializer.html
title: withMaterializer • Akka HTTP
---

# withMaterializer • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# withMaterializer

## Signature

```
def withMaterializer(materializer: Materializer): Directive0
```

## Description

Allows running an inner route using an alternative [`Materializer`](https://doc.akka.io/api/akka/2.10/akka/stream/Materializer.html "akka.stream.Materializer")[`Materializer`](https://doc.akka.io/japi/akka/2.10/akka/stream/Materializer.html "akka.stream.Materializer") in place of the default one.

The materializer can be extracted in an inner route using [extractMaterializer](extractMaterializer.html) directly, or used by directives which internally extract the materializer without surfacing this fact in the API (e.g. responding with a Chunked entity).

## Example

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/directives/BasicDirectivesExamplesSpec.scala#L53-L79 "Go to snippet source")val special = Materializer(system).withNamePrefix("special")

def sample() =
  path("sample") {
    extractMaterializer { mat =>
      complete {
        // explicitly use the materializer:
        Source.single(s"Materialized by ${mat.##}!")
          .runWith(Sink.head)(mat)
      }
    }
  }

val route =
  pathPrefix("special") {
    withMaterializer(special) {
      sample() // `special` materializer will be used
    }
  } ~ sample() // default materializer will be used

// tests:
Get("/sample") ~> route ~> check {
  responseAs[String] shouldEqual s"Materialized by ${SystemMaterializer(system).materializer.##}!"
}
Get("/special/sample") ~> route ~> check {
  responseAs[String] shouldEqual s"Materialized by ${special.##}!"
}
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/directives/BasicDirectivesExamplesTest.java#L68-L319 "Go to snippet source")import static akka.http.javadsl.server.Directives.withMaterializer;

final ActorMaterializerSettings settings = ActorMaterializerSettings.create(system());
final Materializer special = akka.stream.ActorMaterializer.create(settings, system(), "special");

final Route sample = path("sample", () ->
  extractMaterializer(mat ->
    onSuccess(() ->
      // explicitly use the materializer:
      Source.single("Materialized by " + mat.hashCode() + "!")
        .runWith(Sink.head(), mat), Directives::complete
    )
  )
);

final Route route = Directives.concat(
  pathPrefix("special", () ->
    withMaterializer(special, () -> sample) // `special` materializer will be used
  ),
  sample // default materializer will be used
);

// tests:
testRoute(route).run(HttpRequest.GET("/sample"))
  .assertEntity("Materialized by " + materializer().hashCode()+ "!");
testRoute(route).run(HttpRequest.GET("/special/sample"))
  .assertEntity("Materialized by " + special.hashCode()+ "!");
```

## Code Examples

### Example 1: Signature

```scala
def withMaterializer(materializer: Materializer): Directive0
```

### Example 2: Example

```scala
val special = Materializer(system).withNamePrefix("special")

def sample() =
  path("sample") {
    extractMaterializer { mat =>
      complete {
        // explicitly use the materializer:
        Source.single(s"Materialized by ${mat.##}!")
          .runWith(Sink.head)(mat)
      }
    }
  }

val route =
  pathPrefix("special") {
    withMaterializer(special) {
      sample() // `special` materializer will be used
    }
  } ~ sample() // default materializer will be used

// tests:
Get("/sample") ~> route ~> check {
  responseAs[String] shouldEqual s"Materialized by ${SystemMaterializer(system).materializer.##}!"
}
Get("/special/sample") ~> route ~> check {
  responseAs[String] shouldEqual s"Materialized by ${special.##}!"
}
```

### Example 3: Example

```java
import static akka.http.javadsl.server.Directives.withMaterializer;

final ActorMaterializerSettings settings = ActorMaterializerSettings.create(system());
final Materializer special = akka.stream.ActorMaterializer.create(settings, system(), "special");

final Route sample = path("sample", () ->
  extractMaterializer(mat ->
    onSuccess(() ->
      // explicitly use the materializer:
      Source.single("Materialized by " + mat.hashCode() + "!")
        .runWith(Sink.head(), mat), Directives::complete
    )
  )
);

final Route route = Directives.concat(
  pathPrefix("special", () ->
    withMaterializer(special, () -> sample) // `special` materializer will be used
  ),
  sample // default materializer will be used
);

// tests:
testRoute(route).run(HttpRequest.GET("/sample"))
  .assertEntity("Materialized by " + materializer().hashCode()+ "!");
testRoute(route).run(HttpRequest.GET("/special/sample"))
  .assertEntity("Materialized by " + special.hashCode()+ "!");
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka/2.10/akka/stream/Materializer.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/Materializer.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/extractMaterializer.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/withLog.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/withSettings.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/withMaterializer.html](https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/withMaterializer.html)*