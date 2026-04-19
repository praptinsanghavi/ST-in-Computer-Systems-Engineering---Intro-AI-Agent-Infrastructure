---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:58:17Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/coding-directives/withPrecompressedMediaTypeSupport.html
title: withPrecompressedMediaTypeSupport • Akka HTTP
---

# withPrecompressedMediaTypeSupport • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# withPrecompressedMediaTypeSupport

## Signature

```
def withPrecompressedMediaTypeSupport: Directive0
```

## Description

Inspects the response entity and adds a `Content-Encoding: gzip` response header if the entity’s media\-type is precompressed with gzip and no `Content-Encoding` header is present yet.

## Example

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/directives/CodingDirectivesExamplesSpec.scala#L144-L154 "Go to snippet source")val svgz = compress("<svg/>", Coders.Gzip)
val route =
  withPrecompressedMediaTypeSupport {
    complete(HttpResponse(entity = HttpEntity(`image/svgz`, svgz)))
  }

// tests:
Get("/") ~> route ~> check {
  header[`Content-Encoding`] shouldEqual Some(`Content-Encoding`(gzip))
  mediaType shouldEqual `image/svg+xml`
}
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/directives/CodingDirectivesExamplesTest.java#L53-L217 "Go to snippet source")import static akka.http.javadsl.server.Directives.complete;
import static akka.http.javadsl.server.Directives.withPrecompressedMediaTypeSupport;

final ByteString svgz = Coder.Gzip.encode(ByteString.fromString("<svg/>"));

final Route route = withPrecompressedMediaTypeSupport(() ->
  complete(
    HttpResponse.create().withEntity(
      HttpEntities.create(MediaTypes.IMAGE_SVGZ.toContentType(), svgz))
  )
);

// tests:
testRoute(route).run(HttpRequest.GET("/"))
  .assertMediaType(MediaTypes.IMAGE_SVG_XML)
  .assertHeaderExists(ContentEncoding.create(HttpEncodings.GZIP));
```

## Code Examples

### Example 1: Signature

```scala
def withPrecompressedMediaTypeSupport: Directive0
```

### Example 2: Example

```scala
val svgz = compress("<svg/>", Coders.Gzip)
val route =
  withPrecompressedMediaTypeSupport {
    complete(HttpResponse(entity = HttpEntity(`image/svgz`, svgz)))
  }

// tests:
Get("/") ~> route ~> check {
  header[`Content-Encoding`] shouldEqual Some(`Content-Encoding`(gzip))
  mediaType shouldEqual `image/svg+xml`
}
```

### Example 3: Example

```java
import static akka.http.javadsl.server.Directives.complete;
import static akka.http.javadsl.server.Directives.withPrecompressedMediaTypeSupport;

final ByteString svgz = Coder.Gzip.encode(ByteString.fromString("<svg/>"));

final Route route = withPrecompressedMediaTypeSupport(() ->
  complete(
    HttpResponse.create().withEntity(
      HttpEntities.create(MediaTypes.IMAGE_SVGZ.toContentType(), svgz))
  )
);

// tests:
testRoute(route).run(HttpRequest.GET("/"))
  .assertMediaType(MediaTypes.IMAGE_SVG_XML)
  .assertHeaderExists(ContentEncoding.create(HttpEncodings.GZIP));
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/coding-directives/responseEncodingAccepted.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/cookie-directives/index.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/coding-directives/withPrecompressedMediaTypeSupport.html](https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/coding-directives/withPrecompressedMediaTypeSupport.html)*