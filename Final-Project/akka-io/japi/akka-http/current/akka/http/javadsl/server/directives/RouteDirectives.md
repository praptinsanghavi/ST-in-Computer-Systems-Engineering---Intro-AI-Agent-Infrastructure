---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:49:14Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/directives/RouteDirectives.html
title: RouteDirectives
---

# RouteDirectives

## Content

Package [akka.http.javadsl.server.directives](package-summary.html)
## Class RouteDirectives

- java.lang.Object
- - [akka.http.javadsl.server.directives.BasicDirectives](BasicDirectives.html "class in akka.http.javadsl.server.directives")
	- - [akka.http.javadsl.server.directives.CacheConditionDirectives](CacheConditionDirectives.html "class in akka.http.javadsl.server.directives")
		- - [akka.http.javadsl.server.directives.CodingDirectives](CodingDirectives.html "class in akka.http.javadsl.server.directives")
			- - [akka.http.javadsl.server.directives.CookieDirectives](CookieDirectives.html "class in akka.http.javadsl.server.directives")
				- - [akka.http.javadsl.server.directives.DebuggingDirectives](DebuggingDirectives.html "class in akka.http.javadsl.server.directives")
					- - [akka.http.javadsl.server.directives.ExecutionDirectives](ExecutionDirectives.html "class in akka.http.javadsl.server.directives")
						- - [akka.http.javadsl.server.directives.FileAndResourceDirectives](FileAndResourceDirectives.html "class in akka.http.javadsl.server.directives")
							- - [akka.http.javadsl.server.directives.FileUploadDirectives](FileUploadDirectives.html "class in akka.http.javadsl.server.directives")
								- - [akka.http.javadsl.server.directives.FormFieldDirectives](FormFieldDirectives.html "class in akka.http.javadsl.server.directives")
									- - [akka.http.javadsl.server.directives.FutureDirectives](FutureDirectives.html "class in akka.http.javadsl.server.directives")
										- - [akka.http.javadsl.server.directives.HeaderDirectives](HeaderDirectives.html "class in akka.http.javadsl.server.directives")
											- - [akka.http.javadsl.server.directives.AttributeDirectives](AttributeDirectives.html "class in akka.http.javadsl.server.directives")
												- - [akka.http.javadsl.server.directives.HostDirectives](HostDirectives.html "class in akka.http.javadsl.server.directives")
													- - [akka.http.javadsl.server.directives.MarshallingDirectives](MarshallingDirectives.html "class in akka.http.javadsl.server.directives")
														- - [akka.http.javadsl.server.directives.MethodDirectives](MethodDirectives.html "class in akka.http.javadsl.server.directives")
															- - [akka.http.javadsl.server.directives.MiscDirectives](MiscDirectives.html "class in akka.http.javadsl.server.directives")
																- - [akka.http.javadsl.server.directives.ParameterDirectives](ParameterDirectives.html "class in akka.http.javadsl.server.directives")
																	- - [akka.http.javadsl.server.directives.PathDirectives](PathDirectives.html "class in akka.http.javadsl.server.directives")
																		- - [akka.http.javadsl.server.directives.RangeDirectives](RangeDirectives.html "class in akka.http.javadsl.server.directives")
																			- - [akka.http.javadsl.server.directives.RespondWithDirectives](RespondWithDirectives.html "class in akka.http.javadsl.server.directives")
																				- - akka.http.javadsl.server.directives.RouteDirectives

- Direct Known Subclasses:
`[SchemeDirectives](SchemeDirectives.html "class in akka.http.javadsl.server.directives")`

---

