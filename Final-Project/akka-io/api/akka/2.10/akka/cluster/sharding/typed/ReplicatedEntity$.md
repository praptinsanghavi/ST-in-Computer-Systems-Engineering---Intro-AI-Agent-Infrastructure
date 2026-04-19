---
description: Akka 2.10.17 - akka.cluster.sharding.typed.ReplicatedEntity
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:39:05Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/cluster/sharding/typed/ReplicatedEntity$.html
title: Akka 2.10.17 - akka.cluster.sharding.typed.ReplicatedEntity
---

# Akka 2.10.17 - akka.cluster.sharding.typed.ReplicatedEntity

> **Summary:** Akka 2.10.17 - akka.cluster.sharding.typed.ReplicatedEntity

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/cluster/index.html "Permalink")  package [cluster](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/cluster/sharding/index.html "Permalink")  package [sharding](../index.html)Definition Classes[cluster](../../index.html)
- [**](../../../../akka/cluster/sharding/typed/index.html "Permalink")  package [typed](index.html)Definition Classes[sharding](../index.html)
- [**](../../../../akka/cluster/sharding/typed/delivery/index.html "Permalink")  package [delivery](delivery/index.html)Definition Classes[typed](index.html)
- [**](../../../../akka/cluster/sharding/typed/internal/index.html "Permalink")  package [internal](internal/index.html)Definition Classes[typed](index.html)
- [**](../../../../akka/cluster/sharding/typed/javadsl/index.html "Permalink")  package [javadsl](javadsl/index.html)Definition Classes[typed](index.html)
- [**](../../../../akka/cluster/sharding/typed/scaladsl/index.html "Permalink")  package [scaladsl](scaladsl/index.html)Definition Classes[typed](index.html)
- [**](../../../../akka/cluster/sharding/typed/testkit/index.html "Permalink")  package [testkit](testkit/index.html)Definition Classes[typed](index.html)
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
[o](ReplicatedEntity.html "See companion class")[akka](../../../index.html).[cluster](../../index.html).[sharding](../index.html).[typed](index.html)

# [ReplicatedEntity](ReplicatedEntity.html "See companion class")[**](../../../../akka/cluster/sharding/typed/ReplicatedEntity$.html "Permalink")

### Companion [class ReplicatedEntity](ReplicatedEntity.html "See companion class")

#### object ReplicatedEntity

