---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:58:18Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/range-directives/withRangeSupport.html
title: withRangeSupport • Akka HTTP
---

# withRangeSupport • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# withRangeSupport

## Signature

```
def withRangeSupport(): Directive0
def withRangeSupport(rangeCountLimit: Int, rangeCoalescingThreshold:Long): Directive0

```

The signature shown is simplified, the real signature uses magnets. [\[1]](#1)

> [\[1]](#^1) See [The Magnet Pattern](https://spray.readthedocs.io/en/latest/blog/2012-12-13-the-magnet-pattern.html) for an explanation of magnet\-based overloading.

## Description

Transforms the response from its inner route into a `206 Partial Content` response if the client requested only part of the resource with a `Range` header.

Augments responses to `GET` requests with an `Accept-Ranges: bytes` header and converts them into partial responses if the request contains a valid `Range` request header. The requested byte\-ranges are coalesced (merged) if they lie closer together than the specified `rangeCoalescingThreshold` argument.

In order to prevent the server from becoming overloaded with trying to prepare `multipart/byteranges` responses for high numbers of potentially very small ranges the directive rejects requests requesting more than `rangeCountLimit` ranges with a [`TooManyRangesRejection`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/TooManyRangesRejection.html "akka.http.javadsl.server.TooManyRangesRejection")[`TooManyRangesRejection`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/TooManyRangesRejection.html "akka.http.scaladsl.server.TooManyRangesRejection"). Requests with unsatisfiable ranges are rejected with an [`UnsatisfiableRangeRejection`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/UnsatisfiableRangeRejection.html "akka.http.javadsl.server.UnsatisfiableRangeRejection")[`UnsatisfiableRangeRejection`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/UnsatisfiableRangeRejection.html "akka.http.scaladsl.server.UnsatisfiableRangeRejection").

The `withRangeSupport()` form (without parameters) uses the `range-coalescing-threshold` and `range-count-limit` settings from the `akka.http.routing` configuration.

This directive is transparent to non\-`GET` requests.

See also: [RFC 7233](https://datatracker.ietf.org/doc/html/rfc7233)

## Example

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/directives/RangeDirectivesExamplesSpec.scala#L23-L56 "Go to snippet source")val route =
  withRangeSupport {
    complete("ABCDEFGH")
  }

Get() ~> addHeader(Range(ByteRange(3, 4))) ~> route ~> check {
  headers should contain(`Content-Range`(ContentRange(3, 4, 8)))
  status shouldEqual StatusCodes.PartialContent
  responseAs[String] shouldEqual "DE"
}

// we set "akka.http.routing.range-coalescing-threshold = 2"
// above to make sure we get two BodyParts
Get() ~> addHeader(Range(ByteRange(0, 1), ByteRange(1, 2), ByteRange(6, 7))) ~> route ~> check {
  headers.collectFirst { case `Content-Range`(_, _) => true } shouldBe None
  val responseF = responseAs[Multipart.ByteRanges].parts
    .runFold[List[Multipart.ByteRanges.BodyPart]](Nil)((acc, curr) => curr :: acc)

  val response = Await.result(responseF, 3.seconds).reverse

  response should have length 2

  val part1 = response(0)
  part1.contentRange shouldEqual ContentRange(0, 2, 8)
  part1.entity should matchPattern {
    case HttpEntity.Strict(_, bytes) if bytes.utf8String == "ABC" =>
  }

  val part2 = response(1)
  part2.contentRange shouldEqual ContentRange(6, 7, 8)
  part2.entity should matchPattern {
    case HttpEntity.Strict(_, bytes) if bytes.utf8String == "GH" =>
  }
}
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/directives/RangeDirectivesExamplesTest.java#L31-L93 "Go to snippet source")import static akka.http.javadsl.server.Directives.complete;
import static akka.http.javadsl.server.Directives.withRangeSupport;

final Route route = withRangeSupport(() -> complete("ABCDEFGH"));

// test:
final String bytes348Range = ContentRange.create(RangeUnits.BYTES,
        akka.http.javadsl.model.ContentRange.create(3, 4, 8)).value();
final akka.http.javadsl.model.ContentRange bytes028Range =
        akka.http.javadsl.model.ContentRange.create(0, 2, 8);
final akka.http.javadsl.model.ContentRange bytes678Range =
        akka.http.javadsl.model.ContentRange.create(6, 7, 8);
final Materializer materializer = systemResource().materializer();

testRoute(route).run(HttpRequest.GET("/")
        .addHeader(Range.create(RangeUnits.BYTES, ByteRange.createSlice(3, 4))))
        .assertHeaderKindExists("Content-Range")
        .assertHeaderExists("Content-Range", bytes348Range)
        .assertStatusCode(StatusCodes.PARTIAL_CONTENT)
        .assertEntity("DE");

// we set "akka.http.routing.range-coalescing-threshold = 2"
// above to make sure we get two BodyParts
final TestRouteResult response = testRoute(route).run(HttpRequest.GET("/")
        .addHeader(Range.create(RangeUnits.BYTES,
                ByteRange.createSlice(0, 1), ByteRange.createSlice(1, 2), ByteRange.createSlice(6, 7))));
response.assertHeaderKindNotExists("Content-Range");

final CompletionStage<List<Multipart.ByteRanges.BodyPart>> completionStage =
        response.entity(Unmarshaller.entityToMultipartByteRangesUnmarshaller()).getParts()
                .runFold(new ArrayList<>(), (acc, n) -> {
                    acc.add(n);
                    return acc;
                }, materializer);
try {
    final List<Multipart.ByteRanges.BodyPart> bodyParts =
            completionStage.toCompletableFuture().get(3, TimeUnit.SECONDS);
    assertEquals(2, bodyParts.toArray().length);

    final Multipart.ByteRanges.BodyPart part1 = bodyParts.get(0);
    assertEquals(bytes028Range, part1.getContentRange());
    assertEquals(ByteString.fromString("ABC"),
            part1.toStrict(1000, materializer).toCompletableFuture().get().getEntity().getData());

    final Multipart.ByteRanges.BodyPart part2 = bodyParts.get(1);
    assertEquals(bytes678Range, part2.getContentRange());
    assertEquals(ByteString.fromString("GH"),
            part2.toStrict(1000, materializer).toCompletableFuture().get().getEntity().getData());

} catch (Exception e) {
    // please handle this in production code
}
```

## Code Examples

### Example 1: Signature

```scala
def withRangeSupport(): Directive0
def withRangeSupport(rangeCountLimit: Int, rangeCoalescingThreshold:Long): Directive0
```

### Example 2: Example

```scala
val route =
  withRangeSupport {
    complete("ABCDEFGH")
  }

Get() ~> addHeader(Range(ByteRange(3, 4))) ~> route ~> check {
  headers should contain(`Content-Range`(ContentRange(3, 4, 8)))
  status shouldEqual StatusCodes.PartialContent
  responseAs[String] shouldEqual "DE"
}

// we set "akka.http.routing.range-coalescing-threshold = 2"
// above to make sure we get two BodyParts
Get() ~> addHeader(Range(ByteRange(0, 1), ByteRange(1, 2), ByteRange(6, 7))) ~> route ~> check {
  headers.collectFirst { case `Content-Range`(_, _) => true } shouldBe None
  val responseF = responseAs[Multipart.ByteRanges].parts
    .runFold[List[Multipart.ByteRanges.BodyPart]](Nil)((acc, curr) => curr :: acc)

  val response = Await.result(responseF, 3.seconds).reverse

  response should have length 2

  val part1 = response(0)
  part1.contentRange shouldEqual ContentRange(0, 2, 8)
  part1.entity should matchPattern {
    case HttpEntity.Strict(_, bytes) if bytes.utf8String == "ABC" =>
  }

  val part2 = response(1)
  part2.contentRange shouldEqual ContentRange(6, 7, 8)
  part2.entity should matchPattern {
    case HttpEntity.Strict(_, bytes) if bytes.utf8String == "GH" =>
  }
}
```

### Example 3: Example

```java
import static akka.http.javadsl.server.Directives.complete;
import static akka.http.javadsl.server.Directives.withRangeSupport;

final Route route = withRangeSupport(() -> complete("ABCDEFGH"));

// test:
final String bytes348Range = ContentRange.create(RangeUnits.BYTES,
        akka.http.javadsl.model.ContentRange.create(3, 4, 8)).value();
final akka.http.javadsl.model.ContentRange bytes028Range =
        akka.http.javadsl.model.ContentRange.create(0, 2, 8);
final akka.http.javadsl.model.ContentRange bytes678Range =
        akka.http.javadsl.model.ContentRange.create(6, 7, 8);
final Materializer materializer = systemResource().materializer();

testRoute(route).run(HttpRequest.GET("/")
        .addHeader(Range.create(RangeUnits.BYTES, ByteRange.createSlice(3, 4))))
        .assertHeaderKindExists("Content-Range")
        .assertHeaderExists("Content-Range", bytes348Range)
        .assertStatusCode(StatusCodes.PARTIAL_CONTENT)
        .assertEntity("DE");

// we set "akka.http.routing.range-coalescing-threshold = 2"
// above to make sure we get two BodyParts
final TestRouteResult response = testRoute(route).run(HttpRequest.GET("/")
        .addHeader(Range.create(RangeUnits.BYTES,
                ByteRange.createSlice(0, 1), ByteRange.createSlice(1, 2), ByteRange.createSlice(6, 7))));
response.assertHeaderKindNotExists("Content-Range");

final CompletionStage<List<Multipart.ByteRanges.BodyPart>> completionStage =
        response.entity(Unmarshaller.entityToMultipartByteRangesUnmarshaller()).getParts()
                .runFold(new ArrayList<>(), (acc, n) -> {
                    acc.add(n);
                    return acc;
                }, materializer);
try {
    final List<Multipart.ByteRanges.BodyPart> bodyParts =
            completionStage.toCompletableFuture().get(3, TimeUnit.SECONDS);
    assertEquals(2, bodyParts.toArray().length);

    final Multipart.ByteRanges.BodyPart part1 = bodyParts.get(0);
    assertEquals(bytes028Range, part1.getContentRange());
    assertEquals(ByteString.fromString("ABC"),
            part1.toStrict(1000, materializer).toCompletableFuture().get().getEntity().getData());

    final Multipart.ByteRanges.BodyPart part2 = bodyParts.get(1);
    assertEquals(bytes678Range, part2.getContentRange());
    assertEquals(ByteString.fromString("GH"),
            part2.toStrict(1000, materializer).toCompletableFuture().get().getEntity().getData());

} catch (Exception e) {
    // please handle this in production code
}
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/TooManyRangesRejection.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/UnsatisfiableRangeRejection.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/TooManyRangesRejection.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/UnsatisfiableRangeRejection.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/range-directives/index.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/respond-with-directives/index.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/range-directives/withRangeSupport.html](https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/range-directives/withRangeSupport.html)*