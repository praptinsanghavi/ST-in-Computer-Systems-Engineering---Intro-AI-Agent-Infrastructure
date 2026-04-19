---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:28:30Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/TimeoutAccess.html
title: TimeoutAccess
---

# TimeoutAccess

## Content

Package [akka.http.scaladsl](package-summary.html)
## Interface TimeoutAccess

- All Superinterfaces:
`[TimeoutAccess](../javadsl/TimeoutAccess.html "interface in akka.http.javadsl")`

---

```
public interface TimeoutAccess
extends [TimeoutAccess](../javadsl/TimeoutAccess.html "interface in akka.http.javadsl")
```

Enables programmatic access to the server\-side request timeout logic.
 
 Not for user extension.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `scala.concurrent.duration.Duration` | `[getTimeout](#getTimeout())()` | Java API |
	| `scala.concurrent.duration.Duration` | `[timeout](#timeout())()` | Returns the currently set timeout. |
	| `void` | `[update](#update(scala.concurrent.duration.Duration,scala.Function1))​(scala.concurrent.duration.Duration timeout,  scala.Function1<[HttpRequest](model/HttpRequest.html "class in akka.http.scaladsl.model"),​[HttpResponse](model/HttpResponse.html "class in akka.http.scaladsl.model")> handler)` | Tries to set a new timeout and handler at the same time. |
	| `void` | `[updateHandler](#updateHandler(scala.Function1))​(scala.Function1<[HttpRequest](model/HttpRequest.html "class in akka.http.scaladsl.model"),​[HttpResponse](model/HttpResponse.html "class in akka.http.scaladsl.model")> handler)` | Tries to set a new timeout handler, which produces the timeout response for a  given request. |
	| `void` | `[updateTimeout](#updateTimeout(scala.concurrent.duration.Duration))​(scala.concurrent.duration.Duration timeout)` | Tries to set a new timeout. |
	
	
		- ### Methods inherited from interface akka.http.javadsl.[TimeoutAccess](../javadsl/TimeoutAccess.html "interface in akka.http.javadsl")
		
		
		`[update](../javadsl/TimeoutAccess.html#update(scala.concurrent.duration.Duration,akka.japi.Function)), [updateHandler](../javadsl/TimeoutAccess.html#updateHandler(akka.japi.Function))`

- - ### Method Detail
	
	
	
		- #### getTimeout
		
		
		
		```
		scala.concurrent.duration.Duration getTimeout()
		```
		
		Java API
		
		Specified by:
		`[getTimeout](../javadsl/TimeoutAccess.html#getTimeout())` in interface `[TimeoutAccess](../javadsl/TimeoutAccess.html "interface in akka.http.javadsl")`
		- #### timeout
		
		
		
		```
		scala.concurrent.duration.Duration timeout()
		```
		
		Returns the currently set timeout.
		 The timeout period is measured as of the point in time that the end of the request has been received,
		 which may be in the past or in the future!
		 
		 Due to the inherent raciness it is not guaranteed that the returned timeout was applied before
		 the previously set timeout has expired!
		
		
		
		Returns:
		(undocumented)
		- #### update
		
		
		
		```
		void update​(scala.concurrent.duration.Duration timeout,
		            scala.Function1<[HttpRequest](model/HttpRequest.html "class in akka.http.scaladsl.model"),​[HttpResponse](model/HttpResponse.html "class in akka.http.scaladsl.model")> handler)
		```
		
		Tries to set a new timeout and handler at the same time.
		 
		 Due to the inherent raciness it is not guaranteed that the update will be applied before
		 the previously set timeout has expired!
		
		
		
		Parameters:
		`timeout` \- (undocumented)
		`handler` \- (undocumented)
		- #### updateHandler
		
		
		
		```
		void updateHandler​(scala.Function1<[HttpRequest](model/HttpRequest.html "class in akka.http.scaladsl.model"),​[HttpResponse](model/HttpResponse.html "class in akka.http.scaladsl.model")> handler)
		```
		
		Tries to set a new timeout handler, which produces the timeout response for a
		 given request. Note that the handler must produce the response synchronously and shouldn't block!
		 
		 Due to the inherent raciness it is not guaranteed that the update will be applied before
		 the previously set timeout has expired!
		
		
		
		Parameters:
		`handler` \- (undocumented)
		- #### updateTimeout
		
		
		
		```
		void updateTimeout​(scala.concurrent.duration.Duration timeout)
		```
		
		Tries to set a new timeout.
		 The timeout period is measured as of the point in time that the end of the request has been received,
		 which may be in the past or in the future!
		 Use `Duration.Inf` to completely disable request timeout checking for this request.
		 
		 Due to the inherent raciness it is not guaranteed that the update will be applied before
		 the previously set timeout has expired!
		
		
		
		Specified by:
		`[updateTimeout](../javadsl/TimeoutAccess.html#updateTimeout(scala.concurrent.duration.Duration))` in interface `[TimeoutAccess](../javadsl/TimeoutAccess.html "interface in akka.http.javadsl")`
		Parameters:
		`timeout` \- (undocumented)

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/TimeoutAccess.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpRequest.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpResponse.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/TimeoutAccess.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/TimeoutAccess.html)*