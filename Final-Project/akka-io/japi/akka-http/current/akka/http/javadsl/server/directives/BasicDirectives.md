---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:48:41Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/directives/BasicDirectives.html
title: BasicDirectives
---

# BasicDirectives

## Content

Package [akka.http.javadsl.server.directives](package-summary.html)
## Class BasicDirectives

- java.lang.Object
- - akka.http.javadsl.server.directives.BasicDirectives

- Direct Known Subclasses:
`[CacheConditionDirectives](CacheConditionDirectives.html "class in akka.http.javadsl.server.directives")`

---

```
public abstract class BasicDirectives
extends java.lang.Object
```

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[BasicDirectives](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[Route](../Route.html "interface in akka.http.javadsl.server")` | `[cancelRejection](#cancelRejection(akka.http.javadsl.server.Rejection,java.util.function.Supplier))​([Rejection](../Rejection.html "interface in akka.http.javadsl.server") rejection,  java.util.function.Supplier<[Route](../Route.html "interface in akka.http.javadsl.server")> inner)` | Adds a TransformationRejection cancelling all rejections equal to the given one  to the list of rejections potentially coming back from the inner route. |
	| `[Route](../Route.html "interface in akka.http.javadsl.server")` | `[cancelRejections](#cancelRejections(java.lang.Iterable,java.util.function.Supplier))​(java.lang.Iterable<java.lang.Class<?>> classes,  java.util.function.Supplier<[Route](../Route.html "interface in akka.http.javadsl.server")> inner)` | Adds a TransformationRejection cancelling all rejections of one of the given classes  to the list of rejections potentially coming back from the inner route. |
	| `[Route](../Route.html "interface in akka.http.javadsl.server")` | `[cancelRejections](#cancelRejections(java.util.function.Predicate,java.util.function.Supplier))​(java.util.function.Predicate<[Rejection](../Rejection.html "interface in akka.http.javadsl.server")> filter,  java.util.function.Supplier<[Route](../Route.html "interface in akka.http.javadsl.server")> inner)` | Adds a TransformationRejection cancelling all rejections for which the given filter function returns true  to the list of rejections potentially coming back from the inner route. |
	| `<T> [Route](../Route.html "interface in akka.http.javadsl.server")` | `[extract](#extract(java.util.function.Function,java.util.function.Function))​(java.util.function.Function<[RequestContext](../RequestContext.html "class in akka.http.javadsl.server"),​T> extract,  java.util.function.Function<T,​[Route](../Route.html "interface in akka.http.javadsl.server")> inner)` | Extracts a single value using the given function. |
	| `[Route](../Route.html "interface in akka.http.javadsl.server")` | `[extractActorSystem](#extractActorSystem(java.util.function.Function))​(java.util.function.Function<akka.actor.ActorSystem,​[Route](../Route.html "interface in akka.http.javadsl.server")> inner)` | Extracts the `ActorSystem` if the available Materializer is an `ActorMaterializer`. |
	| `[RouteAdapter](RouteAdapter.html "class in akka.http.javadsl.server.directives")` | `[extractDataBytes](#extractDataBytes(java.util.function.Function))​(java.util.function.Function<akka.stream.javadsl.Source<akka.util.ByteString,​java.lang.Object>,​[Route](../Route.html "interface in akka.http.javadsl.server")> inner)` | Extracts the entities `dataBytes` `Source` from the [`RequestContext`](../RequestContext.html "class in akka.http.javadsl.server"). |
	| `[Route](../Route.html "interface in akka.http.javadsl.server")` | `[extractEntity](#extractEntity(java.util.function.Function))​(java.util.function.Function<[RequestEntity](../../model/RequestEntity.html "interface in akka.http.javadsl.model"),​[Route](../Route.html "interface in akka.http.javadsl.server")> inner)` | Extracts the current http request entity. |
	| `[Route](../Route.html "interface in akka.http.javadsl.server")` | `[extractExecutionContext](#extractExecutionContext(java.util.function.Function))​(java.util.function.Function<scala.concurrent.ExecutionContextExecutor,​[Route](../Route.html "interface in akka.http.javadsl.server")> inner)` | Extracts the `ExecutionContextExecutor` from the `RequestContext`. |
	| `[Route](../Route.html "interface in akka.http.javadsl.server")` | `[extractLog](#extractLog(java.util.function.Function))​(java.util.function.Function<akka.event.LoggingAdapter,​[Route](../Route.html "interface in akka.http.javadsl.server")> inner)` | Extracts the `LoggingAdapter` |
	| `[RouteAdapter](RouteAdapter.html "class in akka.http.javadsl.server.directives")` | `[extractMatchedPath](#extractMatchedPath(java.util.function.Function))​(java.util.function.Function<java.lang.String,​[Route](../Route.html "interface in akka.http.javadsl.server")> inner)` | Extracts the already matched path from the RequestContext. |
	| `[Route](../Route.html "interface in akka.http.javadsl.server")` | `[extractMaterializer](#extractMaterializer(java.util.function.Function))​(java.util.function.Function<akka.stream.Materializer,​[Route](../Route.html "interface in akka.http.javadsl.server")> inner)` | Extracts the `Materializer` from the `RequestContext`. |
	| `[RouteAdapter](RouteAdapter.html "class in akka.http.javadsl.server.directives")` | `[extractParserSettings](#extractParserSettings(java.util.function.Function))​(java.util.function.Function<[ParserSettings](../../settings/ParserSettings.html "class in akka.http.javadsl.settings"),​[Route](../Route.html "interface in akka.http.javadsl.server")> inner)` | Extracts the [`ParserSettings`](../../settings/ParserSettings.html "class in akka.http.javadsl.settings") from the [`RequestContext`](../RequestContext.html "class in akka.http.javadsl.server"). |
	| `[RouteAdapter](RouteAdapter.html "class in akka.http.javadsl.server.directives")` | `[extractRequest](#extractRequest(java.util.function.Function))​(java.util.function.Function<[HttpRequest](../../model/HttpRequest.html "class in akka.http.javadsl.model"),​[Route](../Route.html "interface in akka.http.javadsl.server")> inner)` | Extracts the current `HttpRequest` instance. |
	| `[RouteAdapter](RouteAdapter.html "class in akka.http.javadsl.server.directives")` | `[extractRequestContext](#extractRequestContext(java.util.function.Function))​(java.util.function.Function<[RequestContext](../RequestContext.html "class in akka.http.javadsl.server"),​[Route](../Route.html "interface in akka.http.javadsl.server")> inner)` | Extracts the [`RequestContext`](../RequestContext.html "class in akka.http.javadsl.server") itself. |
	| `[Route](../Route.html "interface in akka.http.javadsl.server")` | `[extractRequestEntity](#extractRequestEntity(java.util.function.Function))​(java.util.function.Function<[RequestEntity](../../model/RequestEntity.html "interface in akka.http.javadsl.model"),​[Route](../Route.html "interface in akka.http.javadsl.server")> inner)` | Extracts the [`RequestEntity`](../../model/RequestEntity.html "interface in akka.http.javadsl.model") from the [`RequestContext`](../RequestContext.html "class in akka.http.javadsl.server"). |
	| `[RouteAdapter](RouteAdapter.html "class in akka.http.javadsl.server.directives")` | `[extractSettings](#extractSettings(java.util.function.Function))​(java.util.function.Function<[RoutingSettings](../../settings/RoutingSettings.html "class in akka.http.javadsl.settings"),​[Route](../Route.html "interface in akka.http.javadsl.server")> inner)` | Extracts the `RoutingSettings` from the [`RequestContext`](../RequestContext.html "class in akka.http.javadsl.server"). |
	| `[Route](../Route.html "interface in akka.http.javadsl.server")` | `[extractStrictEntity](#extractStrictEntity(scala.concurrent.duration.FiniteDuration,long,java.util.function.Function))​(scala.concurrent.duration.FiniteDuration timeout,  long maxBytes,  java.util.function.Function<[HttpEntity.Strict](../../model/HttpEntity.Strict.html "interface in akka.http.javadsl.model"),​[Route](../Route.html "interface in akka.http.javadsl.server")> inner)` | WARNING: This will read the entire request entity into memory and effectively disable streaming. |
	| `[Route](../Route.html "interface in akka.http.javadsl.server")` | `[extractStrictEntity](#extractStrictEntity(scala.concurrent.duration.FiniteDuration,java.util.function.Function))​(scala.concurrent.duration.FiniteDuration timeout,  java.util.function.Function<[HttpEntity.Strict](../../model/HttpEntity.Strict.html "interface in akka.http.javadsl.model"),​[Route](../Route.html "interface in akka.http.javadsl.server")> inner)` | WARNING: This will read the entire request entity into memory and effectively disable streaming. |
	| `[RouteAdapter](RouteAdapter.html "class in akka.http.javadsl.server.directives")` | `[extractUnmatchedPath](#extractUnmatchedPath(java.util.function.Function))​(java.util.function.Function<java.lang.String,​[Route](../Route.html "interface in akka.http.javadsl.server")> inner)` | Extracts the yet unmatched path from the RequestContext. |
	| `[RouteAdapter](RouteAdapter.html "class in akka.http.javadsl.server.directives")` | `[extractUri](#extractUri(java.util.function.Function))​(java.util.function.Function<[Uri](../../model/Uri.html "class in akka.http.javadsl.model"),​[Route](../Route.html "interface in akka.http.javadsl.server")> inner)` | Extracts the complete request URI. |
	| `[Route](../Route.html "interface in akka.http.javadsl.server")` | `[mapInnerRoute](#mapInnerRoute(java.util.function.Function,java.util.function.Supplier))​(java.util.function.Function<[Route](../Route.html "interface in akka.http.javadsl.server"),​[Route](../Route.html "interface in akka.http.javadsl.server")> f,  java.util.function.Supplier<[Route](../Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `[Route](../Route.html "interface in akka.http.javadsl.server")` | `[mapRejections](#mapRejections(java.util.function.Function,java.util.function.Supplier))​(java.util.function.Function<java.util.List<[Rejection](../Rejection.html "interface in akka.http.javadsl.server")>,​java.util.List<[Rejection](../Rejection.html "interface in akka.http.javadsl.server")>> f,  java.util.function.Supplier<[Route](../Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `[Route](../Route.html "interface in akka.http.javadsl.server")` | `[mapRequest](#mapRequest(java.util.function.Function,java.util.function.Supplier))​(java.util.function.Function<[HttpRequest](../../model/HttpRequest.html "class in akka.http.javadsl.model"),​[HttpRequest](../../model/HttpRequest.html "class in akka.http.javadsl.model")> f,  java.util.function.Supplier<[Route](../Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `[Route](../Route.html "interface in akka.http.javadsl.server")` | `[mapRequestContext](#mapRequestContext(java.util.function.Function,java.util.function.Supplier))​(java.util.function.Function<[RequestContext](../RequestContext.html "class in akka.http.javadsl.server"),​[RequestContext](../RequestContext.html "class in akka.http.javadsl.server")> f,  java.util.function.Supplier<[Route](../Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `[Route](../Route.html "interface in akka.http.javadsl.server")` | `[mapResponse](#mapResponse(java.util.function.Function,java.util.function.Supplier))​(java.util.function.Function<[HttpResponse](../../model/HttpResponse.html "class in akka.http.javadsl.model"),​[HttpResponse](../../model/HttpResponse.html "class in akka.http.javadsl.model")> f,  java.util.function.Supplier<[Route](../Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `[Route](../Route.html "interface in akka.http.javadsl.server")` | `[mapResponseEntity](#mapResponseEntity(java.util.function.Function,java.util.function.Supplier))​(java.util.function.Function<[ResponseEntity](../../model/ResponseEntity.html "interface in akka.http.javadsl.model"),​[ResponseEntity](../../model/ResponseEntity.html "interface in akka.http.javadsl.model")> f,  java.util.function.Supplier<[Route](../Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `[Route](../Route.html "interface in akka.http.javadsl.server")` | `[mapResponseHeaders](#mapResponseHeaders(java.util.function.Function,java.util.function.Supplier))​(java.util.function.Function<java.util.List<[HttpHeader](../../model/HttpHeader.html "class in akka.http.javadsl.model")>,​java.util.List<[HttpHeader](../../model/HttpHeader.html "class in akka.http.javadsl.model")>> f,  java.util.function.Supplier<[Route](../Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `[Route](../Route.html "interface in akka.http.javadsl.server")` | `[mapRouteResult](#mapRouteResult(java.util.function.Function,java.util.function.Supplier))​(java.util.function.Function<[RouteResult](../RouteResult.html "interface in akka.http.javadsl.server"),​[RouteResult](../RouteResult.html "interface in akka.http.javadsl.server")> f,  java.util.function.Supplier<[Route](../Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `[Route](../Route.html "interface in akka.http.javadsl.server")` | `[mapRouteResultFuture](#mapRouteResultFuture(java.util.function.Function,java.util.function.Supplier))​(java.util.function.Function<java.util.concurrent.CompletionStage<[RouteResult](../RouteResult.html "interface in akka.http.javadsl.server")>,​java.util.concurrent.CompletionStage<[RouteResult](../RouteResult.html "interface in akka.http.javadsl.server")>> f,  java.util.function.Supplier<[Route](../Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `[Route](../Route.html "interface in akka.http.javadsl.server")` | `[mapRouteResultPF](#mapRouteResultPF(scala.PartialFunction,java.util.function.Supplier))​(scala.PartialFunction<[RouteResult](../RouteResult.html "interface in akka.http.javadsl.server"),​[RouteResult](../RouteResult.html "interface in akka.http.javadsl.server")> f,  java.util.function.Supplier<[Route](../Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `[Route](../Route.html "interface in akka.http.javadsl.server")` | `[mapRouteResultWith](#mapRouteResultWith(java.util.function.Function,java.util.function.Supplier))​(java.util.function.Function<[RouteResult](../RouteResult.html "interface in akka.http.javadsl.server"),​java.util.concurrent.CompletionStage<[RouteResult](../RouteResult.html "interface in akka.http.javadsl.server")>> f,  java.util.function.Supplier<[Route](../Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `[Route](../Route.html "interface in akka.http.javadsl.server")` | `[mapRouteResultWithPF](#mapRouteResultWithPF(scala.PartialFunction,java.util.function.Supplier))​(scala.PartialFunction<[RouteResult](../RouteResult.html "interface in akka.http.javadsl.server"),​java.util.concurrent.CompletionStage<[RouteResult](../RouteResult.html "interface in akka.http.javadsl.server")>> f,  java.util.function.Supplier<[Route](../Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `[Route](../Route.html "interface in akka.http.javadsl.server")` | `[mapSettings](#mapSettings(java.util.function.Function,java.util.function.Supplier))​(java.util.function.Function<[RoutingSettings](../../settings/RoutingSettings.html "class in akka.http.javadsl.settings"),​[RoutingSettings](../../settings/RoutingSettings.html "class in akka.http.javadsl.settings")> f,  java.util.function.Supplier<[Route](../Route.html "interface in akka.http.javadsl.server")> inner)` | Runs the inner route with settings mapped by the given function. |
	| `[Route](../Route.html "interface in akka.http.javadsl.server")` | `[mapUnmatchedPath](#mapUnmatchedPath(java.util.function.Function,java.util.function.Supplier))​(java.util.function.Function<java.lang.String,​java.lang.String> f,  java.util.function.Supplier<[Route](../Route.html "interface in akka.http.javadsl.server")> inner)` | Transforms the unmatchedPath of the RequestContext using the given function. |
	| `[Route](../Route.html "interface in akka.http.javadsl.server")` | `[pass](#pass(java.util.function.Supplier))​(java.util.function.Supplier<[Route](../Route.html "interface in akka.http.javadsl.server")> inner)` | Always passes the request on to its inner route  (i.e. does nothing with the request or the response). |
	| `<T> [Route](../Route.html "interface in akka.http.javadsl.server")` | `[provide](#provide(T,java.util.function.Function))​(T t,  java.util.function.Function<T,​[Route](../Route.html "interface in akka.http.javadsl.server")> inner)` | Injects the given value into a directive. |
	| `[Route](../Route.html "interface in akka.http.javadsl.server")` | `[recoverRejections](#recoverRejections(java.util.function.Function,java.util.function.Supplier))​(java.util.function.Function<java.lang.Iterable<[Rejection](../Rejection.html "interface in akka.http.javadsl.server")>,​[RouteResult](../RouteResult.html "interface in akka.http.javadsl.server")> f,  java.util.function.Supplier<[Route](../Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `[Route](../Route.html "interface in akka.http.javadsl.server")` | `[recoverRejectionsWith](#recoverRejectionsWith(java.util.function.Function,java.util.function.Supplier))​(java.util.function.Function<java.lang.Iterable<[Rejection](../Rejection.html "interface in akka.http.javadsl.server")>,​java.util.concurrent.CompletionStage<[RouteResult](../RouteResult.html "interface in akka.http.javadsl.server")>> f,  java.util.function.Supplier<[Route](../Route.html "interface in akka.http.javadsl.server")> inner)` |  |
	| `[Route](../Route.html "interface in akka.http.javadsl.server")` | `[toStrictEntity](#toStrictEntity(scala.concurrent.duration.FiniteDuration,long,java.util.function.Supplier))​(scala.concurrent.duration.FiniteDuration timeout,  long maxBytes,  java.util.function.Supplier<[Route](../Route.html "interface in akka.http.javadsl.server")> inner)` | WARNING: This will read the entire request entity into memory and effectively disable streaming. |
	| `[Route](../Route.html "interface in akka.http.javadsl.server")` | `[toStrictEntity](#toStrictEntity(scala.concurrent.duration.FiniteDuration,java.util.function.Supplier))​(scala.concurrent.duration.FiniteDuration timeout,  java.util.function.Supplier<[Route](../Route.html "interface in akka.http.javadsl.server")> inner)` | WARNING: This will read the entire request entity into memory and effectively disable streaming. |
	| `[Route](../Route.html "interface in akka.http.javadsl.server")` | `[withExecutionContext](#withExecutionContext(scala.concurrent.ExecutionContextExecutor,java.util.function.Supplier))​(scala.concurrent.ExecutionContextExecutor ec,  java.util.function.Supplier<[Route](../Route.html "interface in akka.http.javadsl.server")> inner)` | Runs its inner route with the given alternative `ExecutionContextExecutor`. |
	| `[Route](../Route.html "interface in akka.http.javadsl.server")` | `[withLog](#withLog(akka.event.LoggingAdapter,java.util.function.Supplier))​(akka.event.LoggingAdapter log,  java.util.function.Supplier<[Route](../Route.html "interface in akka.http.javadsl.server")> inner)` | Runs its inner route with the given alternative `LoggingAdapter`. |
	| `[Route](../Route.html "interface in akka.http.javadsl.server")` | `[withMaterializer](#withMaterializer(akka.stream.Materializer,java.util.function.Supplier))​(akka.stream.Materializer mat,  java.util.function.Supplier<[Route](../Route.html "interface in akka.http.javadsl.server")> inner)` | Runs its inner route with the given alternative `Materializer`. |
	| `[Route](../Route.html "interface in akka.http.javadsl.server")` | `[withSettings](#withSettings(akka.http.javadsl.settings.RoutingSettings,java.util.function.Supplier))​([RoutingSettings](../../settings/RoutingSettings.html "class in akka.http.javadsl.settings") s,  java.util.function.Supplier<[Route](../Route.html "interface in akka.http.javadsl.server")> inner)` | Runs its inner route with the given alternative `RoutingSettings`. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### BasicDirectives
		
		
		
		```
		public BasicDirectives()
		```

	- ### Method Detail
	
	
	
		- #### cancelRejection
		
		
		
		```
		public [Route](../Route.html "interface in akka.http.javadsl.server") cancelRejection​([Rejection](../Rejection.html "interface in akka.http.javadsl.server") rejection,
		                             java.util.function.Supplier<[Route](../Route.html "interface in akka.http.javadsl.server")> inner)
		```
		
		Adds a TransformationRejection cancelling all rejections equal to the given one
		 to the list of rejections potentially coming back from the inner route.
		
		Parameters:
		`rejection` \- (undocumented)
		`inner` \- (undocumented)
		Returns:
		(undocumented)
		- #### cancelRejections
		
		
		
		```
		public [Route](../Route.html "interface in akka.http.javadsl.server") cancelRejections​(java.lang.Iterable<java.lang.Class<?>> classes,
		                              java.util.function.Supplier<[Route](../Route.html "interface in akka.http.javadsl.server")> inner)
		```
		
		Adds a TransformationRejection cancelling all rejections of one of the given classes
		 to the list of rejections potentially coming back from the inner route.
		
		Parameters:
		`classes` \- (undocumented)
		`inner` \- (undocumented)
		Returns:
		(undocumented)
		- #### cancelRejections
		
		
		
		```
		public [Route](../Route.html "interface in akka.http.javadsl.server") cancelRejections​(java.util.function.Predicate<[Rejection](../Rejection.html "interface in akka.http.javadsl.server")> filter,
		                              java.util.function.Supplier<[Route](../Route.html "interface in akka.http.javadsl.server")> inner)
		```
		
		Adds a TransformationRejection cancelling all rejections for which the given filter function returns true
		 to the list of rejections potentially coming back from the inner route.
		
		Parameters:
		`filter` \- (undocumented)
		`inner` \- (undocumented)
		Returns:
		(undocumented)
		- #### extract
		
		
		
		```
		public <T> [Route](../Route.html "interface in akka.http.javadsl.server") extract​(java.util.function.Function<[RequestContext](../RequestContext.html "class in akka.http.javadsl.server"),​T> extract,
		                         java.util.function.Function<T,​[Route](../Route.html "interface in akka.http.javadsl.server")> inner)
		```
		
		Extracts a single value using the given function.
		
		Parameters:
		`extract` \- (undocumented)
		`inner` \- (undocumented)
		Returns:
		(undocumented)
		- #### extractActorSystem
		
		
		
		```
		public [Route](../Route.html "interface in akka.http.javadsl.server") extractActorSystem​(java.util.function.Function<akka.actor.ActorSystem,​[Route](../Route.html "interface in akka.http.javadsl.server")> inner)
		```
		
		Extracts the `ActorSystem` if the available Materializer is an `ActorMaterializer`.
		 Otherwise throws an exception as it won't be able to extract the system from arbitrary materializers.
		
		Parameters:
		`inner` \- (undocumented)
		Returns:
		(undocumented)
		- #### extractDataBytes
		
		
		
		```
		public [RouteAdapter](RouteAdapter.html "class in akka.http.javadsl.server.directives") extractDataBytes​(java.util.function.Function<akka.stream.javadsl.Source<akka.util.ByteString,​java.lang.Object>,​[Route](../Route.html "interface in akka.http.javadsl.server")> inner)
		```
		
		Extracts the entities `dataBytes` `Source` from the [`RequestContext`](../RequestContext.html "class in akka.http.javadsl.server").
		
		Parameters:
		`inner` \- (undocumented)
		Returns:
		(undocumented)
		- #### extractEntity
		
		
		
		```
		public [Route](../Route.html "interface in akka.http.javadsl.server") extractEntity​(java.util.function.Function<[RequestEntity](../../model/RequestEntity.html "interface in akka.http.javadsl.model"),​[Route](../Route.html "interface in akka.http.javadsl.server")> inner)
		```
		
		Extracts the current http request entity.
		
		Parameters:
		`inner` \- (undocumented)
		Returns:
		(undocumented)
		- #### extractExecutionContext
		
		
		
		```
		public [Route](../Route.html "interface in akka.http.javadsl.server") extractExecutionContext​(java.util.function.Function<scala.concurrent.ExecutionContextExecutor,​[Route](../Route.html "interface in akka.http.javadsl.server")> inner)
		```
		
		Extracts the `ExecutionContextExecutor` from the `RequestContext`.
		
		Parameters:
		`inner` \- (undocumented)
		Returns:
		(undocumented)
		- #### extractLog
		
		
		
		```
		public [Route](../Route.html "interface in akka.http.javadsl.server") extractLog​(java.util.function.Function<akka.event.LoggingAdapter,​[Route](../Route.html "interface in akka.http.javadsl.server")> inner)
		```
		
		Extracts the `LoggingAdapter`
		
		Parameters:
		`inner` \- (undocumented)
		Returns:
		(undocumented)
		- #### extractMatchedPath
		
		
		
		```
		public [RouteAdapter](RouteAdapter.html "class in akka.http.javadsl.server.directives") extractMatchedPath​(java.util.function.Function<java.lang.String,​[Route](../Route.html "interface in akka.http.javadsl.server")> inner)
		```
		
		Extracts the already matched path from the RequestContext.
		
		Parameters:
		`inner` \- (undocumented)
		Returns:
		(undocumented)
		- #### extractMaterializer
		
		
		
		```
		public [Route](../Route.html "interface in akka.http.javadsl.server") extractMaterializer​(java.util.function.Function<akka.stream.Materializer,​[Route](../Route.html "interface in akka.http.javadsl.server")> inner)
		```
		
		Extracts the `Materializer` from the `RequestContext`.
		
		Parameters:
		`inner` \- (undocumented)
		Returns:
		(undocumented)
		- #### extractParserSettings
		
		
		
		```
		public [RouteAdapter](RouteAdapter.html "class in akka.http.javadsl.server.directives") extractParserSettings​(java.util.function.Function<[ParserSettings](../../settings/ParserSettings.html "class in akka.http.javadsl.settings"),​[Route](../Route.html "interface in akka.http.javadsl.server")> inner)
		```
		
		Extracts the [`ParserSettings`](../../settings/ParserSettings.html "class in akka.http.javadsl.settings") from the [`RequestContext`](../RequestContext.html "class in akka.http.javadsl.server").
		
		Parameters:
		`inner` \- (undocumented)
		Returns:
		(undocumented)
		- #### extractRequest
		
		
		
		```
		public [RouteAdapter](RouteAdapter.html "class in akka.http.javadsl.server.directives") extractRequest​(java.util.function.Function<[HttpRequest](../../model/HttpRequest.html "class in akka.http.javadsl.model"),​[Route](../Route.html "interface in akka.http.javadsl.server")> inner)
		```
		
		Extracts the current `HttpRequest` instance.
		
		Parameters:
		`inner` \- (undocumented)
		Returns:
		(undocumented)
		- #### extractRequestContext
		
		
		
		```
		public [RouteAdapter](RouteAdapter.html "class in akka.http.javadsl.server.directives") extractRequestContext​(java.util.function.Function<[RequestContext](../RequestContext.html "class in akka.http.javadsl.server"),​[Route](../Route.html "interface in akka.http.javadsl.server")> inner)
		```
		
		Extracts the [`RequestContext`](../RequestContext.html "class in akka.http.javadsl.server") itself.
		
		Parameters:
		`inner` \- (undocumented)
		Returns:
		(undocumented)
		- #### extractRequestEntity
		
		
		
		```
		public [Route](../Route.html "interface in akka.http.javadsl.server") extractRequestEntity​(java.util.function.Function<[RequestEntity](../../model/RequestEntity.html "interface in akka.http.javadsl.model"),​[Route](../Route.html "interface in akka.http.javadsl.server")> inner)
		```
		
		Extracts the [`RequestEntity`](../../model/RequestEntity.html "interface in akka.http.javadsl.model") from the [`RequestContext`](../RequestContext.html "class in akka.http.javadsl.server").
		
		Parameters:
		`inner` \- (undocumented)
		Returns:
		(undocumented)
		- #### extractSettings
		
		
		
		```
		public [RouteAdapter](RouteAdapter.html "class in akka.http.javadsl.server.directives") extractSettings​(java.util.function.Function<[RoutingSettings](../../settings/RoutingSettings.html "class in akka.http.javadsl.settings"),​[Route](../Route.html "interface in akka.http.javadsl.server")> inner)
		```
		
		Extracts the `RoutingSettings` from the [`RequestContext`](../RequestContext.html "class in akka.http.javadsl.server").
		
		Parameters:
		`inner` \- (undocumented)
		Returns:
		(undocumented)
		- #### extractStrictEntity
		
		
		
		```
		public [Route](../Route.html "interface in akka.http.javadsl.server") extractStrictEntity​(scala.concurrent.duration.FiniteDuration timeout,
		                                 java.util.function.Function<[HttpEntity.Strict](../../model/HttpEntity.Strict.html "interface in akka.http.javadsl.model"),​[Route](../Route.html "interface in akka.http.javadsl.server")> inner)
		```
		
		WARNING: This will read the entire request entity into memory and effectively disable streaming.
		 
		 To help protect against excessive memory use, the request will be aborted if the request is larger
		 than allowed by the `akka.http.parsing.max-to-strict-bytes` configuration setting.
		 
		
		
		 Converts the HttpEntity from the [`RequestContext`](../RequestContext.html "class in akka.http.javadsl.server") into an
		 [`HttpEntity.Strict`](../../model/HttpEntity.Strict.html "interface in akka.http.javadsl.model") and extracts it, or fails the route if unable to drain the
		 entire request body within the timeout.
		 
		
		
		
		Parameters:
		`timeout` \- The directive is failed if the stream isn't completed after the given timeout.
		`inner` \- (undocumented)
		Returns:
		(undocumented)
		- #### extractStrictEntity
		
		
		
		```
		public [Route](../Route.html "interface in akka.http.javadsl.server") extractStrictEntity​(scala.concurrent.duration.FiniteDuration timeout,
		                                 long maxBytes,
		                                 java.util.function.Function<[HttpEntity.Strict](../../model/HttpEntity.Strict.html "interface in akka.http.javadsl.model"),​[Route](../Route.html "interface in akka.http.javadsl.server")> inner)
		```
		
		WARNING: This will read the entire request entity into memory and effectively disable streaming.
		 
		 To help protect against excessive memory use, the request will be aborted if the request is larger
		 than allowed by the `akka.http.parsing.max-to-strict-bytes` configuration setting.
		 
		
		
		 Converts the HttpEntity from the [`RequestContext`](../RequestContext.html "class in akka.http.javadsl.server") into an
		 [`HttpEntity.Strict`](../../model/HttpEntity.Strict.html "interface in akka.http.javadsl.model") and extracts it, or fails the route if unable to drain the
		 entire request body within the timeout.
		 
		
		
		
		Parameters:
		`timeout` \- The directive is failed if the stream isn't completed after the given timeout.
		`maxBytes` \- (undocumented)
		`inner` \- (undocumented)
		Returns:
		(undocumented)
		- #### extractUnmatchedPath
		
		
		
		```
		public [RouteAdapter](RouteAdapter.html "class in akka.http.javadsl.server.directives") extractUnmatchedPath​(java.util.function.Function<java.lang.String,​[Route](../Route.html "interface in akka.http.javadsl.server")> inner)
		```
		
		Extracts the yet unmatched path from the RequestContext.
		
		Parameters:
		`inner` \- (undocumented)
		Returns:
		(undocumented)
		- #### extractUri
		
		
		
		```
		public [RouteAdapter](RouteAdapter.html "class in akka.http.javadsl.server.directives") extractUri​(java.util.function.Function<[Uri](../../model/Uri.html "class in akka.http.javadsl.model"),​[Route](../Route.html "interface in akka.http.javadsl.server")> inner)
		```
		
		Extracts the complete request URI.
		
		Parameters:
		`inner` \- (undocumented)
		Returns:
		(undocumented)
		- #### mapInnerRoute
		
		
		
		```
		public [Route](../Route.html "interface in akka.http.javadsl.server") mapInnerRoute​(java.util.function.Function<[Route](../Route.html "interface in akka.http.javadsl.server"),​[Route](../Route.html "interface in akka.http.javadsl.server")> f,
		                           java.util.function.Supplier<[Route](../Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### mapRejections
		
		
		
		```
		public [Route](../Route.html "interface in akka.http.javadsl.server") mapRejections​(java.util.function.Function<java.util.List<[Rejection](../Rejection.html "interface in akka.http.javadsl.server")>,​java.util.List<[Rejection](../Rejection.html "interface in akka.http.javadsl.server")>> f,
		                           java.util.function.Supplier<[Route](../Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### mapRequest
		
		
		
		```
		public [Route](../Route.html "interface in akka.http.javadsl.server") mapRequest​(java.util.function.Function<[HttpRequest](../../model/HttpRequest.html "class in akka.http.javadsl.model"),​[HttpRequest](../../model/HttpRequest.html "class in akka.http.javadsl.model")> f,
		                        java.util.function.Supplier<[Route](../Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### mapRequestContext
		
		
		
		```
		public [Route](../Route.html "interface in akka.http.javadsl.server") mapRequestContext​(java.util.function.Function<[RequestContext](../RequestContext.html "class in akka.http.javadsl.server"),​[RequestContext](../RequestContext.html "class in akka.http.javadsl.server")> f,
		                               java.util.function.Supplier<[Route](../Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### mapResponse
		
		
		
		```
		public [Route](../Route.html "interface in akka.http.javadsl.server") mapResponse​(java.util.function.Function<[HttpResponse](../../model/HttpResponse.html "class in akka.http.javadsl.model"),​[HttpResponse](../../model/HttpResponse.html "class in akka.http.javadsl.model")> f,
		                         java.util.function.Supplier<[Route](../Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### mapResponseEntity
		
		
		
		```
		public [Route](../Route.html "interface in akka.http.javadsl.server") mapResponseEntity​(java.util.function.Function<[ResponseEntity](../../model/ResponseEntity.html "interface in akka.http.javadsl.model"),​[ResponseEntity](../../model/ResponseEntity.html "interface in akka.http.javadsl.model")> f,
		                               java.util.function.Supplier<[Route](../Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### mapResponseHeaders
		
		
		
		```
		public [Route](../Route.html "interface in akka.http.javadsl.server") mapResponseHeaders​(java.util.function.Function<java.util.List<[HttpHeader](../../model/HttpHeader.html "class in akka.http.javadsl.model")>,​java.util.List<[HttpHeader](../../model/HttpHeader.html "class in akka.http.javadsl.model")>> f,
		                                java.util.function.Supplier<[Route](../Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### mapRouteResult
		
		
		
		```
		public [Route](../Route.html "interface in akka.http.javadsl.server") mapRouteResult​(java.util.function.Function<[RouteResult](../RouteResult.html "interface in akka.http.javadsl.server"),​[RouteResult](../RouteResult.html "interface in akka.http.javadsl.server")> f,
		                            java.util.function.Supplier<[Route](../Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### mapRouteResultFuture
		
		
		
		```
		public [Route](../Route.html "interface in akka.http.javadsl.server") mapRouteResultFuture​(java.util.function.Function<java.util.concurrent.CompletionStage<[RouteResult](../RouteResult.html "interface in akka.http.javadsl.server")>,​java.util.concurrent.CompletionStage<[RouteResult](../RouteResult.html "interface in akka.http.javadsl.server")>> f,
		                                  java.util.function.Supplier<[Route](../Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### mapRouteResultPF
		
		
		
		```
		public [Route](../Route.html "interface in akka.http.javadsl.server") mapRouteResultPF​(scala.PartialFunction<[RouteResult](../RouteResult.html "interface in akka.http.javadsl.server"),​[RouteResult](../RouteResult.html "interface in akka.http.javadsl.server")> f,
		                              java.util.function.Supplier<[Route](../Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### mapRouteResultWith
		
		
		
		```
		public [Route](../Route.html "interface in akka.http.javadsl.server") mapRouteResultWith​(java.util.function.Function<[RouteResult](../RouteResult.html "interface in akka.http.javadsl.server"),​java.util.concurrent.CompletionStage<[RouteResult](../RouteResult.html "interface in akka.http.javadsl.server")>> f,
		                                java.util.function.Supplier<[Route](../Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### mapRouteResultWithPF
		
		
		
		```
		public [Route](../Route.html "interface in akka.http.javadsl.server") mapRouteResultWithPF​(scala.PartialFunction<[RouteResult](../RouteResult.html "interface in akka.http.javadsl.server"),​java.util.concurrent.CompletionStage<[RouteResult](../RouteResult.html "interface in akka.http.javadsl.server")>> f,
		                                  java.util.function.Supplier<[Route](../Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### mapSettings
		
		
		
		```
		public [Route](../Route.html "interface in akka.http.javadsl.server") mapSettings​(java.util.function.Function<[RoutingSettings](../../settings/RoutingSettings.html "class in akka.http.javadsl.settings"),​[RoutingSettings](../../settings/RoutingSettings.html "class in akka.http.javadsl.settings")> f,
		                         java.util.function.Supplier<[Route](../Route.html "interface in akka.http.javadsl.server")> inner)
		```
		
		Runs the inner route with settings mapped by the given function.
		
		Parameters:
		`f` \- (undocumented)
		`inner` \- (undocumented)
		Returns:
		(undocumented)
		- #### mapUnmatchedPath
		
		
		
		```
		public [Route](../Route.html "interface in akka.http.javadsl.server") mapUnmatchedPath​(java.util.function.Function<java.lang.String,​java.lang.String> f,
		                              java.util.function.Supplier<[Route](../Route.html "interface in akka.http.javadsl.server")> inner)
		```
		
		Transforms the unmatchedPath of the RequestContext using the given function.
		
		Parameters:
		`f` \- (undocumented)
		`inner` \- (undocumented)
		Returns:
		(undocumented)
		- #### pass
		
		
		
		```
		public [Route](../Route.html "interface in akka.http.javadsl.server") pass​(java.util.function.Supplier<[Route](../Route.html "interface in akka.http.javadsl.server")> inner)
		```
		
		Always passes the request on to its inner route
		 (i.e. does nothing with the request or the response).
		
		Parameters:
		`inner` \- (undocumented)
		Returns:
		(undocumented)
		- #### provide
		
		
		
		```
		public <T> [Route](../Route.html "interface in akka.http.javadsl.server") provide​(T t,
		                         java.util.function.Function<T,​[Route](../Route.html "interface in akka.http.javadsl.server")> inner)
		```
		
		Injects the given value into a directive.
		
		Parameters:
		`t` \- (undocumented)
		`inner` \- (undocumented)
		Returns:
		(undocumented)
		- #### recoverRejections
		
		
		
		```
		public [Route](../Route.html "interface in akka.http.javadsl.server") recoverRejections​(java.util.function.Function<java.lang.Iterable<[Rejection](../Rejection.html "interface in akka.http.javadsl.server")>,​[RouteResult](../RouteResult.html "interface in akka.http.javadsl.server")> f,
		                               java.util.function.Supplier<[Route](../Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### recoverRejectionsWith
		
		
		
		```
		public [Route](../Route.html "interface in akka.http.javadsl.server") recoverRejectionsWith​(java.util.function.Function<java.lang.Iterable<[Rejection](../Rejection.html "interface in akka.http.javadsl.server")>,​java.util.concurrent.CompletionStage<[RouteResult](../RouteResult.html "interface in akka.http.javadsl.server")>> f,
		                                   java.util.function.Supplier<[Route](../Route.html "interface in akka.http.javadsl.server")> inner)
		```
		- #### toStrictEntity
		
		
		
		```
		public [Route](../Route.html "interface in akka.http.javadsl.server") toStrictEntity​(scala.concurrent.duration.FiniteDuration timeout,
		                            java.util.function.Supplier<[Route](../Route.html "interface in akka.http.javadsl.server")> inner)
		```
		
		WARNING: This will read the entire request entity into memory and effectively disable streaming.
		 
		 To help protect against excessive memory use, the request will be aborted if the request is larger
		 than allowed by the `akka.http.parsing.max-to-strict-bytes` configuration setting.
		 
		
		
		 Extracts the [`RequestContext`](../RequestContext.html "class in akka.http.javadsl.server") itself with the strict HTTP entity,
		 or fails the route if unable to drain the entire request body within the timeout.
		 
		
		
		
		Parameters:
		`timeout` \- The directive is failed if the stream isn't completed after the given timeout.
		`inner` \- (undocumented)
		Returns:
		(undocumented)
		- #### toStrictEntity
		
		
		
		```
		public [Route](../Route.html "interface in akka.http.javadsl.server") toStrictEntity​(scala.concurrent.duration.FiniteDuration timeout,
		                            long maxBytes,
		                            java.util.function.Supplier<[Route](../Route.html "interface in akka.http.javadsl.server")> inner)
		```
		
		WARNING: This will read the entire request entity into memory and effectively disable streaming.
		 
		 To help protect against excessive memory use, the request will be aborted if the request is larger
		 than allowed by the `akka.http.parsing.max-to-strict-bytes` configuration setting.
		 
		
		
		 Extracts the [`RequestContext`](../RequestContext.html "class in akka.http.javadsl.server") itself with the strict HTTP entity,
		 or fails the route if unable to drain the entire request body within the timeout.
		 
		
		
		
		Parameters:
		`timeout` \- The directive is failed if the stream isn't completed after the given timeout.
		`maxBytes` \- (undocumented)
		`inner` \- (undocumented)
		Returns:
		(undocumented)
		- #### withExecutionContext
		
		
		
		```
		public [Route](../Route.html "interface in akka.http.javadsl.server") withExecutionContext​(scala.concurrent.ExecutionContextExecutor ec,
		                                  java.util.function.Supplier<[Route](../Route.html "interface in akka.http.javadsl.server")> inner)
		```
		
		Runs its inner route with the given alternative `ExecutionContextExecutor`.
		
		Parameters:
		`ec` \- (undocumented)
		`inner` \- (undocumented)
		Returns:
		(undocumented)
		- #### withLog
		
		
		
		```
		public [Route](../Route.html "interface in akka.http.javadsl.server") withLog​(akka.event.LoggingAdapter log,
		                     java.util.function.Supplier<[Route](../Route.html "interface in akka.http.javadsl.server")> inner)
		```
		
		Runs its inner route with the given alternative `LoggingAdapter`.
		
		Parameters:
		`log` \- (undocumented)
		`inner` \- (undocumented)
		Returns:
		(undocumented)
		- #### withMaterializer
		
		
		
		```
		public [Route](../Route.html "interface in akka.http.javadsl.server") withMaterializer​(akka.stream.Materializer mat,
		                              java.util.function.Supplier<[Route](../Route.html "interface in akka.http.javadsl.server")> inner)
		```
		
		Runs its inner route with the given alternative `Materializer`.
		
		Parameters:
		`mat` \- (undocumented)
		`inner` \- (undocumented)
		Returns:
		(undocumented)
		- #### withSettings
		
		
		
		```
		public [Route](../Route.html "interface in akka.http.javadsl.server") withSettings​([RoutingSettings](../../settings/RoutingSettings.html "class in akka.http.javadsl.settings") s,
		                          java.util.function.Supplier<[Route](../Route.html "interface in akka.http.javadsl.server")> inner)
		```
		
		Runs its inner route with the given alternative `RoutingSettings`.
		
		Parameters:
		`s` \- (undocumented)
		`inner` \- (undocumented)
		Returns:
		(undocumented)

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/HttpEntity.Strict.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/HttpHeader.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/HttpRequest.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/HttpResponse.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/RequestEntity.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/ResponseEntity.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/Uri.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/Rejection.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/RequestContext.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/Route.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/RouteResult.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/directives/CacheConditionDirectives.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/directives/RouteAdapter.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/directives/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/settings/ParserSettings.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/settings/RoutingSettings.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/directives/BasicDirectives.html](https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/directives/BasicDirectives.html)*