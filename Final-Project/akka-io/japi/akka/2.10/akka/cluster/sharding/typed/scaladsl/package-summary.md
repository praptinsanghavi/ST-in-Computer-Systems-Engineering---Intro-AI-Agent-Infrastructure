---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:10:40Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/2.10/akka/cluster/sharding/typed/scaladsl/package-summary.html
title: akka.cluster.sharding.typed.scaladsl
---

# akka.cluster.sharding.typed.scaladsl

## Content

# Package akka.cluster.sharding.typed.scaladsl

- Interface Summary 
| Interface | Description |
| [ClusterSharding](ClusterSharding.html "interface in akka.cluster.sharding.typed.scaladsl") | This extension provides sharding functionality of actors in a cluster. |
| --- | --- |
| [ClusterSharding.ShardCommand](ClusterSharding.ShardCommand.html "interface in akka.cluster.sharding.typed.scaladsl") | When an entity is created an `ActorRef[ShardCommand]` is passed to the  factory method. |
| [EntityRef](EntityRef.html "interface in akka.cluster.sharding.typed.scaladsl")\<M\> | A reference to an sharded Entity, which allows `ActorRef`\-like usage. |
| [EntityTypeKey](EntityTypeKey.html "interface in akka.cluster.sharding.typed.scaladsl")\<T\> | The key of an entity type, the `name` must be unique. |
| [ShardedDaemonProcess](ShardedDaemonProcess.html "interface in akka.cluster.sharding.typed.scaladsl") | This extension runs a pre set number of actors in a cluster. |
- Class Summary 
| Class | Description |
| [ClusterSharding.Passivate](ClusterSharding.Passivate.html "class in akka.cluster.sharding.typed.scaladsl")\<M\> | The entity can request passivation by sending the [`ClusterSharding.Passivate`](ClusterSharding.Passivate.html "class in akka.cluster.sharding.typed.scaladsl") message  to the `ActorRef[ShardCommand]` that was passed in to the factory method  when creating the entity. |
| --- | --- |
| [ClusterSharding.Passivate$](ClusterSharding.Passivate$.html "class in akka.cluster.sharding.typed.scaladsl") |  |
| [ClusterSharding$](ClusterSharding$.html "class in akka.cluster.sharding.typed.scaladsl") |  |
| [ClusterShardingSetup](ClusterShardingSetup.html "class in akka.cluster.sharding.typed.scaladsl") | Can be used in [`ActorSystemSetup`](../../../../actor/setup/ActorSystemSetup.html "class in akka.actor.setup") when starting the `ActorSystem`  to replace the default implementation of the [`ClusterSharding`](ClusterSharding.html "interface in akka.cluster.sharding.typed.scaladsl") extension. |
| [ClusterShardingSetup$](ClusterShardingSetup$.html "class in akka.cluster.sharding.typed.scaladsl") |  |
| [Entity](Entity.html "class in akka.cluster.sharding.typed.scaladsl")\<M,​E\> | Defines how the entity should be created. |
| [Entity$](Entity$.html "class in akka.cluster.sharding.typed.scaladsl") |  |
| [EntityContext](EntityContext.html "class in akka.cluster.sharding.typed.scaladsl")\<M\> | Parameter to `createBehavior` function in `Entity.apply`. |
| [EntityTypeKey$](EntityTypeKey$.html "class in akka.cluster.sharding.typed.scaladsl") |  |
| [ShardedDaemonProcess$](ShardedDaemonProcess$.html "class in akka.cluster.sharding.typed.scaladsl") |  |
| [StartEntity](StartEntity.html "class in akka.cluster.sharding.typed.scaladsl") | Allows starting a specific Sharded Entity by its entity identifier |
| [StartEntity$](StartEntity$.html "class in akka.cluster.sharding.typed.scaladsl") | Allows starting a specific Sharded Entity by its entity identifier |

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/2.10/akka/actor/setup/ActorSystemSetup.html
- https://doc.akka.io/japi/akka/2.10/akka/cluster/sharding/typed/scaladsl/ClusterSharding$.html
- https://doc.akka.io/japi/akka/2.10/akka/cluster/sharding/typed/scaladsl/ClusterSharding.Passivate$.html
- https://doc.akka.io/japi/akka/2.10/akka/cluster/sharding/typed/scaladsl/ClusterSharding.Passivate.html
- https://doc.akka.io/japi/akka/2.10/akka/cluster/sharding/typed/scaladsl/ClusterSharding.ShardCommand.html
- https://doc.akka.io/japi/akka/2.10/akka/cluster/sharding/typed/scaladsl/ClusterSharding.html
- https://doc.akka.io/japi/akka/2.10/akka/cluster/sharding/typed/scaladsl/ClusterShardingSetup$.html
- https://doc.akka.io/japi/akka/2.10/akka/cluster/sharding/typed/scaladsl/ClusterShardingSetup.html
- https://doc.akka.io/japi/akka/2.10/akka/cluster/sharding/typed/scaladsl/Entity$.html
- https://doc.akka.io/japi/akka/2.10/akka/cluster/sharding/typed/scaladsl/Entity.html
- https://doc.akka.io/japi/akka/2.10/akka/cluster/sharding/typed/scaladsl/EntityContext.html
- https://doc.akka.io/japi/akka/2.10/akka/cluster/sharding/typed/scaladsl/EntityRef.html
- https://doc.akka.io/japi/akka/2.10/akka/cluster/sharding/typed/scaladsl/EntityTypeKey$.html
- https://doc.akka.io/japi/akka/2.10/akka/cluster/sharding/typed/scaladsl/EntityTypeKey.html
- https://doc.akka.io/japi/akka/2.10/akka/cluster/sharding/typed/scaladsl/ShardedDaemonProcess$.html
- https://doc.akka.io/japi/akka/2.10/akka/cluster/sharding/typed/scaladsl/ShardedDaemonProcess.html
- https://doc.akka.io/japi/akka/2.10/akka/cluster/sharding/typed/scaladsl/StartEntity$.html
- https://doc.akka.io/japi/akka/2.10/akka/cluster/sharding/typed/scaladsl/StartEntity.html

---
*Source: [https://doc.akka.io/japi/akka/2.10/akka/cluster/sharding/typed/scaladsl/package-summary.html](https://doc.akka.io/japi/akka/2.10/akka/cluster/sharding/typed/scaladsl/package-summary.html)*