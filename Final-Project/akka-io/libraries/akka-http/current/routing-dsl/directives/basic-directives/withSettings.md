---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:58:19Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/withSettings.html
title: withSettings • Akka HTTP
---

# withSettings • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# withSettings

## Signature

```
def withSettings(settings: RoutingSettings): Directive0
```

## Description

Allows running an inner route using an alternative [`RoutingSettings`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/settings/RoutingSettings.html "akka.http.javadsl.settings.RoutingSettings")[`RoutingSettings`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/settings/RoutingSettings.html "akka.http.scaladsl.settings.RoutingSettings") in place of the default one.

The execution context can be extracted in an inner route using [extractSettings](extractSettings.html) directly, or used by directives which internally extract the materializer without surfacing this fact in the API.

## Example

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/directives/BasicDirectivesExamplesSpec.scala#L185-L208 "Go to snippet source")val special = RoutingSettings(system).withFileGetConditional(false)

def sample() =
  path("sample") {
    // internally uses fileGetConditional setting
    getFromFile("example.json")
  }

val route =
  get {
    pathPrefix("special") {
      withSettings(special) {
        sample() // ETag/`If-Modified-Since` disabled
      }
    } ~ sample() // ETag/`If-Modified-Since` enabled
  }

// tests:
Post("/special/sample") ~> route ~> check {
  responseAs[String] shouldEqual s"{}"
}
Get("/sample") ~> route ~> check {
  responseAs[String] shouldEqual "{}"
}
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/directives/BasicDirectivesExamplesTest.java#L92-L450 "Go to snippet source")import static akka.http.javadsl.server.Directives.withSettings;

final RoutingSettings special =
  RoutingSettings
    .create(system().settings().config())
    .withFileGetConditional(false);

// internally uses fileGetConditional setting
final Route sample = path("sample", () -> getFromFile("example.json"));

final Route route = get(() ->
  Directives.concat(
    pathPrefix("special", () ->
      // ETag/`If-Modified-Since` disabled
      withSettings(special, () -> sample)
    ),
    sample // ETag/`If-Modified-Since` enabled
  )
);

// tests:
testRoute(route).run(HttpRequest.GET("/special/sample"))
  .assertEntity("{}");
testRoute(route).run(HttpRequest.GET("/sample"))
  .assertEntity("{}");
```

## Code Examples

### Example 1: Signature

```scala
def withSettings(settings: RoutingSettings): Directive0
```

### Example 2: Example

```scala
val special = RoutingSettings(system).withFileGetConditional(false)

def sample() =
  path("sample") {
    // internally uses fileGetConditional setting
    getFromFile("example.json")
  }

val route =
  get {
    pathPrefix("special") {
      withSettings(special) {
        sample() // ETag/`If-Modified-Since` disabled
      }
    } ~ sample() // ETag/`If-Modified-Since` enabled
  }

// tests:
Post("/special/sample") ~> route ~> check {
  responseAs[String] shouldEqual s"{}"
}
Get("/sample") ~> route ~> check {
  responseAs[String] shouldEqual "{}"
}
```

### Example 3: Example

```java
import static akka.http.javadsl.server.Directives.withSettings;

final RoutingSettings special =
  RoutingSettings
    .create(system().settings().config())
    .withFileGetConditional(false);

// internally uses fileGetConditional setting
final Route sample = path("sample", () -> getFromFile("example.json"));

final Route route = get(() ->
  Directives.concat(
    pathPrefix("special", () ->
      // ETag/`If-Modified-Since` disabled
      withSettings(special, () -> sample)
    ),
    sample // ETag/`If-Modified-Since` enabled
  )
);

// tests:
testRoute(route).run(HttpRequest.GET("/special/sample"))
  .assertEntity("{}");
testRoute(route).run(HttpRequest.GET("/sample"))
  .assertEntity("{}");
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/settings/RoutingSettings.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/settings/RoutingSettings.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/extractSettings.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/withMaterializer.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/cache-condition-directives/index.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/withSettings.html](https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/withSettings.html)*