---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:48:44Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/directives/CodingDirectives.html
title: CodingDirectives
---

# CodingDirectives

## Content

Package [akka.http.javadsl.server.directives](package-summary.html)
## Class CodingDirectives

- java.lang.Object
- - [akka.http.javadsl.server.directives.BasicDirectives](BasicDirectives.html "class in akka.http.javadsl.server.directives")
	- - [akka.http.javadsl.server.directives.CacheConditionDirectives](CacheConditionDirectives.html "class in akka.http.javadsl.server.directives")
		- - akka.http.javadsl.server.directives.CodingDirectives

- Direct Known Subclasses:
`[CookieDirectives](CookieDirectives.html "class in akka.http.javadsl.server.directives")`

---

```
public abstract class CodingDirectives
extends [CacheConditionDirectives](CacheConditionDirectives.html "class in akka.http.javadsl.server.directives")
```

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[CodingDirectives](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[Route](../Route.html "interface in akka.http.javadsl.server")` | `[decodeRequest](#decodeRequest(java.util.function.Supplier))​(java.util.function.Supplier<[Route](../Route.html "interface in akka.http.javadsl.server")> inner)` | Decompresses the incoming request if it is `gzip` or `deflate` compressed. |
	| `[Route](../Route.html "interface in akka.http.javadsl.server")` | `[decodeRequestWith](#decodeRequestWith(akka.http.javadsl.coding.Coder,java.util.function.Supplier))​([Coder](../../coding/Coder.html "enum in akka.http.javadsl.coding") coder,  java.util.function.Supplier<[Route](../Route.html "interface in akka.http.javadsl.server")> inner)` | Decodes the incoming request using the given Decoder. |
	| `[Route](../Route.html "interface in akka.http.javadsl.server")` | `[decodeRequestWith](#decodeRequestWith(java.lang.Iterable,java.util.function.Supplier))​(java.lang.Iterable<[Coder](../../coding/Coder.html "enum in akka.http.javadsl.coding")> coders,  java.util.function.Supplier<[Route](../Route.html "interface in akka.http.javadsl.server")> inner)` | Decodes the incoming request if it is encoded with one of the given  encoders. |
	| `[Route](../Route.html "interface in akka.http.javadsl.server")` | `[encodeResponse](#encodeResponse(java.util.function.Supplier))​(java.util.function.Supplier<[Route](../Route.html "interface in akka.http.javadsl.server")> inner)` | Encodes the response with the encoding that is requested by the client via the `Accept-  Encoding` header. |
	| `[Route](../Route.html "interface in akka.http.javadsl.server")` | `[encodeResponseWith](#encodeResponseWith(java.lang.Iterable,java.util.function.Supplier))​(java.lang.Iterable<[Coder](../../coding/Coder.html "enum in akka.http.javadsl.coding")> coders,  java.util.function.Supplier<[Route](../Route.html "interface in akka.http.javadsl.server")> inner)` | Encodes the response with the encoding that is requested by the client via the `Accept-  Encoding` header. |
	| `[Route](../Route.html "interface in akka.http.javadsl.server")` | `[requestEncodedWith](#requestEncodedWith(akka.http.javadsl.model.headers.HttpEncoding,java.util.function.Supplier))​([HttpEncoding](../../model/headers/HttpEncoding.html "class in akka.http.javadsl.model.headers") encoding,  java.util.function.Supplier<[Route](../Route.html "interface in akka.http.javadsl.server")> inner)` | Rejects the request with an UnsupportedRequestEncodingRejection if its encoding doesn't match the given one. |
	| `[Route](../Route.html "interface in akka.http.javadsl.server")` | `[responseEncodingAccepted](#responseEncodingAccepted(akka.http.javadsl.model.headers.HttpEncoding,java.util.function.Supplier))​([HttpEncoding](../../model/headers/HttpEncoding.html "class in akka.http.javadsl.model.headers") encoding,  java.util.function.Supplier<[Route](../Route.html "interface in akka.http.javadsl.server")> inner)` | Rejects the request with an UnacceptedResponseEncodingRejection  if the given response encoding is not accepted by the client. |
	| `[Route](../Route.html "interface in akka.http.javadsl.server")` | `[withPrecompressedMediaTypeSupport](#withPrecompressedMediaTypeSupport(java.util.function.Supplier))​(java.util.function.Supplier<[Route](../Route.html "interface in akka.http.javadsl.server")> inner)` | Inspects the response entity and adds a `Content-Encoding: gzip` response header if  the entity's media\-type is precompressed with gzip and no `Content-Encoding` header is present yet. |
	
	
		- ### Methods inherited from class akka.http.javadsl.server.directives.[CacheConditionDirectives](CacheConditionDirectives.html "class in akka.http.javadsl.server.directives")
		
		
		`[conditional](CacheConditionDirectives.html#conditional(akka.http.javadsl.model.DateTime,java.util.function.Supplier)), [conditional](CacheConditionDirectives.html#conditional(akka.http.javadsl.model.headers.EntityTag,akka.http.javadsl.model.DateTime,java.util.function.Supplier)), [conditional](CacheConditionDirectives.html#conditional(akka.http.javadsl.model.headers.EntityTag,java.util.function.Supplier)), [conditional](CacheConditionDirectives.html#conditional(java.util.Optional,java.util.Optional,java.util.function.Supplier))`
		- ### Methods inherited from class akka.http.javadsl.server.directives.[BasicDirectives](BasicDirectives.html "class in akka.http.javadsl.server.directives")
		
		
		`[cancelRejection](BasicDirectives.html#cancelRejection(akka.http.javadsl.server.Rejection,java.util.function.Supplier)), [cancelRejections](BasicDirectives.html#cancelRejections(java.lang.Iterable,java.util.function.Supplier)), [cancelRejections](BasicDirectives.html#cancelRejections(java.util.function.Predicate,java.util.function.Supplier)), [extract](BasicDirectives.html#extract(java.util.function.Function,java.util.function.Function)), [extractActorSystem](BasicDirectives.html#extractActorSystem(java.util.function.Function)), [extractDataBytes](BasicDirectives.html#extractDataBytes(java.util.function.Function)), [extractEntity](BasicDirectives.html#extractEntity(java.util.function.Function)), [extractExecutionContext](BasicDirectives.html#extractExecutionContext(java.util.function.Function)), [extractLog](BasicDirectives.html#extractLog(java.util.function.Function)), [extractMatchedPath](BasicDirectives.html#extractMatchedPath(java.util.function.Function)), [extractMaterializer](BasicDirectives.html#extractMaterializer(java.util.function.Function)), [extractParserSettings](BasicDirectives.html#extractParserSettings(java.util.function.Function)), [extractRequest](BasicDirectives.html#extractRequest(java.util.function.Function)), [extractRequestContext](BasicDirectives.html#extractRequestContext(java.util.function.Function)), [extractRequestEntity](BasicDirectives.html#extractRequestEntity(java.util.function.Function)), [extractSettings](BasicDirectives.html#extractSettings(java.util.function.Function)), [extractStrictEntity](BasicDirectives.html#extractStrictEntity(scala.concurrent.duration.FiniteDuration,long,java.util.function.Function)), [extractStrictEntity](BasicDirectives.html#extractStrictEntity(scala.concurrent.duration.FiniteDuration,java.util.function.Function)), [extractUnmatchedPath](BasicDirectives.html#extractUnmatchedPath(java.util.function.Function)), [extractUri](BasicDirectives.html#extractUri(java.util.function.Function)), [mapInnerRoute](BasicDirectives.html#mapInnerRoute(java.util.function.Function,java.util.function.Supplier)), [mapRejections](BasicDirectives.html#mapRejections(java.util.function.Function,java.util.function.Supplier)), [mapRequest](BasicDirectives.html#mapRequest(java.util.function.Function,java.util.function.Supplier)), [mapRequestContext](BasicDirectives.html#mapRequestContext(java.util.function.Function,java.util.function.Supplier)), [mapResponse](BasicDirectives.html#mapResponse(java.util.function.Function,java.util.function.Supplier)), [mapResponseEntity](BasicDirectives.html#mapResponseEntity(java.util.function.Function,java.util.function.Supplier)), [mapResponseHeaders](BasicDirectives.html#mapResponseHeaders(java.util.function.Function,java.util.function.Supplier)), [mapRouteResult](BasicDirectives.html#mapRouteResult(java.util.function.Function,java.util.function.Supplier)), [mapRouteResultFuture](BasicDirectives.html#mapRouteResultFuture(java.util.function.Function,java.util.function.Supplier)), [mapRouteResultPF](BasicDirectives.html#mapRouteResultPF(scala.PartialFunction,java.util.function.Supplier)), [mapRouteResultWith](BasicDirectives.html#mapRouteResultWith(java.util.function.Function,java.util.function.Supplier)), [mapRouteResultWithPF](BasicDirectives.html#mapRouteResultWithPF(scala.PartialFunction,java.util.function.Supplier)), [mapSettings](BasicDirectives.html#mapSettings(java.util.function.Function,java.util.function.Supplier)), [mapUnmatchedPath](BasicDirectives.html#mapUnmatchedPath(java.util.function.Function,java.util.function.Supplier)), [pass](BasicDirectives.html#pass(java.util.function.Supplier)), [provide](BasicDirectives.html#provide(T,java.util.function.Function)), [recoverRejections](BasicDirectives.html#recoverRejections(java.util.function.Function,java.util.function.Supplier)), [recoverRejectionsWith](BasicDirectives.html#recoverRejectionsWith(java.util.function.Function,java.util.function.Supplier)), [toStrictEntity](BasicDirectives.html#toStrictEntity(scala.concurrent.duration.FiniteDuration,long,java.util.function.Supplier)), [toStrictEntity](BasicDirectives.html#toStrictEntity(scala.concurrent.duration.FiniteDuration,java.util.function.Supplier)), [withExecutionContext](BasicDirectives.html#withExecutionContext(scala.concurrent.ExecutionContextExecutor,java.util.function.Supplier)), [withLog](BasicDirectives.html#withLog(akka.event.LoggingAdapter,java.util.function.Supplier)), [withMaterializer](BasicDirectives.html#withMaterializer(akka.stream.Materializer,java.util.function.Supplier)), [withSettings](BasicDirectives.html#withSettings(akka.http.javadsl.settings.RoutingSettings,java.util.function.Supplier))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### CodingDirectives
		
		
		
		```
		public CodingDirectives()
		```

	- ### Method Detail
	
	
	
		- #### decodeRequest
		
		
		
		```
		public [Route](../Route.html "interface in akka.http.javadsl.server") decodeRequest​(java.util.function.Supplier<[Route](../Route.html "interface in akka.http.javadsl.server")> inner)
		```
		
		Decompresses the incoming request if it is `gzip` or `deflate` compressed.
		 Uncompressed requests are passed through untouched.
		 If the request encoded with another encoding the request is rejected with an `UnsupportedRequestEncodingRejection`.
		
		Parameters:
		`inner` \- (undocumented)
		Returns:
		(undocumented)
		- #### decodeRequestWith
		
		
		
		```
		public [Route](../Route.html "interface in akka.http.javadsl.server") decodeRequestWith​([Coder](../../coding/Coder.html "enum in akka.http.javadsl.coding") coder,
		                               java.util.function.Supplier<[Route](../Route.html "interface in akka.http.javadsl.server")> inner)
		```
		
		Decodes the incoming request using the given Decoder.
		 If the request encoding doesn't match the request is rejected with an `UnsupportedRequestEncodingRejection`.
		
		Parameters:
		`coder` \- (undocumented)
		`inner` \- (undocumented)
		Returns:
		(undocumented)
		- #### decodeRequestWith
		
		
		
		```
		public [Route](../Route.html "interface in akka.http.javadsl.server") decodeRequestWith​(java.lang.Iterable<[Coder](../../coding/Coder.html "enum in akka.http.javadsl.coding")> coders,
		                               java.util.function.Supplier<[Route](../Route.html "interface in akka.http.javadsl.server")> inner)
		```
		
		Decodes the incoming request if it is encoded with one of the given
		 encoders. If the request encoding doesn't match one of the given encoders
		 the request is rejected with an `UnsupportedRequestEncodingRejection`.
		 If no decoders are given the default encoders (`Gzip`, `Deflate`, `NoCoding`) are used.
		
		Parameters:
		`coders` \- (undocumented)
		`inner` \- (undocumented)
		Returns:
		(undocumented)
		- #### encodeResponse
		
		
		
		```
		public [Route](../Route.html "interface in akka.http.javadsl.server") encodeResponse​(java.util.function.Supplier<[Route](../Route.html "interface in akka.http.javadsl.server")> inner)
		```
		
		Encodes the response with the encoding that is requested by the client via the `Accept-
		 Encoding` header. The response encoding is determined by the rules specified in
		 http://tools.ietf.org/html/rfc7231\#section\-5\.3\.4\.
		 
		 If the `Accept-Encoding` header is missing or empty or specifies an encoding other than
		 identity, gzip or deflate then no encoding is used.
		
		
		
		Parameters:
		`inner` \- (undocumented)
		Returns:
		(undocumented)
		- #### encodeResponseWith
		
		
		
		```
		public [Route](../Route.html "interface in akka.http.javadsl.server") encodeResponseWith​(java.lang.Iterable<[Coder](../../coding/Coder.html "enum in akka.http.javadsl.coding")> coders,
		                                java.util.function.Supplier<[Route](../Route.html "interface in akka.http.javadsl.server")> inner)
		```
		
		Encodes the response with the encoding that is requested by the client via the `Accept-
		 Encoding` header. The response encoding is determined by the rules specified in
		 http://tools.ietf.org/html/rfc7231\#section\-5\.3\.4\.
		 
		 If the `Accept-Encoding` header is missing then the response is encoded using the `first`
		 encoder.
		 
		
		
		 If the `Accept-Encoding` header is empty and `NoCoding` is part of the encoders then no
		 response encoding is used. Otherwise the request is rejected.
		 
		
		
		 If \[encoders] is empty, no encoding is performed.
		
		
		
		Parameters:
		`coders` \- (undocumented)
		`inner` \- (undocumented)
		Returns:
		(undocumented)
		- #### requestEncodedWith
		
		
		
		```
		public [Route](../Route.html "interface in akka.http.javadsl.server") requestEncodedWith​([HttpEncoding](../../model/headers/HttpEncoding.html "class in akka.http.javadsl.model.headers") encoding,
		                                java.util.function.Supplier<[Route](../Route.html "interface in akka.http.javadsl.server")> inner)
		```
		
		Rejects the request with an UnsupportedRequestEncodingRejection if its encoding doesn't match the given one.
		
		Parameters:
		`encoding` \- (undocumented)
		`inner` \- (undocumented)
		Returns:
		(undocumented)
		- #### responseEncodingAccepted
		
		
		
		```
		public [Route](../Route.html "interface in akka.http.javadsl.server") responseEncodingAccepted​([HttpEncoding](../../model/headers/HttpEncoding.html "class in akka.http.javadsl.model.headers") encoding,
		                                      java.util.function.Supplier<[Route](../Route.html "interface in akka.http.javadsl.server")> inner)
		```
		
		Rejects the request with an UnacceptedResponseEncodingRejection
		 if the given response encoding is not accepted by the client.
		
		Parameters:
		`encoding` \- (undocumented)
		`inner` \- (undocumented)
		Returns:
		(undocumented)
		- #### withPrecompressedMediaTypeSupport
		
		
		
		```
		public [Route](../Route.html "interface in akka.http.javadsl.server") withPrecompressedMediaTypeSupport​(java.util.function.Supplier<[Route](../Route.html "interface in akka.http.javadsl.server")> inner)
		```
		
		Inspects the response entity and adds a `Content-Encoding: gzip` response header if
		 the entity's media\-type is precompressed with gzip and no `Content-Encoding` header is present yet.
		
		Parameters:
		`inner` \- (undocumented)
		Returns:
		(undocumented)

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/coding/Coder.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/headers/HttpEncoding.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/Route.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/directives/BasicDirectives.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/directives/CacheConditionDirectives.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/directives/CookieDirectives.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/directives/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/directives/CodingDirectives.html](https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/directives/CodingDirectives.html)*