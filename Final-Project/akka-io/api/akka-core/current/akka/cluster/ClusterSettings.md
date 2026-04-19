---
description: Akka 2.10.17 - akka.cluster.ClusterSettings
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:53:41Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/cluster/ClusterSettings.html
title: Akka 2.10.17 - akka.cluster.ClusterSettings
---

# Akka 2.10.17 - akka.cluster.ClusterSettings

> **Summary:** Akka 2.10.17 - akka.cluster.ClusterSettings

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../index.html "Permalink")  package [root](../../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/index.html "Permalink")  package [akka](../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/cluster/index.html "Permalink")  package [cluster](index.html)Definition Classes[akka](../index.html)
- [**](../../akka/cluster/ddata/index.html "Permalink")  package [ddata](ddata/index.html)Definition Classes[cluster](index.html)
- [**](../../akka/cluster/metrics/index.html "Permalink")  package [metrics](metrics/index.html)Definition Classes[cluster](index.html)
- [**](../../akka/cluster/protobuf/index.html "Permalink")  package [protobuf](protobuf/index.html)Definition Classes[cluster](index.html)
- [**](../../akka/cluster/pubsub/index.html "Permalink")  package [pubsub](pubsub/index.html)Definition Classes[cluster](index.html)
- [**](../../akka/cluster/routing/index.html "Permalink")  package [routing](routing/index.html)Definition Classes[cluster](index.html)
- [**](../../akka/cluster/sbr/index.html "Permalink")  package [sbr](sbr/index.html)Definition Classes[cluster](index.html)
- [**](../../akka/cluster/sharding/index.html "Permalink")  package [sharding](sharding/index.html)Definition Classes[cluster](index.html)
- [**](../../akka/cluster/singleton/index.html "Permalink")  package [singleton](singleton/index.html)Definition Classes[cluster](index.html)
- [**](../../akka/cluster/typed/index.html "Permalink")  package [typed](typed/index.html)Definition Classes[cluster](index.html)
- [Cluster](Cluster.html "This module is responsible cluster membership information.")
- [ClusterEvent](ClusterEvent$.html "Domain events published to the event bus.")
- [ClusterLogMarker](ClusterLogMarker$.html "This is public with the purpose to document the used markers and properties of log events.")
- [ClusterMessage](ClusterMessage.html "Base trait for all cluster messages.")
- [ClusterNodeMBean](ClusterNodeMBean.html "Interface for the cluster JMX MBean.")
- [ClusterScope](ClusterScope.html)
- ClusterSettings
- [ConfigValidation](ConfigValidation.html)
- [DowningProvider](DowningProvider.html "API for plugins that will handle downing of cluster nodes.")
- [GossipEnvelope](GossipEnvelope$.html)
- [Invalid](Invalid.html)
- [JoinConfigCompatCheckCluster](JoinConfigCompatCheckCluster.html "INTERNAL API")
- [JoinConfigCompatChecker](JoinConfigCompatChecker.html)
- [Member](Member.html "Represents the address, current status, and roles of a cluster member node.")
- [MemberStatus](MemberStatus.html "Defines the current status of a cluster member node")
- [NoDowning](NoDowning.html "Default downing provider used when no provider is configured.")
- [UniqueAddress](UniqueAddress.html "Member identifier consisting of address and random uid.")
- [Valid](Valid$.html)
- [VectorClock](VectorClock.html "Representation of a Vector-based clock (counting clock), inspired by Lamport logical clocks.")
[c](ClusterSettings$.html "See companion object")[akka](../index.html).[cluster](index.html)

# [ClusterSettings](ClusterSettings$.html "See companion object")[**](../../akka/cluster/ClusterSettings.html "Permalink")

### Companion [object ClusterSettings](ClusterSettings$.html "See companion object")

#### final  class ClusterSettings extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

