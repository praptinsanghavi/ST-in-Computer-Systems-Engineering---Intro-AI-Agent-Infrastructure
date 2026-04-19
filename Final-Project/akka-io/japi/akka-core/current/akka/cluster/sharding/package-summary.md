---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:46:21Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/current/akka/cluster/sharding/package-summary.html
title: akka.cluster.sharding
---

# akka.cluster.sharding

## Content

# Package akka.cluster.sharding

- Interface Summary 
| Interface | Description |
| [ClusterShardingSerializable](ClusterShardingSerializable.html "interface in akka.cluster.sharding") | Marker trait for remote messages and persistent events/snapshots with special serializer. |
| --- | --- |
| [ClusterShardingSettings.CompositePassivationStrategy$.AdmissionFilter](ClusterShardingSettings.CompositePassivationStrategy$.AdmissionFilter.html "interface in akka.cluster.sharding") |  |
| [ClusterShardingSettings.CompositePassivationStrategy$.AdmissionOptimizer](ClusterShardingSettings.CompositePassivationStrategy$.AdmissionOptimizer.html "interface in akka.cluster.sharding") |  |
| [ClusterShardingSettings.PassivationStrategy](ClusterShardingSettings.PassivationStrategy.html "interface in akka.cluster.sharding") | INTERNAL API |
| [ClusterShardingSettings.PassivationStrategySettings$.AdmissionSettings$.FilterSettings](ClusterShardingSettings.PassivationStrategySettings$.AdmissionSettings$.FilterSettings.html "interface in akka.cluster.sharding") |  |
| [ClusterShardingSettings.PassivationStrategySettings$.AdmissionSettings$.OptimizerSettings](ClusterShardingSettings.PassivationStrategySettings$.AdmissionSettings$.OptimizerSettings.html "interface in akka.cluster.sharding") |  |
| [ClusterShardingSettings.PassivationStrategySettings$.PolicySettings](ClusterShardingSettings.PassivationStrategySettings$.PolicySettings.html "interface in akka.cluster.sharding") |  |
| [ShardCoordinator.ActorSystemDependentAllocationStrategy](ShardCoordinator.ActorSystemDependentAllocationStrategy.html "interface in akka.cluster.sharding") | Shard allocation strategy where start is called by the shard coordinator before any calls to  rebalance or allocate shard. |
| [ShardCoordinator.Internal$.CoordinatorCommand](ShardCoordinator.Internal$.CoordinatorCommand.html "interface in akka.cluster.sharding") | Messages sent to the coordinator |
| [ShardCoordinator.Internal$.CoordinatorMessage](ShardCoordinator.Internal$.CoordinatorMessage.html "interface in akka.cluster.sharding") | Messages sent from the coordinator |
| [ShardCoordinator.Internal$.DomainEvent](ShardCoordinator.Internal$.DomainEvent.html "interface in akka.cluster.sharding") |  |
| [ShardCoordinator.ShardAllocationStrategy](ShardCoordinator.ShardAllocationStrategy.html "interface in akka.cluster.sharding") | Interface of the pluggable shard allocation and rebalancing logic used by the [`ShardCoordinator`](ShardCoordinator.html "class in akka.cluster.sharding"). |
| [ShardCoordinator.StartableAllocationStrategy](ShardCoordinator.StartableAllocationStrategy.html "interface in akka.cluster.sharding") | Shard allocation strategy where start is called by the shard coordinator before any calls to  rebalance or allocate shard. |
- Class Summary 
| Class | Description |
| [ClusterSharding](ClusterSharding.html "class in akka.cluster.sharding") |  |
| --- | --- |
| [ClusterSharding$](ClusterSharding$.html "class in akka.cluster.sharding") | This extension provides sharding functionality of actors in a cluster. |
| [ClusterShardingGuardian$](ClusterShardingGuardian$.html "class in akka.cluster.sharding") | INTERNAL API. |
| [ClusterShardingHealthCheck](ClusterShardingHealthCheck.html "class in akka.cluster.sharding") | INTERNAL API (ctr) |
| [ClusterShardingHealthCheck$](ClusterShardingHealthCheck$.html "class in akka.cluster.sharding") |  |
| [ClusterShardingHealthCheckSettings](ClusterShardingHealthCheckSettings.html "class in akka.cluster.sharding") |  |
| [ClusterShardingHealthCheckSettings$](ClusterShardingHealthCheckSettings$.html "class in akka.cluster.sharding") | Internal API |
| [ClusterShardingSettings](ClusterShardingSettings.html "class in akka.cluster.sharding") | param: role specifies that this entity type requires cluster nodes with a specific role. |
| [ClusterShardingSettings.CompositePassivationStrategy$](ClusterShardingSettings.CompositePassivationStrategy$.html "class in akka.cluster.sharding") | INTERNAL API |
| [ClusterShardingSettings.CompositePassivationStrategy$.AdmissionFilter$](ClusterShardingSettings.CompositePassivationStrategy$.AdmissionFilter$.html "class in akka.cluster.sharding") |  |
| [ClusterShardingSettings.CompositePassivationStrategy$.AdmissionOptimizer$](ClusterShardingSettings.CompositePassivationStrategy$.AdmissionOptimizer$.html "class in akka.cluster.sharding") |  |
| [ClusterShardingSettings.CompositePassivationStrategy$.AlwaysAdmissionFilter$](ClusterShardingSettings.CompositePassivationStrategy$.AlwaysAdmissionFilter$.html "class in akka.cluster.sharding") |  |
| [ClusterShardingSettings.CompositePassivationStrategy$.FrequencySketchAdmissionFilter](ClusterShardingSettings.CompositePassivationStrategy$.FrequencySketchAdmissionFilter.html "class in akka.cluster.sharding") |  |
| [ClusterShardingSettings.CompositePassivationStrategy$.FrequencySketchAdmissionFilter$](ClusterShardingSettings.CompositePassivationStrategy$.FrequencySketchAdmissionFilter$.html "class in akka.cluster.sharding") |  |
| [ClusterShardingSettings.CompositePassivationStrategy$.HillClimbingAdmissionOptimizer](ClusterShardingSettings.CompositePassivationStrategy$.HillClimbingAdmissionOptimizer.html "class in akka.cluster.sharding") |  |
| [ClusterShardingSettings.CompositePassivationStrategy$.HillClimbingAdmissionOptimizer$](ClusterShardingSettings.CompositePassivationStrategy$.HillClimbingAdmissionOptimizer$.html "class in akka.cluster.sharding") |  |
| [ClusterShardingSettings.CompositePassivationStrategy$.NoAdmissionOptimizer$](ClusterShardingSettings.CompositePassivationStrategy$.NoAdmissionOptimizer$.html "class in akka.cluster.sharding") |  |
| [ClusterShardingSettings.IdlePassivationStrategy$](ClusterShardingSettings.IdlePassivationStrategy$.html "class in akka.cluster.sharding") | INTERNAL API |
| [ClusterShardingSettings.LeastFrequentlyUsedPassivationStrategy$](ClusterShardingSettings.LeastFrequentlyUsedPassivationStrategy$.html "class in akka.cluster.sharding") | INTERNAL API |
| [ClusterShardingSettings.LeastRecentlyUsedPassivationStrategy$](ClusterShardingSettings.LeastRecentlyUsedPassivationStrategy$.html "class in akka.cluster.sharding") | INTERNAL API |
| [ClusterShardingSettings.MostRecentlyUsedPassivationStrategy$](ClusterShardingSettings.MostRecentlyUsedPassivationStrategy$.html "class in akka.cluster.sharding") |  |
| [ClusterShardingSettings.NoPassivationStrategy$](ClusterShardingSettings.NoPassivationStrategy$.html "class in akka.cluster.sharding") | INTERNAL API |
| [ClusterShardingSettings.PassivationStrategy$](ClusterShardingSettings.PassivationStrategy$.html "class in akka.cluster.sharding") | INTERNAL API  Determine the passivation strategy to use from settings. |
| [ClusterShardingSettings.PassivationStrategySettings](ClusterShardingSettings.PassivationStrategySettings.html "class in akka.cluster.sharding") | API MAY CHANGE: Settings for passivation strategies may change after additional testing and feedback. |
| [ClusterShardingSettings.PassivationStrategySettings$](ClusterShardingSettings.PassivationStrategySettings$.html "class in akka.cluster.sharding") | API MAY CHANGE: Settings for passivation strategies may change after additional testing and feedback. |
| [ClusterShardingSettings.PassivationStrategySettings$.AdmissionSettings](ClusterShardingSettings.PassivationStrategySettings$.AdmissionSettings.html "class in akka.cluster.sharding") |  |
| [ClusterShardingSettings.PassivationStrategySettings$.AdmissionSettings$](ClusterShardingSettings.PassivationStrategySettings$.AdmissionSettings$.html "class in akka.cluster.sharding") |  |
| [ClusterShardingSettings.PassivationStrategySettings$.AdmissionSettings$.FilterSettings$](ClusterShardingSettings.PassivationStrategySettings$.AdmissionSettings$.FilterSettings$.html "class in akka.cluster.sharding") |  |
| [ClusterShardingSettings.PassivationStrategySettings$.AdmissionSettings$.FrequencySketchSettings](ClusterShardingSettings.PassivationStrategySettings$.AdmissionSettings$.FrequencySketchSettings.html "class in akka.cluster.sharding") |  |
| [ClusterShardingSettings.PassivationStrategySettings$.AdmissionSettings$.FrequencySketchSettings$](ClusterShardingSettings.PassivationStrategySettings$.AdmissionSettings$.FrequencySketchSettings$.html "class in akka.cluster.sharding") |  |
| [ClusterShardingSettings.PassivationStrategySettings$.AdmissionSettings$.HillClimbingSettings](ClusterShardingSettings.PassivationStrategySettings$.AdmissionSettings$.HillClimbingSettings.html "class in akka.cluster.sharding") |  |
| [ClusterShardingSettings.PassivationStrategySettings$.AdmissionSettings$.HillClimbingSettings$](ClusterShardingSettings.PassivationStrategySettings$.AdmissionSettings$.HillClimbingSettings$.html "class in akka.cluster.sharding") |  |
| [ClusterShardingSettings.PassivationStrategySettings$.AdmissionSettings$.OptimizerSettings$](ClusterShardingSettings.PassivationStrategySettings$.AdmissionSettings$.OptimizerSettings$.html "class in akka.cluster.sharding") |  |
| [ClusterShardingSettings.PassivationStrategySettings$.AdmissionSettings$.WindowSettings](ClusterShardingSettings.PassivationStrategySettings$.AdmissionSettings$.WindowSettings.html "class in akka.cluster.sharding") |  |
| [ClusterShardingSettings.PassivationStrategySettings$.AdmissionSettings$.WindowSettings$](ClusterShardingSettings.PassivationStrategySettings$.AdmissionSettings$.WindowSettings$.html "class in akka.cluster.sharding") |  |
| [ClusterShardingSettings.PassivationStrategySettings$.IdleSettings](ClusterShardingSettings.PassivationStrategySettings$.IdleSettings.html "class in akka.cluster.sharding") |  |
| [ClusterShardingSettings.PassivationStrategySettings$.IdleSettings$](ClusterShardingSettings.PassivationStrategySettings$.IdleSettings$.html "class in akka.cluster.sharding") |  |
| [ClusterShardingSettings.PassivationStrategySettings$.LeastFrequentlyUsedSettings](ClusterShardingSettings.PassivationStrategySettings$.LeastFrequentlyUsedSettings.html "class in akka.cluster.sharding") |  |
| [ClusterShardingSettings.PassivationStrategySettings$.LeastFrequentlyUsedSettings$](ClusterShardingSettings.PassivationStrategySettings$.LeastFrequentlyUsedSettings$.html "class in akka.cluster.sharding") |  |
| [ClusterShardingSettings.PassivationStrategySettings$.LeastRecentlyUsedSettings](ClusterShardingSettings.PassivationStrategySettings$.LeastRecentlyUsedSettings.html "class in akka.cluster.sharding") |  |
| [ClusterShardingSettings.PassivationStrategySettings$.LeastRecentlyUsedSettings$](ClusterShardingSettings.PassivationStrategySettings$.LeastRecentlyUsedSettings$.html "class in akka.cluster.sharding") |  |
| [ClusterShardingSettings.PassivationStrategySettings$.LeastRecentlyUsedSettings$.SegmentedSettings](ClusterShardingSettings.PassivationStrategySettings$.LeastRecentlyUsedSettings$.SegmentedSettings.html "class in akka.cluster.sharding") |  |
| [ClusterShardingSettings.PassivationStrategySettings$.LeastRecentlyUsedSettings$.SegmentedSettings$](ClusterShardingSettings.PassivationStrategySettings$.LeastRecentlyUsedSettings$.SegmentedSettings$.html "class in akka.cluster.sharding") |  |
| [ClusterShardingSettings.PassivationStrategySettings$.MostRecentlyUsedSettings](ClusterShardingSettings.PassivationStrategySettings$.MostRecentlyUsedSettings.html "class in akka.cluster.sharding") |  |
| [ClusterShardingSettings.PassivationStrategySettings$.MostRecentlyUsedSettings$](ClusterShardingSettings.PassivationStrategySettings$.MostRecentlyUsedSettings$.html "class in akka.cluster.sharding") |  |
| [ClusterShardingSettings.PassivationStrategySettings$.PolicySettings$](ClusterShardingSettings.PassivationStrategySettings$.PolicySettings$.html "class in akka.cluster.sharding") |  |
| [ClusterShardingSettings.TuningParameters](ClusterShardingSettings.TuningParameters.html "class in akka.cluster.sharding") |  |
| [ClusterShardingSettings$](ClusterShardingSettings$.html "class in akka.cluster.sharding") |  |
| [ConsistentHashingShardAllocationStrategy](ConsistentHashingShardAllocationStrategy.html "class in akka.cluster.sharding") | [`ShardCoordinator.ShardAllocationStrategy`](ShardCoordinator.ShardAllocationStrategy.html "interface in akka.cluster.sharding") that is using consistent  hashing. |
| [ConsistentHashingShardAllocationStrategy$](ConsistentHashingShardAllocationStrategy$.html "class in akka.cluster.sharding") |  |
| [DDataShardCoordinator$](DDataShardCoordinator$.html "class in akka.cluster.sharding") | INTERNAL API |
| [JoinConfigCompatCheckSharding](JoinConfigCompatCheckSharding.html "class in akka.cluster.sharding") | INTERNAL API |
| [PersistentShardCoordinator](PersistentShardCoordinator.html "class in akka.cluster.sharding") | Deprecated. Use \`ddata\` mode, persistence mode is deprecated. |
| [RemoveInternalClusterShardingData](RemoveInternalClusterShardingData.html "class in akka.cluster.sharding") |  |
| [RemoveInternalClusterShardingData.RemoveOnePersistenceId$](RemoveInternalClusterShardingData.RemoveOnePersistenceId$.html "class in akka.cluster.sharding") | INTERNAL API |
| [RemoveInternalClusterShardingData.RemoveOnePersistenceId$.Removals](RemoveInternalClusterShardingData.RemoveOnePersistenceId$.Removals.html "class in akka.cluster.sharding") |  |
| [RemoveInternalClusterShardingData.RemoveOnePersistenceId$.Removals$](RemoveInternalClusterShardingData.RemoveOnePersistenceId$.Removals$.html "class in akka.cluster.sharding") |  |
| [RemoveInternalClusterShardingData.RemoveOnePersistenceId$.Result](RemoveInternalClusterShardingData.RemoveOnePersistenceId$.Result.html "class in akka.cluster.sharding") |  |
| [RemoveInternalClusterShardingData.RemoveOnePersistenceId$.Result$](RemoveInternalClusterShardingData.RemoveOnePersistenceId$.Result$.html "class in akka.cluster.sharding") |  |
| [RemoveInternalClusterShardingData$](RemoveInternalClusterShardingData$.html "class in akka.cluster.sharding") | Utility program that removes the internal data stored with Akka Persistence  by the Cluster `ShardCoordinator`. |
| [Shard$](Shard$.html "class in akka.cluster.sharding") | INTERNAL API |
| [ShardCoordinator](ShardCoordinator.html "class in akka.cluster.sharding") | Singleton coordinator that decides where to allocate shards. |
| [ShardCoordinator.AbstractShardAllocationStrategy](ShardCoordinator.AbstractShardAllocationStrategy.html "class in akka.cluster.sharding") | Java API: Java implementations of custom shard allocation and rebalancing logic used by the [`ShardCoordinator`](ShardCoordinator.html "class in akka.cluster.sharding")  should extend this abstract class and override [`ShardCoordinator.AbstractShardAllocationStrategy.allocateNewShard(akka.actor.ActorRef,java.lang.String,java.util.Map<akka.actor.ActorRef,scala.collection.immutable.IndexedSeq<java.lang.String>>)`](ShardCoordinator.AbstractShardAllocationStrategy.html#allocateNewShard(akka.actor.ActorRef,java.lang.String,java.util.Map)) and `rebalanceShard`. |
| [ShardCoordinator.Internal$](ShardCoordinator.Internal$.html "class in akka.cluster.sharding") | INTERNAL API |
| [ShardCoordinator.LeastShardAllocationStrategy](ShardCoordinator.LeastShardAllocationStrategy.html "class in akka.cluster.sharding") | Use `akka.cluster.sharding.ShardCoordinator.ShardAllocationStrategy.leastShardAllocationStrategy` instead. |
| [ShardCoordinator.RebalanceWorker$](ShardCoordinator.RebalanceWorker$.html "class in akka.cluster.sharding") |  |
| [ShardCoordinator.RebalanceWorker$.ShardRegionTerminated](ShardCoordinator.RebalanceWorker$.ShardRegionTerminated.html "class in akka.cluster.sharding") |  |
| [ShardCoordinator.RebalanceWorker$.ShardRegionTerminated$](ShardCoordinator.RebalanceWorker$.ShardRegionTerminated$.html "class in akka.cluster.sharding") |  |
| [ShardCoordinator.ShardAllocationStrategy$](ShardCoordinator.ShardAllocationStrategy$.html "class in akka.cluster.sharding") |  |
| [ShardCoordinator$](ShardCoordinator$.html "class in akka.cluster.sharding") |  |
| [ShardingLogMarker](ShardingLogMarker.html "class in akka.cluster.sharding") | This is public with the purpose to document the used markers and properties of log events. |
| [ShardingLogMarker.Properties$](ShardingLogMarker.Properties$.html "class in akka.cluster.sharding") | INTERNAL API |
| [ShardingLogMarker$](ShardingLogMarker$.html "class in akka.cluster.sharding") | This is public with the purpose to document the used markers and properties of log events. |
| [ShardingQueries](ShardingQueries.html "class in akka.cluster.sharding") | INTERNAL API |
| [ShardingQueries.ShardsQueryResult](ShardingQueries.ShardsQueryResult.html "class in akka.cluster.sharding")\<B\> | INTERNAL API  The result of a group query and metadata. |
| [ShardingQueries.ShardsQueryResult$](ShardingQueries.ShardsQueryResult$.html "class in akka.cluster.sharding") |  |
| [ShardingQueries$](ShardingQueries$.html "class in akka.cluster.sharding") | INTERNAL API |
| [ShardRegion$](ShardRegion$.html "class in akka.cluster.sharding") |  |

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/current/akka/cluster/sharding/ClusterSharding$.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/sharding/ClusterSharding.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/sharding/ClusterShardingGuardian$.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/sharding/ClusterShardingHealthCheck$.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/sharding/ClusterShardingHealthCheck.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/sharding/ClusterShardingHealthCheckSettings$.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/sharding/ClusterShardingHealthCheckSettings.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/sharding/ClusterShardingSerializable.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/sharding/ClusterShardingSettings$.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/sharding/ClusterShardingSettings.CompositePassivationStrategy$.AdmissionFilter$.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/sharding/ClusterShardingSettings.CompositePassivationStrategy$.AdmissionFilter.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/sharding/ClusterShardingSettings.CompositePassivationStrategy$.AdmissionOptimizer$.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/sharding/ClusterShardingSettings.CompositePassivationStrategy$.AdmissionOptimizer.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/sharding/ClusterShardingSettings.CompositePassivationStrategy$.AlwaysAdmissionFilter$.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/sharding/ClusterShardingSettings.CompositePassivationStrategy$.FrequencySketchAdmissionFilter$.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/sharding/ClusterShardingSettings.CompositePassivationStrategy$.FrequencySketchAdmissionFilter.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/sharding/ClusterShardingSettings.CompositePassivationStrategy$.HillClimbingAdmissionOptimizer$.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/sharding/ClusterShardingSettings.CompositePassivationStrategy$.HillClimbingAdmissionOptimizer.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/sharding/ClusterShardingSettings.CompositePassivationStrategy$.NoAdmissionOptimizer$.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/sharding/ClusterShardingSettings.CompositePassivationStrategy$.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/sharding/ClusterShardingSettings.IdlePassivationStrategy$.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/sharding/ClusterShardingSettings.LeastFrequentlyUsedPassivationStrategy$.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/sharding/ClusterShardingSettings.LeastRecentlyUsedPassivationStrategy$.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/sharding/ClusterShardingSettings.MostRecentlyUsedPassivationStrategy$.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/sharding/ClusterShardingSettings.NoPassivationStrategy$.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/sharding/ClusterShardingSettings.PassivationStrategy$.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/sharding/ClusterShardingSettings.PassivationStrategy.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/sharding/ClusterShardingSettings.PassivationStrategySettings$.AdmissionSettings$.FilterSettings$.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/sharding/ClusterShardingSettings.PassivationStrategySettings$.AdmissionSettings$.FilterSettings.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/sharding/ClusterShardingSettings.PassivationStrategySettings$.AdmissionSettings$.FrequencySketchSettings$.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/sharding/ClusterShardingSettings.PassivationStrategySettings$.AdmissionSettings$.FrequencySketchSettings.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/sharding/ClusterShardingSettings.PassivationStrategySettings$.AdmissionSettings$.HillClimbingSettings$.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/sharding/ClusterShardingSettings.PassivationStrategySettings$.AdmissionSettings$.HillClimbingSettings.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/sharding/ClusterShardingSettings.PassivationStrategySettings$.AdmissionSettings$.OptimizerSettings$.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/sharding/ClusterShardingSettings.PassivationStrategySettings$.AdmissionSettings$.OptimizerSettings.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/sharding/ClusterShardingSettings.PassivationStrategySettings$.AdmissionSettings$.WindowSettings$.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/sharding/ClusterShardingSettings.PassivationStrategySettings$.AdmissionSettings$.WindowSettings.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/sharding/ClusterShardingSettings.PassivationStrategySettings$.AdmissionSettings$.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/sharding/ClusterShardingSettings.PassivationStrategySettings$.AdmissionSettings.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/sharding/ClusterShardingSettings.PassivationStrategySettings$.IdleSettings$.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/sharding/ClusterShardingSettings.PassivationStrategySettings$.IdleSettings.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/sharding/ClusterShardingSettings.PassivationStrategySettings$.LeastFrequentlyUsedSettings$.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/sharding/ClusterShardingSettings.PassivationStrategySettings$.LeastFrequentlyUsedSettings.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/sharding/ClusterShardingSettings.PassivationStrategySettings$.LeastRecentlyUsedSettings$.SegmentedSettings$.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/sharding/ClusterShardingSettings.PassivationStrategySettings$.LeastRecentlyUsedSettings$.SegmentedSettings.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/sharding/ClusterShardingSettings.PassivationStrategySettings$.LeastRecentlyUsedSettings$.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/sharding/ClusterShardingSettings.PassivationStrategySettings$.LeastRecentlyUsedSettings.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/sharding/ClusterShardingSettings.PassivationStrategySettings$.MostRecentlyUsedSettings$.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/sharding/ClusterShardingSettings.PassivationStrategySettings$.MostRecentlyUsedSettings.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/sharding/ClusterShardingSettings.PassivationStrategySettings$.PolicySettings$.html

---
*Source: [https://doc.akka.io/japi/akka-core/current/akka/cluster/sharding/package-summary.html](https://doc.akka.io/japi/akka-core/current/akka/cluster/sharding/package-summary.html)*