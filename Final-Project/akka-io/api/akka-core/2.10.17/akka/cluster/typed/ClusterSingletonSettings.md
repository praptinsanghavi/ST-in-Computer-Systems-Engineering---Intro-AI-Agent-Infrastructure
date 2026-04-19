---
description: Akka 2.10.17 - akka.cluster.typed.ClusterSingletonSettings
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:19:04Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/cluster/typed/ClusterSingletonSettings.html
title: Akka 2.10.17 - akka.cluster.typed.ClusterSingletonSettings
---

# Akka 2.10.17 - akka.cluster.typed.ClusterSingletonSettings

> **Summary:** Akka 2.10.17 - akka.cluster.typed.ClusterSingletonSettings

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
- [ClusterSingletonManagerSettings](ClusterSingletonManagerSettings.html)
- ClusterSingletonSettings
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
[c](ClusterSingletonSettings$.html "See companion object")[akka](../../index.html).[cluster](../index.html).[typed](index.html)

# [ClusterSingletonSettings](ClusterSingletonSettings$.html "See companion object")[**](../../../akka/cluster/typed/ClusterSingletonSettings.html "Permalink")

### Companion [object ClusterSingletonSettings](ClusterSingletonSettings$.html "See companion object")

#### final  class ClusterSingletonSettings extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

