---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:44:07Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/Extension.html
title: Extension
---

# Extension

## Content

Package [akka.actor](package-summary.html)
## Interface Extension

- All Known Subinterfaces:
`[Clock](../util/Clock.html "interface in akka.util")`, `[IO.Extension](../io/IO.Extension.html "interface in akka.io")`, `[SnapshotStorage](../persistence/testkit/SnapshotStorage.html "interface in akka.persistence.testkit")`, `[StreamRefResolver](../stream/StreamRefResolver.html "interface in akka.stream")`

All Known Implementing Classes:
`[AddressUidExtension](../remote/AddressUidExtension.html "class in akka.remote")`, `[BoundAddressesExtension](../remote/BoundAddressesExtension.html "class in akka.remote")`, `[CircuitBreakersRegistry](../pattern/CircuitBreakersRegistry.html "class in akka.pattern")`, `[Cluster](../cluster/Cluster.html "class in akka.cluster")`, `[ClusterMetricsExtension](../cluster/metrics/ClusterMetricsExtension.html "class in akka.cluster.metrics")`, `[ClusterSharding](../cluster/sharding/ClusterSharding.html "class in akka.cluster.sharding")`, `[ClusterShardingInstrumentationProvider](../cluster/sharding/internal/ClusterShardingInstrumentationProvider.html "class in akka.cluster.sharding.internal")`, `[CoordinatedShutdown](CoordinatedShutdown.html "class in akka.actor")`, `[Discovery](../discovery/Discovery.html "class in akka.discovery")`, `[DistributedData](../cluster/ddata/DistributedData.html "class in akka.cluster.ddata")`, `[DistributedPubSub](../cluster/pubsub/DistributedPubSub.html "class in akka.cluster.pubsub")`, `[DnsExt](../io/DnsExt.html "class in akka.io")`, `[DurableStateStoreRegistry](../persistence/state/DurableStateStoreRegistry.html "class in akka.persistence.state")`, `[EventsourcedInstrumentationProvider](../persistence/telemetry/EventsourcedInstrumentationProvider.html "class in akka.persistence.telemetry")`, `[ExternalShardAllocation](../cluster/sharding/external/ExternalShardAllocation.html "class in akka.cluster.sharding.external")`, `[InMemStorageExtension](../persistence/testkit/internal/InMemStorageExtension.html "class in akka.persistence.testkit.internal")`, `[JacksonObjectMapperProvider](../serialization/jackson/JacksonObjectMapperProvider.html "class in akka.serialization.jackson")`, `[LeaseProvider](../coordination/lease/javadsl/LeaseProvider.html "class in akka.coordination.lease.javadsl")`, `[LeaseProvider](../coordination/lease/scaladsl/LeaseProvider.html "class in akka.coordination.lease.scaladsl")`, `[ManifestInfo](../util/ManifestInfo.html "class in akka.util")`, `[Persistence](../persistence/Persistence.html "class in akka.persistence")`, `[PersistencePluginProxyExtensionImpl](../persistence/journal/PersistencePluginProxyExtensionImpl.html "class in akka.persistence.journal")`, `[PersistenceQuery](../persistence/query/PersistenceQuery.html "class in akka.persistence.query")`, `[PersistenceTestKit.Settings](../persistence/testkit/scaladsl/PersistenceTestKit.Settings.html "class in akka.persistence.testkit.scaladsl")`, `[RecoveryPermitterInstrumentationProvider](../persistence/telemetry/RecoveryPermitterInstrumentationProvider.html "class in akka.persistence.telemetry")`, `[Serialization](../serialization/Serialization.html "class in akka.serialization")`, `[SnapshotTestKit.Settings](../persistence/testkit/scaladsl/SnapshotTestKit.Settings.html "class in akka.persistence.testkit.scaladsl")`, `[SystemMaterializer](../stream/SystemMaterializer.html "class in akka.stream")`, `[Tcp](../stream/javadsl/Tcp.html "class in akka.stream.javadsl")`, `[Tcp](../stream/scaladsl/Tcp.html "class in akka.stream.scaladsl")`, `[TcpExt](../io/TcpExt.html "class in akka.io")`, `[TestConductorExt](../remote/testconductor/TestConductorExt.html "class in akka.remote.testconductor")`, `[TestKitSettings](../testkit/TestKitSettings.html "class in akka.testkit")`, `[UdpConnectedExt](../io/UdpConnectedExt.html "class in akka.io")`, `[UdpExt](../io/UdpExt.html "class in akka.io")`

