---
description: Akka 2.10.17 - akka.cluster.typed.ClusterSingletonManagerSettings
knowledge_type: official_documentation
scraped_at: '2026-04-05T22:03:35Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/cluster/typed/ClusterSingletonManagerSettings$.html
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
- [ClusterSingletonManagerSettings](ClusterSingletonManagerSettings.html)
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
[o](ClusterSingletonManagerSettings.html "See companion class")[akka](../../index.html).[cluster](../index.html).[typed](index.html)

# [ClusterSingletonManagerSettings](ClusterSingletonManagerSettings.html "See companion class")[**](../../../akka/cluster/typed/ClusterSingletonManagerSettings$.html "Permalink")

### Companion [class ClusterSingletonManagerSettings](ClusterSingletonManagerSettings.html "See companion class")

#### object ClusterSingletonManagerSettings

Source[ClusterSingleton.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-typed/src/main/scala/akka/cluster/typed/ClusterSingleton.scala#L236)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ClusterSingletonManagerSettings
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../../akka/cluster/typed/ClusterSingletonManagerSettings$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/cluster/typed/ClusterSingletonManagerSettings$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/cluster/typed/ClusterSingletonManagerSettings$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../akka/cluster/typed/ClusterSingletonManagerSettings$.html#apply(config:com.typesafe.config.Config):akka.cluster.typed.ClusterSingletonManagerSettings "Permalink")  def apply(config: Config): [ClusterSingletonManagerSettings](ClusterSingletonManagerSettings.html)Create settings from a configuration with the same layout as
the default configuration `akka.cluster.singleton`.
5. [**](../../../akka/cluster/typed/ClusterSingletonManagerSettings$.html#apply(system:akka.actor.typed.ActorSystem[_]):akka.cluster.typed.ClusterSingletonManagerSettings "Permalink")  def apply(system: [ActorSystem](../../actor/typed/ActorSystem.html)\[\_]): [ClusterSingletonManagerSettings](ClusterSingletonManagerSettings.html)Create settings from the default configuration
`akka.cluster.singleton`.
6. [**](../../../akka/cluster/typed/ClusterSingletonManagerSettings$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../akka/cluster/typed/ClusterSingletonManagerSettings$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../akka/cluster/typed/ClusterSingletonManagerSettings$.html#create(config:com.typesafe.config.Config):akka.cluster.typed.ClusterSingletonManagerSettings "Permalink")  def create(config: Config): [ClusterSingletonManagerSettings](ClusterSingletonManagerSettings.html)Java API: Create settings from a configuration with the same layout as
the default configuration `akka.cluster.singleton`.
9. [**](../../../akka/cluster/typed/ClusterSingletonManagerSettings$.html#create(system:akka.actor.typed.ActorSystem[_]):akka.cluster.typed.ClusterSingletonManagerSettings "Permalink")  def create(system: [ActorSystem](../../actor/typed/ActorSystem.html)\[\_]): [ClusterSingletonManagerSettings](ClusterSingletonManagerSettings.html)Java API: Create settings from the default configuration
`akka.cluster.singleton`.
10. [**](../../../akka/cluster/typed/ClusterSingletonManagerSettings$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
11. [**](../../../akka/cluster/typed/ClusterSingletonManagerSettings$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
12. [**](../../../akka/cluster/typed/ClusterSingletonManagerSettings$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
13. [**](../../../akka/cluster/typed/ClusterSingletonManagerSettings$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
14. [**](../../../akka/cluster/typed/ClusterSingletonManagerSettings$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
15. [**](../../../akka/cluster/typed/ClusterSingletonManagerSettings$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
16. [**](../../../akka/cluster/typed/ClusterSingletonManagerSettings$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../../akka/cluster/typed/ClusterSingletonManagerSettings$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
18. [**](../../../akka/cluster/typed/ClusterSingletonManagerSettings$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
19. [**](../../../akka/cluster/typed/ClusterSingletonManagerSettings$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
20. [**](../../../akka/cluster/typed/ClusterSingletonManagerSettings$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
21. [**](../../../akka/cluster/typed/ClusterSingletonManagerSettings$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
22. [**](../../../akka/cluster/typed/ClusterSingletonManagerSettings$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/cluster/typed/ClusterSingletonManagerSettings$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/actor/typed/ActorSystem.html
- https://doc.akka.io/api/akka/current/akka/cluster/index.html
- https://doc.akka.io/api/akka/current/akka/cluster/typed/Cluster$.html
- https://doc.akka.io/api/akka/current/akka/cluster/typed/Cluster.html
- https://doc.akka.io/api/akka/current/akka/cluster/typed/ClusterCommand.html
- https://doc.akka.io/api/akka/current/akka/cluster/typed/ClusterSetup$.html
- https://doc.akka.io/api/akka/current/akka/cluster/typed/ClusterSetup.html
- https://doc.akka.io/api/akka/current/akka/cluster/typed/ClusterSingleton$.html
- https://doc.akka.io/api/akka/current/akka/cluster/typed/ClusterSingleton.html
- https://doc.akka.io/api/akka/current/akka/cluster/typed/ClusterSingletonManagerSettings$.html
- https://doc.akka.io/api/akka/current/akka/cluster/typed/ClusterSingletonManagerSettings.html
- https://doc.akka.io/api/akka/current/akka/cluster/typed/ClusterSingletonSettings$.html
- https://doc.akka.io/api/akka/current/akka/cluster/typed/ClusterSingletonSettings.html
- https://doc.akka.io/api/akka/current/akka/cluster/typed/ClusterSingletonSetup$.html
- https://doc.akka.io/api/akka/current/akka/cluster/typed/ClusterSingletonSetup.html
- https://doc.akka.io/api/akka/current/akka/cluster/typed/ClusterStateSubscription.html
- https://doc.akka.io/api/akka/current/akka/cluster/typed/Down.html
- https://doc.akka.io/api/akka/current/akka/cluster/typed/GetCurrentState.html
- https://doc.akka.io/api/akka/current/akka/cluster/typed/Join$.html
- https://doc.akka.io/api/akka/current/akka/cluster/typed/Join.html
- https://doc.akka.io/api/akka/current/akka/cluster/typed/JoinSeedNodes.html
- https://doc.akka.io/api/akka/current/akka/cluster/typed/Leave$.html
- https://doc.akka.io/api/akka/current/akka/cluster/typed/Leave.html
- https://doc.akka.io/api/akka/current/akka/cluster/typed/PrepareForFullClusterShutdown$.html
- https://doc.akka.io/api/akka/current/akka/cluster/typed/PrepareForFullClusterShutdown.html
- https://doc.akka.io/api/akka/current/akka/cluster/typed/SelfRemoved.html
- https://doc.akka.io/api/akka/current/akka/cluster/typed/SelfUp.html
- https://doc.akka.io/api/akka/current/akka/cluster/typed/SetAppVersionLater$.html
- https://doc.akka.io/api/akka/current/akka/cluster/typed/SetAppVersionLater.html
- https://doc.akka.io/api/akka/current/akka/cluster/typed/SingletonActor$.html
- https://doc.akka.io/api/akka/current/akka/cluster/typed/SingletonActor.html
- https://doc.akka.io/api/akka/current/akka/cluster/typed/Subscribe$.html
- https://doc.akka.io/api/akka/current/akka/cluster/typed/Subscribe.html
- https://doc.akka.io/api/akka/current/akka/cluster/typed/Unsubscribe.html
- https://doc.akka.io/api/akka/current/akka/cluster/typed/index.html
- https://doc.akka.io/api/akka/current/akka/cluster/typed/internal/index.html
- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/cluster/typed/ClusterSingletonManagerSettings$.html](https://doc.akka.io/api/akka/current/akka/cluster/typed/ClusterSingletonManagerSettings$.html)*