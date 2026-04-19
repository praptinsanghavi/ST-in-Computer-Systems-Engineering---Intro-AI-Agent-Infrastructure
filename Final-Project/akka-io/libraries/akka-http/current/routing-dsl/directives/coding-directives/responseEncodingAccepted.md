---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:58:10Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/coding-directives/responseEncodingAccepted.html
title: responseEncodingAccepted • Akka HTTP
---

# responseEncodingAccepted • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# responseEncodingAccepted

## Signature

```
def responseEncodingAccepted(encoding: HttpEncoding): Directive0
```

## Description

Passes the request to the inner route if the request accepts the argument encoding. Otherwise, rejects the request with an `UnacceptedResponseEncodingRejection(encoding)`.

## Example

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/directives/CodingDirectivesExamplesSpec.scala#L21-L28 "Go to snippet source")val route = responseEncodingAccepted(gzip) { complete("content") }

Get("/") ~> route ~> check {
  responseAs[String] shouldEqual "content"
}
Get("/") ~> `Accept-Encoding`(deflate) ~> route ~> check {
  rejection shouldEqual UnacceptedResponseEncodingRejection(gzip)
}
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/directives/CodingDirectivesExamplesTest.java#L26-L74 "Go to snippet source")import static akka.http.javadsl.server.Directives.complete;
import static akka.http.javadsl.server.Directives.responseEncodingAccepted;

final Route route = responseEncodingAccepted(HttpEncodings.GZIP, () ->
  complete("content")
);

// tests:
testRoute(route).run(HttpRequest.GET("/"))
  .assertEntity("content");
runRouteUnSealed(route,
                 HttpRequest.GET("/")
                   .addHeader(AcceptEncoding.create(HttpEncodings.DEFLATE)))
  .assertRejections(Rejections.unacceptedResponseEncoding(HttpEncodings.GZIP));
```

## Code Examples

### Example 1: Signature

```scala
def responseEncodingAccepted(encoding: HttpEncoding): Directive0
```

### Example 2: Example

```scala
val route = responseEncodingAccepted(gzip) { complete("content") }

Get("/") ~> route ~> check {
  responseAs[String] shouldEqual "content"
}
Get("/") ~> `Accept-Encoding`(deflate) ~> route ~> check {
  rejection shouldEqual UnacceptedResponseEncodingRejection(gzip)
}
```

### Example 3: Example

```java
import static akka.http.javadsl.server.Directives.complete;
import static akka.http.javadsl.server.Directives.responseEncodingAccepted;

final Route route = responseEncodingAccepted(HttpEncodings.GZIP, () ->
  complete("content")
);

// tests:
testRoute(route).run(HttpRequest.GET("/"))
  .assertEntity("content");
runRouteUnSealed(route,
                 HttpRequest.GET("/")
                   .addHeader(AcceptEncoding.create(HttpEncodings.DEFLATE)))
  .assertRejections(Rejections.unacceptedResponseEncoding(HttpEncodings.GZIP));
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/coding-directives/requestEncodedWith.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/coding-directives/withPrecompressedMediaTypeSupport.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/coding-directives/responseEncodingAccepted.html](https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/coding-directives/responseEncodingAccepted.html)*