---
description: Akka 2.10.17 - akka.cluster.typed.Cluster
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:53:00Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/cluster/typed/Cluster$.html
title: Akka 2.10.17 - akka.cluster.typed.Cluster
---

# Akka 2.10.17 - akka.cluster.typed.Cluster

> **Summary:** Akka 2.10.17 - akka.cluster.typed.Cluster

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
[o](Cluster.html "See companion class")[akka](../../index.html).[cluster](../index.html).[typed](index.html)

# [Cluster](Cluster.html "See companion class")[**](../../../akka/cluster/typed/Cluster$.html "Permalink")

### Companion [class Cluster](Cluster.html "See companion class")

#### object Cluster extends [ExtensionId](../../actor/typed/ExtensionId.html)\[[Cluster](Cluster.html)]

Akka Typed Cluster API entry point

Source[Cluster.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-typed/src/main/scala/akka/cluster/typed/Cluster.scala#L204)Linear Supertypes[ExtensionId](../../actor/typed/ExtensionId.html)\[[Cluster](Cluster.html)], [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Cluster
2. ExtensionId
3. AnyRef
4. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../../akka/cluster/typed/Cluster$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/cluster/typed/Cluster$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/cluster/typed/Cluster$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../akka/cluster/typed/Cluster$.html#apply(system:akka.actor.typed.ActorSystem[_]):T "Permalink") final  def apply(system: [ActorSystem](../../actor/typed/ActorSystem.html)\[\_]): [Cluster](Cluster.html)Lookup or create an instance of the extension identified by this id.

Lookup or create an instance of the extension identified by this id.

Definition Classes[ExtensionId](../../actor/typed/ExtensionId.html)
5. [**](../../../akka/cluster/typed/Cluster$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
6. [**](../../../akka/cluster/typed/Cluster$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
7. [**](../../../akka/cluster/typed/Cluster$.html#createExtension(system:akka.actor.typed.ActorSystem[_]):akka.cluster.typed.Cluster "Permalink")  def createExtension(system: [ActorSystem](../../actor/typed/ActorSystem.html)\[\_]): [Cluster](Cluster.html)Create the extension, will be invoked at most one time per actor system where the extension is registered.

Create the extension, will be invoked at most one time per actor system where the extension is registered.

Definition ClassesCluster → [ExtensionId](../../actor/typed/ExtensionId.html)
8. [**](../../../akka/cluster/typed/Cluster$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
9. [**](../../../akka/cluster/typed/Cluster$.html#equals(other:Any):Boolean "Permalink") final  def equals(other: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition Classes[ExtensionId](../../actor/typed/ExtensionId.html) → AnyRef → Any
10. [**](../../../akka/cluster/typed/Cluster$.html#get(system:akka.actor.typed.ActorSystem[_]):akka.cluster.typed.Cluster "Permalink")  def get(system: [ActorSystem](../../actor/typed/ActorSystem.html)\[\_]): [Cluster](Cluster.html)Java API
11. [**](../../../akka/cluster/typed/Cluster$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
12. [**](../../../akka/cluster/typed/Cluster$.html#hashCode():Int "Permalink") final  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition Classes[ExtensionId](../../actor/typed/ExtensionId.html) → AnyRef → Any
13. [**](../../../akka/cluster/typed/Cluster$.html#id:akka.actor.typed.ExtensionId[T] "Permalink")  def id: [ExtensionId](../../actor/typed/ExtensionId.html)\[[Cluster](Cluster.html)]Java API: The identifier of the extension

Java API: The identifier of the extension

Definition Classes[ExtensionId](../../actor/typed/ExtensionId.html)
14. [**](../../../akka/cluster/typed/Cluster$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
15. [**](../../../akka/cluster/typed/Cluster$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
16. [**](../../../akka/cluster/typed/Cluster$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../../akka/cluster/typed/Cluster$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
18. [**](../../../akka/cluster/typed/Cluster$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
19. [**](../../../akka/cluster/typed/Cluster$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
20. [**](../../../akka/cluster/typed/Cluster$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
21. [**](../../../akka/cluster/typed/Cluster$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
22. [**](../../../akka/cluster/typed/Cluster$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/cluster/typed/Cluster$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [ExtensionId](../../actor/typed/ExtensionId.html)\[[Cluster](Cluster.html)]

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/actor/typed/ActorSystem.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/ExtensionId.html
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
*Source: [https://doc.akka.io/api/akka/current/akka/cluster/typed/Cluster$.html](https://doc.akka.io/api/akka/current/akka/cluster/typed/Cluster$.html)*