---
description: Akka 2.10.17 - akka.cluster.sharding.typed.scaladsl.ShardedDaemonProcess
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:52:58Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/cluster/sharding/typed/scaladsl/ShardedDaemonProcess$.html
title: Akka 2.10.17 - akka.cluster.sharding.typed.scaladsl.ShardedDaemonProcess
---

# Akka 2.10.17 - akka.cluster.sharding.typed.scaladsl.ShardedDaemonProcess

> **Summary:** Akka 2.10.17 - akka.cluster.sharding.typed.scaladsl.ShardedDaemonProcess

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../../../index.html "Permalink")  package [root](../../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/index.html "Permalink")  package [akka](../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/cluster/index.html "Permalink")  package [cluster](../../../index.html)Definition Classes[akka](../../../../index.html)
- [**](../../../../../akka/cluster/sharding/index.html "Permalink")  package [sharding](../../index.html)Definition Classes[cluster](../../../index.html)
- [**](../../../../../akka/cluster/sharding/typed/index.html "Permalink")  package [typed](../index.html)Definition Classes[sharding](../../index.html)
- [**](../../../../../akka/cluster/sharding/typed/scaladsl/index.html "Permalink")  package [scaladsl](index.html)Definition Classes[typed](../index.html)
- [ClusterSharding](ClusterSharding.html "This extension provides sharding functionality of actors in a cluster.")
- [ClusterShardingSetup](ClusterShardingSetup.html "Can be used in akka.actor.setup.ActorSystemSetup when starting the ActorSystem to replace the default implementation of the ClusterSharding extension.")
- [Entity](Entity.html "Defines how the entity should be created.")
- [EntityContext](EntityContext.html "Parameter to createBehavior function in Entity.apply.")
- [EntityRef](EntityRef.html "A reference to an sharded Entity, which allows ActorRef-like usage.")
- [EntityTypeKey](EntityTypeKey.html "The key of an entity type, the name must be unique.")
- [ShardedDaemonProcess](ShardedDaemonProcess.html "This extension runs a pre set number of actors in a cluster.")
- [StartEntity](StartEntity$.html "Allows starting a specific Sharded Entity by its entity identifier")
[o](ShardedDaemonProcess.html "See companion trait")[akka](../../../../index.html).[cluster](../../../index.html).[sharding](../../index.html).[typed](../index.html).[scaladsl](index.html)

# [ShardedDaemonProcess](ShardedDaemonProcess.html "See companion trait")[**](../../../../../akka/cluster/sharding/typed/scaladsl/ShardedDaemonProcess$.html "Permalink")

### Companion [trait ShardedDaemonProcess](ShardedDaemonProcess.html "See companion trait")

#### object ShardedDaemonProcess extends [ExtensionId](../../../../actor/typed/ExtensionId.html)\[[ShardedDaemonProcess](ShardedDaemonProcess.html)]

