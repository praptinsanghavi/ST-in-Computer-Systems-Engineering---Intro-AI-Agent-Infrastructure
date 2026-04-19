---
description: Akka 2.10.17 - akka.cluster.sharding.ClusterShardingSettings
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:23:20Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/cluster/sharding/ClusterShardingSettings.html
title: Akka 2.10.17 - akka.cluster.sharding.ClusterShardingSettings
---

# Akka 2.10.17 - akka.cluster.sharding.ClusterShardingSettings

> **Summary:** Akka 2.10.17 - akka.cluster.sharding.ClusterShardingSettings

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/cluster/index.html "Permalink")  package [cluster](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/cluster/sharding/index.html "Permalink")  package [sharding](index.html)Definition Classes[cluster](../index.html)
- [**](../../../akka/cluster/sharding/external/index.html "Permalink")  package [external](external/index.html)Definition Classes[sharding](index.html)
- [**](../../../akka/cluster/sharding/internal/index.html "Permalink")  package [internal](internal/index.html)Definition Classes[sharding](index.html)
- [**](../../../akka/cluster/sharding/protobuf/index.html "Permalink")  package [protobuf](protobuf/index.html)Definition Classes[sharding](index.html)
- [**](../../../akka/cluster/sharding/typed/index.html "Permalink")  package [typed](typed/index.html)Definition Classes[sharding](index.html)
- [ClusterSharding](ClusterSharding.html)
- [ClusterShardingHealthCheck](ClusterShardingHealthCheck.html "INTERNAL API (ctr)")
- [ClusterShardingHealthCheckSettings](ClusterShardingHealthCheckSettings.html)
- [ClusterShardingSerializable](ClusterShardingSerializable.html "Marker trait for remote messages and persistent events/snapshots with special serializer.")
- ClusterShardingSettings
- [ConsistentHashingShardAllocationStrategy](ConsistentHashingShardAllocationStrategy.html "akka.cluster.sharding.ShardCoordinator.ShardAllocationStrategy that is using consistent hashing.")
- [JoinConfigCompatCheckSharding](JoinConfigCompatCheckSharding.html "INTERNAL API")
- [PersistentShardCoordinator](PersistentShardCoordinator.html "Singleton coordinator that decides where to allocate shards.")
- [RemoveInternalClusterShardingData](RemoveInternalClusterShardingData.html)
- [ShardCoordinator](ShardCoordinator.html "Singleton coordinator that decides where to allocate shards.")
- [ShardRegion](ShardRegion$.html)
- [ShardingLogMarker](ShardingLogMarker$.html "This is public with the purpose to document the used markers and properties of log events.")
[c](ClusterShardingSettings$.html "See companion object")[akka](../../index.html).[cluster](../index.html).[sharding](index.html)

# [ClusterShardingSettings](ClusterShardingSettings$.html "See companion object")[**](../../../akka/cluster/sharding/ClusterShardingSettings.html "Permalink")

### Companion [object ClusterShardingSettings](ClusterShardingSettings$.html "See companion object")

#### final  class ClusterShardingSettings extends [NoSerializationVerificationNeeded](../../actor/NoSerializationVerificationNeeded.html)

