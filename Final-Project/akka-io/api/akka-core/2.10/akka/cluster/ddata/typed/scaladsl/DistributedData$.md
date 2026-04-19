---
description: Akka 2.10.17 - akka.cluster.ddata.typed.scaladsl.DistributedData
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:27:38Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/cluster/ddata/typed/scaladsl/DistributedData$.html
title: Akka 2.10.17 - akka.cluster.ddata.typed.scaladsl.DistributedData
---

# Akka 2.10.17 - akka.cluster.ddata.typed.scaladsl.DistributedData

> **Summary:** Akka 2.10.17 - akka.cluster.ddata.typed.scaladsl.DistributedData

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../../../index.html "Permalink")  package [root](../../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/index.html "Permalink")  package [akka](../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/cluster/index.html "Permalink")  package [cluster](../../../index.html)Definition Classes[akka](../../../../index.html)
- [**](../../../../../akka/cluster/ddata/index.html "Permalink")  package [ddata](../../index.html)Definition Classes[cluster](../../../index.html)
- [**](../../../../../akka/cluster/ddata/typed/index.html "Permalink")  package [typed](../index.html)Definition Classes[ddata](../../index.html)
- [**](../../../../../akka/cluster/ddata/typed/scaladsl/index.html "Permalink")  package [scaladsl](index.html)Definition Classes[typed](../index.html)
- [DistributedData](DistributedData.html "Akka extension for convenient configuration and use of the Replicator.")
- [Replicator](Replicator$.html)
- [ReplicatorMessageAdapter](ReplicatorMessageAdapter.html "When interacting with the Replicator from an actor this class provides convenient methods that adapts the response messages to the requesting actor's message protocol.")
- [ReplicatorSettings](ReplicatorSettings$.html)
[o](DistributedData.html "See companion class")[akka](../../../../index.html).[cluster](../../../index.html).[ddata](../../index.html).[typed](../index.html).[scaladsl](index.html)

# [DistributedData](DistributedData.html "See companion class")[**](../../../../../akka/cluster/ddata/typed/scaladsl/DistributedData$.html "Permalink")

### Companion [class DistributedData](DistributedData.html "See companion class")

#### object DistributedData extends [ExtensionId](../../../../actor/typed/ExtensionId.html)\[[DistributedData](DistributedData.html)]

