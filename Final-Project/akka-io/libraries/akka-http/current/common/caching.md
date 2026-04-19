---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:29:26Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/common/caching.html
title: Caching • Akka HTTP
---

# Caching • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Caching

Akka HTTP’s caching support provides a lightweight and fast in\-memory caching functionality based on futures. The primary use\-case is the “wrapping” of an expensive operation with a caching layer that, based on a certain key of type `K`, runs the wrapped operation only once and returns the cached value for all future accesses for the same key (as long as the respective entry has not expired).

Akka HTTP comes with one implementation of the [`Cache`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/caching/javadsl/Cache.html "akka.http.caching.javadsl.Cache")[`Cache`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/caching/scaladsl/Cache.html "akka.http.caching.scaladsl.Cache") API built on [Caffeine](https://github.com/ben-manes/caffeine/) featuring frequency\-biased cache eviction semantics with support for time\-based entry expiration.

## Dependency

Note
The Akka dependencies are available from Akka’s secure library repository. To access them you need to use a secure, tokenized URL as specified at <https://account.akka.io/token>.

To use Akka HTTP Caching, add the module to your project:

sbt
```
val AkkaHttpVersion = "10.7.4"
libraryDependencies += "com.typesafe.akka" %% "akka-http-caching" % AkkaHttpVersion
```
Gradle
```
def versions = [
  ScalaBinary: "2.13"
]
dependencies {
  implementation platform("com.typesafe.akka:akka-http-bom_${versions.ScalaBinary}:10.7.4")

  implementation "com.typesafe.akka:akka-http-caching_${versions.ScalaBinary}"
}
```
Maven
```
<properties>
  <scala.binary.version>2.13</scala.binary.version>
</properties>
<dependencyManagement>
  <dependencies>
    <dependency>
      <groupId>com.typesafe.akka</groupId>
      <artifactId>akka-http-bom_${scala.binary.version}</artifactId>
      <version>10.7.4</version>
      <type>pom</type>
      <scope>import</scope>
    </dependency&gt
  </dependencies>
</dependencyManagement>
<dependencies&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-http-caching_${scala.binary.version}</artifactId>
  </dependency&gt
</dependencies>
```

## Basic design

The central idea of the cache API is to not store the actual values of type `T` themselves in the cache but rather the corresponding futures, i.e. instances of type `CompletableFuture<T>``Future[T]`. This approach has the advantage of taking care of the thundering herds problem where many requests to a particular cache key (e.g. a resource URI) arrive before the first one could be completed. Normally (without special guarding techniques, like so\-called “cowboy” entries) this can cause many requests to compete for system resources while trying to compute the same result thereby greatly reducing overall system performance. When you use an Akka HTTP cache the very first request that arrives for a certain cache key causes a future to be put into the cache which all later requests then “hook into”. As soon as the first request completes all other ones complete as well. This minimizes processing time and server load for all requests.

All Akka HTTP cache implementations adheres to the [`Cache`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/caching/javadsl/Cache.html "akka.http.caching.javadsl.Cache")[`Cache`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/caching/scaladsl/Cache.html "akka.http.caching.scaladsl.Cache") interfaceclass, which allows you to interact with the cache.

Along with the cache API, the routing DSL provides several [caching directives](../routing-dsl/directives/caching-directives/index.html) to use caching in your routes.

## Frequency\-biased LFU cache

The frequency\-biased LFU cache implementation has a defined maximum number of entries it can store. After the maximum capacity is reached the cache will evict entries that are less likely to be used again. For example, the cache may evict an entry because it hasn’t been used recently or very often.

Time\-based entry expiration is enabled when time\-to\-live and/or time\-to\-idle expirations are set to a finite duration. The former provides an upper limit to the time period an entry is allowed to remain in the cache while the latter limits the maximum time an entry is kept without having been accessed, ie. either read or updated. If both values are finite the time\-to\-live has to be greater or equal than the time\-to\-idle.

Note
Expired entries are only evicted upon next access (or by being thrown out by the capacity constraint), so they might prevent garbage collection of their values for longer than expected.

For simple cases, configure the capacity and expiration settings in your `application.conf` file via the settings under `akka.http.caching` and use `LfuCache.create()``LfuCache.apply()` to create the cache. For more advanced usage you can create an [`LfuCache`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/caching/LfuCache$.html "akka.http.caching.LfuCache")[`LfuCache`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/caching/LfuCache.html "akka.http.caching.LfuCache") with settings specialized for your use case:

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/directives/CachingDirectivesExamplesTest.java#L30-L33 "Go to snippet source")import akka.http.caching.javadsl.Cache;
import akka.http.caching.javadsl.CachingSettings;
import akka.http.caching.javadsl.LfuCacheSettings;
import akka.http.caching.LfuCache;
import static akka.http.javadsl.server.directives.CachingDirectives.*;
import java.util.concurrent.TimeUnit;

// Use the request's URI as the cache's key
final JavaPartialFunction<RequestContext, Uri> keyerFunction = new JavaPartialFunction<RequestContext, Uri>() {
  public Uri apply(RequestContext in, boolean isCheck) {
    return in.getRequest().getUri();
  }
};
final CachingSettings defaultCachingSettings = CachingSettings.create(system());
final LfuCacheSettings lfuCacheSettings = defaultCachingSettings.lfuCacheSettings()
  .withInitialCapacity(25)
  .withMaxCapacity(50)
  .withTimeToLive(Duration.create(20, TimeUnit.SECONDS))
  .withTimeToIdle(Duration.create(10, TimeUnit.SECONDS));
final CachingSettings cachingSettings = defaultCachingSettings.withLfuCacheSettings(lfuCacheSettings);
final Cache<Uri, RouteResult> lfuCache = LfuCache.create(cachingSettings);

// Create the route
final Route route = cache(lfuCache, keyerFunction, () -> innerRoute);
```

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/directives/CachingDirectivesExamplesSpec.scala#L132-L144 "Go to snippet source")import akka.http.caching.scaladsl.Cache
import akka.http.caching.scaladsl.CachingSettings
import akka.http.caching.LfuCache
import akka.http.scaladsl.server.RequestContext
import akka.http.scaladsl.server.RouteResult
import akka.http.scaladsl.model.Uri
import akka.http.scaladsl.server.directives.CachingDirectives._
import scala.concurrent.duration._

// Use the request's URI as the cache's key
val keyerFunction: PartialFunction[RequestContext, Uri] = {
  case r: RequestContext => r.request.uri
}
val defaultCachingSettings = CachingSettings(system)
val lfuCacheSettings =
  defaultCachingSettings.lfuCacheSettings
    .withInitialCapacity(25)
    .withMaxCapacity(50)
    .withTimeToLive(20.seconds)
    .withTimeToIdle(10.seconds)
val cachingSettings =
  defaultCachingSettings.withLfuCacheSettings(lfuCacheSettings)
val lfuCache: Cache[Uri, RouteResult] = LfuCache(cachingSettings)

// Create the route
val route = cache(lfuCache, keyerFunction)(innerRoute)
```

## Code Examples

### Example 1: Dependency

```scala
val AkkaHttpVersion = "10.7.4"
libraryDependencies += "com.typesafe.akka" %% "akka-http-caching" % AkkaHttpVersion
```

### Example 2: Dependency

```gradle
def versions = [
  ScalaBinary: "2.13"
]
dependencies {
  implementation platform("com.typesafe.akka:akka-http-bom_${versions.ScalaBinary}:10.7.4")

  implementation "com.typesafe.akka:akka-http-caching_${versions.ScalaBinary}"
}
```

### Example 3: Dependency

```xml
<properties>
  <scala.binary.version>2.13</scala.binary.version>
</properties>
<dependencyManagement>
  <dependencies>
    <dependency>
      <groupId>com.typesafe.akka</groupId>
      <artifactId>akka-http-bom_${scala.binary.version}</artifactId>
      <version>10.7.4</version>
      <type>pom</type>
      <scope>import</scope>
    </dependency&gt
  </dependencies>
</dependencyManagement>
<dependencies&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-http-caching_${scala.binary.version}</artifactId>
  </dependency&gt
</dependencies>
```

### Example 4: Frequency-biased LFU cache

```java
import akka.http.caching.javadsl.Cache;
import akka.http.caching.javadsl.CachingSettings;
import akka.http.caching.javadsl.LfuCacheSettings;
import akka.http.caching.LfuCache;
import static akka.http.javadsl.server.directives.CachingDirectives.*;
import java.util.concurrent.TimeUnit;

// Use the request's URI as the cache's key
final JavaPartialFunction<RequestContext, Uri> keyerFunction = new JavaPartialFunction<RequestContext, Uri>() {
  public Uri apply(RequestContext in, boolean isCheck) {
    return in.getRequest().getUri();
  }
};
final CachingSettings defaultCachingSettings = CachingSettings.create(system());
final LfuCacheSettings lfuCacheSettings = defaultCachingSettings.lfuCacheSettings()
  .withInitialCapacity(25)
  .withMaxCapacity(50)
  .withTimeToLive(Duration.create(20, TimeUnit.SECONDS))
  .withTimeToIdle(Duration.create(10, TimeUnit.SECONDS));
final CachingSettings cachingSettings = defaultCachingSettings.withLfuCacheSettings(lfuCacheSettings);
final Cache<Uri, RouteResult> lfuCache = LfuCache.create(cachingSettings);

// Create the route
final Route route = cache(lfuCache, keyerFunction, () -> innerRoute);
```

### Example 5: Frequency-biased LFU cache

```scala
import akka.http.caching.scaladsl.Cache
import akka.http.caching.scaladsl.CachingSettings
import akka.http.caching.LfuCache
import akka.http.scaladsl.server.RequestContext
import akka.http.scaladsl.server.RouteResult
import akka.http.scaladsl.model.Uri
import akka.http.scaladsl.server.directives.CachingDirectives._
import scala.concurrent.duration._

// Use the request's URI as the cache's key
val keyerFunction: PartialFunction[RequestContext, Uri] = {
  case r: RequestContext => r.request.uri
}
val defaultCachingSettings = CachingSettings(system)
val lfuCacheSettings =
  defaultCachingSettings.lfuCacheSettings
    .withInitialCapacity(25)
    .withMaxCapacity(50)
    .withTimeToLive(20.seconds)
    .withTimeToIdle(10.seconds)
val cachingSettings =
  defaultCachingSettings.withLfuCacheSettings(lfuCacheSettings)
val lfuCache: Cache[Uri, RouteResult] = LfuCache(cachingSettings)

// Create the route
val route = cache(lfuCache, keyerFunction)(innerRoute)
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/caching/LfuCache$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/caching/scaladsl/Cache.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/caching/LfuCache.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/caching/javadsl/Cache.html
- https://doc.akka.io/libraries/akka-http/current/common/timeouts.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/caching-directives/index.html
- https://doc.akka.io/libraries/akka-http/current/server-side/index.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/common/caching.html](https://doc.akka.io/libraries/akka-http/current/common/caching.html)*