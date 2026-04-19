---
description: Akka 2.10.17 - akka.cluster.sharding.typed.ShardedDaemonProcessSettings
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:39:13Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/cluster/sharding/typed/ShardedDaemonProcessSettings.html
title: Akka 2.10.17 - akka.cluster.sharding.typed.ShardedDaemonProcessSettings
---

# Akka 2.10.17 - akka.cluster.sharding.typed.ShardedDaemonProcessSettings

> **Summary:** Akka 2.10.17 - akka.cluster.sharding.typed.ShardedDaemonProcessSettings

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
- ShardedDaemonProcessSettings
- [ShardingEnvelope](ShardingEnvelope.html "Default envelope type that may be used with Cluster Sharding.")
- [ShardingMessageExtractor](ShardingMessageExtractor.html "Entirely customizable typed message extractor.")
- [SliceRangeShardAllocationStrategy](SliceRangeShardAllocationStrategy.html "Intended to be used with database sharding, https://doc.akka.io/libraries/akka-persistence-r2dbc/current/data-partition.html, with a cluster of many Akka nodes.")
[c](ShardedDaemonProcessSettings$.html "See companion object")[akka](../../../index.html).[cluster](../../index.html).[sharding](../index.html).[typed](index.html)

# [ShardedDaemonProcessSettings](ShardedDaemonProcessSettings$.html "See companion object")[**](../../../../akka/cluster/sharding/typed/ShardedDaemonProcessSettings.html "Permalink")

### Companion [object ShardedDaemonProcessSettings](ShardedDaemonProcessSettings$.html "See companion object")

#### final  class ShardedDaemonProcessSettings extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

Not for user constructions, use factory methods to instantiate.

