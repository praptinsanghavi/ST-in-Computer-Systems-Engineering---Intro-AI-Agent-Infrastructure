---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:34:01Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/ShardingLogMarker$.html
title: ShardingLogMarker$
---

# ShardingLogMarker$

## Content

Package [akka.cluster.sharding](package-summary.html)
## Class ShardingLogMarker$

- java.lang.Object
- - akka.cluster.sharding.ShardingLogMarker$

- ---

```
public class ShardingLogMarker$
extends java.lang.Object
```

This is public with the purpose to document the used markers and properties of log events.
 No guarantee that it will remain binary compatible, but the marker names and properties
 are considered public API and will not be changed without notice.

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ShardingLogMarker$](ShardingLogMarker$.html "class in akka.cluster.sharding")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ShardingLogMarker$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[LogMarker](../../event/LogMarker.html "class in akka.event")` | `[shardAllocated](#shardAllocated(java.lang.String,java.lang.String,akka.actor.Address))​(java.lang.String shardTypeName,  java.lang.String shardId,  [Address](../../actor/Address.html "class in akka.actor") node)` | Marker "akkaShardAllocated" of log event when `ShardCoordinator` allocates a shard to a region. |
	| `[LogMarker](../../event/LogMarker.html "class in akka.event")` | `[shardStarted](#shardStarted(java.lang.String,java.lang.String))​(java.lang.String shardTypeName,  java.lang.String shardId)` | Marker "akkaShardStarted" of log event when `ShardRegion` starts a shard. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ShardingLogMarker$](ShardingLogMarker$.html "class in akka.cluster.sharding") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ShardingLogMarker$
		
		
		
		```
		public ShardingLogMarker$()
		```

	- ### Method Detail
	
	
	
		- #### shardAllocated
		
		
		
		```
		public [LogMarker](../../event/LogMarker.html "class in akka.event") shardAllocated​(java.lang.String shardTypeName,
		                                java.lang.String shardId,
		                                [Address](../../actor/Address.html "class in akka.actor") node)
		```
		
		Marker "akkaShardAllocated" of log event when `ShardCoordinator` allocates a shard to a region.
		
		Parameters:
		`shardTypeName` \- The `typeName` of the shard. Included as property "akkaShardTypeName".
		`shardId` \- The id of the shard. Included as property "akkaShardId".
		`node` \- The address of the node where the shard is allocated. Included as property "akkaRemoteAddress".
		- #### shardStarted
		
		
		
		```
		public [LogMarker](../../event/LogMarker.html "class in akka.event") shardStarted​(java.lang.String shardTypeName,
		                              java.lang.String shardId)
		```
		
		Marker "akkaShardStarted" of log event when `ShardRegion` starts a shard.
		
		Parameters:
		`shardTypeName` \- The `typeName` of the shard. Included as property "akkaShardTypeName".
		`shardId` \- The id of the shard. Included as property "akkaShardId".

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/Address.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/ShardingLogMarker$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/event/LogMarker.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/ShardingLogMarker$.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/ShardingLogMarker$.html)*