---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:40:06Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/RangeDirectives.html
title: RangeDirectives
---

# RangeDirectives

## Content

Package [akka.http.scaladsl.server.directives](package-summary.html)
## Interface RangeDirectives

- All Known Subinterfaces:
`[Directives](../Directives.html "interface in akka.http.scaladsl.server")`

All Known Implementing Classes:
`[Directives$](../Directives$.html "class in akka.http.scaladsl.server")`, `[HttpApp](../HttpApp.html "class in akka.http.scaladsl.server")`, `[RangeDirectives$](RangeDirectives$.html "class in akka.http.scaladsl.server.directives")`

---

```
public interface RangeDirectives
```

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit>` | `[withRangeSupport](#withRangeSupport())()` | Answers GET requests with an `Accept-Ranges: bytes` header and converts HttpResponses coming back from its inner  route into partial responses if the initial request contained a valid `Range` request header. |

- - ### Method Detail
	
	
	
		- #### withRangeSupport
		
		
		
		```
		[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit> withRangeSupport()
		```
		
		Answers GET requests with an `Accept-Ranges: bytes` header and converts HttpResponses coming back from its inner
		 route into partial responses if the initial request contained a valid `Range` request header. The requested
		 byte\-ranges may be coalesced.
		 This directive is transparent to non\-GET requests
		 Rejects requests with unsatisfiable ranges `UnsatisfiableRangeRejection`.
		 Rejects requests with too many expected ranges.
		 
		 Note: if you want to combine this directive with `conditional(...)` you need to put
		 it on the \*inside\* of the `conditional(...)` directive, i.e. `conditional(...)` must be
		 on a higher level in your route structure in order to function correctly.
		 
		
		
		
		Returns:
		(undocumented)
		See Also:

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/Directive.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/Directives$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/Directives.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/HttpApp.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/RangeDirectives$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/RangeDirectives.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/RangeDirectives.html)*