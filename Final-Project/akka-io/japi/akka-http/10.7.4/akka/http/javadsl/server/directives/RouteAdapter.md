---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:05:41Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/directives/RouteAdapter.html
title: RouteAdapter
---

# RouteAdapter

## Content

Package [akka.http.javadsl.server.directives](package-summary.html)
## Class RouteAdapter

- java.lang.Object
- - akka.http.javadsl.server.directives.RouteAdapter

- All Implemented Interfaces:
`[HandlerProvider](../../HandlerProvider.html "interface in akka.http.javadsl")`, `[Route](../Route.html "interface in akka.http.javadsl.server")`

---

```
public final class RouteAdapter
extends java.lang.Object
implements [Route](../Route.html "interface in akka.http.javadsl.server")
```

INTERNAL API

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[RouteAdapter](#%3Cinit%3E(scala.Function1))​(scala.Function1<[RequestContext](../../../scaladsl/server/RequestContext.html "interface in akka.http.scaladsl.server"),​scala.concurrent.Future<[RouteResult](../../../scaladsl/server/RouteResult.html "interface in akka.http.scaladsl.server")>> delegate)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [RouteAdapter](RouteAdapter.html "class in akka.http.javadsl.server.directives")` | `[apply](#apply(scala.Function1))​(scala.Function1<[RequestContext](../../../scaladsl/server/RequestContext.html "interface in akka.http.scaladsl.server"),​scala.concurrent.Future<[RouteResult](../../../scaladsl/server/RouteResult.html "interface in akka.http.scaladsl.server")>> delegate)` |  |
	| `static [Route](../Route.html "interface in akka.http.javadsl.server")` | `[asJava](#asJava(scala.Function1))​(scala.Function1<[RequestContext](../../../scaladsl/server/RequestContext.html "interface in akka.http.scaladsl.server"),​scala.concurrent.Future<[RouteResult](../../../scaladsl/server/RouteResult.html "interface in akka.http.scaladsl.server")>> delegate)` | Java DSL: Adapt an existing ScalaDSL Route as an Java DSL Route |
	| `scala.Function1<[RequestContext](../../../scaladsl/server/RequestContext.html "interface in akka.http.scaladsl.server"),​scala.concurrent.Future<[RouteResult](../../../scaladsl/server/RouteResult.html "interface in akka.http.scaladsl.server")>>` | `[delegate](#delegate())()` | INTERNAL API |
	| `akka.stream.javadsl.Flow<[HttpRequest](../../model/HttpRequest.html "class in akka.http.javadsl.model"),​[HttpResponse](../../model/HttpResponse.html "class in akka.http.javadsl.model"),​akka.NotUsed>` | `[flow](#flow(akka.actor.ActorSystem,akka.stream.Materializer))​(akka.actor.ActorSystem system,  akka.stream.Materializer materializer)` |  |
	| `akka.japi.function.Function<[HttpRequest](../../model/HttpRequest.html "class in akka.http.javadsl.model"),​java.util.concurrent.CompletionStage<[HttpResponse](../../model/HttpResponse.html "class in akka.http.javadsl.model")>>` | `[handler](#handler(akka.actor.ClassicActorSystemProvider))​(akka.actor.ClassicActorSystemProvider system)` |  |
	| `[Route](../Route.html "interface in akka.http.javadsl.server")` | `[orElse](#orElse(akka.http.javadsl.server.Route))​([Route](../Route.html "interface in akka.http.javadsl.server") alternative)` |  |
	| `[Route](../Route.html "interface in akka.http.javadsl.server")` | `[seal](#seal())()` | Seals a route by wrapping it with default exception handling and rejection conversion. |
	| `[Route](../Route.html "interface in akka.http.javadsl.server")` | `[seal](#seal(akka.http.javadsl.server.RejectionHandler,akka.http.javadsl.server.ExceptionHandler))​([RejectionHandler](../RejectionHandler.html "class in akka.http.javadsl.server") rejectionHandler,  [ExceptionHandler](../ExceptionHandler.html "class in akka.http.javadsl.server") exceptionHandler)` | Seals a route by wrapping it with explicit exception handling and rejection conversion. |
	| `java.lang.String` | `[toString](#toString())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface akka.http.javadsl.server.[Route](../Route.html "interface in akka.http.javadsl.server")
		
		
		`[asScala](../Route.html#asScala()), [flow](../Route.html#flow(akka.actor.ClassicActorSystemProvider)), [function](../Route.html#function(akka.actor.ClassicActorSystemProvider))`

- - ### Constructor Detail
	
	
	
		- #### RouteAdapter
		
		
		
		```
		public RouteAdapter​(scala.Function1<[RequestContext](../../../scaladsl/server/RequestContext.html "interface in akka.http.scaladsl.server"),​scala.concurrent.Future<[RouteResult](../../../scaladsl/server/RouteResult.html "interface in akka.http.scaladsl.server")>> delegate)
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static [RouteAdapter](RouteAdapter.html "class in akka.http.javadsl.server.directives") apply​(scala.Function1<[RequestContext](../../../scaladsl/server/RequestContext.html "interface in akka.http.scaladsl.server"),​scala.concurrent.Future<[RouteResult](../../../scaladsl/server/RouteResult.html "interface in akka.http.scaladsl.server")>> delegate)
		```
		- #### asJava
		
		
		
		```
		public static [Route](../Route.html "interface in akka.http.javadsl.server") asJava​(scala.Function1<[RequestContext](../../../scaladsl/server/RequestContext.html "interface in akka.http.scaladsl.server"),​scala.concurrent.Future<[RouteResult](../../../scaladsl/server/RouteResult.html "interface in akka.http.scaladsl.server")>> delegate)
		```
		
		Java DSL: Adapt an existing ScalaDSL Route as an Java DSL Route
		- #### delegate
		
		
		
		```
		public scala.Function1<[RequestContext](../../../scaladsl/server/RequestContext.html "interface in akka.http.scaladsl.server"),​scala.concurrent.Future<[RouteResult](../../../scaladsl/server/RouteResult.html "interface in akka.http.scaladsl.server")>> delegate()
		```
		
		Description copied from interface: `[Route](../Route.html#delegate())`
		INTERNAL API
		
		Specified by:
		`[delegate](../Route.html#delegate())` in interface `[Route](../Route.html "interface in akka.http.javadsl.server")`
		- #### flow
		
		
		
		```
		public akka.stream.javadsl.Flow<[HttpRequest](../../model/HttpRequest.html "class in akka.http.javadsl.model"),​[HttpResponse](../../model/HttpResponse.html "class in akka.http.javadsl.model"),​akka.NotUsed> flow​(akka.actor.ActorSystem system,
		                                                                                        akka.stream.Materializer materializer)
		```
		
		
		Specified by:
		`[flow](../Route.html#flow(akka.actor.ActorSystem,akka.stream.Materializer))` in interface `[Route](../Route.html "interface in akka.http.javadsl.server")`
		- #### handler
		
		
		
		```
		public akka.japi.function.Function<[HttpRequest](../../model/HttpRequest.html "class in akka.http.javadsl.model"),​java.util.concurrent.CompletionStage<[HttpResponse](../../model/HttpResponse.html "class in akka.http.javadsl.model")>> handler​(akka.actor.ClassicActorSystemProvider system)
		```
		
		
		Specified by:
		`[handler](../../HandlerProvider.html#handler(akka.actor.ClassicActorSystemProvider))` in interface `[HandlerProvider](../../HandlerProvider.html "interface in akka.http.javadsl")`
		Specified by:
		`[handler](../Route.html#handler(akka.actor.ClassicActorSystemProvider))` in interface `[Route](../Route.html "interface in akka.http.javadsl.server")`
		- #### orElse
		
		
		
		```
		public [Route](../Route.html "interface in akka.http.javadsl.server") orElse​([Route](../Route.html "interface in akka.http.javadsl.server") alternative)
		```
		
		
		Specified by:
		`[orElse](../Route.html#orElse(akka.http.javadsl.server.Route))` in interface `[Route](../Route.html "interface in akka.http.javadsl.server")`
		- #### seal
		
		
		
		```
		public [Route](../Route.html "interface in akka.http.javadsl.server") seal()
		```
		
		Description copied from interface: `[Route](../Route.html#seal())`
		Seals a route by wrapping it with default exception handling and rejection conversion.
		 
		 A sealed route has these properties:
		 \- The result of the route will always be a complete response, i.e. the result of the future is a
		 `Success(RouteResult.Complete(response))`, never a failed future and never a rejected route. These
		 will be already be handled using the default [`RejectionHandler`](../RejectionHandler.html "class in akka.http.javadsl.server") and [`ExceptionHandler`](../ExceptionHandler.html "class in akka.http.javadsl.server").
		 \- Consequently, no route alternatives will be tried that were combined with this route.
		
		
		
		Specified by:
		`[seal](../Route.html#seal())` in interface `[Route](../Route.html "interface in akka.http.javadsl.server")`
		Returns:
		(undocumented)
		- #### seal
		
		
		
		```
		public [Route](../Route.html "interface in akka.http.javadsl.server") seal​([RejectionHandler](../RejectionHandler.html "class in akka.http.javadsl.server") rejectionHandler,
		                  [ExceptionHandler](../ExceptionHandler.html "class in akka.http.javadsl.server") exceptionHandler)
		```
		
		Description copied from interface: `[Route](../Route.html#seal(akka.http.javadsl.server.RejectionHandler,akka.http.javadsl.server.ExceptionHandler))`
		Seals a route by wrapping it with explicit exception handling and rejection conversion.
		 
		 A sealed route has these properties:
		 \- The result of the route will always be a complete response, i.e. the result of the future is a
		 `Success(RouteResult.Complete(response))`, never a failed future and never a rejected route. These
		 will be already be handled using the given [`RejectionHandler`](../RejectionHandler.html "class in akka.http.javadsl.server") and [`ExceptionHandler`](../ExceptionHandler.html "class in akka.http.javadsl.server").
		 \- Consequently, no route alternatives will be tried that were combined with this route.
		
		
		
		Specified by:
		`[seal](../Route.html#seal(akka.http.javadsl.server.RejectionHandler,akka.http.javadsl.server.ExceptionHandler))` in interface `[Route](../Route.html "interface in akka.http.javadsl.server")`
		Parameters:
		`rejectionHandler` \- (undocumented)
		`exceptionHandler` \- (undocumented)
		Returns:
		(undocumented)
		- #### toString
		
		
		
		```
		public java.lang.String toString()
		```
		
		
		Overrides:
		`toString` in class `java.lang.Object`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/HandlerProvider.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpRequest.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpResponse.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/ExceptionHandler.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/RejectionHandler.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/Route.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/directives/RouteAdapter.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/directives/package-summary.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/RequestContext.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/RouteResult.html

---
*Source: [https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/directives/RouteAdapter.html](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/directives/RouteAdapter.html)*