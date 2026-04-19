---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:48:48Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/directives/DebuggingDirectives.html
title: DebuggingDirectives
---

# DebuggingDirectives

## Content

Package [akka.http.javadsl.server.directives](package-summary.html)
## Class DebuggingDirectives

- java.lang.Object
- - [akka.http.javadsl.server.directives.BasicDirectives](BasicDirectives.html "class in akka.http.javadsl.server.directives")
	- - [akka.http.javadsl.server.directives.CacheConditionDirectives](CacheConditionDirectives.html "class in akka.http.javadsl.server.directives")
		- - [akka.http.javadsl.server.directives.CodingDirectives](CodingDirectives.html "class in akka.http.javadsl.server.directives")
			- - [akka.http.javadsl.server.directives.CookieDirectives](CookieDirectives.html "class in akka.http.javadsl.server.directives")
				- - akka.http.javadsl.server.directives.DebuggingDirectives

- Direct Known Subclasses:
`[ExecutionDirectives](ExecutionDirectives.html "class in akka.http.javadsl.server.directives")`

---

```
public abstract class DebuggingDirectives
extends [CookieDirectives](CookieDirectives.html "class in akka.http.javadsl.server.directives")
```

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[DebuggingDirectives](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[Route](../Route.html "interface in akka.http.javadsl.server")` | `[logRequest](#logRequest(java.lang.String,akka.event.Logging.LogLevel,java.util.function.Supplier))​(java.lang.String marker,  akka.event.Logging.LogLevel level,  java.util.function.Supplier<[Route](../Route.html "interface in akka.http.javadsl.server")> inner)` | Produces a log entry for every incoming request. |
	| `[Route](../Route.html "interface in akka.http.javadsl.server")` | `[logRequest](#logRequest(java.lang.String,java.util.function.Supplier))​(java.lang.String marker,  java.util.function.Supplier<[Route](../Route.html "interface in akka.http.javadsl.server")> inner)` | Produces a log entry for every incoming request. |
	| `[Route](../Route.html "interface in akka.http.javadsl.server")` | `[logRequest](#logRequest(java.util.function.Function,java.util.function.Supplier))​(java.util.function.Function<[HttpRequest](../../model/HttpRequest.html "class in akka.http.javadsl.model"),​[LogEntry](LogEntry.html "class in akka.http.javadsl.server.directives")> show,  java.util.function.Supplier<[Route](../Route.html "interface in akka.http.javadsl.server")> inner)` | Produces a log entry for every incoming request. |
	| `[RouteAdapter](RouteAdapter.html "class in akka.http.javadsl.server.directives")` | `[logRequestResult](#logRequestResult(java.util.function.BiFunction,java.util.function.BiFunction,java.util.function.Supplier))​(java.util.function.BiFunction<[HttpRequest](../../model/HttpRequest.html "class in akka.http.javadsl.model"),​[HttpResponse](../../model/HttpResponse.html "class in akka.http.javadsl.model"),​[LogEntry](LogEntry.html "class in akka.http.javadsl.server.directives")> showSuccess,  java.util.function.BiFunction<[HttpRequest](../../model/HttpRequest.html "class in akka.http.javadsl.model"),​java.util.List<[Rejection](../Rejection.html "interface in akka.http.javadsl.server")>,​[LogEntry](LogEntry.html "class in akka.http.javadsl.server.directives")> showRejection,  java.util.function.Supplier<[Route](../Route.html "interface in akka.http.javadsl.server")> inner)` | Produces a log entry for every request/response combination. |
	| `[RouteAdapter](RouteAdapter.html "class in akka.http.javadsl.server.directives")` | `[logRequestResultOptional](#logRequestResultOptional(java.util.function.BiFunction,java.util.function.BiFunction,java.util.function.Supplier))​(java.util.function.BiFunction<[HttpRequest](../../model/HttpRequest.html "class in akka.http.javadsl.model"),​[HttpResponse](../../model/HttpResponse.html "class in akka.http.javadsl.model"),​java.util.Optional<[LogEntry](LogEntry.html "class in akka.http.javadsl.server.directives")>> showSuccess,  java.util.function.BiFunction<[HttpRequest](../../model/HttpRequest.html "class in akka.http.javadsl.model"),​java.util.List<[Rejection](../Rejection.html "interface in akka.http.javadsl.server")>,​java.util.Optional<[LogEntry](LogEntry.html "class in akka.http.javadsl.server.directives")>> showRejection,  java.util.function.Supplier<[Route](../Route.html "interface in akka.http.javadsl.server")> inner)` | Optionally produces a log entry for every request/response combination. |
	| `[Route](../Route.html "interface in akka.http.javadsl.server")` | `[logResult](#logResult(java.lang.String,akka.event.Logging.LogLevel,java.util.function.Supplier))​(java.lang.String marker,  akka.event.Logging.LogLevel level,  java.util.function.Supplier<[Route](../Route.html "interface in akka.http.javadsl.server")> inner)` | Produces a log entry for every route result. |
	| `[Route](../Route.html "interface in akka.http.javadsl.server")` | `[logResult](#logResult(java.lang.String,java.util.function.Supplier))​(java.lang.String marker,  java.util.function.Supplier<[Route](../Route.html "interface in akka.http.javadsl.server")> inner)` | Produces a log entry for every route result. |
	| `[RouteAdapter](RouteAdapter.html "class in akka.http.javadsl.server.directives")` | `[logResult](#logResult(java.util.function.Function,java.util.function.Function,java.util.function.Supplier))​(java.util.function.Function<[HttpResponse](../../model/HttpResponse.html "class in akka.http.javadsl.model"),​[LogEntry](LogEntry.html "class in akka.http.javadsl.server.directives")> showSuccess,  java.util.function.Function<java.util.List<[Rejection](../Rejection.html "interface in akka.http.javadsl.server")>,​[LogEntry](LogEntry.html "class in akka.http.javadsl.server.directives")> showRejection,  java.util.function.Supplier<[Route](../Route.html "interface in akka.http.javadsl.server")> inner)` | Produces a log entry for every route result. |
	
	
		- ### Methods inherited from class akka.http.javadsl.server.directives.[CookieDirectives](CookieDirectives.html "class in akka.http.javadsl.server.directives")
		
		
		`[cookie](CookieDirectives.html#cookie(java.lang.String,java.util.function.Function)), [deleteCookie](CookieDirectives.html#deleteCookie(akka.http.javadsl.model.headers.HttpCookie,java.util.function.Supplier)), [deleteCookie](CookieDirectives.html#deleteCookie(java.lang.Iterable,java.util.function.Supplier)), [deleteCookie](CookieDirectives.html#deleteCookie(java.lang.String,java.lang.String,java.lang.String,java.util.function.Supplier)), [deleteCookie](CookieDirectives.html#deleteCookie(java.lang.String,java.lang.String,java.util.function.Supplier)), [deleteCookie](CookieDirectives.html#deleteCookie(java.lang.String,java.util.function.Supplier)), [optionalCookie](CookieDirectives.html#optionalCookie(java.lang.String,java.util.function.Function)), [setCookie](CookieDirectives.html#setCookie(akka.http.javadsl.model.headers.HttpCookie,java.util.function.Supplier)), [setCookie](CookieDirectives.html#setCookie(java.lang.Iterable,java.util.function.Supplier))`
		- ### Methods inherited from class akka.http.javadsl.server.directives.[CodingDirectives](CodingDirectives.html "class in akka.http.javadsl.server.directives")
		
		
		`[decodeRequest](CodingDirectives.html#decodeRequest(java.util.function.Supplier)), [decodeRequestWith](CodingDirectives.html#decodeRequestWith(akka.http.javadsl.coding.Coder,java.util.function.Supplier)), [decodeRequestWith](CodingDirectives.html#decodeRequestWith(java.lang.Iterable,java.util.function.Supplier)), [encodeResponse](CodingDirectives.html#encodeResponse(java.util.function.Supplier)), [encodeResponseWith](CodingDirectives.html#encodeResponseWith(java.lang.Iterable,java.util.function.Supplier)), [requestEncodedWith](CodingDirectives.html#requestEncodedWith(akka.http.javadsl.model.headers.HttpEncoding,java.util.function.Supplier)), [responseEncodingAccepted](CodingDirectives.html#responseEncodingAccepted(akka.http.javadsl.model.headers.HttpEncoding,java.util.function.Supplier)), [withPrecompressedMediaTypeSupport](CodingDirectives.html#withPrecompressedMediaTypeSupport(java.util.function.Supplier))`
		- ### Methods inherited from class akka.http.javadsl.server.directives.[CacheConditionDirectives](CacheConditionDirectives.html "class in akka.http.javadsl.server.directives")
		
		
		`[conditional](CacheConditionDirectives.html#conditional(akka.http.javadsl.model.DateTime,java.util.function.Supplier)), [conditional](CacheConditionDirectives.html#conditional(akka.http.javadsl.model.headers.EntityTag,akka.http.javadsl.model.DateTime,java.util.function.Supplier)), [conditional](CacheConditionDirectives.html#conditional(akka.http.javadsl.model.headers.EntityTag,java.util.function.Supplier)), [conditional](CacheConditionDirectives.html#conditional(java.util.Optional,java.util.Optional,java.util.function.Supplier))`
		- ### Methods inherited from class akka.http.javadsl.server.directives.[BasicDirectives](BasicDirectives.html "class in akka.http.javadsl.server.directives")
		
		
		`[cancelRejection](BasicDirectives.html#cancelRejection(akka.http.javadsl.server.Rejection,java.util.function.Supplier)), [cancelRejections](BasicDirectives.html#cancelRejections(java.lang.Iterable,java.util.function.Supplier)), [cancelRejections](BasicDirectives.html#cancelRejections(java.util.function.Predicate,java.util.function.Supplier)), [extract](BasicDirectives.html#extract(java.util.function.Function,java.util.function.Function)), [extractActorSystem](BasicDirectives.html#extractActorSystem(java.util.function.Function)), [extractDataBytes](BasicDirectives.html#extractDataBytes(java.util.function.Function)), [extractEntity](BasicDirectives.html#extractEntity(java.util.function.Function)), [extractExecutionContext](BasicDirectives.html#extractExecutionContext(java.util.function.Function)), [extractLog](BasicDirectives.html#extractLog(java.util.function.Function)), [extractMatchedPath](BasicDirectives.html#extractMatchedPath(java.util.function.Function)), [extractMaterializer](BasicDirectives.html#extractMaterializer(java.util.function.Function)), [extractParserSettings](BasicDirectives.html#extractParserSettings(java.util.function.Function)), [extractRequest](BasicDirectives.html#extractRequest(java.util.function.Function)), [extractRequestContext](BasicDirectives.html#extractRequestContext(java.util.function.Function)), [extractRequestEntity](BasicDirectives.html#extractRequestEntity(java.util.function.Function)), [extractSettings](BasicDirectives.html#extractSettings(java.util.function.Function)), [extractStrictEntity](BasicDirectives.html#extractStrictEntity(scala.concurrent.duration.FiniteDuration,long,java.util.function.Function)), [extractStrictEntity](BasicDirectives.html#extractStrictEntity(scala.concurrent.duration.FiniteDuration,java.util.function.Function)), [extractUnmatchedPath](BasicDirectives.html#extractUnmatchedPath(java.util.function.Function)), [extractUri](BasicDirectives.html#extractUri(java.util.function.Function)), [mapInnerRoute](BasicDirectives.html#mapInnerRoute(java.util.function.Function,java.util.function.Supplier)), [mapRejections](BasicDirectives.html#mapRejections(java.util.function.Function,java.util.function.Supplier)), [mapRequest](BasicDirectives.html#mapRequest(java.util.function.Function,java.util.function.Supplier)), [mapRequestContext](BasicDirectives.html#mapRequestContext(java.util.function.Function,java.util.function.Supplier)), [mapResponse](BasicDirectives.html#mapResponse(java.util.function.Function,java.util.function.Supplier)), [mapResponseEntity](BasicDirectives.html#mapResponseEntity(java.util.function.Function,java.util.function.Supplier)), [mapResponseHeaders](BasicDirectives.html#mapResponseHeaders(java.util.function.Function,java.util.function.Supplier)), [mapRouteResult](BasicDirectives.html#mapRouteResult(java.util.function.Function,java.util.function.Supplier)), [mapRouteResultFuture](BasicDirectives.html#mapRouteResultFuture(java.util.function.Function,java.util.function.Supplier)), [mapRouteResultPF](BasicDirectives.html#mapRouteResultPF(scala.PartialFunction,java.util.function.Supplier)), [mapRouteResultWith](BasicDirectives.html#mapRouteResultWith(java.util.function.Function,java.util.function.Supplier)), [mapRouteResultWithPF](BasicDirectives.html#mapRouteResultWithPF(scala.PartialFunction,java.util.function.Supplier)), [mapSettings](BasicDirectives.html#mapSettings(java.util.function.Function,java.util.function.Supplier)), [mapUnmatchedPath](BasicDirectives.html#mapUnmatchedPath(java.util.function.Function,java.util.function.Supplier)), [pass](BasicDirectives.html#pass(java.util.function.Supplier)), [provide](BasicDirectives.html#provide(T,java.util.function.Function)), [recoverRejections](BasicDirectives.html#recoverRejections(java.util.function.Function,java.util.function.Supplier)), [recoverRejectionsWith](BasicDirectives.html#recoverRejectionsWith(java.util.function.Function,java.util.function.Supplier)), [toStrictEntity](BasicDirectives.html#toStrictEntity(scala.concurrent.duration.FiniteDuration,long,java.util.function.Supplier)), [toStrictEntity](BasicDirectives.html#toStrictEntity(scala.concurrent.duration.FiniteDuration,java.util.function.Supplier)), [withExecutionContext](BasicDirectives.html#withExecutionContext(scala.concurrent.ExecutionContextExecutor,java.util.function.Supplier)), [withLog](BasicDirectives.html#withLog(akka.event.LoggingAdapter,java.util.function.Supplier)), [withMaterializer](BasicDirectives.html#withMaterializer(akka.stream.Materializer,java.util.function.Supplier)), [withSettings](BasicDirectives.html#withSettings(akka.http.javadsl.settings.RoutingSettings,java.util.function.Supplier))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### DebuggingDirectives
		
		
		
		```
		public DebuggingDirectives()
		```

	- ### Method Detail
	
	
	
		- #### logRequest
		
		
		
		```
		public [Route](../Route.html "interface in akka.http.javadsl.server") logRequest​(java.lang.String marker,
		                        java.util.function.Supplier<[Route](../Route.html "interface in akka.http.javadsl.server")> inner)
		```
		
		Produces a log entry for every incoming request.
		
		Parameters:
		`marker` \- (undocumented)
		`inner` \- (undocumented)
		Returns:
		(undocumented)
		- #### logRequest
		
		
		
		```
		public [Route](../Route.html "interface in akka.http.javadsl.server") logRequest​(java.lang.String marker,
		                        akka.event.Logging.LogLevel level,
		                        java.util.function.Supplier<[Route](../Route.html "interface in akka.http.javadsl.server")> inner)
		```
		
		Produces a log entry for every incoming request.
		 
		
		Parameters:
		`level` \- One of the log levels defined in akka.event.Logging
		`marker` \- (undocumented)
		`inner` \- (undocumented)
		Returns:
		(undocumented)
		- #### logRequest
		
		
		
		```
		public [Route](../Route.html "interface in akka.http.javadsl.server") logRequest​(java.util.function.Function<[HttpRequest](../../model/HttpRequest.html "class in akka.http.javadsl.model"),​[LogEntry](LogEntry.html "class in akka.http.javadsl.server.directives")> show,
		                        java.util.function.Supplier<[Route](../Route.html "interface in akka.http.javadsl.server")> inner)
		```
		
		Produces a log entry for every incoming request.
		
		Parameters:
		`show` \- (undocumented)
		`inner` \- (undocumented)
		Returns:
		(undocumented)
		- #### logRequestResult
		
		
		
		```
		public [RouteAdapter](RouteAdapter.html "class in akka.http.javadsl.server.directives") logRequestResult​(java.util.function.BiFunction<[HttpRequest](../../model/HttpRequest.html "class in akka.http.javadsl.model"),​[HttpResponse](../../model/HttpResponse.html "class in akka.http.javadsl.model"),​[LogEntry](LogEntry.html "class in akka.http.javadsl.server.directives")> showSuccess,
		                                     java.util.function.BiFunction<[HttpRequest](../../model/HttpRequest.html "class in akka.http.javadsl.model"),​java.util.List<[Rejection](../Rejection.html "interface in akka.http.javadsl.server")>,​[LogEntry](LogEntry.html "class in akka.http.javadsl.server.directives")> showRejection,
		                                     java.util.function.Supplier<[Route](../Route.html "interface in akka.http.javadsl.server")> inner)
		```
		
		Produces a log entry for every request/response combination.
		 
		
		Parameters:
		`showSuccess` \- Function invoked when the route result was successful and yielded an HTTP response
		`showRejection` \- Function invoked when the route yielded a rejection
		`inner` \- (undocumented)
		Returns:
		(undocumented)
		- #### logRequestResultOptional
		
		
		
		```
		public [RouteAdapter](RouteAdapter.html "class in akka.http.javadsl.server.directives") logRequestResultOptional​(java.util.function.BiFunction<[HttpRequest](../../model/HttpRequest.html "class in akka.http.javadsl.model"),​[HttpResponse](../../model/HttpResponse.html "class in akka.http.javadsl.model"),​java.util.Optional<[LogEntry](LogEntry.html "class in akka.http.javadsl.server.directives")>> showSuccess,
		                                             java.util.function.BiFunction<[HttpRequest](../../model/HttpRequest.html "class in akka.http.javadsl.model"),​java.util.List<[Rejection](../Rejection.html "interface in akka.http.javadsl.server")>,​java.util.Optional<[LogEntry](LogEntry.html "class in akka.http.javadsl.server.directives")>> showRejection,
		                                             java.util.function.Supplier<[Route](../Route.html "interface in akka.http.javadsl.server")> inner)
		```
		
		Optionally produces a log entry for every request/response combination.
		 
		
		Parameters:
		`showSuccess` \- Function invoked when the route result was successful and yielded an HTTP response
		`showRejection` \- Function invoked when the route yielded a rejection
		`inner` \- (undocumented)
		Returns:
		(undocumented)
		- #### logResult
		
		
		
		```
		public [Route](../Route.html "interface in akka.http.javadsl.server") logResult​(java.lang.String marker,
		                       java.util.function.Supplier<[Route](../Route.html "interface in akka.http.javadsl.server")> inner)
		```
		
		Produces a log entry for every route result.
		
		Parameters:
		`marker` \- (undocumented)
		`inner` \- (undocumented)
		Returns:
		(undocumented)
		- #### logResult
		
		
		
		```
		public [Route](../Route.html "interface in akka.http.javadsl.server") logResult​(java.lang.String marker,
		                       akka.event.Logging.LogLevel level,
		                       java.util.function.Supplier<[Route](../Route.html "interface in akka.http.javadsl.server")> inner)
		```
		
		Produces a log entry for every route result.
		 
		
		Parameters:
		`level` \- One of the log levels defined in akka.event.Logging
		`marker` \- (undocumented)
		`inner` \- (undocumented)
		Returns:
		(undocumented)
		- #### logResult
		
		
		
		```
		public [RouteAdapter](RouteAdapter.html "class in akka.http.javadsl.server.directives") logResult​(java.util.function.Function<[HttpResponse](../../model/HttpResponse.html "class in akka.http.javadsl.model"),​[LogEntry](LogEntry.html "class in akka.http.javadsl.server.directives")> showSuccess,
		                              java.util.function.Function<java.util.List<[Rejection](../Rejection.html "interface in akka.http.javadsl.server")>,​[LogEntry](LogEntry.html "class in akka.http.javadsl.server.directives")> showRejection,
		                              java.util.function.Supplier<[Route](../Route.html "interface in akka.http.javadsl.server")> inner)
		```
		
		Produces a log entry for every route result.
		 
		
		Parameters:
		`showSuccess` \- Function invoked when the route result was successful and yielded an HTTP response
		`showRejection` \- Function invoked when the route yielded a rejection
		`inner` \- (undocumented)
		Returns:
		(undocumented)

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/HttpRequest.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/HttpResponse.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/Rejection.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/Route.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/directives/BasicDirectives.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/directives/CacheConditionDirectives.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/directives/CodingDirectives.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/directives/CookieDirectives.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/directives/ExecutionDirectives.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/directives/LogEntry.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/directives/RouteAdapter.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/directives/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/directives/DebuggingDirectives.html](https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/directives/DebuggingDirectives.html)*