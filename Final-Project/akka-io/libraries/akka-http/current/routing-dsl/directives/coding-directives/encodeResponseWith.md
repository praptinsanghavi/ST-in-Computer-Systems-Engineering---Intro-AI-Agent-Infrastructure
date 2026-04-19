---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:56:30Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/coding-directives/encodeResponseWith.html
title: encodeResponseWith • Akka HTTP
---

# encodeResponseWith • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# encodeResponseWith

## Signature

```
def encodeResponseWith(first: Encoder, more: Encoder*): Directive0
```

## Description

Encodes the response with the encoding that is requested by the client via the `Accept-Encoding` if it is among the provided encoders or rejects the request with an `UnacceptedResponseEncodingRejection(supportedEncodings)`.

The response encoding is determined by the rules specified in [RFC7231](https://datatracker.ietf.org/doc/html/rfc7231#section-5.3.4).

If the `Accept-Encoding` header is missing then the response is encoded using the `first` encoder.

If the `Accept-Encoding` header is empty and `NoCoding` is part of the encoders then no response encoding is used. Otherwise the request is rejected.

## Example

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/directives/CodingDirectivesExamplesSpec.scala#L52-L72 "Go to snippet source")val route = encodeResponseWith(Coders.Gzip) { complete("content") }

// tests:
Get("/") ~> route ~> check {
  response should haveContentEncoding(gzip)
}
Get("/") ~> `Accept-Encoding`(gzip, deflate) ~> route ~> check {
  response should haveContentEncoding(gzip)
}
Get("/") ~> `Accept-Encoding`(deflate) ~> route ~> check {
  rejection shouldEqual UnacceptedResponseEncodingRejection(gzip)
}
Get("/") ~> `Accept-Encoding`(identity) ~> route ~> check {
  rejection shouldEqual UnacceptedResponseEncodingRejection(gzip)
}

// with custom compression level:
val routeWithLevel9 = encodeResponseWith(Coders.Gzip(compressionLevel = 9)) { complete("content") }
Get("/") ~> routeWithLevel9 ~> check {
  response should haveContentEncoding(gzip)
}
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/directives/CodingDirectivesExamplesTest.java#L36-L138 "Go to snippet source")import static akka.http.javadsl.server.Directives.complete;
import static akka.http.javadsl.server.Directives.encodeResponseWith;

final Route route = encodeResponseWith(
  Collections.singletonList(Coder.Gzip),
  () -> complete("content")
);

// tests:
testRoute(route).run(HttpRequest.GET("/"))
  .assertHeaderExists(ContentEncoding.create(HttpEncodings.GZIP));

testRoute(route).run(
  HttpRequest.GET("/")
    .addHeader(AcceptEncoding.create(HttpEncodings.GZIP))
    .addHeader(AcceptEncoding.create(HttpEncodings.DEFLATE))
).assertHeaderExists(ContentEncoding.create(HttpEncodings.GZIP));

runRouteUnSealed(route,
  HttpRequest.GET("/")
    .addHeader(AcceptEncoding.create(HttpEncodings.DEFLATE))
).assertRejections(Rejections.unacceptedResponseEncoding(HttpEncodings.GZIP));

runRouteUnSealed(route,
  HttpRequest.GET("/")
    .addHeader(AcceptEncoding.create(HttpEncodings.IDENTITY))
).assertRejections(Rejections.unacceptedResponseEncoding(HttpEncodings.GZIP));

final Route routeWithLevel9 = encodeResponseWith(
        Collections.singletonList(Coder.GzipLevel9),
        () -> complete("content")
);

testRoute(routeWithLevel9).run(HttpRequest.GET("/"))
  .assertHeaderExists(ContentEncoding.create(HttpEncodings.GZIP));
```

## Code Examples

### Example 1: Signature

```scala
def encodeResponseWith(first: Encoder, more: Encoder*): Directive0
```

### Example 2: Example

```scala
val route = encodeResponseWith(Coders.Gzip) { complete("content") }

// tests:
Get("/") ~> route ~> check {
  response should haveContentEncoding(gzip)
}
Get("/") ~> `Accept-Encoding`(gzip, deflate) ~> route ~> check {
  response should haveContentEncoding(gzip)
}
Get("/") ~> `Accept-Encoding`(deflate) ~> route ~> check {
  rejection shouldEqual UnacceptedResponseEncodingRejection(gzip)
}
Get("/") ~> `Accept-Encoding`(identity) ~> route ~> check {
  rejection shouldEqual UnacceptedResponseEncodingRejection(gzip)
}

// with custom compression level:
val routeWithLevel9 = encodeResponseWith(Coders.Gzip(compressionLevel = 9)) { complete("content") }
Get("/") ~> routeWithLevel9 ~> check {
  response should haveContentEncoding(gzip)
}
```

### Example 3: Example

```java
import static akka.http.javadsl.server.Directives.complete;
import static akka.http.javadsl.server.Directives.encodeResponseWith;

final Route route = encodeResponseWith(
  Collections.singletonList(Coder.Gzip),
  () -> complete("content")
);

// tests:
testRoute(route).run(HttpRequest.GET("/"))
  .assertHeaderExists(ContentEncoding.create(HttpEncodings.GZIP));

testRoute(route).run(
  HttpRequest.GET("/")
    .addHeader(AcceptEncoding.create(HttpEncodings.GZIP))
    .addHeader(AcceptEncoding.create(HttpEncodings.DEFLATE))
).assertHeaderExists(ContentEncoding.create(HttpEncodings.GZIP));

runRouteUnSealed(route,
  HttpRequest.GET("/")
    .addHeader(AcceptEncoding.create(HttpEncodings.DEFLATE))
).assertRejections(Rejections.unacceptedResponseEncoding(HttpEncodings.GZIP));

runRouteUnSealed(route,
  HttpRequest.GET("/")
    .addHeader(AcceptEncoding.create(HttpEncodings.IDENTITY))
).assertRejections(Rejections.unacceptedResponseEncoding(HttpEncodings.GZIP));

final Route routeWithLevel9 = encodeResponseWith(
        Collections.singletonList(Coder.GzipLevel9),
        () -> complete("content")
);

testRoute(routeWithLevel9).run(HttpRequest.GET("/"))
  .assertHeaderExists(ContentEncoding.create(HttpEncodings.GZIP));
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/coding-directives/encodeResponse.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/coding-directives/requestEncodedWith.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/coding-directives/encodeResponseWith.html](https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/coding-directives/encodeResponseWith.html)*