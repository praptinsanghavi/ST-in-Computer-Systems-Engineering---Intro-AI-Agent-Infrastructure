---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:42:23Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/testkit/RouteTest$.html
title: RouteTest$
---

# RouteTest$

## Content

Package [akka.http.scaladsl.testkit](package-summary.html)
## Class RouteTest$

- java.lang.Object
- - akka.http.scaladsl.testkit.RouteTest$

- ---

```
public class RouteTest$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [RouteTest$](RouteTest$.html "class in akka.http.scaladsl.testkit")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[RouteTest$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `scala.concurrent.Future<[HttpResponse](../model/HttpResponse.html "class in akka.http.scaladsl.model")>` | `[runRouteClientServer](#runRouteClientServer(akka.http.scaladsl.model.HttpRequest,scala.Function1,akka.http.scaladsl.settings.ServerSettings,akka.actor.ActorSystem))​([HttpRequest](../model/HttpRequest.html "class in akka.http.scaladsl.model") request,  scala.Function1<[RequestContext](../server/RequestContext.html "interface in akka.http.scaladsl.server"),​scala.concurrent.Future<[RouteResult](../server/RouteResult.html "interface in akka.http.scaladsl.server")>> route,  [ServerSettings](../settings/ServerSettings.html "class in akka.http.scaladsl.settings") serverSettings,  akka.actor.ActorSystem system)` |  |
	| `scala.Function1<[HttpRequest](../model/HttpRequest.html "class in akka.http.scaladsl.model"),​scala.concurrent.Future<[HttpResponse](../model/HttpResponse.html "class in akka.http.scaladsl.model")>>` | `[toFunctionPassThroughExceptions](#toFunctionPassThroughExceptions(scala.Function1,akka.actor.ClassicActorSystemProvider))​(scala.Function1<[RequestContext](../server/RequestContext.html "interface in akka.http.scaladsl.server"),​scala.concurrent.Future<[RouteResult](../server/RouteResult.html "interface in akka.http.scaladsl.server")>> route,  akka.actor.ClassicActorSystemProvider system)` | Turn the route into a function for testing, but do not handle exceptions in any way, instead, they are bubbled  out as is to the caller. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [RouteTest$](RouteTest$.html "class in akka.http.scaladsl.testkit") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### RouteTest$
		
		
		
		```
		public RouteTest$()
		```

	- ### Method Detail
	
	
	
		- #### toFunctionPassThroughExceptions
		
		
		
		```
		public scala.Function1<[HttpRequest](../model/HttpRequest.html "class in akka.http.scaladsl.model"),​scala.concurrent.Future<[HttpResponse](../model/HttpResponse.html "class in akka.http.scaladsl.model")>> toFunctionPassThroughExceptions​(scala.Function1<[RequestContext](../server/RequestContext.html "interface in akka.http.scaladsl.server"),​scala.concurrent.Future<[RouteResult](../server/RouteResult.html "interface in akka.http.scaladsl.server")>> route,
		                                                                                                                akka.actor.ClassicActorSystemProvider system)
		```
		
		Turn the route into a function for testing, but do not handle exceptions in any way, instead, they are bubbled
		 out as is to the caller.
		
		Parameters:
		`route` \- (undocumented)
		`system` \- (undocumented)
		Returns:
		(undocumented)
		- #### runRouteClientServer
		
		
		
		```
		public scala.concurrent.Future<[HttpResponse](../model/HttpResponse.html "class in akka.http.scaladsl.model")> runRouteClientServer​([HttpRequest](../model/HttpRequest.html "class in akka.http.scaladsl.model") request,
		                                                                  scala.Function1<[RequestContext](../server/RequestContext.html "interface in akka.http.scaladsl.server"),​scala.concurrent.Future<[RouteResult](../server/RouteResult.html "interface in akka.http.scaladsl.server")>> route,
		                                                                  [ServerSettings](../settings/ServerSettings.html "class in akka.http.scaladsl.settings") serverSettings,
		                                                                  akka.actor.ActorSystem system)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpRequest.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpResponse.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/RequestContext.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/RouteResult.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/settings/ServerSettings.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/testkit/RouteTest$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/testkit/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/testkit/RouteTest$.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/testkit/RouteTest$.html)*