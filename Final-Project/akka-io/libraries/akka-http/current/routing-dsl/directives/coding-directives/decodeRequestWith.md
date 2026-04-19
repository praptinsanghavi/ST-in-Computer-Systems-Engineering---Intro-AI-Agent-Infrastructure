---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:56:26Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/coding-directives/decodeRequestWith.html
title: decodeRequestWith • Akka HTTP
---

# decodeRequestWith • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# decodeRequestWith

## Signature

```
def decodeRequestWith(decoder: Decoder): Directive0
def decodeRequestWith(decoders: Decoder*): Directive0
```

## Description

Decodes the incoming request if it is encoded with one of the given encoders. If the request encoding doesn’t match one of the given encoders the request is rejected with an [`UnsupportedRequestEncodingRejection`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/UnsupportedRequestEncodingRejection.html "akka.http.javadsl.server.UnsupportedRequestEncodingRejection")[`UnsupportedRequestEncodingRejection`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/UnsupportedRequestEncodingRejection.html "akka.http.scaladsl.server.UnsupportedRequestEncodingRejection"). If no decoders are given the default encoders (`Gzip`, `Deflate`, `NoCoding`) are used. If the request entity after decoding exceeds `akka.http.routing.decode-max-size` the stream fails with an [`EntityStreamSizeException`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/EntityStreamSizeException.html "akka.http.scaladsl.model.EntityStreamSizeException")[`EntityStreamSizeException`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/EntityStreamSizeException.html "akka.http.scaladsl.model.EntityStreamSizeException").

## Example

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/directives/CodingDirectivesExamplesSpec.scala#L101-L138 "Go to snippet source")val route =
  decodeRequestWith(Coders.Gzip) {
    entity(as[String]) { (content: String) =>
      complete(s"Request content: '$content'")
    }
  }

// tests:
Post("/", helloGzipped) ~> `Content-Encoding`(gzip) ~> route ~> check {
  responseAs[String] shouldEqual "Request content: 'Hello'"
}
Post("/", helloDeflated) ~> `Content-Encoding`(deflate) ~> route ~> check {
  rejection shouldEqual UnsupportedRequestEncodingRejection(gzip)
}
Post("/", "hello") ~> `Content-Encoding`(identity) ~> route ~> check {
  rejection shouldEqual UnsupportedRequestEncodingRejection(gzip)
}
val route =
  decodeRequestWith(Coders.Gzip, Coders.NoCoding) {
    entity(as[String]) { (content: String) =>
      complete(s"Request content: '$content'")
    }
  }

// tests:
Post("/", helloGzipped) ~> `Content-Encoding`(gzip) ~> route ~> check {
  responseAs[String] shouldEqual "Request content: 'Hello'"
}
Post("/", helloDeflated) ~> `Content-Encoding`(deflate) ~> route ~> check {
  rejections shouldEqual List(UnsupportedRequestEncodingRejection(gzip), UnsupportedRequestEncodingRejection(identity))
}
Post("/", "hello uncompressed") ~> `Content-Encoding`(identity) ~> route ~> check {
  responseAs[String] shouldEqual "Request content: 'hello uncompressed'"
}
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/directives/CodingDirectivesExamplesTest.java#L47-L198 "Go to snippet source")import static akka.http.javadsl.server.Directives.complete;
import static akka.http.javadsl.server.Directives.decodeRequestWith;
import static akka.http.javadsl.server.Directives.entity;

final ByteString helloGzipped = Coder.Gzip.encode(ByteString.fromString("Hello"));
final ByteString helloDeflated = Coder.Deflate.encode(ByteString.fromString("Hello"));

final Route route = decodeRequestWith(Coder.Gzip, () ->
  entity(entityToString(), content ->
    complete("Request content: '" + content + "'")
  )
);

// tests:
testRoute(route).run(
  HttpRequest.POST("/").withEntity(helloGzipped)
    .addHeader(ContentEncoding.create(HttpEncodings.GZIP)))
  .assertEntity("Request content: 'Hello'");

