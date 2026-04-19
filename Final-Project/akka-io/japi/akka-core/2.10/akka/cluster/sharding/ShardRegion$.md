---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:25:20Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/ShardRegion$.html
title: ShardRegion$
---

# ShardRegion$

## Content

Package [akka.cluster.sharding](package-summary.html)
## Class ShardRegion$

- java.lang.Object
- - akka.cluster.sharding.ShardRegion$

- ---

```
public class ShardRegion$
extends java.lang.Object
```

See Also:
[`ClusterSharding extension`](ClusterSharding$.html "class in akka.cluster.sharding")

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ShardRegion$](ShardRegion$.html "class in akka.cluster.sharding")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ShardRegion$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `akka.cluster.sharding.ShardRegion.GetCurrentRegions$` | `[getCurrentRegionsInstance](#getCurrentRegionsInstance())()` | Java API: Send this message to the `ShardRegion` actor to request for `CurrentRegions`,  which contains the addresses of all registered regions. |
	| `akka.cluster.sharding.ShardRegion.GetShardRegionStats$` | `[getRegionStatsInstance](#getRegionStatsInstance())()` | Java API: |
	| `akka.cluster.sharding.ShardRegion.GetShardRegionState$` | `[getShardRegionStateInstance](#getShardRegionStateInstance())()` | Java API: |
	| `akka.cluster.sharding.ShardRegion.GracefulShutdown$` | `[gracefulShutdownInstance](#gracefulShutdownInstance())()` | Java API: Send this message to the `ShardRegion` actor to handoff all shards that are hosted by  the `ShardRegion` and then the `ShardRegion` actor will be stopped. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ShardRegion$](ShardRegion$.html "class in akka.cluster.sharding") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ShardRegion$
		
		
		
		```
		public ShardRegion$()
		```

	- ### Method Detail
	
	
	
		- #### gracefulShutdownInstance
		
		
		
		```
		public akka.cluster.sharding.ShardRegion.GracefulShutdown$ gracefulShutdownInstance()
		```
		
		Java API: Send this message to the `ShardRegion` actor to handoff all shards that are hosted by
		 the `ShardRegion` and then the `ShardRegion` actor will be stopped. You can `watch`
		 it to know when it is completed.
		- #### getCurrentRegionsInstance
		
		
		
		```
		public akka.cluster.sharding.ShardRegion.GetCurrentRegions$ getCurrentRegionsInstance()
		```
		
		Java API: Send this message to the `ShardRegion` actor to request for `CurrentRegions`,
		 which contains the addresses of all registered regions.
		 
		 Intended for testing purpose to see when cluster sharding is "ready" or to monitor
		 the state of the shard regions.
		- #### getRegionStatsInstance
		
		
		
		```
		public akka.cluster.sharding.ShardRegion.GetShardRegionStats$ getRegionStatsInstance()
		```
		
		Java API:
		- #### getShardRegionStateInstance
		
		
		
		```
		public akka.cluster.sharding.ShardRegion.GetShardRegionState$ getShardRegionStateInstance()
		```
		
		Java API:

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/ClusterSharding$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/ShardRegion$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/ShardRegion$.html](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/ShardRegion$.html)*