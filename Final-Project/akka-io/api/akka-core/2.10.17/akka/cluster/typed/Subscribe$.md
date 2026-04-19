---
description: Akka 2.10.17 - akka.cluster.typed.Subscribe
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:19:15Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/cluster/typed/Subscribe$.html
title: Akka 2.10.17 - akka.cluster.typed.Subscribe
---

# Akka 2.10.17 - akka.cluster.typed.Subscribe

> **Summary:** Akka 2.10.17 - akka.cluster.typed.Subscribe

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
[o](Subscribe.html "See companion class")[akka](../../index.html).[cluster](../index.html).[typed](index.html)

# [Subscribe](Subscribe.html "See companion class")[**](../../../akka/cluster/typed/Subscribe$.html "Permalink")

### Companion [class Subscribe](Subscribe.html "See companion class")

#### object Subscribe extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

Source[Cluster.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-typed/src/main/scala/akka/cluster/typed/Cluster.scala#L42)Linear Supertypes[Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Subscribe
2. Serializable
3. AnyRef
4. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../../akka/cluster/typed/Subscribe$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/cluster/typed/Subscribe$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/cluster/typed/Subscribe$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../akka/cluster/typed/Subscribe$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../../akka/cluster/typed/Subscribe$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
6. [**](../../../akka/cluster/typed/Subscribe$.html#create[A<:akka.cluster.ClusterEvent.ClusterDomainEvent](subscriber:akka.actor.typed.ActorRef[A],eventClass:Class[A]):akka.cluster.typed.Subscribe[A] "Permalink")  def create\[A \<: [ClusterDomainEvent](../ClusterEvent$$ClusterDomainEvent.html)](subscriber: [ActorRef](../../actor/typed/ActorRef.html)\[A], eventClass: Class\[A]): [Subscribe](Subscribe.html)\[A]Java API
7. [**](../../../akka/cluster/typed/Subscribe$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
8. [**](../../../akka/cluster/typed/Subscribe$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
9. [**](../../../akka/cluster/typed/Subscribe$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
10. [**](../../../akka/cluster/typed/Subscribe$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
11. [**](../../../akka/cluster/typed/Subscribe$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
12. [**](../../../akka/cluster/typed/Subscribe$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../akka/cluster/typed/Subscribe$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
14. [**](../../../akka/cluster/typed/Subscribe$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../akka/cluster/typed/Subscribe$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
16. [**](../../../akka/cluster/typed/Subscribe$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
17. [**](../../../akka/cluster/typed/Subscribe$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
18. [**](../../../akka/cluster/typed/Subscribe$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
19. [**](../../../akka/cluster/typed/Subscribe$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/cluster/typed/Subscribe$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/ActorRef.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ClusterEvent$$ClusterDomainEvent.html
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
- https://doc.akka.io/api/akka-core/2.10.17/akka/index.html
- https://doc.akka.io/api/akka-core/2.10.17/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/typed/Subscribe$.html](https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/typed/Subscribe$.html)*