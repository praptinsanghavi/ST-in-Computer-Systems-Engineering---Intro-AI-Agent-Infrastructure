---
description: Akka 2.10.17 - akka.cluster.sharding.typed
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:38:49Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/cluster/sharding/typed/index.html
title: Akka 2.10.17 - akka.cluster.sharding.typed
---

# Akka 2.10.17 - akka.cluster.sharding.typed

> **Summary:** Akka 2.10.17 - akka.cluster.sharding.typed

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/cluster/index.html "Permalink")  package [cluster](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/cluster/sharding/index.html "Permalink")  package [sharding](../index.html)Definition Classes[cluster](../../index.html)
- [**](../../../../akka/cluster/sharding/external/index.html "Permalink")  package [external](../external/index.html)Definition Classes[sharding](../index.html)
- [**](../../../../akka/cluster/sharding/internal/index.html "Permalink")  package [internal](../internal/index.html)Definition Classes[sharding](../index.html)
- [**](../../../../akka/cluster/sharding/protobuf/index.html "Permalink")  package [protobuf](../protobuf/index.html)Definition Classes[sharding](../index.html)
- [**](../../../../akka/cluster/sharding/typed/index.html "Permalink")  package typedDefinition Classes[sharding](../index.html)
- [**](../../../../akka/cluster/sharding/typed/delivery/index.html "Permalink")  package [delivery](delivery/index.html)
- [**](../../../../akka/cluster/sharding/typed/internal/index.html "Permalink")  package [internal](internal/index.html)
- [**](../../../../akka/cluster/sharding/typed/javadsl/index.html "Permalink")  package [javadsl](javadsl/index.html)
- [**](../../../../akka/cluster/sharding/typed/scaladsl/index.html "Permalink")  package [scaladsl](scaladsl/index.html)
- [**](../../../../akka/cluster/sharding/typed/testkit/index.html "Permalink")  package [testkit](testkit/index.html)
- [ChangeNumberOfProcesses](ChangeNumberOfProcesses.html "Tell the sharded daemon process to rescale to the given number of processes.")
- [ClusterShardingQuery](ClusterShardingQuery.html "Protocol for querying sharding state e.g.")
- [ClusterShardingSettings](ClusterShardingSettings.html)
- [GetClusterShardingStats](GetClusterShardingStats.html "Query the statistics about the currently running sharded entities in the entire cluster.")
- [GetNumberOfProcesses](GetNumberOfProcesses.html "Query the sharded daemon process for the current scale")
- [GetShardRegionState](GetShardRegionState.html "Query the ShardRegion state for the given entity type key.")
- [HashCodeMessageExtractor](HashCodeMessageExtractor.html "Default message extractor type, using envelopes to identify what entity a message is for and the hashcode of the entityId to decide which shard an entity belongs to.")
- [HashCodeNoEnvelopeMessageExtractor](HashCodeNoEnvelopeMessageExtractor.html "Default message extractor type, using a property of the message to identify what entity a message is for and the hashcode of the entityId to decide which shard an entity belongs to.")
- [Murmur2MessageExtractor](Murmur2MessageExtractor.html "The murmur2 message extractor uses the same algorithm as the default kafka partitioner allowing kafka partitions to be mapped to shards.")
- [Murmur2NoEnvelopeMessageExtractor](Murmur2NoEnvelopeMessageExtractor.html)
- [NumberOfProcesses](NumberOfProcesses.html "Reply for GetNumberOfProcesses")
- [ReplicatedEntity](ReplicatedEntity.html "Settings for a specific replica id in replicated sharding Currently only Entity's with ShardingEnvelope are supported but this may change in the future")
- [ReplicatedEntityProvider](ReplicatedEntityProvider.html)
- [ReplicatedSharding](ReplicatedSharding.html "Represents the sharding instances for the replicas of one Replicated Event Sourcing entity type")
- [ReplicatedShardingExtension](ReplicatedShardingExtension.html "Not for user extension.")
- [ShardedDaemonProcessCommand](ShardedDaemonProcessCommand.html "Commands for interacting with the sharded daemon process")
- [ShardedDaemonProcessContext](ShardedDaemonProcessContext.html "Context with details about the Sharded Daemon Process instance to use when starting it")
- [ShardedDaemonProcessSettings](ShardedDaemonProcessSettings.html "Not for user constructions, use factory methods to instantiate.")
- [ShardingEnvelope](ShardingEnvelope.html "Default envelope type that may be used with Cluster Sharding.")
- [ShardingMessageExtractor](ShardingMessageExtractor.html "Entirely customizable typed message extractor.")
- [SliceRangeShardAllocationStrategy](SliceRangeShardAllocationStrategy.html "Intended to be used with database sharding, https://doc.akka.io/libraries/akka-persistence-r2dbc/current/data-partition.html, with a cluster of many Akka nodes.")
p[akka](../../../index.html).[cluster](../../index.html).[sharding](../index.html)