runRouteUnSealed(route,
  HttpRequest.POST("/").withEntity(helloDeflated)
    .addHeader(ContentEncoding.create(HttpEncodings.DEFLATE)))
  .assertRejections(Rejections.unsupportedRequestEncoding(HttpEncodings.GZIP));

runRouteUnSealed(route,
  HttpRequest.POST("/").withEntity("hello")
    .addHeader(ContentEncoding.create(HttpEncodings.IDENTITY)))
  .assertRejections(Rejections.unsupportedRequestEncoding(HttpEncodings.GZIP));
```

## Code Examples

### Example 1: Signature

```scala
def decodeRequestWith(decoder: Decoder): Directive0
def decodeRequestWith(decoders: Decoder*): Directive0
```

### Example 2: Example

```scala
val route =
  decodeRequestWith(Coders.Gzip) {
    entity(as[String]) { (content: String) =>
      complete(s"Request content: '$content'")
    }
  }

// tests:
Post("/", helloGzipped) ~> `Content-Encoding`(gzip) ~> route ~> check {
  responseAs[String] shouldEqual "Request content: 'Hello'"
}
Post("/", helloDeflated) ~> `Content-Encoding`(deflate) ~> route ~> check {
  rejection shouldEqual UnsupportedRequestEncodingRejection(gzip)
}
Post("/", "hello") ~> `Content-Encoding`(identity) ~> route ~> check {
  rejection shouldEqual UnsupportedRequestEncodingRejection(gzip)
}
val route =
  decodeRequestWith(Coders.Gzip, Coders.NoCoding) {
    entity(as[String]) { (content: String) =>
      complete(s"Request content: '$content'")
    }
  }

// tests:
Post("/", helloGzipped) ~> `Content-Encoding`(gzip) ~> route ~> check {
  responseAs[String] shouldEqual "Request content: 'Hello'"
}
Post("/", helloDeflated) ~> `Content-Encoding`(deflate) ~> route ~> check {
  rejections shouldEqual List(UnsupportedRequestEncodingRejection(gzip), UnsupportedRequestEncodingRejection(identity))
}
Post("/", "hello uncompressed") ~> `Content-Encoding`(identity) ~> route ~> check {
  responseAs[String] shouldEqual "Request content: 'hello uncompressed'"
}
```

### Example 3: Example

```java
import static akka.http.javadsl.server.Directives.complete;
import static akka.http.javadsl.server.Directives.decodeRequestWith;
import static akka.http.javadsl.server.Directives.entity;

final ByteString helloGzipped = Coder.Gzip.encode(ByteString.fromString("Hello"));
final ByteString helloDeflated = Coder.Deflate.encode(ByteString.fromString("Hello"));

final Route route = decodeRequestWith(Coder.Gzip, () ->
  entity(entityToString(), content ->
    complete("Request content: '" + content + "'")
  )
);

// tests:
testRoute(route).run(
  HttpRequest.POST("/").withEntity(helloGzipped)
    .addHeader(ContentEncoding.create(HttpEncodings.GZIP)))
  .assertEntity("Request content: 'Hello'");

runRouteUnSealed(route,
  HttpRequest.POST("/").withEntity(helloDeflated)
    .addHeader(ContentEncoding.create(HttpEncodings.DEFLATE)))
  .assertRejections(Rejections.unsupportedRequestEncoding(HttpEncodings.GZIP));

runRouteUnSealed(route,
  HttpRequest.POST("/").withEntity("hello")
    .addHeader(ContentEncoding.create(HttpEncodings.IDENTITY)))
  .assertRejections(Rejections.unsupportedRequestEncoding(HttpEncodings.GZIP));
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/EntityStreamSizeException.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/UnsupportedRequestEncodingRejection.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/UnsupportedRequestEncodingRejection.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/EntityStreamSizeException.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/coding-directives/decodeRequest.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/coding-directives/encodeResponse.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/coding-directives/decodeRequestWith.html](https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/coding-directives/decodeRequestWith.html)*