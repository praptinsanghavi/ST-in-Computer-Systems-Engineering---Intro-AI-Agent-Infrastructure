---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:56:16Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/caching-directives/alwaysCache.html
title: alwaysCache • Akka HTTP
---

# alwaysCache • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# alwaysCache

## Signature

```
def alwaysCache[K](cache: Cache[K, RouteResult], keyer: PartialFunction[RequestContext, K]): Directive0
```

## Description

Like [cache](cache.html) but disregards a `Cache-Control` request header.

## Example

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/directives/CachingDirectivesExamplesSpec.scala#L12-L108 "Go to snippet source")import akka.http.scaladsl.server.directives.CachingDirectives._
import akka.http.scaladsl.server.RequestContext
import akka.http.scaladsl.model.Uri
import akka.http.scaladsl.model.headers.{ Authorization, `Cache-Control` }
import akka.http.scaladsl.model.headers.CacheDirectives.`no-cache`

//Example keyer for non-authenticated GET requests
val simpleKeyer: PartialFunction[RequestContext, Uri] = {
  val isGet: RequestContext => Boolean = _.request.method == GET
  val isAuthorized: RequestContext => Boolean =
    _.request.headers.exists(_.is(Authorization.lowercaseName))
  val result: PartialFunction[RequestContext, Uri] = {
    case r: RequestContext if isGet(r) && !isAuthorized(r) => r.request.uri
  }
  result
}

// Created outside the route to allow using
// the same cache across multiple calls
val myCache = routeCache[Uri]

var i = 0
val route =
  path("cached") {
    alwaysCache(myCache, simpleKeyer) {
      complete {
        i += 1
        i.toString
      }
    }
  }

Get("/cached") ~> route ~> check {
  responseAs[String] shouldEqual "1"
}
// now cached
Get("/cached") ~> route ~> check {
  responseAs[String] shouldEqual "1"
}
Get("/cached") ~> `Cache-Control`(`no-cache`) ~> route ~> check {
  responseAs[String] shouldEqual "1"
}
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/directives/CachingDirectivesExamplesTest.java#L95-L136 "Go to snippet source")final CachingSettings cachingSettings = CachingSettings.create(system());
// Example keyer for non-authenticated GET requests
final JavaPartialFunction<RequestContext, Uri> simpleKeyer = new JavaPartialFunction<RequestContext, Uri>() {
  public Uri apply(RequestContext in, boolean isCheck) {
    final HttpRequest request = in.getRequest();
    final boolean isGet = request.method() == HttpMethods.GET;
    final boolean isAuthorized = request.getHeader(Authorization.class).isPresent();

    if (isGet && !isAuthorized)
      return request.getUri();
    else
      throw noMatch();
  }
};

// Created outside the route to allow using
// the same cache across multiple calls
final Cache<Uri, RouteResult> myCache = routeCache(cachingSettings);

final AtomicInteger count = new AtomicInteger(0);
final Route route = path("cached", () ->
    alwaysCache(myCache, simpleKeyer, () ->
    extractUri(uri ->
      complete(String.format("Request for %s @ count %d", uri, count.incrementAndGet()))
    )
  )
);

// tests:
testRoute(route)
  .run(HttpRequest.GET("/cached"))
  .assertEntity("Request for http://example.com/cached @ count 1");

// now cached
testRoute(route)
  .run(HttpRequest.GET("/cached"))
  .assertEntity("Request for http://example.com/cached @ count 1");

final CacheControl noCache = CacheControl.create(CacheDirectives.NO_CACHE);
testRoute(route)
  .run(HttpRequest.GET("/cached").addHeader(noCache))
  .assertEntity("Request for http://example.com/cached @ count 1");
```

## Code Examples

### Example 1: Signature

```scala
def alwaysCache[K](cache: Cache[K, RouteResult], keyer: PartialFunction[RequestContext, K]): Directive0
```

### Example 2: Example

```scala
import akka.http.scaladsl.server.directives.CachingDirectives._
import akka.http.scaladsl.server.RequestContext
import akka.http.scaladsl.model.Uri
import akka.http.scaladsl.model.headers.{ Authorization, `Cache-Control` }
import akka.http.scaladsl.model.headers.CacheDirectives.`no-cache`

//Example keyer for non-authenticated GET requests
val simpleKeyer: PartialFunction[RequestContext, Uri] = {
  val isGet: RequestContext => Boolean = _.request.method == GET
  val isAuthorized: RequestContext => Boolean =
    _.request.headers.exists(_.is(Authorization.lowercaseName))
  val result: PartialFunction[RequestContext, Uri] = {
    case r: RequestContext if isGet(r) && !isAuthorized(r) => r.request.uri
  }
  result
}

// Created outside the route to allow using
// the same cache across multiple calls
val myCache = routeCache[Uri]

var i = 0
val route =
  path("cached") {
    alwaysCache(myCache, simpleKeyer) {
      complete {
        i += 1
        i.toString
      }
    }
  }

Get("/cached") ~> route ~> check {
  responseAs[String] shouldEqual "1"
}
// now cached
Get("/cached") ~> route ~> check {
  responseAs[String] shouldEqual "1"
}
Get("/cached") ~> `Cache-Control`(`no-cache`) ~> route ~> check {
  responseAs[String] shouldEqual "1"
}
```

### Example 3: Example

```java
final CachingSettings cachingSettings = CachingSettings.create(system());
// Example keyer for non-authenticated GET requests
final JavaPartialFunction<RequestContext, Uri> simpleKeyer = new JavaPartialFunction<RequestContext, Uri>() {
  public Uri apply(RequestContext in, boolean isCheck) {
    final HttpRequest request = in.getRequest();
    final boolean isGet = request.method() == HttpMethods.GET;
    final boolean isAuthorized = request.getHeader(Authorization.class).isPresent();

    if (isGet && !isAuthorized)
      return request.getUri();
    else
      throw noMatch();
  }
};

// Created outside the route to allow using
// the same cache across multiple calls
final Cache<Uri, RouteResult> myCache = routeCache(cachingSettings);

final AtomicInteger count = new AtomicInteger(0);
final Route route = path("cached", () ->
    alwaysCache(myCache, simpleKeyer, () ->
    extractUri(uri ->
      complete(String.format("Request for %s @ count %d", uri, count.incrementAndGet()))
    )
  )
);

// tests:
testRoute(route)
  .run(HttpRequest.GET("/cached"))
  .assertEntity("Request for http://example.com/cached @ count 1");

// now cached
testRoute(route)
  .run(HttpRequest.GET("/cached"))
  .assertEntity("Request for http://example.com/cached @ count 1");

final CacheControl noCache = CacheControl.create(CacheDirectives.NO_CACHE);
testRoute(route)
  .run(HttpRequest.GET("/cached").addHeader(noCache))
  .assertEntity("Request for http://example.com/cached @ count 1");
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/caching-directives/cache.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/caching-directives/cachingProhibited.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/caching-directives/alwaysCache.html](https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/caching-directives/alwaysCache.html)*