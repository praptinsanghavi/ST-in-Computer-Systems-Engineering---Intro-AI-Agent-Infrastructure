---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:44:34Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/TimeoutAccess.html
title: TimeoutAccess
---

# TimeoutAccess

## Content

Package [akka.http.javadsl](package-summary.html)
## Interface TimeoutAccess

- All Known Subinterfaces:
`[TimeoutAccess](../scaladsl/TimeoutAccess.html "interface in akka.http.scaladsl")`

---

```
@DoNotInherit
public interface TimeoutAccess
```

Enables programmatic access to the server\-side request timeout logic.

 Not for user extension.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `scala.concurrent.duration.Duration` | `[getTimeout](#getTimeout())()` | Returns the currently set timeout. |
	| `void` | `[update](#update(scala.concurrent.duration.Duration,akka.japi.Function))​(scala.concurrent.duration.Duration timeout,  akka.japi.Function<[HttpRequest](model/HttpRequest.html "class in akka.http.javadsl.model"),​[HttpResponse](model/HttpResponse.html "class in akka.http.javadsl.model")> handler)` | Tries to set a new timeout and handler at the same time. |
	| `void` | `[updateHandler](#updateHandler(akka.japi.Function))​(akka.japi.Function<[HttpRequest](model/HttpRequest.html "class in akka.http.javadsl.model"),​[HttpResponse](model/HttpResponse.html "class in akka.http.javadsl.model")> handler)` | Tries to set a new timeout handler, which produces the timeout response for a  given request. |
	| `void` | `[updateTimeout](#updateTimeout(scala.concurrent.duration.Duration))​(scala.concurrent.duration.Duration timeout)` | Tries to set a new timeout. |

- - ### Method Detail
	
	
	
		- #### getTimeout
		
		
		
		```
		scala.concurrent.duration.Duration getTimeout()
		```
		
		Returns the currently set timeout.
		 The timeout period is measured as of the point in time that the end of the request has been received,
		 which may be in the past or in the future!
		
		 Due to the inherent raciness it is not guaranteed that the returned timeout was applied before
		 the previously set timeout has expired!
		- #### updateTimeout
		
		
		
		```
		void updateTimeout​(scala.concurrent.duration.Duration timeout)
		```
		
		Tries to set a new timeout.
		 The timeout period is measured as of the point in time that the end of the request has been received,
		 which may be in the past or in the future!
		 Use \`Duration.Inf\` to completely disable request timeout checking for this request.
		
		 Due to the inherent raciness it is not guaranteed that the update will be applied before
		 the previously set timeout has expired!
		- #### updateHandler
		
		
		
		```
		void updateHandler​(akka.japi.Function<[HttpRequest](model/HttpRequest.html "class in akka.http.javadsl.model"),​[HttpResponse](model/HttpResponse.html "class in akka.http.javadsl.model")> handler)
		```
		
		Tries to set a new timeout handler, which produces the timeout response for a
		 given request. Note that the handler must produce the response synchronously and shouldn't block!
		
		 Due to the inherent raciness it is not guaranteed that the update will be applied before
		 the previously set timeout has expired!
		- #### update
		
		
		
		```
		void update​(scala.concurrent.duration.Duration timeout,
		            akka.japi.Function<[HttpRequest](model/HttpRequest.html "class in akka.http.javadsl.model"),​[HttpResponse](model/HttpResponse.html "class in akka.http.javadsl.model")> handler)
		```
		
		Tries to set a new timeout and handler at the same time.
		
		 Due to the inherent raciness it is not guaranteed that the update will be applied before
		 the previously set timeout has expired!

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/HttpRequest.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/HttpResponse.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/TimeoutAccess.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/TimeoutAccess.html](https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/TimeoutAccess.html)*