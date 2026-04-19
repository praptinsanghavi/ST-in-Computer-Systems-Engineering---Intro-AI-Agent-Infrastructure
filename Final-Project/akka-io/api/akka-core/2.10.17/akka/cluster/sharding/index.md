---
description: Akka 2.10.17 - akka.cluster.sharding
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:18:56Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/cluster/sharding/index.html
title: Akka 2.10.17 - akka.cluster.sharding
---

# Akka 2.10.17 - akka.cluster.sharding

> **Summary:** Akka 2.10.17 - akka.cluster.sharding

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/cluster/index.html "Permalink")  package [cluster](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/cluster/ddata/index.html "Permalink")  package [ddata](../ddata/index.html)Definition Classes[cluster](../index.html)
- [**](../../../akka/cluster/metrics/index.html "Permalink")  package [metrics](../metrics/index.html)Definition Classes[cluster](../index.html)
- [**](../../../akka/cluster/protobuf/index.html "Permalink")  package [protobuf](../protobuf/index.html)Definition Classes[cluster](../index.html)
- [**](../../../akka/cluster/pubsub/index.html "Permalink")  package [pubsub](../pubsub/index.html)Definition Classes[cluster](../index.html)
- [**](../../../akka/cluster/routing/index.html "Permalink")  package [routing](../routing/index.html)Definition Classes[cluster](../index.html)
- [**](../../../akka/cluster/sbr/index.html "Permalink")  package [sbr](../sbr/index.html)Definition Classes[cluster](../index.html)
- [**](../../../akka/cluster/sharding/index.html "Permalink")  package shardingDefinition Classes[cluster](../index.html)
- [**](../../../akka/cluster/sharding/external/index.html "Permalink")  package [external](external/index.html)
- [**](../../../akka/cluster/sharding/internal/index.html "Permalink")  package [internal](internal/index.html)
- [**](../../../akka/cluster/sharding/protobuf/index.html "Permalink")  package [protobuf](protobuf/index.html)
- [**](../../../akka/cluster/sharding/typed/index.html "Permalink")  package [typed](typed/index.html)
- [ClusterSharding](ClusterSharding.html)
- [ClusterShardingHealthCheck](ClusterShardingHealthCheck.html "INTERNAL API (ctr)")
- [ClusterShardingHealthCheckSettings](ClusterShardingHealthCheckSettings.html)
- [ClusterShardingSerializable](ClusterShardingSerializable.html "Marker trait for remote messages and persistent events/snapshots with special serializer.")
- [ClusterShardingSettings](ClusterShardingSettings.html)
- [ConsistentHashingShardAllocationStrategy](ConsistentHashingShardAllocationStrategy.html "akka.cluster.sharding.ShardCoordinator.ShardAllocationStrategy that is using consistent hashing.")
- [JoinConfigCompatCheckSharding](JoinConfigCompatCheckSharding.html "INTERNAL API")
- [PersistentShardCoordinator](PersistentShardCoordinator.html "Singleton coordinator that decides where to allocate shards.")
- [RemoveInternalClusterShardingData](RemoveInternalClusterShardingData.html)
- [ShardCoordinator](ShardCoordinator.html "Singleton coordinator that decides where to allocate shards.")
- [ShardRegion](ShardRegion$.html)
- [ShardingLogMarker](ShardingLogMarker$.html "This is public with the purpose to document the used markers and properties of log events.")
- [**](../../../akka/cluster/singleton/index.html "Permalink")  package [singleton](../singleton/index.html)Definition Classes[cluster](../index.html)
- [**](../../../akka/cluster/typed/index.html "Permalink")  package [typed](../typed/index.html)Definition Classes[cluster](../index.html)
p[akka](../../index.html).[cluster](../index.html)

# sharding[**](../../../akka/cluster/sharding/index.html "Permalink")

#### package sharding

Content Hierarchy****Ordering1. Alphabetic
Visibility1. Public
2. Protected
### Package Members

