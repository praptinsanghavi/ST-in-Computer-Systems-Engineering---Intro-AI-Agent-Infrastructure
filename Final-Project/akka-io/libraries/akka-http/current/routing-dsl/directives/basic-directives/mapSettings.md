---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:57:41Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/mapSettings.html
title: mapSettings • Akka HTTP
---

# mapSettings • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# mapSettings

## Signature

```
def mapSettings(f: RoutingSettings => RoutingSettings): Directive0
```

## Description

Transforms the [`RoutingSettings`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/settings/RoutingSettings.html "akka.http.javadsl.settings.RoutingSettings")[`RoutingSettings`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/settings/RoutingSettings.html "akka.http.scaladsl.settings.RoutingSettings") with a `RoutingSettings => RoutingSettings` function`Function<RoutingSettings, RoutingSettings>`.

See also [withSettings](withSettings.html) or [extractSettings](extractSettings.html).

## Example

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/directives/BasicDirectivesExamplesSpec.scala#L696-L710 "Go to snippet source")val tunedSettings = mapSettings { settings =>
  settings.withFileGetConditional(false)
}

val route =
  tunedSettings {
    extractSettings { (settings: RoutingSettings) =>
      complete(s"RoutingSettings.fileGetConditional = ${settings.fileGetConditional}")
    }
  }

// tests:
Get("/") ~> route ~> check {
  responseAs[String] shouldEqual s"RoutingSettings.fileGetConditional = false"
}
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/directives/BasicDirectivesExamplesTest.java#L136-L906 "Go to snippet source")import static akka.http.javadsl.server.Directives.mapSettings;

final Route route = mapSettings(settings ->
  settings.withFileGetConditional(false), () ->
  extractSettings(settings ->
    complete("RoutingSettings.fileGetConditional = " + settings.getFileGetConditional())
  )
);

// tests:
testRoute(route).run(HttpRequest.GET("/"))
  .assertEntity("RoutingSettings.fileGetConditional = false");
```

## Code Examples

### Example 1: Signature

```scala
def mapSettings(f: RoutingSettings => RoutingSettings): Directive0
```

### Example 2: Example

```scala
val tunedSettings = mapSettings { settings =>
  settings.withFileGetConditional(false)
}

val route =
  tunedSettings {
    extractSettings { (settings: RoutingSettings) =>
      complete(s"RoutingSettings.fileGetConditional = ${settings.fileGetConditional}")
    }
  }

// tests:
Get("/") ~> route ~> check {
  responseAs[String] shouldEqual s"RoutingSettings.fileGetConditional = false"
}
```

### Example 3: Example

```java
import static akka.http.javadsl.server.Directives.mapSettings;

final Route route = mapSettings(settings ->
  settings.withFileGetConditional(false), () ->
  extractSettings(settings ->
    complete("RoutingSettings.fileGetConditional = " + settings.getFileGetConditional())
  )
);

// tests:
testRoute(route).run(HttpRequest.GET("/"))
  .assertEntity("RoutingSettings.fileGetConditional = false");
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/settings/RoutingSettings.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/settings/RoutingSettings.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/extractSettings.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/mapRouteResultWith.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/mapUnmatchedPath.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/withSettings.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/mapSettings.html](https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/mapSettings.html)*