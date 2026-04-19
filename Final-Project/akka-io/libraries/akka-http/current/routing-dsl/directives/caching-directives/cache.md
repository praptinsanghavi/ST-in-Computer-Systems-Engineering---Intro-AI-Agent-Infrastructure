---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:56:19Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/caching-directives/cache.html
title: cache • Akka HTTP
---

# cache • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# cache

## Signature

```
def cache[K](cache: Cache[K, RouteResult], keyer: PartialFunction[RequestContext, K]): Directive0
```

## Description

Wraps its inner Route with caching support using the given [`Cache`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/caching/javadsl/Cache.html "akka.http.caching.javadsl.Cache")[`Cache`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/caching/scaladsl/Cache.html "akka.http.caching.scaladsl.Cache") implementation and the provided keyer function.

The directive tries to serve the request from the given cache and only if not found runs the inner route to generate a new response. A simple cache can be constructed using `routeCache` constructor.

The directive is implemented in terms of [cachingProhibited](cachingProhibited.html) and [alwaysCache](alwaysCache.html). This means that clients can circumvent the cache using a `Cache-Control` request header. This behavior may not be adequate depending on your backend implementation (i.e how expensive a call circumventing the cache into the backend is). If you want to force all requests to be handled by the cache use the [alwaysCache](alwaysCache.html) directive instead. In complexer cases, e.g. when the backend can validate that a cached request is still acceptable according to the request `Cache-Control` header the predefined caching directives may not be sufficient and a custom solution is necessary.

## Example

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/directives/CachingDirectivesExamplesSpec.scala#L12-L63 "Go to snippet source")import akka.http.scaladsl.server.directives.CachingDirectives._
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
    cache(myCache, simpleKeyer) {
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
// caching prevented
Get("/cached") ~> `Cache-Control`(`no-cache`) ~> route ~> check {
  responseAs[String] shouldEqual "2"
}
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/directives/CachingDirectivesExamplesTest.java#L37-L88 "Go to snippet source")import static akka.http.javadsl.server.Directives.complete;
import static akka.http.javadsl.server.Directives.extractUri;
import static akka.http.javadsl.server.Directives.path;
import static akka.http.javadsl.server.PathMatchers.segment;
final CachingSettings cachingSettings = CachingSettings.create(system());
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
final Route route = path(segment("cached"), () ->
  cache(myCache, simpleKeyer, () ->
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

// caching prevented
final CacheControl noCache = CacheControl.create(CacheDirectives.NO_CACHE);
testRoute(route).run(HttpRequest.GET("/cached").addHeader(noCache))
  .assertEntity("Request for http://example.com/cached @ count 2");
```

## Code Examples

### Example 1: Signature

```scala
def cache[K](cache: Cache[K, RouteResult], keyer: PartialFunction[RequestContext, K]): Directive0
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
    cache(myCache, simpleKeyer) {
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
// caching prevented
Get("/cached") ~> `Cache-Control`(`no-cache`) ~> route ~> check {
  responseAs[String] shouldEqual "2"
}
```

### Example 3: Example

```java
import static akka.http.javadsl.server.Directives.complete;
import static akka.http.javadsl.server.Directives.extractUri;
import static akka.http.javadsl.server.Directives.path;
import static akka.http.javadsl.server.PathMatchers.segment;
final CachingSettings cachingSettings = CachingSettings.create(system());
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
final Route route = path(segment("cached"), () ->
  cache(myCache, simpleKeyer, () ->
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

// caching prevented
final CacheControl noCache = CacheControl.create(CacheDirectives.NO_CACHE);
testRoute(route).run(HttpRequest.GET("/cached").addHeader(noCache))
  .assertEntity("Request for http://example.com/cached @ count 2");
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/caching/scaladsl/Cache.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/caching/javadsl/Cache.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/caching-directives/alwaysCache.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/caching-directives/cachingProhibited.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/caching-directives/index.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/caching-directives/cache.html](https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/caching-directives/cache.html)*