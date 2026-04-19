---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:21:57Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/alphabetically.html
title: Predefined Directives (alphabetically) • Akka HTTP
---

# Predefined Directives (alphabetically) • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Predefined Directives (alphabetically)

| Directive | Description |
| --- | --- |
| [alwaysCache](caching-directives/alwaysCache.html) | Wraps its inner Route with caching support using the given [`Cache`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/caching/javadsl/Cache.html "akka.http.caching.javadsl.Cache")[`Cache`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/caching/scaladsl/Cache.html "akka.http.caching.scaladsl.Cache") implementation and the in\-scope keyer function. |
| [attribute](attribute-directives/attribute.html) | Extracts the value of the request attribute with a given key |
| [authenticateBasic](security-directives/authenticateBasic.html) | Wraps the inner route with Http Basic authentication support using a given `Authenticator[T]``Authenticator<T>` |
| [authenticateBasicAsync](security-directives/authenticateBasicAsync.html) | Wraps the inner route with Http Basic authentication support using a given `AsyncAuthenticator[T]``AsyncAuthenticator<T>` |
| [authenticateBasicPF](security-directives/authenticateBasicPF.html) | Wraps the inner route with Http Basic authentication support using a given `AuthenticatorPF[T]``AuthenticatorPF<T>` |
| [authenticateBasicPFAsync](security-directives/authenticateBasicPFAsync.html) | Wraps the inner route with Http Basic authentication support using a given `AsyncAuthenticatorPF[T]``AsyncAuthenticatorPF<T>` |
| [authenticateOAuth2](security-directives/authenticateOAuth2.html) | Wraps the inner route with OAuth Bearer Token authentication support using a given `AuthenticatorPF[T]``AuthenticatorPF<T>` |
| [authenticateOAuth2Async](security-directives/authenticateOAuth2Async.html) | Wraps the inner route with OAuth Bearer Token authentication support using a given `AsyncAuthenticator[T]``AsyncAuthenticator<T>` |
| [authenticateOAuth2PF](security-directives/authenticateOAuth2PF.html) | Wraps the inner route with OAuth Bearer Token authentication support using a given `AuthenticatorPF[T]``AuthenticatorPF<T>` |
| [authenticateOAuth2PFAsync](security-directives/authenticateOAuth2PFAsync.html) | Wraps the inner route with OAuth Bearer Token authentication support using a given `AsyncAuthenticatorPF[T]``AsyncAuthenticatorPF<T>` |
| [authenticateOrRejectWithChallenge](security-directives/authenticateOrRejectWithChallenge.html) | Lifts an authenticator function into a directive |
| [authorize](security-directives/authorize.html) | Applies the given authorization check to the request |
| [authorizeAsync](security-directives/authorizeAsync.html) | Applies the given asynchronous authorization check to the request |
| [cache](caching-directives/cache.html) | Wraps its inner Route with caching support using the given [`Cache`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/caching/javadsl/Cache.html "akka.http.caching.javadsl.Cache")[`Cache`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/caching/scaladsl/Cache.html "akka.http.caching.scaladsl.Cache") implementation and the in\-scope keyer function. |
| [cachingProhibited](caching-directives/cachingProhibited.html) | Passes only requests that explicitly forbid caching with a `Cache-Control` header with either a `no-cache` or `max-age=0` setting. |
| [cancelRejection](basic-directives/cancelRejection.html) | Adds a [`TransformationRejection`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/TransformationRejection.html "akka.http.javadsl.server.TransformationRejection")[`TransformationRejection`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/TransformationRejection.html "akka.http.scaladsl.server.TransformationRejection") cancelling all rejections equal to the given one to the rejections potentially coming back from the inner route. |
| [cancelRejections](basic-directives/cancelRejections.html) | Adds a [`TransformationRejection`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/TransformationRejection.html "akka.http.javadsl.server.TransformationRejection")[`TransformationRejection`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/TransformationRejection.html "akka.http.scaladsl.server.TransformationRejection") cancelling all matching rejections to the rejections potentially coming back from the inner route |
| [checkSameOrigin](header-directives/checkSameOrigin.html) | Checks that the request comes from the same origin |
| [complete](route-directives/complete.html) | Completes the request using the given arguments |
| [completeOrRecoverWith](future-directives/completeOrRecoverWith.html) | “Unwraps” a `Future[T]``CompletionStage<T>` and runs the inner route when the future has failed with the error as an extraction of type `Throwable` |
| [completeWith](marshalling-directives/completeWith.html) | Uses the marshaller for a given type to extract a completion function |
| [conditional](cache-condition-directives/conditional.html) | Wraps its inner route with support for conditional requests as defined by [RFC 7232](https://datatracker.ietf.org/doc/html/rfc7232) |
| [cookie](cookie-directives/cookie.html) | Extracts the [`HttpCookie`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/headers/HttpCookie.html "akka.http.javadsl.model.headers.HttpCookie")[`HttpCookie`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/HttpCookie.html "akka.http.scaladsl.model.headers.HttpCookie") with the given name |
| [cors](cors-directives/cors.html) | Wrapps its inner route with CORS handling |
| [decodeRequest](coding-directives/decodeRequest.html) | Decompresses the request if it is `gzip` or `deflate` compressed |
| [decodeRequestWith](coding-directives/decodeRequestWith.html) | Decodes the incoming request using one of the given decoders |
| [delete](method-directives/delete.html) | Rejects all non\-DELETE requests |
| [deleteCookie](cookie-directives/deleteCookie.html) | Adds a `Set-Cookie` response header expiring the given cookies |
| [encodeResponse](coding-directives/encodeResponse.html) | Encodes the response with the encoding that is requested by the client via the `Accept-Encoding` header (`NoCoding`, `Gzip` and `Deflate`) |
| [encodeResponseWith](coding-directives/encodeResponseWith.html) | Encodes the response with the encoding that is requested by the client via the `Accept-Encoding` header (from a user\-defined set) |
| [entity](marshalling-directives/entity.html) | Extracts the request entity unmarshalled to a given type |
| [extract](basic-directives/extract.html) | Extracts a single value using a `RequestContext => T``Function<RequestContext, T>` function |
| [extractDataBytes](basic-directives/extractDataBytes.html) | Extracts the entities data bytes as a stream [`Source<ByteString, ?>`](https://doc.akka.io/japi/akka/2.10/akka/stream/javadsl/Source.html "akka.stream.javadsl.Source")[`Source[ByteString, _]`](https://doc.akka.io/api/akka/2.10/akka/stream/scaladsl/Source.html "akka.stream.scaladsl.Source") |
| [extractClient](misc-directives/extractClientIP.html) | Extracts the client’s IP from either the `X-Forwarded-`, `Remote-Address` or `X-Real-IP` header |
| [extractClientCertificate](tls-directives/extractClientCertificate.html) | Extracts the client cert for an mTLS request |
| [extractClientIP](misc-directives/extractClientIP.html) | Extracts the client’s IP from either the `X-Forwarded-`, `Remote-Address` or `X-Real-IP` header |
| [extractCredentials](security-directives/extractCredentials.html) | Extracts the potentially present [`HttpCredentials`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/headers/HttpCredentials.html "akka.http.javadsl.model.headers.HttpCredentials")[`HttpCredentials`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/HttpCredentials.html "akka.http.scaladsl.model.headers.HttpCredentials") provided with the request’s [`Authorization`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/headers/Authorization.html "akka.http.javadsl.model.headers.Authorization")[`Authorization`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/Authorization.html "akka.http.scaladsl.model.headers.Authorization") header |
| [extractExecutionContext](basic-directives/extractExecutionContext.html) | Extracts the `ExecutionContext` from the [`RequestContext`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/RequestContext.html "akka.http.javadsl.server.RequestContext")[`RequestContext`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/RequestContext.html "akka.http.scaladsl.server.RequestContext") |
| [extractMatchedPath](basic-directives/extractMatchedPath.html) | Extracts the already matched path from the [`RequestContext`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/RequestContext.html "akka.http.javadsl.server.RequestContext")[`RequestContext`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/RequestContext.html "akka.http.scaladsl.server.RequestContext") |
| [extractMaterializer](basic-directives/extractMaterializer.html) | Extracts the [`Materializer`](https://doc.akka.io/api/akka/2.10/akka/stream/Materializer.html "akka.stream.Materializer")[`Materializer`](https://doc.akka.io/japi/akka/2.10/akka/stream/Materializer.html "akka.stream.Materializer") from the [`RequestContext`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/RequestContext.html "akka.http.javadsl.server.RequestContext")[`RequestContext`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/RequestContext.html "akka.http.scaladsl.server.RequestContext") |
| [extractHost](host-directives/extractHost.html) | Extracts the hostname part of the Host request header value |
| [extractLog](basic-directives/extractLog.html) | Extracts the [`LoggingAdapter`](https://doc.akka.io/api/akka/2.10/akka/event/LoggingAdapter.html "akka.event.LoggingAdapter")[`LoggingAdapter`](https://doc.akka.io/japi/akka/2.10/akka/event/LoggingAdapter.html "akka.event.LoggingAdapter") from the [`RequestContext`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/RequestContext.html "akka.http.javadsl.server.RequestContext")[`RequestContext`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/RequestContext.html "akka.http.scaladsl.server.RequestContext") |
| [extractMethod](method-directives/extractMethod.html) | Extracts the request method |
| [extractOfferedWsProtocols](websocket-directives/extractOfferedWsProtocols.html) | Extract the list of websocket subprotocols offered by the client in the `Sec-WebSocket-Protocol` header if this is a websocket request and otherwise rejects with an [`ExpectedWebSocketRequestRejection`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/ExpectedWebSocketRequestRejection.html "akka.http.javadsl.server.ExpectedWebSocketRequestRejection")[`ExpectedWebSocketRequestRejection`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/ExpectedWebSocketRequestRejection$.html "akka.http.scaladsl.server.ExpectedWebSocketRequestRejection") |
| [extractParserSettings](basic-directives/extractParserSettings.html) | Extracts the [`ParserSettings`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/settings/ParserSettings.html "akka.http.javadsl.settings.ParserSettings")[`ParserSettings`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/settings/ParserSettings.html "akka.http.scaladsl.settings.ParserSettings") from the [`RequestContext`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/RequestContext.html "akka.http.javadsl.server.RequestContext")[`RequestContext`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/RequestContext.html "akka.http.scaladsl.server.RequestContext") |
| [extractRequest](basic-directives/extractRequest.html) | Extracts the current [`HttpRequest`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpRequest.html "akka.http.javadsl.model.HttpRequest")[`HttpRequest`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpRequest.html "akka.http.scaladsl.model.HttpRequest") instance |
| [extractRequestContext](basic-directives/extractRequestContext.html) | Extracts the [`RequestContext`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/RequestContext.html "akka.http.javadsl.server.RequestContext")[`RequestContext`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/RequestContext.html "akka.http.scaladsl.server.RequestContext") itself |
| [extractRequestEntity](basic-directives/extractRequestEntity.html) | Extracts the [`RequestEntity`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/RequestEntity.html "akka.http.javadsl.model.RequestEntity")[`RequestEntity`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/RequestEntity.html "akka.http.scaladsl.model.RequestEntity") from the [`RequestContext`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/RequestContext.html "akka.http.javadsl.server.RequestContext")[`RequestContext`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/RequestContext.html "akka.http.scaladsl.server.RequestContext") |
| [extractScheme](scheme-directives/extractScheme.html) | Extracts the URI scheme from the request |
| [extractSettings](basic-directives/extractSettings.html) | Extracts the [`RoutingSettings`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/settings/RoutingSettings.html "akka.http.javadsl.settings.RoutingSettings")[`RoutingSettings`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/settings/RoutingSettings.html "akka.http.scaladsl.settings.RoutingSettings") from the [`RequestContext`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/RequestContext.html "akka.http.javadsl.server.RequestContext")[`RequestContext`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/RequestContext.html "akka.http.scaladsl.server.RequestContext") |
| [extractSslSession](tls-directives/extractSslSession.html) | Extracts the SSL session for a HTTPS request |
| [extractUnmatchedPath](basic-directives/extractUnmatchedPath.html) | Extracts the yet unmatched path from the [`RequestContext`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/RequestContext.html "akka.http.javadsl.server.RequestContext")[`RequestContext`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/RequestContext.html "akka.http.scaladsl.server.RequestContext") |
| [extractUpgradeToWebSocket](websocket-directives/extractUpgradeToWebSocket.html) | Extract the [`UpgradeToWebSocket`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/ws/UpgradeToWebSocket.html "akka.http.javadsl.model.ws.UpgradeToWebSocket")[`UpgradeToWebSocket`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/ws/UpgradeToWebSocket.html "akka.http.scaladsl.model.ws.UpgradeToWebSocket") header if existent and otherwise rejects with an [`ExpectedWebSocketRequestRejection`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/ExpectedWebSocketRequestRejection.html "akka.http.javadsl.server.ExpectedWebSocketRequestRejection")[`ExpectedWebSocketRequestRejection`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/ExpectedWebSocketRequestRejection$.html "akka.http.scaladsl.server.ExpectedWebSocketRequestRejection") |
| [extractUri](basic-directives/extractUri.html) | Extracts the complete request URI |
| [failWith](route-directives/failWith.html) | Bubbles the given error up the response chain where it is dealt with by the closest [handleExceptions](execution-directives/handleExceptions.html) directive and its [`ExceptionHandler`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/ExceptionHandler.html "akka.http.javadsl.server.ExceptionHandler")[`ExceptionHandler`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/ExceptionHandler.html "akka.http.scaladsl.server.ExceptionHandler") |
| [fileUpload](file-upload-directives/fileUpload.html) | Provides a stream of an uploaded file from a multipart request |
| [fileUploadAll](file-upload-directives/fileUploadAll.html) | Provides streams of all uploaded files from a multipart request |
| [formField](form-field-directives/formField.html) | Extracts an HTTP form field (of Content\-Type `application/x-www-form-urlencoded` or `multipart/form-data`) from the request |
| [formFieldMap](form-field-directives/formFieldMap.html) | Extracts a number of HTTP form field (of Content\-Type `application/x-www-form-urlencoded` or `multipart/form-data`) from the request as a `Map[String, String]``Map<String, String>` |
| [formFieldMultiMap](form-field-directives/formFieldMultiMap.html) | Extracts a number of HTTP form field (of Content\-Type `application/x-www-form-urlencoded` or `multipart/form-data`) from the request as a `Map[String, List[String]]``Map<String, List<String>>` |
| [formFields](form-field-directives/formFields.html) | Extracts a number of HTTP form field (of Content\-Type `application/x-www-form-urlencoded` or `multipart/form-data`) from the request |
| [formFieldSeq](form-field-directives/formFieldSeq.html) | Extracts a number of HTTP form field (of Content\-Type `application/x-www-form-urlencoded` or `multipart/form-data`) from the request as a `Seq[(String, String)]``List<Map.Entry<String, String>>` |
| [get](method-directives/get.html) | Rejects all non\-GET requests |
| [getFromBrowseableDirectories](file-and-resource-directives/getFromBrowseableDirectories.html) | Serves the content of the given directories as a file\-system browser, i.e. files are sent and directories served as browseable listings |
| [getFromBrowseableDirectory](file-and-resource-directives/getFromBrowseableDirectory.html) | Serves the content of the given directory as a file\-system browser, i.e. files are sent and directories served as browseable listings |
| [getFromDirectory](file-and-resource-directives/getFromDirectory.html) | Completes GET requests with the content of a file underneath a given file\-system directory |
| [getFromFile](file-and-resource-directives/getFromFile.html) | Completes GET requests with the content of a given file |
| [getFromResource](file-and-resource-directives/getFromResource.html) | Completes GET requests with the content of a given class\-path resource |
| [getFromResourceDirectory](file-and-resource-directives/getFromResourceDirectory.html) | Completes GET requests with the content of a file underneath a given “class\-path resource directory” |
| [handleExceptions](execution-directives/handleExceptions.html) | Transforms exceptions thrown during evaluation of the inner route using the given [`ExceptionHandler`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/ExceptionHandler.html "akka.http.javadsl.server.ExceptionHandler")[`ExceptionHandler`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/ExceptionHandler.html "akka.http.scaladsl.server.ExceptionHandler") |
| [handleRejections](execution-directives/handleRejections.html) | Transforms rejections produced by the inner route using the given `RejectionHandler` |
| [handleWebSocketMessages](websocket-directives/handleWebSocketMessages.html) | Handles websocket requests with the given handler and rejects other requests with an [`ExpectedWebSocketRequestRejection`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/ExpectedWebSocketRequestRejection.html "akka.http.javadsl.server.ExpectedWebSocketRequestRejection")[`ExpectedWebSocketRequestRejection`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/ExpectedWebSocketRequestRejection$.html "akka.http.scaladsl.server.ExpectedWebSocketRequestRejection") |
| [handleWebSocketMessagesForOptionalProtocol](websocket-directives/handleWebSocketMessagesForOptionalProtocol.html) | Handles websocket requests with the given handler if the subprotocol matches and rejects other requests. If the subprotocol parameter is `None`empty any WebSocket request is accepted.. |
| [handleWebSocketMessagesForProtocol](websocket-directives/handleWebSocketMessagesForProtocol.html) | Handles websocket requests with the given handler if the subprotocol matches and rejects other requests with an [`ExpectedWebSocketRequestRejection`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/ExpectedWebSocketRequestRejection.html "akka.http.javadsl.server.ExpectedWebSocketRequestRejection")[`ExpectedWebSocketRequestRejection`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/ExpectedWebSocketRequestRejection$.html "akka.http.scaladsl.server.ExpectedWebSocketRequestRejection") or an [`UnsupportedWebSocketSubprotocolRejection`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/UnsupportedWebSocketSubprotocolRejection.html "akka.http.javadsl.server.UnsupportedWebSocketSubprotocolRejection")[`UnsupportedWebSocketSubprotocolRejection`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/UnsupportedWebSocketSubprotocolRejection.html "akka.http.scaladsl.server.UnsupportedWebSocketSubprotocolRejection"). |
| [handleWith](marshalling-directives/handleWith.html) | Completes the request using a given function |
| [head](method-directives/head.html) | Rejects all non\-HEAD requests |
| [headerValue](header-directives/headerValue.html) | Extracts an HTTP header value using a given `HttpHeader => Option[T]``Function<HttpHeader, Optional<T>>` function |
| [headerValueByName](header-directives/headerValueByName.html) | Extracts the value of the first HTTP request header with a given name |
| [headerValueByType](header-directives/headerValueByType.html) | Extracts the first HTTP request header of the given type |
| [headerValuePF](header-directives/headerValuePF.html) | Extracts an HTTP header value using a given `PartialFunction[HttpHeader, T]]``PartialFunction<HttpHeader, T>` |
| [host](host-directives/host.html) | Rejects all requests with a non\-matching host name |
| [ignoreTrailingSlash](path-directives/ignoreTrailingSlash.html) | Retries the inner route adding (or removing) the trailing slash in case of empty rejections |
| [jwt](jwt-directives/jwt.html) | Validates a JSON Web Token (JWT) from a request and extracts its claims for further processing |
| [listDirectoryContents](file-and-resource-directives/listDirectoryContents.html) | Completes GET requests with a unified listing of the contents of all given file\-system directories |
| [logRequest](debugging-directives/logRequest.html) | Produces a log entry for every incoming request |
| [logRequestResult](debugging-directives/logRequestResult.html) | Produces a log entry for every incoming request and [`RouteResult`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/RouteResult.html "akka.http.javadsl.server.RouteResult")[`RouteResult`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/RouteResult.html "akka.http.scaladsl.server.RouteResult") |
| [logResult](debugging-directives/logResult.html) | Produces a log entry for every [`RouteResult`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/RouteResult.html "akka.http.javadsl.server.RouteResult")[`RouteResult`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/RouteResult.html "akka.http.scaladsl.server.RouteResult") |
| [mapInnerRoute](basic-directives/mapInnerRoute.html) | Transforms its inner [`Route`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/index.html#Route=akka.http.scaladsl.server.RequestContext=%3Escala.concurrent.Future[akka.http.scaladsl.server.RouteResult] "akka.http.scaladsl.server")[`Route`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/Route.html "akka.http.javadsl.server.Route") with a `Route => Route``UnaryOperator<Route>` function |
| [mapRejections](basic-directives/mapRejections.html) | Transforms rejections from a previous route with an `immutable.Seq[Rejection] => immutable.Seq[Rejection]``UnaryOperator<List<Rejection>>` function |
| [mapRequest](basic-directives/mapRequest.html) | Transforms the request with an `HttpRequest => HttpRequest``UnaryOperator<HttpRequest>` function |
| [mapRequestContext](basic-directives/mapRequestContext.html) | Transforms the [`RequestContext`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/RequestContext.html "akka.http.javadsl.server.RequestContext")[`RequestContext`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/RequestContext.html "akka.http.scaladsl.server.RequestContext") with a `RequestContext => RequestContext``UnaryOperator<RequestContext>` function |
| [mapResponse](basic-directives/mapResponse.html) | Transforms the response with an `HttpResponse => HttpResponse``UnaryOperator<HttpResponse>` function |
| [mapResponseEntity](basic-directives/mapResponseEntity.html) | Transforms the response entity with an `ResponseEntity => ResponseEntity``UnaryOperator<ResponseEntity>` function |
| [mapResponseHeaders](basic-directives/mapResponseHeaders.html) | Transforms the response headers with an `immutable.Seq[HttpHeader] => immutable.Seq[HttpHeader]``UnaryOperator<List<HttpHeader>>` function |
| [mapRouteResult](basic-directives/mapRouteResult.html) | Transforms the [`RouteResult`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/RouteResult.html "akka.http.javadsl.server.RouteResult")[`RouteResult`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/RouteResult.html "akka.http.scaladsl.server.RouteResult") with a `RouteResult => RouteResult``UnaryOperator<RouteResult>` function |
| [mapRouteResultFuture](basic-directives/mapRouteResultFuture.html) | Transforms the [`RouteResult`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/RouteResult.html "akka.http.javadsl.server.RouteResult")[`RouteResult`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/RouteResult.html "akka.http.scaladsl.server.RouteResult") future with a `Future[RouteResult] => Future[RouteResult]``UnaryOperator<CompletionStage<RouteResult>>` function |
| [mapRouteResultPF](basic-directives/mapRouteResultPF.html) | Transforms the [`RouteResult`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/RouteResult.html "akka.http.javadsl.server.RouteResult")[`RouteResult`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/RouteResult.html "akka.http.scaladsl.server.RouteResult") with a `PartialFunction[RouteResult, RouteResult]``PartialFunction<RouteResult, RouteResult>` |
| [mapRouteResultWith](basic-directives/mapRouteResultWith.html) | Transforms the [`RouteResult`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/RouteResult.html "akka.http.javadsl.server.RouteResult")[`RouteResult`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/RouteResult.html "akka.http.scaladsl.server.RouteResult") with a `RouteResult => Future[RouteResult]``Function<RouteResult, CompletionStage<RouteResult>>` function |
| [mapRouteResultWithPF](basic-directives/mapRouteResultWithPF.html) | Transforms the [`RouteResult`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/RouteResult.html "akka.http.javadsl.server.RouteResult")[`RouteResult`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/RouteResult.html "akka.http.scaladsl.server.RouteResult") with a `PartialFunction[RouteResult, Future[RouteResult]]``PartialFunction<RouteResult, CompletionStage<RouteResult>>` |
| [mapSettings](basic-directives/mapSettings.html) | Transforms the [`RoutingSettings`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/settings/RoutingSettings.html "akka.http.javadsl.settings.RoutingSettings")[`RoutingSettings`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/settings/RoutingSettings.html "akka.http.scaladsl.settings.RoutingSettings") with a `RoutingSettings => RoutingSettings``UnaryOperator<RoutingSettings>` function |
| [mapUnmatchedPath](basic-directives/mapUnmatchedPath.html) | Transforms the `unmatchedPath` of the [`RequestContext`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/RequestContext.html "akka.http.javadsl.server.RequestContext")[`RequestContext`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/RequestContext.html "akka.http.scaladsl.server.RequestContext") using a `Uri.Path => Uri.Path``UnaryOperator<Uri.Path>` function |
| [method](method-directives/method.html) | Rejects all requests whose HTTP method does not match the given one |
| [onComplete](future-directives/onComplete.html) | “Unwraps” a `Future[T]``CompletionStage<T>` and runs the inner route after future completion with the future’s value as an extraction of type `Try[T]``Try<T>` |
| [onCompleteWithBreaker](future-directives/onCompleteWithBreaker.html) | “Unwraps” a `Future[T]``CompletionStage<T>` inside a [`CircuitBreaker`](https://doc.akka.io/api/akka/2.10/akka/pattern/CircuitBreaker.html "akka.pattern.CircuitBreaker")[`CircuitBreaker`](https://doc.akka.io/japi/akka/2.10/akka/pattern/CircuitBreaker.html "akka.pattern.CircuitBreaker") and runs the inner route after future completion with the future’s value as an extraction of type `Try[T]``Try<T>` |
| [onSuccess](future-directives/onSuccess.html) | “Unwraps” a `Future[T]``CompletionStage<T>` and runs the inner route after future completion with the future’s value as an extraction of type `T` |
| [optionalAttribute](attribute-directives/optionalAttribute.html) | Extracts the value of an optional request attribute with a given key |
| [optionalCookie](cookie-directives/optionalCookie.html) | Extracts the [`HttpCookiePair`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/headers/HttpCookiePair.html "akka.http.javadsl.model.headers.HttpCookiePair")[`HttpCookiePair`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/HttpCookiePair.html "akka.http.scaladsl.model.headers.HttpCookiePair") with the given name as an `Option[HttpCookiePair]``Optional<HttpCookiePair>` |
| [optionalHeaderValue](header-directives/optionalHeaderValue.html) | Extracts an optional HTTP header value using a given `HttpHeader => Option[T]``Function<HttpHeader, Optional<T>>` function |
| [optionalHeaderValueByName](header-directives/optionalHeaderValueByName.html) | Extracts the value of the first optional HTTP request header with a given name |
| [optionalHeaderValueByType](header-directives/optionalHeaderValueByType.html) | Extracts the first optional HTTP request header of the given type |
| [optionalHeaderValuePF](header-directives/optionalHeaderValuePF.html) | Extracts an optional HTTP header value using a given `PartialFunction[HttpHeader, T]``PartialFunction<HttpHeader, T>` |
| [options](method-directives/options.html) | Rejects all non\-OPTIONS requests |
| [overrideMethodWithParameter](method-directives/overrideMethodWithParameter.html) | Changes the request method to the value of the specified query parameter |
| [parameter](parameter-directives/parameter.html) | Extracts a query parameter value from the request |
| [parameterMap](parameter-directives/parameterMap.html) | Extracts the request’s query parameters as a `Map[String, String]``Map<String, String>` |
| [parameterMultiMap](parameter-directives/parameterMultiMap.html) | Extracts the request’s query parameters as a `Map[String, List[String]]``Map<String, List<String>>` |
| [parameters](parameter-directives/parameters.html) | Extracts a number of query parameter values from the request |
| [parameterSeq](parameter-directives/parameterSeq.html) | Extracts the request’s query parameters as a `Seq[(String, String)]``List<Map.Entry<String, String>>` |
| [pass](basic-directives/pass.html) | Always simply passes the request on to its inner route, i.e. doesn’t do anything, neither with the request nor the response |
| [patch](method-directives/patch.html) | Rejects all non\-PATCH requests |
| [path](path-directives/path.html) | Applies the given `PathMatcher` to the remaining unmatched path after consuming a leading slash |
| [pathEnd](path-directives/pathEnd.html) | Only passes on the request to its inner route if the request path has been matched completely |
| [pathEndOrSingleSlash](path-directives/pathEndOrSingleSlash.html) | Only passes on the request to its inner route if the request path has been matched completely or only consists of exactly one remaining slash |
| [pathPrefix](path-directives/pathPrefix.html) | Applies the given `PathMatcher` to a prefix of the remaining unmatched path after consuming a leading slash |
| [pathPrefixTest](path-directives/pathPrefixTest.html) | Checks whether the unmatchedPath has a prefix matched by the given `PathMatcher` after implicitly consuming a leading slash |
| [pathSingleSlash](path-directives/pathSingleSlash.html) | Only passes on the request to its inner route if the request path consists of exactly one remaining slash |
| [pathSuffix](path-directives/pathSuffix.html) | Applies the given `PathMatcher` to a suffix of the remaining unmatched path (Caution: check scaladocjava!) |
| [pathSuffixTest](path-directives/pathSuffixTest.html) | Checks whether the unmatched path has a suffix matched by the given `PathMatcher` (Caution: check scaladocjava!) |
| [post](method-directives/post.html) | Rejects all non\-POST requests |
| [provide](basic-directives/provide.html) | Injects a given value into a directive |
| [put](method-directives/put.html) | Rejects all non\-PUT requests |
| [rawPathPrefix](path-directives/rawPathPrefix.html) | Applies the given matcher directly to a prefix of the unmatched path of the [`RequestContext`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/RequestContext.html "akka.http.javadsl.server.RequestContext")[`RequestContext`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/RequestContext.html "akka.http.scaladsl.server.RequestContext"), without implicitly consuming a leading slash |
| [rawPathPrefixTest](path-directives/rawPathPrefixTest.html) | Checks whether the unmatchedPath has a prefix matched by the given `PathMatcher` |
| [recoverRejections](basic-directives/recoverRejections.html) | Transforms rejections from the inner route with an `immutable.Seq[Rejection] => RouteResult``Function<List<Rejection>, RouteResult>` function |
| [recoverRejectionsWith](basic-directives/recoverRejectionsWith.html) | Transforms rejections from the inner route with an `immutable.Seq[Rejection] => Future[RouteResult]``Function<List<Rejection], CompletionStage<RouteResult>>` function |
| [redirect](route-directives/redirect.html) | Completes the request with redirection response of the given type to the given URI |
| [redirectToNoTrailingSlashIfPresent](path-directives/redirectToNoTrailingSlashIfPresent.html) | If the request path ends with a slash, redirects to the same URI without trailing slash in the path |
| [redirectToTrailingSlashIfMissing](path-directives/redirectToTrailingSlashIfMissing.html) | If the request path doesn’t end with a slash, redirects to the same URI with trailing slash in the path |
| [reject](route-directives/reject.html) | Rejects the request with the given rejections |
| [rejectEmptyResponse](misc-directives/rejectEmptyResponse.html) | Converts responses with an empty entity into (empty) rejections |
| [requestEncodedWith](coding-directives/requestEncodedWith.html) | Rejects the request with an [`UnsupportedRequestEncodingRejection`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/UnsupportedRequestEncodingRejection.html "akka.http.javadsl.server.UnsupportedRequestEncodingRejection")[`UnsupportedRequestEncodingRejection`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/UnsupportedRequestEncodingRejection.html "akka.http.scaladsl.server.UnsupportedRequestEncodingRejection") if its encoding doesn’t match the given one |
| [requestEntityEmpty](misc-directives/requestEntityEmpty.html) | Rejects if the request entity is non\-empty |
| [requestEntityPresent](misc-directives/requestEntityPresent.html) | Rejects with a [`RequestEntityExpectedRejection`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/RequestEntityExpectedRejection.html "akka.http.javadsl.server.RequestEntityExpectedRejection")[`RequestEntityExpectedRejection`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/RequestEntityExpectedRejection$.html "akka.http.scaladsl.server.RequestEntityExpectedRejection") if the request entity is empty |
| [requireClientCertificateIdentity](tls-directives/requireClientCertificateIdentity.html) | Reject mTLS requests that does not have a client certificate identity matching a regular expression |
| [respondWithDefaultHeader](respond-with-directives/respondWithDefaultHeader.html) | Adds a given response header if the response doesn’t already contain a header with the same name |
| [respondWithDefaultHeaders](respond-with-directives/respondWithDefaultHeaders.html) | Adds the subset of the given headers to the response which doesn’t already have a header with the respective name present in the response |
| [respondWithHeader](respond-with-directives/respondWithHeader.html) | Unconditionally adds a given header to the outgoing response |
| [respondWithHeaders](respond-with-directives/respondWithHeaders.html) | Unconditionally adds the given headers to the outgoing response |
| [responseEncodingAccepted](coding-directives/responseEncodingAccepted.html) | Rejects the request with an [`UnacceptedResponseEncodingRejection`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/UnacceptedResponseEncodingRejection.html "akka.http.javadsl.server.UnacceptedResponseEncodingRejection")[`UnacceptedResponseEncodingRejection`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/UnacceptedResponseEncodingRejection.html "akka.http.scaladsl.server.UnacceptedResponseEncodingRejection") if the given response encoding is not accepted by the client |
| [scheme](scheme-directives/scheme.html) | Rejects all requests whose URI scheme doesn’t match the given one |
| [selectPreferredLanguage](misc-directives/selectPreferredLanguage.html) | Inspects the request’s `Accept-Language` header and determines, which of a given set of language alternatives is preferred by the client |
| [setCookie](cookie-directives/setCookie.html) | Adds a `Set-Cookie` response header with the given cookies |
| [storeUploadedFile](file-upload-directives/storeUploadedFile.html) | Streams one uploaded file from a multipart request to a file on disk |
| [storeUploadedFiles](file-upload-directives/storeUploadedFiles.html) | Streams all uploaded files from a multipart request to files on disk |
| [textract](basic-directives/textract.html) | Extracts a number of values using a `RequestContext => Tuple` function |
| [tprovide](basic-directives/tprovide.html) | Injects a given tuple of values into a directive |
| [validate](misc-directives/validate.html) | Checks a given condition before running its inner route |
| [withoutRequestTimeout](timeout-directives/withoutRequestTimeout.html) | Disables [request timeouts](../../common/timeouts.html#request-timeout) for a given route. |
| [withoutSizeLimit](misc-directives/withoutSizeLimit.html) | Skips request entity size check |
| [withExecutionContext](basic-directives/withExecutionContext.html) | Runs its inner route with the given alternative `ExecutionContext` |
| [withLog](basic-directives/withLog.html) | Runs its inner route with the given alternative [`LoggingAdapter`](https://doc.akka.io/api/akka/2.10/akka/event/LoggingAdapter.html "akka.event.LoggingAdapter")[`LoggingAdapter`](https://doc.akka.io/japi/akka/2.10/akka/event/LoggingAdapter.html "akka.event.LoggingAdapter") |
| [withMaterializer](basic-directives/withMaterializer.html) | Runs its inner route with the given alternative [`Materializer`](https://doc.akka.io/api/akka/2.10/akka/stream/Materializer.html "akka.stream.Materializer")[`Materializer`](https://doc.akka.io/japi/akka/2.10/akka/stream/Materializer.html "akka.stream.Materializer") |
| [withPrecompressedMediaTypeSupport](coding-directives/withPrecompressedMediaTypeSupport.html) | Adds a `Content-Encoding: gzip` response header if the entity’s media\-type is precompressed with gzip header |
| [withRangeSupport](range-directives/withRangeSupport.html) | Adds `Accept-Ranges: bytes` to responses to GET requests, produces partial responses if the initial request contained a valid `Range` header |
| [withRequestTimeout](timeout-directives/withRequestTimeout.html) | Configures the [request timeouts](../../common/timeouts.html#request-timeout) for a given route. |
| [withRequestTimeoutResponse](timeout-directives/withRequestTimeoutResponse.html) | Prepares the [`HttpResponse`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpResponse.html "akka.http.javadsl.model.HttpResponse")[`HttpResponse`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpResponse.html "akka.http.scaladsl.model.HttpResponse") that is emitted if a request timeout is triggered. `RequestContext => RequestContext` function |
| [withSettings](basic-directives/withSettings.html) | Runs its inner route with the given alternative [`RoutingSettings`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/settings/RoutingSettings.html "akka.http.javadsl.settings.RoutingSettings")[`RoutingSettings`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/settings/RoutingSettings.html "akka.http.scaladsl.settings.RoutingSettings") |
| [withSizeLimit](misc-directives/withSizeLimit.html) | Applies request entity size check |

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/caching/scaladsl/Cache.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpRequest.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpResponse.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/RequestEntity.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/Authorization.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/HttpCookie.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/HttpCookiePair.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/HttpCredentials.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/ws/UpgradeToWebSocket.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/ExceptionHandler.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/ExpectedWebSocketRequestRejection$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/RequestContext.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/RequestEntityExpectedRejection$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/RouteResult.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/TransformationRejection.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/UnacceptedResponseEncodingRejection.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/UnsupportedRequestEncodingRejection.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/UnsupportedWebSocketSubprotocolRejection.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/settings/ParserSettings.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/settings/RoutingSettings.html
- https://doc.akka.io/api/akka/2.10/akka/event/LoggingAdapter.html
- https://doc.akka.io/api/akka/2.10/akka/pattern/CircuitBreaker.html
- https://doc.akka.io/api/akka/2.10/akka/stream/Materializer.html
- https://doc.akka.io/api/akka/2.10/akka/stream/scaladsl/Source.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/caching/javadsl/Cache.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpRequest.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpResponse.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/RequestEntity.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/headers/Authorization.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/headers/HttpCookie.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/headers/HttpCookiePair.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/headers/HttpCredentials.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/ws/UpgradeToWebSocket.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/ExceptionHandler.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/ExpectedWebSocketRequestRejection.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/RequestContext.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/RequestEntityExpectedRejection.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/Route.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/RouteResult.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/TransformationRejection.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/UnacceptedResponseEncodingRejection.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/UnsupportedRequestEncodingRejection.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/UnsupportedWebSocketSubprotocolRejection.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/settings/ParserSettings.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/settings/RoutingSettings.html
- https://doc.akka.io/japi/akka/2.10/akka/event/LoggingAdapter.html
- https://doc.akka.io/japi/akka/2.10/akka/pattern/CircuitBreaker.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/Materializer.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/alphabetically.html](https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/alphabetically.html)*