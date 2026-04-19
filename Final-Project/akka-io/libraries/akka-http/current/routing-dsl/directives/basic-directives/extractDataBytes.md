---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:56:31Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/extractDataBytes.html
title: extractDataBytes • Akka HTTP
---

# extractDataBytes • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# extractDataBytes

## Signature

```
def extractDataBytes: Directive1[Source[ByteString, Any]]
```

## Description

Extracts the entities data bytes as [`Source<ByteString, ?>`](https://doc.akka.io/japi/akka/2.10/akka/stream/javadsl/Source.html "akka.stream.javadsl.Source")[`Source[ByteString, _]`](https://doc.akka.io/api/akka/2.10/akka/stream/scaladsl/Source.html "akka.stream.scaladsl.Source") from the [`RequestContext`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/RequestContext.html "akka.http.javadsl.server.RequestContext")[`RequestContext`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/RequestContext.html "akka.http.scaladsl.server.RequestContext").

The directive returns a stream containing the request data bytes.

## Example

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/directives/BasicDirectivesExamplesSpec.scala#L843-L855 "Go to snippet source")val route =
  extractDataBytes { data =>
    val sum = data.runFold(0) { (acc, i) => acc + i.utf8String.toInt }
    onSuccess(sum) { s =>
      complete(HttpResponse(entity = HttpEntity(s.toString)))
    }
  }

// tests:
val dataBytes = Source.fromIterator(() => Iterator.range(1, 10).map(x => ByteString(x.toString)))
Post("/abc", HttpEntity(ContentTypes.`text/plain(UTF-8)`, data = dataBytes)) ~> route ~> check {
  responseAs[String] shouldEqual "45"
}
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/directives/BasicDirectivesExamplesTest.java#L164-L1054 "Go to snippet source")import static akka.http.javadsl.server.Directives.extractDataBytes;

final Route route = extractDataBytes(data -> {
  final CompletionStage<Integer> sum = data.runFold(0, (acc, i) ->
    acc + Integer.valueOf(i.utf8String()), materializer());
  return onSuccess(sum, s ->
    complete(HttpResponse.create().withEntity(HttpEntities.create(s.toString()))));
});

// tests:
final Iterator<ByteString> iterator = Arrays.asList(
  ByteString.fromString("1"),
  ByteString.fromString("2"),
  ByteString.fromString("3")).iterator();
final Source<ByteString, NotUsed> dataBytes = Source.fromIterator(() -> iterator);

testRoute(route).run(
  HttpRequest.POST("abc")
    .withEntity(HttpEntities.create(ContentTypes.TEXT_PLAIN_UTF8, dataBytes))
).assertEntity("6");
```

## Code Examples

### Example 1: Signature

```scala
def extractDataBytes: Directive1[Source[ByteString, Any]]
```

### Example 2: Example

```scala
val route =
  extractDataBytes { data =>
    val sum = data.runFold(0) { (acc, i) => acc + i.utf8String.toInt }
    onSuccess(sum) { s =>
      complete(HttpResponse(entity = HttpEntity(s.toString)))
    }
  }

// tests:
val dataBytes = Source.fromIterator(() => Iterator.range(1, 10).map(x => ByteString(x.toString)))
Post("/abc", HttpEntity(ContentTypes.`text/plain(UTF-8)`, data = dataBytes)) ~> route ~> check {
  responseAs[String] shouldEqual "45"
}
```

### Example 3: Example

```java
import static akka.http.javadsl.server.Directives.extractDataBytes;

final Route route = extractDataBytes(data -> {
  final CompletionStage<Integer> sum = data.runFold(0, (acc, i) ->
    acc + Integer.valueOf(i.utf8String()), materializer());
  return onSuccess(sum, s ->
    complete(HttpResponse.create().withEntity(HttpEntities.create(s.toString()))));
});

// tests:
final Iterator<ByteString> iterator = Arrays.asList(
  ByteString.fromString("1"),
  ByteString.fromString("2"),
  ByteString.fromString("3")).iterator();
final Source<ByteString, NotUsed> dataBytes = Source.fromIterator(() -> iterator);

testRoute(route).run(
  HttpRequest.POST("abc")
    .withEntity(HttpEntities.create(ContentTypes.TEXT_PLAIN_UTF8, dataBytes))
).assertEntity("6");
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/RequestContext.html
- https://doc.akka.io/api/akka/2.10/akka/stream/scaladsl/Source.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/RequestContext.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/javadsl/Source.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/extractActorSystem.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/extractExecutionContext.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/extractDataBytes.html](https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/extractDataBytes.html)*