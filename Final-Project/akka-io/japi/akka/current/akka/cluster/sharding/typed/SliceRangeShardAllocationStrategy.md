---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:11:17Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/SliceRangeShardAllocationStrategy.html
title: SliceRangeShardAllocationStrategy
---

# SliceRangeShardAllocationStrategy

## Content

Package [akka.cluster.sharding.typed](package-summary.html)
## Class SliceRangeShardAllocationStrategy

- java.lang.Object
- - akka.cluster.sharding.typed.SliceRangeShardAllocationStrategy

- All Implemented Interfaces:
`[NoSerializationVerificationNeeded](../../../actor/NoSerializationVerificationNeeded.html "interface in akka.actor")`, `[ClusterShardAllocationMixin](../internal/ClusterShardAllocationMixin.html "interface in akka.cluster.sharding.internal")`, `[ShardCoordinator.ActorSystemDependentAllocationStrategy](../ShardCoordinator.ActorSystemDependentAllocationStrategy.html "interface in akka.cluster.sharding")`, `[ShardCoordinator.ShardAllocationStrategy](../ShardCoordinator.ShardAllocationStrategy.html "interface in akka.cluster.sharding")`

---

```
public class SliceRangeShardAllocationStrategy
extends java.lang.Object
implements [ShardCoordinator.ActorSystemDependentAllocationStrategy](../ShardCoordinator.ActorSystemDependentAllocationStrategy.html "interface in akka.cluster.sharding"), [ClusterShardAllocationMixin](../internal/ClusterShardAllocationMixin.html "interface in akka.cluster.sharding.internal")
```

Intended to be used with database sharding, https://doc.akka.io/libraries/akka\-persistence\-r2dbc/current/data\-partition.html,
 with a cluster of many Akka nodes. To avoid that each Akka node has database connections to all databases it is
 preferred to collocate entities with the same slice and contiguous range of slices to the same Akka node. Thereby
 the connections from one Akka node will go to one or a few databases since the database sharding is based on
 slice ranges.
 
 It must be used together with the [`SliceRangeShardAllocationStrategy.ShardBySliceMessageExtractor`](SliceRangeShardAllocationStrategy.ShardBySliceMessageExtractor.html "class in akka.cluster.sharding.typed").
 

 Create a new instance of this for each entity type, i.e. a `SliceRangeShardAllocationStrategy`
 instance must not be shared between different entity types.
 

 It will not rebalance when there is already an ongoing rebalance in progress.
 

 Important: Do not change shard allocation strategy in a rolling update. The cluster must be fully stopped and
 then started again when changing to a different allocation strategy.
 

 Not intended for public inheritance/implementation.
 

 param: absoluteLimit the maximum number of shards that will be rebalanced in one rebalance round
 param: relativeLimit fraction (\< 1\.0\) of total number of (known) shards that will be rebalanced
 in one rebalance round

