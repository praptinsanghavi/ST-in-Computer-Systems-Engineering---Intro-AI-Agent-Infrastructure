---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:44:09Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ExtensionIdProvider.html
title: ExtensionIdProvider
---

# ExtensionIdProvider

## Content

Package [akka.actor](package-summary.html)
## Interface ExtensionIdProvider

- All Known Implementing Classes:
`[ActorRefResolveThreadLocalCache$](../remote/serialization/ActorRefResolveThreadLocalCache$.html "class in akka.remote.serialization")`, `[AddressTerminatedTopic$](../event/AddressTerminatedTopic$.html "class in akka.event")`, `[AddressUidExtension$](../remote/AddressUidExtension$.html "class in akka.remote")`, `[BoundAddressesExtension$](../remote/BoundAddressesExtension$.html "class in akka.remote")`, `[CallingThreadDispatcherQueues$](../testkit/CallingThreadDispatcherQueues$.html "class in akka.testkit")`, `[CircuitBreakersRegistry$](../pattern/CircuitBreakersRegistry$.html "class in akka.pattern")`, `[Clock$](../util/Clock$.html "class in akka.util")`, `[Cluster$](../cluster/Cluster$.html "class in akka.cluster")`, `[ClusterMetricsExtension$](../cluster/metrics/ClusterMetricsExtension$.html "class in akka.cluster.metrics")`, `[ClusterSharding$](../cluster/sharding/ClusterSharding$.html "class in akka.cluster.sharding")`, `[ClusterShardingInstrumentationProvider$](../cluster/sharding/internal/ClusterShardingInstrumentationProvider$.html "class in akka.cluster.sharding.internal")`, `[CoordinatedShutdown$](CoordinatedShutdown$.html "class in akka.actor")`, `[Discovery$](../discovery/Discovery$.html "class in akka.discovery")`, `[DistributedData$](../cluster/ddata/DistributedData$.html "class in akka.cluster.ddata")`, `[DistributedPubSub$](../cluster/pubsub/DistributedPubSub$.html "class in akka.cluster.pubsub")`, `[Dns$](../io/Dns$.html "class in akka.io")`, `[DurableStateStoreRegistry$](../persistence/state/DurableStateStoreRegistry$.html "class in akka.persistence.state")`, `[EventsBySliceFirehose$](../persistence/query/typed/internal/EventsBySliceFirehose$.html "class in akka.persistence.query.typed.internal")`, `[EventsourcedInstrumentationProvider$](../persistence/telemetry/EventsourcedInstrumentationProvider$.html "class in akka.persistence.telemetry")`, `[ExternalShardAllocation$](../cluster/sharding/external/ExternalShardAllocation$.html "class in akka.cluster.sharding.external")`, `[InMemStorageExtension$](../persistence/testkit/internal/InMemStorageExtension$.html "class in akka.persistence.testkit.internal")`, `[JacksonObjectMapperProvider$](../serialization/jackson/JacksonObjectMapperProvider$.html "class in akka.serialization.jackson")`, `[LeaseProvider$](../coordination/lease/javadsl/LeaseProvider$.html "class in akka.coordination.lease.javadsl")`, `[LeaseProvider$](../coordination/lease/scaladsl/LeaseProvider$.html "class in akka.coordination.lease.scaladsl")`, `[ManifestInfo$](../util/ManifestInfo$.html "class in akka.util")`, `[Persistence$](../persistence/Persistence$.html "class in akka.persistence")`, `[PersistencePluginProxyExtension$](../persistence/journal/PersistencePluginProxyExtension$.html "class in akka.persistence.journal")`, `[PersistenceQuery$](../persistence/query/PersistenceQuery$.html "class in akka.persistence.query")`, `[RARP$](../remote/RARP$.html "class in akka.remote")`, `[RecoveryPermitterInstrumentationProvider$](../persistence/telemetry/RecoveryPermitterInstrumentationProvider$.html "class in akka.persistence.telemetry")`, `[SerializationExtension$](../serialization/SerializationExtension$.html "class in akka.serialization")`, `[SnapshotStorageEmulatorExtension$](../persistence/testkit/internal/SnapshotStorageEmulatorExtension$.html "class in akka.persistence.testkit.internal")`, `[SystemMaterializer$](../stream/SystemMaterializer$.html "class in akka.stream")`, `[Tcp$](../io/Tcp$.html "class in akka.io")`, `[Tcp$](../stream/javadsl/Tcp$.html "class in akka.stream.javadsl")`, `[Tcp$](../stream/scaladsl/Tcp$.html "class in akka.stream.scaladsl")`, `[TestConductor$](../remote/testconductor/TestConductor$.html "class in akka.remote.testconductor")`, `[Udp$](../io/Udp$.html "class in akka.io")`, `[UdpConnected$](../io/UdpConnected$.html "class in akka.io")`

---

```
public interface ExtensionIdProvider
```

To be able to load an ExtensionId from the configuration,
 a class that implements ExtensionIdProvider must be specified.
 The lookup method should return the canonical reference to the extension.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `[ExtensionId](ExtensionId.html "interface in akka.actor")<? extends [Extension](Extension.html "interface in akka.actor")>` | `[lookup](#lookup())()` | Returns the canonical ExtensionId for this Extension |

- - ### Method Detail
	
	
	
		- #### lookup
		
		
		
		```
		[ExtensionId](ExtensionId.html "interface in akka.actor")<? extends [Extension](Extension.html "interface in akka.actor")> lookup()
		```
		
		Returns the canonical ExtensionId for this Extension

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/CoordinatedShutdown$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/Extension.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ExtensionId.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/Cluster$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/DistributedData$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/metrics/ClusterMetricsExtension$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/pubsub/DistributedPubSub$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/ClusterSharding$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/external/ExternalShardAllocation$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/internal/ClusterShardingInstrumentationProvider$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/coordination/lease/javadsl/LeaseProvider$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/coordination/lease/scaladsl/LeaseProvider$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/discovery/Discovery$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/event/AddressTerminatedTopic$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/io/Dns$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/io/Tcp$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/io/Udp$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/io/UdpConnected$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/pattern/CircuitBreakersRegistry$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/Persistence$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/journal/PersistencePluginProxyExtension$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/query/PersistenceQuery$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/query/typed/internal/EventsBySliceFirehose$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/state/DurableStateStoreRegistry$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/telemetry/EventsourcedInstrumentationProvider$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/telemetry/RecoveryPermitterInstrumentationProvider$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/testkit/internal/InMemStorageExtension$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/testkit/internal/SnapshotStorageEmulatorExtension$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/AddressUidExtension$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/BoundAddressesExtension$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/RARP$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/serialization/ActorRefResolveThreadLocalCache$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/testconductor/TestConductor$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/serialization/SerializationExtension$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/serialization/jackson/JacksonObjectMapperProvider$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/SystemMaterializer$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/javadsl/Tcp$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/scaladsl/Tcp$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/testkit/CallingThreadDispatcherQueues$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/util/Clock$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/util/ManifestInfo$.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ExtensionIdProvider.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ExtensionIdProvider.html)*