Source[ClusterShardingSettings.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-sharding/src/main/scala/akka/cluster/sharding/ClusterShardingSettings.scala#L1180)Linear Supertypes[NoSerializationVerificationNeeded](../../actor/NoSerializationVerificationNeeded.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ClusterShardingSettings
2. NoSerializationVerificationNeeded
3. AnyRef
4. Any
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

1. [**](../../../akka/cluster/sharding/ClusterShardingSettings.html#<init>(role:Option[String],rememberEntities:Boolean,journalPluginId:String,snapshotPluginId:String,stateStoreMode:String,rememberEntitiesStore:String,passivationStrategySettings:akka.cluster.sharding.ClusterShardingSettings.PassivationStrategySettings,shardRegionQueryTimeout:scala.concurrent.duration.FiniteDuration,tuningParameters:akka.cluster.sharding.ClusterShardingSettings.TuningParameters,coordinatorSingletonOverrideRole:Boolean,coordinatorSingletonSettings:akka.cluster.singleton.ClusterSingletonManagerSettings,leaseSettings:Option[akka.coordination.lease.LeaseUsageSettings]):akka.cluster.sharding.ClusterShardingSettings "Permalink")  new ClusterShardingSettings(role: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[String], rememberEntities: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), journalPluginId: String, snapshotPluginId: String, stateStoreMode: String, rememberEntitiesStore: String, passivationStrategySettings: [PassivationStrategySettings](ClusterShardingSettings$$PassivationStrategySettings.html), shardRegionQueryTimeout: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), tuningParameters: [TuningParameters](ClusterShardingSettings$$TuningParameters.html), coordinatorSingletonOverrideRole: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), coordinatorSingletonSettings: [ClusterSingletonManagerSettings](../singleton/ClusterSingletonManagerSettings.html), leaseSettings: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[LeaseUsageSettings](../../coordination/lease/LeaseUsageSettings.html)])rolespecifies that this entity type requires cluster nodes with a specific role.
 If the role is not specified all nodes in the cluster are used.

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

shardRegionQueryTimeoutthe timeout for querying a shard region, see descriptions in reference.conf

tuningParametersadditional tuning parameters, see descriptions in reference.conf

leaseSettingsLeaseSettings for acquiring before creating the shard.
 Note that if you define a custom lease name and have several sharding entity types each one must have a unique
 lease name. If the lease name is undefined it will be derived from ActorSystem name and shard name,
 but that may result in too long lease names.
2. [**](../../../akka/cluster/sharding/ClusterShardingSettings.html#<init>(role:Option[String],rememberEntities:Boolean,journalPluginId:String,snapshotPluginId:String,stateStoreMode:String,passivateIdleEntityAfter:scala.concurrent.duration.FiniteDuration,tuningParameters:akka.cluster.sharding.ClusterShardingSettings.TuningParameters,coordinatorSingletonSettings:akka.cluster.singleton.ClusterSingletonManagerSettings,leaseSettings:Option[akka.coordination.lease.LeaseUsageSettings]):akka.cluster.sharding.ClusterShardingSettings "Permalink")  new ClusterShardingSettings(role: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[String], rememberEntities: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), journalPluginId: String, snapshotPluginId: String, stateStoreMode: String, passivateIdleEntityAfter: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), tuningParameters: [TuningParameters](ClusterShardingSettings$$TuningParameters.html), coordinatorSingletonSettings: [ClusterSingletonManagerSettings](../singleton/ClusterSingletonManagerSettings.html), leaseSettings: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[LeaseUsageSettings](../../coordination/lease/LeaseUsageSettings.html)])Annotations@deprecated Deprecated*(Since version 2\.6\.0\)* Use the ClusterShardingSettings factory methods or the constructor including shardRegionQueryTimeout instead
3. [**](../../../akka/cluster/sharding/ClusterShardingSettings.html#<init>(role:Option[String],rememberEntities:Boolean,journalPluginId:String,snapshotPluginId:String,stateStoreMode:String,passivateIdleEntityAfter:scala.concurrent.duration.FiniteDuration,shardRegionQueryTimeout:scala.concurrent.duration.FiniteDuration,tuningParameters:akka.cluster.sharding.ClusterShardingSettings.TuningParameters,coordinatorSingletonSettings:akka.cluster.singleton.ClusterSingletonManagerSettings,leaseSettings:Option[akka.coordination.lease.LeaseUsageSettings]):akka.cluster.sharding.ClusterShardingSettings "Permalink")  new ClusterShardingSettings(role: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[String], rememberEntities: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), journalPluginId: String, snapshotPluginId: String, stateStoreMode: String, passivateIdleEntityAfter: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), shardRegionQueryTimeout: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), tuningParameters: [TuningParameters](ClusterShardingSettings$$TuningParameters.html), coordinatorSingletonSettings: [ClusterSingletonManagerSettings](../singleton/ClusterSingletonManagerSettings.html), leaseSettings: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[LeaseUsageSettings](../../coordination/lease/LeaseUsageSettings.html)])Annotations@deprecated Deprecated*(Since version 2\.6\.7\)* Use the ClusterShardingSettings factory methods or the constructor including rememberedEntitiesStore instead
4. [**](../../../akka/cluster/sharding/ClusterShardingSettings.html#<init>(role:Option[String],rememberEntities:Boolean,journalPluginId:String,snapshotPluginId:String,stateStoreMode:String,rememberEntitiesStore:String,passivateIdleEntityAfter:scala.concurrent.duration.FiniteDuration,shardRegionQueryTimeout:scala.concurrent.duration.FiniteDuration,tuningParameters:akka.cluster.sharding.ClusterShardingSettings.TuningParameters,coordinatorSingletonSettings:akka.cluster.singleton.ClusterSingletonManagerSettings,leaseSettings:Option[akka.coordination.lease.LeaseUsageSettings]):akka.cluster.sharding.ClusterShardingSettings "Permalink")  new ClusterShardingSettings(role: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[String], rememberEntities: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), journalPluginId: String, snapshotPluginId: String, stateStoreMode: String, rememberEntitiesStore: String, passivateIdleEntityAfter: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), shardRegionQueryTimeout: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), tuningParameters: [TuningParameters](ClusterShardingSettings$$TuningParameters.html), coordinatorSingletonSettings: [ClusterSingletonManagerSettings](../singleton/ClusterSingletonManagerSettings.html), leaseSettings: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[LeaseUsageSettings](../../coordination/lease/LeaseUsageSettings.html)])Annotations@deprecated Deprecated*(Since version 2\.6\.18\)* Use the ClusterShardingSettings factory methods or the constructor including passivationStrategySettings instead
5. [**](../../../akka/cluster/sharding/ClusterShardingSettings.html#<init>(role:Option[String],rememberEntities:Boolean,journalPluginId:String,snapshotPluginId:String,stateStoreMode:String,rememberEntitiesStore:String,passivationStrategySettings:akka.cluster.sharding.ClusterShardingSettings.PassivationStrategySettings,shardRegionQueryTimeout:scala.concurrent.duration.FiniteDuration,tuningParameters:akka.cluster.sharding.ClusterShardingSettings.TuningParameters,coordinatorSingletonSettings:akka.cluster.singleton.ClusterSingletonManagerSettings,leaseSettings:Option[akka.coordination.lease.LeaseUsageSettings]):akka.cluster.sharding.ClusterShardingSettings "Permalink")  new ClusterShardingSettings(role: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[String], rememberEntities: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), journalPluginId: String, snapshotPluginId: String, stateStoreMode: String, rememberEntitiesStore: String, passivationStrategySettings: [PassivationStrategySettings](ClusterShardingSettings$$PassivationStrategySettings.html), shardRegionQueryTimeout: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), tuningParameters: [TuningParameters](ClusterShardingSettings$$TuningParameters.html), coordinatorSingletonSettings: [ClusterSingletonManagerSettings](../singleton/ClusterSingletonManagerSettings.html), leaseSettings: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[LeaseUsageSettings](../../coordination/lease/LeaseUsageSettings.html)])Annotations@deprecated Deprecated*(Since version 2\.6\.20\)* Use the ClusterShardingSettings factory methods or the constructor including coordinatorSingletonOverrideRole instead
### Value Members

1. [**](../../../akka/cluster/sharding/ClusterShardingSettings.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/cluster/sharding/ClusterShardingSettings.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/cluster/sharding/ClusterShardingSettings.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from ClusterShardingSettings toany2stringadd\[ClusterShardingSettings] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/cluster/sharding/ClusterShardingSettings.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (ClusterShardingSettings, B)ImplicitThis member is added by an implicit conversion from ClusterShardingSettings toArrowAssoc\[ClusterShardingSettings] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/cluster/sharding/ClusterShardingSettings.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/cluster/sharding/ClusterShardingSettings.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../akka/cluster/sharding/ClusterShardingSettings.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../akka/cluster/sharding/ClusterShardingSettings.html#coordinatorSingletonOverrideRole:Boolean "Permalink")  val coordinatorSingletonOverrideRole: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)
9. [**](../../../akka/cluster/sharding/ClusterShardingSettings.html#coordinatorSingletonSettings:akka.cluster.singleton.ClusterSingletonManagerSettings "Permalink")  val coordinatorSingletonSettings: [ClusterSingletonManagerSettings](../singleton/ClusterSingletonManagerSettings.html)
10. [**](../../../akka/cluster/sharding/ClusterShardingSettings.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (ClusterShardingSettings) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ClusterShardingSettingsImplicitThis member is added by an implicit conversion from ClusterShardingSettings toEnsuring\[ClusterShardingSettings] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../akka/cluster/sharding/ClusterShardingSettings.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (ClusterShardingSettings) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ClusterShardingSettingsImplicitThis member is added by an implicit conversion from ClusterShardingSettings toEnsuring\[ClusterShardingSettings] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../akka/cluster/sharding/ClusterShardingSettings.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ClusterShardingSettingsImplicitThis member is added by an implicit conversion from ClusterShardingSettings toEnsuring\[ClusterShardingSettings] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../../akka/cluster/sharding/ClusterShardingSettings.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ClusterShardingSettingsImplicitThis member is added by an implicit conversion from ClusterShardingSettings toEnsuring\[ClusterShardingSettings] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
14. [**](../../../akka/cluster/sharding/ClusterShardingSettings.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
15. [**](../../../akka/cluster/sharding/ClusterShardingSettings.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
16. [**](../../../akka/cluster/sharding/ClusterShardingSettings.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../../akka/cluster/sharding/ClusterShardingSettings.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
18. [**](../../../akka/cluster/sharding/ClusterShardingSettings.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
19. [**](../../../akka/cluster/sharding/ClusterShardingSettings.html#journalPluginId:String "Permalink")  val journalPluginId: String
20. [**](../../../akka/cluster/sharding/ClusterShardingSettings.html#leaseSettings:Option[akka.coordination.lease.LeaseUsageSettings] "Permalink")  val leaseSettings: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[LeaseUsageSettings](../../coordination/lease/LeaseUsageSettings.html)]
21. [**](../../../akka/cluster/sharding/ClusterShardingSettings.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
22. [**](../../../akka/cluster/sharding/ClusterShardingSettings.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
23. [**](../../../akka/cluster/sharding/ClusterShardingSettings.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
24. [**](../../../akka/cluster/sharding/ClusterShardingSettings.html#passivationStrategySettings:akka.cluster.sharding.ClusterShardingSettings.PassivationStrategySettings "Permalink")  val passivationStrategySettings: [PassivationStrategySettings](ClusterShardingSettings$$PassivationStrategySettings.html)
25. [**](../../../akka/cluster/sharding/ClusterShardingSettings.html#rememberEntities:Boolean "Permalink")  val rememberEntities: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)
26. [**](../../../akka/cluster/sharding/ClusterShardingSettings.html#rememberEntitiesStore:String "Permalink")  val rememberEntitiesStore: String
27. [**](../../../akka/cluster/sharding/ClusterShardingSettings.html#role:Option[String] "Permalink")  val role: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[String]
28. [**](../../../akka/cluster/sharding/ClusterShardingSettings.html#shardRegionQueryTimeout:scala.concurrent.duration.FiniteDuration "Permalink")  val shardRegionQueryTimeout: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)
29. [**](../../../akka/cluster/sharding/ClusterShardingSettings.html#snapshotPluginId:String "Permalink")  val snapshotPluginId: String
30. [**](../../../akka/cluster/sharding/ClusterShardingSettings.html#stateStoreMode:String "Permalink")  val stateStoreMode: String
31. [**](../../../akka/cluster/sharding/ClusterShardingSettings.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
32. [**](../../../akka/cluster/sharding/ClusterShardingSettings.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
33. [**](../../../akka/cluster/sharding/ClusterShardingSettings.html#tuningParameters:akka.cluster.sharding.ClusterShardingSettings.TuningParameters "Permalink")  val tuningParameters: [TuningParameters](ClusterShardingSettings$$TuningParameters.html)
34. [**](../../../akka/cluster/sharding/ClusterShardingSettings.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
35. [**](../../../akka/cluster/sharding/ClusterShardingSettings.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
36. [**](../../../akka/cluster/sharding/ClusterShardingSettings.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
37. [**](../../../akka/cluster/sharding/ClusterShardingSettings.html#withCoordinatorSingletonSettings(coordinatorSingletonSettings:akka.cluster.singleton.ClusterSingletonManagerSettings):akka.cluster.sharding.ClusterShardingSettings "Permalink")  def withCoordinatorSingletonSettings(coordinatorSingletonSettings: [ClusterSingletonManagerSettings](../singleton/ClusterSingletonManagerSettings.html)): ClusterShardingSettingsThe `role` of the `ClusterSingletonManagerSettings` is not used.

The `role` of the `ClusterSingletonManagerSettings` is not used. The `role` of the
coordinator singleton will be the same as the `role` of `ClusterShardingSettings`.
38. [**](../../../akka/cluster/sharding/ClusterShardingSettings.html#withJournalPluginId(journalPluginId:String):akka.cluster.sharding.ClusterShardingSettings "Permalink")  def withJournalPluginId(journalPluginId: String): ClusterShardingSettings
39. [**](../../../akka/cluster/sharding/ClusterShardingSettings.html#withLeaseSettings(leaseSettings:akka.coordination.lease.LeaseUsageSettings):akka.cluster.sharding.ClusterShardingSettings "Permalink")  def withLeaseSettings(leaseSettings: [LeaseUsageSettings](../../coordination/lease/LeaseUsageSettings.html)): ClusterShardingSettingsNote that if you define a custom lease name and have several sharding entity types each one must have a unique
lease name.

Note that if you define a custom lease name and have several sharding entity types each one must have a unique
lease name. If the lease name is undefined it will be derived from ActorSystem name and shard name,
but that may result in too long lease names.
40. [**](../../../akka/cluster/sharding/ClusterShardingSettings.html#withNoPassivationStrategy():akka.cluster.sharding.ClusterShardingSettings "Permalink")  def withNoPassivationStrategy(): ClusterShardingSettings
41. [**](../../../akka/cluster/sharding/ClusterShardingSettings.html#withPassivationStrategy(settings:akka.cluster.sharding.ClusterShardingSettings.PassivationStrategySettings):akka.cluster.sharding.ClusterShardingSettings "Permalink")  def withPassivationStrategy(settings: [PassivationStrategySettings](ClusterShardingSettings$$PassivationStrategySettings.html)): ClusterShardingSettingsAPI MAY CHANGE: Settings for passivation strategies may change after additional testing and feedback.

API MAY CHANGE: Settings for passivation strategies may change after additional testing and feedback.

Annotations@[ApiMayChange](../../annotation/ApiMayChange.html)()
42. [**](../../../akka/cluster/sharding/ClusterShardingSettings.html#withRememberEntities(rememberEntities:Boolean):akka.cluster.sharding.ClusterShardingSettings "Permalink")  def withRememberEntities(rememberEntities: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ClusterShardingSettings
43. [**](../../../akka/cluster/sharding/ClusterShardingSettings.html#withRole(role:Option[String]):akka.cluster.sharding.ClusterShardingSettings "Permalink")  def withRole(role: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[String]): ClusterShardingSettings
44. [**](../../../akka/cluster/sharding/ClusterShardingSettings.html#withRole(role:String):akka.cluster.sharding.ClusterShardingSettings "Permalink")  def withRole(role: String): ClusterShardingSettings
45. [**](../../../akka/cluster/sharding/ClusterShardingSettings.html#withShardRegionQueryTimeout(duration:java.time.Duration):akka.cluster.sharding.ClusterShardingSettings "Permalink")  def withShardRegionQueryTimeout(duration: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration)): ClusterShardingSettings
46. [**](../../../akka/cluster/sharding/ClusterShardingSettings.html#withShardRegionQueryTimeout(duration:scala.concurrent.duration.FiniteDuration):akka.cluster.sharding.ClusterShardingSettings "Permalink")  def withShardRegionQueryTimeout(duration: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)): ClusterShardingSettings
47. [**](../../../akka/cluster/sharding/ClusterShardingSettings.html#withSnapshotPluginId(snapshotPluginId:String):akka.cluster.sharding.ClusterShardingSettings "Permalink")  def withSnapshotPluginId(snapshotPluginId: String): ClusterShardingSettings
48. [**](../../../akka/cluster/sharding/ClusterShardingSettings.html#withStateStoreMode(stateStoreMode:String):akka.cluster.sharding.ClusterShardingSettings "Permalink")  def withStateStoreMode(stateStoreMode: String): ClusterShardingSettings
49. [**](../../../akka/cluster/sharding/ClusterShardingSettings.html#withTuningParameters(tuningParameters:akka.cluster.sharding.ClusterShardingSettings.TuningParameters):akka.cluster.sharding.ClusterShardingSettings "Permalink")  def withTuningParameters(tuningParameters: [TuningParameters](ClusterShardingSettings$$TuningParameters.html)): ClusterShardingSettings
### Deprecated Value Members

1. [**](../../../akka/cluster/sharding/ClusterShardingSettings.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../akka/cluster/sharding/ClusterShardingSettings.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from ClusterShardingSettings toStringFormat\[ClusterShardingSettings] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/cluster/sharding/ClusterShardingSettings.html#passivateIdleEntityAfter:scala.concurrent.duration.FiniteDuration "Permalink")  def passivateIdleEntityAfter: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)Annotations@deprecated Deprecated*(Since version 2\.6\.18\)* See passivationStrategySettings.idleEntitySettings instead
4. [**](../../../akka/cluster/sharding/ClusterShardingSettings.html#withPassivateIdleAfter(duration:java.time.Duration):akka.cluster.sharding.ClusterShardingSettings "Permalink")  def withPassivateIdleAfter(duration: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration)): ClusterShardingSettingsAnnotations@deprecated Deprecated*(Since version 2\.6\.18\)* Use withPassivationStrategy instead
5. [**](../../../akka/cluster/sharding/ClusterShardingSettings.html#withPassivateIdleAfter(duration:scala.concurrent.duration.FiniteDuration):akka.cluster.sharding.ClusterShardingSettings "Permalink")  def withPassivateIdleAfter(duration: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)): ClusterShardingSettingsAnnotations@deprecated Deprecated*(Since version 2\.6\.18\)* Use withPassivationStrategy instead
6. [**](../../../akka/cluster/sharding/ClusterShardingSettings.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (ClusterShardingSettings, B)ImplicitThis member is added by an implicit conversion from ClusterShardingSettings toArrowAssoc\[ClusterShardingSettings] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [NoSerializationVerificationNeeded](../../actor/NoSerializationVerificationNeeded.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromClusterShardingSettings to any2stringadd\[ClusterShardingSettings]

### Inherited by implicit conversion StringFormat fromClusterShardingSettings to StringFormat\[ClusterShardingSettings]

### Inherited by implicit conversion Ensuring fromClusterShardingSettings to Ensuring\[ClusterShardingSettings]

### Inherited by implicit conversion ArrowAssoc fromClusterShardingSettings to ArrowAssoc\[ClusterShardingSettings]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/actor/NoSerializationVerificationNeeded.html
- https://doc.akka.io/api/akka-core/2.10/akka/annotation/ApiMayChange.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/ClusterSharding$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/ClusterSharding.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/ClusterShardingHealthCheck.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/ClusterShardingHealthCheckSettings.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/ClusterShardingSerializable.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/ClusterShardingSettings$$PassivationStrategySettings.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/ClusterShardingSettings$$TuningParameters.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/ClusterShardingSettings$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/ClusterShardingSettings.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/ConsistentHashingShardAllocationStrategy$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/ConsistentHashingShardAllocationStrategy.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/JoinConfigCompatCheckSharding.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/PersistentShardCoordinator.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/RemoveInternalClusterShardingData$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/RemoveInternalClusterShardingData.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/ShardCoordinator$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/ShardCoordinator.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/ShardRegion$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/ShardingLogMarker$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/external/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/internal/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/protobuf/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/typed/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/singleton/ClusterSingletonManagerSettings.html
- https://doc.akka.io/api/akka-core/2.10/akka/coordination/lease/LeaseUsageSettings.html
- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/ClusterShardingSettings.html](https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/ClusterShardingSettings.html)*