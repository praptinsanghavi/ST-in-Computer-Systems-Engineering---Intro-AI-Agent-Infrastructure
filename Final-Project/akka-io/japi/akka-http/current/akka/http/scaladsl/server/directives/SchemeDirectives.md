---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:40:12Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/SchemeDirectives.html
title: SchemeDirectives
---

# SchemeDirectives

## Content

Package [akka.http.scaladsl.server.directives](package-summary.html)
## Interface SchemeDirectives

- All Known Subinterfaces:
`[Directives](../Directives.html "interface in akka.http.scaladsl.server")`

All Known Implementing Classes:
`[Directives$](../Directives$.html "class in akka.http.scaladsl.server")`, `[HttpApp](../HttpApp.html "class in akka.http.scaladsl.server")`, `[SchemeDirectives$](SchemeDirectives$.html "class in akka.http.scaladsl.server.directives")`

---

```
public interface SchemeDirectives
```

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.Tuple1<java.lang.String>>` | `[extractScheme](#extractScheme())()` | Extracts the Uri scheme from the request. |
	| `[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit>` | `[scheme](#scheme(java.lang.String))​(java.lang.String name)` | Rejects all requests whose Uri scheme does not match the given one. |

- - ### Method Detail
	
	
	
		- #### extractScheme
		
		
		
		```
		[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.Tuple1<java.lang.String>> extractScheme()
		```
		
		Extracts the Uri scheme from the request.
		 
		
		Returns:
		(undocumented)
		- #### scheme
		
		
		
		```
		[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit> scheme​(java.lang.String name)
		```
		
		Rejects all requests whose Uri scheme does not match the given one.
		 
		
		Parameters:
		`name` \- (undocumented)
		Returns:
		(undocumented)

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/Directive.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/Directives$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/Directives.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/HttpApp.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/SchemeDirectives$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/SchemeDirectives.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/SchemeDirectives.html)*