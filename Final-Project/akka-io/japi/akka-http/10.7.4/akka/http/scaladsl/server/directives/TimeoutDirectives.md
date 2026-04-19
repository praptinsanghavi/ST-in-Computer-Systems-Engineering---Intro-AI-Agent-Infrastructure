---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:09:56Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/directives/TimeoutDirectives.html
title: TimeoutDirectives
---

# TimeoutDirectives

## Content

Package [akka.http.scaladsl.server.directives](package-summary.html)
## Interface TimeoutDirectives

- All Known Subinterfaces:
`[Directives](../Directives.html "interface in akka.http.scaladsl.server")`

All Known Implementing Classes:
`[Directives$](../Directives$.html "class in akka.http.scaladsl.server")`, `[HttpApp](../HttpApp.html "class in akka.http.scaladsl.server")`, `[TimeoutDirectives$](TimeoutDirectives$.html "class in akka.http.scaladsl.server.directives")`

---

```
public interface TimeoutDirectives
```

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.Tuple1<scala.concurrent.duration.Duration>>` | `[extractRequestTimeout](#extractRequestTimeout())()` | Return the currently set request timeout. |
	| `[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit>` | `[withoutRequestTimeout](#withoutRequestTimeout())()` |  |
	| `[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit>` | `[withRequestTimeout](#withRequestTimeout(scala.concurrent.duration.Duration))​(scala.concurrent.duration.Duration timeout)` | Tries to set a new request timeout and handler (if provided) at the same time. |
	| `[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit>` | `[withRequestTimeout](#withRequestTimeout(scala.concurrent.duration.Duration,scala.Function1))​(scala.concurrent.duration.Duration timeout,  scala.Function1<[HttpRequest](../../model/HttpRequest.html "class in akka.http.scaladsl.model"),​[HttpResponse](../../model/HttpResponse.html "class in akka.http.scaladsl.model")> handler)` | Tries to set a new request timeout and handler (if provided) at the same time. |
	| `[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit>` | `[withRequestTimeout](#withRequestTimeout(scala.concurrent.duration.Duration,scala.Option))​(scala.concurrent.duration.Duration timeout,  scala.Option<scala.Function1<[HttpRequest](../../model/HttpRequest.html "class in akka.http.scaladsl.model"),​[HttpResponse](../../model/HttpResponse.html "class in akka.http.scaladsl.model")>> handler)` | Tries to set a new request timeout and handler (if provided) at the same time. |
	| `[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit>` | `[withRequestTimeoutResponse](#withRequestTimeoutResponse(scala.Function1))​(scala.Function1<[HttpRequest](../../model/HttpRequest.html "class in akka.http.scaladsl.model"),​[HttpResponse](../../model/HttpResponse.html "class in akka.http.scaladsl.model")> handler)` | Tries to set a new request timeout handler, which produces the timeout response for a  given request. |

- - ### Method Detail
	
	
	
		- #### extractRequestTimeout
		
		
		
		```
		[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.Tuple1<scala.concurrent.duration.Duration>> extractRequestTimeout()
		```
		
		Return the currently set request timeout.
		 
		 Note that this may be changed in inner directives.
		 
		
		
		
		Returns:
		(undocumented)
		- #### withoutRequestTimeout
		
		
		
		```
		[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit> withoutRequestTimeout()
		```
		
		
		Returns:
		(undocumented)
		- #### withRequestTimeout
		
		
		
		```
		[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit> withRequestTimeout​(scala.concurrent.duration.Duration timeout)
		```
		
		Tries to set a new request timeout and handler (if provided) at the same time.
		 
		 Due to the inherent raciness it is not guaranteed that the update will be applied before
		 the previously set timeout has expired!
		 
		
		
		
		Parameters:
		`timeout` \- (undocumented)
		Returns:
		(undocumented)
		- #### withRequestTimeout
		
		
		
		```
		[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit> withRequestTimeout​(scala.concurrent.duration.Duration timeout,
		                                                      scala.Function1<[HttpRequest](../../model/HttpRequest.html "class in akka.http.scaladsl.model"),​[HttpResponse](../../model/HttpResponse.html "class in akka.http.scaladsl.model")> handler)
		```
		
		Tries to set a new request timeout and handler (if provided) at the same time.
		 
		 Due to the inherent raciness it is not guaranteed that the update will be applied before
		 the previously set timeout has expired!
		 
		
		
		
		Parameters:
		`handler` \- optional custom "timeout response" function. If left None, the default timeout HttpResponse will be used.
		 
		`timeout` \- (undocumented)
		Returns:
		(undocumented)
		- #### withRequestTimeout
		
		
		
		```
		[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit> withRequestTimeout​(scala.concurrent.duration.Duration timeout,
		                                                      scala.Option<scala.Function1<[HttpRequest](../../model/HttpRequest.html "class in akka.http.scaladsl.model"),​[HttpResponse](../../model/HttpResponse.html "class in akka.http.scaladsl.model")>> handler)
		```
		
		Tries to set a new request timeout and handler (if provided) at the same time.
		 
		 Due to the inherent raciness it is not guaranteed that the update will be applied before
		 the previously set timeout has expired!
		 
		
		
		
		Parameters:
		`handler` \- optional custom "timeout response" function. If left None, the default timeout HttpResponse will be used.
		 
		`timeout` \- (undocumented)
		Returns:
		(undocumented)
		- #### withRequestTimeoutResponse
		
		
		
		```
		[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit> withRequestTimeoutResponse​(scala.Function1<[HttpRequest](../../model/HttpRequest.html "class in akka.http.scaladsl.model"),​[HttpResponse](../../model/HttpResponse.html "class in akka.http.scaladsl.model")> handler)
		```
		
		Tries to set a new request timeout handler, which produces the timeout response for a
		 given request. Note that the handler must produce the response synchronously and shouldn't block!
		 
		 Due to the inherent raciness it is not guaranteed that the update will be applied before
		 the previously set timeout has expired!
		 
		
		
		
		Parameters:
		`handler` \- (undocumented)
		Returns:
		(undocumented)

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/HttpRequest.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/HttpResponse.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/Directive.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/Directives$.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/Directives.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/HttpApp.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/directives/TimeoutDirectives$.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/directives/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/directives/TimeoutDirectives.html](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/directives/TimeoutDirectives.html)*