- - ### Nested Class Summary
	
	
	
	Nested Classes 
	| Modifier and Type | Class | Description |
	| `static class` | `[SliceRangeShardAllocationStrategy.ShardBySliceMessageExtractor](SliceRangeShardAllocationStrategy.ShardBySliceMessageExtractor.html "class in akka.cluster.sharding.typed")<[M](SliceRangeShardAllocationStrategy.ShardBySliceMessageExtractor.html "type parameter in SliceRangeShardAllocationStrategy.ShardBySliceMessageExtractor")>` | To be used together with [`SliceRangeShardAllocationStrategy`](SliceRangeShardAllocationStrategy.html "class in akka.cluster.sharding.typed"). |
	
	
		- ### Nested classes/interfaces inherited from interface akka.cluster.sharding.internal.[ClusterShardAllocationMixin](../internal/ClusterShardAllocationMixin.html "interface in akka.cluster.sharding.internal")
		
		
		`[ClusterShardAllocationMixin.RegionEntry](../internal/ClusterShardAllocationMixin.RegionEntry.html "class in akka.cluster.sharding.internal"), [ClusterShardAllocationMixin.RegionEntry$](../internal/ClusterShardAllocationMixin.RegionEntry$.html "class in akka.cluster.sharding.internal"), [ClusterShardAllocationMixin.ShardSuitabilityOrdering](../internal/ClusterShardAllocationMixin.ShardSuitabilityOrdering.html "class in akka.cluster.sharding.internal"), [ClusterShardAllocationMixin.ShardSuitabilityOrdering$](../internal/ClusterShardAllocationMixin.ShardSuitabilityOrdering$.html "class in akka.cluster.sharding.internal")`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[SliceRangeShardAllocationStrategy](#%3Cinit%3E(int,double))​(int absoluteLimit,  double relativeLimit)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `scala.concurrent.Future<[ActorRef](../../../actor/ActorRef.html "class in akka.actor")>` | `[allocateShard](#allocateShard(akka.actor.ActorRef,java.lang.String,scala.collection.immutable.Map))​([ActorRef](../../../actor/ActorRef.html "class in akka.actor") requester,  java.lang.String shardId,  scala.collection.immutable.Map<[ActorRef](../../../actor/ActorRef.html "class in akka.actor"),​scala.collection.immutable.IndexedSeq<java.lang.String>> currentShardAllocations)` | Invoked when the location of a new shard is to be decided. |
	| `protected [ClusterEvent.CurrentClusterState](../../ClusterEvent.CurrentClusterState.html "class in akka.cluster")` | `[clusterState](#clusterState())()` |  |
	| `scala.concurrent.Future<scala.collection.immutable.Set<java.lang.String>>` | `[rebalance](#rebalance(scala.collection.immutable.Map,scala.collection.immutable.Set))​(scala.collection.immutable.Map<[ActorRef](../../../actor/ActorRef.html "class in akka.actor"),​scala.collection.immutable.IndexedSeq<java.lang.String>> currentShardAllocations,  scala.collection.immutable.Set<java.lang.String> rebalanceInProgress)` | Invoked periodically to decide which shards to rebalance to another location. |
	| `protected [Member](../../Member.html "class in akka.cluster")` | `[selfMember](#selfMember())()` |  |
	| `void` | `[start](#start(akka.actor.ActorSystem))​([ActorSystem](../../../actor/ActorSystem.html "class in akka.actor") system)` | Called before any calls to allocate/rebalance. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.cluster.sharding.internal.[ClusterShardAllocationMixin](../internal/ClusterShardAllocationMixin.html "interface in akka.cluster.sharding.internal")
		
		
		`[isAGoodTimeToRebalance](../internal/ClusterShardAllocationMixin.html#isAGoodTimeToRebalance(scala.collection.Iterable)), [regionEntriesFor](../internal/ClusterShardAllocationMixin.html#regionEntriesFor(scala.collection.immutable.Map))`

- - ### Constructor Detail
	
	
	
		- #### SliceRangeShardAllocationStrategy
		
		
		
		```
		public SliceRangeShardAllocationStrategy​(int absoluteLimit,
		                                         double relativeLimit)
		```

	- ### Method Detail
	
	
	
		- #### start
		
		
		
		```
		public void start​([ActorSystem](../../../actor/ActorSystem.html "class in akka.actor") system)
		```
		
		Description copied from interface: `[ShardCoordinator.ActorSystemDependentAllocationStrategy](../ShardCoordinator.ActorSystemDependentAllocationStrategy.html#start(akka.actor.ActorSystem))`
		Called before any calls to allocate/rebalance.
		 Do not block. If asynchronous actions are required they can be started here and
		 delay the Futures returned by allocate/rebalance.
		
		Specified by:
		`[start](../ShardCoordinator.ActorSystemDependentAllocationStrategy.html#start(akka.actor.ActorSystem))` in interface `[ShardCoordinator.ActorSystemDependentAllocationStrategy](../ShardCoordinator.ActorSystemDependentAllocationStrategy.html "interface in akka.cluster.sharding")`
		- #### clusterState
		
		
		
		```
		protected [ClusterEvent.CurrentClusterState](../../ClusterEvent.CurrentClusterState.html "class in akka.cluster") clusterState()
		```
		
		
		Specified by:
		`[clusterState](../internal/ClusterShardAllocationMixin.html#clusterState())` in interface `[ClusterShardAllocationMixin](../internal/ClusterShardAllocationMixin.html "interface in akka.cluster.sharding.internal")`
		- #### selfMember
		
		
		
		```
		protected [Member](../../Member.html "class in akka.cluster") selfMember()
		```
		
		
		Specified by:
		`[selfMember](../internal/ClusterShardAllocationMixin.html#selfMember())` in interface `[ClusterShardAllocationMixin](../internal/ClusterShardAllocationMixin.html "interface in akka.cluster.sharding.internal")`
		- #### allocateShard
		
		
		
		```
		public scala.concurrent.Future<[ActorRef](../../../actor/ActorRef.html "class in akka.actor")> allocateShard​([ActorRef](../../../actor/ActorRef.html "class in akka.actor") requester,
		                                                       java.lang.String shardId,
		                                                       scala.collection.immutable.Map<[ActorRef](../../../actor/ActorRef.html "class in akka.actor"),​scala.collection.immutable.IndexedSeq<java.lang.String>> currentShardAllocations)
		```
		
		Description copied from interface: `[ShardCoordinator.ShardAllocationStrategy](../ShardCoordinator.ShardAllocationStrategy.html#allocateShard(akka.actor.ActorRef,java.lang.String,scala.collection.immutable.Map))`
		Invoked when the location of a new shard is to be decided.
		 
		
		Specified by:
		`[allocateShard](../ShardCoordinator.ShardAllocationStrategy.html#allocateShard(akka.actor.ActorRef,java.lang.String,scala.collection.immutable.Map))` in interface `[ShardCoordinator.ShardAllocationStrategy](../ShardCoordinator.ShardAllocationStrategy.html "interface in akka.cluster.sharding")`
		Parameters:
		`requester` \- actor reference to the `ShardRegion` that requested the location of the
		 shard, can be returned if preference should be given to the node where the shard was first accessed
		`shardId` \- the id of the shard to allocate
		`currentShardAllocations` \- all actor refs to `ShardRegion` and their current allocated shards,
		 in the order they were allocated
		Returns:
		a `Future` of the actor ref of the `ShardRegion` that is to be responsible for the shard, must be one of
		 the references included in the `currentShardAllocations` parameter
		- #### rebalance
		
		
		
		```
		public scala.concurrent.Future<scala.collection.immutable.Set<java.lang.String>> rebalance​(scala.collection.immutable.Map<[ActorRef](../../../actor/ActorRef.html "class in akka.actor"),​scala.collection.immutable.IndexedSeq<java.lang.String>> currentShardAllocations,
		                                                                                           scala.collection.immutable.Set<java.lang.String> rebalanceInProgress)
		```
		
		Description copied from interface: `[ShardCoordinator.ShardAllocationStrategy](../ShardCoordinator.ShardAllocationStrategy.html#rebalance(scala.collection.immutable.Map,scala.collection.immutable.Set))`
		Invoked periodically to decide which shards to rebalance to another location.
		 
		
		Specified by:
		`[rebalance](../ShardCoordinator.ShardAllocationStrategy.html#rebalance(scala.collection.immutable.Map,scala.collection.immutable.Set))` in interface `[ShardCoordinator.ShardAllocationStrategy](../ShardCoordinator.ShardAllocationStrategy.html "interface in akka.cluster.sharding")`
		Parameters:
		`currentShardAllocations` \- all actor refs to `ShardRegion` and their current allocated shards,
		 in the order they were allocated
		`rebalanceInProgress` \- set of shards that are currently being rebalanced, i.e.
		 you should not include these in the returned set
		Returns:
		a `Future` of the shards to be migrated, may be empty to skip rebalance in this round

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka/current/akka/actor/ActorSystem.html
- https://doc.akka.io/japi/akka/current/akka/actor/NoSerializationVerificationNeeded.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ClusterEvent.CurrentClusterState.html
- https://doc.akka.io/japi/akka/current/akka/cluster/Member.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/ShardCoordinator.ActorSystemDependentAllocationStrategy.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/ShardCoordinator.ShardAllocationStrategy.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/internal/ClusterShardAllocationMixin.RegionEntry$.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/internal/ClusterShardAllocationMixin.RegionEntry.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/internal/ClusterShardAllocationMixin.ShardSuitabilityOrdering$.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/internal/ClusterShardAllocationMixin.ShardSuitabilityOrdering.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/internal/ClusterShardAllocationMixin.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/SliceRangeShardAllocationStrategy.ShardBySliceMessageExtractor.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/SliceRangeShardAllocationStrategy.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/SliceRangeShardAllocationStrategy.html](https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/SliceRangeShardAllocationStrategy.html)*