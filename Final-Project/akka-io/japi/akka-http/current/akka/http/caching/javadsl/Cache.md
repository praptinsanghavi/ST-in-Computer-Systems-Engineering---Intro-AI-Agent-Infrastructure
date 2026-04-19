---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:29:34Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/caching/javadsl/Cache.html
title: Cache
---

# Cache

## Content

Package [akka.http.caching.javadsl](package-summary.html)
## Interface Cache\<K,​V\>

- All Known Implementing Classes:
`[Cache](../scaladsl/Cache.html "class in akka.http.caching.scaladsl")`, `[LfuCache](../LfuCache.html "class in akka.http.caching")`

---

```
@ApiMayChange
@DoNotInherit
public interface Cache<K,​V>
```

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `void` | `[clear](#clear())()` | Clears the cache by removing all entries. |
	| `java.util.concurrent.CompletionStage<[V](Cache.html "type parameter in Cache")>` | `[getFuture](#getFuture(K,akka.japi.Creator))​([K](Cache.html "type parameter in Cache") key,  akka.japi.Creator<java.util.concurrent.CompletionStage<[V](Cache.html "type parameter in Cache")>> genValue)` | Returns either the cached CompletionStage for the given key or evaluates the given value generating  function producing a \`CompletionStage\`. |
	| `java.util.Set<[K](Cache.html "type parameter in Cache")>` | `[getKeys](#getKeys())()` | Returns the set of keys in the cache, in no particular order  Should return in roughly constant time. |
	| `java.util.Optional<java.util.concurrent.CompletionStage<[V](Cache.html "type parameter in Cache")>>` | `[getOptional](#getOptional(K))​([K](Cache.html "type parameter in Cache") key)` | Retrieves the CompletionStage instance that is currently in the cache for the given key. |
	| `java.util.concurrent.CompletionStage<[V](Cache.html "type parameter in Cache")>` | `[getOrCreateStrict](#getOrCreateStrict(K,akka.japi.Creator))​([K](Cache.html "type parameter in Cache") key,  akka.japi.Creator<[V](Cache.html "type parameter in Cache")> block)` | Returns either the cached CompletionStage for the given key or the given value as a CompletionStage |
	| `java.util.concurrent.CompletionStage<[V](Cache.html "type parameter in Cache")>` | `[getOrFulfil](#getOrFulfil(K,akka.japi.Procedure))​([K](Cache.html "type parameter in Cache") key,  akka.japi.Procedure<java.util.concurrent.CompletableFuture<[V](Cache.html "type parameter in Cache")>> f)` | Returns either the cached `CompletionStage` for the key, or evaluates the given function which  should lead to eventual completion of the completable future. |
	| `void` | `[remove](#remove(K))​([K](Cache.html "type parameter in Cache") key)` | Removes the cache item for the given key. |
	| `int` | `[size](#size())()` | Returns the upper bound for the number of currently cached entries. |

- - ### Method Detail
	
	
	
		- #### getFuture
		
		
		
		```
		java.util.concurrent.CompletionStage<[V](Cache.html "type parameter in Cache")> getFuture​([K](Cache.html "type parameter in Cache") key,
		                                                  akka.japi.Creator<java.util.concurrent.CompletionStage<[V](Cache.html "type parameter in Cache")>> genValue)
		```
		
		Returns either the cached CompletionStage for the given key or evaluates the given value generating
		 function producing a \`CompletionStage\`.
		- #### getOrFulfil
		
		
		
		```
		java.util.concurrent.CompletionStage<[V](Cache.html "type parameter in Cache")> getOrFulfil​([K](Cache.html "type parameter in Cache") key,
		                                                    akka.japi.Procedure<java.util.concurrent.CompletableFuture<[V](Cache.html "type parameter in Cache")>> f)
		```
		
		Returns either the cached `CompletionStage` for the key, or evaluates the given function which
		 should lead to eventual completion of the completable future.
		- #### getOrCreateStrict
		
		
		
		```
		java.util.concurrent.CompletionStage<[V](Cache.html "type parameter in Cache")> getOrCreateStrict​([K](Cache.html "type parameter in Cache") key,
		                                                          akka.japi.Creator<[V](Cache.html "type parameter in Cache")> block)
		```
		
		Returns either the cached CompletionStage for the given key or the given value as a CompletionStage
		- #### getOptional
		
		
		
		```
		java.util.Optional<java.util.concurrent.CompletionStage<[V](Cache.html "type parameter in Cache")>> getOptional​([K](Cache.html "type parameter in Cache") key)
		```
		
		Retrieves the CompletionStage instance that is currently in the cache for the given key.
		 Returns None if the key has no corresponding cache entry.
		- #### remove
		
		
		
		```
		void remove​([K](Cache.html "type parameter in Cache") key)
		```
		
		Removes the cache item for the given key.
		- #### clear
		
		
		
		```
		void clear()
		```
		
		Clears the cache by removing all entries.
		- #### getKeys
		
		
		
		```
		java.util.Set<[K](Cache.html "type parameter in Cache")> getKeys()
		```
		
		Returns the set of keys in the cache, in no particular order
		 Should return in roughly constant time.
		 Note that this number might not reflect the exact keys of active, unexpired
		 cache entries, since expired entries are only evicted upon next access
		 (or by being thrown out by a capacity constraint).
		- #### size
		
		
		
		```
		int size()
		```
		
		Returns the upper bound for the number of currently cached entries.
		 Note that this number might not reflect the exact number of active, unexpired
		 cache entries, since expired entries are only evicted upon next access
		 (or by being thrown out by a capacity constraint).

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/caching/LfuCache.html
- https://doc.akka.io/japi/akka-http/current/akka/http/caching/javadsl/Cache.html
- https://doc.akka.io/japi/akka-http/current/akka/http/caching/javadsl/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/caching/scaladsl/Cache.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/caching/javadsl/Cache.html](https://doc.akka.io/japi/akka-http/current/akka/http/caching/javadsl/Cache.html)*