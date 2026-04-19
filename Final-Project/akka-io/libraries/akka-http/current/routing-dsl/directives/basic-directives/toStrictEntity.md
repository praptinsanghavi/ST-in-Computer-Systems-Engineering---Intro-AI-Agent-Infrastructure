---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:29:26Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/toStrictEntity.html
title: toStrictEntity • Akka HTTP
---

# toStrictEntity • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# toStrictEntity

## Signature

```
def toStrictEntity(timeout: FiniteDuration): Directive0
def toStrictEntity(timeout: FiniteDuration, maxBytes: Long): Directive0
```

## Description

Transforms the request entity to strict entity before it is handled by the inner route.

A timeout parameter is given and if the stream isn’t completed after the timeout, the directive will be failed.

Warning
The directive will read the request entity into memory within the size limit(8M by default) and effectively disable streaming. The size limit can be configured globally with `akka.http.parsing.max-content-length` or overridden by wrapping with [withSizeLimit](../misc-directives/withSizeLimit.html) or [withoutSizeLimit](../misc-directives/withoutSizeLimit.html) directive.

## Example

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/directives/BasicDirectivesExamplesSpec.scala#L874-L890 "Go to snippet source")import scala.concurrent.duration._
val route = toStrictEntity(3.seconds) {
  extractRequest { req =>
    req.entity match {
      case strict: HttpEntity.Strict =>
        complete(s"Request entity is strict, data=${strict.data.utf8String}")
      case _ =>
        complete("Ooops, request entity is not strict!")
    }
  }
}

// tests:
val dataBytes = Source.fromIterator(() => Iterator.range(1, 10).map(x => ByteString(x.toString)))
Post("/", HttpEntity(ContentTypes.`text/plain(UTF-8)`, data = dataBytes)) ~> route ~> check {
  responseAs[String] shouldEqual "Request entity is strict, data=123456789"
}
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/directives/BasicDirectivesExamplesTest.java#L172-L1103 "Go to snippet source")import static akka.http.javadsl.server.Directives.toStrictEntity;

final FiniteDuration timeout = FiniteDuration.create(3, TimeUnit.SECONDS);
final Route route = toStrictEntity(timeout, () ->
  extractRequest(req -> {
    if (req.entity() instanceof HttpEntity.Strict) {
      final HttpEntity.Strict strict = (HttpEntity.Strict)req.entity();
      return complete("Request entity is strict, data=" + strict.getData().utf8String());
    } else {
      return complete("Ooops, request entity is not strict!");
    }
  })
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
).assertEntity("Request entity is strict, data=123");
```

## Code Examples

### Example 1: Signature

```scala
def toStrictEntity(timeout: FiniteDuration): Directive0
def toStrictEntity(timeout: FiniteDuration, maxBytes: Long): Directive0
```

### Example 2: Example

```scala
import scala.concurrent.duration._
val route = toStrictEntity(3.seconds) {
  extractRequest { req =>
    req.entity match {
      case strict: HttpEntity.Strict =>
        complete(s"Request entity is strict, data=${strict.data.utf8String}")
      case _ =>
        complete("Ooops, request entity is not strict!")
    }
  }
}

// tests:
val dataBytes = Source.fromIterator(() => Iterator.range(1, 10).map(x => ByteString(x.toString)))
Post("/", HttpEntity(ContentTypes.`text/plain(UTF-8)`, data = dataBytes)) ~> route ~> check {
  responseAs[String] shouldEqual "Request entity is strict, data=123456789"
}
```

### Example 3: Example

```java
import static akka.http.javadsl.server.Directives.toStrictEntity;

final FiniteDuration timeout = FiniteDuration.create(3, TimeUnit.SECONDS);
final Route route = toStrictEntity(timeout, () ->
  extractRequest(req -> {
    if (req.entity() instanceof HttpEntity.Strict) {
      final HttpEntity.Strict strict = (HttpEntity.Strict)req.entity();
      return complete("Request entity is strict, data=" + strict.getData().utf8String());
    } else {
      return complete("Ooops, request entity is not strict!");
    }
  })
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
).assertEntity("Request entity is strict, data=123");
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/textract.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/tprovide.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/misc-directives/withSizeLimit.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/misc-directives/withoutSizeLimit.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/toStrictEntity.html](https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/toStrictEntity.html)*