Annotations@nowarn() Source[ClusterSingleton.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-typed/src/main/scala/akka/cluster/typed/ClusterSingleton.scala#L51)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ClusterSingletonSettings
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

1. [**](../../../akka/cluster/typed/ClusterSingletonSettings.html#<init>(role:Option[String],dataCenter:Option[akka.cluster.ClusterSettings.DataCenter],singletonIdentificationInterval:scala.concurrent.duration.FiniteDuration,removalMargin:scala.concurrent.duration.FiniteDuration,handOverRetryInterval:scala.concurrent.duration.FiniteDuration,bufferSize:Int,leaseSettings:Option[akka.coordination.lease.LeaseUsageSettings]):akka.cluster.typed.ClusterSingletonSettings "Permalink")  new ClusterSingletonSettings(role: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[String], dataCenter: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[DataCenter](../ClusterSettings$.html#DataCenter=String)], singletonIdentificationInterval: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), removalMargin: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), handOverRetryInterval: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), bufferSize: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), leaseSettings: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[LeaseUsageSettings](../../coordination/lease/LeaseUsageSettings.html)])
2. [**](../../../akka/cluster/typed/ClusterSingletonSettings.html#<init>(role:Option[String],dataCenter:Option[akka.cluster.ClusterSettings.DataCenter],singletonIdentificationInterval:scala.concurrent.duration.FiniteDuration,removalMargin:scala.concurrent.duration.FiniteDuration,handOverRetryInterval:scala.concurrent.duration.FiniteDuration,bufferSize:Int):akka.cluster.typed.ClusterSingletonSettings "Permalink")  new ClusterSingletonSettings(role: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[String], dataCenter: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[DataCenter](../ClusterSettings$.html#DataCenter=String)], singletonIdentificationInterval: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), removalMargin: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), handOverRetryInterval: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), bufferSize: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int))Annotations@deprecated Deprecated*(Since version 2\.6\.15\)* Use constructor with leaseSettings
### Value Members

1. [**](../../../akka/cluster/typed/ClusterSingletonSettings.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/cluster/typed/ClusterSingletonSettings.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/cluster/typed/ClusterSingletonSettings.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from ClusterSingletonSettings toany2stringadd\[ClusterSingletonSettings] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/cluster/typed/ClusterSingletonSettings.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (ClusterSingletonSettings, B)ImplicitThis member is added by an implicit conversion from ClusterSingletonSettings toArrowAssoc\[ClusterSingletonSettings] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/cluster/typed/ClusterSingletonSettings.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/cluster/typed/ClusterSingletonSettings.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../akka/cluster/typed/ClusterSingletonSettings.html#bufferSize:Int "Permalink")  val bufferSize: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)
8. [**](../../../akka/cluster/typed/ClusterSingletonSettings.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
9. [**](../../../akka/cluster/typed/ClusterSingletonSettings.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (ClusterSingletonSettings) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ClusterSingletonSettingsImplicitThis member is added by an implicit conversion from ClusterSingletonSettings toEnsuring\[ClusterSingletonSettings] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../akka/cluster/typed/ClusterSingletonSettings.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (ClusterSingletonSettings) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ClusterSingletonSettingsImplicitThis member is added by an implicit conversion from ClusterSingletonSettings toEnsuring\[ClusterSingletonSettings] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../akka/cluster/typed/ClusterSingletonSettings.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ClusterSingletonSettingsImplicitThis member is added by an implicit conversion from ClusterSingletonSettings toEnsuring\[ClusterSingletonSettings] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../akka/cluster/typed/ClusterSingletonSettings.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ClusterSingletonSettingsImplicitThis member is added by an implicit conversion from ClusterSingletonSettings toEnsuring\[ClusterSingletonSettings] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../../akka/cluster/typed/ClusterSingletonSettings.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
14. [**](../../../akka/cluster/typed/ClusterSingletonSettings.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
15. [**](../../../akka/cluster/typed/ClusterSingletonSettings.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../akka/cluster/typed/ClusterSingletonSettings.html#handOverRetryInterval:scala.concurrent.duration.FiniteDuration "Permalink")  val handOverRetryInterval: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)
17. [**](../../../akka/cluster/typed/ClusterSingletonSettings.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
18. [**](../../../akka/cluster/typed/ClusterSingletonSettings.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
19. [**](../../../akka/cluster/typed/ClusterSingletonSettings.html#leaseSettings:Option[akka.coordination.lease.LeaseUsageSettings] "Permalink")  val leaseSettings: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[LeaseUsageSettings](../../coordination/lease/LeaseUsageSettings.html)]
20. [**](../../../akka/cluster/typed/ClusterSingletonSettings.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
21. [**](../../../akka/cluster/typed/ClusterSingletonSettings.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
22. [**](../../../akka/cluster/typed/ClusterSingletonSettings.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
23. [**](../../../akka/cluster/typed/ClusterSingletonSettings.html#removalMargin:scala.concurrent.duration.FiniteDuration "Permalink")  val removalMargin: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)
24. [**](../../../akka/cluster/typed/ClusterSingletonSettings.html#role:Option[String] "Permalink")  val role: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[String]
25. [**](../../../akka/cluster/typed/ClusterSingletonSettings.html#singletonIdentificationInterval:scala.concurrent.duration.FiniteDuration "Permalink")  val singletonIdentificationInterval: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)
26. [**](../../../akka/cluster/typed/ClusterSingletonSettings.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
27. [**](../../../akka/cluster/typed/ClusterSingletonSettings.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesClusterSingletonSettings → AnyRef → Any
28. [**](../../../akka/cluster/typed/ClusterSingletonSettings.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
29. [**](../../../akka/cluster/typed/ClusterSingletonSettings.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
30. [**](../../../akka/cluster/typed/ClusterSingletonSettings.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
31. [**](../../../akka/cluster/typed/ClusterSingletonSettings.html#withBufferSize(bufferSize:Int):akka.cluster.typed.ClusterSingletonSettings "Permalink")  def withBufferSize(bufferSize: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): ClusterSingletonSettings
32. [**](../../../akka/cluster/typed/ClusterSingletonSettings.html#withHandoverRetryInterval(handOverRetryInterval:java.time.Duration):akka.cluster.typed.ClusterSingletonSettings "Permalink")  def withHandoverRetryInterval(handOverRetryInterval: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration)): ClusterSingletonSettings
33. [**](../../../akka/cluster/typed/ClusterSingletonSettings.html#withHandoverRetryInterval(handOverRetryInterval:scala.concurrent.duration.FiniteDuration):akka.cluster.typed.ClusterSingletonSettings "Permalink")  def withHandoverRetryInterval(handOverRetryInterval: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)): ClusterSingletonSettings
34. [**](../../../akka/cluster/typed/ClusterSingletonSettings.html#withLeaseSettings(leaseSettings:akka.coordination.lease.LeaseUsageSettings):akka.cluster.typed.ClusterSingletonSettings "Permalink")  def withLeaseSettings(leaseSettings: [LeaseUsageSettings](../../coordination/lease/LeaseUsageSettings.html)): ClusterSingletonSettingsNote that if you define a custom lease name and have several singletons each one must have a unique
lease name.

Note that if you define a custom lease name and have several singletons each one must have a unique
lease name. If the lease name is undefined it will be derived from ActorSystem name and singleton
actor path, but that may result in too long lease names.
35. [**](../../../akka/cluster/typed/ClusterSingletonSettings.html#withNoRole():akka.cluster.typed.ClusterSingletonSettings "Permalink")  def withNoRole(): ClusterSingletonSettings
36. [**](../../../akka/cluster/typed/ClusterSingletonSettings.html#withRemovalMargin(removalMargin:java.time.Duration):akka.cluster.typed.ClusterSingletonSettings "Permalink")  def withRemovalMargin(removalMargin: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration)): ClusterSingletonSettings
37. [**](../../../akka/cluster/typed/ClusterSingletonSettings.html#withRemovalMargin(removalMargin:scala.concurrent.duration.FiniteDuration):akka.cluster.typed.ClusterSingletonSettings "Permalink")  def withRemovalMargin(removalMargin: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)): ClusterSingletonSettings
38. [**](../../../akka/cluster/typed/ClusterSingletonSettings.html#withRole(role:String):akka.cluster.typed.ClusterSingletonSettings "Permalink")  def withRole(role: String): ClusterSingletonSettings
### Deprecated Value Members

1. [**](../../../akka/cluster/typed/ClusterSingletonSettings.html#dataCenter:Option[akka.cluster.ClusterSettings.DataCenter] "Permalink")  val dataCenter: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[DataCenter](../ClusterSettings$.html#DataCenter=String)]Annotations@deprecated Deprecated*(Since version 2\.10\.0\)* Use Akka Distributed Cluster instead
2. [**](../../../akka/cluster/typed/ClusterSingletonSettings.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
3. [**](../../../akka/cluster/typed/ClusterSingletonSettings.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from ClusterSingletonSettings toStringFormat\[ClusterSingletonSettings] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
4. [**](../../../akka/cluster/typed/ClusterSingletonSettings.html#withDataCenter(dataCenter:akka.cluster.ClusterSettings.DataCenter):akka.cluster.typed.ClusterSingletonSettings "Permalink")  def withDataCenter(dataCenter: [DataCenter](../ClusterSettings$.html#DataCenter=String)): ClusterSingletonSettingsAnnotations@deprecated Deprecated*(Since version 2\.10\.0\)* Use Akka Distributed Cluster instead
5. [**](../../../akka/cluster/typed/ClusterSingletonSettings.html#withNoDataCenter():akka.cluster.typed.ClusterSingletonSettings "Permalink")  def withNoDataCenter(): ClusterSingletonSettingsAnnotations@deprecated Deprecated*(Since version 2\.10\.0\)* Use Akka Distributed Cluster instead
6. [**](../../../akka/cluster/typed/ClusterSingletonSettings.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (ClusterSingletonSettings, B)ImplicitThis member is added by an implicit conversion from ClusterSingletonSettings toArrowAssoc\[ClusterSingletonSettings] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromClusterSingletonSettings to any2stringadd\[ClusterSingletonSettings]

### Inherited by implicit conversion StringFormat fromClusterSingletonSettings to StringFormat\[ClusterSingletonSettings]

### Inherited by implicit conversion Ensuring fromClusterSingletonSettings to Ensuring\[ClusterSingletonSettings]

### Inherited by implicit conversion ArrowAssoc fromClusterSingletonSettings to ArrowAssoc\[ClusterSingletonSettings]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ClusterSettings$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/typed/Cluster$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/typed/Cluster.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/typed/ClusterCommand.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/typed/ClusterSetup$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/typed/ClusterSetup.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/typed/ClusterSingleton$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/typed/ClusterSingleton.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/typed/ClusterSingletonManagerSettings$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/typed/ClusterSingletonManagerSettings.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/typed/ClusterSingletonSettings$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/typed/ClusterSingletonSettings.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/typed/ClusterSingletonSetup$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/typed/ClusterSingletonSetup.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/typed/ClusterStateSubscription.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/typed/Down.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/typed/GetCurrentState.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/typed/Join$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/typed/Join.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/typed/JoinSeedNodes.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/typed/Leave$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/typed/Leave.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/typed/PrepareForFullClusterShutdown$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/typed/PrepareForFullClusterShutdown.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/typed/SelfRemoved.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/typed/SelfUp.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/typed/SetAppVersionLater$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/typed/SetAppVersionLater.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/typed/SingletonActor$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/typed/SingletonActor.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/typed/Subscribe$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/typed/Subscribe.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/typed/Unsubscribe.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/typed/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/typed/internal/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/coordination/lease/LeaseUsageSettings.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/index.html
- https://doc.akka.io/api/akka-core/2.10.17/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/typed/ClusterSingletonSettings.html](https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/typed/ClusterSingletonSettings.html)*