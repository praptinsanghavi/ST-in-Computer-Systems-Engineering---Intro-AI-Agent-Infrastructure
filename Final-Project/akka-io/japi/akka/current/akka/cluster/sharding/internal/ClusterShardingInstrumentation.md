---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:08:13Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/sharding/internal/ClusterShardingInstrumentation.html
title: ClusterShardingInstrumentation
---

# ClusterShardingInstrumentation

## Content

Package [akka.cluster.sharding.internal](package-summary.html)
## Interface ClusterShardingInstrumentation

- All Known Implementing Classes:
`[ClusterShardingTelemetryEnsemble](ClusterShardingTelemetryEnsemble.html "class in akka.cluster.sharding.internal")`, `[EmptyClusterShardingInstrumentation](EmptyClusterShardingInstrumentation.html "class in akka.cluster.sharding.internal")`, `[EmptyClusterShardingInstrumentation$](EmptyClusterShardingInstrumentation$.html "class in akka.cluster.sharding.internal")`

---

```
public interface ClusterShardingInstrumentation
```

INTERNAL API: Instrumentation SPI for Akka Cluster.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `scala.collection.immutable.Seq<java.lang.String>` | `[dependencies](#dependencies())()` | Optional dependencies for this instrumentation. |
	| `void` | `[messageDropped](#messageDropped(java.lang.String))​(java.lang.String typeName)` |  |
	| `void` | `[receivedShardHome](#receivedShardHome(java.lang.String,java.lang.String))​(java.lang.String typeName,  java.lang.String shardId)` |  |
	| `void` | `[regionRequestedShardHome](#regionRequestedShardHome(java.lang.String,java.lang.String))​(java.lang.String typeName,  java.lang.String shardId)` |  |
	| `void` | `[shardHandoffFinished](#shardHandoffFinished(java.lang.String,java.lang.String,boolean))​(java.lang.String typeName,  java.lang.String shard,  boolean ok)` |  |
	| `void` | `[shardHandoffStarted](#shardHandoffStarted(java.lang.String,java.lang.String))​(java.lang.String typeName,  java.lang.String shard)` |  |
	| `void` | `[shardRegionBufferSize](#shardRegionBufferSize(java.lang.String,int))​(java.lang.String typeName,  int size)` |  |
	| `void` | `[shardRegionBufferSizeIncremented](#shardRegionBufferSizeIncremented(java.lang.String))​(java.lang.String typeName)` |  |

- - ### Method Detail
	
	
	
		- #### dependencies
		
		
		
		```
		scala.collection.immutable.Seq<java.lang.String> dependencies()
		```
		
		Optional dependencies for this instrumentation.
		 
		 Dependency instrumentations will always be ordered before this instrumentation.
		 
		
		
		
		Returns:
		list of class names for optional instrumentation dependencies
		- #### messageDropped
		
		
		
		```
		void messageDropped​(java.lang.String typeName)
		```
		- #### receivedShardHome
		
		
		
		```
		void receivedShardHome​(java.lang.String typeName,
		                       java.lang.String shardId)
		```
		- #### regionRequestedShardHome
		
		
		
		```
		void regionRequestedShardHome​(java.lang.String typeName,
		                              java.lang.String shardId)
		```
		- #### shardHandoffFinished
		
		
		
		```
		void shardHandoffFinished​(java.lang.String typeName,
		                          java.lang.String shard,
		                          boolean ok)
		```
		- #### shardHandoffStarted
		
		
		
		```
		void shardHandoffStarted​(java.lang.String typeName,
		                         java.lang.String shard)
		```
		- #### shardRegionBufferSize
		
		
		
		```
		void shardRegionBufferSize​(java.lang.String typeName,
		                           int size)
		```
		- #### shardRegionBufferSizeIncremented
		
		
		
		```
		void shardRegionBufferSizeIncremented​(java.lang.String typeName)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/internal/ClusterShardingTelemetryEnsemble.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/internal/EmptyClusterShardingInstrumentation$.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/internal/EmptyClusterShardingInstrumentation.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/internal/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/sharding/internal/ClusterShardingInstrumentation.html](https://doc.akka.io/japi/akka/current/akka/cluster/sharding/internal/ClusterShardingInstrumentation.html)*