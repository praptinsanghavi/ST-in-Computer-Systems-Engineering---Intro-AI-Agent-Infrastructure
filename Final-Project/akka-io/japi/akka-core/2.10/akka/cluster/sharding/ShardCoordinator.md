---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:35:03Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/ShardCoordinator.Internal$.html
title: ShardCoordinator.Internal$
---

# ShardCoordinator.Internal$

## Content

Package [akka.cluster.sharding](package-summary.html)
## Class ShardCoordinator.Internal$

- java.lang.Object
- - akka.cluster.sharding.ShardCoordinator.Internal$

- Enclosing class:
[ShardCoordinator](ShardCoordinator.html "class in akka.cluster.sharding")

---

```
public static class ShardCoordinator.Internal$
extends java.lang.Object
```

INTERNAL API

- - ### Nested Class Summary
	
	
	
	Nested Classes 
	| Modifier and Type | Class | Description |
	| `class` | `[ShardCoordinator.Internal$.BeginHandOff](ShardCoordinator.Internal$.BeginHandOff.html "class in akka.cluster.sharding")` | `ShardCoordinator` initiates rebalancing process by sending this message  to all registered `ShardRegion` actors (including proxy only). |
	| `class` | `[ShardCoordinator.Internal$.BeginHandOff$](ShardCoordinator.Internal$.BeginHandOff$.html "class in akka.cluster.sharding")` |  |
	| `class` | `[ShardCoordinator.Internal$.BeginHandOffAck](ShardCoordinator.Internal$.BeginHandOffAck.html "class in akka.cluster.sharding")` | Acknowledgement of [`ShardCoordinator.Internal$.BeginHandOff`](ShardCoordinator.Internal$.BeginHandOff.html "class in akka.cluster.sharding") |
	| `class` | `[ShardCoordinator.Internal$.BeginHandOffAck$](ShardCoordinator.Internal$.BeginHandOffAck$.html "class in akka.cluster.sharding")` |  |
	| `static interface` | `[ShardCoordinator.Internal$.CoordinatorCommand](ShardCoordinator.Internal$.CoordinatorCommand.html "interface in akka.cluster.sharding")` | Messages sent to the coordinator |
	| `static interface` | `[ShardCoordinator.Internal$.CoordinatorMessage](ShardCoordinator.Internal$.CoordinatorMessage.html "interface in akka.cluster.sharding")` | Messages sent from the coordinator |
	| `static interface` | `[ShardCoordinator.Internal$.DomainEvent](ShardCoordinator.Internal$.DomainEvent.html "interface in akka.cluster.sharding")` |  |
	| `class` | `[ShardCoordinator.Internal$.GetShardHome](ShardCoordinator.Internal$.GetShardHome.html "class in akka.cluster.sharding")` | `ShardRegion` requests the location of a shard by sending this message  to the `ShardCoordinator`. |
	| `class` | `[ShardCoordinator.Internal$.GetShardHome$](ShardCoordinator.Internal$.GetShardHome$.html "class in akka.cluster.sharding")` |  |
	| `class` | `[ShardCoordinator.Internal$.GracefulShutdownReq](ShardCoordinator.Internal$.GracefulShutdownReq.html "class in akka.cluster.sharding")` | `ShardRegion` requests full handoff to be able to shutdown gracefully. |
	| `class` | `[ShardCoordinator.Internal$.GracefulShutdownReq$](ShardCoordinator.Internal$.GracefulShutdownReq$.html "class in akka.cluster.sharding")` |  |
	| `class` | `[ShardCoordinator.Internal$.HandOff](ShardCoordinator.Internal$.HandOff.html "class in akka.cluster.sharding")` | When all `ShardRegion` actors have acknowledged the `BeginHandOff` the  `ShardCoordinator` sends this message to the `ShardRegion` responsible for the  shard. |
	| `class` | `[ShardCoordinator.Internal$.HandOff$](ShardCoordinator.Internal$.HandOff$.html "class in akka.cluster.sharding")` |  |
	| `class` | `[ShardCoordinator.Internal$.HostShard](ShardCoordinator.Internal$.HostShard.html "class in akka.cluster.sharding")` | `ShardCoordinator` informs a `ShardRegion` that it is hosting this shard |
	| `class` | `[ShardCoordinator.Internal$.HostShard$](ShardCoordinator.Internal$.HostShard$.html "class in akka.cluster.sharding")` |  |
	| `class` | `[ShardCoordinator.Internal$.RegionStopped](ShardCoordinator.Internal$.RegionStopped.html "class in akka.cluster.sharding")` | Notification when the entire shard region has stopped |
	| `class` | `[ShardCoordinator.Internal$.RegionStopped$](ShardCoordinator.Internal$.RegionStopped$.html "class in akka.cluster.sharding")` |  |
	| `class` | `[ShardCoordinator.Internal$.Register](ShardCoordinator.Internal$.Register.html "class in akka.cluster.sharding")` | `ShardRegion` registers to `ShardCoordinator`, until it receives [`ShardCoordinator.Internal$.RegisterAck`](ShardCoordinator.Internal$.RegisterAck.html "class in akka.cluster.sharding"). |
	| `class` | `[ShardCoordinator.Internal$.Register$](ShardCoordinator.Internal$.Register$.html "class in akka.cluster.sharding")` |  |
	| `class` | `[ShardCoordinator.Internal$.RegisterAck](ShardCoordinator.Internal$.RegisterAck.html "class in akka.cluster.sharding")` | Acknowledgement from `ShardCoordinator` that [`ShardCoordinator.Internal$.Register`](ShardCoordinator.Internal$.Register.html "class in akka.cluster.sharding") or [`ShardCoordinator.Internal$.RegisterProxy`](ShardCoordinator.Internal$.RegisterProxy.html "class in akka.cluster.sharding") was successful. |
	| `class` | `[ShardCoordinator.Internal$.RegisterAck$](ShardCoordinator.Internal$.RegisterAck$.html "class in akka.cluster.sharding")` |  |
	| `class` | `[ShardCoordinator.Internal$.RegisterProxy](ShardCoordinator.Internal$.RegisterProxy.html "class in akka.cluster.sharding")` | `ShardRegion` in proxy only mode registers to `ShardCoordinator`, until it receives [`ShardCoordinator.Internal$.RegisterAck`](ShardCoordinator.Internal$.RegisterAck.html "class in akka.cluster.sharding"). |
	| `class` | `[ShardCoordinator.Internal$.RegisterProxy$](ShardCoordinator.Internal$.RegisterProxy$.html "class in akka.cluster.sharding")` |  |
	| `class` | `[ShardCoordinator.Internal$.ShardCoordinatorInitialized](ShardCoordinator.Internal$.ShardCoordinatorInitialized.html "class in akka.cluster.sharding")` |  |
	| `class` | `[ShardCoordinator.Internal$.ShardCoordinatorInitialized$](ShardCoordinator.Internal$.ShardCoordinatorInitialized$.html "class in akka.cluster.sharding")` |  |
	| `class` | `[ShardCoordinator.Internal$.ShardHome](ShardCoordinator.Internal$.ShardHome.html "class in akka.cluster.sharding")` | `ShardCoordinator` replies with this message for [`ShardCoordinator.Internal$.GetShardHome`](ShardCoordinator.Internal$.GetShardHome.html "class in akka.cluster.sharding") requests. |
	| `class` | `[ShardCoordinator.Internal$.ShardHome$](ShardCoordinator.Internal$.ShardHome$.html "class in akka.cluster.sharding")` |  |
	| `class` | `[ShardCoordinator.Internal$.ShardHomeAllocated](ShardCoordinator.Internal$.ShardHomeAllocated.html "class in akka.cluster.sharding")` |  |
	| `class` | `[ShardCoordinator.Internal$.ShardHomeAllocated$](ShardCoordinator.Internal$.ShardHomeAllocated$.html "class in akka.cluster.sharding")` |  |
	| `class` | `[ShardCoordinator.Internal$.ShardHomeDeallocated](ShardCoordinator.Internal$.ShardHomeDeallocated.html "class in akka.cluster.sharding")` |  |
	| `class` | `[ShardCoordinator.Internal$.ShardHomeDeallocated$](ShardCoordinator.Internal$.ShardHomeDeallocated$.html "class in akka.cluster.sharding")` |  |
	| `class` | `[ShardCoordinator.Internal$.ShardHomes](ShardCoordinator.Internal$.ShardHomes.html "class in akka.cluster.sharding")` | One or more sent to region directly after registration to speed up new shard startup. |
	| `class` | `[ShardCoordinator.Internal$.ShardHomes$](ShardCoordinator.Internal$.ShardHomes$.html "class in akka.cluster.sharding")` |  |
	| `class` | `[ShardCoordinator.Internal$.ShardRegionProxyRegistered](ShardCoordinator.Internal$.ShardRegionProxyRegistered.html "class in akka.cluster.sharding")` |  |
	| `class` | `[ShardCoordinator.Internal$.ShardRegionProxyRegistered$](ShardCoordinator.Internal$.ShardRegionProxyRegistered$.html "class in akka.cluster.sharding")` |  |
	| `class` | `[ShardCoordinator.Internal$.ShardRegionProxyTerminated](ShardCoordinator.Internal$.ShardRegionProxyTerminated.html "class in akka.cluster.sharding")` |  |
	| `class` | `[ShardCoordinator.Internal$.ShardRegionProxyTerminated$](ShardCoordinator.Internal$.ShardRegionProxyTerminated$.html "class in akka.cluster.sharding")` |  |
	| `class` | `[ShardCoordinator.Internal$.ShardRegionRegistered](ShardCoordinator.Internal$.ShardRegionRegistered.html "class in akka.cluster.sharding")` |  |
	| `class` | `[ShardCoordinator.Internal$.ShardRegionRegistered$](ShardCoordinator.Internal$.ShardRegionRegistered$.html "class in akka.cluster.sharding")` |  |
	| `class` | `[ShardCoordinator.Internal$.ShardRegionTerminated](ShardCoordinator.Internal$.ShardRegionTerminated.html "class in akka.cluster.sharding")` |  |
	| `class` | `[ShardCoordinator.Internal$.ShardRegionTerminated$](ShardCoordinator.Internal$.ShardRegionTerminated$.html "class in akka.cluster.sharding")` |  |
	| `class` | `[ShardCoordinator.Internal$.ShardStarted](ShardCoordinator.Internal$.ShardStarted.html "class in akka.cluster.sharding")` | `ShardRegion` replies with this message for [`ShardCoordinator.Internal$.HostShard`](ShardCoordinator.Internal$.HostShard.html "class in akka.cluster.sharding") requests which lead to it hosting the shard |
	| `class` | `[ShardCoordinator.Internal$.ShardStarted$](ShardCoordinator.Internal$.ShardStarted$.html "class in akka.cluster.sharding")` |  |
	| `class` | `[ShardCoordinator.Internal$.ShardStopped](ShardCoordinator.Internal$.ShardStopped.html "class in akka.cluster.sharding")` | Reply to `HandOff` when all entities in the shard have been terminated. |
	| `class` | `[ShardCoordinator.Internal$.ShardStopped$](ShardCoordinator.Internal$.ShardStopped$.html "class in akka.cluster.sharding")` |  |
	| `class` | `[ShardCoordinator.Internal$.State](ShardCoordinator.Internal$.State.html "class in akka.cluster.sharding")` |  |
	| `class` | `[ShardCoordinator.Internal$.State$](ShardCoordinator.Internal$.State$.html "class in akka.cluster.sharding")` |  |
	| `class` | `[ShardCoordinator.Internal$.StateInitialized](ShardCoordinator.Internal$.StateInitialized.html "class in akka.cluster.sharding")` |  |
	| `class` | `[ShardCoordinator.Internal$.StateInitialized$](ShardCoordinator.Internal$.StateInitialized$.html "class in akka.cluster.sharding")` |  |
	| `class` | `[ShardCoordinator.Internal$.StopShards](ShardCoordinator.Internal$.StopShards.html "class in akka.cluster.sharding")` | Stop all the listed shards, sender will get a ShardStopped ack for each shard once stopped |
	| `class` | `[ShardCoordinator.Internal$.StopShards$](ShardCoordinator.Internal$.StopShards$.html "class in akka.cluster.sharding")` |  |
	| `class` | `[ShardCoordinator.Internal$.Terminate](ShardCoordinator.Internal$.Terminate.html "class in akka.cluster.sharding")` | Used as a special termination message from [`ClusterSharding`](ClusterSharding.html "class in akka.cluster.sharding") |
	| `class` | `[ShardCoordinator.Internal$.Terminate$](ShardCoordinator.Internal$.Terminate$.html "class in akka.cluster.sharding")` | Used as a special termination message from [`ClusterSharding`](ClusterSharding.html "class in akka.cluster.sharding") |

	- ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ShardCoordinator.Internal$](ShardCoordinator.Internal$.html "class in akka.cluster.sharding")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Internal$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ShardCoordinator.Internal$](ShardCoordinator.Internal$.html "class in akka.cluster.sharding") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Internal$
		
		
		
		```
		public Internal$()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/ClusterSharding.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/ShardCoordinator.Internal$.BeginHandOff$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/ShardCoordinator.Internal$.BeginHandOff.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/ShardCoordinator.Internal$.BeginHandOffAck$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/ShardCoordinator.Internal$.BeginHandOffAck.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/ShardCoordinator.Internal$.CoordinatorCommand.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/ShardCoordinator.Internal$.CoordinatorMessage.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/ShardCoordinator.Internal$.DomainEvent.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/ShardCoordinator.Internal$.GetShardHome$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/ShardCoordinator.Internal$.GetShardHome.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/ShardCoordinator.Internal$.GracefulShutdownReq$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/ShardCoordinator.Internal$.GracefulShutdownReq.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/ShardCoordinator.Internal$.HandOff$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/ShardCoordinator.Internal$.HandOff.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/ShardCoordinator.Internal$.HostShard$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/ShardCoordinator.Internal$.HostShard.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/ShardCoordinator.Internal$.RegionStopped$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/ShardCoordinator.Internal$.RegionStopped.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/ShardCoordinator.Internal$.Register$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/ShardCoordinator.Internal$.Register.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/ShardCoordinator.Internal$.RegisterAck$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/ShardCoordinator.Internal$.RegisterAck.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/ShardCoordinator.Internal$.RegisterProxy$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/ShardCoordinator.Internal$.RegisterProxy.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/ShardCoordinator.Internal$.ShardCoordinatorInitialized$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/ShardCoordinator.Internal$.ShardCoordinatorInitialized.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/ShardCoordinator.Internal$.ShardHome$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/ShardCoordinator.Internal$.ShardHome.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/ShardCoordinator.Internal$.ShardHomeAllocated$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/ShardCoordinator.Internal$.ShardHomeAllocated.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/ShardCoordinator.Internal$.ShardHomeDeallocated$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/ShardCoordinator.Internal$.ShardHomeDeallocated.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/ShardCoordinator.Internal$.ShardHomes$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/ShardCoordinator.Internal$.ShardHomes.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/ShardCoordinator.Internal$.ShardRegionProxyRegistered$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/ShardCoordinator.Internal$.ShardRegionProxyRegistered.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/ShardCoordinator.Internal$.ShardRegionProxyTerminated$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/ShardCoordinator.Internal$.ShardRegionProxyTerminated.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/ShardCoordinator.Internal$.ShardRegionRegistered$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/ShardCoordinator.Internal$.ShardRegionRegistered.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/ShardCoordinator.Internal$.ShardRegionTerminated$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/ShardCoordinator.Internal$.ShardRegionTerminated.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/ShardCoordinator.Internal$.ShardStarted$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/ShardCoordinator.Internal$.ShardStarted.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/ShardCoordinator.Internal$.ShardStopped$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/ShardCoordinator.Internal$.ShardStopped.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/ShardCoordinator.Internal$.State$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/ShardCoordinator.Internal$.State.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/ShardCoordinator.Internal$.StateInitialized$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/ShardCoordinator.Internal$.StateInitialized.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/ShardCoordinator.Internal$.html](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/ShardCoordinator.Internal$.html)*