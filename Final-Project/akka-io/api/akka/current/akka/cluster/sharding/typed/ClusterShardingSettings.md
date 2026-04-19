---
description: Akka 2.10.17 - akka.cluster.sharding.typed.ClusterShardingSettings
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:48:09Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/cluster/sharding/typed/ClusterShardingSettings.html
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
- ClusterShardingSettings
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
[c](ClusterShardingSettings$.html "See companion object")[akka](../../../index.html).[cluster](../../index.html).[sharding](../index.html).[typed](index.html)

# [ClusterShardingSettings](ClusterShardingSettings$.html "See companion object")[**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings.html "Permalink")

### Companion [object ClusterShardingSettings](ClusterShardingSettings$.html "See companion object")

#### final  class ClusterShardingSettings extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

Annotations@nowarn() Source[ClusterShardingSettings.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-sharding-typed/src/main/scala/akka/cluster/sharding/typed/ClusterShardingSettings.scala#L828)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ClusterShardingSettings
2. AnyRef
3. Any
Implicitly  
1. by any2stringadd
2. by StringFormat
3. by Ensuring
4. by ArrowAssoc
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Instance Constructors

1. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings.html#<init>(numberOfShards:Int,role:Option[String],dataCenter:Option[akka.cluster.ClusterSettings.DataCenter],rememberEntities:Boolean,journalPluginId:String,snapshotPluginId:String,passivationStrategySettings:akka.cluster.sharding.typed.ClusterShardingSettings.PassivationStrategySettings,shardRegionQueryTimeout:scala.concurrent.duration.FiniteDuration,stateStoreMode:akka.cluster.sharding.typed.ClusterShardingSettings.StateStoreMode,rememberEntitiesStoreMode:akka.cluster.sharding.typed.ClusterShardingSettings.RememberEntitiesStoreMode,tuningParameters:akka.cluster.sharding.typed.ClusterShardingSettings.TuningParameters,coordinatorSingletonOverrideRole:Boolean,coordinatorSingletonSettings:akka.cluster.typed.ClusterSingletonManagerSettings,leaseSettings:Option[akka.coordination.lease.LeaseUsageSettings]):akka.cluster.sharding.typed.ClusterShardingSettings "Permalink")  new ClusterShardingSettings(numberOfShards: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), role: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[String], dataCenter: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[DataCenter](../../ClusterSettings$.html#DataCenter=String)], rememberEntities: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), journalPluginId: String, snapshotPluginId: String, passivationStrategySettings: [PassivationStrategySettings](ClusterShardingSettings$$PassivationStrategySettings.html), shardRegionQueryTimeout: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), stateStoreMode: [StateStoreMode](ClusterShardingSettings$$StateStoreMode.html), rememberEntitiesStoreMode: [RememberEntitiesStoreMode](ClusterShardingSettings$$RememberEntitiesStoreMode.html), tuningParameters: [TuningParameters](ClusterShardingSettings$$TuningParameters.html), coordinatorSingletonOverrideRole: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), coordinatorSingletonSettings: [ClusterSingletonManagerSettings](../../typed/ClusterSingletonManagerSettings.html), leaseSettings: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[LeaseUsageSettings](../../../coordination/lease/LeaseUsageSettings.html)])numberOfShardsnumber of shards used by the default [HashCodeMessageExtractor](HashCodeMessageExtractor.html)

roleSpecifies that this entity type requires cluster nodes with a specific role.
 If the role is not specified all nodes in the cluster are used. If the given role does
 not match the role of the current node the `ShardRegion` will be started in proxy mode.

dataCenterThe data center of the cluster nodes where the cluster sharding is running.
 If the dataCenter is not specified then the same data center as current node. If the given
 dataCenter does not match the data center of the current node the `ShardRegion` will be started
 in proxy mode.

rememberEntitiestrue if active entity actors shall be automatically restarted upon `Shard`
 restart. i.e. if the `Shard` is started on a different `ShardRegion` due to rebalance or crash.

journalPluginIdAbsolute path to the journal plugin configuration entity that is to
 be used for the internal persistence of ClusterSharding. If not defined the default
 journal plugin is used. Note that this is not related to persistence used by the entity
 actors.

snapshotPluginIdAbsolute path to the snapshot plugin configuration entity that is to
 be used for the internal persistence of ClusterSharding. If not defined the default
 snapshot plugin is used. Note that this is not related to persistence used by the entity
 actors.

passivationStrategySettingssettings for automatic passivation strategy, see descriptions in reference.conf

tuningParametersadditional tuning parameters, see descriptions in reference.conf

leaseSettingsLeaseSettings for acquiring before creating the shard.
 Note that if you define a custom lease name and have several sharding entity types each one must have a unique
 lease name. If the lease name is undefined it will be derived from ActorSystem name and shard name,
 but that may result in too long lease names.
2. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings.html#<init>(numberOfShards:Int,role:Option[String],dataCenter:Option[akka.cluster.ClusterSettings.DataCenter],rememberEntities:Boolean,journalPluginId:String,snapshotPluginId:String,passivateIdleEntityAfter:scala.concurrent.duration.FiniteDuration,shardRegionQueryTimeout:scala.concurrent.duration.FiniteDuration,stateStoreMode:akka.cluster.sharding.typed.ClusterShardingSettings.StateStoreMode,tuningParameters:akka.cluster.sharding.typed.ClusterShardingSettings.TuningParameters,coordinatorSingletonSettings:akka.cluster.typed.ClusterSingletonManagerSettings):akka.cluster.sharding.typed.ClusterShardingSettings "Permalink")  new ClusterShardingSettings(numberOfShards: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), role: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[String], dataCenter: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[DataCenter](../../ClusterSettings$.html#DataCenter=String)], rememberEntities: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), journalPluginId: String, snapshotPluginId: String, passivateIdleEntityAfter: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), shardRegionQueryTimeout: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), stateStoreMode: [StateStoreMode](ClusterShardingSettings$$StateStoreMode.html), tuningParameters: [TuningParameters](ClusterShardingSettings$$TuningParameters.html), coordinatorSingletonSettings: [ClusterSingletonManagerSettings](../../typed/ClusterSingletonManagerSettings.html))Annotations@deprecated Deprecated*(Since version 2\.6\.6\)* Use constructor with rememberEntitiesStoreMode
3. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings.html#<init>(numberOfShards:Int,role:Option[String],dataCenter:Option[akka.cluster.ClusterSettings.DataCenter],rememberEntities:Boolean,journalPluginId:String,snapshotPluginId:String,passivateIdleEntityAfter:scala.concurrent.duration.FiniteDuration,shardRegionQueryTimeout:scala.concurrent.duration.FiniteDuration,stateStoreMode:akka.cluster.sharding.typed.ClusterShardingSettings.StateStoreMode,rememberEntitiesStoreMode:akka.cluster.sharding.typed.ClusterShardingSettings.RememberEntitiesStoreMode,tuningParameters:akka.cluster.sharding.typed.ClusterShardingSettings.TuningParameters,coordinatorSingletonSettings:akka.cluster.typed.ClusterSingletonManagerSettings):akka.cluster.sharding.typed.ClusterShardingSettings "Permalink")  new ClusterShardingSettings(numberOfShards: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), role: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[String], dataCenter: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[DataCenter](../../ClusterSettings$.html#DataCenter=String)], rememberEntities: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), journalPluginId: String, snapshotPluginId: String, passivateIdleEntityAfter: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), shardRegionQueryTimeout: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), stateStoreMode: [StateStoreMode](ClusterShardingSettings$$StateStoreMode.html), rememberEntitiesStoreMode: [RememberEntitiesStoreMode](ClusterShardingSettings$$RememberEntitiesStoreMode.html), tuningParameters: [TuningParameters](ClusterShardingSettings$$TuningParameters.html), coordinatorSingletonSettings: [ClusterSingletonManagerSettings](../../typed/ClusterSingletonManagerSettings.html))Annotations@deprecated Deprecated*(Since version 2\.6\.11\)* Use constructor with leaseSettings
4. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings.html#<init>(numberOfShards:Int,role:Option[String],dataCenter:Option[akka.cluster.ClusterSettings.DataCenter],rememberEntities:Boolean,journalPluginId:String,snapshotPluginId:String,passivateIdleEntityAfter:scala.concurrent.duration.FiniteDuration,shardRegionQueryTimeout:scala.concurrent.duration.FiniteDuration,stateStoreMode:akka.cluster.sharding.typed.ClusterShardingSettings.StateStoreMode,rememberEntitiesStoreMode:akka.cluster.sharding.typed.ClusterShardingSettings.RememberEntitiesStoreMode,tuningParameters:akka.cluster.sharding.typed.ClusterShardingSettings.TuningParameters,coordinatorSingletonSettings:akka.cluster.typed.ClusterSingletonManagerSettings,leaseSettings:Option[akka.coordination.lease.LeaseUsageSettings]):akka.cluster.sharding.typed.ClusterShardingSettings "Permalink")  new ClusterShardingSettings(numberOfShards: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), role: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[String], dataCenter: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[DataCenter](../../ClusterSettings$.html#DataCenter=String)], rememberEntities: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), journalPluginId: String, snapshotPluginId: String, passivateIdleEntityAfter: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), shardRegionQueryTimeout: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), stateStoreMode: [StateStoreMode](ClusterShardingSettings$$StateStoreMode.html), rememberEntitiesStoreMode: [RememberEntitiesStoreMode](ClusterShardingSettings$$RememberEntitiesStoreMode.html), tuningParameters: [TuningParameters](ClusterShardingSettings$$TuningParameters.html), coordinatorSingletonSettings: [ClusterSingletonManagerSettings](../../typed/ClusterSingletonManagerSettings.html), leaseSettings: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[LeaseUsageSettings](../../../coordination/lease/LeaseUsageSettings.html)])Annotations@deprecated Deprecated*(Since version 2\.6\.18\)* Use constructor with passivationStrategySettings
5. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings.html#<init>(numberOfShards:Int,role:Option[String],dataCenter:Option[akka.cluster.ClusterSettings.DataCenter],rememberEntities:Boolean,journalPluginId:String,snapshotPluginId:String,passivationStrategySettings:akka.cluster.sharding.typed.ClusterShardingSettings.PassivationStrategySettings,shardRegionQueryTimeout:scala.concurrent.duration.FiniteDuration,stateStoreMode:akka.cluster.sharding.typed.ClusterShardingSettings.StateStoreMode,rememberEntitiesStoreMode:akka.cluster.sharding.typed.ClusterShardingSettings.RememberEntitiesStoreMode,tuningParameters:akka.cluster.sharding.typed.ClusterShardingSettings.TuningParameters,coordinatorSingletonSettings:akka.cluster.typed.ClusterSingletonManagerSettings,leaseSettings:Option[akka.coordination.lease.LeaseUsageSettings]):akka.cluster.sharding.typed.ClusterShardingSettings "Permalink")  new ClusterShardingSettings(numberOfShards: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), role: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[String], dataCenter: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[DataCenter](../../ClusterSettings$.html#DataCenter=String)], rememberEntities: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), journalPluginId: String, snapshotPluginId: String, passivationStrategySettings: [PassivationStrategySettings](ClusterShardingSettings$$PassivationStrategySettings.html), shardRegionQueryTimeout: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), stateStoreMode: [StateStoreMode](ClusterShardingSettings$$StateStoreMode.html), rememberEntitiesStoreMode: [RememberEntitiesStoreMode](ClusterShardingSettings$$RememberEntitiesStoreMode.html), tuningParameters: [TuningParameters](ClusterShardingSettings$$TuningParameters.html), coordinatorSingletonSettings: [ClusterSingletonManagerSettings](../../typed/ClusterSingletonManagerSettings.html), leaseSettings: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[LeaseUsageSettings](../../../coordination/lease/LeaseUsageSettings.html)])Annotations@deprecated Deprecated*(Since version 2\.6\.20\)* Use constructor with coordinatorSingletonOverrideRole
### Value Members

1. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from ClusterShardingSettings toany2stringadd\[ClusterShardingSettings] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (ClusterShardingSettings, B)ImplicitThis member is added by an implicit conversion from ClusterShardingSettings toArrowAssoc\[ClusterShardingSettings] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings.html#coordinatorSingletonOverrideRole:Boolean "Permalink")  val coordinatorSingletonOverrideRole: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)
9. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings.html#coordinatorSingletonSettings:akka.cluster.typed.ClusterSingletonManagerSettings "Permalink")  val coordinatorSingletonSettings: [ClusterSingletonManagerSettings](../../typed/ClusterSingletonManagerSettings.html)
10. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (ClusterShardingSettings) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ClusterShardingSettingsImplicitThis member is added by an implicit conversion from ClusterShardingSettings toEnsuring\[ClusterShardingSettings] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (ClusterShardingSettings) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ClusterShardingSettingsImplicitThis member is added by an implicit conversion from ClusterShardingSettings toEnsuring\[ClusterShardingSettings] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ClusterShardingSettingsImplicitThis member is added by an implicit conversion from ClusterShardingSettings toEnsuring\[ClusterShardingSettings] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ClusterShardingSettingsImplicitThis member is added by an implicit conversion from ClusterShardingSettings toEnsuring\[ClusterShardingSettings] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
14. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
15. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
16. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
18. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
19. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings.html#journalPluginId:String "Permalink")  val journalPluginId: String
20. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings.html#leaseSettings:Option[akka.coordination.lease.LeaseUsageSettings] "Permalink")  val leaseSettings: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[LeaseUsageSettings](../../../coordination/lease/LeaseUsageSettings.html)]
21. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
22. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
23. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
24. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings.html#numberOfShards:Int "Permalink")  val numberOfShards: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)
25. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings.html#passivationStrategySettings:akka.cluster.sharding.typed.ClusterShardingSettings.PassivationStrategySettings "Permalink")  val passivationStrategySettings: [PassivationStrategySettings](ClusterShardingSettings$$PassivationStrategySettings.html)
26. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings.html#rememberEntities:Boolean "Permalink")  val rememberEntities: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)
27. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings.html#rememberEntitiesStoreMode:akka.cluster.sharding.typed.ClusterShardingSettings.RememberEntitiesStoreMode "Permalink")  val rememberEntitiesStoreMode: [RememberEntitiesStoreMode](ClusterShardingSettings$$RememberEntitiesStoreMode.html)
28. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings.html#role:Option[String] "Permalink")  val role: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[String]
29. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings.html#shardRegionQueryTimeout:scala.concurrent.duration.FiniteDuration "Permalink")  val shardRegionQueryTimeout: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)
30. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings.html#snapshotPluginId:String "Permalink")  val snapshotPluginId: String
31. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings.html#stateStoreMode:akka.cluster.sharding.typed.ClusterShardingSettings.StateStoreMode "Permalink")  val stateStoreMode: [StateStoreMode](ClusterShardingSettings$$StateStoreMode.html)
32. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
33. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
34. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings.html#tuningParameters:akka.cluster.sharding.typed.ClusterShardingSettings.TuningParameters "Permalink")  val tuningParameters: [TuningParameters](ClusterShardingSettings$$TuningParameters.html)
35. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
36. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
37. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
38. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings.html#withCoordinatorSingletonSettings(coordinatorSingletonSettings:akka.cluster.typed.ClusterSingletonManagerSettings):akka.cluster.sharding.typed.ClusterShardingSettings "Permalink")  def withCoordinatorSingletonSettings(coordinatorSingletonSettings: [ClusterSingletonManagerSettings](../../typed/ClusterSingletonManagerSettings.html)): ClusterShardingSettingsThe `role` of the `ClusterSingletonManagerSettings` is not used.

The `role` of the `ClusterSingletonManagerSettings` is not used. The `role` of the
coordinator singleton will be the same as the `role` of `ClusterShardingSettings`.
39. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings.html#withJournalPluginId(journalPluginId:String):akka.cluster.sharding.typed.ClusterShardingSettings "Permalink")  def withJournalPluginId(journalPluginId: String): ClusterShardingSettings
40. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings.html#withLeaseSettings(leaseSettings:akka.coordination.lease.LeaseUsageSettings):akka.cluster.sharding.typed.ClusterShardingSettings "Permalink")  def withLeaseSettings(leaseSettings: [LeaseUsageSettings](../../../coordination/lease/LeaseUsageSettings.html)): ClusterShardingSettingsNote that if you define a custom lease name and have several sharding entity types each one must have a unique
lease name.

Note that if you define a custom lease name and have several sharding entity types each one must have a unique
lease name. If the lease name is undefined it will be derived from ActorSystem name and shard name,
but that may result in too long lease names.
41. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings.html#withNoPassivationStrategy():akka.cluster.sharding.typed.ClusterShardingSettings "Permalink")  def withNoPassivationStrategy(): ClusterShardingSettings
42. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings.html#withPassivationStrategy(settings:akka.cluster.sharding.typed.ClusterShardingSettings.PassivationStrategySettings):akka.cluster.sharding.typed.ClusterShardingSettings "Permalink")  def withPassivationStrategy(settings: [PassivationStrategySettings](ClusterShardingSettings$$PassivationStrategySettings.html)): ClusterShardingSettingsAPI MAY CHANGE: Settings for passivation strategies may change after additional testing and feedback.

API MAY CHANGE: Settings for passivation strategies may change after additional testing and feedback.

Annotations@[ApiMayChange](../../../annotation/ApiMayChange.html)()
43. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings.html#withRememberEntities(rememberEntities:Boolean):akka.cluster.sharding.typed.ClusterShardingSettings "Permalink")  def withRememberEntities(rememberEntities: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ClusterShardingSettings
44. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings.html#withRememberEntitiesStoreMode(rememberEntitiesStoreMode:akka.cluster.sharding.typed.ClusterShardingSettings.RememberEntitiesStoreMode):akka.cluster.sharding.typed.ClusterShardingSettings "Permalink")  def withRememberEntitiesStoreMode(rememberEntitiesStoreMode: [RememberEntitiesStoreMode](ClusterShardingSettings$$RememberEntitiesStoreMode.html)): ClusterShardingSettings
45. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings.html#withRole(role:String):akka.cluster.sharding.typed.ClusterShardingSettings "Permalink")  def withRole(role: String): ClusterShardingSettings
46. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings.html#withShardRegionQueryTimeout(duration:java.time.Duration):akka.cluster.sharding.typed.ClusterShardingSettings "Permalink")  def withShardRegionQueryTimeout(duration: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration)): ClusterShardingSettings
47. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings.html#withShardRegionQueryTimeout(duration:scala.concurrent.duration.FiniteDuration):akka.cluster.sharding.typed.ClusterShardingSettings "Permalink")  def withShardRegionQueryTimeout(duration: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)): ClusterShardingSettings
48. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings.html#withSnapshotPluginId(snapshotPluginId:String):akka.cluster.sharding.typed.ClusterShardingSettings "Permalink")  def withSnapshotPluginId(snapshotPluginId: String): ClusterShardingSettings
49. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings.html#withStateStoreMode(stateStoreMode:akka.cluster.sharding.typed.ClusterShardingSettings.StateStoreMode):akka.cluster.sharding.typed.ClusterShardingSettings "Permalink")  def withStateStoreMode(stateStoreMode: [StateStoreMode](ClusterShardingSettings$$StateStoreMode.html)): ClusterShardingSettings
50. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings.html#withTuningParameters(tuningParameters:akka.cluster.sharding.typed.ClusterShardingSettings.TuningParameters):akka.cluster.sharding.typed.ClusterShardingSettings "Permalink")  def withTuningParameters(tuningParameters: [TuningParameters](ClusterShardingSettings$$TuningParameters.html)): ClusterShardingSettings
### Deprecated Value Members

1. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings.html#dataCenter:Option[akka.cluster.ClusterSettings.DataCenter] "Permalink")  val dataCenter: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[DataCenter](../../ClusterSettings$.html#DataCenter=String)]Annotations@deprecated Deprecated*(Since version 2\.10\.0\)* Use Akka Distributed Cluster instead
2. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
3. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from ClusterShardingSettings toStringFormat\[ClusterShardingSettings] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
4. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings.html#passivateIdleEntityAfter:scala.concurrent.duration.FiniteDuration "Permalink")  def passivateIdleEntityAfter: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)Annotations@deprecated Deprecated*(Since version 2\.6\.18\)* See passivationStrategySettings.idleEntitySettings instead
5. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings.html#withDataCenter(dataCenter:akka.cluster.ClusterSettings.DataCenter):akka.cluster.sharding.typed.ClusterShardingSettings "Permalink")  def withDataCenter(dataCenter: [DataCenter](../../ClusterSettings$.html#DataCenter=String)): ClusterShardingSettingsAnnotations@deprecated Deprecated*(Since version 2\.10\.0\)* Use Akka Distributed Cluster instead
6. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings.html#withPassivateIdleEntityAfter(duration:java.time.Duration):akka.cluster.sharding.typed.ClusterShardingSettings "Permalink")  def withPassivateIdleEntityAfter(duration: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration)): ClusterShardingSettingsAnnotations@deprecated Deprecated*(Since version 2\.6\.18\)* Use withPassivationStrategy instead
7. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings.html#withPassivateIdleEntityAfter(duration:scala.concurrent.duration.FiniteDuration):akka.cluster.sharding.typed.ClusterShardingSettings "Permalink")  def withPassivateIdleEntityAfter(duration: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)): ClusterShardingSettingsAnnotations@deprecated Deprecated*(Since version 2\.6\.18\)* Use withPassivationStrategy instead
8. [**](../../../../akka/cluster/sharding/typed/ClusterShardingSettings.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (ClusterShardingSettings, B)ImplicitThis member is added by an implicit conversion from ClusterShardingSettings toArrowAssoc\[ClusterShardingSettings] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromClusterShardingSettings to any2stringadd\[ClusterShardingSettings]

### Inherited by implicit conversion StringFormat fromClusterShardingSettings to StringFormat\[ClusterShardingSettings]

### Inherited by implicit conversion Ensuring fromClusterShardingSettings to Ensuring\[ClusterShardingSettings]

### Inherited by implicit conversion ArrowAssoc fromClusterShardingSettings to ArrowAssoc\[ClusterShardingSettings]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/annotation/ApiMayChange.html
- https://doc.akka.io/api/akka/current/akka/cluster/ClusterSettings$.html
- https://doc.akka.io/api/akka/current/akka/cluster/index.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/index.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/typed/ChangeNumberOfProcesses$.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/typed/ChangeNumberOfProcesses.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/typed/ClusterShardingQuery.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/typed/ClusterShardingSettings$$PassivationStrategySettings.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/typed/ClusterShardingSettings$$RememberEntitiesStoreMode.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/typed/ClusterShardingSettings$$StateStoreMode.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/typed/ClusterShardingSettings$$TuningParameters.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/typed/ClusterShardingSettings$.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/typed/ClusterShardingSettings.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/typed/GetClusterShardingStats.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/typed/GetNumberOfProcesses$.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/typed/GetNumberOfProcesses.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/typed/GetShardRegionState.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/typed/HashCodeMessageExtractor.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/typed/HashCodeNoEnvelopeMessageExtractor.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/typed/Murmur2MessageExtractor.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/typed/Murmur2NoEnvelopeMessageExtractor.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/typed/NumberOfProcesses.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/typed/ReplicatedEntity$.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/typed/ReplicatedEntity.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/typed/ReplicatedEntityProvider$.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/typed/ReplicatedEntityProvider.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/typed/ReplicatedSharding.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/typed/ReplicatedShardingExtension$.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/typed/ReplicatedShardingExtension.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/typed/ShardedDaemonProcessCommand.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/typed/ShardedDaemonProcessContext.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/typed/ShardedDaemonProcessSettings$.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/typed/ShardedDaemonProcessSettings.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/typed/ShardingEnvelope.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/typed/ShardingMessageExtractor$.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/typed/ShardingMessageExtractor.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/typed/SliceRangeShardAllocationStrategy$.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/typed/SliceRangeShardAllocationStrategy.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/typed/delivery/index.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/typed/index.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/typed/internal/index.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/typed/javadsl/index.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/typed/scaladsl/index.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/typed/testkit/index.html
- https://doc.akka.io/api/akka/current/akka/cluster/typed/ClusterSingletonManagerSettings.html
- https://doc.akka.io/api/akka/current/akka/coordination/lease/LeaseUsageSettings.html
- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/cluster/sharding/typed/ClusterShardingSettings.html](https://doc.akka.io/api/akka/current/akka/cluster/sharding/typed/ClusterShardingSettings.html)*