---

```
public interface Extension
```

The basic ActorSystem covers all that is needed for locally running actors,
 using futures and so on. In addition, more features can hook into it and
 thus become visible to actors et al by registering themselves as extensions.
 This is accomplished by providing an extension—which is an object
 implementing this trait—to `ActorSystem.registerExtension(...)` or by
 specifying the corresponding option in the configuration passed to
 ActorSystem, which will then instantiate (without arguments) each FQCN and
 register the result.
 
 The extension itself can be created in any way desired and has full access
 to the ActorSystem implementation.
 

 This trait is only a marker interface to signify an Akka Extension. This is
 how an extension is normally constructed.
 

 Scala API:
 

```

 object MyExt extends ExtensionId[Ext] with ExtensionIdProvider {

   override def lookup = MyExt

   override def createExtension(system: ExtendedActorSystem): Ext = new Ext(system)

   // Java API: retrieve the extension for the given system.
   override def get(system: ActorSystem): UdpExt = super.get(system)
   override def get(system: ClassicActorSystemProvider): UdpExt = super.get(system)
 }

 class Ext(system: ExtendedActorSystem) extends Extension {
   ...
 }
 
```

 Java API:
 

```

 public class MyExt extends AbstractExtensionId<MyExtImpl>
   implements ExtensionIdProvider {
   public final static MyExt MyExtProvider = new MyExt();

   private MyExt() {}

   public MyExt lookup() {
     return MyExt.MyExtProvider;
   }

   public MyExtImpl createExtension(ExtendedActorSystem system) {
     return new MyExtImpl();
   }
 }

 public class MyExtImpl implements Extension {
    ...
 }
 
```

## Code Examples

### Example 1: Interface Extension

```text
object MyExt extends ExtensionId[Ext] with ExtensionIdProvider {

   override def lookup = MyExt

   override def createExtension(system: ExtendedActorSystem): Ext = new Ext(system)

   // Java API: retrieve the extension for the given system.
   override def get(system: ActorSystem): UdpExt = super.get(system)
   override def get(system: ClassicActorSystemProvider): UdpExt = super.get(system)
 }

 class Ext(system: ExtendedActorSystem) extends Extension {
   ...
 }
```

### Example 2: Interface Extension

```text
public class MyExt extends AbstractExtensionId<MyExtImpl>
   implements ExtensionIdProvider {
   public final static MyExt MyExtProvider = new MyExt();

   private MyExt() {}

   public MyExt lookup() {
     return MyExt.MyExtProvider;
   }

   public MyExtImpl createExtension(ExtendedActorSystem system) {
     return new MyExtImpl();
   }
 }

 public class MyExtImpl implements Extension {
    ...
 }
```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/CoordinatedShutdown.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/Cluster.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/DistributedData.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/metrics/ClusterMetricsExtension.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/pubsub/DistributedPubSub.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/ClusterSharding.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/external/ExternalShardAllocation.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/internal/ClusterShardingInstrumentationProvider.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/coordination/lease/javadsl/LeaseProvider.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/coordination/lease/scaladsl/LeaseProvider.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/discovery/Discovery.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/io/DnsExt.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/io/IO.Extension.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/io/TcpExt.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/io/UdpConnectedExt.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/io/UdpExt.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/pattern/CircuitBreakersRegistry.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/Persistence.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/journal/PersistencePluginProxyExtensionImpl.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/query/PersistenceQuery.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/state/DurableStateStoreRegistry.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/telemetry/EventsourcedInstrumentationProvider.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/telemetry/RecoveryPermitterInstrumentationProvider.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/testkit/SnapshotStorage.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/testkit/internal/InMemStorageExtension.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/testkit/scaladsl/PersistenceTestKit.Settings.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/testkit/scaladsl/SnapshotTestKit.Settings.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/AddressUidExtension.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/BoundAddressesExtension.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/testconductor/TestConductorExt.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/serialization/Serialization.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/serialization/jackson/JacksonObjectMapperProvider.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/StreamRefResolver.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/SystemMaterializer.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/javadsl/Tcp.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/scaladsl/Tcp.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/testkit/TestKitSettings.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/util/Clock.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/util/ManifestInfo.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/Extension.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/Extension.html)*