Source[ShardedDaemonProcessSettings.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-sharding-typed/src/main/scala/akka/cluster/sharding/typed/ShardedDaemonProcessSettings.scala#L50)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ShardedDaemonProcessSettings
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
### Value Members

1. [**](../../../../akka/cluster/sharding/typed/ShardedDaemonProcessSettings.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/cluster/sharding/typed/ShardedDaemonProcessSettings.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/cluster/sharding/typed/ShardedDaemonProcessSettings.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from ShardedDaemonProcessSettings toany2stringadd\[ShardedDaemonProcessSettings] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../akka/cluster/sharding/typed/ShardedDaemonProcessSettings.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (ShardedDaemonProcessSettings, B)ImplicitThis member is added by an implicit conversion from ShardedDaemonProcessSettings toArrowAssoc\[ShardedDaemonProcessSettings] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../akka/cluster/sharding/typed/ShardedDaemonProcessSettings.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../akka/cluster/sharding/typed/ShardedDaemonProcessSettings.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../akka/cluster/sharding/typed/ShardedDaemonProcessSettings.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../../akka/cluster/sharding/typed/ShardedDaemonProcessSettings.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (ShardedDaemonProcessSettings) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ShardedDaemonProcessSettingsImplicitThis member is added by an implicit conversion from ShardedDaemonProcessSettings toEnsuring\[ShardedDaemonProcessSettings] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../../akka/cluster/sharding/typed/ShardedDaemonProcessSettings.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (ShardedDaemonProcessSettings) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ShardedDaemonProcessSettingsImplicitThis member is added by an implicit conversion from ShardedDaemonProcessSettings toEnsuring\[ShardedDaemonProcessSettings] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../akka/cluster/sharding/typed/ShardedDaemonProcessSettings.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ShardedDaemonProcessSettingsImplicitThis member is added by an implicit conversion from ShardedDaemonProcessSettings toEnsuring\[ShardedDaemonProcessSettings] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../akka/cluster/sharding/typed/ShardedDaemonProcessSettings.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ShardedDaemonProcessSettingsImplicitThis member is added by an implicit conversion from ShardedDaemonProcessSettings toEnsuring\[ShardedDaemonProcessSettings] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../akka/cluster/sharding/typed/ShardedDaemonProcessSettings.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../../akka/cluster/sharding/typed/ShardedDaemonProcessSettings.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../../../akka/cluster/sharding/typed/ShardedDaemonProcessSettings.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../../akka/cluster/sharding/typed/ShardedDaemonProcessSettings.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../../akka/cluster/sharding/typed/ShardedDaemonProcessSettings.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../../../akka/cluster/sharding/typed/ShardedDaemonProcessSettings.html#keepAliveFromNumberOfNodes:Int "Permalink")  val keepAliveFromNumberOfNodes: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)
18. [**](../../../../akka/cluster/sharding/typed/ShardedDaemonProcessSettings.html#keepAliveInterval:scala.concurrent.duration.FiniteDuration "Permalink")  val keepAliveInterval: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)
19. [**](../../../../akka/cluster/sharding/typed/ShardedDaemonProcessSettings.html#keepAliveThrottleInterval:scala.concurrent.duration.FiniteDuration "Permalink")  val keepAliveThrottleInterval: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)
20. [**](../../../../akka/cluster/sharding/typed/ShardedDaemonProcessSettings.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
21. [**](../../../../akka/cluster/sharding/typed/ShardedDaemonProcessSettings.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
22. [**](../../../../akka/cluster/sharding/typed/ShardedDaemonProcessSettings.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
23. [**](../../../../akka/cluster/sharding/typed/ShardedDaemonProcessSettings.html#role:Option[String] "Permalink")  val role: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[String]
24. [**](../../../../akka/cluster/sharding/typed/ShardedDaemonProcessSettings.html#shardingSettings:Option[akka.cluster.sharding.typed.ClusterShardingSettings] "Permalink")  val shardingSettings: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[ClusterShardingSettings](ClusterShardingSettings.html)]
25. [**](../../../../akka/cluster/sharding/typed/ShardedDaemonProcessSettings.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
26. [**](../../../../akka/cluster/sharding/typed/ShardedDaemonProcessSettings.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
27. [**](../../../../akka/cluster/sharding/typed/ShardedDaemonProcessSettings.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
28. [**](../../../../akka/cluster/sharding/typed/ShardedDaemonProcessSettings.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
29. [**](../../../../akka/cluster/sharding/typed/ShardedDaemonProcessSettings.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
30. [**](../../../../akka/cluster/sharding/typed/ShardedDaemonProcessSettings.html#withKeepAliveFromNumberOfNodes(keepAliveFromNumberOfNodes:Int):akka.cluster.sharding.typed.ShardedDaemonProcessSettings "Permalink")  def withKeepAliveFromNumberOfNodes(keepAliveFromNumberOfNodes: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): ShardedDaemonProcessSettingsKeep alive messages from this number of nodes.
31. [**](../../../../akka/cluster/sharding/typed/ShardedDaemonProcessSettings.html#withKeepAliveInterval(keepAliveInterval:java.time.Duration):akka.cluster.sharding.typed.ShardedDaemonProcessSettings "Permalink")  def withKeepAliveInterval(keepAliveInterval: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration)): ShardedDaemonProcessSettingsJava API: The interval each parent of the sharded set is pinged from each node in the cluster.

Java API: The interval each parent of the sharded set is pinged from each node in the cluster.

Note: How the sharded set is kept alive may change in the future meaning this setting may go away.
32. [**](../../../../akka/cluster/sharding/typed/ShardedDaemonProcessSettings.html#withKeepAliveInterval(keepAliveInterval:scala.concurrent.duration.FiniteDuration):akka.cluster.sharding.typed.ShardedDaemonProcessSettings "Permalink")  def withKeepAliveInterval(keepAliveInterval: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)): ShardedDaemonProcessSettingsScala API: The interval each parent of the sharded set is pinged from each node in the cluster.

Scala API: The interval each parent of the sharded set is pinged from each node in the cluster.

Note: How the sharded set is kept alive may change in the future meaning this setting may go away.
33. [**](../../../../akka/cluster/sharding/typed/ShardedDaemonProcessSettings.html#withKeepAliveThrottleInterval(keepAliveThrottleInterval:java.time.Duration):akka.cluster.sharding.typed.ShardedDaemonProcessSettings "Permalink")  def withKeepAliveThrottleInterval(keepAliveThrottleInterval: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration)): ShardedDaemonProcessSettingsJava API: Keep alive messages are sent with this delay between each message.
34. [**](../../../../akka/cluster/sharding/typed/ShardedDaemonProcessSettings.html#withKeepAliveThrottleInterval(keepAliveThrottleInterval:scala.concurrent.duration.FiniteDuration):akka.cluster.sharding.typed.ShardedDaemonProcessSettings "Permalink")  def withKeepAliveThrottleInterval(keepAliveThrottleInterval: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)): ShardedDaemonProcessSettingsScala API: Keep alive messages are sent with this delay between each message.
35. [**](../../../../akka/cluster/sharding/typed/ShardedDaemonProcessSettings.html#withRole(role:String):akka.cluster.sharding.typed.ShardedDaemonProcessSettings "Permalink")  def withRole(role: String): ShardedDaemonProcessSettingsSpecifies that the ShardedDaemonProcess should run on nodes with a specific role.

Specifies that the ShardedDaemonProcess should run on nodes with a specific role.
If the role is not specified all nodes in the cluster are used. If the given role does
not match the role of the current node the the ShardedDaemonProcess will not be started.
36. [**](../../../../akka/cluster/sharding/typed/ShardedDaemonProcessSettings.html#withShardingSettings(shardingSettings:akka.cluster.sharding.typed.ClusterShardingSettings):akka.cluster.sharding.typed.ShardedDaemonProcessSettings "Permalink")  def withShardingSettings(shardingSettings: [ClusterShardingSettings](ClusterShardingSettings.html)): ShardedDaemonProcessSettingsSpecify sharding settings that should be used for the sharded daemon process instead of loading from config.

Specify sharding settings that should be used for the sharded daemon process instead of loading from config.
Some settings can not be changed (remember\-entitites and related settings, passivation, number\-of\-shards),
changing those settings will be ignored.
### Deprecated Value Members

1. [**](../../../../akka/cluster/sharding/typed/ShardedDaemonProcessSettings.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../akka/cluster/sharding/typed/ShardedDaemonProcessSettings.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from ShardedDaemonProcessSettings toStringFormat\[ShardedDaemonProcessSettings] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../akka/cluster/sharding/typed/ShardedDaemonProcessSettings.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (ShardedDaemonProcessSettings, B)ImplicitThis member is added by an implicit conversion from ShardedDaemonProcessSettings toArrowAssoc\[ShardedDaemonProcessSettings] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromShardedDaemonProcessSettings to any2stringadd\[ShardedDaemonProcessSettings]

### Inherited by implicit conversion StringFormat fromShardedDaemonProcessSettings to StringFormat\[ShardedDaemonProcessSettings]

### Inherited by implicit conversion Ensuring fromShardedDaemonProcessSettings to Ensuring\[ShardedDaemonProcessSettings]

### Inherited by implicit conversion ArrowAssoc fromShardedDaemonProcessSettings to ArrowAssoc\[ShardedDaemonProcessSettings]

### Ungrouped

## Related Pages (Internal Links)

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
- https://doc.akka.io/api/akka/2.10/akka/cluster/sharding/typed/javadsl/index.html
- https://doc.akka.io/api/akka/2.10/akka/cluster/sharding/typed/scaladsl/index.html
- https://doc.akka.io/api/akka/2.10/akka/cluster/sharding/typed/testkit/index.html
- https://doc.akka.io/api/akka/2.10/akka/index.html
- https://doc.akka.io/api/akka/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka/2.10/akka/cluster/sharding/typed/ShardedDaemonProcessSettings.html](https://doc.akka.io/api/akka/2.10/akka/cluster/sharding/typed/ShardedDaemonProcessSettings.html)*