---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:49:11Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/current/akka/actor/typed/Extension.html
title: Extension
---

# Extension

## Content

Package [akka.actor.typed](package-summary.html)
## Interface Extension

- All Known Subinterfaces:
`[ClusterSharding](../../cluster/sharding/typed/scaladsl/ClusterSharding.html "interface in akka.cluster.sharding.typed.scaladsl")`, `[ReplicatedShardingExtension](../../cluster/sharding/typed/ReplicatedShardingExtension.html "interface in akka.cluster.sharding.typed")`, `[ShardedDaemonProcess](../../cluster/sharding/typed/scaladsl/ShardedDaemonProcess.html "interface in akka.cluster.sharding.typed.scaladsl")`

All Known Implementing Classes:
`[ActorRefResolver](ActorRefResolver.html "class in akka.actor.typed")`, `[Cluster](../../cluster/typed/Cluster.html "class in akka.cluster.typed")`, `[ClusterSingleton](../../cluster/typed/ClusterSingleton.html "class in akka.cluster.typed")`, `[DistributedData](../../cluster/ddata/typed/javadsl/DistributedData.html "class in akka.cluster.ddata.typed.javadsl")`, `[DistributedData](../../cluster/ddata/typed/scaladsl/DistributedData.html "class in akka.cluster.ddata.typed.scaladsl")`, `[DurableStateBehaviorInstrumentationProvider](../../persistence/typed/telemetry/DurableStateBehaviorInstrumentationProvider.html "class in akka.persistence.typed.telemetry")`, `[EventSourcedBehaviorInstrumentationProvider](../../persistence/typed/telemetry/EventSourcedBehaviorInstrumentationProvider.html "class in akka.persistence.typed.telemetry")`, `[PubSub](pubsub/PubSub.html "class in akka.actor.typed.pubsub")`, `[Receptionist](receptionist/Receptionist.html "class in akka.actor.typed.receptionist")`

---

```
public interface Extension
```

Marker trait/interface for extensions. An extension can be registered in the ActorSystem and is guaranteed to only
 have one instance per [`ActorSystem`](ActorSystem.html "class in akka.actor.typed") instance per [`ExtensionId`](ExtensionId.html "class in akka.actor.typed"). The extension internals must be thread safe.
 For mutable state it should be preferred to use an `Actor` rather than extensions as first choice.
 

See Also:
[`ExtensionId`](ExtensionId.html "class in akka.actor.typed")

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/current/akka/actor/typed/ActorRefResolver.html
- https://doc.akka.io/japi/akka-core/current/akka/actor/typed/ActorSystem.html
- https://doc.akka.io/japi/akka-core/current/akka/actor/typed/ExtensionId.html
- https://doc.akka.io/japi/akka-core/current/akka/actor/typed/package-summary.html
- https://doc.akka.io/japi/akka-core/current/akka/actor/typed/pubsub/PubSub.html
- https://doc.akka.io/japi/akka-core/current/akka/actor/typed/receptionist/Receptionist.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/ddata/typed/javadsl/DistributedData.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/ddata/typed/scaladsl/DistributedData.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/sharding/typed/ReplicatedShardingExtension.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/sharding/typed/scaladsl/ClusterSharding.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/sharding/typed/scaladsl/ShardedDaemonProcess.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/typed/Cluster.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/typed/ClusterSingleton.html
- https://doc.akka.io/japi/akka-core/current/akka/persistence/typed/telemetry/DurableStateBehaviorInstrumentationProvider.html
- https://doc.akka.io/japi/akka-core/current/akka/persistence/typed/telemetry/EventSourcedBehaviorInstrumentationProvider.html

---
*Source: [https://doc.akka.io/japi/akka-core/current/akka/actor/typed/Extension.html](https://doc.akka.io/japi/akka-core/current/akka/actor/typed/Extension.html)*