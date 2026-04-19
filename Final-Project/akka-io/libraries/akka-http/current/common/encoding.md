---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:06:04Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/common/encoding.html
title: Encoding / Decoding • Akka HTTP
---

# Encoding / Decoding • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Encoding / Decoding

The [HTTP spec](https://datatracker.ietf.org/doc/html/rfc7231#section-3.1.2.1) defines a `Content-Encoding` header, which signifies whether the entity body of an HTTP message is “encoded” and, if so, by which algorithm. The only commonly used content encodings are compression algorithms.

Currently, Akka HTTP supports the compression and decompression of HTTP requests and responses with the `gzip` or `deflate` encodings. The core logic for this lives in the [`akka.http.scaladsl.coding`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/coding/index.html "akka.http.scaladsl.coding") package.[`akka.http.javadsl.coding.Coder`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/coding/Coder.html "akka.http.javadsl.coding.Coder") enum class.

## Server side

The support is not enabled automatically, but must be explicitly requested. For enabling message encoding/decoding with [Routing DSL](../routing-dsl/index.html) see the [CodingDirectives](../routing-dsl/directives/coding-directives/index.html).

Usually, it suffices to surround routes that should support response encoding by the [encodeResponse](../routing-dsl/directives/coding-directives/encodeResponse.html) directive, and routes that should support request decoding by the [decodeRequest](../routing-dsl/directives/coding-directives/decodeRequest.html) directive. Those directives will automatically and transparently enable support for encodings and negotiating which encoding to use out of the default encodings supported. The set of predefined [`MediaTypes`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/MediaTypes.html "akka.http.javadsl.model.MediaTypes")[`MediaTypes`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/MediaTypes$.html "akka.http.scaladsl.model.MediaTypes") contains a hint whether content of a given media type would benefit from compression.

## Client side

There is currently no high\-level or automatic support for decoding responses on the client\-side.

The following example shows how to decode responses manually based on the `Content-Encoding` header:

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/HttpClientDecodingExampleSpec.scala#L16-L57 "Go to snippet source")import akka.actor.ActorSystem
import akka.http.scaladsl.Http
import akka.http.scaladsl.coding.Coders
import akka.http.scaladsl.model._, headers.HttpEncodings

import scala.concurrent.Future

implicit val system = ActorSystem()
implicit val ec: ExecutionContext = system.dispatcher

val http = Http()

val requests: Seq[HttpRequest] = Seq(
  "https://httpbin.org/gzip", // Content-Encoding: gzip in response
  "https://httpbin.org/deflate", // Content-Encoding: deflate in response
  "https://httpbin.org/get" // no Content-Encoding in response
).map(uri => HttpRequest(uri = uri))

def decodeResponse(response: HttpResponse): HttpResponse = {
  val decoder = response.encoding match {
    case HttpEncodings.gzip =>
      Coders.Gzip
    case HttpEncodings.deflate =>
      Coders.Deflate
    case HttpEncodings.identity =>
      Coders.NoCoding
    case other =>
      log.warning(s"Unknown encoding [$other], not decoding")
      Coders.NoCoding
  }

  decoder.decodeMessage(response)
}

val futureResponses: Future[Seq[HttpResponse]] =
  Future.traverse(requests)(http.singleRequest(_).map(decodeResponse))

futureResponses.futureValue.foreach { resp =>
  system.log.info(s"response is ${resp.toStrict(1.second).futureValue}")
}

system.terminate()
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/HttpClientDecodingExampleTest.java#L8-L67 "Go to snippet source")import akka.actor.ActorSystem;
import akka.http.javadsl.Http;
import akka.http.javadsl.coding.Coder;
import akka.http.javadsl.model.HttpRequest;
import akka.http.javadsl.model.HttpResponse;
import akka.http.scaladsl.model.headers.HttpEncodings;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.function.Function;
import java.util.stream.Collectors;

public class HttpClientDecodingExampleTest {

  public static void main(String[] args) throws Exception {

    final ActorSystem system = ActorSystem.create();

    final List<HttpRequest> httpRequests = Arrays.asList(
      HttpRequest.create("https://httpbin.org/gzip"), // Content-Encoding: gzip in response
      HttpRequest.create("https://httpbin.org/deflate"), // Content-Encoding: deflate in response
      HttpRequest.create("https://httpbin.org/get") // no Content-Encoding in response
    );

    final Http http = Http.get(system);

    final Function<HttpResponse, HttpResponse> decodeResponse = response -> {
      // Pick the right coder
      final Coder coder;
      if (HttpEncodings.gzip().equals(response.encoding())) {
        coder = Coder.Gzip;
      } else if (HttpEncodings.deflate().equals(response.encoding())) {
        coder = Coder.Deflate;
      } else {
        coder = Coder.NoCoding;
      }

      // Decode the entity
      return coder.decodeMessage(response);
    };

    List<CompletableFuture<HttpResponse>> futureResponses = httpRequests.stream()
      .map(req -> http.singleRequest(req)
        .thenApply(decodeResponse))
      .map(CompletionStage::toCompletableFuture)
      .collect(Collectors.toList());

    for (CompletableFuture<HttpResponse> futureResponse : futureResponses) {
      final HttpResponse httpResponse = futureResponse.get();
      system.log().info("response is: " + httpResponse.entity()
                        .toStrict(1000, system)
                        .toCompletableFuture()
                        .get());
    }

    system.terminate();
  }
}
```

## Code Examples

### Example 1: Client side

```scala
import akka.actor.ActorSystem
import akka.http.scaladsl.Http
import akka.http.scaladsl.coding.Coders
import akka.http.scaladsl.model._, headers.HttpEncodings

import scala.concurrent.Future

implicit val system = ActorSystem()
implicit val ec: ExecutionContext = system.dispatcher

val http = Http()

val requests: Seq[HttpRequest] = Seq(
  "https://httpbin.org/gzip", // Content-Encoding: gzip in response
  "https://httpbin.org/deflate", // Content-Encoding: deflate in response
  "https://httpbin.org/get" // no Content-Encoding in response
).map(uri => HttpRequest(uri = uri))

def decodeResponse(response: HttpResponse): HttpResponse = {
  val decoder = response.encoding match {
    case HttpEncodings.gzip =>
      Coders.Gzip
    case HttpEncodings.deflate =>
      Coders.Deflate
    case HttpEncodings.identity =>
      Coders.NoCoding
    case other =>
      log.warning(s"Unknown encoding [$other], not decoding")
      Coders.NoCoding
  }

  decoder.decodeMessage(response)
}

val futureResponses: Future[Seq[HttpResponse]] =
  Future.traverse(requests)(http.singleRequest(_).map(decodeResponse))

futureResponses.futureValue.foreach { resp =>
  system.log.info(s"response is ${resp.toStrict(1.second).futureValue}")
}

system.terminate()
```

### Example 2: Client side

```java
import akka.actor.ActorSystem;
import akka.http.javadsl.Http;
import akka.http.javadsl.coding.Coder;
import akka.http.javadsl.model.HttpRequest;
import akka.http.javadsl.model.HttpResponse;
import akka.http.scaladsl.model.headers.HttpEncodings;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.function.Function;
import java.util.stream.Collectors;

public class HttpClientDecodingExampleTest {

  public static void main(String[] args) throws Exception {

    final ActorSystem system = ActorSystem.create();

    final List<HttpRequest> httpRequests = Arrays.asList(
      HttpRequest.create("https://httpbin.org/gzip"), // Content-Encoding: gzip in response
      HttpRequest.create("https://httpbin.org/deflate"), // Content-Encoding: deflate in response
      HttpRequest.create("https://httpbin.org/get") // no Content-Encoding in response
    );

    final Http http = Http.get(system);

    final Function<HttpResponse, HttpResponse> decodeResponse = response -> {
      // Pick the right coder
      final Coder coder;
      if (HttpEncodings.gzip().equals(response.encoding())) {
        coder = Coder.Gzip;
      } else if (HttpEncodings.deflate().equals(response.encoding())) {
        coder = Coder.Deflate;
      } else {
        coder = Coder.NoCoding;
      }

      // Decode the entity
      return coder.decodeMessage(response);
    };

    List<CompletableFuture<HttpResponse>> futureResponses = httpRequests.stream()
      .map(req -> http.singleRequest(req)
        .thenApply(decodeResponse))
      .map(CompletionStage::toCompletableFuture)
      .collect(Collectors.toList());

    for (CompletableFuture<HttpResponse> futureResponse : futureResponses) {
      final HttpResponse httpResponse = futureResponse.get();
      system.log().info("response is: " + httpResponse.entity()
                        .toStrict(1000, system)
                        .toCompletableFuture()
                        .get());
    }

    system.terminate();
  }
}
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/coding/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/MediaTypes$.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/coding/Coder.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/MediaTypes.html
- https://doc.akka.io/libraries/akka-http/current/common/json-support.html
- https://doc.akka.io/libraries/akka-http/current/common/unmarshalling.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/coding-directives/decodeRequest.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/coding-directives/encodeResponse.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/coding-directives/index.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/index.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/common/encoding.html](https://doc.akka.io/libraries/akka-http/current/common/encoding.html)*