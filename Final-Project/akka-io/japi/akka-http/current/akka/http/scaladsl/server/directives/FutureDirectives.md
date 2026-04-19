---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:39:56Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/FutureDirectives.html
title: FutureDirectives
---

# FutureDirectives

## Content

Package [akka.http.scaladsl.server.directives](package-summary.html)
## Interface FutureDirectives

- All Known Subinterfaces:
`[Directives](../Directives.html "interface in akka.http.scaladsl.server")`

All Known Implementing Classes:
`[Directives$](../Directives$.html "class in akka.http.scaladsl.server")`, `[FutureDirectives$](FutureDirectives$.html "class in akka.http.scaladsl.server.directives")`, `[HttpApp](../HttpApp.html "class in akka.http.scaladsl.server")`

---

```
public interface FutureDirectives
```

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.Tuple1<java.lang.Throwable>>` | `[completeOrRecoverWith](#completeOrRecoverWith(akka.http.scaladsl.server.directives.CompleteOrRecoverWithMagnet))​([CompleteOrRecoverWithMagnet](CompleteOrRecoverWithMagnet.html "interface in akka.http.scaladsl.server.directives") magnet)` | "Unwraps" a `Future[T]` and runs the inner route when the future has failed  with the future's failure exception as an extraction of type `Throwable`. |
	| `<T> [Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.Tuple1<scala.util.Try<T>>>` | `[onComplete](#onComplete(scala.Function0))​(scala.Function0<scala.concurrent.Future<T>> future)` | "Unwraps" a `Future[T]` and runs the inner route after future  completion with the future's value as an extraction of type `Try[T]`. |
	| `<T> [Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.Tuple1<scala.util.Try<T>>>` | `[onCompleteWithBreaker](#onCompleteWithBreaker(akka.pattern.CircuitBreaker,scala.Function0))​(akka.pattern.CircuitBreaker breaker,  scala.Function0<scala.concurrent.Future<T>> future)` | "Unwraps" a `Future[T]` and runs the inner route after future  completion with the future's value as an extraction of type `T` if  the supplied `CircuitBreaker` is closed. |
	| `[Directive](../Directive.html "class in akka.http.scaladsl.server")<java.lang.Object>` | `[onSuccess](#onSuccess(akka.http.scaladsl.server.directives.OnSuccessMagnet))​([OnSuccessMagnet](OnSuccessMagnet.html "interface in akka.http.scaladsl.server.directives") magnet)` | "Unwraps" a `Future[T]` and runs the inner route after future  completion with the future's value as an extraction of type `T`. |

- - ### Method Detail
	
	
	
		- #### onComplete
		
		
		
		```
		<T> [Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.Tuple1<scala.util.Try<T>>> onComplete​(scala.Function0<scala.concurrent.Future<T>> future)
		```
		
		"Unwraps" a `Future[T]` and runs the inner route after future
		 completion with the future's value as an extraction of type `Try[T]`.
		 
		
		Parameters:
		`future` \- (undocumented)
		Returns:
		(undocumented)
		- #### onCompleteWithBreaker
		
		
		
		```
		<T> [Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.Tuple1<scala.util.Try<T>>> onCompleteWithBreaker​(akka.pattern.CircuitBreaker breaker,
		                                                                     scala.Function0<scala.concurrent.Future<T>> future)
		```
		
		"Unwraps" a `Future[T]` and runs the inner route after future
		 completion with the future's value as an extraction of type `T` if
		 the supplied `CircuitBreaker` is closed.
		 
		 If the supplied `CircuitBreaker` is open the request is rejected
		 with a `CircuitBreakerOpenRejection`.
		 
		
		
		
		Parameters:
		`breaker` \- (undocumented)
		`future` \- (undocumented)
		Returns:
		(undocumented)
		- #### onSuccess
		
		
		
		```
		[Directive](../Directive.html "class in akka.http.scaladsl.server")<java.lang.Object> onSuccess​([OnSuccessMagnet](OnSuccessMagnet.html "interface in akka.http.scaladsl.server.directives") magnet)
		```
		
		"Unwraps" a `Future[T]` and runs the inner route after future
		 completion with the future's value as an extraction of type `T`.
		 If the future fails its failure Throwable is bubbled up to the nearest
		 ExceptionHandler.
		 If type `T` is already a Tuple it is directly expanded into the respective
		 number of extractions.
		 
		
		Parameters:
		`magnet` \- (undocumented)
		Returns:
		(undocumented)
		- #### completeOrRecoverWith
		
		
		
		```
		[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.Tuple1<java.lang.Throwable>> completeOrRecoverWith​([CompleteOrRecoverWithMagnet](CompleteOrRecoverWithMagnet.html "interface in akka.http.scaladsl.server.directives") magnet)
		```
		
		"Unwraps" a `Future[T]` and runs the inner route when the future has failed
		 with the future's failure exception as an extraction of type `Throwable`.
		 If the future succeeds the request is completed using the values marshaller
		 (This directive therefore requires a marshaller for the futures type to be
		 implicitly available.)
		 
		
		Parameters:
		`magnet` \- (undocumented)
		Returns:
		(undocumented)

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/Directive.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/Directives$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/Directives.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/HttpApp.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/CompleteOrRecoverWithMagnet.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/FutureDirectives$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/OnSuccessMagnet.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/FutureDirectives.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/FutureDirectives.html)*