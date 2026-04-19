---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:29:34Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/caching/LfuCache$.html
title: LfuCache$
---

# LfuCache$

## Content

Package [akka.http.caching](package-summary.html)
## Class LfuCache$

- java.lang.Object
- - akka.http.caching.LfuCache$

- ---

```
public class LfuCache$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [LfuCache$](LfuCache$.html "class in akka.http.caching")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[LfuCache$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<K,​V>[Cache](scaladsl/Cache.html "class in akka.http.caching.scaladsl")<K,​V>` | `[apply](#apply(akka.actor.ActorSystem))​(akka.actor.ActorSystem system)` |  |
	| `<K,​V>[Cache](scaladsl/Cache.html "class in akka.http.caching.scaladsl")<K,​V>` | `[apply](#apply(akka.http.caching.scaladsl.CachingSettings))​([CachingSettings](scaladsl/CachingSettings.html "class in akka.http.caching.scaladsl") cachingSettings)` | Creates a new [`LfuCache`](LfuCache.html "class in akka.http.caching"), with optional expiration depending  on whether a non\-zero and finite timeToLive and/or timeToIdle is set or not. |
	| `<K,​V>[Cache](javadsl/Cache.html "interface in akka.http.caching.javadsl")<K,​V>` | `[create](#create(akka.actor.ActorSystem))​(akka.actor.ActorSystem system)` | Java API  Creates a new [`LfuCache`](LfuCache.html "class in akka.http.caching") using configuration of the system,  with optional expiration depending on whether a non\-zero and finite timeToLive and/or timeToIdle is set or not. |
	| `<K,​V>[Cache](javadsl/Cache.html "interface in akka.http.caching.javadsl")<K,​V>` | `[create](#create(akka.http.caching.javadsl.CachingSettings))​([CachingSettings](javadsl/CachingSettings.html "class in akka.http.caching.javadsl") settings)` | Java API  Creates a new [`LfuCache`](LfuCache.html "class in akka.http.caching"), with optional expiration depending  on whether a non\-zero and finite timeToLive and/or timeToIdle is set or not. |
	| `<K,​V>java.util.function.BiFunction<K,​java.util.concurrent.Executor,​java.util.concurrent.CompletableFuture<V>>` | `[toJavaMappingFunction](#toJavaMappingFunction(scala.Function0))​(scala.Function0<scala.concurrent.Future<V>> genValue)` |  |
	| `<K,​V>java.util.function.BiFunction<K,​java.util.concurrent.Executor,​java.util.concurrent.CompletableFuture<V>>` | `[toJavaMappingFunction](#toJavaMappingFunction(scala.Function1))​(scala.Function1<K,​scala.concurrent.Future<V>> loadValue)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [LfuCache$](LfuCache$.html "class in akka.http.caching") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### LfuCache$
		
		
		
		```
		public LfuCache$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public <K,​V> [Cache](scaladsl/Cache.html "class in akka.http.caching.scaladsl")<K,​V> apply​(akka.actor.ActorSystem system)
		```
		- #### apply
		
		
		
		```
		public <K,​V> [Cache](scaladsl/Cache.html "class in akka.http.caching.scaladsl")<K,​V> apply​([CachingSettings](scaladsl/CachingSettings.html "class in akka.http.caching.scaladsl") cachingSettings)
		```
		
		Creates a new [`LfuCache`](LfuCache.html "class in akka.http.caching"), with optional expiration depending
		 on whether a non\-zero and finite timeToLive and/or timeToIdle is set or not.
		
		Parameters:
		`cachingSettings` \- (undocumented)
		Returns:
		(undocumented)
		- #### create
		
		
		
		```
		public <K,​V> [Cache](javadsl/Cache.html "interface in akka.http.caching.javadsl")<K,​V> create​(akka.actor.ActorSystem system)
		```
		
		Java API
		 Creates a new [`LfuCache`](LfuCache.html "class in akka.http.caching") using configuration of the system,
		 with optional expiration depending on whether a non\-zero and finite timeToLive and/or timeToIdle is set or not.
		
		Parameters:
		`system` \- (undocumented)
		Returns:
		(undocumented)
		- #### create
		
		
		
		```
		public <K,​V> [Cache](javadsl/Cache.html "interface in akka.http.caching.javadsl")<K,​V> create​([CachingSettings](javadsl/CachingSettings.html "class in akka.http.caching.javadsl") settings)
		```
		
		Java API
		 Creates a new [`LfuCache`](LfuCache.html "class in akka.http.caching"), with optional expiration depending
		 on whether a non\-zero and finite timeToLive and/or timeToIdle is set or not.
		
		Parameters:
		`settings` \- (undocumented)
		Returns:
		(undocumented)
		- #### toJavaMappingFunction
		
		
		
		```
		public <K,​V> java.util.function.BiFunction<K,​java.util.concurrent.Executor,​java.util.concurrent.CompletableFuture<V>> toJavaMappingFunction​(scala.Function0<scala.concurrent.Future<V>> genValue)
		```
		- #### toJavaMappingFunction
		
		
		
		```
		public <K,​V> java.util.function.BiFunction<K,​java.util.concurrent.Executor,​java.util.concurrent.CompletableFuture<V>> toJavaMappingFunction​(scala.Function1<K,​scala.concurrent.Future<V>> loadValue)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/caching/LfuCache$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/caching/LfuCache.html
- https://doc.akka.io/japi/akka-http/current/akka/http/caching/javadsl/Cache.html
- https://doc.akka.io/japi/akka-http/current/akka/http/caching/javadsl/CachingSettings.html
- https://doc.akka.io/japi/akka-http/current/akka/http/caching/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/caching/scaladsl/Cache.html
- https://doc.akka.io/japi/akka-http/current/akka/http/caching/scaladsl/CachingSettings.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/caching/LfuCache$.html](https://doc.akka.io/japi/akka-http/current/akka/http/caching/LfuCache$.html)*