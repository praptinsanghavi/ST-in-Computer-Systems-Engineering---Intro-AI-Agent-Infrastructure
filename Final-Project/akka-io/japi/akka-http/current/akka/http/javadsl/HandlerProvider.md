---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:44:32Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/HandlerProvider.html
title: HandlerProvider
---

# HandlerProvider

## Content

Package [akka.http.javadsl](package-summary.html)
## Interface HandlerProvider

- All Known Subinterfaces:
`[Route](server/Route.html "interface in akka.http.javadsl.server")`

All Known Implementing Classes:
`[RouteAdapter](server/directives/RouteAdapter.html "class in akka.http.javadsl.server.directives")`

---

```
public interface HandlerProvider
```

A HandlerProvider can provide an asynchronous request handler given an ClassicActorSystemProvider.
 
 The main use case for this class is to enable passing a Route to ServerBuilder.bind().

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `akka.japi.function.Function<[HttpRequest](model/HttpRequest.html "class in akka.http.javadsl.model"),​java.util.concurrent.CompletionStage<[HttpResponse](model/HttpResponse.html "class in akka.http.javadsl.model")>>` | `[handler](#handler(akka.actor.ClassicActorSystemProvider))​(akka.actor.ClassicActorSystemProvider system)` |  |

- - ### Method Detail
	
	
	
		- #### handler
		
		
		
		```
		akka.japi.function.Function<[HttpRequest](model/HttpRequest.html "class in akka.http.javadsl.model"),​java.util.concurrent.CompletionStage<[HttpResponse](model/HttpResponse.html "class in akka.http.javadsl.model")>> handler​(akka.actor.ClassicActorSystemProvider system)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/HttpRequest.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/HttpResponse.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/Route.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/directives/RouteAdapter.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/HandlerProvider.html](https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/HandlerProvider.html)*