```
public abstract class RouteDirectives
extends [RespondWithDirectives](RespondWithDirectives.html "class in akka.http.javadsl.server.directives")
```

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[RouteDirectives](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) [Deprecated Methods](javascript:show(32);) 
	| Modifier and Type | Method | Description |
	| `[Route](../Route.html "interface in akka.http.javadsl.server")` | `[complete](#complete(akka.http.javadsl.model.HttpResponse))​([HttpResponse](../../model/HttpResponse.html "class in akka.http.javadsl.model") response)` | Completes the request using the given http response. |
	| `[RouteAdapter](RouteAdapter.html "class in akka.http.javadsl.server.directives")` | `[complete](#complete(akka.http.javadsl.model.RequestEntity))​([RequestEntity](../../model/RequestEntity.html "interface in akka.http.javadsl.model") entity)` | Completes the request as HTTP 200 OK with the given value as response entity. |
	| `[RouteAdapter](RouteAdapter.html "class in akka.http.javadsl.server.directives")` | `[complete](#complete(akka.http.javadsl.model.ResponseEntity))​([ResponseEntity](../../model/ResponseEntity.html "interface in akka.http.javadsl.model") entity)` | Completes the request as HTTP 200 OK with the given value as response entity. |
	| `[Route](../Route.html "interface in akka.http.javadsl.server")` | `[complete](#complete(akka.http.javadsl.model.StatusCode))​([StatusCode](../../model/StatusCode.html "class in akka.http.javadsl.model") status)` | Completes the request using the given status code. |
	| `[RouteAdapter](RouteAdapter.html "class in akka.http.javadsl.server.directives")` | `[complete](#complete(akka.http.javadsl.model.StatusCode,akka.http.javadsl.model.RequestEntity))​([StatusCode](../../model/StatusCode.html "class in akka.http.javadsl.model") status,  [RequestEntity](../../model/RequestEntity.html "interface in akka.http.javadsl.model") entity)` | Completes the request using the given status code and response entity. |
	| `[RouteAdapter](RouteAdapter.html "class in akka.http.javadsl.server.directives")` | `[complete](#complete(akka.http.javadsl.model.StatusCode,akka.http.javadsl.model.ResponseEntity))​([StatusCode](../../model/StatusCode.html "class in akka.http.javadsl.model") status,  [ResponseEntity](../../model/ResponseEntity.html "interface in akka.http.javadsl.model") entity)` | Completes the request using the given status code and response entity. |
	| `[RouteAdapter](RouteAdapter.html "class in akka.http.javadsl.server.directives")` | `[complete](#complete(akka.http.javadsl.model.StatusCode,java.lang.Iterable,akka.http.javadsl.model.RequestEntity))​([StatusCode](../../model/StatusCode.html "class in akka.http.javadsl.model") status,  java.lang.Iterable<[HttpHeader](../../model/HttpHeader.html "class in akka.http.javadsl.model")> headers,  [RequestEntity](../../model/RequestEntity.html "interface in akka.http.javadsl.model") entity)` | Completes the request using the given status code, headers, and response entity. |
	| `[RouteAdapter](RouteAdapter.html "class in akka.http.javadsl.server.directives")` | `[complete](#complete(akka.http.javadsl.model.StatusCode,java.lang.Iterable,akka.http.javadsl.model.ResponseEntity))​([StatusCode](../../model/StatusCode.html "class in akka.http.javadsl.model") status,  java.lang.Iterable<[HttpHeader](../../model/HttpHeader.html "class in akka.http.javadsl.model")> headers,  [ResponseEntity](../../model/ResponseEntity.html "interface in akka.http.javadsl.model") entity)` | Completes the request using the given status code, headers, and response entity. |
	| `<T> [RouteAdapter](RouteAdapter.html "class in akka.http.javadsl.server.directives")` | `[complete](#complete(akka.http.javadsl.model.StatusCode,java.lang.Iterable,T,akka.http.javadsl.marshalling.Marshaller))​([StatusCode](../../model/StatusCode.html "class in akka.http.javadsl.model") status,  java.lang.Iterable<[HttpHeader](../../model/HttpHeader.html "class in akka.http.javadsl.model")> headers,  T value,  [Marshaller](../../marshalling/Marshaller.html "class in akka.http.javadsl.marshalling")<T,​[RequestEntity](../../model/RequestEntity.html "interface in akka.http.javadsl.model")> marshaller)` | Completes the request using the given status code and headers, marshalling the given value as response entity. |
	| `[RouteAdapter](RouteAdapter.html "class in akka.http.javadsl.server.directives")` | `[complete](#complete(akka.http.javadsl.model.StatusCode,java.lang.String))​([StatusCode](../../model/StatusCode.html "class in akka.http.javadsl.model") status,  java.lang.String entity)` | Completes the request using the given status code and the given body as UTF\-8\. |
	| `<T> [RouteAdapter](RouteAdapter.html "class in akka.http.javadsl.server.directives")` | `[complete](#complete(akka.http.javadsl.model.StatusCode,T,akka.http.javadsl.marshalling.Marshaller))​([StatusCode](../../model/StatusCode.html "class in akka.http.javadsl.model") status,  T value,  [Marshaller](../../marshalling/Marshaller.html "class in akka.http.javadsl.marshalling")<T,​[RequestEntity](../../model/RequestEntity.html "interface in akka.http.javadsl.model")> marshaller)` | Completes the request using the given status code, marshalling the given value as response entity. |
	| `[RouteAdapter](RouteAdapter.html "class in akka.http.javadsl.server.directives")` | `[complete](#complete(java.lang.Iterable,akka.http.javadsl.model.RequestEntity))​(java.lang.Iterable<[HttpHeader](../../model/HttpHeader.html "class in akka.http.javadsl.model")> headers,  [RequestEntity](../../model/RequestEntity.html "interface in akka.http.javadsl.model") entity)` | Completes the request as HTTP 200 OK, adding the given headers and response entity. |
	| `[RouteAdapter](RouteAdapter.html "class in akka.http.javadsl.server.directives")` | `[complete](#complete(java.lang.Iterable,akka.http.javadsl.model.ResponseEntity))​(java.lang.Iterable<[HttpHeader](../../model/HttpHeader.html "class in akka.http.javadsl.model")> headers,  [ResponseEntity](../../model/ResponseEntity.html "interface in akka.http.javadsl.model") entity)` | Completes the request as HTTP 200 OK, adding the given headers and response entity. |
	| `<T> [RouteAdapter](RouteAdapter.html "class in akka.http.javadsl.server.directives")` | `[complete](#complete(java.lang.Iterable,T,akka.http.javadsl.marshalling.Marshaller))​(java.lang.Iterable<[HttpHeader](../../model/HttpHeader.html "class in akka.http.javadsl.model")> headers,  T value,  [Marshaller](../../marshalling/Marshaller.html "class in akka.http.javadsl.marshalling")<T,​[RequestEntity](../../model/RequestEntity.html "interface in akka.http.javadsl.model")> marshaller)` | Completes the request as HTTP 200 OK, adding the given headers, and marshalling the given value as response entity. |
	| `[Route](../Route.html "interface in akka.http.javadsl.server")` | `[complete](#complete(java.lang.String))​(java.lang.String body)` | Completes the request using an HTTP 200 OK status code and the given body as UTF\-8 entity. |
	| `<T> [RouteAdapter](RouteAdapter.html "class in akka.http.javadsl.server.directives")` | `[complete](#complete(T,akka.http.javadsl.marshalling.Marshaller))​(T value,  [Marshaller](../../marshalling/Marshaller.html "class in akka.http.javadsl.marshalling")<T,​[HttpResponse](../../model/HttpResponse.html "class in akka.http.javadsl.model")> marshaller)` | Completes the request by marshalling the given value into an http response. |
	| `<T> [RouteAdapter](RouteAdapter.html "class in akka.http.javadsl.server.directives")` | `[completeOK](#completeOK(T,akka.http.javadsl.marshalling.Marshaller))​(T value,  [Marshaller](../../marshalling/Marshaller.html "class in akka.http.javadsl.marshalling")<T,​[RequestEntity](../../model/RequestEntity.html "interface in akka.http.javadsl.model")> marshaller)` | Completes the request as HTTP 200 OK, marshalling the given value as response entity. |
	| `[RouteAdapter](RouteAdapter.html "class in akka.http.javadsl.server.directives")` | `[completeOKWithFuture](#completeOKWithFuture(java.util.concurrent.CompletionStage))​(java.util.concurrent.CompletionStage<[RequestEntity](../../model/RequestEntity.html "interface in akka.http.javadsl.model")> value)` | Completes the request by marshalling the given future value into an http response. |
	| `<T> [RouteAdapter](RouteAdapter.html "class in akka.http.javadsl.server.directives")` | `[completeOKWithFuture](#completeOKWithFuture(java.util.concurrent.CompletionStage,akka.http.javadsl.marshalling.Marshaller))​(java.util.concurrent.CompletionStage<T> value,  [Marshaller](../../marshalling/Marshaller.html "class in akka.http.javadsl.marshalling")<T,​[RequestEntity](../../model/RequestEntity.html "interface in akka.http.javadsl.model")> marshaller)` | Completes the request with an `OK` status code by marshalling the given value into an http response. |
	| `<T> [RouteAdapter](RouteAdapter.html "class in akka.http.javadsl.server.directives")` | `[completeOKWithFuture](#completeOKWithFuture(scala.concurrent.Future,akka.http.javadsl.marshalling.Marshaller))​(scala.concurrent.Future<T> value,  [Marshaller](../../marshalling/Marshaller.html "class in akka.http.javadsl.marshalling")<T,​[RequestEntity](../../model/RequestEntity.html "interface in akka.http.javadsl.model")> marshaller)` | Completes the request by marshalling the given value into an http response. |
	| `[RouteAdapter](RouteAdapter.html "class in akka.http.javadsl.server.directives")` | `[completeOKWithFutureString](#completeOKWithFutureString(java.util.concurrent.CompletionStage))​(java.util.concurrent.CompletionStage<java.lang.String> value)` | Completes the request by marshalling the given future value into an http response. |
	| `[RouteAdapter](RouteAdapter.html "class in akka.http.javadsl.server.directives")` | `[completeOKWithFutureString](#completeOKWithFutureString(scala.concurrent.Future))​(scala.concurrent.Future<java.lang.String> value)` | Completes the request by marshalling the given future value into an http response. |
	| `[RouteAdapter](RouteAdapter.html "class in akka.http.javadsl.server.directives")` | `[completeWithFuture](#completeWithFuture(java.util.concurrent.CompletionStage))​(java.util.concurrent.CompletionStage<[HttpResponse](../../model/HttpResponse.html "class in akka.http.javadsl.model")> value)` | Completes the request by marshalling the given future value into an http response. |
	| `<T> [RouteAdapter](RouteAdapter.html "class in akka.http.javadsl.server.directives")` | `[completeWithFuture](#completeWithFuture(java.util.concurrent.CompletionStage,akka.http.javadsl.marshalling.Marshaller))​(java.util.concurrent.CompletionStage<T> value,  [Marshaller](../../marshalling/Marshaller.html "class in akka.http.javadsl.marshalling")<T,​[HttpResponse](../../model/HttpResponse.html "class in akka.http.javadsl.model")> marshaller)` | Completes the request by marshalling the given value into an http response. |
	| `<T> [RouteAdapter](RouteAdapter.html "class in akka.http.javadsl.server.directives")` | `[completeWithFuture](#completeWithFuture(scala.concurrent.Future,akka.http.javadsl.marshalling.Marshaller))​(scala.concurrent.Future<T> value,  [Marshaller](../../marshalling/Marshaller.html "class in akka.http.javadsl.marshalling")<T,​[HttpResponse](../../model/HttpResponse.html "class in akka.http.javadsl.model")> marshaller)` | Completes the request by marshalling the given value into an http response. |
	| `[RouteAdapter](RouteAdapter.html "class in akka.http.javadsl.server.directives")` | `[completeWithFutureResponse](#completeWithFutureResponse(scala.concurrent.Future))​(scala.concurrent.Future<[HttpResponse](../../model/HttpResponse.html "class in akka.http.javadsl.model")> value)` | Completes the request by marshalling the given future value into an http response. |
	| `[Route](../Route.html "interface in akka.http.javadsl.server")` | `[completeWithFutureStatus](#completeWithFutureStatus(java.util.concurrent.CompletionStage))​(java.util.concurrent.CompletionStage<[StatusCode](../../model/StatusCode.html "class in akka.http.javadsl.model")> status)` | Completes the request using the given future status code. |
	| `[Route](../Route.html "interface in akka.http.javadsl.server")` | `[completeWithFutureStatus](#completeWithFutureStatus(scala.concurrent.Future))​(scala.concurrent.Future<[StatusCode](../../model/StatusCode.html "class in akka.http.javadsl.model")> status)` | Completes the request using the given future status code. |
	| `[Route](../Route.html "interface in akka.http.javadsl.server")` | `[concat](#concat(akka.http.javadsl.server.Route,akka.http.javadsl.server.Route...))​([Route](../Route.html "interface in akka.http.javadsl.server") first,  [Route](../Route.html "interface in akka.http.javadsl.server")... alternatives)` | Used to chain multiple alternate routes using comma,  rather than having to explicitly call route1\.orElse(route2\).orElse(route3\). |
	| `[Route](../Route.html "interface in akka.http.javadsl.server")` | `[concat](#concat(akka.http.javadsl.server.Route,scala.collection.immutable.Seq))​([Route](../Route.html "interface in akka.http.javadsl.server") first,  scala.collection.immutable.Seq<[Route](../Route.html "interface in akka.http.javadsl.server")> alternatives)` | Used to chain multiple alternate routes using comma,  rather than having to explicitly call route1\.orElse(route2\).orElse(route3\). |
	| `[Route](../Route.html "interface in akka.http.javadsl.server")` | `[failWith](#failWith(java.lang.Throwable))​(java.lang.Throwable error)` | Bubbles the given error up the response chain, where it is dealt with by the closest `handleExceptions`  directive and its ExceptionHandler. |
	| `[Route](../Route.html "interface in akka.http.javadsl.server")` | `[handle](#handle(akka.japi.function.Function))​(akka.japi.function.Function<[HttpRequest](../../model/HttpRequest.html "class in akka.http.javadsl.model"),​java.util.concurrent.CompletionStage<[HttpResponse](../../model/HttpResponse.html "class in akka.http.javadsl.model")>> handler)` | Handle the request using a function. |
	| `[Route](../Route.html "interface in akka.http.javadsl.server")` | `[handleSync](#handleSync(akka.japi.function.Function))​(akka.japi.function.Function<[HttpRequest](../../model/HttpRequest.html "class in akka.http.javadsl.model"),​[HttpResponse](../../model/HttpResponse.html "class in akka.http.javadsl.model")> handler)` | Handle the request using a function. |
	| `[Route](../Route.html "interface in akka.http.javadsl.server")` | `[redirect](#redirect(akka.http.javadsl.model.Uri,akka.http.javadsl.model.StatusCode))​([Uri](../../model/Uri.html "class in akka.http.javadsl.model") uri,  [StatusCode](../../model/StatusCode.html "class in akka.http.javadsl.model") redirectionType)` | Completes the request with redirection response of the given type to the given URI. |
	| `[Route](../Route.html "interface in akka.http.javadsl.server")` | `[reject](#reject())()` | Rejects the request with an empty rejection (usually used for "no directive matched"). |
	| `[Route](../Route.html "interface in akka.http.javadsl.server")` | `[reject](#reject(akka.http.javadsl.server.Rejection,akka.http.javadsl.server.Rejection...))​([Rejection](../Rejection.html "interface in akka.http.javadsl.server") rejection,  [Rejection](../Rejection.html "interface in akka.http.javadsl.server")... rejections)` | Rejects the request with the given rejections, or with an empty set of rejections if no rejections are given. |
	| `[Route](../Route.html "interface in akka.http.javadsl.server")` | `[reject](#reject(akka.http.javadsl.server.Rejection,scala.collection.immutable.Seq))​([Rejection](../Rejection.html "interface in akka.http.javadsl.server") rejection,  scala.collection.immutable.Seq<[Rejection](../Rejection.html "interface in akka.http.javadsl.server")> rejections)` | Rejects the request with the given rejections, or with an empty set of rejections if no rejections are given. |
	| `[Route](../Route.html "interface in akka.http.javadsl.server")` | `[route](#route(akka.http.javadsl.server.Route...))​([Route](../Route.html "interface in akka.http.javadsl.server")... alternatives)` | Deprecated. Use the `RouteDirectives.concat` method instead. |
	| `[Route](../Route.html "interface in akka.http.javadsl.server")` | `[route](#route(scala.collection.immutable.Seq))​(scala.collection.immutable.Seq<[Route](../Route.html "interface in akka.http.javadsl.server")> alternatives)` | Deprecated. Use the `RouteDirectives.concat` method instead. |
	
	
		- ### Methods inherited from class akka.http.javadsl.server.directives.[RespondWithDirectives](RespondWithDirectives.html "class in akka.http.javadsl.server.directives")
		
		
		`[respondWithDefaultHeader](RespondWithDirectives.html#respondWithDefaultHeader(akka.http.javadsl.model.HttpHeader,java.util.function.Supplier)), [respondWithDefaultHeaders](RespondWithDirectives.html#respondWithDefaultHeaders(java.lang.Iterable,java.util.function.Supplier)), [respondWithHeader](RespondWithDirectives.html#respondWithHeader(akka.http.javadsl.model.HttpHeader,java.util.function.Supplier)), [respondWithHeaders](RespondWithDirectives.html#respondWithHeaders(java.lang.Iterable,java.util.function.Supplier))`
		- ### Methods inherited from class akka.http.javadsl.server.directives.[RangeDirectives](RangeDirectives.html "class in akka.http.javadsl.server.directives")
		
		
		`[withRangeSupport](RangeDirectives.html#withRangeSupport(java.util.function.Supplier))`
		- ### Methods inherited from class akka.http.javadsl.server.directives.[PathDirectives](PathDirectives.html "class in akka.http.javadsl.server.directives")
		
		
		`[ignoreTrailingSlash](PathDirectives.html#ignoreTrailingSlash(java.util.function.Supplier)), [path](PathDirectives.html#path(akka.http.javadsl.server.PathMatcher0,java.util.function.Supplier)), [path](PathDirectives.html#path(akka.http.javadsl.server.PathMatcher1,java.util.function.Function)), [path](PathDirectives.html#path(akka.http.javadsl.server.PathMatcher2,java.util.function.BiFunction)), [path](PathDirectives.html#path(akka.http.javadsl.unmarshalling.Unmarshaller,java.util.function.Function)), [path](PathDirectives.html#path(java.lang.String,java.util.function.Supplier)), [path](PathDirectives.html#path(java.util.function.Function)), [pathEnd](PathDirectives.html#pathEnd(java.util.function.Supplier)), [pathEndOrSingleSlash](PathDirectives.html#pathEndOrSingleSlash(java.util.function.Supplier)), [pathPrefix](PathDirectives.html#pathPrefix(akka.http.javadsl.server.PathMatcher0,java.util.function.Supplier)), [pathPrefix](PathDirectives.html#pathPrefix(akka.http.javadsl.server.PathMatcher1,java.util.function.Function)), [pathPrefix](PathDirectives.html#pathPrefix(akka.http.javadsl.server.PathMatcher2,java.util.function.BiFunction)), [pathPrefix](PathDirectives.html#pathPrefix(akka.http.javadsl.unmarshalling.Unmarshaller,java.util.function.Function)), [pathPrefix](PathDirectives.html#pathPrefix(java.lang.String,java.util.function.Supplier)), [pathPrefix](PathDirectives.html#pathPrefix(java.util.function.Function)), [pathPrefixTest](PathDirectives.html#pathPrefixTest(akka.http.javadsl.server.PathMatcher0,java.util.function.Supplier)), [pathPrefixTest](PathDirectives.html#pathPrefixTest(akka.http.javadsl.server.PathMatcher1,java.util.function.Function)), [pathPrefixTest](PathDirectives.html#pathPrefixTest(akka.http.javadsl.server.PathMatcher2,java.util.function.BiFunction)), [pathPrefixTest](PathDirectives.html#pathPrefixTest(java.lang.String,java.util.function.Supplier)), [pathSingleSlash](PathDirectives.html#pathSingleSlash(java.util.function.Supplier)), [pathSuffix](PathDirectives.html#pathSuffix(akka.http.javadsl.server.PathMatcher0,java.util.function.Supplier)), [pathSuffix](PathDirectives.html#pathSuffix(akka.http.javadsl.server.PathMatcher1,java.util.function.Function)), [pathSuffix](PathDirectives.html#pathSuffix(akka.http.javadsl.server.PathMatcher2,java.util.function.BiFunction)), [pathSuffix](PathDirectives.html#pathSuffix(java.lang.String,java.util.function.Supplier)), [pathSuffixTest](PathDirectives.html#pathSuffixTest(akka.http.javadsl.server.PathMatcher0,java.util.function.Supplier)), [pathSuffixTest](PathDirectives.html#pathSuffixTest(akka.http.javadsl.server.PathMatcher1,java.util.function.Function)), [pathSuffixTest](PathDirectives.html#pathSuffixTest(akka.http.javadsl.server.PathMatcher2,java.util.function.BiFunction)), [pathSuffixTest](PathDirectives.html#pathSuffixTest(java.lang.String,java.util.function.Supplier)), [rawPathPrefix](PathDirectives.html#rawPathPrefix(akka.http.javadsl.server.PathMatcher0,java.util.function.Supplier)), [rawPathPrefix](PathDirectives.html#rawPathPrefix(akka.http.javadsl.server.PathMatcher1,java.util.function.Function)), [rawPathPrefix](PathDirectives.html#rawPathPrefix(akka.http.javadsl.server.PathMatcher2,java.util.function.BiFunction)), [rawPathPrefix](PathDirectives.html#rawPathPrefix(java.lang.String,java.util.function.Supplier)), [rawPathPrefixTest](PathDirectives.html#rawPathPrefixTest(akka.http.javadsl.server.PathMatcher0,java.util.function.Supplier)), [rawPathPrefixTest](PathDirectives.html#rawPathPrefixTest(akka.http.javadsl.server.PathMatcher1,java.util.function.Function)), [rawPathPrefixTest](PathDirectives.html#rawPathPrefixTest(akka.http.javadsl.server.PathMatcher2,java.util.function.BiFunction)), [rawPathPrefixTest](PathDirectives.html#rawPathPrefixTest(java.lang.String,java.util.function.Supplier)), [redirectToNoTrailingSlashIfPresent](PathDirectives.html#redirectToNoTrailingSlashIfPresent(akka.http.javadsl.model.StatusCode,java.util.function.Supplier)), [redirectToTrailingSlashIfMissing](PathDirectives.html#redirectToTrailingSlashIfMissing(akka.http.javadsl.model.StatusCode,java.util.function.Supplier))`
		- ### Methods inherited from class akka.http.javadsl.server.directives.[ParameterDirectives](ParameterDirectives.html "class in akka.http.javadsl.server.directives")
		
		
		`[parameter](ParameterDirectives.html#parameter(akka.http.javadsl.unmarshalling.Unmarshaller,java.lang.String,java.util.function.Function)), [parameter](ParameterDirectives.html#parameter(java.lang.String,java.util.function.Function)), [parameterList](ParameterDirectives.html#parameterList(akka.http.javadsl.unmarshalling.Unmarshaller,java.lang.String,java.util.function.Function)), [parameterList](ParameterDirectives.html#parameterList(java.lang.String,java.util.function.Function)), [parameterList](ParameterDirectives.html#parameterList(java.util.function.Function)), [parameterMap](ParameterDirectives.html#parameterMap(java.util.function.Function)), [parameterMultiMap](ParameterDirectives.html#parameterMultiMap(java.util.function.Function)), [parameterOptional](ParameterDirectives.html#parameterOptional(akka.http.javadsl.unmarshalling.Unmarshaller,java.lang.String,java.util.function.Function)), [parameterOptional](ParameterDirectives.html#parameterOptional(java.lang.String,java.util.function.Function)), [parameterOrDefault](ParameterDirectives.html#parameterOrDefault(akka.http.javadsl.unmarshalling.Unmarshaller,T,java.lang.String,java.util.function.Function)), [parameterRequiredValue](ParameterDirectives.html#parameterRequiredValue(akka.http.javadsl.unmarshalling.Unmarshaller,T,java.lang.String,java.util.function.Supplier))`
		- ### Methods inherited from class akka.http.javadsl.server.directives.[MiscDirectives](MiscDirectives.html "class in akka.http.javadsl.server.directives")
		
		
		`[extractClientIP](MiscDirectives.html#extractClientIP(java.util.function.Function)), [rejectEmptyResponse](MiscDirectives.html#rejectEmptyResponse(java.util.function.Supplier)), [requestEntityEmpty](MiscDirectives.html#requestEntityEmpty(java.util.function.Supplier)), [requestEntityPresent](MiscDirectives.html#requestEntityPresent(java.util.function.Supplier)), [selectPreferredLanguage](MiscDirectives.html#selectPreferredLanguage(java.lang.Iterable,java.util.function.Function)), [validate](MiscDirectives.html#validate(java.util.function.BooleanSupplier,java.lang.String,java.util.function.Supplier)), [withoutSizeLimit](MiscDirectives.html#withoutSizeLimit(java.util.function.Supplier)), [withSizeLimit](MiscDirectives.html#withSizeLimit(long,java.util.function.Supplier))`
		- ### Methods inherited from class akka.http.javadsl.server.directives.[MethodDirectives](MethodDirectives.html "class in akka.http.javadsl.server.directives")
		
		
		`[delete](MethodDirectives.html#delete(java.util.function.Supplier)), [extractMethod](MethodDirectives.html#extractMethod(java.util.function.Function)), [get](MethodDirectives.html#get(java.util.function.Supplier)), [head](MethodDirectives.html#head(java.util.function.Supplier)), [method](MethodDirectives.html#method(akka.http.javadsl.model.HttpMethod,java.util.function.Supplier)), [options](MethodDirectives.html#options(java.util.function.Supplier)), [overrideMethodWithParameter](MethodDirectives.html#overrideMethodWithParameter(java.lang.String,java.util.function.Supplier)), [patch](MethodDirectives.html#patch(java.util.function.Supplier)), [post](MethodDirectives.html#post(java.util.function.Supplier)), [put](MethodDirectives.html#put(java.util.function.Supplier))`
		- ### Methods inherited from class akka.http.javadsl.server.directives.[MarshallingDirectives](MarshallingDirectives.html "class in akka.http.javadsl.server.directives")
		
		
		`[completeWith](MarshallingDirectives.html#completeWith(akka.http.javadsl.marshalling.Marshaller,java.util.function.Consumer)), [entity](MarshallingDirectives.html#entity(akka.http.javadsl.unmarshalling.Unmarshaller,java.util.function.Function)), [handleWith](MarshallingDirectives.html#handleWith(akka.http.javadsl.unmarshalling.Unmarshaller,akka.http.javadsl.marshalling.Marshaller,java.util.function.Function)), [request](MarshallingDirectives.html#request(akka.http.javadsl.unmarshalling.Unmarshaller,java.util.function.Function))`
		- ### Methods inherited from class akka.http.javadsl.server.directives.[HostDirectives](HostDirectives.html "class in akka.http.javadsl.server.directives")
		
		
		`[extractHost](HostDirectives.html#extractHost(java.util.function.Function)), [host](HostDirectives.html#host(java.lang.Iterable,java.util.function.Supplier)), [host](HostDirectives.html#host(java.lang.String,java.util.function.Supplier)), [host](HostDirectives.html#host(java.util.function.Predicate,java.util.function.Supplier)), [host](HostDirectives.html#host(java.util.regex.Pattern,java.util.function.Function))`
		- ### Methods inherited from class akka.http.javadsl.server.directives.[AttributeDirectives](AttributeDirectives.html "class in akka.http.javadsl.server.directives")
		
		
		`[attribute](AttributeDirectives.html#attribute(akka.http.javadsl.model.AttributeKey,java.util.function.Function)), [optionalAttribute](AttributeDirectives.html#optionalAttribute(akka.http.javadsl.model.AttributeKey,java.util.function.Function))`
		- ### Methods inherited from class akka.http.javadsl.server.directives.[HeaderDirectives](HeaderDirectives.html "class in akka.http.javadsl.server.directives")
		
		
		`[checkSameOrigin](HeaderDirectives.html#checkSameOrigin(akka.http.javadsl.model.headers.HttpOriginRange,java.util.function.Supplier)), [headerValue](HeaderDirectives.html#headerValue(java.util.function.Function,java.util.function.Function)), [headerValueByName](HeaderDirectives.html#headerValueByName(java.lang.String,java.util.function.Function)), [headerValueByType](HeaderDirectives.html#headerValueByType(java.lang.Class,java.util.function.Function)), [headerValuePF](HeaderDirectives.html#headerValuePF(scala.PartialFunction,java.util.function.Function)), [optionalHeaderValue](HeaderDirectives.html#optionalHeaderValue(java.util.function.Function,java.util.function.Function)), [optionalHeaderValueByName](HeaderDirectives.html#optionalHeaderValueByName(java.lang.String,java.util.function.Function)), [optionalHeaderValueByType](HeaderDirectives.html#optionalHeaderValueByType(java.lang.Class,java.util.function.Function)), [optionalHeaderValuePF](HeaderDirectives.html#optionalHeaderValuePF(scala.PartialFunction,java.util.function.Function))`
		- ### Methods inherited from class akka.http.javadsl.server.directives.[FutureDirectives](FutureDirectives.html "class in akka.http.javadsl.server.directives")
		
		
		`[completeOrRecoverWith](FutureDirectives.html#completeOrRecoverWith(java.util.function.Supplier,akka.http.javadsl.marshalling.Marshaller,java.util.function.Function)), [onComplete](FutureDirectives.html#onComplete(java.util.concurrent.CompletionStage,java.util.function.Function)), [onComplete](FutureDirectives.html#onComplete(java.util.function.Supplier,java.util.function.Function)), [onCompleteWithBreaker](FutureDirectives.html#onCompleteWithBreaker(akka.pattern.CircuitBreaker,java.util.function.Supplier,java.util.function.Function)), [onSuccess](FutureDirectives.html#onSuccess(java.util.concurrent.CompletionStage,java.util.function.Function)), [onSuccess](FutureDirectives.html#onSuccess(java.util.function.Supplier,java.util.function.Function))`
		- ### Methods inherited from class akka.http.javadsl.server.directives.[FormFieldDirectives](FormFieldDirectives.html "class in akka.http.javadsl.server.directives")
		
		
		`[formField](FormFieldDirectives.html#formField(akka.http.javadsl.unmarshalling.Unmarshaller,java.lang.String,java.util.function.Function)), [formField](FormFieldDirectives.html#formField(java.lang.String,java.util.function.Function)), [formFieldList](FormFieldDirectives.html#formFieldList(akka.http.javadsl.unmarshalling.Unmarshaller,java.lang.String,java.util.function.Function)), [formFieldList](FormFieldDirectives.html#formFieldList(java.lang.String,java.util.function.Function)), [formFieldList](FormFieldDirectives.html#formFieldList(java.util.function.Function)), [formFieldMap](FormFieldDirectives.html#formFieldMap(java.util.function.Function)), [formFieldMultiMap](FormFieldDirectives.html#formFieldMultiMap(java.util.function.Function)), [formFieldOptional](FormFieldDirectives.html#formFieldOptional(akka.http.javadsl.unmarshalling.Unmarshaller,java.lang.String,java.util.function.Function)), [formFieldOptional](FormFieldDirectives.html#formFieldOptional(java.lang.String,java.util.function.Function))`
		- ### Methods inherited from class akka.http.javadsl.server.directives.[FileUploadDirectives](FileUploadDirectives.html "class in akka.http.javadsl.server.directives")
		
		
		`[fileUpload](FileUploadDirectives.html#fileUpload(java.lang.String,java.util.function.BiFunction)), [fileUploadAll](FileUploadDirectives.html#fileUploadAll(java.lang.String,java.util.function.Function)), [storeUploadedFile](FileUploadDirectives.html#storeUploadedFile(java.lang.String,java.util.function.Function,java.util.function.BiFunction)), [storeUploadedFiles](FileUploadDirectives.html#storeUploadedFiles(java.lang.String,java.util.function.Function,java.util.function.Function))`
		- ### Methods inherited from class akka.http.javadsl.server.directives.[FileAndResourceDirectives](FileAndResourceDirectives.html "class in akka.http.javadsl.server.directives")
		
		
		`[defaultContentTypeResolver](FileAndResourceDirectives.html#defaultContentTypeResolver()), [defaultDirectoryRenderer](FileAndResourceDirectives.html#defaultDirectoryRenderer()), [getFromBrowseableDirectories](FileAndResourceDirectives.html#getFromBrowseableDirectories(java.lang.Iterable,akka.http.javadsl.server.directives.ContentTypeResolver)), [getFromBrowseableDirectories](FileAndResourceDirectives.html#getFromBrowseableDirectories(java.lang.Iterable,akka.http.javadsl.server.directives.DirectoryRenderer)), [getFromBrowseableDirectories](FileAndResourceDirectives.html#getFromBrowseableDirectories(java.lang.Iterable,akka.http.javadsl.server.directives.DirectoryRenderer,akka.http.javadsl.server.directives.ContentTypeResolver)), [getFromBrowseableDirectories](FileAndResourceDirectives.html#getFromBrowseableDirectories(java.lang.String...)), [getFromBrowseableDirectories](FileAndResourceDirectives.html#getFromBrowseableDirectories(scala.collection.immutable.Seq)), [getFromBrowseableDirectory](FileAndResourceDirectives.html#getFromBrowseableDirectory(java.lang.String)), [getFromBrowseableDirectory](FileAndResourceDirectives.html#getFromBrowseableDirectory(java.lang.String,akka.http.javadsl.server.directives.ContentTypeResolver)), [getFromBrowseableDirectory](FileAndResourceDirectives.html#getFromBrowseableDirectory(java.lang.String,akka.http.javadsl.server.directives.DirectoryRenderer)), [getFromBrowseableDirectory](FileAndResourceDirectives.html#getFromBrowseableDirectory(java.lang.String,akka.http.javadsl.server.directives.DirectoryRenderer,akka.http.javadsl.server.directives.ContentTypeResolver)), [getFromDirectory](FileAndResourceDirectives.html#getFromDirectory(java.lang.String)), [getFromDirectory](FileAndResourceDirectives.html#getFromDirectory(java.lang.String,akka.http.javadsl.server.directives.ContentTypeResolver)), [getFromFile](FileAndResourceDirectives.html#getFromFile(java.io.File)), [getFromFile](FileAndResourceDirectives.html#getFromFile(java.io.File,akka.http.javadsl.model.ContentType)), [getFromFile](FileAndResourceDirectives.html#getFromFile(java.io.File,akka.http.javadsl.server.directives.ContentTypeResolver)), [getFromFile](FileAndResourceDirectives.html#getFromFile(java.lang.String)), [getFromFile](FileAndResourceDirectives.html#getFromFile(java.lang.String,akka.http.javadsl.server.directives.ContentTypeResolver)), [getFromResource](FileAndResourceDirectives.html#getFromResource(java.lang.String)), [getFromResource](FileAndResourceDirectives.html#getFromResource(java.lang.String,akka.http.javadsl.model.ContentType)), [getFromResource](FileAndResourceDirectives.html#getFromResource(java.lang.String,akka.http.javadsl.model.ContentType,java.lang.ClassLoader)), [getFromResource](FileAndResourceDirectives.html#getFromResource(java.lang.String,akka.http.javadsl.server.directives.ContentTypeResolver)), [getFromResourceDirectory](FileAndResourceDirectives.html#getFromResourceDirectory(java.lang.String)), [getFromResourceDirectory](FileAndResourceDirectives.html#getFromResourceDirectory(java.lang.String,akka.http.javadsl.server.directives.ContentTypeResolver)), [getFromResourceDirectory](FileAndResourceDirectives.html#getFromResourceDirectory(java.lang.String,akka.http.javadsl.server.directives.ContentTypeResolver,java.lang.ClassLoader)), [getFromResourceDirectory](FileAndResourceDirectives.html#getFromResourceDirectory(java.lang.String,java.lang.ClassLoader)), [listDirectoryContents](FileAndResourceDirectives.html#listDirectoryContents(akka.http.javadsl.server.directives.DirectoryRenderer,java.lang.String...)), [listDirectoryContents](FileAndResourceDirectives.html#listDirectoryContents(akka.http.javadsl.server.directives.DirectoryRenderer,scala.collection.immutable.Seq)), [listDirectoryContents](FileAndResourceDirectives.html#listDirectoryContents(java.lang.String...)), [listDirectoryContents](FileAndResourceDirectives.html#listDirectoryContents(scala.collection.immutable.Seq))`
		- ### Methods inherited from class akka.http.javadsl.server.directives.[ExecutionDirectives](ExecutionDirectives.html "class in akka.http.javadsl.server.directives")
		
		
		`[handleExceptions](ExecutionDirectives.html#handleExceptions(akka.http.javadsl.server.ExceptionHandler,java.util.function.Supplier)), [handleRejections](ExecutionDirectives.html#handleRejections(akka.http.javadsl.server.RejectionHandler,java.util.function.Supplier))`
		- ### Methods inherited from class akka.http.javadsl.server.directives.[DebuggingDirectives](DebuggingDirectives.html "class in akka.http.javadsl.server.directives")
		
		
		`[logRequest](DebuggingDirectives.html#logRequest(java.lang.String,akka.event.Logging.LogLevel,java.util.function.Supplier)), [logRequest](DebuggingDirectives.html#logRequest(java.lang.String,java.util.function.Supplier)), [logRequest](DebuggingDirectives.html#logRequest(java.util.function.Function,java.util.function.Supplier)), [logRequestResult](DebuggingDirectives.html#logRequestResult(java.util.function.BiFunction,java.util.function.BiFunction,java.util.function.Supplier)), [logRequestResultOptional](DebuggingDirectives.html#logRequestResultOptional(java.util.function.BiFunction,java.util.function.BiFunction,java.util.function.Supplier)), [logResult](DebuggingDirectives.html#logResult(java.lang.String,akka.event.Logging.LogLevel,java.util.function.Supplier)), [logResult](DebuggingDirectives.html#logResult(java.lang.String,java.util.function.Supplier)), [logResult](DebuggingDirectives.html#logResult(java.util.function.Function,java.util.function.Function,java.util.function.Supplier))`
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
	
	
	
		- #### RouteDirectives
		
		
		
		```
		public RouteDirectives()
		```

	- ### Method Detail
	
	
	
		- #### complete
		
		
		
		```
		public [Route](../Route.html "interface in akka.http.javadsl.server") complete​(java.lang.String body)
		```
		
		Completes the request using an HTTP 200 OK status code and the given body as UTF\-8 entity.
		
		Parameters:
		`body` \- (undocumented)
		Returns:
		(undocumented)
		- #### complete
		
		
		
		```
		public [Route](../Route.html "interface in akka.http.javadsl.server") complete​([HttpResponse](../../model/HttpResponse.html "class in akka.http.javadsl.model") response)
		```
		
		Completes the request using the given http response.
		
		Parameters:
		`response` \- (undocumented)
		Returns:
		(undocumented)
		- #### complete
		
		
		
		```
		public [Route](../Route.html "interface in akka.http.javadsl.server") complete​([StatusCode](../../model/StatusCode.html "class in akka.http.javadsl.model") status)
		```
		
		Completes the request using the given status code.
		
		Parameters:
		`status` \- (undocumented)
		Returns:
		(undocumented)
		- #### complete
		
		
		
		```
		public <T> [RouteAdapter](RouteAdapter.html "class in akka.http.javadsl.server.directives") complete​(T value,
		                                 [Marshaller](../../marshalling/Marshaller.html "class in akka.http.javadsl.marshalling")<T,​[HttpResponse](../../model/HttpResponse.html "class in akka.http.javadsl.model")> marshaller)
		```
		
		Completes the request by marshalling the given value into an http response.
		
		Parameters:
		`value` \- (undocumented)
		`marshaller` \- (undocumented)
		Returns:
		(undocumented)
		- #### complete
		
		
		
		```
		public <T> [RouteAdapter](RouteAdapter.html "class in akka.http.javadsl.server.directives") complete​([StatusCode](../../model/StatusCode.html "class in akka.http.javadsl.model") status,
		                                 java.lang.Iterable<[HttpHeader](../../model/HttpHeader.html "class in akka.http.javadsl.model")> headers,
		                                 T value,
		                                 [Marshaller](../../marshalling/Marshaller.html "class in akka.http.javadsl.marshalling")<T,​[RequestEntity](../../model/RequestEntity.html "interface in akka.http.javadsl.model")> marshaller)
		```
		
		Completes the request using the given status code and headers, marshalling the given value as response entity.
		
		Parameters:
		`status` \- (undocumented)
		`headers` \- (undocumented)
		`value` \- (undocumented)
		`marshaller` \- (undocumented)
		Returns:
		(undocumented)
		- #### complete
		
		
		
		```
		public [RouteAdapter](RouteAdapter.html "class in akka.http.javadsl.server.directives") complete​([StatusCode](../../model/StatusCode.html "class in akka.http.javadsl.model") status,
		                             java.lang.Iterable<[HttpHeader](../../model/HttpHeader.html "class in akka.http.javadsl.model")> headers,
		                             [ResponseEntity](../../model/ResponseEntity.html "interface in akka.http.javadsl.model") entity)
		```
		
		Completes the request using the given status code, headers, and response entity.
		
		Parameters:
		`status` \- (undocumented)
		`headers` \- (undocumented)
		`entity` \- (undocumented)
		Returns:
		(undocumented)
		- #### complete
		
		
		
		```
		public [RouteAdapter](RouteAdapter.html "class in akka.http.javadsl.server.directives") complete​([StatusCode](../../model/StatusCode.html "class in akka.http.javadsl.model") status,
		                             java.lang.Iterable<[HttpHeader](../../model/HttpHeader.html "class in akka.http.javadsl.model")> headers,
		                             [RequestEntity](../../model/RequestEntity.html "interface in akka.http.javadsl.model") entity)
		```
		
		Completes the request using the given status code, headers, and response entity.
		
		Parameters:
		`status` \- (undocumented)
		`headers` \- (undocumented)
		`entity` \- (undocumented)
		Returns:
		(undocumented)
		- #### complete
		
		
		
		```
		public <T> [RouteAdapter](RouteAdapter.html "class in akka.http.javadsl.server.directives") complete​([StatusCode](../../model/StatusCode.html "class in akka.http.javadsl.model") status,
		                                 T value,
		                                 [Marshaller](../../marshalling/Marshaller.html "class in akka.http.javadsl.marshalling")<T,​[RequestEntity](../../model/RequestEntity.html "interface in akka.http.javadsl.model")> marshaller)
		```
		
		Completes the request using the given status code, marshalling the given value as response entity.
		
		Parameters:
		`status` \- (undocumented)
		`value` \- (undocumented)
		`marshaller` \- (undocumented)
		Returns:
		(undocumented)
		- #### complete
		
		
		
		```
		public [RouteAdapter](RouteAdapter.html "class in akka.http.javadsl.server.directives") complete​([StatusCode](../../model/StatusCode.html "class in akka.http.javadsl.model") status,
		                             [ResponseEntity](../../model/ResponseEntity.html "interface in akka.http.javadsl.model") entity)
		```
		
		Completes the request using the given status code and response entity.
		
		Parameters:
		`status` \- (undocumented)
		`entity` \- (undocumented)
		Returns:
		(undocumented)
		- #### complete
		
		
		
		```
		public [RouteAdapter](RouteAdapter.html "class in akka.http.javadsl.server.directives") complete​([StatusCode](../../model/StatusCode.html "class in akka.http.javadsl.model") status,
		                             [RequestEntity](../../model/RequestEntity.html "interface in akka.http.javadsl.model") entity)
		```
		
		Completes the request using the given status code and response entity.
		
		Parameters:
		`status` \- (undocumented)
		`entity` \- (undocumented)
		Returns:
		(undocumented)
		- #### complete
		
		
		
		```
		public [RouteAdapter](RouteAdapter.html "class in akka.http.javadsl.server.directives") complete​([StatusCode](../../model/StatusCode.html "class in akka.http.javadsl.model") status,
		                             java.lang.String entity)
		```
		
		Completes the request using the given status code and the given body as UTF\-8\.
		
		Parameters:
		`status` \- (undocumented)
		`entity` \- (undocumented)
		Returns:
		(undocumented)
		- #### complete
		
		
		
		```
		public <T> [RouteAdapter](RouteAdapter.html "class in akka.http.javadsl.server.directives") complete​(java.lang.Iterable<[HttpHeader](../../model/HttpHeader.html "class in akka.http.javadsl.model")> headers,
		                                 T value,
		                                 [Marshaller](../../marshalling/Marshaller.html "class in akka.http.javadsl.marshalling")<T,​[RequestEntity](../../model/RequestEntity.html "interface in akka.http.javadsl.model")> marshaller)
		```
		
		Completes the request as HTTP 200 OK, adding the given headers, and marshalling the given value as response entity.
		
		Parameters:
		`headers` \- (undocumented)
		`value` \- (undocumented)
		`marshaller` \- (undocumented)
		Returns:
		(undocumented)
		- #### complete
		
		
		
		```
		public [RouteAdapter](RouteAdapter.html "class in akka.http.javadsl.server.directives") complete​(java.lang.Iterable<[HttpHeader](../../model/HttpHeader.html "class in akka.http.javadsl.model")> headers,
		                             [ResponseEntity](../../model/ResponseEntity.html "interface in akka.http.javadsl.model") entity)
		```
		
		Completes the request as HTTP 200 OK, adding the given headers and response entity.
		
		Parameters:
		`headers` \- (undocumented)
		`entity` \- (undocumented)
		Returns:
		(undocumented)
		- #### complete
		
		
		
		```
		public [RouteAdapter](RouteAdapter.html "class in akka.http.javadsl.server.directives") complete​(java.lang.Iterable<[HttpHeader](../../model/HttpHeader.html "class in akka.http.javadsl.model")> headers,
		                             [RequestEntity](../../model/RequestEntity.html "interface in akka.http.javadsl.model") entity)
		```
		
		Completes the request as HTTP 200 OK, adding the given headers and response entity.
		
		Parameters:
		`headers` \- (undocumented)
		`entity` \- (undocumented)
		Returns:
		(undocumented)
		- #### complete
		
		
		
		```
		public [RouteAdapter](RouteAdapter.html "class in akka.http.javadsl.server.directives") complete​([ResponseEntity](../../model/ResponseEntity.html "interface in akka.http.javadsl.model") entity)
		```
		
		Completes the request as HTTP 200 OK with the given value as response entity.
		
		Parameters:
		`entity` \- (undocumented)
		Returns:
		(undocumented)
		- #### complete
		
		
		
		```
		public [RouteAdapter](RouteAdapter.html "class in akka.http.javadsl.server.directives") complete​([RequestEntity](../../model/RequestEntity.html "interface in akka.http.javadsl.model") entity)
		```
		
		Completes the request as HTTP 200 OK with the given value as response entity.
		
		Parameters:
		`entity` \- (undocumented)
		Returns:
		(undocumented)
		- #### completeOK
		
		
		
		```
		public <T> [RouteAdapter](RouteAdapter.html "class in akka.http.javadsl.server.directives") completeOK​(T value,
		                                   [Marshaller](../../marshalling/Marshaller.html "class in akka.http.javadsl.marshalling")<T,​[RequestEntity](../../model/RequestEntity.html "interface in akka.http.javadsl.model")> marshaller)
		```
		
		Completes the request as HTTP 200 OK, marshalling the given value as response entity.
		
		Parameters:
		`value` \- (undocumented)
		`marshaller` \- (undocumented)
		Returns:
		(undocumented)
		- #### completeOKWithFuture
		
		
		
		```
		public <T> [RouteAdapter](RouteAdapter.html "class in akka.http.javadsl.server.directives") completeOKWithFuture​(scala.concurrent.Future<T> value,
		                                             [Marshaller](../../marshalling/Marshaller.html "class in akka.http.javadsl.marshalling")<T,​[RequestEntity](../../model/RequestEntity.html "interface in akka.http.javadsl.model")> marshaller)
		```
		
		Completes the request by marshalling the given value into an http response.
		
		Parameters:
		`value` \- (undocumented)
		`marshaller` \- (undocumented)
		Returns:
		(undocumented)
		- #### completeOKWithFuture
		
		
		
		```
		public [RouteAdapter](RouteAdapter.html "class in akka.http.javadsl.server.directives") completeOKWithFuture​(java.util.concurrent.CompletionStage<[RequestEntity](../../model/RequestEntity.html "interface in akka.http.javadsl.model")> value)
		```
		
		Completes the request by marshalling the given future value into an http response.
		
		Parameters:
		`value` \- (undocumented)
		Returns:
		(undocumented)
		- #### completeOKWithFuture
		
		
		
		```
		public <T> [RouteAdapter](RouteAdapter.html "class in akka.http.javadsl.server.directives") completeOKWithFuture​(java.util.concurrent.CompletionStage<T> value,
		                                             [Marshaller](../../marshalling/Marshaller.html "class in akka.http.javadsl.marshalling")<T,​[RequestEntity](../../model/RequestEntity.html "interface in akka.http.javadsl.model")> marshaller)
		```
		
		Completes the request with an `OK` status code by marshalling the given value into an http response.
		
		Parameters:
		`value` \- (undocumented)
		`marshaller` \- (undocumented)
		Returns:
		(undocumented)
		- #### completeOKWithFutureString
		
		
		
		```
		public [RouteAdapter](RouteAdapter.html "class in akka.http.javadsl.server.directives") completeOKWithFutureString​(scala.concurrent.Future<java.lang.String> value)
		```
		
		Completes the request by marshalling the given future value into an http response.
		
		Parameters:
		`value` \- (undocumented)
		Returns:
		(undocumented)
		- #### completeOKWithFutureString
		
		
		
		```
		public [RouteAdapter](RouteAdapter.html "class in akka.http.javadsl.server.directives") completeOKWithFutureString​(java.util.concurrent.CompletionStage<java.lang.String> value)
		```
		
		Completes the request by marshalling the given future value into an http response.
		
		Parameters:
		`value` \- (undocumented)
		Returns:
		(undocumented)
		- #### completeWithFuture
		
		
		
		```
		public <T> [RouteAdapter](RouteAdapter.html "class in akka.http.javadsl.server.directives") completeWithFuture​(scala.concurrent.Future<T> value,
		                                           [Marshaller](../../marshalling/Marshaller.html "class in akka.http.javadsl.marshalling")<T,​[HttpResponse](../../model/HttpResponse.html "class in akka.http.javadsl.model")> marshaller)
		```
		
		Completes the request by marshalling the given value into an http response.
		
		Parameters:
		`value` \- (undocumented)
		`marshaller` \- (undocumented)
		Returns:
		(undocumented)
		- #### completeWithFuture
		
		
		
		```
		public [RouteAdapter](RouteAdapter.html "class in akka.http.javadsl.server.directives") completeWithFuture​(java.util.concurrent.CompletionStage<[HttpResponse](../../model/HttpResponse.html "class in akka.http.javadsl.model")> value)
		```
		
		Completes the request by marshalling the given future value into an http response.
		
		Parameters:
		`value` \- (undocumented)
		Returns:
		(undocumented)
		- #### completeWithFuture
		
		
		
		```
		public <T> [RouteAdapter](RouteAdapter.html "class in akka.http.javadsl.server.directives") completeWithFuture​(java.util.concurrent.CompletionStage<T> value,
		                                           [Marshaller](../../marshalling/Marshaller.html "class in akka.http.javadsl.marshalling")<T,​[HttpResponse](../../model/HttpResponse.html "class in akka.http.javadsl.model")> marshaller)
		```
		
		Completes the request by marshalling the given value into an http response.
		
		Parameters:
		`value` \- (undocumented)
		`marshaller` \- (undocumented)
		Returns:
		(undocumented)
		- #### completeWithFutureResponse
		
		
		
		```
		public [RouteAdapter](RouteAdapter.html "class in akka.http.javadsl.server.directives") completeWithFutureResponse​(scala.concurrent.Future<[HttpResponse](../../model/HttpResponse.html "class in akka.http.javadsl.model")> value)
		```
		
		Completes the request by marshalling the given future value into an http response.
		
		Parameters:
		`value` \- (undocumented)
		Returns:
		(undocumented)
		- #### completeWithFutureStatus
		
		
		
		```
		public [Route](../Route.html "interface in akka.http.javadsl.server") completeWithFutureStatus​(scala.concurrent.Future<[StatusCode](../../model/StatusCode.html "class in akka.http.javadsl.model")> status)
		```
		
		Completes the request using the given future status code.
		
		Parameters:
		`status` \- (undocumented)
		Returns:
		(undocumented)
		- #### completeWithFutureStatus
		
		
		
		```
		public [Route](../Route.html "interface in akka.http.javadsl.server") completeWithFutureStatus​(java.util.concurrent.CompletionStage<[StatusCode](../../model/StatusCode.html "class in akka.http.javadsl.model")> status)
		```
		
		Completes the request using the given future status code.
		
		Parameters:
		`status` \- (undocumented)
		Returns:
		(undocumented)
		- #### concat
		
		
		
		```
		public [Route](../Route.html "interface in akka.http.javadsl.server") concat​([Route](../Route.html "interface in akka.http.javadsl.server") first,
		                    [Route](../Route.html "interface in akka.http.javadsl.server")... alternatives)
		```
		
		Used to chain multiple alternate routes using comma,
		 rather than having to explicitly call route1\.orElse(route2\).orElse(route3\).
		
		Parameters:
		`first` \- (undocumented)
		`alternatives` \- (undocumented)
		Returns:
		(undocumented)
		- #### concat
		
		
		
		```
		public [Route](../Route.html "interface in akka.http.javadsl.server") concat​([Route](../Route.html "interface in akka.http.javadsl.server") first,
		                    scala.collection.immutable.Seq<[Route](../Route.html "interface in akka.http.javadsl.server")> alternatives)
		```
		
		Used to chain multiple alternate routes using comma,
		 rather than having to explicitly call route1\.orElse(route2\).orElse(route3\).
		
		Parameters:
		`first` \- (undocumented)
		`alternatives` \- (undocumented)
		Returns:
		(undocumented)
		- #### failWith
		
		
		
		```
		public [Route](../Route.html "interface in akka.http.javadsl.server") failWith​(java.lang.Throwable error)
		```
		
		Bubbles the given error up the response chain, where it is dealt with by the closest `handleExceptions`
		 directive and its ExceptionHandler.
		
		Parameters:
		`error` \- (undocumented)
		Returns:
		(undocumented)
		- #### handle
		
		
		
		```
		public [Route](../Route.html "interface in akka.http.javadsl.server") handle​(akka.japi.function.Function<[HttpRequest](../../model/HttpRequest.html "class in akka.http.javadsl.model"),​java.util.concurrent.CompletionStage<[HttpResponse](../../model/HttpResponse.html "class in akka.http.javadsl.model")>> handler)
		```
		
		Handle the request using a function.
		
		Parameters:
		`handler` \- (undocumented)
		Returns:
		(undocumented)
		- #### handleSync
		
		
		
		```
		public [Route](../Route.html "interface in akka.http.javadsl.server") handleSync​(akka.japi.function.Function<[HttpRequest](../../model/HttpRequest.html "class in akka.http.javadsl.model"),​[HttpResponse](../../model/HttpResponse.html "class in akka.http.javadsl.model")> handler)
		```
		
		Handle the request using a function.
		
		Parameters:
		`handler` \- (undocumented)
		Returns:
		(undocumented)
		- #### redirect
		
		
		
		```
		public [Route](../Route.html "interface in akka.http.javadsl.server") redirect​([Uri](../../model/Uri.html "class in akka.http.javadsl.model") uri,
		                      [StatusCode](../../model/StatusCode.html "class in akka.http.javadsl.model") redirectionType)
		```
		
		Completes the request with redirection response of the given type to the given URI.
		 
		
		Parameters:
		`redirectionType` \- A status code from StatusCodes, which must be a redirection type.
		`uri` \- (undocumented)
		Returns:
		(undocumented)
		- #### reject
		
		
		
		```
		public [Route](../Route.html "interface in akka.http.javadsl.server") reject​([Rejection](../Rejection.html "interface in akka.http.javadsl.server") rejection,
		                    [Rejection](../Rejection.html "interface in akka.http.javadsl.server")... rejections)
		```
		
		Rejects the request with the given rejections, or with an empty set of rejections if no rejections are given.
		
		Parameters:
		`rejection` \- (undocumented)
		`rejections` \- (undocumented)
		Returns:
		(undocumented)
		- #### reject
		
		
		
		```
		public [Route](../Route.html "interface in akka.http.javadsl.server") reject​([Rejection](../Rejection.html "interface in akka.http.javadsl.server") rejection,
		                    scala.collection.immutable.Seq<[Rejection](../Rejection.html "interface in akka.http.javadsl.server")> rejections)
		```
		
		Rejects the request with the given rejections, or with an empty set of rejections if no rejections are given.
		
		Parameters:
		`rejection` \- (undocumented)
		`rejections` \- (undocumented)
		Returns:
		(undocumented)
		- #### reject
		
		
		
		```
		public [Route](../Route.html "interface in akka.http.javadsl.server") reject()
		```
		
		Rejects the request with an empty rejection (usually used for "no directive matched").
		
		Returns:
		(undocumented)
		- #### route
		
		
		
		```
		public [Route](../Route.html "interface in akka.http.javadsl.server") route​([Route](../Route.html "interface in akka.http.javadsl.server")... alternatives)
		```
		
		Deprecated.
		Use the `RouteDirectives.concat` method instead.
		
		Java\-specific call added so you can chain together multiple alternate routes using comma,
		 rather than having to explicitly call route1\.orElse(route2\).orElse(route3\).
		
		Parameters:
		`alternatives` \- (undocumented)
		Returns:
		(undocumented)
		- #### route
		
		
		
		```
		public [Route](../Route.html "interface in akka.http.javadsl.server") route​(scala.collection.immutable.Seq<[Route](../Route.html "interface in akka.http.javadsl.server")> alternatives)
		```
		
		Deprecated.
		Use the `RouteDirectives.concat` method instead.
		
		Java\-specific call added so you can chain together multiple alternate routes using comma,
		 rather than having to explicitly call route1\.orElse(route2\).orElse(route3\).
		
		Parameters:
		`alternatives` \- (undocumented)
		Returns:
		(undocumented)

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/marshalling/Marshaller.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/HttpHeader.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/HttpRequest.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/HttpResponse.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/RequestEntity.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/ResponseEntity.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/StatusCode.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/Uri.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/Rejection.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/Route.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/directives/AttributeDirectives.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/directives/BasicDirectives.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/directives/CacheConditionDirectives.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/directives/CodingDirectives.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/directives/CookieDirectives.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/directives/DebuggingDirectives.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/directives/ExecutionDirectives.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/directives/FileAndResourceDirectives.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/directives/FileUploadDirectives.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/directives/FormFieldDirectives.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/directives/FutureDirectives.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/directives/HeaderDirectives.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/directives/HostDirectives.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/directives/MarshallingDirectives.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/directives/MethodDirectives.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/directives/MiscDirectives.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/directives/ParameterDirectives.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/directives/PathDirectives.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/directives/RangeDirectives.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/directives/RespondWithDirectives.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/directives/RouteAdapter.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/directives/SchemeDirectives.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/directives/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/directives/RouteDirectives.html](https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/directives/RouteDirectives.html)*