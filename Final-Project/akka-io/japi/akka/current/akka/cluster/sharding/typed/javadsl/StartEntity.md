---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:12:02Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/javadsl/StartEntity.html
title: StartEntity
---

# StartEntity

## Content

Package [akka.cluster.sharding.typed.javadsl](package-summary.html)
## Class StartEntity

- java.lang.Object
- - akka.cluster.sharding.typed.javadsl.StartEntity

- ---

```
public class StartEntity
extends java.lang.Object
```

Allows starting a specific Sharded Entity by its entity identifier

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[StartEntity](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static <M> [ShardingEnvelope](../ShardingEnvelope.html "class in akka.cluster.sharding.typed")<M>` | `[create](#create(java.lang.Class,java.lang.String))​(java.lang.Class<M> msgClass,  java.lang.String entityId)` | Returns `ShardingEnvelope` which can be sent via Cluster Sharding in order to wake up the  specified (by `entityId`) Sharded Entity, ''without'' delivering a real message to it. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### StartEntity
		
		
		
		```
		public StartEntity()
		```

	- ### Method Detail
	
	
	
		- #### create
		
		
		
		```
		public static <M> [ShardingEnvelope](../ShardingEnvelope.html "class in akka.cluster.sharding.typed")<M> create​(java.lang.Class<M> msgClass,
		                                             java.lang.String entityId)
		```
		
		Returns `ShardingEnvelope` which can be sent via Cluster Sharding in order to wake up the
		 specified (by `entityId`) Sharded Entity, ''without'' delivering a real message to it.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/ShardingEnvelope.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/javadsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/javadsl/StartEntity.html](https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/javadsl/StartEntity.html)*