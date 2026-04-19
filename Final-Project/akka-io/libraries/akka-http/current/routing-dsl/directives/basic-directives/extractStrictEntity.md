---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:28:11Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/extractStrictEntity.html
title: extractStrictEntity • Akka HTTP
---

# extractStrictEntity • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# extractStrictEntity

## Signature

```
def extractStrictEntity(timeout: FiniteDuration): Directive1[HttpEntity.Strict]
def extractStrictEntity(timeout: FiniteDuration, maxBytes: Long): Directive1[HttpEntity.Strict]
```

## Description

Extracts the strict http entity as `HttpEntity.Strict` from the [`RequestContext`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/RequestContext.html "akka.http.javadsl.server.RequestContext")[`RequestContext`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/RequestContext.html "akka.http.scaladsl.server.RequestContext").

A timeout parameter is given and if the stream isn’t completed after the timeout, the directive will be failed.

Warning
The directive will read the request entity into memory within the size limit(8M by default) and effectively disable streaming. The size limit can be configured globally with `akka.http.parsing.max-content-length` or overridden by wrapping with [withSizeLimit](../misc-directives/withSizeLimit.html) or [withoutSizeLimit](../misc-directives/withoutSizeLimit.html) directive.

## Example

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/directives/BasicDirectivesExamplesSpec.scala#L860-L869 "Go to snippet source")import scala.concurrent.duration._
val route = extractStrictEntity(3.seconds) { entity =>
  complete(entity.data.utf8String)
}

// tests:
val dataBytes = Source.fromIterator(() => Iterator.range(1, 10).map(x => ByteString(x.toString)))
Post("/", HttpEntity(ContentTypes.`text/plain(UTF-8)`, data = dataBytes)) ~> route ~> check {
  responseAs[String] shouldEqual "123456789"
}
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/directives/BasicDirectivesExamplesTest.java#L168-L1075 "Go to snippet source")import static akka.http.javadsl.server.Directives.extractStrictEntity;

final FiniteDuration timeout = FiniteDuration.create(3, TimeUnit.SECONDS);
final Route route = extractStrictEntity(timeout, strict ->
  complete(strict.getData().utf8String())
);

// tests:
final Iterator<ByteString> iterator = Arrays.asList(
  ByteString.fromString("1"),
  ByteString.fromString("2"),
  ByteString.fromString("3")).iterator();
final Source<ByteString, NotUsed> dataBytes = Source.fromIterator(() -> iterator);
testRoute(route).run(
  HttpRequest.POST("/")
    .withEntity(HttpEntities.create(ContentTypes.TEXT_PLAIN_UTF8, dataBytes))
).assertEntity("123");
```

## Code Examples

### Example 1: Signature

```scala
def extractStrictEntity(timeout: FiniteDuration): Directive1[HttpEntity.Strict]
def extractStrictEntity(timeout: FiniteDuration, maxBytes: Long): Directive1[HttpEntity.Strict]
```

### Example 2: Example

```scala
import scala.concurrent.duration._
val route = extractStrictEntity(3.seconds) { entity =>
  complete(entity.data.utf8String)
}

// tests:
val dataBytes = Source.fromIterator(() => Iterator.range(1, 10).map(x => ByteString(x.toString)))
Post("/", HttpEntity(ContentTypes.`text/plain(UTF-8)`, data = dataBytes)) ~> route ~> check {
  responseAs[String] shouldEqual "123456789"
}
```

### Example 3: Example

```java
import static akka.http.javadsl.server.Directives.extractStrictEntity;

final FiniteDuration timeout = FiniteDuration.create(3, TimeUnit.SECONDS);
final Route route = extractStrictEntity(timeout, strict ->
  complete(strict.getData().utf8String())
);

// tests:
final Iterator<ByteString> iterator = Arrays.asList(
  ByteString.fromString("1"),
  ByteString.fromString("2"),
  ByteString.fromString("3")).iterator();
final Source<ByteString, NotUsed> dataBytes = Source.fromIterator(() -> iterator);
testRoute(route).run(
  HttpRequest.POST("/")
    .withEntity(HttpEntities.create(ContentTypes.TEXT_PLAIN_UTF8, dataBytes))
).assertEntity("123");
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/RequestContext.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/RequestContext.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/extractSettings.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/extractUnmatchedPath.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/misc-directives/withSizeLimit.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/misc-directives/withoutSizeLimit.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/extractStrictEntity.html](https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/extractStrictEntity.html)*