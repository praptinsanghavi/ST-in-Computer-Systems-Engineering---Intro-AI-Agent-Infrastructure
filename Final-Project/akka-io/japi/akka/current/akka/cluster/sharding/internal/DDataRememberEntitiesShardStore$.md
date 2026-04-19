---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:08:24Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/sharding/internal/DDataRememberEntitiesShardStore$.html
title: DDataRememberEntitiesShardStore$
---

# DDataRememberEntitiesShardStore$

## Content

Package [akka.cluster.sharding.internal](package-summary.html)
## Class DDataRememberEntitiesShardStore$

- java.lang.Object
- - akka.cluster.sharding.internal.DDataRememberEntitiesShardStore$

- ---

```
public class DDataRememberEntitiesShardStore$
extends java.lang.Object
```

INTERNAL API

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [DDataRememberEntitiesShardStore$](DDataRememberEntitiesShardStore$.html "class in akka.cluster.sharding.internal")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[DDataRememberEntitiesShardStore$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[Props](../../../actor/Props.html "class in akka.actor")` | `[props](#props(java.lang.String,java.lang.String,akka.cluster.sharding.ClusterShardingSettings,akka.actor.ActorRef,int))​(java.lang.String shardId,  java.lang.String typeName,  [ClusterShardingSettings](../ClusterShardingSettings.html "class in akka.cluster.sharding") settings,  [ActorRef](../../../actor/ActorRef.html "class in akka.actor") replicator,  int majorityMinCap)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [DDataRememberEntitiesShardStore$](DDataRememberEntitiesShardStore$.html "class in akka.cluster.sharding.internal") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### DDataRememberEntitiesShardStore$
		
		
		
		```
		public DDataRememberEntitiesShardStore$()
		```

	- ### Method Detail
	
	
	
		- #### props
		
		
		
		```
		public [Props](../../../actor/Props.html "class in akka.actor") props​(java.lang.String shardId,
		                   java.lang.String typeName,
		                   [ClusterShardingSettings](../ClusterShardingSettings.html "class in akka.cluster.sharding") settings,
		                   [ActorRef](../../../actor/ActorRef.html "class in akka.actor") replicator,
		                   int majorityMinCap)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka/current/akka/actor/Props.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/ClusterShardingSettings.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/internal/DDataRememberEntitiesShardStore$.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/internal/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/sharding/internal/DDataRememberEntitiesShardStore$.html](https://doc.akka.io/japi/akka/current/akka/cluster/sharding/internal/DDataRememberEntitiesShardStore$.html)*