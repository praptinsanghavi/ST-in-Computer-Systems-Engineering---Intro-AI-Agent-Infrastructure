---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:56:20Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/caching-directives/cachingProhibited.html
title: cachingProhibited • Akka HTTP
---

# cachingProhibited • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# cachingProhibited

## Signature

```
def cachingProhibited: Directive0
```

## Description

This directive is used to filter out requests that forbid caching. It is used as a building block of the [cache](cache.html) directive to prevent caching if the client requests so.

## Example

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/directives/CachingDirectivesExamplesSpec.scala#L113-L126 "Go to snippet source")import akka.http.scaladsl.model.headers.`Cache-Control`
import akka.http.scaladsl.model.headers.CacheDirectives.`no-cache`

val route =
  cachingProhibited {
    complete("abc")
  }

Get("/") ~> route ~> check {
  handled shouldEqual false
}
Get("/") ~> `Cache-Control`(`no-cache`) ~> route ~> check {
  responseAs[String] shouldEqual "abc"
}
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/directives/CachingDirectivesExamplesTest.java#L143-L155 "Go to snippet source")final Route route = cachingProhibited(() ->
  complete("abc")
);

// tests:
testRoute(route)
  .run(HttpRequest.GET("/"))
  .assertStatusCode(StatusCodes.NOT_FOUND);

final CacheControl noCache = CacheControl.create(CacheDirectives.NO_CACHE);
testRoute(route)
  .run(HttpRequest.GET("/").addHeader(noCache))
  .assertEntity("abc");
```

## Code Examples

### Example 1: Signature

```scala
def cachingProhibited: Directive0
```

### Example 2: Example

```scala
import akka.http.scaladsl.model.headers.`Cache-Control`
import akka.http.scaladsl.model.headers.CacheDirectives.`no-cache`

val route =
  cachingProhibited {
    complete("abc")
  }

Get("/") ~> route ~> check {
  handled shouldEqual false
}
Get("/") ~> `Cache-Control`(`no-cache`) ~> route ~> check {
  responseAs[String] shouldEqual "abc"
}
```

### Example 3: Example

```java
final Route route = cachingProhibited(() ->
  complete("abc")
);

// tests:
testRoute(route)
  .run(HttpRequest.GET("/"))
  .assertStatusCode(StatusCodes.NOT_FOUND);

final CacheControl noCache = CacheControl.create(CacheDirectives.NO_CACHE);
testRoute(route)
  .run(HttpRequest.GET("/").addHeader(noCache))
  .assertEntity("abc");
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/caching-directives/alwaysCache.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/caching-directives/cache.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/coding-directives/index.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/caching-directives/cachingProhibited.html](https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/caching-directives/cachingProhibited.html)*