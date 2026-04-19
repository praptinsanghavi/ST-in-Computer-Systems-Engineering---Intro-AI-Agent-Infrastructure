---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:09:38Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/directives/BasicDirectives.html
title: BasicDirectives
---

# BasicDirectives

## Content

Package [akka.http.scaladsl.server.directives](package-summary.html)
## Interface BasicDirectives

- All Known Subinterfaces:
`[Directives](../Directives.html "interface in akka.http.scaladsl.server")`

All Known Implementing Classes:
`[BasicDirectives$](BasicDirectives$.html "class in akka.http.scaladsl.server.directives")`, `[Directives$](../Directives$.html "class in akka.http.scaladsl.server")`, `[HttpApp](../HttpApp.html "class in akka.http.scaladsl.server")`

---

```
public interface BasicDirectives
```

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit>` | `[cancelRejection](#cancelRejection(akka.http.scaladsl.server.Rejection))​([Rejection](../Rejection.html "interface in akka.http.scaladsl.server") rejection)` | Adds a TransformationRejection cancelling all rejections equal to the given one  to the list of rejections potentially coming back from the inner route. |
	| `[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit>` | `[cancelRejections](#cancelRejections(scala.collection.immutable.Seq))​(scala.collection.immutable.Seq<java.lang.Class<?>> classes)` | Adds a TransformationRejection cancelling all rejections of one of the given classes  to the list of rejections potentially coming back from the inner route. |
	| `[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit>` | `[cancelRejections](#cancelRejections(scala.Function1))​(scala.Function1<[Rejection](../Rejection.html "interface in akka.http.scaladsl.server"),​java.lang.Object> cancelFilter)` | Adds a TransformationRejection cancelling all rejections for which the given filter function returns true  to the list of rejections potentially coming back from the inner route. |
	| `<T> [Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.Tuple1<T>>` | `[extract](#extract(scala.Function1))​(scala.Function1<[RequestContext](../RequestContext.html "interface in akka.http.scaladsl.server"),​T> f)` | Extracts a single value using the given function. |
	| `[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.Tuple1<akka.actor.ActorSystem>>` | `[extractActorSystem](#extractActorSystem())()` | Extracts the `ActorSystem` if the available Materializer is an `ActorMaterializer`. |
	| `[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.Tuple1<akka.stream.scaladsl.Source<akka.util.ByteString,​java.lang.Object>>>` | `[extractDataBytes](#extractDataBytes())()` | Extracts the entities `dataBytes` `Source` from the [`RequestContext`](../RequestContext.html "interface in akka.http.scaladsl.server"). |
	| `[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.Tuple1<scala.concurrent.ExecutionContextExecutor>>` | `[extractExecutionContext](#extractExecutionContext())()` | Extracts the `ExecutionContextExecutor` from the [`RequestContext`](../RequestContext.html "interface in akka.http.scaladsl.server"). |
	| `[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.Tuple1<akka.event.LoggingAdapter>>` | `[extractLog](#extractLog())()` | Extracts the `LoggingAdapter` from the [`RequestContext`](../RequestContext.html "interface in akka.http.scaladsl.server"). |
	| `[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.Tuple1<[Uri.Path](../../model/Uri.Path.html "class in akka.http.scaladsl.model")>>` | `[extractMatchedPath](#extractMatchedPath())()` | Extracts the already matched path from the RequestContext. |
	| `[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.Tuple1<akka.stream.Materializer>>` | `[extractMaterializer](#extractMaterializer())()` | Extracts the `Materializer` from the [`RequestContext`](../RequestContext.html "interface in akka.http.scaladsl.server"). |
	| `[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.Tuple1<[ParserSettings](../../settings/ParserSettings.html "class in akka.http.scaladsl.settings")>>` | `[extractParserSettings](#extractParserSettings())()` | Extracts the [`ParserSettings`](../../settings/ParserSettings.html "class in akka.http.scaladsl.settings") from the [`RequestContext`](../RequestContext.html "interface in akka.http.scaladsl.server"). |
	| `[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.Tuple1<[HttpRequest](../../model/HttpRequest.html "class in akka.http.scaladsl.model")>>` | `[extractRequest](#extractRequest())()` | Extracts the current `HttpRequest` instance. |
	| `[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.Tuple1<[RequestContext](../RequestContext.html "interface in akka.http.scaladsl.server")>>` | `[extractRequestContext](#extractRequestContext())()` | Extracts the [`RequestContext`](../RequestContext.html "interface in akka.http.scaladsl.server") itself. |
	| `[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.Tuple1<[RequestEntity](../../model/RequestEntity.html "interface in akka.http.scaladsl.model")>>` | `[extractRequestEntity](#extractRequestEntity())()` | Extracts the [`RequestEntity`](../../model/RequestEntity.html "interface in akka.http.scaladsl.model") from the [`RequestContext`](../RequestContext.html "interface in akka.http.scaladsl.server"). |
	| `[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.Tuple1<[RoutingSettings](../../settings/RoutingSettings.html "class in akka.http.scaladsl.settings")>>` | `[extractSettings](#extractSettings())()` | Extracts the `RoutingSettings` from the [`RequestContext`](../RequestContext.html "interface in akka.http.scaladsl.server"). |
	| `[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.Tuple1<[HttpEntity.Strict](../../model/HttpEntity.Strict.html "class in akka.http.scaladsl.model")>>` | `[extractStrictEntity](#extractStrictEntity(scala.concurrent.duration.FiniteDuration))​(scala.concurrent.duration.FiniteDuration timeout)` | WARNING: This will read the entire request entity into memory and effectively disable streaming. |
	| `[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.Tuple1<[HttpEntity.Strict](../../model/HttpEntity.Strict.html "class in akka.http.scaladsl.model")>>` | `[extractStrictEntity](#extractStrictEntity(scala.concurrent.duration.FiniteDuration,long))​(scala.concurrent.duration.FiniteDuration timeout,  long maxBytes)` | WARNING: This will read the entire request entity into memory and effectively disable streaming. |
	| `[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.Tuple1<[Uri.Path](../../model/Uri.Path.html "class in akka.http.scaladsl.model")>>` | `[extractUnmatchedPath](#extractUnmatchedPath())()` | Extracts the yet unmatched path from the RequestContext. |
	| `[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.Tuple1<[Uri](../../model/Uri.html "class in akka.http.scaladsl.model")>>` | `[extractUri](#extractUri())()` | Extracts the complete request URI. |
	| `[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit>` | `[mapInnerRoute](#mapInnerRoute(scala.Function1))​(scala.Function1<scala.Function1<[RequestContext](../RequestContext.html "interface in akka.http.scaladsl.server"),​scala.concurrent.Future<[RouteResult](../RouteResult.html "interface in akka.http.scaladsl.server")>>,​scala.Function1<[RequestContext](../RequestContext.html "interface in akka.http.scaladsl.server"),​scala.concurrent.Future<[RouteResult](../RouteResult.html "interface in akka.http.scaladsl.server")>>> f)` |  |
	| `[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit>` | `[mapRejections](#mapRejections(scala.Function1))​(scala.Function1<scala.collection.immutable.Seq<[Rejection](../Rejection.html "interface in akka.http.scaladsl.server")>,​scala.collection.immutable.Seq<[Rejection](../Rejection.html "interface in akka.http.scaladsl.server")>> f)` |  |
	| `[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit>` | `[mapRequest](#mapRequest(scala.Function1))​(scala.Function1<[HttpRequest](../../model/HttpRequest.html "class in akka.http.scaladsl.model"),​[HttpRequest](../../model/HttpRequest.html "class in akka.http.scaladsl.model")> f)` |  |
	| `[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit>` | `[mapRequestContext](#mapRequestContext(scala.Function1))​(scala.Function1<[RequestContext](../RequestContext.html "interface in akka.http.scaladsl.server"),​[RequestContext](../RequestContext.html "interface in akka.http.scaladsl.server")> f)` |  |
	| `[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit>` | `[mapResponse](#mapResponse(scala.Function1))​(scala.Function1<[HttpResponse](../../model/HttpResponse.html "class in akka.http.scaladsl.model"),​[HttpResponse](../../model/HttpResponse.html "class in akka.http.scaladsl.model")> f)` |  |
	| `[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit>` | `[mapResponseEntity](#mapResponseEntity(scala.Function1))​(scala.Function1<[ResponseEntity](../../model/ResponseEntity.html "interface in akka.http.scaladsl.model"),​[ResponseEntity](../../model/ResponseEntity.html "interface in akka.http.scaladsl.model")> f)` |  |
	| `[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit>` | `[mapResponseHeaders](#mapResponseHeaders(scala.Function1))​(scala.Function1<scala.collection.immutable.Seq<[HttpHeader](../../model/HttpHeader.html "class in akka.http.scaladsl.model")>,​scala.collection.immutable.Seq<[HttpHeader](../../model/HttpHeader.html "class in akka.http.scaladsl.model")>> f)` |  |
	| `[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit>` | `[mapRouteResult](#mapRouteResult(scala.Function1))​(scala.Function1<[RouteResult](../RouteResult.html "interface in akka.http.scaladsl.server"),​[RouteResult](../RouteResult.html "interface in akka.http.scaladsl.server")> f)` |  |
	| `[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit>` | `[mapRouteResultFuture](#mapRouteResultFuture(scala.Function1))​(scala.Function1<scala.concurrent.Future<[RouteResult](../RouteResult.html "interface in akka.http.scaladsl.server")>,​scala.concurrent.Future<[RouteResult](../RouteResult.html "interface in akka.http.scaladsl.server")>> f)` |  |
	| `[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit>` | `[mapRouteResultPF](#mapRouteResultPF(scala.PartialFunction))​(scala.PartialFunction<[RouteResult](../RouteResult.html "interface in akka.http.scaladsl.server"),​[RouteResult](../RouteResult.html "interface in akka.http.scaladsl.server")> f)` |  |
	| `[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit>` | `[mapRouteResultWith](#mapRouteResultWith(scala.Function1))​(scala.Function1<[RouteResult](../RouteResult.html "interface in akka.http.scaladsl.server"),​scala.concurrent.Future<[RouteResult](../RouteResult.html "interface in akka.http.scaladsl.server")>> f)` |  |
	| `[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit>` | `[mapRouteResultWithPF](#mapRouteResultWithPF(scala.PartialFunction))​(scala.PartialFunction<[RouteResult](../RouteResult.html "interface in akka.http.scaladsl.server"),​scala.concurrent.Future<[RouteResult](../RouteResult.html "interface in akka.http.scaladsl.server")>> f)` |  |
	| `[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit>` | `[mapSettings](#mapSettings(scala.Function1))​(scala.Function1<[RoutingSettings](../../settings/RoutingSettings.html "class in akka.http.scaladsl.settings"),​[RoutingSettings](../../settings/RoutingSettings.html "class in akka.http.scaladsl.settings")> f)` | Runs the inner route with settings mapped by the given function. |
	| `[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit>` | `[mapUnmatchedPath](#mapUnmatchedPath(scala.Function1))​(scala.Function1<[Uri.Path](../../model/Uri.Path.html "class in akka.http.scaladsl.model"),​[Uri.Path](../../model/Uri.Path.html "class in akka.http.scaladsl.model")> f)` | Transforms the unmatchedPath of the RequestContext using the given function. |
	| `[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit>` | `[pass](#pass())()` | A Directive0 that always passes the request on to its inner route  (i.e. does nothing with the request or the response). |
	| `<T> [Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.Tuple1<T>>` | `[provide](#provide(T))​(T value)` | Injects the given value into a directive. |
	| `[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit>` | `[recoverRejections](#recoverRejections(scala.Function1))​(scala.Function1<scala.collection.immutable.Seq<[Rejection](../Rejection.html "interface in akka.http.scaladsl.server")>,​[RouteResult](../RouteResult.html "interface in akka.http.scaladsl.server")> f)` |  |
	| `[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit>` | `[recoverRejectionsWith](#recoverRejectionsWith(scala.Function1))​(scala.Function1<scala.collection.immutable.Seq<[Rejection](../Rejection.html "interface in akka.http.scaladsl.server")>,​scala.concurrent.Future<[RouteResult](../RouteResult.html "interface in akka.http.scaladsl.server")>> f)` |  |
	| `<L> [Directive](../Directive.html "class in akka.http.scaladsl.server")<L>` | `[textract](#textract(scala.Function1,akka.http.scaladsl.server.util.Tuple))​(scala.Function1<[RequestContext](../RequestContext.html "interface in akka.http.scaladsl.server"),​L> f,  [Tuple](../util/Tuple.html "interface in akka.http.scaladsl.server.util")<L> evidence$2)` | Extracts a number of values using the given function. |
	| `[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit>` | `[toStrictEntity](#toStrictEntity(scala.concurrent.duration.FiniteDuration))​(scala.concurrent.duration.FiniteDuration timeout)` | WARNING: This will read the entire request entity into memory and effectively disable streaming. |
	| `[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit>` | `[toStrictEntity](#toStrictEntity(scala.concurrent.duration.FiniteDuration,long))​(scala.concurrent.duration.FiniteDuration timeout,  long maxBytes)` | WARNING: This will read the entire request entity into memory and effectively disable streaming. |
	| `<L> [Directive](../Directive.html "class in akka.http.scaladsl.server")<L>` | `[tprovide](#tprovide(L,akka.http.scaladsl.server.util.Tuple))​(L values,  [Tuple](../util/Tuple.html "interface in akka.http.scaladsl.server.util")<L> evidence$1)` | Injects the given values into a directive. |
	| `[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit>` | `[withExecutionContext](#withExecutionContext(scala.concurrent.ExecutionContextExecutor))​(scala.concurrent.ExecutionContextExecutor ec)` | Runs its inner route with the given alternative `ExecutionContextExecutor`. |
	| `[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit>` | `[withLog](#withLog(akka.event.LoggingAdapter))​(akka.event.LoggingAdapter log)` | Runs its inner route with the given alternative `LoggingAdapter`. |
	| `[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit>` | `[withMaterializer](#withMaterializer(akka.stream.Materializer))​(akka.stream.Materializer materializer)` | Runs its inner route with the given alternative `Materializer`. |
	| `[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit>` | `[withSettings](#withSettings(akka.http.scaladsl.settings.RoutingSettings))​([RoutingSettings](../../settings/RoutingSettings.html "class in akka.http.scaladsl.settings") settings)` | Runs its inner route with the given alternative `RoutingSettings`. |

- - ### Method Detail
	
	
	
		- #### mapInnerRoute
		
		
		
		```
		[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit> mapInnerRoute​(scala.Function1<scala.Function1<[RequestContext](../RequestContext.html "interface in akka.http.scaladsl.server"),​scala.concurrent.Future<[RouteResult](../RouteResult.html "interface in akka.http.scaladsl.server")>>,​scala.Function1<[RequestContext](../RequestContext.html "interface in akka.http.scaladsl.server"),​scala.concurrent.Future<[RouteResult](../RouteResult.html "interface in akka.http.scaladsl.server")>>> f)
		```
		
		
		Parameters:
		`f` \- (undocumented)
		Returns:
		(undocumented)
		- #### mapRequestContext
		
		
		
		```
		[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit> mapRequestContext​(scala.Function1<[RequestContext](../RequestContext.html "interface in akka.http.scaladsl.server"),​[RequestContext](../RequestContext.html "interface in akka.http.scaladsl.server")> f)
		```
		
		
		Parameters:
		`f` \- (undocumented)
		Returns:
		(undocumented)
		- #### mapRequest
		
		
		
		```
		[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit> mapRequest​(scala.Function1<[HttpRequest](../../model/HttpRequest.html "class in akka.http.scaladsl.model"),​[HttpRequest](../../model/HttpRequest.html "class in akka.http.scaladsl.model")> f)
		```
		
		
		Parameters:
		`f` \- (undocumented)
		Returns:
		(undocumented)
		- #### mapRouteResultFuture
		
		
		
		```
		[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit> mapRouteResultFuture​(scala.Function1<scala.concurrent.Future<[RouteResult](../RouteResult.html "interface in akka.http.scaladsl.server")>,​scala.concurrent.Future<[RouteResult](../RouteResult.html "interface in akka.http.scaladsl.server")>> f)
		```
		
		
		Parameters:
		`f` \- (undocumented)
		Returns:
		(undocumented)
		- #### mapRouteResult
		
		
		
		```
		[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit> mapRouteResult​(scala.Function1<[RouteResult](../RouteResult.html "interface in akka.http.scaladsl.server"),​[RouteResult](../RouteResult.html "interface in akka.http.scaladsl.server")> f)
		```
		
		
		Parameters:
		`f` \- (undocumented)
		Returns:
		(undocumented)
		- #### mapRouteResultWith
		
		
		
		```
		[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit> mapRouteResultWith​(scala.Function1<[RouteResult](../RouteResult.html "interface in akka.http.scaladsl.server"),​scala.concurrent.Future<[RouteResult](../RouteResult.html "interface in akka.http.scaladsl.server")>> f)
		```
		
		
		Parameters:
		`f` \- (undocumented)
		Returns:
		(undocumented)
		- #### mapRouteResultPF
		
		
		
		```
		[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit> mapRouteResultPF​(scala.PartialFunction<[RouteResult](../RouteResult.html "interface in akka.http.scaladsl.server"),​[RouteResult](../RouteResult.html "interface in akka.http.scaladsl.server")> f)
		```
		
		
		Parameters:
		`f` \- (undocumented)
		Returns:
		(undocumented)
		- #### mapRouteResultWithPF
		
		
		
		```
		[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit> mapRouteResultWithPF​(scala.PartialFunction<[RouteResult](../RouteResult.html "interface in akka.http.scaladsl.server"),​scala.concurrent.Future<[RouteResult](../RouteResult.html "interface in akka.http.scaladsl.server")>> f)
		```
		
		
		Parameters:
		`f` \- (undocumented)
		Returns:
		(undocumented)
		- #### recoverRejections
		
		
		
		```
		[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit> recoverRejections​(scala.Function1<scala.collection.immutable.Seq<[Rejection](../Rejection.html "interface in akka.http.scaladsl.server")>,​[RouteResult](../RouteResult.html "interface in akka.http.scaladsl.server")> f)
		```
		
		
		Parameters:
		`f` \- (undocumented)
		Returns:
		(undocumented)
		- #### recoverRejectionsWith
		
		
		
		```
		[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit> recoverRejectionsWith​(scala.Function1<scala.collection.immutable.Seq<[Rejection](../Rejection.html "interface in akka.http.scaladsl.server")>,​scala.concurrent.Future<[RouteResult](../RouteResult.html "interface in akka.http.scaladsl.server")>> f)
		```
		
		
		Parameters:
		`f` \- (undocumented)
		Returns:
		(undocumented)
		- #### mapRejections
		
		
		
		```
		[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit> mapRejections​(scala.Function1<scala.collection.immutable.Seq<[Rejection](../Rejection.html "interface in akka.http.scaladsl.server")>,​scala.collection.immutable.Seq<[Rejection](../Rejection.html "interface in akka.http.scaladsl.server")>> f)
		```
		
		
		Parameters:
		`f` \- (undocumented)
		Returns:
		(undocumented)
		- #### mapResponse
		
		
		
		```
		[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit> mapResponse​(scala.Function1<[HttpResponse](../../model/HttpResponse.html "class in akka.http.scaladsl.model"),​[HttpResponse](../../model/HttpResponse.html "class in akka.http.scaladsl.model")> f)
		```
		
		
		Parameters:
		`f` \- (undocumented)
		Returns:
		(undocumented)
		- #### mapResponseEntity
		
		
		
		```
		[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit> mapResponseEntity​(scala.Function1<[ResponseEntity](../../model/ResponseEntity.html "interface in akka.http.scaladsl.model"),​[ResponseEntity](../../model/ResponseEntity.html "interface in akka.http.scaladsl.model")> f)
		```
		
		
		Parameters:
		`f` \- (undocumented)
		Returns:
		(undocumented)
		- #### mapResponseHeaders
		
		
		
		```
		[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit> mapResponseHeaders​(scala.Function1<scala.collection.immutable.Seq<[HttpHeader](../../model/HttpHeader.html "class in akka.http.scaladsl.model")>,​scala.collection.immutable.Seq<[HttpHeader](../../model/HttpHeader.html "class in akka.http.scaladsl.model")>> f)
		```
		
		
		Parameters:
		`f` \- (undocumented)
		Returns:
		(undocumented)
		- #### pass
		
		
		
		```
		[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit> pass()
		```
		
		A Directive0 that always passes the request on to its inner route
		 (i.e. does nothing with the request or the response).
		 
		
		Returns:
		(undocumented)
		- #### provide
		
		
		
		```
		<T> [Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.Tuple1<T>> provide​(T value)
		```
		
		Injects the given value into a directive.
		 
		
		Parameters:
		`value` \- (undocumented)
		Returns:
		(undocumented)
		- #### tprovide
		
		
		
		```
		<L> [Directive](../Directive.html "class in akka.http.scaladsl.server")<L> tprovide​(L values,
		                          [Tuple](../util/Tuple.html "interface in akka.http.scaladsl.server.util")<L> evidence$1)
		```
		
		Injects the given values into a directive.
		 
		
		Parameters:
		`values` \- (undocumented)
		`evidence$1` \- (undocumented)
		Returns:
		(undocumented)
		- #### extract
		
		
		
		```
		<T> [Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.Tuple1<T>> extract​(scala.Function1<[RequestContext](../RequestContext.html "interface in akka.http.scaladsl.server"),​T> f)
		```
		
		Extracts a single value using the given function.
		 
		
		Parameters:
		`f` \- (undocumented)
		Returns:
		(undocumented)
		- #### textract
		
		
		
		```
		<L> [Directive](../Directive.html "class in akka.http.scaladsl.server")<L> textract​(scala.Function1<[RequestContext](../RequestContext.html "interface in akka.http.scaladsl.server"),​L> f,
		                          [Tuple](../util/Tuple.html "interface in akka.http.scaladsl.server.util")<L> evidence$2)
		```
		
		Extracts a number of values using the given function.
		 
		
		Parameters:
		`f` \- (undocumented)
		`evidence$2` \- (undocumented)
		Returns:
		(undocumented)
		- #### cancelRejection
		
		
		
		```
		[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit> cancelRejection​([Rejection](../Rejection.html "interface in akka.http.scaladsl.server") rejection)
		```
		
		Adds a TransformationRejection cancelling all rejections equal to the given one
		 to the list of rejections potentially coming back from the inner route.
		 
		
		Parameters:
		`rejection` \- (undocumented)
		Returns:
		(undocumented)
		- #### cancelRejections
		
		
		
		```
		[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit> cancelRejections​(scala.collection.immutable.Seq<java.lang.Class<?>> classes)
		```
		
		Adds a TransformationRejection cancelling all rejections of one of the given classes
		 to the list of rejections potentially coming back from the inner route.
		 
		
		Parameters:
		`classes` \- (undocumented)
		Returns:
		(undocumented)
		- #### cancelRejections
		
		
		
		```
		[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit> cancelRejections​(scala.Function1<[Rejection](../Rejection.html "interface in akka.http.scaladsl.server"),​java.lang.Object> cancelFilter)
		```
		
		Adds a TransformationRejection cancelling all rejections for which the given filter function returns true
		 to the list of rejections potentially coming back from the inner route.
		 
		
		Parameters:
		`cancelFilter` \- (undocumented)
		Returns:
		(undocumented)
		- #### mapUnmatchedPath
		
		
		
		```
		[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit> mapUnmatchedPath​(scala.Function1<[Uri.Path](../../model/Uri.Path.html "class in akka.http.scaladsl.model"),​[Uri.Path](../../model/Uri.Path.html "class in akka.http.scaladsl.model")> f)
		```
		
		Transforms the unmatchedPath of the RequestContext using the given function.
		 
		
		Parameters:
		`f` \- (undocumented)
		Returns:
		(undocumented)
		- #### extractUnmatchedPath
		
		
		
		```
		[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.Tuple1<[Uri.Path](../../model/Uri.Path.html "class in akka.http.scaladsl.model")>> extractUnmatchedPath()
		```
		
		Extracts the yet unmatched path from the RequestContext.
		 
		
		Returns:
		(undocumented)
		- #### extractMatchedPath
		
		
		
		```
		[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.Tuple1<[Uri.Path](../../model/Uri.Path.html "class in akka.http.scaladsl.model")>> extractMatchedPath()
		```
		
		Extracts the already matched path from the RequestContext.
		 
		
		Returns:
		(undocumented)
		- #### extractRequest
		
		
		
		```
		[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.Tuple1<[HttpRequest](../../model/HttpRequest.html "class in akka.http.scaladsl.model")>> extractRequest()
		```
		
		Extracts the current `HttpRequest` instance.
		 
		
		Returns:
		(undocumented)
		- #### extractUri
		
		
		
		```
		[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.Tuple1<[Uri](../../model/Uri.html "class in akka.http.scaladsl.model")>> extractUri()
		```
		
		Extracts the complete request URI.
		 
		
		Returns:
		(undocumented)
		- #### withExecutionContext
		
		
		
		```
		[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit> withExecutionContext​(scala.concurrent.ExecutionContextExecutor ec)
		```
		
		Runs its inner route with the given alternative `ExecutionContextExecutor`.
		 
		
		Parameters:
		`ec` \- (undocumented)
		Returns:
		(undocumented)
		- #### extractExecutionContext
		
		
		
		```
		[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.Tuple1<scala.concurrent.ExecutionContextExecutor>> extractExecutionContext()
		```
		
		Extracts the `ExecutionContextExecutor` from the [`RequestContext`](../RequestContext.html "interface in akka.http.scaladsl.server").
		 
		
		Returns:
		(undocumented)
		- #### withMaterializer
		
		
		
		```
		[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit> withMaterializer​(akka.stream.Materializer materializer)
		```
		
		Runs its inner route with the given alternative `Materializer`.
		 
		
		Parameters:
		`materializer` \- (undocumented)
		Returns:
		(undocumented)
		- #### extractMaterializer
		
		
		
		```
		[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.Tuple1<akka.stream.Materializer>> extractMaterializer()
		```
		
		Extracts the `Materializer` from the [`RequestContext`](../RequestContext.html "interface in akka.http.scaladsl.server").
		 
		
		Returns:
		(undocumented)
		- #### extractActorSystem
		
		
		
		```
		[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.Tuple1<akka.actor.ActorSystem>> extractActorSystem()
		```
		
		Extracts the `ActorSystem` if the available Materializer is an `ActorMaterializer`.
		 Otherwise throws an exception as it won't be able to extract the system from arbitrary materializers.
		 
		
		Returns:
		(undocumented)
		- #### withLog
		
		
		
		```
		[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit> withLog​(akka.event.LoggingAdapter log)
		```
		
		Runs its inner route with the given alternative `LoggingAdapter`.
		 
		
		Parameters:
		`log` \- (undocumented)
		Returns:
		(undocumented)
		- #### extractLog
		
		
		
		```
		[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.Tuple1<akka.event.LoggingAdapter>> extractLog()
		```
		
		Extracts the `LoggingAdapter` from the [`RequestContext`](../RequestContext.html "interface in akka.http.scaladsl.server").
		 
		
		Returns:
		(undocumented)
		- #### withSettings
		
		
		
		```
		[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit> withSettings​([RoutingSettings](../../settings/RoutingSettings.html "class in akka.http.scaladsl.settings") settings)
		```
		
		Runs its inner route with the given alternative `RoutingSettings`.
		 
		
		Parameters:
		`settings` \- (undocumented)
		Returns:
		(undocumented)
		- #### mapSettings
		
		
		
		```
		[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit> mapSettings​(scala.Function1<[RoutingSettings](../../settings/RoutingSettings.html "class in akka.http.scaladsl.settings"),​[RoutingSettings](../../settings/RoutingSettings.html "class in akka.http.scaladsl.settings")> f)
		```
		
		Runs the inner route with settings mapped by the given function.
		 
		
		Parameters:
		`f` \- (undocumented)
		Returns:
		(undocumented)
		- #### extractSettings
		
		
		
		```
		[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.Tuple1<[RoutingSettings](../../settings/RoutingSettings.html "class in akka.http.scaladsl.settings")>> extractSettings()
		```
		
		Extracts the `RoutingSettings` from the [`RequestContext`](../RequestContext.html "interface in akka.http.scaladsl.server").
		 
		
		Returns:
		(undocumented)
		- #### extractParserSettings
		
		
		
		```
		[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.Tuple1<[ParserSettings](../../settings/ParserSettings.html "class in akka.http.scaladsl.settings")>> extractParserSettings()
		```
		
		Extracts the [`ParserSettings`](../../settings/ParserSettings.html "class in akka.http.scaladsl.settings") from the [`RequestContext`](../RequestContext.html "interface in akka.http.scaladsl.server").
		 
		
		Returns:
		(undocumented)
		- #### extractRequestContext
		
		
		
		```
		[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.Tuple1<[RequestContext](../RequestContext.html "interface in akka.http.scaladsl.server")>> extractRequestContext()
		```
		
		Extracts the [`RequestContext`](../RequestContext.html "interface in akka.http.scaladsl.server") itself.
		 
		
		Returns:
		(undocumented)
		- #### extractRequestEntity
		
		
		
		```
		[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.Tuple1<[RequestEntity](../../model/RequestEntity.html "interface in akka.http.scaladsl.model")>> extractRequestEntity()
		```
		
		Extracts the [`RequestEntity`](../../model/RequestEntity.html "interface in akka.http.scaladsl.model") from the [`RequestContext`](../RequestContext.html "interface in akka.http.scaladsl.server").
		 
		
		Returns:
		(undocumented)
		- #### extractDataBytes
		
		
		
		```
		[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.Tuple1<akka.stream.scaladsl.Source<akka.util.ByteString,​java.lang.Object>>> extractDataBytes()
		```
		
		Extracts the entities `dataBytes` `Source` from the [`RequestContext`](../RequestContext.html "interface in akka.http.scaladsl.server").
		 
		
		Returns:
		(undocumented)
		- #### extractStrictEntity
		
		
		
		```
		[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.Tuple1<[HttpEntity.Strict](../../model/HttpEntity.Strict.html "class in akka.http.scaladsl.model")>> extractStrictEntity​(scala.concurrent.duration.FiniteDuration timeout)
		```
		
		WARNING: This will read the entire request entity into memory and effectively disable streaming.
		 
		 To help protect against excessive memory use, the request will be aborted if the request is larger
		 than allowed by the `akka.http.parsing.max-to-strict-bytes` configuration setting.
		 
		
		
		 Converts the HttpEntity from the [`RequestContext`](../RequestContext.html "interface in akka.http.scaladsl.server") into an
		 [`HttpEntity.Strict`](../../model/HttpEntity.Strict.html "class in akka.http.scaladsl.model") and extracts it, or fails the route if unable to drain the
		 entire request body within the timeout.
		 
		
		
		
		Parameters:
		`timeout` \- The directive is failed if the stream isn't completed after the given timeout.
		Returns:
		(undocumented)
		- #### extractStrictEntity
		
		
		
		```
		[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.Tuple1<[HttpEntity.Strict](../../model/HttpEntity.Strict.html "class in akka.http.scaladsl.model")>> extractStrictEntity​(scala.concurrent.duration.FiniteDuration timeout,
		                                                               long maxBytes)
		```
		
		WARNING: This will read the entire request entity into memory and effectively disable streaming.
		 
		 To help protect against excessive memory use, the request will be aborted if the request is larger
		 than allowed by the `akka.http.parsing.max-to-strict-bytes` configuration setting.
		 
		
		
		 Converts the HttpEntity from the [`RequestContext`](../RequestContext.html "interface in akka.http.scaladsl.server") into an
		 [`HttpEntity.Strict`](../../model/HttpEntity.Strict.html "class in akka.http.scaladsl.model") and extracts it, or fails the route if unable to drain the
		 entire request body within the timeout.
		 
		
		
		
		Parameters:
		`timeout` \- The directive is failed if the stream isn't completed after the given timeout.
		`maxBytes` \- (undocumented)
		Returns:
		(undocumented)
		- #### toStrictEntity
		
		
		
		```
		[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit> toStrictEntity​(scala.concurrent.duration.FiniteDuration timeout)
		```
		
		WARNING: This will read the entire request entity into memory and effectively disable streaming.
		 
		 To help protect against excessive memory use, the request will be aborted if the request is larger
		 than allowed by the `akka.http.parsing.max-to-strict-bytes` configuration setting.
		 
		
		
		 Extracts the [`RequestContext`](../RequestContext.html "interface in akka.http.scaladsl.server") itself with the strict HTTP entity,
		 or fails the route if unable to drain the entire request body within the timeout.
		 
		
		
		
		Parameters:
		`timeout` \- The directive is failed if the stream isn't completed after the given timeout.
		Returns:
		(undocumented)
		- #### toStrictEntity
		
		
		
		```
		[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit> toStrictEntity​(scala.concurrent.duration.FiniteDuration timeout,
		                                                  long maxBytes)
		```
		
		WARNING: This will read the entire request entity into memory and effectively disable streaming.
		 
		 To help protect against excessive memory use, the request will be aborted if the request is larger
		 than allowed by the `akka.http.parsing.max-to-strict-bytes` configuration setting.
		 
		
		
		 Extracts the [`RequestContext`](../RequestContext.html "interface in akka.http.scaladsl.server") itself with the strict HTTP entity,
		 or fails the route if unable to drain the entire request body within the timeout.
		 
		
		
		
		Parameters:
		`timeout` \- The directive is failed if the stream isn't completed after the given timeout.
		`maxBytes` \- (undocumented)
		Returns:
		(undocumented)

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/HttpEntity.Strict.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/HttpHeader.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/HttpRequest.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/HttpResponse.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/RequestEntity.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/ResponseEntity.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/Uri.Path.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/Uri.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/Directive.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/Directives$.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/Directives.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/HttpApp.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/Rejection.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/RequestContext.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/RouteResult.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/directives/BasicDirectives$.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/directives/package-summary.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/util/Tuple.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/settings/ParserSettings.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/settings/RoutingSettings.html

---
*Source: [https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/directives/BasicDirectives.html](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/directives/BasicDirectives.html)*