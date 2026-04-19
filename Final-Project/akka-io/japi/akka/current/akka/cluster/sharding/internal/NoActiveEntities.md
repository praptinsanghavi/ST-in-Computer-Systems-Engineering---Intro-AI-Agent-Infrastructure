---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:08:31Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/sharding/internal/NoActiveEntities.html
title: NoActiveEntities
---

# NoActiveEntities

## Content

Package [akka.cluster.sharding.internal](package-summary.html)
## Class NoActiveEntities

- java.lang.Object
- - akka.cluster.sharding.internal.NoActiveEntities

- ---

```
public class NoActiveEntities
extends java.lang.Object
```

INTERNAL API
 
 Disabled ActiveEntities (for no window in composite passivation strategies).

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[NoActiveEntities](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static boolean` | `[isActive](#isActive(java.lang.String))​(java.lang.String id)` |  |
	| `static void` | `[remove](#remove(java.lang.String))​(java.lang.String id)` |  |
	| `static scala.collection.immutable.Seq<java.lang.String>` | `[removeIdle](#removeIdle(scala.concurrent.duration.FiniteDuration))​(scala.concurrent.duration.FiniteDuration timeout)` |  |
	| `static <any>` | `[select](#select())()` |  |
	| `static int` | `[size](#size())()` |  |
	| `static scala.collection.immutable.Seq<java.lang.String>` | `[update](#update(java.lang.String))​(java.lang.String id)` |  |
	| `static scala.collection.immutable.Seq<java.lang.String>` | `[updateLimit](#updateLimit(int))​(int newLimit)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### NoActiveEntities
		
		
		
		```
		public NoActiveEntities()
		```

	- ### Method Detail
	
	
	
		- #### size
		
		
		
		```
		public static int size()
		```
		- #### isActive
		
		
		
		```
		public static boolean isActive​(java.lang.String id)
		```
		- #### updateLimit
		
		
		
		```
		public static scala.collection.immutable.Seq<java.lang.String> updateLimit​(int newLimit)
		```
		- #### update
		
		
		
		```
		public static scala.collection.immutable.Seq<java.lang.String> update​(java.lang.String id)
		```
		- #### select
		
		
		
		```
		public static <any> select()
		```
		- #### remove
		
		
		
		```
		public static void remove​(java.lang.String id)
		```
		- #### removeIdle
		
		
		
		```
		public static scala.collection.immutable.Seq<java.lang.String> removeIdle​(scala.concurrent.duration.FiniteDuration timeout)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/internal/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/sharding/internal/NoActiveEntities.html](https://doc.akka.io/japi/akka/current/akka/cluster/sharding/internal/NoActiveEntities.html)*