Source[ShardedDaemonProcess.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-sharding-typed/src/main/scala/akka/cluster/sharding/typed/scaladsl/ShardedDaemonProcess.scala#L24)Linear Supertypes[ExtensionId](../../../../actor/typed/ExtensionId.html)\[[ShardedDaemonProcess](ShardedDaemonProcess.html)], [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ShardedDaemonProcess
2. ExtensionId
3. AnyRef
4. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../../../../akka/cluster/sharding/typed/scaladsl/ShardedDaemonProcess$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../../akka/cluster/sharding/typed/scaladsl/ShardedDaemonProcess$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../../akka/cluster/sharding/typed/scaladsl/ShardedDaemonProcess$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../../../akka/cluster/sharding/typed/scaladsl/ShardedDaemonProcess$.html#apply(system:akka.actor.typed.ActorSystem[_]):T "Permalink") final  def apply(system: [ActorSystem](../../../../actor/typed/ActorSystem.html)\[\_]): [ShardedDaemonProcess](ShardedDaemonProcess.html)Lookup or create an instance of the extension identified by this id.

Lookup or create an instance of the extension identified by this id.

Definition Classes[ExtensionId](../../../../actor/typed/ExtensionId.html)
5. [**](../../../../../akka/cluster/sharding/typed/scaladsl/ShardedDaemonProcess$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
6. [**](../../../../../akka/cluster/sharding/typed/scaladsl/ShardedDaemonProcess$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
7. [**](../../../../../akka/cluster/sharding/typed/scaladsl/ShardedDaemonProcess$.html#createExtension(system:akka.actor.typed.ActorSystem[_]):akka.cluster.sharding.typed.scaladsl.ShardedDaemonProcess "Permalink")  def createExtension(system: [ActorSystem](../../../../actor/typed/ActorSystem.html)\[\_]): [ShardedDaemonProcess](ShardedDaemonProcess.html)Create the extension, will be invoked at most one time per actor system where the extension is registered.

Create the extension, will be invoked at most one time per actor system where the extension is registered.

Definition ClassesShardedDaemonProcess → [ExtensionId](../../../../actor/typed/ExtensionId.html)
8. [**](../../../../../akka/cluster/sharding/typed/scaladsl/ShardedDaemonProcess$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
9. [**](../../../../../akka/cluster/sharding/typed/scaladsl/ShardedDaemonProcess$.html#equals(other:Any):Boolean "Permalink") final  def equals(other: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition Classes[ExtensionId](../../../../actor/typed/ExtensionId.html) → AnyRef → Any
10. [**](../../../../../akka/cluster/sharding/typed/scaladsl/ShardedDaemonProcess$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
11. [**](../../../../../akka/cluster/sharding/typed/scaladsl/ShardedDaemonProcess$.html#hashCode():Int "Permalink") final  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition Classes[ExtensionId](../../../../actor/typed/ExtensionId.html) → AnyRef → Any
12. [**](../../../../../akka/cluster/sharding/typed/scaladsl/ShardedDaemonProcess$.html#id:akka.actor.typed.ExtensionId[T] "Permalink")  def id: [ExtensionId](../../../../actor/typed/ExtensionId.html)\[[ShardedDaemonProcess](ShardedDaemonProcess.html)]Java API: The identifier of the extension

Java API: The identifier of the extension

Definition Classes[ExtensionId](../../../../actor/typed/ExtensionId.html)
13. [**](../../../../../akka/cluster/sharding/typed/scaladsl/ShardedDaemonProcess$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
14. [**](../../../../../akka/cluster/sharding/typed/scaladsl/ShardedDaemonProcess$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
15. [**](../../../../../akka/cluster/sharding/typed/scaladsl/ShardedDaemonProcess$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../../../akka/cluster/sharding/typed/scaladsl/ShardedDaemonProcess$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../../../../akka/cluster/sharding/typed/scaladsl/ShardedDaemonProcess$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
18. [**](../../../../../akka/cluster/sharding/typed/scaladsl/ShardedDaemonProcess$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
19. [**](../../../../../akka/cluster/sharding/typed/scaladsl/ShardedDaemonProcess$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
20. [**](../../../../../akka/cluster/sharding/typed/scaladsl/ShardedDaemonProcess$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
21. [**](../../../../../akka/cluster/sharding/typed/scaladsl/ShardedDaemonProcess$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../../akka/cluster/sharding/typed/scaladsl/ShardedDaemonProcess$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [ExtensionId](../../../../actor/typed/ExtensionId.html)\[[ShardedDaemonProcess](ShardedDaemonProcess.html)]

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/actor/typed/ActorSystem.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/ExtensionId.html
- https://doc.akka.io/api/akka/current/akka/cluster/index.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/index.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/typed/index.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/typed/scaladsl/ClusterSharding$.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/typed/scaladsl/ClusterSharding.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/typed/scaladsl/ClusterShardingSetup$.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/typed/scaladsl/ClusterShardingSetup.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/typed/scaladsl/Entity$.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/typed/scaladsl/Entity.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/typed/scaladsl/EntityContext.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/typed/scaladsl/EntityRef.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/typed/scaladsl/EntityTypeKey$.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/typed/scaladsl/EntityTypeKey.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/typed/scaladsl/ShardedDaemonProcess$.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/typed/scaladsl/ShardedDaemonProcess.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/typed/scaladsl/StartEntity$.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/typed/scaladsl/index.html
- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/cluster/sharding/typed/scaladsl/ShardedDaemonProcess$.html](https://doc.akka.io/api/akka/current/akka/cluster/sharding/typed/scaladsl/ShardedDaemonProcess$.html)*