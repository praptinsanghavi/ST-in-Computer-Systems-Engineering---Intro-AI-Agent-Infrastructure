---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:09:24Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/RejectionHandlerBuilder.html
title: RejectionHandlerBuilder
---

# RejectionHandlerBuilder

## Content

Package [akka.http.javadsl.server](package-summary.html)
## Class RejectionHandlerBuilder

- java.lang.Object
- - akka.http.javadsl.server.RejectionHandlerBuilder

- ---

```
public class RejectionHandlerBuilder
extends java.lang.Object
```

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[RejectionHandlerBuilder](#%3Cinit%3E(akka.http.scaladsl.server.RejectionHandler.Builder))​([RejectionHandler.Builder](../../scaladsl/server/RejectionHandler.Builder.html "class in akka.http.scaladsl.server") asScala)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[RejectionHandler](RejectionHandler.html "class in akka.http.javadsl.server")` | `[build](#build())()` |  |
	| `<T extends [Rejection](Rejection.html "interface in akka.http.javadsl.server")>[RejectionHandlerBuilder](RejectionHandlerBuilder.html "class in akka.http.javadsl.server")` | `[handle](#handle(java.lang.Class,java.util.function.Function))​(java.lang.Class<T> t,  java.util.function.Function<T,​[Route](Route.html "interface in akka.http.javadsl.server")> handler)` | Handles a single [`Rejection`](Rejection.html "interface in akka.http.javadsl.server") with the given function. |
	| `<T extends [Rejection](Rejection.html "interface in akka.http.javadsl.server")>[RejectionHandlerBuilder](RejectionHandlerBuilder.html "class in akka.http.javadsl.server")` | `[handleAll](#handleAll(java.lang.Class,java.util.function.Function))​(java.lang.Class<T> t,  java.util.function.Function<java.util.List<T>,​[Route](Route.html "interface in akka.http.javadsl.server")> handler)` | Handles several Rejections of the same type at the same time. |
	| `[RejectionHandlerBuilder](RejectionHandlerBuilder.html "class in akka.http.javadsl.server")` | `[handleCircuitBreakerOpenRejection](#handleCircuitBreakerOpenRejection(java.util.function.Function))​(java.util.function.Function<[CircuitBreakerOpenRejection](CircuitBreakerOpenRejection.html "interface in akka.http.javadsl.server"),​[Route](Route.html "interface in akka.http.javadsl.server")> handler)` | Convenience method for handling rejections created by created by the onCompleteWithBreaker directive. |
	| `[RejectionHandlerBuilder](RejectionHandlerBuilder.html "class in akka.http.javadsl.server")` | `[handleNotFound](#handleNotFound(akka.http.javadsl.server.Route))​([Route](Route.html "interface in akka.http.javadsl.server") route)` | Handles the special "not found" case using the given [`Route`](Route.html "interface in akka.http.javadsl.server"). |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### RejectionHandlerBuilder
		
		
		
		```
		public RejectionHandlerBuilder​([RejectionHandler.Builder](../../scaladsl/server/RejectionHandler.Builder.html "class in akka.http.scaladsl.server") asScala)
		```

	- ### Method Detail
	
	
	
		- #### build
		
		
		
		```
		public [RejectionHandler](RejectionHandler.html "class in akka.http.javadsl.server") build()
		```
		- #### handle
		
		
		
		```
		public <T extends [Rejection](Rejection.html "interface in akka.http.javadsl.server")> [RejectionHandlerBuilder](RejectionHandlerBuilder.html "class in akka.http.javadsl.server") handle​(java.lang.Class<T> t,
		                                                            java.util.function.Function<T,​[Route](Route.html "interface in akka.http.javadsl.server")> handler)
		```
		
		Handles a single [`Rejection`](Rejection.html "interface in akka.http.javadsl.server") with the given function.
		
		Parameters:
		`t` \- (undocumented)
		`handler` \- (undocumented)
		Returns:
		(undocumented)
		- #### handleAll
		
		
		
		```
		public <T extends [Rejection](Rejection.html "interface in akka.http.javadsl.server")> [RejectionHandlerBuilder](RejectionHandlerBuilder.html "class in akka.http.javadsl.server") handleAll​(java.lang.Class<T> t,
		                                                               java.util.function.Function<java.util.List<T>,​[Route](Route.html "interface in akka.http.javadsl.server")> handler)
		```
		
		Handles several Rejections of the same type at the same time.
		 The list passed to the given function is guaranteed to be non\-empty.
		
		Parameters:
		`t` \- (undocumented)
		`handler` \- (undocumented)
		Returns:
		(undocumented)
		- #### handleCircuitBreakerOpenRejection
		
		
		
		```
		public [RejectionHandlerBuilder](RejectionHandlerBuilder.html "class in akka.http.javadsl.server") handleCircuitBreakerOpenRejection​(java.util.function.Function<[CircuitBreakerOpenRejection](CircuitBreakerOpenRejection.html "interface in akka.http.javadsl.server"),​[Route](Route.html "interface in akka.http.javadsl.server")> handler)
		```
		
		Convenience method for handling rejections created by created by the onCompleteWithBreaker directive.
		 Signals that the request was rejected because the supplied circuit breaker is open and requests are failing fast.
		 
		 Use to customise the error response being written instead of the default `akka.http.javadsl.model.StatusCodes.SERVICE_UNAVAILABLE` response.
		
		
		
		Parameters:
		`handler` \- (undocumented)
		Returns:
		(undocumented)
		- #### handleNotFound
		
		
		
		```
		public [RejectionHandlerBuilder](RejectionHandlerBuilder.html "class in akka.http.javadsl.server") handleNotFound​([Route](Route.html "interface in akka.http.javadsl.server") route)
		```
		
		Handles the special "not found" case using the given [`Route`](Route.html "interface in akka.http.javadsl.server").
		
		Parameters:
		`route` \- (undocumented)
		Returns:
		(undocumented)

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/CircuitBreakerOpenRejection.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/Rejection.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/RejectionHandler.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/RejectionHandlerBuilder.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/Route.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/package-summary.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/RejectionHandler.Builder.html

---
*Source: [https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/RejectionHandlerBuilder.html](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/RejectionHandlerBuilder.html)*