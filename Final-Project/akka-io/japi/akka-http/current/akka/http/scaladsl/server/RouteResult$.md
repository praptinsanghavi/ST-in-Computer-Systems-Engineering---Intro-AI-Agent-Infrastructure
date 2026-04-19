---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:39:14Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/RouteResult$.html
title: RouteResult$
---

# RouteResult$

## Content

Package [akka.http.scaladsl.server](package-summary.html)
## Class RouteResult$

- java.lang.Object
- - [akka.http.scaladsl.server.LowerPriorityRouteResultImplicits](LowerPriorityRouteResultImplicits.html "class in akka.http.scaladsl.server")
	- - akka.http.scaladsl.server.RouteResult$

- ---

```
public class RouteResult$
extends [LowerPriorityRouteResultImplicits](LowerPriorityRouteResultImplicits.html "class in akka.http.scaladsl.server")
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [RouteResult$](RouteResult$.html "class in akka.http.scaladsl.server")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[RouteResult$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) [Deprecated Methods](javascript:show(32);) 
	| Modifier and Type | Method | Description |
	| `akka.stream.scaladsl.Flow<[HttpRequest](../model/HttpRequest.html "class in akka.http.scaladsl.model"),​[HttpResponse](../model/HttpResponse.html "class in akka.http.scaladsl.model"),​akka.NotUsed>` | `[route2HandlerFlow](#route2HandlerFlow(scala.Function1,akka.http.scaladsl.settings.RoutingSettings,akka.http.scaladsl.settings.ParserSettings,akka.stream.Materializer,akka.http.scaladsl.server.RoutingLog,scala.concurrent.ExecutionContext,akka.http.scaladsl.server.RejectionHandler,akka.http.scaladsl.server.ExceptionHandler))​(scala.Function1<[RequestContext](RequestContext.html "interface in akka.http.scaladsl.server"),​scala.concurrent.Future<[RouteResult](RouteResult.html "interface in akka.http.scaladsl.server")>> route,  [RoutingSettings](../settings/RoutingSettings.html "class in akka.http.scaladsl.settings") routingSettings,  [ParserSettings](../settings/ParserSettings.html "class in akka.http.scaladsl.settings") parserSettings,  akka.stream.Materializer materializer,  [RoutingLog](RoutingLog.html "interface in akka.http.scaladsl.server") routingLog,  scala.concurrent.ExecutionContext executionContext,  [RejectionHandler](RejectionHandler.html "interface in akka.http.scaladsl.server") rejectionHandler,  [ExceptionHandler](ExceptionHandler.html "interface in akka.http.scaladsl.server") exceptionHandler)` | Deprecated. Replaced by routeToFlow. |
	| `akka.stream.scaladsl.Flow<[HttpRequest](../model/HttpRequest.html "class in akka.http.scaladsl.model"),​[HttpResponse](../model/HttpResponse.html "class in akka.http.scaladsl.model"),​akka.NotUsed>` | `[routeToFlow](#routeToFlow(scala.Function1,akka.actor.ClassicActorSystemProvider))​(scala.Function1<[RequestContext](RequestContext.html "interface in akka.http.scaladsl.server"),​scala.concurrent.Future<[RouteResult](RouteResult.html "interface in akka.http.scaladsl.server")>> route,  akka.actor.ClassicActorSystemProvider system)` | Turns a `Route` into a server flow. |
	| `scala.Function1<[HttpRequest](../model/HttpRequest.html "class in akka.http.scaladsl.model"),​scala.concurrent.Future<[HttpResponse](../model/HttpResponse.html "class in akka.http.scaladsl.model")>>` | `[routeToFunction](#routeToFunction(scala.Function1,akka.actor.ClassicActorSystemProvider))​(scala.Function1<[RequestContext](RequestContext.html "interface in akka.http.scaladsl.server"),​scala.concurrent.Future<[RouteResult](RouteResult.html "interface in akka.http.scaladsl.server")>> route,  akka.actor.ClassicActorSystemProvider system)` | Turns a `Route` into a server function. |
	
	
		- ### Methods inherited from class akka.http.scaladsl.server.[LowerPriorityRouteResultImplicits](LowerPriorityRouteResultImplicits.html "class in akka.http.scaladsl.server")
		
		
		`[routeToFlowViaMaterializer](LowerPriorityRouteResultImplicits.html#routeToFlowViaMaterializer(scala.Function1,akka.stream.Materializer))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [RouteResult$](RouteResult$.html "class in akka.http.scaladsl.server") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### RouteResult$
		
		
		
		```
		public RouteResult$()
		```

	- ### Method Detail
	
	
	
		- #### routeToFlow
		
		
		
		```
		public akka.stream.scaladsl.Flow<[HttpRequest](../model/HttpRequest.html "class in akka.http.scaladsl.model"),​[HttpResponse](../model/HttpResponse.html "class in akka.http.scaladsl.model"),​akka.NotUsed> routeToFlow​(scala.Function1<[RequestContext](RequestContext.html "interface in akka.http.scaladsl.server"),​scala.concurrent.Future<[RouteResult](RouteResult.html "interface in akka.http.scaladsl.server")>> route,
		                                                                                                akka.actor.ClassicActorSystemProvider system)
		```
		
		Turns a `Route` into a server flow.
		 
		 This implicit conversion is defined here because `Route` is an alias for
		 `RequestContext => Future[RouteResult]`, and the fact that `RouteResult`
		 is in that type means this implicit conversion come into scope whereever
		 a `Route` is given but a `Flow` is expected.
		
		
		
		Parameters:
		`route` \- (undocumented)
		`system` \- (undocumented)
		Returns:
		(undocumented)
		- #### routeToFunction
		
		
		
		```
		public scala.Function1<[HttpRequest](../model/HttpRequest.html "class in akka.http.scaladsl.model"),​scala.concurrent.Future<[HttpResponse](../model/HttpResponse.html "class in akka.http.scaladsl.model")>> routeToFunction​(scala.Function1<[RequestContext](RequestContext.html "interface in akka.http.scaladsl.server"),​scala.concurrent.Future<[RouteResult](RouteResult.html "interface in akka.http.scaladsl.server")>> route,
		                                                                                                akka.actor.ClassicActorSystemProvider system)
		```
		
		Turns a `Route` into a server function.
		 
		 This implicit conversion is defined here because `Route` is an alias for
		 `RequestContext => Future[RouteResult]`, and the fact that `RouteResult`
		 is in that type means this implicit conversion come into scope whereever
		 a `Route` is given but a `Function[HttpRequest, Future[HttpResponse]` is expected.
		
		
		
		Parameters:
		`route` \- (undocumented)
		`system` \- (undocumented)
		Returns:
		(undocumented)
		- #### route2HandlerFlow
		
		
		
		```
		public akka.stream.scaladsl.Flow<[HttpRequest](../model/HttpRequest.html "class in akka.http.scaladsl.model"),​[HttpResponse](../model/HttpResponse.html "class in akka.http.scaladsl.model"),​akka.NotUsed> route2HandlerFlow​(scala.Function1<[RequestContext](RequestContext.html "interface in akka.http.scaladsl.server"),​scala.concurrent.Future<[RouteResult](RouteResult.html "interface in akka.http.scaladsl.server")>> route,
		                                                                                                      [RoutingSettings](../settings/RoutingSettings.html "class in akka.http.scaladsl.settings") routingSettings,
		                                                                                                      [ParserSettings](../settings/ParserSettings.html "class in akka.http.scaladsl.settings") parserSettings,
		                                                                                                      akka.stream.Materializer materializer,
		                                                                                                      [RoutingLog](RoutingLog.html "interface in akka.http.scaladsl.server") routingLog,
		                                                                                                      scala.concurrent.ExecutionContext executionContext,
		                                                                                                      [RejectionHandler](RejectionHandler.html "interface in akka.http.scaladsl.server") rejectionHandler,
		                                                                                                      [ExceptionHandler](ExceptionHandler.html "interface in akka.http.scaladsl.server") exceptionHandler)
		```
		
		Deprecated.
		Replaced by routeToFlow. Since 10\.2\.0\.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpRequest.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpResponse.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/ExceptionHandler.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/LowerPriorityRouteResultImplicits.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/RejectionHandler.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/RequestContext.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/RouteResult$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/RouteResult.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/RoutingLog.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/settings/ParserSettings.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/settings/RoutingSettings.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/RouteResult$.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/RouteResult$.html)*