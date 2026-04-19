---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:10:40Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/2.10/akka/cluster/sharding/typed/javadsl/package-summary.html
title: akka.cluster.sharding.typed.javadsl
---

# akka.cluster.sharding.typed.javadsl

## Content

# Package akka.cluster.sharding.typed.javadsl

- Interface Summary 
| Interface | Description |
| [ClusterSharding.ShardCommand](ClusterSharding.ShardCommand.html "interface in akka.cluster.sharding.typed.javadsl") | When an entity is created an `ActorRef[ShardCommand]` is passed to the  factory method. |
| --- | --- |
| [EntityFactory](EntityFactory.html "interface in akka.cluster.sharding.typed.javadsl")\<M\> |  |
- Class Summary 
| Class | Description |
| [ClusterSharding](ClusterSharding.html "class in akka.cluster.sharding.typed.javadsl") | This extension provides sharding functionality of actors in a cluster. |
| --- | --- |
| [ClusterSharding.Passivate](ClusterSharding.Passivate.html "class in akka.cluster.sharding.typed.javadsl")\<M\> | The entity can request passivation by sending the [`ClusterSharding.Passivate`](ClusterSharding.Passivate.html "class in akka.cluster.sharding.typed.javadsl") message  to the `ActorRef[ShardCommand]` that was passed in to the factory method  when creating the entity. |
| [ClusterSharding.Passivate$](ClusterSharding.Passivate$.html "class in akka.cluster.sharding.typed.javadsl") |  |
| [ClusterSharding$](ClusterSharding$.html "class in akka.cluster.sharding.typed.javadsl") |  |
| [Entity](Entity.html "class in akka.cluster.sharding.typed.javadsl")\<M,​E\> | Defines how the entity should be created. |
| [Entity$](Entity$.html "class in akka.cluster.sharding.typed.javadsl") |  |
| [EntityContext](EntityContext.html "class in akka.cluster.sharding.typed.javadsl")\<M\> | Parameter to `createBehavior` function in `Entity.of`. |
| [EntityRef](EntityRef.html "class in akka.cluster.sharding.typed.javadsl")\<M\> | A reference to an sharded Entity, which allows `ActorRef`\-like usage. |
| [EntityTypeKey](EntityTypeKey.html "class in akka.cluster.sharding.typed.javadsl")\<T\> | The key of an entity type, the `name` must be unique. |
| [EntityTypeKey$](EntityTypeKey$.html "class in akka.cluster.sharding.typed.javadsl") |  |
| [ShardedDaemonProcess](ShardedDaemonProcess.html "class in akka.cluster.sharding.typed.javadsl") | This extension runs a pre set number of actors in a cluster. |
| [ShardedDaemonProcess$](ShardedDaemonProcess$.html "class in akka.cluster.sharding.typed.javadsl") |  |
| [StartEntity](StartEntity.html "class in akka.cluster.sharding.typed.javadsl") | Allows starting a specific Sharded Entity by its entity identifier |
| [StartEntity$](StartEntity$.html "class in akka.cluster.sharding.typed.javadsl") | Allows starting a specific Sharded Entity by its entity identifier |

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/2.10/akka/cluster/sharding/typed/javadsl/ClusterSharding$.html
- https://doc.akka.io/japi/akka/2.10/akka/cluster/sharding/typed/javadsl/ClusterSharding.Passivate$.html
- https://doc.akka.io/japi/akka/2.10/akka/cluster/sharding/typed/javadsl/ClusterSharding.Passivate.html
- https://doc.akka.io/japi/akka/2.10/akka/cluster/sharding/typed/javadsl/ClusterSharding.ShardCommand.html
- https://doc.akka.io/japi/akka/2.10/akka/cluster/sharding/typed/javadsl/ClusterSharding.html
- https://doc.akka.io/japi/akka/2.10/akka/cluster/sharding/typed/javadsl/Entity$.html
- https://doc.akka.io/japi/akka/2.10/akka/cluster/sharding/typed/javadsl/Entity.html
- https://doc.akka.io/japi/akka/2.10/akka/cluster/sharding/typed/javadsl/EntityContext.html
- https://doc.akka.io/japi/akka/2.10/akka/cluster/sharding/typed/javadsl/EntityFactory.html
- https://doc.akka.io/japi/akka/2.10/akka/cluster/sharding/typed/javadsl/EntityRef.html
- https://doc.akka.io/japi/akka/2.10/akka/cluster/sharding/typed/javadsl/EntityTypeKey$.html
- https://doc.akka.io/japi/akka/2.10/akka/cluster/sharding/typed/javadsl/EntityTypeKey.html
- https://doc.akka.io/japi/akka/2.10/akka/cluster/sharding/typed/javadsl/ShardedDaemonProcess$.html
- https://doc.akka.io/japi/akka/2.10/akka/cluster/sharding/typed/javadsl/ShardedDaemonProcess.html
- https://doc.akka.io/japi/akka/2.10/akka/cluster/sharding/typed/javadsl/StartEntity$.html
- https://doc.akka.io/japi/akka/2.10/akka/cluster/sharding/typed/javadsl/StartEntity.html

---
*Source: [https://doc.akka.io/japi/akka/2.10/akka/cluster/sharding/typed/javadsl/package-summary.html](https://doc.akka.io/japi/akka/2.10/akka/cluster/sharding/typed/javadsl/package-summary.html)*