Source[ClusterSettings.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster/src/main/scala/akka/cluster/ClusterSettings.scala#L43)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ClusterSettings
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

1. [**](../../akka/cluster/ClusterSettings.html#<init>(config:com.typesafe.config.Config,systemName:String):akka.cluster.ClusterSettings "Permalink")  new ClusterSettings(config: Config, systemName: String)
### Type Members

1. [**](../../akka/cluster/ClusterSettings$CrossDcFailureDetectorSettings.html "Permalink") final  class [CrossDcFailureDetectorSettings](ClusterSettings$CrossDcFailureDetectorSettings.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
### Value Members

1. [**](../../akka/cluster/ClusterSettings.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/cluster/ClusterSettings.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/cluster/ClusterSettings.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from ClusterSettings toany2stringadd\[ClusterSettings] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../akka/cluster/ClusterSettings.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (ClusterSettings, B)ImplicitThis member is added by an implicit conversion from ClusterSettings toArrowAssoc\[ClusterSettings] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../akka/cluster/ClusterSettings.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../akka/cluster/ClusterSettings.html#AllowWeaklyUpMembers:Boolean "Permalink")  val AllowWeaklyUpMembers: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)
7. [**](../../akka/cluster/ClusterSettings.html#AppVersion:akka.util.Version "Permalink")  val AppVersion: [util.Version](../util/Version.html)
8. [**](../../akka/cluster/ClusterSettings.html#ByPassConfigCompatCheck:Boolean "Permalink")  val ByPassConfigCompatCheck: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)
9. [**](../../akka/cluster/ClusterSettings.html#ConfigCompatCheckers:Set[String] "Permalink")  val ConfigCompatCheckers: Set\[String]
10. [**](../../akka/cluster/ClusterSettings.html#DownRemovalMargin:scala.concurrent.duration.FiniteDuration "Permalink")  val DownRemovalMargin: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)
11. [**](../../akka/cluster/ClusterSettings.html#DowningProviderClassName:String "Permalink")  val DowningProviderClassName: String
12. [**](../../akka/cluster/ClusterSettings.html#FailureDetectorConfig:com.typesafe.config.Config "Permalink")  val FailureDetectorConfig: Config
13. [**](../../akka/cluster/ClusterSettings.html#FailureDetectorImplementationClass:String "Permalink")  val FailureDetectorImplementationClass: String
14. [**](../../akka/cluster/ClusterSettings.html#GossipDifferentViewProbability:Double "Permalink")  val GossipDifferentViewProbability: [Double](https://www.scala-lang.org/api/2.13.17/scala/Double.html#scala.Double)
15. [**](../../akka/cluster/ClusterSettings.html#GossipInterval:scala.concurrent.duration.FiniteDuration "Permalink")  val GossipInterval: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)
16. [**](../../akka/cluster/ClusterSettings.html#GossipTimeToLive:scala.concurrent.duration.FiniteDuration "Permalink")  val GossipTimeToLive: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)
17. [**](../../akka/cluster/ClusterSettings.html#HeartbeatExpectedResponseAfter:scala.concurrent.duration.FiniteDuration "Permalink")  val HeartbeatExpectedResponseAfter: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)
18. [**](../../akka/cluster/ClusterSettings.html#HeartbeatInterval:scala.concurrent.duration.FiniteDuration "Permalink")  val HeartbeatInterval: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)
19. [**](../../akka/cluster/ClusterSettings.html#JmxEnabled:Boolean "Permalink")  val JmxEnabled: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)
20. [**](../../akka/cluster/ClusterSettings.html#JmxMultiMbeansInSameEnabled:Boolean "Permalink")  val JmxMultiMbeansInSameEnabled: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)
21. [**](../../akka/cluster/ClusterSettings.html#LeaderActionsInterval:scala.concurrent.duration.FiniteDuration "Permalink")  val LeaderActionsInterval: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)
22. [**](../../akka/cluster/ClusterSettings.html#LogInfo:Boolean "Permalink")  val LogInfo: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)
23. [**](../../akka/cluster/ClusterSettings.html#LogInfoVerbose:Boolean "Permalink")  val LogInfoVerbose: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)
24. [**](../../akka/cluster/ClusterSettings.html#MinNrOfMembers:Int "Permalink")  val MinNrOfMembers: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)
25. [**](../../akka/cluster/ClusterSettings.html#MinNrOfMembersOfRole:Map[String,Int] "Permalink")  val MinNrOfMembersOfRole: Map\[String, [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)]
26. [**](../../akka/cluster/ClusterSettings.html#MonitoredByNrOfMembers:Int "Permalink")  val MonitoredByNrOfMembers: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)
27. [**](../../akka/cluster/ClusterSettings.html#PeriodicTasksInitialDelay:scala.concurrent.duration.FiniteDuration "Permalink")  val PeriodicTasksInitialDelay: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)
28. [**](../../akka/cluster/ClusterSettings.html#PruneGossipTombstonesAfter:scala.concurrent.duration.Duration "Permalink")  val PruneGossipTombstonesAfter: [Duration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/Duration.html#scala.concurrent.duration.Duration)Is in fact always a `FiniteDuration` but needs to stay `Duration` for binary compatibility
29. [**](../../akka/cluster/ClusterSettings.html#PublishStatsInterval:scala.concurrent.duration.Duration "Permalink")  val PublishStatsInterval: [Duration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/Duration.html#scala.concurrent.duration.Duration)
30. [**](../../akka/cluster/ClusterSettings.html#QuarantineRemovedNodeAfter:scala.concurrent.duration.FiniteDuration "Permalink")  val QuarantineRemovedNodeAfter: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)
31. [**](../../akka/cluster/ClusterSettings.html#ReduceGossipDifferentViewProbability:Int "Permalink")  val ReduceGossipDifferentViewProbability: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)
32. [**](../../akka/cluster/ClusterSettings.html#RetryUnsuccessfulJoinAfter:scala.concurrent.duration.Duration "Permalink")  val RetryUnsuccessfulJoinAfter: [Duration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/Duration.html#scala.concurrent.duration.Duration)
33. [**](../../akka/cluster/ClusterSettings.html#Roles:Set[String] "Permalink")  val Roles: Set\[String]
34. [**](../../akka/cluster/ClusterSettings.html#RunCoordinatedShutdownWhenDown:Boolean "Permalink")  val RunCoordinatedShutdownWhenDown: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)
35. [**](../../akka/cluster/ClusterSettings.html#SchedulerTickDuration:scala.concurrent.duration.FiniteDuration "Permalink")  val SchedulerTickDuration: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)
36. [**](../../akka/cluster/ClusterSettings.html#SchedulerTicksPerWheel:Int "Permalink")  val SchedulerTicksPerWheel: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)
37. [**](../../akka/cluster/ClusterSettings.html#SeedNodeTimeout:scala.concurrent.duration.FiniteDuration "Permalink")  val SeedNodeTimeout: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)
38. [**](../../akka/cluster/ClusterSettings.html#SeedNodes:IndexedSeq[akka.actor.Address] "Permalink")  val SeedNodes: [IndexedSeq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/IndexedSeq.html#scala.collection.immutable.IndexedSeq)\[[Address](../actor/Address.html)]
39. [**](../../akka/cluster/ClusterSettings.html#SelfDataCenter:akka.cluster.ClusterSettings.DataCenter "Permalink")  val SelfDataCenter: [DataCenter](ClusterSettings$.html#DataCenter=String)
40. [**](../../akka/cluster/ClusterSettings.html#SensitiveConfigPaths:scala.collection.immutable.Set[String] "Permalink")  val SensitiveConfigPaths: [Set](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Set.html#scala.collection.immutable.Set)\[String]
41. [**](../../akka/cluster/ClusterSettings.html#ShutdownAfterUnsuccessfulJoinSeedNodes:scala.concurrent.duration.Duration "Permalink")  val ShutdownAfterUnsuccessfulJoinSeedNodes: [Duration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/Duration.html#scala.concurrent.duration.Duration)
42. [**](../../akka/cluster/ClusterSettings.html#UnreachableNodesReaperInterval:scala.concurrent.duration.FiniteDuration "Permalink")  val UnreachableNodesReaperInterval: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)
43. [**](../../akka/cluster/ClusterSettings.html#UseDispatcher:String "Permalink")  val UseDispatcher: String
44. [**](../../akka/cluster/ClusterSettings.html#WeaklyUpAfter:scala.concurrent.duration.FiniteDuration "Permalink")  val WeaklyUpAfter: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)
45. [**](../../akka/cluster/ClusterSettings.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
46. [**](../../akka/cluster/ClusterSettings.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
47. [**](../../akka/cluster/ClusterSettings.html#config:com.typesafe.config.Config "Permalink")  val config: Config
48. [**](../../akka/cluster/ClusterSettings.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (ClusterSettings) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ClusterSettingsImplicitThis member is added by an implicit conversion from ClusterSettings toEnsuring\[ClusterSettings] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
49. [**](../../akka/cluster/ClusterSettings.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (ClusterSettings) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ClusterSettingsImplicitThis member is added by an implicit conversion from ClusterSettings toEnsuring\[ClusterSettings] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
50. [**](../../akka/cluster/ClusterSettings.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ClusterSettingsImplicitThis member is added by an implicit conversion from ClusterSettings toEnsuring\[ClusterSettings] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
51. [**](../../akka/cluster/ClusterSettings.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ClusterSettingsImplicitThis member is added by an implicit conversion from ClusterSettings toEnsuring\[ClusterSettings] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
52. [**](../../akka/cluster/ClusterSettings.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
53. [**](../../akka/cluster/ClusterSettings.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
54. [**](../../akka/cluster/ClusterSettings.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
55. [**](../../akka/cluster/ClusterSettings.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
56. [**](../../akka/cluster/ClusterSettings.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
57. [**](../../akka/cluster/ClusterSettings.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
58. [**](../../akka/cluster/ClusterSettings.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
59. [**](../../akka/cluster/ClusterSettings.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
60. [**](../../akka/cluster/ClusterSettings.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
61. [**](../../akka/cluster/ClusterSettings.html#systemName:String "Permalink")  val systemName: String
62. [**](../../akka/cluster/ClusterSettings.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
63. [**](../../akka/cluster/ClusterSettings.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
64. [**](../../akka/cluster/ClusterSettings.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
65. [**](../../akka/cluster/ClusterSettings.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
66. [**](../../akka/cluster/ClusterSettings$Debug$.html "Permalink")  object [Debug](ClusterSettings$Debug$.html)
67. [**](../../akka/cluster/ClusterSettings$MultiDataCenter$.html "Permalink")  object [MultiDataCenter](ClusterSettings$MultiDataCenter$.html)
### Deprecated Value Members

1. [**](../../akka/cluster/ClusterSettings.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../akka/cluster/ClusterSettings.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from ClusterSettings toStringFormat\[ClusterSettings] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../akka/cluster/ClusterSettings.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (ClusterSettings, B)ImplicitThis member is added by an implicit conversion from ClusterSettings toArrowAssoc\[ClusterSettings] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromClusterSettings to any2stringadd\[ClusterSettings]

### Inherited by implicit conversion StringFormat fromClusterSettings to StringFormat\[ClusterSettings]

### Inherited by implicit conversion Ensuring fromClusterSettings to Ensuring\[ClusterSettings]

### Inherited by implicit conversion ArrowAssoc fromClusterSettings to ArrowAssoc\[ClusterSettings]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/current/akka/actor/Address.html
- https://doc.akka.io/api/akka-core/current/akka/cluster/Cluster$.html
- https://doc.akka.io/api/akka-core/current/akka/cluster/Cluster.html
- https://doc.akka.io/api/akka-core/current/akka/cluster/ClusterEvent$.html
- https://doc.akka.io/api/akka-core/current/akka/cluster/ClusterLogMarker$.html
- https://doc.akka.io/api/akka-core/current/akka/cluster/ClusterMessage.html
- https://doc.akka.io/api/akka-core/current/akka/cluster/ClusterNodeMBean.html
- https://doc.akka.io/api/akka-core/current/akka/cluster/ClusterScope$.html
- https://doc.akka.io/api/akka-core/current/akka/cluster/ClusterScope.html
- https://doc.akka.io/api/akka-core/current/akka/cluster/ClusterSettings$.html
- https://doc.akka.io/api/akka-core/current/akka/cluster/ClusterSettings$CrossDcFailureDetectorSettings.html
- https://doc.akka.io/api/akka-core/current/akka/cluster/ClusterSettings$Debug$.html
- https://doc.akka.io/api/akka-core/current/akka/cluster/ClusterSettings$MultiDataCenter$.html
- https://doc.akka.io/api/akka-core/current/akka/cluster/ClusterSettings.html
- https://doc.akka.io/api/akka-core/current/akka/cluster/ConfigValidation.html
- https://doc.akka.io/api/akka-core/current/akka/cluster/DowningProvider.html
- https://doc.akka.io/api/akka-core/current/akka/cluster/GossipEnvelope$.html
- https://doc.akka.io/api/akka-core/current/akka/cluster/Invalid.html
- https://doc.akka.io/api/akka-core/current/akka/cluster/JoinConfigCompatCheckCluster.html
- https://doc.akka.io/api/akka-core/current/akka/cluster/JoinConfigCompatChecker$.html
- https://doc.akka.io/api/akka-core/current/akka/cluster/JoinConfigCompatChecker.html
- https://doc.akka.io/api/akka-core/current/akka/cluster/Member$.html
- https://doc.akka.io/api/akka-core/current/akka/cluster/Member.html
- https://doc.akka.io/api/akka-core/current/akka/cluster/MemberStatus$.html
- https://doc.akka.io/api/akka-core/current/akka/cluster/MemberStatus.html
- https://doc.akka.io/api/akka-core/current/akka/cluster/NoDowning.html
- https://doc.akka.io/api/akka-core/current/akka/cluster/UniqueAddress$.html
- https://doc.akka.io/api/akka-core/current/akka/cluster/UniqueAddress.html
- https://doc.akka.io/api/akka-core/current/akka/cluster/Valid$.html
- https://doc.akka.io/api/akka-core/current/akka/cluster/VectorClock.html
- https://doc.akka.io/api/akka-core/current/akka/cluster/ddata/index.html
- https://doc.akka.io/api/akka-core/current/akka/cluster/index.html
- https://doc.akka.io/api/akka-core/current/akka/cluster/metrics/index.html
- https://doc.akka.io/api/akka-core/current/akka/cluster/protobuf/index.html
- https://doc.akka.io/api/akka-core/current/akka/cluster/pubsub/index.html
- https://doc.akka.io/api/akka-core/current/akka/cluster/routing/index.html
- https://doc.akka.io/api/akka-core/current/akka/cluster/sbr/index.html
- https://doc.akka.io/api/akka-core/current/akka/cluster/sharding/index.html
- https://doc.akka.io/api/akka-core/current/akka/cluster/singleton/index.html
- https://doc.akka.io/api/akka-core/current/akka/cluster/typed/index.html
- https://doc.akka.io/api/akka-core/current/akka/index.html
- https://doc.akka.io/api/akka-core/current/akka/util/Version.html
- https://doc.akka.io/api/akka-core/current/index.html

---
*Source: [https://doc.akka.io/api/akka-core/current/akka/cluster/ClusterSettings.html](https://doc.akka.io/api/akka-core/current/akka/cluster/ClusterSettings.html)*