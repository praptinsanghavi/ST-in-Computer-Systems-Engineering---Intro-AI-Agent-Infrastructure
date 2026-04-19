---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:57:10Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/extractSettings.html
title: extractSettings • Akka HTTP
---

# extractSettings • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# extractSettings

## Signature

```
def extractSettings: Directive1[RoutingSettings]
```

## Description

Extracts the [`RoutingSettings`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/settings/RoutingSettings.html "akka.http.javadsl.settings.RoutingSettings")[`RoutingSettings`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/settings/RoutingSettings.html "akka.http.scaladsl.settings.RoutingSettings") from the [`RequestContext`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/RequestContext.html "akka.http.javadsl.server.RequestContext")[`RequestContext`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/RequestContext.html "akka.http.scaladsl.server.RequestContext").

By default the settings of the `Http()` extension running the route will be returned. It is possible to override the settings for specific sub\-routes by using the [withSettings](withSettings.html) directive.

## Example

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/directives/BasicDirectivesExamplesSpec.scala#L683-L691 "Go to snippet source")val route =
  extractSettings { (settings: RoutingSettings) =>
    complete(s"RoutingSettings.renderVanityFooter = ${settings.renderVanityFooter}")
  }

// tests:
Get("/") ~> route ~> check {
  responseAs[String] shouldEqual "RoutingSettings.renderVanityFooter = true"
}
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/directives/BasicDirectivesExamplesTest.java#L144-L924 "Go to snippet source")import static akka.http.javadsl.server.Directives.extractRequestContext;

final Route route = extractRequestContext(ctx -> {
  ctx.getLog().debug("Using access to additional context available, like the logger.");
  final HttpRequest request = ctx.getRequest();
  return complete("Request method is " + request.method().name() +
                    " and content-type is " + request.entity().getContentType());
});

// tests:
testRoute(route).run(HttpRequest.POST("/").withEntity("text"))
  .assertEntity("Request method is POST and content-type is text/plain; charset=UTF-8");
testRoute(route).run(HttpRequest.GET("/"))
  .assertEntity("Request method is GET and content-type is none/none");
```

## Code Examples

### Example 1: Signature

```scala
def extractSettings: Directive1[RoutingSettings]
```

### Example 2: Example

```scala
val route =
  extractSettings { (settings: RoutingSettings) =>
    complete(s"RoutingSettings.renderVanityFooter = ${settings.renderVanityFooter}")
  }

// tests:
Get("/") ~> route ~> check {
  responseAs[String] shouldEqual "RoutingSettings.renderVanityFooter = true"
}
```

### Example 3: Example

```java
import static akka.http.javadsl.server.Directives.extractRequestContext;

final Route route = extractRequestContext(ctx -> {
  ctx.getLog().debug("Using access to additional context available, like the logger.");
  final HttpRequest request = ctx.getRequest();
  return complete("Request method is " + request.method().name() +
                    " and content-type is " + request.entity().getContentType());
});

// tests:
testRoute(route).run(HttpRequest.POST("/").withEntity("text"))
  .assertEntity("Request method is POST and content-type is text/plain; charset=UTF-8");
testRoute(route).run(HttpRequest.GET("/"))
  .assertEntity("Request method is GET and content-type is none/none");
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/RequestContext.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/settings/RoutingSettings.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/RequestContext.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/settings/RoutingSettings.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/extractRequestEntity.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/extractStrictEntity.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/withSettings.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/extractSettings.html](https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/extractSettings.html)*