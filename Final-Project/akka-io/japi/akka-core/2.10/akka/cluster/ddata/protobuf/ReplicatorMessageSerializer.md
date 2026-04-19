---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:41:40Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/ReplicatorMessageSerializer.SmallCache.html
title: ReplicatorMessageSerializer.SmallCache
---

# ReplicatorMessageSerializer.SmallCache

## Content

Package [akka.cluster.ddata.protobuf](package-summary.html)
## Class ReplicatorMessageSerializer.SmallCache\<A,​B\>

- java.lang.Object
- - akka.cluster.ddata.protobuf.ReplicatorMessageSerializer.SmallCache\<A,​B\>

- Enclosing class:
[ReplicatorMessageSerializer](ReplicatorMessageSerializer.html "class in akka.cluster.ddata.protobuf")

---

```
public static final class ReplicatorMessageSerializer.SmallCache<A,​B>
extends java.lang.Object
```

A cache that is designed for a small number (\<\= 32\) of
 entries. It is using instance equality.
 Adding new entry overwrites oldest. It is
 thread safe but duplicates of same entry may occur.
 
`evict` must be called from the outside, i.e. the
 cache will not cleanup itself.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[SmallCache](#%3Cinit%3E(int,scala.concurrent.duration.FiniteDuration,scala.Function1))​(int size,  scala.concurrent.duration.FiniteDuration timeToLive,  scala.Function1<[A](ReplicatorMessageSerializer.SmallCache.html "type parameter in ReplicatorMessageSerializer.SmallCache"),​[B](ReplicatorMessageSerializer.SmallCache.html "type parameter in ReplicatorMessageSerializer.SmallCache")> getOrAddFactory)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `void` | `[add](#add(A,B))​([A](ReplicatorMessageSerializer.SmallCache.html "type parameter in ReplicatorMessageSerializer.SmallCache") a,  [B](ReplicatorMessageSerializer.SmallCache.html "type parameter in ReplicatorMessageSerializer.SmallCache") b)` | Add entry to the cache. |
	| `void` | `[add](#add(scala.Tuple2))​(scala.Tuple2<[A](ReplicatorMessageSerializer.SmallCache.html "type parameter in ReplicatorMessageSerializer.SmallCache"),​[B](ReplicatorMessageSerializer.SmallCache.html "type parameter in ReplicatorMessageSerializer.SmallCache")> x)` |  |
	| `void` | `[evict](#evict())()` | Remove all elements if the cache has not been  used within the `timeToLive`. |
	| `[B](ReplicatorMessageSerializer.SmallCache.html "type parameter in ReplicatorMessageSerializer.SmallCache")` | `[get](#get(A))​([A](ReplicatorMessageSerializer.SmallCache.html "type parameter in ReplicatorMessageSerializer.SmallCache") a)` | Get value from cache or `null` if it doesn't exist. |
	| `[B](ReplicatorMessageSerializer.SmallCache.html "type parameter in ReplicatorMessageSerializer.SmallCache")` | `[getOrAdd](#getOrAdd(A))​([A](ReplicatorMessageSerializer.SmallCache.html "type parameter in ReplicatorMessageSerializer.SmallCache") a)` | Get value from cache or create new value with the  `getOrAddFactory` that was given in the constructor. |
	| `java.lang.String` | `[toString](#toString())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### SmallCache
		
		
		
		```
		public SmallCache​(int size,
		                  scala.concurrent.duration.FiniteDuration timeToLive,
		                  scala.Function1<[A](ReplicatorMessageSerializer.SmallCache.html "type parameter in ReplicatorMessageSerializer.SmallCache"),​[B](ReplicatorMessageSerializer.SmallCache.html "type parameter in ReplicatorMessageSerializer.SmallCache")> getOrAddFactory)
		```

	- ### Method Detail
	
	
	
		- #### add
		
		
		
		```
		public void add​([A](ReplicatorMessageSerializer.SmallCache.html "type parameter in ReplicatorMessageSerializer.SmallCache") a,
		                [B](ReplicatorMessageSerializer.SmallCache.html "type parameter in ReplicatorMessageSerializer.SmallCache") b)
		```
		
		Add entry to the cache.
		 Overwrites oldest entry.
		- #### add
		
		
		
		```
		public void add​(scala.Tuple2<[A](ReplicatorMessageSerializer.SmallCache.html "type parameter in ReplicatorMessageSerializer.SmallCache"),​[B](ReplicatorMessageSerializer.SmallCache.html "type parameter in ReplicatorMessageSerializer.SmallCache")> x)
		```
		- #### evict
		
		
		
		```
		public void evict()
		```
		
		Remove all elements if the cache has not been
		 used within the `timeToLive`.
		- #### get
		
		
		
		```
		public [B](ReplicatorMessageSerializer.SmallCache.html "type parameter in ReplicatorMessageSerializer.SmallCache") get​([A](ReplicatorMessageSerializer.SmallCache.html "type parameter in ReplicatorMessageSerializer.SmallCache") a)
		```
		
		Get value from cache or `null` if it doesn't exist.
		- #### getOrAdd
		
		
		
		```
		public [B](ReplicatorMessageSerializer.SmallCache.html "type parameter in ReplicatorMessageSerializer.SmallCache") getOrAdd​([A](ReplicatorMessageSerializer.SmallCache.html "type parameter in ReplicatorMessageSerializer.SmallCache") a)
		```
		
		Get value from cache or create new value with the
		 `getOrAddFactory` that was given in the constructor. The new
		 value is added to the cache. Duplicates of same value may be added
		 if multiple threads call this concurrently, but decent
		 (low cost) effort is made to reduce the chance of duplicates.
		- #### toString
		
		
		
		```
		public java.lang.String toString()
		```
		
		
		Overrides:
		`toString` in class `java.lang.Object`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/ReplicatorMessageSerializer.SmallCache.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/ReplicatorMessageSerializer.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/ReplicatorMessageSerializer.SmallCache.html](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/ReplicatorMessageSerializer.SmallCache.html)*