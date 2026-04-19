---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:48:45Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/directives/CookieDirectives.html
title: CookieDirectives
---

# CookieDirectives

## Content

Package [akka.http.javadsl.server.directives](package-summary.html)
## Class CookieDirectives

- java.lang.Object
- - [akka.http.javadsl.server.directives.BasicDirectives](BasicDirectives.html "class in akka.http.javadsl.server.directives")
	- - [akka.http.javadsl.server.directives.CacheConditionDirectives](CacheConditionDirectives.html "class in akka.http.javadsl.server.directives")
		- - [akka.http.javadsl.server.directives.CodingDirectives](CodingDirectives.html "class in akka.http.javadsl.server.directives")
			- - akka.http.javadsl.server.directives.CookieDirectives

- Direct Known Subclasses:
`[DebuggingDirectives](DebuggingDirectives.html "class in akka.http.javadsl.server.directives")`

---

```
public abstract class CookieDirectives
extends [CodingDirectives](CodingDirectives.html "class in akka.http.javadsl.server.directives")
```

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[CookieDirectives](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[Route](../Route.html "interface in akka.http.javadsl.server")` | `[cookie](#cookie(java.lang.String,java.util.function.Function))​(java.lang.String name,  java.util.function.Function<[HttpCookiePair](../../model/headers/HttpCookiePair.html "class in akka.http.javadsl.model.headers"),​[Route](../Route.html "interface in akka.http.javadsl.server")> inner)` | Extracts the `HttpCookiePair` with the given name. |
	| `[Route](../Route.html "interface in akka.http.javadsl.server")` | `[deleteCookie](#deleteCookie(akka.http.javadsl.model.headers.HttpCookie,java.util.function.Supplier))​([HttpCookie](../../model/headers/HttpCookie.html "class in akka.http.javadsl.model.headers") cookie,  java.util.function.Supplier<[Route](../Route.html "interface in akka.http.javadsl.server")> inner)` | Adds a {@link Set\-Cookie} response header expiring the given cookie. |
	| `[Route](../Route.html "interface in akka.http.javadsl.server")` | `[deleteCookie](#deleteCookie(java.lang.Iterable,java.util.function.Supplier))​(java.lang.Iterable<[HttpCookie](../../model/headers/HttpCookie.html "class in akka.http.javadsl.model.headers")> cookies,  java.util.function.Supplier<[Route](../Route.html "interface in akka.http.javadsl.server")> inner)` | Adds a {@link Set\-Cookie} response header expiring the given cookies. |
	| `[Route](../Route.html "interface in akka.http.javadsl.server")` | `[deleteCookie](#deleteCookie(java.lang.String,java.lang.String,java.lang.String,java.util.function.Supplier))​(java.lang.String name,  java.lang.String domain,  java.lang.String path,  java.util.function.Supplier<[Route](../Route.html "interface in akka.http.javadsl.server")> inner)` | Adds a {@link Set\-Cookie} response header expiring the cookie with the given properties. |
	| `[Route](../Route.html "interface in akka.http.javadsl.server")` | `[deleteCookie](#deleteCookie(java.lang.String,java.lang.String,java.util.function.Supplier))​(java.lang.String name,  java.lang.String domain,  java.util.function.Supplier<[Route](../Route.html "interface in akka.http.javadsl.server")> inner)` | Adds a {@link Set\-Cookie} response header expiring the cookie with the given properties. |
	| `[Route](../Route.html "interface in akka.http.javadsl.server")` | `[deleteCookie](#deleteCookie(java.lang.String,java.util.function.Supplier))​(java.lang.String name,  java.util.function.Supplier<[Route](../Route.html "interface in akka.http.javadsl.server")> inner)` | Adds a {@link Set\-Cookie} response header expiring the cookie with the given properties. |
	| `[Route](../Route.html "interface in akka.http.javadsl.server")` | `[optionalCookie](#optionalCookie(java.lang.String,java.util.function.Function))​(java.lang.String name,  java.util.function.Function<java.util.Optional<[HttpCookiePair](../../model/headers/HttpCookiePair.html "class in akka.http.javadsl.model.headers")>,​[Route](../Route.html "interface in akka.http.javadsl.server")> inner)` | Extracts the `HttpCookiePair` with the given name as an `Option[HttpCookiePair]`. |
	| `[Route](../Route.html "interface in akka.http.javadsl.server")` | `[setCookie](#setCookie(akka.http.javadsl.model.headers.HttpCookie,java.util.function.Supplier))​([HttpCookie](../../model/headers/HttpCookie.html "class in akka.http.javadsl.model.headers") cookie,  java.util.function.Supplier<[Route](../Route.html "interface in akka.http.javadsl.server")> inner)` | Adds a {@link Set\-Cookie} response header with the given cookie. |
	| `[Route](../Route.html "interface in akka.http.javadsl.server")` | `[setCookie](#setCookie(java.lang.Iterable,java.util.function.Supplier))​(java.lang.Iterable<[HttpCookie](../../model/headers/HttpCookie.html "class in akka.http.javadsl.model.headers")> cookies,  java.util.function.Supplier<[Route](../Route.html "interface in akka.http.javadsl.server")> inner)` | Adds a {@link Set\-Cookie} response header with the given cookies. |
	
	
		- ### Methods inherited from class akka.http.javadsl.server.directives.[CodingDirectives](CodingDirectives.html "class in akka.http.javadsl.server.directives")
		
		
		`[decodeRequest](CodingDirectives.html#decodeRequest(java.util.function.Supplier)), [decodeRequestWith](CodingDirectives.html#decodeRequestWith(akka.http.javadsl.coding.Coder,java.util.function.Supplier)), [decodeRequestWith](CodingDirectives.html#decodeRequestWith(java.lang.Iterable,java.util.function.Supplier)), [encodeResponse](CodingDirectives.html#encodeResponse(java.util.function.Supplier)), [encodeResponseWith](CodingDirectives.html#encodeResponseWith(java.lang.Iterable,java.util.function.Supplier)), [requestEncodedWith](CodingDirectives.html#requestEncodedWith(akka.http.javadsl.model.headers.HttpEncoding,java.util.function.Supplier)), [responseEncodingAccepted](CodingDirectives.html#responseEncodingAccepted(akka.http.javadsl.model.headers.HttpEncoding,java.util.function.Supplier)), [withPrecompressedMediaTypeSupport](CodingDirectives.html#withPrecompressedMediaTypeSupport(java.util.function.Supplier))`
		- ### Methods inherited from class akka.http.javadsl.server.directives.[CacheConditionDirectives](CacheConditionDirectives.html "class in akka.http.javadsl.server.directives")
		
		
		`[conditional](CacheConditionDirectives.html#conditional(akka.http.javadsl.model.DateTime,java.util.function.Supplier)), [conditional](CacheConditionDirectives.html#conditional(akka.http.javadsl.model.headers.EntityTag,akka.http.javadsl.model.DateTime,java.util.function.Supplier)), [conditional](CacheConditionDirectives.html#conditional(akka.http.javadsl.model.headers.EntityTag,java.util.function.Supplier)), [conditional](CacheConditionDirectives.html#conditional(java.util.Optional,java.util.Optional,java.util.function.Supplier))`
		- ### Methods inherited from class akka.http.javadsl.server.directives.[BasicDirectives](BasicDirectives.html "class in akka.http.javadsl.server.directives")
		
		
		`[cancelRejection](BasicDirectives.html#cancelRejection(akka.http.javadsl.server.Rejection,java.util.function.Supplier)), [cancelRejections](BasicDirectives.html#cancelRejections(java.lang.Iterable,java.util.function.Supplier)), [cancelRejections](BasicDirectives.html#cancelRejections(java.util.function.Predicate,java.util.function.Supplier)), [extract](BasicDirectives.html#extract(java.util.function.Function,java.util.function.Function)), [extractActorSystem](BasicDirectives.html#extractActorSystem(java.util.function.Function)), [extractDataBytes](BasicDirectives.html#extractDataBytes(java.util.function.Function)), [extractEntity](BasicDirectives.html#extractEntity(java.util.function.Function)), [extractExecutionContext](BasicDirectives.html#extractExecutionContext(java.util.function.Function)), [extractLog](BasicDirectives.html#extractLog(java.util.function.Function)), [extractMatchedPath](BasicDirectives.html#extractMatchedPath(java.util.function.Function)), [extractMaterializer](BasicDirectives.html#extractMaterializer(java.util.function.Function)), [extractParserSettings](BasicDirectives.html#extractParserSettings(java.util.function.Function)), [extractRequest](BasicDirectives.html#extractRequest(java.util.function.Function)), [extractRequestContext](BasicDirectives.html#extractRequestContext(java.util.function.Function)), [extractRequestEntity](BasicDirectives.html#extractRequestEntity(java.util.function.Function)), [extractSettings](BasicDirectives.html#extractSettings(java.util.function.Function)), [extractStrictEntity](BasicDirectives.html#extractStrictEntity(scala.concurrent.duration.FiniteDuration,long,java.util.function.Function)), [extractStrictEntity](BasicDirectives.html#extractStrictEntity(scala.concurrent.duration.FiniteDuration,java.util.function.Function)), [extractUnmatchedPath](BasicDirectives.html#extractUnmatchedPath(java.util.function.Function)), [extractUri](BasicDirectives.html#extractUri(java.util.function.Function)), [mapInnerRoute](BasicDirectives.html#mapInnerRoute(java.util.function.Function,java.util.function.Supplier)), [mapRejections](BasicDirectives.html#mapRejections(java.util.function.Function,java.util.function.Supplier)), [mapRequest](BasicDirectives.html#mapRequest(java.util.function.Function,java.util.function.Supplier)), [mapRequestContext](BasicDirectives.html#mapRequestContext(java.util.function.Function,java.util.function.Supplier)), [mapResponse](BasicDirectives.html#mapResponse(java.util.function.Function,java.util.function.Supplier)), [mapResponseEntity](BasicDirectives.html#mapResponseEntity(java.util.function.Function,java.util.function.Supplier)), [mapResponseHeaders](BasicDirectives.html#mapResponseHeaders(java.util.function.Function,java.util.function.Supplier)), [mapRouteResult](BasicDirectives.html#mapRouteResult(java.util.function.Function,java.util.function.Supplier)), [mapRouteResultFuture](BasicDirectives.html#mapRouteResultFuture(java.util.function.Function,java.util.function.Supplier)), [mapRouteResultPF](BasicDirectives.html#mapRouteResultPF(scala.PartialFunction,java.util.function.Supplier)), [mapRouteResultWith](BasicDirectives.html#mapRouteResultWith(java.util.function.Function,java.util.function.Supplier)), [mapRouteResultWithPF](BasicDirectives.html#mapRouteResultWithPF(scala.PartialFunction,java.util.function.Supplier)), [mapSettings](BasicDirectives.html#mapSettings(java.util.function.Function,java.util.function.Supplier)), [mapUnmatchedPath](BasicDirectives.html#mapUnmatchedPath(java.util.function.Function,java.util.function.Supplier)), [pass](BasicDirectives.html#pass(java.util.function.Supplier)), [provide](BasicDirectives.html#provide(T,java.util.function.Function)), [recoverRejections](BasicDirectives.html#recoverRejections(java.util.function.Function,java.util.function.Supplier)), [recoverRejectionsWith](BasicDirectives.html#recoverRejectionsWith(java.util.function.Function,java.util.function.Supplier)), [toStrictEntity](BasicDirectives.html#toStrictEntity(scala.concurrent.duration.FiniteDuration,long,java.util.function.Supplier)), [toStrictEntity](BasicDirectives.html#toStrictEntity(scala.concurrent.duration.FiniteDuration,java.util.function.Supplier)), [withExecutionContext](BasicDirectives.html#withExecutionContext(scala.concurrent.ExecutionContextExecutor,java.util.function.Supplier)), [withLog](BasicDirectives.html#withLog(akka.event.LoggingAdapter,java.util.function.Supplier)), [withMaterializer](BasicDirectives.html#withMaterializer(akka.stream.Materializer,java.util.function.Supplier)), [withSettings](BasicDirectives.html#withSettings(akka.http.javadsl.settings.RoutingSettings,java.util.function.Supplier))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### CookieDirectives
		
		
		
		```
		public CookieDirectives()
		```

	- ### Method Detail
	
	
	
		- #### cookie
		
		
		
		```
		public [Route](../Route.html "interface in akka.http.javadsl.server") cookie​(java.lang.String name,
		                    java.util.function.Function<[HttpCookiePair](../../model/headers/HttpCookiePair.html "class in akka.http.javadsl.model.headers"),​[Route](../Route.html "interface in akka.http.javadsl.server")> inner)
		```
		
		Extracts the `HttpCookiePair` with the given name. If the cookie is not present the
		 request is rejected with a respective [`MissingCookieRejection`](../MissingCookieRejection.html "interface in akka.http.javadsl.server").
		
		Parameters:
		`name` \- (undocumented)
		`inner` \- (undocumented)
		Returns:
		(undocumented)
		- #### deleteCookie
		
		
		
		```
		public [Route](../Route.html "interface in akka.http.javadsl.server") deleteCookie​([HttpCookie](../../model/headers/HttpCookie.html "class in akka.http.javadsl.model.headers") cookie,
		                          java.util.function.Supplier<[Route](../Route.html "interface in akka.http.javadsl.server")> inner)
		```
		
		Adds a {@link Set\-Cookie} response header expiring the given cookie.
		
		Parameters:
		`cookie` \- (undocumented)
		`inner` \- (undocumented)
		Returns:
		(undocumented)
		- #### deleteCookie
		
		
		
		```
		public [Route](../Route.html "interface in akka.http.javadsl.server") deleteCookie​(java.lang.Iterable<[HttpCookie](../../model/headers/HttpCookie.html "class in akka.http.javadsl.model.headers")> cookies,
		                          java.util.function.Supplier<[Route](../Route.html "interface in akka.http.javadsl.server")> inner)
		```
		
		Adds a {@link Set\-Cookie} response header expiring the given cookies.
		
		Parameters:
		`cookies` \- (undocumented)
		`inner` \- (undocumented)
		Returns:
		(undocumented)
		- #### deleteCookie
		
		
		
		```
		public [Route](../Route.html "interface in akka.http.javadsl.server") deleteCookie​(java.lang.String name,
		                          java.util.function.Supplier<[Route](../Route.html "interface in akka.http.javadsl.server")> inner)
		```
		
		Adds a {@link Set\-Cookie} response header expiring the cookie with the given properties.
		 
		
		Parameters:
		`name` \- Name of the cookie to match
		`inner` \- (undocumented)
		Returns:
		(undocumented)
		- #### deleteCookie
		
		
		
		```
		public [Route](../Route.html "interface in akka.http.javadsl.server") deleteCookie​(java.lang.String name,
		                          java.lang.String domain,
		                          java.util.function.Supplier<[Route](../Route.html "interface in akka.http.javadsl.server")> inner)
		```
		
		Adds a {@link Set\-Cookie} response header expiring the cookie with the given properties.
		 
		
		Parameters:
		`name` \- Name of the cookie to match
		`domain` \- Domain of the cookie to match, or empty string to match any domain
		`inner` \- (undocumented)
		Returns:
		(undocumented)
		- #### deleteCookie
		
		
		
		```
		public [Route](../Route.html "interface in akka.http.javadsl.server") deleteCookie​(java.lang.String name,
		                          java.lang.String domain,
		                          java.lang.String path,
		                          java.util.function.Supplier<[Route](../Route.html "interface in akka.http.javadsl.server")> inner)
		```
		
		Adds a {@link Set\-Cookie} response header expiring the cookie with the given properties.
		 
		
		Parameters:
		`name` \- Name of the cookie to match
		`domain` \- Domain of the cookie to match, or empty string to match any domain
		`path` \- Path of the cookie to match, or empty string to match any path
		`inner` \- (undocumented)
		Returns:
		(undocumented)
		- #### optionalCookie
		
		
		
		```
		public [Route](../Route.html "interface in akka.http.javadsl.server") optionalCookie​(java.lang.String name,
		                            java.util.function.Function<java.util.Optional<[HttpCookiePair](../../model/headers/HttpCookiePair.html "class in akka.http.javadsl.model.headers")>,​[Route](../Route.html "interface in akka.http.javadsl.server")> inner)
		```
		
		Extracts the `HttpCookiePair` with the given name as an `Option[HttpCookiePair]`.
		 If the cookie is not present a value of `None` is extracted.
		
		Parameters:
		`name` \- (undocumented)
		`inner` \- (undocumented)
		Returns:
		(undocumented)
		- #### setCookie
		
		
		
		```
		public [Route](../Route.html "interface in akka.http.javadsl.server") setCookie​([HttpCookie](../../model/headers/HttpCookie.html "class in akka.http.javadsl.model.headers") cookie,
		                       java.util.function.Supplier<[Route](../Route.html "interface in akka.http.javadsl.server")> inner)
		```
		
		Adds a {@link Set\-Cookie} response header with the given cookie.
		
		Parameters:
		`cookie` \- (undocumented)
		`inner` \- (undocumented)
		Returns:
		(undocumented)
		- #### setCookie
		
		
		
		```
		public [Route](../Route.html "interface in akka.http.javadsl.server") setCookie​(java.lang.Iterable<[HttpCookie](../../model/headers/HttpCookie.html "class in akka.http.javadsl.model.headers")> cookies,
		                       java.util.function.Supplier<[Route](../Route.html "interface in akka.http.javadsl.server")> inner)
		```
		
		Adds a {@link Set\-Cookie} response header with the given cookies.
		
		Parameters:
		`cookies` \- (undocumented)
		`inner` \- (undocumented)
		Returns:
		(undocumented)

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/headers/HttpCookie.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/headers/HttpCookiePair.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/MissingCookieRejection.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/Route.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/directives/BasicDirectives.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/directives/CacheConditionDirectives.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/directives/CodingDirectives.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/directives/DebuggingDirectives.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/directives/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/directives/CookieDirectives.html](https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/directives/CookieDirectives.html)*