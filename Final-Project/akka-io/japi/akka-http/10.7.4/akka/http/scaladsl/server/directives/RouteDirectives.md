---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:09:53Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/directives/RouteDirectives.html
title: RouteDirectives
---

# RouteDirectives

## Content

Package [akka.http.scaladsl.server.directives](package-summary.html)
## Interface RouteDirectives

- All Known Subinterfaces:
`[Directives](../Directives.html "interface in akka.http.scaladsl.server")`

All Known Implementing Classes:
`[Directives$](../Directives$.html "class in akka.http.scaladsl.server")`, `[HttpApp](../HttpApp.html "class in akka.http.scaladsl.server")`, `[RouteDirectives$](RouteDirectives$.html "class in akka.http.scaladsl.server.directives")`

---

```
public interface RouteDirectives
```

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `<T> [StandardRoute](../StandardRoute.html "class in akka.http.scaladsl.server")` | `[complete](#complete(akka.http.scaladsl.model.StatusCode,scala.collection.immutable.Seq,scala.Function0,akka.http.scaladsl.marshalling.Marshaller))​([StatusCode](../../model/StatusCode.html "class in akka.http.scaladsl.model") status,  scala.collection.immutable.Seq<[HttpHeader](../../model/HttpHeader.html "class in akka.http.scaladsl.model")> headers,  scala.Function0<T> v,  [Marshaller](../../marshalling/Marshaller.html "class in akka.http.scaladsl.marshalling")<T,​[RequestEntity](../../model/RequestEntity.html "interface in akka.http.scaladsl.model")> m)` | Completes the request using the given arguments. |
	| `<T> [StandardRoute](../StandardRoute.html "class in akka.http.scaladsl.server")` | `[complete](#complete(akka.http.scaladsl.model.StatusCode,scala.Function0,akka.http.scaladsl.marshalling.Marshaller))​([StatusCode](../../model/StatusCode.html "class in akka.http.scaladsl.model") status,  scala.Function0<T> v,  [Marshaller](../../marshalling/Marshaller.html "class in akka.http.scaladsl.marshalling")<T,​[RequestEntity](../../model/RequestEntity.html "interface in akka.http.scaladsl.model")> m)` | Completes the request using the given arguments. |
	| `[StandardRoute](../StandardRoute.html "class in akka.http.scaladsl.server")` | `[complete](#complete(scala.Function0))​(scala.Function0<[ToResponseMarshallable](../../marshalling/ToResponseMarshallable.html "interface in akka.http.scaladsl.marshalling")> m)` | Completes the request using the given arguments. |
	| `[StandardRoute](../StandardRoute.html "class in akka.http.scaladsl.server")` | `[failWith](#failWith(java.lang.Throwable))​(java.lang.Throwable error)` | Bubbles the given error up the response chain, where it is dealt with by the closest `handleExceptions`  directive and its ExceptionHandler. |
	| `[StandardRoute](../StandardRoute.html "class in akka.http.scaladsl.server")` | `[handle](#handle(scala.Function1))​(scala.Function1<[HttpRequest](../../model/HttpRequest.html "class in akka.http.scaladsl.model"),​scala.concurrent.Future<[HttpResponse](../../model/HttpResponse.html "class in akka.http.scaladsl.model")>> handler)` | Handle the request using a function. |
	| `[StandardRoute](../StandardRoute.html "class in akka.http.scaladsl.server")` | `[handle](#handle(scala.PartialFunction))​(scala.PartialFunction<[HttpRequest](../../model/HttpRequest.html "class in akka.http.scaladsl.model"),​scala.concurrent.Future<[HttpResponse](../../model/HttpResponse.html "class in akka.http.scaladsl.model")>> handler)` | Handle the request using an asynchronous partial function. |
	| `[StandardRoute](../StandardRoute.html "class in akka.http.scaladsl.server")` | `[handle](#handle(scala.PartialFunction,scala.collection.immutable.Seq))​(scala.PartialFunction<[HttpRequest](../../model/HttpRequest.html "class in akka.http.scaladsl.model"),​scala.concurrent.Future<[HttpResponse](../../model/HttpResponse.html "class in akka.http.scaladsl.model")>> handler,  scala.collection.immutable.Seq<[Rejection](../Rejection.html "interface in akka.http.scaladsl.server")> rejections)` | Handle the request using an asynchronous partial function. |
	| `[StandardRoute](../StandardRoute.html "class in akka.http.scaladsl.server")` | `[handleSync](#handleSync(scala.Function1))​(scala.Function1<[HttpRequest](../../model/HttpRequest.html "class in akka.http.scaladsl.model"),​[HttpResponse](../../model/HttpResponse.html "class in akka.http.scaladsl.model")> handler)` | Handle the request using a function. |
	| `[StandardRoute](../StandardRoute.html "class in akka.http.scaladsl.server")` | `[handleSync](#handleSync(scala.PartialFunction))​(scala.PartialFunction<[HttpRequest](../../model/HttpRequest.html "class in akka.http.scaladsl.model"),​[HttpResponse](../../model/HttpResponse.html "class in akka.http.scaladsl.model")> handler)` | Handle the request using a synchronous partial function. |
	| `[StandardRoute](../StandardRoute.html "class in akka.http.scaladsl.server")` | `[handleSync](#handleSync(scala.PartialFunction,scala.collection.immutable.Seq))​(scala.PartialFunction<[HttpRequest](../../model/HttpRequest.html "class in akka.http.scaladsl.model"),​[HttpResponse](../../model/HttpResponse.html "class in akka.http.scaladsl.model")> handler,  scala.collection.immutable.Seq<[Rejection](../Rejection.html "interface in akka.http.scaladsl.server")> rejections)` | Handle the request using a synchronous partial function. |
	| `[StandardRoute](../StandardRoute.html "class in akka.http.scaladsl.server")` | `[redirect](#redirect(akka.http.scaladsl.model.Uri,akka.http.scaladsl.model.StatusCodes.Redirection))​([Uri](../../model/Uri.html "class in akka.http.scaladsl.model") uri,  [StatusCodes.Redirection](../../model/StatusCodes.Redirection.html "class in akka.http.scaladsl.model") redirectionType)` | Completes the request with redirection response of the given type to the given URI. |
	| `[StandardRoute](../StandardRoute.html "class in akka.http.scaladsl.server")` | `[reject](#reject())()` | Rejects the request with an empty set of rejections. |
	| `[StandardRoute](../StandardRoute.html "class in akka.http.scaladsl.server")` | `[reject](#reject(scala.collection.immutable.Seq))​(scala.collection.immutable.Seq<[Rejection](../Rejection.html "interface in akka.http.scaladsl.server")> rejections)` | Rejects the request with the given rejections. |

