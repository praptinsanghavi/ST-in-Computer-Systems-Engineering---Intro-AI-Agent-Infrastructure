---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:56:26Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/coding-directives/decodeRequest.html
title: decodeRequest • Akka HTTP
---

# decodeRequest • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# decodeRequest

## Signature

```
def decodeRequest: Directive0
```

## Description

Decompresses the incoming request if it is `gzip` or `deflate` compressed. Uncompressed requests are passed through untouched. If the request encoded with another encoding the request is rejected with an [`UnsupportedRequestEncodingRejection`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/UnsupportedRequestEncodingRejection.html "akka.http.javadsl.server.UnsupportedRequestEncodingRejection")[`UnsupportedRequestEncodingRejection`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/UnsupportedRequestEncodingRejection.html "akka.http.scaladsl.server.UnsupportedRequestEncodingRejection"). If the request entity after decoding exceeds `akka.http.routing.decode-max-size` the stream fails with an [`EntityStreamSizeException`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/EntityStreamSizeException.html "akka.http.scaladsl.model.EntityStreamSizeException")[`EntityStreamSizeException`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/EntityStreamSizeException.html "akka.http.scaladsl.model.EntityStreamSizeException").

## Example

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/directives/CodingDirectivesExamplesSpec.scala#L80-L96 "Go to snippet source")val route =
  decodeRequest {
    entity(as[String]) { (content: String) =>
      complete(s"Request content: '$content'")
    }
  }

// tests:
Post("/", helloGzipped) ~> `Content-Encoding`(gzip) ~> route ~> check {
  responseAs[String] shouldEqual "Request content: 'Hello'"
}
Post("/", helloDeflated) ~> `Content-Encoding`(deflate) ~> route ~> check {
  responseAs[String] shouldEqual "Request content: 'Hello'"
}
Post("/", "hello uncompressed") ~> `Content-Encoding`(identity) ~> route ~> check {
  responseAs[String] shouldEqual "Request content: 'hello uncompressed'"
}
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/directives/CodingDirectivesExamplesTest.java#L41-L168 "Go to snippet source")import static akka.http.javadsl.server.Directives.complete;
import static akka.http.javadsl.server.Directives.decodeRequest;
import static akka.http.javadsl.server.Directives.entity;

final ByteString helloGzipped = Coder.Gzip.encode(ByteString.fromString("Hello"));
final ByteString helloDeflated = Coder.Deflate.encode(ByteString.fromString("Hello"));

final Route route = decodeRequest(() ->
  entity(entityToString(), content ->
    complete("Request content: '" + content + "'")
  )
);

// tests:
testRoute(route).run(
  HttpRequest.POST("/").withEntity(helloGzipped)
    .addHeader(ContentEncoding.create(HttpEncodings.GZIP)))
  .assertEntity("Request content: 'Hello'");

testRoute(route).run(
  HttpRequest.POST("/").withEntity(helloDeflated)
    .addHeader(ContentEncoding.create(HttpEncodings.DEFLATE)))
  .assertEntity("Request content: 'Hello'");

testRoute(route).run(
  HttpRequest.POST("/").withEntity("hello uncompressed")
    .addHeader(ContentEncoding.create(HttpEncodings.IDENTITY)))
  .assertEntity( "Request content: 'hello uncompressed'");
```

## Code Examples

### Example 1: Signature

```scala
def decodeRequest: Directive0
```

### Example 2: Example

```scala
val route =
  decodeRequest {
    entity(as[String]) { (content: String) =>
      complete(s"Request content: '$content'")
    }
  }

// tests:
Post("/", helloGzipped) ~> `Content-Encoding`(gzip) ~> route ~> check {
  responseAs[String] shouldEqual "Request content: 'Hello'"
}
Post("/", helloDeflated) ~> `Content-Encoding`(deflate) ~> route ~> check {
  responseAs[String] shouldEqual "Request content: 'Hello'"
}
Post("/", "hello uncompressed") ~> `Content-Encoding`(identity) ~> route ~> check {
  responseAs[String] shouldEqual "Request content: 'hello uncompressed'"
}
```

### Example 3: Example

```java
import static akka.http.javadsl.server.Directives.complete;
import static akka.http.javadsl.server.Directives.decodeRequest;
import static akka.http.javadsl.server.Directives.entity;

final ByteString helloGzipped = Coder.Gzip.encode(ByteString.fromString("Hello"));
final ByteString helloDeflated = Coder.Deflate.encode(ByteString.fromString("Hello"));

final Route route = decodeRequest(() ->
  entity(entityToString(), content ->
    complete("Request content: '" + content + "'")
  )
);

// tests:
testRoute(route).run(
  HttpRequest.POST("/").withEntity(helloGzipped)
    .addHeader(ContentEncoding.create(HttpEncodings.GZIP)))
  .assertEntity("Request content: 'Hello'");

testRoute(route).run(
  HttpRequest.POST("/").withEntity(helloDeflated)
    .addHeader(ContentEncoding.create(HttpEncodings.DEFLATE)))
  .assertEntity("Request content: 'Hello'");

testRoute(route).run(
  HttpRequest.POST("/").withEntity("hello uncompressed")
    .addHeader(ContentEncoding.create(HttpEncodings.IDENTITY)))
  .assertEntity( "Request content: 'hello uncompressed'");
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/EntityStreamSizeException.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/UnsupportedRequestEncodingRejection.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/UnsupportedRequestEncodingRejection.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/EntityStreamSizeException.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/coding-directives/decodeRequestWith.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/coding-directives/index.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/coding-directives/decodeRequest.html](https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/coding-directives/decodeRequest.html)*