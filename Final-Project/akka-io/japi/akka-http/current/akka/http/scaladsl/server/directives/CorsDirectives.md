---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:39:42Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/CorsDirectives.html
title: CorsDirectives
---

# CorsDirectives

## Content

Package [akka.http.scaladsl.server.directives](package-summary.html)
## Interface CorsDirectives

- All Known Subinterfaces:
`[Directives](../Directives.html "interface in akka.http.scaladsl.server")`

All Known Implementing Classes:
`[CorsDirectives$](CorsDirectives$.html "class in akka.http.scaladsl.server.directives")`, `[Directives$](../Directives$.html "class in akka.http.scaladsl.server")`, `[HttpApp](../HttpApp.html "class in akka.http.scaladsl.server")`

---

```
public interface CorsDirectives
```

Directives for CORS, cross origin requests.
 
 For an overview on how CORS works, see the MDN web docs page on CORS: https://developer.mozilla.org/en\-US/docs/Web/HTTP/CORS
 CORS is part of the WHATWG Fetch "Living Standard" https://fetch.spec.whatwg.org/\#http\-cors\-protocol
 

 This implementation is based on the akka\-http\-cors project by Lomig Mégard, licensed under the Apache License, Version 2\.0\.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit>` | `[cors](#cors())()` | Wraps its inner route with support for the CORS mechanism, enabling cross origin requests using the default cors  configuration from the actor system. |
	| `[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit>` | `[cors](#cors(akka.http.scaladsl.settings.CorsSettings))​([CorsSettings](../../settings/CorsSettings.html "interface in akka.http.scaladsl.settings") settings)` | Wraps its inner route with support for the CORS mechanism, enabling cross origin requests using the given cors  settings. |

- - ### Method Detail
	
	
	
		- #### cors
		
		
		
		```
		[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit> cors()
		```
		
		Wraps its inner route with support for the CORS mechanism, enabling cross origin requests using the default cors
		 configuration from the actor system.
		
		Returns:
		(undocumented)
		- #### cors
		
		
		
		```
		[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit> cors​([CorsSettings](../../settings/CorsSettings.html "interface in akka.http.scaladsl.settings") settings)
		```
		
		Wraps its inner route with support for the CORS mechanism, enabling cross origin requests using the given cors
		 settings.
		
		Parameters:
		`settings` \- (undocumented)
		Returns:
		(undocumented)

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/Directive.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/Directives$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/Directives.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/HttpApp.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/CorsDirectives$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/settings/CorsSettings.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/CorsDirectives.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/CorsDirectives.html)*