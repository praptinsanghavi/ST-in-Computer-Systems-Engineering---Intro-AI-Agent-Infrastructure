---
description: Akka 2.10.17 - akka.cluster.sharding.typed.ClusterShardingSettings
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:21:14Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/cluster/sharding/typed/ClusterShardingSettings$.html
title: Akka 2.10.17 - akka.cluster.sharding.typed.ClusterShardingSettings
---

# Akka 2.10.17 - akka.cluster.sharding.typed.ClusterShardingSettings

> **Summary:** Akka 2.10.17 - akka.cluster.sharding.typed.ClusterShardingSettings

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
[o](ClusterShardingSettings.html "See companion class")[akka](../../../index.html).[cluster](../../index.html).[sharding](../index.html).[typed](index.html)

# [ClusterShardingSettings](ClusterShardingSettings.html "See companion class")[**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$.html "Permalink")

### Companion [class ClusterShardingSettings](ClusterShardingSettings.html "See companion class")

#### object ClusterShardingSettings

Source[ClusterShardingSettings.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-sharding-typed/src/main/scala/akka/cluster/sharding/typed/ClusterShardingSettings.scala#L25)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Content Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ClusterShardingSettings
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Type Members

1. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$$PassivationStrategySettings.html "Permalink") final  class [PassivationStrategySettings](ClusterShardingSettings$$PassivationStrategySettings.html "API MAY CHANGE: Settings for passivation strategies may change after additional testing and feedback.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)API MAY CHANGE: Settings for passivation strategies may change after additional testing and feedback.

API MAY CHANGE: Settings for passivation strategies may change after additional testing and feedback.

Annotations@[ApiMayChange](../../../annotation/ApiMayChange.html)()
2. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$$RememberEntitiesStoreMode.html "Permalink") sealed  trait [RememberEntitiesStoreMode](ClusterShardingSettings$$RememberEntitiesStoreMode.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
3. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$$StateStoreMode.html "Permalink") sealed  trait [StateStoreMode](ClusterShardingSettings$$StateStoreMode.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
4. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$$TuningParameters.html "Permalink") final  class [TuningParameters](ClusterShardingSettings$$TuningParameters.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
### Value Members

1. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$.html#apply(system:akka.actor.typed.ActorSystem[_]):akka.cluster.sharding.typed.ClusterShardingSettings "Permalink")  def apply(system: [ActorSystem](../../../actor/typed/ActorSystem.html)\[\_]): [ClusterShardingSettings](ClusterShardingSettings.html)Scala API: Creates new cluster sharding settings object
5. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
6. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
7. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$.html#create(system:akka.actor.typed.ActorSystem[_]):akka.cluster.sharding.typed.ClusterShardingSettings "Permalink")  def create(system: [ActorSystem](../../../actor/typed/ActorSystem.html)\[\_]): [ClusterShardingSettings](ClusterShardingSettings.html)Java API: Creates new cluster sharding settings object
8. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
9. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
10. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$.html#fromConfig(config:com.typesafe.config.Config):akka.cluster.sharding.typed.ClusterShardingSettings "Permalink")  def fromConfig(config: Config): [ClusterShardingSettings](ClusterShardingSettings.html)
11. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
12. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
13. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
14. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
15. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$.html#rememberEntitiesStoreModeDdata():akka.cluster.sharding.typed.ClusterShardingSettings.RememberEntitiesStoreMode "Permalink")  def rememberEntitiesStoreModeDdata(): [RememberEntitiesStoreMode](ClusterShardingSettings$$RememberEntitiesStoreMode.html)Java API
18. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$.html#rememberEntitiesStoreModeEventSourced():akka.cluster.sharding.typed.ClusterShardingSettings.RememberEntitiesStoreMode "Permalink")  def rememberEntitiesStoreModeEventSourced(): [RememberEntitiesStoreMode](ClusterShardingSettings$$RememberEntitiesStoreMode.html)Java API
19. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$.html#stateStoreModeDdata():akka.cluster.sharding.typed.ClusterShardingSettings.StateStoreMode "Permalink")  def stateStoreModeDdata(): [StateStoreMode](ClusterShardingSettings$$StateStoreMode.html)Java API
20. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$.html#stateStoreModePersistence():akka.cluster.sharding.typed.ClusterShardingSettings.StateStoreMode "Permalink")  def stateStoreModePersistence(): [StateStoreMode](ClusterShardingSettings$$StateStoreMode.html)Java API
21. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
22. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
23. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
24. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
25. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
26. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$$PassivationStrategySettings$.html "Permalink")  object [PassivationStrategySettings](ClusterShardingSettings$$PassivationStrategySettings$.html "API MAY CHANGE: Settings for passivation strategies may change after additional testing and feedback.")API MAY CHANGE: Settings for passivation strategies may change after additional testing and feedback.

