---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:23:04Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/Route.html
title: Route
---

# Route

## Content

Package [akka.http.javadsl.server](package-summary.html)
## Interface Route

- All Superinterfaces:
`[HandlerProvider](../HandlerProvider.html "interface in akka.http.javadsl")`

All Known Implementing Classes:
`[RouteAdapter](directives/RouteAdapter.html "class in akka.http.javadsl.server.directives")`

---

```
public interface Route
extends [HandlerProvider](../HandlerProvider.html "interface in akka.http.javadsl")
```

In the Java DSL, a Route can only consist of combinations of the built\-in directives. A Route can not be
 instantiated directly.
 
 However, the built\-in directives may be combined methods like:
 

```

 Route myDirective(String test, Supplier<Route> inner) {
   return
     path("fixed", () ->
       path(test),
         inner
       )
     );
 }
 
```

 The above example will invoke \[inner] whenever the path "fixed/{test}" is matched, where "{test}"
 is the actual String that was given as method argument.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `scala.Function1<[RequestContext](../../scaladsl/server/RequestContext.html "interface in akka.http.scaladsl.server"),​scala.concurrent.Future<[RouteResult](../../scaladsl/server/RouteResult.html "interface in akka.http.scaladsl.server")>>` | `[asScala](#asScala())()` | Converts to the Scala DSL form of an Route. |
	| `scala.Function1<[RequestContext](../../scaladsl/server/RequestContext.html "interface in akka.http.scaladsl.server"),​scala.concurrent.Future<[RouteResult](../../scaladsl/server/RouteResult.html "interface in akka.http.scaladsl.server")>>` | `[delegate](#delegate())()` | INTERNAL API |
	| `akka.stream.javadsl.Flow<[HttpRequest](../model/HttpRequest.html "class in akka.http.javadsl.model"),​[HttpResponse](../model/HttpResponse.html "class in akka.http.javadsl.model"),​akka.NotUsed>` | `[flow](#flow(akka.actor.ActorSystem,akka.stream.Materializer))​(akka.actor.ActorSystem system,  akka.stream.Materializer materializer)` |  |
	| `akka.stream.javadsl.Flow<[HttpRequest](../model/HttpRequest.html "class in akka.http.javadsl.model"),​[HttpResponse](../model/HttpResponse.html "class in akka.http.javadsl.model"),​akka.NotUsed>` | `[flow](#flow(akka.actor.ClassicActorSystemProvider))​(akka.actor.ClassicActorSystemProvider system)` |  |
	| `akka.japi.function.Function<[HttpRequest](../model/HttpRequest.html "class in akka.http.javadsl.model"),​java.util.concurrent.CompletionStage<[HttpResponse](../model/HttpResponse.html "class in akka.http.javadsl.model")>>` | `[function](#function(akka.actor.ClassicActorSystemProvider))​(akka.actor.ClassicActorSystemProvider system)` |  |
	| `akka.japi.function.Function<[HttpRequest](../model/HttpRequest.html "class in akka.http.javadsl.model"),​java.util.concurrent.CompletionStage<[HttpResponse](../model/HttpResponse.html "class in akka.http.javadsl.model")>>` | `[handler](#handler(akka.actor.ClassicActorSystemProvider))​(akka.actor.ClassicActorSystemProvider system)` |  |
	| `[Route](Route.html "interface in akka.http.javadsl.server")` | `[orElse](#orElse(akka.http.javadsl.server.Route))​([Route](Route.html "interface in akka.http.javadsl.server") alternative)` |  |
	| `[Route](Route.html "interface in akka.http.javadsl.server")` | `[seal](#seal())()` | Seals a route by wrapping it with default exception handling and rejection conversion. |
	| `[Route](Route.html "interface in akka.http.javadsl.server")` | `[seal](#seal(akka.http.javadsl.server.RejectionHandler,akka.http.javadsl.server.ExceptionHandler))​([RejectionHandler](RejectionHandler.html "class in akka.http.javadsl.server") rejectionHandler,  [ExceptionHandler](ExceptionHandler.html "class in akka.http.javadsl.server") exceptionHandler)` | Seals a route by wrapping it with explicit exception handling and rejection conversion. |

