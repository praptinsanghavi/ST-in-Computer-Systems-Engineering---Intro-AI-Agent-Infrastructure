---
description: Akka 2.10.17 - akka.cluster.sharding.typed.javadsl.ClusterSharding
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:12:42Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/cluster/sharding/typed/javadsl/ClusterSharding$.html
title: Akka 2.10.17 - akka.cluster.sharding.typed.javadsl.ClusterSharding
---

# Akka 2.10.17 - akka.cluster.sharding.typed.javadsl.ClusterSharding

> **Summary:** Akka 2.10.17 - akka.cluster.sharding.typed.javadsl.ClusterSharding

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../../../index.html "Permalink")  package [root](../../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/index.html "Permalink")  package [akka](../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/cluster/index.html "Permalink")  package [cluster](../../../index.html)Definition Classes[akka](../../../../index.html)
- [**](../../../../../akka/cluster/sharding/index.html "Permalink")  package [sharding](../../index.html)Definition Classes[cluster](../../../index.html)
- [**](../../../../../akka/cluster/sharding/typed/index.html "Permalink")  package [typed](../index.html)Definition Classes[sharding](../../index.html)
- [**](../../../../../akka/cluster/sharding/typed/javadsl/index.html "Permalink")  package [javadsl](index.html)Definition Classes[typed](../index.html)
- [ClusterSharding](ClusterSharding.html "This extension provides sharding functionality of actors in a cluster.")
- [Entity](Entity.html "Defines how the entity should be created.")
- [EntityContext](EntityContext.html "Parameter to createBehavior function in Entity.of.")
- [EntityFactory](EntityFactory.html)
- [EntityRef](EntityRef.html "A reference to an sharded Entity, which allows ActorRef-like usage.")
- [EntityTypeKey](EntityTypeKey.html "The key of an entity type, the name must be unique.")
- [ShardedDaemonProcess](ShardedDaemonProcess.html "This extension runs a pre set number of actors in a cluster.")
- [StartEntity](StartEntity$.html)
[o](ClusterSharding.html "See companion class")[akka](../../../../index.html).[cluster](../../../index.html).[sharding](../../index.html).[typed](../index.html).[javadsl](index.html)

# [ClusterSharding](ClusterSharding.html "See companion class")[**](../../../../../akka/cluster/sharding/typed/javadsl/ClusterSharding$.html "Permalink")

### Companion [class ClusterSharding](ClusterSharding.html "See companion class")

#### object ClusterSharding

Source[ClusterSharding.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-sharding-typed/src/main/scala/akka/cluster/sharding/typed/javadsl/ClusterSharding.scala#L32)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Content Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ClusterSharding
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Type Members

1. [**](../../../../../akka/cluster/sharding/typed/javadsl/ClusterSharding$$Passivate.html "Permalink") final  case class [Passivate](ClusterSharding$$Passivate.html "The entity can request passivation by sending the Passivate message to the ActorRef[ShardCommand] that was passed in to the factory method when creating the entity.")\[M](entity: [ActorRef](../../../../actor/typed/ActorRef.html)\[M]) extends [ShardCommand](ClusterSharding$$ShardCommand.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableThe entity can request passivation by sending the [Passivate](ClusterSharding$$Passivate.html) message
to the `ActorRef[ShardCommand]` that was passed in to the factory method
when creating the entity.

The entity can request passivation by sending the [Passivate](ClusterSharding$$Passivate.html) message
to the `ActorRef[ShardCommand]` that was passed in to the factory method
when creating the entity. Sharding will then send back the specified
`stopMessage` message to the entity, which is then supposed to stop
itself.
2. [**](../../../../../akka/cluster/sharding/typed/javadsl/ClusterSharding$$ShardCommand.html "Permalink")  trait [ShardCommand](ClusterSharding$$ShardCommand.html "When an entity is created an ActorRef[ShardCommand] is passed to the factory method.") extends [scaladsl.ClusterSharding.ShardCommand](../scaladsl/ClusterSharding$$ShardCommand.html)When an entity is created an `ActorRef[ShardCommand]` is passed to the
factory method.

When an entity is created an `ActorRef[ShardCommand]` is passed to the
factory method. The entity can request passivation by sending the [Passivate](ClusterSharding$$Passivate.html)
message to this ref. Sharding will then send back the specified
`stopMessage` message to the entity, which is then supposed to stop itself.

Not for user extension.

Annotations@[DoNotInherit](../../../../annotation/DoNotInherit.html)()
### Value Members

1. [**](../../../../../akka/cluster/sharding/typed/javadsl/ClusterSharding$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../../akka/cluster/sharding/typed/javadsl/ClusterSharding$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../../akka/cluster/sharding/typed/javadsl/ClusterSharding$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../../../akka/cluster/sharding/typed/javadsl/ClusterSharding$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../../../../akka/cluster/sharding/typed/javadsl/ClusterSharding$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
6. [**](../../../../../akka/cluster/sharding/typed/javadsl/ClusterSharding$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
7. [**](../../../../../akka/cluster/sharding/typed/javadsl/ClusterSharding$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
8. [**](../../../../../akka/cluster/sharding/typed/javadsl/ClusterSharding$.html#get(system:akka.actor.typed.ActorSystem[_]):akka.cluster.sharding.typed.javadsl.ClusterSharding "Permalink")  def get(system: [ActorSystem](../../../../actor/typed/ActorSystem.html)\[\_]): [ClusterSharding](ClusterSharding.html)
9. [**](../../../../../akka/cluster/sharding/typed/javadsl/ClusterSharding$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
10. [**](../../../../../akka/cluster/sharding/typed/javadsl/ClusterSharding$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
11. [**](../../../../../akka/cluster/sharding/typed/javadsl/ClusterSharding$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
12. [**](../../../../../akka/cluster/sharding/typed/javadsl/ClusterSharding$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../../../akka/cluster/sharding/typed/javadsl/ClusterSharding$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
14. [**](../../../../../akka/cluster/sharding/typed/javadsl/ClusterSharding$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../../../akka/cluster/sharding/typed/javadsl/ClusterSharding$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
16. [**](../../../../../akka/cluster/sharding/typed/javadsl/ClusterSharding$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
17. [**](../../../../../akka/cluster/sharding/typed/javadsl/ClusterSharding$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
18. [**](../../../../../akka/cluster/sharding/typed/javadsl/ClusterSharding$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
19. [**](../../../../../akka/cluster/sharding/typed/javadsl/ClusterSharding$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../../akka/cluster/sharding/typed/javadsl/ClusterSharding$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/ActorRef.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/ActorSystem.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/annotation/DoNotInherit.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/typed/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/typed/javadsl/ClusterSharding$$Passivate.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/typed/javadsl/ClusterSharding$$ShardCommand.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/typed/javadsl/ClusterSharding$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/typed/javadsl/ClusterSharding.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/typed/javadsl/Entity$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/typed/javadsl/Entity.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/typed/javadsl/EntityContext.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/typed/javadsl/EntityFactory.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/typed/javadsl/EntityRef.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/typed/javadsl/EntityTypeKey$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/typed/javadsl/EntityTypeKey.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/typed/javadsl/ShardedDaemonProcess$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/typed/javadsl/ShardedDaemonProcess.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/typed/javadsl/StartEntity$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/typed/javadsl/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/typed/scaladsl/ClusterSharding$$ShardCommand.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/index.html
- https://doc.akka.io/api/akka-core/2.10.17/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/typed/javadsl/ClusterSharding$.html](https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/typed/javadsl/ClusterSharding$.html)*