Source[ReplicatedEntityProvider.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-sharding-typed/src/main/scala/akka/cluster/sharding/typed/ReplicatedEntityProvider.scala#L157)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ReplicatedEntity
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../../../akka/cluster/sharding/typed/ReplicatedEntity$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/cluster/sharding/typed/ReplicatedEntity$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/cluster/sharding/typed/ReplicatedEntity$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../../akka/cluster/sharding/typed/ReplicatedEntity$.html#apply[M](replicaId:akka.persistence.typed.ReplicaId,entity:akka.cluster.sharding.typed.scaladsl.Entity[M,akka.cluster.sharding.typed.ShardingEnvelope[M]]):akka.cluster.sharding.typed.ReplicatedEntity[M] "Permalink")  def apply\[M](replicaId: [ReplicaId](../../../persistence/typed/ReplicaId.html), entity: [Entity](scaladsl/Entity.html)\[M, [ShardingEnvelope](ShardingEnvelope.html)\[M]]): [ReplicatedEntity](ReplicatedEntity.html)\[M]Scala API: Defines the [akka.cluster.sharding.typed.scaladsl.Entity](scaladsl/Entity.html) to use for a given replica, note that the behavior
can be a behavior created with [akka.persistence.typed.scaladsl.ReplicatedEventSourcing](../../../persistence/typed/scaladsl/ReplicatedEventSourcing$.html) or an arbitrary non persistent
[akka.actor.typed.Behavior](../../../actor/typed/Behavior.html) but must never be a regular [akka.persistence.typed.scaladsl.EventSourcedBehavior](../../../persistence/typed/scaladsl/EventSourcedBehavior.html)
as that requires a single writer and that would cause it to have multiple writers.
5. [**](../../../../akka/cluster/sharding/typed/ReplicatedEntity$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
6. [**](../../../../akka/cluster/sharding/typed/ReplicatedEntity$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
7. [**](../../../../akka/cluster/sharding/typed/ReplicatedEntity$.html#create[M](replicaId:akka.persistence.typed.ReplicaId,entity:akka.cluster.sharding.typed.javadsl.Entity[M,akka.cluster.sharding.typed.ShardingEnvelope[M]]):akka.cluster.sharding.typed.ReplicatedEntity[M] "Permalink")  def create\[M](replicaId: [ReplicaId](../../../persistence/typed/ReplicaId.html), entity: [Entity](javadsl/Entity.html)\[M, [ShardingEnvelope](ShardingEnvelope.html)\[M]]): [ReplicatedEntity](ReplicatedEntity.html)\[M]Java API: Defines the [akka.cluster.sharding.typed.javadsl.Entity](javadsl/Entity.html) to use for a given replica, note that the behavior
can be a [akka.persistence.typed.javadsl.ReplicatedEventSourcedBehavior](../../../persistence/typed/javadsl/ReplicatedEventSourcedBehavior.html) or an arbitrary non persistent
[akka.actor.typed.Behavior](../../../actor/typed/Behavior.html) but must never be a regular [akka.persistence.typed.javadsl.EventSourcedBehavior](../../../persistence/typed/javadsl/EventSourcedBehavior.html)
as that requires a single writer and that would cause it to have multiple writers.
8. [**](../../../../akka/cluster/sharding/typed/ReplicatedEntity$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
9. [**](../../../../akka/cluster/sharding/typed/ReplicatedEntity$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
10. [**](../../../../akka/cluster/sharding/typed/ReplicatedEntity$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
11. [**](../../../../akka/cluster/sharding/typed/ReplicatedEntity$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
12. [**](../../../../akka/cluster/sharding/typed/ReplicatedEntity$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
13. [**](../../../../akka/cluster/sharding/typed/ReplicatedEntity$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
14. [**](../../../../akka/cluster/sharding/typed/ReplicatedEntity$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../../akka/cluster/sharding/typed/ReplicatedEntity$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../../akka/cluster/sharding/typed/ReplicatedEntity$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
17. [**](../../../../akka/cluster/sharding/typed/ReplicatedEntity$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
18. [**](../../../../akka/cluster/sharding/typed/ReplicatedEntity$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
19. [**](../../../../akka/cluster/sharding/typed/ReplicatedEntity$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
20. [**](../../../../akka/cluster/sharding/typed/ReplicatedEntity$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/cluster/sharding/typed/ReplicatedEntity$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/2.10/akka/actor/typed/Behavior.html
- https://doc.akka.io/api/akka/2.10/akka/cluster/index.html
- https://doc.akka.io/api/akka/2.10/akka/cluster/sharding/index.html
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
- https://doc.akka.io/api/akka/2.10/akka/cluster/sharding/typed/SliceRangeShardAllocationStrategy$.html
- https://doc.akka.io/api/akka/2.10/akka/cluster/sharding/typed/SliceRangeShardAllocationStrategy.html
- https://doc.akka.io/api/akka/2.10/akka/cluster/sharding/typed/delivery/index.html
- https://doc.akka.io/api/akka/2.10/akka/cluster/sharding/typed/index.html
- https://doc.akka.io/api/akka/2.10/akka/cluster/sharding/typed/internal/index.html
- https://doc.akka.io/api/akka/2.10/akka/cluster/sharding/typed/javadsl/Entity.html
- https://doc.akka.io/api/akka/2.10/akka/cluster/sharding/typed/javadsl/index.html
- https://doc.akka.io/api/akka/2.10/akka/cluster/sharding/typed/scaladsl/Entity.html
- https://doc.akka.io/api/akka/2.10/akka/cluster/sharding/typed/scaladsl/index.html
- https://doc.akka.io/api/akka/2.10/akka/cluster/sharding/typed/testkit/index.html
- https://doc.akka.io/api/akka/2.10/akka/index.html
- https://doc.akka.io/api/akka/2.10/akka/persistence/typed/ReplicaId.html
- https://doc.akka.io/api/akka/2.10/akka/persistence/typed/javadsl/EventSourcedBehavior.html
- https://doc.akka.io/api/akka/2.10/akka/persistence/typed/javadsl/ReplicatedEventSourcedBehavior.html
- https://doc.akka.io/api/akka/2.10/akka/persistence/typed/scaladsl/EventSourcedBehavior.html
- https://doc.akka.io/api/akka/2.10/akka/persistence/typed/scaladsl/ReplicatedEventSourcing$.html
- https://doc.akka.io/api/akka/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka/2.10/akka/cluster/sharding/typed/ReplicatedEntity$.html](https://doc.akka.io/api/akka/2.10/akka/cluster/sharding/typed/ReplicatedEntity$.html)*