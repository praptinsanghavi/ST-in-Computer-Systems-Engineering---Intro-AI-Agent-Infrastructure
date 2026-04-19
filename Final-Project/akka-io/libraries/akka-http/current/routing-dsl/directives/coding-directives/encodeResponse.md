---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:56:29Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/coding-directives/encodeResponse.html
title: encodeResponse • Akka HTTP
---

# encodeResponse • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# encodeResponse

## Signature

```
def encodeResponse: Directive0
```

## Description

Encodes the response with the encoding that is requested by the client via the `Accept-Encoding` header or rejects the request with an `UnacceptedResponseEncodingRejection(supportedEncodings)`.

The response encoding is determined by the rules specified in [RFC7231](https://datatracker.ietf.org/doc/html/rfc7231#section-5.3.4).

If the `Accept-Encoding` header is missing or empty or specifies an encoding other than identity, gzip or deflate then no encoding is used.

## Example

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/directives/CodingDirectivesExamplesSpec.scala#L33-L47 "Go to snippet source")val route = encodeResponse { complete("content") }

// tests:
Get("/") ~> route ~> check {
  response should haveContentEncoding(identity)
}
Get("/") ~> `Accept-Encoding`(gzip, deflate) ~> route ~> check {
  response should haveContentEncoding(gzip)
}
Get("/") ~> `Accept-Encoding`(deflate) ~> route ~> check {
  response should haveContentEncoding(deflate)
}
Get("/") ~> `Accept-Encoding`(identity) ~> route ~> check {
  response should haveContentEncoding(identity)
}
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/directives/CodingDirectivesExamplesTest.java#L31-L100 "Go to snippet source")import static akka.http.javadsl.server.Directives.complete;
import static akka.http.javadsl.server.Directives.encodeResponse;

    final Route route = encodeResponse(() -> complete("content"));

    // tests:
    testRoute(route).run(
      HttpRequest.GET("/")
        .addHeader(AcceptEncoding.create(HttpEncodings.GZIP))
        .addHeader(AcceptEncoding.create(HttpEncodings.DEFLATE))
    ).assertHeaderExists(ContentEncoding.create(HttpEncodings.GZIP));

    testRoute(route).run(
      HttpRequest.GET("/")
        .addHeader(AcceptEncoding.create(HttpEncodings.DEFLATE))
    ).assertHeaderExists(ContentEncoding.create(HttpEncodings.DEFLATE));

    // This case failed!
//    testRoute(route).run(
//      HttpRequest.GET("/")
//        .addHeader(AcceptEncoding.create(HttpEncodings.IDENTITY))
//    ).assertHeaderExists(ContentEncoding.create(HttpEncodings.IDENTITY));

```

## Code Examples

### Example 1: Signature

```scala
def encodeResponse: Directive0
```

### Example 2: Example

```scala
val route = encodeResponse { complete("content") }

// tests:
Get("/") ~> route ~> check {
  response should haveContentEncoding(identity)
}
Get("/") ~> `Accept-Encoding`(gzip, deflate) ~> route ~> check {
  response should haveContentEncoding(gzip)
}
Get("/") ~> `Accept-Encoding`(deflate) ~> route ~> check {
  response should haveContentEncoding(deflate)
}
Get("/") ~> `Accept-Encoding`(identity) ~> route ~> check {
  response should haveContentEncoding(identity)
}
```

### Example 3: Example

```java
import static akka.http.javadsl.server.Directives.complete;
import static akka.http.javadsl.server.Directives.encodeResponse;

    final Route route = encodeResponse(() -> complete("content"));

    // tests:
    testRoute(route).run(
      HttpRequest.GET("/")
        .addHeader(AcceptEncoding.create(HttpEncodings.GZIP))
        .addHeader(AcceptEncoding.create(HttpEncodings.DEFLATE))
    ).assertHeaderExists(ContentEncoding.create(HttpEncodings.GZIP));

    testRoute(route).run(
      HttpRequest.GET("/")
        .addHeader(AcceptEncoding.create(HttpEncodings.DEFLATE))
    ).assertHeaderExists(ContentEncoding.create(HttpEncodings.DEFLATE));

    // This case failed!
//    testRoute(route).run(
//      HttpRequest.GET("/")
//        .addHeader(AcceptEncoding.create(HttpEncodings.IDENTITY))
//    ).assertHeaderExists(ContentEncoding.create(HttpEncodings.IDENTITY));
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/coding-directives/decodeRequestWith.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/coding-directives/encodeResponseWith.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/coding-directives/encodeResponse.html](https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/coding-directives/encodeResponse.html)*