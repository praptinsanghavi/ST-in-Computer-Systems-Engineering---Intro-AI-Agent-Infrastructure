---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:09:40Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/directives/DebuggingDirectives.html
title: DebuggingDirectives
---

# DebuggingDirectives

## Content

Package [akka.http.scaladsl.server.directives](package-summary.html)
## Interface DebuggingDirectives

- All Known Subinterfaces:
`[Directives](../Directives.html "interface in akka.http.scaladsl.server")`

All Known Implementing Classes:
`[DebuggingDirectives$](DebuggingDirectives$.html "class in akka.http.scaladsl.server.directives")`, `[Directives$](../Directives$.html "class in akka.http.scaladsl.server")`, `[HttpApp](../HttpApp.html "class in akka.http.scaladsl.server")`

---

```
public interface DebuggingDirectives
```

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit>` | `[logRequest](#logRequest(akka.http.scaladsl.server.directives.LoggingMagnet))​([LoggingMagnet](LoggingMagnet.html "class in akka.http.scaladsl.server.directives")<scala.Function1<[HttpRequest](../../model/HttpRequest.html "class in akka.http.scaladsl.model"),​scala.runtime.BoxedUnit>> magnet)` | Produces a log entry for every incoming request. |
	| `[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit>` | `[logRequestResult](#logRequestResult(akka.http.scaladsl.server.directives.LoggingMagnet))​([LoggingMagnet](LoggingMagnet.html "class in akka.http.scaladsl.server.directives")<scala.Function1<[HttpRequest](../../model/HttpRequest.html "class in akka.http.scaladsl.model"),​scala.Function1<[RouteResult](../RouteResult.html "interface in akka.http.scaladsl.server"),​scala.runtime.BoxedUnit>>> magnet)` | Produces a log entry for every incoming request and `RouteResult`. |
	| `[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit>` | `[logResult](#logResult(akka.http.scaladsl.server.directives.LoggingMagnet))​([LoggingMagnet](LoggingMagnet.html "class in akka.http.scaladsl.server.directives")<scala.Function1<[RouteResult](../RouteResult.html "interface in akka.http.scaladsl.server"),​scala.runtime.BoxedUnit>> magnet)` | Produces a log entry for every `RouteResult`. |

- - ### Method Detail
	
	
	
		- #### logRequest
		
		
		
		```
		[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit> logRequest​([LoggingMagnet](LoggingMagnet.html "class in akka.http.scaladsl.server.directives")<scala.Function1<[HttpRequest](../../model/HttpRequest.html "class in akka.http.scaladsl.model"),​scala.runtime.BoxedUnit>> magnet)
		```
		
		Produces a log entry for every incoming request.
		 
		
		Parameters:
		`magnet` \- (undocumented)
		Returns:
		(undocumented)
		- #### logResult
		
		
		
		```
		[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit> logResult​([LoggingMagnet](LoggingMagnet.html "class in akka.http.scaladsl.server.directives")<scala.Function1<[RouteResult](../RouteResult.html "interface in akka.http.scaladsl.server"),​scala.runtime.BoxedUnit>> magnet)
		```
		
		Produces a log entry for every `RouteResult`.
		 
		
		Parameters:
		`magnet` \- (undocumented)
		Returns:
		(undocumented)
		- #### logRequestResult
		
		
		
		```
		[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit> logRequestResult​([LoggingMagnet](LoggingMagnet.html "class in akka.http.scaladsl.server.directives")<scala.Function1<[HttpRequest](../../model/HttpRequest.html "class in akka.http.scaladsl.model"),​scala.Function1<[RouteResult](../RouteResult.html "interface in akka.http.scaladsl.server"),​scala.runtime.BoxedUnit>>> magnet)
		```
		
		Produces a log entry for every incoming request and `RouteResult`.
		 
		
		Parameters:
		`magnet` \- (undocumented)
		Returns:
		(undocumented)

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/HttpRequest.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/Directive.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/Directives$.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/Directives.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/HttpApp.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/RouteResult.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/directives/DebuggingDirectives$.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/directives/LoggingMagnet.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/directives/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/directives/DebuggingDirectives.html](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/directives/DebuggingDirectives.html)*