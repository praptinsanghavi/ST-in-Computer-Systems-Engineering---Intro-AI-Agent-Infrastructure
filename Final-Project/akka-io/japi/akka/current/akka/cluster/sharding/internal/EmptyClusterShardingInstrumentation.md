---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:08:26Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/sharding/internal/EmptyClusterShardingInstrumentation.html
title: EmptyClusterShardingInstrumentation
---

# EmptyClusterShardingInstrumentation

## Content

Package [akka.cluster.sharding.internal](package-summary.html)
## Class EmptyClusterShardingInstrumentation

- java.lang.Object
- - akka.cluster.sharding.internal.EmptyClusterShardingInstrumentation

- All Implemented Interfaces:
`[ClusterShardingInstrumentation](ClusterShardingInstrumentation.html "interface in akka.cluster.sharding.internal")`

Direct Known Subclasses:
`[EmptyClusterShardingInstrumentation$](EmptyClusterShardingInstrumentation$.html "class in akka.cluster.sharding.internal")`

---

```
public class EmptyClusterShardingInstrumentation
extends java.lang.Object
implements [ClusterShardingInstrumentation](ClusterShardingInstrumentation.html "interface in akka.cluster.sharding.internal")
```

INTERNAL API

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[EmptyClusterShardingInstrumentation](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `scala.collection.immutable.Seq<java.lang.String>` | `[dependencies](#dependencies())()` | Optional dependencies for this instrumentation. |
	| `void` | `[messageDropped](#messageDropped(java.lang.String))​(java.lang.String typeName)` |  |
	| `void` | `[receivedShardHome](#receivedShardHome(java.lang.String,java.lang.String))​(java.lang.String typeName,  java.lang.String shardId)` |  |
	| `void` | `[regionRequestedShardHome](#regionRequestedShardHome(java.lang.String,java.lang.String))​(java.lang.String typeName,  java.lang.String shardId)` |  |
	| `void` | `[shardHandoffFinished](#shardHandoffFinished(java.lang.String,java.lang.String,boolean))​(java.lang.String typeName,  java.lang.String shard,  boolean ok)` |  |
	| `void` | `[shardHandoffStarted](#shardHandoffStarted(java.lang.String,java.lang.String))​(java.lang.String typeName,  java.lang.String shard)` |  |
	| `void` | `[shardRegionBufferSize](#shardRegionBufferSize(java.lang.String,int))​(java.lang.String typeName,  int size)` |  |
	| `void` | `[shardRegionBufferSizeIncremented](#shardRegionBufferSizeIncremented(java.lang.String))​(java.lang.String typeName)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### EmptyClusterShardingInstrumentation
		
		
		
		```
		public EmptyClusterShardingInstrumentation()
		```

	- ### Method Detail
	
	
	
		- #### shardRegionBufferSize
		
		
		
		```
		public void shardRegionBufferSize​(java.lang.String typeName,
		                                  int size)
		```
		
		
		Specified by:
		`[shardRegionBufferSize](ClusterShardingInstrumentation.html#shardRegionBufferSize(java.lang.String,int))` in interface `[ClusterShardingInstrumentation](ClusterShardingInstrumentation.html "interface in akka.cluster.sharding.internal")`
		- #### shardRegionBufferSizeIncremented
		
		
		
		```
		public void shardRegionBufferSizeIncremented​(java.lang.String typeName)
		```
		
		
		Specified by:
		`[shardRegionBufferSizeIncremented](ClusterShardingInstrumentation.html#shardRegionBufferSizeIncremented(java.lang.String))` in interface `[ClusterShardingInstrumentation](ClusterShardingInstrumentation.html "interface in akka.cluster.sharding.internal")`
		- #### regionRequestedShardHome
		
		
		
		```
		public void regionRequestedShardHome​(java.lang.String typeName,
		                                     java.lang.String shardId)
		```
		
		
		Specified by:
		`[regionRequestedShardHome](ClusterShardingInstrumentation.html#regionRequestedShardHome(java.lang.String,java.lang.String))` in interface `[ClusterShardingInstrumentation](ClusterShardingInstrumentation.html "interface in akka.cluster.sharding.internal")`
		- #### receivedShardHome
		
		
		
		```
		public void receivedShardHome​(java.lang.String typeName,
		                              java.lang.String shardId)
		```
		
		
		Specified by:
		`[receivedShardHome](ClusterShardingInstrumentation.html#receivedShardHome(java.lang.String,java.lang.String))` in interface `[ClusterShardingInstrumentation](ClusterShardingInstrumentation.html "interface in akka.cluster.sharding.internal")`
		- #### messageDropped
		
		
		
		```
		public void messageDropped​(java.lang.String typeName)
		```
		
		
		Specified by:
		`[messageDropped](ClusterShardingInstrumentation.html#messageDropped(java.lang.String))` in interface `[ClusterShardingInstrumentation](ClusterShardingInstrumentation.html "interface in akka.cluster.sharding.internal")`
		- #### shardHandoffStarted
		
		
		
		```
		public void shardHandoffStarted​(java.lang.String typeName,
		                                java.lang.String shard)
		```
		
		
		Specified by:
		`[shardHandoffStarted](ClusterShardingInstrumentation.html#shardHandoffStarted(java.lang.String,java.lang.String))` in interface `[ClusterShardingInstrumentation](ClusterShardingInstrumentation.html "interface in akka.cluster.sharding.internal")`
		- #### shardHandoffFinished
		
		
		
		```
		public void shardHandoffFinished​(java.lang.String typeName,
		                                 java.lang.String shard,
		                                 boolean ok)
		```
		
		
		Specified by:
		`[shardHandoffFinished](ClusterShardingInstrumentation.html#shardHandoffFinished(java.lang.String,java.lang.String,boolean))` in interface `[ClusterShardingInstrumentation](ClusterShardingInstrumentation.html "interface in akka.cluster.sharding.internal")`
		- #### dependencies
		
		
		
		```
		public scala.collection.immutable.Seq<java.lang.String> dependencies()
		```
		
		Description copied from interface: `[ClusterShardingInstrumentation](ClusterShardingInstrumentation.html#dependencies())`
		Optional dependencies for this instrumentation.
		 
		 Dependency instrumentations will always be ordered before this instrumentation.
		 
		
		
		
		Specified by:
		`[dependencies](ClusterShardingInstrumentation.html#dependencies())` in interface `[ClusterShardingInstrumentation](ClusterShardingInstrumentation.html "interface in akka.cluster.sharding.internal")`
		Returns:
		list of class names for optional instrumentation dependencies

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/internal/ClusterShardingInstrumentation.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/internal/EmptyClusterShardingInstrumentation$.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/internal/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/sharding/internal/EmptyClusterShardingInstrumentation.html](https://doc.akka.io/japi/akka/current/akka/cluster/sharding/internal/EmptyClusterShardingInstrumentation.html)*