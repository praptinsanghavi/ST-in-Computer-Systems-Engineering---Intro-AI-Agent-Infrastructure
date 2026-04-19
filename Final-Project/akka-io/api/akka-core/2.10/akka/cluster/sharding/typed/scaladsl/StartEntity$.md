---
description: Akka 2.10.17 - akka.cluster.sharding.typed.scaladsl.StartEntity
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:03:08Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/cluster/sharding/typed/scaladsl/StartEntity$.html
title: Akka 2.10.17 - akka.cluster.sharding.typed.scaladsl.StartEntity
---

# Akka 2.10.17 - akka.cluster.sharding.typed.scaladsl.StartEntity

> **Summary:** Akka 2.10.17 - akka.cluster.sharding.typed.scaladsl.StartEntity

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
- StartEntity
o[akka](../../../../index.html).[cluster](../../../index.html).[sharding](../../index.html).[typed](../index.html).[scaladsl](index.html)

# StartEntity[**](../../../../../akka/cluster/sharding/typed/scaladsl/StartEntity$.html "Permalink")

### 

#### object StartEntity

Allows starting a specific Sharded Entity by its entity identifier

Source[ClusterSharding.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-sharding-typed/src/main/scala/akka/cluster/sharding/typed/scaladsl/ClusterSharding.scala#L381)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. StartEntity
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../../../../akka/cluster/sharding/typed/scaladsl/StartEntity$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../../akka/cluster/sharding/typed/scaladsl/StartEntity$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../../akka/cluster/sharding/typed/scaladsl/StartEntity$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../../../akka/cluster/sharding/typed/scaladsl/StartEntity$.html#apply[M](entityId:String):akka.cluster.sharding.typed.ShardingEnvelope[M] "Permalink")  def apply\[M](entityId: String): [ShardingEnvelope](../ShardingEnvelope.html)\[M]Returns [ShardingEnvelope](../ShardingEnvelope.html) which can be sent via Cluster Sharding in order to wake up the
specified (by `entityId`) Sharded Entity, *without* delivering a real message to it.
5. [**](../../../../../akka/cluster/sharding/typed/scaladsl/StartEntity$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
6. [**](../../../../../akka/cluster/sharding/typed/scaladsl/StartEntity$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
7. [**](../../../../../akka/cluster/sharding/typed/scaladsl/StartEntity$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
8. [**](../../../../../akka/cluster/sharding/typed/scaladsl/StartEntity$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
9. [**](../../../../../akka/cluster/sharding/typed/scaladsl/StartEntity$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
10. [**](../../../../../akka/cluster/sharding/typed/scaladsl/StartEntity$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
11. [**](../../../../../akka/cluster/sharding/typed/scaladsl/StartEntity$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
12. [**](../../../../../akka/cluster/sharding/typed/scaladsl/StartEntity$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../../../akka/cluster/sharding/typed/scaladsl/StartEntity$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
14. [**](../../../../../akka/cluster/sharding/typed/scaladsl/StartEntity$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../../../akka/cluster/sharding/typed/scaladsl/StartEntity$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
16. [**](../../../../../akka/cluster/sharding/typed/scaladsl/StartEntity$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
17. [**](../../../../../akka/cluster/sharding/typed/scaladsl/StartEntity$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
18. [**](../../../../../akka/cluster/sharding/typed/scaladsl/StartEntity$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
19. [**](../../../../../akka/cluster/sharding/typed/scaladsl/StartEntity$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../../akka/cluster/sharding/typed/scaladsl/StartEntity$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/cluster/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/typed/ShardingEnvelope.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/typed/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/typed/scaladsl/ClusterSharding$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/typed/scaladsl/ClusterSharding.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/typed/scaladsl/ClusterShardingSetup$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/typed/scaladsl/ClusterShardingSetup.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/typed/scaladsl/Entity$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/typed/scaladsl/Entity.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/typed/scaladsl/EntityContext.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/typed/scaladsl/EntityRef.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/typed/scaladsl/EntityTypeKey$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/typed/scaladsl/EntityTypeKey.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/typed/scaladsl/ShardedDaemonProcess$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/typed/scaladsl/ShardedDaemonProcess.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/typed/scaladsl/StartEntity$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/typed/scaladsl/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/typed/scaladsl/StartEntity$.html](https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/typed/scaladsl/StartEntity$.html)*