- - ### Method Detail
	
	
	
		- #### reject
		
		
		
		```
		[StandardRoute](../StandardRoute.html "class in akka.http.scaladsl.server") reject()
		```
		
		Rejects the request with an empty set of rejections.
		 
		
		Returns:
		(undocumented)
		- #### reject
		
		
		
		```
		[StandardRoute](../StandardRoute.html "class in akka.http.scaladsl.server") reject​(scala.collection.immutable.Seq<[Rejection](../Rejection.html "interface in akka.http.scaladsl.server")> rejections)
		```
		
		Rejects the request with the given rejections.
		 
		
		Parameters:
		`rejections` \- (undocumented)
		Returns:
		(undocumented)
		- #### redirect
		
		
		
		```
		[StandardRoute](../StandardRoute.html "class in akka.http.scaladsl.server") redirect​([Uri](../../model/Uri.html "class in akka.http.scaladsl.model") uri,
		                       [StatusCodes.Redirection](../../model/StatusCodes.Redirection.html "class in akka.http.scaladsl.model") redirectionType)
		```
		
		Completes the request with redirection response of the given type to the given URI.
		 
		
		Parameters:
		`uri` \- (undocumented)
		`redirectionType` \- (undocumented)
		Returns:
		(undocumented)
		- #### complete
		
		
		
		```
		[StandardRoute](../StandardRoute.html "class in akka.http.scaladsl.server") complete​(scala.Function0<[ToResponseMarshallable](../../marshalling/ToResponseMarshallable.html "interface in akka.http.scaladsl.marshalling")> m)
		```
		
		Completes the request using the given arguments.
		 
		
		Parameters:
		`m` \- (undocumented)
		Returns:
		(undocumented)
		- #### complete
		
		
		
		```
		<T> [StandardRoute](../StandardRoute.html "class in akka.http.scaladsl.server") complete​([StatusCode](../../model/StatusCode.html "class in akka.http.scaladsl.model") status,
		                           scala.Function0<T> v,
		                           [Marshaller](../../marshalling/Marshaller.html "class in akka.http.scaladsl.marshalling")<T,​[RequestEntity](../../model/RequestEntity.html "interface in akka.http.scaladsl.model")> m)
		```
		
		Completes the request using the given arguments.
		 
		
		Parameters:
		`status` \- (undocumented)
		`v` \- (undocumented)
		`m` \- (undocumented)
		Returns:
		(undocumented)
		- #### complete
		
		
		
		```
		<T> [StandardRoute](../StandardRoute.html "class in akka.http.scaladsl.server") complete​([StatusCode](../../model/StatusCode.html "class in akka.http.scaladsl.model") status,
		                           scala.collection.immutable.Seq<[HttpHeader](../../model/HttpHeader.html "class in akka.http.scaladsl.model")> headers,
		                           scala.Function0<T> v,
		                           [Marshaller](../../marshalling/Marshaller.html "class in akka.http.scaladsl.marshalling")<T,​[RequestEntity](../../model/RequestEntity.html "interface in akka.http.scaladsl.model")> m)
		```
		
		Completes the request using the given arguments.
		 
		
		Parameters:
		`status` \- (undocumented)
		`headers` \- (undocumented)
		`v` \- (undocumented)
		`m` \- (undocumented)
		Returns:
		(undocumented)
		- #### failWith
		
		
		
		```
		[StandardRoute](../StandardRoute.html "class in akka.http.scaladsl.server") failWith​(java.lang.Throwable error)
		```
		
		Bubbles the given error up the response chain, where it is dealt with by the closest `handleExceptions`
		 directive and its ExceptionHandler.
		 
		
		Parameters:
		`error` \- (undocumented)
		Returns:
		(undocumented)
		- #### handle
		
		
		
		```
		[StandardRoute](../StandardRoute.html "class in akka.http.scaladsl.server") handle​(scala.Function1<[HttpRequest](../../model/HttpRequest.html "class in akka.http.scaladsl.model"),​scala.concurrent.Future<[HttpResponse](../../model/HttpResponse.html "class in akka.http.scaladsl.model")>> handler)
		```
		
		Handle the request using a function.
		 
		
		Parameters:
		`handler` \- (undocumented)
		Returns:
		(undocumented)
		- #### handleSync
		
		
		
		```
		[StandardRoute](../StandardRoute.html "class in akka.http.scaladsl.server") handleSync​(scala.Function1<[HttpRequest](../../model/HttpRequest.html "class in akka.http.scaladsl.model"),​[HttpResponse](../../model/HttpResponse.html "class in akka.http.scaladsl.model")> handler)
		```
		
		Handle the request using a function.
		 
		
		Parameters:
		`handler` \- (undocumented)
		Returns:
		(undocumented)
		- #### handle
		
		
		
		```
		[StandardRoute](../StandardRoute.html "class in akka.http.scaladsl.server") handle​(scala.PartialFunction<[HttpRequest](../../model/HttpRequest.html "class in akka.http.scaladsl.model"),​scala.concurrent.Future<[HttpResponse](../../model/HttpResponse.html "class in akka.http.scaladsl.model")>> handler)
		```
		
		Handle the request using an asynchronous partial function.
		 
		 This directive can be used to include external components request processing components defined as PartialFunction
		 (like those provided by akka\-grpc) into a routing tree defined as routes.
		 
		
		
		 When the partial function is not defined for a request, the request is rejected with an empty list of rejections
		 which is equivalent to a "Not Found" rejection.
		 
		
		
		
		Parameters:
		`handler` \- (undocumented)
		Returns:
		(undocumented)
		- #### handle
		
		
		
		```
		[StandardRoute](../StandardRoute.html "class in akka.http.scaladsl.server") handle​(scala.PartialFunction<[HttpRequest](../../model/HttpRequest.html "class in akka.http.scaladsl.model"),​scala.concurrent.Future<[HttpResponse](../../model/HttpResponse.html "class in akka.http.scaladsl.model")>> handler,
		                     scala.collection.immutable.Seq<[Rejection](../Rejection.html "interface in akka.http.scaladsl.server")> rejections)
		```
		
		Handle the request using an asynchronous partial function.
		 
		 This directive can be used to include external components request processing components defined as PartialFunction
		 (like those provided by akka\-grpc) into a routing tree defined as routes.
		 
		
		
		
		Parameters:
		`rejections` \- The list of rejections to reject with if the handler is not defined for a request.
		 
		`handler` \- (undocumented)
		Returns:
		(undocumented)
		- #### handleSync
		
		
		
		```
		[StandardRoute](../StandardRoute.html "class in akka.http.scaladsl.server") handleSync​(scala.PartialFunction<[HttpRequest](../../model/HttpRequest.html "class in akka.http.scaladsl.model"),​[HttpResponse](../../model/HttpResponse.html "class in akka.http.scaladsl.model")> handler)
		```
		
		Handle the request using a synchronous partial function.
		 
		 This directive can be used to include external components request processing components defined as PartialFunction
		 (like those provided by akka\-grpc) into a routing tree defined as routes.
		 
		
		
		 When the partial function is not defined for a request, the request is rejected with an empty list of rejections
		 which is equivalent to a "Not Found" rejection.
		 
		
		
		
		Parameters:
		`handler` \- (undocumented)
		Returns:
		(undocumented)
		- #### handleSync
		
		
		
		```
		[StandardRoute](../StandardRoute.html "class in akka.http.scaladsl.server") handleSync​(scala.PartialFunction<[HttpRequest](../../model/HttpRequest.html "class in akka.http.scaladsl.model"),​[HttpResponse](../../model/HttpResponse.html "class in akka.http.scaladsl.model")> handler,
		                         scala.collection.immutable.Seq<[Rejection](../Rejection.html "interface in akka.http.scaladsl.server")> rejections)
		```
		
		Handle the request using a synchronous partial function.
		 
		 This directive can be used to include external components request processing components defined as PartialFunction
		 (like those provided by akka\-grpc) into a routing tree defined as routes.
		 
		
		
		
		Parameters:
		`rejections` \- The list of rejections to reject with if the handler is not defined for a request.
		 
		`handler` \- (undocumented)
		Returns:
		(undocumented)

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/marshalling/Marshaller.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/marshalling/ToResponseMarshallable.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/HttpHeader.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/HttpRequest.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/HttpResponse.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/RequestEntity.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/StatusCode.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/StatusCodes.Redirection.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/Uri.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/Directives$.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/Directives.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/HttpApp.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/Rejection.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/StandardRoute.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/directives/RouteDirectives$.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/directives/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/directives/RouteDirectives.html](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/directives/RouteDirectives.html)*