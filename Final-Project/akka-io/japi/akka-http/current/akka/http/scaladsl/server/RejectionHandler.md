---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:39:04Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/RejectionHandler.Builder.html
title: RejectionHandler.Builder
---

# RejectionHandler.Builder

## Content

Package [akka.http.scaladsl.server](package-summary.html)
## Class RejectionHandler.Builder

- java.lang.Object
- - akka.http.scaladsl.server.RejectionHandler.Builder

- Enclosing interface:
[RejectionHandler](RejectionHandler.html "interface in akka.http.scaladsl.server")

---

```
public static final class RejectionHandler.Builder
extends java.lang.Object
```

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Builder](#%3Cinit%3E(boolean))​(boolean isDefault)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[RejectionHandler.Builder](RejectionHandler.Builder.html "class in akka.http.scaladsl.server")` | `[handle](#handle(scala.PartialFunction))​(scala.PartialFunction<[Rejection](Rejection.html "interface in akka.http.scaladsl.server"),​scala.Function1<[RequestContext](RequestContext.html "interface in akka.http.scaladsl.server"),​scala.concurrent.Future<[RouteResult](RouteResult.html "interface in akka.http.scaladsl.server")>>> pf)` | Handles a single [`Rejection`](Rejection.html "interface in akka.http.scaladsl.server") with the given partial function. |
	| `<T extends [Rejection](Rejection.html "interface in akka.http.scaladsl.server")>[RejectionHandler.Builder](RejectionHandler.Builder.html "class in akka.http.scaladsl.server")` | `[handleAll](#handleAll(scala.Function1,scala.reflect.ClassTag))​(scala.Function1<scala.collection.immutable.Seq<T>,​scala.Function1<[RequestContext](RequestContext.html "interface in akka.http.scaladsl.server"),​scala.concurrent.Future<[RouteResult](RouteResult.html "interface in akka.http.scaladsl.server")>>> f,  scala.reflect.ClassTag<T> evidence$1)` | Handles several Rejections of the same type at the same time. |
	| `[RejectionHandler.Builder](RejectionHandler.Builder.html "class in akka.http.scaladsl.server")` | `[handleCircuitBreakerOpenRejection](#handleCircuitBreakerOpenRejection(scala.Function1))​(scala.Function1<[CircuitBreakerOpenRejection](CircuitBreakerOpenRejection.html "class in akka.http.scaladsl.server"),​scala.Function1<[RequestContext](RequestContext.html "interface in akka.http.scaladsl.server"),​scala.concurrent.Future<[RouteResult](RouteResult.html "interface in akka.http.scaladsl.server")>>> handler)` | Convenience method for handling rejections created by the onCompleteWithBreaker directive. |
	| `[RejectionHandler.Builder](RejectionHandler.Builder.html "class in akka.http.scaladsl.server")` | `[handleNotFound](#handleNotFound(scala.Function1))​(scala.Function1<[RequestContext](RequestContext.html "interface in akka.http.scaladsl.server"),​scala.concurrent.Future<[RouteResult](RouteResult.html "interface in akka.http.scaladsl.server")>> route)` | Handles the special "not found" case using the given [`Route`](Route.html "class in akka.http.scaladsl.server"). |
	| `[RejectionHandler](RejectionHandler.html "interface in akka.http.scaladsl.server")` | `[result](#result())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### Builder
		
		
		
		```
		public Builder​(boolean isDefault)
		```

	- ### Method Detail
	
	
	
		- #### handle
		
		
		
		```
		public [RejectionHandler.Builder](RejectionHandler.Builder.html "class in akka.http.scaladsl.server") handle​(scala.PartialFunction<[Rejection](Rejection.html "interface in akka.http.scaladsl.server"),​scala.Function1<[RequestContext](RequestContext.html "interface in akka.http.scaladsl.server"),​scala.concurrent.Future<[RouteResult](RouteResult.html "interface in akka.http.scaladsl.server")>>> pf)
		```
		
		Handles a single [`Rejection`](Rejection.html "interface in akka.http.scaladsl.server") with the given partial function.
		
		Parameters:
		`pf` \- (undocumented)
		Returns:
		(undocumented)
		- #### handleAll
		
		
		
		```
		public <T extends [Rejection](Rejection.html "interface in akka.http.scaladsl.server")> [RejectionHandler.Builder](RejectionHandler.Builder.html "class in akka.http.scaladsl.server") handleAll​(scala.Function1<scala.collection.immutable.Seq<T>,​scala.Function1<[RequestContext](RequestContext.html "interface in akka.http.scaladsl.server"),​scala.concurrent.Future<[RouteResult](RouteResult.html "interface in akka.http.scaladsl.server")>>> f,
		                                                                scala.reflect.ClassTag<T> evidence$1)
		```
		
		Handles several Rejections of the same type at the same time.
		 The seq passed to the given function is guaranteed to be non\-empty.
		
		Parameters:
		`f` \- (undocumented)
		`evidence$1` \- (undocumented)
		Returns:
		(undocumented)
		- #### handleCircuitBreakerOpenRejection
		
		
		
		```
		public [RejectionHandler.Builder](RejectionHandler.Builder.html "class in akka.http.scaladsl.server") handleCircuitBreakerOpenRejection​(scala.Function1<[CircuitBreakerOpenRejection](CircuitBreakerOpenRejection.html "class in akka.http.scaladsl.server"),​scala.Function1<[RequestContext](RequestContext.html "interface in akka.http.scaladsl.server"),​scala.concurrent.Future<[RouteResult](RouteResult.html "interface in akka.http.scaladsl.server")>>> handler)
		```
		
		Convenience method for handling rejections created by the onCompleteWithBreaker directive.
		 Signals that the request was rejected because the supplied circuit breaker is open and requests are failing fast.
		 
		 Use to customise the error response being written instead of the default `ServiceUnavailable` response.
		
		
		
		Parameters:
		`handler` \- (undocumented)
		Returns:
		(undocumented)
		- #### handleNotFound
		
		
		
		```
		public [RejectionHandler.Builder](RejectionHandler.Builder.html "class in akka.http.scaladsl.server") handleNotFound​(scala.Function1<[RequestContext](RequestContext.html "interface in akka.http.scaladsl.server"),​scala.concurrent.Future<[RouteResult](RouteResult.html "interface in akka.http.scaladsl.server")>> route)
		```
		
		Handles the special "not found" case using the given [`Route`](Route.html "class in akka.http.scaladsl.server").
		
		Parameters:
		`route` \- (undocumented)
		Returns:
		(undocumented)
		- #### result
		
		
		
		```
		public [RejectionHandler](RejectionHandler.html "interface in akka.http.scaladsl.server") result()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/CircuitBreakerOpenRejection.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/Rejection.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/RejectionHandler.Builder.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/RejectionHandler.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/RequestContext.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/Route.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/RouteResult.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/RejectionHandler.Builder.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/RejectionHandler.Builder.html)*