---
description: Akka 2.10.17 - akka.cluster.typed.ClusterSingletonManagerSettings
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:19:43Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/cluster/typed/ClusterSingletonManagerSettings.html
title: Akka 2.10.17 - akka.cluster.typed.ClusterSingletonManagerSettings
---

# Akka 2.10.17 - akka.cluster.typed.ClusterSingletonManagerSettings

> **Summary:** Akka 2.10.17 - akka.cluster.typed.ClusterSingletonManagerSettings

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/cluster/index.html "Permalink")  package [cluster](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/cluster/typed/index.html "Permalink")  package [typed](index.html)Definition Classes[cluster](../index.html)
- [**](../../../akka/cluster/typed/internal/index.html "Permalink")  package [internal](internal/index.html)Definition Classes[typed](index.html)
- [Cluster](Cluster.html "This class is not intended for user extension other than for test purposes (e.g.")
- [ClusterCommand](ClusterCommand.html "Not intended for user extension.")
- [ClusterSetup](ClusterSetup.html "Can be used in akka.actor.setup.ActorSystemSetup when starting the ActorSystem to replace the default implementation of the Cluster extension.")
- [ClusterSingleton](ClusterSingleton.html "This class is not intended for user extension other than for test purposes (e.g.")
- ClusterSingletonManagerSettings
- [ClusterSingletonSettings](ClusterSingletonSettings.html)
- [ClusterSingletonSetup](ClusterSingletonSetup.html "Can be used in akka.actor.setup.ActorSystemSetup when starting the ActorSystem to replace the default implementation of the ClusterSingleton extension.")
- [ClusterStateSubscription](ClusterStateSubscription.html "Messages for subscribing to changes in the cluster state")
- [Down](Down.html "Send command to DOWN the node specified by 'address'.")
- [GetCurrentState](GetCurrentState.html)
- [Join](Join.html "Try to join this cluster node with the node specified by 'address'.")
- [JoinSeedNodes](JoinSeedNodes.html "Scala API: Join the specified seed nodes without defining them in config.")
- [Leave](Leave.html "Send command to issue state transition to LEAVING for the node specified by 'address'.")
- [PrepareForFullClusterShutdown](PrepareForFullClusterShutdown.html "Initiate a full cluster shutdown.")
- [SelfRemoved](SelfRemoved.html "Subscribe to this node being removed from the cluster.")
- [SelfUp](SelfUp.html "Subscribe to this node being up, after sending this event the subscription is automatically cancelled.")
- [SetAppVersionLater](SetAppVersionLater.html "Scala API: If the appVersion is read from an external system (e.g.")
- [SingletonActor](SingletonActor.html)
- [Subscribe](Subscribe.html "Subscribe to cluster state changes.")
- [Unsubscribe](Unsubscribe.html)
[c](ClusterSingletonManagerSettings$.html "See companion object")[akka](../../index.html).[cluster](../index.html).[typed](index.html)

# [ClusterSingletonManagerSettings](ClusterSingletonManagerSettings$.html "See companion object")[**](../../../akka/cluster/typed/ClusterSingletonManagerSettings.html "Permalink")

### Companion [object ClusterSingletonManagerSettings](ClusterSingletonManagerSettings$.html "See companion object")

#### final  class ClusterSingletonManagerSettings extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

