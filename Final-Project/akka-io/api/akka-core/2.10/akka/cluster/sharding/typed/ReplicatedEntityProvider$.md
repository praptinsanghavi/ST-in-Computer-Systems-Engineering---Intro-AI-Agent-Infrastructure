---
description: Akka 2.10.17 - akka.cluster.sharding.typed.ReplicatedEntityProvider
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:22:40Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/cluster/sharding/typed/ReplicatedEntityProvider$.html
title: Akka 2.10.17 - akka.cluster.sharding.typed.ReplicatedEntityProvider
---

# Akka 2.10.17 - akka.cluster.sharding.typed.ReplicatedEntityProvider

> **Summary:** Akka 2.10.17 - akka.cluster.sharding.typed.ReplicatedEntityProvider

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
[o](ReplicatedEntityProvider.html "See companion class")[akka](../../../index.html).[cluster](../../index.html).[sharding](../index.html).[typed](index.html)

# [ReplicatedEntityProvider](ReplicatedEntityProvider.html "See companion class")[**](../../../../akka/cluster/sharding/typed/ReplicatedEntityProvider$.html "Permalink")

### Companion [class ReplicatedEntityProvider](ReplicatedEntityProvider.html "See companion class")

#### object ReplicatedEntityProvider

Source[ReplicatedEntityProvider.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-sharding-typed/src/main/scala/akka/cluster/sharding/typed/ReplicatedEntityProvider.scala#L22)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ReplicatedEntityProvider
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../../../akka/cluster/sharding/typed/ReplicatedEntityProvider$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/cluster/sharding/typed/ReplicatedEntityProvider$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/cluster/sharding/typed/ReplicatedEntityProvider$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../../akka/cluster/sharding/typed/ReplicatedEntityProvider$.html#apply[M](typeName:String,allReplicaIds:Set[akka.persistence.typed.ReplicaId])(settingsPerReplicaFactory:(akka.cluster.sharding.typed.scaladsl.EntityTypeKey[M],akka.persistence.typed.ReplicaId)=>akka.cluster.sharding.typed.ReplicatedEntity[M])(implicitevidence$1:scala.reflect.ClassTag[M]):akka.cluster.sharding.typed.ReplicatedEntityProvider[M] "Permalink")  def apply\[M](typeName: String, allReplicaIds: Set\[[ReplicaId](../../../persistence/typed/ReplicaId.html)])(settingsPerReplicaFactory: ([EntityTypeKey](scaladsl/EntityTypeKey.html)\[M], [ReplicaId](../../../persistence/typed/ReplicaId.html)) \=\> [ReplicatedEntity](ReplicatedEntity.html)\[M])(implicit arg0: [ClassTag](https://www.scala-lang.org/api/2.13.17/scala/reflect/ClassTag.html#scala.reflect.ClassTag)\[M]): [ReplicatedEntityProvider](ReplicatedEntityProvider.html)\[M]Scala API:

Scala API:

Provides full control over the [ReplicatedEntity](ReplicatedEntity.html) and the Entity
Most use cases can use the [perDataCenter](#perDataCenter[M,E](typeName:String,allReplicaIds:Set[akka.persistence.typed.ReplicaId])(create:akka.persistence.typed.ReplicationId=>akka.actor.typed.Behavior[M])(implicitevidence$2:scala.reflect.ClassTag[M]):akka.cluster.sharding.typed.ReplicatedEntityProvider[M]) and [perRole](#perRole[M,E](typeName:String,allReplicaIds:Set[akka.persistence.typed.ReplicaId])(create:akka.persistence.typed.ReplicationId=>akka.actor.typed.Behavior[M])(implicitevidence$3:scala.reflect.ClassTag[M]):akka.cluster.sharding.typed.ReplicatedEntityProvider[M])

MThe type of messages the replicated entity accepts

typeNameThe type name used in the EntityTypeKey
5. [**](../../../../akka/cluster/sharding/typed/ReplicatedEntityProvider$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
6. [**](../../../../akka/cluster/sharding/typed/ReplicatedEntityProvider$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
7. [**](../../../../akka/cluster/sharding/typed/ReplicatedEntityProvider$.html#create[M](messageClass:Class[M],typeName:String,allReplicaIds:java.util.Set[akka.persistence.typed.ReplicaId],settingsPerReplicaFactory:akka.japi.function.Function2[akka.cluster.sharding.typed.javadsl.EntityTypeKey[M],akka.persistence.typed.ReplicaId,akka.cluster.sharding.typed.ReplicatedEntity[M]]):akka.cluster.sharding.typed.ReplicatedEntityProvider[M] "Permalink")  def create\[M](messageClass: Class\[M], typeName: String, allReplicaIds: [Set](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Set.html#java.util.Set)\[[ReplicaId](../../../persistence/typed/ReplicaId.html)], settingsPerReplicaFactory: [Function2](../../../japi/function/Function2.html)\[[EntityTypeKey](javadsl/EntityTypeKey.html)\[M], [ReplicaId](../../../persistence/typed/ReplicaId.html), [ReplicatedEntity](ReplicatedEntity.html)\[M]]): [ReplicatedEntityProvider](ReplicatedEntityProvider.html)\[M]Java API:

Java API:

Provides full control over the [ReplicatedEntity](ReplicatedEntity.html) and the Entity
Most use cases can use the [createPerDataCenter](#createPerDataCenter[M](messageClass:Class[M],typeName:String,allReplicaIds:java.util.Set[akka.persistence.typed.ReplicaId],createBehavior:java.util.function.Function[akka.persistence.typed.ReplicationId,akka.actor.typed.Behavior[M]]):akka.cluster.sharding.typed.ReplicatedEntityProvider[M]) and [createPerRole](#createPerRole[M](messageClass:Class[M],typeName:String,allReplicaIds:java.util.Set[akka.persistence.typed.ReplicaId],createBehavior:akka.japi.function.Function[akka.persistence.typed.ReplicationId,akka.actor.typed.Behavior[M]]):akka.cluster.sharding.typed.ReplicatedEntityProvider[M])

MThe type of messages the replicated entity accepts
8. [**](../../../../akka/cluster/sharding/typed/ReplicatedEntityProvider$.html#createPerRole[M](messageClass:Class[M],typeName:String,allReplicaIds:java.util.Set[akka.persistence.typed.ReplicaId],createBehavior:akka.japi.function.Function[akka.persistence.typed.ReplicationId,akka.actor.typed.Behavior[M]]):akka.cluster.sharding.typed.ReplicatedEntityProvider[M] "Permalink")  def createPerRole\[M](messageClass: Class\[M], typeName: String, allReplicaIds: [Set](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Set.html#java.util.Set)\[[ReplicaId](../../../persistence/typed/ReplicaId.html)], createBehavior: [Function](../../../japi/function/Function.html)\[[ReplicationId](../../../persistence/typed/ReplicationId.html), [Behavior](../../../actor/typed/Behavior.html)\[M]]): [ReplicatedEntityProvider](ReplicatedEntityProvider.html)\[M]Java API

Java API

Create a [ReplicatedEntityProvider](ReplicatedEntityProvider.html) that uses the defaults for Entity when running in
ClusterSharding.

Map replicas to roles and then there will be a replica per role e.g. to match to availability zones/racks
9. [**](../../../../akka/cluster/sharding/typed/ReplicatedEntityProvider$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
10. [**](../../../../akka/cluster/sharding/typed/ReplicatedEntityProvider$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
11. [**](../../../../akka/cluster/sharding/typed/ReplicatedEntityProvider$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
12. [**](../../../../akka/cluster/sharding/typed/ReplicatedEntityProvider$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
13. [**](../../../../akka/cluster/sharding/typed/ReplicatedEntityProvider$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
14. [**](../../../../akka/cluster/sharding/typed/ReplicatedEntityProvider$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
15. [**](../../../../akka/cluster/sharding/typed/ReplicatedEntityProvider$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../../akka/cluster/sharding/typed/ReplicatedEntityProvider$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../../../akka/cluster/sharding/typed/ReplicatedEntityProvider$.html#perRole[M,E](typeName:String,allReplicaIds:Set[akka.persistence.typed.ReplicaId])(create:akka.persistence.typed.ReplicationId=>akka.actor.typed.Behavior[M])(implicitevidence$3:scala.reflect.ClassTag[M]):akka.cluster.sharding.typed.ReplicatedEntityProvider[M] "Permalink")  def perRole\[M, E](typeName: String, allReplicaIds: Set\[[ReplicaId](../../../persistence/typed/ReplicaId.html)])(create: ([ReplicationId](../../../persistence/typed/ReplicationId.html)) \=\> [Behavior](../../../actor/typed/Behavior.html)\[M])(implicit arg0: [ClassTag](https://www.scala-lang.org/api/2.13.17/scala/reflect/ClassTag.html#scala.reflect.ClassTag)\[M]): [ReplicatedEntityProvider](ReplicatedEntityProvider.html)\[M]Scala API

Scala API

Create a [ReplicatedEntityProvider](ReplicatedEntityProvider.html) that uses the defaults for Entity when running in
ClusterSharding. The replicas in allReplicaIds should be roles used by nodes. A replica for each
entity will run on each role.
18. [**](../../../../akka/cluster/sharding/typed/ReplicatedEntityProvider$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
19. [**](../../../../akka/cluster/sharding/typed/ReplicatedEntityProvider$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
20. [**](../../../../akka/cluster/sharding/typed/ReplicatedEntityProvider$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
21. [**](../../../../akka/cluster/sharding/typed/ReplicatedEntityProvider$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
22. [**](../../../../akka/cluster/sharding/typed/ReplicatedEntityProvider$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/cluster/sharding/typed/ReplicatedEntityProvider$.html#createPerDataCenter[M](messageClass:Class[M],typeName:String,allReplicaIds:java.util.Set[akka.persistence.typed.ReplicaId],createBehavior:java.util.function.Function[akka.persistence.typed.ReplicationId,akka.actor.typed.Behavior[M]]):akka.cluster.sharding.typed.ReplicatedEntityProvider[M] "Permalink")  def createPerDataCenter\[M](messageClass: Class\[M], typeName: String, allReplicaIds: [Set](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Set.html#java.util.Set)\[[ReplicaId](../../../persistence/typed/ReplicaId.html)], createBehavior: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[ReplicationId](../../../persistence/typed/ReplicationId.html), [Behavior](../../../actor/typed/Behavior.html)\[M]]): [ReplicatedEntityProvider](ReplicatedEntityProvider.html)\[M]Java API

Java API

Create a [ReplicatedEntityProvider](ReplicatedEntityProvider.html) that uses the defaults for Entity when running in
ClusterSharding. A replica will be run per data center.

Annotations@deprecated Deprecated*(Since version 2\.10\.0\)* Use Akka Distributed Cluster instead
2. [**](../../../../akka/cluster/sharding/typed/ReplicatedEntityProvider$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
3. [**](../../../../akka/cluster/sharding/typed/ReplicatedEntityProvider$.html#perDataCenter[M,E](typeName:String,allReplicaIds:Set[akka.persistence.typed.ReplicaId])(create:akka.persistence.typed.ReplicationId=>akka.actor.typed.Behavior[M])(implicitevidence$2:scala.reflect.ClassTag[M]):akka.cluster.sharding.typed.ReplicatedEntityProvider[M] "Permalink")  def perDataCenter\[M, E](typeName: String, allReplicaIds: Set\[[ReplicaId](../../../persistence/typed/ReplicaId.html)])(create: ([ReplicationId](../../../persistence/typed/ReplicationId.html)) \=\> [Behavior](../../../actor/typed/Behavior.html)\[M])(implicit arg0: [ClassTag](https://www.scala-lang.org/api/2.13.17/scala/reflect/ClassTag.html#scala.reflect.ClassTag)\[M]): [ReplicatedEntityProvider](ReplicatedEntityProvider.html)\[M]Scala API

Scala API

Create a [ReplicatedEntityProvider](ReplicatedEntityProvider.html) that uses the defaults for Entity when running in
ClusterSharding. A replica will be run per data center.

Annotations@deprecated Deprecated*(Since version 2\.10\.0\)* Use Akka Distributed Cluster instead
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/Behavior.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/typed/ChangeNumberOfProcesses$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/typed/ChangeNumberOfProcesses.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/typed/ClusterShardingQuery.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/typed/ClusterShardingSettings$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/typed/ClusterShardingSettings.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/typed/GetClusterShardingStats.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/typed/GetNumberOfProcesses$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/typed/GetNumberOfProcesses.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/typed/GetShardRegionState.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/typed/HashCodeMessageExtractor.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/typed/HashCodeNoEnvelopeMessageExtractor.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/typed/Murmur2MessageExtractor.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/typed/Murmur2NoEnvelopeMessageExtractor.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/typed/NumberOfProcesses.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/typed/ReplicatedEntity$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/typed/ReplicatedEntity.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/typed/ReplicatedEntityProvider$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/typed/ReplicatedEntityProvider.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/typed/ReplicatedSharding.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/typed/ReplicatedShardingExtension$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/typed/ReplicatedShardingExtension.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/typed/ShardedDaemonProcessCommand.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/typed/ShardedDaemonProcessContext.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/typed/ShardedDaemonProcessSettings$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/typed/ShardedDaemonProcessSettings.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/typed/ShardingEnvelope.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/typed/ShardingMessageExtractor$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/typed/ShardingMessageExtractor.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/typed/SliceRangeShardAllocationStrategy$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/typed/SliceRangeShardAllocationStrategy.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/typed/delivery/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/typed/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/typed/internal/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/typed/javadsl/EntityTypeKey.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/typed/javadsl/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/typed/scaladsl/EntityTypeKey.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/typed/scaladsl/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/typed/testkit/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/japi/function/Function.html
- https://doc.akka.io/api/akka-core/2.10/akka/japi/function/Function2.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/ReplicaId.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/ReplicationId.html
- https://doc.akka.io/api/akka-core/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/typed/ReplicatedEntityProvider$.html](https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/typed/ReplicatedEntityProvider$.html)*