---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:39:09Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/Route$.html
title: Route$
---

# Route$

## Content

Package [akka.http.scaladsl.server](package-summary.html)
## Class Route$

- java.lang.Object
- - akka.http.scaladsl.server.Route$

- ---

```
public class Route$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Route$](Route$.html "class in akka.http.scaladsl.server")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Route$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) [Deprecated Methods](javascript:show(32);) 
	| Modifier and Type | Method | Description |
	| `scala.Function1<[RequestContext](RequestContext.html "interface in akka.http.scaladsl.server"),​scala.concurrent.Future<[RouteResult](RouteResult.html "interface in akka.http.scaladsl.server")>>` | `[apply](#apply(scala.Function1))​(scala.Function1<[RequestContext](RequestContext.html "interface in akka.http.scaladsl.server"),​scala.concurrent.Future<[RouteResult](RouteResult.html "interface in akka.http.scaladsl.server")>> f)` | Helper for constructing a Route from a function literal. |
	| `scala.Function1<[HttpRequest](../model/HttpRequest.html "class in akka.http.scaladsl.model"),​scala.concurrent.Future<[HttpResponse](../model/HttpResponse.html "class in akka.http.scaladsl.model")>>` | `[asyncHandler](#asyncHandler(scala.Function1,akka.http.scaladsl.settings.RoutingSettings,akka.http.scaladsl.settings.ParserSettings,akka.stream.Materializer,akka.http.scaladsl.server.RoutingLog,scala.concurrent.ExecutionContextExecutor,akka.http.scaladsl.server.RejectionHandler,akka.http.scaladsl.server.ExceptionHandler))​(scala.Function1<[RequestContext](RequestContext.html "interface in akka.http.scaladsl.server"),​scala.concurrent.Future<[RouteResult](RouteResult.html "interface in akka.http.scaladsl.server")>> route,  [RoutingSettings](../settings/RoutingSettings.html "class in akka.http.scaladsl.settings") routingSettings,  [ParserSettings](../settings/ParserSettings.html "class in akka.http.scaladsl.settings") parserSettings,  akka.stream.Materializer materializer,  [RoutingLog](RoutingLog.html "interface in akka.http.scaladsl.server") routingLog,  scala.concurrent.ExecutionContextExecutor executionContext,  [RejectionHandler](RejectionHandler.html "interface in akka.http.scaladsl.server") rejectionHandler,  [ExceptionHandler](ExceptionHandler.html "interface in akka.http.scaladsl.server") exceptionHandler)` | Deprecated. Use \`toFunction\` instead, which only requires an implicit ActorSystem and no rejection/exception handlers. |
	| `scala.Function1<[HttpRequest](../model/HttpRequest.html "class in akka.http.scaladsl.model"),​scala.concurrent.Future<[HttpResponse](../model/HttpResponse.html "class in akka.http.scaladsl.model")>>` | `[createAsyncHandler](#createAsyncHandler(scala.Function1,akka.http.scaladsl.server.RoutingLog,akka.http.scaladsl.settings.RoutingSettings,akka.http.scaladsl.settings.ParserSettings,scala.concurrent.ExecutionContextExecutor,akka.stream.Materializer))​(scala.Function1<[RequestContext](RequestContext.html "interface in akka.http.scaladsl.server"),​scala.concurrent.Future<[RouteResult](RouteResult.html "interface in akka.http.scaladsl.server")>> sealedRoute,  [RoutingLog](RoutingLog.html "interface in akka.http.scaladsl.server") routingLog,  [RoutingSettings](../settings/RoutingSettings.html "class in akka.http.scaladsl.settings") routingSettings,  [ParserSettings](../settings/ParserSettings.html "class in akka.http.scaladsl.settings") parserSettings,  scala.concurrent.ExecutionContextExecutor ec,  akka.stream.Materializer mat)` |  |
	| `akka.stream.scaladsl.Flow<[HttpRequest](../model/HttpRequest.html "class in akka.http.scaladsl.model"),​[HttpResponse](../model/HttpResponse.html "class in akka.http.scaladsl.model"),​akka.NotUsed>` | `[handlerFlow](#handlerFlow(scala.Function1,akka.http.scaladsl.settings.RoutingSettings,akka.http.scaladsl.settings.ParserSettings,akka.stream.Materializer,akka.http.scaladsl.server.RoutingLog,scala.concurrent.ExecutionContextExecutor,akka.http.scaladsl.server.RejectionHandler,akka.http.scaladsl.server.ExceptionHandler))​(scala.Function1<[RequestContext](RequestContext.html "interface in akka.http.scaladsl.server"),​scala.concurrent.Future<[RouteResult](RouteResult.html "interface in akka.http.scaladsl.server")>> route,  [RoutingSettings](../settings/RoutingSettings.html "class in akka.http.scaladsl.settings") routingSettings,  [ParserSettings](../settings/ParserSettings.html "class in akka.http.scaladsl.settings") parserSettings,  akka.stream.Materializer materializer,  [RoutingLog](RoutingLog.html "interface in akka.http.scaladsl.server") routingLog,  scala.concurrent.ExecutionContextExecutor executionContext,  [RejectionHandler](RejectionHandler.html "interface in akka.http.scaladsl.server") rejectionHandler,  [ExceptionHandler](ExceptionHandler.html "interface in akka.http.scaladsl.server") exceptionHandler)` | Deprecated. Replaced by \`toFlow\` that takes an implicit ActorSystem. |
	| `scala.Function1<[RequestContext](RequestContext.html "interface in akka.http.scaladsl.server"),​scala.concurrent.Future<[RouteResult](RouteResult.html "interface in akka.http.scaladsl.server")>>` | `[seal](#seal(scala.Function1,akka.http.scaladsl.settings.RoutingSettings,akka.http.scaladsl.settings.ParserSettings,akka.http.scaladsl.server.RejectionHandler,akka.http.scaladsl.server.ExceptionHandler))​(scala.Function1<[RequestContext](RequestContext.html "interface in akka.http.scaladsl.server"),​scala.concurrent.Future<[RouteResult](RouteResult.html "interface in akka.http.scaladsl.server")>> route,  [RoutingSettings](../settings/RoutingSettings.html "class in akka.http.scaladsl.settings") routingSettings,  [ParserSettings](../settings/ParserSettings.html "class in akka.http.scaladsl.settings") parserSettings,  [RejectionHandler](RejectionHandler.html "interface in akka.http.scaladsl.server") rejectionHandler,  [ExceptionHandler](ExceptionHandler.html "interface in akka.http.scaladsl.server") exceptionHandler)` | "Seals" a route by wrapping it with default exception handling and rejection conversion. |
	| `akka.stream.scaladsl.Flow<[HttpRequest](../model/HttpRequest.html "class in akka.http.scaladsl.model"),​[HttpResponse](../model/HttpResponse.html "class in akka.http.scaladsl.model"),​akka.NotUsed>` | `[toFlow](#toFlow(scala.Function1,akka.actor.ClassicActorSystemProvider))​(scala.Function1<[RequestContext](RequestContext.html "interface in akka.http.scaladsl.server"),​scala.concurrent.Future<[RouteResult](RouteResult.html "interface in akka.http.scaladsl.server")>> route,  akka.actor.ClassicActorSystemProvider system)` | Turns a `Route` into a server flow. |
	| `scala.Function1<[HttpRequest](../model/HttpRequest.html "class in akka.http.scaladsl.model"),​scala.concurrent.Future<[HttpResponse](../model/HttpResponse.html "class in akka.http.scaladsl.model")>>` | `[toFunction](#toFunction(scala.Function1,akka.actor.ClassicActorSystemProvider))​(scala.Function1<[RequestContext](RequestContext.html "interface in akka.http.scaladsl.server"),​scala.concurrent.Future<[RouteResult](RouteResult.html "interface in akka.http.scaladsl.server")>> route,  akka.actor.ClassicActorSystemProvider system)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [Route$](Route$.html "class in akka.http.scaladsl.server") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Route$
		
		
		
		```
		public Route$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public scala.Function1<[RequestContext](RequestContext.html "interface in akka.http.scaladsl.server"),​scala.concurrent.Future<[RouteResult](RouteResult.html "interface in akka.http.scaladsl.server")>> apply​(scala.Function1<[RequestContext](RequestContext.html "interface in akka.http.scaladsl.server"),​scala.concurrent.Future<[RouteResult](RouteResult.html "interface in akka.http.scaladsl.server")>> f)
		```
		
		Helper for constructing a Route from a function literal.
		
		Parameters:
		`f` \- (undocumented)
		Returns:
		(undocumented)
		- #### seal
		
		
		
		```
		public scala.Function1<[RequestContext](RequestContext.html "interface in akka.http.scaladsl.server"),​scala.concurrent.Future<[RouteResult](RouteResult.html "interface in akka.http.scaladsl.server")>> seal​(scala.Function1<[RequestContext](RequestContext.html "interface in akka.http.scaladsl.server"),​scala.concurrent.Future<[RouteResult](RouteResult.html "interface in akka.http.scaladsl.server")>> route,
		                                                                                       [RoutingSettings](../settings/RoutingSettings.html "class in akka.http.scaladsl.settings") routingSettings,
		                                                                                       [ParserSettings](../settings/ParserSettings.html "class in akka.http.scaladsl.settings") parserSettings,
		                                                                                       [RejectionHandler](RejectionHandler.html "interface in akka.http.scaladsl.server") rejectionHandler,
		                                                                                       [ExceptionHandler](ExceptionHandler.html "interface in akka.http.scaladsl.server") exceptionHandler)
		```
		
		"Seals" a route by wrapping it with default exception handling and rejection conversion.
		 
		 A sealed route has these properties:
		 \- The result of the route will always be a complete response, i.e. the result of the future is a
		 Success(RouteResult.Complete(response)), never a failed future and never a rejected route. These
		 will be already be handled using the implicitly given [`RejectionHandler`](RejectionHandler.html "interface in akka.http.scaladsl.server") and [`ExceptionHandler`](ExceptionHandler.html "interface in akka.http.scaladsl.server") (or
		 the default handlers if none are given or can be found implicitly).
		 \- Consequently, no route alternatives will be tried that were combined with this route
		 using the \~ on routes or the {@link Directive.\|} operator on directives.
		
		
		
		Parameters:
		`route` \- (undocumented)
		`routingSettings` \- (undocumented)
		`parserSettings` \- (undocumented)
		`rejectionHandler` \- (undocumented)
		`exceptionHandler` \- (undocumented)
		Returns:
		(undocumented)
		- #### toFlow
		
		
		
		```
		public akka.stream.scaladsl.Flow<[HttpRequest](../model/HttpRequest.html "class in akka.http.scaladsl.model"),​[HttpResponse](../model/HttpResponse.html "class in akka.http.scaladsl.model"),​akka.NotUsed> toFlow​(scala.Function1<[RequestContext](RequestContext.html "interface in akka.http.scaladsl.server"),​scala.concurrent.Future<[RouteResult](RouteResult.html "interface in akka.http.scaladsl.server")>> route,
		                                                                                           akka.actor.ClassicActorSystemProvider system)
		```
		
		Turns a `Route` into a server flow.
		 
		 This conversion is also implicitly available wherever a `Route` is used through `RouteResult#routeToFlow`.
		
		
		
		Parameters:
		`route` \- (undocumented)
		`system` \- (undocumented)
		Returns:
		(undocumented)
		- #### handlerFlow
		
		
		
		```
		public akka.stream.scaladsl.Flow<[HttpRequest](../model/HttpRequest.html "class in akka.http.scaladsl.model"),​[HttpResponse](../model/HttpResponse.html "class in akka.http.scaladsl.model"),​akka.NotUsed> handlerFlow​(scala.Function1<[RequestContext](RequestContext.html "interface in akka.http.scaladsl.server"),​scala.concurrent.Future<[RouteResult](RouteResult.html "interface in akka.http.scaladsl.server")>> route,
		                                                                                                [RoutingSettings](../settings/RoutingSettings.html "class in akka.http.scaladsl.settings") routingSettings,
		                                                                                                [ParserSettings](../settings/ParserSettings.html "class in akka.http.scaladsl.settings") parserSettings,
		                                                                                                akka.stream.Materializer materializer,
		                                                                                                [RoutingLog](RoutingLog.html "interface in akka.http.scaladsl.server") routingLog,
		                                                                                                scala.concurrent.ExecutionContextExecutor executionContext,
		                                                                                                [RejectionHandler](RejectionHandler.html "interface in akka.http.scaladsl.server") rejectionHandler,
		                                                                                                [ExceptionHandler](ExceptionHandler.html "interface in akka.http.scaladsl.server") exceptionHandler)
		```
		
		Deprecated.
		Replaced by \`toFlow\` that takes an implicit ActorSystem. Since 10\.2\.0\.
		
		Turns a `Route` into a server flow.
		
		Parameters:
		`route` \- (undocumented)
		`routingSettings` \- (undocumented)
		`parserSettings` \- (undocumented)
		`materializer` \- (undocumented)
		`routingLog` \- (undocumented)
		`executionContext` \- (undocumented)
		`rejectionHandler` \- (undocumented)
		`exceptionHandler` \- (undocumented)
		Returns:
		(undocumented)
		- #### toFunction
		
		
		
		```
		public scala.Function1<[HttpRequest](../model/HttpRequest.html "class in akka.http.scaladsl.model"),​scala.concurrent.Future<[HttpResponse](../model/HttpResponse.html "class in akka.http.scaladsl.model")>> toFunction​(scala.Function1<[RequestContext](RequestContext.html "interface in akka.http.scaladsl.server"),​scala.concurrent.Future<[RouteResult](RouteResult.html "interface in akka.http.scaladsl.server")>> route,
		                                                                                           akka.actor.ClassicActorSystemProvider system)
		```
		- #### asyncHandler
		
		
		
		```
		public scala.Function1<[HttpRequest](../model/HttpRequest.html "class in akka.http.scaladsl.model"),​scala.concurrent.Future<[HttpResponse](../model/HttpResponse.html "class in akka.http.scaladsl.model")>> asyncHandler​(scala.Function1<[RequestContext](RequestContext.html "interface in akka.http.scaladsl.server"),​scala.concurrent.Future<[RouteResult](RouteResult.html "interface in akka.http.scaladsl.server")>> route,
		                                                                                             [RoutingSettings](../settings/RoutingSettings.html "class in akka.http.scaladsl.settings") routingSettings,
		                                                                                             [ParserSettings](../settings/ParserSettings.html "class in akka.http.scaladsl.settings") parserSettings,
		                                                                                             akka.stream.Materializer materializer,
		                                                                                             [RoutingLog](RoutingLog.html "interface in akka.http.scaladsl.server") routingLog,
		                                                                                             scala.concurrent.ExecutionContextExecutor executionContext,
		                                                                                             [RejectionHandler](RejectionHandler.html "interface in akka.http.scaladsl.server") rejectionHandler,
		                                                                                             [ExceptionHandler](ExceptionHandler.html "interface in akka.http.scaladsl.server") exceptionHandler)
		```
		
		Deprecated.
		Use \`toFunction\` instead, which only requires an implicit ActorSystem and no rejection/exception handlers. Use directives to specify custom exceptions or rejection handlers. Since 10\.2\.0\.
		
		Turns a `Route` into an async handler function.
		
		Parameters:
		`route` \- (undocumented)
		`routingSettings` \- (undocumented)
		`parserSettings` \- (undocumented)
		`materializer` \- (undocumented)
		`routingLog` \- (undocumented)
		`executionContext` \- (undocumented)
		`rejectionHandler` \- (undocumented)
		`exceptionHandler` \- (undocumented)
		Returns:
		(undocumented)
		- #### createAsyncHandler
		
		
		
		```
		public scala.Function1<[HttpRequest](../model/HttpRequest.html "class in akka.http.scaladsl.model"),​scala.concurrent.Future<[HttpResponse](../model/HttpResponse.html "class in akka.http.scaladsl.model")>> createAsyncHandler​(scala.Function1<[RequestContext](RequestContext.html "interface in akka.http.scaladsl.server"),​scala.concurrent.Future<[RouteResult](RouteResult.html "interface in akka.http.scaladsl.server")>> sealedRoute,
		                                                                                                   [RoutingLog](RoutingLog.html "interface in akka.http.scaladsl.server") routingLog,
		                                                                                                   [RoutingSettings](../settings/RoutingSettings.html "class in akka.http.scaladsl.settings") routingSettings,
		                                                                                                   [ParserSettings](../settings/ParserSettings.html "class in akka.http.scaladsl.settings") parserSettings,
		                                                                                                   scala.concurrent.ExecutionContextExecutor ec,
		                                                                                                   akka.stream.Materializer mat)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpRequest.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpResponse.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/ExceptionHandler.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/RejectionHandler.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/RequestContext.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/Route$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/RouteResult.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/RoutingLog.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/settings/ParserSettings.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/settings/RoutingSettings.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/Route$.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/Route$.html)*