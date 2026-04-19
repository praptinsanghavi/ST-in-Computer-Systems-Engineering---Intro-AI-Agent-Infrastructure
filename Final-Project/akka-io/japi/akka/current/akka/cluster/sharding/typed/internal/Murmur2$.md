---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:11:21Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/internal/Murmur2$.html
title: Murmur2$
---

# Murmur2$

## Content

Package [akka.cluster.sharding.typed.internal](package-summary.html)
## Class Murmur2$

- java.lang.Object
- - akka.cluster.sharding.typed.internal.Murmur2$

- ---

```
public class Murmur2$
extends java.lang.Object
```

INTERNAL API

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Murmur2$](Murmur2$.html "class in akka.cluster.sharding.typed.internal")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Murmur2$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `int` | `[murmur2](#murmur2(byte%5B%5D))​(byte[] data)` |  |
	| `java.lang.String` | `[shardId](#shardId(java.lang.String,int))​(java.lang.String entityId,  int nrShards)` |  |
	| `int` | `[toPositive](#toPositive(int))​(int number)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [Murmur2$](Murmur2$.html "class in akka.cluster.sharding.typed.internal") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Murmur2$
		
		
		
		```
		public Murmur2$()
		```

	- ### Method Detail
	
	
	
		- #### toPositive
		
		
		
		```
		public int toPositive​(int number)
		```
		- #### murmur2
		
		
		
		```
		public int murmur2​(byte[] data)
		```
		- #### shardId
		
		
		
		```
		public java.lang.String shardId​(java.lang.String entityId,
		                                int nrShards)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/internal/Murmur2$.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/internal/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/internal/Murmur2$.html](https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/internal/Murmur2$.html)*