---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:24:39Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/typed/package-summary.html
title: akka.cluster.sharding.typed
---

# akka.cluster.sharding.typed

## Content

# Package akka.cluster.sharding.typed

- Interface Summary 
| Interface | Description |
| [ClusterShardingQuery](ClusterShardingQuery.html "interface in akka.cluster.sharding.typed") | Protocol for querying sharding state e.g. |
| --- | --- |
| [ClusterShardingSettings.PassivationStrategySettings$.AdmissionSettings$.FilterSettings](ClusterShardingSettings.PassivationStrategySettings$.AdmissionSettings$.FilterSettings.html "interface in akka.cluster.sharding.typed") |  |
| [ClusterShardingSettings.PassivationStrategySettings$.AdmissionSettings$.OptimizerSettings](ClusterShardingSettings.PassivationStrategySettings$.AdmissionSettings$.OptimizerSettings.html "interface in akka.cluster.sharding.typed") |  |
| [ClusterShardingSettings.PassivationStrategySettings$.PolicySettings](ClusterShardingSettings.PassivationStrategySettings$.PolicySettings.html "interface in akka.cluster.sharding.typed") |  |
| [ClusterShardingSettings.RememberEntitiesStoreMode](ClusterShardingSettings.RememberEntitiesStoreMode.html "interface in akka.cluster.sharding.typed") |  |
| [ClusterShardingSettings.StateStoreMode](ClusterShardingSettings.StateStoreMode.html "interface in akka.cluster.sharding.typed") |  |
| [NumberOfProcesses](NumberOfProcesses.html "interface in akka.cluster.sharding.typed") | Reply for [`GetNumberOfProcesses`](GetNumberOfProcesses.html "class in akka.cluster.sharding.typed") |
| [ReplicatedSharding](ReplicatedSharding.html "interface in akka.cluster.sharding.typed")\<M\> | Represents the sharding instances for the replicas of one Replicated Event Sourcing entity type |
| [ReplicatedShardingExtension](ReplicatedShardingExtension.html "interface in akka.cluster.sharding.typed") | Not for user extension. |
| [ShardedDaemonProcessCommand](ShardedDaemonProcessCommand.html "interface in akka.cluster.sharding.typed") | Commands for interacting with the sharded daemon process |
| [ShardedDaemonProcessContext](ShardedDaemonProcessContext.html "interface in akka.cluster.sharding.typed") | Context with details about the Sharded Daemon Process instance to use when starting it |
| [ShardingDirectReplication.Command](ShardingDirectReplication.Command.html "interface in akka.cluster.sharding.typed") | Not for user extension |
- Class Summary 
| Class | Description |
| [ChangeNumberOfProcesses](ChangeNumberOfProcesses.html "class in akka.cluster.sharding.typed") | Tell the sharded daemon process to rescale to the given number of processes. |
| --- | --- |
| [ChangeNumberOfProcesses$](ChangeNumberOfProcesses$.html "class in akka.cluster.sharding.typed") |  |
| [ClusterShardingSettings](ClusterShardingSettings.html "class in akka.cluster.sharding.typed") | param: numberOfShards number of shards used by the default [`HashCodeMessageExtractor`](HashCodeMessageExtractor.html "class in akka.cluster.sharding.typed")  param: role Specifies that this entity type requires cluster nodes with a specific role. |
| [ClusterShardingSettings.PassivationStrategySettings](ClusterShardingSettings.PassivationStrategySettings.html "class in akka.cluster.sharding.typed") | API MAY CHANGE: Settings for passivation strategies may change after additional testing and feedback. |
| [ClusterShardingSettings.PassivationStrategySettings$](ClusterShardingSettings.PassivationStrategySettings$.html "class in akka.cluster.sharding.typed") | API MAY CHANGE: Settings for passivation strategies may change after additional testing and feedback. |
| [ClusterShardingSettings.PassivationStrategySettings$.AdmissionSettings](ClusterShardingSettings.PassivationStrategySettings$.AdmissionSettings.html "class in akka.cluster.sharding.typed") |  |
| [ClusterShardingSettings.PassivationStrategySettings$.AdmissionSettings$](ClusterShardingSettings.PassivationStrategySettings$.AdmissionSettings$.html "class in akka.cluster.sharding.typed") |  |
| [ClusterShardingSettings.PassivationStrategySettings$.AdmissionSettings$.FilterSettings$](ClusterShardingSettings.PassivationStrategySettings$.AdmissionSettings$.FilterSettings$.html "class in akka.cluster.sharding.typed") |  |
| [ClusterShardingSettings.PassivationStrategySettings$.AdmissionSettings$.FrequencySketchSettings](ClusterShardingSettings.PassivationStrategySettings$.AdmissionSettings$.FrequencySketchSettings.html "class in akka.cluster.sharding.typed") |  |
| [ClusterShardingSettings.PassivationStrategySettings$.AdmissionSettings$.FrequencySketchSettings$](ClusterShardingSettings.PassivationStrategySettings$.AdmissionSettings$.FrequencySketchSettings$.html "class in akka.cluster.sharding.typed") |  |
| [ClusterShardingSettings.PassivationStrategySettings$.AdmissionSettings$.HillClimbingSettings](ClusterShardingSettings.PassivationStrategySettings$.AdmissionSettings$.HillClimbingSettings.html "class in akka.cluster.sharding.typed") |  |
| [ClusterShardingSettings.PassivationStrategySettings$.AdmissionSettings$.HillClimbingSettings$](ClusterShardingSettings.PassivationStrategySettings$.AdmissionSettings$.HillClimbingSettings$.html "class in akka.cluster.sharding.typed") |  |
| [ClusterShardingSettings.PassivationStrategySettings$.AdmissionSettings$.OptimizerSettings$](ClusterShardingSettings.PassivationStrategySettings$.AdmissionSettings$.OptimizerSettings$.html "class in akka.cluster.sharding.typed") |  |
| [ClusterShardingSettings.PassivationStrategySettings$.AdmissionSettings$.WindowSettings](ClusterShardingSettings.PassivationStrategySettings$.AdmissionSettings$.WindowSettings.html "class in akka.cluster.sharding.typed") |  |
| [ClusterShardingSettings.PassivationStrategySettings$.AdmissionSettings$.WindowSettings$](ClusterShardingSettings.PassivationStrategySettings$.AdmissionSettings$.WindowSettings$.html "class in akka.cluster.sharding.typed") |  |
| [ClusterShardingSettings.PassivationStrategySettings$.IdleSettings](ClusterShardingSettings.PassivationStrategySettings$.IdleSettings.html "class in akka.cluster.sharding.typed") |  |
| [ClusterShardingSettings.PassivationStrategySettings$.IdleSettings$](ClusterShardingSettings.PassivationStrategySettings$.IdleSettings$.html "class in akka.cluster.sharding.typed") |  |
| [ClusterShardingSettings.PassivationStrategySettings$.LeastFrequentlyUsedSettings](ClusterShardingSettings.PassivationStrategySettings$.LeastFrequentlyUsedSettings.html "class in akka.cluster.sharding.typed") |  |
| [ClusterShardingSettings.PassivationStrategySettings$.LeastFrequentlyUsedSettings$](ClusterShardingSettings.PassivationStrategySettings$.LeastFrequentlyUsedSettings$.html "class in akka.cluster.sharding.typed") |  |
| [ClusterShardingSettings.PassivationStrategySettings$.LeastRecentlyUsedSettings](ClusterShardingSettings.PassivationStrategySettings$.LeastRecentlyUsedSettings.html "class in akka.cluster.sharding.typed") |  |
| [ClusterShardingSettings.PassivationStrategySettings$.LeastRecentlyUsedSettings$](ClusterShardingSettings.PassivationStrategySettings$.LeastRecentlyUsedSettings$.html "class in akka.cluster.sharding.typed") |  |
| [ClusterShardingSettings.PassivationStrategySettings$.LeastRecentlyUsedSettings$.SegmentedSettings](ClusterShardingSettings.PassivationStrategySettings$.LeastRecentlyUsedSettings$.SegmentedSettings.html "class in akka.cluster.sharding.typed") |  |
| [ClusterShardingSettings.PassivationStrategySettings$.LeastRecentlyUsedSettings$.SegmentedSettings$](ClusterShardingSettings.PassivationStrategySettings$.LeastRecentlyUsedSettings$.SegmentedSettings$.html "class in akka.cluster.sharding.typed") |  |
| [ClusterShardingSettings.PassivationStrategySettings$.MostRecentlyUsedSettings](ClusterShardingSettings.PassivationStrategySettings$.MostRecentlyUsedSettings.html "class in akka.cluster.sharding.typed") |  |
| [ClusterShardingSettings.PassivationStrategySettings$.MostRecentlyUsedSettings$](ClusterShardingSettings.PassivationStrategySettings$.MostRecentlyUsedSettings$.html "class in akka.cluster.sharding.typed") |  |
| [ClusterShardingSettings.PassivationStrategySettings$.PolicySettings$](ClusterShardingSettings.PassivationStrategySettings$.PolicySettings$.html "class in akka.cluster.sharding.typed") |  |
| [ClusterShardingSettings.RememberEntitiesStoreMode$](ClusterShardingSettings.RememberEntitiesStoreMode$.html "class in akka.cluster.sharding.typed") |  |
| [ClusterShardingSettings.RememberEntitiesStoreModeDData$](ClusterShardingSettings.RememberEntitiesStoreModeDData$.html "class in akka.cluster.sharding.typed") |  |
| [ClusterShardingSettings.RememberEntitiesStoreModeEventSourced$](ClusterShardingSettings.RememberEntitiesStoreModeEventSourced$.html "class in akka.cluster.sharding.typed") |  |
| [ClusterShardingSettings.StateStoreMode$](ClusterShardingSettings.StateStoreMode$.html "class in akka.cluster.sharding.typed") |  |
| [ClusterShardingSettings.StateStoreModeDData$](ClusterShardingSettings.StateStoreModeDData$.html "class in akka.cluster.sharding.typed") |  |
| [ClusterShardingSettings.StateStoreModePersistence$](ClusterShardingSettings.StateStoreModePersistence$.html "class in akka.cluster.sharding.typed") |  |
| [ClusterShardingSettings.TuningParameters](ClusterShardingSettings.TuningParameters.html "class in akka.cluster.sharding.typed") |  |
| [ClusterShardingSettings$](ClusterShardingSettings$.html "class in akka.cluster.sharding.typed") |  |
| [GetClusterShardingStats](GetClusterShardingStats.html "class in akka.cluster.sharding.typed") | Query the statistics about the currently running sharded entities in the  entire cluster. |
| [GetClusterShardingStats$](GetClusterShardingStats$.html "class in akka.cluster.sharding.typed") |  |
| [GetNumberOfProcesses](GetNumberOfProcesses.html "class in akka.cluster.sharding.typed") | Query the sharded daemon process for the current scale |
| [GetNumberOfProcesses$](GetNumberOfProcesses$.html "class in akka.cluster.sharding.typed") |  |
| [GetShardRegionState](GetShardRegionState.html "class in akka.cluster.sharding.typed") | Query the ShardRegion state for the given entity type key. |
| [GetShardRegionState$](GetShardRegionState$.html "class in akka.cluster.sharding.typed") |  |
| [HashCodeMessageExtractor](HashCodeMessageExtractor.html "class in akka.cluster.sharding.typed")\<M\> | Default message extractor type, using envelopes to identify what entity a message is for  and the hashcode of the entityId to decide which shard an entity belongs to. |
| [HashCodeNoEnvelopeMessageExtractor](HashCodeNoEnvelopeMessageExtractor.html "class in akka.cluster.sharding.typed")\<M\> | Default message extractor type, using a property of the message to identify what entity a message is for  and the hashcode of the entityId to decide which shard an entity belongs to. |
| [Murmur2MessageExtractor](Murmur2MessageExtractor.html "class in akka.cluster.sharding.typed")\<M\> | The murmur2 message extractor uses the same algorithm as the default kafka partitioner  allowing kafka partitions to be mapped to shards. |
| [Murmur2NoEnvelopeMessageExtractor](Murmur2NoEnvelopeMessageExtractor.html "class in akka.cluster.sharding.typed")\<M\> |  |
| [ReplicatedEntity](ReplicatedEntity.html "class in akka.cluster.sharding.typed")\<M\> | Settings for a specific replica id in replicated sharding  Currently only Entity's with ShardingEnvelope are supported but this may change in the future |
| [ReplicatedEntity$](ReplicatedEntity$.html "class in akka.cluster.sharding.typed") |  |
| [ReplicatedEntityProvider](ReplicatedEntityProvider.html "class in akka.cluster.sharding.typed")\<M\> |  |
| [ReplicatedEntityProvider$](ReplicatedEntityProvider$.html "class in akka.cluster.sharding.typed") |  |
| [ReplicatedShardingExtension$](ReplicatedShardingExtension$.html "class in akka.cluster.sharding.typed") | Extension for running Replicated Event Sourcing in sharding by starting one separate instance of sharding per replica. |
| [ShardedDaemonProcessSettings](ShardedDaemonProcessSettings.html "class in akka.cluster.sharding.typed") | Not for user constructions, use factory methods to instantiate. |
| [ShardedDaemonProcessSettings$](ShardedDaemonProcessSettings$.html "class in akka.cluster.sharding.typed") |  |
| [ShardingDirectReplication](ShardingDirectReplication.html "class in akka.cluster.sharding.typed") | INTERNAL API |
| [ShardingDirectReplication.VerifyStarted$](ShardingDirectReplication.VerifyStarted$.html "class in akka.cluster.sharding.typed") |  |
| [ShardingDirectReplication$](ShardingDirectReplication$.html "class in akka.cluster.sharding.typed") | INTERNAL API |
| [ShardingEnvelope](ShardingEnvelope.html "class in akka.cluster.sharding.typed")\<M\> | Default envelope type that may be used with Cluster Sharding. |
| [ShardingEnvelope$](ShardingEnvelope$.html "class in akka.cluster.sharding.typed") |  |
| [ShardingMessageExtractor](ShardingMessageExtractor.html "class in akka.cluster.sharding.typed")\<E,​M\> | Entirely customizable typed message extractor. |
| [ShardingMessageExtractor$](ShardingMessageExtractor$.html "class in akka.cluster.sharding.typed") |  |
| [SliceRangeShardAllocationStrategy](SliceRangeShardAllocationStrategy.html "class in akka.cluster.sharding.typed") | Intended to be used with database sharding, https://doc.akka.io/libraries/akka\-persistence\-r2dbc/current/data\-partition.html,  with a cluster of many Akka nodes. |
| [SliceRangeShardAllocationStrategy.ShardBySliceMessageExtractor](SliceRangeShardAllocationStrategy.ShardBySliceMessageExtractor.html "class in akka.cluster.sharding.typed")\<M\> | To be used together with [`SliceRangeShardAllocationStrategy`](SliceRangeShardAllocationStrategy.html "class in akka.cluster.sharding.typed"). |
| [SliceRangeShardAllocationStrategy$](SliceRangeShardAllocationStrategy$.html "class in akka.cluster.sharding.typed") |  |

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/typed/ChangeNumberOfProcesses$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/typed/ChangeNumberOfProcesses.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/typed/ClusterShardingQuery.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/typed/ClusterShardingSettings$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/typed/ClusterShardingSettings.PassivationStrategySettings$.AdmissionSettings$.FilterSettings$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/typed/ClusterShardingSettings.PassivationStrategySettings$.AdmissionSettings$.FilterSettings.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/typed/ClusterShardingSettings.PassivationStrategySettings$.AdmissionSettings$.FrequencySketchSettings$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/typed/ClusterShardingSettings.PassivationStrategySettings$.AdmissionSettings$.FrequencySketchSettings.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/typed/ClusterShardingSettings.PassivationStrategySettings$.AdmissionSettings$.HillClimbingSettings$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/typed/ClusterShardingSettings.PassivationStrategySettings$.AdmissionSettings$.HillClimbingSettings.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/typed/ClusterShardingSettings.PassivationStrategySettings$.AdmissionSettings$.OptimizerSettings$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/typed/ClusterShardingSettings.PassivationStrategySettings$.AdmissionSettings$.OptimizerSettings.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/typed/ClusterShardingSettings.PassivationStrategySettings$.AdmissionSettings$.WindowSettings$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/typed/ClusterShardingSettings.PassivationStrategySettings$.AdmissionSettings$.WindowSettings.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/typed/ClusterShardingSettings.PassivationStrategySettings$.AdmissionSettings$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/typed/ClusterShardingSettings.PassivationStrategySettings$.AdmissionSettings.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/typed/ClusterShardingSettings.PassivationStrategySettings$.IdleSettings$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/typed/ClusterShardingSettings.PassivationStrategySettings$.IdleSettings.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/typed/ClusterShardingSettings.PassivationStrategySettings$.LeastFrequentlyUsedSettings$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/typed/ClusterShardingSettings.PassivationStrategySettings$.LeastFrequentlyUsedSettings.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/typed/ClusterShardingSettings.PassivationStrategySettings$.LeastRecentlyUsedSettings$.SegmentedSettings$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/typed/ClusterShardingSettings.PassivationStrategySettings$.LeastRecentlyUsedSettings$.SegmentedSettings.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/typed/ClusterShardingSettings.PassivationStrategySettings$.LeastRecentlyUsedSettings$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/typed/ClusterShardingSettings.PassivationStrategySettings$.LeastRecentlyUsedSettings.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/typed/ClusterShardingSettings.PassivationStrategySettings$.MostRecentlyUsedSettings$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/typed/ClusterShardingSettings.PassivationStrategySettings$.MostRecentlyUsedSettings.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/typed/ClusterShardingSettings.PassivationStrategySettings$.PolicySettings$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/typed/ClusterShardingSettings.PassivationStrategySettings$.PolicySettings.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/typed/ClusterShardingSettings.PassivationStrategySettings$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/typed/ClusterShardingSettings.PassivationStrategySettings.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/typed/ClusterShardingSettings.RememberEntitiesStoreMode$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/typed/ClusterShardingSettings.RememberEntitiesStoreMode.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/typed/ClusterShardingSettings.RememberEntitiesStoreModeDData$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/typed/ClusterShardingSettings.RememberEntitiesStoreModeEventSourced$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/typed/ClusterShardingSettings.StateStoreMode$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/typed/ClusterShardingSettings.StateStoreMode.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/typed/ClusterShardingSettings.StateStoreModeDData$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/typed/ClusterShardingSettings.StateStoreModePersistence$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/typed/ClusterShardingSettings.TuningParameters.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/typed/ClusterShardingSettings.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/typed/GetClusterShardingStats$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/typed/GetClusterShardingStats.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/typed/GetNumberOfProcesses$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/typed/GetNumberOfProcesses.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/typed/GetShardRegionState$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/typed/GetShardRegionState.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/typed/HashCodeMessageExtractor.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/typed/HashCodeNoEnvelopeMessageExtractor.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/typed/Murmur2MessageExtractor.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/typed/Murmur2NoEnvelopeMessageExtractor.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/typed/package-summary.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/typed/package-summary.html)*