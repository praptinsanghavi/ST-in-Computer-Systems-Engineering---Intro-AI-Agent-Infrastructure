---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:23:14Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.6/akka/actor/ExtensionId.html
title: ExtensionId
---

# ExtensionId

## Content

Package [akka.actor](package-summary.html)
## Interface ExtensionId\<T extends [Extension](Extension.html "interface in akka.actor")\>

- All Known Implementing Classes:
`[AbstractExtensionId](AbstractExtensionId.html "class in akka.actor")`, `[ActorRefResolveThreadLocalCache$](../remote/serialization/ActorRefResolveThreadLocalCache$.html "class in akka.remote.serialization")`, `[AdapterExtension$](typed/internal/adapter/AdapterExtension$.html "class in akka.actor.typed.internal.adapter")`, `[AddressTerminatedTopic$](../event/AddressTerminatedTopic$.html "class in akka.event")`, `[AddressUidExtension$](../remote/AddressUidExtension$.html "class in akka.remote")`, `[AkkaSSLConfig$](../../com/typesafe/sslconfig/akka/AkkaSSLConfig$.html "class in com.typesafe.sslconfig.akka")`, `[BoundAddressesExtension$](../remote/BoundAddressesExtension$.html "class in akka.remote")`, `[CallingThreadDispatcherQueues$](../testkit/CallingThreadDispatcherQueues$.html "class in akka.testkit")`, `[CircuitBreakersRegistry$](../pattern/CircuitBreakersRegistry$.html "class in akka.pattern")`, `[Cluster$](../cluster/Cluster$.html "class in akka.cluster")`, `[ClusterClientReceptionist$](../cluster/client/ClusterClientReceptionist$.html "class in akka.cluster.client")`, `[ClusterMetricsExtension$](../cluster/metrics/ClusterMetricsExtension$.html "class in akka.cluster.metrics")`, `[ClusterSharding$](../cluster/sharding/ClusterSharding$.html "class in akka.cluster.sharding")`, `[CoordinatedShutdown$](CoordinatedShutdown$.html "class in akka.actor")`, `[Discovery$](../discovery/Discovery$.html "class in akka.discovery")`, `[DistributedData$](../cluster/ddata/DistributedData$.html "class in akka.cluster.ddata")`, `[DistributedPubSub$](../cluster/pubsub/DistributedPubSub$.html "class in akka.cluster.pubsub")`, `[Dns$](../io/Dns$.html "class in akka.io")`, `[DurableStateStoreRegistry$](../persistence/state/DurableStateStoreRegistry$.html "class in akka.persistence.state")`, `[ExternalShardAllocation$](../cluster/sharding/external/ExternalShardAllocation$.html "class in akka.cluster.sharding.external")`, `[InMemStorageExtension$](../persistence/testkit/internal/InMemStorageExtension$.html "class in akka.persistence.testkit.internal")`, `[JacksonObjectMapperProvider$](../serialization/jackson/JacksonObjectMapperProvider$.html "class in akka.serialization.jackson")`, `[LeaseProvider$](../coordination/lease/javadsl/LeaseProvider$.html "class in akka.coordination.lease.javadsl")`, `[LeaseProvider$](../coordination/lease/scaladsl/LeaseProvider$.html "class in akka.coordination.lease.scaladsl")`, `[Logging.LogExt$](../event/Logging.LogExt$.html "class in akka.event")`, `[ManifestInfo$](../util/ManifestInfo$.html "class in akka.util")`, `[Persistence$](../persistence/Persistence$.html "class in akka.persistence")`, `[PersistencePluginProxyExtension$](../persistence/journal/PersistencePluginProxyExtension$.html "class in akka.persistence.journal")`, `[PersistenceQuery$](../persistence/query/PersistenceQuery$.html "class in akka.persistence.query")`, `[PersistenceTestKit.Settings$](../persistence/testkit/scaladsl/PersistenceTestKit.Settings$.html "class in akka.persistence.testkit.scaladsl")`, `[RARP$](../remote/RARP$.html "class in akka.remote")`, `[RemoteMetricsExtension$](../remote/RemoteMetricsExtension$.html "class in akka.remote")`, `[RemotingFlightRecorder$](../remote/artery/RemotingFlightRecorder$.html "class in akka.remote.artery")`, `[SerializationExtension$](../serialization/SerializationExtension$.html "class in akka.serialization")`, `[ShardingFlightRecorder$](../cluster/sharding/ShardingFlightRecorder$.html "class in akka.cluster.sharding")`, `[SnapshotAfter$](../persistence/fsm/SnapshotAfter$.html "class in akka.persistence.fsm")`, `[SnapshotStorageEmulatorExtension$](../persistence/testkit/internal/SnapshotStorageEmulatorExtension$.html "class in akka.persistence.testkit.internal")`, `[SnapshotTestKit.Settings$](../persistence/testkit/scaladsl/SnapshotTestKit.Settings$.html "class in akka.persistence.testkit.scaladsl")`, `[StreamRefResolver$](../stream/StreamRefResolver$.html "class in akka.stream")`, `[SystemMaterializer$](../stream/SystemMaterializer$.html "class in akka.stream")`, `[Tcp$](../io/Tcp$.html "class in akka.io")`, `[Tcp$](../stream/javadsl/Tcp$.html "class in akka.stream.javadsl")`, `[Tcp$](../stream/scaladsl/Tcp$.html "class in akka.stream.scaladsl")`, `[TestConductor$](../remote/testconductor/TestConductor$.html "class in akka.remote.testconductor")`, `[TestKitExtension$](../testkit/TestKitExtension$.html "class in akka.testkit")`, `[TransportAdaptersExtension$](../remote/transport/TransportAdaptersExtension$.html "class in akka.remote.transport")`, `[TypedActor$](TypedActor$.html "class in akka.actor")`, `[Udp$](../io/Udp$.html "class in akka.io")`, `[UdpConnected$](../io/UdpConnected$.html "class in akka.io")`