Source[DistributedData.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-typed/src/main/scala/akka/cluster/ddata/typed/scaladsl/DistributedData.scala#L22)Linear Supertypes[ExtensionId](../../../../actor/typed/ExtensionId.html)\[[DistributedData](DistributedData.html)], [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. DistributedData
2. ExtensionId
3. AnyRef
4. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../../../../akka/cluster/ddata/typed/scaladsl/DistributedData$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../../akka/cluster/ddata/typed/scaladsl/DistributedData$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../../akka/cluster/ddata/typed/scaladsl/DistributedData$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../../../akka/cluster/ddata/typed/scaladsl/DistributedData$.html#apply(system:akka.actor.typed.ActorSystem[_]):T "Permalink") final  def apply(system: [ActorSystem](../../../../actor/typed/ActorSystem.html)\[\_]): [DistributedData](DistributedData.html)Lookup or create an instance of the extension identified by this id.

Lookup or create an instance of the extension identified by this id.

Definition Classes[ExtensionId](../../../../actor/typed/ExtensionId.html)
5. [**](../../../../../akka/cluster/ddata/typed/scaladsl/DistributedData$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
6. [**](../../../../../akka/cluster/ddata/typed/scaladsl/DistributedData$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
7. [**](../../../../../akka/cluster/ddata/typed/scaladsl/DistributedData$.html#createExtension(system:akka.actor.typed.ActorSystem[_]):akka.cluster.ddata.typed.scaladsl.DistributedData "Permalink")  def createExtension(system: [ActorSystem](../../../../actor/typed/ActorSystem.html)\[\_]): [DistributedData](DistributedData.html)Create the extension, will be invoked at most one time per actor system where the extension is registered.

Create the extension, will be invoked at most one time per actor system where the extension is registered.

Definition ClassesDistributedData → [ExtensionId](../../../../actor/typed/ExtensionId.html)
8. [**](../../../../../akka/cluster/ddata/typed/scaladsl/DistributedData$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
9. [**](../../../../../akka/cluster/ddata/typed/scaladsl/DistributedData$.html#equals(other:Any):Boolean "Permalink") final  def equals(other: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition Classes[ExtensionId](../../../../actor/typed/ExtensionId.html) → AnyRef → Any
10. [**](../../../../../akka/cluster/ddata/typed/scaladsl/DistributedData$.html#get(system:akka.actor.typed.ActorSystem[_]):akka.cluster.ddata.typed.scaladsl.DistributedData "Permalink")  def get(system: [ActorSystem](../../../../actor/typed/ActorSystem.html)\[\_]): [DistributedData](DistributedData.html)
11. [**](../../../../../akka/cluster/ddata/typed/scaladsl/DistributedData$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
12. [**](../../../../../akka/cluster/ddata/typed/scaladsl/DistributedData$.html#hashCode():Int "Permalink") final  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition Classes[ExtensionId](../../../../actor/typed/ExtensionId.html) → AnyRef → Any
13. [**](../../../../../akka/cluster/ddata/typed/scaladsl/DistributedData$.html#id:akka.actor.typed.ExtensionId[T] "Permalink")  def id: [ExtensionId](../../../../actor/typed/ExtensionId.html)\[[DistributedData](DistributedData.html)]Java API: The identifier of the extension

Java API: The identifier of the extension

Definition Classes[ExtensionId](../../../../actor/typed/ExtensionId.html)
14. [**](../../../../../akka/cluster/ddata/typed/scaladsl/DistributedData$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
15. [**](../../../../../akka/cluster/ddata/typed/scaladsl/DistributedData$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
16. [**](../../../../../akka/cluster/ddata/typed/scaladsl/DistributedData$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../../../../akka/cluster/ddata/typed/scaladsl/DistributedData$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
18. [**](../../../../../akka/cluster/ddata/typed/scaladsl/DistributedData$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
19. [**](../../../../../akka/cluster/ddata/typed/scaladsl/DistributedData$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
20. [**](../../../../../akka/cluster/ddata/typed/scaladsl/DistributedData$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
21. [**](../../../../../akka/cluster/ddata/typed/scaladsl/DistributedData$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
22. [**](../../../../../akka/cluster/ddata/typed/scaladsl/DistributedData$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
23. [**](../../../../../akka/cluster/ddata/typed/scaladsl/DistributedData$.html#withReplicatorMessageAdapter[A,B<:akka.cluster.ddata.ReplicatedData](factory:akka.cluster.ddata.typed.scaladsl.ReplicatorMessageAdapter[A,B]=>akka.actor.typed.Behavior[A]):akka.actor.typed.Behavior[A] "Permalink")  def withReplicatorMessageAdapter\[A, B \<: [ReplicatedData](../../ReplicatedData.html)](factory: ([ReplicatorMessageAdapter](ReplicatorMessageAdapter.html)\[A, B]) \=\> [Behavior](../../../../actor/typed/Behavior.html)\[A]): [Behavior](../../../../actor/typed/Behavior.html)\[A]When interacting with the [DistributedData.replicator](DistributedData.html#replicator:akka.actor.typed.ActorRef[akka.cluster.ddata.typed.scaladsl.Replicator.Command]) from an actor the [ReplicatorMessageAdapter](ReplicatorMessageAdapter.html)
provides convenient methods that adapts the response messages to the requesting actor's message protocol.

When interacting with the [DistributedData.replicator](DistributedData.html#replicator:akka.actor.typed.ActorRef[akka.cluster.ddata.typed.scaladsl.Replicator.Command]) from an actor the [ReplicatorMessageAdapter](ReplicatorMessageAdapter.html)
provides convenient methods that adapts the response messages to the requesting actor's message protocol.

One `ReplicatorMessageAdapter` instance can be used for a given `ReplicatedData` type,
e.g. an `OrSet[String]`. Interaction with several [akka.cluster.ddata.Key](../../Key.html)s can be used via the same adapter
but they must all be of the same `ReplicatedData` type. For interaction with several different
`ReplicatedData` types, e.g. an `OrSet[String]` and a `GCounter`, an adapter can be created
for each type.

\*Warning\*: A `ReplicatorMessageAdapter` instance is not thread\-safe and must only be used from a single actor
It must not be accessed from threads other than the ordinary actor message processing thread, such as
[scala.concurrent.Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html) callbacks. It must not be shared between several actor instances.

AMessage type of the requesting actor.

BType of the [ReplicatedData](../../ReplicatedData.html).

factoryFactory of the `Behavior` for the actor that is using the `ReplicatorMessageAdapter`
### Deprecated Value Members

1. [**](../../../../../akka/cluster/ddata/typed/scaladsl/DistributedData$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [ExtensionId](../../../../actor/typed/ExtensionId.html)\[[DistributedData](DistributedData.html)]

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/ActorSystem.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/Behavior.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/ExtensionId.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/Key.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/ReplicatedData.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/typed/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/typed/scaladsl/DistributedData$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/typed/scaladsl/DistributedData.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/typed/scaladsl/Replicator$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/typed/scaladsl/ReplicatorMessageAdapter$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/typed/scaladsl/ReplicatorMessageAdapter.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/typed/scaladsl/ReplicatorSettings$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/typed/scaladsl/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/typed/scaladsl/DistributedData$.html](https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/typed/scaladsl/DistributedData$.html)*