Source[ClusterSingleton.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-typed/src/main/scala/akka/cluster/typed/ClusterSingleton.scala#L316)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ClusterSingletonManagerSettings
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

1. [**](../../../akka/cluster/typed/ClusterSingletonManagerSettings.html#<init>(singletonName:String,role:Option[String],removalMargin:scala.concurrent.duration.FiniteDuration,handOverRetryInterval:scala.concurrent.duration.FiniteDuration,leaseSettings:Option[akka.coordination.lease.LeaseUsageSettings]):akka.cluster.typed.ClusterSingletonManagerSettings "Permalink")  new ClusterSingletonManagerSettings(singletonName: String, role: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[String], removalMargin: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), handOverRetryInterval: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), leaseSettings: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[LeaseUsageSettings](../../coordination/lease/LeaseUsageSettings.html)])singletonNameThe actor name of the child singleton actor.

roleSingleton among the nodes tagged with specified role.
 If the role is not specified it's a singleton among all nodes in
 the cluster.

removalMarginMargin until the singleton instance that belonged to
 a downed/removed partition is created in surviving partition. The purpose of
 this margin is that in case of a network partition the singleton actors
 in the non\-surviving partitions must be stopped before corresponding actors
 are started somewhere else. This is especially important for persistent
 actors.

handOverRetryIntervalWhen a node is becoming oldest it sends hand\-over
 request to previous oldest, that might be leaving the cluster. This is
 retried with this interval until the previous oldest confirms that the hand
 over has started or the previous oldest member is removed from the cluster
 (\+ `removalMargin`).

leaseSettingsLeaseSettings for acquiring before creating the singleton actor.
 Note that if you define a custom lease name and have several singletons each
 one must have a unique lease name. If the lease name is undefined it will be
 derived from ActorSystem name and singleton actor path, but that may result in
 too long lease names.
2. [**](../../../akka/cluster/typed/ClusterSingletonManagerSettings.html#<init>(singletonName:String,role:Option[String],removalMargin:scala.concurrent.duration.FiniteDuration,handOverRetryInterval:scala.concurrent.duration.FiniteDuration):akka.cluster.typed.ClusterSingletonManagerSettings "Permalink")  new ClusterSingletonManagerSettings(singletonName: String, role: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[String], removalMargin: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), handOverRetryInterval: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration))Annotations@deprecated Deprecated*(Since version 2\.6\.15\)* Use constructor with leaseSettings
### Value Members

1. [**](../../../akka/cluster/typed/ClusterSingletonManagerSettings.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/cluster/typed/ClusterSingletonManagerSettings.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/cluster/typed/ClusterSingletonManagerSettings.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from ClusterSingletonManagerSettings toany2stringadd\[ClusterSingletonManagerSettings] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/cluster/typed/ClusterSingletonManagerSettings.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (ClusterSingletonManagerSettings, B)ImplicitThis member is added by an implicit conversion from ClusterSingletonManagerSettings toArrowAssoc\[ClusterSingletonManagerSettings] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/cluster/typed/ClusterSingletonManagerSettings.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/cluster/typed/ClusterSingletonManagerSettings.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../akka/cluster/typed/ClusterSingletonManagerSettings.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../akka/cluster/typed/ClusterSingletonManagerSettings.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (ClusterSingletonManagerSettings) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ClusterSingletonManagerSettingsImplicitThis member is added by an implicit conversion from ClusterSingletonManagerSettings toEnsuring\[ClusterSingletonManagerSettings] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../akka/cluster/typed/ClusterSingletonManagerSettings.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (ClusterSingletonManagerSettings) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ClusterSingletonManagerSettingsImplicitThis member is added by an implicit conversion from ClusterSingletonManagerSettings toEnsuring\[ClusterSingletonManagerSettings] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../akka/cluster/typed/ClusterSingletonManagerSettings.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ClusterSingletonManagerSettingsImplicitThis member is added by an implicit conversion from ClusterSingletonManagerSettings toEnsuring\[ClusterSingletonManagerSettings] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../akka/cluster/typed/ClusterSingletonManagerSettings.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ClusterSingletonManagerSettingsImplicitThis member is added by an implicit conversion from ClusterSingletonManagerSettings toEnsuring\[ClusterSingletonManagerSettings] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../akka/cluster/typed/ClusterSingletonManagerSettings.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../akka/cluster/typed/ClusterSingletonManagerSettings.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../../akka/cluster/typed/ClusterSingletonManagerSettings.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../akka/cluster/typed/ClusterSingletonManagerSettings.html#handOverRetryInterval:scala.concurrent.duration.FiniteDuration "Permalink")  val handOverRetryInterval: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)
16. [**](../../../akka/cluster/typed/ClusterSingletonManagerSettings.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../../akka/cluster/typed/ClusterSingletonManagerSettings.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
18. [**](../../../akka/cluster/typed/ClusterSingletonManagerSettings.html#leaseSettings:Option[akka.coordination.lease.LeaseUsageSettings] "Permalink")  val leaseSettings: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[LeaseUsageSettings](../../coordination/lease/LeaseUsageSettings.html)]
19. [**](../../../akka/cluster/typed/ClusterSingletonManagerSettings.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
20. [**](../../../akka/cluster/typed/ClusterSingletonManagerSettings.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../../akka/cluster/typed/ClusterSingletonManagerSettings.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
22. [**](../../../akka/cluster/typed/ClusterSingletonManagerSettings.html#removalMargin:scala.concurrent.duration.FiniteDuration "Permalink")  val removalMargin: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)
23. [**](../../../akka/cluster/typed/ClusterSingletonManagerSettings.html#role:Option[String] "Permalink")  val role: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[String]
24. [**](../../../akka/cluster/typed/ClusterSingletonManagerSettings.html#singletonName:String "Permalink")  val singletonName: String
25. [**](../../../akka/cluster/typed/ClusterSingletonManagerSettings.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
26. [**](../../../akka/cluster/typed/ClusterSingletonManagerSettings.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
27. [**](../../../akka/cluster/typed/ClusterSingletonManagerSettings.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
28. [**](../../../akka/cluster/typed/ClusterSingletonManagerSettings.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
29. [**](../../../akka/cluster/typed/ClusterSingletonManagerSettings.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
30. [**](../../../akka/cluster/typed/ClusterSingletonManagerSettings.html#withHandOverRetryInterval(retryInterval:java.time.Duration):akka.cluster.typed.ClusterSingletonManagerSettings "Permalink")  def withHandOverRetryInterval(retryInterval: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration)): ClusterSingletonManagerSettings
31. [**](../../../akka/cluster/typed/ClusterSingletonManagerSettings.html#withHandOverRetryInterval(retryInterval:scala.concurrent.duration.FiniteDuration):akka.cluster.typed.ClusterSingletonManagerSettings "Permalink")  def withHandOverRetryInterval(retryInterval: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)): ClusterSingletonManagerSettings
32. [**](../../../akka/cluster/typed/ClusterSingletonManagerSettings.html#withLeaseSettings(leaseSettings:akka.coordination.lease.LeaseUsageSettings):akka.cluster.typed.ClusterSingletonManagerSettings "Permalink")  def withLeaseSettings(leaseSettings: [LeaseUsageSettings](../../coordination/lease/LeaseUsageSettings.html)): ClusterSingletonManagerSettingsNote that if you define a custom lease name and have several singletons each one must have a unique
lease name.

Note that if you define a custom lease name and have several singletons each one must have a unique
lease name. If the lease name is undefined it will be derived from ActorSystem name and singleton
actor path, but that may result in too long lease names.
33. [**](../../../akka/cluster/typed/ClusterSingletonManagerSettings.html#withRemovalMargin(removalMargin:java.time.Duration):akka.cluster.typed.ClusterSingletonManagerSettings "Permalink")  def withRemovalMargin(removalMargin: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration)): ClusterSingletonManagerSettings
34. [**](../../../akka/cluster/typed/ClusterSingletonManagerSettings.html#withRemovalMargin(removalMargin:scala.concurrent.duration.FiniteDuration):akka.cluster.typed.ClusterSingletonManagerSettings "Permalink")  def withRemovalMargin(removalMargin: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)): ClusterSingletonManagerSettings
35. [**](../../../akka/cluster/typed/ClusterSingletonManagerSettings.html#withRole(role:Option[String]):akka.cluster.typed.ClusterSingletonManagerSettings "Permalink")  def withRole(role: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[String]): ClusterSingletonManagerSettings
36. [**](../../../akka/cluster/typed/ClusterSingletonManagerSettings.html#withRole(role:String):akka.cluster.typed.ClusterSingletonManagerSettings "Permalink")  def withRole(role: String): ClusterSingletonManagerSettings
37. [**](../../../akka/cluster/typed/ClusterSingletonManagerSettings.html#withSingletonName(name:String):akka.cluster.typed.ClusterSingletonManagerSettings "Permalink")  def withSingletonName(name: String): ClusterSingletonManagerSettings
### Deprecated Value Members

1. [**](../../../akka/cluster/typed/ClusterSingletonManagerSettings.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../akka/cluster/typed/ClusterSingletonManagerSettings.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from ClusterSingletonManagerSettings toStringFormat\[ClusterSingletonManagerSettings] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/cluster/typed/ClusterSingletonManagerSettings.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (ClusterSingletonManagerSettings, B)ImplicitThis member is added by an implicit conversion from ClusterSingletonManagerSettings toArrowAssoc\[ClusterSingletonManagerSettings] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromClusterSingletonManagerSettings to any2stringadd\[ClusterSingletonManagerSettings]

### Inherited by implicit conversion StringFormat fromClusterSingletonManagerSettings to StringFormat\[ClusterSingletonManagerSettings]

### Inherited by implicit conversion Ensuring fromClusterSingletonManagerSettings to Ensuring\[ClusterSingletonManagerSettings]

### Inherited by implicit conversion ArrowAssoc fromClusterSingletonManagerSettings to ArrowAssoc\[ClusterSingletonManagerSettings]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/cluster/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/typed/Cluster$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/typed/Cluster.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/typed/ClusterCommand.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/typed/ClusterSetup$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/typed/ClusterSetup.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/typed/ClusterSingleton$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/typed/ClusterSingleton.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/typed/ClusterSingletonManagerSettings$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/typed/ClusterSingletonManagerSettings.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/typed/ClusterSingletonSettings$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/typed/ClusterSingletonSettings.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/typed/ClusterSingletonSetup$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/typed/ClusterSingletonSetup.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/typed/ClusterStateSubscription.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/typed/Down.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/typed/GetCurrentState.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/typed/Join$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/typed/Join.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/typed/JoinSeedNodes.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/typed/Leave$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/typed/Leave.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/typed/PrepareForFullClusterShutdown$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/typed/PrepareForFullClusterShutdown.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/typed/SelfRemoved.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/typed/SelfUp.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/typed/SetAppVersionLater$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/typed/SetAppVersionLater.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/typed/SingletonActor$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/typed/SingletonActor.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/typed/Subscribe$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/typed/Subscribe.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/typed/Unsubscribe.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/typed/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/typed/internal/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/coordination/lease/LeaseUsageSettings.html
- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/cluster/typed/ClusterSingletonManagerSettings.html](https://doc.akka.io/api/akka-core/2.10/akka/cluster/typed/ClusterSingletonManagerSettings.html)*