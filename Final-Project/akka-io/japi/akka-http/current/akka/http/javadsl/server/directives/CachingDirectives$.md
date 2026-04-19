---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:48:44Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/directives/CachingDirectives$.html
title: CachingDirectives$
---

# CachingDirectives$

## Content

Package [akka.http.javadsl.server.directives](package-summary.html)
## Class CachingDirectives$

- java.lang.Object
- - akka.http.javadsl.server.directives.CachingDirectives$

- ---

```
public class CachingDirectives$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [CachingDirectives$](CachingDirectives$.html "class in akka.http.javadsl.server.directives")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[CachingDirectives$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<K> [RouteAdapter](RouteAdapter.html "class in akka.http.javadsl.server.directives")` | `[alwaysCache](#alwaysCache(akka.http.caching.javadsl.Cache,scala.PartialFunction,java.util.function.Supplier))​([Cache](../../../caching/javadsl/Cache.html "interface in akka.http.caching.javadsl")<K,​[RouteResult](../RouteResult.html "interface in akka.http.javadsl.server")> cache,  scala.PartialFunction<[RequestContext](../RequestContext.html "class in akka.http.javadsl.server"),​K> keyer,  java.util.function.Supplier<[Route](../Route.html "interface in akka.http.javadsl.server")> inner)` | Wraps its inner Route with caching support using the given `Cache` implementation and  keyer function. |
	| `<K> [RouteAdapter](RouteAdapter.html "class in akka.http.javadsl.server.directives")` | `[cache](#cache(akka.http.caching.javadsl.Cache,scala.PartialFunction,java.util.function.Supplier))​([Cache](../../../caching/javadsl/Cache.html "interface in akka.http.caching.javadsl")<K,​[RouteResult](../RouteResult.html "interface in akka.http.javadsl.server")> cache,  scala.PartialFunction<[RequestContext](../RequestContext.html "class in akka.http.javadsl.server"),​K> keyer,  java.util.function.Supplier<[Route](../Route.html "interface in akka.http.javadsl.server")> inner)` | Wraps its inner Route with caching support using the given [`Cache`](../../../caching/scaladsl/Cache.html "class in akka.http.caching.scaladsl") implementation and  keyer function. |
	| `[RouteAdapter](RouteAdapter.html "class in akka.http.javadsl.server.directives")` | `[cachingProhibited](#cachingProhibited(java.util.function.Supplier))​(java.util.function.Supplier<[Route](../Route.html "interface in akka.http.javadsl.server")> inner)` | Passes only requests to the inner route that explicitly forbid caching with a `Cache-Control` header with either  a `no-cache` or `max-age=0` setting. |
	| `<K> [Cache](../../../caching/javadsl/Cache.html "interface in akka.http.caching.javadsl")<K,​[RouteResult](../RouteResult.html "interface in akka.http.javadsl.server")>` | `[routeCache](#routeCache(akka.http.caching.javadsl.CachingSettings))​([CachingSettings](../../../caching/javadsl/CachingSettings.html "class in akka.http.caching.javadsl") settings)` | Creates an `LfuCache` |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [CachingDirectives$](CachingDirectives$.html "class in akka.http.javadsl.server.directives") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### CachingDirectives$
		
		
		
		```
		public CachingDirectives$()
		```

	- ### Method Detail
	
	
	
		- #### cache
		
		
		
		```
		public <K> [RouteAdapter](RouteAdapter.html "class in akka.http.javadsl.server.directives") cache​([Cache](../../../caching/javadsl/Cache.html "interface in akka.http.caching.javadsl")<K,​[RouteResult](../RouteResult.html "interface in akka.http.javadsl.server")> cache,
		                              scala.PartialFunction<[RequestContext](../RequestContext.html "class in akka.http.javadsl.server"),​K> keyer,
		                              java.util.function.Supplier<[Route](../Route.html "interface in akka.http.javadsl.server")> inner)
		```
		
		Wraps its inner Route with caching support using the given [`Cache`](../../../caching/scaladsl/Cache.html "class in akka.http.caching.scaladsl") implementation and
		 keyer function.
		 
		 Use `JavaPartialFunction` to build the `keyer`.
		
		
		
		Parameters:
		`cache` \- (undocumented)
		`keyer` \- (undocumented)
		`inner` \- (undocumented)
		Returns:
		(undocumented)
		- #### cachingProhibited
		
		
		
		```
		public [RouteAdapter](RouteAdapter.html "class in akka.http.javadsl.server.directives") cachingProhibited​(java.util.function.Supplier<[Route](../Route.html "interface in akka.http.javadsl.server")> inner)
		```
		
		Passes only requests to the inner route that explicitly forbid caching with a `Cache-Control` header with either
		 a `no-cache` or `max-age=0` setting.
		
		Parameters:
		`inner` \- (undocumented)
		Returns:
		(undocumented)
		- #### alwaysCache
		
		
		
		```
		public <K> [RouteAdapter](RouteAdapter.html "class in akka.http.javadsl.server.directives") alwaysCache​([Cache](../../../caching/javadsl/Cache.html "interface in akka.http.caching.javadsl")<K,​[RouteResult](../RouteResult.html "interface in akka.http.javadsl.server")> cache,
		                                    scala.PartialFunction<[RequestContext](../RequestContext.html "class in akka.http.javadsl.server"),​K> keyer,
		                                    java.util.function.Supplier<[Route](../Route.html "interface in akka.http.javadsl.server")> inner)
		```
		
		Wraps its inner Route with caching support using the given `Cache` implementation and
		 keyer function. Note that routes producing streaming responses cannot be wrapped with this directive.
		
		Parameters:
		`cache` \- (undocumented)
		`keyer` \- (undocumented)
		`inner` \- (undocumented)
		Returns:
		(undocumented)
		- #### routeCache
		
		
		
		```
		public <K> [Cache](../../../caching/javadsl/Cache.html "interface in akka.http.caching.javadsl")<K,​[RouteResult](../RouteResult.html "interface in akka.http.javadsl.server")> routeCache​([CachingSettings](../../../caching/javadsl/CachingSettings.html "class in akka.http.caching.javadsl") settings)
		```
		
		Creates an `LfuCache`
		
		 Default settings are available via `akka.http.caching.javadsl.CachingSettings.create`.
		
		
		
		Parameters:
		`settings` \- (undocumented)
		Returns:
		(undocumented)

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/caching/javadsl/Cache.html
- https://doc.akka.io/japi/akka-http/current/akka/http/caching/javadsl/CachingSettings.html
- https://doc.akka.io/japi/akka-http/current/akka/http/caching/scaladsl/Cache.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/RequestContext.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/Route.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/RouteResult.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/directives/CachingDirectives$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/directives/RouteAdapter.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/directives/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/directives/CachingDirectives$.html](https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/directives/CachingDirectives$.html)*