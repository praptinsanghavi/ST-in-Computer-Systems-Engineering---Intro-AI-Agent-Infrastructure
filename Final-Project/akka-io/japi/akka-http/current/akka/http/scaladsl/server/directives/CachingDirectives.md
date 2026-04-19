---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:39:40Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/CachingDirectives.html
title: CachingDirectives
---

# CachingDirectives

## Content

Package [akka.http.scaladsl.server.directives](package-summary.html)
## Interface CachingDirectives

- All Known Implementing Classes:
`[CachingDirectives$](CachingDirectives$.html "class in akka.http.scaladsl.server.directives")`

---

```
public interface CachingDirectives
```

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `<K> [Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit>` | `[alwaysCache](#alwaysCache(akka.http.caching.scaladsl.Cache,scala.PartialFunction))​([Cache](../../../caching/scaladsl/Cache.html "class in akka.http.caching.scaladsl")<K,​[RouteResult](../RouteResult.html "interface in akka.http.scaladsl.server")> cache,  scala.PartialFunction<[RequestContext](../RequestContext.html "interface in akka.http.scaladsl.server"),​K> keyer)` | Wraps its inner Route with caching support using the given `Cache` implementation and  keyer function. |
	| `<K> [Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit>` | `[cache](#cache(akka.http.caching.scaladsl.Cache,scala.PartialFunction))​([Cache](../../../caching/scaladsl/Cache.html "class in akka.http.caching.scaladsl")<K,​[RouteResult](../RouteResult.html "interface in akka.http.scaladsl.server")> cache,  scala.PartialFunction<[RequestContext](../RequestContext.html "interface in akka.http.scaladsl.server"),​K> keyer)` | Wraps its inner Route with caching support using the given `Cache` implementation and  keyer function. |
	| `[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit>` | `[cachingProhibited](#cachingProhibited())()` | Passes only requests to the inner route that explicitly forbid caching with a `Cache-Control` header with either  a `no-cache` or `max-age=0` setting. |
	| `<K> [Cache](../../../caching/scaladsl/Cache.html "class in akka.http.caching.scaladsl")<K,​[RouteResult](../RouteResult.html "interface in akka.http.scaladsl.server")>` | `[routeCache](#routeCache(akka.actor.ActorSystem))​(akka.actor.ActorSystem s)` | Creates an `LfuCache` with default settings obtained from the system's configuration. |
	| `<K> [Cache](../../../caching/scaladsl/Cache.html "class in akka.http.caching.scaladsl")<K,​[RouteResult](../RouteResult.html "interface in akka.http.scaladsl.server")>` | `[routeCache](#routeCache(akka.http.caching.scaladsl.CachingSettings))​([CachingSettings](../../../caching/scaladsl/CachingSettings.html "class in akka.http.caching.scaladsl") settings)` | Creates an `LfuCache`. |

- - ### Method Detail
	
	
	
		- #### cache
		
		
		
		```
		<K> [Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit> cache​([Cache](../../../caching/scaladsl/Cache.html "class in akka.http.caching.scaladsl")<K,​[RouteResult](../RouteResult.html "interface in akka.http.scaladsl.server")> cache,
		                                             scala.PartialFunction<[RequestContext](../RequestContext.html "interface in akka.http.scaladsl.server"),​K> keyer)
		```
		
		Wraps its inner Route with caching support using the given `Cache` implementation and
		 keyer function.
		
		Parameters:
		`cache` \- (undocumented)
		`keyer` \- (undocumented)
		Returns:
		(undocumented)
		- #### cachingProhibited
		
		
		
		```
		[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit> cachingProhibited()
		```
		
		Passes only requests to the inner route that explicitly forbid caching with a `Cache-Control` header with either
		 a `no-cache` or `max-age=0` setting.
		
		Returns:
		(undocumented)
		- #### alwaysCache
		
		
		
		```
		<K> [Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit> alwaysCache​([Cache](../../../caching/scaladsl/Cache.html "class in akka.http.caching.scaladsl")<K,​[RouteResult](../RouteResult.html "interface in akka.http.scaladsl.server")> cache,
		                                                   scala.PartialFunction<[RequestContext](../RequestContext.html "interface in akka.http.scaladsl.server"),​K> keyer)
		```
		
		Wraps its inner Route with caching support using the given `Cache` implementation and
		 keyer function. Note that routes producing streaming responses cannot be wrapped with this directive.
		
		Parameters:
		`cache` \- (undocumented)
		`keyer` \- (undocumented)
		Returns:
		(undocumented)
		- #### routeCache
		
		
		
		```
		<K> [Cache](../../../caching/scaladsl/Cache.html "class in akka.http.caching.scaladsl")<K,​[RouteResult](../RouteResult.html "interface in akka.http.scaladsl.server")> routeCache​(akka.actor.ActorSystem s)
		```
		
		Creates an `LfuCache` with default settings obtained from the system's configuration.
		
		Parameters:
		`s` \- (undocumented)
		Returns:
		(undocumented)
		- #### routeCache
		
		
		
		```
		<K> [Cache](../../../caching/scaladsl/Cache.html "class in akka.http.caching.scaladsl")<K,​[RouteResult](../RouteResult.html "interface in akka.http.scaladsl.server")> routeCache​([CachingSettings](../../../caching/scaladsl/CachingSettings.html "class in akka.http.caching.scaladsl") settings)
		```
		
		Creates an `LfuCache`.
		
		Parameters:
		`settings` \- (undocumented)
		Returns:
		(undocumented)

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/caching/scaladsl/Cache.html
- https://doc.akka.io/japi/akka-http/current/akka/http/caching/scaladsl/CachingSettings.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/Directive.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/RequestContext.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/RouteResult.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/CachingDirectives$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/CachingDirectives.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/CachingDirectives.html)*