- - ### Method Detail
	
	
	
		- #### asScala
		
		
		
		```
		scala.Function1<[RequestContext](../../scaladsl/server/RequestContext.html "interface in akka.http.scaladsl.server"),​scala.concurrent.Future<[RouteResult](../../scaladsl/server/RouteResult.html "interface in akka.http.scaladsl.server")>> asScala()
		```
		
		Converts to the Scala DSL form of an Route.
		- #### delegate
		
		
		
		```
		scala.Function1<[RequestContext](../../scaladsl/server/RequestContext.html "interface in akka.http.scaladsl.server"),​scala.concurrent.Future<[RouteResult](../../scaladsl/server/RouteResult.html "interface in akka.http.scaladsl.server")>> delegate()
		```
		
		INTERNAL API
		- #### flow
		
		
		
		```
		akka.stream.javadsl.Flow<[HttpRequest](../model/HttpRequest.html "class in akka.http.javadsl.model"),​[HttpResponse](../model/HttpResponse.html "class in akka.http.javadsl.model"),​akka.NotUsed> flow​(akka.actor.ActorSystem system,
		                                                                                 akka.stream.Materializer materializer)
		```
		- #### flow
		
		
		
		```
		akka.stream.javadsl.Flow<[HttpRequest](../model/HttpRequest.html "class in akka.http.javadsl.model"),​[HttpResponse](../model/HttpResponse.html "class in akka.http.javadsl.model"),​akka.NotUsed> flow​(akka.actor.ClassicActorSystemProvider system)
		```
		- #### function
		
		
		
		```
		akka.japi.function.Function<[HttpRequest](../model/HttpRequest.html "class in akka.http.javadsl.model"),​java.util.concurrent.CompletionStage<[HttpResponse](../model/HttpResponse.html "class in akka.http.javadsl.model")>> function​(akka.actor.ClassicActorSystemProvider system)
		```
		- #### handler
		
		
		
		```
		akka.japi.function.Function<[HttpRequest](../model/HttpRequest.html "class in akka.http.javadsl.model"),​java.util.concurrent.CompletionStage<[HttpResponse](../model/HttpResponse.html "class in akka.http.javadsl.model")>> handler​(akka.actor.ClassicActorSystemProvider system)
		```
		
		
		Specified by:
		`[handler](../HandlerProvider.html#handler(akka.actor.ClassicActorSystemProvider))` in interface `[HandlerProvider](../HandlerProvider.html "interface in akka.http.javadsl")`
		- #### orElse
		
		
		
		```
		[Route](Route.html "interface in akka.http.javadsl.server") orElse​([Route](Route.html "interface in akka.http.javadsl.server") alternative)
		```
		- #### seal
		
		
		
		```
		[Route](Route.html "interface in akka.http.javadsl.server") seal()
		```
		
		Seals a route by wrapping it with default exception handling and rejection conversion.
		 
		 A sealed route has these properties:
		 \- The result of the route will always be a complete response, i.e. the result of the future is a
		 `Success(RouteResult.Complete(response))`, never a failed future and never a rejected route. These
		 will be already be handled using the default [`RejectionHandler`](RejectionHandler.html "class in akka.http.javadsl.server") and [`ExceptionHandler`](ExceptionHandler.html "class in akka.http.javadsl.server").
		 \- Consequently, no route alternatives will be tried that were combined with this route.
		
		
		
		Returns:
		(undocumented)
		- #### seal
		
		
		
		```
		[Route](Route.html "interface in akka.http.javadsl.server") seal​([RejectionHandler](RejectionHandler.html "class in akka.http.javadsl.server") rejectionHandler,
		           [ExceptionHandler](ExceptionHandler.html "class in akka.http.javadsl.server") exceptionHandler)
		```
		
		Seals a route by wrapping it with explicit exception handling and rejection conversion.
		 
		 A sealed route has these properties:
		 \- The result of the route will always be a complete response, i.e. the result of the future is a
		 `Success(RouteResult.Complete(response))`, never a failed future and never a rejected route. These
		 will be already be handled using the given [`RejectionHandler`](RejectionHandler.html "class in akka.http.javadsl.server") and [`ExceptionHandler`](ExceptionHandler.html "class in akka.http.javadsl.server").
		 \- Consequently, no route alternatives will be tried that were combined with this route.
		
		
		
		Parameters:
		`rejectionHandler` \- (undocumented)
		`exceptionHandler` \- (undocumented)
		Returns:
		(undocumented)

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/HandlerProvider.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpRequest.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpResponse.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/ExceptionHandler.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/RejectionHandler.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/Route.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/directives/RouteAdapter.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/package-summary.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/RequestContext.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/RouteResult.html

---
*Source: [https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/Route.html](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/Route.html)*