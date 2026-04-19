---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:12:11Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/scaladsl/StartEntity$.html
title: StartEntity$
---

# StartEntity$

## Content

Package [akka.cluster.sharding.typed.scaladsl](package-summary.html)
## Class StartEntity$

- java.lang.Object
- - akka.cluster.sharding.typed.scaladsl.StartEntity$

- ---

```
public class StartEntity$
extends java.lang.Object
```

Allows starting a specific Sharded Entity by its entity identifier

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [StartEntity$](StartEntity$.html "class in akka.cluster.sharding.typed.scaladsl")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[StartEntity$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<M> [ShardingEnvelope](../ShardingEnvelope.html "class in akka.cluster.sharding.typed")<M>` | `[apply](#apply(java.lang.String))​(java.lang.String entityId)` | Returns `ShardingEnvelope` which can be sent via Cluster Sharding in order to wake up the  specified (by `entityId`) Sharded Entity, ''without'' delivering a real message to it. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [StartEntity$](StartEntity$.html "class in akka.cluster.sharding.typed.scaladsl") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### StartEntity$
		
		
		
		```
		public StartEntity$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public <M> [ShardingEnvelope](../ShardingEnvelope.html "class in akka.cluster.sharding.typed")<M> apply​(java.lang.String entityId)
		```
		
		Returns `ShardingEnvelope` which can be sent via Cluster Sharding in order to wake up the
		 specified (by `entityId`) Sharded Entity, ''without'' delivering a real message to it.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/ShardingEnvelope.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/scaladsl/StartEntity$.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/scaladsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/scaladsl/StartEntity$.html](https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/scaladsl/StartEntity$.html)*