# typed[**](../../../../akka/cluster/sharding/typed/index.html "Permalink")

#### package typed

Content Hierarchy****Ordering1. Alphabetic
Visibility1. Public
2. Protected
### Package Members

1. [**](../../../../akka/cluster/sharding/typed/delivery/index.html "Permalink")  package [delivery](delivery/index.html)
2. [**](../../../../akka/cluster/sharding/typed/internal/index.html "Permalink")  package [internal](internal/index.html)
3. [**](../../../../akka/cluster/sharding/typed/javadsl/index.html "Permalink")  package [javadsl](javadsl/index.html)
4. [**](../../../../akka/cluster/sharding/typed/scaladsl/index.html "Permalink")  package [scaladsl](scaladsl/index.html)
5. [**](../../../../akka/cluster/sharding/typed/testkit/index.html "Permalink")  package [testkit](testkit/index.html)
### Type Members

1. [**](../../../../akka/cluster/sharding/typed/ChangeNumberOfProcesses.html "Permalink") final  class [ChangeNumberOfProcesses](ChangeNumberOfProcesses.html "Tell the sharded daemon process to rescale to the given number of processes.") extends [ShardedDaemonProcessCommand](ShardedDaemonProcessCommand.html) with ClusterShardingTypedSerializableTell the sharded daemon process to rescale to the given number of processes.
2. [**](../../../../akka/cluster/sharding/typed/ClusterShardingQuery.html "Permalink") sealed  trait [ClusterShardingQuery](ClusterShardingQuery.html "Protocol for querying sharding state e.g.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Protocol for querying sharding state e.g.

Protocol for querying sharding state e.g. A ShardRegion's state
3. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings.html "Permalink") final  class [ClusterShardingSettings](ClusterShardingSettings.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Annotations@nowarn()
4. [**](../../../../akka/cluster/sharding/typed/GetClusterShardingStats.html "Permalink") final  case class [GetClusterShardingStats](GetClusterShardingStats.html "Query the statistics about the currently running sharded entities in the entire cluster.")(entityTypeKey: [EntityTypeKey](scaladsl/EntityTypeKey.html)\[\_], timeout: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), replyTo: [ActorRef](../../../actor/typed/ActorRef.html)\[[ClusterShardingStats](../ShardRegion$$ClusterShardingStats.html)]) extends [ClusterShardingQuery](ClusterShardingQuery.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableQuery the statistics about the currently running sharded entities in the
entire cluster.

Query the statistics about the currently running sharded entities in the
entire cluster. If the given `timeout` is reached without answers from all
shard regions the reply will contain an empty map of regions.

Intended for testing purpose to see when cluster sharding is "ready" or to monitor
the state of the shard regions.

timeoutthe timeout applied to querying all alive regions

replyTothe actor to send the result to
5. [**](../../../../akka/cluster/sharding/typed/GetNumberOfProcesses.html "Permalink") final  class [GetNumberOfProcesses](GetNumberOfProcesses.html "Query the sharded daemon process for the current scale") extends [ShardedDaemonProcessCommand](ShardedDaemonProcessCommand.html) with ClusterShardingTypedSerializableQuery the sharded daemon process for the current scale
6. [**](../../../../akka/cluster/sharding/typed/GetShardRegionState.html "Permalink") final  case class [GetShardRegionState](GetShardRegionState.html "Query the ShardRegion state for the given entity type key.")(entityTypeKey: [EntityTypeKey](scaladsl/EntityTypeKey.html)\[\_], replyTo: [ActorRef](../../../actor/typed/ActorRef.html)\[[CurrentShardRegionState](../ShardRegion$$CurrentShardRegionState.html)]) extends [ClusterShardingQuery](ClusterShardingQuery.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableQuery the ShardRegion state for the given entity type key.

Query the ShardRegion state for the given entity type key. This will get the state of the
local ShardRegion's state.

Intended for testing purpose to see when cluster sharding is "ready" or to monitor
the state of the shard regions.

For the statistics for the entire cluster, see [GetClusterShardingStats](GetClusterShardingStats.html).
7. [**](../../../../akka/cluster/sharding/typed/HashCodeMessageExtractor.html "Permalink") final  class [HashCodeMessageExtractor](HashCodeMessageExtractor.html "Default message extractor type, using envelopes to identify what entity a message is for and the hashcode of the entityId to decide which shard an entity belongs to.")\[M] extends [ShardingMessageExtractor](ShardingMessageExtractor.html)\[[ShardingEnvelope](ShardingEnvelope.html)\[M], M]Default message extractor type, using envelopes to identify what entity a message is for
and the hashcode of the entityId to decide which shard an entity belongs to.

Default message extractor type, using envelopes to identify what entity a message is for
and the hashcode of the entityId to decide which shard an entity belongs to.

This is recommended since it does not force details about sharding into the entity protocol

MThe type of message accepted by the entity actor
8. [**](../../../../akka/cluster/sharding/typed/HashCodeNoEnvelopeMessageExtractor.html "Permalink") abstract  class [HashCodeNoEnvelopeMessageExtractor](HashCodeNoEnvelopeMessageExtractor.html "Default message extractor type, using a property of the message to identify what entity a message is for and the hashcode of the entityId to decide which shard an entity belongs to.")\[M] extends [ShardingMessageExtractor](ShardingMessageExtractor.html)\[M, M]Default message extractor type, using a property of the message to identify what entity a message is for
and the hashcode of the entityId to decide which shard an entity belongs to.

Default message extractor type, using a property of the message to identify what entity a message is for
and the hashcode of the entityId to decide which shard an entity belongs to.

This is recommended since it does not force details about sharding into the entity protocol

MThe type of message accepted by the entity actor
9. [**](../../../../akka/cluster/sharding/typed/Murmur2MessageExtractor.html "Permalink") final  class [Murmur2MessageExtractor](Murmur2MessageExtractor.html "The murmur2 message extractor uses the same algorithm as the default kafka partitioner allowing kafka partitions to be mapped to shards.")\[M] extends [ShardingMessageExtractor](ShardingMessageExtractor.html)\[[ShardingEnvelope](ShardingEnvelope.html)\[M], M]The murmur2 message extractor uses the same algorithm as the default kafka partitioner
allowing kafka partitions to be mapped to shards.

The murmur2 message extractor uses the same algorithm as the default kafka partitioner
allowing kafka partitions to be mapped to shards.
This can be used with the [akka.cluster.sharding.external.ExternalShardAllocationStrategy](../external/ExternalShardAllocationStrategy.html) to have messages
processed locally.

Extend [Murmur2NoEnvelopeMessageExtractor](Murmur2NoEnvelopeMessageExtractor.html) to not use a message envelope extractor.
10. [**](../../../../akka/cluster/sharding/typed/Murmur2NoEnvelopeMessageExtractor.html "Permalink") abstract  class [Murmur2NoEnvelopeMessageExtractor](Murmur2NoEnvelopeMessageExtractor.html)\[M] extends [ShardingMessageExtractor](ShardingMessageExtractor.html)\[M, M]
11. [**](../../../../akka/cluster/sharding/typed/NumberOfProcesses.html "Permalink")  trait [NumberOfProcesses](NumberOfProcesses.html "Reply for GetNumberOfProcesses") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Reply for [GetNumberOfProcesses](GetNumberOfProcesses.html)

Reply for [GetNumberOfProcesses](GetNumberOfProcesses.html)

Not for user extension

Annotations@[DoNotInherit](../../../annotation/DoNotInherit.html)()
12. [**](../../../../akka/cluster/sharding/typed/ReplicatedEntity.html "Permalink") final  class [ReplicatedEntity](ReplicatedEntity.html "Settings for a specific replica id in replicated sharding Currently only Entity's with ShardingEnvelope are supported but this may change in the future")\[M] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Settings for a specific replica id in replicated sharding
Currently only Entity's with ShardingEnvelope are supported but this may change in the future
13. [**](../../../../akka/cluster/sharding/typed/ReplicatedEntityProvider.html "Permalink") final  class [ReplicatedEntityProvider](ReplicatedEntityProvider.html)\[M] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)MThe type of messages the replicated entity accepts
14. [**](../../../../akka/cluster/sharding/typed/ReplicatedSharding.html "Permalink")  trait [ReplicatedSharding](ReplicatedSharding.html "Represents the sharding instances for the replicas of one Replicated Event Sourcing entity type")\[M] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Represents the sharding instances for the replicas of one Replicated Event Sourcing entity type

Represents the sharding instances for the replicas of one Replicated Event Sourcing entity type

Not for user extension.

Annotations@[DoNotInherit](../../../annotation/DoNotInherit.html)()
15. [**](../../../../akka/cluster/sharding/typed/ReplicatedShardingExtension.html "Permalink")  trait [ReplicatedShardingExtension](ReplicatedShardingExtension.html "Not for user extension.") extends [Extension](../../../actor/typed/Extension.html)Not for user extension.

Not for user extension.

Annotations@[DoNotInherit](../../../annotation/DoNotInherit.html)()
16. [**](../../../../akka/cluster/sharding/typed/ShardedDaemonProcessCommand.html "Permalink")  trait [ShardedDaemonProcessCommand](ShardedDaemonProcessCommand.html "Commands for interacting with the sharded daemon process") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Commands for interacting with the sharded daemon process

Commands for interacting with the sharded daemon process

Not for user extension

Annotations@[DoNotInherit](../../../annotation/DoNotInherit.html)()
17. [**](../../../../akka/cluster/sharding/typed/ShardedDaemonProcessContext.html "Permalink")  trait [ShardedDaemonProcessContext](ShardedDaemonProcessContext.html "Context with details about the Sharded Daemon Process instance to use when starting it") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Context with details about the Sharded Daemon Process instance to use when starting it

Context with details about the Sharded Daemon Process instance to use when starting it

Not for user extension

Annotations@[DoNotInherit](../../../annotation/DoNotInherit.html)() @[ApiMayChange](../../../annotation/ApiMayChange.html)()
18. [**](../../../../akka/cluster/sharding/typed/ShardedDaemonProcessSettings.html "Permalink") final  class [ShardedDaemonProcessSettings](ShardedDaemonProcessSettings.html "Not for user constructions, use factory methods to instantiate.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Not for user constructions, use factory methods to instantiate.
19. [**](../../../../akka/cluster/sharding/typed/ShardingEnvelope.html "Permalink") final  case class [ShardingEnvelope](ShardingEnvelope.html "Default envelope type that may be used with Cluster Sharding.")\[M](entityId: String, message: M) extends [WrappedMessage](../../../actor/WrappedMessage.html) with ClusterShardingTypedSerializable with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableDefault envelope type that may be used with Cluster Sharding.

Default envelope type that may be used with Cluster Sharding.

Cluster Sharding provides a default [HashCodeMessageExtractor](HashCodeMessageExtractor.html) that is able to handle
these types of messages, by hashing the entityId into into the shardId. It is not the only,
but a convenient way to send envelope\-wrapped messages via cluster sharding.

The alternative way of routing messages through sharding is to not use envelopes,
and have the message types themselves carry identifiers.

entityIdThe business domain identifier of the entity.

messageThe message to be send to the entity.

Exceptions thrown``InvalidMessageException`` if message is null.
20. [**](../../../../akka/cluster/sharding/typed/ShardingMessageExtractor.html "Permalink") abstract  class [ShardingMessageExtractor](ShardingMessageExtractor.html "Entirely customizable typed message extractor.")\[E, M] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Entirely customizable typed message extractor.

Entirely customizable typed message extractor. Prefer [HashCodeMessageExtractor](HashCodeMessageExtractor.html) or
[HashCodeNoEnvelopeMessageExtractor](HashCodeNoEnvelopeMessageExtractor.html)if possible.

EPossibly an Envelope around the messages accepted by the entity actor, is the same as `M` if there is no
 envelope.

MThe type of message accepted by the entity actor
21. [**](../../../../akka/cluster/sharding/typed/SliceRangeShardAllocationStrategy.html "Permalink")  class [SliceRangeShardAllocationStrategy](SliceRangeShardAllocationStrategy.html "Intended to be used with database sharding, https://doc.akka.io/libraries/akka-persistence-r2dbc/current/data-partition.html, with a cluster of many Akka nodes.") extends ActorSystemDependentAllocationStrategy with ClusterShardAllocationMixinIntended to be used with database sharding, https://doc.akka.io/libraries/akka\-persistence\-r2dbc/current/data\-partition.html,
with a cluster of many Akka nodes.

Intended to be used with database sharding, https://doc.akka.io/libraries/akka\-persistence\-r2dbc/current/data\-partition.html,
with a cluster of many Akka nodes. To avoid that each Akka node has database connections to all databases it is
preferred to collocate entities with the same slice and contiguous range of slices to the same Akka node. Thereby
the connections from one Akka node will go to one or a few databases since the database sharding is based on
slice ranges.

It must be used together with the [SliceRangeShardAllocationStrategy.ShardBySliceMessageExtractor](SliceRangeShardAllocationStrategy$$ShardBySliceMessageExtractor.html).

Create a new instance of this for each entity type, i.e. a `SliceRangeShardAllocationStrategy`
instance must not be shared between different entity types.

It will not rebalance when there is already an ongoing rebalance in progress.

Important: Do not change shard allocation strategy in a rolling update. The cluster must be fully stopped and
then started again when changing to a different allocation strategy.

Not intended for public inheritance/implementation.

Annotations@[DoNotInherit](../../../annotation/DoNotInherit.html)()
### Value Members

1. [**](../../../../akka/cluster/sharding/typed/ChangeNumberOfProcesses$.html "Permalink")  object [ChangeNumberOfProcesses](ChangeNumberOfProcesses$.html)
2. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$.html "Permalink")  object [ClusterShardingSettings](ClusterShardingSettings$.html)
3. [**](../../../../akka/cluster/sharding/typed/GetNumberOfProcesses$.html "Permalink")  object [GetNumberOfProcesses](GetNumberOfProcesses$.html)
4. [**](../../../../akka/cluster/sharding/typed/ReplicatedEntity$.html "Permalink")  object [ReplicatedEntity](ReplicatedEntity$.html)
5. [**](../../../../akka/cluster/sharding/typed/ReplicatedEntityProvider$.html "Permalink")  object [ReplicatedEntityProvider](ReplicatedEntityProvider$.html)
6. [**](../../../../akka/cluster/sharding/typed/ReplicatedShardingExtension$.html "Permalink")  object [ReplicatedShardingExtension](ReplicatedShardingExtension$.html "Extension for running Replicated Event Sourcing in sharding by starting one separate instance of sharding per replica.") extends [ExtensionId](../../../actor/typed/ExtensionId.html)\[[ReplicatedShardingExtension](ReplicatedShardingExtension.html)]Extension for running Replicated Event Sourcing in sharding by starting one separate instance of sharding per replica.

Extension for running Replicated Event Sourcing in sharding by starting one separate instance of sharding per replica.
The sharding instances can be confined to datacenters or cluster roles or run on the same set of cluster nodes.
7. [**](../../../../akka/cluster/sharding/typed/ShardedDaemonProcessSettings$.html "Permalink")  object [ShardedDaemonProcessSettings](ShardedDaemonProcessSettings$.html)
8. [**](../../../../akka/cluster/sharding/typed/ShardingMessageExtractor$.html "Permalink")  object [ShardingMessageExtractor](ShardingMessageExtractor$.html)
9. [**](../../../../akka/cluster/sharding/typed/SliceRangeShardAllocationStrategy$.html "Permalink")  object [SliceRangeShardAllocationStrategy](SliceRangeShardAllocationStrategy$.html)
### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/2.10/akka/actor/WrappedMessage.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/ActorRef.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/Extension.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/ExtensionId.html
- https://doc.akka.io/api/akka/2.10/akka/annotation/ApiMayChange.html
- https://doc.akka.io/api/akka/2.10/akka/annotation/DoNotInherit.html
- https://doc.akka.io/api/akka/2.10/akka/cluster/index.html
- https://doc.akka.io/api/akka/2.10/akka/cluster/sharding/ShardRegion$$ClusterShardingStats.html
- https://doc.akka.io/api/akka/2.10/akka/cluster/sharding/ShardRegion$$CurrentShardRegionState.html
- https://doc.akka.io/api/akka/2.10/akka/cluster/sharding/external/ExternalShardAllocationStrategy.html
- https://doc.akka.io/api/akka/2.10/akka/cluster/sharding/external/index.html
- https://doc.akka.io/api/akka/2.10/akka/cluster/sharding/index.html
- https://doc.akka.io/api/akka/2.10/akka/cluster/sharding/internal/index.html
- https://doc.akka.io/api/akka/2.10/akka/cluster/sharding/protobuf/index.html
- https://doc.akka.io/api/akka/2.10/akka/cluster/sharding/typed/ChangeNumberOfProcesses$.html
- https://doc.akka.io/api/akka/2.10/akka/cluster/sharding/typed/ChangeNumberOfProcesses.html
- https://doc.akka.io/api/akka/2.10/akka/cluster/sharding/typed/ClusterShardingQuery.html
- https://doc.akka.io/api/akka/2.10/akka/cluster/sharding/typed/ClusterShardingSettings$.html
- https://doc.akka.io/api/akka/2.10/akka/cluster/sharding/typed/ClusterShardingSettings.html
- https://doc.akka.io/api/akka/2.10/akka/cluster/sharding/typed/GetClusterShardingStats.html
- https://doc.akka.io/api/akka/2.10/akka/cluster/sharding/typed/GetNumberOfProcesses$.html
- https://doc.akka.io/api/akka/2.10/akka/cluster/sharding/typed/GetNumberOfProcesses.html
- https://doc.akka.io/api/akka/2.10/akka/cluster/sharding/typed/GetShardRegionState.html
- https://doc.akka.io/api/akka/2.10/akka/cluster/sharding/typed/HashCodeMessageExtractor.html
- https://doc.akka.io/api/akka/2.10/akka/cluster/sharding/typed/HashCodeNoEnvelopeMessageExtractor.html
- https://doc.akka.io/api/akka/2.10/akka/cluster/sharding/typed/Murmur2MessageExtractor.html
- https://doc.akka.io/api/akka/2.10/akka/cluster/sharding/typed/Murmur2NoEnvelopeMessageExtractor.html
- https://doc.akka.io/api/akka/2.10/akka/cluster/sharding/typed/NumberOfProcesses.html
- https://doc.akka.io/api/akka/2.10/akka/cluster/sharding/typed/ReplicatedEntity$.html
- https://doc.akka.io/api/akka/2.10/akka/cluster/sharding/typed/ReplicatedEntity.html
- https://doc.akka.io/api/akka/2.10/akka/cluster/sharding/typed/ReplicatedEntityProvider$.html
- https://doc.akka.io/api/akka/2.10/akka/cluster/sharding/typed/ReplicatedEntityProvider.html
- https://doc.akka.io/api/akka/2.10/akka/cluster/sharding/typed/ReplicatedSharding.html
- https://doc.akka.io/api/akka/2.10/akka/cluster/sharding/typed/ReplicatedShardingExtension$.html
- https://doc.akka.io/api/akka/2.10/akka/cluster/sharding/typed/ReplicatedShardingExtension.html
- https://doc.akka.io/api/akka/2.10/akka/cluster/sharding/typed/ShardedDaemonProcessCommand.html
- https://doc.akka.io/api/akka/2.10/akka/cluster/sharding/typed/ShardedDaemonProcessContext.html
- https://doc.akka.io/api/akka/2.10/akka/cluster/sharding/typed/ShardedDaemonProcessSettings$.html
- https://doc.akka.io/api/akka/2.10/akka/cluster/sharding/typed/ShardedDaemonProcessSettings.html
- https://doc.akka.io/api/akka/2.10/akka/cluster/sharding/typed/ShardingEnvelope.html
- https://doc.akka.io/api/akka/2.10/akka/cluster/sharding/typed/ShardingMessageExtractor$.html
- https://doc.akka.io/api/akka/2.10/akka/cluster/sharding/typed/ShardingMessageExtractor.html
- https://doc.akka.io/api/akka/2.10/akka/cluster/sharding/typed/SliceRangeShardAllocationStrategy$$ShardBySliceMessageExtractor.html
- https://doc.akka.io/api/akka/2.10/akka/cluster/sharding/typed/SliceRangeShardAllocationStrategy$.html
- https://doc.akka.io/api/akka/2.10/akka/cluster/sharding/typed/SliceRangeShardAllocationStrategy.html
- https://doc.akka.io/api/akka/2.10/akka/cluster/sharding/typed/delivery/index.html
- https://doc.akka.io/api/akka/2.10/akka/cluster/sharding/typed/index.html
- https://doc.akka.io/api/akka/2.10/akka/cluster/sharding/typed/internal/index.html
- https://doc.akka.io/api/akka/2.10/akka/cluster/sharding/typed/javadsl/index.html
- https://doc.akka.io/api/akka/2.10/akka/cluster/sharding/typed/scaladsl/EntityTypeKey.html

---
*Source: [https://doc.akka.io/api/akka/2.10/akka/cluster/sharding/typed/index.html](https://doc.akka.io/api/akka/2.10/akka/cluster/sharding/typed/index.html)*