---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:29:37Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/caching/scaladsl/Cache.html
title: Cache
---

# Cache

## Content

Package [akka.http.caching.scaladsl](package-summary.html)
## Class Cache\<K,​V\>

- java.lang.Object
- - akka.http.caching.scaladsl.Cache\<K,​V\>

- All Implemented Interfaces:
`[Cache](../javadsl/Cache.html "interface in akka.http.caching.javadsl")<K,​V>`

Direct Known Subclasses:
`[LfuCache](../LfuCache.html "class in akka.http.caching")`

---

```
public abstract class Cache<K,​V>
extends java.lang.Object
implements [Cache](../javadsl/Cache.html "interface in akka.http.caching.javadsl")<K,​V>
```

API MAY CHANGE
 
 General interface implemented by all akka\-http cache implementations.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Cache](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `abstract scala.concurrent.Future<[V](Cache.html "type parameter in Cache")>` | `[apply](#apply(K,scala.Function0))​([K](Cache.html "type parameter in Cache") key,  scala.Function0<scala.concurrent.Future<[V](Cache.html "type parameter in Cache")>> genValue)` | Returns either the cached Future for the given key or evaluates the given value generating  function producing a `Future[V]`. |
	| `scala.concurrent.Future<[V](Cache.html "type parameter in Cache")>` | `[apply](#apply(K,scala.Function1))​([K](Cache.html "type parameter in Cache") key,  scala.Function1<scala.concurrent.Promise<[V](Cache.html "type parameter in Cache")>,​scala.runtime.BoxedUnit> f)` | Returns either the cached Future for the key or evaluates the given function which  should lead to eventual completion of the promise. |
	| `abstract void` | `[clear](#clear())()` | Clears the cache by removing all entries. |
	| `abstract scala.Option<scala.concurrent.Future<[V](Cache.html "type parameter in Cache")>>` | `[get](#get(K))​([K](Cache.html "type parameter in Cache") key)` | Retrieves the future instance that is currently in the cache for the given key. |
	| `scala.concurrent.Future<[V](Cache.html "type parameter in Cache")>` | `[get](#get(K,scala.Function0))​([K](Cache.html "type parameter in Cache") key,  scala.Function0<[V](Cache.html "type parameter in Cache")> block)` | Returns either the cached Future for the given key or the given value as a Future |
	| `java.util.concurrent.CompletionStage<[V](Cache.html "type parameter in Cache")>` | `[getFuture](#getFuture(K,akka.japi.Creator))​([K](Cache.html "type parameter in Cache") key,  akka.japi.Creator<java.util.concurrent.CompletionStage<[V](Cache.html "type parameter in Cache")>> genValue)` | Returns either the cached CompletionStage for the given key or evaluates the given value generating  function producing a \`CompletionStage\`. |
	| `java.util.Set<[K](Cache.html "type parameter in Cache")>` | `[getKeys](#getKeys())()` | Returns the set of keys in the cache, in no particular order  Should return in roughly constant time. |
	| `java.util.Optional<java.util.concurrent.CompletionStage<[V](Cache.html "type parameter in Cache")>>` | `[getOptional](#getOptional(K))​([K](Cache.html "type parameter in Cache") key)` | Retrieves the CompletionStage instance that is currently in the cache for the given key. |
	| `java.util.concurrent.CompletionStage<[V](Cache.html "type parameter in Cache")>` | `[getOrCreateStrict](#getOrCreateStrict(K,akka.japi.Creator))​([K](Cache.html "type parameter in Cache") key,  akka.japi.Creator<[V](Cache.html "type parameter in Cache")> block)` | Returns either the cached CompletionStage for the given key or the given value as a CompletionStage |
	| `java.util.concurrent.CompletionStage<[V](Cache.html "type parameter in Cache")>` | `[getOrFulfil](#getOrFulfil(K,akka.japi.Procedure))​([K](Cache.html "type parameter in Cache") key,  akka.japi.Procedure<java.util.concurrent.CompletableFuture<[V](Cache.html "type parameter in Cache")>> f)` | Returns either the cached `CompletionStage` for the key, or evaluates the given function which  should lead to eventual completion of the completable future. |
	| `abstract scala.concurrent.Future<[V](Cache.html "type parameter in Cache")>` | `[getOrLoad](#getOrLoad(K,scala.Function1))​([K](Cache.html "type parameter in Cache") key,  scala.Function1<[K](Cache.html "type parameter in Cache"),​scala.concurrent.Future<[V](Cache.html "type parameter in Cache")>> loadValue)` | Returns either the cached Future for the given key, or applies the given value loading  function on the key, producing a `Future[V]`. |
	| `abstract scala.collection.immutable.Set<[K](Cache.html "type parameter in Cache")>` | `[keys](#keys())()` | Returns the set of keys in the cache, in no particular order  Should return in roughly constant time. |
	| `abstract scala.concurrent.Future<[V](Cache.html "type parameter in Cache")>` | `[put](#put(K,scala.concurrent.Future,scala.concurrent.ExecutionContext))​([K](Cache.html "type parameter in Cache") key,  scala.concurrent.Future<[V](Cache.html "type parameter in Cache")> mayBeValue,  scala.concurrent.ExecutionContext ex)` | Cache the given future if not cached previously. |
	| `abstract void` | `[remove](#remove(K))​([K](Cache.html "type parameter in Cache") key)` | Removes the cache item for the given key. |
	| `abstract int` | `[size](#size())()` | Returns the upper bound for the number of currently cached entries. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### Cache
		
		
		
		```
		public Cache()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public abstract scala.concurrent.Future<[V](Cache.html "type parameter in Cache")> apply​([K](Cache.html "type parameter in Cache") key,
		                                                 scala.Function0<scala.concurrent.Future<[V](Cache.html "type parameter in Cache")>> genValue)
		```
		
		Returns either the cached Future for the given key or evaluates the given value generating
		 function producing a `Future[V]`.
		
		Parameters:
		`key` \- (undocumented)
		`genValue` \- (undocumented)
		Returns:
		(undocumented)
		- #### apply
		
		
		
		```
		public scala.concurrent.Future<[V](Cache.html "type parameter in Cache")> apply​([K](Cache.html "type parameter in Cache") key,
		                                        scala.Function1<scala.concurrent.Promise<[V](Cache.html "type parameter in Cache")>,​scala.runtime.BoxedUnit> f)
		```
		
		Returns either the cached Future for the key or evaluates the given function which
		 should lead to eventual completion of the promise.
		
		Parameters:
		`key` \- (undocumented)
		`f` \- (undocumented)
		Returns:
		(undocumented)
		- #### clear
		
		
		
		```
		public abstract void clear()
		```
		
		Clears the cache by removing all entries.
		
		Specified by:
		`[clear](../javadsl/Cache.html#clear())` in interface `[Cache](../javadsl/Cache.html "interface in akka.http.caching.javadsl")<[K](Cache.html "type parameter in Cache"),​[V](Cache.html "type parameter in Cache")>`
		- #### get
		
		
		
		```
		public scala.concurrent.Future<[V](Cache.html "type parameter in Cache")> get​([K](Cache.html "type parameter in Cache") key,
		                                      scala.Function0<[V](Cache.html "type parameter in Cache")> block)
		```
		
		Returns either the cached Future for the given key or the given value as a Future
		
		Parameters:
		`key` \- (undocumented)
		`block` \- (undocumented)
		Returns:
		(undocumented)
		- #### get
		
		
		
		```
		public abstract scala.Option<scala.concurrent.Future<[V](Cache.html "type parameter in Cache")>> get​([K](Cache.html "type parameter in Cache") key)
		```
		
		Retrieves the future instance that is currently in the cache for the given key.
		 Returns None if the key has no corresponding cache entry.
		
		Parameters:
		`key` \- (undocumented)
		Returns:
		(undocumented)
		- #### getFuture
		
		
		
		```
		public final java.util.concurrent.CompletionStage<[V](Cache.html "type parameter in Cache")> getFuture​([K](Cache.html "type parameter in Cache") key,
		                                                               akka.japi.Creator<java.util.concurrent.CompletionStage<[V](Cache.html "type parameter in Cache")>> genValue)
		```
		
		Description copied from interface: `[Cache](../javadsl/Cache.html#getFuture(K,akka.japi.Creator))`
		Returns either the cached CompletionStage for the given key or evaluates the given value generating
		 function producing a \`CompletionStage\`.
		
		Specified by:
		`[getFuture](../javadsl/Cache.html#getFuture(K,akka.japi.Creator))` in interface `[Cache](../javadsl/Cache.html "interface in akka.http.caching.javadsl")<[K](Cache.html "type parameter in Cache"),​[V](Cache.html "type parameter in Cache")>`
		- #### getKeys
		
		
		
		```
		public java.util.Set<[K](Cache.html "type parameter in Cache")> getKeys()
		```
		
		Description copied from interface: `[Cache](../javadsl/Cache.html#getKeys())`
		Returns the set of keys in the cache, in no particular order
		 Should return in roughly constant time.
		 Note that this number might not reflect the exact keys of active, unexpired
		 cache entries, since expired entries are only evicted upon next access
		 (or by being thrown out by a capacity constraint).
		
		Specified by:
		`[getKeys](../javadsl/Cache.html#getKeys())` in interface `[Cache](../javadsl/Cache.html "interface in akka.http.caching.javadsl")<[K](Cache.html "type parameter in Cache"),​[V](Cache.html "type parameter in Cache")>`
		- #### getOptional
		
		
		
		```
		public java.util.Optional<java.util.concurrent.CompletionStage<[V](Cache.html "type parameter in Cache")>> getOptional​([K](Cache.html "type parameter in Cache") key)
		```
		
		Description copied from interface: `[Cache](../javadsl/Cache.html#getOptional(K))`
		Retrieves the CompletionStage instance that is currently in the cache for the given key.
		 Returns None if the key has no corresponding cache entry.
		
		Specified by:
		`[getOptional](../javadsl/Cache.html#getOptional(K))` in interface `[Cache](../javadsl/Cache.html "interface in akka.http.caching.javadsl")<[K](Cache.html "type parameter in Cache"),​[V](Cache.html "type parameter in Cache")>`
		- #### getOrCreateStrict
		
		
		
		```
		public java.util.concurrent.CompletionStage<[V](Cache.html "type parameter in Cache")> getOrCreateStrict​([K](Cache.html "type parameter in Cache") key,
		                                                                 akka.japi.Creator<[V](Cache.html "type parameter in Cache")> block)
		```
		
		Returns either the cached CompletionStage for the given key or the given value as a CompletionStage
		
		Specified by:
		`[getOrCreateStrict](../javadsl/Cache.html#getOrCreateStrict(K,akka.japi.Creator))` in interface `[Cache](../javadsl/Cache.html "interface in akka.http.caching.javadsl")<[K](Cache.html "type parameter in Cache"),​[V](Cache.html "type parameter in Cache")>`
		Parameters:
		`key` \- (undocumented)
		`block` \- (undocumented)
		Returns:
		(undocumented)
		- #### getOrFulfil
		
		
		
		```
		public final java.util.concurrent.CompletionStage<[V](Cache.html "type parameter in Cache")> getOrFulfil​([K](Cache.html "type parameter in Cache") key,
		                                                                 akka.japi.Procedure<java.util.concurrent.CompletableFuture<[V](Cache.html "type parameter in Cache")>> f)
		```
		
		Description copied from interface: `[Cache](../javadsl/Cache.html#getOrFulfil(K,akka.japi.Procedure))`
		Returns either the cached `CompletionStage` for the key, or evaluates the given function which
		 should lead to eventual completion of the completable future.
		
		Specified by:
		`[getOrFulfil](../javadsl/Cache.html#getOrFulfil(K,akka.japi.Procedure))` in interface `[Cache](../javadsl/Cache.html "interface in akka.http.caching.javadsl")<[K](Cache.html "type parameter in Cache"),​[V](Cache.html "type parameter in Cache")>`
		- #### getOrLoad
		
		
		
		```
		public abstract scala.concurrent.Future<[V](Cache.html "type parameter in Cache")> getOrLoad​([K](Cache.html "type parameter in Cache") key,
		                                                     scala.Function1<[K](Cache.html "type parameter in Cache"),​scala.concurrent.Future<[V](Cache.html "type parameter in Cache")>> loadValue)
		```
		
		Returns either the cached Future for the given key, or applies the given value loading
		 function on the key, producing a `Future[V]`.
		
		Parameters:
		`key` \- (undocumented)
		`loadValue` \- (undocumented)
		Returns:
		(undocumented)
		- #### keys
		
		
		
		```
		public abstract scala.collection.immutable.Set<[K](Cache.html "type parameter in Cache")> keys()
		```
		
		Returns the set of keys in the cache, in no particular order
		 Should return in roughly constant time.
		 Note that this number might not reflect the exact keys of active, unexpired
		 cache entries, since expired entries are only evicted upon next access
		 (or by being thrown out by a capacity constraint).
		
		Returns:
		(undocumented)
		- #### put
		
		
		
		```
		public abstract scala.concurrent.Future<[V](Cache.html "type parameter in Cache")> put​([K](Cache.html "type parameter in Cache") key,
		                                               scala.concurrent.Future<[V](Cache.html "type parameter in Cache")> mayBeValue,
		                                               scala.concurrent.ExecutionContext ex)
		```
		
		Cache the given future if not cached previously.
		 Or replace the old cached value on successful completion of given future.
		 In case the given future fails, the previously cached value for that key (if any) will remain unchanged.
		
		Parameters:
		`key` \- (undocumented)
		`mayBeValue` \- (undocumented)
		`ex` \- (undocumented)
		Returns:
		(undocumented)
		- #### remove
		
		
		
		```
		public abstract void remove​([K](Cache.html "type parameter in Cache") key)
		```
		
		Removes the cache item for the given key.
		
		Specified by:
		`[remove](../javadsl/Cache.html#remove(K))` in interface `[Cache](../javadsl/Cache.html "interface in akka.http.caching.javadsl")<[K](Cache.html "type parameter in Cache"),​[V](Cache.html "type parameter in Cache")>`
		Parameters:
		`key` \- (undocumented)
		- #### size
		
		
		
		```
		public abstract int size()
		```
		
		Returns the upper bound for the number of currently cached entries.
		 Note that this number might not reflect the exact number of active, unexpired
		 cache entries, since expired entries are only evicted upon next access
		 (or by being thrown out by a capacity constraint).
		
		Specified by:
		`[size](../javadsl/Cache.html#size())` in interface `[Cache](../javadsl/Cache.html "interface in akka.http.caching.javadsl")<[K](Cache.html "type parameter in Cache"),​[V](Cache.html "type parameter in Cache")>`
		Returns:
		(undocumented)

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/caching/LfuCache.html
- https://doc.akka.io/japi/akka-http/current/akka/http/caching/javadsl/Cache.html
- https://doc.akka.io/japi/akka-http/current/akka/http/caching/scaladsl/Cache.html
- https://doc.akka.io/japi/akka-http/current/akka/http/caching/scaladsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/caching/scaladsl/Cache.html](https://doc.akka.io/japi/akka-http/current/akka/http/caching/scaladsl/Cache.html)*