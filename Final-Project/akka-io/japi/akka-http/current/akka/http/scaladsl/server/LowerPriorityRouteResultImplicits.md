---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:38:28Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/LowerPriorityRouteResultImplicits.html
title: LowerPriorityRouteResultImplicits
---

# LowerPriorityRouteResultImplicits

## Content

Package [akka.http.scaladsl.server](package-summary.html)
## Class LowerPriorityRouteResultImplicits

- java.lang.Object
- - akka.http.scaladsl.server.LowerPriorityRouteResultImplicits

- Direct Known Subclasses:
`[RouteResult$](RouteResult$.html "class in akka.http.scaladsl.server")`

---

```
public abstract class LowerPriorityRouteResultImplicits
extends java.lang.Object
```

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[LowerPriorityRouteResultImplicits](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) [Deprecated Methods](javascript:show(32);) 
	| Modifier and Type | Method | Description |
	| `akka.stream.scaladsl.Flow<[HttpRequest](../model/HttpRequest.html "class in akka.http.scaladsl.model"),​[HttpResponse](../model/HttpResponse.html "class in akka.http.scaladsl.model"),​akka.NotUsed>` | `[routeToFlowViaMaterializer](#routeToFlowViaMaterializer(scala.Function1,akka.stream.Materializer))​(scala.Function1<[RequestContext](RequestContext.html "interface in akka.http.scaladsl.server"),​scala.concurrent.Future<[RouteResult](RouteResult.html "interface in akka.http.scaladsl.server")>> route,  akka.stream.Materializer materializer)` | Deprecated. make an ActorSystem available implicitly instead. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### LowerPriorityRouteResultImplicits
		
		
		
		```
		public LowerPriorityRouteResultImplicits()
		```

	- ### Method Detail
	
	
	
		- #### routeToFlowViaMaterializer
		
		
		
		```
		public akka.stream.scaladsl.Flow<[HttpRequest](../model/HttpRequest.html "class in akka.http.scaladsl.model"),​[HttpResponse](../model/HttpResponse.html "class in akka.http.scaladsl.model"),​akka.NotUsed> routeToFlowViaMaterializer​(scala.Function1<[RequestContext](RequestContext.html "interface in akka.http.scaladsl.server"),​scala.concurrent.Future<[RouteResult](RouteResult.html "interface in akka.http.scaladsl.server")>> route,
		                                                                                                               akka.stream.Materializer materializer)
		```
		
		Deprecated.
		make an ActorSystem available implicitly instead. Since 10\.2\.0\.
		
		Turns a `Route` into a server flow.
		 
		 This implicit conversion is defined here because `Route` is an alias for
		 `RequestContext => Future[RouteResult]`, and the fact that `RouteResult`
		 is in that type means this implicit conversion come into scope whereever
		 a `Route` is given but a `Flow` is expected.
		
		
		
		Parameters:
		`route` \- (undocumented)
		`materializer` \- (undocumented)
		Returns:
		(undocumented)

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpRequest.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpResponse.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/RequestContext.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/RouteResult$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/RouteResult.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/LowerPriorityRouteResultImplicits.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/LowerPriorityRouteResultImplicits.html)*