---

```
public interface ExtensionId<T extends [Extension](Extension.html "interface in akka.actor")>
```

Identifies an Extension
 Lookup of Extensions is done by object identity, so the Id must be the same wherever it's used,
 otherwise you'll get the same extension loaded multiple times.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `[T](ExtensionId.html "type parameter in ExtensionId")` | `[apply](#apply(akka.actor.ActorSystem))​([ActorSystem](ActorSystem.html "class in akka.actor") system)` | Returns an instance of the extension identified by this ExtensionId instance. |
	| `[T](ExtensionId.html "type parameter in ExtensionId")` | `[apply](#apply(akka.actor.ClassicActorSystemProvider))​([ClassicActorSystemProvider](ClassicActorSystemProvider.html "interface in akka.actor") system)` | Returns an instance of the extension identified by this ExtensionId instance. |
	| `[T](ExtensionId.html "type parameter in ExtensionId")` | `[createExtension](#createExtension(akka.actor.ExtendedActorSystem))​([ExtendedActorSystem](ExtendedActorSystem.html "class in akka.actor") system)` | Is used by Akka to instantiate the Extension identified by this ExtensionId,  internal use only. |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object other)` |  |
	| `[T](ExtensionId.html "type parameter in ExtensionId")` | `[get](#get(akka.actor.ActorSystem))​([ActorSystem](ActorSystem.html "class in akka.actor") system)` | Returns an instance of the extension identified by this ExtensionId instance. |
	| `[T](ExtensionId.html "type parameter in ExtensionId")` | `[get](#get(akka.actor.ClassicActorSystemProvider))​([ClassicActorSystemProvider](ClassicActorSystemProvider.html "interface in akka.actor") system)` | Returns an instance of the extension identified by this ExtensionId instance. |
	| `int` | `[hashCode](#hashCode())()` |  |

- - ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		[T](ExtensionId.html "type parameter in ExtensionId") apply​([ActorSystem](ActorSystem.html "class in akka.actor") system)
		```
		
		Returns an instance of the extension identified by this ExtensionId instance.
		- #### apply
		
		
		
		```
		[T](ExtensionId.html "type parameter in ExtensionId") apply​([ClassicActorSystemProvider](ClassicActorSystemProvider.html "interface in akka.actor") system)
		```
		
		Returns an instance of the extension identified by this ExtensionId instance.
		- #### createExtension
		
		
		
		```
		[T](ExtensionId.html "type parameter in ExtensionId") createExtension​([ExtendedActorSystem](ExtendedActorSystem.html "class in akka.actor") system)
		```
		
		Is used by Akka to instantiate the Extension identified by this ExtensionId,
		 internal use only.
		- #### equals
		
		
		
		```
		boolean equals​(java.lang.Object other)
		```
		
		
		Overrides:
		`equals` in class `java.lang.Object`
		- #### get
		
		
		
		```
		[T](ExtensionId.html "type parameter in ExtensionId") get​([ActorSystem](ActorSystem.html "class in akka.actor") system)
		```
		
		Returns an instance of the extension identified by this ExtensionId instance.
		 Java API
		 For extensions written in Scala that are to be used from Java also,
		 this method should be overridden to get correct return type.
		 
		```
		
		 override def get(system: ActorSystem): TheExtension = super.get(system)
		 
		```
		- #### get
		
		
		
		```
		[T](ExtensionId.html "type parameter in ExtensionId") get​([ClassicActorSystemProvider](ClassicActorSystemProvider.html "interface in akka.actor") system)
		```
		
		Returns an instance of the extension identified by this ExtensionId instance.
		 Java API
		 For extensions written in Scala that are to be used from Java also,
		 this method should be overridden to get correct return type.
		 
		```
		
		 override def get(system: ClassicActorSystemProvider): TheExtension = super.get(system)
		 
		```
		- #### hashCode
		
		
		
		```
		int hashCode()
		```
		
		
		Overrides:
		`hashCode` in class `java.lang.Object`

## Code Examples

### Example 1: get

```text
override def get(system: ActorSystem): TheExtension = super.get(system)
```

### Example 2: get

```text
override def get(system: ClassicActorSystemProvider): TheExtension = super.get(system)
```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.6/akka/actor/AbstractExtensionId.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/ActorSystem.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/ClassicActorSystemProvider.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/CoordinatedShutdown$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/ExtendedActorSystem.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/Extension.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/ExtensionId.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/TypedActor$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/package-summary.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/typed/internal/adapter/AdapterExtension$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/Cluster$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/client/ClusterClientReceptionist$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/ddata/DistributedData$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/metrics/ClusterMetricsExtension$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/pubsub/DistributedPubSub$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/sharding/ClusterSharding$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/sharding/ShardingFlightRecorder$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/sharding/external/ExternalShardAllocation$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/coordination/lease/javadsl/LeaseProvider$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/coordination/lease/scaladsl/LeaseProvider$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/discovery/Discovery$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/event/AddressTerminatedTopic$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/event/Logging.LogExt$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/io/Dns$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/io/Tcp$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/io/Udp$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/io/UdpConnected$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/pattern/CircuitBreakersRegistry$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/Persistence$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/fsm/SnapshotAfter$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/journal/PersistencePluginProxyExtension$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/query/PersistenceQuery$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/state/DurableStateStoreRegistry$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/testkit/internal/InMemStorageExtension$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/testkit/internal/SnapshotStorageEmulatorExtension$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/testkit/scaladsl/PersistenceTestKit.Settings$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/testkit/scaladsl/SnapshotTestKit.Settings$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/remote/AddressUidExtension$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/remote/BoundAddressesExtension$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/remote/RARP$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/remote/RemoteMetricsExtension$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/remote/artery/RemotingFlightRecorder$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/remote/serialization/ActorRefResolveThreadLocalCache$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/remote/testconductor/TestConductor$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/remote/transport/TransportAdaptersExtension$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/serialization/SerializationExtension$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/serialization/jackson/JacksonObjectMapperProvider$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/stream/StreamRefResolver$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/stream/SystemMaterializer$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/stream/javadsl/Tcp$.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.6/akka/actor/ExtensionId.html](https://doc.akka.io/japi/akka-core/2.6/akka/actor/ExtensionId.html)*