API MAY CHANGE: Settings for passivation strategies may change after additional testing and feedback.

Annotations@[ApiMayChange](../../../annotation/ApiMayChange.html)()
27. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$$RememberEntitiesStoreMode$.html "Permalink")  object [RememberEntitiesStoreMode](ClusterShardingSettings$$RememberEntitiesStoreMode$.html)
28. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$$RememberEntitiesStoreModeDData$.html "Permalink")  case object [RememberEntitiesStoreModeDData](ClusterShardingSettings$$RememberEntitiesStoreModeDData$.html) extends [RememberEntitiesStoreMode](ClusterShardingSettings$$RememberEntitiesStoreMode.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
29. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$$RememberEntitiesStoreModeEventSourced$.html "Permalink")  case object [RememberEntitiesStoreModeEventSourced](ClusterShardingSettings$$RememberEntitiesStoreModeEventSourced$.html) extends [RememberEntitiesStoreMode](ClusterShardingSettings$$RememberEntitiesStoreMode.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
30. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$$StateStoreMode$.html "Permalink")  object [StateStoreMode](ClusterShardingSettings$$StateStoreMode$.html)
31. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$$StateStoreModeDData$.html "Permalink")  case object [StateStoreModeDData](ClusterShardingSettings$$StateStoreModeDData$.html) extends [StateStoreMode](ClusterShardingSettings$$StateStoreMode.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
32. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$$StateStoreModePersistence$.html "Permalink")  case object [StateStoreModePersistence](ClusterShardingSettings$$StateStoreModePersistence$.html) extends [StateStoreMode](ClusterShardingSettings$$StateStoreMode.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
### Deprecated Value Members

1. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/ActorSystem.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/annotation/ApiMayChange.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/typed/ChangeNumberOfProcesses$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/typed/ChangeNumberOfProcesses.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/typed/ClusterShardingQuery.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/typed/ClusterShardingSettings$$PassivationStrategySettings$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/typed/ClusterShardingSettings$$PassivationStrategySettings.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/typed/ClusterShardingSettings$$RememberEntitiesStoreMode$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/typed/ClusterShardingSettings$$RememberEntitiesStoreMode.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/typed/ClusterShardingSettings$$RememberEntitiesStoreModeDData$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/typed/ClusterShardingSettings$$RememberEntitiesStoreModeEventSourced$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/typed/ClusterShardingSettings$$StateStoreMode$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/typed/ClusterShardingSettings$$StateStoreMode.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/typed/ClusterShardingSettings$$StateStoreModeDData$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/typed/ClusterShardingSettings$$StateStoreModePersistence$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/typed/ClusterShardingSettings$$TuningParameters.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/typed/ClusterShardingSettings$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/typed/ClusterShardingSettings.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/typed/GetClusterShardingStats.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/typed/GetNumberOfProcesses$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/typed/GetNumberOfProcesses.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/typed/GetShardRegionState.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/typed/HashCodeMessageExtractor.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/typed/HashCodeNoEnvelopeMessageExtractor.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/typed/Murmur2MessageExtractor.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/typed/Murmur2NoEnvelopeMessageExtractor.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/typed/NumberOfProcesses.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/typed/ReplicatedEntity$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/typed/ReplicatedEntity.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/typed/ReplicatedEntityProvider$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/typed/ReplicatedEntityProvider.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/typed/ReplicatedSharding.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/typed/ReplicatedShardingExtension$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/typed/ReplicatedShardingExtension.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/typed/ShardedDaemonProcessCommand.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/typed/ShardedDaemonProcessContext.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/typed/ShardedDaemonProcessSettings$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/typed/ShardedDaemonProcessSettings.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/typed/ShardingEnvelope.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/typed/ShardingMessageExtractor$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/typed/ShardingMessageExtractor.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/typed/SliceRangeShardAllocationStrategy$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/typed/SliceRangeShardAllocationStrategy.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/typed/delivery/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/typed/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/typed/internal/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/typed/javadsl/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/typed/scaladsl/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/typed/ClusterShardingSettings$.html](https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/typed/ClusterShardingSettings$.html)*