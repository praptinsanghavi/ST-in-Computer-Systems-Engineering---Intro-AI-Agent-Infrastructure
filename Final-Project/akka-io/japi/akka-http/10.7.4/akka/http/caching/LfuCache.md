---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T22:58:25Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/10.7.4/akka/http/caching/LfuCache.html
title: LfuCache
---

# LfuCache

## Content

Package [akka.http.caching](package-summary.html)
## Class LfuCache\<K,​V\>

- java.lang.Object
- - [akka.http.caching.scaladsl.Cache](scaladsl/Cache.html "class in akka.http.caching.scaladsl")\<K,​V\>
	- - akka.http.caching.LfuCache\<K,​V\>

- All Implemented Interfaces:
`[Cache](javadsl/Cache.html "interface in akka.http.caching.javadsl")<K,​V>`

---

```
public class LfuCache<K,​V>
extends [Cache](scaladsl/Cache.html "class in akka.http.caching.scaladsl")<K,​V>
```

INTERNAL API

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[LfuCache](#%3Cinit%3E(com.github.benmanes.caffeine.cache.AsyncCache))​(com.github.benmanes.caffeine.cache.AsyncCache<[K](LfuCache.html "type parameter in LfuCache"),​[V](LfuCache.html "type parameter in LfuCache")> store)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `scala.concurrent.Future<[V](LfuCache.html "type parameter in LfuCache")>` | `[apply](#apply(K,scala.Function0))​([K](LfuCache.html "type parameter in LfuCache") key,  scala.Function0<scala.concurrent.Future<[V](LfuCache.html "type parameter in LfuCache")>> genValue)` | Returns either the cached Future for the given key or evaluates the given value generating  function producing a `Future[V]`. |
	| `void` | `[clear](#clear())()` | Clears the cache by removing all entries. |
	| `static <K,​V>[Cache](javadsl/Cache.html "interface in akka.http.caching.javadsl")<K,​V>` | `[create](#create(akka.actor.ActorSystem))​(akka.actor.ActorSystem system)` | Java API  Creates a new [`LfuCache`](LfuCache.html "class in akka.http.caching") using configuration of the system,  with optional expiration depending on whether a non\-zero and finite timeToLive and/or timeToIdle is set or not. |
	| `static <K,​V>[Cache](javadsl/Cache.html "interface in akka.http.caching.javadsl")<K,​V>` | `[create](#create(akka.http.caching.javadsl.CachingSettings))​([CachingSettings](javadsl/CachingSettings.html "class in akka.http.caching.javadsl") settings)` | Java API  Creates a new [`LfuCache`](LfuCache.html "class in akka.http.caching"), with optional expiration depending  on whether a non\-zero and finite timeToLive and/or timeToIdle is set or not. |
	| `scala.Option<scala.concurrent.Future<[V](LfuCache.html "type parameter in LfuCache")>>` | `[get](#get(K))​([K](LfuCache.html "type parameter in LfuCache") key)` | Retrieves the future instance that is currently in the cache for the given key. |
	| `scala.concurrent.Future<[V](LfuCache.html "type parameter in LfuCache")>` | `[getOrLoad](#getOrLoad(K,scala.Function1))​([K](LfuCache.html "type parameter in LfuCache") key,  scala.Function1<[K](LfuCache.html "type parameter in LfuCache"),​scala.concurrent.Future<[V](LfuCache.html "type parameter in LfuCache")>> loadValue)` | Returns either the cached Future for the given key, or applies the given value loading  function on the key, producing a `Future[V]`. |
	| `scala.collection.immutable.Set<[K](LfuCache.html "type parameter in LfuCache")>` | `[keys](#keys())()` | Returns the set of keys in the cache, in no particular order  Should return in roughly constant time. |
	| `scala.concurrent.Future<[V](LfuCache.html "type parameter in LfuCache")>` | `[put](#put(K,scala.concurrent.Future,scala.concurrent.ExecutionContext))​([K](LfuCache.html "type parameter in LfuCache") key,  scala.concurrent.Future<[V](LfuCache.html "type parameter in LfuCache")> mayBeValue,  scala.concurrent.ExecutionContext ex)` | Multiple call to put method for the same key may result in a race condition,  the value yield by the last successful future for that key will replace any previously cached value. |
	| `void` | `[remove](#remove(K))​([K](LfuCache.html "type parameter in LfuCache") key)` | Removes the cache item for the given key. |
	| `int` | `[size](#size())()` | Returns the upper bound for the number of currently cached entries. |
	| `com.github.benmanes.caffeine.cache.AsyncCache<[K](LfuCache.html "type parameter in LfuCache"),​[V](LfuCache.html "type parameter in LfuCache")>` | `[store](#store())()` |  |
	| `static <K,​V>java.util.function.BiFunction<K,​java.util.concurrent.Executor,​java.util.concurrent.CompletableFuture<V>>` | `[toJavaMappingFunction](#toJavaMappingFunction(scala.Function0))​(scala.Function0<scala.concurrent.Future<V>> genValue)` |  |
	| `static <K,​V>java.util.function.BiFunction<K,​java.util.concurrent.Executor,​java.util.concurrent.CompletableFuture<V>>` | `[toJavaMappingFunction](#toJavaMappingFunction(scala.Function1))​(scala.Function1<K,​scala.concurrent.Future<V>> loadValue)` |  |
	
	
		- ### Methods inherited from class akka.http.caching.scaladsl.[Cache](scaladsl/Cache.html "class in akka.http.caching.scaladsl")
		
		
		`[apply](scaladsl/Cache.html#apply(K,scala.Function1)), [get](scaladsl/Cache.html#get(K,scala.Function0)), [getFuture](scaladsl/Cache.html#getFuture(K,akka.japi.Creator)), [getKeys](scaladsl/Cache.html#getKeys()), [getOptional](scaladsl/Cache.html#getOptional(K)), [getOrCreateStrict](scaladsl/Cache.html#getOrCreateStrict(K,akka.japi.Creator)), [getOrFulfil](scaladsl/Cache.html#getOrFulfil(K,akka.japi.Procedure))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### LfuCache
		
		
		
		```
		public LfuCache​(com.github.benmanes.caffeine.cache.AsyncCache<[K](LfuCache.html "type parameter in LfuCache"),​[V](LfuCache.html "type parameter in LfuCache")> store)
		```

	- ### Method Detail
	
	
	
		- #### create
		
		
		
		```
		public static <K,​V> [Cache](javadsl/Cache.html "interface in akka.http.caching.javadsl")<K,​V> create​(akka.actor.ActorSystem system)
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
		public static <K,​V> [Cache](javadsl/Cache.html "interface in akka.http.caching.javadsl")<K,​V> create​([CachingSettings](javadsl/CachingSettings.html "class in akka.http.caching.javadsl") settings)
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
		public static <K,​V> java.util.function.BiFunction<K,​java.util.concurrent.Executor,​java.util.concurrent.CompletableFuture<V>> toJavaMappingFunction​(scala.Function0<scala.concurrent.Future<V>> genValue)
		```
		- #### toJavaMappingFunction
		
		
		
		```
		public static <K,​V> java.util.function.BiFunction<K,​java.util.concurrent.Executor,​java.util.concurrent.CompletableFuture<V>> toJavaMappingFunction​(scala.Function1<K,​scala.concurrent.Future<V>> loadValue)
		```
		- #### store
		
		
		
		```
		public com.github.benmanes.caffeine.cache.AsyncCache<[K](LfuCache.html "type parameter in LfuCache"),​[V](LfuCache.html "type parameter in LfuCache")> store()
		```
		- #### get
		
		
		
		```
		public scala.Option<scala.concurrent.Future<[V](LfuCache.html "type parameter in LfuCache")>> get​([K](LfuCache.html "type parameter in LfuCache") key)
		```
		
		Description copied from class: `[Cache](scaladsl/Cache.html#get(K))`
		Retrieves the future instance that is currently in the cache for the given key.
		 Returns None if the key has no corresponding cache entry.
		
		Specified by:
		`[get](scaladsl/Cache.html#get(K))` in class `[Cache](scaladsl/Cache.html "class in akka.http.caching.scaladsl")<[K](LfuCache.html "type parameter in LfuCache"),​[V](LfuCache.html "type parameter in LfuCache")>`
		Parameters:
		`key` \- (undocumented)
		Returns:
		(undocumented)
		- #### apply
		
		
		
		```
		public scala.concurrent.Future<[V](LfuCache.html "type parameter in LfuCache")> apply​([K](LfuCache.html "type parameter in LfuCache") key,
		                                        scala.Function0<scala.concurrent.Future<[V](LfuCache.html "type parameter in LfuCache")>> genValue)
		```
		
		Description copied from class: `[Cache](scaladsl/Cache.html#apply(K,scala.Function0))`
		Returns either the cached Future for the given key or evaluates the given value generating
		 function producing a `Future[V]`.
		
		Specified by:
		`[apply](scaladsl/Cache.html#apply(K,scala.Function0))` in class `[Cache](scaladsl/Cache.html "class in akka.http.caching.scaladsl")<[K](LfuCache.html "type parameter in LfuCache"),​[V](LfuCache.html "type parameter in LfuCache")>`
		Parameters:
		`key` \- (undocumented)
		`genValue` \- (undocumented)
		Returns:
		(undocumented)
		- #### put
		
		
		
		```
		public scala.concurrent.Future<[V](LfuCache.html "type parameter in LfuCache")> put​([K](LfuCache.html "type parameter in LfuCache") key,
		                                      scala.concurrent.Future<[V](LfuCache.html "type parameter in LfuCache")> mayBeValue,
		                                      scala.concurrent.ExecutionContext ex)
		```
		
		Multiple call to put method for the same key may result in a race condition,
		 the value yield by the last successful future for that key will replace any previously cached value.
		
		Specified by:
		`[put](scaladsl/Cache.html#put(K,scala.concurrent.Future,scala.concurrent.ExecutionContext))` in class `[Cache](scaladsl/Cache.html "class in akka.http.caching.scaladsl")<[K](LfuCache.html "type parameter in LfuCache"),​[V](LfuCache.html "type parameter in LfuCache")>`
		Parameters:
		`key` \- (undocumented)
		`mayBeValue` \- (undocumented)
		`ex` \- (undocumented)
		Returns:
		(undocumented)
		- #### getOrLoad
		
		
		
		```
		public scala.concurrent.Future<[V](LfuCache.html "type parameter in LfuCache")> getOrLoad​([K](LfuCache.html "type parameter in LfuCache") key,
		                                            scala.Function1<[K](LfuCache.html "type parameter in LfuCache"),​scala.concurrent.Future<[V](LfuCache.html "type parameter in LfuCache")>> loadValue)
		```
		
		Description copied from class: `[Cache](scaladsl/Cache.html#getOrLoad(K,scala.Function1))`
		Returns either the cached Future for the given key, or applies the given value loading
		 function on the key, producing a `Future[V]`.
		
		Specified by:
		`[getOrLoad](scaladsl/Cache.html#getOrLoad(K,scala.Function1))` in class `[Cache](scaladsl/Cache.html "class in akka.http.caching.scaladsl")<[K](LfuCache.html "type parameter in LfuCache"),​[V](LfuCache.html "type parameter in LfuCache")>`
		Parameters:
		`key` \- (undocumented)
		`loadValue` \- (undocumented)
		Returns:
		(undocumented)
		- #### remove
		
		
		
		```
		public void remove​([K](LfuCache.html "type parameter in LfuCache") key)
		```
		
		Description copied from class: `[Cache](scaladsl/Cache.html#remove(K))`
		Removes the cache item for the given key.
		
		Specified by:
		`[remove](javadsl/Cache.html#remove(K))` in interface `[Cache](javadsl/Cache.html "interface in akka.http.caching.javadsl")<[K](LfuCache.html "type parameter in LfuCache"),​[V](LfuCache.html "type parameter in LfuCache")>`
		Specified by:
		`[remove](scaladsl/Cache.html#remove(K))` in class `[Cache](scaladsl/Cache.html "class in akka.http.caching.scaladsl")<[K](LfuCache.html "type parameter in LfuCache"),​[V](LfuCache.html "type parameter in LfuCache")>`
		Parameters:
		`key` \- (undocumented)
		- #### clear
		
		
		
		```
		public void clear()
		```
		
		Description copied from class: `[Cache](scaladsl/Cache.html#clear())`
		Clears the cache by removing all entries.
		
		Specified by:
		`[clear](javadsl/Cache.html#clear())` in interface `[Cache](javadsl/Cache.html "interface in akka.http.caching.javadsl")<[K](LfuCache.html "type parameter in LfuCache"),​[V](LfuCache.html "type parameter in LfuCache")>`
		Specified by:
		`[clear](scaladsl/Cache.html#clear())` in class `[Cache](scaladsl/Cache.html "class in akka.http.caching.scaladsl")<[K](LfuCache.html "type parameter in LfuCache"),​[V](LfuCache.html "type parameter in LfuCache")>`
		- #### keys
		
		
		
		```
		public scala.collection.immutable.Set<[K](LfuCache.html "type parameter in LfuCache")> keys()
		```
		
		Description copied from class: `[Cache](scaladsl/Cache.html#keys())`
		Returns the set of keys in the cache, in no particular order
		 Should return in roughly constant time.
		 Note that this number might not reflect the exact keys of active, unexpired
		 cache entries, since expired entries are only evicted upon next access
		 (or by being thrown out by a capacity constraint).
		
		Specified by:
		`[keys](scaladsl/Cache.html#keys())` in class `[Cache](scaladsl/Cache.html "class in akka.http.caching.scaladsl")<[K](LfuCache.html "type parameter in LfuCache"),​[V](LfuCache.html "type parameter in LfuCache")>`
		Returns:
		(undocumented)
		- #### size
		
		
		
		```
		public int size()
		```
		
		Description copied from class: `[Cache](scaladsl/Cache.html#size())`
		Returns the upper bound for the number of currently cached entries.
		 Note that this number might not reflect the exact number of active, unexpired
		 cache entries, since expired entries are only evicted upon next access
		 (or by being thrown out by a capacity constraint).
		
		Specified by:
		`[size](javadsl/Cache.html#size())` in interface `[Cache](javadsl/Cache.html "interface in akka.http.caching.javadsl")<[K](LfuCache.html "type parameter in LfuCache"),​[V](LfuCache.html "type parameter in LfuCache")>`
		Specified by:
		`[size](scaladsl/Cache.html#size())` in class `[Cache](scaladsl/Cache.html "class in akka.http.caching.scaladsl")<[K](LfuCache.html "type parameter in LfuCache"),​[V](LfuCache.html "type parameter in LfuCache")>`
		Returns:
		(undocumented)

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/caching/LfuCache.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/caching/javadsl/Cache.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/caching/javadsl/CachingSettings.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/caching/package-summary.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/caching/scaladsl/Cache.html

---
*Source: [https://doc.akka.io/japi/akka-http/10.7.4/akka/http/caching/LfuCache.html](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/caching/LfuCache.html)*