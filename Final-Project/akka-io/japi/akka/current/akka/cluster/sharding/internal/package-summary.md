---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:37:54Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/sharding/internal/package-summary.html
title: akka.cluster.sharding.internal
---

# akka.cluster.sharding.internal

## Content

# Package akka.cluster.sharding.internal

- Interface Summary 
| Interface | Description |
| [ClusterShardAllocationMixin](ClusterShardAllocationMixin.html "interface in akka.cluster.sharding.internal") | INTERNAL API |
| --- | --- |
| [ClusterShardingInstrumentation](ClusterShardingInstrumentation.html "interface in akka.cluster.sharding.internal") | INTERNAL API: Instrumentation SPI for Akka Cluster. |
| [RememberEntitiesCoordinatorStore.Command](RememberEntitiesCoordinatorStore.Command.html "interface in akka.cluster.sharding.internal") |  |
| [RememberEntitiesProvider](RememberEntitiesProvider.html "interface in akka.cluster.sharding.internal") | INTERNAL API |
| [RememberEntitiesShardStore.Command](RememberEntitiesShardStore.Command.html "interface in akka.cluster.sharding.internal") |  |
- Class Summary 
| Class | Description |
| [ActiveEntities$](ActiveEntities$.html "class in akka.cluster.sharding.internal") | INTERNAL API |
| --- | --- |
| [AdmissionFilter$](AdmissionFilter$.html "class in akka.cluster.sharding.internal") | INTERNAL API |
| [AdmissionOptimizer$](AdmissionOptimizer$.html "class in akka.cluster.sharding.internal") | INTERNAL API |
| [AlwaysAdmissionFilter](AlwaysAdmissionFilter.html "class in akka.cluster.sharding.internal") | INTERNAL API |
| [AlwaysAdmissionFilter$](AlwaysAdmissionFilter$.html "class in akka.cluster.sharding.internal") | INTERNAL API |
| [ClusterShardAllocationMixin.RegionEntry](ClusterShardAllocationMixin.RegionEntry.html "class in akka.cluster.sharding.internal") |  |
| [ClusterShardAllocationMixin.RegionEntry$](ClusterShardAllocationMixin.RegionEntry$.html "class in akka.cluster.sharding.internal") |  |
| [ClusterShardAllocationMixin.ShardSuitabilityOrdering](ClusterShardAllocationMixin.ShardSuitabilityOrdering.html "class in akka.cluster.sharding.internal") |  |
| [ClusterShardAllocationMixin.ShardSuitabilityOrdering$](ClusterShardAllocationMixin.ShardSuitabilityOrdering$.html "class in akka.cluster.sharding.internal") |  |
| [ClusterShardAllocationMixin$](ClusterShardAllocationMixin$.html "class in akka.cluster.sharding.internal") | INTERNAL API |
| [ClusterShardingInstrumentationProvider](ClusterShardingInstrumentationProvider.html "class in akka.cluster.sharding.internal") | INTERNAL API |
| [ClusterShardingInstrumentationProvider$](ClusterShardingInstrumentationProvider$.html "class in akka.cluster.sharding.internal") | INTERNAL API |
| [ClusterShardingTelemetryEnsemble](ClusterShardingTelemetryEnsemble.html "class in akka.cluster.sharding.internal") | INTERNAL API |
| [DDataRememberEntitiesCoordinatorStore$](DDataRememberEntitiesCoordinatorStore$.html "class in akka.cluster.sharding.internal") | INTERNAL API |
| [DDataRememberEntitiesShardStore$](DDataRememberEntitiesShardStore$.html "class in akka.cluster.sharding.internal") | INTERNAL API |
| [DisabledEntityPassivationStrategy](DisabledEntityPassivationStrategy.html "class in akka.cluster.sharding.internal") | INTERNAL API: No\-op passivation strategy for when automatic passivation is disabled. |
| [DisabledEntityPassivationStrategy$](DisabledEntityPassivationStrategy$.html "class in akka.cluster.sharding.internal") | INTERNAL API: No\-op passivation strategy for when automatic passivation is disabled. |
| [EmptyClusterShardingInstrumentation](EmptyClusterShardingInstrumentation.html "class in akka.cluster.sharding.internal") | INTERNAL API |
| [EmptyClusterShardingInstrumentation$](EmptyClusterShardingInstrumentation$.html "class in akka.cluster.sharding.internal") | INTERNAL API |
| [EntityPassivationStrategy$](EntityPassivationStrategy$.html "class in akka.cluster.sharding.internal") | INTERNAL API |
| [EventSourcedRememberEntitiesCoordinatorStore$](EventSourcedRememberEntitiesCoordinatorStore$.html "class in akka.cluster.sharding.internal") | INTERNAL API |
| [EventSourcedRememberEntitiesShardStore$](EventSourcedRememberEntitiesShardStore$.html "class in akka.cluster.sharding.internal") | INTERNAL API |
| [FrequencySketchAdmissionFilter$](FrequencySketchAdmissionFilter$.html "class in akka.cluster.sharding.internal") | INTERNAL API |
| [LeastShardAllocationStrategy$](LeastShardAllocationStrategy$.html "class in akka.cluster.sharding.internal") | INTERNAL API |
| [NoActiveEntities](NoActiveEntities.html "class in akka.cluster.sharding.internal") | INTERNAL API |
| [NoActiveEntities$](NoActiveEntities$.html "class in akka.cluster.sharding.internal") | INTERNAL API |
| [NoAdmissionOptimizer](NoAdmissionOptimizer.html "class in akka.cluster.sharding.internal") | INTERNAL API |
| [NoAdmissionOptimizer$](NoAdmissionOptimizer$.html "class in akka.cluster.sharding.internal") | INTERNAL API |
| [RememberEntitiesCoordinatorStore](RememberEntitiesCoordinatorStore.html "class in akka.cluster.sharding.internal") | INTERNAL API |
| [RememberEntitiesCoordinatorStore.AddShard](RememberEntitiesCoordinatorStore.AddShard.html "class in akka.cluster.sharding.internal") | Sent once for every started shard (but could be retried), should result in a response of either  UpdateDone or UpdateFailed |
| [RememberEntitiesCoordinatorStore.AddShard$](RememberEntitiesCoordinatorStore.AddShard$.html "class in akka.cluster.sharding.internal") |  |
| [RememberEntitiesCoordinatorStore.GetShards$](RememberEntitiesCoordinatorStore.GetShards$.html "class in akka.cluster.sharding.internal") | Sent once when the coordinator starts (but could be retried), should result in a response of  RememberedShards |
| [RememberEntitiesCoordinatorStore.RememberedShards](RememberEntitiesCoordinatorStore.RememberedShards.html "class in akka.cluster.sharding.internal") |  |
| [RememberEntitiesCoordinatorStore.RememberedShards$](RememberEntitiesCoordinatorStore.RememberedShards$.html "class in akka.cluster.sharding.internal") |  |
| [RememberEntitiesCoordinatorStore.UpdateDone](RememberEntitiesCoordinatorStore.UpdateDone.html "class in akka.cluster.sharding.internal") |  |
| [RememberEntitiesCoordinatorStore.UpdateDone$](RememberEntitiesCoordinatorStore.UpdateDone$.html "class in akka.cluster.sharding.internal") |  |
| [RememberEntitiesCoordinatorStore.UpdateFailed](RememberEntitiesCoordinatorStore.UpdateFailed.html "class in akka.cluster.sharding.internal") |  |
| [RememberEntitiesCoordinatorStore.UpdateFailed$](RememberEntitiesCoordinatorStore.UpdateFailed$.html "class in akka.cluster.sharding.internal") |  |
| [RememberEntitiesCoordinatorStore$](RememberEntitiesCoordinatorStore$.html "class in akka.cluster.sharding.internal") | INTERNAL API |
| [RememberEntitiesShardStore](RememberEntitiesShardStore.html "class in akka.cluster.sharding.internal") | INTERNAL API |
| [RememberEntitiesShardStore.GetEntities$](RememberEntitiesShardStore.GetEntities$.html "class in akka.cluster.sharding.internal") |  |
| [RememberEntitiesShardStore.RememberedEntities](RememberEntitiesShardStore.RememberedEntities.html "class in akka.cluster.sharding.internal") |  |
| [RememberEntitiesShardStore.RememberedEntities$](RememberEntitiesShardStore.RememberedEntities$.html "class in akka.cluster.sharding.internal") |  |
| [RememberEntitiesShardStore.Update](RememberEntitiesShardStore.Update.html "class in akka.cluster.sharding.internal") |  |
| [RememberEntitiesShardStore.Update$](RememberEntitiesShardStore.Update$.html "class in akka.cluster.sharding.internal") |  |
| [RememberEntitiesShardStore.UpdateDone](RememberEntitiesShardStore.UpdateDone.html "class in akka.cluster.sharding.internal") |  |
| [RememberEntitiesShardStore.UpdateDone$](RememberEntitiesShardStore.UpdateDone$.html "class in akka.cluster.sharding.internal") |  |
| [RememberEntitiesShardStore$](RememberEntitiesShardStore$.html "class in akka.cluster.sharding.internal") | INTERNAL API |
| [RememberEntityStarter$](RememberEntityStarter$.html "class in akka.cluster.sharding.internal") | INTERNAL API |
| [RememberEntityStarterManager$](RememberEntityStarterManager$.html "class in akka.cluster.sharding.internal") | INTERNAL API |
| [ShardingFlightRecorder](ShardingFlightRecorder.html "class in akka.cluster.sharding.internal") | INTERNAL API |
| [ShardingFlightRecorder$](ShardingFlightRecorder$.html "class in akka.cluster.sharding.internal") | INTERNAL API |

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/internal/ActiveEntities$.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/internal/AdmissionFilter$.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/internal/AdmissionOptimizer$.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/internal/AlwaysAdmissionFilter$.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/internal/AlwaysAdmissionFilter.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/internal/ClusterShardAllocationMixin$.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/internal/ClusterShardAllocationMixin.RegionEntry$.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/internal/ClusterShardAllocationMixin.RegionEntry.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/internal/ClusterShardAllocationMixin.ShardSuitabilityOrdering$.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/internal/ClusterShardAllocationMixin.ShardSuitabilityOrdering.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/internal/ClusterShardAllocationMixin.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/internal/ClusterShardingInstrumentation.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/internal/ClusterShardingInstrumentationProvider$.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/internal/ClusterShardingInstrumentationProvider.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/internal/ClusterShardingTelemetryEnsemble.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/internal/DDataRememberEntitiesCoordinatorStore$.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/internal/DDataRememberEntitiesShardStore$.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/internal/DisabledEntityPassivationStrategy$.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/internal/DisabledEntityPassivationStrategy.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/internal/EmptyClusterShardingInstrumentation$.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/internal/EmptyClusterShardingInstrumentation.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/internal/EntityPassivationStrategy$.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/internal/EventSourcedRememberEntitiesCoordinatorStore$.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/internal/EventSourcedRememberEntitiesShardStore$.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/internal/FrequencySketchAdmissionFilter$.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/internal/LeastShardAllocationStrategy$.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/internal/NoActiveEntities$.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/internal/NoActiveEntities.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/internal/NoAdmissionOptimizer$.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/internal/NoAdmissionOptimizer.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/internal/RememberEntitiesCoordinatorStore$.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/internal/RememberEntitiesCoordinatorStore.AddShard$.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/internal/RememberEntitiesCoordinatorStore.AddShard.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/internal/RememberEntitiesCoordinatorStore.Command.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/internal/RememberEntitiesCoordinatorStore.GetShards$.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/internal/RememberEntitiesCoordinatorStore.RememberedShards$.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/internal/RememberEntitiesCoordinatorStore.RememberedShards.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/internal/RememberEntitiesCoordinatorStore.UpdateDone$.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/internal/RememberEntitiesCoordinatorStore.UpdateDone.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/internal/RememberEntitiesCoordinatorStore.UpdateFailed$.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/internal/RememberEntitiesCoordinatorStore.UpdateFailed.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/internal/RememberEntitiesCoordinatorStore.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/internal/RememberEntitiesProvider.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/internal/RememberEntitiesShardStore$.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/internal/RememberEntitiesShardStore.Command.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/internal/RememberEntitiesShardStore.GetEntities$.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/internal/RememberEntitiesShardStore.RememberedEntities$.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/internal/RememberEntitiesShardStore.RememberedEntities.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/internal/RememberEntitiesShardStore.Update$.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/internal/RememberEntitiesShardStore.Update.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/sharding/internal/package-summary.html](https://doc.akka.io/japi/akka/current/akka/cluster/sharding/internal/package-summary.html)*