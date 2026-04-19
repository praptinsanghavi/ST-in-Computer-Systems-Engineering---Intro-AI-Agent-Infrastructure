---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:08:59Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/migration-guide/migration-from-spray.html
title: Migration Guide from Spray • Akka HTTP
---

# Migration Guide from Spray • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Migration Guide from Spray

Akka HTTP is the successor for spray. With the first non\-experimental release of Akka HTTP, spray has reached its end\-of\-life. Akka HTTP is a reimplementation of HTTP based on akka\-stream (former spray\-can) which adds streaming support on all levels. The popular high\-level routing DSL (former spray\-routing) has mostly been kept but was made more consistent and simplified where possible. While underlyings have changed a lot, many of the high\-level features and syntax of the routing DSL have only changed superficially so that code can hopefully be converted with little effort.

## Major changes

### Streams everywhere

Akka HTTP offers an API based on streams where spray offered an API based on actor messaging. This has important consequences.

Streaming support is needed to handle request and response entities (or bodies) in a streaming fashion, i.e. being able to access the incoming bytes while they come in from the network without having to buffer a potentially big request or response in memory. The same is valid for sending out request or response data entities. In the model, the streaming underlyings can be seen in the [`HttpEntity`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpEntity.html "akka.http.javadsl.model.HttpEntity")[`HttpEntity`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpEntity.html "akka.http.scaladsl.model.HttpEntity") type which now has subclasses that allow to specify a [`Source<ByteString, ?>`](https://doc.akka.io/japi/akka/2.10/akka/stream/javadsl/Source.html "akka.stream.javadsl.Source")[`Source[ByteString, _]`](https://doc.akka.io/api/akka/2.10/akka/stream/scaladsl/Source.html "akka.stream.scaladsl.Source") to provide or consume entity data.

In spray, you could configure spray\-can to send out `HttpRequestPart` and `HttpResponsePart` messages to receive a request or a response in a streaming fashion. The default case was for spray to collect the full entity in memory and send it out as a [`ByteString`](https://doc.akka.io/api/akka/2.10/akka/util/ByteString.html "akka.util.ByteString")[`ByteString`](https://doc.akka.io/japi/akka/2.10/akka/util/ByteString.html "akka.util.ByteString") as part of the request or response entity object.

In Akka HTTP, handling streaming data is mandatory. When you receive a [`HttpRequest`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpRequest.html "akka.http.javadsl.model.HttpRequest")[`HttpRequest`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpRequest.html "akka.http.scaladsl.model.HttpRequest") on the server\-side or an [`HttpResponse`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpResponse.html "akka.http.javadsl.model.HttpResponse")[`HttpResponse`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpResponse.html "akka.http.scaladsl.model.HttpResponse"), in the default case it will contain a streamed entity as the `entity` field *which you are required to consume*. Otherwise, a connection might be stuck (at least until timeouts kick in). See [Implications of the streaming nature of Request/Response Entities](../implications-of-streaming-http-entity.html).

In the implementation, Akka HTTP makes heavy use of streams as well with the occasional fallback to actors.

### New module structure

The number of modules has been reduced. Here’s an approximate mapping from spray modules to new modules:

- spray\-util, spray\-http, spray\-can \=\> akka\-http\-core
- spray\-routing \=\> akka\-http
- spray\-client \=\> parts of high\-level client support is now provided via `Http().singleRequest`, other is not yet implemented (see also [\#113](https://github.com/akka/akka-http/issues/113))
- spray\-caching \=\> akka\-http\-caching (since version 10\.0\.11, more information here: [Documentation](../common/caching.html))

### Package name changes

Classes can now be found in new packages:

- the model can be found in `akka.http.scaladsl.model`
- headers can be found in `akka.http.scaladsl.model.headers._`
- the routing DSL can be found in `akka.http.scaladsl.server._`

### Routing DSL not based on shapeless any more

To simplify using Akka HTTP together with other libraries that require shapeless, the routing DSL in Akka HTTP does not depend on shapeless any more. Instead, we support a light\-weight replacement that models heterogeneous lists with tuples. This will not affect you as long as you haven’t written any generic directives. The implicit magic in the background that powers directives will \- in user code \- work as before.

Internally, the type aliases for `DirectiveX` have changed:

|  | spray | Akka HTTP |
| --- | --- | --- |
| `Directive0` | `Directive[HNil]` | `Directive[Tuple0]` |
| `Directive1[T]` | `Directive[T :: HNil]` | `Directive[Tuple1[T]]` |
| `Directive2[T1, T2]` | `Directive[T1 :: T2 :: HNil]` | `Directive[Tuple2[T1, T2]]` |

### Support for Java

All APIs are also available for Java. See everything under the `akka.http.javadsl` package.

## Other changes

### Changes in Route type

Route type has changed from `Route = RequestContext => Unit` to `Route = RequestContext => Future[RouteResult]`. Which means that now we must complete the Request inside the controller and we can’t simply pass the request to another Actor and complete it there. This has been done intentionally, because in Spray it was easy to forget to `complete` requests but the code would still compile.

The following article mentions a few ways for us to complete the request based on processing outside the controller: [CodeMonkey blog \- Actor per Request with Akka HTTP](https://markatta.com/codemonkey/blog/2016/08/03/actor-per-request-with-akka-http/)

This article was written by Johan Andrén, a member of the akka\-http team.

### Changes in Marshalling

Marshaller.of can be replaced with `Marshaller.withFixedContentType`.

Was:

```
Marshaller.of[JsonApiObject](`application/json`) { (value, contentType, ctx) =>
  ctx.marshalTo(HttpEntity(contentType, value.toJson.toString))
}

```

Replace with:

```
Marshaller.withFixedContentType(`application/json`) { obj =>
  HttpEntity(`application/json`, obj.toJson.compactPrint)
}

```

Akka HTTP marshallers support content negotiation, now it’s not necessary to specify content type when creating one “super” marshaller from other marshallers:

Before:

```
ToResponseMarshaller.oneOf(
  `application/vnd.api+json`,
  `application/json`
)(
  jsonApiMarshaller,
  jsonMarshaller
}

```

After:

```
Marshaller.oneOf(
  jsonApiMarshaller,
  jsonMarshaller
)

```

### Changes in Unmarshalling

Akka Http contains a set of predefined unmarshallers. This means that scala code like this:

```
Unmarshaller[Entity](`application/json`) {
  case HttpEntity.NonEmpty(contentType, data) =>
    data.asString.parseJson.convertTo[Entity]
}

```

needs to be changed into:

```
Unmarshaller
  .stringUnmarshaller
  .forContentTypes(`application/json`)
  .map(_.parseJson.convertTo[Entity])

```

### Changes in MediaTypes

`MediaType.custom` can be replaced with specific methods in [`MediaType`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/MediaType.html "akka.http.javadsl.model.MediaType")[`MediaType`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/MediaType.html "akka.http.scaladsl.model.MediaType") object.

Was:

```
MediaType.custom("application/vnd.acme+json")

```

Replace with:

```
MediaType.applicationWithFixedCharset("vnd.acme+json", HttpCharsets.`UTF-8`)

```

### Changes in Rejection Handling

`RejectionHandler` now uses a builder pattern – see the example:

Before:

```
def rootRejectionHandler = RejectionHandler {
  case Nil =>
    requestUri { uri =>
      logger.error("Route: {} does not exist.", uri)
      complete((NotFound, mapErrorToRootObject(notFoundError)))
    }
  case AuthenticationFailedRejection(cause, challengeHeaders) :: _ => {
    logger.error(s"Request is rejected with cause: $cause")
    complete((Unauthorized, mapErrorToRootObject(unauthenticatedError)))
  }
}

```

After:

```
RejectionHandler
.newBuilder()
.handle {
  case AuthenticationFailedRejection(cause, challengeHeaders) =>
    logger.error(s"Request is rejected with cause: $cause")
    complete(Unauthorized, mapErrorToRootObject(unauthenticatedError))
.handleNotFound { ctx =>
  logger.error("Route: {} does not exist.", ctx.request.uri.toString())
  ctx.complete(NotFound, mapErrorToRootObject(notFoundError))
}
.result()
.withFallback(RejectionHandler.default)

```

### Changes in HTTP Client

The Spray\-client pipeline was removed. Http’s `singleRequest` should be used instead of `sendReceive`:

```
//this will not longer work
val token = Authorization(OAuth2BearerToken(accessToken))
val pipeline: HttpRequest => Future[HttpResponse] = (addHeader(token) ~> sendReceive)
val patch: HttpRequest = Patch(uri, object))

pipeline(patch).map { response =>
    …
}

```

needs to be changed into:

```
val request = HttpRequest(
  method = PATCH,
  uri = Uri(uri),
  headers = List(Authorization(OAuth2BearerToken(accessToken))),
  entity = HttpEntity(MediaTypes.`application/json`, object)
)

http.singleRequest(request).map {
  case … => …
}

```

### Changes in form fields and file upload directives

With the streaming nature of http entity, it’s important to have a strict http entity before accessing multiple form fields or use file upload directives. One solution might be using next directive before working with form fields:

```
val toStrict: Directive0 = extractRequest flatMap { request =>
  onComplete(request.entity.toStrict(5.seconds)) flatMap {
    case Success(strict) =>
      mapRequest( req => req.copy(entity = strict))
    case _ => reject
  }
}

```

And one can use it like this:

```
toStrict {
  formFields("name".as[String]) { name =>
  ...
  }
}

```

## Removed features

### Removed HttpService

Spray’s `HttpService` was removed. This means that scala code like this:

```
val service = system.actorOf(Props(new HttpServiceActor(routes)))
IO(Http)(system) ! Http.Bind(service, "0.0.0.0", port = 8080)

```

needs to be changed into:

```
Http().newServerAt("0.0.0.0", port = 8080).bind(routes)

```

### Other removed features

- `respondWithStatus` also known as `overrideStatusCode` has not been forward ported to Akka HTTP, as it has been seen mostly as an anti\-pattern. More information here: [https://github.com/akka/akka\-core/issues/18626](https://github.com/akka/akka-core/issues/18626)
- `respondWithMediaType` was considered an anti\-pattern in spray and is not ported to Akka HTTP. Instead users should rely on content type negotiation as Akka HTTP implements it. More information here: [\#190](https://github.com/akka/akka-http/issues/190)
- [Registering Custom Media Types](../common/http-model.html#registeringcustommediatypes) changed from Spray in order not to rely on global state.
- HTTP Client proxy support, see [\#115 Client proxy support for HTTP](https://github.com/akka/akka-http/issues/115) and [\#192 Client proxy support for HTTPS](https://github.com/akka/akka-http/issues/192) tickets for details.

## Code Examples

### Example 1: Changes in Marshalling

```scala
Marshaller.of[JsonApiObject](`application/json`) { (value, contentType, ctx) =>
  ctx.marshalTo(HttpEntity(contentType, value.toJson.toString))
}
```

### Example 2: Changes in Marshalling

```scala
Marshaller.withFixedContentType(`application/json`) { obj =>
  HttpEntity(`application/json`, obj.toJson.compactPrint)
}
```

### Example 3: Changes in Marshalling

```scala
ToResponseMarshaller.oneOf(
  `application/vnd.api+json`,
  `application/json`
)(
  jsonApiMarshaller,
  jsonMarshaller
}
```

### Example 4: Changes in Marshalling

```scala
Marshaller.oneOf(
  jsonApiMarshaller,
  jsonMarshaller
)
```

### Example 5: Changes in Unmarshalling

```scala
Unmarshaller[Entity](`application/json`) {
  case HttpEntity.NonEmpty(contentType, data) =>
    data.asString.parseJson.convertTo[Entity]
}
```

### Example 6: Changes in Unmarshalling

```scala
Unmarshaller
  .stringUnmarshaller
  .forContentTypes(`application/json`)
  .map(_.parseJson.convertTo[Entity])
```

### Example 7: Changes in MediaTypes

```scala
MediaType.custom("application/vnd.acme+json")
```

### Example 8: Changes in MediaTypes

```scala
MediaType.applicationWithFixedCharset("vnd.acme+json", HttpCharsets.`UTF-8`)
```

### Example 9: Changes in Rejection Handling

```scala
def rootRejectionHandler = RejectionHandler {
  case Nil =>
    requestUri { uri =>
      logger.error("Route: {} does not exist.", uri)
      complete((NotFound, mapErrorToRootObject(notFoundError)))
    }
  case AuthenticationFailedRejection(cause, challengeHeaders) :: _ => {
    logger.error(s"Request is rejected with cause: $cause")
    complete((Unauthorized, mapErrorToRootObject(unauthenticatedError)))
  }
}
```

### Example 10: Changes in Rejection Handling

```scala
RejectionHandler
.newBuilder()
.handle {
  case AuthenticationFailedRejection(cause, challengeHeaders) =>
    logger.error(s"Request is rejected with cause: $cause")
    complete(Unauthorized, mapErrorToRootObject(unauthenticatedError))
.handleNotFound { ctx =>
  logger.error("Route: {} does not exist.", ctx.request.uri.toString())
  ctx.complete(NotFound, mapErrorToRootObject(notFoundError))
}
.result()
.withFallback(RejectionHandler.default)
```

### Example 11: Changes in HTTP Client

```scala
//this will not longer work
val token = Authorization(OAuth2BearerToken(accessToken))
val pipeline: HttpRequest => Future[HttpResponse] = (addHeader(token) ~> sendReceive)
val patch: HttpRequest = Patch(uri, object))

pipeline(patch).map { response =>
    …
}
```

### Example 12: Changes in HTTP Client

```scala
val request = HttpRequest(
  method = PATCH,
  uri = Uri(uri),
  headers = List(Authorization(OAuth2BearerToken(accessToken))),
  entity = HttpEntity(MediaTypes.`application/json`, object)
)

http.singleRequest(request).map {
  case … => …
}
```

### Example 13: Changes in form fields and file upload directives

```scala
val toStrict: Directive0 = extractRequest flatMap { request =>
  onComplete(request.entity.toStrict(5.seconds)) flatMap {
    case Success(strict) =>
      mapRequest( req => req.copy(entity = strict))
    case _ => reject
  }
}
```

### Example 14: Changes in form fields and file upload directives

```scala
toStrict {
  formFields("name".as[String]) { name =>
  ...
  }
}
```

### Example 15: Removed HttpService

```scala
val service = system.actorOf(Props(new HttpServiceActor(routes)))
IO(Http)(system) ! Http.Bind(service, "0.0.0.0", port = 8080)
```

### Example 16: Removed HttpService

```scala
Http().newServerAt("0.0.0.0", port = 8080).bind(routes)
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpEntity.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpRequest.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpResponse.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/MediaType.html
- https://doc.akka.io/api/akka/2.10/akka/stream/scaladsl/Source.html
- https://doc.akka.io/api/akka/2.10/akka/util/ByteString.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpEntity.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpRequest.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpResponse.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/MediaType.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/javadsl/Source.html
- https://doc.akka.io/japi/akka/2.10/akka/util/ByteString.html
- https://doc.akka.io/libraries/akka-http/current/common/caching.html
- https://doc.akka.io/libraries/akka-http/current/common/http-model.html
- https://doc.akka.io/libraries/akka-http/current/implications-of-streaming-http-entity.html
- https://doc.akka.io/libraries/akka-http/current/migration-guide/migration-from-old-http-javadsl.html
- https://doc.akka.io/libraries/akka-http/current/migration-guide/migration-guide-2.4.x-10.0.x.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/migration-guide/migration-from-spray.html](https://doc.akka.io/libraries/akka-http/current/migration-guide/migration-from-spray.html)*