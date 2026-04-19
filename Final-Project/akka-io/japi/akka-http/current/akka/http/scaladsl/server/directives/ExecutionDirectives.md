---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:39:46Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/ExecutionDirectives.html
title: ExecutionDirectives
---

# ExecutionDirectives

## Content

Package [akka.http.scaladsl.server.directives](package-summary.html)
## Interface ExecutionDirectives

- All Known Subinterfaces:
`[Directives](../Directives.html "interface in akka.http.scaladsl.server")`

All Known Implementing Classes:
`[Directives$](../Directives$.html "class in akka.http.scaladsl.server")`, `[ExecutionDirectives$](ExecutionDirectives$.html "class in akka.http.scaladsl.server.directives")`, `[HttpApp](../HttpApp.html "class in akka.http.scaladsl.server")`

---

```
public interface ExecutionDirectives
```

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit>` | `[handleExceptions](#handleExceptions(akka.http.scaladsl.server.ExceptionHandler))​([ExceptionHandler](../ExceptionHandler.html "interface in akka.http.scaladsl.server") handler)` | Transforms exceptions thrown during evaluation of its inner route using the given  [`ExceptionHandler`](../ExceptionHandler.html "interface in akka.http.scaladsl.server"). |
	| `[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit>` | `[handleRejections](#handleRejections(akka.http.scaladsl.server.RejectionHandler))​([RejectionHandler](../RejectionHandler.html "interface in akka.http.scaladsl.server") handler)` | Transforms rejections produced by its inner route using the given  [`RejectionHandler`](../RejectionHandler.html "interface in akka.http.scaladsl.server"). |

- - ### Method Detail
	
	
	
		- #### handleExceptions
		
		
		
		```
		[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit> handleExceptions​([ExceptionHandler](../ExceptionHandler.html "interface in akka.http.scaladsl.server") handler)
		```
		
		Transforms exceptions thrown during evaluation of its inner route using the given
		 [`ExceptionHandler`](../ExceptionHandler.html "interface in akka.http.scaladsl.server").
		 
		
		Parameters:
		`handler` \- (undocumented)
		Returns:
		(undocumented)
		- #### handleRejections
		
		
		
		```
		[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit> handleRejections​([RejectionHandler](../RejectionHandler.html "interface in akka.http.scaladsl.server") handler)
		```
		
		Transforms rejections produced by its inner route using the given
		 [`RejectionHandler`](../RejectionHandler.html "interface in akka.http.scaladsl.server").
		 
		
		Parameters:
		`handler` \- (undocumented)
		Returns:
		(undocumented)

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/Directive.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/Directives$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/Directives.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/ExceptionHandler.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/HttpApp.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/RejectionHandler.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/ExecutionDirectives$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/ExecutionDirectives.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/ExecutionDirectives.html)*