1. [**](../../../akka/cluster/sharding/external/index.html "Permalink")  package [external](external/index.html)
2. [**](../../../akka/cluster/sharding/internal/index.html "Permalink")  package [internal](internal/index.html)
3. [**](../../../akka/cluster/sharding/protobuf/index.html "Permalink")  package [protobuf](protobuf/index.html)
4. [**](../../../akka/cluster/sharding/typed/index.html "Permalink")  package [typed](typed/index.html)
### Type Members

1. [**](../../../akka/cluster/sharding/ClusterSharding.html "Permalink")  class [ClusterSharding](ClusterSharding.html) extends [Extension](../../actor/Extension.html)Annotations@nowarn() See also[ClusterSharding companion object](ClusterSharding$.html)
2. [**](../../../akka/cluster/sharding/ClusterShardingHealthCheck.html "Permalink") final  class [ClusterShardingHealthCheck](ClusterShardingHealthCheck.html "INTERNAL API (ctr)") extends () \=\> [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)]INTERNAL API (ctr)
3. [**](../../../akka/cluster/sharding/ClusterShardingHealthCheckSettings.html "Permalink") final  class [ClusterShardingHealthCheckSettings](ClusterShardingHealthCheckSettings.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
4. [**](../../../akka/cluster/sharding/ClusterShardingSerializable.html "Permalink")  trait [ClusterShardingSerializable](ClusterShardingSerializable.html "Marker trait for remote messages and persistent events/snapshots with special serializer.") extends SerializableMarker trait for remote messages and persistent events/snapshots with special serializer.
5. [**](../../../akka/cluster/sharding/ClusterShardingSettings.html "Permalink") final  class [ClusterShardingSettings](ClusterShardingSettings.html) extends [NoSerializationVerificationNeeded](../../actor/NoSerializationVerificationNeeded.html)
6. [**](../../../akka/cluster/sharding/ConsistentHashingShardAllocationStrategy.html "Permalink")  class [ConsistentHashingShardAllocationStrategy](ConsistentHashingShardAllocationStrategy.html "akka.cluster.sharding.ShardCoordinator.ShardAllocationStrategy that is using consistent hashing.") extends ActorSystemDependentAllocationStrategy with ClusterShardAllocationMixin[akka.cluster.sharding.ShardCoordinator.ShardAllocationStrategy](ShardCoordinator$$ShardAllocationStrategy.html) that is using consistent
hashing.

[akka.cluster.sharding.ShardCoordinator.ShardAllocationStrategy](ShardCoordinator$$ShardAllocationStrategy.html) that is using consistent
hashing. This can be useful when shards with the same shard id for different entity types
should be best effort colocated to the same nodes.

When adding or removing nodes it will rebalance according to the new consistent hashing,
but that means that only a few shards will be rebalanced and others remain on the same
location.

A good explanation of Consistent Hashing:
https://tom\-e\-white.com/2007/11/consistent\-hashing.html

Create a new instance of this for each entity types, i.e. a `ConsistentHashingShardAllocationStrategy`
instance must not be shared between different entity types.

Not intended for public inheritance/implementation

Annotations@[DoNotInherit](../../annotation/DoNotInherit.html)()
7. [**](../../../akka/cluster/sharding/JoinConfigCompatCheckSharding.html "Permalink") final  class [JoinConfigCompatCheckSharding](JoinConfigCompatCheckSharding.html "INTERNAL API") extends [JoinConfigCompatChecker](../JoinConfigCompatChecker.html)INTERNAL API

INTERNAL API

Annotations@[InternalApi](../../annotation/InternalApi.html)()
8. [**](../../../akka/cluster/sharding/RemoveInternalClusterShardingData.html "Permalink")  class [RemoveInternalClusterShardingData](RemoveInternalClusterShardingData.html) extends [Actor](../../actor/Actor.html) with [ActorLogging](../../actor/ActorLogging.html)See also[RemoveInternalClusterShardingData companion object](RemoveInternalClusterShardingData$.html)
9. [**](../../../akka/cluster/sharding/ShardCoordinator.html "Permalink") abstract  class [ShardCoordinator](ShardCoordinator.html "Singleton coordinator that decides where to allocate shards.") extends [Actor](../../actor/Actor.html) with [Timers](../../actor/Timers.html)Singleton coordinator that decides where to allocate shards.

Singleton coordinator that decides where to allocate shards.

See also[ClusterSharding extension](ClusterSharding$.html)
### Deprecated Type Members

1. [**](../../../akka/cluster/sharding/PersistentShardCoordinator.html "Permalink")  class [PersistentShardCoordinator](PersistentShardCoordinator.html "Singleton coordinator that decides where to allocate shards.") extends [ShardCoordinator](ShardCoordinator.html) with [PersistentActor](../../persistence/PersistentActor.html)Singleton coordinator that decides where to allocate shards.

Singleton coordinator that decides where to allocate shards.

Users can migrate to using DData to store state then either Event Sourcing or ddata to store
the remembered entities.

Annotations@deprecated Deprecated*(Since version 2\.6\.0\)* Use `ddata` mode, persistence mode is deprecated.

See also[ClusterSharding extension](ClusterSharding$.html)
### Value Members

1. [**](../../../akka/cluster/sharding/ClusterSharding$.html "Permalink")  object [ClusterSharding](ClusterSharding$.html "This extension provides sharding functionality of actors in a cluster.") extends [ExtensionId](../../actor/ExtensionId.html)\[[ClusterSharding](ClusterSharding.html)] with [ExtensionIdProvider](../../actor/ExtensionIdProvider.html)This extension provides sharding functionality of actors in a cluster.

This extension provides sharding functionality of actors in a cluster.
The typical use case is when you have many stateful actors that together consume
more resources (e.g. memory) than fit on one machine.

	- Distribution: You need to distribute them across several nodes in the cluster
	- Location Transparency: You need to interact with them using their logical identifier,
	without having to care about their physical location in the cluster, which can change over time.**Entities**:
It could for example be actors representing Aggregate Roots in Domain\-Driven Design
terminology. Here we call these actors "entities" which typically have persistent
(durable) state, but this feature is not limited to persistent state actors.

**Sharding**:
In this context sharding means that actors with an identifier, or entities,
can be automatically distributed across multiple nodes in the cluster.

**ShardRegion**:
Each entity actor runs only at one place, and messages can be sent to the entity without
requiring the sender to know the location of the destination actor. This is achieved by
sending the messages via a ShardRegion actor, provided by this extension. The ShardRegion
knows the shard mappings and routes inbound messages to the entity with the entity id.
Messages to the entities are always sent via the local `ShardRegion`.
The `ShardRegion` actor is started on each node in the cluster, or group of nodes
tagged with a specific role. The `ShardRegion` is created with two application specific
functions to extract the entity identifier and the shard identifier from incoming messages.

Typical usage of this extension:

	1. At system startup on each cluster node by registering the supported entity types with
	the [ClusterSharding\#start](ClusterSharding.html#start(typeName:String,entityProps:akka.actor.Props,messageExtractor:akka.cluster.sharding.ShardRegion.MessageExtractor):akka.actor.ActorRef) method
	2. Retrieve the `ShardRegion` actor for a named entity type with [ClusterSharding\#shardRegion](ClusterSharding.html#shardRegion(typeName:String):akka.actor.ActorRef)
	Settings can be configured as described in the `akka.cluster.sharding` section of the `reference.conf`.**Shard and ShardCoordinator**:
A shard is a group of entities that will be managed together. For the first message in a
specific shard the `ShardRegion` requests the location of the shard from a central
[ShardCoordinator](ShardCoordinator.html). The `ShardCoordinator` decides which `ShardRegion`
owns the shard. The `ShardRegion` receives the decided home of the shard
and if that is the `ShardRegion` instance itself it will create a local child
actor representing the entity and direct all messages for that entity to it.
If the shard home is another `ShardRegion`, instance messages will be forwarded
to that `ShardRegion` instance instead. While resolving the location of a
shard, incoming messages for that shard are buffered and later delivered when the
shard location is known. Subsequent messages to the resolved shard can be delivered
to the target destination immediately without involving the `ShardCoordinator`.
To make sure at\-most\-one instance of a specific entity actor is running somewhere
in the cluster it is important that all nodes have the same view of where the shards
are located. Therefore the shard allocation decisions are taken by the central
`ShardCoordinator`, a cluster singleton, i.e. one instance on
the oldest member among all cluster nodes or a group of nodes tagged with a specific
role. The oldest member can be determined by [akka.cluster.Member\#isOlderThan](../Member.html#isOlderThan(other:akka.cluster.Member):Boolean).

**Shard Rebalancing**:
To be able to use newly added members in the cluster the coordinator facilitates rebalancing
of shards, migrating entities from one node to another. In the rebalance process the
coordinator first notifies all `ShardRegion` actors that a handoff for a shard has begun.
`ShardRegion` actors will start buffering incoming messages for that shard, as they do when
shard location is unknown. During the rebalance process the coordinator will not answer any
requests for the location of shards that are being rebalanced, i.e. local buffering will
continue until the handoff is complete. The `ShardRegion` responsible for the rebalanced shard
will stop all entities in that shard by sending them a `PoisonPill`. When all entities have
been terminated the `ShardRegion` owning the entities will acknowledge to the coordinator that
the handoff has completed. Thereafter the coordinator will reply to requests for the location of
the shard, allocate a new home for the shard and then buffered messages in the
`ShardRegion` actors are delivered to the new location. This means that the state of the entities
are not transferred or migrated. If the state of the entities are of importance it should be
persistent (durable), e.g. with `akka-persistence` so that it can be recovered at the new
location.

**Shard Allocation**:
The logic deciding which shards to rebalance is defined in a plugable shard allocation
strategy. The default implementation `LeastShardAllocationStrategy`
picks shards for handoff from the `ShardRegion` with highest number of previously allocated shards.
They will then be allocated to the `ShardRegion` with lowest number of previously allocated shards,
i.e. new members in the cluster. This strategy can be replaced by an application
specific implementation.

**Recovery**:
The state of shard locations in the `ShardCoordinator` is stored with `akka-distributed-data` or
`akka-persistence` to survive failures. When a crashed or unreachable coordinator
node has been removed (via down) from the cluster a new `ShardCoordinator` singleton
actor will take over and the state is recovered. During such a failure period shards
with known location are still available, while messages for new (unknown) shards
are buffered until the new `ShardCoordinator` becomes available.

**Delivery Semantics**:
As long as a sender uses the same `ShardRegion` actor to deliver messages to an entity
actor the order of the messages is preserved. As long as the buffer limit is not reached
messages are delivered on a best effort basis, with at\-most once delivery semantics,
in the same way as ordinary message sending. Reliable end\-to\-end messaging, with
at\-least\-once semantics can be added by using `AtLeastOnceDelivery` in `akka-persistence`.

Some additional latency is introduced for messages targeted to new or previously
unused shards due to the round\-trip to the coordinator. Rebalancing of shards may
also add latency. This should be considered when designing the application specific
shard resolution, e.g. to avoid too fine grained shards.

The `ShardRegion` actor can also be started in proxy only mode, i.e. it will not
host any entities itself, but knows how to delegate messages to the right location.

If the state of the entities are persistent you may stop entities that are not used to
reduce memory consumption. This is done by the application specific implementation of
the entity actors for example by defining receive timeout (`context.setReceiveTimeout`).
If a message is already enqueued to the entity when it stops itself the enqueued message
in the mailbox will be dropped. To support graceful passivation without losing such
messages the entity actor can send [ShardRegion.Passivate](ShardRegion$$Passivate.html) to its parent `ShardRegion`.
The specified wrapped message in `Passivate` will be sent back to the entity, which is
then supposed to stop itself. Incoming messages will be buffered by the `ShardRegion`
between reception of `Passivate` and termination of the entity. Such buffered messages
are thereafter delivered to a new incarnation of the entity.
2. [**](../../../akka/cluster/sharding/ClusterShardingSettings$.html "Permalink")  object [ClusterShardingSettings](ClusterShardingSettings$.html)
3. [**](../../../akka/cluster/sharding/ConsistentHashingShardAllocationStrategy$.html "Permalink")  object [ConsistentHashingShardAllocationStrategy](ConsistentHashingShardAllocationStrategy$.html)
4. [**](../../../akka/cluster/sharding/RemoveInternalClusterShardingData$.html "Permalink")  object [RemoveInternalClusterShardingData](RemoveInternalClusterShardingData$.html "Utility program that removes the internal data stored with Akka Persistence by the Cluster ShardCoordinator.")Utility program that removes the internal data stored with Akka Persistence
by the Cluster `ShardCoordinator`.

Utility program that removes the internal data stored with Akka Persistence
by the Cluster `ShardCoordinator`. The data contains the locations of the
shards using Akka Persistence and it can safely be removed when restarting
the whole Akka Cluster. Note that this is not application data.

**Never use this program while there are running Akka Cluster that is
using Cluster Sharding. Stop all Cluster nodes before using this program.**

It can be needed to remove the data if the Cluster `ShardCoordinator`
cannot startup because of corrupt data, which may happen if accidentally
two clusters were running at the same time, e.g. caused by using auto\-down
and there was a network partition.

Use this program as a standalone Java main program:

```
java -classpath <jar files, including akka-cluster-sharding>
  akka.cluster.sharding.RemoveInternalClusterShardingData
    -2.3 entityType1 entityType2 entityType3
```
The program is included in the `akka-cluster-sharding` jar file. It
is easiest to run it with same classpath and configuration as your ordinary
application. It can be run from sbt or maven in similar way.

Specify the entity type names (same as you use in the `start` method
of `ClusterSharding`) as program arguments.

If you specify `-2.3` as the first program argument it will also try
to remove data that was stored by Cluster Sharding in Akka 2\.3\.x using
different persistenceId.
5. [**](../../../akka/cluster/sharding/ShardCoordinator$.html "Permalink")  object [ShardCoordinator](ShardCoordinator$.html)See also[ClusterSharding extension](ClusterSharding$.html)
6. [**](../../../akka/cluster/sharding/ShardRegion$.html "Permalink")  object [ShardRegion](ShardRegion$.html)See also[ClusterSharding extension](ClusterSharding$.html)
7. [**](../../../akka/cluster/sharding/ShardingLogMarker$.html "Permalink")  object [ShardingLogMarker](ShardingLogMarker$.html "This is public with the purpose to document the used markers and properties of log events.")This is public with the purpose to document the used markers and properties of log events.

This is public with the purpose to document the used markers and properties of log events.
No guarantee that it will remain binary compatible, but the marker names and properties
are considered public API and will not be changed without notice.
### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/Actor.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/ActorLogging.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/Extension.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/ExtensionId.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/ExtensionIdProvider.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/NoSerializationVerificationNeeded.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/Timers.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/annotation/DoNotInherit.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/annotation/InternalApi.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/JoinConfigCompatChecker.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/Member.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ddata/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/metrics/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/protobuf/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/pubsub/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/routing/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sbr/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/ClusterSharding$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/ClusterSharding.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/ClusterShardingHealthCheck.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/ClusterShardingHealthCheckSettings.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/ClusterShardingSerializable.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/ClusterShardingSettings$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/ClusterShardingSettings.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/ConsistentHashingShardAllocationStrategy$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/ConsistentHashingShardAllocationStrategy.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/JoinConfigCompatCheckSharding.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/PersistentShardCoordinator.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/RemoveInternalClusterShardingData$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/RemoveInternalClusterShardingData.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/ShardCoordinator$$ShardAllocationStrategy.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/ShardCoordinator$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/ShardCoordinator.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/ShardRegion$$Passivate.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/ShardRegion$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/ShardingLogMarker$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/external/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/internal/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/protobuf/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/typed/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/singleton/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/typed/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/PersistentActor.html
- https://doc.akka.io/api/akka-core/2.10.17/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/index.html](https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/index.html)*